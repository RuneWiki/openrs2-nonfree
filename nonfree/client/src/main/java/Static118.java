import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	public static int anInt2022;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public static int anInt2023 = -1;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
	public static int anInt2025 = -1;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([Lclient!vg;BI)V")
	public static void method1611(@OriginalArg(0) Class250[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class250 local18 = arg0[local12];
			if (local18 != null && arg1 == local18.anInt7002 && !Static52.method809(local18)) {
				if (local18.anInt7009 == 0) {
					method1611(arg0, local18.anInt6994);
					if (local18.aClass250Array2 != null) {
						method1611(local18.aClass250Array2, local18.anInt6994);
					}
					@Pc(59) Class1_Sub26 local59 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local18.anInt6994);
					if (local59 != null) {
						Static56.method860(local59.anInt3847);
					}
				}
				if (local18.anInt7009 == 6 && local18.anInt6960 != -1) {
					@Pc(79) Class171 local79 = Static152.aClass213_1.method4410(local18.anInt6960);
					if (local79 != null) {
						local18.anInt6988 += Static239.anInt3853;
						while (local18.anInt6988 > local79.anIntArray234[local18.anInt7023]) {
							local18.anInt6988 -= local79.anIntArray234[local18.anInt7023];
							local18.anInt7023++;
							if (local79.anIntArray235.length <= local18.anInt7023) {
								local18.anInt7023 -= local79.anInt4251;
								if (local18.anInt7023 < 0 || local79.anIntArray235.length <= local18.anInt7023) {
									local18.anInt7023 = 0;
								}
							}
							local18.anInt6980 = local18.anInt7023 + 1;
							if (local18.anInt6980 >= local79.anIntArray235.length) {
								local18.anInt6980 -= local79.anInt4251;
								if (local18.anInt6980 < 0 || local18.anInt6980 >= local79.anIntArray235.length) {
									local18.anInt6980 = -1;
								}
							}
							Static94.method1357(local18);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIBI)V")
	public static void method1612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg4) {
			Static136.method1828(arg0, arg4, arg3, arg2);
		} else if (Static271.anInt4271 <= arg3 - arg4 && Static13.anInt263 >= arg4 + arg3 && Static74.anInt1413 <= arg2 - arg1 && Static149.anInt7384 >= arg2 + arg1) {
			Static143.method1884(arg2, arg3, arg0, arg1, arg4);
		} else {
			Static79.method1219(arg2, arg4, arg1, arg0, arg3);
		}
	}
}
