import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	public static int anInt6778;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "Lclient!sr;")
	public static Class227 aClass227_43 = new Class227();

	@OriginalMember(owner = "client!um", name = "k", descriptor = "I")
	public static final int anInt6783 = 50;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "[I")
	public static final int[] anIntArray456 = new int[anInt6783];

	@OriginalMember(owner = "client!um", name = "m", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_240 = new Class103(51, 8);

	@OriginalMember(owner = "client!um", name = "n", descriptor = "[I")
	public static final int[] anIntArray457 = new int[anInt6783];

	@OriginalMember(owner = "client!um", name = "o", descriptor = "[I")
	public static final int[] anIntArray458 = new int[anInt6783];

	@OriginalMember(owner = "client!um", name = "p", descriptor = "[I")
	public static final int[] anIntArray459 = new int[anInt6783];

	@OriginalMember(owner = "client!um", name = "q", descriptor = "[I")
	public static final int[] anIntArray460 = new int[anInt6783];

	@OriginalMember(owner = "client!um", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[anInt6783];

	@OriginalMember(owner = "client!um", name = "s", descriptor = "[I")
	public static final int[] anIntArray461 = new int[anInt6783];

	@OriginalMember(owner = "client!um", name = "t", descriptor = "Z")
	public static boolean aBoolean744 = false;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)Z")
	public static boolean method5319(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static79.anInt1470; local1 < Static105.anInt1943; local1++) {
			@Pc(6) Class169[][] local6 = Static359.aClass169ArrayArrayArray5[local1];
			for (@Pc(9) int local9 = -Static179.anInt3132; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static321.anInt5494 + local9;
				@Pc(18) int local18 = Static321.anInt5494 - local9;
				if (local14 >= Static235.anInt4212 || local18 < Static181.anInt3166) {
					for (@Pc(27) int local27 = -Static179.anInt3132; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static64.anInt1211 + local27;
						@Pc(36) int local36 = Static64.anInt1211 - local27;
						@Pc(48) Class169 local48;
						if (local14 >= Static235.anInt4212) {
							if (local32 >= Static54.anInt974) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean549) {
									Static410.aBoolean670 = arg0;
									Static344.aClass58_1.method3489(local48);
									Static344.aClass58_1.method3496();
								}
							}
							if (local36 < Static202.anInt3561) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean549) {
									Static410.aBoolean670 = arg0;
									Static344.aClass58_1.method3489(local48);
									Static344.aClass58_1.method3496();
								}
							}
						}
						if (local18 < Static181.anInt3166) {
							if (local32 >= Static54.anInt974) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean549) {
									Static410.aBoolean670 = arg0;
									Static344.aClass58_1.method3489(local48);
									Static344.aClass58_1.method3496();
								}
							}
							if (local36 < Static202.anInt3561) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean549) {
									Static410.aBoolean670 = arg0;
									Static344.aClass58_1.method3489(local48);
									Static344.aClass58_1.method3496();
								}
							}
						}
						if (Static19.anInt400 == 0) {
							if (Static69.aBoolean148) {
								Static344.aClass58_1.method3497(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)V")
	public static void method5324(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static236.anInt4213 - Static104.anInt1920;
		if (local8 >= 100) {
			Static333.anInt5693 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static262.aFloat62;
		if (Static330.anInt5626 >> 8 > local19) {
			local19 = Static330.anInt5626 >> 8;
		}
		if (Static34.aBooleanArray2[4] && Static244.anIntArray292[4] + 128 > local19) {
			local19 = Static244.anIntArray292[4] + 128;
		}
		@Pc(53) int local53 = (int) Static98.aFloat20 + Static368.anInt6211 & 0x3FFF;
		Static80.method1317(local19, Static140.anInt2485, Static335.method4499(Static265.anInt4807, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514) - 50, local53, arg0, Static52.anInt896, (local19 >> 3) * 3 + 600 << 0);
		@Pc(98) float local98 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static391.anInt6529 = (int) ((float) (Static391.anInt6529 - Static350.anInt6003) * local98 + (float) Static350.anInt6003);
		Static213.anInt258 = (int) ((float) (Static213.anInt258 - Static20.anInt4875) * local98 + (float) Static20.anInt4875);
		Static340.anInt5790 = (int) (local98 * (float) (Static340.anInt5790 - Static83.anInt1573) + (float) Static83.anInt1573);
		Static360.anInt6145 = (int) ((float) Static459.anInt7339 + (float) (Static360.anInt6145 - Static459.anInt7339) * local98);
		@Pc(158) int local158 = Static106.anInt2033 - Static338.anInt5786;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static106.anInt2033 = (int) (local98 * (float) local158 + (float) Static338.anInt5786);
		Static106.anInt2033 &= 0x3FFF;
	}
}
