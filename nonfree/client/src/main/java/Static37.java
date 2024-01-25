import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array28;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public static int anInt1025;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!ok;")
	public static Class179 aClass179_1;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "S")
	public static short aShort35 = 256;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "Lclient!ab;")
	public static Class3_Sub1 aClass3_Sub1_2 = null;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;IIIIIIB)V")
	public static void method727(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class6_Sub4 local7 = new Class6_Sub4();
		local7.anInt4106 = arg3;
		local7.anInt4102 = arg4;
		local7.anInt4105 = arg2;
		local7.aString25 = arg0;
		local7.anInt4108 = arg6;
		local7.anInt4103 = arg1;
		local7.anInt4104 = Static253.anInt4787 + arg5;
		Static231.aClass138_2.method3307(local7);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIZB)Ljava/lang/String;")
	public static String method728(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(32) int local32 = 2;
		@Pc(48) int local48 = arg0 / 10;
		while (local48 != 0) {
			local48 /= 10;
			local32++;
		}
		@Pc(59) char[] local59 = new char[local32];
		local59[0] = '+';
		for (@Pc(67) int local67 = local32 - 1; local67 > 0; local67--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 >= 10) {
				local59[local67] = (char) (local81 + 87);
			} else {
				local59[local67] = (char) (local81 + 48);
			}
		}
		return new String(local59);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public static void method730() {
		Static166.aClass172_6.method5490(Static193.aFloat28, Static58.aFloat8, Static342.aFloat65);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public static void method731(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub4_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class159 local8 = Static26.aClass159Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < anInt1025; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static405.anInt6684; local15++) {
						local1 = local8.O(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static336.anInt5747;
							@Pc(32) int local32 = local12 << Static336.anInt5747;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class159 local41 = Static26.aClass159Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.I(local15, local12) - local41.I(local15, local12);
									@Pc(67) int local67 = local8.I(local15 + 1, local12) - local41.I(local15 + 1, local12);
									@Pc(85) int local85 = local8.I(local15 + 1, local12 + 1) - local41.I(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.I(local15, local12 + 1) - local41.I(local15, local12 + 1);
									local41.SA(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method732(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(6) int local6 = arg2.length();
		@Pc(9) int local9 = arg0.length();
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) char local15 = 0;
		@Pc(17) char local17 = 0;
		while (local11 - local15 < local6 || local9 > local13 - local17) {
			if (local6 <= local11 - local15) {
				return -1;
			}
			if (local13 - local17 >= local9) {
				return 1;
			}
			@Pc(58) char local58;
			if (local15 == '\u0000') {
				local58 = arg2.charAt(local11++);
			} else {
				local58 = local15;
			}
			@Pc(70) char local70;
			if (local17 == '\u0000') {
				local70 = arg0.charAt(local13++);
			} else {
				local70 = local17;
			}
			local15 = Static343.method4543(local58);
			local17 = Static343.method4543(local70);
			local58 = Static113.method4394(arg1, local58);
			local70 = Static113.method4394(arg1, local70);
			if (local70 != local58 && Character.toUpperCase(local58) != Character.toUpperCase(local70)) {
				local58 = Character.toLowerCase(local58);
				local70 = Character.toLowerCase(local70);
				if (local70 != local58) {
					return Static136.method2169(arg1, local58) - Static136.method2169(arg1, local70);
				}
			}
		}
		@Pc(128) int local128 = Math.min(local6, local9);
		for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
			if (arg1 == 2) {
				local13 = local9 - local130 - 1;
				local11 = local6 - local130 - 1;
			} else {
				local13 = local130;
				local11 = local130;
			}
			@Pc(158) char local158 = arg2.charAt(local11);
			@Pc(162) char local162 = arg0.charAt(local13);
			if (local158 != local162 && Character.toUpperCase(local158) != Character.toUpperCase(local162)) {
				local158 = Character.toLowerCase(local158);
				local162 = Character.toLowerCase(local162);
				if (local162 != local158) {
					return Static136.method2169(arg1, local158) - Static136.method2169(arg1, local162);
				}
			}
		}
		@Pc(206) int local206 = local6 - local9;
		if (local206 != 0) {
			return local206;
		}
		for (@Pc(217) int local217 = 0; local217 < local128; local217++) {
			@Pc(222) char local222 = arg2.charAt(local217);
			@Pc(226) char local226 = arg0.charAt(local217);
			if (local222 != local226) {
				return Static136.method2169(arg1, local222) - Static136.method2169(arg1, local226);
			}
		}
		return 0;
	}
}
