import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "Lclient!df;")
	public static Class1_Sub3_Sub2 aClass1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	public static int anInt3230 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
	public static int anInt3233 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
	public static int anInt3237 = 0;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString93 = " from your ignore list first.";

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString94 = "Choose Option";

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)I")
	public static int method2520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static292.method4780(arg0 + 45365, 4, arg1 + 91923) + (Static292.method4780(arg0 + 10294, 2, arg1 - -37821) + -128 >> 1) + (Static292.method4780(arg0, 1, arg1) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I")
	public static int method2522() {
		return Static66.aBoolean191 && Static35.aBooleanArray2[81] && Static111.anInt2398 > 2 ? Static153.anIntArray326[Static111.anInt2398 - 2] : Static153.anIntArray326[Static111.anInt2398 - 1];
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BZ)V")
	public static void method2523(@OriginalArg(1) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static296.aBoolean335 && arg0) {
			local11 = Static209.aByteArrayArray104;
			local13 = 1;
		} else {
			local13 = 4;
			local11 = Static231.aByteArrayArray125;
		}
		@Pc(22) int local22 = local11.length;
		@Pc(24) int local24;
		@Pc(41) int local41;
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(29) int[] local29 = null;
			@Pc(35) int local35 = Static8.anIntArray449[local24] >> 8;
			local41 = Static8.anIntArray449[local24] & 0xFF;
			@Pc(48) int local48 = local35 * 64 - Static82.anInt1972;
			@Pc(54) int local54 = local41 * 64 - Static266.anInt5790;
			@Pc(58) byte[] local58 = local11[local24];
			if (local58 != null) {
				Static96.method1648();
				local29 = Static37.method867(Static82.anInt1972, arg0, local54, local58, local48, Static266.anInt5790, Static213.aClass36Array1);
			}
			if (!arg0 && local35 == Static238.anInt5219 / 8 && local41 == Static222.anInt4928 / 8) {
				if (local29 == null) {
					Static6.anInt2268 = -1;
				} else {
					Static62.anInt1583 = local29[2];
					Static6.anInt2268 = local29[0];
					Static254.anInt5397 = local29[1];
					Static271.anInt5843 = local29[4];
					Static3.anInt107 = local29[3];
				}
			}
		}
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(138) int local138 = (Static8.anIntArray449[local24] >> 8) * 64 - Static82.anInt1972;
			@Pc(148) int local148 = (Static8.anIntArray449[local24] & 0xFF) * 64 - Static266.anInt5790;
			@Pc(152) byte[] local152 = local11[local24];
			if (local152 == null && Static222.anInt4928 < 800) {
				Static96.method1648();
				for (local41 = 0; local41 < local13; local41++) {
					Static183.method3313(local148, local138, 64, local41, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB)V")
	public static void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 8) {
			arg1 = 4;
		}
		if (arg1 == 4 && !Static119.aBoolean141) {
			arg0 = 2;
			arg1 = 2;
		}
		if (Static28.anInt774 != arg1) {
			if (Static197.aBoolean238) {
				return;
			}
			if (Static28.anInt774 != 0) {
				Static207.anInterface1Array1[Static28.anInt774].method3559();
			}
			if (arg1 != 0) {
				@Pc(69) Interface1 local69 = Static207.anInterface1Array1[arg1];
				local69.method3557();
				local69.method3556(arg0);
			}
			Static226.anInt4960 = arg0;
			Static28.anInt774 = arg1;
		} else if (arg1 != 0 && Static226.anInt4960 != arg0) {
			Static207.anInterface1Array1[arg1].method3556(arg0);
			Static226.anInt4960 = arg0;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method2525(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < Static180.anInt4068; local12++) {
			if (arg0.equalsIgnoreCase(Static78.aStringArray6[local12])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static239.aClass25_Sub1_Sub1_2.aString26)) {
			return true;
		} else {
			return false;
		}
	}
}
