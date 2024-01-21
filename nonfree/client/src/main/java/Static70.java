import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt2003;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_15;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1048 = Static80.method1463("M");

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1049 = Static80.method1463("invback");

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!mb;")
	public static Class49 aClass49_19 = new Class49(20);

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1050 = Static80.method1463(" has logged in)3");

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1051 = aClass63_1050;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
	public static int anInt2011 = 0;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1052 = Static80.method1463("mapback");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZLclient!ge;)Lclient!cd;")
	public static Class6_Sub3_Sub3_Sub1 method1362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class7 arg2) {
		return Static76.method1433(arg0, arg2, arg1) ? Static46.method991() : null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)V")
	public static void method1363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static23.aClass6_Sub4_Sub1_4.method1347(242);
		Static23.aClass6_Sub4_Sub1_4.method1317(arg0);
		Static23.aClass6_Sub4_Sub1_4.method1298(arg1);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1364() {
		aClass49_19 = null;
		aClass63_1052 = null;
		aClass63_1051 = null;
		aClass63_1048 = null;
		aClass6_Sub3_Sub3_Sub3_15 = null;
		aClass63_1049 = null;
		aClass63_1050 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIZ)Lclient!rd;")
	public static Class63 method1365(@OriginalArg(1) int arg0) {
		return Static54.method1094(arg0, true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!ga;")
	public static Class29 method1366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(15) Class local15 = Class.forName("Class29_Sub1");
			@Pc(19) Class29 local19 = (Class29) local15.getDeclaredConstructor().newInstance();
			local19.method1429(arg1, arg2, arg0);
			return local19;
		} catch (@Pc(28) Throwable local28) {
			@Pc(32) Class29_Sub2 local32 = new Class29_Sub2();
			local32.method1429(arg1, arg2, arg0);
			return local32;
		}
	}
}
