import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Lclient!pf;")
	public static final Class286 aClass286_4 = new Class286("", 13);

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "[F")
	public static final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "[I")
	public static final int[] anIntArray229 = new int[16];

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
	public static int anInt3049 = -1;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!tl;ZZ)V")
	public static void method2658(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean887 = arg1;
		if (Static4.aBoolean8) {
			Static444.aClass324Array1[Static444.aClass324Array1.length - 1].method7738(arg0);
		} else {
			Static253.method3573(arg0, Static240.aClass2_Sub7Array7);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public static void method2659() {
		Static517.aClass86_8 = null;
		Static499.aClass86_7 = null;
		Class4_Sub2_Sub1_Sub1.lb = null;
		Static553.aClass86_9 = null;
		Static136.anInterface1_1 = null;
		Static627.anIntArray698 = null;
		Static240.anInt10701 = -1;
		Static470.anInt7566 = -1;
		Static682.anInt11017 = -1;
		Static642.anInt9853 = -1;
		Static614.aClass145_14 = null;
		Static247.aClass52_1.method1069();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLclient!ha;I)V")
	public static void method2660(@OriginalArg(1) Class145 arg0, @OriginalArg(2) int arg1) {
		if (!Static334.aBoolean436 || !Static11.aBoolean26) {
			Static339.anInt5253 = 0;
			return;
		}
		if (Static458.aBoolean645) {
			Static249.aLong131 = Static711.aClass157_1.method7779();
		}
		Static437.anInt7125 = 0;
		Static373.anInt5942 = 0;
		Static558.anInt8804 = 0;
		@Pc(32) int[] local32 = arg0.Y();
		Static485.anInt7770 = (int) ((float) local32[3] / 3.0F);
		Static693.anInt10661 = (int) ((float) local32[2] / 3.0F);
		arg0.method9668(Static546.anIntArray609);
		if (Static451.anInt7308 != (int) ((float) Static546.anIntArray609[0] / 3.0F) || Static627.anInt9602 != (int) ((float) Static546.anIntArray609[1] / 3.0F)) {
			Static451.anInt7308 = (int) ((float) Static546.anIntArray609[0] / 3.0F);
			Static627.anInt9602 = (int) ((float) Static546.anIntArray609[1] / 3.0F);
			Static101.anInt8907 = Static451.anInt7308 >> 1;
			Static146.anIntArray186 = new int[Static627.anInt9602 * Static451.anInt7308];
			Static396.anInt6520 = Static627.anInt9602 >> 1;
		}
		Static23.aClass86_4 = arg0.method9716();
		Static339.anInt5253 = 0;
		for (@Pc(122) int local122 = 0; local122 < Static219.anInt3509; local122++) {
			Static237.method9875(arg0, arg1, Static314.aClass252Array1[local122]);
		}
		for (@Pc(139) int local139 = 0; local139 < Static672.anInt10469; local139++) {
			Static237.method9875(arg0, arg1, Static437.aClass252Array3[local139]);
		}
		for (@Pc(162) int local162 = 0; local162 < Static670.anInt10425; local162++) {
			Static237.method9875(arg0, arg1, Static449.aClass252Array4[local162]);
		}
		Static170.anInt2918 = 0;
		if (Static339.anInt5253 > 0) {
			@Pc(190) int local190 = Static146.anIntArray186.length;
			@Pc(196) int local196 = local190 - local190 & 0x7;
			@Pc(198) int local198 = 0;
			while (local196 > local198) {
				Static146.anIntArray186[local198++] = Integer.MAX_VALUE;
				Static146.anIntArray186[local198++] = Integer.MAX_VALUE;
				Static146.anIntArray186[local198++] = Integer.MAX_VALUE;
				Static146.anIntArray186[local198++] = Integer.MAX_VALUE;
				Static146.anIntArray186[local198++] = Integer.MAX_VALUE;
				Static146.anIntArray186[local198++] = Integer.MAX_VALUE;
				Static146.anIntArray186[local198++] = Integer.MAX_VALUE;
				Static146.anIntArray186[local198++] = Integer.MAX_VALUE;
			}
			while (local190 > local198) {
				Static146.anIntArray186[local198++] = Integer.MAX_VALUE;
			}
			Static637.anInt4095 = 1;
			for (@Pc(273) int local273 = 0; local273 < Static339.anInt5253; local273++) {
				@Pc(279) Class252 local279 = Static371.aClass252Array2[local273];
				Static215.method2997(local279.aShortArray113[0], local279.aShortArray112[0], local279.aShortArray113[1], local279.aShortArray113[3], local279.aShortArray114[1], local279.aShortArray112[3], local279.aShortArray114[3], local279.aShortArray114[0], local279.aShortArray112[1]);
				Static215.method2997(local279.aShortArray113[1], local279.aShortArray112[1], local279.aShortArray113[2], local279.aShortArray113[3], local279.aShortArray114[2], local279.aShortArray112[3], local279.aShortArray114[3], local279.aShortArray114[1], local279.aShortArray112[2]);
			}
			Static637.anInt4095 = 2;
		}
		if (Static458.aBoolean645) {
			Static18.aLong15 = Static711.aClass157_1.method7779() - Static249.aLong131;
		}
	}
}
