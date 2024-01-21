import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!oe;")
	public static Class56 aClass56_3;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "[I")
	public static int[] anIntArray392;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "Z")
	public static boolean aBoolean206;

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1236 = Static108.method1915("mapmarker");

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1246 = Static108.method1915("glow3:");

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1237 = aClass39_1246;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1238 = Static108.method1915("Loading friend list");

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1239 = Static108.method1915("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1240 = Static108.method1915("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1241 = Static108.method1915("leuchten1:");

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1242 = aClass39_1246;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1245 = Static108.method1915("Friends");

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1243 = aClass39_1245;

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1244 = aClass39_1238;

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[5];

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "[I")
	public static int[] anIntArray393 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	public static int anInt2575 = -1;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1247 = Static108.method1915("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!kd;Lclient!q;Lclient!kd;ZI)V")
	public static void method1815(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class39 arg2) {
		@Pc(16) int local16 = arg1.method2015(arg2);
		@Pc(22) int local22 = arg1.method2012(local16, arg0);
		Static37.method669(local22, local16, 255, arg1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!kd;Lclient!q;Lclient!kd;I)Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 method1816(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class39 arg2) {
		@Pc(4) int local4 = arg1.method2015(arg2);
		@Pc(16) int local16 = arg1.method2012(local4, arg0);
		return Static45.method793(local4, local16, arg1);
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	public static void method1817() {
		Static67.aClass31_39 = new Class31();
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
	public static void method1818() {
		anIntArray393 = null;
		aClass56_3 = null;
		aClass39_1238 = null;
		aClass39_1245 = null;
		aClass39_1243 = null;
		anIntArray395 = null;
		aClass39_1240 = null;
		aClass39_1236 = null;
		anIntArray392 = null;
		aClass39_1246 = null;
		anIntArray394 = null;
		aBooleanArray13 = null;
		aClass39_1242 = null;
		aClass39_1239 = null;
		aClass39_1244 = null;
		aClass39_1247 = null;
		aClass39_1237 = null;
		aClass39_1241 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1819(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static63.aClass45_1);
		arg0.removeMouseMotionListener(Static63.aClass45_1);
		arg0.removeFocusListener(Static63.aClass45_1);
	}
}
