import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[S")
	public static final short[] aShortArray103 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!u", name = "j", descriptor = "Lclient!js;")
	public static final Class11_Sub25_Sub1 aClass11_Sub25_Sub1_5 = new Class11_Sub25_Sub1(5000);

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_106 = new Class117("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!bj;")
	public static Class26 aClass26_56 = new Class26(64);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method5269() {
		for (@Pc(18) Class11_Sub4_Sub3 local18 = (Class11_Sub4_Sub3) Static325.aClass16_14.method193(); local18 != null; local18 = (Class11_Sub4_Sub3) Static325.aClass16_14.method188()) {
			@Pc(23) Class67_Sub3_Sub2 local23 = local18.aClass67_Sub3_Sub2_1;
			if (local23.aByte73 != Static322.anInt6250 || Static293.anInt5807 > local23.anInt2945) {
				local18.method5701();
				local23.method2494();
			} else if (local23.anInt2953 <= Static293.anInt5807) {
				if (local23.anInt2936 > 0) {
					@Pc(52) Class67_Sub3_Sub3_Sub1 local52 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local23.anInt2936 - 1];
					if (local52 != null && local52.anInt6308 >= 0 && Static24.anInt454 * 128 > local52.anInt6308 && local52.anInt6310 >= 0 && Static240.anInt4832 * 128 > local52.anInt6310) {
						local23.method2497(local52.anInt6308, Static168.method2721(local52.anInt6308, local23.aByte73, local52.anInt6310) - local23.anInt2958, local52.anInt6310, Static293.anInt5807);
					}
				}
				if (local23.anInt2936 < 0) {
					@Pc(103) int local103 = -local23.anInt2936 - 1;
					@Pc(110) Class67_Sub3_Sub3_Sub2 local110;
					if (Static256.anInt5197 == local103) {
						local110 = Static156.aClass67_Sub3_Sub3_Sub2_2;
					} else {
						local110 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local103];
					}
					if (local110 != null && local110.anInt6308 >= 0 && local110.anInt6308 < Static24.anInt454 * 128 && local110.anInt6310 >= 0 && local110.anInt6310 < Static240.anInt4832 * 128) {
						local23.method2497(local110.anInt6308, Static168.method2721(local110.anInt6308, local23.aByte73, local110.anInt6310) - local23.anInt2958, local110.anInt6310, Static293.anInt5807);
					}
				}
				local23.method2500(Static244.anInt4932);
				Static349.method5649(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(DZ)V")
	public static void method5270(@OriginalArg(0) double arg0) {
		if (Static172.aDouble9 == arg0) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = (int) (Math.pow((double) local19 / 255.0D, arg0) * 255.0D);
			Static212.anIntArray336[local19] = local31 > 255 ? 255 : local31;
		}
		Static172.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BIIIIII)Lclient!qe;")
	public static Class132 method5271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg4 * 475427L ^ (long) arg0 * 97549L ^ (long) arg5 * 67481L ^ (long) arg1 * 76724863L;
		@Pc(44) Class132 local44 = (Class132) Static226.aClass26_44.method332(local33);
		if (local44 == null) {
			local44 = Static85.aClass129_2.method5006(arg5, arg0, arg4, arg2, arg3, arg1);
			Static226.aClass26_44.method330(local33, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!ko;ZLclient!kh;)V")
	public static void method5272(@OriginalArg(0) int arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(3) Class11_Sub25 arg2) {
		@Pc(9) Class11_Sub35 local9 = new Class11_Sub35();
		local9.anInt5518 = arg2.method5185();
		local9.anInt5517 = arg2.method5198();
		local9.aByteArrayArrayArray10 = new byte[local9.anInt5518][][];
		local9.aClass2Array2 = new Class2[local9.anInt5518];
		local9.anIntArray421 = new int[local9.anInt5518];
		local9.anIntArray423 = new int[local9.anInt5518];
		local9.aClass2Array1 = new Class2[local9.anInt5518];
		local9.anIntArray420 = new int[local9.anInt5518];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt5518; local55++) {
			try {
				@Pc(61) int local61 = arg2.method5185();
				@Pc(75) String local75;
				@Pc(79) String local79;
				@Pc(81) int local81;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local75 = arg2.method5184();
					local79 = arg2.method5184();
					local81 = 0;
					if (local61 == 1) {
						local81 = arg2.method5198();
					}
					local9.anIntArray420[local55] = local61;
					local9.anIntArray421[local55] = local81;
					local9.aClass2Array1[local55] = arg1.method2711(local79, Static87.method1245(local75));
				} else if (local61 == 3 || local61 == 4) {
					local75 = arg2.method5184();
					local79 = arg2.method5184();
					local81 = arg2.method5185();
					@Pc(136) String[] local136 = new String[local81];
					for (@Pc(138) int local138 = 0; local138 < local81; local138++) {
						local136[local138] = arg2.method5184();
					}
					@Pc(153) byte[][] local153 = new byte[local81][];
					@Pc(164) int local164;
					if (local61 == 3) {
						for (@Pc(158) int local158 = 0; local158 < local81; local158++) {
							local164 = arg2.method5198();
							local153[local158] = new byte[local164];
							arg2.method5209(local153[local158], local164);
						}
					}
					local9.anIntArray420[local55] = local61;
					@Pc(189) Class[] local189 = new Class[local81];
					for (local164 = 0; local164 < local81; local164++) {
						local189[local164] = Static87.method1245(local136[local164]);
					}
					local9.aClass2Array2[local55] = arg1.method2703(Static87.method1245(local75), local189, local79);
					local9.aByteArrayArrayArray10[local55] = local153;
				}
			} catch (@Pc(228) ClassNotFoundException local228) {
				local9.anIntArray423[local55] = -1;
			} catch (@Pc(235) SecurityException local235) {
				local9.anIntArray423[local55] = -2;
			} catch (@Pc(242) NullPointerException local242) {
				local9.anIntArray423[local55] = -3;
			} catch (@Pc(249) Exception local249) {
				local9.anIntArray423[local55] = -4;
			} catch (@Pc(256) Throwable local256) {
				local9.anIntArray423[local55] = -5;
			}
		}
		Static45.aClass16_10.method190(local9);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method5273(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(18) int local18 = Static184.method3186(arg1, arg0);
		@Pc(23) String[] local23 = new String[local18 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg1.charAt(local33) != arg0; local33++) {
			}
			local23[local25++] = arg1.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local18] = arg1.substring(local27);
		return local23;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZILclient!pg;ZLclient!pg;II)I")
	public static int method5274(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class157_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class157_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = Static287.method4783(arg0, arg5, arg3, arg1);
		if (local15 != 0) {
			return arg0 ? -local15 : local15;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static287.method4783(arg2, arg4, arg3, arg1);
			return arg2 ? -local36 : local36;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public static void method5275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static257.method4460(arg1)) {
			Static277.method4684(arg0, Static188.aClass137ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method5276() {
		if (Static107.aClass129_4 == null) {
			return;
		}
		Static33.aClass210_2.method5614();
		Static181.method3072();
		Static178.method2897();
		Static92.method1348();
		Static185.method3204();
		Static120.method1443();
		if (Static162.aClass39_1 != null) {
			Static162.aClass39_1.method583();
		}
		Static177.method2855();
		Static42.method638();
		Static159.method2561();
		Static204.method3650(false);
		Static248.method4336();
		for (@Pc(46) int local46 = 0; local46 < 2048; local46++) {
			@Pc(52) Class67_Sub3_Sub3_Sub2 local52 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local46];
			if (local52 != null) {
				local52.anInterface7_3 = null;
				for (@Pc(59) int local59 = 0; local59 < local52.aClass126Array3.length; local59++) {
					local52.aClass126Array3[local59] = null;
				}
			}
		}
		for (@Pc(80) int local80 = 0; local80 < Static356.aClass67_Sub3_Sub3_Sub1Array1.length; local80++) {
			@Pc(86) Class67_Sub3_Sub3_Sub1 local86 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local80];
			if (local86 != null) {
				for (@Pc(90) int local90 = 0; local90 < local86.aClass126Array3.length; local90++) {
					local86.aClass126Array3[local90] = null;
				}
			}
		}
		Static107.aClass129_4.method5010();
		Static107.aClass129_4 = null;
	}
}
