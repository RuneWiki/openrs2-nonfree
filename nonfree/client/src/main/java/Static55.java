import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	public static int anInt950;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!r;)V")
	public static void method844(@OriginalArg(0) int arg0, @OriginalArg(2) Class285 arg1) {
		if (Static45.aBoolean72) {
			arg0 = 0;
			Static45.aBoolean72 = false;
		}
		if (Static237.aClass285_4 != null && Static237.aClass285_4.method6286(arg1)) {
			return;
		}
		Static237.aClass285_4 = arg1;
		Static125.aLong61 = Static184.method3422();
		Static396.anInt6918 = arg0;
		Static572.anInt9517 = arg0;
		if (Static572.anInt9517 == 0) {
			Static552.method7617();
			return;
		}
		Static466.aFloat159 = Static518.aFloat190;
		Static117.aFloat50 = Static462.aFloat158;
		Static444.aFloat146 = Static549.aFloat196;
		Static184.anInt3919 = Static148.anInt7119;
		Static94.anInt2394 = Static530.anInt9010;
		Static115.anInt2695 = Static32.anInt606;
		Static508.aFloat186 = Static138.aFloat194;
		Static371.aClass75_3 = Static117.aClass75_1;
		Static269.aFloat96 = Static460.aFloat157;
		Static367.aFloat166 = Static404.aFloat142;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJ)V")
	public static void method845(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if ((long) 0 == arg0 % 10L) {
			Static161.method3170(arg0 - 1L);
			Static161.method3170(1L);
		} else {
			Static161.method3170(arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!w;III[Z)Z")
	public static boolean method846(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static112.aClass16Array3 != Static109.aClass16Array2) {
			@Pc(11) int local11 = Static45.aClass16Array1[arg1].sa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class16 local18 = Static45.aClass16Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.sa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method8043(arg0, arg2, local27, arg3);
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
