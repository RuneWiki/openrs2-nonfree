import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_122 = new Class160(78, 7);

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
	public static int anInt9539 = -1;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public static int anInt9540 = -1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIFIFLclient!ue;FIFF)[B")
	public static byte[] method7792(@OriginalArg(3) float arg0, @OriginalArg(5) float arg1, @OriginalArg(6) Class310 arg2, @OriginalArg(7) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static192.method2858(arg1, arg0, arg5, 0, arg3, arg2, arg4, local15);
		return local15;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)Z")
	public static boolean method7793(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
