import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class22 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "[Lclient!fba;")
	public Class100[] aClass100Array1;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "[Lclient!mb;")
	public Class218[] aClass218Array1;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "[I")
	public int[] anIntArray27;

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "[I")
	public int[] anIntArray28;

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!ao", name = "P", descriptor = "[Lclient!sf;")
	public Class319[] aClass319Array1;

	@OriginalMember(owner = "client!ao", name = "Q", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!ao", name = "T", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!ao", name = "U", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!ao", name = "W", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!ao", name = "Z", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!ao", name = "cb", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!ao", name = "db", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
	public int anInt506 = 0;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	public int anInt502 = 0;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
	public int anInt513 = 0;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
	public int anInt512 = 12;

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
	public int anInt509 = 0;

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "B")
	public byte aByte14 = 0;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	private Class22() {
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "([B)V")
	public Class22(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method535(arg0);
		} else {
			this.method536(arg0);
		}
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(III)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray5 = new byte[arg1];
		this.aByteArray4 = new byte[arg1];
		this.anIntArray27 = new int[arg0];
		this.anIntArray31 = new int[arg1];
		this.anIntArray32 = new int[arg0];
		this.anIntArray28 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray23 = new int[arg2];
			this.anIntArray29 = new int[arg2];
			this.anIntArray30 = new int[arg2];
			this.anIntArray22 = new int[arg2];
			this.aByteArray9 = new byte[arg2];
			this.aShortArray18 = new short[arg2];
			this.aByteArray7 = new byte[arg2];
			this.anIntArray24 = new int[arg2];
			this.anIntArray26 = new int[arg2];
			this.aShortArray17 = new short[arg2];
			this.aShortArray13 = new short[arg2];
			this.aByteArray6 = new byte[arg2];
		}
		this.anIntArray25 = new int[arg0];
		this.aShortArray19 = new short[arg1];
		this.aByteArray8 = new byte[arg1];
		this.aByteArray3 = new byte[arg1];
		this.aShortArray21 = new short[arg1];
		this.aShortArray16 = new short[arg1];
		this.aShortArray14 = new short[arg1];
		this.aShortArray15 = new short[arg1];
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "([Lclient!ao;I)V")
	public Class22(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) int arg1) {
		this.anInt509 = 0;
		this.anInt502 = 0;
		this.anInt513 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte14 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class22 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt502 += local59.anInt502;
				this.anInt509 += local59.anInt509;
				this.anInt513 += local59.anInt513;
				if (local59.aClass319Array1 != null) {
					local36 += local59.aClass319Array1.length;
				}
				if (local59.aClass218Array1 != null) {
					local34 += local59.aClass218Array1.length;
				}
				if (local59.aClass100Array1 != null) {
					local32 += local59.aClass100Array1.length;
				}
				local38 |= local59.aByteArray3 != null;
				local42 |= local59.aByteArray5 != null;
				if (local59.aByteArray4 == null) {
					if (this.aByte14 == -1) {
						this.aByte14 = local59.aByte14;
					}
					if (local59.aByte14 != this.aByte14) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local48 |= local59.anIntArray31 != null;
				local46 |= local59.aShortArray14 != null;
				local44 |= local59.aByteArray8 != null;
			}
		}
		this.aShortArray21 = new short[this.anInt509];
		this.aShortArray22 = new short[this.anInt502];
		if (local48) {
			this.anIntArray31 = new int[this.anInt509];
		}
		if (local38) {
			this.aByteArray3 = new byte[this.anInt509];
		}
		this.anIntArray25 = new int[this.anInt502];
		if (local32 > 0) {
			this.aClass100Array1 = new Class100[local32];
		}
		if (local36 > 0) {
			this.aClass319Array1 = new Class319[local36];
		}
		this.aShortArray20 = new short[this.anInt509];
		this.anIntArray28 = new int[this.anInt502];
		this.aShortArray16 = new short[this.anInt509];
		if (local40) {
			this.aByteArray4 = new byte[this.anInt509];
		}
		if (local46) {
			this.aShortArray14 = new short[this.anInt509];
		}
		this.aShortArray19 = new short[this.anInt509];
		this.anIntArray27 = new int[this.anInt502];
		this.anIntArray32 = new int[this.anInt502];
		this.aShortArray15 = new short[this.anInt509];
		if (this.anInt513 > 0) {
			this.aByteArray6 = new byte[this.anInt513];
			this.anIntArray22 = new int[this.anInt513];
			this.aShortArray17 = new short[this.anInt513];
			this.aByteArray9 = new byte[this.anInt513];
			this.anIntArray29 = new int[this.anInt513];
			this.anIntArray24 = new int[this.anInt513];
			this.aByteArray7 = new byte[this.anInt513];
			this.anIntArray26 = new int[this.anInt513];
			this.aShortArray13 = new short[this.anInt513];
			this.anIntArray30 = new int[this.anInt513];
			this.anIntArray23 = new int[this.anInt513];
			this.aShortArray18 = new short[this.anInt513];
		}
		if (local44) {
			this.aByteArray8 = new byte[this.anInt509];
		}
		if (local34 > 0) {
			this.aClass218Array1 = new Class218[local34];
		}
		if (local42) {
			this.aByteArray5 = new byte[this.anInt509];
		}
		this.anInt509 = 0;
		local34 = 0;
		local36 = 0;
		local32 = 0;
		this.anInt513 = 0;
		this.anInt502 = 0;
		@Pc(617) int local617;
		@Pc(628) int local628;
		for (@Pc(385) int local385 = 0; local385 < arg1; local385++) {
			@Pc(392) short local392 = (short) (0x1 << local385);
			@Pc(396) Class22 local396 = arg0[local385];
			if (local396 != null) {
				@Pc(403) int local403;
				if (local396.aClass319Array1 != null) {
					for (local403 = 0; local403 < local396.aClass319Array1.length; local403++) {
						@Pc(410) Class319 local410 = local396.aClass319Array1[local403];
						this.aClass319Array1[local36++] = local410.method7415(this.anInt509 + local410.anInt8748);
					}
				}
				for (local403 = 0; local403 < local396.anInt509; local403++) {
					if (local38 && local396.aByteArray3 != null) {
						this.aByteArray3[this.anInt509] = local396.aByteArray3[local403];
					}
					if (local40) {
						if (local396.aByteArray4 == null) {
							this.aByteArray4[this.anInt509] = local396.aByte14;
						} else {
							this.aByteArray4[this.anInt509] = local396.aByteArray4[local403];
						}
					}
					if (local42 && local396.aByteArray5 != null) {
						this.aByteArray5[this.anInt509] = local396.aByteArray5[local403];
					}
					if (local46) {
						if (local396.aShortArray14 == null) {
							this.aShortArray14[this.anInt509] = -1;
						} else {
							this.aShortArray14[this.anInt509] = local396.aShortArray14[local403];
						}
					}
					if (local48) {
						if (local396.anIntArray31 == null) {
							this.anIntArray31[this.anInt509] = -1;
						} else {
							this.anIntArray31[this.anInt509] = local396.anIntArray31[local403];
						}
					}
					this.aShortArray15[this.anInt509] = (short) this.method545(local396, local396.aShortArray15[local403], local392);
					this.aShortArray19[this.anInt509] = (short) this.method545(local396, local396.aShortArray19[local403], local392);
					this.aShortArray21[this.anInt509] = (short) this.method545(local396, local396.aShortArray21[local403], local392);
					this.aShortArray20[this.anInt509] = local392;
					this.aShortArray16[this.anInt509] = local396.aShortArray16[local403];
					this.anInt509++;
				}
				@Pc(604) int local604;
				if (local396.aClass100Array1 != null) {
					for (local604 = 0; local604 < local396.aClass100Array1.length; local604++) {
						local617 = this.method545(local396, local396.aClass100Array1[local604].anInt2508, local392);
						local628 = this.method545(local396, local396.aClass100Array1[local604].anInt2511, local392);
						@Pc(639) int local639 = this.method545(local396, local396.aClass100Array1[local604].anInt2499, local392);
						this.aClass100Array1[local32] = local396.aClass100Array1[local604].method2133(local628, local639, local617);
						local32++;
					}
				}
				if (local396.aClass218Array1 != null) {
					for (local604 = 0; local604 < local396.aClass218Array1.length; local604++) {
						local617 = this.method545(local396, local396.aClass218Array1[local604].anInt6151, local392);
						this.aClass218Array1[local34] = local396.aClass218Array1[local604].method5203(local617);
						local34++;
					}
				}
			}
		}
		this.anInt506 = this.anInt502;
		@Pc(705) int local705 = 0;
		for (@Pc(707) int local707 = 0; local707 < arg1; local707++) {
			@Pc(714) short local714 = (short) (0x1 << local707);
			@Pc(718) Class22 local718 = arg0[local707];
			if (local718 != null) {
				for (local617 = 0; local617 < local718.anInt509; local617++) {
					if (local44) {
						this.aByteArray8[local705++] = (byte) (local718.aByteArray8 == null || local718.aByteArray8[local617] == -1 ? -1 : local718.aByteArray8[local617] + this.anInt513);
					}
				}
				for (local628 = 0; local628 < local718.anInt513; local628++) {
					@Pc(771) byte local771 = this.aByteArray7[this.anInt513] = local718.aByteArray7[local628];
					if (local771 == 0) {
						this.aShortArray13[this.anInt513] = (short) this.method545(local718, local718.aShortArray13[local628], local714);
						this.aShortArray18[this.anInt513] = (short) this.method545(local718, local718.aShortArray18[local628], local714);
						this.aShortArray17[this.anInt513] = (short) this.method545(local718, local718.aShortArray17[local628], local714);
					}
					if (local771 >= 1 && local771 <= 3) {
						this.aShortArray13[this.anInt513] = local718.aShortArray13[local628];
						this.aShortArray18[this.anInt513] = local718.aShortArray18[local628];
						this.aShortArray17[this.anInt513] = local718.aShortArray17[local628];
						this.anIntArray22[this.anInt513] = local718.anIntArray22[local628];
						this.anIntArray29[this.anInt513] = local718.anIntArray29[local628];
						this.anIntArray23[this.anInt513] = local718.anIntArray23[local628];
						this.aByteArray6[this.anInt513] = local718.aByteArray6[local628];
						this.aByteArray9[this.anInt513] = local718.aByteArray9[local628];
						this.anIntArray26[this.anInt513] = local718.anIntArray26[local628];
					}
					if (local771 == 2) {
						this.anIntArray30[this.anInt513] = local718.anIntArray30[local628];
						this.anIntArray24[this.anInt513] = local718.anIntArray24[local628];
					}
					this.anInt513++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(SSBSBBSSBS)B")
	public byte method530() {
		if (this.anInt513 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray7[this.anInt513] = 3;
		this.aShortArray13[this.anInt513] = 0;
		this.aShortArray18[this.anInt513] = 32767;
		this.aShortArray17[this.anInt513] = 0;
		this.anIntArray22[this.anInt513] = 1024;
		this.anIntArray29[this.anInt513] = 1024;
		this.anIntArray23[this.anInt513] = 1024;
		this.aByteArray6[this.anInt513] = 0;
		this.aByteArray9[this.anInt513] = 0;
		this.anIntArray26[this.anInt513] = 0;
		return (byte) this.anInt513++;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIZ)I")
	public int method531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt502; local7++) {
			if (arg2 == this.anIntArray27[local7] && arg0 == this.anIntArray28[local7] && this.anIntArray32[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray27[this.anInt502] = arg2;
		this.anIntArray28[this.anInt502] = arg0;
		this.anIntArray32[this.anInt502] = arg1;
		this.anInt506 = this.anInt502 + 1;
		return this.anInt502++;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIBSBBS)I")
	public int method532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray15[this.anInt509] = (short) arg1;
		this.aShortArray19[this.anInt509] = (short) arg2;
		this.aShortArray21[this.anInt509] = (short) arg0;
		this.aByteArray3[this.anInt509] = arg3;
		this.aByteArray8[this.anInt509] = arg6;
		this.aShortArray16[this.anInt509] = arg7;
		this.aByteArray5[this.anInt509] = arg5;
		this.aShortArray14[this.anInt509] = arg4;
		return this.anInt509++;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BIII)V")
	public void method533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(42) int local42;
		if (arg0 != 0) {
			local18 = Class6_Sub1_Sub3.anIntArray56[arg0];
			local22 = Class6_Sub1_Sub3.anIntArray58[arg0];
			for (local24 = 0; local24 < this.anInt502; local24++) {
				local42 = this.anIntArray27[local24] * local22 + this.anIntArray28[local24] * local18 >> 14;
				this.anIntArray28[local24] = this.anIntArray28[local24] * local22 - local18 * this.anIntArray27[local24] >> 14;
				this.anIntArray27[local24] = local42;
			}
		}
		if (arg1 != 0) {
			local18 = Class6_Sub1_Sub3.anIntArray56[arg1];
			local22 = Class6_Sub1_Sub3.anIntArray58[arg1];
			for (local24 = 0; local24 < this.anInt502; local24++) {
				local42 = local22 * this.anIntArray28[local24] - this.anIntArray32[local24] * local18 >> 14;
				this.anIntArray32[local24] = this.anIntArray32[local24] * local22 + local18 * this.anIntArray28[local24] >> 14;
				this.anIntArray28[local24] = local42;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local18 = Class6_Sub1_Sub3.anIntArray56[arg2];
		local22 = Class6_Sub1_Sub3.anIntArray58[arg2];
		for (local24 = 0; local24 < this.anInt502; local24++) {
			local42 = local22 * this.anIntArray27[local24] + local18 * this.anIntArray32[local24] >> 14;
			this.anIntArray32[local24] = this.anIntArray32[local24] * local22 - local18 * this.anIntArray27[local24] >> 14;
			this.anIntArray27[local24] = local42;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V")
	public void method534() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt502; local7++) {
			this.anIntArray27[local7] <<= 0x2;
			this.anIntArray28[local7] <<= 0x2;
			this.anIntArray32[local7] <<= 0x2;
		}
		if (this.anInt513 <= 0 || this.anIntArray22 == null) {
			return;
		}
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray22.length; local49++) {
			this.anIntArray22[local49] <<= 0x2;
			this.anIntArray29[local49] <<= 0x2;
			if (this.aByteArray7[local49] != 1) {
				this.anIntArray23[local49] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B[B)V")
	private void method535(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class6_Sub23 local10 = new Class6_Sub23(arg0);
		@Pc(15) Class6_Sub23 local15 = new Class6_Sub23(arg0);
		@Pc(20) Class6_Sub23 local20 = new Class6_Sub23(arg0);
		@Pc(25) Class6_Sub23 local25 = new Class6_Sub23(arg0);
		@Pc(30) Class6_Sub23 local30 = new Class6_Sub23(arg0);
		@Pc(35) Class6_Sub23 local35 = new Class6_Sub23(arg0);
		@Pc(40) Class6_Sub23 local40 = new Class6_Sub23(arg0);
		local10.anInt9901 = arg0.length - 23;
		this.anInt502 = local10.method8363();
		this.anInt509 = local10.method8363();
		this.anInt513 = local10.method8374();
		@Pc(65) int local65 = local10.method8374();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt9901 -= 7;
			this.anInt512 = local10.method8374();
			local10.anInt9901 += 6;
		}
		@Pc(128) int local128 = local10.method8374();
		@Pc(132) int local132 = local10.method8374();
		@Pc(136) int local136 = local10.method8374();
		@Pc(140) int local140 = local10.method8374();
		@Pc(144) int local144 = local10.method8374();
		@Pc(148) int local148 = local10.method8363();
		@Pc(152) int local152 = local10.method8363();
		@Pc(156) int local156 = local10.method8363();
		@Pc(160) int local160 = local10.method8363();
		@Pc(164) int local164 = local10.method8363();
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(183) int local183;
		if (this.anInt513 > 0) {
			local10.anInt9901 = 0;
			this.aByteArray7 = new byte[this.anInt513];
			for (local183 = 0; local183 < this.anInt513; local183++) {
				@Pc(194) byte local194 = this.aByteArray7[local183] = local10.method8391();
				if (local194 >= 1 && local194 <= 3) {
					local168++;
				}
				if (local194 == 2) {
					local170++;
				}
				if (local194 == 0) {
					local166++;
				}
			}
		}
		local183 = this.anInt513;
		@Pc(221) int local221 = local183;
		local183 += this.anInt502;
		@Pc(228) int local228 = local183;
		if (local74) {
			local183 += this.anInt509;
		}
		@Pc(237) int local237 = local183;
		local183 += this.anInt509;
		@Pc(244) int local244 = local183;
		if (local128 == 255) {
			local183 += this.anInt509;
		}
		@Pc(254) int local254 = local183;
		if (local136 == 1) {
			local183 += this.anInt509;
		}
		@Pc(264) int local264 = local183;
		if (local144 == 1) {
			local183 += this.anInt502;
		}
		@Pc(274) int local274 = local183;
		if (local132 == 1) {
			local183 += this.anInt509;
		}
		@Pc(284) int local284 = local183;
		local183 += local160;
		@Pc(290) int local290 = local183;
		if (local140 == 1) {
			local183 += this.anInt509 * 2;
		}
		@Pc(302) int local302 = local183;
		local183 += local164;
		@Pc(308) int local308 = local183;
		local183 += this.anInt509 * 2;
		@Pc(317) int local317 = local183;
		local183 += local148;
		@Pc(323) int local323 = local183;
		local183 += local152;
		@Pc(329) int local329 = local183;
		local183 += local156;
		@Pc(335) int local335 = local183;
		local183 += local166 * 6;
		@Pc(343) int local343 = local183;
		local183 += local168 * 6;
		@Pc(351) byte local351 = 6;
		if (this.anInt512 == 14) {
			local351 = 7;
		} else if (this.anInt512 >= 15) {
			local351 = 9;
		}
		@Pc(369) int local369 = local183;
		local183 += local351 * local168;
		@Pc(377) int local377 = local183;
		local183 += local168;
		@Pc(383) int local383 = local183;
		local183 += local168;
		@Pc(389) int local389 = local183;
		local183 += local170 * 2 + local168;
		if (local140 == 1) {
			this.aShortArray14 = new short[this.anInt509];
		}
		this.aShortArray21 = new short[this.anInt509];
		this.anIntArray28 = new int[this.anInt502];
		if (local128 == 255) {
			this.aByteArray4 = new byte[this.anInt509];
		} else {
			this.aByte14 = (byte) local128;
		}
		if (local132 == 1) {
			this.aByteArray5 = new byte[this.anInt509];
		}
		if (local136 == 1) {
			this.anIntArray31 = new int[this.anInt509];
		}
		if (local74) {
			this.aByteArray3 = new byte[this.anInt509];
		}
		this.anIntArray27 = new int[this.anInt502];
		this.anIntArray32 = new int[this.anInt502];
		this.aShortArray15 = new short[this.anInt509];
		if (local140 == 1 && this.anInt513 > 0) {
			this.aByteArray8 = new byte[this.anInt509];
		}
		this.aShortArray16 = new short[this.anInt509];
		local10.anInt9901 = local221;
		if (this.anInt513 > 0) {
			this.aShortArray17 = new short[this.anInt513];
			if (local170 > 0) {
				this.anIntArray30 = new int[local170];
				this.anIntArray24 = new int[local170];
			}
			if (local168 > 0) {
				this.anIntArray29 = new int[local168];
				this.aByteArray6 = new byte[local168];
				this.anIntArray26 = new int[local168];
				this.aByteArray9 = new byte[local168];
				this.anIntArray23 = new int[local168];
				this.anIntArray22 = new int[local168];
			}
			this.aShortArray13 = new short[this.anInt513];
			this.aShortArray18 = new short[this.anInt513];
		}
		this.aShortArray19 = new short[this.anInt509];
		if (local144 == 1) {
			this.anIntArray25 = new int[this.anInt502];
		}
		local15.anInt9901 = local317;
		local20.anInt9901 = local323;
		local25.anInt9901 = local329;
		local30.anInt9901 = local264;
		@Pc(588) int local588 = 0;
		@Pc(590) int local590 = 0;
		@Pc(592) int local592 = 0;
		@Pc(600) int local600;
		for (@Pc(594) int local594 = 0; local594 < this.anInt502; local594++) {
			local600 = local10.method8374();
			@Pc(602) int local602 = 0;
			if ((local600 & 0x1) != 0) {
				local602 = local15.method8383();
			}
			@Pc(612) int local612 = 0;
			if ((local600 & 0x2) != 0) {
				local612 = local20.method8383();
			}
			@Pc(622) int local622 = 0;
			if ((local600 & 0x4) != 0) {
				local622 = local25.method8383();
			}
			this.anIntArray27[local594] = local588 + local602;
			this.anIntArray28[local594] = local590 + local612;
			this.anIntArray32[local594] = local592 + local622;
			local588 = this.anIntArray27[local594];
			local592 = this.anIntArray32[local594];
			local590 = this.anIntArray28[local594];
			if (local144 == 1) {
				this.anIntArray25[local594] = local30.method8374();
			}
		}
		local10.anInt9901 = local308;
		local15.anInt9901 = local228;
		local20.anInt9901 = local244;
		local25.anInt9901 = local274;
		local30.anInt9901 = local254;
		local35.anInt9901 = local290;
		local40.anInt9901 = local302;
		for (local600 = 0; local600 < this.anInt509; local600++) {
			this.aShortArray16[local600] = (short) local10.method8363();
			if (local74) {
				this.aByteArray3[local600] = local15.method8391();
			}
			if (local128 == 255) {
				this.aByteArray4[local600] = local20.method8391();
			}
			if (local132 == 1) {
				this.aByteArray5[local600] = local25.method8391();
			}
			if (local136 == 1) {
				this.anIntArray31[local600] = local30.method8374();
			}
			if (local140 == 1) {
				this.aShortArray14[local600] = (short) (local35.method8363() - 1);
			}
			if (this.aByteArray8 != null) {
				if (this.aShortArray14[local600] == -1) {
					this.aByteArray8[local600] = -1;
				} else {
					this.aByteArray8[local600] = (byte) (local40.method8374() - 1);
				}
			}
		}
		this.anInt506 = -1;
		local10.anInt9901 = local284;
		local15.anInt9901 = local237;
		@Pc(813) short local813 = 0;
		@Pc(815) short local815 = 0;
		@Pc(817) short local817 = 0;
		@Pc(819) short local819 = 0;
		@Pc(827) int local827;
		for (@Pc(821) int local821 = 0; local821 < this.anInt509; local821++) {
			local827 = local15.method8374();
			if (local827 == 1) {
				local813 = (short) (local10.method8383() + local819);
				local815 = (short) (local10.method8383() + local813);
				local817 = (short) (local10.method8383() + local815);
				this.aShortArray15[local821] = local813;
				local819 = local817;
				this.aShortArray19[local821] = local815;
				this.aShortArray21[local821] = local817;
				if (this.anInt506 < local813) {
					this.anInt506 = local813;
				}
				if (local815 > this.anInt506) {
					this.anInt506 = local815;
				}
				if (this.anInt506 < local817) {
					this.anInt506 = local817;
				}
			}
			if (local827 == 2) {
				local815 = local817;
				local817 = (short) (local819 + local10.method8383());
				local819 = local817;
				this.aShortArray15[local821] = local813;
				this.aShortArray19[local821] = local815;
				this.aShortArray21[local821] = local817;
				if (local817 > this.anInt506) {
					this.anInt506 = local817;
				}
			}
			if (local827 == 3) {
				local813 = local817;
				local817 = (short) (local10.method8383() + local819);
				local819 = local817;
				this.aShortArray15[local821] = local813;
				this.aShortArray19[local821] = local815;
				this.aShortArray21[local821] = local817;
				if (this.anInt506 < local817) {
					this.anInt506 = local817;
				}
			}
			if (local827 == 4) {
				@Pc(986) short local986 = local813;
				local813 = local815;
				local817 = (short) (local819 + local10.method8383());
				local815 = local986;
				this.aShortArray15[local821] = local813;
				local819 = local817;
				this.aShortArray19[local821] = local986;
				this.aShortArray21[local821] = local817;
				if (this.anInt506 < local817) {
					this.anInt506 = local817;
				}
			}
		}
		local10.anInt9901 = local335;
		this.anInt506++;
		local15.anInt9901 = local343;
		local20.anInt9901 = local369;
		local25.anInt9901 = local377;
		local30.anInt9901 = local383;
		local35.anInt9901 = local389;
		@Pc(1069) int local1069;
		for (local827 = 0; local827 < this.anInt513; local827++) {
			local1069 = this.aByteArray7[local827] & 0xFF;
			if (local1069 == 0) {
				this.aShortArray13[local827] = (short) local10.method8363();
				this.aShortArray18[local827] = (short) local10.method8363();
				this.aShortArray17[local827] = (short) local10.method8363();
			}
			if (local1069 == 1) {
				this.aShortArray13[local827] = (short) local15.method8363();
				this.aShortArray18[local827] = (short) local15.method8363();
				this.aShortArray17[local827] = (short) local15.method8363();
				if (this.anInt512 < 15) {
					this.anIntArray22[local827] = local20.method8363();
					if (this.anInt512 < 14) {
						this.anIntArray29[local827] = local20.method8363();
					} else {
						this.anIntArray29[local827] = local20.method8344();
					}
					this.anIntArray23[local827] = local20.method8363();
				} else {
					this.anIntArray22[local827] = local20.method8344();
					this.anIntArray29[local827] = local20.method8344();
					this.anIntArray23[local827] = local20.method8344();
				}
				this.aByteArray6[local827] = local25.method8391();
				this.aByteArray9[local827] = local30.method8391();
				this.anIntArray26[local827] = local35.method8391();
			}
			if (local1069 == 2) {
				this.aShortArray13[local827] = (short) local15.method8363();
				this.aShortArray18[local827] = (short) local15.method8363();
				this.aShortArray17[local827] = (short) local15.method8363();
				if (this.anInt512 < 15) {
					this.anIntArray22[local827] = local20.method8363();
					if (this.anInt512 >= 14) {
						this.anIntArray29[local827] = local20.method8344();
					} else {
						this.anIntArray29[local827] = local20.method8363();
					}
					this.anIntArray23[local827] = local20.method8363();
				} else {
					this.anIntArray22[local827] = local20.method8344();
					this.anIntArray29[local827] = local20.method8344();
					this.anIntArray23[local827] = local20.method8344();
				}
				this.aByteArray6[local827] = local25.method8391();
				this.aByteArray9[local827] = local30.method8391();
				this.anIntArray26[local827] = local35.method8391();
				this.anIntArray30[local827] = local35.method8391();
				this.anIntArray24[local827] = local35.method8391();
			}
			if (local1069 == 3) {
				this.aShortArray13[local827] = (short) local15.method8363();
				this.aShortArray18[local827] = (short) local15.method8363();
				this.aShortArray17[local827] = (short) local15.method8363();
				if (this.anInt512 >= 15) {
					this.anIntArray22[local827] = local20.method8344();
					this.anIntArray29[local827] = local20.method8344();
					this.anIntArray23[local827] = local20.method8344();
				} else {
					this.anIntArray22[local827] = local20.method8363();
					if (this.anInt512 < 14) {
						this.anIntArray29[local827] = local20.method8363();
					} else {
						this.anIntArray29[local827] = local20.method8344();
					}
					this.anIntArray23[local827] = local20.method8363();
				}
				this.aByteArray6[local827] = local25.method8391();
				this.aByteArray9[local827] = local30.method8391();
				this.anIntArray26[local827] = local35.method8391();
			}
		}
		local10.anInt9901 = local183;
		@Pc(1469) int local1469;
		@Pc(1475) int local1475;
		@Pc(1479) int local1479;
		@Pc(1541) int local1541;
		if (local85) {
			local1069 = local10.method8374();
			if (local1069 > 0) {
				this.aClass100Array1 = new Class100[local1069];
				for (local1469 = 0; local1469 < local1069; local1469++) {
					local1475 = local10.method8363();
					local1479 = local10.method8363();
					@Pc(1487) byte local1487;
					if (local128 == 255) {
						local1487 = this.aByteArray4[local1479];
					} else {
						local1487 = (byte) local128;
					}
					this.aClass100Array1[local1469] = new Class100(local1475, this.aShortArray15[local1479], this.aShortArray19[local1479], this.aShortArray21[local1479], local1487);
				}
			}
			local1469 = local10.method8374();
			if (local1469 > 0) {
				this.aClass218Array1 = new Class218[local1469];
				for (local1475 = 0; local1475 < local1469; local1475++) {
					local1479 = local10.method8363();
					local1541 = local10.method8363();
					this.aClass218Array1[local1475] = new Class218(local1479, local1541);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1069 = local10.method8374();
		if (local1069 <= 0) {
			return;
		}
		this.aClass319Array1 = new Class319[local1069];
		for (local1469 = 0; local1469 < local1069; local1469++) {
			local1475 = local10.method8363();
			local1479 = local10.method8363();
			local1541 = local10.method8374();
			@Pc(1593) byte local1593 = local10.method8391();
			this.aClass319Array1[local1469] = new Class319(local1475, local1479, local1541, local1593);
		}
		return;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B[B)V")
	private void method536(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub23 local14 = new Class6_Sub23(arg0);
		@Pc(19) Class6_Sub23 local19 = new Class6_Sub23(arg0);
		@Pc(24) Class6_Sub23 local24 = new Class6_Sub23(arg0);
		@Pc(29) Class6_Sub23 local29 = new Class6_Sub23(arg0);
		@Pc(34) Class6_Sub23 local34 = new Class6_Sub23(arg0);
		local14.anInt9901 = arg0.length - 18;
		this.anInt502 = local14.method8363();
		this.anInt509 = local14.method8363();
		this.anInt513 = local14.method8374();
		@Pc(59) int local59 = local14.method8374();
		@Pc(63) int local63 = local14.method8374();
		@Pc(67) int local67 = local14.method8374();
		@Pc(71) int local71 = local14.method8374();
		@Pc(75) int local75 = local14.method8374();
		@Pc(79) int local79 = local14.method8363();
		@Pc(83) int local83 = local14.method8363();
		@Pc(87) int local87 = local14.method8363();
		@Pc(91) int local91 = local14.method8363();
		@Pc(100) int local100 = this.anInt502;
		@Pc(102) int local102 = local100;
		local100 += this.anInt509;
		@Pc(113) int local113 = local100;
		if (local63 == 255) {
			local100 += this.anInt509;
		}
		@Pc(123) int local123 = local100;
		if (local71 == 1) {
			local100 += this.anInt509;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt509;
		}
		@Pc(145) int local145 = local100;
		if (local75 == 1) {
			local100 += this.anInt502;
		}
		@Pc(157) int local157 = local100;
		if (local67 == 1) {
			local100 += this.anInt509;
		}
		@Pc(167) int local167 = local100;
		local100 += local91;
		@Pc(173) int local173 = local100;
		local100 += this.anInt509 * 2;
		@Pc(182) int local182 = local100;
		local100 += this.anInt513 * 6;
		@Pc(191) int local191 = local100;
		local100 += local79;
		@Pc(197) int local197 = local100;
		local100 += local83;
		if (local75 == 1) {
			this.anIntArray25 = new int[this.anInt502];
		}
		if (local59 == 1) {
			this.aShortArray14 = new short[this.anInt509];
			this.aByteArray8 = new byte[this.anInt509];
			this.aByteArray3 = new byte[this.anInt509];
		}
		this.aShortArray21 = new short[this.anInt509];
		if (local71 == 1) {
			this.anIntArray31 = new int[this.anInt509];
		}
		if (this.anInt513 > 0) {
			this.aShortArray13 = new short[this.anInt513];
			this.aShortArray17 = new short[this.anInt513];
			this.aByteArray7 = new byte[this.anInt513];
			this.aShortArray18 = new short[this.anInt513];
		}
		local14.anInt9901 = 0;
		this.anIntArray32 = new int[this.anInt502];
		this.aShortArray16 = new short[this.anInt509];
		this.aShortArray19 = new short[this.anInt509];
		if (local67 == 1) {
			this.aByteArray5 = new byte[this.anInt509];
		}
		if (local63 == 255) {
			this.aByteArray4 = new byte[this.anInt509];
		} else {
			this.aByte14 = (byte) local63;
		}
		this.anIntArray27 = new int[this.anInt502];
		this.anIntArray28 = new int[this.anInt502];
		this.aShortArray15 = new short[this.anInt509];
		local19.anInt9901 = local191;
		local24.anInt9901 = local197;
		local29.anInt9901 = local100;
		local34.anInt9901 = local145;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(350) int local350 = 0; local350 < this.anInt502; local350++) {
			local356 = local14.method8374();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method8383();
			}
			@Pc(371) int local371 = 0;
			if ((local356 & 0x2) != 0) {
				local371 = local24.method8383();
			}
			@Pc(384) int local384 = 0;
			if ((local356 & 0x4) != 0) {
				local384 = local29.method8383();
			}
			this.anIntArray27[local350] = local344 + local358;
			this.anIntArray28[local350] = local346 + local371;
			this.anIntArray32[local350] = local348 + local384;
			local344 = this.anIntArray27[local350];
			local348 = this.anIntArray32[local350];
			local346 = this.anIntArray28[local350];
			if (local75 == 1) {
				this.anIntArray25[local350] = local34.method8374();
			}
		}
		local14.anInt9901 = local173;
		local19.anInt9901 = local133;
		local24.anInt9901 = local113;
		local29.anInt9901 = local157;
		local34.anInt9901 = local123;
		for (local356 = 0; local356 < this.anInt509; local356++) {
			this.aShortArray16[local356] = (short) local14.method8363();
			if (local59 == 1) {
				local358 = local19.method8374();
				if ((local358 & 0x1) == 1) {
					local7 = true;
					this.aByteArray3[local356] = 1;
				} else {
					this.aByteArray3[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray8[local356] = (byte) (local358 >> 2);
					this.aShortArray14[local356] = this.aShortArray16[local356];
					this.aShortArray16[local356] = 127;
					if (this.aShortArray14[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray8[local356] = -1;
					this.aShortArray14[local356] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray4[local356] = local24.method8391();
			}
			if (local67 == 1) {
				this.aByteArray5[local356] = local29.method8391();
			}
			if (local71 == 1) {
				this.anIntArray31[local356] = local34.method8374();
			}
		}
		this.anInt506 = -1;
		local14.anInt9901 = local167;
		local19.anInt9901 = local102;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(614) int local614;
		for (@Pc(608) int local608 = 0; local608 < this.anInt509; local608++) {
			local614 = local19.method8374();
			if (local614 == 1) {
				local600 = (short) (local606 + local14.method8383());
				local602 = (short) (local600 + local14.method8383());
				local604 = (short) (local602 + local14.method8383());
				local606 = local604;
				this.aShortArray15[local608] = local600;
				this.aShortArray19[local608] = local602;
				this.aShortArray21[local608] = local604;
				if (local600 > this.anInt506) {
					this.anInt506 = local600;
				}
				if (local602 > this.anInt506) {
					this.anInt506 = local602;
				}
				if (local604 > this.anInt506) {
					this.anInt506 = local604;
				}
			}
			if (local614 == 2) {
				local602 = local604;
				local604 = (short) (local14.method8383() + local606);
				local606 = local604;
				this.aShortArray15[local608] = local600;
				this.aShortArray19[local608] = local602;
				this.aShortArray21[local608] = local604;
				if (this.anInt506 < local604) {
					this.anInt506 = local604;
				}
			}
			if (local614 == 3) {
				local600 = local604;
				local604 = (short) (local14.method8383() + local606);
				this.aShortArray15[local608] = local600;
				local606 = local604;
				this.aShortArray19[local608] = local602;
				this.aShortArray21[local608] = local604;
				if (this.anInt506 < local604) {
					this.anInt506 = local604;
				}
			}
			if (local614 == 4) {
				@Pc(769) short local769 = local600;
				local600 = local602;
				local602 = local769;
				local604 = (short) (local606 + local14.method8383());
				local606 = local604;
				this.aShortArray15[local608] = local600;
				this.aShortArray19[local608] = local769;
				this.aShortArray21[local608] = local604;
				if (this.anInt506 < local604) {
					this.anInt506 = local604;
				}
			}
		}
		this.anInt506++;
		local14.anInt9901 = local182;
		for (local614 = 0; local614 < this.anInt513; local614++) {
			this.aByteArray7[local614] = 0;
			this.aShortArray13[local614] = (short) local14.method8363();
			this.aShortArray18[local614] = (short) local14.method8363();
			this.aShortArray17[local614] = (short) local14.method8363();
		}
		if (this.aByteArray8 != null) {
			@Pc(869) boolean local869 = false;
			for (@Pc(871) int local871 = 0; local871 < this.anInt509; local871++) {
				@Pc(880) int local880 = this.aByteArray8[local871] & 0xFF;
				if (local880 != 255) {
					if (this.aShortArray15[local871] == (this.aShortArray13[local880] & 0xFFFF) && this.aShortArray19[local871] == (this.aShortArray18[local880] & 0xFFFF) && this.aShortArray21[local871] == (this.aShortArray17[local880] & 0xFFFF)) {
						this.aByteArray8[local871] = -1;
					} else {
						local869 = true;
					}
				}
			}
			if (!local869) {
				this.aByteArray8 = null;
			}
		}
		if (!local7) {
			this.aByteArray3 = null;
		}
		if (!local9) {
			this.aShortArray14 = null;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZI)[[I")
	public int[][] method537(@OriginalArg(0) boolean arg0) {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = arg0 ? this.anInt502 : this.anInt506;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(32) int local32 = this.anIntArray25[local25];
			if (local32 >= 0) {
				if (local15 < local32) {
					local15 = local32;
				}
				@Pc(50) int local50 = local13[local32]++;
			}
		}
		@Pc(62) int[][] local62 = new int[local15 + 1][];
		for (@Pc(64) int local64 = 0; local64 <= local15; local64++) {
			local62[local64] = new int[local13[local64]];
			local13[local64] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < local23; local83++) {
			@Pc(90) int local90 = this.anIntArray25[local83];
			if (local90 >= 0) {
				local62[local90][local13[local90]++] = local83;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ISS)V")
	public void method538(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray14 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt509; local15++) {
			if (this.aShortArray14[local15] == arg1) {
				this.aShortArray14[local15] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZIII)V")
	public void method539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt502; local3++) {
			this.anIntArray27[local3] += arg2;
			this.anIntArray28[local3] += arg1;
			this.anIntArray32[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)[[I")
	public int[][] method541() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass319Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass319Array1[local12].anInt8749;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(35) int local35 = local8[local20]++;
			}
		}
		@Pc(53) int[][] local53 = new int[local10 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local10; local55++) {
			local53[local55] = new int[local8[local55]];
			local8[local55] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass319Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass319Array1[local78].anInt8749;
			if (local86 >= 0) {
				local53[local86][local8[local86]++] = local78;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(SZS)V")
	public void method542(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt509; local7++) {
			if (arg1 == this.aShortArray16[local7]) {
				this.aShortArray16[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)[[I")
	public int[][] method544() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt509; local17++) {
			@Pc(24) int local24 = this.anIntArray31[local17];
			if (local24 >= 0) {
				@Pc(33) int local33 = local8[local24]++;
				if (local15 < local24) {
					local15 = local24;
				}
			}
		}
		@Pc(51) int[][] local51 = new int[local15 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local15; local53++) {
			local51[local53] = new int[local8[local53]];
			local8[local53] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt509; local72++) {
			@Pc(79) int local79 = this.anIntArray31[local72];
			if (local79 >= 0) {
				local51[local79][local8[local79]++] = local72;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!ao;ZIS)I")
	private int method545(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg0.anIntArray27[arg1];
		@Pc(15) int local15 = arg0.anIntArray28[arg1];
		@Pc(26) int local26 = arg0.anIntArray32[arg1];
		for (@Pc(28) int local28 = 0; local28 < this.anInt502; local28++) {
			if (local10 == this.anIntArray27[local28] && this.anIntArray28[local28] == local15 && this.anIntArray32[local28] == local26) {
				this.aShortArray22[local28] |= arg2;
				return local28;
			}
		}
		this.anIntArray27[this.anInt502] = local10;
		this.anIntArray28[this.anInt502] = local15;
		this.anIntArray32[this.anInt502] = local26;
		this.aShortArray22[this.anInt502] = arg2;
		this.anIntArray25[this.anInt502] = arg0.anIntArray25 == null ? -1 : arg0.anIntArray25[arg1];
		return this.anInt502++;
	}
}
