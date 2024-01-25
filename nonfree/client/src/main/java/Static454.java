import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wp", name = "J", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_95 = new Class179(4, -1);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIII)V")
	public static void method5961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg0 + 1;
		Static59.method1261(Static163.anIntArrayArray35[arg0], arg1, arg2, arg3);
		@Pc(18) int local18 = arg4 - 1;
		Static59.method1261(Static163.anIntArrayArray35[arg4], arg1, arg2, arg3);
		for (@Pc(25) int local25 = local5; local25 <= local18; local25++) {
			@Pc(31) int[] local31 = Static163.anIntArrayArray35[local25];
			local31[arg2] = local31[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V")
	public static void method5962() {
		if (!Static54.method911()) {
			return;
		}
		if (Static206.aStringArray25 == null) {
			Static262.method3880();
		}
		Static52.anInt5266 = 0;
		Static355.aBoolean411 = true;
		try {
			Static378.aClipboard4 = Static152.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "(I)[Lclient!qu;")
	public static Class204[] method5964() {
		return new Class204[] { Static153.aClass204_9, Static205.aClass204_13, Static188.aClass204_11, Static38.aClass204_4, Static8.aClass204_1, Static26.aClass204_2, Static36.aClass204_3, Static197.aClass204_12, Static58.aClass204_7, Static297.aClass204_14, Static419.aClass204_16, Static347.aClass204_15, Static92.aClass204_8, Static427.aClass204_10 };
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBII[BII)Z")
	public static boolean method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(12) int local12 = arg3 % 8;
		@Pc(16) int local16;
		if (local12 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local12;
		}
		@Pc(31) int local31 = -((arg0 + 7) / 8);
		@Pc(40) int local40 = -((arg3 + 8 - 1) / 8);
		for (@Pc(42) int local42 = local31; local42 < 0; local42++) {
			for (@Pc(45) int local45 = local40; local45 < 0; local45++) {
				if (arg2[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local16;
			if (arg2[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}
}
