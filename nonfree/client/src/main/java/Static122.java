import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Z")
	public static boolean aBoolean139 = true;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	public static int anInt2094 = -1;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!gk;B)Lclient!ub;")
	public static Class333 method1727(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(12) int local12 = arg0.method4518();
		return new Class333(local12);
	}
}
