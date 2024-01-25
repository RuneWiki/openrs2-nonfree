import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!la", name = "H", descriptor = "I")
	public static int anInt3664;

	@OriginalMember(owner = "client!la", name = "L", descriptor = "Lclient!qm;")
	public static Class174 aClass174_10;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_118 = new Class18(20, 4);

	@OriginalMember(owner = "client!la", name = "S", descriptor = "[I")
	public static final int[] anIntArray269 = new int[4];

	@OriginalMember(owner = "client!la", name = "W", descriptor = "I")
	public static int anInt3671 = 0;

	@OriginalMember(owner = "client!la", name = "Y", descriptor = "[I")
	public static final int[] anIntArray270 = new int[14];

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(BI)V")
	public static void method3417(@OriginalArg(1) int arg0) {
		for (@Pc(5) Class1 local5 = Static113.aClass38_10.method1474(); local5 != null; local5 = Static113.aClass38_10.method1470()) {
			if ((long) arg0 == (local5.aLong217 >> 48 & 0xFFFFL)) {
				local5.method6045();
			}
		}
	}
}
