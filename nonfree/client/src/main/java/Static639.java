import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	public static int anInt10382;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static int anInt10384 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!mc;)Lclient!wga;")
	public static Class10_Sub3 method8634(@OriginalArg(1) Class5_Sub41 arg0) {
		@Pc(11) Class10 local11 = Static223.method3495(arg0);
		@Pc(15) int local15 = arg0.method7804();
		@Pc(19) int local19 = arg0.method7804();
		return new Class10_Sub3(local11.aClass275_17, local11.aClass81_17, local11.anInt10597, local11.anInt10602, local11.anInt10594, local11.anInt10595, local11.anInt10598, local11.anInt10601, local11.anInt10596, local15, local19);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!wm;I)Lclient!rca;")
	public static Class5_Sub3_Sub16 method8639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		@Pc(12) Class5_Sub41 local12 = new Class5_Sub41(arg2.method8914(arg0, arg1));
		@Pc(48) Class5_Sub3_Sub16 local48 = new Class5_Sub3_Sub16(arg1, local12.method7847(), local12.method7847(), local12.method7804(), local12.method7804(), local12.method7816() == 1, local12.method7816(), local12.method7816());
		@Pc(52) int local52 = local12.method7816();
		for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
			local48.aClass114_57.method2807(new Class5_Sub15(local12.method7816(), local12.method7860(), local12.method7860(), local12.method7860(), local12.method7860(), local12.method7860(), local12.method7860(), local12.method7860(), local12.method7860()));
		}
		local48.method7168();
		return local48;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIZZZ)V")
	public static void method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(9) int local9 = (arg2 + arg3) / 2;
		@Pc(11) int local11 = arg2;
		@Pc(15) Class6_Sub1 local15 = Static394.aClass6_Sub1Array2[local9];
		Static394.aClass6_Sub1Array2[local9] = Static394.aClass6_Sub1Array2[arg3];
		Static394.aClass6_Sub1Array2[arg3] = local15;
		for (@Pc(27) int local27 = arg2; local27 < arg3; local27++) {
			if (Static239.method3754(arg4, local15, Static394.aClass6_Sub1Array2[local27], arg0, arg5, arg1) <= 0) {
				@Pc(46) Class6_Sub1 local46 = Static394.aClass6_Sub1Array2[local27];
				Static394.aClass6_Sub1Array2[local27] = Static394.aClass6_Sub1Array2[local11];
				Static394.aClass6_Sub1Array2[local11++] = local46;
			}
		}
		Static394.aClass6_Sub1Array2[arg3] = Static394.aClass6_Sub1Array2[local11];
		Static394.aClass6_Sub1Array2[local11] = local15;
		method8642(arg0, arg1, arg2, local11 - 1, arg4, arg5);
		method8642(arg0, arg1, local11 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII[BI)V")
	public static void method8643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		arg1 += arg3;
		@Pc(19) int local19 = arg0 - arg3 >> 2;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg0 - arg3 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(24) int local24 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg2[local24] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			arg1 = local34 + 1;
			arg2[local34] = 1;
		}
	}
}
