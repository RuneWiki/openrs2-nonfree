import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
	public static int anInt2239;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method2007(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local10 + local8);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public static void method2008() {
		Static342.aClass83_44.method2346();
		Static296.aClass83_53.method2346();
		Static87.aClass83_14.method2346();
		Static28.aClass83_7.method2346();
		Static342.aClass83_45.method2346();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
	public static void method2009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(15) int local15 = arg1 - arg4;
		if (local15 == 0) {
			if (local10 != 0) {
				Static199.method176(arg3, arg0, arg4, arg2);
			}
		} else if (local10 == 0) {
			Static154.method2868(arg4, arg1, arg0, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(68) boolean local68 = local10 > local15;
			@Pc(72) int local72;
			@Pc(76) int local76;
			if (local68) {
				local72 = arg4;
				arg4 = arg0;
				local76 = arg1;
				arg0 = local72;
				arg1 = arg2;
				arg2 = local76;
			}
			if (arg1 < arg4) {
				local72 = arg4;
				arg4 = arg1;
				local76 = arg0;
				arg0 = arg2;
				arg1 = local72;
				arg2 = local76;
			}
			local72 = arg0;
			local76 = arg1 - arg4;
			@Pc(108) int local108 = arg2 - arg0;
			@Pc(113) int local113 = -(local76 >> 1);
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(126) int local126 = arg0 < arg2 ? 1 : -1;
			@Pc(130) int local130;
			if (local68) {
				for (local130 = arg4; local130 <= arg1; local130++) {
					Static400.anIntArrayArray54[local130][local72] = arg3;
					local113 += local108;
					if (local113 > 0) {
						local113 -= local76;
						local72 += local126;
					}
				}
			} else {
				for (local130 = arg4; local130 <= arg1; local130++) {
					local113 += local108;
					Static400.anIntArrayArray54[local72][local130] = arg3;
					if (local113 > 0) {
						local72 += local126;
						local113 -= local76;
					}
				}
			}
		}
	}
}
