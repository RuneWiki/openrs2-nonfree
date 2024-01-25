import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class4_Sub6_Sub15 extends Class4_Sub6 {

	@OriginalMember(owner = "client!js", name = "V", descriptor = "I")
	private int anInt3403 = 2000;

	@OriginalMember(owner = "client!js", name = "T", descriptor = "I")
	private int anInt3401 = 4096;

	@OriginalMember(owner = "client!js", name = "Y", descriptor = "I")
	private int anInt3405 = 16;

	@OriginalMember(owner = "client!js", name = "U", descriptor = "I")
	private int anInt3402 = 0;

	@OriginalMember(owner = "client!js", name = "W", descriptor = "I")
	private int anInt3404 = 0;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		Static147.method2993();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(20) int local20 = this.anInt3401 >> 1;
			@Pc(25) int[][] local25 = super.aClass133_41.method3736();
			@Pc(32) Random local32 = new Random((long) this.anInt3402);
			for (@Pc(34) int local34 = 0; local34 < this.anInt3403; local34++) {
				@Pc(54) int local54 = this.anInt3401 > 0 ? this.anInt3404 + Static355.method5668(local32, this.anInt3401) - local20 : this.anInt3404;
				@Pc(60) int local60 = local54 >> 4 & 0xFF;
				@Pc(65) int local65 = Static355.method5668(local32, Static31.anInt797);
				@Pc(70) int local70 = Static355.method5668(local32, Static223.anInt4562);
				@Pc(81) int local81 = (this.anInt3405 * Static232.anIntArray392[local60] >> 12) + local65;
				@Pc(92) int local92 = (Static7.anIntArray5[local60] * this.anInt3405 >> 12) + local70;
				@Pc(97) int local97 = local92 - local70;
				@Pc(102) int local102 = local81 - local65;
				if (local102 != 0 || local97 != 0) {
					if (local97 < 0) {
						local97 = -local97;
					}
					if (local102 < 0) {
						local102 = -local102;
					}
					@Pc(130) boolean local130 = local102 < local97;
					@Pc(134) int local134;
					@Pc(138) int local138;
					if (local130) {
						local134 = local65;
						local65 = local70;
						local138 = local81;
						local81 = local92;
						local70 = local134;
						local92 = local138;
					}
					if (local65 > local81) {
						local134 = local65;
						local65 = local81;
						local138 = local70;
						local81 = local134;
						local70 = local92;
						local92 = local138;
					}
					local134 = local70;
					local138 = local81 - local65;
					@Pc(170) int local170 = local92 - local70;
					@Pc(175) int local175 = -local138 / 2;
					@Pc(179) int local179 = 2048 / local138;
					@Pc(189) int local189 = 1024 - (Static355.method5668(local32, 4096) >> 2);
					@Pc(200) int local200 = local70 < local92 ? 1 : -1;
					if (local170 < 0) {
						local170 = -local170;
					}
					for (@Pc(207) int local207 = local65; local207 < local81; local207++) {
						@Pc(220) int local220 = (local207 - local65) * local179 + local189 + 1024;
						@Pc(224) int local224 = local207 & Static335.anInt6403;
						@Pc(228) int local228 = Static341.anInt266 & local134;
						local175 += local170;
						if (local130) {
							local25[local228][local224] = local220;
						} else {
							local25[local224][local228] = local220;
						}
						if (local175 > 0) {
							local134 += local200;
							local175 += -local138;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3402 = arg1.method3440();
		} else if (arg0 == 1) {
			this.anInt3403 = arg1.method3401();
		} else if (arg0 == 2) {
			this.anInt3405 = arg1.method3440();
		} else if (arg0 == 3) {
			this.anInt3404 = arg1.method3401();
		} else if (arg0 == 4) {
			this.anInt3401 = arg1.method3401();
		}
	}
}
