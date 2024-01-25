import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!md;I)V")
	public static void method4392(@OriginalArg(0) Class6_Sub1_Sub1 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static438.anInt7768; local1++) {
			@Pc(9) int local9 = Static71.anIntArray110[local1];
			@Pc(13) Class3_Sub2_Sub1_Sub2 local13 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local9];
			@Pc(17) int local17 = arg0.method6433();
			if ((local17 & 0x80) != 0) {
				local17 += arg0.method6433() << 8;
			}
			if ((local17 & 0x400) != 0) {
				local17 += arg0.method6433() << 16;
			}
			Static253.method4334(local13, arg0, local9, local17);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)Z")
	public static boolean method4393(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static435.anInt7711; local1 < Static295.anInt5507; local1++) {
			@Pc(6) Class101[][] local6 = Static409.aClass101ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static195.anInt7212; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static6.anInt253 + local9;
				@Pc(18) int local18 = Static6.anInt253 - local9;
				if (local14 >= Static211.anInt3900 || local18 < Static163.anInt3256) {
					for (@Pc(27) int local27 = -Static195.anInt7212; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static370.anInt6673 + local27;
						@Pc(36) int local36 = Static370.anInt6673 - local27;
						@Pc(48) Class101 local48;
						if (local14 >= Static211.anInt3900) {
							if (local32 >= Static238.anInt4363) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean193) {
									Static409.aBoolean466 = arg0;
									Static401.aClass120_1.method6078(local48);
									Static401.aClass120_1.method6079();
								}
							}
							if (local36 < Static103.anInt2239) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean193) {
									Static409.aBoolean466 = arg0;
									Static401.aClass120_1.method6078(local48);
									Static401.aClass120_1.method6079();
								}
							}
						}
						if (local18 < Static163.anInt3256) {
							if (local32 >= Static238.anInt4363) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean193) {
									Static409.aBoolean466 = arg0;
									Static401.aClass120_1.method6078(local48);
									Static401.aClass120_1.method6079();
								}
							}
							if (local36 < Static103.anInt2239) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean193) {
									Static409.aBoolean466 = arg0;
									Static401.aClass120_1.method6078(local48);
									Static401.aClass120_1.method6079();
								}
							}
						}
						if (Static110.anInt6980 == 0) {
							if (Static285.aBoolean434) {
								Static401.aClass120_1.method6077(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method4395() {
		for (@Pc(7) int local7 = 0; local7 < Static203.aByteArrayArrayArray11.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static203.aByteArrayArrayArray11[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static203.aByteArrayArrayArray11[0][0].length; local15++) {
					Static203.aByteArrayArrayArray11[local7][local11][local15] = 0;
				}
			}
		}
	}
}
