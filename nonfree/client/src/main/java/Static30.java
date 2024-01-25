import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
	public static int anInt1124;

	@OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
	public static final int anInt1126 = 1339;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILclient!kfa;BI)Lclient!bb;")
	public static Class3_Sub2_Sub1 method969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7_Sub2 arg2) {
		if (arg2.aBoolean377 || Static32.method1002(arg0) && Static32.method1002(arg1)) {
			return new Class3_Sub2_Sub1(arg2, 3553, 6408, arg0, arg1);
		} else if (arg2.aBoolean381) {
			return new Class3_Sub2_Sub1(arg2, 34037, 6408, arg0, arg1);
		} else {
			return new Class3_Sub2_Sub1(arg2, 6408, arg0, arg1, Static488.method7100(arg0), Static488.method7100(arg1));
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIIZII)V")
	public static void method974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static249.method2744(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg0;
		@Pc(23) int local23 = -arg0;
		@Pc(25) int local25 = local14;
		@Pc(33) int local33 = -local14;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (Static289.anInt5872 <= arg4 && Static160.anInt3347 >= arg4) {
			@Pc(51) int[] local51 = Static442.anIntArrayArray48[arg4];
			local59 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg1 - arg0);
			local67 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg1 + arg0);
			local76 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg1 - local14);
			local84 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local14 + arg1);
			Static238.method3886(local51, local76, arg3, local59);
			Static238.method3886(local51, local84, arg5, local76);
			Static238.method3886(local51, local67, arg3, local84);
		}
		while (local10 < local20) {
			local37 += 2;
			local35 += 2;
			local23 += local35;
			local33 += local37;
			if (local33 >= 0 && local25 >= 1) {
				local25--;
				Static225.anIntArray226[local25] = local10;
				local33 -= local25 << 1;
			}
			local10++;
			@Pc(245) int local245;
			@Pc(254) int local254;
			@Pc(261) int[] local261;
			@Pc(149) int local149;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				local149 = arg4 - local20;
				local59 = local20 + arg4;
				if (local59 >= Static289.anInt5872 && Static160.anInt3347 >= local149) {
					if (local14 <= local20) {
						local67 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local10 + arg1);
						local76 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg1 - local10);
						if (Static160.anInt3347 >= local59) {
							Static238.method3886(Static442.anIntArrayArray48[local59], local67, arg3, local76);
						}
						if (local149 >= Static289.anInt5872) {
							Static238.method3886(Static442.anIntArrayArray48[local149], local67, arg3, local76);
						}
					} else {
						local67 = Static225.anIntArray226[local20];
						local76 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg1 + local10);
						local84 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg1 - local10);
						local245 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local67 + arg1);
						local254 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg1 - local67);
						if (local59 <= Static160.anInt3347) {
							local261 = Static442.anIntArrayArray48[local59];
							Static238.method3886(local261, local254, arg3, local84);
							Static238.method3886(local261, local245, arg5, local254);
							Static238.method3886(local261, local76, arg3, local245);
						}
						if (Static289.anInt5872 <= local149) {
							local261 = Static442.anIntArrayArray48[local149];
							Static238.method3886(local261, local254, arg3, local84);
							Static238.method3886(local261, local245, arg5, local254);
							Static238.method3886(local261, local76, arg3, local245);
						}
					}
				}
			}
			local149 = arg4 - local10;
			local59 = local10 + arg4;
			if (local59 >= Static289.anInt5872 && local149 <= Static160.anInt3347) {
				local67 = arg1 + local20;
				local76 = arg1 - local20;
				if (local67 >= Static292.anInt5983 && Static61.anInt1627 >= local76) {
					local67 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local67);
					local76 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local76);
					if (local10 >= local14) {
						if (Static160.anInt3347 >= local59) {
							Static238.method3886(Static442.anIntArrayArray48[local59], local67, arg3, local76);
						}
						if (Static289.anInt5872 <= local149) {
							Static238.method3886(Static442.anIntArrayArray48[local149], local67, arg3, local76);
						}
					} else {
						local84 = local25 < local10 ? Static225.anIntArray226[local10] : local25;
						local245 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local84 + arg1);
						local254 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg1 - local84);
						if (Static160.anInt3347 >= local59) {
							local261 = Static442.anIntArrayArray48[local59];
							Static238.method3886(local261, local254, arg3, local76);
							Static238.method3886(local261, local245, arg5, local254);
							Static238.method3886(local261, local67, arg3, local245);
						}
						if (local149 >= Static289.anInt5872) {
							local261 = Static442.anIntArrayArray48[local149];
							Static238.method3886(local261, local254, arg3, local76);
							Static238.method3886(local261, local245, arg5, local254);
							Static238.method3886(local261, local67, arg3, local245);
						}
					}
				}
			}
		}
	}
}
