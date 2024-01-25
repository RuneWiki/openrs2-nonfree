import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!qq;")
	public static Class198 aClass198_1;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!us;")
	public static final Class234 aClass234_91 = new Class234(18, 6);

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_62 = new Class244(24, 2);

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Lclient!us;")
	public static final Class234 aClass234_92 = new Class234(87, 3);

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!me;)V")
	public static void method4204(@OriginalArg(1) Class3_Sub8 arg0) {
		if (arg0.aClass3_Sub29_5 != null) {
			arg0.aClass3_Sub29_5.anInt4130 = 0;
		}
		arg0.aBoolean191 = false;
		for (@Pc(21) Class3_Sub8 local21 = arg0.method2128(); local21 != null; local21 = arg0.method2126()) {
			method4204(local21);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!wn;")
	public static Class89 method4205(@OriginalArg(0) Component arg0) {
		return new Class89_Sub1(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
	public static void method4207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static97.method1633(arg2, Static272.anInt4750, Static26.anInt345);
		@Pc(17) int local17 = Static97.method1633(arg4, Static272.anInt4750, Static26.anInt345);
		@Pc(23) int local23 = Static97.method1633(arg3, Static365.anInt6140, Static221.anInt3917);
		@Pc(29) int local29 = Static97.method1633(arg0, Static365.anInt6140, Static221.anInt3917);
		@Pc(38) int local38 = Static97.method1633(arg2 + arg5, Static272.anInt4750, Static26.anInt345);
		@Pc(52) int local52 = Static97.method1633(arg4 - arg5, Static272.anInt4750, Static26.anInt345);
		for (@Pc(54) int local54 = local11; local54 < local38; local54++) {
			Static349.method5265(local23, local29, arg1, Static325.anIntArrayArray50[local54]);
		}
		for (@Pc(70) int local70 = local17; local70 > local52; local70--) {
			Static349.method5265(local23, local29, arg1, Static325.anIntArrayArray50[local70]);
		}
		@Pc(92) int local92 = Static97.method1633(arg5 + arg3, Static365.anInt6140, Static221.anInt3917);
		@Pc(101) int local101 = Static97.method1633(arg0 - arg5, Static365.anInt6140, Static221.anInt3917);
		for (@Pc(103) int local103 = local38; local103 <= local52; local103++) {
			@Pc(109) int[] local109 = Static325.anIntArrayArray50[local103];
			Static349.method5265(local23, local92, arg1, local109);
			Static349.method5265(local101, local29, arg1, local109);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method4208() {
		if (Static193.anInt3497 == 5) {
			Static193.anInt3497 = 6;
		}
	}
}
