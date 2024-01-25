import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static321 {

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "[Lclient!ha;")
	public static Class104[] aClass104Array55;

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
	public static int anInt6064;

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "[I")
	public static final int[] anIntArray479 = new int[32];

	@OriginalMember(owner = "client!ng", name = "S", descriptor = "[I")
	public static final int[] anIntArray480 = new int[4096];

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(II)I")
	public static int method5504(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
