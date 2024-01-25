import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Lclient!tr;")
	public static Class137 aClass137_2;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	public static int anInt1798;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "[I")
	public static final int[] anIntArray230 = new int[5];

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;IIBLjava/lang/String;Ljava/lang/String;)V")
	public static void method1458(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static109.method1537(arg4, arg3, arg1, arg0, -1, null, arg2);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	public static void method1462() {
		@Pc(6) Class227 local6 = Static329.aClass227_30;
		synchronized (Static329.aClass227_30) {
			Static329.aClass227_30.method4859(5);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V")
	public static void method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg0, 13);
		local8.method3004();
		local8.anInt3686 = arg1;
	}
}
