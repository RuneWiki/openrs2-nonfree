import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "[I")
	public static int[] anIntArray609;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "Lclient!lh;")
	public static final Class143 aClass143_1 = Static395.method5017();

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "[I")
	public static final int[] anIntArray608 = new int[4096];

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZLclient!gk;I)V")
	public static void method5571(@OriginalArg(1) Class7_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (Static257.aClass6_3 == null) {
			return;
		}
		try {
			Static257.aClass6_3.method28(0L);
			Static257.aClass6_3.method29(24, arg1, arg0.aByteArray75);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
