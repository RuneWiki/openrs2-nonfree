import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
	public static int anInt5607 = 0;

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
	public static int anInt5611 = 2;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!vm;)V")
	public static void method4751(@OriginalArg(1) Class92 arg0) {
		if (Static120.aClass130_52.method3504() == 0) {
			return;
		}
		@Pc(67) Class4_Sub15 local67;
		if (Static6.anInt1971 == 0 || Static6.anInt1971 == 2) {
			for (local67 = (Class4_Sub15) Static120.aClass130_52.method3499(); local67 != null; local67 = (Class4_Sub15) Static120.aClass130_52.method3512()) {
				Static122.method2459(local67.anInt2469, arg0, Static14.aClass78_1, local67.anInt2465, local67.anInt2473, local67.aBoolean210 ? Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4 : null, local67.anInt2471, false, arg0, false, local67.anInt2466);
				local67.method5667();
			}
			Static240.method4159();
			return;
		}
		if (Static345.aClass92_9 == null) {
			@Pc(37) Canvas local37 = new Canvas();
			local37.setSize(36, 32);
			Static345.aClass92_9 = Static164.method3151(Static156.anInterface1_3, Static212.aClass120_3, 0, local37, 0);
			Static134.aClass78_4 = Static345.aClass92_9.method4476(Static191.method3463(Static58.aClass11_24, Static223.anInt4634), Static367.method5454(Static292.aClass11_130, Static223.anInt4634));
		}
		for (local67 = (Class4_Sub15) Static120.aClass130_52.method3499(); local67 != null; local67 = (Class4_Sub15) Static120.aClass130_52.method3512()) {
			Static122.method2459(local67.anInt2469, Static345.aClass92_9, Static134.aClass78_4, local67.anInt2465, local67.anInt2473, local67.aBoolean210 ? Static110.aClass2_Sub2_Sub1_Sub1_1.aClass148_4 : null, local67.anInt2471, false, arg0, false, local67.anInt2466);
			local67.method5667();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!am;I)Lclient!jp;")
	public static Class106 method4752(@OriginalArg(1) Class11 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method300(arg1);
		return local8 == null ? null : new Class106(local8);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBII)V")
	public static void method4754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(20) int local20 = -arg0;
		@Pc(22) int local22 = -1;
		@Pc(31) int local31 = Static181.method3367(Static338.anInt5369, arg3 + arg0, Static295.anInt5964);
		@Pc(40) int local40 = Static181.method3367(Static338.anInt5369, arg3 - arg0, Static295.anInt5964);
		Static182.method3394(local40, Static30.anIntArrayArray10[arg2], arg1, local31);
		while (local17 > local15) {
			local22 += 2;
			local20 += local22;
			@Pc(72) int local72;
			@Pc(76) int local76;
			@Pc(90) int local90;
			@Pc(99) int local99;
			if (local20 > 0) {
				local17--;
				local20 -= local17 << 1;
				local72 = arg2 - local17;
				local76 = local17 + arg2;
				if (local76 >= Static229.anInt4777 && Static165.anInt3366 >= local72) {
					local90 = Static181.method3367(Static338.anInt5369, arg3 + local15, Static295.anInt5964);
					local99 = Static181.method3367(Static338.anInt5369, arg3 - local15, Static295.anInt5964);
					if (local76 <= Static165.anInt3366) {
						Static182.method3394(local99, Static30.anIntArrayArray10[local76], arg1, local90);
					}
					if (Static229.anInt4777 <= local72) {
						Static182.method3394(local99, Static30.anIntArrayArray10[local72], arg1, local90);
					}
				}
			}
			local15++;
			local72 = arg2 - local15;
			local76 = arg2 + local15;
			if (local76 >= Static229.anInt4777 && local72 <= Static165.anInt3366) {
				local90 = Static181.method3367(Static338.anInt5369, arg3 + local17, Static295.anInt5964);
				local99 = Static181.method3367(Static338.anInt5369, arg3 - local17, Static295.anInt5964);
				if (local76 <= Static165.anInt3366) {
					Static182.method3394(local99, Static30.anIntArrayArray10[local76], arg1, local90);
				}
				if (local72 >= Static229.anInt4777) {
					Static182.method3394(local99, Static30.anIntArrayArray10[local72], arg1, local90);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!vm;IBIIIIII)V")
	public static void method4755(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) Interface5 local19 = (Interface5) Static122.method2458(arg1, arg4, arg6);
		@Pc(27) Class56 local27;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(53) int local53;
		if (local19 != null) {
			local27 = Static320.method5290(local19.method4729());
			local33 = local19.method4734() & 0x3;
			local37 = local19.method4733();
			if (local27.anInt1306 == -1) {
				local53 = arg5;
				if (local27.anInt1336 > 0) {
					local53 = arg7;
				}
				if (local37 == 0 || local37 == 2) {
					if (local33 == 0) {
						arg0.method4509(arg3, local53, 4, arg2);
					} else if (local33 == 1) {
						arg0.method4481(arg3, local53, 4, arg2);
					} else if (local33 == 2) {
						arg0.method4509(arg3, local53, 4, arg2 + 3);
					} else if (local33 == 3) {
						arg0.method4481(arg3 + 3, local53, 4, arg2);
					}
				}
				if (local37 == 3) {
					if (local33 == 0) {
						arg0.method4502(arg3, 1, arg2, 1, local53);
					} else if (local33 == 1) {
						arg0.method4502(arg3, 1, arg2 + 3, 1, local53);
					} else if (local33 == 2) {
						arg0.method4502(arg3 + 3, 1, arg2 + 3, 1, local53);
					} else if (local33 == 3) {
						arg0.method4502(arg3 + 3, 1, arg2, 1, local53);
					}
				}
				if (local37 == 2) {
					if (local33 == 0) {
						arg0.method4481(arg3, local53, 4, arg2);
					} else if (local33 == 1) {
						arg0.method4509(arg3, local53, 4, arg2 + 3);
					} else if (local33 == 2) {
						arg0.method4481(arg3 + 3, local53, 4, arg2);
					} else if (local33 == 3) {
						arg0.method4509(arg3, local53, 4, arg2);
					}
				}
			} else {
				Static188.method3429(arg0, arg2, local33, arg3, local27);
			}
		}
		local19 = (Interface5) Static166.method3153(arg1, arg4, arg6, io.class);
		if (local19 != null) {
			local27 = Static320.method5290(local19.method4729());
			local33 = local19.method4734() & 0x3;
			local37 = local19.method4733();
			if (local27.anInt1306 != -1) {
				Static188.method3429(arg0, arg2, local33, arg3, local27);
			} else if (local37 == 9) {
				local53 = -1118482;
				if (local27.anInt1336 > 0) {
					local53 = -1179648;
				}
				if (local33 == 0 || local33 == 2) {
					arg0.method4500(arg3 + 3, arg2, local53, arg2 + 3, arg3);
				} else {
					arg0.method4500(arg3, arg2, local53, arg2 + 3, arg3 + 3);
				}
			}
		}
		local19 = (Interface5) Static5.method210(arg1, arg4, arg6);
		if (local19 == null) {
			return;
		}
		local27 = Static320.method5290(local19.method4729());
		local33 = local19.method4734() & 0x3;
		if (local27.anInt1306 != -1) {
			Static188.method3429(arg0, arg2, local33, arg3, local27);
			return;
		}
	}
}
