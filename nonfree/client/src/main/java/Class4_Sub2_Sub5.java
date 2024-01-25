import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class4_Sub2_Sub5 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cd", name = "hb", descriptor = "[Lclient!lfa;")
	private static final Class195[] aClass195Array1 = new Class195[32];

	static {
		@Pc(101) Class195[] local101 = Static473.method6905();
		for (@Pc(103) int local103 = 0; local103 < local101.length; local103++) {
			aClass195Array1[local101[local103].anInt5991] = local101[local103];
		}
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static417.anInt5248; local36++) {
				this.method1352(local36, arg0);
				@Pc(49) int[][] local49 = this.method8202(Static7.anInt727, 0);
				local26[local36] = local49[0][Static525.anInt9645];
				local30[local36] = local49[1][Static525.anInt9645];
				local34[local36] = local49[2][Static525.anInt9645];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean713 = arg0.method7004() == 1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			for (@Pc(17) int local17 = 0; local17 < Static417.anInt5248; local17++) {
				this.method1352(local17, arg0);
				@Pc(32) int[] local32 = this.method8208(0, Static7.anInt727);
				local11[local17] = local32[Static525.anInt9645];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(III)V")
	private void method1352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static579.anIntArray585[arg0];
		@Pc(13) int local13 = Static217.anIntArray501[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static525.anInt9645 = arg0;
			Static7.anInt727 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static525.anInt9645 = arg1;
			Static7.anInt727 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static7.anInt727 = arg0;
			Static525.anInt9645 = Static417.anInt5248 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static525.anInt9645 = arg0;
			Static7.anInt727 = Static38.anInt1239 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static525.anInt9645 = Static417.anInt5248 - arg0;
			Static7.anInt727 = Static38.anInt1239 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static7.anInt727 = Static38.anInt1239 - arg0;
			Static525.anInt9645 = Static417.anInt5248 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static525.anInt9645 = arg1;
			Static7.anInt727 = Static38.anInt1239 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static7.anInt727 = arg1;
			Static525.anInt9645 = Static417.anInt5248 - arg0;
		}
		Static7.anInt727 &= Static565.anInt5164;
		Static525.anInt9645 &= Static359.anInt6929;
	}
}
