import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!maa", name = "j", descriptor = "Lclient!ha;")
	public static Class84 aClass84_14;

	@OriginalMember(owner = "client!maa", name = "l", descriptor = "Lclient!hv;")
	public static Class12_Sub20 aClass12_Sub20_2;

	@OriginalMember(owner = "client!maa", name = "o", descriptor = "Lclient!ha;")
	public static Class84 aClass84_15;

	@OriginalMember(owner = "client!maa", name = "q", descriptor = "Lclient!bp;")
	public static Class38 aClass38_2;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_56 = new Class77(0, 6);

	@OriginalMember(owner = "client!maa", name = "p", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_163 = new Class88("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IILclient!pa;ILclient!ha;Lclient!mc;II)V")
	public static void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class84 arg4, @OriginalArg(5) Class198 arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static242.anInt4993 == 4) {
			local16 = (int) Static500.aFloat186 & 0x3FFF;
		} else {
			local16 = Static432.anInt7990 + (int) Static500.aFloat186 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg5.anInt5762 / 2, arg5.anInt5715 / 2) + 10;
		@Pc(45) int local45 = arg3 * arg3 + arg1 * arg1;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(55) int local55 = Class12_Sub1_Sub36.anIntArray667[local16];
		@Pc(59) int local59 = Class12_Sub1_Sub36.anIntArray668[local16];
		if (Static242.anInt4993 != 4) {
			local55 = local55 * 256 / (Static339.anInt6470 + 256);
			local59 = local59 * 256 / (Static339.anInt6470 + 256);
		}
		@Pc(91) int local91 = local55 * arg3 + arg1 * local59 >> 15;
		@Pc(101) int local101 = local59 * arg3 - arg1 * local55 >> 15;
		arg4.method7490(local91 + arg0 + arg5.anInt5762 / 2 - arg4.EA() / 2, -local101 + arg5.anInt5715 / 2 + arg6 + -(arg4.ma() / 2), arg2, arg0, arg6);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IJ)V")
	public static void method4769(@OriginalArg(1) long arg0) {
		Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
		Static383.aClass12_Sub8_Sub2_1.method5214(Static17.aClass137_8.anInt4298);
		Static383.aClass12_Sub8_Sub2_1.method5208(arg0);
		Static383.aClass12_Sub8_Sub2_1.method5214(Static345.anInt6495);
		Static175.anInt3980 = 1;
		Static194.anInt4316 = -3;
		Static96.anInt2249 = 0;
		Static267.anInt5373 = 0;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBI)Z")
	public static boolean method4771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static374.method5767(arg1, arg0) | (arg0 & 0x70000) != 0 || Static43.method849(arg0, arg1);
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
	public static void method4772() {
		Static497.aClass125_64.method3440();
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(III)V")
	public static void method4773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class12_Sub4_Sub1 local13 = Static389.method6156(16, arg1);
		local13.method820();
		local13.anInt806 = arg0;
	}
}
