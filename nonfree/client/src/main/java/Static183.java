import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gr", name = "A", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "Lclient!hb;")
	public static Class122 aClass122_3;

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	public static int anInt3514;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public static void method3139() {
		for (@Pc(10) Class3_Sub43 local10 = (Class3_Sub43) Static133.aClass112_20.method3088(); local10 != null; local10 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
			if (Static554.method7332(local10.anInt7753)) {
				Static316.method4647(local10);
			}
		}
		if (Static571.anInt9281 == 1) {
			Static242.method3771();
			return;
		}
		Static542.method7209(Static520.anInt9775, Static538.anInt8629, Static211.anInt3825, Static122.anInt2800);
		@Pc(46) int local46 = Static75.aClass134_7.method3348(Static544.aClass343_28.method7222(Static256.anInt4535));
		for (@Pc(51) Class3_Sub43 local51 = (Class3_Sub43) Static133.aClass112_20.method3088(); local51 != null; local51 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
			@Pc(57) int local57 = Static58.method1196(local51);
			if (local57 > local46) {
				local46 = local57;
			}
		}
		Static122.anInt2800 = (Static270.aBoolean347 ? 26 : 22) + Static571.anInt9281 * 16;
		Static520.anInt9775 = local46 + 8;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!sf;I)Z")
	public static boolean method3141(@OriginalArg(1) Class308 arg0, @OriginalArg(2) int arg1) {
		Static77.aClass11_1.method7216(arg0.anIntArray506[arg1], arg0.anIntArray505[arg1], arg0.anIntArray504[arg1], Static398.anIntArray424);
		@Pc(22) int local22 = Static398.anIntArray424[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray127[arg1] = (short) (Static398.anIntArray424[0] * Static505.anInt8213 / local22 + Static216.anInt3880);
			arg0.aShortArray128[arg1] = (short) (Static326.anInt5525 * Static398.anIntArray424[1] / local22 + Static469.anInt4271);
			arg0.aShortArray126[arg1] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[BIIIIII[B)V")
	public static void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg4++;
				arg7[local26] += arg1[arg3++];
				@Pc(38) int local38 = arg4++;
				arg7[local38] += arg1[arg3++];
				@Pc(50) int local50 = arg4++;
				arg7[local50] += arg1[arg3++];
				@Pc(62) int local62 = arg4++;
				arg7[local62] += arg1[arg3++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg4++;
				arg7[local26] += arg1[arg3++];
			}
			arg3 += arg2;
			arg4 += arg5;
		}
	}
}
