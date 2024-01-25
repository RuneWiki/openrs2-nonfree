import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!mja", name = "g", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_82 = new Class241(81, -1);

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIB)V")
	public static void method5665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 17);
		local9.method2040();
		local9.anInt2111 = arg1;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lclient!fl;B[[B)V")
	public static void method5666(@OriginalArg(0) Class116_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3486; local16++) {
			Static302.method4850();
			for (@Pc(24) int local24 = 0; local24 < Static29.anInt380 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static327.anInt5650 >> 3; local28++) {
					@Pc(38) int local38 = Static146.anIntArrayArrayArray8[local16][local24][local28];
					if (local38 != -1) {
						@Pc(47) int local47 = local38 >> 24 & 0x3;
						if (!arg0.aBoolean278 || local47 == 0) {
							@Pc(63) int local63 = local38 >> 1 & 0x3;
							@Pc(69) int local69 = local38 >> 14 & 0x3FF;
							@Pc(75) int local75 = local38 >> 3 & 0x7FF;
							@Pc(85) int local85 = local75 / 8 + (local69 / 8 << 8);
							for (@Pc(87) int local87 = 0; local87 < Static617.anIntArray642.length; local87++) {
								if (local85 == Static617.anIntArray642[local87] && arg1[local87] != null) {
									arg0.method3298(Static669.aClass356Array1, (local69 & 0x7) * 8, Static202.aClass75_5, local63, local28 * 8, local24 * 8, (local75 & 0x7) * 8, local16, arg1[local87], local47);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lclient!ld;I)V")
	public static void method5668(@OriginalArg(0) Class60_Sub6 arg0) {
		arg0.aClass60_Sub1_Sub1_Sub3_1 = null;
		if (Static411.anInt7156 < 20) {
			Static527.aClass385_8.method8779(arg0);
			Static411.anInt7156++;
		}
	}
}
