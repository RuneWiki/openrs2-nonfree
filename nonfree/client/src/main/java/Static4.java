import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_1;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Lclient!pa;")
	public static Class51 aClass51_3;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!ke;")
	private static Class39 aClass39_42 = Static2.method66("This world is full)3");

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_43 = aClass39_42;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_44 = Static2.method66("Ung-Ultiger Benutzername oder Passwort)3");

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!ke;")
	public static Class39 aClass39_45 = Static2.method66("m");

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	public static int anInt96 = 0;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!qd;")
	public static Class54 aClass54_2 = new Class54(20);

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!ke;")
	public static Class39 aClass39_46 = Static2.method66("leuchten3:");

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!ke;")
	private static Class39 aClass39_48 = Static2.method66("Welcome to RuneScape");

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!ke;")
	public static Class39 aClass39_47 = aClass39_48;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_49 = Static2.method66("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method73(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method74(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static105.aClass29_1);
		arg0.removeMouseMotionListener(Static105.aClass29_1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!jd;BZLclient!jd;)V")
	public static void method75(@OriginalArg(0) Class36 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class36 arg2) {
		Static22.aClass36_16 = arg0;
		Static108.aBoolean137 = arg1;
		Static18.aClass36_14 = arg2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method77() {
		aClass39_45 = null;
		aClass54_2 = null;
		aClass2_Sub1_Sub4_Sub3_1 = null;
		aClass39_44 = null;
		aClass39_47 = null;
		aClass39_46 = null;
		aClass39_49 = null;
		aClass51_3 = null;
		aClass39_43 = null;
		aClass39_42 = null;
		aClass39_48 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub3 local7 = null;
		for (@Pc(12) Class2_Sub3 local12 = (Class2_Sub3) Static89.aClass34_44.method872(); local12 != null; local12 = (Class2_Sub3) Static89.aClass34_44.method879()) {
			if (arg6 == local12.anInt495 && arg2 == local12.anInt500 && local12.anInt497 == arg0 && local12.anInt502 == arg8) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub3();
			local7.anInt495 = arg6;
			local7.anInt502 = arg8;
			local7.anInt500 = arg2;
			local7.anInt497 = arg0;
			Static6.method2063(local7);
			Static89.aClass34_44.method876(local7);
		}
		local7.anInt492 = arg4;
		local7.anInt488 = arg5;
		local7.anInt499 = arg7;
		local7.anInt487 = arg1;
		local7.anInt494 = arg3;
	}
}
