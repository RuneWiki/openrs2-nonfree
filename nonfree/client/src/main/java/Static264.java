import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!id", name = "C", descriptor = "Lclient!lb;")
	public static Class221 aClass221_72;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "Lclient!lb;")
	public static Class221 aClass221_73;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_77 = new Class186(52, 3);

	@OriginalMember(owner = "client!id", name = "E", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_41 = new Class286(84, 3);

	@OriginalMember(owner = "client!id", name = "y", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_78 = new Class186(113, 2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	public static void method3687(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static707.anInt11053 = -1;
		Static293.anInt5245 = 1;
		Static167.aClass400_1 = Static532.aClass400_2;
		Static441.method6405(false, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IIIIIIIIII)Z")
	public static boolean method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static524.method7458(arg1, arg3, arg4)) {
			return false;
		}
		@Pc(16) int local16 = Static193.anIntArray174[2];
		@Pc(20) int local20 = Static193.anIntArray174[1];
		@Pc(24) int local24 = Static193.anIntArray174[0];
		if (!Static524.method7458(arg6, arg0, arg2)) {
			return false;
		}
		@Pc(37) int local37 = Static193.anIntArray174[2];
		@Pc(41) int local41 = Static193.anIntArray174[0];
		@Pc(45) int local45 = Static193.anIntArray174[1];
		if (Static524.method7458(arg7, arg5, arg8)) {
			@Pc(58) int local58 = Static193.anIntArray174[0];
			@Pc(62) int local62 = Static193.anIntArray174[1];
			@Pc(66) int local66 = Static193.anIntArray174[2];
			return Static216.method3468(local58, local37, local16, local45, local66, local20, local62, local41, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public static void method3691() {
		Static639.method8665(Static713.aClass3_Sub55_31.aClass15_Sub10_1.method3763() == 1);
		Static164.aClass33_1 = Static326.method4877(0, Static310.aClass47_4, Static67.aCanvas1, 22050);
		Static90.method1213(Static93.method1258((Class3_Sub22_Sub5) null));
		Static261.aClass33_4 = Static326.method4877(1, Static310.aClass47_4, Static67.aCanvas1, 2048);
		Static155.aClass3_Sub22_Sub4_1 = new Class3_Sub22_Sub4();
		Static261.aClass33_4.method8232(Static155.aClass3_Sub22_Sub4_1);
		Static68.aClass272_1 = new Class272(22050, Static103.anInt1658);
		Static203.method3017();
	}
}
