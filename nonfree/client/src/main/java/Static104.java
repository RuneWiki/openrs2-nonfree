import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public static int anInt2195;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "[I")
	public static int[] anIntArray195;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!oc;")
	public static Class180 aClass180_1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!sg;Z)V")
	public static void method1972(@OriginalArg(1) Class11_Sub5_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static352.anInt6233 >= 400) {
			return;
		}
		@Pc(12) Class241 local12 = arg0.aClass241_1;
		if (local12.anIntArray565 != null) {
			local12 = local12.method5593(Static67.aClass224_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean514) {
			return;
		}
		@Pc(30) String local30 = local12.lb;
		if (local12.anInt7010 != 0) {
			@Pc(49) String local49 = Static323.aClass235_5 == Static332.aClass235_6 ? Static206.aClass21_57.method362(Static168.anInt3290) : Static282.aClass21_81.method362(Static168.anInt3290);
			local30 = local30 + Static442.method6057(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4174, local12.anInt7010) + " (" + local49 + local12.anInt7010 + ")";
		}
		if (!Static449.aBoolean564) {
			if (!arg1) {
				@Pc(139) String[] local139 = local12.aStringArray35;
				if (Static299.aBoolean392) {
					local139 = Static56.method1232(local139);
				}
				@Pc(149) int local149;
				if (local139 != null) {
					for (local149 = 4; local149 >= 0; local149--) {
						if (local139[local149] != null && (local12.aByte95 == 0 || !local139[local149].equalsIgnoreCase(Static91.aClass21_23.method362(Static168.anInt3290)))) {
							@Pc(172) byte local172 = 0;
							@Pc(174) int local174 = Static51.anInt1208;
							if (local149 == 0) {
								local172 = 4;
							}
							if (local149 == 1) {
								local172 = 19;
							}
							if (local149 == 2) {
								local172 = 16;
							}
							if (local149 == 3) {
								local172 = 44;
							}
							if (local149 == local12.anInt6996) {
								local174 = local12.anInt7016;
							}
							if (local149 == 4) {
								local172 = 10;
							}
							if (local149 == local12.anInt7003) {
								local174 = local12.anInt7005;
							}
							Static12.method4708(local172, (long) arg0.anInt6518, 0, false, true, local139[local149].equalsIgnoreCase(Static91.aClass21_23.method362(Static168.anInt3290)) ? local12.anInt7011 : local174, "<col=ffff00>" + local30, local139[local149], -1, 0);
						}
					}
				}
				if (local12.aByte95 == 1 && local139 != null) {
					for (local149 = 4; local149 >= 0; local149--) {
						if (local139[local149] != null && local139[local149].equalsIgnoreCase(Static91.aClass21_23.method362(Static168.anInt3290))) {
							@Pc(298) short local298 = 0;
							if (local12.anInt7010 > Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4174) {
								local298 = 2000;
							}
							@Pc(307) short local307 = 0;
							if (local149 == 0) {
								local307 = 4;
							}
							if (local149 == 1) {
								local307 = 19;
							}
							if (local149 == 2) {
								local307 = 16;
							}
							if (local149 == 3) {
								local307 = 44;
							}
							if (local149 == 4) {
								local307 = 10;
							}
							if (local307 != 0) {
								local307 += local298;
							}
							Static12.method4708(local307, (long) arg0.anInt6518, 0, false, true, local12.anInt7011, "<col=ffff00>" + local30, local139[local149], -1, 0);
						}
					}
				}
			}
			Static12.method4708(1001, (long) arg0.anInt6518, 0, arg1, true, Static268.anInt5105, "<col=ffff00>" + local30, Static143.aClass21_37.method362(Static168.anInt3290), -1, 0);
		} else if (!arg1) {
			@Pc(88) Class176 local88 = Static352.anInt6231 == -1 ? null : Static203.aClass202_1.method4864(Static352.anInt6231);
			if ((Static353.anInt6237 & 0x2) != 0) {
				if (local88 == null || local12.method5595(Static352.anInt6231, local88.anInt5158) != local88.anInt5158) {
					Static12.method4708(12, (long) arg0.anInt6518, 0, false, true, Static281.anInt5275, Static168.aString24 + " -> <col=ffff00>" + local30, Static198.aString26, -1, 0);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public static boolean method1974(@OriginalArg(0) int arg0) {
		if (Static445.aBooleanArray151[arg0]) {
			return true;
		} else if (Static434.aClass38_89.method1044(arg0)) {
			@Pc(23) int local23 = Static434.aClass38_89.method1032(arg0);
			if (local23 == 0) {
				Static445.aBooleanArray151[arg0] = true;
				return true;
			}
			if (Static122.aClass240ArrayArray2[arg0] == null) {
				Static122.aClass240ArrayArray2[arg0] = new Class240[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static122.aClass240ArrayArray2[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static434.aClass38_89.method1039(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class240 local73 = Static122.aClass240ArrayArray2[arg0][local47] = new Class240();
						local73.anInt6909 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method5534(new Class4_Sub20(local61));
					}
				}
			}
			Static445.aBooleanArray151[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
