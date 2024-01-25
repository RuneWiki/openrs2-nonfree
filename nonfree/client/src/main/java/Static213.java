import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!aq;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public static int anInt4247 = 0;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
	public static final int[] anIntArray581 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public static int method3775() {
		if (Static342.aFrame2 == null) {
			return Static166.aBoolean255 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!bi;IILclient!pe;)V")
	public static void method3776(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class89 arg3) {
		@Pc(8) Class64 local8 = arg1.method428(arg3);
		if (local8 == null) {
			return;
		}
		arg3.method5431(arg2, arg0, arg1.anInt523 + arg2, arg0 - -arg1.anInt515);
		if (Static348.anInt6562 == 2 || Static348.anInt6562 == 5 || Static27.aClass52_1 == null) {
			arg3.method5436(local8, arg2, arg0);
			return;
		}
		@Pc(52) int local52;
		@Pc(55) int local55;
		@Pc(49) int local49;
		@Pc(62) int local62;
		if (Static118.anInt6324 == 4) {
			local52 = Static74.anInt1848;
			local62 = 4096;
			local49 = (int) -Static351.aFloat80 & 0x3FFF;
			local55 = Static318.anInt611;
		} else {
			local49 = (int) -Static351.aFloat80 + Static218.anInt4347 & 0x3FFF;
			local52 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973;
			local55 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967;
			local62 = 4096 - Static49.anInt1359 * 16;
		}
		@Pc(88) int local88 = local52 / 32 + 208 + 48 - Static15.anInt287 * 2;
		@Pc(106) int local106 = Static325.anInt6173 * 4 + 48 - (Static325.anInt6173 - 104) * 2 - local55 / 32;
		Static27.aClass52_1.method4126((float) arg2 + (float) arg1.anInt523 / 2.0F, (float) arg1.anInt515 / 2.0F + (float) arg0, (float) local88, (float) local106, local62, local49 << 2, local8, arg2, arg0);
		@Pc(156) int local156;
		@Pc(165) int local165;
		@Pc(175) int local175;
		@Pc(186) int local186;
		for (@Pc(140) Class7_Sub10 local140 = (Class7_Sub10) Static154.aClass74_20.method1793(); local140 != null; local140 = (Class7_Sub10) Static154.aClass74_20.method1798()) {
			@Pc(144) int local144 = local140.anInt2111;
			local156 = (Static275.aClass134_3.anIntArray523[local144] >> 14 & 0x3FFF) - Static350.anInt6609;
			local165 = (Static275.aClass134_3.anIntArray523[local144] & 0x3FFF) - Static237.anInt4696;
			local175 = local156 * 4 + 2 - local52 / 32;
			local186 = local165 * 4 + 2 - local55 / 32;
			Static350.method5619(arg0, local175, arg2, local8, Static275.aClass134_3.anIntArray522[local144], arg1, arg3, local186);
		}
		for (local156 = 0; local156 < Static329.anInt6216; local156++) {
			local165 = Static338.anIntArray815[local156] * 4 + 2 - local52 / 32;
			local175 = Static149.anIntArray422[local156] * 4 + 2 - local55 / 32;
			@Pc(240) Class122 local240 = Static245.method4227(Static259.anIntArray656[local156]);
			if (local240.anIntArray481 != null) {
				local240 = local240.method3234();
				if (local240 == null || local240.anInt3567 == -1) {
					continue;
				}
			}
			Static350.method5619(arg0, local165, arg2, local8, local240.anInt3567, arg1, arg3, local175);
		}
		for (@Pc(275) Class7_Sub35 local275 = (Class7_Sub35) Static185.aClass10_33.method157(); local275 != null; local275 = (Class7_Sub35) Static185.aClass10_33.method155()) {
			local175 = (int) (local275.aLong232 >> 28 & 0x3L);
			if (Static225.anInt4490 == local175) {
				local186 = (int) (local275.aLong232 & 0x3FFFL) * 4 + 2 - local52 / 32;
				@Pc(323) int local323 = (int) (local275.aLong232 >> 14 & 0x3FFFL) * 4 + 2 - local55 / 32;
				Static49.method1084(local323, local186, local8, arg2, arg0, arg1, Static313.aClass52Array15[0]);
			}
		}
		@Pc(388) int local388;
		@Pc(398) int local398;
		for (local175 = 0; local175 < Static11.anInt3203; local175++) {
			@Pc(350) Class22_Sub2_Sub1_Sub2 local350 = Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local175]];
			if (local350 != null && local350.method4423()) {
				@Pc(359) Class174 local359 = local350.aClass174_1;
				if (local359 != null && local359.anIntArray670 != null) {
					local359 = local359.method4438();
				}
				if (local359 != null && local359.aBoolean386 && local359.aBoolean384) {
					local388 = local350.anInt5973 / 32 - local52 / 32;
					local398 = local350.anInt5967 / 32 - local55 / 32;
					if (local359.anInt5203 == -1) {
						Static49.method1084(local398, local388, local8, arg2, arg0, arg1, Static313.aClass52Array15[1]);
					} else {
						Static350.method5619(arg0, local388, arg2, local8, local359.anInt5203, arg1, arg3, local398);
					}
				}
			}
		}
		@Pc(468) int local468;
		for (local186 = 0; local186 < Static223.anInt4466; local186++) {
			@Pc(439) Class22_Sub2_Sub1_Sub1 local439 = Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local186]];
			if (local439 != null && local439.method819()) {
				local388 = local439.anInt5973 / 32 - local52 / 32;
				local398 = local439.anInt5967 / 32 - local55 / 32;
				@Pc(466) boolean local466 = false;
				for (local468 = 0; local468 < Static124.anInt2775; local468++) {
					if (local439.aString78.equals(Static64.aStringArray15[local468]) && Static263.anIntArray667[local468] != 0) {
						local466 = true;
						break;
					}
				}
				@Pc(493) boolean local493 = false;
				for (@Pc(495) int local495 = 0; local495 < Static129.anInt2833; local495++) {
					if (local439.aString78.equals(Static275.aClass115Array1[local495].aString213)) {
						local493 = true;
						break;
					}
				}
				@Pc(513) boolean local513 = false;
				if (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1026 != 0 && local439.anInt1026 != 0 && local439.anInt1026 == Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1026) {
					local513 = true;
				}
				if (local466) {
					Static49.method1084(local398, local388, local8, arg2, arg0, arg1, Static313.aClass52Array15[3]);
				} else if (local493) {
					Static49.method1084(local398, local388, local8, arg2, arg0, arg1, Static313.aClass52Array15[5]);
				} else if (local513) {
					Static49.method1084(local398, local388, local8, arg2, arg0, arg1, Static313.aClass52Array15[4]);
				} else {
					Static49.method1084(local398, local388, local8, arg2, arg0, arg1, Static313.aClass52Array15[2]);
				}
			}
		}
		@Pc(591) Class50[] local591 = Static174.aClass50Array1;
		@Pc(680) int local680;
		for (local388 = 0; local388 < local591.length; local388++) {
			@Pc(598) Class50 local598 = local591[local388];
			if (local598 != null && local598.anInt1480 != 0 && Static212.anInt4234 % 20 < 10) {
				@Pc(651) int local651;
				if (local598.anInt1480 == 1 && local598.anInt1473 >= 0 && local598.anInt1473 < Static69.aClass22_Sub2_Sub1_Sub2Array1.length) {
					@Pc(629) Class22_Sub2_Sub1_Sub2 local629 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local598.anInt1473];
					if (local629 != null) {
						local468 = local629.anInt5973 / 32 - local52 / 32;
						local651 = local629.anInt5967 / 32 - local55 / 32;
						Static271.method4517(arg1, local468, 360000, arg0, arg2, local598.anInt1485, local8, local651);
					}
				}
				if (local598.anInt1480 == 2) {
					local680 = (local598.anInt1481 - Static350.anInt6609) * 4 + 2 - local52 / 32;
					local468 = (local598.anInt1476 - Static237.anInt4696) * 4 + 2 - local55 / 32;
					local651 = local598.anInt1484 * 4;
					local651 *= local651;
					Static271.method4517(arg1, local680, local651, arg0, arg2, local598.anInt1485, local8, local468);
				}
				if (local598.anInt1480 == 10 && local598.anInt1473 >= 0 && Static157.aClass22_Sub2_Sub1_Sub1Array1.length > local598.anInt1473) {
					@Pc(738) Class22_Sub2_Sub1_Sub1 local738 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local598.anInt1473];
					if (local738 != null) {
						local468 = local738.anInt5973 / 32 - local52 / 32;
						local651 = local738.anInt5967 / 32 - local55 / 32;
						Static271.method4517(arg1, local468, 360000, arg0, arg2, local598.anInt1485, local8, local651);
					}
				}
			}
		}
		if (Static118.anInt6324 == 4) {
			return;
		}
		if (Static35.anInt1025 != 0) {
			local398 = Static35.anInt1025 * 4 + Static252.aClass22_Sub2_Sub1_Sub1_4.method4421() * 2 + 2 - local52 / 32 - 2;
			local680 = Static259.anInt5013 * 4 + (Static252.aClass22_Sub2_Sub1_Sub1_4.method4421() - 1) * 2 + 2 - local55 / 32;
			Static49.method1084(local680, local398, local8, arg2, arg0, arg1, Static350.aClass52Array16[Static35.aBoolean78 ? 1 : 0]);
		}
		arg3.method5477(arg0 + arg1.anInt515 / 2 - 1, arg2 + -1 + arg1.anInt523 / 2, 3, 3, -1);
		return;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method3777() {
		Static33.anInt735 = 0;
		Static76.aClass74_8.method1803();
		Static169.aBoolean260 = false;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(JB)V")
	public static void method3778(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Z")
	public static boolean method3779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class122 local7 = Static245.method4227(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local7.method3226(arg1);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)Lclient!gl;")
	public static Class22_Sub4 method3780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass22_Sub4_2;
	}
}
