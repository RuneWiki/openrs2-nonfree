import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "[[Lclient!raa;")
	public static Class295[][] aClass295ArrayArray1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public static int anInt5443 = 0;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_65 = new Class46(83, -1);

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_101 = new Class337(94, 3);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I")
	public static int method4872(@OriginalArg(0) int arg0) {
		@Pc(21) int local21 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(32) int local32 = (local21 & 0x33333333) + ((local21 & 0xCCCCCCCE) >>> 2);
		@Pc(41) int local41 = local32 + (local32 >>> 4) & 0xF0F0F0F;
		@Pc(47) int local47 = local41 + (local41 >>> 8);
		@Pc(53) int local53 = local47 + (local47 >>> 16);
		return local53 & 0xFF;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IC)C")
	public static char method4873(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4874(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(17) int local17 = arg0.indexOf(arg1); local17 != -1; local17 = arg0.indexOf(arg1, arg2.length() + local17)) {
			arg0 = arg0.substring(0, local17) + arg2 + arg0.substring(arg1.length() + local17);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BIII)V")
	public static void method4876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 * Static97.aClass5_Sub25_8.aClass6_Sub18_1.method5120() >> 8;
		if (arg0 == -1 && !Static327.aBoolean403) {
			Static644.method9024();
		} else if (arg0 != -1 && (Static407.anInt7117 != arg0 || !Static32.method414()) && local12 != 0 && !Static327.aBoolean403) {
			Static386.method5645(arg0, local12, arg2, Static151.aClass207_34);
			Static283.method4494();
		}
		if (arg0 != Static407.anInt7117) {
			Static503.aClass5_Sub1_Sub5_3 = null;
		}
		Static407.anInt7117 = arg0;
	}
}
