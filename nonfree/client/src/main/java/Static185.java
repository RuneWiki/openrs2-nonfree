import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static185 {

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
	public static int anInt3250 = 0;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
	public static int anInt3257 = -1;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(CI)Z")
	public static boolean method2798(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
