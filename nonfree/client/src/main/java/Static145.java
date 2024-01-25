import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Lclient!fo;")
	public static Class82 aClass82_27;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "[[[Lclient!no;")
	public static Class169[][][] aClass169ArrayArrayArray4;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Lclient!o;")
	public static Class6 aClass6_19;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
	public static int anInt1966;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Z")
	public static boolean aBoolean234;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Z")
	public static boolean aBoolean232 = false;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "[B")
	public static final byte[] aByteArray19 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
	public static int anInt1965 = 0;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString21 = null;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	public static void method1626() {
		for (@Pc(18) Class1_Sub3 local18 = (Class1_Sub3) Static413.aClass227_43.method4967(); local18 != null; local18 = (Class1_Sub3) Static413.aClass227_43.method4973()) {
			if (local18.anInt120 == -1) {
				local18.anInt118 = 0;
				if (local18.anInt126 >= 0 && local18.anInt121 >= 0 && Static296.anInt5187 > local18.anInt126 && Static206.anInt3607 > local18.anInt121) {
					Static416.method5408(local18);
				}
			} else {
				local18.method5915();
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method1627() {
		Static17.aBoolean39 = false;
		Static384.method5031(Static187.anInt3228, Static387.anInt6440, Static413.anInt6778, Static129.anInt2365);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!l;BI)Lclient!za;")
	public static Class34 method1630(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(3) int arg2) {
		return new Class34_Sub1(arg2, arg0, arg1);
	}
}
