import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
	public static int anInt5764 = -1;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4507(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static202.anInt3950 >= 100 && !Static17.aBoolean33 || Static202.anInt3950 >= 200) {
			Static155.method2520(Static157.aClass189_99.method4262(Static53.anInt1454));
			return;
		}
		@Pc(27) String local27 = Static40.method777(arg0);
		if (local27 == null) {
			return;
		}
		@Pc(73) String local73;
		for (@Pc(36) int local36 = 0; local36 < Static202.anInt3950; local36++) {
			@Pc(43) String local43 = Static40.method777(Static388.aStringArray45[local36]);
			if (local43 != null && local43.equals(local27)) {
				Static155.method2520(arg0 + Static236.aClass189_141.method4262(Static53.anInt1454));
				return;
			}
			if (Static93.aStringArray19[local36] != null) {
				local73 = Static40.method777(Static93.aStringArray19[local36]);
				if (local73 != null && local73.equals(local27)) {
					Static155.method2520(arg0 + Static236.aClass189_141.method4262(Static53.anInt1454));
					return;
				}
			}
		}
		for (@Pc(103) int local103 = 0; local103 < Static415.anInt6805; local103++) {
			local73 = Static40.method777(Static82.aStringArray32[local103]);
			if (local73 != null && local73.equals(local27)) {
				Static155.method2520(Static213.aClass189_131.method4262(Static53.anInt1454) + arg0 + Static66.aClass189_49.method4262(Static53.anInt1454));
				return;
			}
			if (Static135.aStringArray29[local103] != null) {
				@Pc(145) String local145 = Static40.method777(Static135.aStringArray29[local103]);
				if (local145 != null && local145.equals(local27)) {
					Static155.method2520(Static213.aClass189_131.method4262(Static53.anInt1454) + arg0 + Static66.aClass189_49.method4262(Static53.anInt1454));
					return;
				}
			}
		}
		if (Static40.method777(Static379.aClass7_Sub2_Sub3_Sub2_2.aString36).equals(local27)) {
			Static155.method2520(Static320.aClass189_177.method4262(Static53.anInt1454));
		} else {
			Static30.method641(Static34.aClass217_18);
			Static302.aClass3_Sub7_Sub1_2.method2628(Static24.method582(arg0));
			Static302.aClass3_Sub7_Sub1_2.method2608(arg0);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I[ILclient!vj;II[I)Lclient!hr;")
	public static Class58_Sub2 method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class172_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(21) byte[] local21 = new byte[arg3 * arg0];
		for (@Pc(23) int local23 = 0; local23 < arg3; local23++) {
			@Pc(34) int local34 = local23 * arg0 + arg1[local23];
			for (@Pc(36) int local36 = 0; local36 < arg4[local23]; local36++) {
				local21[local34++] = -1;
			}
		}
		return new Class58_Sub2(arg2, arg0, arg3, local21);
	}
}
