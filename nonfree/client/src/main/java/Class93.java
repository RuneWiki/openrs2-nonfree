import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class93 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "[Lclient!qg;")
	public Class270[] aClass270Array1;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "[Lclient!hi;")
	public Class139[] aClass139Array1;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!eg", name = "C", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!eg", name = "D", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!eg", name = "N", descriptor = "[Lclient!lw;")
	public Class214[] aClass214Array1;

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!eg", name = "Z", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	public int anInt2343 = 0;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "B")
	public byte aByte41 = 0;

	@OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
	public int anInt2356 = 0;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
	public int anInt2348 = 0;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
	public int anInt2351 = 0;

	@OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
	public int anInt2361 = 12;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	private Class93() {
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([B)V")
	public Class93(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1755(arg0);
		} else {
			this.method1764(arg0);
		}
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(III)V")
	public Class93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray35 = new short[arg1];
		this.aByteArray28 = new byte[arg1];
		this.anIntArray155 = new int[arg0];
		this.aShortArray36 = new short[arg1];
		this.aByteArray27 = new byte[arg1];
		if (arg2 > 0) {
			this.aByteArray30 = new byte[arg2];
			this.aShortArray30 = new short[arg2];
			this.aShortArray32 = new short[arg2];
			this.anIntArray150 = new int[arg2];
			this.aShortArray29 = new short[arg2];
			this.anIntArray146 = new int[arg2];
			this.anIntArray153 = new int[arg2];
			this.anIntArray154 = new int[arg2];
			this.anIntArray147 = new int[arg2];
			this.aByteArray32 = new byte[arg2];
			this.anIntArray145 = new int[arg2];
			this.aByteArray29 = new byte[arg2];
		}
		this.aShortArray31 = new short[arg1];
		this.aByteArray26 = new byte[arg1];
		this.aShortArray27 = new short[arg1];
		this.anIntArray151 = new int[arg0];
		this.anIntArray152 = new int[arg0];
		this.aByteArray31 = new byte[arg1];
		this.anIntArray149 = new int[arg1];
		this.anIntArray148 = new int[arg0];
		this.aShortArray33 = new short[arg1];
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([Lclient!eg;I)V")
	public Class93(@OriginalArg(0) Class93[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2356 = 0;
		this.anInt2351 = 0;
		this.anInt2348 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte41 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class93 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt2351 += local59.anInt2351;
				this.anInt2356 += local59.anInt2356;
				this.anInt2348 += local59.anInt2348;
				if (local59.aClass270Array1 != null) {
					local34 += local59.aClass270Array1.length;
				}
				local38 |= local59.aByteArray31 != null;
				if (local59.aClass214Array1 != null) {
					local36 += local59.aClass214Array1.length;
				}
				if (local59.aClass139Array1 != null) {
					local32 += local59.aClass139Array1.length;
				}
				local44 |= local59.aByteArray26 != null;
				local46 |= local59.aShortArray33 != null;
				local42 |= local59.aByteArray27 != null;
				if (local59.aByteArray28 == null) {
					if (this.aByte41 == -1) {
						this.aByte41 = local59.aByte41;
					}
					if (local59.aByte41 != this.aByte41) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local51 |= local59.anIntArray149 != null;
			}
		}
		if (local36 > 0) {
			this.aClass214Array1 = new Class214[local36];
		}
		if (local42) {
			this.aByteArray27 = new byte[this.anInt2351];
		}
		this.anIntArray151 = new int[this.anInt2348];
		this.anIntArray148 = new int[this.anInt2348];
		if (local44) {
			this.aByteArray26 = new byte[this.anInt2351];
		}
		if (this.anInt2356 > 0) {
			this.anIntArray146 = new int[this.anInt2356];
			this.aByteArray30 = new byte[this.anInt2356];
			this.anIntArray154 = new int[this.anInt2356];
			this.anIntArray153 = new int[this.anInt2356];
			this.anIntArray145 = new int[this.anInt2356];
			this.aByteArray32 = new byte[this.anInt2356];
			this.aShortArray29 = new short[this.anInt2356];
			this.aShortArray30 = new short[this.anInt2356];
			this.anIntArray147 = new int[this.anInt2356];
			this.anIntArray150 = new int[this.anInt2356];
			this.aByteArray29 = new byte[this.anInt2356];
			this.aShortArray32 = new short[this.anInt2356];
		}
		if (local32 > 0) {
			this.aClass139Array1 = new Class139[local32];
		}
		this.aShortArray36 = new short[this.anInt2351];
		this.aShortArray28 = new short[this.anInt2348];
		if (local34 > 0) {
			this.aClass270Array1 = new Class270[local34];
		}
		this.aShortArray34 = new short[this.anInt2351];
		this.anIntArray155 = new int[this.anInt2348];
		if (local51) {
			this.anIntArray149 = new int[this.anInt2351];
		}
		this.anIntArray152 = new int[this.anInt2348];
		if (local38) {
			this.aByteArray31 = new byte[this.anInt2351];
		}
		this.aShortArray35 = new short[this.anInt2351];
		if (local46) {
			this.aShortArray33 = new short[this.anInt2351];
		}
		this.aShortArray31 = new short[this.anInt2351];
		if (local40) {
			this.aByteArray28 = new byte[this.anInt2351];
		}
		this.aShortArray27 = new short[this.anInt2351];
		local34 = 0;
		this.anInt2348 = 0;
		this.anInt2356 = 0;
		local36 = 0;
		this.anInt2351 = 0;
		local32 = 0;
		@Pc(617) int local617;
		@Pc(628) int local628;
		for (@Pc(385) int local385 = 0; local385 < arg1; local385++) {
			@Pc(392) short local392 = (short) (0x1 << local385);
			@Pc(396) Class93 local396 = arg0[local385];
			if (local396 != null) {
				@Pc(403) int local403;
				if (local396.aClass214Array1 != null) {
					for (local403 = 0; local403 < local396.aClass214Array1.length; local403++) {
						@Pc(410) Class214 local410 = local396.aClass214Array1[local403];
						this.aClass214Array1[local36++] = local410.method4950(this.anInt2351 + local410.anInt5956);
					}
				}
				for (local403 = 0; local403 < local396.anInt2351; local403++) {
					if (local38 && local396.aByteArray31 != null) {
						this.aByteArray31[this.anInt2351] = local396.aByteArray31[local403];
					}
					if (local40) {
						if (local396.aByteArray28 == null) {
							this.aByteArray28[this.anInt2351] = local396.aByte41;
						} else {
							this.aByteArray28[this.anInt2351] = local396.aByteArray28[local403];
						}
					}
					if (local42 && local396.aByteArray27 != null) {
						this.aByteArray27[this.anInt2351] = local396.aByteArray27[local403];
					}
					if (local46) {
						if (local396.aShortArray33 == null) {
							this.aShortArray33[this.anInt2351] = -1;
						} else {
							this.aShortArray33[this.anInt2351] = local396.aShortArray33[local403];
						}
					}
					if (local51) {
						if (local396.anIntArray149 == null) {
							this.anIntArray149[this.anInt2351] = -1;
						} else {
							this.anIntArray149[this.anInt2351] = local396.anIntArray149[local403];
						}
					}
					this.aShortArray35[this.anInt2351] = (short) this.method1756(local396.aShortArray35[local403], local396, local392);
					this.aShortArray31[this.anInt2351] = (short) this.method1756(local396.aShortArray31[local403], local396, local392);
					this.aShortArray27[this.anInt2351] = (short) this.method1756(local396.aShortArray27[local403], local396, local392);
					this.aShortArray34[this.anInt2351] = local392;
					this.aShortArray36[this.anInt2351] = local396.aShortArray36[local403];
					this.anInt2351++;
				}
				@Pc(604) int local604;
				if (local396.aClass139Array1 != null) {
					for (local604 = 0; local604 < local396.aClass139Array1.length; local604++) {
						local617 = this.method1756(local396.aClass139Array1[local604].anInt3911, local396, local392);
						local628 = this.method1756(local396.aClass139Array1[local604].anInt3913, local396, local392);
						@Pc(639) int local639 = this.method1756(local396.aClass139Array1[local604].anInt3912, local396, local392);
						this.aClass139Array1[local32] = local396.aClass139Array1[local604].method3252(local628, local617, local639);
						local32++;
					}
				}
				if (local396.aClass270Array1 != null) {
					for (local604 = 0; local604 < local396.aClass270Array1.length; local604++) {
						local617 = this.method1756(local396.aClass270Array1[local604].anInt7311, local396, local392);
						this.aClass270Array1[local34] = local396.aClass270Array1[local604].method6127(local617);
						local34++;
					}
				}
			}
		}
		this.anInt2343 = this.anInt2348;
		@Pc(709) int local709 = 0;
		for (@Pc(711) int local711 = 0; local711 < arg1; local711++) {
			@Pc(718) short local718 = (short) (0x1 << local711);
			@Pc(722) Class93 local722 = arg0[local711];
			if (local722 != null) {
				for (local617 = 0; local617 < local722.anInt2351; local617++) {
					if (local44) {
						this.aByteArray26[local709++] = (byte) (local722.aByteArray26 == null || local722.aByteArray26[local617] == -1 ? -1 : this.anInt2356 + local722.aByteArray26[local617]);
					}
				}
				for (local628 = 0; local628 < local722.anInt2356; local628++) {
					@Pc(775) byte local775 = this.aByteArray30[this.anInt2356] = local722.aByteArray30[local628];
					if (local775 == 0) {
						this.aShortArray30[this.anInt2356] = (short) this.method1756(local722.aShortArray30[local628], local722, local718);
						this.aShortArray29[this.anInt2356] = (short) this.method1756(local722.aShortArray29[local628], local722, local718);
						this.aShortArray32[this.anInt2356] = (short) this.method1756(local722.aShortArray32[local628], local722, local718);
					}
					if (local775 >= 1 && local775 <= 3) {
						this.aShortArray30[this.anInt2356] = local722.aShortArray30[local628];
						this.aShortArray29[this.anInt2356] = local722.aShortArray29[local628];
						this.aShortArray32[this.anInt2356] = local722.aShortArray32[local628];
						this.anIntArray153[this.anInt2356] = local722.anIntArray153[local628];
						this.anIntArray146[this.anInt2356] = local722.anIntArray146[local628];
						this.anIntArray150[this.anInt2356] = local722.anIntArray150[local628];
						this.aByteArray32[this.anInt2356] = local722.aByteArray32[local628];
						this.aByteArray29[this.anInt2356] = local722.aByteArray29[local628];
						this.anIntArray154[this.anInt2356] = local722.anIntArray154[local628];
					}
					if (local775 == 2) {
						this.anIntArray147[this.anInt2356] = local722.anIntArray147[local628];
						this.anIntArray145[this.anInt2356] = local722.anIntArray145[local628];
					}
					this.anInt2356++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBII)V")
	public void method1752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2348; local13++) {
			this.anIntArray148[local13] += arg1;
			this.anIntArray155[local13] += arg2;
			this.anIntArray152[local13] += arg0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)I")
	public int method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2348; local13++) {
			if (arg0 == this.anIntArray148[local13] && this.anIntArray155[local13] == arg2 && this.anIntArray152[local13] == arg1) {
				return local13;
			}
		}
		this.anIntArray148[this.anInt2348] = arg0;
		this.anIntArray155[this.anInt2348] = arg2;
		this.anIntArray152[this.anInt2348] = arg1;
		this.anInt2343 = this.anInt2348 + 1;
		return this.anInt2348++;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(SBSSSIBSSB)B")
	public byte method1754() {
		if (this.anInt2356 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray30[this.anInt2356] = 3;
		this.aShortArray30[this.anInt2356] = 0;
		this.aShortArray29[this.anInt2356] = 32767;
		this.aShortArray32[this.anInt2356] = 0;
		this.anIntArray153[this.anInt2356] = 1024;
		this.anIntArray146[this.anInt2356] = 1024;
		this.anIntArray150[this.anInt2356] = 1024;
		this.aByteArray32[this.anInt2356] = 0;
		this.aByteArray29[this.anInt2356] = 0;
		this.anIntArray154[this.anInt2356] = 0;
		return (byte) this.anInt2356++;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([BI)V")
	private void method1755(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub15 local10 = new Class2_Sub15(arg0);
		@Pc(15) Class2_Sub15 local15 = new Class2_Sub15(arg0);
		@Pc(20) Class2_Sub15 local20 = new Class2_Sub15(arg0);
		@Pc(25) Class2_Sub15 local25 = new Class2_Sub15(arg0);
		@Pc(30) Class2_Sub15 local30 = new Class2_Sub15(arg0);
		@Pc(35) Class2_Sub15 local35 = new Class2_Sub15(arg0);
		@Pc(40) Class2_Sub15 local40 = new Class2_Sub15(arg0);
		local10.anInt5241 = arg0.length - 23;
		this.anInt2348 = local10.method4294();
		this.anInt2351 = local10.method4294();
		this.anInt2356 = local10.method4325();
		@Pc(65) int local65 = local10.method4325();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(107) boolean local107 = (local65 & 0x8) == 8;
		if (local107) {
			local10.anInt5241 -= 7;
			this.anInt2361 = local10.method4325();
			local10.anInt5241 += 6;
		}
		@Pc(130) int local130 = local10.method4325();
		@Pc(134) int local134 = local10.method4325();
		@Pc(138) int local138 = local10.method4325();
		@Pc(142) int local142 = local10.method4325();
		@Pc(146) int local146 = local10.method4325();
		@Pc(152) int local152 = local10.method4294();
		@Pc(156) int local156 = local10.method4294();
		@Pc(160) int local160 = local10.method4294();
		@Pc(164) int local164 = local10.method4294();
		@Pc(168) int local168 = local10.method4294();
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(190) int local190;
		if (this.anInt2356 > 0) {
			local10.anInt5241 = 0;
			this.aByteArray30 = new byte[this.anInt2356];
			for (local190 = 0; local190 < this.anInt2356; local190++) {
				@Pc(201) byte local201 = this.aByteArray30[local190] = local10.method4304();
				if (local201 == 2) {
					local174++;
				}
				if (local201 >= 1 && local201 <= 3) {
					local172++;
				}
				if (local201 == 0) {
					local170++;
				}
			}
		}
		local190 = this.anInt2356;
		@Pc(234) int local234 = local190;
		local190 += this.anInt2348;
		@Pc(241) int local241 = local190;
		if (local76) {
			local190 += this.anInt2351;
		}
		@Pc(250) int local250 = local190;
		local190 += this.anInt2351;
		@Pc(257) int local257 = local190;
		if (local130 == 255) {
			local190 += this.anInt2351;
		}
		@Pc(267) int local267 = local190;
		if (local138 == 1) {
			local190 += this.anInt2351;
		}
		@Pc(277) int local277 = local190;
		if (local146 == 1) {
			local190 += this.anInt2348;
		}
		@Pc(289) int local289 = local190;
		if (local134 == 1) {
			local190 += this.anInt2351;
		}
		@Pc(301) int local301 = local190;
		local190 += local164;
		@Pc(307) int local307 = local190;
		if (local142 == 1) {
			local190 += this.anInt2351 * 2;
		}
		@Pc(319) int local319 = local190;
		local190 += local168;
		@Pc(325) int local325 = local190;
		local190 += this.anInt2351 * 2;
		@Pc(334) int local334 = local190;
		local190 += local152;
		@Pc(340) int local340 = local190;
		local190 += local156;
		@Pc(346) int local346 = local190;
		local190 += local160;
		@Pc(352) int local352 = local190;
		local190 += local170 * 6;
		@Pc(360) int local360 = local190;
		local190 += local172 * 6;
		@Pc(368) byte local368 = 6;
		if (this.anInt2361 == 14) {
			local368 = 7;
		} else if (this.anInt2361 >= 15) {
			local368 = 9;
		}
		@Pc(386) int local386 = local190;
		local190 += local368 * local172;
		@Pc(394) int local394 = local190;
		local190 += local172;
		@Pc(400) int local400 = local190;
		local190 += local172;
		@Pc(406) int local406 = local190;
		local190 += local172 + local174 * 2;
		if (local76) {
			this.aByteArray31 = new byte[this.anInt2351];
		}
		local10.anInt5241 = local234;
		if (local138 == 1) {
			this.anIntArray149 = new int[this.anInt2351];
		}
		if (local134 == 1) {
			this.aByteArray27 = new byte[this.anInt2351];
		}
		if (this.anInt2356 > 0) {
			if (local172 > 0) {
				this.aByteArray32 = new byte[local172];
				this.aByteArray29 = new byte[local172];
				this.anIntArray153 = new int[local172];
				this.anIntArray154 = new int[local172];
				this.anIntArray146 = new int[local172];
				this.anIntArray150 = new int[local172];
			}
			this.aShortArray29 = new short[this.anInt2356];
			if (local174 > 0) {
				this.anIntArray145 = new int[local174];
				this.anIntArray147 = new int[local174];
			}
			this.aShortArray30 = new short[this.anInt2356];
			this.aShortArray32 = new short[this.anInt2356];
		}
		if (local142 == 1) {
			this.aShortArray33 = new short[this.anInt2351];
		}
		this.aShortArray35 = new short[this.anInt2351];
		this.anIntArray148 = new int[this.anInt2348];
		this.anIntArray152 = new int[this.anInt2348];
		if (local146 == 1) {
			this.anIntArray151 = new int[this.anInt2348];
		}
		this.aShortArray36 = new short[this.anInt2351];
		this.aShortArray31 = new short[this.anInt2351];
		if (local130 == 255) {
			this.aByteArray28 = new byte[this.anInt2351];
		} else {
			this.aByte41 = (byte) local130;
		}
		this.aShortArray27 = new short[this.anInt2351];
		this.anIntArray155 = new int[this.anInt2348];
		if (local142 == 1 && this.anInt2356 > 0) {
			this.aByteArray26 = new byte[this.anInt2351];
		}
		local15.anInt5241 = local334;
		local20.anInt5241 = local340;
		local25.anInt5241 = local346;
		local30.anInt5241 = local277;
		@Pc(606) int local606 = 0;
		@Pc(608) int local608 = 0;
		@Pc(610) int local610 = 0;
		@Pc(620) int local620;
		for (@Pc(612) int local612 = 0; local612 < this.anInt2348; local612++) {
			local620 = local10.method4325();
			@Pc(622) int local622 = 0;
			if ((local620 & 0x1) != 0) {
				local622 = local15.method4289();
			}
			@Pc(632) int local632 = 0;
			if ((local620 & 0x2) != 0) {
				local632 = local20.method4289();
			}
			@Pc(645) int local645 = 0;
			if ((local620 & 0x4) != 0) {
				local645 = local25.method4289();
			}
			this.anIntArray148[local612] = local622 + local606;
			this.anIntArray155[local612] = local632 + local608;
			this.anIntArray152[local612] = local610 + local645;
			local608 = this.anIntArray155[local612];
			local606 = this.anIntArray148[local612];
			local610 = this.anIntArray152[local612];
			if (local146 == 1) {
				this.anIntArray151[local612] = local30.method4325();
			}
		}
		local10.anInt5241 = local325;
		local15.anInt5241 = local241;
		local20.anInt5241 = local257;
		local25.anInt5241 = local289;
		local30.anInt5241 = local267;
		local35.anInt5241 = local307;
		local40.anInt5241 = local319;
		for (local620 = 0; local620 < this.anInt2351; local620++) {
			this.aShortArray36[local620] = (short) local10.method4294();
			if (local76) {
				this.aByteArray31[local620] = local15.method4304();
			}
			if (local130 == 255) {
				this.aByteArray28[local620] = local20.method4304();
			}
			if (local134 == 1) {
				this.aByteArray27[local620] = local25.method4304();
			}
			if (local138 == 1) {
				this.anIntArray149[local620] = local30.method4325();
			}
			if (local142 == 1) {
				this.aShortArray33[local620] = (short) (local35.method4294() - 1);
			}
			if (this.aByteArray26 != null) {
				if (this.aShortArray33[local620] == -1) {
					this.aByteArray26[local620] = -1;
				} else {
					this.aByteArray26[local620] = (byte) (local40.method4325() - 1);
				}
			}
		}
		this.anInt2343 = -1;
		local10.anInt5241 = local301;
		local15.anInt5241 = local250;
		@Pc(843) short local843 = 0;
		@Pc(845) short local845 = 0;
		@Pc(847) short local847 = 0;
		@Pc(849) short local849 = 0;
		@Pc(857) int local857;
		for (@Pc(851) int local851 = 0; local851 < this.anInt2351; local851++) {
			local857 = local15.method4325();
			if (local857 == 1) {
				local843 = (short) (local849 + local10.method4289());
				local845 = (short) (local843 + local10.method4289());
				local847 = (short) (local10.method4289() + local845);
				this.aShortArray35[local851] = local843;
				local849 = local847;
				this.aShortArray31[local851] = local845;
				this.aShortArray27[local851] = local847;
				if (local843 > this.anInt2343) {
					this.anInt2343 = local843;
				}
				if (this.anInt2343 < local845) {
					this.anInt2343 = local845;
				}
				if (this.anInt2343 < local847) {
					this.anInt2343 = local847;
				}
			}
			if (local857 == 2) {
				local845 = local847;
				local847 = (short) (local10.method4289() + local849);
				local849 = local847;
				this.aShortArray35[local851] = local843;
				this.aShortArray31[local851] = local845;
				this.aShortArray27[local851] = local847;
				if (local847 > this.anInt2343) {
					this.anInt2343 = local847;
				}
			}
			if (local857 == 3) {
				local843 = local847;
				local847 = (short) (local849 + local10.method4289());
				this.aShortArray35[local851] = local843;
				local849 = local847;
				this.aShortArray31[local851] = local845;
				this.aShortArray27[local851] = local847;
				if (this.anInt2343 < local847) {
					this.anInt2343 = local847;
				}
			}
			if (local857 == 4) {
				@Pc(1014) short local1014 = local843;
				local843 = local845;
				local845 = local1014;
				local847 = (short) (local10.method4289() + local849);
				this.aShortArray35[local851] = local843;
				local849 = local847;
				this.aShortArray31[local851] = local1014;
				this.aShortArray27[local851] = local847;
				if (local847 > this.anInt2343) {
					this.anInt2343 = local847;
				}
			}
		}
		local10.anInt5241 = local352;
		this.anInt2343++;
		local15.anInt5241 = local360;
		local20.anInt5241 = local386;
		local25.anInt5241 = local394;
		local30.anInt5241 = local400;
		local35.anInt5241 = local406;
		@Pc(1093) int local1093;
		for (local857 = 0; local857 < this.anInt2356; local857++) {
			local1093 = this.aByteArray30[local857] & 0xFF;
			if (local1093 == 0) {
				this.aShortArray30[local857] = (short) local10.method4294();
				this.aShortArray29[local857] = (short) local10.method4294();
				this.aShortArray32[local857] = (short) local10.method4294();
			}
			if (local1093 == 1) {
				this.aShortArray30[local857] = (short) local15.method4294();
				this.aShortArray29[local857] = (short) local15.method4294();
				this.aShortArray32[local857] = (short) local15.method4294();
				if (this.anInt2361 < 15) {
					this.anIntArray153[local857] = local20.method4294();
					if (this.anInt2361 >= 14) {
						this.anIntArray146[local857] = local20.method4341();
					} else {
						this.anIntArray146[local857] = local20.method4294();
					}
					this.anIntArray150[local857] = local20.method4294();
				} else {
					this.anIntArray153[local857] = local20.method4341();
					this.anIntArray146[local857] = local20.method4341();
					this.anIntArray150[local857] = local20.method4341();
				}
				this.aByteArray32[local857] = local25.method4304();
				this.aByteArray29[local857] = local30.method4304();
				this.anIntArray154[local857] = local35.method4304();
			}
			if (local1093 == 2) {
				this.aShortArray30[local857] = (short) local15.method4294();
				this.aShortArray29[local857] = (short) local15.method4294();
				this.aShortArray32[local857] = (short) local15.method4294();
				if (this.anInt2361 >= 15) {
					this.anIntArray153[local857] = local20.method4341();
					this.anIntArray146[local857] = local20.method4341();
					this.anIntArray150[local857] = local20.method4341();
				} else {
					this.anIntArray153[local857] = local20.method4294();
					if (this.anInt2361 < 14) {
						this.anIntArray146[local857] = local20.method4294();
					} else {
						this.anIntArray146[local857] = local20.method4341();
					}
					this.anIntArray150[local857] = local20.method4294();
				}
				this.aByteArray32[local857] = local25.method4304();
				this.aByteArray29[local857] = local30.method4304();
				this.anIntArray154[local857] = local35.method4304();
				this.anIntArray147[local857] = local35.method4304();
				this.anIntArray145[local857] = local35.method4304();
			}
			if (local1093 == 3) {
				this.aShortArray30[local857] = (short) local15.method4294();
				this.aShortArray29[local857] = (short) local15.method4294();
				this.aShortArray32[local857] = (short) local15.method4294();
				if (this.anInt2361 < 15) {
					this.anIntArray153[local857] = local20.method4294();
					if (this.anInt2361 < 14) {
						this.anIntArray146[local857] = local20.method4294();
					} else {
						this.anIntArray146[local857] = local20.method4341();
					}
					this.anIntArray150[local857] = local20.method4294();
				} else {
					this.anIntArray153[local857] = local20.method4341();
					this.anIntArray146[local857] = local20.method4341();
					this.anIntArray150[local857] = local20.method4341();
				}
				this.aByteArray32[local857] = local25.method4304();
				this.aByteArray29[local857] = local30.method4304();
				this.anIntArray154[local857] = local35.method4304();
			}
		}
		local10.anInt5241 = local190;
		@Pc(1514) int local1514;
		@Pc(1520) int local1520;
		@Pc(1524) int local1524;
		@Pc(1584) int local1584;
		if (local85) {
			local1093 = local10.method4325();
			if (local1093 > 0) {
				this.aClass139Array1 = new Class139[local1093];
				for (local1514 = 0; local1514 < local1093; local1514++) {
					local1520 = local10.method4294();
					local1524 = local10.method4294();
					@Pc(1532) byte local1532;
					if (local130 == 255) {
						local1532 = this.aByteArray28[local1524];
					} else {
						local1532 = (byte) local130;
					}
					this.aClass139Array1[local1514] = new Class139(local1520, this.aShortArray35[local1524], this.aShortArray31[local1524], this.aShortArray27[local1524], local1532);
				}
			}
			local1514 = local10.method4325();
			if (local1514 > 0) {
				this.aClass270Array1 = new Class270[local1514];
				for (local1520 = 0; local1520 < local1514; local1520++) {
					local1524 = local10.method4294();
					local1584 = local10.method4294();
					this.aClass270Array1[local1520] = new Class270(local1524, local1584);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1093 = local10.method4325();
		if (local1093 <= 0) {
			return;
		}
		this.aClass214Array1 = new Class214[local1093];
		for (local1514 = 0; local1514 < local1093; local1514++) {
			local1520 = local10.method4294();
			local1524 = local10.method4294();
			local1584 = local10.method4325();
			@Pc(1637) byte local1637 = local10.method4304();
			this.aClass214Array1[local1514] = new Class214(local1520, local1524, local1584, local1637);
		}
		return;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!eg;IS)I")
	private int method1756(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray148[arg0];
		@Pc(15) int local15 = arg1.anIntArray155[arg0];
		@Pc(20) int local20 = arg1.anIntArray152[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2348; local22++) {
			if (local10 == this.anIntArray148[local22] && this.anIntArray155[local22] == local15 && this.anIntArray152[local22] == local20) {
				this.aShortArray28[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray148[this.anInt2348] = local10;
		this.anIntArray155[this.anInt2348] = local15;
		this.anIntArray152[this.anInt2348] = local20;
		this.aShortArray28[this.anInt2348] = arg2;
		this.anIntArray151[this.anInt2348] = arg1.anIntArray151 == null ? -1 : arg1.anIntArray151[arg0];
		return this.anInt2348++;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)[[I")
	public int[][] method1757(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt2348 : this.anInt2343;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(35) int local35 = this.anIntArray151[local28];
			if (local35 >= 0) {
				@Pc(41) int local41 = local8[local35]++;
				if (local10 < local35) {
					local10 = local35;
				}
			}
		}
		@Pc(66) int[][] local66 = new int[local10 + 1][];
		for (@Pc(68) int local68 = 0; local68 <= local10; local68++) {
			local66[local68] = new int[local8[local68]];
			local8[local68] = 0;
		}
		for (@Pc(91) int local91 = 0; local91 < local18; local91++) {
			@Pc(98) int local98 = this.anIntArray151[local91];
			if (local98 >= 0) {
				local66[local98][local8[local98]++] = local91;
			}
		}
		return local66;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(SIS)V")
	public void method1758(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray33 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt2351; local11++) {
			if (this.aShortArray33[local11] == arg0) {
				this.aShortArray33[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ISBBIISIB)I")
	public int method1759(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray35[this.anInt2351] = (short) arg6;
		this.aShortArray31[this.anInt2351] = (short) arg4;
		this.aShortArray27[this.anInt2351] = (short) arg0;
		this.aByteArray31[this.anInt2351] = arg7;
		this.aByteArray26[this.anInt2351] = arg2;
		this.aShortArray36[this.anInt2351] = arg1;
		this.aByteArray27[this.anInt2351] = arg3;
		this.aShortArray33[this.anInt2351] = arg5;
		return this.anInt2351++;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IIII)V")
	public void method1762(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg1 != 0) {
			local11 = Class363.anIntArray697[arg1];
			local15 = Class363.anIntArray698[arg1];
			for (local17 = 0; local17 < this.anInt2348; local17++) {
				local35 = local15 * this.anIntArray148[local17] + this.anIntArray155[local17] * local11 >> 14;
				this.anIntArray155[local17] = this.anIntArray155[local17] * local15 - this.anIntArray148[local17] * local11 >> 14;
				this.anIntArray148[local17] = local35;
			}
		}
		if (arg0 != 0) {
			local11 = Class363.anIntArray697[arg0];
			local15 = Class363.anIntArray698[arg0];
			for (local17 = 0; local17 < this.anInt2348; local17++) {
				local35 = local15 * this.anIntArray155[local17] - this.anIntArray152[local17] * local11 >> 14;
				this.anIntArray152[local17] = this.anIntArray155[local17] * local11 + this.anIntArray152[local17] * local15 >> 14;
				this.anIntArray155[local17] = local35;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local11 = Class363.anIntArray697[arg2];
		local15 = Class363.anIntArray698[arg2];
		for (local17 = 0; local17 < this.anInt2348; local17++) {
			local35 = local11 * this.anIntArray152[local17] + this.anIntArray148[local17] * local15 >> 14;
			this.anIntArray152[local17] = local15 * this.anIntArray152[local17] - this.anIntArray148[local17] * local11 >> 14;
			this.anIntArray148[local17] = local35;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)V")
	public void method1763() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2348; local7++) {
			this.anIntArray148[local7] <<= 0x2;
			this.anIntArray155[local7] <<= 0x2;
			this.anIntArray152[local7] <<= 0x2;
		}
		if (this.anInt2356 <= 0 || this.anIntArray153 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray153.length; local56++) {
			this.anIntArray153[local56] <<= 0x2;
			this.anIntArray146[local56] <<= 0x2;
			if (this.aByteArray30[local56] != 1) {
				this.anIntArray150[local56] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([BB)V")
	private void method1764(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub15 local14 = new Class2_Sub15(arg0);
		@Pc(19) Class2_Sub15 local19 = new Class2_Sub15(arg0);
		@Pc(24) Class2_Sub15 local24 = new Class2_Sub15(arg0);
		@Pc(29) Class2_Sub15 local29 = new Class2_Sub15(arg0);
		@Pc(34) Class2_Sub15 local34 = new Class2_Sub15(arg0);
		local14.anInt5241 = arg0.length - 18;
		this.anInt2348 = local14.method4294();
		this.anInt2351 = local14.method4294();
		this.anInt2356 = local14.method4325();
		@Pc(59) int local59 = local14.method4325();
		@Pc(63) int local63 = local14.method4325();
		@Pc(67) int local67 = local14.method4325();
		@Pc(71) int local71 = local14.method4325();
		@Pc(75) int local75 = local14.method4325();
		@Pc(79) int local79 = local14.method4294();
		@Pc(83) int local83 = local14.method4294();
		@Pc(87) int local87 = local14.method4294();
		@Pc(91) int local91 = local14.method4294();
		@Pc(100) int local100 = this.anInt2348;
		@Pc(102) int local102 = local100;
		local100 += this.anInt2351;
		@Pc(115) int local115 = local100;
		if (local63 == 255) {
			local100 += this.anInt2351;
		}
		@Pc(127) int local127 = local100;
		if (local71 == 1) {
			local100 += this.anInt2351;
		}
		@Pc(139) int local139 = local100;
		if (local59 == 1) {
			local100 += this.anInt2351;
		}
		@Pc(149) int local149 = local100;
		if (local75 == 1) {
			local100 += this.anInt2348;
		}
		@Pc(161) int local161 = local100;
		if (local67 == 1) {
			local100 += this.anInt2351;
		}
		@Pc(171) int local171 = local100;
		local100 += local91;
		@Pc(177) int local177 = local100;
		local100 += this.anInt2351 * 2;
		@Pc(186) int local186 = local100;
		local100 += this.anInt2356 * 6;
		@Pc(195) int local195 = local100;
		local100 += local79;
		@Pc(201) int local201 = local100;
		local100 += local83;
		if (local63 == 255) {
			this.aByteArray28 = new byte[this.anInt2351];
		} else {
			this.aByte41 = (byte) local63;
		}
		local14.anInt5241 = 0;
		if (this.anInt2356 > 0) {
			this.aByteArray30 = new byte[this.anInt2356];
			this.aShortArray32 = new short[this.anInt2356];
			this.aShortArray29 = new short[this.anInt2356];
			this.aShortArray30 = new short[this.anInt2356];
		}
		if (local59 == 1) {
			this.aShortArray33 = new short[this.anInt2351];
			this.aByteArray26 = new byte[this.anInt2351];
			this.aByteArray31 = new byte[this.anInt2351];
		}
		if (local71 == 1) {
			this.anIntArray149 = new int[this.anInt2351];
		}
		this.anIntArray152 = new int[this.anInt2348];
		if (local67 == 1) {
			this.aByteArray27 = new byte[this.anInt2351];
		}
		this.aShortArray27 = new short[this.anInt2351];
		this.aShortArray35 = new short[this.anInt2351];
		this.aShortArray31 = new short[this.anInt2351];
		this.anIntArray148 = new int[this.anInt2348];
		this.aShortArray36 = new short[this.anInt2351];
		if (local75 == 1) {
			this.anIntArray151 = new int[this.anInt2348];
		}
		this.anIntArray155 = new int[this.anInt2348];
		local19.anInt5241 = local195;
		local24.anInt5241 = local201;
		local29.anInt5241 = local100;
		local34.anInt5241 = local149;
		@Pc(353) int local353 = 0;
		@Pc(355) int local355 = 0;
		@Pc(357) int local357 = 0;
		@Pc(365) int local365;
		@Pc(367) int local367;
		for (@Pc(359) int local359 = 0; local359 < this.anInt2348; local359++) {
			local365 = local14.method4325();
			local367 = 0;
			if ((local365 & 0x1) != 0) {
				local367 = local19.method4289();
			}
			@Pc(377) int local377 = 0;
			if ((local365 & 0x2) != 0) {
				local377 = local24.method4289();
			}
			@Pc(390) int local390 = 0;
			if ((local365 & 0x4) != 0) {
				local390 = local29.method4289();
			}
			this.anIntArray148[local359] = local353 + local367;
			this.anIntArray155[local359] = local377 + local355;
			this.anIntArray152[local359] = local357 + local390;
			local353 = this.anIntArray148[local359];
			local355 = this.anIntArray155[local359];
			local357 = this.anIntArray152[local359];
			if (local75 == 1) {
				this.anIntArray151[local359] = local34.method4325();
			}
		}
		local14.anInt5241 = local177;
		local19.anInt5241 = local139;
		local24.anInt5241 = local115;
		local29.anInt5241 = local161;
		local34.anInt5241 = local127;
		for (local365 = 0; local365 < this.anInt2351; local365++) {
			this.aShortArray36[local365] = (short) local14.method4294();
			if (local59 == 1) {
				local367 = local19.method4325();
				if ((local367 & 0x1) == 1) {
					this.aByteArray31[local365] = 1;
					local7 = true;
				} else {
					this.aByteArray31[local365] = 0;
				}
				if ((local367 & 0x2) == 2) {
					this.aByteArray26[local365] = (byte) (local367 >> 2);
					this.aShortArray33[local365] = this.aShortArray36[local365];
					this.aShortArray36[local365] = 127;
					if (this.aShortArray33[local365] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray26[local365] = -1;
					this.aShortArray33[local365] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray28[local365] = local24.method4304();
			}
			if (local67 == 1) {
				this.aByteArray27[local365] = local29.method4304();
			}
			if (local71 == 1) {
				this.anIntArray149[local365] = local34.method4325();
			}
		}
		local14.anInt5241 = local171;
		this.anInt2343 = -1;
		local19.anInt5241 = local102;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(616) short local616 = 0;
		@Pc(618) short local618 = 0;
		@Pc(626) int local626;
		for (@Pc(620) int local620 = 0; local620 < this.anInt2351; local620++) {
			local626 = local19.method4325();
			if (local626 == 1) {
				local612 = (short) (local618 + local14.method4289());
				local614 = (short) (local612 + local14.method4289());
				local616 = (short) (local614 + local14.method4289());
				local618 = local616;
				this.aShortArray35[local620] = local612;
				this.aShortArray31[local620] = local614;
				this.aShortArray27[local620] = local616;
				if (local612 > this.anInt2343) {
					this.anInt2343 = local612;
				}
				if (local614 > this.anInt2343) {
					this.anInt2343 = local614;
				}
				if (this.anInt2343 < local616) {
					this.anInt2343 = local616;
				}
			}
			if (local626 == 2) {
				local614 = local616;
				local616 = (short) (local14.method4289() + local618);
				this.aShortArray35[local620] = local612;
				local618 = local616;
				this.aShortArray31[local620] = local614;
				this.aShortArray27[local620] = local616;
				if (this.anInt2343 < local616) {
					this.anInt2343 = local616;
				}
			}
			if (local626 == 3) {
				local612 = local616;
				local616 = (short) (local618 + local14.method4289());
				this.aShortArray35[local620] = local612;
				local618 = local616;
				this.aShortArray31[local620] = local614;
				this.aShortArray27[local620] = local616;
				if (local616 > this.anInt2343) {
					this.anInt2343 = local616;
				}
			}
			if (local626 == 4) {
				@Pc(787) short local787 = local612;
				local612 = local614;
				local616 = (short) (local618 + local14.method4289());
				local614 = local787;
				local618 = local616;
				this.aShortArray35[local620] = local612;
				this.aShortArray31[local620] = local787;
				this.aShortArray27[local620] = local616;
				if (this.anInt2343 < local616) {
					this.anInt2343 = local616;
				}
			}
		}
		this.anInt2343++;
		local14.anInt5241 = local186;
		for (local626 = 0; local626 < this.anInt2356; local626++) {
			this.aByteArray30[local626] = 0;
			this.aShortArray30[local626] = (short) local14.method4294();
			this.aShortArray29[local626] = (short) local14.method4294();
			this.aShortArray32[local626] = (short) local14.method4294();
		}
		if (this.aByteArray26 != null) {
			@Pc(887) boolean local887 = false;
			for (@Pc(889) int local889 = 0; local889 < this.anInt2351; local889++) {
				@Pc(898) int local898 = this.aByteArray26[local889] & 0xFF;
				if (local898 != 255) {
					if ((this.aShortArray30[local898] & 0xFFFF) == this.aShortArray35[local889] && (this.aShortArray29[local898] & 0xFFFF) == this.aShortArray31[local889] && this.aShortArray27[local889] == (this.aShortArray32[local898] & 0xFFFF)) {
						this.aByteArray26[local889] = -1;
					} else {
						local887 = true;
					}
				}
			}
			if (!local887) {
				this.aByteArray26 = null;
			}
		}
		if (!local7) {
			this.aByteArray31 = null;
		}
		if (!local9) {
			this.aShortArray33 = null;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)[[I")
	public int[][] method1765() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2351; local12++) {
			@Pc(19) int local19 = this.anIntArray149[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(51) int[][] local51 = new int[local10 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local10; local53++) {
			local51[local53] = new int[local8[local53]];
			local8[local53] = 0;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt2351; local85++) {
			@Pc(92) int local92 = this.anIntArray149[local85];
			if (local92 >= 0) {
				local51[local92][local8[local92]++] = local85;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(SBS)V")
	public void method1767(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2351; local3++) {
			if (arg0 == this.aShortArray36[local3]) {
				this.aShortArray36[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)[[I")
	public int[][] method1768() {
		@Pc(16) int[] local16 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.aClass214Array1.length; local20++) {
			@Pc(28) int local28 = this.aClass214Array1[local20].anInt5959;
			if (local28 >= 0) {
				if (local28 > local18) {
					local18 = local28;
				}
				@Pc(39) int local39 = local16[local28]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local18 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local18; local59++) {
			local57[local59] = new int[local16[local59]];
			local16[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.aClass214Array1.length; local82++) {
			@Pc(90) int local90 = this.aClass214Array1[local82].anInt5959;
			if (local90 >= 0) {
				local57[local90][local16[local90]++] = local82;
			}
		}
		return local57;
	}
}
