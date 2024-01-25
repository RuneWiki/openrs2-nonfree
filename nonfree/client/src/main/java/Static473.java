import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!pu", name = "P", descriptor = "Lclient!d;")
	public static Interface2 anInterface2_9;

	@OriginalMember(owner = "client!pu", name = "bb", descriptor = "I")
	public static int anInt7547;

	@OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
	public static int anInt7527 = 0;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIII)V")
	public static void method6295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg1 - arg3;
		@Pc(15) int local15 = arg0 - arg4;
		if (local15 == 0) {
			if (local10 != 0) {
				Static470.method6243(arg2, arg3, arg1, arg4);
			}
		} else if (local10 == 0) {
			Static282.method4103(arg4, arg3, arg2, arg0);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(68) boolean local68 = local15 < local10;
			@Pc(72) int local72;
			@Pc(74) int local74;
			if (local68) {
				local72 = arg4;
				local74 = arg0;
				arg4 = arg3;
				arg0 = arg1;
				arg3 = local72;
				arg1 = local74;
			}
			if (arg0 < arg4) {
				local72 = arg4;
				local74 = arg3;
				arg4 = arg0;
				arg0 = local72;
				arg3 = arg1;
				arg1 = local74;
			}
			local72 = arg3;
			local74 = arg0 - arg4;
			@Pc(112) int local112 = arg1 - arg3;
			@Pc(117) int local117 = -(local74 >> 1);
			if (local112 < 0) {
				local112 = -local112;
			}
			@Pc(129) int local129 = arg1 > arg3 ? 1 : -1;
			@Pc(133) int local133;
			if (local68) {
				for (local133 = arg4; local133 <= arg0; local133++) {
					local117 += local112;
					Static276.anIntArrayArray32[local133][local72] = arg2;
					if (local117 > 0) {
						local117 -= local74;
						local72 += local129;
					}
				}
			} else {
				for (local133 = arg4; local133 <= arg0; local133++) {
					Static276.anIntArrayArray32[local72][local133] = arg2;
					local117 += local112;
					if (local117 > 0) {
						local117 -= local74;
						local72 += local129;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
	public static void method6298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static146.anInt2698 = arg0 - Static671.anInt9357;
		Static426.anInt6954 = arg1 - Static671.anInt9358;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!ec;Ljava/lang/String;ZZB)V")
	public static void method6299(@OriginalArg(0) Class92 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg2) {
			Static499.method6549(arg1, arg0, 3);
			return;
		}
		@Pc(26) String local26;
		if (Static126.aString34.startsWith("win") && arg0.aBoolean172) {
			local26 = null;
			if (Static339.anApplet2 != null) {
				local26 = Static339.anApplet2.getParameter("haveie6");
			}
			if (local26 == null || !local26.equals("1")) {
				@Pc(44) Class338 local44 = Static499.method6549(arg1, arg0, 0);
				Static208.aString45 = arg1;
				Static164.aClass92_2 = arg0;
				Static344.aClass338_8 = local44;
				return;
			}
		}
		if (Static126.aString34.startsWith("mac")) {
			local26 = null;
			if (Static339.anApplet2 != null) {
				local26 = Static339.anApplet2.getParameter("havefirefox");
			}
			if (local26 != null && local26.equals("1") && arg3) {
				Static499.method6549(arg1, arg0, 1);
				return;
			}
		}
		Static499.method6549(arg1, arg0, 2);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZILclient!uq;)Lclient!eb;")
	public static Class91 method6301(@OriginalArg(1) int arg0, @OriginalArg(2) Class362 arg1) {
		@Pc(13) byte[] local13 = arg1.method8356(arg0);
		return local13 == null ? null : new Class91(local13);
	}
}
