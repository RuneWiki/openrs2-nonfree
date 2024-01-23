import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Lclient!pa;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_49;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static int anInt5394 = 0;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray44 = new int[5][5000];

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public static int anInt5397 = 0;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "I")
	public static int anInt5398 = -1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method4586() {
		if (Static227.anInt4177 == 0) {
			return;
		}
		try {
			if (++Static314.anInt864 > 2000) {
				if (Static5.aClass97_1 != null) {
					Static5.aClass97_1.method2547();
					Static5.aClass97_1 = null;
				}
				if (Static280.anInt5073 >= 1) {
					Static227.anInt4177 = 0;
					Static178.anInt3427 = -5;
					return;
				}
				Static280.anInt5073++;
				if (Static141.anInt2839 == Static94.anInt3445) {
					Static94.anInt3445 = Static270.anInt4895;
				} else {
					Static94.anInt3445 = Static141.anInt2839;
				}
				Static314.anInt864 = 0;
				Static227.anInt4177 = 1;
			}
			if (Static227.anInt4177 == 1) {
				Static111.aClass185_3 = Static26.aClass154_1.method3892(Static77.aString93, Static94.anInt3445);
				Static227.anInt4177 = 2;
			}
			@Pc(132) int local132;
			if (Static227.anInt4177 == 2) {
				if (Static111.aClass185_3.anInt5276 == 2) {
					throw new IOException();
				}
				if (Static111.aClass185_3.anInt5276 != 1) {
					return;
				}
				Static5.aClass97_1 = new Class97((Socket) Static111.aClass185_3.anObject6, Static26.aClass154_1);
				Static111.aClass185_3 = null;
				Static5.aClass97_1.method2552(Static127.aClass1_Sub14_Sub1_3.anInt1480, Static127.aClass1_Sub14_Sub1_3.aByteArray17);
				if (Static300.aClass28_2 != null) {
					Static300.aClass28_2.method4777();
				}
				if (Static248.aClass28_1 != null) {
					Static248.aClass28_1.method4777();
				}
				local132 = Static5.aClass97_1.method2548();
				if (Static300.aClass28_2 != null) {
					Static300.aClass28_2.method4777();
				}
				if (Static248.aClass28_1 != null) {
					Static248.aClass28_1.method4777();
				}
				if (local132 != 21) {
					Static227.anInt4177 = 0;
					Static178.anInt3427 = local132;
					Static5.aClass97_1.method2547();
					Static5.aClass97_1 = null;
					return;
				}
				Static227.anInt4177 = 3;
			}
			if (Static227.anInt4177 == 3) {
				if (Static5.aClass97_1.method2551() < 1) {
					return;
				}
				Static282.aStringArray39 = new String[Static5.aClass97_1.method2548()];
				Static227.anInt4177 = 4;
			}
			if (Static227.anInt4177 == 4) {
				if (Static5.aClass97_1.method2551() < Static282.aStringArray39.length * 8) {
					return;
				}
				Static13.aClass1_Sub14_Sub1_1.anInt1480 = 0;
				Static5.aClass97_1.method2556(0, Static282.aStringArray39.length * 8, Static13.aClass1_Sub14_Sub1_1.aByteArray17);
				for (local132 = 0; local132 < Static282.aStringArray39.length; local132++) {
					Static282.aStringArray39[local132] = Static8.method120(Static13.aClass1_Sub14_Sub1_1.method1348());
				}
				Static227.anInt4177 = 0;
				Static178.anInt3427 = 21;
				Static5.aClass97_1.method2547();
				Static5.aClass97_1 = null;
				return;
			}
		} catch (@Pc(238) IOException local238) {
			if (Static5.aClass97_1 != null) {
				Static5.aClass97_1.method2547();
				Static5.aClass97_1 = null;
			}
			if (Static280.anInt5073 >= 1) {
				Static178.anInt3427 = -4;
				Static227.anInt4177 = 0;
			} else {
				Static314.anInt864 = 0;
				Static227.anInt4177 = 1;
				if (Static141.anInt2839 == Static94.anInt3445) {
					Static94.anInt3445 = Static270.anInt4895;
				} else {
					Static94.anInt3445 = Static141.anInt2839;
				}
				Static280.anInt5073++;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method4587() {
		Static185.aClass187_96.method4525();
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public static void method4588() {
		Static249.aBoolean307 = false;
		Static163.anInt3253 = 0;
		Static266.anInt4855 = -1;
		Static189.anInt3607 = -1;
		Static165.anInt3261 = -1;
		Static110.anInt2281 = 0;
		Static127.aClass1_Sub14_Sub1_3.anInt1480 = 0;
		Static92.anInt5532 = 0;
		Static88.anInt1723 = 0;
		Static85.anInt1690 = -1;
		Static13.aClass1_Sub14_Sub1_1.anInt1480 = 0;
		Static170.method2898();
		@Pc(33) int local33;
		for (local33 = 0; local33 < Static17.aClass15_Sub5_Sub2Array1.length; local33++) {
			if (Static17.aClass15_Sub5_Sub2Array1[local33] != null) {
				Static17.aClass15_Sub5_Sub2Array1[local33].anInt5581 = -1;
			}
		}
		for (local33 = 0; local33 < Static83.aClass15_Sub5_Sub1Array1.length; local33++) {
			if (Static83.aClass15_Sub5_Sub1Array1[local33] != null) {
				Static83.aClass15_Sub5_Sub1Array1[local33].anInt5581 = -1;
			}
		}
		Static179.method2976();
		Static167.anInt3292 = 1;
		Static65.method1215(30);
		for (local33 = 0; local33 < 100; local33++) {
			aBooleanArray23[local33] = true;
		}
		Static201.method3230();
	}
}
