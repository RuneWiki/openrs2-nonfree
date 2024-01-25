import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "J")
	public static long aLong183;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString81 = "";

	@OriginalMember(owner = "client!o", name = "h", descriptor = "Z")
	public static boolean aBoolean607 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZIII)V")
	public static void method5977(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static275.anInt5823 == 0) {
			Static348.method2213(false);
		} else {
			Static499.anInt9277 = Static275.anInt5823;
			Static63.method1592(0);
		}
		Static52.aBoolean102 = arg1;
		Static133.anInt3193 = arg2;
		Static488.anInt2265 = arg3;
		Static87.method5763(arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/lang/String;ZZLclient!ufa;)V")
	public static void method5979(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class326 arg3) {
		if (!arg1) {
			Static295.method4985(3, arg3, arg0);
			return;
		}
		@Pc(21) String local21;
		if (Static530.aString119.startsWith("win") && arg3.aBoolean802) {
			local21 = null;
			if (Static253.anApplet3 != null) {
				local21 = Static253.anApplet3.getParameter("haveie6");
			}
			if (local21 == null || !local21.equals("1")) {
				@Pc(39) Class66 local39 = Static295.method4985(0, arg3, arg0);
				Static107.aClass66_3 = local39;
				Static441.aClass326_2 = arg3;
				Static214.aString45 = arg0;
				return;
			}
		}
		if (Static530.aString119.startsWith("mac")) {
			local21 = null;
			if (Static253.anApplet3 != null) {
				local21 = Static253.anApplet3.getParameter("havefirefox");
			}
			if (local21 != null && local21.equals("1") && arg2) {
				Static295.method4985(1, arg3, arg0);
				return;
			}
		}
		Static295.method4985(2, arg3, arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method5981(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) long local8 = 0L;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) + (long) arg0.charAt(local10) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!w;III[Z)Z")
	public static boolean method5982(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static224.aClass4Array3 != Static495.aClass4Array4) {
			@Pc(11) int local11 = Static381.aClass4Array2[arg1].sa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class4 local18 = Static381.aClass4Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.sa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method8445(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.aa(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
