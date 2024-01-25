import java.awt.Font;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "[Lclient!gg;")
	public static Class88_Sub1_Sub1_Sub1[] aClass88_Sub1_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
	public static int anInt4775;

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_88 = new Class198("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	public static void method3789() {
		Static307.aClass177_30.method3614();
		for (@Pc(13) Class5_Sub41 local13 = (Class5_Sub41) Static122.aClass177_13.method3618(); local13 != null; local13 = (Class5_Sub41) Static122.aClass177_13.method3619()) {
			if (local13.anInt6815 < 1000) {
				local13.method6003();
				Static307.aClass177_30.method3615(local13);
			}
		}
		Static307.aClass177_30.method3613(Static122.aClass177_13);
		@Pc(49) int local49 = -1;
		@Pc(54) Class5_Sub4 local54 = (Class5_Sub4) Static362.aClass177_33.method3618();
		if (local54 != null) {
			local49 = local54.method3834();
		}
		if (!Static272.aBoolean283) {
			if (local49 == 0 && (Static456.anInt7452 == 1 && Static18.anInt395 > 2 || Static20.method336())) {
				local49 = 2;
			}
			if (local49 == 2 && Static18.anInt395 > 0 && local54 != null) {
				if (Static387.aClass76_14 == null && Static151.anInt7436 == 0) {
					Static244.method3149(local54.method3837(), local54.method3833());
				} else {
					Static85.anInt1538 = 2;
				}
			}
			if (local49 == 0 && Static18.anInt395 > 0) {
				Static67.method1018();
			}
			if (Static387.aClass76_14 == null && Static151.anInt7436 == 0) {
				Static256.aClass5_Sub41_2 = null;
				Static85.anInt1538 = 0;
				return;
			}
			return;
		}
		@Pc(137) int local137;
		@Pc(141) int local141;
		if (local49 == -1) {
			local137 = Static290.aClass66_1.method5965();
			local141 = Static290.aClass66_1.method5974();
			if (Static285.anInt4431 - 10 > local137 || Static78.anInt4643 + Static285.anInt4431 + 10 < local137 || local141 < Static381.anInt3882 - 10 || local141 > Static381.anInt3882 + Static335.anInt5447 + 10) {
				Static284.method3503();
			}
		}
		if (local49 != 0) {
			return;
		}
		local137 = Static285.anInt4431;
		local141 = Static381.anInt3882;
		@Pc(175) int local175 = Static78.anInt4643;
		@Pc(179) int local179 = local54.method3837();
		@Pc(183) int local183 = local54.method3833();
		@Pc(185) int local185 = -1;
		@Pc(203) int local203;
		for (@Pc(187) int local187 = 0; local187 < Static18.anInt395; local187++) {
			if (Static286.aBoolean295) {
				local203 = (Static18.anInt395 - local187 - 1) * 16 + local141 + 33;
				if (local179 > local137 && local175 + local137 > local179 && local203 - 13 < local183 && local203 + 4 > local183) {
					local185 = local187;
				}
			} else {
				local203 = local141 + (Static18.anInt395 + -1 + -local187) * 16 + 31;
				if (local179 > local137 && local179 < local137 + local175 && local203 - 13 < local183 && local183 < local203 + 3) {
					local185 = local187;
				}
			}
		}
		if (local185 != -1) {
			local203 = 0;
			@Pc(293) Class142 local293 = new Class142(Static122.aClass177_13);
			for (@Pc(298) Class5_Sub41 local298 = (Class5_Sub41) local293.method2954(); local298 != null; local298 = (Class5_Sub41) local293.method2958()) {
				if (local185 == local203) {
					Static122.method1733(local183, local179, local298);
				}
				local203++;
			}
		}
		Static284.method3503();
	}
}
