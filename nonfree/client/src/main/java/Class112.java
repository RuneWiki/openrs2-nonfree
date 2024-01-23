import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class112 {

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "J")
	private long aLong185;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "[I")
	private int[] anIntArray785;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "[I")
	private int[] anIntArray786;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Z")
	public boolean aBoolean210;

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
	private int anInt4850;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)V")
	public void method3931(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static147.anIntArray665[arg0];
		if (this.anIntArray786[local12] != 0 && Static22.method297(arg1) != null) {
			this.anIntArray786[local12] = arg1 | Integer.MIN_VALUE;
			this.method3939();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!c;IIZ)Lclient!qc;")
	public Class5_Sub3 method3934(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(26) long local26 = (long) arg0 | (long) arg0 << 32 | (long) (arg2 << 16);
		@Pc(32) Class5_Sub3 local32 = (Class5_Sub3) Static17.aClass53_2.method1793(local26);
		if (local32 == null) {
			@Pc(37) Class5_Sub7[] local37 = new Class5_Sub7[2];
			@Pc(39) int local39 = 0;
			if (!Static22.method297(arg0).method3929() || !Static22.method297(arg2).method3929()) {
				return null;
			}
			@Pc(59) Class5_Sub7 local59 = Static22.method297(arg0).method3922();
			if (local59 != null) {
				local39++;
				local37[0] = local59;
			}
			local59 = Static22.method297(arg2).method3922();
			if (local59 != null) {
				local37[local39++] = local59;
			}
			local59 = new Class5_Sub7(local37, local39);
			for (@Pc(87) int local87 = 0; local87 < 5; local87++) {
				if (this.anIntArray785[local87] < Static60.aShortArrayArray30[local87].length) {
					local59.method3794(Static21.aShortArray11[local87], Static60.aShortArrayArray30[local87][this.anIntArray785[local87]]);
				}
				if (this.anIntArray785[local87] < Static2.aShortArrayArray3[local87].length) {
					local59.method3794(Static121.aShortArray165[local87], Static2.aShortArrayArray3[local87][this.anIntArray785[local87]]);
				}
			}
			local32 = local59.method3795(64, 768, -50, -10, -50);
			Static17.aClass53_2.method1794(local32, local26);
		}
		if (arg1 != null) {
			local32 = arg1.method325(local32, arg3);
		}
		return local32;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I")
	public int method3935() {
		return this.anInt4850 == -1 ? (this.anIntArray786[11] << 5) + (this.anIntArray786[8] << 10) + (this.anIntArray785[4] << 20) + (this.anIntArray785[0] << 25) + (this.anIntArray786[0] << 15) + this.anIntArray786[1] : 305419896 - -Static35.method432(this.anInt4850).anInt1274;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V")
	public void method3936(@OriginalArg(1) boolean arg0) {
		this.aBoolean210 = arg0;
		this.method3939();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!c;II)Lclient!qc;")
	public Class5_Sub3 method3937(@OriginalArg(0) Class2_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4850 != -1) {
			return Static35.method432(this.anInt4850).method1054(arg1, arg0);
		}
		@Pc(27) Class5_Sub3 local27 = (Class5_Sub3) Static17.aClass53_2.method1793(this.aLong185);
		if (local27 == null) {
			@Pc(31) boolean local31 = false;
			for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
				@Pc(40) int local40 = this.anIntArray786[local33];
				if ((local40 & 0x40000000) == 0) {
					if ((local40 & Integer.MIN_VALUE) != 0 && !Static22.method297(local40 & 0x3FFFFFFF).method3929()) {
						local31 = true;
					}
				} else if (!Static32.method3209(local40 & 0x3FFFFFFF).method2728(this.aBoolean210)) {
					local31 = true;
				}
			}
			if (local31) {
				return null;
			}
			@Pc(84) int local84 = 0;
			@Pc(87) Class5_Sub7[] local87 = new Class5_Sub7[12];
			for (@Pc(89) int local89 = 0; local89 < 12; local89++) {
				@Pc(96) int local96 = this.anIntArray786[local89];
				@Pc(115) Class5_Sub7 local115;
				if ((local96 & 0x40000000) != 0) {
					local115 = Static32.method3209(local96 & 0x3FFFFFFF).method2724(this.aBoolean210);
					if (local115 != null) {
						local87[local84++] = local115;
					}
				} else if ((local96 & Integer.MIN_VALUE) != 0) {
					local115 = Static22.method297(local96 & 0x3FFFFFFF).method3922();
					if (local115 != null) {
						local87[local84++] = local115;
					}
				}
			}
			@Pc(153) Class5_Sub7 local153 = new Class5_Sub7(local87, local84);
			for (@Pc(155) int local155 = 0; local155 < 5; local155++) {
				if (this.anIntArray785[local155] < Static60.aShortArrayArray30[local155].length) {
					local153.method3794(Static21.aShortArray11[local155], Static60.aShortArrayArray30[local155][this.anIntArray785[local155]]);
				}
				if (Static2.aShortArrayArray3[local155].length > this.anIntArray785[local155]) {
					local153.method3794(Static121.aShortArray165[local155], Static2.aShortArrayArray3[local155][this.anIntArray785[local155]]);
				}
			}
			local27 = local153.method3795(64, 768, -50, -10, -50);
			Static17.aClass53_2.method1794(local27, this.aLong185);
		}
		if (arg0 != null) {
			local27 = arg0.method325(local27, arg1);
		}
		return local27;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	public void method3938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray785[arg1] = arg0;
		this.method3939();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	private void method3939() {
		@Pc(5) long[] local5 = Class82.aLongArray11;
		@Pc(8) long local8 = this.aLong185;
		this.aLong185 = -1L;
		for (@Pc(13) int local13 = 0; local13 < 12; local13++) {
			this.aLong185 = this.aLong185 >>> 8 ^ local5[(int) (((long) (this.anIntArray786[local13] >> 24) ^ this.aLong185) & 0xFFL)];
			this.aLong185 = this.aLong185 >>> 8 ^ local5[(int) (((long) (this.anIntArray786[local13] >> 16) ^ this.aLong185) & 0xFFL)];
			this.aLong185 = this.aLong185 >>> 8 ^ local5[(int) ((this.aLong185 ^ (long) (this.anIntArray786[local13] >> 8)) & 0xFFL)];
			this.aLong185 = this.aLong185 >>> 8 ^ local5[(int) (((long) this.anIntArray786[local13] ^ this.aLong185) & 0xFFL)];
		}
		for (@Pc(108) int local108 = 0; local108 < 5; local108++) {
			this.aLong185 = local5[(int) (((long) this.anIntArray785[local108] ^ this.aLong185) & 0xFFL)] ^ this.aLong185 >>> 8;
		}
		this.aLong185 = local5[(int) ((this.aLong185 ^ (long) (this.aBoolean210 ? 1 : 0)) & 0xFFL)] ^ this.aLong185 >>> 8;
		if ((long) 0 != local8 && this.aLong185 != local8) {
			Static89.aClass53_6.method1791(local8);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILclient!c;Lclient!c;)Lclient!qc;")
	public Class5_Sub3 method3940(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub3_Sub3 arg2, @OriginalArg(4) Class2_Sub3_Sub3 arg3) {
		if (this.anInt4850 != -1) {
			return Static35.method432(this.anInt4850).method1061(arg0, arg1, arg3, arg2);
		}
		@Pc(25) long local25 = this.aLong185;
		@Pc(28) int[] local28 = this.anIntArray786;
		if (arg2 != null && (arg2.anInt447 >= 0 || arg2.anInt451 >= 0)) {
			local28 = new int[12];
			for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
				local28[local50] = this.anIntArray786[local50];
			}
			if (arg2.anInt447 >= 0) {
				if (arg2.anInt447 == 65535) {
					local25 ^= 0xFFFFFFFF00000000L;
					local28[5] = 0;
				} else {
					local28[5] = arg2.anInt447 | 0x40000000;
					local25 ^= (long) local28[5] << 32;
				}
			}
			if (arg2.anInt451 >= 0) {
				if (arg2.anInt451 == 65535) {
					local25 ^= 0xFFFFFFFFL;
					local28[3] = 0;
				} else {
					local28[3] = arg2.anInt451 | 0x40000000;
					local25 ^= local28[3];
				}
			}
		}
		@Pc(137) Class5_Sub3 local137 = (Class5_Sub3) Static89.aClass53_6.method1793(local25);
		if (local137 == null) {
			@Pc(141) boolean local141 = false;
			for (@Pc(143) int local143 = 0; local143 < 12; local143++) {
				@Pc(149) int local149 = local28[local143];
				if ((local149 & 0x40000000) == 0) {
					if ((local149 & Integer.MIN_VALUE) != 0 && !Static22.method297(local149 & 0x3FFFFFFF).method3921()) {
						local141 = true;
					}
				} else if (!Static32.method3209(local149 & 0x3FFFFFFF).method2723(this.aBoolean210)) {
					local141 = true;
				}
			}
			if (local141) {
				if (this.aLong186 != -1L) {
					local137 = (Class5_Sub3) Static89.aClass53_6.method1793(this.aLong186);
				}
				if (local137 == null) {
					return null;
				}
			}
			if (local137 == null) {
				@Pc(220) Class5_Sub7[] local220 = new Class5_Sub7[12];
				@Pc(222) int local222 = 0;
				@Pc(230) int local230;
				@Pc(249) Class5_Sub7 local249;
				for (@Pc(224) int local224 = 0; local224 < 12; local224++) {
					local230 = local28[local224];
					if ((local230 & 0x40000000) != 0) {
						local249 = Static32.method3209(local230 & 0x3FFFFFFF).method2731(this.aBoolean210);
						if (local249 != null) {
							local220[local222++] = local249;
						}
					} else if ((local230 & Integer.MIN_VALUE) != 0) {
						local249 = Static22.method297(local230 & 0x3FFFFFFF).method3928();
						if (local249 != null) {
							local220[local222++] = local249;
						}
					}
				}
				local230 = local28[0];
				@Pc(298) int local298;
				if ((local230 & 0x40000000) != 0) {
					@Pc(293) Class2_Sub3_Sub23 local293 = Static32.method3209(local230 & 0x3FFFFFFF);
					if (local293.anIntArrayArray34 != null) {
						for (local298 = 0; local298 < local293.anIntArrayArray34.length; local298++) {
							if (local293.anIntArrayArray34[local298] != null && local220[local298 + 1] != null) {
								@Pc(320) int local320 = local293.anIntArrayArray34[local298][1];
								@Pc(327) int local327 = local293.anIntArrayArray34[local298][2];
								@Pc(334) int local334 = local293.anIntArrayArray34[local298][0];
								@Pc(341) int local341 = local293.anIntArrayArray34[local298][3];
								@Pc(348) int local348 = local293.anIntArrayArray34[local298][5];
								@Pc(355) int local355 = local293.anIntArrayArray34[local298][4];
								local220[local298 + 1].method3799(local334, local320, local327);
								local220[local298 + 1].method3790(local341, local355, local348);
							}
						}
					}
				}
				local249 = new Class5_Sub7(local220, local222);
				for (local298 = 0; local298 < 5; local298++) {
					if (this.anIntArray785[local298] < Static60.aShortArrayArray30[local298].length) {
						local249.method3794(Static21.aShortArray11[local298], Static60.aShortArrayArray30[local298][this.anIntArray785[local298]]);
					}
					if (Static2.aShortArrayArray3[local298].length > this.anIntArray785[local298]) {
						local249.method3794(Static121.aShortArray165[local298], Static2.aShortArrayArray3[local298][this.anIntArray785[local298]]);
					}
				}
				local137 = local249.method3795(64, 850, -30, -50, -30);
				Static89.aClass53_6.method1794(local137, local25);
				this.aLong186 = local25;
			}
		}
		if (arg2 == null && arg3 == null) {
			return local137;
		}
		@Pc(477) Class5_Sub3 local477;
		if (arg2 != null && arg3 != null) {
			local477 = arg2.method324(local137, arg0, arg1, arg3);
		} else if (arg2 == null) {
			local477 = arg3.method323(local137, arg0);
		} else {
			local477 = arg2.method323(local137, arg1);
		}
		return local477;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI[IB[I)V")
	public void method3941(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(18) int local18 = 0; local18 < 7; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static223.anInt4821; local22++) {
					@Pc(28) Class2_Sub3_Sub29 local28 = Static22.method297(local22);
					if (local28 != null && !local28.aBoolean209 && (arg0 ? 7 : 0) + local18 == local28.anInt4822) {
						arg3[Static147.anIntArray665[local18]] = local22 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt4850 = arg1;
		this.anIntArray786 = arg3;
		this.aBoolean210 = arg0;
		this.anIntArray785 = arg2;
		this.method3939();
	}
}
