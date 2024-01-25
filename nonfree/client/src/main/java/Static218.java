import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!o", name = "v", descriptor = "[S")
	public static short[] aShortArray72;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[128][128];

	@OriginalMember(owner = "client!o", name = "r", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray82 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!o", name = "t", descriptor = "[I")
	public static final int[] anIntArray376 = new int[200];

	@OriginalMember(owner = "client!o", name = "u", descriptor = "I")
	public static int anInt4556 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!fd;)Z")
	public static boolean method3765(@OriginalArg(1) Class72 arg0) {
		if (arg0.anIntArray189 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray189.length; local12++) {
			@Pc(21) int local21 = Static1.method1(local12, arg0);
			@Pc(26) int local26 = arg0.anIntArray192[local12];
			if (arg0.anIntArray189[local12] == 2) {
				if (local21 >= local26) {
					return false;
				}
			} else if (arg0.anIntArray189[local12] == 3) {
				if (local26 >= local21) {
					return false;
				}
			} else if (arg0.anIntArray189[local12] == 4) {
				if (local26 == local21) {
					return false;
				}
			} else if (local21 != local26) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method3767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg2 && arg3 == arg7 && arg8 == arg1 && arg5 == arg6) {
			Static238.method4095(arg7, arg2, arg8, arg6, arg4);
			return;
		}
		@Pc(27) int local27 = arg2;
		@Pc(29) int local29 = arg7;
		@Pc(33) int local33 = arg2 * 3;
		@Pc(37) int local37 = arg7 * 3;
		@Pc(41) int local41 = arg0 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg1 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(62) int local62 = arg8 + local41 - local49 - arg2;
		@Pc(73) int local73 = arg6 + local45 - local53 - arg7;
		@Pc(82) int local82 = local49 + local33 - local41 - local41;
		@Pc(93) int local93 = local53 + local37 - local45 - local45;
		@Pc(98) int local98 = local41 - local33;
		@Pc(103) int local103 = local45 - local37;
		for (@Pc(105) int local105 = 128; local105 <= 4096; local105 += 128) {
			@Pc(113) int local113 = local105 * local105 >> 12;
			@Pc(119) int local119 = local113 * local105 >> 12;
			@Pc(123) int local123 = local119 * local62;
			@Pc(127) int local127 = local119 * local73;
			@Pc(131) int local131 = local82 * local113;
			@Pc(135) int local135 = local93 * local113;
			@Pc(139) int local139 = local98 * local105;
			@Pc(143) int local143 = local105 * local103;
			@Pc(154) int local154 = arg2 + (local131 + local123 + local139 >> 12);
			@Pc(165) int local165 = (local143 + local127 + local135 >> 12) + arg7;
			Static238.method4095(local29, local27, local154, local165, arg4);
			local29 = local165;
			local27 = local154;
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	public static void method3769() {
		Static322.aClass154_100.method4212();
	}
}
