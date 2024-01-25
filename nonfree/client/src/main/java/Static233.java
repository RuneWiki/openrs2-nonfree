import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!op", name = "h", descriptor = "Lclient!am;")
	public static Class11 aClass11_96;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString175 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!op", name = "d", descriptor = "[S")
	public static short[] aShortArray73 = new short[256];

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Z")
	public static boolean aBoolean406 = false;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V")
	public static void method3964() {
		@Pc(13) int local13 = Static154.method2989();
		if (local13 == 0) {
			Static173.aByteArrayArrayArray6 = null;
			Static44.method813(0);
		} else if (local13 == 1) {
			Static268.method4656((byte) 0);
			Static44.method813(512);
			if (Static348.aByteArrayArrayArray11 != null) {
				Static90.method1612();
			}
		} else {
			Static268.method4656((byte) (Static230.anInt4802 - 4 & 0xFF));
			Static44.method813(2);
		}
		Static112.anInt2456 = Static279.anInt5645;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)V")
	public static void method3965(@OriginalArg(0) int arg0) {
		if (Static139.anInt3135 == arg0) {
			return;
		}
		if (Static139.anInt3135 == 0) {
			Static260.method4428();
		}
		if (arg0 == 40) {
			Static91.method1633();
		}
		if (arg0 != 40 && Static27.aClass171_1 != null) {
			Static27.aClass171_1.method4637();
			Static27.aClass171_1 = null;
		}
		if (Static139.anInt3135 == 25 || Static139.anInt3135 == 28) {
			Static266.aClass11_113.anInt298 = 2;
			Static112.aClass11_51.anInt298 = 2;
			Static191.aClass11_80.anInt298 = 2;
			Static150.aClass11_148.anInt298 = 2;
			Static54.aClass11_20.anInt298 = 2;
			Static144.aClass11_68.anInt298 = 2;
			Static78.aClass11_39.anInt298 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static19.anInt6738 = 0;
			Static180.anInt3947 = 1;
			Static298.anInt6031 = 0;
			Static339.anInt6678 = 0;
			Static111.anInt2451 = 1;
			Static169.method3178(true);
			Static266.aClass11_113.anInt298 = 1;
			Static112.aClass11_51.anInt298 = 1;
			Static191.aClass11_80.anInt298 = 1;
			Static150.aClass11_148.anInt298 = 1;
			Static54.aClass11_20.anInt298 = 1;
			Static144.aClass11_68.anInt298 = 1;
			Static78.aClass11_39.anInt298 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static149.method2878();
		}
		if (arg0 == 5) {
			Static143.method2800(Static164.aClass92_7, Static292.aClass11_130);
		} else {
			Static101.method2750();
		}
		@Pc(150) boolean local150 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(167) boolean local167 = Static139.anInt3135 == 5 || Static139.anInt3135 == 10 || Static139.anInt3135 == 28;
		if (local150 != local167) {
			if (local150) {
				Static100.anInt2272 = Static83.anInt1764;
				if (Static147.anInt3292 == 0) {
					Static21.method390();
				} else {
					Static69.method1292(Static20.aClass11_9, 255, Static83.anInt1764);
				}
				Static331.aClass93_2.method2439(false);
			} else {
				Static21.method390();
				Static331.aClass93_2.method2439(true);
				if (Static113.aClass66_8 != null) {
					Static113.aClass66_8.method1408();
					Static113.aClass66_8 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static164.aClass92_7.method4450();
		}
		Static139.anInt3135 = arg0;
	}
}
