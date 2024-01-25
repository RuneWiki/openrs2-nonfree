import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!av", name = "C", descriptor = "Lclient!ie;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!av", name = "w", descriptor = "Lclient!e;")
	public static final Class58 aClass58_1 = new Class58(0);

	@OriginalMember(owner = "client!av", name = "y", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_29 = new Class137(54, 16);

	@OriginalMember(owner = "client!av", name = "z", descriptor = "I")
	public static int anInt396 = 0;

	@OriginalMember(owner = "client!av", name = "A", descriptor = "F")
	public static float aFloat3 = 0.0F;

	@OriginalMember(owner = "client!av", name = "B", descriptor = "[I")
	public static int[] anIntArray15 = new int[1];

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z[J[Ljava/lang/Object;)V")
	public static void method332(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static296.method3886(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)Lclient!id;")
	public static Class114_Sub1 method334(@OriginalArg(1) int arg0) {
		return Static54.aBoolean78 && arg0 >= Static435.anInt7231 && Static455.anInt7452 >= arg0 ? Static169.aClass114_Sub1Array2[arg0 - Static435.anInt7231] : null;
	}
}
