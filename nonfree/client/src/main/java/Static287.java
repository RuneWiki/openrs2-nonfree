import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!kfa", name = "t", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!kfa", name = "u", descriptor = "Lclient!oca;")
	public static Class5_Sub16_Sub3 aClass5_Sub16_Sub3_1;

	@OriginalMember(owner = "client!kfa", name = "q", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_110 = new Class136(70, 8);

	@OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
	public static int anInt4692 = 0;

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)I")
	public static int method4286() {
		@Pc(7) int local7 = 0;
		@Pc(17) Field[] local17 = up.class.getDeclaredFields();
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			@Pc(27) Field local27 = local17[local21];
			if (qv.class.isAssignableFrom(local27.getType())) {
				local7++;
			}
		}
		return local7 + 1;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLclient!fs;Z)V")
	public static void method4288(@OriginalArg(1) Class14_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static642.anInt10370 >= 400) {
			return;
		}
		@Pc(14) Class271 local14 = arg0.aClass271_1;
		@Pc(17) String local17 = arg0.aString51;
		if (local14.anIntArray591 != null) {
			local14 = local14.method6476(Static564.aClass304_1);
			if (local14 == null) {
				return;
			}
			local17 = local14.aString110;
		}
		if (!local14.aBoolean614) {
			return;
		}
		if (arg0.anInt2995 != 0) {
			@Pc(51) String local51 = Static609.aClass235_7 == Static24.aClass235_1 ? Static76.aClass58_31.method1237(Static321.anInt5554) : Static76.aClass58_29.method1237(Static321.anInt5554);
			local17 = local17 + Static261.method3988(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2723, arg0.anInt2995) + " (" + local51 + arg0.anInt2995 + ")";
		}
		if (Static202.aBoolean295 && !arg1) {
			@Pc(93) Class230 local93 = Static139.anInt2304 == -1 ? null : Static246.aClass258_1.method6202(Static139.anInt2304);
			if ((Static42.anInt714 & 0x2) != 0 && (local93 == null || local14.method6483(local93.anInt6315, Static139.anInt2304) != local93.anInt6315)) {
				Static227.method3576(true, (long) arg0.anInt2960, (long) arg0.anInt2960, false, 0, 9, false, -1, Static497.anInt8481, Static111.aString29, Static485.aString115 + " -> <col=ffff00>" + local17, 0);
			}
		}
		if (!arg1) {
			@Pc(147) String[] local147 = local14.aStringArray33;
			if (Static336.aBoolean486) {
				local147 = Static526.method7538(local147);
			}
			@Pc(157) int local157;
			if (local147 != null) {
				for (local157 = 4; local157 >= 0; local157--) {
					if (local147[local157] != null && (local14.aByte103 == 0 || !local147[local157].equalsIgnoreCase(Static76.aClass58_24.method1237(Static321.anInt5554)))) {
						@Pc(177) byte local177 = 0;
						if (local157 == 0) {
							local177 = 59;
						}
						@Pc(183) int local183 = Static308.anInt4884;
						if (local157 == 1) {
							local177 = 6;
						}
						if (local157 == 2) {
							local177 = 18;
						}
						if (local157 == 3) {
							local177 = 11;
						}
						if (local157 == 4) {
							local177 = 47;
						}
						if (local14.anInt7321 == local157) {
							local183 = local14.anInt7331;
						}
						if (local14.lb == local157) {
							local183 = local14.anInt7316;
						}
						Static227.method3576(true, (long) arg0.anInt2960, (long) arg0.anInt2960, false, 0, local177, false, -1, local147[local157].equalsIgnoreCase(Static76.aClass58_24.method1237(Static321.anInt5554)) ? local14.anInt7343 : local183, local147[local157], "<col=ffff00>" + local17, 0);
					}
				}
			}
			if (local14.aByte103 == 1 && local147 != null) {
				for (local157 = 4; local157 >= 0; local157--) {
					if (local147[local157] != null && local147[local157].equalsIgnoreCase(Static76.aClass58_24.method1237(Static321.anInt5554))) {
						@Pc(304) short local304 = 0;
						if (arg0.anInt2995 > Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2723) {
							local304 = 2000;
						}
						@Pc(317) short local317 = 0;
						if (local157 == 0) {
							local317 = 59;
						}
						if (local157 == 1) {
							local317 = 6;
						}
						if (local157 == 2) {
							local317 = 18;
						}
						if (local157 == 3) {
							local317 = 11;
						}
						if (local157 == 4) {
							local317 = 47;
						}
						if (local317 != 0) {
							local317 += local304;
						}
						Static227.method3576(true, (long) arg0.anInt2960, (long) arg0.anInt2960, false, 0, local317, false, -1, local14.anInt7343, local147[local157], "<col=ffff00>" + local17, 0);
					}
				}
			}
		}
		Static227.method3576(true, (long) arg0.anInt2960, (long) arg0.anInt2960, false, 0, 1002, arg1, -1, Static268.anInt4461, Static76.aClass58_23.method1237(Static321.anInt5554), "<col=ffff00>" + local17, 0);
	}

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)V")
	public static void method4290() {
		if (Static214.aClass192_1.aBoolean390) {
			Static125.anInt2059 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static125.anInt2059 = (int) (local33 / 1048576L) + 1;
					return;
				} catch (@Pc(43) Throwable local43) {
					return;
				}
			}
		} catch (@Pc(45) Exception local45) {
			return;
		}
	}
}
