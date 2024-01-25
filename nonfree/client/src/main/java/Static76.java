import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_24 = new Class216(8, 7);

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "[Lclient!waa;")
	public static final Interface26[] anInterface26Array1 = new Interface26[128];

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_32 = new Class151(36, 2);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public static void method1618() {
		@Pc(17) Class4_Sub48 local17 = Static335.method4615(Static186.aClass216_63, Static669.aClass196_2);
		local17.aClass4_Sub11_Sub1_2.method8838(Static209.anInt3391);
		Static410.method5170(local17);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!iaa;Z)V")
	public static void method1619(@OriginalArg(1) Class3_Sub1_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static574.anInt8895 >= 400) {
			return;
		}
		if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 != arg0) {
			@Pc(159) String local159;
			if (arg0.anInt3943 == 0) {
				@Pc(66) boolean local66 = true;
				if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3946 != -1 && arg0.anInt3946 != -1) {
					@Pc(90) int local90 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3946 < arg0.anInt3946 ? Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3946 : arg0.anInt3946;
					@Pc(97) int local97 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3920 - arg0.anInt3920;
					if (local97 < 0) {
						local97 = -local97;
					}
					if (local97 > local90) {
						local66 = false;
					}
				}
				@Pc(124) String local124 = Static333.aClass234_5 == Static92.aClass234_1 ? Static279.aClass179_30.method4066(Static164.anInt2984) : Static279.aClass179_28.method4066(Static164.anInt2984);
				if (arg0.anInt3947 <= arg0.anInt3920) {
					local159 = arg0.method3532() + (local66 ? Static570.method7542(arg0.anInt3920, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3920) : "<col=ffffff>") + " (" + local124 + arg0.anInt3920 + ")";
				} else {
					local159 = arg0.method3532() + (local66 ? Static570.method7542(arg0.anInt3920, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3920) : "<col=ffffff>") + " (" + local124 + arg0.anInt3920 + "+" + (arg0.anInt3947 - arg0.anInt3920) + ")";
				}
			} else if (arg0.anInt3943 == -1) {
				local159 = arg0.method3532();
			} else {
				local159 = arg0.method3532() + " (" + Static279.aClass179_29.method4066(Static164.anInt2984) + arg0.anInt3943 + ")";
			}
			if (Static463.aBoolean582 && !arg1 && (Static25.anInt576 & 0x8) != 0) {
				Static321.method4431((long) arg0.anInt9961, -1, false, Static203.aString30 + " -> <col=ffffff>" + local159, Static111.anInt2192, (long) arg0.anInt9961, false, 0, 44, 0, Static384.aString73, true);
			}
			if (arg1) {
				Static321.method4431((long) arg0.anInt9961, 0, false, "", -1, 0L, true, 0, -1, 0, "<col=cccccc>" + local159, false);
			} else {
				for (@Pc(279) int local279 = 7; local279 >= 0; local279--) {
					if (Static481.aStringArray39[local279] != null) {
						@Pc(287) short local287 = 0;
						if (Static333.aClass234_5 == Static179.aClass234_2 && Static481.aStringArray39[local279].equalsIgnoreCase(Static279.aClass179_23.method4066(Static164.anInt2984))) {
							if (Static558.aBoolean669 && Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3920 < arg0.anInt3920) {
								local287 = 2000;
							}
							if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3956 == 0 || arg0.anInt3956 == 0) {
								if (arg0.aBoolean291) {
									local287 = 2000;
								}
							} else if (arg0.anInt3956 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt3956) {
								local287 = 2000;
							} else {
								local287 = 0;
							}
						} else if (Static466.aBooleanArray15[local279]) {
							local287 = 2000;
						}
						@Pc(354) short local354 = (short) (Static573.aShortArray146[local279] + local287);
						@Pc(366) int local366 = Static430.anIntArray466[local279] == -1 ? Static232.anInt3661 : Static430.anIntArray466[local279];
						Static321.method4431((long) arg0.anInt9961, -1, false, "<col=ffffff>" + local159, local366, (long) arg0.anInt9961, false, 0, local354, 0, Static481.aStringArray39[local279], true);
					}
				}
			}
			if (!arg1) {
				for (@Pc(430) Class4_Sub5_Sub17 local430 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local430 != null; local430 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
					if (local430.anInt7673 == 60) {
						local430.aString98 = "<col=ffffff>" + local159;
						return;
					}
				}
			}
		} else if (Static463.aBoolean582 && (Static25.anInt576 & 0x10) != 0) {
			Static321.method4431((long) arg0.anInt9961, -1, false, Static203.aString30 + " -> <col=ffffff>" + Static279.aClass179_37.method4066(Static164.anInt2984), Static111.anInt2192, 0L, false, 0, 58, 0, Static384.aString73, true);
		}
	}
}
