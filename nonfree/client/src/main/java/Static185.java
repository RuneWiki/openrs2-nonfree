import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static185 {

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
	public static int anInt3160;

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "Lclient!tf;")
	public static Class17 aClass17_28;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I")
	public static int method2931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static392.aShortArrayArray14 == null ? 0 : Static392.aShortArrayArray14[arg0][arg1] & 0xFFFF;
	}
}
