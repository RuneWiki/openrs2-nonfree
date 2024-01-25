import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class142 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "[Lclient!nba;")
	public Class223[] aClass223Array1;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[Lclient!al;")
	public Class18[] aClass18Array4;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	public int[] anIntArray293;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!id", name = "G", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!id", name = "I", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!id", name = "J", descriptor = "[Lclient!mi;")
	public Class215[] aClass215Array4;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!id", name = "L", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!id", name = "M", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!id", name = "S", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!id", name = "T", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!id", name = "X", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public int anInt5154 = 0;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public int anInt5152 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public int anInt5151 = 12;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "I")
	public int anInt5164 = 0;

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "B")
	public byte aByte59 = 0;

	@OriginalMember(owner = "client!id", name = "db", descriptor = "I")
	public int anInt5171 = 0;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	private Class142() {
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V")
	public Class142(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4361(arg0);
		} else {
			this.method4372(arg0);
		}
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(III)V")
	public Class142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray297 = new int[arg0];
		this.anIntArray293 = new int[arg0];
		this.anIntArray301 = new int[arg0];
		this.anIntArray298 = new int[arg1];
		this.aShortArray70 = new short[arg1];
		this.aShortArray75 = new short[arg1];
		this.anIntArray299 = new int[arg0];
		this.aShortArray74 = new short[arg1];
		this.aByteArray56 = new byte[arg1];
		this.aShortArray68 = new short[arg1];
		this.aByteArray54 = new byte[arg1];
		this.aShortArray73 = new short[arg1];
		this.aByteArray51 = new byte[arg1];
		if (arg2 > 0) {
			this.anIntArray294 = new int[arg2];
			this.aByteArray55 = new byte[arg2];
			this.anIntArray296 = new int[arg2];
			this.anIntArray302 = new int[arg2];
			this.aShortArray66 = new short[arg2];
			this.aShortArray69 = new short[arg2];
			this.aByteArray57 = new byte[arg2];
			this.anIntArray300 = new int[arg2];
			this.aByteArray52 = new byte[arg2];
			this.aShortArray67 = new short[arg2];
			this.anIntArray303 = new int[arg2];
			this.anIntArray295 = new int[arg2];
		}
		this.aByteArray53 = new byte[arg1];
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "([Lclient!id;I)V")
	public Class142(@OriginalArg(0) Class142[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5154 = 0;
		this.anInt5164 = 0;
		this.anInt5171 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte59 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class142 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5164 += local59.anInt5164;
				this.anInt5154 += local59.anInt5154;
				this.anInt5171 += local59.anInt5171;
				if (local59.aClass18Array4 != null) {
					local32 += local59.aClass18Array4.length;
				}
				if (local59.aClass223Array1 != null) {
					local36 += local59.aClass223Array1.length;
				}
				local38 |= local59.aByteArray54 != null;
				if (local59.aClass215Array4 != null) {
					local34 += local59.aClass215Array4.length;
				}
				local46 |= local59.aShortArray75 != null;
				local42 |= local59.aByteArray51 != null;
				if (local59.aByteArray53 == null) {
					if (this.aByte59 == -1) {
						this.aByte59 = local59.aByte59;
					}
					if (this.aByte59 != local59.aByte59) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray56 != null;
				local51 |= local59.anIntArray298 != null;
			}
		}
		this.anIntArray293 = new int[this.anInt5171];
		if (local46) {
			this.aShortArray75 = new short[this.anInt5154];
		}
		if (local34 > 0) {
			this.aClass215Array4 = new Class215[local34];
		}
		this.aShortArray71 = new short[this.anInt5154];
		this.aShortArray70 = new short[this.anInt5154];
		if (local32 > 0) {
			this.aClass18Array4 = new Class18[local32];
		}
		this.anIntArray301 = new int[this.anInt5171];
		this.anIntArray297 = new int[this.anInt5171];
		if (local38) {
			this.aByteArray54 = new byte[this.anInt5154];
		}
		this.aShortArray68 = new short[this.anInt5154];
		if (local44) {
			this.aByteArray56 = new byte[this.anInt5154];
		}
		this.aShortArray73 = new short[this.anInt5154];
		this.aShortArray72 = new short[this.anInt5171];
		if (local36 > 0) {
			this.aClass223Array1 = new Class223[local36];
		}
		this.anIntArray299 = new int[this.anInt5171];
		if (local42) {
			this.aByteArray51 = new byte[this.anInt5154];
		}
		if (local40) {
			this.aByteArray53 = new byte[this.anInt5154];
		}
		if (local51) {
			this.anIntArray298 = new int[this.anInt5154];
		}
		this.aShortArray74 = new short[this.anInt5154];
		if (this.anInt5164 > 0) {
			this.aShortArray67 = new short[this.anInt5164];
			this.anIntArray300 = new int[this.anInt5164];
			this.anIntArray303 = new int[this.anInt5164];
			this.anIntArray294 = new int[this.anInt5164];
			this.aShortArray66 = new short[this.anInt5164];
			this.aByteArray57 = new byte[this.anInt5164];
			this.aByteArray52 = new byte[this.anInt5164];
			this.anIntArray302 = new int[this.anInt5164];
			this.anIntArray295 = new int[this.anInt5164];
			this.aByteArray55 = new byte[this.anInt5164];
			this.anIntArray296 = new int[this.anInt5164];
			this.aShortArray69 = new short[this.anInt5164];
		}
		this.anInt5164 = 0;
		local34 = 0;
		local36 = 0;
		this.anInt5171 = 0;
		local32 = 0;
		this.anInt5154 = 0;
		@Pc(616) int local616;
		@Pc(627) int local627;
		for (@Pc(380) int local380 = 0; local380 < arg1; local380++) {
			@Pc(387) short local387 = (short) (0x1 << local380);
			@Pc(391) Class142 local391 = arg0[local380];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass223Array1 != null) {
					for (local398 = 0; local398 < local391.aClass223Array1.length; local398++) {
						@Pc(405) Class223 local405 = local391.aClass223Array1[local398];
						this.aClass223Array1[local36++] = local405.method5868(this.anInt5154 + local405.anInt6988);
					}
				}
				for (local398 = 0; local398 < local391.anInt5154; local398++) {
					if (local38 && local391.aByteArray54 != null) {
						this.aByteArray54[this.anInt5154] = local391.aByteArray54[local398];
					}
					if (local40) {
						if (local391.aByteArray53 == null) {
							this.aByteArray53[this.anInt5154] = local391.aByte59;
						} else {
							this.aByteArray53[this.anInt5154] = local391.aByteArray53[local398];
						}
					}
					if (local42 && local391.aByteArray51 != null) {
						this.aByteArray51[this.anInt5154] = local391.aByteArray51[local398];
					}
					if (local46) {
						if (local391.aShortArray75 == null) {
							this.aShortArray75[this.anInt5154] = -1;
						} else {
							this.aShortArray75[this.anInt5154] = local391.aShortArray75[local398];
						}
					}
					if (local51) {
						if (local391.anIntArray298 == null) {
							this.anIntArray298[this.anInt5154] = -1;
						} else {
							this.anIntArray298[this.anInt5154] = local391.anIntArray298[local398];
						}
					}
					this.aShortArray68[this.anInt5154] = (short) this.method4360(local387, local391, local391.aShortArray68[local398]);
					this.aShortArray74[this.anInt5154] = (short) this.method4360(local387, local391, local391.aShortArray74[local398]);
					this.aShortArray73[this.anInt5154] = (short) this.method4360(local387, local391, local391.aShortArray73[local398]);
					this.aShortArray71[this.anInt5154] = local387;
					this.aShortArray70[this.anInt5154] = local391.aShortArray70[local398];
					this.anInt5154++;
				}
				@Pc(603) int local603;
				if (local391.aClass18Array4 != null) {
					for (local603 = 0; local603 < local391.aClass18Array4.length; local603++) {
						local616 = this.method4360(local387, local391, local391.aClass18Array4[local603].anInt196);
						local627 = this.method4360(local387, local391, local391.aClass18Array4[local603].anInt197);
						@Pc(638) int local638 = this.method4360(local387, local391, local391.aClass18Array4[local603].anInt203);
						this.aClass18Array4[local32] = local391.aClass18Array4[local603].method262(local627, local638, local616);
						local32++;
					}
				}
				if (local391.aClass215Array4 != null) {
					for (local603 = 0; local603 < local391.aClass215Array4.length; local603++) {
						local616 = this.method4360(local387, local391, local391.aClass215Array4[local603].anInt6805);
						this.aClass215Array4[local34] = local391.aClass215Array4[local603].method5694(local616);
						local34++;
					}
				}
			}
		}
		this.anInt5152 = this.anInt5171;
		@Pc(712) int local712 = 0;
		for (@Pc(714) int local714 = 0; local714 < arg1; local714++) {
			@Pc(721) short local721 = (short) (0x1 << local714);
			@Pc(725) Class142 local725 = arg0[local714];
			if (local725 != null) {
				for (local616 = 0; local616 < local725.anInt5154; local616++) {
					if (local44) {
						this.aByteArray56[local712++] = (byte) (local725.aByteArray56 == null || local725.aByteArray56[local616] == -1 ? -1 : local725.aByteArray56[local616] + this.anInt5164);
					}
				}
				for (local627 = 0; local627 < local725.anInt5164; local627++) {
					@Pc(778) byte local778 = this.aByteArray52[this.anInt5164] = local725.aByteArray52[local627];
					if (local778 == 0) {
						this.aShortArray67[this.anInt5164] = (short) this.method4360(local721, local725, local725.aShortArray67[local627]);
						this.aShortArray66[this.anInt5164] = (short) this.method4360(local721, local725, local725.aShortArray66[local627]);
						this.aShortArray69[this.anInt5164] = (short) this.method4360(local721, local725, local725.aShortArray69[local627]);
					}
					if (local778 >= 1 && local778 <= 3) {
						this.aShortArray67[this.anInt5164] = local725.aShortArray67[local627];
						this.aShortArray66[this.anInt5164] = local725.aShortArray66[local627];
						this.aShortArray69[this.anInt5164] = local725.aShortArray69[local627];
						this.anIntArray302[this.anInt5164] = local725.anIntArray302[local627];
						this.anIntArray294[this.anInt5164] = local725.anIntArray294[local627];
						this.anIntArray303[this.anInt5164] = local725.anIntArray303[local627];
						this.aByteArray57[this.anInt5164] = local725.aByteArray57[local627];
						this.aByteArray55[this.anInt5164] = local725.aByteArray55[local627];
						this.anIntArray295[this.anInt5164] = local725.anIntArray295[local627];
					}
					if (local778 == 2) {
						this.anIntArray300[this.anInt5164] = local725.anIntArray300[local627];
						this.anIntArray296[this.anInt5164] = local725.anIntArray296[local627];
					}
					this.anInt5164++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)I")
	public int method4355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5171; local7++) {
			if (arg1 == this.anIntArray301[local7] && arg2 == this.anIntArray293[local7] && this.anIntArray299[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray301[this.anInt5171] = arg1;
		this.anIntArray293[this.anInt5171] = arg2;
		this.anIntArray299[this.anInt5171] = arg0;
		this.anInt5152 = this.anInt5171 + 1;
		return this.anInt5171++;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[[I")
	public int[][] method4356() {
		@Pc(23) int[] local23 = new int[256];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt5154; local27++) {
			@Pc(34) int local34 = this.anIntArray298[local27];
			if (local34 >= 0) {
				@Pc(40) int local40 = local23[local34]++;
				if (local34 > local25) {
					local25 = local34;
				}
			}
		}
		@Pc(62) int[][] local62 = new int[local25 + 1][];
		for (@Pc(64) int local64 = 0; local64 <= local25; local64++) {
			local62[local64] = new int[local23[local64]];
			local23[local64] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt5154; local87++) {
			@Pc(94) int local94 = this.anIntArray298[local87];
			if (local94 >= 0) {
				local62[local94][local23[local94]++] = local87;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
	public void method4357() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt5171; local13++) {
			this.anIntArray301[local13] <<= 0x2;
			this.anIntArray293[local13] <<= 0x2;
			this.anIntArray299[local13] <<= 0x2;
		}
		if (this.anInt5164 <= 0 || this.anIntArray302 == null) {
			return;
		}
		for (@Pc(55) int local55 = 0; local55 < this.anIntArray302.length; local55++) {
			this.anIntArray302[local55] <<= 0x2;
			this.anIntArray294[local55] <<= 0x2;
			if (this.aByteArray52[local55] != 1) {
				this.anIntArray303[local55] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IIII)V")
	public void method4358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5171; local7++) {
			this.anIntArray301[local7] += arg0;
			this.anIntArray293[local7] += arg1;
			this.anIntArray299[local7] += arg2;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(SIS)V")
	public void method4359(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray75 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt5154; local11++) {
			if (arg1 == this.aShortArray75[local11]) {
				this.aShortArray75[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(SLclient!id;BI)I")
	private int method4360(@OriginalArg(0) short arg0, @OriginalArg(1) Class142 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray301[arg2];
		@Pc(15) int local15 = arg1.anIntArray293[arg2];
		@Pc(20) int local20 = arg1.anIntArray299[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5171; local22++) {
			if (local10 == this.anIntArray301[local22] && this.anIntArray293[local22] == local15 && local20 == this.anIntArray299[local22]) {
				this.aShortArray72[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray301[this.anInt5171] = local10;
		this.anIntArray293[this.anInt5171] = local15;
		this.anIntArray299[this.anInt5171] = local20;
		this.aShortArray72[this.anInt5171] = arg0;
		this.anIntArray297[this.anInt5171] = arg1.anIntArray297 == null ? -1 : arg1.anIntArray297[arg2];
		return this.anInt5171++;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BZ)V")
	private void method4361(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub15 local10 = new Class3_Sub15(arg0);
		@Pc(15) Class3_Sub15 local15 = new Class3_Sub15(arg0);
		@Pc(20) Class3_Sub15 local20 = new Class3_Sub15(arg0);
		@Pc(25) Class3_Sub15 local25 = new Class3_Sub15(arg0);
		@Pc(30) Class3_Sub15 local30 = new Class3_Sub15(arg0);
		@Pc(35) Class3_Sub15 local35 = new Class3_Sub15(arg0);
		@Pc(40) Class3_Sub15 local40 = new Class3_Sub15(arg0);
		local10.anInt10282 = arg0.length - 23;
		this.anInt5171 = local10.method8414();
		this.anInt5154 = local10.method8414();
		this.anInt5164 = local10.method8401();
		@Pc(65) int local65 = local10.method8401();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(107) boolean local107 = (local65 & 0x8) == 8;
		if (local107) {
			local10.anInt10282 -= 7;
			this.anInt5151 = local10.method8401();
			local10.anInt10282 += 6;
		}
		@Pc(130) int local130 = local10.method8401();
		@Pc(134) int local134 = local10.method8401();
		@Pc(138) int local138 = local10.method8401();
		@Pc(142) int local142 = local10.method8401();
		@Pc(146) int local146 = local10.method8401();
		@Pc(150) int local150 = local10.method8414();
		@Pc(154) int local154 = local10.method8414();
		@Pc(158) int local158 = local10.method8414();
		@Pc(162) int local162 = local10.method8414();
		@Pc(166) int local166 = local10.method8414();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(185) int local185;
		if (this.anInt5164 > 0) {
			local10.anInt10282 = 0;
			this.aByteArray52 = new byte[this.anInt5164];
			for (local185 = 0; local185 < this.anInt5164; local185++) {
				@Pc(196) byte local196 = this.aByteArray52[local185] = local10.method8440();
				if (local196 == 0) {
					local168++;
				}
				if (local196 >= 1 && local196 <= 3) {
					local170++;
				}
				if (local196 == 2) {
					local172++;
				}
			}
		}
		local185 = this.anInt5164;
		@Pc(231) int local231 = local185;
		local185 += this.anInt5171;
		@Pc(238) int local238 = local185;
		if (local76) {
			local185 += this.anInt5154;
		}
		@Pc(247) int local247 = local185;
		local185 += this.anInt5154;
		@Pc(254) int local254 = local185;
		if (local130 == 255) {
			local185 += this.anInt5154;
		}
		@Pc(264) int local264 = local185;
		if (local138 == 1) {
			local185 += this.anInt5154;
		}
		@Pc(276) int local276 = local185;
		if (local146 == 1) {
			local185 += this.anInt5171;
		}
		@Pc(286) int local286 = local185;
		if (local134 == 1) {
			local185 += this.anInt5154;
		}
		@Pc(298) int local298 = local185;
		local185 += local162;
		@Pc(304) int local304 = local185;
		if (local142 == 1) {
			local185 += this.anInt5154 * 2;
		}
		@Pc(316) int local316 = local185;
		local185 += local166;
		@Pc(322) int local322 = local185;
		local185 += this.anInt5154 * 2;
		@Pc(331) int local331 = local185;
		local185 += local150;
		@Pc(337) int local337 = local185;
		local185 += local154;
		@Pc(343) int local343 = local185;
		local185 += local158;
		@Pc(349) int local349 = local185;
		local185 += local168 * 6;
		@Pc(357) int local357 = local185;
		local185 += local170 * 6;
		@Pc(365) byte local365 = 6;
		if (this.anInt5151 == 14) {
			local365 = 7;
		} else if (this.anInt5151 >= 15) {
			local365 = 9;
		}
		@Pc(383) int local383 = local185;
		local185 += local170 * local365;
		@Pc(391) int local391 = local185;
		local185 += local170;
		@Pc(397) int local397 = local185;
		local185 += local170;
		@Pc(403) int local403 = local185;
		local185 += local170 + local172 * 2;
		if (local130 == 255) {
			this.aByteArray53 = new byte[this.anInt5154];
		} else {
			this.aByte59 = (byte) local130;
		}
		this.aShortArray68 = new short[this.anInt5154];
		if (local142 == 1 && this.anInt5164 > 0) {
			this.aByteArray56 = new byte[this.anInt5154];
		}
		if (local146 == 1) {
			this.anIntArray297 = new int[this.anInt5171];
		}
		this.aShortArray73 = new short[this.anInt5154];
		this.aShortArray70 = new short[this.anInt5154];
		if (local138 == 1) {
			this.anIntArray298 = new int[this.anInt5154];
		}
		this.anIntArray299 = new int[this.anInt5171];
		local10.anInt10282 = local231;
		this.anIntArray301 = new int[this.anInt5171];
		this.aShortArray74 = new short[this.anInt5154];
		if (this.anInt5164 > 0) {
			this.aShortArray67 = new short[this.anInt5164];
			this.aShortArray66 = new short[this.anInt5164];
			if (local172 > 0) {
				this.anIntArray296 = new int[local172];
				this.anIntArray300 = new int[local172];
			}
			this.aShortArray69 = new short[this.anInt5164];
			if (local170 > 0) {
				this.anIntArray303 = new int[local170];
				this.anIntArray302 = new int[local170];
				this.anIntArray294 = new int[local170];
				this.anIntArray295 = new int[local170];
				this.aByteArray57 = new byte[local170];
				this.aByteArray55 = new byte[local170];
			}
		}
		if (local76) {
			this.aByteArray54 = new byte[this.anInt5154];
		}
		if (local134 == 1) {
			this.aByteArray51 = new byte[this.anInt5154];
		}
		this.anIntArray293 = new int[this.anInt5171];
		if (local142 == 1) {
			this.aShortArray75 = new short[this.anInt5154];
		}
		local15.anInt10282 = local331;
		local20.anInt10282 = local337;
		local25.anInt10282 = local343;
		local30.anInt10282 = local276;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(599) int local599 = 0;
		@Pc(607) int local607;
		for (@Pc(601) int local601 = 0; local601 < this.anInt5171; local601++) {
			local607 = local10.method8401();
			@Pc(609) int local609 = 0;
			if ((local607 & 0x1) != 0) {
				local609 = local15.method8435();
			}
			@Pc(619) int local619 = 0;
			if ((local607 & 0x2) != 0) {
				local619 = local20.method8435();
			}
			@Pc(632) int local632 = 0;
			if ((local607 & 0x4) != 0) {
				local632 = local25.method8435();
			}
			this.anIntArray301[local601] = local609 + local595;
			this.anIntArray293[local601] = local619 + local597;
			this.anIntArray299[local601] = local599 + local632;
			local597 = this.anIntArray293[local601];
			local595 = this.anIntArray301[local601];
			local599 = this.anIntArray299[local601];
			if (local146 == 1) {
				this.anIntArray297[local601] = local30.method8401();
			}
		}
		local10.anInt10282 = local322;
		local15.anInt10282 = local238;
		local20.anInt10282 = local254;
		local25.anInt10282 = local286;
		local30.anInt10282 = local264;
		local35.anInt10282 = local304;
		local40.anInt10282 = local316;
		for (local607 = 0; local607 < this.anInt5154; local607++) {
			this.aShortArray70[local607] = (short) local10.method8414();
			if (local76) {
				this.aByteArray54[local607] = local15.method8440();
			}
			if (local130 == 255) {
				this.aByteArray53[local607] = local20.method8440();
			}
			if (local134 == 1) {
				this.aByteArray51[local607] = local25.method8440();
			}
			if (local138 == 1) {
				this.anIntArray298[local607] = local30.method8401();
			}
			if (local142 == 1) {
				this.aShortArray75[local607] = (short) (local35.method8414() - 1);
			}
			if (this.aByteArray56 != null) {
				if (this.aShortArray75[local607] == -1) {
					this.aByteArray56[local607] = -1;
				} else {
					this.aByteArray56[local607] = (byte) (local40.method8401() - 1);
				}
			}
		}
		local10.anInt10282 = local298;
		this.anInt5152 = -1;
		local15.anInt10282 = local247;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(836) short local836 = 0;
		@Pc(838) short local838 = 0;
		@Pc(846) int local846;
		for (@Pc(840) int local840 = 0; local840 < this.anInt5154; local840++) {
			local846 = local15.method8401();
			if (local846 == 1) {
				local832 = (short) (local10.method8435() + local838);
				local834 = (short) (local10.method8435() + local832);
				local836 = (short) (local10.method8435() + local834);
				this.aShortArray68[local840] = local832;
				local838 = local836;
				this.aShortArray74[local840] = local834;
				this.aShortArray73[local840] = local836;
				if (this.anInt5152 < local832) {
					this.anInt5152 = local832;
				}
				if (this.anInt5152 < local834) {
					this.anInt5152 = local834;
				}
				if (this.anInt5152 < local836) {
					this.anInt5152 = local836;
				}
			}
			if (local846 == 2) {
				local834 = local836;
				local836 = (short) (local10.method8435() + local838);
				this.aShortArray68[local840] = local832;
				local838 = local836;
				this.aShortArray74[local840] = local834;
				this.aShortArray73[local840] = local836;
				if (local836 > this.anInt5152) {
					this.anInt5152 = local836;
				}
			}
			if (local846 == 3) {
				local832 = local836;
				local836 = (short) (local10.method8435() + local838);
				local838 = local836;
				this.aShortArray68[local840] = local832;
				this.aShortArray74[local840] = local834;
				this.aShortArray73[local840] = local836;
				if (this.anInt5152 < local836) {
					this.anInt5152 = local836;
				}
			}
			if (local846 == 4) {
				@Pc(997) short local997 = local832;
				local832 = local834;
				local836 = (short) (local10.method8435() + local838);
				local834 = local997;
				this.aShortArray68[local840] = local832;
				local838 = local836;
				this.aShortArray74[local840] = local997;
				this.aShortArray73[local840] = local836;
				if (local836 > this.anInt5152) {
					this.anInt5152 = local836;
				}
			}
		}
		local10.anInt10282 = local349;
		this.anInt5152++;
		local15.anInt10282 = local357;
		local20.anInt10282 = local383;
		local25.anInt10282 = local391;
		local30.anInt10282 = local397;
		local35.anInt10282 = local403;
		@Pc(1080) int local1080;
		for (local846 = 0; local846 < this.anInt5164; local846++) {
			local1080 = this.aByteArray52[local846] & 0xFF;
			if (local1080 == 0) {
				this.aShortArray67[local846] = (short) local10.method8414();
				this.aShortArray66[local846] = (short) local10.method8414();
				this.aShortArray69[local846] = (short) local10.method8414();
			}
			if (local1080 == 1) {
				this.aShortArray67[local846] = (short) local15.method8414();
				this.aShortArray66[local846] = (short) local15.method8414();
				this.aShortArray69[local846] = (short) local15.method8414();
				if (this.anInt5151 < 15) {
					this.anIntArray302[local846] = local20.method8414();
					if (this.anInt5151 < 14) {
						this.anIntArray294[local846] = local20.method8414();
					} else {
						this.anIntArray294[local846] = local20.method8421();
					}
					this.anIntArray303[local846] = local20.method8414();
				} else {
					this.anIntArray302[local846] = local20.method8421();
					this.anIntArray294[local846] = local20.method8421();
					this.anIntArray303[local846] = local20.method8421();
				}
				this.aByteArray57[local846] = local25.method8440();
				this.aByteArray55[local846] = local30.method8440();
				this.anIntArray295[local846] = local35.method8440();
			}
			if (local1080 == 2) {
				this.aShortArray67[local846] = (short) local15.method8414();
				this.aShortArray66[local846] = (short) local15.method8414();
				this.aShortArray69[local846] = (short) local15.method8414();
				if (this.anInt5151 < 15) {
					this.anIntArray302[local846] = local20.method8414();
					if (this.anInt5151 >= 14) {
						this.anIntArray294[local846] = local20.method8421();
					} else {
						this.anIntArray294[local846] = local20.method8414();
					}
					this.anIntArray303[local846] = local20.method8414();
				} else {
					this.anIntArray302[local846] = local20.method8421();
					this.anIntArray294[local846] = local20.method8421();
					this.anIntArray303[local846] = local20.method8421();
				}
				this.aByteArray57[local846] = local25.method8440();
				this.aByteArray55[local846] = local30.method8440();
				this.anIntArray295[local846] = local35.method8440();
				this.anIntArray300[local846] = local35.method8440();
				this.anIntArray296[local846] = local35.method8440();
			}
			if (local1080 == 3) {
				this.aShortArray67[local846] = (short) local15.method8414();
				this.aShortArray66[local846] = (short) local15.method8414();
				this.aShortArray69[local846] = (short) local15.method8414();
				if (this.anInt5151 < 15) {
					this.anIntArray302[local846] = local20.method8414();
					if (this.anInt5151 >= 14) {
						this.anIntArray294[local846] = local20.method8421();
					} else {
						this.anIntArray294[local846] = local20.method8414();
					}
					this.anIntArray303[local846] = local20.method8414();
				} else {
					this.anIntArray302[local846] = local20.method8421();
					this.anIntArray294[local846] = local20.method8421();
					this.anIntArray303[local846] = local20.method8421();
				}
				this.aByteArray57[local846] = local25.method8440();
				this.aByteArray55[local846] = local30.method8440();
				this.anIntArray295[local846] = local35.method8440();
			}
		}
		local10.anInt10282 = local185;
		@Pc(1482) int local1482;
		@Pc(1488) int local1488;
		@Pc(1492) int local1492;
		@Pc(1559) int local1559;
		if (local85) {
			local1080 = local10.method8401();
			if (local1080 > 0) {
				this.aClass18Array4 = new Class18[local1080];
				for (local1482 = 0; local1482 < local1080; local1482++) {
					local1488 = local10.method8414();
					local1492 = local10.method8414();
					@Pc(1500) byte local1500;
					if (local130 == 255) {
						local1500 = this.aByteArray53[local1492];
					} else {
						local1500 = (byte) local130;
					}
					this.aClass18Array4[local1482] = new Class18(local1488, this.aShortArray68[local1492], this.aShortArray74[local1492], this.aShortArray73[local1492], local1500);
				}
			}
			local1482 = local10.method8401();
			if (local1482 > 0) {
				this.aClass215Array4 = new Class215[local1482];
				for (local1488 = 0; local1488 < local1482; local1488++) {
					local1492 = local10.method8414();
					local1559 = local10.method8414();
					this.aClass215Array4[local1488] = new Class215(local1492, local1559);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1080 = local10.method8401();
		if (local1080 <= 0) {
			return;
		}
		this.aClass223Array1 = new Class223[local1080];
		for (local1482 = 0; local1482 < local1080; local1482++) {
			local1488 = local10.method8414();
			local1492 = local10.method8414();
			local1559 = local10.method8401();
			@Pc(1608) byte local1608 = local10.method8440();
			this.aClass223Array1[local1482] = new Class223(local1488, local1492, local1559, local1608);
		}
		return;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)[[I")
	public int[][] method4363(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt5171 : this.anInt5152;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray297[local20];
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
		for (@Pc(74) int local74 = 0; local74 < local18; local74++) {
			@Pc(81) int local81 = this.anIntArray297[local74];
			if (local81 >= 0) {
				local53[local81][local8[local81]++] = local74;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)[[I")
	public int[][] method4364() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass223Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass223Array1[local12].anInt6987;
			if (local20 >= 0) {
				if (local20 > local10) {
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
		for (@Pc(81) int local81 = 0; local81 < this.aClass223Array1.length; local81++) {
			@Pc(89) int local89 = this.aClass223Array1[local81].anInt6987;
			if (local89 >= 0) {
				local52[local89][local8[local89]++] = local81;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(SIBBISIBI)I")
	public int method4365(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) short arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray68[this.anInt5154] = (short) arg7;
		this.aShortArray74[this.anInt5154] = (short) arg1;
		this.aShortArray73[this.anInt5154] = (short) arg5;
		this.aByteArray54[this.anInt5154] = arg2;
		this.aByteArray56[this.anInt5154] = arg6;
		this.aShortArray70[this.anInt5154] = arg4;
		this.aByteArray51[this.anInt5154] = arg3;
		this.aShortArray75[this.anInt5154] = arg0;
		return this.anInt5154++;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(IIII)V")
	public void method4366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(26) int local26;
		@Pc(44) int local44;
		if (arg1 != 0) {
			local20 = Class3_Sub1_Sub2.anIntArray84[arg1];
			local24 = Class3_Sub1_Sub2.anIntArray85[arg1];
			for (local26 = 0; local26 < this.anInt5171; local26++) {
				local44 = this.anIntArray301[local26] * local24 + local20 * this.anIntArray293[local26] >> 14;
				this.anIntArray293[local26] = this.anIntArray293[local26] * local24 - this.anIntArray301[local26] * local20 >> 14;
				this.anIntArray301[local26] = local44;
			}
		}
		if (arg0 != 0) {
			local20 = Class3_Sub1_Sub2.anIntArray84[arg0];
			local24 = Class3_Sub1_Sub2.anIntArray85[arg0];
			for (local26 = 0; local26 < this.anInt5171; local26++) {
				local44 = local24 * this.anIntArray293[local26] - local20 * this.anIntArray299[local26] >> 14;
				this.anIntArray299[local26] = this.anIntArray299[local26] * local24 + local20 * this.anIntArray293[local26] >> 14;
				this.anIntArray293[local26] = local44;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local20 = Class3_Sub1_Sub2.anIntArray84[arg2];
		local24 = Class3_Sub1_Sub2.anIntArray85[arg2];
		for (local26 = 0; local26 < this.anInt5171; local26++) {
			local44 = this.anIntArray301[local26] * local24 + this.anIntArray299[local26] * local20 >> 14;
			this.anIntArray299[local26] = local24 * this.anIntArray299[local26] - this.anIntArray301[local26] * local20 >> 14;
			this.anIntArray301[local26] = local44;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(SBISSBSSSB)B")
	public byte method4368() {
		if (this.anInt5164 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray52[this.anInt5164] = 3;
		this.aShortArray67[this.anInt5164] = 0;
		this.aShortArray66[this.anInt5164] = 32767;
		this.aShortArray69[this.anInt5164] = 0;
		this.anIntArray302[this.anInt5164] = 1024;
		this.anIntArray294[this.anInt5164] = 1024;
		this.anIntArray303[this.anInt5164] = 1024;
		this.aByteArray57[this.anInt5164] = 0;
		this.aByteArray55[this.anInt5164] = 0;
		this.anIntArray295[this.anInt5164] = 0;
		return (byte) this.anInt5164++;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ISS)V")
	public void method4371(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5154; local3++) {
			if (arg0 == this.aShortArray70[local3]) {
				this.aShortArray70[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BB)V")
	private void method4372(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub15 local14 = new Class3_Sub15(arg0);
		@Pc(19) Class3_Sub15 local19 = new Class3_Sub15(arg0);
		@Pc(24) Class3_Sub15 local24 = new Class3_Sub15(arg0);
		@Pc(29) Class3_Sub15 local29 = new Class3_Sub15(arg0);
		@Pc(34) Class3_Sub15 local34 = new Class3_Sub15(arg0);
		local14.anInt10282 = arg0.length - 18;
		this.anInt5171 = local14.method8414();
		this.anInt5154 = local14.method8414();
		this.anInt5164 = local14.method8401();
		@Pc(59) int local59 = local14.method8401();
		@Pc(63) int local63 = local14.method8401();
		@Pc(69) int local69 = local14.method8401();
		@Pc(75) int local75 = local14.method8401();
		@Pc(79) int local79 = local14.method8401();
		@Pc(83) int local83 = local14.method8414();
		@Pc(87) int local87 = local14.method8414();
		@Pc(91) int local91 = local14.method8414();
		@Pc(95) int local95 = local14.method8414();
		@Pc(104) int local104 = this.anInt5171;
		@Pc(106) int local106 = local104;
		local104 += this.anInt5154;
		@Pc(113) int local113 = local104;
		if (local63 == 255) {
			local104 += this.anInt5154;
		}
		@Pc(125) int local125 = local104;
		if (local75 == 1) {
			local104 += this.anInt5154;
		}
		@Pc(135) int local135 = local104;
		if (local59 == 1) {
			local104 += this.anInt5154;
		}
		@Pc(145) int local145 = local104;
		if (local79 == 1) {
			local104 += this.anInt5171;
		}
		@Pc(155) int local155 = local104;
		if (local69 == 1) {
			local104 += this.anInt5154;
		}
		@Pc(167) int local167 = local104;
		local104 += local95;
		@Pc(173) int local173 = local104;
		local104 += this.anInt5154 * 2;
		@Pc(197) int local197 = local104;
		local104 += this.anInt5164 * 6;
		@Pc(206) int local206 = local104;
		local104 += local83;
		@Pc(212) int local212 = local104;
		local104 += local87;
		this.anIntArray299 = new int[this.anInt5171];
		this.aShortArray68 = new short[this.anInt5154];
		if (this.anInt5164 > 0) {
			this.aShortArray67 = new short[this.anInt5164];
			this.aShortArray69 = new short[this.anInt5164];
			this.aByteArray52 = new byte[this.anInt5164];
			this.aShortArray66 = new short[this.anInt5164];
		}
		if (local79 == 1) {
			this.anIntArray297 = new int[this.anInt5171];
		}
		if (local75 == 1) {
			this.anIntArray298 = new int[this.anInt5154];
		}
		this.aShortArray70 = new short[this.anInt5154];
		if (local63 == 255) {
			this.aByteArray53 = new byte[this.anInt5154];
		} else {
			this.aByte59 = (byte) local63;
		}
		this.anIntArray293 = new int[this.anInt5171];
		this.aShortArray74 = new short[this.anInt5154];
		if (local69 == 1) {
			this.aByteArray51 = new byte[this.anInt5154];
		}
		local14.anInt10282 = 0;
		this.anIntArray301 = new int[this.anInt5171];
		if (local59 == 1) {
			this.aShortArray75 = new short[this.anInt5154];
			this.aByteArray54 = new byte[this.anInt5154];
			this.aByteArray56 = new byte[this.anInt5154];
		}
		this.aShortArray73 = new short[this.anInt5154];
		local19.anInt10282 = local206;
		local24.anInt10282 = local212;
		local29.anInt10282 = local104;
		local34.anInt10282 = local145;
		@Pc(362) int local362 = 0;
		@Pc(364) int local364 = 0;
		@Pc(366) int local366 = 0;
		@Pc(376) int local376;
		@Pc(378) int local378;
		for (@Pc(368) int local368 = 0; local368 < this.anInt5171; local368++) {
			local376 = local14.method8401();
			local378 = 0;
			if ((local376 & 0x1) != 0) {
				local378 = local19.method8435();
			}
			@Pc(393) int local393 = 0;
			if ((local376 & 0x2) != 0) {
				local393 = local24.method8435();
			}
			@Pc(403) int local403 = 0;
			if ((local376 & 0x4) != 0) {
				local403 = local29.method8435();
			}
			this.anIntArray301[local368] = local378 + local362;
			this.anIntArray293[local368] = local393 + local364;
			this.anIntArray299[local368] = local403 + local366;
			local362 = this.anIntArray301[local368];
			local366 = this.anIntArray299[local368];
			local364 = this.anIntArray293[local368];
			if (local79 == 1) {
				this.anIntArray297[local368] = local34.method8401();
			}
		}
		local14.anInt10282 = local173;
		local19.anInt10282 = local135;
		local24.anInt10282 = local113;
		local29.anInt10282 = local155;
		local34.anInt10282 = local125;
		for (local376 = 0; local376 < this.anInt5154; local376++) {
			this.aShortArray70[local376] = (short) local14.method8414();
			if (local59 == 1) {
				local378 = local19.method8401();
				if ((local378 & 0x1) == 1) {
					local7 = true;
					this.aByteArray54[local376] = 1;
				} else {
					this.aByteArray54[local376] = 0;
				}
				if ((local378 & 0x2) == 2) {
					this.aByteArray56[local376] = (byte) (local378 >> 2);
					this.aShortArray75[local376] = this.aShortArray70[local376];
					this.aShortArray70[local376] = 127;
					if (this.aShortArray75[local376] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray56[local376] = -1;
					this.aShortArray75[local376] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray53[local376] = local24.method8440();
			}
			if (local69 == 1) {
				this.aByteArray51[local376] = local29.method8440();
			}
			if (local75 == 1) {
				this.anIntArray298[local376] = local34.method8401();
			}
		}
		this.anInt5152 = -1;
		local14.anInt10282 = local167;
		local19.anInt10282 = local106;
		@Pc(621) short local621 = 0;
		@Pc(623) short local623 = 0;
		@Pc(625) short local625 = 0;
		@Pc(627) short local627 = 0;
		@Pc(635) int local635;
		for (@Pc(629) int local629 = 0; local629 < this.anInt5154; local629++) {
			local635 = local19.method8401();
			if (local635 == 1) {
				local621 = (short) (local627 + local14.method8435());
				local623 = (short) (local621 + local14.method8435());
				local625 = (short) (local14.method8435() + local623);
				this.aShortArray68[local629] = local621;
				local627 = local625;
				this.aShortArray74[local629] = local623;
				this.aShortArray73[local629] = local625;
				if (this.anInt5152 < local621) {
					this.anInt5152 = local621;
				}
				if (local623 > this.anInt5152) {
					this.anInt5152 = local623;
				}
				if (local625 > this.anInt5152) {
					this.anInt5152 = local625;
				}
			}
			if (local635 == 2) {
				local623 = local625;
				local625 = (short) (local14.method8435() + local627);
				local627 = local625;
				this.aShortArray68[local629] = local621;
				this.aShortArray74[local629] = local623;
				this.aShortArray73[local629] = local625;
				if (this.anInt5152 < local625) {
					this.anInt5152 = local625;
				}
			}
			if (local635 == 3) {
				local621 = local625;
				local625 = (short) (local14.method8435() + local627);
				this.aShortArray68[local629] = local621;
				local627 = local625;
				this.aShortArray74[local629] = local623;
				this.aShortArray73[local629] = local625;
				if (local625 > this.anInt5152) {
					this.anInt5152 = local625;
				}
			}
			if (local635 == 4) {
				@Pc(792) short local792 = local621;
				local621 = local623;
				local625 = (short) (local627 + local14.method8435());
				local623 = local792;
				this.aShortArray68[local629] = local621;
				local627 = local625;
				this.aShortArray74[local629] = local792;
				this.aShortArray73[local629] = local625;
				if (local625 > this.anInt5152) {
					this.anInt5152 = local625;
				}
			}
		}
		this.anInt5152++;
		local14.anInt10282 = local197;
		for (local635 = 0; local635 < this.anInt5164; local635++) {
			this.aByteArray52[local635] = 0;
			this.aShortArray67[local635] = (short) local14.method8414();
			this.aShortArray66[local635] = (short) local14.method8414();
			this.aShortArray69[local635] = (short) local14.method8414();
		}
		if (this.aByteArray56 != null) {
			@Pc(894) boolean local894 = false;
			for (@Pc(896) int local896 = 0; local896 < this.anInt5154; local896++) {
				@Pc(905) int local905 = this.aByteArray56[local896] & 0xFF;
				if (local905 != 255) {
					if (this.aShortArray68[local896] == (this.aShortArray67[local905] & 0xFFFF) && (this.aShortArray66[local905] & 0xFFFF) == this.aShortArray74[local896] && (this.aShortArray69[local905] & 0xFFFF) == this.aShortArray73[local896]) {
						this.aByteArray56[local896] = -1;
					} else {
						local894 = true;
					}
				}
			}
			if (!local894) {
				this.aByteArray56 = null;
			}
		}
		if (!local9) {
			this.aShortArray75 = null;
		}
		if (!local7) {
			this.aByteArray54 = null;
		}
	}
}
