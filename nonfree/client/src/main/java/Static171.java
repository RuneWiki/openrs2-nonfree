import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	public static int anInt3468 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
	public static void method2963() {
		Static375.anInt6459 = -1;
		Static502.anInt9931 = 0;
		Static248.anInt4780 = -1;
		Static583.anInt9512 = -1;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)V")
	public static void method2964(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub7_Sub17 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class91 local8 = Static124.aClass91Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static389.anInt6693; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static595.anInt9881; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static326.anInt5713;
							@Pc(32) int local32 = local12 << Static326.anInt5713;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class91 local41 = Static124.aClass91Array1[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7447(local12, local15) - local41.method7447(local12, local15);
									@Pc(71) int local71 = local8.method7447(local12, local15 + 1) - local41.method7447(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7447(local12 + 1, local15 + 1) - local41.method7447(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7447(local12 + 1, local15) - local41.method7447(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
	public static void method2966(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static272.aString43 = arg1;
		Static55.aString12 = arg2;
		Static203.aBoolean495 = arg0;
		if (!Static203.aBoolean495 && (Static55.aString12.equals("") || Static272.aString43.equals(""))) {
			Static520.method7232(3);
			return;
		}
		if (Static639.anInt10307 != 1) {
			Static279.anInt5112 = 0;
			Static110.anInt2384 = -1;
		}
		Static236.aBoolean321 = false;
		Static520.method7232(-3);
		Static360.anInt6253 = 1;
		Static467.anInt10427 = 0;
		Static140.anInt2975 = 0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V")
	public static void method2967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static43.method1103(local7.aClass16_Sub1_Sub4_1);
		Static43.method1103(local7.aClass16_Sub1_Sub4_2);
		if (local7.aClass16_Sub1_Sub4_1 != null) {
			local7.aClass16_Sub1_Sub4_1 = null;
		}
		if (local7.aClass16_Sub1_Sub4_2 != null) {
			local7.aClass16_Sub1_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BII)Z")
	public static boolean method2970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
