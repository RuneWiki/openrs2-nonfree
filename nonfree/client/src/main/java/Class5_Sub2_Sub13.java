import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class5_Sub2_Sub13 extends Class5_Sub2 {

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
	private int anInt3323;

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
	private int anInt3328;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
	private int anInt3331;

	@OriginalMember(owner = "client!gi", name = "R", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
	private int anInt3330 = 204;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
	private int anInt3324 = 8;

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
	private int anInt3334 = 81;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
	private int anInt3326 = 409;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
	private int anInt3325 = 0;

	@OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
	private int anInt3336 = 1024;

	@OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
	private int anInt3337 = 4;

	@OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
	private int anInt3338 = 1024;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(22) int local22 = 0;
			@Pc(30) int local30;
			for (local30 = Static61.anIntArray80[arg0] + this.anInt3325; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local22 < this.anInt3324 && local30 >= this.anIntArray279[local22]) {
				local22++;
			}
			@Pc(64) int local64 = local22 - 1;
			@Pc(72) boolean local72 = (local22 & 0x1) == 0;
			@Pc(77) int local77 = this.anIntArray279[local22];
			@Pc(84) int local84 = this.anIntArray279[local22 - 1];
			if (local30 > local84 + this.anInt3328 && local77 - this.anInt3328 > local30) {
				for (@Pc(103) int local103 = 0; local103 < Static314.anInt6320; local103++) {
					@Pc(114) int local114 = local72 ? this.anInt3338 : -this.anInt3338;
					@Pc(116) int local116 = 0;
					@Pc(128) int local128;
					for (local128 = Static68.anIntArray94[local103] + (local114 * this.anInt3323 >> 12); local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (local116 < this.anInt3337 && local128 >= this.anIntArrayArray15[local64][local116]) {
						local116++;
					}
					@Pc(166) int local166 = local116 - 1;
					@Pc(173) int local173 = this.anIntArrayArray15[local64][local116];
					@Pc(180) int local180 = this.anIntArrayArray15[local64][local166];
					if (local180 + this.anInt3328 < local128 && local128 < local173 - this.anInt3328) {
						local16[local103] = this.anIntArrayArray16[local64][local166];
					} else {
						local16[local103] = 0;
					}
				}
			} else {
				Static655.method4110(local16, 0, Static314.anInt6320, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3337 = arg0.method8645();
		} else if (arg1 == 1) {
			this.anInt3324 = arg0.method8645();
		} else if (arg1 == 2) {
			this.anInt3326 = arg0.method8631();
		} else if (arg1 == 3) {
			this.anInt3330 = arg0.method8631();
		} else if (arg1 == 4) {
			this.anInt3338 = arg0.method8631();
		} else if (arg1 == 5) {
			this.anInt3325 = arg0.method8631();
		} else if (arg1 == 6) {
			this.anInt3334 = arg0.method8631();
		} else if (arg1 == 7) {
			this.anInt3336 = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	private void method2954() {
		@Pc(12) Random local12 = new Random((long) this.anInt3324);
		this.anInt3328 = this.anInt3334 / 2;
		this.anInt3331 = 4096 / this.anInt3324;
		this.anInt3323 = 4096 / this.anInt3337;
		@Pc(35) int local35 = this.anInt3323 / 2;
		this.anIntArrayArray16 = new int[this.anInt3324][this.anInt3337];
		this.anIntArray279 = new int[this.anInt3324 + 1];
		this.anIntArrayArray15 = new int[this.anInt3324][this.anInt3337 + 1];
		@Pc(63) int local63 = this.anInt3331 / 2;
		this.anIntArray279[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt3324; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt3331;
				local97 = (Static57.method964(4096, local12) - 2048) * this.anInt3330 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local63 >> 12);
				this.anIntArray279[local78] = this.anIntArray279[local78 - 1] + local105;
			}
			this.anIntArrayArray15[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt3337; local85++) {
				if (local85 > 0) {
					local97 = this.anInt3323;
					@Pc(148) int local148 = (Static57.method964(4096, local12) - 2048) * this.anInt3326 >> 12;
					local97 += local35 * local148 >> 12;
					this.anIntArrayArray15[local78][local85] = local97 + this.anIntArrayArray15[local78][local85 - 1];
				}
				this.anIntArrayArray16[local78][local85] = this.anInt3336 > 0 ? 4096 - Static57.method964(this.anInt3336, local12) : 4096;
			}
			this.anIntArrayArray15[local78][this.anInt3337] = 4096;
		}
		this.anIntArray279[this.anInt3324] = 4096;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		this.method2954();
	}
}
