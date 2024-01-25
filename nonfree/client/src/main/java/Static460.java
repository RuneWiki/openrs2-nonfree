import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Lclient!kj;")
	public static Class1_Sub4_Sub4 method7015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass1_Sub4_Sub4_1 == null ? null : local7.aClass1_Sub4_Sub4_1;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!r;IIIIIIZZ)V")
	public static void method7016(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static468.aClass44_7 = arg0;
		Static468.anInt2399 = arg1;
		Static175.aBoolean289 = Static468.anInt2399 > 1 && Static468.aClass44_7.method4976();
		Static145.anInt3093 = 9;
		Static279.anInt5708 = 0x1 << Static145.anInt3093;
		Static96.anInt8036 = Static279.anInt5708 >> 1;
		Math.sqrt((double) (Static96.anInt8036 * Static96.anInt8036 + Static96.anInt8036 * Static96.anInt8036));
		Static345.anInt6662 = 4;
		Static182.anInt3633 = arg2;
		Static253.anInt4651 = arg3;
		Static579.anInt10075 = arg4;
		Static141.aClass65_1 = Static255.method4096();
		Static44.method528();
		Static321.aClass53ArrayArrayArray2 = new Class53[4][Static182.anInt3633][Static253.anInt4651];
		Static444.aClass83Array7 = new Class83[4];
		if (arg5) {
			Static429.anIntArrayArray47 = new int[Static182.anInt3633][Static253.anInt4651];
			Static237.aByteArrayArray14 = new byte[Static182.anInt3633][Static253.anInt4651];
			Static15.aShortArrayArray1 = new short[Static182.anInt3633][Static253.anInt4651];
			Static507.aClass53ArrayArrayArray3 = new Class53[1][Static182.anInt3633][Static253.anInt4651];
			Static183.aClass83Array6 = new Class83[1];
		} else {
			Static429.anIntArrayArray47 = null;
			Static237.aByteArrayArray14 = null;
			Static15.aShortArrayArray1 = null;
			Static507.aClass53ArrayArrayArray3 = null;
			Static183.aClass83Array6 = null;
		}
		if (arg6) {
			Static461.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static485.aClass177Array1 = new Class177[65535];
			Static54.aBooleanArray3 = new boolean[65535];
			Static523.anInt9351 = 0;
		} else {
			Static461.aLongArrayArrayArray1 = null;
			Static485.aClass177Array1 = null;
			Static54.aBooleanArray3 = null;
			Static523.anInt9351 = 0;
		}
		Static45.method566(false);
		Static124.aClass1_Sub4ArrayArray4 = new Class1_Sub4[2][];
		Static124.aClass1_Sub4ArrayArray4[0] = new Class1_Sub4[Static561.anIntArray289[0]];
		Static124.aClass1_Sub4ArrayArray4[1] = new Class1_Sub4[Static561.anIntArray289[1]];
		Static156.anIntArray148 = new int[2];
		Static343.aClass1_Sub4ArrayArray3 = new Class1_Sub4[2][];
		Static343.aClass1_Sub4ArrayArray3[0] = new Class1_Sub4[Static478.anIntArray478[0]];
		Static343.aClass1_Sub4ArrayArray3[1] = new Class1_Sub4[Static478.anIntArray478[1]];
		Static291.anIntArray291 = new int[2];
		Static27.aClass1_Sub4ArrayArray1 = new Class1_Sub4[2][];
		Static27.aClass1_Sub4ArrayArray1[0] = new Class1_Sub4[Static47.anIntArray24[0]];
		Static27.aClass1_Sub4ArrayArray1[1] = new Class1_Sub4[Static47.anIntArray24[1]];
		Static2.anIntArray3 = new int[2];
		Static321.aClass1_Sub4Array2 = new Class1_Sub4[10000];
		Static422.anInt7927 = 0;
		Static158.aClass1_Sub4Array1 = new Class1_Sub4[5000];
		Static106.anInt2410 = 0;
		Static384.aClass1_Sub4_Sub2Array1 = new Class1_Sub4_Sub2[5000];
		Static375.anInt7259 = 0;
		Static522.aBooleanArrayArray18 = new boolean[Static579.anInt10075 + Static579.anInt10075 + 1][Static579.anInt10075 + Static579.anInt10075 + 1];
		Static593.aBooleanArrayArray16 = new boolean[Static579.anInt10075 + Static579.anInt10075 + 2][Static579.anInt10075 + Static579.anInt10075 + 2];
		if (Static175.aBoolean289) {
			Static320.aBooleanArrayArrayArray2 = new boolean[4][Static579.anInt10075 + Static579.anInt10075 + 1][Static579.anInt10075 + Static579.anInt10075 + 1];
			Static258.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static339.aClass127Array1 != null) {
				Static511.method7456();
			}
			Static339.aClass127Array1 = new Class127[Static468.anInt2399];
			Static468.aClass44_7.method4991(Static339.aClass127Array1.length + 1);
			Static468.aClass44_7.method5038(0);
			for (@Pc(247) int local247 = 0; local247 < Static339.aClass127Array1.length; local247++) {
				Static339.aClass127Array1[local247] = new Class127(local247 + 1, Static468.aClass44_7);
				(new Thread(Static339.aClass127Array1[local247], "wr" + local247)).start();
			}
			@Pc(282) byte local282;
			if (Static468.anInt2399 == 2) {
				local282 = 4;
				Static24.anInt388 = 2;
			} else if (Static468.anInt2399 == 3) {
				local282 = 6;
				Static24.anInt388 = 3;
			} else {
				local282 = 8;
				Static24.anInt388 = 4;
			}
			Static526.aClass124Array2 = new Class124[local282];
			for (@Pc(302) int local302 = 0; local302 < local282; local302++) {
				Static526.aClass124Array2[local302] = new Class124(Static401.aStringArrayArray1[Static468.anInt2399 - 2][local302]);
			}
		} else {
			Static24.anInt388 = 1;
		}
		Static113.anIntArray122 = new int[Static24.anInt388 - 1];
		Static339.anIntArray335 = new int[Static24.anInt388 - 1];
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Lclient!om;")
	public static Class151 method7017() {
		try {
			return new Class151_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class151) Class.forName("Class151_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class151_Sub3();
			}
		}
	}
}
