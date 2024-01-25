import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "[Lclient!mv;")
	public static Class26_Sub2[] aClass26_Sub2Array1;

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_15 = new Class253(40, 10);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)I")
	public static int method622() {
		return 6;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)Lclient!tr;")
	public static Class28_Sub8 method623() {
		@Pc(16) Class28_Sub8 local16 = (Class28_Sub8) Static377.aClass169_8.method3599();
		if (local16 == null) {
			return new Class28_Sub8();
		} else {
			Static373.anInt5973--;
			return local16;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ok;III)Lclient!io;")
	public static Class117 method625(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method3838(0, arg1);
		return local9 == null ? null : new Class117(local9);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)V")
	public static void method626(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static347.aByteArrayArrayArray16 = new byte[4][arg0][arg1];
	}
}
