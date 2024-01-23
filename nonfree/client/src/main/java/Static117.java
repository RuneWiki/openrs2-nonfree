import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array11;

	@OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
	public static int anInt4597;

	@OriginalMember(owner = "client!ik", name = "L", descriptor = "[I")
	public static int[] anIntArray424 = new int[100];

	@OriginalMember(owner = "client!ik", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString317 = "slide:";

	@OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
	public static int anInt4600 = 0;

	@OriginalMember(owner = "client!ik", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString318 = "Created gameworld";

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Lclient!rf;")
	public static Class147 method3397(@OriginalArg(1) int arg0) {
		@Pc(10) Class147 local10 = (Class147) Static219.aClass89_34.method2268((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static61.aClass168_46.method4058(Static99.method1657(arg0), Static120.method4728(arg0));
		local10 = new Class147();
		if (local25 != null) {
			local10.method3757(new Class1_Sub14(local25));
		}
		Static219.aClass89_34.method2272((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)V")
	public static void method3398() {
		Static241.aClient1.method727();
		Static12.aLong144 = 0L;
		Static17.aClass88_1.anInt3055 = 0;
		Static27.aBoolean273 = true;
		Static135.aBoolean191 = true;
		Static283.anInt5684 = 0;
		Static150.method2425();
		Static281.anInt2783 = -1;
		Static64.anInt1379 = -1;
		Static95.anInt2198 = 0;
		Static264.anInt5302 = 0;
		Static169.anInt3805 = 0;
		Static148.anInt3326 = -1;
		Static124.anInt2710 = -1;
		Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
		Static140.aClass1_Sub14_Sub1_2.anInt3000 = 0;
		@Pc(3655) int local3655;
		for (local3655 = 0; local3655 < Static170.aClass64Array1.length; local3655++) {
			Static170.aClass64Array1[local3655] = null;
		}
		Static181.anInt3973 = 0;
		Static128.aBoolean171 = false;
		Static183.method2973(0);
		for (local3655 = 0; local3655 < 100; local3655++) {
			Static302.aStringArray48[local3655] = null;
		}
		Static168.anInt3772 = 0;
		Static24.anInt662 = 0;
		Static220.anInt4691 = (int) (Math.random() * 120.0D) - 60;
		Static253.anInt5117 = (int) (Math.random() * 30.0D) - 20;
		Static62.aFloat16 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static206.anInt4452 = (int) (Math.random() * 80.0D) - 40;
		Static101.anInt163 = (int) (Math.random() * 110.0D) - 55;
		Static230.aBoolean185 = false;
		Static53.anInt1200 = 0;
		Static69.anInt1442 = (int) (Math.random() * 100.0D) - 50;
		Static80.method1355();
		Static147.anInt3287 = 0;
		Static16.anInt461 = 0;
		for (local3655 = 0; local3655 < 2048; local3655++) {
			Static155.aClass2_Sub4_Sub2Array1[local3655] = null;
			Static62.aClass1_Sub14Array1[local3655] = null;
		}
		for (local3655 = 0; local3655 < 32768; local3655++) {
			Static105.aClass2_Sub4_Sub1Array1[local3655] = null;
		}
		Static56.aClass2_Sub4_Sub2_1 = Static155.aClass2_Sub4_Sub2Array1[2047] = new Class2_Sub4_Sub2();
		Static315.aClass26_61.method667();
		Static250.aClass26_48.method667();
		if (Static20.aClass26ArrayArrayArray1 != null) {
			for (local3655 = 0; local3655 < 4; local3655++) {
				for (@Pc(3809) int local3809 = 0; local3809 < 104; local3809++) {
					for (@Pc(3816) int local3816 = 0; local3816 < 104; local3816++) {
						Static20.aClass26ArrayArrayArray1[local3655][local3809][local3816] = null;
					}
				}
			}
		}
		Static122.aClass26_26 = new Class26();
		Static3.anInt60 = 0;
		Static223.anInt4775 = 0;
		Static280.method4267();
		Static142.method2365();
		Static130.anInt2879 = 0;
		Static49.anInt1170 = 0;
		Static222.anInt4708 = 0;
		Static206.anInt4454 = 0;
		Static82.anInt1930 = 0;
		Static121.anInt2627 = 0;
		Static211.anInt4570 = 0;
		Static100.anInt2282 = 0;
		Static232.anInt4886 = 0;
		Static186.anInt4094 = 0;
		for (local3655 = 0; local3655 < Static279.anIntArray507.length; local3655++) {
			Static279.anIntArray507[local3655] = -1;
		}
		if (Static36.anInt902 != -1) {
			Static283.method4313(Static36.anInt902);
		}
		for (@Pc(3900) Class1_Sub12 local3900 = (Class1_Sub12) Static48.aClass186_5.method4567(); local3900 != null; local3900 = (Class1_Sub12) Static48.aClass186_5.method4579()) {
			Static236.method1277(true, local3900);
		}
		Static36.anInt902 = -1;
		Static48.aClass186_5 = new Class186(8);
		Static263.method4011();
		Static290.aClass191_16 = null;
		Static181.anInt3973 = 0;
		Static128.aBoolean171 = false;
		Static280.aClass167_2.method4028(new int[] { 0, 0, 0, 0, 0 }, -1, -1, null, false);
		for (local3655 = 0; local3655 < 8; local3655++) {
			Static290.aStringArray45[local3655] = null;
			Static241.aBooleanArray24[local3655] = false;
			Static129.anIntArray280[local3655] = -1;
		}
		Static263.method4013();
		Static211.aBoolean286 = true;
		for (local3655 = 0; local3655 < 100; local3655++) {
			Static29.aBooleanArray6[local3655] = true;
		}
		Static129.aString176 = null;
		Static304.aClass132Array1 = null;
		Static69.anInt1441 = 0;
		for (local3655 = 0; local3655 < 6; local3655++) {
			Static184.aClass33Array1[local3655] = new Class33();
		}
		for (local3655 = 0; local3655 < 25; local3655++) {
			Static269.anIntArray483[local3655] = 0;
			Static55.anIntArray155[local3655] = 0;
			Static189.anIntArray363[local3655] = 0;
		}
		if (Static294.aBoolean367) {
			Static170.method2761();
		}
		Static7.aBoolean14 = false;
		Static251.aShortArray94 = Static309.aShortArray100 = Static228.aShortArray83 = Static197.aShortArray82 = new short[256];
		Static86.aString118 = Static170.aString240;
		Static241.anInt5007 = 0;
		Static136.aBoolean193 = true;
		Static186.method3010();
		Static161.aBoolean230 = false;
		Static304.method4620();
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
	public static void method3399(@OriginalArg(1) int arg0) {
		Static181.anInt3973--;
		if (arg0 == Static181.anInt3973) {
			return;
		}
		Static319.method1422(Static112.aStringArray24, arg0 + 1, Static112.aStringArray24, arg0, Static181.anInt3973 - arg0);
		Static319.method1422(Static190.aStringArray34, arg0 + 1, Static190.aStringArray34, arg0, Static181.anInt3973 - arg0);
		Static319.method1420(Static144.anIntArray304, arg0 + 1, Static144.anIntArray304, arg0, Static181.anInt3973 - arg0);
		Static319.method1423(Static86.aShortArray64, arg0 + 1, Static86.aShortArray64, arg0, Static181.anInt3973 - arg0);
		Static319.method1418(Static171.aLongArray6, arg0 + 1, Static171.aLongArray6, arg0, Static181.anInt3973 - arg0);
		Static319.method1420(Static270.anIntArray485, arg0 + 1, Static270.anIntArray485, arg0, Static181.anInt3973 - arg0);
		Static319.method1420(Static256.anIntArray475, arg0 + 1, Static256.anIntArray475, arg0, Static181.anInt3973 - arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)I")
	public static int method3400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static170.aBoolean243) {
			Static170.aBoolean243 = false;
			arg3 = 1000000;
		}
		@Pc(17) Class61 local17 = Static87.aClass61ArrayArray1[arg2][arg1];
		@Pc(20) int local20 = local17.anInt1943;
		@Pc(30) float local30 = local17.aFloat25 * ((float) arg0 * 0.1F + 0.7F);
		@Pc(33) float local33 = local17.aFloat28;
		@Pc(36) int local36 = local17.anInt1936;
		@Pc(39) float local39 = local17.aFloat24;
		@Pc(42) Class1_Sub3_Sub24 local42 = local17.aClass1_Sub3_Sub24_2;
		@Pc(45) int local45 = local17.anInt1939;
		if (!Static202.aBoolean276) {
			local45 = 0;
		}
		@Pc(53) float local53 = local17.aFloat29;
		@Pc(56) float local56 = local17.aFloat27;
		@Pc(59) float local59 = local17.aFloat26;
		if (local20 != Static66.anInt4755 || Static19.aFloat8 != local30 || local33 != Static228.aFloat47 || local39 != Static248.aFloat49 || Static149.anInt3346 != local36 || Static215.anInt4657 != local45 || local42 != Static280.aClass1_Sub3_Sub24_8 || local56 != Static130.aFloat36 || Static214.aFloat45 != local59 || Static43.aFloat12 != local53) {
			Static297.anInt5914 = Static9.anInt279;
			Static69.aFloat17 = Static147.aFloat37;
			Static293.anInt5866 = Static247.anInt5031;
			Static78.aFloat20 = Static261.aFloat51;
			Static236.aFloat19 = Static53.aFloat15;
			Static114.aFloat31 = Static79.aFloat21;
			Static48.aFloat13 = Static31.aFloat10;
			Static8.aFloat7 = Static157.aFloat38;
			Static279.anInt5617 = Static250.anInt5102;
			Static86.aClass1_Sub3_Sub24_4 = Static244.aClass1_Sub3_Sub24_6;
			if (Static206.aClass1_Sub3_Sub24_7 == null || Static86.aClass1_Sub3_Sub24_4 == Static206.aClass1_Sub3_Sub24_7) {
				Static206.aClass1_Sub3_Sub24_7 = new Class1_Sub3_Sub24();
			}
			Static43.aFloat12 = local53;
			Static149.anInt3346 = local36;
			Static214.aFloat45 = local59;
			Static275.anInt5495 = 0;
			Static280.aClass1_Sub3_Sub24_8 = local42;
			Static248.aFloat49 = local39;
			Static130.aFloat36 = local56;
			Static19.aFloat8 = local30;
			Static215.anInt4657 = local45;
			Static66.anInt4755 = local20;
			Static228.aFloat47 = local33;
		}
		if (Static275.anInt5495 < 65536) {
			Static275.anInt5495 += arg3 * 250;
			if (Static275.anInt5495 < 65536) {
				@Pc(177) int local177 = 65536 - Static275.anInt5495 >> 8;
				@Pc(184) float local184 = (float) (65536 - Static275.anInt5495) / 65536.0F;
				@Pc(188) int local188 = Static275.anInt5495 >> 8;
				Static247.anInt5031 = (local188 * (Static66.anInt4755 & 0xFF00FF) + local177 * (Static293.anInt5866 & 0xFF00FF) & 0xFF00FF00) + ((Static293.anInt5866 & 0xFF00) * local177 + local188 * (Static66.anInt4755 & 0xFF00) & 0xFF0000) >> 8;
				@Pc(224) float local224 = (float) Static275.anInt5495 / 65536.0F;
				Static261.aFloat51 = local224 * Static248.aFloat49 + local184 * Static78.aFloat20;
				Static147.aFloat37 = Static228.aFloat47 * local224 + local184 * Static69.aFloat17;
				Static250.anInt5102 = local188 * Static215.anInt4657 + local177 * Static279.anInt5617 >> 8;
				Static9.anInt279 = ((Static149.anInt3346 & 0xFF00FF) * local188 + (Static297.anInt5914 & 0xFF00FF) * local177 & 0xFF00FF00) + (local177 * (Static297.anInt5914 & 0xFF00) + (Static149.anInt3346 & 0xFF00) * local188 & 0xFF0000) >> 8;
				Static53.aFloat15 = local224 * Static130.aFloat36 + Static236.aFloat19 * local184;
				Static157.aFloat38 = Static214.aFloat45 * local224 + local184 * Static8.aFloat7;
				Static79.aFloat21 = Static43.aFloat12 * local224 + Static114.aFloat31 * local184;
				Static31.aFloat10 = local224 * Static19.aFloat8 + Static48.aFloat13 * local184;
				if (Static280.aClass1_Sub3_Sub24_8 != Static86.aClass1_Sub3_Sub24_4) {
					if (Static86.aClass1_Sub3_Sub24_4 == null || Static280.aClass1_Sub3_Sub24_8 == null) {
						Static244.aClass1_Sub3_Sub24_6 = null;
					} else {
						Static244.aClass1_Sub3_Sub24_6 = Static206.aClass1_Sub3_Sub24_7.method4655(Static86.aClass1_Sub3_Sub24_4, Static280.aClass1_Sub3_Sub24_8, (float) Static275.anInt5495 / 65536.0F);
					}
				}
			} else {
				Static250.anInt5102 = Static215.anInt4657;
				Static86.aClass1_Sub3_Sub24_4 = null;
				Static147.aFloat37 = Static228.aFloat47;
				Static157.aFloat38 = Static214.aFloat45;
				Static31.aFloat10 = Static19.aFloat8;
				Static244.aClass1_Sub3_Sub24_6 = Static280.aClass1_Sub3_Sub24_8;
				Static261.aFloat51 = Static248.aFloat49;
				Static247.anInt5031 = Static66.anInt4755;
				Static275.anInt5495 = 65536;
				Static53.aFloat15 = Static130.aFloat36;
				Static9.anInt279 = Static149.anInt3346;
				Static79.aFloat21 = Static43.aFloat12;
			}
		}
		return Static9.anInt279;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIB)I")
	public static int method3402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(16) int local16 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local16;
		}
		return arg0;
	}
}
