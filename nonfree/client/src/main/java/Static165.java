import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "Lclient!ep;")
	public static Class73 aClass73_5;

	@OriginalMember(owner = "client!i", name = "L", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_11 = new Class225(10, 2, 2, 0);

	@OriginalMember(owner = "client!i", name = "X", descriptor = "I")
	public static int anInt3105 = 0;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_43 = new Class84("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method2662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static92.aClass136Array1 == null) {
			return;
		}
		@Pc(19) Class26_Sub2_Sub2 local19;
		@Pc(15) int local15;
		if (arg10 >= 0) {
			local15 = arg10 - 1;
			local19 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local15];
		} else {
			local15 = -arg10 - 1;
			if (local15 == Static453.anInt7845) {
				local19 = Static196.aClass26_Sub2_Sub2_Sub1_1;
			} else {
				local19 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local15];
			}
		}
		if (local19 == null) {
			return;
		}
		@Pc(49) Class182 local49 = Static71.aClass105_6.method2336(arg4);
		@Pc(58) int local58;
		@Pc(61) int local61;
		if (arg1 == 1 || arg1 == 3) {
			local58 = local49.anInt5487;
			local61 = local49.anInt5486;
		} else {
			local61 = local49.anInt5487;
			local58 = local49.anInt5486;
		}
		@Pc(76) int local76 = arg8 + (local58 >> 1);
		@Pc(84) int local84 = (local58 + 1 >> 1) + arg8;
		@Pc(90) int local90 = (local61 >> 1) + arg3;
		@Pc(98) int local98 = arg3 + (local61 + 1 >> 1);
		@Pc(102) Class136 local102 = Static92.aClass136Array1[arg12];
		@Pc(125) int local125 = local102.I(local76, local90) + local102.I(local84, local90) + local102.I(local76, local98) + local102.I(local84, local98) >> 2;
		@Pc(129) Class1_Sub4 local129 = new Class1_Sub4();
		local129.anInt806 = arg4;
		local129.anInt793 = arg1;
		local129.anInt799 = local19.aByte95;
		local129.anInt791 = arg7 + Static403.anInt6978;
		local129.anInt802 = arg3;
		local129.anInt796 = arg8;
		@Pc(155) int local155;
		if (arg5 < arg11) {
			local155 = arg11;
			arg11 = arg5;
			arg5 = local155;
		}
		local129.anInt807 = arg6 + Static403.anInt6978;
		local129.anInt795 = arg9;
		local129.anInt804 = arg8 + arg11;
		if (arg0 > arg2) {
			local155 = arg0;
			arg0 = arg2;
			arg2 = local155;
		}
		local129.anInt800 = arg8 + arg5;
		local129.anInt792 = arg3 + arg2;
		local129.anInt798 = arg3 + arg0;
		local129.anInt794 = (local129.anInt796 << 7) + (local58 << 6);
		local129.anInt797 = local125;
		local129.anInt790 = (local129.anInt802 << 7) + (local61 << 6);
		Static323.aClass266_43.method5998(local129);
		local19.aClass1_Sub4_3 = local129;
	}
}
