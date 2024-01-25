import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Lclient!ec;")
	public static Class86 aClass86_1;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
	public static final int[] anIntArray272 = new int[2048];

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	public static int anInt5055 = -1;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "S")
	public static short aShort73 = 205;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)V")
	public static void method4551(@OriginalArg(1) int arg0) {
		Static262.anInt4727 = arg0;
		@Pc(11) Class87 local11 = Static295.aClass87_129;
		synchronized (Static295.aClass87_129) {
			Static295.aClass87_129.method1801();
		}
	}
}
