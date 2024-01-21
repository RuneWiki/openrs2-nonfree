import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Lclient!ph;")
	public static Class66 aClass66_40;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!md;")
	public static Class51 aClass51_13 = new Class51(512);

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
	public static int anInt4252 = 0;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1172 = Static158.method3034("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[5][5000];

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	public static int anInt4254 = 0;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public static int anInt4255 = 0;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "[I")
	public static final int[] anIntArray463 = new int[256];

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ob;")
	public static Class60 method3264(@OriginalArg(0) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class60 local18 = new Class60();
		local18.aByteArray39 = local9;
		local18.anInt3466 = 0;
		for (@Pc(31) int local31 = 0; local31 < local9.length; local31++) {
			if (local9[local31] != 0) {
				local9[local18.anInt3466++] = local9[local31];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method3265() {
		while (true) {
			if (Static139.aClass2_Sub3_Sub1_32.method248(Static168.anInt4121) >= 11) {
				@Pc(18) int local18 = Static139.aClass2_Sub3_Sub1_32.method246(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local18] == null) {
						local25 = true;
						Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local18] = new Class2_Sub1_Sub1_Sub3_Sub1();
						if (Static14.aClass2_Sub3Array1[local18] != null) {
							Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local18].method902(Static14.aClass2_Sub3Array1[local18]);
						}
					}
					Static169.anIntArray458[Static166.anInt4101++] = local18;
					@Pc(61) Class2_Sub1_Sub1_Sub3_Sub1 local61 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local18];
					local61.anInt3299 = Static20.anInt580;
					@Pc(69) int local69 = Static139.aClass2_Sub3_Sub1_32.method246(1);
					if (local69 == 1) {
						Static113.anIntArray361[Static148.anInt3844++] = local18;
					}
					@Pc(85) int local85 = Static139.aClass2_Sub3_Sub1_32.method246(5);
					if (local85 > 15) {
						local85 -= 32;
					}
					@Pc(96) int local96 = Static48.anIntArray141[Static139.aClass2_Sub3_Sub1_32.method246(3)];
					if (local25) {
						local61.anInt3255 = local61.anInt3265 = local96;
					}
					@Pc(109) int local109 = Static139.aClass2_Sub3_Sub1_32.method246(5);
					if (local109 > 15) {
						local109 -= 32;
					}
					@Pc(120) int local120 = Static139.aClass2_Sub3_Sub1_32.method246(1);
					local61.method2555(local109 + Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0] - -local85, local120 == 1);
					continue;
				}
			}
			Static139.aClass2_Sub3_Sub1_32.method253();
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BIIII)V")
	public static void method3266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static133.method2110(arg1, arg3, arg1 + arg0, arg2 + arg3);
		Static45.method1048();
		Static46.anInt1431++;
		Static63.method1446(true);
		Static194.method3539(true);
		Static63.method1446(false);
		Static194.method3539(false);
		Static196.method3548();
		Static75.method1834();
		@Pc(46) int local46;
		@Pc(44) int local44;
		if (!Static31.aBoolean40) {
			local44 = Static188.anInt4484 + Static193.anInt4599 & 0x7FF;
			local46 = Static138.anInt686;
			if (Static55.anInt1772 / 256 > local46) {
				local46 = Static55.anInt1772 / 256;
			}
			if (Static171.aBooleanArray15[4] && Static126.anIntArray396[4] + 128 > local46) {
				local46 = Static126.anIntArray396[4] + 128;
			}
			Static171.method3183(Static182.method3393(Static62.anInt1923, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273) - 50, local44, Static197.anInt4652, local46, local46 * 3 + 600, Static91.anInt2663);
		}
		if (Static31.aBoolean40) {
			local46 = Static158.method3033();
		} else {
			local46 = Static107.method2407();
		}
		local44 = Static161.anInt4013;
		@Pc(114) int local114 = Static172.anInt4190;
		@Pc(116) int local116 = Static166.anInt4103;
		@Pc(118) int local118 = Static19.anInt3094;
		@Pc(120) int local120 = Static158.anInt4007;
		@Pc(164) int local164;
		for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
			if (Static171.aBooleanArray15[local122]) {
				local164 = (int) ((double) -Static162.anIntArray446[local122] + Math.random() * (double) (Static162.anIntArray446[local122] * 2 + 1) + Math.sin((double) Static30.anIntArray97[local122] / 100.0D * (double) Static151.anIntArray292[local122]) * (double) Static126.anIntArray396[local122]);
				if (local122 == 4) {
					Static19.anInt3094 += local164;
					if (Static19.anInt3094 < 128) {
						Static19.anInt3094 = 128;
					}
					if (Static19.anInt3094 > 383) {
						Static19.anInt3094 = 383;
					}
				}
				if (local122 == 3) {
					Static158.anInt4007 = Static158.anInt4007 + local164 & 0x7FF;
				}
				if (local122 == 0) {
					Static161.anInt4013 += local164;
				}
				if (local122 == 1) {
					Static172.anInt4190 += local164;
				}
				if (local122 == 2) {
					Static166.anInt4103 += local164;
				}
			}
		}
		@Pc(226) int local226 = Static157.anInt3985;
		local164 = Static131.anInt215;
		if (arg1 <= local164 && local164 < arg1 + arg0 && local226 >= arg3 && local226 < arg2 + arg3) {
			Static84.aBoolean99 = true;
			Static182.anInt4410 = Static131.anInt215 - arg1;
			Static125.anInt3409 = 0;
			Static57.anInt1788 = Static157.anInt3985 - arg3;
		} else {
			Static84.aBoolean99 = false;
			Static125.anInt3409 = 0;
		}
		Static107.method2406();
		Static133.method2120(arg1, arg3, arg0, arg2, 0);
		Static107.method2406();
		Static102.method2332(Static161.anInt4013, Static172.anInt4190, Static166.anInt4103, Static19.anInt3094, Static158.anInt4007, local46);
		Static107.method2406();
		Static57.method1338();
		Static144.method2911(arg2, arg1, arg3, arg0);
		Static53.method1254(arg3, arg1);
		((Class68) Static45.anInterface1_2).method2888(Static35.anInt3071);
		Static189.method3455(arg2, arg3, arg0, arg1);
		Static166.anInt4103 = local116;
		Static161.anInt4013 = local44;
		Static158.anInt4007 = local120;
		Static19.anInt3094 = local118;
		Static172.anInt4190 = local114;
		if (Static126.aBoolean127 && Static31.method770() == 0) {
			Static126.aBoolean127 = false;
		}
		if (Static126.aBoolean127) {
			Static133.method2120(arg1, arg3, arg0, arg2, 0);
			Static52.method1233(false, Static165.aClass60_1119);
		}
		if (!Static126.aBoolean127 && !Static103.aBoolean115 && arg1 <= local164 && local164 < arg1 + arg0 && arg3 <= local226 && local226 < arg2 + arg3) {
			Static100.method2285(local226, arg1, arg3, local164);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z[Lclient!ob;)[Lclient!ob;")
	public static Class60[] method3268(@OriginalArg(1) Class60[] arg0) {
		@Pc(13) Class60[] local13 = new Class60[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static193.method3536(new Class60[] { Static72.method1661(local15), Static114.aClass60_893 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static193.method3536(new Class60[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(JZ)Lclient!ob;")
	public static Class60 method3269(@OriginalArg(0) long arg0) {
		Static9.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static9.aCalendar1.get(7);
		@Pc(17) int local17 = Static9.aCalendar1.get(5);
		@Pc(21) int local21 = Static9.aCalendar1.get(2);
		@Pc(25) int local25 = Static9.aCalendar1.get(1);
		@Pc(29) int local29 = Static9.aCalendar1.get(11);
		@Pc(33) int local33 = Static9.aCalendar1.get(12);
		@Pc(44) int local44 = Static9.aCalendar1.get(13);
		return Static193.method3536(new Class60[] { Static70.aClass60Array13[local13 - 1], Static15.aClass60_121, Static72.method1661(local17 / 10), Static72.method1661(local17 % 10), Static110.aClass60_869, Static63.aClass60Array11[local21], Static110.aClass60_869, Static72.method1661(local25), Static40.aClass60_292, Static72.method1661(local29 / 10), Static72.method1661(local29 % 10), Static32.aClass60_236, Static72.method1661(local33 / 10), Static72.method1661(local33 % 10), Static32.aClass60_236, Static72.method1661(local44 / 10), Static72.method1661(local44 % 10), Static123.aClass60_944 });
	}
}
