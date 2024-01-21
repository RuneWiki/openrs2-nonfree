import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!lf;")
	public static Class3_Sub3_Sub2 aClass3_Sub3_Sub2_2;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!tb;")
	public static Class44 aClass44_31;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!de;")
	public static Class17 aClass17_2;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!oa;")
	private static Class56 aClass56_769 = Static33.method650(" seconds)3");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_767 = aClass56_769;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!oa;")
	private static Class56 aClass56_768 = Static33.method650("Loaded textures");

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public static int anInt1392 = 0;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Lclient!oa;")
	private static Class56 aClass56_770 = Static33.method650("No response from server)3");

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_771 = aClass56_768;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	public static int anInt1395 = 0;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!oa;")
	public static Class56 aClass56_772 = aClass56_770;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[J")
	public static long[] aLongArray14 = new long[100];

	@OriginalMember(owner = "client!i", name = "s", descriptor = "I")
	public static int anInt1397 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method881() {
		if (Static52.anInt1510 == 0) {
			return;
		}
		@Pc(18) int local18 = 0;
		if (Static106.anInt2633 != 0) {
			local18 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
			if (Static119.aClass56Array19[local27] != null) {
				@Pc(37) int local37 = Static125.anIntArray337[local27];
				@Pc(41) Class56 local41 = Static54.aClass56Array5[local27];
				if (local41 != null && local41.method1428(Static41.aClass56_654)) {
					local41 = local41.method1417(5);
				}
				if (local41 != null && local41.method1428(Static44.aClass56_694)) {
					local41 = local41.method1417(5);
				}
				if ((local37 == 3 || local37 == 7) && (local37 == 7 || Static46.anInt2266 == 0 || Static46.anInt2266 == 1 && Static108.method1824(local41))) {
					@Pc(89) int local89 = 329 - local18 * 13;
					if (Static36.anInt1021 > 4 && local89 - 10 < Static102.anInt3222 + -4 && Static102.anInt3222 - 4 <= local89 - -3) {
						@Pc(135) int local135 = Static80.aClass3_Sub1_Sub1_Sub1_4.method745(Static84.method1524(new Class56[] { Static94.aClass56_1336, Static15.aClass56_214, local41, Static119.aClass56Array19[local27] })) + 25;
						if (local135 > 450) {
							local135 = 450;
						}
						if (local135 + 4 > Static36.anInt1021) {
							if (Static29.anInt868 >= 1) {
								Static97.method1702(0, Static61.aClass56_954, 2004, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local41 }), 0);
							}
							Static97.method1702(0, Static86.aClass56_1242, 2057, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local41 }), 0);
							Static97.method1702(0, Static76.aClass56_1107, 2018, 0, Static84.method1524(new Class56[] { Static123.aClass56_1664, local41 }), 0);
						}
					}
					local18++;
					if (local18 >= 5) {
						return;
					}
				}
				if ((local37 == 5 || local37 == 6) && Static46.anInt2266 < 2) {
					local18++;
					if (local18 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Z")
	public static boolean method883() {
		@Pc(5) Class10 local5 = Static119.aClass10_1;
		synchronized (Static119.aClass10_1) {
			if (Static26.anInt763 == Static12.anInt304) {
				return false;
			} else {
				Static36.anInt1019 = Static1.anIntArray1[Static26.anInt763];
				Static3.anInt3130 = Static126.anIntArray330[Static26.anInt763];
				Static26.anInt763 = Static26.anInt763 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public static void method884() {
		aLongArray14 = null;
		aClass56_772 = null;
		aClass56_771 = null;
		aClass56_768 = null;
		aClass44_31 = null;
		aClass56_769 = null;
		aClass56_767 = null;
		aCRC32_1 = null;
		aClass3_Sub3_Sub2_2 = null;
		aClass56_770 = null;
		aClass17_2 = null;
	}
}
