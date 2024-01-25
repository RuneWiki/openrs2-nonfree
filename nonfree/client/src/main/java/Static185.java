import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array134;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray170 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIILclient!qa;)Lclient!c;")
	public static Class33 method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class128 arg5) {
		@Pc(11) long local11 = (long) arg4;
		@Pc(17) Class33 local17 = (Class33) Static23.aClass167_7.method3386(local11);
		if (local17 == null) {
			@Pc(27) Class199 local27 = Static443.method4784(Static258.aClass113_80, arg4);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt5301 < 13) {
				local27.method4137();
			}
			local17 = arg5.method3602(local27, 2055, Static63.anInt1127, 64, 768);
			Static23.aClass167_7.method3392(local17, local11);
		}
		local17 = local17.method5383((byte) 2, 2055, true);
		if (arg1 != 0) {
			local17.k(arg1);
		}
		if (arg3 != 0) {
			local17.WA(arg3);
		}
		if (arg2 != 0) {
			local17.o(arg2);
		}
		if (arg0 != 0) {
			local17.ja(0, arg0, 0);
		}
		return local17;
	}
}
