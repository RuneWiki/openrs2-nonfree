import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "[S")
	public static short[] aShortArray30 = new short[500];

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public static int anInt2333 = 500;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Lclient!hd;")
	public static Class50 aClass50_16 = new Class50(4096);

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "Lclient!vb;")
	public static Class120 aClass120_12 = new Class120();

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
	public static void method1853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static154.anInt3399 > 0) {
			Static220.method3623(Static154.anInt3399);
			Static154.anInt3399 = 0;
		}
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg1 * Static205.anInt4388;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 1; local31 < 255; local31++) {
			@Pc(43) int local43 = Static24.anIntArray44[local31] * (256 - local31) / 256;
			if (local43 < 0) {
				local43 = 0;
			}
			local23 += local43;
			@Pc(60) int local60;
			for (@Pc(53) int local53 = local43; local53 < 128; local53++) {
				local60 = Static2.anIntArray2[local23++];
				@Pc(67) int local67 = Static205.anIntArray358[local27++ + arg0];
				if (local60 == 0) {
					Static59.aClass1_Sub2_Sub2_Sub1_1.anIntArray13[local29++] = local67;
				} else {
					@Pc(75) int local75 = 256 - local60 - 18;
					if (local75 > 255) {
						local75 = 255;
					}
					@Pc(86) int local86 = local60 + 18;
					local60 = Static8.anIntArray20[local60];
					if (local86 > 255) {
						local86 = 255;
					}
					Static59.aClass1_Sub2_Sub2_Sub1_1.anIntArray13[local29++] = ((local67 & 0xFF00) * local75 + (local60 & 0xFF00) * local86 & 0xFF0000) + ((local67 & 0xFF00FF) * local75 + local86 * (local60 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local60 = 0; local60 < local43; local60++) {
				Static59.aClass1_Sub2_Sub2_Sub1_1.anIntArray13[local29++] = Static205.anIntArray358[arg0 + local27++];
			}
			local27 += Static205.anInt4388 - 128;
		}
		Static59.aClass1_Sub2_Sub2_Sub1_1.method195(arg0, arg1);
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	public static void method1854() {
		Static192.aBoolean373 = true;
		Static194.aBoolean377 = true;
		Static97.anInt2097 = 0;
		Static104.aLong120 = 0L;
		Static35.aClass121_1.anInt4831 = 0;
		Static160.method2585();
		Static207.anInt4426 = 0;
		Static18.anInt382 = -1;
		Static13.anInt317 = -1;
		Static37.anInt769 = 0;
		Static176.anInt3812 = -1;
		Static193.aClass1_Sub26_Sub1_2.anInt4021 = 0;
		Static114.anInt2522 = 0;
		Static194.aClass1_Sub26_Sub1_3.anInt4021 = 0;
		Static200.anInt3496 = -1;
		for (@Pc(3012) int local3012 = 0; local3012 < Static76.aClass68Array1.length; local3012++) {
			Static76.aClass68Array1[local3012] = null;
		}
		Static40.aBoolean81 = false;
		Static8.anInt259 = 0;
		Static71.method1279(0);
		for (@Pc(3038) int local3038 = 0; local3038 < 100; local3038++) {
			Static61.aClass107Array7[local3038] = null;
		}
		Static152.anInt3367 = (int) (Math.random() * 100.0D) - 50;
		Static189.anInt4168 = 0;
		Static143.anInt3135 = (int) (Math.random() * 80.0D) - 40;
		Static174.anInt3796 = (int) (Math.random() * 30.0D) - 20;
		Static79.anInt1741 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static156.anInt3415 = 0;
		Static184.anInt4144 = 0;
		Static25.anInt490 = 0;
		Static10.anInt285 = 0;
		Static123.anInt2690 = (int) (Math.random() * 120.0D) - 60;
		Static162.anInt3539 = (int) (Math.random() * 110.0D) - 55;
		Static56.aBoolean124 = false;
		Static167.anInt3590 = 0;
		Static95.anInt2072 = 0;
		Static18.anInt383 = -1;
		Static204.anInt2501 = 0;
		for (@Pc(3114) int local3114 = 0; local3114 < 2048; local3114++) {
			Static198.aClass5_Sub5_Sub1Array1[local3114] = null;
			Static29.aClass1_Sub26Array1[local3114] = null;
		}
		for (@Pc(3130) int local3130 = 0; local3130 < 32768; local3130++) {
			Static33.aClass5_Sub5_Sub2Array1[local3130] = null;
		}
		Static204.aClass5_Sub5_Sub1_2 = Static198.aClass5_Sub5_Sub1Array1[2047] = new Class5_Sub5_Sub1();
		Static13.aClass120_2.method3560();
		aClass120_12.method3560();
		@Pc(3162) int local3162;
		for (@Pc(3158) int local3158 = 0; local3158 < 4; local3158++) {
			for (local3162 = 0; local3162 < 104; local3162++) {
				for (@Pc(3166) int local3166 = 0; local3166 < 104; local3166++) {
					Static195.aClass120ArrayArrayArray2[local3158][local3162][local3166] = null;
				}
			}
		}
		Static86.aClass120_10 = new Class120();
		Static3.anInt3934 = 0;
		Static231.anInt4994 = 0;
		Static18.method371();
		Static111.method1945();
		Static194.anInt4293 = 0;
		Static179.anInt3924 = 0;
		Static73.anInt1679 = 0;
		Static31.anInt2865 = 0;
		Static122.anInt2672 = 0;
		Static159.anInt3503 = 0;
		Static171.anInt3717 = 0;
		Static40.anInt854 = 0;
		Static130.anInt2832 = 0;
		Static105.anInt2299 = 0;
		for (local3162 = 0; local3162 < Static87.anIntArray198.length; local3162++) {
			Static87.anIntArray198[local3162] = -1;
		}
		if (Static77.anInt1732 != -1) {
			Static218.method3570(Static77.anInt1732);
		}
		for (@Pc(3248) Class1_Sub11 local3248 = (Class1_Sub11) Static154.aClass50_18.method1358(); local3248 != null; local3248 = (Class1_Sub11) Static154.aClass50_18.method1361()) {
			Static165.method1867(local3248, true);
		}
		Static77.anInt1732 = -1;
		Static154.aClass50_18 = new Class50(8);
		Static40.aBoolean81 = false;
		Static184.aClass86_14 = null;
		Static8.anInt259 = 0;
		Static185.aClass56_26.method1535(-1, new int[5], null, false);
		for (@Pc(3284) int local3284 = 0; local3284 < 8; local3284++) {
			Static175.aClass107Array22[local3284] = null;
			Static43.aBooleanArray8[local3284] = false;
		}
		Static13.method330();
		Static200.aBoolean310 = true;
		for (@Pc(3306) int local3306 = 0; local3306 < 100; local3306++) {
			Static39.aBooleanArray5[local3306] = true;
		}
		Static39.aClass1_Sub13Array1 = null;
		Static22.anInt437 = 0;
		Static116.aClass107_694 = null;
		for (@Pc(3324) int local3324 = 0; local3324 < 6; local3324++) {
			Static165.aClass15Array2[local3324] = new Class15();
		}
		for (@Pc(3338) int local3338 = 0; local3338 < 25; local3338++) {
			Static85.anIntArray191[local3338] = 0;
			Static59.anIntArray126[local3338] = 0;
			Static83.anIntArray180[local3338] = 0;
		}
		Static210.aClass107_1225 = Static187.aClass107_1088;
		Static22.aBoolean35 = true;
		Static191.aBoolean372 = false;
		Static89.aShortArray22 = Static171.aShortArray45 = Static149.aShortArray44 = Static99.aShortArray15 = new short[256];
		Static123.aClass120_15.method3560();
		Static98.method1669();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLclient!vf;)V")
	public static void method1855(@OriginalArg(1) Class1_Sub26 arg0) {
		while (arg0.aByteArray52.length > arg0.anInt4021) {
			@Pc(11) boolean local11 = false;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			if (arg0.method2945() == 1) {
				local11 = true;
				local13 = arg0.method2945();
				local15 = arg0.method2945();
			}
			@Pc(34) int local34 = arg0.method2945();
			@Pc(38) int local38 = arg0.method2945();
			@Pc(45) int local45 = local34 * 64 - Static101.anInt2179;
			@Pc(55) int local55 = Static152.anInt3375 + Static64.anInt1525 - local38 * 64 - 1;
			@Pc(136) byte local136;
			@Pc(80) int local80;
			if (local45 >= 0 && local55 - 63 >= 0 && local45 + 63 < Static170.anInt3706 && local55 < Static152.anInt3375) {
				local80 = local45 >> 6;
				@Pc(84) int local84 = local55 >> 6;
				for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
					for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
						if (!local11 || local13 * 8 <= local86 && local86 < local13 * 8 + 8 && local15 * 8 <= local90 && local15 * 8 + 8 > local90) {
							local136 = arg0.method2992();
							if (local136 != 0) {
								if (Static13.aByteArrayArrayArray1[local80][local84] == null) {
									Static13.aByteArrayArrayArray1[local80][local84] = new byte[4096];
								}
								Static13.aByteArrayArrayArray1[local80][local84][(63 - local90 << 6) + local86] = local136;
								@Pc(171) byte local171 = arg0.method2992();
								if (Static83.aByteArrayArrayArray7[local80][local84] == null) {
									Static83.aByteArrayArrayArray7[local80][local84] = new byte[4096];
								}
								Static83.aByteArrayArrayArray7[local80][local84][local86 + (63 - local90 << 6)] = local171;
							}
						}
					}
				}
			} else {
				for (local80 = 0; (local11 ? 64 : 4096) > local80; local80++) {
					local136 = arg0.method2992();
					if (local136 != 0) {
						arg0.anInt4021++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)Lclient!sc;")
	public static Class107 method1856(@OriginalArg(0) int arg0) {
		@Pc(14) Class107 local14 = Static115.method2001(arg0);
		for (@Pc(20) int local20 = local14.method3095() - 3; local20 > 0; local20 -= 3) {
			local14 = Static149.method2437(new Class107[] { local14.method3104(0, local20), Static176.aClass107_1038, local14.method3084(local20) });
		}
		if (local14.method3095() > 9) {
			return Static149.method2437(new Class107[] { Static218.aClass107_1282, local14.method3104(0, local14.method3095() - 8), Static163.aClass107_955, Static232.aClass107_1156, local14, Static134.aClass107_796 });
		} else if (local14.method3095() > 6) {
			return Static149.method2437(new Class107[] { Static83.aClass107_520, local14.method3104(0, local14.method3095() - 4), Static35.aClass107_249, Static232.aClass107_1156, local14, Static134.aClass107_796 });
		} else {
			return Static149.method2437(new Class107[] { Static124.aClass107_730, local14, Static104.aClass107_858 });
		}
	}
}
