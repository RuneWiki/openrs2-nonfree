import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ja", name = "Q", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array10;

	@OriginalMember(owner = "client!ja", name = "W", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!ja", name = "O", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_69 = new Class85("M", "M", "M", "M");

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
	public static int anInt2846 = 0;

	@OriginalMember(owner = "client!ja", name = "T", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_74 = new Class103();

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "[J")
	public static final long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(IB)Lclient!mc;")
	public static Class5_Sub1_Sub13 method2632(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub1_Sub13 local10 = (Class5_Sub1_Sub13) Static4.aClass122_1.method3177((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static1.aClass93_1.method2410(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static311.method3257(local25);
			Static4.aClass122_1.method3181((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)V")
	public static void method2633(@OriginalArg(1) int arg0) {
		Static51.method834();
		Static76.method1401();
		Static230.method4148(arg0, true);
		Static79.method1422(Static294.aClass93_133, Static236.aClass55_9, Static244.aClass93_93);
		Static171.method3126(Static244.aClass93_93, Static236.aClass55_9);
		Static53.method851(Static132.aClass95Array9);
		Static131.method2330();
		Static300.method5274();
		if (Static278.anInt5495 == 10) {
			Static280.method4870(false);
		} else if (Static278.anInt5495 == 30) {
			Static50.method822(25);
			return;
		} else if (Static278.anInt5495 == 5) {
			Static249.method5573(Static244.aClass93_93, Static236.aClass55_9);
			return;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZZIIII)V")
	public static void method2634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg2 && arg5 == Static53.anInt990 && Static111.anInt2079 == arg4 && (Static322.anInt611 == arg0 || Static288.method5007())) {
			return;
		}
		Static53.anInt990 = arg5;
		Static322.anInt611 = arg0;
		Static111.anInt2079 = arg4;
		if (Static288.method5007()) {
			Static322.anInt611 = 0;
		}
		if (arg3) {
			Static50.method822(28);
		} else {
			Static50.method822(25);
		}
		Static86.method1557(true, Static204.aClass18_3, Static321.aClass85_134.method2020(Static41.anInt726));
		@Pc(48) int local48 = Static172.anInt4394;
		@Pc(50) int local50 = Static12.anInt3797;
		Static172.anInt4394 = (Static53.anInt990 - (Static22.anInt481 >> 4)) * 8;
		Static12.anInt3797 = (Static111.anInt2079 - (Static269.anInt5281 >> 4)) * 8;
		Static233.aClass5_Sub1_Sub6_3 = Static290.method2556(Static53.anInt990 * 8, Static111.anInt2079 * 8);
		Static353.aClass64_3 = null;
		@Pc(80) int local80 = Static172.anInt4394 - local48;
		@Pc(84) int local84 = Static12.anInt3797 - local50;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (arg3) {
			Static133.anInt2579 = 0;
			local88 = (Static22.anInt481 - 1) * 128;
			@Pc(153) int local153 = (Static269.anInt5281 - 1) * 128;
			for (local97 = 0; local97 < 32768; local97++) {
				@Pc(160) Class4_Sub5_Sub2_Sub2 local160 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local97];
				if (local160 != null) {
					local160.anInt6631 -= local80 * 128;
					local160.anInt6632 -= local84 * 128;
					if (local160.anInt6631 >= 0 && local88 >= local160.anInt6631 && local160.anInt6632 >= 0 && local153 >= local160.anInt6632) {
						@Pc(213) boolean local213 = true;
						for (@Pc(215) int local215 = 0; local215 < 10; local215++) {
							local160.anIntArray523[local215] -= local80;
							local160.anIntArray522[local215] -= local84;
							if (local160.anIntArray523[local215] < 0 || local160.anIntArray523[local215] >= Static22.anInt481 || local160.anIntArray522[local215] < 0 || local160.anIntArray522[local215] >= Static269.anInt5281) {
								local213 = false;
							}
						}
						if (local213) {
							Static95.anIntArray160[Static133.anInt2579++] = local97;
						} else {
							Static280.aClass4_Sub5_Sub2_Sub2Array1[local97].method4821(null);
							Static280.aClass4_Sub5_Sub2_Sub2Array1[local97] = null;
						}
					} else {
						Static280.aClass4_Sub5_Sub2_Sub2Array1[local97].method4821(null);
						Static280.aClass4_Sub5_Sub2_Sub2Array1[local97] = null;
					}
				}
			}
		} else {
			for (local88 = 0; local88 < 32768; local88++) {
				@Pc(93) Class4_Sub5_Sub2_Sub2 local93 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local88];
				if (local93 != null) {
					for (local97 = 0; local97 < 10; local97++) {
						local93.anIntArray523[local97] -= local80;
						local93.anIntArray522[local97] -= local84;
					}
					local93.anInt6632 -= local84 * 128;
					local93.anInt6631 -= local80 * 128;
				}
			}
		}
		for (local88 = 0; local88 < 2048; local88++) {
			@Pc(310) Class4_Sub5_Sub2_Sub1 local310 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local88];
			if (local310 != null) {
				for (local97 = 0; local97 < 10; local97++) {
					local310.anIntArray523[local97] -= local80;
					local310.anIntArray522[local97] -= local84;
				}
				local310.anInt6631 -= local80 * 128;
				local310.anInt6632 -= local84 * 128;
			}
		}
		Static239.anInt4811 = arg0;
		Static192.aClass4_Sub5_Sub2_Sub1_2.method4118(false, arg1, Static239.anInt4811, arg6);
		Static303.method5313(local80, local84);
		for (@Pc(377) Class5_Sub22 local377 = (Class5_Sub22) Static28.aClass103_21.method2756(); local377 != null; local377 = (Class5_Sub22) Static28.aClass103_21.method2748()) {
			local377.anInt2675 -= local80;
			local377.anInt2674 -= local84;
			if (local377.anInt2675 < 0 || local377.anInt2674 < 0 || local377.anInt2675 >= Static22.anInt481 || local377.anInt2674 >= Static269.anInt5281) {
				local377.method6005();
			}
		}
		Static139.anInt2692 = 0;
		if (Static224.anInt4437 != 0) {
			Static159.anInt3128 -= local84;
			Static224.anInt4437 -= local80;
		}
		if (arg3) {
			Static103.anInt5457 -= local80;
			Static120.anInt2266 -= local84;
			Static181.anInt3653 -= local80;
			Static21.anInt466 -= local84 * 128;
			Static238.anInt4735 -= local84;
			Static271.anInt5301 -= local80 * 128;
			if (Math.abs(local80) > Static22.anInt481 || Math.abs(local84) > Static269.anInt5281) {
				Static200.method3522();
			}
		} else if (Static53.anInt992 == 4) {
			Static8.anInt184 -= local80 * 128;
			Static311.anInt3611 -= local84 * 128;
			Static348.anInt6696 -= local80 * 128;
			Static213.anInt4128 -= local84 * 128;
		} else {
			Static53.anInt992 = 1;
		}
		Static255.method4515();
		Static309.method5417();
		Static85.aClass103_38.method2751();
		Static114.aClass103_56.method2751();
		Static155.aClass39_4.method802();
		Static277.method4847();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ij;B)V")
	public static void method2636(@OriginalArg(0) Class93 arg0) {
		Static22.aClass93_9 = arg0;
	}
}
