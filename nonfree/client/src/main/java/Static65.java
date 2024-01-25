import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array3;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "[[[Lclient!wr;")
	public static Class270[][][] aClass270ArrayArrayArray1;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!l;")
	public static Interface9 anInterface9_6;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V")
	private static void method964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg1 - arg5;
		@Pc(19) int local19 = arg5 + arg4;
		for (@Pc(21) int local21 = arg4; local21 < local19; local21++) {
			Static216.method2862(arg3, arg0, arg2, Static229.anIntArrayArray26[local21]);
		}
		@Pc(39) int local39 = arg5 + arg3;
		for (@Pc(41) int local41 = arg1; local41 > local15; local41--) {
			Static216.method2862(arg3, arg0, arg2, Static229.anIntArrayArray26[local41]);
		}
		@Pc(60) int local60 = arg0 - arg5;
		for (@Pc(62) int local62 = local19; local62 <= local15; local62++) {
			@Pc(68) int[] local68 = Static229.anIntArrayArray26[local62];
			Static216.method2862(arg3, local39, arg2, local68);
			Static216.method2862(local60, arg0, arg2, local68);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIIIII)V")
	public static void method965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static317.anInt6670 && Static215.anInt3546 >= arg0 && arg4 >= Static219.anInt6125 && arg2 <= Static155.anInt2670) {
			if (arg5 == 1) {
				Static6.method111(arg4, arg1, arg0, arg3, arg2);
			} else {
				method964(arg0, arg2, arg1, arg3, arg4, arg5);
			}
		} else if (arg5 == 1) {
			Static330.method4428(arg1, arg2, arg4, arg0, arg3);
		} else {
			Static106.method1644(arg4, arg3, arg0, arg2, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!at;I)I")
	public static int method967(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		if (!Static55.method815(arg0).method1536(arg1) && arg0.anObjectArray29 == null) {
			return -1;
		} else if (arg0.anIntArray23 == null || arg0.anIntArray23.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray23[arg1];
		}
	}
}
