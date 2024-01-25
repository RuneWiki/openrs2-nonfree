import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!kt;")
	public static Class133_Sub1 aClass133_Sub1_1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "I")
	public static int anInt209;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	public static int anInt211;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "I")
	public static int anInt208 = 0;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "I")
	public static int anInt210 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method103(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			local8[local17] = local17 + ": ";
			if (arg0 != null && arg0[local17] != null) {
				local8[local17] = local8[local17] + arg0[local17];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)V")
	public static void method104(@OriginalArg(0) boolean arg0) {
		Static131.method2293();
		if (Static121.anInt6774 != 30 && Static121.anInt6774 != 25) {
			return;
		}
		Static279.anInt5197++;
		if (Static279.anInt5197 < 50 && !arg0) {
			return;
		}
		Static279.anInt5197 = 0;
		if (!Static218.aBoolean316 && Static386.aClass226_4 != null) {
			Static77.method1332(Static322.aClass183_94);
			try {
				Static386.aClass226_4.method5549(Static76.aClass2_Sub24_Sub2_7.anInt6669, Static76.aClass2_Sub24_Sub2_7.aByteArray100);
				Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
			} catch (@Pc(52) IOException local52) {
				Static218.aBoolean316 = true;
			}
		}
		Static131.method2293();
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
	public static void method105() {
		if (Static75.aClass48_3 != null) {
			Static75.aClass48_3.method2479();
			Static73.aClass44_2 = null;
			Static75.aClass48_3 = null;
		}
	}
}
