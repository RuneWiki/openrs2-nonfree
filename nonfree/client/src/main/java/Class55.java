import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class55 {

	@OriginalMember(owner = "client!le", name = "j", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	private int anInt2138;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[I")
	private int[] anIntArray291;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "[I")
	private int[] anIntArray292;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!ri;I)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method1523(@OriginalArg(1) Class3_Sub1_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2138 != -1) {
			return Static84.method3022(this.anInt2138).method619(arg1, arg0);
		}
		@Pc(28) Class3_Sub1_Sub5_Sub3 local28 = (Class3_Sub1_Sub5_Sub3) Static69.aClass5_20.method139(this.aLong75);
		if (local28 == null) {
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
				@Pc(46) int local46 = this.anIntArray291[local39];
				if ((local46 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local46) != 0 && !Static37.method590(local46 & 0x3FFFFFFF).method2808()) {
						local37 = true;
					}
				} else if (!Static173.method2793(local46 & 0x3FFFFFFF).method267(this.aBoolean88)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(94) int local94 = 0;
			@Pc(97) Class3_Sub1_Sub5_Sub5[] local97 = new Class3_Sub1_Sub5_Sub5[12];
			for (@Pc(99) int local99 = 0; local99 < 12; local99++) {
				@Pc(106) int local106 = this.anIntArray291[local99];
				@Pc(127) Class3_Sub1_Sub5_Sub5 local127;
				if ((local106 & 0x40000000) != 0) {
					local127 = Static173.method2793(local106 & 0x3FFFFFFF).method268(this.aBoolean88);
					if (local127 != null) {
						local97[local94++] = local127;
					}
				} else if ((local106 & Integer.MIN_VALUE) != 0) {
					local127 = Static37.method590(local106 & 0x3FFFFFFF).method2810();
					if (local127 != null) {
						local97[local94++] = local127;
					}
				}
			}
			@Pc(165) Class3_Sub1_Sub5_Sub5 local165 = new Class3_Sub1_Sub5_Sub5(local97, local94);
			for (@Pc(167) int local167 = 0; local167 < 5; local167++) {
				if (Static145.aShortArrayArray5[local167].length > this.anIntArray292[local167]) {
					local165.method1901(Static131.aShortArray53[local167], Static145.aShortArrayArray5[local167][this.anIntArray292[local167]]);
				}
				if (this.anIntArray292[local167] < Static140.aShortArrayArray4[local167].length) {
					local165.method1901(Static47.aShortArray16[local167], Static140.aShortArrayArray4[local167][this.anIntArray292[local167]]);
				}
			}
			local28 = local165.method1908(64, 768, -50, -10, -50, true);
			Static69.aClass5_20.method145(local28, this.aLong75);
		}
		if (arg0 != null) {
			local28 = arg0.method2545(local28, arg1);
		}
		return local28;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	public void method1524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static180.anIntArray486[arg0];
		if (this.anIntArray291[local3] != 0 && Static37.method590(arg1) != null) {
			this.anIntArray291[local3] = Integer.MIN_VALUE | arg1;
			this.method1529();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZI)V")
	public void method1525(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean88) {
			this.method1534(-1, arg0, this.anIntArray292, null);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ)V")
	public void method1526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray292[arg1] = arg0;
		this.method1529();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!mb;)V")
	public void method1527(@OriginalArg(1) Class3_Sub17 arg0) {
		arg0.method2108(this.aBoolean88 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray291[Static180.anIntArray486[local16]];
			if ((Integer.MIN_VALUE & local25) == 0) {
				arg0.method2092(65535);
			} else {
				arg0.method2092(local25 & 0x3FFFFFFF);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method2108(this.anIntArray292[local25]);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	private void method1529() {
		@Pc(4) long local4 = this.aLong75;
		this.aLong75 = -1L;
		@Pc(13) long[] local13 = Class33.aLongArray5;
		for (@Pc(15) int local15 = 0; local15 < 12; local15++) {
			this.aLong75 = this.aLong75 >>> 8 ^ local13[(int) (((long) (this.anIntArray291[local15] >> 24) ^ this.aLong75) & 0xFFL)];
			this.aLong75 = local13[(int) (((long) (this.anIntArray291[local15] >> 16) ^ this.aLong75) & 0xFFL)] ^ this.aLong75 >>> 8;
			this.aLong75 = local13[(int) (((long) (this.anIntArray291[local15] >> 8) ^ this.aLong75) & 0xFFL)] ^ this.aLong75 >>> 8;
			this.aLong75 = this.aLong75 >>> 8 ^ local13[(int) (((long) this.anIntArray291[local15] ^ this.aLong75) & 0xFFL)];
		}
		for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
			this.aLong75 = local13[(int) ((this.aLong75 ^ (long) this.anIntArray292[local117]) & 0xFFL)] ^ this.aLong75 >>> 8;
		}
		this.aLong75 = this.aLong75 >>> 8 ^ local13[(int) (((long) (this.aBoolean88 ? 1 : 0) ^ this.aLong75) & 0xFFL)];
		if (local4 != 0L && local4 != this.aLong75) {
			Static82.aClass5_22.method143(local4);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
	public int method1530() {
		return this.anInt2138 == -1 ? this.anIntArray291[1] + (this.anIntArray291[11] << 5) + (this.anIntArray291[0] << 15) + (this.anIntArray292[0] << 25) + (this.anIntArray292[4] << 20) + (this.anIntArray291[8] << 10) : Static84.method3022(this.anInt2138).anInt910 + 305419896;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIZ)V")
	public void method1531(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray292[arg0];
		if (arg1) {
			local8++;
			if (Static145.aShortArrayArray5[arg0].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static145.aShortArrayArray5[arg0].length - 1;
			}
		}
		this.anIntArray292[arg0] = local8;
		this.method1529();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!ri;ILclient!ri;)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method1532(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub15 arg3) {
		if (this.anInt2138 != -1) {
			return Static84.method3022(this.anInt2138).method620(arg1, arg2, arg3, arg0);
		}
		@Pc(31) long local31 = this.aLong75;
		@Pc(34) int[] local34 = this.anIntArray291;
		if (arg3 != null && (arg3.anInt3548 >= 0 || arg3.anInt3559 >= 0)) {
			local34 = new int[12];
			for (@Pc(47) int local47 = 0; local47 < 12; local47++) {
				local34[local47] = this.anIntArray291[local47];
			}
			if (arg3.anInt3548 >= 0) {
				if (arg3.anInt3548 == 65535) {
					local31 ^= 0xFFFFFFFF00000000L;
					local34[5] = 0;
				} else {
					local34[5] = arg3.anInt3548 | 0x40000000;
					local31 ^= (long) local34[5] << 32;
				}
			}
			if (arg3.anInt3559 >= 0) {
				if (arg3.anInt3559 == 65535) {
					local34[3] = 0;
					local31 ^= 0xFFFFFFFFL;
				} else {
					local34[3] = arg3.anInt3559 | 0x40000000;
					local31 ^= local34[3];
				}
			}
		}
		@Pc(139) Class3_Sub1_Sub5_Sub3 local139 = (Class3_Sub1_Sub5_Sub3) Static82.aClass5_22.method139(local31);
		if (local139 == null) {
			@Pc(143) boolean local143 = false;
			for (@Pc(145) int local145 = 0; local145 < 12; local145++) {
				@Pc(151) int local151 = local34[local145];
				if ((local151 & 0x40000000) == 0) {
					if ((local151 & Integer.MIN_VALUE) != 0 && !Static37.method590(local151 & 0x3FFFFFFF).method2809()) {
						local143 = true;
					}
				} else if (!Static173.method2793(local151 & 0x3FFFFFFF).method263(this.aBoolean88)) {
					local143 = true;
				}
			}
			if (local143) {
				if (this.aLong74 != -1L) {
					local139 = (Class3_Sub1_Sub5_Sub3) Static82.aClass5_22.method139(this.aLong74);
				}
				if (local139 == null) {
					return null;
				}
			}
			if (local139 == null) {
				@Pc(214) Class3_Sub1_Sub5_Sub5[] local214 = new Class3_Sub1_Sub5_Sub5[12];
				@Pc(216) int local216 = 0;
				for (@Pc(218) int local218 = 0; local218 < 12; local218++) {
					@Pc(224) int local224 = local34[local218];
					@Pc(248) Class3_Sub1_Sub5_Sub5 local248;
					if ((local224 & 0x40000000) != 0) {
						local248 = Static173.method2793(local224 & 0x3FFFFFFF).method272(this.aBoolean88);
						if (local248 != null) {
							local214[local216++] = local248;
						}
					} else if ((Integer.MIN_VALUE & local224) != 0) {
						local248 = Static37.method590(local224 & 0x3FFFFFFF).method2814();
						if (local248 != null) {
							local214[local216++] = local248;
						}
					}
				}
				@Pc(284) Class3_Sub1_Sub5_Sub5 local284 = new Class3_Sub1_Sub5_Sub5(local214, local216);
				for (@Pc(286) int local286 = 0; local286 < 5; local286++) {
					if (Static145.aShortArrayArray5[local286].length > this.anIntArray292[local286]) {
						local284.method1901(Static131.aShortArray53[local286], Static145.aShortArrayArray5[local286][this.anIntArray292[local286]]);
					}
					if (this.anIntArray292[local286] < Static140.aShortArrayArray4[local286].length) {
						local284.method1901(Static47.aShortArray16[local286], Static140.aShortArrayArray4[local286][this.anIntArray292[local286]]);
					}
				}
				local139 = local284.method1908(64, 850, -30, -50, -30, true);
				Static82.aClass5_22.method145(local139, local31);
				this.aLong74 = local31;
			}
		}
		if (arg3 == null && arg1 == null) {
			return local139;
		}
		@Pc(376) Class3_Sub1_Sub5_Sub3 local376;
		if (arg3 != null && arg1 != null) {
			local376 = arg3.method2543(arg0, arg1, arg2, local139);
		} else if (arg3 == null) {
			local376 = arg1.method2535(arg2, local139);
		} else {
			local376 = arg3.method2535(arg0, local139);
		}
		return local376;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZB)V")
	public void method1533(@OriginalArg(0) boolean arg0) {
		this.aBoolean88 = arg0;
		this.method1529();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ[I[I)V")
	public void method1534(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(22) int local22 = 0; local22 < 7; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static174.anInt3931; local26++) {
					@Pc(32) Class3_Sub1_Sub16 local32 = Static37.method590(local26);
					if (local32 != null && !local32.aBoolean155 && local32.anInt3924 == local22 + (arg1 ? 7 : 0)) {
						arg3[Static180.anIntArray486[local22]] = local26 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt2138 = arg0;
		this.anIntArray291 = arg3;
		this.anIntArray292 = arg2;
		this.aBoolean88 = arg1;
		this.method1529();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIB)V")
	public void method1535(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 && this.aBoolean88) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray291[Static180.anIntArray486[arg1]];
		if (local19 == 0) {
			return;
		}
		local19 &= 0x3FFFFFFF;
		@Pc(47) Class3_Sub1_Sub16 local47;
		do {
			if (arg0) {
				local19++;
				if (local19 >= Static174.anInt3931) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static174.anInt3931 - 1;
				}
			}
			local47 = Static37.method590(local19);
		} while (local47 == null || local47.aBoolean155 || local47.anInt3924 != arg1 + (this.aBoolean88 ? 7 : 0));
		this.anIntArray291[Static180.anIntArray486[arg1]] = Integer.MIN_VALUE | local19;
		this.method1529();
	}
}
