import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "F")
	public static float aFloat139;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_36 = new Class136(5);

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "[I")
	public static final int[] anIntArray324 = new int[2];

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "Lclient!st;")
	public static final Class314 aClass314_89 = new Class314(68, 15);

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "Lclient!ip;")
	public static final Class165 aClass165_2 = new Class165();

	@OriginalMember(owner = "client!kv", name = "o", descriptor = "Z")
	public static boolean aBoolean441 = true;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V")
	public static void method5174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(19) Class3_Sub31 local19 = (Class3_Sub31) Static402.aClass216_51.method5457(); local19 != null; local19 = (Class3_Sub31) Static402.aClass216_51.method5458()) {
			Static69.method1229(arg0, arg1, arg2, local19, arg3);
		}
		@Pc(187) boolean local187;
		for (@Pc(40) Class3_Sub31 local40 = (Class3_Sub31) Static413.aClass216_52.method5457(); local40 != null; local40 = (Class3_Sub31) Static413.aClass216_52.method5458()) {
			@Pc(44) byte local44 = 1;
			@Pc(49) Class176 local49 = local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.method8633();
			if (local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10211 == -1 || local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.aBoolean773) {
				local44 = 0;
			} else if (local49.anInt5222 == local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10211 || local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10211 == local49.anInt5188 || local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10211 == local49.anInt5204 || local49.anInt5217 == local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10211) {
				local44 = 2;
			} else if (local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10211 == local49.anInt5210 || local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10211 == local49.anInt5218 || local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10211 == local49.anInt5221 || local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10211 == local49.anInt5223) {
				local44 = 3;
			}
			if (local40.anInt5933 != local44) {
				@Pc(145) int local145 = Static14.method244(local40.aClass9_Sub2_Sub1_Sub2_Sub2_1);
				@Pc(149) Class309 local149 = local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.aClass309_1;
				if (local149.anIntArray553 != null) {
					local149 = local149.method7594(Static183.aClass285_1);
				}
				if (local149 == null || local145 == -1) {
					local40.aBoolean436 = false;
					local40.anInt5933 = local44;
					local40.anInt5932 = -1;
				} else if (local145 == local40.anInt5932 && local40.aBoolean436 == local149.aBoolean657) {
					local40.anInt5933 = local44;
					local40.anInt5931 = local149.anInt8854;
				} else {
					local187 = false;
					if (local40.aClass3_Sub3_Sub5_3 == null) {
						local187 = true;
					} else {
						local40.anInt5931 -= 512;
						if (local40.anInt5931 <= 0) {
							Static304.aClass3_Sub3_Sub3_3.method2976(local40.aClass3_Sub3_Sub5_3);
							local187 = true;
							local40.aClass3_Sub3_Sub5_3 = null;
						}
					}
					if (local187) {
						local40.aBoolean436 = local149.aBoolean657;
						local40.anInt5931 = local149.anInt8854;
						local40.anInt5932 = local145;
						local40.aClass3_Sub28_2 = null;
						local40.anInt5933 = local44;
						local40.aClass3_Sub18_Sub1_4 = null;
					}
				}
			}
			local40.anInt5941 = local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10152;
			local40.anInt5947 = local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10152 + (local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.method8619() << 8);
			local40.anInt5937 = local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10158;
			local40.anInt5934 = local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.anInt10158 + (local40.aClass9_Sub2_Sub1_Sub2_Sub2_1.method8619() << 8);
			Static69.method1229(arg0, arg1, arg2, local40, arg3);
		}
		for (@Pc(303) Class3_Sub31 local303 = (Class3_Sub31) Static554.aClass25_41.method435(); local303 != null; local303 = (Class3_Sub31) Static554.aClass25_41.method432()) {
			@Pc(307) byte local307 = 1;
			@Pc(312) Class176 local312 = local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.method8633();
			if (local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10211 == -1 || local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.aBoolean773) {
				local307 = 0;
			} else if (local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10211 == local312.anInt5222 || local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10211 == local312.anInt5188 || local312.anInt5204 == local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10211 || local312.anInt5217 == local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10211) {
				local307 = 2;
			} else if (local312.anInt5210 == local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10211 || local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10211 == local312.anInt5218 || local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10211 == local312.anInt5221 || local312.anInt5223 == local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10211) {
				local307 = 3;
			}
			if (local303.anInt5933 != local307) {
				@Pc(417) int local417 = Static471.method6968(local303.aClass9_Sub2_Sub1_Sub2_Sub1_2);
				if (local417 == local303.anInt5932 && local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.aBoolean78 == local303.aBoolean436) {
					local303.anInt5931 = local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt1304;
					local303.anInt5933 = local307;
				} else {
					local187 = false;
					if (local303.aClass3_Sub3_Sub5_3 == null) {
						local187 = true;
					} else {
						local303.anInt5931 -= 512;
						if (local303.anInt5931 <= 0) {
							Static304.aClass3_Sub3_Sub3_3.method2976(local303.aClass3_Sub3_Sub5_3);
							local187 = true;
							local303.aClass3_Sub3_Sub5_3 = null;
						}
					}
					if (local187) {
						local303.anInt5931 = local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt1304;
						local303.anInt5933 = local307;
						local303.aClass3_Sub18_Sub1_4 = null;
						local303.anInt5932 = local417;
						local303.aClass3_Sub28_2 = null;
						local303.aBoolean436 = local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.aBoolean78;
					}
				}
			}
			local303.anInt5941 = local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10152;
			local303.anInt5947 = local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10152 + (local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.method8619() << 8);
			local303.anInt5937 = local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10158;
			local303.anInt5934 = local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.anInt10158 + (local303.aClass9_Sub2_Sub1_Sub2_Sub1_2.method8619() << 8);
			Static69.method1229(arg0, arg1, arg2, local303, arg3);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIB)V")
	public static void method5177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1012) {
			Static400.method6281(Static42.aClass379_2, arg1, arg0);
		} else if (arg2 == 1010) {
			Static400.method6281(Static577.aClass379_11, arg1, arg0);
		} else if (arg2 == 1008) {
			Static400.method6281(Static167.aClass379_5, arg1, arg0);
		} else if (arg2 == 1004) {
			Static400.method6281(Static215.aClass379_6, arg1, arg0);
		} else if (arg2 == 1011) {
			Static400.method6281(Static491.aClass379_8, arg1, arg0);
			return;
		}
	}
}
