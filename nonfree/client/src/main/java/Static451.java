import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!tm;")
	public static Class232 aClass232_2;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "Z")
	public static boolean aBoolean125;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
	public static int anInt1568;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Lclient!fk;")
	public static Class85 aClass85_2;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_30 = new Class81(0, 0);

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_21 = new Class44(11, 16);

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_22 = new Class44(72, 16);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILclient!cr;I)V")
	public static void method1153(@OriginalArg(0) int arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class14 local8 = arg1.method1183(Static387.aClass26_9);
		if (local8 == null) {
			return;
		}
		Static387.aClass26_9.pa(arg0, arg2, arg0 + arg1.anInt1622, arg1.anInt1599 + arg2);
		if (Static416.anInt7259 >= 3) {
			Static387.aClass26_9.j(-16777216, local8, arg0, arg2);
		} else {
			Static284.aClass76_13.method6090((float) arg0 + (float) arg1.anInt1622 / 2.0F, (float) arg1.anInt1599 / 2.0F + (float) arg2, ((int) -Static203.aFloat130 & 0x3FFF) << 2, local8, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!pc;I)V")
	public static void method1157(@OriginalArg(0) Class188 arg0) {
		Static296.aClass188_78 = arg0;
	}
}
