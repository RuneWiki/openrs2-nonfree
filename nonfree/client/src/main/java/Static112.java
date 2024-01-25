import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!di", name = "q", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!nt;I)V")
	public static void method2178(@OriginalArg(0) Class270 arg0) {
		if (arg0.anInt7008 == 5 && arg0.anInt7001 != -1) {
			Static196.method3476(Static153.aClass22_4, arg0);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V")
	public static void method2179(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class3_Sub56 local6 = (Class3_Sub56) Static581.aClass342_71.method7644(); local6 != null; local6 = (Class3_Sub56) Static581.aClass342_71.method7650()) {
			Static496.method6781(local6, arg1, arg3, arg0, arg2);
		}
		if (3 != 3) {
			return;
		}
		@Pc(150) int local150;
		@Pc(199) boolean local199;
		for (@Pc(42) Class3_Sub56 local42 = (Class3_Sub56) Static420.aClass342_49.method7644(); local42 != null; local42 = (Class3_Sub56) Static420.aClass342_49.method7650()) {
			@Pc(46) byte local46 = 1;
			@Pc(51) Class226 local51 = local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.method7489();
			@Pc(57) int local57 = local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.aClass45_9.method6577();
			if (local57 == -1 || local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.aBoolean593) {
				local46 = 0;
			} else if (local51.anInt5787 == local57 || local57 == local51.anInt5819 || local57 == local51.anInt5815 || local51.anInt5780 == local57) {
				local46 = 2;
			} else if (local57 == local51.anInt5793 || local51.anInt5812 == local57 || local51.anInt5802 == local57 || local51.anInt5800 == local57) {
				local46 = 3;
			}
			if (local42.anInt10747 != local46) {
				local150 = Static642.method8456(local42.aClass9_Sub1_Sub1_Sub2_Sub2_3);
				@Pc(154) Class219 local154 = local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.aClass219_1;
				if (local154.anIntArray405 != null) {
					local154 = local154.method5035(Static380.aClass127_1);
				}
				if (local154 == null || local150 == -1) {
					local42.anInt10749 = -1;
					local42.aBoolean731 = false;
					local42.anInt10747 = local46;
				} else if (local42.anInt10749 == local150 && local42.aBoolean731 == local154.aBoolean368) {
					local42.anInt10746 = local154.anInt5689;
					local42.anInt10747 = local46;
				} else {
					local199 = false;
					if (local42.aClass3_Sub33_Sub5_1 == null) {
						local199 = true;
					} else {
						local42.anInt10746 -= 512;
						if (local42.anInt10746 <= 0) {
							Static391.aClass3_Sub33_Sub4_1.method8544(local42.aClass3_Sub33_Sub5_1);
							local42.aClass3_Sub33_Sub5_1 = null;
							local199 = true;
						}
					}
					if (local199) {
						local42.anInt10747 = local46;
						local42.aClass3_Sub27_1 = null;
						local42.anInt10746 = local154.anInt5689;
						local42.aClass3_Sub34_Sub1_1 = null;
						local42.aBoolean731 = local154.aBoolean368;
						local42.anInt10749 = local150;
					}
				}
			}
			local42.anInt10743 = local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.anInt10694;
			local42.anInt10744 = local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.anInt10694 + (local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.method7485() << 8);
			local42.anInt10741 = local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.anInt10695;
			local42.anInt10748 = local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.anInt10695 + (local42.aClass9_Sub1_Sub1_Sub2_Sub2_3.method7485() << 8);
			Static496.method6781(local42, arg1, arg3, arg0, arg2);
		}
		for (@Pc(328) Class3_Sub56 local328 = (Class3_Sub56) Static251.aClass313_20.method7103(); local328 != null; local328 = (Class3_Sub56) Static251.aClass313_20.method7110()) {
			@Pc(332) byte local332 = 1;
			@Pc(337) Class226 local337 = local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.method7489();
			local150 = local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.aClass45_9.method6577();
			if (local150 == -1 || local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.aBoolean593) {
				local332 = 0;
			} else if (local337.anInt5787 == local150 || local337.anInt5819 == local150 || local337.anInt5815 == local150 || local337.anInt5780 == local150) {
				local332 = 2;
			} else if (local150 == local337.anInt5793 || local150 == local337.anInt5812 || local337.anInt5802 == local150 || local150 == local337.anInt5800) {
				local332 = 3;
			}
			if (local328.anInt10747 != local332) {
				@Pc(438) int local438 = Static157.method2548(local328.aClass9_Sub1_Sub1_Sub2_Sub1_3);
				if (local328.anInt10749 == local438 && local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.aBoolean35 == local328.aBoolean731) {
					local328.anInt10746 = local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.anInt519;
					local328.anInt10747 = local332;
				} else {
					local199 = false;
					if (local328.aClass3_Sub33_Sub5_1 == null) {
						local199 = true;
					} else {
						local328.anInt10746 -= 512;
						if (local328.anInt10746 <= 0) {
							Static391.aClass3_Sub33_Sub4_1.method8544(local328.aClass3_Sub33_Sub5_1);
							local199 = true;
							local328.aClass3_Sub33_Sub5_1 = null;
						}
					}
					if (local199) {
						local328.aClass3_Sub34_Sub1_1 = null;
						local328.anInt10747 = local332;
						local328.aBoolean731 = local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.aBoolean35;
						local328.anInt10746 = local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.anInt519;
						local328.aClass3_Sub27_1 = null;
						local328.anInt10749 = local438;
					}
				}
			}
			local328.anInt10743 = local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.anInt10694;
			local328.anInt10744 = local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.anInt10694 + (local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.method7485() << 8);
			local328.anInt10741 = local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.anInt10695;
			local328.anInt10748 = local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.anInt10695 + (local328.aClass9_Sub1_Sub1_Sub2_Sub1_3.method7485() << 8);
			Static496.method6781(local328, arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZIBI)V")
	public static void method2180(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static248.method3510();
		Static42.aLong42 = 0L;
		@Pc(19) int local19 = Static276.method3880(3);
		if (arg0 == 3 || local19 == 3) {
			arg1 = true;
		}
		if (!Static153.aClass22_4.method9335()) {
			arg1 = true;
		}
		Static471.method6411(local19, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIB)I")
	public static int method2181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 >>> 31;
		return (local14 + arg1) / arg0 - local14;
	}
}
