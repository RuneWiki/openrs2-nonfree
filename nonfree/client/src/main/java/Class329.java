import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class329 {

	@OriginalMember(owner = "client!su", name = "b", descriptor = "[I")
	public int[] anIntArray499;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!su", name = "d", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!su", name = "i", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "[I")
	public int[] anIntArray500;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "[Lclient!uq;")
	public Class356[] aClass356Array1;

	@OriginalMember(owner = "client!su", name = "o", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!su", name = "q", descriptor = "[I")
	public int[] anIntArray503;

	@OriginalMember(owner = "client!su", name = "t", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!su", name = "u", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!su", name = "v", descriptor = "[Lclient!sba;")
	public Class313[] aClass313Array3;

	@OriginalMember(owner = "client!su", name = "y", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!su", name = "A", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!su", name = "C", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!su", name = "D", descriptor = "[Lclient!ld;")
	public Class209[] aClass209Array3;

	@OriginalMember(owner = "client!su", name = "E", descriptor = "[I")
	public int[] anIntArray505;

	@OriginalMember(owner = "client!su", name = "G", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!su", name = "I", descriptor = "[I")
	public int[] anIntArray506;

	@OriginalMember(owner = "client!su", name = "J", descriptor = "[S")
	public short[] aShortArray116;

	@OriginalMember(owner = "client!su", name = "M", descriptor = "[S")
	public short[] aShortArray117;

	@OriginalMember(owner = "client!su", name = "N", descriptor = "[S")
	public short[] aShortArray118;

	@OriginalMember(owner = "client!su", name = "O", descriptor = "[S")
	public short[] aShortArray119;

	@OriginalMember(owner = "client!su", name = "Q", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!su", name = "R", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!su", name = "S", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!su", name = "U", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!su", name = "W", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!su", name = "Z", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!su", name = "eb", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!su", name = "h", descriptor = "B")
	public byte aByte126 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "I")
	public int anInt9031 = 0;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "I")
	public int anInt9034 = 0;

	@OriginalMember(owner = "client!su", name = "e", descriptor = "I")
	public int anInt9032 = 0;

	@OriginalMember(owner = "client!su", name = "B", descriptor = "I")
	public int anInt9041 = 0;

	@OriginalMember(owner = "client!su", name = "V", descriptor = "I")
	public int anInt9048 = 12;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	private Class329() {
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "([B)V")
	public Class329(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method7673(arg0);
		} else {
			this.method7680(arg0);
		}
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(III)V")
	public Class329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray502 = new int[arg0];
		this.aByteArray86 = new byte[arg1];
		if (arg2 > 0) {
			this.aShortArray117 = new short[arg2];
			this.anIntArray505 = new int[arg2];
			this.anIntArray504 = new int[arg2];
			this.anIntArray500 = new int[arg2];
			this.anIntArray499 = new int[arg2];
			this.anIntArray509 = new int[arg2];
			this.aByteArray89 = new byte[arg2];
			this.aShortArray111 = new short[arg2];
			this.aByteArray92 = new byte[arg2];
			this.aShortArray119 = new short[arg2];
			this.aByteArray88 = new byte[arg2];
			this.anIntArray501 = new int[arg2];
		}
		this.aShortArray115 = new short[arg1];
		this.aByteArray90 = new byte[arg1];
		this.aShortArray118 = new short[arg1];
		this.anIntArray507 = new int[arg1];
		this.aShortArray113 = new short[arg1];
		this.aShortArray116 = new short[arg1];
		this.aByteArray87 = new byte[arg1];
		this.anIntArray503 = new int[arg0];
		this.aShortArray112 = new short[arg1];
		this.anIntArray506 = new int[arg0];
		this.anIntArray508 = new int[arg0];
		this.aByteArray91 = new byte[arg1];
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "([Lclient!su;I)V")
	public Class329(@OriginalArg(0) Class329[] arg0, @OriginalArg(1) int arg1) {
		this.anInt9034 = 0;
		this.anInt9041 = 0;
		this.anInt9032 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		this.aByte126 = -1;
		@Pc(49) boolean local49 = false;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class329 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt9032 += local56.anInt9032;
				this.anInt9041 += local56.anInt9041;
				this.anInt9034 += local56.anInt9034;
				local36 |= local56.aByteArray90 != null;
				if (local56.aClass313Array3 != null) {
					local30 += local56.aClass313Array3.length;
				}
				if (local56.aClass209Array3 != null) {
					local32 += local56.aClass209Array3.length;
				}
				if (local56.aClass356Array1 != null) {
					local34 += local56.aClass356Array1.length;
				}
				local49 |= local56.anIntArray507 != null;
				local40 |= local56.aByteArray87 != null;
				local42 |= local56.aByteArray86 != null;
				local44 |= local56.aShortArray118 != null;
				if (local56.aByteArray91 == null) {
					if (this.aByte126 == -1) {
						this.aByte126 = local56.aByte126;
					}
					if (this.aByte126 != local56.aByte126) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
			}
		}
		if (local30 > 0) {
			this.aClass313Array3 = new Class313[local30];
		}
		this.aShortArray114 = new short[this.anInt9034];
		this.aShortArray110 = new short[this.anInt9041];
		if (local36) {
			this.aByteArray90 = new byte[this.anInt9034];
		}
		if (local42) {
			this.aByteArray86 = new byte[this.anInt9034];
		}
		if (local44) {
			this.aShortArray118 = new short[this.anInt9034];
		}
		if (local49) {
			this.anIntArray507 = new int[this.anInt9034];
		}
		this.aShortArray115 = new short[this.anInt9034];
		this.aShortArray112 = new short[this.anInt9034];
		if (local32 > 0) {
			this.aClass209Array3 = new Class209[local32];
		}
		this.anIntArray506 = new int[this.anInt9041];
		this.anIntArray503 = new int[this.anInt9041];
		this.anIntArray508 = new int[this.anInt9041];
		this.aShortArray113 = new short[this.anInt9034];
		this.aShortArray116 = new short[this.anInt9034];
		if (this.anInt9032 > 0) {
			this.anIntArray499 = new int[this.anInt9032];
			this.anIntArray504 = new int[this.anInt9032];
			this.anIntArray501 = new int[this.anInt9032];
			this.aShortArray117 = new short[this.anInt9032];
			this.anIntArray509 = new int[this.anInt9032];
			this.anIntArray500 = new int[this.anInt9032];
			this.aShortArray111 = new short[this.anInt9032];
			this.aByteArray92 = new byte[this.anInt9032];
			this.aByteArray89 = new byte[this.anInt9032];
			this.aByteArray88 = new byte[this.anInt9032];
			this.anIntArray505 = new int[this.anInt9032];
			this.aShortArray119 = new short[this.anInt9032];
		}
		if (local34 > 0) {
			this.aClass356Array1 = new Class356[local34];
		}
		if (local38) {
			this.aByteArray91 = new byte[this.anInt9034];
		}
		this.anIntArray502 = new int[this.anInt9041];
		if (local40) {
			this.aByteArray87 = new byte[this.anInt9034];
		}
		this.anInt9034 = 0;
		this.anInt9032 = 0;
		local32 = 0;
		local30 = 0;
		this.anInt9041 = 0;
		local34 = 0;
		@Pc(602) int local602;
		@Pc(613) int local613;
		for (@Pc(377) int local377 = 0; local377 < arg1; local377++) {
			@Pc(383) short local383 = (short) (0x1 << local377);
			@Pc(387) Class329 local387 = arg0[local377];
			if (local387 != null) {
				@Pc(394) int local394;
				if (local387.aClass356Array1 != null) {
					for (local394 = 0; local394 < local387.aClass356Array1.length; local394++) {
						@Pc(400) Class356 local400 = local387.aClass356Array1[local394];
						this.aClass356Array1[local34++] = local400.method8305(this.anInt9034 + local400.anInt9980);
					}
				}
				for (local394 = 0; local394 < local387.anInt9034; local394++) {
					if (local36 && local387.aByteArray90 != null) {
						this.aByteArray90[this.anInt9034] = local387.aByteArray90[local394];
					}
					if (local38) {
						if (local387.aByteArray91 == null) {
							this.aByteArray91[this.anInt9034] = local387.aByte126;
						} else {
							this.aByteArray91[this.anInt9034] = local387.aByteArray91[local394];
						}
					}
					if (local40 && local387.aByteArray87 != null) {
						this.aByteArray87[this.anInt9034] = local387.aByteArray87[local394];
					}
					if (local44) {
						if (local387.aShortArray118 == null) {
							this.aShortArray118[this.anInt9034] = -1;
						} else {
							this.aShortArray118[this.anInt9034] = local387.aShortArray118[local394];
						}
					}
					if (local49) {
						if (local387.anIntArray507 == null) {
							this.anIntArray507[this.anInt9034] = -1;
						} else {
							this.anIntArray507[this.anInt9034] = local387.anIntArray507[local394];
						}
					}
					this.aShortArray115[this.anInt9034] = (short) this.method7685(local387, local383, local387.aShortArray115[local394]);
					this.aShortArray116[this.anInt9034] = (short) this.method7685(local387, local383, local387.aShortArray116[local394]);
					this.aShortArray113[this.anInt9034] = (short) this.method7685(local387, local383, local387.aShortArray113[local394]);
					this.aShortArray114[this.anInt9034] = local383;
					this.aShortArray112[this.anInt9034] = local387.aShortArray112[local394];
					this.anInt9034++;
				}
				@Pc(590) int local590;
				if (local387.aClass313Array3 != null) {
					for (local590 = 0; local590 < local387.aClass313Array3.length; local590++) {
						local602 = this.method7685(local387, local383, local387.aClass313Array3[local590].anInt8781);
						local613 = this.method7685(local387, local383, local387.aClass313Array3[local590].anInt8793);
						@Pc(624) int local624 = this.method7685(local387, local383, local387.aClass313Array3[local590].anInt8786);
						this.aClass313Array3[local30] = local387.aClass313Array3[local590].method7466(local602, local613, local624);
						local30++;
					}
				}
				if (local387.aClass209Array3 != null) {
					for (local590 = 0; local590 < local387.aClass209Array3.length; local590++) {
						local602 = this.method7685(local387, local383, local387.aClass209Array3[local590].anInt6178);
						this.aClass209Array3[local32] = local387.aClass209Array3[local590].method5132(local602);
						local32++;
					}
				}
			}
		}
		@Pc(689) int local689 = 0;
		this.anInt9031 = this.anInt9041;
		for (@Pc(695) int local695 = 0; local695 < arg1; local695++) {
			@Pc(701) short local701 = (short) (0x1 << local695);
			@Pc(705) Class329 local705 = arg0[local695];
			if (local705 != null) {
				for (local602 = 0; local602 < local705.anInt9034; local602++) {
					if (local42) {
						this.aByteArray86[local689++] = (byte) (local705.aByteArray86 == null || local705.aByteArray86[local602] == -1 ? -1 : local705.aByteArray86[local602] + this.anInt9032);
					}
				}
				for (local613 = 0; local613 < local705.anInt9032; local613++) {
					@Pc(759) byte local759 = this.aByteArray92[this.anInt9032] = local705.aByteArray92[local613];
					if (local759 == 0) {
						this.aShortArray117[this.anInt9032] = (short) this.method7685(local705, local701, local705.aShortArray117[local613]);
						this.aShortArray111[this.anInt9032] = (short) this.method7685(local705, local701, local705.aShortArray111[local613]);
						this.aShortArray119[this.anInt9032] = (short) this.method7685(local705, local701, local705.aShortArray119[local613]);
					}
					if (local759 >= 1 && local759 <= 3) {
						this.aShortArray117[this.anInt9032] = local705.aShortArray117[local613];
						this.aShortArray111[this.anInt9032] = local705.aShortArray111[local613];
						this.aShortArray119[this.anInt9032] = local705.aShortArray119[local613];
						this.anIntArray504[this.anInt9032] = local705.anIntArray504[local613];
						this.anIntArray501[this.anInt9032] = local705.anIntArray501[local613];
						this.anIntArray505[this.anInt9032] = local705.anIntArray505[local613];
						this.aByteArray89[this.anInt9032] = local705.aByteArray89[local613];
						this.aByteArray88[this.anInt9032] = local705.aByteArray88[local613];
						this.anIntArray500[this.anInt9032] = local705.anIntArray500[local613];
					}
					if (local759 == 2) {
						this.anIntArray499[this.anInt9032] = local705.anIntArray499[local613];
						this.anIntArray509[this.anInt9032] = local705.anIntArray509[local613];
					}
					this.anInt9032++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(SIS)V")
	public void method7670(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt9034; local5++) {
			if (this.aShortArray112[local5] == arg0) {
				this.aShortArray112[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIBSBBSII)I")
	public int method7671(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) short arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray115[this.anInt9034] = (short) arg0;
		this.aShortArray116[this.anInt9034] = (short) arg7;
		this.aShortArray113[this.anInt9034] = (short) arg6;
		this.aByteArray90[this.anInt9034] = arg3;
		this.aByteArray86[this.anInt9034] = arg4;
		this.aShortArray112[this.anInt9034] = arg5;
		this.aByteArray87[this.anInt9034] = arg1;
		this.aShortArray118[this.anInt9034] = arg2;
		return this.anInt9034++;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
	public void method7672() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9041; local1++) {
			this.anIntArray508[local1] <<= 0x2;
			this.anIntArray503[local1] <<= 0x2;
			this.anIntArray506[local1] <<= 0x2;
		}
		if (this.anInt9032 <= 0 || this.anIntArray504 == null) {
			return;
		}
		for (@Pc(46) int local46 = 0; local46 < this.anIntArray504.length; local46++) {
			this.anIntArray504[local46] <<= 0x2;
			this.anIntArray501[local46] <<= 0x2;
			if (this.aByteArray92[local46] != 1) {
				this.anIntArray505[local46] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I[B)V")
	private void method7673(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(arg0);
		@Pc(13) Class5_Sub41 local13 = new Class5_Sub41(arg0);
		@Pc(18) Class5_Sub41 local18 = new Class5_Sub41(arg0);
		@Pc(23) Class5_Sub41 local23 = new Class5_Sub41(arg0);
		@Pc(28) Class5_Sub41 local28 = new Class5_Sub41(arg0);
		@Pc(33) Class5_Sub41 local33 = new Class5_Sub41(arg0);
		@Pc(38) Class5_Sub41 local38 = new Class5_Sub41(arg0);
		local8.anInt9230 = arg0.length - 23;
		this.anInt9041 = local8.method7860();
		this.anInt9034 = local8.method7860();
		this.anInt9032 = local8.method7816();
		@Pc(63) int local63 = local8.method7816();
		@Pc(74) boolean local74 = (local63 & 0x1) == 1;
		@Pc(83) boolean local83 = (local63 & 0x2) == 2;
		@Pc(92) boolean local92 = (local63 & 0x4) == 4;
		@Pc(101) boolean local101 = (local63 & 0x8) == 8;
		if (local101) {
			local8.anInt9230 -= 7;
			this.anInt9048 = local8.method7816();
			local8.anInt9230 += 6;
		}
		@Pc(124) int local124 = local8.method7816();
		@Pc(128) int local128 = local8.method7816();
		@Pc(132) int local132 = local8.method7816();
		@Pc(136) int local136 = local8.method7816();
		@Pc(140) int local140 = local8.method7816();
		@Pc(144) int local144 = local8.method7860();
		@Pc(148) int local148 = local8.method7860();
		@Pc(152) int local152 = local8.method7860();
		@Pc(156) int local156 = local8.method7860();
		@Pc(160) int local160 = local8.method7860();
		@Pc(162) int local162 = 0;
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(179) int local179;
		if (this.anInt9032 > 0) {
			this.aByteArray92 = new byte[this.anInt9032];
			local8.anInt9230 = 0;
			for (local179 = 0; local179 < this.anInt9032; local179++) {
				@Pc(189) byte local189 = this.aByteArray92[local179] = local8.method7861();
				if (local189 >= 1 && local189 <= 3) {
					local164++;
				}
				if (local189 == 2) {
					local166++;
				}
				if (local189 == 0) {
					local162++;
				}
			}
		}
		local179 = this.anInt9032;
		@Pc(217) int local217 = local179;
		local179 += this.anInt9041;
		@Pc(224) int local224 = local179;
		if (local74) {
			local179 += this.anInt9034;
		}
		@Pc(233) int local233 = local179;
		local179 += this.anInt9034;
		@Pc(240) int local240 = local179;
		if (local124 == 255) {
			local179 += this.anInt9034;
		}
		@Pc(252) int local252 = local179;
		if (local132 == 1) {
			local179 += this.anInt9034;
		}
		@Pc(262) int local262 = local179;
		if (local140 == 1) {
			local179 += this.anInt9041;
		}
		@Pc(274) int local274 = local179;
		if (local128 == 1) {
			local179 += this.anInt9034;
		}
		@Pc(286) int local286 = local179;
		local179 += local156;
		@Pc(292) int local292 = local179;
		if (local136 == 1) {
			local179 += this.anInt9034 * 2;
		}
		@Pc(306) int local306 = local179;
		local179 += local160;
		@Pc(312) int local312 = local179;
		local179 += this.anInt9034 * 2;
		@Pc(321) int local321 = local179;
		local179 += local144;
		@Pc(327) int local327 = local179;
		local179 += local148;
		@Pc(333) int local333 = local179;
		local179 += local152;
		@Pc(339) int local339 = local179;
		local179 += local162 * 6;
		@Pc(347) int local347 = local179;
		local179 += local164 * 6;
		@Pc(355) byte local355 = 6;
		if (this.anInt9048 == 14) {
			local355 = 7;
		} else if (this.anInt9048 >= 15) {
			local355 = 9;
		}
		@Pc(370) int local370 = local179;
		local179 += local355 * local164;
		@Pc(378) int local378 = local179;
		local179 += local164;
		@Pc(390) int local390 = local179;
		local179 += local164;
		@Pc(396) int local396 = local179;
		local179 += local164 + local166 * 2;
		if (local136 == 1 && this.anInt9032 > 0) {
			this.aByteArray86 = new byte[this.anInt9034];
		}
		this.aShortArray115 = new short[this.anInt9034];
		this.aShortArray112 = new short[this.anInt9034];
		if (this.anInt9032 > 0) {
			if (local166 > 0) {
				this.anIntArray509 = new int[local166];
				this.anIntArray499 = new int[local166];
			}
			this.aShortArray117 = new short[this.anInt9032];
			if (local164 > 0) {
				this.anIntArray504 = new int[local164];
				this.aByteArray88 = new byte[local164];
				this.anIntArray501 = new int[local164];
				this.anIntArray500 = new int[local164];
				this.aByteArray89 = new byte[local164];
				this.anIntArray505 = new int[local164];
			}
			this.aShortArray111 = new short[this.anInt9032];
			this.aShortArray119 = new short[this.anInt9032];
		}
		if (local140 == 1) {
			this.anIntArray502 = new int[this.anInt9041];
		}
		if (local128 == 1) {
			this.aByteArray87 = new byte[this.anInt9034];
		}
		local8.anInt9230 = local217;
		this.anIntArray508 = new int[this.anInt9041];
		this.aShortArray116 = new short[this.anInt9034];
		if (local124 == 255) {
			this.aByteArray91 = new byte[this.anInt9034];
		} else {
			this.aByte126 = (byte) local124;
		}
		this.anIntArray503 = new int[this.anInt9041];
		if (local74) {
			this.aByteArray90 = new byte[this.anInt9034];
		}
		this.aShortArray113 = new short[this.anInt9034];
		this.anIntArray506 = new int[this.anInt9041];
		if (local132 == 1) {
			this.anIntArray507 = new int[this.anInt9034];
		}
		if (local136 == 1) {
			this.aShortArray118 = new short[this.anInt9034];
		}
		local13.anInt9230 = local321;
		local18.anInt9230 = local327;
		local23.anInt9230 = local333;
		local28.anInt9230 = local262;
		@Pc(586) int local586 = 0;
		@Pc(588) int local588 = 0;
		@Pc(590) int local590 = 0;
		@Pc(597) int local597;
		for (@Pc(592) int local592 = 0; local592 < this.anInt9041; local592++) {
			local597 = local8.method7816();
			@Pc(599) int local599 = 0;
			if ((local597 & 0x1) != 0) {
				local599 = local13.method7845();
			}
			@Pc(612) int local612 = 0;
			if ((local597 & 0x2) != 0) {
				local612 = local18.method7845();
			}
			@Pc(622) int local622 = 0;
			if ((local597 & 0x4) != 0) {
				local622 = local23.method7845();
			}
			this.anIntArray508[local592] = local586 + local599;
			this.anIntArray503[local592] = local612 + local588;
			this.anIntArray506[local592] = local622 + local590;
			local590 = this.anIntArray506[local592];
			local588 = this.anIntArray503[local592];
			local586 = this.anIntArray508[local592];
			if (local140 == 1) {
				this.anIntArray502[local592] = local28.method7816();
			}
		}
		local8.anInt9230 = local312;
		local13.anInt9230 = local224;
		local18.anInt9230 = local240;
		local23.anInt9230 = local274;
		local28.anInt9230 = local252;
		local33.anInt9230 = local292;
		local38.anInt9230 = local306;
		for (local597 = 0; local597 < this.anInt9034; local597++) {
			this.aShortArray112[local597] = (short) local8.method7860();
			if (local74) {
				this.aByteArray90[local597] = local13.method7861();
			}
			if (local124 == 255) {
				this.aByteArray91[local597] = local18.method7861();
			}
			if (local128 == 1) {
				this.aByteArray87[local597] = local23.method7861();
			}
			if (local132 == 1) {
				this.anIntArray507[local597] = local28.method7816();
			}
			if (local136 == 1) {
				this.aShortArray118[local597] = (short) (local33.method7860() - 1);
			}
			if (this.aByteArray86 != null) {
				if (this.aShortArray118[local597] == -1) {
					this.aByteArray86[local597] = -1;
				} else {
					this.aByteArray86[local597] = (byte) (local38.method7816() - 1);
				}
			}
		}
		this.anInt9031 = -1;
		local8.anInt9230 = local286;
		local13.anInt9230 = local233;
		@Pc(824) short local824 = 0;
		@Pc(826) short local826 = 0;
		@Pc(828) short local828 = 0;
		@Pc(830) short local830 = 0;
		@Pc(837) int local837;
		for (@Pc(832) int local832 = 0; local832 < this.anInt9034; local832++) {
			local837 = local13.method7816();
			if (local837 == 1) {
				local824 = (short) (local8.method7845() + local830);
				local826 = (short) (local8.method7845() + local824);
				local828 = (short) (local8.method7845() + local826);
				local830 = local828;
				this.aShortArray115[local832] = local824;
				this.aShortArray116[local832] = local826;
				this.aShortArray113[local832] = local828;
				if (local824 > this.anInt9031) {
					this.anInt9031 = local824;
				}
				if (local826 > this.anInt9031) {
					this.anInt9031 = local826;
				}
				if (local828 > this.anInt9031) {
					this.anInt9031 = local828;
				}
			}
			if (local837 == 2) {
				local826 = local828;
				local828 = (short) (local830 + local8.method7845());
				local830 = local828;
				this.aShortArray115[local832] = local824;
				this.aShortArray116[local832] = local826;
				this.aShortArray113[local832] = local828;
				if (this.anInt9031 < local828) {
					this.anInt9031 = local828;
				}
			}
			if (local837 == 3) {
				local824 = local828;
				local828 = (short) (local8.method7845() + local830);
				local830 = local828;
				this.aShortArray115[local832] = local824;
				this.aShortArray116[local832] = local826;
				this.aShortArray113[local832] = local828;
				if (this.anInt9031 < local828) {
					this.anInt9031 = local828;
				}
			}
			if (local837 == 4) {
				@Pc(992) short local992 = local824;
				local824 = local826;
				local828 = (short) (local830 + local8.method7845());
				local826 = local992;
				this.aShortArray115[local832] = local824;
				local830 = local828;
				this.aShortArray116[local832] = local992;
				this.aShortArray113[local832] = local828;
				if (local828 > this.anInt9031) {
					this.anInt9031 = local828;
				}
			}
		}
		this.anInt9031++;
		local8.anInt9230 = local339;
		local13.anInt9230 = local347;
		local18.anInt9230 = local370;
		local23.anInt9230 = local378;
		local28.anInt9230 = local390;
		local33.anInt9230 = local396;
		@Pc(1074) int local1074;
		for (local837 = 0; local837 < this.anInt9032; local837++) {
			local1074 = this.aByteArray92[local837] & 0xFF;
			if (local1074 == 0) {
				this.aShortArray117[local837] = (short) local8.method7860();
				this.aShortArray111[local837] = (short) local8.method7860();
				this.aShortArray119[local837] = (short) local8.method7860();
			}
			if (local1074 == 1) {
				this.aShortArray117[local837] = (short) local13.method7860();
				this.aShortArray111[local837] = (short) local13.method7860();
				this.aShortArray119[local837] = (short) local13.method7860();
				if (this.anInt9048 < 15) {
					this.anIntArray504[local837] = local18.method7860();
					if (this.anInt9048 < 14) {
						this.anIntArray501[local837] = local18.method7860();
					} else {
						this.anIntArray501[local837] = local18.method7807();
					}
					this.anIntArray505[local837] = local18.method7860();
				} else {
					this.anIntArray504[local837] = local18.method7807();
					this.anIntArray501[local837] = local18.method7807();
					this.anIntArray505[local837] = local18.method7807();
				}
				this.aByteArray89[local837] = local23.method7861();
				this.aByteArray88[local837] = local28.method7861();
				this.anIntArray500[local837] = local33.method7861();
			}
			if (local1074 == 2) {
				this.aShortArray117[local837] = (short) local13.method7860();
				this.aShortArray111[local837] = (short) local13.method7860();
				this.aShortArray119[local837] = (short) local13.method7860();
				if (this.anInt9048 < 15) {
					this.anIntArray504[local837] = local18.method7860();
					if (this.anInt9048 < 14) {
						this.anIntArray501[local837] = local18.method7860();
					} else {
						this.anIntArray501[local837] = local18.method7807();
					}
					this.anIntArray505[local837] = local18.method7860();
				} else {
					this.anIntArray504[local837] = local18.method7807();
					this.anIntArray501[local837] = local18.method7807();
					this.anIntArray505[local837] = local18.method7807();
				}
				this.aByteArray89[local837] = local23.method7861();
				this.aByteArray88[local837] = local28.method7861();
				this.anIntArray500[local837] = local33.method7861();
				this.anIntArray499[local837] = local33.method7861();
				this.anIntArray509[local837] = local33.method7861();
			}
			if (local1074 == 3) {
				this.aShortArray117[local837] = (short) local13.method7860();
				this.aShortArray111[local837] = (short) local13.method7860();
				this.aShortArray119[local837] = (short) local13.method7860();
				if (this.anInt9048 < 15) {
					this.anIntArray504[local837] = local18.method7860();
					if (this.anInt9048 < 14) {
						this.anIntArray501[local837] = local18.method7860();
					} else {
						this.anIntArray501[local837] = local18.method7807();
					}
					this.anIntArray505[local837] = local18.method7860();
				} else {
					this.anIntArray504[local837] = local18.method7807();
					this.anIntArray501[local837] = local18.method7807();
					this.anIntArray505[local837] = local18.method7807();
				}
				this.aByteArray89[local837] = local23.method7861();
				this.aByteArray88[local837] = local28.method7861();
				this.anIntArray500[local837] = local33.method7861();
			}
		}
		local8.anInt9230 = local179;
		@Pc(1474) int local1474;
		@Pc(1479) int local1479;
		@Pc(1483) int local1483;
		@Pc(1541) int local1541;
		if (local83) {
			local1074 = local8.method7816();
			if (local1074 > 0) {
				this.aClass313Array3 = new Class313[local1074];
				for (local1474 = 0; local1474 < local1074; local1474++) {
					local1479 = local8.method7860();
					local1483 = local8.method7860();
					@Pc(1491) byte local1491;
					if (local124 == 255) {
						local1491 = this.aByteArray91[local1483];
					} else {
						local1491 = (byte) local124;
					}
					this.aClass313Array3[local1474] = new Class313(local1479, this.aShortArray115[local1483], this.aShortArray116[local1483], this.aShortArray113[local1483], local1491);
				}
			}
			local1474 = local8.method7816();
			if (local1474 > 0) {
				this.aClass209Array3 = new Class209[local1474];
				for (local1479 = 0; local1479 < local1474; local1479++) {
					local1483 = local8.method7860();
					local1541 = local8.method7860();
					this.aClass209Array3[local1479] = new Class209(local1483, local1541);
				}
			}
		}
		if (!local92) {
			return;
		}
		local1074 = local8.method7816();
		if (local1074 <= 0) {
			return;
		}
		this.aClass356Array1 = new Class356[local1074];
		for (local1474 = 0; local1474 < local1074; local1474++) {
			local1479 = local8.method7860();
			local1483 = local8.method7860();
			local1541 = local8.method7816();
			@Pc(1590) byte local1590 = local8.method7861();
			this.aClass356Array1[local1474] = new Class356(local1479, local1483, local1541, local1590);
		}
		return;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZII)V")
	public void method7674(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(10) int local10 = 0; local10 < this.anInt9041; local10++) {
			this.anIntArray508[local10] += arg0;
			this.anIntArray503[local10] += arg2;
			this.anIntArray506[local10] += arg1;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(SBSBSBSBSS)B")
	public byte method7677() {
		if (this.anInt9032 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray92[this.anInt9032] = 3;
		this.aShortArray117[this.anInt9032] = 0;
		this.aShortArray111[this.anInt9032] = 32767;
		this.aShortArray119[this.anInt9032] = 0;
		this.anIntArray504[this.anInt9032] = 1024;
		this.anIntArray501[this.anInt9032] = 1024;
		this.anIntArray505[this.anInt9032] = 1024;
		this.aByteArray89[this.anInt9032] = 0;
		this.aByteArray88[this.anInt9032] = 0;
		this.anIntArray500[this.anInt9032] = 0;
		return (byte) this.anInt9032++;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)[[I")
	public int[][] method7678() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.aClass356Array1.length; local19++) {
			@Pc(27) int local27 = this.aClass356Array1[local19].anInt9982;
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(60) int[][] local60 = new int[local10 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local10; local62++) {
			local60[local62] = new int[local8[local62]];
			local8[local62] = 0;
		}
		for (@Pc(85) int local85 = 0; local85 < this.aClass356Array1.length; local85++) {
			@Pc(93) int local93 = this.aClass356Array1[local85].anInt9982;
			if (local93 >= 0) {
				local60[local93][local8[local93]++] = local85;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)[[I")
	public int[][] method7679() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt9034; local12++) {
			@Pc(19) int local19 = this.anIntArray507[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(33) int local33 = local8[local19]++;
			}
		}
		@Pc(46) int[][] local46 = new int[local10 + 1][];
		for (@Pc(48) int local48 = 0; local48 <= local10; local48++) {
			local46[local48] = new int[local8[local48]];
			local8[local48] = 0;
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt9034; local67++) {
			@Pc(74) int local74 = this.anIntArray507[local67];
			if (local74 >= 0) {
				local46[local74][local8[local74]++] = local67;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "([BI)V")
	private void method7680(@OriginalArg(0) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class5_Sub41 local12 = new Class5_Sub41(arg0);
		@Pc(17) Class5_Sub41 local17 = new Class5_Sub41(arg0);
		@Pc(22) Class5_Sub41 local22 = new Class5_Sub41(arg0);
		@Pc(27) Class5_Sub41 local27 = new Class5_Sub41(arg0);
		@Pc(32) Class5_Sub41 local32 = new Class5_Sub41(arg0);
		local12.anInt9230 = arg0.length - 18;
		this.anInt9041 = local12.method7860();
		this.anInt9034 = local12.method7860();
		this.anInt9032 = local12.method7816();
		@Pc(57) int local57 = local12.method7816();
		@Pc(61) int local61 = local12.method7816();
		@Pc(65) int local65 = local12.method7816();
		@Pc(69) int local69 = local12.method7816();
		@Pc(73) int local73 = local12.method7816();
		@Pc(77) int local77 = local12.method7860();
		@Pc(81) int local81 = local12.method7860();
		@Pc(85) int local85 = local12.method7860();
		@Pc(89) int local89 = local12.method7860();
		@Pc(98) int local98 = this.anInt9041;
		@Pc(100) int local100 = local98;
		local98 += this.anInt9034;
		@Pc(107) int local107 = local98;
		if (local61 == 255) {
			local98 += this.anInt9034;
		}
		@Pc(117) int local117 = local98;
		if (local69 == 1) {
			local98 += this.anInt9034;
		}
		@Pc(127) int local127 = local98;
		if (local57 == 1) {
			local98 += this.anInt9034;
		}
		@Pc(137) int local137 = local98;
		if (local73 == 1) {
			local98 += this.anInt9041;
		}
		@Pc(149) int local149 = local98;
		if (local65 == 1) {
			local98 += this.anInt9034;
		}
		@Pc(159) int local159 = local98;
		local98 += local89;
		@Pc(165) int local165 = local98;
		local98 += this.anInt9034 * 2;
		@Pc(174) int local174 = local98;
		local98 += this.anInt9032 * 6;
		@Pc(183) int local183 = local98;
		local98 += local77;
		@Pc(189) int local189 = local98;
		local98 += local81;
		this.aShortArray113 = new short[this.anInt9034];
		this.aShortArray112 = new short[this.anInt9034];
		if (local73 == 1) {
			this.anIntArray502 = new int[this.anInt9041];
		}
		if (local57 == 1) {
			this.aByteArray90 = new byte[this.anInt9034];
			this.aShortArray118 = new short[this.anInt9034];
			this.aByteArray86 = new byte[this.anInt9034];
		}
		if (this.anInt9032 > 0) {
			this.aByteArray92 = new byte[this.anInt9032];
			this.aShortArray119 = new short[this.anInt9032];
			this.aShortArray111 = new short[this.anInt9032];
			this.aShortArray117 = new short[this.anInt9032];
		}
		if (local65 == 1) {
			this.aByteArray87 = new byte[this.anInt9034];
		}
		this.anIntArray506 = new int[this.anInt9041];
		this.aShortArray115 = new short[this.anInt9034];
		if (local69 == 1) {
			this.anIntArray507 = new int[this.anInt9034];
		}
		this.anIntArray503 = new int[this.anInt9041];
		local12.anInt9230 = 0;
		this.anIntArray508 = new int[this.anInt9041];
		this.aShortArray116 = new short[this.anInt9034];
		if (local61 == 255) {
			this.aByteArray91 = new byte[this.anInt9034];
		} else {
			this.aByte126 = (byte) local61;
		}
		local17.anInt9230 = local183;
		local22.anInt9230 = local189;
		local27.anInt9230 = local98;
		local32.anInt9230 = local137;
		@Pc(333) int local333 = 0;
		@Pc(335) int local335 = 0;
		@Pc(337) int local337 = 0;
		@Pc(344) int local344;
		@Pc(346) int local346;
		for (@Pc(339) int local339 = 0; local339 < this.anInt9041; local339++) {
			local344 = local12.method7816();
			local346 = 0;
			if ((local344 & 0x1) != 0) {
				local346 = local17.method7845();
			}
			@Pc(359) int local359 = 0;
			if ((local344 & 0x2) != 0) {
				local359 = local22.method7845();
			}
			@Pc(369) int local369 = 0;
			if ((local344 & 0x4) != 0) {
				local369 = local27.method7845();
			}
			this.anIntArray508[local339] = local333 + local346;
			this.anIntArray503[local339] = local359 + local335;
			this.anIntArray506[local339] = local337 + local369;
			local337 = this.anIntArray506[local339];
			local333 = this.anIntArray508[local339];
			local335 = this.anIntArray503[local339];
			if (local73 == 1) {
				this.anIntArray502[local339] = local32.method7816();
			}
		}
		local12.anInt9230 = local165;
		local17.anInt9230 = local127;
		local22.anInt9230 = local107;
		local27.anInt9230 = local149;
		local32.anInt9230 = local117;
		for (local344 = 0; local344 < this.anInt9034; local344++) {
			this.aShortArray112[local344] = (short) local12.method7860();
			if (local57 == 1) {
				local346 = local17.method7816();
				if ((local346 & 0x1) == 1) {
					local5 = true;
					this.aByteArray90[local344] = 1;
				} else {
					this.aByteArray90[local344] = 0;
				}
				if ((local346 & 0x2) == 2) {
					this.aByteArray86[local344] = (byte) (local346 >> 2);
					this.aShortArray118[local344] = this.aShortArray112[local344];
					this.aShortArray112[local344] = 127;
					if (this.aShortArray118[local344] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray86[local344] = -1;
					this.aShortArray118[local344] = -1;
				}
			}
			if (local61 == 255) {
				this.aByteArray91[local344] = local22.method7861();
			}
			if (local65 == 1) {
				this.aByteArray87[local344] = local27.method7861();
			}
			if (local69 == 1) {
				this.anIntArray507[local344] = local32.method7816();
			}
		}
		this.anInt9031 = -1;
		local12.anInt9230 = local159;
		local17.anInt9230 = local100;
		@Pc(582) short local582 = 0;
		@Pc(590) short local590 = 0;
		@Pc(592) short local592 = 0;
		@Pc(594) short local594 = 0;
		@Pc(601) int local601;
		for (@Pc(596) int local596 = 0; local596 < this.anInt9034; local596++) {
			local601 = local17.method7816();
			if (local601 == 1) {
				local582 = (short) (local12.method7845() + local594);
				local590 = (short) (local12.method7845() + local582);
				local592 = (short) (local590 + local12.method7845());
				this.aShortArray115[local596] = local582;
				local594 = local592;
				this.aShortArray116[local596] = local590;
				this.aShortArray113[local596] = local592;
				if (local582 > this.anInt9031) {
					this.anInt9031 = local582;
				}
				if (local590 > this.anInt9031) {
					this.anInt9031 = local590;
				}
				if (local592 > this.anInt9031) {
					this.anInt9031 = local592;
				}
			}
			if (local601 == 2) {
				local590 = local592;
				local592 = (short) (local594 + local12.method7845());
				local594 = local592;
				this.aShortArray115[local596] = local582;
				this.aShortArray116[local596] = local590;
				this.aShortArray113[local596] = local592;
				if (local592 > this.anInt9031) {
					this.anInt9031 = local592;
				}
			}
			if (local601 == 3) {
				local582 = local592;
				local592 = (short) (local12.method7845() + local594);
				local594 = local592;
				this.aShortArray115[local596] = local582;
				this.aShortArray116[local596] = local590;
				this.aShortArray113[local596] = local592;
				if (local592 > this.anInt9031) {
					this.anInt9031 = local592;
				}
			}
			if (local601 == 4) {
				@Pc(766) short local766 = local582;
				local582 = local590;
				local592 = (short) (local12.method7845() + local594);
				local590 = local766;
				local594 = local592;
				this.aShortArray115[local596] = local582;
				this.aShortArray116[local596] = local766;
				this.aShortArray113[local596] = local592;
				if (this.anInt9031 < local592) {
					this.anInt9031 = local592;
				}
			}
		}
		local12.anInt9230 = local174;
		this.anInt9031++;
		for (local601 = 0; local601 < this.anInt9032; local601++) {
			this.aByteArray92[local601] = 0;
			this.aShortArray117[local601] = (short) local12.method7860();
			this.aShortArray111[local601] = (short) local12.method7860();
			this.aShortArray119[local601] = (short) local12.method7860();
		}
		if (this.aByteArray86 != null) {
			@Pc(861) boolean local861 = false;
			for (@Pc(863) int local863 = 0; local863 < this.anInt9034; local863++) {
				@Pc(871) int local871 = this.aByteArray86[local863] & 0xFF;
				if (local871 != 255) {
					if (this.aShortArray115[local863] == (this.aShortArray117[local871] & 0xFFFF) && (this.aShortArray111[local871] & 0xFFFF) == this.aShortArray116[local863] && (this.aShortArray119[local871] & 0xFFFF) == this.aShortArray113[local863]) {
						this.aByteArray86[local863] = -1;
					} else {
						local861 = true;
					}
				}
			}
			if (!local861) {
				this.aByteArray86 = null;
			}
		}
		if (!local5) {
			this.aByteArray90 = null;
		}
		if (!local7) {
			this.aShortArray118 = null;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)[[I")
	public int[][] method7681(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt9041 : this.anInt9031;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray502[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local27 > local10) {
					local10 = local27;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < local18; local81++) {
			@Pc(88) int local88 = this.anIntArray502[local81];
			if (local88 >= 0) {
				local54[local88][local8[local88]++] = local81;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(SSI)V")
	public void method7682(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray118 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt9034; local15++) {
			if (this.aShortArray118[local15] == arg0) {
				this.aShortArray118[local15] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZIII)I")
	public int method7683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(14) int local14 = 0; local14 < this.anInt9041; local14++) {
			if (arg0 == this.anIntArray508[local14] && arg1 == this.anIntArray503[local14] && this.anIntArray506[local14] == arg2) {
				return local14;
			}
		}
		this.anIntArray508[this.anInt9041] = arg0;
		this.anIntArray503[this.anInt9041] = arg1;
		this.anIntArray506[this.anInt9041] = arg2;
		this.anInt9031 = this.anInt9041 + 1;
		return this.anInt9041++;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIB)V")
	public void method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(15) int local15;
		@Pc(33) int local33;
		if (arg1 != 0) {
			local9 = Class200.anIntArray337[arg1];
			local13 = Class200.anIntArray338[arg1];
			for (local15 = 0; local15 < this.anInt9041; local15++) {
				local33 = local9 * this.anIntArray503[local15] + local13 * this.anIntArray508[local15] >> 14;
				this.anIntArray503[local15] = this.anIntArray503[local15] * local13 - this.anIntArray508[local15] * local9 >> 14;
				this.anIntArray508[local15] = local33;
			}
		}
		if (arg0 != 0) {
			local9 = Class200.anIntArray337[arg0];
			local13 = Class200.anIntArray338[arg0];
			for (local15 = 0; local15 < this.anInt9041; local15++) {
				local33 = local13 * this.anIntArray503[local15] - this.anIntArray506[local15] * local9 >> 14;
				this.anIntArray506[local15] = local9 * this.anIntArray503[local15] + this.anIntArray506[local15] * local13 >> 14;
				this.anIntArray503[local15] = local33;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local13 = Class200.anIntArray337[arg2];
		local15 = Class200.anIntArray338[arg2];
		for (local33 = 0; local33 < this.anInt9041; local33++) {
			@Pc(161) int local161 = this.anIntArray506[local33] * local13 + this.anIntArray508[local33] * local15 >> 14;
			this.anIntArray506[local33] = local15 * this.anIntArray506[local33] - this.anIntArray508[local33] * local13 >> 14;
			this.anIntArray508[local33] = local161;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!su;BSI)I")
	private int method7685(@OriginalArg(0) Class329 arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.anIntArray508[arg2];
		@Pc(13) int local13 = arg0.anIntArray503[arg2];
		@Pc(18) int local18 = arg0.anIntArray506[arg2];
		for (@Pc(20) int local20 = 0; local20 < this.anInt9041; local20++) {
			if (local8 == this.anIntArray508[local20] && this.anIntArray503[local20] == local13 && local18 == this.anIntArray506[local20]) {
				this.aShortArray110[local20] |= arg1;
				return local20;
			}
		}
		this.anIntArray508[this.anInt9041] = local8;
		this.anIntArray503[this.anInt9041] = local13;
		this.anIntArray506[this.anInt9041] = local18;
		this.aShortArray110[this.anInt9041] = arg1;
		this.anIntArray502[this.anInt9041] = arg0.anIntArray502 == null ? -1 : arg0.anIntArray502[arg2];
		return this.anInt9041++;
	}
}
