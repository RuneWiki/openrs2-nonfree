import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1926 = Static122.method531("leuchten1:");

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
	public static volatile int anInt3536 = 0;

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "[Lclient!nf;")
	public static Class3_Sub1_Sub4_Sub7_Sub1[] aClass3_Sub1_Sub4_Sub7_Sub1Array1 = new Class3_Sub1_Sub4_Sub7_Sub1[2048];

	@OriginalMember(owner = "client!ub", name = "Y", descriptor = "[Lclient!cb;")
	public static Class13_Sub1[] aClass13_Sub1Array1 = new Class13_Sub1[256];

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "Lclient!b;")
	public static Class7 aClass7_26 = new Class7(64);

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
	public static int anInt3544 = 0;

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array24 = new Class73[500];

	@OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1927 = Static122.method531("jolt");

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	public static void method2567() {
		aClass7_26 = null;
		aClass73_1927 = null;
		aClass13_Sub1Array1 = null;
		aClass73_1926 = null;
		aClass73Array24 = null;
		aClass3_Sub1_Sub4_Sub7_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IJ)V")
	public static void method2568(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(13) InterruptedException local13) {
		}
	}
}
