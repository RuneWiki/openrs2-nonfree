import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "Lclient!lt;")
	public static Class158 aClass158_26;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
	public static int anInt2067;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
	public static final int[] anIntArray216 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_31 = new Class231("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "Lclient!tq;")
	public static Class239 aClass239_5 = null;

	@OriginalMember(owner = "client!fv", name = "y", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	public static void method1900() {
		if (Static54.anInt1123 == 10) {
			Static260.method4007(28);
		}
		if (Static54.anInt1123 == 30) {
			Static260.method4007(25);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method1903(@OriginalArg(1) Class6_Sub15 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static200.anInt3522; local3++) {
			@Pc(9) int local9 = arg0.method3090();
			@Pc(13) int local13 = arg0.method3108();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static183.aClass184_Sub1Array3[local9] != null) {
				Static183.aClass184_Sub1Array3[local9].anInt4767 = local13;
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V")
	public static void method1904() {
		if (Static44.aClass28_14 == null) {
			return;
		}
		Static412.aClass128_10.method2829();
		Static124.method3214();
		Static134.method2179();
		Static255.method3943();
		Static392.method5390();
		Static333.method3538();
		if (Static243.aClass46_1 != null) {
			Static243.aClass46_1.method1240();
		}
		Static290.method4323();
		Static403.method5492();
		Static62.method1176();
		Static22.method312(false);
		Static275.method4183();
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class3_Sub3_Sub6_Sub1 local47 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local41];
			if (local47 != null) {
				local47.aClass6_Sub28_3 = null;
				for (@Pc(54) int local54 = 0; local54 < local47.aClass39Array3.length; local54++) {
					local47.aClass39Array3[local54] = null;
				}
			}
		}
		for (@Pc(79) int local79 = 0; local79 < Static450.aClass3_Sub3_Sub6_Sub2Array1.length; local79++) {
			@Pc(85) Class3_Sub3_Sub6_Sub2 local85 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local79];
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < local85.aClass39Array3.length; local89++) {
					local85.aClass39Array3[local89] = null;
				}
			}
		}
		Static44.aClass28_14.method3562();
		Static44.aClass28_14 = null;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIZIIIZ)V")
	public static void method1905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 >= arg1) {
			return;
		}
		@Pc(11) int local11 = (arg4 + arg1) / 2;
		@Pc(13) int local13 = arg4;
		@Pc(17) Class184_Sub1 local17 = Static148.aClass184_Sub1Array1[local11];
		Static148.aClass184_Sub1Array1[local11] = Static148.aClass184_Sub1Array1[arg1];
		Static148.aClass184_Sub1Array1[arg1] = local17;
		for (@Pc(29) int local29 = arg4; local29 < arg1; local29++) {
			if (Static166.method2709(local17, arg2, Static148.aClass184_Sub1Array1[local29], arg0, arg5, arg3) <= 0) {
				@Pc(49) Class184_Sub1 local49 = Static148.aClass184_Sub1Array1[local29];
				Static148.aClass184_Sub1Array1[local29] = Static148.aClass184_Sub1Array1[local13];
				Static148.aClass184_Sub1Array1[local13++] = local49;
			}
		}
		Static148.aClass184_Sub1Array1[arg1] = Static148.aClass184_Sub1Array1[local13];
		Static148.aClass184_Sub1Array1[local13] = local17;
		method1905(arg0, local13 - 1, arg2, arg3, arg4, arg5);
		method1905(arg0, arg1, arg2, arg3, local13 + 1, arg5);
	}
}
