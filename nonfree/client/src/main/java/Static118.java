import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "Lclient!ac;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array9;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Z")
	public static boolean aBoolean123;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
	public static int anInt2719;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array22 = new Class25[200];

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1324 = Static78.method1313("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1325 = Static78.method1313("Konfig geladen)3");

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1326 = Static78.method1313("Enter name of friend to add to list");

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1327 = aClass25_1326;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1329 = Static78.method1313("Continue");

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1328 = aClass25_1329;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1332 = Static78.method1313("glow2:");

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1330 = aClass25_1332;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1331 = aClass25_1332;

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array23 = new Class25[100];

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "[[I")
	public static int[][] anIntArrayArray29 = new int[104][104];

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
	public static int anInt2717 = 500;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
	public static int anInt2718 = -1;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method1901() {
		aClass25_1326 = null;
		aClass25_1328 = null;
		aClass25_1329 = null;
		aClass25Array23 = null;
		aClass1_Sub2_Sub2_Sub1Array9 = null;
		anIntArrayArray29 = null;
		aClass25Array22 = null;
		aClass25_1324 = null;
		aClass4_1 = null;
		aClass25_1327 = null;
		aClass25_1331 = null;
		aClass25_1330 = null;
		aClass25_1332 = null;
		aBigInteger2 = null;
		aClass25_1325 = null;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public static void method1903() {
		Static93.aClass63_17.method1513();
		Static58.aClass63_8.method1513();
		Static94.aClass63_18.method1513();
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method1906() {
		if (Static65.anInt1449 == 0) {
			return;
		}
		@Pc(11) Class1_Sub2_Sub2_Sub3 local11 = Static42.aClass1_Sub2_Sub2_Sub3_1;
		@Pc(13) int local13 = 0;
		if (Static105.anInt2386 != 0) {
			local13 = 1;
		}
		for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
			if (Static97.aClass25Array20[local19] != null) {
				@Pc(31) int local31 = Static122.anIntArray495[local19];
				@Pc(33) byte local33 = 0;
				@Pc(37) Class25 local37 = aClass25Array23[local19];
				if (local37 != null && local37.method797(Static77.aClass25_810)) {
					local33 = 1;
					local37 = local37.method794(5);
				}
				if (local37 != null && local37.method797(Static38.aClass25_448)) {
					local37 = local37.method794(5);
					local33 = 2;
				}
				@Pc(91) int local91;
				if ((local31 == 3 || local31 == 7) && (local31 == 7 || Static80.anInt1785 == 0 || Static80.anInt1785 == 1 && Static31.method704(local37))) {
					local91 = 329 - local13 * 13;
					local13++;
					local11.method1180(Static10.aClass25_141, 4, local91 - 1, 65535, 0);
					@Pc(109) int local109 = local11.method1187(Static10.aClass25_141) + 4;
					local109 += local11.method1201(32);
					if (local33 == 1) {
						Static80.aClass1_Sub2_Sub2_Sub4Array5[0].method1953(local109, local91 - 12);
						local109 += 14;
					}
					if (local33 == 2) {
						Static80.aClass1_Sub2_Sub2_Sub4Array5[1].method1953(local109, local91 - 12);
						local109 += 14;
					}
					local11.method1180(Static116.method1859(new Class25[] { local37, Static74.aClass25_739, Static97.aClass25Array20[local19] }), local109, local91 - 1, 65535, 0);
					if (local13 >= 5) {
						return;
					}
				}
				if (local31 == 5 && Static80.anInt1785 < 2) {
					local91 = 329 - local13 * 13;
					local13++;
					local11.method1180(Static97.aClass25Array20[local19], 4, local91 - 1, 65535, 0);
					if (local13 >= 5) {
						return;
					}
				}
				if (local31 == 6 && Static80.anInt1785 < 2) {
					local91 = 329 - local13 * 13;
					local13++;
					local11.method1180(Static116.method1859(new Class25[] { Static1.aClass25_17, Static70.aClass25_631, local37, Static74.aClass25_739, Static97.aClass25Array20[local19] }), 4, local91 - 1, 65535, 0);
					if (local13 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I")
	public static int method1908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg2;
		@Pc(28) int local28 = Static85.method1416(local7, local17);
		@Pc(35) int local35 = Static85.method1416(local7 + 1, local17);
		@Pc(42) int local42 = Static85.method1416(local7, local17 + 1);
		@Pc(51) int local51 = Static85.method1416(local7 + 1, local17 - -1);
		@Pc(58) int local58 = Static59.method1062(local13, local28, arg0, local35);
		@Pc(65) int local65 = Static59.method1062(local13, local42, arg0, local51);
		return Static59.method1062(local23, local58, arg0, local65);
	}
}
