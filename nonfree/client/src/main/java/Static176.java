import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Lclient!df;")
	public static Class27 aClass27_8;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "Lclient!pg;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public static int anInt3801 = 0;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
	public static int anInt3805 = -2;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1038 = Static231.method3737(")1");

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	public static int anInt3812 = 0;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
	public static int anInt3813 = 0;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
	public static int anInt3816 = 0;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!sc;B)V")
	public static void method2782(@OriginalArg(0) int arg0, @OriginalArg(1) Class107 arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(13) Class107 local13 = arg1.method3109().method3092();
		for (@Pc(15) int local15 = 0; local15 < Static10.anInt285; local15++) {
			@Pc(23) Class5_Sub5_Sub1 local23 = Static198.aClass5_Sub5_Sub1Array1[Static16.anIntArray38[local15]];
			if (local23 != null && local23.aClass107_351 != null && local23.aClass107_351.method3096(local13)) {
				Static119.method2054(0, local23.anIntArray256[0], 1, local23.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				local7 = true;
				if (arg0 == 1) {
					Static193.aClass1_Sub26_Sub1_2.method3000(27);
					Static193.aClass1_Sub26_Sub1_2.method2963(Static16.anIntArray38[local15]);
				} else if (arg0 == 4) {
					Static193.aClass1_Sub26_Sub1_2.method3000(172);
					Static193.aClass1_Sub26_Sub1_2.method2963(Static16.anIntArray38[local15]);
				} else if (arg0 == 6) {
					Static193.aClass1_Sub26_Sub1_2.method3000(76);
					Static193.aClass1_Sub26_Sub1_2.method2949(Static16.anIntArray38[local15]);
				} else if (arg0 == 7) {
					Static193.aClass1_Sub26_Sub1_2.method3000(176);
					Static193.aClass1_Sub26_Sub1_2.method2949(Static16.anIntArray38[local15]);
				}
				break;
			}
		}
		if (!local7) {
			Static136.method2282(Static149.method2437(new Class107[] { Static113.aClass107_673, local13 }), 0, Static63.aClass107_427);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([Lclient!sc;[SB)V")
	public static void method2783(@OriginalArg(0) Class107[] arg0, @OriginalArg(1) short[] arg1) {
		Static179.method2842(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public static void method2784() {
		if (Static25.anInt497 == 5) {
			Static25.anInt497 = 6;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Z")
	public static boolean method2785(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}
}
