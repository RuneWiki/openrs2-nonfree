import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public static int anInt932;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	public static int anInt934;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!vd;")
	public static Class140 aClass140_1 = new Class140(16);

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	public static int anInt930 = 0;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public static int anInt933 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!hc;Z)V")
	public static void method592(@OriginalArg(0) Class51 arg0) {
		Static200.aClass51_64 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!b;")
	public static Class13 method594(@OriginalArg(0) int arg0) {
		@Pc(6) Class13 local6 = (Class13) Static264.aClass79_39.method2483((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static201.aClass51_65.method1874(33, arg0);
		local6 = new Class13();
		if (local20 != null) {
			local6.method237(arg0, new Class1_Sub13(local20));
		}
		Static264.aClass79_39.method2486(local6, (long) arg0);
		return local6;
	}
}
