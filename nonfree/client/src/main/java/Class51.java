import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class51 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "[Lclient!ac;")
	private final Class4[] aClass4Array1 = new Class4[10];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	private int anInt2639;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	private int anInt2640;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class51(@OriginalArg(0) Class3_Sub8 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method1545();
			if (local12 != 0) {
				arg0.anInt1948--;
				this.aClass4Array1[local7] = new Class4();
				this.aClass4Array1[local7].method69(arg0);
			}
		}
		this.anInt2639 = arg0.method1510();
		this.anInt2640 = arg0.method1510();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "()[B")
	private byte[] method2097() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass4Array1[local3] != null && this.aClass4Array1[local3].anInt88 + this.aClass4Array1[local3].anInt90 > local1) {
				local1 = this.aClass4Array1[local3].anInt88 + this.aClass4Array1[local3].anInt90;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass4Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass4Array1[local54].anInt88 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass4Array1[local54].anInt90 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass4Array1[local54].method70(local70, this.aClass4Array1[local54].anInt88);
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

	@OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
	public int method2098() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass4Array1[local3] != null && this.aClass4Array1[local3].anInt90 / 20 < local1) {
				local1 = this.aClass4Array1[local3].anInt90 / 20;
			}
		}
		if (this.anInt2639 < this.anInt2640 && this.anInt2639 / 20 < local1) {
			local1 = this.anInt2639 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass4Array1[local55] != null) {
				this.aClass4Array1[local55].anInt90 -= local1 * 20;
			}
		}
		if (this.anInt2639 < this.anInt2640) {
			this.anInt2639 -= local1 * 20;
			this.anInt2640 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "()Lclient!le;")
	public Class3_Sub13_Sub1 method2100() {
		@Pc(2) byte[] local2 = this.method2097();
		return new Class3_Sub13_Sub1(22050, local2, this.anInt2639 * 22050 / 1000, this.anInt2640 * 22050 / 1000);
	}
}
