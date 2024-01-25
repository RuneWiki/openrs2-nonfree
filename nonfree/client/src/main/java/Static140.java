import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!je", name = "K", descriptor = "Lclient!um;")
	public static Class204 aClass204_6;

	@OriginalMember(owner = "client!je", name = "N", descriptor = "I")
	public static int anInt3160 = 0;

	@OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
	public static volatile int anInt3163 = 0;

	@OriginalMember(owner = "client!je", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
	public static void method2776() {
		if (Static281.anInt5703 == 0) {
			return;
		}
		try {
			if (++Static65.anInt1360 > 1500) {
				if (Static131.aClass171_3 != null) {
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
				}
				if (Static325.anInt6396 >= 1) {
					Static68.anInt1533 = -5;
					Static281.anInt5703 = 0;
					return;
				}
				Static281.anInt5703 = 1;
				if (Static109.anInt2399 == Static5.anInt152) {
					Static109.anInt2399 = Static294.anInt3990;
				} else {
					Static109.anInt2399 = Static5.anInt152;
				}
				Static65.anInt1360 = 0;
				Static325.anInt6396++;
			}
			if (Static281.anInt5703 == 1) {
				Static195.aClass51_7 = Static212.aClass120_3.method3227(Static109.anInt2399, Static58.aString36);
				Static281.anInt5703 = 2;
			}
			@Pc(113) int local113;
			if (Static281.anInt5703 == 2) {
				if (Static195.aClass51_7.anInt1229 == 2) {
					throw new IOException();
				}
				if (Static195.aClass51_7.anInt1229 != 1) {
					return;
				}
				Static131.aClass171_3 = new Class171((Socket) Static195.aClass51_7.anObject1, Static212.aClass120_3);
				Static195.aClass51_7 = null;
				Static131.aClass171_3.method4636(Static320.aClass4_Sub7_Sub1_3.aByteArray42, Static320.aClass4_Sub7_Sub1_3.anInt2667);
				if (Static320.aClass39_2 != null) {
					Static320.aClass39_2.method4801();
				}
				if (Static36.aClass39_1 != null) {
					Static36.aClass39_1.method4801();
				}
				local113 = Static131.aClass171_3.method4639();
				if (Static320.aClass39_2 != null) {
					Static320.aClass39_2.method4801();
				}
				if (Static36.aClass39_1 != null) {
					Static36.aClass39_1.method4801();
				}
				if (local113 != 101) {
					Static281.anInt5703 = 0;
					Static68.anInt1533 = local113;
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
					return;
				}
				Static281.anInt5703 = 3;
			}
			if (Static281.anInt5703 == 3 && Static131.aClass171_3.method4638() >= 2) {
				local113 = Static131.aClass171_3.method4639() << 8 | Static131.aClass171_3.method4639();
				Static311.method5230(local113);
				if (Static320.anInt6328 == -1) {
					Static68.anInt1533 = 6;
					Static281.anInt5703 = 0;
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
				} else {
					Static281.anInt5703 = 0;
					Static131.aClass171_3.method4637();
					Static131.aClass171_3 = null;
					Static91.method1633();
				}
			}
		} catch (@Pc(197) IOException local197) {
			if (Static131.aClass171_3 != null) {
				Static131.aClass171_3.method4637();
				Static131.aClass171_3 = null;
			}
			if (Static325.anInt6396 >= 1) {
				Static68.anInt1533 = -4;
				Static281.anInt5703 = 0;
			} else {
				Static281.anInt5703 = 1;
				if (Static109.anInt2399 == Static5.anInt152) {
					Static109.anInt2399 = Static294.anInt3990;
				} else {
					Static109.anInt2399 = Static5.anInt152;
				}
				Static325.anInt6396++;
				Static65.anInt1360 = 0;
			}
		}
	}
}
