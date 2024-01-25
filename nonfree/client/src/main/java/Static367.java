import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
	public static int anInt6860;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
	public static int anInt6861;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
	public static int anInt6862;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
	public static int anInt6859 = -1;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIB)I")
	public static int method5593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static380.anIntArray549[arg0 & 0x3] : Static287.anIntArray397[arg0 & 0x3];
	}
}
