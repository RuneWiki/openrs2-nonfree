import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!an", name = "f", descriptor = "B")
	public static byte aByte7;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "I")
	public static int anInt921;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method975(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg4 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg1 + 8 - 1) / 8);
		for (@Pc(55) int local55 = local32; local55 < 0; local55++) {
			for (@Pc(59) int local59 = local41; local59 < 0; local59++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local19;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method976(@OriginalArg(1) Class5 arg0) {
		for (@Pc(6) Class4_Sub10 local6 = (Class4_Sub10) Static88.aClass120_1.method2966(); local6 != null; local6 = (Class4_Sub10) Static88.aClass120_1.method2962()) {
			if (local6.aBoolean653) {
				local6.method7856(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BF)F")
	public static float method977(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method978(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.length();
		while (local18 < local21 && Static38.method1294(arg0.charAt(local18))) {
			local18++;
		}
		while (local18 < local21 && Static38.method1294(arg0.charAt(local21 - 1))) {
			local21--;
		}
		@Pc(55) int local55 = local21 - local18;
		if (local55 < 1 || local55 > 12) {
			return null;
		}
		@Pc(68) StringBuffer local68 = new StringBuffer(local55);
		for (@Pc(70) int local70 = local18; local70 < local21; local70++) {
			@Pc(76) char local76 = arg0.charAt(local70);
			if (Static289.method7331(local76)) {
				@Pc(86) char local86 = Static430.method6700(local76);
				if (local86 != '\u0000') {
					local68.append(local86);
				}
			}
		}
		if (local68.length() == 0) {
			return null;
		} else {
			return local68.toString();
		}
	}
}
