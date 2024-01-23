import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	public static int anInt890;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
	public static int[] anIntArray77 = new int[8];

	@OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
	public static int[] anIntArray78 = new int[2500];

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	public static int anInt894 = 0;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
	public static int[] anIntArray79 = new int[2048];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method815(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(39) int local39 = 0;
			@Pc(41) long local41 = arg0;
			while (local41 != 0L) {
				local41 /= 37L;
				local39++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local39);
			while (arg0 != 0L) {
				@Pc(65) long local65 = arg0;
				arg0 /= 37L;
				@Pc(79) char local79 = Static119.aCharArray11[(int) (local65 - arg0 * 37L)];
				if (local79 == '_') {
					local79 = ' ';
					@Pc(89) int local89 = local57.length() - 1;
					local57.setCharAt(local89, Character.toUpperCase(local57.charAt(local89)));
				}
				local57.append(local79);
			}
			local57.reverse();
			local57.setCharAt(0, Character.toUpperCase(local57.charAt(0)));
			return local57.toString();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public static void method816() {
		while (true) {
			if (Static237.aClass1_Sub14_Sub1_7.method2662(Static127.anInt2543) >= 27) {
				@Pc(16) int local16 = Static237.aClass1_Sub14_Sub1_7.method2657(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static265.aClass22_Sub3_Sub1Array1[local16] == null) {
						Static265.aClass22_Sub3_Sub1Array1[local16] = new Class22_Sub3_Sub1();
						local21 = true;
					}
					@Pc(39) Class22_Sub3_Sub1 local39 = Static265.aClass22_Sub3_Sub1Array1[local16];
					Static7.anIntArray12[Static105.anInt2015++] = local16;
					local39.anInt4614 = Static37.anInt757;
					if (local39.aClass112_1 != null && local39.aClass112_1.method2822()) {
						Static12.method177(local39);
					}
					local39.method3118(Static195.method3169(Static237.aClass1_Sub14_Sub1_7.method2657(14)));
					@Pc(77) int local77 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
					@Pc(82) int local82 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
					if (local82 == 1) {
						Static158.anIntArray179[Static17.anInt300++] = local16;
					}
					@Pc(102) int local102 = Static237.aClass1_Sub14_Sub1_7.method2657(5);
					@Pc(109) int local109 = Static224.anIntArray361[Static237.aClass1_Sub14_Sub1_7.method2657(3)];
					if (local102 > 15) {
						local102 -= 32;
					}
					if (local21) {
						local39.anInt4561 = local39.anInt4649 = local109;
					}
					@Pc(128) int local128 = Static237.aClass1_Sub14_Sub1_7.method2657(5);
					if (local128 > 15) {
						local128 -= 32;
					}
					local39.method3654(local39.aClass112_1.anInt3495);
					local39.anInt4611 = local39.aClass112_1.anInt3493;
					if (local39.anInt4611 == 0) {
						local39.anInt4649 = 0;
					}
					local39.anInt4646 = local39.aClass112_1.anInt3528;
					local39.method3650(Static229.aClass22_Sub3_Sub2_2.anIntArray427[0] + local128, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0] - -local102, local39.method3660(), local77 == 1);
					if (local39.aClass112_1.method2822()) {
						Static277.method4118(local39.anIntArray427[0], local39, Static295.anInt5586, local39.anIntArray424[0], 0, null, 0, null);
					}
					continue;
				}
			}
			Static237.aClass1_Sub14_Sub1_7.method2663();
			return;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIZII)V")
	public static void method817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static312.anInt5850 && arg1 <= Static214.anInt4216 && arg2 >= Static240.anInt1319 && Static59.anInt1155 >= arg3) {
			Static315.method4657(arg0, arg1, arg3, arg2, arg4);
		} else {
			Static280.method4154(arg0, arg2, arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V")
	public static void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		Static142.method2263(0, arg2, arg4, arg6, arg0, arg3, arg1, arg5);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lclient!pj;")
	public static Class139 method823(@OriginalArg(1) int arg0) {
		@Pc(10) Class139 local10 = (Class139) Static187.aClass169_106.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static124.aClass138_39.method3346(29, arg0);
		local10 = new Class139();
		if (local21 != null) {
			local10.method3389(arg0, new Class1_Sub14(local21));
		}
		Static187.aClass169_106.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Lclient!be;")
	public static Class1_Sub1_Sub2 method824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1_Sub2 local15 = (Class1_Sub1_Sub2) Static29.aClass156_1.method3821((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class1_Sub1_Sub2(arg0, arg1);
			Static29.aClass156_1.method3816(local15.aLong223, local15);
		}
		return local15;
	}
}
