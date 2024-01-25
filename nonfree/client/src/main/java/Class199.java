import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class199 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "[Lclient!fca;")
	private final Class99[] aClass99Array1 = new Class99[10];

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	private int anInt5930;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	private int anInt5929;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class199(@OriginalArg(0) Class3_Sub26 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method6814();
			if (local12 != 0) {
				arg0.anInt8703--;
				this.aClass99Array1[local7] = new Class99();
				this.aClass99Array1[local7].method2738(arg0);
			}
		}
		this.anInt5930 = arg0.method6811();
		this.anInt5929 = arg0.method6811();
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	private Class199() {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "()I")
	public int method4796() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass99Array1[local3] != null && this.aClass99Array1[local3].anInt3357 / 20 < local1) {
				local1 = this.aClass99Array1[local3].anInt3357 / 20;
			}
		}
		if (this.anInt5930 < this.anInt5929 && this.anInt5930 / 20 < local1) {
			local1 = this.anInt5930 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass99Array1[local55] != null) {
				this.aClass99Array1[local55].anInt3357 -= local1 * 20;
			}
		}
		if (this.anInt5930 < this.anInt5929) {
			this.anInt5930 -= local1 * 20;
			this.anInt5929 -= local1 * 20;
		}
		return local1;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "()Lclient!qr;")
	public Class3_Sub17_Sub1 method4797() {
		@Pc(2) byte[] local2 = this.method4798();
		return new Class3_Sub17_Sub1(22050, local2, this.anInt5930 * 22050 / 1000, this.anInt5929 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "()[B")
	private byte[] method4798() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass99Array1[local3] != null && this.aClass99Array1[local3].anInt3354 + this.aClass99Array1[local3].anInt3357 > local1) {
				local1 = this.aClass99Array1[local3].anInt3354 + this.aClass99Array1[local3].anInt3357;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass99Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass99Array1[local54].anInt3354 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass99Array1[local54].anInt3357 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass99Array1[local54].method2739(local70, this.aClass99Array1[local54].anInt3354);
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
