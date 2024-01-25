import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	public static int anInt5681;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "Lclient!de;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "[I")
	public static final int[] anIntArray290 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBLclient!ha;)V")
	public static void method5150(@OriginalArg(0) int arg0, @OriginalArg(2) Class101 arg1) {
		if (!Static351.aBoolean516 || !Static175.aBoolean283) {
			Static90.anInt1654 = 0;
			return;
		}
		if (Static41.aBoolean52) {
			Static56.aLong42 = Static129.aClass69_1.method2396();
		}
		Static20.anInt361 = 0;
		Static640.anInt11082 = 0;
		Static383.anInt7255 = 0;
		@Pc(27) int[] local27 = arg1.Y();
		Static131.anInt2513 = (int) ((float) local27[3] / 3.0F);
		Static390.anInt7383 = (int) ((float) local27[2] / 3.0F);
		arg1.method8106(Static287.anIntArray267);
		if (Static171.anInt3607 != (int) ((float) Static287.anIntArray267[0] / 3.0F) || Static167.anInt3590 != (int) ((float) Static287.anIntArray267[1] / 3.0F)) {
			Static171.anInt3607 = (int) ((float) Static287.anIntArray267[0] / 3.0F);
			Static167.anInt3590 = (int) ((float) Static287.anIntArray267[1] / 3.0F);
			Static610.anInt10745 = Static171.anInt3607 >> 1;
			Static41.anInt911 = Static167.anInt3590 >> 1;
			Static553.anIntArray490 = new int[Static167.anInt3590 * Static171.anInt3607];
		}
		Static182.aClass76_5 = arg1.method8112();
		Static90.anInt1654 = 0;
		for (@Pc(100) int local100 = 0; local100 < Static594.anInt10306; local100++) {
			Static173.method3383(arg0, Static612.aClass348Array4[local100], arg1);
		}
		for (@Pc(125) int local125 = 0; local125 < Static398.anInt7403; local125++) {
			Static173.method3383(arg0, Static201.aClass348Array2[local125], arg1);
		}
		for (@Pc(142) int local142 = 0; local142 < Static527.anInt9295; local142++) {
			Static173.method3383(arg0, Static544.aClass348Array3[local142], arg1);
		}
		Static22.anInt390 = 0;
		if (Static90.anInt1654 > 0) {
			@Pc(171) int local171 = Static553.anIntArray490.length;
			@Pc(178) int local178 = local171 - local171 & 0x7;
			@Pc(180) int local180 = 0;
			while (local178 > local180) {
				Static553.anIntArray490[local180++] = Integer.MAX_VALUE;
				Static553.anIntArray490[local180++] = Integer.MAX_VALUE;
				Static553.anIntArray490[local180++] = Integer.MAX_VALUE;
				Static553.anIntArray490[local180++] = Integer.MAX_VALUE;
				Static553.anIntArray490[local180++] = Integer.MAX_VALUE;
				Static553.anIntArray490[local180++] = Integer.MAX_VALUE;
				Static553.anIntArray490[local180++] = Integer.MAX_VALUE;
				Static553.anIntArray490[local180++] = Integer.MAX_VALUE;
			}
			while (local180 < local171) {
				Static553.anIntArray490[local180++] = Integer.MAX_VALUE;
			}
			Static507.anInt9029 = 1;
			for (@Pc(247) int local247 = 0; local247 < Static90.anInt1654; local247++) {
				@Pc(253) Class348 local253 = Static45.aClass348Array1[local247];
				Static13.method7475(local253.aShortArray148[1], local253.aShortArray149[1], local253.aShortArray149[3], local253.aShortArray147[3], local253.aShortArray148[3], local253.aShortArray149[0], local253.aShortArray147[1], local253.aShortArray148[0], local253.aShortArray147[0]);
				Static13.method7475(local253.aShortArray148[2], local253.aShortArray149[2], local253.aShortArray149[3], local253.aShortArray147[3], local253.aShortArray148[3], local253.aShortArray149[1], local253.aShortArray147[2], local253.aShortArray148[1], local253.aShortArray147[1]);
			}
			Static507.anInt9029 = 2;
		}
		if (Static41.aBoolean52) {
			Static561.aLong268 = Static129.aClass69_1.method2396() - Static56.aLong42;
		}
	}
}
