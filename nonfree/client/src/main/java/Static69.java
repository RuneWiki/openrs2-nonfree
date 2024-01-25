import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
	public static int anInt1208 = 0;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
	public static int anInt1215 = -50;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
	public static void method1059() {
		for (@Pc(17) Class2_Sub6_Sub2 local17 = (Class2_Sub6_Sub2) Static211.aClass218_18.method5092(); local17 != null; local17 = (Class2_Sub6_Sub2) Static211.aClass218_18.method5096()) {
			@Pc(22) Class4_Sub2_Sub1_Sub1 local22 = local17.aClass4_Sub2_Sub1_Sub1_1;
			local22.method188(false, 1);
			if (local22.method191()) {
				local17.method9872();
				local22.method185();
			} else if (Static632.aClass311ArrayArrayArray3 != null && local22.method187()) {
				Static432.method6282(local22, true);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method1061(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static689.aClass145_16 = arg0;
		Static445.anInt7219 = arg1;
		Static4.aBoolean8 = Static445.anInt7219 > 1 && Static689.aClass145_16.method9674();
		Static260.anInt4053 = 9;
		Static60.anInt1042 = 0x1 << Static260.anInt4053;
		Static328.anInt5032 = Static60.anInt1042 >> 1;
		Math.sqrt((double) (Static328.anInt5032 * Static328.anInt5032 + Static328.anInt5032 * Static328.anInt5032));
		Static97.anInt1761 = 4;
		Static372.anInt5930 = arg2;
		Static545.anInt8590 = arg3;
		Static128.anInt2136 = arg4;
		Static711.aClass157_1 = Static211.method2956();
		Static203.method2883();
		Static618.aClass311ArrayArrayArray2 = new Class311[4][Static372.anInt5930][Static545.anInt8590];
		Static126.aClass133Array1 = new Class133[4];
		if (arg5) {
			Static217.anIntArrayArray28 = new int[Static372.anInt5930][Static545.anInt8590];
			Static314.aByteArrayArray9 = new byte[Static372.anInt5930][Static545.anInt8590];
			Static651.aShortArrayArray6 = new short[Static372.anInt5930][Static545.anInt8590];
			Static564.aClass311ArrayArrayArray1 = new Class311[1][Static372.anInt5930][Static545.anInt8590];
			Static685.aClass133Array5 = new Class133[1];
		} else {
			Static217.anIntArrayArray28 = null;
			Static314.aByteArrayArray9 = null;
			Static651.aShortArrayArray6 = null;
			Static564.aClass311ArrayArrayArray1 = null;
			Static685.aClass133Array5 = null;
		}
		if (arg6) {
			Static255.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static292.aClass248Array1 = new Class248[65535];
			Static336.aBooleanArray24 = new boolean[65535];
			Static488.anInt7862 = 0;
		} else {
			Static255.aLongArrayArrayArray1 = null;
			Static292.aClass248Array1 = null;
			Static336.aBooleanArray24 = null;
			Static488.anInt7862 = 0;
		}
		Static463.method6693(false);
		Static594.aClass4_Sub2Array5 = new Class4_Sub2[2];
		Static161.aClass4_Sub2Array1 = new Class4_Sub2[2];
		Static699.aClass4_Sub2Array6 = new Class4_Sub2[2];
		Static503.aClass4_Sub2Array3 = new Class4_Sub2[10000];
		Static457.anInt7457 = 0;
		Static248.aClass4_Sub2Array4 = new Class4_Sub2[5000];
		Static689.anInt10611 = 0;
		Static505.aClass4_Sub2_Sub1Array1 = new Class4_Sub2_Sub1[5000];
		Static240.anInt10693 = 0;
		Static208.aBooleanArrayArray6 = new boolean[Static128.anInt2136 + Static128.anInt2136 + 1][Static128.anInt2136 + Static128.anInt2136 + 1];
		Static605.aBooleanArrayArray10 = new boolean[Static128.anInt2136 + Static128.anInt2136 + 2][Static128.anInt2136 + Static128.anInt2136 + 2];
		Static234.anIntArray288 = new int[Static128.anInt2136 + Static128.anInt2136 + 2];
		Static655.aClass52_3 = Static655.aClass52_2;
		if (Static4.aBoolean8) {
			Static9.aBooleanArrayArrayArray1 = new boolean[4][Static128.anInt2136 + Static128.anInt2136 + 1][Static128.anInt2136 + Static128.anInt2136 + 1];
			Static277.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static403.aClass23Array1 != null) {
				Static47.method622();
			}
			Static403.aClass23Array1 = new Class23[Static445.anInt7219];
			Static689.aClass145_16.method9633(Static403.aClass23Array1.length + 1);
			Static689.aClass145_16.method9705(0);
			for (@Pc(214) int local214 = 0; local214 < Static403.aClass23Array1.length; local214++) {
				Static403.aClass23Array1[local214] = new Class23(local214 + 1, Static689.aClass145_16);
				(new Thread(Static403.aClass23Array1[local214], "wr" + local214)).start();
			}
			@Pc(253) byte local253;
			if (Static445.anInt7219 == 2) {
				local253 = 4;
				Static268.anInt4160 = 2;
			} else if (Static445.anInt7219 == 3) {
				local253 = 6;
				Static268.anInt4160 = 3;
			} else {
				local253 = 8;
				Static268.anInt4160 = 4;
			}
			Static444.aClass324Array1 = new Class324[local253];
			for (@Pc(273) int local273 = 0; local273 < local253; local273++) {
				Static444.aClass324Array1[local273] = new Class324(Static412.aStringArrayArray1[Static445.anInt7219 - 2][local273]);
			}
		} else {
			Static268.anInt4160 = 1;
		}
		Static314.anIntArray345 = new int[Static268.anInt4160 - 1];
		Static708.anIntArray750 = new int[Static268.anInt4160 - 1];
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!no;ILclient!no;)V")
	public static void method1064(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(2) Class2_Sub6 arg1) {
		if (arg1.aClass2_Sub6_63 != null) {
			arg1.method8698();
		}
		arg1.aClass2_Sub6_63 = arg0;
		arg1.aClass2_Sub6_64 = arg0.aClass2_Sub6_64;
		arg1.aClass2_Sub6_63.aClass2_Sub6_64 = arg1;
		arg1.aClass2_Sub6_64.aClass2_Sub6_63 = arg1;
	}
}
