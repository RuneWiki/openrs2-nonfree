import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class358 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "[Lclient!oga;")
	private final Class244[] aClass244Array1 = new Class244[10];

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
	private int anInt9190;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	private int anInt9189;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!qh;)V")
	public Class358(@OriginalArg(0) Class3_Sub11 arg0) {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			@Pc(12) int local12 = arg0.method3118();
			if (local12 != 0) {
				arg0.anInt3520--;
				this.aClass244Array1[local7] = new Class244();
				this.aClass244Array1[local7].method5590(arg0);
			}
		}
		this.anInt9190 = arg0.method3109();
		this.anInt9189 = arg0.method3109();
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	private Class358() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()Lclient!ee;")
	public Class3_Sub20_Sub1 method7641() {
		@Pc(2) byte[] local2 = this.method7642();
		return new Class3_Sub20_Sub1(22050, local2, this.anInt9190 * 22050 / 1000, this.anInt9189 * 22050 / 1000);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()[B")
	private byte[] method7642() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass244Array1[local3] != null && this.aClass244Array1[local3].anInt6514 + this.aClass244Array1[local3].anInt6513 > local1) {
				local1 = this.aClass244Array1[local3].anInt6514 + this.aClass244Array1[local3].anInt6513;
			}
		}
		if (local1 == 0) {
			return new byte[0];
		}
		@Pc(49) int local49 = local1 * 22050 / 1000;
		@Pc(52) byte[] local52 = new byte[local49];
		for (@Pc(54) int local54 = 0; local54 < 10; local54++) {
			if (this.aClass244Array1[local54] != null) {
				@Pc(70) int local70 = this.aClass244Array1[local54].anInt6514 * 22050 / 1000;
				@Pc(80) int local80 = this.aClass244Array1[local54].anInt6513 * 22050 / 1000;
				@Pc(92) int[] local92 = this.aClass244Array1[local54].method5593(local70, this.aClass244Array1[local54].anInt6514);
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

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()I")
	public int method7643() {
		@Pc(1) int local1 = 9999999;
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			if (this.aClass244Array1[local3] != null && this.aClass244Array1[local3].anInt6513 / 20 < local1) {
				local1 = this.aClass244Array1[local3].anInt6513 / 20;
			}
		}
		if (this.anInt9190 < this.anInt9189 && this.anInt9190 / 20 < local1) {
			local1 = this.anInt9190 / 20;
		}
		if (local1 == 9999999 || local1 == 0) {
			return 0;
		}
		for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
			if (this.aClass244Array1[local55] != null) {
				this.aClass244Array1[local55].anInt6513 -= local1 * 20;
			}
		}
		if (this.anInt9190 < this.anInt9189) {
			this.anInt9190 -= local1 * 20;
			this.anInt9189 -= local1 * 20;
		}
		return local1;
	}
}
