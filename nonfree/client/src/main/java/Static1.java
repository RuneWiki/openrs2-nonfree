import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!ij;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "I")
	public static int anInt9;

	@OriginalMember(owner = "client!a", name = "S", descriptor = "[Lclient!ae;")
	public static Class6_Sub1[] aClass6_Sub1Array1;

	@OriginalMember(owner = "client!a", name = "gb", descriptor = "Lclient!ij;")
	public static Class93 aClass93_2;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_1 = new Class85("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!a", name = "U", descriptor = "Lclient!ka;")
	public static Class109 aClass109_1 = new Class109(64);

	@OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
	public static int anInt10 = 0;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	public static void method2() {
		if (Static110.aFrame4 != null) {
			return;
		}
		@Pc(13) int local13 = Static84.anInt4252;
		@Pc(15) int local15 = Static134.anInt2040;
		@Pc(23) int local23 = anInt9 - local13 - Static168.anInt3376;
		@Pc(31) int local31 = Static32.anInt632 - local15 - Static256.anInt5066;
		if (local13 <= 0 && local23 <= 0 && local15 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(47) Container local47;
			if (Static60.aFrame3 == null) {
				local47 = Static182.aClass139_5.anApplet1;
			} else {
				local47 = Static60.aFrame3;
			}
			@Pc(52) int local52 = 0;
			@Pc(54) int local54 = 0;
			if (local47 == Static60.aFrame3) {
				@Pc(60) Insets local60 = Static60.aFrame3.getInsets();
				local54 = local60.top;
				local52 = local60.left;
			}
			@Pc(69) Graphics local69 = local47.getGraphics();
			local69.setColor(Color.black);
			if (local13 > 0) {
				local69.fillRect(local52, local54, local13, Static32.anInt632);
			}
			if (local15 > 0) {
				local69.fillRect(local52, local54, anInt9, local15);
			}
			if (local23 > 0) {
				local69.fillRect(local52 + anInt9 - local23, local54, local23, Static32.anInt632);
			}
			if (local31 > 0) {
				local69.fillRect(local52, Static32.anInt632 + local54 - local31, anInt9, local31);
				return;
			}
		} catch (@Pc(117) Exception local117) {
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
	public static void method3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static178.aClass174ArrayArrayArray3[0][arg1][arg2] != null && Static178.aClass174ArrayArrayArray3[0][arg1][arg2].aClass174_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static178.aClass174ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class174 local46 = Static178.aClass174ArrayArrayArray3[local22][arg1][arg2] = new Class174(local22, arg1, arg2);
				if (local20) {
					local46.aByte44++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLclient!ea;)V")
	public static void method6(@OriginalArg(1) Class55 arg0) {
		@Pc(7) int local7 = Static187.anInt3710;
		@Pc(9) int local9 = Static141.anInt2737;
		@Pc(11) int local11 = Static334.anInt6466;
		@Pc(15) int local15 = Static127.anInt2450 - 3;
		if (Static300.aClass95_13 == null || Static170.aClass95_9 == null) {
			if (Static244.aClass93_93.method2414(Static45.anInt825) && Static244.aClass93_93.method2414(Static20.anInt433)) {
				Static300.aClass95_13 = arg0.method5229(Static363.method2672(Static244.aClass93_93, Static45.anInt825, 0));
				@Pc(44) Class100 local44 = Static363.method2672(Static244.aClass93_93, Static20.anInt433, 0);
				Static170.aClass95_9 = arg0.method5229(local44);
				local44.method2680();
				Static74.aClass95_4 = arg0.method5229(local44);
			} else {
				arg0.method5205(local7, local9, local11, 20, Static148.anInt2904 | 255 - Static306.anInt5964 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static300.aClass95_13 != null && Static170.aClass95_9 != null) {
			local88 = (local11 - Static170.aClass95_9.method5503() * 2) / Static300.aClass95_13.method5503();
			for (local90 = 0; local90 < local88; local90++) {
				Static300.aClass95_13.method5491(Static170.aClass95_9.method5503() + local7 + Static300.aClass95_13.method5503() * local90, local9);
			}
			Static170.aClass95_9.method5491(local7, local9);
			Static74.aClass95_4.method5491(local11 + local7 - Static74.aClass95_4.method5503(), local9);
		}
		Static77.aClass18_1.method4174(local7 + 3, Static23.anInt485 | 0xFF000000, local9 + 14, -1, Static8.aClass85_6.method2020(Static41.anInt726));
		arg0.method5205(local7, local9 + 20, local11, local15 - 20, Static148.anInt2904 | -Static306.anInt5964 + 255 << 24, 1);
		local88 = Static316.aClass118_3.method4054();
		local90 = Static316.aClass118_3.method4050();
		@Pc(190) int local190;
		for (@Pc(172) int local172 = 0; local172 < Static160.anInt3181; local172++) {
			local190 = (Static160.anInt3181 - local172 - 1) * 16 + local9 + 13 + 20;
			if (local88 > local7 && local88 < local7 + local11 && local90 > local190 - 13 && local190 + 4 > local90) {
				arg0.method5205(local7, local190 - 12, local11, 16, 255 - Static178.anInt3533 << 24 | Static5.anInt92, 1);
			}
		}
		if ((Static17.aClass95_1 == null || Static325.aClass95_14 == null || Static86.aClass95_5 == null) && Static244.aClass93_93.method2414(Static269.anInt5285) && Static244.aClass93_93.method2414(Static131.anInt2532) && Static244.aClass93_93.method2414(Static278.anInt5488)) {
			@Pc(267) Class100 local267 = Static363.method2672(Static244.aClass93_93, Static131.anInt2532, 0);
			Static325.aClass95_14 = arg0.method5229(local267);
			local267.method2680();
			Static115.aClass95_8 = arg0.method5229(local267);
			Static17.aClass95_1 = arg0.method5229(Static363.method2672(Static244.aClass93_93, Static269.anInt5285, 0));
			@Pc(292) Class100 local292 = Static363.method2672(Static244.aClass93_93, Static278.anInt5488, 0);
			Static86.aClass95_5 = arg0.method5229(local292);
			local292.method2680();
			Static48.aClass95_2 = arg0.method5229(local292);
		}
		@Pc(357) int local357;
		@Pc(359) int local359;
		if (Static17.aClass95_1 != null && Static325.aClass95_14 != null && Static86.aClass95_5 != null) {
			local190 = (local11 - Static86.aClass95_5.method5503() * 2) / Static17.aClass95_1.method5503();
			for (@Pc(322) int local322 = 0; local322 < local190; local322++) {
				Static17.aClass95_1.method5491(Static86.aClass95_5.method5503() + local7 + Static17.aClass95_1.method5503() * local322, local9 - -local15 - Static17.aClass95_1.method5506());
			}
			local357 = (local15 - Static86.aClass95_5.method5506() - 20) / Static325.aClass95_14.method5506();
			for (local359 = 0; local359 < local357; local359++) {
				Static325.aClass95_14.method5491(local7, local9 + Static325.aClass95_14.method5506() * local359 + 20);
				Static115.aClass95_8.method5491(local7 + local11 - Static115.aClass95_8.method5503(), Static325.aClass95_14.method5506() * local359 + local9 - -20);
			}
			Static86.aClass95_5.method5491(local7, local15 + local9 - Static86.aClass95_5.method5506());
			Static48.aClass95_2.method5491(local7 + local11 - Static86.aClass95_5.method5503(), -Static86.aClass95_5.method5506() + local15 + local9);
		}
		local190 = 0;
		for (@Pc(438) Class5_Sub20 local438 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2756(); local438 != null; local438 = (Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.method2748()) {
			local357 = local9 + (Static160.anInt3181 - local190 + -1) * 16 + 33;
			local359 = Static23.anInt485 | 0xFF000000;
			if (local88 > local7 && local7 + local11 > local88 && local90 > local357 - 13 && local357 + 4 > local90) {
				local359 = Static317.anInt6172 | 0xFF000000;
			}
			@Pc(492) int[] local492 = null;
			if (Static96.method1758(local438.anInt2094)) {
				local492 = Static322.method544((int) local438.aLong73).anIntArray385;
			} else if (Static60.method1846(local438.anInt2094)) {
				@Pc(508) Class4_Sub5_Sub2_Sub2 local508 = Static280.aClass4_Sub5_Sub2_Sub2Array1[(int) local438.aLong73];
				if (local508 != null) {
					local492 = local508.aClass106_1.anIntArray323;
				}
			} else if (Static134.method1927(local438.anInt2094)) {
				if (local438.anInt2094 == 1011) {
					local492 = Static111.method1967((int) local438.aLong73).anIntArray436;
				} else {
					local492 = Static111.method1967((int) (local438.aLong73 >>> 32 & 0x7FFFFFFFL)).anIntArray436;
				}
			}
			@Pc(555) String local555 = Static124.method2199(local438);
			if (local492 != null) {
				local555 = local555 + Static7.method121(local492);
			}
			local190++;
			Static77.aClass18_1.method4173(Static34.anIntArray70, local555, Static303.aClass95Array15, local359, local357, local7 + 3);
		}
		Static142.method2518(Static334.anInt6466, Static127.anInt2450, Static187.anInt3710, Static141.anInt2737);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLclient!ms;)V")
	public static void method7(@OriginalArg(1) Class32_Sub4 arg0) {
		arg0.aClass4_1 = null;
		@Pc(12) int local12 = arg0.aClass32_Sub8Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			arg0.aClass32_Sub8Array1[local18].aBoolean520 = false;
		}
		@Pc(36) Class39[] local36 = Class5_Sub3_Sub11.aClass39Array1;
		synchronized (Class5_Sub3_Sub11.aClass39Array1) {
			if (local12 < Class5_Sub3_Sub11.aClass39Array1.length && Static158.anIntArray520[local12] < 200) {
				Class5_Sub3_Sub11.aClass39Array1[local12].method809(arg0);
				@Pc(57) int local57 = Static158.anIntArray520[local12]++;
			}
		}
	}
}
