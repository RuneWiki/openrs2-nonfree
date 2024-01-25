import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_102 = new Class151("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!oq;Z)V")
	public static void method2457(@OriginalArg(1) Class20_Sub3_Sub3_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static19.anInt396 >= 400) {
			return;
		}
		if (arg0 != Static239.aClass20_Sub3_Sub3_Sub1_1) {
			@Pc(85) String local85;
			@Pc(132) int local132;
			if (arg0.anInt4961 == 0) {
				@Pc(89) boolean local89 = true;
				if (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4959 != -1 && arg0.anInt4959 != -1) {
					@Pc(110) int local110 = arg0.anInt4949 < Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4949 ? Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4949 : arg0.anInt4949;
					@Pc(121) int local121 = arg0.anInt4959 > Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4959 ? Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4959 : arg0.anInt4959;
					local132 = local121 + local110 * 10 / 100 + 5;
					@Pc(138) int local138 = Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4949 - arg0.anInt4949;
					if (local138 < 0) {
						local138 = -local138;
					}
					if (local138 > local132) {
						local89 = false;
					}
				}
				@Pc(165) String local165 = Static43.aClass6_3 == Static357.aClass6_4 ? Static425.aClass151_215.method3122(Static188.anInt3028) : Static309.aClass151_159.method3122(Static188.anInt3028);
				if (arg0.anInt4950 > arg0.anInt4949) {
					local85 = arg0.method3880() + (local89 ? Static155.method2181(arg0.anInt4949, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4949) : "<col=ffffff>") + " (" + local165 + arg0.anInt4949 + "+" + (arg0.anInt4950 - arg0.anInt4949) + ")";
				} else {
					local85 = arg0.method3880() + (local89 ? Static155.method2181(arg0.anInt4949, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4949) : "<col=ffffff>") + " (" + local165 + arg0.anInt4949 + ")";
				}
			} else {
				local85 = arg0.method3880() + " (" + Static311.aClass151_161.method3122(Static188.anInt3028) + arg0.anInt4961 + ")";
			}
			if (Static360.aBoolean498) {
				if (!arg1 && (Static20.anInt436 & 0x8) != 0) {
					Static87.method1275(false, 0, (long) arg0.anInt6045, Static419.aString58 + " -> <col=ffffff>" + local85, Static161.anInt1936, true, Static149.aString68, -1, 0, 4);
				}
			} else if (arg1) {
				Static87.method1275(true, 0, 0L, "", -1, false, "<col=cccccc>" + local85, 0, 0, -1);
			} else {
				for (@Pc(304) int local304 = 7; local304 >= 0; local304--) {
					if (Static348.aStringArray45[local304] != null) {
						@Pc(312) short local312 = 0;
						if (Static455.aClass6_5 == Static357.aClass6_4 && Static348.aStringArray45[local304].equalsIgnoreCase(Static402.aClass151_203.method3122(Static188.anInt3028))) {
							if (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4949 < arg0.anInt4949) {
								local312 = 2000;
							}
							if (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4942 != 0 && arg0.anInt4942 != 0) {
								if (arg0.anInt4942 == Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4942) {
									local312 = 2000;
								} else {
									local312 = 0;
								}
							}
						} else if (Static245.aBooleanArray18[local304]) {
							local312 = 2000;
						}
						@Pc(373) short local373 = (short) (Static77.aShortArray19[local304] + local312);
						local132 = Static448.anIntArray444[local304] == -1 ? Static229.anInt3720 : Static448.anIntArray444[local304];
						Static87.method1275(false, 0, (long) arg0.anInt6045, "<col=ffffff>" + local85, local132, true, Static348.aStringArray45[local304], -1, 0, local373);
					}
				}
			}
			if (!arg1) {
				for (@Pc(423) Class1_Sub45 local423 = (Class1_Sub45) Static50.aClass254_8.method5437(); local423 != null; local423 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
					if (local423.anInt7398 == 5) {
						local423.aString69 = "<col=ffffff>" + local85;
						return;
					}
				}
			}
		} else if (Static360.aBoolean498 && (Static20.anInt436 & 0x10) != 0) {
			Static87.method1275(false, 0, 0L, Static419.aString58 + " -> <col=ffffff>" + Static102.aClass151_59.method3122(Static188.anInt3028), Static161.anInt1936, true, Static149.aString68, -1, 0, 19);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public static void method2459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static75.aClass1_Sub11_Sub1_1.method4450(arg0);
		Static75.aClass1_Sub11_Sub1_1.method4464(arg1);
		Static75.aClass1_Sub11_Sub1_1.method4474(arg2);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!vg;Lclient!vg;I)V")
	public static void method2460(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class250 arg1) {
		Static5.method94(Static415.aClass137_78);
		Static75.aClass1_Sub11_Sub1_1.method4450(arg0.anInt6994);
		Static75.aClass1_Sub11_Sub1_1.method4464(arg1.anInt7038);
		Static75.aClass1_Sub11_Sub1_1.method4448(arg1.anInt7030);
		Static75.aClass1_Sub11_Sub1_1.method4492(arg1.anInt6994);
		Static75.aClass1_Sub11_Sub1_1.method4474(arg0.anInt7030);
		Static75.aClass1_Sub11_Sub1_1.method4474(arg0.anInt7038);
	}
}
