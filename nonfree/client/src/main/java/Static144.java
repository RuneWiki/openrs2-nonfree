import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "Lclient!am;")
	public static Class11 aClass11_68;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
	public static int anInt3226 = 127;

	@OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
	public static int anInt3232 = -1;

	@OriginalMember(owner = "client!ji", name = "Z", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(B)V")
	public static void method2826() {
		Static158.aClass72ArrayArray1 = new Class72[Static108.aClass11_48.method277()][];
		Static115.aBooleanArray17 = new boolean[Static108.aClass11_48.method277()];
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	public static void method2827() {
		Static157.anInt3507 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static281.anInt5702; local3++) {
			@Pc(8) Class86 local8 = Static183.aClass86Array2[local3];
			@Pc(12) int local12;
			if (Static192.anIntArray354 != null) {
				for (local12 = 0; local12 < Static192.anIntArray354.length; local12++) {
					if (Static192.anIntArray354[local12] != -1000000 && (local8.anInt2419 <= Static192.anIntArray354[local12] || local8.anInt2425 <= Static192.anIntArray354[local12]) && (local8.anInt2413 <= Static254.anIntArray432[local12] || local8.anInt2426 <= Static254.anIntArray432[local12]) && (local8.anInt2413 >= Static219.anIntArray378[local12] || local8.anInt2426 >= Static219.anIntArray378[local12]) && (local8.anInt2412 <= Static173.anIntArray333[local12] || local8.anInt2417 <= Static173.anIntArray333[local12]) && (local8.anInt2412 >= Static272.anIntArray452[local12] || local8.anInt2417 >= Static272.anIntArray452[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt2415 == 1) {
				local12 = local8.anInt2423 + Static226.anInt4752 - Static307.anInt3770;
				if (local12 >= 0 && local12 <= Static226.anInt4752 + Static226.anInt4752) {
					local110 = local8.anInt2428 + Static226.anInt4752 - Static178.anInt6542;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt2429 + Static226.anInt4752 - Static178.anInt6542;
					if (local121 > Static226.anInt4752 + Static226.anInt4752) {
						local121 = Static226.anInt4752 + Static226.anInt4752;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static248.aBooleanArrayArray4[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static269.anInt5510 - local8.anInt2413;
						if (local153 > 32) {
							local8.anInt2431 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt2431 = 2;
							local153 = -local153;
						}
						local8.anInt2427 = (local8.anInt2412 - Static241.anInt5032 << 8) / local153;
						local8.anInt2424 = (local8.anInt2417 - Static241.anInt5032 << 8) / local153;
						local8.anInt2420 = (local8.anInt2419 - Static224.anInt4687 << 8) / local153;
						local8.anInt2414 = (local8.anInt2425 - Static224.anInt4687 << 8) / local153;
						Static18.aClass86Array1[Static157.anInt3507++] = local8;
					}
				}
			} else if (local8.anInt2415 == 2) {
				local12 = local8.anInt2428 + Static226.anInt4752 - Static178.anInt6542;
				if (local12 >= 0 && local12 <= Static226.anInt4752 + Static226.anInt4752) {
					local110 = local8.anInt2423 + Static226.anInt4752 - Static307.anInt3770;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt2422 + Static226.anInt4752 - Static307.anInt3770;
					if (local121 > Static226.anInt4752 + Static226.anInt4752) {
						local121 = Static226.anInt4752 + Static226.anInt4752;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static248.aBooleanArrayArray4[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static241.anInt5032 - local8.anInt2412;
						if (local153 > 32) {
							local8.anInt2431 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt2431 = 4;
							local153 = -local153;
						}
						local8.anInt2421 = (local8.anInt2413 - Static269.anInt5510 << 8) / local153;
						local8.anInt2430 = (local8.anInt2426 - Static269.anInt5510 << 8) / local153;
						local8.anInt2420 = (local8.anInt2419 - Static224.anInt4687 << 8) / local153;
						local8.anInt2414 = (local8.anInt2425 - Static224.anInt4687 << 8) / local153;
						Static18.aClass86Array1[Static157.anInt3507++] = local8;
					}
				}
			} else if (local8.anInt2415 == 4) {
				local12 = local8.anInt2419 - Static224.anInt4687;
				if (local12 > 128) {
					local110 = local8.anInt2428 + Static226.anInt4752 - Static178.anInt6542;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt2429 + Static226.anInt4752 - Static178.anInt6542;
					if (local121 > Static226.anInt4752 + Static226.anInt4752) {
						local121 = Static226.anInt4752 + Static226.anInt4752;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt2423 + Static226.anInt4752 - Static307.anInt3770;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt2422 + Static226.anInt4752 - Static307.anInt3770;
						if (local153 > Static226.anInt4752 + Static226.anInt4752) {
							local153 = Static226.anInt4752 + Static226.anInt4752;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static248.aBooleanArrayArray4[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt2431 = 5;
							local8.anInt2421 = (local8.anInt2413 - Static269.anInt5510 << 8) / local12;
							local8.anInt2430 = (local8.anInt2426 - Static269.anInt5510 << 8) / local12;
							local8.anInt2427 = (local8.anInt2412 - Static241.anInt5032 << 8) / local12;
							local8.anInt2424 = (local8.anInt2417 - Static241.anInt5032 << 8) / local12;
							Static18.aClass86Array1[Static157.anInt3507++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!or;III)V")
	public static void method2828(@OriginalArg(0) Class151 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static148.anIntArrayArrayArray13[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt6714 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass4_Sub12_Sub1Array3[arg0.anInt6714++] = Static126.aClass4_Sub12_Sub1Array1[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt6714; local19 < 4; local19++) {
			arg0.aClass4_Sub12_Sub1Array3[local19] = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!ja;Z)V")
	public static void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		Static197.aClass100ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V")
	public static void method2831() {
		Static37.aClass154_11.method4220(50);
		Static77.aClass154_24.method4220(50);
		Static132.aClass154_43.method4220(50);
		Static257.aClass154_82.method4220(50);
		Static169.aClass154_60.method4220(50);
	}
}
