import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!t", name = "M", descriptor = "I")
	public static int anInt6656 = 0;

	@OriginalMember(owner = "client!t", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!wv;I)Z")
	public static boolean method5224(@OriginalArg(0) Class269 arg0) {
		return Static178.aClass269_5 == arg0 || arg0 == Static185.aClass269_6 || arg0 == Static106.aClass269_3 || arg0 == Static446.aClass269_12;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLclient!cr;IILclient!qa;)V")
	public static void method5225(@OriginalArg(1) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26 arg3) {
		@Pc(10) Class14 local10 = arg0.method1183(arg3);
		if (local10 == null) {
			return;
		}
		arg3.pa(arg2, arg1, arg2 + arg0.anInt1622, arg0.anInt1599 + arg1);
		if (Static416.anInt7259 == 2 || Static416.anInt7259 == 5 || client.lb == null) {
			arg3.j(-16777216, local10, arg2, arg1);
			return;
		}
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(54) int local54;
		@Pc(67) int local67;
		if (Static65.anInt7824 == 4) {
			local57 = Static422.anInt7372;
			local60 = Static352.anInt7237;
			local67 = 4096;
			local54 = (int) -Static203.aFloat130 & 0x3FFF;
		} else {
			local54 = Static357.anInt3686 + (int) -Static203.aFloat130 & 0x3FFF;
			local57 = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117;
			local60 = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111;
			local67 = 4096 - Static119.anInt2384 * 16;
		}
		@Pc(94) int local94 = local57 / 32 + 48 + 208 - Static81.anInt1950 * 2;
		@Pc(111) int local111 = Static171.anInt3288 * 4 + 48 - local60 / 32 - (Static171.anInt3288 + -104) * 2;
		client.lb.method6091((float) arg2 + (float) arg0.anInt1622 / 2.0F, (float) arg1 + (float) arg0.anInt1599 / 2.0F, (float) local94, (float) local111, local67, local54 << 2, local10, arg2, arg1);
		@Pc(162) int local162;
		@Pc(171) int local171;
		@Pc(182) int local182;
		@Pc(193) int local193;
		for (@Pc(145) Class2_Sub16 local145 = (Class2_Sub16) Static281.aClass265_40.method6005(); local145 != null; local145 = (Class2_Sub16) Static281.aClass265_40.method6001()) {
			@Pc(150) int local150 = local145.anInt2428;
			local162 = (Static269.aClass201_3.anIntArray368[local150] >> 14 & 0x3FFF) - Static173.anInt3340;
			local171 = (Static269.aClass201_3.anIntArray368[local150] & 0x3FFF) - Static379.anInt6721;
			local182 = local162 * 4 + 2 - local57 / 32;
			local193 = local171 * 4 + 2 - local60 / 32;
			Static30.method5454(Static269.aClass201_3.anIntArray369[local150], arg1, arg3, arg2, arg0, local193, local182, local10);
		}
		for (local162 = 0; local162 < Static158.anInt3121; local162++) {
			local171 = Static277.anIntArray342[local162] * 4 + 2 - local57 / 32;
			local182 = Static161.anIntArray209[local162] * 4 + 2 - local60 / 32;
			@Pc(250) Class250 local250 = Static406.aClass150_3.method3508(Static356.anIntArray422[local162]);
			if (local250.anIntArray479 != null) {
				local250 = local250.method5591(Static215.aClass225_1);
				if (local250 == null || local250.anInt7192 == -1) {
					continue;
				}
			}
			Static30.method5454(local250.anInt7192, arg1, arg3, arg2, arg0, local182, local171, local10);
		}
		for (@Pc(291) Class2_Sub21 local291 = (Class2_Sub21) Static383.aClass240_34.method5438(); local291 != null; local291 = (Class2_Sub21) Static383.aClass240_34.method5436()) {
			local182 = (int) (local291.aLong227 >> 28 & 0x3L);
			if (Static292.anInt5291 == local182) {
				local193 = (int) (local291.aLong227 & 0x3FFFL) * 4 + 2 - local57 / 32;
				@Pc(336) int local336 = (int) (local291.aLong227 >> 14 & 0x3FFFL) * 4 + 2 - local60 / 32;
				Static40.method742(arg2, arg0, local336, Static91.aClass76Array9[0], arg1, local10, local193);
			}
		}
		@Pc(405) int local405;
		for (local182 = 0; local182 < Static391.anInt6867; local182++) {
			@Pc(364) Class4_Sub2_Sub2_Sub2 local364 = Static4.aClass4_Sub2_Sub2_Sub2Array1[Static312.anIntArray202[local182]];
			if (local364 != null && local364.method5133() && Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 == local364.aByte92) {
				@Pc(378) Class215 local378 = local364.aClass215_1;
				if (local378 != null && local378.anIntArray400 != null) {
					local378 = local378.method4795(Static215.aClass225_1);
				}
				if (local378 != null && local378.aBoolean529 && local378.aBoolean530) {
					local405 = local364.anInt7117 / 32 - local57 / 32;
					@Pc(414) int local414 = local364.anInt7111 / 32 - local60 / 32;
					if (local378.anInt6002 == -1) {
						Static40.method742(arg2, arg0, local414, Static91.aClass76Array9[1], arg1, local10, local405);
					} else {
						Static30.method5454(local378.anInt6002, arg1, arg3, arg2, arg0, local414, local405, local10);
					}
				}
			}
		}
		local193 = Static348.anInt6137;
		@Pc(455) int[] local455 = Static348.anIntArray412;
		@Pc(489) int local489;
		@Pc(498) int local498;
		@Pc(502) int local502;
		for (local405 = 0; local405 < local193; local405++) {
			@Pc(465) Class4_Sub2_Sub2_Sub1 local465 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local455[local405]];
			if (local465 != null && local465.method4604() && Static231.aClass4_Sub2_Sub2_Sub1_2 != local465 && Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 == local465.aByte92) {
				local489 = local465.anInt7117 / 32 - local57 / 32;
				local498 = local465.anInt7111 / 32 - local60 / 32;
				@Pc(500) boolean local500 = false;
				for (local502 = 0; local502 < Static304.anInt5397; local502++) {
					if (local465.aString48.equals(aStringArray36[local502]) && Static350.anIntArray415[local502] != 0) {
						local500 = true;
						break;
					}
				}
				@Pc(532) boolean local532 = false;
				for (@Pc(534) int local534 = 0; local534 < Static82.anInt1991; local534++) {
					if (local465.aString48.equals(Static125.aClass255Array1[local534].aString63)) {
						local532 = true;
						break;
					}
				}
				@Pc(558) boolean local558 = false;
				if (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5734 != 0 && local465.anInt5734 != 0 && local465.anInt5734 == Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5734) {
					local558 = true;
				}
				if (local465.aBoolean510) {
					Static40.method742(arg2, arg0, local498, Static91.aClass76Array9[6], arg1, local10, local489);
				} else if (local500) {
					Static40.method742(arg2, arg0, local498, Static91.aClass76Array9[3], arg1, local10, local489);
				} else if (local532) {
					Static40.method742(arg2, arg0, local498, Static91.aClass76Array9[5], arg1, local10, local489);
				} else if (local558) {
					Static40.method742(arg2, arg0, local498, Static91.aClass76Array9[4], arg1, local10, local489);
				} else {
					Static40.method742(arg2, arg0, local498, Static91.aClass76Array9[2], arg1, local10, local489);
				}
			}
		}
		@Pc(656) Class233[] local656 = Static2.aClass233Array1;
		@Pc(746) int local746;
		for (local489 = 0; local489 < local656.length; local489++) {
			@Pc(664) Class233 local664 = local656[local489];
			if (local664 != null && local664.anInt6828 != 0 && Static164.anInt3206 % 20 < 10) {
				@Pc(719) int local719;
				if (local664.anInt6828 == 1 && local664.anInt6821 >= 0 && local664.anInt6821 < Static4.aClass4_Sub2_Sub2_Sub2Array1.length) {
					@Pc(698) Class4_Sub2_Sub2_Sub2 local698 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local664.anInt6821];
					if (local698 != null) {
						local502 = local698.anInt7117 / 32 - local57 / 32;
						local719 = local698.anInt7111 / 32 - local60 / 32;
						Static235.method3568(arg0, local10, local664.anInt6825, local502, arg1, local719, 360000L, arg2);
					}
				}
				if (local664.anInt6828 == 2) {
					local746 = local664.anInt6829 / 32 - local57 / 32;
					local502 = local664.anInt6824 / 32 - local60 / 32;
					@Pc(762) long local762 = (long) (local664.anInt6826 << 5);
					@Pc(766) long local766 = local762 * local762;
					Static235.method3568(arg0, local10, local664.anInt6825, local746, arg1, local502, local766, arg2);
				}
				if (local664.anInt6828 == 10 && local664.anInt6821 >= 0 && Static129.aClass4_Sub2_Sub2_Sub1Array27.length > local664.anInt6821) {
					@Pc(798) Class4_Sub2_Sub2_Sub1 local798 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local664.anInt6821];
					if (local798 != null) {
						local502 = local798.anInt7117 / 32 - local57 / 32;
						local719 = local798.anInt7111 / 32 - local60 / 32;
						Static235.method3568(arg0, local10, local664.anInt6825, local502, arg1, local719, 360000L, arg2);
					}
				}
			}
		}
		if (Static65.anInt7824 == 4) {
			return;
		}
		if (Static425.anInt5530 != 0) {
			local498 = Static425.anInt5530 * 4 + (Static231.aClass4_Sub2_Sub2_Sub1_2.method5118() - 1) * 2 + 2 - local57 / 32;
			local746 = Static176.anInt3417 * 4 + (Static231.aClass4_Sub2_Sub2_Sub1_2.method5118() - 1) * 2 + 2 - local60 / 32;
			Static40.method742(arg2, arg0, local746, Static344.aClass76Array15[Static226.aBoolean362 ? 1 : 0], arg1, local10, local498);
		}
		arg3.method2245(3, arg0.anInt1622 / 2 + arg2 - 1, arg0.anInt1599 / 2 + -1 + arg1, 3, -1);
		return;
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	public static void method5226() {
		Static427.anInt7455 = 0;
		Static13.anInt320 = 0;
		Static131.anInt2579 = 0;
		Static119.anInt2383 = 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB[F)[F")
	public static float[] method5227(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static459.method3351(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BZ)V")
	public static void method5228(@OriginalArg(1) boolean arg0) {
		Static438.method5925();
		if (Static297.anInt5339 != 30 && Static297.anInt5339 != 25) {
			return;
		}
		Static265.anInt7238++;
		if (Static265.anInt7238 < 50 && !arg0) {
			return;
		}
		Static265.anInt7238 = 0;
		if (!Static414.aBoolean377 && Static423.aClass199_11 != null) {
			Static448.method6059(Static37.aClass44_12);
			try {
				Static423.aClass199_11.method4484(Static98.aClass2_Sub20_Sub1_1.aByteArray136, Static98.aClass2_Sub20_Sub1_1.anInt4608);
				Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
			} catch (@Pc(50) IOException local50) {
				Static414.aBoolean377 = true;
			}
		}
		Static438.method5925();
	}
}
