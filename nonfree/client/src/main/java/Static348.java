import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "[I")
	public static final int[] anIntArray718 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method5738(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static294.aString247 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static217.aString171 + "</col>";
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!dp;I)V")
	public static void method5739(@OriginalArg(0) Class53 arg0) {
		Static340.aClass53_27 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
	public static void method5740() {
		@Pc(7) Class109[] local7 = Class216.aClass109Array1;
		synchronized (Class216.aClass109Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class216.aClass109Array1.length; local11++) {
				Class216.aClass109Array1[local11] = new Class109();
				Static155.anIntArray582[local11] = 0;
			}
		}
	}
}
