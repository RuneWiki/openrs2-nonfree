import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 aClass1_Sub2_Sub8_Sub3_6;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "[I")
	public static final int[] anIntArray356 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "[I")
	public static final int[] anIntArray357 = new int[32];

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1179 = Static81.method1507("glow2:");

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1180 = aClass24_1179;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "[I")
	public static final int[] anIntArray358 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1181 = Static81.method1507("Passwort: ");

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1182 = aClass24_1179;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
	public static int anInt4091 = 0;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1183 = null;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
	public static void method3168() {
		Static162.aClass86_52.method2817();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!dj;I)V")
	public static void method3169(@OriginalArg(0) Class24 arg0) {
		if (Static27.anInt728 >= 2) {
			@Pc(13) int local13;
			@Pc(33) int local33;
			if (arg0.method771(Static117.aClass24_778)) {
				for (local13 = 0; local13 < 10; local13++) {
					System.gc();
				}
				@Pc(23) Runtime local23 = Runtime.getRuntime();
				local33 = (int) ((local23.totalMemory() - local23.freeMemory()) / 1024L);
				Static200.method3377(Static63.method1281(new Class24[] { Static55.aClass24_378, Static175.method3020(local33), Static41.aClass24_366 }), 0, null);
			}
			if (arg0.method771(Static109.aClass24_737)) {
				Static147.method2537();
			}
			if (arg0.method771(Static114.aClass24_761)) {
				Static43.aBoolean61 = true;
			}
			if (arg0.method771(Static71.aClass24_527)) {
				Static43.aBoolean61 = false;
			}
			arg0.method771(Static79.aClass24_571);
			arg0.method771(Static32.aClass24_217);
			if (arg0.method771(Static176.aClass24_1324)) {
				for (local13 = 0; local13 < 4; local13++) {
					for (@Pc(102) int local102 = 1; local102 < 103; local102++) {
						for (local33 = 1; local33 < 103; local33++) {
							Static66.aClass93Array1[local13].anIntArrayArray33[local102][local33] = 0;
						}
					}
				}
			}
			if (arg0.method764(Static133.aClass24_896) && Static212.anInt4707 != 0) {
				Static152.method2595(arg0.method773(6).method772());
			}
			if (arg0.method771(Static144.aClass24_952) && Static212.anInt4707 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method764(Static52.aClass24_356)) {
				Static93.anInt2158 = arg0.method773(12).method780().method772();
				Static200.method3377(Static63.method1281(new Class24[] { Static76.aClass24_559, Static175.method3020(Static93.anInt2158) }), 0, null);
			}
			if (arg0.method771(Static99.aClass24_661)) {
				Static134.aBoolean140 = true;
			}
		}
		Static176.aClass1_Sub7_Sub1_34.method2808(95);
		Static176.aClass1_Sub7_Sub1_34.method2753(arg0.method781() - 1);
		Static176.aClass1_Sub7_Sub1_34.method2757(arg0.method773(2));
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I")
	public static int method3170(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!ve;Lclient!ve;II)Lclient!gb;")
	public static Class1_Sub2_Sub8_Sub1_Sub1 method3171(@OriginalArg(1) Class69 arg0, @OriginalArg(2) Class69 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return Static149.method2564(arg3, arg2, arg0) ? Static5.method109(arg1.method2208(arg3, arg2)) : null;
	}
}
