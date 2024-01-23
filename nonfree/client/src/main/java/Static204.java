import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!va", name = "w", descriptor = "Lclient!ob;")
	public static Class70 aClass70_17;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "I")
	public static int anInt4550;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "[Lclient!rh;")
	public static Class60_Sub1[] aClass60_Sub1Array1;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!i;")
	private static Class41 aClass41_1214 = Static184.method2923("Loading textures )2 ");

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_1215 = aClass41_1214;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!ca;")
	public static Class16 aClass16_10 = new Class16(30);

	@OriginalMember(owner = "client!va", name = "m", descriptor = "[B")
	public static byte[] aByteArray63 = new byte[520];

	@OriginalMember(owner = "client!va", name = "u", descriptor = "Lclient!i;")
	public static Class41 aClass41_1216 = Static184.method2923("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!ae;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_3 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!va", name = "y", descriptor = "Lclient!i;")
	private static Class41 aClass41_1217 = Static184.method2923("Please use a different world)3");

	@OriginalMember(owner = "client!va", name = "z", descriptor = "I")
	public static int anInt4551 = 7759444;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "Lclient!i;")
	public static Class41 aClass41_1218 = aClass41_1217;

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	public static int anInt4552 = 0;

	@OriginalMember(owner = "client!va", name = "D", descriptor = "Lclient!i;")
	public static Class41 aClass41_1219 = aClass41_1217;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIB)V")
	public static void method3145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static60.anInt4779 <= arg0 - arg1 && Static11.anInt385 >= arg1 + arg0 && arg2 - arg1 >= Static45.anInt1337 && Static17.anInt457 >= arg1 + arg2) {
			Static95.method1656(arg2, arg3, arg1, arg0);
		} else {
			Static42.method180(arg3, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static187.method2974(arg5)) {
			Static128.method2078(arg2, arg4, arg6, -1, arg1, Static68.aClass80ArrayArray1[arg5], arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII[I)V")
	public static void method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(8) int local8 = arg2 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg0 < local11) {
			@Pc(15) int local15 = arg0 + 1;
			arg3[local15] = arg1;
			@Pc(20) int local20 = local15 + 1;
			arg3[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg1;
			arg0 = local45 + 1;
			arg3[arg0] = arg1;
		}
		while (arg0 < local8) {
			arg0++;
			arg3[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!qg;IILclient!ea;)V")
	public static void method3148(@OriginalArg(0) Class83 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub3 arg2) {
		@Pc(9) Class2_Sub4 local9 = new Class2_Sub4();
		local9.anInt332 = arg2.method209();
		local9.anInt340 = arg2.method185();
		local9.anIntArray17 = new int[local9.anInt332];
		local9.aClass75Array2 = new Class75[local9.anInt332];
		local9.anIntArray16 = new int[local9.anInt332];
		local9.anIntArray18 = new int[local9.anInt332];
		local9.aByteArrayArrayArray3 = new byte[local9.anInt332][][];
		local9.aClass75Array1 = new Class75[local9.anInt332];
		for (@Pc(54) int local54 = 0; local54 < local9.anInt332; local54++) {
			try {
				@Pc(60) int local60 = arg2.method209();
				@Pc(89) String local89;
				@Pc(100) String local100;
				@Pc(104) int local104;
				if (local60 == 0 || local60 == 1 || local60 == 2) {
					local89 = new String(arg2.method160().method1402());
					local100 = new String(arg2.method160().method1402());
					local104 = 0;
					if (local60 == 1) {
						local104 = arg2.method185();
					}
					local9.anIntArray16[local54] = local60;
					local9.anIntArray17[local54] = local104;
					local9.aClass75Array2[local54] = arg0.method2622(local100, Static210.method3251(local89));
				} else if (local60 == 3 || local60 == 4) {
					local89 = new String(arg2.method160().method1402());
					local100 = new String(arg2.method160().method1402());
					local104 = arg2.method209();
					@Pc(107) String[] local107 = new String[local104];
					for (@Pc(109) int local109 = 0; local109 < local104; local109++) {
						local107[local109] = new String(arg2.method160().method1402());
					}
					@Pc(131) byte[][] local131 = new byte[local104][];
					@Pc(144) int local144;
					if (local60 == 3) {
						for (@Pc(138) int local138 = 0; local138 < local104; local138++) {
							local144 = arg2.method185();
							local131[local138] = new byte[local144];
							arg2.method169(local144, local131[local138]);
						}
					}
					local9.anIntArray16[local54] = local60;
					@Pc(173) Class[] local173 = new Class[local104];
					for (local144 = 0; local144 < local104; local144++) {
						local173[local144] = Static210.method3251(local107[local144]);
					}
					local9.aClass75Array1[local54] = arg0.method2625(local100, Static210.method3251(local89), local173);
					local9.aByteArrayArrayArray3[local54] = local131;
				}
			} catch (@Pc(262) ClassNotFoundException local262) {
				local9.anIntArray18[local54] = -1;
			} catch (@Pc(269) SecurityException local269) {
				local9.anIntArray18[local54] = -2;
			} catch (@Pc(276) NullPointerException local276) {
				local9.anIntArray18[local54] = -3;
			} catch (@Pc(283) Exception local283) {
				local9.anIntArray18[local54] = -4;
			} catch (@Pc(290) Throwable local290) {
				local9.anIntArray18[local54] = -5;
			}
		}
		Static78.aClass108_7.method3334(local9);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ[Lclient!q;)V")
	public static void method3149(@OriginalArg(0) int arg0, @OriginalArg(2) Class80[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) Class80 local18 = arg1[local12];
			if (local18 != null) {
				if (local18.anInt3640 == 0) {
					if (local18.aClass80Array1 != null) {
						method3149(arg0, local18.aClass80Array1);
					}
					@Pc(42) Class2_Sub21 local42 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local18.anInt3661);
					if (local42 != null) {
						Static122.method2038(local42.anInt3435, arg0);
					}
				}
				@Pc(61) Class2_Sub5 local61;
				if (arg0 == 0 && local18.anObjectArray11 != null) {
					local61 = new Class2_Sub5();
					local61.aClass80_3 = local18;
					local61.anObjectArray3 = local18.anObjectArray11;
					Static176.method2835(local61);
				}
				if (arg0 == 1 && local18.anObjectArray26 != null) {
					if (local18.anInt3649 >= 0) {
						@Pc(88) Class80 local88 = Static212.method3256(local18.anInt3661);
						if (local88 == null || local88.aClass80Array1 == null || local18.anInt3649 >= local88.aClass80Array1.length || local18 != local88.aClass80Array1[local18.anInt3649]) {
							continue;
						}
					}
					local61 = new Class2_Sub5();
					local61.aClass80_3 = local18;
					local61.anObjectArray3 = local18.anObjectArray26;
					Static176.method2835(local61);
				}
			}
		}
	}
}
