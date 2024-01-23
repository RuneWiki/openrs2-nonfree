import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!db", name = "j", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public static int anInt879 = 0;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public static volatile int anInt883 = 0;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString22 = "Connection lost.";

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	public static int anInt885 = 0;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt886 = 0;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public static int anInt887 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
	public static void method702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static129.method2127(arg1 + arg0, -arg0 + arg1, arg4, Static234.anIntArrayArray40[arg3]);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg2;
		@Pc(26) int local26 = arg2 * arg2;
		@Pc(34) int local34 = arg0 * arg0;
		@Pc(38) int local38 = local34 << 1;
		@Pc(42) int local42 = local26 << 1;
		@Pc(46) int local46 = arg2 << 1;
		@Pc(54) int local54 = local26 - local38 * (local46 - 1);
		@Pc(58) int local58 = local34 << 2;
		@Pc(67) int local67 = local42 + (1 - local46) * local34;
		@Pc(71) int local71 = local26 << 2;
		@Pc(79) int local79 = local42 * 3;
		@Pc(85) int local85 = local71;
		@Pc(93) int local93 = ((arg2 << 1) - 3) * local38;
		@Pc(99) int local99 = local58 * (arg2 - 1);
		while (local22 > 0) {
			local22--;
			@Pc(110) int local110 = arg3 - local22;
			@Pc(115) int local115 = arg3 + local22;
			if (local67 < 0) {
				while (local67 < 0) {
					local20++;
					local54 += local85;
					local67 += local79;
					local79 += local71;
					local85 += local71;
				}
			}
			if (local54 < 0) {
				local67 += local79;
				local54 += local85;
				local20++;
				local85 += local71;
				local79 += local71;
			}
			local67 += -local99;
			@Pc(174) int local174 = arg1 + local20;
			local99 -= local58;
			local54 += -local93;
			local93 -= local58;
			@Pc(191) int local191 = arg1 - local20;
			Static129.method2127(local174, local191, arg4, Static234.anIntArrayArray40[local110]);
			Static129.method2127(local174, local191, arg4, Static234.anIntArrayArray40[local115]);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method703() {
		Static139.aClass33_23.method843();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method704() {
		aString22 = null;
		anIntArray115 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!lc;I)V")
	public static void method705(@OriginalArg(0) Class98 arg0) {
		Static295.aClass98_172 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBILclient!cc;)V")
	public static void method706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22 arg2) {
		if (Static45.aClass22_6 != null || Static142.aBoolean192 || (arg2 == null || Static115.method1988(arg2) == null)) {
			return;
		}
		Static45.aClass22_6 = arg2;
		Static207.aClass22_17 = Static115.method1988(arg2);
		Static238.aBoolean300 = false;
		Static220.anInt4359 = arg0;
		Static103.anInt2190 = 0;
		Static89.anInt1844 = arg1;
	}
}
