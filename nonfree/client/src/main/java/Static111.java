import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "J")
	public static long aLong57;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2282(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.length();
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(22) char local22 = arg0.charAt(local16);
			if (local22 <= '\u007f') {
				local14++;
			} else if (local22 > '\u07ff') {
				local14 += 3;
			} else {
				local14 += 2;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIBIII)V")
	public static void method2283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg4 - arg3;
		@Pc(14) int local14 = arg0 + arg3;
		for (@Pc(16) int local16 = arg0; local16 < local14; local16++) {
			Static115.method2332(arg1, arg6, arg5, Static183.anIntArrayArray26[local16]);
		}
		@Pc(39) int local39 = arg6 - arg3;
		@Pc(51) int local51 = arg3 + arg1;
		for (@Pc(53) int local53 = arg4; local53 > local10; local53--) {
			Static115.method2332(arg1, arg6, arg5, Static183.anIntArrayArray26[local53]);
		}
		for (@Pc(69) int local69 = local14; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static183.anIntArrayArray26[local69];
			Static115.method2332(arg1, local51, arg5, local75);
			Static115.method2332(local51, local39, arg2, local75);
			Static115.method2332(local39, arg6, arg5, local75);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "()V")
	public static void method2284() {
		Static279.anInt5384 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static499.anInt8899; local3++) {
			@Pc(8) Class350 local8 = Static456.aClass350Array2[local3];
			@Pc(12) int local12;
			if (Static400.anIntArray530 != null) {
				for (local12 = 0; local12 < Static400.anIntArray530.length; local12++) {
					if (Static400.anIntArray530[local12] != -1000000 && (local8.anInt9831 <= Static400.anIntArray530[local12] || local8.anInt9832 <= Static400.anIntArray530[local12]) && (local8.anInt9835 <= Static393.anIntArray519[local12] || local8.anInt9834 <= Static393.anIntArray519[local12]) && (local8.anInt9835 >= Static384.anIntArray506[local12] || local8.anInt9834 >= Static384.anIntArray506[local12]) && (local8.anInt9837 <= Static22.anIntArray59[local12] || local8.anInt9836 <= Static22.anIntArray59[local12]) && (local8.anInt9837 >= Static538.anIntArray807[local12] || local8.anInt9836 >= Static538.anIntArray807[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt9840 == 1) {
				local12 = local8.anInt9827 + Static203.anInt4358 - Static579.anInt7897;
				if (local12 >= 0 && local12 <= Static203.anInt4358 + Static203.anInt4358) {
					local110 = local8.anInt9821 + Static203.anInt4358 - Static266.anInt4817;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static203.anInt4358 + Static203.anInt4358) {
						continue;
					}
					local128 = local8.anInt9828 + Static203.anInt4358 - Static266.anInt4817;
					if (local128 > Static203.anInt4358 + Static203.anInt4358) {
						local128 = Static203.anInt4358 + Static203.anInt4358;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static487.aBooleanArrayArray9[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static279.anInt5385 - local8.anInt9835;
						if (local164 > Static581.anInt9823) {
							local8.anInt9833 = 1;
						} else {
							if (local164 >= -Static581.anInt9823) {
								continue;
							}
							local8.anInt9833 = 2;
							local164 = -local164;
						}
						local8.anInt9830 = (local8.anInt9837 - Static325.anInt6147 << 8) / local164;
						local8.anInt9820 = (local8.anInt9836 - Static325.anInt6147 << 8) / local164;
						local8.anInt9829 = (local8.anInt9831 - Static561.anInt2407 << 8) / local164;
						local8.anInt9822 = (local8.anInt9832 - Static561.anInt2407 << 8) / local164;
						Static346.aClass350Array1[Static279.anInt5384++] = local8;
					}
				}
			} else if (local8.anInt9840 == 2) {
				local12 = local8.anInt9821 + Static203.anInt4358 - Static266.anInt4817;
				if (local12 >= 0 && local12 <= Static203.anInt4358 + Static203.anInt4358) {
					local110 = local8.anInt9827 + Static203.anInt4358 - Static579.anInt7897;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static203.anInt4358 + Static203.anInt4358) {
						continue;
					}
					local128 = local8.anInt9838 + Static203.anInt4358 - Static579.anInt7897;
					if (local128 > Static203.anInt4358 + Static203.anInt4358) {
						local128 = Static203.anInt4358 + Static203.anInt4358;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static487.aBooleanArrayArray9[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static325.anInt6147 - local8.anInt9837;
						if (local164 > Static581.anInt9823) {
							local8.anInt9833 = 3;
						} else {
							if (local164 >= -Static581.anInt9823) {
								continue;
							}
							local8.anInt9833 = 4;
							local164 = -local164;
						}
						local8.anInt9819 = (local8.anInt9835 - Static279.anInt5385 << 8) / local164;
						local8.anInt9826 = (local8.anInt9834 - Static279.anInt5385 << 8) / local164;
						local8.anInt9829 = (local8.anInt9831 - Static561.anInt2407 << 8) / local164;
						local8.anInt9822 = (local8.anInt9832 - Static561.anInt2407 << 8) / local164;
						Static346.aClass350Array1[Static279.anInt5384++] = local8;
					}
				}
			} else if (local8.anInt9840 == 4) {
				local12 = local8.anInt9831 - Static561.anInt2407;
				if (local12 > Static107.anInt2436) {
					local110 = local8.anInt9821 + Static203.anInt4358 - Static266.anInt4817;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static203.anInt4358 + Static203.anInt4358) {
						continue;
					}
					local128 = local8.anInt9828 + Static203.anInt4358 - Static266.anInt4817;
					if (local128 > Static203.anInt4358 + Static203.anInt4358) {
						local128 = Static203.anInt4358 + Static203.anInt4358;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt9827 + Static203.anInt4358 - Static579.anInt7897;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static203.anInt4358 + Static203.anInt4358) {
						continue;
					}
					local164 = local8.anInt9838 + Static203.anInt4358 - Static579.anInt7897;
					if (local164 > Static203.anInt4358 + Static203.anInt4358) {
						local164 = Static203.anInt4358 + Static203.anInt4358;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static487.aBooleanArrayArray9[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt9833 = 5;
						local8.anInt9819 = (local8.anInt9835 - Static279.anInt5385 << 8) / local12;
						local8.anInt9826 = (local8.anInt9834 - Static279.anInt5385 << 8) / local12;
						local8.anInt9830 = (local8.anInt9837 - Static325.anInt6147 << 8) / local12;
						local8.anInt9820 = (local8.anInt9836 - Static325.anInt6147 << 8) / local12;
						Static346.aClass350Array1[Static279.anInt5384++] = local8;
					}
				}
			}
		}
	}
}
