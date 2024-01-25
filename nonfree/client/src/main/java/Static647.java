import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "[Lclient!gda;")
	public static Class119[] aClass119Array1;

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_112 = new Class341(20, -1);

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "Lclient!saa;")
	public static final Class327 aClass327_5 = new Class327();

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "[I")
	public static final int[] anIntArray583 = new int[1];

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)Lclient!uf;")
	public static Class357 method9532(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static111.aClass357ArrayArray1[local7] == null || Static111.aClass357ArrayArray1[local7][local16] == null) {
			@Pc(30) boolean local30 = Static39.method9317(local7);
			if (!local30) {
				return null;
			}
		}
		return Static111.aClass357ArrayArray1[local7][local16];
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(II)V")
	public static void method9533(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static505.aBooleanArray62[arg0]) {
			Static78.aClass124_20.method3625(arg0);
			Static111.aClass357ArrayArray1[arg0] = null;
			Static604.aClass357ArrayArray2[arg0] = null;
			Static505.aBooleanArray62[arg0] = false;
		}
	}
}
