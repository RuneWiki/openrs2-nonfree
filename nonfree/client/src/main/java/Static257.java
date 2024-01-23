import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	public static int anInt5593;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString182 = "green:";

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method4355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static91.method1593(arg6)) {
			Static189.method3384(arg1, Static81.aClass116ArrayArray1[arg6], arg2, arg3, arg7, arg0, -1, arg4, arg5);
		} else if (arg3 == -1) {
			for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
				Static165.aBooleanArray16[local26] = true;
			}
		} else {
			Static165.aBooleanArray16[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method4356() {
		@Pc(6) int local6 = Static222.aClass1_Sub16_Sub1_3.method2670(8);
		@Pc(21) int local21;
		if (local6 < Static266.anInt5789) {
			for (local21 = local6; local21 < Static266.anInt5789; local21++) {
				Static226.anIntArray516[Static146.anInt3487++] = Static39.anIntArray108[local21];
			}
		}
		if (Static266.anInt5789 < local6) {
			throw new RuntimeException("gppov1");
		}
		Static266.anInt5789 = 0;
		for (local21 = 0; local21 < local6; local21++) {
			@Pc(57) int local57 = Static39.anIntArray108[local21];
			@Pc(61) Class25_Sub1_Sub1 local61 = Static271.aClass25_Sub1_Sub1Array1[local57];
			@Pc(66) int local66 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
			if (local66 == 0) {
				Static39.anIntArray108[Static266.anInt5789++] = local57;
				local61.anInt1658 = Static32.anInt809;
			} else {
				@Pc(89) int local89 = Static222.aClass1_Sub16_Sub1_3.method2670(2);
				if (local89 == 0) {
					Static39.anIntArray108[Static266.anInt5789++] = local57;
					local61.anInt1658 = Static32.anInt809;
					Static95.anIntArray220[Static111.anInt2390++] = local57;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local89 == 1) {
						Static39.anIntArray108[Static266.anInt5789++] = local57;
						local61.anInt1658 = Static32.anInt809;
						local136 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
						local61.method1240(local136, 1);
						local146 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
						if (local146 == 1) {
							Static95.anIntArray220[Static111.anInt2390++] = local57;
						}
					} else if (local89 == 2) {
						Static39.anIntArray108[Static266.anInt5789++] = local57;
						local61.anInt1658 = Static32.anInt809;
						if (Static222.aClass1_Sub16_Sub1_3.method2670(1) == 1) {
							local136 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
							local61.method1240(local136, 2);
							local146 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
							local61.method1240(local146, 2);
						} else {
							local136 = Static222.aClass1_Sub16_Sub1_3.method2670(3);
							local61.method1240(local136, 0);
						}
						local136 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
						if (local136 == 1) {
							Static95.anIntArray220[Static111.anInt2390++] = local57;
						}
					} else if (local89 == 3) {
						Static226.anIntArray516[Static146.anInt3487++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!kb;Lclient!kb;ILclient!kb;Lclient!kb;)V")
	public static void method4357(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(3) Class83 arg2, @OriginalArg(4) Class83 arg3) {
		Static110.aClass83_70 = arg1;
		Static49.aClass83_35 = arg3;
		Static12.aClass83_11 = arg2;
		Static129.aClass83_89 = arg0;
		Static81.aClass116ArrayArray1 = new Class116[Static110.aClass83_70.method2327()][];
		Static15.aBooleanArray1 = new boolean[Static110.aClass83_70.method2327()];
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public static void method4359(@OriginalArg(0) int arg0) {
		if (!Static111.aBoolean136) {
			arg0 = -1;
		}
		if (arg0 == Static139.anInt6137) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class58 local21 = Static5.method102(arg0);
			@Pc(25) Class1_Sub2_Sub14_Sub1 local25 = local21.method1425();
			if (local25 == null) {
				arg0 = -1;
			} else {
				Static43.aClass66_1.method1619(local25.method2486(), local25.anInt3427, Static9.aCanvas1, new Point(local21.anInt1893, local21.anInt1898), local25.anInt3428);
				Static139.anInt6137 = arg0;
			}
		}
		if (arg0 == -1 && Static139.anInt6137 != -1) {
			Static43.aClass66_1.method1619(null, -1, Static9.aCanvas1, new Point(), -1);
			Static139.anInt6137 = -1;
		}
	}
}
