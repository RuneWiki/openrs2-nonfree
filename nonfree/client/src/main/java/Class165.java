import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class165 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "[Lclient!rl;")
	public Class175[] aClass175Array3;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "[Lclient!hq;")
	public Class89[] aClass89Array3;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "[I")
	public int[] anIntArray427;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "[I")
	public int[] anIntArray429;

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "B")
	public byte aByte61 = 0;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
	public int anInt5182 = 0;

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
	public int anInt5189 = 0;

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
	public int anInt5193 = 0;

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
	public int anInt5194 = 0;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
	public Class165(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4475(arg0);
		} else {
			this.method4478(arg0);
		}
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(III)V")
	public Class165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray83 = new short[arg1];
		this.anIntArray426 = new int[arg0];
		this.aShortArray86 = new short[arg1];
		this.aByteArray71 = new byte[arg1];
		this.aShortArray77 = new short[arg1];
		this.anIntArray427 = new int[arg0];
		this.aShortArray81 = new short[arg1];
		this.aByteArray77 = new byte[arg1];
		this.anIntArray430 = new int[arg1];
		this.anIntArray428 = new int[arg0];
		if (arg2 > 0) {
			this.aShortArray80 = new short[arg2];
			this.aByteArray70 = new byte[arg2];
			this.aShortArray82 = new short[arg2];
			this.aByteArray74 = new byte[arg2];
			this.aShortArray85 = new short[arg2];
			this.aByteArray69 = new byte[arg2];
			this.aShortArray78 = new short[arg2];
			this.aShortArray75 = new short[arg2];
			this.aShortArray76 = new short[arg2];
			this.aByteArray72 = new byte[arg2];
			this.aByteArray68 = new byte[arg2];
			this.aByteArray75 = new byte[arg2];
		}
		this.aByteArray76 = new byte[arg1];
		this.aByteArray73 = new byte[arg1];
		this.aShortArray84 = new short[arg1];
		this.anIntArray429 = new int[arg0];
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([Lclient!qf;I)V")
	public Class165(@OriginalArg(0) Class165[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5189 = 0;
		this.anInt5194 = 0;
		this.anInt5193 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte61 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class165 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt5194 += local54.anInt5194;
				this.anInt5189 += local54.anInt5189;
				this.anInt5193 += local54.anInt5193;
				local33 |= local54.aByteArray76 != null;
				if (local54.aClass175Array3 != null) {
					local31 += local54.aClass175Array3.length;
				}
				if (local54.aClass89Array3 != null) {
					local29 += local54.aClass89Array3.length;
				}
				if (local54.aByteArray73 == null) {
					if (this.aByte61 == -1) {
						this.aByte61 = local54.aByte61;
					}
					if (this.aByte61 != local54.aByte61) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local46 |= local54.anIntArray430 != null;
				local41 |= local54.aShortArray83 != null;
				local37 |= local54.aByteArray77 != null;
				local39 |= local54.aByteArray71 != null;
			}
		}
		this.aShortArray77 = new short[this.anInt5194];
		if (local35) {
			this.aByteArray73 = new byte[this.anInt5194];
		}
		this.aShortArray87 = new short[this.anInt5189];
		if (local37) {
			this.aByteArray77 = new byte[this.anInt5194];
		}
		this.aShortArray86 = new short[this.anInt5194];
		this.anIntArray429 = new int[this.anInt5189];
		if (this.anInt5193 > 0) {
			this.aShortArray85 = new short[this.anInt5193];
			this.aByteArray69 = new byte[this.anInt5193];
			this.aShortArray80 = new short[this.anInt5193];
			this.aByteArray74 = new byte[this.anInt5193];
			this.aShortArray76 = new short[this.anInt5193];
			this.aByteArray70 = new byte[this.anInt5193];
			this.aByteArray72 = new byte[this.anInt5193];
			this.aShortArray78 = new short[this.anInt5193];
			this.aByteArray75 = new byte[this.anInt5193];
			this.aShortArray82 = new short[this.anInt5193];
			this.aShortArray75 = new short[this.anInt5193];
			this.aByteArray68 = new byte[this.anInt5193];
		}
		if (local39) {
			this.aByteArray71 = new byte[this.anInt5194];
		}
		if (local29 > 0) {
			this.aClass89Array3 = new Class89[local29];
		}
		if (local31 > 0) {
			this.aClass175Array3 = new Class175[local31];
		}
		this.aShortArray81 = new short[this.anInt5194];
		if (local46) {
			this.anIntArray430 = new int[this.anInt5194];
		}
		this.anIntArray428 = new int[this.anInt5189];
		this.aShortArray84 = new short[this.anInt5194];
		this.aShortArray79 = new short[this.anInt5194];
		this.anIntArray426 = new int[this.anInt5189];
		if (local41) {
			this.aShortArray83 = new short[this.anInt5194];
		}
		if (local33) {
			this.aByteArray76 = new byte[this.anInt5194];
		}
		this.anIntArray427 = new int[this.anInt5189];
		this.anInt5194 = 0;
		local31 = 0;
		this.anInt5189 = 0;
		this.anInt5193 = 0;
		local29 = 0;
		@Pc(553) int local553;
		@Pc(564) int local564;
		for (@Pc(352) int local352 = 0; local352 < arg1; local352++) {
			@Pc(359) short local359 = (short) (0x1 << local352);
			@Pc(363) Class165 local363 = arg0[local352];
			if (local363 != null) {
				for (@Pc(367) int local367 = 0; local367 < local363.anInt5194; local367++) {
					if (local33 && local363.aByteArray76 != null) {
						this.aByteArray76[this.anInt5194] = local363.aByteArray76[local367];
					}
					if (local35) {
						if (local363.aByteArray73 == null) {
							this.aByteArray73[this.anInt5194] = local363.aByte61;
						} else {
							this.aByteArray73[this.anInt5194] = local363.aByteArray73[local367];
						}
					}
					if (local37 && local363.aByteArray77 != null) {
						this.aByteArray77[this.anInt5194] = local363.aByteArray77[local367];
					}
					if (local41) {
						if (local363.aShortArray83 == null) {
							this.aShortArray83[this.anInt5194] = -1;
						} else {
							this.aShortArray83[this.anInt5194] = local363.aShortArray83[local367];
						}
					}
					if (local46) {
						if (local363.anIntArray430 == null) {
							this.anIntArray430[this.anInt5194] = -1;
						} else {
							this.anIntArray430[this.anInt5194] = local363.anIntArray430[local367];
						}
					}
					this.aShortArray86[this.anInt5194] = (short) this.method4484(local363.aShortArray86[local367], local363, local359);
					this.aShortArray81[this.anInt5194] = (short) this.method4484(local363.aShortArray81[local367], local363, local359);
					this.aShortArray84[this.anInt5194] = (short) this.method4484(local363.aShortArray84[local367], local363, local359);
					this.aShortArray79[this.anInt5194] = local359;
					this.aShortArray77[this.anInt5194] = local363.aShortArray77[local367];
					this.anInt5194++;
				}
				@Pc(540) int local540;
				if (local363.aClass89Array3 != null) {
					for (local540 = 0; local540 < local363.aClass89Array3.length; local540++) {
						local553 = this.method4484(local363.aClass89Array3[local540].anInt2946, local363, local359);
						local564 = this.method4484(local363.aClass89Array3[local540].anInt2938, local363, local359);
						@Pc(575) int local575 = this.method4484(local363.aClass89Array3[local540].anInt2939, local363, local359);
						this.aClass89Array3[local29] = new Class89(local363.aClass89Array3[local540].anInt2944, local553, local564, local575, local363.aClass89Array3[local540].aByte33);
						local29++;
					}
				}
				if (local363.aClass175Array3 != null) {
					for (local540 = 0; local540 < local363.aClass175Array3.length; local540++) {
						local553 = this.method4484(local363.aClass175Array3[local540].anInt5503, local363, local359);
						this.aClass175Array3[local31] = new Class175(local363.aClass175Array3[local540].anInt5509, local553);
						local31++;
					}
				}
			}
		}
		this.anInt5182 = this.anInt5189;
		@Pc(658) int local658 = 0;
		for (@Pc(660) int local660 = 0; local660 < arg1; local660++) {
			@Pc(667) short local667 = (short) (0x1 << local660);
			@Pc(671) Class165 local671 = arg0[local660];
			if (local671 != null) {
				for (local553 = 0; local553 < local671.anInt5194; local553++) {
					if (local39) {
						this.aByteArray71[local658++] = (byte) (local671.aByteArray71 == null || local671.aByteArray71[local553] == -1 ? -1 : local671.aByteArray71[local553] + this.anInt5193);
					}
				}
				for (local564 = 0; local564 < local671.anInt5193; local564++) {
					@Pc(727) byte local727 = this.aByteArray74[this.anInt5193] = local671.aByteArray74[local564];
					if (local727 == 0) {
						this.aShortArray82[this.anInt5193] = (short) this.method4484(local671.aShortArray82[local564], local671, local667);
						this.aShortArray75[this.anInt5193] = (short) this.method4484(local671.aShortArray75[local564], local671, local667);
						this.aShortArray76[this.anInt5193] = (short) this.method4484(local671.aShortArray76[local564], local671, local667);
					}
					if (local727 >= 1 && local727 <= 3) {
						this.aShortArray82[this.anInt5193] = local671.aShortArray82[local564];
						this.aShortArray75[this.anInt5193] = local671.aShortArray75[local564];
						this.aShortArray76[this.anInt5193] = local671.aShortArray76[local564];
						this.aShortArray78[this.anInt5193] = local671.aShortArray78[local564];
						this.aShortArray80[this.anInt5193] = local671.aShortArray80[local564];
						this.aShortArray85[this.anInt5193] = local671.aShortArray85[local564];
						this.aByteArray68[this.anInt5193] = local671.aByteArray68[local564];
						this.aByteArray69[this.anInt5193] = local671.aByteArray69[local564];
						this.aByteArray75[this.anInt5193] = local671.aByteArray75[local564];
					}
					if (local727 == 2) {
						this.aByteArray70[this.anInt5193] = local671.aByteArray70[local564];
						this.aByteArray72[this.anInt5193] = local671.aByteArray72[local564];
					}
					this.anInt5193++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)[[I")
	public int[][] method4474() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5182; local12++) {
			@Pc(19) int local19 = this.anIntArray426[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(30) int local30 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt5182; local74++) {
			@Pc(81) int local81 = this.anIntArray426[local74];
			if (local81 >= 0) {
				local47[local81][local8[local81]++] = local74;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BI)V")
	private void method4475(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg0);
		@Pc(15) Class4_Sub11 local15 = new Class4_Sub11(arg0);
		@Pc(20) Class4_Sub11 local20 = new Class4_Sub11(arg0);
		@Pc(25) Class4_Sub11 local25 = new Class4_Sub11(arg0);
		@Pc(30) Class4_Sub11 local30 = new Class4_Sub11(arg0);
		@Pc(35) Class4_Sub11 local35 = new Class4_Sub11(arg0);
		@Pc(40) Class4_Sub11 local40 = new Class4_Sub11(arg0);
		local10.anInt3768 = arg0.length - 23;
		this.anInt5189 = local10.method3401();
		this.anInt5194 = local10.method3401();
		this.anInt5193 = local10.method3440();
		@Pc(65) int local65 = local10.method3440();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(89) int local89 = local10.method3440();
		@Pc(93) int local93 = local10.method3440();
		@Pc(97) int local97 = local10.method3440();
		@Pc(101) int local101 = local10.method3440();
		@Pc(105) int local105 = local10.method3440();
		@Pc(109) int local109 = local10.method3401();
		@Pc(113) int local113 = local10.method3401();
		@Pc(117) int local117 = local10.method3401();
		@Pc(121) int local121 = local10.method3401();
		@Pc(125) int local125 = local10.method3401();
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(144) int local144;
		if (this.anInt5193 > 0) {
			this.aByteArray74 = new byte[this.anInt5193];
			local10.anInt3768 = 0;
			for (local144 = 0; local144 < this.anInt5193; local144++) {
				@Pc(155) byte local155 = this.aByteArray74[local144] = local10.method3426();
				if (local155 == 0) {
					local127++;
				}
				if (local155 >= 1 && local155 <= 3) {
					local129++;
				}
				if (local155 == 2) {
					local131++;
				}
			}
		}
		local144 = this.anInt5193;
		@Pc(186) int local186 = local144;
		local144 += this.anInt5189;
		@Pc(193) int local193 = local144;
		if (local76) {
			local144 += this.anInt5194;
		}
		@Pc(202) int local202 = local144;
		local144 += this.anInt5194;
		@Pc(209) int local209 = local144;
		if (local89 == 255) {
			local144 += this.anInt5194;
		}
		@Pc(221) int local221 = local144;
		if (local97 == 1) {
			local144 += this.anInt5194;
		}
		@Pc(233) int local233 = local144;
		if (local105 == 1) {
			local144 += this.anInt5189;
		}
		@Pc(245) int local245 = local144;
		if (local93 == 1) {
			local144 += this.anInt5194;
		}
		@Pc(255) int local255 = local144;
		local144 += local121;
		@Pc(261) int local261 = local144;
		if (local101 == 1) {
			local144 += this.anInt5194 * 2;
		}
		@Pc(275) int local275 = local144;
		local144 += local125;
		@Pc(281) int local281 = local144;
		local144 += this.anInt5194 * 2;
		@Pc(290) int local290 = local144;
		local144 += local109;
		@Pc(296) int local296 = local144;
		local144 += local113;
		@Pc(302) int local302 = local144;
		local144 += local117;
		@Pc(308) int local308 = local144;
		local144 += local127 * 6;
		@Pc(316) int local316 = local144;
		local144 += local129 * 6;
		@Pc(324) int local324 = local144;
		local144 += local129 * 6;
		@Pc(332) int local332 = local144;
		local144 += local129;
		@Pc(338) int local338 = local144;
		local144 += local129;
		@Pc(344) int local344 = local144;
		local144 += local131 * 2 + local129;
		if (local93 == 1) {
			this.aByteArray77 = new byte[this.anInt5194];
		}
		if (local97 == 1) {
			this.anIntArray430 = new int[this.anInt5194];
		}
		this.aShortArray81 = new short[this.anInt5194];
		this.anIntArray427 = new int[this.anInt5189];
		if (local105 == 1) {
			this.anIntArray426 = new int[this.anInt5189];
		}
		this.anIntArray428 = new int[this.anInt5189];
		if (this.anInt5193 > 0) {
			this.aShortArray75 = new short[this.anInt5193];
			if (local131 > 0) {
				this.aByteArray72 = new byte[local131];
				this.aByteArray70 = new byte[local131];
			}
			this.aShortArray76 = new short[this.anInt5193];
			this.aShortArray82 = new short[this.anInt5193];
			if (local129 > 0) {
				this.aShortArray80 = new short[local129];
				this.aByteArray68 = new byte[local129];
				this.aByteArray69 = new byte[local129];
				this.aShortArray78 = new short[local129];
				this.aByteArray75 = new byte[local129];
				this.aShortArray85 = new short[local129];
			}
		}
		this.anIntArray429 = new int[this.anInt5189];
		if (local89 == 255) {
			this.aByteArray73 = new byte[this.anInt5194];
		} else {
			this.aByte61 = (byte) local89;
		}
		if (local101 == 1 && this.anInt5193 > 0) {
			this.aByteArray71 = new byte[this.anInt5194];
		}
		this.aShortArray84 = new short[this.anInt5194];
		local10.anInt3768 = local186;
		this.aShortArray86 = new short[this.anInt5194];
		if (local76) {
			this.aByteArray76 = new byte[this.anInt5194];
		}
		this.aShortArray77 = new short[this.anInt5194];
		if (local101 == 1) {
			this.aShortArray83 = new short[this.anInt5194];
		}
		local15.anInt3768 = local290;
		local20.anInt3768 = local296;
		local25.anInt3768 = local302;
		local30.anInt3768 = local233;
		@Pc(536) int local536 = 0;
		@Pc(538) int local538 = 0;
		@Pc(540) int local540 = 0;
		@Pc(548) int local548;
		for (@Pc(542) int local542 = 0; local542 < this.anInt5189; local542++) {
			local548 = local10.method3440();
			@Pc(550) int local550 = 0;
			if ((local548 & 0x1) != 0) {
				local550 = local15.method3406();
			}
			@Pc(563) int local563 = 0;
			if ((local548 & 0x2) != 0) {
				local563 = local20.method3406();
			}
			@Pc(576) int local576 = 0;
			if ((local548 & 0x4) != 0) {
				local576 = local25.method3406();
			}
			this.anIntArray428[local542] = local550 + local536;
			this.anIntArray429[local542] = local563 + local538;
			this.anIntArray427[local542] = local576 + local540;
			local540 = this.anIntArray427[local542];
			local538 = this.anIntArray429[local542];
			local536 = this.anIntArray428[local542];
			if (local105 == 1) {
				this.anIntArray426[local542] = local30.method3440();
			}
		}
		local10.anInt3768 = local281;
		local15.anInt3768 = local193;
		local20.anInt3768 = local209;
		local25.anInt3768 = local245;
		local30.anInt3768 = local221;
		local35.anInt3768 = local261;
		local40.anInt3768 = local275;
		for (local548 = 0; local548 < this.anInt5194; local548++) {
			this.aShortArray77[local548] = (short) local10.method3401();
			if (local76) {
				this.aByteArray76[local548] = local15.method3426();
			}
			if (local89 == 255) {
				this.aByteArray73[local548] = local20.method3426();
			}
			if (local93 == 1) {
				this.aByteArray77[local548] = local25.method3426();
			}
			if (local97 == 1) {
				this.anIntArray430[local548] = local30.method3440();
			}
			if (local101 == 1) {
				this.aShortArray83[local548] = (short) (local35.method3401() - 1);
			}
			if (this.aByteArray71 != null) {
				if (this.aShortArray83[local548] == -1) {
					this.aByteArray71[local548] = -1;
				} else {
					this.aByteArray71[local548] = (byte) (local40.method3440() - 1);
				}
			}
		}
		this.anInt5182 = -1;
		local10.anInt3768 = local255;
		local15.anInt3768 = local202;
		@Pc(767) short local767 = 0;
		@Pc(769) short local769 = 0;
		@Pc(771) short local771 = 0;
		@Pc(773) short local773 = 0;
		@Pc(781) int local781;
		for (@Pc(775) int local775 = 0; local775 < this.anInt5194; local775++) {
			local781 = local15.method3440();
			if (local781 == 1) {
				local767 = (short) (local773 + local10.method3406());
				local769 = (short) (local10.method3406() + local767);
				local771 = (short) (local10.method3406() + local769);
				local773 = local771;
				this.aShortArray86[local775] = local767;
				this.aShortArray81[local775] = local769;
				this.aShortArray84[local775] = local771;
				if (this.anInt5182 < local767) {
					this.anInt5182 = local767;
				}
				if (this.anInt5182 < local769) {
					this.anInt5182 = local769;
				}
				if (this.anInt5182 < local771) {
					this.anInt5182 = local771;
				}
			}
			if (local781 == 2) {
				local769 = local771;
				local771 = (short) (local10.method3406() + local773);
				this.aShortArray86[local775] = local767;
				local773 = local771;
				this.aShortArray81[local775] = local769;
				this.aShortArray84[local775] = local771;
				if (this.anInt5182 < local771) {
					this.anInt5182 = local771;
				}
			}
			if (local781 == 3) {
				local767 = local771;
				local771 = (short) (local10.method3406() + local773);
				local773 = local771;
				this.aShortArray86[local775] = local767;
				this.aShortArray81[local775] = local769;
				this.aShortArray84[local775] = local771;
				if (local771 > this.anInt5182) {
					this.anInt5182 = local771;
				}
			}
			if (local781 == 4) {
				@Pc(938) short local938 = local767;
				local767 = local769;
				local769 = local938;
				local771 = (short) (local10.method3406() + local773);
				local773 = local771;
				this.aShortArray86[local775] = local767;
				this.aShortArray81[local775] = local938;
				this.aShortArray84[local775] = local771;
				if (local771 > this.anInt5182) {
					this.anInt5182 = local771;
				}
			}
		}
		this.anInt5182++;
		local10.anInt3768 = local308;
		local15.anInt3768 = local316;
		local20.anInt3768 = local324;
		local25.anInt3768 = local332;
		local30.anInt3768 = local338;
		local35.anInt3768 = local344;
		@Pc(1013) int local1013;
		for (local781 = 0; local781 < this.anInt5193; local781++) {
			local1013 = this.aByteArray74[local781] & 0xFF;
			if (local1013 == 0) {
				this.aShortArray82[local781] = (short) local10.method3401();
				this.aShortArray75[local781] = (short) local10.method3401();
				this.aShortArray76[local781] = (short) local10.method3401();
			}
			if (local1013 == 1) {
				this.aShortArray82[local781] = (short) local15.method3401();
				this.aShortArray75[local781] = (short) local15.method3401();
				this.aShortArray76[local781] = (short) local15.method3401();
				this.aShortArray78[local781] = (short) local20.method3401();
				this.aShortArray80[local781] = (short) local20.method3401();
				this.aShortArray85[local781] = (short) local20.method3401();
				this.aByteArray68[local781] = local25.method3426();
				this.aByteArray69[local781] = local30.method3426();
				this.aByteArray75[local781] = local35.method3426();
			}
			if (local1013 == 2) {
				this.aShortArray82[local781] = (short) local15.method3401();
				this.aShortArray75[local781] = (short) local15.method3401();
				this.aShortArray76[local781] = (short) local15.method3401();
				this.aShortArray78[local781] = (short) local20.method3401();
				this.aShortArray80[local781] = (short) local20.method3401();
				this.aShortArray85[local781] = (short) local20.method3401();
				this.aByteArray68[local781] = local25.method3426();
				this.aByteArray69[local781] = local30.method3426();
				this.aByteArray75[local781] = local35.method3426();
				this.aByteArray70[local781] = local35.method3426();
				this.aByteArray72[local781] = local35.method3426();
			}
			if (local1013 == 3) {
				this.aShortArray82[local781] = (short) local15.method3401();
				this.aShortArray75[local781] = (short) local15.method3401();
				this.aShortArray76[local781] = (short) local15.method3401();
				this.aShortArray78[local781] = (short) local20.method3401();
				this.aShortArray80[local781] = (short) local20.method3401();
				this.aShortArray85[local781] = (short) local20.method3401();
				this.aByteArray68[local781] = local25.method3426();
				this.aByteArray69[local781] = local30.method3426();
				this.aByteArray75[local781] = local35.method3426();
			}
		}
		if (!local85) {
			return;
		}
		local10.anInt3768 = local144;
		local1013 = local10.method3440();
		@Pc(1298) int local1298;
		@Pc(1304) int local1304;
		if (local1013 > 0) {
			this.aClass89Array3 = new Class89[local1013];
			for (local1298 = 0; local1298 < local1013; local1298++) {
				local1304 = local10.method3401();
				@Pc(1308) int local1308 = local10.method3401();
				@Pc(1314) byte local1314;
				if (local89 == 255) {
					local1314 = this.aByteArray73[local1308];
				} else {
					local1314 = (byte) local89;
				}
				this.aClass89Array3[local1298] = new Class89(local1304, this.aShortArray86[local1308], this.aShortArray81[local1308], this.aShortArray84[local1308], local1314);
			}
		}
		local1298 = local10.method3440();
		if (local1298 <= 0) {
			return;
		}
		this.aClass175Array3 = new Class175[local1298];
		for (local1304 = 0; local1304 < local1298; local1304++) {
			this.aClass175Array3[local1304] = new Class175(local10.method3401(), local10.method3401());
		}
		return;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(SSI)V")
	public void method4476(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray83 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt5194; local11++) {
			if (arg0 == this.aShortArray83[local11]) {
				this.aShortArray83[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[B)V")
	private void method4478(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0);
		@Pc(19) Class4_Sub11 local19 = new Class4_Sub11(arg0);
		@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0);
		@Pc(29) Class4_Sub11 local29 = new Class4_Sub11(arg0);
		@Pc(34) Class4_Sub11 local34 = new Class4_Sub11(arg0);
		local14.anInt3768 = arg0.length - 18;
		this.anInt5189 = local14.method3401();
		this.anInt5194 = local14.method3401();
		this.anInt5193 = local14.method3440();
		@Pc(59) int local59 = local14.method3440();
		@Pc(63) int local63 = local14.method3440();
		@Pc(67) int local67 = local14.method3440();
		@Pc(71) int local71 = local14.method3440();
		@Pc(75) int local75 = local14.method3440();
		@Pc(79) int local79 = local14.method3401();
		@Pc(87) int local87 = local14.method3401();
		@Pc(91) int local91 = local14.method3401();
		@Pc(95) int local95 = local14.method3401();
		@Pc(104) int local104 = this.anInt5189;
		@Pc(106) int local106 = local104;
		local104 += this.anInt5194;
		@Pc(113) int local113 = local104;
		if (local63 == 255) {
			local104 += this.anInt5194;
		}
		@Pc(125) int local125 = local104;
		if (local71 == 1) {
			local104 += this.anInt5194;
		}
		@Pc(135) int local135 = local104;
		if (local59 == 1) {
			local104 += this.anInt5194;
		}
		@Pc(147) int local147 = local104;
		if (local75 == 1) {
			local104 += this.anInt5189;
		}
		@Pc(157) int local157 = local104;
		if (local67 == 1) {
			local104 += this.anInt5194;
		}
		@Pc(167) int local167 = local104;
		local104 += local95;
		@Pc(173) int local173 = local104;
		local104 += this.anInt5194 * 2;
		@Pc(182) int local182 = local104;
		local104 += this.anInt5193 * 6;
		@Pc(191) int local191 = local104;
		local104 += local79;
		@Pc(197) int local197 = local104;
		local104 += local87;
		this.aShortArray86 = new short[this.anInt5194];
		this.aShortArray84 = new short[this.anInt5194];
		if (this.anInt5193 > 0) {
			this.aByteArray74 = new byte[this.anInt5193];
			this.aShortArray82 = new short[this.anInt5193];
			this.aShortArray75 = new short[this.anInt5193];
			this.aShortArray76 = new short[this.anInt5193];
		}
		this.aShortArray77 = new short[this.anInt5194];
		if (local75 == 1) {
			this.anIntArray426 = new int[this.anInt5189];
		}
		if (local71 == 1) {
			this.anIntArray430 = new int[this.anInt5194];
		}
		if (local59 == 1) {
			this.aByteArray76 = new byte[this.anInt5194];
			this.aShortArray83 = new short[this.anInt5194];
			this.aByteArray71 = new byte[this.anInt5194];
		}
		local14.anInt3768 = 0;
		if (local67 == 1) {
			this.aByteArray77 = new byte[this.anInt5194];
		}
		if (local63 == 255) {
			this.aByteArray73 = new byte[this.anInt5194];
		} else {
			this.aByte61 = (byte) local63;
		}
		this.aShortArray81 = new short[this.anInt5194];
		this.anIntArray429 = new int[this.anInt5189];
		this.anIntArray427 = new int[this.anInt5189];
		this.anIntArray428 = new int[this.anInt5189];
		local19.anInt3768 = local191;
		local24.anInt3768 = local197;
		local29.anInt3768 = local104;
		local34.anInt3768 = local147;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(358) int local358;
		@Pc(360) int local360;
		for (@Pc(352) int local352 = 0; local352 < this.anInt5189; local352++) {
			local358 = local14.method3440();
			local360 = 0;
			if ((local358 & 0x1) != 0) {
				local360 = local19.method3406();
			}
			@Pc(370) int local370 = 0;
			if ((local358 & 0x2) != 0) {
				local370 = local24.method3406();
			}
			@Pc(385) int local385 = 0;
			if ((local358 & 0x4) != 0) {
				local385 = local29.method3406();
			}
			this.anIntArray428[local352] = local346 + local360;
			this.anIntArray429[local352] = local348 + local370;
			this.anIntArray427[local352] = local385 + local350;
			local350 = this.anIntArray427[local352];
			local346 = this.anIntArray428[local352];
			local348 = this.anIntArray429[local352];
			if (local75 == 1) {
				this.anIntArray426[local352] = local34.method3440();
			}
		}
		local14.anInt3768 = local173;
		local19.anInt3768 = local135;
		local24.anInt3768 = local113;
		local29.anInt3768 = local157;
		local34.anInt3768 = local125;
		for (local358 = 0; local358 < this.anInt5194; local358++) {
			this.aShortArray77[local358] = (short) local14.method3401();
			if (local59 == 1) {
				local360 = local19.method3440();
				if ((local360 & 0x1) == 1) {
					local7 = true;
					this.aByteArray76[local358] = 1;
				} else {
					this.aByteArray76[local358] = 0;
				}
				if ((local360 & 0x2) == 2) {
					this.aByteArray71[local358] = (byte) (local360 >> 2);
					this.aShortArray83[local358] = this.aShortArray77[local358];
					this.aShortArray77[local358] = 127;
					if (this.aShortArray83[local358] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray71[local358] = -1;
					this.aShortArray83[local358] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray73[local358] = local24.method3426();
			}
			if (local67 == 1) {
				this.aByteArray77[local358] = local29.method3426();
			}
			if (local71 == 1) {
				this.anIntArray430[local358] = local34.method3440();
			}
		}
		this.anInt5182 = -1;
		local14.anInt3768 = local167;
		local19.anInt3768 = local106;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(616) int local616;
		for (@Pc(610) int local610 = 0; local610 < this.anInt5194; local610++) {
			local616 = local19.method3440();
			if (local616 == 1) {
				local602 = (short) (local608 + local14.method3406());
				local604 = (short) (local14.method3406() + local602);
				local606 = (short) (local604 + local14.method3406());
				this.aShortArray86[local610] = local602;
				local608 = local606;
				this.aShortArray81[local610] = local604;
				this.aShortArray84[local610] = local606;
				if (local602 > this.anInt5182) {
					this.anInt5182 = local602;
				}
				if (local604 > this.anInt5182) {
					this.anInt5182 = local604;
				}
				if (local606 > this.anInt5182) {
					this.anInt5182 = local606;
				}
			}
			if (local616 == 2) {
				local604 = local606;
				local606 = (short) (local608 + local14.method3406());
				local608 = local606;
				this.aShortArray86[local610] = local602;
				this.aShortArray81[local610] = local604;
				this.aShortArray84[local610] = local606;
				if (local606 > this.anInt5182) {
					this.anInt5182 = local606;
				}
			}
			if (local616 == 3) {
				local602 = local606;
				local606 = (short) (local608 + local14.method3406());
				local608 = local606;
				this.aShortArray86[local610] = local602;
				this.aShortArray81[local610] = local604;
				this.aShortArray84[local610] = local606;
				if (this.anInt5182 < local606) {
					this.anInt5182 = local606;
				}
			}
			if (local616 == 4) {
				@Pc(779) short local779 = local602;
				local602 = local604;
				local606 = (short) (local608 + local14.method3406());
				local604 = local779;
				this.aShortArray86[local610] = local602;
				local608 = local606;
				this.aShortArray81[local610] = local779;
				this.aShortArray84[local610] = local606;
				if (local606 > this.anInt5182) {
					this.anInt5182 = local606;
				}
			}
		}
		this.anInt5182++;
		local14.anInt3768 = local182;
		for (local616 = 0; local616 < this.anInt5193; local616++) {
			this.aByteArray74[local616] = 0;
			this.aShortArray82[local616] = (short) local14.method3401();
			this.aShortArray75[local616] = (short) local14.method3401();
			this.aShortArray76[local616] = (short) local14.method3401();
		}
		if (this.aByteArray71 != null) {
			@Pc(879) boolean local879 = false;
			for (@Pc(881) int local881 = 0; local881 < this.anInt5194; local881++) {
				@Pc(890) int local890 = this.aByteArray71[local881] & 0xFF;
				if (local890 != 255) {
					if ((this.aShortArray82[local890] & 0xFFFF) == this.aShortArray86[local881] && (this.aShortArray75[local890] & 0xFFFF) == this.aShortArray81[local881] && this.aShortArray84[local881] == (this.aShortArray76[local890] & 0xFFFF)) {
						this.aByteArray71[local881] = -1;
					} else {
						local879 = true;
					}
				}
			}
			if (!local879) {
				this.aByteArray71 = null;
			}
		}
		if (!local7) {
			this.aByteArray76 = null;
		}
		if (!local9) {
			this.aShortArray83 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
	public void method4479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(14) int local14 = 0; local14 < this.anInt5189; local14++) {
			this.anIntArray428[local14] += arg2;
			this.anIntArray429[local14] += arg0;
			this.anIntArray427[local14] += arg1;
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)[[I")
	public int[][] method4480() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5194; local12++) {
			@Pc(19) int local19 = this.anIntArray430[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(68) int local68 = 0; local68 < this.anInt5194; local68++) {
			@Pc(75) int local75 = this.anIntArray430[local68];
			if (local75 >= 0) {
				local47[local75][local8[local75]++] = local68;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(SIS)V")
	public void method4481(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5194; local15++) {
			if (this.aShortArray77[local15] == arg0) {
				this.aShortArray77[local15] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIII)V")
	public void method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(31) int local31;
		if (arg1 != 0) {
			local7 = Class118_Sub1.anIntArray314[arg1];
			local11 = Class118_Sub1.anIntArray317[arg1];
			for (local13 = 0; local13 < this.anInt5189; local13++) {
				local31 = this.anIntArray428[local13] * local11 + local7 * this.anIntArray429[local13] >> 15;
				this.anIntArray429[local13] = this.anIntArray429[local13] * local11 - this.anIntArray428[local13] * local7 >> 15;
				this.anIntArray428[local13] = local31;
			}
		}
		if (arg0 != 0) {
			local7 = Class118_Sub1.anIntArray314[arg0];
			local11 = Class118_Sub1.anIntArray317[arg0];
			for (local13 = 0; local13 < this.anInt5189; local13++) {
				local31 = local11 * this.anIntArray429[local13] - local7 * this.anIntArray427[local13] >> 15;
				this.anIntArray427[local13] = this.anIntArray429[local13] * local7 + local11 * this.anIntArray427[local13] >> 15;
				this.anIntArray429[local13] = local31;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local7 = Class118_Sub1.anIntArray314[arg2];
		local11 = Class118_Sub1.anIntArray317[arg2];
		for (local13 = 0; local13 < this.anInt5189; local13++) {
			local31 = local7 * this.anIntArray427[local13] + local11 * this.anIntArray428[local13] >> 15;
			this.anIntArray427[local13] = this.anIntArray427[local13] * local11 - local7 * this.anIntArray428[local13] >> 15;
			this.anIntArray428[local13] = local31;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!qf;IS)I")
	private int method4484(@OriginalArg(0) int arg0, @OriginalArg(1) Class165 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray428[arg0];
		@Pc(15) int local15 = arg1.anIntArray429[arg0];
		@Pc(20) int local20 = arg1.anIntArray427[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5189; local22++) {
			if (local10 == this.anIntArray428[local22] && local15 == this.anIntArray429[local22] && this.anIntArray427[local22] == local20) {
				this.aShortArray87[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray428[this.anInt5189] = local10;
		this.anIntArray429[this.anInt5189] = local15;
		this.anIntArray427[this.anInt5189] = local20;
		this.aShortArray87[this.anInt5189] = arg2;
		this.anIntArray426[this.anInt5189] = arg1.anIntArray426 == null ? -1 : arg1.anIntArray426[arg0];
		return this.anInt5189++;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BBSIBBISI)I")
	public int method4485(@OriginalArg(1) byte arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) int arg7) {
		this.aShortArray86[this.anInt5194] = (short) arg2;
		this.aShortArray81[this.anInt5194] = (short) arg5;
		this.aShortArray84[this.anInt5194] = (short) arg7;
		this.aByteArray76[this.anInt5194] = arg4;
		this.aByteArray71[this.anInt5194] = arg3;
		this.aShortArray77[this.anInt5194] = arg6;
		this.aByteArray77[this.anInt5194] = arg0;
		this.aShortArray83[this.anInt5194] = arg1;
		return this.anInt5194++;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(SBSSSSBSBB)B")
	public byte method4486() {
		if (this.anInt5193 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray74[this.anInt5193] = 3;
		this.aShortArray82[this.anInt5193] = 0;
		this.aShortArray75[this.anInt5193] = 32767;
		this.aShortArray76[this.anInt5193] = 0;
		this.aShortArray78[this.anInt5193] = 1024;
		this.aShortArray80[this.anInt5193] = 1024;
		this.aShortArray85[this.anInt5193] = 1024;
		this.aByteArray68[this.anInt5193] = 0;
		this.aByteArray69[this.anInt5193] = 0;
		this.aByteArray75[this.anInt5193] = 0;
		return (byte) this.anInt5193++;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(IIII)I")
	public int method4488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt5189; local12++) {
			if (arg0 == this.anIntArray428[local12] && arg2 == this.anIntArray429[local12] && arg1 == this.anIntArray427[local12]) {
				return local12;
			}
		}
		this.anIntArray428[this.anInt5189] = arg0;
		this.anIntArray429[this.anInt5189] = arg2;
		this.anIntArray427[this.anInt5189] = arg1;
		this.anInt5182 = this.anInt5189 + 1;
		return this.anInt5189++;
	}
}
