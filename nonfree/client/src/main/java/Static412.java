import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "[I")
	public static final int[] anIntArray568 = new int[2048];

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIBI)V")
	public static void method5986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(20) int local20 = -arg2;
		@Pc(22) int local22 = -1;
		Static321.method5153(arg0, arg3 - arg2, Static352.anIntArrayArray51[arg1], arg3 + arg2);
		while (local17 > local15) {
			local22 += 2;
			local20 += local22;
			local15++;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(62) int[] local62 = Static352.anIntArrayArray51[arg1 + local17];
				@Pc(69) int[] local69 = Static352.anIntArrayArray51[arg1 - local17];
				@Pc(73) int local73 = local15 + arg3;
				@Pc(78) int local78 = arg3 - local15;
				Static321.method5153(arg0, local78, local62, local73);
				Static321.method5153(arg0, local78, local69, local73);
			}
			@Pc(94) int local94 = local17 + arg3;
			@Pc(99) int local99 = arg3 - local17;
			@Pc(105) int[] local105 = Static352.anIntArrayArray51[arg1 + local15];
			@Pc(111) int[] local111 = Static352.anIntArrayArray51[arg1 - local15];
			Static321.method5153(arg0, local99, local105, local94);
			Static321.method5153(arg0, local99, local111, local94);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIII)I")
	public static int method5987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
	public static void method5990() {
		if (Static164.aClass146_1 != null) {
			Static164.aClass146_1.method5758();
		}
		if (Static301.aClass146_2 != null) {
			Static301.aClass146_2.method5758();
		}
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(BI)Lclient!io;")
	public static Class148 method5991(@OriginalArg(1) int arg0) {
		@Pc(8) Class148[] local8 = Static344.method5362();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			if (arg0 == local8[local15].anInt4062) {
				return local8[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method5992(@OriginalArg(0) String arg0) {
		return Static374.method5620(arg0, 10);
	}
}
