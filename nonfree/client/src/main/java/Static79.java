import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "Lclient!wd;")
	public static Class2_Sub12 aClass2_Sub12_4;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
	public static int anInt2057;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public static int anInt2048 = -1;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!kc;")
	public static Class36 aClass36_963 = Static14.method2017("cross");

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_964 = Static14.method2017("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
	public static int anInt2052 = 0;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_965 = Static14.method2017("@gr2@");

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Lclient!kc;")
	private static Class36 aClass36_966 = Static14.method2017("Welcome to RuneScape");

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "Lclient!kc;")
	public static Class36 aClass36_967 = aClass36_966;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method1482() {
		while (true) {
			if (Static92.aClass2_Sub12_Sub1_3.method1419(Static111.anInt2876) >= 27) {
				@Pc(19) int local19 = Static92.aClass2_Sub12_Sub1_3.method1418(15);
				if (local19 != 32767) {
					@Pc(26) boolean local26 = false;
					if (Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local19] == null) {
						local26 = true;
						Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local19] = new Class2_Sub1_Sub4_Sub2_Sub1();
					}
					@Pc(42) Class2_Sub1_Sub4_Sub2_Sub1 local42 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local19];
					Static51.anIntArray316[Static108.anInt2775++] = local19;
					local42.anInt2169 = Static113.anInt2952;
					@Pc(58) int local58 = Static92.aClass2_Sub12_Sub1_3.method1418(5);
					@Pc(65) int local65 = Static33.anIntArray28[Static92.aClass2_Sub12_Sub1_3.method1418(3)];
					if (local58 > 15) {
						local58 -= 32;
					}
					if (local26) {
						local42.anInt2156 = local65;
					}
					@Pc(79) int local79 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
					if (local79 == 1) {
						Static115.anIntArray225[Static55.anInt2714++] = local19;
					}
					local42.aClass2_Sub1_Sub9_1 = Static49.method953(Static92.aClass2_Sub12_Sub1_3.method1418(13));
					@Pc(103) int local103 = Static92.aClass2_Sub12_Sub1_3.method1418(5);
					@Pc(108) int local108 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
					local42.anInt2185 = local42.aClass2_Sub1_Sub9_1.anInt1532;
					local42.anInt2163 = local42.aClass2_Sub1_Sub9_1.anInt1528;
					if (local103 > 15) {
						local103 -= 32;
					}
					local42.anInt2179 = local42.aClass2_Sub1_Sub9_1.anInt1537;
					local42.anInt2161 = local42.aClass2_Sub1_Sub9_1.anInt1547;
					local42.anInt2155 = local42.aClass2_Sub1_Sub9_1.anInt1545;
					local42.anInt2172 = local42.aClass2_Sub1_Sub9_1.anInt1531;
					local42.anInt2195 = local42.aClass2_Sub1_Sub9_1.anInt1525;
					if (local42.anInt2195 == 0) {
						local42.anInt2156 = 0;
					}
					local42.anInt2171 = local42.aClass2_Sub1_Sub9_1.anInt1544;
					local42.anInt2200 = local42.aClass2_Sub1_Sub9_1.anInt1543;
					local42.method1549(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0] + local58, local103 + Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0], local108 == 1);
					continue;
				}
			}
			Static92.aClass2_Sub12_Sub1_3.method1425();
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI[BI)I")
	public static int method1485(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg0; local7++) {
			local5 = Class62.anIntArray314[(local5 ^ arg1[local7]) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method1487() {
		aClass36_967 = null;
		aClass18_1 = null;
		aClass36_964 = null;
		aClass36_966 = null;
		aClass36_965 = null;
		aClass2_Sub12_4 = null;
		aClass36_963 = null;
		aClass2_Sub1_Sub1_Sub3_6 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ac;II)Z")
	public static boolean method1489(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method925(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static11.method223(local8);
			return true;
		}
	}
}
