import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_118 = new Class117("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "[I")
	public static final int[] anIntArray545 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_119 = new Class117("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!nq;B)V")
	public static void method5641(@OriginalArg(0) Class144 arg0) {
		Static202.aClass144_59 = arg0;
		Static275.anInt5524 = Static202.aClass144_59.method3890(4);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[Lclient!ms;)V")
	public static void method5642(@OriginalArg(1) int arg0, @OriginalArg(2) Class137[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class137 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt4124 && !Static42.method640(local9)) {
				if (local9.anInt4067 == 0) {
					method5642(local9.anInt4044, arg1);
					if (local9.aClass137Array2 != null) {
						method5642(local9.anInt4044, local9.aClass137Array2);
					}
					@Pc(50) Class11_Sub41 local50 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local9.anInt4044);
					if (local50 != null) {
						Static37.method551(local50.anInt6364);
					}
				}
				if (local9.anInt4067 == 6 && local9.anInt4076 != -1) {
					@Pc(70) Class111 local70 = Static306.method5143(local9.anInt4076);
					if (local70 != null) {
						local9.anInt4099 += Static244.anInt4932;
						while (local70.anIntArray190[local9.anInt4091] < local9.anInt4099) {
							local9.anInt4099 -= local70.anIntArray190[local9.anInt4091];
							local9.anInt4091++;
							if (local9.anInt4091 >= local70.anIntArray191.length) {
								local9.anInt4091 -= local70.anInt2723;
								if (local9.anInt4091 < 0 || local9.anInt4091 >= local70.anIntArray191.length) {
									local9.anInt4091 = 0;
								}
							}
							local9.anInt4104 = local9.anInt4091 + 1;
							if (local70.anIntArray191.length <= local9.anInt4104) {
								local9.anInt4104 -= local70.anInt2723;
								if (local9.anInt4104 < 0 || local70.anIntArray191.length <= local9.anInt4104) {
									local9.anInt4104 = -1;
								}
							}
							Static69.method1039(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)I")
	public static int method5643(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5644(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static326.aStringArray48.length; local7++) {
			if (Static326.aStringArray48[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)V")
	public static void method5645(@OriginalArg(0) int arg0) {
		Static154.aClass26_25 = new Class26(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!kr;Z)Z")
	public static boolean method5649(@OriginalArg(0) Class67_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static108.aClass77Array2 == Static79.aClass77Array5;
		@Pc(8) int local8 = 0;
		arg0.method5406();
		if (arg0.aShort91 < 0 || arg0.aShort90 < 0 || arg0.aShort93 >= Static232.anInt4703 || arg0.aShort92 >= Static300.anInt5931) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort91; local30 <= arg0.aShort93; local30++) {
			for (local34 = arg0.aShort90; local34 <= arg0.aShort92; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort91) {
					local37++;
				}
				if (local30 < arg0.aShort93) {
					local37 += 4;
				}
				if (local34 > arg0.aShort90) {
					local37 += 8;
				}
				if (local34 < arg0.aShort92) {
					local37 += 2;
				}
				Static112.method1688(arg0.aByte73, local30, local34);
				@Pc(71) Class106 local71 = Static212.aClass106ArrayArrayArray2[arg0.aByte73][local30][local34];
				@Pc(76) Class64 local76 = Static209.method3743(arg0, local37);
				@Pc(79) Class64 local79 = local71.aClass64_4;
				if (local79 == null) {
					local71.aClass64_4 = local76;
				} else {
					while (local79.aClass64_2 != null) {
						local79 = local79.aClass64_2;
					}
					local79.aClass64_2 = local76;
				}
				local71.aByte28 = (byte) (local71.aByte28 | local37);
				if (local6 && Static303.anIntArrayArray55[local30][local34] != 0) {
					local8 = Static303.anIntArrayArray55[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort91; local34 <= arg0.aShort93; local34++) {
				for (local37 = arg0.aShort90; local37 <= arg0.aShort92; local37++) {
					if (Static303.anIntArrayArray55[local34][local37] == 0) {
						Static303.anIntArrayArray55[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static220.aClass67_Sub3Array3[Static249.anInt4974++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JI)V")
	public static void method5650(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static84.anInt1523 + Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308;
		@Pc(15) int local15 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 + Static338.anInt6504;
		if (Static114.anInt2169 - local10 < -500 || Static114.anInt2169 - local10 > 500 || Static169.anInt6309 - local15 < -500 || Static169.anInt6309 - local15 > 500) {
			Static169.anInt6309 = local15;
			Static114.anInt2169 = local10;
		}
		@Pc(53) int local53;
		@Pc(61) int local61;
		if (Static114.anInt2169 != local10) {
			local53 = local10 - Static114.anInt2169;
			local61 = (int) (arg0 * (long) local53 / 320L);
			if (local53 > 0) {
				if (local61 == 0) {
					local61 = 1;
				} else if (local61 > local53) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = -1;
			} else if (local53 > local61) {
				local61 = local53;
			}
			Static114.anInt2169 += local61;
		}
		if (Static169.anInt6309 != local15) {
			local53 = local15 - Static169.anInt6309;
			local61 = (int) ((long) local53 * arg0 / 320L);
			if (local53 > 0) {
				if (local61 == 0) {
					local61 = 1;
				} else if (local61 > local53) {
					local61 = local53;
				}
			} else if (local61 == 0) {
				local61 = -1;
			} else if (local61 < local53) {
				local61 = local53;
			}
			Static169.anInt6309 += local61;
		}
		if (!Static210.aBoolean290) {
			Static246.aFloat51 += (float) arg0 * Static209.aFloat44 / 6.0F;
			Static21.aFloat10 += Static283.aFloat53 * (float) arg0 / 6.0F;
		}
		Static51.method731();
	}
}
