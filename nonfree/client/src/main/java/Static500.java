import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIBZ)I")
	public static int method7162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class5_Sub48 local10 = Static507.method7441(arg0, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local10.anIntArray524.length; local26++) {
				if (local10.anIntArray523[local26] == arg1) {
					local24 += local10.anIntArray524[local26];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!la;)V")
	public static void method7163(@OriginalArg(1) Class208 arg0) {
		Static486.anInt8160 = arg0.method4986("hitmarks", -77);
		Static460.anInt7842 = arg0.method4986("hitbar_default", 83);
		Static206.anInt3368 = arg0.method4986("timerbar_default", 71);
		Static497.anInt10510 = arg0.method4986("headicons_pk", -102);
		Static346.anInt6094 = arg0.method4986("headicons_prayer", -70);
		Static508.anInt8698 = arg0.method4986("hint_headicons", 31);
		Static424.anInt7312 = arg0.method4986("hint_mapmarkers", 24);
		Static41.anInt728 = arg0.method4986("mapflag", 17);
		Static569.anInt9548 = arg0.method4986("cross", 30);
		Static371.anInt6388 = arg0.method4986("mapdots", -125);
		Static338.anInt6024 = arg0.method4986("scrollbar", -76);
		Static18.anInt303 = arg0.method4986("name_icons", 66);
		Static296.anInt10578 = arg0.method4986("floorshadows", -75);
		Static338.anInt6021 = arg0.method4986("compass", -100);
		Static503.anInt8657 = arg0.method4986("otherlevel", 40);
		Static574.anInt9618 = arg0.method4986("hint_mapedge", 120);
	}
}
