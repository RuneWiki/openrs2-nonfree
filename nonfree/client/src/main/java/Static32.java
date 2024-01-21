import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "Lclient!u;")
	public static Class76 aClass76_28;

	@OriginalMember(owner = "client!da", name = "U", descriptor = "Lclient!fc;")
	public static Class25 aClass25_4 = new Class25(30);

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!da", name = "cb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_342 = Static49.method1293("auf der Hautpseite)3");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BZLclient!ja;)V")
	public static void method819(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		@Pc(6) int local6 = arg1.anInt2467;
		@Pc(10) int local10 = (int) arg1.aLong147;
		arg1.method3499();
		if (arg0) {
			Static178.method3440(local6);
		}
		Static110.method2284(local6);
		@Pc(25) Class39 local25 = Static128.method3227(local10);
		if (local25 != null) {
			Static171.method3407(local25);
		}
		Static162.anInt4331 = 0;
		aBoolean47 = false;
		Static169.method3346(Static110.anInt3091, Static18.anInt481, Static3.anInt150, Static170.anInt4398);
		if (Static58.anInt1865 != -1) {
			Static31.method792(1, Static58.anInt1865);
		}
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	public static void method821() {
		aClass70_342 = null;
		aClass25_4 = null;
		aClass76_28 = null;
	}
}
