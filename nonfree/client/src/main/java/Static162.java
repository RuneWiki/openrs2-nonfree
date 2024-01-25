import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "D")
	public static double aDouble5;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B[Lclient!dm;I)V")
	public static void method3035(@OriginalArg(1) Class78[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
			@Pc(11) Class78 local11 = arg0[local6];
			if (local11 != null && arg1 == local11.anInt1967 && !Static69.method1336(local11)) {
				if (local11.anInt1955 == 0) {
					method3035(arg0, local11.anInt1968);
					if (local11.aClass78Array9 != null) {
						method3035(local11.aClass78Array9, local11.anInt1968);
					}
					@Pc(48) Class2_Sub37 local48 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local11.anInt1968);
					if (local48 != null) {
						Static233.method3886(local48.anInt6848);
					}
				}
				if (local11.anInt1955 == 6 && local11.anInt2003 != -1) {
					@Pc(68) Class149 local68 = Static185.aClass303_1.method7201(local11.anInt2003);
					if (local68 != null) {
						local11.anInt1946 += Static362.anInt6541;
						@Pc(79) int local79 = local11.anInt1925;
						while (local11.anInt1946 > local68.anIntArray306[local11.anInt1925]) {
							local11.anInt1946 -= local68.anIntArray306[local11.anInt1925];
							local11.anInt1925++;
							if (local11.anInt1925 >= local68.anIntArray308.length) {
								local11.anInt1925 -= local68.anInt4505;
								if (local11.anInt1925 < 0 || local68.anIntArray308.length <= local11.anInt1925) {
									local11.anInt1925 = 0;
								}
							}
							local11.anInt1973 = local11.anInt1925 + 1;
							if (local11.anInt1973 >= local68.anIntArray308.length) {
								local11.anInt1973 -= local68.anInt4505;
								if (local11.anInt1973 < 0 || local11.anInt1973 >= local68.anIntArray308.length) {
									local11.anInt1973 = -1;
								}
							}
							Static397.method6022(local11);
						}
						if (local11.anInt1925 != local79) {
							Static455.method6662(local68, local11.anInt1925);
						}
					}
				}
			}
		}
	}
}
