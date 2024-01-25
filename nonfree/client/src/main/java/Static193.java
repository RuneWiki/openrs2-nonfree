import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!o;")
	public static Class41 aClass41_8;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method2764(@OriginalArg(1) Class2_Sub35 arg0) {
		if (!Static45.aBoolean34) {
			arg0.method6260();
			Static377.anInt6585--;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public static void method2765() {
		if (Static234.aFloat30 < 1024.0F) {
			Static234.aFloat30 = 1024.0F;
		}
		while (Static37.aFloat9 >= 16384.0F) {
			Static37.aFloat9 -= 16384.0F;
		}
		if (Static234.aFloat30 > 3072.0F) {
			Static234.aFloat30 = 3072.0F;
		}
		while (Static37.aFloat9 < 0.0F) {
			Static37.aFloat9 += 16384.0F;
		}
		@Pc(41) int local41 = Static82.anInt3899 >> 7;
		@Pc(45) int local45 = Static184.anInt3246 >> 7;
		@Pc(51) int local51 = Static365.method3535(Static204.anInt3498, Static82.anInt3899, Static184.anInt3246);
		@Pc(53) int local53 = 0;
		@Pc(77) int local77;
		if (local41 > 3 && local45 > 3 && Static234.anInt3949 - 4 > local41 && local45 < Static371.anInt6492 - 4) {
			for (local77 = local41 - 4; local77 <= local41 + 4; local77++) {
				for (@Pc(83) int local83 = local45 - 4; local83 <= local45 + 4; local83++) {
					@Pc(87) int local87 = Static204.anInt3498;
					if (local87 < 3 && Static369.method5157(local83, local77)) {
						local87++;
					}
					@Pc(100) int local100 = 0;
					if (Static357.aClass107_Sub1_4.aByteArrayArrayArray11 != null && Static357.aClass107_Sub1_4.aByteArrayArrayArray11[local87] != null) {
						local100 = (Static357.aClass107_Sub1_4.aByteArrayArrayArray11[local87][local77][local83] & 0xFF) * 8;
					}
					@Pc(132) int local132 = local100 + local51 - Static241.aClass22Array3[local87].ua(local77, local83);
					if (local132 > local53) {
						local53 = local132;
					}
				}
			}
		}
		local77 = (local53 >> 0) * 1536;
		if (local77 > 786432) {
			local77 = 786432;
		}
		if (local77 < 262144) {
			local77 = 262144;
		}
		if (local77 > Static415.anInt7125) {
			Static415.anInt7125 += (local77 - Static415.anInt7125) / 24;
		} else if (local77 < Static415.anInt7125) {
			Static415.anInt7125 += (local77 - Static415.anInt7125) / 80;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)V")
	public static void method2767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static201.aClass200_4 == Static10.aClass200_1) {
			if (Static391.method5421(arg0, 0, 1, arg1, -2, 0, 1, false)) {
				return;
			}
			Static391.method5421(arg0, 0, 1, arg1, -3, 0, 1, false);
		} else if (Static391.method5421(arg0, 0, 1, arg1, -3, 0, 1, false)) {
			return;
		} else {
			Static391.method5421(arg0, 0, 1, arg1, -2, 0, 1, false);
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public static void method2769() {
		if (Static55.anIntArray70 != null && Static314.anIntArray477 != null) {
			return;
		}
		Static314.anIntArray477 = new int[256];
		Static55.anIntArray70 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static55.anIntArray70[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static314.anIntArray477[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
