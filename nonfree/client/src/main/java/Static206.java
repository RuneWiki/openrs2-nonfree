import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public static int anInt3718;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "[S")
	public static short[] aShortArray70;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I")
	public static int method3293(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(62) char local62;
			if (local17 == '\u0000') {
				local62 = arg0.charAt(local13++);
			} else {
				local62 = local17;
			}
			@Pc(78) char local78;
			if (local19 == '\u0000') {
				local78 = arg1.charAt(local15++);
			} else {
				local78 = local19;
			}
			local17 = Static71.method1450(local62);
			local19 = Static71.method1450(local78);
			local62 = Static333.method5306(local62, arg2);
			local78 = Static333.method5306(local78, arg2);
			if (local78 != local62 && Character.toUpperCase(local62) != Character.toUpperCase(local78)) {
				local62 = Character.toLowerCase(local62);
				local78 = Character.toLowerCase(local78);
				if (local62 != local78) {
					return Static21.method553(local62, arg2) - Static21.method553(local78, arg2);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local8, local11);
		for (@Pc(148) int local148 = 0; local148 < local141; local148++) {
			if (arg2 == 2) {
				local13 = local8 - local148 - 1;
				local15 = local11 - local148 - 1;
			} else {
				local15 = local148;
				local13 = local148;
			}
			@Pc(177) char local177 = arg0.charAt(local13);
			@Pc(181) char local181 = arg1.charAt(local15);
			if (local177 != local181 && Character.toUpperCase(local177) != Character.toUpperCase(local181)) {
				local177 = Character.toLowerCase(local177);
				local181 = Character.toLowerCase(local181);
				if (local181 != local177) {
					return Static21.method553(local177, arg2) - Static21.method553(local181, arg2);
				}
			}
		}
		@Pc(230) int local230 = local8 - local11;
		if (local230 != 0) {
			return local230;
		}
		for (@Pc(239) int local239 = 0; local239 < local141; local239++) {
			@Pc(245) char local245 = arg0.charAt(local239);
			@Pc(249) char local249 = arg1.charAt(local239);
			if (local249 != local245) {
				return Static21.method553(local245, arg2) - Static21.method553(local249, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
	public static void method3296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(30) int local30 = Static84.method1650(Static7.anInt8119, arg3 + arg1, Static34.anInt603);
		@Pc(38) int local38 = Static84.method1650(Static7.anInt8119, arg1 - arg3, Static34.anInt603);
		Static403.method6377(arg2, Static130.anIntArrayArray89[arg0], local30, local38);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(90) int local90;
			@Pc(99) int local99;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local67 = arg0 - local9;
				local71 = local9 + arg0;
				if (local71 >= Static328.anInt6154 && Static394.anInt7462 >= local67) {
					local90 = Static84.method1650(Static7.anInt8119, arg1 + local7, Static34.anInt603);
					local99 = Static84.method1650(Static7.anInt8119, arg1 - local7, Static34.anInt603);
					if (Static394.anInt7462 >= local71) {
						Static403.method6377(arg2, Static130.anIntArrayArray89[local71], local90, local99);
					}
					if (local67 >= Static328.anInt6154) {
						Static403.method6377(arg2, Static130.anIntArrayArray89[local67], local90, local99);
					}
				}
			}
			local7++;
			local67 = arg0 - local7;
			local71 = local7 + arg0;
			if (Static328.anInt6154 <= local71 && local67 <= Static394.anInt7462) {
				local90 = Static84.method1650(Static7.anInt8119, arg1 + local9, Static34.anInt603);
				local99 = Static84.method1650(Static7.anInt8119, arg1 - local9, Static34.anInt603);
				if (local71 <= Static394.anInt7462) {
					Static403.method6377(arg2, Static130.anIntArrayArray89[local71], local90, local99);
				}
				if (Static328.anInt6154 <= local67) {
					Static403.method6377(arg2, Static130.anIntArrayArray89[local67], local90, local99);
				}
			}
		}
	}
}
