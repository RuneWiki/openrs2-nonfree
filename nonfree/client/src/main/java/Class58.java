import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class58 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	private int anInt2680 = 0;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
	private int anInt2694 = 0;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "[Lclient!s;")
	private final Class64[] aClass64Array1 = new Class64[5000];

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "[[I")
	private final int[][] anIntArrayArray67 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray66 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	private final int anInt2683;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	private final int anInt2685;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	private final int anInt2690;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "[[[Lclient!se;")
	private final Class3_Sub21[][][] aClass3_Sub21ArrayArrayArray1;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(III[[[I)V")
	public Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2683 = arg0;
		this.anInt2685 = arg1;
		this.anInt2690 = arg2;
		this.aClass3_Sub21ArrayArrayArray1 = new Class3_Sub21[arg0][arg1][arg2];
		this.anIntArrayArrayArray7 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray8 = arg3;
		this.method1762();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	public void method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass68_1 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)Z")
	private boolean method1733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static94.anInt2698; local1++) {
			@Pc(6) Class33 local6 = Static94.aClass33Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1637 == 1) {
				local15 = local6.anInt1619 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1638 + (local6.anInt1626 * local15 >> 8);
					local37 = local6.anInt1621 + (local6.anInt1633 * local15 >> 8);
					local47 = local6.anInt1636 + (local6.anInt1639 * local15 >> 8);
					local57 = local6.anInt1623 + (local6.anInt1628 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1637 == 2) {
				local15 = arg0 - local6.anInt1619;
				if (local15 > 0) {
					local27 = local6.anInt1638 + (local6.anInt1626 * local15 >> 8);
					local37 = local6.anInt1621 + (local6.anInt1633 * local15 >> 8);
					local47 = local6.anInt1636 + (local6.anInt1639 * local15 >> 8);
					local57 = local6.anInt1623 + (local6.anInt1628 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1637 == 3) {
				local15 = local6.anInt1638 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1619 + (local6.anInt1630 * local15 >> 8);
					local37 = local6.anInt1635 + (local6.anInt1631 * local15 >> 8);
					local47 = local6.anInt1636 + (local6.anInt1639 * local15 >> 8);
					local57 = local6.anInt1623 + (local6.anInt1628 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1637 == 4) {
				local15 = arg2 - local6.anInt1638;
				if (local15 > 0) {
					local27 = local6.anInt1619 + (local6.anInt1630 * local15 >> 8);
					local37 = local6.anInt1635 + (local6.anInt1631 * local15 >> 8);
					local47 = local6.anInt1636 + (local6.anInt1639 * local15 >> 8);
					local57 = local6.anInt1623 + (local6.anInt1628 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1637 == 5) {
				local15 = arg1 - local6.anInt1636;
				if (local15 > 0) {
					local27 = local6.anInt1619 + (local6.anInt1630 * local15 >> 8);
					local37 = local6.anInt1635 + (local6.anInt1631 * local15 >> 8);
					local47 = local6.anInt1638 + (local6.anInt1626 * local15 >> 8);
					local57 = local6.anInt1621 + (local6.anInt1633 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)Z")
	private boolean method1734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1772(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1733(local11 + 1, this.anIntArrayArrayArray8[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1733(local11 + 128 - 1, this.anIntArrayArrayArray8[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1733(local11 + 128 - 1, this.anIntArrayArrayArray8[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1733(local11 + 1, this.anIntArrayArrayArray8[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIILclient!ee;IZII)Z")
	private boolean method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2685 || local4 >= this.anInt2690) {
					return false;
				}
				@Pc(28) Class3_Sub21 local28 = this.aClass3_Sub21ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt3091 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class64 local52 = new Class64();
		local52.anInt3019 = arg11;
		local52.anInt3012 = arg12;
		local52.anInt3006 = arg0;
		local52.anInt3002 = arg5;
		local52.anInt3020 = arg6;
		local52.anInt3007 = arg7;
		local52.aClass3_Sub1_Sub1_6 = arg8;
		local52.anInt3017 = arg9;
		local52.anInt3004 = arg1;
		local52.anInt3016 = arg2;
		local52.anInt3003 = arg1 + arg3 - 1;
		local52.anInt3011 = arg2 + arg4 - 1;
		for (@Pc(98) int local98 = arg1; local98 < arg1 + arg3; local98++) {
			for (@Pc(101) int local101 = arg2; local101 < arg2 + arg4; local101++) {
				@Pc(104) int local104 = 0;
				if (local98 > arg1) {
					local104++;
				}
				if (local98 < arg1 + arg3 - 1) {
					local104 += 4;
				}
				if (local101 > arg2) {
					local104 += 8;
				}
				if (local101 < arg2 + arg4 - 1) {
					local104 += 2;
				}
				for (@Pc(130) int local130 = arg0; local130 >= 0; local130--) {
					if (this.aClass3_Sub21ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub21ArrayArrayArray1[local130][local98][local101] = new Class3_Sub21(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub21 local166 = this.aClass3_Sub21ArrayArrayArray1[arg0][local98][local101];
				local166.aClass64Array3[local166.anInt3091] = local52;
				local166.anIntArray328[local166.anInt3091] = local104;
				local166.anInt3086 |= local104;
				local166.anInt3091++;
			}
		}
		if (arg10) {
			this.aClass64Array1[this.anInt2680++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIII)V")
	public void method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2].anInt3093 = arg3;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ue;III)V")
	private void method1737(@OriginalArg(0) Class3_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub21 local14;
		@Pc(29) Class3_Sub1_Sub1_Sub7 local29;
		if (arg2 < this.anInt2685) {
			local14 = this.aClass3_Sub21ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass52_1 != null && local14.aClass52_1.aClass3_Sub1_Sub1_2 instanceof Class3_Sub1_Sub1_Sub7) {
				local29 = (Class3_Sub1_Sub1_Sub7) local14.aClass52_1.aClass3_Sub1_Sub1_2;
				Static121.method2230(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2685) {
			local14 = this.aClass3_Sub21ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass52_1 != null && local14.aClass52_1.aClass3_Sub1_Sub1_2 instanceof Class3_Sub1_Sub1_Sub7) {
				local29 = (Class3_Sub1_Sub1_Sub7) local14.aClass52_1.aClass3_Sub1_Sub1_2;
				Static121.method2230(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2685 && arg3 < this.anInt2690) {
			local14 = this.aClass3_Sub21ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass52_1 != null && local14.aClass52_1.aClass3_Sub1_Sub1_2 instanceof Class3_Sub1_Sub1_Sub7) {
				local29 = (Class3_Sub1_Sub1_Sub7) local14.aClass52_1.aClass3_Sub1_Sub1_2;
				Static121.method2230(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2685 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub21ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass52_1 != null && local14.aClass52_1.aClass3_Sub1_Sub1_2 instanceof Class3_Sub1_Sub1_Sub7) {
			local29 = (Class3_Sub1_Sub1_Sub7) local14.aClass52_1.aClass3_Sub1_Sub1_2;
			Static121.method2230(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(III)I")
	public int method1738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass52_1 == null ? 0 : local8.aClass52_1.anInt2572;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
	private void method1739() {
		@Pc(3) int local3 = Static94.anIntArray289[Static94.anInt2700];
		@Pc(7) Class33[] local7 = Static94.aClass33ArrayArray1[Static94.anInt2700];
		Static94.anInt2698 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class33 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1620 == 1) {
				local27 = local16.anInt1627 + 25 - Static94.anInt2704;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1617 + 25 - Static94.anInt2707;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1622 + 25 - Static94.anInt2707;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static94.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static94.anInt2688 - local16.anInt1619;
						if (local79 > 32) {
							local16.anInt1637 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1637 = 2;
							local79 = -local79;
						}
						local16.anInt1626 = (local16.anInt1638 - Static94.anInt2703 << 8) / local79;
						local16.anInt1633 = (local16.anInt1621 - Static94.anInt2703 << 8) / local79;
						local16.anInt1639 = (local16.anInt1636 - Static94.anInt2697 << 8) / local79;
						local16.anInt1628 = (local16.anInt1623 - Static94.anInt2697 << 8) / local79;
						Static94.aClass33Array1[Static94.anInt2698++] = local16;
					}
				}
			} else if (local16.anInt1620 == 2) {
				local27 = local16.anInt1617 + 25 - Static94.anInt2707;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1627 + 25 - Static94.anInt2704;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1625 + 25 - Static94.anInt2704;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static94.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static94.anInt2703 - local16.anInt1638;
						if (local79 > 32) {
							local16.anInt1637 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1637 = 4;
							local79 = -local79;
						}
						local16.anInt1630 = (local16.anInt1619 - Static94.anInt2688 << 8) / local79;
						local16.anInt1631 = (local16.anInt1635 - Static94.anInt2688 << 8) / local79;
						local16.anInt1639 = (local16.anInt1636 - Static94.anInt2697 << 8) / local79;
						local16.anInt1628 = (local16.anInt1623 - Static94.anInt2697 << 8) / local79;
						Static94.aClass33Array1[Static94.anInt2698++] = local16;
					}
				}
			} else if (local16.anInt1620 == 4) {
				local27 = local16.anInt1636 - Static94.anInt2697;
				if (local27 > 128) {
					local40 = local16.anInt1617 + 25 - Static94.anInt2707;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1622 + 25 - Static94.anInt2707;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1627 + 25 - Static94.anInt2704;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1625 + 25 - Static94.anInt2704;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static94.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt1637 = 5;
							local16.anInt1630 = (local16.anInt1619 - Static94.anInt2688 << 8) / local27;
							local16.anInt1631 = (local16.anInt1635 - Static94.anInt2688 << 8) / local27;
							local16.anInt1626 = (local16.anInt1638 - Static94.anInt2703 << 8) / local27;
							local16.anInt1633 = (local16.anInt1621 - Static94.anInt2703 << 8) / local27;
							Static94.aClass33Array1[Static94.anInt2698++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIII)V")
	public void method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2685 * 128) {
			arg0 = this.anInt2685 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2690 * 128) {
			arg2 = this.anInt2690 * 128 - 1;
		}
		Static94.anInt2691++;
		Static94.anInt2687 = Class3_Sub1_Sub2_Sub1.anIntArray41[arg3];
		Static94.anInt2682 = Class3_Sub1_Sub2_Sub1.anIntArray39[arg3];
		Static94.anInt2693 = Class3_Sub1_Sub2_Sub1.anIntArray41[arg4];
		Static94.anInt2689 = Class3_Sub1_Sub2_Sub1.anIntArray39[arg4];
		Static94.aBooleanArrayArray1 = Static94.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static94.anInt2688 = arg0;
		Static94.anInt2697 = arg1;
		Static94.anInt2703 = arg2;
		Static94.anInt2704 = arg0 / 128;
		Static94.anInt2707 = arg2 / 128;
		Static94.anInt2700 = arg5;
		Static94.anInt2696 = Static94.anInt2704 - 25;
		if (Static94.anInt2696 < 0) {
			Static94.anInt2696 = 0;
		}
		Static94.anInt2684 = Static94.anInt2707 - 25;
		if (Static94.anInt2684 < 0) {
			Static94.anInt2684 = 0;
		}
		Static94.anInt2686 = Static94.anInt2704 + 25;
		if (Static94.anInt2686 > this.anInt2685) {
			Static94.anInt2686 = this.anInt2685;
		}
		Static94.anInt2705 = Static94.anInt2707 + 25;
		if (Static94.anInt2705 > this.anInt2690) {
			Static94.anInt2705 = this.anInt2690;
		}
		this.method1739();
		Static94.anInt2695 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2694; local128 < this.anInt2683; local128++) {
			@Pc(134) Class3_Sub21[][] local134 = this.aClass3_Sub21ArrayArrayArray1[local128];
			for (local136 = Static94.anInt2696; local136 < Static94.anInt2686; local136++) {
				for (local139 = Static94.anInt2684; local139 < Static94.anInt2705; local139++) {
					@Pc(146) Class3_Sub21 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt3093 <= arg5 && (Static94.aBooleanArrayArray1[local136 + 25 - Static94.anInt2704][local139 + 25 - Static94.anInt2707] || this.anIntArrayArrayArray8[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean105 = true;
							local146.aBoolean107 = true;
							if (local146.anInt3091 > 0) {
								local146.aBoolean106 = true;
							} else {
								local146.aBoolean106 = false;
							}
							Static94.anInt2695++;
						} else {
							local146.aBoolean105 = false;
							local146.aBoolean107 = false;
							local146.anInt3094 = 0;
						}
					}
				}
			}
		}
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(237) int local237;
		for (@Pc(224) int local224 = this.anInt2694; local224 < this.anInt2683; local224++) {
			@Pc(230) Class3_Sub21[][] local230 = this.aClass3_Sub21ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static94.anInt2704 + local139;
				local241 = Static94.anInt2704 - local139;
				if (local237 >= Static94.anInt2696 || local241 < Static94.anInt2686) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static94.anInt2707 + local249;
						local258 = Static94.anInt2707 - local249;
						@Pc(270) Class3_Sub21 local270;
						if (local237 >= Static94.anInt2696) {
							if (local254 >= Static94.anInt2684) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean105) {
									this.method1766(local270, true);
								}
							}
							if (local258 < Static94.anInt2705) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean105) {
									this.method1766(local270, true);
								}
							}
						}
						if (local241 < Static94.anInt2686) {
							if (local254 >= Static94.anInt2684) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean105) {
									this.method1766(local270, true);
								}
							}
							if (local258 < Static94.anInt2705) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean105) {
									this.method1766(local270, true);
								}
							}
						}
						if (Static94.anInt2695 == 0) {
							Static94.aBoolean100 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2694; local136 < this.anInt2683; local136++) {
			@Pc(361) Class3_Sub21[][] local361 = this.aClass3_Sub21ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static94.anInt2704 + local237;
				local249 = Static94.anInt2704 - local237;
				if (local241 >= Static94.anInt2696 || local249 < Static94.anInt2686) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static94.anInt2707 + local254;
						@Pc(389) int local389 = Static94.anInt2707 - local254;
						@Pc(401) Class3_Sub21 local401;
						if (local241 >= Static94.anInt2696) {
							if (local258 >= Static94.anInt2684) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean105) {
									this.method1766(local401, false);
								}
							}
							if (local389 < Static94.anInt2705) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean105) {
									this.method1766(local401, false);
								}
							}
						}
						if (local249 < Static94.anInt2686) {
							if (local258 >= Static94.anInt2684) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean105) {
									this.method1766(local401, false);
								}
							}
							if (local389 < Static94.anInt2705) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean105) {
									this.method1766(local401, false);
								}
							}
						}
						if (Static94.anInt2695 == 0) {
							Static94.aBoolean100 = false;
							return;
						}
					}
				}
			}
		}
		Static94.aBoolean100 = false;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method1741(@OriginalArg(0) int arg0) {
		this.anInt2694 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2685; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2690; local7++) {
				if (this.aClass3_Sub21ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub21ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub21(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIILclient!ee;IIIIII)Z")
	public boolean method1743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1735(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(IIII)V")
	public void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class24 local14 = local8.aClass24_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1290 = local23 + (local14.anInt1290 - local23) * arg3 / 16;
			local14.anInt1297 = local29 + (local14.anInt1297 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(III)I")
	public int method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass68_1 == null ? 0 : local8.aClass68_1.anInt3048;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray7[arg0][local17][local21] == -Static94.anInt2691) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray8[arg0][arg1][arg3] - arg5;
			if (!this.method1733(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1733(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1733(local21, local167, local195)) {
				return false;
			} else if (this.method1733(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1772(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1733(local17 + 1, this.anIntArrayArrayArray8[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1733(local17 + 128 - 1, this.anIntArrayArrayArray8[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1733(local17 + 128 - 1, this.anIntArrayArrayArray8[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1733(local17 + 1, this.anIntArrayArrayArray8[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(IIII)I")
	public int method1747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass68_1 != null && local8.aClass68_1.anInt3048 == arg3) {
			return local8.aClass68_1.anInt3044 & 0xFF;
		} else if (local8.aClass24_1 != null && local8.aClass24_1.anInt1302 == arg3) {
			return local8.aClass24_1.anInt1304 & 0xFF;
		} else if (local8.aClass52_1 != null && local8.aClass52_1.anInt2572 == arg3) {
			return local8.aClass52_1.anInt2571 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt3091; local56++) {
				if (local8.aClass64Array3[local56].anInt3019 == arg3) {
					return local8.aClass64Array3[local56].anInt3012 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIILclient!ee;III)Z")
	public boolean method1748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1735(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(III)V")
	public void method1749() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2683; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2685; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2690; local7++) {
					@Pc(17) Class3_Sub21 local17 = this.aClass3_Sub21ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class68 local22 = local17.aClass68_1;
						if (local22 != null && local22.aClass3_Sub1_Sub1_8 instanceof Class3_Sub1_Sub1_Sub7) {
							@Pc(32) Class3_Sub1_Sub1_Sub7 local32 = (Class3_Sub1_Sub1_Sub7) local22.aClass3_Sub1_Sub1_8;
							this.method1764(local32, local1, local4, local7, 1, 1);
							if (local22.aClass3_Sub1_Sub1_7 instanceof Class3_Sub1_Sub1_Sub7) {
								@Pc(48) Class3_Sub1_Sub1_Sub7 local48 = (Class3_Sub1_Sub1_Sub7) local22.aClass3_Sub1_Sub1_7;
								this.method1764(local48, local1, local4, local7, 1, 1);
								Static121.method2230(local32, local48, 0, 0, 0, false);
								local22.aClass3_Sub1_Sub1_7 = local48.method2229(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass3_Sub1_Sub1_8 = local32.method2229(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class3_Sub1_Sub1_Sub7 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt3091; local87++) {
							@Pc(93) Class64 local93 = local17.aClass64Array3[local87];
							if (local93 != null && local93.aClass3_Sub1_Sub1_6 instanceof Class3_Sub1_Sub1_Sub7) {
								local103 = (Class3_Sub1_Sub1_Sub7) local93.aClass3_Sub1_Sub1_6;
								this.method1764(local103, local1, local4, local7, local93.anInt3003 + 1 - local93.anInt3004, local93.anInt3011 - local93.anInt3016 + 1);
								local93.aClass3_Sub1_Sub1_6 = local103.method2229(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class52 local142 = local17.aClass52_1;
						if (local142 != null && local142.aClass3_Sub1_Sub1_2 instanceof Class3_Sub1_Sub1_Sub7) {
							local103 = (Class3_Sub1_Sub1_Sub7) local142.aClass3_Sub1_Sub1_2;
							this.method1737(local103, local1, local4, local7);
							local142.aClass3_Sub1_Sub1_2 = local103.method2229(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(III)V")
	public void method1750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass52_1 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(III)V")
	public void method1751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass24_1 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "(III)Lclient!gf;")
	public Class24 method1752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass24_1;
	}

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "(III)Lclient!oe;")
	public Class52 method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass52_1 == null ? null : local8.aClass52_1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!a;IIIIII)V")
	private void method1754(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray13.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray13[local5] - Static94.anInt2688;
			local20 = arg0.anIntArray11[local5] - Static94.anInt2697;
			local27 = arg0.anIntArray6[local5] - Static94.anInt2703;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray8 != null) {
				Static1.anIntArray10[local5] = local37;
				Static1.anIntArray9[local5] = local59;
				Static1.anIntArray7[local5] = local69;
			}
			Static1.anIntArray2[local5] = Static7.anInt310 + (local37 << 9) / local69;
			Static1.anIntArray14[local5] = Static7.anInt313 + (local59 << 9) / local69;
		}
		Static7.anInt314 = 0;
		local3 = arg0.anIntArray3.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray3[local13];
			local27 = arg0.anIntArray15[local13];
			local37 = arg0.anIntArray1[local13];
			@Pc(142) int local142 = Static1.anIntArray2[local20];
			@Pc(146) int local146 = Static1.anIntArray2[local27];
			@Pc(150) int local150 = Static1.anIntArray2[local37];
			@Pc(154) int local154 = Static1.anIntArray14[local20];
			@Pc(158) int local158 = Static1.anIntArray14[local27];
			@Pc(162) int local162 = Static1.anIntArray14[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static7.aBoolean8 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static7.anInt316 || local146 > Static7.anInt316 || local150 > Static7.anInt316) {
					Static7.aBoolean8 = true;
				}
				if (Static94.aBoolean100 && this.method1765(Static94.anInt2681, Static94.anInt2692, local154, local158, local162, local142, local146, local150)) {
					Static94.anInt2701 = arg5;
					Static94.anInt2706 = arg6;
				}
				if (arg0.anIntArray8 == null || arg0.anIntArray8[local13] == -1) {
					if (arg0.anIntArray5[local13] != 12345678) {
						Static7.method280(local154, local158, local162, local142, local146, local150, arg0.anIntArray5[local13], arg0.anIntArray12[local13], arg0.anIntArray4[local13]);
					}
				} else if (Static94.aBoolean99) {
					@Pc(364) int local364 = Static7.anInterface1_1.method1163(arg0.anIntArray8[local13]);
					Static7.method280(local154, local158, local162, local142, local146, local150, Static94.method1759(local364, arg0.anIntArray5[local13]), Static94.method1759(local364, arg0.anIntArray12[local13]), Static94.method1759(local364, arg0.anIntArray4[local13]));
				} else if (arg0.aBoolean1) {
					Static7.method278(local154, local158, local162, local142, local146, local150, arg0.anIntArray5[local13], arg0.anIntArray12[local13], arg0.anIntArray4[local13], Static1.anIntArray10[0], Static1.anIntArray10[1], Static1.anIntArray10[3], Static1.anIntArray9[0], Static1.anIntArray9[1], Static1.anIntArray9[3], Static1.anIntArray7[0], Static1.anIntArray7[1], Static1.anIntArray7[3], arg0.anIntArray8[local13]);
				} else {
					Static7.method278(local154, local158, local162, local142, local146, local150, arg0.anIntArray5[local13], arg0.anIntArray12[local13], arg0.anIntArray4[local13], Static1.anIntArray10[local20], Static1.anIntArray10[local27], Static1.anIntArray10[local37], Static1.anIntArray9[local20], Static1.anIntArray9[local27], Static1.anIntArray9[local37], Static1.anIntArray7[local20], Static1.anIntArray7[local27], Static1.anIntArray7[local37], arg0.anIntArray8[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "(III)I")
	public int method1755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass24_1 == null ? 0 : local8.aClass24_1.anInt1302;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!jd;IIIIIII)V")
	private void method1756(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static94.anInt2688;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static94.anInt2703;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray8[arg1][arg6][arg7] - Static94.anInt2697;
		@Pc(51) int local51 = this.anIntArrayArrayArray8[arg1][arg6 + 1][arg7] - Static94.anInt2697;
		@Pc(66) int local66 = this.anIntArrayArrayArray8[arg1][arg6 + 1][arg7 + 1] - Static94.anInt2697;
		@Pc(79) int local79 = this.anIntArrayArrayArray8[arg1][arg6][arg7 + 1] - Static94.anInt2697;
		@Pc(89) int local89 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(99) int local99 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(101) int local101 = local89;
		@Pc(111) int local111 = local38 * arg3 - local99 * arg2 >> 16;
		@Pc(121) int local121 = local38 * arg2 + local99 * arg3 >> 16;
		@Pc(123) int local123 = local111;
		if (local121 < 50) {
			return;
		}
		local89 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(147) int local147 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local89;
		local89 = local51 * arg3 - local147 * arg2 >> 16;
		@Pc(169) int local169 = local51 * arg2 + local147 * arg3 >> 16;
		local51 = local89;
		if (local169 < 50) {
			return;
		}
		local89 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(197) int local197 = local89;
		local89 = local66 * arg3 - local27 * arg2 >> 16;
		local27 = local66 * arg2 + local27 * arg3 >> 16;
		local66 = local89;
		if (local27 < 50) {
			return;
		}
		local89 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(243) int local243 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(245) int local245 = local89;
		local89 = local79 * arg3 - local243 * arg2 >> 16;
		@Pc(265) int local265 = local79 * arg2 + local243 * arg3 >> 16;
		if (local265 < 50) {
			return;
		}
		@Pc(279) int local279 = Static7.anInt310 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static7.anInt313 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static7.anInt310 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static7.anInt313 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static7.anInt310 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static7.anInt313 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static7.anInt310 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static7.anInt313 + (local89 << 9) / local265;
		Static7.anInt314 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static7.aBoolean8 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static7.anInt316 || local327 > Static7.anInt316 || local295 > Static7.anInt316) {
				Static7.aBoolean8 = true;
			}
			if (Static94.aBoolean100 && this.method1765(Static94.anInt2681, Static94.anInt2692, local319, local335, local303, local311, local327, local295)) {
				Static94.anInt2701 = arg6;
				Static94.anInt2706 = arg7;
			}
			if (arg0.anInt1733 == -1) {
				if (arg0.anInt1738 != 12345678) {
					Static7.method280(local319, local335, local303, local311, local327, local295, arg0.anInt1738, arg0.anInt1732, arg0.anInt1736);
				}
			} else if (Static94.aBoolean99) {
				local472 = Static7.anInterface1_1.method1163(arg0.anInt1733);
				Static7.method280(local319, local335, local303, local311, local327, local295, Static94.method1759(local472, arg0.anInt1738), Static94.method1759(local472, arg0.anInt1732), Static94.method1759(local472, arg0.anInt1736));
			} else if (arg0.aBoolean54) {
				Static7.method278(local319, local335, local303, local311, local327, local295, arg0.anInt1738, arg0.anInt1732, arg0.anInt1736, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1733);
			} else {
				Static7.method278(local319, local335, local303, local311, local327, local295, arg0.anInt1738, arg0.anInt1732, arg0.anInt1736, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1733);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static7.aBoolean8 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static7.anInt316 || local295 > Static7.anInt316 || local327 > Static7.anInt316) {
			Static7.aBoolean8 = true;
		}
		if (Static94.aBoolean100 && this.method1765(Static94.anInt2681, Static94.anInt2692, local287, local303, local335, local279, local295, local327)) {
			Static94.anInt2701 = arg6;
			Static94.anInt2706 = arg7;
		}
		if (arg0.anInt1733 != -1) {
			if (!Static94.aBoolean99) {
				Static7.method278(local287, local303, local335, local279, local295, local327, arg0.anInt1731, arg0.anInt1736, arg0.anInt1732, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1733);
				return;
			}
			local472 = Static7.anInterface1_1.method1163(arg0.anInt1733);
			Static7.method280(local287, local303, local335, local279, local295, local327, Static94.method1759(local472, arg0.anInt1731), Static94.method1759(local472, arg0.anInt1736), Static94.method1759(local472, arg0.anInt1732));
		} else if (arg0.anInt1731 != 12345678) {
			Static7.method280(local287, local303, local335, local279, local295, local327, arg0.anInt1731, arg0.anInt1736, arg0.anInt1732);
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
	public void method1757() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2680; local1++) {
			@Pc(7) Class64 local7 = this.aClass64Array1[local1];
			this.method1769(local7);
			this.aClass64Array1[local1] = null;
		}
		this.anInt2680 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "(III)Lclient!s;")
	public Class64 method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3091; local14++) {
			@Pc(20) Class64 local20 = local8.aClass64Array3[local14];
			if ((local20.anInt3019 >> 29 & 0x3) == 2 && local20.anInt3004 == arg1 && local20.anInt3016 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "(III)V")
	public void method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static94.aBoolean100 = true;
		Static94.anInt2702 = arg0;
		Static94.anInt2681 = arg1;
		Static94.anInt2692 = arg2;
		Static94.anInt2701 = -1;
		Static94.anInt2706 = -1;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()V")
	public void method1762() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2683; local1++) {
			for (local4 = 0; local4 < this.anInt2685; local4++) {
				for (local7 = 0; local7 < this.anInt2690; local7++) {
					this.aClass3_Sub21ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static94.anInt2699; local4++) {
			for (local7 = 0; local7 < Static94.anIntArray289[local4]; local7++) {
				Static94.aClass33ArrayArray1[local4][local7] = null;
			}
			Static94.anIntArray289[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2680; local7++) {
			this.aClass64Array1[local7] = null;
		}
		this.anInt2680 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static94.aClass64Array2.length; local76++) {
			Static94.aClass64Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILclient!ee;IIIIII)V")
	public void method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class24 local6 = new Class24();
		local6.anInt1302 = arg9;
		local6.anInt1304 = arg10;
		local6.anInt1290 = arg1 * 128 + arg7 + 64;
		local6.anInt1297 = arg2 * 128 + arg8 + 64;
		local6.anInt1300 = arg3;
		local6.aClass3_Sub1_Sub1_1 = arg4;
		local6.anInt1288 = arg5;
		local6.anInt1296 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass3_Sub21ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass3_Sub21ArrayArrayArray1[local44][arg1][arg2] = new Class3_Sub21(local44, arg1, arg2);
			}
		}
		this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass24_1 = local6;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ue;IIIII)V")
	private void method1764(@OriginalArg(0) Class3_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2683) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2685) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2690 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub21 local66 = this.aClass3_Sub21ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray8[local17][local24][local34] + this.anIntArrayArrayArray8[local17][local24 + 1][local34] + this.anIntArrayArrayArray8[local17][local24][local34 + 1] + this.anIntArrayArrayArray8[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray8[arg1][arg2][arg3] + this.anIntArrayArrayArray8[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray8[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray8[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class68 local163 = local66.aClass68_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub1_Sub1_Sub7 local173;
										if (local163.aClass3_Sub1_Sub1_8 instanceof Class3_Sub1_Sub1_Sub7) {
											local173 = (Class3_Sub1_Sub1_Sub7) local163.aClass3_Sub1_Sub1_8;
											Static121.method2230(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass3_Sub1_Sub1_7 instanceof Class3_Sub1_Sub1_Sub7) {
											local173 = (Class3_Sub1_Sub1_Sub7) local163.aClass3_Sub1_Sub1_7;
											Static121.method2230(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt3091; local237++) {
										@Pc(243) Class64 local243 = local66.aClass64Array3[local237];
										if (local243 != null && local243.aClass3_Sub1_Sub1_6 instanceof Class3_Sub1_Sub1_Sub7) {
											@Pc(253) Class3_Sub1_Sub1_Sub7 local253 = (Class3_Sub1_Sub1_Sub7) local243.aClass3_Sub1_Sub1_6;
											@Pc(261) int local261 = local243.anInt3003 + 1 - local243.anInt3004;
											@Pc(269) int local269 = local243.anInt3011 + 1 - local243.anInt3016;
											Static121.method2230(arg0, local253, (local243.anInt3004 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt3016 - arg3) * 128 + (local269 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!se;Z)V")
	private void method1766(@OriginalArg(0) Class3_Sub21 arg0, @OriginalArg(1) boolean arg1) {
		Static94.aClass5_19.method87(arg0);
		while (true) {
			@Pc(8) Class3_Sub21 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub21[][] local31;
			@Pc(49) Class3_Sub21 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class68 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class64 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class3_Sub21 var35;
										while (true) {
											do {
												local8 = (Class3_Sub21) Static94.aClass5_19.method78();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean107);
											local17 = local8.anInt3089;
											local20 = local8.anInt3090;
											local23 = local8.anInt3084;
											local26 = local8.anInt3092;
											local31 = this.aClass3_Sub21ArrayArrayArray1[local23];
											if (!local8.aBoolean105) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub21ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean107) {
														continue;
													}
												}
												if (local17 <= Static94.anInt2704 && local17 > Static94.anInt2696) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean107 && (local49.aBoolean105 || (local8.anInt3086 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static94.anInt2704 && local17 < Static94.anInt2686 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean107 && (local49.aBoolean105 || (local8.anInt3086 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static94.anInt2707 && local20 > Static94.anInt2684) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean107 && (local49.aBoolean105 || (local8.anInt3086 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static94.anInt2707 && local20 < Static94.anInt2705 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean107 && (local49.aBoolean105 || (local8.anInt3086 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean105 = false;
											if (local8.aClass3_Sub21_1 != null) {
												local49 = local8.aClass3_Sub21_1;
												if (local49.aClass35_1 == null) {
													if (local49.aClass1_1 != null && !this.method1772(0, local17, local20)) {
														this.method1754(local49.aClass1_1, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local17, local20);
													}
												} else if (!this.method1772(0, local17, local20)) {
													this.method1756(local49.aClass35_1, 0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local17, local20);
												}
												@Pc(225) Class68 local225 = local49.aClass68_1;
												if (local225 != null) {
													local225.aClass3_Sub1_Sub1_8.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local225.anInt3054 - Static94.anInt2688, local225.anInt3057 - Static94.anInt2697, local225.anInt3050 - Static94.anInt2703, local225.anInt3048);
												}
												for (local251 = 0; local251 < local49.anInt3091; local251++) {
													var12 = local49.aClass64Array3[local251];
													if (var12 != null) {
														var12.aClass3_Sub1_Sub1_6.method2223(var12.anInt3017, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, var12.anInt3002 - Static94.anInt2688, var12.anInt3007 - Static94.anInt2697, var12.anInt3020 - Static94.anInt2703, var12.anInt3019);
													}
												}
											}
											var24 = false;
											if (local8.aClass35_1 == null) {
												if (local8.aClass1_1 != null && !this.method1772(local26, local17, local20)) {
													var24 = true;
													this.method1754(local8.aClass1_1, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local17, local20);
												}
											} else if (!this.method1772(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass35_1.anInt1738 != 12345678 || Static94.aBoolean100 && local23 <= Static94.anInt2702) {
													this.method1756(local8.aClass35_1, local26, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class68 local350 = local8.aClass68_1;
											@Pc(353) Class24 local353 = local8.aClass24_1;
											if (local350 != null || local353 != null) {
												if (Static94.anInt2704 == local17) {
													var23++;
												} else if (Static94.anInt2704 < local17) {
													var23 += 2;
												}
												if (Static94.anInt2707 == local20) {
													var23 += 3;
												} else if (Static94.anInt2707 > local20) {
													var23 += 6;
												}
												local251 = Static94.anIntArray293[var23];
												local8.anInt3088 = Static94.anIntArray290[var23];
											}
											if (local350 != null) {
												if ((local350.anInt3045 & Static94.anIntArray295[var23]) == 0) {
													local8.anInt3094 = 0;
												} else if (local350.anInt3045 == 16) {
													local8.anInt3094 = 3;
													local8.anInt3087 = Static94.anIntArray292[var23];
													local8.anInt3082 = 3 - local8.anInt3087;
												} else if (local350.anInt3045 == 32) {
													local8.anInt3094 = 6;
													local8.anInt3087 = Static94.anIntArray294[var23];
													local8.anInt3082 = 6 - local8.anInt3087;
												} else if (local350.anInt3045 == 64) {
													local8.anInt3094 = 12;
													local8.anInt3087 = Static94.anIntArray291[var23];
													local8.anInt3082 = 12 - local8.anInt3087;
												} else {
													local8.anInt3094 = 9;
													local8.anInt3087 = Static94.anIntArray296[var23];
													local8.anInt3082 = 9 - local8.anInt3087;
												}
												if ((local350.anInt3045 & local251) != 0 && !this.method1779(local26, local17, local20, local350.anInt3045)) {
													local350.aClass3_Sub1_Sub1_8.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local350.anInt3054 - Static94.anInt2688, local350.anInt3057 - Static94.anInt2697, local350.anInt3050 - Static94.anInt2703, local350.anInt3048);
												}
												if ((local350.anInt3052 & local251) != 0 && !this.method1779(local26, local17, local20, local350.anInt3052)) {
													local350.aClass3_Sub1_Sub1_7.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local350.anInt3054 - Static94.anInt2688, local350.anInt3057 - Static94.anInt2697, local350.anInt3050 - Static94.anInt2703, local350.anInt3048);
												}
											}
											if (local353 != null && !this.method1734(local26, local17, local20, local353.aClass3_Sub1_Sub1_1.anInt3333)) {
												if ((local353.anInt1288 & local251) != 0) {
													local353.aClass3_Sub1_Sub1_1.method2223(local353.anInt1296, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local353.anInt1290 - Static94.anInt2688, local353.anInt1300 - Static94.anInt2697, local353.anInt1297 - Static94.anInt2703, local353.anInt1302);
												} else if ((local353.anInt1288 & 0x300) != 0) {
													local588 = local353.anInt1290 - Static94.anInt2688;
													local593 = local353.anInt1300 - Static94.anInt2697;
													local598 = local353.anInt1297 - Static94.anInt2703;
													local601 = local353.anInt1296;
													if (local601 == 1 || local601 == 2) {
														local610 = -local588;
													} else {
														local610 = local588;
													}
													if (local601 == 2 || local601 == 3) {
														var19 = -local598;
													} else {
														var19 = local598;
													}
													@Pc(639) int local639;
													@Pc(645) int local645;
													if ((local353.anInt1288 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static94.anIntArray287[local601];
														local645 = local598 + Static94.anIntArray285[local601];
														local353.aClass3_Sub1_Sub1_1.method2223(local601 * 512 + 256, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local639, local593, local645, local353.anInt1302);
													}
													if ((local353.anInt1288 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static94.anIntArray286[local601];
														local645 = local598 + Static94.anIntArray288[local601];
														local353.aClass3_Sub1_Sub1_1.method2223(local601 * 512 + 1280 & 0x7FF, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local639, local593, local645, local353.anInt1302);
													}
												}
											}
											if (var24) {
												@Pc(706) Class52 local706 = local8.aClass52_1;
												if (local706 != null) {
													local706.aClass3_Sub1_Sub1_2.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local706.anInt2575 - Static94.anInt2688, local706.anInt2570 - Static94.anInt2697, local706.anInt2574 - Static94.anInt2703, local706.anInt2572);
												}
												@Pc(733) Class57 local733 = local8.aClass57_1;
												if (local733 != null && local733.anInt2674 == 0) {
													if (local733.aClass3_Sub1_Sub1_3 != null) {
														local733.aClass3_Sub1_Sub1_3.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local733.anInt2672 - Static94.anInt2688, local733.anInt2676 - Static94.anInt2697, local733.anInt2679 - Static94.anInt2703, local733.anInt2673);
													}
													if (local733.aClass3_Sub1_Sub1_4 != null) {
														local733.aClass3_Sub1_Sub1_4.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local733.anInt2672 - Static94.anInt2688, local733.anInt2676 - Static94.anInt2697, local733.anInt2679 - Static94.anInt2703, local733.anInt2673);
													}
													if (local733.aClass3_Sub1_Sub1_5 != null) {
														local733.aClass3_Sub1_Sub1_5.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local733.anInt2672 - Static94.anInt2688, local733.anInt2676 - Static94.anInt2697, local733.anInt2679 - Static94.anInt2703, local733.anInt2673);
													}
												}
											}
											local588 = local8.anInt3086;
											if (local588 != 0) {
												if (local17 < Static94.anInt2704 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean107) {
														Static94.aClass5_19.method87(var35);
													}
												}
												if (local20 < Static94.anInt2707 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean107) {
														Static94.aClass5_19.method87(var35);
													}
												}
												if (local17 > Static94.anInt2704 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean107) {
														Static94.aClass5_19.method87(var35);
													}
												}
												if (local20 > Static94.anInt2707 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean107) {
														Static94.aClass5_19.method87(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt3094 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt3091; var23++) {
												if (local8.aClass64Array3[var23].anInt3021 != Static94.anInt2691 && (local8.anIntArray328[var23] & local8.anInt3094) == local8.anInt3087) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass68_1;
												if (!this.method1779(local26, local17, local20, local952.anInt3045)) {
													local952.aClass3_Sub1_Sub1_8.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local952.anInt3054 - Static94.anInt2688, local952.anInt3057 - Static94.anInt2697, local952.anInt3050 - Static94.anInt2703, local952.anInt3048);
												}
												local8.anInt3094 = 0;
											}
										}
										if (!local8.aBoolean106) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt3091;
											local8.aBoolean106 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass64Array3[local251];
												if (var12.anInt3021 != Static94.anInt2691) {
													for (local1011 = var12.anInt3004; local1011 <= var12.anInt3003; local1011++) {
														for (local588 = var12.anInt3016; local588 <= var12.anInt3011; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean105) {
																local8.aBoolean106 = true;
																continue label568;
															}
															if (var35.anInt3094 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt3004) {
																	local598++;
																}
																if (local1011 < var12.anInt3003) {
																	local598 += 4;
																}
																if (local588 > var12.anInt3016) {
																	local598 += 8;
																}
																if (local588 < var12.anInt3011) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt3094) == local8.anInt3082) {
																	local8.aBoolean106 = true;
																	continue label568;
																}
															}
														}
													}
													Static94.aClass64Array2[var23++] = var12;
													local588 = Static94.anInt2704 - var12.anInt3004;
													local593 = var12.anInt3003 - Static94.anInt2704;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static94.anInt2707 - var12.anInt3016;
													local601 = var12.anInt3011 - Static94.anInt2707;
													if (local601 > local598) {
														var12.anInt3015 = local588 + local601;
													} else {
														var12.anInt3015 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class64 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static94.aClass64Array2[local588];
													if (local1135.anInt3021 != Static94.anInt2691) {
														if (local1135.anInt3015 > local1126) {
															local1126 = local1135.anInt3015;
															local1011 = local588;
														} else if (local1135.anInt3015 == local1126) {
															local598 = local1135.anInt3002 - Static94.anInt2688;
															local601 = local1135.anInt3020 - Static94.anInt2703;
															local610 = Static94.aClass64Array2[local1011].anInt3002 - Static94.anInt2688;
															var19 = Static94.aClass64Array2[local1011].anInt3020 - Static94.anInt2703;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static94.aClass64Array2[local1011];
												local1135.anInt3021 = Static94.anInt2691;
												if (!this.method1746(local26, local1135.anInt3004, local1135.anInt3003, local1135.anInt3016, local1135.anInt3011, local1135.aClass3_Sub1_Sub1_6.anInt3333)) {
													local1135.aClass3_Sub1_Sub1_6.method2223(local1135.anInt3017, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local1135.anInt3002 - Static94.anInt2688, local1135.anInt3007 - Static94.anInt2697, local1135.anInt3020 - Static94.anInt2703, local1135.anInt3019);
												}
												for (local598 = local1135.anInt3004; local598 <= local1135.anInt3003; local598++) {
													for (local601 = local1135.anInt3016; local601 <= local1135.anInt3011; local601++) {
														@Pc(1260) Class3_Sub21 local1260 = local31[local598][local601];
														if (local1260.anInt3094 != 0) {
															Static94.aClass5_19.method87(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean107) {
															Static94.aClass5_19.method87(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean106) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean106 = false;
											break;
										}
									}
								} while (!local8.aBoolean107);
							} while (local8.anInt3094 != 0);
							if (local17 > Static94.anInt2704 || local17 <= Static94.anInt2696) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean107);
						if (local17 < Static94.anInt2704 || local17 >= Static94.anInt2686 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean107);
					if (local20 > Static94.anInt2707 || local20 <= Static94.anInt2684) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean107);
				if (local20 < Static94.anInt2707 || local20 >= Static94.anInt2705 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean107);
			local8.aBoolean107 = false;
			Static94.anInt2695--;
			@Pc(1402) Class57 local1402 = local8.aClass57_1;
			if (local1402 != null && local1402.anInt2674 != 0) {
				if (local1402.aClass3_Sub1_Sub1_3 != null) {
					local1402.aClass3_Sub1_Sub1_3.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local1402.anInt2672 - Static94.anInt2688, local1402.anInt2676 - Static94.anInt2697 - local1402.anInt2674, local1402.anInt2679 - Static94.anInt2703, local1402.anInt2673);
				}
				if (local1402.aClass3_Sub1_Sub1_4 != null) {
					local1402.aClass3_Sub1_Sub1_4.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local1402.anInt2672 - Static94.anInt2688, local1402.anInt2676 - Static94.anInt2697 - local1402.anInt2674, local1402.anInt2679 - Static94.anInt2703, local1402.anInt2673);
				}
				if (local1402.aClass3_Sub1_Sub1_5 != null) {
					local1402.aClass3_Sub1_Sub1_5.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local1402.anInt2672 - Static94.anInt2688, local1402.anInt2676 - Static94.anInt2697 - local1402.anInt2674, local1402.anInt2679 - Static94.anInt2703, local1402.anInt2673);
				}
			}
			if (local8.anInt3088 != 0) {
				@Pc(1497) Class24 local1497 = local8.aClass24_1;
				if (local1497 != null && !this.method1734(local26, local17, local20, local1497.aClass3_Sub1_Sub1_1.anInt3333)) {
					if ((local1497.anInt1288 & local8.anInt3088) != 0) {
						local1497.aClass3_Sub1_Sub1_1.method2223(local1497.anInt1296, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local1497.anInt1290 - Static94.anInt2688, local1497.anInt1300 - Static94.anInt2697, local1497.anInt1297 - Static94.anInt2703, local1497.anInt1302);
					} else if ((local1497.anInt1288 & 0x300) != 0) {
						local251 = local1497.anInt1290 - Static94.anInt2688;
						local1126 = local1497.anInt1300 - Static94.anInt2697;
						local1011 = local1497.anInt1297 - Static94.anInt2703;
						local588 = local1497.anInt1296;
						if (local588 == 1 || local588 == 2) {
							local593 = -local251;
						} else {
							local593 = local251;
						}
						if (local588 == 2 || local588 == 3) {
							local598 = -local1011;
						} else {
							local598 = local1011;
						}
						if ((local1497.anInt1288 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static94.anIntArray287[local588];
							local610 = local1011 + Static94.anIntArray285[local588];
							local1497.aClass3_Sub1_Sub1_1.method2223(local588 * 512 + 256, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local601, local1126, local610, local1497.anInt1302);
						}
						if ((local1497.anInt1288 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static94.anIntArray286[local588];
							local610 = local1011 + Static94.anIntArray288[local588];
							local1497.aClass3_Sub1_Sub1_1.method2223(local588 * 512 + 1280 & 0x7FF, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local601, local1126, local610, local1497.anInt1302);
						}
					}
				}
				local952 = local8.aClass68_1;
				if (local952 != null) {
					if ((local952.anInt3052 & local8.anInt3088) != 0 && !this.method1779(local26, local17, local20, local952.anInt3052)) {
						local952.aClass3_Sub1_Sub1_7.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local952.anInt3054 - Static94.anInt2688, local952.anInt3057 - Static94.anInt2697, local952.anInt3050 - Static94.anInt2703, local952.anInt3048);
					}
					if ((local952.anInt3045 & local8.anInt3088) != 0 && !this.method1779(local26, local17, local20, local952.anInt3045)) {
						local952.aClass3_Sub1_Sub1_8.method2223(0, Static94.anInt2687, Static94.anInt2682, Static94.anInt2693, Static94.anInt2689, local952.anInt3054 - Static94.anInt2688, local952.anInt3057 - Static94.anInt2697, local952.anInt3050 - Static94.anInt2703, local952.anInt3048);
					}
				}
			}
			@Pc(1755) Class3_Sub21 local1755;
			if (local23 < this.anInt2683 - 1) {
				local1755 = this.aClass3_Sub21ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean107) {
					Static94.aClass5_19.method87(local1755);
				}
			}
			if (local17 < Static94.anInt2704) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean107) {
					Static94.aClass5_19.method87(local1755);
				}
			}
			if (local20 < Static94.anInt2707) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean107) {
					Static94.aClass5_19.method87(local1755);
				}
			}
			if (local17 > Static94.anInt2704) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean107) {
					Static94.aClass5_19.method87(local1755);
				}
			}
			if (local20 > Static94.anInt2707) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean107) {
					Static94.aClass5_19.method87(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIILclient!ee;IIZ)Z")
	public boolean method1767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return this.method1735(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!s;)V")
	private void method1769(@OriginalArg(0) Class64 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3004; local2 <= arg0.anInt3003; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3016; local6 <= arg0.anInt3011; local6++) {
				@Pc(17) Class3_Sub21 local17 = this.aClass3_Sub21ArrayArrayArray1[arg0.anInt3006][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt3091; local21++) {
						if (local17.aClass64Array3[local21] == arg0) {
							local17.anInt3091--;
							for (local36 = local21; local36 < local17.anInt3091; local36++) {
								local17.aClass64Array3[local36] = local17.aClass64Array3[local36 + 1];
								local17.anIntArray328[local36] = local17.anIntArray328[local36 + 1];
							}
							local17.aClass64Array3[local17.anInt3091] = null;
							break;
						}
					}
					local17.anInt3086 = 0;
					for (local36 = 0; local36 < local17.anInt3091; local36++) {
						local17.anInt3086 |= local17.anIntArray328[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class35 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class35(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub21ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub21ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub21(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass35_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class35(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub21ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub21ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub21(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass35_1 = local12;
		} else {
			@Pc(140) Class1 local140 = new Class1(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub21ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub21ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub21(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass1_1 = local140;
		}
	}

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "(III)V")
	public void method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass57_1 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "(III)Z")
	private boolean method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local8 == -Static94.anInt2691) {
			return false;
		} else if (local8 == Static94.anInt2691) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1733(local23 + 1, this.anIntArrayArrayArray8[arg0][arg1][arg2], local27 + 1) && this.method1733(local23 + 128 - 1, this.anIntArrayArrayArray8[arg0][arg1 + 1][arg2], local27 + 1) && this.method1733(local23 + 128 - 1, this.anIntArrayArrayArray8[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1733(local23 + 1, this.anIntArrayArrayArray8[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = Static94.anInt2691;
				return true;
			} else {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static94.anInt2691;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILclient!ee;ILclient!ee;Lclient!ee;)V")
	public void method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub1 arg6, @OriginalArg(7) Class3_Sub1_Sub1 arg7) {
		@Pc(3) Class57 local3 = new Class57();
		local3.aClass3_Sub1_Sub1_5 = arg4;
		local3.anInt2672 = arg1 * 128 + 64;
		local3.anInt2679 = arg2 * 128 + 64;
		local3.anInt2676 = arg3;
		local3.anInt2673 = arg5;
		local3.aClass3_Sub1_Sub1_3 = arg6;
		local3.aClass3_Sub1_Sub1_4 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class3_Sub21 local43 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt3091; local47++) {
				if ((local43.aClass64Array3[local47].anInt3012 & 0x100) == 256 && local43.aClass64Array3[local47].aClass3_Sub1_Sub1_6 instanceof Class3_Sub1_Sub1_Sub4) {
					@Pc(71) Class3_Sub1_Sub1_Sub4 local71 = (Class3_Sub1_Sub1_Sub4) local43.aClass64Array3[local47].aClass3_Sub1_Sub1_6;
					local71.method628();
					if (local71.anInt3333 > local34) {
						local34 = local71.anInt3333;
					}
				}
			}
		}
		local3.anInt2674 = local34;
		if (this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub21(arg0, arg1, arg2);
		}
		this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass57_1 = local3;
	}

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "(III)I")
	public int method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3091; local14++) {
			@Pc(20) Class64 local20 = local8.aClass64Array3[local14];
			if ((local20.anInt3019 >> 29 & 0x3) == 2 && local20.anInt3004 == arg1 && local20.anInt3016 == arg2) {
				return local20.anInt3019;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "(III)V")
	public void method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt3091; local13++) {
			@Pc(19) Class64 local19 = local8.aClass64Array3[local13];
			if ((local19.anInt3019 >> 29 & 0x3) == 2 && local19.anInt3004 == arg1 && local19.anInt3016 == arg2) {
				this.method1769(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILclient!ee;II)V")
	public void method1776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class52 local6 = new Class52();
		local6.aClass3_Sub1_Sub1_2 = arg4;
		local6.anInt2575 = arg1 * 128 + 64;
		local6.anInt2574 = arg2 * 128 + 64;
		local6.anInt2570 = arg3;
		local6.anInt2572 = arg5;
		local6.anInt2571 = arg6;
		if (this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub21(arg0, arg1, arg2);
		}
		this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass52_1 = local6;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([IIIIII)V")
	public void method1777(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class35 local14 = local8.aClass35_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1741;
			if (local19 != 0) {
				for (local24 = 0; local24 < 4; local24++) {
					arg0[arg1] = local19;
					arg0[arg1 + 1] = local19;
					arg0[arg1 + 2] = local19;
					arg0[arg1 + 3] = local19;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(59) Class1 local59 = local8.aClass1_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt3;
		@Pc(68) int local68 = local59.anInt1;
		@Pc(71) int local71 = local59.anInt4;
		@Pc(74) int local74 = local59.anInt2;
		@Pc(79) int[] local79 = this.anIntArrayArray66[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray67[local68];
		@Pc(86) int local86 = 0;
		@Pc(90) int local90;
		if (local71 != 0) {
			for (local90 = 0; local90 < 4; local90++) {
				arg0[arg1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 2] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 3] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg1 += 512;
			}
			return;
		}
		for (local90 = 0; local90 < 4; local90++) {
			if (local79[local84[local86++]] != 0) {
				arg0[arg1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 2] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 3] = local74;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "(III)Lclient!sd;")
	public Class68 method1778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass68_1;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(IIII)Z")
	private boolean method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1772(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray8[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static94.anInt2688) {
					if (!this.method1733(local11, local26, local15)) {
						return false;
					}
					if (!this.method1733(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1733(local11, local30, local15)) {
						return false;
					}
					if (!this.method1733(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1733(local11, local34, local15)) {
					return false;
				}
				if (!this.method1733(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static94.anInt2703) {
					if (!this.method1733(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1733(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1733(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1733(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1733(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1733(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static94.anInt2688) {
					if (!this.method1733(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1733(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1733(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1733(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1733(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1733(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static94.anInt2703) {
					if (!this.method1733(local11, local26, local15)) {
						return false;
					}
					if (!this.method1733(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1733(local11, local30, local15)) {
						return false;
					}
					if (!this.method1733(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1733(local11, local34, local15)) {
					return false;
				}
				if (!this.method1733(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1733(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1733(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1733(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1733(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1733(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub21 local8 = this.aClass3_Sub21ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub21 local31 = this.aClass3_Sub21ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub21ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt3084--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt3091; local41++) {
					@Pc(47) Class64 local47 = local31.aClass64Array3[local41];
					if ((local47.anInt3019 >> 29 & 0x3) == 2 && local47.anInt3004 == arg0 && local47.anInt3016 == arg1) {
						local47.anInt3006--;
					}
				}
			}
		}
		if (this.aClass3_Sub21ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub21ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub21(0, arg0, arg1);
		}
		this.aClass3_Sub21ArrayArrayArray1[0][arg0][arg1].aClass3_Sub21_1 = local8;
		this.aClass3_Sub21ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILclient!ee;Lclient!ee;IIII)V")
	public void method1781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) Class3_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class68 local8 = new Class68();
		local8.anInt3048 = arg8;
		local8.anInt3044 = arg9;
		local8.anInt3054 = arg1 * 128 + 64;
		local8.anInt3050 = arg2 * 128 + 64;
		local8.anInt3057 = arg3;
		local8.aClass3_Sub1_Sub1_8 = arg4;
		local8.aClass3_Sub1_Sub1_7 = arg5;
		local8.anInt3045 = arg6;
		local8.anInt3052 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub21ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub21ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub21(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass68_1 = local8;
	}
}
