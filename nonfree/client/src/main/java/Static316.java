import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!ps", name = "A", descriptor = "Lclient!f;")
	public static Class49 aClass49_19;

	@OriginalMember(owner = "client!ps", name = "C", descriptor = "Lclient!bd;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
	public static int anInt5247 = 0;

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_163 = new Class151("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg5 && arg1 == arg4 && arg6 == arg7 && arg0 == arg8) {
			Static235.method3092(arg6, arg1, arg5, arg2, arg0);
			return;
		}
		@Pc(28) int local28 = arg5;
		@Pc(30) int local30 = arg1;
		@Pc(34) int local34 = arg5 * 3;
		@Pc(38) int local38 = arg1 * 3;
		@Pc(42) int local42 = arg3 * 3;
		@Pc(46) int local46 = arg4 * 3;
		@Pc(50) int local50 = arg7 * 3;
		@Pc(54) int local54 = arg8 * 3;
		@Pc(64) int local64 = arg6 + local42 - local50 - arg5;
		@Pc(73) int local73 = arg0 + local46 - local54 - arg1;
		@Pc(82) int local82 = local34 + local50 - local42 - local42;
		@Pc(91) int local91 = local38 + local54 - local46 - local46;
		@Pc(95) int local95 = local42 - local34;
		@Pc(100) int local100 = local46 - local38;
		for (@Pc(102) int local102 = 128; local102 <= 4096; local102 += 128) {
			@Pc(110) int local110 = local102 * local102 >> 12;
			@Pc(116) int local116 = local110 * local102 >> 12;
			@Pc(120) int local120 = local64 * local116;
			@Pc(124) int local124 = local73 * local116;
			@Pc(128) int local128 = local82 * local110;
			@Pc(132) int local132 = local91 * local110;
			@Pc(136) int local136 = local95 * local102;
			@Pc(140) int local140 = local100 * local102;
			@Pc(150) int local150 = arg5 + (local136 + local128 + local120 >> 12);
			@Pc(161) int local161 = arg1 + (local124 + local132 + local140 >> 12);
			Static235.method3092(local150, local30, local28, arg2, local161);
			local30 = local161;
			local28 = local150;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIB)Z")
	public static boolean method4088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V")
	public static void method4089(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(3, arg0);
		local8.method3458();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V")
	public static void method4090() {
		if (Static121.aBoolean154) {
			Static121.aBoolean154 = false;
			Static301.aClass49_17 = null;
			Static57.aClass49_4 = null;
		}
	}
}
