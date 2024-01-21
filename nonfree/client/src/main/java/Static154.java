import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!q", name = "F", descriptor = "Lclient!b;")
	public static Class6 aClass6_83 = null;

	@OriginalMember(owner = "client!q", name = "J", descriptor = "I")
	public static int anInt3183 = -1;

	@OriginalMember(owner = "client!q", name = "L", descriptor = "I")
	public static int anInt3185 = 0;

	@OriginalMember(owner = "client!q", name = "T", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1524 = Static193.method3027("Could not complete login)3");

	@OriginalMember(owner = "client!q", name = "N", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1522 = aClass70_1524;

	@OriginalMember(owner = "client!q", name = "R", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1523 = Static193.method3027("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ce;I)V")
	public static void method2283(@OriginalArg(0) Class3_Sub4 arg0) {
		if (Static152.aClass82_4 != null) {
			try {
				Static152.aClass82_4.method2441(0L);
				Static152.aClass82_4.method2437(arg0.aByteArray12, 24, arg0.anInt1758);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt1758 += 24;
	}
}
