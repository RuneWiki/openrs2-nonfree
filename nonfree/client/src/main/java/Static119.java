import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "[J")
	public static long[] aLongArray4;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILclient!r;IIBI)Lclient!da;")
	public static Class33 method1046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) long local14 = (long) arg1;
		@Pc(20) Class33 local20 = (Class33) Static124.aClass21_95.method324(local14);
		if (local20 == null) {
			@Pc(30) Class13 local30 = Static25.method356(arg1, Static463.aClass229_106);
			if (local30 == null) {
				return null;
			}
			if (local30.anInt319 < 13) {
				local30.method245();
			}
			local20 = arg2.method6839(local30, 2055, Static399.anInt6591, 64, 768);
			Static124.aClass21_95.method317(local20, local14);
		}
		local20 = local20.method7200((byte) 2, 2055, true);
		if (arg4 != 0) {
			local20.M(arg4);
		}
		if (arg3 != 0) {
			local20.MA(arg3);
		}
		if (arg5 != 0) {
			local20.W(arg5);
		}
		if (arg0 != 0) {
			local20.oa(0, arg0, 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[B)Z")
	public static boolean method1055(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub7 local8 = new Class2_Sub7(arg0);
		@Pc(12) int local12 = local8.method4464();
		if (local12 != 2) {
			return false;
		}
		@Pc(42) boolean local42 = local8.method4464() == 1;
		if (local42) {
			Static465.method5997(local8);
		}
		Static480.method6207(local8);
		return true;
	}
}
