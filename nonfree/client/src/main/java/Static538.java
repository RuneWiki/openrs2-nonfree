import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
	public static int anInt8328;

	@OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
	public static int anInt8331 = 0;

	@OriginalMember(owner = "client!sba", name = "x", descriptor = "I")
	public static int anInt8334 = 13156520;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIIIILclient!ps;IIILclient!ft;)V")
	public static void method7208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class291 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class125 arg10) {
		Static679.anInt10637 = arg3;
		Static335.anInt5217 = arg4;
		Static153.anInt2818 = arg6;
		Static191.aClass51_2 = null;
		Static166.anInt4558 = arg8;
		Static525.aClass125_14 = arg10;
		Static660.aClass51_3 = null;
		Static82.anInt8419 = arg5;
		Static557.aClass291_13 = arg7;
		Static30.aClass51_1 = null;
		Static273.anInt4428 = arg2;
		Static378.anInt5619 = arg9;
		Static138.anInt2558 = arg1;
		Static139.anInt10490 = arg0;
		Static266.method3808();
		Static26.aBoolean89 = true;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V")
	public static void method7209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static499.method6774(local7.aClass3_Sub1_Sub5_1);
			if (local7.aClass3_Sub1_Sub5_1 != null) {
				local7.aClass3_Sub1_Sub5_1 = null;
			}
		}
	}
}
