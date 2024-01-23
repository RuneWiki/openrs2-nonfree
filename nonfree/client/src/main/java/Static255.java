import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "[Lclient!l;")
	public static Class4_Sub15[] aClass4_Sub15Array1;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
	public static int anInt4857 = 0;

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
	public static int anInt4860 = 0;

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "[I")
	public static int[] anIntArray528 = new int[14];

	@OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
	public static int anInt4862 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public static void method4033() {
		@Pc(6) Class4_Sub11 local6;
		for (local6 = (Class4_Sub11) Static11.aClass114_2.method2623(); local6 != null; local6 = (Class4_Sub11) Static11.aClass114_2.method2629()) {
			if (local6.aBoolean146) {
				local6.method1652();
			}
		}
		for (local6 = (Class4_Sub11) Static82.aClass114_9.method2623(); local6 != null; local6 = (Class4_Sub11) Static82.aClass114_9.method2629()) {
			if (local6.aBoolean146) {
				local6.method1652();
			}
		}
	}
}
