import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "[I")
	public static int[] anIntArray484 = new int[2];

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	public static void method6861(@OriginalArg(1) int arg0) {
		Static109.anInt2368 = -1;
		Static238.anInt4463 = 3;
		Static165.anInt3234 = 100;
		Static619.anInt10018 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method6862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static278.method4514(arg8, arg6, arg5)) {
			return false;
		}
		@Pc(15) int local15 = Static342.anIntArray396[0];
		@Pc(19) int local19 = Static342.anIntArray396[2];
		@Pc(23) int local23 = Static342.anIntArray396[1];
		if (!Static278.method4514(arg2, arg4, arg7)) {
			return false;
		}
		@Pc(35) int local35 = Static342.anIntArray396[1];
		@Pc(39) int local39 = Static342.anIntArray396[2];
		@Pc(43) int local43 = Static342.anIntArray396[0];
		if (Static278.method4514(arg0, arg3, arg1)) {
			@Pc(55) int local55 = Static342.anIntArray396[0];
			@Pc(59) int local59 = Static342.anIntArray396[2];
			@Pc(68) int local68 = Static342.anIntArray396[1];
			return Static406.method6474(local68, local55, local43, local23, local35, local19, local39, local59, local15);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;BIZ)V")
	public static void method6863(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static311.aClass196_77.anInt5854 = 1;
		@Pc(11) String local11 = arg3.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg4 != -1) {
			@Pc(27) Class300 local27 = Static449.aClass55_2.method1843(arg4);
			if (local27 == null || arg5 != local27.method7433()) {
				return;
			}
			if (local27.method7433()) {
				local18 = local27.aString98;
			} else {
				local16 = local27.anInt8686;
			}
		}
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < Static320.aClass53_2.anInt1780; local55++) {
			@Pc(62) Class38 local62 = Static320.aClass53_2.method1770(local55);
			if ((!arg0 || local62.aBoolean95) && local62.anInt1487 == -1 && local62.anInt1457 == -1 && local62.anInt1475 == 0 && local62.aString6.toLowerCase().indexOf(local11) != -1) {
				if (arg4 != -1) {
					if (arg5) {
						if (!arg2.equals(local62.method1491(local18, arg4))) {
							continue;
						}
					} else if (arg1 != local62.method1485(local16, arg4)) {
						continue;
					}
				}
				if (local53 >= 250) {
					Static629.aShortArray146 = null;
					Static285.anInt5065 = -1;
					return;
				}
				if (local53 >= local14.length) {
					@Pc(134) short[] local134 = new short[local14.length * 2];
					for (@Pc(136) int local136 = 0; local136 < local53; local136++) {
						local134[local136] = local14[local136];
					}
					local14 = local134;
				}
				local14[local53++] = (short) local55;
			}
		}
		Static285.anInt5065 = local53;
		Static629.aShortArray146 = local14;
		Static470.anInt8251 = 0;
		@Pc(178) String[] local178 = new String[Static285.anInt5065];
		for (@Pc(180) int local180 = 0; local180 < Static285.anInt5065; local180++) {
			local178[local180] = Static320.aClass53_2.method1770(local14[local180]).aString6;
		}
		Static538.method7889(Static629.aShortArray146, local178);
		Static311.aClass196_77.method5091();
		Static311.aClass196_77.anInt5854 = 2;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZII)V")
	public static void method6865(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static585.method8269(Static59.aClass43_12.method1598(Static325.anInt6083), arg0, arg1);
	}
}
