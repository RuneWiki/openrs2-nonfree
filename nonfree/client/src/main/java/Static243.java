import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
	public static int anInt5018;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Lclient!kea;")
	public static Class161 aClass161_54;

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString38;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
	public static int anInt5022 = 0;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIII)V")
	public static void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static73.method7829(arg0 + arg3, Static190.anInt4314, Static145.anInt2941);
		@Pc(30) int local30 = Static73.method7829(arg3 - arg0, Static190.anInt4314, Static145.anInt2941);
		Static257.method4540(Static68.anIntArrayArray24[arg2], arg1, local30, local22);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(62) int local62;
			@Pc(67) int local67;
			@Pc(81) int local81;
			@Pc(90) int local90;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local62 = arg2 - local9;
				local67 = arg2 + local9;
				if (local67 >= Static269.anInt5577 && Static81.anInt1788 >= local62) {
					local81 = Static73.method7829(local7 + arg3, Static190.anInt4314, Static145.anInt2941);
					local90 = Static73.method7829(arg3 - local7, Static190.anInt4314, Static145.anInt2941);
					if (Static81.anInt1788 >= local67) {
						Static257.method4540(Static68.anIntArrayArray24[local67], arg1, local90, local81);
					}
					if (local62 >= Static269.anInt5577) {
						Static257.method4540(Static68.anIntArrayArray24[local62], arg1, local90, local81);
					}
				}
			}
			local7++;
			local62 = arg2 - local7;
			local67 = arg2 + local7;
			if (local67 >= Static269.anInt5577 && Static81.anInt1788 >= local62) {
				local81 = Static73.method7829(arg3 + local9, Static190.anInt4314, Static145.anInt2941);
				local90 = Static73.method7829(arg3 - local9, Static190.anInt4314, Static145.anInt2941);
				if (local67 <= Static81.anInt1788) {
					Static257.method4540(Static68.anIntArrayArray24[local67], arg1, local90, local81);
				}
				if (local62 >= Static269.anInt5577) {
					Static257.method4540(Static68.anIntArrayArray24[local62], arg1, local90, local81);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method4209(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static41.anInt1004 >= 100) {
			Static356.method5583(Static301.aClass67_92.method1934(Static193.anInt7803));
			return;
		}
		@Pc(23) String local23 = Static329.method5266(arg0);
		if (local23 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(28) int local28 = 0; local28 < Static41.anInt1004; local28++) {
			@Pc(36) String local36 = Static329.method5266(Static241.aStringArray51[local28]);
			if (local36 != null && local36.equals(local23)) {
				Static356.method5583(arg0 + Static454.aClass67_135.method1934(Static193.anInt7803));
				return;
			}
			if (Static65.aStringArray11[local28] != null) {
				local67 = Static329.method5266(Static65.aStringArray11[local28]);
				if (local67 != null && local67.equals(local23)) {
					Static356.method5583(arg0 + Static454.aClass67_135.method1934(Static193.anInt7803));
					return;
				}
			}
		}
		for (@Pc(99) int local99 = 0; local99 < Static178.anInt4133; local99++) {
			local67 = Static329.method5266(Static520.aStringArray49[local99]);
			if (local67 != null && local67.equals(local23)) {
				Static356.method5583(Static171.aClass67_54.method1934(Static193.anInt7803) + arg0 + Static80.aClass67_23.method1934(Static193.anInt7803));
				return;
			}
			if (Static368.aStringArray40[local99] != null) {
				@Pc(143) String local143 = Static329.method5266(Static368.aStringArray40[local99]);
				if (local143 != null && local143.equals(local23)) {
					Static356.method5583(Static171.aClass67_54.method1934(Static193.anInt7803) + arg0 + Static80.aClass67_23.method1934(Static193.anInt7803));
					return;
				}
			}
		}
		if (Static329.method5266(Static111.aClass6_Sub1_Sub2_Sub1_3.aString27).equals(local23)) {
			Static356.method5583(Static327.aClass67_100.method1934(Static193.anInt7803));
		} else {
			Static278.method4791(Static265.aClass158_68);
			Static515.aClass3_Sub27_Sub1_2.method7576(Static274.method4751(arg0) + 1);
			Static515.aClass3_Sub27_Sub1_2.method7608(arg0);
			Static515.aClass3_Sub27_Sub1_2.method7576(arg1 ? 1 : 0);
		}
	}
}
