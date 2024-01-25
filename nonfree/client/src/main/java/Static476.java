import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
	public static int anInt7745 = 0;

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "(I)V")
	public static void method6741() {
		@Pc(9) int local9 = Static239.anInt4140 * 512 + 256;
		@Pc(15) int local15 = Static352.anInt5799 * 512 + 256;
		@Pc(23) int local23 = Static461.method6500(local9, Static324.anInt5529, local15) - Static28.anInt374;
		if (Static119.anInt1943 < 100) {
			if (Static141.anInt2764 < local9) {
				Static141.anInt2764 += Static304.anInt5289 + Static119.anInt1943 * (local9 - Static141.anInt2764) / 1000;
				if (Static141.anInt2764 > local9) {
					Static141.anInt2764 = local9;
				}
			}
			if (Static42.anInt703 < local23) {
				Static42.anInt703 += Static304.anInt5289 + (local23 - Static42.anInt703) * Static119.anInt1943 / 1000;
				if (Static42.anInt703 > local23) {
					Static42.anInt703 = local23;
				}
			}
			if (Static141.anInt2764 > local9) {
				Static141.anInt2764 -= Static119.anInt1943 * (Static141.anInt2764 - local9) / 1000 + Static304.anInt5289;
				if (local9 > Static141.anInt2764) {
					Static141.anInt2764 = local9;
				}
			}
			if (Static42.anInt703 > local23) {
				Static42.anInt703 -= Static304.anInt5289 + Static119.anInt1943 * (Static42.anInt703 - local23) / 1000;
				if (local23 > Static42.anInt703) {
					Static42.anInt703 = local23;
				}
			}
			if (local15 > Static282.anInt5025) {
				Static282.anInt5025 += Static304.anInt5289 + Static119.anInt1943 * (local15 - Static282.anInt5025) / 1000;
				if (local15 < Static282.anInt5025) {
					Static282.anInt5025 = local15;
				}
			}
			if (Static282.anInt5025 > local15) {
				Static282.anInt5025 -= Static119.anInt1943 * (Static282.anInt5025 - local15) / 1000 + Static304.anInt5289;
				if (local15 > Static282.anInt5025) {
					Static282.anInt5025 = local15;
				}
			}
		} else {
			Static282.anInt5025 = Static352.anInt5799 * 512 + 256;
			Static141.anInt2764 = Static239.anInt4140 * 512 + 256;
			Static42.anInt703 = Static461.method6500(Static141.anInt2764, Static324.anInt5529, Static282.anInt5025) - Static28.anInt374;
		}
		local9 = Static282.anInt5028 * 512 + 256;
		local15 = Static578.anInt9023 * 512 + 256;
		local23 = Static461.method6500(local9, Static324.anInt5529, local15) - Static469.anInt7626;
		@Pc(256) int local256 = local9 - Static141.anInt2764;
		@Pc(261) int local261 = local23 - Static42.anInt703;
		@Pc(265) int local265 = local15 - Static282.anInt5025;
		@Pc(277) int local277 = (int) Math.sqrt((double) (local256 * local256 + local265 * local265));
		@Pc(288) int local288 = (int) (Math.atan2((double) local261, (double) local277) * 2607.5945876176133D) & 0x3FFF;
		@Pc(299) int local299 = (int) (Math.atan2((double) local256, (double) local265) * -2607.5945876176133D) & 0x3FFF;
		if (local288 < 1024) {
			local288 = 1024;
		}
		if (local288 > 3072) {
			local288 = 3072;
		}
		if (Static96.anInt10862 < local288) {
			Static96.anInt10862 += (local288 - Static96.anInt10862 >> 3) * Static177.anInt3350 / 1000 + Static134.anInt2209 << 3;
			if (local288 < Static96.anInt10862) {
				Static96.anInt10862 = local288;
			}
		}
		if (Static96.anInt10862 > local288) {
			Static96.anInt10862 -= Static177.anInt3350 * (Static96.anInt10862 - local288 >> 3) / 1000 + Static134.anInt2209 << 3;
			if (Static96.anInt10862 < local288) {
				Static96.anInt10862 = local288;
			}
		}
		@Pc(381) int local381 = local299 - Static542.anInt8612;
		if (local381 > 8192) {
			local381 -= 16384;
		}
		if (local381 < -8192) {
			local381 += 16384;
		}
		local381 >>= 0x3;
		if (local381 > 0) {
			Static542.anInt8612 += Static134.anInt2209 + Static177.anInt3350 * local381 / 1000 << 3;
			Static542.anInt8612 &= 0x3FFF;
		}
		if (local381 < 0) {
			Static542.anInt8612 -= -local381 * Static177.anInt3350 / 1000 + Static134.anInt2209 << 3;
			Static542.anInt8612 &= 0x3FFF;
		}
		@Pc(448) int local448 = local299 - Static542.anInt8612;
		if (local448 > 8192) {
			local448 -= 16384;
		}
		if (local448 < -8192) {
			local448 += 16384;
		}
		if (local448 < 0 && local381 > 0 || local448 > 0 && local381 < 0) {
			Static542.anInt8612 = local299;
		}
		Static331.anInt5582 = 0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIILclient!ha;Lclient!rfa;Lclient!sg;)Z")
	public static boolean method6742(@OriginalArg(3) Class100 arg0, @OriginalArg(4) Class313 arg1, @OriginalArg(5) Class5_Sub49 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray472 != null) {
			local11 = Static491.anInt628 - (Static491.anInt628 - Static491.anInt627) * (arg2.anInt8670 + (arg1.anInt8197 - Static491.anInt623)) / (Static491.anInt625 - Static491.anInt623);
			local13 = Static491.anInt628 - (Static491.anInt628 - Static491.anInt627) * (arg2.anInt8670 + arg1.anInt8171 + -Static491.anInt623) / (Static491.anInt625 - Static491.anInt623);
			local9 = (arg1.anInt8200 + arg2.anInt8671 - Static491.anInt618) * (Static491.anInt621 - Static491.anInt620) / (Static491.anInt626 - Static491.anInt618) + Static491.anInt620;
			local7 = Static491.anInt620 + (Static491.anInt621 - Static491.anInt620) * (-Static491.anInt618 + (arg1.anInt8201 - -arg2.anInt8671)) / (Static491.anInt626 - Static491.anInt618);
		}
		@Pc(102) Class155 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg1.anInt8179 != -1) {
			if (arg2.aBoolean571 && arg1.anInt8172 != -1) {
				local102 = arg1.method7063(true, arg0);
			} else {
				local102 = arg1.method7063(false, arg0);
			}
			if (local102 != null) {
				local104 = arg2.anInt8672 - (local102.method7206() + 1 >> 1);
				if (local7 > local104) {
					local7 = local104;
				}
				local106 = arg2.anInt8672 + (local102.method7206() + 1 >> 1);
				if (local106 > local9) {
					local9 = local106;
				}
				local108 = arg2.anInt8673 - (local102.method7209() + 1 >> 1);
				if (local108 < local11) {
					local11 = local108;
				}
				local110 = arg2.anInt8673 + (local102.method7209() + 1 >> 1);
				if (local13 < local110) {
					local13 = local110;
				}
			}
		}
		@Pc(214) Class371 local214 = null;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(234) int local234 = 0;
		@Pc(236) int local236 = 0;
		@Pc(318) int local318;
		if (arg1.aString93 != null) {
			local214 = Static555.method7517(arg1.anInt8192);
			if (local214 != null) {
				local222 = Static511.aClass196_36.method4565(Static20.aStringArray4, arg1.aString93, (Class155[]) null, (int[]) null);
				local226 = arg2.anInt8673 - (Static491.anInt628 - Static491.anInt627) * arg1.anInt8198 / (Static491.anInt625 - Static491.anInt623);
				local224 = arg2.anInt8672 + arg1.anInt8183 * (Static491.anInt621 - Static491.anInt620) / (Static491.anInt626 - Static491.anInt618);
				if (local102 == null) {
					local226 -= local214.method8488() * local222 / 2;
				} else {
					local226 -= (local102.method7209() >> 1) + local214.method8490() * local222;
				}
				for (local318 = 0; local318 < local222; local318++) {
					@Pc(324) String local324 = Static20.aStringArray4[local318];
					if (local222 - 1 > local318) {
						local324 = local324.substring(0, local324.length() - 4);
					}
					@Pc(345) int local345 = local214.method8491(local324);
					if (local228 < local345) {
						local228 = local345;
					}
				}
				local230 = local224 - local228 / 2;
				if (local7 > local230) {
					local7 = local230;
				}
				local232 = local224 + local228 / 2;
				local234 = local226;
				if (local232 > local9) {
					local9 = local232;
				}
				if (local11 > local234) {
					local11 = local234;
				}
				local236 = local226 + local222 * local214.method8490();
				if (local13 < local236) {
					local13 = local236;
				}
			}
		}
		if (local9 < Static491.anInt620 || local7 > Static491.anInt621 || Static491.anInt627 > local13 || local11 > Static491.anInt628) {
			return true;
		}
		Static491.method666(arg0, arg2, arg1);
		if (local102 != null) {
			if (Static396.anInt6671 > 0 && (Static557.anInt8788 != -1 && arg2.anInt8675 == Static557.anInt8788 || Static284.anInt5035 != -1 && Static284.anInt5035 == arg1.anInt8176)) {
				if (Static81.anInt1432 > 50) {
					local318 = 200 - Static81.anInt1432 * 2;
				} else {
					local318 = Static81.anInt1432 * 2;
				}
				@Pc(514) int local514 = local318 << 24 | 0xFFFF00;
				arg0.method8617(arg2.anInt8672, local514, local102.method7213() / 2 + 7, arg2.anInt8673);
				arg0.method8617(arg2.anInt8672, local514, local102.method7213() / 2 + 5, arg2.anInt8673);
				arg0.method8617(arg2.anInt8672, local514, local102.method7213() / 2 + 3, arg2.anInt8673);
				arg0.method8617(arg2.anInt8672, local514, local102.method7213() / 2 + 1, arg2.anInt8673);
				arg0.method8617(arg2.anInt8672, local514, local102.method7213() / 2, arg2.anInt8673);
			}
			local102.method7202(arg2.anInt8672 - (local102.method7206() >> 1), arg2.anInt8673 + -(local102.method7209() >> 1));
		}
		if (arg1.aString93 != null && local214 != null) {
			Static243.method3849(arg1, local222, arg2, arg0, local214, local226, local224, local228);
		}
		if (arg1.anInt8179 != -1 || arg1.aString93 != null) {
			@Pc(634) Class5_Sub52 local634 = new Class5_Sub52(arg2);
			local634.anInt10419 = local232;
			local634.anInt10414 = local104;
			local634.anInt10415 = local106;
			local634.anInt10411 = local230;
			local634.anInt10416 = local108;
			local634.anInt10420 = local234;
			local634.anInt10412 = local110;
			local634.anInt10417 = local236;
			Static542.aClass20_47.method370(local634);
		}
		return false;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IC)C")
	public static char method6743(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
