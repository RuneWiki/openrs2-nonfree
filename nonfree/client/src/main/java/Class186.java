import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class186 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "[Lclient!oo;")
	public Class255[] aClass255Array2;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "[Lclient!hr;")
	public Class143[] aClass143Array2;

	@OriginalMember(owner = "client!kda", name = "l", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!kda", name = "m", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!kda", name = "n", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!kda", name = "o", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!kda", name = "p", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!kda", name = "q", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!kda", name = "r", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!kda", name = "s", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!kda", name = "u", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!kda", name = "v", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!kda", name = "z", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!kda", name = "D", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!kda", name = "F", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!kda", name = "G", descriptor = "[Lclient!of;")
	public Class245[] aClass245Array1;

	@OriginalMember(owner = "client!kda", name = "H", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!kda", name = "K", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!kda", name = "L", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!kda", name = "N", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!kda", name = "O", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!kda", name = "Q", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!kda", name = "V", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!kda", name = "Y", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!kda", name = "Z", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!kda", name = "ab", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
	public int anInt4696 = 0;

	@OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
	public int anInt4698 = 0;

	@OriginalMember(owner = "client!kda", name = "J", descriptor = "B")
	public byte aByte73 = 0;

	@OriginalMember(owner = "client!kda", name = "A", descriptor = "I")
	public int anInt4702 = 12;

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
	public int anInt4695 = 0;

	@OriginalMember(owner = "client!kda", name = "B", descriptor = "I")
	public int anInt4703 = 0;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "()V")
	private Class186() {
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "([B)V")
	public Class186(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3994(arg0);
		} else {
			this.method3997(arg0);
		}
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(III)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray54 = new byte[arg1];
		this.aShortArray51 = new short[arg1];
		this.aShortArray50 = new short[arg1];
		this.anIntArray315 = new int[arg0];
		this.aByteArray56 = new byte[arg1];
		this.aShortArray54 = new short[arg1];
		this.anIntArray308 = new int[arg0];
		this.anIntArray313 = new int[arg1];
		this.anIntArray317 = new int[arg0];
		this.aByteArray55 = new byte[arg1];
		this.anIntArray312 = new int[arg0];
		this.aShortArray55 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray310 = new int[arg2];
			this.anIntArray311 = new int[arg2];
			this.anIntArray314 = new int[arg2];
			this.anIntArray316 = new int[arg2];
			this.anIntArray318 = new int[arg2];
			this.aShortArray57 = new short[arg2];
			this.aByteArray58 = new byte[arg2];
			this.aShortArray58 = new short[arg2];
			this.anIntArray309 = new int[arg2];
			this.aByteArray57 = new byte[arg2];
			this.aShortArray49 = new short[arg2];
			this.aByteArray53 = new byte[arg2];
		}
		this.aByteArray59 = new byte[arg1];
		this.aShortArray53 = new short[arg1];
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "([Lclient!kda;I)V")
	public Class186(@OriginalArg(0) Class186[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4696 = 0;
		this.anInt4698 = 0;
		this.anInt4695 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte73 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class186 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt4698 += local59.anInt4698;
				this.anInt4696 += local59.anInt4696;
				this.anInt4695 += local59.anInt4695;
				if (local59.aClass245Array1 != null) {
					local36 += local59.aClass245Array1.length;
				}
				if (local59.aClass255Array2 != null) {
					local34 += local59.aClass255Array2.length;
				}
				local38 |= local59.aByteArray54 != null;
				if (local59.aClass143Array2 != null) {
					local32 += local59.aClass143Array2.length;
				}
				local51 |= local59.anIntArray313 != null;
				local46 |= local59.aShortArray51 != null;
				local44 |= local59.aByteArray59 != null;
				if (local59.aByteArray55 == null) {
					if (this.aByte73 == -1) {
						this.aByte73 = local59.aByte73;
					}
					if (local59.aByte73 != this.aByte73) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray56 != null;
			}
		}
		if (this.anInt4695 > 0) {
			this.anIntArray311 = new int[this.anInt4695];
			this.aByteArray53 = new byte[this.anInt4695];
			this.aShortArray58 = new short[this.anInt4695];
			this.anIntArray309 = new int[this.anInt4695];
			this.aShortArray57 = new short[this.anInt4695];
			this.anIntArray314 = new int[this.anInt4695];
			this.anIntArray310 = new int[this.anInt4695];
			this.aByteArray58 = new byte[this.anInt4695];
			this.anIntArray318 = new int[this.anInt4695];
			this.anIntArray316 = new int[this.anInt4695];
			this.aByteArray57 = new byte[this.anInt4695];
			this.aShortArray49 = new short[this.anInt4695];
		}
		this.aShortArray50 = new short[this.anInt4696];
		if (local36 > 0) {
			this.aClass245Array1 = new Class245[local36];
		}
		if (local32 > 0) {
			this.aClass143Array2 = new Class143[local32];
		}
		this.aShortArray54 = new short[this.anInt4696];
		this.aShortArray55 = new short[this.anInt4696];
		this.anIntArray317 = new int[this.anInt4698];
		if (local44) {
			this.aByteArray59 = new byte[this.anInt4696];
		}
		this.anIntArray315 = new int[this.anInt4698];
		this.aShortArray52 = new short[this.anInt4698];
		if (local51) {
			this.anIntArray313 = new int[this.anInt4696];
		}
		if (local42) {
			this.aByteArray56 = new byte[this.anInt4696];
		}
		this.anIntArray312 = new int[this.anInt4698];
		this.anIntArray308 = new int[this.anInt4698];
		if (local38) {
			this.aByteArray54 = new byte[this.anInt4696];
		}
		this.aShortArray56 = new short[this.anInt4696];
		this.aShortArray53 = new short[this.anInt4696];
		if (local34 > 0) {
			this.aClass255Array2 = new Class255[local34];
		}
		if (local40) {
			this.aByteArray55 = new byte[this.anInt4696];
		}
		if (local46) {
			this.aShortArray51 = new short[this.anInt4696];
		}
		this.anInt4696 = 0;
		this.anInt4695 = 0;
		local36 = 0;
		local34 = 0;
		this.anInt4698 = 0;
		local32 = 0;
		@Pc(611) int local611;
		@Pc(622) int local622;
		for (@Pc(375) int local375 = 0; local375 < arg1; local375++) {
			@Pc(382) short local382 = (short) (0x1 << local375);
			@Pc(386) Class186 local386 = arg0[local375];
			if (local386 != null) {
				@Pc(393) int local393;
				if (local386.aClass245Array1 != null) {
					for (local393 = 0; local393 < local386.aClass245Array1.length; local393++) {
						@Pc(400) Class245 local400 = local386.aClass245Array1[local393];
						this.aClass245Array1[local36++] = local400.method5444(this.anInt4696 + local400.anInt6287);
					}
				}
				for (local393 = 0; local393 < local386.anInt4696; local393++) {
					if (local38 && local386.aByteArray54 != null) {
						this.aByteArray54[this.anInt4696] = local386.aByteArray54[local393];
					}
					if (local40) {
						if (local386.aByteArray55 == null) {
							this.aByteArray55[this.anInt4696] = local386.aByte73;
						} else {
							this.aByteArray55[this.anInt4696] = local386.aByteArray55[local393];
						}
					}
					if (local42 && local386.aByteArray56 != null) {
						this.aByteArray56[this.anInt4696] = local386.aByteArray56[local393];
					}
					if (local46) {
						if (local386.aShortArray51 == null) {
							this.aShortArray51[this.anInt4696] = -1;
						} else {
							this.aShortArray51[this.anInt4696] = local386.aShortArray51[local393];
						}
					}
					if (local51) {
						if (local386.anIntArray313 == null) {
							this.anIntArray313[this.anInt4696] = -1;
						} else {
							this.anIntArray313[this.anInt4696] = local386.anIntArray313[local393];
						}
					}
					this.aShortArray53[this.anInt4696] = (short) this.method3993(local386.aShortArray53[local393], local382, local386);
					this.aShortArray54[this.anInt4696] = (short) this.method3993(local386.aShortArray54[local393], local382, local386);
					this.aShortArray50[this.anInt4696] = (short) this.method3993(local386.aShortArray50[local393], local382, local386);
					this.aShortArray56[this.anInt4696] = local382;
					this.aShortArray55[this.anInt4696] = local386.aShortArray55[local393];
					this.anInt4696++;
				}
				@Pc(598) int local598;
				if (local386.aClass143Array2 != null) {
					for (local598 = 0; local598 < local386.aClass143Array2.length; local598++) {
						local611 = this.method3993(local386.aClass143Array2[local598].anInt3607, local382, local386);
						local622 = this.method3993(local386.aClass143Array2[local598].anInt3594, local382, local386);
						@Pc(633) int local633 = this.method3993(local386.aClass143Array2[local598].anInt3598, local382, local386);
						this.aClass143Array2[local32] = local386.aClass143Array2[local598].method3022(local611, local622, local633);
						local32++;
					}
				}
				if (local386.aClass255Array2 != null) {
					for (local598 = 0; local598 < local386.aClass255Array2.length; local598++) {
						local611 = this.method3993(local386.aClass255Array2[local598].anInt6388, local382, local386);
						this.aClass255Array2[local34] = local386.aClass255Array2[local598].method5514(local611);
						local34++;
					}
				}
			}
		}
		this.anInt4703 = this.anInt4698;
		@Pc(703) int local703 = 0;
		for (@Pc(705) int local705 = 0; local705 < arg1; local705++) {
			@Pc(712) short local712 = (short) (0x1 << local705);
			@Pc(716) Class186 local716 = arg0[local705];
			if (local716 != null) {
				for (local611 = 0; local611 < local716.anInt4696; local611++) {
					if (local44) {
						this.aByteArray59[local703++] = (byte) (local716.aByteArray59 == null || local716.aByteArray59[local611] == -1 ? -1 : this.anInt4695 + local716.aByteArray59[local611]);
					}
				}
				for (local622 = 0; local622 < local716.anInt4695; local622++) {
					@Pc(773) byte local773 = this.aByteArray57[this.anInt4695] = local716.aByteArray57[local622];
					if (local773 == 0) {
						this.aShortArray49[this.anInt4695] = (short) this.method3993(local716.aShortArray49[local622], local712, local716);
						this.aShortArray58[this.anInt4695] = (short) this.method3993(local716.aShortArray58[local622], local712, local716);
						this.aShortArray57[this.anInt4695] = (short) this.method3993(local716.aShortArray57[local622], local712, local716);
					}
					if (local773 >= 1 && local773 <= 3) {
						this.aShortArray49[this.anInt4695] = local716.aShortArray49[local622];
						this.aShortArray58[this.anInt4695] = local716.aShortArray58[local622];
						this.aShortArray57[this.anInt4695] = local716.aShortArray57[local622];
						this.anIntArray310[this.anInt4695] = local716.anIntArray310[local622];
						this.anIntArray318[this.anInt4695] = local716.anIntArray318[local622];
						this.anIntArray309[this.anInt4695] = local716.anIntArray309[local622];
						this.aByteArray58[this.anInt4695] = local716.aByteArray58[local622];
						this.aByteArray53[this.anInt4695] = local716.aByteArray53[local622];
						this.anIntArray316[this.anInt4695] = local716.anIntArray316[local622];
					}
					if (local773 == 2) {
						this.anIntArray311[this.anInt4695] = local716.anIntArray311[local622];
						this.anIntArray314[this.anInt4695] = local716.anIntArray314[local622];
					}
					this.anInt4695++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)[[I")
	public int[][] method3991() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.aClass245Array1.length; local20++) {
			@Pc(28) int local28 = this.aClass245Array1[local20].anInt6288;
			if (local28 >= 0) {
				@Pc(37) int local37 = local8[local28]++;
				if (local10 < local28) {
					local10 = local28;
				}
			}
		}
		@Pc(56) int[][] local56 = new int[local10 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local10; local58++) {
			local56[local58] = new int[local8[local58]];
			local8[local58] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.aClass245Array1.length; local77++) {
			@Pc(85) int local85 = this.aClass245Array1[local77].anInt6288;
			if (local85 >= 0) {
				local56[local85][local8[local85]++] = local77;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)V")
	public void method3992() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt4698; local9++) {
			this.anIntArray312[local9] <<= 0x2;
			this.anIntArray317[local9] <<= 0x2;
			this.anIntArray315[local9] <<= 0x2;
		}
		if (this.anInt4695 <= 0 || this.anIntArray310 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray310.length; local56++) {
			this.anIntArray310[local56] <<= 0x2;
			this.anIntArray318[local56] <<= 0x2;
			if (this.aByteArray57[local56] != 1) {
				this.anIntArray309[local56] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ISBLclient!kda;)I")
	private int method3993(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) Class186 arg2) {
		@Pc(10) int local10 = arg2.anIntArray312[arg0];
		@Pc(15) int local15 = arg2.anIntArray317[arg0];
		@Pc(20) int local20 = arg2.anIntArray315[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt4698; local22++) {
			if (this.anIntArray312[local22] == local10 && this.anIntArray317[local22] == local15 && local20 == this.anIntArray315[local22]) {
				this.aShortArray52[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray312[this.anInt4698] = local10;
		this.anIntArray317[this.anInt4698] = local15;
		this.anIntArray315[this.anInt4698] = local20;
		this.aShortArray52[this.anInt4698] = arg1;
		this.anIntArray308[this.anInt4698] = arg2.anIntArray308 == null ? -1 : arg2.anIntArray308[arg0];
		return this.anInt4698++;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([BI)V")
	private void method3994(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub22 local10 = new Class2_Sub22(arg0);
		@Pc(15) Class2_Sub22 local15 = new Class2_Sub22(arg0);
		@Pc(20) Class2_Sub22 local20 = new Class2_Sub22(arg0);
		@Pc(25) Class2_Sub22 local25 = new Class2_Sub22(arg0);
		@Pc(30) Class2_Sub22 local30 = new Class2_Sub22(arg0);
		@Pc(35) Class2_Sub22 local35 = new Class2_Sub22(arg0);
		@Pc(40) Class2_Sub22 local40 = new Class2_Sub22(arg0);
		local10.anInt10247 = arg0.length - 23;
		this.anInt4698 = local10.method8546();
		this.anInt4696 = local10.method8546();
		this.anInt4695 = local10.method8547();
		@Pc(67) int local67 = local10.method8547();
		@Pc(76) boolean local76 = (local67 & 0x1) == 1;
		@Pc(85) boolean local85 = (local67 & 0x2) == 2;
		@Pc(94) boolean local94 = (local67 & 0x4) == 4;
		@Pc(105) boolean local105 = (local67 & 0x8) == 8;
		if (local105) {
			local10.anInt10247 -= 7;
			this.anInt4702 = local10.method8547();
			local10.anInt10247 += 6;
		}
		@Pc(128) int local128 = local10.method8547();
		@Pc(132) int local132 = local10.method8547();
		@Pc(136) int local136 = local10.method8547();
		@Pc(140) int local140 = local10.method8547();
		@Pc(144) int local144 = local10.method8547();
		@Pc(148) int local148 = local10.method8546();
		@Pc(154) int local154 = local10.method8546();
		@Pc(158) int local158 = local10.method8546();
		@Pc(162) int local162 = local10.method8546();
		@Pc(166) int local166 = local10.method8546();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(185) int local185;
		if (this.anInt4695 > 0) {
			local10.anInt10247 = 0;
			this.aByteArray57 = new byte[this.anInt4695];
			for (local185 = 0; local185 < this.anInt4695; local185++) {
				@Pc(196) byte local196 = this.aByteArray57[local185] = local10.method8548();
				if (local196 == 2) {
					local172++;
				}
				if (local196 == 0) {
					local168++;
				}
				if (local196 >= 1 && local196 <= 3) {
					local170++;
				}
			}
		}
		local185 = this.anInt4695;
		@Pc(231) int local231 = local185;
		local185 += this.anInt4698;
		@Pc(238) int local238 = local185;
		if (local76) {
			local185 += this.anInt4696;
		}
		@Pc(247) int local247 = local185;
		local185 += this.anInt4696;
		@Pc(254) int local254 = local185;
		if (local128 == 255) {
			local185 += this.anInt4696;
		}
		@Pc(266) int local266 = local185;
		if (local136 == 1) {
			local185 += this.anInt4696;
		}
		@Pc(278) int local278 = local185;
		if (local144 == 1) {
			local185 += this.anInt4698;
		}
		@Pc(288) int local288 = local185;
		if (local132 == 1) {
			local185 += this.anInt4696;
		}
		@Pc(298) int local298 = local185;
		local185 += local162;
		@Pc(304) int local304 = local185;
		if (local140 == 1) {
			local185 += this.anInt4696 * 2;
		}
		@Pc(316) int local316 = local185;
		local185 += local166;
		@Pc(322) int local322 = local185;
		local185 += this.anInt4696 * 2;
		@Pc(331) int local331 = local185;
		local185 += local148;
		@Pc(337) int local337 = local185;
		local185 += local154;
		@Pc(343) int local343 = local185;
		local185 += local158;
		@Pc(349) int local349 = local185;
		local185 += local168 * 6;
		@Pc(357) int local357 = local185;
		local185 += local170 * 6;
		@Pc(365) byte local365 = 6;
		if (this.anInt4702 == 14) {
			local365 = 7;
		} else if (this.anInt4702 >= 15) {
			local365 = 9;
		}
		@Pc(383) int local383 = local185;
		local185 += local365 * local170;
		@Pc(391) int local391 = local185;
		local185 += local170;
		@Pc(397) int local397 = local185;
		local185 += local170;
		@Pc(403) int local403 = local185;
		local185 += local172 * 2 + local170;
		if (local128 == 255) {
			this.aByteArray55 = new byte[this.anInt4696];
		} else {
			this.aByte73 = (byte) local128;
		}
		this.anIntArray312 = new int[this.anInt4698];
		if (local136 == 1) {
			this.anIntArray313 = new int[this.anInt4696];
		}
		local10.anInt10247 = local231;
		if (local140 == 1 && this.anInt4695 > 0) {
			this.aByteArray59 = new byte[this.anInt4696];
		}
		if (local144 == 1) {
			this.anIntArray308 = new int[this.anInt4698];
		}
		this.aShortArray53 = new short[this.anInt4696];
		this.aShortArray55 = new short[this.anInt4696];
		if (this.anInt4695 > 0) {
			if (local170 > 0) {
				this.anIntArray316 = new int[local170];
				this.anIntArray318 = new int[local170];
				this.aByteArray58 = new byte[local170];
				this.anIntArray309 = new int[local170];
				this.aByteArray53 = new byte[local170];
				this.anIntArray310 = new int[local170];
			}
			if (local172 > 0) {
				this.anIntArray314 = new int[local172];
				this.anIntArray311 = new int[local172];
			}
			this.aShortArray58 = new short[this.anInt4695];
			this.aShortArray49 = new short[this.anInt4695];
			this.aShortArray57 = new short[this.anInt4695];
		}
		if (local140 == 1) {
			this.aShortArray51 = new short[this.anInt4696];
		}
		this.anIntArray317 = new int[this.anInt4698];
		this.aShortArray54 = new short[this.anInt4696];
		if (local132 == 1) {
			this.aByteArray56 = new byte[this.anInt4696];
		}
		this.aShortArray50 = new short[this.anInt4696];
		this.anIntArray315 = new int[this.anInt4698];
		if (local76) {
			this.aByteArray54 = new byte[this.anInt4696];
		}
		local15.anInt10247 = local331;
		local20.anInt10247 = local337;
		local25.anInt10247 = local343;
		local30.anInt10247 = local278;
		@Pc(597) int local597 = 0;
		@Pc(599) int local599 = 0;
		@Pc(601) int local601 = 0;
		@Pc(609) int local609;
		for (@Pc(603) int local603 = 0; local603 < this.anInt4698; local603++) {
			local609 = local10.method8547();
			@Pc(611) int local611 = 0;
			if ((local609 & 0x1) != 0) {
				local611 = local15.method8536();
			}
			@Pc(621) int local621 = 0;
			if ((local609 & 0x2) != 0) {
				local621 = local20.method8536();
			}
			@Pc(631) int local631 = 0;
			if ((local609 & 0x4) != 0) {
				local631 = local25.method8536();
			}
			this.anIntArray312[local603] = local611 + local597;
			this.anIntArray317[local603] = local621 + local599;
			this.anIntArray315[local603] = local601 + local631;
			local601 = this.anIntArray315[local603];
			local597 = this.anIntArray312[local603];
			local599 = this.anIntArray317[local603];
			if (local144 == 1) {
				this.anIntArray308[local603] = local30.method8547();
			}
		}
		local10.anInt10247 = local322;
		local15.anInt10247 = local238;
		local20.anInt10247 = local254;
		local25.anInt10247 = local288;
		local30.anInt10247 = local266;
		local35.anInt10247 = local304;
		local40.anInt10247 = local316;
		for (local609 = 0; local609 < this.anInt4696; local609++) {
			this.aShortArray55[local609] = (short) local10.method8546();
			if (local76) {
				this.aByteArray54[local609] = local15.method8548();
			}
			if (local128 == 255) {
				this.aByteArray55[local609] = local20.method8548();
			}
			if (local132 == 1) {
				this.aByteArray56[local609] = local25.method8548();
			}
			if (local136 == 1) {
				this.anIntArray313[local609] = local30.method8547();
			}
			if (local140 == 1) {
				this.aShortArray51[local609] = (short) (local35.method8546() - 1);
			}
			if (this.aByteArray59 != null) {
				if (this.aShortArray51[local609] == -1) {
					this.aByteArray59[local609] = -1;
				} else {
					this.aByteArray59[local609] = (byte) (local40.method8547() - 1);
				}
			}
		}
		this.anInt4703 = -1;
		local10.anInt10247 = local298;
		local15.anInt10247 = local247;
		@Pc(828) short local828 = 0;
		@Pc(830) short local830 = 0;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(842) int local842;
		for (@Pc(836) int local836 = 0; local836 < this.anInt4696; local836++) {
			local842 = local15.method8547();
			if (local842 == 1) {
				local828 = (short) (local10.method8536() + local834);
				local830 = (short) (local828 + local10.method8536());
				local832 = (short) (local830 + local10.method8536());
				this.aShortArray53[local836] = local828;
				local834 = local832;
				this.aShortArray54[local836] = local830;
				this.aShortArray50[local836] = local832;
				if (local828 > this.anInt4703) {
					this.anInt4703 = local828;
				}
				if (this.anInt4703 < local830) {
					this.anInt4703 = local830;
				}
				if (this.anInt4703 < local832) {
					this.anInt4703 = local832;
				}
			}
			if (local842 == 2) {
				local830 = local832;
				local832 = (short) (local10.method8536() + local834);
				local834 = local832;
				this.aShortArray53[local836] = local828;
				this.aShortArray54[local836] = local830;
				this.aShortArray50[local836] = local832;
				if (local832 > this.anInt4703) {
					this.anInt4703 = local832;
				}
			}
			if (local842 == 3) {
				local828 = local832;
				local832 = (short) (local834 + local10.method8536());
				local834 = local832;
				this.aShortArray53[local836] = local828;
				this.aShortArray54[local836] = local830;
				this.aShortArray50[local836] = local832;
				if (local832 > this.anInt4703) {
					this.anInt4703 = local832;
				}
			}
			if (local842 == 4) {
				@Pc(1001) short local1001 = local828;
				local828 = local830;
				local830 = local1001;
				local832 = (short) (local834 + local10.method8536());
				this.aShortArray53[local836] = local828;
				local834 = local832;
				this.aShortArray54[local836] = local1001;
				this.aShortArray50[local836] = local832;
				if (local832 > this.anInt4703) {
					this.anInt4703 = local832;
				}
			}
		}
		local10.anInt10247 = local349;
		this.anInt4703++;
		local15.anInt10247 = local357;
		local20.anInt10247 = local383;
		local25.anInt10247 = local391;
		local30.anInt10247 = local397;
		local35.anInt10247 = local403;
		@Pc(1080) int local1080;
		for (local842 = 0; local842 < this.anInt4695; local842++) {
			local1080 = this.aByteArray57[local842] & 0xFF;
			if (local1080 == 0) {
				this.aShortArray49[local842] = (short) local10.method8546();
				this.aShortArray58[local842] = (short) local10.method8546();
				this.aShortArray57[local842] = (short) local10.method8546();
			}
			if (local1080 == 1) {
				this.aShortArray49[local842] = (short) local15.method8546();
				this.aShortArray58[local842] = (short) local15.method8546();
				this.aShortArray57[local842] = (short) local15.method8546();
				if (this.anInt4702 >= 15) {
					this.anIntArray310[local842] = local20.method8539();
					this.anIntArray318[local842] = local20.method8539();
					this.anIntArray309[local842] = local20.method8539();
				} else {
					this.anIntArray310[local842] = local20.method8546();
					if (this.anInt4702 >= 14) {
						this.anIntArray318[local842] = local20.method8539();
					} else {
						this.anIntArray318[local842] = local20.method8546();
					}
					this.anIntArray309[local842] = local20.method8546();
				}
				this.aByteArray58[local842] = local25.method8548();
				this.aByteArray53[local842] = local30.method8548();
				this.anIntArray316[local842] = local35.method8548();
			}
			if (local1080 == 2) {
				this.aShortArray49[local842] = (short) local15.method8546();
				this.aShortArray58[local842] = (short) local15.method8546();
				this.aShortArray57[local842] = (short) local15.method8546();
				if (this.anInt4702 >= 15) {
					this.anIntArray310[local842] = local20.method8539();
					this.anIntArray318[local842] = local20.method8539();
					this.anIntArray309[local842] = local20.method8539();
				} else {
					this.anIntArray310[local842] = local20.method8546();
					if (this.anInt4702 < 14) {
						this.anIntArray318[local842] = local20.method8546();
					} else {
						this.anIntArray318[local842] = local20.method8539();
					}
					this.anIntArray309[local842] = local20.method8546();
				}
				this.aByteArray58[local842] = local25.method8548();
				this.aByteArray53[local842] = local30.method8548();
				this.anIntArray316[local842] = local35.method8548();
				this.anIntArray311[local842] = local35.method8548();
				this.anIntArray314[local842] = local35.method8548();
			}
			if (local1080 == 3) {
				this.aShortArray49[local842] = (short) local15.method8546();
				this.aShortArray58[local842] = (short) local15.method8546();
				this.aShortArray57[local842] = (short) local15.method8546();
				if (this.anInt4702 < 15) {
					this.anIntArray310[local842] = local20.method8546();
					if (this.anInt4702 < 14) {
						this.anIntArray318[local842] = local20.method8546();
					} else {
						this.anIntArray318[local842] = local20.method8539();
					}
					this.anIntArray309[local842] = local20.method8546();
				} else {
					this.anIntArray310[local842] = local20.method8539();
					this.anIntArray318[local842] = local20.method8539();
					this.anIntArray309[local842] = local20.method8539();
				}
				this.aByteArray58[local842] = local25.method8548();
				this.aByteArray53[local842] = local30.method8548();
				this.anIntArray316[local842] = local35.method8548();
			}
		}
		local10.anInt10247 = local185;
		@Pc(1494) int local1494;
		@Pc(1502) int local1502;
		@Pc(1506) int local1506;
		@Pc(1572) int local1572;
		if (local85) {
			local1080 = local10.method8547();
			if (local1080 > 0) {
				this.aClass143Array2 = new Class143[local1080];
				for (local1494 = 0; local1494 < local1080; local1494++) {
					local1502 = local10.method8546();
					local1506 = local10.method8546();
					@Pc(1512) byte local1512;
					if (local128 == 255) {
						local1512 = this.aByteArray55[local1506];
					} else {
						local1512 = (byte) local128;
					}
					this.aClass143Array2[local1494] = new Class143(local1502, this.aShortArray53[local1506], this.aShortArray54[local1506], this.aShortArray50[local1506], local1512);
				}
			}
			local1494 = local10.method8547();
			if (local1494 > 0) {
				this.aClass255Array2 = new Class255[local1494];
				for (local1502 = 0; local1502 < local1494; local1502++) {
					local1506 = local10.method8546();
					local1572 = local10.method8546();
					this.aClass255Array2[local1502] = new Class255(local1506, local1572);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1080 = local10.method8547();
		if (local1080 <= 0) {
			return;
		}
		this.aClass245Array1 = new Class245[local1080];
		for (local1494 = 0; local1494 < local1080; local1494++) {
			local1502 = local10.method8546();
			local1506 = local10.method8546();
			local1572 = local10.method8547();
			@Pc(1626) byte local1626 = local10.method8548();
			this.aClass245Array1[local1494] = new Class245(local1502, local1506, local1572, local1626);
		}
		return;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIZ)I")
	public int method3995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4698; local7++) {
			if (arg2 == this.anIntArray312[local7] && this.anIntArray317[local7] == arg0 && arg1 == this.anIntArray315[local7]) {
				return local7;
			}
		}
		this.anIntArray312[this.anInt4698] = arg2;
		this.anIntArray317[this.anInt4698] = arg0;
		this.anIntArray315[this.anInt4698] = arg1;
		this.anInt4703 = this.anInt4698 + 1;
		return this.anInt4698++;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(SSI)V")
	public void method3996(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(18) int local18 = 0; local18 < this.anInt4696; local18++) {
			if (arg1 == this.aShortArray55[local18]) {
				this.aShortArray55[local18] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([BZ)V")
	private void method3997(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub22 local14 = new Class2_Sub22(arg0);
		@Pc(19) Class2_Sub22 local19 = new Class2_Sub22(arg0);
		@Pc(24) Class2_Sub22 local24 = new Class2_Sub22(arg0);
		@Pc(29) Class2_Sub22 local29 = new Class2_Sub22(arg0);
		@Pc(34) Class2_Sub22 local34 = new Class2_Sub22(arg0);
		local14.anInt10247 = arg0.length - 18;
		this.anInt4698 = local14.method8546();
		this.anInt4696 = local14.method8546();
		this.anInt4695 = local14.method8547();
		@Pc(59) int local59 = local14.method8547();
		@Pc(63) int local63 = local14.method8547();
		@Pc(67) int local67 = local14.method8547();
		@Pc(71) int local71 = local14.method8547();
		@Pc(75) int local75 = local14.method8547();
		@Pc(79) int local79 = local14.method8546();
		@Pc(83) int local83 = local14.method8546();
		@Pc(87) int local87 = local14.method8546();
		@Pc(91) int local91 = local14.method8546();
		@Pc(100) int local100 = this.anInt4698;
		@Pc(102) int local102 = local100;
		local100 += this.anInt4696;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt4696;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt4696;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt4696;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt4698;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt4696;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt4696 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt4695 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		this.anIntArray315 = new int[this.anInt4698];
		this.anIntArray312 = new int[this.anInt4698];
		this.aShortArray50 = new short[this.anInt4696];
		this.aShortArray54 = new short[this.anInt4696];
		if (local67 == 1) {
			this.aByteArray56 = new byte[this.anInt4696];
		}
		if (this.anInt4695 > 0) {
			this.aByteArray57 = new byte[this.anInt4695];
			this.aShortArray58 = new short[this.anInt4695];
			this.aShortArray49 = new short[this.anInt4695];
			this.aShortArray57 = new short[this.anInt4695];
		}
		if (local59 == 1) {
			this.aByteArray54 = new byte[this.anInt4696];
			this.aByteArray59 = new byte[this.anInt4696];
			this.aShortArray51 = new short[this.anInt4696];
		}
		this.aShortArray55 = new short[this.anInt4696];
		if (local75 == 1) {
			this.anIntArray308 = new int[this.anInt4698];
		}
		this.anIntArray317 = new int[this.anInt4698];
		if (local71 == 1) {
			this.anIntArray313 = new int[this.anInt4696];
		}
		local14.anInt10247 = 0;
		if (local63 == 255) {
			this.aByteArray55 = new byte[this.anInt4696];
		} else {
			this.aByte73 = (byte) local63;
		}
		this.aShortArray53 = new short[this.anInt4696];
		local19.anInt10247 = local187;
		local24.anInt10247 = local193;
		local29.anInt10247 = local100;
		local34.anInt10247 = local143;
		@Pc(336) int local336 = 0;
		@Pc(338) int local338 = 0;
		@Pc(340) int local340 = 0;
		@Pc(348) int local348;
		@Pc(350) int local350;
		for (@Pc(342) int local342 = 0; local342 < this.anInt4698; local342++) {
			local348 = local14.method8547();
			local350 = 0;
			if ((local348 & 0x1) != 0) {
				local350 = local19.method8536();
			}
			@Pc(363) int local363 = 0;
			if ((local348 & 0x2) != 0) {
				local363 = local24.method8536();
			}
			@Pc(373) int local373 = 0;
			if ((local348 & 0x4) != 0) {
				local373 = local29.method8536();
			}
			this.anIntArray312[local342] = local336 + local350;
			this.anIntArray317[local342] = local363 + local338;
			this.anIntArray315[local342] = local373 + local340;
			local336 = this.anIntArray312[local342];
			local338 = this.anIntArray317[local342];
			local340 = this.anIntArray315[local342];
			if (local75 == 1) {
				this.anIntArray308[local342] = local34.method8547();
			}
		}
		local14.anInt10247 = local169;
		local19.anInt10247 = local133;
		local24.anInt10247 = local109;
		local29.anInt10247 = local153;
		local34.anInt10247 = local121;
		for (local348 = 0; local348 < this.anInt4696; local348++) {
			this.aShortArray55[local348] = (short) local14.method8546();
			if (local59 == 1) {
				local350 = local19.method8547();
				if ((local350 & 0x1) == 1) {
					this.aByteArray54[local348] = 1;
					local7 = true;
				} else {
					this.aByteArray54[local348] = 0;
				}
				if ((local350 & 0x2) == 2) {
					this.aByteArray59[local348] = (byte) (local350 >> 2);
					this.aShortArray51[local348] = this.aShortArray55[local348];
					this.aShortArray55[local348] = 127;
					if (this.aShortArray51[local348] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray59[local348] = -1;
					this.aShortArray51[local348] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray55[local348] = local24.method8548();
			}
			if (local67 == 1) {
				this.aByteArray56[local348] = local29.method8548();
			}
			if (local71 == 1) {
				this.anIntArray313[local348] = local34.method8547();
			}
		}
		local14.anInt10247 = local163;
		this.anInt4703 = -1;
		local19.anInt10247 = local102;
		@Pc(591) short local591 = 0;
		@Pc(593) short local593 = 0;
		@Pc(595) short local595 = 0;
		@Pc(597) short local597 = 0;
		@Pc(605) int local605;
		for (@Pc(599) int local599 = 0; local599 < this.anInt4696; local599++) {
			local605 = local19.method8547();
			if (local605 == 1) {
				local591 = (short) (local14.method8536() + local597);
				local593 = (short) (local14.method8536() + local591);
				local595 = (short) (local593 + local14.method8536());
				local597 = local595;
				this.aShortArray53[local599] = local591;
				this.aShortArray54[local599] = local593;
				this.aShortArray50[local599] = local595;
				if (this.anInt4703 < local591) {
					this.anInt4703 = local591;
				}
				if (local593 > this.anInt4703) {
					this.anInt4703 = local593;
				}
				if (this.anInt4703 < local595) {
					this.anInt4703 = local595;
				}
			}
			if (local605 == 2) {
				local593 = local595;
				local595 = (short) (local597 + local14.method8536());
				this.aShortArray53[local599] = local591;
				local597 = local595;
				this.aShortArray54[local599] = local593;
				this.aShortArray50[local599] = local595;
				if (this.anInt4703 < local595) {
					this.anInt4703 = local595;
				}
			}
			if (local605 == 3) {
				local591 = local595;
				local595 = (short) (local597 + local14.method8536());
				this.aShortArray53[local599] = local591;
				local597 = local595;
				this.aShortArray54[local599] = local593;
				this.aShortArray50[local599] = local595;
				if (local595 > this.anInt4703) {
					this.anInt4703 = local595;
				}
			}
			if (local605 == 4) {
				@Pc(764) short local764 = local591;
				local591 = local593;
				local593 = local764;
				local595 = (short) (local597 + local14.method8536());
				this.aShortArray53[local599] = local591;
				local597 = local595;
				this.aShortArray54[local599] = local764;
				this.aShortArray50[local599] = local595;
				if (this.anInt4703 < local595) {
					this.anInt4703 = local595;
				}
			}
		}
		this.anInt4703++;
		local14.anInt10247 = local178;
		for (local605 = 0; local605 < this.anInt4695; local605++) {
			this.aByteArray57[local605] = 0;
			this.aShortArray49[local605] = (short) local14.method8546();
			this.aShortArray58[local605] = (short) local14.method8546();
			this.aShortArray57[local605] = (short) local14.method8546();
		}
		if (this.aByteArray59 != null) {
			@Pc(868) boolean local868 = false;
			for (@Pc(870) int local870 = 0; local870 < this.anInt4696; local870++) {
				@Pc(879) int local879 = this.aByteArray59[local870] & 0xFF;
				if (local879 != 255) {
					if (this.aShortArray53[local870] == (this.aShortArray49[local879] & 0xFFFF) && this.aShortArray54[local870] == (this.aShortArray58[local879] & 0xFFFF) && (this.aShortArray57[local879] & 0xFFFF) == this.aShortArray50[local870]) {
						this.aByteArray59[local870] = -1;
					} else {
						local868 = true;
					}
				}
			}
			if (!local868) {
				this.aByteArray59 = null;
			}
		}
		if (!local7) {
			this.aByteArray54 = null;
		}
		if (!local9) {
			this.aShortArray51 = null;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BBSSBSSSBS)B")
	public byte method3999() {
		if (this.anInt4695 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray57[this.anInt4695] = 3;
		this.aShortArray49[this.anInt4695] = 0;
		this.aShortArray58[this.anInt4695] = 32767;
		this.aShortArray57[this.anInt4695] = 0;
		this.anIntArray310[this.anInt4695] = 1024;
		this.anIntArray318[this.anInt4695] = 1024;
		this.anIntArray309[this.anInt4695] = 1024;
		this.aByteArray58[this.anInt4695] = 0;
		this.aByteArray53[this.anInt4695] = 0;
		this.anIntArray316[this.anInt4695] = 0;
		return (byte) this.anInt4695++;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)[[I")
	public int[][] method4000() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4696; local12++) {
			@Pc(19) int local19 = this.anIntArray313[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(46) int[][] local46 = new int[local10 + 1][];
		for (@Pc(48) int local48 = 0; local48 <= local10; local48++) {
			local46[local48] = new int[local8[local48]];
			local8[local48] = 0;
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt4696; local71++) {
			@Pc(81) int local81 = this.anIntArray313[local71];
			if (local81 >= 0) {
				local46[local81][local8[local81]++] = local71;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(SBSBBIBII)I")
	public int method4001(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray53[this.anInt4696] = (short) arg6;
		this.aShortArray54[this.anInt4696] = (short) arg7;
		this.aShortArray50[this.anInt4696] = (short) arg4;
		this.aByteArray54[this.anInt4696] = arg3;
		this.aByteArray59[this.anInt4696] = arg1;
		this.aShortArray55[this.anInt4696] = arg2;
		this.aByteArray56[this.anInt4696] = arg5;
		this.aShortArray51[this.anInt4696] = arg0;
		return this.anInt4696++;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIII)V")
	public void method4002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg0 != 0) {
			local14 = Canvas_Sub1.anIntArray497[arg0];
			local18 = Canvas_Sub1.anIntArray498[arg0];
			for (local20 = 0; local20 < this.anInt4698; local20++) {
				local38 = this.anIntArray317[local20] * local14 + local18 * this.anIntArray312[local20] >> 14;
				this.anIntArray317[local20] = this.anIntArray317[local20] * local18 - local14 * this.anIntArray312[local20] >> 14;
				this.anIntArray312[local20] = local38;
			}
		}
		if (arg2 != 0) {
			local14 = Canvas_Sub1.anIntArray497[arg2];
			local18 = Canvas_Sub1.anIntArray498[arg2];
			for (local20 = 0; local20 < this.anInt4698; local20++) {
				local38 = this.anIntArray317[local20] * local18 - this.anIntArray315[local20] * local14 >> 14;
				this.anIntArray315[local20] = local18 * this.anIntArray315[local20] + this.anIntArray317[local20] * local14 >> 14;
				this.anIntArray317[local20] = local38;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local14 = Canvas_Sub1.anIntArray497[arg1];
		local18 = Canvas_Sub1.anIntArray498[arg1];
		for (local20 = 0; local20 < this.anInt4698; local20++) {
			local38 = this.anIntArray315[local20] * local14 + this.anIntArray312[local20] * local18 >> 14;
			this.anIntArray315[local20] = local18 * this.anIntArray315[local20] - local14 * this.anIntArray312[local20] >> 14;
			this.anIntArray312[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(SSI)V")
	public void method4003(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray51 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt4696; local11++) {
			if (arg0 == this.aShortArray51[local11]) {
				this.aShortArray51[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZB)[[I")
	public int[][] method4004(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt4698 : this.anInt4703;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray308[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(45) int local45 = local8[local27]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(86) int local86 = 0; local86 < local18; local86++) {
			@Pc(93) int local93 = this.anIntArray308[local86];
			if (local93 >= 0) {
				local57[local93][local8[local93]++] = local86;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(IIII)V")
	public void method4005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4698; local11++) {
			this.anIntArray312[local11] += arg0;
			this.anIntArray317[local11] += arg2;
			this.anIntArray315[local11] += arg1;
		}
	}
}
