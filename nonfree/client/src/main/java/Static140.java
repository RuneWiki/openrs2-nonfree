import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fca", name = "D", descriptor = "Lclient!wi;")
	public static Class195 aClass195_1;

	@OriginalMember(owner = "client!fca", name = "F", descriptor = "Lclient!tf;")
	public static Class322 aClass322_56;

	@OriginalMember(owner = "client!fca", name = "H", descriptor = "[Lclient!ir;")
	public static Class151[] aClass151Array1;

	@OriginalMember(owner = "client!fca", name = "B", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_68 = new Class56(53, -2);

	@OriginalMember(owner = "client!fca", name = "E", descriptor = "I")
	public static int anInt3026 = 104;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!r;IBIII)V")
	public static void method2712(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.da(arg4, arg3, arg1 + arg4, arg2 + arg3);
		arg0.method7425(arg2, arg4, arg3, -16777216, arg1);
		if (Static454.anInt7639 < 100) {
			return;
		}
		@Pc(45) float local45 = (float) Static44.anInt9269 / (float) Static44.anInt9261;
		@Pc(47) int local47 = arg1;
		@Pc(49) int local49 = arg2;
		if (local45 < 1.0F) {
			local49 = (int) (local45 * (float) arg1);
		} else {
			local47 = (int) ((float) arg2 / local45);
		}
		@Pc(75) int local75 = arg3 + (arg2 - local49) / 2;
		@Pc(84) int local84 = arg4 + (arg1 - local47) / 2;
		if (Static435.aClass14_20 == null || arg1 != Static435.aClass14_20.E() || Static435.aClass14_20.u() != arg2) {
			Static44.method7646(Static44.anInt9258, Static44.anInt9269 + Static44.anInt9263, Static44.anInt9258 + Static44.anInt9261, Static44.anInt9263, local84, local75, local84 + local47, local49 + local75);
			Static44.method7667(arg0);
			Static435.aClass14_20 = arg0.method7362(local84, local75, local47, local49, false);
		}
		Static435.aClass14_20.method7680(local84, local75);
		@Pc(136) int local136 = local47 * Static207.anInt3792 / Static44.anInt9261;
		@Pc(142) int local142 = local49 * Static446.anInt7473 / Static44.anInt9269;
		@Pc(150) int local150 = Static411.anInt7040 * local47 / Static44.anInt9261 + local84;
		@Pc(163) int local163 = local49 + local75 - Static274.anInt4810 * local49 / Static44.anInt9269 - local142;
		@Pc(165) int local165 = -1996554240;
		if (Static121.aClass274_1 == Static473.aClass274_4) {
			local165 = -1996488705;
		}
		arg0.J(local150, local163, local136, local142, local165, 1);
		arg0.method7402(local150, local163, local136, local142, local165, 0);
		if (Static555.anInt8826 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static369.anInt6362 <= 50) {
			local198 = Static369.anInt6362 * 5;
		} else {
			local198 = (100 - Static369.anInt6362) * 5;
		}
		for (@Pc(212) Class3_Sub51 local212 = (Class3_Sub51) Static44.aClass112_72.method3088(); local212 != null; local212 = (Class3_Sub51) Static44.aClass112_72.method3084()) {
			@Pc(220) Class174 local220 = Static44.aClass102_4.method2925(local212.anInt9426);
			if (Static244.method3783(local220)) {
				@Pc(248) int local248;
				@Pc(260) int local260;
				if (Static58.anInt1270 == local212.anInt9426) {
					local248 = local47 * local212.anInt9434 / Static44.anInt9261 + local84;
					local260 = local49 * (Static44.anInt9269 - local212.anInt9427) / Static44.anInt9269 + local75;
					arg0.method7425(4, local248 - 2, local260 - 2, local198 << 24 | 0xFFFF00, 4);
				} else if (Static65.anInt1511 != -1 && Static65.anInt1511 == local220.anInt4760) {
					local248 = local47 * local212.anInt9434 / Static44.anInt9261 + local84;
					local260 = local49 * (Static44.anInt9269 - local212.anInt9427) / Static44.anInt9269 + local75;
					arg0.method7425(4, local248 - 2, local260 + -2, local198 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!wl;ILclient!kca;Lclient!r;BILclient!fg;I)V")
	public static void method2714(@OriginalArg(0) Class3_Sub51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class174 arg2, @OriginalArg(3) Class45 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class96 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg0.anInt9424 - arg1 / 2 - 5;
		@Pc(19) int local19 = arg4 + 2;
		if (arg2.anInt4775 != 0) {
			arg3.method7425(arg6 * arg5.method2810() + arg4 + 1 - local19, local15, local19, arg2.anInt4775, arg1 + 10);
		}
		if (arg2.anInt4780 != 0) {
			arg3.method7379(arg2.anInt4780, arg1 + 10, -local19 + 1 + arg5.method2810() * arg6 + arg4, local19, local15);
		}
		@Pc(85) int local85 = arg2.anInt4768;
		if (arg0.aBoolean732 && arg2.anInt4778 != -1) {
			local85 = arg2.anInt4778;
		}
		for (@Pc(98) int local98 = 0; local98 < arg6; local98++) {
			@Pc(104) String local104 = Static295.aStringArray19[local98];
			if (arg6 - 1 > local98) {
				local104 = local104.substring(0, local104.length() - 4);
			}
			arg5.method2808(arg3, local104, arg0.anInt9424, arg4, local85);
			arg4 += arg5.method2810();
		}
	}
}
