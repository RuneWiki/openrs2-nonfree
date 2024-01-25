import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
	private int anInt3129 = 16;

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
	private int anInt3130 = 2000;

	@OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
	private int anInt3138 = 4096;

	@OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
	private int anInt3139 = 0;

	@OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
	private int anInt3134 = 0;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		Static280.method4876();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(28) int local28 = this.anInt3138 >> 1;
			@Pc(33) int[][] local33 = super.aClass122_41.method3384();
			@Pc(40) Random local40 = new Random((long) this.anInt3139);
			for (@Pc(42) int local42 = 0; local42 < this.anInt3130; local42++) {
				@Pc(65) int local65 = this.anInt3138 <= 0 ? this.anInt3134 : this.anInt3134 + Static295.method4970(local40, this.anInt3138) - local28;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(76) int local76 = Static295.method4970(local40, Static153.anInt3378);
				@Pc(81) int local81 = Static295.method4970(local40, Static319.anInt6144);
				@Pc(92) int local92 = local76 + (this.anInt3129 * Static31.anIntArray94[local71] >> 12);
				@Pc(103) int local103 = (Static237.anIntArray440[local71] * this.anInt3129 >> 12) + local81;
				@Pc(108) int local108 = local103 - local81;
				@Pc(113) int local113 = local92 - local76;
				if (local113 != 0 || local108 != 0) {
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(140) boolean local140 = local113 < local108;
					@Pc(144) int local144;
					@Pc(148) int local148;
					if (local140) {
						local144 = local76;
						local76 = local81;
						local148 = local92;
						local92 = local103;
						local81 = local144;
						local103 = local148;
					}
					if (local92 < local76) {
						local144 = local76;
						local148 = local81;
						local76 = local92;
						local81 = local103;
						local92 = local144;
						local103 = local148;
					}
					local144 = local81;
					local148 = local92 - local76;
					@Pc(179) int local179 = local103 - local81;
					@Pc(184) int local184 = -local148 / 2;
					@Pc(188) int local188 = 2048 / local148;
					@Pc(198) int local198 = 1024 - (Static295.method4970(local40, 4096) >> 2);
					if (local179 < 0) {
						local179 = -local179;
					}
					@Pc(210) int local210 = local103 <= local81 ? -1 : 1;
					for (@Pc(212) int local212 = local76; local212 < local92; local212++) {
						@Pc(225) int local225 = local198 + (-local76 + local212) * local188 + 1024;
						@Pc(229) int local229 = local212 & Static250.anInt5127;
						@Pc(233) int local233 = local144 & Static49.anInt1526;
						if (local140) {
							local33[local233][local229] = local225;
						} else {
							local33[local229][local233] = local225;
						}
						local184 += local179;
						if (local184 > 0) {
							local144 += local210;
							local184 -= local148;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3139 = arg1.method4532();
		} else if (arg0 == 1) {
			this.anInt3130 = arg1.method4556();
		} else if (arg0 == 2) {
			this.anInt3129 = arg1.method4532();
		} else if (arg0 == 3) {
			this.anInt3134 = arg1.method4556();
		} else if (arg0 == 4) {
			this.anInt3138 = arg1.method4556();
		}
	}
}
