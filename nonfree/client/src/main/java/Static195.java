import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gu", name = "C", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!gu", name = "T", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!gu", name = "X", descriptor = "[I")
	public static final int[] anIntArray205 = new int[8];

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII)V")
	public static void method3394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 != 8 && arg2 != 16) {
			@Pc(162) Class77 local162 = Static330.aClass77ArrayArrayArray2[arg4][arg1][arg3];
			if (local162 == null) {
				local162 = new Class77(arg4);
			}
			if (arg2 == 1) {
				local162.aShort29 = (short) arg5;
				local162.aShort28 = (short) arg0;
			} else if (arg2 == 2) {
				local162.aShort31 = (short) arg0;
				local162.aShort30 = (short) arg5;
			}
			if (Static479.aBoolean284) {
				Static490.method7292();
			}
			return;
		}
		@Pc(20) int local20;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (arg2 != 8) {
			local20 = Static384.anInt7200 + (arg1 << Static308.anInt5834);
			local25 = local20 - Static384.anInt7200;
			local29 = arg3 << Static308.anInt5834;
			local33 = Static384.anInt7200 + local29;
			local43 = Static559.aClass51Array4[arg4].method7835(arg1 + 1, arg3);
			local53 = Static559.aClass51Array4[arg4].method7835(arg1, arg3 + 1);
			Static361.aClass309Array3[Static346.anInt6729++] = new Class309(arg2, arg4, local20, local25, local25, local20, local43, local53, local53 - arg5, -arg5 + local43, local29, local33, local33, local29);
			return;
		}
		local20 = arg1 << Static308.anInt5834;
		local25 = local20 + Static384.anInt7200;
		local29 = arg3 << Static308.anInt5834;
		local33 = local29 + Static384.anInt7200;
		local43 = Static559.aClass51Array4[arg4].method7835(arg1, arg3);
		local53 = Static559.aClass51Array4[arg4].method7835(arg1 + 1, arg3 + 1);
		Static361.aClass309Array3[Static346.anInt6729++] = new Class309(arg2, arg4, local20, local25, local25, local20, local43, local53, local53 - arg5, local43 + -arg5, local29, local33, local33, local29);
	}

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "(I)V")
	public static void method3396() {
		Static605.anInt9850 = 0;
		Static577.anInt9501 = 0;
		Static590.anInt9681++;
		Static26.method1024();
		Static97.method2120();
		Static306.method4862();
		@Pc(25) boolean local25 = false;
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static577.anInt9501; local27++) {
			local33 = Static598.anIntArray636[local27];
			@Pc(40) Class3_Sub28 local40 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local33);
			@Pc(43) Class4_Sub1_Sub2_Sub1_Sub1 local43 = local40.aClass4_Sub1_Sub2_Sub1_Sub1_2;
			if (Static447.aBoolean555 && Static164.method2913(local33)) {
				Static204.method3516();
			}
			if (Static590.anInt9681 != local43.anInt5721) {
				if (local43.aClass109_1.method2811()) {
					Static325.method5300(local43);
				}
				local43.method3334(null);
				local40.method8769();
				local25 = true;
			}
		}
		if (local25) {
			Static294.anInt5193 = Static551.aClass280_43.method7106();
			Static551.aClass280_43.method7104(Static28.aClass3_Sub28Array1);
		}
		if (Static272.anInt4948 != Static30.aClass3_Sub3_Sub2_1.anInt4736) {
			throw new RuntimeException("gnp1 pos:" + Static30.aClass3_Sub3_Sub2_1.anInt4736 + " psize:" + Static272.anInt4948);
		}
		for (local33 = 0; local33 < Static94.anInt2209; local33++) {
			if (Static551.aClass280_43.method7107((long) Static520.anIntArray594[local33]) == null) {
				throw new RuntimeException("gnp2 pos:" + local33 + " size:" + Static94.anInt2209);
			}
		}
		if (Static294.anInt5193 - Static94.anInt2209 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static294.anInt5193 - Static94.anInt2209));
		}
		for (@Pc(170) int local170 = 0; local170 < Static294.anInt5193; local170++) {
			if (Static590.anInt9681 != Static28.aClass3_Sub28Array1[local170].aClass4_Sub1_Sub2_Sub1_Sub1_2.anInt5721) {
				throw new RuntimeException("gnp4 uk:" + Static28.aClass3_Sub28Array1[local170].aClass4_Sub1_Sub2_Sub1_Sub1_2.anInt5759);
			}
		}
	}
}
