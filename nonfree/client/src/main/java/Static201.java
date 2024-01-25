import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
	public static int anInt3514;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method3004(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(21) int local21 = local6 + 3 & 0xFFFFFFFC;
		@Pc(27) int local27 = local21 / 4 * 3;
		if (local21 - 2 >= local6 || Static363.method5197(arg0.charAt(local21 - 2)) == -1) {
			local27 -= 2;
		} else if (local6 <= local21 - 1 || Static363.method5197(arg0.charAt(local21 - 1)) == -1) {
			local27--;
		}
		@Pc(84) byte[] local84 = new byte[local27];
		Static208.method3101(arg0, 0, local84);
		return local84;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IILclient!ha;)V")
	public static void method3005(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1) {
		if (!Static177.aBoolean501 || !Static183.aBoolean267) {
			Static505.anInt8623 = 0;
			return;
		}
		if (Static229.aBoolean361) {
			Static263.aLong165 = Static76.aClass123_1.method6011();
		}
		Static709.anInt11219 = 0;
		Static714.anInt11150 = 0;
		Static149.anInt2804 = 0;
		@Pc(32) int[] local32 = arg1.Y();
		Static432.anInt7597 = (int) ((float) local32[2] / 3.0F);
		Static372.anInt6367 = (int) ((float) local32[3] / 3.0F);
		arg1.method7702(Static52.anIntArray61);
		if ((int) ((float) Static52.anIntArray61[0] / 3.0F) != Static95.anInt1572 || Static581.anInt9510 != (int) ((float) Static52.anIntArray61[1] / 3.0F)) {
			Static95.anInt1572 = (int) ((float) Static52.anIntArray61[0] / 3.0F);
			Static581.anInt9510 = (int) ((float) Static52.anIntArray61[1] / 3.0F);
			Static74.anInt1138 = Static95.anInt1572 >> 1;
			Static58.anInt920 = Static581.anInt9510 >> 1;
			Static261.anIntArray274 = new int[Static581.anInt9510 * Static95.anInt1572];
		}
		Static512.aClass181_11 = arg1.method7683();
		Static505.anInt8623 = 0;
		for (@Pc(113) int local113 = 0; local113 < Static629.anInt10181; local113++) {
			Static726.method9447(arg0, arg1, Static537.aClass79Array4[local113]);
		}
		for (@Pc(134) int local134 = 0; local134 < Static458.anInt8069; local134++) {
			Static726.method9447(arg0, arg1, Static345.aClass79Array1[local134]);
		}
		for (@Pc(153) int local153 = 0; local153 < Static379.anInt6781; local153++) {
			Static726.method9447(arg0, arg1, Static483.aClass79Array3[local153]);
		}
		Static195.anInt7170 = 0;
		if (Static505.anInt8623 > 0) {
			@Pc(181) int local181 = Static261.anIntArray274.length;
			@Pc(188) int local188 = local181 - local181 & 0x7;
			@Pc(190) int local190 = 0;
			while (local190 < local188) {
				Static261.anIntArray274[local190++] = Integer.MAX_VALUE;
				Static261.anIntArray274[local190++] = Integer.MAX_VALUE;
				Static261.anIntArray274[local190++] = Integer.MAX_VALUE;
				Static261.anIntArray274[local190++] = Integer.MAX_VALUE;
				Static261.anIntArray274[local190++] = Integer.MAX_VALUE;
				Static261.anIntArray274[local190++] = Integer.MAX_VALUE;
				Static261.anIntArray274[local190++] = Integer.MAX_VALUE;
				Static261.anIntArray274[local190++] = Integer.MAX_VALUE;
			}
			while (local190 < local181) {
				Static261.anIntArray274[local190++] = Integer.MAX_VALUE;
			}
			Static577.anInt9465 = 1;
			for (@Pc(265) int local265 = 0; local265 < Static505.anInt8623; local265++) {
				@Pc(271) Class79 local271 = Static406.aClass79Array2[local265];
				Static216.method3468(local271.aShortArray38[3], local271.aShortArray37[1], local271.aShortArray37[0], local271.aShortArray36[1], local271.aShortArray37[3], local271.aShortArray36[0], local271.aShortArray36[3], local271.aShortArray38[1], local271.aShortArray38[0]);
				Static216.method3468(local271.aShortArray38[3], local271.aShortArray37[2], local271.aShortArray37[1], local271.aShortArray36[2], local271.aShortArray37[3], local271.aShortArray36[1], local271.aShortArray36[3], local271.aShortArray38[2], local271.aShortArray38[1]);
			}
			Static577.anInt9465 = 2;
		}
		if (Static229.aBoolean361) {
			Static398.aLong240 = Static76.aClass123_1.method6011() - Static263.aLong165;
		}
	}
}
