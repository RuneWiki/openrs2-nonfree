import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_232 = new Class202("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
	public static int anInt8290 = 0;

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "[I")
	public static final int[] anIntArray635 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(B)V")
	public static void method6946() {
		Static163.aClass53_50.anInt1684 = 1;
		Static199.method3211();
		Static120.aBoolean209 = true;
		Static186.aBoolean264 = true;
		Static79.method1575();
		for (@Pc(7031) int local7031 = 0; local7031 < Static286.aClass132Array1.length; local7031++) {
			Static286.aClass132Array1[local7031] = null;
		}
		Static21.aBoolean31 = false;
		Static241.method3721();
		Static161.aFloat56 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static87.anInt1767 = (int) (Math.random() * 120.0D) - 60;
		Static114.anInt2317 = (int) (Math.random() * 80.0D) - 40;
		Static3.anInt111 = (int) (Math.random() * 30.0D) - 20;
		Static530.anInt9204 = (int) (Math.random() * 100.0D) - 50;
		Static368.anInt6904 = (int) (Math.random() * 110.0D) - 55;
		Static306.method4785();
		for (@Pc(7105) int local7105 = 0; local7105 < 2048; local7105++) {
			Static278.aClass1_Sub1_Sub2_Sub1Array1[local7105] = null;
		}
		Static520.anInt1936 = 0;
		Static61.anInt1174 = 0;
		Static71.aClass127_13.method3204();
		Static316.aClass249_33.method6530();
		Static354.aClass249_38.method6530();
		Static369.aClass107_7.method2838();
		Static357.aClass127_36.method3204();
		Static465.aClass249_64 = new Class249();
		Static84.aClass302_1.method7515();
		Static43.method827();
		Static274.anInt4992 = 0;
		Static494.anInt8674 = 0;
		Static441.anInt8031 = 0;
		Static284.anInt9395 = 0;
		Static278.anInt5109 = 0;
		Static269.anInt4939 = 0;
		Static68.anInt1456 = 0;
		Static329.anInt3845 = 0;
		Static212.anInt3814 = 0;
		Static537.anInt9322 = 0;
		for (@Pc(7167) int local7167 = 0; local7167 < Static399.anIntArray113.length; local7167++) {
			if (!Static432.aBooleanArray35[local7167]) {
				Static399.anIntArray113[local7167] = -1;
			}
		}
		if (Static387.anInt7341 != -1) {
			Static277.method4362(Static387.anInt7341);
		}
		for (@Pc(7198) Class2_Sub9 local7198 = (Class2_Sub9) Static110.aClass127_21.method3203(); local7198 != null; local7198 = (Class2_Sub9) Static110.aClass127_21.method3212()) {
			if (!local7198.method7799()) {
				local7198 = (Class2_Sub9) Static110.aClass127_21.method3203();
				if (local7198 == null) {
					break;
				}
			}
			Static368.method5870(true, local7198, false);
		}
		Static387.anInt7341 = -1;
		Static110.aClass127_21 = new Class127(8);
		Static266.method4290();
		Static126.aClass310_16 = null;
		for (@Pc(7238) int local7238 = 0; local7238 < 8; local7238++) {
			Static239.aStringArray42[local7238] = null;
			Static25.aBooleanArray8[local7238] = false;
			Static278.anIntArray452[local7238] = -1;
		}
		Static471.method7072();
		Static105.aBoolean148 = true;
		for (@Pc(7262) int local7262 = 0; local7262 < 100; local7262++) {
			Static368.aBooleanArray32[local7262] = true;
		}
		for (@Pc(7276) int local7276 = 0; local7276 < 6; local7276++) {
			Static472.aClass264Array4[local7276] = new Class264();
		}
		for (@Pc(7292) int local7292 = 0; local7292 < 25; local7292++) {
			Static121.anIntArray313[local7292] = 0;
			Static454.anIntArray634[local7292] = 0;
			Static450.anIntArray626[local7292] = 0;
		}
		Static330.method3998();
		Static253.aBoolean338 = true;
		Static433.aShortArray86 = Static23.aShortArray18 = Static377.aShortArray91 = Static237.aShortArray71 = new short[256];
		Static62.aString37 = Static16.aClass202_11.method5139(Static172.anInt6352);
		Static199.anInt3587 = 0;
		Static281.aClass2_Sub19_Sub1_1.aBoolean203 = false;
		Static281.aClass2_Sub19_Sub1_1.aBoolean199 = false;
		Static512.method7485();
		Static383.method5988();
		Static340.aLong160 = 0L;
		Static374.aClass2_Sub51_1 = null;
		Static163.aClass53_50.anInt1684 = 2;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(ZB)V")
	public static void method6947(@OriginalArg(0) boolean arg0) {
		Static257.method4030(arg0, Static461.anInt8348, Static223.anInt3996, Static387.anInt7341);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method6948(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(15) short[] local15 = new short[16];
		@Pc(17) int local17 = 0;
		@Pc(23) int local23 = arg0 ? 32768 : 0;
		@Pc(34) int local34 = local23 + (arg0 ? Static389.aClass64_1.anInt1927 : Static389.aClass64_1.anInt1928);
		for (@Pc(36) int local36 = local23; local36 < local34; local36++) {
			@Pc(43) Class2_Sub13_Sub17 local43 = Static389.aClass64_1.method1878(local36);
			if (local43.aBoolean607 && local43.method7055().toLowerCase().indexOf(local8) != -1) {
				if (local17 >= 50) {
					Static319.anInt5969 = -1;
					Static206.aShortArray70 = null;
					return;
				}
				if (local17 >= local15.length) {
					@Pc(74) short[] local74 = new short[local15.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local17; local76++) {
						local74[local76] = local15[local76];
					}
					local15 = local74;
				}
				local15[local17++] = (short) local36;
			}
		}
		Static155.anInt2821 = 0;
		Static206.aShortArray70 = local15;
		Static319.anInt5969 = local17;
		@Pc(113) String[] local113 = new String[Static319.anInt5969];
		for (@Pc(115) int local115 = 0; local115 < Static319.anInt5969; local115++) {
			local113[local115] = Static389.aClass64_1.method1878(local15[local115]).method7055();
		}
		Static260.method4054(local113, Static206.aShortArray70);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg1;
		@Pc(21) int local21 = arg4 - arg1;
		@Pc(25) int local25 = arg5 * arg5;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg4 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local25 * (1 - local57) + local41;
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local33 * (1 - local61) + local49;
		@Pc(96) int local96 = local37 - (local61 - 1) * local53;
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = (local57 - 3) * local45;
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = (local61 - 3) * local53;
		@Pc(134) int local134 = local104;
		@Pc(148) int local148 = local100 * (arg4 - 1);
		@Pc(150) int local150 = local112;
		@Pc(156) int local156 = (local21 - 1) * local108;
		@Pc(160) int[] local160 = Static130.anIntArrayArray89[arg0];
		Static403.method6377(arg3, local160, arg2 - local16, -arg5 + arg2);
		Static403.method6377(arg6, local160, arg2 + local16, arg2 - local16);
		Static403.method6377(arg3, local160, arg2 + arg5, local16 + arg2);
		while (local9 > 0) {
			@Pc(202) boolean local202 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local78 += local134;
					local70 += local116;
					local7++;
					local116 += local104;
					local134 += local104;
				}
			}
			if (local202) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local150;
						local87 += local126;
						local11++;
						local150 += local112;
						local126 += local112;
					}
				}
				if (local96 < 0) {
					local87 += local126;
					local96 += local150;
					local126 += local112;
					local11++;
					local150 += local112;
				}
				local87 += -local156;
				local96 += -local132;
				local132 -= local108;
				local156 -= local108;
			}
			if (local78 < 0) {
				local78 += local134;
				local70 += local116;
				local134 += local104;
				local116 += local104;
				local7++;
			}
			local78 += -local122;
			local70 += -local148;
			local9--;
			local122 -= local100;
			local148 -= local100;
			@Pc(336) int local336 = arg0 - local9;
			@Pc(340) int local340 = local9 + arg0;
			@Pc(344) int local344 = arg2 + local7;
			@Pc(349) int local349 = arg2 - local7;
			if (local202) {
				@Pc(373) int local373 = arg2 + local11;
				@Pc(378) int local378 = arg2 - local11;
				Static403.method6377(arg3, Static130.anIntArrayArray89[local336], local378, local349);
				Static403.method6377(arg6, Static130.anIntArrayArray89[local336], local373, local378);
				Static403.method6377(arg3, Static130.anIntArrayArray89[local336], local344, local373);
				Static403.method6377(arg3, Static130.anIntArrayArray89[local340], local378, local349);
				Static403.method6377(arg6, Static130.anIntArrayArray89[local340], local373, local378);
				Static403.method6377(arg3, Static130.anIntArrayArray89[local340], local344, local373);
			} else {
				Static403.method6377(arg3, Static130.anIntArrayArray89[local336], local344, local349);
				Static403.method6377(arg3, Static130.anIntArrayArray89[local340], local344, local349);
			}
		}
	}
}
