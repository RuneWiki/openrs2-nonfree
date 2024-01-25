import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!gq", name = "qb", descriptor = "I")
	public static int anInt2254;

	@OriginalMember(owner = "client!gq", name = "tb", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "Lclient!o;")
	public static final Class169 aClass169_111 = new Class169("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!gq", name = "sb", descriptor = "Lclient!o;")
	public static final Class169 aClass169_112 = new Class169("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1826(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static69.method1138(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static69.method1138(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(71) int local71 = local11; local71 < local14; local71++) {
			@Pc(77) char local77 = arg0.charAt(local71);
			if (Static342.method4854(local77)) {
				@Pc(85) char local85 = Static112.method1634(local77);
				if (local85 != '\u0000') {
					local64.append(local85);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!ki;)Z")
	public static boolean method1830(@OriginalArg(1) Interface6 arg0) {
		@Pc(10) Class236 local10 = Static54.aClass153_1.method3081(arg0.method5250());
		if (local10.anInt5922 == -1) {
			return true;
		} else {
			@Pc(27) Class206 local27 = Static309.aClass184_3.method4224(local10.anInt5922);
			return local27.anInt5347 == -1 ? true : local27.method4642();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!vg;Lclient!bg;III)V")
	public static void method1831(@OriginalArg(0) Class1_Sub33_Sub2 arg0, @OriginalArg(1) Class25_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		if ((arg2 & 0x4000) != 0) {
			local14 = Static366.anInt5883;
			local18 = arg0.method5181();
			local22 = arg0.method5172();
			arg1.method1890(local18, local14, local22);
		}
		@Pc(35) byte local35 = -1;
		if ((arg2 & 0x4) != 0) {
			local14 = arg0.method5131();
			if (local14 == 65535) {
				local14 = -1;
			}
			local18 = arg0.method5162();
			Static313.method4640(local14, local18, arg1);
		}
		if ((arg2 & 0x2000) != 0) {
			local14 = arg0.method5177();
			arg1.anInt2377 = arg0.method5162();
			arg1.anInt2357 = arg0.method5174();
			arg1.anInt2376 = local14 & 0x7FFF;
			arg1.aBoolean188 = (local14 & 0x8000) != 0;
			arg1.anInt2343 = arg1.anInt2376 + Static366.anInt5883 + arg1.anInt2377;
		}
		if ((arg2 & 0x2) != 0) {
			arg1.anInt579 = arg0.method5131();
			if (arg1.anInt2381 == 0) {
				arg1.method1889(arg1.anInt579);
				arg1.anInt579 = -1;
			}
		}
		@Pc(150) int local150;
		@Pc(156) int local156;
		if ((arg2 & 0x1000) != 0) {
			local14 = arg0.method5162();
			@Pc(142) int[] local142 = new int[local14];
			@Pc(145) int[] local145 = new int[local14];
			@Pc(148) int[] local148 = new int[local14];
			for (local150 = 0; local150 < local14; local150++) {
				local156 = arg0.method5131();
				if (local156 == 65535) {
					local156 = -1;
				}
				local142[local150] = local156;
				local145[local150] = arg0.method5174();
				local148[local150] = arg0.method5144();
			}
			Static131.method1914(local148, arg1, local145, local142);
		}
		if ((arg2 & 0x400) != 0) {
			arg1.aString23 = arg0.method5128();
			if (arg1.aString23.charAt(0) == '~') {
				arg1.aString23 = arg1.aString23.substring(1);
				Static101.method1458(arg1.method467(), 2, 0, arg1.method462(), arg1.aString23);
			} else if (arg1 == Static321.aClass25_Sub1_Sub1_Sub1_2) {
				Static101.method1458(arg1.method467(), 2, 0, arg1.method462(), arg1.aString23);
			}
			arg1.anInt2369 = 0;
			arg1.anInt2318 = 0;
			arg1.anInt2327 = 150;
		}
		if ((arg2 & 0x8) != 0) {
			local14 = arg0.method5177();
			if (local14 == 65535) {
				local14 = -1;
			}
			arg1.anInt2353 = local14;
		}
		@Pc(410) int local410;
		if ((arg2 & 0x100) != 0) {
			local14 = arg0.method5144();
			local18 = arg0.method5163();
			if (local14 == 65535) {
				local14 = -1;
			}
			@Pc(294) boolean local294 = true;
			@Pc(385) Class185 local385;
			if (local14 != -1 && arg1.anInt2338 != -1) {
				@Pc(316) Class134 local316;
				if (arg1.anInt2338 == local14) {
					local316 = Static10.aClass246_1.method5429(local14);
					if (local316.aBoolean297 && local316.anInt3346 != -1) {
						@Pc(329) Class185 local329 = Static25.aClass67_1.method1227(local316.anInt3346);
						local156 = local329.anInt4802;
						if (local156 == 0) {
							local294 = false;
						} else if (local156 == 1) {
							local294 = true;
						} else if (local156 == 2) {
							local294 = false;
							arg1.anInt2359 = 0;
						}
					}
				} else {
					local316 = Static10.aClass246_1.method5429(local14);
					@Pc(369) Class134 local369 = Static10.aClass246_1.method5429(arg1.anInt2338);
					if (local316.anInt3346 != -1 && local369.anInt3346 != -1) {
						local385 = Static25.aClass67_1.method1227(local316.anInt3346);
						@Pc(391) Class185 local391 = Static25.aClass67_1.method1227(local369.anInt3346);
						if (local391.anInt4805 > local385.anInt4805) {
							local294 = false;
						}
					}
				}
			}
			if (local294) {
				arg1.anInt2338 = local14;
				arg1.anInt2351 = local18 >> 16;
				local410 = Static366.anInt5883;
				arg1.anInt2355 = local410 + (local18 & 0xFFFF);
				arg1.anInt2372 = 0;
				arg1.anInt2373 = 0;
				arg1.anInt2330 = 1;
				if (arg1.anInt2355 > local410) {
					arg1.anInt2373 = -1;
				}
				if (arg1.anInt2338 != -1 && arg1.anInt2355 == local410) {
					local150 = Static10.aClass246_1.method5429(arg1.anInt2338).anInt3346;
					if (local150 != -1) {
						local385 = Static25.aClass67_1.method1227(local150);
						if (local385 != null && local385.anIntArray579 != null) {
							Static4.method52(0, arg1.anInt6080, Static321.aClass25_Sub1_Sub1_Sub1_2 == arg1, arg1.aByte70, local385, arg1.anInt6077);
						}
					}
				}
			}
		}
		if ((arg2 & 0x20) != 0) {
			Static268.aByteArray75[arg3] = arg0.method5164();
		}
		if ((arg2 & 0x40) != 0) {
			local14 = arg0.method5181();
			local18 = arg0.method5174();
			arg1.method1890(local14, Static366.anInt5883, local18);
			arg1.anInt2348 = Static366.anInt5883 + 300;
			arg1.anInt2360 = arg0.method5172();
		}
		if ((arg2 & 0x80) != 0) {
			local14 = arg0.method5174();
			@Pc(541) byte[] local541 = new byte[local14];
			@Pc(546) Class1_Sub33 local546 = new Class1_Sub33(local541);
			arg0.method5135(local14, local541);
			Static322.aClass1_Sub33Array1[arg3] = local546;
			arg1.method472(local546);
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt2346 = arg0.method5188();
			arg1.anInt2329 = arg0.method5164();
			arg1.anInt2366 = arg0.method5164();
			arg1.anInt2349 = arg0.method5187();
			arg1.anInt2336 = arg0.method5131() + Static366.anInt5883;
			arg1.anInt2347 = arg0.method5177() + Static366.anInt5883;
			arg1.anInt2334 = arg0.method5172();
			if (arg1.anInt599 == -1) {
				arg1.anInt2346 += arg1.anIntArray296[0];
				arg1.anInt2366 += arg1.anIntArray296[0];
				arg1.anInt2349 += arg1.anIntArray295[0];
				arg1.anInt2329 += arg1.anIntArray295[0];
				arg1.anInt2381 = 1;
			} else {
				arg1.anInt2349 += arg1.anInt613;
				arg1.anInt2381 = 0;
				arg1.anInt2329 += arg1.anInt613;
				arg1.anInt2366 += arg1.anInt599;
				arg1.anInt2346 += arg1.anInt599;
			}
			arg1.anInt2379 = 0;
		}
		if ((arg2 & 0x1) != 0) {
			local14 = arg0.method5144();
			local18 = arg0.method5172();
			local22 = arg0.method5172();
			local410 = arg0.lb;
			@Pc(717) boolean local717 = (local14 & 0x8000) != 0;
			if (arg1.aString6 != null && arg1.aClass49_1 != null) {
				@Pc(725) boolean local725 = false;
				if (local18 <= 1) {
					if (!local717 && (Static357.aBoolean558 && !Static201.aBoolean347 || Static54.aBoolean102)) {
						local725 = true;
					} else if (Static18.method2855(arg1.aString6)) {
						local725 = true;
					}
				}
				if (!local725 && Static203.anInt3552 == 0) {
					Static344.aClass1_Sub33_10.lb = 0;
					arg0.method5134(local22, Static344.aClass1_Sub33_10.aByteArray86);
					Static344.aClass1_Sub33_10.lb = 0;
					@Pc(766) int local766 = -1;
					@Pc(785) String local785;
					if (local717) {
						local14 &= 0x7FFF;
						@Pc(776) Class171 local776 = Static309.method4598(Static344.aClass1_Sub33_10);
						local766 = local776.anInt4362;
						local785 = local776.aClass1_Sub6_Sub13_1.method4181(Static344.aClass1_Sub33_10);
					} else {
						local785 = Static292.method4433(Static250.method3875(Static344.aClass1_Sub33_10));
					}
					arg1.aString23 = local785.trim();
					arg1.anInt2369 = local14 >> 8;
					arg1.anInt2327 = 150;
					arg1.anInt2318 = local14 & 0xFF;
					@Pc(824) int local824;
					if (local18 == 1 || local18 == 2) {
						local824 = local717 ? 17 : 1;
					} else {
						local824 = local717 ? 17 : 2;
					}
					if (local18 == 2) {
						Static109.method1537(local785, "<img=1>" + arg1.method462(), local824, "<img=1>" + arg1.method467(), local766, null, 0);
					} else if (local18 == 1) {
						Static109.method1537(local785, "<img=0>" + arg1.method462(), local824, "<img=0>" + arg1.method467(), local766, null, 0);
					} else {
						Static109.method1537(local785, arg1.method462(), local824, arg1.method467(), local766, null, 0);
					}
				}
			}
			arg0.lb = local410 + local22;
		}
		if ((arg2 & 0x800) != 0) {
			local35 = arg0.method5187();
		}
		if (arg1.anInt599 == -1) {
			return;
		}
		if (local35 == 127) {
			arg1.method468(arg1.anInt613, arg1.anInt599);
			return;
		}
		@Pc(946) byte local946;
		if (local35 == -1) {
			local946 = Static268.aByteArray75[arg3];
		} else {
			local946 = local35;
		}
		arg1.method464(local946, arg1.anInt599, arg1.anInt613);
	}
}
