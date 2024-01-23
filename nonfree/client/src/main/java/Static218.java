import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!qj", name = "T", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!qj", name = "Z", descriptor = "[I")
	public static int[] anIntArray377;

	@OriginalMember(owner = "client!qj", name = "cb", descriptor = "Lclient!jd;")
	public static Class84 aClass84_100;

	@OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
	public static int anInt4585;

	@OriginalMember(owner = "client!qj", name = "V", descriptor = "[I")
	public static int[] anIntArray376 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)Lclient!qh;")
	public static Class143 method3692(@OriginalArg(1) int arg0) {
		@Pc(10) Class143 local10 = (Class143) Static266.aClass46_36.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(33) byte[] local33 = Static39.aClass84_17.method2127(Static111.method2068(arg0), Static162.method2817(arg0));
		local10 = new Class143();
		local10.anInt4488 = arg0;
		if (local33 != null) {
			local10.method3642(new Class2_Sub26(local33));
		}
		local10.method3650();
		if (local10.aBoolean375) {
			local10.anInt4526 = 0;
			local10.aBoolean369 = false;
		}
		if (!Static84.aBoolean59 && local10.aBoolean380) {
			local10.aStringArray24 = null;
		}
		Static266.aClass46_36.method1071(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!wm;I)V")
	public static void method3693(@OriginalArg(0) Class2_Sub26 arg0) {
		label83: while (true) {
			if (arg0.aByteArray72.length > arg0.anInt5328) {
				@Pc(21) boolean local21 = false;
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				if (arg0.method4261() == 1) {
					local23 = arg0.method4261();
					local21 = true;
					local25 = arg0.method4261();
				}
				@Pc(44) int local44 = arg0.method4261();
				@Pc(48) int local48 = arg0.method4261();
				@Pc(55) int local55 = local44 * 64 - Static115.anInt2461;
				@Pc(67) int local67 = Static239.anInt4870 + Static52.anInt1205 - local48 * 64 - 1;
				@Pc(153) byte local153;
				@Pc(93) int local93;
				if (local55 >= 0 && local67 - 63 >= 0 && Static142.anInt3081 > local55 + 63 && local67 < Static52.anInt1205) {
					local93 = local55 >> 6;
					@Pc(97) int local97 = local67 >> 6;
					@Pc(99) int local99 = 0;
					while (true) {
						if (local99 >= 64) {
							continue label83;
						}
						for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
							if (!local21 || local23 * 8 <= local99 && local99 < local23 * 8 + 8 && local106 >= local25 * 8 && local106 < local25 * 8 + 8) {
								local153 = arg0.method4220();
								if (local153 != 0) {
									if (Static19.aByteArrayArrayArray1[local93][local97] == null) {
										Static19.aByteArrayArrayArray1[local93][local97] = new byte[4096];
									}
									Static19.aByteArrayArrayArray1[local93][local97][(63 - local106 << 6) + local99] = local153;
									@Pc(191) byte local191 = arg0.method4220();
									if (Static279.aByteArrayArrayArray15[local93][local97] == null) {
										Static279.aByteArrayArrayArray15[local93][local97] = new byte[4096];
									}
									Static279.aByteArrayArrayArray15[local93][local97][(63 - local106 << 6) + local99] = local191;
								}
							}
						}
						local99++;
					}
				}
				local93 = 0;
				while (true) {
					if (local93 >= (local21 ? 64 : 4096)) {
						continue label83;
					}
					local153 = arg0.method4220();
					if (local153 != 0) {
						arg0.anInt5328++;
					}
					local93++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZZI)V")
	public static void method3694(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(183) int local183;
		@Pc(190) int local190;
		@Pc(214) int local214;
		@Pc(223) int local223;
		@Pc(110) int local110;
		for (@Pc(3) int local3 = 0; local3 < Static71.anInt1550; local3++) {
			@Pc(16) Class36_Sub3_Sub1 local16 = Static201.aClass36_Sub3_Sub1Array1[Static9.anIntArray12[local3]];
			if (local16 != null && local16.method4099() && local16.aClass33_1.method711()) {
				@Pc(31) int local31 = local16.method4097();
				if (arg1) {
					if (!local16.aClass33_1.aBoolean65) {
						continue;
					}
				} else if (arg0 != local16.aClass33_1.aBoolean67 || arg2 != 0 && arg2 != local31) {
					continue;
				}
				@Pc(85) int local85;
				@Pc(90) int local90;
				if (local31 == 1) {
					if ((local16.anInt5093 & 0x7F) == 64 && (local16.anInt5109 & 0x7F) == 64) {
						local85 = local16.anInt5093 >> 7;
						local90 = local16.anInt5109 >> 7;
						if (local85 >= 0 && local85 < 104 && local90 >= 0 && local90 < 104) {
							local110 = Static156.anIntArrayArray49[local85][local90]++;
						}
					}
				} else if (((local31 & 0x1) != 0 || (local16.anInt5093 & 0x7F) == 0 && (local16.anInt5109 & 0x7F) == 0) && ((local31 & 0x1) != 1 || (local16.anInt5093 & 0x7F) == 64 && (local16.anInt5109 & 0x7F) == 64)) {
					local90 = local16.anInt5109 - local31 * 64 >> 7;
					local85 = local16.anInt5093 - local31 * 64 >> 7;
					local183 = local16.method4097() + local85;
					local190 = local90 + local16.method4097();
					if (local85 < 0) {
						local85 = 0;
					}
					if (local183 > 104) {
						local183 = 104;
					}
					if (local90 < 0) {
						local90 = 0;
					}
					if (local190 > 104) {
						local190 = 104;
					}
					for (local214 = local85; local214 < local183; local214++) {
						for (local223 = local90; local223 < local190; local223++) {
							local110 = Static156.anIntArrayArray49[local214][local223]++;
						}
					}
				}
			}
		}
		label216: for (@Pc(258) int local258 = 0; local258 < Static71.anInt1550; local258++) {
			@Pc(271) Class36_Sub3_Sub1 local271 = Static201.aClass36_Sub3_Sub1Array1[Static9.anIntArray12[local258]];
			@Pc(280) long local280 = (long) Static9.anIntArray12[local258] << 32 | 0x20000000L;
			if (local271 != null && local271.method4099() && local271.aClass33_1.method711()) {
				local183 = local271.method4097();
				if (arg1) {
					if (!local271.aClass33_1.aBoolean65) {
						continue;
					}
				} else if (arg0 != local271.aClass33_1.aBoolean67 || arg2 != 0 && arg2 != local183) {
					continue;
				}
				local271.aBoolean420 = true;
				if (local183 == 1) {
					if ((local271.anInt5093 & 0x7F) == 64 && (local271.anInt5109 & 0x7F) == 64) {
						local190 = local271.anInt5093 >> 7;
						local214 = local271.anInt5109 >> 7;
						if (local190 < 0 || local190 >= 104 || local214 < 0 || local214 >= 104) {
							continue;
						}
						if (Static156.anIntArrayArray49[local190][local214] > 1) {
							local110 = Static156.anIntArrayArray49[local190][local214]--;
							continue;
						}
					}
				} else if ((local183 & 0x1) == 0 && (local271.anInt5093 & 0x7F) == 0 && (local271.anInt5109 & 0x7F) == 0 || (local183 & 0x1) == 1 && (local271.anInt5093 & 0x7F) == 64 && (local271.anInt5109 & 0x7F) == 64) {
					local190 = local271.anInt5093 - local183 * 64 >> 7;
					local223 = local183 + local190;
					if (local190 < 0) {
						local190 = 0;
					}
					local214 = local271.anInt5109 - local183 * 64 >> 7;
					@Pc(400) int local400 = local214 + local183;
					if (local400 > 104) {
						local400 = 104;
					}
					if (local223 > 104) {
						local223 = 104;
					}
					if (local214 < 0) {
						local214 = 0;
					}
					@Pc(423) boolean local423 = true;
					@Pc(425) int local425;
					@Pc(430) int local430;
					for (local425 = local190; local425 < local223; local425++) {
						for (local430 = local214; local430 < local400; local430++) {
							if (Static156.anIntArrayArray49[local425][local430] <= 1) {
								local423 = false;
								break;
							}
						}
					}
					if (local423) {
						local425 = local190;
						while (true) {
							if (local223 <= local425) {
								continue label216;
							}
							for (local430 = local214; local430 < local400; local430++) {
								local110 = Static156.anIntArrayArray49[local425][local430]--;
							}
							local425++;
						}
					}
				}
				local271.aBoolean420 = false;
				if (!local271.aClass33_1.aBoolean64) {
					local280 |= Long.MIN_VALUE;
				}
				local271.anInt5110 = Static99.method1894(Static208.anInt4335, local271.anInt5109, local271.anInt5093);
				Static34.method1661(Static208.anInt4335, local271.anInt5093, local271.anInt5109, local271.anInt5110, (local183 - 1) * 64 + 60, local271, local271.anInt5069, local280, local271.aBoolean421);
			}
		}
	}
}
