import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gea", name = "x", descriptor = "[Lclient!jp;")
	public static final Class3_Sub25[] aClass3_Sub25Array1 = new Class3_Sub25[2048];

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method3473(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1) {
		if (!Static237.aBoolean328 || !Static665.aBoolean805) {
			Static331.anInt5493 = 0;
			return;
		}
		if (Static68.aBoolean91) {
			Static375.aLong194 = Class239_Sub3.lb.method9231();
		}
		Static627.anInt10013 = 0;
		Static327.anInt5443 = 0;
		Static336.anInt5540 = 0;
		@Pc(31) int[] local31 = arg0.Y();
		Static636.anInt10127 = (int) ((float) local31[2] / 3.0F);
		Static587.anInt9462 = (int) ((float) local31[3] / 3.0F);
		arg0.method8525(Static500.anIntArray758);
		if ((int) ((float) Static500.anIntArray758[0] / 3.0F) != Static39.anInt907 || Static254.anInt4533 != (int) ((float) Static500.anIntArray758[1] / 3.0F)) {
			Static39.anInt907 = (int) ((float) Static500.anIntArray758[0] / 3.0F);
			Static254.anInt4533 = (int) ((float) Static500.anIntArray758[1] / 3.0F);
			Static215.anInt4112 = Static254.anInt4533 >> 1;
			Static69.anInt1323 = Static39.anInt907 >> 1;
			Static78.anIntArray318 = new int[Static254.anInt4533 * Static39.anInt907];
		}
		Static568.aClass239_8 = arg0.method8528();
		Static331.anInt5493 = 0;
		for (@Pc(112) int local112 = 0; local112 < Static618.anInt9907; local112++) {
			Static594.method8351(arg1, Static216.aClass60Array4[local112], arg0);
		}
		for (@Pc(127) int local127 = 0; local127 < Static569.anInt9199; local127++) {
			Static594.method8351(arg1, Static412.aClass60Array7[local127], arg0);
		}
		for (@Pc(146) int local146 = 0; local146 < Static169.anInt3342; local146++) {
			Static594.method8351(arg1, Static492.aClass60Array9[local146], arg0);
		}
		Static293.anInt4968 = 0;
		if (Static331.anInt5493 > 0) {
			@Pc(170) int local170 = Static78.anIntArray318.length;
			@Pc(177) int local177 = local170 - local170 & 0x7;
			@Pc(179) int local179 = 0;
			while (local177 > local179) {
				Static78.anIntArray318[local179++] = Integer.MAX_VALUE;
				Static78.anIntArray318[local179++] = Integer.MAX_VALUE;
				Static78.anIntArray318[local179++] = Integer.MAX_VALUE;
				Static78.anIntArray318[local179++] = Integer.MAX_VALUE;
				Static78.anIntArray318[local179++] = Integer.MAX_VALUE;
				Static78.anIntArray318[local179++] = Integer.MAX_VALUE;
				Static78.anIntArray318[local179++] = Integer.MAX_VALUE;
				Static78.anIntArray318[local179++] = Integer.MAX_VALUE;
			}
			while (local179 < local170) {
				Static78.anIntArray318[local179++] = Integer.MAX_VALUE;
			}
			Static15.anInt8490 = 1;
			for (@Pc(242) int local242 = 0; local242 < Static331.anInt5493; local242++) {
				@Pc(248) Class60 local248 = Static433.aClass60Array10[local242];
				Static385.method5505(local248.aShortArray24[0], local248.aShortArray24[3], local248.aShortArray24[1], local248.aShortArray25[1], local248.aShortArray25[3], local248.aShortArray26[3], local248.aShortArray26[0], local248.aShortArray26[1], local248.aShortArray25[0]);
				Static385.method5505(local248.aShortArray24[1], local248.aShortArray24[3], local248.aShortArray24[2], local248.aShortArray25[2], local248.aShortArray25[3], local248.aShortArray26[3], local248.aShortArray26[1], local248.aShortArray26[2], local248.aShortArray25[1]);
			}
			Static15.anInt8490 = 2;
		}
		if (Static68.aBoolean91) {
			Static540.aLong256 = Class239_Sub3.lb.method9231() - Static375.aLong194;
		}
	}
}
