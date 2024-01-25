import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[6][];

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	public static int anInt8078 = -1;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Z")
	public static boolean aBoolean543 = false;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!mj;)V")
	public static void method6985(@OriginalArg(1) Class238 arg0) {
		@Pc(7) Class238 local7 = Static300.method4694(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local12 = Static85.anInt9921;
			local15 = Static256.anInt4629;
		} else {
			local12 = local7.anInt5985;
			local15 = local7.anInt5973;
		}
		Static119.method1759(local15, false, local12, arg0);
		Static390.method5746(local12, local15, arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;Lclient!tga;ZBZLjava/lang/String;)V")
	public static void method6986(@OriginalArg(0) String arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4) {
		if (!arg3) {
			Static390.method5745(arg0, 3, arg1);
			return;
		}
		@Pc(25) String local25;
		if (Static576.aString103.startsWith("win") && arg1.aBoolean601) {
			local25 = null;
			if (Static265.anApplet2 != null) {
				local25 = Static265.anApplet2.getParameter("haveie6");
			}
			if (local25 == null || !local25.equals("1")) {
				@Pc(47) Class361 local47 = Static390.method5745(arg0, 0, arg1);
				Static657.aClass361_8 = local47;
				Static528.aString95 = arg0;
				Static573.aClass349_5 = arg1;
				return;
			}
		}
		if (Static576.aString103.startsWith("mac")) {
			local25 = null;
			if (Static265.anApplet2 != null) {
				local25 = Static265.anApplet2.getParameter("havefirefox");
			}
			if (local25 != null && local25.equals("1") && arg2) {
				Static388.method5739(arg0, arg4, 1, arg1);
				return;
			}
		}
		Static390.method5745(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method6987(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class238 local8 = Static333.method5035(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray33 != null) {
			@Pc(19) Class5_Sub24 local19 = new Class5_Sub24();
			local19.aString38 = arg1;
			local19.anObjectArray2 = local8.anObjectArray33;
			local19.aClass238_6 = local8;
			local19.anInt4055 = arg0;
			Static247.method3957(local19);
		}
		if (Static652.anInt10664 != 11 || !Static73.method1209(local8).method1970(arg0 - 1)) {
			return;
		}
		@Pc(64) Class5_Sub41 local64;
		if (arg0 == 1) {
			local64 = Static647.method8905(Static93.aClass381_48, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
		if (arg0 == 2) {
			local64 = Static647.method8905(Static660.aClass381_268, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
		if (arg0 == 3) {
			local64 = Static647.method8905(Static385.aClass381_166, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
		if (arg0 == 4) {
			local64 = Static647.method8905(Static314.aClass381_135, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
		if (arg0 == 5) {
			local64 = Static647.method8905(Static660.aClass381_267, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
		if (arg0 == 6) {
			local64 = Static647.method8905(Static256.aClass381_114, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
		if (arg0 == 7) {
			local64 = Static647.method8905(Static510.aClass381_212, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
		if (arg0 == 8) {
			local64 = Static647.method8905(Static356.aClass381_152, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
		if (arg0 == 9) {
			local64 = Static647.method8905(Static370.aClass381_158, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
		if (arg0 == 10) {
			local64 = Static647.method8905(Static252.aClass381_112, Static4.aClass389_17.aClass393_2);
			Static493.method6906(arg2, arg3, local64, local8.anInt5990);
			Static4.aClass389_17.method9079(local64);
		}
	}
}
