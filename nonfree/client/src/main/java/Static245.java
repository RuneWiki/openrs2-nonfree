import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!jo;")
	public static Class168 aClass168_61;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Z")
	public static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)V")
	public static void method4270(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(10, arg0);
		local8.method3828();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILclient!oa;II)Lclient!ba;")
	public static Class23 method4275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg1;
		@Pc(12) Class23 local12 = (Class23) Static406.aClass245_73.method6082(local6);
		if (local12 == null) {
			@Pc(27) Class260 local27 = Static198.method3731(arg1, Static406.aClass168_127);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt7693 < 13) {
				local27.method6423();
			}
			local12 = arg3.method5404(local27, 2055, Static236.anInt4818, 64, 768);
			Static406.aClass245_73.method6075(local12, local6);
		}
		local12 = local12.method7068((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.I(arg4);
		}
		if (arg0 != 0) {
			local12.AA(arg0);
		}
		if (arg2 != 0) {
			local12.v(arg2);
		}
		if (arg5 != 0) {
			local12.m(0, arg5, 0);
		}
		return local12;
	}
}
