import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
	public static int anInt7005 = -1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZII)Lclient!vi;")
	public static Class3_Sub49 method5861(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub49 local7 = new Class3_Sub49();
		local7.anInt8837 = arg2;
		local7.anInt8836 = arg0;
		Static216.aClass354_18.method7691(local7, (long) arg3);
		Static397.method5786(arg0);
		@Pc(33) Class361 local33 = Static265.method4040(arg3);
		if (local33 != null) {
			Static186.method3170(local33);
		}
		if (Static19.aClass361_1 != null) {
			Static186.method3170(Static19.aClass361_1);
			Static19.aClass361_1 = null;
		}
		Static183.method3139();
		if (local33 != null) {
			Static70.method1495(!arg1, local33);
		}
		if (!arg1) {
			Static312.method4561(arg0);
		}
		if (!arg1 && Static353.anInt6188 != -1) {
			Static556.method7355(Static353.anInt6188, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static293.method3974(arg2)) {
			if (Static259.aClass361ArrayArray1[arg2] == null) {
				Static90.method1712(arg1, arg4, arg0, Static380.aClass361ArrayArray2[arg2], arg6, arg7, -1, arg3, arg5);
			} else {
				Static90.method1712(arg1, arg4, arg0, Static259.aClass361ArrayArray1[arg2], arg6, arg7, -1, arg3, arg5);
			}
		} else if (arg6 == -1) {
			for (@Pc(32) int local32 = 0; local32 < 100; local32++) {
				Static319.aBooleanArray17[local32] = true;
			}
		} else {
			Static319.aBooleanArray17[arg6] = true;
		}
	}
}
