import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class74 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "[Lclient!we;")
	public Class264[] aClass264Array1;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "[I")
	public int[] anIntArray98;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "[I")
	public int[] anIntArray100;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "[Lclient!u;")
	public Class236[] aClass236Array1;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "[S")
	public short[] aShortArray21;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "[Lclient!od;")
	public Class179[] aClass179Array1;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "[I")
	public int[] anIntArray101;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "[S")
	public short[] aShortArray22;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "[S")
	public short[] aShortArray23;

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!fe", name = "bb", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "B")
	public byte aByte15 = 0;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public int anInt1943 = 0;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
	public int anInt1949 = 0;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
	public int anInt1955 = 0;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
	public int anInt1947 = 0;

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
	public int anInt1960 = 12;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V")
	public Class74(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1584(arg0);
		} else {
			this.method1587(arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(III)V")
	public Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray103 = new int[arg1];
		this.aByteArray21 = new byte[arg1];
		this.aShortArray18 = new short[arg1];
		this.aByteArray23 = new byte[arg1];
		this.aByteArray20 = new byte[arg1];
		if (arg2 > 0) {
			this.aByteArray24 = new byte[arg2];
			this.anIntArray100 = new int[arg2];
			this.anIntArray95 = new int[arg2];
			this.anIntArray102 = new int[arg2];
			this.aShortArray20 = new short[arg2];
			this.aShortArray23 = new short[arg2];
			this.aShortArray25 = new short[arg2];
			this.anIntArray98 = new int[arg2];
			this.aByteArray22 = new byte[arg2];
			this.anIntArray101 = new int[arg2];
			this.aByteArray26 = new byte[arg2];
			this.anIntArray93 = new int[arg2];
		}
		this.aShortArray26 = new short[arg1];
		this.aShortArray22 = new short[arg1];
		this.aShortArray24 = new short[arg1];
		this.aByteArray25 = new byte[arg1];
		this.anIntArray97 = new int[arg0];
		this.anIntArray99 = new int[arg0];
		this.anIntArray94 = new int[arg0];
		this.aShortArray17 = new short[arg1];
		this.anIntArray96 = new int[arg0];
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([Lclient!fe;I)V")
	public Class74(@OriginalArg(0) Class74[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1949 = 0;
		this.anInt1947 = 0;
		this.anInt1943 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte15 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class74 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt1943 += local59.anInt1943;
				this.anInt1947 += local59.anInt1947;
				this.anInt1949 += local59.anInt1949;
				if (local59.aClass236Array1 != null) {
					local34 += local59.aClass236Array1.length;
				}
				if (local59.aClass179Array1 != null) {
					local32 += local59.aClass179Array1.length;
				}
				local38 |= local59.aByteArray25 != null;
				if (local59.aClass264Array1 != null) {
					local36 += local59.aClass264Array1.length;
				}
				local48 |= local59.anIntArray103 != null;
				if (local59.aByteArray23 == null) {
					if (this.aByte15 == -1) {
						this.aByte15 = local59.aByte15;
					}
					if (this.aByte15 != local59.aByte15) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray20 != null;
				local46 |= local59.aShortArray22 != null;
				local44 |= local59.aByteArray21 != null;
			}
		}
		this.aShortArray21 = new short[this.anInt1943];
		this.aShortArray19 = new short[this.anInt1949];
		if (local36 > 0) {
			this.aClass264Array1 = new Class264[local36];
		}
		if (local42) {
			this.aByteArray20 = new byte[this.anInt1949];
		}
		this.anIntArray99 = new int[this.anInt1943];
		if (local46) {
			this.aShortArray22 = new short[this.anInt1949];
		}
		if (local44) {
			this.aByteArray21 = new byte[this.anInt1949];
		}
		if (local38) {
			this.aByteArray25 = new byte[this.anInt1949];
		}
		this.aShortArray24 = new short[this.anInt1949];
		if (local32 > 0) {
			this.aClass179Array1 = new Class179[local32];
		}
		if (local48) {
			this.anIntArray103 = new int[this.anInt1949];
		}
		this.aShortArray26 = new short[this.anInt1949];
		if (local40) {
			this.aByteArray23 = new byte[this.anInt1949];
		}
		this.aShortArray17 = new short[this.anInt1949];
		this.anIntArray97 = new int[this.anInt1943];
		if (this.anInt1947 > 0) {
			this.anIntArray100 = new int[this.anInt1947];
			this.aShortArray20 = new short[this.anInt1947];
			this.aShortArray25 = new short[this.anInt1947];
			this.aByteArray24 = new byte[this.anInt1947];
			this.anIntArray102 = new int[this.anInt1947];
			this.anIntArray95 = new int[this.anInt1947];
			this.aByteArray26 = new byte[this.anInt1947];
			this.anIntArray101 = new int[this.anInt1947];
			this.anIntArray98 = new int[this.anInt1947];
			this.aByteArray22 = new byte[this.anInt1947];
			this.aShortArray23 = new short[this.anInt1947];
			this.anIntArray93 = new int[this.anInt1947];
		}
		if (local34 > 0) {
			this.aClass236Array1 = new Class236[local34];
		}
		this.anIntArray94 = new int[this.anInt1943];
		this.aShortArray18 = new short[this.anInt1949];
		this.anIntArray96 = new int[this.anInt1943];
		this.anInt1949 = 0;
		local36 = 0;
		this.anInt1947 = 0;
		local34 = 0;
		local32 = 0;
		this.anInt1943 = 0;
		@Pc(617) int local617;
		@Pc(628) int local628;
		for (@Pc(381) int local381 = 0; local381 < arg1; local381++) {
			@Pc(388) short local388 = (short) (0x1 << local381);
			@Pc(392) Class74 local392 = arg0[local381];
			if (local392 != null) {
				@Pc(399) int local399;
				if (local392.aClass264Array1 != null) {
					for (local399 = 0; local399 < local392.aClass264Array1.length; local399++) {
						@Pc(406) Class264 local406 = local392.aClass264Array1[local399];
						this.aClass264Array1[local36++] = local406.method5908(this.anInt1949 + local406.anInt7369);
					}
				}
				for (local399 = 0; local399 < local392.anInt1949; local399++) {
					if (local38 && local392.aByteArray25 != null) {
						this.aByteArray25[this.anInt1949] = local392.aByteArray25[local399];
					}
					if (local40) {
						if (local392.aByteArray23 == null) {
							this.aByteArray23[this.anInt1949] = local392.aByte15;
						} else {
							this.aByteArray23[this.anInt1949] = local392.aByteArray23[local399];
						}
					}
					if (local42 && local392.aByteArray20 != null) {
						this.aByteArray20[this.anInt1949] = local392.aByteArray20[local399];
					}
					if (local46) {
						if (local392.aShortArray22 == null) {
							this.aShortArray22[this.anInt1949] = -1;
						} else {
							this.aShortArray22[this.anInt1949] = local392.aShortArray22[local399];
						}
					}
					if (local48) {
						if (local392.anIntArray103 == null) {
							this.anIntArray103[this.anInt1949] = -1;
						} else {
							this.anIntArray103[this.anInt1949] = local392.anIntArray103[local399];
						}
					}
					this.aShortArray18[this.anInt1949] = (short) this.method1580(local392.aShortArray18[local399], local392, local388);
					this.aShortArray17[this.anInt1949] = (short) this.method1580(local392.aShortArray17[local399], local392, local388);
					this.aShortArray26[this.anInt1949] = (short) this.method1580(local392.aShortArray26[local399], local392, local388);
					this.aShortArray19[this.anInt1949] = local388;
					this.aShortArray24[this.anInt1949] = local392.aShortArray24[local399];
					this.anInt1949++;
				}
				@Pc(604) int local604;
				if (local392.aClass179Array1 != null) {
					for (local604 = 0; local604 < local392.aClass179Array1.length; local604++) {
						local617 = this.method1580(local392.aClass179Array1[local604].anInt4628, local392, local388);
						local628 = this.method1580(local392.aClass179Array1[local604].anInt4624, local392, local388);
						@Pc(639) int local639 = this.method1580(local392.aClass179Array1[local604].anInt4638, local392, local388);
						this.aClass179Array1[local32] = local392.aClass179Array1[local604].method3673(local617, local628, local639);
						local32++;
					}
				}
				if (local392.aClass236Array1 != null) {
					for (local604 = 0; local604 < local392.aClass236Array1.length; local604++) {
						local617 = this.method1580(local392.aClass236Array1[local604].anInt6780, local392, local388);
						this.aClass236Array1[local34] = local392.aClass236Array1[local604].method5359(local617);
						local34++;
					}
				}
			}
		}
		@Pc(713) int local713 = 0;
		this.anInt1955 = this.anInt1943;
		for (@Pc(719) int local719 = 0; local719 < arg1; local719++) {
			@Pc(726) short local726 = (short) (0x1 << local719);
			@Pc(730) Class74 local730 = arg0[local719];
			if (local730 != null) {
				for (local617 = 0; local617 < local730.anInt1949; local617++) {
					if (local44) {
						this.aByteArray21[local713++] = (byte) (local730.aByteArray21 == null || local730.aByteArray21[local617] == -1 ? -1 : local730.aByteArray21[local617] + this.anInt1947);
					}
				}
				for (local628 = 0; local628 < local730.anInt1947; local628++) {
					@Pc(782) byte local782 = this.aByteArray24[this.anInt1947] = local730.aByteArray24[local628];
					if (local782 == 0) {
						this.aShortArray25[this.anInt1947] = (short) this.method1580(local730.aShortArray25[local628], local730, local726);
						this.aShortArray23[this.anInt1947] = (short) this.method1580(local730.aShortArray23[local628], local730, local726);
						this.aShortArray20[this.anInt1947] = (short) this.method1580(local730.aShortArray20[local628], local730, local726);
					}
					if (local782 >= 1 && local782 <= 3) {
						this.aShortArray25[this.anInt1947] = local730.aShortArray25[local628];
						this.aShortArray23[this.anInt1947] = local730.aShortArray23[local628];
						this.aShortArray20[this.anInt1947] = local730.aShortArray20[local628];
						this.anIntArray101[this.anInt1947] = local730.anIntArray101[local628];
						this.anIntArray102[this.anInt1947] = local730.anIntArray102[local628];
						this.anIntArray93[this.anInt1947] = local730.anIntArray93[local628];
						this.aByteArray26[this.anInt1947] = local730.aByteArray26[local628];
						this.aByteArray22[this.anInt1947] = local730.aByteArray22[local628];
						this.anIntArray100[this.anInt1947] = local730.anIntArray100[local628];
					}
					if (local782 == 2) {
						this.anIntArray98[this.anInt1947] = local730.anIntArray98[local628];
						this.anIntArray95[this.anInt1947] = local730.anIntArray95[local628];
					}
					this.anInt1947++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BILclient!fe;S)I")
	private int method1580(@OriginalArg(1) int arg0, @OriginalArg(2) Class74 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray96[arg0];
		@Pc(15) int local15 = arg1.anIntArray94[arg0];
		@Pc(20) int local20 = arg1.anIntArray99[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1943; local22++) {
			if (local10 == this.anIntArray96[local22] && local15 == this.anIntArray94[local22] && this.anIntArray99[local22] == local20) {
				this.aShortArray21[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray96[this.anInt1943] = local10;
		this.anIntArray94[this.anInt1943] = local15;
		this.anIntArray99[this.anInt1943] = local20;
		this.aShortArray21[this.anInt1943] = arg2;
		this.anIntArray97[this.anInt1943] = arg1.anIntArray97 == null ? -1 : arg1.anIntArray97[arg0];
		return this.anInt1943++;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
	public void method1581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg2 != 0) {
			local14 = Class30.anIntArray38[arg2];
			local18 = Class30.anIntArray37[arg2];
			for (local20 = 0; local20 < this.anInt1943; local20++) {
				local38 = local18 * this.anIntArray96[local20] + local14 * this.anIntArray94[local20] >> 15;
				this.anIntArray94[local20] = this.anIntArray94[local20] * local18 - local14 * this.anIntArray96[local20] >> 15;
				this.anIntArray96[local20] = local38;
			}
		}
		if (arg0 != 0) {
			local14 = Class30.anIntArray38[arg0];
			local18 = Class30.anIntArray37[arg0];
			for (local20 = 0; local20 < this.anInt1943; local20++) {
				local38 = local18 * this.anIntArray94[local20] - this.anIntArray99[local20] * local14 >> 15;
				this.anIntArray99[local20] = this.anIntArray99[local20] * local18 + this.anIntArray94[local20] * local14 >> 15;
				this.anIntArray94[local20] = local38;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local14 = Class30.anIntArray38[arg1];
		local18 = Class30.anIntArray37[arg1];
		for (local20 = 0; local20 < this.anInt1943; local20++) {
			local38 = this.anIntArray99[local20] * local14 + this.anIntArray96[local20] * local18 >> 15;
			this.anIntArray99[local20] = local18 * this.anIntArray99[local20] - this.anIntArray96[local20] * local14 >> 15;
			this.anIntArray96[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)[[I")
	public int[][] method1583() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1955; local20++) {
			@Pc(27) int local27 = this.anIntArray97[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(42) int local42 = local8[local27]++;
			}
		}
		@Pc(55) int[][] local55 = new int[local10 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local10; local57++) {
			local55[local57] = new int[local8[local57]];
			local8[local57] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt1955; local76++) {
			@Pc(83) int local83 = this.anIntArray97[local76];
			if (local83 >= 0) {
				local55[local83][local8[local83]++] = local76;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([BI)V")
	private void method1584(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class5_Sub15 local10 = new Class5_Sub15(arg0);
		@Pc(15) Class5_Sub15 local15 = new Class5_Sub15(arg0);
		@Pc(20) Class5_Sub15 local20 = new Class5_Sub15(arg0);
		@Pc(25) Class5_Sub15 local25 = new Class5_Sub15(arg0);
		@Pc(30) Class5_Sub15 local30 = new Class5_Sub15(arg0);
		@Pc(35) Class5_Sub15 local35 = new Class5_Sub15(arg0);
		@Pc(40) Class5_Sub15 local40 = new Class5_Sub15(arg0);
		local10.anInt7013 = arg0.length - 23;
		this.anInt1943 = local10.method5598();
		this.anInt1949 = local10.method5598();
		this.anInt1947 = local10.method5539();
		@Pc(67) int local67 = local10.method5539();
		@Pc(76) boolean local76 = (local67 & 0x1) == 1;
		@Pc(87) boolean local87 = (local67 & 0x2) == 2;
		@Pc(98) boolean local98 = (local67 & 0x4) == 4;
		@Pc(107) boolean local107 = (local67 & 0x8) == 8;
		if (local107) {
			local10.anInt7013 -= 7;
			this.anInt1960 = local10.method5539();
			local10.anInt7013 += 6;
		}
		@Pc(140) int local140 = local10.method5539();
		@Pc(144) int local144 = local10.method5539();
		@Pc(148) int local148 = local10.method5539();
		@Pc(152) int local152 = local10.method5539();
		@Pc(156) int local156 = local10.method5539();
		@Pc(162) int local162 = local10.method5598();
		@Pc(166) int local166 = local10.method5598();
		@Pc(170) int local170 = local10.method5598();
		@Pc(176) int local176 = local10.method5598();
		@Pc(180) int local180 = local10.method5598();
		@Pc(182) int local182 = 0;
		@Pc(184) int local184 = 0;
		@Pc(186) int local186 = 0;
		@Pc(202) int local202;
		if (this.anInt1947 > 0) {
			this.aByteArray24 = new byte[this.anInt1947];
			local10.anInt7013 = 0;
			for (local202 = 0; local202 < this.anInt1947; local202++) {
				@Pc(213) byte local213 = this.aByteArray24[local202] = local10.method5600();
				if (local213 == 0) {
					local182++;
				}
				if (local213 == 2) {
					local186++;
				}
				if (local213 >= 1 && local213 <= 3) {
					local184++;
				}
			}
		}
		local202 = this.anInt1947;
		@Pc(241) int local241 = local202;
		local202 += this.anInt1943;
		@Pc(248) int local248 = local202;
		if (local76) {
			local202 += this.anInt1949;
		}
		@Pc(257) int local257 = local202;
		local202 += this.anInt1949;
		@Pc(264) int local264 = local202;
		if (local140 == 255) {
			local202 += this.anInt1949;
		}
		@Pc(274) int local274 = local202;
		if (local148 == 1) {
			local202 += this.anInt1949;
		}
		@Pc(286) int local286 = local202;
		if (local156 == 1) {
			local202 += this.anInt1943;
		}
		@Pc(298) int local298 = local202;
		if (local144 == 1) {
			local202 += this.anInt1949;
		}
		@Pc(308) int local308 = local202;
		local202 += local176;
		@Pc(314) int local314 = local202;
		if (local152 == 1) {
			local202 += this.anInt1949 * 2;
		}
		@Pc(326) int local326 = local202;
		local202 += local180;
		@Pc(332) int local332 = local202;
		local202 += this.anInt1949 * 2;
		@Pc(341) int local341 = local202;
		local202 += local162;
		@Pc(347) int local347 = local202;
		local202 += local166;
		@Pc(353) int local353 = local202;
		local202 += local170;
		@Pc(359) int local359 = local202;
		local202 += local182 * 6;
		@Pc(367) int local367 = local202;
		local202 += local184 * 6;
		@Pc(383) int local383 = this.anInt1960 >= 14 ? 7 : 6;
		@Pc(385) int local385 = local202;
		local202 += local184 * local383;
		@Pc(393) int local393 = local202;
		local202 += local184;
		@Pc(399) int local399 = local202;
		local202 += local184;
		@Pc(405) int local405 = local202;
		local202 += local184 + local186 * 2;
		if (this.anInt1947 > 0) {
			this.aShortArray23 = new short[this.anInt1947];
			this.aShortArray25 = new short[this.anInt1947];
			if (local184 > 0) {
				this.anIntArray102 = new int[local184];
				this.anIntArray100 = new int[local184];
				this.aByteArray22 = new byte[local184];
				this.aByteArray26 = new byte[local184];
				this.anIntArray101 = new int[local184];
				this.anIntArray93 = new int[local184];
			}
			this.aShortArray20 = new short[this.anInt1947];
			if (local186 > 0) {
				this.anIntArray95 = new int[local186];
				this.anIntArray98 = new int[local186];
			}
		}
		if (local148 == 1) {
			this.anIntArray103 = new int[this.anInt1949];
		}
		if (local76) {
			this.aByteArray25 = new byte[this.anInt1949];
		}
		if (local152 == 1 && this.anInt1947 > 0) {
			this.aByteArray21 = new byte[this.anInt1949];
		}
		this.aShortArray18 = new short[this.anInt1949];
		if (local140 == 255) {
			this.aByteArray23 = new byte[this.anInt1949];
		} else {
			this.aByte15 = (byte) local140;
		}
		this.anIntArray96 = new int[this.anInt1943];
		local10.anInt7013 = local241;
		this.aShortArray26 = new short[this.anInt1949];
		if (local156 == 1) {
			this.anIntArray97 = new int[this.anInt1943];
		}
		this.aShortArray24 = new short[this.anInt1949];
		this.aShortArray17 = new short[this.anInt1949];
		this.anIntArray99 = new int[this.anInt1943];
		if (local152 == 1) {
			this.aShortArray22 = new short[this.anInt1949];
		}
		this.anIntArray94 = new int[this.anInt1943];
		if (local144 == 1) {
			this.aByteArray20 = new byte[this.anInt1949];
		}
		local15.anInt7013 = local341;
		local20.anInt7013 = local347;
		local25.anInt7013 = local353;
		local30.anInt7013 = local286;
		@Pc(601) int local601 = 0;
		@Pc(603) int local603 = 0;
		@Pc(605) int local605 = 0;
		@Pc(613) int local613;
		for (@Pc(607) int local607 = 0; local607 < this.anInt1943; local607++) {
			local613 = local10.method5539();
			@Pc(615) int local615 = 0;
			if ((local613 & 0x1) != 0) {
				local615 = local15.method5576();
			}
			@Pc(625) int local625 = 0;
			if ((local613 & 0x2) != 0) {
				local625 = local20.method5576();
			}
			@Pc(638) int local638 = 0;
			if ((local613 & 0x4) != 0) {
				local638 = local25.method5576();
			}
			this.anIntArray96[local607] = local601 + local615;
			this.anIntArray94[local607] = local625 + local603;
			this.anIntArray99[local607] = local638 + local605;
			local603 = this.anIntArray94[local607];
			local605 = this.anIntArray99[local607];
			local601 = this.anIntArray96[local607];
			if (local156 == 1) {
				this.anIntArray97[local607] = local30.method5539();
			}
		}
		local10.anInt7013 = local332;
		local15.anInt7013 = local248;
		local20.anInt7013 = local264;
		local25.anInt7013 = local298;
		local30.anInt7013 = local274;
		local35.anInt7013 = local314;
		local40.anInt7013 = local326;
		for (local613 = 0; local613 < this.anInt1949; local613++) {
			this.aShortArray24[local613] = (short) local10.method5598();
			if (local76) {
				this.aByteArray25[local613] = local15.method5600();
			}
			if (local140 == 255) {
				this.aByteArray23[local613] = local20.method5600();
			}
			if (local144 == 1) {
				this.aByteArray20[local613] = local25.method5600();
			}
			if (local148 == 1) {
				this.anIntArray103[local613] = local30.method5539();
			}
			if (local152 == 1) {
				this.aShortArray22[local613] = (short) (local35.method5598() - 1);
			}
			if (this.aByteArray21 != null) {
				if (this.aShortArray22[local613] == -1) {
					this.aByteArray21[local613] = -1;
				} else {
					this.aByteArray21[local613] = (byte) (local40.method5539() - 1);
				}
			}
		}
		this.anInt1955 = -1;
		local10.anInt7013 = local308;
		local15.anInt7013 = local257;
		@Pc(838) short local838 = 0;
		@Pc(840) short local840 = 0;
		@Pc(842) short local842 = 0;
		@Pc(844) short local844 = 0;
		@Pc(852) int local852;
		for (@Pc(846) int local846 = 0; local846 < this.anInt1949; local846++) {
			local852 = local15.method5539();
			if (local852 == 1) {
				local838 = (short) (local10.method5576() + local844);
				local840 = (short) (local838 + local10.method5576());
				local842 = (short) (local840 + local10.method5576());
				local844 = local842;
				this.aShortArray18[local846] = local838;
				this.aShortArray17[local846] = local840;
				this.aShortArray26[local846] = local842;
				if (this.anInt1955 < local838) {
					this.anInt1955 = local838;
				}
				if (local840 > this.anInt1955) {
					this.anInt1955 = local840;
				}
				if (this.anInt1955 < local842) {
					this.anInt1955 = local842;
				}
			}
			if (local852 == 2) {
				local840 = local842;
				local842 = (short) (local844 + local10.method5576());
				local844 = local842;
				this.aShortArray18[local846] = local838;
				this.aShortArray17[local846] = local840;
				this.aShortArray26[local846] = local842;
				if (this.anInt1955 < local842) {
					this.anInt1955 = local842;
				}
			}
			if (local852 == 3) {
				local838 = local842;
				local842 = (short) (local844 + local10.method5576());
				local844 = local842;
				this.aShortArray18[local846] = local838;
				this.aShortArray17[local846] = local840;
				this.aShortArray26[local846] = local842;
				if (this.anInt1955 < local842) {
					this.anInt1955 = local842;
				}
			}
			if (local852 == 4) {
				@Pc(1005) short local1005 = local838;
				local838 = local840;
				local840 = local1005;
				local842 = (short) (local10.method5576() + local844);
				local844 = local842;
				this.aShortArray18[local846] = local838;
				this.aShortArray17[local846] = local1005;
				this.aShortArray26[local846] = local842;
				if (this.anInt1955 < local842) {
					this.anInt1955 = local842;
				}
			}
		}
		local10.anInt7013 = local359;
		this.anInt1955++;
		local15.anInt7013 = local367;
		local20.anInt7013 = local385;
		local25.anInt7013 = local393;
		local30.anInt7013 = local399;
		local35.anInt7013 = local405;
		@Pc(1080) int local1080;
		for (local852 = 0; local852 < this.anInt1947; local852++) {
			local1080 = this.aByteArray24[local852] & 0xFF;
			if (local1080 == 0) {
				this.aShortArray25[local852] = (short) local10.method5598();
				this.aShortArray23[local852] = (short) local10.method5598();
				this.aShortArray20[local852] = (short) local10.method5598();
			}
			if (local1080 == 1) {
				this.aShortArray25[local852] = (short) local15.method5598();
				this.aShortArray23[local852] = (short) local15.method5598();
				this.aShortArray20[local852] = (short) local15.method5598();
				this.anIntArray101[local852] = local20.method5598();
				if (this.anInt1960 >= 14) {
					this.anIntArray102[local852] = local20.method5541();
				} else {
					this.anIntArray102[local852] = local20.method5598();
				}
				this.anIntArray93[local852] = local20.method5598();
				this.aByteArray26[local852] = local25.method5600();
				this.aByteArray22[local852] = local30.method5600();
				this.anIntArray100[local852] = local35.method5600();
			}
			if (local1080 == 2) {
				this.aShortArray25[local852] = (short) local15.method5598();
				this.aShortArray23[local852] = (short) local15.method5598();
				this.aShortArray20[local852] = (short) local15.method5598();
				this.anIntArray101[local852] = local20.method5598();
				if (this.anInt1960 < 14) {
					this.anIntArray102[local852] = local20.method5598();
				} else {
					this.anIntArray102[local852] = local20.method5541();
				}
				this.anIntArray93[local852] = local20.method5598();
				this.aByteArray26[local852] = local25.method5600();
				this.aByteArray22[local852] = local30.method5600();
				this.anIntArray100[local852] = local35.method5600();
				this.anIntArray98[local852] = local35.method5600();
				this.anIntArray95[local852] = local35.method5600();
			}
			if (local1080 == 3) {
				this.aShortArray25[local852] = (short) local15.method5598();
				this.aShortArray23[local852] = (short) local15.method5598();
				this.aShortArray20[local852] = (short) local15.method5598();
				this.anIntArray101[local852] = local20.method5598();
				if (this.anInt1960 >= 14) {
					this.anIntArray102[local852] = local20.method5541();
				} else {
					this.anIntArray102[local852] = local20.method5598();
				}
				this.anIntArray93[local852] = local20.method5598();
				this.aByteArray26[local852] = local25.method5600();
				this.aByteArray22[local852] = local30.method5600();
				this.anIntArray100[local852] = local35.method5600();
			}
		}
		local10.anInt7013 = local202;
		@Pc(1413) int local1413;
		@Pc(1419) int local1419;
		@Pc(1423) int local1423;
		@Pc(1485) int local1485;
		if (local87) {
			local1080 = local10.method5539();
			if (local1080 > 0) {
				this.aClass179Array1 = new Class179[local1080];
				for (local1413 = 0; local1413 < local1080; local1413++) {
					local1419 = local10.method5598();
					local1423 = local10.method5598();
					@Pc(1431) byte local1431;
					if (local140 == 255) {
						local1431 = this.aByteArray23[local1423];
					} else {
						local1431 = (byte) local140;
					}
					this.aClass179Array1[local1413] = new Class179(local1419, this.aShortArray18[local1423], this.aShortArray17[local1423], this.aShortArray26[local1423], local1431);
				}
			}
			local1413 = local10.method5539();
			if (local1413 > 0) {
				this.aClass236Array1 = new Class236[local1413];
				for (local1419 = 0; local1419 < local1413; local1419++) {
					local1423 = local10.method5598();
					local1485 = local10.method5598();
					this.aClass236Array1[local1419] = new Class236(local1423, local1485);
				}
			}
		}
		if (!local98) {
			return;
		}
		local1080 = local10.method5539();
		if (local1080 <= 0) {
			return;
		}
		this.aClass264Array1 = new Class264[local1080];
		for (local1413 = 0; local1413 < local1080; local1413++) {
			local1419 = local10.method5598();
			local1423 = local10.method5598();
			local1485 = local10.method5539();
			@Pc(1533) byte local1533 = local10.method5600();
			this.aClass264Array1[local1413] = new Class264(local1419, local1423, local1485, local1533);
		}
		return;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIB)I")
	public int method1585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1943; local7++) {
			if (arg2 == this.anIntArray96[local7] && arg0 == this.anIntArray94[local7] && arg1 == this.anIntArray99[local7]) {
				return local7;
			}
		}
		this.anIntArray96[this.anInt1943] = arg2;
		this.anIntArray94[this.anInt1943] = arg0;
		this.anIntArray99[this.anInt1943] = arg1;
		this.anInt1955 = this.anInt1943 + 1;
		return this.anInt1943++;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(SSSBISBBSS)B")
	public byte method1586() {
		if (this.anInt1947 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray24[this.anInt1947] = 3;
		this.aShortArray25[this.anInt1947] = 0;
		this.aShortArray23[this.anInt1947] = 32767;
		this.aShortArray20[this.anInt1947] = 0;
		this.anIntArray101[this.anInt1947] = 1024;
		this.anIntArray102[this.anInt1947] = 1024;
		this.anIntArray93[this.anInt1947] = 1024;
		this.aByteArray26[this.anInt1947] = 0;
		this.aByteArray22[this.anInt1947] = 0;
		this.anIntArray100[this.anInt1947] = 0;
		return (byte) this.anInt1947++;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([BZ)V")
	private void method1587(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class5_Sub15 local14 = new Class5_Sub15(arg0);
		@Pc(19) Class5_Sub15 local19 = new Class5_Sub15(arg0);
		@Pc(24) Class5_Sub15 local24 = new Class5_Sub15(arg0);
		@Pc(29) Class5_Sub15 local29 = new Class5_Sub15(arg0);
		@Pc(34) Class5_Sub15 local34 = new Class5_Sub15(arg0);
		local14.anInt7013 = arg0.length - 18;
		this.anInt1943 = local14.method5598();
		this.anInt1949 = local14.method5598();
		this.anInt1947 = local14.method5539();
		@Pc(59) int local59 = local14.method5539();
		@Pc(63) int local63 = local14.method5539();
		@Pc(67) int local67 = local14.method5539();
		@Pc(71) int local71 = local14.method5539();
		@Pc(75) int local75 = local14.method5539();
		@Pc(79) int local79 = local14.method5598();
		@Pc(83) int local83 = local14.method5598();
		@Pc(87) int local87 = local14.method5598();
		@Pc(91) int local91 = local14.method5598();
		@Pc(100) int local100 = this.anInt1943;
		@Pc(102) int local102 = local100;
		local100 += this.anInt1949;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt1949;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt1949;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt1949;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt1943;
		}
		@Pc(151) int local151 = local100;
		if (local67 == 1) {
			local100 += this.anInt1949;
		}
		@Pc(161) int local161 = local100;
		local100 += local91;
		@Pc(167) int local167 = local100;
		local100 += this.anInt1949 * 2;
		@Pc(176) int local176 = local100;
		local100 += this.anInt1947 * 6;
		@Pc(185) int local185 = local100;
		local100 += local79;
		@Pc(191) int local191 = local100;
		local100 += local83;
		this.anIntArray99 = new int[this.anInt1943];
		this.aShortArray26 = new short[this.anInt1949];
		local14.anInt7013 = 0;
		if (local75 == 1) {
			this.anIntArray97 = new int[this.anInt1943];
		}
		if (local71 == 1) {
			this.anIntArray103 = new int[this.anInt1949];
		}
		this.anIntArray96 = new int[this.anInt1943];
		this.aShortArray17 = new short[this.anInt1949];
		if (this.anInt1947 > 0) {
			this.aShortArray25 = new short[this.anInt1947];
			this.aByteArray24 = new byte[this.anInt1947];
			this.aShortArray20 = new short[this.anInt1947];
			this.aShortArray23 = new short[this.anInt1947];
		}
		this.aShortArray18 = new short[this.anInt1949];
		if (local59 == 1) {
			this.aShortArray22 = new short[this.anInt1949];
			this.aByteArray21 = new byte[this.anInt1949];
			this.aByteArray25 = new byte[this.anInt1949];
		}
		this.aShortArray24 = new short[this.anInt1949];
		this.anIntArray94 = new int[this.anInt1943];
		if (local67 == 1) {
			this.aByteArray20 = new byte[this.anInt1949];
		}
		if (local63 == 255) {
			this.aByteArray23 = new byte[this.anInt1949];
		} else {
			this.aByte15 = (byte) local63;
		}
		local19.anInt7013 = local185;
		local24.anInt7013 = local191;
		local29.anInt7013 = local100;
		local34.anInt7013 = local141;
		@Pc(341) int local341 = 0;
		@Pc(343) int local343 = 0;
		@Pc(345) int local345 = 0;
		@Pc(357) int local357;
		@Pc(359) int local359;
		for (@Pc(351) int local351 = 0; local351 < this.anInt1943; local351++) {
			local357 = local14.method5539();
			local359 = 0;
			if ((local357 & 0x1) != 0) {
				local359 = local19.method5576();
			}
			@Pc(372) int local372 = 0;
			if ((local357 & 0x2) != 0) {
				local372 = local24.method5576();
			}
			@Pc(382) int local382 = 0;
			if ((local357 & 0x4) != 0) {
				local382 = local29.method5576();
			}
			this.anIntArray96[local351] = local359 + local341;
			this.anIntArray94[local351] = local372 + local343;
			this.anIntArray99[local351] = local345 + local382;
			local341 = this.anIntArray96[local351];
			local345 = this.anIntArray99[local351];
			local343 = this.anIntArray94[local351];
			if (local75 == 1) {
				this.anIntArray97[local351] = local34.method5539();
			}
		}
		local14.anInt7013 = local167;
		local19.anInt7013 = local129;
		local24.anInt7013 = local109;
		local29.anInt7013 = local151;
		local34.anInt7013 = local119;
		for (local357 = 0; local357 < this.anInt1949; local357++) {
			this.aShortArray24[local357] = (short) local14.method5598();
			if (local59 == 1) {
				local359 = local19.method5539();
				if ((local359 & 0x1) == 1) {
					this.aByteArray25[local357] = 1;
					local7 = true;
				} else {
					this.aByteArray25[local357] = 0;
				}
				if ((local359 & 0x2) == 2) {
					this.aByteArray21[local357] = (byte) (local359 >> 2);
					this.aShortArray22[local357] = this.aShortArray24[local357];
					this.aShortArray24[local357] = 127;
					if (this.aShortArray22[local357] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray21[local357] = -1;
					this.aShortArray22[local357] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray23[local357] = local24.method5600();
			}
			if (local67 == 1) {
				this.aByteArray20[local357] = local29.method5600();
			}
			if (local71 == 1) {
				this.anIntArray103[local357] = local34.method5539();
			}
		}
		this.anInt1955 = -1;
		local14.anInt7013 = local161;
		local19.anInt7013 = local102;
		@Pc(611) short local611 = 0;
		@Pc(613) short local613 = 0;
		@Pc(615) short local615 = 0;
		@Pc(617) short local617 = 0;
		@Pc(625) int local625;
		for (@Pc(619) int local619 = 0; local619 < this.anInt1949; local619++) {
			local625 = local19.method5539();
			if (local625 == 1) {
				local611 = (short) (local14.method5576() + local617);
				local613 = (short) (local14.method5576() + local611);
				local615 = (short) (local613 + local14.method5576());
				this.aShortArray18[local619] = local611;
				local617 = local615;
				this.aShortArray17[local619] = local613;
				this.aShortArray26[local619] = local615;
				if (this.anInt1955 < local611) {
					this.anInt1955 = local611;
				}
				if (this.anInt1955 < local613) {
					this.anInt1955 = local613;
				}
				if (local615 > this.anInt1955) {
					this.anInt1955 = local615;
				}
			}
			if (local625 == 2) {
				local613 = local615;
				local615 = (short) (local617 + local14.method5576());
				local617 = local615;
				this.aShortArray18[local619] = local611;
				this.aShortArray17[local619] = local613;
				this.aShortArray26[local619] = local615;
				if (this.anInt1955 < local615) {
					this.anInt1955 = local615;
				}
			}
			if (local625 == 3) {
				local611 = local615;
				local615 = (short) (local14.method5576() + local617);
				this.aShortArray18[local619] = local611;
				local617 = local615;
				this.aShortArray17[local619] = local613;
				this.aShortArray26[local619] = local615;
				if (this.anInt1955 < local615) {
					this.anInt1955 = local615;
				}
			}
			if (local625 == 4) {
				@Pc(798) short local798 = local611;
				local611 = local613;
				local613 = local798;
				local615 = (short) (local14.method5576() + local617);
				local617 = local615;
				this.aShortArray18[local619] = local611;
				this.aShortArray17[local619] = local798;
				this.aShortArray26[local619] = local615;
				if (local615 > this.anInt1955) {
					this.anInt1955 = local615;
				}
			}
		}
		local14.anInt7013 = local176;
		this.anInt1955++;
		for (local625 = 0; local625 < this.anInt1947; local625++) {
			this.aByteArray24[local625] = 0;
			this.aShortArray25[local625] = (short) local14.method5598();
			this.aShortArray23[local625] = (short) local14.method5598();
			this.aShortArray20[local625] = (short) local14.method5598();
		}
		if (this.aByteArray21 != null) {
			@Pc(894) boolean local894 = false;
			for (@Pc(896) int local896 = 0; local896 < this.anInt1949; local896++) {
				@Pc(905) int local905 = this.aByteArray21[local896] & 0xFF;
				if (local905 != 255) {
					if (this.aShortArray18[local896] == (this.aShortArray25[local905] & 0xFFFF) && (this.aShortArray23[local905] & 0xFFFF) == this.aShortArray17[local896] && this.aShortArray26[local896] == (this.aShortArray20[local905] & 0xFFFF)) {
						this.aByteArray21[local896] = -1;
					} else {
						local894 = true;
					}
				}
			}
			if (!local894) {
				this.aByteArray21 = null;
			}
		}
		if (!local7) {
			this.aByteArray25 = null;
		}
		if (!local9) {
			this.aShortArray22 = null;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(IIII)V")
	public void method1588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1943; local11++) {
			this.anIntArray96[local11] += arg2;
			this.anIntArray94[local11] += arg1;
			this.anIntArray99[local11] += arg0;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)[[I")
	public int[][] method1589() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1949; local12++) {
			@Pc(19) int local19 = this.anIntArray103[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt1949; local80++) {
			@Pc(87) int local87 = this.anIntArray103[local80];
			if (local87 >= 0) {
				local50[local87][local8[local87]++] = local80;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(SSB)V")
	public void method1590(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray22 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anInt1949; local19++) {
			if (arg0 == this.aShortArray22[local19]) {
				this.aShortArray22[local19] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)[[I")
	public int[][] method1591() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.aClass264Array1.length; local20++) {
			@Pc(28) int local28 = this.aClass264Array1[local20].anInt7368;
			if (local28 >= 0) {
				if (local28 > local18) {
					local18 = local28;
				}
				@Pc(46) int local46 = local8[local28]++;
			}
		}
		@Pc(64) int[][] local64 = new int[local18 + 1][];
		for (@Pc(66) int local66 = 0; local66 <= local18; local66++) {
			local64[local66] = new int[local8[local66]];
			local8[local66] = 0;
		}
		for (@Pc(85) int local85 = 0; local85 < this.aClass264Array1.length; local85++) {
			@Pc(93) int local93 = this.aClass264Array1[local85].anInt7368;
			if (local93 >= 0) {
				local64[local93][local8[local93]++] = local85;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BIIIBSISB)I")
	public int method1592(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) short arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray18[this.anInt1949] = (short) arg5;
		this.aShortArray17[this.anInt1949] = (short) arg1;
		this.aShortArray26[this.anInt1949] = (short) arg2;
		this.aByteArray25[this.anInt1949] = arg7;
		this.aByteArray21[this.anInt1949] = arg0;
		this.aShortArray24[this.anInt1949] = arg6;
		this.aByteArray20[this.anInt1949] = arg3;
		this.aShortArray22[this.anInt1949] = arg4;
		return this.anInt1949++;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(SSI)V")
	public void method1594(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1949; local11++) {
			if (this.aShortArray24[local11] == arg1) {
				this.aShortArray24[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public void method1596() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt1943; local11++) {
			this.anIntArray96[local11] <<= 0x0;
			this.anIntArray94[local11] <<= 0x0;
			this.anIntArray99[local11] <<= 0x0;
		}
		if (this.anInt1947 <= 0 || this.anIntArray101 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray101.length; local53++) {
			this.anIntArray101[local53] <<= 0x0;
			this.anIntArray102[local53] <<= 0x0;
			if (this.aByteArray24[local53] != 1) {
				this.anIntArray93[local53] <<= 0x0;
			}
		}
	}
}
