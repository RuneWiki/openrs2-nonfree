import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
	public static int anInt8803;

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
	public static int anInt8817;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIIII)V")
	public static void method7599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg1) {
			Static240.method4038(arg1, Static144.anIntArrayArray30[arg0], arg3, arg2);
		} else {
			Static240.method4038(arg2, Static144.anIntArrayArray30[arg0], arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZIILclient!qga;)V")
	public static void method7601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class299 arg2) {
		Static637.aClass299_11 = arg2;
		Static660.anInt6760 = arg0;
		Static399.anInt6980 = arg1;
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V")
	public static void method7604() {
		if (Static7.aClass168Array1 == null) {
			Static7.aClass168Array1 = Static243.method4058();
			Static18.aClass168_1 = Static7.aClass168Array1[0];
			Static50.aLong36 = Static26.method382();
		}
		if (Static161.aClass329_3 == null) {
			Static241.method4042();
		}
		@Pc(32) Class168 local32 = Static18.aClass168_1;
		@Pc(35) int local35 = Static441.method6594();
		if (local32 == Static18.aClass168_1) {
			Static275.aString71 = Static18.aClass168_1.aClass21_63.method324(Static26.anInt352);
			if (Static18.aClass168_1.aBoolean352) {
				Static304.anInt5409 = Static18.aClass168_1.anInt4640 + local35 * (Static18.aClass168_1.anInt4638 - Static18.aClass168_1.anInt4640) / 100;
			}
			if (Static18.aClass168_1.aBoolean353) {
				Static275.aString71 = Static275.aString71 + Static304.anInt5409 + "%";
			}
		} else if (Static18.aClass168_1 == Static243.aClass168_22) {
			Static161.aClass329_3 = null;
			Static160.method2323(3);
		} else {
			Static275.aString71 = local32.aClass21_64.method324(Static26.anInt352);
			if (Static18.aClass168_1.aBoolean353) {
				Static275.aString71 = Static275.aString71 + local32.anInt4638 + "%";
			}
			Static304.anInt5409 = local32.anInt4638;
			if (Static18.aClass168_1.aBoolean352 || local32.aBoolean352) {
				Static50.aLong36 = Static26.method382();
			}
		}
		if (Static161.aClass329_3 == null) {
			return;
		}
		Static161.aClass329_3.method8073(Static18.aClass168_1, Static50.aLong36, Static304.anInt5409, Static275.aString71);
		if (Static588.anInterface11Array1 == null) {
			return;
		}
		for (@Pc(156) int local156 = Static528.anInt9076 + 1; local156 < Static588.anInterface11Array1.length; local156++) {
			if (Static588.anInterface11Array1[local156].method5416() >= 100 && Static528.anInt9076 == local156 - 1 && Static387.anInt9114 >= 1 && Static161.aClass329_3.method8074()) {
				try {
					Static588.anInterface11Array1[local156].method5414();
				} catch (@Pc(198) Exception local198) {
					Static588.anInterface11Array1 = null;
					return;
				}
				Static161.aClass329_3.method8071(Static588.anInterface11Array1[local156]);
				Static528.anInt9076++;
				if (Static588.anInterface11Array1.length - 1 <= Static528.anInt9076 && Static588.anInterface11Array1.length > 1) {
					Static528.anInt9076 = Static597.aClass116_1.method2330() ? 0 : -1;
				}
			}
		}
		return;
	}
}
