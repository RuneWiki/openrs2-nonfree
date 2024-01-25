import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
	public static int anInt6211;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
	public static int anInt6201 = -1;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_50 = new Class220(64);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIBIIIIIIIIII)V")
	public static void method5184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static420.aClass84Array4 == null) {
			return;
		}
		@Pc(21) Class3_Sub3_Sub6 local21;
		@Pc(17) int local17;
		if (arg12 >= 0) {
			local17 = arg12 - 1;
			local21 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local17];
		} else {
			local17 = -arg12 - 1;
			if (Static251.anInt4268 == local17) {
				local21 = Static134.aClass3_Sub3_Sub6_Sub1_1;
			} else {
				local21 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local17];
			}
		}
		if (local21 == null) {
			return;
		}
		@Pc(51) Class118 local51 = Static113.aClass127_2.method2820(arg10);
		@Pc(65) int local65;
		@Pc(62) int local62;
		if (arg7 == 1 || arg7 == 3) {
			local65 = local51.anInt3025;
			local62 = local51.anInt2997;
		} else {
			local62 = local51.anInt3025;
			local65 = local51.anInt2997;
		}
		@Pc(80) int local80 = arg6 + (local65 >> 1);
		@Pc(88) int local88 = (local65 + 1 >> 1) + arg6;
		@Pc(94) int local94 = (local62 >> 1) + arg8;
		@Pc(102) int local102 = (local62 + 1 >> 1) + arg8;
		@Pc(106) Class84 local106 = Static420.aClass84Array4[arg5];
		@Pc(130) int local130 = local106.method5322(local80, local94) + local106.method5322(local88, local94) + local106.method5322(local80, local102) + local106.method5322(local88, local102) >> 2;
		@Pc(134) Class6_Sub28 local134 = new Class6_Sub28();
		local134.anInt5227 = arg8;
		local134.anInt5224 = local21.aByte93;
		local134.anInt5230 = arg1;
		local134.anInt5221 = arg7;
		local134.anInt5229 = arg9 + Static125.anInt2225;
		local134.anInt5218 = arg10;
		@Pc(160) int local160;
		if (arg4 > arg3) {
			local160 = arg4;
			arg4 = arg3;
			arg3 = local160;
		}
		local134.anInt5228 = Static125.anInt2225 + arg2;
		local134.anInt5222 = arg6;
		local134.anInt5234 = arg4 + arg6;
		local134.anInt5225 = arg3 + arg6;
		if (arg11 > arg0) {
			local160 = arg11;
			arg11 = arg0;
			arg0 = local160;
		}
		local134.anInt5235 = (local134.anInt5222 << 7) + (local65 << 6);
		local134.anInt5231 = (local62 << 6) + (local134.anInt5227 << 7);
		local134.anInt5220 = arg0 + arg8;
		local134.anInt5226 = arg8 + arg11;
		local134.anInt5223 = local130;
		Static49.aClass88_11.method1878(local134);
		local21.aClass6_Sub28_3 = local134;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Lclient!od;")
	public static Class6_Sub24 method5185() {
		if (Static36.aClass88_24 == null || Static383.aClass236_1 == null) {
			return null;
		}
		for (@Pc(21) Class6_Sub24 local21 = (Class6_Sub24) Static383.aClass236_1.method5315(); local21 != null; local21 = (Class6_Sub24) Static383.aClass236_1.method5315()) {
			@Pc(29) Class94 local29 = Static36.aClass254_5.method5834(local21.anInt4802);
			if (local29 != null && local29.aBoolean163 && local29.method2000(Static36.anInterface4_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FIFF)I")
	public static int method5187(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local12 < local21 && local35 < local21) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local21 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
