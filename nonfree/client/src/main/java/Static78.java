import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int anInt1860;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "Lclient!jf;")
	public static Class42 aClass42_8;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] aClass4_Sub2_Sub3_Sub4Array5;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!ja;")
	private static Class39 aClass39_995 = Static28.method504("shake:");

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_993 = aClass39_995;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	public static int anInt1859 = 2;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_994 = Static28.method504("");

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Lclient!ja;")
	public static Class39 aClass39_996 = aClass39_995;

	@OriginalMember(owner = "client!na", name = "u", descriptor = "Lclient!ja;")
	public static Class39 aClass39_997 = Static28.method504("<col=40ff00>");

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	public static void method1299() {
		aClass4_Sub2_Sub3_Sub4Array5 = null;
		aClass39_997 = null;
		aClass39_994 = null;
		aClass42_8 = null;
		aClass39_995 = null;
		aClass39_993 = null;
		aClass39_996 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!he;)Lclient!he;")
	public static Class4_Sub5 method1300(@OriginalArg(1) Class4_Sub5 arg0) {
		@Pc(7) int local7 = Static87.method1644(Static20.method385(arg0));
		if (local7 == 0) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < local7; local25++) {
			arg0 = Static54.method949(arg0.anInt1199);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!t;")
	public static Class4_Sub2_Sub14 method1301(@OriginalArg(1) int arg0) {
		@Pc(18) Class4_Sub2_Sub14 local18 = (Class4_Sub2_Sub14) Static15.aClass12_13.method235((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static106.aClass20_53.method474(3, arg0);
		local18 = new Class4_Sub2_Sub14();
		if (local28 != null) {
			local18.method1958(new Class4_Sub16(local28));
		}
		Static15.aClass12_13.method234(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)I")
	public static int method1302() {
		return Static42.anInt1070++;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method1303(@OriginalArg(1) KeyEvent arg0) {
		@Pc(8) int local8 = arg0.getKeyChar();
		if (local8 == 8364) {
			return 128;
		} else {
			if (local8 <= 0 || local8 >= 256) {
				local8 = -1;
			}
			return local8;
		}
	}
}
