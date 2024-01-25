import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!st", name = "K", descriptor = "I")
	public static int anInt8847;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIBI)V")
	public static void method7410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 * Static404.aClass2_Sub13_2.aClass33_Sub1_2.method810() >> 8;
		if (arg1 == -1 && !Static243.aBoolean394) {
			Static417.method6378();
		} else if (arg1 != -1 && (Static125.anInt2929 != arg1 || !Static500.method7112()) && local8 != 0 && !Static243.aBoolean394) {
			Static614.method8357(Static536.aClass97_133, arg1, arg2, local8);
			Static15.method320();
		}
		if (arg1 != Static125.anInt2929) {
			Static322.aClass2_Sub2_Sub1_3 = null;
		}
		Static125.anInt2929 = arg1;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIZ)Z")
	public static boolean method7411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static451.method6640(arg1, arg0) || Static370.method5584(arg0, arg1);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method7412(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
