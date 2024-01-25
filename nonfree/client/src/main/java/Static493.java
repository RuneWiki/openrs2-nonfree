import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!qt", name = "Q", descriptor = "I")
	public static int anInt8807;

	@OriginalMember(owner = "client!qt", name = "U", descriptor = "J")
	public static long aLong239 = 0L;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIILclient!rja;)V")
	public static void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class304 arg2) {
		Static610.aClass304ArrayArray1[arg1][arg0] = arg2;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!pf;II)V")
	public static void method7314(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1) {
		if (Static4.anInt29 >= 50 || (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null)) {
			return;
		}
		@Pc(38) int local38 = arg0.anIntArrayArray47[arg1][0];
		@Pc(42) int local42 = local38 >> 8;
		@Pc(48) int local48 = local38 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local65 > 0) {
				local42 = arg0.anIntArrayArray47[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray600 != null && arg0.anIntArray603 != null) {
			local65 = Static549.method7756(arg0.anIntArray603[arg1], arg0.anIntArray600[arg1]);
		}
		if (arg0.aBoolean542) {
			Static503.method7357(local65, 255, 0, false, local42, local48);
		} else {
			Static143.method2260(255, 0, local48, local42, local65);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method7315() {
		@Pc(7) String local7 = "www";
		if (Static508.aClass240_6 == Static513.aClass240_7) {
			local7 = "www-wtrc";
		} else if (Static513.aClass240_7 == Static380.aClass240_4) {
			local7 = "www-wtqa";
		} else if (Static513.aClass240_7 == Static133.aClass240_2) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static273.aString55 != null) {
			local28 = "/p=" + Static273.aString55;
		}
		return "http://" + local7 + "." + Static630.aClass77_8.aString27 + ".com/l=" + Static232.anInt4258 + "/a=" + Static349.anInt6487 + local28 + "/";
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7316(@OriginalArg(1) Class137 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static128.aBoolean202) {
			local7 = Static619.method8679();
			local9 = Static571.method8194();
		}
		@Pc(22) int local22 = Static222.anInt4164 + local7;
		@Pc(26) int local26 = local9 + Static370.anInt10482;
		@Pc(28) int local28 = Static189.anInt3555;
		@Pc(32) int local32 = Static624.anInt10515 - 3;
		Static504.method7375(Static514.aClass303_26.method7473(Static232.anInt4258), Static189.anInt3555, Static222.anInt4164 + local7, arg0, Static624.anInt10515, Static370.anInt10482 + local9);
		@Pc(56) int local56 = local7 + Static666.aClass79_1.method3361();
		@Pc(62) int local62 = Static666.aClass79_1.method3358() + local9;
		@Pc(66) int local66;
		@Pc(71) Class14_Sub3_Sub21 local71;
		@Pc(83) int local83;
		@Pc(184) int local184;
		@Pc(257) Class14_Sub3_Sub11 local257;
		@Pc(172) Class14_Sub3_Sub11 local172;
		if (Static436.aBoolean534) {
			local66 = 0;
			for (local71 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1826(); local71 != null; local71 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1827()) {
				local83 = local26 + local66 * 16 + 13 + 20;
				if (local7 + Static222.anInt4164 < local56 && local56 < Static222.anInt4164 + local7 + Static189.anInt3555 && local62 > local83 - 13 && local83 + 4 > local62 && (local71.anInt11129 > 1 || ((Class14_Sub3_Sub11) local71.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67).aBoolean326)) {
					arg0.aa(local7 + Static222.anInt4164, local83 + -12, Static189.anInt3555, 16, 255 - Static640.anInt2935 << 24 | Static615.anInt10350, 1);
				}
				local66++;
			}
			if (Static665.aClass14_Sub3_Sub21_4 != null) {
				Static504.method7375(Static665.aClass14_Sub3_Sub21_4.aString119, Static62.anInt9091, Static652.anInt10893, arg0, Static623.anInt10488, Static539.anInt9256);
				local66 = 0;
				for (local172 = (Class14_Sub3_Sub11) Static665.aClass14_Sub3_Sub21_4.aClass73_13.method1826(); local172 != null; local172 = (Class14_Sub3_Sub11) Static665.aClass14_Sub3_Sub21_4.aClass73_13.method1827()) {
					local184 = local66 * 16 + Static539.anInt9256 + 13 + 20;
					if (Static652.anInt10893 < local56 && Static652.anInt10893 + Static62.anInt9091 > local56 && local62 > local184 - 13 && local62 < local184 + 4 && local172.aBoolean326) {
						arg0.aa(Static652.anInt10893, local184 - 12, Static62.anInt9091, 16, 255 - Static640.anInt2935 << 24 | Static615.anInt10350, 1);
					}
					local66++;
				}
				Static594.method8428(Static62.anInt9091, arg0, Static652.anInt10893, Static539.anInt9256, Static623.anInt10488);
			}
		} else {
			local66 = 0;
			for (local257 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6318(); local257 != null; local257 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6311()) {
				local83 = (Static313.anInt9044 - local66 - 1) * 16 + local26 + 13 + 20;
				if (Static222.anInt4164 + local7 < local56 && local7 + Static222.anInt4164 + Static189.anInt3555 > local56 && local83 - 13 < local62 && local62 < local83 + 4 && local257.aBoolean326) {
					arg0.aa(Static222.anInt4164 + local7, local83 + -12, Static189.anInt3555, 16, Static615.anInt10350 | 255 - Static640.anInt2935 << 24, 1);
				}
				local66++;
			}
		}
		Static594.method8428(Static189.anInt3555, arg0, Static222.anInt4164 + local7, Static370.anInt10482 + local9, Static624.anInt10515);
		if (Static436.aBoolean534) {
			local66 = 0;
			for (local71 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1826(); local71 != null; local71 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1827()) {
				local83 = local66 * 16 + local9 + Static370.anInt10482 + 13 + 20;
				local66++;
				if (local71.anInt11129 == 1) {
					Static634.method8858(Static624.anInt10515, local56, Static222.anInt4164 + local7, arg0, Static370.anInt10482 + local9, local62, Static528.anInt9162 | 0xFF000000, Static189.anInt3555, Static27.anInt697 | 0xFF000000, local83, (Class14_Sub3_Sub11) local71.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67);
				} else {
					Static13.method127(local71, Static624.anInt10515, Static222.anInt4164 + local7, local62, arg0, Static528.anInt9162 | 0xFF000000, Static189.anInt3555, local9 + Static370.anInt10482, Static27.anInt697 | 0xFF000000, local56, local83);
				}
			}
			if (Static665.aClass14_Sub3_Sub21_4 != null) {
				local66 = 0;
				for (local172 = (Class14_Sub3_Sub11) Static665.aClass14_Sub3_Sub21_4.aClass73_13.method1826(); local172 != null; local172 = (Class14_Sub3_Sub11) Static665.aClass14_Sub3_Sub21_4.aClass73_13.method1827()) {
					local184 = Static539.anInt9256 + local66 * 16 + 20 + 13;
					Static634.method8858(Static623.anInt10488, local56, Static652.anInt10893, arg0, Static539.anInt9256, local62, Static528.anInt9162 | 0xFF000000, Static62.anInt9091, Static27.anInt697 | 0xFF000000, local184, local172);
					local66++;
				}
				Static555.method7801(Static652.anInt10893, Static623.anInt10488, Static539.anInt9256, Static62.anInt9091);
			}
		} else {
			local66 = 0;
			for (local257 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6318(); local257 != null; local257 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6311()) {
				local83 = (Static313.anInt9044 - local66 - 1) * 16 + local26 + 20 + 13;
				Static634.method8858(local32, local56, local22, arg0, local26, local62, Static528.anInt9162 | 0xFF000000, local28, Static27.anInt697 | 0xFF000000, local83, local257);
				local66++;
			}
		}
		Static555.method7801(Static222.anInt4164 + local7, Static624.anInt10515, local9 + Static370.anInt10482, Static189.anInt3555);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!wia;BLclient!ha;)V")
	public static void method7317(@OriginalArg(0) Class386 arg0, @OriginalArg(2) Class137 arg1) {
		@Pc(10) Class356[] local10 = Static688.method8628(arg0, Static550.anInt9398);
		Static357.aClass20Array8 = new Class20[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static357.aClass20Array8[local16] = arg1.method7951(local10[local16], true);
		}
		local10 = Static688.method8628(arg0, Static207.anInt3890);
		Static241.aClass20Array5 = new Class20[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static241.aClass20Array5[local43] = arg1.method7951(local10[local43], true);
		}
		local10 = Static688.method8628(arg0, Static499.anInt8831);
		Static414.aClass20Array11 = new Class20[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static414.aClass20Array11[local74] = arg1.method7951(local10[local74], true);
		}
		local10 = Static688.method8628(arg0, Static213.anInt4041);
		Static634.aClass20Array15 = new Class20[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static634.aClass20Array15[local105] = arg1.method7951(local10[local105], true);
		}
		local10 = Static688.method8628(arg0, Static420.anInt7569);
		Static367.aClass20Array9 = new Class20[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static367.aClass20Array9[local136] = arg1.method7951(local10[local136], true);
		}
		local10 = Static688.method8628(arg0, Static475.anInt8261);
		Static399.aClass20Array10 = new Class20[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static399.aClass20Array10[local163] = arg1.method7951(local10[local163], true);
		}
		local10 = Static688.method8628(arg0, Static506.anInt8938);
		Static347.aClass20Array7 = new Class20[local10.length];
		for (@Pc(190) int local190 = 0; local190 < local10.length; local190++) {
			Static347.aClass20Array7[local190] = arg1.method7951(local10[local190], true);
		}
		local10 = Static688.method8628(arg0, Static296.anInt6298);
		Static35.aClass20Array1 = new Class20[local10.length];
		for (@Pc(217) int local217 = 0; local217 < local10.length; local217++) {
			Static35.aClass20Array1[local217] = arg1.method7951(local10[local217], true);
		}
		local10 = Static688.method8628(arg0, Static465.anInt8177);
		Static434.aClass20Array12 = new Class20[local10.length];
		for (@Pc(248) int local248 = 0; local248 < local10.length; local248++) {
			Static434.aClass20Array12[local248] = arg1.method7951(local10[local248], true);
		}
		local10 = Static688.method8628(arg0, Static611.anInt10309);
		Static246.aClass20Array6 = new Class20[local10.length];
		for (@Pc(275) int local275 = 0; local275 < local10.length; local275++) {
			Static246.aClass20Array6[local275] = arg1.method7951(local10[local275], true);
		}
		local10 = Static688.method8628(arg0, Static200.anInt3716);
		Static575.aClass20Array14 = new Class20[local10.length];
		for (@Pc(306) int local306 = 0; local306 < local10.length; local306++) {
			Static575.aClass20Array14[local306] = arg1.method7951(local10[local306], true);
		}
		local10 = Static688.method8628(arg0, Static179.anInt3447);
		Static521.aClass20Array13 = new Class20[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static521.aClass20Array13[local337] = arg1.method7951(local10[local337], true);
		}
		Static40.aClass20_4 = arg1.method7951(Static688.method8619(arg0, Static180.anInt3466, 0), true);
		Static19.aClass20_24 = arg1.method7951(Static688.method8619(arg0, Static401.anInt7388, 0), true);
		local10 = Static688.method8628(arg0, Static459.anInt8008);
		Static53.aClass20Array2 = new Class20[local10.length];
		for (@Pc(391) int local391 = 0; local391 < local10.length; local391++) {
			Static53.aClass20Array2[local391] = arg1.method7951(local10[local391], true);
		}
	}
}
