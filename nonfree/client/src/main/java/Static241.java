import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public static int anInt4507;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method4003(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(18) String local18 = arg1[arg2];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg2 + arg0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg2; local33 < local29; local33++) {
				@Pc(39) String local39 = arg1[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(71) StringBuffer local71 = new StringBuffer(local31);
			for (@Pc(73) int local73 = arg2; local73 < local29; local73++) {
				@Pc(79) String local79 = arg1[local73];
				if (local79 == null) {
					local71.append("null");
				} else {
					local71.append(local79);
				}
			}
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIZ)V")
	public static void method4004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(6) Class3_Sub17 local6 = (Class3_Sub17) Static200.aClass130_19.method3543(); local6 != null; local6 = (Class3_Sub17) Static200.aClass130_19.method3551()) {
			Static495.method6685(arg2, local6, arg3, arg0, arg1);
		}
		for (@Pc(31) Class3_Sub17 local31 = (Class3_Sub17) Static312.aClass130_37.method3543(); local31 != null; local31 = (Class3_Sub17) Static312.aClass130_37.method3551()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class267 local40 = local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.method5573();
			if (local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.aBoolean528) {
				local35 = 0;
			} else if (local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt6461 == local40.anInt7022 || local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt6461 == local40.anInt7026 || local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt6461 == local40.anInt7028 || local40.anInt7037 == local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt6461) {
				local35 = 2;
			} else if (local40.anInt7013 == local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt6461 || local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt6461 == local40.anInt7034 || local40.anInt7018 == local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt6461 || local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt6461 == local40.anInt7010) {
				local35 = 3;
			}
			if (local31.anInt2488 != local35) {
				@Pc(131) int local131 = Static459.method6379(local31.aClass9_Sub1_Sub1_Sub2_Sub1_1);
				@Pc(135) Class294 local135 = local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.aClass294_1;
				if (local135.anIntArray588 != null) {
					local135 = local135.method6429(Static427.aClass56_1);
				}
				if (local135 == null || local131 == -1) {
					local31.anInt2498 = -1;
					local31.aBoolean205 = false;
				} else if (local131 != local31.anInt2498 || local31.aBoolean205 != local135.aBoolean604) {
					if (local31.aClass3_Sub6_Sub2_2 != null) {
						Static164.aClass3_Sub6_Sub1_1.method291(local31.aClass3_Sub6_Sub2_2);
						local31.aClass3_Sub6_Sub2_2 = null;
					}
					local31.aClass3_Sub36_1 = null;
					local31.anInt2498 = local131;
					local31.aClass3_Sub20_Sub1_3 = null;
					local31.aBoolean205 = local135.aBoolean604;
				}
				local31.anInt2488 = local35;
			}
			local31.anInt2500 = local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt8975;
			local31.anInt2490 = local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt8975 + (local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.method5569() << 8);
			local31.anInt2497 = local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt8980;
			local31.anInt2489 = local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.anInt8980 + (local31.aClass9_Sub1_Sub1_Sub2_Sub1_1.method5569() << 8);
			Static495.method6685(arg2, local31, arg3, arg0, arg1);
		}
		for (@Pc(257) Class3_Sub17 local257 = (Class3_Sub17) Static145.aClass310_11.method6602(); local257 != null; local257 = (Class3_Sub17) Static145.aClass310_11.method6599()) {
			@Pc(261) byte local261 = 1;
			@Pc(266) Class267 local266 = local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.method5573();
			if (local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.aBoolean528) {
				local261 = 0;
			} else if (local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6461 == local266.anInt7022 || local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6461 == local266.anInt7026 || local266.anInt7028 == local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6461 || local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6461 == local266.anInt7037) {
				local261 = 2;
			} else if (local266.anInt7013 == local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6461 || local266.anInt7034 == local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6461 || local266.anInt7018 == local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6461 || local266.anInt7010 == local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt6461) {
				local261 = 3;
			}
			if (local261 != local257.anInt2488) {
				@Pc(353) int local353 = Static541.method7125(local257.aClass9_Sub1_Sub1_Sub2_Sub2_1);
				if (local353 != local257.anInt2498 || local257.aBoolean205 != local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.aBoolean534) {
					if (local257.aClass3_Sub6_Sub2_2 != null) {
						Static164.aClass3_Sub6_Sub1_1.method291(local257.aClass3_Sub6_Sub2_2);
						local257.aClass3_Sub6_Sub2_2 = null;
					}
					local257.aClass3_Sub36_1 = null;
					local257.aBoolean205 = local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.aBoolean534;
					local257.anInt2498 = local353;
					local257.aClass3_Sub20_Sub1_3 = null;
				}
				local257.anInt2488 = local261;
			}
			local257.anInt2500 = local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt8975;
			local257.anInt2490 = local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt8975 + (local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.method5569() << 8);
			local257.anInt2497 = local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt8980;
			local257.anInt2489 = local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.anInt8980 + (local257.aClass9_Sub1_Sub1_Sub2_Sub2_1.method5569() << 8);
			Static495.method6685(arg2, local257, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!mq;III)V")
	public static void method4005(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static370.aClass217ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Z")
	public static boolean method4006() {
		try {
			return Static416.method5980();
		} catch (@Pc(14) IOException local14) {
			Static492.method5129();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static230.aClass272_135 == null ? -1 : Static230.aClass272_135.method6072()) + "," + (Static428.aClass272_46 == null ? -1 : Static428.aClass272_46.method6072()) + "," + (Static196.aClass272_118 == null ? -1 : Static196.aClass272_118.method6072()) + " - " + Static178.anInt8249 + "," + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0] + Static529.anInt8344) + "," + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0] + Static463.anInt7588) + " - ";
			for (@Pc(79) int local79 = 0; Static178.anInt8249 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static187.aClass3_Sub11_Sub1_1.aByteArray36[local79] + ",";
			}
			Static379.method5607(local77, local19);
			Static429.method6073(false);
			return true;
		}
	}
}
