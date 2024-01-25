import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
	public static int anInt1459;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
	public static final int[] anIntArray140 = new int[4096];

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_35 = new Class88("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "Lclient!dk;")
	public static final Class72 aClass72_1 = new Class72(1);

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
	public static int anInt1462 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!qa;IIIIIZ)Lclient!r;")
	public static Class26 method1452(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class26 local12 = (Class26) Static3.aClass125_1.method3446(local6);
		if (local12 == null) {
			@Pc(22) Class192 local22 = Static510.method7591(arg4, Static103.aClass16_21);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt5552 < 13) {
				local22.method4657();
			}
			local12 = arg0.method5812(local22, 2055, Static171.anInt3908, 64, 768);
			Static3.aClass125_1.method3437(local12, local6);
		}
		local12 = local12.method7992((byte) 2, 2055, true);
		if (arg1 != 0) {
			local12.OA(arg1);
		}
		if (arg3 != 0) {
			local12.D(arg3);
		}
		if (arg2 != 0) {
			local12.b(arg2);
		}
		if (arg5 != 0) {
			local12.ca(0, arg5, 0);
		}
		return local12;
	}
}
