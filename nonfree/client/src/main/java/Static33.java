import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)Z")
	public static boolean method1193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method1194() {
		if (Static435.anInt8191 == 3) {
			Static63.method1687(4);
		} else if (Static435.anInt8191 == 7) {
			Static63.method1687(8);
		} else if (Static435.anInt8191 == 10) {
			Static63.method1687(11);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z")
	public static boolean method1195(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!ig;)Lclient!vr;")
	public static Class361 method1196(@OriginalArg(1) Class8_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method8525();
		@Pc(14) Class173 local14 = Static148.method5412()[arg0.method8525()];
		@Pc(21) Class60 local21 = Static593.method8190()[arg0.method8525()];
		@Pc(25) int local25 = arg0.method8568();
		@Pc(29) int local29 = arg0.method8568();
		@Pc(33) int local33 = arg0.method8578();
		@Pc(37) int local37 = arg0.method8578();
		@Pc(41) int local41 = arg0.method8540();
		@Pc(45) int local45 = arg0.method8540();
		@Pc(49) int local49 = arg0.method8540();
		@Pc(65) boolean local65 = arg0.method8525() == 1;
		return new Class361(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local65);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method1197() {
		@Pc(9) int local9 = Static7.anInt6410 * 512 + 256;
		@Pc(15) int local15 = Static243.anInt5395 * 512 + 256;
		@Pc(24) int local24 = Static177.method3098(local15, local9, Static128.anInt3428) - Static91.anInt2548;
		if (Static330.anInt4197 < 100) {
			if (local9 > Static637.anInt10650) {
				Static637.anInt10650 += Static284.anInt5885 + Static330.anInt4197 * (local9 - Static637.anInt10650) / 1000;
				if (Static637.anInt10650 > local9) {
					Static637.anInt10650 = local9;
				}
			}
			if (local24 > Static504.anInt8868) {
				Static504.anInt8868 += Static284.anInt5885 + Static330.anInt4197 * (local24 - Static504.anInt8868) / 1000;
				if (Static504.anInt8868 > local24) {
					Static504.anInt8868 = local24;
				}
			}
			if (Static637.anInt10650 > local9) {
				Static637.anInt10650 -= Static284.anInt5885 + (Static637.anInt10650 - local9) * Static330.anInt4197 / 1000;
				if (local9 > Static637.anInt10650) {
					Static637.anInt10650 = local9;
				}
			}
			if (local24 < Static504.anInt8868) {
				Static504.anInt8868 -= Static284.anInt5885 + Static330.anInt4197 * (Static504.anInt8868 - local24) / 1000;
				if (Static504.anInt8868 < local24) {
					Static504.anInt8868 = local24;
				}
			}
			if (local15 > Static377.anInt7114) {
				Static377.anInt7114 += Static284.anInt5885 + Static330.anInt4197 * (local15 - Static377.anInt7114) / 1000;
				if (local15 < Static377.anInt7114) {
					Static377.anInt7114 = local15;
				}
			}
			if (local15 < Static377.anInt7114) {
				Static377.anInt7114 -= Static284.anInt5885 + Static330.anInt4197 * (Static377.anInt7114 - local15) / 1000;
				if (Static377.anInt7114 < local15) {
					Static377.anInt7114 = local15;
				}
			}
		} else {
			Static637.anInt10650 = Static7.anInt6410 * 512 + 256;
			Static377.anInt7114 = Static243.anInt5395 * 512 + 256;
			Static504.anInt8868 = Static177.method3098(Static377.anInt7114, Static637.anInt10650, Static128.anInt3428) - Static91.anInt2548;
		}
		local9 = Static345.anInt6703 * 512 + 256;
		local15 = Static567.anInt9757 * 512 + 256;
		local24 = Static177.method3098(local15, local9, Static128.anInt3428) - Class15_Sub1_Sub2_Sub2.lb;
		@Pc(231) int local231 = local9 - Static637.anInt10650;
		@Pc(236) int local236 = local24 - Static504.anInt8868;
		@Pc(240) int local240 = local15 - Static377.anInt7114;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local231 * local231 + local240 * local240));
		@Pc(263) int local263 = (int) (Math.atan2((double) local236, (double) local252) * 2607.5945876176133D) & 0x3FFF;
		@Pc(274) int local274 = (int) (-2607.5945876176133D * Math.atan2((double) local231, (double) local240)) & 0x3FFF;
		if (local263 < 1024) {
			local263 = 1024;
		}
		if (local263 > 3072) {
			local263 = 3072;
		}
		if (Static443.anInt8245 < local263) {
			Static443.anInt8245 += Static258.anInt5552 * (local263 - Static443.anInt8245 >> 3) / 1000 + Static324.anInt6509 << 3;
			if (Static443.anInt8245 > local263) {
				Static443.anInt8245 = local263;
			}
		}
		if (local263 < Static443.anInt8245) {
			Static443.anInt8245 -= Static324.anInt6509 + Static258.anInt5552 * (Static443.anInt8245 - local263 >> 3) / 1000 << 3;
			if (local263 > Static443.anInt8245) {
				Static443.anInt8245 = local263;
			}
		}
		@Pc(351) int local351 = local274 - Static25.anInt1035;
		if (local351 > 8192) {
			local351 -= 16384;
		}
		if (local351 < -8192) {
			local351 += 16384;
		}
		local351 >>= 0x3;
		if (local351 > 0) {
			Static25.anInt1035 += Static324.anInt6509 + Static258.anInt5552 * local351 / 1000 << 3;
			Static25.anInt1035 &= 0x3FFF;
		}
		if (local351 < 0) {
			Static25.anInt1035 -= Static258.anInt5552 * -local351 / 1000 + Static324.anInt6509 << 3;
			Static25.anInt1035 &= 0x3FFF;
		}
		@Pc(411) int local411 = local274 - Static25.anInt1035;
		if (local411 > 8192) {
			local411 -= 16384;
		}
		if (local411 < -8192) {
			local411 += 16384;
		}
		if (local411 < 0 && local351 > 0 || local411 > 0 && local351 < 0) {
			Static25.anInt1035 = local274;
		}
		Static512.anInt8976 = 0;
	}
}
