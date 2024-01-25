import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
	public static int anInt606 = 0;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString38 = "red:";

	@OriginalMember(owner = "client!bl", name = "T", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_3 = new Class66(64);

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "(I)V")
	public static void method609() {
		@Pc(5) Class66 local5 = Static75.aClass66_29;
		synchronized (Static75.aClass66_29) {
			Static75.aClass66_29.method1942();
		}
		local5 = Static35.aClass66_8;
		synchronized (Static35.aClass66_8) {
			Static35.aClass66_8.method1942();
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)V")
	public static void method610(@OriginalArg(0) int arg0) {
		Static173.method3937();
		Static302.method5138();
		@Pc(12) int local12 = Static177.method2205(arg0).anInt1732;
		if (local12 == 0) {
			return;
		}
		@Pc(19) int local19 = Static69.anIntArray80[arg0];
		if (local12 == 6) {
			Static238.anInt4610 = local19;
		}
		if (local12 == 9) {
			Static148.anInt3014 = local19;
		}
		if (local12 == 5) {
			Static305.anInt5879 = local19;
		}
	}

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)V")
	public static void method611() {
		Static177.method2209(Static335.anInt6338);
		@Pc(20) int local20 = (Static263.anInt5063 >> 3) + (Static347.anInt6472 >> 10);
		@Pc(28) int local28 = (Static28.anInt773 >> 3) + (Static347.anInt6471 >> 10);
		Static139.anIntArray529 = new int[18];
		Static287.anIntArray415 = new int[18];
		Static55.anIntArray63 = new int[18];
		Static27.aByteArrayArray19 = new byte[18][];
		Static129.aByteArrayArray6 = new byte[18][];
		Static49.aByteArrayArray4 = new byte[18][];
		Static249.anIntArray376 = new int[18];
		Static210.aByteArrayArray21 = new byte[18][];
		Static228.anIntArray321 = new int[18];
		Static338.anIntArray283 = new int[18];
		Static19.anIntArrayArray2 = new int[18][4];
		Static353.aByteArrayArray25 = new byte[18][];
		@Pc(75) int local75 = 0;
		@Pc(95) int local95;
		for (@Pc(84) int local84 = (local20 - (Static266.anInt5101 >> 4)) / 8; local84 <= ((Static266.anInt5101 >> 4) + local20) / 8; local84++) {
			for (local95 = (local28 - (Static339.anInt6352 >> 4)) / 8; local95 <= (local28 + (Static339.anInt6352 >> 4)) / 8; local95++) {
				@Pc(103) int local103 = local95 + (local84 << 8);
				Static338.anIntArray283[local75] = local103;
				Static139.anIntArray529[local75] = Static2.aClass170_1.method4555("m" + local84 + "_" + local95);
				Static55.anIntArray63[local75] = Static2.aClass170_1.method4555("l" + local84 + "_" + local95);
				Static249.anIntArray376[local75] = Static2.aClass170_1.method4555("n" + local84 + "_" + local95);
				Static228.anIntArray321[local75] = Static2.aClass170_1.method4555("um" + local84 + "_" + local95);
				Static287.anIntArray415[local75] = Static2.aClass170_1.method4555("ul" + local84 + "_" + local95);
				if (Static249.anIntArray376[local75] == -1) {
					Static139.anIntArray529[local75] = -1;
					Static55.anIntArray63[local75] = -1;
					Static228.anIntArray321[local75] = -1;
					Static287.anIntArray415[local75] = -1;
				}
				local75++;
			}
		}
		for (local95 = local75; local95 < Static249.anIntArray376.length; local95++) {
			Static249.anIntArray376[local95] = -1;
			Static139.anIntArray529[local95] = -1;
			Static55.anIntArray63[local95] = -1;
			Static228.anIntArray321[local95] = -1;
			Static287.anIntArray415[local95] = -1;
		}
		Static214.method3768(local28, 8, true, 8, false, 0, local20);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBII)V")
	public static void method612(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(14) Class6 local14 = Static115.aClass6ArrayArray1[arg1][arg0];
		Static96.method4350(local14 == null ? Static38.aClass6_2 : local14, 5000);
	}
}
