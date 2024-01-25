import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class12 {

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "[Lclient!qh;")
	private final Class168[] aClass168Array1 = new Class168[10];

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class12(@OriginalArg(0) Class6_Sub10 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3972();
			if (local12 != 0) {
				arg0.anInt4188--;
				this.aClass168Array1[local7] = new Class168();
				this.aClass168Array1[local7].method4405(arg0);
			}
		}
		this.anInt225 = arg0.method4021();
		this.anInt224 = arg0.method4021();
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	private Class12() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()Lclient!hk;")
	public Class6_Sub11_Sub1 method222() {
		@Pc(2) byte[] local2 = this.method224();
		return new Class6_Sub11_Sub1(22050, local2, this.anInt225 * 22050 / 1000, this.anInt224 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()I")
	public int method223() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass168Array1[local3] != null && this.aClass168Array1[local3].anInt4756 / 20 < local1) {
				local1 = this.aClass168Array1[local3].anInt4756 / 20;
			}
		}
		if (this.anInt225 < this.anInt224 && this.anInt225 / 20 < local1) {
			local1 = this.anInt225 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass168Array1[local55] != null) {
				this.aClass168Array1[local55].anInt4756 -= local1 * 20;
			}
		}
		if (this.anInt225 < this.anInt224) {
			this.anInt225 -= local1 * 20;
			this.anInt224 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()[B")
	private byte[] method224() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass168Array1[local3] != null && this.aClass168Array1[local3].anInt4755 + this.aClass168Array1[local3].anInt4756 > local1) {
				local1 = this.aClass168Array1[local3].anInt4755 + this.aClass168Array1[local3].anInt4756;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass168Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass168Array1[local54].anInt4755 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass168Array1[local54].anInt4756 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass168Array1[local54].method4407(local70, this.aClass168Array1[local54].anInt4755);
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
