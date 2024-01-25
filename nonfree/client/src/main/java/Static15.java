import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "vb", descriptor = "[[[Lclient!jd;")
	public static Class164[][][] aClass164ArrayArrayArray5;

	@OriginalMember(owner = "client!ai", name = "Sb", descriptor = "I")
	public static int anInt8490;

	@OriginalMember(owner = "client!ai", name = "tc", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_129 = new Class218(60, -1);

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(B)V")
	public static void method7457() {
		for (@Pc(15) Class3_Sub11_Sub13 local15 = (Class3_Sub11_Sub13) Static540.aClass338_202.method8177(); local15 != null; local15 = (Class3_Sub11_Sub13) Static540.aClass338_202.method8168()) {
			@Pc(20) Class28_Sub1_Sub1_Sub4 local20 = local15.aClass28_Sub1_Sub1_Sub4_1;
			if (local20.aBoolean558) {
				local15.method9380();
				local20.method6629();
			} else if (local20.anInt7505 <= Static588.anInt9467) {
				local20.method6630(Static619.anInt10674);
				if (local20.aBoolean558) {
					local15.method9380();
				} else {
					Static436.method6231(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([[BLclient!dga;B)V")
	public static void method7497(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class73_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt1875; local14++) {
			Static72.method1380();
			for (local20 = 0; local20 < Static158.anInt927 >> 3; local20++) {
				for (local24 = 0; local24 < Static515.anInt8292 >> 3; local24++) {
					local34 = Static637.anIntArrayArrayArray20[local14][local20][local24];
					if (local34 != -1) {
						local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean147 || local44 == 0) {
							@Pc(58) int local58 = local34 >> 1 & 0x3;
							@Pc(64) int local64 = local34 >> 14 & 0x3FF;
							@Pc(70) int local70 = local34 >> 3 & 0x7FF;
							@Pc(80) int local80 = (local64 / 8 << 8) + local70 / 8;
							for (@Pc(82) int local82 = 0; local82 < Static77.anIntArray125.length; local82++) {
								if (Static77.anIntArray125[local82] == local80 && arg0[local82] != null) {
									@Pc(104) Class3_Sub25 local104 = new Class3_Sub25(arg0[local82]);
									arg1.method1806(local58, local20 * 8, local24 * 8, Static1.aClass252Array5, local44, local14, local64, local104, local70);
									arg1.method1816(local24 * 8, local14, local12[0] == -1 ? local12 : null, local44, local20 * 8, local104, local64, local58, local70, Static674.aClass13_22);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg1.anInt1875; local20++) {
			Static72.method1380();
			for (local24 = 0; local24 < Static158.anInt927 >> 3; local24++) {
				for (local34 = 0; local34 < Static515.anInt8292 >> 3; local34++) {
					local44 = Static637.anIntArrayArrayArray20[local20][local24][local34];
					if (local44 == -1) {
						arg1.method1802(local34 * 8, 8, local20, local24 * 8, 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static536.aClass206_5 = Static559.aClass340_1.method8283(local12[2], Static38.aClass75_1, local12[3], local12[1], local12[0]);
			Static390.anInt10741 = local12[4];
		}
	}
}
