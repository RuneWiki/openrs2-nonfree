import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class32 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "[I")
	public int[] anIntArray62;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
	public int[] anIntArray63;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "[Lclient!pd;")
	public Class256[] aClass256Array1;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "[Lclient!nn;")
	public Class227[] aClass227Array1;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!bh", name = "V", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "[Lclient!eca;")
	public Class87[] aClass87Array1;

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
	public int anInt1677 = 12;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	public int anInt1679 = 0;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public int anInt1670 = 0;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "B")
	public byte aByte20 = 0;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
	public int anInt1673 = 0;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	public int anInt1671 = 0;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([B)V")
	public Class32(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1606(arg0);
		} else {
			this.method1603(arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(III)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray20 = new byte[arg1];
		this.aShortArray20 = new short[arg1];
		this.aShortArray19 = new short[arg1];
		this.anIntArray72 = new int[arg0];
		this.anIntArray63 = new int[arg1];
		this.anIntArray67 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray68 = new int[arg2];
			this.anIntArray71 = new int[arg2];
			this.aShortArray16 = new short[arg2];
			this.anIntArray65 = new int[arg2];
			this.aShortArray12 = new short[arg2];
			this.anIntArray70 = new int[arg2];
			this.aByteArray22 = new byte[arg2];
			this.anIntArray69 = new int[arg2];
			this.aShortArray13 = new short[arg2];
			this.aByteArray21 = new byte[arg2];
			this.anIntArray62 = new int[arg2];
			this.aByteArray26 = new byte[arg2];
		}
		this.aShortArray11 = new short[arg1];
		this.aByteArray24 = new byte[arg1];
		this.aShortArray17 = new short[arg1];
		this.aShortArray14 = new short[arg1];
		this.anIntArray64 = new int[arg0];
		this.aByteArray25 = new byte[arg1];
		this.anIntArray66 = new int[arg0];
		this.aByteArray23 = new byte[arg1];
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([Lclient!bh;I)V")
	public Class32(@OriginalArg(0) Class32[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1671 = 0;
		this.anInt1670 = 0;
		this.anInt1679 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte20 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class32 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt1670 += local59.anInt1670;
				this.anInt1679 += local59.anInt1679;
				this.anInt1671 += local59.anInt1671;
				local38 |= local59.aByteArray25 != null;
				if (local59.aClass256Array1 != null) {
					local36 += local59.aClass256Array1.length;
				}
				if (local59.aClass227Array1 != null) {
					local32 += local59.aClass227Array1.length;
				}
				if (local59.aClass87Array1 != null) {
					local34 += local59.aClass87Array1.length;
				}
				local46 |= local59.aShortArray11 != null;
				local44 |= local59.aByteArray20 != null;
				if (local59.aByteArray24 == null) {
					if (this.aByte20 == -1) {
						this.aByte20 = local59.aByte20;
					}
					if (local59.aByte20 != this.aByte20) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray23 != null;
				local51 |= local59.anIntArray63 != null;
			}
		}
		this.aShortArray14 = new short[this.anInt1670];
		if (this.anInt1671 > 0) {
			this.aShortArray13 = new short[this.anInt1671];
			this.aByteArray21 = new byte[this.anInt1671];
			this.anIntArray71 = new int[this.anInt1671];
			this.anIntArray65 = new int[this.anInt1671];
			this.aByteArray22 = new byte[this.anInt1671];
			this.anIntArray68 = new int[this.anInt1671];
			this.anIntArray70 = new int[this.anInt1671];
			this.anIntArray69 = new int[this.anInt1671];
			this.aByteArray26 = new byte[this.anInt1671];
			this.aShortArray16 = new short[this.anInt1671];
			this.anIntArray62 = new int[this.anInt1671];
			this.aShortArray12 = new short[this.anInt1671];
		}
		this.aShortArray18 = new short[this.anInt1670];
		if (local46) {
			this.aShortArray11 = new short[this.anInt1670];
		}
		this.aShortArray20 = new short[this.anInt1670];
		if (local51) {
			this.anIntArray63 = new int[this.anInt1670];
		}
		if (local40) {
			this.aByteArray24 = new byte[this.anInt1670];
		}
		if (local38) {
			this.aByteArray25 = new byte[this.anInt1670];
		}
		if (local36 > 0) {
			this.aClass256Array1 = new Class256[local36];
		}
		if (local34 > 0) {
			this.aClass87Array1 = new Class87[local34];
		}
		this.anIntArray72 = new int[this.anInt1679];
		if (local44) {
			this.aByteArray20 = new byte[this.anInt1670];
		}
		this.anIntArray67 = new int[this.anInt1679];
		this.aShortArray19 = new short[this.anInt1670];
		this.anIntArray64 = new int[this.anInt1679];
		this.anIntArray66 = new int[this.anInt1679];
		if (local32 > 0) {
			this.aClass227Array1 = new Class227[local32];
		}
		this.aShortArray17 = new short[this.anInt1670];
		if (local42) {
			this.aByteArray23 = new byte[this.anInt1670];
		}
		this.aShortArray15 = new short[this.anInt1679];
		this.anInt1671 = 0;
		local34 = 0;
		local36 = 0;
		local32 = 0;
		this.anInt1670 = 0;
		this.anInt1679 = 0;
		@Pc(616) int local616;
		@Pc(627) int local627;
		for (@Pc(383) int local383 = 0; local383 < arg1; local383++) {
			@Pc(390) short local390 = (short) (0x1 << local383);
			@Pc(394) Class32 local394 = arg0[local383];
			if (local394 != null) {
				@Pc(401) int local401;
				if (local394.aClass256Array1 != null) {
					for (local401 = 0; local401 < local394.aClass256Array1.length; local401++) {
						@Pc(408) Class256 local408 = local394.aClass256Array1[local401];
						this.aClass256Array1[local36++] = local408.method6761(local408.anInt7920 + this.anInt1670);
					}
				}
				for (local401 = 0; local401 < local394.anInt1670; local401++) {
					if (local38 && local394.aByteArray25 != null) {
						this.aByteArray25[this.anInt1670] = local394.aByteArray25[local401];
					}
					if (local40) {
						if (local394.aByteArray24 == null) {
							this.aByteArray24[this.anInt1670] = local394.aByte20;
						} else {
							this.aByteArray24[this.anInt1670] = local394.aByteArray24[local401];
						}
					}
					if (local42 && local394.aByteArray23 != null) {
						this.aByteArray23[this.anInt1670] = local394.aByteArray23[local401];
					}
					if (local46) {
						if (local394.aShortArray11 == null) {
							this.aShortArray11[this.anInt1670] = -1;
						} else {
							this.aShortArray11[this.anInt1670] = local394.aShortArray11[local401];
						}
					}
					if (local51) {
						if (local394.anIntArray63 == null) {
							this.anIntArray63[this.anInt1670] = -1;
						} else {
							this.anIntArray63[this.anInt1670] = local394.anIntArray63[local401];
						}
					}
					this.aShortArray20[this.anInt1670] = (short) this.method1604(local394, local394.aShortArray20[local401], local390);
					this.aShortArray14[this.anInt1670] = (short) this.method1604(local394, local394.aShortArray14[local401], local390);
					this.aShortArray17[this.anInt1670] = (short) this.method1604(local394, local394.aShortArray17[local401], local390);
					this.aShortArray18[this.anInt1670] = local390;
					this.aShortArray19[this.anInt1670] = local394.aShortArray19[local401];
					this.anInt1670++;
				}
				@Pc(603) int local603;
				if (local394.aClass227Array1 != null) {
					for (local603 = 0; local603 < local394.aClass227Array1.length; local603++) {
						local616 = this.method1604(local394, local394.aClass227Array1[local603].anInt7393, local390);
						local627 = this.method1604(local394, local394.aClass227Array1[local603].anInt7390, local390);
						@Pc(638) int local638 = this.method1604(local394, local394.aClass227Array1[local603].anInt7401, local390);
						this.aClass227Array1[local32] = local394.aClass227Array1[local603].method6273(local627, local638, local616);
						local32++;
					}
				}
				if (local394.aClass87Array1 != null) {
					for (local603 = 0; local603 < local394.aClass87Array1.length; local603++) {
						local616 = this.method1604(local394, local394.aClass87Array1[local603].anInt3139, local390);
						this.aClass87Array1[local34] = local394.aClass87Array1[local603].method2911(local616);
						local34++;
					}
				}
			}
		}
		@Pc(708) int local708 = 0;
		this.anInt1673 = this.anInt1679;
		for (@Pc(714) int local714 = 0; local714 < arg1; local714++) {
			@Pc(721) short local721 = (short) (0x1 << local714);
			@Pc(725) Class32 local725 = arg0[local714];
			if (local725 != null) {
				for (local616 = 0; local616 < local725.anInt1670; local616++) {
					if (local44) {
						this.aByteArray20[local708++] = (byte) (local725.aByteArray20 == null || local725.aByteArray20[local616] == -1 ? -1 : local725.aByteArray20[local616] + this.anInt1671);
					}
				}
				for (local627 = 0; local627 < local725.anInt1671; local627++) {
					@Pc(778) byte local778 = this.aByteArray21[this.anInt1671] = local725.aByteArray21[local627];
					if (local778 == 0) {
						this.aShortArray13[this.anInt1671] = (short) this.method1604(local725, local725.aShortArray13[local627], local721);
						this.aShortArray16[this.anInt1671] = (short) this.method1604(local725, local725.aShortArray16[local627], local721);
						this.aShortArray12[this.anInt1671] = (short) this.method1604(local725, local725.aShortArray12[local627], local721);
					}
					if (local778 >= 1 && local778 <= 3) {
						this.aShortArray13[this.anInt1671] = local725.aShortArray13[local627];
						this.aShortArray16[this.anInt1671] = local725.aShortArray16[local627];
						this.aShortArray12[this.anInt1671] = local725.aShortArray12[local627];
						this.anIntArray69[this.anInt1671] = local725.anIntArray69[local627];
						this.anIntArray62[this.anInt1671] = local725.anIntArray62[local627];
						this.anIntArray65[this.anInt1671] = local725.anIntArray65[local627];
						this.aByteArray22[this.anInt1671] = local725.aByteArray22[local627];
						this.aByteArray26[this.anInt1671] = local725.aByteArray26[local627];
						this.anIntArray71[this.anInt1671] = local725.anIntArray71[local627];
					}
					if (local778 == 2) {
						this.anIntArray68[this.anInt1671] = local725.anIntArray68[local627];
						this.anIntArray70[this.anInt1671] = local725.anIntArray70[local627];
					}
					this.anInt1671++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public void method1592() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1679; local7++) {
			this.anIntArray64[local7] <<= 0x2;
			this.anIntArray66[local7] <<= 0x2;
			this.anIntArray67[local7] <<= 0x2;
		}
		if (this.anInt1671 <= 0 || this.anIntArray69 == null) {
			return;
		}
		for (@Pc(58) int local58 = 0; local58 < this.anIntArray69.length; local58++) {
			this.anIntArray69[local58] <<= 0x2;
			this.anIntArray62[local58] <<= 0x2;
			if (this.aByteArray21[local58] != 1) {
				this.anIntArray65[local58] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)[[I")
	public int[][] method1593() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass256Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass256Array1[local12].anInt7921;
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
		for (@Pc(75) int local75 = 0; local75 < this.aClass256Array1.length; local75++) {
			@Pc(83) int local83 = this.aClass256Array1[local75].anInt7921;
			if (local83 >= 0) {
				local45[local83][local8[local83]++] = local75;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)[[I")
	public int[][] method1594() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1670; local12++) {
			@Pc(19) int local19 = this.anIntArray63[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(33) int local33 = local8[local19]++;
			}
		}
		@Pc(46) int[][] local46 = new int[local10 + 1][];
		for (@Pc(63) int local63 = 0; local63 <= local10; local63++) {
			local46[local63] = new int[local8[local63]];
			local8[local63] = 0;
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt1670; local86++) {
			@Pc(93) int local93 = this.anIntArray63[local86];
			if (local93 >= 0) {
				local46[local93][local8[local93]++] = local86;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(SIS)V")
	public void method1595(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray11 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt1670; local11++) {
			if (arg0 == this.aShortArray11[local11]) {
				this.aShortArray11[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(SBS)V")
	public void method1598(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1670; local7++) {
			if (this.aShortArray19[local7] == arg0) {
				this.aShortArray19[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIII)V")
	public void method1599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1679; local3++) {
			this.anIntArray64[local3] += arg1;
			this.anIntArray66[local3] += arg2;
			this.anIntArray67[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)[[I")
	public int[][] method1600(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt1679 : this.anInt1673;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray72[local20];
			if (local27 >= 0) {
				@Pc(36) int local36 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(53) int[][] local53 = new int[local10 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local10; local55++) {
			local53[local55] = new int[local8[local55]];
			local8[local55] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < local18; local78++) {
			@Pc(85) int local85 = this.anIntArray72[local78];
			if (local85 >= 0) {
				local53[local85][local8[local85]++] = local78;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)I")
	public int method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1679; local7++) {
			if (this.anIntArray64[local7] == arg2 && arg0 == this.anIntArray66[local7] && this.anIntArray67[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray64[this.anInt1679] = arg2;
		this.anIntArray66[this.anInt1679] = arg0;
		this.anIntArray67[this.anInt1679] = arg1;
		this.anInt1673 = this.anInt1679 + 1;
		return this.anInt1679++;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBBSBSIBI)I")
	public int method1602(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3, @OriginalArg(5) short arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray20[this.anInt1670] = (short) arg0;
		this.aShortArray14[this.anInt1670] = (short) arg5;
		this.aShortArray17[this.anInt1670] = (short) arg7;
		this.aByteArray25[this.anInt1670] = arg1;
		this.aByteArray20[this.anInt1670] = arg2;
		this.aShortArray19[this.anInt1670] = arg4;
		this.aByteArray23[this.anInt1670] = arg6;
		this.aShortArray11[this.anInt1670] = arg3;
		return this.anInt1670++;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[B)V")
	private void method1603(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub11 local14 = new Class2_Sub11(arg0);
		@Pc(19) Class2_Sub11 local19 = new Class2_Sub11(arg0);
		@Pc(24) Class2_Sub11 local24 = new Class2_Sub11(arg0);
		@Pc(29) Class2_Sub11 local29 = new Class2_Sub11(arg0);
		@Pc(34) Class2_Sub11 local34 = new Class2_Sub11(arg0);
		local14.anInt10066 = arg0.length - 18;
		this.anInt1679 = local14.method8326();
		this.anInt1670 = local14.method8326();
		this.anInt1671 = local14.method8383();
		@Pc(61) int local61 = local14.method8383();
		@Pc(65) int local65 = local14.method8383();
		@Pc(69) int local69 = local14.method8383();
		@Pc(73) int local73 = local14.method8383();
		@Pc(77) int local77 = local14.method8383();
		@Pc(81) int local81 = local14.method8326();
		@Pc(85) int local85 = local14.method8326();
		@Pc(89) int local89 = local14.method8326();
		@Pc(93) int local93 = local14.method8326();
		@Pc(102) int local102 = this.anInt1679;
		@Pc(104) int local104 = local102;
		local102 += this.anInt1670;
		@Pc(111) int local111 = local102;
		if (local65 == 255) {
			local102 += this.anInt1670;
		}
		@Pc(123) int local123 = local102;
		if (local73 == 1) {
			local102 += this.anInt1670;
		}
		@Pc(135) int local135 = local102;
		if (local61 == 1) {
			local102 += this.anInt1670;
		}
		@Pc(145) int local145 = local102;
		if (local77 == 1) {
			local102 += this.anInt1679;
		}
		@Pc(155) int local155 = local102;
		if (local69 == 1) {
			local102 += this.anInt1670;
		}
		@Pc(165) int local165 = local102;
		local102 += local93;
		@Pc(171) int local171 = local102;
		local102 += this.anInt1670 * 2;
		@Pc(180) int local180 = local102;
		local102 += this.anInt1671 * 6;
		@Pc(189) int local189 = local102;
		local102 += local81;
		@Pc(195) int local195 = local102;
		local102 += local85;
		this.aShortArray19 = new short[this.anInt1670];
		if (local65 == 255) {
			this.aByteArray24 = new byte[this.anInt1670];
		} else {
			this.aByte20 = (byte) local65;
		}
		if (local77 == 1) {
			this.anIntArray72 = new int[this.anInt1679];
		}
		if (local69 == 1) {
			this.aByteArray23 = new byte[this.anInt1670];
		}
		this.aShortArray20 = new short[this.anInt1670];
		if (local61 == 1) {
			this.aShortArray11 = new short[this.anInt1670];
			this.aByteArray20 = new byte[this.anInt1670];
			this.aByteArray25 = new byte[this.anInt1670];
		}
		this.anIntArray66 = new int[this.anInt1679];
		if (local73 == 1) {
			this.anIntArray63 = new int[this.anInt1670];
		}
		this.aShortArray17 = new short[this.anInt1670];
		if (this.anInt1671 > 0) {
			this.aByteArray21 = new byte[this.anInt1671];
			this.aShortArray13 = new short[this.anInt1671];
			this.aShortArray16 = new short[this.anInt1671];
			this.aShortArray12 = new short[this.anInt1671];
		}
		this.aShortArray14 = new short[this.anInt1670];
		this.anIntArray67 = new int[this.anInt1679];
		this.anIntArray64 = new int[this.anInt1679];
		local14.anInt10066 = 0;
		local19.anInt10066 = local189;
		local24.anInt10066 = local195;
		local29.anInt10066 = local102;
		local34.anInt10066 = local145;
		@Pc(342) int local342 = 0;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(354) int local354;
		@Pc(356) int local356;
		for (@Pc(348) int local348 = 0; local348 < this.anInt1679; local348++) {
			local354 = local14.method8383();
			local356 = 0;
			if ((local354 & 0x1) != 0) {
				local356 = local19.method8358();
			}
			@Pc(366) int local366 = 0;
			if ((local354 & 0x2) != 0) {
				local366 = local24.method8358();
			}
			@Pc(379) int local379 = 0;
			if ((local354 & 0x4) != 0) {
				local379 = local29.method8358();
			}
			this.anIntArray64[local348] = local356 + local342;
			this.anIntArray66[local348] = local344 + local366;
			this.anIntArray67[local348] = local346 + local379;
			local346 = this.anIntArray67[local348];
			local344 = this.anIntArray66[local348];
			local342 = this.anIntArray64[local348];
			if (local77 == 1) {
				this.anIntArray72[local348] = local34.method8383();
			}
		}
		local14.anInt10066 = local171;
		local19.anInt10066 = local135;
		local24.anInt10066 = local111;
		local29.anInt10066 = local155;
		local34.anInt10066 = local123;
		for (local354 = 0; local354 < this.anInt1670; local354++) {
			this.aShortArray19[local354] = (short) local14.method8326();
			if (local61 == 1) {
				local356 = local19.method8383();
				if ((local356 & 0x1) == 1) {
					this.aByteArray25[local354] = 1;
					local7 = true;
				} else {
					this.aByteArray25[local354] = 0;
				}
				if ((local356 & 0x2) == 2) {
					this.aByteArray20[local354] = (byte) (local356 >> 2);
					this.aShortArray11[local354] = this.aShortArray19[local354];
					this.aShortArray19[local354] = 127;
					if (this.aShortArray11[local354] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray20[local354] = -1;
					this.aShortArray11[local354] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray24[local354] = local24.method8384();
			}
			if (local69 == 1) {
				this.aByteArray23[local354] = local29.method8384();
			}
			if (local73 == 1) {
				this.anIntArray63[local354] = local34.method8383();
			}
		}
		local14.anInt10066 = local165;
		this.anInt1673 = -1;
		local19.anInt10066 = local104;
		@Pc(595) short local595 = 0;
		@Pc(597) short local597 = 0;
		@Pc(599) short local599 = 0;
		@Pc(601) short local601 = 0;
		@Pc(609) int local609;
		for (@Pc(603) int local603 = 0; local603 < this.anInt1670; local603++) {
			local609 = local19.method8383();
			if (local609 == 1) {
				local595 = (short) (local601 + local14.method8358());
				local597 = (short) (local14.method8358() + local595);
				local599 = (short) (local597 + local14.method8358());
				this.aShortArray20[local603] = local595;
				local601 = local599;
				this.aShortArray14[local603] = local597;
				this.aShortArray17[local603] = local599;
				if (this.anInt1673 < local595) {
					this.anInt1673 = local595;
				}
				if (local597 > this.anInt1673) {
					this.anInt1673 = local597;
				}
				if (local599 > this.anInt1673) {
					this.anInt1673 = local599;
				}
			}
			if (local609 == 2) {
				local597 = local599;
				local599 = (short) (local14.method8358() + local601);
				this.aShortArray20[local603] = local595;
				local601 = local599;
				this.aShortArray14[local603] = local597;
				this.aShortArray17[local603] = local599;
				if (local599 > this.anInt1673) {
					this.anInt1673 = local599;
				}
			}
			if (local609 == 3) {
				local595 = local599;
				local599 = (short) (local14.method8358() + local601);
				local601 = local599;
				this.aShortArray20[local603] = local595;
				this.aShortArray14[local603] = local597;
				this.aShortArray17[local603] = local599;
				if (this.anInt1673 < local599) {
					this.anInt1673 = local599;
				}
			}
			if (local609 == 4) {
				@Pc(768) short local768 = local595;
				local595 = local597;
				local599 = (short) (local14.method8358() + local601);
				local597 = local768;
				local601 = local599;
				this.aShortArray20[local603] = local595;
				this.aShortArray14[local603] = local768;
				this.aShortArray17[local603] = local599;
				if (this.anInt1673 < local599) {
					this.anInt1673 = local599;
				}
			}
		}
		this.anInt1673++;
		local14.anInt10066 = local180;
		for (local609 = 0; local609 < this.anInt1671; local609++) {
			this.aByteArray21[local609] = 0;
			this.aShortArray13[local609] = (short) local14.method8326();
			this.aShortArray16[local609] = (short) local14.method8326();
			this.aShortArray12[local609] = (short) local14.method8326();
		}
		if (this.aByteArray20 != null) {
			@Pc(868) boolean local868 = false;
			for (@Pc(870) int local870 = 0; local870 < this.anInt1670; local870++) {
				@Pc(879) int local879 = this.aByteArray20[local870] & 0xFF;
				if (local879 != 255) {
					if ((this.aShortArray13[local879] & 0xFFFF) == this.aShortArray20[local870] && this.aShortArray14[local870] == (this.aShortArray16[local879] & 0xFFFF) && (this.aShortArray12[local879] & 0xFFFF) == this.aShortArray17[local870]) {
						this.aByteArray20[local870] = -1;
					} else {
						local868 = true;
					}
				}
			}
			if (!local868) {
				this.aByteArray20 = null;
			}
		}
		if (!local7) {
			this.aByteArray25 = null;
		}
		if (!local9) {
			this.aShortArray11 = null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!bh;IIS)I")
	private int method1604(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg0.anIntArray64[arg1];
		@Pc(15) int local15 = arg0.anIntArray66[arg1];
		@Pc(20) int local20 = arg0.anIntArray67[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1679; local22++) {
			if (this.anIntArray64[local22] == local10 && local15 == this.anIntArray66[local22] && this.anIntArray67[local22] == local20) {
				this.aShortArray15[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray64[this.anInt1679] = local10;
		this.anIntArray66[this.anInt1679] = local15;
		this.anIntArray67[this.anInt1679] = local20;
		this.aShortArray15[this.anInt1679] = arg2;
		this.anIntArray72[this.anInt1679] = arg0.anIntArray72 == null ? -1 : arg0.anIntArray72[arg1];
		return this.anInt1679++;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBBSSBSSSS)B")
	public byte method1605() {
		if (this.anInt1671 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray21[this.anInt1671] = 3;
		this.aShortArray13[this.anInt1671] = 0;
		this.aShortArray16[this.anInt1671] = 32767;
		this.aShortArray12[this.anInt1671] = 0;
		this.anIntArray69[this.anInt1671] = 1024;
		this.anIntArray62[this.anInt1671] = 1024;
		this.anIntArray65[this.anInt1671] = 1024;
		this.aByteArray22[this.anInt1671] = 0;
		this.aByteArray26[this.anInt1671] = 0;
		this.anIntArray71[this.anInt1671] = 0;
		return (byte) this.anInt1671++;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([BB)V")
	private void method1606(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub11 local10 = new Class2_Sub11(arg0);
		@Pc(15) Class2_Sub11 local15 = new Class2_Sub11(arg0);
		@Pc(20) Class2_Sub11 local20 = new Class2_Sub11(arg0);
		@Pc(25) Class2_Sub11 local25 = new Class2_Sub11(arg0);
		@Pc(30) Class2_Sub11 local30 = new Class2_Sub11(arg0);
		@Pc(35) Class2_Sub11 local35 = new Class2_Sub11(arg0);
		@Pc(40) Class2_Sub11 local40 = new Class2_Sub11(arg0);
		local10.anInt10066 = arg0.length - 23;
		this.anInt1679 = local10.method8326();
		this.anInt1670 = local10.method8326();
		this.anInt1671 = local10.method8383();
		@Pc(65) int local65 = local10.method8383();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt10066 -= 7;
			this.anInt1677 = local10.method8383();
			local10.anInt10066 += 6;
		}
		@Pc(128) int local128 = local10.method8383();
		@Pc(132) int local132 = local10.method8383();
		@Pc(136) int local136 = local10.method8383();
		@Pc(140) int local140 = local10.method8383();
		@Pc(144) int local144 = local10.method8383();
		@Pc(148) int local148 = local10.method8326();
		@Pc(152) int local152 = local10.method8326();
		@Pc(156) int local156 = local10.method8326();
		@Pc(160) int local160 = local10.method8326();
		@Pc(164) int local164 = local10.method8326();
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(186) int local186;
		if (this.anInt1671 > 0) {
			local10.anInt10066 = 0;
			this.aByteArray21 = new byte[this.anInt1671];
			for (local186 = 0; local186 < this.anInt1671; local186++) {
				@Pc(197) byte local197 = this.aByteArray21[local186] = local10.method8384();
				if (local197 >= 1 && local197 <= 3) {
					local168++;
				}
				if (local197 == 2) {
					local170++;
				}
				if (local197 == 0) {
					local166++;
				}
			}
		}
		local186 = this.anInt1671;
		@Pc(227) int local227 = local186;
		local186 += this.anInt1679;
		@Pc(234) int local234 = local186;
		if (local76) {
			local186 += this.anInt1670;
		}
		@Pc(243) int local243 = local186;
		local186 += this.anInt1670;
		@Pc(250) int local250 = local186;
		if (local128 == 255) {
			local186 += this.anInt1670;
		}
		@Pc(262) int local262 = local186;
		if (local136 == 1) {
			local186 += this.anInt1670;
		}
		@Pc(274) int local274 = local186;
		if (local144 == 1) {
			local186 += this.anInt1679;
		}
		@Pc(284) int local284 = local186;
		if (local132 == 1) {
			local186 += this.anInt1670;
		}
		@Pc(300) int local300 = local186;
		local186 += local160;
		@Pc(306) int local306 = local186;
		if (local140 == 1) {
			local186 += this.anInt1670 * 2;
		}
		@Pc(318) int local318 = local186;
		local186 += local164;
		@Pc(324) int local324 = local186;
		local186 += this.anInt1670 * 2;
		@Pc(333) int local333 = local186;
		local186 += local148;
		@Pc(339) int local339 = local186;
		local186 += local152;
		@Pc(345) int local345 = local186;
		local186 += local156;
		@Pc(351) int local351 = local186;
		local186 += local166 * 6;
		@Pc(359) int local359 = local186;
		local186 += local168 * 6;
		@Pc(367) byte local367 = 6;
		if (this.anInt1677 == 14) {
			local367 = 7;
		} else if (this.anInt1677 >= 15) {
			local367 = 9;
		}
		@Pc(383) int local383 = local186;
		local186 += local367 * local168;
		@Pc(391) int local391 = local186;
		local186 += local168;
		@Pc(397) int local397 = local186;
		local186 += local168;
		@Pc(403) int local403 = local186;
		local186 += local170 * 2 + local168;
		this.aShortArray14 = new short[this.anInt1670];
		this.aShortArray19 = new short[this.anInt1670];
		if (local136 == 1) {
			this.anIntArray63 = new int[this.anInt1670];
		}
		if (this.anInt1671 > 0) {
			if (local170 > 0) {
				this.anIntArray68 = new int[local170];
				this.anIntArray70 = new int[local170];
			}
			this.aShortArray16 = new short[this.anInt1671];
			this.aShortArray13 = new short[this.anInt1671];
			if (local168 > 0) {
				this.anIntArray71 = new int[local168];
				this.aByteArray26 = new byte[local168];
				this.anIntArray62 = new int[local168];
				this.aByteArray22 = new byte[local168];
				this.anIntArray65 = new int[local168];
				this.anIntArray69 = new int[local168];
			}
			this.aShortArray12 = new short[this.anInt1671];
		}
		if (local76) {
			this.aByteArray25 = new byte[this.anInt1670];
		}
		if (local132 == 1) {
			this.aByteArray23 = new byte[this.anInt1670];
		}
		if (local128 == 255) {
			this.aByteArray24 = new byte[this.anInt1670];
		} else {
			this.aByte20 = (byte) local128;
		}
		this.aShortArray17 = new short[this.anInt1670];
		this.anIntArray66 = new int[this.anInt1679];
		this.aShortArray20 = new short[this.anInt1670];
		if (local140 == 1 && this.anInt1671 > 0) {
			this.aByteArray20 = new byte[this.anInt1670];
		}
		this.anIntArray67 = new int[this.anInt1679];
		this.anIntArray64 = new int[this.anInt1679];
		if (local144 == 1) {
			this.anIntArray72 = new int[this.anInt1679];
		}
		local10.anInt10066 = local227;
		if (local140 == 1) {
			this.aShortArray11 = new short[this.anInt1670];
		}
		local15.anInt10066 = local333;
		local20.anInt10066 = local339;
		local25.anInt10066 = local345;
		local30.anInt10066 = local274;
		@Pc(601) int local601 = 0;
		@Pc(603) int local603 = 0;
		@Pc(605) int local605 = 0;
		@Pc(613) int local613;
		for (@Pc(607) int local607 = 0; local607 < this.anInt1679; local607++) {
			local613 = local10.method8383();
			@Pc(615) int local615 = 0;
			if ((local613 & 0x1) != 0) {
				local615 = local15.method8358();
			}
			@Pc(628) int local628 = 0;
			if ((local613 & 0x2) != 0) {
				local628 = local20.method8358();
			}
			@Pc(641) int local641 = 0;
			if ((local613 & 0x4) != 0) {
				local641 = local25.method8358();
			}
			this.anIntArray64[local607] = local615 + local601;
			this.anIntArray66[local607] = local628 + local603;
			this.anIntArray67[local607] = local605 + local641;
			local603 = this.anIntArray66[local607];
			local601 = this.anIntArray64[local607];
			local605 = this.anIntArray67[local607];
			if (local144 == 1) {
				this.anIntArray72[local607] = local30.method8383();
			}
		}
		local10.anInt10066 = local324;
		local15.anInt10066 = local234;
		local20.anInt10066 = local250;
		local25.anInt10066 = local284;
		local30.anInt10066 = local262;
		local35.anInt10066 = local306;
		local40.anInt10066 = local318;
		for (local613 = 0; local613 < this.anInt1670; local613++) {
			this.aShortArray19[local613] = (short) local10.method8326();
			if (local76) {
				this.aByteArray25[local613] = local15.method8384();
			}
			if (local128 == 255) {
				this.aByteArray24[local613] = local20.method8384();
			}
			if (local132 == 1) {
				this.aByteArray23[local613] = local25.method8384();
			}
			if (local136 == 1) {
				this.anIntArray63[local613] = local30.method8383();
			}
			if (local140 == 1) {
				this.aShortArray11[local613] = (short) (local35.method8326() - 1);
			}
			if (this.aByteArray20 != null) {
				if (this.aShortArray11[local613] == -1) {
					this.aByteArray20[local613] = -1;
				} else {
					this.aByteArray20[local613] = (byte) (local40.method8383() - 1);
				}
			}
		}
		local10.anInt10066 = local300;
		this.anInt1673 = -1;
		local15.anInt10066 = local243;
		@Pc(838) short local838 = 0;
		@Pc(840) short local840 = 0;
		@Pc(842) short local842 = 0;
		@Pc(844) short local844 = 0;
		@Pc(852) int local852;
		for (@Pc(846) int local846 = 0; local846 < this.anInt1670; local846++) {
			local852 = local15.method8383();
			if (local852 == 1) {
				local838 = (short) (local10.method8358() + local844);
				local840 = (short) (local10.method8358() + local838);
				local842 = (short) (local840 + local10.method8358());
				local844 = local842;
				this.aShortArray20[local846] = local838;
				this.aShortArray14[local846] = local840;
				this.aShortArray17[local846] = local842;
				if (this.anInt1673 < local838) {
					this.anInt1673 = local838;
				}
				if (this.anInt1673 < local840) {
					this.anInt1673 = local840;
				}
				if (local842 > this.anInt1673) {
					this.anInt1673 = local842;
				}
			}
			if (local852 == 2) {
				local840 = local842;
				local842 = (short) (local10.method8358() + local844);
				this.aShortArray20[local846] = local838;
				local844 = local842;
				this.aShortArray14[local846] = local840;
				this.aShortArray17[local846] = local842;
				if (this.anInt1673 < local842) {
					this.anInt1673 = local842;
				}
			}
			if (local852 == 3) {
				local838 = local842;
				local842 = (short) (local10.method8358() + local844);
				local844 = local842;
				this.aShortArray20[local846] = local838;
				this.aShortArray14[local846] = local840;
				this.aShortArray17[local846] = local842;
				if (this.anInt1673 < local842) {
					this.anInt1673 = local842;
				}
			}
			if (local852 == 4) {
				@Pc(1003) short local1003 = local838;
				local838 = local840;
				local842 = (short) (local844 + local10.method8358());
				local840 = local1003;
				this.aShortArray20[local846] = local838;
				local844 = local842;
				this.aShortArray14[local846] = local1003;
				this.aShortArray17[local846] = local842;
				if (this.anInt1673 < local842) {
					this.anInt1673 = local842;
				}
			}
		}
		local10.anInt10066 = local351;
		this.anInt1673++;
		local15.anInt10066 = local359;
		local20.anInt10066 = local383;
		local25.anInt10066 = local391;
		local30.anInt10066 = local397;
		local35.anInt10066 = local403;
		@Pc(1082) int local1082;
		for (local852 = 0; local852 < this.anInt1671; local852++) {
			local1082 = this.aByteArray21[local852] & 0xFF;
			if (local1082 == 0) {
				this.aShortArray13[local852] = (short) local10.method8326();
				this.aShortArray16[local852] = (short) local10.method8326();
				this.aShortArray12[local852] = (short) local10.method8326();
			}
			if (local1082 == 1) {
				this.aShortArray13[local852] = (short) local15.method8326();
				this.aShortArray16[local852] = (short) local15.method8326();
				this.aShortArray12[local852] = (short) local15.method8326();
				if (this.anInt1677 >= 15) {
					this.anIntArray69[local852] = local20.method8347();
					this.anIntArray62[local852] = local20.method8347();
					this.anIntArray65[local852] = local20.method8347();
				} else {
					this.anIntArray69[local852] = local20.method8326();
					if (this.anInt1677 >= 14) {
						this.anIntArray62[local852] = local20.method8347();
					} else {
						this.anIntArray62[local852] = local20.method8326();
					}
					this.anIntArray65[local852] = local20.method8326();
				}
				this.aByteArray22[local852] = local25.method8384();
				this.aByteArray26[local852] = local30.method8384();
				this.anIntArray71[local852] = local35.method8384();
			}
			if (local1082 == 2) {
				this.aShortArray13[local852] = (short) local15.method8326();
				this.aShortArray16[local852] = (short) local15.method8326();
				this.aShortArray12[local852] = (short) local15.method8326();
				if (this.anInt1677 >= 15) {
					this.anIntArray69[local852] = local20.method8347();
					this.anIntArray62[local852] = local20.method8347();
					this.anIntArray65[local852] = local20.method8347();
				} else {
					this.anIntArray69[local852] = local20.method8326();
					if (this.anInt1677 < 14) {
						this.anIntArray62[local852] = local20.method8326();
					} else {
						this.anIntArray62[local852] = local20.method8347();
					}
					this.anIntArray65[local852] = local20.method8326();
				}
				this.aByteArray22[local852] = local25.method8384();
				this.aByteArray26[local852] = local30.method8384();
				this.anIntArray71[local852] = local35.method8384();
				this.anIntArray68[local852] = local35.method8384();
				this.anIntArray70[local852] = local35.method8384();
			}
			if (local1082 == 3) {
				this.aShortArray13[local852] = (short) local15.method8326();
				this.aShortArray16[local852] = (short) local15.method8326();
				this.aShortArray12[local852] = (short) local15.method8326();
				if (this.anInt1677 < 15) {
					this.anIntArray69[local852] = local20.method8326();
					if (this.anInt1677 < 14) {
						this.anIntArray62[local852] = local20.method8326();
					} else {
						this.anIntArray62[local852] = local20.method8347();
					}
					this.anIntArray65[local852] = local20.method8326();
				} else {
					this.anIntArray69[local852] = local20.method8347();
					this.anIntArray62[local852] = local20.method8347();
					this.anIntArray65[local852] = local20.method8347();
				}
				this.aByteArray22[local852] = local25.method8384();
				this.aByteArray26[local852] = local30.method8384();
				this.anIntArray71[local852] = local35.method8384();
			}
		}
		local10.anInt10066 = local186;
		@Pc(1486) int local1486;
		@Pc(1492) int local1492;
		@Pc(1496) int local1496;
		@Pc(1561) int local1561;
		if (local85) {
			local1082 = local10.method8383();
			if (local1082 > 0) {
				this.aClass227Array1 = new Class227[local1082];
				for (local1486 = 0; local1486 < local1082; local1486++) {
					local1492 = local10.method8326();
					local1496 = local10.method8326();
					@Pc(1504) byte local1504;
					if (local128 == 255) {
						local1504 = this.aByteArray24[local1496];
					} else {
						local1504 = (byte) local128;
					}
					this.aClass227Array1[local1486] = new Class227(local1492, this.aShortArray20[local1496], this.aShortArray14[local1496], this.aShortArray17[local1496], local1504);
				}
			}
			local1486 = local10.method8383();
			if (local1486 > 0) {
				this.aClass87Array1 = new Class87[local1486];
				for (local1492 = 0; local1492 < local1486; local1492++) {
					local1496 = local10.method8326();
					local1561 = local10.method8326();
					this.aClass87Array1[local1492] = new Class87(local1496, local1561);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1082 = local10.method8383();
		if (local1082 <= 0) {
			return;
		}
		this.aClass256Array1 = new Class256[local1082];
		for (local1486 = 0; local1486 < local1082; local1486++) {
			local1492 = local10.method8326();
			local1496 = local10.method8326();
			local1561 = local10.method8383();
			@Pc(1609) byte local1609 = local10.method8384();
			this.aClass256Array1[local1486] = new Class256(local1492, local1496, local1561, local1609);
		}
		return;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIII)V")
	public void method1607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg1 != 0) {
			local10 = Class177.anIntArray361[arg1];
			local14 = Class177.anIntArray360[arg1];
			for (local16 = 0; local16 < this.anInt1679; local16++) {
				local34 = local14 * this.anIntArray64[local16] + this.anIntArray66[local16] * local10 >> 14;
				this.anIntArray66[local16] = this.anIntArray66[local16] * local14 - this.anIntArray64[local16] * local10 >> 14;
				this.anIntArray64[local16] = local34;
			}
		}
		if (arg2 != 0) {
			local10 = Class177.anIntArray361[arg2];
			local14 = Class177.anIntArray360[arg2];
			for (local16 = 0; local16 < this.anInt1679; local16++) {
				local34 = this.anIntArray66[local16] * local14 - local10 * this.anIntArray67[local16] >> 14;
				this.anIntArray67[local16] = this.anIntArray66[local16] * local10 + local14 * this.anIntArray67[local16] >> 14;
				this.anIntArray66[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class177.anIntArray361[arg0];
		local14 = Class177.anIntArray360[arg0];
		for (local16 = 0; local16 < this.anInt1679; local16++) {
			local34 = local14 * this.anIntArray64[local16] + this.anIntArray67[local16] * local10 >> 14;
			this.anIntArray67[local16] = local14 * this.anIntArray67[local16] - this.anIntArray64[local16] * local10 >> 14;
			this.anIntArray64[local16] = local34;
		}
	}
}
