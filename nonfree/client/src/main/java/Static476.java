import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "Lclient!uw;")
	public static Class359 aClass359_174;

	@OriginalMember(owner = "client!qfa", name = "x", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_9;

	@OriginalMember(owner = "client!qfa", name = "y", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_10;

	@OriginalMember(owner = "client!qfa", name = "t", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_175 = new Class359(82, 17);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!id;Lclient!ka;IIIB)V")
	public static void method6818(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != null) {
			arg0.method3852(arg1.RA(), arg2, arg1.fa(), arg4, arg3, arg1.G(), arg1.EA(), arg1.V(), arg1.na(), arg1.HA());
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method6820(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static253.anInt4604; local14++) {
			if (arg0.equalsIgnoreCase(Static326.aStringArray31[local14])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aString45);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!ck;IB[IIZII)Lclient!rc;")
	public static Class80_Sub2_Sub1 method6821(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0.aBoolean103 || Static111.method4954(arg4) && Static111.method4954(arg5)) {
			return new Class80_Sub2_Sub1(arg0, 3553, arg4, arg5, false, arg2, arg3, 0);
		} else if (arg0.aBoolean99) {
			return new Class80_Sub2_Sub1(arg0, 34037, arg4, arg5, false, arg2, arg3, 0);
		} else {
			return new Class80_Sub2_Sub1(arg0, arg4, arg5, Static67.method917(arg4), Static67.method917(arg5), arg2);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg4 < 512 || arg1 < 512 || arg4 > Static201.anInt3834 * 512 - 1024 || arg1 > (Static626.anInt10238 - 2) * 512) {
			Static665.anIntArray475[0] = Static665.anIntArray475[1] = -1;
			return;
		}
		@Pc(53) int local53 = Static441.method6444(arg6, arg4, arg1) - arg3;
		if (Static66.aBoolean570) {
			Static507.method7266(true);
		} else {
			Static546.aClass254_8.method7358(arg5, 0, 0);
			Static208.aClass65_7.method6891(Static546.aClass254_8);
		}
		if (Static632.aBoolean877) {
			Static208.aClass65_7.HA(arg4, local53, arg1, Static483.anInt8094, Static665.anIntArray475);
		} else {
			Static208.aClass65_7.da(arg4, local53, arg1, Static665.anIntArray475);
		}
		if (Static66.aBoolean570) {
			Static17.method230();
		} else {
			Static546.aClass254_8.method7358(-arg5, 0, 0);
			Static208.aClass65_7.method6891(Static546.aClass254_8);
		}
	}
}
