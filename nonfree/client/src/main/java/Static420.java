import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
	public static int anInt9019;

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "Lclient!gr;")
	public static Class118 aClass118_10;

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_72 = new Class288(20);

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "Z")
	public static boolean aBoolean656 = false;

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_229 = new Class150(30, 0);

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_154 = new Class40("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!bda;III)V")
	public static void method7302(@OriginalArg(0) Class15_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt4711 == arg1 && arg1 != -1) {
			@Pc(23) Class31 local23 = Static155.aClass76_2.method2152(arg1);
			@Pc(26) int local26 = local23.anInt923;
			if (local26 == 1) {
				arg0.anInt4714 = arg2;
				arg0.anInt4709 = 0;
				arg0.anInt4730 = 1;
				arg0.anInt4690 = 0;
				arg0.anInt4704 = 0;
				Static279.method4554(arg0 == Static35.aClass15_Sub2_Sub1_Sub1_1, arg0.anInt8493, arg0.anInt4709, local23, arg0.anInt8492, arg0.aByte91);
			}
			if (local26 == 2) {
				arg0.anInt4690 = 0;
				return;
			}
		} else if (arg1 == -1 || arg0.anInt4711 == -1 || Static155.aClass76_2.method2152(arg1).anInt933 >= Static155.aClass76_2.method2152(arg0.anInt4711).anInt933) {
			arg0.anInt4690 = 0;
			arg0.anInt4714 = arg2;
			arg0.anInt4730 = 1;
			arg0.anInt4756 = arg0.anInt4753;
			arg0.anInt4711 = arg1;
			arg0.anInt4704 = 0;
			arg0.anInt4709 = 0;
			if (arg0.anInt4711 == -1) {
				return;
			}
			Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == arg0, arg0.anInt8493, arg0.anInt4709, Static155.aClass76_2.method2152(arg0.anInt4711), arg0.anInt8492, arg0.aByte91);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!gp;ZLclient!qa;)V")
	public static void method7305(@OriginalArg(0) Class117 arg0, @OriginalArg(2) Class62 arg1) {
		if (Static416.aBoolean524) {
			return;
		}
		arg1.Z(0);
		Static335.aClass25_18 = arg1.method6998(Static551.method2422(arg0, Static33.anInt859));
		Static335.aClass25_18.method6956((Static383.anInt6994 - Static335.aClass25_18.EA()) / 2, (Static456.anInt7874 - Static335.aClass25_18.ma()) / 2);
		Static24.aClass25_9 = arg1.method6998(Static551.method2422(arg0, Static397.anInt7134));
		Static24.aClass25_9.method6956((Static383.anInt6994 - Static24.aClass25_9.EA()) / 2, 18);
		Static416.aBoolean524 = true;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BZ)V")
	public static void method7310(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static131.aClass5_Sub3_Sub1_1.method525(Static319.anInt6170) >= 15) {
				@Pc(23) int local23 = Static131.aClass5_Sub3_Sub1_1.method524(15);
				if (local23 != 32767) {
					@Pc(28) boolean local28 = false;
					@Pc(35) Class5_Sub51 local35 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local23);
					@Pc(41) Class15_Sub2_Sub1_Sub2 local41;
					if (local35 == null) {
						local41 = new Class15_Sub2_Sub1_Sub2();
						local41.anInt4745 = local23;
						local35 = new Class5_Sub51(local41);
						Static521.aClass42_42.method1106((long) local23, local35);
						local28 = true;
						Static275.aClass5_Sub51Array1[Static310.anInt6066++] = local35;
					}
					local41 = local35.aClass15_Sub2_Sub1_Sub2_2;
					Static547.anIntArray731[Static438.anInt7689++] = local23;
					local41.anInt4749 = Static481.anInt8318;
					if (local41.aClass305_1 != null && local41.aClass305_1.method7141()) {
						Static243.method4137(local41);
					}
					@Pc(97) int local97;
					if (arg0) {
						local97 = Static131.aClass5_Sub3_Sub1_1.method524(8);
						if (local97 > 127) {
							local97 -= 256;
						}
					} else {
						local97 = Static131.aClass5_Sub3_Sub1_1.method524(5);
						if (local97 > 15) {
							local97 -= 32;
						}
					}
					@Pc(125) int local125 = (Static131.aClass5_Sub3_Sub1_1.method524(3) + 4 & 0xCC400007) << 11;
					@Pc(130) int local130 = Static131.aClass5_Sub3_Sub1_1.method524(2);
					local41.method4045(Static204.aClass282_1.method6596(Static131.aClass5_Sub3_Sub1_1.method524(14)));
					@Pc(145) int local145 = Static131.aClass5_Sub3_Sub1_1.method524(1);
					@Pc(152) int local152;
					if (arg0) {
						local152 = Static131.aClass5_Sub3_Sub1_1.method524(8);
						if (local152 > 127) {
							local152 -= 256;
						}
					} else {
						local152 = Static131.aClass5_Sub3_Sub1_1.method524(5);
						if (local152 > 15) {
							local152 -= 32;
						}
					}
					@Pc(174) int local174 = Static131.aClass5_Sub3_Sub1_1.method524(1);
					if (local174 == 1) {
						Static146.anIntArray243[Static144.anInt3037++] = local23;
					}
					local41.method4030(local41.aClass305_1.anInt8815);
					local41.anInt4741 = local41.aClass305_1.anInt8824 << 3;
					if (local28) {
						local41.method4025(local125, true);
					}
					local41.method4050(local145 == 1, local130, Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray306[0] + local97, local152 + Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray307[0], local41.method4035());
					if (local41.aClass305_1.method7141()) {
						Static160.method2898(local41.anIntArray306[0], 0, null, local41.anIntArray307[0], local41.aByte91, null, local41);
					}
					continue;
				}
			}
			Static131.aClass5_Sub3_Sub1_1.method532();
			return;
		}
	}
}
