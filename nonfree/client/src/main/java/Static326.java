import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!dp;")
	public static Class51 aClass51_17;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean515 = true;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ui;ILclient!cp;)V")
	public static void method4736(@OriginalArg(0) Class230 arg0, @OriginalArg(2) Interface2 arg1) {
		Static134.anInterface2_2 = arg1;
		Static234.aClass230_60 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4737(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIILclient!tq;I)V")
	public static void method4738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class164 arg3, @OriginalArg(5) int arg4) {
		arg3.method5313(arg1, arg4, arg1 + arg2, arg4 - -arg0);
		arg3.method5343(arg0, -16777216, arg4, arg1, arg2);
		if (Static240.anInt4008 < 100) {
			return;
		}
		@Pc(37) float local37 = (float) Static353.anInt2630 / (float) Static353.anInt2621;
		@Pc(39) int local39 = arg2;
		@Pc(41) int local41 = arg0;
		if (local37 < 1.0F) {
			local41 = (int) (local37 * (float) arg2);
		} else {
			local39 = (int) ((float) arg0 / local37);
		}
		@Pc(68) int local68 = arg4 + (arg0 - local41) / 2;
		@Pc(76) int local76 = arg1 + (arg2 - local39) / 2;
		if (Static167.aClass51_8 == null || Static167.aClass51_8.method4685() != arg2 || arg0 != Static167.aClass51_8.method4681()) {
			Static353.method2124(Static353.anInt2629, Static353.anInt2630 + Static353.anInt2623, Static353.anInt2629 + Static353.anInt2621, Static353.anInt2623, local76, local68, local39 + local76, local68 - -local41);
			Static353.method2121(arg3);
			Static167.aClass51_8 = arg3.method5387(local76, local68, local39, local41, false);
		}
		Static167.aClass51_8.method4669(local76, local68);
		@Pc(128) int local128 = Static57.anInt5865 * local39 / Static353.anInt2621;
		@Pc(134) int local134 = local41 * Static335.anInt5582 / Static353.anInt2630;
		@Pc(142) int local142 = local39 * Static125.anInt2254 / Static353.anInt2621 + local76;
		@Pc(154) int local154 = local41 + local68 - Static142.anInt2666 * local41 / Static353.anInt2630 - local134;
		@Pc(156) int local156 = -1996554240;
		if (Static360.aClass94_7 == Static313.aClass94_8) {
			local156 = -1996488705;
		}
		arg3.method5321(local142, local154, local128, local134, local156, 1);
		arg3.method5382(local142, local154, local128, local134, local156, 0);
		if (Static346.anInt5675 <= 0) {
			return;
		}
		@Pc(191) int local191;
		if (Static134.anInt2508 <= 50) {
			local191 = Static134.anInt2508 * 5;
		} else {
			local191 = (100 - Static134.anInt2508) * 5;
		}
		for (@Pc(205) Class1_Sub24 local205 = (Class1_Sub24) Static353.aClass17_25.method202(); local205 != null; local205 = (Class1_Sub24) Static353.aClass17_25.method207()) {
			@Pc(213) Class97 local213 = Static353.aClass249_4.method5522(local205.anInt3616);
			if (Static354.method4948(local213)) {
				@Pc(247) int local247;
				@Pc(259) int local259;
				if (Static355.anInt4357 == local205.anInt3616) {
					local247 = local76 + local205.anInt3618 * local39 / Static353.anInt2621;
					local259 = local68 + local41 * (Static353.anInt2630 - local205.anInt3621) / Static353.anInt2630;
					arg3.method5343(4, local191 << 24 | 0xFFFF00, local259 - 2, local247 - 2, 4);
				} else if (Static276.anInt5133 != -1 && local213.anInt2292 == Static276.anInt5133) {
					local247 = local205.anInt3618 * local39 / Static353.anInt2621 + local76;
					local259 = local41 * (Static353.anInt2630 - local205.anInt3621) / Static353.anInt2630 + local68;
					arg3.method5343(4, local191 << 24 | 0xFFFF00, local259 - 2, local247 + -2, 4);
				}
			}
		}
	}
}
