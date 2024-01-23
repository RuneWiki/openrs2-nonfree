import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public static int anInt4833;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array11;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!jd;")
	public static Class61 aClass61_90 = new Class61(64);

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1304 = Static231.method3737("Select a world");

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1305 = Static231.method3737(":assistreq:");

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1306 = aClass107_1304;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1307 = Static231.method3737("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public static int anInt4832 = 0;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public static int anInt4834 = 0;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14 = new byte[4][104][104];

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
	public static int anInt4835 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	public static int method3626(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method3627() {
		Static16.method354(Static54.aClass86_1);
		Static191.anInt4238++;
		if (Static151.aBoolean291 && Static185.aBoolean438) {
			@Pc(24) int local24 = Static220.anInt4822;
			local24 -= Static199.anInt4324;
			if (local24 < Static61.anInt1488) {
				local24 = Static61.anInt1488;
			}
			if (local24 + Static54.aClass86_1.anInt3280 > Static61.anInt1488 + Static83.aClass86_5.anInt3280) {
				local24 = Static83.aClass86_5.anInt3280 + Static61.anInt1488 - Static54.aClass86_1.anInt3280;
			}
			@Pc(53) int local53 = Static181.anInt4311;
			@Pc(58) int local58 = local24 - Static171.anInt3710;
			local53 -= Static163.anInt3550;
			if (local53 < Static204.anInt2499) {
				local53 = Static204.anInt2499;
			}
			@Pc(75) int local75 = Static83.aClass86_5.anInt3256 + local24 - Static61.anInt1488;
			@Pc(78) int local78 = Static54.aClass86_1.anInt3272;
			if (Static204.anInt2499 + Static83.aClass86_5.anInt3270 < local53 + Static54.aClass86_1.anInt3270) {
				local53 = Static204.anInt2499 + Static83.aClass86_5.anInt3270 - Static54.aClass86_1.anInt3270;
			}
			@Pc(102) int local102 = local53 - Static177.anInt3840;
			@Pc(110) int local110 = Static83.aClass86_5.anInt3222 + local53 - Static204.anInt2499;
			if (Static54.aClass86_1.anInt3223 < Static191.anInt4238 && (local78 < local58 || local58 < -local78 || local102 > local78 || local102 < -local78)) {
				Static157.aBoolean305 = true;
			}
			@Pc(147) Class1_Sub22 local147;
			if (Static54.aClass86_1.anObjectArray3 != null && Static157.aBoolean305) {
				local147 = new Class1_Sub22();
				local147.anInt3444 = local110;
				local147.aClass86_10 = Static54.aClass86_1;
				local147.anObjectArray33 = Static54.aClass86_1.anObjectArray3;
				local147.anInt3447 = local75;
				Static60.method1156(local147);
			}
			if (Static198.anInt4319 == 0) {
				if (Static157.aBoolean305) {
					if (Static54.aClass86_1.anObjectArray21 != null) {
						local147 = new Class1_Sub22();
						local147.anInt3447 = local75;
						local147.aClass86_9 = Static96.aClass86_6;
						local147.aClass86_10 = Static54.aClass86_1;
						local147.anObjectArray33 = Static54.aClass86_1.anObjectArray21;
						local147.anInt3444 = local110;
						Static60.method1156(local147);
					}
					if (Static96.aClass86_6 != null && Static34.method680(Static54.aClass86_1) != null) {
						Static193.aClass1_Sub26_Sub1_2.method3000(144);
						Static193.aClass1_Sub26_Sub1_2.method2951(Static54.aClass86_1.anInt3239);
						Static193.aClass1_Sub26_Sub1_2.method2934(Static96.aClass86_6.anInt3239);
						Static193.aClass1_Sub26_Sub1_2.method2988(Static96.aClass86_6.anInt3219);
						Static193.aClass1_Sub26_Sub1_2.method2988(Static54.aClass86_1.anInt3219);
					}
				} else if ((Static159.anInt3500 == 1 || Static206.method3282(Static8.anInt259 - 1)) && Static8.anInt259 > 2 || Static157.anInt3442 == 1) {
					Static115.method2004();
				} else if (Static8.anInt259 > 0 || Static157.anInt3442 == 2) {
					Static222.method2962(Static8.anInt259 - 1);
				}
				Static54.aClass86_1 = null;
			}
		} else if (Static191.anInt4238 > 1) {
			Static54.aClass86_1 = null;
		}
	}
}
