import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class147 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	private int anInt4373;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
	public int[] anIntArray463;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
	public int anInt4388;

	@OriginalMember(owner = "client!qk", name = "y", descriptor = "[I")
	private int[] anIntArray464;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V")
	public void method3641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static30.anIntArray46[arg0];
		if (this.anIntArray464[local7] != 0 && Static114.method1817(arg1) != null) {
			this.anIntArray464[local7] = Integer.MIN_VALUE | arg1;
			this.method3643();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V")
	public void method3642(@OriginalArg(0) boolean arg0) {
		this.aBoolean307 = arg0;
		this.method3643();
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	private void method3643() {
		@Pc(8) long local8 = this.aLong158;
		@Pc(10) long[] local10 = Class193.aLongArray58;
		this.aLong158 = -1L;
		this.aLong158 = this.aLong158 >>> 8 ^ local10[(int) (((long) (this.anInt4373 >> 8) ^ this.aLong158) & 0xFFL)];
		this.aLong158 = local10[(int) ((this.aLong158 ^ (long) this.anInt4373) & 0xFFL)] ^ this.aLong158 >>> 8;
		@Pc(53) int local53;
		for (local53 = 0; local53 < 12; local53++) {
			this.aLong158 = this.aLong158 >>> 8 ^ local10[(int) (((long) (this.anIntArray464[local53] >> 24) ^ this.aLong158) & 0xFFL)];
			this.aLong158 = this.aLong158 >>> 8 ^ local10[(int) (((long) (this.anIntArray464[local53] >> 16) ^ this.aLong158) & 0xFFL)];
			this.aLong158 = local10[(int) ((this.aLong158 ^ (long) (this.anIntArray464[local53] >> 8)) & 0xFFL)] ^ this.aLong158 >>> 8;
			this.aLong158 = local10[(int) ((this.aLong158 ^ (long) this.anIntArray464[local53]) & 0xFFL)] ^ this.aLong158 >>> 8;
		}
		for (local53 = 0; local53 < 5; local53++) {
			this.aLong158 = this.aLong158 >>> 8 ^ local10[(int) (((long) this.anIntArray463[local53] ^ this.aLong158) & 0xFFL)];
		}
		this.aLong158 = local10[(int) ((this.aLong158 ^ (long) (this.aBoolean307 ? 1 : 0)) & 0xFFL)] ^ this.aLong158 >>> 8;
		if (local8 != 0L && this.aLong158 != local8) {
			Static68.aClass26_12.method512(local8);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([Lclient!re;IIILclient!eg;IIZILclient!eg;ZI)Lclient!vg;")
	public Class53_Sub4 method3645(@OriginalArg(0) Class153[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class46 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		if (this.anInt4388 != -1) {
			return Static84.method1495(this.anInt4388).method4305(arg5, arg7, arg4, arg8, arg2, arg0, arg3, arg1, arg10);
		}
		@Pc(51) int[] local51 = this.anIntArray464;
		@Pc(54) long local54 = this.aLong158;
		if (arg8 != null && (arg8.anInt1224 >= 0 || arg8.anInt1232 >= 0)) {
			local51 = new int[12];
			for (@Pc(75) int local75 = 0; local75 < 12; local75++) {
				local51[local75] = this.anIntArray464[local75];
			}
			if (arg8.anInt1224 >= 0) {
				if (arg8.anInt1224 == 65535) {
					local51[5] = 0;
					local54 ^= 0xFFFFFFFF00000000L;
				} else {
					local51[5] = arg8.anInt1224 | 0x40000000;
					local54 ^= (long) local51[5] << 32;
				}
			}
			if (arg8.anInt1232 >= 0) {
				if (arg8.anInt1232 == 65535) {
					local54 ^= 0xFFFFFFFFL;
					local51[3] = 0;
				} else {
					local51[3] = arg8.anInt1232 | 0x40000000;
					local54 ^= local51[3];
				}
			}
		}
		@Pc(169) Class53_Sub4 local169 = (Class53_Sub4) Static68.aClass26_12.method518(local54);
		@Pc(174) boolean local174;
		@Pc(358) int local358;
		@Pc(365) int local365;
		@Pc(372) int local372;
		@Pc(386) int local386;
		@Pc(379) int local379;
		@Pc(457) int local457;
		@Pc(463) int local463;
		@Pc(495) int local495;
		@Pc(475) int local475;
		@Pc(503) int local503;
		@Pc(351) int local351;
		if (local169 == null) {
			local174 = false;
			@Pc(185) int local185;
			for (@Pc(176) int local176 = 0; local176 < 12; local176++) {
				local185 = local51[local176];
				if ((local185 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local185) != 0 && !Static114.method1817(local185 & 0x3FFFFFFF).method3531()) {
						local174 = true;
					}
				} else if (!Static287.method4398(local185 & 0x3FFFFFFF).method4165(this.aBoolean307)) {
					local174 = true;
				}
			}
			if (local174) {
				if (this.aLong159 != -1L) {
					local169 = (Class53_Sub4) Static68.aClass26_12.method518(this.aLong159);
				}
				if (local169 == null) {
					return null;
				}
			}
			if (local169 == null) {
				@Pc(250) Class53_Sub3[] local250 = new Class53_Sub3[12];
				@Pc(259) int local259;
				for (local185 = 0; local185 < 12; local185++) {
					local259 = local51[local185];
					@Pc(273) Class53_Sub3 local273;
					if ((local259 & 0x40000000) != 0) {
						local273 = Static287.method4398(local259 & 0x3FFFFFFF).method4158(this.aBoolean307);
						if (local273 != null) {
							local250[local185] = local273;
						}
					} else if ((Integer.MIN_VALUE & local259) != 0) {
						local273 = Static114.method1817(local259 & 0x3FFFFFFF).method3527();
						if (local273 != null) {
							local250[local185] = local273;
						}
					}
				}
				@Pc(306) Class34 local306 = null;
				if (this.anInt4373 != -1) {
					local306 = Static310.method4813(this.anInt4373);
				}
				if (local306 != null && local306.anIntArrayArray7 != null) {
					for (local259 = 0; local259 < local306.anIntArrayArray7.length; local259++) {
						if (local306.anIntArrayArray7[local259] != null && local250[local259] != null) {
							local351 = local306.anIntArrayArray7[local259][0];
							local358 = local306.anIntArrayArray7[local259][1];
							local365 = local306.anIntArrayArray7[local259][2];
							local372 = local306.anIntArrayArray7[local259][3];
							local379 = local306.anIntArrayArray7[local259][5];
							local386 = local306.anIntArrayArray7[local259][4];
							if (this.anIntArrayArray37 == null) {
								this.anIntArrayArray37 = new int[local306.anIntArrayArray7.length][];
							}
							if (this.anIntArrayArray37[local259] == null) {
								@Pc(410) int[] local410 = this.anIntArrayArray37[local259] = new int[15];
								if (local372 == 0 && local386 == 0 && local379 == 0) {
									local410[13] = -local358;
									local410[0] = local410[4] = local410[8] = 32768;
									local410[14] = -local365;
									local410[12] = -local351;
								} else {
									local457 = Class111.anIntArray298[local372] >> 1;
									local463 = Class111.anIntArray299[local372] >> 1;
									@Pc(469) int local469 = Class111.anIntArray298[local386] >> 1;
									local475 = Class111.anIntArray299[local379] >> 1;
									@Pc(481) int local481 = Class111.anIntArray299[local386] >> 1;
									@Pc(489) int local489 = local463 * local475 + 16384 >> 15;
									local495 = Class111.anIntArray298[local379] >> 1;
									local503 = local495 * local463 + 16384 >> 15;
									local410[3] = local457 * local475 + 16384 >> 15;
									local410[1] = -local475 * local469 + local481 * local503 + 16384 >> 15;
									local410[8] = local457 * local469 + 16384 >> 15;
									local410[7] = -local475 * -local481 + local469 * local503 + 16384 >> 15;
									local410[6] = local489 * local469 + -local481 * local495 + 16384 >> 15;
									local410[4] = local457 * local495 + 16384 >> 15;
									local410[13] = -local365 * local410[7] + local410[1] * -local351 + local410[4] * -local358 + 16384 >> 15;
									local410[5] = -local463;
									local410[2] = local457 * local481 + 16384 >> 15;
									local410[0] = local469 * local495 + local481 * local489 + 16384 >> 15;
									local410[12] = local410[3] * -local358 + local410[0] * -local351 + -local365 * local410[6] + 16384 >> 15;
									local410[14] = local410[8] * -local365 + -local351 * local410[2] + -local358 * local410[5] + 16384 >> 15;
								}
								local410[10] = local358;
								local410[9] = local351;
								local410[11] = local365;
							}
							if (local372 != 0 || local386 != 0 || local379 != 0) {
								local250[local259].method2767(local372, local386, local379);
							}
							if (local351 != 0 || local358 != 0 || local365 != 0) {
								local250[local259].method2756(local351, local358, local365);
							}
						}
					}
				}
				@Pc(753) Class53_Sub3 local753 = new Class53_Sub3(local250, local250.length);
				for (local351 = 0; local351 < 5; local351++) {
					if (Static258.aShortArrayArray6[local351].length > this.anIntArray463[local351]) {
						local753.method2781(Static293.aShortArray113[local351], Static258.aShortArrayArray6[local351][this.anIntArray463[local351]]);
					}
					if (Static27.aShortArrayArray1[local351].length > this.anIntArray463[local351]) {
						local753.method2781(Static160.aShortArray46[local351], Static27.aShortArrayArray1[local351][this.anIntArray463[local351]]);
					}
				}
				local169 = local753.method2774(64, 850, -30, -50, -30);
				if (Static94.aBoolean138) {
					((Class53_Sub4_Sub2) local169).method3909(false, false, true, false, false, true);
				}
				if (arg9) {
					Static68.aClass26_12.method510(local169, local54);
					this.aLong159 = local54;
				}
			}
		}
		local174 = false;
		@Pc(848) boolean local848 = false;
		@Pc(850) boolean local850 = false;
		@Pc(852) boolean local852 = false;
		local351 = arg0 == null ? 0 : arg0.length;
		@Pc(1002) int local1002;
		for (local358 = 0; local358 < local351; local358++) {
			if (arg0[local358] != null) {
				@Pc(881) Class46 local881 = Static156.method2501(arg0[local358].anInt4457);
				if (local881.anIntArray95 != null) {
					local174 = true;
					Static187.aClass46Array2[local358] = local881;
					local372 = arg0[local358].anInt4463;
					local386 = arg0[local358].anInt4465;
					local379 = local881.anIntArray95[local372];
					Static214.aClass4_Sub3_Sub19Array4[local358] = Static253.method4021(local379 >>> 16);
					local379 &= 0xFFFF;
					Static113.anIntArray190[local358] = local379;
					if (Static214.aClass4_Sub3_Sub19Array4[local358] != null) {
						local850 |= Static214.aClass4_Sub3_Sub19Array4[local358].method4188(local379);
						local848 |= Static214.aClass4_Sub3_Sub19Array4[local358].method4187(local379);
						local852 |= local881.aBoolean72;
					}
					if ((local881.aBoolean70 || Static269.aBoolean258) && local386 != -1 && local881.anIntArray95.length > local386) {
						Static239.anIntArray483[local358] = local881.anIntArray94[local372];
						Static109.anIntArray181[local358] = arg0[local358].anInt4461;
						local1002 = local881.anIntArray95[local386];
						Static168.aClass4_Sub3_Sub19Array2[local358] = Static253.method4021(local1002 >>> 16);
						@Pc(1014) int local1014 = local1002 & 0xFFFF;
						Static122.anIntArray211[local358] = local1014;
						if (Static168.aClass4_Sub3_Sub19Array2[local358] != null) {
							local850 |= Static168.aClass4_Sub3_Sub19Array2[local358].method4188(local1014);
							local848 |= Static168.aClass4_Sub3_Sub19Array2[local358].method4187(local1014);
						}
					} else {
						Static239.anIntArray483[local358] = 0;
						Static109.anIntArray181[local358] = 0;
						Static168.aClass4_Sub3_Sub19Array2[local358] = null;
						Static122.anIntArray211[local358] = -1;
					}
				}
			}
		}
		if (local174 || arg8 != null || arg4 != null) {
			local358 = -1;
			local365 = -1;
			@Pc(1068) Class4_Sub3_Sub19 local1068 = null;
			local372 = 0;
			@Pc(1072) Class4_Sub3_Sub19 local1072 = null;
			if (arg8 != null) {
				local358 = arg8.anIntArray95[arg5];
				local1002 = local358 >>> 16;
				local358 &= 0xFFFF;
				local1068 = Static253.method4021(local1002);
				if (local1068 != null) {
					local850 |= local1068.method4188(local358);
					local848 |= local1068.method4187(local358);
					local852 |= arg8.aBoolean72;
				}
				if ((arg8.aBoolean70 || Static269.aBoolean258) && arg2 != -1 && arg2 < arg8.anIntArray95.length) {
					local365 = arg8.anIntArray95[arg2];
					local457 = local365 >>> 16;
					local365 &= 0xFFFF;
					local372 = arg8.anIntArray94[arg5];
					if (local457 == local1002) {
						local1072 = local1068;
					} else {
						local1072 = Static253.method4021(local365 >>> 16);
					}
					if (local1072 != null) {
						local850 |= local1072.method4188(local365);
						local848 |= local1072.method4187(local365);
					}
				}
			}
			local457 = -1;
			local463 = 0;
			local1002 = -1;
			@Pc(1186) Class4_Sub3_Sub19 local1186 = null;
			@Pc(1188) Class4_Sub3_Sub19 local1188 = null;
			if (arg4 != null) {
				local1002 = arg4.anIntArray95[arg1];
				local495 = local1002 >>> 16;
				local1188 = Static253.method4021(local495);
				local1002 &= 0xFFFF;
				if (local1188 != null) {
					local850 |= local1188.method4188(local1002);
					local848 |= local1188.method4187(local1002);
					local852 |= arg4.aBoolean72;
				}
				if ((arg4.aBoolean70 || Static269.aBoolean258) && arg3 != -1 && arg3 < arg4.anIntArray95.length) {
					local463 = arg4.anIntArray94[arg1];
					local457 = arg4.anIntArray95[arg3];
					local475 = local457 >>> 16;
					local457 &= 0xFFFF;
					if (local475 == local495) {
						local1186 = local1188;
					} else {
						local1186 = Static253.method4021(local457 >>> 16);
					}
					if (local1186 != null) {
						local850 |= local1186.method4188(local457);
						local848 |= local1186.method4187(local457);
					}
				}
			}
			@Pc(1318) Class53_Sub4 local1318 = local169.method3868(!local848, !local850, !local852);
			local475 = 0;
			local503 = 1;
			while (local351 > local475) {
				if (Static214.aClass4_Sub3_Sub19Array4[local475] != null) {
					local1318.method3876(Static214.aClass4_Sub3_Sub19Array4[local475], Static113.anIntArray190[local475], Static168.aClass4_Sub3_Sub19Array2[local475], Static122.anIntArray211[local475], Static109.anIntArray181[local475] - 1, Static239.anIntArray483[local475], local503, Static187.aClass46Array2[local475].aBoolean72, this.anIntArrayArray37[local475]);
				}
				local475++;
				local503 <<= 0x1;
			}
			if (local1068 != null && local1188 != null) {
				local1318.method3853(local1068, local358, local1072, local365, arg10 - 1, local372, local1188, local1002, local1186, local457, arg7 - 1, local463, arg8.aBooleanArray6, arg4.aBoolean72 | arg8.aBoolean72);
			} else if (local1068 != null) {
				local1318.method3872(local1068, local358, local1072, local365, arg10 - 1, local372, arg8.aBoolean72);
			} else if (local1188 != null) {
				local1318.method3872(local1188, local1002, local1186, local457, arg7 - 1, local463, arg4.aBoolean72);
			}
			for (local475 = 0; local475 < local351; local475++) {
				Static214.aClass4_Sub3_Sub19Array4[local475] = null;
				Static168.aClass4_Sub3_Sub19Array2[local475] = null;
				Static187.aClass46Array2[local475] = null;
			}
			return local1318;
		} else if (arg6) {
			return local169.method3868(false, false, false);
		} else {
			return local169;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!eg;IIIIII)Lclient!vg;")
	public Class53_Sub4 method3646(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) long local14 = (long) arg2 << 32 | (long) (arg1 << 16) | (long) arg5;
		@Pc(24) Class53_Sub4 local24 = (Class53_Sub4) Static138.aClass26_27.method518(local14);
		if (local24 == null) {
			@Pc(30) int local30 = 0;
			@Pc(33) Class53_Sub3[] local33 = new Class53_Sub3[3];
			if (!Static114.method1817(arg5).method3534() || !Static114.method1817(arg1).method3534() || !Static114.method1817(arg2).method3534()) {
				return null;
			}
			@Pc(65) Class53_Sub3 local65 = Static114.method1817(arg5).method3526();
			if (local65 != null) {
				local30++;
				local33[0] = local65;
			}
			local65 = Static114.method1817(arg1).method3526();
			if (local65 != null) {
				local33[local30++] = local65;
			}
			local65 = Static114.method1817(arg2).method3526();
			if (local65 != null) {
				local33[local30++] = local65;
			}
			local65 = new Class53_Sub3(local33, local30);
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				if (Static258.aShortArrayArray6[local107].length > this.anIntArray463[local107]) {
					local65.method2781(Static293.aShortArray113[local107], Static258.aShortArrayArray6[local107][this.anIntArray463[local107]]);
				}
				if (Static27.aShortArrayArray1[local107].length > this.anIntArray463[local107]) {
					local65.method2781(Static160.aShortArray46[local107], Static27.aShortArrayArray1[local107][this.anIntArray463[local107]]);
				}
			}
			local24 = local65.method2774(64, 768, -50, -10, -50);
			Static138.aClass26_27.method510(local24, local14);
		}
		if (arg0 != null) {
			local24 = arg0.method1017(arg4, arg6, local24, arg3);
		}
		return local24;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[II[IZ)V")
	public void method3647(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		if (this.anInt4373 != arg2) {
			this.anInt4373 = arg2;
			this.anIntArrayArray37 = null;
		}
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
				for (@Pc(30) int local30 = 0; local30 < Static7.anInt119; local30++) {
					@Pc(37) Class143 local37 = Static114.method1817(local30);
					if (local37 != null && !local37.aBoolean299 && (arg4 ? Static240.anIntArray487[local25] : Static265.anIntArray550[local25]) == local37.anInt4232) {
						arg1[Static30.anIntArray46[local25]] = Integer.MIN_VALUE | local30;
						break;
					}
				}
			}
		}
		this.anIntArray464 = arg1;
		this.anIntArray463 = arg3;
		this.aBoolean307 = arg4;
		this.anInt4388 = arg0;
		this.method3643();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
	public int method3648() {
		return this.anInt4388 == -1 ? (this.anIntArray464[8] << 10) + (this.anIntArray463[0] << 25) + (this.anIntArray463[4] << 20) + (this.anIntArray464[0] << 15) + (this.anIntArray464[11] << 5) + this.anIntArray464[1] : Static84.method1495(this.anInt4388).anInt5256 + 305419896;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!eg;IBI)Lclient!vg;")
	public Class53_Sub4 method3649(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt4388 != -1) {
			return Static84.method1495(this.anInt4388).method4303(arg2, arg1, arg0, arg3);
		}
		@Pc(28) Class53_Sub4 local28 = (Class53_Sub4) Static138.aClass26_27.method518(this.aLong158);
		if (local28 == null) {
			@Pc(33) boolean local33 = false;
			@Pc(43) int local43;
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				local43 = this.anIntArray464[local35];
				if ((local43 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local43) != 0 && !Static114.method1817(local43 & 0x3FFFFFFF).method3534()) {
						local33 = true;
					}
				} else if (!Static287.method4398(local43 & 0x3FFFFFFF).method4171(this.aBoolean307)) {
					local33 = true;
				}
			}
			if (local33) {
				return null;
			}
			@Pc(93) Class53_Sub3[] local93 = new Class53_Sub3[12];
			local43 = 0;
			@Pc(105) int local105;
			for (@Pc(97) int local97 = 0; local97 < 12; local97++) {
				local105 = this.anIntArray464[local97];
				@Pc(122) Class53_Sub3 local122;
				if ((local105 & 0x40000000) != 0) {
					local122 = Static287.method4398(local105 & 0x3FFFFFFF).method4162(this.aBoolean307);
					if (local122 != null) {
						local93[local43++] = local122;
					}
				} else if ((Integer.MIN_VALUE & local105) != 0) {
					local122 = Static114.method1817(local105 & 0x3FFFFFFF).method3526();
					if (local122 != null) {
						local93[local43++] = local122;
					}
				}
			}
			@Pc(162) Class53_Sub3 local162 = new Class53_Sub3(local93, local43);
			for (local105 = 0; local105 < 5; local105++) {
				if (Static258.aShortArrayArray6[local105].length > this.anIntArray463[local105]) {
					local162.method2781(Static293.aShortArray113[local105], Static258.aShortArrayArray6[local105][this.anIntArray463[local105]]);
				}
				if (this.anIntArray463[local105] < Static27.aShortArrayArray1[local105].length) {
					local162.method2781(Static160.aShortArray46[local105], Static27.aShortArrayArray1[local105][this.anIntArray463[local105]]);
				}
			}
			local28 = local162.method2774(64, 768, -50, -10, -50);
			Static138.aClass26_27.method510(local28, this.aLong158);
		}
		if (arg1 != null) {
			local28 = arg1.method1017(arg0, arg2, local28, arg3);
		}
		return local28;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IBI)V")
	public void method3650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray463[arg0] = arg1;
		this.method3643();
	}
}
