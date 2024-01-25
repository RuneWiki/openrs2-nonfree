import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "[I")
	public static int[] anIntArray335 = new int[2];

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "Lclient!cm;")
	public static final Class52 aClass52_103 = new Class52();

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
	public static int anInt7080 = 0;

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(B)V")
	public static void method5918() {
		if (!Static199.aBoolean358) {
			Static437.aBoolean633 = Static35.anInt885 != -1 && Static35.anInt885 <= Static611.anInt10324 || Static277.anInt5899 < Static611.anInt10324 * 16 + (Static319.aBoolean495 ? 26 : 22);
		}
		Static57.aClass163_13.method4970();
		Static400.aClass163_46.method4970();
		@Pc(56) int local56;
		for (@Pc(51) Class6_Sub5_Sub9 local51 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local51 != null; local51 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
			local56 = local51.anInt3240;
			if (local56 < 1000) {
				local51.method8792();
				if (local56 == 46 || local56 == 50 || local56 == 48 || local56 == 58 || local56 == 5 || local56 == 57 || local56 == 59) {
					Static400.aClass163_46.method4967(local51);
				} else {
					Static57.aClass163_13.method4967(local51);
				}
			}
		}
		Static57.aClass163_13.method4973(Static68.aClass163_14);
		Static400.aClass163_46.method4973(Static68.aClass163_14);
		if (Static611.anInt10324 <= 1) {
			Static469.aClass6_Sub5_Sub9_2 = null;
			Static356.aClass6_Sub5_Sub9_1 = null;
		} else {
			if (Static198.aBoolean343 && Static391.aClass91_1.method6224(81) && Static611.anInt10324 > 2) {
				Static469.aClass6_Sub5_Sub9_2 = (Class6_Sub5_Sub9) Static68.aClass163_14.aClass6_178.aClass6_299.aClass6_299;
			} else {
				Static469.aClass6_Sub5_Sub9_2 = (Class6_Sub5_Sub9) Static68.aClass163_14.aClass6_178.aClass6_299;
			}
			Static356.aClass6_Sub5_Sub9_1 = (Class6_Sub5_Sub9) Static68.aClass163_14.aClass6_178.aClass6_299;
		}
		local56 = -1;
		@Pc(171) Class6_Sub22 local171 = (Class6_Sub22) Static313.aClass163_35.method4966();
		if (local171 != null) {
			local56 = local171.method3463();
		}
		if (!Static199.aBoolean358) {
			if (local56 == 0 && (Static358.anInt6951 == 1 && Static611.anInt10324 > 2 || Static135.method2721())) {
				local56 = 2;
			}
			if (local56 == 2 && Static611.anInt10324 > 0 && local171 != null) {
				if (Static448.aClass302_13 == null && Static517.anInt9024 == 0) {
					Static38.method1336(local171.method3458(), local171.method3462());
				} else {
					Static632.anInt10598 = 2;
				}
			}
			if (local56 == 0) {
				if (Static469.aClass6_Sub5_Sub9_2 != null) {
					Static413.method6487();
				} else if (Static141.aBoolean262) {
					Static516.method7391();
				}
			}
			if (Static448.aClass302_13 == null && Static517.anInt9024 == 0) {
				Static592.aClass6_Sub5_Sub9_4 = null;
				Static632.anInt10598 = 0;
			}
			return;
		}
		@Pc(258) int local258;
		@Pc(262) int local262;
		@Pc(345) int local345;
		@Pc(347) int local347;
		if (local56 == -1) {
			local258 = Static6.aClass96_1.method8026();
			local262 = Static6.aClass96_1.method8019();
			@Pc(264) boolean local264 = false;
			if (Static535.aClass6_Sub5_Sub11_1 != null) {
				if (Static497.anInt8646 - 10 <= local258 && Static497.anInt8646 + Static9.anInt525 + 10 >= local258 && Static303.anInt6146 - 10 <= local262 && local262 <= Static303.anInt6146 + Static626.anInt10528 + 10) {
					local264 = true;
				} else {
					Static577.method5573();
				}
			}
			if (!local264) {
				if (Static76.anInt2536 - 10 > local258 || local258 > Static76.anInt2536 + Static498.anInt8705 + 10 || Static189.anInt4113 - 10 > local262 || local262 > Static30.anInt820 + Static189.anInt4113 + 10) {
					Static549.method8087();
				} else if (Static437.aBoolean633) {
					local345 = -1;
					local347 = -1;
					@Pc(362) int local362;
					for (@Pc(349) int local349 = 0; local349 < Static223.anInt5025; local349++) {
						if (Static319.aBoolean495) {
							local362 = Static189.anInt4113 + local349 * 16 + 33;
							if (local262 > local362 - 13 && local262 < local362 + 4) {
								local347 = local362 - 13;
								local345 = local349;
								break;
							}
						} else {
							local362 = Static189.anInt4113 + local349 * 16 + 31;
							if (local262 > local362 - 13 && local262 < local362 + 3) {
								local345 = local349;
								local347 = local362 - 13;
								break;
							}
						}
					}
					if (local345 != -1) {
						local362 = 0;
						@Pc(433) Class266 local433 = new Class266(Static224.aClass231_5);
						for (@Pc(438) Class6_Sub5_Sub11 local438 = (Class6_Sub5_Sub11) local433.method6762(); local438 != null; local438 = (Class6_Sub5_Sub11) local433.method6763()) {
							if (local345 == local362) {
								if (local438.anInt3423 > 1) {
									Static408.method6423(local347, local438, local262);
								}
								break;
							}
							local362++;
						}
					}
				}
			}
		}
		if (local56 != 0) {
			return;
		}
		local258 = local171.method3462();
		local262 = local171.method3458();
		@Pc(500) int local500;
		@Pc(578) Class266 local578;
		@Pc(583) Class6_Sub5_Sub9 local583;
		if (Static535.aClass6_Sub5_Sub11_1 != null && Static497.anInt8646 <= local258 && local258 <= Static9.anInt525 + Static497.anInt8646 && Static303.anInt6146 <= local262 && Static303.anInt6146 + Static626.anInt10528 >= local262) {
			local500 = -1;
			for (local345 = 0; local345 < Static535.aClass6_Sub5_Sub11_1.anInt3423; local345++) {
				if (Static319.aBoolean495) {
					local347 = local345 * 16 + Static303.anInt6146 + 33;
					if (local347 - 13 < local262 && local347 + 4 > local262) {
						local500 = local345;
					}
				} else {
					local347 = Static303.anInt6146 + local345 * 16 + 31;
					if (local262 > local347 - 13 && local347 + 3 > local262) {
						local500 = local345;
					}
				}
			}
			if (local500 != -1) {
				local347 = 0;
				local578 = new Class266(Static535.aClass6_Sub5_Sub11_1.aClass231_2);
				for (local583 = (Class6_Sub5_Sub9) local578.method6762(); local583 != null; local583 = (Class6_Sub5_Sub9) local578.method6763()) {
					if (local500 == local347) {
						Static533.method7562(local262, local258, local583);
						break;
					}
					local347++;
				}
			}
			Static549.method8087();
			return;
		}
		if (local258 < Static76.anInt2536 || local258 > Static498.anInt8705 + Static76.anInt2536 || local262 < Static189.anInt4113 || local262 > Static189.anInt4113 + Static30.anInt820) {
			return;
		}
		if (!Static437.aBoolean633) {
			local500 = -1;
			for (local345 = 0; local345 < Static611.anInt10324; local345++) {
				if (Static319.aBoolean495) {
					local347 = (Static611.anInt10324 - local345 - 1) * 16 + Static189.anInt4113 + 33;
					if (local262 > local347 - 13 && local262 < local347 + 4) {
						local500 = local345;
					}
				} else {
					local347 = (Static611.anInt10324 - local345 - 1) * 16 + Static189.anInt4113 + 31;
					if (local262 > local347 - 13 && local262 < local347 + 3) {
						local500 = local345;
					}
				}
			}
			if (local500 != -1) {
				local347 = 0;
				@Pc(715) Class171 local715 = new Class171(Static68.aClass163_14);
				for (local583 = (Class6_Sub5_Sub9) local715.method5092(); local583 != null; local583 = (Class6_Sub5_Sub9) local715.method5091()) {
					if (local500 == local347) {
						Static533.method7562(local262, local258, local583);
						break;
					}
					local347++;
				}
			}
			Static549.method8087();
			return;
		}
		local500 = -1;
		for (local345 = 0; local345 < Static223.anInt5025; local345++) {
			if (Static319.aBoolean495) {
				local347 = Static189.anInt4113 + local345 * 16 + 33;
				if (local262 > local347 - 13 && local262 < local347 + 4) {
					local500 = local345;
					break;
				}
			} else {
				local347 = Static189.anInt4113 + local345 * 16 + 31;
				if (local347 - 13 < local262 && local262 < local347 + 3) {
					local500 = local345;
					break;
				}
			}
		}
		if (local500 == -1) {
			return;
		}
		local347 = 0;
		local578 = new Class266(Static224.aClass231_5);
		for (@Pc(823) Class6_Sub5_Sub11 local823 = (Class6_Sub5_Sub11) local578.method6762(); local823 != null; local823 = (Class6_Sub5_Sub11) local578.method6763()) {
			if (local500 == local347) {
				Static533.method7562(local262, local258, (Class6_Sub5_Sub9) local823.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66);
				Static549.method8087();
				return;
			}
			local347++;
		}
		return;
	}
}
