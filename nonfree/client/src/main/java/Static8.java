import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "F", descriptor = "Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_3;

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "Lclient!sd;")
	private static Class73 aClass73_135 = Static122.method531("Please try using a different world)3");

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "Lclient!sd;")
	public static Class73 aClass73_127 = aClass73_135;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "Lclient!sd;")
	public static Class73 aClass73_128 = aClass73_135;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "Lclient!sd;")
	public static Class73 aClass73_129 = aClass73_135;

	@OriginalMember(owner = "client!ag", name = "H", descriptor = "Lclient!sd;")
	private static Class73 aClass73_130 = Static122.method531("Loading title screen )2 ");

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "Lclient!sd;")
	public static Class73 aClass73_131 = aClass73_135;

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "Lclient!sd;")
	public static Class73 aClass73_132 = aClass73_135;

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "Lclient!sd;")
	public static Class73 aClass73_133 = aClass73_130;

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "Lclient!sd;")
	public static Class73 aClass73_134 = aClass73_135;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!fg;ZZ)V")
	public static void method155(@OriginalArg(0) Class3_Sub13 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt1133;
		@Pc(10) int local10 = (int) arg0.aLong183;
		arg0.method2783();
		if (arg1) {
			Static31.method595(local6);
		}
		Static137.method2246(local6);
		@Pc(25) Class83 local25 = Static80.method1396(local10);
		if (local25 != null) {
			Static60.method1104(local25);
		}
		Static169.aBoolean245 = false;
		Static142.anInt3262 = 0;
		Static23.method500(Static53.anInt3959, Static116.anInt2761, Static138.anInt3195, Static133.anInt3045);
		if (Static133.anInt3052 != -1) {
			Static148.method2412(1, Static133.anInt3052);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method157() {
		aClass3_Sub1_Sub3_Sub4_3 = null;
		aClass73_132 = null;
		aClass73_133 = null;
		aClass73_131 = null;
		aClass73_128 = null;
		aClass73_130 = null;
		aClass73_129 = null;
		aClass73_134 = null;
		aClass73_135 = null;
		aClass73_127 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method158(@OriginalArg(1) KeyEvent arg0) {
		@Pc(14) int local14 = arg0.getKeyChar();
		if (local14 == 8364) {
			return 128;
		} else {
			if (local14 <= 0 || local14 >= 256) {
				local14 = -1;
			}
			return local14;
		}
	}
}
