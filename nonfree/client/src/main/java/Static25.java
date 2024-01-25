import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!baa", name = "A", descriptor = "Lclient!gp;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!baa", name = "v", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(II)V")
	public static void method963(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub4_Sub6 local12 = Static68.method1408(8, arg0);
		local12.method3828();
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(II)V")
	public static void method966(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub4_Sub2 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class62 local8 = Static53.aClass62Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static54.anInt1441; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static396.anInt7505; local15++) {
						local1 = local8.c(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static494.anInt8859;
							@Pc(32) int local32 = local12 << Static494.anInt8859;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class62 local41 = Static53.aClass62Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.JA(local15, local12) - local41.JA(local15, local12);
									@Pc(67) int local67 = local8.JA(local15 + 1, local12) - local41.JA(local15 + 1, local12);
									@Pc(85) int local85 = local8.JA(local15 + 1, local12 + 1) - local41.JA(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.JA(local15, local12 + 1) - local41.JA(local15, local12 + 1);
									local41.aa(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!wba;FFBIFIIFIF)[B")
	public static byte[] method968(@OriginalArg(0) Class79 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(5) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static264.method5272(arg5, 0, arg4, arg0, local15, arg2, arg3, arg1);
		return local15;
	}
}
