import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "[I")
	public static int[] anIntArray468;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBLclient!qs;)Lclient!qm;")
	public static Class209 method3772(@OriginalArg(0) int arg0, @OriginalArg(2) Class211 arg1) {
		@Pc(13) byte[] local13 = arg1.method4774(arg0);
		return local13 == null ? null : new Class209(local13);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public static void method3773() {
		Static44.anIntArray557 = null;
		Static11.anIntArray11 = null;
		Static459.anIntArray752 = null;
		Static125.anIntArray290 = null;
		Static332.anIntArray599 = null;
		Static332.aBoolean408 = false;
	}
}
