import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	public static int anInt6050;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method5156(@OriginalArg(1) Class67_Sub3_Sub3_Sub2 arg0) {
		@Pc(16) Class11_Sub1 local16 = (Class11_Sub1) Static99.aClass58_9.method1009((long) arg0.anInt5038);
		if (local16 == null) {
			return;
		}
		if (local16.aClass11_Sub10_Sub1_2 != null) {
			Static341.aClass11_Sub10_Sub3_2.method3737(local16.aClass11_Sub10_Sub1_2);
			local16.aClass11_Sub10_Sub1_2 = null;
		}
		local16.method5701();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!oi;)V")
	public static void method5157(@OriginalArg(1) Class150 arg0) {
		Static164.aClass150_1 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!qa;ILclient!km;ILclient!gm;I)V")
	public static void method5158(@OriginalArg(1) int arg0, @OriginalArg(2) Class67_Sub3_Sub3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67_Sub3_Sub3_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class11_Sub1 local12 = new Class11_Sub1();
		local12.anInt88 = arg4 * 128;
		local12.anInt97 = arg0 * 128;
		local12.anInt98 = arg6;
		if (arg5 != null) {
			local12.aClass84_1 = arg5;
			@Pc(33) int local33 = arg5.anInt1988;
			@Pc(36) int local36 = arg5.anInt2035;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg5.anInt2035;
				local36 = arg5.anInt1988;
			}
			local12.anIntArray11 = arg5.anIntArray143;
			local12.anInt91 = arg5.anInt2021;
			local12.anInt87 = arg5.anInt2015;
			local12.anInt95 = arg5.anInt2024;
			local12.anInt100 = (local36 + arg0) * 128;
			local12.anInt93 = arg5.anInt2020;
			local12.anInt85 = (local33 + arg4) * 128;
			local12.anInt86 = arg5.anInt2022 * 128;
			if (arg5.anIntArray142 != null) {
				local12.aBoolean7 = true;
				local12.method78();
			}
			if (local12.anIntArray11 != null) {
				local12.anInt92 = local12.anInt95 + (int) ((double) (local12.anInt87 - local12.anInt95) * Math.random());
			}
			Static108.aClass16_19.method190(local12);
		} else if (arg3 != null) {
			local12.aClass67_Sub3_Sub3_Sub1_1 = arg3;
			@Pc(130) Class82 local130 = arg3.aClass82_1;
			if (local130.anIntArray134 != null) {
				local12.aBoolean7 = true;
				local130 = local130.method1569();
			}
			if (local130 != null) {
				local12.anInt100 = (arg0 + local130.anInt1871) * 128;
				local12.anInt85 = (arg4 + local130.anInt1871) * 128;
				local12.anInt91 = Static112.method1686(arg3);
				local12.anInt86 = local130.anInt1890 * 128;
				local12.anInt93 = local130.anInt1891;
			}
			Static169.aClass16_52.method190(local12);
		} else if (arg1 != null) {
			local12.aClass67_Sub3_Sub3_Sub2_1 = arg1;
			local12.anInt85 = (arg4 + arg1.method4368()) * 128;
			local12.anInt100 = (arg1.method4368() + arg0) * 128;
			local12.anInt91 = Static269.method4630(arg1);
			local12.anInt93 = arg1.anInt5085;
			local12.anInt86 = arg1.anInt5079 * 128;
			Static99.aClass58_9.method1006((long) arg1.anInt5038, local12);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
	public static void method5159() {
		Static212.aClass26_40.method328();
	}
}
