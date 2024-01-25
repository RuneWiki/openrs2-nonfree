import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class266 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "[I")
	public int[] anIntArray510;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "[B")
	public byte[] aByteArray215;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "[Lclient!qm;")
	public Class202[] aClass202Array4;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "[B")
	public byte[] aByteArray216;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "[S")
	public short[] aShortArray109;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "[I")
	public int[] anIntArray511;

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!wp", name = "y", descriptor = "[B")
	public byte[] aByteArray217;

	@OriginalMember(owner = "client!wp", name = "A", descriptor = "[B")
	public byte[] aByteArray218;

	@OriginalMember(owner = "client!wp", name = "F", descriptor = "[Lclient!au;")
	public Class17[] aClass17Array4;

	@OriginalMember(owner = "client!wp", name = "G", descriptor = "[I")
	public int[] anIntArray513;

	@OriginalMember(owner = "client!wp", name = "H", descriptor = "[I")
	public int[] anIntArray514;

	@OriginalMember(owner = "client!wp", name = "J", descriptor = "[I")
	public int[] anIntArray515;

	@OriginalMember(owner = "client!wp", name = "L", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!wp", name = "M", descriptor = "[Lclient!fj;")
	public Class84[] aClass84Array1;

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "[I")
	public int[] anIntArray516;

	@OriginalMember(owner = "client!wp", name = "O", descriptor = "[I")
	public int[] anIntArray517;

	@OriginalMember(owner = "client!wp", name = "P", descriptor = "[I")
	public int[] anIntArray518;

	@OriginalMember(owner = "client!wp", name = "S", descriptor = "[B")
	public byte[] aByteArray219;

	@OriginalMember(owner = "client!wp", name = "U", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!wp", name = "W", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!wp", name = "X", descriptor = "[I")
	public int[] anIntArray519;

	@OriginalMember(owner = "client!wp", name = "Y", descriptor = "[I")
	public int[] anIntArray520;

	@OriginalMember(owner = "client!wp", name = "Z", descriptor = "[B")
	public byte[] aByteArray220;

	@OriginalMember(owner = "client!wp", name = "bb", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!wp", name = "cb", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!wp", name = "eb", descriptor = "[B")
	public byte[] aByteArray221;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
	public int anInt7801 = 0;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
	public int anInt7804 = 0;

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "B")
	public byte aByte105 = 0;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
	public int anInt7805 = 0;

	@OriginalMember(owner = "client!wp", name = "gb", descriptor = "I")
	public int anInt7821 = 0;

	@OriginalMember(owner = "client!wp", name = "db", descriptor = "I")
	public int anInt7819 = 12;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "([B)V")
	public Class266(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method6052(arg0);
		} else {
			this.method6062(arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(III)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray518 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray511 = new int[arg2];
			this.aByteArray221 = new byte[arg2];
			this.aByteArray218 = new byte[arg2];
			this.aShortArray106 = new short[arg2];
			this.aByteArray219 = new byte[arg2];
			this.anIntArray515 = new int[arg2];
			this.anIntArray513 = new int[arg2];
			this.anIntArray520 = new int[arg2];
			this.aShortArray108 = new short[arg2];
			this.anIntArray519 = new int[arg2];
			this.aShortArray113 = new short[arg2];
			this.anIntArray521 = new int[arg2];
		}
		this.aByteArray216 = new byte[arg1];
		this.aShortArray109 = new short[arg1];
		this.aShortArray115 = new short[arg1];
		this.aByteArray217 = new byte[arg1];
		this.aShortArray112 = new short[arg1];
		this.aByteArray220 = new byte[arg1];
		this.anIntArray510 = new int[arg0];
		this.aShortArray107 = new short[arg1];
		this.aByteArray215 = new byte[arg1];
		this.anIntArray517 = new int[arg0];
		this.anIntArray516 = new int[arg1];
		this.aShortArray114 = new short[arg1];
		this.anIntArray514 = new int[arg0];
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "([Lclient!wp;I)V")
	public Class266(@OriginalArg(0) Class266[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7805 = 0;
		this.anInt7821 = 0;
		this.anInt7801 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte105 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class266 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt7805 += local59.anInt7805;
				this.anInt7821 += local59.anInt7821;
				this.anInt7801 += local59.anInt7801;
				if (local59.aClass17Array4 != null) {
					local34 += local59.aClass17Array4.length;
				}
				if (local59.aClass84Array1 != null) {
					local36 += local59.aClass84Array1.length;
				}
				if (local59.aClass202Array4 != null) {
					local32 += local59.aClass202Array4.length;
				}
				local38 |= local59.aByteArray220 != null;
				local44 |= local59.aByteArray217 != null;
				if (local59.aByteArray216 == null) {
					if (this.aByte105 == -1) {
						this.aByte105 = local59.aByte105;
					}
					if (this.aByte105 != local59.aByte105) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local51 |= local59.anIntArray516 != null;
				local46 |= local59.aShortArray109 != null;
				local42 |= local59.aByteArray215 != null;
			}
		}
		if (local32 > 0) {
			this.aClass202Array4 = new Class202[local32];
		}
		if (local42) {
			this.aByteArray215 = new byte[this.anInt7821];
		}
		if (local40) {
			this.aByteArray216 = new byte[this.anInt7821];
		}
		if (local38) {
			this.aByteArray220 = new byte[this.anInt7821];
		}
		this.anIntArray510 = new int[this.anInt7805];
		this.anIntArray514 = new int[this.anInt7805];
		this.aShortArray112 = new short[this.anInt7821];
		if (local36 > 0) {
			this.aClass84Array1 = new Class84[local36];
		}
		this.aShortArray114 = new short[this.anInt7821];
		this.anIntArray517 = new int[this.anInt7805];
		this.aShortArray110 = new short[this.anInt7821];
		if (local34 > 0) {
			this.aClass17Array4 = new Class17[local34];
		}
		if (local44) {
			this.aByteArray217 = new byte[this.anInt7821];
		}
		this.aShortArray111 = new short[this.anInt7805];
		if (local46) {
			this.aShortArray109 = new short[this.anInt7821];
		}
		this.aShortArray107 = new short[this.anInt7821];
		this.aShortArray115 = new short[this.anInt7821];
		if (local51) {
			this.anIntArray516 = new int[this.anInt7821];
		}
		if (this.anInt7801 > 0) {
			this.aByteArray221 = new byte[this.anInt7801];
			this.anIntArray521 = new int[this.anInt7801];
			this.anIntArray515 = new int[this.anInt7801];
			this.aByteArray219 = new byte[this.anInt7801];
			this.anIntArray513 = new int[this.anInt7801];
			this.aShortArray113 = new short[this.anInt7801];
			this.aShortArray106 = new short[this.anInt7801];
			this.anIntArray519 = new int[this.anInt7801];
			this.aShortArray108 = new short[this.anInt7801];
			this.anIntArray520 = new int[this.anInt7801];
			this.anIntArray511 = new int[this.anInt7801];
			this.aByteArray218 = new byte[this.anInt7801];
		}
		this.anIntArray518 = new int[this.anInt7805];
		local34 = 0;
		this.anInt7805 = 0;
		this.anInt7801 = 0;
		local36 = 0;
		this.anInt7821 = 0;
		local32 = 0;
		@Pc(613) int local613;
		@Pc(624) int local624;
		for (@Pc(377) int local377 = 0; local377 < arg1; local377++) {
			@Pc(384) short local384 = (short) (0x1 << local377);
			@Pc(388) Class266 local388 = arg0[local377];
			if (local388 != null) {
				@Pc(395) int local395;
				if (local388.aClass84Array1 != null) {
					for (local395 = 0; local395 < local388.aClass84Array1.length; local395++) {
						@Pc(402) Class84 local402 = local388.aClass84Array1[local395];
						this.aClass84Array1[local36++] = local402.method1710(this.anInt7821 + local402.anInt2344);
					}
				}
				for (local395 = 0; local395 < local388.anInt7821; local395++) {
					if (local38 && local388.aByteArray220 != null) {
						this.aByteArray220[this.anInt7821] = local388.aByteArray220[local395];
					}
					if (local40) {
						if (local388.aByteArray216 == null) {
							this.aByteArray216[this.anInt7821] = local388.aByte105;
						} else {
							this.aByteArray216[this.anInt7821] = local388.aByteArray216[local395];
						}
					}
					if (local42 && local388.aByteArray215 != null) {
						this.aByteArray215[this.anInt7821] = local388.aByteArray215[local395];
					}
					if (local46) {
						if (local388.aShortArray109 == null) {
							this.aShortArray109[this.anInt7821] = -1;
						} else {
							this.aShortArray109[this.anInt7821] = local388.aShortArray109[local395];
						}
					}
					if (local51) {
						if (local388.anIntArray516 == null) {
							this.anIntArray516[this.anInt7821] = -1;
						} else {
							this.anIntArray516[this.anInt7821] = local388.anIntArray516[local395];
						}
					}
					this.aShortArray107[this.anInt7821] = (short) this.method6056(local388.aShortArray107[local395], local388, local384);
					this.aShortArray114[this.anInt7821] = (short) this.method6056(local388.aShortArray114[local395], local388, local384);
					this.aShortArray112[this.anInt7821] = (short) this.method6056(local388.aShortArray112[local395], local388, local384);
					this.aShortArray110[this.anInt7821] = local384;
					this.aShortArray115[this.anInt7821] = local388.aShortArray115[local395];
					this.anInt7821++;
				}
				@Pc(600) int local600;
				if (local388.aClass202Array4 != null) {
					for (local600 = 0; local600 < local388.aClass202Array4.length; local600++) {
						local613 = this.method6056(local388.aClass202Array4[local600].anInt5771, local388, local384);
						local624 = this.method6056(local388.aClass202Array4[local600].anInt5777, local388, local384);
						@Pc(635) int local635 = this.method6056(local388.aClass202Array4[local600].anInt5774, local388, local384);
						this.aClass202Array4[local32] = local388.aClass202Array4[local600].method4609(local613, local624, local635);
						local32++;
					}
				}
				if (local388.aClass17Array4 != null) {
					for (local600 = 0; local600 < local388.aClass17Array4.length; local600++) {
						local613 = this.method6056(local388.aClass17Array4[local600].anInt428, local388, local384);
						this.aClass17Array4[local34] = local388.aClass17Array4[local600].method269(local613);
						local34++;
					}
				}
			}
		}
		@Pc(709) int local709 = 0;
		this.anInt7804 = this.anInt7805;
		for (@Pc(715) int local715 = 0; local715 < arg1; local715++) {
			@Pc(722) short local722 = (short) (0x1 << local715);
			@Pc(726) Class266 local726 = arg0[local715];
			if (local726 != null) {
				for (local613 = 0; local613 < local726.anInt7821; local613++) {
					if (local44) {
						this.aByteArray217[local709++] = (byte) (local726.aByteArray217 == null || local726.aByteArray217[local613] == -1 ? -1 : this.anInt7801 + local726.aByteArray217[local613]);
					}
				}
				for (local624 = 0; local624 < local726.anInt7801; local624++) {
					@Pc(778) byte local778 = this.aByteArray219[this.anInt7801] = local726.aByteArray219[local624];
					if (local778 == 0) {
						this.aShortArray113[this.anInt7801] = (short) this.method6056(local726.aShortArray113[local624], local726, local722);
						this.aShortArray108[this.anInt7801] = (short) this.method6056(local726.aShortArray108[local624], local726, local722);
						this.aShortArray106[this.anInt7801] = (short) this.method6056(local726.aShortArray106[local624], local726, local722);
					}
					if (local778 >= 1 && local778 <= 3) {
						this.aShortArray113[this.anInt7801] = local726.aShortArray113[local624];
						this.aShortArray108[this.anInt7801] = local726.aShortArray108[local624];
						this.aShortArray106[this.anInt7801] = local726.aShortArray106[local624];
						this.anIntArray511[this.anInt7801] = local726.anIntArray511[local624];
						this.anIntArray515[this.anInt7801] = local726.anIntArray515[local624];
						this.anIntArray513[this.anInt7801] = local726.anIntArray513[local624];
						this.aByteArray221[this.anInt7801] = local726.aByteArray221[local624];
						this.aByteArray218[this.anInt7801] = local726.aByteArray218[local624];
						this.anIntArray519[this.anInt7801] = local726.anIntArray519[local624];
					}
					if (local778 == 2) {
						this.anIntArray520[this.anInt7801] = local726.anIntArray520[local624];
						this.anIntArray521[this.anInt7801] = local726.anIntArray521[local624];
					}
					this.anInt7801++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(SSIIBIIBB)I")
	public int method6046(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray107[this.anInt7821] = (short) arg3;
		this.aShortArray114[this.anInt7821] = (short) arg2;
		this.aShortArray112[this.anInt7821] = (short) arg5;
		this.aByteArray220[this.anInt7821] = arg7;
		this.aByteArray217[this.anInt7821] = arg4;
		this.aShortArray115[this.anInt7821] = arg0;
		this.aByteArray215[this.anInt7821] = arg6;
		this.aShortArray109[this.anInt7821] = arg1;
		return this.anInt7821++;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)I")
	public int method6050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7805; local7++) {
			if (arg0 == this.anIntArray510[local7] && arg1 == this.anIntArray518[local7] && arg2 == this.anIntArray514[local7]) {
				return local7;
			}
		}
		this.anIntArray510[this.anInt7805] = arg0;
		this.anIntArray518[this.anInt7805] = arg1;
		this.anIntArray514[this.anInt7805] = arg2;
		this.anInt7804 = this.anInt7805 + 1;
		return this.anInt7805++;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)[[I")
	public int[][] method6051() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.aClass84Array1.length; local17++) {
			@Pc(25) int local25 = this.aClass84Array1[local17].anInt2341;
			if (local25 >= 0) {
				@Pc(34) int local34 = local8[local25]++;
				if (local10 < local25) {
					local10 = local25;
				}
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass84Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass84Array1[local78].anInt2341;
			if (local86 >= 0) {
				local57[local86][local8[local86]++] = local78;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([BZ)V")
	private void method6052(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub20 local10 = new Class2_Sub20(arg0);
		@Pc(15) Class2_Sub20 local15 = new Class2_Sub20(arg0);
		@Pc(20) Class2_Sub20 local20 = new Class2_Sub20(arg0);
		@Pc(25) Class2_Sub20 local25 = new Class2_Sub20(arg0);
		@Pc(30) Class2_Sub20 local30 = new Class2_Sub20(arg0);
		@Pc(35) Class2_Sub20 local35 = new Class2_Sub20(arg0);
		@Pc(40) Class2_Sub20 local40 = new Class2_Sub20(arg0);
		local10.anInt4608 = arg0.length - 23;
		this.anInt7805 = local10.method3711();
		this.anInt7821 = local10.method3711();
		this.anInt7801 = local10.method3737();
		@Pc(65) int local65 = local10.method3737();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt4608 -= 7;
			this.anInt7819 = local10.method3737();
			local10.anInt4608 += 6;
		}
		@Pc(128) int local128 = local10.method3737();
		@Pc(132) int local132 = local10.method3737();
		@Pc(136) int local136 = local10.method3737();
		@Pc(140) int local140 = local10.method3737();
		@Pc(144) int local144 = local10.method3737();
		@Pc(148) int local148 = local10.method3711();
		@Pc(152) int local152 = local10.method3711();
		@Pc(156) int local156 = local10.method3711();
		@Pc(160) int local160 = local10.method3711();
		@Pc(164) int local164 = local10.method3711();
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(183) int local183;
		if (this.anInt7801 > 0) {
			local10.anInt4608 = 0;
			this.aByteArray219 = new byte[this.anInt7801];
			for (local183 = 0; local183 < this.anInt7801; local183++) {
				@Pc(194) byte local194 = this.aByteArray219[local183] = local10.method3693();
				if (local194 >= 1 && local194 <= 3) {
					local168++;
				}
				if (local194 == 0) {
					local166++;
				}
				if (local194 == 2) {
					local170++;
				}
			}
		}
		local183 = this.anInt7801;
		@Pc(222) int local222 = local183;
		local183 += this.anInt7805;
		@Pc(229) int local229 = local183;
		if (local76) {
			local183 += this.anInt7821;
		}
		@Pc(238) int local238 = local183;
		local183 += this.anInt7821;
		@Pc(245) int local245 = local183;
		if (local128 == 255) {
			local183 += this.anInt7821;
		}
		@Pc(257) int local257 = local183;
		if (local136 == 1) {
			local183 += this.anInt7821;
		}
		@Pc(269) int local269 = local183;
		if (local144 == 1) {
			local183 += this.anInt7805;
		}
		@Pc(281) int local281 = local183;
		if (local132 == 1) {
			local183 += this.anInt7821;
		}
		@Pc(293) int local293 = local183;
		local183 += local160;
		@Pc(299) int local299 = local183;
		if (local140 == 1) {
			local183 += this.anInt7821 * 2;
		}
		@Pc(313) int local313 = local183;
		local183 += local164;
		@Pc(319) int local319 = local183;
		local183 += this.anInt7821 * 2;
		@Pc(328) int local328 = local183;
		local183 += local148;
		@Pc(334) int local334 = local183;
		local183 += local152;
		@Pc(340) int local340 = local183;
		local183 += local156;
		@Pc(346) int local346 = local183;
		local183 += local166 * 6;
		@Pc(354) int local354 = local183;
		local183 += local168 * 6;
		@Pc(370) int local370 = this.anInt7819 < 14 ? 6 : 7;
		@Pc(372) int local372 = local183;
		local183 += local168 * local370;
		@Pc(380) int local380 = local183;
		local183 += local168;
		@Pc(386) int local386 = local183;
		local183 += local168;
		@Pc(392) int local392 = local183;
		local183 += local168 + local170 * 2;
		if (local136 == 1) {
			this.anIntArray516 = new int[this.anInt7821];
		}
		if (local140 == 1) {
			this.aShortArray109 = new short[this.anInt7821];
		}
		this.aShortArray112 = new short[this.anInt7821];
		this.aShortArray114 = new short[this.anInt7821];
		if (local132 == 1) {
			this.aByteArray215 = new byte[this.anInt7821];
		}
		if (local140 == 1 && this.anInt7801 > 0) {
			this.aByteArray217 = new byte[this.anInt7821];
		}
		this.anIntArray518 = new int[this.anInt7805];
		this.anIntArray514 = new int[this.anInt7805];
		local10.anInt4608 = local222;
		this.anIntArray510 = new int[this.anInt7805];
		this.aShortArray115 = new short[this.anInt7821];
		if (local128 == 255) {
			this.aByteArray216 = new byte[this.anInt7821];
		} else {
			this.aByte105 = (byte) local128;
		}
		if (local144 == 1) {
			this.anIntArray517 = new int[this.anInt7805];
		}
		if (this.anInt7801 > 0) {
			if (local168 > 0) {
				this.anIntArray513 = new int[local168];
				this.anIntArray519 = new int[local168];
				this.anIntArray515 = new int[local168];
				this.aByteArray221 = new byte[local168];
				this.anIntArray511 = new int[local168];
				this.aByteArray218 = new byte[local168];
			}
			this.aShortArray113 = new short[this.anInt7801];
			this.aShortArray106 = new short[this.anInt7801];
			this.aShortArray108 = new short[this.anInt7801];
			if (local170 > 0) {
				this.anIntArray521 = new int[local170];
				this.anIntArray520 = new int[local170];
			}
		}
		if (local76) {
			this.aByteArray220 = new byte[this.anInt7821];
		}
		this.aShortArray107 = new short[this.anInt7821];
		local15.anInt4608 = local328;
		local20.anInt4608 = local334;
		local25.anInt4608 = local340;
		local30.anInt4608 = local269;
		@Pc(581) int local581 = 0;
		@Pc(583) int local583 = 0;
		@Pc(585) int local585 = 0;
		@Pc(593) int local593;
		for (@Pc(587) int local587 = 0; local587 < this.anInt7805; local587++) {
			local593 = local10.method3737();
			@Pc(595) int local595 = 0;
			if ((local593 & 0x1) != 0) {
				local595 = local15.method3683();
			}
			@Pc(605) int local605 = 0;
			if ((local593 & 0x2) != 0) {
				local605 = local20.method3683();
			}
			@Pc(618) int local618 = 0;
			if ((local593 & 0x4) != 0) {
				local618 = local25.method3683();
			}
			this.anIntArray510[local587] = local581 + local595;
			this.anIntArray518[local587] = local583 + local605;
			this.anIntArray514[local587] = local585 + local618;
			local581 = this.anIntArray510[local587];
			local583 = this.anIntArray518[local587];
			local585 = this.anIntArray514[local587];
			if (local144 == 1) {
				this.anIntArray517[local587] = local30.method3737();
			}
		}
		local10.anInt4608 = local319;
		local15.anInt4608 = local229;
		local20.anInt4608 = local245;
		local25.anInt4608 = local281;
		local30.anInt4608 = local257;
		local35.anInt4608 = local299;
		local40.anInt4608 = local313;
		for (local593 = 0; local593 < this.anInt7821; local593++) {
			this.aShortArray115[local593] = (short) local10.method3711();
			if (local76) {
				this.aByteArray220[local593] = local15.method3693();
			}
			if (local128 == 255) {
				this.aByteArray216[local593] = local20.method3693();
			}
			if (local132 == 1) {
				this.aByteArray215[local593] = local25.method3693();
			}
			if (local136 == 1) {
				this.anIntArray516[local593] = local30.method3737();
			}
			if (local140 == 1) {
				this.aShortArray109[local593] = (short) (local35.method3711() - 1);
			}
			if (this.aByteArray217 != null) {
				if (this.aShortArray109[local593] == -1) {
					this.aByteArray217[local593] = -1;
				} else {
					this.aByteArray217[local593] = (byte) (local40.method3737() - 1);
				}
			}
		}
		this.anInt7804 = -1;
		local10.anInt4608 = local293;
		local15.anInt4608 = local238;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(836) short local836 = 0;
		@Pc(838) short local838 = 0;
		@Pc(846) int local846;
		for (@Pc(840) int local840 = 0; local840 < this.anInt7821; local840++) {
			local846 = local15.method3737();
			if (local846 == 1) {
				local832 = (short) (local10.method3683() + local838);
				local834 = (short) (local10.method3683() + local832);
				local836 = (short) (local834 + local10.method3683());
				this.aShortArray107[local840] = local832;
				local838 = local836;
				this.aShortArray114[local840] = local834;
				this.aShortArray112[local840] = local836;
				if (this.anInt7804 < local832) {
					this.anInt7804 = local832;
				}
				if (local834 > this.anInt7804) {
					this.anInt7804 = local834;
				}
				if (this.anInt7804 < local836) {
					this.anInt7804 = local836;
				}
			}
			if (local846 == 2) {
				local834 = local836;
				local836 = (short) (local838 + local10.method3683());
				local838 = local836;
				this.aShortArray107[local840] = local832;
				this.aShortArray114[local840] = local834;
				this.aShortArray112[local840] = local836;
				if (local836 > this.anInt7804) {
					this.anInt7804 = local836;
				}
			}
			if (local846 == 3) {
				local832 = local836;
				local836 = (short) (local838 + local10.method3683());
				local838 = local836;
				this.aShortArray107[local840] = local832;
				this.aShortArray114[local840] = local834;
				this.aShortArray112[local840] = local836;
				if (local836 > this.anInt7804) {
					this.anInt7804 = local836;
				}
			}
			if (local846 == 4) {
				@Pc(1009) short local1009 = local832;
				local832 = local834;
				local836 = (short) (local10.method3683() + local838);
				local834 = local1009;
				this.aShortArray107[local840] = local832;
				local838 = local836;
				this.aShortArray114[local840] = local1009;
				this.aShortArray112[local840] = local836;
				if (local836 > this.anInt7804) {
					this.anInt7804 = local836;
				}
			}
		}
		local10.anInt4608 = local346;
		this.anInt7804++;
		local15.anInt4608 = local354;
		local20.anInt4608 = local372;
		local25.anInt4608 = local380;
		local30.anInt4608 = local386;
		local35.anInt4608 = local392;
		@Pc(1088) int local1088;
		for (local846 = 0; local846 < this.anInt7801; local846++) {
			local1088 = this.aByteArray219[local846] & 0xFF;
			if (local1088 == 0) {
				this.aShortArray113[local846] = (short) local10.method3711();
				this.aShortArray108[local846] = (short) local10.method3711();
				this.aShortArray106[local846] = (short) local10.method3711();
			}
			if (local1088 == 1) {
				this.aShortArray113[local846] = (short) local15.method3711();
				this.aShortArray108[local846] = (short) local15.method3711();
				this.aShortArray106[local846] = (short) local15.method3711();
				this.anIntArray511[local846] = local20.method3711();
				if (this.anInt7819 < 14) {
					this.anIntArray515[local846] = local20.method3711();
				} else {
					this.anIntArray515[local846] = local20.method3748();
				}
				this.anIntArray513[local846] = local20.method3711();
				this.aByteArray221[local846] = local25.method3693();
				this.aByteArray218[local846] = local30.method3693();
				this.anIntArray519[local846] = local35.method3693();
			}
			if (local1088 == 2) {
				this.aShortArray113[local846] = (short) local15.method3711();
				this.aShortArray108[local846] = (short) local15.method3711();
				this.aShortArray106[local846] = (short) local15.method3711();
				this.anIntArray511[local846] = local20.method3711();
				if (this.anInt7819 >= 14) {
					this.anIntArray515[local846] = local20.method3748();
				} else {
					this.anIntArray515[local846] = local20.method3711();
				}
				this.anIntArray513[local846] = local20.method3711();
				this.aByteArray221[local846] = local25.method3693();
				this.aByteArray218[local846] = local30.method3693();
				this.anIntArray519[local846] = local35.method3693();
				this.anIntArray520[local846] = local35.method3693();
				this.anIntArray521[local846] = local35.method3693();
			}
			if (local1088 == 3) {
				this.aShortArray113[local846] = (short) local15.method3711();
				this.aShortArray108[local846] = (short) local15.method3711();
				this.aShortArray106[local846] = (short) local15.method3711();
				this.anIntArray511[local846] = local20.method3711();
				if (this.anInt7819 >= 14) {
					this.anIntArray515[local846] = local20.method3748();
				} else {
					this.anIntArray515[local846] = local20.method3711();
				}
				this.anIntArray513[local846] = local20.method3711();
				this.aByteArray221[local846] = local25.method3693();
				this.aByteArray218[local846] = local30.method3693();
				this.anIntArray519[local846] = local35.method3693();
			}
		}
		local10.anInt4608 = local183;
		@Pc(1402) int local1402;
		@Pc(1408) int local1408;
		@Pc(1412) int local1412;
		@Pc(1477) int local1477;
		if (local85) {
			local1088 = local10.method3737();
			if (local1088 > 0) {
				this.aClass202Array4 = new Class202[local1088];
				for (local1402 = 0; local1402 < local1088; local1402++) {
					local1408 = local10.method3711();
					local1412 = local10.method3711();
					@Pc(1422) byte local1422;
					if (local128 == 255) {
						local1422 = this.aByteArray216[local1412];
					} else {
						local1422 = (byte) local128;
					}
					this.aClass202Array4[local1402] = new Class202(local1408, this.aShortArray107[local1412], this.aShortArray114[local1412], this.aShortArray112[local1412], local1422);
				}
			}
			local1402 = local10.method3737();
			if (local1402 > 0) {
				this.aClass17Array4 = new Class17[local1402];
				for (local1408 = 0; local1408 < local1402; local1408++) {
					local1412 = local10.method3711();
					local1477 = local10.method3711();
					this.aClass17Array4[local1408] = new Class17(local1412, local1477);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1088 = local10.method3737();
		if (local1088 <= 0) {
			return;
		}
		this.aClass84Array1 = new Class84[local1088];
		for (local1402 = 0; local1402 < local1088; local1402++) {
			local1408 = local10.method3711();
			local1412 = local10.method3711();
			local1477 = local10.method3737();
			@Pc(1529) byte local1529 = local10.method3693();
			this.aClass84Array1[local1402] = new Class84(local1408, local1412, local1477, local1529);
		}
		return;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)[[I")
	public int[][] method6053() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt7804; local12++) {
			@Pc(19) int local19 = this.anIntArray517[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(30) int local30 = local8[local19]++;
			}
		}
		@Pc(43) int[][] local43 = new int[local10 + 1][];
		for (@Pc(45) int local45 = 0; local45 <= local10; local45++) {
			local43[local45] = new int[local8[local45]];
			local8[local45] = 0;
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt7804; local71++) {
			@Pc(78) int local78 = this.anIntArray517[local71];
			if (local78 >= 0) {
				local43[local78][local8[local78]++] = local71;
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(SBIBSSSBSS)B")
	public byte method6054() {
		if (this.anInt7801 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray219[this.anInt7801] = 3;
		this.aShortArray113[this.anInt7801] = 0;
		this.aShortArray108[this.anInt7801] = 32767;
		this.aShortArray106[this.anInt7801] = 0;
		this.anIntArray511[this.anInt7801] = 1024;
		this.anIntArray515[this.anInt7801] = 1024;
		this.anIntArray513[this.anInt7801] = 1024;
		this.aByteArray221[this.anInt7801] = 0;
		this.aByteArray218[this.anInt7801] = 0;
		this.anIntArray519[this.anInt7801] = 0;
		return (byte) this.anInt7801++;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(SSI)V")
	public void method6055(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray109 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt7821; local17++) {
			if (this.aShortArray109[local17] == arg1) {
				this.aShortArray109[local17] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILclient!wp;S)I")
	private int method6056(@OriginalArg(1) int arg0, @OriginalArg(2) Class266 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray510[arg0];
		@Pc(15) int local15 = arg1.anIntArray518[arg0];
		@Pc(20) int local20 = arg1.anIntArray514[arg0];
		for (@Pc(29) int local29 = 0; local29 < this.anInt7805; local29++) {
			if (this.anIntArray510[local29] == local10 && this.anIntArray518[local29] == local15 && local20 == this.anIntArray514[local29]) {
				this.aShortArray111[local29] |= arg2;
				return local29;
			}
		}
		this.anIntArray510[this.anInt7805] = local10;
		this.anIntArray518[this.anInt7805] = local15;
		this.anIntArray514[this.anInt7805] = local20;
		this.aShortArray111[this.anInt7805] = arg2;
		this.anIntArray517[this.anInt7805] = arg1.anIntArray517 == null ? -1 : arg1.anIntArray517[arg0];
		return this.anInt7805++;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BSS)V")
	public void method6058(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt7821; local15++) {
			if (arg0 == this.aShortArray115[local15]) {
				this.aShortArray115[local15] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(IIII)V")
	public void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(31) int local31;
		if (arg2 != 0) {
			local7 = Class184.anIntArray349[arg2];
			local11 = Class184.anIntArray350[arg2];
			for (local13 = 0; local13 < this.anInt7805; local13++) {
				local31 = this.anIntArray518[local13] * local7 + local11 * this.anIntArray510[local13] >> 15;
				this.anIntArray518[local13] = this.anIntArray518[local13] * local11 - local7 * this.anIntArray510[local13] >> 15;
				this.anIntArray510[local13] = local31;
			}
		}
		if (arg1 != 0) {
			local7 = Class184.anIntArray349[arg1];
			local11 = Class184.anIntArray350[arg1];
			for (local13 = 0; local13 < this.anInt7805; local13++) {
				local31 = local11 * this.anIntArray518[local13] - this.anIntArray514[local13] * local7 >> 15;
				this.anIntArray514[local13] = local7 * this.anIntArray518[local13] + local11 * this.anIntArray514[local13] >> 15;
				this.anIntArray518[local13] = local31;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local7 = Class184.anIntArray349[arg0];
		local11 = Class184.anIntArray350[arg0];
		for (local13 = 0; local13 < this.anInt7805; local13++) {
			local31 = this.anIntArray510[local13] * local11 + local7 * this.anIntArray514[local13] >> 15;
			this.anIntArray514[local13] = this.anIntArray514[local13] * local11 - local7 * this.anIntArray510[local13] >> 15;
			this.anIntArray510[local13] = local31;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	public void method6061() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7805; local3++) {
			this.anIntArray510[local3] <<= 0x0;
			this.anIntArray518[local3] <<= 0x0;
			this.anIntArray514[local3] <<= 0x0;
		}
		if (this.anInt7801 <= 0 || this.anIntArray511 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray511.length; local52++) {
			this.anIntArray511[local52] <<= 0x0;
			this.anIntArray515[local52] <<= 0x0;
			if (this.aByteArray219[local52] != 1) {
				this.anIntArray513[local52] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([BI)V")
	private void method6062(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub20 local14 = new Class2_Sub20(arg0);
		@Pc(19) Class2_Sub20 local19 = new Class2_Sub20(arg0);
		@Pc(24) Class2_Sub20 local24 = new Class2_Sub20(arg0);
		@Pc(29) Class2_Sub20 local29 = new Class2_Sub20(arg0);
		@Pc(34) Class2_Sub20 local34 = new Class2_Sub20(arg0);
		local14.anInt4608 = arg0.length - 18;
		this.anInt7805 = local14.method3711();
		this.anInt7821 = local14.method3711();
		this.anInt7801 = local14.method3737();
		@Pc(59) int local59 = local14.method3737();
		@Pc(63) int local63 = local14.method3737();
		@Pc(67) int local67 = local14.method3737();
		@Pc(71) int local71 = local14.method3737();
		@Pc(77) int local77 = local14.method3737();
		@Pc(81) int local81 = local14.method3711();
		@Pc(85) int local85 = local14.method3711();
		@Pc(89) int local89 = local14.method3711();
		@Pc(93) int local93 = local14.method3711();
		@Pc(102) int local102 = this.anInt7805;
		@Pc(104) int local104 = local102;
		local102 += this.anInt7821;
		@Pc(111) int local111 = local102;
		if (local63 == 255) {
			local102 += this.anInt7821;
		}
		@Pc(121) int local121 = local102;
		if (local71 == 1) {
			local102 += this.anInt7821;
		}
		@Pc(133) int local133 = local102;
		if (local59 == 1) {
			local102 += this.anInt7821;
		}
		@Pc(145) int local145 = local102;
		if (local77 == 1) {
			local102 += this.anInt7805;
		}
		@Pc(157) int local157 = local102;
		if (local67 == 1) {
			local102 += this.anInt7821;
		}
		@Pc(169) int local169 = local102;
		local102 += local93;
		@Pc(175) int local175 = local102;
		local102 += this.anInt7821 * 2;
		@Pc(184) int local184 = local102;
		local102 += this.anInt7801 * 6;
		@Pc(193) int local193 = local102;
		local102 += local81;
		@Pc(199) int local199 = local102;
		local102 += local85;
		this.aShortArray114 = new short[this.anInt7821];
		if (local77 == 1) {
			this.anIntArray517 = new int[this.anInt7805];
		}
		if (local67 == 1) {
			this.aByteArray215 = new byte[this.anInt7821];
		}
		this.aShortArray115 = new short[this.anInt7821];
		if (local63 == 255) {
			this.aByteArray216 = new byte[this.anInt7821];
		} else {
			this.aByte105 = (byte) local63;
		}
		this.aShortArray112 = new short[this.anInt7821];
		local14.anInt4608 = 0;
		this.anIntArray518 = new int[this.anInt7805];
		this.anIntArray514 = new int[this.anInt7805];
		if (local71 == 1) {
			this.anIntArray516 = new int[this.anInt7821];
		}
		if (this.anInt7801 > 0) {
			this.aShortArray108 = new short[this.anInt7801];
			this.aShortArray113 = new short[this.anInt7801];
			this.aByteArray219 = new byte[this.anInt7801];
			this.aShortArray106 = new short[this.anInt7801];
		}
		this.anIntArray510 = new int[this.anInt7805];
		this.aShortArray107 = new short[this.anInt7821];
		if (local59 == 1) {
			this.aByteArray220 = new byte[this.anInt7821];
			this.aByteArray217 = new byte[this.anInt7821];
			this.aShortArray109 = new short[this.anInt7821];
		}
		local19.anInt4608 = local193;
		local24.anInt4608 = local199;
		local29.anInt4608 = local102;
		local34.anInt4608 = local145;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(358) int local358;
		@Pc(360) int local360;
		for (@Pc(352) int local352 = 0; local352 < this.anInt7805; local352++) {
			local358 = local14.method3737();
			local360 = 0;
			if ((local358 & 0x1) != 0) {
				local360 = local19.method3683();
			}
			@Pc(373) int local373 = 0;
			if ((local358 & 0x2) != 0) {
				local373 = local24.method3683();
			}
			@Pc(386) int local386 = 0;
			if ((local358 & 0x4) != 0) {
				local386 = local29.method3683();
			}
			this.anIntArray510[local352] = local360 + local346;
			this.anIntArray518[local352] = local348 + local373;
			this.anIntArray514[local352] = local386 + local350;
			local350 = this.anIntArray514[local352];
			local348 = this.anIntArray518[local352];
			local346 = this.anIntArray510[local352];
			if (local77 == 1) {
				this.anIntArray517[local352] = local34.method3737();
			}
		}
		local14.anInt4608 = local175;
		local19.anInt4608 = local133;
		local24.anInt4608 = local111;
		local29.anInt4608 = local157;
		local34.anInt4608 = local121;
		for (local358 = 0; local358 < this.anInt7821; local358++) {
			this.aShortArray115[local358] = (short) local14.method3711();
			if (local59 == 1) {
				local360 = local19.method3737();
				if ((local360 & 0x1) == 1) {
					local7 = true;
					this.aByteArray220[local358] = 1;
				} else {
					this.aByteArray220[local358] = 0;
				}
				if ((local360 & 0x2) == 2) {
					this.aByteArray217[local358] = (byte) (local360 >> 2);
					this.aShortArray109[local358] = this.aShortArray115[local358];
					this.aShortArray115[local358] = 127;
					if (this.aShortArray109[local358] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray217[local358] = -1;
					this.aShortArray109[local358] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray216[local358] = local24.method3693();
			}
			if (local67 == 1) {
				this.aByteArray215[local358] = local29.method3693();
			}
			if (local71 == 1) {
				this.anIntArray516[local358] = local34.method3737();
			}
		}
		local14.anInt4608 = local169;
		this.anInt7804 = -1;
		local19.anInt4608 = local104;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(620) int local620;
		for (@Pc(612) int local612 = 0; local612 < this.anInt7821; local612++) {
			local620 = local19.method3737();
			if (local620 == 1) {
				local604 = (short) (local610 + local14.method3683());
				local606 = (short) (local604 + local14.method3683());
				local608 = (short) (local606 + local14.method3683());
				this.aShortArray107[local612] = local604;
				local610 = local608;
				this.aShortArray114[local612] = local606;
				this.aShortArray112[local612] = local608;
				if (this.anInt7804 < local604) {
					this.anInt7804 = local604;
				}
				if (local606 > this.anInt7804) {
					this.anInt7804 = local606;
				}
				if (this.anInt7804 < local608) {
					this.anInt7804 = local608;
				}
			}
			if (local620 == 2) {
				local606 = local608;
				local608 = (short) (local14.method3683() + local610);
				this.aShortArray107[local612] = local604;
				local610 = local608;
				this.aShortArray114[local612] = local606;
				this.aShortArray112[local612] = local608;
				if (this.anInt7804 < local608) {
					this.anInt7804 = local608;
				}
			}
			if (local620 == 3) {
				local604 = local608;
				local608 = (short) (local610 + local14.method3683());
				local610 = local608;
				this.aShortArray107[local612] = local604;
				this.aShortArray114[local612] = local606;
				this.aShortArray112[local612] = local608;
				if (this.anInt7804 < local608) {
					this.anInt7804 = local608;
				}
			}
			if (local620 == 4) {
				@Pc(775) short local775 = local604;
				local604 = local606;
				local606 = local775;
				local608 = (short) (local14.method3683() + local610);
				this.aShortArray107[local612] = local604;
				local610 = local608;
				this.aShortArray114[local612] = local775;
				this.aShortArray112[local612] = local608;
				if (this.anInt7804 < local608) {
					this.anInt7804 = local608;
				}
			}
		}
		local14.anInt4608 = local184;
		this.anInt7804++;
		for (local620 = 0; local620 < this.anInt7801; local620++) {
			this.aByteArray219[local620] = 0;
			this.aShortArray113[local620] = (short) local14.method3711();
			this.aShortArray108[local620] = (short) local14.method3711();
			this.aShortArray106[local620] = (short) local14.method3711();
		}
		if (this.aByteArray217 != null) {
			@Pc(867) boolean local867 = false;
			for (@Pc(869) int local869 = 0; local869 < this.anInt7821; local869++) {
				@Pc(878) int local878 = this.aByteArray217[local869] & 0xFF;
				if (local878 != 255) {
					if (this.aShortArray107[local869] == (this.aShortArray113[local878] & 0xFFFF) && (this.aShortArray108[local878] & 0xFFFF) == this.aShortArray114[local869] && this.aShortArray112[local869] == (this.aShortArray106[local878] & 0xFFFF)) {
						this.aByteArray217[local869] = -1;
					} else {
						local867 = true;
					}
				}
			}
			if (!local867) {
				this.aByteArray217 = null;
			}
		}
		if (!local7) {
			this.aByteArray220 = null;
		}
		if (!local9) {
			this.aShortArray109 = null;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIBI)V")
	public void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7805; local3++) {
			this.anIntArray510[local3] += arg1;
			this.anIntArray518[local3] += arg2;
			this.anIntArray514[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(Z)[[I")
	public int[][] method6064() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt7821; local12++) {
			@Pc(19) int local19 = this.anIntArray516[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt7821; local75++) {
			@Pc(82) int local82 = this.anIntArray516[local75];
			if (local82 >= 0) {
				local50[local82][local8[local82]++] = local75;
			}
		}
		return local50;
	}
}
