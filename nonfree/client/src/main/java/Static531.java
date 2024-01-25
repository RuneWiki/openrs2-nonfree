import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!sda", name = "T", descriptor = "D")
	public static double aDouble154;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	public static void method7382() {
		Static122.anInt2160 = Static173.aClass151_4.anInt3921 + Static173.aClass151_4.anInt3915 + 2;
		Static241.aStringArray30 = new String[500];
		Static293.anInt4943 = Static462.aClass151_12.anInt3921 + Static462.aClass151_12.anInt3915 + 2;
		for (@Pc(28) int local28 = 0; local28 < Static241.aStringArray30.length; local28++) {
			Static241.aStringArray30[local28] = "";
		}
		Static67.method1187(Static52.aClass41_1.method1007(Static616.anInt10077));
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class6_Sub45 local7 = null;
		for (@Pc(12) Class6_Sub45 local12 = (Class6_Sub45) Static464.aClass362_52.method8538(); local12 != null; local12 = (Class6_Sub45) Static464.aClass362_52.method8530()) {
			if (local12.anInt8116 == arg4 && arg6 == local12.anInt8112 && local12.anInt8113 == arg0 && arg2 == local12.anInt8107) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub45();
			local7.anInt8113 = arg0;
			local7.anInt8112 = arg6;
			local7.anInt8116 = arg4;
			local7.anInt8107 = arg2;
			if (arg6 >= 0 && arg0 >= 0 && arg6 < Static491.anInt9856 && Static393.anInt6574 > arg0) {
				Static418.method6241(local7);
			}
			Static464.aClass362_52.method8536(local7);
		}
		local7.anInt8110 = arg1;
		local7.aBoolean559 = true;
		local7.anInt8115 = arg5;
		local7.aBoolean558 = false;
		local7.anInt8109 = arg3;
	}
}
