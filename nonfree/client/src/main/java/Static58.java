import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cda", name = "Lb", descriptor = "I")
	public static final int anInt1503 = 1337;

	@OriginalMember(owner = "client!cda", name = "D", descriptor = "(I)V")
	public static void method1492() {
		Static269.aClass27Array1 = null;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IILclient!nf;BII)V")
	public static void method1498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub37 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt7024 == -1 && arg2.anIntArray449 == null) {
			return;
		}
		@Pc(13) int local13 = 0;
		if (arg1 > arg2.anInt7020) {
			local13 = arg1 - arg2.anInt7020;
		} else if (arg1 < arg2.anInt7023) {
			local13 = arg2.anInt7023 - arg1;
		}
		@Pc(53) int local53 = Static455.aClass3_Sub27_Sub1_1.anInt4797 * arg2.anInt7025 >> 8;
		if (arg2.anInt7027 < arg3) {
			local13 += arg3 - arg2.anInt7027;
		} else if (arg3 < arg2.anInt7019) {
			local13 += arg2.anInt7019 - arg3;
		}
		if (arg2.anInt7018 == 0 || local13 - 256 > arg2.anInt7018 || Static455.aClass3_Sub27_Sub1_1.anInt4797 == 0 || arg2.anInt7029 != arg4) {
			if (arg2.aClass3_Sub14_Sub2_4 != null) {
				Static485.aClass3_Sub14_Sub1_2.method2816(arg2.aClass3_Sub14_Sub2_4);
				arg2.aClass3_Sub16_3 = null;
				arg2.aClass3_Sub6_Sub1_3 = null;
				arg2.aClass3_Sub14_Sub2_4 = null;
			}
			if (arg2.aClass3_Sub14_Sub2_3 != null) {
				Static485.aClass3_Sub14_Sub1_2.method2816(arg2.aClass3_Sub14_Sub2_3);
				arg2.aClass3_Sub16_2 = null;
				arg2.aClass3_Sub14_Sub2_3 = null;
				arg2.aClass3_Sub6_Sub1_4 = null;
			}
			return;
		}
		local13 -= 256;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(151) int local151 = local53 * (arg2.anInt7018 - local13) / arg2.anInt7018;
		@Pc(198) Class3_Sub14_Sub2 local198;
		if (arg2.aClass3_Sub14_Sub2_4 != null) {
			arg2.aClass3_Sub14_Sub2_4.method6378(local151);
		} else if (arg2.anInt7024 >= 0) {
			if (arg2.aBoolean592) {
				if (arg2.aClass3_Sub16_3 == null) {
					arg2.aClass3_Sub16_3 = Static176.method3142(Static33.aClass254_14, arg2.anInt7024);
				}
				if (arg2.aClass3_Sub16_3 != null) {
					if (arg2.aClass3_Sub6_Sub1_3 == null) {
						arg2.aClass3_Sub6_Sub1_3 = arg2.aClass3_Sub16_3.method3134(new int[] { 22050 });
					}
					if (arg2.aClass3_Sub6_Sub1_3 != null) {
						local198 = Static606.method6354(arg2.aClass3_Sub6_Sub1_3, local151);
						local198.method6369(-1);
						Static485.aClass3_Sub14_Sub1_2.method2820(local198);
						arg2.aClass3_Sub14_Sub2_4 = local198;
					}
				}
			} else {
				@Pc(214) Class273 local214 = Static607.method6869(Static151.aClass254_50, arg2.anInt7024, 0);
				if (local214 != null) {
					@Pc(221) Class3_Sub6_Sub1 local221 = local214.method6871().method1167(Static56.aClass222_1);
					@Pc(226) Class3_Sub14_Sub2 local226 = Static606.method6354(local221, local151);
					local226.method6369(-1);
					Static485.aClass3_Sub14_Sub1_2.method2820(local226);
					arg2.aClass3_Sub14_Sub2_4 = local226;
				}
			}
		}
		if (arg2.aClass3_Sub14_Sub2_3 != null) {
			arg2.aClass3_Sub14_Sub2_3.method6378(local151);
			if (arg2.aClass3_Sub14_Sub2_3.method8414()) {
				return;
			}
			arg2.aClass3_Sub6_Sub1_4 = null;
			arg2.aClass3_Sub16_2 = null;
			arg2.aClass3_Sub14_Sub2_3 = null;
		} else if (arg2.anIntArray449 != null && (arg2.anInt7021 -= arg0) <= 0) {
			@Pc(273) int local273;
			if (!arg2.aBoolean593) {
				local273 = (int) ((double) arg2.anIntArray449.length * Math.random());
				@Pc(281) Class273 local281 = Static607.method6869(Static151.aClass254_50, arg2.anIntArray449[local273], 0);
				if (local281 != null) {
					@Pc(288) Class3_Sub6_Sub1 local288 = local281.method6871().method1167(Static56.aClass222_1);
					@Pc(293) Class3_Sub14_Sub2 local293 = Static606.method6354(local288, local151);
					local293.method6369(0);
					Static485.aClass3_Sub14_Sub1_2.method2820(local293);
					arg2.anInt7021 = arg2.anInt7017 + (int) (Math.random() * (double) (arg2.anInt7016 - arg2.anInt7017));
					arg2.aClass3_Sub14_Sub2_3 = local293;
					return;
				}
				return;
			}
			if (arg2.aClass3_Sub16_2 == null) {
				local273 = (int) (Math.random() * (double) arg2.anIntArray449.length);
				arg2.aClass3_Sub16_2 = Static176.method3142(Static33.aClass254_14, arg2.anIntArray449[local273]);
			}
			if (arg2.aClass3_Sub16_2 != null) {
				if (arg2.aClass3_Sub6_Sub1_4 == null) {
					arg2.aClass3_Sub6_Sub1_4 = arg2.aClass3_Sub16_2.method3134(new int[] { 22050 });
				}
				if (arg2.aClass3_Sub6_Sub1_4 != null) {
					local198 = Static606.method6354(arg2.aClass3_Sub6_Sub1_4, local151);
					local198.method6369(0);
					Static485.aClass3_Sub14_Sub1_2.method2820(local198);
					arg2.aClass3_Sub14_Sub2_3 = local198;
					arg2.anInt7021 = (int) (Math.random() * (double) (arg2.anInt7016 - arg2.anInt7017)) + arg2.anInt7017;
					return;
				}
			}
		}
	}
}
