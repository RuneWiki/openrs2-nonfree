import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eq", name = "S", descriptor = "Lclient!me;")
	public static final Class220 aClass220_1 = new Class220();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class1_Sub20 local7 = null;
		for (@Pc(12) Class1_Sub20 local12 = (Class1_Sub20) Static27.aClass353_3.method7677(); local12 != null; local12 = (Class1_Sub20) Static27.aClass353_3.method7687()) {
			if (arg3 == local12.anInt2942 && local12.anInt2953 == arg1 && local12.anInt2957 == arg4 && arg0 == local12.anInt2955) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub20();
			local7.anInt2942 = arg3;
			local7.anInt2957 = arg4;
			local7.anInt2955 = arg0;
			local7.anInt2953 = arg1;
			if (arg1 >= 0 && arg4 >= 0 && arg1 < Static71.anInt1410 && Static471.anInt8012 > arg4) {
				Static192.method2939(local7);
			}
			Static27.aClass353_3.method7679(local7);
		}
		local7.anInt2956 = 0;
		local7.anInt2952 = arg2;
		local7.anInt2946 = arg5;
		local7.anInt2944 = arg6;
		local7.anInt2945 = -1;
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)[Lclient!ut;")
	public static Class335[] method1872() {
		return new Class335[] { Static224.aClass335_17, Static59.aClass335_5, Static511.aClass335_18 };
	}
}
