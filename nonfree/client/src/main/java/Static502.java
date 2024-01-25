import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!ru", name = "E", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_77 = new Class208(55, 2);

	@OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
	public static int anInt8694 = 0;

	@OriginalMember(owner = "client!ru", name = "N", descriptor = "[I")
	public static int[] anIntArray539 = new int[2];

	@OriginalMember(owner = "client!ru", name = "O", descriptor = "I")
	public static int anInt8698 = 0;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "([Lclient!sca;IZ)V")
	public static void method7484(@OriginalArg(0) Class302[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class302 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt8806 && !Static78.method1367(local13)) {
				if (local13.anInt8816 == 0) {
					method7484(arg0, local13.anInt8838);
					if (local13.aClass302Array2 != null) {
						method7484(local13.aClass302Array2, local13.anInt8838);
					}
					@Pc(50) Class6_Sub29 local50 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local13.anInt8838);
					if (local50 != null) {
						Static571.method8292(local50.anInt6361);
					}
				}
				if (local13.anInt8816 == 6 && local13.anInt8798 != -1) {
					@Pc(70) Class21 local70 = Static294.aClass373_2.method8738(local13.anInt8798);
					if (local70 != null) {
						local13.anInt8836 += Static333.anInt9456;
						@Pc(81) int local81 = local13.anInt8841;
						while (local70.anIntArray17[local13.anInt8841] < local13.anInt8836) {
							local13.anInt8836 -= local70.anIntArray17[local13.anInt8841];
							local13.anInt8841++;
							if (local13.anInt8841 >= local70.anIntArray15.length) {
								local13.anInt8841 -= local70.anInt346;
								if (local13.anInt8841 < 0 || local70.anIntArray15.length <= local13.anInt8841) {
									local13.anInt8841 = 0;
								}
							}
							local13.anInt8785 = local13.anInt8841 + 1;
							if (local70.anIntArray15.length <= local13.anInt8785) {
								local13.anInt8785 -= local70.anInt346;
								if (local13.anInt8785 < 0 || local70.anIntArray15.length <= local13.anInt8785) {
									local13.anInt8785 = -1;
								}
							}
							Static603.method8464(local13);
						}
						if (local13.anInt8841 != local81) {
							Static215.method3663(local70, local13.anInt8841);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!ha;Z)V")
	public static void method7485(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1) {
		if (!Static365.aBoolean444 || !Static231.aBoolean325) {
			Static339.anInt9925 = 0;
			return;
		}
		if (Static324.aBoolean414) {
			Static439.aLong173 = Static34.aClass137_2.method5523();
		}
		Static404.anInt7516 = 0;
		Static2.anInt10 = 0;
		Static565.anInt9568 = 0;
		@Pc(34) int[] local34 = arg1.Y();
		Static116.anInt2277 = (int) ((float) local34[3] / 3.0F);
		Static101.anInt1981 = (int) ((float) local34[2] / 3.0F);
		arg1.method8812(Static87.anIntArray120);
		if (Static497.anInt8615 != (int) ((float) Static87.anIntArray120[0] / 3.0F) || Static441.anInt7959 != (int) ((float) Static87.anIntArray120[1] / 3.0F)) {
			Static441.anInt7959 = (int) ((float) Static87.anIntArray120[1] / 3.0F);
			Static497.anInt8615 = (int) ((float) Static87.anIntArray120[0] / 3.0F);
			Static552.anInt9420 = Static497.anInt8615 >> 1;
			Static284.anIntArray483 = new int[Static497.anInt8615 * Static441.anInt7959];
			Static191.anInt3856 = Static441.anInt7959 >> 1;
		}
		Static171.aClass154_2 = arg1.method8830();
		Static339.anInt9925 = 0;
		for (@Pc(111) int local111 = 0; local111 < Static57.anInt1238; local111++) {
			Static376.method5922(arg0, arg1, Static337.aClass226Array3[local111]);
		}
		for (@Pc(126) int local126 = 0; local126 < Static496.anInt8600; local126++) {
			Static376.method5922(arg0, arg1, Static542.aClass226Array4[local126]);
		}
		for (@Pc(141) int local141 = 0; local141 < Static572.anInt9600; local141++) {
			Static376.method5922(arg0, arg1, Static65.aClass226Array1[local141]);
		}
		Static113.anInt2246 = 0;
		if (Static339.anInt9925 > 0) {
			@Pc(161) int local161 = Static284.anIntArray483.length;
			@Pc(168) int local168 = local161 - local161 & 0x7;
			@Pc(170) int local170 = 0;
			while (local170 < local168) {
				Static284.anIntArray483[local170++] = Integer.MAX_VALUE;
				Static284.anIntArray483[local170++] = Integer.MAX_VALUE;
				Static284.anIntArray483[local170++] = Integer.MAX_VALUE;
				Static284.anIntArray483[local170++] = Integer.MAX_VALUE;
				Static284.anIntArray483[local170++] = Integer.MAX_VALUE;
				Static284.anIntArray483[local170++] = Integer.MAX_VALUE;
				Static284.anIntArray483[local170++] = Integer.MAX_VALUE;
				Static284.anIntArray483[local170++] = Integer.MAX_VALUE;
			}
			while (local170 < local161) {
				Static284.anIntArray483[local170++] = Integer.MAX_VALUE;
			}
			Static600.anInt10018 = 1;
			for (@Pc(233) int local233 = 0; local233 < Static339.anInt9925; local233++) {
				@Pc(239) Class226 local239 = Static147.aClass226Array2[local233];
				Static349.method5625(local239.aShortArray84[1], local239.aShortArray83[1], local239.aShortArray84[0], local239.aShortArray85[0], local239.aShortArray83[0], local239.aShortArray84[3], local239.aShortArray83[3], local239.aShortArray85[1], local239.aShortArray85[3]);
				Static349.method5625(local239.aShortArray84[2], local239.aShortArray83[2], local239.aShortArray84[1], local239.aShortArray85[1], local239.aShortArray83[1], local239.aShortArray84[3], local239.aShortArray83[3], local239.aShortArray85[2], local239.aShortArray85[3]);
			}
			Static600.anInt10018 = 2;
		}
		if (Static324.aBoolean414) {
			Static522.aLong237 = Static34.aClass137_2.method5523() - Static439.aLong173;
		}
	}
}
