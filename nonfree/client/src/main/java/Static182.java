import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Lclient!gw;")
	public static Class140 aClass140_1;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public static int anInt4015;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "[I")
	public static final int[] anIntArray277 = new int[4];

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[8];

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
	public static int anInt4021 = -1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([BBIIII)V")
	public static void method3301(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(20) int local20 = arg1 - arg2 >> 2;
		arg3 += arg2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg1 - arg2 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(34) int local34 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local34] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg0[local39] = 1;
			arg3 = local44 + 1;
			arg0[local44] = 1;
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIII)Z")
	public static boolean method3302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static417.aBoolean571 || !Static253.aBoolean399) {
			return false;
		} else if (Static141.anInt3106 < 100) {
			return false;
		} else {
			@Pc(24) int local24 = Static22.anIntArrayArrayArray21[arg0][arg2][arg1];
			if (-Static411.anInt7540 == local24) {
				return false;
			} else if (Static411.anInt7540 == local24) {
				return true;
			} else if (Static331.aClass112Array3 == Static164.aClass112Array1) {
				return false;
			} else {
				@Pc(48) int local48 = arg2 << Static415.anInt7579;
				@Pc(52) int local52 = arg1 << Static415.anInt7579;
				if (Static99.method1690(local52 + Static312.anInt5690 - 1, Static312.anInt5690 + local52 - 1, local48 + Static312.anInt5690 - 1, Static331.aClass112Array3[arg0].method7819(arg1 - -1, arg2), local52 + 1, Static331.aClass112Array3[arg0].method7819(arg1 - -1, arg2 + 1), local48 + 1, local48 + 1, Static331.aClass112Array3[arg0].method7819(arg1, arg2)) && Static99.method1690(local52 + 1, local52 - -Static312.anInt5690 + -1, Static312.anInt5690 + local48 - 1, Static331.aClass112Array3[arg0].method7819(arg1 - -1, arg2 + 1), local52 + 1, Static331.aClass112Array3[arg0].method7819(arg1, arg2 + 1), Static312.anInt5690 + local48 - 1, local48 + 1, Static331.aClass112Array3[arg0].method7819(arg1, arg2))) {
					Static451.anInt7925++;
					Static22.anIntArrayArrayArray21[arg0][arg2][arg1] = Static411.anInt7540;
					return true;
				} else {
					Static22.anIntArrayArrayArray21[arg0][arg2][arg1] = -Static411.anInt7540;
					return false;
				}
			}
		}
	}
}
