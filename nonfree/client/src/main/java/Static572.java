import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!sba", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method7942(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static626.aClass67_16 = arg0;
		Static459.anInt2357 = arg1;
		Static67.aBoolean81 = Static459.anInt2357 > 1 && Static626.aClass67_16.method7710();
		Static394.anInt7067 = 9;
		Static495.anInt8508 = 0x1 << Static394.anInt7067;
		Static198.anInt3490 = Static495.anInt8508 >> 1;
		Math.sqrt((double) (Static198.anInt3490 * Static198.anInt3490 + Static198.anInt3490 * Static198.anInt3490));
		Static241.anInt4521 = 4;
		Static509.anInt8656 = arg2;
		Static164.anInt3059 = arg3;
		Static726.anInt11312 = arg4;
		Static76.aClass123_1 = Static390.method5899();
		Static402.method6013();
		Static274.aClass262ArrayArrayArray1 = new Class262[4][Static509.anInt8656][Static164.anInt3059];
		Static167.aClass313Array1 = new Class313[4];
		if (arg5) {
			Static283.anIntArrayArray26 = new int[Static509.anInt8656][Static164.anInt3059];
			Static242.aByteArrayArray6 = new byte[Static509.anInt8656][Static164.anInt3059];
			Static235.aShortArrayArray2 = new short[Static509.anInt8656][Static164.anInt3059];
			Static712.aClass262ArrayArrayArray3 = new Class262[1][Static509.anInt8656][Static164.anInt3059];
			Static711.aClass313Array3 = new Class313[1];
		} else {
			Static283.anIntArrayArray26 = null;
			Static242.aByteArrayArray6 = null;
			Static235.aShortArrayArray2 = null;
			Static712.aClass262ArrayArrayArray3 = null;
			Static711.aClass313Array3 = null;
		}
		if (arg6) {
			Static353.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static458.aClass246Array1 = new Class246[65535];
			Static432.aBooleanArray18 = new boolean[65535];
			Static254.anInt4739 = 0;
		} else {
			Static353.aLongArrayArrayArray1 = null;
			Static458.aClass246Array1 = null;
			Static432.aBooleanArray18 = null;
			Static254.anInt4739 = 0;
		}
		Static665.method8868(false);
		Static660.aClass19_Sub1Array5 = new Class19_Sub1[2];
		Static358.aClass19_Sub1Array2 = new Class19_Sub1[2];
		Static634.aClass19_Sub1Array4 = new Class19_Sub1[2];
		Static325.aClass19_Sub1Array1 = new Class19_Sub1[10000];
		Static407.anInt7263 = 0;
		Static626.aClass19_Sub1Array3 = new Class19_Sub1[5000];
		Static81.anInt1265 = 0;
		Static339.aClass19_Sub1_Sub3Array1 = new Class19_Sub1_Sub3[5000];
		Static612.anInt9915 = 0;
		Static624.aBooleanArrayArray7 = new boolean[Static726.anInt11312 + Static726.anInt11312 + 1][Static726.anInt11312 + Static726.anInt11312 + 1];
		Static39.aBooleanArrayArray1 = new boolean[Static726.anInt11312 + Static726.anInt11312 + 2][Static726.anInt11312 + Static726.anInt11312 + 2];
		Static698.anIntArray610 = new int[Static726.anInt11312 + Static726.anInt11312 + 2];
		Static424.aClass88_1 = Static424.aClass88_2;
		if (Static67.aBoolean81) {
			Static71.aBooleanArrayArrayArray1 = new boolean[4][Static726.anInt11312 + Static726.anInt11312 + 1][Static726.anInt11312 + Static726.anInt11312 + 1];
			Static153.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static150.aClass240Array1 != null) {
				Static530.method7490();
			}
			Static150.aClass240Array1 = new Class240[Static459.anInt2357];
			Static626.aClass67_16.method7657(Static150.aClass240Array1.length + 1);
			Static626.aClass67_16.method7695(0);
			for (@Pc(214) int local214 = 0; local214 < Static150.aClass240Array1.length; local214++) {
				Static150.aClass240Array1[local214] = new Class240(local214 + 1, Static626.aClass67_16);
				(new Thread(Static150.aClass240Array1[local214], "wr" + local214)).start();
			}
			@Pc(253) byte local253;
			if (Static459.anInt2357 == 2) {
				local253 = 4;
				Static76.anInt1153 = 2;
			} else if (Static459.anInt2357 == 3) {
				local253 = 6;
				Static76.anInt1153 = 3;
			} else {
				local253 = 8;
				Static76.anInt1153 = 4;
			}
			Static307.aClass198Array1 = new Class198[local253];
			for (@Pc(273) int local273 = 0; local273 < local253; local273++) {
				Static307.aClass198Array1[local273] = new Class198(Static178.aStringArrayArray1[Static459.anInt2357 - 2][local273]);
			}
		} else {
			Static76.anInt1153 = 1;
		}
		Static41.anIntArray46 = new int[Static76.anInt1153 - 1];
		Static532.anIntArray489 = new int[Static76.anInt1153 - 1];
	}
}
