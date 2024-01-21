import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public static int anInt1092;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5 aClass1_Sub3_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!bh;")
	public static Class15 aClass15_3;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_426 = Static187.method3089("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_430 = Static187.method3089("Hidden");

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!vd;")
	public static Class92 aClass92_427 = aClass92_430;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_428 = Static187.method3089("Freie Welt");

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_429 = Static187.method3089("Einloggen");

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	public static int anInt1096 = 0;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_431 = Static187.method3089("(Y<)4col>");

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
	public static final int[] anIntArray85 = new int[256];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public static void method733(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static156.aBoolean183) {
			Static39.method720();
		} else if (arg0 != -1 && (arg0 != Static170.anInt3548 || !Static77.method1167()) && Static22.anInt552 != 0 && !Static156.aBoolean183) {
			Static93.method1364(arg0, Static22.anInt552, Static166.aClass3_Sub1_23);
		}
		Static170.anInt3548 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ab;I)V")
	public static void method734(@OriginalArg(0) Class3 arg0) {
		Static92.aClass3_17 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ab;III)Z")
	public static boolean method736(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3265(arg2, arg1);
		if (local5 == null) {
			return false;
		} else {
			Static73.method1116(local5);
			return true;
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
	public static void method737() {
		Static87.aByteArrayArrayArray20 = null;
		Static185.anIntArray328 = null;
		Static34.aByteArrayArrayArray8 = null;
		Static12.anIntArrayArrayArray1 = null;
		Static183.aByteArrayArrayArray46 = null;
		Static191.aByteArrayArrayArray50 = null;
		Static55.anIntArray109 = null;
		Static79.anIntArray140 = null;
		Static103.aByteArrayArrayArray26 = null;
		Static78.anIntArray137 = null;
		Static119.anIntArray191 = null;
	}
}
