import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
	public static int anInt3247;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
	public static int anInt3248 = 2;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
	public static void method2526() {
		Static275.aClass155_44.method4364(5);
		Static290.aClass155_47.method4364(5);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I")
	public static int method2527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(26) int local26 = local13 << 1;
		@Pc(30) int local30 = arg4 << 1;
		@Pc(39) int local39 = local17 - local26 * (local30 - 1);
		@Pc(43) int local43 = local17 << 1;
		@Pc(52) int local52 = local43 + local13 * (1 - local30);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local43 * 3;
		@Pc(76) int local76 = ((arg4 << 1) - 3) * local26;
		@Pc(82) int local82 = local60;
		@Pc(97) int local97;
		@Pc(106) int local106;
		if (arg1 >= Static152.anInt3532 && arg1 <= Static223.anInt1245) {
			local97 = Static223.method941(arg2 + arg0, Static88.anInt2052, Static102.anInt2239);
			local106 = Static223.method941(arg0 - arg2, Static88.anInt2052, Static102.anInt2239);
			Static89.method1538(Static57.anIntArrayArray9[arg1], local97, local106, arg3);
		}
		@Pc(120) int local120 = (arg4 - 1) * local56;
		while (local9 > 0) {
			if (local52 < 0) {
				while (local52 < 0) {
					local52 += local68;
					local3++;
					local68 += local60;
					local39 += local82;
					local82 += local60;
				}
			}
			local9--;
			local97 = arg1 - local9;
			local106 = local9 + arg1;
			if (local39 < 0) {
				local3++;
				local52 += local68;
				local39 += local82;
				local68 += local60;
				local82 += local60;
			}
			local39 += -local76;
			if (local106 >= Static152.anInt3532 && local97 <= Static223.anInt1245) {
				@Pc(209) int local209 = Static223.method941(local3 + arg0, Static88.anInt2052, Static102.anInt2239);
				@Pc(218) int local218 = Static223.method941(arg0 - local3, Static88.anInt2052, Static102.anInt2239);
				if (Static152.anInt3532 <= local97) {
					Static89.method1538(Static57.anIntArrayArray9[local97], local209, local218, arg3);
				}
				if (local106 <= Static223.anInt1245) {
					Static89.method1538(Static57.anIntArrayArray9[local106], local209, local218, arg3);
				}
			}
			local52 += -local120;
			local120 -= local56;
			local76 -= local56;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method2529(@OriginalArg(0) String arg0) {
		if (Static159.aClass78_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static159.aClass78_2.anInt2855; local19++) {
			if (Static253.method4315(arg0, Static260.method4429("<br>", " ", Static159.aClass78_2.aStringArray14[local19]))) {
				return local19;
			}
		}
		return -1;
	}
}
