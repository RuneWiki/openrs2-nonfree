import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "[Lclient!ge;")
	public static Class7_Sub1[] aClass7_Sub1Array1;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString296 = null;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IJIILjava/lang/String;Ljava/lang/String;SI)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6) {
		if (Static259.aBoolean280 || Static230.anInt5417 >= 500) {
			return;
		}
		Static8.aStringArray3[Static230.anInt5417] = arg3;
		Static174.aStringArray33[Static230.anInt5417] = arg4;
		Static170.anIntArray299[Static230.anInt5417] = arg0 == -1 ? Static266.anInt5558 : arg0;
		Static57.aShortArray26[Static230.anInt5417] = arg5;
		Static84.aLongArray14[Static230.anInt5417] = arg1;
		Static216.anIntArray379[Static230.anInt5417] = arg2;
		Static161.anIntArray281[Static230.anInt5417] = arg6;
		Static230.anInt5417++;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)I")
	public static int method3320(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local31 | local31 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BIIII)V")
	public static void method3321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static255.anInt5426; local7++) {
			if (arg0 < Static67.anIntArray143[local7] + Static141.anIntArray178[local7] && Static141.anIntArray178[local7] < arg2 + arg0 && arg3 < Static165.anIntArray291[local7] + Static76.anIntArray156[local7] && Static165.anIntArray291[local7] < arg1 + arg3) {
				Static198.aBooleanArray19[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!lk;Lclient!lk;)V")
	public static void method3322(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg0.aClass1_Sub2_59 != null) {
			arg0.method4198();
		}
		arg0.aClass1_Sub2_58 = arg1.aClass1_Sub2_58;
		arg0.aClass1_Sub2_59 = arg1;
		arg0.aClass1_Sub2_59.aClass1_Sub2_58 = arg0;
		arg0.aClass1_Sub2_58.aClass1_Sub2_59 = arg0;
	}
}
