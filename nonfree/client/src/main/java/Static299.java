import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!m;")
	public static Class22 aClass22_8;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public static int anInt4491 = 100;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII[BB)V")
	public static void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(20) int local20 = arg0 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg0 - arg2 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(34) int local34 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg3[local39] = 1;
			arg1 = local44 + 1;
			arg3[local44] = 1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)V")
	public static void method3937(@OriginalArg(0) int arg0) {
		Static321.anInt6090 = arg0;
		Static186.aClass316_22.method7794();
	}
}
