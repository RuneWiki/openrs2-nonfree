import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "j", descriptor = "Lclient!el;")
	public static Class1_Sub4_Sub2 aClass1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Lclient!ga;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "Lclient!el;")
	public static Class1_Sub4_Sub2 aClass1_Sub4_Sub2_2;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Lclient!lc;")
	public static Class79 aClass79_1 = new Class79(64);

	@OriginalMember(owner = "client!am", name = "c", descriptor = "[I")
	public static int[] anIntArray45 = new int[2];

	@OriginalMember(owner = "client!am", name = "e", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!am", name = "i", descriptor = "I")
	public static int anInt509 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public static void method230() {
		Static266.aClass79_41.method2489();
		Static222.aClass79_34.method2489();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public static void method231() {
		while (true) {
			if (Static58.aClass1_Sub13_Sub1_1.method1824(Static149.anInt3579) >= 27) {
				@Pc(12) int local12 = Static58.aClass1_Sub13_Sub1_1.method1826(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					if (Static36.aClass9_Sub1_Sub2Array2[local12] == null) {
						Static36.aClass9_Sub1_Sub2Array2[local12] = new Class9_Sub1_Sub2();
						local17 = true;
					}
					@Pc(33) Class9_Sub1_Sub2 local33 = Static36.aClass9_Sub1_Sub2Array2[local12];
					Static142.anIntArray260[Static16.anInt4955++] = local12;
					local33.anInt484 = Static156.anInt3722;
					if (local33.aClass45_1 != null && local33.aClass45_1.method1459()) {
						Static9.method183(local33);
					}
					@Pc(60) int local60 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
					local33.method223(Static155.method2756(Static58.aClass1_Sub13_Sub1_1.method1826(14)));
					@Pc(74) int local74 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
					if (local74 == 1) {
						Static126.anIntArray244[Static253.anInt3818++] = local12;
					}
					@Pc(94) int local94 = Static34.anIntArray78[Static58.aClass1_Sub13_Sub1_1.method1826(3)];
					if (local17) {
						local33.anInt418 = local33.anInt419 = local94;
					}
					@Pc(107) int local107 = Static58.aClass1_Sub13_Sub1_1.method1826(5);
					@Pc(112) int local112 = Static58.aClass1_Sub13_Sub1_1.method1826(5);
					if (local107 > 15) {
						local107 -= 32;
					}
					if (local112 > 15) {
						local112 -= 32;
					}
					local33.method212(local33.aClass45_1.anInt2021);
					local33.anInt404 = local33.aClass45_1.anInt2004;
					if (local33.anInt404 == 0) {
						local33.anInt419 = 0;
					}
					local33.anInt432 = local33.aClass45_1.anInt2027;
					local33.method206(local33.method208(), local60 == 1, local107 + Static83.aClass9_Sub1_Sub1_1.anIntArray41[0], local112 + Static83.aClass9_Sub1_Sub1_1.anIntArray43[0]);
					if (local33.aClass45_1.method1459()) {
						Static117.method2319(local33, 0, local33.anIntArray43[0], Static137.anInt3321, local33.anIntArray41[0], null, null);
					}
					continue;
				}
			}
			Static58.aClass1_Sub13_Sub1_1.method1821();
			return;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Lclient!tj;")
	public static Class1_Sub2_Sub18 method232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class1_Sub2_Sub18 local11 = (Class1_Sub2_Sub18) Static250.aClass140_18.method4014((long) arg0 | (long) arg1 << 32);
		if (local11 == null) {
			local11 = new Class1_Sub2_Sub18(arg1, arg0);
			Static250.aClass140_18.method4011(local11, local11.aLong184);
		}
		return local11;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method234(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static169.method2944(Static93.method2008(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
