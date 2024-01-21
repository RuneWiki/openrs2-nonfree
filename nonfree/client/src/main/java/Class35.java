import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class35 {

	@OriginalMember(owner = "client!i", name = "l", descriptor = "[Lclient!ac;")
	private final Class4[] aClass4Array3 = new Class4[5000];

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	private int anInt1491 = 0;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "I")
	private int anInt1496 = 0;

	@OriginalMember(owner = "client!i", name = "P", descriptor = "[[I")
	private final int[][] anIntArrayArray8 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!i", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray7 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	private final int anInt1485;

	@OriginalMember(owner = "client!i", name = "E", descriptor = "I")
	private final int anInt1504;

	@OriginalMember(owner = "client!i", name = "N", descriptor = "I")
	private final int anInt1510;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "[[[Lclient!dd;")
	private final Class3_Sub6[][][] aClass3_Sub6ArrayArrayArray1;

	@OriginalMember(owner = "client!i", name = "A", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!i", name = "I", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[[I)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1485 = arg0;
		this.anInt1504 = arg1;
		this.anInt1510 = arg2;
		this.aClass3_Sub6ArrayArrayArray1 = new Class3_Sub6[arg0][arg1][arg2];
		this.anIntArrayArrayArray3 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray4 = arg3;
		this.method1178();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	public void method1129() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1496; local1++) {
			@Pc(7) Class4 local7 = this.aClass4Array3[local1];
			this.method1169(local7);
			this.aClass4Array3[local1] = null;
		}
		this.anInt1496 = 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)I")
	public int method1130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass34_1 != null && local8.aClass34_1.anInt1474 == arg3) {
			return local8.aClass34_1.anInt1479 & 0xFF;
		} else if (local8.aClass51_1 != null && local8.aClass51_1.anInt2081 == arg3) {
			return local8.aClass51_1.anInt2071 & 0xFF;
		} else if (local8.aClass55_1 != null && local8.aClass55_1.anInt2527 == arg3) {
			return local8.aClass55_1.anInt2521 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt774; local56++) {
				if (local8.aClass4Array1[local56].anInt68 == arg3) {
					return local8.aClass4Array1[local56].anInt66 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Lclient!hh;")
	public Class34 method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass34_1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII)V")
	public void method1133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1504 * 128) {
			arg0 = this.anInt1504 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1510 * 128) {
			arg2 = this.anInt1510 * 128 - 1;
		}
		Static64.anInt1503++;
		Static64.anInt1492 = Class3_Sub1_Sub3_Sub2.anIntArray87[arg3];
		Static64.anInt1499 = Class3_Sub1_Sub3_Sub2.anIntArray88[arg3];
		Static64.anInt1502 = Class3_Sub1_Sub3_Sub2.anIntArray87[arg4];
		Static64.anInt1484 = Class3_Sub1_Sub3_Sub2.anIntArray88[arg4];
		Static64.aBooleanArrayArray1 = Static64.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static64.anInt1505 = arg0;
		Static64.anInt1489 = arg1;
		Static64.anInt1507 = arg2;
		Static64.anInt1498 = arg0 / 128;
		Static64.anInt1495 = arg2 / 128;
		Static64.anInt1500 = arg5;
		Static64.anInt1493 = Static64.anInt1498 - Static64.anInt1509;
		if (Static64.anInt1493 < 0) {
			Static64.anInt1493 = 0;
		}
		Static64.anInt1483 = Static64.anInt1495 - Static64.anInt1509;
		if (Static64.anInt1483 < 0) {
			Static64.anInt1483 = 0;
		}
		Static64.anInt1488 = Static64.anInt1498 + Static64.anInt1509;
		if (Static64.anInt1488 > this.anInt1504) {
			Static64.anInt1488 = this.anInt1504;
		}
		Static64.anInt1508 = Static64.anInt1495 + Static64.anInt1509;
		if (Static64.anInt1508 > this.anInt1510) {
			Static64.anInt1508 = this.anInt1510;
		}
		this.method1136();
		Static64.anInt1494 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1491; local128 < this.anInt1485; local128++) {
			@Pc(134) Class3_Sub6[][] local134 = this.aClass3_Sub6ArrayArrayArray1[local128];
			for (local136 = Static64.anInt1493; local136 < Static64.anInt1488; local136++) {
				for (local139 = Static64.anInt1483; local139 < Static64.anInt1508; local139++) {
					@Pc(146) Class3_Sub6 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt781 <= arg5 && (Static64.aBooleanArrayArray1[local136 + Static64.anInt1509 - Static64.anInt1498][local139 + Static64.anInt1509 - Static64.anInt1495] || this.anIntArrayArrayArray4[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean49 = true;
							local146.aBoolean48 = true;
							if (local146.anInt774 > 0) {
								local146.aBoolean47 = true;
							} else {
								local146.aBoolean47 = false;
							}
							Static64.anInt1494++;
						} else {
							local146.aBoolean49 = false;
							local146.aBoolean48 = false;
							local146.anInt780 = 0;
						}
					}
				}
			}
		}
		@Pc(242) int local242;
		@Pc(251) int local251;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(238) int local238;
		for (@Pc(224) int local224 = this.anInt1491; local224 < this.anInt1485; local224++) {
			@Pc(230) Class3_Sub6[][] local230 = this.aClass3_Sub6ArrayArrayArray1[local224];
			for (local139 = -Static64.anInt1509; local139 <= 0; local139++) {
				local238 = Static64.anInt1498 + local139;
				local242 = Static64.anInt1498 - local139;
				if (local238 >= Static64.anInt1493 || local242 < Static64.anInt1488) {
					for (local251 = -Static64.anInt1509; local251 <= 0; local251++) {
						local256 = Static64.anInt1495 + local251;
						local260 = Static64.anInt1495 - local251;
						@Pc(272) Class3_Sub6 local272;
						if (local238 >= Static64.anInt1493) {
							if (local256 >= Static64.anInt1483) {
								local272 = local230[local238][local256];
								if (local272 != null && local272.aBoolean49) {
									this.method1160(local272, true);
								}
							}
							if (local260 < Static64.anInt1508) {
								local272 = local230[local238][local260];
								if (local272 != null && local272.aBoolean49) {
									this.method1160(local272, true);
								}
							}
						}
						if (local242 < Static64.anInt1488) {
							if (local256 >= Static64.anInt1483) {
								local272 = local230[local242][local256];
								if (local272 != null && local272.aBoolean49) {
									this.method1160(local272, true);
								}
							}
							if (local260 < Static64.anInt1508) {
								local272 = local230[local242][local260];
								if (local272 != null && local272.aBoolean49) {
									this.method1160(local272, true);
								}
							}
						}
						if (Static64.anInt1494 == 0) {
							Static64.aBoolean96 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1491; local136 < this.anInt1485; local136++) {
			@Pc(363) Class3_Sub6[][] local363 = this.aClass3_Sub6ArrayArrayArray1[local136];
			for (local238 = -Static64.anInt1509; local238 <= 0; local238++) {
				local242 = Static64.anInt1498 + local238;
				local251 = Static64.anInt1498 - local238;
				if (local242 >= Static64.anInt1493 || local251 < Static64.anInt1488) {
					for (local256 = -Static64.anInt1509; local256 <= 0; local256++) {
						local260 = Static64.anInt1495 + local256;
						@Pc(393) int local393 = Static64.anInt1495 - local256;
						@Pc(405) Class3_Sub6 local405;
						if (local242 >= Static64.anInt1493) {
							if (local260 >= Static64.anInt1483) {
								local405 = local363[local242][local260];
								if (local405 != null && local405.aBoolean49) {
									this.method1160(local405, false);
								}
							}
							if (local393 < Static64.anInt1508) {
								local405 = local363[local242][local393];
								if (local405 != null && local405.aBoolean49) {
									this.method1160(local405, false);
								}
							}
						}
						if (local251 < Static64.anInt1488) {
							if (local260 >= Static64.anInt1483) {
								local405 = local363[local251][local260];
								if (local405 != null && local405.aBoolean49) {
									this.method1160(local405, false);
								}
							}
							if (local393 < Static64.anInt1508) {
								local405 = local363[local251][local393];
								if (local405 != null && local405.aBoolean49) {
									this.method1160(local405, false);
								}
							}
						}
						if (Static64.anInt1494 == 0) {
							Static64.aBoolean96 = false;
							return;
						}
					}
				}
			}
		}
		Static64.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(IIII)Z")
	private boolean method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1177(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray4[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static64.anInt1505) {
					if (!this.method1171(local11, local26, local15)) {
						return false;
					}
					if (!this.method1171(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1171(local11, local30, local15)) {
						return false;
					}
					if (!this.method1171(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1171(local11, local34, local15)) {
					return false;
				}
				if (!this.method1171(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static64.anInt1507) {
					if (!this.method1171(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1171(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1171(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1171(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1171(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1171(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static64.anInt1505) {
					if (!this.method1171(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1171(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1171(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1171(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1171(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1171(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static64.anInt1507) {
					if (!this.method1171(local11, local26, local15)) {
						return false;
					}
					if (!this.method1171(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1171(local11, local30, local15)) {
						return false;
					}
					if (!this.method1171(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1171(local11, local34, local15)) {
					return false;
				}
				if (!this.method1171(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1171(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1171(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1171(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1171(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1171(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)Lclient!lg;")
	public Class51 method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass51_1;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	private void method1136() {
		@Pc(3) int local3 = Static64.anIntArray157[Static64.anInt1500];
		@Pc(7) Class84[] local7 = Static64.aClass84ArrayArray1[Static64.anInt1500];
		Static64.anInt1497 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class84 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt3818 == 1) {
				local27 = local16.anInt3803 + Static64.anInt1509 - Static64.anInt1498;
				if (local27 >= 0 && local27 <= Static64.anInt1509 + Static64.anInt1509) {
					local42 = local16.anInt3808 + Static64.anInt1509 - Static64.anInt1495;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3816 + Static64.anInt1509 - Static64.anInt1495;
					if (local53 > Static64.anInt1509 + Static64.anInt1509) {
						local53 = Static64.anInt1509 + Static64.anInt1509;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static64.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static64.anInt1505 - local16.anInt3800;
						if (local85 > 32) {
							local16.anInt3813 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3813 = 2;
							local85 = -local85;
						}
						local16.anInt3797 = (local16.anInt3805 - Static64.anInt1507 << 8) / local85;
						local16.anInt3814 = (local16.anInt3807 - Static64.anInt1507 << 8) / local85;
						local16.anInt3817 = (local16.anInt3815 - Static64.anInt1489 << 8) / local85;
						local16.anInt3809 = (local16.anInt3796 - Static64.anInt1489 << 8) / local85;
						Static64.aClass84Array1[Static64.anInt1497++] = local16;
					}
				}
			} else if (local16.anInt3818 == 2) {
				local27 = local16.anInt3808 + Static64.anInt1509 - Static64.anInt1495;
				if (local27 >= 0 && local27 <= Static64.anInt1509 + Static64.anInt1509) {
					local42 = local16.anInt3803 + Static64.anInt1509 - Static64.anInt1498;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3802 + Static64.anInt1509 - Static64.anInt1498;
					if (local53 > Static64.anInt1509 + Static64.anInt1509) {
						local53 = Static64.anInt1509 + Static64.anInt1509;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static64.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static64.anInt1507 - local16.anInt3805;
						if (local85 > 32) {
							local16.anInt3813 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3813 = 4;
							local85 = -local85;
						}
						local16.anInt3806 = (local16.anInt3800 - Static64.anInt1505 << 8) / local85;
						local16.anInt3811 = (local16.anInt3812 - Static64.anInt1505 << 8) / local85;
						local16.anInt3817 = (local16.anInt3815 - Static64.anInt1489 << 8) / local85;
						local16.anInt3809 = (local16.anInt3796 - Static64.anInt1489 << 8) / local85;
						Static64.aClass84Array1[Static64.anInt1497++] = local16;
					}
				}
			} else if (local16.anInt3818 == 4) {
				local27 = local16.anInt3815 - Static64.anInt1489;
				if (local27 > 128) {
					local42 = local16.anInt3808 + Static64.anInt1509 - Static64.anInt1495;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3816 + Static64.anInt1509 - Static64.anInt1495;
					if (local53 > Static64.anInt1509 + Static64.anInt1509) {
						local53 = Static64.anInt1509 + Static64.anInt1509;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt3803 + Static64.anInt1509 - Static64.anInt1498;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt3802 + Static64.anInt1509 - Static64.anInt1498;
						if (local85 > Static64.anInt1509 + Static64.anInt1509) {
							local85 = Static64.anInt1509 + Static64.anInt1509;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static64.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt3813 = 5;
							local16.anInt3806 = (local16.anInt3800 - Static64.anInt1505 << 8) / local27;
							local16.anInt3811 = (local16.anInt3812 - Static64.anInt1505 << 8) / local27;
							local16.anInt3797 = (local16.anInt3805 - Static64.anInt1507 << 8) / local27;
							local16.anInt3814 = (local16.anInt3807 - Static64.anInt1507 << 8) / local27;
							Static64.aClass84Array1[Static64.anInt1497++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIILclient!ed;IIIIII)Z")
	public boolean method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub1_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1173(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(III)V")
	public void method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass51_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(III)V")
	public void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass55_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(III)Lclient!ac;")
	public Class4 method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt774; local14++) {
			@Pc(20) Class4 local20 = local8.aClass4Array1[local14];
			if ((local20.anInt68 >> 29 & 0x3) == 2 && local20.anInt69 == arg1 && local20.anInt63 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(III)V")
	public void method1142() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1485; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1504; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1510; local7++) {
					@Pc(17) Class3_Sub6 local17 = this.aClass3_Sub6ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class34 local22 = local17.aClass34_1;
						if (local22 != null && local22.aClass3_Sub1_Sub4_2 instanceof Class3_Sub1_Sub4_Sub4) {
							@Pc(32) Class3_Sub1_Sub4_Sub4 local32 = (Class3_Sub1_Sub4_Sub4) local22.aClass3_Sub1_Sub4_2;
							this.method1155(local32, local1, local4, local7, 1, 1);
							if (local22.aClass3_Sub1_Sub4_3 instanceof Class3_Sub1_Sub4_Sub4) {
								@Pc(48) Class3_Sub1_Sub4_Sub4 local48 = (Class3_Sub1_Sub4_Sub4) local22.aClass3_Sub1_Sub4_3;
								this.method1155(local48, local1, local4, local7, 1, 1);
								Static89.method1569(local32, local48, 0, 0, 0, false);
								local22.aClass3_Sub1_Sub4_3 = local48.method1558(local48.aShort12, local48.aShort8, -50, -10, -50, false);
							}
							local22.aClass3_Sub1_Sub4_2 = local32.method1558(local32.aShort12, local32.aShort8, -50, -10, -50, false);
						}
						@Pc(107) Class3_Sub1_Sub4_Sub4 local107;
						for (@Pc(91) int local91 = 0; local91 < local17.anInt774; local91++) {
							@Pc(97) Class4 local97 = local17.aClass4Array1[local91];
							if (local97 != null && local97.aClass3_Sub1_Sub4_1 instanceof Class3_Sub1_Sub4_Sub4) {
								local107 = (Class3_Sub1_Sub4_Sub4) local97.aClass3_Sub1_Sub4_1;
								this.method1155(local107, local1, local4, local7, local97.anInt74 + 1 - local97.anInt69, local97.anInt61 - local97.anInt63 + 1);
								local97.aClass3_Sub1_Sub4_1 = local107.method1558(local107.aShort12, local107.aShort8, -50, -10, -50, false);
							}
						}
						@Pc(148) Class55 local148 = local17.aClass55_1;
						if (local148 != null && local148.aClass3_Sub1_Sub4_6 instanceof Class3_Sub1_Sub4_Sub4) {
							local107 = (Class3_Sub1_Sub4_Sub4) local148.aClass3_Sub1_Sub4_6;
							this.method1152(local107, local1, local4, local7);
							local148.aClass3_Sub1_Sub4_6 = local107.method1558(local107.aShort12, local107.aShort8, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!he;IIIIIII)V")
	private void method1143(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static64.anInt1505;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static64.anInt1507;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray4[arg1][arg6][arg7] - Static64.anInt1489;
		@Pc(51) int local51 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7] - Static64.anInt1489;
		@Pc(66) int local66 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7 + 1] - Static64.anInt1489;
		@Pc(79) int local79 = this.anIntArrayArrayArray4[arg1][arg6][arg7 + 1] - Static64.anInt1489;
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
		@Pc(279) int local279 = Static36.anInt871 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static36.anInt870 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static36.anInt871 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static36.anInt870 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static36.anInt871 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static36.anInt870 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static36.anInt871 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static36.anInt870 + (local89 << 9) / local265;
		Static36.anInt867 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			if (Static64.aBoolean96 && this.method1148(Static64.anInt1490, Static64.anInt1486, local319, local335, local303, local311, local327, local295)) {
				Static64.anInt1487 = arg6;
				Static64.anInt1506 = arg7;
			}
			Static36.aBoolean54 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static36.anInt868 || local327 > Static36.anInt868 || local295 > Static36.anInt868) {
				Static36.aBoolean54 = true;
			}
			if (arg0.anInt1453 == -1) {
				if (arg0.anInt1451 != 12345678) {
					Static36.method655(local319, local335, local303, local311, local327, local295, arg0.anInt1451, arg0.anInt1454, arg0.anInt1464);
				}
			} else if (Static64.aBoolean97) {
				local472 = Static36.anInterface1_2.method1724(arg0.anInt1453);
				Static36.method655(local319, local335, local303, local311, local327, local295, Static64.method1137(local472, arg0.anInt1451), Static64.method1137(local472, arg0.anInt1454), Static64.method1137(local472, arg0.anInt1464));
			} else if (arg0.aBoolean95) {
				Static36.method660(local319, local335, local303, local311, local327, local295, arg0.anInt1451, arg0.anInt1454, arg0.anInt1464, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1453);
			} else {
				Static36.method660(local319, local335, local303, local311, local327, local295, arg0.anInt1451, arg0.anInt1454, arg0.anInt1464, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1453);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		if (Static64.aBoolean96 && this.method1148(Static64.anInt1490, Static64.anInt1486, local287, local303, local335, local279, local295, local327)) {
			Static64.anInt1487 = arg6;
			Static64.anInt1506 = arg7;
		}
		Static36.aBoolean54 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static36.anInt868 || local295 > Static36.anInt868 || local327 > Static36.anInt868) {
			Static36.aBoolean54 = true;
		}
		if (arg0.anInt1453 != -1) {
			if (!Static64.aBoolean97) {
				Static36.method660(local287, local303, local335, local279, local295, local327, arg0.anInt1465, arg0.anInt1464, arg0.anInt1454, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1453);
				return;
			}
			local472 = Static36.anInterface1_2.method1724(arg0.anInt1453);
			Static36.method655(local287, local303, local335, local279, local295, local327, Static64.method1137(local472, arg0.anInt1465), Static64.method1137(local472, arg0.anInt1464), Static64.method1137(local472, arg0.anInt1454));
		} else if (arg0.anInt1465 != 12345678) {
			Static36.method655(local287, local303, local335, local279, local295, local327, arg0.anInt1465, arg0.anInt1464, arg0.anInt1454);
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIILclient!ed;IIZ)Z")
	public boolean method1144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1173(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILclient!ed;II)V")
	public void method1145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class55 local6 = new Class55();
		local6.aClass3_Sub1_Sub4_6 = arg4;
		local6.anInt2522 = arg1 * 128 + 64;
		local6.anInt2524 = arg2 * 128 + 64;
		local6.anInt2523 = arg3;
		local6.anInt2527 = arg5;
		local6.anInt2521 = arg6;
		if (this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub6(arg0, arg1, arg2);
		}
		this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass55_1 = local6;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILclient!ed;Lclient!ed;IIII)V")
	public void method1146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4, @OriginalArg(5) Class3_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class34 local8 = new Class34();
		local8.anInt1474 = arg8;
		local8.anInt1479 = arg9;
		local8.anInt1475 = arg1 * 128 + 64;
		local8.anInt1477 = arg2 * 128 + 64;
		local8.anInt1476 = arg3;
		local8.aClass3_Sub1_Sub4_2 = arg4;
		local8.aClass3_Sub1_Sub4_3 = arg5;
		local8.anInt1480 = arg6;
		local8.anInt1478 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub6ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub6ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub6(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass34_1 = local8;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class31 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class31(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class31(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local12;
		} else {
			@Pc(140) Class86 local140 = new Class86(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass86_1 = local140;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(III)I")
	public int method1149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass34_1 == null ? 0 : local8.aClass34_1.anInt1474;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILclient!ed;ILclient!ed;Lclient!ed;)V")
	public void method1150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub4 arg6, @OriginalArg(7) Class3_Sub1_Sub4 arg7) {
		@Pc(3) Class77 local3 = new Class77();
		local3.aClass3_Sub1_Sub4_7 = arg4;
		local3.anInt3487 = arg1 * 128 + 64;
		local3.anInt3489 = arg2 * 128 + 64;
		local3.anInt3484 = arg3;
		local3.anInt3481 = arg5;
		local3.aClass3_Sub1_Sub4_9 = arg6;
		local3.aClass3_Sub1_Sub4_8 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(43) Class3_Sub6 local43 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt774; local47++) {
				if ((local43.aClass4Array1[local47].anInt66 & 0x100) == 256 && local43.aClass4Array1[local47].aClass3_Sub1_Sub4_1 instanceof Class3_Sub1_Sub4_Sub5) {
					@Pc(71) Class3_Sub1_Sub4_Sub5 local71 = (Class3_Sub1_Sub4_Sub5) local43.aClass4Array1[local47].aClass3_Sub1_Sub4_1;
					local71.method1880();
					if (local71.aShort32 < local34) {
						local34 = local71.aShort32;
					}
				}
			}
		}
		local3.anInt3485 = -local34;
		if (this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub6(arg0, arg1, arg2);
		}
		this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass77_1 = local3;
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(III)Lclient!ne;")
	public Class55 method1151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass55_1 == null ? null : local8.aClass55_1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!lb;III)V")
	private void method1152(@OriginalArg(0) Class3_Sub1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub6 local14;
		@Pc(29) Class3_Sub1_Sub4_Sub4 local29;
		if (arg2 < this.anInt1504) {
			local14 = this.aClass3_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass55_1 != null && local14.aClass55_1.aClass3_Sub1_Sub4_6 instanceof Class3_Sub1_Sub4_Sub4) {
				local29 = (Class3_Sub1_Sub4_Sub4) local14.aClass55_1.aClass3_Sub1_Sub4_6;
				Static89.method1569(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1504) {
			local14 = this.aClass3_Sub6ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass55_1 != null && local14.aClass55_1.aClass3_Sub1_Sub4_6 instanceof Class3_Sub1_Sub4_Sub4) {
				local29 = (Class3_Sub1_Sub4_Sub4) local14.aClass55_1.aClass3_Sub1_Sub4_6;
				Static89.method1569(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1504 && arg3 < this.anInt1510) {
			local14 = this.aClass3_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass55_1 != null && local14.aClass55_1.aClass3_Sub1_Sub4_6 instanceof Class3_Sub1_Sub4_Sub4) {
				local29 = (Class3_Sub1_Sub4_Sub4) local14.aClass55_1.aClass3_Sub1_Sub4_6;
				Static89.method1569(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1504 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass55_1 != null && local14.aClass55_1.aClass3_Sub1_Sub4_6 instanceof Class3_Sub1_Sub4_Sub4) {
			local29 = (Class3_Sub1_Sub4_Sub4) local14.aClass55_1.aClass3_Sub1_Sub4_6;
			Static89.method1569(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "(III)I")
	public int method1154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass55_1 == null ? 0 : local8.aClass55_1.anInt2527;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!lb;IIIII)V")
	private void method1155(@OriginalArg(0) Class3_Sub1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1485) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1504) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1510 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub6 local66 = this.aClass3_Sub6ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray4[local17][local24][local34] + this.anIntArrayArrayArray4[local17][local24 + 1][local34] + this.anIntArrayArrayArray4[local17][local24][local34 + 1] + this.anIntArrayArrayArray4[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray4[arg1][arg2][arg3] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray4[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class34 local163 = local66.aClass34_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub1_Sub4_Sub4 local173;
										if (local163.aClass3_Sub1_Sub4_2 instanceof Class3_Sub1_Sub4_Sub4) {
											local173 = (Class3_Sub1_Sub4_Sub4) local163.aClass3_Sub1_Sub4_2;
											Static89.method1569(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass3_Sub1_Sub4_3 instanceof Class3_Sub1_Sub4_Sub4) {
											local173 = (Class3_Sub1_Sub4_Sub4) local163.aClass3_Sub1_Sub4_3;
											Static89.method1569(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt774; local237++) {
										@Pc(243) Class4 local243 = local66.aClass4Array1[local237];
										if (local243 != null && local243.aClass3_Sub1_Sub4_1 instanceof Class3_Sub1_Sub4_Sub4) {
											@Pc(253) Class3_Sub1_Sub4_Sub4 local253 = (Class3_Sub1_Sub4_Sub4) local243.aClass3_Sub1_Sub4_1;
											@Pc(261) int local261 = local243.anInt74 + 1 - local243.anInt69;
											@Pc(269) int local269 = local243.anInt61 + 1 - local243.anInt63;
											Static89.method1569(arg0, local253, (local243.anInt69 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt63 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(IIII)V")
	public void method1156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class51 local14 = local8.aClass51_1;
		if (local14 != null) {
			local14.anInt2070 = local14.anInt2070 * arg3 / 16;
			local14.anInt2072 = local14.anInt2072 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!w;IIIIII)V")
	private void method1157(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray411.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray411[local5] - Static64.anInt1505;
			local20 = arg0.anIntArray415[local5] - Static64.anInt1489;
			local27 = arg0.anIntArray410[local5] - Static64.anInt1507;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray403 != null) {
				Static174.anIntArray402[local5] = local37;
				Static174.anIntArray405[local5] = local59;
				Static174.anIntArray408[local5] = local69;
			}
			Static174.anIntArray407[local5] = Static36.anInt871 + (local37 << 9) / local69;
			Static174.anIntArray413[local5] = Static36.anInt870 + (local59 << 9) / local69;
		}
		Static36.anInt867 = 0;
		local3 = arg0.anIntArray406.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray406[local13];
			local27 = arg0.anIntArray416[local13];
			local37 = arg0.anIntArray412[local13];
			@Pc(142) int local142 = Static174.anIntArray407[local20];
			@Pc(146) int local146 = Static174.anIntArray407[local27];
			@Pc(150) int local150 = Static174.anIntArray407[local37];
			@Pc(154) int local154 = Static174.anIntArray413[local20];
			@Pc(158) int local158 = Static174.anIntArray413[local27];
			@Pc(162) int local162 = Static174.anIntArray413[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static64.aBoolean96 && this.method1148(Static64.anInt1490, Static64.anInt1486, local154, local158, local162, local142, local146, local150)) {
					Static64.anInt1487 = arg5;
					Static64.anInt1506 = arg6;
				}
				Static36.aBoolean54 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static36.anInt868 || local146 > Static36.anInt868 || local150 > Static36.anInt868) {
					Static36.aBoolean54 = true;
				}
				if (arg0.anIntArray403 == null || arg0.anIntArray403[local13] == -1) {
					if (arg0.anIntArray404[local13] != 12345678) {
						Static36.method655(local154, local158, local162, local142, local146, local150, arg0.anIntArray404[local13], arg0.anIntArray409[local13], arg0.anIntArray414[local13]);
					}
				} else if (Static64.aBoolean97) {
					@Pc(364) int local364 = Static36.anInterface1_2.method1724(arg0.anIntArray403[local13]);
					Static36.method655(local154, local158, local162, local142, local146, local150, Static64.method1137(local364, arg0.anIntArray404[local13]), Static64.method1137(local364, arg0.anIntArray409[local13]), Static64.method1137(local364, arg0.anIntArray414[local13]));
				} else if (arg0.aBoolean263) {
					Static36.method660(local154, local158, local162, local142, local146, local150, arg0.anIntArray404[local13], arg0.anIntArray409[local13], arg0.anIntArray414[local13], Static174.anIntArray402[0], Static174.anIntArray402[1], Static174.anIntArray402[3], Static174.anIntArray405[0], Static174.anIntArray405[1], Static174.anIntArray405[3], Static174.anIntArray408[0], Static174.anIntArray408[1], Static174.anIntArray408[3], arg0.anIntArray403[local13]);
				} else {
					Static36.method660(local154, local158, local162, local142, local146, local150, arg0.anIntArray404[local13], arg0.anIntArray409[local13], arg0.anIntArray414[local13], Static174.anIntArray402[local20], Static174.anIntArray402[local27], Static174.anIntArray402[local37], Static174.anIntArray405[local20], Static174.anIntArray405[local27], Static174.anIntArray405[local37], Static174.anIntArray408[local20], Static174.anIntArray408[local27], Static174.anIntArray408[local37], arg0.anIntArray403[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public void method1158(@OriginalArg(0) int arg0) {
		this.anInt1491 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1504; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1510; local7++) {
				if (this.aClass3_Sub6ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub6ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub6(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "j", descriptor = "(III)V")
	public void method1159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass34_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dd;Z)V")
	private void method1160(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) boolean arg1) {
		Static64.aClass72_21.method2404(arg0);
		while (true) {
			@Pc(8) Class3_Sub6 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub6[][] local31;
			@Pc(49) Class3_Sub6 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class34 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class4 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class3_Sub6 var33;
										while (true) {
											do {
												local8 = (Class3_Sub6) Static64.aClass72_21.method2406();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean48);
											local17 = local8.anInt783;
											local20 = local8.anInt776;
											local23 = local8.anInt785;
											local26 = local8.anInt778;
											local31 = this.aClass3_Sub6ArrayArrayArray1[local23];
											if (!local8.aBoolean49) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub6ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean48) {
														continue;
													}
												}
												if (local17 <= Static64.anInt1498 && local17 > Static64.anInt1493) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean48 && (local49.aBoolean49 || (local8.anInt773 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static64.anInt1498 && local17 < Static64.anInt1488 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean48 && (local49.aBoolean49 || (local8.anInt773 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static64.anInt1495 && local20 > Static64.anInt1483) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean48 && (local49.aBoolean49 || (local8.anInt773 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static64.anInt1495 && local20 < Static64.anInt1508 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean48 && (local49.aBoolean49 || (local8.anInt773 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean49 = false;
											if (local8.aClass3_Sub6_1 != null) {
												local49 = local8.aClass3_Sub6_1;
												if (local49.aClass31_1 == null) {
													if (local49.aClass86_1 != null && !this.method1177(0, local17, local20)) {
														this.method1157(local49.aClass86_1, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local17, local20);
													}
												} else if (!this.method1177(0, local17, local20)) {
													this.method1143(local49.aClass31_1, 0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local17, local20);
												}
												@Pc(225) Class34 local225 = local49.aClass34_1;
												if (local225 != null) {
													local225.aClass3_Sub1_Sub4_2.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local225.anInt1475 - Static64.anInt1505, local225.anInt1476 - Static64.anInt1489, local225.anInt1477 - Static64.anInt1507, local225.anInt1474);
												}
												for (local251 = 0; local251 < local49.anInt774; local251++) {
													var12 = local49.aClass4Array1[local251];
													if (var12 != null) {
														var12.aClass3_Sub1_Sub4_1.method2260(var12.anInt73, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, var12.anInt64 - Static64.anInt1505, var12.anInt62 - Static64.anInt1489, var12.anInt65 - Static64.anInt1507, var12.anInt68);
													}
												}
											}
											var22 = false;
											if (local8.aClass31_1 == null) {
												if (local8.aClass86_1 != null && !this.method1177(local26, local17, local20)) {
													var22 = true;
													this.method1157(local8.aClass86_1, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local17, local20);
												}
											} else if (!this.method1177(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass31_1.anInt1451 != 12345678 || Static64.aBoolean96 && local23 <= Static64.anInt1482) {
													this.method1143(local8.aClass31_1, local26, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class34 local350 = local8.aClass34_1;
											@Pc(353) Class51 local353 = local8.aClass51_1;
											if (local350 != null || local353 != null) {
												if (Static64.anInt1498 == local17) {
													var21++;
												} else if (Static64.anInt1498 < local17) {
													var21 += 2;
												}
												if (Static64.anInt1495 == local20) {
													var21 += 3;
												} else if (Static64.anInt1495 > local20) {
													var21 += 6;
												}
												local251 = Static64.anIntArray160[var21];
												local8.anInt779 = Static64.anIntArray158[var21];
											}
											if (local350 != null) {
												if ((local350.anInt1480 & Static64.anIntArray162[var21]) == 0) {
													local8.anInt780 = 0;
												} else if (local350.anInt1480 == 16) {
													local8.anInt780 = 3;
													local8.anInt784 = Static64.anIntArray164[var21];
													local8.anInt777 = 3 - local8.anInt784;
												} else if (local350.anInt1480 == 32) {
													local8.anInt780 = 6;
													local8.anInt784 = Static64.anIntArray161[var21];
													local8.anInt777 = 6 - local8.anInt784;
												} else if (local350.anInt1480 == 64) {
													local8.anInt780 = 12;
													local8.anInt784 = Static64.anIntArray163[var21];
													local8.anInt777 = 12 - local8.anInt784;
												} else {
													local8.anInt780 = 9;
													local8.anInt784 = Static64.anIntArray159[var21];
													local8.anInt777 = 9 - local8.anInt784;
												}
												if ((local350.anInt1480 & local251) != 0 && !this.method1134(local26, local17, local20, local350.anInt1480)) {
													local350.aClass3_Sub1_Sub4_2.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local350.anInt1475 - Static64.anInt1505, local350.anInt1476 - Static64.anInt1489, local350.anInt1477 - Static64.anInt1507, local350.anInt1474);
												}
												if ((local350.anInt1478 & local251) != 0 && !this.method1134(local26, local17, local20, local350.anInt1478)) {
													local350.aClass3_Sub1_Sub4_3.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local350.anInt1475 - Static64.anInt1505, local350.anInt1476 - Static64.anInt1489, local350.anInt1477 - Static64.anInt1507, local350.anInt1474);
												}
											}
											if (local353 != null && !this.method1168(local26, local17, local20, local353.aClass3_Sub1_Sub4_4.aShort32)) {
												if ((local353.anInt2075 & local251) != 0) {
													local353.aClass3_Sub1_Sub4_4.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local353.anInt2077 + local353.anInt2070 - Static64.anInt1505, local353.anInt2080 - Static64.anInt1489, local353.anInt2074 + local353.anInt2072 - Static64.anInt1507, local353.anInt2081);
												} else if (local353.anInt2075 == 256) {
													local592 = local353.anInt2077 - Static64.anInt1505;
													local597 = local353.anInt2080 - Static64.anInt1489;
													local602 = local353.anInt2074 - Static64.anInt1507;
													var17 = local353.anInt2082;
													if (var17 == 1 || var17 == 2) {
														var18 = -local592;
													} else {
														var18 = local592;
													}
													if (var17 == 2 || var17 == 3) {
														var19 = -local602;
													} else {
														var19 = local602;
													}
													if (var19 < var18) {
														local353.aClass3_Sub1_Sub4_4.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local592 + local353.anInt2070, local597, local602 + local353.anInt2072, local353.anInt2081);
													} else if (local353.aClass3_Sub1_Sub4_5 != null) {
														local353.aClass3_Sub1_Sub4_5.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local592, local597, local602, local353.anInt2081);
													}
												}
											}
											if (var22) {
												@Pc(673) Class55 local673 = local8.aClass55_1;
												if (local673 != null) {
													local673.aClass3_Sub1_Sub4_6.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local673.anInt2522 - Static64.anInt1505, local673.anInt2523 - Static64.anInt1489, local673.anInt2524 - Static64.anInt1507, local673.anInt2527);
												}
												@Pc(700) Class77 local700 = local8.aClass77_1;
												if (local700 != null && local700.anInt3485 == 0) {
													if (local700.aClass3_Sub1_Sub4_9 != null) {
														local700.aClass3_Sub1_Sub4_9.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local700.anInt3487 - Static64.anInt1505, local700.anInt3484 - Static64.anInt1489, local700.anInt3489 - Static64.anInt1507, local700.anInt3481);
													}
													if (local700.aClass3_Sub1_Sub4_8 != null) {
														local700.aClass3_Sub1_Sub4_8.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local700.anInt3487 - Static64.anInt1505, local700.anInt3484 - Static64.anInt1489, local700.anInt3489 - Static64.anInt1507, local700.anInt3481);
													}
													if (local700.aClass3_Sub1_Sub4_7 != null) {
														local700.aClass3_Sub1_Sub4_7.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local700.anInt3487 - Static64.anInt1505, local700.anInt3484 - Static64.anInt1489, local700.anInt3489 - Static64.anInt1507, local700.anInt3481);
													}
												}
											}
											local592 = local8.anInt773;
											if (local592 != 0) {
												if (local17 < Static64.anInt1498 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean48) {
														Static64.aClass72_21.method2404(var33);
													}
												}
												if (local20 < Static64.anInt1495 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean48) {
														Static64.aClass72_21.method2404(var33);
													}
												}
												if (local17 > Static64.anInt1498 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean48) {
														Static64.aClass72_21.method2404(var33);
													}
												}
												if (local20 > Static64.anInt1495 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean48) {
														Static64.aClass72_21.method2404(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt780 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt774; var21++) {
												if (local8.aClass4Array1[var21].anInt76 != Static64.anInt1503 && (local8.anIntArray74[var21] & local8.anInt780) == local8.anInt784) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass34_1;
												if (!this.method1134(local26, local17, local20, local919.anInt1480)) {
													local919.aClass3_Sub1_Sub4_2.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local919.anInt1475 - Static64.anInt1505, local919.anInt1476 - Static64.anInt1489, local919.anInt1477 - Static64.anInt1507, local919.anInt1474);
												}
												local8.anInt780 = 0;
											}
										}
										if (!local8.aBoolean47) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt774;
											local8.aBoolean47 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass4Array1[local251];
												if (var12.anInt76 != Static64.anInt1503) {
													for (local978 = var12.anInt69; local978 <= var12.anInt74; local978++) {
														for (local592 = var12.anInt63; local592 <= var12.anInt61; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean49) {
																local8.aBoolean47 = true;
																continue label558;
															}
															if (var33.anInt780 != 0) {
																local602 = 0;
																if (local978 > var12.anInt69) {
																	local602++;
																}
																if (local978 < var12.anInt74) {
																	local602 += 4;
																}
																if (local592 > var12.anInt63) {
																	local602 += 8;
																}
																if (local592 < var12.anInt61) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt780) == local8.anInt777) {
																	local8.aBoolean47 = true;
																	continue label558;
																}
															}
														}
													}
													Static64.aClass4Array2[var21++] = var12;
													local592 = Static64.anInt1498 - var12.anInt69;
													local597 = var12.anInt74 - Static64.anInt1498;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static64.anInt1495 - var12.anInt63;
													var17 = var12.anInt61 - Static64.anInt1495;
													if (var17 > local602) {
														var12.anInt77 = local592 + var17;
													} else {
														var12.anInt77 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class4 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static64.aClass4Array2[local592];
													if (local1102.anInt76 != Static64.anInt1503) {
														if (local1102.anInt77 > local1093) {
															local1093 = local1102.anInt77;
															local978 = local592;
														} else if (local1102.anInt77 == local1093) {
															local602 = local1102.anInt64 - Static64.anInt1505;
															var17 = local1102.anInt65 - Static64.anInt1507;
															var18 = Static64.aClass4Array2[local978].anInt64 - Static64.anInt1505;
															var19 = Static64.aClass4Array2[local978].anInt65 - Static64.anInt1507;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static64.aClass4Array2[local978];
												local1102.anInt76 = Static64.anInt1503;
												if (!this.method1162(local26, local1102.anInt69, local1102.anInt74, local1102.anInt63, local1102.anInt61, local1102.aClass3_Sub1_Sub4_1.aShort32)) {
													local1102.aClass3_Sub1_Sub4_1.method2260(local1102.anInt73, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local1102.anInt64 - Static64.anInt1505, local1102.anInt62 - Static64.anInt1489, local1102.anInt65 - Static64.anInt1507, local1102.anInt68);
												}
												for (local602 = local1102.anInt69; local602 <= local1102.anInt74; local602++) {
													for (var17 = local1102.anInt63; var17 <= local1102.anInt61; var17++) {
														@Pc(1227) Class3_Sub6 local1227 = local31[local602][var17];
														if (local1227.anInt780 != 0) {
															Static64.aClass72_21.method2404(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean48) {
															Static64.aClass72_21.method2404(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean47) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean47 = false;
											break;
										}
									}
								} while (!local8.aBoolean48);
							} while (local8.anInt780 != 0);
							if (local17 > Static64.anInt1498 || local17 <= Static64.anInt1493) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean48);
						if (local17 < Static64.anInt1498 || local17 >= Static64.anInt1488 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean48);
					if (local20 > Static64.anInt1495 || local20 <= Static64.anInt1483) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean48);
				if (local20 < Static64.anInt1495 || local20 >= Static64.anInt1508 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean48);
			local8.aBoolean48 = false;
			Static64.anInt1494--;
			@Pc(1369) Class77 local1369 = local8.aClass77_1;
			if (local1369 != null && local1369.anInt3485 != 0) {
				if (local1369.aClass3_Sub1_Sub4_9 != null) {
					local1369.aClass3_Sub1_Sub4_9.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local1369.anInt3487 - Static64.anInt1505, local1369.anInt3484 - Static64.anInt1489 - local1369.anInt3485, local1369.anInt3489 - Static64.anInt1507, local1369.anInt3481);
				}
				if (local1369.aClass3_Sub1_Sub4_8 != null) {
					local1369.aClass3_Sub1_Sub4_8.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local1369.anInt3487 - Static64.anInt1505, local1369.anInt3484 - Static64.anInt1489 - local1369.anInt3485, local1369.anInt3489 - Static64.anInt1507, local1369.anInt3481);
				}
				if (local1369.aClass3_Sub1_Sub4_7 != null) {
					local1369.aClass3_Sub1_Sub4_7.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local1369.anInt3487 - Static64.anInt1505, local1369.anInt3484 - Static64.anInt1489 - local1369.anInt3485, local1369.anInt3489 - Static64.anInt1507, local1369.anInt3481);
				}
			}
			if (local8.anInt779 != 0) {
				@Pc(1464) Class51 local1464 = local8.aClass51_1;
				if (local1464 != null && !this.method1168(local26, local17, local20, local1464.aClass3_Sub1_Sub4_4.aShort32)) {
					if ((local1464.anInt2075 & local8.anInt779) != 0) {
						local1464.aClass3_Sub1_Sub4_4.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local1464.anInt2077 + local1464.anInt2070 - Static64.anInt1505, local1464.anInt2080 - Static64.anInt1489, local1464.anInt2074 + local1464.anInt2072 - Static64.anInt1507, local1464.anInt2081);
					} else if (local1464.anInt2075 == 256) {
						local251 = local1464.anInt2077 - Static64.anInt1505;
						local1093 = local1464.anInt2080 - Static64.anInt1489;
						local978 = local1464.anInt2074 - Static64.anInt1507;
						local592 = local1464.anInt2082;
						if (local592 == 1 || local592 == 2) {
							local597 = -local251;
						} else {
							local597 = local251;
						}
						if (local592 == 2 || local592 == 3) {
							local602 = -local978;
						} else {
							local602 = local978;
						}
						if (local602 >= local597) {
							local1464.aClass3_Sub1_Sub4_4.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local251 + local1464.anInt2070, local1093, local978 + local1464.anInt2072, local1464.anInt2081);
						} else if (local1464.aClass3_Sub1_Sub4_5 != null) {
							local1464.aClass3_Sub1_Sub4_5.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local251, local1093, local978, local1464.anInt2081);
						}
					}
				}
				local919 = local8.aClass34_1;
				if (local919 != null) {
					if ((local919.anInt1478 & local8.anInt779) != 0 && !this.method1134(local26, local17, local20, local919.anInt1478)) {
						local919.aClass3_Sub1_Sub4_3.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local919.anInt1475 - Static64.anInt1505, local919.anInt1476 - Static64.anInt1489, local919.anInt1477 - Static64.anInt1507, local919.anInt1474);
					}
					if ((local919.anInt1480 & local8.anInt779) != 0 && !this.method1134(local26, local17, local20, local919.anInt1480)) {
						local919.aClass3_Sub1_Sub4_2.method2260(0, Static64.anInt1492, Static64.anInt1499, Static64.anInt1502, Static64.anInt1484, local919.anInt1475 - Static64.anInt1505, local919.anInt1476 - Static64.anInt1489, local919.anInt1477 - Static64.anInt1507, local919.anInt1474);
					}
				}
			}
			@Pc(1689) Class3_Sub6 local1689;
			if (local23 < this.anInt1485 - 1) {
				local1689 = this.aClass3_Sub6ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean48) {
					Static64.aClass72_21.method2404(local1689);
				}
			}
			if (local17 < Static64.anInt1498) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean48) {
					Static64.aClass72_21.method2404(local1689);
				}
			}
			if (local20 < Static64.anInt1495) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean48) {
					Static64.aClass72_21.method2404(local1689);
				}
			}
			if (local17 > Static64.anInt1498) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean48) {
					Static64.aClass72_21.method2404(local1689);
				}
			}
			if (local20 > Static64.anInt1495) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean48) {
					Static64.aClass72_21.method2404(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIILclient!ed;III)Z")
	public boolean method1161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub4 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1173(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray3[arg0][local17][local21] == -Static64.anInt1503) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5;
			if (!this.method1171(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1171(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1171(local21, local167, local195)) {
				return false;
			} else if (this.method1171(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1177(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1171(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5, local21 + 1) && this.method1171(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3] + arg5, local21 + 1) && this.method1171(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3 + 1] + arg5, local21 + 128 - 1) && this.method1171(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3 + 1] + arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
	public void method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub6 local31 = this.aClass3_Sub6ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub6ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt785--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt774; local41++) {
					@Pc(47) Class4 local47 = local31.aClass4Array1[local41];
					if ((local47.anInt68 >> 29 & 0x3) == 2 && local47.anInt69 == arg0 && local47.anInt63 == arg1) {
						local47.anInt60--;
					}
				}
			}
		}
		if (this.aClass3_Sub6ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub6ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub6(0, arg0, arg1);
		}
		this.aClass3_Sub6ArrayArrayArray1[0][arg0][arg1].aClass3_Sub6_1 = local8;
		this.aClass3_Sub6ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(III)V")
	public void method1164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt774; local13++) {
			@Pc(19) Class4 local19 = local8.aClass4Array1[local13];
			if ((local19.anInt68 >> 29 & 0x3) == 2 && local19.anInt69 == arg1 && local19.anInt63 == arg2) {
				this.method1169(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(III)V")
	public void method1165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass77_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(IIII)V")
	public void method1167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].anInt781 = arg3;
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(IIII)Z")
	private boolean method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1177(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1171(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2] + arg3, local15 + 1) && this.method1171(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] + arg3, local15 + 1) && this.method1171(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] + arg3, local15 + 128 - 1) && this.method1171(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] + arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ac;)V")
	private void method1169(@OriginalArg(0) Class4 arg0) {
		for (@Pc(2) int local2 = arg0.anInt69; local2 <= arg0.anInt74; local2++) {
			for (@Pc(6) int local6 = arg0.anInt63; local6 <= arg0.anInt61; local6++) {
				@Pc(17) Class3_Sub6 local17 = this.aClass3_Sub6ArrayArrayArray1[arg0.anInt60][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt774; local21++) {
						if (local17.aClass4Array1[local21] == arg0) {
							local17.anInt774--;
							for (local36 = local21; local36 < local17.anInt774; local36++) {
								local17.aClass4Array1[local36] = local17.aClass4Array1[local36 + 1];
								local17.anIntArray74[local36] = local17.anIntArray74[local36 + 1];
							}
							local17.aClass4Array1[local17.anInt774] = null;
							break;
						}
					}
					local17.anInt773 = 0;
					for (local36 = 0; local36 < local17.anInt774; local36++) {
						local17.anInt773 |= local17.anIntArray74[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILclient!ed;Lclient!ed;IIIIII)V")
	public void method1170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4, @OriginalArg(5) Class3_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class51 local6 = new Class51();
		local6.anInt2081 = arg10;
		local6.anInt2071 = arg11;
		local6.anInt2077 = arg1 * 128 + 64;
		local6.anInt2074 = arg2 * 128 + 64;
		local6.anInt2080 = arg3;
		local6.aClass3_Sub1_Sub4_4 = arg4;
		local6.aClass3_Sub1_Sub4_5 = arg5;
		local6.anInt2075 = arg6;
		local6.anInt2082 = arg7;
		local6.anInt2070 = arg8;
		local6.anInt2072 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass3_Sub6ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass3_Sub6ArrayArrayArray1[local49][arg1][arg2] = new Class3_Sub6(local49, arg1, arg2);
			}
		}
		this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local6;
	}

	@OriginalMember(owner = "client!i", name = "m", descriptor = "(III)Z")
	private boolean method1171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static64.anInt1497; local1++) {
			@Pc(6) Class84 local6 = Static64.aClass84Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3813 == 1) {
				local15 = local6.anInt3800 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3805 + (local6.anInt3797 * local15 >> 8);
					local37 = local6.anInt3807 + (local6.anInt3814 * local15 >> 8);
					local47 = local6.anInt3815 + (local6.anInt3817 * local15 >> 8);
					local57 = local6.anInt3796 + (local6.anInt3809 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3813 == 2) {
				local15 = arg0 - local6.anInt3800;
				if (local15 > 0) {
					local27 = local6.anInt3805 + (local6.anInt3797 * local15 >> 8);
					local37 = local6.anInt3807 + (local6.anInt3814 * local15 >> 8);
					local47 = local6.anInt3815 + (local6.anInt3817 * local15 >> 8);
					local57 = local6.anInt3796 + (local6.anInt3809 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3813 == 3) {
				local15 = local6.anInt3805 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3800 + (local6.anInt3806 * local15 >> 8);
					local37 = local6.anInt3812 + (local6.anInt3811 * local15 >> 8);
					local47 = local6.anInt3815 + (local6.anInt3817 * local15 >> 8);
					local57 = local6.anInt3796 + (local6.anInt3809 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3813 == 4) {
				local15 = arg2 - local6.anInt3805;
				if (local15 > 0) {
					local27 = local6.anInt3800 + (local6.anInt3806 * local15 >> 8);
					local37 = local6.anInt3812 + (local6.anInt3811 * local15 >> 8);
					local47 = local6.anInt3815 + (local6.anInt3817 * local15 >> 8);
					local57 = local6.anInt3796 + (local6.anInt3809 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3813 == 5) {
				local15 = arg1 - local6.anInt3815;
				if (local15 > 0) {
					local27 = local6.anInt3800 + (local6.anInt3806 * local15 >> 8);
					local37 = local6.anInt3812 + (local6.anInt3811 * local15 >> 8);
					local47 = local6.anInt3805 + (local6.anInt3797 * local15 >> 8);
					local57 = local6.anInt3807 + (local6.anInt3814 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([IIIIII)V")
	public void method1172(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class31 local14 = local8.aClass31_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1456;
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
		@Pc(59) Class86 local59 = local8.aClass86_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt3826;
		@Pc(68) int local68 = local59.anInt3825;
		@Pc(71) int local71 = local59.anInt3827;
		@Pc(74) int local74 = local59.anInt3828;
		@Pc(79) int[] local79 = this.anIntArrayArray8[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray7[local68];
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

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIILclient!ed;IZII)Z")
	private boolean method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub4 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1504 || local4 >= this.anInt1510) {
					return false;
				}
				@Pc(28) Class3_Sub6 local28 = this.aClass3_Sub6ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt774 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class4 local52 = new Class4();
		local52.anInt68 = arg11;
		local52.anInt66 = arg12;
		local52.anInt60 = arg0;
		local52.anInt64 = arg5;
		local52.anInt65 = arg6;
		local52.anInt62 = arg7;
		local52.aClass3_Sub1_Sub4_1 = arg8;
		local52.anInt73 = arg9;
		local52.anInt69 = arg1;
		local52.anInt63 = arg2;
		local52.anInt74 = arg1 + arg3 - 1;
		local52.anInt61 = arg2 + arg4 - 1;
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
					if (this.aClass3_Sub6ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub6ArrayArrayArray1[local130][local98][local101] = new Class3_Sub6(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub6 local166 = this.aClass3_Sub6ArrayArrayArray1[arg0][local98][local101];
				local166.aClass4Array1[local166.anInt774] = local52;
				local166.anIntArray74[local166.anInt774] = local104;
				local166.anInt773 |= local104;
				local166.anInt774++;
			}
		}
		if (arg10) {
			this.aClass4Array3[this.anInt1496++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "n", descriptor = "(III)I")
	public int method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt774; local14++) {
			@Pc(20) Class4 local20 = local8.aClass4Array1[local14];
			if ((local20.anInt68 >> 29 & 0x3) == 2 && local20.anInt69 == arg1 && local20.anInt63 == arg2) {
				return local20.anInt68;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!i", name = "o", descriptor = "(III)I")
	public int method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub6 local8 = this.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass51_1 == null ? 0 : local8.aClass51_1.anInt2081;
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(III)Z")
	private boolean method1177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == -Static64.anInt1503) {
			return false;
		} else if (local8 == Static64.anInt1503) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1171(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2], local27 + 1) && this.method1171(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2], local27 + 1) && this.method1171(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1171(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = Static64.anInt1503;
				return true;
			} else {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static64.anInt1503;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	public void method1178() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1485; local1++) {
			for (local4 = 0; local4 < this.anInt1504; local4++) {
				for (local7 = 0; local7 < this.anInt1510; local7++) {
					this.aClass3_Sub6ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static64.anInt1501; local4++) {
			for (local7 = 0; local7 < Static64.anIntArray157[local4]; local7++) {
				Static64.aClass84ArrayArray1[local4][local7] = null;
			}
			Static64.anIntArray157[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1496; local7++) {
			this.aClass4Array3[local7] = null;
		}
		this.anInt1496 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static64.aClass4Array2.length; local76++) {
			Static64.aClass4Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "(III)V")
	public void method1179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static64.aBoolean96 = true;
		Static64.anInt1482 = arg0;
		Static64.anInt1490 = arg1;
		Static64.anInt1486 = arg2;
		Static64.anInt1487 = -1;
		Static64.anInt1506 = -1;
	}
}
