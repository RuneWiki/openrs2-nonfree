import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
	public static int anInt2616 = 0;

	@OriginalMember(owner = "client!jj", name = "X", descriptor = "[I")
	public static int[] anIntArray230 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!jj", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[5];

	@OriginalMember(owner = "client!jj", name = "jb", descriptor = "I")
	public static int anInt2627 = 0;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)V")
	public static void method2049() {
		Static253.aClass26_51.method515();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIII)V")
	public static void method2051(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static79.method1364(arg2)) {
			Static238.method3697(Static188.aClass189ArrayArray115[arg2], arg0, arg1, -1, arg3);
		}
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
	public static void method2055() {
		@Pc(11) boolean local11 = false;
		while (!local11) {
			local11 = true;
			for (@Pc(17) int local17 = 0; local17 < Static300.anInt5638 - 1; local17++) {
				if (Static262.aShortArray100[local17] < 1000 && Static262.aShortArray100[local17 + 1] > 1000) {
					local11 = false;
					@Pc(43) String local43 = Static249.aStringArray27[local17];
					Static249.aStringArray27[local17] = Static249.aStringArray27[local17 + 1];
					Static249.aStringArray27[local17 + 1] = local43;
					@Pc(61) String local61 = Static259.aStringArray30[local17];
					Static259.aStringArray30[local17] = Static259.aStringArray30[local17 + 1];
					Static259.aStringArray30[local17 + 1] = local61;
					@Pc(79) int local79 = Static73.anIntArray117[local17];
					Static73.anIntArray117[local17] = Static73.anIntArray117[local17 + 1];
					Static73.anIntArray117[local17 + 1] = local79;
					@Pc(97) int local97 = Static262.anIntArray543[local17];
					Static262.anIntArray543[local17] = Static262.anIntArray543[local17 + 1];
					Static262.anIntArray543[local17 + 1] = local97;
					@Pc(115) int local115 = Static86.anIntArray160[local17];
					Static86.anIntArray160[local17] = Static86.anIntArray160[local17 + 1];
					Static86.anIntArray160[local17 + 1] = local115;
					@Pc(133) short local133 = Static262.aShortArray100[local17];
					Static262.aShortArray100[local17] = Static262.aShortArray100[local17 + 1];
					Static262.aShortArray100[local17 + 1] = local133;
					@Pc(151) long local151 = Static141.aLongArray56[local17];
					Static141.aLongArray56[local17] = Static141.aLongArray56[local17 + 1];
					Static141.aLongArray56[local17 + 1] = local151;
				}
			}
		}
	}
}
