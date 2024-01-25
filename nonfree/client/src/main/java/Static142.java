import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static142 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "Lclient!za;")
	public static Class50 aClass50_5;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
	public static int anInt2891;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
	public static boolean aBoolean211;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)I")
	public static int method2406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static452.aShortArrayArray4 == null ? 0 : Static452.aShortArrayArray4[arg0][arg1] & 0xFFFF;
	}
}
