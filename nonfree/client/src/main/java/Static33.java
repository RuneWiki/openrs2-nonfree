import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ge", name = "Mb", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_4;

	@OriginalMember(owner = "client!ge", name = "Ob", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_8;

	@OriginalMember(owner = "client!ge", name = "bc", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_9;

	@OriginalMember(owner = "client!ge", name = "Eb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_564 = Static15.method178("");

	@OriginalMember(owner = "client!ge", name = "Fb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_565 = Static15.method178("gelb:");

	@OriginalMember(owner = "client!ge", name = "Jb", descriptor = "Lclient!ba;")
	public static Class5 aClass5_30 = new Class5(50);

	@OriginalMember(owner = "client!ge", name = "Kb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_566 = Static15.method178("Trade)4compete");

	@OriginalMember(owner = "client!ge", name = "Xb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_573 = Static15.method178(" seconds)3");

	@OriginalMember(owner = "client!ge", name = "Lb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_567 = aClass23_573;

	@OriginalMember(owner = "client!ge", name = "Nb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_568 = Static15.method178("skill)2");

	@OriginalMember(owner = "client!ge", name = "Pb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_569 = aClass23_566;

	@OriginalMember(owner = "client!ge", name = "Qb", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!ge", name = "Rb", descriptor = "I")
	public static int anInt1047 = 0;

	@OriginalMember(owner = "client!ge", name = "Sb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_570 = Static15.method178(" )2> @cya@");

	@OriginalMember(owner = "client!ge", name = "Tb", descriptor = "I")
	public static volatile int anInt1048 = 0;

	@OriginalMember(owner = "client!ge", name = "Ub", descriptor = "Lclient!gd;")
	public static Class23 aClass23_571 = Static15.method178("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ge", name = "Vb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_572 = Static15.method178("m");

	@OriginalMember(owner = "client!ge", name = "Wb", descriptor = "J")
	public static long aLong26 = 0L;

	@OriginalMember(owner = "client!ge", name = "Yb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_574 = Static15.method178("gr-Un:");

	@OriginalMember(owner = "client!ge", name = "Zb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_575 = aClass23_568;

	@OriginalMember(owner = "client!ge", name = "ac", descriptor = "I")
	public static int anInt1049 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!rb;I)Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 method567(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1) {
		return Static36.method738(arg0, arg1) ? Static70.method1137() : null;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
	public static void method568() {
		aClass23_571 = null;
		aClass23_568 = null;
		aClass23_572 = null;
		aClass23_574 = null;
		aClass55_Sub1_4 = null;
		aClass23_570 = null;
		aClass23_567 = null;
		aClass1_Sub1_Sub6_Sub3_9 = null;
		aClass1_Sub1_Sub6_Sub3_8 = null;
		aClass23_565 = null;
		aClass23_566 = null;
		aClass23_564 = null;
		aClass5_30 = null;
		aClass23_573 = null;
		aClass23_575 = null;
		aClass23_569 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!wd;")
	public static RuntimeException_Sub1 method569(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString8 = local9.aString8 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
