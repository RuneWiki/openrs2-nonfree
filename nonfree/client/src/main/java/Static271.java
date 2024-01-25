import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!r", name = "D", descriptor = "I")
	public static int anInt5301;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_119 = new Class85("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public static int anInt5299 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg2) {
			Static177.method3182(arg1, arg2, arg3, arg4, arg6, arg0);
		} else if (Static163.anInt3234 <= arg3 - arg2 && arg2 + arg3 <= Static353.anInt6760 && arg6 - arg5 >= Static75.anInt1447 && Static346.anInt6668 >= arg6 + arg5) {
			Static176.method3173(arg4, arg3, arg2, arg0, arg1, arg5, arg6);
		} else {
			Static21.method437(arg5, arg1, arg4, arg6, arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method4755() {
		Static163.anIntArray334 = null;
		Static255.anIntArray491 = null;
		Static307.anIntArray587 = null;
		Static213.anIntArray394 = null;
		Static8.aByteArrayArrayArray3 = null;
		Static183.anIntArray364 = null;
		Static162.anIntArray333 = null;
		Static217.anIntArrayArrayArray8 = null;
		Static207.aByteArrayArrayArray11 = null;
		Static19.aByteArrayArrayArray4 = null;
		Static193.aByteArrayArrayArray10 = null;
		Static162.aByteArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public static void method4756() {
		@Pc(10) int local10 = Static187.aClass5_Sub12_Sub2_4.method5120(8);
		@Pc(19) int local19;
		if (Static22.anInt472 > local10) {
			for (local19 = local10; local19 < Static22.anInt472; local19++) {
				Static86.anIntArray135[Static200.anInt3972++] = Static88.anIntArray137[local19];
			}
		}
		if (Static22.anInt472 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static22.anInt472 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(66) int local66 = Static88.anIntArray137[local19];
			@Pc(70) Class4_Sub5_Sub2_Sub1 local70 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local66];
			@Pc(75) int local75 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
			if (local75 == 0) {
				Static88.anIntArray137[Static22.anInt472++] = local66;
				local70.anInt5350 = Static283.anInt5563;
			} else {
				@Pc(95) int local95 = Static187.aClass5_Sub12_Sub2_4.method5120(2);
				if (local95 == 0) {
					Static88.anIntArray137[Static22.anInt472++] = local66;
					local70.anInt5350 = Static283.anInt5563;
					Static76.anIntArray118[Static195.anInt3883++] = local66;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local95 == 1) {
						Static88.anIntArray137[Static22.anInt472++] = local66;
						local70.anInt5350 = Static283.anInt5563;
						local137 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
						local70.method4125(local137, 1);
						local147 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
						if (local147 == 1) {
							Static76.anIntArray118[Static195.anInt3883++] = local66;
						}
					} else if (local95 == 2) {
						Static88.anIntArray137[Static22.anInt472++] = local66;
						local70.anInt5350 = Static283.anInt5563;
						if (Static187.aClass5_Sub12_Sub2_4.method5120(1) == 1) {
							local137 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
							local70.method4125(local137, 2);
							local147 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
							local70.method4125(local147, 2);
						} else {
							local137 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
							local70.method4125(local137, 0);
						}
						local137 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
						if (local137 == 1) {
							Static76.anIntArray118[Static195.anInt3883++] = local66;
						}
					} else if (local95 == 3) {
						Static86.anIntArray135[Static200.anInt3972++] = local66;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ij;B)V")
	public static void method4758(@OriginalArg(0) Class93 arg0) {
		Static76.aClass93_27 = arg0;
		Static129.anInt2460 = Static76.aClass93_27.method2418(19);
	}
}
