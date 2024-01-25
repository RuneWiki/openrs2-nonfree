import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!sba;")
	public static Class302 aClass302_10;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_134 = new Class73(99, 0);

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_135 = new Class73(44, 4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ni;[ILclient!ni;)V")
	public static void method6220(@OriginalArg(1) Class223 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class223 arg2) {
		if (arg1 != null) {
			Static6.anIntArray10 = arg1;
		}
		Static379.aClass223_80 = arg0;
		Static347.aClass223_72 = arg2;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public static void method6223(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub5_Sub19 local10 = Static348.method5721(arg0, 14);
		local10.method5174();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)I")
	public static int method6225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static636.anIntArray479[arg1 & 0x3] : Static264.anIntArray236[arg1 & 0x3];
	}
}
