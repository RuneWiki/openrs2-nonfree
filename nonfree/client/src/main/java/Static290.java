import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public static int anInt4733;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!kf;")
	public static final Class189 aClass189_8 = new Class189(1);

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!kf;")
	public static final Class189 aClass189_9 = new Class189(2);

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!kf;")
	public static final Class189 aClass189_10 = new Class189(4);

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!kf;")
	public static final Class189 aClass189_11 = new Class189(1);

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!kf;")
	public static final Class189 aClass189_12 = new Class189(2);

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!kf;")
	public static final Class189 aClass189_13 = new Class189(4);

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!kf;")
	public static final Class189 aClass189_14 = new Class189(2);

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Lclient!kf;")
	public static final Class189 aClass189_15 = new Class189(4);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method4014() {
		for (@Pc(6) Class13_Sub4 local6 = (Class13_Sub4) Static592.aClass171_10.method3752(); local6 != null; local6 = (Class13_Sub4) Static592.aClass171_10.method3752()) {
			Static78.method1105(local6);
		}
		@Pc(34) int local34;
		@Pc(33) int local33;
		if (Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() == 1) {
			local34 = 0;
			local33 = 3;
		} else {
			local33 = Static130.anInt2239;
			local34 = Static130.anInt2239;
		}
		Static76.method1069();
		for (@Pc(43) int local43 = local34; local43 <= local33; local43++) {
			Static76.method1072();
			Static76.method1068(local43);
			Static76.method1073(local43);
		}
		Static76.method1075();
		Static76.method1082();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg4 && arg8 == arg3 && arg5 == arg1 && arg7 == arg6) {
			Static263.method3704(arg4, arg8, arg6, arg0, arg1);
			return;
		}
		@Pc(28) int local28 = arg4;
		@Pc(30) int local30 = arg8;
		@Pc(34) int local34 = arg4 * 3;
		@Pc(38) int local38 = arg8 * 3;
		@Pc(42) int local42 = arg2 * 3;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg5 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(64) int local64 = arg1 + local42 - local50 - arg4;
		@Pc(74) int local74 = local46 + arg6 - local54 - arg8;
		@Pc(83) int local83 = local34 + local50 - local42 - local42;
		@Pc(93) int local93 = local54 + local38 - local46 - local46;
		@Pc(98) int local98 = local42 - local34;
		@Pc(103) int local103 = local46 - local38;
		for (@Pc(105) int local105 = 128; local105 <= 4096; local105 += 128) {
			@Pc(113) int local113 = local105 * local105 >> 12;
			@Pc(119) int local119 = local105 * local113 >> 12;
			@Pc(123) int local123 = local64 * local119;
			@Pc(127) int local127 = local119 * local74;
			@Pc(131) int local131 = local113 * local83;
			@Pc(135) int local135 = local93 * local113;
			@Pc(139) int local139 = local98 * local105;
			@Pc(143) int local143 = local105 * local103;
			@Pc(155) int local155 = (local123 + local131 + local139 >> 12) + arg4;
			@Pc(165) int local165 = (local135 + local127 + local143 >> 12) + arg8;
			Static263.method3704(local28, local30, local165, arg0, local155);
			local28 = local155;
			local30 = local165;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!d;ILclient!wu;)V")
	public static void method4016(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) Class380 arg1) {
		Static234.anInterface6_31 = arg0;
		Static13.aClass380_4 = arg1;
	}
}
