import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
	public static int anInt2743 = 0;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Z")
	public static boolean method2624(@OriginalArg(1) int arg0) {
		if (Static90.aBooleanArray6[arg0]) {
			return true;
		} else if (Static74.aClass143_99.method3759(arg0)) {
			@Pc(23) int local23 = Static74.aClass143_99.method3732(arg0);
			if (local23 == 0) {
				Static90.aBooleanArray6[arg0] = true;
				return true;
			}
			if (Static182.aClass146ArrayArray1[arg0] == null) {
				Static182.aClass146ArrayArray1[arg0] = new Class146[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static182.aClass146ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static74.aClass143_99.method3745(arg0, local45);
					if (local59 != null) {
						@Pc(71) Class146 local71 = Static182.aClass146ArrayArray1[arg0][local45] = new Class146();
						local71.anInt4214 = (arg0 << 16) + local45;
						if (local59[0] == -1) {
							local71.method3800(new Class14_Sub4(local59));
						} else {
							local71.method3807(new Class14_Sub4(local59));
						}
					}
				}
			}
			Static90.aBooleanArray6[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
