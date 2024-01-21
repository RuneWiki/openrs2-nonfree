import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
	public static int anInt1702;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Lclient!tg;")
	private static Class81 aClass81_584 = Static120.method2057("Players");

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_579 = aClass81_584;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_580 = Static120.method2057(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_581 = Static120.method2057("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!tg;")
	private static Class81 aClass81_582 = Static120.method2057(" ");

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_583 = aClass81_582;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
	public static void method1230() {
		for (@Pc(1) int local1 = 0; local1 < Static10.anInt233; local1++) {
			@Pc(6) Class75 local6 = Static180.aClass75Array3[local1];
			Static3.method75(local6);
			Static180.aClass75Array3[local1] = null;
		}
		Static10.anInt233 = 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!vb;I)Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 method1231(@OriginalArg(1) Class82 arg0, @OriginalArg(2) int arg1) {
		return Static113.method1997(arg1, arg0) ? Static72.method1260() : null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public static void method1232() {
		aClass81_583 = null;
		aClass81_584 = null;
		aClass1_Sub2_Sub2_Sub4Array5 = null;
		aClass81_579 = null;
		aClass81_582 = null;
		aClass81_580 = null;
		aClass81_581 = null;
	}
}
