import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!as", name = "B", descriptor = "[Lclient!ne;")
	public static Class146[] aClass146Array3;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Z")
	public static boolean aBoolean420 = false;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString227 = "Loaded sprites";

	@OriginalMember(owner = "client!as", name = "C", descriptor = "Lclient!al;")
	public static final Class11 aClass11_132 = new Class11(8);

	@OriginalMember(owner = "client!as", name = "D", descriptor = "[I")
	public static final int[] anIntArray544 = new int[50];

	@OriginalMember(owner = "client!as", name = "f", descriptor = "(I)Lclient!o;")
	public static Class14_Sub2_Sub14 method5424() {
		return Static241.aClass14_Sub2_Sub14_3;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BJ)V")
	public static void method5425(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static293.method5010(arg0 - 1L);
			Static293.method5010(1L);
		} else {
			Static293.method5010(arg0);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!e;)V")
	public static void method5427(@OriginalArg(1) Class46 arg0) {
		@Pc(7) int local7 = Static349.anInt6632;
		@Pc(9) int local9 = Static127.anInt2787;
		@Pc(11) int local11 = Static124.anInt2716;
		@Pc(15) int local15 = Static147.anInt2656 - 3;
		if (Static94.aClass2_11 == null || Static63.aClass2_2 == null) {
			if (Static348.aClass143_98.method3736(Static189.anInt6147) && Static348.aClass143_98.method3736(Static275.anInt5246)) {
				Static94.aClass2_11 = arg0.method5157(Static368.method5811(Static348.aClass143_98, Static189.anInt6147, 0));
				@Pc(60) Class207 local60 = Static368.method5811(Static348.aClass143_98, Static275.anInt5246, 0);
				Static63.aClass2_2 = arg0.method5157(local60);
				local60.method5814();
				Static3.aClass2_1 = arg0.method5157(local60);
			} else {
				arg0.method5110(local7, local9, local11, 20, Static129.anInt2791 | 255 - Static167.anInt5370 << 24, 1);
			}
		}
		@Pc(89) int local89;
		if (Static94.aClass2_11 != null && Static63.aClass2_2 != null) {
			@Pc(87) int local87 = (local11 - Static63.aClass2_2.method2639() * 2) / Static94.aClass2_11.method2639();
			for (local89 = 0; local89 < local87; local89++) {
				Static94.aClass2_11.method2642(Static63.aClass2_2.method2639() + local7 + Static94.aClass2_11.method2639() * local89, local9);
			}
			Static63.aClass2_2.method2642(local7, local9);
			Static3.aClass2_1.method2642(local7 + local11 - Static3.aClass2_1.method2639(), local9);
		}
		Static164.aClass30_5.method5572(local7 + 3, -1, -16777216 | Static235.anInt4623, local9 + 14, Static325.aString231);
		arg0.method5110(local7, local9 + 20, local11, local15 - 20, Static129.anInt2791 | -Static167.anInt5370 + 255 << 24, 1);
		local89 = Static63.anInt1529;
		@Pc(171) int local171 = Static328.anInt6333;
		@Pc(190) int local190;
		for (@Pc(173) int local173 = 0; local173 < Static41.anInt980; local173++) {
			local190 = (Static41.anInt980 - local173 - 1) * 16 + local9 + 13 + 20;
			if (local7 < local89 && local11 + local7 > local89 && local171 > local190 - 13 && local171 < local190 + 4) {
				arg0.method5110(local7, local190 - 12, local11, 16, Static178.anInt3665 | 255 - Static69.anInt1675 << 24, 1);
			}
		}
		if ((Static145.aClass2_21 == null || Static339.aClass2_13 == null || Static140.aClass2_14 == null) && Static348.aClass143_98.method3736(Static218.anInt4382) && Static348.aClass143_98.method3736(Static337.anInt6505) && Static348.aClass143_98.method3736(Static99.anInt2248)) {
			@Pc(271) Class207 local271 = Static368.method5811(Static348.aClass143_98, Static337.anInt6505, 0);
			Static339.aClass2_13 = arg0.method5157(local271);
			local271.method5814();
			Static85.aClass2_7 = arg0.method5157(local271);
			Static145.aClass2_21 = arg0.method5157(Static368.method5811(Static348.aClass143_98, Static218.anInt4382, 0));
			@Pc(296) Class207 local296 = Static368.method5811(Static348.aClass143_98, Static99.anInt2248, 0);
			Static140.aClass2_14 = arg0.method5157(local296);
			local296.method5814();
			Static191.aClass2_16 = arg0.method5157(local296);
		}
		@Pc(367) int local367;
		@Pc(369) int local369;
		if (Static145.aClass2_21 != null && Static339.aClass2_13 != null && Static140.aClass2_14 != null) {
			local190 = (local11 - Static140.aClass2_14.method2639() * 2) / Static145.aClass2_21.method2639();
			for (@Pc(327) int local327 = 0; local327 < local190; local327++) {
				Static145.aClass2_21.method2642(Static140.aClass2_14.method2639() + local7 + local327 * Static145.aClass2_21.method2639(), local9 - (-local15 - -Static145.aClass2_21.method2640()));
			}
			local367 = (local15 - Static140.aClass2_14.method2640() - 20) / Static339.aClass2_13.method2640();
			for (local369 = 0; local369 < local367; local369++) {
				Static339.aClass2_13.method2642(local7, local9 + Static339.aClass2_13.method2640() * local369 + 20);
				Static85.aClass2_7.method2642(local7 + local11 - Static85.aClass2_7.method2639(), local369 * Static339.aClass2_13.method2640() + 20 + local9);
			}
			Static140.aClass2_14.method2642(local7, local15 + local9 - Static140.aClass2_14.method2640());
			Static191.aClass2_16.method2642(local11 + local7 - Static140.aClass2_14.method2639(), -Static140.aClass2_14.method2640() + local15 + local9);
		}
		local190 = 0;
		for (@Pc(440) Class14_Sub23 local440 = (Class14_Sub23) Static95.aClass18_9.method459(); local440 != null; local440 = (Class14_Sub23) Static95.aClass18_9.method453()) {
			local367 = (Static41.anInt980 - local190 - 1) * 16 + local9 + 13 + 20;
			local369 = Static235.anInt4623 | 0xFF000000;
			if (local7 < local89 && local89 < local11 + local7 && local367 - 13 < local171 && local171 < local367 + 4) {
				local369 = Static278.anInt5290 | 0xFF000000;
			}
			@Pc(492) int[] local492 = null;
			if (Static31.method760(local440.anInt4355)) {
				local492 = Static296.method5066((int) local440.aLong128).anIntArray647;
			} else if (Static194.method3670(local440.anInt4355)) {
				@Pc(508) Class10_Sub3_Sub3_Sub1 local508 = Static266.aClass10_Sub3_Sub3_Sub1Array1[(int) local440.aLong128];
				if (local508 != null) {
					local492 = local508.aClass192_1.anIntArray527;
				}
			} else if (Static254.method4389(local440.anInt4355)) {
				if (local440.anInt4355 == 1001) {
					local492 = Static232.method2200((int) local440.aLong128).anIntArray171;
				} else {
					local492 = Static232.method2200((int) (local440.aLong128 >>> 32 & 0x7FFFFFFFL)).anIntArray171;
				}
			}
			@Pc(555) String local555 = Static206.method6002(local440);
			if (local492 != null) {
				local555 = local555 + Static38.method915(local492);
			}
			Static164.aClass30_5.method5575(local367, local555, Static58.anIntArray95, 0, local369, local7 + 3, Static235.aClass2Array14);
			local190++;
		}
		Static51.method1234(Static349.anInt6632, Static147.anInt2656, Static127.anInt2787, Static124.anInt2716);
	}
}
