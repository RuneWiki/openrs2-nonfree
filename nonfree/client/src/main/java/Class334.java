import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class334 {

	@OriginalMember(owner = "client!so", name = "b", descriptor = "[I")
	public int[] anIntArray588;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "[I")
	public int[] anIntArray589;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
	public int[] anIntArray590;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "[S")
	public short[] aShortArray125;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "[Lclient!mk;")
	public Class235[] aClass235Array5;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "[S")
	public short[] aShortArray126;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "[I")
	public int[] anIntArray591;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "[S")
	public short[] aShortArray127;

	@OriginalMember(owner = "client!so", name = "t", descriptor = "[I")
	public int[] anIntArray592;

	@OriginalMember(owner = "client!so", name = "u", descriptor = "[Lclient!ir;")
	public Class170[] aClass170Array5;

	@OriginalMember(owner = "client!so", name = "w", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!so", name = "x", descriptor = "[I")
	public int[] anIntArray593;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!so", name = "C", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!so", name = "F", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!so", name = "G", descriptor = "[I")
	public int[] anIntArray594;

	@OriginalMember(owner = "client!so", name = "J", descriptor = "[I")
	public int[] anIntArray595;

	@OriginalMember(owner = "client!so", name = "K", descriptor = "[I")
	public int[] anIntArray596;

	@OriginalMember(owner = "client!so", name = "O", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!so", name = "R", descriptor = "[S")
	public short[] aShortArray131;

	@OriginalMember(owner = "client!so", name = "U", descriptor = "[I")
	public int[] anIntArray597;

	@OriginalMember(owner = "client!so", name = "V", descriptor = "[S")
	public short[] aShortArray132;

	@OriginalMember(owner = "client!so", name = "W", descriptor = "[S")
	public short[] aShortArray133;

	@OriginalMember(owner = "client!so", name = "X", descriptor = "[Lclient!mca;")
	public Class226[] aClass226Array1;

	@OriginalMember(owner = "client!so", name = "Y", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!so", name = "ab", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!so", name = "cb", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!so", name = "eb", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "B")
	public byte aByte120 = 0;

	@OriginalMember(owner = "client!so", name = "h", descriptor = "I")
	public int anInt8557 = 0;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "I")
	public int anInt8561 = 0;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "I")
	public int anInt8560 = 0;

	@OriginalMember(owner = "client!so", name = "D", descriptor = "I")
	public int anInt8565 = 12;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	public int anInt8570 = 0;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	private Class334() {
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "([B)V")
	public Class334(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method7394(arg0);
		} else {
			this.method7385(arg0);
		}
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(III)V")
	public Class334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray90 = new byte[arg1];
		this.aShortArray130 = new short[arg1];
		this.aByteArray87 = new byte[arg1];
		this.aByteArray86 = new byte[arg1];
		this.aShortArray129 = new short[arg1];
		this.anIntArray593 = new int[arg0];
		this.anIntArray588 = new int[arg1];
		this.aShortArray132 = new short[arg1];
		this.aShortArray125 = new short[arg1];
		this.aByteArray89 = new byte[arg1];
		this.anIntArray589 = new int[arg0];
		this.anIntArray596 = new int[arg0];
		this.aShortArray128 = new short[arg1];
		if (arg2 > 0) {
			this.aShortArray124 = new short[arg2];
			this.anIntArray597 = new int[arg2];
			this.aByteArray85 = new byte[arg2];
			this.aShortArray133 = new short[arg2];
			this.aByteArray91 = new byte[arg2];
			this.anIntArray590 = new int[arg2];
			this.anIntArray599 = new int[arg2];
			this.anIntArray592 = new int[arg2];
			this.anIntArray595 = new int[arg2];
			this.aByteArray88 = new byte[arg2];
			this.anIntArray594 = new int[arg2];
			this.aShortArray131 = new short[arg2];
		}
		this.anIntArray591 = new int[arg0];
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "([Lclient!so;I)V")
	public Class334(@OriginalArg(0) Class334[] arg0, @OriginalArg(1) int arg1) {
		this.anInt8570 = 0;
		this.anInt8561 = 0;
		this.anInt8557 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte120 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class334 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt8561 += local59.anInt8561;
				this.anInt8570 += local59.anInt8570;
				this.anInt8557 += local59.anInt8557;
				if (local59.aClass226Array1 != null) {
					local36 += local59.aClass226Array1.length;
				}
				if (local59.aClass235Array5 != null) {
					local32 += local59.aClass235Array5.length;
				}
				if (local59.aClass170Array5 != null) {
					local34 += local59.aClass170Array5.length;
				}
				local38 |= local59.aByteArray89 != null;
				local48 |= local59.anIntArray588 != null;
				local46 |= local59.aShortArray128 != null;
				local44 |= local59.aByteArray87 != null;
				local42 |= local59.aByteArray86 != null;
				if (local59.aByteArray90 == null) {
					if (this.aByte120 == -1) {
						this.aByte120 = local59.aByte120;
					}
					if (local59.aByte120 != this.aByte120) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		if (local40) {
			this.aByteArray90 = new byte[this.anInt8557];
		}
		this.anIntArray589 = new int[this.anInt8570];
		if (local34 > 0) {
			this.aClass170Array5 = new Class170[local34];
		}
		if (this.anInt8561 > 0) {
			this.anIntArray597 = new int[this.anInt8561];
			this.aShortArray133 = new short[this.anInt8561];
			this.anIntArray594 = new int[this.anInt8561];
			this.aByteArray91 = new byte[this.anInt8561];
			this.aShortArray124 = new short[this.anInt8561];
			this.aShortArray131 = new short[this.anInt8561];
			this.anIntArray592 = new int[this.anInt8561];
			this.aByteArray85 = new byte[this.anInt8561];
			this.anIntArray599 = new int[this.anInt8561];
			this.anIntArray590 = new int[this.anInt8561];
			this.aByteArray88 = new byte[this.anInt8561];
			this.anIntArray595 = new int[this.anInt8561];
		}
		if (local48) {
			this.anIntArray588 = new int[this.anInt8557];
		}
		this.aShortArray125 = new short[this.anInt8557];
		this.anIntArray596 = new int[this.anInt8570];
		if (local38) {
			this.aByteArray89 = new byte[this.anInt8557];
		}
		this.anIntArray593 = new int[this.anInt8570];
		this.aShortArray130 = new short[this.anInt8557];
		if (local32 > 0) {
			this.aClass235Array5 = new Class235[local32];
		}
		if (local36 > 0) {
			this.aClass226Array1 = new Class226[local36];
		}
		this.aShortArray129 = new short[this.anInt8557];
		this.aShortArray127 = new short[this.anInt8557];
		this.aShortArray132 = new short[this.anInt8557];
		if (local46) {
			this.aShortArray128 = new short[this.anInt8557];
		}
		this.aShortArray126 = new short[this.anInt8570];
		if (local44) {
			this.aByteArray87 = new byte[this.anInt8557];
		}
		this.anIntArray591 = new int[this.anInt8570];
		if (local42) {
			this.aByteArray86 = new byte[this.anInt8557];
		}
		this.anInt8557 = 0;
		this.anInt8570 = 0;
		local34 = 0;
		local32 = 0;
		this.anInt8561 = 0;
		local36 = 0;
		@Pc(613) int local613;
		@Pc(624) int local624;
		for (@Pc(376) int local376 = 0; local376 < arg1; local376++) {
			@Pc(383) short local383 = (short) (0x1 << local376);
			@Pc(387) Class334 local387 = arg0[local376];
			if (local387 != null) {
				@Pc(394) int local394;
				if (local387.aClass226Array1 != null) {
					for (local394 = 0; local394 < local387.aClass226Array1.length; local394++) {
						@Pc(401) Class226 local401 = local387.aClass226Array1[local394];
						this.aClass226Array1[local36++] = local401.method4837(local401.anInt5493 + this.anInt8557);
					}
				}
				for (local394 = 0; local394 < local387.anInt8557; local394++) {
					if (local38 && local387.aByteArray89 != null) {
						this.aByteArray89[this.anInt8557] = local387.aByteArray89[local394];
					}
					if (local40) {
						if (local387.aByteArray90 == null) {
							this.aByteArray90[this.anInt8557] = local387.aByte120;
						} else {
							this.aByteArray90[this.anInt8557] = local387.aByteArray90[local394];
						}
					}
					if (local42 && local387.aByteArray86 != null) {
						this.aByteArray86[this.anInt8557] = local387.aByteArray86[local394];
					}
					if (local46) {
						if (local387.aShortArray128 == null) {
							this.aShortArray128[this.anInt8557] = -1;
						} else {
							this.aShortArray128[this.anInt8557] = local387.aShortArray128[local394];
						}
					}
					if (local48) {
						if (local387.anIntArray588 == null) {
							this.anIntArray588[this.anInt8557] = -1;
						} else {
							this.anIntArray588[this.anInt8557] = local387.anIntArray588[local394];
						}
					}
					this.aShortArray125[this.anInt8557] = (short) this.method7389(local387.aShortArray125[local394], local383, local387);
					this.aShortArray132[this.anInt8557] = (short) this.method7389(local387.aShortArray132[local394], local383, local387);
					this.aShortArray130[this.anInt8557] = (short) this.method7389(local387.aShortArray130[local394], local383, local387);
					this.aShortArray127[this.anInt8557] = local383;
					this.aShortArray129[this.anInt8557] = local387.aShortArray129[local394];
					this.anInt8557++;
				}
				@Pc(600) int local600;
				if (local387.aClass235Array5 != null) {
					for (local600 = 0; local600 < local387.aClass235Array5.length; local600++) {
						local613 = this.method7389(local387.aClass235Array5[local600].anInt5635, local383, local387);
						local624 = this.method7389(local387.aClass235Array5[local600].anInt5634, local383, local387);
						@Pc(635) int local635 = this.method7389(local387.aClass235Array5[local600].anInt5631, local383, local387);
						this.aClass235Array5[local32] = local387.aClass235Array5[local600].method4948(local624, local635, local613);
						local32++;
					}
				}
				if (local387.aClass170Array5 != null) {
					for (local600 = 0; local600 < local387.aClass170Array5.length; local600++) {
						local613 = this.method7389(local387.aClass170Array5[local600].anInt4269, local383, local387);
						this.aClass170Array5[local34] = local387.aClass170Array5[local600].method3790(local613);
						local34++;
					}
				}
			}
		}
		this.anInt8560 = this.anInt8570;
		@Pc(701) int local701 = 0;
		for (@Pc(703) int local703 = 0; local703 < arg1; local703++) {
			@Pc(710) short local710 = (short) (0x1 << local703);
			@Pc(714) Class334 local714 = arg0[local703];
			if (local714 != null) {
				for (local613 = 0; local613 < local714.anInt8557; local613++) {
					if (local44) {
						this.aByteArray87[local701++] = (byte) (local714.aByteArray87 == null || local714.aByteArray87[local613] == -1 ? -1 : this.anInt8561 + local714.aByteArray87[local613]);
					}
				}
				for (local624 = 0; local624 < local714.anInt8561; local624++) {
					@Pc(770) byte local770 = this.aByteArray85[this.anInt8561] = local714.aByteArray85[local624];
					if (local770 == 0) {
						this.aShortArray131[this.anInt8561] = (short) this.method7389(local714.aShortArray131[local624], local710, local714);
						this.aShortArray133[this.anInt8561] = (short) this.method7389(local714.aShortArray133[local624], local710, local714);
						this.aShortArray124[this.anInt8561] = (short) this.method7389(local714.aShortArray124[local624], local710, local714);
					}
					if (local770 >= 1 && local770 <= 3) {
						this.aShortArray131[this.anInt8561] = local714.aShortArray131[local624];
						this.aShortArray133[this.anInt8561] = local714.aShortArray133[local624];
						this.aShortArray124[this.anInt8561] = local714.aShortArray124[local624];
						this.anIntArray599[this.anInt8561] = local714.anIntArray599[local624];
						this.anIntArray594[this.anInt8561] = local714.anIntArray594[local624];
						this.anIntArray595[this.anInt8561] = local714.anIntArray595[local624];
						this.aByteArray88[this.anInt8561] = local714.aByteArray88[local624];
						this.aByteArray91[this.anInt8561] = local714.aByteArray91[local624];
						this.anIntArray590[this.anInt8561] = local714.anIntArray590[local624];
					}
					if (local770 == 2) {
						this.anIntArray597[this.anInt8561] = local714.anIntArray597[local624];
						this.anIntArray592[this.anInt8561] = local714.anIntArray592[local624];
					}
					this.anInt8561++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIII)V")
	public void method7379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(19) int local19;
		@Pc(38) int local38;
		if (arg0 != 0) {
			local13 = Class4_Sub2_Sub26.anIntArray563[arg0];
			local17 = Class4_Sub2_Sub26.anIntArray562[arg0];
			for (local19 = 0; local19 < this.anInt8570; local19++) {
				local38 = local13 * this.anIntArray593[local19] + this.anIntArray596[local19] * local17 >> 14;
				this.anIntArray593[local19] = this.anIntArray593[local19] * local17 - this.anIntArray596[local19] * local13 >> 14;
				this.anIntArray596[local19] = local38;
			}
		}
		if (arg2 != 0) {
			local13 = Class4_Sub2_Sub26.anIntArray563[arg2];
			local17 = Class4_Sub2_Sub26.anIntArray562[arg2];
			for (local19 = 0; local19 < this.anInt8570; local19++) {
				local38 = this.anIntArray593[local19] * local17 - this.anIntArray589[local19] * local13 >> 14;
				this.anIntArray589[local19] = this.anIntArray589[local19] * local17 + this.anIntArray593[local19] * local13 >> 14;
				this.anIntArray593[local19] = local38;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local13 = Class4_Sub2_Sub26.anIntArray563[arg1];
		local17 = Class4_Sub2_Sub26.anIntArray562[arg1];
		for (local19 = 0; local19 < this.anInt8570; local19++) {
			local38 = this.anIntArray589[local19] * local13 + local17 * this.anIntArray596[local19] >> 14;
			this.anIntArray589[local19] = local17 * this.anIntArray589[local19] - this.anIntArray596[local19] * local13 >> 14;
			this.anIntArray596[local19] = local38;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)[[I")
	public int[][] method7380() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass226Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass226Array1[local12].anInt5501;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local20 > local10) {
					local10 = local20;
				}
			}
		}
		@Pc(53) int[][] local53 = new int[local10 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local10; local55++) {
			local53[local55] = new int[local8[local55]];
			local8[local55] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass226Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass226Array1[local78].anInt5501;
			if (local86 >= 0) {
				local53[local86][local8[local86]++] = local78;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)[[I")
	public int[][] method7382() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt8557; local12++) {
			@Pc(19) int local19 = this.anIntArray588[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(46) int[][] local46 = new int[local10 + 1][];
		for (@Pc(48) int local48 = 0; local48 <= local10; local48++) {
			local46[local48] = new int[local8[local48]];
			local8[local48] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt8557; local74++) {
			@Pc(81) int local81 = this.anIntArray588[local74];
			if (local81 >= 0) {
				local46[local81][local8[local81]++] = local74;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BSIIBBBIS)I")
	public int method7383(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) short arg7) {
		this.aShortArray125[this.anInt8557] = (short) arg6;
		this.aShortArray132[this.anInt8557] = (short) arg2;
		this.aShortArray130[this.anInt8557] = (short) arg3;
		this.aByteArray89[this.anInt8557] = arg4;
		this.aByteArray87[this.anInt8557] = arg0;
		this.aShortArray129[this.anInt8557] = arg7;
		this.aByteArray86[this.anInt8557] = arg5;
		this.aShortArray128[this.anInt8557] = arg1;
		return this.anInt8557++;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(SSZ)V")
	public void method7384(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(14) int local14 = 0; local14 < this.anInt8557; local14++) {
			if (this.aShortArray129[local14] == arg0) {
				this.aShortArray129[local14] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([BB)V")
	private void method7385(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0);
		@Pc(19) Class4_Sub11 local19 = new Class4_Sub11(arg0);
		@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0);
		@Pc(29) Class4_Sub11 local29 = new Class4_Sub11(arg0);
		@Pc(34) Class4_Sub11 local34 = new Class4_Sub11(arg0);
		local14.anInt10466 = arg0.length - 18;
		this.anInt8570 = local14.method8859();
		this.anInt8557 = local14.method8859();
		this.anInt8561 = local14.method8865();
		@Pc(59) int local59 = local14.method8865();
		@Pc(63) int local63 = local14.method8865();
		@Pc(67) int local67 = local14.method8865();
		@Pc(71) int local71 = local14.method8865();
		@Pc(75) int local75 = local14.method8865();
		@Pc(79) int local79 = local14.method8859();
		@Pc(83) int local83 = local14.method8859();
		@Pc(87) int local87 = local14.method8859();
		@Pc(91) int local91 = local14.method8859();
		@Pc(100) int local100 = this.anInt8570;
		@Pc(102) int local102 = local100;
		local100 += this.anInt8557;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt8557;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt8557;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt8557;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt8570;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt8557;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt8557 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt8561 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		if (local63 == 255) {
			this.aByteArray90 = new byte[this.anInt8557];
		} else {
			this.aByte120 = (byte) local63;
		}
		this.aShortArray125 = new short[this.anInt8557];
		this.anIntArray596 = new int[this.anInt8570];
		this.aShortArray129 = new short[this.anInt8557];
		this.anIntArray589 = new int[this.anInt8570];
		if (local67 == 1) {
			this.aByteArray86 = new byte[this.anInt8557];
		}
		this.anIntArray593 = new int[this.anInt8570];
		this.aShortArray130 = new short[this.anInt8557];
		this.aShortArray132 = new short[this.anInt8557];
		if (local75 == 1) {
			this.anIntArray591 = new int[this.anInt8570];
		}
		if (this.anInt8561 > 0) {
			this.aShortArray133 = new short[this.anInt8561];
			this.aByteArray85 = new byte[this.anInt8561];
			this.aShortArray131 = new short[this.anInt8561];
			this.aShortArray124 = new short[this.anInt8561];
		}
		local14.anInt10466 = 0;
		if (local71 == 1) {
			this.anIntArray588 = new int[this.anInt8557];
		}
		if (local59 == 1) {
			this.aByteArray89 = new byte[this.anInt8557];
			this.aByteArray87 = new byte[this.anInt8557];
			this.aShortArray128 = new short[this.anInt8557];
		}
		local19.anInt10466 = local187;
		local24.anInt10466 = local193;
		local29.anInt10466 = local100;
		local34.anInt10466 = local143;
		@Pc(337) int local337 = 0;
		@Pc(339) int local339 = 0;
		@Pc(341) int local341 = 0;
		@Pc(349) int local349;
		@Pc(351) int local351;
		for (@Pc(343) int local343 = 0; local343 < this.anInt8570; local343++) {
			local349 = local14.method8865();
			local351 = 0;
			if ((local349 & 0x1) != 0) {
				local351 = local19.method8842();
			}
			@Pc(364) int local364 = 0;
			if ((local349 & 0x2) != 0) {
				local364 = local24.method8842();
			}
			@Pc(377) int local377 = 0;
			if ((local349 & 0x4) != 0) {
				local377 = local29.method8842();
			}
			this.anIntArray596[local343] = local337 + local351;
			this.anIntArray593[local343] = local364 + local339;
			this.anIntArray589[local343] = local341 + local377;
			local341 = this.anIntArray589[local343];
			local339 = this.anIntArray593[local343];
			local337 = this.anIntArray596[local343];
			if (local75 == 1) {
				this.anIntArray591[local343] = local34.method8865();
			}
		}
		local14.anInt10466 = local169;
		local19.anInt10466 = local131;
		local24.anInt10466 = local109;
		local29.anInt10466 = local153;
		local34.anInt10466 = local119;
		for (local349 = 0; local349 < this.anInt8557; local349++) {
			this.aShortArray129[local349] = (short) local14.method8859();
			if (local59 == 1) {
				local351 = local19.method8865();
				if ((local351 & 0x1) == 1) {
					local7 = true;
					this.aByteArray89[local349] = 1;
				} else {
					this.aByteArray89[local349] = 0;
				}
				if ((local351 & 0x2) == 2) {
					this.aByteArray87[local349] = (byte) (local351 >> 2);
					this.aShortArray128[local349] = this.aShortArray129[local349];
					this.aShortArray129[local349] = 127;
					if (this.aShortArray128[local349] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray87[local349] = -1;
					this.aShortArray128[local349] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray90[local349] = local24.method8861();
			}
			if (local67 == 1) {
				this.aByteArray86[local349] = local29.method8861();
			}
			if (local71 == 1) {
				this.anIntArray588[local349] = local34.method8865();
			}
		}
		this.anInt8560 = -1;
		local14.anInt10466 = local163;
		local19.anInt10466 = local102;
		@Pc(598) short local598 = 0;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(612) int local612;
		for (@Pc(606) int local606 = 0; local606 < this.anInt8557; local606++) {
			local612 = local19.method8865();
			if (local612 == 1) {
				local598 = (short) (local14.method8842() + local604);
				local600 = (short) (local598 + local14.method8842());
				local602 = (short) (local14.method8842() + local600);
				local604 = local602;
				this.aShortArray125[local606] = local598;
				this.aShortArray132[local606] = local600;
				this.aShortArray130[local606] = local602;
				if (local598 > this.anInt8560) {
					this.anInt8560 = local598;
				}
				if (this.anInt8560 < local600) {
					this.anInt8560 = local600;
				}
				if (local602 > this.anInt8560) {
					this.anInt8560 = local602;
				}
			}
			if (local612 == 2) {
				local600 = local602;
				local602 = (short) (local14.method8842() + local604);
				local604 = local602;
				this.aShortArray125[local606] = local598;
				this.aShortArray132[local606] = local600;
				this.aShortArray130[local606] = local602;
				if (local602 > this.anInt8560) {
					this.anInt8560 = local602;
				}
			}
			if (local612 == 3) {
				local598 = local602;
				local602 = (short) (local14.method8842() + local604);
				local604 = local602;
				this.aShortArray125[local606] = local598;
				this.aShortArray132[local606] = local600;
				this.aShortArray130[local606] = local602;
				if (this.anInt8560 < local602) {
					this.anInt8560 = local602;
				}
			}
			if (local612 == 4) {
				@Pc(763) short local763 = local598;
				local598 = local600;
				local602 = (short) (local604 + local14.method8842());
				local600 = local763;
				this.aShortArray125[local606] = local598;
				local604 = local602;
				this.aShortArray132[local606] = local763;
				this.aShortArray130[local606] = local602;
				if (local602 > this.anInt8560) {
					this.anInt8560 = local602;
				}
			}
		}
		local14.anInt10466 = local178;
		this.anInt8560++;
		for (local612 = 0; local612 < this.anInt8561; local612++) {
			this.aByteArray85[local612] = 0;
			this.aShortArray131[local612] = (short) local14.method8859();
			this.aShortArray133[local612] = (short) local14.method8859();
			this.aShortArray124[local612] = (short) local14.method8859();
		}
		if (this.aByteArray87 != null) {
			@Pc(863) boolean local863 = false;
			for (@Pc(865) int local865 = 0; local865 < this.anInt8557; local865++) {
				@Pc(874) int local874 = this.aByteArray87[local865] & 0xFF;
				if (local874 != 255) {
					if ((this.aShortArray131[local874] & 0xFFFF) == this.aShortArray125[local865] && this.aShortArray132[local865] == (this.aShortArray133[local874] & 0xFFFF) && this.aShortArray130[local865] == (this.aShortArray124[local874] & 0xFFFF)) {
						this.aByteArray87[local865] = -1;
					} else {
						local863 = true;
					}
				}
			}
			if (!local863) {
				this.aByteArray87 = null;
			}
		}
		if (!local9) {
			this.aShortArray128 = null;
		}
		if (!local7) {
			this.aByteArray89 = null;
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IIII)I")
	public int method7386(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8570; local7++) {
			if (arg0 == this.anIntArray596[local7] && arg1 == this.anIntArray593[local7] && this.anIntArray589[local7] == arg2) {
				return local7;
			}
		}
		this.anIntArray596[this.anInt8570] = arg0;
		this.anIntArray593[this.anInt8570] = arg1;
		this.anIntArray589[this.anInt8570] = arg2;
		this.anInt8560 = this.anInt8570 + 1;
		return this.anInt8570++;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IBII)V")
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8570; local3++) {
			this.anIntArray596[local3] += arg0;
			this.anIntArray593[local3] += arg2;
			this.anIntArray589[local3] += arg1;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IISLclient!so;)I")
	private int method7389(@OriginalArg(1) int arg0, @OriginalArg(2) short arg1, @OriginalArg(3) Class334 arg2) {
		@Pc(15) int local15 = arg2.anIntArray596[arg0];
		@Pc(20) int local20 = arg2.anIntArray593[arg0];
		@Pc(25) int local25 = arg2.anIntArray589[arg0];
		for (@Pc(27) int local27 = 0; local27 < this.anInt8570; local27++) {
			if (this.anIntArray596[local27] == local15 && local20 == this.anIntArray593[local27] && this.anIntArray589[local27] == local25) {
				this.aShortArray126[local27] |= arg1;
				return local27;
			}
		}
		this.anIntArray596[this.anInt8570] = local15;
		this.anIntArray593[this.anInt8570] = local20;
		this.anIntArray589[this.anInt8570] = local25;
		this.aShortArray126[this.anInt8570] = arg1;
		this.anIntArray591[this.anInt8570] = arg2.anIntArray591 == null ? -1 : arg2.anIntArray591[arg0];
		return this.anInt8570++;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(SSI)V")
	public void method7390(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray128 == null) {
			return;
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt8557; local26++) {
			if (arg1 == this.aShortArray128[local26]) {
				this.aShortArray128[local26] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BSBSISSSBS)B")
	public byte method7391() {
		if (this.anInt8561 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray85[this.anInt8561] = 3;
		this.aShortArray131[this.anInt8561] = 0;
		this.aShortArray133[this.anInt8561] = 32767;
		this.aShortArray124[this.anInt8561] = 0;
		this.anIntArray599[this.anInt8561] = 1024;
		this.anIntArray594[this.anInt8561] = 1024;
		this.anIntArray595[this.anInt8561] = 1024;
		this.aByteArray88[this.anInt8561] = 0;
		this.aByteArray91[this.anInt8561] = 0;
		this.anIntArray590[this.anInt8561] = 0;
		return (byte) this.anInt8561++;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZZ)[[I")
	public int[][] method7392(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt8570 : this.anInt8560;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray591[local20];
			if (local27 >= 0) {
				@Pc(36) int local36 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(68) int[][] local68 = new int[local10 + 1][];
		for (@Pc(70) int local70 = 0; local70 <= local10; local70++) {
			local68[local70] = new int[local8[local70]];
			local8[local70] = 0;
		}
		for (@Pc(93) int local93 = 0; local93 < local18; local93++) {
			@Pc(100) int local100 = this.anIntArray591[local93];
			if (local100 >= 0) {
				local68[local100][local8[local100]++] = local93;
			}
		}
		return local68;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z[B)V")
	private void method7394(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg0);
		@Pc(15) Class4_Sub11 local15 = new Class4_Sub11(arg0);
		@Pc(20) Class4_Sub11 local20 = new Class4_Sub11(arg0);
		@Pc(25) Class4_Sub11 local25 = new Class4_Sub11(arg0);
		@Pc(30) Class4_Sub11 local30 = new Class4_Sub11(arg0);
		@Pc(35) Class4_Sub11 local35 = new Class4_Sub11(arg0);
		@Pc(40) Class4_Sub11 local40 = new Class4_Sub11(arg0);
		local10.anInt10466 = arg0.length - 23;
		this.anInt8570 = local10.method8859();
		this.anInt8557 = local10.method8859();
		this.anInt8561 = local10.method8865();
		@Pc(65) int local65 = local10.method8865();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt10466 -= 7;
			this.anInt8565 = local10.method8865();
			local10.anInt10466 += 6;
		}
		@Pc(128) int local128 = local10.method8865();
		@Pc(132) int local132 = local10.method8865();
		@Pc(136) int local136 = local10.method8865();
		@Pc(140) int local140 = local10.method8865();
		@Pc(144) int local144 = local10.method8865();
		@Pc(148) int local148 = local10.method8859();
		@Pc(152) int local152 = local10.method8859();
		@Pc(156) int local156 = local10.method8859();
		@Pc(160) int local160 = local10.method8859();
		@Pc(164) int local164 = local10.method8859();
		@Pc(166) int local166 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(192) int local192;
		if (this.anInt8561 > 0) {
			local10.anInt10466 = 0;
			this.aByteArray85 = new byte[this.anInt8561];
			for (local192 = 0; local192 < this.anInt8561; local192++) {
				@Pc(203) byte local203 = this.aByteArray85[local192] = local10.method8861();
				if (local203 == 2) {
					local176++;
				}
				if (local203 >= 1 && local203 <= 3) {
					local174++;
				}
				if (local203 == 0) {
					local166++;
				}
			}
		}
		local192 = this.anInt8561;
		@Pc(234) int local234 = local192;
		local192 += this.anInt8570;
		@Pc(241) int local241 = local192;
		if (local74) {
			local192 += this.anInt8557;
		}
		@Pc(250) int local250 = local192;
		local192 += this.anInt8557;
		@Pc(257) int local257 = local192;
		if (local128 == 255) {
			local192 += this.anInt8557;
		}
		@Pc(267) int local267 = local192;
		if (local136 == 1) {
			local192 += this.anInt8557;
		}
		@Pc(279) int local279 = local192;
		if (local144 == 1) {
			local192 += this.anInt8570;
		}
		@Pc(291) int local291 = local192;
		if (local132 == 1) {
			local192 += this.anInt8557;
		}
		@Pc(303) int local303 = local192;
		local192 += local160;
		@Pc(309) int local309 = local192;
		if (local140 == 1) {
			local192 += this.anInt8557 * 2;
		}
		@Pc(323) int local323 = local192;
		local192 += local164;
		@Pc(329) int local329 = local192;
		local192 += this.anInt8557 * 2;
		@Pc(338) int local338 = local192;
		local192 += local148;
		@Pc(344) int local344 = local192;
		local192 += local152;
		@Pc(350) int local350 = local192;
		local192 += local156;
		@Pc(356) int local356 = local192;
		local192 += local166 * 6;
		@Pc(364) int local364 = local192;
		local192 += local174 * 6;
		@Pc(372) byte local372 = 6;
		if (this.anInt8565 == 14) {
			local372 = 7;
		} else if (this.anInt8565 >= 15) {
			local372 = 9;
		}
		@Pc(392) int local392 = local192;
		local192 += local174 * local372;
		@Pc(400) int local400 = local192;
		local192 += local174;
		@Pc(406) int local406 = local192;
		local192 += local174;
		@Pc(412) int local412 = local192;
		local192 += local176 * 2 + local174;
		if (local74) {
			this.aByteArray89 = new byte[this.anInt8557];
		}
		if (local132 == 1) {
			this.aByteArray86 = new byte[this.anInt8557];
		}
		if (local144 == 1) {
			this.anIntArray591 = new int[this.anInt8570];
		}
		this.aShortArray125 = new short[this.anInt8557];
		if (local136 == 1) {
			this.anIntArray588 = new int[this.anInt8557];
		}
		if (this.anInt8561 > 0) {
			this.aShortArray133 = new short[this.anInt8561];
			this.aShortArray131 = new short[this.anInt8561];
			if (local176 > 0) {
				this.anIntArray592 = new int[local176];
				this.anIntArray597 = new int[local176];
			}
			this.aShortArray124 = new short[this.anInt8561];
			if (local174 > 0) {
				this.aByteArray91 = new byte[local174];
				this.anIntArray595 = new int[local174];
				this.anIntArray590 = new int[local174];
				this.anIntArray594 = new int[local174];
				this.anIntArray599 = new int[local174];
				this.aByteArray88 = new byte[local174];
			}
		}
		if (local140 == 1) {
			this.aShortArray128 = new short[this.anInt8557];
		}
		this.aShortArray129 = new short[this.anInt8557];
		this.anIntArray596 = new int[this.anInt8570];
		this.anIntArray593 = new int[this.anInt8570];
		this.anIntArray589 = new int[this.anInt8570];
		if (local140 == 1 && this.anInt8561 > 0) {
			this.aByteArray87 = new byte[this.anInt8557];
		}
		if (local128 == 255) {
			this.aByteArray90 = new byte[this.anInt8557];
		} else {
			this.aByte120 = (byte) local128;
		}
		local10.anInt10466 = local234;
		this.aShortArray132 = new short[this.anInt8557];
		this.aShortArray130 = new short[this.anInt8557];
		local15.anInt10466 = local338;
		local20.anInt10466 = local344;
		local25.anInt10466 = local350;
		local30.anInt10466 = local279;
		@Pc(598) int local598 = 0;
		@Pc(600) int local600 = 0;
		@Pc(602) int local602 = 0;
		@Pc(610) int local610;
		for (@Pc(604) int local604 = 0; local604 < this.anInt8570; local604++) {
			local610 = local10.method8865();
			@Pc(612) int local612 = 0;
			if ((local610 & 0x1) != 0) {
				local612 = local15.method8842();
			}
			@Pc(622) int local622 = 0;
			if ((local610 & 0x2) != 0) {
				local622 = local20.method8842();
			}
			@Pc(632) int local632 = 0;
			if ((local610 & 0x4) != 0) {
				local632 = local25.method8842();
			}
			this.anIntArray596[local604] = local598 + local612;
			this.anIntArray593[local604] = local600 + local622;
			this.anIntArray589[local604] = local632 + local602;
			local602 = this.anIntArray589[local604];
			local598 = this.anIntArray596[local604];
			local600 = this.anIntArray593[local604];
			if (local144 == 1) {
				this.anIntArray591[local604] = local30.method8865();
			}
		}
		local10.anInt10466 = local329;
		local15.anInt10466 = local241;
		local20.anInt10466 = local257;
		local25.anInt10466 = local291;
		local30.anInt10466 = local267;
		local35.anInt10466 = local309;
		local40.anInt10466 = local323;
		for (local610 = 0; local610 < this.anInt8557; local610++) {
			this.aShortArray129[local610] = (short) local10.method8859();
			if (local74) {
				this.aByteArray89[local610] = local15.method8861();
			}
			if (local128 == 255) {
				this.aByteArray90[local610] = local20.method8861();
			}
			if (local132 == 1) {
				this.aByteArray86[local610] = local25.method8861();
			}
			if (local136 == 1) {
				this.anIntArray588[local610] = local30.method8865();
			}
			if (local140 == 1) {
				this.aShortArray128[local610] = (short) (local35.method8859() - 1);
			}
			if (this.aByteArray87 != null) {
				if (this.aShortArray128[local610] == -1) {
					this.aByteArray87[local610] = -1;
				} else {
					this.aByteArray87[local610] = (byte) (local40.method8865() - 1);
				}
			}
		}
		this.anInt8560 = -1;
		local10.anInt10466 = local303;
		local15.anInt10466 = local250;
		@Pc(831) short local831 = 0;
		@Pc(833) short local833 = 0;
		@Pc(835) short local835 = 0;
		@Pc(837) short local837 = 0;
		@Pc(845) int local845;
		for (@Pc(839) int local839 = 0; local839 < this.anInt8557; local839++) {
			local845 = local15.method8865();
			if (local845 == 1) {
				local831 = (short) (local837 + local10.method8842());
				local833 = (short) (local10.method8842() + local831);
				local835 = (short) (local10.method8842() + local833);
				local837 = local835;
				this.aShortArray125[local839] = local831;
				this.aShortArray132[local839] = local833;
				this.aShortArray130[local839] = local835;
				if (local831 > this.anInt8560) {
					this.anInt8560 = local831;
				}
				if (this.anInt8560 < local833) {
					this.anInt8560 = local833;
				}
				if (this.anInt8560 < local835) {
					this.anInt8560 = local835;
				}
			}
			if (local845 == 2) {
				local833 = local835;
				local835 = (short) (local10.method8842() + local837);
				this.aShortArray125[local839] = local831;
				local837 = local835;
				this.aShortArray132[local839] = local833;
				this.aShortArray130[local839] = local835;
				if (this.anInt8560 < local835) {
					this.anInt8560 = local835;
				}
			}
			if (local845 == 3) {
				local831 = local835;
				local835 = (short) (local10.method8842() + local837);
				local837 = local835;
				this.aShortArray125[local839] = local831;
				this.aShortArray132[local839] = local833;
				this.aShortArray130[local839] = local835;
				if (local835 > this.anInt8560) {
					this.anInt8560 = local835;
				}
			}
			if (local845 == 4) {
				@Pc(998) short local998 = local831;
				local831 = local833;
				local835 = (short) (local837 + local10.method8842());
				local833 = local998;
				this.aShortArray125[local839] = local831;
				local837 = local835;
				this.aShortArray132[local839] = local998;
				this.aShortArray130[local839] = local835;
				if (this.anInt8560 < local835) {
					this.anInt8560 = local835;
				}
			}
		}
		local10.anInt10466 = local356;
		this.anInt8560++;
		local15.anInt10466 = local364;
		local20.anInt10466 = local392;
		local25.anInt10466 = local400;
		local30.anInt10466 = local406;
		local35.anInt10466 = local412;
		@Pc(1081) int local1081;
		for (local845 = 0; local845 < this.anInt8561; local845++) {
			local1081 = this.aByteArray85[local845] & 0xFF;
			if (local1081 == 0) {
				this.aShortArray131[local845] = (short) local10.method8859();
				this.aShortArray133[local845] = (short) local10.method8859();
				this.aShortArray124[local845] = (short) local10.method8859();
			}
			if (local1081 == 1) {
				this.aShortArray131[local845] = (short) local15.method8859();
				this.aShortArray133[local845] = (short) local15.method8859();
				this.aShortArray124[local845] = (short) local15.method8859();
				if (this.anInt8565 < 15) {
					this.anIntArray599[local845] = local20.method8859();
					if (this.anInt8565 < 14) {
						this.anIntArray594[local845] = local20.method8859();
					} else {
						this.anIntArray594[local845] = local20.method8827();
					}
					this.anIntArray595[local845] = local20.method8859();
				} else {
					this.anIntArray599[local845] = local20.method8827();
					this.anIntArray594[local845] = local20.method8827();
					this.anIntArray595[local845] = local20.method8827();
				}
				this.aByteArray88[local845] = local25.method8861();
				this.aByteArray91[local845] = local30.method8861();
				this.anIntArray590[local845] = local35.method8861();
			}
			if (local1081 == 2) {
				this.aShortArray131[local845] = (short) local15.method8859();
				this.aShortArray133[local845] = (short) local15.method8859();
				this.aShortArray124[local845] = (short) local15.method8859();
				if (this.anInt8565 < 15) {
					this.anIntArray599[local845] = local20.method8859();
					if (this.anInt8565 >= 14) {
						this.anIntArray594[local845] = local20.method8827();
					} else {
						this.anIntArray594[local845] = local20.method8859();
					}
					this.anIntArray595[local845] = local20.method8859();
				} else {
					this.anIntArray599[local845] = local20.method8827();
					this.anIntArray594[local845] = local20.method8827();
					this.anIntArray595[local845] = local20.method8827();
				}
				this.aByteArray88[local845] = local25.method8861();
				this.aByteArray91[local845] = local30.method8861();
				this.anIntArray590[local845] = local35.method8861();
				this.anIntArray597[local845] = local35.method8861();
				this.anIntArray592[local845] = local35.method8861();
			}
			if (local1081 == 3) {
				this.aShortArray131[local845] = (short) local15.method8859();
				this.aShortArray133[local845] = (short) local15.method8859();
				this.aShortArray124[local845] = (short) local15.method8859();
				if (this.anInt8565 < 15) {
					this.anIntArray599[local845] = local20.method8859();
					if (this.anInt8565 >= 14) {
						this.anIntArray594[local845] = local20.method8827();
					} else {
						this.anIntArray594[local845] = local20.method8859();
					}
					this.anIntArray595[local845] = local20.method8859();
				} else {
					this.anIntArray599[local845] = local20.method8827();
					this.anIntArray594[local845] = local20.method8827();
					this.anIntArray595[local845] = local20.method8827();
				}
				this.aByteArray88[local845] = local25.method8861();
				this.aByteArray91[local845] = local30.method8861();
				this.anIntArray590[local845] = local35.method8861();
			}
		}
		local10.anInt10466 = local192;
		@Pc(1489) int local1489;
		@Pc(1495) int local1495;
		@Pc(1499) int local1499;
		@Pc(1565) int local1565;
		if (local85) {
			local1081 = local10.method8865();
			if (local1081 > 0) {
				this.aClass235Array5 = new Class235[local1081];
				for (local1489 = 0; local1489 < local1081; local1489++) {
					local1495 = local10.method8859();
					local1499 = local10.method8859();
					@Pc(1507) byte local1507;
					if (local128 == 255) {
						local1507 = this.aByteArray90[local1499];
					} else {
						local1507 = (byte) local128;
					}
					this.aClass235Array5[local1489] = new Class235(local1495, this.aShortArray125[local1499], this.aShortArray132[local1499], this.aShortArray130[local1499], local1507);
				}
			}
			local1489 = local10.method8865();
			if (local1489 > 0) {
				this.aClass170Array5 = new Class170[local1489];
				for (local1495 = 0; local1495 < local1489; local1495++) {
					local1499 = local10.method8859();
					local1565 = local10.method8859();
					this.aClass170Array5[local1495] = new Class170(local1499, local1565);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1081 = local10.method8865();
		if (local1081 <= 0) {
			return;
		}
		this.aClass226Array1 = new Class226[local1081];
		for (local1489 = 0; local1489 < local1081; local1489++) {
			local1495 = local10.method8859();
			local1499 = local10.method8859();
			local1565 = local10.method8865();
			@Pc(1610) byte local1610 = local10.method8861();
			this.aClass226Array1[local1489] = new Class226(local1495, local1499, local1565, local1610);
		}
		return;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(II)V")
	public void method7395() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt8570; local11++) {
			this.anIntArray596[local11] <<= 0x2;
			this.anIntArray593[local11] <<= 0x2;
			this.anIntArray589[local11] <<= 0x2;
		}
		if (this.anInt8561 <= 0 || this.anIntArray599 == null) {
			return;
		}
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray599.length; local54++) {
			this.anIntArray599[local54] <<= 0x2;
			this.anIntArray594[local54] <<= 0x2;
			if (this.aByteArray85[local54] != 1) {
				this.anIntArray595[local54] <<= 0x2;
			}
		}
	}
}
