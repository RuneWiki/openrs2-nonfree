import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "[I")
	public static int[] anIntArray261;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method3304(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static486.aClass16_8 = arg0;
		Static105.anInt2206 = arg1;
		Static284.aBoolean410 = Static105.anInt2206 > 1 && Static486.aClass16_8.method8179();
		Static436.anInt7634 = 9;
		Static10.anInt118 = 0x1 << Static436.anInt7634;
		Static589.anInt9316 = Static10.anInt118 >> 1;
		Math.sqrt((double) (Static589.anInt9316 * Static589.anInt9316 + Static589.anInt9316 * Static589.anInt9316));
		Static373.anInt6613 = 4;
		Static410.anInt6962 = arg2;
		Static315.anInt5894 = arg3;
		Static641.anInt9890 = arg4;
		Static645.aClass171_1 = Static474.method6819();
		Static591.method7937();
		Static559.aClass247ArrayArrayArray2 = new Class247[4][Static410.anInt6962][Static315.anInt5894];
		Static239.aClass104Array1 = new Class104[4];
		if (arg5) {
			Static301.anIntArrayArray59 = new int[Static410.anInt6962][Static315.anInt5894];
			Static614.aByteArrayArray23 = new byte[Static410.anInt6962][Static315.anInt5894];
			Static273.aShortArrayArray10 = new short[Static410.anInt6962][Static315.anInt5894];
			Static618.aClass247ArrayArrayArray3 = new Class247[1][Static410.anInt6962][Static315.anInt5894];
			Static605.aClass104Array3 = new Class104[1];
		} else {
			Static301.anIntArrayArray59 = null;
			Static614.aByteArrayArray23 = null;
			Static273.aShortArrayArray10 = null;
			Static618.aClass247ArrayArrayArray3 = null;
			Static605.aClass104Array3 = null;
		}
		if (arg6) {
			Static71.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static135.aClass119Array1 = new Class119[65535];
			Static143.aBooleanArray11 = new boolean[65535];
			Static379.anInt9747 = 0;
		} else {
			Static71.aLongArrayArrayArray1 = null;
			Static135.aClass119Array1 = null;
			Static143.aBooleanArray11 = null;
			Static379.anInt9747 = 0;
		}
		Static95.method1889(false);
		Static249.aClass23_Sub2Array2 = new Class23_Sub2[2];
		Static496.aClass23_Sub2Array3 = new Class23_Sub2[2];
		Static188.aClass23_Sub2Array1 = new Class23_Sub2[2];
		Static604.aClass23_Sub2Array4 = new Class23_Sub2[10000];
		Static639.anInt9861 = 0;
		Static660.aClass23_Sub2Array5 = new Class23_Sub2[5000];
		Static263.anInt4938 = 0;
		Static594.aClass23_Sub2_Sub1Array1 = new Class23_Sub2_Sub1[5000];
		Static279.anInt5224 = 0;
		Static569.aBooleanArrayArray6 = new boolean[Static641.anInt9890 + Static641.anInt9890 + 1][Static641.anInt9890 + Static641.anInt9890 + 1];
		Static452.aBooleanArrayArray4 = new boolean[Static641.anInt9890 + Static641.anInt9890 + 2][Static641.anInt9890 + Static641.anInt9890 + 2];
		Static419.anIntArray443 = new int[Static641.anInt9890 + Static641.anInt9890 + 2];
		Static52.aClass211_2 = Static52.aClass211_1;
		if (Static284.aBoolean410) {
			Static252.aBooleanArrayArrayArray2 = new boolean[4][Static641.anInt9890 + Static641.anInt9890 + 1][Static641.anInt9890 + Static641.anInt9890 + 1];
			Static120.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static49.aClass392Array1 != null) {
				Static23.method770();
			}
			Static49.aClass392Array1 = new Class392[Static105.anInt2206];
			Static486.aClass16_8.method8183(Static49.aClass392Array1.length + 1);
			Static486.aClass16_8.method8165(0);
			for (@Pc(205) int local205 = 0; local205 < Static49.aClass392Array1.length; local205++) {
				Static49.aClass392Array1[local205] = new Class392(local205 + 1, Static486.aClass16_8);
				(new Thread(Static49.aClass392Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static105.anInt2206 == 2) {
				local240 = 4;
				Static189.anInt7974 = 2;
			} else if (Static105.anInt2206 == 3) {
				local240 = 6;
				Static189.anInt7974 = 3;
			} else {
				local240 = 8;
				Static189.anInt7974 = 4;
			}
			Static94.aClass224Array1 = new Class224[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static94.aClass224Array1[local260] = new Class224(Static601.aStringArrayArray2[Static105.anInt2206 - 2][local260]);
			}
		} else {
			Static189.anInt7974 = 1;
		}
		Static59.anIntArray65 = new int[Static189.anInt7974 - 1];
		Static221.anIntArray277 = new int[Static189.anInt7974 - 1];
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!fca;I)Lclient!jb;")
	public static Class186 method3306(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(7) Class186 local7 = new Class186();
		local7.anInt5049 = arg0.method4858();
		local7.aClass3_Sub6_Sub1_1 = Static264.aClass263_2.method6363(local7.anInt5049);
		return local7;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(JI)I")
	public static int method3309(@OriginalArg(0) long arg0) {
		Static478.method6828(arg0);
		return Static635.aCalendar2.get(1);
	}
}
