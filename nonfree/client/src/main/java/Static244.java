import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
	public static int anInt4865 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIILclient!th;)V")
	public static void method3896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class15_Sub2_Sub2 arg3) {
		if (arg3 == Static22.aClass15_Sub2_Sub2_1 || Static68.anInt1741 >= 400) {
			return;
		}
		@Pc(133) String local133;
		if (arg3.anInt5404 == 0) {
			@Pc(18) boolean local18 = true;
			if (Static22.aClass15_Sub2_Sub2_1.anInt5381 != -1 && arg3.anInt5381 != -1) {
				@Pc(45) int local45 = arg3.anInt5381 <= Static22.aClass15_Sub2_Sub2_1.anInt5381 ? arg3.anInt5381 : Static22.aClass15_Sub2_Sub2_1.anInt5381;
				@Pc(60) int local60 = arg3.anInt5382 < Static22.aClass15_Sub2_Sub2_1.anInt5382 ? Static22.aClass15_Sub2_Sub2_1.anInt5382 : arg3.anInt5382;
				@Pc(70) int local70 = local45 + local60 * 10 / 100 + 5;
				@Pc(77) int local77 = Static22.aClass15_Sub2_Sub2_1.anInt5382 - arg3.anInt5382;
				if (local77 < 0) {
					local77 = -local77;
				}
				if (local70 < local77) {
					local18 = false;
				}
			}
			@Pc(98) String local98 = Static162.anInt3614 == 1 ? Static270.aString143 : Static274.aString187;
			if (arg3.anInt5382 >= arg3.anInt5409) {
				local133 = arg3.method4303() + (local18 ? Static238.method4690(arg3.anInt5382, Static22.aClass15_Sub2_Sub2_1.anInt5382) : "<col=ffffff>") + " (" + local98 + arg3.anInt5382 + ")";
			} else {
				local133 = arg3.method4303() + (local18 ? Static238.method4690(arg3.anInt5382, Static22.aClass15_Sub2_Sub2_1.anInt5382) : "<col=ffffff>") + " (" + local98 + arg3.anInt5382 + "+" + (arg3.anInt5409 - arg3.anInt5382) + ")";
			}
		} else {
			local133 = arg3.method4303() + " (" + Static193.aString137 + arg3.anInt5404 + ")";
		}
		@Pc(228) int local228;
		if (Static73.anInt1823 == 1) {
			Static206.method3478(Static4.aString3 + " -> <col=ffffff>" + local133, (long) arg0, arg2, (short) 21, Static21.aString22, arg1, Static269.anInt5273);
		} else if (!Static287.aBoolean373) {
			for (local228 = 7; local228 >= 0; local228--) {
				if (Static113.aStringArray20[local228] != null) {
					@Pc(245) short local245 = 0;
					if (Static162.anInt3614 == 0 && Static113.aStringArray20[local228].equalsIgnoreCase(Static52.aString49)) {
						if (Static22.aClass15_Sub2_Sub2_1.anInt5382 < arg3.anInt5382) {
							local245 = 2000;
						}
						if (Static22.aClass15_Sub2_Sub2_1.anInt5387 != 0 && arg3.anInt5387 != 0) {
							if (Static22.aClass15_Sub2_Sub2_1.anInt5387 == arg3.anInt5387) {
								local245 = 2000;
							} else {
								local245 = 0;
							}
						}
					} else if (Static60.aBooleanArray3[local228]) {
						local245 = 2000;
					}
					@Pc(300) short local300 = Static46.aShortArray6[local228];
					@Pc(305) short local305 = (short) (local300 + local245);
					Static206.method3478("<col=ffffff>" + local133, (long) arg0, arg2, local305, Static113.aStringArray20[local228], arg1, Static80.anIntArray165[local228]);
				}
			}
		} else if ((Static237.anInt4771 & 0x8) != 0) {
			Static206.method3478(Static96.aString83 + " -> <col=ffffff>" + local133, (long) arg0, arg2, (short) 50, Static251.aString167, arg1, Static312.anInt5126);
		}
		for (local228 = 0; local228 < Static68.anInt1741; local228++) {
			if (Static290.aShortArray85[local228] == 31) {
				Static175.aStringArray28[local228] = "<col=ffffff>" + local133;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
	public static void method3897(@OriginalArg(1) boolean arg0) {
		Static220.method3662();
		if (Static64.anInt1561 != 30 && Static64.anInt1561 != 25) {
			return;
		}
		Static306.anInt5919++;
		if (Static306.anInt5919 < 50 && !arg0) {
			return;
		}
		Static306.anInt5919 = 0;
		if (!Static19.aBoolean29 && Static253.aClass34_3 != null) {
			Static211.aClass2_Sub16_Sub1_2.method2198(164);
			try {
				Static253.aClass34_3.method1076(Static211.aClass2_Sub16_Sub1_2.aByteArray17, Static211.aClass2_Sub16_Sub1_2.anInt2789);
				Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
			} catch (@Pc(60) IOException local60) {
				Static19.aBoolean29 = true;
			}
		}
		Static220.method3662();
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)Lclient!ie;")
	public static Class2_Sub8_Sub9 method3898(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub8_Sub9 local10 = (Class2_Sub8_Sub9) Static108.aClass106_3.method2986((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static220.aClass42_69.method1256(Static115.method4702(arg0), Static39.method735(arg0));
		local10 = new Class2_Sub8_Sub9();
		if (local30 != null) {
			local10.method2025(new Class2_Sub16(local30));
		}
		Static108.aClass106_3.method2990((long) arg0, local10);
		return local10;
	}
}
