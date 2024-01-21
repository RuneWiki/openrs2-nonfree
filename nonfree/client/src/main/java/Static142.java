import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public static int anInt3264;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1128 = Static65.method1172("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1129 = Static65.method1172("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1130 = Static65.method1172("null");

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public static int anInt3266 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	public static void method2372() {
		aClass46_1129 = null;
		aClass46_1128 = null;
		aClass46_1130 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!h;)V")
	public static void method2373(@OriginalArg(1) Class33 arg0) {
		if (arg0.anInt1459 == Static27.anInt614) {
			Static178.aBooleanArray20[arg0.anInt1474] = true;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII[B[Lclient!qf;III)V")
	public static void method2374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) Class69[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg3 + local3 > 0 && arg3 + local3 < 103 && arg8 + local7 > 0 && arg8 + local7 < 103) {
					arg6[arg1].anIntArrayArray35[local3 + arg3][arg8 + local7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(83) Class3_Sub4 local83 = new Class3_Sub4(arg5);
		for (@Pc(90) int local90 = 0; local90 < 4; local90++) {
			for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
				for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
					if (local90 == arg7 && local94 >= arg0 && arg0 + 8 > local94 && local98 >= arg4 && local98 < arg4 + 8) {
						Static69.method1189(local83, arg8 + Static77.method1280(arg2, local94 & 0x7, local98 & 0x7), Static122.method2087(local94 & 0x7, arg2, local98 & 0x7) + arg3, arg1, arg2, 0, 0);
					} else {
						Static69.method1189(local83, -1, -1, 0, 0, 0, 0);
					}
				}
			}
		}
	}
}
