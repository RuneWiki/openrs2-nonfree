import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static513 {

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
	public static int anInt10412;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "Z")
	public static boolean aBoolean753 = false;

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "[I")
	public static final int[] anIntArray586 = new int[500];

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)Lclient!dw;")
	public static Class83 method8715(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static591.aClass83Array1[arg0] : null;
	}
}
