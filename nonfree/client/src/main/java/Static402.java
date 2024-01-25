import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
	public static int anInt6977 = 0;

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
	public static int anInt6978 = 0;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)I")
	public static int method5813() {
		if (Static142.anInt3184 == 0) {
			Static217.aClass158_2.method3735(new Class131("jaclib"));
			if (Static217.aClass158_2.method3737().method5811() != 100) {
				return 1;
			}
			if (!((Class131) Static217.aClass158_2.method3737()).method3363()) {
				Static81.aClient7.method1211();
			}
			Static142.anInt3184 = 1;
		}
		@Pc(230) int local230;
		@Pc(253) int local253;
		@Pc(267) int local267;
		@Pc(275) int local275;
		if (Static142.anInt3184 == 1) {
			Static227.aClass158Array1 = Static217.method3739();
			Static217.aClass158_1.method3735(new Class199(Static39.aClass31_11));
			Static217.aClass158_3.method3735(new Class131("jaggl"));
			Static217.aClass158_4.method3735(new Class131("jagdx"));
			Static217.aClass158_5.method3735(new Class131("jagmisc"));
			Static217.aClass158_6.method3735(new Class131("sw3d"));
			Static217.aClass158_7.method3735(new Class131("hw3d"));
			Static217.aClass158_8.method3735(new Class199(Static422.aClass31_95));
			Static217.aClass158_9.method3735(new Class199(Static320.aClass31_68));
			Static217.aClass158_10.method3735(new Class199(Static483.aClass31_104));
			Static217.aClass158_11.method3735(new Class199(Static592.aClass31_124));
			Static217.aClass158_12.method3735(new Class199(Static577.aClass31_122));
			Static217.aClass158_13.method3735(new Class199(Static577.aClass31_123));
			Static217.aClass158_14.method3735(new Class199(Static478.aClass31_103));
			Static217.aClass158_15.method3735(new Class199(Static408.aClass31_90));
			Static217.aClass158_16.method3735(new Class199(Static485.aClass31_105));
			Static217.aClass158_17.method3735(new Class199(Static173.aClass31_37));
			Static217.aClass158_18.method3735(new Class199(Static181.aClass31_39));
			Static217.aClass158_19.method3735(new Class199(Static124.aClass31_25));
			Static217.aClass158_20.method3735(new Class199(Static71.aClass31_18));
			Static217.aClass158_21.method3735(new Class199(Static220.aClass31_49));
			Static217.aClass158_22.method3735(new Class204(Static334.aClass31_71, "huffman"));
			Static217.aClass158_23.method3735(new Class199(Static40.aClass31_12));
			Static217.aClass158_24.method3735(new Class199(Static328.aClass31_69));
			Static217.aClass158_25.method3735(new Class199(Static520.aClass31_110));
			Static217.aClass158_26.method3735(new Class265(Static376.aClass31_82, "details"));
			for (local230 = 0; local230 < Static227.aClass158Array1.length; local230++) {
				if (Static227.aClass158Array1[local230].method3737() == null) {
					throw new RuntimeException();
				}
			}
			local253 = 0;
			@Pc(255) Class158[] local255 = Static227.aClass158Array1;
			for (@Pc(257) int local257 = 0; local257 < local255.length; local257++) {
				@Pc(263) Class158 local263 = local255[local257];
				local267 = local263.method3736();
				local275 = local263.method3737().method5811();
				local253 += local275 * local267 / 100;
			}
			Static142.anInt3184 = 2;
			Static137.anInt3123 = local253;
		}
		if (Static227.aClass158Array1 == null) {
			return 100;
		}
		local230 = 0;
		local253 = 0;
		@Pc(306) boolean local306 = true;
		@Pc(308) Class158[] local308 = Static227.aClass158Array1;
		for (@Pc(310) int local310 = 0; local310 < local308.length; local310++) {
			@Pc(316) Class158 local316 = local308[local310];
			local275 = local316.method3736();
			@Pc(328) int local328 = local316.method3737().method5811();
			if (local328 < 100) {
				local306 = false;
			}
			local230 += local275;
			local253 += local275 * local328 / 100;
		}
		if (local306) {
			if (!((Class131) Static217.aClass158_5.method3737()).method3363()) {
				Static81.aClient7.method1216();
			}
			Static227.aClass158Array1 = null;
		}
		local253 -= Static137.anInt3123;
		local230 -= Static137.anInt3123;
		local267 = local230 > 0 ? local253 * 100 / local230 : 100;
		if (!local306 && local267 > 99) {
			local267 = 99;
		}
		return local267;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static474.method3731(arg1)) {
			if (Static355.aClass115ArrayArray1[arg1] == null) {
				Static504.method7175(-1, arg4, arg5, arg7, arg0, arg3, Static458.aClass115ArrayArray2[arg1], arg6, arg2);
			} else {
				Static504.method7175(-1, arg4, arg5, arg7, arg0, arg3, Static355.aClass115ArrayArray1[arg1], arg6, arg2);
			}
		} else if (arg0 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static271.aBooleanArray21[local14] = true;
			}
		} else {
			Static271.aBooleanArray21[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
	public static void method5815() {
		for (@Pc(16) Class4_Sub44 local16 = (Class4_Sub44) Static565.aClass124_65.method3267(); local16 != null; local16 = (Class4_Sub44) Static565.aClass124_65.method3273()) {
			if (Static309.aClass100ArrayArrayArray2 == null) {
				local16.method8013();
			} else {
				@Pc(38) int local38;
				@Pc(51) Class10_Sub4 local51;
				@Pc(87) Class10_Sub4_Sub2 local87;
				@Pc(117) Class10_Sub1 local117;
				@Pc(218) Class10_Sub5 local218;
				@Pc(255) Class10_Sub2 local255;
				@Pc(237) Class10_Sub5_Sub3 local237;
				@Pc(291) Class10_Sub2_Sub1 local291;
				if (Static237.anInt7561 >= local16.anInt8040) {
					local38 = Static528.anIntArray683[local16.anInt8032];
					if (local38 == 0) {
						local255 = Static216.method3734(local16.anInt8044, local16.anInt8042, local16.anInt8047);
						if (local255 instanceof Class10_Sub2_Sub1) {
							Static596.method8017(local16.anInt8044, local16.anInt8042, local16.anInt8047);
							local291 = (Class10_Sub2_Sub1) local255;
							if (local291.aClass10_Sub2_1 != null) {
								Static461.method6470(local16.anInt8044, local16.anInt8042, local16.anInt8047, local291.aClass10_Sub2_1, null);
							}
						}
					} else if (local38 == 1) {
						local51 = Static183.method3413(local16.anInt8044, local16.anInt8042, local16.anInt8047);
						if (local51 instanceof Class10_Sub4_Sub2) {
							Static292.method4576(local16.anInt8044, local16.anInt8042, local16.anInt8047);
							local87 = (Class10_Sub4_Sub2) local51;
							if (local87.aClass10_Sub4_3 != null) {
								Static178.method3351(local16.anInt8044, local16.anInt8042, local16.anInt8047, local87.aClass10_Sub4_3, null);
							}
						}
					} else if (local38 == 2) {
						local117 = Static541.method7510(local16.anInt8044, local16.anInt8042, local16.anInt8047, qi.class);
						if (local117 instanceof Class10_Sub1_Sub5) {
							Static146.method3010(local16.anInt8044, local16.anInt8042, local16.anInt8047, qi.class);
							@Pc(393) Class10_Sub1_Sub5 local393 = (Class10_Sub1_Sub5) local117;
							if (local393.aClass10_Sub1_2 != null) {
								Static314.method7738(local393.aClass10_Sub1_2, false);
							}
						}
					} else if (local38 == 3) {
						local218 = Static38.method651(local16.anInt8044, local16.anInt8042, local16.anInt8047);
						if (local218 instanceof Class10_Sub5_Sub3) {
							Static18.method1347(local16.anInt8044, local16.anInt8042, local16.anInt8047);
							local237 = (Class10_Sub5_Sub3) local218;
							if (local237.aClass10_Sub5_2 != null) {
								Static344.method5097(local16.anInt8044, local16.anInt8042, local16.anInt8047, local237.aClass10_Sub5_2);
							}
						}
					}
					local16.method8013();
				} else if (local16.anInt8046 == Static237.anInt7561) {
					local38 = Static528.anIntArray683[local16.anInt8032];
					if (local38 == 0) {
						local255 = Static216.method3734(local16.anInt8044, local16.anInt8042, local16.anInt8047);
						if (local255 instanceof Class10_Sub2_Sub1) {
							local16.method8013();
						} else if (Static256.method4272(local16.anInt8044, local16.anInt8042, local16.anInt8047) == null) {
							local291 = new Class10_Sub2_Sub1(local16.anInt8032, local16.anInt8041, local16.anInt8035, local16.anInt8031, local16.anInt8038, local255);
							Static461.method6470(local16.anInt8044, local16.anInt8042, local16.anInt8047, local291, null);
						} else {
							local16.method8013();
						}
					} else if (local38 == 1) {
						local51 = Static183.method3413(local16.anInt8044, local16.anInt8042, local16.anInt8047);
						if (local51 instanceof Class10_Sub4_Sub2) {
							local16.method8013();
						} else if (Static378.method5647(local16.anInt8044, local16.anInt8042, local16.anInt8047) == null) {
							local87 = new Class10_Sub4_Sub2(local16.anInt8032, local16.anInt8041, local16.anInt8035, local16.anInt8031, local16.anInt8038, local51);
							Static178.method3351(local16.anInt8044, local16.anInt8042, local16.anInt8047, local87, null);
						} else {
							local16.method8013();
						}
					} else if (local38 == 2) {
						local117 = Static541.method7510(local16.anInt8044, local16.anInt8042, local16.anInt8047, qi.class);
						if (local117 instanceof Class10_Sub1_Sub5) {
							local16.method8013();
						} else {
							Static146.method3010(local16.anInt8044, local16.anInt8042, local16.anInt8047, qi.class);
							@Pc(146) Class25 local146 = Static553.aClass288_4.method6419(local16.anInt8043);
							@Pc(157) int local157;
							@Pc(160) int local160;
							if (local16.anInt8041 == 1 || local16.anInt8041 == 3) {
								local160 = local146.anInt612;
								local157 = local146.anInt638;
							} else {
								local157 = local146.anInt612;
								local160 = local146.anInt638;
							}
							@Pc(201) Class10_Sub1_Sub5 local201 = new Class10_Sub1_Sub5(local16.anInt8032, local16.anInt8041, local16.anInt8044, local16.anInt8035, local16.anInt8031, local16.anInt8038, local16.anInt8042, local16.anInt8042 + local157 - 1, local16.anInt8047, local160 + local16.anInt8047 - 1, local117);
							Static314.method7738(local201, false);
						}
					} else if (local38 == 3) {
						local218 = Static38.method651(local16.anInt8044, local16.anInt8042, local16.anInt8047);
						if (local218 instanceof Class10_Sub5_Sub3) {
							local16.method8013();
						} else {
							local237 = new Class10_Sub5_Sub3(local16.anInt8035, local16.anInt8031, local16.anInt8038, local218);
							Static344.method5097(local16.anInt8044, local16.anInt8042, local16.anInt8047, local237);
						}
					}
				}
			}
		}
	}
}
