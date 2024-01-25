import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "J")
	public static long aLong206 = 0L;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!r;IZ)V")
	public static void method4205(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1) {
		if (!Static457.aBoolean566) {
			Static259.anInt4761 = 0;
			return;
		}
		if (Static69.aBoolean128) {
			Static214.aLong171 = Static301.aClass132_1.method6704();
		}
		Static264.anInt4970 = 0;
		Static486.anInt8200 = 0;
		Static500.anInt6882 = 0;
		@Pc(25) int[] local25 = arg0.v();
		Static465.anInt7899 = (int) ((float) local25[2] / 3.0F);
		Static425.anInt7203 = (int) ((float) local25[3] / 3.0F);
		arg0.method6430(Static176.anIntArray185);
		if ((int) ((float) Static176.anIntArray185[0] / 3.0F) != Static126.anInt6657 || (int) ((float) Static176.anIntArray185[1] / 3.0F) != Static61.anInt1533) {
			Static61.anInt1533 = (int) ((float) Static176.anIntArray185[1] / 3.0F);
			Static126.anInt6657 = (int) ((float) Static176.anIntArray185[0] / 3.0F);
			Static446.anInt7726 = Static126.anInt6657 >> 1;
			Static544.anInt8951 = Static61.anInt1533 >> 1;
			Static227.anIntArray262 = new int[Static61.anInt1533 * Static126.anInt6657];
		}
		Static301.aClass209_5 = arg0.method6417();
		Static259.anInt4761 = 0;
		for (@Pc(110) int local110 = 0; local110 < Static465.anInt7900; local110++) {
			Static311.method4775(arg0, Static172.aClass50Array2[local110], arg1);
		}
		for (@Pc(125) int local125 = 0; local125 < Static69.anInt1595; local125++) {
			Static311.method4775(arg0, Static460.aClass50Array4[local125], arg1);
		}
		for (@Pc(144) int local144 = 0; local144 < Static97.anInt6022; local144++) {
			Static311.method4775(arg0, Static235.aClass50Array3[local144], arg1);
		}
		Static13.anInt359 = 0;
		if (Static259.anInt4761 > 0) {
			@Pc(168) int local168 = Static227.anIntArray262.length;
			@Pc(174) int local174 = local168 - local168 & 0x7;
			@Pc(176) int local176 = 0;
			while (local174 > local176) {
				Static227.anIntArray262[local176++] = Integer.MAX_VALUE;
				Static227.anIntArray262[local176++] = Integer.MAX_VALUE;
				Static227.anIntArray262[local176++] = Integer.MAX_VALUE;
				Static227.anIntArray262[local176++] = Integer.MAX_VALUE;
				Static227.anIntArray262[local176++] = Integer.MAX_VALUE;
				Static227.anIntArray262[local176++] = Integer.MAX_VALUE;
				Static227.anIntArray262[local176++] = Integer.MAX_VALUE;
				Static227.anIntArray262[local176++] = Integer.MAX_VALUE;
			}
			while (local168 > local176) {
				Static227.anIntArray262[local176++] = Integer.MAX_VALUE;
			}
			Static343.anInt6063 = 1;
			for (@Pc(235) int local235 = 0; local235 < Static259.anInt4761; local235++) {
				@Pc(241) Class50 local241 = Static17.aClass50Array1[local235];
				Static417.method5835(local241.aShortArray19[1], local241.aShortArray18[1], local241.aShortArray17[1], local241.aShortArray17[3], local241.aShortArray18[3], local241.aShortArray18[0], local241.aShortArray19[0], local241.aShortArray19[3], local241.aShortArray17[0]);
				Static417.method5835(local241.aShortArray19[2], local241.aShortArray18[2], local241.aShortArray17[2], local241.aShortArray17[3], local241.aShortArray18[3], local241.aShortArray18[1], local241.aShortArray19[1], local241.aShortArray19[3], local241.aShortArray17[1]);
			}
			Static343.anInt6063 = 2;
		}
		if (Static69.aBoolean128) {
			Static260.aLong198 = Static301.aClass132_1.method6704() - Static214.aLong171;
		}
	}
}
