import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Lclient!kr;")
	public static Class171 aClass171_92;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "Z")
	public static boolean aBoolean422 = true;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_251 = new Class296(53, 2);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
	public static void method4905(@OriginalArg(0) int arg0) {
		Static315.method4923();
		Static255.method4304();
		Static212.method3594(arg0, true);
		Static486.method6640(Static513.aClass122_10, Static543.aClass171_154, Static542.aClass171_152);
		Static46.method935(Static513.aClass122_10, Static543.aClass171_154);
		Static68.method1246();
		Static134.method2248(Static415.aClass2Array14);
		Static299.method4748();
		Static205.method3533();
		if (Static268.anInt5100 == 2) {
			Static85.method1463(3);
		} else if (Static268.anInt5100 == 6) {
			Static85.method1463(7);
		} else if (Static268.anInt5100 == 9) {
			Static85.method1463(10);
			return;
		} else if (Static268.anInt5100 == 1) {
			Static303.method4785(Static513.aClass122_10, Static543.aClass171_154);
			return;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!uq;[II[III)Lclient!nca;")
	public static Class40_Sub2 method4906(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) byte[] local18 = new byte[arg3 * arg4];
		for (@Pc(20) int local20 = 0; local20 < arg3; local20++) {
			@Pc(30) int local30 = arg1[local20] + local20 * arg4;
			for (@Pc(32) int local32 = 0; local32 < arg2[local20]; local32++) {
				local18[local30++] = -1;
			}
		}
		return new Class40_Sub2(arg0, arg4, arg3, local18);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([BII)[B")
	public static byte[] method4908(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = new byte[arg1];
		Static551.method3488(arg0, 0, local14, 0, arg1);
		return local14;
	}
}
