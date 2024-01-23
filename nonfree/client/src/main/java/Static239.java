import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!pk;")
	public static Class132 aClass132_81;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	public static int anInt4789;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!gd;")
	public static Class61 aClass61_45 = new Class61(2);

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	public static int anInt4788 = 0;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method3608() {
		Static17.anInt477 = 0;
		Static188.anInt3774 = -1;
		Static147.aBoolean246 = false;
		Static185.anInt3679 = 0;
		Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
		Static147.anInt2993 = 0;
		Static242.anInt4842 = 0;
		Static68.anInt1687 = 0;
		Static173.anInt3442 = -1;
		Static277.anInt5667 = -1;
		Static292.anInt5659 = 0;
		Static93.anInt1952 = -1;
		Static275.aClass8_Sub2_Sub1_6.anInt2955 = 0;
		@Pc(35) int local35;
		for (local35 = 0; local35 < Static230.aClass36_Sub3_Sub1Array1.length; local35++) {
			if (Static230.aClass36_Sub3_Sub1Array1[local35] != null) {
				Static230.aClass36_Sub3_Sub1Array1[local35].anInt4139 = -1;
			}
		}
		for (local35 = 0; local35 < Static48.aClass36_Sub3_Sub2Array1.length; local35++) {
			if (Static48.aClass36_Sub3_Sub2Array1[local35] != null) {
				Static48.aClass36_Sub3_Sub2Array1[local35].anInt4139 = -1;
			}
		}
		Static93.method1488();
		Static172.anInt3428 = 1;
		Static49.method774(30);
		for (local35 = 0; local35 < 100; local35++) {
			Static128.aBooleanArray7[local35] = true;
		}
		Static256.method3845();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLclient!nn;Lclient!nn;BZII)I")
	public static int method3609(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(2) Class13_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = Static285.method4242(arg0, arg2, arg4, arg1);
		if (local15 != 0) {
			return arg0 ? -local15 : local15;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static285.method4242(arg3, arg2, arg5, arg1);
			return arg3 ? -local39 : local39;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZII)V")
	public static void method3610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (Static116.aBoolean188) {
			@Pc(24) int local24 = arg2 - 334;
			if (local24 < 0) {
				local24 = 0;
			} else if (local24 > 100) {
				local24 = 100;
			}
			@Pc(47) int local47 = local24 * (Static2.aShort1 - Static83.aShort6) / 100 + Static83.aShort6;
			if (local47 < Static34.aShort4) {
				local47 = Static34.aShort4;
			} else if (Static74.aShort5 < local47) {
				local47 = Static74.aShort5;
			}
			@Pc(73) int local73 = arg2 * local47 * 512 / (arg1 * 334);
			@Pc(107) int local107;
			@Pc(114) int local114;
			@Pc(82) short local82;
			if (local73 < Static102.aShort16) {
				local82 = Static102.aShort16;
				local47 = arg1 * 334 * local82 / (arg2 * 512);
				if (Static74.aShort5 < local47) {
					local47 = Static74.aShort5;
					local107 = local47 * 512 * arg2 / (local82 * 334);
					local114 = (arg1 - local107) / 2;
					if (arg3) {
						Static126.method1999();
						Static126.method1994(arg4, arg0, local114, arg2, 0);
						Static126.method1994(arg1 + arg4 - local114, arg0, local114, arg2, 0);
					}
					arg4 += local114;
					arg1 -= local114 * 2;
				}
			} else if (Static101.aShort15 < local73) {
				local82 = Static101.aShort15;
				local47 = local82 * arg1 * 334 / (arg2 * 512);
				if (local47 < Static34.aShort4) {
					local47 = Static34.aShort4;
					local107 = arg1 * local82 * 334 / (local47 * 512);
					local114 = (arg2 - local107) / 2;
					if (arg3) {
						Static126.method1999();
						Static126.method1994(arg4, arg0, arg1, local114, 0);
						Static126.method1994(arg4, arg2 + arg0 - local114, arg1, local114, 0);
					}
					arg2 -= local114 * 2;
					arg0 += local114;
				}
			}
			Static36.anInt816 = arg2 * local47 / 334;
		}
		Static15.anInt403 = (short) arg2;
		Static51.anInt1121 = (short) arg1;
		Static76.anInt1637 = arg4;
		Static92.anInt1944 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILclient!ph;)V")
	public static void method3611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class36_Sub3_Sub2 arg2) {
		if (arg2.anInt4107 == arg1 && arg1 != -1) {
			@Pc(76) Class76 local76 = Static115.method1855(arg1);
			@Pc(79) int local79 = local76.anInt2220;
			if (local79 == 1) {
				arg2.anInt4113 = arg0;
				arg2.anInt4085 = 0;
				arg2.anInt4120 = 1;
				arg2.anInt4103 = 0;
				arg2.anInt4132 = 0;
				Static184.method2846(false, arg2.anInt4103, arg2.anInt4117, local76, arg2.anInt4118);
			}
			if (local79 == 2) {
				arg2.anInt4085 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt4107 == -1 || Static115.method1855(arg1).anInt2224 >= Static115.method1855(arg2.anInt4107).anInt2224) {
			arg2.anInt4103 = 0;
			arg2.anInt4090 = arg2.anInt4093;
			arg2.anInt4085 = 0;
			arg2.anInt4132 = 0;
			arg2.anInt4107 = arg1;
			arg2.anInt4113 = arg0;
			arg2.anInt4120 = 1;
			if (arg2.anInt4107 != -1) {
				Static184.method2846(false, arg2.anInt4103, arg2.anInt4117, Static115.method1855(arg2.anInt4107), arg2.anInt4118);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(CI)Z")
	public static boolean method3612(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
