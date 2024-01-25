import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!he", name = "g", descriptor = "J")
	public static long aLong110;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!uia;")
	public static final Class340 aClass340_3 = new Class340();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIB)Z")
	public static boolean method3538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static323.method5277(arg0, arg1) & Static369.method5998(arg1, arg0);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method3540() {
		for (@Pc(11) Class3_Sub4_Sub13 local11 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local11 != null; local11 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
			if (Static280.method4532(local11.anInt4577)) {
				Static310.method5127(local11);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!ha;)V")
	public static void method3541(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1) {
		if (!Static500.aBoolean598 || !Static378.aBoolean511) {
			Static280.anInt5017 = 0;
			return;
		}
		if (Static107.aBoolean156) {
			Static575.aLong253 = Static263.aClass183_1.method7334();
		}
		Static301.anInt5347 = 0;
		Static178.anInt10121 = 0;
		Static343.anInt6701 = 0;
		@Pc(31) int[] local31 = arg1.Y();
		Static449.anInt7993 = (int) ((float) local31[3] / 3.0F);
		Static380.anInt7104 = (int) ((float) local31[2] / 3.0F);
		arg1.method7530(Static381.anIntArray427);
		if ((int) ((float) Static381.anIntArray427[0] / 3.0F) != Static305.anInt5423 || Static93.anInt2201 != (int) ((float) Static381.anIntArray427[1] / 3.0F)) {
			Static93.anInt2201 = (int) ((float) Static381.anIntArray427[1] / 3.0F);
			Static305.anInt5423 = (int) ((float) Static381.anIntArray427[0] / 3.0F);
			Static101.anIntArray89 = new int[Static93.anInt2201 * Static305.anInt5423];
			Static289.anInt8542 = Static93.anInt2201 >> 1;
			Static436.anInt7858 = Static305.anInt5423 >> 1;
		}
		Static400.aClass39_9 = arg1.method7503();
		Static280.anInt5017 = 0;
		for (@Pc(112) int local112 = 0; local112 < Static402.anInt7434; local112++) {
			Static139.method2310(arg0, Static513.aClass309Array4[local112], arg1);
		}
		for (@Pc(131) int local131 = 0; local131 < Static199.anInt3923; local131++) {
			Static139.method2310(arg0, Static342.aClass309Array2[local131], arg1);
		}
		for (@Pc(146) int local146 = 0; local146 < Static346.anInt6729; local146++) {
			Static139.method2310(arg0, Static361.aClass309Array3[local146], arg1);
		}
		Static127.anInt2678 = 0;
		if (Static280.anInt5017 > 0) {
			@Pc(169) int local169 = Static101.anIntArray89.length;
			@Pc(176) int local176 = local169 - local169 & 0x7;
			@Pc(178) int local178 = 0;
			while (local176 > local178) {
				Static101.anIntArray89[local178++] = Integer.MAX_VALUE;
				Static101.anIntArray89[local178++] = Integer.MAX_VALUE;
				Static101.anIntArray89[local178++] = Integer.MAX_VALUE;
				Static101.anIntArray89[local178++] = Integer.MAX_VALUE;
				Static101.anIntArray89[local178++] = Integer.MAX_VALUE;
				Static101.anIntArray89[local178++] = Integer.MAX_VALUE;
				Static101.anIntArray89[local178++] = Integer.MAX_VALUE;
				Static101.anIntArray89[local178++] = Integer.MAX_VALUE;
			}
			while (local178 < local169) {
				Static101.anIntArray89[local178++] = Integer.MAX_VALUE;
			}
			Static231.anInt4359 = 1;
			for (@Pc(241) int local241 = 0; local241 < Static280.anInt5017; local241++) {
				@Pc(247) Class309 local247 = Static287.aClass309Array1[local241];
				Static406.method6474(local247.aShortArray130[3], local247.aShortArray131[3], local247.aShortArray131[1], local247.aShortArray130[0], local247.aShortArray130[1], local247.aShortArray129[0], local247.aShortArray129[1], local247.aShortArray129[3], local247.aShortArray131[0]);
				Static406.method6474(local247.aShortArray130[3], local247.aShortArray131[3], local247.aShortArray131[2], local247.aShortArray130[1], local247.aShortArray130[2], local247.aShortArray129[1], local247.aShortArray129[2], local247.aShortArray129[3], local247.aShortArray131[1]);
			}
			Static231.anInt4359 = 2;
		}
		if (Static107.aBoolean156) {
			Static116.aLong52 = Static263.aClass183_1.method7334() - Static575.aLong253;
		}
	}
}
