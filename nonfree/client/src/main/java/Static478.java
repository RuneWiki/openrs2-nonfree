import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "Lclient!iv;")
	public static final Class174 aClass174_6 = new Class174("stellardawn", 1);

	@OriginalMember(owner = "client!qia", name = "k", descriptor = "Z")
	public static final boolean aBoolean592 = false;

	@OriginalMember(owner = "client!qia", name = "l", descriptor = "I")
	public static int anInt8275 = -1;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IIIIIBII)V")
	public static void method7028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) Class5_Sub47 local13 = null;
		for (@Pc(18) Class5_Sub47 local18 = (Class5_Sub47) Static59.aClass124_60.method2572(); local18 != null; local18 = (Class5_Sub47) Static59.aClass124_60.method2569()) {
			if (arg3 == local18.anInt9032 && local18.anInt9036 == arg0 && arg5 == local18.anInt9031 && arg4 == local18.anInt9033) {
				local13 = local18;
				break;
			}
		}
		if (local13 == null) {
			local13 = new Class5_Sub47();
			local13.anInt9031 = arg5;
			local13.anInt9032 = arg3;
			local13.anInt9033 = arg4;
			local13.anInt9036 = arg0;
			if (arg0 >= 0 && arg5 >= 0 && Static124.anInt2150 > arg0 && Static64.anInt1015 > arg5) {
				Static402.method5885(local13);
			}
			Static59.aClass124_60.method2574(local13);
		}
		local13.aBoolean650 = true;
		local13.anInt9038 = arg2;
		local13.aBoolean651 = false;
		local13.anInt9037 = arg6;
		local13.anInt9035 = arg1;
	}
}
