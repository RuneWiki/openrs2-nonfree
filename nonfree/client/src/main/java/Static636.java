import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IZI)I")
	public static int method8561(@OriginalArg(2) int arg0) {
		@Pc(12) Class5_Sub43 local12 = Static10.method153(arg0, false);
		if (local12 == null) {
			return Static446.aClass242_1.method5736(arg0).anInt5756;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(31) int local31 = 0; local31 < local12.anIntArray406.length; local31++) {
			if (local12.anIntArray406[local31] == -1) {
				local24++;
			}
		}
		return local24 + Static446.aClass242_1.method5736(arg0).anInt5756 - local12.anIntArray406.length;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IBLclient!ha;)V")
	public static void method8562(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		if (!Static37.aBoolean43 || !Static521.aBoolean738) {
			Static530.anInt8752 = 0;
			return;
		}
		if (Static57.aBoolean62) {
			Static411.aLong191 = Static178.aClass85_1.method4957();
		}
		Static291.anInt9486 = 0;
		Static464.anInt7835 = 0;
		Static156.anInt3155 = 0;
		@Pc(27) int[] local27 = arg1.Y();
		Static258.anInt4782 = (int) ((float) local27[3] / 3.0F);
		Static268.anInt4963 = (int) ((float) local27[2] / 3.0F);
		arg1.method6945(Static658.anIntArray600);
		if (Static552.anInt9017 != (int) ((float) Static658.anIntArray600[0] / 3.0F) || Static150.anInt3079 != (int) ((float) Static658.anIntArray600[1] / 3.0F)) {
			Static552.anInt9017 = (int) ((float) Static658.anIntArray600[0] / 3.0F);
			Static150.anInt3079 = (int) ((float) Static658.anIntArray600[1] / 3.0F);
			Static222.anInt4111 = Static552.anInt9017 >> 1;
			Static655.anInt10580 = Static150.anInt3079 >> 1;
			Static595.anIntArray540 = new int[Static150.anInt3079 * Static552.anInt9017];
		}
		Static151.aClass254_3 = arg1.method6890();
		Static530.anInt8752 = 0;
		for (@Pc(108) int local108 = 0; local108 < Static364.anInt6622; local108++) {
			Static41.method594(arg0, arg1, Static522.aClass38Array4[local108]);
		}
		for (@Pc(127) int local127 = 0; local127 < Static272.anInt5008; local127++) {
			Static41.method594(arg0, arg1, Static402.aClass38Array3[local127]);
		}
		for (@Pc(146) int local146 = 0; local146 < Static479.anInt8053; local146++) {
			Static41.method594(arg0, arg1, Static108.aClass38Array1[local146]);
		}
		Static383.anInt6814 = 0;
		if (Static530.anInt8752 > 0) {
			@Pc(170) int local170 = Static595.anIntArray540.length;
			@Pc(177) int local177 = local170 - local170 & 0x7;
			@Pc(179) int local179 = 0;
			while (local179 < local177) {
				Static595.anIntArray540[local179++] = Integer.MAX_VALUE;
				Static595.anIntArray540[local179++] = Integer.MAX_VALUE;
				Static595.anIntArray540[local179++] = Integer.MAX_VALUE;
				Static595.anIntArray540[local179++] = Integer.MAX_VALUE;
				Static595.anIntArray540[local179++] = Integer.MAX_VALUE;
				Static595.anIntArray540[local179++] = Integer.MAX_VALUE;
				Static595.anIntArray540[local179++] = Integer.MAX_VALUE;
				Static595.anIntArray540[local179++] = Integer.MAX_VALUE;
			}
			while (local170 > local179) {
				Static595.anIntArray540[local179++] = Integer.MAX_VALUE;
			}
			Static203.anInt3866 = 1;
			for (@Pc(242) int local242 = 0; local242 < Static530.anInt8752; local242++) {
				@Pc(248) Class38 local248 = Static390.aClass38Array2[local242];
				Static619.method8410(local248.aShortArray5[1], local248.aShortArray4[1], local248.aShortArray6[1], local248.aShortArray5[0], local248.aShortArray6[3], local248.aShortArray4[3], local248.aShortArray6[0], local248.aShortArray5[3], local248.aShortArray4[0]);
				Static619.method8410(local248.aShortArray5[2], local248.aShortArray4[2], local248.aShortArray6[2], local248.aShortArray5[1], local248.aShortArray6[3], local248.aShortArray4[3], local248.aShortArray6[1], local248.aShortArray5[3], local248.aShortArray4[1]);
			}
			Static203.anInt3866 = 2;
		}
		if (Static57.aBoolean62) {
			Static287.aLong135 = Static178.aClass85_1.method4957() - Static411.aLong191;
		}
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)V")
	public static void method8563() {
		Static300.aClass340_65.method8000();
	}

	@OriginalMember(owner = "client!vja", name = "d", descriptor = "(II)Z")
	public static boolean method8568(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
