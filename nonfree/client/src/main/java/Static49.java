import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_10;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!md;")
	public static Class50 aClass50_6 = new Class50();

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_731 = Static69.method1153("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!uc;")
	public static Class1_Sub6_Sub1 aClass1_Sub6_Sub1_1 = new Class1_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_732 = Static69.method1153("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	public static volatile int anInt1165 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!id;)Lclient!rd;")
	public static Class64 method888(@OriginalArg(1) Class1_Sub6 arg0) {
		return Static10.method245(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method889() {
		Static94.aClass19_78.method416();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public static void method890() {
		aClass64_732 = null;
		aClass50_6 = null;
		aClass64_731 = null;
		aClass1_Sub1_Sub5_Sub3_10 = null;
		aClass1_Sub6_Sub1_1 = null;
		anIntArray162 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method891() {
		Static99.aClass37_31.method1459();
		Static66.anIntArray234 = Static112.method1980(Static66.anIntArray234);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([Lclient!rd;BII)Lclient!rd;")
	public static Class64 method892(@OriginalArg(0) Class64[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			if (arg0[local9 + arg2] == null) {
				arg0[arg2 + local9] = Static41.aClass64_1694;
			}
			local7 += arg0[arg2 + local9].anInt2086;
		}
		@Pc(45) byte[] local45 = new byte[local7];
		@Pc(47) int local47 = 0;
		@Pc(57) Class64 local57;
		for (@Pc(49) int local49 = 0; local49 < arg1; local49++) {
			local57 = arg0[local49 + arg2];
			Static124.method523(local57.aByteArray24, 0, local45, local47, local57.anInt2086);
			local47 += local57.anInt2086;
		}
		local57 = new Class64();
		local57.anInt2086 = local7;
		local57.aByteArray24 = local45;
		return local57;
	}
}
