import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!od", name = "K", descriptor = "I")
	public static int anInt6267;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "Lclient!uq;")
	public static Class334 aClass334_13;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_66 = new Class70(68, 3);

	@OriginalMember(owner = "client!od", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray147 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!od", name = "J", descriptor = "I")
	public static int anInt6266 = 0;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_45 = new Class353();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5032(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static281.anInt4916 >= 200 && !Static82.aBoolean143 || Static281.anInt4916 >= 200) {
			Static571.method7692(Static568.aClass351_14.method7651(Static307.anInt5279));
			local30 = Static568.aClass351_15.method7651(Static307.anInt5279);
			if (local30 != null) {
				Static571.method7692(local30);
			}
			return;
		}
		local30 = Static442.method6116(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(85) String local85;
		for (@Pc(46) int local46 = 0; local46 < Static281.anInt4916; local46++) {
			@Pc(54) String local54 = Static442.method6116(Static308.aStringArray24[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static571.method7692(arg0 + Static568.aClass351_42.method7651(Static307.anInt5279));
				return;
			}
			if (Static98.aStringArray29[local46] != null) {
				local85 = Static442.method6116(Static98.aStringArray29[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static571.method7692(arg0 + Static568.aClass351_42.method7651(Static307.anInt5279));
					return;
				}
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static233.anInt7999; local116++) {
			local85 = Static442.method6116(Static29.aStringArray4[local116]);
			if (local85 != null && local85.equals(local30)) {
				Static571.method7692(Static568.aClass351_47.method7651(Static307.anInt5279) + arg0 + Static568.aClass351_48.method7651(Static307.anInt5279));
				return;
			}
			if (Static534.aStringArray37[local116] != null) {
				@Pc(160) String local160 = Static442.method6116(Static534.aStringArray37[local116]);
				if (local160 != null && local160.equals(local30)) {
					Static571.method7692(Static568.aClass351_47.method7651(Static307.anInt5279) + arg0 + Static568.aClass351_48.method7651(Static307.anInt5279));
					return;
				}
			}
		}
		if (Static442.method6116(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16).equals(local30)) {
			Static571.method7692(Static568.aClass351_45.method7651(Static307.anInt5279));
		} else {
			@Pc(218) Class1_Sub11 local218 = Static276.method3885(Static447.aClass70_78, Static481.aClass276_2);
			local218.aClass1_Sub35_Sub2_1.method5777(Static358.method4886(arg0));
			local218.aClass1_Sub35_Sub2_1.method5761(arg0);
			Static48.method743(local218);
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lclient!vb;")
	public static Class317_Sub1 method5033() {
		return Static344.anInt5737 < Static436.aClass317_Sub1Array2.length ? Static436.aClass317_Sub1Array2[Static344.anInt5737++] : null;
	}
}
