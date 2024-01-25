import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "[I")
	public static int[] anIntArray279;

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "Lclient!fh;")
	public static final Class4_Sub9 aClass4_Sub9_6 = new Class4_Sub9(new byte[5000]);

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "Z")
	public static boolean aBoolean284 = false;

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "Z")
	public static boolean aBoolean285 = false;

	@OriginalMember(owner = "client!lj", name = "K", descriptor = "Z")
	public static boolean aBoolean286 = true;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BC)Z")
	public static boolean method3046(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIII)V")
	public static void method3047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = arg1 + 1;
		Static249.method6044(Static267.anIntArrayArray50[arg1], arg4, arg3, arg0);
		@Pc(19) int local19 = arg2 - 1;
		Static249.method6044(Static267.anIntArrayArray50[arg2], arg4, arg3, arg0);
		for (@Pc(27) int local27 = local8; local27 <= local19; local27++) {
			@Pc(38) int[] local38 = Static267.anIntArrayArray50[local27];
			local38[arg0] = local38[arg3] = arg4;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([Lclient!l;I)V")
	public static void method3048(@OriginalArg(0) Class95[] arg0) {
		Static37.anInt612 = arg0.length;
		Static243.aClass95Array8 = new Class95[Static37.anInt612 + 10];
		Static226.anIntArray283 = new int[Static37.anInt612 + 10];
		Static461.method1981(arg0, 0, Static243.aClass95Array8, 0, Static37.anInt612);
		for (@Pc(26) int local26 = 0; local26 < Static37.anInt612; local26++) {
			Static226.anIntArray283[local26] = Static243.aClass95Array8[local26].T();
		}
		for (@Pc(41) int local41 = Static37.anInt612; local41 < Static243.aClass95Array8.length; local41++) {
			Static226.anIntArray283[local41] = 12;
		}
	}
}
