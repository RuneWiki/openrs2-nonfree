import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class130 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "[Lclient!tf;")
	private final Class222[] aClass222Array1 = new Class222[10];

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
	private int anInt3277;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
	private int anInt3276;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!kk;)V")
	public Class130(@OriginalArg(0) Class2_Sub16 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method5350();
			if (local12 != 0) {
				arg0.anInt6145--;
				this.aClass222Array1[local7] = new Class222();
				this.aClass222Array1[local7].method4845(arg0);
			}
		}
		this.anInt3277 = arg0.method5312();
		this.anInt3276 = arg0.method5312();
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
	private Class130() {
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "()I")
	public int method3008() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass222Array1[local3] != null && this.aClass222Array1[local3].anInt5625 / 20 < local1) {
				local1 = this.aClass222Array1[local3].anInt5625 / 20;
			}
		}
		if (this.anInt3277 < this.anInt3276 && this.anInt3277 / 20 < local1) {
			local1 = this.anInt3277 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass222Array1[local55] != null) {
				this.aClass222Array1[local55].anInt5625 -= local1 * 20;
			}
		}
		if (this.anInt3277 < this.anInt3276) {
			this.anInt3277 -= local1 * 20;
			this.anInt3276 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "()Lclient!qq;")
	public Class2_Sub15_Sub1 method3009() {
		@Pc(2) byte[] local2 = this.method3011();
		return new Class2_Sub15_Sub1(22050, local2, this.anInt3277 * 22050 / 1000, this.anInt3276 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "()[B")
	private byte[] method3011() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass222Array1[local3] != null && this.aClass222Array1[local3].anInt5624 + this.aClass222Array1[local3].anInt5625 > local1) {
				local1 = this.aClass222Array1[local3].anInt5624 + this.aClass222Array1[local3].anInt5625;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass222Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass222Array1[local54].anInt5624 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass222Array1[local54].anInt5625 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass222Array1[local54].method4847(local70, this.aClass222Array1[local54].anInt5624);
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
