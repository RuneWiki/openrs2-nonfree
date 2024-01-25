import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "[I")
	public static final int[] anIntArray8 = new int[500];

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_8 = new Class151(63, 1);

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_4 = new Class216(25, 0);

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_9 = new Class151(114, 1);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method143(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static180.method8496(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!iha;)V")
	public static void method145(@OriginalArg(1) Class165 arg0) {
		Static678.aClass165_1 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V")
	public static void method146(@OriginalArg(0) int arg0) {
		Static194.aLong106 = 1000000000L / (long) arg0;
	}
}
