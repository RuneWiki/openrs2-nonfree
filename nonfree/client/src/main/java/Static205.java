import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "[[S")
	public static short[][] aShortArrayArray15;

	@OriginalMember(owner = "client!hq", name = "N", descriptor = "[Lclient!d;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
	public static int anInt3900 = 0;

	@OriginalMember(owner = "client!hq", name = "E", descriptor = "[I")
	public static final int[] anIntArray339 = new int[32];

	@OriginalMember(owner = "client!hq", name = "H", descriptor = "[I")
	public static final int[] anIntArray340 = new int[14];

	@OriginalMember(owner = "client!hq", name = "M", descriptor = "I")
	public static int anInt3906 = 100;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V")
	public static void method3374() {
		Static550.anImage3 = null;
		Static176.aFont3 = null;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(III)V")
	public static void method3376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(14, arg1);
		local8.method3256();
		local8.anInt3740 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([BIZIII)V")
	public static void method3377(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2;
		@Pc(29) int local29 = arg3 - arg2 >> 2;
		while (true) {
			local29--;
			if (local29 < 0) {
				local29 = arg3 - arg2 & 0x3;
				while (true) {
					local29--;
					if (local29 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(34) int local34 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local34] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg0[local39] = 1;
			arg1 = local44 + 1;
			arg0[local44] = 1;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)I")
	public static int method3378(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
