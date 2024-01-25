import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!naa", name = "D", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!naa", name = "X", descriptor = "F")
	public static float aFloat133;

	@OriginalMember(owner = "client!naa", name = "I", descriptor = "I")
	public static int anInt5989 = 0;

	@OriginalMember(owner = "client!naa", name = "N", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_88 = new Class252(19, 3);

	@OriginalMember(owner = "client!naa", name = "T", descriptor = "Lclient!js;")
	public static final Class156 aClass156_10 = new Class156(0, 2, 2, 1);

	@OriginalMember(owner = "client!naa", name = "U", descriptor = "I")
	public static int anInt5997 = -1;

	@OriginalMember(owner = "client!naa", name = "V", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_91 = new Class45(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!naa", name = "W", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_89 = new Class252(25, 7);

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)I")
	public static int method5426(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIII)V")
	public static void method5428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static259.aClass1_Sub17_Sub2_1.method4489(arg1);
		Static259.aClass1_Sub17_Sub2_1.method4506(arg0);
		Static259.aClass1_Sub17_Sub2_1.method4506(arg2);
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(III[II)V")
	public static void method5430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg0 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (arg3 < local16) {
			@Pc(20) int local20 = arg3 + 1;
			arg2[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg1;
			@Pc(50) int local50 = local45 + 1;
			arg2[local50] = arg1;
			arg3 = local50 + 1;
			arg2[arg3] = arg1;
		}
		while (local12 > arg3) {
			arg3++;
			arg2[arg3] = arg1;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;BLjava/lang/String;ILjava/lang/String;I)V")
	public static void method5432(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class315 local9 = Static77.aClass315Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static77.aClass315Array1[local11] = Static77.aClass315Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class315(arg4, arg1, arg3, arg5, arg2, arg6, arg0);
		} else {
			local9.method8098(arg0, arg4, arg3, arg2, arg6, arg5, arg1);
		}
		Static102.anInt2170++;
		Static77.aClass315Array1[0] = local9;
		Static295.anInt5594 = Static209.anInt4108;
	}
}
