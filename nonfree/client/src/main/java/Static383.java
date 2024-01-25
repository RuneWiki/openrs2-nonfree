import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static383 {

	@OriginalMember(owner = "client!maa", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!maa", name = "n", descriptor = "I")
	public static int anInt6847 = -1;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IB)V")
	public static void method5756(@OriginalArg(0) int arg0) {
		if (Static394.anIntArray381 == null || arg0 > Static394.anIntArray381.length) {
			Static394.anIntArray381 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILclient!lb;Lclient!lb;[I)V")
	public static void method5759(@OriginalArg(1) Class221 arg0, @OriginalArg(2) Class221 arg1, @OriginalArg(3) int[] arg2) {
		if (arg2 != null) {
			Static480.anIntArray459 = arg2;
		}
		Static152.aClass221_39 = arg1;
		Static264.aClass221_72 = arg0;
	}
}
