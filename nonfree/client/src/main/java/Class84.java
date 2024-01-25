import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class84 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "[I")
	public int[] anIntArray109;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
	public int[] anIntArray110;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[Lclient!jv;")
	public Class168[] aClass168Array1;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "[Lclient!ow;")
	public Class248[] aClass248Array2;

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "[Lclient!qr;")
	public Class281[] aClass281Array2;

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!ef", name = "Z", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!ef", name = "bb", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	public int anInt2719 = 0;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
	public int anInt2716 = 0;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
	public int anInt2720 = 0;

	@OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
	public int anInt2728 = 0;

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
	public int anInt2725 = 12;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "B")
	public byte aByte24 = 0;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	private Class84() {
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B)V")
	public Class84(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2438(arg0);
		} else {
			this.method2440(arg0);
		}
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(III)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray115 = new int[arg0];
		this.aByteArray29 = new byte[arg1];
		this.anIntArray111 = new int[arg0];
		this.anIntArray110 = new int[arg1];
		this.aShortArray29 = new short[arg1];
		this.aByteArray26 = new byte[arg1];
		this.anIntArray113 = new int[arg0];
		this.aShortArray26 = new short[arg1];
		this.aByteArray27 = new byte[arg1];
		this.anIntArray109 = new int[arg0];
		this.aShortArray32 = new short[arg1];
		this.aShortArray27 = new short[arg1];
		this.aShortArray25 = new short[arg1];
		this.aByteArray25 = new byte[arg1];
		if (arg2 > 0) {
			this.anIntArray119 = new int[arg2];
			this.aShortArray33 = new short[arg2];
			this.aByteArray31 = new byte[arg2];
			this.anIntArray117 = new int[arg2];
			this.aShortArray34 = new short[arg2];
			this.aByteArray28 = new byte[arg2];
			this.anIntArray112 = new int[arg2];
			this.anIntArray114 = new int[arg2];
			this.anIntArray118 = new int[arg2];
			this.anIntArray116 = new int[arg2];
			this.aByteArray30 = new byte[arg2];
			this.aShortArray28 = new short[arg2];
		}
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([Lclient!ef;I)V")
	public Class84(@OriginalArg(0) Class84[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2720 = 0;
		this.anInt2728 = 0;
		this.anInt2716 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte24 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class84 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt2716 += local59.anInt2716;
				this.anInt2720 += local59.anInt2720;
				this.anInt2728 += local59.anInt2728;
				if (local59.aClass248Array2 != null) {
					local32 += local59.aClass248Array2.length;
				}
				if (local59.aClass281Array2 != null) {
					local34 += local59.aClass281Array2.length;
				}
				if (local59.aClass168Array1 != null) {
					local36 += local59.aClass168Array1.length;
				}
				local38 |= local59.aByteArray25 != null;
				local51 |= local59.anIntArray110 != null;
				local42 |= local59.aByteArray29 != null;
				local46 |= local59.aShortArray25 != null;
				local44 |= local59.aByteArray27 != null;
				if (local59.aByteArray26 == null) {
					if (this.aByte24 == -1) {
						this.aByte24 = local59.aByte24;
					}
					if (this.aByte24 != local59.aByte24) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		if (local46) {
			this.aShortArray25 = new short[this.anInt2720];
		}
		this.anIntArray111 = new int[this.anInt2728];
		this.aShortArray27 = new short[this.anInt2720];
		this.aShortArray31 = new short[this.anInt2728];
		if (local40) {
			this.aByteArray26 = new byte[this.anInt2720];
		}
		if (local34 > 0) {
			this.aClass281Array2 = new Class281[local34];
		}
		this.anIntArray113 = new int[this.anInt2728];
		if (local51) {
			this.anIntArray110 = new int[this.anInt2720];
		}
		this.aShortArray32 = new short[this.anInt2720];
		this.aShortArray30 = new short[this.anInt2720];
		this.anIntArray115 = new int[this.anInt2728];
		this.anIntArray109 = new int[this.anInt2728];
		this.aShortArray26 = new short[this.anInt2720];
		if (local36 > 0) {
			this.aClass168Array1 = new Class168[local36];
		}
		if (local32 > 0) {
			this.aClass248Array2 = new Class248[local32];
		}
		if (local42) {
			this.aByteArray29 = new byte[this.anInt2720];
		}
		if (local38) {
			this.aByteArray25 = new byte[this.anInt2720];
		}
		if (local44) {
			this.aByteArray27 = new byte[this.anInt2720];
		}
		this.aShortArray29 = new short[this.anInt2720];
		if (this.anInt2716 > 0) {
			this.anIntArray114 = new int[this.anInt2716];
			this.aShortArray28 = new short[this.anInt2716];
			this.aShortArray34 = new short[this.anInt2716];
			this.anIntArray119 = new int[this.anInt2716];
			this.aShortArray33 = new short[this.anInt2716];
			this.anIntArray118 = new int[this.anInt2716];
			this.anIntArray117 = new int[this.anInt2716];
			this.anIntArray112 = new int[this.anInt2716];
			this.aByteArray28 = new byte[this.anInt2716];
			this.anIntArray116 = new int[this.anInt2716];
			this.aByteArray30 = new byte[this.anInt2716];
			this.aByteArray31 = new byte[this.anInt2716];
		}
		local32 = 0;
		this.anInt2716 = 0;
		local36 = 0;
		this.anInt2720 = 0;
		this.anInt2728 = 0;
		local34 = 0;
		@Pc(626) int local626;
		@Pc(637) int local637;
		for (@Pc(386) int local386 = 0; local386 < arg1; local386++) {
			@Pc(393) short local393 = (short) (0x1 << local386);
			@Pc(397) Class84 local397 = arg0[local386];
			if (local397 != null) {
				@Pc(404) int local404;
				if (local397.aClass168Array1 != null) {
					for (local404 = 0; local404 < local397.aClass168Array1.length; local404++) {
						@Pc(411) Class168 local411 = local397.aClass168Array1[local404];
						this.aClass168Array1[local36++] = local411.method4021(this.anInt2720 + local411.anInt4620);
					}
				}
				for (local404 = 0; local404 < local397.anInt2720; local404++) {
					if (local38 && local397.aByteArray25 != null) {
						this.aByteArray25[this.anInt2720] = local397.aByteArray25[local404];
					}
					if (local40) {
						if (local397.aByteArray26 == null) {
							this.aByteArray26[this.anInt2720] = local397.aByte24;
						} else {
							this.aByteArray26[this.anInt2720] = local397.aByteArray26[local404];
						}
					}
					if (local42 && local397.aByteArray29 != null) {
						this.aByteArray29[this.anInt2720] = local397.aByteArray29[local404];
					}
					if (local46) {
						if (local397.aShortArray25 == null) {
							this.aShortArray25[this.anInt2720] = -1;
						} else {
							this.aShortArray25[this.anInt2720] = local397.aShortArray25[local404];
						}
					}
					if (local51) {
						if (local397.anIntArray110 == null) {
							this.anIntArray110[this.anInt2720] = -1;
						} else {
							this.anIntArray110[this.anInt2720] = local397.anIntArray110[local404];
						}
					}
					this.aShortArray26[this.anInt2720] = (short) this.method2441(local397.aShortArray26[local404], local397, local393);
					this.aShortArray27[this.anInt2720] = (short) this.method2441(local397.aShortArray27[local404], local397, local393);
					this.aShortArray32[this.anInt2720] = (short) this.method2441(local397.aShortArray32[local404], local397, local393);
					this.aShortArray30[this.anInt2720] = local393;
					this.aShortArray29[this.anInt2720] = local397.aShortArray29[local404];
					this.anInt2720++;
				}
				@Pc(613) int local613;
				if (local397.aClass248Array2 != null) {
					for (local613 = 0; local613 < local397.aClass248Array2.length; local613++) {
						local626 = this.method2441(local397.aClass248Array2[local613].anInt6893, local397, local393);
						local637 = this.method2441(local397.aClass248Array2[local613].anInt6900, local397, local393);
						@Pc(648) int local648 = this.method2441(local397.aClass248Array2[local613].anInt6907, local397, local393);
						this.aClass248Array2[local32] = local397.aClass248Array2[local613].method5774(local626, local648, local637);
						local32++;
					}
				}
				if (local397.aClass281Array2 != null) {
					for (local613 = 0; local613 < local397.aClass281Array2.length; local613++) {
						local626 = this.method2441(local397.aClass281Array2[local613].anInt7415, local397, local393);
						this.aClass281Array2[local34] = local397.aClass281Array2[local613].method6192(local626);
						local34++;
					}
				}
			}
		}
		this.anInt2719 = this.anInt2728;
		@Pc(722) int local722 = 0;
		for (@Pc(724) int local724 = 0; local724 < arg1; local724++) {
			@Pc(731) short local731 = (short) (0x1 << local724);
			@Pc(735) Class84 local735 = arg0[local724];
			if (local735 != null) {
				for (local626 = 0; local626 < local735.anInt2720; local626++) {
					if (local44) {
						this.aByteArray27[local722++] = (byte) (local735.aByteArray27 == null || local735.aByteArray27[local626] == -1 ? -1 : local735.aByteArray27[local626] + this.anInt2716);
					}
				}
				for (local637 = 0; local637 < local735.anInt2716; local637++) {
					@Pc(792) byte local792 = this.aByteArray31[this.anInt2716] = local735.aByteArray31[local637];
					if (local792 == 0) {
						this.aShortArray34[this.anInt2716] = (short) this.method2441(local735.aShortArray34[local637], local735, local731);
						this.aShortArray28[this.anInt2716] = (short) this.method2441(local735.aShortArray28[local637], local735, local731);
						this.aShortArray33[this.anInt2716] = (short) this.method2441(local735.aShortArray33[local637], local735, local731);
					}
					if (local792 >= 1 && local792 <= 3) {
						this.aShortArray34[this.anInt2716] = local735.aShortArray34[local637];
						this.aShortArray28[this.anInt2716] = local735.aShortArray28[local637];
						this.aShortArray33[this.anInt2716] = local735.aShortArray33[local637];
						this.anIntArray119[this.anInt2716] = local735.anIntArray119[local637];
						this.anIntArray117[this.anInt2716] = local735.anIntArray117[local637];
						this.anIntArray116[this.anInt2716] = local735.anIntArray116[local637];
						this.aByteArray28[this.anInt2716] = local735.aByteArray28[local637];
						this.aByteArray30[this.anInt2716] = local735.aByteArray30[local637];
						this.anIntArray118[this.anInt2716] = local735.anIntArray118[local637];
					}
					if (local792 == 2) {
						this.anIntArray112[this.anInt2716] = local735.anIntArray112[local637];
						this.anIntArray114[this.anInt2716] = local735.anIntArray114[local637];
					}
					this.anInt2716++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ISBBSBBII)I")
	public int method2430(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray26[this.anInt2720] = (short) arg6;
		this.aShortArray27[this.anInt2720] = (short) arg7;
		this.aShortArray32[this.anInt2720] = (short) arg0;
		this.aByteArray25[this.anInt2720] = arg5;
		this.aByteArray27[this.anInt2720] = arg4;
		this.aShortArray29[this.anInt2720] = arg1;
		this.aByteArray29[this.anInt2720] = arg2;
		this.aShortArray25[this.anInt2720] = arg3;
		return this.anInt2720++;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)V")
	public void method2431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2728; local15++) {
			this.anIntArray111[local15] += arg1;
			this.anIntArray113[local15] += arg0;
			this.anIntArray115[local15] += arg2;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(SSI)V")
	public void method2432(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2720; local7++) {
			if (this.aShortArray29[local7] == arg0) {
				this.aShortArray29[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public void method2433() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2728; local11++) {
			this.anIntArray111[local11] <<= 0x2;
			this.anIntArray113[local11] <<= 0x2;
			this.anIntArray115[local11] <<= 0x2;
		}
		if (this.anInt2716 <= 0 || this.anIntArray119 == null) {
			return;
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray119.length; local61++) {
			this.anIntArray119[local61] <<= 0x2;
			this.anIntArray117[local61] <<= 0x2;
			if (this.aByteArray31[local61] != 1) {
				this.anIntArray116[local61] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIII)V")
	public void method2434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(32) int local32;
		if (arg0 != 0) {
			local7 = Class356.anIntArray597[arg0];
			local11 = Class356.anIntArray598[arg0];
			for (local13 = 0; local13 < this.anInt2728; local13++) {
				local32 = local7 * this.anIntArray113[local13] + local11 * this.anIntArray111[local13] >> 14;
				this.anIntArray113[local13] = this.anIntArray113[local13] * local11 - local7 * this.anIntArray111[local13] >> 14;
				this.anIntArray111[local13] = local32;
			}
		}
		if (arg1 != 0) {
			local7 = Class356.anIntArray597[arg1];
			local11 = Class356.anIntArray598[arg1];
			for (local13 = 0; local13 < this.anInt2728; local13++) {
				local32 = this.anIntArray113[local13] * local11 - local7 * this.anIntArray115[local13] >> 14;
				this.anIntArray115[local13] = this.anIntArray115[local13] * local11 + this.anIntArray113[local13] * local7 >> 14;
				this.anIntArray113[local13] = local32;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local7 = Class356.anIntArray597[arg2];
		local11 = Class356.anIntArray598[arg2];
		for (local13 = 0; local13 < this.anInt2728; local13++) {
			local32 = this.anIntArray111[local13] * local11 + local7 * this.anIntArray115[local13] >> 14;
			this.anIntArray115[local13] = this.anIntArray115[local13] * local11 - local7 * this.anIntArray111[local13] >> 14;
			this.anIntArray111[local13] = local32;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)[[I")
	public int[][] method2435() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2720; local17++) {
			@Pc(24) int local24 = this.anIntArray110[local17];
			if (local24 >= 0) {
				@Pc(33) int local33 = local8[local24]++;
				if (local10 < local24) {
					local10 = local24;
				}
			}
		}
		@Pc(59) int[][] local59 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local59[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt2720; local80++) {
			@Pc(87) int local87 = this.anIntArray110[local80];
			if (local87 >= 0) {
				local59[local87][local8[local87]++] = local80;
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(IIII)I")
	public int method2436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2728; local7++) {
			if (arg1 == this.anIntArray111[local7] && arg2 == this.anIntArray113[local7] && arg0 == this.anIntArray115[local7]) {
				return local7;
			}
		}
		this.anIntArray111[this.anInt2728] = arg1;
		this.anIntArray113[this.anInt2728] = arg2;
		this.anIntArray115[this.anInt2728] = arg0;
		this.anInt2719 = this.anInt2728 + 1;
		return this.anInt2728++;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)[[I")
	public int[][] method2437() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass168Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass168Array1[local12].anInt4626;
			if (local20 >= 0) {
				@Pc(29) int local29 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(48) int[][] local48 = new int[local10 + 1][];
		for (@Pc(50) int local50 = 0; local50 <= local10; local50++) {
			local48[local50] = new int[local8[local50]];
			local8[local50] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.aClass168Array1.length; local73++) {
			@Pc(90) int local90 = this.aClass168Array1[local73].anInt4626;
			if (local90 >= 0) {
				local48[local90][local8[local90]++] = local73;
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[B)V")
	private void method2438(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub11 local10 = new Class3_Sub11(arg0);
		@Pc(15) Class3_Sub11 local15 = new Class3_Sub11(arg0);
		@Pc(20) Class3_Sub11 local20 = new Class3_Sub11(arg0);
		@Pc(25) Class3_Sub11 local25 = new Class3_Sub11(arg0);
		@Pc(30) Class3_Sub11 local30 = new Class3_Sub11(arg0);
		@Pc(35) Class3_Sub11 local35 = new Class3_Sub11(arg0);
		@Pc(40) Class3_Sub11 local40 = new Class3_Sub11(arg0);
		local10.anInt6128 = arg0.length - 23;
		this.anInt2728 = local10.method5198();
		this.anInt2720 = local10.method5198();
		this.anInt2716 = local10.method5175();
		@Pc(65) int local65 = local10.method5175();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(98) boolean local98 = (local65 & 0x4) == 4;
		@Pc(107) boolean local107 = (local65 & 0x8) == 8;
		if (local107) {
			local10.anInt6128 -= 7;
			this.anInt2725 = local10.method5175();
			local10.anInt6128 += 6;
		}
		@Pc(130) int local130 = local10.method5175();
		@Pc(134) int local134 = local10.method5175();
		@Pc(138) int local138 = local10.method5175();
		@Pc(142) int local142 = local10.method5175();
		@Pc(154) int local154 = local10.method5175();
		@Pc(158) int local158 = local10.method5198();
		@Pc(162) int local162 = local10.method5198();
		@Pc(166) int local166 = local10.method5198();
		@Pc(170) int local170 = local10.method5198();
		@Pc(174) int local174 = local10.method5198();
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(180) int local180 = 0;
		@Pc(193) int local193;
		if (this.anInt2716 > 0) {
			local10.anInt6128 = 0;
			this.aByteArray31 = new byte[this.anInt2716];
			for (local193 = 0; local193 < this.anInt2716; local193++) {
				@Pc(204) byte local204 = this.aByteArray31[local193] = local10.method5212();
				if (local204 == 2) {
					local180++;
				}
				if (local204 >= 1 && local204 <= 3) {
					local178++;
				}
				if (local204 == 0) {
					local176++;
				}
			}
		}
		local193 = this.anInt2716;
		@Pc(232) int local232 = local193;
		local193 += this.anInt2728;
		@Pc(239) int local239 = local193;
		if (local76) {
			local193 += this.anInt2720;
		}
		@Pc(248) int local248 = local193;
		local193 += this.anInt2720;
		@Pc(255) int local255 = local193;
		if (local130 == 255) {
			local193 += this.anInt2720;
		}
		@Pc(267) int local267 = local193;
		if (local138 == 1) {
			local193 += this.anInt2720;
		}
		@Pc(279) int local279 = local193;
		if (local154 == 1) {
			local193 += this.anInt2728;
		}
		@Pc(291) int local291 = local193;
		if (local134 == 1) {
			local193 += this.anInt2720;
		}
		@Pc(301) int local301 = local193;
		local193 += local170;
		@Pc(307) int local307 = local193;
		if (local142 == 1) {
			local193 += this.anInt2720 * 2;
		}
		@Pc(319) int local319 = local193;
		local193 += local174;
		@Pc(325) int local325 = local193;
		local193 += this.anInt2720 * 2;
		@Pc(334) int local334 = local193;
		local193 += local158;
		@Pc(340) int local340 = local193;
		local193 += local162;
		@Pc(346) int local346 = local193;
		local193 += local166;
		@Pc(352) int local352 = local193;
		local193 += local176 * 6;
		@Pc(360) int local360 = local193;
		local193 += local178 * 6;
		@Pc(368) byte local368 = 6;
		if (this.anInt2725 == 14) {
			local368 = 7;
		} else if (this.anInt2725 >= 15) {
			local368 = 9;
		}
		@Pc(384) int local384 = local193;
		local193 += local368 * local178;
		@Pc(392) int local392 = local193;
		local193 += local178;
		@Pc(398) int local398 = local193;
		local193 += local178;
		@Pc(404) int local404 = local193;
		local193 += local180 * 2 + local178;
		if (local142 == 1) {
			this.aShortArray25 = new short[this.anInt2720];
		}
		this.aShortArray29 = new short[this.anInt2720];
		if (local142 == 1 && this.anInt2716 > 0) {
			this.aByteArray27 = new byte[this.anInt2720];
		}
		local10.anInt6128 = local232;
		if (local138 == 1) {
			this.anIntArray110 = new int[this.anInt2720];
		}
		this.aShortArray26 = new short[this.anInt2720];
		if (local130 == 255) {
			this.aByteArray26 = new byte[this.anInt2720];
		} else {
			this.aByte24 = (byte) local130;
		}
		this.aShortArray27 = new short[this.anInt2720];
		this.aShortArray32 = new short[this.anInt2720];
		this.anIntArray111 = new int[this.anInt2728];
		if (local134 == 1) {
			this.aByteArray29 = new byte[this.anInt2720];
		}
		this.anIntArray113 = new int[this.anInt2728];
		if (local154 == 1) {
			this.anIntArray109 = new int[this.anInt2728];
		}
		if (this.anInt2716 > 0) {
			this.aShortArray33 = new short[this.anInt2716];
			this.aShortArray28 = new short[this.anInt2716];
			if (local178 > 0) {
				this.aByteArray28 = new byte[local178];
				this.aByteArray30 = new byte[local178];
				this.anIntArray118 = new int[local178];
				this.anIntArray119 = new int[local178];
				this.anIntArray117 = new int[local178];
				this.anIntArray116 = new int[local178];
			}
			this.aShortArray34 = new short[this.anInt2716];
			if (local180 > 0) {
				this.anIntArray112 = new int[local180];
				this.anIntArray114 = new int[local180];
			}
		}
		this.anIntArray115 = new int[this.anInt2728];
		if (local76) {
			this.aByteArray25 = new byte[this.anInt2720];
		}
		local15.anInt6128 = local334;
		local20.anInt6128 = local340;
		local25.anInt6128 = local346;
		local30.anInt6128 = local279;
		@Pc(601) int local601 = 0;
		@Pc(603) int local603 = 0;
		@Pc(605) int local605 = 0;
		@Pc(613) int local613;
		for (@Pc(607) int local607 = 0; local607 < this.anInt2728; local607++) {
			local613 = local10.method5175();
			@Pc(615) int local615 = 0;
			if ((local613 & 0x1) != 0) {
				local615 = local15.method5172();
			}
			@Pc(628) int local628 = 0;
			if ((local613 & 0x2) != 0) {
				local628 = local20.method5172();
			}
			@Pc(638) int local638 = 0;
			if ((local613 & 0x4) != 0) {
				local638 = local25.method5172();
			}
			this.anIntArray111[local607] = local615 + local601;
			this.anIntArray113[local607] = local628 + local603;
			this.anIntArray115[local607] = local605 + local638;
			local601 = this.anIntArray111[local607];
			local605 = this.anIntArray115[local607];
			local603 = this.anIntArray113[local607];
			if (local154 == 1) {
				this.anIntArray109[local607] = local30.method5175();
			}
		}
		local10.anInt6128 = local325;
		local15.anInt6128 = local239;
		local20.anInt6128 = local255;
		local25.anInt6128 = local291;
		local30.anInt6128 = local267;
		local35.anInt6128 = local307;
		local40.anInt6128 = local319;
		for (local613 = 0; local613 < this.anInt2720; local613++) {
			this.aShortArray29[local613] = (short) local10.method5198();
			if (local76) {
				this.aByteArray25[local613] = local15.method5212();
			}
			if (local130 == 255) {
				this.aByteArray26[local613] = local20.method5212();
			}
			if (local134 == 1) {
				this.aByteArray29[local613] = local25.method5212();
			}
			if (local138 == 1) {
				this.anIntArray110[local613] = local30.method5175();
			}
			if (local142 == 1) {
				this.aShortArray25[local613] = (short) (local35.method5198() - 1);
			}
			if (this.aByteArray27 != null) {
				if (this.aShortArray25[local613] == -1) {
					this.aByteArray27[local613] = -1;
				} else {
					this.aByteArray27[local613] = (byte) (local40.method5175() - 1);
				}
			}
		}
		this.anInt2719 = -1;
		local10.anInt6128 = local301;
		local15.anInt6128 = local248;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(836) short local836 = 0;
		@Pc(838) short local838 = 0;
		@Pc(846) int local846;
		for (@Pc(840) int local840 = 0; local840 < this.anInt2720; local840++) {
			local846 = local15.method5175();
			if (local846 == 1) {
				local832 = (short) (local838 + local10.method5172());
				local834 = (short) (local10.method5172() + local832);
				local836 = (short) (local834 + local10.method5172());
				this.aShortArray26[local840] = local832;
				local838 = local836;
				this.aShortArray27[local840] = local834;
				this.aShortArray32[local840] = local836;
				if (local832 > this.anInt2719) {
					this.anInt2719 = local832;
				}
				if (this.anInt2719 < local834) {
					this.anInt2719 = local834;
				}
				if (this.anInt2719 < local836) {
					this.anInt2719 = local836;
				}
			}
			if (local846 == 2) {
				local834 = local836;
				local836 = (short) (local10.method5172() + local838);
				local838 = local836;
				this.aShortArray26[local840] = local832;
				this.aShortArray27[local840] = local834;
				this.aShortArray32[local840] = local836;
				if (local836 > this.anInt2719) {
					this.anInt2719 = local836;
				}
			}
			if (local846 == 3) {
				local832 = local836;
				local836 = (short) (local10.method5172() + local838);
				this.aShortArray26[local840] = local832;
				local838 = local836;
				this.aShortArray27[local840] = local834;
				this.aShortArray32[local840] = local836;
				if (local836 > this.anInt2719) {
					this.anInt2719 = local836;
				}
			}
			if (local846 == 4) {
				@Pc(1013) short local1013 = local832;
				local832 = local834;
				local836 = (short) (local838 + local10.method5172());
				local834 = local1013;
				this.aShortArray26[local840] = local832;
				local838 = local836;
				this.aShortArray27[local840] = local1013;
				this.aShortArray32[local840] = local836;
				if (this.anInt2719 < local836) {
					this.anInt2719 = local836;
				}
			}
		}
		local10.anInt6128 = local352;
		this.anInt2719++;
		local15.anInt6128 = local360;
		local20.anInt6128 = local384;
		local25.anInt6128 = local392;
		local30.anInt6128 = local398;
		local35.anInt6128 = local404;
		@Pc(1088) int local1088;
		for (local846 = 0; local846 < this.anInt2716; local846++) {
			local1088 = this.aByteArray31[local846] & 0xFF;
			if (local1088 == 0) {
				this.aShortArray34[local846] = (short) local10.method5198();
				this.aShortArray28[local846] = (short) local10.method5198();
				this.aShortArray33[local846] = (short) local10.method5198();
			}
			if (local1088 == 1) {
				this.aShortArray34[local846] = (short) local15.method5198();
				this.aShortArray28[local846] = (short) local15.method5198();
				this.aShortArray33[local846] = (short) local15.method5198();
				if (this.anInt2725 >= 15) {
					this.anIntArray119[local846] = local20.method5230();
					this.anIntArray117[local846] = local20.method5230();
					this.anIntArray116[local846] = local20.method5230();
				} else {
					this.anIntArray119[local846] = local20.method5198();
					if (this.anInt2725 >= 14) {
						this.anIntArray117[local846] = local20.method5230();
					} else {
						this.anIntArray117[local846] = local20.method5198();
					}
					this.anIntArray116[local846] = local20.method5198();
				}
				this.aByteArray28[local846] = local25.method5212();
				this.aByteArray30[local846] = local30.method5212();
				this.anIntArray118[local846] = local35.method5212();
			}
			if (local1088 == 2) {
				this.aShortArray34[local846] = (short) local15.method5198();
				this.aShortArray28[local846] = (short) local15.method5198();
				this.aShortArray33[local846] = (short) local15.method5198();
				if (this.anInt2725 >= 15) {
					this.anIntArray119[local846] = local20.method5230();
					this.anIntArray117[local846] = local20.method5230();
					this.anIntArray116[local846] = local20.method5230();
				} else {
					this.anIntArray119[local846] = local20.method5198();
					if (this.anInt2725 < 14) {
						this.anIntArray117[local846] = local20.method5198();
					} else {
						this.anIntArray117[local846] = local20.method5230();
					}
					this.anIntArray116[local846] = local20.method5198();
				}
				this.aByteArray28[local846] = local25.method5212();
				this.aByteArray30[local846] = local30.method5212();
				this.anIntArray118[local846] = local35.method5212();
				this.anIntArray112[local846] = local35.method5212();
				this.anIntArray114[local846] = local35.method5212();
			}
			if (local1088 == 3) {
				this.aShortArray34[local846] = (short) local15.method5198();
				this.aShortArray28[local846] = (short) local15.method5198();
				this.aShortArray33[local846] = (short) local15.method5198();
				if (this.anInt2725 >= 15) {
					this.anIntArray119[local846] = local20.method5230();
					this.anIntArray117[local846] = local20.method5230();
					this.anIntArray116[local846] = local20.method5230();
				} else {
					this.anIntArray119[local846] = local20.method5198();
					if (this.anInt2725 >= 14) {
						this.anIntArray117[local846] = local20.method5230();
					} else {
						this.anIntArray117[local846] = local20.method5198();
					}
					this.anIntArray116[local846] = local20.method5198();
				}
				this.aByteArray28[local846] = local25.method5212();
				this.aByteArray30[local846] = local30.method5212();
				this.anIntArray118[local846] = local35.method5212();
			}
		}
		local10.anInt6128 = local193;
		@Pc(1486) int local1486;
		@Pc(1492) int local1492;
		@Pc(1496) int local1496;
		@Pc(1562) int local1562;
		if (local87) {
			local1088 = local10.method5175();
			if (local1088 > 0) {
				this.aClass248Array2 = new Class248[local1088];
				for (local1486 = 0; local1486 < local1088; local1486++) {
					local1492 = local10.method5198();
					local1496 = local10.method5198();
					@Pc(1504) byte local1504;
					if (local130 == 255) {
						local1504 = this.aByteArray26[local1496];
					} else {
						local1504 = (byte) local130;
					}
					this.aClass248Array2[local1486] = new Class248(local1492, this.aShortArray26[local1496], this.aShortArray27[local1496], this.aShortArray32[local1496], local1504);
				}
			}
			local1486 = local10.method5175();
			if (local1486 > 0) {
				this.aClass281Array2 = new Class281[local1486];
				for (local1492 = 0; local1492 < local1486; local1492++) {
					local1496 = local10.method5198();
					local1562 = local10.method5198();
					this.aClass281Array2[local1492] = new Class281(local1496, local1562);
				}
			}
		}
		if (!local98) {
			return;
		}
		local1088 = local10.method5175();
		if (local1088 <= 0) {
			return;
		}
		this.aClass168Array1 = new Class168[local1088];
		for (local1486 = 0; local1486 < local1088; local1486++) {
			local1492 = local10.method5198();
			local1496 = local10.method5198();
			local1562 = local10.method5175();
			@Pc(1614) byte local1614 = local10.method5212();
			this.aClass168Array1[local1486] = new Class168(local1492, local1496, local1562, local1614);
		}
		return;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BBSSBSSBSS)B")
	public byte method2439() {
		if (this.anInt2716 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray31[this.anInt2716] = 3;
		this.aShortArray34[this.anInt2716] = 0;
		this.aShortArray28[this.anInt2716] = 32767;
		this.aShortArray33[this.anInt2716] = 0;
		this.anIntArray119[this.anInt2716] = 1024;
		this.anIntArray117[this.anInt2716] = 1024;
		this.anIntArray116[this.anInt2716] = 1024;
		this.aByteArray28[this.anInt2716] = 0;
		this.aByteArray30[this.anInt2716] = 0;
		this.anIntArray118[this.anInt2716] = 0;
		return (byte) this.anInt2716++;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([BI)V")
	private void method2440(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub11 local14 = new Class3_Sub11(arg0);
		@Pc(19) Class3_Sub11 local19 = new Class3_Sub11(arg0);
		@Pc(24) Class3_Sub11 local24 = new Class3_Sub11(arg0);
		@Pc(29) Class3_Sub11 local29 = new Class3_Sub11(arg0);
		@Pc(34) Class3_Sub11 local34 = new Class3_Sub11(arg0);
		local14.anInt6128 = arg0.length - 18;
		this.anInt2728 = local14.method5198();
		this.anInt2720 = local14.method5198();
		this.anInt2716 = local14.method5175();
		@Pc(59) int local59 = local14.method5175();
		@Pc(63) int local63 = local14.method5175();
		@Pc(67) int local67 = local14.method5175();
		@Pc(71) int local71 = local14.method5175();
		@Pc(75) int local75 = local14.method5175();
		@Pc(79) int local79 = local14.method5198();
		@Pc(83) int local83 = local14.method5198();
		@Pc(87) int local87 = local14.method5198();
		@Pc(91) int local91 = local14.method5198();
		@Pc(100) int local100 = this.anInt2728;
		@Pc(102) int local102 = local100;
		local100 += this.anInt2720;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt2720;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt2720;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt2720;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt2728;
		}
		@Pc(151) int local151 = local100;
		if (local67 == 1) {
			local100 += this.anInt2720;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt2720 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt2716 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		this.aShortArray26 = new short[this.anInt2720];
		if (local75 == 1) {
			this.anIntArray109 = new int[this.anInt2728];
		}
		if (local71 == 1) {
			this.anIntArray110 = new int[this.anInt2720];
		}
		local14.anInt6128 = 0;
		this.anIntArray113 = new int[this.anInt2728];
		if (local59 == 1) {
			this.aShortArray25 = new short[this.anInt2720];
			this.aByteArray27 = new byte[this.anInt2720];
			this.aByteArray25 = new byte[this.anInt2720];
		}
		this.aShortArray29 = new short[this.anInt2720];
		this.anIntArray111 = new int[this.anInt2728];
		if (local63 == 255) {
			this.aByteArray26 = new byte[this.anInt2720];
		} else {
			this.aByte24 = (byte) local63;
		}
		if (local67 == 1) {
			this.aByteArray29 = new byte[this.anInt2720];
		}
		if (this.anInt2716 > 0) {
			this.aShortArray33 = new short[this.anInt2716];
			this.aShortArray34 = new short[this.anInt2716];
			this.aByteArray31 = new byte[this.anInt2716];
			this.aShortArray28 = new short[this.anInt2716];
		}
		this.aShortArray27 = new short[this.anInt2720];
		this.aShortArray32 = new short[this.anInt2720];
		this.anIntArray115 = new int[this.anInt2728];
		local19.anInt6128 = local187;
		local24.anInt6128 = local193;
		local29.anInt6128 = local100;
		local34.anInt6128 = local141;
		@Pc(354) int local354 = 0;
		@Pc(356) int local356 = 0;
		@Pc(358) int local358 = 0;
		@Pc(366) int local366;
		@Pc(368) int local368;
		for (@Pc(360) int local360 = 0; local360 < this.anInt2728; local360++) {
			local366 = local14.method5175();
			local368 = 0;
			if ((local366 & 0x1) != 0) {
				local368 = local19.method5172();
			}
			@Pc(383) int local383 = 0;
			if ((local366 & 0x2) != 0) {
				local383 = local24.method5172();
			}
			@Pc(396) int local396 = 0;
			if ((local366 & 0x4) != 0) {
				local396 = local29.method5172();
			}
			this.anIntArray111[local360] = local354 + local368;
			this.anIntArray113[local360] = local383 + local356;
			this.anIntArray115[local360] = local396 + local358;
			local358 = this.anIntArray115[local360];
			local356 = this.anIntArray113[local360];
			local354 = this.anIntArray111[local360];
			if (local75 == 1) {
				this.anIntArray109[local360] = local34.method5175();
			}
		}
		local14.anInt6128 = local169;
		local19.anInt6128 = local131;
		local24.anInt6128 = local109;
		local29.anInt6128 = local151;
		local34.anInt6128 = local121;
		for (local366 = 0; local366 < this.anInt2720; local366++) {
			this.aShortArray29[local366] = (short) local14.method5198();
			if (local59 == 1) {
				local368 = local19.method5175();
				if ((local368 & 0x1) == 1) {
					local7 = true;
					this.aByteArray25[local366] = 1;
				} else {
					this.aByteArray25[local366] = 0;
				}
				if ((local368 & 0x2) == 2) {
					this.aByteArray27[local366] = (byte) (local368 >> 2);
					this.aShortArray25[local366] = this.aShortArray29[local366];
					this.aShortArray29[local366] = 127;
					if (this.aShortArray25[local366] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray27[local366] = -1;
					this.aShortArray25[local366] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray26[local366] = local24.method5212();
			}
			if (local67 == 1) {
				this.aByteArray29[local366] = local29.method5212();
			}
			if (local71 == 1) {
				this.anIntArray110[local366] = local34.method5175();
			}
		}
		local14.anInt6128 = local163;
		this.anInt2719 = -1;
		local19.anInt6128 = local102;
		@Pc(619) short local619 = 0;
		@Pc(621) short local621 = 0;
		@Pc(623) short local623 = 0;
		@Pc(625) short local625 = 0;
		@Pc(633) int local633;
		for (@Pc(627) int local627 = 0; local627 < this.anInt2720; local627++) {
			local633 = local19.method5175();
			if (local633 == 1) {
				local619 = (short) (local625 + local14.method5172());
				local621 = (short) (local14.method5172() + local619);
				local623 = (short) (local621 + local14.method5172());
				local625 = local623;
				this.aShortArray26[local627] = local619;
				this.aShortArray27[local627] = local621;
				this.aShortArray32[local627] = local623;
				if (local619 > this.anInt2719) {
					this.anInt2719 = local619;
				}
				if (this.anInt2719 < local621) {
					this.anInt2719 = local621;
				}
				if (local623 > this.anInt2719) {
					this.anInt2719 = local623;
				}
			}
			if (local633 == 2) {
				local621 = local623;
				local623 = (short) (local14.method5172() + local625);
				local625 = local623;
				this.aShortArray26[local627] = local619;
				this.aShortArray27[local627] = local621;
				this.aShortArray32[local627] = local623;
				if (local623 > this.anInt2719) {
					this.anInt2719 = local623;
				}
			}
			if (local633 == 3) {
				local619 = local623;
				local623 = (short) (local625 + local14.method5172());
				local625 = local623;
				this.aShortArray26[local627] = local619;
				this.aShortArray27[local627] = local621;
				this.aShortArray32[local627] = local623;
				if (this.anInt2719 < local623) {
					this.anInt2719 = local623;
				}
			}
			if (local633 == 4) {
				@Pc(788) short local788 = local619;
				local619 = local621;
				local621 = local788;
				local623 = (short) (local625 + local14.method5172());
				this.aShortArray26[local627] = local619;
				local625 = local623;
				this.aShortArray27[local627] = local788;
				this.aShortArray32[local627] = local623;
				if (local623 > this.anInt2719) {
					this.anInt2719 = local623;
				}
			}
		}
		this.anInt2719++;
		local14.anInt6128 = local178;
		for (local633 = 0; local633 < this.anInt2716; local633++) {
			this.aByteArray31[local633] = 0;
			this.aShortArray34[local633] = (short) local14.method5198();
			this.aShortArray28[local633] = (short) local14.method5198();
			this.aShortArray33[local633] = (short) local14.method5198();
		}
		if (this.aByteArray27 != null) {
			@Pc(888) boolean local888 = false;
			for (@Pc(890) int local890 = 0; local890 < this.anInt2720; local890++) {
				@Pc(899) int local899 = this.aByteArray27[local890] & 0xFF;
				if (local899 != 255) {
					if ((this.aShortArray34[local899] & 0xFFFF) == this.aShortArray26[local890] && this.aShortArray27[local890] == (this.aShortArray28[local899] & 0xFFFF) && (this.aShortArray33[local899] & 0xFFFF) == this.aShortArray32[local890]) {
						this.aByteArray27[local890] = -1;
					} else {
						local888 = true;
					}
				}
			}
			if (!local888) {
				this.aByteArray27 = null;
			}
		}
		if (!local9) {
			this.aShortArray25 = null;
		}
		if (!local7) {
			this.aByteArray25 = null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!ef;S)I")
	private int method2441(@OriginalArg(1) int arg0, @OriginalArg(2) Class84 arg1, @OriginalArg(3) short arg2) {
		@Pc(18) int local18 = arg1.anIntArray111[arg0];
		@Pc(23) int local23 = arg1.anIntArray113[arg0];
		@Pc(28) int local28 = arg1.anIntArray115[arg0];
		for (@Pc(30) int local30 = 0; local30 < this.anInt2728; local30++) {
			if (local18 == this.anIntArray111[local30] && local23 == this.anIntArray113[local30] && local28 == this.anIntArray115[local30]) {
				this.aShortArray31[local30] |= arg2;
				return local30;
			}
		}
		this.anIntArray111[this.anInt2728] = local18;
		this.anIntArray113[this.anInt2728] = local23;
		this.anIntArray115[this.anInt2728] = local28;
		this.aShortArray31[this.anInt2728] = arg2;
		this.anIntArray109[this.anInt2728] = arg1.anIntArray109 == null ? -1 : arg1.anIntArray109[arg0];
		return this.anInt2728++;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(SBS)V")
	public void method2442(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray25 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt2720; local11++) {
			if (arg0 == this.aShortArray25[local11]) {
				this.aShortArray25[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BZ)[[I")
	public int[][] method2444(@OriginalArg(1) boolean arg0) {
		@Pc(16) int[] local16 = new int[256];
		@Pc(18) int local18 = 0;
		@Pc(26) int local26 = arg0 ? this.anInt2728 : this.anInt2719;
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) int local35 = this.anIntArray109[local28];
			if (local35 >= 0) {
				@Pc(44) int local44 = local16[local35]++;
				if (local18 < local35) {
					local18 = local35;
				}
			}
		}
		@Pc(69) int[][] local69 = new int[local18 + 1][];
		for (@Pc(71) int local71 = 0; local71 <= local18; local71++) {
			local69[local71] = new int[local16[local71]];
			local16[local71] = 0;
		}
		for (@Pc(90) int local90 = 0; local90 < local26; local90++) {
			@Pc(97) int local97 = this.anIntArray109[local90];
			if (local97 >= 0) {
				local69[local97][local16[local97]++] = local90;
			}
		}
		return local69;
	}
}
