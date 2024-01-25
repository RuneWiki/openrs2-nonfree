import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)I")
	public static int method3272(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(25) int local25 = (arg0 & 0x7F) * 96 >> 7;
		if (local25 < 2) {
			local25 = 2;
		} else if (local25 > 126) {
			local25 = 126;
		}
		return local25 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!np;)Lclient!qt;")
	public static Class282 method3273(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(15) Class282 local15 = new Class282();
		local15.anInt7422 = arg0.method5198();
		local15.aClass3_Sub7_Sub10_1 = Static111.aClass149_11.method3568(local15.anInt7422);
		return local15;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method3274() {
		Static160.aClass354_12.method7687();
		Static522.aClass354_40.method7687();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method3275() {
		if (Static52.anIntArray41 != null && Static411.anIntArray438 != null) {
			return;
		}
		Static52.anIntArray41 = new int[256];
		Static411.anIntArray438 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static52.anIntArray41[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static411.anIntArray438[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
	public static void method3276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg3;
		@Pc(10) int local10 = -arg3;
		@Pc(12) int local12 = -1;
		@Pc(20) int local20 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3 + arg1);
		@Pc(29) int local29 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - arg3);
		Static583.method7816(Static158.anIntArrayArray66[arg0], arg2, local29, local20);
		while (local5 < local7) {
			local12 += 2;
			local10 += local12;
			@Pc(60) int local60;
			@Pc(65) int local65;
			@Pc(83) int local83;
			@Pc(92) int local92;
			if (local10 > 0) {
				local7--;
				local10 -= local7 << 1;
				local60 = arg0 - local7;
				local65 = arg0 + local7;
				if (local65 >= Static395.anInt6904 && Static561.anInt2703 >= local60) {
					local83 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, local5 + arg1);
					local92 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - local5);
					if (local65 <= Static561.anInt2703) {
						Static583.method7816(Static158.anIntArrayArray66[local65], arg2, local92, local83);
					}
					if (local60 >= Static395.anInt6904) {
						Static583.method7816(Static158.anIntArrayArray66[local60], arg2, local92, local83);
					}
				}
			}
			local5++;
			local60 = arg0 - local5;
			local65 = local5 + arg0;
			if (local65 >= Static395.anInt6904 && Static561.anInt2703 >= local60) {
				local83 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 + local7);
				local92 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg1 - local7);
				if (local65 <= Static561.anInt2703) {
					Static583.method7816(Static158.anIntArrayArray66[local65], arg2, local92, local83);
				}
				if (local60 >= Static395.anInt6904) {
					Static583.method7816(Static158.anIntArrayArray66[local60], arg2, local92, local83);
				}
			}
		}
	}
}
