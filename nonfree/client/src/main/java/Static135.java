import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_6;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public static int anInt3817;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_966 = Static8.method128("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!rc;")
	public static Class66 aClass66_17 = new Class66(64);

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public static int anInt3816 = 0;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5 = new int[4][105][105];

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!ea;")
	public static Class18 aClass18_967 = null;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!fd;IZ)V")
	public static void method2593(@OriginalArg(0) Class21 arg0, @OriginalArg(2) boolean arg1) {
		if (Static97.aClass21_4 != null) {
			try {
				Static97.aClass21_4.method1029();
			} catch (@Pc(8) Exception local8) {
			}
			Static97.aClass21_4 = null;
		}
		Static97.aClass21_4 = arg0;
		Static12.method3146(arg1);
		Static46.anInt4762 = 0;
		Static109.aClass1_Sub6_4 = null;
		Static94.aClass1_Sub6_3.anInt839 = 0;
		Static127.aClass1_Sub1_Sub13_1 = null;
		while (true) {
			@Pc(33) Class1_Sub1_Sub13 local33 = (Class1_Sub1_Sub13) Static37.aClass14_3.method563();
			if (local33 == null) {
				while (true) {
					local33 = (Class1_Sub1_Sub13) Static114.aClass14_6.method563();
					if (local33 == null) {
						if (Static153.aByte7 != 0) {
							try {
								@Pc(85) Class1_Sub6 local85 = new Class1_Sub6(4);
								local85.method530(4);
								local85.method530(Static153.aByte7);
								local85.method531(0);
								Static97.aClass21_4.method1024(local85.aByteArray3, 4);
							} catch (@Pc(106) IOException local106) {
								try {
									Static97.aClass21_4.method1029();
								} catch (@Pc(111) Exception local111) {
								}
								Static97.aClass21_4 = null;
								Static122.anInt3468++;
							}
						}
						Static126.anInt3633 = 0;
						Static127.aLong106 = Static146.method2771();
						return;
					}
					Static10.aClass77_1.method2926(local33);
					Static173.aClass14_15.method570(local33, local33.aLong139);
					Static143.anInt3960++;
					Static100.anInt2935--;
				}
			}
			Static16.aClass14_1.method570(local33, local33.aLong139);
			Static78.anInt2403--;
			Static88.anInt2735++;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method2594() {
		anIntArrayArrayArray5 = null;
		aClass1_Sub1_Sub8_Sub3_6 = null;
		aClass18_967 = null;
		aClass18_966 = null;
		aClass66_17 = null;
	}
}
