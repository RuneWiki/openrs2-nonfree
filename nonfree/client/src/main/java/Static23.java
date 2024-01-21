import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "Lclient!jd;")
	public static Class37 aClass37_11;

	@OriginalMember(owner = "client!e", name = "ib", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!e", name = "yb", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!e", name = "Ib", descriptor = "Lclient!gb;")
	public static Class1_Sub1_Sub5_Sub1 aClass1_Sub1_Sub5_Sub1_3;

	@OriginalMember(owner = "client!e", name = "Nb", descriptor = "Lclient!re;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_422 = Static69.method1153("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
	public static int anInt698 = 1;

	@OriginalMember(owner = "client!e", name = "gb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_423 = Static69.method1153("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_424 = Static69.method1153("Titelbild geladen)3");

	@OriginalMember(owner = "client!e", name = "kb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_425 = Static69.method1153("(U4");

	@OriginalMember(owner = "client!e", name = "mb", descriptor = "I")
	public static int anInt702 = 0;

	@OriginalMember(owner = "client!e", name = "nb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_426 = Static69.method1153("Connection timed out)3");

	@OriginalMember(owner = "client!e", name = "ob", descriptor = "Lclient!rd;")
	private static Class64 aClass64_427 = Static69.method1153("Click to continue");

	@OriginalMember(owner = "client!e", name = "pb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_428 = aClass64_427;

	@OriginalMember(owner = "client!e", name = "tb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_429 = Static69.method1153(" @whi@(X");

	@OriginalMember(owner = "client!e", name = "wb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_430 = Static69.method1153("bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!e", name = "zb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_431 = aClass64_426;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V")
	public static void method447() {
		aClass64_430 = null;
		aClass64_425 = null;
		aClass64_427 = null;
		aClass64_422 = null;
		aClass64_424 = null;
		aClass1_Sub1_Sub5_Sub1_3 = null;
		anIntArray95 = null;
		aClass64_426 = null;
		aClass64_431 = null;
		anIntArrayArray5 = null;
		aClass64_429 = null;
		aClass1_Sub2_Sub2_1 = null;
		aClass37_11 = null;
		aClass64_428 = null;
		aClass64_423 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)Z")
	public static boolean method453(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
	public static void method454() {
		Static94.aClass19_79.method416();
		Static91.aClass19_74.method416();
		Static10.aClass19_18.method416();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[Lclient!rd;)[Lclient!rd;")
	public static Class64[] method457(@OriginalArg(1) Class64[] arg0) {
		@Pc(4) Class64[] local4 = new Class64[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local4[local15] = Static82.method1383(new Class64[] { Static12.method1395(local15), Static114.aClass64_1751 });
			if (arg0 != null && arg0[local15] != null) {
				local4[local15] = Static82.method1383(new Class64[] { local4[local15], arg0[local15] });
			}
		}
		return local4;
	}
}
