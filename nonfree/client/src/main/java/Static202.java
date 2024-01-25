import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!mo", name = "w", descriptor = "Lclient!mo;")
	public static Class143 aClass143_79;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
	public static int anInt4074 = 1;

	@OriginalMember(owner = "client!mo", name = "B", descriptor = "[I")
	public static final int[] anIntArray354 = new int[200];

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "[I")
	public static final int[] anIntArray355 = new int[13];

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public static void method3735() {
		Static67.method1662(25);
		Static65.method5115();
		System.gc();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method3737(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII)V")
	public static void method3761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class10_Sub4 local13 = local7.aClass10_Sub4_1;
		@Pc(16) Class10_Sub4 local16 = local7.aClass10_Sub4_2;
		if (local13 != null) {
			local13.anInt4377 = local13.anInt4377 * arg3 / 16;
			local13.anInt4371 = local13.anInt4371 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt4377 = local16.anInt4377 * arg3 / 16;
			local16.anInt4371 = local16.anInt4371 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!e;)V")
	public static void method3763(@OriginalArg(1) Class46 arg0) {
		if (Static41.anInt980 < 2 && Static312.anInt6025 == 0 && !Static184.aBoolean241) {
			return;
		}
		@Pc(50) String local50;
		if (Static312.anInt6025 == 1 && Static41.anInt980 < 2) {
			local50 = Static2.aString1 + Static265.aString190 + Static328.aString237 + " ->";
		} else if (Static184.aBoolean241 && Static41.anInt980 < 2) {
			local50 = Static324.aString230 + Static265.aString190 + Static78.aString73 + " ->";
		} else if (Static153.aBoolean211 && Static345.aBooleanArray30[81] && Static41.anInt980 > 2) {
			local50 = Static206.method6002((Class14_Sub23) Static95.aClass18_9.aClass14_17.aClass14_247.aClass14_247);
		} else {
			@Pc(57) Class14_Sub23 local57 = (Class14_Sub23) Static95.aClass18_9.aClass14_17.aClass14_247;
			local50 = Static206.method6002(local57);
			@Pc(63) int[] local63 = null;
			if (Static31.method760(local57.anInt4355)) {
				local63 = Static296.method5066((int) local57.aLong128).anIntArray647;
			} else if (Static194.method3670(local57.anInt4355)) {
				@Pc(87) Class10_Sub3_Sub3_Sub1 local87 = Static266.aClass10_Sub3_Sub3_Sub1Array1[(int) local57.aLong128];
				if (local87 != null) {
					local63 = local87.aClass192_1.anIntArray527;
				}
			} else if (Static254.method4389(local57.anInt4355)) {
				if (local57.anInt4355 == 1001) {
					local63 = Static232.method2200((int) local57.aLong128).anIntArray171;
				} else {
					local63 = Static232.method2200((int) (local57.aLong128 >>> 32 & 0x7FFFFFFFL)).anIntArray171;
				}
			}
			if (local63 != null) {
				local50 = local50 + Static38.method915(local63);
			}
		}
		if (Static41.anInt980 > 2) {
			local50 = local50 + "<col=ffffff> / " + (Static41.anInt980 - 2) + Static291.aString208;
		}
		if (Static89.aClass146_20 != null) {
			@Pc(240) Class30 local240 = Static89.aClass146_20.method3806(arg0);
			if (local240 == null) {
				local240 = Static164.aClass30_5;
			}
			local240.method5579(Static196.aRandom1, Static89.aClass146_20.anInt4199, Static127.anInt2789, Static138.anInt2944, Static58.anIntArray95, Static89.aClass146_20.anInt4184, Static89.aClass146_20.anInt4133, Static235.aClass2Array14, Static89.aClass146_20.anInt4203, local50, Static2.anInt105, Static70.anIntArray122, Static89.aClass146_20.anInt4123, Static89.aClass146_20.anInt4166);
			Static26.method683(Static70.anIntArray122[1], Static70.anIntArray122[3], Static70.anIntArray122[0], Static70.anIntArray122[2]);
		} else if (Static45.aClass146_10 != null && Static45.anInt1136 == 0) {
			@Pc(221) int local221 = Static164.aClass30_5.method5571(Static165.anInt5094 + 4, Static235.aClass2Array14, Static2.anInt105, Static21.anInt1363 + 16, Static58.anIntArray95, Static196.aRandom1, local50);
			Static26.method683(Static21.anInt1363, 16, Static165.anInt5094 + 4, local221 + Static223.aClass76_9.method2256(local50));
			return;
		}
	}
}
