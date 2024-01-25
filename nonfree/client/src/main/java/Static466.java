import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "Lclient!fda;")
	public static Class103 aClass103_3;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Lclient!jda;")
	public static final Class162 aClass162_10 = new Class162("", 11);

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_119 = new Class90(79, 8);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	public static void method6799() {
		@Pc(20) byte[] local20;
		if (Static590.anObject157 == null) {
			@Pc(13) Class139_Sub2_Sub1 local13 = new Class139_Sub2_Sub1();
			local20 = local13.method4882();
			Static590.anObject157 = Static111.method2038(local20);
		}
		if (Static37.anObject12 == null) {
			@Pc(31) Class139_Sub1_Sub1 local31 = new Class139_Sub1_Sub1();
			local20 = local31.method3132();
			Static37.anObject12 = Static111.method2038(local20);
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)Lclient!rba;")
	public static Class286 method6801(@OriginalArg(0) int arg0) {
		@Pc(10) Class286 local10 = (Class286) Static505.aClass167_56.method3966((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static252.aClass348_54.method7964(arg0, 1);
		local10 = new Class286();
		local10.anInt8553 = arg0;
		if (local20 != null) {
			local10.method6620(new Class4_Sub13(local20));
		}
		local10.method6621();
		if (local10.anInt8561 == 2 && Static589.aClass221_41.method5075((long) arg0) == null) {
			Static589.aClass221_41.method5073(new Class4_Sub27(Static302.anInt6092), (long) arg0);
			Static424.aClass286Array1[Static302.anInt6092++] = local10;
		}
		Static505.aClass167_56.method3974((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg3;
		@Pc(21) int local21 = arg5 - arg3;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(58) int local58 = local33 << 1;
		@Pc(62) int local62 = arg5 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(76) int local76 = local25 * (1 - local62) + local41;
		@Pc(84) int local84 = local29 - local45 * (local62 - 1);
		@Pc(93) int local93 = local33 * (1 - local66) + local49;
		@Pc(102) int local102 = local37 - (local66 - 1) * local58;
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = (local62 - 3) * local45;
		@Pc(132) int local132 = local49 * 3;
		@Pc(138) int local138 = (local66 - 3) * local58;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = (arg5 - 1) * local106;
		@Pc(148) int local148 = local118;
		@Pc(175) int local175;
		@Pc(183) int local183;
		@Pc(192) int local192;
		@Pc(200) int local200;
		if (arg4 >= Static289.anInt5872 && Static160.anInt3347 >= arg4) {
			@Pc(166) int[] local166 = Static442.anIntArrayArray48[arg4];
			local175 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg6 - arg2);
			local183 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg2 + arg6);
			local192 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg6 - local16);
			local200 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg6 + local16);
			Static238.method3886(local166, local192, arg0, local175);
			Static238.method3886(local166, local200, arg1, local192);
			Static238.method3886(local166, local183, arg0, local200);
		}
		@Pc(224) int local224 = (local21 - 1) * local114;
		while (local9 > 0) {
			@Pc(237) boolean local237 = local9 <= local21;
			if (local76 < 0) {
				while (local76 < 0) {
					local76 += local122;
					local84 += local140;
					local122 += local110;
					local140 += local110;
					local7++;
				}
			}
			if (local237) {
				if (local93 < 0) {
					while (local93 < 0) {
						local102 += local148;
						local93 += local132;
						local11++;
						local132 += local118;
						local148 += local118;
					}
				}
				if (local102 < 0) {
					local93 += local132;
					local102 += local148;
					local11++;
					local148 += local118;
					local132 += local118;
				}
				local102 += -local138;
				local93 += -local224;
				local224 -= local114;
				local138 -= local114;
			}
			if (local84 < 0) {
				local84 += local140;
				local76 += local122;
				local140 += local110;
				local122 += local110;
				local7++;
			}
			local84 += -local128;
			local76 += -local146;
			local146 -= local106;
			local128 -= local106;
			local9--;
			local175 = arg4 - local9;
			local183 = arg4 + local9;
			if (Static289.anInt5872 <= local183 && local175 <= Static160.anInt3347) {
				local192 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg6 + local7);
				local200 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg6 - local7);
				if (local237) {
					@Pc(422) int local422 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local11 + arg6);
					@Pc(431) int local431 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg6 - local11);
					@Pc(438) int[] local438;
					if (local175 >= Static289.anInt5872) {
						local438 = Static442.anIntArrayArray48[local175];
						Static238.method3886(local438, local431, arg0, local200);
						Static238.method3886(local438, local422, arg1, local431);
						Static238.method3886(local438, local192, arg0, local422);
					}
					if (local183 <= Static160.anInt3347) {
						local438 = Static442.anIntArrayArray48[local183];
						Static238.method3886(local438, local431, arg0, local200);
						Static238.method3886(local438, local422, arg1, local431);
						Static238.method3886(local438, local192, arg0, local422);
					}
				} else {
					if (local175 >= Static289.anInt5872) {
						Static238.method3886(Static442.anIntArrayArray48[local175], local192, arg0, local200);
					}
					if (local183 <= Static160.anInt3347) {
						Static238.method3886(Static442.anIntArrayArray48[local183], local192, arg0, local200);
					}
				}
			}
		}
	}
}
