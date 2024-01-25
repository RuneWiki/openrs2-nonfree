import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
	public static int anInt10310;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString140 = "";

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
	public static void method8698() {
		@Pc(7) Class114 local7 = null;
		try {
			@Pc(13) Class103 local13 = Static569.aClass380_6.method8822("");
			while (local13.anInt2541 == 0) {
				Static520.method7923(1L);
			}
			if (local13.anInt2541 == 1) {
				local7 = (Class114) local13.anObject9;
				@Pc(33) Class6_Sub23 local33 = Static96.aClass6_Sub22_7.method2363();
				local7.method2457(0, local33.anInt9901, local33.aByteArray101);
			}
		} catch (@Pc(43) Exception local43) {
		}
		try {
			if (local7 != null) {
				local7.method2462();
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V")
	public static void method8700() {
		Static609.method8408();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static83.aClass324Array1[local8].method7775();
		}
		Static187.method2662();
		Static274.method4045();
		Static165.method2355();
		System.gc();
		Static546.aClass132_13.ya();
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V")
	public static void method8701(@OriginalArg(0) int arg0) {
		Static504.anInt8475 = arg0;
		Static35.aClass10_1.method375();
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLclient!lp;)Lclient!lp;")
	public static Class6_Sub8_Sub4 method8702(@OriginalArg(1) Class6_Sub8_Sub4 arg0) {
		@Pc(14) Class6_Sub8_Sub4 local14 = arg0 == null ? new Class6_Sub8_Sub4() : new Class6_Sub8_Sub4(arg0);
		local14.method5099();
		return local14;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lclient!ha;BLclient!vs;I)V")
	public static void method8703(@OriginalArg(0) Class132 arg0, @OriginalArg(2) Class379 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17;
		if (Static313.anIntArray314 != null && arg2 <= arg1.aByte146) {
			for (local17 = 0; local17 < Static313.anIntArray314.length; local17++) {
				if (Static313.anIntArray314[local17] != -1000000 && (Static313.anIntArray314[local17] >= arg1.anIntArray696[0] || Static313.anIntArray314[local17] >= arg1.anIntArray696[1] || arg1.anIntArray696[2] <= Static313.anIntArray314[local17] || Static313.anIntArray314[local17] >= arg1.anIntArray696[3]) && (arg1.anIntArray697[0] <= Static598.anIntArray651[local17] || arg1.anIntArray697[1] <= Static598.anIntArray651[local17] || Static598.anIntArray651[local17] >= arg1.anIntArray697[2] || Static598.anIntArray651[local17] >= arg1.anIntArray697[3]) && (Static48.anIntArray60[local17] <= arg1.anIntArray697[0] || arg1.anIntArray697[1] >= Static48.anIntArray60[local17] || Static48.anIntArray60[local17] <= arg1.anIntArray697[2] || Static48.anIntArray60[local17] <= arg1.anIntArray697[3]) && (Static298.anIntArray287[local17] >= arg1.anIntArray695[0] || arg1.anIntArray695[1] <= Static298.anIntArray287[local17] || arg1.anIntArray695[2] <= Static298.anIntArray287[local17] || Static298.anIntArray287[local17] >= arg1.anIntArray695[3]) && (Static548.anIntArray622[local17] <= arg1.anIntArray695[0] || arg1.anIntArray695[1] >= Static548.anIntArray622[local17] || arg1.anIntArray695[2] >= Static548.anIntArray622[local17] || Static548.anIntArray622[local17] <= arg1.anIntArray695[3])) {
					return;
				}
			}
		}
		@Pc(270) int local270;
		@Pc(295) int local295;
		@Pc(311) boolean local311;
		@Pc(339) float local339;
		if (arg1.aByte145 == 1) {
			local17 = Static514.anInt8546 + arg1.aShort128 - Static608.anInt9872;
			if (local17 >= 0 && local17 <= Static514.anInt8546 + Static514.anInt8546) {
				local270 = Static514.anInt8546 + arg1.aShort125 - Static370.anInt6309;
				if (local270 < 0) {
					local270 = 0;
				} else if (Static514.anInt8546 + Static514.anInt8546 < local270) {
					return;
				}
				local295 = arg1.aShort126 + Static514.anInt8546 - Static370.anInt6309;
				if (local295 > Static514.anInt8546 + Static514.anInt8546) {
					local295 = Static514.anInt8546 + Static514.anInt8546;
				} else if (local295 < 0) {
					return;
				}
				local311 = false;
				while (local295 >= local270) {
					if (Static443.aBooleanArrayArray8[local17][local270++]) {
						local311 = true;
						break;
					}
				}
				if (local311) {
					local339 = (float) (Static136.anInt2381 - arg1.anIntArray697[0]);
					if (local339 < 0.0F) {
						local339 *= -1.0F;
					}
					if (!(float) Static373.anInt6316 > local339 && (Static427.method6317(arg1, 0) && (Static427.method6317(arg1, 1) && (Static427.method6317(arg1, 2) && Static427.method6317(arg1, 3))))) {
						Static121.aClass379Array1[Static485.anInt8287++] = arg1;
					}
				}
			}
		} else if (arg1.aByte145 == 2) {
			local17 = arg1.aShort125 + Static514.anInt8546 - Static370.anInt6309;
			if (local17 >= 0 && local17 <= Static514.anInt8546 + Static514.anInt8546) {
				local270 = arg1.aShort128 + Static514.anInt8546 - Static608.anInt9872;
				if (local270 < 0) {
					local270 = 0;
				} else if (Static514.anInt8546 + Static514.anInt8546 < local270) {
					return;
				}
				local295 = arg1.aShort127 + Static514.anInt8546 - Static608.anInt9872;
				if (local295 > Static514.anInt8546 + Static514.anInt8546) {
					local295 = Static514.anInt8546 + Static514.anInt8546;
				} else if (local295 < 0) {
					return;
				}
				local311 = false;
				while (local295 >= local270) {
					if (Static443.aBooleanArrayArray8[local270++][local17]) {
						local311 = true;
						break;
					}
				}
				if (local311) {
					local339 = (float) (Static375.anInt6326 - arg1.anIntArray695[0]);
					if (local339 < 0.0F) {
						local339 *= -1.0F;
					}
					if (!(local339 < (float) Static373.anInt6316) && (Static427.method6317(arg1, 0) && (Static427.method6317(arg1, 1) && (Static427.method6317(arg1, 2) && Static427.method6317(arg1, 3))))) {
						Static121.aClass379Array1[Static485.anInt8287++] = arg1;
					}
				}
			}
		} else if (arg1.aByte145 == 16 || arg1.aByte145 == 8) {
			local17 = Static514.anInt8546 + arg1.aShort128 - Static608.anInt9872;
			if (local17 >= 0 && Static514.anInt8546 + Static514.anInt8546 >= local17) {
				local270 = Static514.anInt8546 + arg1.aShort125 - Static370.anInt6309;
				if (local270 >= 0 && Static514.anInt8546 + Static514.anInt8546 >= local270 && Static443.aBooleanArrayArray8[local17][local270]) {
					@Pc(608) float local608 = (float) (Static136.anInt2381 - arg1.anIntArray697[0]);
					if (local608 < 0.0F) {
						local608 *= -1.0F;
					}
					@Pc(625) float local625 = (float) (Static375.anInt6326 - arg1.anIntArray695[0]);
					if (local625 < 0.0F) {
						local625 *= -1.0F;
					}
					if ((!(local608 < (float) Static373.anInt6316) || !((float) Static373.anInt6316 > local625)) && (Static427.method6317(arg1, 0) && (Static427.method6317(arg1, 1) && (Static427.method6317(arg1, 2) && Static427.method6317(arg1, 3))))) {
						Static121.aClass379Array1[Static485.anInt8287++] = arg1;
					}
				}
			}
		} else if (arg1.aByte145 == 4) {
			@Pc(691) float local691 = (float) (arg1.anIntArray696[0] - Static283.anInt4842);
			if (!((float) Static218.anInt3724 >= local691)) {
				local270 = Static514.anInt8546 + arg1.aShort125 - Static370.anInt6309;
				if (local270 < 0) {
					local270 = 0;
				} else if (local270 > Static514.anInt8546 + Static514.anInt8546) {
					return;
				}
				local295 = arg1.aShort126 + Static514.anInt8546 - Static370.anInt6309;
				if (Static514.anInt8546 + Static514.anInt8546 < local295) {
					local295 = Static514.anInt8546 + Static514.anInt8546;
				} else if (local295 < 0) {
					return;
				}
				@Pc(748) int local748 = arg1.aShort128 + Static514.anInt8546 - Static608.anInt9872;
				if (local748 < 0) {
					local748 = 0;
				} else if (Static514.anInt8546 + Static514.anInt8546 < local748) {
					return;
				}
				@Pc(775) int local775 = Static514.anInt8546 + arg1.aShort127 - Static608.anInt9872;
				if (local775 > Static514.anInt8546 + Static514.anInt8546) {
					local775 = Static514.anInt8546 + Static514.anInt8546;
				} else if (local775 < 0) {
					return;
				}
				@Pc(794) boolean local794 = false;
				label283: for (@Pc(796) int local796 = local748; local796 <= local775; local796++) {
					for (@Pc(800) int local800 = local270; local800 <= local295; local800++) {
						if (Static443.aBooleanArrayArray8[local796][local800]) {
							local794 = true;
							break label283;
						}
					}
				}
				if (local794 && (Static427.method6317(arg1, 0) && (Static427.method6317(arg1, 1) && (Static427.method6317(arg1, 2) && Static427.method6317(arg1, 3))))) {
					Static121.aClass379Array1[Static485.anInt8287++] = arg1;
				}
			}
		}
	}
}
