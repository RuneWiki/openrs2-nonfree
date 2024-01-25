import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "[Lclient!ha;")
	public static Class84[] aClass84Array15;

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
	public static int anInt9341;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_145 = new Class45(72, 0);

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "([Ljava/lang/Object;[IIIB)V")
	public static void method7727(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg2; local55 < arg3; local55++) {
			if (local20 + (local53 & local55) > arg1[local55]) {
				@Pc(74) int local74 = arg1[local55];
				arg1[local55] = arg1[local16];
				arg1[local16] = local74;
				@Pc(88) Object local88 = arg0[local55];
				arg0[local55] = arg0[local16];
				arg0[local16++] = local88;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method7727(arg0, arg1, arg2, local16 - 1);
		method7727(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!qa;IILclient!m;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method7732(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static286.aClass42_5 = arg0;
		Static321.anInt6065 = arg1;
		Static71.aClass91_3 = arg3;
		Static205.aBoolean359 = Static286.aClass42_5.method5825() > 0;
		Static176.anInt3987 = arg4 >> Static193.anInt4311;
		Static412.anInt7717 = arg6 >> Static193.anInt4311;
		Static432.anInt7994 = arg4;
		Static87.anInt2071 = arg6;
		Static154.anInt3372 = arg5;
		Static355.anInt6649 = Static176.anInt3987 - Static307.anInt5970;
		if (Static355.anInt6649 < 0) {
			Static105.anInt2406 = -Static355.anInt6649;
			Static355.anInt6649 = 0;
		} else {
			Static105.anInt2406 = 0;
		}
		Static415.anInt3796 = Static412.anInt7717 - Static307.anInt5970;
		if (Static415.anInt3796 < 0) {
			Static256.anInt5235 = -Static415.anInt3796;
			Static415.anInt3796 = 0;
		} else {
			Static256.anInt5235 = 0;
		}
		Static59.anInt1440 = Static176.anInt3987 + Static307.anInt5970;
		if (Static59.anInt1440 > Static537.anInt9566) {
			Static59.anInt1440 = Static537.anInt9566;
		}
		Static369.anInt6844 = Static412.anInt7717 + Static307.anInt5970;
		if (Static369.anInt6844 > Static509.anInt9164) {
			Static369.anInt6844 = Static509.anInt9164;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static307.anInt5970 + Static307.anInt5970 + 2; local74++) {
			for (local77 = 0; local77 < Static307.anInt5970 + Static307.anInt5970 + 2; local77++) {
				local84 = Static176.anInt3987 + local74 - Static307.anInt5970;
				local90 = Static412.anInt7717 + local77 - Static307.anInt5970;
				if (local84 >= 0 && local90 >= 0 && local84 < Static537.anInt9566 && local90 < Static509.anInt9164) {
					@Pc(104) int local104 = local84 << Static193.anInt4311;
					@Pc(108) int local108 = local90 << Static193.anInt4311;
					@Pc(124) int local124 = Static155.aClass215Array5[Static155.aClass215Array5.length - 1].ba(local84, local90) - (0x3E8 << Static193.anInt4311 - 7);
					@Pc(144) int local144 = Static67.aClass215Array2 == null ? Static155.aClass215Array5[0].ba(local84, local90) + Static316.anInt6040 : Static67.aClass215Array2[0].ba(local84, local90) + Static316.anInt6040;
					Static143.aBooleanArrayArray3[local74][local77] = Static286.aClass42_5.B(local104, local124, local108, local104, local144, local108);
				} else {
					Static143.aBooleanArrayArray3[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static307.anInt5970 + Static307.anInt5970 + 1; local77++) {
			for (local84 = 0; local84 < Static307.anInt5970 + Static307.anInt5970 + 1; local84++) {
				Static243.aBooleanArrayArray6[local77][local84] = Static143.aBooleanArrayArray3[local77][local84] || Static143.aBooleanArrayArray3[local77 + 1][local84] || Static143.aBooleanArrayArray3[local77][local84 + 1] || Static143.aBooleanArrayArray3[local77 + 1][local84 + 1];
			}
		}
		Static310.anIntArray660 = arg8;
		Static518.anIntArray679 = arg9;
		Static88.anIntArray192 = arg10;
		Static400.anIntArray500 = arg11;
		Static363.anIntArray466 = arg12;
		Static48.method891();
		Static428.method6577(Static286.aClass42_5);
		for (@Pc(261) Class7_Sub8 local261 = (Class7_Sub8) Static246.aClass149_3.method3989(); local261 != null; local261 = (Class7_Sub8) Static246.aClass149_3.method3986()) {
			local261.method7760();
			Static535.method7886(local261);
		}
		if (Static205.aBoolean359) {
			for (local90 = 0; local90 < Static423.anInt78; local90++) {
				Static485.aClass97Array1[local90].method2692(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static286.aClass42_5.method5837(0);
			if (Static308.aClass126_1 == null || Static308.aClass126_1 instanceof Class126_Sub2) {
				Static308.aClass126_1 = new Class126_Sub1();
			}
		} else if (Static308.aClass126_1 == null || Static308.aClass126_1 instanceof Class126_Sub1) {
			Static308.aClass126_1 = new Class126_Sub2();
		}
		Static308.aClass126_1.method7345(arg2);
		Static308.aClass126_1.method7342();
		if (Static141.aClass37ArrayArrayArray2 != null) {
			Static200.method3790(true);
			Static308.aClass126_1.method7340(22);
			Static32.method687(arg2, null, 0, (byte) 0, arg15, arg16);
			Static308.aClass126_1.method7342();
			Static308.aClass126_1.method7340(23);
			Static200.method3790(false);
		}
		Static32.method687(arg2, arg7, arg13, arg14, arg15, arg16);
		Static308.aClass126_1.method7342();
		Static308.aClass126_1.method7341();
		Static308.aClass126_1.method7342();
		if (arg2 > 1) {
			Static286.aClass42_5.method5804(0);
		}
		Static286.aClass42_5.method5824(0, null);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)Z")
	public static boolean method7733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static208.method3862(arg0, arg1) || Static58.method1436(arg0, arg1);
	}
}
