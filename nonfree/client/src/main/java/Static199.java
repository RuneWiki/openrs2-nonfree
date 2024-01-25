import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!js", name = "c", descriptor = "I")
	public static int anInt3764;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "I")
	public static int anInt3767;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method3101(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static387.aClass100_85.anInt2998 = 1;
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(18) short[] local18 = new short[16];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < Static380.aClass231_2.anInt6780; local22++) {
			@Pc(29) Class4 local29 = Static380.aClass231_2.method5648(local22);
			if ((!arg1 || local29.aBoolean9) && local29.anInt130 == -1 && local29.anInt112 == -1 && local29.anInt109 == 0 && local29.aString1.toLowerCase().indexOf(local15) != -1) {
				if (local20 >= 250) {
					Static87.anInt2049 = -1;
					Static315.aShortArray85 = null;
					return;
				}
				if (local18.length <= local20) {
					@Pc(76) short[] local76 = new short[local18.length * 2];
					for (@Pc(78) int local78 = 0; local78 < local20; local78++) {
						local76[local78] = local18[local78];
					}
					local18 = local76;
				}
				local18[local20++] = (short) local22;
			}
		}
		Static40.anInt1169 = 0;
		Static87.anInt2049 = local20;
		Static315.aShortArray85 = local18;
		@Pc(112) String[] local112 = new String[Static87.anInt2049];
		for (@Pc(114) int local114 = 0; local114 < Static87.anInt2049; local114++) {
			local112[local114] = Static380.aClass231_2.method5648(local18[local114]).aString1;
		}
		Static340.method4952(local112, Static315.aShortArray85);
		Static387.aClass100_85.method2507();
		Static387.aClass100_85.anInt2998 = 2;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)C")
	public static char method3102(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(44) char local44 = Static336.aCharArray4[local7 - 128];
			if (local44 == '\u0000') {
				local44 = '?';
			}
			local7 = local44;
		}
		return (char) local7;
	}
}
