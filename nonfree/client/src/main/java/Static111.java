import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!ke;")
	public static Class43 aClass43_27;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!qf;")
	public static Class66 aClass66_8;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1055 = Static146.method2172("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!ua;")
	public static Class82 aClass82_43 = new Class82(100);

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1056 = Static146.method2172("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "[I")
	public static int[] anIntArray428 = new int[25];

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "[[S")
	public static short[][] aShortArrayArray8 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method1989() {
		Static84.aClass82_47.method2698();
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public static void method1990() {
		aShortArrayArray8 = null;
		aClass77_1056 = null;
		aClass77_1055 = null;
		aClass66_8 = null;
		aClass82_43 = null;
		anIntArray428 = null;
		anIntArray427 = null;
		aClass43_27 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)Lclient!ah;")
	public static Class2_Sub2_Sub2 method1991(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub2 local12 = (Class2_Sub2_Sub2) Static123.aClass82_44.method2699((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static41.aClass43_Sub1_7.method2205(0, arg0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class2_Sub2_Sub2();
		@Pc(35) Class2_Sub18 local35 = new Class2_Sub18(local22);
		local35.anInt3423 = local35.aByteArray39.length - 12;
		@Pc(44) int local44 = 0;
		@Pc(50) int local50 = local35.method2382();
		local12.anInt255 = local35.method2353();
		local12.anInt254 = local35.method2353();
		local12.anInt256 = local35.method2353();
		local12.anInt253 = local35.method2353();
		local35.anInt3423 = 0;
		local12.aClass77_144 = local35.method2383();
		local12.anIntArray35 = new int[local50];
		local12.anIntArray34 = new int[local50];
		local12.aClass77Array2 = new Class77[local50];
		while (local35.anInt3423 < local35.aByteArray39.length - 12) {
			@Pc(101) int local101 = local35.method2353();
			if (local101 == 3) {
				local12.aClass77Array2[local44] = local35.method2361();
			} else if (local101 >= 100 || local101 == 21 || local101 == 38 || local101 == 39) {
				local12.anIntArray34[local44] = local35.method2387();
			} else {
				local12.anIntArray34[local44] = local35.method2382();
			}
			local12.anIntArray35[local44++] = local101;
		}
		Static123.aClass82_44.method2701((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method1992() {
		Static118.anInt2928 = 99;
		Static129.aByteArrayArrayArray5 = new byte[4][104][104];
		Static1.anIntArray5 = new int[104];
		Static71.anIntArray319 = new int[104];
		Static27.aByteArrayArrayArray2 = new byte[4][104][104];
		Static101.aByteArrayArrayArray4 = new byte[4][104][104];
		Static27.aByteArrayArrayArray1 = new byte[4][105][105];
		Static177.anIntArray633 = new int[104];
		Static101.anIntArray399 = new int[104];
		Static140.anIntArrayArrayArray6 = new int[4][105][105];
		Static148.anIntArray535 = new int[104];
		Static147.aByteArrayArrayArray7 = new byte[4][104][104];
		Static98.anIntArrayArray18 = new int[105][105];
	}
}
