import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lclient!jd;")
	public static Class117 aClass117_7;

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
	public static int anInt2849;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "[I")
	public static final int[] anIntArray578 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_64 = new Class205(31, 3);

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "[I")
	public static final int[] anIntArray582 = new int[2048];

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lclient!wk;")
	public static final Class246 aClass246_7 = new Class246(32);

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_4 = new Class62(11, 15);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILclient!vc;)V")
	public static void method2665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class63 arg2) {
		Static140.aClass63_4 = arg2;
		Static252.aClass119ArrayArray1 = new Class119[arg1][arg0];
		if (Static48.anIntArray200 != null) {
			Static88.aClass21_1 = Static59.method954(Static48.anIntArray200[1], Static48.anIntArray200[2], Static48.anIntArray200[5], Static48.anIntArray200[0], Static48.anIntArray200[4], Static48.anIntArray200[3]);
		}
		Static79.aClass119_6 = new Class119();
		Static295.method4430();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Lclient!a;")
	public static Class1_Sub1 method2666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub1_2;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Lclient!cu;")
	public static Class41 method2668(@OriginalArg(0) int arg0) {
		@Pc(10) Class41 local10 = (Class41) Static301.aClass160_50.method3599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static253.aClass171_63.method3745(1, arg0);
		local10 = new Class41();
		local10.anInt1049 = arg0;
		if (local22 != null) {
			local10.method871(new Class2_Sub16(local22));
		}
		local10.method868();
		if (local10.anInt1047 == 2 && Static235.aClass246_23.method5613((long) arg0) == null) {
			Static235.aClass246_23.method5609(new Class2_Sub14(Static58.anInt1112), (long) arg0);
			Static195.aClass41Array1[Static58.anInt1112++] = local10;
		}
		Static301.aClass160_50.method3602((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
	public static void method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg0, 11);
		local8.method864();
		local8.anInt1037 = arg2;
		local8.anInt1027 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public static void method2672(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub10_Sub2 local12 = Static217.method3611(arg0, 3);
		local12.method859();
	}
}
