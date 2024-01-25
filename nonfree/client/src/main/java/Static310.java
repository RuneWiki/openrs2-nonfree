import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_81 = new Class98(47, 4);

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "Lclient!hs;")
	public static final Class136 aClass136_85 = new Class136(5, 1);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIBLclient!oa;)V")
	public static void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class90 arg4) {
		arg4.ca(arg2, arg1, arg2 + arg0, arg3 + arg1);
		arg4.method7482(arg1, -16777216, arg0, arg3, arg2);
		if (Static91.anInt1503 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static490.anInt1922 / (float) Static490.anInt1919;
		@Pc(36) int local36 = arg0;
		@Pc(38) int local38 = arg3;
		if (local34 < 1.0F) {
			local38 = (int) ((float) arg0 * local34);
		} else {
			local36 = (int) ((float) arg3 / local34);
		}
		@Pc(65) int local65 = arg2 + (arg0 - local36) / 2;
		@Pc(74) int local74 = arg1 + (arg3 - local38) / 2;
		if (Static469.aClass71_50 == null || arg0 != Static469.aClass71_50.QA() || Static469.aClass71_50.b() != arg3) {
			Static490.method1735(Static490.anInt1918, Static490.anInt1922 + Static490.anInt1917, Static490.anInt1919 + Static490.anInt1918, Static490.anInt1917, local65, local74, local36 + local65, local74 - -local38);
			Static490.method1740(arg4);
			Static469.aClass71_50 = arg4.method7453(local65, local74, local36, local38, false);
		}
		Static469.aClass71_50.method7775(local65, local74);
		@Pc(126) int local126 = local36 * Static501.anInt8701 / Static490.anInt1919;
		@Pc(140) int local140 = local38 * Static426.anInt7573 / Static490.anInt1922;
		@Pc(149) int local149 = local65 + Static192.anInt3742 * local36 / Static490.anInt1919;
		@Pc(163) int local163 = local74 + local38 - local140 - Static577.anInt9918 * local38 / Static490.anInt1922;
		@Pc(165) int local165 = -1996554240;
		if (Static14.aClass68_6 == Static172.aClass68_4) {
			local165 = -1996488705;
		}
		arg4.C(local149, local163, local126, local140, local165, 1);
		arg4.method7494(local149, local163, local126, local140, local165, 0);
		if (Static49.anInt883 <= 0) {
			return;
		}
		@Pc(197) int local197;
		if (Static190.anInt7946 <= 50) {
			local197 = Static190.anInt7946 * 5;
		} else {
			local197 = 500 - Static190.anInt7946 * 5;
		}
		for (@Pc(211) Class6_Sub22 local211 = (Class6_Sub22) Static490.aClass298_38.method6809(); local211 != null; local211 = (Class6_Sub22) Static490.aClass298_38.method6821()) {
			@Pc(219) Class336 local219 = Static490.aClass320_2.method7209(local211.anInt4399);
			if (Static298.method4518(local219)) {
				@Pc(236) int local236;
				@Pc(248) int local248;
				if (Static50.anInt8645 == local211.anInt4399) {
					local236 = local36 * local211.anInt4395 / Static490.anInt1919 + local65;
					local248 = local74 + local38 * (Static490.anInt1922 - local211.anInt4398) / Static490.anInt1922;
					arg4.method7482(local248 - 2, local197 << 24 | 0xFFFF00, 4, 4, local236 - 2);
				} else if (Static119.anInt7220 != -1 && Static119.anInt7220 == local219.anInt9756) {
					local236 = local65 + local36 * local211.anInt4395 / Static490.anInt1919;
					local248 = local74 + (Static490.anInt1922 - local211.anInt4398) * local38 / Static490.anInt1922;
					arg4.method7482(local248 - 2, local197 << 24 | 0xFFFF00, 4, 4, local236 - 2);
				}
			}
		}
	}
}
