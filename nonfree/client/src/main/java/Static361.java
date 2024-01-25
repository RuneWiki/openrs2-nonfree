import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static361 {

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "Lclient!ep;")
	public static Class93 aClass93_11 = null;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!jo;Lclient!jo;I)V")
	public static void method5808(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		Static493.aClass168_114 = arg1;
		Static447.aClass168_102 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZZ)V")
	public static void method5811(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static276.anInt5350++;
			Static275.method4579();
		}
		if (arg0) {
			Static291.anInt5562++;
			Static543.method7798();
		}
	}
}
