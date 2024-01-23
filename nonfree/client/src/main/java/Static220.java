import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public static int anInt4684;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!of;")
	public static Class1_Sub10_Sub3 aClass1_Sub10_Sub3_3;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString328 = "level: ";

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	public static int anInt4691 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method3469() {
		for (@Pc(9) int local9 = 0; local9 < Static242.anInt5012; local9++) {
			@Pc(20) int local20 = Static100.anIntArray223[local9];
			@Pc(24) Class2_Sub4_Sub1 local24 = Static105.aClass2_Sub4_Sub1Array1[local20];
			@Pc(28) int local28 = Static140.aClass1_Sub14_Sub1_2.method2199();
			if ((local28 & 0x4) != 0) {
				local28 += Static140.aClass1_Sub14_Sub1_2.method2199() << 8;
			}
			if ((local28 & 0x2) != 0) {
				local24.aString177 = Static140.aClass1_Sub14_Sub1_2.method2237();
				local24.anInt2836 = 100;
			}
			if ((local28 & 0x20) != 0) {
				local24.anInt2838 = Static140.aClass1_Sub14_Sub1_2.method2238();
				if (local24.anInt2838 == 65535) {
					local24.anInt2838 = -1;
				}
			}
			if ((local28 & 0x200) != 0) {
				local24.anInt2775 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local24.anInt2821 = Static140.aClass1_Sub14_Sub1_2.method2244();
			}
			@Pc(105) int local105;
			@Pc(109) int local109;
			if ((local28 & 0x40) != 0) {
				local105 = Static140.aClass1_Sub14_Sub1_2.method2227();
				local109 = Static140.aClass1_Sub14_Sub1_2.method2241();
				local24.method2091(local105, local109, Static133.anInt3061);
			}
			if ((local28 & 0x100) != 0) {
				local105 = Static140.aClass1_Sub14_Sub1_2.method2229();
				@Pc(130) int[] local130 = new int[local105];
				@Pc(133) int[] local133 = new int[local105];
				@Pc(136) int[] local136 = new int[local105];
				for (@Pc(138) int local138 = 0; local138 < local105; local138++) {
					@Pc(145) int local145 = Static140.aClass1_Sub14_Sub1_2.method2242();
					if (local145 == 65535) {
						local145 = -1;
					}
					local136[local138] = local145;
					local130[local138] = Static140.aClass1_Sub14_Sub1_2.method2229();
					local133[local138] = Static140.aClass1_Sub14_Sub1_2.method2244();
				}
				Static38.method800(local136, local24, local130, local133);
			}
			if ((local28 & 0x8) != 0) {
				@Pc(182) boolean local182 = true;
				local105 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local109 = Static140.aClass1_Sub14_Sub1_2.method2194();
				if (local105 == 65535) {
					local105 = -1;
				}
				if (local105 != -1 && local24.anInt2825 != -1 && Static202.method3231(Static28.method611(local105).anInt3368).anInt967 < Static202.method3231(Static28.method611(local24.anInt2825).anInt3368).anInt967) {
					local182 = false;
				}
				if (local182) {
					local24.anInt2785 = 1;
					local24.anInt2808 = 0;
					local24.anInt2792 = local109 >> 16;
					local24.anInt2837 = 0;
					local24.anInt2786 = (local109 & 0xFFFF) + Static133.anInt3061;
					local24.anInt2825 = local105;
					if (Static133.anInt3061 < local24.anInt2786) {
						local24.anInt2837 = -1;
					}
					if (local24.anInt2825 != -1 && Static133.anInt3061 == local24.anInt2786) {
						@Pc(282) int local282 = Static28.method611(local24.anInt2825).anInt3368;
						if (local282 != -1) {
							@Pc(290) Class32 local290 = Static202.method3231(local282);
							if (local290 != null && local290.anIntArray123 != null) {
								Static154.method2507(false, local24.anInt2846, local24.anInt2794, 0, local290);
							}
						}
					}
				}
			}
			if ((local28 & 0x1) != 0) {
				local105 = Static140.aClass1_Sub14_Sub1_2.method2229();
				local109 = Static140.aClass1_Sub14_Sub1_2.method2199();
				local24.method2091(local105, local109, Static133.anInt3061);
				local24.anInt2769 = Static133.anInt3061 + 300;
				local24.anInt2807 = Static140.aClass1_Sub14_Sub1_2.method2241();
			}
			if ((local28 & 0x80) != 0) {
				if (local24.aClass145_1.method3714()) {
					Static75.method1317(local24);
				}
				local24.method1239(Static197.method3172(Static140.aClass1_Sub14_Sub1_2.method2242()));
				local24.method2089(local24.aClass145_1.anInt4909);
				local24.anInt2797 = local24.aClass145_1.anInt4926;
				local24.anInt2832 = local24.aClass145_1.anInt4933;
				if (local24.aClass145_1.method3714()) {
					Static124.method2029(0, local24, 0, Static185.anInt4085, local24.anIntArray283[0], null, null, local24.anIntArray286[0]);
				}
			}
			if ((local28 & 0x10) != 0) {
				local105 = Static140.aClass1_Sub14_Sub1_2.method2244();
				if (local105 == 65535) {
					local105 = -1;
				}
				local109 = Static140.aClass1_Sub14_Sub1_2.method2199();
				Static167.method2739(local109, local24, local105);
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
	public static void method3470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static2.aClass1_Sub14_Sub1_1.method2252(27);
		Static2.aClass1_Sub14_Sub1_1.method2210(arg0);
		Static2.aClass1_Sub14_Sub1_1.method2228(arg1);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!jk;I)V")
	public static void method3471(@OriginalArg(0) Class1_Sub10 arg0) {
		arg0.aBoolean360 = false;
		if (arg0.aClass1_Sub11_5 != null) {
			arg0.aClass1_Sub11_5.anInt2186 = 0;
		}
		for (@Pc(15) Class1_Sub10 local15 = arg0.method4342(); local15 != null; local15 = arg0.method4339()) {
			method3471(local15);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)V")
	public static void method3473() {
		Static313.aClass89_52.method2273(5);
		Static46.aClass89_8.method2273(5);
		Static141.aClass89_46.method2273(5);
		Static256.aClass89_41.method2273(5);
	}
}
