import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg2 && arg8 == arg6 && arg7 == arg4 && arg3 == arg5) {
			Static459.method5987(arg6, arg1, arg3, arg0, arg7);
			return;
		}
		@Pc(31) int local31 = arg0;
		@Pc(33) int local33 = arg6;
		@Pc(37) int local37 = arg0 * 3;
		@Pc(41) int local41 = arg6 * 3;
		@Pc(45) int local45 = arg2 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(53) int local53 = arg4 * 3;
		@Pc(57) int local57 = arg5 * 3;
		@Pc(66) int local66 = local45 + arg7 - local53 - arg0;
		@Pc(75) int local75 = local49 + arg3 - arg6 - local57;
		@Pc(84) int local84 = local53 + local37 - local45 - local45;
		@Pc(94) int local94 = local41 + local57 - local49 - local49;
		@Pc(99) int local99 = local45 - local37;
		@Pc(103) int local103 = local49 - local41;
		for (@Pc(105) int local105 = 128; local105 <= 4096; local105 += 128) {
			@Pc(113) int local113 = local105 * local105 >> 12;
			@Pc(119) int local119 = local113 * local105 >> 12;
			@Pc(123) int local123 = local119 * local66;
			@Pc(127) int local127 = local75 * local119;
			@Pc(131) int local131 = local84 * local113;
			@Pc(135) int local135 = local94 * local113;
			@Pc(139) int local139 = local105 * local99;
			@Pc(143) int local143 = local105 * local103;
			@Pc(153) int local153 = arg0 + (local131 + local123 + local139 >> 12);
			@Pc(165) int local165 = arg6 + (local135 + local127 + local143 >> 12);
			Static459.method5987(local33, arg1, local165, local31, local153);
			local33 = local165;
			local31 = local153;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1563(@OriginalArg(0) String arg0) {
		if (Static87.aClass152Array1 != null) {
			Static448.method6134(Static317.aClass212_77);
			Static457.aClass4_Sub20_Sub1_5.method4590(Static316.method4760(arg0));
			Static457.aClass4_Sub20_Sub1_5.method4599(arg0);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!tf;B)Lclient!tf;")
	public static Class240 method1564(@OriginalArg(0) Class240 arg0) {
		if (arg0.anInt6917 != -1) {
			return Static92.method1820(arg0.anInt6917);
		}
		@Pc(25) int local25 = arg0.anInt6909 >>> 16;
		@Pc(30) Class225 local30 = new Class225(Static157.aClass96_22);
		for (@Pc(35) Class4_Sub39 local35 = (Class4_Sub39) local30.method5163(); local35 != null; local35 = (Class4_Sub39) local30.method5165()) {
			if (local25 == local35.anInt6721) {
				return Static92.method1820((int) local35.aLong228);
			}
		}
		return null;
	}
}
