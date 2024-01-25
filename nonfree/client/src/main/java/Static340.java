import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!lc;")
	public static Class207 aClass207_3;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "[I")
	public static int[] anIntArray412;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "Lclient!ha;")
	public static Class33 aClass33_9;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "Lclient!lf;")
	public static final Class210 aClass210_9 = new Class210(4, 1);

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_92 = new Class216(39, 3);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
	public static void method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static124.aClass4_Sub20_4.aClass8_Sub22_4.method7414() != 0 && arg3 != 0 && Static655.anInt10336 < 50 && arg4 != -1) {
			Static665.aClass129Array1[Static655.anInt10336++] = new Class129((byte) 1, arg4, arg3, arg1, arg0, arg5, arg2, (Class3_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZIII)V")
	public static void method4635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) float local13 = (float) Static154.anInt440 / (float) Static154.anInt433;
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg0;
		if (local13 < 1.0F) {
			local17 = (int) (local13 * (float) arg1);
		} else {
			local15 = (int) ((float) arg0 / local13);
		}
		@Pc(44) int local44 = arg2 - (arg0 - local17) / 2;
		@Pc(53) int local53 = arg3 - (arg1 - local15) / 2;
		Static379.anInt5638 = Static154.anInt440 - Static154.anInt440 * local44 / local17;
		Static527.anInt8178 = -1;
		Static253.anInt4127 = Static154.anInt433 * local53 / local15;
		Static451.anInt7047 = -1;
		Static258.method3733();
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public static void method4636() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static499.aBoolean608) {
			local9 = 4096;
			if (Static254.aBoolean305) {
				local7 = 2048;
			}
		}
		if ((float) local7 > Static275.aFloat105) {
			Static275.aFloat105 = (float) local7;
		}
		while (Static642.aFloat230 >= 16384.0F) {
			Static642.aFloat230 -= 16384.0F;
		}
		if (Static275.aFloat105 > (float) local9) {
			Static275.aFloat105 = (float) local9;
		}
		while (Static642.aFloat230 < 0.0F) {
			Static642.aFloat230 += 16384.0F;
		}
		@Pc(57) int local57 = Static11.anInt171 >> 9;
		@Pc(61) int local61 = Static27.anInt610 >> 9;
		@Pc(72) int local72 = Static674.method8951(Static296.anInt4684, Static27.anInt610, Static11.anInt171);
		@Pc(74) int local74 = 0;
		@Pc(102) int local102;
		if (local57 > 3 && local61 > 3 && local57 < Static224.anInt3557 - 4 && Static267.anInt4309 - 4 > local61) {
			for (local102 = local57 - 4; local102 <= local57 + 4; local102++) {
				for (@Pc(108) int local108 = local61 - 4; local108 <= local61 + 4; local108++) {
					@Pc(112) int local112 = Static296.anInt4684;
					if (local112 < 3 && Static547.method7286(local102, local108)) {
						local112++;
					}
					@Pc(123) int local123 = 0;
					if (Static378.aClass100_Sub1_2.aByteArrayArrayArray15 != null && Static378.aClass100_Sub1_2.aByteArrayArrayArray15[local112] != null) {
						local123 = (Static378.aClass100_Sub1_2.aByteArrayArrayArray15[local112][local102][local108] & 0xFF) * 8 << 2;
					}
					if (Static140.aClass42Array4 != null && Static140.aClass42Array4[local112] != null) {
						@Pc(165) int local165 = local72 + local123 - Static140.aClass42Array4[local112].method7450(local108, local102);
						if (local165 > local74) {
							local74 = local165;
						}
					}
				}
			}
		}
		local102 = (local74 >> 2) * 1536;
		if (local102 > 786432) {
			local102 = 786432;
		}
		if (local102 < 262144) {
			local102 = 262144;
		}
		if (local102 > Static201.anInt3305) {
			Static201.anInt3305 += (local102 - Static201.anInt3305) / 24;
		} else if (Static201.anInt3305 > local102) {
			Static201.anInt3305 += (local102 - Static201.anInt3305) / 80;
			return;
		}
	}
}
