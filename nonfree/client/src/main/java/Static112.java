import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "Z")
	public static boolean aBoolean841;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "Z")
	public static boolean aBoolean843;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!cea;BZ)V")
	public static void method8726(@OriginalArg(0) Class9_Sub4_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static611.anInt10324 >= 400) {
			return;
		}
		@Pc(12) Class158 local12 = arg0.aClass158_1;
		if (local12.anIntArray260 != null) {
			local12 = local12.method4867(Static140.aClass157_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean453) {
			return;
		}
		@Pc(35) String local35 = local12.aString60;
		if (local12.anInt5830 != 0) {
			@Pc(51) String local51 = Static25.aClass290_5 == Static8.aClass290_1 ? Static536.aClass316_32.method7577(Static638.anInt10709) : Static536.aClass316_30.method7577(Static638.anInt10709);
			local35 = local35 + Static196.method3569(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4369, local12.anInt5830) + " (" + local51 + local12.anInt5830 + ")";
		}
		if (Static141.aBoolean262 && !arg1) {
			@Pc(91) Class164 local91 = Static26.anInt771 == -1 ? null : Static69.aClass369_1.method8523(Static26.anInt771);
			if ((Static38.anInt1411 & 0x2) != 0 && (local91 == null || local12.method4872(Static26.anInt771, local91.anInt5972) != local91.anInt5972)) {
				Static513.method7357(true, (long) arg0.anInt4299, Static574.anInt9810, 0, Static275.aString109 + " -> <col=ffff00>" + local35, false, 0, 48, (long) arg0.anInt4299, -1, false, Static381.aString72);
			}
		}
		if (!arg1) {
			@Pc(149) String[] local149 = local12.aStringArray15;
			if (Static71.aBoolean187) {
				local149 = Static96.method2352(local149);
			}
			@Pc(161) int local161;
			if (local149 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local149[local161] != null && (local12.aByte61 == 0 || !local149[local161].equalsIgnoreCase(Static536.aClass316_25.method7577(Static638.anInt10709)))) {
						@Pc(181) byte local181 = 0;
						if (local161 == 0) {
							local181 = 10;
						}
						@Pc(187) int local187 = Static197.anInt6051;
						if (local161 == 1) {
							local181 = 25;
						}
						if (local161 == 2) {
							local181 = 11;
						}
						if (local161 == 3) {
							local181 = 12;
						}
						if (local12.anInt5845 == local161) {
							local187 = local12.anInt5853;
						}
						if (local161 == 4) {
							local181 = 17;
						}
						if (local12.anInt5829 == local161) {
							local187 = local12.anInt5825;
						}
						Static513.method7357(true, (long) arg0.anInt4299, local149[local161].equalsIgnoreCase(Static536.aClass316_25.method7577(Static638.anInt10709)) ? local12.anInt5818 : local187, 0, "<col=ffff00>" + local35, false, 0, local181, (long) arg0.anInt4299, -1, false, local149[local161]);
					}
				}
			}
			if (local12.aByte61 == 1 && local149 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local149[local161] != null && local149[local161].equalsIgnoreCase(Static536.aClass316_25.method7577(Static638.anInt10709))) {
						@Pc(296) short local296 = 0;
						if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4369 < local12.anInt5830) {
							local296 = 2000;
						}
						@Pc(309) short local309 = 0;
						if (local161 == 0) {
							local309 = 10;
						}
						if (local161 == 1) {
							local309 = 25;
						}
						if (local161 == 2) {
							local309 = 11;
						}
						if (local161 == 3) {
							local309 = 12;
						}
						if (local161 == 4) {
							local309 = 17;
						}
						if (local309 != 0) {
							local309 += local296;
						}
						Static513.method7357(true, (long) arg0.anInt4299, local12.anInt5818, 0, "<col=ffff00>" + local35, false, 0, local309, (long) arg0.anInt4299, -1, false, local149[local161]);
					}
				}
			}
		}
		Static513.method7357(true, (long) arg0.anInt4299, Static32.anInt843, 0, "<col=ffff00>" + local35, false, 0, 1002, (long) arg0.anInt4299, -1, arg1, Static536.aClass316_24.method7577(Static638.anInt10709));
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V")
	public static void method8730() {
		if (Static333.anInt6626 == 3) {
			Static119.method2558(4);
		} else if (Static333.anInt6626 == 7) {
			Static119.method2558(8);
		} else if (Static333.anInt6626 == 10) {
			Static119.method2558(11);
		}
	}
}
