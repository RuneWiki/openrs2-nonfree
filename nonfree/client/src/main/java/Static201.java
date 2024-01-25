import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
	public static int anInt4056;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	public static int anInt4057;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "[Lclient!np;")
	public static final Class1_Sub4_Sub20[] aClass1_Sub4_Sub20Array1 = new Class1_Sub4_Sub20[14];

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Lclient!dq;")
	public static final Class38 aClass38_20 = new Class38(8);

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "[Lclient!e;")
	public static final Class41[] aClass41Array1 = new Class41[4];

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "[I")
	public static final int[] anIntArray312 = new int[2048];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method3742(@OriginalArg(1) Class1_Sub7_Sub2 arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static30.anInt698; local8++) {
			@Pc(14) int local14 = Static105.anIntArray179[local8];
			@Pc(18) Class11_Sub2_Sub6_Sub1 local18 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local14];
			@Pc(22) int local22 = arg0.method2132();
			if ((local22 & 0x20) != 0) {
				local22 += arg0.method2132() << 8;
			}
			Static16.method448(arg0, local14, local18, local22);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class180 method3743(@OriginalArg(1) int arg0) {
		@Pc(15) Class180 local15 = (Class180) Static301.aClass21_154.method854((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static152.aClass30_43.method1161(arg0, 4);
		local15 = new Class180();
		if (local25 != null) {
			local15.method4849(arg0, new Class1_Sub7(local25));
		}
		local15.method4846(arg0);
		Static301.aClass21_154.method843(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!gn;BIII)V")
	public static void method3744(@OriginalArg(0) Class71 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) Class1_Sub40 local14 = (Class1_Sub40) Static99.aClass42_13.method1543(); local14 != null; local14 = (Class1_Sub40) Static99.aClass42_13.method1551()) {
			if (local14.anInt6094 == arg1 && local14.anInt6096 == arg3 * 128 && local14.anInt6098 == arg2 * 128 && arg0.anInt2365 == local14.aClass71_1.anInt2365) {
				if (local14.aClass1_Sub6_Sub2_2 != null) {
					Static324.aClass1_Sub6_Sub3_2.method3786(local14.aClass1_Sub6_Sub2_2);
					local14.aClass1_Sub6_Sub2_2 = null;
				}
				if (local14.aClass1_Sub6_Sub2_1 != null) {
					Static324.aClass1_Sub6_Sub3_2.method3786(local14.aClass1_Sub6_Sub2_1);
					local14.aClass1_Sub6_Sub2_1 = null;
				}
				local14.method6045();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILclient!kg;)V")
	public static void method3746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class112 arg2) {
		if (Static243.aClass112_15 != null || Static217.aBoolean322 || (arg2 == null || Static39.method934(arg2) == null)) {
			return;
		}
		Static243.aClass112_15 = arg2;
		Static110.aClass112_8 = Static39.method934(arg2);
		Static311.anInt5651 = 0;
		Static325.anInt5184 = arg0;
		Static359.aBoolean506 = false;
		Static8.anInt235 = arg1;
	}
}
