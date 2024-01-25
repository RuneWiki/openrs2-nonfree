import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	public static int anInt5930;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Lclient!ja;")
	public static Class81 aClass81_9;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
	public static int anInt5929 = -1;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	public static int anInt5932 = 99;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method5355(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(2, arg0);
		local8.method2648();
		local8.aString105 = arg1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public static void method5356() {
		@Pc(1) Class70 local1 = Static126.aClass70_40;
		synchronized (Static126.aClass70_40) {
			Static126.aClass70_40.method1405();
		}
		local1 = Static108.aClass70_34;
		synchronized (Static108.aClass70_34) {
			Static108.aClass70_34.method1405();
		}
	}
}
