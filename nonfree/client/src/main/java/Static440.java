import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V")
	public static void method5627(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static183.anInt3293 != -1) {
				Static348.method5606(Static183.anInt3293);
			}
			for (@Pc(18) Class7_Sub44 local18 = (Class7_Sub44) Static23.aClass164_3.method3514(); local18 != null; local18 = (Class7_Sub44) Static23.aClass164_3.method3519()) {
				if (!local18.method5801()) {
					local18 = (Class7_Sub44) Static23.aClass164_3.method3514();
					if (local18 == null) {
						break;
					}
				}
				Static255.method3394(true, local18, false);
			}
			Static183.anInt3293 = -1;
			Static23.aClass164_3 = new Class164(8);
			Static64.method946();
			Static183.anInt3293 = Static100.anInt2033;
			Static301.method4014(false);
			Static193.method2788();
			Static159.method2348(Static183.anInt3293);
		}
		Static385.aBoolean406 = false;
		Static308.aString53 = "";
		Static199.aString38 = "";
		Static272.method3648();
		Static194.anInt3446 = -1;
		Static109.method1890(Static313.anInt5179);
		Static104.aClass26_Sub2_Sub4_Sub2_2 = new Class26_Sub2_Sub4_Sub2();
		Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray603[0] = Static333.anInt3375 / 2;
		Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 = Static333.anInt3375 * 128 / 2;
		Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 = Static102.anInt2086 * 128 / 2;
		Static181.anInt3254 = 0;
		Static46.anInt737 = 0;
		Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray604[0] = Static102.anInt2086 / 2;
		if (Static9.anInt60 == 2) {
			Static181.anInt3254 = Static63.anInt1215 << 7;
			Static46.anInt737 = Static404.anInt7485 << 7;
		} else {
			Static376.method4835();
		}
		Static379.method4655();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([[BLclient!cr;B)V")
	public static void method5628(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class46_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(44) int local44;
		for (@Pc(25) int local25 = 0; local25 < local15; local25++) {
			@Pc(31) byte[] local31 = arg0[local25];
			if (local31 != null) {
				@Pc(38) Class7_Sub14 local38 = new Class7_Sub14(local31);
				local44 = Static331.anIntArray494[local25] >> 8;
				@Pc(50) int local50 = Static331.anIntArray494[local25] & 0xFF;
				@Pc(56) int local56 = local44 * 64 - Static359.anInt5713;
				@Pc(62) int local62 = local50 * 64 - Static314.anInt5181;
				Static330.method4331();
				arg1.method796(local56, Static179.aClass70Array3, Static314.anInt5181, Static359.anInt5713, local38, local62);
				arg1.method816(local56, Static269.aClass51_9, local12, local62, local38);
				if (!arg1.aBoolean64 && Static213.anInt3813 / 8 == local44 && local50 == Static323.anInt5346 / 8 && local12[0] != -1) {
					Static37.aClass196_1 = Static439.aClass255_1.method5273(local12[1], local12[2], local12[0], local12[3], Static411.aClass217_1);
					Static269.anInt4579 = local12[4];
				}
			}
		}
		for (@Pc(134) int local134 = 0; local134 < local15; local134++) {
			@Pc(146) int local146 = (Static331.anIntArray494[local134] >> 8) * 64 - Static359.anInt5713;
			local44 = (Static331.anIntArray494[local134] & 0xFF) * 64 - Static314.anInt5181;
			@Pc(161) byte[] local161 = arg0[local134];
			if (local161 == null && Static323.anInt5346 < 800) {
				Static330.method4331();
				arg1.method794(local44, local146);
			}
		}
	}
}
