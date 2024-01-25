import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array9;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "[I")
	public static int[] anIntArray754;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_84 = new Class205(15, -2);

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public static int anInt3829 = 2;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)Z")
	public static boolean method3518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static96.aByteArrayArrayArray8[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public static void method3520() {
		if (Static111.aClass63_3.method2005()) {
			Static322.method4781();
			Static111.aClass63_3.method1993(Static257.aCanvas4);
			Static240.method3873();
		} else {
			Static150.method2787(Static62.anInt1261);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V")
	public static void method3521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static159.anInt3048 == 1) {
			Static164.aClass18Array8[Static103.anInt2136 / 100].method4558(Static369.anInt6248 - 8, Static106.anInt2302 + -8);
		}
		if (Static159.anInt3048 == 2) {
			Static164.aClass18Array8[Static103.anInt2136 / 100 + 4].method4558(Static369.anInt6248 - 8, Static106.anInt2302 - 8);
		}
		Static328.method4849();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V")
	public static void method3522(@OriginalArg(0) long arg0) {
		Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
		Static372.aClass2_Sub16_Sub2_4.method5358(Static320.aClass17_7.anInt444);
		Static372.aClass2_Sub16_Sub2_4.method5368(arg0);
		Static349.anInt4698 = 1;
		Static100.anInt2067 = 0;
		Static93.anInt1906 = 0;
		Static106.anInt2303 = -3;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIZI)V")
	public static void method3524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static9.anInt252 = arg5;
		Static235.anInt4192 = arg1;
		Static169.anInt3235 = arg2;
		Static217.anInt3930 = arg0;
		Static240.anInt4284 = arg3;
		if (arg4 && Static240.anInt4284 >= 100) {
			Static224.anInt4006 = Static217.anInt3930 * 128 + 64;
			Static51.anInt1057 = Static235.anInt4192 * 128 + 64;
			Static285.anInt4940 = Static170.method3006(Static224.anInt4006, Static51.anInt1057, Static382.anInt6523) - Static169.anInt3235;
		}
		Static79.anInt4624 = 2;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3525(@OriginalArg(0) String arg0) {
		if (Static79.aStringArray120 == null) {
			Static38.method688();
		}
		@Pc(18) String[] local18 = Static104.method2176('\n', arg0);
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			for (@Pc(24) int local24 = Static89.anInt1712; local24 > 0; local24--) {
				Static79.aStringArray120[local24] = Static79.aStringArray120[local24 - 1];
			}
			Static79.aStringArray120[0] = local18[local20];
			if (Static79.aStringArray120.length - 1 > Static89.anInt1712) {
				Static89.anInt1712++;
				if (Static337.anInt5767 > 0) {
					Static337.anInt5767++;
				}
			}
		}
	}
}
