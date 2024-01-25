import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!ufa", name = "p", descriptor = "[I")
	public static final int[] anIntArray553 = new int[4];

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILclient!m;)I")
	public static int method9005(@OriginalArg(1) Class2_Sub1_Sub13 arg0) {
		@Pc(7) String local7 = Static188.method7429(arg0);
		@Pc(9) int[] local9 = null;
		if (Static87.method1543(arg0.anInt6866)) {
			local9 = Static372.aClass343_1.method8549((int) arg0.aLong181).anIntArray517;
		} else if (arg0.anInt6867 != -1) {
			local9 = Static372.aClass343_1.method8549(arg0.anInt6867).anIntArray517;
		} else if (Static377.method6405(arg0.anInt6866)) {
			@Pc(46) Class2_Sub6 local46 = (Class2_Sub6) Static630.aClass335_29.method8357((long) (int) arg0.aLong181);
			if (local46 != null) {
				@Pc(51) Class15_Sub3_Sub3_Sub1_Sub2 local51 = local46.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				@Pc(54) Class312 local54 = local51.aClass312_1;
				if (local54.anIntArray458 != null) {
					local54 = local54.method7953(Static113.aClass282_1);
				}
				if (local54 != null) {
					local9 = local54.anIntArray460;
				}
			}
		} else if (Static190.method3693(arg0.anInt6866)) {
			@Pc(88) Class331 local88;
			if (arg0.anInt6866 == 1006) {
				local88 = Static251.aClass328_1.method8261((int) arg0.aLong181);
			} else {
				local88 = Static251.aClass328_1.method8261((int) (arg0.aLong181 >>> 32 & 0x7FFFFFFFL));
			}
			if (local88.anIntArray486 != null) {
				local88 = local88.method8304(Static113.aClass282_1);
			}
			if (local88 != null) {
				local9 = local88.anIntArray483;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static141.method2458(local9);
		}
		@Pc(141) int local141 = Static648.aClass324_12.method8179(local7, Static251.aClass71Array25);
		if (arg0.aBoolean521) {
			local141 += Static310.aClass71_10.method7691() + 4;
		}
		return local141;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)Z")
	public static boolean method9007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static350.method6055(arg1, arg0) || Static318.method5254(arg0, arg1);
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)[Lclient!uo;")
	public static Class361[] method9008() {
		return new Class361[] { Static527.aClass361_1, Static527.aClass361_2, Static527.aClass361_3, Static527.aClass361_4, Static527.aClass361_5, Static527.aClass361_6, Static527.aClass361_7, Static527.aClass361_8, Static527.aClass361_9, Static527.aClass361_10, Static527.aClass361_11, Static527.aClass361_12 };
	}
}
