import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class65 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[Lclient!db;")
	private final Class16[] aClass16Array1 = new Class16[10];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "I")
	private int anInt2620;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	private int anInt2621;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!jd;)V")
	public Class65(@OriginalArg(0) Class4_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method719();
			if (local12 != 0) {
				arg0.anInt1099--;
				this.aClass16Array1[local7] = new Class16();
				this.aClass16Array1[local7].method377(arg0);
			}
		}
		this.anInt2620 = arg0.method718();
		this.anInt2621 = arg0.method718();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
	public int method1713() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass16Array1[local3] != null && this.aClass16Array1[local3].anInt544 / 20 < local1) {
				local1 = this.aClass16Array1[local3].anInt544 / 20;
			}
		}
		if (this.anInt2620 < this.anInt2621 && this.anInt2620 / 20 < local1) {
			local1 = this.anInt2620 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass16Array1[local55] != null) {
				this.aClass16Array1[local55].anInt544 -= local1 * 20;
			}
		}
		if (this.anInt2620 < this.anInt2621) {
			this.anInt2620 -= local1 * 20;
			this.anInt2621 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()[B")
	private byte[] method1714() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass16Array1[local3] != null && this.aClass16Array1[local3].anInt547 + this.aClass16Array1[local3].anInt544 > local1) {
				local1 = this.aClass16Array1[local3].anInt547 + this.aClass16Array1[local3].anInt544;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass16Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass16Array1[local54].anInt547 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass16Array1[local54].anInt544 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass16Array1[local54].method378(local70, this.aClass16Array1[local54].anInt547);
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

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()Lclient!ib;")
	public Class4_Sub13_Sub1 method1715() {
		@Pc(2) byte[] local2 = this.method1714();
		return new Class4_Sub13_Sub1(22050, local2, this.anInt2620 * 22050 / 1000, this.anInt2621 * 22050 / 1000);
	}
}
