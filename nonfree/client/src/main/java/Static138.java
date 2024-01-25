import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!eka", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(B)V")
	public static void method2197() {
		if (Static74.anInt1617 == 1 || Static74.anInt1617 == 3 || Static74.anInt1617 != Static668.anInt11111 && (Static74.anInt1617 == 0 || Static668.anInt11111 == 0)) {
			Static570.anInt9823 = 0;
			Static471.anInt8216 = 0;
			Static579.aClass187_73.method4076();
		}
		Static668.anInt11111 = Static74.anInt1617;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "([Lclient!mea;BIIZI)V")
	public static void method2198(@OriginalArg(0) Class230[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class230 local13 = arg0[local7];
			if (local13 != null && local13.anInt6668 == arg2) {
				Static550.method7766(arg3, local13, arg1, arg4);
				Static74.method1391(arg1, local13, arg4);
				if (local13.anInt6705 > local13.anInt6711 - local13.anInt6703) {
					local13.anInt6705 = local13.anInt6711 - local13.anInt6703;
				}
				if (local13.anInt6705 < 0) {
					local13.anInt6705 = 0;
				}
				if (local13.anInt6638 - local13.anInt6701 < local13.anInt6641) {
					local13.anInt6641 = local13.anInt6638 - local13.anInt6701;
				}
				if (local13.anInt6641 < 0) {
					local13.anInt6641 = 0;
				}
				if (local13.anInt6660 == 0) {
					Static163.method2629(local13, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!ha;ILclient!jp;)I")
	public static int method2199(@OriginalArg(0) Class137 arg0, @OriginalArg(2) Class188 arg1) {
		if (arg1.anInt4909 != -1) {
			return arg1.anInt4909;
		}
		if (arg1.anInt4906 != -1) {
			@Pc(27) Class224 local27 = arg0.anInterface3_11.method6177(arg1.anInt4906);
			if (!local27.aBoolean453) {
				return local27.aShort74;
			}
		}
		return arg1.anInt4901;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!je;[Lclient!qm;)V")
	public static void method2200(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) Class14_Sub37[] arg1) {
		@Pc(6) int local6;
		if (Static679.aBoolean764) {
			local6 = arg0.method9165(arg1);
			Static533.aClass137_41.method7887(local6, arg1);
		}
		if (Static473.aClass51Array2 == Static576.aClass51Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class12_Sub2_Sub2) {
				local6 = ((Class12_Sub2_Sub2) arg0).aShort111;
				local28 = ((Class12_Sub2_Sub2) arg0).aShort110;
			} else {
				local6 = arg0.anInt10998 >> Static579.anInt9935;
				local28 = arg0.anInt11002 >> Static579.anInt9935;
			}
			Static533.aClass137_41.EA(Static343.aClass51Array1[0].method7866(arg0.anInt10998, arg0.anInt11002), Static174.method9028(local6, local28), Static630.method8818(local6, local28), Static438.method6441(local6, local28));
		}
		@Pc(64) Class12_Sub8 local64 = arg0.method9151(Static533.aClass137_41);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean756) {
			@Pc(72) Class12_Sub1[] local72 = local64.aClass12_Sub1Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class12_Sub1 local79 = local72[local74];
				if (local79.aBoolean6) {
					Static357.method5407(local79.anInt80 - local79.anInt81, local79.anInt83 - local79.anInt81, local79.anInt82 + local79.anInt81, local79.anInt84 + local79.anInt81);
				}
			}
		}
		if (local64.aBoolean459) {
			local64.aClass12_Sub2_15 = arg0;
			if (Static267.aBoolean322) {
				@Pc(119) Class23 local119 = Static326.aClass23_1;
				synchronized (Static326.aClass23_1) {
					Static326.aClass23_1.method476(local64);
					return;
				}
			}
			Static326.aClass23_1.method476(local64);
			return;
		}
		Static512.method7461(local64);
	}
}
