import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
	public static int anInt150;

	@OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!ac", name = "Lb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_52 = Static49.method1293("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Lclient!rf;")
	public static Class70 aClass70_48 = aClass70_52;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
	public static int anInt154 = -2;

	@OriginalMember(owner = "client!ac", name = "ib", descriptor = "Lclient!rf;")
	private static Class70 aClass70_50 = Static49.method1293(" ");

	@OriginalMember(owner = "client!ac", name = "nb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_51 = aClass70_50;

	@OriginalMember(owner = "client!ac", name = "qb", descriptor = "I")
	public static volatile int anInt173 = 0;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
	public static void method161() {
		aClass70_51 = null;
		aClass70_50 = null;
		aClass70_48 = null;
		aClass70_52 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)V")
	public static void method170(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static86.anInt2582; local12++) {
			@Pc(20) Class1_Sub1_Sub4_Sub2_Sub2 local20 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[Static152.anIntArray208[local12]];
			@Pc(29) long local29 = (long) Static152.anIntArray208[local12] << 32 | 0x20000000L;
			if (local20 != null && local20.method1517() && local20.aClass1_Sub1_Sub13_1.aBoolean131 == arg0 && local20.aClass1_Sub1_Sub13_1.method2429()) {
				@Pc(50) int local50 = local20.anInt2030 >> 7;
				@Pc(55) int local55 = local20.anInt2001 >> 7;
				if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
					if (local20.anInt2004 == 1 && (local20.anInt2030 & 0x7F) == 64 && (local20.anInt2001 & 0x7F) == 64) {
						if (Static146.anInt3838 == Static93.anIntArrayArray24[local50][local55]) {
							continue;
						}
						Static93.anIntArrayArray24[local50][local55] = Static146.anInt3838;
					}
					if (!local20.aClass1_Sub1_Sub13_1.aBoolean128) {
						local29 |= Long.MIN_VALUE;
					}
					local20.anInt2049 = Static156.method3142((local20.anInt2004 - 1) * 64 + local20.anInt2030, Static56.anInt1784, local20.anInt2004 * 64 + local20.anInt2001 - 64);
					Static134.method2577(Static56.anInt1784, local20.anInt2030, local20.anInt2001, local20.anInt2049, (local20.anInt2004 - 1) * 64 + 60, local20, local20.anInt2040, local29, local20.aBoolean72);
				}
			}
		}
	}
}
