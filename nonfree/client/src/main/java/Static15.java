import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "Lclient!ul;")
	public static Class172 aClass172_4 = new Class172(64);

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public static int anInt320 = 0;

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
	public static int anInt334 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIBIILclient!lg;I)V")
	public static void method272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg6 * arg6 + arg0 * arg0;
		if (local14 > arg1) {
			return;
		}
		@Pc(33) int local33 = Math.min(arg5.anInt3201 / 2, arg5.anInt3190 / 2);
		if (local33 * local33 >= local14) {
			Static162.method2606(arg4, arg5, arg3, arg0, Static111.aClass4_Sub2_Sub4Array7[arg2], arg6);
			return;
		}
		local33 -= 10;
		@Pc(47) int local47 = (int) Static126.aFloat73 + Static234.anInt4655 & 0x7FF;
		@Pc(51) int local51 = Class174.anIntArray444[local47];
		@Pc(59) int local59 = local51 * 256 / (Static161.anInt3301 + 256);
		@Pc(63) int local63 = Class174.anIntArray443[local47];
		@Pc(71) int local71 = local63 * 256 / (Static161.anInt3301 + 256);
		@Pc(82) int local82 = local59 * arg6 + arg0 * local71 >> 16;
		@Pc(93) int local93 = arg6 * local71 - arg0 * local59 >> 16;
		@Pc(99) double local99 = Math.atan2((double) local82, (double) local93);
		@Pc(106) int local106 = (int) ((double) local33 * Math.sin(local99));
		@Pc(113) int local113 = (int) (Math.cos(local99) * (double) local33);
		if (Static251.aBoolean330) {
			((Class4_Sub2_Sub4_Sub1) Static84.aClass4_Sub2_Sub4Array3[arg2]).method2484((local106 + arg4 + arg5.anInt3201 / 2) * 16, (arg5.anInt3190 / 2 + arg3 - local113) * 16, (int) (local99 * 10430.378D));
		} else {
			((Class4_Sub2_Sub4_Sub2) Static84.aClass4_Sub2_Sub4Array3[arg2]).method4156(arg4 + arg5.anInt3201 / 2 + local106 - 10, -local113 + -10 + arg5.anInt3190 / 2 + arg3, local99);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!pi;)Lclient!qh;")
	public static Class4_Sub2_Sub18 method276(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		@Pc(31) Class4_Sub2_Sub18 local31 = new Class4_Sub2_Sub18(arg0, arg1.method3111(), arg1.method3111(), arg1.method3084(), arg1.method3084(), arg1.method3110() == 1, arg1.method3110());
		@Pc(39) int local39 = arg1.method3110();
		for (@Pc(47) int local47 = 0; local47 < local39; local47++) {
			local31.aClass17_19.method619(new Class4_Sub27(arg1.method3110(), arg1.method3110(), arg1.method3085(), arg1.method3085(), arg1.method3085(), arg1.method3085(), arg1.method3085(), arg1.method3085(), arg1.method3085(), arg1.method3085()));
		}
		local31.method3544();
		return local31;
	}
}
