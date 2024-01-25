import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "J")
	public static long aLong58;

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
	public static int anInt1216 = 0;

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_33 = new Class160(141, 3);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IBLclient!ha;)V")
	public static void method1239(@OriginalArg(0) int arg0, @OriginalArg(2) Class144 arg1) {
		if (!Static413.aBoolean501 || !Static434.aBoolean515) {
			Static475.anInt8190 = 0;
			return;
		}
		if (Static99.aBoolean126) {
			Static307.aLong157 = Static515.aClass29_1.method9347();
		}
		Static235.anInt4560 = 0;
		Static264.anInt4913 = 0;
		Static108.anInt1853 = 0;
		@Pc(32) int[] local32 = arg1.Y();
		Static214.anInt3758 = (int) ((float) local32[2] / 3.0F);
		Static581.anInt9592 = (int) ((float) local32[3] / 3.0F);
		arg1.method6921(Static373.anIntArray344);
		if (Static55.anInt955 != (int) ((float) Static373.anIntArray344[0] / 3.0F) || Static550.anInt9243 != (int) ((float) Static373.anIntArray344[1] / 3.0F)) {
			Static550.anInt9243 = (int) ((float) Static373.anIntArray344[1] / 3.0F);
			Static55.anInt955 = (int) ((float) Static373.anIntArray344[0] / 3.0F);
			Static572.anIntArray493 = new int[Static55.anInt955 * Static550.anInt9243];
			Static553.anInt9261 = Static55.anInt955 >> 1;
			Static370.anInt6294 = Static550.anInt9243 >> 1;
		}
		Static109.aClass263_2 = arg1.method6943();
		Static475.anInt8190 = 0;
		for (@Pc(113) int local113 = 0; local113 < Static207.anInt3630; local113++) {
			Static483.method7278(Static630.aClass393Array3[local113], arg1, arg0);
		}
		for (@Pc(134) int local134 = 0; local134 < Static264.anInt4916; local134++) {
			Static483.method7278(Static600.aClass393Array2[local134], arg1, arg0);
		}
		for (@Pc(153) int local153 = 0; local153 < Static83.anInt1456; local153++) {
			Static483.method7278(Static572.aClass393Array1[local153], arg1, arg0);
		}
		Static241.anInt4621 = 0;
		if (Static475.anInt8190 > 0) {
			@Pc(184) int local184 = Static572.anIntArray493.length;
			@Pc(191) int local191 = local184 - local184 & 0x7;
			@Pc(193) int local193 = 0;
			while (local191 > local193) {
				Static572.anIntArray493[local193++] = Integer.MAX_VALUE;
				Static572.anIntArray493[local193++] = Integer.MAX_VALUE;
				Static572.anIntArray493[local193++] = Integer.MAX_VALUE;
				Static572.anIntArray493[local193++] = Integer.MAX_VALUE;
				Static572.anIntArray493[local193++] = Integer.MAX_VALUE;
				Static572.anIntArray493[local193++] = Integer.MAX_VALUE;
				Static572.anIntArray493[local193++] = Integer.MAX_VALUE;
				Static572.anIntArray493[local193++] = Integer.MAX_VALUE;
			}
			while (local193 < local184) {
				Static572.anIntArray493[local193++] = Integer.MAX_VALUE;
			}
			Static178.anInt2910 = 1;
			for (@Pc(264) int local264 = 0; local264 < Static475.anInt8190; local264++) {
				@Pc(270) Class393 local270 = Static682.aClass393Array4[local264];
				Static392.method5968(local270.aShortArray144[1], local270.aShortArray145[0], local270.aShortArray144[3], local270.aShortArray146[1], local270.aShortArray144[0], local270.aShortArray146[0], local270.aShortArray145[1], local270.aShortArray146[3], local270.aShortArray145[3]);
				Static392.method5968(local270.aShortArray144[2], local270.aShortArray145[1], local270.aShortArray144[3], local270.aShortArray146[2], local270.aShortArray144[1], local270.aShortArray146[1], local270.aShortArray145[2], local270.aShortArray146[3], local270.aShortArray145[3]);
			}
			Static178.anInt2910 = 2;
		}
		if (Static99.aBoolean126) {
			Static605.aLong194 = Static515.aClass29_1.method9347() - Static307.aLong157;
		}
	}
}
