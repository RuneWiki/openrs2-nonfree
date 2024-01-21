import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public static int anInt3380;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1250 = Static177.method3050("Lade)3)3)3");

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public static int anInt3378 = 0;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1251 = Static177.method3050(" loggt sich ein)3");

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public static int anInt3381 = 0;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
	public static int[] anIntArray320 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	public static int anInt3383 = 0;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "[S")
	public static final short[] aShortArray44 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	public static int anInt3385 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[Lclient!jd;)[Lclient!jd;")
	public static Class46[] method2489(@OriginalArg(1) Class46[] arg0) {
		@Pc(4) Class46[] local4 = new Class46[5];
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			local4[local11] = Static69.method1482(new Class46[] { Static127.method2240(local11), Static28.aClass46_239 });
			if (arg0 != null && arg0[local11] != null) {
				local4[local11] = Static69.method1482(new Class46[] { local4[local11], arg0[local11] });
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLclient!a;)Lclient!a;")
	public static Class1 method2491(@OriginalArg(1) Class1 arg0) {
		@Pc(3) Class1 local3 = Static183.method1442(arg0);
		if (local3 == null) {
			local3 = arg0.aClass1_1;
		}
		return local3;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(JB)V")
	public static void method2492(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < anInt3385; local12++) {
			if (arg0 == Static84.aLongArray50[local12]) {
				anInt3385--;
				for (@Pc(34) int local34 = local12; local34 < anInt3385; local34++) {
					Static23.aClass46Array4[local34] = Static23.aClass46Array4[local34 + 1];
					Static132.anIntArray294[local34] = Static132.anIntArray294[local34 + 1];
					Static31.aClass46Array6[local34] = Static31.aClass46Array6[local34 + 1];
					Static84.aLongArray50[local34] = Static84.aLongArray50[local34 + 1];
					Static104.anIntArray243[local34] = Static104.anIntArray243[local34 + 1];
				}
				Static122.anInt2963 = Static163.anInt3721;
				Static90.aClass4_Sub11_Sub1_1.method1285(68);
				Static90.aClass4_Sub11_Sub1_1.method1269(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V")
	public static void method2493(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub16 local10 = (Class4_Sub16) Static25.aClass20_1.method505((long) arg0);
		if (local10 != null) {
			local10.method3173();
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IB)[B")
	public static synchronized byte[] method2494(@OriginalArg(0) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static186.anInt4101 > 0) {
			local24 = Static80.aByteArrayArray8[--Static186.anInt4101];
			Static80.aByteArrayArray8[Static186.anInt4101] = null;
			return local24;
		} else if (arg0 == 5000 && Static122.anInt2958 > 0) {
			local24 = Static54.aByteArrayArray7[--Static122.anInt2958];
			Static54.aByteArrayArray7[Static122.anInt2958] = null;
			return local24;
		} else if (arg0 == 30000 && Static57.anInt1405 > 0) {
			local24 = Static106.aByteArrayArray10[--Static57.anInt1405];
			Static106.aByteArrayArray10[Static57.anInt1405] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)I")
	public static int method2495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		return Static182.aClass4_Sub1_Sub16_1 != null && local10 == Static182.aClass4_Sub1_Sub16_1.aLong148 ? Static104.aClass4_Sub11_4.anInt1597 * 99 / (Static104.aClass4_Sub11_4.aByteArray19.length - Static182.aClass4_Sub1_Sub16_1.aByte8) + 1 : 0;
	}
}
