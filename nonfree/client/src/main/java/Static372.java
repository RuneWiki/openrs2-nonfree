import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "Z")
	public static boolean aBoolean448 = false;

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_130 = new Class211(37, 5);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZB)V")
	public static void method4847(@OriginalArg(0) boolean arg0) {
		for (@Pc(14) Class2_Sub35 local14 = (Class2_Sub35) Static111.aClass156_12.method3155(); local14 != null; local14 = (Class2_Sub35) Static111.aClass156_12.method3150()) {
			if (local14.aClass2_Sub1_Sub3_3 != null) {
				Static421.aClass2_Sub1_Sub4_2.method3237(local14.aClass2_Sub1_Sub3_3);
				local14.aClass2_Sub1_Sub3_3 = null;
			}
			if (local14.aClass2_Sub1_Sub3_4 != null) {
				Static421.aClass2_Sub1_Sub4_2.method3237(local14.aClass2_Sub1_Sub3_4);
				local14.aClass2_Sub1_Sub3_4 = null;
			}
			local14.method5703();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class2_Sub35 local53 = (Class2_Sub35) Static289.aClass156_36.method3155(); local53 != null; local53 = (Class2_Sub35) Static289.aClass156_36.method3150()) {
			if (local53.aClass2_Sub1_Sub3_3 != null) {
				Static421.aClass2_Sub1_Sub4_2.method3237(local53.aClass2_Sub1_Sub3_3);
				local53.aClass2_Sub1_Sub3_3 = null;
			}
			local53.method5703();
		}
		for (@Pc(80) Class2_Sub35 local80 = (Class2_Sub35) Static427.aClass72_47.method1655(); local80 != null; local80 = (Class2_Sub35) Static427.aClass72_47.method1649()) {
			if (local80.aClass2_Sub1_Sub3_3 != null) {
				Static421.aClass2_Sub1_Sub4_2.method3237(local80.aClass2_Sub1_Sub3_3);
				local80.aClass2_Sub1_Sub3_3 = null;
			}
			local80.method5703();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Lclient!re;")
	public static Class212 method4848() {
		try {
			return (Class212) Class.forName("Class212_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
	public static int method4849(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)V")
	public static void method4851(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static266.anInt4392 - Static76.anInt1457;
		if (local7 >= 100) {
			Static414.anInt6776 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static332.aFloat80;
		if (local18 < Static430.anInt6949 >> 8) {
			local18 = Static430.anInt6949 >> 8;
		}
		if (Static138.aBooleanArray11[4] && local18 < Static296.anIntArray416[4] + 128) {
			local18 = Static296.anIntArray416[4] + 128;
		}
		@Pc(55) int local55 = Static121.anInt2227 + (int) Static113.aFloat19 & 0x3FFF;
		Static391.method5007(Static153.anInt2665, arg0, local55, Static133.anInt2393, (local18 >> 3) * 3 + 600 << 0, Static302.method3973(Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833, Static61.anInt1129) - 50, local18);
		@Pc(106) float local106 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static143.anInt2544 = (int) ((float) Static115.anInt2124 + (float) (Static143.anInt2544 - Static115.anInt2124) * local106);
		Static174.anInt3028 = (int) (local106 * (float) (Static174.anInt3028 - Static267.anInt4400) + (float) Static267.anInt4400);
		Static235.anInt3805 = (int) (local106 * (float) (Static235.anInt3805 - Static278.anInt4571) + (float) Static278.anInt4571);
		Static40.anInt771 = (int) ((float) Static49.anInt856 + local106 * (float) (Static40.anInt771 - Static49.anInt856));
		@Pc(159) int local159 = Static310.anInt5375 - Static332.anInt5620;
		if (local159 > 8192) {
			local159 -= 16384;
		} else if (local159 < -8192) {
			local159 += 16384;
		}
		Static310.anInt5375 = (int) ((float) Static332.anInt5620 + local106 * (float) local159);
		Static310.anInt5375 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Z")
	public static boolean method4855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static253.aByteArrayArrayArray11[1][arg0][arg1] & 0x2) != 0;
	}
}
