import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static599 {

	@OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
	public static int anInt9885;

	@OriginalMember(owner = "client!tu", name = "E", descriptor = "Z")
	public static boolean aBoolean681 = false;

	@OriginalMember(owner = "client!tu", name = "G", descriptor = "Z")
	public static boolean aBoolean682 = false;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method8479(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static676.method9510(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
	public static void method8480() {
		if (Static571.aClass37_3 != null) {
			Static571.aClass37_3.method4370();
		}
		if (Static337.aClass37_1 != null) {
			Static337.aClass37_1.method4370();
		}
	}
}
