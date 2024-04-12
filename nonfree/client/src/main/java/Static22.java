import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	public static int anInt577;

	@OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
	public static int anInt587;

	@OriginalMember(owner = "client!ec", name = "nb", descriptor = "Lclient!ud;")
	public static Class5 aClass5_8;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V", line = 4)
	public static void method474() {
		Class2_Sub2_Sub4.aClass40_162 = null;
		aClass5_8 = null;
		Class2_Sub2_Sub4.aClass40_161 = null;
		Class2_Sub2_Sub4.aClass40_160 = null;
		Class2_Sub2_Sub4.anIntArrayArray8 = null;
		Class2_Sub2_Sub4.aClass40_164 = null;
		Class2_Sub2_Sub4.aClass40_157 = null;
		Class2_Sub2_Sub4.anIntArray103 = null;
		Class2_Sub2_Sub4.aClass40_158 = null;
		Class2_Sub2_Sub4.aClass40_163 = null;
		Class2_Sub2_Sub4.aClass40_159 = null;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V", line = 104)
	public static void method477() {
		Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1737();
		@Pc(13) int local13 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(8);
		if (Class41.anInt1800 > local13) {
			for (@Pc(18) int local18 = local13; local18 < Class41.anInt1800; local18++) {
				Class30.anIntArray258[Class11.anInt304++] = Class2_Sub2_Sub13.anIntArray326[local18];
			}
		}
		if (Class41.anInt1800 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Class41.anInt1800 = 0;
		for (@Pc(62) int local62 = 0; local62 < local13; local62++) {
			@Pc(68) int local68 = Class2_Sub2_Sub13.anIntArray326[local62];
			@Pc(72) Class2_Sub2_Sub12_Sub1_Sub2 local72 = Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local68];
			@Pc(77) int local77 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(1);
			if (local77 == 0) {
				Class2_Sub2_Sub13.anIntArray326[Class41.anInt1800++] = local68;
				local72.anInt2274 = Class24.anInt2511;
			} else {
				@Pc(97) int local97 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(2);
				if (local97 == 0) {
					Class2_Sub2_Sub13.anIntArray326[Class41.anInt1800++] = local68;
					local72.anInt2274 = Class24.anInt2511;
					Class60.anIntArray504[Class2_Sub9.anInt1190++] = local68;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						Class2_Sub2_Sub13.anIntArray326[Class41.anInt1800++] = local68;
						local72.anInt2274 = Class24.anInt2511;
						local139 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(3);
						local72.method1547(local139, false);
						local149 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(1);
						if (local149 == 1) {
							Class60.anIntArray504[Class2_Sub9.anInt1190++] = local68;
						}
					} else if (local97 == 2) {
						Class2_Sub2_Sub13.anIntArray326[Class41.anInt1800++] = local68;
						local72.anInt2274 = Class24.anInt2511;
						local139 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(3);
						local72.method1547(local139, true);
						local149 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(3);
						local72.method1547(local149, true);
						@Pc(203) int local203 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1743(1);
						if (local203 == 1) {
							Class60.anIntArray504[Class2_Sub9.anInt1190++] = local68;
						}
					} else if (local97 == 3) {
						Class30.anIntArray258[Class11.anInt304++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V", line = 349)
	public static void method480() {
		@Pc(3) int local3 = Static44.anInt1110;
		@Pc(9) int local9 = Static99.anInt2497;
		@Pc(11) int local11 = Static14.anInt1856;
		@Pc(18) int local18 = Static91.anInt120;
		Static25.method1612(local3, local9, local11, local18, 6116423);
		Static25.method1612(local3 + 1, local9 + 1, local11 - 2, 16, 0);
		Static25.method1607(local3 + 1, local9 + 18, local11 - 2, local18 - 19, 0);
		Static13.aClass2_Sub2_Sub2_Sub2_1.method575(Class42.aClass40_524, local3 + 3, local9 + 14, 6116423);
		@Pc(64) int local64 = Class2_Sub5.anInt742;
		@Pc(66) int local66 = Class2_Sub2_Sub15.anInt2394;
		if (Static1.anInt16 == 0) {
			local66 -= 4;
			local64 -= 4;
		}
		if (Static1.anInt16 == 1) {
			local66 -= 205;
			local64 -= 553;
		}
		if (Static1.anInt16 == 2) {
			local66 -= 357;
			local64 -= 17;
		}
		for (@Pc(84) int local84 = 0; local84 < Class2_Sub6.anInt797; local84++) {
			@Pc(99) int local99 = (Class2_Sub6.anInt797 - local84 - 1) * 15 + local9 + 31;
			@Pc(101) int local101 = 16777215;
			if (local64 > local3 && local64 < local3 + local11 && local66 > local99 - 13 && local99 + 3 > local66) {
				local101 = 16776960;
			}
			Static13.aClass2_Sub2_Sub2_Sub2_1.method574(Class15.aClass40Array8[local84], local3 + 3, local99, local101, true);
		}
	}
}
