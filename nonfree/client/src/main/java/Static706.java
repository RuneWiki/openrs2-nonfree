import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static706 {

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
	public static int anInt10812 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public static void method9434() {
		Static419.aClass85_45.method1748();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILjava/lang/String;B)V")
	public static void method9435(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static103.method9371();
		Static418.method6115();
		Static142.method4100();
		Static166.method2507(arg1, arg0, arg2);
		Static242.method7781();
		Static347.method4808(Static396.aClass145_6);
		Static33.method470(Static396.aClass145_6);
		Static712.method9471(Static117.aClass254_47, -97, Static396.aClass145_6);
		Static385.method5735();
		Static255.method3621(-59, Static245.aClass43Array9);
		Static668.method9110(-83);
		Static593.method8176();
		if (Static357.anInt5722 == 3) {
			Static261.method9374(-120, 4);
		} else if (Static357.anInt5722 == 7) {
			Static261.method9374(-85, 8);
		} else if (Static357.anInt5722 == 9) {
			Static261.method9374(-56, 10);
		} else if (Static357.anInt5722 == 11) {
			Static261.method9374(-56, 12);
		} else if (Static357.anInt5722 == 1 || Static357.anInt5722 == 2) {
			Static580.method8081();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIZII)V")
	public static void method9436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static650.aClass2_Sub30_29.aClass11_Sub5_5.method1696(1) != 0 && arg5 != 0 && Static66.anInt1152 < 50 && arg0 != -1) {
			Static461.aClass177Array1[Static66.anInt1152++] = new Class177((byte) 2, arg0, arg5, arg1, arg3, arg2, arg4, (Class4_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)J")
	public static long method9437() {
		return Static66.aClass106_1.method6186();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method9438(@OriginalArg(0) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static198.aStringArray15.length; local15++) {
			if (Static198.aStringArray15[local15].equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}
}
