import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	public static int anInt2948 = 0;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "[J")
	public static final long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "J")
	public static long aLong104 = 0L;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_867 = Static181.method2795(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLclient!od;Lclient!od;)V")
	public static void method2249(@OriginalArg(1) Class2_Sub2_Sub5 arg0, @OriginalArg(2) Class2_Sub2_Sub5 arg1) {
		if (Static120.aBoolean135) {
			Static50.method993(arg0, arg1);
			return;
		}
		if (Static68.anInt1625 == 0 || Static68.anInt1625 == 5) {
			arg1.method1083(Static147.aClass83_1177, 382, 225, 16777215, -1);
			Static126.method2120(230, 233, 304, 34, 9179409);
			Static126.method2120(231, 234, 302, 32, 0);
			Static126.method2138(232, 235, Static46.anInt1125 * 3, 30, 9179409);
			Static126.method2138(Static46.anInt1125 * 3 + 232, 235, 300 - Static46.anInt1125 * 3, 30, 0);
			arg1.method1083(Static206.aClass83_1176, 382, 256, 16777215, -1);
		}
		@Pc(115) short local115;
		@Pc(123) int local123;
		if (Static68.anInt1625 == 20) {
			Static69.aClass29_1.method1184(382 - Static69.aClass29_1.anInt1518 / 2, 271 - Static69.aClass29_1.anInt1517 / 2);
			local115 = 211;
			arg1.method1083(Static206.aClass83_1173, 382, 211, 16776960, 0);
			local123 = local115 + 15;
			arg1.method1083(Static206.aClass83_1174, 382, 226, 16776960, 0);
			@Pc(131) int local131 = local123 + 15;
			arg1.method1083(Static206.aClass83_1168, 382, 241, 16776960, 0);
			@Pc(139) int local139 = local131 + 15;
			@Pc(140) int local140 = local139 + 10;
			arg1.method1100(Static67.method1268(new Class83[] { Static29.aClass83_216, Static136.method1098(Static206.aClass83_1172) }), 272, 266, 16777215, 0);
			@Pc(160) int local160 = local140 + 15;
			arg1.method1100(Static67.method1268(new Class83[] { Static67.aClass83_505, Static206.aClass83_1169.method2391() }), 274, 281, 16777215, 0);
			@Pc(181) int local181 = local160 + 15;
		}
		if (Static68.anInt1625 == 10) {
			Static69.aClass29_1.method1184(202, 171);
			if (Static209.anInt4149 == 0) {
				local115 = 251;
				arg1.method1083(Static130.aClass83_835, 382, 251, 16776960, 0);
				local123 = local115 + 30;
				Static192.aClass29_4.method1184(229, 271);
				arg1.method1099(Static77.aClass83_549, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static192.aClass29_4.method1184(389, 271);
				arg1.method1099(Static11.aClass83_72, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static209.anInt4149 == 2) {
				local115 = 211;
				arg1.method1083(Static206.aClass83_1173, 382, 211, 16776960, 0);
				local123 = local115 + 15;
				arg1.method1083(Static206.aClass83_1174, 382, 226, 16776960, 0);
				local123 += 15;
				arg1.method1083(Static206.aClass83_1168, 382, 241, 16776960, 0);
				local123 += 15;
				local123 += 10;
				@Pc(309) boolean local309;
				if (Static49.anInt1257 == 0 && Static13.anInt386 % 40 < 20 && Static84.aBoolean98) {
					local309 = true;
				} else {
					local309 = false;
				}
				arg1.method1100(Static67.method1268(new Class83[] { Static29.aClass83_216, Static136.method1098(Static206.aClass83_1172), local309 ? Static75.aClass83_540 : Static206.aClass83_1175 }), 272, 266, 16777215, 0);
				local123 += 15;
				if (Static49.anInt1257 == 1 && Static13.anInt386 % 40 < 20 && Static84.aBoolean98) {
					local309 = true;
				} else {
					local309 = false;
				}
				arg1.method1100(Static67.method1268(new Class83[] { Static67.aClass83_505, Static206.aClass83_1169.method2391(), local309 ? Static75.aClass83_540 : Static206.aClass83_1175 }), 274, 281, 16777215, 0);
				local123 += 15;
				Static192.aClass29_4.method1184(229, 301);
				arg1.method1083(Static121.aClass83_816, 302, 326, 16777215, 0);
				Static192.aClass29_4.method1184(389, 301);
				arg1.method1083(Static165.aClass83_979, 462, 326, 16777215, 0);
			} else if (Static209.anInt4149 == 3) {
				arg1.method1083(Static207.aClass83_1183, 382, 211, 16776960, 0);
				local115 = 236;
				arg1.method1083(Static37.aClass83_301, 382, 236, 16777215, 0);
				local123 = local115 + 15;
				arg1.method1083(Static97.aClass83_634, 382, 251, 16777215, 0);
				local123 += 15;
				arg1.method1083(Static117.aClass83_797, 382, 266, 16777215, 0);
				local123 += 15;
				arg1.method1083(Static117.aClass83_794, 382, 281, 16777215, 0);
				Static192.aClass29_4.method1184(309, 301);
				arg1.method1083(Static165.aClass83_979, 382, 326, 16777215, 0);
				local123 += 15;
			}
		}
		if (Static180.anInt3675 != 1) {
			if (Static172.anInt3539 > 0) {
				Static10.method283(Static172.anInt3539);
				Static172.anInt3539 = 0;
			}
			Static69.method1294();
		}
		Static116.aClass29Array5[Static165.aBoolean158 ? 1 : 0].method1184(725, 463);
		if (Static68.anInt1625 <= 5 || Static52.anInt1333 == 2) {
			return;
		}
		if (Static95.aClass29_2 == null) {
			Static95.aClass29_2 = Static88.method1550(Static4.anInt93, Static113.aClass28_Sub1_18);
		}
		if (Static95.aClass29_2 == null) {
			return;
		}
		Static95.aClass29_2.method1184(5, 463);
		arg1.method1083(Static67.method1268(new Class83[] { Static55.aClass83_415, Static46.aClass83_348, Static129.method2179(Static118.anInt2710) }), 55, 478, 16777215, 0);
		if (Static124.aClass44_2 != null) {
			arg0.method1083(Static73.aClass83_535, 55, 492, 16777215, 0);
			return;
		}
		arg0.method1083(Static119.aClass83_806, 55, 492, 16777215, 0);
		return;
	}
}
