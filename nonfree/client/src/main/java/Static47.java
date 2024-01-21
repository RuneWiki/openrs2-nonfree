import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!ja;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "[Lclient!oc;")
	public static Class70[] aClass70Array19;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public static int anInt969;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public static int anInt970;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	public static int anInt972;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_473 = Static193.method3027("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!oc;")
	public static Class70 aClass70_474 = aClass70_473;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_475 = Static193.method3027("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!oc;")
	public static Class70 aClass70_476 = aClass70_475;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_477 = Static193.method3027("(Y");

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_478 = Static193.method3027(")3");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ke;Lclient!oc;Lclient!oc;)[Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2[] method745(@OriginalArg(1) Class52 arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) Class70 arg2) {
		@Pc(8) int local8 = arg0.method1560(arg2);
		@Pc(14) int local14 = arg0.method1554(arg1, local8);
		return Static6.method105(local8, local14, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method747(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static35.aClass9_1);
		arg0.removeMouseMotionListener(Static35.aClass9_1);
		arg0.removeFocusListener(Static35.aClass9_1);
		Static113.anInt2291 = 0;
	}
}
