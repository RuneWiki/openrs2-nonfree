import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!up", name = "N", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_99 = new Class267(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!up", name = "U", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_100 = new Class267("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIII)V")
	public static void method6009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static386.anInt6857; local3++) {
			@Pc(9) Rectangle local9 = Class12_Sub2.aRectangleArray1[local3];
			if (local9.width + local9.x > arg1 && local9.x < arg1 + arg2 && arg0 < local9.height + local9.y && local9.y < arg0 + arg3) {
				Static256.aBooleanArray16[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!fs;Lclient!hr;IIIILclient!ts;Lclient!mo;IIBLjava/lang/String;)V")
	public static void method6011(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class239 arg6, @OriginalArg(7) Class166 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) String arg10) {
		@Pc(22) int local22;
		if (Static429.anInt7656 == 4) {
			local22 = (int) Static265.aFloat51 & 0x3FFF;
		} else {
			local22 = Static439.anInt418 + (int) Static265.aFloat51 & 0x3FFF;
		}
		@Pc(41) int local41 = Math.max(arg6.anInt6898 / 2, arg6.anInt6899 / 2) + 10;
		@Pc(49) int local49 = arg9 * arg9 + arg2 * arg2;
		if (local41 * local41 < local49) {
			return;
		}
		@Pc(63) int local63 = Class145.anIntArray279[local22];
		@Pc(67) int local67 = Class145.anIntArray280[local22];
		if (Static429.anInt7656 != 4) {
			local63 = local63 * 256 / (Static280.anInt5012 + 256);
			local67 = local67 * 256 / (Static280.anInt5012 + 256);
		}
		@Pc(97) int local97 = arg2 * local63 + local67 * arg9 >> 15;
		@Pc(108) int local108 = arg2 * local67 - local63 * arg9 >> 15;
		@Pc(115) int local115 = arg7.method3887(100, arg10, null);
		@Pc(123) int local123 = arg7.method3893(arg10, null);
		@Pc(129) int local129 = local97 - local115 / 2;
		if (-arg6.anInt6898 <= local129 && local129 <= arg6.anInt6898 && -arg6.anInt6899 <= local108 && arg6.anInt6899 >= local108) {
			arg1.method4798(arg0, arg4, 0, arg5, arg8, 50, arg6.anInt6898 / 2 + arg4 + local129, arg10, arg8 + arg6.anInt6899 / 2 - arg3 - local108 - local123, local115, null, 0, null);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ph;I)Z")
	public static boolean method6012(@OriginalArg(0) Class193 arg0) {
		return arg0 == Static427.aClass193_7 || arg0 == Static107.aClass193_2 || arg0 == Static168.aClass193_4 || Static78.aClass193_1 == arg0;
	}
}
