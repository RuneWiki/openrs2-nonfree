import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!ya", name = "o", descriptor = "I")
	public static int anInt5537;

	@OriginalMember(owner = "client!ya", name = "q", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array11;

	@OriginalMember(owner = "client!ya", name = "m", descriptor = "I")
	public static int anInt5535 = -1;

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_72 = new Class215(7, 7);

	@OriginalMember(owner = "client!ya", name = "r", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_73 = new Class215(10, 7);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!ga;ILjava/awt/Canvas;IBLclient!et;)Lclient!ya;")
	public static synchronized Class19 method4241(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class66 arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static100.aBooleanArray11[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(52) Class19 local52;
		if (arg3 == 0) {
			local52 = Static23.method302(arg2, local7, arg0);
		} else if (arg3 == 1) {
			local52 = Static278.method3941(local7, arg2, arg4, arg1, arg0);
		} else if (arg3 == 2) {
			local52 = Static386.method3234(arg2, local7, arg4, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static100.aBooleanArray11[local7] = true;
		return local52;
	}

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
	public static void method4270() {
		if (Static109.anInt6887 <= 0) {
			Static117.aString29 = "";
			return;
		}
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static102.aStringArray8.length; local21++) {
			if (Static102.aStringArray8[local21].startsWith("--> ")) {
				local19++;
				if (local19 == Static109.anInt6887) {
					Static117.aString29 = Static102.aStringArray8[local21].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ya", name = "A", descriptor = "()V")
	public static void method4292() {
		Static7.anInt5461 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static93.anInt1878; local3++) {
			@Pc(8) Class136 local8 = Static91.aClass136Array2[local3];
			@Pc(12) int local12;
			if (Static29.anIntArray34 != null) {
				for (local12 = 0; local12 < Static29.anIntArray34.length; local12++) {
					if (Static29.anIntArray34[local12] != -1000000 && (local8.anInt4368 <= Static29.anIntArray34[local12] || local8.anInt4361 <= Static29.anIntArray34[local12]) && (local8.anInt4355 <= Static85.anIntArray143[local12] || local8.anInt4370 <= Static85.anIntArray143[local12]) && (local8.anInt4355 >= Static248.anIntArray303[local12] || local8.anInt4370 >= Static248.anIntArray303[local12]) && (local8.anInt4359 <= Static64.anIntArray106[local12] || local8.anInt4356 <= Static64.anIntArray106[local12]) && (local8.anInt4359 >= Static223.anIntArray284[local12] || local8.anInt4356 >= Static223.anIntArray284[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt4360 == 1) {
				local12 = local8.anInt4365 + Static230.anInt4431 - Static431.anInt7073;
				if (local12 >= 0 && local12 <= Static230.anInt4431 + Static230.anInt4431) {
					local110 = local8.anInt4354 + Static230.anInt4431 - Static93.anInt1887;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static230.anInt4431 + Static230.anInt4431) {
						continue;
					}
					local128 = local8.anInt4357 + Static230.anInt4431 - Static93.anInt1887;
					if (local128 > Static230.anInt4431 + Static230.anInt4431) {
						local128 = Static230.anInt4431 + Static230.anInt4431;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static252.aBooleanArrayArray4[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static153.anInt3073 - local8.anInt4355;
						if (local164 > Static157.anInt3142) {
							local8.anInt4366 = 1;
						} else {
							if (local164 >= -Static157.anInt3142) {
								continue;
							}
							local8.anInt4366 = 2;
							local164 = -local164;
						}
						local8.anInt4352 = (local8.anInt4359 - Static209.anInt3921 << 8) / local164;
						local8.anInt4369 = (local8.anInt4356 - Static209.anInt3921 << 8) / local164;
						local8.anInt4367 = (local8.anInt4368 - Static220.anInt4098 << 8) / local164;
						local8.anInt4362 = (local8.anInt4361 - Static220.anInt4098 << 8) / local164;
						Static414.aClass136Array3[Static7.anInt5461++] = local8;
					}
				}
			} else if (local8.anInt4360 == 2) {
				local12 = local8.anInt4354 + Static230.anInt4431 - Static93.anInt1887;
				if (local12 >= 0 && local12 <= Static230.anInt4431 + Static230.anInt4431) {
					local110 = local8.anInt4365 + Static230.anInt4431 - Static431.anInt7073;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static230.anInt4431 + Static230.anInt4431) {
						continue;
					}
					local128 = local8.anInt4363 + Static230.anInt4431 - Static431.anInt7073;
					if (local128 > Static230.anInt4431 + Static230.anInt4431) {
						local128 = Static230.anInt4431 + Static230.anInt4431;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static252.aBooleanArrayArray4[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static209.anInt3921 - local8.anInt4359;
						if (local164 > Static157.anInt3142) {
							local8.anInt4366 = 3;
						} else {
							if (local164 >= -Static157.anInt3142) {
								continue;
							}
							local8.anInt4366 = 4;
							local164 = -local164;
						}
						local8.anInt4353 = (local8.anInt4355 - Static153.anInt3073 << 8) / local164;
						local8.anInt4358 = (local8.anInt4370 - Static153.anInt3073 << 8) / local164;
						local8.anInt4367 = (local8.anInt4368 - Static220.anInt4098 << 8) / local164;
						local8.anInt4362 = (local8.anInt4361 - Static220.anInt4098 << 8) / local164;
						Static414.aClass136Array3[Static7.anInt5461++] = local8;
					}
				}
			} else if (local8.anInt4360 == 4) {
				local12 = local8.anInt4368 - Static220.anInt4098;
				if (local12 > Static367.anInt6319) {
					local110 = local8.anInt4354 + Static230.anInt4431 - Static93.anInt1887;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static230.anInt4431 + Static230.anInt4431) {
						continue;
					}
					local128 = local8.anInt4357 + Static230.anInt4431 - Static93.anInt1887;
					if (local128 > Static230.anInt4431 + Static230.anInt4431) {
						local128 = Static230.anInt4431 + Static230.anInt4431;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt4365 + Static230.anInt4431 - Static431.anInt7073;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static230.anInt4431 + Static230.anInt4431) {
						continue;
					}
					local164 = local8.anInt4363 + Static230.anInt4431 - Static431.anInt7073;
					if (local164 > Static230.anInt4431 + Static230.anInt4431) {
						local164 = Static230.anInt4431 + Static230.anInt4431;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static252.aBooleanArrayArray4[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt4366 = 5;
						local8.anInt4353 = (local8.anInt4355 - Static153.anInt3073 << 8) / local12;
						local8.anInt4358 = (local8.anInt4370 - Static153.anInt3073 << 8) / local12;
						local8.anInt4352 = (local8.anInt4359 - Static209.anInt3921 << 8) / local12;
						local8.anInt4369 = (local8.anInt4356 - Static209.anInt3921 << 8) / local12;
						Static414.aClass136Array3[Static7.anInt5461++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIB)Z")
	public static boolean method4305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg7 + arg4 > arg6 && arg2 + arg6 > arg7) {
			return arg1 + arg3 > arg5 && arg5 + arg0 > arg1;
		} else {
			return false;
		}
	}
}
