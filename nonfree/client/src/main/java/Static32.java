import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "[S")
	public static short[] aShortArray4;

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "Lclient!js;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!bk", name = "B", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_11 = new Class44(73, 3);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;Lclient!oa;IZ)V")
	public static void method437(@OriginalArg(0) String arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(21) int local21 = Static56.aClass210_2.method4754(250, null, arg0);
		@Pc(32) int local32 = Static56.aClass210_2.method4746(250, arg0, null) * 13;
		Static387.aClass26_9.NA(6, 6, local21 + 4 + 4, local32 - -8, -16777216, 0);
		Static387.aClass26_9.method2247(6, 6, local21 + 4 + 4, local32 + 4 - -4, -1, 0);
		arg1.method5851(-1, 0, null, 1, 10, null, 0, local21, -1, local32, 10, null, arg0);
		Static153.method2331(6, local21 + 8, 6, local32 + 8);
		if (arg2) {
			Static387.aClass26_9.method2220();
		}
	}
}
