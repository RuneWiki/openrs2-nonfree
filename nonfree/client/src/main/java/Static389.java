import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([BI)V")
	public static void method5810(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class14_Sub29 local10 = new Class14_Sub29(arg0);
		@Pc(12) boolean local12 = false;
		while (true) {
			while (true) {
				@Pc(16) int local16 = local10.method5866();
				@Pc(64) int local64;
				if (local16 == 0) {
					if (local12) {
						return;
					}
					if (Static390.anIntArray526 == null) {
						Static534.anInt9229 = 4;
						Static173.anIntArray282 = new int[4];
						Static390.anIntArray526 = new int[4];
					}
					for (local64 = 0; local64 < Static390.anIntArray526.length; local64++) {
						Static390.anIntArray526[local64] = 0;
						Static173.anIntArray282[local64] = local64 * 20;
					}
					return;
				}
				if (local16 == 1) {
					if (Static390.anIntArray526 == null) {
						Static534.anInt9229 = 4;
						Static173.anIntArray282 = new int[4];
						Static390.anIntArray526 = new int[4];
					}
					local12 = true;
					for (local64 = 0; local64 < Static390.anIntArray526.length; local64++) {
						Static390.anIntArray526[local64] = local10.method5890();
						Static173.anIntArray282[local64] = local10.method5890();
					}
				} else if (local16 == 2) {
					Static213.anInt4055 = local10.method5900();
				} else if (local16 == 3) {
					Static534.anInt9229 = local10.method5866();
					Static173.anIntArray282 = new int[Static534.anInt9229];
					Static390.anIntArray526 = new int[Static534.anInt9229];
				}
			}
		}
	}
}
