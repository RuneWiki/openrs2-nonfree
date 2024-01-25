import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
	public static int anInt10134;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
	public static void method8591() {
		if (!Static333.aBoolean400) {
			Static19.aBoolean35 = Static298.anInt8468 != -1 && Static298.anInt8468 <= Static574.anInt8895 || Static574.anInt8895 * 16 + (Static523.aBoolean633 ? 26 : 22) > Static357.anInt5421;
		}
		Static579.aClass163_61.method3643();
		Static253.aClass163_23.method3643();
		@Pc(53) int local53;
		for (@Pc(48) Class4_Sub5_Sub17 local48 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local48 != null; local48 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
			local53 = local48.anInt7673;
			if (local53 < 1000) {
				local48.method9000();
				if (local53 == 8 || local53 == 51 || local53 == 48 || local53 == 30 || local53 == 44 || local53 == 58 || local53 == 5) {
					Static253.aClass163_23.method3646(local48);
				} else {
					Static579.aClass163_61.method3646(local48);
				}
			}
		}
		Static579.aClass163_61.method3647(Static87.aClass163_14);
		Static253.aClass163_23.method3647(Static87.aClass163_14);
		if (Static574.anInt8895 <= 1) {
			Static225.aClass4_Sub5_Sub17_3 = null;
			Static111.aClass4_Sub5_Sub17_2 = null;
		} else {
			if (Static625.aBoolean764 && Static231.aClass102_6.method4311(81) && Static574.anInt8895 > 2) {
				Static111.aClass4_Sub5_Sub17_2 = (Class4_Sub5_Sub17) Static87.aClass163_14.aClass4_127.aClass4_338.aClass4_338;
			} else {
				Static111.aClass4_Sub5_Sub17_2 = (Class4_Sub5_Sub17) Static87.aClass163_14.aClass4_127.aClass4_338;
			}
			Static225.aClass4_Sub5_Sub17_3 = (Class4_Sub5_Sub17) Static87.aClass163_14.aClass4_127.aClass4_338;
		}
		local53 = -1;
		@Pc(159) Class4_Sub15 local159 = (Class4_Sub15) Static385.aClass163_35.method3639();
		if (local159 != null) {
			local53 = local159.method4791();
		}
		if (!Static333.aBoolean400) {
			if (local53 == 0 && (Static18.anInt6908 == 1 && Static574.anInt8895 > 2 || Static327.method4497())) {
				local53 = 2;
			}
			if (local53 == 2 && Static574.anInt8895 > 0 && local159 != null) {
				if (Static507.aClass199_12 == null && Static481.anInt7584 == 0) {
					Static459.method6401(local159.method4789(), local159.method4787());
				} else {
					Static436.anInt7550 = 2;
				}
			}
			if (local53 == 0) {
				if (Static111.aClass4_Sub5_Sub17_2 != null) {
					Static37.method743();
				} else if (Static463.aBoolean582) {
					Static124.method2204();
				}
			}
			if (Static507.aClass199_12 != null || Static481.anInt7584 != 0) {
				return;
			}
			Static46.aClass4_Sub5_Sub17_1 = null;
			Static436.anInt7550 = 0;
			return;
		}
		@Pc(175) int local175;
		@Pc(179) int local179;
		@Pc(261) int local261;
		@Pc(263) int local263;
		if (local53 == -1) {
			local175 = Static373.aClass161_1.method5903();
			local179 = Static373.aClass161_1.method5898();
			@Pc(181) boolean local181 = false;
			if (Static581.aClass4_Sub5_Sub12_1 != null) {
				if (local175 >= Static398.anInt5803 - 10 && local175 <= Static4.anInt76 + Static398.anInt5803 + 10 && local179 >= Static587.anInt9057 - 10 && local179 <= Static587.anInt9057 + Static485.anInt7635 + 10) {
					local181 = true;
				} else {
					Static407.method2216();
				}
			}
			if (!local181) {
				if (Static357.anInt5417 - 10 > local175 || Static357.anInt5417 + Static506.anInt7915 + 10 < local175 || local179 < Static430.anInt6771 - 10 || local179 > Static430.anInt6771 + Static342.anInt8649 + 10) {
					Static67.method1454();
				} else if (Static19.aBoolean35) {
					local261 = -1;
					local263 = -1;
					@Pc(277) int local277;
					for (@Pc(265) int local265 = 0; local265 < Static579.anInt8938; local265++) {
						if (Static523.aBoolean633) {
							local277 = local265 * 16 + Static430.anInt6771 + 33;
							if (local179 > local277 - 13 && local179 < local277 + 4) {
								local261 = local265;
								local263 = local277 - 13;
								break;
							}
						} else {
							local277 = Static430.anInt6771 + local265 * 16 + 31;
							if (local277 - 13 < local179 && local277 + 3 > local179) {
								local263 = local277 - 13;
								local261 = local265;
								break;
							}
						}
					}
					if (local261 != -1) {
						local277 = 0;
						@Pc(343) Class46 local343 = new Class46(Static256.aClass367_3);
						for (@Pc(348) Class4_Sub5_Sub12 local348 = (Class4_Sub5_Sub12) local343.method1495(); local348 != null; local348 = (Class4_Sub5_Sub12) local343.method1496()) {
							if (local261 == local277) {
								if (local348.anInt4687 > 1) {
									Static21.method510(local179, local348, local263);
								}
								break;
							}
							local277++;
						}
					}
				}
			}
		}
		if (local53 != 0) {
			return;
		}
		local175 = local159.method4789();
		local179 = local159.method4787();
		@Pc(423) int local423;
		@Pc(505) Class46 local505;
		@Pc(510) Class4_Sub5_Sub17 local510;
		if (Static581.aClass4_Sub5_Sub12_1 != null && local175 >= Static398.anInt5803 && local175 <= Static4.anInt76 + Static398.anInt5803 && local179 >= Static587.anInt9057 && Static485.anInt7635 + Static587.anInt9057 >= local179) {
			local423 = -1;
			for (local261 = 0; local261 < Static581.aClass4_Sub5_Sub12_1.anInt4687; local261++) {
				if (Static523.aBoolean633) {
					local263 = Static587.anInt9057 + local261 * 16 + 33;
					if (local179 > local263 - 13 && local263 + 4 > local179) {
						local423 = local261;
					}
				} else {
					local263 = Static587.anInt9057 + local261 * 16 + 31;
					if (local263 - 13 < local179 && local263 + 3 > local179) {
						local423 = local261;
					}
				}
			}
			if (local423 != -1) {
				local263 = 0;
				local505 = new Class46(Static581.aClass4_Sub5_Sub12_1.aClass367_5);
				for (local510 = (Class4_Sub5_Sub17) local505.method1495(); local510 != null; local510 = (Class4_Sub5_Sub17) local505.method1496()) {
					if (local263 == local423) {
						Static524.method7049(local510, local179, local175);
						break;
					}
					local263++;
				}
			}
			Static67.method1454();
			return;
		}
		if (Static357.anInt5417 > local175 || local175 > Static506.anInt7915 + Static357.anInt5417 || Static430.anInt6771 > local179 || local179 > Static342.anInt8649 + Static430.anInt6771) {
			return;
		}
		if (Static19.aBoolean35) {
			local423 = -1;
			for (local261 = 0; local261 < Static579.anInt8938; local261++) {
				if (Static523.aBoolean633) {
					local263 = local261 * 16 + Static430.anInt6771 + 33;
					if (local179 > local263 - 13 && local263 + 4 > local179) {
						local423 = local261;
						break;
					}
				} else {
					local263 = local261 * 16 + Static430.anInt6771 + 31;
					if (local263 - 13 < local179 && local263 + 3 > local179) {
						local423 = local261;
						break;
					}
				}
			}
			if (local423 != -1) {
				local263 = 0;
				local505 = new Class46(Static256.aClass367_3);
				for (@Pc(639) Class4_Sub5_Sub12 local639 = (Class4_Sub5_Sub12) local505.method1495(); local639 != null; local639 = (Class4_Sub5_Sub12) local505.method1496()) {
					if (local263 == local423) {
						Static524.method7049((Class4_Sub5_Sub17) local639.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67, local179, local175);
						Static67.method1454();
						return;
					}
					local263++;
				}
				return;
			}
		} else {
			local423 = -1;
			for (local261 = 0; local261 < Static574.anInt8895; local261++) {
				if (Static523.aBoolean633) {
					local263 = (Static574.anInt8895 - local261 - 1) * 16 + Static430.anInt6771 + 33;
					if (local263 - 13 < local179 && local263 + 4 > local179) {
						local423 = local261;
					}
				} else {
					local263 = Static430.anInt6771 + (Static574.anInt8895 - local261 - 1) * 16 + 31;
					if (local179 > local263 - 13 && local179 < local263 + 3) {
						local423 = local261;
					}
				}
			}
			if (local423 != -1) {
				local263 = 0;
				@Pc(754) Class232 local754 = new Class232(Static87.aClass163_14);
				for (local510 = (Class4_Sub5_Sub17) local754.method4933(); local510 != null; local510 = (Class4_Sub5_Sub17) local754.method4932()) {
					if (local423 == local263) {
						Static524.method7049(local510, local179, local175);
						break;
					}
					local263++;
				}
			}
			Static67.method1454();
		}
		return;
	}
}
