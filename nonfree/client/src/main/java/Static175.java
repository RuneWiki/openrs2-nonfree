import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!h", name = "q", descriptor = "[Lclient!raa;")
	public static Class268[] aClass268Array2;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!dj;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II[BIIB)V")
	public static void method2693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		arg0 += arg3;
		@Pc(25) int local25 = arg1 - arg3 >> 2;
		while (true) {
			local25--;
			if (local25 < 0) {
				local25 = arg1 - arg3 & 0x3;
				while (true) {
					local25--;
					if (local25 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(30) int local30 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg2[local30] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg2[local35] = 1;
			arg0 = local40 + 1;
			arg2[local40] = 1;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZB)V")
	public static void method2694(@OriginalArg(0) boolean arg0) {
		if (Static298.aString68.length() == 0) {
			return;
		}
		Static555.method7074("--> " + Static298.aString68);
		Static361.method5343(false, Static298.aString68, arg0);
		Static298.aString68 = "";
		Static133.anInt4719 = 0;
		Static398.anInt7032 = 0;
	}
}
