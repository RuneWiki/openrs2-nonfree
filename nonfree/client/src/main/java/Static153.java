import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "Lclient!qw;")
	public static Class302 aClass302_15 = new Class302();

	@OriginalMember(owner = "client!ew", name = "I", descriptor = "I")
	public static int anInt2833 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I")
	public static int method2450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static465.aShortArrayArray8 == null ? 0 : Static465.aShortArrayArray8[arg0][arg1] & 0xFFFF;
	}
}
