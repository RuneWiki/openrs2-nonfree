import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!md", name = "Eb", descriptor = "I")
	public static int anInt4617;

	@OriginalMember(owner = "client!md", name = "pb", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_59 = new Class44(76, 7);

	@OriginalMember(owner = "client!md", name = "Ab", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_88 = new Class256("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!md", name = "Gb", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_109 = new Class81(57, 16);

	@OriginalMember(owner = "client!md", name = "Hb", descriptor = "I")
	public static final int anInt4619 = 2;

	@OriginalMember(owner = "client!md", name = "Ib", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_110 = new Class81(65, -1);

	@OriginalMember(owner = "client!md", name = "Jb", descriptor = "Lclient!wl;")
	public static final Class265 aClass265_37 = new Class265();

	@OriginalMember(owner = "client!md", name = "Kb", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method3704(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static129.anInt7660;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class241 local22 = Static31.aClass93_2.method1863(arg0[local13]);
			if (local22.anInt6975 != -1) {
				@Pc(34) Class76 local34 = (Class76) Static173.aClass129_27.method3023((long) local22.anInt6975);
				if (local34 == null) {
					@Pc(42) Class89 local42 = Static456.method1764(Static351.aClass188_97, local22.anInt6975, 0);
					if (local42 != null) {
						local34 = Static387.aClass26_9.method2230(local42);
						Static173.aClass129_27.method3029(local34, (long) local22.anInt6975);
					}
				}
				if (local34 != null) {
					Static112.aClass76Array10[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([JIBI[I)V")
	public static void method3724(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(24) int local24 = (arg2 + arg1) / 2;
		@Pc(26) int local26 = arg2;
		@Pc(30) long local30 = arg0[local24];
		arg0[local24] = arg0[arg1];
		arg0[arg1] = local30;
		@Pc(44) int local44 = arg3[local24];
		arg3[local24] = arg3[arg1];
		arg3[arg1] = local44;
		@Pc(64) int local64 = ~local30 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(66) int local66 = arg2; local66 < arg1; local66++) {
			if ((long) (local64 & local66) + local30 > arg0[local66]) {
				@Pc(83) long local83 = arg0[local66];
				arg0[local66] = arg0[local26];
				arg0[local26] = local83;
				@Pc(97) int local97 = arg3[local66];
				arg3[local66] = arg3[local26];
				arg3[local26++] = local97;
			}
		}
		arg0[arg1] = arg0[local26];
		arg0[local26] = local30;
		arg3[arg1] = arg3[local26];
		arg3[local26] = local44;
		method3724(arg0, local26 - 1, arg2, arg3);
		method3724(arg0, arg1, local26 + 1, arg3);
	}

	@OriginalMember(owner = "client!md", name = "k", descriptor = "(II)V")
	public static void method3734(@OriginalArg(1) int arg0) {
		Static209.anIntArray262 = new int[arg0];
		Static328.anIntArray378 = new int[arg0];
		Static43.anIntArray49 = new int[arg0];
		Static277.anIntArray341 = new int[arg0];
		Static255.anIntArray326 = new int[arg0];
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method3736(@OriginalArg(0) Class26 arg0) {
		if (Static168.anInt3255 < 2 && !Static428.aBoolean637 || Static191.aClass41_7 != null) {
			return;
		}
		@Pc(47) String local47;
		if (Static428.aBoolean637 && Static168.anInt3255 < 2) {
			local47 = Static174.aString23 + Static258.aClass256_79.method5720(Static272.anInt7537) + Static179.aString56 + " ->";
		} else if (Static243.aBoolean380 && Static428.aClass52_1.method1347(81) && Static168.anInt3255 > 2) {
			local47 = Static136.method1990((Class2_Sub26) Static288.aClass265_41.aClass2_257.aClass2_262.aClass2_262);
		} else {
			@Pc(54) Class2_Sub26 local54 = (Class2_Sub26) Static288.aClass265_41.aClass2_257.aClass2_262;
			local47 = Static136.method1990(local54);
			@Pc(60) int[] local60 = null;
			if (Static210.method3247(local54.anInt4529)) {
				local60 = Static350.aClass149_2.method3483((int) local54.aLong137).anIntArray47;
			} else if (local54.anInt4530 != -1) {
				local60 = Static350.aClass149_2.method3483(local54.anInt4530).anIntArray47;
			} else if (Static252.method3870(local54.anInt4529)) {
				@Pc(143) Class4_Sub2_Sub2_Sub2 local143 = Static4.aClass4_Sub2_Sub2_Sub2Array1[(int) local54.aLong137];
				if (local143 != null) {
					@Pc(148) Class215 local148 = local143.aClass215_1;
					if (local148.anIntArray400 != null) {
						local148 = local148.method4795(Static215.aClass225_1);
					}
					if (local148 != null) {
						local60 = local148.anIntArray401;
					}
				}
			} else if (Static6.method151(local54.anInt4529)) {
				@Pc(111) Class250 local111;
				if (local54.anInt4529 == 1012) {
					local111 = Static406.aClass150_3.method3508((int) local54.aLong137);
				} else {
					local111 = Static406.aClass150_3.method3508((int) (local54.aLong137 >>> 32 & 0x7FFFFFFFL));
				}
				if (local111.anIntArray479 != null) {
					local111 = local111.method5591(Static215.aClass225_1);
				}
				if (local111 != null) {
					local60 = local111.anIntArray480;
				}
			}
			if (local60 != null) {
				local47 = local47 + method3704(local60);
			}
		}
		if (Static168.anInt3255 > 2) {
			local47 = local47 + "<col=ffffff> / " + (Static168.anInt3255 - 2) + Static227.aClass256_81.method5720(Static272.anInt7537);
		}
		if (Static342.aClass41_12 != null) {
			@Pc(222) Class56 local222 = Static342.aClass41_12.method1189(arg0);
			if (local222 == null) {
				local222 = Static193.aClass56_3;
			}
			local222.method5857(Static60.anInt1702, Static212.anIntArray264, Static342.aClass41_12.anInt1599, Static411.aRandom1, Static150.anInt2863, Static224.anIntArray303, local47, Static342.aClass41_12.anInt1631, Static342.aClass41_12.anInt1617, Static83.anInt1994, Static342.aClass41_12.anInt1604, Static112.aClass76Array10, Static342.aClass41_12.anInt1648, Static342.aClass41_12.anInt1622);
			Static153.method2331(Static212.anIntArray264[0], Static212.anIntArray264[2], Static212.anIntArray264[1], Static212.anIntArray264[3]);
		} else if (Static34.aClass41_2 != null && Static107.aClass209_1 == Static407.aClass209_3) {
			@Pc(287) int local287 = Static193.aClass56_3.method5843(local47, Static224.anIntArray303, Static83.anInt1994, Static411.aRandom1, Static141.anInt2705 + 4, Static296.anInt5334 + 16, Static112.aClass76Array10);
			Static153.method2331(Static141.anInt2705 + 4, Static55.aClass210_1.method4758(local47) + local287, Static296.anInt5334, 16);
		}
	}
}
