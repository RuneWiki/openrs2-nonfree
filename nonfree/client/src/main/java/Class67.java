import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class67 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "[I")
	public int[] anIntArray141;

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!dba", name = "q", descriptor = "[I")
	public int[] anIntArray142;

	@OriginalMember(owner = "client!dba", name = "t", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!dba", name = "u", descriptor = "[Lclient!gv;")
	public Class136[] aClass136Array1;

	@OriginalMember(owner = "client!dba", name = "w", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!dba", name = "x", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!dba", name = "B", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!dba", name = "D", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!dba", name = "E", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!dba", name = "G", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!dba", name = "I", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!dba", name = "K", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!dba", name = "M", descriptor = "[Lclient!oq;")
	public Class265[] aClass265Array1;

	@OriginalMember(owner = "client!dba", name = "N", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!dba", name = "O", descriptor = "[Lclient!ic;")
	public Class156[] aClass156Array1;

	@OriginalMember(owner = "client!dba", name = "P", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!dba", name = "Q", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!dba", name = "R", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!dba", name = "U", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!dba", name = "W", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!dba", name = "Z", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!dba", name = "ab", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!dba", name = "bb", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!dba", name = "cb", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!dba", name = "db", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
	public int anInt2017 = 0;

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "B")
	public byte aByte45 = 0;

	@OriginalMember(owner = "client!dba", name = "C", descriptor = "I")
	public int anInt2022 = 12;

	@OriginalMember(owner = "client!dba", name = "y", descriptor = "I")
	public int anInt2019 = 0;

	@OriginalMember(owner = "client!dba", name = "F", descriptor = "I")
	public int anInt2023 = 0;

	@OriginalMember(owner = "client!dba", name = "Y", descriptor = "I")
	public int anInt2029 = 0;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "()V")
	private Class67() {
	}

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "([B)V")
	public Class67(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1723(arg0);
		} else {
			this.method1719(arg0);
		}
	}

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(III)V")
	public Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray32 = new byte[arg1];
		this.aShortArray23 = new short[arg1];
		this.anIntArray147 = new int[arg0];
		this.anIntArray146 = new int[arg0];
		this.aShortArray28 = new short[arg1];
		this.aShortArray26 = new short[arg1];
		this.anIntArray142 = new int[arg1];
		this.aByteArray29 = new byte[arg1];
		this.aByteArray27 = new byte[arg1];
		if (arg2 > 0) {
			this.aShortArray24 = new short[arg2];
			this.aByteArray30 = new byte[arg2];
			this.anIntArray143 = new int[arg2];
			this.anIntArray150 = new int[arg2];
			this.aShortArray20 = new short[arg2];
			this.anIntArray141 = new int[arg2];
			this.aByteArray28 = new byte[arg2];
			this.aShortArray27 = new short[arg2];
			this.aByteArray31 = new byte[arg2];
			this.anIntArray144 = new int[arg2];
			this.anIntArray151 = new int[arg2];
			this.anIntArray145 = new int[arg2];
		}
		this.aShortArray22 = new short[arg1];
		this.anIntArray149 = new int[arg0];
		this.aByteArray26 = new byte[arg1];
		this.anIntArray148 = new int[arg0];
		this.aShortArray25 = new short[arg1];
	}

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "([Lclient!dba;I)V")
	public Class67(@OriginalArg(0) Class67[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2019 = 0;
		this.anInt2023 = 0;
		this.anInt2017 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte45 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class67 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt2017 += local59.anInt2017;
				this.anInt2019 += local59.anInt2019;
				this.anInt2023 += local59.anInt2023;
				if (local59.aClass136Array1 != null) {
					local32 += local59.aClass136Array1.length;
				}
				if (local59.aClass265Array1 != null) {
					local34 += local59.aClass265Array1.length;
				}
				local38 |= local59.aByteArray27 != null;
				if (local59.aClass156Array1 != null) {
					local36 += local59.aClass156Array1.length;
				}
				local44 |= local59.aByteArray32 != null;
				if (local59.aByteArray29 == null) {
					if (this.aByte45 == -1) {
						this.aByte45 = local59.aByte45;
					}
					if (local59.aByte45 != this.aByte45) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray26 != null;
				local42 |= local59.aByteArray26 != null;
				local51 |= local59.anIntArray142 != null;
			}
		}
		if (local38) {
			this.aByteArray27 = new byte[this.anInt2019];
		}
		this.aShortArray19 = new short[this.anInt2019];
		this.aShortArray25 = new short[this.anInt2019];
		if (local34 > 0) {
			this.aClass265Array1 = new Class265[local34];
		}
		if (local40) {
			this.aByteArray29 = new byte[this.anInt2019];
		}
		this.anIntArray148 = new int[this.anInt2023];
		if (local36 > 0) {
			this.aClass156Array1 = new Class156[local36];
		}
		this.aShortArray22 = new short[this.anInt2019];
		if (local46) {
			this.aShortArray26 = new short[this.anInt2019];
		}
		if (local51) {
			this.anIntArray142 = new int[this.anInt2019];
		}
		this.aShortArray23 = new short[this.anInt2019];
		if (this.anInt2017 > 0) {
			this.anIntArray150 = new int[this.anInt2017];
			this.aShortArray20 = new short[this.anInt2017];
			this.anIntArray141 = new int[this.anInt2017];
			this.anIntArray144 = new int[this.anInt2017];
			this.aByteArray28 = new byte[this.anInt2017];
			this.aByteArray30 = new byte[this.anInt2017];
			this.aByteArray31 = new byte[this.anInt2017];
			this.anIntArray143 = new int[this.anInt2017];
			this.aShortArray27 = new short[this.anInt2017];
			this.anIntArray151 = new int[this.anInt2017];
			this.anIntArray145 = new int[this.anInt2017];
			this.aShortArray24 = new short[this.anInt2017];
		}
		this.aShortArray21 = new short[this.anInt2023];
		if (local44) {
			this.aByteArray32 = new byte[this.anInt2019];
		}
		this.anIntArray147 = new int[this.anInt2023];
		this.anIntArray149 = new int[this.anInt2023];
		if (local32 > 0) {
			this.aClass136Array1 = new Class136[local32];
		}
		this.anIntArray146 = new int[this.anInt2023];
		if (local42) {
			this.aByteArray26 = new byte[this.anInt2019];
		}
		this.aShortArray28 = new short[this.anInt2019];
		this.anInt2019 = 0;
		local32 = 0;
		local34 = 0;
		local36 = 0;
		this.anInt2017 = 0;
		this.anInt2023 = 0;
		@Pc(624) int local624;
		@Pc(635) int local635;
		for (@Pc(384) int local384 = 0; local384 < arg1; local384++) {
			@Pc(391) short local391 = (short) (0x1 << local384);
			@Pc(395) Class67 local395 = arg0[local384];
			if (local395 != null) {
				@Pc(402) int local402;
				if (local395.aClass156Array1 != null) {
					for (local402 = 0; local402 < local395.aClass156Array1.length; local402++) {
						@Pc(409) Class156 local409 = local395.aClass156Array1[local402];
						this.aClass156Array1[local36++] = local409.method3564(this.anInt2019 + local409.anInt4303);
					}
				}
				for (local402 = 0; local402 < local395.anInt2019; local402++) {
					if (local38 && local395.aByteArray27 != null) {
						this.aByteArray27[this.anInt2019] = local395.aByteArray27[local402];
					}
					if (local40) {
						if (local395.aByteArray29 == null) {
							this.aByteArray29[this.anInt2019] = local395.aByte45;
						} else {
							this.aByteArray29[this.anInt2019] = local395.aByteArray29[local402];
						}
					}
					if (local42 && local395.aByteArray26 != null) {
						this.aByteArray26[this.anInt2019] = local395.aByteArray26[local402];
					}
					if (local46) {
						if (local395.aShortArray26 == null) {
							this.aShortArray26[this.anInt2019] = -1;
						} else {
							this.aShortArray26[this.anInt2019] = local395.aShortArray26[local402];
						}
					}
					if (local51) {
						if (local395.anIntArray142 == null) {
							this.anIntArray142[this.anInt2019] = -1;
						} else {
							this.anIntArray142[this.anInt2019] = local395.anIntArray142[local402];
						}
					}
					this.aShortArray28[this.anInt2019] = (short) this.method1712(local395, local395.aShortArray28[local402], local391);
					this.aShortArray22[this.anInt2019] = (short) this.method1712(local395, local395.aShortArray22[local402], local391);
					this.aShortArray25[this.anInt2019] = (short) this.method1712(local395, local395.aShortArray25[local402], local391);
					this.aShortArray19[this.anInt2019] = local391;
					this.aShortArray23[this.anInt2019] = local395.aShortArray23[local402];
					this.anInt2019++;
				}
				@Pc(611) int local611;
				if (local395.aClass136Array1 != null) {
					for (local611 = 0; local611 < local395.aClass136Array1.length; local611++) {
						local624 = this.method1712(local395, local395.aClass136Array1[local611].anInt3741, local391);
						local635 = this.method1712(local395, local395.aClass136Array1[local611].anInt3739, local391);
						@Pc(646) int local646 = this.method1712(local395, local395.aClass136Array1[local611].anInt3750, local391);
						this.aClass136Array1[local32] = local395.aClass136Array1[local611].method3076(local646, local624, local635);
						local32++;
					}
				}
				if (local395.aClass265Array1 != null) {
					for (local611 = 0; local611 < local395.aClass265Array1.length; local611++) {
						local624 = this.method1712(local395, local395.aClass265Array1[local611].anInt7789, local391);
						this.aClass265Array1[local34] = local395.aClass265Array1[local611].method6433(local624);
						local34++;
					}
				}
			}
		}
		this.anInt2029 = this.anInt2023;
		@Pc(720) int local720 = 0;
		for (@Pc(722) int local722 = 0; local722 < arg1; local722++) {
			@Pc(729) short local729 = (short) (0x1 << local722);
			@Pc(733) Class67 local733 = arg0[local722];
			if (local733 != null) {
				for (local624 = 0; local624 < local733.anInt2019; local624++) {
					if (local44) {
						this.aByteArray32[local720++] = (byte) (local733.aByteArray32 == null || local733.aByteArray32[local624] == -1 ? -1 : local733.aByteArray32[local624] + this.anInt2017);
					}
				}
				for (local635 = 0; local635 < local733.anInt2017; local635++) {
					@Pc(785) byte local785 = this.aByteArray31[this.anInt2017] = local733.aByteArray31[local635];
					if (local785 == 0) {
						this.aShortArray27[this.anInt2017] = (short) this.method1712(local733, local733.aShortArray27[local635], local729);
						this.aShortArray24[this.anInt2017] = (short) this.method1712(local733, local733.aShortArray24[local635], local729);
						this.aShortArray20[this.anInt2017] = (short) this.method1712(local733, local733.aShortArray20[local635], local729);
					}
					if (local785 >= 1 && local785 <= 3) {
						this.aShortArray27[this.anInt2017] = local733.aShortArray27[local635];
						this.aShortArray24[this.anInt2017] = local733.aShortArray24[local635];
						this.aShortArray20[this.anInt2017] = local733.aShortArray20[local635];
						this.anIntArray141[this.anInt2017] = local733.anIntArray141[local635];
						this.anIntArray144[this.anInt2017] = local733.anIntArray144[local635];
						this.anIntArray145[this.anInt2017] = local733.anIntArray145[local635];
						this.aByteArray28[this.anInt2017] = local733.aByteArray28[local635];
						this.aByteArray30[this.anInt2017] = local733.aByteArray30[local635];
						this.anIntArray151[this.anInt2017] = local733.anIntArray151[local635];
					}
					if (local785 == 2) {
						this.anIntArray143[this.anInt2017] = local733.anIntArray143[local635];
						this.anIntArray150[this.anInt2017] = local733.anIntArray150[local635];
					}
					this.anInt2017++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(SBS)V")
	public void method1710(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray26 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt2019; local15++) {
			if (arg0 == this.aShortArray26[local15]) {
				this.aShortArray26[local15] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BISBBIIBS)I")
	public int method1711(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray28[this.anInt2019] = (short) arg1;
		this.aShortArray22[this.anInt2019] = (short) arg5;
		this.aShortArray25[this.anInt2019] = (short) arg4;
		this.aByteArray27[this.anInt2019] = arg0;
		this.aByteArray32[this.anInt2019] = arg3;
		this.aShortArray23[this.anInt2019] = arg2;
		this.aByteArray26[this.anInt2019] = arg6;
		this.aShortArray26[this.anInt2019] = arg7;
		return this.anInt2019++;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!dba;IIS)I")
	private int method1712(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg0.anIntArray147[arg1];
		@Pc(15) int local15 = arg0.anIntArray146[arg1];
		@Pc(20) int local20 = arg0.anIntArray148[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2023; local22++) {
			if (local10 == this.anIntArray147[local22] && this.anIntArray146[local22] == local15 && this.anIntArray148[local22] == local20) {
				this.aShortArray21[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray147[this.anInt2023] = local10;
		this.anIntArray146[this.anInt2023] = local15;
		this.anIntArray148[this.anInt2023] = local20;
		this.aShortArray21[this.anInt2023] = arg2;
		this.anIntArray149[this.anInt2023] = arg0.anIntArray149 == null ? -1 : arg0.anIntArray149[arg1];
		return this.anInt2023++;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZI)[[I")
	public int[][] method1713(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt2023 : this.anInt2029;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray149[local20];
			if (local27 >= 0) {
				if (local27 > local10) {
					local10 = local27;
				}
				@Pc(45) int local45 = local8[local27]++;
			}
		}
		@Pc(61) int[][] local61 = new int[local10 + 1][];
		for (@Pc(63) int local63 = 0; local63 <= local10; local63++) {
			local61[local63] = new int[local8[local63]];
			local8[local63] = 0;
		}
		for (@Pc(93) int local93 = 0; local93 < local18; local93++) {
			@Pc(100) int local100 = this.anIntArray149[local93];
			if (local100 >= 0) {
				local61[local100][local8[local100]++] = local93;
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BIII)I")
	public int method1714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2023; local7++) {
			if (this.anIntArray147[local7] == arg2 && this.anIntArray146[local7] == arg0 && this.anIntArray148[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray147[this.anInt2023] = arg2;
		this.anIntArray146[this.anInt2023] = arg0;
		this.anIntArray148[this.anInt2023] = arg1;
		this.anInt2029 = this.anInt2023 + 1;
		return this.anInt2023++;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BI)V")
	public void method1718() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2023; local7++) {
			this.anIntArray147[local7] <<= 0x2;
			this.anIntArray146[local7] <<= 0x2;
			this.anIntArray148[local7] <<= 0x2;
		}
		if (this.anInt2017 <= 0 || this.anIntArray141 == null) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < this.anIntArray141.length; local60++) {
			this.anIntArray141[local60] <<= 0x2;
			this.anIntArray144[local60] <<= 0x2;
			if (this.aByteArray31[local60] != 1) {
				this.anIntArray145[local60] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "([BB)V")
	private void method1719(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class14_Sub29 local14 = new Class14_Sub29(arg0);
		@Pc(19) Class14_Sub29 local19 = new Class14_Sub29(arg0);
		@Pc(24) Class14_Sub29 local24 = new Class14_Sub29(arg0);
		@Pc(29) Class14_Sub29 local29 = new Class14_Sub29(arg0);
		@Pc(34) Class14_Sub29 local34 = new Class14_Sub29(arg0);
		local14.anInt7264 = arg0.length - 18;
		this.anInt2023 = local14.method5900();
		this.anInt2019 = local14.method5900();
		this.anInt2017 = local14.method5866();
		@Pc(59) int local59 = local14.method5866();
		@Pc(63) int local63 = local14.method5866();
		@Pc(67) int local67 = local14.method5866();
		@Pc(71) int local71 = local14.method5866();
		@Pc(75) int local75 = local14.method5866();
		@Pc(79) int local79 = local14.method5900();
		@Pc(83) int local83 = local14.method5900();
		@Pc(87) int local87 = local14.method5900();
		@Pc(91) int local91 = local14.method5900();
		@Pc(104) int local104 = this.anInt2023;
		@Pc(106) int local106 = local104;
		local104 += this.anInt2019;
		@Pc(113) int local113 = local104;
		if (local63 == 255) {
			local104 += this.anInt2019;
		}
		@Pc(123) int local123 = local104;
		if (local71 == 1) {
			local104 += this.anInt2019;
		}
		@Pc(133) int local133 = local104;
		if (local59 == 1) {
			local104 += this.anInt2019;
		}
		@Pc(143) int local143 = local104;
		if (local75 == 1) {
			local104 += this.anInt2023;
		}
		@Pc(155) int local155 = local104;
		if (local67 == 1) {
			local104 += this.anInt2019;
		}
		@Pc(165) int local165 = local104;
		local104 += local91;
		@Pc(171) int local171 = local104;
		local104 += this.anInt2019 * 2;
		@Pc(180) int local180 = local104;
		local104 += this.anInt2017 * 6;
		@Pc(189) int local189 = local104;
		local104 += local79;
		@Pc(195) int local195 = local104;
		local104 += local83;
		this.aShortArray22 = new short[this.anInt2019];
		if (local63 == 255) {
			this.aByteArray29 = new byte[this.anInt2019];
		} else {
			this.aByte45 = (byte) local63;
		}
		this.aShortArray23 = new short[this.anInt2019];
		if (local75 == 1) {
			this.anIntArray149 = new int[this.anInt2023];
		}
		this.aShortArray25 = new short[this.anInt2019];
		if (local71 == 1) {
			this.anIntArray142 = new int[this.anInt2019];
		}
		if (local59 == 1) {
			this.aByteArray32 = new byte[this.anInt2019];
			this.aShortArray26 = new short[this.anInt2019];
			this.aByteArray27 = new byte[this.anInt2019];
		}
		this.anIntArray146 = new int[this.anInt2023];
		this.anIntArray147 = new int[this.anInt2023];
		if (local67 == 1) {
			this.aByteArray26 = new byte[this.anInt2019];
		}
		local14.anInt7264 = 0;
		this.aShortArray28 = new short[this.anInt2019];
		this.anIntArray148 = new int[this.anInt2023];
		if (this.anInt2017 > 0) {
			this.aShortArray24 = new short[this.anInt2017];
			this.aByteArray31 = new byte[this.anInt2017];
			this.aShortArray20 = new short[this.anInt2017];
			this.aShortArray27 = new short[this.anInt2017];
		}
		local19.anInt7264 = local189;
		local24.anInt7264 = local195;
		local29.anInt7264 = local104;
		local34.anInt7264 = local143;
		@Pc(345) int local345 = 0;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(357) int local357;
		@Pc(359) int local359;
		for (@Pc(351) int local351 = 0; local351 < this.anInt2023; local351++) {
			local357 = local14.method5866();
			local359 = 0;
			if ((local357 & 0x1) != 0) {
				local359 = local19.method5881();
			}
			@Pc(372) int local372 = 0;
			if ((local357 & 0x2) != 0) {
				local372 = local24.method5881();
			}
			@Pc(385) int local385 = 0;
			if ((local357 & 0x4) != 0) {
				local385 = local29.method5881();
			}
			this.anIntArray147[local351] = local359 + local345;
			this.anIntArray146[local351] = local372 + local347;
			this.anIntArray148[local351] = local349 + local385;
			local349 = this.anIntArray148[local351];
			local347 = this.anIntArray146[local351];
			local345 = this.anIntArray147[local351];
			if (local75 == 1) {
				this.anIntArray149[local351] = local34.method5866();
			}
		}
		local14.anInt7264 = local171;
		local19.anInt7264 = local133;
		local24.anInt7264 = local113;
		local29.anInt7264 = local155;
		local34.anInt7264 = local123;
		for (local357 = 0; local357 < this.anInt2019; local357++) {
			this.aShortArray23[local357] = (short) local14.method5900();
			if (local59 == 1) {
				local359 = local19.method5866();
				if ((local359 & 0x1) == 1) {
					this.aByteArray27[local357] = 1;
					local7 = true;
				} else {
					this.aByteArray27[local357] = 0;
				}
				if ((local359 & 0x2) == 2) {
					this.aByteArray32[local357] = (byte) (local359 >> 2);
					this.aShortArray26[local357] = this.aShortArray23[local357];
					this.aShortArray23[local357] = 127;
					if (this.aShortArray26[local357] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray32[local357] = -1;
					this.aShortArray26[local357] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray29[local357] = local24.method5845();
			}
			if (local67 == 1) {
				this.aByteArray26[local357] = local29.method5845();
			}
			if (local71 == 1) {
				this.anIntArray142[local357] = local34.method5866();
			}
		}
		local14.anInt7264 = local165;
		this.anInt2029 = -1;
		local19.anInt7264 = local106;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(615) int local615;
		for (@Pc(609) int local609 = 0; local609 < this.anInt2019; local609++) {
			local615 = local19.method5866();
			if (local615 == 1) {
				local601 = (short) (local607 + local14.method5881());
				local603 = (short) (local14.method5881() + local601);
				local605 = (short) (local14.method5881() + local603);
				this.aShortArray28[local609] = local601;
				local607 = local605;
				this.aShortArray22[local609] = local603;
				this.aShortArray25[local609] = local605;
				if (local601 > this.anInt2029) {
					this.anInt2029 = local601;
				}
				if (local603 > this.anInt2029) {
					this.anInt2029 = local603;
				}
				if (this.anInt2029 < local605) {
					this.anInt2029 = local605;
				}
			}
			if (local615 == 2) {
				local603 = local605;
				local605 = (short) (local607 + local14.method5881());
				this.aShortArray28[local609] = local601;
				local607 = local605;
				this.aShortArray22[local609] = local603;
				this.aShortArray25[local609] = local605;
				if (local605 > this.anInt2029) {
					this.anInt2029 = local605;
				}
			}
			if (local615 == 3) {
				local601 = local605;
				local605 = (short) (local14.method5881() + local607);
				this.aShortArray28[local609] = local601;
				local607 = local605;
				this.aShortArray22[local609] = local603;
				this.aShortArray25[local609] = local605;
				if (local605 > this.anInt2029) {
					this.anInt2029 = local605;
				}
			}
			if (local615 == 4) {
				@Pc(772) short local772 = local601;
				local601 = local603;
				local603 = local772;
				local605 = (short) (local607 + local14.method5881());
				this.aShortArray28[local609] = local601;
				local607 = local605;
				this.aShortArray22[local609] = local772;
				this.aShortArray25[local609] = local605;
				if (local605 > this.anInt2029) {
					this.anInt2029 = local605;
				}
			}
		}
		this.anInt2029++;
		local14.anInt7264 = local180;
		for (local615 = 0; local615 < this.anInt2017; local615++) {
			this.aByteArray31[local615] = 0;
			this.aShortArray27[local615] = (short) local14.method5900();
			this.aShortArray24[local615] = (short) local14.method5900();
			this.aShortArray20[local615] = (short) local14.method5900();
		}
		if (this.aByteArray32 != null) {
			@Pc(872) boolean local872 = false;
			for (@Pc(874) int local874 = 0; local874 < this.anInt2019; local874++) {
				@Pc(883) int local883 = this.aByteArray32[local874] & 0xFF;
				if (local883 != 255) {
					if ((this.aShortArray27[local883] & 0xFFFF) == this.aShortArray28[local874] && (this.aShortArray24[local883] & 0xFFFF) == this.aShortArray22[local874] && this.aShortArray25[local874] == (this.aShortArray20[local883] & 0xFFFF)) {
						this.aByteArray32[local874] = -1;
					} else {
						local872 = true;
					}
				}
			}
			if (!local872) {
				this.aByteArray32 = null;
			}
		}
		if (!local7) {
			this.aByteArray27 = null;
		}
		if (!local9) {
			this.aShortArray26 = null;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)[[I")
	public int[][] method1720() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2019; local12++) {
			@Pc(19) int local19 = this.anIntArray142[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.anInt2019; local77++) {
			@Pc(84) int local84 = this.anIntArray142[local77];
			if (local84 >= 0) {
				local52[local84][local8[local84]++] = local77;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BSS)V")
	public void method1721(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2019; local7++) {
			if (arg0 == this.aShortArray23[local7]) {
				this.aShortArray23[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIII)V")
	public void method1722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(35) int local35;
		if (arg1 != 0) {
			local10 = Class32.anIntArray76[arg1];
			local14 = Class32.anIntArray77[arg1];
			for (local16 = 0; local16 < this.anInt2023; local16++) {
				local35 = this.anIntArray146[local16] * local10 + this.anIntArray147[local16] * local14 >> 14;
				this.anIntArray146[local16] = local14 * this.anIntArray146[local16] - local10 * this.anIntArray147[local16] >> 14;
				this.anIntArray147[local16] = local35;
			}
		}
		if (arg2 != 0) {
			local10 = Class32.anIntArray76[arg2];
			local14 = Class32.anIntArray77[arg2];
			for (local16 = 0; local16 < this.anInt2023; local16++) {
				local35 = local14 * this.anIntArray146[local16] - this.anIntArray148[local16] * local10 >> 14;
				this.anIntArray148[local16] = local10 * this.anIntArray146[local16] + local14 * this.anIntArray148[local16] >> 14;
				this.anIntArray146[local16] = local35;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class32.anIntArray76[arg0];
		local14 = Class32.anIntArray77[arg0];
		for (local16 = 0; local16 < this.anInt2023; local16++) {
			local35 = this.anIntArray147[local16] * local14 + local10 * this.anIntArray148[local16] >> 14;
			this.anIntArray148[local16] = this.anIntArray148[local16] * local14 - this.anIntArray147[local16] * local10 >> 14;
			this.anIntArray147[local16] = local35;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B[B)V")
	private void method1723(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class14_Sub29 local10 = new Class14_Sub29(arg0);
		@Pc(15) Class14_Sub29 local15 = new Class14_Sub29(arg0);
		@Pc(20) Class14_Sub29 local20 = new Class14_Sub29(arg0);
		@Pc(25) Class14_Sub29 local25 = new Class14_Sub29(arg0);
		@Pc(30) Class14_Sub29 local30 = new Class14_Sub29(arg0);
		@Pc(35) Class14_Sub29 local35 = new Class14_Sub29(arg0);
		@Pc(40) Class14_Sub29 local40 = new Class14_Sub29(arg0);
		local10.anInt7264 = arg0.length - 23;
		this.anInt2023 = local10.method5900();
		this.anInt2019 = local10.method5900();
		this.anInt2017 = local10.method5866();
		@Pc(65) int local65 = local10.method5866();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(103) boolean local103 = (local65 & 0x8) == 8;
		if (local103) {
			local10.anInt7264 -= 7;
			this.anInt2022 = local10.method5866();
			local10.anInt7264 += 6;
		}
		@Pc(126) int local126 = local10.method5866();
		@Pc(130) int local130 = local10.method5866();
		@Pc(134) int local134 = local10.method5866();
		@Pc(138) int local138 = local10.method5866();
		@Pc(142) int local142 = local10.method5866();
		@Pc(146) int local146 = local10.method5900();
		@Pc(150) int local150 = local10.method5900();
		@Pc(154) int local154 = local10.method5900();
		@Pc(158) int local158 = local10.method5900();
		@Pc(162) int local162 = local10.method5900();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(189) int local189;
		if (this.anInt2017 > 0) {
			this.aByteArray31 = new byte[this.anInt2017];
			local10.anInt7264 = 0;
			for (local189 = 0; local189 < this.anInt2017; local189++) {
				@Pc(200) byte local200 = this.aByteArray31[local189] = local10.method5845();
				if (local200 == 0) {
					local164++;
				}
				if (local200 == 2) {
					local168++;
				}
				if (local200 >= 1 && local200 <= 3) {
					local166++;
				}
			}
		}
		local189 = this.anInt2017;
		@Pc(232) int local232 = local189;
		local189 += this.anInt2023;
		@Pc(239) int local239 = local189;
		if (local74) {
			local189 += this.anInt2019;
		}
		@Pc(248) int local248 = local189;
		local189 += this.anInt2019;
		@Pc(255) int local255 = local189;
		if (local126 == 255) {
			local189 += this.anInt2019;
		}
		@Pc(265) int local265 = local189;
		if (local134 == 1) {
			local189 += this.anInt2019;
		}
		@Pc(277) int local277 = local189;
		if (local142 == 1) {
			local189 += this.anInt2023;
		}
		@Pc(289) int local289 = local189;
		if (local130 == 1) {
			local189 += this.anInt2019;
		}
		@Pc(299) int local299 = local189;
		local189 += local158;
		@Pc(305) int local305 = local189;
		if (local138 == 1) {
			local189 += this.anInt2019 * 2;
		}
		@Pc(317) int local317 = local189;
		local189 += local162;
		@Pc(323) int local323 = local189;
		local189 += this.anInt2019 * 2;
		@Pc(332) int local332 = local189;
		local189 += local146;
		@Pc(338) int local338 = local189;
		local189 += local150;
		@Pc(344) int local344 = local189;
		local189 += local154;
		@Pc(350) int local350 = local189;
		local189 += local164 * 6;
		@Pc(358) int local358 = local189;
		local189 += local166 * 6;
		@Pc(366) byte local366 = 6;
		if (this.anInt2022 == 14) {
			local366 = 7;
		} else if (this.anInt2022 >= 15) {
			local366 = 9;
		}
		@Pc(384) int local384 = local189;
		local189 += local366 * local166;
		@Pc(392) int local392 = local189;
		local189 += local166;
		@Pc(398) int local398 = local189;
		local189 += local166;
		@Pc(404) int local404 = local189;
		local189 += local168 * 2 + local166;
		if (local138 == 1) {
			this.aShortArray26 = new short[this.anInt2019];
		}
		this.anIntArray148 = new int[this.anInt2023];
		if (this.anInt2017 > 0) {
			if (local168 > 0) {
				this.anIntArray150 = new int[local168];
				this.anIntArray143 = new int[local168];
			}
			this.aShortArray24 = new short[this.anInt2017];
			this.aShortArray20 = new short[this.anInt2017];
			this.aShortArray27 = new short[this.anInt2017];
			if (local166 > 0) {
				this.aByteArray30 = new byte[local166];
				this.anIntArray144 = new int[local166];
				this.aByteArray28 = new byte[local166];
				this.anIntArray141 = new int[local166];
				this.anIntArray145 = new int[local166];
				this.anIntArray151 = new int[local166];
			}
		}
		this.aShortArray28 = new short[this.anInt2019];
		this.anIntArray146 = new int[this.anInt2023];
		this.aShortArray25 = new short[this.anInt2019];
		if (local138 == 1 && this.anInt2017 > 0) {
			this.aByteArray32 = new byte[this.anInt2019];
		}
		this.aShortArray23 = new short[this.anInt2019];
		if (local74) {
			this.aByteArray27 = new byte[this.anInt2019];
		}
		if (local130 == 1) {
			this.aByteArray26 = new byte[this.anInt2019];
		}
		local10.anInt7264 = local232;
		if (local134 == 1) {
			this.anIntArray142 = new int[this.anInt2019];
		}
		this.aShortArray22 = new short[this.anInt2019];
		this.anIntArray147 = new int[this.anInt2023];
		if (local126 == 255) {
			this.aByteArray29 = new byte[this.anInt2019];
		} else {
			this.aByte45 = (byte) local126;
		}
		if (local142 == 1) {
			this.anIntArray149 = new int[this.anInt2023];
		}
		local15.anInt7264 = local332;
		local20.anInt7264 = local338;
		local25.anInt7264 = local344;
		local30.anInt7264 = local277;
		@Pc(600) int local600 = 0;
		@Pc(602) int local602 = 0;
		@Pc(604) int local604 = 0;
		@Pc(612) int local612;
		for (@Pc(606) int local606 = 0; local606 < this.anInt2023; local606++) {
			local612 = local10.method5866();
			@Pc(614) int local614 = 0;
			if ((local612 & 0x1) != 0) {
				local614 = local15.method5881();
			}
			@Pc(627) int local627 = 0;
			if ((local612 & 0x2) != 0) {
				local627 = local20.method5881();
			}
			@Pc(637) int local637 = 0;
			if ((local612 & 0x4) != 0) {
				local637 = local25.method5881();
			}
			this.anIntArray147[local606] = local614 + local600;
			this.anIntArray146[local606] = local627 + local602;
			this.anIntArray148[local606] = local604 + local637;
			local604 = this.anIntArray148[local606];
			local602 = this.anIntArray146[local606];
			local600 = this.anIntArray147[local606];
			if (local142 == 1) {
				this.anIntArray149[local606] = local30.method5866();
			}
		}
		local10.anInt7264 = local323;
		local15.anInt7264 = local239;
		local20.anInt7264 = local255;
		local25.anInt7264 = local289;
		local30.anInt7264 = local265;
		local35.anInt7264 = local305;
		local40.anInt7264 = local317;
		for (local612 = 0; local612 < this.anInt2019; local612++) {
			this.aShortArray23[local612] = (short) local10.method5900();
			if (local74) {
				this.aByteArray27[local612] = local15.method5845();
			}
			if (local126 == 255) {
				this.aByteArray29[local612] = local20.method5845();
			}
			if (local130 == 1) {
				this.aByteArray26[local612] = local25.method5845();
			}
			if (local134 == 1) {
				this.anIntArray142[local612] = local30.method5866();
			}
			if (local138 == 1) {
				this.aShortArray26[local612] = (short) (local35.method5900() - 1);
			}
			if (this.aByteArray32 != null) {
				if (this.aShortArray26[local612] == -1) {
					this.aByteArray32[local612] = -1;
				} else {
					this.aByteArray32[local612] = (byte) (local40.method5866() - 1);
				}
			}
		}
		local10.anInt7264 = local299;
		this.anInt2029 = -1;
		local15.anInt7264 = local248;
		@Pc(835) short local835 = 0;
		@Pc(837) short local837 = 0;
		@Pc(839) short local839 = 0;
		@Pc(841) short local841 = 0;
		@Pc(849) int local849;
		for (@Pc(843) int local843 = 0; local843 < this.anInt2019; local843++) {
			local849 = local15.method5866();
			if (local849 == 1) {
				local835 = (short) (local10.method5881() + local841);
				local837 = (short) (local10.method5881() + local835);
				local839 = (short) (local10.method5881() + local837);
				local841 = local839;
				this.aShortArray28[local843] = local835;
				this.aShortArray22[local843] = local837;
				this.aShortArray25[local843] = local839;
				if (local835 > this.anInt2029) {
					this.anInt2029 = local835;
				}
				if (local837 > this.anInt2029) {
					this.anInt2029 = local837;
				}
				if (local839 > this.anInt2029) {
					this.anInt2029 = local839;
				}
			}
			if (local849 == 2) {
				local837 = local839;
				local839 = (short) (local10.method5881() + local841);
				local841 = local839;
				this.aShortArray28[local843] = local835;
				this.aShortArray22[local843] = local837;
				this.aShortArray25[local843] = local839;
				if (this.anInt2029 < local839) {
					this.anInt2029 = local839;
				}
			}
			if (local849 == 3) {
				local835 = local839;
				local839 = (short) (local841 + local10.method5881());
				this.aShortArray28[local843] = local835;
				local841 = local839;
				this.aShortArray22[local843] = local837;
				this.aShortArray25[local843] = local839;
				if (this.anInt2029 < local839) {
					this.anInt2029 = local839;
				}
			}
			if (local849 == 4) {
				@Pc(1002) short local1002 = local835;
				local835 = local837;
				local839 = (short) (local10.method5881() + local841);
				local837 = local1002;
				local841 = local839;
				this.aShortArray28[local843] = local835;
				this.aShortArray22[local843] = local1002;
				this.aShortArray25[local843] = local839;
				if (this.anInt2029 < local839) {
					this.anInt2029 = local839;
				}
			}
		}
		local10.anInt7264 = local350;
		this.anInt2029++;
		local15.anInt7264 = local358;
		local20.anInt7264 = local384;
		local25.anInt7264 = local392;
		local30.anInt7264 = local398;
		local35.anInt7264 = local404;
		@Pc(1081) int local1081;
		for (local849 = 0; local849 < this.anInt2017; local849++) {
			local1081 = this.aByteArray31[local849] & 0xFF;
			if (local1081 == 0) {
				this.aShortArray27[local849] = (short) local10.method5900();
				this.aShortArray24[local849] = (short) local10.method5900();
				this.aShortArray20[local849] = (short) local10.method5900();
			}
			if (local1081 == 1) {
				this.aShortArray27[local849] = (short) local15.method5900();
				this.aShortArray24[local849] = (short) local15.method5900();
				this.aShortArray20[local849] = (short) local15.method5900();
				if (this.anInt2022 < 15) {
					this.anIntArray141[local849] = local20.method5900();
					if (this.anInt2022 < 14) {
						this.anIntArray144[local849] = local20.method5900();
					} else {
						this.anIntArray144[local849] = local20.method5862();
					}
					this.anIntArray145[local849] = local20.method5900();
				} else {
					this.anIntArray141[local849] = local20.method5862();
					this.anIntArray144[local849] = local20.method5862();
					this.anIntArray145[local849] = local20.method5862();
				}
				this.aByteArray28[local849] = local25.method5845();
				this.aByteArray30[local849] = local30.method5845();
				this.anIntArray151[local849] = local35.method5845();
			}
			if (local1081 == 2) {
				this.aShortArray27[local849] = (short) local15.method5900();
				this.aShortArray24[local849] = (short) local15.method5900();
				this.aShortArray20[local849] = (short) local15.method5900();
				if (this.anInt2022 < 15) {
					this.anIntArray141[local849] = local20.method5900();
					if (this.anInt2022 < 14) {
						this.anIntArray144[local849] = local20.method5900();
					} else {
						this.anIntArray144[local849] = local20.method5862();
					}
					this.anIntArray145[local849] = local20.method5900();
				} else {
					this.anIntArray141[local849] = local20.method5862();
					this.anIntArray144[local849] = local20.method5862();
					this.anIntArray145[local849] = local20.method5862();
				}
				this.aByteArray28[local849] = local25.method5845();
				this.aByteArray30[local849] = local30.method5845();
				this.anIntArray151[local849] = local35.method5845();
				this.anIntArray143[local849] = local35.method5845();
				this.anIntArray150[local849] = local35.method5845();
			}
			if (local1081 == 3) {
				this.aShortArray27[local849] = (short) local15.method5900();
				this.aShortArray24[local849] = (short) local15.method5900();
				this.aShortArray20[local849] = (short) local15.method5900();
				if (this.anInt2022 < 15) {
					this.anIntArray141[local849] = local20.method5900();
					if (this.anInt2022 >= 14) {
						this.anIntArray144[local849] = local20.method5862();
					} else {
						this.anIntArray144[local849] = local20.method5900();
					}
					this.anIntArray145[local849] = local20.method5900();
				} else {
					this.anIntArray141[local849] = local20.method5862();
					this.anIntArray144[local849] = local20.method5862();
					this.anIntArray145[local849] = local20.method5862();
				}
				this.aByteArray28[local849] = local25.method5845();
				this.aByteArray30[local849] = local30.method5845();
				this.anIntArray151[local849] = local35.method5845();
			}
		}
		local10.anInt7264 = local189;
		@Pc(1483) int local1483;
		@Pc(1489) int local1489;
		@Pc(1493) int local1493;
		@Pc(1553) int local1553;
		if (local85) {
			local1081 = local10.method5866();
			if (local1081 > 0) {
				this.aClass136Array1 = new Class136[local1081];
				for (local1483 = 0; local1483 < local1081; local1483++) {
					local1489 = local10.method5900();
					local1493 = local10.method5900();
					@Pc(1501) byte local1501;
					if (local126 == 255) {
						local1501 = this.aByteArray29[local1493];
					} else {
						local1501 = (byte) local126;
					}
					this.aClass136Array1[local1483] = new Class136(local1489, this.aShortArray28[local1493], this.aShortArray22[local1493], this.aShortArray25[local1493], local1501);
				}
			}
			local1483 = local10.method5866();
			if (local1483 > 0) {
				this.aClass265Array1 = new Class265[local1483];
				for (local1489 = 0; local1489 < local1483; local1489++) {
					local1493 = local10.method5900();
					local1553 = local10.method5900();
					this.aClass265Array1[local1489] = new Class265(local1493, local1553);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1081 = local10.method5866();
		if (local1081 <= 0) {
			return;
		}
		this.aClass156Array1 = new Class156[local1081];
		for (local1483 = 0; local1483 < local1081; local1483++) {
			local1489 = local10.method5900();
			local1493 = local10.method5900();
			local1553 = local10.method5866();
			@Pc(1601) byte local1601 = local10.method5845();
			this.aClass156Array1[local1483] = new Class156(local1489, local1493, local1553, local1601);
		}
		return;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(SSISBSSBBS)B")
	public byte method1724() {
		if (this.anInt2017 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray31[this.anInt2017] = 3;
		this.aShortArray27[this.anInt2017] = 0;
		this.aShortArray24[this.anInt2017] = 32767;
		this.aShortArray20[this.anInt2017] = 0;
		this.anIntArray141[this.anInt2017] = 1024;
		this.anIntArray144[this.anInt2017] = 1024;
		this.anIntArray145[this.anInt2017] = 1024;
		this.aByteArray28[this.anInt2017] = 0;
		this.aByteArray30[this.anInt2017] = 0;
		this.anIntArray151[this.anInt2017] = 0;
		return (byte) this.anInt2017++;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(BIII)V")
	public void method1725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt2023; local5++) {
			this.anIntArray147[local5] += arg2;
			this.anIntArray146[local5] += arg1;
			this.anIntArray148[local5] += arg0;
		}
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)[[I")
	public int[][] method1726() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass156Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass156Array1[local12].anInt4307;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(38) int local38 = local8[local20]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.aClass156Array1.length; local73++) {
			@Pc(81) int local81 = this.aClass156Array1[local73].anInt4307;
			if (local81 >= 0) {
				local52[local81][local8[local81]++] = local73;
			}
		}
		return local52;
	}
}
