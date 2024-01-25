import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "Z")
	public static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[200];

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)Lclient!ada;")
	public static Class8 method3726(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static244.aClass8Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method3727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
