import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_299 = new Class296(21, 7);

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray92 = new int[6][];

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_14 = new Class31(7, 0, 1, 1);

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Lclient!jn;")
	public static final Class155 aClass155_6 = new Class155();

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)Z")
	public static boolean method5897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static184.method6133(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static451.anInt7905;
			@Pc(14) int local14 = arg2 << Static451.anInt7905;
			return Static393.method5943(local10 + 1, Static544.aClass205Array3[arg0].ba(arg1, arg2) + arg3, local14 + 1) && Static393.method5943(local10 + Static201.anInt3950 - 1, Static544.aClass205Array3[arg0].ba(arg1 + 1, arg2) + arg3, local14 + 1) && Static393.method5943(local10 + Static201.anInt3950 - 1, Static544.aClass205Array3[arg0].ba(arg1 + 1, arg2 + 1) + arg3, local14 + Static201.anInt3950 - 1) && Static393.method5943(local10 + 1, Static544.aClass205Array3[arg0].ba(arg1, arg2 + 1) + arg3, local14 + Static201.anInt3950 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ud;ILclient!r;IIB)V")
	public static void method5898(@OriginalArg(0) Class291 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != null) {
			arg0.method6635(arg2.e(), arg2.Q(), arg3, arg1, arg2.wa(), arg4, arg2.TA(), arg2.va(), arg2.U(), arg2.n());
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
	public static int method5899(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)V")
	public static void method5900(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub1_Sub11 local17 = Static541.method7520(1, arg0);
		local17.method4945();
	}
}
