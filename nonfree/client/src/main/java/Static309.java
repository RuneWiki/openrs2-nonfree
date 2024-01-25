import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
	public static int anInt6049;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_127 = new Class85("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!th", name = "S", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_146 = new Class103();

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V")
	public static void method5417() {
		Static101.anInt1914 = -1;
		Static98.aClass95_7 = null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!rg;)V")
	public static void method5418(@OriginalArg(1) Class5_Sub12 arg0) {
		if (arg0.aByteArray90.length - arg0.anInt5731 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5115();
		if (local19 < 0 || local19 > 15) {
			return;
		}
		@Pc(32) byte local32;
		if (local19 == 15) {
			local32 = 37;
		} else if (local19 == 14) {
			local32 = 36;
		} else if (local19 == 13) {
			local32 = 35;
		} else if (local19 == 12) {
			local32 = 34;
		} else if (local19 == 11) {
			local32 = 33;
		} else if (local19 == 10) {
			local32 = 32;
		} else if (local19 == 9) {
			local32 = 31;
		} else if (local19 == 8) {
			local32 = 30;
		} else if (local19 == 7) {
			local32 = 29;
		} else if (local19 == 6) {
			local32 = 28;
		} else if (local19 == 5) {
			local32 = 28;
		} else if (local19 == 4) {
			local32 = 24;
		} else if (local19 == 3) {
			local32 = 23;
		} else if (local19 == 2) {
			local32 = 22;
		} else if (local19 == 1) {
			local32 = 23;
		} else {
			local32 = 19;
		}
		if (arg0.aByteArray90.length - arg0.anInt5731 < local32) {
			return;
		}
		Static192.anInt3806 = arg0.method5115();
		if (Static192.anInt3806 < 1) {
			Static192.anInt3806 = 1;
		} else if (Static192.anInt3806 > 4) {
			Static192.anInt3806 = 4;
		}
		Static187.method3351(arg0.method5115() == 1);
		Static215.aBoolean349 = arg0.method5115() == 1;
		Static323.aBoolean522 = arg0.method5115() == 1;
		Static352.aBoolean585 = arg0.method5115() == 1;
		Static136.anInt2582 = arg0.method5115() == 1 ? 1 : 0;
		Static178.aBoolean274 = arg0.method5115() == 1;
		Static306.aBoolean497 = arg0.method5115() == 1;
		Static157.aBoolean233 = arg0.method5115() == 1;
		Static95.anInt1828 = arg0.method5115();
		if (Static95.anInt1828 > 2) {
			Static95.anInt1828 = 2;
		}
		if (local19 < 2) {
			Static280.aBoolean452 = arg0.method5115() == 1;
			arg0.method5115();
		} else {
			Static280.aBoolean452 = arg0.method5115() == 1;
		}
		Static248.aBoolean414 = arg0.method5115() == 1;
		Static34.aBoolean42 = arg0.method5115() == 1;
		Static278.anInt5486 = arg0.method5115();
		if (Static278.anInt5486 > 2) {
			Static278.anInt5486 = 2;
		}
		Static44.anInt747 = Static278.anInt5486;
		Static230.aBoolean379 = arg0.method5115() == 1;
		Static226.anInt4453 = arg0.method5115();
		if (Static226.anInt4453 > 127) {
			Static226.anInt4453 = 127;
		}
		Static349.anInt6699 = arg0.method5115();
		Static263.anInt5208 = arg0.method5115();
		if (Static263.anInt5208 > 127) {
			Static263.anInt5208 = 127;
		}
		if (local19 >= 1) {
			Static211.anInt4178 = arg0.method5106();
			Static124.anInt2371 = arg0.method5106();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method5115();
		}
		@Pc(397) int local397;
		if (local19 >= 4) {
			local397 = arg0.method5115();
			if (local397 < 0 || local397 > 2) {
				local397 = 0;
			}
			if (Static345.anInt6645 < 96) {
				local397 = 0;
			}
			Static229.method4132(local397);
		}
		if (local19 >= 5) {
			Static208.anInt4114 = arg0.method5067();
		}
		local397 = 0;
		if (local19 >= 6) {
			Static223.anInt4410 = local397 = arg0.method5115();
		}
		if (Static223.anInt4410 != 1 && Static223.anInt4410 != 2) {
			Static223.anInt4410 = 2;
		}
		if (local19 >= 7) {
			Static118.aBoolean168 = arg0.method5115() == 1;
		}
		if (local19 >= 8) {
			Static131.aBoolean194 = arg0.method5115() == 1;
		}
		if (local19 >= 9) {
			Static161.anInt3186 = arg0.method5115();
		}
		if (Static161.anInt3186 < 0 || Static161.anInt3186 > Static8.method169(Static345.anInt6645)) {
			Static161.anInt3186 = 0;
		}
		if (local19 >= 10) {
			Static209.aBoolean344 = arg0.method5115() != 0;
		}
		if (local19 >= 11) {
			Static351.aBoolean584 = arg0.method5115() != 0;
		}
		if (local19 >= 12) {
			Static136.anInt2582 = arg0.method5115();
		}
		if (Static136.anInt2582 < 0 || Static136.anInt2582 > 2) {
			Static136.anInt2582 = 1;
		}
		if (local19 >= 13) {
			Static326.aBoolean530 = arg0.method5115() == 1;
		}
		if (local19 >= 14) {
			Static254.anInt5030 = arg0.method5115();
		} else if (local397 == 0) {
			Static254.anInt5030 = 2;
		} else {
			Static254.anInt5030 = 1;
		}
		if (Static254.anInt5030 < 0 || Static254.anInt5030 > 3) {
			Static254.anInt5030 = 2;
		}
		if (local19 >= 15) {
			Static344.anInt6622 = arg0.method5115();
			if (Static344.anInt6622 < 0 || Static344.anInt6622 > 4) {
				Static344.anInt6622 = Static26.anInt514 == 1 ? 2 : 4;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;Lclient!ne;ZZZ)V")
	public static void method5419(@OriginalArg(0) String arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3) {
			Static343.method5884(3, arg1, arg0);
			return;
		}
		@Pc(18) String local18;
		if (Static210.aString33.startsWith("win") && Static210.anInt4168 != 3) {
			local18 = null;
			if (arg1.anApplet1 != null) {
				local18 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local18 == null || !local18.equals("1")) {
				@Pc(38) Class16 local38 = Static343.method5884(0, arg1, arg0);
				Static223.aClass16_7 = local38;
				Static273.aString52 = arg0;
				Static75.aClass139_4 = arg1;
				return;
			}
		}
		if (Static210.aString33.startsWith("mac")) {
			local18 = null;
			if (arg1.anApplet1 != null) {
				local18 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local18 != null && local18.equals("1") && arg2) {
				Static343.method5884(1, arg1, arg0);
				return;
			}
		}
		Static343.method5884(2, arg1, arg0);
	}

	@OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
	public static void method5420() {
		if (Static317.aBoolean513 && Static174.aClass2_1.method1425(81) && Static160.anInt3181 > 2) {
			Static2.method1432((Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.aClass5_114.aClass5_252.aClass5_252);
		} else {
			Static2.method1432((Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.aClass5_114.aClass5_252);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZB)I")
	public static int method5422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class5_Sub14 local8 = Static319.method5550(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray128.length > arg1) {
			return local8.anIntArray128[arg1];
		} else {
			return 0;
		}
	}
}
