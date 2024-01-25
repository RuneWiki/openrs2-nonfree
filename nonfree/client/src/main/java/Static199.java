import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString38 = "";

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!go;)Z")
	public static boolean method2855(@OriginalArg(1) Class95 arg0) {
		if (arg0.anInt2607 == Static431.anInt7203) {
			Static59.anInt1060 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZ)I")
	public static int method2856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class7_Sub27 local8 = Static288.method3810(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray324.length) {
			return local8.anIntArray324[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)Z")
	public static boolean method2857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static366.method4713(arg0, arg1) || Static141.method2175(arg1, arg0) || Static339.method4423(arg1, arg0);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(III)I")
	public static int method2858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static459.anIntArray590[arg0 & 0x3] : 256;
	}
}
