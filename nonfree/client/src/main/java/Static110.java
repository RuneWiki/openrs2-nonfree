import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BII)Z")
	public static boolean method1655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIII)V")
	public static void method1656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg0 * Static72.aClass2_Sub12_Sub1_1.anInt1918 >> 8;
		if (local6 != 0 && arg2 != -1) {
			Static24.method443(local6, Static338.aClass259_107, arg2);
			Static242.aBoolean363 = true;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z[IIIIIII)Z")
	public static boolean method1657(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static98.anInt2032 < arg3) {
			arg3 = Static98.anInt2032;
		}
		if (arg5 < 0) {
			arg5 = 0;
		}
		if (arg5 >= arg3) {
			return true;
		}
		arg4 += arg5 * arg1;
		@Pc(39) int local39 = arg3 - arg5 >> 2;
		arg2 += arg5 - 1;
		@Pc(55) int local55;
		@Pc(65) int local65;
		if (Static367.anInt6528 == 1) {
			Static228.anInt4256 += local39;
			while (true) {
				local39--;
				if (local39 < 0) {
					local39 = arg3 - arg5 & 0x3;
					while (true) {
						local39--;
						if (local39 < 0) {
							return true;
						}
						arg2++;
						if (arg4 < arg0[arg2]) {
							arg0[arg2] = arg4;
						}
						arg4 += arg1;
					}
				}
				local55 = arg2 + 1;
				if (arg0[local55] > arg4) {
					arg0[local55] = arg4;
				}
				local65 = arg4 + arg1;
				local55++;
				if (local65 < arg0[local55]) {
					arg0[local55] = local65;
				}
				local65 += arg1;
				local55++;
				if (arg0[local55] > local65) {
					arg0[local55] = local65;
				}
				local65 += arg1;
				arg2 = local55 + 1;
				if (arg0[arg2] > local65) {
					arg0[arg2] = local65;
				}
				arg4 = local65 + arg1;
			}
		} else {
			arg4 -= 15360;
			while (true) {
				local39--;
				if (local39 < 0) {
					local39 = arg3 - arg5 & 0x3;
					while (true) {
						local39--;
						if (local39 < 0) {
							return true;
						}
						arg2++;
						if (arg0[arg2] > arg4) {
							return false;
						}
						arg4 += arg1;
					}
				}
				local55 = arg2 + 1;
				if (arg0[local55] > arg4) {
					return false;
				}
				local65 = arg4 + arg1;
				local55++;
				if (arg0[local55] > local65) {
					return false;
				}
				local65 += arg1;
				local55++;
				if (local65 < arg0[local55]) {
					return false;
				}
				local65 += arg1;
				@Pc(96) int local96 = ~local65;
				arg2 = local55 + 1;
				if (local96 > ~arg0[arg2]) {
					return false;
				}
				arg4 = local65 + arg1;
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V")
	public static void method1658(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub3_Sub13 local14 = Static382.method5650(4, arg0);
		local14.method6095();
	}
}
