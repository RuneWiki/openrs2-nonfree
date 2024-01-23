import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class61 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	private int anInt1857;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Z")
	public boolean aBoolean180;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
	public int anInt1864;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)V")
	public void method1703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray140[arg1] = arg0;
		this.method1708();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V")
	public void method1704(@OriginalArg(0) boolean arg0) {
		this.aBoolean180 = arg0;
		this.method1708();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)V")
	public void method1705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static19.anIntArray40[arg0];
		if (0 != this.anIntArray141[local3] && Static132.method2310(arg1) != null) {
			this.anIntArray141[local3] = Integer.MIN_VALUE | arg1;
			this.method1708();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZILclient!sb;I)Lclient!sm;")
	public Class11_Sub1 method1706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class152 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1864 != -1) {
			return Static275.method4210(this.anInt1864).method4521(arg1, arg3, arg0, arg2);
		}
		@Pc(33) Class11_Sub1 local33 = (Class11_Sub1) Static116.aClass175_19.method4295(this.aLong71);
		if (local33 == null) {
			@Pc(39) boolean local39 = false;
			@Pc(51) int local51;
			for (@Pc(41) int local41 = 0; local41 < 12; local41++) {
				local51 = this.anIntArray141[local41];
				if ((local51 & 0x40000000) == 0) {
					if ((local51 & Integer.MIN_VALUE) != 0 && !Static132.method2310(local51 & 0x3FFFFFFF).method510()) {
						local39 = true;
					}
				} else if (!Static69.method1330(local51 & 0x3FFFFFFF).method80(this.aBoolean180)) {
					local39 = true;
				}
			}
			if (local39) {
				return null;
			}
			local51 = 0;
			@Pc(97) Class11_Sub5[] local97 = new Class11_Sub5[12];
			@Pc(109) int local109;
			for (@Pc(99) int local99 = 0; local99 < 12; local99++) {
				local109 = this.anIntArray141[local99];
				@Pc(133) Class11_Sub5 local133;
				if ((local109 & 0x40000000) != 0) {
					local133 = Static69.method1330(local109 & 0x3FFFFFFF).method70(this.aBoolean180);
					if (local133 != null) {
						local97[local51++] = local133;
					}
				} else if ((Integer.MIN_VALUE & local109) != 0) {
					local133 = Static132.method2310(local109 & 0x3FFFFFFF).method516();
					if (local133 != null) {
						local97[local51++] = local133;
					}
				}
			}
			@Pc(169) Class11_Sub5 local169 = new Class11_Sub5(local97, local51);
			for (local109 = 0; local109 < 5; local109++) {
				if (Static222.aShortArrayArray8[local109].length > this.anIntArray140[local109]) {
					local169.method3053(Static150.aShortArray56[local109], Static222.aShortArrayArray8[local109][this.anIntArray140[local109]]);
				}
				if (Static55.aShortArrayArray4[local109].length > this.anIntArray140[local109]) {
					local169.method3053(Static293.aShortArray85[local109], Static55.aShortArrayArray4[local109][this.anIntArray140[local109]]);
				}
			}
			local33 = local169.method3055(64, 768, -50, -10, -50);
			Static116.aClass175_19.method4285(local33, this.aLong71);
		}
		if (arg2 != null) {
			local33 = arg2.method3915(arg3, local33, arg1, arg0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!sb;IIZLclient!sb;IZIII[Lclient!bi;I)Lclient!sm;")
	public Class11_Sub1 method1707(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class152 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class14[] arg9, @OriginalArg(11) int arg10) {
		if (this.anInt1864 != -1) {
			return Static275.method4210(this.anInt1864).method4510(arg4, arg10, arg0, arg2, arg5, arg9, arg7, arg8, arg1);
		}
		@Pc(28) long local28 = this.aLong71;
		@Pc(31) int[] local31 = this.anIntArray141;
		if (arg0 != null && (arg0.anInt4597 >= 0 || arg0.anInt4610 >= 0)) {
			local31 = new int[12];
			for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
				local31[local48] = this.anIntArray141[local48];
			}
			if (arg0.anInt4597 >= 0) {
				if (arg0.anInt4597 == 65535) {
					local28 ^= 0xFFFFFFFF00000000L;
					local31[5] = 0;
				} else {
					local31[5] = arg0.anInt4597 | 0x40000000;
					local28 ^= (long) local31[5] << 32;
				}
			}
			if (arg0.anInt4610 >= 0) {
				if (arg0.anInt4610 == 65535) {
					local28 ^= 0xFFFFFFFFL;
					local31[3] = 0;
				} else {
					local31[3] = arg0.anInt4610 | 0x40000000;
					local28 ^= local31[3];
				}
			}
		}
		@Pc(140) Class11_Sub1 local140 = (Class11_Sub1) Static100.aClass175_44.method4295(local28);
		@Pc(144) boolean local144;
		@Pc(334) int local334;
		@Pc(341) int local341;
		@Pc(348) int local348;
		@Pc(355) int local355;
		@Pc(362) int local362;
		@Pc(400) int local400;
		@Pc(412) int local412;
		@Pc(406) int local406;
		@Pc(424) int local424;
		@Pc(463) int local463;
		@Pc(327) int local327;
		if (local140 == null) {
			local144 = false;
			@Pc(153) int local153;
			for (@Pc(146) int local146 = 0; local146 < 12; local146++) {
				local153 = local31[local146];
				if ((local153 & 0x40000000) == 0) {
					if ((local153 & Integer.MIN_VALUE) != 0 && !Static132.method2310(local153 & 0x3FFFFFFF).method512()) {
						local144 = true;
					}
				} else if (!Static69.method1330(local153 & 0x3FFFFFFF).method75(this.aBoolean180)) {
					local144 = true;
				}
			}
			if (local144) {
				if (this.aLong72 != -1L) {
					local140 = (Class11_Sub1) Static100.aClass175_44.method4295(this.aLong72);
				}
				if (local140 == null) {
					return null;
				}
			}
			if (local140 == null) {
				@Pc(222) Class11_Sub5[] local222 = new Class11_Sub5[12];
				@Pc(231) int local231;
				for (local153 = 0; local153 < 12; local153++) {
					local231 = local31[local153];
					@Pc(251) Class11_Sub5 local251;
					if ((local231 & 0x40000000) != 0) {
						local251 = Static69.method1330(local231 & 0x3FFFFFFF).method81(this.aBoolean180);
						if (local251 != null) {
							local222[local153] = local251;
						}
					} else if ((Integer.MIN_VALUE & local231) != 0) {
						local251 = Static132.method2310(local231 & 0x3FFFFFFF).method514();
						if (local251 != null) {
							local222[local153] = local251;
						}
					}
				}
				@Pc(282) Class28 local282 = null;
				if (this.anInt1857 != -1) {
					local282 = Static213.method4578(this.anInt1857);
				}
				if (local282 != null && local282.anIntArrayArray7 != null) {
					for (local231 = 0; local231 < local282.anIntArrayArray7.length; local231++) {
						if (local282.anIntArrayArray7[local231] != null && local222[local231] != null) {
							local327 = local282.anIntArrayArray7[local231][0];
							local334 = local282.anIntArrayArray7[local231][1];
							local341 = local282.anIntArrayArray7[local231][2];
							local348 = local282.anIntArrayArray7[local231][3];
							local355 = local282.anIntArrayArray7[local231][4];
							local362 = local282.anIntArrayArray7[local231][5];
							if (this.anIntArrayArray13 == null) {
								this.anIntArrayArray13 = new int[local282.anIntArrayArray7.length][];
							}
							if (this.anIntArrayArray13[local231] == null) {
								@Pc(385) int[] local385 = this.anIntArrayArray13[local231] = new int[15];
								if (local348 == 0 && local355 == 0 && local362 == 0) {
									local385[14] = -local341;
									local385[12] = -local327;
									local385[0] = local385[4] = local385[8] = 32768;
									local385[13] = -local334;
								} else {
									local400 = Class87.anIntArray177[local348] >> 1;
									local406 = Class87.anIntArray177[local362] >> 1;
									local412 = Class87.anIntArray173[local348] >> 1;
									@Pc(418) int local418 = Class87.anIntArray173[local355] >> 1;
									local424 = Class87.anIntArray173[local362] >> 1;
									@Pc(430) int local430 = Class87.anIntArray177[local355] >> 1;
									local385[2] = local418 * local400 + 16384 >> 15;
									local385[5] = -local412;
									local385[8] = local400 * local430 + 16384 >> 15;
									local463 = local406 * local412 + 16384 >> 15;
									local385[7] = local463 * local430 + -local418 * -local424 + 16384 >> 15;
									local385[14] = -local327 * local385[2] + local385[5] * -local334 + -local341 * local385[8] + 16384 >> 15;
									local385[4] = local406 * local400 + 16384 >> 15;
									@Pc(525) int local525 = local424 * local412 + 16384 >> 15;
									local385[0] = local525 * local418 + local430 * local406 + 16384 >> 15;
									local385[6] = local525 * local430 + -local418 * local406 + 16384 >> 15;
									local385[1] = local418 * local463 + -local424 * local430 + 16384 >> 15;
									local385[13] = local385[7] * -local341 + -local327 * local385[1] + local385[4] * -local334 + 16384 >> 15;
									local385[3] = local400 * local424 + 16384 >> 15;
									local385[12] = local385[3] * -local334 + local385[0] * -local327 + local385[6] * -local341 + 16384 >> 15;
								}
								local385[9] = local327;
								local385[11] = local341;
								local385[10] = local334;
							}
							if (local348 != 0 || local355 != 0 || local362 != 0) {
								local222[local231].method3057(local348, local355, local362);
							}
							if (local327 != 0 || local334 != 0 || local341 != 0) {
								local222[local231].method3063(local327, local334, local341);
							}
						}
					}
				}
				@Pc(724) Class11_Sub5 local724 = new Class11_Sub5(local222, local222.length);
				for (local327 = 0; local327 < 5; local327++) {
					if (this.anIntArray140[local327] < Static222.aShortArrayArray8[local327].length) {
						local724.method3053(Static150.aShortArray56[local327], Static222.aShortArrayArray8[local327][this.anIntArray140[local327]]);
					}
					if (Static55.aShortArrayArray4[local327].length > this.anIntArray140[local327]) {
						local724.method3053(Static293.aShortArray85[local327], Static55.aShortArrayArray4[local327][this.anIntArray140[local327]]);
					}
				}
				local140 = local724.method3055(64, 850, -30, -50, -30);
				if (Static71.aBoolean165) {
					((Class11_Sub1_Sub1) local140).method406(false, false, true, false, false, true);
				}
				if (arg6) {
					Static100.aClass175_44.method4285(local140, local28);
					this.aLong72 = local28;
				}
			}
		}
		local144 = false;
		@Pc(823) boolean local823 = false;
		@Pc(825) boolean local825 = false;
		@Pc(827) boolean local827 = false;
		local327 = arg9 == null ? 0 : arg9.length;
		@Pc(957) int local957;
		for (local334 = 0; local334 < local327; local334++) {
			if (arg9[local334] != null) {
				@Pc(851) Class152 local851 = Static107.method2016(arg9[local334].anInt496);
				if (local851.anIntArray509 != null) {
					local144 = true;
					Static175.aClass152Array1[local334] = local851;
					local348 = arg9[local334].anInt497;
					local355 = arg9[local334].anInt498;
					local362 = local851.anIntArray509[local348];
					Static19.aClass1_Sub5_Sub4Array1[local334] = Static278.method4265(local362 >>> 16);
					local362 &= 0xFFFF;
					Static183.anIntArray375[local334] = local362;
					if (Static19.aClass1_Sub5_Sub4Array1[local334] != null) {
						local825 |= Static19.aClass1_Sub5_Sub4Array1[local334].method894(local362);
						local823 |= Static19.aClass1_Sub5_Sub4Array1[local334].method895(local362);
						local827 |= local851.aBoolean426;
					}
					if ((local851.aBoolean425 || Static186.aBoolean313) && local355 != -1 && local851.anIntArray509.length > local355) {
						Static236.anIntArray496[local334] = local851.anIntArray512[local348];
						Static311.anIntArray610[local334] = arg9[local334].anInt494;
						local957 = local851.anIntArray509[local355];
						Static106.aClass1_Sub5_Sub4Array6[local334] = Static278.method4265(local957 >>> 16);
						@Pc(969) int local969 = local957 & 0xFFFF;
						Static11.anIntArray23[local334] = local969;
						if (Static106.aClass1_Sub5_Sub4Array6[local334] != null) {
							local825 |= Static106.aClass1_Sub5_Sub4Array6[local334].method894(local969);
							local823 |= Static106.aClass1_Sub5_Sub4Array6[local334].method895(local969);
						}
					} else {
						Static236.anIntArray496[local334] = 0;
						Static311.anIntArray610[local334] = 0;
						Static106.aClass1_Sub5_Sub4Array6[local334] = null;
						Static11.anIntArray23[local334] = -1;
					}
				}
			}
		}
		if (local144 || arg0 != null || arg4 != null) {
			local334 = -1;
			local341 = -1;
			local348 = 0;
			@Pc(1042) Class1_Sub5_Sub4 local1042 = null;
			@Pc(1044) Class1_Sub5_Sub4 local1044 = null;
			if (arg0 != null) {
				local334 = arg0.anIntArray509[arg2];
				local957 = local334 >>> 16;
				local334 &= 0xFFFF;
				local1042 = Static278.method4265(local957);
				if (local1042 != null) {
					local825 |= local1042.method894(local334);
					local823 |= local1042.method895(local334);
					local827 |= arg0.aBoolean426;
				}
				if ((arg0.aBoolean425 || Static186.aBoolean313) && arg8 != -1 && arg0.anIntArray509.length > arg8) {
					local341 = arg0.anIntArray509[arg8];
					local400 = local341 >>> 16;
					local348 = arg0.anIntArray512[arg2];
					local341 &= 0xFFFF;
					if (local957 == local400) {
						local1044 = local1042;
					} else {
						local1044 = Static278.method4265(local341 >>> 16);
					}
					if (local1044 != null) {
						local825 |= local1044.method894(local341);
						local823 |= local1044.method895(local341);
					}
				}
			}
			local957 = -1;
			local400 = -1;
			local412 = 0;
			@Pc(1165) Class1_Sub5_Sub4 local1165 = null;
			@Pc(1167) Class1_Sub5_Sub4 local1167 = null;
			if (arg4 != null) {
				local957 = arg4.anIntArray509[arg1];
				local406 = local957 >>> 16;
				local1167 = Static278.method4265(local406);
				local957 &= 0xFFFF;
				if (local1167 != null) {
					local825 |= local1167.method894(local957);
					local823 |= local1167.method895(local957);
					local827 |= arg4.aBoolean426;
				}
				if ((arg4.aBoolean425 || Static186.aBoolean313) && arg10 != -1 && arg4.anIntArray509.length > arg10) {
					local400 = arg4.anIntArray509[arg10];
					local424 = local400 >>> 16;
					local400 &= 0xFFFF;
					local412 = arg4.anIntArray512[arg1];
					if (local424 == local406) {
						local1165 = local1167;
					} else {
						local1165 = Static278.method4265(local400 >>> 16);
					}
					if (local1165 != null) {
						local825 |= local1165.method894(local400);
						local823 |= local1165.method895(local400);
					}
				}
			}
			@Pc(1296) Class11_Sub1 local1296 = local140.method2895(!local823, !local825, !local827);
			local424 = 0;
			local463 = 1;
			while (local424 < local327) {
				if (Static19.aClass1_Sub5_Sub4Array1[local424] != null) {
					local1296.method2905(Static19.aClass1_Sub5_Sub4Array1[local424], Static183.anIntArray375[local424], Static106.aClass1_Sub5_Sub4Array6[local424], Static11.anIntArray23[local424], Static311.anIntArray610[local424] - 1, Static236.anIntArray496[local424], local463, Static175.aClass152Array1[local424].aBoolean426, this.anIntArrayArray13[local424]);
				}
				local463 <<= 0x1;
				local424++;
			}
			if (local1042 != null && local1167 != null) {
				local1296.method2901(local1042, local334, local1044, local341, arg5 - 1, local348, local1167, local957, local1165, local400, arg7 - 1, local412, arg0.aBooleanArray20, arg4.aBoolean426 | arg0.aBoolean426);
			} else if (local1042 != null) {
				local1296.method2912(local1042, local334, local1044, local341, arg5 - 1, local348, arg0.aBoolean426);
			} else if (local1167 != null) {
				local1296.method2912(local1167, local957, local1165, local400, arg7 - 1, local412, arg4.aBoolean426);
			}
			for (local424 = 0; local424 < local327; local424++) {
				Static19.aClass1_Sub5_Sub4Array1[local424] = null;
				Static106.aClass1_Sub5_Sub4Array6[local424] = null;
				Static175.aClass152Array1[local424] = null;
			}
			return local1296;
		} else if (arg3) {
			return local140.method2895(false, false, false);
		} else {
			return local140;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	private void method1708() {
		@Pc(4) long local4 = this.aLong71;
		this.aLong71 = -1L;
		@Pc(13) long[] local13 = Class1_Sub5_Sub14.aLongArray8;
		this.aLong71 = this.aLong71 >>> 8 ^ local13[(int) ((long) 255 & ((long) (this.anInt1857 >> 8) ^ this.aLong71))];
		this.aLong71 = this.aLong71 >>> 8 ^ local13[(int) ((this.aLong71 ^ (long) this.anInt1857) & 0xFFL)];
		@Pc(54) int local54;
		for (local54 = 0; local54 < 12; local54++) {
			this.aLong71 = local13[(int) ((this.aLong71 ^ (long) (this.anIntArray141[local54] >> 24)) & 0xFFL)] ^ this.aLong71 >>> 8;
			this.aLong71 = local13[(int) ((this.aLong71 ^ (long) (this.anIntArray141[local54] >> 16)) & 0xFFL)] ^ this.aLong71 >>> 8;
			this.aLong71 = local13[(int) ((this.aLong71 ^ (long) (this.anIntArray141[local54] >> 8)) & 0xFFL)] ^ this.aLong71 >>> 8;
			this.aLong71 = local13[(int) ((this.aLong71 ^ (long) this.anIntArray141[local54]) & 0xFFL)] ^ this.aLong71 >>> 8;
		}
		for (local54 = 0; local54 < 5; local54++) {
			this.aLong71 = this.aLong71 >>> 8 ^ local13[(int) (((long) this.anIntArray140[local54] ^ this.aLong71) & 0xFFL)];
		}
		this.aLong71 = this.aLong71 >>> 8 ^ local13[(int) ((this.aLong71 ^ (long) (this.aBoolean180 ? 1 : 0)) & 0xFFL)];
		if (local4 != 0L && this.aLong71 != local4) {
			Static100.aClass175_44.method4293(local4);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I")
	public int method1710() {
		return this.anInt1864 == -1 ? this.anIntArray141[1] + (this.anIntArray141[11] << 5) + (this.anIntArray141[8] << 10) + (this.anIntArray140[4] << 20) + (this.anIntArray140[0] << 25) + (this.anIntArray141[0] << 15) : Static275.method4210(this.anInt1864).anInt5451 + 305419896;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIILclient!sb;I)Lclient!sm;")
	public Class11_Sub1 method1711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class152 arg5, @OriginalArg(7) int arg6) {
		@Pc(18) long local18 = (long) arg4 | (long) (arg0 << 16) | (long) arg6 << 32;
		@Pc(30) Class11_Sub1 local30 = (Class11_Sub1) Static116.aClass175_19.method4295(local18);
		if (local30 == null) {
			@Pc(36) Class11_Sub5[] local36 = new Class11_Sub5[3];
			@Pc(38) int local38 = 0;
			if (!Static132.method2310(arg4).method510() || !Static132.method2310(arg0).method510() || !Static132.method2310(arg6).method510()) {
				return null;
			}
			@Pc(66) Class11_Sub5 local66 = Static132.method2310(arg4).method516();
			if (local66 != null) {
				local38++;
				local36[0] = local66;
			}
			local66 = Static132.method2310(arg0).method516();
			if (local66 != null) {
				local36[local38++] = local66;
			}
			local66 = Static132.method2310(arg6).method516();
			if (local66 != null) {
				local36[local38++] = local66;
			}
			local66 = new Class11_Sub5(local36, local38);
			for (@Pc(112) int local112 = 0; local112 < 5; local112++) {
				if (this.anIntArray140[local112] < Static222.aShortArrayArray8[local112].length) {
					local66.method3053(Static150.aShortArray56[local112], Static222.aShortArrayArray8[local112][this.anIntArray140[local112]]);
				}
				if (this.anIntArray140[local112] < Static55.aShortArrayArray4[local112].length) {
					local66.method3053(Static293.aShortArray85[local112], Static55.aShortArrayArray4[local112][this.anIntArray140[local112]]);
				}
			}
			local30 = local66.method3055(64, 768, -50, -10, -50);
			Static116.aClass175_19.method4285(local30, local18);
		}
		if (arg5 != null) {
			local30 = arg5.method3915(arg2, local30, arg1, arg3);
		}
		return local30;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZBI[II[I)V")
	public void method1712(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (this.anInt1857 != arg3) {
			this.anInt1857 = arg3;
			this.anIntArrayArray13 = null;
		}
		if (arg4 == null) {
			arg4 = new int[12];
			for (@Pc(27) int local27 = 0; local27 < 8; local27++) {
				for (@Pc(34) int local34 = 0; local34 < Static68.anInt1458; local34++) {
					@Pc(41) Class17 local41 = Static132.method2310(local34);
					if (local41 != null && !local41.aBoolean55 && (arg0 ? Static1.anIntArray4[local27] : Static107.anIntArray158[local27]) == local41.anInt540) {
						arg4[Static19.anIntArray40[local27]] = Integer.MIN_VALUE | local34;
						break;
					}
				}
			}
		}
		this.aBoolean180 = arg0;
		this.anIntArray141 = arg4;
		this.anInt1864 = arg1;
		this.anIntArray140 = arg2;
		this.method1708();
	}
}
