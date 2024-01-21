import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ca", name = "Lb", descriptor = "I")
	private static int anInt612 = 0;

	@OriginalMember(owner = "client!ca", name = "Xb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_174 = Static81.method1507("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([Lclient!dj;I)[Lclient!dj;")
	public static Class24[] method475(@OriginalArg(0) Class24[] arg0) {
		@Pc(6) Class24[] local6 = new Class24[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = Static63.method1281(new Class24[] { Static175.method3020(local8), Static16.aClass24_118 });
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = Static63.method1281(new Class24[] { local6[local8], arg0[local8] });
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(BIII)V")
	public static void method477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static110.method1903(arg2)) {
			Static9.method230(arg1, Static4.aClass98ArrayArray3[arg2], -1, arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lclient!m;")
	public static Class1_Sub2_Sub15 method478(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub15 local10 = (Class1_Sub2_Sub15) Static67.aClass86_22.method2816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static26.aClass69_4.method2208(3, arg0);
		local10 = new Class1_Sub2_Sub15();
		if (local20 != null) {
			local10.method2012(new Class1_Sub7(local20));
		}
		Static67.aClass86_22.method2821(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
	public static void method479() {
		if (Static116.aBooleanArray11[98]) {
			Static94.anInt2170 += (12 - Static94.anInt2170) / 2;
		} else if (Static116.aBooleanArray11[99]) {
			Static94.anInt2170 += (-Static94.anInt2170 - 12) / 2;
		} else {
			Static94.anInt2170 /= 2;
		}
		Static57.anInt1425 += Static94.anInt2170 / 2;
		if (Static116.aBooleanArray11[96]) {
			anInt612 += (-anInt612 - 24) / 2;
		} else if (Static116.aBooleanArray11[97]) {
			anInt612 += (24 - anInt612) / 2;
		} else {
			anInt612 /= 2;
		}
		@Pc(84) int local84 = Static198.anInt4435 + Static87.aClass5_Sub2_Sub1_1.anInt2501;
		Static66.anInt1655 += anInt612 / 2;
		@Pc(103) int local103 = Static29.anInt759 + Static87.aClass5_Sub2_Sub1_1.anInt2448;
		if (Static89.anInt2083 - local84 < -500 || Static89.anInt2083 - local84 > 500 || Static159.anInt3548 - local103 < -500 || Static159.anInt3548 - local103 > 500) {
			Static89.anInt2083 = local84;
			Static159.anInt3548 = local103;
		}
		if (local103 != Static159.anInt3548) {
			Static159.anInt3548 += (local103 - Static159.anInt3548) / 16;
		}
		if (local84 != Static89.anInt2083) {
			Static89.anInt2083 += (local84 - Static89.anInt2083) / 16;
		}
		Static61.method1192();
	}
}
