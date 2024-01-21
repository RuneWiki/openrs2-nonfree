import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!cc;")
	public static Class18 aClass18_3;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public static int anInt3629;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1725 = Static187.method3089("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1726 = Static187.method3089("Fps:");

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!j;")
	public static Class1_Sub3_Sub10 method2688(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub3_Sub10 local6 = (Class1_Sub3_Sub10) Static16.aClass47_5.method1281((long) arg0);
		if (local6 != null) {
			return local6;
		}
		local6 = Static191.method3128(arg0, Static71.aClass3_10, Static196.aClass3_37);
		if (local6 != null) {
			Static16.aClass47_5.method1273((long) arg0, local6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Z")
	public static boolean method2691() {
		try {
			return Static181.method2945();
		} catch (@Pc(16) IOException local16) {
			Static150.method2273();
			return true;
		} catch (@Pc(21) Exception local21) {
			@Pc(61) String local61 = "T2 - " + Static177.anInt3812 + "," + Static11.anInt273 + "," + Static153.anInt3183 + " - " + Static63.anInt3562 + "," + (Static100.anInt2141 + Static15.aClass8_Sub3_Sub1_1.anIntArray309[0]) + "," + (Static15.aClass8_Sub3_Sub1_1.anIntArray312[0] + Static138.anInt2800) + " - ";
			for (@Pc(63) int local63 = 0; Static63.anInt3562 > local63 && local63 < 50; local63++) {
				local61 = local61 + Static18.aClass1_Sub14_Sub1_2.aByteArray49[local63] + ",";
			}
			Static61.method998(local21, local61);
			Static126.method1850();
			return true;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIBII)I")
	public static int method2692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class1_Sub3_Sub1_Sub4.anIntArray317[arg0 * 1024 / arg2] >> 1;
		return ((65536 - local21) * arg1 >> 16) + (local21 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLclient!ab;I)Z")
	public static boolean method2693(@OriginalArg(1) Class3 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method3260(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static73.method1116(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!r;Lclient!r;)V")
	public static void method2694(@OriginalArg(1) Class1_Sub3_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) Class1_Sub3_Sub1_Sub3_Sub1 arg1) {
		if (Static36.aBoolean65) {
			Static39.method723(arg0, arg1);
			return;
		}
		if (Static31.anInt748 == 0 || Static31.anInt748 == 5) {
			arg1.method2451(Static49.aClass92_528, 382, 225, 16777215, -1);
			Static46.method3175(230, 233, 304, 34, 9179409);
			Static46.method3175(231, 234, 302, 32, 0);
			Static46.method3173(232, 235, Static144.anInt2892 * 3, 30, 9179409);
			Static46.method3173(Static144.anInt2892 * 3 + 232, 235, 300 - Static144.anInt2892 * 3, 30, 0);
			arg1.method2451(Static88.aClass92_804, 382, 256, 16777215, -1);
		}
		@Pc(91) short local91;
		@Pc(115) int local115;
		if (Static31.anInt748 == 20) {
			local91 = 211;
			Static117.aClass1_Sub3_Sub1_Sub5_2.method3183(382 - Static117.aClass1_Sub3_Sub1_Sub5_2.anInt4204 / 2, -(Static117.aClass1_Sub3_Sub1_Sub5_2.anInt4208 / 2) + 271);
			arg1.method2451(Static88.aClass92_805, 382, 211, 16776960, 0);
			local115 = local91 + 15;
			arg1.method2451(Static88.aClass92_812, 382, 226, 16776960, 0);
			@Pc(123) int local123 = local115 + 15;
			arg1.method2451(Static88.aClass92_803, 382, 241, 16776960, 0);
			@Pc(131) int local131 = local123 + 15;
			@Pc(132) int local132 = local131 + 10;
			arg1.method2443(Static208.method787(new Class92[] { Static118.aClass92_1161, Static130.method2468(Static88.aClass92_813) }), 272, 266, 16777215, 0);
			@Pc(152) int local152 = local132 + 15;
			arg1.method2443(Static208.method787(new Class92[] { Static87.aClass92_787, Static88.aClass92_811.method3240() }), 274, 281, 16777215, 0);
			@Pc(173) int local173 = local152 + 15;
		}
		if (Static31.anInt748 == 10) {
			Static117.aClass1_Sub3_Sub1_Sub5_2.method3183(202, 171);
			if (Static106.anInt2304 == 0) {
				local91 = 251;
				arg1.method2451(Static69.aClass92_643, 382, 251, 16776960, 0);
				local115 = local91 + 30;
				Static172.aClass1_Sub3_Sub1_Sub5_4.method3183(229, 271);
				arg1.method2473(Static93.aClass92_867, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static172.aClass1_Sub3_Sub1_Sub5_4.method3183(389, 271);
				arg1.method2473(Static36.aClass92_390, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static106.anInt2304 == 2) {
				local91 = 211;
				arg1.method2451(Static88.aClass92_805, 382, 211, 16776960, 0);
				local115 = local91 + 15;
				arg1.method2451(Static88.aClass92_812, 382, 226, 16776960, 0);
				local115 += 15;
				arg1.method2451(Static88.aClass92_803, 382, 241, 16776960, 0);
				local115 += 15;
				@Pc(372) boolean local372;
				if (Static124.anInt2613 == 0 && Static155.anInt2981 % 40 < 20 && Static53.aBoolean81) {
					local372 = true;
				} else {
					local372 = false;
				}
				local115 += 10;
				arg1.method2443(Static208.method787(new Class92[] { Static118.aClass92_1161, Static130.method2468(Static88.aClass92_813), local372 ? Static90.aClass92_848 : Static88.aClass92_810 }), 272, 266, 16777215, 0);
				local115 += 15;
				if (Static124.anInt2613 == 1 && Static155.anInt2981 % 40 < 20 && Static53.aBoolean81) {
					local372 = true;
				} else {
					local372 = false;
				}
				arg1.method2443(Static208.method787(new Class92[] { Static87.aClass92_787, Static88.aClass92_811.method3240(), local372 ? Static90.aClass92_848 : Static88.aClass92_810 }), 274, 281, 16777215, 0);
				local115 += 15;
				Static172.aClass1_Sub3_Sub1_Sub5_4.method3183(229, 301);
				arg1.method2451(Static33.aClass92_361, 302, 326, 16777215, 0);
				Static172.aClass1_Sub3_Sub1_Sub5_4.method3183(389, 301);
				arg1.method2451(Static71.aClass92_663, 462, 326, 16777215, 0);
			} else if (Static106.anInt2304 == 3) {
				arg1.method2451(Static96.aClass92_903, 382, 211, 16776960, 0);
				local91 = 236;
				arg1.method2451(Static49.aClass92_529, 382, 236, 16777215, 0);
				local115 = local91 + 15;
				arg1.method2451(Static43.aClass92_463, 382, 251, 16777215, 0);
				local115 += 15;
				arg1.method2451(Static128.aClass92_1250, 382, 266, 16777215, 0);
				local115 += 15;
				arg1.method2451(Static111.aClass92_1074, 382, 281, 16777215, 0);
				local115 += 15;
				Static172.aClass1_Sub3_Sub1_Sub5_4.method3183(309, 301);
				arg1.method2451(Static71.aClass92_663, 382, 326, 16777215, 0);
			}
		}
		if (Static63.anInt3580 != 1) {
			if (Static44.anInt2856 > 0) {
				Static123.method1817(Static44.anInt2856);
				Static44.anInt2856 = 0;
			}
			Static88.method1300();
		}
		Static138.aClass1_Sub3_Sub1_Sub5Array6[Static27.aBoolean40 ? 1 : 0].method3183(725, 463);
		if (Static31.anInt748 <= 5 || Static40.anInt3561 == 2) {
			return;
		}
		if (Static145.aClass1_Sub3_Sub1_Sub5_3 == null) {
			Static145.aClass1_Sub3_Sub1_Sub5_3 = Static31.method573(Static31.anInt759, Static71.aClass3_Sub1_8);
		}
		if (Static145.aClass1_Sub3_Sub1_Sub5_3 == null) {
			return;
		}
		Static145.aClass1_Sub3_Sub1_Sub5_3.method3183(5, 463);
		arg1.method2451(Static208.method787(new Class92[] { Static120.aClass92_1183, Static192.aClass92_1960, Static49.method872(Static183.anInt3929) }), 55, 478, 16777215, 0);
		if (Static61.aClass34_1 == null) {
			arg0.method2451(Static166.aClass92_1678, 55, 492, 16777215, 0);
			return;
		}
		arg0.method2451(Static14.aClass92_132, 55, 492, 16777215, 0);
		return;
	}
}
