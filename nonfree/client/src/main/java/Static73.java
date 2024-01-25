import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "[I")
	public static int[] anIntArray155 = new int[1];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!jq;III)V")
	public static void method1280(@OriginalArg(0) Class156 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static431.aBoolean542) {
			@Pc(17) Class71 local17 = Static146.anInt2743 == -1 ? null : Static452.aClass317_2.method7539(Static146.anInt2743);
			if (Static67.method1228(arg0).method2102() && (Static276.anInt9030 & 0x20) != 0 && (local17 == null || arg0.method4048(Static146.anInt2743, local17.anInt1963) != local17.anInt1963)) {
				Static13.method390(0L, arg0.anInt4677, Static170.aString32 + " -> " + arg0.aString44, arg0.anInt4723, 2, Static238.aString58, arg0.anInt4697, true, false, Static222.anInt4414);
			}
		}
		@Pc(83) String local83;
		for (@Pc(74) int local74 = 9; local74 >= 5; local74--) {
			local83 = Static515.method7053(arg0, local74);
			if (local83 != null) {
				Static13.method390((long) (local74 + 1), arg0.anInt4677, arg0.aString44, arg0.anInt4723, 1009, local83, arg0.anInt4697, true, false, Static138.method2264(arg0, local74));
			}
		}
		local83 = Static112.method1909(arg0);
		if (local83 != null) {
			Static13.method390(0L, arg0.anInt4677, arg0.aString44, arg0.anInt4723, 4, local83, arg0.anInt4697, true, false, arg0.anInt4705);
		}
		for (@Pc(153) int local153 = 4; local153 >= 0; local153--) {
			@Pc(160) String local160 = Static515.method7053(arg0, local153);
			if (local160 != null) {
				Static13.method390((long) (local153 + 1), arg0.anInt4677, arg0.aString44, arg0.anInt4723, 18, local160, arg0.anInt4697, true, false, Static138.method2264(arg0, local153));
			}
		}
		if (!Static67.method1228(arg0).method2101()) {
			return;
		}
		if (arg0.aString45 == null) {
			Static13.method390(0L, arg0.anInt4677, "", arg0.anInt4723, 3, Static539.aClass306_134.method7165(Static179.anInt3168), arg0.anInt4697, true, false, -1);
		} else {
			Static13.method390(0L, arg0.anInt4677, "", arg0.anInt4723, 3, arg0.aString45, arg0.anInt4697, true, false, -1);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public static void method1281(@OriginalArg(0) int arg0) {
		Static291.anInt5489 = arg0;
		@Pc(7) Class313 local7 = Static153.aClass313_21;
		synchronized (Static153.aClass313_21) {
			Static153.aClass313_21.method7398();
		}
		local7 = Static305.aClass313_35;
		synchronized (Static305.aClass313_35) {
			Static305.aClass313_35.method7398();
		}
	}
}
