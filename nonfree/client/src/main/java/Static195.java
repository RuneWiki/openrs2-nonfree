import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jr", name = "Q", descriptor = "Lclient!fs;")
	public static Class76 aClass76_43;

	@OriginalMember(owner = "client!jr", name = "S", descriptor = "I")
	public static int anInt3719;

	@OriginalMember(owner = "client!jr", name = "I", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_167 = new Class22(13, -2);

	@OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
	public static int anInt3714 = 2;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = (Static61.aShort13 - Static14.aShort1) * local7 / 100 + Static14.aShort1;
		@Pc(39) int local39 = local33 * arg1 >> 8;
		@Pc(46) int local46 = 16384 - arg6 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg3 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local39;
		if (local46 != 0) {
			local57 = -local39 * Class50_Sub1.anIntArray225[local46] >> 15;
			local59 = Class50_Sub1.anIntArray224[local46] * local39 >> 15;
		}
		if (local53 != 0) {
			local55 = local59 * Class50_Sub1.anIntArray225[local53] >> 15;
			local59 = Class50_Sub1.anIntArray224[local53] * local59 >> 15;
		}
		Static431.anInt7074 = arg6;
		Static163.anInt3197 = arg0 - local55;
		Static103.anInt2070 = 0;
		Static145.anInt2906 = arg2 - local59;
		Static136.anInt2790 = arg3;
		Static100.anInt2024 = arg4 - local57;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!ji;)V")
	public static void method3074(@OriginalArg(1) Class119 arg0) {
		Static339.aClass119_1 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V")
	public static void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg3) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) long local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg0; local54 < arg3; local54++) {
			if (arg1[local54] < local20 + (long) (local54 & local52)) {
				@Pc(72) long local72 = arg1[local54];
				arg1[local54] = arg1[local16];
				arg1[local16] = local72;
				@Pc(86) Object local86 = arg2[local54];
				arg2[local54] = arg2[local16];
				arg2[local16++] = local86;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method3075(arg0, arg1, arg2, local16 - 1);
		method3075(local16 + 1, arg1, arg2, arg3);
	}
}
