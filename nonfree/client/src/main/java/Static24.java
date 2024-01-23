import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Z")
	public static boolean aBoolean35;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "[I")
	public static int[] anIntArray56;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!ta;")
	public static Class162 aClass162_1 = new Class162(16);

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	public static int anInt662 = 0;

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "Lclient!ta;")
	public static Class162 aClass162_2 = new Class162(64);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!jn;IILclient!mf;I)V")
	public static void method509(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class107 arg2, @OriginalArg(4) int arg3) {
		@Pc(26) int local26;
		if (arg2.anIntArray339 != null) {
			@Pc(19) boolean local19 = false;
			@Pc(24) int[] local24 = new int[arg2.anIntArray339.length];
			for (local26 = 0; local26 < local24.length / 2; local26++) {
				@Pc(42) int local42 = arg2.anIntArray339[local26 * 2] + arg0.anInt3107;
				@Pc(55) int local55 = arg0.anInt3102 - arg2.anIntArray339[local26 * 2 + 1];
				@Pc(78) int local78 = local24[local26 * 2] = Static268.anInt2662 + (local42 - Static268.anInt2661) * (Static268.anInt2665 - Static268.anInt2662) / (Static268.anInt2663 - Static268.anInt2661);
				@Pc(102) int local102 = local24[local26 * 2 + 1] = Static268.anInt2666 + (local55 - Static268.anInt2667) * (Static268.anInt2668 - Static268.anInt2666) / (Static268.anInt2664 - Static268.anInt2667);
				if (local78 > Static268.anInt2662 && local78 < Static268.anInt2665 && Static268.anInt2666 < local102 && local102 < Static268.anInt2668) {
					local19 = true;
				}
			}
			if (!local19) {
				return;
			}
			Static152.method2461(local24, arg2.anInt3788, arg2.anInt3788 >>> 24);
			for (local26 = 0; local26 < local24.length / 2 - 1; local26++) {
				Static231.method3637(local24[local26 * 2], local24[local26 * 2 + 1], local24[local26 * 2 + 2], local24[local26 * 2 + 3], arg2.anInt3765, arg2.anInt3765 >>> 24);
			}
			Static231.method3637(local24[local24.length - 2], local24[local24.length - 1], local24[0], local24[1], arg2.anInt3765, arg2.anInt3765 >>> 24);
		} else if (arg0.aBoolean189) {
			return;
		}
		@Pc(216) Class1_Sub31 local216 = new Class1_Sub31(arg0);
		@Pc(218) Class46_Sub1 local218 = null;
		if (arg2.anInt3781 != -1) {
			if (arg0.aBoolean192 && arg2.anInt3791 != -1) {
				local218 = (Class46_Sub1) arg2.method2740(true, true);
			} else {
				local218 = (Class46_Sub1) arg2.method2740(false, true);
			}
			if (local218 != null) {
				if (Static11.anInt308 > 0 && (Static186.anInt4091 != -1 && Static186.anInt4091 == arg0.anInt3104 || Static170.anInt3807 != -1 && arg2.anInt3787 == Static170.anInt3807)) {
					if (Static48.anInt1149 <= 50) {
						local26 = Static48.anInt1149 * 3;
					} else {
						local26 = 300 - Static48.anInt1149 * 3;
					}
					Static231.method3635(arg0.anInt3106, arg0.anInt3109, local218.anInt4753 / 2 + 7, 16776960, local26);
					Static231.method3635(arg0.anInt3106, arg0.anInt3109, local218.anInt4753 / 2 + 5, 16776960, local26);
					Static231.method3635(arg0.anInt3106, arg0.anInt3109, local218.anInt4753 / 2 + 3, 16776960, local26);
					Static231.method3635(arg0.anInt3106, arg0.anInt3109, local218.anInt4753 / 2 + 1, 16776960, local26);
					Static231.method3635(arg0.anInt3106, arg0.anInt3109, local218.anInt4753 / 2, 16776960, local26);
				}
				local218.method3523(arg0.anInt3106 - (local218.anInt4753 >> 1), arg0.anInt3109 - (local218.anInt4751 >> 1));
				local216.anInt6193 = arg3 + arg0.anInt3106 - (local218.anInt4753 >> 1);
				local216.anInt6191 = (local218.anInt4753 >> 1) + arg3 + arg0.anInt3106;
				local216.anInt6192 = arg1 + arg0.anInt3109 - (local218.anInt4751 >> 1);
				local216.anInt6186 = (local218.anInt4751 >> 1) + arg1 + arg0.anInt3109;
			}
		}
		if (arg2.aString237 != null) {
			if (local218 == null) {
				Static64.method1135(arg0, local216, true, arg1, arg3, arg2, 0);
			} else {
				Static64.method1135(arg0, local216, false, arg1, arg3, arg2, (local218.anInt4751 >> 1) + 5);
			}
		}
		if (local216.method4685(Static89.anInt5974, Static289.anInt5816) && arg2.aStringArray32 != null) {
			if (arg2.aStringArray32[4] != null) {
				Static12.method2960(0, -1, (long) arg0.anInt3104, arg2.aString238, arg2.anInt3787, arg2.aStringArray32[4], (short) 1011);
			}
			if (arg2.aStringArray32[3] != null) {
				Static12.method2960(0, -1, (long) arg0.anInt3104, arg2.aString238, arg2.anInt3787, arg2.aStringArray32[3], (short) 1012);
			}
			if (arg2.aStringArray32[2] != null) {
				Static12.method2960(0, -1, (long) arg0.anInt3104, arg2.aString238, arg2.anInt3787, arg2.aStringArray32[2], (short) 1007);
			}
			if (arg2.aStringArray32[1] != null) {
				Static12.method2960(0, -1, (long) arg0.anInt3104, arg2.aString238, arg2.anInt3787, arg2.aStringArray32[1], (short) 1006);
			}
			if (arg2.aStringArray32[0] != null) {
				Static12.method2960(0, -1, (long) arg0.anInt3104, arg2.aString238, arg2.anInt3787, arg2.aStringArray32[0], (short) 1002);
			}
		}
		Static315.aClass26_62.method668(local216);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!na;B)V")
	public static void method510(@OriginalArg(0) Class112 arg0) {
		@Pc(7) Class5 local7 = null;
		try {
			@Pc(12) Class47 local12 = arg0.method2899("runescape");
			while (local12.anInt1417 == 0) {
				Static312.method4734(1L);
			}
			if (local12.anInt1417 == 1) {
				local7 = (Class5) local12.anObject2;
				@Pc(33) Class1_Sub14 local33 = Static262.method4002();
				local7.method212(local33.anInt3000, local33.aByteArray55, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local7 != null) {
				local7.method209();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method511(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
