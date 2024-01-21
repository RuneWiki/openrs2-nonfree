import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class14 {

	@OriginalMember(owner = "client!d", name = "d", descriptor = "[Lclient!gd;")
	private final Class29[] aClass29Array1 = new Class29[5000];

	@OriginalMember(owner = "client!d", name = "A", descriptor = "I")
	private int anInt612 = 0;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "I")
	private int anInt602 = 0;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray6 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!d", name = "T", descriptor = "[[I")
	private final int[][] anIntArrayArray7 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	private final int anInt603;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	private final int anInt596;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	private final int anInt615;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "[[[Lclient!tc;")
	private final Class3_Sub17[][][] aClass3_Sub17ArrayArrayArray1;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III[[[I)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt603 = arg0;
		this.anInt596 = arg1;
		this.anInt615 = arg2;
		this.aClass3_Sub17ArrayArrayArray1 = new Class3_Sub17[arg0][arg1][arg2];
		this.anIntArrayArrayArray3 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray2 = arg3;
		this.method450();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
	private void method406() {
		@Pc(3) int local3 = Static20.anIntArray36[Static20.anInt604];
		@Pc(7) Class11[] local7 = Static20.aClass11ArrayArray1[Static20.anInt604];
		Static20.anInt597 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class11 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt346 == 1) {
				local27 = local16.anInt332 + 25 - Static20.anInt610;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt339 + 25 - Static20.anInt607;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt336 + 25 - Static20.anInt607;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static20.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static20.anInt599 - local16.anInt320;
						if (local79 > 32) {
							local16.anInt324 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt324 = 2;
							local79 = -local79;
						}
						local16.anInt335 = (local16.anInt338 - Static20.anInt608 << 8) / local79;
						local16.anInt340 = (local16.anInt337 - Static20.anInt608 << 8) / local79;
						local16.anInt329 = (local16.anInt322 - Static20.anInt594 << 8) / local79;
						local16.anInt330 = (local16.anInt333 - Static20.anInt594 << 8) / local79;
						Static20.aClass11Array1[Static20.anInt597++] = local16;
					}
				}
			} else if (local16.anInt346 == 2) {
				local27 = local16.anInt339 + 25 - Static20.anInt607;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt332 + 25 - Static20.anInt610;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt345 + 25 - Static20.anInt610;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static20.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static20.anInt608 - local16.anInt338;
						if (local79 > 32) {
							local16.anInt324 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt324 = 4;
							local79 = -local79;
						}
						local16.anInt321 = (local16.anInt320 - Static20.anInt599 << 8) / local79;
						local16.anInt341 = (local16.anInt327 - Static20.anInt599 << 8) / local79;
						local16.anInt329 = (local16.anInt322 - Static20.anInt594 << 8) / local79;
						local16.anInt330 = (local16.anInt333 - Static20.anInt594 << 8) / local79;
						Static20.aClass11Array1[Static20.anInt597++] = local16;
					}
				}
			} else if (local16.anInt346 == 4) {
				local27 = local16.anInt322 - Static20.anInt594;
				if (local27 > 128) {
					local40 = local16.anInt339 + 25 - Static20.anInt607;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt336 + 25 - Static20.anInt607;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt332 + 25 - Static20.anInt610;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt345 + 25 - Static20.anInt610;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static20.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt324 = 5;
							local16.anInt321 = (local16.anInt320 - Static20.anInt599 << 8) / local27;
							local16.anInt341 = (local16.anInt327 - Static20.anInt599 << 8) / local27;
							local16.anInt335 = (local16.anInt338 - Static20.anInt608 << 8) / local27;
							local16.anInt340 = (local16.anInt337 - Static20.anInt608 << 8) / local27;
							Static20.aClass11Array1[Static20.anInt597++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	public void method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static20.aBoolean27 = true;
		Static20.anInt609 = arg0;
		Static20.anInt606 = arg1;
		Static20.anInt616 = arg2;
		Static20.anInt601 = -1;
		Static20.anInt595 = -1;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(III)Lclient!gd;")
	public Class29 method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2772; local14++) {
			@Pc(20) Class29 local20 = local8.aClass29Array3[local14];
			if ((local20.anInt1069 >> 29 & 0x3) == 2 && local20.anInt1066 == arg1 && local20.anInt1068 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class50 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class50(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub17(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass50_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class50(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub17(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass50_1 = local12;
		} else {
			@Pc(140) Class71 local140 = new Class71(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub17(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass71_1 = local140;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
	public void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub17 local31 = this.aClass3_Sub17ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub17ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2769--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2772; local41++) {
					@Pc(47) Class29 local47 = local31.aClass29Array3[local41];
					if ((local47.anInt1069 >> 29 & 0x3) == 2 && local47.anInt1066 == arg0 && local47.anInt1068 == arg1) {
						local47.anInt1062--;
					}
				}
			}
		}
		if (this.aClass3_Sub17ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub17ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub17(0, arg0, arg1);
		}
		this.aClass3_Sub17ArrayArrayArray1[0][arg0][arg1].aClass3_Sub17_1 = local8;
		this.aClass3_Sub17ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)I")
	public int method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass12_1 == null ? 0 : local8.aClass12_1.anInt475;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILclient!nd;ILclient!nd;Lclient!nd;)V")
	public void method412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub2 arg6, @OriginalArg(7) Class3_Sub1_Sub2 arg7) {
		@Pc(3) Class72 local3 = new Class72();
		local3.aClass3_Sub1_Sub2_6 = arg4;
		local3.anInt2879 = arg1 * 128 + 64;
		local3.anInt2873 = arg2 * 128 + 64;
		local3.anInt2869 = arg3;
		local3.anInt2870 = arg5;
		local3.aClass3_Sub1_Sub2_8 = arg6;
		local3.aClass3_Sub1_Sub2_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class3_Sub17 local43 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2772; local47++) {
				if ((local43.aClass29Array3[local47].anInt1070 & 0x100) == 256 && local43.aClass29Array3[local47].aClass3_Sub1_Sub2_2 instanceof Class3_Sub1_Sub2_Sub6) {
					@Pc(71) Class3_Sub1_Sub2_Sub6 local71 = (Class3_Sub1_Sub2_Sub6) local43.aClass29Array3[local47].aClass3_Sub1_Sub2_2;
					local71.method1798();
					if (local71.anInt3141 > local34) {
						local34 = local71.anInt3141;
					}
				}
			}
		}
		local3.anInt2874 = local34;
		if (this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub17(arg0, arg1, arg2);
		}
		this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass72_1 = local3;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()V")
	public void method413() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt612; local1++) {
			@Pc(7) Class29 local7 = this.aClass29Array1[local1];
			this.method451(local7);
			this.aClass29Array1[local1] = null;
		}
		this.anInt612 = 0;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(III)Z")
	private boolean method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static20.anInt597; local1++) {
			@Pc(6) Class11 local6 = Static20.aClass11Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt324 == 1) {
				local15 = local6.anInt320 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt338 + (local6.anInt335 * local15 >> 8);
					local37 = local6.anInt337 + (local6.anInt340 * local15 >> 8);
					local47 = local6.anInt322 + (local6.anInt329 * local15 >> 8);
					local57 = local6.anInt333 + (local6.anInt330 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt324 == 2) {
				local15 = arg0 - local6.anInt320;
				if (local15 > 0) {
					local27 = local6.anInt338 + (local6.anInt335 * local15 >> 8);
					local37 = local6.anInt337 + (local6.anInt340 * local15 >> 8);
					local47 = local6.anInt322 + (local6.anInt329 * local15 >> 8);
					local57 = local6.anInt333 + (local6.anInt330 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt324 == 3) {
				local15 = local6.anInt338 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt320 + (local6.anInt321 * local15 >> 8);
					local37 = local6.anInt327 + (local6.anInt341 * local15 >> 8);
					local47 = local6.anInt322 + (local6.anInt329 * local15 >> 8);
					local57 = local6.anInt333 + (local6.anInt330 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt324 == 4) {
				local15 = arg2 - local6.anInt338;
				if (local15 > 0) {
					local27 = local6.anInt320 + (local6.anInt321 * local15 >> 8);
					local37 = local6.anInt327 + (local6.anInt341 * local15 >> 8);
					local47 = local6.anInt322 + (local6.anInt329 * local15 >> 8);
					local57 = local6.anInt333 + (local6.anInt330 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt324 == 5) {
				local15 = arg1 - local6.anInt322;
				if (local15 > 0) {
					local27 = local6.anInt320 + (local6.anInt321 * local15 >> 8);
					local37 = local6.anInt327 + (local6.anInt341 * local15 >> 8);
					local47 = local6.anInt338 + (local6.anInt335 * local15 >> 8);
					local57 = local6.anInt337 + (local6.anInt340 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(III)Lclient!se;")
	public Class70 method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass70_1;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(III)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass58_1 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(III)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass70_1 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "(III)I")
	public int method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass58_1 == null ? 0 : local8.aClass58_1.anInt2346;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIILclient!nd;IZII)Z")
	private boolean method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt596 || local4 >= this.anInt615) {
					return false;
				}
				@Pc(28) Class3_Sub17 local28 = this.aClass3_Sub17ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2772 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class29 local52 = new Class29();
		local52.anInt1069 = arg11;
		local52.anInt1070 = arg12;
		local52.anInt1062 = arg0;
		local52.anInt1061 = arg5;
		local52.anInt1060 = arg6;
		local52.anInt1067 = arg7;
		local52.aClass3_Sub1_Sub2_2 = arg8;
		local52.anInt1065 = arg9;
		local52.anInt1066 = arg1;
		local52.anInt1068 = arg2;
		local52.anInt1063 = arg1 + arg3 - 1;
		local52.anInt1073 = arg2 + arg4 - 1;
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
					if (this.aClass3_Sub17ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub17ArrayArrayArray1[local130][local98][local101] = new Class3_Sub17(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub17 local166 = this.aClass3_Sub17ArrayArrayArray1[arg0][local98][local101];
				local166.aClass29Array3[local166.anInt2772] = local52;
				local166.anIntArray263[local166.anInt2772] = local104;
				local166.anInt2768 |= local104;
				local166.anInt2772++;
			}
		}
		if (arg10) {
			this.aClass29Array1[this.anInt612++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ma;IIIIIII)V")
	private void method421(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static20.anInt599;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static20.anInt608;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray2[arg1][arg6][arg7] - Static20.anInt594;
		@Pc(51) int local51 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static20.anInt594;
		@Pc(66) int local66 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static20.anInt594;
		@Pc(79) int local79 = this.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static20.anInt594;
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
		@Pc(279) int local279 = Static55.anInt1575 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static55.anInt1579 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static55.anInt1575 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static55.anInt1579 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static55.anInt1575 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static55.anInt1579 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static55.anInt1575 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static55.anInt1579 + (local89 << 9) / local265;
		Static55.anInt1578 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static55.aBoolean69 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static55.anInt1580 || local327 > Static55.anInt1580 || local295 > Static55.anInt1580) {
				Static55.aBoolean69 = true;
			}
			if (Static20.aBoolean27 && this.method426(Static20.anInt606, Static20.anInt616, local319, local335, local303, local311, local327, local295)) {
				Static20.anInt601 = arg6;
				Static20.anInt595 = arg7;
			}
			if (arg0.anInt1935 == -1) {
				if (arg0.anInt1927 != 12345678) {
					Static55.method1048(local319, local335, local303, local311, local327, local295, arg0.anInt1927, arg0.anInt1928, arg0.anInt1932);
				}
			} else if (Static20.aBoolean28) {
				local472 = Static55.anInterface2_1.method570(arg0.anInt1935);
				Static55.method1048(local319, local335, local303, local311, local327, local295, Static20.method430(local472, arg0.anInt1927), Static20.method430(local472, arg0.anInt1928), Static20.method430(local472, arg0.anInt1932));
			} else if (arg0.aBoolean86) {
				Static55.method1044(local319, local335, local303, local311, local327, local295, arg0.anInt1927, arg0.anInt1928, arg0.anInt1932, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1935);
			} else {
				Static55.method1044(local319, local335, local303, local311, local327, local295, arg0.anInt1927, arg0.anInt1928, arg0.anInt1932, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1935);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static55.aBoolean69 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static55.anInt1580 || local295 > Static55.anInt1580 || local327 > Static55.anInt1580) {
			Static55.aBoolean69 = true;
		}
		if (Static20.aBoolean27 && this.method426(Static20.anInt606, Static20.anInt616, local287, local303, local335, local279, local295, local327)) {
			Static20.anInt601 = arg6;
			Static20.anInt595 = arg7;
		}
		if (arg0.anInt1935 != -1) {
			if (!Static20.aBoolean28) {
				Static55.method1044(local287, local303, local335, local279, local295, local327, arg0.anInt1925, arg0.anInt1932, arg0.anInt1928, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1935);
				return;
			}
			local472 = Static55.anInterface2_1.method570(arg0.anInt1935);
			Static55.method1048(local287, local303, local335, local279, local295, local327, Static20.method430(local472, arg0.anInt1925), Static20.method430(local472, arg0.anInt1932), Static20.method430(local472, arg0.anInt1928));
		} else if (arg0.anInt1925 != 12345678) {
			Static55.method1048(local287, local303, local335, local279, local295, local327, arg0.anInt1925, arg0.anInt1932, arg0.anInt1928);
			return;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!tc;Z)V")
	private void method423(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) boolean arg1) {
		Static20.aClass37_3.method985(arg0);
		while (true) {
			@Pc(8) Class3_Sub17 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub17[][] local31;
			@Pc(49) Class3_Sub17 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class70 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class29 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class3_Sub17 var35;
										while (true) {
											do {
												local8 = (Class3_Sub17) Static20.aClass37_3.method999();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean140);
											local17 = local8.anInt2774;
											local20 = local8.anInt2776;
											local23 = local8.anInt2769;
											local26 = local8.anInt2765;
											local31 = this.aClass3_Sub17ArrayArrayArray1[local23];
											if (!local8.aBoolean138) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub17ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean140) {
														continue;
													}
												}
												if (local17 <= Static20.anInt610 && local17 > Static20.anInt619) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean140 && (local49.aBoolean138 || (local8.anInt2768 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static20.anInt610 && local17 < Static20.anInt614 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean140 && (local49.aBoolean138 || (local8.anInt2768 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static20.anInt607 && local20 > Static20.anInt598) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean140 && (local49.aBoolean138 || (local8.anInt2768 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static20.anInt607 && local20 < Static20.anInt605 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean140 && (local49.aBoolean138 || (local8.anInt2768 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean138 = false;
											if (local8.aClass3_Sub17_1 != null) {
												local49 = local8.aClass3_Sub17_1;
												if (local49.aClass50_1 == null) {
													if (local49.aClass71_1 != null && !this.method434(0, local17, local20)) {
														this.method432(local49.aClass71_1, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local17, local20);
													}
												} else if (!this.method434(0, local17, local20)) {
													this.method421(local49.aClass50_1, 0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local17, local20);
												}
												@Pc(225) Class70 local225 = local49.aClass70_1;
												if (local225 != null) {
													local225.aClass3_Sub1_Sub2_5.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local225.anInt2635 - Static20.anInt599, local225.anInt2643 - Static20.anInt594, local225.anInt2638 - Static20.anInt608, local225.anInt2644);
												}
												for (local251 = 0; local251 < local49.anInt2772; local251++) {
													var12 = local49.aClass29Array3[local251];
													if (var12 != null) {
														var12.aClass3_Sub1_Sub2_2.method2029(var12.anInt1065, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, var12.anInt1061 - Static20.anInt599, var12.anInt1067 - Static20.anInt594, var12.anInt1060 - Static20.anInt608, var12.anInt1069);
													}
												}
											}
											var24 = false;
											if (local8.aClass50_1 == null) {
												if (local8.aClass71_1 != null && !this.method434(local26, local17, local20)) {
													var24 = true;
													this.method432(local8.aClass71_1, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local17, local20);
												}
											} else if (!this.method434(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass50_1.anInt1927 != 12345678 || Static20.aBoolean27 && local23 <= Static20.anInt609) {
													this.method421(local8.aClass50_1, local26, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class70 local350 = local8.aClass70_1;
											@Pc(353) Class12 local353 = local8.aClass12_1;
											if (local350 != null || local353 != null) {
												if (Static20.anInt610 == local17) {
													var23++;
												} else if (Static20.anInt610 < local17) {
													var23 += 2;
												}
												if (Static20.anInt607 == local20) {
													var23 += 3;
												} else if (Static20.anInt607 > local20) {
													var23 += 6;
												}
												local251 = Static20.anIntArray44[var23];
												local8.anInt2773 = Static20.anIntArray39[var23];
											}
											if (local350 != null) {
												if ((local350.anInt2637 & Static20.anIntArray43[var23]) == 0) {
													local8.anInt2766 = 0;
												} else if (local350.anInt2637 == 16) {
													local8.anInt2766 = 3;
													local8.anInt2775 = Static20.anIntArray45[var23];
													local8.anInt2770 = 3 - local8.anInt2775;
												} else if (local350.anInt2637 == 32) {
													local8.anInt2766 = 6;
													local8.anInt2775 = Static20.anIntArray41[var23];
													local8.anInt2770 = 6 - local8.anInt2775;
												} else if (local350.anInt2637 == 64) {
													local8.anInt2766 = 12;
													local8.anInt2775 = Static20.anIntArray40[var23];
													local8.anInt2770 = 12 - local8.anInt2775;
												} else {
													local8.anInt2766 = 9;
													local8.anInt2775 = Static20.anIntArray42[var23];
													local8.anInt2770 = 9 - local8.anInt2775;
												}
												if ((local350.anInt2637 & local251) != 0 && !this.method441(local26, local17, local20, local350.anInt2637)) {
													local350.aClass3_Sub1_Sub2_5.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local350.anInt2635 - Static20.anInt599, local350.anInt2643 - Static20.anInt594, local350.anInt2638 - Static20.anInt608, local350.anInt2644);
												}
												if ((local350.anInt2641 & local251) != 0 && !this.method441(local26, local17, local20, local350.anInt2641)) {
													local350.aClass3_Sub1_Sub2_4.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local350.anInt2635 - Static20.anInt599, local350.anInt2643 - Static20.anInt594, local350.anInt2638 - Static20.anInt608, local350.anInt2644);
												}
											}
											if (local353 != null && !this.method439(local26, local17, local20, local353.aClass3_Sub1_Sub2_1.anInt3141)) {
												if ((local353.anInt480 & local251) != 0) {
													local353.aClass3_Sub1_Sub2_1.method2029(local353.anInt479, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local353.anInt481 - Static20.anInt599, local353.anInt478 - Static20.anInt594, local353.anInt474 - Static20.anInt608, local353.anInt475);
												} else if ((local353.anInt480 & 0x300) != 0) {
													local588 = local353.anInt481 - Static20.anInt599;
													local593 = local353.anInt478 - Static20.anInt594;
													local598 = local353.anInt474 - Static20.anInt608;
													local601 = local353.anInt479;
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
													if ((local353.anInt480 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static20.anIntArray38[local601];
														local645 = local598 + Static20.anIntArray34[local601];
														local353.aClass3_Sub1_Sub2_1.method2029(local601 * 512 + 256, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local639, local593, local645, local353.anInt475);
													}
													if ((local353.anInt480 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static20.anIntArray35[local601];
														local645 = local598 + Static20.anIntArray37[local601];
														local353.aClass3_Sub1_Sub2_1.method2029(local601 * 512 + 1280 & 0x7FF, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local639, local593, local645, local353.anInt475);
													}
												}
											}
											if (var24) {
												@Pc(706) Class58 local706 = local8.aClass58_1;
												if (local706 != null) {
													local706.aClass3_Sub1_Sub2_3.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local706.anInt2353 - Static20.anInt599, local706.anInt2342 - Static20.anInt594, local706.anInt2345 - Static20.anInt608, local706.anInt2346);
												}
												@Pc(733) Class72 local733 = local8.aClass72_1;
												if (local733 != null && local733.anInt2874 == 0) {
													if (local733.aClass3_Sub1_Sub2_8 != null) {
														local733.aClass3_Sub1_Sub2_8.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local733.anInt2879 - Static20.anInt599, local733.anInt2869 - Static20.anInt594, local733.anInt2873 - Static20.anInt608, local733.anInt2870);
													}
													if (local733.aClass3_Sub1_Sub2_7 != null) {
														local733.aClass3_Sub1_Sub2_7.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local733.anInt2879 - Static20.anInt599, local733.anInt2869 - Static20.anInt594, local733.anInt2873 - Static20.anInt608, local733.anInt2870);
													}
													if (local733.aClass3_Sub1_Sub2_6 != null) {
														local733.aClass3_Sub1_Sub2_6.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local733.anInt2879 - Static20.anInt599, local733.anInt2869 - Static20.anInt594, local733.anInt2873 - Static20.anInt608, local733.anInt2870);
													}
												}
											}
											local588 = local8.anInt2768;
											if (local588 != 0) {
												if (local17 < Static20.anInt610 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean140) {
														Static20.aClass37_3.method985(var35);
													}
												}
												if (local20 < Static20.anInt607 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean140) {
														Static20.aClass37_3.method985(var35);
													}
												}
												if (local17 > Static20.anInt610 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean140) {
														Static20.aClass37_3.method985(var35);
													}
												}
												if (local20 > Static20.anInt607 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean140) {
														Static20.aClass37_3.method985(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt2766 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt2772; var23++) {
												if (local8.aClass29Array3[var23].anInt1074 != Static20.anInt613 && (local8.anIntArray263[var23] & local8.anInt2766) == local8.anInt2775) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass70_1;
												if (!this.method441(local26, local17, local20, local952.anInt2637)) {
													local952.aClass3_Sub1_Sub2_5.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local952.anInt2635 - Static20.anInt599, local952.anInt2643 - Static20.anInt594, local952.anInt2638 - Static20.anInt608, local952.anInt2644);
												}
												local8.anInt2766 = 0;
											}
										}
										if (!local8.aBoolean139) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt2772;
											local8.aBoolean139 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass29Array3[local251];
												if (var12.anInt1074 != Static20.anInt613) {
													for (local1011 = var12.anInt1066; local1011 <= var12.anInt1063; local1011++) {
														for (local588 = var12.anInt1068; local588 <= var12.anInt1073; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean138) {
																local8.aBoolean139 = true;
																continue label568;
															}
															if (var35.anInt2766 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt1066) {
																	local598++;
																}
																if (local1011 < var12.anInt1063) {
																	local598 += 4;
																}
																if (local588 > var12.anInt1068) {
																	local598 += 8;
																}
																if (local588 < var12.anInt1073) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt2766) == local8.anInt2770) {
																	local8.aBoolean139 = true;
																	continue label568;
																}
															}
														}
													}
													Static20.aClass29Array2[var23++] = var12;
													local588 = Static20.anInt610 - var12.anInt1066;
													local593 = var12.anInt1063 - Static20.anInt610;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static20.anInt607 - var12.anInt1068;
													local601 = var12.anInt1073 - Static20.anInt607;
													if (local601 > local598) {
														var12.anInt1071 = local588 + local601;
													} else {
														var12.anInt1071 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class29 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static20.aClass29Array2[local588];
													if (local1135.anInt1074 != Static20.anInt613) {
														if (local1135.anInt1071 > local1126) {
															local1126 = local1135.anInt1071;
															local1011 = local588;
														} else if (local1135.anInt1071 == local1126) {
															local598 = local1135.anInt1061 - Static20.anInt599;
															local601 = local1135.anInt1060 - Static20.anInt608;
															local610 = Static20.aClass29Array2[local1011].anInt1061 - Static20.anInt599;
															var19 = Static20.aClass29Array2[local1011].anInt1060 - Static20.anInt608;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static20.aClass29Array2[local1011];
												local1135.anInt1074 = Static20.anInt613;
												if (!this.method431(local26, local1135.anInt1066, local1135.anInt1063, local1135.anInt1068, local1135.anInt1073, local1135.aClass3_Sub1_Sub2_2.anInt3141)) {
													local1135.aClass3_Sub1_Sub2_2.method2029(local1135.anInt1065, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local1135.anInt1061 - Static20.anInt599, local1135.anInt1067 - Static20.anInt594, local1135.anInt1060 - Static20.anInt608, local1135.anInt1069);
												}
												for (local598 = local1135.anInt1066; local598 <= local1135.anInt1063; local598++) {
													for (local601 = local1135.anInt1068; local601 <= local1135.anInt1073; local601++) {
														@Pc(1260) Class3_Sub17 local1260 = local31[local598][local601];
														if (local1260.anInt2766 != 0) {
															Static20.aClass37_3.method985(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean140) {
															Static20.aClass37_3.method985(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean139) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean139 = false;
											break;
										}
									}
								} while (!local8.aBoolean140);
							} while (local8.anInt2766 != 0);
							if (local17 > Static20.anInt610 || local17 <= Static20.anInt619) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean140);
						if (local17 < Static20.anInt610 || local17 >= Static20.anInt614 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean140);
					if (local20 > Static20.anInt607 || local20 <= Static20.anInt598) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean140);
				if (local20 < Static20.anInt607 || local20 >= Static20.anInt605 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean140);
			local8.aBoolean140 = false;
			Static20.anInt611--;
			@Pc(1402) Class72 local1402 = local8.aClass72_1;
			if (local1402 != null && local1402.anInt2874 != 0) {
				if (local1402.aClass3_Sub1_Sub2_8 != null) {
					local1402.aClass3_Sub1_Sub2_8.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local1402.anInt2879 - Static20.anInt599, local1402.anInt2869 - Static20.anInt594 - local1402.anInt2874, local1402.anInt2873 - Static20.anInt608, local1402.anInt2870);
				}
				if (local1402.aClass3_Sub1_Sub2_7 != null) {
					local1402.aClass3_Sub1_Sub2_7.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local1402.anInt2879 - Static20.anInt599, local1402.anInt2869 - Static20.anInt594 - local1402.anInt2874, local1402.anInt2873 - Static20.anInt608, local1402.anInt2870);
				}
				if (local1402.aClass3_Sub1_Sub2_6 != null) {
					local1402.aClass3_Sub1_Sub2_6.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local1402.anInt2879 - Static20.anInt599, local1402.anInt2869 - Static20.anInt594 - local1402.anInt2874, local1402.anInt2873 - Static20.anInt608, local1402.anInt2870);
				}
			}
			if (local8.anInt2773 != 0) {
				@Pc(1497) Class12 local1497 = local8.aClass12_1;
				if (local1497 != null && !this.method439(local26, local17, local20, local1497.aClass3_Sub1_Sub2_1.anInt3141)) {
					if ((local1497.anInt480 & local8.anInt2773) != 0) {
						local1497.aClass3_Sub1_Sub2_1.method2029(local1497.anInt479, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local1497.anInt481 - Static20.anInt599, local1497.anInt478 - Static20.anInt594, local1497.anInt474 - Static20.anInt608, local1497.anInt475);
					} else if ((local1497.anInt480 & 0x300) != 0) {
						local251 = local1497.anInt481 - Static20.anInt599;
						local1126 = local1497.anInt478 - Static20.anInt594;
						local1011 = local1497.anInt474 - Static20.anInt608;
						local588 = local1497.anInt479;
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
						if ((local1497.anInt480 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static20.anIntArray38[local588];
							local610 = local1011 + Static20.anIntArray34[local588];
							local1497.aClass3_Sub1_Sub2_1.method2029(local588 * 512 + 256, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local601, local1126, local610, local1497.anInt475);
						}
						if ((local1497.anInt480 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static20.anIntArray35[local588];
							local610 = local1011 + Static20.anIntArray37[local588];
							local1497.aClass3_Sub1_Sub2_1.method2029(local588 * 512 + 1280 & 0x7FF, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local601, local1126, local610, local1497.anInt475);
						}
					}
				}
				local952 = local8.aClass70_1;
				if (local952 != null) {
					if ((local952.anInt2641 & local8.anInt2773) != 0 && !this.method441(local26, local17, local20, local952.anInt2641)) {
						local952.aClass3_Sub1_Sub2_4.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local952.anInt2635 - Static20.anInt599, local952.anInt2643 - Static20.anInt594, local952.anInt2638 - Static20.anInt608, local952.anInt2644);
					}
					if ((local952.anInt2637 & local8.anInt2773) != 0 && !this.method441(local26, local17, local20, local952.anInt2637)) {
						local952.aClass3_Sub1_Sub2_5.method2029(0, Static20.anInt620, Static20.anInt600, Static20.anInt617, Static20.anInt621, local952.anInt2635 - Static20.anInt599, local952.anInt2643 - Static20.anInt594, local952.anInt2638 - Static20.anInt608, local952.anInt2644);
					}
				}
			}
			@Pc(1755) Class3_Sub17 local1755;
			if (local23 < this.anInt603 - 1) {
				local1755 = this.aClass3_Sub17ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean140) {
					Static20.aClass37_3.method985(local1755);
				}
			}
			if (local17 < Static20.anInt610) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean140) {
					Static20.aClass37_3.method985(local1755);
				}
			}
			if (local20 < Static20.anInt607) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean140) {
					Static20.aClass37_3.method985(local1755);
				}
			}
			if (local17 > Static20.anInt610) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean140) {
					Static20.aClass37_3.method985(local1755);
				}
			}
			if (local20 > Static20.anInt607) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean140) {
					Static20.aClass37_3.method985(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!bd;IIIII)V")
	private void method424(@OriginalArg(0) Class3_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt603) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt596) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt615 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub17 local66 = this.aClass3_Sub17ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray2[local17][local24][local34] + this.anIntArrayArrayArray2[local17][local24 + 1][local34] + this.anIntArrayArrayArray2[local17][local24][local34 + 1] + this.anIntArrayArrayArray2[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray2[arg1][arg2][arg3] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class70 local163 = local66.aClass70_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub1_Sub2_Sub1 local173;
										if (local163.aClass3_Sub1_Sub2_5 instanceof Class3_Sub1_Sub2_Sub1) {
											local173 = (Class3_Sub1_Sub2_Sub1) local163.aClass3_Sub1_Sub2_5;
											Static10.method214(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass3_Sub1_Sub2_4 instanceof Class3_Sub1_Sub2_Sub1) {
											local173 = (Class3_Sub1_Sub2_Sub1) local163.aClass3_Sub1_Sub2_4;
											Static10.method214(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2772; local237++) {
										@Pc(243) Class29 local243 = local66.aClass29Array3[local237];
										if (local243 != null && local243.aClass3_Sub1_Sub2_2 instanceof Class3_Sub1_Sub2_Sub1) {
											@Pc(253) Class3_Sub1_Sub2_Sub1 local253 = (Class3_Sub1_Sub2_Sub1) local243.aClass3_Sub1_Sub2_2;
											@Pc(261) int local261 = local243.anInt1063 + 1 - local243.anInt1066;
											@Pc(269) int local269 = local243.anInt1073 + 1 - local243.anInt1068;
											Static10.method214(arg0, local253, (local243.anInt1066 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1068 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIILclient!nd;III)Z")
	public boolean method425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method420(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILclient!nd;IIIIII)V")
	public void method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class12 local6 = new Class12();
		local6.anInt475 = arg9;
		local6.anInt476 = arg10;
		local6.anInt481 = arg1 * 128 + arg7 + 64;
		local6.anInt474 = arg2 * 128 + arg8 + 64;
		local6.anInt478 = arg3;
		local6.aClass3_Sub1_Sub2_1 = arg4;
		local6.anInt480 = arg5;
		local6.anInt479 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass3_Sub17ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass3_Sub17ArrayArrayArray1[local44][arg1][arg2] = new Class3_Sub17(local44, arg1, arg2);
			}
		}
		this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass12_1 = local6;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
	public void method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2].anInt2771 = arg3;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIII)I")
	public int method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass70_1 != null && local8.aClass70_1.anInt2644 == arg3) {
			return local8.aClass70_1.anInt2642 & 0xFF;
		} else if (local8.aClass12_1 != null && local8.aClass12_1.anInt475 == arg3) {
			return local8.aClass12_1.anInt476 & 0xFF;
		} else if (local8.aClass58_1 != null && local8.aClass58_1.anInt2346 == arg3) {
			return local8.aClass58_1.anInt2340 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2772; local56++) {
				if (local8.aClass29Array3[local56].anInt1069 == arg3) {
					return local8.aClass29Array3[local56].anInt1070 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII)Z")
	private boolean method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray3[arg0][local17][local21] == -Static20.anInt613) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5;
			if (!this.method414(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method414(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method414(local21, local167, local195)) {
				return false;
			} else if (this.method414(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method434(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method414(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5, local21 + 1) && this.method414(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method414(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method414(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!te;IIIIII)V")
	private void method432(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray282.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray282[local5] - Static20.anInt599;
			local20 = arg0.anIntArray281[local5] - Static20.anInt594;
			local27 = arg0.anIntArray285[local5] - Static20.anInt608;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray276 != null) {
				Static112.anIntArray272[local5] = local37;
				Static112.anIntArray275[local5] = local59;
				Static112.anIntArray280[local5] = local69;
			}
			Static112.anIntArray278[local5] = Static55.anInt1575 + (local37 << 9) / local69;
			Static112.anIntArray273[local5] = Static55.anInt1579 + (local59 << 9) / local69;
		}
		Static55.anInt1578 = 0;
		local3 = arg0.anIntArray283.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray283[local13];
			local27 = arg0.anIntArray284[local13];
			local37 = arg0.anIntArray279[local13];
			@Pc(142) int local142 = Static112.anIntArray278[local20];
			@Pc(146) int local146 = Static112.anIntArray278[local27];
			@Pc(150) int local150 = Static112.anIntArray278[local37];
			@Pc(154) int local154 = Static112.anIntArray273[local20];
			@Pc(158) int local158 = Static112.anIntArray273[local27];
			@Pc(162) int local162 = Static112.anIntArray273[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static55.aBoolean69 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static55.anInt1580 || local146 > Static55.anInt1580 || local150 > Static55.anInt1580) {
					Static55.aBoolean69 = true;
				}
				if (Static20.aBoolean27 && this.method426(Static20.anInt606, Static20.anInt616, local154, local158, local162, local142, local146, local150)) {
					Static20.anInt601 = arg5;
					Static20.anInt595 = arg6;
				}
				if (arg0.anIntArray276 == null || arg0.anIntArray276[local13] == -1) {
					if (arg0.anIntArray286[local13] != 12345678) {
						Static55.method1048(local154, local158, local162, local142, local146, local150, arg0.anIntArray286[local13], arg0.anIntArray274[local13], arg0.anIntArray277[local13]);
					}
				} else if (Static20.aBoolean28) {
					@Pc(364) int local364 = Static55.anInterface2_1.method570(arg0.anIntArray276[local13]);
					Static55.method1048(local154, local158, local162, local142, local146, local150, Static20.method430(local364, arg0.anIntArray286[local13]), Static20.method430(local364, arg0.anIntArray274[local13]), Static20.method430(local364, arg0.anIntArray277[local13]));
				} else if (arg0.aBoolean154) {
					Static55.method1044(local154, local158, local162, local142, local146, local150, arg0.anIntArray286[local13], arg0.anIntArray274[local13], arg0.anIntArray277[local13], Static112.anIntArray272[0], Static112.anIntArray272[1], Static112.anIntArray272[3], Static112.anIntArray275[0], Static112.anIntArray275[1], Static112.anIntArray275[3], Static112.anIntArray280[0], Static112.anIntArray280[1], Static112.anIntArray280[3], arg0.anIntArray276[local13]);
				} else {
					Static55.method1044(local154, local158, local162, local142, local146, local150, arg0.anIntArray286[local13], arg0.anIntArray274[local13], arg0.anIntArray277[local13], Static112.anIntArray272[local20], Static112.anIntArray272[local27], Static112.anIntArray272[local37], Static112.anIntArray275[local20], Static112.anIntArray275[local27], Static112.anIntArray275[local37], Static112.anIntArray280[local20], Static112.anIntArray280[local27], Static112.anIntArray280[local37], arg0.anIntArray276[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILclient!nd;II)V")
	public void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class58 local6 = new Class58();
		local6.aClass3_Sub1_Sub2_3 = arg4;
		local6.anInt2353 = arg1 * 128 + 64;
		local6.anInt2345 = arg2 * 128 + 64;
		local6.anInt2342 = arg3;
		local6.anInt2346 = arg5;
		local6.anInt2340 = arg6;
		if (this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub17(arg0, arg1, arg2);
		}
		this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass58_1 = local6;
	}

	@OriginalMember(owner = "client!d", name = "i", descriptor = "(III)Z")
	private boolean method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == -Static20.anInt613) {
			return false;
		} else if (local8 == Static20.anInt613) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method414(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2], local27 + 1) && this.method414(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local27 + 1) && this.method414(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method414(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = Static20.anInt613;
				return true;
			} else {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static20.anInt613;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "k", descriptor = "(III)I")
	public int method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass70_1 == null ? 0 : local8.aClass70_1.anInt2644;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(IIII)V")
	public void method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class12 local14 = local8.aClass12_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt481 = local23 + (local14.anInt481 - local23) * arg3 / 16;
			local14.anInt474 = local29 + (local14.anInt474 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public void method438(@OriginalArg(0) int arg0) {
		this.anInt602 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt596; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt615; local7++) {
				if (this.aClass3_Sub17ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub17ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub17(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(IIII)Z")
	private boolean method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method434(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method414(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2] - arg3, local15 + 1) && this.method414(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method414(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method414(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "(III)V")
	public void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass12_1 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(IIII)Z")
	private boolean method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method434(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray2[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static20.anInt599) {
					if (!this.method414(local11, local26, local15)) {
						return false;
					}
					if (!this.method414(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method414(local11, local30, local15)) {
						return false;
					}
					if (!this.method414(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method414(local11, local34, local15)) {
					return false;
				}
				if (!this.method414(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static20.anInt608) {
					if (!this.method414(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method414(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method414(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method414(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method414(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method414(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static20.anInt599) {
					if (!this.method414(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method414(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method414(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method414(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method414(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method414(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static20.anInt608) {
					if (!this.method414(local11, local26, local15)) {
						return false;
					}
					if (!this.method414(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method414(local11, local30, local15)) {
						return false;
					}
					if (!this.method414(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method414(local11, local34, local15)) {
					return false;
				}
				if (!this.method414(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method414(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method414(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method414(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method414(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method414(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!d", name = "m", descriptor = "(III)V")
	public void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass72_1 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "n", descriptor = "(III)V")
	public void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2772; local13++) {
			@Pc(19) Class29 local19 = local8.aClass29Array3[local13];
			if ((local19.anInt1069 >> 29 & 0x3) == 2 && local19.anInt1066 == arg1 && local19.anInt1068 == arg2) {
				this.method451(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([IIIIII)V")
	public void method444(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class50 local14 = local8.aClass50_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1936;
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
		@Pc(59) Class71 local59 = local8.aClass71_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2865;
		@Pc(68) int local68 = local59.anInt2867;
		@Pc(71) int local71 = local59.anInt2866;
		@Pc(74) int local74 = local59.anInt2864;
		@Pc(79) int[] local79 = this.anIntArrayArray6[local24];
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

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILclient!nd;Lclient!nd;IIII)V")
	public void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub2 arg4, @OriginalArg(5) Class3_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class70 local8 = new Class70();
		local8.anInt2644 = arg8;
		local8.anInt2642 = arg9;
		local8.anInt2635 = arg1 * 128 + 64;
		local8.anInt2638 = arg2 * 128 + 64;
		local8.anInt2643 = arg3;
		local8.aClass3_Sub1_Sub2_5 = arg4;
		local8.aClass3_Sub1_Sub2_4 = arg5;
		local8.anInt2637 = arg6;
		local8.anInt2641 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub17ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub17ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub17(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass70_1 = local8;
	}

	@OriginalMember(owner = "client!d", name = "o", descriptor = "(III)I")
	public int method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2772; local14++) {
			@Pc(20) Class29 local20 = local8.aClass29Array3[local14];
			if ((local20.anInt1069 >> 29 & 0x3) == 2 && local20.anInt1066 == arg1 && local20.anInt1068 == arg2) {
				return local20.anInt1069;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIILclient!nd;IIZ)Z")
	public boolean method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method420(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!d", name = "p", descriptor = "(III)Lclient!pa;")
	public Class58 method449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass58_1 == null ? null : local8.aClass58_1;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()V")
	public void method450() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt603; local1++) {
			for (local4 = 0; local4 < this.anInt596; local4++) {
				for (local7 = 0; local7 < this.anInt615; local7++) {
					this.aClass3_Sub17ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static20.anInt618; local4++) {
			for (local7 = 0; local7 < Static20.anIntArray36[local4]; local7++) {
				Static20.aClass11ArrayArray1[local4][local7] = null;
			}
			Static20.anIntArray36[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt612; local7++) {
			this.aClass29Array1[local7] = null;
		}
		this.anInt612 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static20.aClass29Array2.length; local76++) {
			Static20.aClass29Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!gd;)V")
	private void method451(@OriginalArg(0) Class29 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1066; local2 <= arg0.anInt1063; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1068; local6 <= arg0.anInt1073; local6++) {
				@Pc(17) Class3_Sub17 local17 = this.aClass3_Sub17ArrayArrayArray1[arg0.anInt1062][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2772; local21++) {
						if (local17.aClass29Array3[local21] == arg0) {
							local17.anInt2772--;
							for (local36 = local21; local36 < local17.anInt2772; local36++) {
								local17.aClass29Array3[local36] = local17.aClass29Array3[local36 + 1];
								local17.anIntArray263[local36] = local17.anIntArray263[local36 + 1];
							}
							local17.aClass29Array3[local17.anInt2772] = null;
							break;
						}
					}
					local17.anInt2768 = 0;
					for (local36 = 0; local36 < local17.anInt2772; local36++) {
						local17.anInt2768 |= local17.anIntArray263[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "q", descriptor = "(III)V")
	public void method452() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt603; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt596; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt615; local7++) {
					@Pc(17) Class3_Sub17 local17 = this.aClass3_Sub17ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class70 local22 = local17.aClass70_1;
						if (local22 != null && local22.aClass3_Sub1_Sub2_5 instanceof Class3_Sub1_Sub2_Sub1) {
							@Pc(32) Class3_Sub1_Sub2_Sub1 local32 = (Class3_Sub1_Sub2_Sub1) local22.aClass3_Sub1_Sub2_5;
							this.method424(local32, local1, local4, local7, 1, 1);
							if (local22.aClass3_Sub1_Sub2_4 instanceof Class3_Sub1_Sub2_Sub1) {
								@Pc(48) Class3_Sub1_Sub2_Sub1 local48 = (Class3_Sub1_Sub2_Sub1) local22.aClass3_Sub1_Sub2_4;
								this.method424(local48, local1, local4, local7, 1, 1);
								Static10.method214(local32, local48, 0, 0, 0, false);
								local22.aClass3_Sub1_Sub2_4 = local48.method215(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass3_Sub1_Sub2_5 = local32.method215(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class3_Sub1_Sub2_Sub1 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt2772; local87++) {
							@Pc(93) Class29 local93 = local17.aClass29Array3[local87];
							if (local93 != null && local93.aClass3_Sub1_Sub2_2 instanceof Class3_Sub1_Sub2_Sub1) {
								local103 = (Class3_Sub1_Sub2_Sub1) local93.aClass3_Sub1_Sub2_2;
								this.method424(local103, local1, local4, local7, local93.anInt1063 + 1 - local93.anInt1066, local93.anInt1073 - local93.anInt1068 + 1);
								local93.aClass3_Sub1_Sub2_2 = local103.method215(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class58 local142 = local17.aClass58_1;
						if (local142 != null && local142.aClass3_Sub1_Sub2_3 instanceof Class3_Sub1_Sub2_Sub1) {
							local103 = (Class3_Sub1_Sub2_Sub1) local142.aClass3_Sub1_Sub2_3;
							this.method454(local103, local1, local4, local7);
							local142.aClass3_Sub1_Sub2_3 = local103.method215(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIIII)V")
	public void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt596 * 128) {
			arg0 = this.anInt596 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt615 * 128) {
			arg2 = this.anInt615 * 128 - 1;
		}
		Static20.anInt613++;
		Static20.anInt620 = Class3_Sub1_Sub1_Sub3.anIntArray116[arg3];
		Static20.anInt600 = Class3_Sub1_Sub1_Sub3.anIntArray115[arg3];
		Static20.anInt617 = Class3_Sub1_Sub1_Sub3.anIntArray116[arg4];
		Static20.anInt621 = Class3_Sub1_Sub1_Sub3.anIntArray115[arg4];
		Static20.aBooleanArrayArray1 = Static20.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static20.anInt599 = arg0;
		Static20.anInt594 = arg1;
		Static20.anInt608 = arg2;
		Static20.anInt610 = arg0 / 128;
		Static20.anInt607 = arg2 / 128;
		Static20.anInt604 = arg5;
		Static20.anInt619 = Static20.anInt610 - 25;
		if (Static20.anInt619 < 0) {
			Static20.anInt619 = 0;
		}
		Static20.anInt598 = Static20.anInt607 - 25;
		if (Static20.anInt598 < 0) {
			Static20.anInt598 = 0;
		}
		Static20.anInt614 = Static20.anInt610 + 25;
		if (Static20.anInt614 > this.anInt596) {
			Static20.anInt614 = this.anInt596;
		}
		Static20.anInt605 = Static20.anInt607 + 25;
		if (Static20.anInt605 > this.anInt615) {
			Static20.anInt605 = this.anInt615;
		}
		this.method406();
		Static20.anInt611 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt602; local128 < this.anInt603; local128++) {
			@Pc(134) Class3_Sub17[][] local134 = this.aClass3_Sub17ArrayArrayArray1[local128];
			for (local136 = Static20.anInt619; local136 < Static20.anInt614; local136++) {
				for (local139 = Static20.anInt598; local139 < Static20.anInt605; local139++) {
					@Pc(146) Class3_Sub17 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2771 <= arg5 && (Static20.aBooleanArrayArray1[local136 + 25 - Static20.anInt610][local139 + 25 - Static20.anInt607] || this.anIntArrayArrayArray2[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean138 = true;
							local146.aBoolean140 = true;
							if (local146.anInt2772 > 0) {
								local146.aBoolean139 = true;
							} else {
								local146.aBoolean139 = false;
							}
							Static20.anInt611++;
						} else {
							local146.aBoolean138 = false;
							local146.aBoolean140 = false;
							local146.anInt2766 = 0;
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
		for (@Pc(224) int local224 = this.anInt602; local224 < this.anInt603; local224++) {
			@Pc(230) Class3_Sub17[][] local230 = this.aClass3_Sub17ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static20.anInt610 + local139;
				local241 = Static20.anInt610 - local139;
				if (local237 >= Static20.anInt619 || local241 < Static20.anInt614) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static20.anInt607 + local249;
						local258 = Static20.anInt607 - local249;
						@Pc(270) Class3_Sub17 local270;
						if (local237 >= Static20.anInt619) {
							if (local254 >= Static20.anInt598) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean138) {
									this.method423(local270, true);
								}
							}
							if (local258 < Static20.anInt605) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean138) {
									this.method423(local270, true);
								}
							}
						}
						if (local241 < Static20.anInt614) {
							if (local254 >= Static20.anInt598) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean138) {
									this.method423(local270, true);
								}
							}
							if (local258 < Static20.anInt605) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean138) {
									this.method423(local270, true);
								}
							}
						}
						if (Static20.anInt611 == 0) {
							Static20.aBoolean27 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt602; local136 < this.anInt603; local136++) {
			@Pc(361) Class3_Sub17[][] local361 = this.aClass3_Sub17ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static20.anInt610 + local237;
				local249 = Static20.anInt610 - local237;
				if (local241 >= Static20.anInt619 || local249 < Static20.anInt614) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static20.anInt607 + local254;
						@Pc(389) int local389 = Static20.anInt607 - local254;
						@Pc(401) Class3_Sub17 local401;
						if (local241 >= Static20.anInt619) {
							if (local258 >= Static20.anInt598) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean138) {
									this.method423(local401, false);
								}
							}
							if (local389 < Static20.anInt605) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean138) {
									this.method423(local401, false);
								}
							}
						}
						if (local249 < Static20.anInt614) {
							if (local258 >= Static20.anInt598) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean138) {
									this.method423(local401, false);
								}
							}
							if (local389 < Static20.anInt605) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean138) {
									this.method423(local401, false);
								}
							}
						}
						if (Static20.anInt611 == 0) {
							Static20.aBoolean27 = false;
							return;
						}
					}
				}
			}
		}
		Static20.aBoolean27 = false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!bd;III)V")
	private void method454(@OriginalArg(0) Class3_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub17 local14;
		@Pc(29) Class3_Sub1_Sub2_Sub1 local29;
		if (arg2 < this.anInt596) {
			local14 = this.aClass3_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass58_1 != null && local14.aClass58_1.aClass3_Sub1_Sub2_3 instanceof Class3_Sub1_Sub2_Sub1) {
				local29 = (Class3_Sub1_Sub2_Sub1) local14.aClass58_1.aClass3_Sub1_Sub2_3;
				Static10.method214(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt596) {
			local14 = this.aClass3_Sub17ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass58_1 != null && local14.aClass58_1.aClass3_Sub1_Sub2_3 instanceof Class3_Sub1_Sub2_Sub1) {
				local29 = (Class3_Sub1_Sub2_Sub1) local14.aClass58_1.aClass3_Sub1_Sub2_3;
				Static10.method214(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt596 && arg3 < this.anInt615) {
			local14 = this.aClass3_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass58_1 != null && local14.aClass58_1.aClass3_Sub1_Sub2_3 instanceof Class3_Sub1_Sub2_Sub1) {
				local29 = (Class3_Sub1_Sub2_Sub1) local14.aClass58_1.aClass3_Sub1_Sub2_3;
				Static10.method214(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt596 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass58_1 != null && local14.aClass58_1.aClass3_Sub1_Sub2_3 instanceof Class3_Sub1_Sub2_Sub1) {
			local29 = (Class3_Sub1_Sub2_Sub1) local14.aClass58_1.aClass3_Sub1_Sub2_3;
			Static10.method214(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!d", name = "r", descriptor = "(III)Lclient!ce;")
	public Class12 method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass12_1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIILclient!nd;IIIIII)Z")
	public boolean method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub1_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method420(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}
}
