import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!wl;")
	public static Class268 aClass268_1;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_49 = new Class134("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!go", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!go", name = "o", descriptor = "F")
	public static float aFloat23 = 1.0F;

	@OriginalMember(owner = "client!go", name = "p", descriptor = "I")
	public static int anInt2443 = 1;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II[BIII)Z")
	public static boolean method2024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class2_Sub13 local17 = new Class2_Sub13(arg2);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local17.method3594();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(68) int local68;
				@Pc(106) Class192 local106;
				do {
					@Pc(72) int local72;
					@Pc(77) int local77;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method3588();
										if (local39 == 0) {
											continue label70;
										}
										local17.method3580();
									}
									local39 = local17.method3588();
									if (local39 == 0) {
										continue label70;
									}
									local31 += local39 - 1;
									@Pc(54) int local54 = local31 & 0x3F;
									@Pc(60) int local60 = local31 >> 6 & 0x3F;
									local68 = local17.method3580() >> 2;
									local72 = local60 + arg4;
									local77 = local54 + arg3;
								} while (local72 <= 0);
							} while (local77 <= 0);
						} while (local72 >= arg0 - 1);
					} while (local77 >= arg1 - 1);
					local106 = Static50.aClass190_1.method4218(local19);
				} while (local68 == 22 && !Static2.aClass148_Sub1_1.aBoolean254 && local106.anInt5357 == 0 && local106.anInt5337 != 1 && !local106.aBoolean395);
				if (!local106.method4230()) {
					local12 = false;
					Static153.anInt2664++;
				}
				local33 = true;
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!dk;B)I")
	public static int method2026(@OriginalArg(0) Class54 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1131(Static355.anInt6510)) {
			local5++;
		}
		if (arg0.method1131(Static409.anInt6680)) {
			local5++;
		}
		if (arg0.method1131(Static348.anInt5916)) {
			local5++;
		}
		if (arg0.method1131(Static120.anInt2214)) {
			local5++;
		}
		if (arg0.method1131(Static108.anInt2054)) {
			local5++;
		}
		if (arg0.method1131(Static296.anInt4823)) {
			local5++;
		}
		if (arg0.method1131(Static383.anInt6325)) {
			local5++;
		}
		if (arg0.method1131(Static390.anInt6831)) {
			local5++;
		}
		if (arg0.method1131(Static306.anInt5284)) {
			local5++;
		}
		if (arg0.method1131(Static99.anInt1891)) {
			local5++;
		}
		if (arg0.method1131(Static440.anInt7084)) {
			local5++;
		}
		if (arg0.method1131(Static68.anInt4930)) {
			local5++;
		}
		if (arg0.method1131(Static114.anInt2118)) {
			local5++;
		}
		if (arg0.method1131(Static284.anInt4625)) {
			local5++;
		}
		if (arg0.method1131(Static84.anInt1559)) {
			local5++;
		}
		if (arg0.method1131(Static12.anInt170)) {
			local5++;
		}
		return local5;
	}
}
