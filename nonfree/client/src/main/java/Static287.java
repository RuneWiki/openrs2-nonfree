import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "S")
	public static short aShort82 = 256;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
	public static int anInt5281 = 0;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBI)Z")
	public static boolean method4361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZI)Z")
	public static boolean method4362(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static554.aClass90_12.method7496();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static554.aClass90_12.method7514();
		} else if (!Static554.aClass90_12.method7479()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static58.aClass6_Sub17_Sub1_1.aBoolean603 = arg0;
			Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
			return true;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	public static void method4363() {
		Static363.aClass330_41.method7688();
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IB)I")
	public static int method4364(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static15.method196(arg0);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILclient!faa;)Ljava/lang/String;")
	public static String method4365(@OriginalArg(0) int arg0, @OriginalArg(2) Class97 arg1) {
		if (!Static74.method1044(arg1).method5833(arg0) && arg1.anObjectArray2 == null) {
			return null;
		} else if (arg1.aStringArray11 == null || arg0 >= arg1.aStringArray11.length || arg1.aStringArray11[arg0] == null || arg1.aStringArray11[arg0].trim().length() == 0) {
			return Static37.aBoolean48 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray11[arg0];
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZIII)Lclient!sba;")
	public static Class6_Sub43 method4366(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class6_Sub43 local7 = new Class6_Sub43();
		local7.anInt8194 = arg2;
		local7.anInt8192 = arg3;
		Static162.aClass234_23.method5466((long) arg0, local7);
		Static586.method7962(arg3);
		@Pc(31) Class97 local31 = Static495.method7281(arg0);
		if (local31 != null) {
			Static479.method6666(local31);
		}
		if (Static200.aClass97_11 != null) {
			Static479.method6666(Static200.aClass97_11);
			Static200.aClass97_11 = null;
		}
		Static94.method5251();
		if (local31 != null) {
			Static465.method6499(local31, !arg1);
		}
		if (!arg1) {
			Static199.method3320(arg3);
		}
		if (!arg1 && Static152.anInt1936 != -1) {
			Static398.method5756(Static152.anInt1936, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V")
	public static void method4367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(15, 0);
		local8.method3256();
		local8.anInt3739 = arg0;
		local8.anInt3740 = arg1;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BIIII)V")
	public static void method4369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class6_Sub34 local10 = (Class6_Sub34) Static315.aClass298_124.method6809(); local10 != null; local10 = (Class6_Sub34) Static315.aClass298_124.method6821()) {
			Static477.method6610(arg2, arg3, local10, arg0, arg1);
		}
		for (@Pc(31) Class6_Sub34 local31 = (Class6_Sub34) Static377.aClass298_144.method6809(); local31 != null; local31 = (Class6_Sub34) Static377.aClass298_144.method6821()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class154 local40 = local31.aClass15_Sub2_Sub4_Sub1_1.method7131();
			if (local31.aClass15_Sub2_Sub4_Sub1_1.aBoolean579) {
				local35 = 0;
			} else if (local40.anInt4538 == local31.aClass15_Sub2_Sub4_Sub1_1.anInt8985 || local40.anInt4524 == local31.aClass15_Sub2_Sub4_Sub1_1.anInt8985 || local40.anInt4516 == local31.aClass15_Sub2_Sub4_Sub1_1.anInt8985 || local40.anInt4507 == local31.aClass15_Sub2_Sub4_Sub1_1.anInt8985) {
				local35 = 2;
			} else if (local31.aClass15_Sub2_Sub4_Sub1_1.anInt8985 == local40.anInt4523 || local31.aClass15_Sub2_Sub4_Sub1_1.anInt8985 == local40.anInt4506 || local40.anInt4531 == local31.aClass15_Sub2_Sub4_Sub1_1.anInt8985 || local40.anInt4519 == local31.aClass15_Sub2_Sub4_Sub1_1.anInt8985) {
				local35 = 3;
			}
			if (local35 != local31.anInt6885) {
				@Pc(119) int local119 = Static276.method4135(local31.aClass15_Sub2_Sub4_Sub1_1);
				@Pc(123) Class88 local123 = local31.aClass15_Sub2_Sub4_Sub1_1.aClass88_1;
				if (local123.anIntArray182 != null) {
					local123 = local123.method1940(Static65.aClass51_1);
				}
				if (local123 == null || local119 == -1) {
					local31.anInt6877 = -1;
					local31.aBoolean473 = false;
				} else if (local31.anInt6877 != local119 || local123.aBoolean147 != local31.aBoolean473) {
					if (local31.aClass6_Sub15_Sub2_3 != null) {
						Static204.aClass6_Sub15_Sub1_1.method2421(local31.aClass6_Sub15_Sub2_3);
						local31.aClass6_Sub15_Sub2_3 = null;
					}
					local31.aClass6_Sub6_Sub1_4 = null;
					local31.aClass6_Sub23_2 = null;
					local31.anInt6877 = local119;
					local31.aBoolean473 = local123.aBoolean147;
				}
				local31.anInt6885 = local35;
			}
			local31.anInt6879 = local31.aClass15_Sub2_Sub4_Sub1_1.anInt8911;
			local31.anInt6880 = local31.aClass15_Sub2_Sub4_Sub1_1.anInt8911 + (local31.aClass15_Sub2_Sub4_Sub1_1.method7135() << 8);
			local31.anInt6886 = local31.aClass15_Sub2_Sub4_Sub1_1.anInt8913;
			local31.anInt6875 = local31.aClass15_Sub2_Sub4_Sub1_1.anInt8913 + (local31.aClass15_Sub2_Sub4_Sub1_1.method7135() << 8);
			Static477.method6610(arg2, arg3, local31, arg0, arg1);
		}
		for (@Pc(248) Class6_Sub34 local248 = (Class6_Sub34) Static149.aClass234_31.method5469(); local248 != null; local248 = (Class6_Sub34) Static149.aClass234_31.method5465()) {
			@Pc(252) byte local252 = 1;
			@Pc(257) Class154 local257 = local248.aClass15_Sub2_Sub4_Sub2_1.method7131();
			if (local248.aClass15_Sub2_Sub4_Sub2_1.aBoolean579) {
				local252 = 0;
			} else if (local257.anInt4538 == local248.aClass15_Sub2_Sub4_Sub2_1.anInt8985 || local257.anInt4524 == local248.aClass15_Sub2_Sub4_Sub2_1.anInt8985 || local248.aClass15_Sub2_Sub4_Sub2_1.anInt8985 == local257.anInt4516 || local248.aClass15_Sub2_Sub4_Sub2_1.anInt8985 == local257.anInt4507) {
				local252 = 2;
			} else if (local257.anInt4523 == local248.aClass15_Sub2_Sub4_Sub2_1.anInt8985 || local248.aClass15_Sub2_Sub4_Sub2_1.anInt8985 == local257.anInt4506 || local257.anInt4531 == local248.aClass15_Sub2_Sub4_Sub2_1.anInt8985 || local257.anInt4519 == local248.aClass15_Sub2_Sub4_Sub2_1.anInt8985) {
				local252 = 3;
			}
			if (local252 != local248.anInt6885) {
				@Pc(344) int local344 = Static69.method979(local248.aClass15_Sub2_Sub4_Sub2_1);
				if (local248.anInt6877 != local344 || local248.aClass15_Sub2_Sub4_Sub2_1.aBoolean583 != local248.aBoolean473) {
					if (local248.aClass6_Sub15_Sub2_3 != null) {
						Static204.aClass6_Sub15_Sub1_1.method2421(local248.aClass6_Sub15_Sub2_3);
						local248.aClass6_Sub15_Sub2_3 = null;
					}
					local248.aBoolean473 = local248.aClass15_Sub2_Sub4_Sub2_1.aBoolean583;
					local248.aClass6_Sub23_2 = null;
					local248.aClass6_Sub6_Sub1_4 = null;
					local248.anInt6877 = local344;
				}
				local248.anInt6885 = local252;
			}
			local248.anInt6879 = local248.aClass15_Sub2_Sub4_Sub2_1.anInt8911;
			local248.anInt6880 = local248.aClass15_Sub2_Sub4_Sub2_1.anInt8911 + (local248.aClass15_Sub2_Sub4_Sub2_1.method7135() << 8);
			local248.anInt6886 = local248.aClass15_Sub2_Sub4_Sub2_1.anInt8913;
			local248.anInt6875 = local248.aClass15_Sub2_Sub4_Sub2_1.anInt8913 + (local248.aClass15_Sub2_Sub4_Sub2_1.method7135() << 8);
			Static477.method6610(arg2, arg3, local248, arg0, arg1);
		}
	}
}
