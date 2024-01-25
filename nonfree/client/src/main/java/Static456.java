import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Lclient!qc;")
	public static Class198 aClass198_1;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_220 = new Class102(49, 6);

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
	public static int anInt7291 = 0;

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "Lclient!nf;")
	public static final Class2_Sub13_Sub2 aClass2_Sub13_Sub2_2 = new Class2_Sub13_Sub2(5000);

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
	public static int anInt7293 = 0;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		if (arg5 < 128 || arg4 < 128 || Static166.anInt2852 * 128 - 256 < arg5 || arg4 > Static426.anInt6923 * 128 - 256) {
			Static31.anIntArray53[0] = Static31.anIntArray53[1] = -1;
			return;
		}
		@Pc(53) int local53 = Static302.method3973(arg4, arg5, arg2) - arg1;
		Static57.aClass31_2.W(arg0, 0, 0);
		Static82.aClass163_1.SA(Static57.aClass31_2);
		Static82.aClass163_1.v(arg5, local53, arg4, Static31.anIntArray53);
		Static57.aClass31_2.W(-arg0, 0, 0);
		Static82.aClass163_1.SA(Static57.aClass31_2);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZIB)V")
	public static void method5711(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static263.anInt3675 = 3;
		Static220.anInt3626 = arg1;
		Static153.method2189(Static149.aClass265_4.aString199, Static149.aClass265_4.anInt7137);
		if (arg0) {
			Static26.method370("", "");
		} else {
			Static339.method4553();
			Static26.method370(Static341.aString160, Static250.aString118);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIII)I")
	public static int method5712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(21) int local21 = local7 >= 8 ? arg1 : arg3;
		@Pc(38) int local38 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg0) : arg1;
		return ((local7 & 0x1) == 0 ? local21 : -local21) + ((local7 & 0x2) == 0 ? local38 : -local38);
	}
}
