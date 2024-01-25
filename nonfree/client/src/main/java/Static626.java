import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static626 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public static int anInt10336;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Z")
	public static final boolean aBoolean869 = true;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I")
	public static int method8490() {
		if (Static385.aFrame149 == null) {
			return Static374.aBoolean618 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
	public static boolean method8491(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static578.method8021(arg1, arg0) & Static11.method118(arg0, arg1);
	}
}
