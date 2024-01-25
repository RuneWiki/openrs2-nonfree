import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!el;")
	public static final Class109 aClass109_197 = new Class109(81, -2);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method8127() {
		if (Static457.aClass57_11.method7726()) {
			Static457.aClass57_11.method7703(Static24.aCanvas1);
			Static552.method7995();
			if (Static40.aBoolean61) {
				Static45.method8838(Static24.aCanvas1);
			} else {
				@Pc(34) Dimension local34 = Static24.aCanvas1.getSize();
				Static457.aClass57_11.method7727(Static24.aCanvas1, local34.width, local34.height);
			}
			Static457.aClass57_11.method7669(Static24.aCanvas1);
		} else {
			Static565.method8890(Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153(), false);
		}
		Static437.method6493();
		Static554.aBoolean714 = true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!nw;[I[I[I)V")
	public static void method8128(@OriginalArg(1) Class8_Sub1_Sub3_Sub2_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(15) int local15 = arg3[local7];
			@Pc(19) int local19 = arg1[local7];
			@Pc(23) int local23 = arg2[local7];
			for (@Pc(25) int local25 = 0; local19 != 0 && arg0.aClass10Array3.length > local25; local25++) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg0.aClass10Array3[local25] = null;
					} else {
						@Pc(47) Class165 local47 = Static158.aClass317_1.method7882(local15, 100);
						@Pc(50) int local50 = local47.anInt3919;
						@Pc(55) Class10 local55 = arg0.aClass10Array3[local25];
						if (local55 != null) {
							if (local15 == local55.anInt246) {
								if (local50 == 0) {
									local55 = arg0.aClass10Array3[local25] = null;
								} else if (local50 == 1) {
									local55.anInt240 = 0;
									local55.anInt243 = 1;
									local55.anInt244 = 0;
									local55.anInt242 = 0;
									local55.anInt245 = local23;
									if (!arg0.aBoolean540) {
										Static268.method4004(local47, arg0, 0);
									}
								} else if (local50 == 2) {
									local55.anInt242 = 0;
								}
							} else if (local47.anInt3910 >= Static158.aClass317_1.method7882(local55.anInt246, 100).anInt3910) {
								local55 = arg0.aClass10Array3[local25] = null;
							}
						}
						if (local55 == null) {
							local55 = arg0.aClass10Array3[local25] = new Class10();
							local55.anInt242 = 0;
							local55.anInt246 = local15;
							local55.anInt240 = 0;
							local55.anInt244 = 0;
							local55.anInt243 = 1;
							local55.anInt245 = local23;
							if (!arg0.aBoolean540) {
								Static268.method4004(local47, arg0, 0);
							}
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}
}
