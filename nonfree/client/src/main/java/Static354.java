import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
	public static int anInt7039;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "Lclient!mi;")
	public static Class46 aClass46_22;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	public static int anInt7035 = 0;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "Lclient!fh;")
	public static final Class107 aClass107_6 = new Class107("WTWIP", 3);

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Z")
	public static boolean aBoolean508 = true;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Lclient!wq;")
	public static final Class375 aClass375_31 = new Class375(4);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFFFIFBF)F")
	public static float method6009(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg1 - arg5;
		@Pc(17) float local17 = arg6 - arg0;
		@Pc(22) float local22 = arg3 - arg2;
		@Pc(31) float local31 = 0.0F;
		@Pc(33) float local33 = 0.0F;
		@Pc(35) float local35 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(43) float local43 = local12 * local7 + arg5;
			@Pc(49) float local49 = arg0 + local7 * local17;
			@Pc(55) float local55 = arg2 + local22 * local7;
			@Pc(60) int local60 = (int) local43 >> 9;
			@Pc(65) int local65 = (int) local55 >> 9;
			if (local60 > 0 && local65 > 0 && local60 < Static47.anInt1794 && Static209.anInt4742 > local65) {
				@Pc(89) int local89 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132;
				if (local89 < 3 && (Static476.aByteArrayArrayArray5[1][local60][local65] & 0x2) != 0) {
					local89++;
				}
				@Pc(118) int local118 = Static40.aClass65Array2[local89].method7999((int) local43, (int) local55);
				if (local49 > (float) local118) {
					if (arg4 < 2) {
						return local7;
					}
					return local7 + method6009(local33, local43, local35, local55, arg4 - 1, local31, local49) * 0.1F - 0.1F;
				}
			}
			local31 = local43;
			local33 = local49;
			local7 += 0.1F;
			local35 = local55;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public static void method6011() {
		for (@Pc(10) Class2_Sub6_Sub17 local10 = (Class2_Sub6_Sub17) Static563.aClass341_65.method8524(); local10 != null; local10 = (Class2_Sub6_Sub17) Static563.aClass341_65.method8519()) {
			@Pc(15) Class3_Sub1_Sub3_Sub4 local15 = local10.aClass3_Sub1_Sub3_Sub4_1;
			if (local15.aBoolean490) {
				local10.method9253();
				local15.method5567();
			} else if (local15.anInt6535 <= Static407.anInt7704) {
				local15.method5571(Static99.anInt2781);
				if (local15.aBoolean490) {
					local10.method9253();
				} else {
					Static324.method5602(local15, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZ)V")
	public static void method6012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class41 local9 = Static571.aClass41ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static473.anInt8872 = local9.anInt1873;
			Static214.anInt4837 = local9.anInt1875;
			Class3_Sub1_Sub3_Sub1.lb = local9.anInt1879;
		}
		Static554.method8268();
	}
}
