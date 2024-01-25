import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "[S")
	public static short[] aShortArray113;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	public static int anInt5896;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!of;")
	public static Class40 aClass40_17;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Ljava/lang/String;")
	public static final String aString272 = "glow1:";

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString273 = "flash1:";

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
	public static int anInt5889 = 0;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	public static int anInt5893 = -1;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method5320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg4 && arg8 == arg7 && arg2 == arg3 && arg1 == arg6) {
			Static13.method225(arg7, arg4, arg1, arg2, arg0);
			return;
		}
		@Pc(32) int local32 = arg4;
		@Pc(34) int local34 = arg7;
		@Pc(38) int local38 = arg4 * 3;
		@Pc(42) int local42 = arg7 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg3 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(69) int local69 = arg2 + local46 - local54 - arg4;
		@Pc(79) int local79 = local50 + arg1 - arg7 - local58;
		@Pc(89) int local89 = local54 + local38 - local46 - local46;
		@Pc(99) int local99 = local42 + local58 - local50 - local50;
		@Pc(104) int local104 = local46 - local38;
		@Pc(109) int local109 = local50 - local42;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local111 * local119 >> 12;
			@Pc(129) int local129 = local69 * local125;
			@Pc(133) int local133 = local125 * local79;
			@Pc(137) int local137 = local119 * local89;
			@Pc(141) int local141 = local99 * local119;
			@Pc(145) int local145 = local111 * local104;
			@Pc(149) int local149 = local109 * local111;
			@Pc(159) int local159 = (local145 + local137 + local129 >> 12) + arg4;
			@Pc(169) int local169 = arg7 + (local149 + local141 + local133 >> 12);
			Static13.method225(local34, local32, local169, local159, arg0);
			local34 = local169;
			local32 = local159;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public static void method5321() {
		Static60.aClass70_26.method1397(50);
		Static174.aClass70_58.method1397(50);
		Static221.aClass70_72.method1397(50);
		Static186.aClass70_63.method1397(50);
		Static1.aClass70_1.method1397(50);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!sr;III[Z)Z")
	public static boolean method5322(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static203.aClass106Array3 != Static84.aClass106Array1) {
			@Pc(11) int local11 = Static99.aClass106Array4[arg1].method5717(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class106 local18 = Static99.aClass106Array4[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method5717(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5727(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method5719(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIILclient!dp;)Lclient!tg;")
	public static Class6_Sub2_Sub19 method5323(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class53 arg2) {
		@Pc(14) Class6_Sub10 local14 = new Class6_Sub10(arg2.method1033(arg1, arg0));
		@Pc(44) Class6_Sub2_Sub19 local44 = new Class6_Sub2_Sub19(arg1, local14.method4023(), local14.method4023(), local14.method3979(), local14.method3979(), local14.method3972() == 1, local14.method3972());
		@Pc(48) int local48 = local14.method3972();
		for (@Pc(50) int local50 = 0; local50 < local48; local50++) {
			local44.aClass211_36.method5585(new Class6_Sub21(local14.method3972(), local14.method4021(), local14.method4021(), local14.method4021(), local14.method4021(), local14.method4021(), local14.method4021(), local14.method4021(), local14.method4021()));
		}
		local44.method5161();
		return local44;
	}
}
