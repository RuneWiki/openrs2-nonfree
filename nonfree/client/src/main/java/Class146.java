import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class146 {

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "[Lclient!qc;")
	public Class200[] aClass200Array4;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "[Lclient!pd;")
	public Class189[] aClass189Array4;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "[I")
	public int[] anIntArray347;

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "[I")
	public int[] anIntArray348;

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "[I")
	public int[] anIntArray349;

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "[I")
	public int[] anIntArray350;

	@OriginalMember(owner = "client!kq", name = "z", descriptor = "[I")
	public int[] anIntArray351;

	@OriginalMember(owner = "client!kq", name = "A", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!kq", name = "D", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "[I")
	public int[] anIntArray352;

	@OriginalMember(owner = "client!kq", name = "F", descriptor = "[I")
	public int[] anIntArray353;

	@OriginalMember(owner = "client!kq", name = "H", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "[Lclient!kv;")
	public Class150[] aClass150Array1;

	@OriginalMember(owner = "client!kq", name = "M", descriptor = "[I")
	public int[] anIntArray354;

	@OriginalMember(owner = "client!kq", name = "N", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!kq", name = "O", descriptor = "[I")
	public int[] anIntArray355;

	@OriginalMember(owner = "client!kq", name = "P", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!kq", name = "S", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!kq", name = "V", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!kq", name = "X", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!kq", name = "Z", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
	public int anInt4088 = 0;

	@OriginalMember(owner = "client!kq", name = "R", descriptor = "I")
	public int anInt4095 = 12;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	public int anInt4082 = 0;

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
	public int anInt4086 = 0;

	@OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
	public int anInt4094 = 0;

	@OriginalMember(owner = "client!kq", name = "bb", descriptor = "B")
	public byte aByte67 = 0;

	static {
		new Class209(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "([B)V")
	public Class146(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3322(arg0);
		} else {
			this.method3326(arg0);
		}
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(III)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray80 = new byte[arg1];
		this.anIntArray350 = new int[arg0];
		this.aShortArray62 = new short[arg1];
		this.aByteArray79 = new byte[arg1];
		this.aShortArray61 = new short[arg1];
		this.anIntArray356 = new int[arg0];
		this.aByteArray83 = new byte[arg1];
		this.aShortArray63 = new short[arg1];
		this.anIntArray348 = new int[arg0];
		this.anIntArray346 = new int[arg1];
		this.aShortArray59 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray81 = new byte[arg2];
			this.anIntArray347 = new int[arg2];
			this.aShortArray67 = new short[arg2];
			this.anIntArray352 = new int[arg2];
			this.aByteArray85 = new byte[arg2];
			this.anIntArray353 = new int[arg2];
			this.aShortArray66 = new short[arg2];
			this.anIntArray355 = new int[arg2];
			this.aShortArray64 = new short[arg2];
			this.aByteArray82 = new byte[arg2];
			this.anIntArray354 = new int[arg2];
			this.anIntArray351 = new int[arg2];
		}
		this.aByteArray84 = new byte[arg1];
		this.anIntArray349 = new int[arg0];
		this.aShortArray65 = new short[arg1];
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "([Lclient!kq;I)V")
	public Class146(@OriginalArg(0) Class146[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4094 = 0;
		this.anInt4082 = 0;
		this.anInt4086 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte67 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class146 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt4082 += local59.anInt4082;
				this.anInt4086 += local59.anInt4086;
				this.anInt4094 += local59.anInt4094;
				if (local59.aClass150Array1 != null) {
					local36 += local59.aClass150Array1.length;
				}
				local38 |= local59.aByteArray83 != null;
				if (local59.aClass189Array4 != null) {
					local34 += local59.aClass189Array4.length;
				}
				if (local59.aClass200Array4 != null) {
					local32 += local59.aClass200Array4.length;
				}
				local46 |= local59.aShortArray59 != null;
				local51 |= local59.anIntArray346 != null;
				local44 |= local59.aByteArray79 != null;
				local42 |= local59.aByteArray84 != null;
				if (local59.aByteArray80 == null) {
					if (this.aByte67 == -1) {
						this.aByte67 = local59.aByte67;
					}
					if (this.aByte67 != local59.aByte67) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		this.aShortArray60 = new short[this.anInt4082];
		this.aShortArray61 = new short[this.anInt4094];
		this.aShortArray63 = new short[this.anInt4094];
		this.aShortArray68 = new short[this.anInt4094];
		if (local36 > 0) {
			this.aClass150Array1 = new Class150[local36];
		}
		this.aShortArray62 = new short[this.anInt4094];
		if (local40) {
			this.aByteArray80 = new byte[this.anInt4094];
		}
		if (local44) {
			this.aByteArray79 = new byte[this.anInt4094];
		}
		this.anIntArray350 = new int[this.anInt4082];
		if (this.anInt4086 > 0) {
			this.aByteArray85 = new byte[this.anInt4086];
			this.anIntArray347 = new int[this.anInt4086];
			this.anIntArray354 = new int[this.anInt4086];
			this.aByteArray82 = new byte[this.anInt4086];
			this.anIntArray351 = new int[this.anInt4086];
			this.aShortArray64 = new short[this.anInt4086];
			this.aShortArray67 = new short[this.anInt4086];
			this.aByteArray81 = new byte[this.anInt4086];
			this.anIntArray352 = new int[this.anInt4086];
			this.anIntArray353 = new int[this.anInt4086];
			this.anIntArray355 = new int[this.anInt4086];
			this.aShortArray66 = new short[this.anInt4086];
		}
		if (local38) {
			this.aByteArray83 = new byte[this.anInt4094];
		}
		if (local32 > 0) {
			this.aClass200Array4 = new Class200[local32];
		}
		this.anIntArray356 = new int[this.anInt4082];
		if (local42) {
			this.aByteArray84 = new byte[this.anInt4094];
		}
		if (local51) {
			this.anIntArray346 = new int[this.anInt4094];
		}
		this.anIntArray348 = new int[this.anInt4082];
		this.anIntArray349 = new int[this.anInt4082];
		if (local46) {
			this.aShortArray59 = new short[this.anInt4094];
		}
		if (local34 > 0) {
			this.aClass189Array4 = new Class189[local34];
		}
		this.aShortArray65 = new short[this.anInt4094];
		this.anInt4086 = 0;
		local36 = 0;
		this.anInt4082 = 0;
		local34 = 0;
		local32 = 0;
		this.anInt4094 = 0;
		@Pc(612) int local612;
		@Pc(623) int local623;
		for (@Pc(376) int local376 = 0; local376 < arg1; local376++) {
			@Pc(383) short local383 = (short) (0x1 << local376);
			@Pc(387) Class146 local387 = arg0[local376];
			if (local387 != null) {
				@Pc(394) int local394;
				if (local387.aClass150Array1 != null) {
					for (local394 = 0; local394 < local387.aClass150Array1.length; local394++) {
						@Pc(401) Class150 local401 = local387.aClass150Array1[local394];
						this.aClass150Array1[local36++] = local401.method3378(this.anInt4094 + local401.anInt4157);
					}
				}
				for (local394 = 0; local394 < local387.anInt4094; local394++) {
					if (local38 && local387.aByteArray83 != null) {
						this.aByteArray83[this.anInt4094] = local387.aByteArray83[local394];
					}
					if (local40) {
						if (local387.aByteArray80 == null) {
							this.aByteArray80[this.anInt4094] = local387.aByte67;
						} else {
							this.aByteArray80[this.anInt4094] = local387.aByteArray80[local394];
						}
					}
					if (local42 && local387.aByteArray84 != null) {
						this.aByteArray84[this.anInt4094] = local387.aByteArray84[local394];
					}
					if (local46) {
						if (local387.aShortArray59 == null) {
							this.aShortArray59[this.anInt4094] = -1;
						} else {
							this.aShortArray59[this.anInt4094] = local387.aShortArray59[local394];
						}
					}
					if (local51) {
						if (local387.anIntArray346 == null) {
							this.anIntArray346[this.anInt4094] = -1;
						} else {
							this.anIntArray346[this.anInt4094] = local387.anIntArray346[local394];
						}
					}
					this.aShortArray62[this.anInt4094] = (short) this.method3328(local383, local387, local387.aShortArray62[local394]);
					this.aShortArray61[this.anInt4094] = (short) this.method3328(local383, local387, local387.aShortArray61[local394]);
					this.aShortArray65[this.anInt4094] = (short) this.method3328(local383, local387, local387.aShortArray65[local394]);
					this.aShortArray68[this.anInt4094] = local383;
					this.aShortArray63[this.anInt4094] = local387.aShortArray63[local394];
					this.anInt4094++;
				}
				@Pc(599) int local599;
				if (local387.aClass200Array4 != null) {
					for (local599 = 0; local599 < local387.aClass200Array4.length; local599++) {
						local612 = this.method3328(local383, local387, local387.aClass200Array4[local599].anInt5573);
						local623 = this.method3328(local383, local387, local387.aClass200Array4[local599].anInt5568);
						@Pc(634) int local634 = this.method3328(local383, local387, local387.aClass200Array4[local599].anInt5570);
						this.aClass200Array4[local32] = local387.aClass200Array4[local599].method4490(local612, local634, local623);
						local32++;
					}
				}
				if (local387.aClass189Array4 != null) {
					for (local599 = 0; local599 < local387.aClass189Array4.length; local599++) {
						local612 = this.method3328(local383, local387, local387.aClass189Array4[local599].anInt5345);
						this.aClass189Array4[local34] = local387.aClass189Array4[local599].method4280(local612);
						local34++;
					}
				}
			}
		}
		this.anInt4088 = this.anInt4082;
		@Pc(708) int local708 = 0;
		for (@Pc(710) int local710 = 0; local710 < arg1; local710++) {
			@Pc(717) short local717 = (short) (0x1 << local710);
			@Pc(721) Class146 local721 = arg0[local710];
			if (local721 != null) {
				for (local612 = 0; local612 < local721.anInt4094; local612++) {
					if (local44) {
						this.aByteArray79[local708++] = (byte) (local721.aByteArray79 == null || local721.aByteArray79[local612] == -1 ? -1 : local721.aByteArray79[local612] + this.anInt4086);
					}
				}
				for (local623 = 0; local623 < local721.anInt4086; local623++) {
					@Pc(774) byte local774 = this.aByteArray82[this.anInt4086] = local721.aByteArray82[local623];
					if (local774 == 0) {
						this.aShortArray66[this.anInt4086] = (short) this.method3328(local717, local721, local721.aShortArray66[local623]);
						this.aShortArray64[this.anInt4086] = (short) this.method3328(local717, local721, local721.aShortArray64[local623]);
						this.aShortArray67[this.anInt4086] = (short) this.method3328(local717, local721, local721.aShortArray67[local623]);
					}
					if (local774 >= 1 && local774 <= 3) {
						this.aShortArray66[this.anInt4086] = local721.aShortArray66[local623];
						this.aShortArray64[this.anInt4086] = local721.aShortArray64[local623];
						this.aShortArray67[this.anInt4086] = local721.aShortArray67[local623];
						this.anIntArray353[this.anInt4086] = local721.anIntArray353[local623];
						this.anIntArray351[this.anInt4086] = local721.anIntArray351[local623];
						this.anIntArray347[this.anInt4086] = local721.anIntArray347[local623];
						this.aByteArray81[this.anInt4086] = local721.aByteArray81[local623];
						this.aByteArray85[this.anInt4086] = local721.aByteArray85[local623];
						this.anIntArray354[this.anInt4086] = local721.anIntArray354[local623];
					}
					if (local774 == 2) {
						this.anIntArray352[this.anInt4086] = local721.anIntArray352[local623];
						this.anIntArray355[this.anInt4086] = local721.anIntArray355[local623];
					}
					this.anInt4086++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ISIBISBIB)I")
	public int method3319(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray62[this.anInt4094] = (short) arg6;
		this.aShortArray61[this.anInt4094] = (short) arg3;
		this.aShortArray65[this.anInt4094] = (short) arg0;
		this.aByteArray83[this.anInt4094] = arg5;
		this.aByteArray79[this.anInt4094] = arg7;
		this.aShortArray63[this.anInt4094] = arg1;
		this.aByteArray84[this.anInt4094] = arg2;
		this.aShortArray59[this.anInt4094] = arg4;
		return this.anInt4094++;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)I")
	public int method3320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4082; local7++) {
			if (this.anIntArray350[local7] == arg0 && this.anIntArray349[local7] == arg2 && this.anIntArray356[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray350[this.anInt4082] = arg0;
		this.anIntArray349[this.anInt4082] = arg2;
		this.anIntArray356[this.anInt4082] = arg1;
		this.anInt4088 = this.anInt4082 + 1;
		return this.anInt4082++;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(SIS)V")
	public void method3321(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4094; local11++) {
			if (this.aShortArray63[local11] == arg1) {
				this.aShortArray63[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B[B)V")
	private void method3322(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub23 local10 = new Class2_Sub23(arg0);
		@Pc(15) Class2_Sub23 local15 = new Class2_Sub23(arg0);
		@Pc(20) Class2_Sub23 local20 = new Class2_Sub23(arg0);
		@Pc(25) Class2_Sub23 local25 = new Class2_Sub23(arg0);
		@Pc(30) Class2_Sub23 local30 = new Class2_Sub23(arg0);
		@Pc(35) Class2_Sub23 local35 = new Class2_Sub23(arg0);
		@Pc(40) Class2_Sub23 local40 = new Class2_Sub23(arg0);
		local10.anInt6952 = arg0.length - 23;
		this.anInt4082 = local10.method5500();
		this.anInt4094 = local10.method5500();
		this.anInt4086 = local10.method5495();
		@Pc(65) int local65 = local10.method5495();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt6952 -= 7;
			this.anInt4095 = local10.method5495();
			local10.anInt6952 += 6;
		}
		@Pc(128) int local128 = local10.method5495();
		@Pc(132) int local132 = local10.method5495();
		@Pc(136) int local136 = local10.method5495();
		@Pc(140) int local140 = local10.method5495();
		@Pc(146) int local146 = local10.method5495();
		@Pc(150) int local150 = local10.method5500();
		@Pc(154) int local154 = local10.method5500();
		@Pc(158) int local158 = local10.method5500();
		@Pc(162) int local162 = local10.method5500();
		@Pc(166) int local166 = local10.method5500();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(185) int local185;
		if (this.anInt4086 > 0) {
			this.aByteArray82 = new byte[this.anInt4086];
			local10.anInt6952 = 0;
			for (local185 = 0; local185 < this.anInt4086; local185++) {
				@Pc(196) byte local196 = this.aByteArray82[local185] = local10.method5484();
				if (local196 == 0) {
					local168++;
				}
				if (local196 >= 1 && local196 <= 3) {
					local170++;
				}
				if (local196 == 2) {
					local172++;
				}
			}
		}
		local185 = this.anInt4086;
		@Pc(224) int local224 = local185;
		local185 += this.anInt4082;
		@Pc(231) int local231 = local185;
		if (local74) {
			local185 += this.anInt4094;
		}
		@Pc(240) int local240 = local185;
		local185 += this.anInt4094;
		@Pc(247) int local247 = local185;
		if (local128 == 255) {
			local185 += this.anInt4094;
		}
		@Pc(257) int local257 = local185;
		if (local136 == 1) {
			local185 += this.anInt4094;
		}
		@Pc(267) int local267 = local185;
		if (local146 == 1) {
			local185 += this.anInt4082;
		}
		@Pc(277) int local277 = local185;
		if (local132 == 1) {
			local185 += this.anInt4094;
		}
		@Pc(287) int local287 = local185;
		local185 += local162;
		@Pc(293) int local293 = local185;
		if (local140 == 1) {
			local185 += this.anInt4094 * 2;
		}
		@Pc(307) int local307 = local185;
		local185 += local166;
		@Pc(313) int local313 = local185;
		local185 += this.anInt4094 * 2;
		@Pc(322) int local322 = local185;
		local185 += local150;
		@Pc(328) int local328 = local185;
		local185 += local154;
		@Pc(334) int local334 = local185;
		local185 += local158;
		@Pc(340) int local340 = local185;
		local185 += local168 * 6;
		@Pc(348) int local348 = local185;
		local185 += local170 * 6;
		@Pc(364) int local364 = this.anInt4095 >= 14 ? 7 : 6;
		@Pc(366) int local366 = local185;
		local185 += local364 * local170;
		@Pc(374) int local374 = local185;
		local185 += local170;
		@Pc(380) int local380 = local185;
		local185 += local170;
		@Pc(386) int local386 = local185;
		local185 += local172 * 2 + local170;
		this.anIntArray356 = new int[this.anInt4082];
		if (local140 == 1) {
			this.aShortArray59 = new short[this.anInt4094];
		}
		if (local132 == 1) {
			this.aByteArray84 = new byte[this.anInt4094];
		}
		if (local140 == 1 && this.anInt4086 > 0) {
			this.aByteArray79 = new byte[this.anInt4094];
		}
		this.aShortArray65 = new short[this.anInt4094];
		this.aShortArray62 = new short[this.anInt4094];
		this.aShortArray63 = new short[this.anInt4094];
		local10.anInt6952 = local224;
		if (this.anInt4086 > 0) {
			this.aShortArray66 = new short[this.anInt4086];
			this.aShortArray67 = new short[this.anInt4086];
			this.aShortArray64 = new short[this.anInt4086];
			if (local170 > 0) {
				this.anIntArray351 = new int[local170];
				this.anIntArray347 = new int[local170];
				this.aByteArray85 = new byte[local170];
				this.anIntArray354 = new int[local170];
				this.aByteArray81 = new byte[local170];
				this.anIntArray353 = new int[local170];
			}
			if (local172 > 0) {
				this.anIntArray355 = new int[local172];
				this.anIntArray352 = new int[local172];
			}
		}
		this.anIntArray350 = new int[this.anInt4082];
		if (local136 == 1) {
			this.anIntArray346 = new int[this.anInt4094];
		}
		if (local128 == 255) {
			this.aByteArray80 = new byte[this.anInt4094];
		} else {
			this.aByte67 = (byte) local128;
		}
		this.anIntArray349 = new int[this.anInt4082];
		if (local146 == 1) {
			this.anIntArray348 = new int[this.anInt4082];
		}
		if (local74) {
			this.aByteArray83 = new byte[this.anInt4094];
		}
		this.aShortArray61 = new short[this.anInt4094];
		local15.anInt6952 = local322;
		local20.anInt6952 = local328;
		local25.anInt6952 = local334;
		local30.anInt6952 = local267;
		@Pc(580) int local580 = 0;
		@Pc(582) int local582 = 0;
		@Pc(584) int local584 = 0;
		@Pc(592) int local592;
		for (@Pc(586) int local586 = 0; local586 < this.anInt4082; local586++) {
			local592 = local10.method5495();
			@Pc(594) int local594 = 0;
			if ((local592 & 0x1) != 0) {
				local594 = local15.method5501();
			}
			@Pc(607) int local607 = 0;
			if ((local592 & 0x2) != 0) {
				local607 = local20.method5501();
			}
			@Pc(620) int local620 = 0;
			if ((local592 & 0x4) != 0) {
				local620 = local25.method5501();
			}
			this.anIntArray350[local586] = local594 + local580;
			this.anIntArray349[local586] = local582 + local607;
			this.anIntArray356[local586] = local584 + local620;
			local580 = this.anIntArray350[local586];
			local584 = this.anIntArray356[local586];
			local582 = this.anIntArray349[local586];
			if (local146 == 1) {
				this.anIntArray348[local586] = local30.method5495();
			}
		}
		local10.anInt6952 = local313;
		local15.anInt6952 = local231;
		local20.anInt6952 = local247;
		local25.anInt6952 = local277;
		local30.anInt6952 = local257;
		local35.anInt6952 = local293;
		local40.anInt6952 = local307;
		for (local592 = 0; local592 < this.anInt4094; local592++) {
			this.aShortArray63[local592] = (short) local10.method5500();
			if (local74) {
				this.aByteArray83[local592] = local15.method5484();
			}
			if (local128 == 255) {
				this.aByteArray80[local592] = local20.method5484();
			}
			if (local132 == 1) {
				this.aByteArray84[local592] = local25.method5484();
			}
			if (local136 == 1) {
				this.anIntArray346[local592] = local30.method5495();
			}
			if (local140 == 1) {
				this.aShortArray59[local592] = (short) (local35.method5500() - 1);
			}
			if (this.aByteArray79 != null) {
				if (this.aShortArray59[local592] == -1) {
					this.aByteArray79[local592] = -1;
				} else {
					this.aByteArray79[local592] = (byte) (local40.method5495() - 1);
				}
			}
		}
		local10.anInt6952 = local287;
		this.anInt4088 = -1;
		local15.anInt6952 = local240;
		@Pc(826) short local826 = 0;
		@Pc(828) short local828 = 0;
		@Pc(830) short local830 = 0;
		@Pc(832) short local832 = 0;
		@Pc(842) int local842;
		for (@Pc(834) int local834 = 0; local834 < this.anInt4094; local834++) {
			local842 = local15.method5495();
			if (local842 == 1) {
				local826 = (short) (local832 + local10.method5501());
				local828 = (short) (local10.method5501() + local826);
				local830 = (short) (local828 + local10.method5501());
				this.aShortArray62[local834] = local826;
				local832 = local830;
				this.aShortArray61[local834] = local828;
				this.aShortArray65[local834] = local830;
				if (local826 > this.anInt4088) {
					this.anInt4088 = local826;
				}
				if (local828 > this.anInt4088) {
					this.anInt4088 = local828;
				}
				if (this.anInt4088 < local830) {
					this.anInt4088 = local830;
				}
			}
			if (local842 == 2) {
				local828 = local830;
				local830 = (short) (local832 + local10.method5501());
				local832 = local830;
				this.aShortArray62[local834] = local826;
				this.aShortArray61[local834] = local828;
				this.aShortArray65[local834] = local830;
				if (this.anInt4088 < local830) {
					this.anInt4088 = local830;
				}
			}
			if (local842 == 3) {
				local826 = local830;
				local830 = (short) (local832 + local10.method5501());
				local832 = local830;
				this.aShortArray62[local834] = local826;
				this.aShortArray61[local834] = local828;
				this.aShortArray65[local834] = local830;
				if (this.anInt4088 < local830) {
					this.anInt4088 = local830;
				}
			}
			if (local842 == 4) {
				@Pc(999) short local999 = local826;
				local826 = local828;
				local828 = local999;
				local830 = (short) (local10.method5501() + local832);
				this.aShortArray62[local834] = local826;
				local832 = local830;
				this.aShortArray61[local834] = local999;
				this.aShortArray65[local834] = local830;
				if (this.anInt4088 < local830) {
					this.anInt4088 = local830;
				}
			}
		}
		this.anInt4088++;
		local10.anInt6952 = local340;
		local15.anInt6952 = local348;
		local20.anInt6952 = local366;
		local25.anInt6952 = local374;
		local30.anInt6952 = local380;
		local35.anInt6952 = local386;
		@Pc(1074) int local1074;
		for (local842 = 0; local842 < this.anInt4086; local842++) {
			local1074 = this.aByteArray82[local842] & 0xFF;
			if (local1074 == 0) {
				this.aShortArray66[local842] = (short) local10.method5500();
				this.aShortArray64[local842] = (short) local10.method5500();
				this.aShortArray67[local842] = (short) local10.method5500();
			}
			if (local1074 == 1) {
				this.aShortArray66[local842] = (short) local15.method5500();
				this.aShortArray64[local842] = (short) local15.method5500();
				this.aShortArray67[local842] = (short) local15.method5500();
				this.anIntArray353[local842] = local20.method5500();
				if (this.anInt4095 >= 14) {
					this.anIntArray351[local842] = local20.method5485();
				} else {
					this.anIntArray351[local842] = local20.method5500();
				}
				this.anIntArray347[local842] = local20.method5500();
				this.aByteArray81[local842] = local25.method5484();
				this.aByteArray85[local842] = local30.method5484();
				this.anIntArray354[local842] = local35.method5484();
			}
			if (local1074 == 2) {
				this.aShortArray66[local842] = (short) local15.method5500();
				this.aShortArray64[local842] = (short) local15.method5500();
				this.aShortArray67[local842] = (short) local15.method5500();
				this.anIntArray353[local842] = local20.method5500();
				if (this.anInt4095 >= 14) {
					this.anIntArray351[local842] = local20.method5485();
				} else {
					this.anIntArray351[local842] = local20.method5500();
				}
				this.anIntArray347[local842] = local20.method5500();
				this.aByteArray81[local842] = local25.method5484();
				this.aByteArray85[local842] = local30.method5484();
				this.anIntArray354[local842] = local35.method5484();
				this.anIntArray352[local842] = local35.method5484();
				this.anIntArray355[local842] = local35.method5484();
			}
			if (local1074 == 3) {
				this.aShortArray66[local842] = (short) local15.method5500();
				this.aShortArray64[local842] = (short) local15.method5500();
				this.aShortArray67[local842] = (short) local15.method5500();
				this.anIntArray353[local842] = local20.method5500();
				if (this.anInt4095 < 14) {
					this.anIntArray351[local842] = local20.method5500();
				} else {
					this.anIntArray351[local842] = local20.method5485();
				}
				this.anIntArray347[local842] = local20.method5500();
				this.aByteArray81[local842] = local25.method5484();
				this.aByteArray85[local842] = local30.method5484();
				this.anIntArray354[local842] = local35.method5484();
			}
		}
		local10.anInt6952 = local185;
		@Pc(1404) int local1404;
		@Pc(1410) int local1410;
		@Pc(1414) int local1414;
		@Pc(1481) int local1481;
		if (local85) {
			local1074 = local10.method5495();
			if (local1074 > 0) {
				this.aClass200Array4 = new Class200[local1074];
				for (local1404 = 0; local1404 < local1074; local1404++) {
					local1410 = local10.method5500();
					local1414 = local10.method5500();
					@Pc(1422) byte local1422;
					if (local128 == 255) {
						local1422 = this.aByteArray80[local1414];
					} else {
						local1422 = (byte) local128;
					}
					this.aClass200Array4[local1404] = new Class200(local1410, this.aShortArray62[local1414], this.aShortArray61[local1414], this.aShortArray65[local1414], local1422);
				}
			}
			local1404 = local10.method5495();
			if (local1404 > 0) {
				this.aClass189Array4 = new Class189[local1404];
				for (local1410 = 0; local1410 < local1404; local1410++) {
					local1414 = local10.method5500();
					local1481 = local10.method5500();
					this.aClass189Array4[local1410] = new Class189(local1414, local1481);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1074 = local10.method5495();
		if (local1074 <= 0) {
			return;
		}
		this.aClass150Array1 = new Class150[local1074];
		for (local1404 = 0; local1404 < local1074; local1404++) {
			local1410 = local10.method5500();
			local1414 = local10.method5500();
			local1481 = local10.method5495();
			@Pc(1531) byte local1531 = local10.method5484();
			this.aClass150Array1[local1404] = new Class150(local1410, local1414, local1481, local1531);
		}
		return;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)[[I")
	public int[][] method3324() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4094; local12++) {
			@Pc(19) int local19 = this.anIntArray346[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(64) int[][] local64 = new int[local10 + 1][];
		for (@Pc(66) int local66 = 0; local66 <= local10; local66++) {
			local64[local66] = new int[local8[local66]];
			local8[local66] = 0;
		}
		for (@Pc(89) int local89 = 0; local89 < this.anInt4094; local89++) {
			@Pc(96) int local96 = this.anIntArray346[local89];
			if (local96 >= 0) {
				local64[local96][local8[local96]++] = local89;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)V")
	public void method3325() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4082; local11++) {
			this.anIntArray350[local11] <<= 0x0;
			this.anIntArray349[local11] <<= 0x0;
			this.anIntArray356[local11] <<= 0x0;
		}
		if (this.anInt4086 <= 0 || this.anIntArray353 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray353.length; local57++) {
			this.anIntArray353[local57] <<= 0x0;
			this.anIntArray351[local57] <<= 0x0;
			if (this.aByteArray82[local57] != 1) {
				this.anIntArray347[local57] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B[B)V")
	private void method3326(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub23 local14 = new Class2_Sub23(arg0);
		@Pc(19) Class2_Sub23 local19 = new Class2_Sub23(arg0);
		@Pc(24) Class2_Sub23 local24 = new Class2_Sub23(arg0);
		@Pc(29) Class2_Sub23 local29 = new Class2_Sub23(arg0);
		@Pc(34) Class2_Sub23 local34 = new Class2_Sub23(arg0);
		local14.anInt6952 = arg0.length - 18;
		this.anInt4082 = local14.method5500();
		this.anInt4094 = local14.method5500();
		this.anInt4086 = local14.method5495();
		@Pc(59) int local59 = local14.method5495();
		@Pc(63) int local63 = local14.method5495();
		@Pc(67) int local67 = local14.method5495();
		@Pc(71) int local71 = local14.method5495();
		@Pc(75) int local75 = local14.method5495();
		@Pc(79) int local79 = local14.method5500();
		@Pc(83) int local83 = local14.method5500();
		@Pc(87) int local87 = local14.method5500();
		@Pc(91) int local91 = local14.method5500();
		@Pc(100) int local100 = this.anInt4082;
		@Pc(102) int local102 = local100;
		local100 += this.anInt4094;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt4094;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt4094;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt4094;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt4082;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt4094;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt4094 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt4086 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		if (local59 == 1) {
			this.aByteArray83 = new byte[this.anInt4094];
			this.aByteArray79 = new byte[this.anInt4094];
			this.aShortArray59 = new short[this.anInt4094];
		}
		if (local63 == 255) {
			this.aByteArray80 = new byte[this.anInt4094];
		} else {
			this.aByte67 = (byte) local63;
		}
		this.anIntArray349 = new int[this.anInt4082];
		this.aShortArray61 = new short[this.anInt4094];
		if (local67 == 1) {
			this.aByteArray84 = new byte[this.anInt4094];
		}
		local14.anInt6952 = 0;
		if (this.anInt4086 > 0) {
			this.aByteArray82 = new byte[this.anInt4086];
			this.aShortArray66 = new short[this.anInt4086];
			this.aShortArray67 = new short[this.anInt4086];
			this.aShortArray64 = new short[this.anInt4086];
		}
		if (local75 == 1) {
			this.anIntArray348 = new int[this.anInt4082];
		}
		this.aShortArray63 = new short[this.anInt4094];
		this.anIntArray350 = new int[this.anInt4082];
		this.aShortArray65 = new short[this.anInt4094];
		this.anIntArray356 = new int[this.anInt4082];
		this.aShortArray62 = new short[this.anInt4094];
		if (local71 == 1) {
			this.anIntArray346 = new int[this.anInt4094];
		}
		local19.anInt6952 = local187;
		local24.anInt6952 = local193;
		local29.anInt6952 = local100;
		local34.anInt6952 = local143;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(361) int local361;
		@Pc(363) int local363;
		for (@Pc(355) int local355 = 0; local355 < this.anInt4082; local355++) {
			local361 = local14.method5495();
			local363 = 0;
			if ((local361 & 0x1) != 0) {
				local363 = local19.method5501();
			}
			@Pc(376) int local376 = 0;
			if ((local361 & 0x2) != 0) {
				local376 = local24.method5501();
			}
			@Pc(389) int local389 = 0;
			if ((local361 & 0x4) != 0) {
				local389 = local29.method5501();
			}
			this.anIntArray350[local355] = local349 + local363;
			this.anIntArray349[local355] = local376 + local351;
			this.anIntArray356[local355] = local389 + local353;
			local351 = this.anIntArray349[local355];
			local353 = this.anIntArray356[local355];
			local349 = this.anIntArray350[local355];
			if (local75 == 1) {
				this.anIntArray348[local355] = local34.method5495();
			}
		}
		local14.anInt6952 = local169;
		local19.anInt6952 = local133;
		local24.anInt6952 = local109;
		local29.anInt6952 = local153;
		local34.anInt6952 = local121;
		for (local361 = 0; local361 < this.anInt4094; local361++) {
			this.aShortArray63[local361] = (short) local14.method5500();
			if (local59 == 1) {
				local363 = local19.method5495();
				if ((local363 & 0x1) == 1) {
					local7 = true;
					this.aByteArray83[local361] = 1;
				} else {
					this.aByteArray83[local361] = 0;
				}
				if ((local363 & 0x2) == 2) {
					this.aByteArray79[local361] = (byte) (local363 >> 2);
					this.aShortArray59[local361] = this.aShortArray63[local361];
					this.aShortArray63[local361] = 127;
					if (this.aShortArray59[local361] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray79[local361] = -1;
					this.aShortArray59[local361] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray80[local361] = local24.method5484();
			}
			if (local67 == 1) {
				this.aByteArray84[local361] = local29.method5484();
			}
			if (local71 == 1) {
				this.anIntArray346[local361] = local34.method5495();
			}
		}
		this.anInt4088 = -1;
		local14.anInt6952 = local163;
		local19.anInt6952 = local102;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(613) short local613 = 0;
		@Pc(621) int local621;
		for (@Pc(615) int local615 = 0; local615 < this.anInt4094; local615++) {
			local621 = local19.method5495();
			if (local621 == 1) {
				local607 = (short) (local613 + local14.method5501());
				local609 = (short) (local14.method5501() + local607);
				local611 = (short) (local609 + local14.method5501());
				local613 = local611;
				this.aShortArray62[local615] = local607;
				this.aShortArray61[local615] = local609;
				this.aShortArray65[local615] = local611;
				if (local607 > this.anInt4088) {
					this.anInt4088 = local607;
				}
				if (local609 > this.anInt4088) {
					this.anInt4088 = local609;
				}
				if (local611 > this.anInt4088) {
					this.anInt4088 = local611;
				}
			}
			if (local621 == 2) {
				local609 = local611;
				local611 = (short) (local613 + local14.method5501());
				local613 = local611;
				this.aShortArray62[local615] = local607;
				this.aShortArray61[local615] = local609;
				this.aShortArray65[local615] = local611;
				if (local611 > this.anInt4088) {
					this.anInt4088 = local611;
				}
			}
			if (local621 == 3) {
				local607 = local611;
				local611 = (short) (local14.method5501() + local613);
				local613 = local611;
				this.aShortArray62[local615] = local607;
				this.aShortArray61[local615] = local609;
				this.aShortArray65[local615] = local611;
				if (local611 > this.anInt4088) {
					this.anInt4088 = local611;
				}
			}
			if (local621 == 4) {
				@Pc(774) short local774 = local607;
				local607 = local609;
				local611 = (short) (local613 + local14.method5501());
				local609 = local774;
				local613 = local611;
				this.aShortArray62[local615] = local607;
				this.aShortArray61[local615] = local774;
				this.aShortArray65[local615] = local611;
				if (this.anInt4088 < local611) {
					this.anInt4088 = local611;
				}
			}
		}
		this.anInt4088++;
		local14.anInt6952 = local178;
		for (local621 = 0; local621 < this.anInt4086; local621++) {
			this.aByteArray82[local621] = 0;
			this.aShortArray66[local621] = (short) local14.method5500();
			this.aShortArray64[local621] = (short) local14.method5500();
			this.aShortArray67[local621] = (short) local14.method5500();
		}
		if (this.aByteArray79 != null) {
			@Pc(878) boolean local878 = false;
			for (@Pc(880) int local880 = 0; local880 < this.anInt4094; local880++) {
				@Pc(889) int local889 = this.aByteArray79[local880] & 0xFF;
				if (local889 != 255) {
					if (this.aShortArray62[local880] == (this.aShortArray66[local889] & 0xFFFF) && (this.aShortArray64[local889] & 0xFFFF) == this.aShortArray61[local880] && (this.aShortArray67[local889] & 0xFFFF) == this.aShortArray65[local880]) {
						this.aByteArray79[local880] = -1;
					} else {
						local878 = true;
					}
				}
			}
			if (!local878) {
				this.aByteArray79 = null;
			}
		}
		if (!local7) {
			this.aByteArray83 = null;
		}
		if (!local9) {
			this.aShortArray59 = null;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BBSSSSISSB)B")
	public byte method3327() {
		if (this.anInt4086 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray82[this.anInt4086] = 3;
		this.aShortArray66[this.anInt4086] = 0;
		this.aShortArray64[this.anInt4086] = 32767;
		this.aShortArray67[this.anInt4086] = 0;
		this.anIntArray353[this.anInt4086] = 1024;
		this.anIntArray351[this.anInt4086] = 1024;
		this.anIntArray347[this.anInt4086] = 1024;
		this.aByteArray81[this.anInt4086] = 0;
		this.aByteArray85[this.anInt4086] = 0;
		this.anIntArray354[this.anInt4086] = 0;
		return (byte) this.anInt4086++;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(SLclient!kq;II)I")
	private int method3328(@OriginalArg(0) short arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray350[arg2];
		@Pc(15) int local15 = arg1.anIntArray349[arg2];
		@Pc(20) int local20 = arg1.anIntArray356[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt4082; local22++) {
			if (this.anIntArray350[local22] == local10 && local15 == this.anIntArray349[local22] && this.anIntArray356[local22] == local20) {
				this.aShortArray60[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray350[this.anInt4082] = local10;
		this.anIntArray349[this.anInt4082] = local15;
		this.anIntArray356[this.anInt4082] = local20;
		this.aShortArray60[this.anInt4082] = arg0;
		this.anIntArray348[this.anInt4082] = arg1.anIntArray348 == null ? -1 : arg1.anIntArray348[arg2];
		return this.anInt4082++;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(SIS)V")
	public void method3329(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray59 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt4094; local11++) {
			if (arg1 == this.aShortArray59[local11]) {
				this.aShortArray59[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)[[I")
	public int[][] method3330() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass150Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass150Array1[local12].anInt4161;
			if (local20 >= 0) {
				@Pc(29) int local29 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.aClass150Array1.length; local77++) {
			@Pc(91) int local91 = this.aClass150Array1[local77].anInt4161;
			if (local91 >= 0) {
				local52[local91][local8[local91]++] = local77;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)[[I")
	public int[][] method3332() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4088; local12++) {
			@Pc(19) int local19 = this.anIntArray348[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(33) int local33 = local8[local19]++;
			}
		}
		@Pc(58) int[][] local58 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local58[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt4088; local79++) {
			@Pc(86) int local86 = this.anIntArray348[local79];
			if (local86 >= 0) {
				local58[local86][local8[local86]++] = local79;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIBI)V")
	public void method3333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(31) int local31;
		if (arg1 != 0) {
			local7 = Class162.anIntArray388[arg1];
			local11 = Class162.anIntArray387[arg1];
			for (local13 = 0; local13 < this.anInt4082; local13++) {
				local31 = local11 * this.anIntArray350[local13] + this.anIntArray349[local13] * local7 >> 15;
				this.anIntArray349[local13] = local11 * this.anIntArray349[local13] - this.anIntArray350[local13] * local7 >> 15;
				this.anIntArray350[local13] = local31;
			}
		}
		if (arg0 != 0) {
			local7 = Class162.anIntArray388[arg0];
			local11 = Class162.anIntArray387[arg0];
			for (local13 = 0; local13 < this.anInt4082; local13++) {
				local31 = local11 * this.anIntArray349[local13] - this.anIntArray356[local13] * local7 >> 15;
				this.anIntArray356[local13] = local11 * this.anIntArray356[local13] + this.anIntArray349[local13] * local7 >> 15;
				this.anIntArray349[local13] = local31;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local7 = Class162.anIntArray388[arg2];
		local11 = Class162.anIntArray387[arg2];
		for (local13 = 0; local13 < this.anInt4082; local13++) {
			local31 = local11 * this.anIntArray350[local13] + this.anIntArray356[local13] * local7 >> 15;
			this.anIntArray356[local13] = this.anIntArray356[local13] * local11 - this.anIntArray350[local13] * local7 >> 15;
			this.anIntArray350[local13] = local31;
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(IIII)V")
	public void method3334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4082; local7++) {
			this.anIntArray350[local7] += arg2;
			this.anIntArray349[local7] += arg1;
			this.anIntArray356[local7] += arg0;
		}
	}
}
