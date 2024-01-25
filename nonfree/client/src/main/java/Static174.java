import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
	public static int anInt3226;

	@OriginalMember(owner = "client!ir", name = "B", descriptor = "J")
	public static long aLong105 = -1L;

	@OriginalMember(owner = "client!ir", name = "D", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_76 = new Class7("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!ir", name = "F", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_77 = new Class7("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!ir", name = "H", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_78 = new Class7("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!ir", name = "I", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_79 = new Class7("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!ir", name = "J", descriptor = "[B")
	public static final byte[] aByteArray56 = new byte[520];

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!ga;Lclient!ya;)V")
	public static void method2802(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class39 arg1) {
		if (Static168.aClass1_Sub2_Sub11_2 == null) {
			return;
		}
		if (Static301.anInt5202 < 10) {
			if (!Static168.aClass246_17.method5500(Static168.aClass1_Sub2_Sub11_2.aString55)) {
				Static301.anInt5202 = Static86.aClass246_54.method5484(Static168.aClass1_Sub2_Sub11_2.aString55) / 10;
				return;
			}
			Static268.method3946();
			Static301.anInt5202 = 10;
		}
		if (Static301.anInt5202 == 10) {
			Static168.anInt430 = Static168.aClass1_Sub2_Sub11_2.anInt5671 >> 6 << 6;
			Static168.anInt432 = Static168.aClass1_Sub2_Sub11_2.anInt5682 >> 6 << 6;
			Static168.anInt433 = (Static168.aClass1_Sub2_Sub11_2.anInt5679 >> 6 << 6) + 64 - Static168.anInt432;
			Static168.anInt431 = (Static168.aClass1_Sub2_Sub11_2.anInt5683 >> 6 << 6) + 64 - Static168.anInt430;
			@Pc(82) int[] local82 = new int[3];
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = -1;
			if (Static168.aClass1_Sub2_Sub11_2.method4715(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100, local82, Static345.anInt5799 + (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >> 7), (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >> 7) + Static165.anInt3049)) {
				local86 = local82[2] - Static168.anInt430;
				local84 = local82[1] - Static168.anInt432;
			}
			if (!Static456.aBoolean509 && local84 >= 0 && Static168.anInt433 > local84 && local86 >= 0 && local86 < Static168.anInt431) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local86 += (int) (Math.random() * 10.0D) - 5;
				Static138.anInt6309 = local86;
				Static307.anInt5296 = local84;
			} else if (Static219.anInt4016 == -1 || Static134.anInt2688 == -1) {
				Static168.aClass1_Sub2_Sub11_2.method4713(Static168.aClass1_Sub2_Sub11_2.anInt5673 & 0x3FFF, local82, Static168.aClass1_Sub2_Sub11_2.anInt5673 >> 14 & 0x3FFF);
				Static138.anInt6309 = local82[2] - Static168.anInt430;
				Static307.anInt5296 = local82[1] - Static168.anInt432;
			} else {
				Static168.aClass1_Sub2_Sub11_2.method4713(Static134.anInt2688, local82, Static219.anInt4016);
				if (local82 != null) {
					Static138.anInt6309 = local82[2] - Static168.anInt430;
					Static307.anInt5296 = local82[1] - Static168.anInt432;
				}
				Static456.aBoolean509 = false;
				Static134.anInt2688 = -1;
				Static219.anInt4016 = -1;
			}
			if (Static168.aClass1_Sub2_Sub11_2.anInt5672 == 37) {
				Static168.aFloat4 = 3.0F;
				Static168.aFloat5 = 3.0F;
			} else if (Static168.aClass1_Sub2_Sub11_2.anInt5672 == 50) {
				Static168.aFloat4 = 4.0F;
				Static168.aFloat5 = 4.0F;
			} else if (Static168.aClass1_Sub2_Sub11_2.anInt5672 == 75) {
				Static168.aFloat4 = 6.0F;
				Static168.aFloat5 = 6.0F;
			} else if (Static168.aClass1_Sub2_Sub11_2.anInt5672 == 100) {
				Static168.aFloat4 = 8.0F;
				Static168.aFloat5 = 8.0F;
			} else if (Static168.aClass1_Sub2_Sub11_2.anInt5672 == 200) {
				Static168.aFloat4 = 16.0F;
				Static168.aFloat5 = 16.0F;
			} else {
				Static168.aFloat4 = 8.0F;
				Static168.aFloat5 = 8.0F;
			}
			Static168.anInt424 = (int) Static168.aFloat4 >> 1;
			Static168.aByteArrayArrayArray3 = Static213.method3368(Static168.anInt424);
			Static397.method5305();
			Static168.method421();
			Static137.aClass181_23 = new Class181();
			Static168.anInt423 += (int) (Math.random() * 5.0D) - 2;
			if (Static168.anInt423 < -8) {
				Static168.anInt423 = -8;
			}
			if (Static168.anInt423 > 8) {
				Static168.anInt423 = 8;
			}
			Static168.anInt422 += (int) (Math.random() * 5.0D) - 2;
			if (Static168.anInt422 < -16) {
				Static168.anInt422 = -16;
			}
			if (Static168.anInt422 > 16) {
				Static168.anInt422 = 16;
			}
			Static168.method432(arg0, Static168.anInt423 >> 2 << 10, Static168.anInt422 >> 1);
			Static168.aClass78_2.method2111(256, 1024);
			Static168.aClass217_4.method4895(256, 256);
			Static168.aClass115_2.method2770(4096);
			Static45.aClass36_4.method874(256);
			Static301.anInt5202 = 20;
		} else if (Static301.anInt5202 == 20) {
			Static166.method2655(true);
			Static168.method413(arg1, Static168.anInt423, Static168.anInt422);
			Static301.anInt5202 = 60;
			Static166.method2655(true);
			Static320.method5063();
		} else if (Static301.anInt5202 == 60) {
			if (Static168.aClass246_17.method5488(Static168.aClass1_Sub2_Sub11_2.aString55 + "_staticelements")) {
				if (!Static168.aClass246_17.method5500(Static168.aClass1_Sub2_Sub11_2.aString55 + "_staticelements")) {
					return;
				}
				Static168.aClass45_2 = Static413.method5643(Static168.aClass246_17, Static168.aClass1_Sub2_Sub11_2.aString55 + "_staticelements", Static232.aBoolean297);
			} else {
				Static168.aClass45_2 = new Class45(0);
			}
			Static168.method414();
			Static301.anInt5202 = 70;
			Static166.method2655(true);
			Static320.method5063();
		} else if (Static301.anInt5202 == 70) {
			Static408.aClass271_10 = new Class271(arg1, 11, true, Static155.aCanvas4);
			Static301.anInt5202 = 73;
			Static166.method2655(true);
			Static320.method5063();
		} else if (Static301.anInt5202 == 73) {
			Static132.aClass271_5 = new Class271(arg1, 12, true, Static155.aCanvas4);
			Static301.anInt5202 = 76;
			Static166.method2655(true);
			Static320.method5063();
		} else if (Static301.anInt5202 == 76) {
			Static201.aClass271_6 = new Class271(arg1, 14, true, Static155.aCanvas4);
			Static301.anInt5202 = 79;
			Static166.method2655(true);
			Static320.method5063();
		} else if (Static301.anInt5202 == 79) {
			Static248.aClass271_8 = new Class271(arg1, 17, true, Static155.aCanvas4);
			Static301.anInt5202 = 82;
			Static166.method2655(true);
			Static320.method5063();
		} else if (Static301.anInt5202 == 82) {
			Static44.aClass271_3 = new Class271(arg1, 19, true, Static155.aCanvas4);
			Static301.anInt5202 = 85;
			Static166.method2655(true);
			Static320.method5063();
		} else if (Static301.anInt5202 == 85) {
			Static58.aClass271_4 = new Class271(arg1, 22, true, Static155.aCanvas4);
			Static301.anInt5202 = 88;
			Static166.method2655(true);
			Static320.method5063();
		} else if (Static301.anInt5202 == 88) {
			Static223.aClass271_7 = new Class271(arg1, 26, true, Static155.aCanvas4);
			Static301.anInt5202 = 91;
			Static166.method2655(true);
			Static320.method5063();
		} else {
			Static154.aClass271_9 = new Class271(arg1, 30, true, Static155.aCanvas4);
			Static301.anInt5202 = 100;
			Static166.method2655(true);
			Static320.method5063();
			System.gc();
		}
	}
}
