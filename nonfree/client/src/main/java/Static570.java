import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!vw", name = "P", descriptor = "I")
	public static int anInt9271;

	@OriginalMember(owner = "client!vw", name = "S", descriptor = "Lclient!bp;")
	public static Class39 aClass39_7;

	@OriginalMember(owner = "client!vw", name = "T", descriptor = "I")
	public static int anInt9273;

	@OriginalMember(owner = "client!vw", name = "U", descriptor = "Ljava/lang/Object;")
	public static Object anObject20;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIII)V")
	public static void method7669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub18 local10 = (Class3_Sub18) Static220.aClass112_25.method3088(); local10 != null; local10 = (Class3_Sub18) Static220.aClass112_25.method3084()) {
			Static324.method4693(arg0, arg2, arg3, arg1, local10);
		}
		for (@Pc(35) Class3_Sub18 local35 = (Class3_Sub18) Static350.aClass112_47.method3088(); local35 != null; local35 = (Class3_Sub18) Static350.aClass112_47.method3084()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class365 local44 = local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.method7861();
			if (local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.aBoolean739) {
				local39 = 0;
			} else if (local44.anInt9746 == local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9512 || local44.anInt9727 == local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9512 || local44.anInt9733 == local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9512 || local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9512 == local44.anInt9761) {
				local39 = 2;
			} else if (local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9512 == local44.anInt9747 || local44.anInt9730 == local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9512 || local44.anInt9728 == local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9512 || local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9512 == local44.anInt9729) {
				local39 = 3;
			}
			if (local35.anInt3363 != local39) {
				@Pc(139) int local139 = Static270.method4111(local35.aClass41_Sub2_Sub1_Sub4_Sub1_1);
				@Pc(143) Class264 local143 = local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.aClass264_1;
				if (local143.anIntArray443 != null) {
					local143 = local143.method5994(Static491.aClass318_1);
				}
				if (local143 == null || local139 == -1) {
					local35.anInt3372 = -1;
					local35.aBoolean264 = false;
				} else if (local139 != local35.anInt3372 || local35.aBoolean264 != local143.aBoolean532) {
					if (local35.aClass3_Sub4_Sub1_3 != null) {
						Static353.aClass3_Sub4_Sub2_1.method639(local35.aClass3_Sub4_Sub1_3);
						local35.aClass3_Sub4_Sub1_3 = null;
					}
					local35.aClass3_Sub50_1 = null;
					local35.aBoolean264 = local143.aBoolean532;
					local35.aClass3_Sub48_Sub1_2 = null;
					local35.anInt3372 = local139;
				}
				local35.anInt3363 = local39;
			}
			local35.anInt3370 = local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9444;
			local35.anInt3357 = local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9444 + (local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.method7858() << 8);
			local35.anInt3359 = local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9442;
			local35.anInt3371 = local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.anInt9442 + (local35.aClass41_Sub2_Sub1_Sub4_Sub1_1.method7858() << 8);
			Static324.method4693(arg0, arg2, arg3, arg1, local35);
		}
		for (@Pc(259) Class3_Sub18 local259 = (Class3_Sub18) Static173.aClass354_14.method7694(); local259 != null; local259 = (Class3_Sub18) Static173.aClass354_14.method7692()) {
			@Pc(263) byte local263 = 1;
			@Pc(268) Class365 local268 = local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.method7861();
			if (local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.aBoolean739) {
				local263 = 0;
			} else if (local268.anInt9746 == local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9512 || local268.anInt9727 == local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9512 || local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9512 == local268.anInt9733 || local268.anInt9761 == local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9512) {
				local263 = 2;
			} else if (local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9512 == local268.anInt9747 || local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9512 == local268.anInt9730 || local268.anInt9728 == local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9512 || local268.anInt9729 == local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9512) {
				local263 = 3;
			}
			if (local259.anInt3363 != local263) {
				@Pc(359) int local359 = Static252.method3888(local259.aClass41_Sub2_Sub1_Sub4_Sub2_1);
				if (local359 != local259.anInt3372 || local259.aBoolean264 != local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.aBoolean744) {
					if (local259.aClass3_Sub4_Sub1_3 != null) {
						Static353.aClass3_Sub4_Sub2_1.method639(local259.aClass3_Sub4_Sub1_3);
						local259.aClass3_Sub4_Sub1_3 = null;
					}
					local259.aClass3_Sub48_Sub1_2 = null;
					local259.aClass3_Sub50_1 = null;
					local259.anInt3372 = local359;
					local259.aBoolean264 = local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.aBoolean744;
				}
				local259.anInt3363 = local263;
			}
			local259.anInt3370 = local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9444;
			local259.anInt3357 = local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9444 + (local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.method7858() << 8);
			local259.anInt3359 = local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9442;
			local259.anInt3371 = local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.anInt9442 + (local259.aClass41_Sub2_Sub1_Sub4_Sub2_1.method7858() << 8);
			Static324.method4693(arg0, arg2, arg3, arg1, local259);
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V")
	public static void method7670() {
		if (Static140.aClass151Array1 == null) {
			Static140.aClass151Array1 = Static233.method3633();
			Static215.aClass151_1 = Static140.aClass151Array1[0];
			Static574.aLong266 = Static158.method2936();
		}
		if (Static143.aClass275_1 == null) {
			Static474.method6522();
		}
		@Pc(23) Class151 local23 = Static215.aClass151_1;
		@Pc(26) int local26 = Static585.method7829();
		if (local23 == Static215.aClass151_1) {
			Static298.aString37 = Static215.aClass151_1.aClass343_2.method7222(Static256.anInt4535);
			if (Static215.aClass151_1.aBoolean302) {
				Static344.anInt6027 = Static215.aClass151_1.anInt4131 + (Static215.aClass151_1.anInt4134 - Static215.aClass151_1.anInt4131) * local26 / 100;
			}
			if (Static215.aClass151_1.aBoolean303) {
				Static298.aString37 = Static298.aString37 + Static344.anInt6027 + "%";
			}
		} else if (Static233.aClass151_23 == Static215.aClass151_1) {
			Static143.aClass275_1 = null;
			Static25.method439(3);
		} else {
			Static298.aString37 = local23.aClass343_1.method7222(Static256.anInt4535);
			if (Static215.aClass151_1.aBoolean303) {
				Static298.aString37 = Static298.aString37 + local23.anInt4134 + "%";
			}
			Static344.anInt6027 = local23.anInt4134;
			if (Static215.aClass151_1.aBoolean302 || local23.aBoolean302) {
				Static574.aLong266 = Static158.method2936();
			}
		}
		if (Static143.aClass275_1 == null) {
			return;
		}
		Static143.aClass275_1.method6100(Static298.aString37, Static574.aLong266, Static344.anInt6027, Static215.aClass151_1);
		if (Static148.anInterface15Array1 == null) {
			return;
		}
		for (@Pc(126) int local126 = Static257.anInt4536 + 1; local126 < Static148.anInterface15Array1.length; local126++) {
			if (Static148.anInterface15Array1[local126].method7603() >= 100 && local126 - 1 == Static257.anInt4536 && Static32.anInt602 >= 1 && Static143.aClass275_1.method6092()) {
				try {
					Static148.anInterface15Array1[local126].method7601();
				} catch (@Pc(160) Exception local160) {
					Static148.anInterface15Array1 = null;
					break;
				}
				Static143.aClass275_1.method6103(Static148.anInterface15Array1[local126]);
				Static257.anInt4536++;
				if (Static148.anInterface15Array1.length - 1 <= Static257.anInt4536 && Static148.anInterface15Array1.length > 1) {
					Static257.anInt4536 = Static427.aClass88_1.method2598() ? 0 : -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IZI)I")
	public static int method7671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static551.anIntArray574[arg0 & 0x3] : Static404.anIntArray431[arg0 & 0x3];
	}
}
