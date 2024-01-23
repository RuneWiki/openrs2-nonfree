import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!i", name = "j", descriptor = "[Lclient!pa;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array6;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "[I")
	public static int[] anIntArray205 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method2018() {
		Static286.method4394();
		Static309.method4708();
		Static259.method4090();
		Static271.aClass148_12.method3605();
		Static84.aClass177_1 = new Class177();
		((Class30_Sub1) Static215.anInterface5_1).method797();
		Static216.method3390();
		Static101.aClass61Array1 = new Class61[255];
		Static101.anInt2036 = 0;
		Static44.method868();
		Static150.method2545();
		Static256.method4054();
		Static36.method641(false);
		Static131.method2239();
		Static190.method3094();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(51) Class15_Sub5_Sub2 local51 = Static17.aClass15_Sub5_Sub2Array1[local42];
			if (local51 != null) {
				local51.anObject7 = null;
			}
		}
		if (Static156.aBoolean211) {
			Static150.method2544();
			Static255.method4048(Static36.aBoolean28);
			Static158.method2723();
		}
		Static274.method4265(Static258.aClass121_114, Static103.aClass121_52);
		Static167.method2844(Static258.aClass121_114);
		Static304.aClass1_Sub2_Sub1_49 = null;
		Static272.aClass1_Sub2_Sub1_51 = null;
		Static125.aClass1_Sub2_Sub1_27 = null;
		Static56.aClass1_Sub2_Sub1_12 = null;
		Static167.aClass1_Sub2_Sub1_33 = null;
		if (Static37.anInt773 == 5) {
			Static194.method3153(Static258.aClass121_114);
		}
		if (Static37.anInt773 == 10) {
			Static302.method4562(false);
		}
		if (Static37.anInt773 == 30) {
			Static65.method1215(25);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method2019() {
		Static11.aClass187_7.method4534(5);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2021(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) long local34 = arg0;
			@Pc(36) int local36 = 0;
			while (local34 != 0L) {
				local34 /= 37L;
				local36++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local36);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static222.aCharArray3[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					local72 = ' ';
					@Pc(83) int local83 = local52.length() - 1;
					local52.setCharAt(local83, Character.toUpperCase(local52.charAt(local83)));
				}
				local52.append(local72);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
	public static void method2022(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub11 local13 = Static5.method35(arg0, 2);
		local13.method2873();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII)V")
	public static void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static127.anInt2581 = arg1;
		Static82.anInt1639 = arg2;
		Static187.anInt3564 = arg3;
		Static64.anInt1223 = arg4;
		Static315.anInt5220 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)V")
	public static void method2024(@OriginalArg(1) boolean arg0) {
		Static285.method4389(Static120.anInt2505, Static270.anInt4897, arg0, Static292.anInt5236);
	}
}
