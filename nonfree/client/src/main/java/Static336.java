import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_80 = new Class242("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	public static int anInt5909 = -1;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	public static void method4592() {
		Static270.method3652(Static16.aClass30_11, (long) Static175.anInt3261);
		if (Static404.anInt6892 != -1) {
			Static46.method4093(Static404.anInt6892);
		}
		for (@Pc(18) int local18 = 0; local18 < Static180.anInt3352; local18++) {
			if (Static26.aBooleanArray2[local18]) {
				Static203.aBooleanArray11[local18] = true;
			}
			Static86.aBooleanArray24[local18] = Static26.aBooleanArray2[local18];
			Static26.aBooleanArray2[local18] = false;
		}
		Static99.anInt5862 = Static175.anInt3261;
		if (Static16.aClass30_11.method4682()) {
			Static231.aBoolean315 = true;
		}
		if (Static404.anInt6892 != -1) {
			Static180.anInt3352 = 0;
			Static340.method4726();
		}
		Static16.aClass30_11.va();
		Static239.method3308(Static105.anInt2235);
		Static4.anInt161 = 0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BZLclient!rk;)V")
	public static void method4595(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub2_Sub1_Sub2 arg1) {
		if (Static83.anInt1893 >= 400) {
			return;
		}
		@Pc(22) Class243 local22 = arg1.aClass243_1;
		if (local22.anIntArray613 != null) {
			local22 = local22.method5337(Static155.aClass149_1);
			if (local22 == null) {
				return;
			}
		}
		if (!local22.aBoolean461) {
			return;
		}
		@Pc(40) String local40 = local22.aString68;
		if (local22.anInt6880 != 0) {
			@Pc(59) String local59 = Static441.aClass95_5 == Static128.aClass95_1 ? Static388.aClass242_97.method5320(Static139.anInt2670) : Static377.aClass242_94.method5320(Static139.anInt2670);
			local40 = local40 + Static39.method1429(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt967, local22.anInt6880) + " (" + local59 + local22.anInt6880 + ")";
		}
		if (!Static222.aBoolean305) {
			if (!arg0) {
				@Pc(89) String[] local89 = local22.lb;
				if (Static315.aBoolean377) {
					local89 = Static230.method3199(local89);
				}
				@Pc(99) int local99;
				if (local89 != null) {
					for (local99 = 4; local99 >= 0; local99--) {
						if (local89[local99] != null && (Static162.aClass95_7 != Static441.aClass95_5 || !local89[local99].equalsIgnoreCase(Static108.aClass242_30.method5320(Static139.anInt2670)))) {
							@Pc(119) byte local119 = 0;
							if (local99 == 0) {
								local119 = 50;
							}
							@Pc(125) int local125 = Static214.anInt4012;
							if (local99 == 1) {
								local119 = 47;
							}
							if (local99 == 2) {
								local119 = 8;
							}
							if (local99 == 3) {
								local119 = 12;
							}
							if (local99 == local22.anInt6894) {
								local125 = local22.anInt6883;
							}
							if (local99 == 4) {
								local119 = 23;
							}
							if (local99 == local22.anInt6910) {
								local125 = local22.anInt6899;
							}
							Static191.method2806(0, (long) arg1.anInt6078, false, local125, true, local89[local99], "<col=ffff00>" + local40, 0, -1, local119);
						}
					}
				}
				if (Static441.aClass95_5 == Static162.aClass95_7 && local89 != null) {
					for (local99 = 4; local99 >= 0; local99--) {
						if (local89[local99] != null && local89[local99].equalsIgnoreCase(Static108.aClass242_30.method5320(Static139.anInt2670))) {
							@Pc(220) short local220 = 0;
							if (local22.anInt6880 > Static375.aClass6_Sub2_Sub1_Sub1_3.anInt967) {
								local220 = 2000;
							}
							@Pc(233) short local233 = 0;
							if (local99 == 0) {
								local233 = 50;
							}
							if (local99 == 1) {
								local233 = 47;
							}
							if (local99 == 2) {
								local233 = 8;
							}
							if (local99 == 3) {
								local233 = 12;
							}
							if (local99 == 4) {
								local233 = 23;
							}
							if (local233 != 0) {
								local233 += local220;
							}
							Static191.method2806(0, (long) arg1.anInt6078, false, local22.anInt6877, true, local89[local99], "<col=ffff00>" + local40, 0, -1, local233);
						}
					}
				}
			}
			Static191.method2806(0, (long) arg1.anInt6078, arg0, Static104.anInt2227, true, Static209.aClass242_53.method5320(Static139.anInt2670), "<col=ffff00>" + local40, 0, -1, 1009);
		} else if (!arg0) {
			@Pc(345) Class247 local345 = Static114.anInt2420 == -1 ? null : Static110.aClass262_1.method5689(Static114.anInt2420);
			if ((Static234.anInt4263 & 0x2) != 0) {
				if (local345 == null || local22.method5332(Static114.anInt2420, local345.anInt7035) != local345.anInt7035) {
					Static191.method2806(0, (long) arg1.anInt6078, false, Static195.anInt2838, true, Static279.aString50, Static178.aString37 + " -> <col=ffff00>" + local40, 0, -1, 30);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!mu;")
	public static Class4_Sub17 method4599(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class4_Sub17_Sub2");
			@Pc(10) Class4_Sub17 local10 = (Class4_Sub17) local6.getDeclaredConstructor().newInstance();
			local10.method4042(arg0);
			return local10;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class4_Sub17_Sub1 local29 = new Class4_Sub17_Sub1();
			local29.method4042(arg0);
			return local29;
		}
	}
}
