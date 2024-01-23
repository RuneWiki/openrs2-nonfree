import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	public static int anInt493;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
	public static int[] anIntArray44 = new int[2];

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public static int anInt482 = -1;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	public static int anInt488 = 0;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
	public static volatile int anInt505 = 0;

	@OriginalMember(owner = "client!bh", name = "lb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public static void method419() {
		Static230.aClass89_16.method2265();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V")
	public static void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static65.method1138(arg1);
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg1;
		@Pc(17) int local17 = arg1 - arg0;
		@Pc(20) int local20 = -arg1;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(34) int local34 = local17;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (Static206.anInt4449 <= arg2 && Static90.anInt2088 >= arg2) {
			@Pc(52) int[] local52 = Static121.anIntArrayArray33[arg2];
			local61 = Static131.method2259(Static310.anInt6206, arg5 - arg1, Static170.anInt3814);
			local70 = Static131.method2259(Static310.anInt6206, arg5 + arg1, Static170.anInt3814);
			local79 = Static131.method2259(Static310.anInt6206, arg5 - local17, Static170.anInt3814);
			local88 = Static131.method2259(Static310.anInt6206, arg5 + local17, Static170.anInt3814);
			Static98.method3942(local79, local52, arg4, local61);
			Static98.method3942(local88, local52, arg3, local79);
			Static98.method3942(local70, local52, arg4, local88);
		}
		@Pc(109) int local109 = -local17;
		while (local12 > local10) {
			local36 += 2;
			local38 += 2;
			local20 += local36;
			local109 += local38;
			if (local109 >= 0 && local34 >= 1) {
				local34--;
				local109 -= local34 << 1;
				Static126.anIntArray277[local34] = local10;
			}
			local10++;
			@Pc(207) int local207;
			@Pc(216) int local216;
			@Pc(227) int[] local227;
			@Pc(155) int local155;
			if (local20 >= 0) {
				local12--;
				local155 = arg2 - local12;
				local20 -= local12 << 1;
				local61 = local12 + arg2;
				if (local61 >= Static206.anInt4449 && local155 <= Static90.anInt2088) {
					if (local12 < local17) {
						local70 = Static126.anIntArray277[local12];
						local79 = Static131.method2259(Static310.anInt6206, arg5 + local10, Static170.anInt3814);
						local88 = Static131.method2259(Static310.anInt6206, arg5 - local10, Static170.anInt3814);
						local207 = Static131.method2259(Static310.anInt6206, local70 + arg5, Static170.anInt3814);
						local216 = Static131.method2259(Static310.anInt6206, arg5 - local70, Static170.anInt3814);
						if (local61 <= Static90.anInt2088) {
							local227 = Static121.anIntArrayArray33[local61];
							Static98.method3942(local216, local227, arg4, local88);
							Static98.method3942(local207, local227, arg3, local216);
							Static98.method3942(local79, local227, arg4, local207);
						}
						if (Static206.anInt4449 <= local155) {
							local227 = Static121.anIntArrayArray33[local155];
							Static98.method3942(local216, local227, arg4, local88);
							Static98.method3942(local207, local227, arg3, local216);
							Static98.method3942(local79, local227, arg4, local207);
						}
					} else {
						local70 = Static131.method2259(Static310.anInt6206, local10 + arg5, Static170.anInt3814);
						local79 = Static131.method2259(Static310.anInt6206, arg5 - local10, Static170.anInt3814);
						if (local61 <= Static90.anInt2088) {
							Static98.method3942(local70, Static121.anIntArrayArray33[local61], arg4, local79);
						}
						if (Static206.anInt4449 <= local155) {
							Static98.method3942(local70, Static121.anIntArrayArray33[local155], arg4, local79);
						}
					}
				}
			}
			local155 = arg2 - local10;
			local61 = arg2 + local10;
			if (Static206.anInt4449 <= local61 && local155 <= Static90.anInt2088) {
				local70 = local12 + arg5;
				local79 = arg5 - local12;
				if (local70 >= Static170.anInt3814 && local79 <= Static310.anInt6206) {
					local70 = Static131.method2259(Static310.anInt6206, local70, Static170.anInt3814);
					local79 = Static131.method2259(Static310.anInt6206, local79, Static170.anInt3814);
					if (local10 >= local17) {
						if (Static90.anInt2088 >= local61) {
							Static98.method3942(local70, Static121.anIntArrayArray33[local61], arg4, local79);
						}
						if (local155 >= Static206.anInt4449) {
							Static98.method3942(local70, Static121.anIntArrayArray33[local155], arg4, local79);
						}
					} else {
						local88 = local34 >= local10 ? local34 : Static126.anIntArray277[local10];
						local207 = Static131.method2259(Static310.anInt6206, local88 + arg5, Static170.anInt3814);
						local216 = Static131.method2259(Static310.anInt6206, arg5 - local88, Static170.anInt3814);
						if (local61 <= Static90.anInt2088) {
							local227 = Static121.anIntArrayArray33[local61];
							Static98.method3942(local216, local227, arg4, local79);
							Static98.method3942(local207, local227, arg3, local216);
							Static98.method3942(local70, local227, arg4, local207);
						}
						if (local155 >= Static206.anInt4449) {
							local227 = Static121.anIntArrayArray33[local155];
							Static98.method3942(local216, local227, arg4, local79);
							Static98.method3942(local207, local227, arg3, local216);
							Static98.method3942(local70, local227, arg4, local207);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void method423() {
		Static183.anIntArray357 = Static14.method362(0.4F);
	}
}
