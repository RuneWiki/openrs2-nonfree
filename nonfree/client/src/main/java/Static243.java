import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!vh;")
	public static Class250 aClass250_54;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public static int anInt4342 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)Z")
	public static boolean method3589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static108.method1668(arg0, arg1) | Static147.method2220(arg0, arg1) | Static396.method5371(arg0, arg1)) & Static412.method5565(arg0, arg1);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!qa;ILclient!vh;)V")
	public static void method3590(@OriginalArg(0) Class109 arg0, @OriginalArg(2) Class250 arg1) {
		@Pc(10) Class159[] local10 = Static459.method3750(arg1, Static400.anInt6934);
		Static381.aClass80Array13 = new Class80[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static381.aClass80Array13[local16] = arg0.method4684(local10[local16]);
		}
		local10 = Static459.method3750(arg1, Static112.anInt2017);
		Static195.aClass80Array4 = new Class80[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static195.aClass80Array4[local43] = arg0.method4684(local10[local43]);
		}
		local10 = Static459.method3750(arg1, Static235.anInt4215);
		Static370.aClass80Array18 = new Class80[local10.length];
		for (@Pc(70) int local70 = 0; local70 < local10.length; local70++) {
			Static370.aClass80Array18[local70] = arg0.method4684(local10[local70]);
		}
		local10 = Static459.method3750(arg1, Static132.anInt2278);
		Static199.aClass80Array5 = new Class80[local10.length];
		for (@Pc(106) int local106 = 0; local106 < local10.length; local106++) {
			Static199.aClass80Array5[local106] = arg0.method4684(local10[local106]);
		}
		local10 = Static459.method3750(arg1, Static438.anInt7563);
		Static337.aClass80Array19 = new Class80[local10.length];
		for (@Pc(133) int local133 = 0; local133 < local10.length; local133++) {
			Static337.aClass80Array19[local133] = arg0.method4684(local10[local133]);
		}
		local10 = Static459.method3750(arg1, Static315.anInt5855);
		Static233.aClass80Array10 = new Class80[local10.length];
		for (@Pc(160) int local160 = 0; local160 < local10.length; local160++) {
			Static233.aClass80Array10[local160] = arg0.method4684(local10[local160]);
		}
		local10 = Static459.method3750(arg1, Static325.anInt5704);
		Static329.aClass80Array14 = new Class80[local10.length];
		for (@Pc(187) int local187 = 0; local187 < local10.length; local187++) {
			Static329.aClass80Array14[local187] = arg0.method4684(local10[local187]);
		}
		local10 = Static459.method3750(arg1, Static69.anInt1410);
		Static257.aClass80Array11 = new Class80[local10.length];
		for (@Pc(214) int local214 = 0; local214 < local10.length; local214++) {
			Static257.aClass80Array11[local214] = arg0.method4684(local10[local214]);
		}
		local10 = Static459.method3750(arg1, Static175.anInt3194);
		Static75.aClass80Array2 = new Class80[local10.length];
		for (@Pc(241) int local241 = 0; local241 < local10.length; local241++) {
			Static75.aClass80Array2[local241] = arg0.method4684(local10[local241]);
		}
		local10 = Static459.method3750(arg1, Static169.anInt3146);
		Static4.aClass80Array1 = new Class80[local10.length];
		for (@Pc(268) int local268 = 0; local268 < local10.length; local268++) {
			Static4.aClass80Array1[local268] = arg0.method4684(local10[local268]);
		}
		local10 = Static459.method3750(arg1, Static163.anInt3041);
		Static260.aClass80Array12 = new Class80[local10.length];
		for (@Pc(295) int local295 = 0; local295 < local10.length; local295++) {
			Static260.aClass80Array12[local295] = arg0.method4684(local10[local295]);
		}
		local10 = Static459.method3750(arg1, Static258.anInt7178);
		Static201.aClass80Array7 = new Class80[local10.length];
		for (@Pc(322) int local322 = 0; local322 < local10.length; local322++) {
			Static201.aClass80Array7[local322] = arg0.method4684(local10[local322]);
		}
		Static164.aClass80_17 = arg0.method4684(Static459.method3755(arg1, Static305.anInt5425, 0));
		Static123.aClass80_5 = arg0.method4684(Static459.method3755(arg1, Static334.anInt5824, 0));
		local10 = Static459.method3750(arg1, Static161.anInt2764);
		Static185.aClass80Array3 = new Class80[local10.length];
		for (@Pc(365) int local365 = 0; local365 < local10.length; local365++) {
			Static185.aClass80Array3[local365] = arg0.method4684(local10[local365]);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method3592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static130.method1891(arg6)) {
			if (Static346.aClass219ArrayArray1[arg6] == null) {
				Static208.method3190(arg4, arg5, -1, arg0, arg2, Static448.aClass219ArrayArray2[arg6], arg3, arg1, arg7);
			} else {
				Static208.method3190(arg4, arg5, -1, arg0, arg2, Static346.aClass219ArrayArray1[arg6], arg3, arg1, arg7);
			}
		} else if (arg3 == -1) {
			for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
				Static22.aBooleanArray12[local27] = true;
			}
		} else {
			Static22.aBooleanArray12[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V")
	public static void method3593() {
		@Pc(10) Class83 local10 = Static244.aClass83_38;
		synchronized (Static244.aClass83_38) {
			Static244.aClass83_38.method1669();
		}
	}
}
