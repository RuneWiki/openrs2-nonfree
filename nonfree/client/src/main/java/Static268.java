import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!qj;")
	public static Class165 aClass165_79;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	public static int anInt5165;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
	public static int[] anIntArray652;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!pr;")
	public static Class158 aClass158_3;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	public static int anInt5167;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Z")
	public static boolean aBoolean429 = true;

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	public static int anInt5172 = 0;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
	public static final int[] anIntArray653 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I")
	public static int method4677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg3 < 0 || Static48.anInt1107 - 1 <= arg1 || arg3 >= Static337.anInt6402 - 1) {
			return;
		}
		if (Static138.aClass204ArrayArrayArray1 == null) {
			return;
		}
		@Pc(36) Interface8 local36;
		if (arg5 == 0) {
			local36 = (Interface8) Static264.method4812(arg4, arg1, arg3);
			@Pc(42) Interface8 local42 = (Interface8) Static72.method1423(arg4, arg1, arg3);
			if (local36 != null && arg2 != 2) {
				if (local36 instanceof Class5_Sub1_Sub2) {
					((Class5_Sub1_Sub2) local36).aClass146_3.method3983(arg0);
				} else {
					Static206.method3826(arg1, local36.method5697(), arg0, arg3, arg6, arg5, arg2, arg4);
				}
			}
			if (local42 != null) {
				if (!(local42 instanceof Class5_Sub1_Sub2)) {
					Static206.method3826(arg1, local42.method5697(), arg0, arg3, arg6, arg5, arg2, arg4);
					return;
				}
				((Class5_Sub1_Sub2) local42).aClass146_3.method3983(arg0);
				return;
			}
			return;
		}
		if (arg5 != 1) {
			if (arg5 == 2) {
				local36 = (Interface8) Static66.method1372(arg4, arg1, arg3, tr.class);
				if (local36 == null) {
					return;
				}
				if (arg2 == 11) {
					arg2 = 10;
				}
				if (!(local36 instanceof Class5_Sub3_Sub5)) {
					Static206.method3826(arg1, local36.method5697(), arg0, arg3, arg6, arg5, arg2, arg4);
					return;
				}
				((Class5_Sub3_Sub5) local36).aClass146_2.method3983(arg0);
			} else if (arg5 == 3) {
				local36 = (Interface8) Static331.method5551(arg4, arg1, arg3);
				if (local36 != null) {
					if (local36 instanceof Class5_Sub5_Sub2) {
						((Class5_Sub5_Sub2) local36).aClass146_4.method3983(arg0);
						return;
					}
					Static206.method3826(arg1, local36.method5697(), arg0, arg3, arg6, arg5, arg2, arg4);
					return;
				}
			}
			return;
		}
		local36 = (Interface8) Static57.method1233(arg4, arg1, arg3);
		if (local36 == null) {
			return;
		}
		if (!(local36 instanceof Class5_Sub4_Sub2)) {
			@Pc(202) int local202 = local36.method5697();
			if (arg2 != 4 && arg2 != 5) {
				if (arg2 != 6) {
					if (arg2 == 7) {
						Static206.method3826(arg1, local202, arg0, arg3, (arg6 + 2 & 0x3) + 4, arg5, 4, arg4);
					} else if (arg2 == 8) {
						Static206.method3826(arg1, local202, arg0, arg3, arg6 + 4, arg5, 4, arg4);
						Static206.method3826(arg1, local202, arg0, arg3, (arg6 + 2 & 0x3) + 4, arg5, 4, arg4);
						return;
					}
					return;
				}
				Static206.method3826(arg1, local202, arg0, arg3, arg6 + 4, arg5, 4, arg4);
				return;
			}
			Static206.method3826(arg1, local202, arg0, arg3, arg6, arg5, 4, arg4);
			return;
		}
		((Class5_Sub4_Sub2) local36).aClass146_1.method3983(arg0);
		return;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public static void method4679() {
		for (@Pc(11) int local11 = -1; local11 < Static334.anInt6370; local11++) {
			@Pc(21) int local21;
			if (local11 == -1) {
				local21 = 2047;
			} else {
				local21 = Static123.anIntArray290[local11];
			}
			@Pc(29) Class5_Sub3_Sub3_Sub1 local29 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local21];
			if (local29 != null) {
				Static172.method5112(local29, local29.method4541());
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([III)[I")
	public static int[] method4680(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[1152];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 32; local20++) {
			for (@Pc(24) int local24 = 0; local24 < 36; local24++) {
				@Pc(30) int local30 = arg0[local18];
				if (local30 == 0) {
					if (local24 > 0 && arg0[local18 - 1] != 0) {
						local30 = arg1;
					} else if (local20 > 0 && arg0[local18 - 36] != 0) {
						local30 = arg1;
					} else if (local24 < 35 && arg0[local18 + 1] != 0) {
						local30 = arg1;
					} else if (local20 < 31 && arg0[local18 + 36] != 0) {
						local30 = arg1;
					}
				}
				local8[local18++] = local30;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
	public static void method4681() {
		@Pc(3) Class175[] local3 = Class123.aClass175Array1;
		synchronized (Class123.aClass175Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class123.aClass175Array1.length; local7++) {
				Class123.aClass175Array1[local7] = new Class175();
				Static341.anIntArray281[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Z")
	public static boolean method4682() {
		return Static3.anInt77 == 0 ? Static121.aClass1_Sub6_Sub1_2.method573() : true;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
	public static void method4683() {
		for (@Pc(1) int local1 = 0; local1 < Static10.anInt234; local1++) {
			@Pc(6) Class5_Sub3 local6 = Static184.aClass5_Sub3Array3[local1];
			Static248.method4430(local6);
			Static184.aClass5_Sub3Array3[local1] = null;
		}
		Static10.anInt234 = 0;
	}
}
