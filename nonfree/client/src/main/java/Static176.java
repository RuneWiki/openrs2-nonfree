import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static176 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	public static int anInt3771 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)I")
	public static int method3345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static68.aByteArrayArray6 == null ? 0 : Static68.aByteArrayArray6[arg0][arg1] & 0xFF;
	}
}
