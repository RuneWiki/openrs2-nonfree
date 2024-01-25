import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class13 {

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "[Lclient!il;")
	public Class163[] aClass163Array1;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "[Lclient!gda;")
	public Class122[] aClass122Array1;

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!ak", name = "G", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!ak", name = "H", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!ak", name = "L", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!ak", name = "O", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!ak", name = "Q", descriptor = "[Lclient!rca;")
	public Class293[] aClass293Array1;

	@OriginalMember(owner = "client!ak", name = "W", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!ak", name = "X", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!ak", name = "Z", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!ak", name = "cb", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!ak", name = "eb", descriptor = "[I")
	public int[] anIntArray41;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public int anInt315 = 0;

	@OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
	public int anInt327 = 0;

	@OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
	public int anInt325 = 0;

	@OriginalMember(owner = "client!ak", name = "Y", descriptor = "B")
	public byte aByte2 = 0;

	@OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
	public int anInt319 = 12;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	public int anInt316 = 0;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "([B)V")
	public Class13(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method234(arg0);
		} else {
			this.method246(arg0);
		}
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(III)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray10 = new byte[arg1];
		if (arg2 > 0) {
			this.anIntArray31 = new int[arg2];
			this.aShortArray19 = new short[arg2];
			this.aShortArray27 = new short[arg2];
			this.anIntArray39 = new int[arg2];
			this.anIntArray41 = new int[arg2];
			this.anIntArray36 = new int[arg2];
			this.anIntArray38 = new int[arg2];
			this.aByteArray6 = new byte[arg2];
			this.anIntArray40 = new int[arg2];
			this.aShortArray24 = new short[arg2];
			this.aByteArray9 = new byte[arg2];
			this.aByteArray8 = new byte[arg2];
		}
		this.aShortArray26 = new short[arg1];
		this.anIntArray32 = new int[arg0];
		this.aByteArray11 = new byte[arg1];
		this.aShortArray22 = new short[arg1];
		this.aByteArray12 = new byte[arg1];
		this.anIntArray35 = new int[arg0];
		this.aShortArray20 = new short[arg1];
		this.anIntArray33 = new int[arg0];
		this.aShortArray21 = new short[arg1];
		this.anIntArray34 = new int[arg0];
		this.anIntArray37 = new int[arg1];
		this.aShortArray18 = new short[arg1];
		this.aByteArray7 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "([Lclient!ak;I)V")
	public Class13(@OriginalArg(0) Class13[] arg0, @OriginalArg(1) int arg1) {
		this.anInt315 = 0;
		this.anInt327 = 0;
		this.anInt316 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte2 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class13 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt315 += local59.anInt315;
				this.anInt316 += local59.anInt316;
				this.anInt327 += local59.anInt327;
				if (local59.aClass293Array1 != null) {
					local32 += local59.aClass293Array1.length;
				}
				if (local59.aClass122Array1 != null) {
					local36 += local59.aClass122Array1.length;
				}
				if (local59.aClass163Array1 != null) {
					local34 += local59.aClass163Array1.length;
				}
				local38 |= local59.aByteArray10 != null;
				local51 |= local59.anIntArray37 != null;
				local44 |= local59.aByteArray7 != null;
				local42 |= local59.aByteArray11 != null;
				if (local59.aByteArray12 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local59.aByte2;
					}
					if (local59.aByte2 != this.aByte2) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray22 != null;
			}
		}
		this.aShortArray21 = new short[this.anInt315];
		this.aShortArray20 = new short[this.anInt315];
		if (local36 > 0) {
			this.aClass122Array1 = new Class122[local36];
		}
		this.aShortArray26 = new short[this.anInt315];
		if (local51) {
			this.anIntArray37 = new int[this.anInt315];
		}
		if (local32 > 0) {
			this.aClass293Array1 = new Class293[local32];
		}
		if (local38) {
			this.aByteArray10 = new byte[this.anInt315];
		}
		if (local34 > 0) {
			this.aClass163Array1 = new Class163[local34];
		}
		this.anIntArray35 = new int[this.anInt327];
		if (local40) {
			this.aByteArray12 = new byte[this.anInt315];
		}
		if (local44) {
			this.aByteArray7 = new byte[this.anInt315];
		}
		this.aShortArray18 = new short[this.anInt315];
		this.aShortArray23 = new short[this.anInt315];
		if (local46) {
			this.aShortArray22 = new short[this.anInt315];
		}
		this.anIntArray32 = new int[this.anInt327];
		if (this.anInt316 > 0) {
			this.aShortArray24 = new short[this.anInt316];
			this.aByteArray9 = new byte[this.anInt316];
			this.aByteArray6 = new byte[this.anInt316];
			this.anIntArray38 = new int[this.anInt316];
			this.aByteArray8 = new byte[this.anInt316];
			this.anIntArray31 = new int[this.anInt316];
			this.aShortArray19 = new short[this.anInt316];
			this.anIntArray41 = new int[this.anInt316];
			this.anIntArray40 = new int[this.anInt316];
			this.anIntArray39 = new int[this.anInt316];
			this.anIntArray36 = new int[this.anInt316];
			this.aShortArray27 = new short[this.anInt316];
		}
		this.anIntArray33 = new int[this.anInt327];
		this.aShortArray25 = new short[this.anInt327];
		this.anIntArray34 = new int[this.anInt327];
		if (local42) {
			this.aByteArray11 = new byte[this.anInt315];
		}
		local32 = 0;
		this.anInt316 = 0;
		this.anInt327 = 0;
		local34 = 0;
		local36 = 0;
		this.anInt315 = 0;
		@Pc(608) int local608;
		@Pc(619) int local619;
		for (@Pc(376) int local376 = 0; local376 < arg1; local376++) {
			@Pc(383) short local383 = (short) (0x1 << local376);
			@Pc(387) Class13 local387 = arg0[local376];
			if (local387 != null) {
				@Pc(394) int local394;
				if (local387.aClass122Array1 != null) {
					for (local394 = 0; local394 < local387.aClass122Array1.length; local394++) {
						@Pc(401) Class122 local401 = local387.aClass122Array1[local394];
						this.aClass122Array1[local36++] = local401.method2189(local401.anInt2551 + this.anInt315);
					}
				}
				for (local394 = 0; local394 < local387.anInt315; local394++) {
					if (local38 && local387.aByteArray10 != null) {
						this.aByteArray10[this.anInt315] = local387.aByteArray10[local394];
					}
					if (local40) {
						if (local387.aByteArray12 == null) {
							this.aByteArray12[this.anInt315] = local387.aByte2;
						} else {
							this.aByteArray12[this.anInt315] = local387.aByteArray12[local394];
						}
					}
					if (local42 && local387.aByteArray11 != null) {
						this.aByteArray11[this.anInt315] = local387.aByteArray11[local394];
					}
					if (local46) {
						if (local387.aShortArray22 == null) {
							this.aShortArray22[this.anInt315] = -1;
						} else {
							this.aShortArray22[this.anInt315] = local387.aShortArray22[local394];
						}
					}
					if (local51) {
						if (local387.anIntArray37 == null) {
							this.anIntArray37[this.anInt315] = -1;
						} else {
							this.anIntArray37[this.anInt315] = local387.anIntArray37[local394];
						}
					}
					this.aShortArray26[this.anInt315] = (short) this.method232(local387, local387.aShortArray26[local394], local383);
					this.aShortArray20[this.anInt315] = (short) this.method232(local387, local387.aShortArray20[local394], local383);
					this.aShortArray18[this.anInt315] = (short) this.method232(local387, local387.aShortArray18[local394], local383);
					this.aShortArray23[this.anInt315] = local383;
					this.aShortArray21[this.anInt315] = local387.aShortArray21[local394];
					this.anInt315++;
				}
				@Pc(595) int local595;
				if (local387.aClass293Array1 != null) {
					for (local595 = 0; local595 < local387.aClass293Array1.length; local595++) {
						local608 = this.method232(local387, local387.aClass293Array1[local595].anInt7304, local383);
						local619 = this.method232(local387, local387.aClass293Array1[local595].anInt7308, local383);
						@Pc(630) int local630 = this.method232(local387, local387.aClass293Array1[local595].anInt7313, local383);
						this.aClass293Array1[local32] = local387.aClass293Array1[local595].method5931(local630, local608, local619);
						local32++;
					}
				}
				if (local387.aClass163Array1 != null) {
					for (local595 = 0; local595 < local387.aClass163Array1.length; local595++) {
						local608 = this.method232(local387, local387.aClass163Array1[local595].anInt3821, local383);
						this.aClass163Array1[local34] = local387.aClass163Array1[local595].method3311(local608);
						local34++;
					}
				}
			}
		}
		this.anInt325 = this.anInt327;
		@Pc(704) int local704 = 0;
		for (@Pc(706) int local706 = 0; local706 < arg1; local706++) {
			@Pc(713) short local713 = (short) (0x1 << local706);
			@Pc(717) Class13 local717 = arg0[local706];
			if (local717 != null) {
				for (local608 = 0; local608 < local717.anInt315; local608++) {
					if (local44) {
						this.aByteArray7[local704++] = (byte) (local717.aByteArray7 == null || local717.aByteArray7[local608] == -1 ? -1 : this.anInt316 + local717.aByteArray7[local608]);
					}
				}
				for (local619 = 0; local619 < local717.anInt316; local619++) {
					@Pc(770) byte local770 = this.aByteArray9[this.anInt316] = local717.aByteArray9[local619];
					if (local770 == 0) {
						this.aShortArray19[this.anInt316] = (short) this.method232(local717, local717.aShortArray19[local619], local713);
						this.aShortArray24[this.anInt316] = (short) this.method232(local717, local717.aShortArray24[local619], local713);
						this.aShortArray27[this.anInt316] = (short) this.method232(local717, local717.aShortArray27[local619], local713);
					}
					if (local770 >= 1 && local770 <= 3) {
						this.aShortArray19[this.anInt316] = local717.aShortArray19[local619];
						this.aShortArray24[this.anInt316] = local717.aShortArray24[local619];
						this.aShortArray27[this.anInt316] = local717.aShortArray27[local619];
						this.anIntArray41[this.anInt316] = local717.anIntArray41[local619];
						this.anIntArray39[this.anInt316] = local717.anIntArray39[local619];
						this.anIntArray38[this.anInt316] = local717.anIntArray38[local619];
						this.aByteArray8[this.anInt316] = local717.aByteArray8[local619];
						this.aByteArray6[this.anInt316] = local717.aByteArray6[local619];
						this.anIntArray40[this.anInt316] = local717.anIntArray40[local619];
					}
					if (local770 == 2) {
						this.anIntArray31[this.anInt316] = local717.anIntArray31[local619];
						this.anIntArray36[this.anInt316] = local717.anIntArray36[local619];
					}
					this.anInt316++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIII)I")
	public int method231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt327; local7++) {
			if (arg2 == this.anIntArray33[local7] && this.anIntArray32[local7] == arg0 && arg1 == this.anIntArray35[local7]) {
				return local7;
			}
		}
		this.anIntArray33[this.anInt327] = arg2;
		this.anIntArray32[this.anInt327] = arg0;
		this.anIntArray35[this.anInt327] = arg1;
		this.anInt325 = this.anInt327 + 1;
		return this.anInt327++;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!ak;BIS)I")
	private int method232(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2) {
		@Pc(15) int local15 = arg0.anIntArray33[arg1];
		@Pc(20) int local20 = arg0.anIntArray32[arg1];
		@Pc(25) int local25 = arg0.anIntArray35[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt327; local27++) {
			if (this.anIntArray33[local27] == local15 && local20 == this.anIntArray32[local27] && local25 == this.anIntArray35[local27]) {
				this.aShortArray25[local27] |= arg2;
				return local27;
			}
		}
		this.anIntArray33[this.anInt327] = local15;
		this.anIntArray32[this.anInt327] = local20;
		this.anIntArray35[this.anInt327] = local25;
		this.aShortArray25[this.anInt327] = arg2;
		this.anIntArray34[this.anInt327] = arg0.anIntArray34 == null ? -1 : arg0.anIntArray34[arg1];
		return this.anInt327++;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B[B)V")
	private void method234(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub7 local10 = new Class2_Sub7(arg0);
		@Pc(15) Class2_Sub7 local15 = new Class2_Sub7(arg0);
		@Pc(20) Class2_Sub7 local20 = new Class2_Sub7(arg0);
		@Pc(25) Class2_Sub7 local25 = new Class2_Sub7(arg0);
		@Pc(30) Class2_Sub7 local30 = new Class2_Sub7(arg0);
		@Pc(35) Class2_Sub7 local35 = new Class2_Sub7(arg0);
		@Pc(40) Class2_Sub7 local40 = new Class2_Sub7(arg0);
		local10.anInt5186 = arg0.length - 23;
		this.anInt327 = local10.method4518();
		this.anInt315 = local10.method4518();
		this.anInt316 = local10.method4464();
		@Pc(65) int local65 = local10.method4464();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt5186 -= 7;
			this.anInt319 = local10.method4464();
			local10.anInt5186 += 6;
		}
		@Pc(132) int local132 = local10.method4464();
		@Pc(143) int local143 = local10.method4464();
		@Pc(149) int local149 = local10.method4464();
		@Pc(153) int local153 = local10.method4464();
		@Pc(157) int local157 = local10.method4464();
		@Pc(161) int local161 = local10.method4518();
		@Pc(167) int local167 = local10.method4518();
		@Pc(171) int local171 = local10.method4518();
		@Pc(177) int local177 = local10.method4518();
		@Pc(183) int local183 = local10.method4518();
		@Pc(185) int local185 = 0;
		@Pc(187) int local187 = 0;
		@Pc(189) int local189 = 0;
		@Pc(205) int local205;
		if (this.anInt316 > 0) {
			this.aByteArray9 = new byte[this.anInt316];
			local10.anInt5186 = 0;
			for (local205 = 0; local205 < this.anInt316; local205++) {
				@Pc(218) byte local218 = this.aByteArray9[local205] = local10.method4477();
				if (local218 >= 1 && local218 <= 3) {
					local187++;
				}
				if (local218 == 0) {
					local185++;
				}
				if (local218 == 2) {
					local189++;
				}
			}
		}
		local205 = this.anInt316;
		@Pc(245) int local245 = local205;
		local205 += this.anInt327;
		@Pc(252) int local252 = local205;
		if (local76) {
			local205 += this.anInt315;
		}
		@Pc(261) int local261 = local205;
		local205 += this.anInt315;
		@Pc(268) int local268 = local205;
		if (local132 == 255) {
			local205 += this.anInt315;
		}
		@Pc(280) int local280 = local205;
		if (local149 == 1) {
			local205 += this.anInt315;
		}
		@Pc(290) int local290 = local205;
		if (local157 == 1) {
			local205 += this.anInt327;
		}
		@Pc(302) int local302 = local205;
		if (local143 == 1) {
			local205 += this.anInt315;
		}
		@Pc(314) int local314 = local205;
		local205 += local177;
		@Pc(320) int local320 = local205;
		if (local153 == 1) {
			local205 += this.anInt315 * 2;
		}
		@Pc(332) int local332 = local205;
		local205 += local183;
		@Pc(338) int local338 = local205;
		local205 += this.anInt315 * 2;
		@Pc(347) int local347 = local205;
		local205 += local161;
		@Pc(353) int local353 = local205;
		local205 += local167;
		@Pc(359) int local359 = local205;
		local205 += local171;
		@Pc(365) int local365 = local205;
		local205 += local185 * 6;
		@Pc(373) int local373 = local205;
		local205 += local187 * 6;
		@Pc(381) byte local381 = 6;
		if (this.anInt319 == 14) {
			local381 = 7;
		} else if (this.anInt319 >= 15) {
			local381 = 9;
		}
		@Pc(401) int local401 = local205;
		local205 += local381 * local187;
		@Pc(409) int local409 = local205;
		local205 += local187;
		@Pc(415) int local415 = local205;
		local205 += local187;
		@Pc(421) int local421 = local205;
		local205 += local189 * 2 + local187;
		this.anIntArray32 = new int[this.anInt327];
		this.anIntArray33 = new int[this.anInt327];
		this.aShortArray20 = new short[this.anInt315];
		if (local153 == 1 && this.anInt316 > 0) {
			this.aByteArray7 = new byte[this.anInt315];
		}
		this.aShortArray26 = new short[this.anInt315];
		if (local132 == 255) {
			this.aByteArray12 = new byte[this.anInt315];
		} else {
			this.aByte2 = (byte) local132;
		}
		this.aShortArray21 = new short[this.anInt315];
		this.anIntArray35 = new int[this.anInt327];
		if (local153 == 1) {
			this.aShortArray22 = new short[this.anInt315];
		}
		local10.anInt5186 = local245;
		if (this.anInt316 > 0) {
			this.aShortArray24 = new short[this.anInt316];
			this.aShortArray27 = new short[this.anInt316];
			if (local189 > 0) {
				this.anIntArray36 = new int[local189];
				this.anIntArray31 = new int[local189];
			}
			this.aShortArray19 = new short[this.anInt316];
			if (local187 > 0) {
				this.anIntArray41 = new int[local187];
				this.aByteArray8 = new byte[local187];
				this.aByteArray6 = new byte[local187];
				this.anIntArray38 = new int[local187];
				this.anIntArray39 = new int[local187];
				this.anIntArray40 = new int[local187];
			}
		}
		if (local76) {
			this.aByteArray10 = new byte[this.anInt315];
		}
		if (local157 == 1) {
			this.anIntArray34 = new int[this.anInt327];
		}
		if (local149 == 1) {
			this.anIntArray37 = new int[this.anInt315];
		}
		this.aShortArray18 = new short[this.anInt315];
		if (local143 == 1) {
			this.aByteArray11 = new byte[this.anInt315];
		}
		local15.anInt5186 = local347;
		local20.anInt5186 = local353;
		local25.anInt5186 = local359;
		local30.anInt5186 = local290;
		@Pc(614) int local614 = 0;
		@Pc(616) int local616 = 0;
		@Pc(618) int local618 = 0;
		@Pc(626) int local626;
		for (@Pc(620) int local620 = 0; local620 < this.anInt327; local620++) {
			local626 = local10.method4464();
			@Pc(628) int local628 = 0;
			if ((local626 & 0x1) != 0) {
				local628 = local15.method4507();
			}
			@Pc(641) int local641 = 0;
			if ((local626 & 0x2) != 0) {
				local641 = local20.method4507();
			}
			@Pc(654) int local654 = 0;
			if ((local626 & 0x4) != 0) {
				local654 = local25.method4507();
			}
			this.anIntArray33[local620] = local628 + local614;
			this.anIntArray32[local620] = local641 + local616;
			this.anIntArray35[local620] = local618 + local654;
			local614 = this.anIntArray33[local620];
			local616 = this.anIntArray32[local620];
			local618 = this.anIntArray35[local620];
			if (local157 == 1) {
				this.anIntArray34[local620] = local30.method4464();
			}
		}
		local10.anInt5186 = local338;
		local15.anInt5186 = local252;
		local20.anInt5186 = local268;
		local25.anInt5186 = local302;
		local30.anInt5186 = local280;
		local35.anInt5186 = local320;
		local40.anInt5186 = local332;
		for (local626 = 0; local626 < this.anInt315; local626++) {
			this.aShortArray21[local626] = (short) local10.method4518();
			if (local76) {
				this.aByteArray10[local626] = local15.method4477();
			}
			if (local132 == 255) {
				this.aByteArray12[local626] = local20.method4477();
			}
			if (local143 == 1) {
				this.aByteArray11[local626] = local25.method4477();
			}
			if (local149 == 1) {
				this.anIntArray37[local626] = local30.method4464();
			}
			if (local153 == 1) {
				this.aShortArray22[local626] = (short) (local35.method4518() - 1);
			}
			if (this.aByteArray7 != null) {
				if (this.aShortArray22[local626] == -1) {
					this.aByteArray7[local626] = -1;
				} else {
					this.aByteArray7[local626] = (byte) (local40.method4464() - 1);
				}
			}
		}
		this.anInt325 = -1;
		local10.anInt5186 = local314;
		local15.anInt5186 = local261;
		@Pc(856) short local856 = 0;
		@Pc(858) short local858 = 0;
		@Pc(860) short local860 = 0;
		@Pc(862) short local862 = 0;
		@Pc(870) int local870;
		for (@Pc(864) int local864 = 0; local864 < this.anInt315; local864++) {
			local870 = local15.method4464();
			if (local870 == 1) {
				local856 = (short) (local10.method4507() + local862);
				local858 = (short) (local10.method4507() + local856);
				local860 = (short) (local10.method4507() + local858);
				this.aShortArray26[local864] = local856;
				local862 = local860;
				this.aShortArray20[local864] = local858;
				this.aShortArray18[local864] = local860;
				if (this.anInt325 < local856) {
					this.anInt325 = local856;
				}
				if (local858 > this.anInt325) {
					this.anInt325 = local858;
				}
				if (local860 > this.anInt325) {
					this.anInt325 = local860;
				}
			}
			if (local870 == 2) {
				local858 = local860;
				local860 = (short) (local862 + local10.method4507());
				local862 = local860;
				this.aShortArray26[local864] = local856;
				this.aShortArray20[local864] = local858;
				this.aShortArray18[local864] = local860;
				if (local860 > this.anInt325) {
					this.anInt325 = local860;
				}
			}
			if (local870 == 3) {
				local856 = local860;
				local860 = (short) (local10.method4507() + local862);
				this.aShortArray26[local864] = local856;
				local862 = local860;
				this.aShortArray20[local864] = local858;
				this.aShortArray18[local864] = local860;
				if (local860 > this.anInt325) {
					this.anInt325 = local860;
				}
			}
			if (local870 == 4) {
				@Pc(1023) short local1023 = local856;
				local856 = local858;
				local860 = (short) (local10.method4507() + local862);
				local858 = local1023;
				this.aShortArray26[local864] = local856;
				local862 = local860;
				this.aShortArray20[local864] = local1023;
				this.aShortArray18[local864] = local860;
				if (local860 > this.anInt325) {
					this.anInt325 = local860;
				}
			}
		}
		local10.anInt5186 = local365;
		this.anInt325++;
		local15.anInt5186 = local373;
		local20.anInt5186 = local401;
		local25.anInt5186 = local409;
		local30.anInt5186 = local415;
		local35.anInt5186 = local421;
		@Pc(1102) int local1102;
		for (local870 = 0; local870 < this.anInt316; local870++) {
			local1102 = this.aByteArray9[local870] & 0xFF;
			if (local1102 == 0) {
				this.aShortArray19[local870] = (short) local10.method4518();
				this.aShortArray24[local870] = (short) local10.method4518();
				this.aShortArray27[local870] = (short) local10.method4518();
			}
			if (local1102 == 1) {
				this.aShortArray19[local870] = (short) local15.method4518();
				this.aShortArray24[local870] = (short) local15.method4518();
				this.aShortArray27[local870] = (short) local15.method4518();
				if (this.anInt319 < 15) {
					this.anIntArray41[local870] = local20.method4518();
					if (this.anInt319 < 14) {
						this.anIntArray39[local870] = local20.method4518();
					} else {
						this.anIntArray39[local870] = local20.method4503();
					}
					this.anIntArray38[local870] = local20.method4518();
				} else {
					this.anIntArray41[local870] = local20.method4503();
					this.anIntArray39[local870] = local20.method4503();
					this.anIntArray38[local870] = local20.method4503();
				}
				this.aByteArray8[local870] = local25.method4477();
				this.aByteArray6[local870] = local30.method4477();
				this.anIntArray40[local870] = local35.method4477();
			}
			if (local1102 == 2) {
				this.aShortArray19[local870] = (short) local15.method4518();
				this.aShortArray24[local870] = (short) local15.method4518();
				this.aShortArray27[local870] = (short) local15.method4518();
				if (this.anInt319 >= 15) {
					this.anIntArray41[local870] = local20.method4503();
					this.anIntArray39[local870] = local20.method4503();
					this.anIntArray38[local870] = local20.method4503();
				} else {
					this.anIntArray41[local870] = local20.method4518();
					if (this.anInt319 >= 14) {
						this.anIntArray39[local870] = local20.method4503();
					} else {
						this.anIntArray39[local870] = local20.method4518();
					}
					this.anIntArray38[local870] = local20.method4518();
				}
				this.aByteArray8[local870] = local25.method4477();
				this.aByteArray6[local870] = local30.method4477();
				this.anIntArray40[local870] = local35.method4477();
				this.anIntArray31[local870] = local35.method4477();
				this.anIntArray36[local870] = local35.method4477();
			}
			if (local1102 == 3) {
				this.aShortArray19[local870] = (short) local15.method4518();
				this.aShortArray24[local870] = (short) local15.method4518();
				this.aShortArray27[local870] = (short) local15.method4518();
				if (this.anInt319 < 15) {
					this.anIntArray41[local870] = local20.method4518();
					if (this.anInt319 < 14) {
						this.anIntArray39[local870] = local20.method4518();
					} else {
						this.anIntArray39[local870] = local20.method4503();
					}
					this.anIntArray38[local870] = local20.method4518();
				} else {
					this.anIntArray41[local870] = local20.method4503();
					this.anIntArray39[local870] = local20.method4503();
					this.anIntArray38[local870] = local20.method4503();
				}
				this.aByteArray8[local870] = local25.method4477();
				this.aByteArray6[local870] = local30.method4477();
				this.anIntArray40[local870] = local35.method4477();
			}
		}
		local10.anInt5186 = local205;
		@Pc(1522) int local1522;
		@Pc(1528) int local1528;
		@Pc(1534) int local1534;
		@Pc(1604) int local1604;
		if (local85) {
			local1102 = local10.method4464();
			if (local1102 > 0) {
				this.aClass293Array1 = new Class293[local1102];
				for (local1522 = 0; local1522 < local1102; local1522++) {
					local1528 = local10.method4518();
					local1534 = local10.method4518();
					@Pc(1544) byte local1544;
					if (local132 == 255) {
						local1544 = this.aByteArray12[local1534];
					} else {
						local1544 = (byte) local132;
					}
					this.aClass293Array1[local1522] = new Class293(local1528, this.aShortArray26[local1534], this.aShortArray20[local1534], this.aShortArray18[local1534], local1544);
				}
			}
			local1522 = local10.method4464();
			if (local1522 > 0) {
				this.aClass163Array1 = new Class163[local1522];
				for (local1528 = 0; local1528 < local1522; local1528++) {
					local1534 = local10.method4518();
					local1604 = local10.method4518();
					this.aClass163Array1[local1528] = new Class163(local1534, local1604);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1102 = local10.method4464();
		if (local1102 <= 0) {
			return;
		}
		this.aClass122Array1 = new Class122[local1102];
		for (local1522 = 0; local1522 < local1102; local1522++) {
			local1528 = local10.method4518();
			local1534 = local10.method4518();
			local1604 = local10.method4464();
			@Pc(1655) byte local1655 = local10.method4477();
			this.aClass122Array1[local1522] = new Class122(local1528, local1534, local1604, local1655);
		}
		return;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(SIS)V")
	public void method235(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt315; local3++) {
			if (arg0 == this.aShortArray21[local3]) {
				this.aShortArray21[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)[[I")
	public int[][] method236() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass122Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass122Array1[local12].anInt2550;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(47) int local47 = 0; local47 <= local10; local47++) {
			local45[local47] = new int[local8[local47]];
			local8[local47] = 0;
		}
		for (@Pc(70) int local70 = 0; local70 < this.aClass122Array1.length; local70++) {
			@Pc(78) int local78 = this.aClass122Array1[local70].anInt2550;
			if (local78 >= 0) {
				local45[local78][local8[local78]++] = local70;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(IIII)V")
	public void method237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt327; local13++) {
			this.anIntArray33[local13] += arg0;
			this.anIntArray32[local13] += arg2;
			this.anIntArray35[local13] += arg1;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIBI)V")
	public void method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(22) int local22;
		@Pc(40) int local40;
		if (arg1 != 0) {
			local16 = Class285.anIntArray476[arg1];
			local20 = Class285.anIntArray475[arg1];
			for (local22 = 0; local22 < this.anInt327; local22++) {
				local40 = local20 * this.anIntArray33[local22] + this.anIntArray32[local22] * local16 >> 14;
				this.anIntArray32[local22] = this.anIntArray32[local22] * local20 - this.anIntArray33[local22] * local16 >> 14;
				this.anIntArray33[local22] = local40;
			}
		}
		if (arg2 != 0) {
			local16 = Class285.anIntArray476[arg2];
			local20 = Class285.anIntArray475[arg2];
			for (local22 = 0; local22 < this.anInt327; local22++) {
				local40 = local20 * this.anIntArray32[local22] - this.anIntArray35[local22] * local16 >> 14;
				this.anIntArray35[local22] = local20 * this.anIntArray35[local22] + local16 * this.anIntArray32[local22] >> 14;
				this.anIntArray32[local22] = local40;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local16 = Class285.anIntArray476[arg0];
		local20 = Class285.anIntArray475[arg0];
		for (local22 = 0; local22 < this.anInt327; local22++) {
			local40 = local20 * this.anIntArray33[local22] + this.anIntArray35[local22] * local16 >> 14;
			this.anIntArray35[local22] = this.anIntArray35[local22] * local20 - this.anIntArray33[local22] * local16 >> 14;
			this.anIntArray33[local22] = local40;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(SBSSIBSBSS)B")
	public byte method239() {
		if (this.anInt316 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray9[this.anInt316] = 3;
		this.aShortArray19[this.anInt316] = 0;
		this.aShortArray24[this.anInt316] = 32767;
		this.aShortArray27[this.anInt316] = 0;
		this.anIntArray41[this.anInt316] = 1024;
		this.anIntArray39[this.anInt316] = 1024;
		this.anIntArray38[this.anInt316] = 1024;
		this.aByteArray8[this.anInt316] = 0;
		this.aByteArray6[this.anInt316] = 0;
		this.anIntArray40[this.anInt316] = 0;
		return (byte) this.anInt316++;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ISS)V")
	public void method241(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray22 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt315; local11++) {
			if (this.aShortArray22[local11] == arg0) {
				this.aShortArray22[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)[[I")
	public int[][] method243(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt327 : this.anInt325;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray34[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(38) int local38 = local8[local27]++;
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < local18; local87++) {
			@Pc(94) int local94 = this.anIntArray34[local87];
			if (local94 >= 0) {
				local54[local94][local8[local94]++] = local87;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBSIIBBSI)I")
	public int method244(@OriginalArg(1) byte arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) short arg6, @OriginalArg(8) int arg7) {
		this.aShortArray26[this.anInt315] = (short) arg3;
		this.aShortArray20[this.anInt315] = (short) arg2;
		this.aShortArray18[this.anInt315] = (short) arg7;
		this.aByteArray10[this.anInt315] = arg0;
		this.aByteArray7[this.anInt315] = arg5;
		this.aShortArray21[this.anInt315] = arg1;
		this.aByteArray11[this.anInt315] = arg4;
		this.aShortArray22[this.anInt315] = arg6;
		return this.anInt315++;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
	public void method245() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt327; local3++) {
			this.anIntArray33[local3] <<= 0x2;
			this.anIntArray32[local3] <<= 0x2;
			this.anIntArray35[local3] <<= 0x2;
		}
		if (this.anInt316 <= 0 || this.anIntArray41 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray41.length; local53++) {
			this.anIntArray41[local53] <<= 0x2;
			this.anIntArray39[local53] <<= 0x2;
			if (this.aByteArray9[local53] != 1) {
				this.anIntArray38[local53] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[B)V")
	private void method246(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub7 local14 = new Class2_Sub7(arg0);
		@Pc(19) Class2_Sub7 local19 = new Class2_Sub7(arg0);
		@Pc(24) Class2_Sub7 local24 = new Class2_Sub7(arg0);
		@Pc(29) Class2_Sub7 local29 = new Class2_Sub7(arg0);
		@Pc(34) Class2_Sub7 local34 = new Class2_Sub7(arg0);
		local14.anInt5186 = arg0.length - 18;
		this.anInt327 = local14.method4518();
		this.anInt315 = local14.method4518();
		this.anInt316 = local14.method4464();
		@Pc(59) int local59 = local14.method4464();
		@Pc(63) int local63 = local14.method4464();
		@Pc(67) int local67 = local14.method4464();
		@Pc(71) int local71 = local14.method4464();
		@Pc(75) int local75 = local14.method4464();
		@Pc(79) int local79 = local14.method4518();
		@Pc(83) int local83 = local14.method4518();
		@Pc(90) int local90 = local14.method4518();
		@Pc(94) int local94 = local14.method4518();
		@Pc(103) int local103 = this.anInt327;
		@Pc(105) int local105 = local103;
		local103 += this.anInt315;
		@Pc(112) int local112 = local103;
		if (local63 == 255) {
			local103 += this.anInt315;
		}
		@Pc(122) int local122 = local103;
		if (local71 == 1) {
			local103 += this.anInt315;
		}
		@Pc(132) int local132 = local103;
		if (local59 == 1) {
			local103 += this.anInt315;
		}
		@Pc(144) int local144 = local103;
		if (local75 == 1) {
			local103 += this.anInt327;
		}
		@Pc(154) int local154 = local103;
		if (local67 == 1) {
			local103 += this.anInt315;
		}
		@Pc(164) int local164 = local103;
		local103 += local94;
		@Pc(170) int local170 = local103;
		local103 += this.anInt315 * 2;
		@Pc(179) int local179 = local103;
		local103 += this.anInt316 * 6;
		@Pc(188) int local188 = local103;
		local103 += local79;
		@Pc(194) int local194 = local103;
		local103 += local83;
		local14.anInt5186 = 0;
		this.anIntArray32 = new int[this.anInt327];
		this.anIntArray35 = new int[this.anInt327];
		if (local75 == 1) {
			this.anIntArray34 = new int[this.anInt327];
		}
		if (local67 == 1) {
			this.aByteArray11 = new byte[this.anInt315];
		}
		this.aShortArray20 = new short[this.anInt315];
		if (this.anInt316 > 0) {
			this.aShortArray24 = new short[this.anInt316];
			this.aShortArray27 = new short[this.anInt316];
			this.aByteArray9 = new byte[this.anInt316];
			this.aShortArray19 = new short[this.anInt316];
		}
		this.aShortArray21 = new short[this.anInt315];
		if (local63 == 255) {
			this.aByteArray12 = new byte[this.anInt315];
		} else {
			this.aByte2 = (byte) local63;
		}
		this.anIntArray33 = new int[this.anInt327];
		if (local59 == 1) {
			this.aByteArray7 = new byte[this.anInt315];
			this.aByteArray10 = new byte[this.anInt315];
			this.aShortArray22 = new short[this.anInt315];
		}
		this.aShortArray18 = new short[this.anInt315];
		if (local71 == 1) {
			this.anIntArray37 = new int[this.anInt315];
		}
		this.aShortArray26 = new short[this.anInt315];
		local19.anInt5186 = local188;
		local24.anInt5186 = local194;
		local29.anInt5186 = local103;
		local34.anInt5186 = local144;
		@Pc(337) int local337 = 0;
		@Pc(339) int local339 = 0;
		@Pc(341) int local341 = 0;
		@Pc(349) int local349;
		@Pc(351) int local351;
		for (@Pc(343) int local343 = 0; local343 < this.anInt327; local343++) {
			local349 = local14.method4464();
			local351 = 0;
			if ((local349 & 0x1) != 0) {
				local351 = local19.method4507();
			}
			@Pc(361) int local361 = 0;
			if ((local349 & 0x2) != 0) {
				local361 = local24.method4507();
			}
			@Pc(371) int local371 = 0;
			if ((local349 & 0x4) != 0) {
				local371 = local29.method4507();
			}
			this.anIntArray33[local343] = local351 + local337;
			this.anIntArray32[local343] = local339 + local361;
			this.anIntArray35[local343] = local371 + local341;
			local341 = this.anIntArray35[local343];
			local339 = this.anIntArray32[local343];
			local337 = this.anIntArray33[local343];
			if (local75 == 1) {
				this.anIntArray34[local343] = local34.method4464();
			}
		}
		local14.anInt5186 = local170;
		local19.anInt5186 = local132;
		local24.anInt5186 = local112;
		local29.anInt5186 = local154;
		local34.anInt5186 = local122;
		for (local349 = 0; local349 < this.anInt315; local349++) {
			this.aShortArray21[local349] = (short) local14.method4518();
			if (local59 == 1) {
				local351 = local19.method4464();
				if ((local351 & 0x1) == 1) {
					local7 = true;
					this.aByteArray10[local349] = 1;
				} else {
					this.aByteArray10[local349] = 0;
				}
				if ((local351 & 0x2) == 2) {
					this.aByteArray7[local349] = (byte) (local351 >> 2);
					this.aShortArray22[local349] = this.aShortArray21[local349];
					this.aShortArray21[local349] = 127;
					if (this.aShortArray22[local349] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray7[local349] = -1;
					this.aShortArray22[local349] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray12[local349] = local24.method4477();
			}
			if (local67 == 1) {
				this.aByteArray11[local349] = local29.method4477();
			}
			if (local71 == 1) {
				this.anIntArray37[local349] = local34.method4464();
			}
		}
		this.anInt325 = -1;
		local14.anInt5186 = local164;
		local19.anInt5186 = local105;
		@Pc(587) short local587 = 0;
		@Pc(589) short local589 = 0;
		@Pc(591) short local591 = 0;
		@Pc(593) short local593 = 0;
		@Pc(601) int local601;
		for (@Pc(595) int local595 = 0; local595 < this.anInt315; local595++) {
			local601 = local19.method4464();
			if (local601 == 1) {
				local587 = (short) (local593 + local14.method4507());
				local589 = (short) (local587 + local14.method4507());
				local591 = (short) (local589 + local14.method4507());
				this.aShortArray26[local595] = local587;
				local593 = local591;
				this.aShortArray20[local595] = local589;
				this.aShortArray18[local595] = local591;
				if (this.anInt325 < local587) {
					this.anInt325 = local587;
				}
				if (local589 > this.anInt325) {
					this.anInt325 = local589;
				}
				if (this.anInt325 < local591) {
					this.anInt325 = local591;
				}
			}
			if (local601 == 2) {
				local589 = local591;
				local591 = (short) (local593 + local14.method4507());
				this.aShortArray26[local595] = local587;
				local593 = local591;
				this.aShortArray20[local595] = local589;
				this.aShortArray18[local595] = local591;
				if (local591 > this.anInt325) {
					this.anInt325 = local591;
				}
			}
			if (local601 == 3) {
				local587 = local591;
				local591 = (short) (local14.method4507() + local593);
				this.aShortArray26[local595] = local587;
				local593 = local591;
				this.aShortArray20[local595] = local589;
				this.aShortArray18[local595] = local591;
				if (local591 > this.anInt325) {
					this.anInt325 = local591;
				}
			}
			if (local601 == 4) {
				@Pc(760) short local760 = local587;
				local587 = local589;
				local589 = local760;
				local591 = (short) (local14.method4507() + local593);
				this.aShortArray26[local595] = local587;
				local593 = local591;
				this.aShortArray20[local595] = local760;
				this.aShortArray18[local595] = local591;
				if (this.anInt325 < local591) {
					this.anInt325 = local591;
				}
			}
		}
		this.anInt325++;
		local14.anInt5186 = local179;
		for (local601 = 0; local601 < this.anInt316; local601++) {
			this.aByteArray9[local601] = 0;
			this.aShortArray19[local601] = (short) local14.method4518();
			this.aShortArray24[local601] = (short) local14.method4518();
			this.aShortArray27[local601] = (short) local14.method4518();
		}
		if (this.aByteArray7 != null) {
			@Pc(860) boolean local860 = false;
			for (@Pc(862) int local862 = 0; local862 < this.anInt315; local862++) {
				@Pc(871) int local871 = this.aByteArray7[local862] & 0xFF;
				if (local871 != 255) {
					if ((this.aShortArray19[local871] & 0xFFFF) == this.aShortArray26[local862] && (this.aShortArray24[local871] & 0xFFFF) == this.aShortArray20[local862] && this.aShortArray18[local862] == (this.aShortArray27[local871] & 0xFFFF)) {
						this.aByteArray7[local862] = -1;
					} else {
						local860 = true;
					}
				}
			}
			if (!local860) {
				this.aByteArray7 = null;
			}
		}
		if (!local7) {
			this.aByteArray10 = null;
		}
		if (!local9) {
			this.aShortArray22 = null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)[[I")
	public int[][] method248() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt315; local12++) {
			@Pc(19) int local19 = this.anIntArray37[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(62) int[][] local62 = new int[local10 + 1][];
		for (@Pc(64) int local64 = 0; local64 <= local10; local64++) {
			local62[local64] = new int[local8[local64]];
			local8[local64] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt315; local83++) {
			@Pc(90) int local90 = this.anIntArray37[local83];
			if (local90 >= 0) {
				local62[local90][local8[local90]++] = local83;
			}
		}
		return local62;
	}
}
