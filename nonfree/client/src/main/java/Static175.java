import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
	public static int anInt3064;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Lclient!us;")
	public static final Class234 aClass234_66 = new Class234(32, -1);

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
	public static int anInt3062 = 0;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "Lclient!us;")
	public static final Class234 aClass234_67 = new Class234(10, -1);

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
	public static final int anInt3063 = 52;

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "J")
	public static long aLong121 = 0L;

	@OriginalMember(owner = "client!jq", name = "A", descriptor = "Z")
	public static volatile boolean aBoolean237 = false;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_43 = new Class244(4, -1);

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
	public static int anInt3065 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)I")
	public static int method2692() {
		return 6;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZI)V")
	public static void method2696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static171.aLong117 = 0;
		@Pc(9) int local9 = Static200.method3135();
		if (arg0 == 3 || local9 == 3) {
			arg2 = true;
		}
		if (!Static347.aClass155_9.method4889()) {
			arg2 = true;
		}
		Static76.method1311(arg1, arg2, local9, arg3, arg0);
	}
}
