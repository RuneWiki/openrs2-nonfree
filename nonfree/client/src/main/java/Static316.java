import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "Z")
	public static boolean aBoolean342;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_1 = new Class210(14, 1);

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_2 = new Class210(15, 4);

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_3 = new Class210(16, -2);

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_4 = new Class210(17, 0);

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_5 = new Class210(18, -2);

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_6 = new Class210(19, -2);

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_7 = new Class210(20, 6);

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_8 = new Class210(21, 9);

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_9 = new Class210(22, -2);

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_10 = new Class210(23, 4);

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_11 = new Class210(24, -1);

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "Lclient!rl;")
	public static final Class210 aClass210_12 = new Class210(25, -2);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
	public static void method3902(@OriginalArg(0) int arg0) {
		Static228.anInt3789 = arg0;
		@Pc(12) Class44 local12 = Static335.aClass44_55;
		synchronized (Static335.aClass44_55) {
			Static335.aClass44_55.method1031();
		}
		local12 = Static200.aClass44_32;
		synchronized (Static200.aClass44_32) {
			Static200.aClass44_32.method1031();
		}
	}
}
