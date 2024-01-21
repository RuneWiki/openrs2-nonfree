import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class49 {

	@OriginalMember(owner = "client!le", name = "v", descriptor = "[Lclient!cb;")
	private final Class12[] aClass12Array1 = new Class12[5000];

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	private int anInt1547 = 0;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "I")
	private int anInt1555 = 0;

	@OriginalMember(owner = "client!le", name = "Z", descriptor = "[[I")
	private final int[][] anIntArrayArray15 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!le", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray14 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!le", name = "I", descriptor = "I")
	private final int anInt1557;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "I")
	private final int anInt1548;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	private final int anInt1536;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "[[[Lclient!lf;")
	private final Class2_Sub8[][][] aClass2_Sub8ArrayArrayArray1;

	@OriginalMember(owner = "client!le", name = "L", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(III[[[I)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1557 = arg0;
		this.anInt1548 = arg1;
		this.anInt1536 = arg2;
		this.aClass2_Sub8ArrayArrayArray1 = new Class2_Sub8[arg0][arg1][arg2];
		this.anIntArrayArrayArray7 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray6 = arg3;
		this.method1180();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)I")
	public int method1152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass81_1 == null ? 0 : local8.aClass81_1.anInt2706;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)Lclient!cb;")
	public Class12 method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1578; local14++) {
			@Pc(20) Class12 local20 = local8.aClass12Array3[local14];
			if ((local20.anInt370 >> 29 & 0x3) == 2 && local20.anInt373 == arg1 && local20.anInt357 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	private void method1154() {
		@Pc(3) int local3 = Static65.anIntArray184[Static65.anInt1538];
		@Pc(7) Class28[] local7 = Static65.aClass28ArrayArray1[Static65.anInt1538];
		Static65.anInt1539 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class28 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt779 == 1) {
				local27 = local16.anInt775 + 25 - Static65.anInt1544;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt782 + 25 - Static65.anInt1560;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt783 + 25 - Static65.anInt1560;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static65.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static65.anInt1556 - local16.anInt757;
						if (local79 > 32) {
							local16.anInt772 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt772 = 2;
							local79 = -local79;
						}
						local16.anInt759 = (local16.anInt776 - Static65.anInt1549 << 8) / local79;
						local16.anInt763 = (local16.anInt756 - Static65.anInt1549 << 8) / local79;
						local16.anInt765 = (local16.anInt758 - Static65.anInt1559 << 8) / local79;
						local16.anInt777 = (local16.anInt769 - Static65.anInt1559 << 8) / local79;
						Static65.aClass28Array1[Static65.anInt1539++] = local16;
					}
				}
			} else if (local16.anInt779 == 2) {
				local27 = local16.anInt782 + 25 - Static65.anInt1560;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt775 + 25 - Static65.anInt1544;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt762 + 25 - Static65.anInt1544;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static65.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static65.anInt1549 - local16.anInt776;
						if (local79 > 32) {
							local16.anInt772 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt772 = 4;
							local79 = -local79;
						}
						local16.anInt781 = (local16.anInt757 - Static65.anInt1556 << 8) / local79;
						local16.anInt764 = (local16.anInt770 - Static65.anInt1556 << 8) / local79;
						local16.anInt765 = (local16.anInt758 - Static65.anInt1559 << 8) / local79;
						local16.anInt777 = (local16.anInt769 - Static65.anInt1559 << 8) / local79;
						Static65.aClass28Array1[Static65.anInt1539++] = local16;
					}
				}
			} else if (local16.anInt779 == 4) {
				local27 = local16.anInt758 - Static65.anInt1559;
				if (local27 > 128) {
					local40 = local16.anInt782 + 25 - Static65.anInt1560;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt783 + 25 - Static65.anInt1560;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt775 + 25 - Static65.anInt1544;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt762 + 25 - Static65.anInt1544;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static65.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt772 = 5;
							local16.anInt781 = (local16.anInt757 - Static65.anInt1556 << 8) / local27;
							local16.anInt764 = (local16.anInt770 - Static65.anInt1556 << 8) / local27;
							local16.anInt759 = (local16.anInt776 - Static65.anInt1549 << 8) / local27;
							local16.anInt763 = (local16.anInt756 - Static65.anInt1549 << 8) / local27;
							Static65.aClass28Array1[Static65.anInt1539++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!ma;Lclient!ma;IIIIII)V")
	public void method1155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class81 local6 = new Class81();
		local6.anInt2706 = arg10;
		local6.anInt2712 = arg11;
		local6.anInt2699 = arg1 * 128 + 64;
		local6.anInt2700 = arg2 * 128 + 64;
		local6.anInt2707 = arg3;
		local6.aClass2_Sub1_Sub1_9 = arg4;
		local6.aClass2_Sub1_Sub1_8 = arg5;
		local6.anInt2702 = arg6;
		local6.anInt2708 = arg7;
		local6.anInt2704 = arg8;
		local6.anInt2701 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass2_Sub8ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass2_Sub8ArrayArrayArray1[local49][arg1][arg2] = new Class2_Sub8(local49, arg1, arg2);
			}
		}
		this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass81_1 = local6;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method1156(@OriginalArg(0) int arg0) {
		this.anInt1555 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1548; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1536; local7++) {
				if (this.aClass2_Sub8ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub8ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub8(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(III)Z")
	private boolean method1157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static65.anInt1539; local1++) {
			@Pc(6) Class28 local6 = Static65.aClass28Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt772 == 1) {
				local15 = local6.anInt757 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt776 + (local6.anInt759 * local15 >> 8);
					local37 = local6.anInt756 + (local6.anInt763 * local15 >> 8);
					local47 = local6.anInt758 + (local6.anInt765 * local15 >> 8);
					local57 = local6.anInt769 + (local6.anInt777 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt772 == 2) {
				local15 = arg0 - local6.anInt757;
				if (local15 > 0) {
					local27 = local6.anInt776 + (local6.anInt759 * local15 >> 8);
					local37 = local6.anInt756 + (local6.anInt763 * local15 >> 8);
					local47 = local6.anInt758 + (local6.anInt765 * local15 >> 8);
					local57 = local6.anInt769 + (local6.anInt777 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt772 == 3) {
				local15 = local6.anInt776 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt757 + (local6.anInt781 * local15 >> 8);
					local37 = local6.anInt770 + (local6.anInt764 * local15 >> 8);
					local47 = local6.anInt758 + (local6.anInt765 * local15 >> 8);
					local57 = local6.anInt769 + (local6.anInt777 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt772 == 4) {
				local15 = arg2 - local6.anInt776;
				if (local15 > 0) {
					local27 = local6.anInt757 + (local6.anInt781 * local15 >> 8);
					local37 = local6.anInt770 + (local6.anInt764 * local15 >> 8);
					local47 = local6.anInt758 + (local6.anInt765 * local15 >> 8);
					local57 = local6.anInt769 + (local6.anInt777 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt772 == 5) {
				local15 = arg1 - local6.anInt758;
				if (local15 > 0) {
					local27 = local6.anInt757 + (local6.anInt781 * local15 >> 8);
					local37 = local6.anInt770 + (local6.anInt764 * local15 >> 8);
					local47 = local6.anInt776 + (local6.anInt759 * local15 >> 8);
					local57 = local6.anInt756 + (local6.anInt763 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIILclient!ma;IIZ)Z")
	public boolean method1158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1168(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)I")
	public int method1159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass66_1 != null && local8.aClass66_1.anInt2035 == arg3) {
			return local8.aClass66_1.anInt2033 & 0xFF;
		} else if (local8.aClass81_1 != null && local8.aClass81_1.anInt2706 == arg3) {
			return local8.aClass81_1.anInt2712 & 0xFF;
		} else if (local8.aClass68_1 != null && local8.aClass68_1.anInt2155 == arg3) {
			return local8.aClass68_1.anInt2151 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1578; local56++) {
				if (local8.aClass12Array3[local56].anInt370 == arg3) {
					return local8.aClass12Array3[local56].anInt358 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!ma;II)V")
	public void method1160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class68 local6 = new Class68();
		local6.aClass2_Sub1_Sub1_7 = arg4;
		local6.anInt2153 = arg1 * 128 + 64;
		local6.anInt2157 = arg2 * 128 + 64;
		local6.anInt2156 = arg3;
		local6.anInt2155 = arg5;
		local6.anInt2151 = arg6;
		if (this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub8(arg0, arg1, arg2);
		}
		this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass68_1 = local6;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)V")
	public void method1162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2].anInt1585 = arg3;
		}
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(III)Z")
	private boolean method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local8 == -Static65.anInt1553) {
			return false;
		} else if (local8 == Static65.anInt1553) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1157(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2], local27 + 1) && this.method1157(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2], local27 + 1) && this.method1157(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1157(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = Static65.anInt1553;
				return true;
			} else {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static65.anInt1553;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(III)V")
	public void method1164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass38_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!ma;ILclient!ma;Lclient!ma;)V")
	public void method1165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) Class2_Sub1_Sub1 arg7) {
		@Pc(3) Class38 local3 = new Class38();
		local3.aClass2_Sub1_Sub1_4 = arg4;
		local3.anInt1090 = arg1 * 128 + 64;
		local3.anInt1097 = arg2 * 128 + 64;
		local3.anInt1094 = arg3;
		local3.anInt1091 = arg5;
		local3.aClass2_Sub1_Sub1_2 = arg6;
		local3.aClass2_Sub1_Sub1_3 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub8 local43 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1578; local47++) {
				if ((local43.aClass12Array3[local47].anInt358 & 0x100) == 256 && local43.aClass12Array3[local47].aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub7) {
					@Pc(71) Class2_Sub1_Sub1_Sub7 local71 = (Class2_Sub1_Sub1_Sub7) local43.aClass12Array3[local47].aClass2_Sub1_Sub1_1;
					local71.method2006();
					if (local71.anInt2855 > local34) {
						local34 = local71.anInt2855;
					}
				}
			}
		}
		local3.anInt1092 = local34;
		if (this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub8(arg0, arg1, arg2);
		}
		this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass38_1 = local3;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray7[arg0][local17][local21] == -Static65.anInt1553) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5;
			if (!this.method1157(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1157(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1157(local21, local167, local195)) {
				return false;
			} else if (this.method1157(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1163(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1157(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1157(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1157(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1157(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(IIII)Z")
	private boolean method1167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1163(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray6[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static65.anInt1556) {
					if (!this.method1157(local11, local26, local15)) {
						return false;
					}
					if (!this.method1157(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1157(local11, local30, local15)) {
						return false;
					}
					if (!this.method1157(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1157(local11, local34, local15)) {
					return false;
				}
				if (!this.method1157(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static65.anInt1549) {
					if (!this.method1157(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1157(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1157(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1157(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1157(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1157(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static65.anInt1556) {
					if (!this.method1157(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1157(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1157(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1157(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1157(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1157(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static65.anInt1549) {
					if (!this.method1157(local11, local26, local15)) {
						return false;
					}
					if (!this.method1157(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1157(local11, local30, local15)) {
						return false;
					}
					if (!this.method1157(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1157(local11, local34, local15)) {
					return false;
				}
				if (!this.method1157(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1157(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1157(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1157(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1157(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1157(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIILclient!ma;IZII)Z")
	private boolean method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1548 || local4 >= this.anInt1536) {
					return false;
				}
				@Pc(28) Class2_Sub8 local28 = this.aClass2_Sub8ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1578 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class12 local52 = new Class12();
		local52.anInt370 = arg11;
		local52.anInt358 = arg12;
		local52.anInt359 = arg0;
		local52.anInt364 = arg5;
		local52.anInt369 = arg6;
		local52.anInt368 = arg7;
		local52.aClass2_Sub1_Sub1_1 = arg8;
		local52.anInt363 = arg9;
		local52.anInt373 = arg1;
		local52.anInt357 = arg2;
		local52.anInt362 = arg1 + arg3 - 1;
		local52.anInt356 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub8ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub8ArrayArrayArray1[local130][local98][local101] = new Class2_Sub8(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub8 local166 = this.aClass2_Sub8ArrayArrayArray1[arg0][local98][local101];
				local166.aClass12Array3[local166.anInt1578] = local52;
				local166.anIntArray193[local166.anInt1578] = local104;
				local166.anInt1579 |= local104;
				local166.anInt1578++;
			}
		}
		if (arg10) {
			this.aClass12Array1[this.anInt1547++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIII)V")
	public void method1169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1548 * 128) {
			arg0 = this.anInt1548 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1536 * 128) {
			arg2 = this.anInt1536 * 128 - 1;
		}
		Static65.anInt1553++;
		Static65.anInt1541 = Class2_Sub1_Sub4_Sub4.anIntArray251[arg3];
		Static65.anInt1535 = Class2_Sub1_Sub4_Sub4.anIntArray248[arg3];
		Static65.anInt1550 = Class2_Sub1_Sub4_Sub4.anIntArray251[arg4];
		Static65.anInt1552 = Class2_Sub1_Sub4_Sub4.anIntArray248[arg4];
		Static65.aBooleanArrayArray1 = Static65.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static65.anInt1556 = arg0;
		Static65.anInt1559 = arg1;
		Static65.anInt1549 = arg2;
		Static65.anInt1544 = arg0 / 128;
		Static65.anInt1560 = arg2 / 128;
		Static65.anInt1538 = arg5;
		Static65.anInt1543 = Static65.anInt1544 - 25;
		if (Static65.anInt1543 < 0) {
			Static65.anInt1543 = 0;
		}
		Static65.anInt1533 = Static65.anInt1560 - 25;
		if (Static65.anInt1533 < 0) {
			Static65.anInt1533 = 0;
		}
		Static65.anInt1554 = Static65.anInt1544 + 25;
		if (Static65.anInt1554 > this.anInt1548) {
			Static65.anInt1554 = this.anInt1548;
		}
		Static65.anInt1546 = Static65.anInt1560 + 25;
		if (Static65.anInt1546 > this.anInt1536) {
			Static65.anInt1546 = this.anInt1536;
		}
		this.method1154();
		Static65.anInt1558 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1555; local128 < this.anInt1557; local128++) {
			@Pc(134) Class2_Sub8[][] local134 = this.aClass2_Sub8ArrayArrayArray1[local128];
			for (local136 = Static65.anInt1543; local136 < Static65.anInt1554; local136++) {
				for (local139 = Static65.anInt1533; local139 < Static65.anInt1546; local139++) {
					@Pc(146) Class2_Sub8 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1585 <= arg5 && (Static65.aBooleanArrayArray1[local136 + 25 - Static65.anInt1544][local139 + 25 - Static65.anInt1560] || this.anIntArrayArrayArray6[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean60 = true;
							local146.aBoolean59 = true;
							if (local146.anInt1578 > 0) {
								local146.aBoolean58 = true;
							} else {
								local146.aBoolean58 = false;
							}
							Static65.anInt1558++;
						} else {
							local146.aBoolean60 = false;
							local146.aBoolean59 = false;
							local146.anInt1580 = 0;
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
		for (@Pc(224) int local224 = this.anInt1555; local224 < this.anInt1557; local224++) {
			@Pc(230) Class2_Sub8[][] local230 = this.aClass2_Sub8ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static65.anInt1544 + local139;
				local241 = Static65.anInt1544 - local139;
				if (local237 >= Static65.anInt1543 || local241 < Static65.anInt1554) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static65.anInt1560 + local249;
						local258 = Static65.anInt1560 - local249;
						@Pc(270) Class2_Sub8 local270;
						if (local237 >= Static65.anInt1543) {
							if (local254 >= Static65.anInt1533) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean60) {
									this.method1178(local270, true);
								}
							}
							if (local258 < Static65.anInt1546) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean60) {
									this.method1178(local270, true);
								}
							}
						}
						if (local241 < Static65.anInt1554) {
							if (local254 >= Static65.anInt1533) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean60) {
									this.method1178(local270, true);
								}
							}
							if (local258 < Static65.anInt1546) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean60) {
									this.method1178(local270, true);
								}
							}
						}
						if (Static65.anInt1558 == 0) {
							Static65.aBoolean55 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1555; local136 < this.anInt1557; local136++) {
			@Pc(361) Class2_Sub8[][] local361 = this.aClass2_Sub8ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static65.anInt1544 + local237;
				local249 = Static65.anInt1544 - local237;
				if (local241 >= Static65.anInt1543 || local249 < Static65.anInt1554) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static65.anInt1560 + local254;
						@Pc(389) int local389 = Static65.anInt1560 - local254;
						@Pc(401) Class2_Sub8 local401;
						if (local241 >= Static65.anInt1543) {
							if (local258 >= Static65.anInt1533) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean60) {
									this.method1178(local401, false);
								}
							}
							if (local389 < Static65.anInt1546) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean60) {
									this.method1178(local401, false);
								}
							}
						}
						if (local249 < Static65.anInt1554) {
							if (local258 >= Static65.anInt1533) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean60) {
									this.method1178(local401, false);
								}
							}
							if (local389 < Static65.anInt1546) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean60) {
									this.method1178(local401, false);
								}
							}
						}
						if (Static65.anInt1558 == 0) {
							Static65.aBoolean55 = false;
							return;
						}
					}
				}
			}
		}
		Static65.aBoolean55 = false;
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(III)I")
	public int method1170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass68_1 == null ? 0 : local8.aClass68_1.anInt2155;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!ma;Lclient!ma;IIII)V")
	public void method1172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class66 local8 = new Class66();
		local8.anInt2035 = arg8;
		local8.anInt2033 = arg9;
		local8.anInt2039 = arg1 * 128 + 64;
		local8.anInt2032 = arg2 * 128 + 64;
		local8.anInt2040 = arg3;
		local8.aClass2_Sub1_Sub1_5 = arg4;
		local8.aClass2_Sub1_Sub1_6 = arg5;
		local8.anInt2036 = arg6;
		local8.anInt2037 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub8ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub8ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub8(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass66_1 = local8;
	}

	@OriginalMember(owner = "client!le", name = "h", descriptor = "(III)Lclient!vc;")
	public Class81 method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass81_1;
	}

	@OriginalMember(owner = "client!le", name = "i", descriptor = "(III)I")
	public int method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass66_1 == null ? 0 : local8.aClass66_1.anInt2035;
	}

	@OriginalMember(owner = "client!le", name = "j", descriptor = "(III)I")
	public int method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1578; local14++) {
			@Pc(20) Class12 local20 = local8.aClass12Array3[local14];
			if ((local20.anInt370 >> 29 & 0x3) == 2 && local20.anInt373 == arg1 && local20.anInt357 == arg2) {
				return local20.anInt370;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIILclient!ma;III)Z")
	public boolean method1177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1168(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!lf;Z)V")
	private void method1178(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		Static65.aClass13_9.method263(arg0);
		while (true) {
			@Pc(8) Class2_Sub8 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub8[][] local31;
			@Pc(49) Class2_Sub8 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class66 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class12 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class2_Sub8 var33;
										while (true) {
											do {
												local8 = (Class2_Sub8) Static65.aClass13_9.method267();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean59);
											local17 = local8.anInt1583;
											local20 = local8.anInt1589;
											local23 = local8.anInt1581;
											local26 = local8.anInt1582;
											local31 = this.aClass2_Sub8ArrayArrayArray1[local23];
											if (!local8.aBoolean60) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub8ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean59) {
														continue;
													}
												}
												if (local17 <= Static65.anInt1544 && local17 > Static65.anInt1543) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean59 && (local49.aBoolean60 || (local8.anInt1579 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static65.anInt1544 && local17 < Static65.anInt1554 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean59 && (local49.aBoolean60 || (local8.anInt1579 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static65.anInt1560 && local20 > Static65.anInt1533) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean59 && (local49.aBoolean60 || (local8.anInt1579 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static65.anInt1560 && local20 < Static65.anInt1546 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean59 && (local49.aBoolean60 || (local8.anInt1579 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean60 = false;
											if (local8.aClass2_Sub8_1 != null) {
												local49 = local8.aClass2_Sub8_1;
												if (local49.aClass60_1 == null) {
													if (local49.aClass23_1 != null && !this.method1163(0, local17, local20)) {
														this.method1191(local49.aClass23_1, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local17, local20);
													}
												} else if (!this.method1163(0, local17, local20)) {
													this.method1183(local49.aClass60_1, 0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local17, local20);
												}
												@Pc(225) Class66 local225 = local49.aClass66_1;
												if (local225 != null) {
													local225.aClass2_Sub1_Sub1_5.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local225.anInt2039 - Static65.anInt1556, local225.anInt2040 - Static65.anInt1559, local225.anInt2032 - Static65.anInt1549, local225.anInt2035);
												}
												for (local251 = 0; local251 < local49.anInt1578; local251++) {
													var12 = local49.aClass12Array3[local251];
													if (var12 != null) {
														var12.aClass2_Sub1_Sub1_1.method1994(var12.anInt363, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, var12.anInt364 - Static65.anInt1556, var12.anInt368 - Static65.anInt1559, var12.anInt369 - Static65.anInt1549, var12.anInt370);
													}
												}
											}
											var22 = false;
											if (local8.aClass60_1 == null) {
												if (local8.aClass23_1 != null && !this.method1163(local26, local17, local20)) {
													var22 = true;
													this.method1191(local8.aClass23_1, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local17, local20);
												}
											} else if (!this.method1163(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass60_1.anInt1758 != 12345678 || Static65.aBoolean55 && local23 <= Static65.anInt1542) {
													this.method1183(local8.aClass60_1, local26, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class66 local350 = local8.aClass66_1;
											@Pc(353) Class81 local353 = local8.aClass81_1;
											if (local350 != null || local353 != null) {
												if (Static65.anInt1544 == local17) {
													var21++;
												} else if (Static65.anInt1544 < local17) {
													var21 += 2;
												}
												if (Static65.anInt1560 == local20) {
													var21 += 3;
												} else if (Static65.anInt1560 > local20) {
													var21 += 6;
												}
												local251 = Static65.anIntArray188[var21];
												local8.anInt1584 = Static65.anIntArray189[var21];
											}
											if (local350 != null) {
												if ((local350.anInt2036 & Static65.anIntArray185[var21]) == 0) {
													local8.anInt1580 = 0;
												} else if (local350.anInt2036 == 16) {
													local8.anInt1580 = 3;
													local8.anInt1587 = Static65.anIntArray186[var21];
													local8.anInt1588 = 3 - local8.anInt1587;
												} else if (local350.anInt2036 == 32) {
													local8.anInt1580 = 6;
													local8.anInt1587 = Static65.anIntArray187[var21];
													local8.anInt1588 = 6 - local8.anInt1587;
												} else if (local350.anInt2036 == 64) {
													local8.anInt1580 = 12;
													local8.anInt1587 = Static65.anIntArray190[var21];
													local8.anInt1588 = 12 - local8.anInt1587;
												} else {
													local8.anInt1580 = 9;
													local8.anInt1587 = Static65.anIntArray191[var21];
													local8.anInt1588 = 9 - local8.anInt1587;
												}
												if ((local350.anInt2036 & local251) != 0 && !this.method1167(local26, local17, local20, local350.anInt2036)) {
													local350.aClass2_Sub1_Sub1_5.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local350.anInt2039 - Static65.anInt1556, local350.anInt2040 - Static65.anInt1559, local350.anInt2032 - Static65.anInt1549, local350.anInt2035);
												}
												if ((local350.anInt2037 & local251) != 0 && !this.method1167(local26, local17, local20, local350.anInt2037)) {
													local350.aClass2_Sub1_Sub1_6.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local350.anInt2039 - Static65.anInt1556, local350.anInt2040 - Static65.anInt1559, local350.anInt2032 - Static65.anInt1549, local350.anInt2035);
												}
											}
											if (local353 != null && !this.method1187(local26, local17, local20, local353.aClass2_Sub1_Sub1_9.anInt2855)) {
												if ((local353.anInt2702 & local251) != 0) {
													local353.aClass2_Sub1_Sub1_9.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local353.anInt2699 + local353.anInt2704 - Static65.anInt1556, local353.anInt2707 - Static65.anInt1559, local353.anInt2700 + local353.anInt2701 - Static65.anInt1549, local353.anInt2706);
												} else if (local353.anInt2702 == 256) {
													local592 = local353.anInt2699 - Static65.anInt1556;
													local597 = local353.anInt2707 - Static65.anInt1559;
													local602 = local353.anInt2700 - Static65.anInt1549;
													var17 = local353.anInt2708;
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
														local353.aClass2_Sub1_Sub1_9.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local592 + local353.anInt2704, local597, local602 + local353.anInt2701, local353.anInt2706);
													} else if (local353.aClass2_Sub1_Sub1_8 != null) {
														local353.aClass2_Sub1_Sub1_8.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local592, local597, local602, local353.anInt2706);
													}
												}
											}
											if (var22) {
												@Pc(673) Class68 local673 = local8.aClass68_1;
												if (local673 != null) {
													local673.aClass2_Sub1_Sub1_7.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local673.anInt2153 - Static65.anInt1556, local673.anInt2156 - Static65.anInt1559, local673.anInt2157 - Static65.anInt1549, local673.anInt2155);
												}
												@Pc(700) Class38 local700 = local8.aClass38_1;
												if (local700 != null && local700.anInt1092 == 0) {
													if (local700.aClass2_Sub1_Sub1_2 != null) {
														local700.aClass2_Sub1_Sub1_2.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local700.anInt1090 - Static65.anInt1556, local700.anInt1094 - Static65.anInt1559, local700.anInt1097 - Static65.anInt1549, local700.anInt1091);
													}
													if (local700.aClass2_Sub1_Sub1_3 != null) {
														local700.aClass2_Sub1_Sub1_3.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local700.anInt1090 - Static65.anInt1556, local700.anInt1094 - Static65.anInt1559, local700.anInt1097 - Static65.anInt1549, local700.anInt1091);
													}
													if (local700.aClass2_Sub1_Sub1_4 != null) {
														local700.aClass2_Sub1_Sub1_4.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local700.anInt1090 - Static65.anInt1556, local700.anInt1094 - Static65.anInt1559, local700.anInt1097 - Static65.anInt1549, local700.anInt1091);
													}
												}
											}
											local592 = local8.anInt1579;
											if (local592 != 0) {
												if (local17 < Static65.anInt1544 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean59) {
														Static65.aClass13_9.method263(var33);
													}
												}
												if (local20 < Static65.anInt1560 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean59) {
														Static65.aClass13_9.method263(var33);
													}
												}
												if (local17 > Static65.anInt1544 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean59) {
														Static65.aClass13_9.method263(var33);
													}
												}
												if (local20 > Static65.anInt1560 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean59) {
														Static65.aClass13_9.method263(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt1580 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt1578; var21++) {
												if (local8.aClass12Array3[var21].anInt361 != Static65.anInt1553 && (local8.anIntArray193[var21] & local8.anInt1580) == local8.anInt1587) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass66_1;
												if (!this.method1167(local26, local17, local20, local919.anInt2036)) {
													local919.aClass2_Sub1_Sub1_5.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local919.anInt2039 - Static65.anInt1556, local919.anInt2040 - Static65.anInt1559, local919.anInt2032 - Static65.anInt1549, local919.anInt2035);
												}
												local8.anInt1580 = 0;
											}
										}
										if (!local8.aBoolean58) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt1578;
											local8.aBoolean58 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass12Array3[local251];
												if (var12.anInt361 != Static65.anInt1553) {
													for (local978 = var12.anInt373; local978 <= var12.anInt362; local978++) {
														for (local592 = var12.anInt357; local592 <= var12.anInt356; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean60) {
																local8.aBoolean58 = true;
																continue label558;
															}
															if (var33.anInt1580 != 0) {
																local602 = 0;
																if (local978 > var12.anInt373) {
																	local602++;
																}
																if (local978 < var12.anInt362) {
																	local602 += 4;
																}
																if (local592 > var12.anInt357) {
																	local602 += 8;
																}
																if (local592 < var12.anInt356) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt1580) == local8.anInt1588) {
																	local8.aBoolean58 = true;
																	continue label558;
																}
															}
														}
													}
													Static65.aClass12Array2[var21++] = var12;
													local592 = Static65.anInt1544 - var12.anInt373;
													local597 = var12.anInt362 - Static65.anInt1544;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static65.anInt1560 - var12.anInt357;
													var17 = var12.anInt356 - Static65.anInt1560;
													if (var17 > local602) {
														var12.anInt360 = local592 + var17;
													} else {
														var12.anInt360 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class12 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static65.aClass12Array2[local592];
													if (local1102.anInt361 != Static65.anInt1553) {
														if (local1102.anInt360 > local1093) {
															local1093 = local1102.anInt360;
															local978 = local592;
														} else if (local1102.anInt360 == local1093) {
															local602 = local1102.anInt364 - Static65.anInt1556;
															var17 = local1102.anInt369 - Static65.anInt1549;
															var18 = Static65.aClass12Array2[local978].anInt364 - Static65.anInt1556;
															var19 = Static65.aClass12Array2[local978].anInt369 - Static65.anInt1549;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static65.aClass12Array2[local978];
												local1102.anInt361 = Static65.anInt1553;
												if (!this.method1166(local26, local1102.anInt373, local1102.anInt362, local1102.anInt357, local1102.anInt356, local1102.aClass2_Sub1_Sub1_1.anInt2855)) {
													local1102.aClass2_Sub1_Sub1_1.method1994(local1102.anInt363, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local1102.anInt364 - Static65.anInt1556, local1102.anInt368 - Static65.anInt1559, local1102.anInt369 - Static65.anInt1549, local1102.anInt370);
												}
												for (local602 = local1102.anInt373; local602 <= local1102.anInt362; local602++) {
													for (var17 = local1102.anInt357; var17 <= local1102.anInt356; var17++) {
														@Pc(1227) Class2_Sub8 local1227 = local31[local602][var17];
														if (local1227.anInt1580 != 0) {
															Static65.aClass13_9.method263(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean59) {
															Static65.aClass13_9.method263(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean58) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean58 = false;
											break;
										}
									}
								} while (!local8.aBoolean59);
							} while (local8.anInt1580 != 0);
							if (local17 > Static65.anInt1544 || local17 <= Static65.anInt1543) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean59);
						if (local17 < Static65.anInt1544 || local17 >= Static65.anInt1554 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean59);
					if (local20 > Static65.anInt1560 || local20 <= Static65.anInt1533) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean59);
				if (local20 < Static65.anInt1560 || local20 >= Static65.anInt1546 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean59);
			local8.aBoolean59 = false;
			Static65.anInt1558--;
			@Pc(1369) Class38 local1369 = local8.aClass38_1;
			if (local1369 != null && local1369.anInt1092 != 0) {
				if (local1369.aClass2_Sub1_Sub1_2 != null) {
					local1369.aClass2_Sub1_Sub1_2.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local1369.anInt1090 - Static65.anInt1556, local1369.anInt1094 - Static65.anInt1559 - local1369.anInt1092, local1369.anInt1097 - Static65.anInt1549, local1369.anInt1091);
				}
				if (local1369.aClass2_Sub1_Sub1_3 != null) {
					local1369.aClass2_Sub1_Sub1_3.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local1369.anInt1090 - Static65.anInt1556, local1369.anInt1094 - Static65.anInt1559 - local1369.anInt1092, local1369.anInt1097 - Static65.anInt1549, local1369.anInt1091);
				}
				if (local1369.aClass2_Sub1_Sub1_4 != null) {
					local1369.aClass2_Sub1_Sub1_4.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local1369.anInt1090 - Static65.anInt1556, local1369.anInt1094 - Static65.anInt1559 - local1369.anInt1092, local1369.anInt1097 - Static65.anInt1549, local1369.anInt1091);
				}
			}
			if (local8.anInt1584 != 0) {
				@Pc(1464) Class81 local1464 = local8.aClass81_1;
				if (local1464 != null && !this.method1187(local26, local17, local20, local1464.aClass2_Sub1_Sub1_9.anInt2855)) {
					if ((local1464.anInt2702 & local8.anInt1584) != 0) {
						local1464.aClass2_Sub1_Sub1_9.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local1464.anInt2699 + local1464.anInt2704 - Static65.anInt1556, local1464.anInt2707 - Static65.anInt1559, local1464.anInt2700 + local1464.anInt2701 - Static65.anInt1549, local1464.anInt2706);
					} else if (local1464.anInt2702 == 256) {
						local251 = local1464.anInt2699 - Static65.anInt1556;
						local1093 = local1464.anInt2707 - Static65.anInt1559;
						local978 = local1464.anInt2700 - Static65.anInt1549;
						local592 = local1464.anInt2708;
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
							local1464.aClass2_Sub1_Sub1_9.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local251 + local1464.anInt2704, local1093, local978 + local1464.anInt2701, local1464.anInt2706);
						} else if (local1464.aClass2_Sub1_Sub1_8 != null) {
							local1464.aClass2_Sub1_Sub1_8.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local251, local1093, local978, local1464.anInt2706);
						}
					}
				}
				local919 = local8.aClass66_1;
				if (local919 != null) {
					if ((local919.anInt2037 & local8.anInt1584) != 0 && !this.method1167(local26, local17, local20, local919.anInt2037)) {
						local919.aClass2_Sub1_Sub1_6.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local919.anInt2039 - Static65.anInt1556, local919.anInt2040 - Static65.anInt1559, local919.anInt2032 - Static65.anInt1549, local919.anInt2035);
					}
					if ((local919.anInt2036 & local8.anInt1584) != 0 && !this.method1167(local26, local17, local20, local919.anInt2036)) {
						local919.aClass2_Sub1_Sub1_5.method1994(0, Static65.anInt1541, Static65.anInt1535, Static65.anInt1550, Static65.anInt1552, local919.anInt2039 - Static65.anInt1556, local919.anInt2040 - Static65.anInt1559, local919.anInt2032 - Static65.anInt1549, local919.anInt2035);
					}
				}
			}
			@Pc(1689) Class2_Sub8 local1689;
			if (local23 < this.anInt1557 - 1) {
				local1689 = this.aClass2_Sub8ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean59) {
					Static65.aClass13_9.method263(local1689);
				}
			}
			if (local17 < Static65.anInt1544) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean59) {
					Static65.aClass13_9.method263(local1689);
				}
			}
			if (local20 < Static65.anInt1560) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean59) {
					Static65.aClass13_9.method263(local1689);
				}
			}
			if (local17 > Static65.anInt1544) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean59) {
					Static65.aClass13_9.method263(local1689);
				}
			}
			if (local20 > Static65.anInt1560) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean59) {
					Static65.aClass13_9.method263(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "k", descriptor = "(III)V")
	public void method1179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass66_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	public void method1180() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1557; local1++) {
			for (local4 = 0; local4 < this.anInt1548; local4++) {
				for (local7 = 0; local7 < this.anInt1536; local7++) {
					this.aClass2_Sub8ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static65.anInt1540; local4++) {
			for (local7 = 0; local7 < Static65.anIntArray184[local4]; local7++) {
				Static65.aClass28ArrayArray1[local4][local7] = null;
			}
			Static65.anIntArray184[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1547; local7++) {
			this.aClass12Array1[local7] = null;
		}
		this.anInt1547 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static65.aClass12Array2.length; local76++) {
			Static65.aClass12Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
	public void method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub8 local31 = this.aClass2_Sub8ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub8ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1581--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1578; local41++) {
					@Pc(47) Class12 local47 = local31.aClass12Array3[local41];
					if ((local47.anInt370 >> 29 & 0x3) == 2 && local47.anInt373 == arg0 && local47.anInt357 == arg1) {
						local47.anInt359--;
					}
				}
			}
		}
		if (this.aClass2_Sub8ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub8ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub8(0, arg0, arg1);
		}
		this.aClass2_Sub8ArrayArrayArray1[0][arg0][arg1].aClass2_Sub8_1 = local8;
		this.aClass2_Sub8ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!le", name = "l", descriptor = "(III)V")
	public void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static65.aBoolean55 = true;
		Static65.anInt1542 = arg0;
		Static65.anInt1537 = arg1;
		Static65.anInt1534 = arg2;
		Static65.anInt1551 = -1;
		Static65.anInt1545 = -1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ob;IIIIIII)V")
	private void method1183(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static65.anInt1556;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static65.anInt1549;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray6[arg1][arg6][arg7] - Static65.anInt1559;
		@Pc(51) int local51 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7] - Static65.anInt1559;
		@Pc(66) int local66 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7 + 1] - Static65.anInt1559;
		@Pc(79) int local79 = this.anIntArrayArrayArray6[arg1][arg6][arg7 + 1] - Static65.anInt1559;
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
		@Pc(279) int local279 = Static87.anInt1868 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static87.anInt1870 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static87.anInt1868 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static87.anInt1870 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static87.anInt1868 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static87.anInt1870 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static87.anInt1868 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static87.anInt1870 + (local89 << 9) / local265;
		Static87.anInt1871 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static87.aBoolean76 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static87.anInt1874 || local327 > Static87.anInt1874 || local295 > Static87.anInt1874) {
				Static87.aBoolean76 = true;
			}
			if (Static65.aBoolean55 && this.method1161(Static65.anInt1537, Static65.anInt1534, local319, local335, local303, local311, local327, local295)) {
				Static65.anInt1551 = arg6;
				Static65.anInt1545 = arg7;
			}
			if (arg0.anInt1761 == -1) {
				if (arg0.anInt1758 != 12345678) {
					Static87.method1428(local319, local335, local303, local311, local327, local295, arg0.anInt1758, arg0.anInt1764, arg0.anInt1759);
				}
			} else if (Static65.aBoolean56) {
				local472 = Static87.anInterface1_1.method7(arg0.anInt1761);
				Static87.method1428(local319, local335, local303, local311, local327, local295, Static65.method1173(local472, arg0.anInt1758), Static65.method1173(local472, arg0.anInt1764), Static65.method1173(local472, arg0.anInt1759));
			} else if (arg0.aBoolean68) {
				Static87.method1427(local319, local335, local303, local311, local327, local295, arg0.anInt1758, arg0.anInt1764, arg0.anInt1759, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1761);
			} else {
				Static87.method1427(local319, local335, local303, local311, local327, local295, arg0.anInt1758, arg0.anInt1764, arg0.anInt1759, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1761);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static87.aBoolean76 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static87.anInt1874 || local295 > Static87.anInt1874 || local327 > Static87.anInt1874) {
			Static87.aBoolean76 = true;
		}
		if (Static65.aBoolean55 && this.method1161(Static65.anInt1537, Static65.anInt1534, local287, local303, local335, local279, local295, local327)) {
			Static65.anInt1551 = arg6;
			Static65.anInt1545 = arg7;
		}
		if (arg0.anInt1761 != -1) {
			if (!Static65.aBoolean56) {
				Static87.method1427(local287, local303, local335, local279, local295, local327, arg0.anInt1769, arg0.anInt1759, arg0.anInt1764, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1761);
				return;
			}
			local472 = Static87.anInterface1_1.method7(arg0.anInt1761);
			Static87.method1428(local287, local303, local335, local279, local295, local327, Static65.method1173(local472, arg0.anInt1769), Static65.method1173(local472, arg0.anInt1759), Static65.method1173(local472, arg0.anInt1764));
		} else if (arg0.anInt1769 != 12345678) {
			Static87.method1428(local287, local303, local335, local279, local295, local327, arg0.anInt1769, arg0.anInt1759, arg0.anInt1764);
			return;
		}
	}

	@OriginalMember(owner = "client!le", name = "m", descriptor = "(III)V")
	public void method1184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1578; local13++) {
			@Pc(19) Class12 local19 = local8.aClass12Array3[local13];
			if ((local19.anInt370 >> 29 & 0x3) == 2 && local19.anInt373 == arg1 && local19.anInt357 == arg2) {
				this.method1199(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "n", descriptor = "(III)V")
	public void method1186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass81_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(IIII)Z")
	private boolean method1187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1163(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1157(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1157(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1157(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1157(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!le", name = "o", descriptor = "(III)V")
	public void method1188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass68_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class60 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class60(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass60_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class60(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass60_1 = local12;
		} else {
			@Pc(140) Class23 local140 = new Class23(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass23_1 = local140;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIILclient!ma;IIIIII)Z")
	public boolean method1190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1168(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!fa;IIIIII)V")
	private void method1191(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray91.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray91[local5] - Static65.anInt1556;
			local20 = arg0.anIntArray84[local5] - Static65.anInt1559;
			local27 = arg0.anIntArray79[local5] - Static65.anInt1549;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray80 != null) {
				Static29.anIntArray92[local5] = local37;
				Static29.anIntArray83[local5] = local59;
				Static29.anIntArray90[local5] = local69;
			}
			Static29.anIntArray88[local5] = Static87.anInt1868 + (local37 << 9) / local69;
			Static29.anIntArray87[local5] = Static87.anInt1870 + (local59 << 9) / local69;
		}
		Static87.anInt1871 = 0;
		local3 = arg0.anIntArray82.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray82[local13];
			local27 = arg0.anIntArray85[local13];
			local37 = arg0.anIntArray86[local13];
			@Pc(142) int local142 = Static29.anIntArray88[local20];
			@Pc(146) int local146 = Static29.anIntArray88[local27];
			@Pc(150) int local150 = Static29.anIntArray88[local37];
			@Pc(154) int local154 = Static29.anIntArray87[local20];
			@Pc(158) int local158 = Static29.anIntArray87[local27];
			@Pc(162) int local162 = Static29.anIntArray87[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static87.aBoolean76 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static87.anInt1874 || local146 > Static87.anInt1874 || local150 > Static87.anInt1874) {
					Static87.aBoolean76 = true;
				}
				if (Static65.aBoolean55 && this.method1161(Static65.anInt1537, Static65.anInt1534, local154, local158, local162, local142, local146, local150)) {
					Static65.anInt1551 = arg5;
					Static65.anInt1545 = arg6;
				}
				if (arg0.anIntArray80 == null || arg0.anIntArray80[local13] == -1) {
					if (arg0.anIntArray89[local13] != 12345678) {
						Static87.method1428(local154, local158, local162, local142, local146, local150, arg0.anIntArray89[local13], arg0.anIntArray93[local13], arg0.anIntArray81[local13]);
					}
				} else if (Static65.aBoolean56) {
					@Pc(364) int local364 = Static87.anInterface1_1.method7(arg0.anIntArray80[local13]);
					Static87.method1428(local154, local158, local162, local142, local146, local150, Static65.method1173(local364, arg0.anIntArray89[local13]), Static65.method1173(local364, arg0.anIntArray93[local13]), Static65.method1173(local364, arg0.anIntArray81[local13]));
				} else if (arg0.aBoolean32) {
					Static87.method1427(local154, local158, local162, local142, local146, local150, arg0.anIntArray89[local13], arg0.anIntArray93[local13], arg0.anIntArray81[local13], Static29.anIntArray92[0], Static29.anIntArray92[1], Static29.anIntArray92[3], Static29.anIntArray83[0], Static29.anIntArray83[1], Static29.anIntArray83[3], Static29.anIntArray90[0], Static29.anIntArray90[1], Static29.anIntArray90[3], arg0.anIntArray80[local13]);
				} else {
					Static87.method1427(local154, local158, local162, local142, local146, local150, arg0.anIntArray89[local13], arg0.anIntArray93[local13], arg0.anIntArray81[local13], Static29.anIntArray92[local20], Static29.anIntArray92[local27], Static29.anIntArray92[local37], Static29.anIntArray83[local20], Static29.anIntArray83[local27], Static29.anIntArray83[local37], Static29.anIntArray90[local20], Static29.anIntArray90[local27], Static29.anIntArray90[local37], arg0.anIntArray80[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	public void method1192() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1547; local1++) {
			@Pc(7) Class12 local7 = this.aClass12Array1[local1];
			this.method1199(local7);
			this.aClass12Array1[local1] = null;
		}
		this.anInt1547 = 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ed;IIIII)V")
	private void method1193(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1557) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1548) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1536 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub8 local66 = this.aClass2_Sub8ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray6[local17][local24][local34] + this.anIntArrayArrayArray6[local17][local24 + 1][local34] + this.anIntArrayArrayArray6[local17][local24][local34 + 1] + this.anIntArrayArrayArray6[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray6[arg1][arg2][arg3] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray6[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class66 local163 = local66.aClass66_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub1_Sub1_Sub2 local173;
										if (local163.aClass2_Sub1_Sub1_5 instanceof Class2_Sub1_Sub1_Sub2) {
											local173 = (Class2_Sub1_Sub1_Sub2) local163.aClass2_Sub1_Sub1_5;
											Static27.method557(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub2) {
											local173 = (Class2_Sub1_Sub1_Sub2) local163.aClass2_Sub1_Sub1_6;
											Static27.method557(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt1578; local237++) {
										@Pc(243) Class12 local243 = local66.aClass12Array3[local237];
										if (local243 != null && local243.aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub2) {
											@Pc(253) Class2_Sub1_Sub1_Sub2 local253 = (Class2_Sub1_Sub1_Sub2) local243.aClass2_Sub1_Sub1_1;
											@Pc(261) int local261 = local243.anInt362 + 1 - local243.anInt373;
											@Pc(269) int local269 = local243.anInt356 + 1 - local243.anInt357;
											Static27.method557(arg0, local253, (local243.anInt373 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt357 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([IIIIII)V")
	public void method1194(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class60 local14 = local8.aClass60_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1763;
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
		@Pc(59) Class23 local59 = local8.aClass23_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt734;
		@Pc(68) int local68 = local59.anInt731;
		@Pc(71) int local71 = local59.anInt732;
		@Pc(74) int local74 = local59.anInt733;
		@Pc(79) int[] local79 = this.anIntArrayArray15[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray14[local68];
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

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(IIII)V")
	public void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class81 local14 = local8.aClass81_1;
		if (local14 != null) {
			local14.anInt2704 = local14.anInt2704 * arg3 / 16;
			local14.anInt2701 = local14.anInt2701 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!le", name = "p", descriptor = "(III)V")
	public void method1197() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1557; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1548; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1536; local7++) {
					@Pc(17) Class2_Sub8 local17 = this.aClass2_Sub8ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class66 local22 = local17.aClass66_1;
						if (local22 != null && local22.aClass2_Sub1_Sub1_5 instanceof Class2_Sub1_Sub1_Sub2) {
							@Pc(32) Class2_Sub1_Sub1_Sub2 local32 = (Class2_Sub1_Sub1_Sub2) local22.aClass2_Sub1_Sub1_5;
							this.method1193(local32, local1, local4, local7, 1, 1);
							if (local22.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub2) {
								@Pc(48) Class2_Sub1_Sub1_Sub2 local48 = (Class2_Sub1_Sub1_Sub2) local22.aClass2_Sub1_Sub1_6;
								this.method1193(local48, local1, local4, local7, 1, 1);
								Static27.method557(local32, local48, 0, 0, 0, false);
								local22.aClass2_Sub1_Sub1_6 = local48.method542(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass2_Sub1_Sub1_5 = local32.method542(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class2_Sub1_Sub1_Sub2 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt1578; local87++) {
							@Pc(93) Class12 local93 = local17.aClass12Array3[local87];
							if (local93 != null && local93.aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub2) {
								local103 = (Class2_Sub1_Sub1_Sub2) local93.aClass2_Sub1_Sub1_1;
								this.method1193(local103, local1, local4, local7, local93.anInt362 + 1 - local93.anInt373, local93.anInt356 - local93.anInt357 + 1);
								local93.aClass2_Sub1_Sub1_1 = local103.method542(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class68 local142 = local17.aClass68_1;
						if (local142 != null && local142.aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub2) {
							local103 = (Class2_Sub1_Sub1_Sub2) local142.aClass2_Sub1_Sub1_7;
							this.method1201(local103, local1, local4, local7);
							local142.aClass2_Sub1_Sub1_7 = local103.method542(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "q", descriptor = "(III)Lclient!pf;")
	public Class66 method1198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass66_1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!cb;)V")
	private void method1199(@OriginalArg(0) Class12 arg0) {
		for (@Pc(2) int local2 = arg0.anInt373; local2 <= arg0.anInt362; local2++) {
			for (@Pc(6) int local6 = arg0.anInt357; local6 <= arg0.anInt356; local6++) {
				@Pc(17) Class2_Sub8 local17 = this.aClass2_Sub8ArrayArrayArray1[arg0.anInt359][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1578; local21++) {
						if (local17.aClass12Array3[local21] == arg0) {
							local17.anInt1578--;
							for (local36 = local21; local36 < local17.anInt1578; local36++) {
								local17.aClass12Array3[local36] = local17.aClass12Array3[local36 + 1];
								local17.anIntArray193[local36] = local17.anIntArray193[local36 + 1];
							}
							local17.aClass12Array3[local17.anInt1578] = null;
							break;
						}
					}
					local17.anInt1579 = 0;
					for (local36 = 0; local36 < local17.anInt1578; local36++) {
						local17.anInt1579 |= local17.anIntArray193[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "r", descriptor = "(III)Lclient!qc;")
	public Class68 method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub8 local8 = this.aClass2_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass68_1 == null ? null : local8.aClass68_1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ed;III)V")
	private void method1201(@OriginalArg(0) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub8 local14;
		@Pc(29) Class2_Sub1_Sub1_Sub2 local29;
		if (arg2 < this.anInt1548) {
			local14 = this.aClass2_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass68_1 != null && local14.aClass68_1.aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub2) {
				local29 = (Class2_Sub1_Sub1_Sub2) local14.aClass68_1.aClass2_Sub1_Sub1_7;
				Static27.method557(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1548) {
			local14 = this.aClass2_Sub8ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass68_1 != null && local14.aClass68_1.aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub2) {
				local29 = (Class2_Sub1_Sub1_Sub2) local14.aClass68_1.aClass2_Sub1_Sub1_7;
				Static27.method557(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1548 && arg3 < this.anInt1536) {
			local14 = this.aClass2_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass68_1 != null && local14.aClass68_1.aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub2) {
				local29 = (Class2_Sub1_Sub1_Sub2) local14.aClass68_1.aClass2_Sub1_Sub1_7;
				Static27.method557(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1548 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass68_1 != null && local14.aClass68_1.aClass2_Sub1_Sub1_7 instanceof Class2_Sub1_Sub1_Sub2) {
			local29 = (Class2_Sub1_Sub1_Sub2) local14.aClass68_1.aClass2_Sub1_Sub1_7;
			Static27.method557(arg0, local29, 128, 0, -128, true);
		}
	}
}
