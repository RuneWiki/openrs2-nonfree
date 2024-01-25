import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class127 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[Lclient!qh;")
	private final Class205[] aClass205Array1 = new Class205[10];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	private int anInt3635;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	private int anInt3636;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class127(@OriginalArg(0) Class6_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6433();
			if (local12 != 0) {
				arg0.anInt7898--;
				this.aClass205Array1[local7] = new Class205();
				this.aClass205Array1[local7].method4617(arg0);
			}
		}
		this.anInt3635 = arg0.method6485();
		this.anInt3636 = arg0.method6485();
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	private Class127() {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()Lclient!hh;")
	public Class6_Sub17_Sub1 method3001() {
		@Pc(2) byte[] local2 = this.method3003();
		return new Class6_Sub17_Sub1(22050, local2, this.anInt3635 * 22050 / 1000, this.anInt3636 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()I")
	public int method3002() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass205Array1[local3] != null && this.aClass205Array1[local3].anInt5532 / 20 < local1) {
				local1 = this.aClass205Array1[local3].anInt5532 / 20;
			}
		}
		if (this.anInt3635 < this.anInt3636 && this.anInt3635 / 20 < local1) {
			local1 = this.anInt3635 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass205Array1[local55] != null) {
				this.aClass205Array1[local55].anInt5532 -= local1 * 20;
			}
		}
		if (this.anInt3635 < this.anInt3636) {
			this.anInt3635 -= local1 * 20;
			this.anInt3636 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()[B")
	private byte[] method3003() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass205Array1[local3] != null && this.aClass205Array1[local3].anInt5530 + this.aClass205Array1[local3].anInt5532 > local1) {
				local1 = this.aClass205Array1[local3].anInt5530 + this.aClass205Array1[local3].anInt5532;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass205Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass205Array1[local54].anInt5530 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass205Array1[local54].anInt5532 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass205Array1[local54].method4618(local70, this.aClass205Array1[local54].anInt5530);
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
