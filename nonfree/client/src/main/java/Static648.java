import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Z")
	public static boolean method9079(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(CLjava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method9081(@OriginalArg(1) String arg0, @OriginalArg(3) String arg1) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) int local9 = arg1.length();
		@Pc(11) int local11 = local6;
		@Pc(15) int local15 = local9 - 1;
		if (local15 != 0) {
			@Pc(19) int local19 = 0;
			while (true) {
				local19 = arg0.indexOf(13, local19);
				if (local19 < 0) {
					break;
				}
				local11 += local15;
				local19++;
			}
		}
		@Pc(37) StringBuffer local37 = new StringBuffer(local11);
		@Pc(39) int local39 = 0;
		while (true) {
			@Pc(44) int local44 = arg0.indexOf(13, local39);
			if (local44 < 0) {
				local37.append(arg0.substring(local39));
				return local37.toString();
			}
			local37.append(arg0.substring(local39, local44));
			local37.append(arg1);
			local39 = local44 + 1;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILclient!ha;III)V")
	public static void method9084(@OriginalArg(0) int arg0, @OriginalArg(2) Class144 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.KA(arg3, arg0, arg3 + arg4, arg0 - -arg2);
		arg1.method6887(arg0, -16777216, arg4, arg2, arg3);
		if (Static120.anInt1937 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static224.anInt1298 / (float) Static224.anInt1295;
		@Pc(38) int local38 = arg4;
		@Pc(40) int local40 = arg2;
		if (local36 < 1.0F) {
			local40 = (int) ((float) arg4 * local36);
		} else {
			local38 = (int) ((float) arg2 / local36);
		}
		@Pc(67) int local67 = arg3 + (arg4 - local38) / 2;
		@Pc(76) int local76 = arg0 + (arg2 - local40) / 2;
		if (Static527.aClass45_22 == null || arg4 != Static527.aClass45_22.method7510() || arg2 != Static527.aClass45_22.method7501()) {
			Static224.method1302(Static224.anInt1291, Static224.anInt1298 + Static224.anInt1292, Static224.anInt1295 + Static224.anInt1291, Static224.anInt1292, local67, local76, local38 + local67, local76 + local40);
			Static224.method1308(arg1);
			Static527.aClass45_22 = arg1.method6938(local67, local76, local38, local40, false);
		}
		Static527.aClass45_22.method7488(local67, local76);
		@Pc(129) int local129 = Static661.anInt10786 * local38 / Static224.anInt1295;
		@Pc(135) int local135 = local40 * Static176.anInt2886 / Static224.anInt1298;
		@Pc(143) int local143 = local67 + Static674.anInt11001 * local38 / Static224.anInt1295;
		@Pc(168) int local168 = local76 + local40 - local135 - local40 * Static297.anInt5327 / Static224.anInt1298;
		@Pc(170) int local170 = -1996554240;
		if (Static480.aClass80_10 == Static161.aClass80_6) {
			local170 = -1996488705;
		}
		arg1.aa(local143, local168, local129, local135, local170, 1);
		arg1.method6923(local143, local168, local129, local135, local170, 0);
		if (Static70.anInt1087 <= 0) {
			return;
		}
		@Pc(205) int local205;
		if (Static349.anInt5983 > 50) {
			local205 = 500 - Static349.anInt5983 * 5;
		} else {
			local205 = Static349.anInt5983 * 5;
		}
		for (@Pc(216) Class14_Sub39 local216 = (Class14_Sub39) Static224.aClass32_4.method584(); local216 != null; local216 = (Class14_Sub39) Static224.aClass32_4.method577()) {
			@Pc(224) Class152 local224 = Static224.aClass274_2.method6614(local216.anInt8785);
			if (Static391.method5939(local224)) {
				@Pc(249) int local249;
				@Pc(261) int local261;
				if (Static474.anInt8161 == local216.anInt8785) {
					local249 = local38 * local216.anInt8788 / Static224.anInt1295 + local67;
					local261 = local76 + (Static224.anInt1298 - local216.anInt8790) * local40 / Static224.anInt1298;
					arg1.method6887(local261 - 2, local205 << 24 | 0xFFFF00, 4, 4, local249 - 2);
				} else if (Static417.anInt7161 != -1 && Static417.anInt7161 == local224.anInt4296) {
					local249 = local67 + local38 * local216.anInt8788 / Static224.anInt1295;
					local261 = (Static224.anInt1298 - local216.anInt8790) * local40 / Static224.anInt1298 + local76;
					arg1.method6887(local261 - 2, local205 << 24 | 0xFFFF00, 4, 4, local249 - 2);
				}
			}
		}
	}
}
