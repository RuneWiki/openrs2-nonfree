import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!ne;")
	public static Class4_Sub10 aClass4_Sub10_3;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
	public static int[] anIntArray107;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int anInt967;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_410 = Static134.method2017("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt962 = -2;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
	public static int anInt965 = 0;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_411 = Static134.method2017("blinken2:");

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "[Lclient!sd;")
	public static Class4_Sub4_Sub3_Sub5[] aClass4_Sub4_Sub3_Sub5Array1 = new Class4_Sub4_Sub3_Sub5[4];

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lclient!v;")
	public static Class76 method616(@OriginalArg(0) int arg0) {
		return Static62.aClass76Array14[arg0].method1851() <= 0 ? Static114.aClass76Array26[arg0] : Static59.method1017(new Class76[] { Static114.aClass76Array26[arg0], Static10.aClass76_94, Static62.aClass76Array14[arg0] });
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V")
	public static void method617(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static92.aBooleanArray13[arg0]) {
			return;
		}
		Static31.aClass17_10.method287(arg0);
		if (Static29.aClass4_Sub8ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(36) int local36 = 0; local36 < Static29.aClass4_Sub8ArrayArray1[arg0].length; local36++) {
			if (Static29.aClass4_Sub8ArrayArray1[arg0][local36] != null) {
				if (Static29.aClass4_Sub8ArrayArray1[arg0][local36].anInt473 == 2) {
					local25 = false;
				} else {
					Static29.aClass4_Sub8ArrayArray1[arg0][local36] = null;
				}
			}
		}
		if (local25) {
			Static29.aClass4_Sub8ArrayArray1[arg0] = null;
		}
		Static92.aBooleanArray13[arg0] = false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!v;BILclient!v;Lclient!v;)V")
	public static void method618(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class76 arg2, @OriginalArg(4) Class76 arg3) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static78.anIntArray267[local7] = Static78.anIntArray267[local7 - 1];
			Static35.aClass76Array8[local7] = Static35.aClass76Array8[local7 - 1];
			Static64.aClass76Array16[local7] = Static64.aClass76Array16[local7 - 1];
			Static110.aClass76Array25[local7] = Static110.aClass76Array25[local7 - 1];
		}
		Static78.anIntArray267[0] = arg1;
		Static73.anInt1892++;
		Static35.aClass76Array8[0] = arg3;
		Static64.aClass76Array16[0] = arg0;
		Static110.aClass76Array25[0] = arg2;
		Static97.anInt2253 = Static36.anInt1031;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method619() {
		aClass4_Sub4_Sub3_Sub5Array1 = null;
		aClass4_Sub10_3 = null;
		aByteArrayArray2 = null;
		aClass76_410 = null;
		aClass76_411 = null;
		anIntArray107 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLclient!la;)V")
	public static void method620(@OriginalArg(1) Class17 arg0) {
		Static82.aClass17_26 = arg0;
		Static59.anInt1539 = Static82.aClass17_26.method283(16);
	}
}
