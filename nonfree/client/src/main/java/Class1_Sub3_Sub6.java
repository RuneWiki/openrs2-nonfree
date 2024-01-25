import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			for (@Pc(25) int local25 = 0; local25 < Static153.anInt3378; local25++) {
				this.method1051(arg0, local25);
				@Pc(38) int[] local38 = this.method5532(0, Static136.anInt3012);
				local19[local25] = local38[Static169.anInt3638];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(III)V")
	private void method1051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static107.anIntArray234[arg1];
		@Pc(13) int local13 = Static266.anIntArray454[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static169.anInt3638 = arg1;
			Static136.anInt3012 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static136.anInt3012 = arg1;
			Static169.anInt3638 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static169.anInt3638 = Static153.anInt3378 - arg0;
			Static136.anInt3012 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static169.anInt3638 = arg1;
			Static136.anInt3012 = Static319.anInt6144 - arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static169.anInt3638 = Static153.anInt3378 - arg1;
			Static136.anInt3012 = Static319.anInt6144 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static169.anInt3638 = Static153.anInt3378 - arg0;
			Static136.anInt3012 = Static319.anInt6144 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static169.anInt3638 = arg0;
			Static136.anInt3012 = Static319.anInt6144 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static136.anInt3012 = arg0;
			Static169.anInt3638 = Static153.anInt3378 - arg1;
		}
		Static169.anInt3638 &= Static250.anInt5127;
		Static136.anInt3012 &= Static49.anInt1526;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static153.anInt3378; local36++) {
				this.method1051(arg0, local36);
				@Pc(51) int[][] local51 = this.method5528(Static136.anInt3012, 0);
				local26[local36] = local51[0][Static169.anInt3638];
				local30[local36] = local51[1][Static169.anInt3638];
				local34[local36] = local51[2][Static169.anInt3638];
			}
		}
		return local18;
	}
}
