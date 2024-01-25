import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "[[[Lclient!lo;")
	public static Class217[][][] aClass217ArrayArrayArray5;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "Lclient!pl;")
	public static final Class273 aClass273_26 = new Class273(512);

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZI[Lclient!raa;IBI)V")
	public static void method6388(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class295[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(18) Class295 local18 = arg2[local12];
			if (local18 != null && arg1 == local18.anInt7944) {
				Static150.method2213(arg0, arg3, local18, arg4);
				Static190.method2863(arg4, arg3, local18);
				if (local18.anInt8024 - local18.anInt7957 < local18.anInt7988) {
					local18.anInt7988 = local18.anInt8024 - local18.anInt7957;
				}
				if (local18.anInt8029 - local18.anInt7985 < local18.anInt7997) {
					local18.anInt7997 = local18.anInt8029 - local18.anInt7985;
				}
				if (local18.anInt7988 < 0) {
					local18.anInt7988 = 0;
				}
				if (local18.anInt7997 < 0) {
					local18.anInt7997 = 0;
				}
				if (local18.anInt8001 == 0) {
					Static22.method259(arg0, local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method6389(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static517.aClass133_13 = arg0;
		Static106.anInt2025 = arg1;
		Static576.aBoolean696 = Static106.anInt2025 > 1 && Static517.aClass133_13.method7283();
		Static115.anInt2156 = 9;
		Static302.anInt5267 = 0x1 << Static115.anInt2156;
		Static147.anInt2575 = Static302.anInt5267 >> 1;
		Math.sqrt((double) (Static147.anInt2575 * Static147.anInt2575 + Static147.anInt2575 * Static147.anInt2575));
		Static68.anInt1380 = 4;
		Static357.anInt5961 = arg2;
		Static429.anInt7422 = arg3;
		Static51.anInt1064 = arg4;
		Static289.aClass86_1 = Static585.method8443();
		Static581.method8402();
		Static96.aClass217ArrayArrayArray2 = new Class217[4][Static357.anInt5961][Static429.anInt7422];
		Static20.aClass61Array2 = new Class61[4];
		if (arg5) {
			Static361.anIntArrayArray64 = new int[Static357.anInt5961][Static429.anInt7422];
			Static488.aByteArrayArray18 = new byte[Static357.anInt5961][Static429.anInt7422];
			Static328.aShortArrayArray23 = new short[Static357.anInt5961][Static429.anInt7422];
			Static61.aClass217ArrayArrayArray6 = new Class217[1][Static357.anInt5961][Static429.anInt7422];
			Static456.aClass61Array3 = new Class61[1];
		} else {
			Static361.anIntArrayArray64 = null;
			Static488.aByteArrayArray18 = null;
			Static328.aShortArrayArray23 = null;
			Static61.aClass217ArrayArrayArray6 = null;
			Static456.aClass61Array3 = null;
		}
		if (arg6) {
			Static26.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static278.aClass174Array1 = new Class174[65535];
			Static560.aBooleanArray26 = new boolean[65535];
			Static461.anInt7766 = 0;
		} else {
			Static26.aLongArrayArrayArray1 = null;
			Static278.aClass174Array1 = null;
			Static560.aBooleanArray26 = null;
			Static461.anInt7766 = 0;
		}
		Static350.method8738(false);
		Static79.aClass4_Sub2Array1 = new Class4_Sub2[2];
		Static457.aClass4_Sub2Array4 = new Class4_Sub2[2];
		Static243.aClass4_Sub2Array2 = new Class4_Sub2[2];
		Static535.aClass4_Sub2Array5 = new Class4_Sub2[10000];
		Static174.anInt3117 = 0;
		Static427.aClass4_Sub2Array3 = new Class4_Sub2[5000];
		Static590.anInt9893 = 0;
		Static210.aClass4_Sub2_Sub1Array1 = new Class4_Sub2_Sub1[5000];
		Static454.anInt7719 = 0;
		Static475.aBooleanArrayArray8 = new boolean[Static51.anInt1064 + Static51.anInt1064 + 1][Static51.anInt1064 + Static51.anInt1064 + 1];
		Static431.aBooleanArrayArray6 = new boolean[Static51.anInt1064 + Static51.anInt1064 + 2][Static51.anInt1064 + Static51.anInt1064 + 2];
		Static376.anIntArray345 = new int[Static51.anInt1064 + Static51.anInt1064 + 2];
		Static348.aClass155_3 = Static348.aClass155_2;
		if (Static576.aBoolean696) {
			Static448.aBooleanArrayArrayArray1 = new boolean[4][Static51.anInt1064 + Static51.anInt1064 + 1][Static51.anInt1064 + Static51.anInt1064 + 1];
			Static557.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static56.aClass220Array1 != null) {
				Static152.method2230();
			}
			Static56.aClass220Array1 = new Class220[Static106.anInt2025];
			Static517.aClass133_13.method7265(Static56.aClass220Array1.length + 1);
			Static517.aClass133_13.method7278(0);
			for (@Pc(205) int local205 = 0; local205 < Static56.aClass220Array1.length; local205++) {
				Static56.aClass220Array1[local205] = new Class220(local205 + 1, Static517.aClass133_13);
				(new Thread(Static56.aClass220Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static106.anInt2025 == 2) {
				local240 = 4;
				Static645.anInt10657 = 2;
			} else if (Static106.anInt2025 == 3) {
				local240 = 6;
				Static645.anInt10657 = 3;
			} else {
				local240 = 8;
				Static645.anInt10657 = 4;
			}
			Static288.aClass175Array1 = new Class175[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static288.aClass175Array1[local260] = new Class175(Static556.aStringArrayArray1[Static106.anInt2025 - 2][local260]);
			}
		} else {
			Static645.anInt10657 = 1;
		}
		Static442.anIntArray407 = new int[Static645.anInt10657 - 1];
		Static570.anIntArray529 = new int[Static645.anInt10657 - 1];
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(BILclient!raa;)Ljava/lang/String;")
	public static String method6391(@OriginalArg(1) int arg0, @OriginalArg(2) Class295 arg1) {
		if (!Static75.method1286(arg1).method6705(arg0) && arg1.anObjectArray21 == null) {
			return null;
		} else if (arg1.aStringArray64 == null || arg1.aStringArray64.length <= arg0 || arg1.aStringArray64[arg0] == null || arg1.aStringArray64[arg0].trim().length() == 0) {
			return Static132.aBoolean513 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray64[arg0];
		}
	}
}
