import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	public static int anInt2882;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "[I")
	public static int[] anIntArray372 = new int[5];

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1290 = Static56.method972("flash3:");

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1288 = aClass5_1290;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1289 = Static56.method972("Unable to connect)3");

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[112];

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1291 = Static56.method972("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1292 = Static56.method972("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1293 = Static56.method972(" )2>");

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1294 = aClass5_1289;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1295 = aClass5_1289;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt2886 = 0;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1296 = aClass5_1292;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1905(@OriginalArg(1) Component arg0) {
		@Pc(10) Method local10 = Static26.aMethod1;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static2.aClass39_1);
		arg0.addFocusListener(Static2.aClass39_1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[B)I")
	public static int method1906(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static35.method685(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([II)V")
	public static synchronized void method1907(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		if (Static106.aBoolean147) {
			local1 = arg1 << 1;
		}
		@Pc(9) int local9 = 0;
		local1 -= 7;
		while (local9 < local1) {
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
		}
		local1 += 7;
		while (local9 < local1) {
			arg0[local9++] = 0;
		}
		if (Static33.aClass3_Sub2_1 != null) {
			Static33.aClass3_Sub2_1.method1378(arg0, 0, arg1);
		}
		Static27.method546(arg1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!ac;)V")
	public static synchronized void method1908(@OriginalArg(1) Class3_Sub2 arg0) {
		Static33.aClass3_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method1909() {
		aClass5_1295 = null;
		aClass5_1292 = null;
		aClass5_1294 = null;
		aClass5_1291 = null;
		aClass5_1290 = null;
		aClass5_1296 = null;
		anIntArray372 = null;
		aClass5_1289 = null;
		aClass5_1288 = null;
		aClass5_1293 = null;
		aBooleanArray25 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	public static synchronized void method1911() {
		if (Static33.aClass3_Sub2_1 != null) {
			Static33.aClass3_Sub2_1.method1380(256);
		}
		Static27.method546(256);
	}
}
