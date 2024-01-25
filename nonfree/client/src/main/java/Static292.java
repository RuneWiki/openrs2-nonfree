import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_87 = new Class6(19, 0);

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_83 = new Class186(25, 7);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIZ)V")
	public static void method4920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg2 == Static184.anInt3932 && arg0 == Static358.anInt2386 && (Static245.anInt4747 == Static435.anInt7457 || Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926))) {
			return;
		}
		Static435.anInt7457 = Static245.anInt4747;
		Static358.anInt2386 = arg0;
		Static184.anInt3932 = arg2;
		if (Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926)) {
			Static435.anInt7457 = 0;
		}
		Static265.method4401(arg1);
		Static236.method4028(Static33.aClass114_17.method3330(Static315.anInt5993), true, Static268.aClass27_4);
		@Pc(58) int local58 = Static324.anInt6132;
		Static324.anInt6132 = (Static184.anInt3932 - (Static542.anInt9387 >> 4)) * 8;
		@Pc(68) int local68 = Static517.anInt8716;
		Static517.anInt8716 = (Static358.anInt2386 - (Static36.anInt1324 >> 4)) * 8;
		Static391.aClass1_Sub1_Sub12_3 = Static451.method3213(Static184.anInt3932 * 8, Static358.anInt2386 * 8);
		Static161.aClass179_3 = null;
		@Pc(92) int local92 = Static324.anInt6132 - local58;
		@Pc(96) int local96 = Static517.anInt8716 - local68;
		@Pc(101) int local101;
		@Pc(113) int local113;
		@Pc(245) int local245;
		@Pc(177) int local177;
		if (arg1 == 10) {
			for (local101 = 0; local101 < Static198.anInt4112; local101++) {
				@Pc(106) Class1_Sub10 local106 = Static395.aClass1_Sub10Array1[local101];
				if (local106 != null) {
					@Pc(111) Class47_Sub2_Sub3_Sub1 local111 = local106.aClass47_Sub2_Sub3_Sub1_2;
					for (local113 = 0; local113 < 10; local113++) {
						local111.anIntArray362[local113] -= local92;
						local111.anIntArray361[local113] -= local96;
					}
					local111.anInt8189 -= local92 * 128;
					local111.anInt8191 -= local96 * 128;
				}
			}
		} else {
			@Pc(163) boolean local163 = false;
			Static457.anInt7857 = 0;
			@Pc(171) int local171 = Static542.anInt9387 * 128 - 128;
			local177 = (Static36.anInt1324 - 1) * 128;
			for (local113 = 0; local113 < Static198.anInt4112; local113++) {
				@Pc(184) Class1_Sub10 local184 = Static395.aClass1_Sub10Array1[local113];
				if (local184 != null) {
					@Pc(189) Class47_Sub2_Sub3_Sub1 local189 = local184.aClass47_Sub2_Sub3_Sub1_2;
					local189.anInt8189 -= local92 * 128;
					local189.anInt8191 -= local96 * 128;
					if (local189.anInt8189 >= 0 && local171 >= local189.anInt8189 && local189.anInt8191 >= 0 && local177 >= local189.anInt8191) {
						@Pc(243) boolean local243 = true;
						for (local245 = 0; local245 < 10; local245++) {
							local189.anIntArray362[local245] -= local92;
							local189.anIntArray361[local245] -= local96;
							if (local189.anIntArray362[local245] < 0 || Static542.anInt9387 <= local189.anIntArray362[local245] || local189.anIntArray361[local245] < 0 || Static36.anInt1324 <= local189.anIntArray361[local245]) {
								local243 = false;
							}
						}
						if (local243) {
							Static386.anIntArray503[Static457.anInt7857++] = local189.anInt5045;
						} else {
							local189.method3708(null);
							local163 = true;
							local184.method7983();
						}
					} else {
						local189.method3708(null);
						local163 = true;
						local184.method7983();
					}
				}
			}
			if (local163) {
				Static198.anInt4112 = Static258.aClass174_15.method4426();
				Static258.aClass174_15.method4427(Static395.aClass1_Sub10Array1);
			}
		}
		for (local101 = 0; local101 < 2048; local101++) {
			@Pc(341) Class47_Sub2_Sub3_Sub2 local341 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local101];
			if (local341 != null) {
				for (local177 = 0; local177 < 10; local177++) {
					local341.anIntArray362[local177] -= local92;
					local341.anIntArray361[local177] -= local96;
				}
				local341.anInt8189 -= local92 * 128;
				local341.anInt8191 -= local96 * 128;
			}
		}
		@Pc(388) Class28[] local388 = Static484.aClass28Array1;
		for (local177 = 0; local177 < local388.length; local177++) {
			@Pc(395) Class28 local395 = local388[local177];
			if (local395 != null) {
				local395.anInt1263 -= local96 * 128;
				local395.anInt1260 -= local92 * 128;
			}
		}
		for (@Pc(427) Class1_Sub37 local427 = (Class1_Sub37) Static500.aClass38_71.method1419(); local427 != null; local427 = (Class1_Sub37) Static500.aClass38_71.method1415()) {
			local427.anInt6624 -= local92;
			local427.anInt6615 -= local96;
			if (Static198.anInt4113 != 4 && (local427.anInt6624 < 0 || local427.anInt6615 < 0 || local427.anInt6624 >= Static542.anInt9387 || Static36.anInt1324 <= local427.anInt6615)) {
				local427.method7983();
			}
		}
		if (Static198.anInt4113 != 4) {
			for (@Pc(485) Class1_Sub11 local485 = (Class1_Sub11) Static528.aClass174_40.method4421(); local485 != null; local485 = (Class1_Sub11) Static528.aClass174_40.method4429()) {
				@Pc(492) int local492 = (int) (local485.aLong244 & 0x3FFFL);
				@Pc(497) int local497 = local492 - Static324.anInt6132;
				local245 = (int) (local485.aLong244 >> 14 & 0x3FFFL);
				@Pc(509) int local509 = local245 - Static517.anInt8716;
				if (local497 < 0 || local509 < 0 || Static542.anInt9387 <= local497 || local509 >= Static36.anInt1324) {
					local485.method7983();
				}
			}
		}
		if (Static540.anInt9357 != 0) {
			Static417.anInt6093 -= local96;
			Static540.anInt9357 -= local92;
		}
		Static170.method3304();
		if (arg1 != 10) {
			Static308.anInt5918 -= local92 * 128;
			Static404.anInt9256 -= local92;
			Static110.anInt2572 -= local92;
			Static347.anInt6404 -= local96 * 128;
			Static382.anInt6686 -= local96;
			Static413.anInt7200 -= local96;
			if (Math.abs(local92) > Static542.anInt9387 || Math.abs(local96) > Static36.anInt1324) {
				Static157.method3127();
			}
		} else if (Static464.anInt8003 == 4) {
			Static347.anInt6403 -= local92 * 128;
			Static67.anInt1925 -= local96 * 128;
			Static126.anInt3030 -= local92 * 128;
			Static180.anInt3880 -= local96 * 128;
		} else {
			Static464.anInt8003 = 1;
		}
		Static241.method2709();
		Static540.method7892();
		Static35.aClass38_14.method1417();
		Static228.aClass38_76.method1417();
		Static368.aClass145_7.method3920();
		Static542.method7919();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method4921(@OriginalArg(1) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = local8 + ": ";
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = local6[local8] + arg0[local8];
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method4927(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(48) StringBuffer local48 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				@Pc(65) char local65 = Static345.aCharArray5[(int) (local51 - arg0 * 37L)];
				if (local65 == '_') {
					@Pc(75) int local75 = local48.length() - 1;
					local65 = ' ';
					local48.setCharAt(local75, Character.toUpperCase(local48.charAt(local75)));
				}
				local48.append(local65);
			}
			local48.reverse();
			local48.setCharAt(0, Character.toUpperCase(local48.charAt(0)));
			return local48.toString();
		}
	}
}
