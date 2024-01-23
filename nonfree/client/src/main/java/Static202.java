import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "Z")
	public static boolean aBoolean193;

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
	public static int anInt4286 = 0;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
	public static int anInt4289 = 0;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "[I")
	public static int[] anIntArray326 = new int[32768];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BJ)Lclient!ia;")
	public static Class51 method3323(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(23) long local23 = arg0;
			@Pc(25) int local25 = 0;
			while (local23 != 0L) {
				local25++;
				local23 /= 37L;
			}
			@Pc(40) byte[] local40 = new byte[local25];
			while (arg0 != 0L) {
				@Pc(43) long local43 = arg0;
				arg0 /= 37L;
				local25--;
				local40[local25] = Static180.aByteArray42[(int) (local43 - arg0 * 37L)];
			}
			@Pc(75) Class51 local75 = new Class51();
			local75.aByteArray17 = local40;
			local75.anInt1858 = local40.length;
			return local75;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)Z")
	public static boolean method3325(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)I")
	public static int method3326() {
		return Static158.anInt3440;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)V")
	public static void method3327(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static201.anInt4259 >= 100 && Static106.anInt2351 != 1 || Static201.anInt4259 >= 200) {
			Static164.method2798(0, Static24.aClass51_195, Static81.aClass51_607);
			return;
		}
		@Pc(33) Class51 local33 = method3323(arg0).method1437();
		for (@Pc(35) int local35 = 0; local35 < Static201.anInt4259; local35++) {
			if (Static20.aLongArray3[local35] == arg0) {
				Static164.method2798(0, Static150.method2574(new Class51[] { local33, Static17.aClass51_138 }), Static81.aClass51_607);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static113.anInt2474; local66++) {
			if (arg0 == Static181.aLongArray11[local66]) {
				Static164.method2798(0, Static150.method2574(new Class51[] { Static201.aClass51_1458, local33, Static50.aClass51_362 }), Static81.aClass51_607);
				return;
			}
		}
		if (local33.method1426(Static73.aClass5_Sub1_Sub1_1.aClass51_619)) {
			Static164.method2798(0, Static122.aClass51_971, Static81.aClass51_607);
			return;
		}
		Static113.aClass51Array15[Static201.anInt4259] = local33;
		Static20.aLongArray3[Static201.anInt4259] = arg0;
		Static144.anIntArray215[Static201.anInt4259] = 0;
		Static33.aClass51Array6[Static201.anInt4259] = Static81.aClass51_607;
		Static191.anIntArray312[Static201.anInt4259] = 0;
		Static78.aBooleanArray12[Static201.anInt4259] = false;
		Static201.anInt4259++;
		Static99.anInt2154 = Static27.anInt651;
		Static167.aClass1_Sub16_Sub1_2.method3823(159);
		Static167.aClass1_Sub16_Sub1_2.method3786(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!qe;I)I")
	public static int method3328(@OriginalArg(0) Class5_Sub1_Sub2 arg0) {
		@Pc(2) Class27 local2 = arg0.aClass27_1;
		if (local2.anIntArray51 != null) {
			local2 = local2.method594();
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(27) int local27 = local2.anInt813;
		if (arg0.anInt3620 == arg0.anInt3618) {
			local27 = local2.anInt817;
		} else if (arg0.anInt3620 == arg0.anInt3591) {
			local27 = local2.anInt803;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
	public static void method3329() {
		Static11.aClass53_1.method1498();
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)V")
	public static void method3330() {
		Static80.aClass53_16.method1496(5);
	}
}
