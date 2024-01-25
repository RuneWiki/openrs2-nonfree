import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class112 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "[Lclient!la;")
	private final Class115[] aClass115Array1 = new Class115[10];

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	private int anInt3517;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	private int anInt3518;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!tq;)V")
	public Class112(@OriginalArg(0) Class4_Sub7 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method2380();
			if (local12 != 0) {
				arg0.anInt2667--;
				this.aClass115Array1[local7] = new Class115();
				this.aClass115Array1[local7].method3169(arg0);
			}
		}
		this.anInt3517 = arg0.method2404();
		this.anInt3518 = arg0.method2404();
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	private Class112() {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()Lclient!wo;")
	public Class4_Sub5_Sub1 method3031() {
		@Pc(2) byte[] local2 = this.method3034();
		return new Class4_Sub5_Sub1(22050, local2, this.anInt3517 * 22050 / 1000, this.anInt3518 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "()I")
	public int method3032() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass115Array1[local3] != null && this.aClass115Array1[local3].anInt3736 / 20 < local1) {
				local1 = this.aClass115Array1[local3].anInt3736 / 20;
			}
		}
		if (this.anInt3517 < this.anInt3518 && this.anInt3517 / 20 < local1) {
			local1 = this.anInt3517 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass115Array1[local55] != null) {
				this.aClass115Array1[local55].anInt3736 -= local1 * 20;
			}
		}
		if (this.anInt3517 < this.anInt3518) {
			this.anInt3517 -= local1 * 20;
			this.anInt3518 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "()[B")
	private byte[] method3034() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass115Array1[local3] != null && this.aClass115Array1[local3].anInt3734 + this.aClass115Array1[local3].anInt3736 > local1) {
				local1 = this.aClass115Array1[local3].anInt3734 + this.aClass115Array1[local3].anInt3736;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass115Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass115Array1[local54].anInt3734 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass115Array1[local54].anInt3736 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass115Array1[local54].method3172(local70, this.aClass115Array1[local54].anInt3734);
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
