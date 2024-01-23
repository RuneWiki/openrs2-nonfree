import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString219 = "green:";

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Z")
	public static boolean aBoolean181 = true;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public static int anInt3388 = -1;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILclient!ql;)Lclient!o;")
	public static Class1_Sub2_Sub11 method2545(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		@Pc(51) Class1_Sub2_Sub11 local51 = new Class1_Sub2_Sub11(arg0, arg1.method1774(), arg1.method1774(), arg1.method1802(), arg1.method1802(), arg1.method1772() == 1, arg1.method1772());
		@Pc(55) int local55 = arg1.method1772();
		for (@Pc(57) int local57 = 0; local57 < local55; local57++) {
			local51.aClass3_15.method28(new Class1_Sub8(arg1.method1772(), arg1.method1772(), arg1.method1764(), arg1.method1764(), arg1.method1764(), arg1.method1764(), arg1.method1764(), arg1.method1764(), arg1.method1764(), arg1.method1764()));
		}
		local51.method2859();
		return local51;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ql;I)Lclient!ka;")
	public static Class70 method2546(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(12) Class70 local12 = new Class70();
		local12.anInt3087 = arg0.method1764();
		local12.aClass1_Sub2_Sub12_1 = Static224.method3732(local12.anInt3087);
		return local12;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!hc;B)Z")
	public static boolean method2548(@OriginalArg(0) Class51 arg0) {
		return arg0.method1868(Static129.anInt3260);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZIILclient!hc;III)V")
	public static void method2549(@OriginalArg(3) Class51 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static54.anInt1501 = 0;
		Static39.aClass51_14 = arg0;
		Static194.anInt4334 = arg2;
		Static172.aBoolean196 = false;
		Static47.anInt1387 = arg1;
		Static143.anInt3473 = 1;
		Static77.anInt2101 = 2;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lclient!bg;")
	public static Class16 method2550(@OriginalArg(0) int arg0) {
		@Pc(10) Class16 local10 = (Class16) Static165.aClass79_24.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static178.aClass51_59.method1874(3, arg0);
		local10 = new Class16();
		if (local20 != null) {
			local10.method413(new Class1_Sub13(local20));
		}
		Static165.aClass79_24.method2486(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIZZILclient!nj;IZI)Lclient!ke;")
	public static Class1_Sub2_Sub4 method2551(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class94 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) int arg6) {
		@Pc(7) Class89 local7 = Static93.method2006(arg4);
		if (arg6 > 1 && local7.anIntArray273 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (arg6 >= local7.anIntArray272[local19] && local7.anIntArray272[local19] != 0) {
					local17 = local7.anIntArray273[local19];
				}
			}
			if (local17 != -1) {
				local7 = Static93.method2006(local17);
			}
		}
		@Pc(61) Class9_Sub5_Sub1 local61 = local7.method2730(arg3);
		if (local61 == null) {
			return null;
		}
		@Pc(67) Class1_Sub2_Sub4_Sub1 local67 = null;
		if (local7.anInt3680 != -1) {
			local67 = (Class1_Sub2_Sub4_Sub1) method2551(1, true, 0, arg3, local7.anInt3624, false, 10);
			if (local67 == null) {
				return null;
			}
		} else if (local7.anInt3628 != -1) {
			local67 = (Class1_Sub2_Sub4_Sub1) method2551(arg0, false, arg2, arg3, local7.anInt3649, false, arg6);
			if (local67 == null) {
				return null;
			}
		}
		@Pc(116) int[] local116 = Static189.anIntArray319;
		@Pc(118) int local118 = Static189.anInt4234;
		@Pc(121) int[] local121 = new int[4];
		@Pc(123) int local123 = Static189.anInt4230;
		Static189.method3195(local121);
		@Pc(131) Class1_Sub2_Sub4_Sub1 local131 = new Class1_Sub2_Sub4_Sub1(36, 32);
		Static189.method3199(local131.anIntArray94, 36, 32);
		Static235.method3902();
		Static235.method3900(16, 16);
		@Pc(143) int local143 = local7.anInt3672;
		if (arg1) {
			local143 = (int) ((double) local143 * 1.5D);
		} else if (arg0 == 2) {
			local143 = (int) ((double) local143 * 1.04D);
		}
		Static235.aBoolean260 = false;
		@Pc(173) int local173 = Class132.anIntArray440[local7.anInt3667] * local143 >> 16;
		@Pc(182) int local182 = Class132.anIntArray439[local7.anInt3667] * local143 >> 16;
		local61.method3604(local7.anInt3638, local7.anInt3683, local7.anInt3667, local7.anInt3666, local173 + local7.anInt3629 - local61.method3587() / 2, local182 - -local7.anInt3629, -1L);
		if (arg0 >= 1) {
			local131.method898(1);
			if (arg0 >= 2) {
				local131.method898(16777215);
			}
			Static189.method3199(local131.anIntArray94, 36, 32);
		}
		if (arg2 != 0) {
			local131.method903(arg2);
		}
		if (local7.anInt3680 != -1) {
			local67.method892(0, 0);
		} else if (local7.anInt3628 != -1) {
			Static189.method3199(local67.anIntArray94, 36, 32);
			local131.method892(0, 0);
			local131 = local67;
		}
		if (arg5 && (local7.anInt3650 == 1 || arg6 != 1) && arg6 != -1) {
			Static98.aClass1_Sub2_Sub7_Sub1_2.method1940(Static127.method2419(arg6), 0, 9, 16776960, 1);
		}
		Static189.method3199(local116, local118, local123);
		Static189.method3191(local121);
		Static235.method3902();
		Static235.aBoolean260 = true;
		return local131;
	}
}
