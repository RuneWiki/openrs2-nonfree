import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "[I")
	public static int[] anIntArray577 = new int[1];

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIZII)V")
	public static void method7994(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && Static173.anInt3656 == arg3 && arg2 == Static560.anInt10211 && (Static550.anInt10029 == Static352.anInt6764 || Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614))) {
			return;
		}
		Static173.anInt3656 = arg3;
		Static560.anInt10211 = arg2;
		Static550.anInt10029 = Static352.anInt6764;
		if (Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614)) {
			Static550.anInt10029 = 0;
		}
		Static231.method3759(arg0);
		Static490.method7114(Static39.aClass7_2, true, Static478.aClass198_11, Static127.aClass45_1, Static223.aClass152_16.method3624(Static142.anInt3088));
		@Pc(58) int local58 = Static242.anInt10133;
		Static242.anInt10133 = (Static173.anInt3656 - (Static338.anInt6508 >> 4)) * 8;
		@Pc(69) int local69 = Static157.anInt3323;
		Static157.anInt3323 = (Static560.anInt10211 - (Static390.anInt7654 >> 4)) * 8;
		Static476.aClass4_Sub6_Sub16_1 = Static572.method7764(Static173.anInt3656 * 8, Static560.anInt10211 * 8);
		Static11.aClass42_1 = null;
		@Pc(93) int local93 = Static242.anInt10133 - local58;
		@Pc(98) int local98 = Static157.anInt3323 - local69;
		@Pc(119) int local119;
		@Pc(121) int local121;
		@Pc(181) int local181;
		@Pc(289) int local289;
		if (arg0 == 11) {
			for (local289 = 0; local289 < Static222.anInt4653; local289++) {
				@Pc(295) Class4_Sub29 local295 = Static590.aClass4_Sub29Array1[local289];
				if (local295 != null) {
					@Pc(300) Class21_Sub1_Sub1_Sub1_Sub1 local300 = local295.aClass21_Sub1_Sub1_Sub1_Sub1_1;
					for (local121 = 0; local121 < 10; local121++) {
						local300.anIntArray206[local121] -= local93;
						local300.anIntArray207[local121] -= local98;
					}
					local300.anInt10550 -= local98 * 512;
					local300.anInt10551 -= local93 * 512;
				}
			}
		} else {
			Static137.anInt3042 = 0;
			@Pc(107) boolean local107 = false;
			@Pc(113) int local113 = (Static338.anInt6508 - 1) * 512;
			local119 = (Static390.anInt7654 - 1) * 512;
			for (local121 = 0; local121 < Static222.anInt4653; local121++) {
				@Pc(127) Class4_Sub29 local127 = Static590.aClass4_Sub29Array1[local121];
				if (local127 != null) {
					@Pc(132) Class21_Sub1_Sub1_Sub1_Sub1 local132 = local127.aClass21_Sub1_Sub1_Sub1_Sub1_1;
					local132.anInt10550 -= local98 * 512;
					local132.anInt10551 -= local93 * 512;
					if (local132.anInt10551 >= 0 && local132.anInt10551 <= local113 && local132.anInt10550 >= 0 && local132.anInt10550 <= local119) {
						@Pc(179) boolean local179 = true;
						for (local181 = 0; local181 < 10; local181++) {
							local132.anIntArray206[local181] -= local93;
							local132.anIntArray207[local181] -= local98;
							if (local132.anIntArray206[local181] < 0 || local132.anIntArray206[local181] >= Static338.anInt6508 || local132.anIntArray207[local181] < 0 || local132.anIntArray207[local181] >= Static390.anInt7654) {
								local179 = false;
							}
						}
						if (local179) {
							Static24.anIntArray24[Static137.anInt3042++] = local132.anInt4256;
						} else {
							local132.method1714(null);
							local127.method8193();
							local107 = true;
						}
					} else {
						local132.method1714(null);
						local107 = true;
						local127.method8193();
					}
				}
			}
			if (local107) {
				Static222.anInt4653 = Static144.aClass221_6.method5070();
				Static144.aClass221_6.method5074(Static590.aClass4_Sub29Array1);
			}
		}
		for (local289 = 0; local289 < 2048; local289++) {
			@Pc(356) Class21_Sub1_Sub1_Sub1_Sub2 local356 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local289];
			if (local356 != null) {
				for (local119 = 0; local119 < 10; local119++) {
					local356.anIntArray206[local119] -= local93;
					local356.anIntArray207[local119] -= local98;
				}
				local356.anInt10551 -= local93 * 512;
				local356.anInt10550 -= local98 * 512;
			}
		}
		@Pc(406) Class292[] local406 = Static553.aClass292Array1;
		for (local119 = 0; local119 < local406.length; local119++) {
			@Pc(414) Class292 local414 = local406[local119];
			if (local414 != null) {
				local414.anInt8833 -= local98 * 512;
				local414.anInt8828 -= local93 * 512;
			}
		}
		for (@Pc(446) Class4_Sub51 local446 = (Class4_Sub51) Static322.aClass22_43.method895(); local446 != null; local446 = (Class4_Sub51) Static322.aClass22_43.method889()) {
			local446.anInt10463 -= local93;
			local446.anInt10474 -= local98;
			if (Static343.anInt6623 != 4 && (local446.anInt10463 < 0 || local446.anInt10474 < 0 || local446.anInt10463 >= Static338.anInt6508 || local446.anInt10474 >= Static390.anInt7654)) {
				local446.method8193();
			}
		}
		if (Static343.anInt6623 != 4) {
			for (@Pc(506) Class4_Sub32 local506 = (Class4_Sub32) Static17.aClass221_1.method5072(); local506 != null; local506 = (Class4_Sub32) Static17.aClass221_1.method5071()) {
				@Pc(514) int local514 = (int) (local506.aLong295 & 0x3FFFL);
				@Pc(519) int local519 = local514 - Static242.anInt10133;
				local181 = (int) (local506.aLong295 >> 14 & 0x3FFFL);
				@Pc(531) int local531 = local181 - Static157.anInt3323;
				if (local519 < 0 || local531 < 0 || local519 >= Static338.anInt6508 || Static390.anInt7654 <= local531) {
					local506.method8193();
				}
			}
		}
		if (Static384.anInt7552 != 0) {
			Static226.anInt4729 -= local98;
			Static384.anInt7552 -= local93;
		}
		Static195.method6876();
		if (arg0 != 11) {
			Static80.anInt2172 -= local93;
			Static414.anInt7982 -= local98;
			Static191.anInt3980 -= local93;
			Static534.anInt9775 -= local93 * 512;
			Static114.anInt2613 -= local98 * 512;
			Static533.anInt9769 -= local98;
			if (Math.abs(local93) > Static338.anInt6508 || Math.abs(local98) > Static390.anInt7654) {
				Static41.method1090();
			}
		} else if (Static300.anInt6053 == 4) {
			Static277.anInt5777 -= local93 * 512;
			Static222.anInt4655 -= local98 * 512;
			Static148.anInt3159 -= local93 * 512;
			Static27.anInt4151 -= local98 * 512;
		} else {
			Static300.anInt6053 = 1;
			Static453.anInt8613 = -1;
			Static587.anInt10508 = -1;
		}
		Static329.method7370();
		Static571.method8034();
		Static247.aClass22_27.method886();
		Static446.aClass22_56.method886();
		Static573.aClass158_20.method3724();
		Static193.method3173();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(JJ)J")
	public static long method7997(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
