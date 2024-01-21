import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class16 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lclient!pb;")
	private final Class64[] aClass64Array1 = new Class64[10];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	private int anInt455;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!dc;)V")
	public Class16(@OriginalArg(0) Class1_Sub5 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method672();
			if (local12 != 0) {
				arg0.anInt792--;
				this.aClass64Array1[local7] = new Class64();
				this.aClass64Array1[local7].method1542(arg0);
			}
		}
		this.anInt454 = arg0.method651();
		this.anInt455 = arg0.method651();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()Lclient!pa;")
	public Class1_Sub14_Sub1 method386() {
		@Pc(2) byte[] local2 = this.method388();
		return new Class1_Sub14_Sub1(22050, local2, this.anInt454 * 22050 / 1000, this.anInt455 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "()I")
	public int method387() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass64Array1[local3] != null && this.aClass64Array1[local3].anInt2055 / 20 < local1) {
				local1 = this.aClass64Array1[local3].anInt2055 / 20;
			}
		}
		if (this.anInt454 < this.anInt455 && this.anInt454 / 20 < local1) {
			local1 = this.anInt454 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass64Array1[local55] != null) {
				this.aClass64Array1[local55].anInt2055 -= local1 * 20;
			}
		}
		if (this.anInt454 < this.anInt455) {
			this.anInt454 -= local1 * 20;
			this.anInt455 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "()[B")
	private byte[] method388() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass64Array1[local3] != null && this.aClass64Array1[local3].anInt2054 + this.aClass64Array1[local3].anInt2055 > local1) {
				local1 = this.aClass64Array1[local3].anInt2054 + this.aClass64Array1[local3].anInt2055;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass64Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass64Array1[local54].anInt2054 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass64Array1[local54].anInt2055 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass64Array1[local54].method1539(local70, this.aClass64Array1[local54].anInt2054);
				for (@Pc(94) int local94 = 0; local94 < local70; local94++) {
					@Pc(107) int local107 = local52[local94 + local80] + (local92[local94] >> 8);
					if ((local107 + 128 & 0xFFFFFF00) != 0) {
						local107 = local107 >> 31 ^ 0x7F;
					}
					local52[local94 + local80] = (byte) local107;
				}
			}
		}
		return local52;
	}
}
