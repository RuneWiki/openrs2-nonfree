import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Lclient!db;")
	public static Class31 aClass31_12 = new Class31(16);

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString35 = "Close";

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
	public static int[] anIntArray148 = new int[500];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method1055() {
		Static110.aClass31_18.method855();
		Static12.aClass31_2.method855();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIILclient!da;B)V")
	public static void method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub6 arg4) {
		if (arg4.anInt1048 == -1 && arg4.anIntArray134 == null) {
			return;
		}
		@Pc(21) int local21 = 0;
		@Pc(28) int local28 = Static267.anInt5346 * arg4.anInt1046 >> 8;
		if (arg0 > arg4.anInt1031) {
			local21 = arg0 - arg4.anInt1031;
		} else if (arg4.anInt1045 > arg0) {
			local21 = arg4.anInt1045 - arg0;
		}
		if (arg2 > arg4.anInt1039) {
			local21 += arg2 - arg4.anInt1039;
		} else if (arg4.anInt1041 > arg2) {
			local21 += arg4.anInt1041 - arg2;
		}
		if (arg4.anInt1047 == 0 || local21 - 64 > arg4.anInt1047 || Static267.anInt5346 == 0 || arg1 != arg4.anInt1044) {
			if (arg4.aClass1_Sub8_Sub1_1 != null) {
				Static28.aClass1_Sub8_Sub3_1.method2409(arg4.aClass1_Sub8_Sub1_1);
				arg4.aClass1_Sub8_Sub1_1 = null;
			}
			if (arg4.aClass1_Sub8_Sub1_2 != null) {
				Static28.aClass1_Sub8_Sub3_1.method2409(arg4.aClass1_Sub8_Sub1_2);
				arg4.aClass1_Sub8_Sub1_2 = null;
			}
			return;
		}
		local21 -= 64;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(159) int local159 = (arg4.anInt1047 - local21) * local28 / arg4.anInt1047;
		if (arg4.aClass1_Sub8_Sub1_1 != null) {
			arg4.aClass1_Sub8_Sub1_1.method1260(local159);
		} else if (arg4.anInt1048 >= 0) {
			@Pc(175) Class44 local175 = Static302.method1045(Static60.aClass7_60, arg4.anInt1048, 0);
			if (local175 != null) {
				@Pc(183) Class1_Sub22_Sub1 local183 = local175.method1046().method2959(Static61.aClass151_1);
				@Pc(188) Class1_Sub8_Sub1 local188 = Static305.method1224(local183, local159);
				local188.method1252(-1);
				Static28.aClass1_Sub8_Sub3_1.method2410(local188);
				arg4.aClass1_Sub8_Sub1_1 = local188;
			}
		}
		if (arg4.aClass1_Sub8_Sub1_2 != null) {
			arg4.aClass1_Sub8_Sub1_2.method1260(local159);
			if (!arg4.aClass1_Sub8_Sub1_2.method4536()) {
				arg4.aClass1_Sub8_Sub1_2 = null;
			}
		} else if (arg4.anIntArray134 != null && (arg4.anInt1049 -= arg3) <= 0) {
			@Pc(228) int local228 = (int) (Math.random() * (double) arg4.anIntArray134.length);
			@Pc(236) Class44 local236 = Static302.method1045(Static60.aClass7_60, arg4.anIntArray134[local228], 0);
			if (local236 != null) {
				@Pc(244) Class1_Sub22_Sub1 local244 = local236.method1046().method2959(Static61.aClass151_1);
				@Pc(249) Class1_Sub8_Sub1 local249 = Static305.method1224(local244, local159);
				local249.method1252(0);
				Static28.aClass1_Sub8_Sub3_1.method2410(local249);
				arg4.anInt1049 = (int) ((double) (arg4.anInt1037 - arg4.anInt1040) * Math.random()) + arg4.anInt1040;
				arg4.aClass1_Sub8_Sub1_2 = local249;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ak;)I")
	public static int method1057(@OriginalArg(1) Class7 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method242(Static279.anInt5595)) {
			local10++;
		}
		if (arg0.method242(Static17.anInt406)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method1058() {
		Static113.aClass69_11 = new Class69();
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)Z")
	public static boolean method1059() {
		@Pc(12) Class163 local12 = Static18.aClass163_1;
		synchronized (Static18.aClass163_1) {
			if (Static81.anInt1616 == Static203.anInt4009) {
				return false;
			} else {
				Static133.anInt2534 = Static217.anIntArray513[Static81.anInt1616];
				Static65.aChar1 = Static101.aCharArray7[Static81.anInt1616];
				Static81.anInt1616 = Static81.anInt1616 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public static void method1060(@OriginalArg(0) int arg0) {
		Static37.aFloatArray23[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static37.aFloatArray23[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static37.aFloatArray23[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static274.method4188(3);
		Static274.method4188(4);
	}
}
