import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	public static final int anInt1720 = -1;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "S")
	public static short aShort23 = 1;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	public static int anInt1732 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public static void method1600() {
		Static264.anInt4388 = 1;
		Static536.anInt8899 = -1;
		if (Static120.aString144 == null) {
			Static43.method745(35);
		} else {
			@Pc(24) Class5_Sub12 local24 = new Class5_Sub12(Static189.method3005(Static513.method7409(Static120.aString144)));
			@Pc(28) long local28 = local24.method8644();
			Static271.aLong139 = local24.method8644();
			Static77.method1243(true, "", Static387.method5968(local28));
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BII)I")
	public static int method1601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static270.method4081(arg0 + 91923, arg1 + 45365, 4) + (Static270.method4081(arg0 - -37821, arg1 + 10294, 2) - 128 >> 1) + (Static270.method4081(arg0, arg1, 1) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Z")
	public static boolean method1604(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class5_Sub4_Sub14 local15 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local15 != null; local15 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
			if (Static453.method6733(local15.anInt5598) && local15.aLong165 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!kn;)V")
	public static void method1609(@OriginalArg(1) Class14_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anIntArray245 == null && arg0.anIntArray244 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray245.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray245 != null) {
				local20 = arg0.anIntArray245[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(95) int local95;
				@Pc(88) int local88;
				@Pc(101) int local101;
				if ((local20 & 0xC0000000) == -1073741824) {
					local101 = local20 & 0xFFFFFFF;
					@Pc(139) int local139 = local101 >> 14;
					local95 = arg0.anInt9317 - (-Static113.anInt1785 + local139) * 512 - 256;
					@Pc(155) int local155 = local101 & 0x3FFF;
					local88 = arg0.anInt9315 - (local155 - Static622.anInt10087) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(68) Class5_Sub13 local68 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local20);
					if (local68 == null) {
						arg0.method2512(-1, local16);
						continue;
					}
					@Pc(81) Class14_Sub1_Sub1_Sub3_Sub2 local81 = local68.aClass14_Sub1_Sub1_Sub3_Sub2_1;
					local88 = arg0.anInt9315 - local81.anInt9315;
					local95 = arg0.anInt9317 - local81.anInt9317;
				} else {
					local101 = local20 & 0x7FFF;
					@Pc(105) Class14_Sub1_Sub1_Sub3_Sub1 local105 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local101];
					if (local105 == null) {
						arg0.method2512(-1, local16);
						continue;
					}
					local95 = arg0.anInt9317 - local105.anInt9317;
					local88 = arg0.anInt9315 - local105.anInt9315;
				}
				if (local95 != 0 || local88 != 0) {
					arg0.method2512((int) (Math.atan2((double) local95, (double) local88) * 2607.5945876176133D) & 0x3FFF, local16);
				}
			} else if (!arg0.method2512(-1, local16)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray244 = null;
			arg0.anIntArray245 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([II[ILclient!fha;[I)V")
	public static void method1612(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class14_Sub1_Sub1_Sub3_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg0[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && local19 < arg2.aClass299Array3.length; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass299Array3[local19] = null;
					} else {
						@Pc(44) Class200 local44 = Static396.aClass359_2.method8415(local9);
						@Pc(47) int local47 = local44.anInt4871;
						@Pc(52) Class299 local52 = arg2.aClass299Array3[local19];
						if (local52 != null) {
							if (local9 == local52.anInt8050) {
								if (local47 == 0) {
									local52 = arg2.aClass299Array3[local19] = null;
								} else if (local47 == 1) {
									local52.anInt8045 = 0;
									local52.anInt8049 = 1;
									local52.anInt8048 = 0;
									local52.anInt8047 = local17;
									local52.anInt8044 = 0;
									if (!arg2.aBoolean255) {
										Static270.method4083(local44, 0, arg2);
									}
								} else if (local47 == 2) {
									local52.anInt8048 = 0;
								}
							} else if (local44.anInt4870 >= Static396.aClass359_2.method8415(local52.anInt8050).anInt4870) {
								local52 = arg2.aClass299Array3[local19] = null;
							}
						}
						if (local52 == null) {
							local52 = arg2.aClass299Array3[local19] = new Class299();
							local52.anInt8044 = 0;
							local52.anInt8045 = 0;
							local52.anInt8049 = 1;
							local52.anInt8047 = local17;
							local52.anInt8050 = local9;
							local52.anInt8048 = 0;
							if (!arg2.aBoolean255) {
								Static270.method4083(local44, 0, arg2);
							}
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}
}
