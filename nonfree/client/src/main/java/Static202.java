import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static202 {

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
	public static int anInt3741 = 0;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)I")
	public static int method3339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static315.aByteArrayArray14 == null ? 0 : Static315.aByteArrayArray14[arg0][arg1] & 0xFF;
	}
}
