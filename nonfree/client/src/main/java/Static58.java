import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cda", name = "H", descriptor = "I")
	public static int anInt1202;

	@OriginalMember(owner = "client!cda", name = "t", descriptor = "Lclient!uj;")
	public static final Class291 aClass291_1 = new Class291(128);

	@OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
	public static int anInt1190 = 0;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static418.method6023(Static4.anInt6709, arg3, Static492.anInt8451);
		@Pc(17) int local17 = Static418.method6023(Static4.anInt6709, arg1, Static492.anInt8451);
		@Pc(32) int local32 = Static418.method6023(Static398.anInt7144, arg6, Static71.anInt4958);
		@Pc(38) int local38 = Static418.method6023(Static398.anInt7144, arg4, Static71.anInt4958);
		@Pc(46) int local46 = Static418.method6023(Static4.anInt6709, arg5 + arg3, Static492.anInt8451);
		@Pc(55) int local55 = Static418.method6023(Static4.anInt6709, arg1 - arg5, Static492.anInt8451);
		for (@Pc(57) int local57 = local11; local57 < local46; local57++) {
			Static321.method5153(arg0, local32, Static352.anIntArrayArray51[local57], local38);
		}
		for (@Pc(73) int local73 = local17; local73 > local55; local73--) {
			Static321.method5153(arg0, local32, Static352.anIntArrayArray51[local73], local38);
		}
		@Pc(100) int local100 = Static418.method6023(Static398.anInt7144, arg6 + arg5, Static71.anInt4958);
		@Pc(109) int local109 = Static418.method6023(Static398.anInt7144, arg4 - arg5, Static71.anInt4958);
		for (@Pc(111) int local111 = local46; local111 <= local55; local111++) {
			@Pc(117) int[] local117 = Static352.anIntArrayArray51[local111];
			Static321.method5153(arg0, local32, local117, local100);
			Static321.method5153(arg2, local100, local117, local109);
			Static321.method5153(arg0, local109, local117, local38);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!jba;IIII)V")
	public static void method1164(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static223.method3542(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static374.anInt6925) {
			Static223.method3542(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static223.method3542(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static430.anInt7565) {
			Static223.method3542(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static430.anInt7565) {
			Static223.method3542(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static374.anInt6925 && arg4 <= Static430.anInt7565) {
			Static223.method3542(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static223.method3542(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static374.anInt6925 && arg4 > 0) {
			Static223.method3542(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
