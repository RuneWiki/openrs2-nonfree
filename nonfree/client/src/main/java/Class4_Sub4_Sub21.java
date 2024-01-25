import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class4_Sub4_Sub21 extends Class4_Sub4 {

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean563 = arg1.method2380() == 1;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			for (@Pc(25) int local25 = 0; local25 < Static124.anInt3576; local25++) {
				this.method3498(arg0, local25);
				@Pc(38) int[] local38 = this.method5386(0, Static226.anInt4746);
				local19[local25] = local38[Static328.anInt6444];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static124.anInt3576; local34++) {
				this.method3498(arg0, local34);
				@Pc(47) int[][] local47 = this.method5384(0, Static226.anInt4746);
				local24[local34] = local47[0][Static328.anInt6444];
				local28[local34] = local47[1][Static328.anInt6444];
				local32[local34] = local47[2][Static328.anInt6444];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(III)V")
	private void method3498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static149.anIntArray298[arg1];
		@Pc(13) int local13 = Static64.anIntArray148[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static226.anInt4746 = arg0;
			Static328.anInt6444 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static226.anInt4746 = arg1;
			Static328.anInt6444 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static226.anInt4746 = arg1;
			Static328.anInt6444 = Static124.anInt3576 - arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static226.anInt4746 = Static331.anInt6571 - arg0;
			Static328.anInt6444 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static226.anInt4746 = Static331.anInt6571 - arg0;
			Static328.anInt6444 = Static124.anInt3576 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static328.anInt6444 = Static124.anInt3576 - arg0;
			Static226.anInt4746 = Static331.anInt6571 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static328.anInt6444 = arg0;
			Static226.anInt4746 = Static331.anInt6571 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static226.anInt4746 = arg0;
			Static328.anInt6444 = Static124.anInt3576 - arg1;
		}
		Static328.anInt6444 &= Static350.anInt6802;
		Static226.anInt4746 &= Static59.anInt1278;
	}
}
