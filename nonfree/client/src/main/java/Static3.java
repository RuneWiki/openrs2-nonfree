import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "J")
	public static long aLong6;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!di;")
	public static final Class54 aClass54_4 = new Class54(52, 4);

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	public static int anInt113 = -2;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method126() {
		if (Static366.aClass18_2 != null) {
			Static366.aClass18_2.method5639();
		}
		if (Static151.aClass18_1 != null) {
			Static151.aClass18_1.method5639();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILclient!lh;I)V")
	public static void method128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub24 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt4286 == -1 && arg3.anIntArray360 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = arg3.anInt4289 * Static12.aClass79_Sub1_1.anInt4915 >> 8;
		if (arg4 > arg3.anInt4277) {
			local15 = arg4 - arg3.anInt4277;
		} else if (arg4 < arg3.anInt4285) {
			local15 = arg3.anInt4285 - arg4;
		}
		if (arg1 > arg3.anInt4291) {
			local15 += arg1 - arg3.anInt4291;
		} else if (arg3.anInt4276 > arg1) {
			local15 += arg3.anInt4276 - arg1;
		}
		if (arg3.anInt4282 == 0 || local15 - 64 > arg3.anInt4282 || Static12.aClass79_Sub1_1.anInt4915 == 0 || arg2 != arg3.anInt4279) {
			if (arg3.aClass2_Sub3_Sub3_2 != null) {
				Static260.aClass2_Sub3_Sub1_2.method1826(arg3.aClass2_Sub3_Sub3_2);
				arg3.aClass2_Sub3_Sub3_2 = null;
			}
			if (arg3.aClass2_Sub3_Sub3_1 != null) {
				Static260.aClass2_Sub3_Sub1_2.method1826(arg3.aClass2_Sub3_Sub3_1);
				arg3.aClass2_Sub3_Sub3_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(146) int local146 = local23 * (arg3.anInt4282 - local15) / arg3.anInt4282;
		if (arg3.aClass2_Sub3_Sub3_2 != null) {
			arg3.aClass2_Sub3_Sub3_2.method2477(local146);
		} else if (arg3.anInt4286 >= 0) {
			@Pc(167) Class222 local167 = Static464.method4830(Static285.aClass160_58, arg3.anInt4286, 0);
			if (local167 != null) {
				@Pc(174) Class2_Sub10_Sub1 local174 = local167.method4829().method728(Static380.aClass63_1);
				@Pc(179) Class2_Sub3_Sub3 local179 = Static460.method2485(local174, local146);
				local179.method2497(-1);
				Static260.aClass2_Sub3_Sub1_2.method1827(local179);
				arg3.aClass2_Sub3_Sub3_2 = local179;
			}
		}
		if (arg3.aClass2_Sub3_Sub3_1 != null) {
			arg3.aClass2_Sub3_Sub3_1.method2477(local146);
			if (arg3.aClass2_Sub3_Sub3_1.method5865()) {
				return;
			}
			arg3.aClass2_Sub3_Sub3_1 = null;
		} else if (arg3.anIntArray360 != null && (arg3.anInt4283 -= arg0) <= 0) {
			@Pc(213) int local213 = (int) (Math.random() * (double) arg3.anIntArray360.length);
			@Pc(221) Class222 local221 = Static464.method4830(Static285.aClass160_58, arg3.anIntArray360[local213], 0);
			if (local221 != null) {
				@Pc(228) Class2_Sub10_Sub1 local228 = local221.method4829().method728(Static380.aClass63_1);
				@Pc(233) Class2_Sub3_Sub3 local233 = Static460.method2485(local228, local146);
				local233.method2497(0);
				Static260.aClass2_Sub3_Sub1_2.method1827(local233);
				arg3.aClass2_Sub3_Sub3_1 = local233;
				arg3.anInt4283 = arg3.anInt4290 + (int) (Math.random() * (double) (arg3.anInt4278 - arg3.anInt4290));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ya;ZLclient!hq;Lclient!cu;)V")
	public static void method129(@OriginalArg(0) Class49 arg0, @OriginalArg(2) Class2_Sub18 arg1, @OriginalArg(3) Class48 arg2) {
		@Pc(10) Class17 local10 = arg2.method929(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.la();
		if (local16 < local10.ma()) {
			local16 = local10.ma();
		}
		@Pc(37) int local37 = arg1.anInt3145;
		@Pc(40) int local40 = arg1.anInt3144;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(60) int local60;
		@Pc(87) int local87;
		if (arg2.aString7 != null) {
			local42 = Static86.aClass58_10.method1348(Static300.aStringArray38, null, arg2.aString7, null);
			for (local60 = 0; local60 < local42; local60++) {
				@Pc(66) String local66 = Static300.aStringArray38[local60];
				if (local60 < local42 - 1) {
					local66 = local66.substring(0, local66.length() - 4);
				}
				local87 = Static274.aClass28_11.method531(local66);
				if (local44 < local87) {
					local44 = local87;
				}
			}
			local46 = local42 * Static274.aClass28_11.method528() + Static274.aClass28_11.method530() / 2;
		}
		local60 = local16 / 2 + arg1.anInt3145;
		@Pc(121) int local121 = arg1.anInt3144;
		if (local37 < Static88.anInt4524 + local16) {
			local60 = local44 / 2 + Static88.anInt4524 + local16 / 2 + 5 + 10;
			local37 = Static88.anInt4524;
		} else if (Static88.anInt4516 - local16 < local37) {
			local37 = Static88.anInt4516 - local16;
			local60 = Static88.anInt4516 - local16 / 2 - local44 / 2 - 5 - 10;
		}
		if (local40 < Static88.anInt4518 + local16) {
			local40 = Static88.anInt4518;
			local121 = Static88.anInt4518 + local16 / 2 + 10;
		} else if (local40 > Static88.anInt4523 - local16) {
			local121 = Static88.anInt4523 - local46 - local16 / 2 - 10;
			local40 = Static88.anInt4523 - local16;
		}
		local87 = (int) (Math.atan2((double) (local37 - arg1.anInt3145), (double) (local40 - arg1.anInt3144)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5772((float) local16 / 2.0F + (float) local37, (float) local40 + (float) local16 / 2.0F, 4096, local87);
		@Pc(258) int local258 = -2;
		@Pc(260) int local260 = -2;
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		if (arg2.aString7 != null) {
			local258 = local60 - local44 / 2 - 5;
			local260 = local121;
			local262 = local258 + local44 + 10;
			local264 = Static274.aClass28_11.method528() * local42 + local121 + 3;
			if (arg2.anInt1228 != 0) {
				arg0.method4480(local258, local262 - local258, arg2.anInt1228, local121, local264 - local121);
			}
			if (arg2.anInt1211 != 0) {
				arg0.method4415(local264 - local121, local121, local262 - local258, local258, arg2.anInt1211);
			}
			for (@Pc(335) int local335 = 0; local335 < local42; local335++) {
				@Pc(341) String local341 = Static300.aStringArray38[local335];
				if (local335 < local42 - 1) {
					local341 = local341.substring(0, local341.length() - 4);
				}
				Static274.aClass28_11.method529(arg0, local341, local60, local121, arg2.anInt1214);
				local121 += Static274.aClass28_11.method528();
			}
		}
		if (arg2.anInt1227 == -1 && arg2.aString7 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(389) Class2_Sub33 local389 = new Class2_Sub33(arg1);
		local389.anInt5390 = local260;
		local389.anInt5398 = local37 - local16;
		local389.anInt5400 = local258;
		local389.anInt5393 = local16 + local40;
		local389.anInt5399 = local37 + local16;
		local389.anInt5396 = local264;
		local389.anInt5401 = local40 - local16;
		local389.anInt5394 = local262;
		Static113.aClass14_20.method300(local389);
	}
}
