import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!j", name = "tb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_884 = Static80.method1463("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!j", name = "jb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_883 = aClass63_884;

	@OriginalMember(owner = "client!j", name = "Kb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_887 = Static80.method1463("Loaded wordpack");

	@OriginalMember(owner = "client!j", name = "ub", descriptor = "Lclient!rd;")
	public static Class63 aClass63_885 = aClass63_887;

	@OriginalMember(owner = "client!j", name = "xb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_886 = Static80.method1463(":0");

	@OriginalMember(owner = "client!j", name = "Sb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_888 = Static80.method1463("Weiter");

	@OriginalMember(owner = "client!j", name = "Ub", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)V")
	public static void method1112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class6_Sub3_Sub6 local10 = Static68.method1345(arg1);
		@Pc(17) int local17 = local10.anInt1212;
		@Pc(20) int local20 = local10.anInt1202;
		@Pc(23) int local23 = local10.anInt1214;
		@Pc(30) int local30 = Class6_Sub10.anIntArray191[local23 - local20];
		if (arg0 < 0 || arg0 > local30) {
			arg0 = 0;
		}
		local30 <<= local20;
		Static89.anIntArray283[local17] = local30 & arg0 << local20 | Static89.anIntArray283[local17] & ~local30;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method1114() {
		aClass63_884 = null;
		aClass63_888 = null;
		aClass63_887 = null;
		aClass63_883 = null;
		aClass63_886 = null;
		aClass63_885 = null;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)Lclient!md;")
	public static Class6_Sub3_Sub12 method1124(@OriginalArg(0) int arg0) {
		@Pc(15) Class6_Sub3_Sub12 local15 = (Class6_Sub3_Sub12) Static44.aClass49_13.method1397((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static67.aClass7_37.method110(13, arg0);
		local15 = new Class6_Sub3_Sub12();
		local15.anInt2108 = arg0;
		if (local25 != null) {
			local15.method1414(new Class6_Sub4(local25));
		}
		Static44.aClass49_13.method1396((long) arg0, local15);
		return local15;
	}
}
