import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static80 {

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
	public static int anInt1660 = 0;

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "Z")
	public static final boolean aBoolean120 = false;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)I")
	public static int method1578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static63.anIntArrayArray6 == null ? 0 : Static63.anIntArrayArray6[arg0][arg1] & 0xFFFFFF;
	}
}
