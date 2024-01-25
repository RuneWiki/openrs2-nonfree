import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
	public static int anInt8965;

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
	public static int anInt8967;

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
	public static int anInt8964 = -1;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIIII)V")
	public static void method7604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static134.method2372(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg5;
		@Pc(27) int local27 = -arg5;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (Static549.anInt5294 <= arg3 && Static334.anInt5381 >= arg3) {
			@Pc(52) int[] local52 = Static118.anIntArrayArray7[arg3];
			local61 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 - arg5);
			local69 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg5 + arg0);
			local78 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 - local15);
			local87 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 + local15);
			Static202.method3077(local52, local61, arg4, local78);
			Static202.method3077(local52, local78, arg1, local87);
			Static202.method3077(local52, local87, arg4, local69);
		}
		while (local24 > local10) {
			local34 += 2;
			local36 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static405.anIntArray483[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(204) int local204;
			@Pc(213) int local213;
			@Pc(220) int[] local220;
			@Pc(151) int local151;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local151 = arg3 - local24;
				local61 = arg3 + local24;
				if (local61 >= Static549.anInt5294 && Static334.anInt5381 >= local151) {
					if (local24 < local15) {
						local69 = Static405.anIntArray483[local24];
						local78 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 + local10);
						local87 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 - local10);
						local204 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, local69 + arg0);
						local213 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 - local69);
						if (local61 <= Static334.anInt5381) {
							local220 = Static118.anIntArrayArray7[local61];
							Static202.method3077(local220, local87, arg4, local213);
							Static202.method3077(local220, local213, arg1, local204);
							Static202.method3077(local220, local204, arg4, local78);
						}
						if (local151 >= Static549.anInt5294) {
							local220 = Static118.anIntArrayArray7[local151];
							Static202.method3077(local220, local87, arg4, local213);
							Static202.method3077(local220, local213, arg1, local204);
							Static202.method3077(local220, local204, arg4, local78);
						}
					} else {
						local69 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, local10 + arg0);
						local78 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 - local10);
						if (Static334.anInt5381 >= local61) {
							Static202.method3077(Static118.anIntArrayArray7[local61], local78, arg4, local69);
						}
						if (local151 >= Static549.anInt5294) {
							Static202.method3077(Static118.anIntArrayArray7[local151], local78, arg4, local69);
						}
					}
				}
			}
			local151 = arg3 - local10;
			local61 = arg3 + local10;
			if (local61 >= Static549.anInt5294 && Static334.anInt5381 >= local151) {
				local69 = arg0 + local24;
				local78 = arg0 - local24;
				if (Static82.anInt1902 <= local69 && local78 <= Static77.anInt1737) {
					local69 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, local69);
					local78 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, local78);
					if (local10 >= local15) {
						if (local61 <= Static334.anInt5381) {
							Static202.method3077(Static118.anIntArrayArray7[local61], local78, arg4, local69);
						}
						if (Static549.anInt5294 <= local151) {
							Static202.method3077(Static118.anIntArrayArray7[local151], local78, arg4, local69);
						}
					} else {
						local87 = local29 >= local10 ? local29 : Static405.anIntArray483[local10];
						local204 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 + local87);
						local213 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0 - local87);
						if (local61 <= Static334.anInt5381) {
							local220 = Static118.anIntArrayArray7[local61];
							Static202.method3077(local220, local78, arg4, local213);
							Static202.method3077(local220, local213, arg1, local204);
							Static202.method3077(local220, local204, arg4, local69);
						}
						if (local151 >= Static549.anInt5294) {
							local220 = Static118.anIntArrayArray7[local151];
							Static202.method3077(local220, local78, arg4, local213);
							Static202.method3077(local220, local213, arg1, local204);
							Static202.method3077(local220, local204, arg4, local69);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
	public static void method7606(@OriginalArg(0) int arg0) {
		if (Static221.method3276(arg0)) {
			Static198.method3045(Static172.aClass270ArrayArray2[arg0], -1);
		}
	}
}
