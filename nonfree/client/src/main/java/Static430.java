import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZI)V")
	public static void method6013() {
		@Pc(14) Class1_Sub48 local14 = Static320.method4867(Static442.aClass170_2, Static332.aClass319_105);
		Static34.method813(local14);
		for (@Pc(22) Class1_Sub16 local22 = (Class1_Sub16) Static68.aClass356_4.method7792(); local22 != null; local22 = (Class1_Sub16) Static68.aClass356_4.method7795()) {
			if (!local22.method7877()) {
				local22 = (Class1_Sub16) Static68.aClass356_4.method7792();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt2683 == 0) {
				Static546.method7412(local22, true, true);
			}
		}
		if (Static211.aClass365_8 != null) {
			Static201.method5537(Static211.aClass365_8);
			Static211.aClass365_8 = null;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Z)I")
	public static int method6015() {
		if (Static363.aClass365_14 == null) {
			if (!Static294.aBoolean407 && Static135.anInt2684 > 0) {
				if (Static490.aBoolean598 && Static595.aClass31_1.method985(81) && Static135.anInt2684 > 2) {
					return ((Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285.aClass1_285).anInt5142;
				}
				return ((Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285).anInt5142;
			}
			@Pc(45) int local45 = Static287.aClass256_8.method7558();
			@Pc(49) int local49 = Static287.aClass256_8.method7561();
			@Pc(51) int local51 = Static215.anInt4176;
			@Pc(53) int local53 = Static2.anInt57;
			@Pc(55) int local55 = Static86.anInt1957;
			if (local51 < local45 && local51 + local55 > local45) {
				@Pc(69) int local69 = -1;
				@Pc(88) int local88;
				for (@Pc(71) int local71 = 0; local71 < Static135.anInt2684; local71++) {
					if (Static268.aBoolean383) {
						local88 = (Static135.anInt2684 - local71 - 1) * 16 + local53 + 33;
						if (local49 > local88 - 13 && local49 <= local88 + 3) {
							local69 = local71;
						}
					} else {
						local88 = (Static135.anInt2684 - local71 - 1) * 16 + local53 + 31;
						if (local49 > local88 - 13 && local88 + 3 >= local49) {
							local69 = local71;
						}
					}
				}
				if (local69 != -1) {
					local88 = 0;
					@Pc(149) Class187 local149 = new Class187(Static3.aClass361_1);
					for (@Pc(154) Class1_Sub23 local154 = (Class1_Sub23) local149.method4201(); local154 != null; local154 = (Class1_Sub23) local149.method4204()) {
						if (local69 == local88++) {
							return local154.anInt5142;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIZII)V")
	public static void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class1_Sub30 local6 = (Class1_Sub30) Static201.aClass361_70.method7854(); local6 != null; local6 = (Class1_Sub30) Static201.aClass361_70.method7853()) {
			Static17.method506(arg1, local6, arg0, arg2, arg3);
		}
		for (@Pc(31) Class1_Sub30 local31 = (Class1_Sub30) Static381.aClass361_69.method7854(); local31 != null; local31 = (Class1_Sub30) Static381.aClass361_69.method7853()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class138 local40 = local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.method5346();
			if (local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.aBoolean457) {
				local35 = 0;
			} else if (local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt6454 == local40.anInt3973 || local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt6454 == local40.anInt3976 || local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt6454 == local40.anInt3971 || local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt6454 == local40.anInt3981) {
				local35 = 2;
			} else if (local40.anInt3966 == local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt6454 || local40.anInt3987 == local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt6454 || local40.anInt4003 == local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt6454 || local40.anInt4000 == local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt6454) {
				local35 = 3;
			}
			if (local35 != local31.anInt5881) {
				@Pc(135) int local135 = Static273.method4258(local31.aClass20_Sub2_Sub4_Sub1_Sub2_1);
				@Pc(139) Class162 local139 = local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.aClass162_1;
				if (local139.anIntArray267 != null) {
					local139 = local139.method3802(Static121.aClass148_1);
				}
				if (local139 == null || local135 == -1) {
					local31.aBoolean423 = false;
					local31.anInt5877 = -1;
				} else if (local31.anInt5877 != local135 || local139.aBoolean351 != local31.aBoolean423) {
					if (local31.aClass1_Sub8_Sub1_4 != null) {
						Static298.aClass1_Sub8_Sub4_2.method6033(local31.aClass1_Sub8_Sub1_4);
						local31.aClass1_Sub8_Sub1_4 = null;
					}
					local31.aClass1_Sub38_3 = null;
					local31.aBoolean423 = local139.aBoolean351;
					local31.aClass1_Sub40_Sub1_4 = null;
					local31.anInt5877 = local135;
				}
				local31.anInt5881 = local35;
			}
			local31.anInt5891 = local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt8796;
			local31.anInt5884 = local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt8796 + (local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.method5349() << 8);
			local31.anInt5885 = local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt8795;
			local31.anInt5875 = local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.anInt8795 + (local31.aClass20_Sub2_Sub4_Sub1_Sub2_1.method5349() << 8);
			Static17.method506(arg1, local31, arg0, arg2, arg3);
		}
		for (@Pc(257) Class1_Sub30 local257 = (Class1_Sub30) Static332.aClass356_27.method7792(); local257 != null; local257 = (Class1_Sub30) Static332.aClass356_27.method7795()) {
			@Pc(261) byte local261 = 1;
			@Pc(266) Class138 local266 = local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.method5346();
			if (local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.aBoolean457) {
				local261 = 0;
			} else if (local266.anInt3973 == local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt6454 || local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt6454 == local266.anInt3976 || local266.anInt3971 == local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt6454 || local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt6454 == local266.anInt3981) {
				local261 = 2;
			} else if (local266.anInt3966 == local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt6454 || local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt6454 == local266.anInt3987 || local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt6454 == local266.anInt4003 || local266.anInt4000 == local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt6454) {
				local261 = 3;
			}
			if (local261 != local257.anInt5881) {
				@Pc(353) int local353 = Static269.method4224(local257.aClass20_Sub2_Sub4_Sub1_Sub1_1);
				if (local257.anInt5877 != local353 || local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.aBoolean376 != local257.aBoolean423) {
					if (local257.aClass1_Sub8_Sub1_4 != null) {
						Static298.aClass1_Sub8_Sub4_2.method6033(local257.aClass1_Sub8_Sub1_4);
						local257.aClass1_Sub8_Sub1_4 = null;
					}
					local257.aClass1_Sub40_Sub1_4 = null;
					local257.aClass1_Sub38_3 = null;
					local257.anInt5877 = local353;
					local257.aBoolean423 = local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.aBoolean376;
				}
				local257.anInt5881 = local261;
			}
			local257.anInt5891 = local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt8796;
			local257.anInt5884 = local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt8796 + (local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.method5349() << 8);
			local257.anInt5885 = local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt8795;
			local257.anInt5875 = local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.anInt8795 + (local257.aClass20_Sub2_Sub4_Sub1_Sub1_1.method5349() << 8);
			Static17.method506(arg1, local257, arg0, arg2, arg3);
		}
	}
}
