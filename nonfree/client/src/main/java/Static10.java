import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!an", name = "e", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array1;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "J")
	public static long aLong8 = 0L;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "Lclient!jl;")
	public static Class89 aClass89_2 = new Class89(16);

	@OriginalMember(owner = "client!an", name = "o", descriptor = "S")
	public static short aShort3 = 205;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	public static void method301() {
		Static2.aClass1_Sub14_Sub1_1.method2252(2);
		for (@Pc(23) Class1_Sub12 local23 = (Class1_Sub12) Static48.aClass186_5.method4567(); local23 != null; local23 = (Class1_Sub12) Static48.aClass186_5.method4579()) {
			if (local23.anInt2207 == 0) {
				Static236.method1277(true, local23);
			}
		}
		if (Static290.aClass191_16 != null) {
			Static40.method817(Static290.aClass191_16);
			Static290.aClass191_16 = null;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg2 && arg7 == arg6 && arg3 == arg4 && arg5 == arg0) {
			Static300.method4572(arg8, arg3, arg1, arg7, arg5);
			return;
		}
		@Pc(29) int local29 = arg1 * 3;
		@Pc(31) int local31 = arg1;
		@Pc(33) int local33 = arg7;
		@Pc(37) int local37 = arg7 * 3;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg6 * 3;
		@Pc(49) int local49 = arg2 * 3;
		@Pc(59) int local59 = arg3 + local49 - arg1 - local41;
		@Pc(63) int local63 = arg0 * 3;
		@Pc(71) int local71 = local45 + arg5 - local63 - arg7;
		@Pc(81) int local81 = local41 + local29 - local49 - local49;
		@Pc(90) int local90 = local63 + local37 - local45 - local45;
		@Pc(95) int local95 = local49 - local29;
		@Pc(100) int local100 = local45 - local37;
		for (@Pc(102) int local102 = 128; local102 <= 4096; local102 += 128) {
			@Pc(111) int local111 = local102 * local102 >> 12;
			@Pc(115) int local115 = local111 * local90;
			@Pc(119) int local119 = local111 * local81;
			@Pc(125) int local125 = local102 * local111 >> 12;
			@Pc(129) int local129 = local102 * local95;
			@Pc(133) int local133 = local125 * local71;
			@Pc(137) int local137 = local125 * local59;
			@Pc(141) int local141 = local102 * local100;
			@Pc(151) int local151 = (local141 + local115 + local133 >> 12) + arg7;
			@Pc(161) int local161 = (local137 + local119 + local129 >> 12) + arg1;
			Static300.method4572(arg8, local161, local31, local33, local151);
			local33 = local151;
			local31 = local161;
		}
	}
}
