import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class197 {

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "[Lclient!ok;")
	public Class270[] aClass270Array3;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "[Lclient!ui;")
	public Class363[] aClass363Array3;

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "[Lclient!gfa;")
	public Class129[] aClass129Array1;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "B")
	public byte aByte74 = 0;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt5110 = 0;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	public int anInt5115 = 0;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
	public int anInt5125 = 12;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
	public int anInt5130 = 0;

	@OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
	public int anInt5124 = 0;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class197() {
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
	public Class197(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4593(arg0);
		} else {
			this.method4595(arg0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(III)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg1];
		this.anIntArray307 = new int[arg0];
		this.aByteArray49 = new byte[arg1];
		this.aShortArray68 = new short[arg1];
		this.aShortArray66 = new short[arg1];
		this.aShortArray64 = new short[arg1];
		this.aShortArray71 = new short[arg1];
		this.aByteArray55 = new byte[arg1];
		this.aShortArray67 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray300 = new int[arg2];
			this.aByteArray52 = new byte[arg2];
			this.aShortArray63 = new short[arg2];
			this.aByteArray51 = new byte[arg2];
			this.aByteArray54 = new byte[arg2];
			this.anIntArray297 = new int[arg2];
			this.aShortArray65 = new short[arg2];
			this.aShortArray69 = new short[arg2];
			this.anIntArray306 = new int[arg2];
			this.anIntArray304 = new int[arg2];
			this.anIntArray301 = new int[arg2];
			this.anIntArray298 = new int[arg2];
		}
		this.aByteArray50 = new byte[arg1];
		this.anIntArray302 = new int[arg0];
		this.anIntArray299 = new int[arg0];
		this.anIntArray305 = new int[arg0];
		this.anIntArray303 = new int[arg1];
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([Lclient!kc;I)V")
	public Class197(@OriginalArg(0) Class197[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5110 = 0;
		this.anInt5115 = 0;
		this.anInt5130 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte74 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(61) Class197 local61 = arg0[local53];
			if (local61 != null) {
				this.anInt5110 += local61.anInt5110;
				this.anInt5115 += local61.anInt5115;
				this.anInt5130 += local61.anInt5130;
				if (local61.aClass270Array3 != null) {
					local34 += local61.aClass270Array3.length;
				}
				if (local61.aClass129Array1 != null) {
					local36 += local61.aClass129Array1.length;
				}
				local38 |= local61.aByteArray50 != null;
				if (local61.aClass363Array3 != null) {
					local32 += local61.aClass363Array3.length;
				}
				local42 |= local61.aByteArray55 != null;
				local48 |= local61.anIntArray303 != null;
				local44 |= local61.aByteArray53 != null;
				local46 |= local61.aShortArray66 != null;
				if (local61.aByteArray49 == null) {
					if (this.aByte74 == -1) {
						this.aByte74 = local61.aByte74;
					}
					if (local61.aByte74 != this.aByte74) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		this.anIntArray305 = new int[this.anInt5130];
		if (local32 > 0) {
			this.aClass363Array3 = new Class363[local32];
		}
		this.aShortArray72 = new short[this.anInt5130];
		this.aShortArray64 = new short[this.anInt5115];
		this.aShortArray67 = new short[this.anInt5115];
		if (this.anInt5110 > 0) {
			this.anIntArray301 = new int[this.anInt5110];
			this.anIntArray306 = new int[this.anInt5110];
			this.aByteArray52 = new byte[this.anInt5110];
			this.aShortArray69 = new short[this.anInt5110];
			this.anIntArray297 = new int[this.anInt5110];
			this.aShortArray63 = new short[this.anInt5110];
			this.anIntArray300 = new int[this.anInt5110];
			this.aByteArray51 = new byte[this.anInt5110];
			this.anIntArray298 = new int[this.anInt5110];
			this.anIntArray304 = new int[this.anInt5110];
			this.aByteArray54 = new byte[this.anInt5110];
			this.aShortArray65 = new short[this.anInt5110];
		}
		this.anIntArray299 = new int[this.anInt5130];
		if (local40) {
			this.aByteArray49 = new byte[this.anInt5115];
		}
		this.aShortArray71 = new short[this.anInt5115];
		if (local44) {
			this.aByteArray53 = new byte[this.anInt5115];
		}
		if (local38) {
			this.aByteArray50 = new byte[this.anInt5115];
		}
		this.aShortArray68 = new short[this.anInt5115];
		if (local48) {
			this.anIntArray303 = new int[this.anInt5115];
		}
		if (local42) {
			this.aByteArray55 = new byte[this.anInt5115];
		}
		this.aShortArray70 = new short[this.anInt5115];
		this.anIntArray307 = new int[this.anInt5130];
		this.anIntArray302 = new int[this.anInt5130];
		if (local34 > 0) {
			this.aClass270Array3 = new Class270[local34];
		}
		if (local46) {
			this.aShortArray66 = new short[this.anInt5115];
		}
		if (local36 > 0) {
			this.aClass129Array1 = new Class129[local36];
		}
		this.anInt5130 = 0;
		local36 = 0;
		local32 = 0;
		local34 = 0;
		this.anInt5110 = 0;
		this.anInt5115 = 0;
		@Pc(703) int local703;
		@Pc(714) int local714;
		for (@Pc(428) int local428 = 0; local428 < arg1; local428++) {
			@Pc(435) short local435 = (short) (0x1 << local428);
			@Pc(439) Class197 local439 = arg0[local428];
			if (local439 != null) {
				@Pc(448) int local448;
				if (local439.aClass129Array1 != null) {
					for (local448 = 0; local448 < local439.aClass129Array1.length; local448++) {
						@Pc(455) Class129 local455 = local439.aClass129Array1[local448];
						this.aClass129Array1[local36++] = local455.method3132(local455.anInt3394 + this.anInt5115);
					}
				}
				for (local448 = 0; local448 < local439.anInt5115; local448++) {
					if (local38 && local439.aByteArray50 != null) {
						this.aByteArray50[this.anInt5115] = local439.aByteArray50[local448];
					}
					if (local40) {
						if (local439.aByteArray49 == null) {
							this.aByteArray49[this.anInt5115] = local439.aByte74;
						} else {
							this.aByteArray49[this.anInt5115] = local439.aByteArray49[local448];
						}
					}
					if (local42 && local439.aByteArray55 != null) {
						this.aByteArray55[this.anInt5115] = local439.aByteArray55[local448];
					}
					if (local46) {
						if (local439.aShortArray66 == null) {
							this.aShortArray66[this.anInt5115] = -1;
						} else {
							this.aShortArray66[this.anInt5115] = local439.aShortArray66[local448];
						}
					}
					if (local48) {
						if (local439.anIntArray303 == null) {
							this.anIntArray303[this.anInt5115] = -1;
						} else {
							this.anIntArray303[this.anInt5115] = local439.anIntArray303[local448];
						}
					}
					this.aShortArray67[this.anInt5115] = (short) this.method4598(local435, local439.aShortArray67[local448], local439);
					this.aShortArray71[this.anInt5115] = (short) this.method4598(local435, local439.aShortArray71[local448], local439);
					this.aShortArray64[this.anInt5115] = (short) this.method4598(local435, local439.aShortArray64[local448], local439);
					this.aShortArray70[this.anInt5115] = local435;
					this.aShortArray68[this.anInt5115] = local439.aShortArray68[local448];
					this.anInt5115++;
				}
				@Pc(690) int local690;
				if (local439.aClass363Array3 != null) {
					for (local690 = 0; local690 < local439.aClass363Array3.length; local690++) {
						local703 = this.method4598(local435, local439.aClass363Array3[local690].anInt9749, local439);
						local714 = this.method4598(local435, local439.aClass363Array3[local690].anInt9754, local439);
						@Pc(725) int local725 = this.method4598(local435, local439.aClass363Array3[local690].anInt9753, local439);
						this.aClass363Array3[local32] = local439.aClass363Array3[local690].method8301(local725, local714, local703);
						local32++;
					}
				}
				if (local439.aClass270Array3 != null) {
					for (local690 = 0; local690 < local439.aClass270Array3.length; local690++) {
						local703 = this.method4598(local435, local439.aClass270Array3[local690].anInt7122, local439);
						this.aClass270Array3[local34] = local439.aClass270Array3[local690].method6189(local703);
						local34++;
					}
				}
			}
		}
		@Pc(795) int local795 = 0;
		this.anInt5124 = this.anInt5130;
		for (@Pc(801) int local801 = 0; local801 < arg1; local801++) {
			@Pc(810) short local810 = (short) (0x1 << local801);
			@Pc(814) Class197 local814 = arg0[local801];
			if (local814 != null) {
				for (local703 = 0; local703 < local814.anInt5115; local703++) {
					if (local44) {
						this.aByteArray53[local795++] = (byte) (local814.aByteArray53 == null || local814.aByteArray53[local703] == -1 ? -1 : this.anInt5110 + local814.aByteArray53[local703]);
					}
				}
				for (local714 = 0; local714 < local814.anInt5110; local714++) {
					@Pc(876) byte local876 = this.aByteArray54[this.anInt5110] = local814.aByteArray54[local714];
					if (local876 == 0) {
						this.aShortArray63[this.anInt5110] = (short) this.method4598(local810, local814.aShortArray63[local714], local814);
						this.aShortArray65[this.anInt5110] = (short) this.method4598(local810, local814.aShortArray65[local714], local814);
						this.aShortArray69[this.anInt5110] = (short) this.method4598(local810, local814.aShortArray69[local714], local814);
					}
					if (local876 >= 1 && local876 <= 3) {
						this.aShortArray63[this.anInt5110] = local814.aShortArray63[local714];
						this.aShortArray65[this.anInt5110] = local814.aShortArray65[local714];
						this.aShortArray69[this.anInt5110] = local814.aShortArray69[local714];
						this.anIntArray304[this.anInt5110] = local814.anIntArray304[local714];
						this.anIntArray306[this.anInt5110] = local814.anIntArray306[local714];
						this.anIntArray297[this.anInt5110] = local814.anIntArray297[local714];
						this.aByteArray51[this.anInt5110] = local814.aByteArray51[local714];
						this.aByteArray52[this.anInt5110] = local814.aByteArray52[local714];
						this.anIntArray300[this.anInt5110] = local814.anIntArray300[local714];
					}
					if (local876 == 2) {
						this.anIntArray298[this.anInt5110] = local814.anIntArray298[local714];
						this.anIntArray301[this.anInt5110] = local814.anIntArray301[local714];
					}
					this.anInt5110++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([BB)V")
	private void method4593(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class5_Sub36 local10 = new Class5_Sub36(arg0);
		@Pc(15) Class5_Sub36 local15 = new Class5_Sub36(arg0);
		@Pc(20) Class5_Sub36 local20 = new Class5_Sub36(arg0);
		@Pc(25) Class5_Sub36 local25 = new Class5_Sub36(arg0);
		@Pc(30) Class5_Sub36 local30 = new Class5_Sub36(arg0);
		@Pc(35) Class5_Sub36 local35 = new Class5_Sub36(arg0);
		@Pc(40) Class5_Sub36 local40 = new Class5_Sub36(arg0);
		local10.anInt8456 = arg0.length - 23;
		this.anInt5130 = local10.method7333();
		this.anInt5115 = local10.method7333();
		this.anInt5110 = local10.method7291();
		@Pc(65) int local65 = local10.method7291();
		@Pc(75) boolean local75 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(97) boolean local97 = (local65 & 0x4) == 4;
		@Pc(107) boolean local107 = (local65 & 0x8) == 8;
		if (local107) {
			local10.anInt8456 -= 7;
			this.anInt5125 = local10.method7291();
			local10.anInt8456 += 6;
		}
		@Pc(132) int local132 = local10.method7291();
		@Pc(141) int local141 = local10.method7291();
		@Pc(145) int local145 = local10.method7291();
		@Pc(149) int local149 = local10.method7291();
		@Pc(153) int local153 = local10.method7291();
		@Pc(157) int local157 = local10.method7333();
		@Pc(161) int local161 = local10.method7333();
		@Pc(165) int local165 = local10.method7333();
		@Pc(169) int local169 = local10.method7333();
		@Pc(173) int local173 = local10.method7333();
		@Pc(175) int local175 = 0;
		@Pc(177) int local177 = 0;
		@Pc(179) int local179 = 0;
		@Pc(195) int local195;
		if (this.anInt5110 > 0) {
			local10.anInt8456 = 0;
			this.aByteArray54 = new byte[this.anInt5110];
			for (local195 = 0; local195 < this.anInt5110; local195++) {
				@Pc(206) byte local206 = this.aByteArray54[local195] = local10.method7318();
				if (local206 >= 1 && local206 <= 3) {
					local177++;
				}
				if (local206 == 2) {
					local179++;
				}
				if (local206 == 0) {
					local175++;
				}
			}
		}
		local195 = this.anInt5110;
		@Pc(251) int local251 = local195;
		local195 += this.anInt5130;
		@Pc(258) int local258 = local195;
		if (local75) {
			local195 += this.anInt5115;
		}
		@Pc(271) int local271 = local195;
		local195 += this.anInt5115;
		@Pc(278) int local278 = local195;
		if (local132 == 255) {
			local195 += this.anInt5115;
		}
		@Pc(288) int local288 = local195;
		if (local145 == 1) {
			local195 += this.anInt5115;
		}
		@Pc(298) int local298 = local195;
		if (local153 == 1) {
			local195 += this.anInt5130;
		}
		@Pc(310) int local310 = local195;
		if (local141 == 1) {
			local195 += this.anInt5115;
		}
		@Pc(320) int local320 = local195;
		local195 += local169;
		@Pc(326) int local326 = local195;
		if (local149 == 1) {
			local195 += this.anInt5115 * 2;
		}
		@Pc(340) int local340 = local195;
		local195 += local173;
		@Pc(346) int local346 = local195;
		local195 += this.anInt5115 * 2;
		@Pc(355) int local355 = local195;
		local195 += local157;
		@Pc(361) int local361 = local195;
		local195 += local161;
		@Pc(367) int local367 = local195;
		local195 += local165;
		@Pc(373) int local373 = local195;
		local195 += local175 * 6;
		@Pc(381) int local381 = local195;
		local195 += local177 * 6;
		@Pc(389) byte local389 = 6;
		if (this.anInt5125 == 14) {
			local389 = 7;
		} else if (this.anInt5125 >= 15) {
			local389 = 9;
		}
		@Pc(409) int local409 = local195;
		local195 += local389 * local177;
		@Pc(417) int local417 = local195;
		local195 += local177;
		@Pc(423) int local423 = local195;
		local195 += local177;
		@Pc(429) int local429 = local195;
		local195 += local177 + local179 * 2;
		if (local141 == 1) {
			this.aByteArray55 = new byte[this.anInt5115];
		}
		this.anIntArray307 = new int[this.anInt5130];
		local10.anInt8456 = local251;
		if (local149 == 1) {
			this.aShortArray66 = new short[this.anInt5115];
		}
		this.anIntArray302 = new int[this.anInt5130];
		if (local145 == 1) {
			this.anIntArray303 = new int[this.anInt5115];
		}
		if (local75) {
			this.aByteArray50 = new byte[this.anInt5115];
		}
		this.aShortArray71 = new short[this.anInt5115];
		this.aShortArray68 = new short[this.anInt5115];
		if (local153 == 1) {
			this.anIntArray305 = new int[this.anInt5130];
		}
		if (local149 == 1 && this.anInt5110 > 0) {
			this.aByteArray53 = new byte[this.anInt5115];
		}
		this.anIntArray299 = new int[this.anInt5130];
		this.aShortArray64 = new short[this.anInt5115];
		this.aShortArray67 = new short[this.anInt5115];
		if (this.anInt5110 > 0) {
			this.aShortArray63 = new short[this.anInt5110];
			this.aShortArray65 = new short[this.anInt5110];
			this.aShortArray69 = new short[this.anInt5110];
			if (local179 > 0) {
				this.anIntArray301 = new int[local179];
				this.anIntArray298 = new int[local179];
			}
			if (local177 > 0) {
				this.aByteArray52 = new byte[local177];
				this.anIntArray306 = new int[local177];
				this.anIntArray304 = new int[local177];
				this.anIntArray297 = new int[local177];
				this.anIntArray300 = new int[local177];
				this.aByteArray51 = new byte[local177];
			}
		}
		if (local132 == 255) {
			this.aByteArray49 = new byte[this.anInt5115];
		} else {
			this.aByte74 = (byte) local132;
		}
		local15.anInt8456 = local355;
		local20.anInt8456 = local361;
		local25.anInt8456 = local367;
		local30.anInt8456 = local298;
		@Pc(639) int local639 = 0;
		@Pc(641) int local641 = 0;
		@Pc(643) int local643 = 0;
		@Pc(651) int local651;
		for (@Pc(645) int local645 = 0; local645 < this.anInt5130; local645++) {
			local651 = local10.method7291();
			@Pc(653) int local653 = 0;
			if ((local651 & 0x1) != 0) {
				local653 = local15.method7273();
			}
			@Pc(663) int local663 = 0;
			if ((local651 & 0x2) != 0) {
				local663 = local20.method7273();
			}
			@Pc(673) int local673 = 0;
			if ((local651 & 0x4) != 0) {
				local673 = local25.method7273();
			}
			this.anIntArray307[local645] = local653 + local639;
			this.anIntArray299[local645] = local663 + local641;
			this.anIntArray302[local645] = local643 + local673;
			local639 = this.anIntArray307[local645];
			local641 = this.anIntArray299[local645];
			local643 = this.anIntArray302[local645];
			if (local153 == 1) {
				this.anIntArray305[local645] = local30.method7291();
			}
		}
		local10.anInt8456 = local346;
		local15.anInt8456 = local258;
		local20.anInt8456 = local278;
		local25.anInt8456 = local310;
		local30.anInt8456 = local288;
		local35.anInt8456 = local326;
		local40.anInt8456 = local340;
		for (local651 = 0; local651 < this.anInt5115; local651++) {
			this.aShortArray68[local651] = (short) local10.method7333();
			if (local75) {
				this.aByteArray50[local651] = local15.method7318();
			}
			if (local132 == 255) {
				this.aByteArray49[local651] = local20.method7318();
			}
			if (local141 == 1) {
				this.aByteArray55[local651] = local25.method7318();
			}
			if (local145 == 1) {
				this.anIntArray303[local651] = local30.method7291();
			}
			if (local149 == 1) {
				this.aShortArray66[local651] = (short) (local35.method7333() - 1);
			}
			if (this.aByteArray53 != null) {
				if (this.aShortArray66[local651] == -1) {
					this.aByteArray53[local651] = -1;
				} else {
					this.aByteArray53[local651] = (byte) (local40.method7291() - 1);
				}
			}
		}
		local10.anInt8456 = local320;
		this.anInt5124 = -1;
		local15.anInt8456 = local271;
		@Pc(890) short local890 = 0;
		@Pc(892) short local892 = 0;
		@Pc(894) short local894 = 0;
		@Pc(896) short local896 = 0;
		@Pc(906) int local906;
		for (@Pc(898) int local898 = 0; local898 < this.anInt5115; local898++) {
			local906 = local15.method7291();
			if (local906 == 1) {
				local890 = (short) (local896 + local10.method7273());
				local892 = (short) (local890 + local10.method7273());
				local894 = (short) (local892 + local10.method7273());
				this.aShortArray67[local898] = local890;
				local896 = local894;
				this.aShortArray71[local898] = local892;
				this.aShortArray64[local898] = local894;
				if (local890 > this.anInt5124) {
					this.anInt5124 = local890;
				}
				if (local892 > this.anInt5124) {
					this.anInt5124 = local892;
				}
				if (local894 > this.anInt5124) {
					this.anInt5124 = local894;
				}
			}
			if (local906 == 2) {
				local892 = local894;
				local894 = (short) (local896 + local10.method7273());
				local896 = local894;
				this.aShortArray67[local898] = local890;
				this.aShortArray71[local898] = local892;
				this.aShortArray64[local898] = local894;
				if (local894 > this.anInt5124) {
					this.anInt5124 = local894;
				}
			}
			if (local906 == 3) {
				local890 = local894;
				local894 = (short) (local10.method7273() + local896);
				local896 = local894;
				this.aShortArray67[local898] = local890;
				this.aShortArray71[local898] = local892;
				this.aShortArray64[local898] = local894;
				if (this.anInt5124 < local894) {
					this.anInt5124 = local894;
				}
			}
			if (local906 == 4) {
				@Pc(1067) short local1067 = local890;
				local890 = local892;
				local894 = (short) (local10.method7273() + local896);
				local892 = local1067;
				local896 = local894;
				this.aShortArray67[local898] = local890;
				this.aShortArray71[local898] = local1067;
				this.aShortArray64[local898] = local894;
				if (this.anInt5124 < local894) {
					this.anInt5124 = local894;
				}
			}
		}
		this.anInt5124++;
		local10.anInt8456 = local373;
		local15.anInt8456 = local381;
		local20.anInt8456 = local409;
		local25.anInt8456 = local417;
		local30.anInt8456 = local423;
		local35.anInt8456 = local429;
		@Pc(1156) int local1156;
		for (local906 = 0; local906 < this.anInt5110; local906++) {
			local1156 = this.aByteArray54[local906] & 0xFF;
			if (local1156 == 0) {
				this.aShortArray63[local906] = (short) local10.method7333();
				this.aShortArray65[local906] = (short) local10.method7333();
				this.aShortArray69[local906] = (short) local10.method7333();
			}
			if (local1156 == 1) {
				this.aShortArray63[local906] = (short) local15.method7333();
				this.aShortArray65[local906] = (short) local15.method7333();
				this.aShortArray69[local906] = (short) local15.method7333();
				if (this.anInt5125 >= 15) {
					this.anIntArray304[local906] = local20.method7331();
					this.anIntArray306[local906] = local20.method7331();
					this.anIntArray297[local906] = local20.method7331();
				} else {
					this.anIntArray304[local906] = local20.method7333();
					if (this.anInt5125 < 14) {
						this.anIntArray306[local906] = local20.method7333();
					} else {
						this.anIntArray306[local906] = local20.method7331();
					}
					this.anIntArray297[local906] = local20.method7333();
				}
				this.aByteArray51[local906] = local25.method7318();
				this.aByteArray52[local906] = local30.method7318();
				this.anIntArray300[local906] = local35.method7318();
			}
			if (local1156 == 2) {
				this.aShortArray63[local906] = (short) local15.method7333();
				this.aShortArray65[local906] = (short) local15.method7333();
				this.aShortArray69[local906] = (short) local15.method7333();
				if (this.anInt5125 >= 15) {
					this.anIntArray304[local906] = local20.method7331();
					this.anIntArray306[local906] = local20.method7331();
					this.anIntArray297[local906] = local20.method7331();
				} else {
					this.anIntArray304[local906] = local20.method7333();
					if (this.anInt5125 < 14) {
						this.anIntArray306[local906] = local20.method7333();
					} else {
						this.anIntArray306[local906] = local20.method7331();
					}
					this.anIntArray297[local906] = local20.method7333();
				}
				this.aByteArray51[local906] = local25.method7318();
				this.aByteArray52[local906] = local30.method7318();
				this.anIntArray300[local906] = local35.method7318();
				this.anIntArray298[local906] = local35.method7318();
				this.anIntArray301[local906] = local35.method7318();
			}
			if (local1156 == 3) {
				this.aShortArray63[local906] = (short) local15.method7333();
				this.aShortArray65[local906] = (short) local15.method7333();
				this.aShortArray69[local906] = (short) local15.method7333();
				if (this.anInt5125 >= 15) {
					this.anIntArray304[local906] = local20.method7331();
					this.anIntArray306[local906] = local20.method7331();
					this.anIntArray297[local906] = local20.method7331();
				} else {
					this.anIntArray304[local906] = local20.method7333();
					if (this.anInt5125 < 14) {
						this.anIntArray306[local906] = local20.method7333();
					} else {
						this.anIntArray306[local906] = local20.method7331();
					}
					this.anIntArray297[local906] = local20.method7333();
				}
				this.aByteArray51[local906] = local25.method7318();
				this.aByteArray52[local906] = local30.method7318();
				this.anIntArray300[local906] = local35.method7318();
			}
		}
		local10.anInt8456 = local195;
		@Pc(1591) int local1591;
		@Pc(1599) int local1599;
		@Pc(1603) int local1603;
		@Pc(1671) int local1671;
		if (local87) {
			local1156 = local10.method7291();
			if (local1156 > 0) {
				this.aClass363Array3 = new Class363[local1156];
				for (local1591 = 0; local1591 < local1156; local1591++) {
					local1599 = local10.method7333();
					local1603 = local10.method7333();
					@Pc(1609) byte local1609;
					if (local132 == 255) {
						local1609 = this.aByteArray49[local1603];
					} else {
						local1609 = (byte) local132;
					}
					this.aClass363Array3[local1591] = new Class363(local1599, this.aShortArray67[local1603], this.aShortArray71[local1603], this.aShortArray64[local1603], local1609);
				}
			}
			local1591 = local10.method7291();
			if (local1591 > 0) {
				this.aClass270Array3 = new Class270[local1591];
				for (local1599 = 0; local1599 < local1591; local1599++) {
					local1603 = local10.method7333();
					local1671 = local10.method7333();
					this.aClass270Array3[local1599] = new Class270(local1603, local1671);
				}
			}
		}
		if (!local97) {
			return;
		}
		local1156 = local10.method7291();
		if (local1156 <= 0) {
			return;
		}
		this.aClass129Array1 = new Class129[local1156];
		for (local1591 = 0; local1591 < local1156; local1591++) {
			local1599 = local10.method7333();
			local1603 = local10.method7333();
			local1671 = local10.method7291();
			@Pc(1722) byte local1722 = local10.method7318();
			this.aClass129Array1[local1591] = new Class129(local1599, local1603, local1671, local1722);
		}
		return;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IIII)V")
	public void method4594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg1 != 0) {
			local10 = Class42.anIntArray51[arg1];
			local14 = Class42.anIntArray52[arg1];
			for (local16 = 0; local16 < this.anInt5130; local16++) {
				local34 = this.anIntArray307[local16] * local14 + local10 * this.anIntArray299[local16] >> 14;
				this.anIntArray299[local16] = local14 * this.anIntArray299[local16] - local10 * this.anIntArray307[local16] >> 14;
				this.anIntArray307[local16] = local34;
			}
		}
		if (arg2 != 0) {
			local10 = Class42.anIntArray51[arg2];
			local14 = Class42.anIntArray52[arg2];
			for (local16 = 0; local16 < this.anInt5130; local16++) {
				local34 = local14 * this.anIntArray299[local16] - local10 * this.anIntArray302[local16] >> 14;
				this.anIntArray302[local16] = this.anIntArray299[local16] * local10 + local14 * this.anIntArray302[local16] >> 14;
				this.anIntArray299[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class42.anIntArray51[arg0];
		local14 = Class42.anIntArray52[arg0];
		for (local16 = 0; local16 < this.anInt5130; local16++) {
			local34 = this.anIntArray302[local16] * local10 + this.anIntArray307[local16] * local14 >> 14;
			this.anIntArray302[local16] = local14 * this.anIntArray302[local16] - this.anIntArray307[local16] * local10 >> 14;
			this.anIntArray307[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B)V")
	private void method4595(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class5_Sub36 local14 = new Class5_Sub36(arg0);
		@Pc(19) Class5_Sub36 local19 = new Class5_Sub36(arg0);
		@Pc(24) Class5_Sub36 local24 = new Class5_Sub36(arg0);
		@Pc(29) Class5_Sub36 local29 = new Class5_Sub36(arg0);
		@Pc(34) Class5_Sub36 local34 = new Class5_Sub36(arg0);
		local14.anInt8456 = arg0.length - 18;
		this.anInt5130 = local14.method7333();
		this.anInt5115 = local14.method7333();
		this.anInt5110 = local14.method7291();
		@Pc(59) int local59 = local14.method7291();
		@Pc(63) int local63 = local14.method7291();
		@Pc(67) int local67 = local14.method7291();
		@Pc(71) int local71 = local14.method7291();
		@Pc(75) int local75 = local14.method7291();
		@Pc(79) int local79 = local14.method7333();
		@Pc(83) int local83 = local14.method7333();
		@Pc(87) int local87 = local14.method7333();
		@Pc(91) int local91 = local14.method7333();
		@Pc(100) int local100 = this.anInt5130;
		@Pc(102) int local102 = local100;
		local100 += this.anInt5115;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt5115;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt5115;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt5115;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt5130;
		}
		@Pc(155) int local155 = local100;
		if (local67 == 1) {
			local100 += this.anInt5115;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt5115 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt5110 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		this.anIntArray307 = new int[this.anInt5130];
		this.anIntArray299 = new int[this.anInt5130];
		if (local75 == 1) {
			this.anIntArray305 = new int[this.anInt5130];
		}
		this.aShortArray67 = new short[this.anInt5115];
		this.aShortArray64 = new short[this.anInt5115];
		this.aShortArray71 = new short[this.anInt5115];
		if (local67 == 1) {
			this.aByteArray55 = new byte[this.anInt5115];
		}
		if (local63 == 255) {
			this.aByteArray49 = new byte[this.anInt5115];
		} else {
			this.aByte74 = (byte) local63;
		}
		if (this.anInt5110 > 0) {
			this.aShortArray69 = new short[this.anInt5110];
			this.aShortArray63 = new short[this.anInt5110];
			this.aShortArray65 = new short[this.anInt5110];
			this.aByteArray54 = new byte[this.anInt5110];
		}
		if (local71 == 1) {
			this.anIntArray303 = new int[this.anInt5115];
		}
		local14.anInt8456 = 0;
		this.anIntArray302 = new int[this.anInt5130];
		if (local59 == 1) {
			this.aByteArray50 = new byte[this.anInt5115];
			this.aByteArray53 = new byte[this.anInt5115];
			this.aShortArray66 = new short[this.anInt5115];
		}
		this.aShortArray68 = new short[this.anInt5115];
		local19.anInt8456 = local189;
		local24.anInt8456 = local195;
		local29.anInt8456 = local100;
		local34.anInt8456 = local143;
		@Pc(353) int local353 = 0;
		@Pc(355) int local355 = 0;
		@Pc(357) int local357 = 0;
		@Pc(365) int local365;
		@Pc(367) int local367;
		for (@Pc(359) int local359 = 0; local359 < this.anInt5130; local359++) {
			local365 = local14.method7291();
			local367 = 0;
			if ((local365 & 0x1) != 0) {
				local367 = local19.method7273();
			}
			@Pc(377) int local377 = 0;
			if ((local365 & 0x2) != 0) {
				local377 = local24.method7273();
			}
			@Pc(390) int local390 = 0;
			if ((local365 & 0x4) != 0) {
				local390 = local29.method7273();
			}
			this.anIntArray307[local359] = local367 + local353;
			this.anIntArray299[local359] = local355 + local377;
			this.anIntArray302[local359] = local357 + local390;
			local357 = this.anIntArray302[local359];
			local353 = this.anIntArray307[local359];
			local355 = this.anIntArray299[local359];
			if (local75 == 1) {
				this.anIntArray305[local359] = local34.method7291();
			}
		}
		local14.anInt8456 = local171;
		local19.anInt8456 = local131;
		local24.anInt8456 = local109;
		local29.anInt8456 = local155;
		local34.anInt8456 = local119;
		for (local365 = 0; local365 < this.anInt5115; local365++) {
			this.aShortArray68[local365] = (short) local14.method7333();
			if (local59 == 1) {
				local367 = local19.method7291();
				if ((local367 & 0x1) == 1) {
					local7 = true;
					this.aByteArray50[local365] = 1;
				} else {
					this.aByteArray50[local365] = 0;
				}
				if ((local367 & 0x2) == 2) {
					this.aByteArray53[local365] = (byte) (local367 >> 2);
					this.aShortArray66[local365] = this.aShortArray68[local365];
					this.aShortArray68[local365] = 127;
					if (this.aShortArray66[local365] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray53[local365] = -1;
					this.aShortArray66[local365] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray49[local365] = local24.method7318();
			}
			if (local67 == 1) {
				this.aByteArray55[local365] = local29.method7318();
			}
			if (local71 == 1) {
				this.anIntArray303[local365] = local34.method7291();
			}
		}
		local14.anInt8456 = local165;
		this.anInt5124 = -1;
		local19.anInt8456 = local102;
		@Pc(628) short local628 = 0;
		@Pc(630) short local630 = 0;
		@Pc(632) short local632 = 0;
		@Pc(634) short local634 = 0;
		@Pc(644) int local644;
		for (@Pc(636) int local636 = 0; local636 < this.anInt5115; local636++) {
			local644 = local19.method7291();
			if (local644 == 1) {
				local628 = (short) (local634 + local14.method7273());
				local630 = (short) (local14.method7273() + local628);
				local632 = (short) (local630 + local14.method7273());
				this.aShortArray67[local636] = local628;
				local634 = local632;
				this.aShortArray71[local636] = local630;
				this.aShortArray64[local636] = local632;
				if (local628 > this.anInt5124) {
					this.anInt5124 = local628;
				}
				if (local630 > this.anInt5124) {
					this.anInt5124 = local630;
				}
				if (local632 > this.anInt5124) {
					this.anInt5124 = local632;
				}
			}
			if (local644 == 2) {
				local630 = local632;
				local632 = (short) (local14.method7273() + local634);
				this.aShortArray67[local636] = local628;
				local634 = local632;
				this.aShortArray71[local636] = local630;
				this.aShortArray64[local636] = local632;
				if (local632 > this.anInt5124) {
					this.anInt5124 = local632;
				}
			}
			if (local644 == 3) {
				local628 = local632;
				local632 = (short) (local14.method7273() + local634);
				local634 = local632;
				this.aShortArray67[local636] = local628;
				this.aShortArray71[local636] = local630;
				this.aShortArray64[local636] = local632;
				if (this.anInt5124 < local632) {
					this.anInt5124 = local632;
				}
			}
			if (local644 == 4) {
				@Pc(813) short local813 = local628;
				local628 = local630;
				local630 = local813;
				local632 = (short) (local14.method7273() + local634);
				local634 = local632;
				this.aShortArray67[local636] = local628;
				this.aShortArray71[local636] = local813;
				this.aShortArray64[local636] = local632;
				if (local632 > this.anInt5124) {
					this.anInt5124 = local632;
				}
			}
		}
		local14.anInt8456 = local180;
		this.anInt5124++;
		for (local644 = 0; local644 < this.anInt5110; local644++) {
			this.aByteArray54[local644] = 0;
			this.aShortArray63[local644] = (short) local14.method7333();
			this.aShortArray65[local644] = (short) local14.method7333();
			this.aShortArray69[local644] = (short) local14.method7333();
		}
		if (this.aByteArray53 != null) {
			@Pc(919) boolean local919 = false;
			for (@Pc(921) int local921 = 0; local921 < this.anInt5115; local921++) {
				@Pc(932) int local932 = this.aByteArray53[local921] & 0xFF;
				if (local932 != 255) {
					if ((this.aShortArray63[local932] & 0xFFFF) == this.aShortArray67[local921] && this.aShortArray71[local921] == (this.aShortArray65[local932] & 0xFFFF) && (this.aShortArray69[local932] & 0xFFFF) == this.aShortArray64[local921]) {
						this.aByteArray53[local921] = -1;
					} else {
						local919 = true;
					}
				}
			}
			if (!local919) {
				this.aByteArray53 = null;
			}
		}
		if (!local9) {
			this.aShortArray66 = null;
		}
		if (!local7) {
			this.aByteArray50 = null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZSS)V")
	public void method4596(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray66 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt5115; local20++) {
			if (arg0 == this.aShortArray66[local20]) {
				this.aShortArray66[local20] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(SSZ)V")
	public void method4597(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5115; local3++) {
			if (arg0 == this.aShortArray68[local3]) {
				this.aShortArray68[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BSILclient!kc;)I")
	private int method4598(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class197 arg2) {
		@Pc(16) int local16 = arg2.anIntArray307[arg1];
		@Pc(21) int local21 = arg2.anIntArray299[arg1];
		@Pc(26) int local26 = arg2.anIntArray302[arg1];
		for (@Pc(28) int local28 = 0; local28 < this.anInt5130; local28++) {
			if (local16 == this.anIntArray307[local28] && this.anIntArray299[local28] == local21 && local26 == this.anIntArray302[local28]) {
				this.aShortArray72[local28] |= arg0;
				return local28;
			}
		}
		this.anIntArray307[this.anInt5130] = local16;
		this.anIntArray299[this.anInt5130] = local21;
		this.anIntArray302[this.anInt5130] = local26;
		this.aShortArray72[this.anInt5130] = arg0;
		this.anIntArray305[this.anInt5130] = arg2.anIntArray305 == null ? -1 : arg2.anIntArray305[arg1];
		return this.anInt5130++;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(IIII)I")
	public int method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5130; local7++) {
			if (this.anIntArray307[local7] == arg2 && this.anIntArray299[local7] == arg0 && this.anIntArray302[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray307[this.anInt5130] = arg2;
		this.anIntArray299[this.anInt5130] = arg0;
		this.anIntArray302[this.anInt5130] = arg1;
		this.anInt5124 = this.anInt5130 + 1;
		return this.anInt5130++;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	public void method4600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5130; local3++) {
			this.anIntArray307[local3] += arg1;
			this.anIntArray299[local3] += arg0;
			this.anIntArray302[local3] += arg2;
		}
		if (-1449 != -1449) {
			this.method4606(true, -38);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(SSISSSBBSB)B")
	public byte method4602() {
		if (this.anInt5110 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray54[this.anInt5110] = 3;
		this.aShortArray63[this.anInt5110] = 0;
		this.aShortArray65[this.anInt5110] = 32767;
		this.aShortArray69[this.anInt5110] = 0;
		this.anIntArray304[this.anInt5110] = 1024;
		this.anIntArray306[this.anInt5110] = 1024;
		this.anIntArray297[this.anInt5110] = 1024;
		this.aByteArray51[this.anInt5110] = 0;
		this.aByteArray52[this.anInt5110] = 0;
		this.anIntArray300[this.anInt5110] = 0;
		return (byte) this.anInt5110++;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)[[I")
	public int[][] method4603() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass129Array1.length; local12++) {
			@Pc(22) int local22 = this.aClass129Array1[local12].anInt3386;
			if (local22 >= 0) {
				@Pc(28) int local28 = local8[local22]++;
				if (local22 > local10) {
					local10 = local22;
				}
			}
		}
		if (false) {
			this.anInt5130 = 70;
		}
		@Pc(65) int[][] local65 = new int[local10 + 1][];
		for (@Pc(67) int local67 = 0; local67 <= local10; local67++) {
			local65[local67] = new int[local8[local67]];
			local8[local67] = 0;
		}
		for (@Pc(92) int local92 = 0; local92 < this.aClass129Array1.length; local92++) {
			@Pc(102) int local102 = this.aClass129Array1[local92].anInt3386;
			if (local102 >= 0) {
				local65[local102][local8[local102]++] = local92;
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	public void method4604() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5130; local3++) {
			this.anIntArray307[local3] <<= 0x2;
			this.anIntArray299[local3] <<= 0x2;
			this.anIntArray302[local3] <<= 0x2;
		}
		if (false) {
			this.anInt5110 = 45;
		}
		if (this.anInt5110 <= 0 || this.anIntArray304 == null) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < this.anIntArray304.length; local66++) {
			this.anIntArray304[local66] <<= 0x2;
			this.anIntArray306[local66] <<= 0x2;
			if (this.aByteArray54[local66] != 1) {
				this.anIntArray297[local66] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)[[I")
	public int[][] method4606(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = arg1;
		@Pc(19) int local19 = arg0 ? this.anInt5130 : this.anInt5124;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(30) int local30 = this.anIntArray305[local21];
			if (local30 >= 0) {
				@Pc(39) int local39 = local8[local30]++;
				if (local30 > local10) {
					local10 = local30;
				}
			}
		}
		@Pc(62) int[][] local62 = new int[local10 + 1][];
		for (@Pc(66) int local66 = 0; local66 <= local10; local66++) {
			local62[local66] = new int[local8[local66]];
			local8[local66] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < local19; local87++) {
			@Pc(96) int local96 = this.anIntArray305[local87];
			if (local96 >= 0) {
				local62[local96][local8[local96]++] = local87;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIBBISISI)I")
	public int method4608(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) short arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) int arg7) {
		this.aShortArray67[this.anInt5115] = (short) arg1;
		this.aShortArray71[this.anInt5115] = (short) arg5;
		this.aShortArray64[this.anInt5115] = (short) arg7;
		this.aByteArray50[this.anInt5115] = arg3;
		this.aByteArray53[this.anInt5115] = arg0;
		this.aShortArray68[this.anInt5115] = arg6;
		this.aByteArray55[this.anInt5115] = arg2;
		this.aShortArray66[this.anInt5115] = arg4;
		return this.anInt5115++;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)[[I")
	public int[][] method4610() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5115; local12++) {
			@Pc(21) int local21 = this.anIntArray303[local12];
			if (local21 >= 0) {
				if (local21 > local10) {
					local10 = local21;
				}
				@Pc(38) int local38 = local8[local21]++;
			}
		}
		@Pc(51) int[][] local51 = new int[local10 + 1][];
		for (@Pc(63) int local63 = 0; local63 <= local10; local63++) {
			local51[local63] = new int[local8[local63]];
			local8[local63] = 0;
		}
		for (@Pc(88) int local88 = 0; local88 < this.anInt5115; local88++) {
			@Pc(97) int local97 = this.anIntArray303[local88];
			if (local97 >= 0) {
				local51[local97][local8[local97]++] = local88;
			}
		}
		return local51;
	}
}
