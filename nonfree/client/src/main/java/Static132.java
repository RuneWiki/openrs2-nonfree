import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
	public static boolean aBoolean176 = false;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "Lclient!dia;")
	public static final Class74 aClass74_12 = new Class74("", 10);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZI)I")
	public static int method1985(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static354.method5601(arg1 - 1, arg0 + -1) + Static354.method5601(arg1 - 1, arg0 - -1) + Static354.method5601(arg1 + 1, arg0 + -1) + Static354.method5601(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static354.method5601(arg1, arg0 - 1) + Static354.method5601(arg1, arg0 + 1) + Static354.method5601(arg1 - 1, arg0) + Static354.method5601(arg1 + 1, arg0);
		@Pc(81) int local81 = Static354.method5601(arg1, arg0);
		return local81 / 4 + local40 / 16 + local76 / 8;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method1987(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static546.method7740(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1 != arg0.charAt(local25); local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method1988() {
		for (@Pc(7) int local7 = 0; local7 < Static180.anInt3253; local7++) {
			@Pc(18) int local18 = Static561.method7890(Static180.anInt3253, Static306.anInt4861 + local7) * Static116.anInt1804;
			for (@Pc(20) int local20 = 0; local20 < Static116.anInt1804; local20++) {
				@Pc(31) int local31 = local18 + Static561.method7890(Static116.anInt1804, Static607.anInt9954 + local20);
				if (Static137.anInt2284 == Static583.anIntArray754[local31]) {
					Static311.anInterface16Array1[local31].method8545(0, 0, Static133.anInt3875, Static549.anInt9105, Static133.anInt3875 * local20, local7 * Static549.anInt9105);
				}
			}
		}
	}
}
