import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public static int anInt1160;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Z")
	public static boolean aBoolean65 = true;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "S")
	public static short aShort6 = 205;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIZZI)V")
	public static void method1063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= arg5) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg5) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) Class65_Sub1 local24 = Static117.aClass65_Sub1Array1[local18];
		Static117.aClass65_Sub1Array1[local18] = Static117.aClass65_Sub1Array1[arg5];
		Static117.aClass65_Sub1Array1[arg5] = local24;
		for (@Pc(36) int local36 = arg0; local36 < arg5; local36++) {
			if (Static380.method5242(arg4, local24, Static117.aClass65_Sub1Array1[local36], arg2, arg1, arg3) <= 0) {
				@Pc(56) Class65_Sub1 local56 = Static117.aClass65_Sub1Array1[local36];
				Static117.aClass65_Sub1Array1[local36] = Static117.aClass65_Sub1Array1[local20];
				Static117.aClass65_Sub1Array1[local20++] = local56;
			}
		}
		Static117.aClass65_Sub1Array1[arg5] = Static117.aClass65_Sub1Array1[local20];
		Static117.aClass65_Sub1Array1[local20] = local24;
		method1063(arg0, arg1, arg2, arg3, arg4, local20 - 1);
		method1063(local20 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method1064() {
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			Static333.aBooleanArray21[local14] = false;
		}
		Static212.anInt3638 = Static277.anInt5022;
		Static430.anInt7302 = Static260.anInt4601;
		Static459.anInt7730 = Static263.anInt4619;
		Static419.anInt7190 = 0;
		Static361.anInt6401 = Static144.anInt2665;
		Static385.anInt6689 = 0;
		Static273.anInt4956 = -1;
		Static220.anInt3722 = -1;
		Static409.anInt695 = Static213.anInt3662;
		Static25.anInt7273 = 5;
		Static456.anInt7596 = Static120.anInt2052;
	}
}
