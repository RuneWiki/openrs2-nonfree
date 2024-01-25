import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class220 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "[Lclient!et;")
	public Class85[] aClass85Array5;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "[I")
	public int[] anIntArray450;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "[I")
	public int[] anIntArray451;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "[I")
	public int[] anIntArray452;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "[I")
	public int[] anIntArray453;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!nj", name = "C", descriptor = "[I")
	public int[] anIntArray454;

	@OriginalMember(owner = "client!nj", name = "D", descriptor = "[I")
	public int[] anIntArray455;

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!nj", name = "H", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!nj", name = "J", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!nj", name = "L", descriptor = "[Lclient!qd;")
	public Class265[] aClass265Array1;

	@OriginalMember(owner = "client!nj", name = "M", descriptor = "[I")
	public int[] anIntArray456;

	@OriginalMember(owner = "client!nj", name = "N", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!nj", name = "P", descriptor = "[I")
	public int[] anIntArray457;

	@OriginalMember(owner = "client!nj", name = "Q", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!nj", name = "R", descriptor = "[I")
	public int[] anIntArray458;

	@OriginalMember(owner = "client!nj", name = "S", descriptor = "[Lclient!fd;")
	public Class90[] aClass90Array5;

	@OriginalMember(owner = "client!nj", name = "W", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!nj", name = "X", descriptor = "[I")
	public int[] anIntArray459;

	@OriginalMember(owner = "client!nj", name = "Z", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!nj", name = "ab", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	public int anInt6186 = 0;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
	public int anInt6188 = 0;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	public int anInt6183 = 0;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "B")
	public byte aByte54 = 0;

	@OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
	public int anInt6195 = 0;

	@OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
	public int anInt6196 = 12;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V")
	public Class220(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5292(arg0);
		} else {
			this.method5298(arg0);
		}
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(III)V")
	public Class220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray457 = new int[arg1];
		this.aShortArray72 = new short[arg1];
		this.aByteArray75 = new byte[arg1];
		this.anIntArray455 = new int[arg0];
		this.aShortArray71 = new short[arg1];
		this.aByteArray70 = new byte[arg1];
		this.aByteArray76 = new byte[arg1];
		this.anIntArray456 = new int[arg0];
		this.anIntArray454 = new int[arg0];
		if (arg2 > 0) {
			this.aShortArray76 = new short[arg2];
			this.anIntArray459 = new int[arg2];
			this.aByteArray73 = new byte[arg2];
			this.aShortArray73 = new short[arg2];
			this.anIntArray451 = new int[arg2];
			this.anIntArray449 = new int[arg2];
			this.anIntArray450 = new int[arg2];
			this.anIntArray453 = new int[arg2];
			this.aByteArray71 = new byte[arg2];
			this.aByteArray72 = new byte[arg2];
			this.anIntArray458 = new int[arg2];
			this.aShortArray69 = new short[arg2];
		}
		this.anIntArray452 = new int[arg0];
		this.aByteArray74 = new byte[arg1];
		this.aShortArray75 = new short[arg1];
		this.aShortArray68 = new short[arg1];
		this.aShortArray77 = new short[arg1];
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([Lclient!nj;I)V")
	public Class220(@OriginalArg(0) Class220[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6188 = 0;
		this.anInt6195 = 0;
		this.anInt6183 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte54 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class220 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt6195 += local59.anInt6195;
				this.anInt6183 += local59.anInt6183;
				this.anInt6188 += local59.anInt6188;
				if (local59.aClass85Array5 != null) {
					local32 += local59.aClass85Array5.length;
				}
				local38 |= local59.aByteArray75 != null;
				if (local59.aClass265Array1 != null) {
					local36 += local59.aClass265Array1.length;
				}
				if (local59.aClass90Array5 != null) {
					local34 += local59.aClass90Array5.length;
				}
				local46 |= local59.aShortArray72 != null;
				local42 |= local59.aByteArray76 != null;
				local51 |= local59.anIntArray457 != null;
				local44 |= local59.aByteArray74 != null;
				if (local59.aByteArray70 == null) {
					if (this.aByte54 == -1) {
						this.aByte54 = local59.aByte54;
					}
					if (this.aByte54 != local59.aByte54) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		if (local44) {
			this.aByteArray74 = new byte[this.anInt6188];
		}
		if (local40) {
			this.aByteArray70 = new byte[this.anInt6188];
		}
		this.aShortArray68 = new short[this.anInt6188];
		if (local32 > 0) {
			this.aClass85Array5 = new Class85[local32];
		}
		this.aShortArray77 = new short[this.anInt6188];
		this.aShortArray74 = new short[this.anInt6188];
		if (local36 > 0) {
			this.aClass265Array1 = new Class265[local36];
		}
		this.aShortArray70 = new short[this.anInt6195];
		if (local38) {
			this.aByteArray75 = new byte[this.anInt6188];
		}
		if (local46) {
			this.aShortArray72 = new short[this.anInt6188];
		}
		if (local51) {
			this.anIntArray457 = new int[this.anInt6188];
		}
		if (local42) {
			this.aByteArray76 = new byte[this.anInt6188];
		}
		this.anIntArray456 = new int[this.anInt6195];
		this.anIntArray455 = new int[this.anInt6195];
		this.aShortArray75 = new short[this.anInt6188];
		this.aShortArray71 = new short[this.anInt6188];
		if (local34 > 0) {
			this.aClass90Array5 = new Class90[local34];
		}
		this.anIntArray452 = new int[this.anInt6195];
		this.anIntArray454 = new int[this.anInt6195];
		if (this.anInt6183 > 0) {
			this.anIntArray451 = new int[this.anInt6183];
			this.anIntArray449 = new int[this.anInt6183];
			this.aShortArray73 = new short[this.anInt6183];
			this.aShortArray76 = new short[this.anInt6183];
			this.anIntArray458 = new int[this.anInt6183];
			this.anIntArray453 = new int[this.anInt6183];
			this.aByteArray73 = new byte[this.anInt6183];
			this.aByteArray72 = new byte[this.anInt6183];
			this.aByteArray71 = new byte[this.anInt6183];
			this.anIntArray450 = new int[this.anInt6183];
			this.anIntArray459 = new int[this.anInt6183];
			this.aShortArray69 = new short[this.anInt6183];
		}
		local32 = 0;
		this.anInt6183 = 0;
		local36 = 0;
		local34 = 0;
		this.anInt6188 = 0;
		this.anInt6195 = 0;
		@Pc(612) int local612;
		@Pc(623) int local623;
		for (@Pc(376) int local376 = 0; local376 < arg1; local376++) {
			@Pc(383) short local383 = (short) (0x1 << local376);
			@Pc(387) Class220 local387 = arg0[local376];
			if (local387 != null) {
				@Pc(394) int local394;
				if (local387.aClass265Array1 != null) {
					for (local394 = 0; local394 < local387.aClass265Array1.length; local394++) {
						@Pc(401) Class265 local401 = local387.aClass265Array1[local394];
						this.aClass265Array1[local36++] = local401.method5978(this.anInt6188 + local401.anInt7251);
					}
				}
				for (local394 = 0; local394 < local387.anInt6188; local394++) {
					if (local38 && local387.aByteArray75 != null) {
						this.aByteArray75[this.anInt6188] = local387.aByteArray75[local394];
					}
					if (local40) {
						if (local387.aByteArray70 == null) {
							this.aByteArray70[this.anInt6188] = local387.aByte54;
						} else {
							this.aByteArray70[this.anInt6188] = local387.aByteArray70[local394];
						}
					}
					if (local42 && local387.aByteArray76 != null) {
						this.aByteArray76[this.anInt6188] = local387.aByteArray76[local394];
					}
					if (local46) {
						if (local387.aShortArray72 == null) {
							this.aShortArray72[this.anInt6188] = -1;
						} else {
							this.aShortArray72[this.anInt6188] = local387.aShortArray72[local394];
						}
					}
					if (local51) {
						if (local387.anIntArray457 == null) {
							this.anIntArray457[this.anInt6188] = -1;
						} else {
							this.anIntArray457[this.anInt6188] = local387.anIntArray457[local394];
						}
					}
					this.aShortArray68[this.anInt6188] = (short) this.method5301(local383, local387, local387.aShortArray68[local394]);
					this.aShortArray75[this.anInt6188] = (short) this.method5301(local383, local387, local387.aShortArray75[local394]);
					this.aShortArray77[this.anInt6188] = (short) this.method5301(local383, local387, local387.aShortArray77[local394]);
					this.aShortArray74[this.anInt6188] = local383;
					this.aShortArray71[this.anInt6188] = local387.aShortArray71[local394];
					this.anInt6188++;
				}
				@Pc(599) int local599;
				if (local387.aClass85Array5 != null) {
					for (local599 = 0; local599 < local387.aClass85Array5.length; local599++) {
						local612 = this.method5301(local383, local387, local387.aClass85Array5[local599].anInt2868);
						local623 = this.method5301(local383, local387, local387.aClass85Array5[local599].anInt2870);
						@Pc(634) int local634 = this.method5301(local383, local387, local387.aClass85Array5[local599].anInt2866);
						this.aClass85Array5[local32] = local387.aClass85Array5[local599].method2521(local612, local623, local634);
						local32++;
					}
				}
				if (local387.aClass90Array5 != null) {
					for (local599 = 0; local599 < local387.aClass90Array5.length; local599++) {
						local612 = this.method5301(local383, local387, local387.aClass90Array5[local599].anInt2975);
						this.aClass90Array5[local34] = local387.aClass90Array5[local599].method2597(local612);
						local34++;
					}
				}
			}
		}
		@Pc(696) int local696 = 0;
		this.anInt6186 = this.anInt6195;
		for (@Pc(702) int local702 = 0; local702 < arg1; local702++) {
			@Pc(709) short local709 = (short) (0x1 << local702);
			@Pc(713) Class220 local713 = arg0[local702];
			if (local713 != null) {
				for (local612 = 0; local612 < local713.anInt6188; local612++) {
					if (local44) {
						this.aByteArray74[local696++] = (byte) (local713.aByteArray74 == null || local713.aByteArray74[local612] == -1 ? -1 : local713.aByteArray74[local612] + this.anInt6183);
					}
				}
				for (local623 = 0; local623 < local713.anInt6183; local623++) {
					@Pc(770) byte local770 = this.aByteArray71[this.anInt6183] = local713.aByteArray71[local623];
					if (local770 == 0) {
						this.aShortArray76[this.anInt6183] = (short) this.method5301(local709, local713, local713.aShortArray76[local623]);
						this.aShortArray73[this.anInt6183] = (short) this.method5301(local709, local713, local713.aShortArray73[local623]);
						this.aShortArray69[this.anInt6183] = (short) this.method5301(local709, local713, local713.aShortArray69[local623]);
					}
					if (local770 >= 1 && local770 <= 3) {
						this.aShortArray76[this.anInt6183] = local713.aShortArray76[local623];
						this.aShortArray73[this.anInt6183] = local713.aShortArray73[local623];
						this.aShortArray69[this.anInt6183] = local713.aShortArray69[local623];
						this.anIntArray449[this.anInt6183] = local713.anIntArray449[local623];
						this.anIntArray458[this.anInt6183] = local713.anIntArray458[local623];
						this.anIntArray459[this.anInt6183] = local713.anIntArray459[local623];
						this.aByteArray73[this.anInt6183] = local713.aByteArray73[local623];
						this.aByteArray72[this.anInt6183] = local713.aByteArray72[local623];
						this.anIntArray451[this.anInt6183] = local713.anIntArray451[local623];
					}
					if (local770 == 2) {
						this.anIntArray450[this.anInt6183] = local713.anIntArray450[local623];
						this.anIntArray453[this.anInt6183] = local713.anIntArray453[local623];
					}
					this.anInt6183++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BI)V")
	private void method5292(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub21 local10 = new Class6_Sub21(arg0);
		@Pc(15) Class6_Sub21 local15 = new Class6_Sub21(arg0);
		@Pc(20) Class6_Sub21 local20 = new Class6_Sub21(arg0);
		@Pc(25) Class6_Sub21 local25 = new Class6_Sub21(arg0);
		@Pc(30) Class6_Sub21 local30 = new Class6_Sub21(arg0);
		@Pc(35) Class6_Sub21 local35 = new Class6_Sub21(arg0);
		@Pc(40) Class6_Sub21 local40 = new Class6_Sub21(arg0);
		local10.anInt7338 = arg0.length - 23;
		this.anInt6195 = local10.method6003();
		this.anInt6188 = local10.method6003();
		this.anInt6183 = local10.method6069();
		@Pc(65) int local65 = local10.method6069();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt7338 -= 7;
			this.anInt6196 = local10.method6069();
			local10.anInt7338 += 6;
		}
		@Pc(128) int local128 = local10.method6069();
		@Pc(132) int local132 = local10.method6069();
		@Pc(136) int local136 = local10.method6069();
		@Pc(140) int local140 = local10.method6069();
		@Pc(144) int local144 = local10.method6069();
		@Pc(148) int local148 = local10.method6003();
		@Pc(152) int local152 = local10.method6003();
		@Pc(156) int local156 = local10.method6003();
		@Pc(162) int local162 = local10.method6003();
		@Pc(166) int local166 = local10.method6003();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(188) int local188;
		if (this.anInt6183 > 0) {
			local10.anInt7338 = 0;
			this.aByteArray71 = new byte[this.anInt6183];
			for (local188 = 0; local188 < this.anInt6183; local188++) {
				@Pc(199) byte local199 = this.aByteArray71[local188] = local10.method6055();
				if (local199 == 2) {
					local172++;
				}
				if (local199 >= 1 && local199 <= 3) {
					local170++;
				}
				if (local199 == 0) {
					local168++;
				}
			}
		}
		local188 = this.anInt6183;
		@Pc(230) int local230 = local188;
		local188 += this.anInt6195;
		@Pc(237) int local237 = local188;
		if (local76) {
			local188 += this.anInt6188;
		}
		@Pc(246) int local246 = local188;
		local188 += this.anInt6188;
		@Pc(253) int local253 = local188;
		if (local128 == 255) {
			local188 += this.anInt6188;
		}
		@Pc(263) int local263 = local188;
		if (local136 == 1) {
			local188 += this.anInt6188;
		}
		@Pc(273) int local273 = local188;
		if (local144 == 1) {
			local188 += this.anInt6195;
		}
		@Pc(285) int local285 = local188;
		if (local132 == 1) {
			local188 += this.anInt6188;
		}
		@Pc(297) int local297 = local188;
		local188 += local162;
		@Pc(303) int local303 = local188;
		if (local140 == 1) {
			local188 += this.anInt6188 * 2;
		}
		@Pc(315) int local315 = local188;
		local188 += local166;
		@Pc(321) int local321 = local188;
		local188 += this.anInt6188 * 2;
		@Pc(330) int local330 = local188;
		local188 += local148;
		@Pc(336) int local336 = local188;
		local188 += local152;
		@Pc(342) int local342 = local188;
		local188 += local156;
		@Pc(348) int local348 = local188;
		local188 += local168 * 6;
		@Pc(356) int local356 = local188;
		local188 += local170 * 6;
		@Pc(364) byte local364 = 6;
		if (this.anInt6196 == 14) {
			local364 = 7;
		} else if (this.anInt6196 >= 15) {
			local364 = 9;
		}
		@Pc(382) int local382 = local188;
		local188 += local170 * local364;
		@Pc(390) int local390 = local188;
		local188 += local170;
		@Pc(396) int local396 = local188;
		local188 += local170;
		@Pc(402) int local402 = local188;
		local188 += local172 * 2 + local170;
		if (this.anInt6183 > 0) {
			this.aShortArray73 = new short[this.anInt6183];
			if (local170 > 0) {
				this.anIntArray451 = new int[local170];
				this.aByteArray72 = new byte[local170];
				this.anIntArray458 = new int[local170];
				this.aByteArray73 = new byte[local170];
				this.anIntArray449 = new int[local170];
				this.anIntArray459 = new int[local170];
			}
			if (local172 > 0) {
				this.anIntArray450 = new int[local172];
				this.anIntArray453 = new int[local172];
			}
			this.aShortArray69 = new short[this.anInt6183];
			this.aShortArray76 = new short[this.anInt6183];
		}
		if (local76) {
			this.aByteArray75 = new byte[this.anInt6188];
		}
		if (local140 == 1) {
			this.aShortArray72 = new short[this.anInt6188];
		}
		this.aShortArray75 = new short[this.anInt6188];
		if (local136 == 1) {
			this.anIntArray457 = new int[this.anInt6188];
		}
		this.aShortArray68 = new short[this.anInt6188];
		this.anIntArray456 = new int[this.anInt6195];
		this.anIntArray455 = new int[this.anInt6195];
		if (local140 == 1 && this.anInt6183 > 0) {
			this.aByteArray74 = new byte[this.anInt6188];
		}
		this.anIntArray454 = new int[this.anInt6195];
		this.aShortArray71 = new short[this.anInt6188];
		if (local132 == 1) {
			this.aByteArray76 = new byte[this.anInt6188];
		}
		if (local128 == 255) {
			this.aByteArray70 = new byte[this.anInt6188];
		} else {
			this.aByte54 = (byte) local128;
		}
		local10.anInt7338 = local230;
		if (local144 == 1) {
			this.anIntArray452 = new int[this.anInt6195];
		}
		this.aShortArray77 = new short[this.anInt6188];
		local15.anInt7338 = local330;
		local20.anInt7338 = local336;
		local25.anInt7338 = local342;
		local30.anInt7338 = local273;
		@Pc(593) int local593 = 0;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(605) int local605;
		for (@Pc(599) int local599 = 0; local599 < this.anInt6195; local599++) {
			local605 = local10.method6069();
			@Pc(607) int local607 = 0;
			if ((local605 & 0x1) != 0) {
				local607 = local15.method6057();
			}
			@Pc(617) int local617 = 0;
			if ((local605 & 0x2) != 0) {
				local617 = local20.method6057();
			}
			@Pc(630) int local630 = 0;
			if ((local605 & 0x4) != 0) {
				local630 = local25.method6057();
			}
			this.anIntArray454[local599] = local593 + local607;
			this.anIntArray456[local599] = local595 + local617;
			this.anIntArray455[local599] = local630 + local597;
			local593 = this.anIntArray454[local599];
			local595 = this.anIntArray456[local599];
			local597 = this.anIntArray455[local599];
			if (local144 == 1) {
				this.anIntArray452[local599] = local30.method6069();
			}
		}
		local10.anInt7338 = local321;
		local15.anInt7338 = local237;
		local20.anInt7338 = local253;
		local25.anInt7338 = local285;
		local30.anInt7338 = local263;
		local35.anInt7338 = local303;
		local40.anInt7338 = local315;
		for (local605 = 0; local605 < this.anInt6188; local605++) {
			this.aShortArray71[local605] = (short) local10.method6003();
			if (local76) {
				this.aByteArray75[local605] = local15.method6055();
			}
			if (local128 == 255) {
				this.aByteArray70[local605] = local20.method6055();
			}
			if (local132 == 1) {
				this.aByteArray76[local605] = local25.method6055();
			}
			if (local136 == 1) {
				this.anIntArray457[local605] = local30.method6069();
			}
			if (local140 == 1) {
				this.aShortArray72[local605] = (short) (local35.method6003() - 1);
			}
			if (this.aByteArray74 != null) {
				if (this.aShortArray72[local605] == -1) {
					this.aByteArray74[local605] = -1;
				} else {
					this.aByteArray74[local605] = (byte) (local40.method6069() - 1);
				}
			}
		}
		this.anInt6186 = -1;
		local10.anInt7338 = local297;
		local15.anInt7338 = local246;
		@Pc(835) short local835 = 0;
		@Pc(837) short local837 = 0;
		@Pc(839) short local839 = 0;
		@Pc(841) short local841 = 0;
		@Pc(849) int local849;
		for (@Pc(843) int local843 = 0; local843 < this.anInt6188; local843++) {
			local849 = local15.method6069();
			if (local849 == 1) {
				local835 = (short) (local10.method6057() + local841);
				local837 = (short) (local835 + local10.method6057());
				local839 = (short) (local837 + local10.method6057());
				local841 = local839;
				this.aShortArray68[local843] = local835;
				this.aShortArray75[local843] = local837;
				this.aShortArray77[local843] = local839;
				if (this.anInt6186 < local835) {
					this.anInt6186 = local835;
				}
				if (this.anInt6186 < local837) {
					this.anInt6186 = local837;
				}
				if (local839 > this.anInt6186) {
					this.anInt6186 = local839;
				}
			}
			if (local849 == 2) {
				local837 = local839;
				local839 = (short) (local841 + local10.method6057());
				local841 = local839;
				this.aShortArray68[local843] = local835;
				this.aShortArray75[local843] = local837;
				this.aShortArray77[local843] = local839;
				if (this.anInt6186 < local839) {
					this.anInt6186 = local839;
				}
			}
			if (local849 == 3) {
				local835 = local839;
				local839 = (short) (local10.method6057() + local841);
				this.aShortArray68[local843] = local835;
				local841 = local839;
				this.aShortArray75[local843] = local837;
				this.aShortArray77[local843] = local839;
				if (local839 > this.anInt6186) {
					this.anInt6186 = local839;
				}
			}
			if (local849 == 4) {
				@Pc(1008) short local1008 = local835;
				local835 = local837;
				local839 = (short) (local10.method6057() + local841);
				local837 = local1008;
				this.aShortArray68[local843] = local835;
				local841 = local839;
				this.aShortArray75[local843] = local1008;
				this.aShortArray77[local843] = local839;
				if (this.anInt6186 < local839) {
					this.anInt6186 = local839;
				}
			}
		}
		this.anInt6186++;
		local10.anInt7338 = local348;
		local15.anInt7338 = local356;
		local20.anInt7338 = local382;
		local25.anInt7338 = local390;
		local30.anInt7338 = local396;
		local35.anInt7338 = local402;
		@Pc(1089) int local1089;
		for (local849 = 0; local849 < this.anInt6183; local849++) {
			local1089 = this.aByteArray71[local849] & 0xFF;
			if (local1089 == 0) {
				this.aShortArray76[local849] = (short) local10.method6003();
				this.aShortArray73[local849] = (short) local10.method6003();
				this.aShortArray69[local849] = (short) local10.method6003();
			}
			if (local1089 == 1) {
				this.aShortArray76[local849] = (short) local15.method6003();
				this.aShortArray73[local849] = (short) local15.method6003();
				this.aShortArray69[local849] = (short) local15.method6003();
				if (this.anInt6196 < 15) {
					this.anIntArray449[local849] = local20.method6003();
					if (this.anInt6196 >= 14) {
						this.anIntArray458[local849] = local20.method6031();
					} else {
						this.anIntArray458[local849] = local20.method6003();
					}
					this.anIntArray459[local849] = local20.method6003();
				} else {
					this.anIntArray449[local849] = local20.method6031();
					this.anIntArray458[local849] = local20.method6031();
					this.anIntArray459[local849] = local20.method6031();
				}
				this.aByteArray73[local849] = local25.method6055();
				this.aByteArray72[local849] = local30.method6055();
				this.anIntArray451[local849] = local35.method6055();
			}
			if (local1089 == 2) {
				this.aShortArray76[local849] = (short) local15.method6003();
				this.aShortArray73[local849] = (short) local15.method6003();
				this.aShortArray69[local849] = (short) local15.method6003();
				if (this.anInt6196 < 15) {
					this.anIntArray449[local849] = local20.method6003();
					if (this.anInt6196 < 14) {
						this.anIntArray458[local849] = local20.method6003();
					} else {
						this.anIntArray458[local849] = local20.method6031();
					}
					this.anIntArray459[local849] = local20.method6003();
				} else {
					this.anIntArray449[local849] = local20.method6031();
					this.anIntArray458[local849] = local20.method6031();
					this.anIntArray459[local849] = local20.method6031();
				}
				this.aByteArray73[local849] = local25.method6055();
				this.aByteArray72[local849] = local30.method6055();
				this.anIntArray451[local849] = local35.method6055();
				this.anIntArray450[local849] = local35.method6055();
				this.anIntArray453[local849] = local35.method6055();
			}
			if (local1089 == 3) {
				this.aShortArray76[local849] = (short) local15.method6003();
				this.aShortArray73[local849] = (short) local15.method6003();
				this.aShortArray69[local849] = (short) local15.method6003();
				if (this.anInt6196 >= 15) {
					this.anIntArray449[local849] = local20.method6031();
					this.anIntArray458[local849] = local20.method6031();
					this.anIntArray459[local849] = local20.method6031();
				} else {
					this.anIntArray449[local849] = local20.method6003();
					if (this.anInt6196 < 14) {
						this.anIntArray458[local849] = local20.method6003();
					} else {
						this.anIntArray458[local849] = local20.method6031();
					}
					this.anIntArray459[local849] = local20.method6003();
				}
				this.aByteArray73[local849] = local25.method6055();
				this.aByteArray72[local849] = local30.method6055();
				this.anIntArray451[local849] = local35.method6055();
			}
		}
		local10.anInt7338 = local188;
		@Pc(1509) int local1509;
		@Pc(1515) int local1515;
		@Pc(1521) int local1521;
		@Pc(1586) int local1586;
		if (local85) {
			local1089 = local10.method6069();
			if (local1089 > 0) {
				this.aClass85Array5 = new Class85[local1089];
				for (local1509 = 0; local1509 < local1089; local1509++) {
					local1515 = local10.method6003();
					local1521 = local10.method6003();
					@Pc(1527) byte local1527;
					if (local128 == 255) {
						local1527 = this.aByteArray70[local1521];
					} else {
						local1527 = (byte) local128;
					}
					this.aClass85Array5[local1509] = new Class85(local1515, this.aShortArray68[local1521], this.aShortArray75[local1521], this.aShortArray77[local1521], local1527);
				}
			}
			local1509 = local10.method6069();
			if (local1509 > 0) {
				this.aClass90Array5 = new Class90[local1509];
				for (local1515 = 0; local1515 < local1509; local1515++) {
					local1521 = local10.method6003();
					local1586 = local10.method6003();
					this.aClass90Array5[local1515] = new Class90(local1521, local1586);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1089 = local10.method6069();
		if (local1089 <= 0) {
			return;
		}
		this.aClass265Array1 = new Class265[local1089];
		for (local1509 = 0; local1509 < local1089; local1509++) {
			local1515 = local10.method6003();
			local1521 = local10.method6003();
			local1586 = local10.method6069();
			@Pc(1639) byte local1639 = local10.method6055();
			this.aClass265Array1[local1509] = new Class265(local1515, local1521, local1586, local1639);
		}
		return;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIB)I")
	public int method5293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6195; local7++) {
			if (arg0 == this.anIntArray454[local7] && this.anIntArray456[local7] == arg1 && this.anIntArray455[local7] == arg2) {
				return local7;
			}
		}
		this.anIntArray454[this.anInt6195] = arg0;
		this.anIntArray456[this.anInt6195] = arg1;
		this.anIntArray455[this.anInt6195] = arg2;
		this.anInt6186 = this.anInt6195 + 1;
		return this.anInt6195++;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public void method5294() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6195; local7++) {
			this.anIntArray454[local7] <<= 0x2;
			this.anIntArray456[local7] <<= 0x2;
			this.anIntArray455[local7] <<= 0x2;
		}
		if (this.anInt6183 <= 0 || this.anIntArray449 == null) {
			return;
		}
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray449.length; local49++) {
			this.anIntArray449[local49] <<= 0x2;
			this.anIntArray458[local49] <<= 0x2;
			if (this.aByteArray71[local49] != 1) {
				this.anIntArray459[local49] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ISS)V")
	public void method5295(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6188; local7++) {
			if (arg0 == this.aShortArray71[local7]) {
				this.aShortArray71[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)[[I")
	public int[][] method5297() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6188; local12++) {
			@Pc(19) int local19 = this.anIntArray457[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(55) int[][] local55 = new int[local10 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local10; local57++) {
			local55[local57] = new int[local8[local57]];
			local8[local57] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt6188; local76++) {
			@Pc(83) int local83 = this.anIntArray457[local76];
			if (local83 >= 0) {
				local55[local83][local8[local83]++] = local76;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BB)V")
	private void method5298(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub21 local14 = new Class6_Sub21(arg0);
		@Pc(19) Class6_Sub21 local19 = new Class6_Sub21(arg0);
		@Pc(24) Class6_Sub21 local24 = new Class6_Sub21(arg0);
		@Pc(29) Class6_Sub21 local29 = new Class6_Sub21(arg0);
		@Pc(34) Class6_Sub21 local34 = new Class6_Sub21(arg0);
		local14.anInt7338 = arg0.length - 18;
		this.anInt6195 = local14.method6003();
		this.anInt6188 = local14.method6003();
		this.anInt6183 = local14.method6069();
		@Pc(59) int local59 = local14.method6069();
		@Pc(63) int local63 = local14.method6069();
		@Pc(67) int local67 = local14.method6069();
		@Pc(71) int local71 = local14.method6069();
		@Pc(75) int local75 = local14.method6069();
		@Pc(79) int local79 = local14.method6003();
		@Pc(83) int local83 = local14.method6003();
		@Pc(87) int local87 = local14.method6003();
		@Pc(91) int local91 = local14.method6003();
		@Pc(100) int local100 = this.anInt6195;
		@Pc(102) int local102 = local100;
		local100 += this.anInt6188;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt6188;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt6188;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt6188;
		}
		@Pc(139) int local139 = local100;
		if (local75 == 1) {
			local100 += this.anInt6195;
		}
		@Pc(151) int local151 = local100;
		if (local67 == 1) {
			local100 += this.anInt6188;
		}
		@Pc(161) int local161 = local100;
		local100 += local91;
		@Pc(167) int local167 = local100;
		local100 += this.anInt6188 * 2;
		@Pc(176) int local176 = local100;
		local100 += this.anInt6183 * 6;
		@Pc(185) int local185 = local100;
		local100 += local79;
		@Pc(191) int local191 = local100;
		local100 += local83;
		this.anIntArray455 = new int[this.anInt6195];
		this.anIntArray456 = new int[this.anInt6195];
		if (local67 == 1) {
			this.aByteArray76 = new byte[this.anInt6188];
		}
		if (local63 == 255) {
			this.aByteArray70 = new byte[this.anInt6188];
		} else {
			this.aByte54 = (byte) local63;
		}
		local14.anInt7338 = 0;
		if (this.anInt6183 > 0) {
			this.aByteArray71 = new byte[this.anInt6183];
			this.aShortArray69 = new short[this.anInt6183];
			this.aShortArray76 = new short[this.anInt6183];
			this.aShortArray73 = new short[this.anInt6183];
		}
		this.aShortArray77 = new short[this.anInt6188];
		this.aShortArray68 = new short[this.anInt6188];
		this.aShortArray75 = new short[this.anInt6188];
		this.aShortArray71 = new short[this.anInt6188];
		if (local59 == 1) {
			this.aShortArray72 = new short[this.anInt6188];
			this.aByteArray75 = new byte[this.anInt6188];
			this.aByteArray74 = new byte[this.anInt6188];
		}
		this.anIntArray454 = new int[this.anInt6195];
		if (local71 == 1) {
			this.anIntArray457 = new int[this.anInt6188];
		}
		if (local75 == 1) {
			this.anIntArray452 = new int[this.anInt6195];
		}
		local19.anInt7338 = local185;
		local24.anInt7338 = local191;
		local29.anInt7338 = local100;
		local34.anInt7338 = local139;
		@Pc(339) int local339 = 0;
		@Pc(341) int local341 = 0;
		@Pc(343) int local343 = 0;
		@Pc(351) int local351;
		@Pc(353) int local353;
		for (@Pc(345) int local345 = 0; local345 < this.anInt6195; local345++) {
			local351 = local14.method6069();
			local353 = 0;
			if ((local351 & 0x1) != 0) {
				local353 = local19.method6057();
			}
			@Pc(363) int local363 = 0;
			if ((local351 & 0x2) != 0) {
				local363 = local24.method6057();
			}
			@Pc(373) int local373 = 0;
			if ((local351 & 0x4) != 0) {
				local373 = local29.method6057();
			}
			this.anIntArray454[local345] = local339 + local353;
			this.anIntArray456[local345] = local341 + local363;
			this.anIntArray455[local345] = local373 + local343;
			local339 = this.anIntArray454[local345];
			local343 = this.anIntArray455[local345];
			local341 = this.anIntArray456[local345];
			if (local75 == 1) {
				this.anIntArray452[local345] = local34.method6069();
			}
		}
		local14.anInt7338 = local167;
		local19.anInt7338 = local129;
		local24.anInt7338 = local109;
		local29.anInt7338 = local151;
		local34.anInt7338 = local119;
		for (local351 = 0; local351 < this.anInt6188; local351++) {
			this.aShortArray71[local351] = (short) local14.method6003();
			if (local59 == 1) {
				local353 = local19.method6069();
				if ((local353 & 0x1) == 1) {
					this.aByteArray75[local351] = 1;
					local7 = true;
				} else {
					this.aByteArray75[local351] = 0;
				}
				if ((local353 & 0x2) == 2) {
					this.aByteArray74[local351] = (byte) (local353 >> 2);
					this.aShortArray72[local351] = this.aShortArray71[local351];
					this.aShortArray71[local351] = 127;
					if (this.aShortArray72[local351] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray74[local351] = -1;
					this.aShortArray72[local351] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray70[local351] = local24.method6055();
			}
			if (local67 == 1) {
				this.aByteArray76[local351] = local29.method6055();
			}
			if (local71 == 1) {
				this.anIntArray457[local351] = local34.method6069();
			}
		}
		this.anInt6186 = -1;
		local14.anInt7338 = local161;
		local19.anInt7338 = local102;
		@Pc(593) short local593 = 0;
		@Pc(595) short local595 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(615) int local615;
		for (@Pc(609) int local609 = 0; local609 < this.anInt6188; local609++) {
			local615 = local19.method6069();
			if (local615 == 1) {
				local593 = (short) (local607 + local14.method6057());
				local595 = (short) (local593 + local14.method6057());
				local605 = (short) (local14.method6057() + local595);
				this.aShortArray68[local609] = local593;
				local607 = local605;
				this.aShortArray75[local609] = local595;
				this.aShortArray77[local609] = local605;
				if (this.anInt6186 < local593) {
					this.anInt6186 = local593;
				}
				if (local595 > this.anInt6186) {
					this.anInt6186 = local595;
				}
				if (this.anInt6186 < local605) {
					this.anInt6186 = local605;
				}
			}
			if (local615 == 2) {
				local595 = local605;
				local605 = (short) (local14.method6057() + local607);
				this.aShortArray68[local609] = local593;
				local607 = local605;
				this.aShortArray75[local609] = local595;
				this.aShortArray77[local609] = local605;
				if (local605 > this.anInt6186) {
					this.anInt6186 = local605;
				}
			}
			if (local615 == 3) {
				local593 = local605;
				local605 = (short) (local607 + local14.method6057());
				local607 = local605;
				this.aShortArray68[local609] = local593;
				this.aShortArray75[local609] = local595;
				this.aShortArray77[local609] = local605;
				if (this.anInt6186 < local605) {
					this.anInt6186 = local605;
				}
			}
			if (local615 == 4) {
				@Pc(776) short local776 = local593;
				local593 = local595;
				local605 = (short) (local607 + local14.method6057());
				local595 = local776;
				local607 = local605;
				this.aShortArray68[local609] = local593;
				this.aShortArray75[local609] = local776;
				this.aShortArray77[local609] = local605;
				if (local605 > this.anInt6186) {
					this.anInt6186 = local605;
				}
			}
		}
		local14.anInt7338 = local176;
		this.anInt6186++;
		for (local615 = 0; local615 < this.anInt6183; local615++) {
			this.aByteArray71[local615] = 0;
			this.aShortArray76[local615] = (short) local14.method6003();
			this.aShortArray73[local615] = (short) local14.method6003();
			this.aShortArray69[local615] = (short) local14.method6003();
		}
		if (this.aByteArray74 != null) {
			@Pc(876) boolean local876 = false;
			for (@Pc(878) int local878 = 0; local878 < this.anInt6188; local878++) {
				@Pc(887) int local887 = this.aByteArray74[local878] & 0xFF;
				if (local887 != 255) {
					if ((this.aShortArray76[local887] & 0xFFFF) == this.aShortArray68[local878] && (this.aShortArray73[local887] & 0xFFFF) == this.aShortArray75[local878] && (this.aShortArray69[local887] & 0xFFFF) == this.aShortArray77[local878]) {
						this.aByteArray74[local878] = -1;
					} else {
						local876 = true;
					}
				}
			}
			if (!local876) {
				this.aByteArray74 = null;
			}
		}
		if (!local7) {
			this.aByteArray75 = null;
		}
		if (!local9) {
			this.aShortArray72 = null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BZ)[[I")
	public int[][] method5299(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg0 ? this.anInt6195 : this.anInt6186;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(33) int local33 = this.anIntArray452[local26];
			if (local33 >= 0) {
				@Pc(42) int local42 = local8[local33]++;
				if (local33 > local16) {
					local16 = local33;
				}
			}
		}
		@Pc(67) int[][] local67 = new int[local16 + 1][];
		for (@Pc(69) int local69 = 0; local69 <= local16; local69++) {
			local67[local69] = new int[local8[local69]];
			local8[local69] = 0;
		}
		for (@Pc(92) int local92 = 0; local92 < local24; local92++) {
			@Pc(99) int local99 = this.anIntArray452[local92];
			if (local99 >= 0) {
				local67[local99][local8[local99]++] = local92;
			}
		}
		return local67;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(SZLclient!nj;I)I")
	private int method5301(@OriginalArg(0) short arg0, @OriginalArg(2) Class220 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray454[arg2];
		@Pc(15) int local15 = arg1.anIntArray456[arg2];
		@Pc(20) int local20 = arg1.anIntArray455[arg2];
		for (@Pc(29) int local29 = 0; local29 < this.anInt6195; local29++) {
			if (this.anIntArray454[local29] == local10 && local15 == this.anIntArray456[local29] && local20 == this.anIntArray455[local29]) {
				this.aShortArray70[local29] |= arg0;
				return local29;
			}
		}
		this.anIntArray454[this.anInt6195] = local10;
		this.anIntArray456[this.anInt6195] = local15;
		this.anIntArray455[this.anInt6195] = local20;
		this.aShortArray70[this.anInt6195] = arg0;
		this.anIntArray452[this.anInt6195] = arg1.anIntArray452 == null ? -1 : arg1.anIntArray452[arg2];
		return this.anInt6195++;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIII)V")
	public void method5302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg0 != 0) {
			local14 = Class6_Sub2_Sub7.anIntArray178[arg0];
			local18 = Class6_Sub2_Sub7.anIntArray177[arg0];
			for (local20 = 0; local20 < this.anInt6195; local20++) {
				local38 = this.anIntArray456[local20] * local14 + this.anIntArray454[local20] * local18 >> 14;
				this.anIntArray456[local20] = local18 * this.anIntArray456[local20] - this.anIntArray454[local20] * local14 >> 14;
				this.anIntArray454[local20] = local38;
			}
		}
		if (arg2 != 0) {
			local14 = Class6_Sub2_Sub7.anIntArray178[arg2];
			local18 = Class6_Sub2_Sub7.anIntArray177[arg2];
			for (local20 = 0; local20 < this.anInt6195; local20++) {
				local38 = local18 * this.anIntArray456[local20] - this.anIntArray455[local20] * local14 >> 14;
				this.anIntArray455[local20] = local18 * this.anIntArray455[local20] + local14 * this.anIntArray456[local20] >> 14;
				this.anIntArray456[local20] = local38;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local14 = Class6_Sub2_Sub7.anIntArray178[arg1];
		local18 = Class6_Sub2_Sub7.anIntArray177[arg1];
		for (local20 = 0; local20 < this.anInt6195; local20++) {
			local38 = local18 * this.anIntArray454[local20] + this.anIntArray455[local20] * local14 >> 14;
			this.anIntArray455[local20] = this.anIntArray455[local20] * local18 - this.anIntArray454[local20] * local14 >> 14;
			this.anIntArray454[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)[[I")
	public int[][] method5303() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass265Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass265Array1[local12].anInt7253;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(38) int local38 = local8[local20]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(89) int local89 = 0; local89 < this.aClass265Array1.length; local89++) {
			@Pc(97) int local97 = this.aClass265Array1[local89].anInt7253;
			if (local97 >= 0) {
				local52[local97][local8[local97]++] = local89;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(SZBSSSBSSB)B")
	public byte method5304() {
		if (this.anInt6183 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray71[this.anInt6183] = 3;
		this.aShortArray76[this.anInt6183] = 0;
		this.aShortArray73[this.anInt6183] = 32767;
		this.aShortArray69[this.anInt6183] = 0;
		this.anIntArray449[this.anInt6183] = 1024;
		this.anIntArray458[this.anInt6183] = 1024;
		this.anIntArray459[this.anInt6183] = 1024;
		this.aByteArray73[this.anInt6183] = 0;
		this.aByteArray72[this.anInt6183] = 0;
		this.anIntArray451[this.anInt6183] = 0;
		return (byte) this.anInt6183++;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(SSB)V")
	public void method5305(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray72 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6188; local17++) {
			if (this.aShortArray72[local17] == arg0) {
				this.aShortArray72[local17] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BBIBISIIS)I")
	public int method5306(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short arg5, @OriginalArg(6) int arg6, @OriginalArg(8) short arg7) {
		this.aShortArray68[this.anInt6188] = (short) arg4;
		this.aShortArray75[this.anInt6188] = (short) arg2;
		this.aShortArray77[this.anInt6188] = (short) arg6;
		this.aByteArray75[this.anInt6188] = arg0;
		this.aByteArray74[this.anInt6188] = arg1;
		this.aShortArray71[this.anInt6188] = arg7;
		this.aByteArray76[this.anInt6188] = arg3;
		this.aShortArray72[this.anInt6188] = arg5;
		return this.anInt6188++;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(IIII)V")
	public void method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6195; local7++) {
			this.anIntArray454[local7] += arg2;
			this.anIntArray456[local7] += arg1;
			this.anIntArray455[local7] += arg0;
		}
	}
}
