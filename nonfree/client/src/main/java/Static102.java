import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array6;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!pg;")
	public static Interface6 anInterface6_2;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString166 = "skill: ";

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)V")
	public static void method2038(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 - arg1 >= Static61.anInt1534 && Static168.anInt3509 >= arg1 + arg0 && arg2 - arg1 >= Static142.anInt3103 && Static314.anInt6030 >= arg2 + arg1) {
			Static226.method4014(arg1, arg0, arg3, arg2);
		} else {
			Static320.method5178(arg2, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg5 && arg4 == arg0 && arg1 == arg8 && arg6 == arg2) {
			Static13.method198(arg1, arg2, arg7, arg4, arg5);
			return;
		}
		@Pc(29) int local29 = arg5;
		@Pc(31) int local31 = arg4;
		@Pc(35) int local35 = arg5 * 3;
		@Pc(39) int local39 = arg4 * 3;
		@Pc(43) int local43 = arg3 * 3;
		@Pc(47) int local47 = arg0 * 3;
		@Pc(51) int local51 = arg8 * 3;
		@Pc(55) int local55 = arg6 * 3;
		@Pc(63) int local63 = local43 + arg1 - local51 - arg5;
		@Pc(72) int local72 = arg2 + local47 - local55 - arg4;
		@Pc(82) int local82 = local51 + local35 - local43 - local43;
		@Pc(92) int local92 = local55 + local39 - local47 - local47;
		@Pc(97) int local97 = local43 - local35;
		@Pc(102) int local102 = local47 - local39;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(111) int local111 = local104 * local104 >> 12;
			@Pc(117) int local117 = local104 * local111 >> 12;
			@Pc(121) int local121 = local63 * local117;
			@Pc(125) int local125 = local117 * local72;
			@Pc(129) int local129 = local111 * local82;
			@Pc(133) int local133 = local111 * local92;
			@Pc(137) int local137 = local104 * local97;
			@Pc(141) int local141 = local104 * local102;
			@Pc(152) int local152 = (local137 + local121 + local129 >> 12) + arg5;
			@Pc(162) int local162 = (local141 + local133 + local125 >> 12) + arg4;
			Static13.method198(local152, local162, arg7, local31, local29);
			local29 = local152;
			local31 = local162;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method2040(@OriginalArg(0) Class180 arg0) {
		Static249.aClass180_16 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)I")
	public static int method2041(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static120.method2554(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
	public static void method2043(@OriginalArg(1) int arg0) {
		Static321.anInt6136 = arg0;
		@Pc(13) Class103 local13 = Static269.aClass103_56;
		synchronized (Static269.aClass103_56) {
			Static269.aClass103_56.method2678();
		}
		local13 = Static103.aClass103_22;
		synchronized (Static103.aClass103_22) {
			Static103.aClass103_22.method2678();
		}
	}
}
