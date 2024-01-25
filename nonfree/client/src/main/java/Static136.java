import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	public static int anInt2916;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "[Lclient!sa;")
	public static Class8[] aClass8Array3;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)Lclient!g;")
	public static Class79 method2691(@OriginalArg(1) int arg0) {
		@Pc(5) Class103 local5 = Static251.aClass103_67;
		@Pc(14) Class79 local14;
		synchronized (Static251.aClass103_67) {
			local14 = (Class79) Static251.aClass103_67.method2682((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(35) byte[] local35 = Static152.aClass180_40.method4560(arg0, 32);
		local14 = new Class79();
		if (local35 != null) {
			local14.method1980(new Class7_Sub3(local35));
		}
		local14.method1979();
		@Pc(53) Class103 local53 = Static251.aClass103_67;
		synchronized (Static251.aClass103_67) {
			Static251.aClass103_67.method2687(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIBIIZ)V")
	public static void method2692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static42.anInt1095 = arg4;
		Static109.anInt60 = arg0;
		Static198.anInt3898 = arg2;
		Static318.anInt614 = arg1;
		Static52.anInt1396 = arg3;
		if (arg5 && Static109.anInt60 >= 100) {
			Static203.anInt4014 = Static198.anInt3898 * 128 + 64;
			Static24.anInt478 = Static318.anInt614 * 128 + 64;
			Static271.anInt5361 = Static341.method5540(Static168.anInt3508, Static24.anInt478, Static203.anInt4014) - Static52.anInt1396;
		}
		Static118.anInt6324 = 2;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method2693(@OriginalArg(0) Class180 arg0) {
		Static108.aClass180_14 = arg0;
	}
}
