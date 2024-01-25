import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!tfa", name = "N", descriptor = "Lclient!el;")
	public static final Class109 aClass109_202 = new Class109(0, 6);

	@OriginalMember(owner = "client!tfa", name = "F", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_106 = new Class387(24, 3);

	@OriginalMember(owner = "client!tfa", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[128][128];

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)I")
	public static int method8179() {
		@Pc(5) Class391 local5 = Static320.aClass391_27;
		synchronized (Static320.aClass391_27) {
			return Static320.aClass391_27.method9281();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "(III)Z")
	public static boolean method8182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
