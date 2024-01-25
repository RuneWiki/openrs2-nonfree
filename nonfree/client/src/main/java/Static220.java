import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public static int anInt4245 = 0;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	public static int anInt4246 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V")
	public static void method3898(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub11_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class73 local8 = Static265.aClass73Array44[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static160.anInt3244; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static223.anInt4280; local15++) {
						local1 = local8.method4936(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class73 local41 = Static265.aClass73Array44[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method4931(local15, local12) - local41.method4931(local15, local12);
									@Pc(67) int local67 = local8.method4931(local15 + 1, local12) - local41.method4931(local15 + 1, local12);
									@Pc(85) int local85 = local8.method4931(local15 + 1, local12 + 1) - local41.method4931(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method4931(local15, local12 + 1) - local41.method4931(local15, local12 + 1);
									local41.method4937(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBIIIII)V")
	public static void method3899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static124.anInt4221 <= arg2 - arg0 && Static96.anInt2180 >= arg2 + arg0 && arg5 - arg0 >= Static228.anInt920 && arg0 + arg5 <= Static307.anInt6214) {
			Static42.method995(arg3, arg5, arg1, arg4, arg2, arg0);
		} else {
			Static292.method5186(arg1, arg3, arg0, arg2, arg4, arg5);
		}
	}
}
