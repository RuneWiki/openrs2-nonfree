import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Z")
	public static boolean aBoolean217 = true;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I")
	public static int method2570() {
		return Static404.anInt6641;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZZI)I")
	public static int method2571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class2_Sub16 local10 = Static261.method3663(arg1, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(24) int local24 = 0; local24 < local10.anIntArray215.length; local24++) {
			if (local10.anIntArray215[local24] >= 0 && local10.anIntArray215[local24] < Static466.aClass130_2.anInt2699) {
				@Pc(46) Class164 local46 = Static466.aClass130_2.method2311(local10.anIntArray215[local24]);
				@Pc(56) int local56 = local46.method3320(Static537.aClass191_2.method3971(arg0).anInt1160, arg0);
				if (arg2) {
					local16 += local10.anIntArray214[local24] * local56;
				} else {
					local16 += local56;
				}
			}
		}
		return local16;
	}
}
