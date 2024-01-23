import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
	public static int anInt4909;

	@OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
	public static int anInt4914 = 500;

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
	public static int anInt4917 = -1;

	@OriginalMember(owner = "client!sm", name = "P", descriptor = "Z")
	public static boolean aBoolean395 = false;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ie;IIIIII)Lclient!ie;")
	public static Class36_Sub2 method3679(@OriginalArg(0) Class36_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) long local4 = (long) arg4;
		@Pc(14) Class36_Sub2 local14 = (Class36_Sub2) Static62.aClass61_48.method1384(local4);
		if (local14 == null) {
			@Pc(21) Class36_Sub7 local21 = Static281.method4202(Static28.aClass132_9, arg4);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method4193(64, 768, -50, -10, -50);
			Static62.aClass61_48.method1377(local4, local14);
		}
		@Pc(45) int local45 = arg0.method3948();
		@Pc(54) int local54 = arg0.method3947();
		@Pc(57) int local57 = arg0.method3964();
		@Pc(60) int local60 = arg0.method3951();
		local14 = local14.method3957(true, true, true);
		if (arg5 != 0) {
			local14.method3965(arg5);
		}
		@Pc(106) int local106;
		if (Static116.aBoolean188) {
			@Pc(76) Class36_Sub2_Sub1 local76 = (Class36_Sub2_Sub1) local14;
			if (Static59.method927(local45 + arg3, local57 + arg1, Static34.anInt770) != arg2 || arg2 != Static59.method927(local54 + arg3, local60 + arg1, Static34.anInt770)) {
				for (local106 = 0; local106 < local76.anInt4257; local106++) {
					local76.anIntArray324[local106] += Static59.method927(local76.anIntArray320[local106] + arg3, local76.anIntArray321[local106] + arg1, Static34.anInt770) - arg2;
				}
				local76.aClass176_2.aBoolean476 = false;
				local76.aClass63_1.aBoolean137 = false;
			}
		} else {
			@Pc(155) Class36_Sub2_Sub2 local155 = (Class36_Sub2_Sub2) local14;
			if (arg2 != Static59.method927(arg3 + local45, arg1 + local57, Static34.anInt770) || Static59.method927(arg3 + local54, local60 + arg1, Static34.anInt770) != arg2) {
				for (local106 = 0; local106 < local155.anInt5253; local106++) {
					local155.anIntArray427[local106] += Static59.method927(arg3 + local155.anIntArray430[local106], arg1 + local155.anIntArray426[local106], Static34.anInt770) - arg2;
				}
				local155.aBoolean437 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z[I[ILclient!ph;[I)V")
	public static void method3684(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class36_Sub3_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(22) int local22 = arg1[local7];
			@Pc(26) int local26 = arg3[local7];
			@Pc(30) int local30 = arg0[local7];
			@Pc(32) int local32 = 0;
			while (local22 != 0 && local32 < arg2.aClass83Array3.length) {
				if ((local22 & 0x1) != 0) {
					if (local26 == -1) {
						arg2.aClass83Array3[local32] = null;
					} else {
						@Pc(56) Class76 local56 = Static115.method1855(local26);
						@Pc(59) int local59 = local56.anInt2220;
						@Pc(64) Class83 local64 = arg2.aClass83Array3[local32];
						if (local64 != null) {
							if (local26 == local64.anInt2347) {
								if (local59 == 0) {
									local64 = arg2.aClass83Array3[local32] = null;
								} else if (local59 == 1) {
									local64.anInt2345 = 0;
									local64.anInt2341 = 0;
									local64.anInt2340 = 0;
									local64.anInt2344 = local30;
									local64.anInt2343 = 1;
									Static184.method2846(false, 0, arg2.anInt4117, local56, arg2.anInt4118);
								} else if (local59 == 2) {
									local64.anInt2345 = 0;
								}
							} else if (local56.anInt2224 >= Static115.method1855(local64.anInt2347).anInt2224) {
								local64 = arg2.aClass83Array3[local32] = null;
							}
						}
						if (local64 == null) {
							local64 = arg2.aClass83Array3[local32] = new Class83();
							local64.anInt2340 = 0;
							local64.anInt2347 = local26;
							local64.anInt2344 = local30;
							local64.anInt2341 = 0;
							local64.anInt2343 = 1;
							local64.anInt2345 = 0;
							Static184.method2846(false, 0, arg2.anInt4117, local56, arg2.anInt4118);
						}
					}
				}
				local32++;
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)I")
	public static int method3685() {
		return ((Static106.anInt2205 == 0 ? 0 : 1) << 22) + ((Static275.anInt5409 == 0 ? 0 : 1) << 21) + ((Static172.anInt3426 == 0 ? 0 : 1) << 20) + (Static279.anInt5448 << 17) + ((Static76.aBoolean117 ? 1 : 0) << 13) + ((Static150.aBoolean367 ? 1 : 0) << 10) + ((Static198.aBoolean317 ? 1 : 0) << 9) + ((Static214.aBoolean355 ? 1 : 0) << 6) + ((Static11.aBoolean244 ? 1 : 0) << 4) + ((Static23.aBoolean40 ? 1 : 0) << 3) + (Static54.anInt1180 & 0x7) + ((Static113.aBoolean182 ? 1 : 0) << 5) + ((Static153.aBoolean257 ? 1 : 0) << 7) + ((Static37.aBoolean314 ? 1 : 0) << 8) + ((Static270.anInt5337 & 0x3) << 11) + ((Static273.aBoolean455 ? 1 : 0) << 15) + ((Static35.aBoolean50 ? 1 : 0) << 16) + ((Static277.aBoolean477 ? 1 : 0) << 19) + (Static223.method3483() << 23);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method3686(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < Static173.anInt3444; local20++) {
			if (arg0.equalsIgnoreCase(Static47.aStringArray15[local20])) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Static21.aClass36_Sub3_Sub1_1.aString144)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;ZZI)Z")
	public static boolean method3691(@OriginalArg(0) String arg0) {
		@Pc(30) boolean local30 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg0.length();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			@Pc(55) char local55 = arg0.charAt(local44);
			if (local44 == 0) {
				if (local55 == '-') {
					local30 = true;
					continue;
				}
				if (local55 == '+') {
					continue;
				}
			}
			@Pc(99) int local99;
			if (local55 >= '0' && local55 <= '9') {
				local99 = local55 - '0';
			} else if (local55 >= 'A' && local55 <= 'Z') {
				local99 = local55 - '7';
			} else if (local55 >= 'a' && local55 <= 'z') {
				local99 = local55 - 'W';
			} else {
				return false;
			}
			if (local99 >= 10) {
				return false;
			}
			if (local30) {
				local99 = -local99;
			}
			@Pc(125) int local125 = local99 + local39 * 10;
			if (local125 / 10 != local39) {
				return false;
			}
			local37 = true;
			local39 = local125;
		}
		return local37;
	}
}
