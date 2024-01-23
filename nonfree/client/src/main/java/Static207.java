import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!uf", name = "fb", descriptor = "I")
	public static int anInt4426;

	@OriginalMember(owner = "client!uf", name = "vb", descriptor = "Lclient!aa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!uf", name = "wb", descriptor = "I")
	public static int anInt4438;

	@OriginalMember(owner = "client!uf", name = "Y", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1526 = Static64.method1101(": ");

	@OriginalMember(owner = "client!uf", name = "ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1527 = Static64.method1101("<col=ff0000>");

	@OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
	public static int anInt4424 = 2;

	@OriginalMember(owner = "client!uf", name = "db", descriptor = "[I")
	public static int[] anIntArray330 = new int[25];

	@OriginalMember(owner = "client!uf", name = "eb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1528 = Static64.method1101("document)3cookie=(R");

	@OriginalMember(owner = "client!uf", name = "qb", descriptor = "Lclient!ie;")
	public static Class53 aClass53_27 = new Class53(50);

	@OriginalMember(owner = "client!uf", name = "sb", descriptor = "Lclient!sc;")
	public static Class102 aClass102_21 = new Class102(4096);

	@OriginalMember(owner = "client!uf", name = "tb", descriptor = "Z")
	public static boolean aBoolean201 = true;

	@OriginalMember(owner = "client!uf", name = "ub", descriptor = "I")
	public static int anInt4437 = 0;

	@OriginalMember(owner = "client!uf", name = "xb", descriptor = "I")
	public static int anInt4439 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!s;[BIB)V")
	public static void method3437(@OriginalArg(0) Class100 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub12 local7 = new Class1_Sub12();
		local7.aClass100_32 = arg0;
		local7.anInt1479 = 0;
		local7.aByteArray15 = arg1;
		local7.aLong170 = arg2;
		@Pc(26) Class105 local26 = Static28.aClass105_4;
		synchronized (Static28.aClass105_4) {
			Static28.aClass105_4.method3119(local7);
		}
		Static42.method3755();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLclient!mb;)V")
	public static void method3438(@OriginalArg(1) Class70 arg0) {
		Static177.aClass70_36 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)V")
	public static void method3439(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class104[] local7 = Static36.aClass104Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class104 local15 = local7[local9];
			if (local15 != null && local15.anInt4003 == 2) {
				Static191.method3195(arg2 >> 1, (local15.anInt4002 - Static198.anInt4217 << 7) + local15.anInt4009, arg3 >> 1, (local15.anInt4014 - Static118.anInt2541 << 7) + local15.anInt4000, local15.anInt4012 * 2);
				if (Static106.anInt2355 > -1 && Static109.anInt2430 % 20 < 10) {
					Static5.aClass1_Sub2_Sub1Array12[local15.anInt3999].method2064(arg1 + Static106.anInt2355 - 12, arg0 - -Static203.anInt4210 - 28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)V")
	public static void method3440(@OriginalArg(0) int arg0) {
		if (!Static54.method933(arg0)) {
			return;
		}
		@Pc(14) Class71[] local14 = Static64.aClass71ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class71 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2793 = 0;
				local22.anInt2818 = 0;
			}
		}
	}
}
