import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Lclient!or;")
	public static Class260 aClass260_13 = null;

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "[I")
	public static final int[] anIntArray587 = new int[14];

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "[I")
	public static final int[] anIntArray588 = new int[2048];

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static120.method2296(arg6, Static374.anInt5986, Static84.anInt1667);
		@Pc(19) int local19 = Static120.method2296(arg2, Static374.anInt5986, Static84.anInt1667);
		@Pc(25) int local25 = Static120.method2296(arg0, Static7.anInt93, Static115.anInt2377);
		@Pc(31) int local31 = Static120.method2296(arg4, Static7.anInt93, Static115.anInt2377);
		@Pc(39) int local39 = Static120.method2296(arg6 + arg3, Static374.anInt5986, Static84.anInt1667);
		@Pc(48) int local48 = Static120.method2296(arg2 - arg3, Static374.anInt5986, Static84.anInt1667);
		for (@Pc(50) int local50 = local11; local50 < local39; local50++) {
			Static483.method7014(Static392.anIntArrayArray39[local50], local25, local31, arg1);
		}
		for (@Pc(70) int local70 = local19; local70 > local48; local70--) {
			Static483.method7014(Static392.anIntArrayArray39[local70], local25, local31, arg1);
		}
		@Pc(92) int local92 = Static120.method2296(arg0 + arg3, Static7.anInt93, Static115.anInt2377);
		@Pc(101) int local101 = Static120.method2296(arg4 - arg3, Static7.anInt93, Static115.anInt2377);
		for (@Pc(103) int local103 = local39; local103 <= local48; local103++) {
			@Pc(109) int[] local109 = Static392.anIntArrayArray39[local103];
			Static483.method7014(local109, local25, local92, arg1);
			Static483.method7014(local109, local92, local101, arg5);
			Static483.method7014(local109, local101, local31, arg1);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "([[BLclient!dga;I)V")
	public static void method5924(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class73_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(38) int local38;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) byte[] local25 = arg0[local17];
			if (local25 != null) {
				@Pc(32) Class3_Sub25 local32 = new Class3_Sub25(local25);
				local38 = Static77.anIntArray125[local17] >> 8;
				@Pc(44) int local44 = Static77.anIntArray125[local17] & 0xFF;
				@Pc(51) int local51 = local38 * 64 - Static287.anInt4910;
				@Pc(57) int local57 = local44 * 64 - Static72.anInt1361;
				Static72.method1380();
				arg1.method1801(local32, Static1.aClass252Array5, local51, Static287.anInt4910, Static72.anInt1361, local57);
				arg1.method1810(local57, local32, Static674.aClass13_22, local51, local12);
				if (!arg1.aBoolean147 && local38 == Static601.anInt9665 / 8 && local44 == Static288.anInt4926 / 8 && local12[0] != -1) {
					Static536.aClass206_5 = Static559.aClass340_1.method8283(local12[2], Static38.aClass75_1, local12[3], local12[1], local12[0]);
					Static390.anInt10741 = local12[4];
				}
			}
		}
		for (@Pc(125) int local125 = 0; local125 < local15; local125++) {
			@Pc(137) int local137 = (Static77.anIntArray125[local125] >> 8) * 64 - Static287.anInt4910;
			local38 = (Static77.anIntArray125[local125] & 0xFF) * 64 - Static72.anInt1361;
			@Pc(152) byte[] local152 = arg0[local125];
			if (local152 == null && Static288.anInt4926 < 800) {
				Static72.method1380();
				arg1.method1795(local137, local38);
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BLclient!jp;)Lclient!gn;")
	public static Class106_Sub1 method5925(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(7) Class106 local7 = Static342.method5131(arg0);
		@Pc(11) int local11 = arg0.method8593();
		@Pc(20) int local20 = arg0.method8593();
		@Pc(24) int local24 = arg0.method8593();
		@Pc(28) int local28 = arg0.method8593();
		@Pc(32) int local32 = arg0.method8593();
		@Pc(36) int local36 = arg0.method8593();
		return new Class106_Sub1(local7.aClass356_8, local7.aClass56_11, local7.anInt5838, local7.anInt5836, local7.anInt5840, local7.anInt5834, local7.anInt5837, local7.anInt5841, local7.anInt5839, local11, local20, local24, local28, local32, local36);
	}
}
