import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
	public static final int[] anIntArray498 = new int[2];

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	public static final int anInt5852 = 50;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
	public static final int[] anIntArray499 = new int[anInt5852];

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "[I")
	public static final int[] anIntArray500 = new int[anInt5852];

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_47 = new Class171(4);

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
	public static int anInt5851 = -1;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "[I")
	public static final int[] anIntArray501 = new int[anInt5852];

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "[I")
	public static final int[] anIntArray502 = new int[anInt5852];

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[anInt5852];

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "[I")
	public static final int[] anIntArray503 = new int[anInt5852];

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "[I")
	public static final int[] anIntArray504 = new int[anInt5852];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Z")
	public static boolean method4714(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static190.anInt3695; local1 < Static254.anInt4782; local1++) {
			@Pc(6) Class106[][] local6 = Static440.aClass106ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static182.anInt3568; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static312.anInt5514 + local9;
				@Pc(18) int local18 = Static312.anInt5514 - local9;
				if (local14 >= Static154.anInt3163 || local18 < Static234.anInt4528) {
					for (@Pc(27) int local27 = -Static182.anInt3568; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static402.anInt6690 + local27;
						@Pc(36) int local36 = Static402.anInt6690 - local27;
						@Pc(48) Class106 local48;
						if (local14 >= Static154.anInt3163) {
							if (local32 >= Static316.anInt5472) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean237) {
									Static91.aBoolean161 = arg0;
									Static260.aClass37_1.method5281(local48);
									Static260.aClass37_1.method5288();
								}
							}
							if (local36 < Static248.anInt4698) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean237) {
									Static91.aBoolean161 = arg0;
									Static260.aClass37_1.method5281(local48);
									Static260.aClass37_1.method5288();
								}
							}
						}
						if (local18 < Static234.anInt4528) {
							if (local32 >= Static316.anInt5472) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean237) {
									Static91.aBoolean161 = arg0;
									Static260.aClass37_1.method5281(local48);
									Static260.aClass37_1.method5288();
								}
							}
							if (local36 < Static248.anInt4698) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean237) {
									Static91.aBoolean161 = arg0;
									Static260.aClass37_1.method5281(local48);
									Static260.aClass37_1.method5288();
								}
							}
						}
						if (Static441.anInt301 == 0) {
							if (Static58.aBoolean79) {
								Static260.aClass37_1.method5283(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method4715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class2_Sub11 local7 = null;
		for (@Pc(12) Class2_Sub11 local12 = (Class2_Sub11) Static362.aClass14_42.method309(); local12 != null; local12 = (Class2_Sub11) Static362.aClass14_42.method311()) {
			if (arg6 == local12.anInt1613 && arg5 == local12.anInt1614 && arg4 == local12.anInt1615 && local12.anInt1611 == arg2) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub11();
			local7.anInt1615 = arg4;
			local7.anInt1614 = arg5;
			local7.anInt1611 = arg2;
			local7.anInt1613 = arg6;
			if (arg5 >= 0 && arg4 >= 0 && arg5 < Static229.anInt4427 && Static379.anInt6422 > arg4) {
				Static173.method2819(local7);
			}
			Static362.aClass14_42.method300(local7);
		}
		local7.anInt1612 = -1;
		local7.anInt1602 = arg0;
		local7.anInt1608 = arg3;
		local7.anInt1606 = arg1;
		local7.anInt1609 = 0;
	}
}
