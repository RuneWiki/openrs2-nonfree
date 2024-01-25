import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)Z")
	public static boolean method4910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static297.method3932(arg0, arg1) || Static5.method78(arg0, arg1);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZI)Lclient!of;")
	public static Class2_Sub36 method4911(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(18) long local18 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class2_Sub36) Static10.aClass72_1.method1659(local18);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!za;)V")
	public static void method4912(@OriginalArg(1) Class163 arg0) {
		arg0.ba(0, 0, Static141.anInt2513, 350);
		arg0.P(0, 0, Static141.anInt2513, 350, Static238.anInt3827 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static179.anInt3077;
		@Pc(35) int local35;
		if (Static166.anInt2851 > 0) {
			local35 = 346 - Static179.anInt3077 - 4;
			@Pc(45) int local45 = local27 * local35 / (Static166.anInt2851 + local27 - 1);
			@Pc(47) int local47 = 4;
			if (Static166.anInt2851 > 1) {
				local47 = (Static166.anInt2851 - Static157.anInt2696 - 1) * (local35 - local45) / (Static166.anInt2851 - 1) + 4;
			}
			arg0.P(Static141.anInt2513 - 16, local47, 12, local45, Static238.anInt3827 << 24 | 0x332277, 2);
			for (@Pc(85) int local85 = Static157.anInt2696; local27 + Static157.anInt2696 > local85 && Static166.anInt2851 > local85; local85++) {
				@Pc(94) String[] local94 = Static203.method2715('\b', aStringArray35[local85]);
				@Pc(103) int local103 = (Static141.anInt2513 - 16 - 8) / local94.length;
				for (@Pc(105) int local105 = 0; local105 < local94.length; local105++) {
					@Pc(113) int local113 = local103 * local105 + 8;
					arg0.ba(local113, 0, local113 + local103 - 8, 350);
					Static43.aClass92_1.method4512(350 - Static278.aClass141_8.anInt3614 - Static74.anInt1417 - (local85 + -Static157.anInt2696) * Static179.anInt3077 - 2, local113, local94[local105], -1, -16777216);
				}
			}
		}
		arg0.ba(0, 0, Static141.anInt2513, 350);
		arg0.method5543(Static141.anInt2513, -1, 350 - Static74.anInt1417, 0);
		Static143.aClass92_3.method4512(350 - Static241.aClass141_5.anInt3614 - 1, 10, "--> " + Static93.aString56, -1, -16777216);
		local35 = -1;
		if (Static266.anInt4392 % 30 > 15) {
			local35 = 16777215;
		}
		arg0.method5558(Static241.aClass141_5.method2914("--> " + Static93.aString56.substring(0, Static63.anInt1185)) + 10, -Static241.aClass141_5.anInt3614 + -11 + 350, local35, 12);
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public static void method4913() {
		@Pc(7) int local7 = Static119.anInt2204;
		@Pc(9) int[] local9 = Static200.anIntArray295;
		for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
			@Pc(23) Class3_Sub4_Sub1_Sub2 local23 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local9[local15]];
			if (local23 != null) {
				Static81.method1176(local23.method4009(), local23);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!dk;)V")
	public static void method4914(@OriginalArg(1) Class54 arg0) {
		Static4.anInt69 = arg0.method1102("titlebg");
		Static341.anInt5807 = arg0.method1102("logo");
	}
}
