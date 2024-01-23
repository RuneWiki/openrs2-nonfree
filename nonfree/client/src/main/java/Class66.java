import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class66 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[Lclient!th;")
	private Class95[] aClass95Array1 = new Class95[10];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
	private int anInt3132;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	private int anInt3133;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class66(@OriginalArg(0) Class2_Sub23 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2122();
			if (local12 != 0) {
				arg0.anInt2703--;
				this.aClass95Array1[local7] = new Class95();
				this.aClass95Array1[local7].method3549(arg0);
			}
		}
		this.anInt3132 = arg0.method2095();
		this.anInt3133 = arg0.method2095();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()[B")
	private byte[] method2449() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass95Array1[local3] != null && this.aClass95Array1[local3].anInt4472 + this.aClass95Array1[local3].anInt4473 > local1) {
				local1 = this.aClass95Array1[local3].anInt4472 + this.aClass95Array1[local3].anInt4473;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass95Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass95Array1[local54].anInt4472 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass95Array1[local54].anInt4473 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass95Array1[local54].method3550(local70, this.aClass95Array1[local54].anInt4472);
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

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()Lclient!kh;")
	public Class2_Sub22_Sub1 method2450() {
		@Pc(2) byte[] local2 = this.method2449();
		return new Class2_Sub22_Sub1(22050, local2, this.anInt3132 * 22050 / 1000, this.anInt3133 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()I")
	public int method2451() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass95Array1[local3] != null && this.aClass95Array1[local3].anInt4473 / 20 < local1) {
				local1 = this.aClass95Array1[local3].anInt4473 / 20;
			}
		}
		if (this.anInt3132 < this.anInt3133 && this.anInt3132 / 20 < local1) {
			local1 = this.anInt3132 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass95Array1[local55] != null) {
				this.aClass95Array1[local55].anInt4473 -= local1 * 20;
			}
		}
		if (this.anInt3132 < this.anInt3133) {
			this.anInt3132 -= local1 * 20;
			this.anInt3133 -= local1 * 20;
		}
		return local1;
	}
}
