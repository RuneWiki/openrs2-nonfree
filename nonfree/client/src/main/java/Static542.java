import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_271 = new Class202("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BJ)V")
	public static void method7777(@OriginalArg(1) long arg0) {
		if (Static399.aClass262ArrayArrayArray2 != null) {
			if (Static427.anInt7875 == 1 || Static427.anInt7875 == 5) {
				Static520.method1887(arg0);
			} else if (Static427.anInt7875 == 4) {
				Static467.method7032(arg0);
			}
		}
		Static132.method2415((long) Static115.anInt2326, Static103.aClass39_3);
		if (Static387.anInt7341 != -1) {
			Static439.method6716(Static387.anInt7341);
		}
		for (@Pc(46) int local46 = 0; local46 < Static528.anInt9120; local46++) {
			if (Static368.aBooleanArray32[local46]) {
				Static36.aBooleanArray6[local46] = true;
			}
			Static503.aBooleanArray37[local46] = Static368.aBooleanArray32[local46];
			Static368.aBooleanArray32[local46] = false;
		}
		Static99.anInt1978 = Static115.anInt2326;
		if (Static103.aClass39_3.method6036()) {
			Static338.aBoolean472 = true;
		}
		if (Static387.anInt7341 != -1) {
			Static528.anInt9120 = 0;
			Static480.method7150();
		}
		Static103.aClass39_3.n();
		Static319.method5091(Static103.aClass39_3);
		@Pc(93) int local93 = Static297.method4698();
		if (local93 == -1) {
			local93 = Static94.anInt1853;
		}
		if (local93 == -1) {
			local93 = Static161.anInt2925;
		}
		Static532.method7661(local93);
		Static78.method1570(Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659, Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90, Static436.anInt7972);
		Static436.anInt7972 = 0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!cd;IIIIII)V")
	public static void method7779(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		Static101.method7084(arg3, arg0.anInt7660, arg2, arg1, arg0.aByte90, arg0.anInt7659, 0);
	}
}
