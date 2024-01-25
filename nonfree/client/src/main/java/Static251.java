import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ir", name = "E", descriptor = "Lclient!cc;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!ir", name = "H", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_11 = new Class101(6, 3);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIILclient!ha;III)Lclient!ka;")
	public static Class92 method4466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class92 local12 = (Class92) Static241.aClass94_21.method2960(local6);
		if (local12 == null) {
			@Pc(22) Class192 local22 = Static63.method1779(Static450.aClass223_101, arg4);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt6632 < 13) {
				local22.method5549();
			}
			local12 = arg3.method6153(local22, 2055, Static203.anInt4455, 64, 768);
			Static241.aClass94_21.method2963(local6, local12);
		}
		local12 = local12.method7069((byte) 2, 2055, true);
		if (arg1 != 0) {
			local12.a(arg1);
		}
		if (arg2 != 0) {
			local12.FA(arg2);
		}
		if (arg0 != 0) {
			local12.VA(arg0);
		}
		if (arg5 != 0) {
			local12.H(0, arg5, 0);
		}
		return local12;
	}
}
