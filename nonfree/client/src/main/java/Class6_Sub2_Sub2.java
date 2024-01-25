import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(III)V")
	private void method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static53.anIntArray95[arg0];
		@Pc(13) int local13 = Static168.anIntArray278[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static56.anInt1176 = arg0;
			Static132.anInt2342 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static56.anInt1176 = arg1;
			Static132.anInt2342 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static132.anInt2342 = arg0;
			Static56.anInt1176 = Static185.anInt4925 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static132.anInt2342 = Static345.anInt5779 - arg1;
			Static56.anInt1176 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static132.anInt2342 = Static345.anInt5779 - arg1;
			Static56.anInt1176 = Static185.anInt4925 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static132.anInt2342 = Static345.anInt5779 - arg0;
			Static56.anInt1176 = Static185.anInt4925 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static132.anInt2342 = Static345.anInt5779 - arg0;
			Static56.anInt1176 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static132.anInt2342 = arg1;
			Static56.anInt1176 = Static185.anInt4925 - arg0;
		}
		Static132.anInt2342 &= Static296.anInt4928;
		Static56.anInt1176 &= Static64.anInt1348;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			for (@Pc(22) int local22 = 0; local22 < Static185.anInt4925; local22++) {
				this.method271(local22, arg0);
				@Pc(35) int[] local35 = this.method5858(0, Static132.anInt2342);
				local11[local22] = local35[Static56.anInt1176];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static185.anInt4925; local34++) {
				this.method271(local34, arg0);
				@Pc(49) int[][] local49 = this.method5867(Static132.anInt2342, 0);
				local24[local34] = local49[0][Static56.anInt1176];
				local28[local34] = local49[1][Static56.anInt1176];
				local32[local34] = local49[2][Static56.anInt1176];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean488 = arg0.method3111() == 1;
		}
	}
}
