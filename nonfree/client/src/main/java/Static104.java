import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
	public static int anInt2841 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([III[II[Lclient!c;)V")
	public static void method1941(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10[] arg4) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(12) int local12 = arg1 + 1;
		@Pc(18) int local18 = (arg1 + arg3) / 2;
		@Pc(22) int local22 = arg3 - 1;
		@Pc(26) Class10 local26 = arg4[local18];
		arg4[local18] = arg4[arg3];
		arg4[arg3] = local26;
		while (local12 > local22) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(76) int local76;
			@Pc(58) int local58;
			do {
				local12--;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg2[local43] == 2) {
						local76 = arg4[local12].anInt371;
						local58 = local26.anInt371;
					} else if (arg2[local43] == 1) {
						local58 = local26.anInt372;
						if (local58 == -1 && arg0[local43] == 1) {
							local58 = 2001;
						}
						local76 = arg4[local12].anInt372;
						if (local76 == -1 && arg0[local43] == 1) {
							local76 = 2001;
						}
					} else if (arg2[local43] == 3) {
						local76 = arg4[local12].aBoolean27 ? 1 : 0;
						local58 = local26.aBoolean27 ? 1 : 0;
					} else {
						local58 = local26.anInt379;
						local76 = arg4[local12].anInt379;
					}
					if (local58 != local76) {
						if ((arg0[local43] != 1 || local58 >= local76) && (arg0[local43] != 0 || local76 >= local58)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local22++;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg2[local43] == 2) {
						local58 = local26.anInt371;
						local76 = arg4[local22].anInt371;
					} else if (arg2[local43] == 1) {
						local76 = arg4[local22].anInt372;
						if (local76 == -1 && arg0[local43] == 1) {
							local76 = 2001;
						}
						local58 = local26.anInt372;
						if (local58 == -1 && arg0[local43] == 1) {
							local58 = 2001;
						}
					} else if (arg2[local43] == 3) {
						local76 = arg4[local22].aBoolean27 ? 1 : 0;
						local58 = local26.aBoolean27 ? 1 : 0;
					} else {
						local76 = arg4[local22].anInt379;
						local58 = local26.anInt379;
					}
					if (local76 != local58) {
						if ((arg0[local43] != 1 || local58 <= local76) && (arg0[local43] != 0 || local58 >= local76)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local22 < local12) {
				@Pc(335) Class10 local335 = arg4[local22];
				arg4[local22] = arg4[local12];
				arg4[local12] = local335;
			}
		}
		method1941(arg0, local12, arg2, arg3, arg4);
		method1941(arg0, arg1, arg2, local12 + 1, arg4);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLclient!ef;II)Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1 method1942(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static90.method1659(arg1, arg2, arg0) ? Static95.method1770() : null;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Z)V")
	public static void method1943() {
		for (@Pc(3) int local3 = 0; local3 < Static19.anInt512; local3++) {
			@Pc(9) int local9 = Static76.anIntArray206[local3];
			@Pc(13) Class3_Sub1_Sub5_Sub1_Sub1 local13 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local9];
			@Pc(17) int local17 = Static33.aClass3_Sub11_Sub1_2.method981();
			if ((local17 & 0x10) != 0) {
				local17 += Static33.aClass3_Sub11_Sub1_2.method981() << 8;
			}
			Static121.method2168(local9, local13, local17);
		}
	}
}
