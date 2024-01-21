import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public static int anInt1664;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public static int anInt1666;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_825 = Static108.method1915("sl_back");

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!kd;")
	private static Class39 aClass39_827 = Static108.method1915("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_826 = aClass39_827;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_828 = Static108.method1915("");

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
	public static int anInt1672 = 0;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!kd;")
	private static Class39 aClass39_829 = Static108.method1915("Loading wordpack )2 ");

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_830 = aClass39_829;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "Lclient!kd;")
	private static Class39 aClass39_831 = Static108.method1915("Username: ");

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "Lclient!kd;")
	public static Class39 aClass39_832 = Static108.method1915("compass");

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_833 = aClass39_831;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public static void method1141() {
		@Pc(9) Object local9 = Static49.anObject1;
		synchronized (Static49.anObject1) {
			if (Static45.anInt1257 == 0) {
				Static92.aClass79_2.method2087(5, new Class81());
			}
			Static45.anInt1257 = 600;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lclient!kd;")
	public static Class39 method1142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static105.aClass39_1301;
		} else if (local7 < -6) {
			return Static38.aClass39_536;
		} else if (local7 < -3) {
			return Static16.aClass39_1219;
		} else if (local7 < 0) {
			return Static11.aClass39_225;
		} else if (local7 > 9) {
			return Static75.aClass39_924;
		} else if (local7 > 6) {
			return Static73.aClass39_895;
		} else if (local7 > 3) {
			return Static128.aClass39_1547;
		} else if (local7 > 0) {
			return Static123.aClass39_1485;
		} else {
			return Static4.aClass39_64;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!bc;")
	public static Class6 method1143(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class6_Sub2");
			@Pc(15) Class6 local15 = (Class6) local11.getDeclaredConstructor().newInstance();
			local15.method2065(arg1, arg0, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class6_Sub1 local28 = new Class6_Sub1();
			local28.method2065(arg1, arg0, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method1144() {
		try {
			@Pc(6) Graphics local6 = Static16.aCanvas10.getGraphics();
			Static121.aClass6_21.method2067(553, 205, local6);
		} catch (@Pc(16) Exception local16) {
			Static16.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class1_Sub1_Sub14 method1146(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub14 local12 = (Class1_Sub1_Sub14) Static25.aClass33_10.method1038((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static9.aClass62_34.method2008(arg0, 13);
		local12 = new Class1_Sub1_Sub14();
		local12.anInt2608 = arg0;
		if (local22 != null) {
			local12.method1837(new Class1_Sub18(local22));
		}
		Static25.aClass33_10.method1042(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method1147() {
		aClass39_833 = null;
		aClass39_832 = null;
		aClass39_828 = null;
		aClass39_827 = null;
		aClass39_825 = null;
		aClass39_830 = null;
		aClass39_831 = null;
		anIntArray244 = null;
		aClass39_826 = null;
		aClass39_829 = null;
	}
}
