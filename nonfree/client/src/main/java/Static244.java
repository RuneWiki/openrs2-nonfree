import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "[I")
	public static final int[] anIntArray295 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Z")
	public static boolean aBoolean360 = true;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Lclient!va;")
	public static Class23_Sub2_Sub2 method3912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass23_Sub2_Sub2_1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!fca;I)Lclient!dr;")
	public static Class74_Sub2 method3913(@OriginalArg(0) Class3_Sub17 arg0) {
		return new Class74_Sub2(arg0.method4869(), arg0.method4869(), arg0.method4869(), arg0.method4869(), arg0.method4862(), arg0.method4862(), arg0.method4888());
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIBI)Ljava/lang/String;")
	public static String method3914(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0 || arg1 < 0) {
			return Integer.toString(arg1, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(38) int local38 = arg1 / 10;
		while (local38 != 0) {
			local38 /= 10;
			local34++;
		}
		@Pc(50) char[] local50 = new char[local34];
		local50[0] = '+';
		for (@Pc(58) int local58 = local34 - 1; local58 > 0; local58--) {
			@Pc(62) int local62 = arg1;
			arg1 /= 10;
			@Pc(72) int local72 = local62 - arg1 * 10;
			if (local72 >= 10) {
				local50[local58] = (char) (local72 + 87);
			} else {
				local50[local58] = (char) (local72 + 48);
			}
		}
		return new String(local50);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLclient!kka;)V")
	public static void method3915(@OriginalArg(1) Class3_Sub17_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static519.anInt8681; local3++) {
			@Pc(9) int local9 = Static294.anIntArray233[local3];
			@Pc(13) Class23_Sub2_Sub1_Sub2_Sub1 local13 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local9];
			@Pc(17) int local17 = arg0.method4888();
			if ((local17 & 0x80) != 0) {
				local17 += arg0.method4888() << 8;
			}
			if ((local17 & 0x4000) != 0) {
				local17 += arg0.method4888() << 16;
			}
			Static316.method4975(arg0, local9, local17, local13);
		}
	}
}
