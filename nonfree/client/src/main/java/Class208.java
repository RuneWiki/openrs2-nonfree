import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class208 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "[I")
	public int[] anIntArray540;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "[I")
	public int[] anIntArray541;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "[I")
	public int[] anIntArray542;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "[Lclient!am;")
	public Class11[] aClass11Array1;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "[I")
	public int[] anIntArray543;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "[I")
	public int[] anIntArray544;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "[Lclient!il;")
	public Class120[] aClass120Array4;

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "[I")
	public int[] anIntArray545;

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "[Lclient!e;")
	public Class56[] aClass56Array4;

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "[I")
	public int[] anIntArray546;

	@OriginalMember(owner = "client!ro", name = "A", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!ro", name = "D", descriptor = "[I")
	public int[] anIntArray547;

	@OriginalMember(owner = "client!ro", name = "F", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!ro", name = "G", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!ro", name = "I", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!ro", name = "M", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!ro", name = "O", descriptor = "[I")
	public int[] anIntArray548;

	@OriginalMember(owner = "client!ro", name = "P", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!ro", name = "Q", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!ro", name = "U", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!ro", name = "V", descriptor = "[I")
	public int[] anIntArray549;

	@OriginalMember(owner = "client!ro", name = "W", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!ro", name = "ab", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!ro", name = "bb", descriptor = "[I")
	public int[] anIntArray550;

	@OriginalMember(owner = "client!ro", name = "cb", descriptor = "[B")
	public byte[] aByteArray78;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	public int anInt6196 = 0;

	@OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
	public int anInt6207 = 0;

	@OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
	public int anInt6202 = 12;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "B")
	public byte aByte91 = 0;

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
	public int anInt6203 = 0;

	@OriginalMember(owner = "client!ro", name = "X", descriptor = "I")
	public int anInt6212 = 0;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "([B)V")
	public Class208(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4806(arg0);
		} else {
			this.method4819(arg0);
		}
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(III)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray85 = new short[arg1];
		this.aByteArray77 = new byte[arg1];
		this.aByteArray73 = new byte[arg1];
		this.aShortArray78 = new short[arg1];
		this.anIntArray540 = new int[arg0];
		this.aShortArray77 = new short[arg1];
		this.aByteArray76 = new byte[arg1];
		this.aShortArray80 = new short[arg1];
		this.aShortArray82 = new short[arg1];
		this.anIntArray546 = new int[arg0];
		this.anIntArray545 = new int[arg0];
		this.anIntArray542 = new int[arg0];
		this.aByteArray74 = new byte[arg1];
		this.anIntArray550 = new int[arg1];
		if (arg2 > 0) {
			this.aByteArray78 = new byte[arg2];
			this.anIntArray543 = new int[arg2];
			this.aShortArray81 = new short[arg2];
			this.aShortArray83 = new short[arg2];
			this.aShortArray79 = new short[arg2];
			this.anIntArray541 = new int[arg2];
			this.anIntArray544 = new int[arg2];
			this.anIntArray547 = new int[arg2];
			this.aByteArray75 = new byte[arg2];
			this.aByteArray72 = new byte[arg2];
			this.anIntArray548 = new int[arg2];
			this.anIntArray549 = new int[arg2];
		}
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "([Lclient!ro;I)V")
	public Class208(@OriginalArg(0) Class208[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6207 = 0;
		this.anInt6203 = 0;
		this.anInt6196 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte91 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class208 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt6203 += local59.anInt6203;
				this.anInt6196 += local59.anInt6196;
				this.anInt6207 += local59.anInt6207;
				if (local59.aClass120Array4 != null) {
					local34 += local59.aClass120Array4.length;
				}
				if (local59.aClass56Array4 != null) {
					local32 += local59.aClass56Array4.length;
				}
				if (local59.aClass11Array1 != null) {
					local36 += local59.aClass11Array1.length;
				}
				local38 |= local59.aByteArray73 != null;
				local42 |= local59.aByteArray74 != null;
				local51 |= local59.anIntArray550 != null;
				if (local59.aByteArray76 == null) {
					if (this.aByte91 == -1) {
						this.aByte91 = local59.aByte91;
					}
					if (this.aByte91 != local59.aByte91) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray77 != null;
				local46 |= local59.aShortArray80 != null;
			}
		}
		if (local38) {
			this.aByteArray73 = new byte[this.anInt6196];
		}
		if (local32 > 0) {
			this.aClass56Array4 = new Class56[local32];
		}
		this.aShortArray82 = new short[this.anInt6196];
		this.anIntArray545 = new int[this.anInt6207];
		this.aShortArray84 = new short[this.anInt6207];
		if (local51) {
			this.anIntArray550 = new int[this.anInt6196];
		}
		if (local46) {
			this.aShortArray80 = new short[this.anInt6196];
		}
		if (local44) {
			this.aByteArray77 = new byte[this.anInt6196];
		}
		if (local42) {
			this.aByteArray74 = new byte[this.anInt6196];
		}
		this.aShortArray77 = new short[this.anInt6196];
		this.aShortArray85 = new short[this.anInt6196];
		this.anIntArray546 = new int[this.anInt6207];
		this.anIntArray540 = new int[this.anInt6207];
		if (local36 > 0) {
			this.aClass11Array1 = new Class11[local36];
		}
		if (this.anInt6203 > 0) {
			this.anIntArray549 = new int[this.anInt6203];
			this.aShortArray81 = new short[this.anInt6203];
			this.anIntArray543 = new int[this.anInt6203];
			this.aShortArray83 = new short[this.anInt6203];
			this.aShortArray79 = new short[this.anInt6203];
			this.anIntArray548 = new int[this.anInt6203];
			this.aByteArray72 = new byte[this.anInt6203];
			this.anIntArray541 = new int[this.anInt6203];
			this.anIntArray547 = new int[this.anInt6203];
			this.aByteArray78 = new byte[this.anInt6203];
			this.anIntArray544 = new int[this.anInt6203];
			this.aByteArray75 = new byte[this.anInt6203];
		}
		if (local40) {
			this.aByteArray76 = new byte[this.anInt6196];
		}
		this.aShortArray78 = new short[this.anInt6196];
		this.anIntArray542 = new int[this.anInt6207];
		this.aShortArray76 = new short[this.anInt6196];
		if (local34 > 0) {
			this.aClass120Array4 = new Class120[local34];
		}
		local34 = 0;
		local32 = 0;
		this.anInt6196 = 0;
		this.anInt6203 = 0;
		local36 = 0;
		this.anInt6207 = 0;
		@Pc(617) int local617;
		@Pc(628) int local628;
		for (@Pc(377) int local377 = 0; local377 < arg1; local377++) {
			@Pc(384) short local384 = (short) (0x1 << local377);
			@Pc(388) Class208 local388 = arg0[local377];
			if (local388 != null) {
				@Pc(395) int local395;
				if (local388.aClass11Array1 != null) {
					for (local395 = 0; local395 < local388.aClass11Array1.length; local395++) {
						@Pc(402) Class11 local402 = local388.aClass11Array1[local395];
						this.aClass11Array1[local36++] = local402.method321(local402.anInt395 + this.anInt6196);
					}
				}
				for (local395 = 0; local395 < local388.anInt6196; local395++) {
					if (local38 && local388.aByteArray73 != null) {
						this.aByteArray73[this.anInt6196] = local388.aByteArray73[local395];
					}
					if (local40) {
						if (local388.aByteArray76 == null) {
							this.aByteArray76[this.anInt6196] = local388.aByte91;
						} else {
							this.aByteArray76[this.anInt6196] = local388.aByteArray76[local395];
						}
					}
					if (local42 && local388.aByteArray74 != null) {
						this.aByteArray74[this.anInt6196] = local388.aByteArray74[local395];
					}
					if (local46) {
						if (local388.aShortArray80 == null) {
							this.aShortArray80[this.anInt6196] = -1;
						} else {
							this.aShortArray80[this.anInt6196] = local388.aShortArray80[local395];
						}
					}
					if (local51) {
						if (local388.anIntArray550 == null) {
							this.anIntArray550[this.anInt6196] = -1;
						} else {
							this.anIntArray550[this.anInt6196] = local388.anIntArray550[local395];
						}
					}
					this.aShortArray85[this.anInt6196] = (short) this.method4811(local388, local384, local388.aShortArray85[local395]);
					this.aShortArray82[this.anInt6196] = (short) this.method4811(local388, local384, local388.aShortArray82[local395]);
					this.aShortArray78[this.anInt6196] = (short) this.method4811(local388, local384, local388.aShortArray78[local395]);
					this.aShortArray76[this.anInt6196] = local384;
					this.aShortArray77[this.anInt6196] = local388.aShortArray77[local395];
					this.anInt6196++;
				}
				@Pc(604) int local604;
				if (local388.aClass56Array4 != null) {
					for (local604 = 0; local604 < local388.aClass56Array4.length; local604++) {
						local617 = this.method4811(local388, local384, local388.aClass56Array4[local604].anInt1933);
						local628 = this.method4811(local388, local384, local388.aClass56Array4[local604].anInt1940);
						@Pc(639) int local639 = this.method4811(local388, local384, local388.aClass56Array4[local604].anInt1943);
						this.aClass56Array4[local32] = local388.aClass56Array4[local604].method1458(local639, local617, local628);
						local32++;
					}
				}
				if (local388.aClass120Array4 != null) {
					for (local604 = 0; local604 < local388.aClass120Array4.length; local604++) {
						local617 = this.method4811(local388, local384, local388.aClass120Array4[local604].anInt3172);
						this.aClass120Array4[local34] = local388.aClass120Array4[local604].method2501(local617);
						local34++;
					}
				}
			}
		}
		@Pc(705) int local705 = 0;
		this.anInt6212 = this.anInt6207;
		for (@Pc(711) int local711 = 0; local711 < arg1; local711++) {
			@Pc(718) short local718 = (short) (0x1 << local711);
			@Pc(722) Class208 local722 = arg0[local711];
			if (local722 != null) {
				for (local617 = 0; local617 < local722.anInt6196; local617++) {
					if (local44) {
						this.aByteArray77[local705++] = (byte) (local722.aByteArray77 == null || local722.aByteArray77[local617] == -1 ? -1 : this.anInt6203 + local722.aByteArray77[local617]);
					}
				}
				for (local628 = 0; local628 < local722.anInt6203; local628++) {
					@Pc(779) byte local779 = this.aByteArray72[this.anInt6203] = local722.aByteArray72[local628];
					if (local779 == 0) {
						this.aShortArray83[this.anInt6203] = (short) this.method4811(local722, local718, local722.aShortArray83[local628]);
						this.aShortArray79[this.anInt6203] = (short) this.method4811(local722, local718, local722.aShortArray79[local628]);
						this.aShortArray81[this.anInt6203] = (short) this.method4811(local722, local718, local722.aShortArray81[local628]);
					}
					if (local779 >= 1 && local779 <= 3) {
						this.aShortArray83[this.anInt6203] = local722.aShortArray83[local628];
						this.aShortArray79[this.anInt6203] = local722.aShortArray79[local628];
						this.aShortArray81[this.anInt6203] = local722.aShortArray81[local628];
						this.anIntArray543[this.anInt6203] = local722.anIntArray543[local628];
						this.anIntArray544[this.anInt6203] = local722.anIntArray544[local628];
						this.anIntArray548[this.anInt6203] = local722.anIntArray548[local628];
						this.aByteArray78[this.anInt6203] = local722.aByteArray78[local628];
						this.aByteArray75[this.anInt6203] = local722.aByteArray75[local628];
						this.anIntArray547[this.anInt6203] = local722.anIntArray547[local628];
					}
					if (local779 == 2) {
						this.anIntArray541[this.anInt6203] = local722.anIntArray541[local628];
						this.anIntArray549[this.anInt6203] = local722.anIntArray549[local628];
					}
					this.anInt6203++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZIII)V")
	public void method4805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt6207; local11++) {
			this.anIntArray540[local11] += arg1;
			this.anIntArray546[local11] += arg2;
			this.anIntArray545[local11] += arg0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([BI)V")
	private void method4806(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub30 local10 = new Class4_Sub30(arg0);
		@Pc(15) Class4_Sub30 local15 = new Class4_Sub30(arg0);
		@Pc(20) Class4_Sub30 local20 = new Class4_Sub30(arg0);
		@Pc(25) Class4_Sub30 local25 = new Class4_Sub30(arg0);
		@Pc(30) Class4_Sub30 local30 = new Class4_Sub30(arg0);
		@Pc(35) Class4_Sub30 local35 = new Class4_Sub30(arg0);
		@Pc(40) Class4_Sub30 local40 = new Class4_Sub30(arg0);
		local10.anInt6244 = arg0.length - 23;
		this.anInt6207 = local10.method4877();
		this.anInt6196 = local10.method4877();
		this.anInt6203 = local10.method4864();
		@Pc(65) int local65 = local10.method4864();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(98) boolean local98 = (local65 & 0x4) == 4;
		@Pc(109) boolean local109 = (local65 & 0x8) == 8;
		if (local109) {
			local10.anInt6244 -= 7;
			this.anInt6202 = local10.method4864();
			local10.anInt6244 += 6;
		}
		@Pc(132) int local132 = local10.method4864();
		@Pc(136) int local136 = local10.method4864();
		@Pc(140) int local140 = local10.method4864();
		@Pc(152) int local152 = local10.method4864();
		@Pc(156) int local156 = local10.method4864();
		@Pc(160) int local160 = local10.method4877();
		@Pc(164) int local164 = local10.method4877();
		@Pc(168) int local168 = local10.method4877();
		@Pc(172) int local172 = local10.method4877();
		@Pc(176) int local176 = local10.method4877();
		@Pc(178) int local178 = 0;
		@Pc(180) int local180 = 0;
		@Pc(182) int local182 = 0;
		@Pc(198) int local198;
		if (this.anInt6203 > 0) {
			local10.anInt6244 = 0;
			this.aByteArray72 = new byte[this.anInt6203];
			for (local198 = 0; local198 < this.anInt6203; local198++) {
				@Pc(209) byte local209 = this.aByteArray72[local198] = local10.method4865();
				if (local209 >= 1 && local209 <= 3) {
					local180++;
				}
				if (local209 == 2) {
					local182++;
				}
				if (local209 == 0) {
					local178++;
				}
			}
		}
		local198 = this.anInt6203;
		@Pc(240) int local240 = local198;
		local198 += this.anInt6207;
		@Pc(247) int local247 = local198;
		if (local76) {
			local198 += this.anInt6196;
		}
		@Pc(256) int local256 = local198;
		local198 += this.anInt6196;
		@Pc(263) int local263 = local198;
		if (local132 == 255) {
			local198 += this.anInt6196;
		}
		@Pc(273) int local273 = local198;
		if (local140 == 1) {
			local198 += this.anInt6196;
		}
		@Pc(283) int local283 = local198;
		if (local156 == 1) {
			local198 += this.anInt6207;
		}
		@Pc(295) int local295 = local198;
		if (local136 == 1) {
			local198 += this.anInt6196;
		}
		@Pc(307) int local307 = local198;
		local198 += local172;
		@Pc(313) int local313 = local198;
		if (local152 == 1) {
			local198 += this.anInt6196 * 2;
		}
		@Pc(327) int local327 = local198;
		local198 += local176;
		@Pc(333) int local333 = local198;
		local198 += this.anInt6196 * 2;
		@Pc(342) int local342 = local198;
		local198 += local160;
		@Pc(348) int local348 = local198;
		local198 += local164;
		@Pc(354) int local354 = local198;
		local198 += local168;
		@Pc(360) int local360 = local198;
		local198 += local178 * 6;
		@Pc(368) int local368 = local198;
		local198 += local180 * 6;
		@Pc(384) int local384 = this.anInt6202 < 14 ? 6 : 7;
		@Pc(386) int local386 = local198;
		local198 += local384 * local180;
		@Pc(394) int local394 = local198;
		local198 += local180;
		@Pc(400) int local400 = local198;
		local198 += local180;
		@Pc(406) int local406 = local198;
		local198 += local180 + local182 * 2;
		this.anIntArray546 = new int[this.anInt6207];
		if (this.anInt6203 > 0) {
			this.aShortArray79 = new short[this.anInt6203];
			if (local182 > 0) {
				this.anIntArray541 = new int[local182];
				this.anIntArray549 = new int[local182];
			}
			this.aShortArray83 = new short[this.anInt6203];
			if (local180 > 0) {
				this.anIntArray544 = new int[local180];
				this.anIntArray547 = new int[local180];
				this.anIntArray548 = new int[local180];
				this.aByteArray78 = new byte[local180];
				this.anIntArray543 = new int[local180];
				this.aByteArray75 = new byte[local180];
			}
			this.aShortArray81 = new short[this.anInt6203];
		}
		if (local152 == 1) {
			this.aShortArray80 = new short[this.anInt6196];
		}
		this.aShortArray77 = new short[this.anInt6196];
		this.aShortArray78 = new short[this.anInt6196];
		if (local132 == 255) {
			this.aByteArray76 = new byte[this.anInt6196];
		} else {
			this.aByte91 = (byte) local132;
		}
		if (local136 == 1) {
			this.aByteArray74 = new byte[this.anInt6196];
		}
		local10.anInt6244 = local240;
		this.aShortArray82 = new short[this.anInt6196];
		if (local140 == 1) {
			this.anIntArray550 = new int[this.anInt6196];
		}
		this.anIntArray540 = new int[this.anInt6207];
		if (local76) {
			this.aByteArray73 = new byte[this.anInt6196];
		}
		this.anIntArray545 = new int[this.anInt6207];
		if (local156 == 1) {
			this.anIntArray542 = new int[this.anInt6207];
		}
		if (local152 == 1 && this.anInt6203 > 0) {
			this.aByteArray77 = new byte[this.anInt6196];
		}
		this.aShortArray85 = new short[this.anInt6196];
		local15.anInt6244 = local342;
		local20.anInt6244 = local348;
		local25.anInt6244 = local354;
		local30.anInt6244 = local283;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(599) int local599 = 0;
		@Pc(607) int local607;
		for (@Pc(601) int local601 = 0; local601 < this.anInt6207; local601++) {
			local607 = local10.method4864();
			@Pc(609) int local609 = 0;
			if ((local607 & 0x1) != 0) {
				local609 = local15.method4862();
			}
			@Pc(619) int local619 = 0;
			if ((local607 & 0x2) != 0) {
				local619 = local20.method4862();
			}
			@Pc(629) int local629 = 0;
			if ((local607 & 0x4) != 0) {
				local629 = local25.method4862();
			}
			this.anIntArray540[local601] = local595 + local609;
			this.anIntArray546[local601] = local619 + local597;
			this.anIntArray545[local601] = local599 + local629;
			local595 = this.anIntArray540[local601];
			local599 = this.anIntArray545[local601];
			local597 = this.anIntArray546[local601];
			if (local156 == 1) {
				this.anIntArray542[local601] = local30.method4864();
			}
		}
		local10.anInt6244 = local333;
		local15.anInt6244 = local247;
		local20.anInt6244 = local263;
		local25.anInt6244 = local295;
		local30.anInt6244 = local273;
		local35.anInt6244 = local313;
		local40.anInt6244 = local327;
		for (local607 = 0; local607 < this.anInt6196; local607++) {
			this.aShortArray77[local607] = (short) local10.method4877();
			if (local76) {
				this.aByteArray73[local607] = local15.method4865();
			}
			if (local132 == 255) {
				this.aByteArray76[local607] = local20.method4865();
			}
			if (local136 == 1) {
				this.aByteArray74[local607] = local25.method4865();
			}
			if (local140 == 1) {
				this.anIntArray550[local607] = local30.method4864();
			}
			if (local152 == 1) {
				this.aShortArray80[local607] = (short) (local35.method4877() - 1);
			}
			if (this.aByteArray77 != null) {
				if (this.aShortArray80[local607] == -1) {
					this.aByteArray77[local607] = -1;
				} else {
					this.aByteArray77[local607] = (byte) (local40.method4864() - 1);
				}
			}
		}
		local10.anInt6244 = local307;
		this.anInt6212 = -1;
		local15.anInt6244 = local256;
		@Pc(822) short local822 = 0;
		@Pc(824) short local824 = 0;
		@Pc(826) short local826 = 0;
		@Pc(828) short local828 = 0;
		@Pc(836) int local836;
		for (@Pc(830) int local830 = 0; local830 < this.anInt6196; local830++) {
			local836 = local15.method4864();
			if (local836 == 1) {
				local822 = (short) (local828 + local10.method4862());
				local824 = (short) (local822 + local10.method4862());
				local826 = (short) (local824 + local10.method4862());
				local828 = local826;
				this.aShortArray85[local830] = local822;
				this.aShortArray82[local830] = local824;
				this.aShortArray78[local830] = local826;
				if (this.anInt6212 < local822) {
					this.anInt6212 = local822;
				}
				if (this.anInt6212 < local824) {
					this.anInt6212 = local824;
				}
				if (this.anInt6212 < local826) {
					this.anInt6212 = local826;
				}
			}
			if (local836 == 2) {
				local824 = local826;
				local826 = (short) (local10.method4862() + local828);
				local828 = local826;
				this.aShortArray85[local830] = local822;
				this.aShortArray82[local830] = local824;
				this.aShortArray78[local830] = local826;
				if (this.anInt6212 < local826) {
					this.anInt6212 = local826;
				}
			}
			if (local836 == 3) {
				local822 = local826;
				local826 = (short) (local10.method4862() + local828);
				local828 = local826;
				this.aShortArray85[local830] = local822;
				this.aShortArray82[local830] = local824;
				this.aShortArray78[local830] = local826;
				if (local826 > this.anInt6212) {
					this.anInt6212 = local826;
				}
			}
			if (local836 == 4) {
				@Pc(995) short local995 = local822;
				local822 = local824;
				local826 = (short) (local10.method4862() + local828);
				local824 = local995;
				local828 = local826;
				this.aShortArray85[local830] = local822;
				this.aShortArray82[local830] = local995;
				this.aShortArray78[local830] = local826;
				if (local826 > this.anInt6212) {
					this.anInt6212 = local826;
				}
			}
		}
		local10.anInt6244 = local360;
		this.anInt6212++;
		local15.anInt6244 = local368;
		local20.anInt6244 = local386;
		local25.anInt6244 = local394;
		local30.anInt6244 = local400;
		local35.anInt6244 = local406;
		@Pc(1074) int local1074;
		for (local836 = 0; local836 < this.anInt6203; local836++) {
			local1074 = this.aByteArray72[local836] & 0xFF;
			if (local1074 == 0) {
				this.aShortArray83[local836] = (short) local10.method4877();
				this.aShortArray79[local836] = (short) local10.method4877();
				this.aShortArray81[local836] = (short) local10.method4877();
			}
			if (local1074 == 1) {
				this.aShortArray83[local836] = (short) local15.method4877();
				this.aShortArray79[local836] = (short) local15.method4877();
				this.aShortArray81[local836] = (short) local15.method4877();
				this.anIntArray543[local836] = local20.method4877();
				if (this.anInt6202 >= 14) {
					this.anIntArray544[local836] = local20.method4887();
				} else {
					this.anIntArray544[local836] = local20.method4877();
				}
				this.anIntArray548[local836] = local20.method4877();
				this.aByteArray78[local836] = local25.method4865();
				this.aByteArray75[local836] = local30.method4865();
				this.anIntArray547[local836] = local35.method4865();
			}
			if (local1074 == 2) {
				this.aShortArray83[local836] = (short) local15.method4877();
				this.aShortArray79[local836] = (short) local15.method4877();
				this.aShortArray81[local836] = (short) local15.method4877();
				this.anIntArray543[local836] = local20.method4877();
				if (this.anInt6202 >= 14) {
					this.anIntArray544[local836] = local20.method4887();
				} else {
					this.anIntArray544[local836] = local20.method4877();
				}
				this.anIntArray548[local836] = local20.method4877();
				this.aByteArray78[local836] = local25.method4865();
				this.aByteArray75[local836] = local30.method4865();
				this.anIntArray547[local836] = local35.method4865();
				this.anIntArray541[local836] = local35.method4865();
				this.anIntArray549[local836] = local35.method4865();
			}
			if (local1074 == 3) {
				this.aShortArray83[local836] = (short) local15.method4877();
				this.aShortArray79[local836] = (short) local15.method4877();
				this.aShortArray81[local836] = (short) local15.method4877();
				this.anIntArray543[local836] = local20.method4877();
				if (this.anInt6202 >= 14) {
					this.anIntArray544[local836] = local20.method4887();
				} else {
					this.anIntArray544[local836] = local20.method4877();
				}
				this.anIntArray548[local836] = local20.method4877();
				this.aByteArray78[local836] = local25.method4865();
				this.aByteArray75[local836] = local30.method4865();
				this.anIntArray547[local836] = local35.method4865();
			}
		}
		local10.anInt6244 = local198;
		@Pc(1391) int local1391;
		@Pc(1397) int local1397;
		@Pc(1401) int local1401;
		@Pc(1467) int local1467;
		if (local87) {
			local1074 = local10.method4864();
			if (local1074 > 0) {
				this.aClass56Array4 = new Class56[local1074];
				for (local1391 = 0; local1391 < local1074; local1391++) {
					local1397 = local10.method4877();
					local1401 = local10.method4877();
					@Pc(1411) byte local1411;
					if (local132 == 255) {
						local1411 = this.aByteArray76[local1401];
					} else {
						local1411 = (byte) local132;
					}
					this.aClass56Array4[local1391] = new Class56(local1397, this.aShortArray85[local1401], this.aShortArray82[local1401], this.aShortArray78[local1401], local1411);
				}
			}
			local1391 = local10.method4864();
			if (local1391 > 0) {
				this.aClass120Array4 = new Class120[local1391];
				for (local1397 = 0; local1397 < local1391; local1397++) {
					local1401 = local10.method4877();
					local1467 = local10.method4877();
					this.aClass120Array4[local1397] = new Class120(local1401, local1467);
				}
			}
		}
		if (!local98) {
			return;
		}
		local1074 = local10.method4864();
		if (local1074 <= 0) {
			return;
		}
		this.aClass11Array1 = new Class11[local1074];
		for (local1391 = 0; local1391 < local1074; local1391++) {
			local1397 = local10.method4877();
			local1401 = local10.method4877();
			local1467 = local10.method4864();
			@Pc(1516) byte local1516 = local10.method4865();
			this.aClass11Array1[local1391] = new Class11(local1397, local1401, local1467, local1516);
		}
		return;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)[[I")
	public int[][] method4807() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass11Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass11Array1[local12].anInt397;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(53) int[][] local53 = new int[local10 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local10; local55++) {
			local53[local55] = new int[local8[local55]];
			local8[local55] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.aClass11Array1.length; local74++) {
			@Pc(82) int local82 = this.aClass11Array1[local74].anInt397;
			if (local82 >= 0) {
				local53[local82][local8[local82]++] = local74;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BSS)V")
	public void method4808(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6196; local3++) {
			if (this.aShortArray77[local3] == arg0) {
				this.aShortArray77[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)[[I")
	public int[][] method4809() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt6212; local17++) {
			@Pc(24) int local24 = this.anIntArray542[local17];
			if (local24 >= 0) {
				@Pc(33) int local33 = local13[local24]++;
				if (local24 > local15) {
					local15 = local24;
				}
			}
		}
		@Pc(55) int[][] local55 = new int[local15 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local15; local57++) {
			local55[local57] = new int[local13[local57]];
			local13[local57] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt6212; local80++) {
			@Pc(87) int local87 = this.anIntArray542[local80];
			if (local87 >= 0) {
				local55[local87][local13[local87]++] = local80;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!ro;SI)I")
	private int method4811(@OriginalArg(1) Class208 arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray540[arg2];
		@Pc(24) int local24 = arg0.anIntArray546[arg2];
		@Pc(29) int local29 = arg0.anIntArray545[arg2];
		for (@Pc(31) int local31 = 0; local31 < this.anInt6207; local31++) {
			if (this.anIntArray540[local31] == local10 && this.anIntArray546[local31] == local24 && local29 == this.anIntArray545[local31]) {
				this.aShortArray84[local31] |= arg1;
				return local31;
			}
		}
		this.anIntArray540[this.anInt6207] = local10;
		this.anIntArray546[this.anInt6207] = local24;
		this.anIntArray545[this.anInt6207] = local29;
		this.aShortArray84[this.anInt6207] = arg1;
		this.anIntArray542[this.anInt6207] = arg0.anIntArray542 == null ? -1 : arg0.anIntArray542[arg2];
		return this.anInt6207++;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(SBS)V")
	public void method4812(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray80 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt6196; local15++) {
			if (this.aShortArray80[local15] == arg1) {
				this.aShortArray80[local15] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)V")
	public void method4813() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6207; local3++) {
			this.anIntArray540[local3] <<= 0x0;
			this.anIntArray546[local3] <<= 0x0;
			this.anIntArray545[local3] <<= 0x0;
		}
		if (this.anInt6203 <= 0 || this.anIntArray543 == null) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < this.anIntArray543.length; local60++) {
			this.anIntArray543[local60] <<= 0x0;
			this.anIntArray544[local60] <<= 0x0;
			if (this.aByteArray72[local60] != 1) {
				this.anIntArray548[local60] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(SSSBSSBBIS)B")
	public byte method4815() {
		if (this.anInt6203 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray72[this.anInt6203] = 3;
		this.aShortArray83[this.anInt6203] = 0;
		this.aShortArray79[this.anInt6203] = 32767;
		this.aShortArray81[this.anInt6203] = 0;
		this.anIntArray543[this.anInt6203] = 1024;
		this.anIntArray544[this.anInt6203] = 1024;
		this.anIntArray548[this.anInt6203] = 1024;
		this.aByteArray78[this.anInt6203] = 0;
		this.aByteArray75[this.anInt6203] = 0;
		this.anIntArray547[this.anInt6203] = 0;
		return (byte) this.anInt6203++;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIB)V")
	public void method4816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(23) int local23;
		@Pc(41) int local41;
		if (arg0 != 0) {
			local17 = Class56.anIntArray119[arg0];
			local21 = Class56.anIntArray120[arg0];
			for (local23 = 0; local23 < this.anInt6207; local23++) {
				local41 = local17 * this.anIntArray546[local23] + local21 * this.anIntArray540[local23] >> 15;
				this.anIntArray546[local23] = this.anIntArray546[local23] * local21 - local17 * this.anIntArray540[local23] >> 15;
				this.anIntArray540[local23] = local41;
			}
		}
		if (arg2 != 0) {
			local17 = Class56.anIntArray119[arg2];
			local21 = Class56.anIntArray120[arg2];
			for (local23 = 0; local23 < this.anInt6207; local23++) {
				local41 = this.anIntArray546[local23] * local21 - local17 * this.anIntArray545[local23] >> 15;
				this.anIntArray545[local23] = this.anIntArray546[local23] * local17 + this.anIntArray545[local23] * local21 >> 15;
				this.anIntArray546[local23] = local41;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local17 = Class56.anIntArray119[arg1];
		local21 = Class56.anIntArray120[arg1];
		for (local23 = 0; local23 < this.anInt6207; local23++) {
			local41 = this.anIntArray540[local23] * local21 + this.anIntArray545[local23] * local17 >> 15;
			this.anIntArray545[local23] = this.anIntArray545[local23] * local21 - this.anIntArray540[local23] * local17 >> 15;
			this.anIntArray540[local23] = local41;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B[B)V")
	private void method4819(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(21) Class4_Sub30 local21 = new Class4_Sub30(arg0);
		@Pc(26) Class4_Sub30 local26 = new Class4_Sub30(arg0);
		@Pc(31) Class4_Sub30 local31 = new Class4_Sub30(arg0);
		@Pc(36) Class4_Sub30 local36 = new Class4_Sub30(arg0);
		@Pc(41) Class4_Sub30 local41 = new Class4_Sub30(arg0);
		local21.anInt6244 = arg0.length - 18;
		this.anInt6207 = local21.method4877();
		this.anInt6196 = local21.method4877();
		this.anInt6203 = local21.method4864();
		@Pc(66) int local66 = local21.method4864();
		@Pc(70) int local70 = local21.method4864();
		@Pc(74) int local74 = local21.method4864();
		@Pc(78) int local78 = local21.method4864();
		@Pc(82) int local82 = local21.method4864();
		@Pc(88) int local88 = local21.method4877();
		@Pc(92) int local92 = local21.method4877();
		@Pc(96) int local96 = local21.method4877();
		@Pc(100) int local100 = local21.method4877();
		@Pc(109) int local109 = this.anInt6207;
		@Pc(111) int local111 = local109;
		local109 += this.anInt6196;
		@Pc(118) int local118 = local109;
		if (local70 == 255) {
			local109 += this.anInt6196;
		}
		@Pc(128) int local128 = local109;
		if (local78 == 1) {
			local109 += this.anInt6196;
		}
		@Pc(138) int local138 = local109;
		if (local66 == 1) {
			local109 += this.anInt6196;
		}
		@Pc(148) int local148 = local109;
		if (local82 == 1) {
			local109 += this.anInt6207;
		}
		@Pc(160) int local160 = local109;
		if (local74 == 1) {
			local109 += this.anInt6196;
		}
		@Pc(172) int local172 = local109;
		local109 += local100;
		@Pc(178) int local178 = local109;
		local109 += this.anInt6196 * 2;
		@Pc(187) int local187 = local109;
		local109 += this.anInt6203 * 6;
		@Pc(196) int local196 = local109;
		local109 += local88;
		@Pc(202) int local202 = local109;
		local109 += local92;
		if (this.anInt6203 > 0) {
			this.aShortArray79 = new short[this.anInt6203];
			this.aShortArray83 = new short[this.anInt6203];
			this.aByteArray72 = new byte[this.anInt6203];
			this.aShortArray81 = new short[this.anInt6203];
		}
		this.aShortArray78 = new short[this.anInt6196];
		this.aShortArray85 = new short[this.anInt6196];
		local21.anInt6244 = 0;
		this.anIntArray545 = new int[this.anInt6207];
		this.aShortArray77 = new short[this.anInt6196];
		if (local70 == 255) {
			this.aByteArray76 = new byte[this.anInt6196];
		} else {
			this.aByte91 = (byte) local70;
		}
		if (local78 == 1) {
			this.anIntArray550 = new int[this.anInt6196];
		}
		this.aShortArray82 = new short[this.anInt6196];
		this.anIntArray540 = new int[this.anInt6207];
		if (local74 == 1) {
			this.aByteArray74 = new byte[this.anInt6196];
		}
		this.anIntArray546 = new int[this.anInt6207];
		if (local66 == 1) {
			this.aShortArray80 = new short[this.anInt6196];
			this.aByteArray73 = new byte[this.anInt6196];
			this.aByteArray77 = new byte[this.anInt6196];
		}
		if (local82 == 1) {
			this.anIntArray542 = new int[this.anInt6207];
		}
		local26.anInt6244 = local196;
		local31.anInt6244 = local202;
		local36.anInt6244 = local109;
		local41.anInt6244 = local148;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(362) int local362;
		@Pc(364) int local364;
		for (@Pc(356) int local356 = 0; local356 < this.anInt6207; local356++) {
			local362 = local21.method4864();
			local364 = 0;
			if ((local362 & 0x1) != 0) {
				local364 = local26.method4862();
			}
			@Pc(377) int local377 = 0;
			if ((local362 & 0x2) != 0) {
				local377 = local31.method4862();
			}
			@Pc(390) int local390 = 0;
			if ((local362 & 0x4) != 0) {
				local390 = local36.method4862();
			}
			this.anIntArray540[local356] = local364 + local350;
			this.anIntArray546[local356] = local352 + local377;
			this.anIntArray545[local356] = local390 + local354;
			local350 = this.anIntArray540[local356];
			local352 = this.anIntArray546[local356];
			local354 = this.anIntArray545[local356];
			if (local82 == 1) {
				this.anIntArray542[local356] = local41.method4864();
			}
		}
		local21.anInt6244 = local178;
		local26.anInt6244 = local138;
		local31.anInt6244 = local118;
		local36.anInt6244 = local160;
		local41.anInt6244 = local128;
		for (local362 = 0; local362 < this.anInt6196; local362++) {
			this.aShortArray77[local362] = (short) local21.method4877();
			if (local66 == 1) {
				local364 = local26.method4864();
				if ((local364 & 0x1) == 1) {
					local7 = true;
					this.aByteArray73[local362] = 1;
				} else {
					this.aByteArray73[local362] = 0;
				}
				if ((local364 & 0x2) == 2) {
					this.aByteArray77[local362] = (byte) (local364 >> 2);
					this.aShortArray80[local362] = this.aShortArray77[local362];
					this.aShortArray77[local362] = 127;
					if (this.aShortArray80[local362] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray77[local362] = -1;
					this.aShortArray80[local362] = -1;
				}
			}
			if (local70 == 255) {
				this.aByteArray76[local362] = local31.method4865();
			}
			if (local74 == 1) {
				this.aByteArray74[local362] = local36.method4865();
			}
			if (local78 == 1) {
				this.anIntArray550[local362] = local41.method4864();
			}
		}
		this.anInt6212 = -1;
		local21.anInt6244 = local172;
		local26.anInt6244 = local111;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(616) short local616 = 0;
		@Pc(618) short local618 = 0;
		@Pc(626) int local626;
		for (@Pc(620) int local620 = 0; local620 < this.anInt6196; local620++) {
			local626 = local26.method4864();
			if (local626 == 1) {
				local612 = (short) (local618 + local21.method4862());
				local614 = (short) (local21.method4862() + local612);
				local616 = (short) (local21.method4862() + local614);
				local618 = local616;
				this.aShortArray85[local620] = local612;
				this.aShortArray82[local620] = local614;
				this.aShortArray78[local620] = local616;
				if (this.anInt6212 < local612) {
					this.anInt6212 = local612;
				}
				if (local614 > this.anInt6212) {
					this.anInt6212 = local614;
				}
				if (this.anInt6212 < local616) {
					this.anInt6212 = local616;
				}
			}
			if (local626 == 2) {
				local614 = local616;
				local616 = (short) (local618 + local21.method4862());
				this.aShortArray85[local620] = local612;
				local618 = local616;
				this.aShortArray82[local620] = local614;
				this.aShortArray78[local620] = local616;
				if (local616 > this.anInt6212) {
					this.anInt6212 = local616;
				}
			}
			if (local626 == 3) {
				local612 = local616;
				local616 = (short) (local21.method4862() + local618);
				this.aShortArray85[local620] = local612;
				local618 = local616;
				this.aShortArray82[local620] = local614;
				this.aShortArray78[local620] = local616;
				if (local616 > this.anInt6212) {
					this.anInt6212 = local616;
				}
			}
			if (local626 == 4) {
				@Pc(783) short local783 = local612;
				local612 = local614;
				local616 = (short) (local21.method4862() + local618);
				local614 = local783;
				local618 = local616;
				this.aShortArray85[local620] = local612;
				this.aShortArray82[local620] = local783;
				this.aShortArray78[local620] = local616;
				if (this.anInt6212 < local616) {
					this.anInt6212 = local616;
				}
			}
		}
		local21.anInt6244 = local187;
		this.anInt6212++;
		for (local626 = 0; local626 < this.anInt6203; local626++) {
			this.aByteArray72[local626] = 0;
			this.aShortArray83[local626] = (short) local21.method4877();
			this.aShortArray79[local626] = (short) local21.method4877();
			this.aShortArray81[local626] = (short) local21.method4877();
		}
		if (this.aByteArray77 != null) {
			@Pc(887) boolean local887 = false;
			for (@Pc(889) int local889 = 0; local889 < this.anInt6196; local889++) {
				@Pc(898) int local898 = this.aByteArray77[local889] & 0xFF;
				if (local898 != 255) {
					if (this.aShortArray85[local889] == (this.aShortArray83[local898] & 0xFFFF) && (this.aShortArray79[local898] & 0xFFFF) == this.aShortArray82[local889] && this.aShortArray78[local889] == (this.aShortArray81[local898] & 0xFFFF)) {
						this.aByteArray77[local889] = -1;
					} else {
						local887 = true;
					}
				}
			}
			if (!local887) {
				this.aByteArray77 = null;
			}
		}
		if (!local7) {
			this.aByteArray73 = null;
		}
		if (!local9) {
			this.aShortArray80 = null;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BIII)I")
	public int method4820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6207; local7++) {
			if (this.anIntArray540[local7] == arg1 && arg0 == this.anIntArray546[local7] && this.anIntArray545[local7] == arg2) {
				return local7;
			}
		}
		this.anIntArray540[this.anInt6207] = arg1;
		this.anIntArray546[this.anInt6207] = arg0;
		this.anIntArray545[this.anInt6207] = arg2;
		this.anInt6212 = this.anInt6207 + 1;
		return this.anInt6207++;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)[[I")
	public int[][] method4821() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6196; local12++) {
			@Pc(19) int local19 = this.anIntArray550[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt6196; local80++) {
			@Pc(87) int local87 = this.anIntArray550[local80];
			if (local87 >= 0) {
				local50[local87][local8[local87]++] = local80;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BSIIBISBZ)I")
	public int method4822(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7) {
		this.aShortArray85[this.anInt6196] = (short) arg2;
		this.aShortArray82[this.anInt6196] = (short) arg5;
		this.aShortArray78[this.anInt6196] = (short) arg3;
		this.aByteArray73[this.anInt6196] = arg7;
		this.aByteArray77[this.anInt6196] = arg4;
		this.aShortArray77[this.anInt6196] = arg6;
		this.aByteArray74[this.anInt6196] = arg0;
		this.aShortArray80[this.anInt6196] = arg1;
		return this.anInt6196++;
	}
}
