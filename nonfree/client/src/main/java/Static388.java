import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nda", name = "L", descriptor = "S")
	public static short aShort79 = 205;

	@OriginalMember(owner = "client!nda", name = "M", descriptor = "[F")
	public static final float[] aFloatArray47 = new float[4];

	@OriginalMember(owner = "client!nda", name = "O", descriptor = "Z")
	public static boolean aBoolean514 = false;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII[Lclient!kh;Z)V")
	public static void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class208[] arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) Class208 local13 = arg3[local7];
			if (local13 != null && arg0 == local13.anInt5634) {
				Static391.method5678(local13, arg4, arg1, arg2);
				Static528.method7386(arg2, local13, arg1);
				if (local13.anInt5594 > local13.anInt5604 - local13.anInt5639) {
					local13.anInt5594 = local13.anInt5604 - local13.anInt5639;
				}
				if (local13.anInt5649 - local13.anInt5630 < local13.anInt5648) {
					local13.anInt5648 = local13.anInt5649 - local13.anInt5630;
				}
				if (local13.anInt5594 < 0) {
					local13.anInt5594 = 0;
				}
				if (local13.anInt5648 < 0) {
					local13.anInt5648 = 0;
				}
				if (local13.anInt5643 == 0) {
					Static650.method8523(local13, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!kka;B)V")
	public static void method5653(@OriginalArg(0) Class3_Sub17_Sub2 arg0) {
		arg0.method4906();
		@Pc(20) int local20 = Static251.anInt4687;
		@Pc(30) Class23_Sub2_Sub1_Sub2_Sub1 local30 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local20] = new Class23_Sub2_Sub1_Sub2_Sub1();
		local30.anInt10180 = local20;
		@Pc(38) int local38 = arg0.method4905(30);
		@Pc(43) byte local43 = (byte) (local38 >> 28);
		@Pc(49) int local49 = local38 >> 14 & 0x3FFF;
		@Pc(53) int local53 = local38 & 0x3FFF;
		local30.anIntArray659[0] = local49 - Static417.anInt7047;
		local30.anInt10108 = (local30.anIntArray659[0] << 9) + (local30.method8625() << 8);
		local30.anIntArray660[0] = local53 - Static347.anInt7851;
		local30.anInt10109 = (local30.anIntArray660[0] << 9) + (local30.method8625() << 8);
		Static576.anInt9136 = local30.aByte142 = local30.aByte143 = local43;
		if (Static190.method3051(local30.anIntArray660[0], local30.anIntArray659[0])) {
			local30.aByte143++;
		}
		if (Static105.aClass3_Sub17Array1[local20] != null) {
			local30.method2913(Static105.aClass3_Sub17Array1[local20]);
		}
		Static187.anInt3432 = 0;
		Static668.anIntArray664[Static187.anInt3432++] = local20;
		Static177.aByteArray23[local20] = 0;
		Static491.anInt9928 = 0;
		for (@Pc(151) int local151 = 1; local151 < 2048; local151++) {
			if (local20 != local151) {
				@Pc(161) int local161 = arg0.method4905(18);
				@Pc(165) int local165 = local161 >> 16;
				@Pc(171) int local171 = local161 >> 8 & 0xFF;
				@Pc(175) int local175 = local161 & 0xFF;
				@Pc(183) Class210 local183 = Static622.aClass210Array1[local151] = new Class210();
				local183.aBoolean451 = false;
				local183.anInt5740 = 0;
				local183.anInt5738 = (local165 << 28) + (local171 << 14) + local175;
				local183.aBoolean450 = false;
				local183.anInt5737 = -1;
				Static178.anIntArray231[Static491.anInt9928++] = local151;
				Static177.aByteArray23[local151] = 0;
			}
		}
		arg0.method4908();
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BLclient!fca;)Lclient!jca;")
	public static Class84_Sub2 method5654(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(7) Class84 local7 = Static227.method3653(arg0);
		@Pc(11) int local11 = arg0.method4868();
		@Pc(20) int local20 = arg0.method4868();
		return new Class84_Sub2(local7.aClass92_13, local7.aClass65_17, local7.anInt10347, local7.anInt10345, local7.anInt10343, local7.anInt10342, local7.anInt10344, local7.anInt10346, local7.anInt10349, local11, local20);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IBIIIIII)V")
	public static void method5656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Static8.aShort3 + local7 * (Static155.aShort36 - Static8.aShort3) / 100;
		Static209.anInt10104 = Static209.anInt10102 * local33 >> 8;
		@Pc(45) int local45 = local33 * arg4 >> 8;
		@Pc(52) int local52 = 16384 - arg5 & 0x3FFF;
		@Pc(59) int local59 = 16384 - arg3 & 0x3FFF;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = local45;
		if (local52 != 0) {
			local63 = Class3_Sub7_Sub2.anIntArray171[local52] * -local45 >> 14;
			local65 = Class3_Sub7_Sub2.anIntArray170[local52] * local45 >> 14;
		}
		if (local59 != 0) {
			local61 = local65 * Class3_Sub7_Sub2.anIntArray171[local59] >> 14;
			local65 = Class3_Sub7_Sub2.anIntArray170[local59] * local65 >> 14;
		}
		Static206.anInt3821 = arg3;
		Static663.anInt10236 = arg1 - local65;
		Static265.anInt9363 = arg6 - local63;
		Static260.anInt4898 = 0;
		Static118.anInt2323 = arg5;
		Static97.anInt2082 = arg2 - local61;
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(I)V")
	public static void method5658() {
		if (!Static44.aBoolean106) {
			Static554.aFloat185 += (-12.0F - Static554.aFloat185) / 2.0F;
			Static226.aBoolean494 = true;
			Static44.aBoolean106 = true;
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IZI)Z")
	public static boolean method5659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
