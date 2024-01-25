import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
	public static int anInt6320;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
	public static final int[] anIntArray490 = new int[1];

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_127 = new Class136(75, 28);

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt6318 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
	public static int method5607(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
