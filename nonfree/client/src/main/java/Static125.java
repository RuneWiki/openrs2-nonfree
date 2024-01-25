import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "Lclient!ps;")
	public static Interface8 anInterface8_3;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_12 = new Class44(200);

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	public static int anInt2592 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method2161() {
		if (Static46.aBoolean96) {
			Static144.aClass87_8 = null;
			Static297.aClass87_20 = null;
			Static46.aBoolean96 = false;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!bn;Lclient!bn;IBIIII)V")
	public static void method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub2_Sub1 arg2, @OriginalArg(3) Class3_Sub2_Sub1 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg2.method5520();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class87 local20 = (Class87) Static276.aClass44_38.method1353((long) local7);
		if (local20 == null) {
			@Pc(27) Class194[] local27 = Static458.method4492(Static350.aClass100_69, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static126.aClass66_5.method5038(local27[0]);
			Static276.aClass44_38.method1349(local20, (long) local7);
		}
		Static253.method4330(arg0 >> 1, arg3.aByte103, arg3.anInt7207, arg3.anInt7202, arg3.method5521() * 64, arg5 >> 1, 0);
		@Pc(81) int local81 = Static247.anIntArray317[0] + arg4 - 18;
		@Pc(89) int local89 = local81 + arg1 / 4 * 18;
		@Pc(97) int local97 = arg6 + Static247.anIntArray317[1] - 70;
		@Pc(105) int local105 = local97 + arg1 % 4 * 18;
		local20.method6567(local89, local105);
		if (arg2 == arg3) {
			Static126.aClass66_5.method5040(-256, 18, local105 - 1, local89 + -1, 18);
		}
		@Pc(127) Class57_Sub3 local127 = Static225.method3366();
		local127.aClass3_Sub2_Sub1_1 = arg2;
		local127.anInt3650 = local105;
		local127.anInt3649 = local89;
		local127.anInt3645 = local105 + 16;
		local127.anInt3648 = local89 + 16;
		Static328.aClass111_6.method2696(local127);
	}
}
