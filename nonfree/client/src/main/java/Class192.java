import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class192 {

	@OriginalMember(owner = "client!ju", name = "P", descriptor = "[Lclient!eia;")
	public Class106[] aClass106Array1;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!ju", name = "D", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!ju", name = "F", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!ju", name = "U", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!ju", name = "M", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!ju", name = "X", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!ju", name = "C", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "[Lclient!hja;")
	public Class161[] aClass161Array4;

	@OriginalMember(owner = "client!ju", name = "W", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!ju", name = "u", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!ju", name = "R", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "[Lclient!jk;")
	public Class189[] aClass189Array4;

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!ju", name = "T", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!ju", name = "Z", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!ju", name = "bb", descriptor = "[I")
	public int[] anIntArray286;

	@OriginalMember(owner = "client!ju", name = "Q", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!ju", name = "N", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "B")
	public byte aByte74 = 0;

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
	public int anInt5075 = 0;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public int anInt5082 = 0;

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
	public int anInt5083 = 0;

	@OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
	public int anInt5085 = 0;

	@OriginalMember(owner = "client!ju", name = "S", descriptor = "I")
	public int anInt5087 = 12;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
	private Class192() {
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "([B)V")
	public Class192(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4320(arg0);
		} else {
			this.method4328(arg0);
		}
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(III)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray41 = new byte[arg1];
		this.aByteArray42 = new byte[arg1];
		this.aByteArray37 = new byte[arg1];
		this.aByteArray40 = new byte[arg1];
		if (arg2 > 0) {
			this.anIntArray283 = new int[arg2];
			this.anIntArray277 = new int[arg2];
			this.anIntArray286 = new int[arg2];
			this.aShortArray70 = new short[arg2];
			this.anIntArray285 = new int[arg2];
			this.aShortArray75 = new short[arg2];
			this.anIntArray282 = new int[arg2];
			this.aByteArray38 = new byte[arg2];
			this.aByteArray39 = new byte[arg2];
			this.aShortArray73 = new short[arg2];
			this.anIntArray279 = new int[arg2];
			this.aByteArray43 = new byte[arg2];
		}
		this.aShortArray76 = new short[arg1];
		this.anIntArray280 = new int[arg0];
		this.aShortArray74 = new short[arg1];
		this.anIntArray281 = new int[arg0];
		this.aShortArray69 = new short[arg1];
		this.anIntArray276 = new int[arg0];
		this.anIntArray278 = new int[arg0];
		this.aShortArray72 = new short[arg1];
		this.anIntArray284 = new int[arg1];
		this.aShortArray77 = new short[arg1];
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "([Lclient!ju;I)V")
	public Class192(@OriginalArg(0) Class192[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5082 = 0;
		this.anInt5085 = 0;
		this.anInt5083 = 0;
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
			@Pc(61) Class192 local61 = arg0[local53];
			if (local61 != null) {
				this.anInt5082 += local61.anInt5082;
				this.anInt5085 += local61.anInt5085;
				this.anInt5083 += local61.anInt5083;
				if (local61.aClass189Array4 != null) {
					local32 += local61.aClass189Array4.length;
				}
				if (local61.aClass161Array4 != null) {
					local34 += local61.aClass161Array4.length;
				}
				if (local61.aClass106Array1 != null) {
					local36 += local61.aClass106Array1.length;
				}
				local38 |= local61.aByteArray40 != null;
				local46 |= local61.aShortArray74 != null;
				local48 |= local61.anIntArray284 != null;
				local42 |= local61.aByteArray37 != null;
				if (local61.aByteArray42 == null) {
					if (this.aByte74 == -1) {
						this.aByte74 = local61.aByte74;
					}
					if (local61.aByte74 != this.aByte74) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local61.aByteArray41 != null;
			}
		}
		this.aShortArray69 = new short[this.anInt5085];
		this.aShortArray78 = new short[this.anInt5083];
		if (local38) {
			this.aByteArray40 = new byte[this.anInt5085];
		}
		this.aShortArray72 = new short[this.anInt5085];
		if (local32 > 0) {
			this.aClass189Array4 = new Class189[local32];
		}
		if (local46) {
			this.aShortArray74 = new short[this.anInt5085];
		}
		this.anIntArray276 = new int[this.anInt5083];
		if (local36 > 0) {
			this.aClass106Array1 = new Class106[local36];
		}
		if (this.anInt5082 > 0) {
			this.aShortArray75 = new short[this.anInt5082];
			this.anIntArray283 = new int[this.anInt5082];
			this.anIntArray285 = new int[this.anInt5082];
			this.aShortArray73 = new short[this.anInt5082];
			this.anIntArray277 = new int[this.anInt5082];
			this.aShortArray70 = new short[this.anInt5082];
			this.anIntArray286 = new int[this.anInt5082];
			this.anIntArray279 = new int[this.anInt5082];
			this.anIntArray282 = new int[this.anInt5082];
			this.aByteArray39 = new byte[this.anInt5082];
			this.aByteArray43 = new byte[this.anInt5082];
			this.aByteArray38 = new byte[this.anInt5082];
		}
		this.anIntArray278 = new int[this.anInt5083];
		this.anIntArray280 = new int[this.anInt5083];
		if (local34 > 0) {
			this.aClass161Array4 = new Class161[local34];
		}
		this.aShortArray71 = new short[this.anInt5085];
		this.anIntArray281 = new int[this.anInt5083];
		this.aShortArray77 = new short[this.anInt5085];
		if (local42) {
			this.aByteArray37 = new byte[this.anInt5085];
		}
		if (local48) {
			this.anIntArray284 = new int[this.anInt5085];
		}
		if (local40) {
			this.aByteArray42 = new byte[this.anInt5085];
		}
		if (local44) {
			this.aByteArray41 = new byte[this.anInt5085];
		}
		this.aShortArray76 = new short[this.anInt5085];
		this.anInt5083 = 0;
		this.anInt5082 = 0;
		local34 = 0;
		this.anInt5085 = 0;
		local36 = 0;
		local32 = 0;
		@Pc(687) int local687;
		@Pc(698) int local698;
		for (@Pc(417) int local417 = 0; local417 < arg1; local417++) {
			@Pc(424) short local424 = (short) (0x1 << local417);
			@Pc(428) Class192 local428 = arg0[local417];
			if (local428 != null) {
				@Pc(437) int local437;
				if (local428.aClass106Array1 != null) {
					for (local437 = 0; local437 < local428.aClass106Array1.length; local437++) {
						@Pc(444) Class106 local444 = local428.aClass106Array1[local437];
						this.aClass106Array1[local36++] = local444.method1966(local444.anInt2265 + this.anInt5085);
					}
				}
				for (local437 = 0; local437 < local428.anInt5085; local437++) {
					if (local38 && local428.aByteArray40 != null) {
						this.aByteArray40[this.anInt5085] = local428.aByteArray40[local437];
					}
					if (local40) {
						if (local428.aByteArray42 == null) {
							this.aByteArray42[this.anInt5085] = local428.aByte74;
						} else {
							this.aByteArray42[this.anInt5085] = local428.aByteArray42[local437];
						}
					}
					if (local42 && local428.aByteArray37 != null) {
						this.aByteArray37[this.anInt5085] = local428.aByteArray37[local437];
					}
					if (local46) {
						if (local428.aShortArray74 == null) {
							this.aShortArray74[this.anInt5085] = -1;
						} else {
							this.aShortArray74[this.anInt5085] = local428.aShortArray74[local437];
						}
					}
					if (local48) {
						if (local428.anIntArray284 == null) {
							this.anIntArray284[this.anInt5085] = -1;
						} else {
							this.anIntArray284[this.anInt5085] = local428.anIntArray284[local437];
						}
					}
					this.aShortArray72[this.anInt5085] = (short) this.method4331(local428, local424, local428.aShortArray72[local437]);
					this.aShortArray77[this.anInt5085] = (short) this.method4331(local428, local424, local428.aShortArray77[local437]);
					this.aShortArray69[this.anInt5085] = (short) this.method4331(local428, local424, local428.aShortArray69[local437]);
					this.aShortArray71[this.anInt5085] = local424;
					this.aShortArray76[this.anInt5085] = local428.aShortArray76[local437];
					this.anInt5085++;
				}
				@Pc(674) int local674;
				if (local428.aClass189Array4 != null) {
					for (local674 = 0; local674 < local428.aClass189Array4.length; local674++) {
						local687 = this.method4331(local428, local424, local428.aClass189Array4[local674].anInt4891);
						local698 = this.method4331(local428, local424, local428.aClass189Array4[local674].anInt4885);
						@Pc(709) int local709 = this.method4331(local428, local424, local428.aClass189Array4[local674].anInt4901);
						this.aClass189Array4[local32] = local428.aClass189Array4[local674].method4152(local687, local709, local698);
						local32++;
					}
				}
				if (local428.aClass161Array4 != null) {
					for (local674 = 0; local674 < local428.aClass161Array4.length; local674++) {
						local687 = this.method4331(local428, local424, local428.aClass161Array4[local674].anInt3680);
						this.aClass161Array4[local34] = local428.aClass161Array4[local674].method3221(local687);
						local34++;
					}
				}
			}
		}
		this.anInt5075 = this.anInt5083;
		@Pc(787) int local787 = 0;
		for (@Pc(789) int local789 = 0; local789 < arg1; local789++) {
			@Pc(798) short local798 = (short) (0x1 << local789);
			@Pc(802) Class192 local802 = arg0[local789];
			if (local802 != null) {
				for (local687 = 0; local687 < local802.anInt5085; local687++) {
					if (local44) {
						this.aByteArray41[local787++] = (byte) (local802.aByteArray41 == null || local802.aByteArray41[local687] == -1 ? -1 : this.anInt5082 + local802.aByteArray41[local687]);
					}
				}
				for (local698 = 0; local698 < local802.anInt5082; local698++) {
					@Pc(868) byte local868 = this.aByteArray43[this.anInt5082] = local802.aByteArray43[local698];
					if (local868 == 0) {
						this.aShortArray75[this.anInt5082] = (short) this.method4331(local802, local798, local802.aShortArray75[local698]);
						this.aShortArray70[this.anInt5082] = (short) this.method4331(local802, local798, local802.aShortArray70[local698]);
						this.aShortArray73[this.anInt5082] = (short) this.method4331(local802, local798, local802.aShortArray73[local698]);
					}
					if (local868 >= 1 && local868 <= 3) {
						this.aShortArray75[this.anInt5082] = local802.aShortArray75[local698];
						this.aShortArray70[this.anInt5082] = local802.aShortArray70[local698];
						this.aShortArray73[this.anInt5082] = local802.aShortArray73[local698];
						this.anIntArray279[this.anInt5082] = local802.anIntArray279[local698];
						this.anIntArray283[this.anInt5082] = local802.anIntArray283[local698];
						this.anIntArray277[this.anInt5082] = local802.anIntArray277[local698];
						this.aByteArray38[this.anInt5082] = local802.aByteArray38[local698];
						this.aByteArray39[this.anInt5082] = local802.aByteArray39[local698];
						this.anIntArray285[this.anInt5082] = local802.anIntArray285[local698];
					}
					if (local868 == 2) {
						this.anIntArray282[this.anInt5082] = local802.anIntArray282[local698];
						this.anIntArray286[this.anInt5082] = local802.anIntArray286[local698];
					}
					this.anInt5082++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)V")
	public void method4319() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5083; local7++) {
			this.anIntArray278[local7] <<= 0x2;
			this.anIntArray280[local7] <<= 0x2;
			this.anIntArray281[local7] <<= 0x2;
		}
		if (-1041 != -1041 || (this.anInt5082 <= 0 || this.anIntArray279 == null)) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < this.anIntArray279.length; local62++) {
			this.anIntArray279[local62] <<= 0x2;
			this.anIntArray283[local62] <<= 0x2;
			if (this.aByteArray43[local62] != 1) {
				this.anIntArray277[local62] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([BB)V")
	private void method4320(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class5_Sub23 local10 = new Class5_Sub23(arg0);
		@Pc(15) Class5_Sub23 local15 = new Class5_Sub23(arg0);
		@Pc(20) Class5_Sub23 local20 = new Class5_Sub23(arg0);
		@Pc(25) Class5_Sub23 local25 = new Class5_Sub23(arg0);
		@Pc(30) Class5_Sub23 local30 = new Class5_Sub23(arg0);
		@Pc(35) Class5_Sub23 local35 = new Class5_Sub23(arg0);
		@Pc(40) Class5_Sub23 local40 = new Class5_Sub23(arg0);
		local10.anInt9869 = arg0.length - 23;
		this.anInt5083 = local10.method8519();
		this.anInt5085 = local10.method8519();
		this.anInt5082 = local10.method8529();
		@Pc(65) int local65 = local10.method8529();
		@Pc(75) boolean local75 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(99) boolean local99 = (local65 & 0x4) == 4;
		@Pc(109) boolean local109 = (local65 & 0x8) == 8;
		if (local109) {
			local10.anInt9869 -= 7;
			this.anInt5087 = local10.method8529();
			local10.anInt9869 += 6;
		}
		@Pc(134) int local134 = local10.method8529();
		@Pc(138) int local138 = local10.method8529();
		@Pc(142) int local142 = local10.method8529();
		@Pc(146) int local146 = local10.method8529();
		@Pc(150) int local150 = local10.method8529();
		@Pc(154) int local154 = local10.method8519();
		@Pc(158) int local158 = local10.method8519();
		@Pc(162) int local162 = local10.method8519();
		@Pc(166) int local166 = local10.method8519();
		@Pc(170) int local170 = local10.method8519();
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(189) int local189;
		if (this.anInt5082 > 0) {
			local10.anInt9869 = 0;
			this.aByteArray43 = new byte[this.anInt5082];
			for (local189 = 0; local189 < this.anInt5082; local189++) {
				@Pc(200) byte local200 = this.aByteArray43[local189] = local10.method8488();
				if (local200 == 0) {
					local172++;
				}
				if (local200 >= 1 && local200 <= 3) {
					local174++;
				}
				if (local200 == 2) {
					local176++;
				}
			}
		}
		local189 = this.anInt5082;
		@Pc(236) int local236 = local189;
		local189 += this.anInt5083;
		@Pc(243) int local243 = local189;
		if (local75) {
			local189 += this.anInt5085;
		}
		@Pc(256) int local256 = local189;
		local189 += this.anInt5085;
		@Pc(263) int local263 = local189;
		if (local134 == 255) {
			local189 += this.anInt5085;
		}
		@Pc(273) int local273 = local189;
		if (local142 == 1) {
			local189 += this.anInt5085;
		}
		@Pc(283) int local283 = local189;
		if (local150 == 1) {
			local189 += this.anInt5083;
		}
		@Pc(300) int local300 = local189;
		if (local138 == 1) {
			local189 += this.anInt5085;
		}
		@Pc(312) int local312 = local189;
		local189 += local166;
		@Pc(318) int local318 = local189;
		if (local146 == 1) {
			local189 += this.anInt5085 * 2;
		}
		@Pc(332) int local332 = local189;
		local189 += local170;
		@Pc(338) int local338 = local189;
		local189 += this.anInt5085 * 2;
		@Pc(347) int local347 = local189;
		local189 += local154;
		@Pc(353) int local353 = local189;
		local189 += local158;
		@Pc(359) int local359 = local189;
		local189 += local162;
		@Pc(365) int local365 = local189;
		local189 += local172 * 6;
		@Pc(373) int local373 = local189;
		local189 += local174 * 6;
		@Pc(381) byte local381 = 6;
		if (this.anInt5087 == 14) {
			local381 = 7;
		} else if (this.anInt5087 >= 15) {
			local381 = 9;
		}
		@Pc(401) int local401 = local189;
		local189 += local174 * local381;
		@Pc(409) int local409 = local189;
		local189 += local174;
		@Pc(415) int local415 = local189;
		local189 += local174;
		@Pc(421) int local421 = local189;
		local189 += local176 * 2 + local174;
		if (local150 == 1) {
			this.anIntArray276 = new int[this.anInt5083];
		}
		if (local146 == 1) {
			this.aShortArray74 = new short[this.anInt5085];
		}
		if (local146 == 1 && this.anInt5082 > 0) {
			this.aByteArray41 = new byte[this.anInt5085];
		}
		if (local138 == 1) {
			this.aByteArray37 = new byte[this.anInt5085];
		}
		this.aShortArray69 = new short[this.anInt5085];
		this.anIntArray281 = new int[this.anInt5083];
		this.aShortArray76 = new short[this.anInt5085];
		local10.anInt9869 = local236;
		if (local134 == 255) {
			this.aByteArray42 = new byte[this.anInt5085];
		} else {
			this.aByte74 = (byte) local134;
		}
		this.aShortArray72 = new short[this.anInt5085];
		if (local142 == 1) {
			this.anIntArray284 = new int[this.anInt5085];
		}
		this.aShortArray77 = new short[this.anInt5085];
		if (this.anInt5082 > 0) {
			this.aShortArray70 = new short[this.anInt5082];
			this.aShortArray73 = new short[this.anInt5082];
			this.aShortArray75 = new short[this.anInt5082];
			if (local176 > 0) {
				this.anIntArray282 = new int[local176];
				this.anIntArray286 = new int[local176];
			}
			if (local174 > 0) {
				this.anIntArray277 = new int[local174];
				this.anIntArray279 = new int[local174];
				this.aByteArray39 = new byte[local174];
				this.anIntArray283 = new int[local174];
				this.aByteArray38 = new byte[local174];
				this.anIntArray285 = new int[local174];
			}
		}
		if (local75) {
			this.aByteArray40 = new byte[this.anInt5085];
		}
		this.anIntArray278 = new int[this.anInt5083];
		this.anIntArray280 = new int[this.anInt5083];
		local15.anInt9869 = local347;
		local20.anInt9869 = local353;
		local25.anInt9869 = local359;
		local30.anInt9869 = local283;
		@Pc(640) int local640 = 0;
		@Pc(642) int local642 = 0;
		@Pc(644) int local644 = 0;
		@Pc(652) int local652;
		for (@Pc(646) int local646 = 0; local646 < this.anInt5083; local646++) {
			local652 = local10.method8529();
			@Pc(654) int local654 = 0;
			if ((local652 & 0x1) != 0) {
				local654 = local15.method8481();
			}
			@Pc(667) int local667 = 0;
			if ((local652 & 0x2) != 0) {
				local667 = local20.method8481();
			}
			@Pc(680) int local680 = 0;
			if ((local652 & 0x4) != 0) {
				local680 = local25.method8481();
			}
			this.anIntArray278[local646] = local654 + local640;
			this.anIntArray280[local646] = local667 + local642;
			this.anIntArray281[local646] = local644 + local680;
			local644 = this.anIntArray281[local646];
			local642 = this.anIntArray280[local646];
			local640 = this.anIntArray278[local646];
			if (local150 == 1) {
				this.anIntArray276[local646] = local30.method8529();
			}
		}
		local10.anInt9869 = local338;
		local15.anInt9869 = local243;
		local20.anInt9869 = local263;
		local25.anInt9869 = local300;
		local30.anInt9869 = local273;
		local35.anInt9869 = local318;
		local40.anInt9869 = local332;
		for (local652 = 0; local652 < this.anInt5085; local652++) {
			this.aShortArray76[local652] = (short) local10.method8519();
			if (local75) {
				this.aByteArray40[local652] = local15.method8488();
			}
			if (local134 == 255) {
				this.aByteArray42[local652] = local20.method8488();
			}
			if (local138 == 1) {
				this.aByteArray37[local652] = local25.method8488();
			}
			if (local142 == 1) {
				this.anIntArray284[local652] = local30.method8529();
			}
			if (local146 == 1) {
				this.aShortArray74[local652] = (short) (local35.method8519() - 1);
			}
			if (this.aByteArray41 != null) {
				if (this.aShortArray74[local652] == -1) {
					this.aByteArray41[local652] = -1;
				} else {
					this.aByteArray41[local652] = (byte) (local40.method8529() - 1);
				}
			}
		}
		this.anInt5075 = -1;
		local10.anInt9869 = local312;
		local15.anInt9869 = local256;
		@Pc(900) short local900 = 0;
		@Pc(902) short local902 = 0;
		@Pc(904) short local904 = 0;
		@Pc(906) short local906 = 0;
		@Pc(916) int local916;
		for (@Pc(908) int local908 = 0; local908 < this.anInt5085; local908++) {
			local916 = local15.method8529();
			if (local916 == 1) {
				local900 = (short) (local906 + local10.method8481());
				local902 = (short) (local10.method8481() + local900);
				local904 = (short) (local902 + local10.method8481());
				this.aShortArray72[local908] = local900;
				local906 = local904;
				this.aShortArray77[local908] = local902;
				this.aShortArray69[local908] = local904;
				if (this.anInt5075 < local900) {
					this.anInt5075 = local900;
				}
				if (this.anInt5075 < local902) {
					this.anInt5075 = local902;
				}
				if (this.anInt5075 < local904) {
					this.anInt5075 = local904;
				}
			}
			if (local916 == 2) {
				local902 = local904;
				local904 = (short) (local906 + local10.method8481());
				this.aShortArray72[local908] = local900;
				local906 = local904;
				this.aShortArray77[local908] = local902;
				this.aShortArray69[local908] = local904;
				if (this.anInt5075 < local904) {
					this.anInt5075 = local904;
				}
			}
			if (local916 == 3) {
				local900 = local904;
				local904 = (short) (local10.method8481() + local906);
				local906 = local904;
				this.aShortArray72[local908] = local900;
				this.aShortArray77[local908] = local902;
				this.aShortArray69[local908] = local904;
				if (local904 > this.anInt5075) {
					this.anInt5075 = local904;
				}
			}
			if (local916 == 4) {
				@Pc(1083) short local1083 = local900;
				local900 = local902;
				local904 = (short) (local10.method8481() + local906);
				local902 = local1083;
				local906 = local904;
				this.aShortArray72[local908] = local900;
				this.aShortArray77[local908] = local1083;
				this.aShortArray69[local908] = local904;
				if (local904 > this.anInt5075) {
					this.anInt5075 = local904;
				}
			}
		}
		local10.anInt9869 = local365;
		this.anInt5075++;
		local15.anInt9869 = local373;
		local20.anInt9869 = local401;
		local25.anInt9869 = local409;
		local30.anInt9869 = local415;
		local35.anInt9869 = local421;
		@Pc(1168) int local1168;
		for (local916 = 0; local916 < this.anInt5082; local916++) {
			local1168 = this.aByteArray43[local916] & 0xFF;
			if (local1168 == 0) {
				this.aShortArray75[local916] = (short) local10.method8519();
				this.aShortArray70[local916] = (short) local10.method8519();
				this.aShortArray73[local916] = (short) local10.method8519();
			}
			if (local1168 == 1) {
				this.aShortArray75[local916] = (short) local15.method8519();
				this.aShortArray70[local916] = (short) local15.method8519();
				this.aShortArray73[local916] = (short) local15.method8519();
				if (this.anInt5087 >= 15) {
					this.anIntArray279[local916] = local20.method8510();
					this.anIntArray283[local916] = local20.method8510();
					this.anIntArray277[local916] = local20.method8510();
				} else {
					this.anIntArray279[local916] = local20.method8519();
					if (this.anInt5087 < 14) {
						this.anIntArray283[local916] = local20.method8519();
					} else {
						this.anIntArray283[local916] = local20.method8510();
					}
					this.anIntArray277[local916] = local20.method8519();
				}
				this.aByteArray38[local916] = local25.method8488();
				this.aByteArray39[local916] = local30.method8488();
				this.anIntArray285[local916] = local35.method8488();
			}
			if (local1168 == 2) {
				this.aShortArray75[local916] = (short) local15.method8519();
				this.aShortArray70[local916] = (short) local15.method8519();
				this.aShortArray73[local916] = (short) local15.method8519();
				if (this.anInt5087 < 15) {
					this.anIntArray279[local916] = local20.method8519();
					if (this.anInt5087 >= 14) {
						this.anIntArray283[local916] = local20.method8510();
					} else {
						this.anIntArray283[local916] = local20.method8519();
					}
					this.anIntArray277[local916] = local20.method8519();
				} else {
					this.anIntArray279[local916] = local20.method8510();
					this.anIntArray283[local916] = local20.method8510();
					this.anIntArray277[local916] = local20.method8510();
				}
				this.aByteArray38[local916] = local25.method8488();
				this.aByteArray39[local916] = local30.method8488();
				this.anIntArray285[local916] = local35.method8488();
				this.anIntArray282[local916] = local35.method8488();
				this.anIntArray286[local916] = local35.method8488();
			}
			if (local1168 == 3) {
				this.aShortArray75[local916] = (short) local15.method8519();
				this.aShortArray70[local916] = (short) local15.method8519();
				this.aShortArray73[local916] = (short) local15.method8519();
				if (this.anInt5087 < 15) {
					this.anIntArray279[local916] = local20.method8519();
					if (this.anInt5087 < 14) {
						this.anIntArray283[local916] = local20.method8519();
					} else {
						this.anIntArray283[local916] = local20.method8510();
					}
					this.anIntArray277[local916] = local20.method8519();
				} else {
					this.anIntArray279[local916] = local20.method8510();
					this.anIntArray283[local916] = local20.method8510();
					this.anIntArray277[local916] = local20.method8510();
				}
				this.aByteArray38[local916] = local25.method8488();
				this.aByteArray39[local916] = local30.method8488();
				this.anIntArray285[local916] = local35.method8488();
			}
		}
		local10.anInt9869 = local189;
		@Pc(1617) int local1617;
		@Pc(1625) int local1625;
		@Pc(1629) int local1629;
		@Pc(1698) int local1698;
		if (local87) {
			local1168 = local10.method8529();
			if (local1168 > 0) {
				this.aClass189Array4 = new Class189[local1168];
				for (local1617 = 0; local1617 < local1168; local1617++) {
					local1625 = local10.method8519();
					local1629 = local10.method8519();
					@Pc(1637) byte local1637;
					if (local134 == 255) {
						local1637 = this.aByteArray42[local1629];
					} else {
						local1637 = (byte) local134;
					}
					this.aClass189Array4[local1617] = new Class189(local1625, this.aShortArray72[local1629], this.aShortArray77[local1629], this.aShortArray69[local1629], local1637);
				}
			}
			local1617 = local10.method8529();
			if (local1617 > 0) {
				this.aClass161Array4 = new Class161[local1617];
				for (local1625 = 0; local1625 < local1617; local1625++) {
					local1629 = local10.method8519();
					local1698 = local10.method8519();
					this.aClass161Array4[local1625] = new Class161(local1629, local1698);
				}
			}
		}
		if (!local99) {
			return;
		}
		local1168 = local10.method8529();
		if (local1168 <= 0) {
			return;
		}
		this.aClass106Array1 = new Class106[local1168];
		for (local1617 = 0; local1617 < local1168; local1617++) {
			local1625 = local10.method8519();
			local1629 = local10.method8519();
			local1698 = local10.method8529();
			@Pc(1745) byte local1745 = local10.method8488();
			this.aClass106Array1[local1617] = new Class106(local1625, local1629, local1698, local1745);
		}
		return;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(SSB)V")
	public void method4321(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray74 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt5085; local20++) {
			if (this.aShortArray74[local20] == arg0) {
				this.aShortArray74[local20] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBII)I")
	public int method4322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5083; local15++) {
			if (this.anIntArray278[local15] == arg2 && arg0 == this.anIntArray280[local15] && arg1 == this.anIntArray281[local15]) {
				return local15;
			}
		}
		this.anIntArray278[this.anInt5083] = arg2;
		this.anIntArray280[this.anInt5083] = arg0;
		this.anIntArray281[this.anInt5083] = arg1;
		this.anInt5075 = this.anInt5083 + 1;
		return this.anInt5083++;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)[[I")
	public int[][] method4323() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass106Array1.length; local12++) {
			@Pc(22) int local22 = this.aClass106Array1[local12].anInt2270;
			if (local22 >= 0) {
				@Pc(31) int local31 = local8[local22]++;
				if (local10 < local22) {
					local10 = local22;
				}
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		if (-83 != -83) {
			this.method4322(-29, 65, 108);
		}
		for (@Pc(68) int local68 = 0; local68 <= local10; local68++) {
			local52[local68] = new int[local8[local68]];
			local8[local68] = 0;
		}
		for (@Pc(89) int local89 = 0; local89 < this.aClass106Array1.length; local89++) {
			@Pc(99) int local99 = this.aClass106Array1[local89].anInt2270;
			if (local99 >= 0) {
				local52[local99][local8[local99]++] = local89;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)[[I")
	public int[][] method4325() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5085; local20++) {
			@Pc(29) int local29 = this.anIntArray284[local20];
			if (local29 >= 0) {
				if (local29 > local10) {
					local10 = local29;
				}
				@Pc(46) int local46 = local8[local29]++;
			}
		}
		@Pc(63) int[][] local63 = new int[local10 + 1][];
		for (@Pc(67) int local67 = 0; local67 <= local10; local67++) {
			local63[local67] = new int[local8[local67]];
			local8[local67] = 0;
		}
		for (@Pc(88) int local88 = 0; local88 < this.anInt5085; local88++) {
			@Pc(97) int local97 = this.anIntArray284[local88];
			if (local97 >= 0) {
				local63[local97][local8[local97]++] = local88;
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BBBBSISII)I")
	public int method4327(@OriginalArg(1) byte arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray72[this.anInt5085] = (short) arg4;
		this.aShortArray77[this.anInt5085] = (short) arg7;
		this.aShortArray69[this.anInt5085] = (short) arg6;
		this.aByteArray40[this.anInt5085] = arg2;
		this.aByteArray41[this.anInt5085] = arg1;
		this.aShortArray76[this.anInt5085] = arg3;
		this.aByteArray37[this.anInt5085] = arg0;
		this.aShortArray74[this.anInt5085] = arg5;
		return this.anInt5085++;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([BI)V")
	private void method4328(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class5_Sub23 local14 = new Class5_Sub23(arg0);
		@Pc(19) Class5_Sub23 local19 = new Class5_Sub23(arg0);
		@Pc(24) Class5_Sub23 local24 = new Class5_Sub23(arg0);
		@Pc(29) Class5_Sub23 local29 = new Class5_Sub23(arg0);
		@Pc(34) Class5_Sub23 local34 = new Class5_Sub23(arg0);
		local14.anInt9869 = arg0.length - 18;
		this.anInt5083 = local14.method8519();
		this.anInt5085 = local14.method8519();
		this.anInt5082 = local14.method8529();
		@Pc(59) int local59 = local14.method8529();
		@Pc(63) int local63 = local14.method8529();
		@Pc(67) int local67 = local14.method8529();
		@Pc(71) int local71 = local14.method8529();
		@Pc(75) int local75 = local14.method8529();
		@Pc(79) int local79 = local14.method8519();
		@Pc(83) int local83 = local14.method8519();
		@Pc(87) int local87 = local14.method8519();
		@Pc(91) int local91 = local14.method8519();
		@Pc(100) int local100 = this.anInt5083;
		@Pc(102) int local102 = local100;
		local100 += this.anInt5085;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt5085;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt5085;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt5085;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt5083;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt5085;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt5085 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt5082 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		this.aShortArray77 = new short[this.anInt5085];
		if (local75 == 1) {
			this.anIntArray276 = new int[this.anInt5083];
		}
		if (local59 == 1) {
			this.aShortArray74 = new short[this.anInt5085];
			this.aByteArray40 = new byte[this.anInt5085];
			this.aByteArray41 = new byte[this.anInt5085];
		}
		this.anIntArray281 = new int[this.anInt5083];
		this.anIntArray280 = new int[this.anInt5083];
		this.aShortArray69 = new short[this.anInt5085];
		this.aShortArray76 = new short[this.anInt5085];
		if (local63 == 255) {
			this.aByteArray42 = new byte[this.anInt5085];
		} else {
			this.aByte74 = (byte) local63;
		}
		if (this.anInt5082 > 0) {
			this.aShortArray70 = new short[this.anInt5082];
			this.aShortArray75 = new short[this.anInt5082];
			this.aShortArray73 = new short[this.anInt5082];
			this.aByteArray43 = new byte[this.anInt5082];
		}
		if (local67 == 1) {
			this.aByteArray37 = new byte[this.anInt5085];
		}
		this.anIntArray278 = new int[this.anInt5083];
		if (local71 == 1) {
			this.anIntArray284 = new int[this.anInt5085];
		}
		local14.anInt9869 = 0;
		this.aShortArray72 = new short[this.anInt5085];
		local19.anInt9869 = local187;
		local24.anInt9869 = local193;
		local29.anInt9869 = local100;
		local34.anInt9869 = local143;
		@Pc(364) int local364 = 0;
		@Pc(366) int local366 = 0;
		@Pc(368) int local368 = 0;
		@Pc(376) int local376;
		@Pc(378) int local378;
		for (@Pc(370) int local370 = 0; local370 < this.anInt5083; local370++) {
			local376 = local14.method8529();
			local378 = 0;
			if ((local376 & 0x1) != 0) {
				local378 = local19.method8481();
			}
			@Pc(391) int local391 = 0;
			if ((local376 & 0x2) != 0) {
				local391 = local24.method8481();
			}
			@Pc(404) int local404 = 0;
			if ((local376 & 0x4) != 0) {
				local404 = local29.method8481();
			}
			this.anIntArray278[local370] = local364 + local378;
			this.anIntArray280[local370] = local391 + local366;
			this.anIntArray281[local370] = local404 + local368;
			local368 = this.anIntArray281[local370];
			local366 = this.anIntArray280[local370];
			local364 = this.anIntArray278[local370];
			if (local75 == 1) {
				this.anIntArray276[local370] = local34.method8529();
			}
		}
		local14.anInt9869 = local169;
		local19.anInt9869 = local133;
		local24.anInt9869 = local109;
		local29.anInt9869 = local153;
		local34.anInt9869 = local121;
		for (local376 = 0; local376 < this.anInt5085; local376++) {
			this.aShortArray76[local376] = (short) local14.method8519();
			if (local59 == 1) {
				local378 = local19.method8529();
				if ((local378 & 0x1) == 1) {
					this.aByteArray40[local376] = 1;
					local7 = true;
				} else {
					this.aByteArray40[local376] = 0;
				}
				if ((local378 & 0x2) == 2) {
					this.aByteArray41[local376] = (byte) (local378 >> 2);
					this.aShortArray74[local376] = this.aShortArray76[local376];
					this.aShortArray76[local376] = 127;
					if (this.aShortArray74[local376] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray41[local376] = -1;
					this.aShortArray74[local376] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray42[local376] = local24.method8488();
			}
			if (local67 == 1) {
				this.aByteArray37[local376] = local29.method8488();
			}
			if (local71 == 1) {
				this.anIntArray284[local376] = local34.method8529();
			}
		}
		local14.anInt9869 = local163;
		this.anInt5075 = -1;
		local19.anInt9869 = local102;
		@Pc(630) short local630 = 0;
		@Pc(632) short local632 = 0;
		@Pc(634) short local634 = 0;
		@Pc(636) short local636 = 0;
		@Pc(646) int local646;
		for (@Pc(638) int local638 = 0; local638 < this.anInt5085; local638++) {
			local646 = local19.method8529();
			if (local646 == 1) {
				local630 = (short) (local14.method8481() + local636);
				local632 = (short) (local630 + local14.method8481());
				local634 = (short) (local14.method8481() + local632);
				local636 = local634;
				this.aShortArray72[local638] = local630;
				this.aShortArray77[local638] = local632;
				this.aShortArray69[local638] = local634;
				if (this.anInt5075 < local630) {
					this.anInt5075 = local630;
				}
				if (local632 > this.anInt5075) {
					this.anInt5075 = local632;
				}
				if (this.anInt5075 < local634) {
					this.anInt5075 = local634;
				}
			}
			if (local646 == 2) {
				local632 = local634;
				local634 = (short) (local636 + local14.method8481());
				this.aShortArray72[local638] = local630;
				local636 = local634;
				this.aShortArray77[local638] = local632;
				this.aShortArray69[local638] = local634;
				if (this.anInt5075 < local634) {
					this.anInt5075 = local634;
				}
			}
			if (local646 == 3) {
				local630 = local634;
				local634 = (short) (local636 + local14.method8481());
				this.aShortArray72[local638] = local630;
				local636 = local634;
				this.aShortArray77[local638] = local632;
				this.aShortArray69[local638] = local634;
				if (local634 > this.anInt5075) {
					this.anInt5075 = local634;
				}
			}
			if (local646 == 4) {
				@Pc(817) short local817 = local630;
				local630 = local632;
				local634 = (short) (local14.method8481() + local636);
				local632 = local817;
				local636 = local634;
				this.aShortArray72[local638] = local630;
				this.aShortArray77[local638] = local817;
				this.aShortArray69[local638] = local634;
				if (this.anInt5075 < local634) {
					this.anInt5075 = local634;
				}
			}
		}
		local14.anInt9869 = local178;
		this.anInt5075++;
		for (local646 = 0; local646 < this.anInt5082; local646++) {
			this.aByteArray43[local646] = 0;
			this.aShortArray75[local646] = (short) local14.method8519();
			this.aShortArray70[local646] = (short) local14.method8519();
			this.aShortArray73[local646] = (short) local14.method8519();
		}
		if (this.aByteArray41 != null) {
			@Pc(923) boolean local923 = false;
			for (@Pc(925) int local925 = 0; local925 < this.anInt5085; local925++) {
				@Pc(936) int local936 = this.aByteArray41[local925] & 0xFF;
				if (local936 != 255) {
					if (this.aShortArray72[local925] == (this.aShortArray75[local936] & 0xFFFF) && (this.aShortArray70[local936] & 0xFFFF) == this.aShortArray77[local925] && (this.aShortArray73[local936] & 0xFFFF) == this.aShortArray69[local925]) {
						this.aByteArray41[local925] = -1;
					} else {
						local923 = true;
					}
				}
			}
			if (!local923) {
				this.aByteArray41 = null;
			}
		}
		if (!local7) {
			this.aByteArray40 = null;
		}
		if (!local9) {
			this.aShortArray74 = null;
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(ZI)[[I")
	public int[][] method4329(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(19) int local19 = arg0 ? this.anInt5083 : this.anInt5075;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(30) int local30 = this.anIntArray276[local21];
			if (local30 >= 0) {
				if (local30 > local10) {
					local10 = local30;
				}
				@Pc(50) int local50 = local8[local30]++;
			}
		}
		@Pc(62) int[][] local62 = new int[local10 + 1][];
		if (17106 != 17106) {
			this.anIntArray285 = null;
		}
		for (@Pc(74) int local74 = 0; local74 <= local10; local74++) {
			local62[local74] = new int[local8[local74]];
			local8[local74] = 0;
		}
		for (@Pc(95) int local95 = 0; local95 < local19; local95++) {
			@Pc(104) int local104 = this.anIntArray276[local95];
			if (local104 >= 0) {
				local62[local104][local8[local104]++] = local95;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ISS)V")
	public void method4330(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5085; local3++) {
			if (this.aShortArray76[local3] == arg1) {
				this.aShortArray76[local3] = arg0;
			}
		}
		if (24133 != 24133) {
			this.method4331((Class192) null, (short) 100, 125);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZLclient!ju;SI)I")
	private int method4331(@OriginalArg(1) Class192 arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray278[arg2];
		@Pc(15) int local15 = arg0.anIntArray280[arg2];
		@Pc(20) int local20 = arg0.anIntArray281[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5083; local22++) {
			if (local10 == this.anIntArray278[local22] && local15 == this.anIntArray280[local22] && local20 == this.anIntArray281[local22]) {
				this.aShortArray78[local22] |= arg1;
				return local22;
			}
		}
		if (false) {
			this.aByteArray41 = null;
		}
		this.anIntArray278[this.anInt5083] = local10;
		this.anIntArray280[this.anInt5083] = local15;
		this.anIntArray281[this.anInt5083] = local20;
		this.aShortArray78[this.anInt5083] = arg1;
		this.anIntArray276[this.anInt5083] = arg0.anIntArray276 == null ? -1 : arg0.anIntArray276[arg2];
		return this.anInt5083++;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)V")
	public void method4332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5083; local7++) {
			this.anIntArray278[local7] += arg2;
			this.anIntArray280[local7] += arg0;
			this.anIntArray281[local7] += arg1;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIBI)V")
	public void method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg0 != 0) {
			local10 = Class5_Sub12.anIntArray544[arg0];
			local14 = Class5_Sub12.anIntArray543[arg0];
			for (local16 = 0; local16 < this.anInt5083; local16++) {
				local34 = this.anIntArray278[local16] * local14 + local10 * this.anIntArray280[local16] >> 14;
				this.anIntArray280[local16] = local14 * this.anIntArray280[local16] - this.anIntArray278[local16] * local10 >> 14;
				this.anIntArray278[local16] = local34;
			}
		}
		if (arg2 != 0) {
			local10 = Class5_Sub12.anIntArray544[arg2];
			local14 = Class5_Sub12.anIntArray543[arg2];
			for (local16 = 0; local16 < this.anInt5083; local16++) {
				local34 = this.anIntArray280[local16] * local14 - this.anIntArray281[local16] * local10 >> 14;
				this.anIntArray281[local16] = local10 * this.anIntArray280[local16] + local14 * this.anIntArray281[local16] >> 14;
				this.anIntArray280[local16] = local34;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local10 = Class5_Sub12.anIntArray544[arg1];
		local14 = Class5_Sub12.anIntArray543[arg1];
		for (local16 = 0; local16 < this.anInt5083; local16++) {
			local34 = this.anIntArray278[local16] * local14 + this.anIntArray281[local16] * local10 >> 14;
			this.anIntArray281[local16] = this.anIntArray281[local16] * local14 - local10 * this.anIntArray278[local16] >> 14;
			this.anIntArray278[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BSSSBSSSBB)B")
	public byte method4334() {
		if (this.anInt5082 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray43[this.anInt5082] = 3;
		this.aShortArray75[this.anInt5082] = 0;
		this.aShortArray70[this.anInt5082] = 32767;
		this.aShortArray73[this.anInt5082] = 0;
		this.anIntArray279[this.anInt5082] = 1024;
		this.anIntArray283[this.anInt5082] = 1024;
		this.anIntArray277[this.anInt5082] = 1024;
		this.aByteArray38[this.anInt5082] = 0;
		this.aByteArray39[this.anInt5082] = 0;
		this.anIntArray285[this.anInt5082] = 0;
		return (byte) this.anInt5082++;
	}
}
