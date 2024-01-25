import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "Z")
	public static boolean aBoolean311 = false;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)Z")
	public static boolean method3860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static551.method7578(arg0, arg1)) {
			return Static173.method8449(arg0, arg1) | (arg1 & 0x9000) != 0 | Static24.method446(arg1, arg0) ? true : ((arg1 & 0x2000) != 0 | Static256.method3530(arg1, arg0) | Static555.method7621(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	public static void method3861() {
		@Pc(1) Class32 local1 = Static256.aClass32_44;
		synchronized (Static256.aClass32_44) {
			Static256.aClass32_44.method640();
		}
		local1 = Static136.aClass32_86;
		synchronized (Static136.aClass32_86) {
			Static136.aClass32_86.method640();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)V")
	public static void method3862(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub4 local12 = Static566.method7763(arg0, 12);
		local12.method669();
	}
}
