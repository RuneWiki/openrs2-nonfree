import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(BIII)I")
	public static int method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg1 & 0x3;
		if (local13 == 0) {
			return arg0;
		} else if (local13 == 1) {
			return 4095 - arg2;
		} else if (local13 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "([BB)V")
	public static void method5415(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class5_Sub23 local15 = new Class5_Sub23(arg0);
		@Pc(17) boolean local17 = false;
		while (true) {
			while (true) {
				@Pc(21) int local21 = local15.method8529();
				if (local21 == 0) {
					if (local17) {
						return;
					}
					if (Static185.anIntArray168 == null) {
						Static185.anIntArray168 = new int[4];
						Static316.anIntArray310 = new int[4];
						Static348.anInt6129 = 4;
					}
					for (local21 = 0; local21 < Static185.anIntArray168.length; local21++) {
						Static185.anIntArray168[local21] = 0;
						Static316.anIntArray310[local21] = local21 * 20;
					}
					return;
				}
				if (local21 == 1) {
					if (Static185.anIntArray168 == null) {
						Static348.anInt6129 = 4;
						Static185.anIntArray168 = new int[4];
						Static316.anIntArray310 = new int[4];
					}
					local17 = true;
					for (@Pc(83) int local83 = 0; local83 < Static185.anIntArray168.length; local83++) {
						Static185.anIntArray168[local83] = local15.method8516();
						Static316.anIntArray310[local83] = local15.method8516();
					}
				} else if (local21 == 2) {
					Static456.anInt7803 = local15.method8519();
				} else if (local21 == 3) {
					Static348.anInt6129 = local15.method8529();
					Static316.anIntArray310 = new int[Static348.anInt6129];
					Static185.anIntArray168 = new int[Static348.anInt6129];
				}
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIII)V")
	public static void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg1);
		@Pc(25) int local25 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg0);
		@Pc(31) int local31 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg4);
		@Pc(37) int local37 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg3);
		@Pc(46) int local46 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg1 + arg5);
		@Pc(55) int local55 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg0 - arg5);
		for (@Pc(57) int local57 = local19; local57 < local46; local57++) {
			Static646.method7025(Static569.anIntArrayArray54[local57], local31, local37, arg2);
		}
		for (@Pc(75) int local75 = local25; local75 > local55; local75--) {
			Static646.method7025(Static569.anIntArrayArray54[local75], local31, local37, arg2);
		}
		@Pc(106) int local106 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg4 + arg5);
		@Pc(115) int local115 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg3 - arg5);
		for (@Pc(117) int local117 = local46; local117 <= local55; local117++) {
			@Pc(125) int[] local125 = Static569.anIntArrayArray54[local117];
			Static646.method7025(local125, local31, local106, arg2);
			Static646.method7025(local125, local115, local37, arg2);
		}
	}
}
