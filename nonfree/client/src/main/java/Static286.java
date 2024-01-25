import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!v;")
	public static Class244 aClass244_14;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "Lclient!pi;")
	public static Class184 aClass184_217;

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
	public static int anInt6051;

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
	public static int anInt6054;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "[Lclient!it;")
	public static final Class115[] aClass115Array9 = new Class115[16];

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	public static int anInt6049 = 20;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
	public static int anInt6052 = 0;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)V")
	public static void method4827() {
		for (@Pc(1) int local1 = 0; local1 < Static205.anInt4113; local1++) {
			@Pc(6) Class83 local6 = Static192.aClass83Array1[local1];
			if (local6.aByte39 == 2) {
				if (local6.aClass3_Sub5_Sub3_1 == null) {
					local6.anInt2722 = Integer.MIN_VALUE;
				} else {
					Static251.aClass3_Sub5_Sub4_1.method5196(local6.aClass3_Sub5_Sub3_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIIIII)V")
	public static void method4829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg4;
		@Pc(11) int local11 = arg3 * arg3;
		@Pc(15) int local15 = arg4 * arg4;
		@Pc(19) int local19 = local15 << 1;
		@Pc(23) int local23 = local11 << 1;
		@Pc(27) int local27 = arg4 << 1;
		@Pc(36) int local36 = local19 + local11 * (1 - local27);
		@Pc(45) int local45 = local15 - local23 * (local27 - 1);
		@Pc(49) int local49 = local11 << 2;
		@Pc(53) int local53 = local15 << 2;
		@Pc(61) int local61 = local19 * 3;
		@Pc(69) int local69 = local23 * ((arg4 << 1) - 3);
		@Pc(75) int local75 = local53;
		@Pc(81) int local81 = (arg4 - 1) * local49;
		Static15.method463(arg2, Static376.anIntArrayArray64[arg1], arg0 - arg3, arg3 + arg0);
		while (local7 > 0) {
			if (local36 < 0) {
				while (local36 < 0) {
					local36 += local61;
					local45 += local75;
					local61 += local53;
					local5++;
					local75 += local53;
				}
			}
			if (local45 < 0) {
				local45 += local75;
				local36 += local61;
				local5++;
				local75 += local53;
				local61 += local53;
			}
			local36 += -local81;
			local45 += -local69;
			local69 -= local49;
			local81 -= local49;
			local7--;
			@Pc(165) int local165 = arg1 - local7;
			@Pc(169) int local169 = local7 + arg1;
			@Pc(173) int local173 = local5 + arg0;
			@Pc(178) int local178 = arg0 - local5;
			Static15.method463(arg2, Static376.anIntArrayArray64[local165], local178, local173);
			Static15.method463(arg2, Static376.anIntArrayArray64[local169], local178, local173);
		}
	}
}
