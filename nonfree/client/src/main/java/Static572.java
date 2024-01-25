import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	public static int anInt9826;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public static int anInt9827;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	public static int anInt9828;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!bq;")
	public static Class43 aClass43_61 = new Class43();

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "Lclient!of;")
	public static final Class236 aClass236_98 = new Class236(3000000, 200);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!tp;IZ)V")
	public static void method7939(@OriginalArg(0) int arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2) {
		if (Static147.aBoolean270) {
			@Pc(17) Class82 local17 = Static330.anInt4199 == -1 ? null : Static144.aClass274_1.method6933(Static330.anInt4199);
			if (Static73.method1921(arg1).method5222() && (Static328.anInt9771 & 0x20) != 0 && (local17 == null || arg1.method7734(local17.anInt3023, Static330.anInt4199) != local17.anInt3023)) {
				Static192.method3629((long) (arg1.anInt9535 << 0 | arg1.anInt9578), false, arg1.anInt9570, false, 0L, 13, Static598.aString17, arg1.anInt9578, arg1.anInt9535, true, Static500.anInt8805, Static4.aString2 + " -> " + arg1.aString101);
			}
		}
		@Pc(89) String local89;
		for (@Pc(80) int local80 = 9; local80 >= 5; local80--) {
			local89 = Static510.method7348(arg1, local80);
			if (local89 != null) {
				Static192.method3629((long) (arg1.anInt9578 | arg1.anInt9535 << 0), false, arg1.anInt9570, false, (long) (local80 + 1), 1002, local89, arg1.anInt9578, arg1.anInt9535, true, Static13.method7361(arg1, local80), arg1.aString101);
			}
		}
		local89 = Static408.method6463(arg1);
		if (local89 != null) {
			Static192.method3629((long) (arg1.anInt9578 | arg1.anInt9535 << 0), false, arg1.anInt9570, false, 0L, 12, local89, arg1.anInt9578, arg1.anInt9535, true, arg1.anInt9547, arg1.aString101);
		}
		for (@Pc(172) int local172 = 4; local172 >= 0; local172--) {
			@Pc(179) String local179 = Static510.method7348(arg1, local172);
			if (local179 != null) {
				Static192.method3629((long) (arg1.anInt9535 << 0 | arg1.anInt9578), false, arg1.anInt9570, false, (long) (local172 + 1), 5, local179, arg1.anInt9578, arg1.anInt9535, true, Static13.method7361(arg1, local172), arg1.aString101);
			}
		}
		if (!Static73.method1921(arg1).method5215()) {
			return;
		}
		if (arg1.aString99 == null) {
			Static192.method3629((long) (arg1.anInt9578 | arg1.anInt9535 << 0), false, arg1.anInt9570, false, 0L, 9, Static121.aClass84_9.method2710(Static372.anInt7083), arg1.anInt9578, arg1.anInt9535, true, -1, "");
		} else {
			Static192.method3629((long) (arg1.anInt9578 | arg1.anInt9535 << 0), false, arg1.anInt9570, false, 0L, 9, arg1.aString99, arg1.anInt9578, arg1.anInt9535, true, -1, "");
		}
	}
}
