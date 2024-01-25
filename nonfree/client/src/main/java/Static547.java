import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
	public static int anInt9707;

	@OriginalMember(owner = "client!vaa", name = "s", descriptor = "Lclient!og;")
	public static final Class247 aClass247_4 = new Class247(0);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZI)Z")
	public static boolean method7951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static321.method5320(arg1, arg0) | (arg0 & 0x60000) != 0 || Static363.method5856(arg0, arg1) || Static261.method4412(arg0, arg1);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIZI)V")
	public static void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg3;
		@Pc(14) int local14 = arg0 - arg1;
		if (local14 == 0) {
			if (local10 != 0) {
				Static134.method2659(arg1, arg3, arg2, arg4);
			}
		} else if (local10 == 0) {
			Static533.method7756(arg3, arg0, arg1, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(54) boolean local54 = local14 < local10;
			@Pc(58) int local58;
			@Pc(60) int local60;
			if (local54) {
				local58 = arg1;
				local60 = arg0;
				arg1 = arg3;
				arg3 = local58;
				arg0 = arg2;
				arg2 = local60;
			}
			if (arg1 > arg0) {
				local58 = arg1;
				local60 = arg3;
				arg1 = arg0;
				arg0 = local58;
				arg3 = arg2;
				arg2 = local60;
			}
			local58 = arg3;
			local60 = arg0 - arg1;
			@Pc(99) int local99 = arg2 - arg3;
			@Pc(104) int local104 = -(local60 >> 1);
			if (local99 < 0) {
				local99 = -local99;
			}
			@Pc(123) int local123 = arg3 < arg2 ? 1 : -1;
			@Pc(127) int local127;
			if (local54) {
				for (local127 = arg1; local127 <= arg0; local127++) {
					local104 += local99;
					Static46.anIntArrayArray4[local127][local58] = arg4;
					if (local104 > 0) {
						local104 -= local60;
						local58 += local123;
					}
				}
			} else {
				for (local127 = arg1; local127 <= arg0; local127++) {
					local104 += local99;
					Static46.anIntArrayArray4[local58][local127] = arg4;
					if (local104 > 0) {
						local58 += local123;
						local104 -= local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIII)I")
	public static int method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(26) int local26 = (arg2 * (arg1 & 0xFF00) & 0xFF0000 | arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(31) int local31 = 255 - arg2;
		return local26 + (((arg0 & 0xFF00FF) * local31 & 0xFF00FF00 | local31 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V")
	public static void method7956(@OriginalArg(1) int arg0) {
		Static303.method5190(Static590.aClass364_16.method8334(Static154.anInt3181), arg0);
	}
}
