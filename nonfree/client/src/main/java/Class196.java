import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class196 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public int anInt5513;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public int anInt5514;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	public int anInt5515;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "I")
	public int anInt5516;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public int anInt5517;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	public int anInt5518;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()[I")
	public int[] method4743() {
		@Pc(2) int local2 = this.method4755();
		@Pc(8) int[] local8 = new int[local2 * this.method4744()];
		@Pc(13) int local13;
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(31) int local31;
		if (this.aByteArray67 == null) {
			for (local13 = 0; local13 < this.anInt5517; local13++) {
				local19 = local13 * this.anInt5516;
				local29 = this.anInt5514 + (local13 + this.anInt5515) * local2;
				for (local31 = 0; local31 < this.anInt5516; local31++) {
					@Pc(96) int local96 = this.anIntArray509[this.aByteArray68[local19++] & 0xFF];
					if (local96 == 0) {
						local8[local29++] = 0;
					} else {
						local8[local29++] = local96 | 0xFF000000;
					}
				}
			}
		} else {
			for (local13 = 0; local13 < this.anInt5517; local13++) {
				local19 = local13 * this.anInt5516;
				local29 = this.anInt5514 + (local13 + this.anInt5515) * local2;
				for (local31 = 0; local31 < this.anInt5516; local31++) {
					local8[local29++] = this.aByteArray67[local19] << 24 | this.anIntArray509[this.aByteArray68[local19] & 0xFF];
					local19++;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()I")
	public int method4744() {
		return this.anInt5517 + this.anInt5515 + this.anInt5513;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "()V")
	public void method4746() {
		@Pc(2) byte[] local2 = this.aByteArray68;
		@Pc(37) byte local37;
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (this.aByteArray67 == null) {
			for (local12 = (this.anInt5517 >> 1) - 1; local12 >= 0; local12--) {
				local18 = local12 * this.anInt5516;
				local28 = (this.anInt5517 - local12 - 1) * this.anInt5516;
				for (local32 = -this.anInt5516; local32 < 0; local32++) {
					local37 = local2[local18];
					local2[local18] = local2[local28];
					local2[local28] = local37;
					local18++;
					local28++;
				}
			}
		} else {
			@Pc(59) byte[] local59 = this.aByteArray67;
			for (local18 = (this.anInt5517 >> 1) - 1; local18 >= 0; local18--) {
				local28 = local18 * this.anInt5516;
				local32 = (this.anInt5517 - local18 - 1) * this.anInt5516;
				for (@Pc(86) int local86 = -this.anInt5516; local86 < 0; local86++) {
					local37 = local2[local28];
					local2[local28] = local2[local32];
					local2[local32] = local37;
					local37 = local59[local28];
					local59[local28] = local59[local32];
					local59[local32] = local37;
					local28++;
					local32++;
				}
			}
		}
		local12 = this.anInt5515;
		this.anInt5515 = this.anInt5513;
		this.anInt5513 = local12;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public void method4749(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method4755();
		@Pc(5) int local5 = this.method4744();
		if (this.anInt5516 == local2 && this.anInt5517 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt5514) {
			local16 = this.anInt5514;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt5514 + this.anInt5516 > local2) {
			local25 = local2 - this.anInt5514 - this.anInt5516;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt5515) {
			local44 = this.anInt5515;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt5515 + this.anInt5517 > local5) {
			local53 = local5 - this.anInt5515 - this.anInt5517;
		}
		@Pc(77) int local77 = this.anInt5516 + local16 + local25;
		@Pc(84) int local84 = this.anInt5517 + local44 + local53;
		@Pc(89) byte[] local89 = new byte[local77 * local84];
		@Pc(100) int local100;
		@Pc(108) int local108;
		@Pc(110) int local110;
		if (this.aByteArray67 == null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt5517; local94++) {
				local100 = local94 * this.anInt5516;
				local108 = (local94 + local44) * local77 + local16;
				for (local110 = 0; local110 < this.anInt5516; local110++) {
					local89[local108++] = this.aByteArray68[local100++];
				}
			}
		} else {
			@Pc(136) byte[] local136 = new byte[local77 * local84];
			for (local100 = 0; local100 < this.anInt5517; local100++) {
				local108 = local100 * this.anInt5516;
				local110 = (local100 + local44) * local77 + local16;
				for (@Pc(154) int local154 = 0; local154 < this.anInt5516; local154++) {
					local136[local110] = this.aByteArray67[local108];
					local89[local110++] = this.aByteArray68[local108++];
				}
			}
			this.aByteArray67 = local136;
		}
		this.anInt5514 -= local16;
		this.anInt5515 -= local44;
		this.anInt5518 -= local25;
		this.anInt5513 -= local53;
		this.anInt5516 = local77;
		this.anInt5517 = local84;
		this.aByteArray68 = local89;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()V")
	public void method4750() {
		@Pc(6) byte[] local6 = new byte[this.anInt5516 * this.anInt5517];
		@Pc(8) int local8 = 0;
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (this.aByteArray67 == null) {
			for (local13 = 0; local13 < this.anInt5516; local13++) {
				for (local19 = this.anInt5517 - 1; local19 >= 0; local19--) {
					local6[local8++] = this.aByteArray68[local13 + local19 * this.anInt5516];
				}
			}
			this.aByteArray68 = local6;
		} else {
			@Pc(52) byte[] local52 = new byte[this.anInt5516 * this.anInt5517];
			for (local19 = 0; local19 < this.anInt5516; local19++) {
				for (@Pc(60) int local60 = this.anInt5517 - 1; local60 >= 0; local60--) {
					local6[local8] = this.aByteArray68[local19 + local60 * this.anInt5516];
					local52[local8++] = this.aByteArray67[local19 + local60 * this.anInt5516];
				}
			}
			this.aByteArray68 = local6;
			this.aByteArray67 = local52;
		}
		local13 = this.anInt5515;
		this.anInt5515 = this.anInt5514;
		this.anInt5514 = this.anInt5513;
		this.anInt5513 = this.anInt5518;
		this.anInt5518 = this.anInt5515;
		local13 = this.anInt5517;
		this.anInt5517 = this.anInt5516;
		this.anInt5516 = local13;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public void method4752(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(8) int local8;
		@Pc(69) int local69;
		@Pc(63) int local63;
		if (this.anIntArray509.length < 255) {
			for (local8 = 0; local8 < this.anIntArray509.length; local8++) {
				if (this.anIntArray509[local8] == arg0) {
					local1 = local8;
					break;
				}
			}
			if (local1 == -1) {
				local1 = this.anIntArray509.length;
				@Pc(38) int[] local38 = new int[this.anIntArray509.length + 1];
				Static585.method3077(this.anIntArray509, 0, local38, 0, this.anIntArray509.length);
				this.anIntArray509 = local38;
				local38[local1] = arg0;
			}
		} else {
			local8 = Integer.MAX_VALUE;
			local63 = arg0 >> 16 & 0xFF;
			local69 = arg0 >> 8 & 0xFF;
			@Pc(73) int local73 = arg0 & 0xFF;
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray509.length; local75++) {
				@Pc(81) int local81 = this.anIntArray509[local75];
				@Pc(87) int local87 = local81 >> 16 & 0xFF;
				@Pc(93) int local93 = local81 >> 8 & 0xFF;
				@Pc(97) int local97 = local81 & 0xFF;
				@Pc(101) int local101 = local63 - local87;
				if (local101 < 0) {
					local101 = -local101;
				}
				@Pc(110) int local110 = local69 - local93;
				if (local110 < 0) {
					local110 = -local110;
				}
				@Pc(119) int local119 = local73 - local97;
				if (local119 < 0) {
					local119 = -local119;
				}
				@Pc(130) int local130 = local101 + local110 + local119;
				if (local130 < local8) {
					local8 = local130;
					local1 = local75;
				}
			}
		}
		for (local8 = this.anInt5517 - 1; local8 > 0; local8--) {
			local63 = local8 * this.anInt5516;
			for (local69 = this.anInt5516 - 1; local69 > 0; local69--) {
				if (this.anIntArray509[this.aByteArray68[local69 + local63] & 0xFF] == 0 && this.anIntArray509[this.aByteArray68[local69 + local63 - this.anInt5516 - 1] & 0xFF] != 0) {
					this.aByteArray68[local69 + local63] = (byte) local1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	public void method4753(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(8) int local8;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (this.anIntArray509.length < 255) {
			for (local8 = 0; local8 < this.anIntArray509.length; local8++) {
				if (this.anIntArray509[local8] == arg0) {
					local1 = local8;
					break;
				}
			}
			if (local1 == -1) {
				local1 = this.anIntArray509.length;
				@Pc(38) int[] local38 = new int[this.anIntArray509.length + 1];
				Static585.method3077(this.anIntArray509, 0, local38, 0, this.anIntArray509.length);
				this.anIntArray509 = local38;
				local38[local1] = arg0;
			}
		} else {
			local8 = Integer.MAX_VALUE;
			@Pc(63) int local63 = arg0 >> 16 & 0xFF;
			local69 = arg0 >> 8 & 0xFF;
			local73 = arg0 & 0xFF;
			for (local75 = 0; local75 < this.anIntArray509.length; local75++) {
				@Pc(81) int local81 = this.anIntArray509[local75];
				@Pc(87) int local87 = local81 >> 16 & 0xFF;
				@Pc(93) int local93 = local81 >> 8 & 0xFF;
				@Pc(97) int local97 = local81 & 0xFF;
				@Pc(101) int local101 = local63 - local87;
				if (local101 < 0) {
					local101 = -local101;
				}
				@Pc(110) int local110 = local69 - local93;
				if (local110 < 0) {
					local110 = -local110;
				}
				@Pc(119) int local119 = local73 - local97;
				if (local119 < 0) {
					local119 = -local119;
				}
				@Pc(130) int local130 = local101 + local110 + local119;
				if (local130 < local8) {
					local8 = local130;
					local1 = local75;
				}
			}
		}
		local8 = 0;
		@Pc(152) byte[] local152 = new byte[this.anInt5516 * this.anInt5517];
		for (local69 = 0; local69 < this.anInt5517; local69++) {
			for (local73 = 0; local73 < this.anInt5516; local73++) {
				local75 = this.aByteArray68[local8] & 0xFF;
				if (this.anIntArray509[local75] == 0) {
					if (local73 > 0 && this.anIntArray509[this.aByteArray68[local8 - 1] & 0xFF] != 0) {
						local75 = local1;
					} else if (local69 > 0 && this.anIntArray509[this.aByteArray68[local8 - this.anInt5516] & 0xFF] != 0) {
						local75 = local1;
					} else if (local73 < this.anInt5516 - 1 && this.anIntArray509[this.aByteArray68[local8 + 1] & 0xFF] != 0) {
						local75 = local1;
					} else if (local69 < this.anInt5517 - 1 && this.anIntArray509[this.aByteArray68[local8 + this.anInt5516] & 0xFF] != 0) {
						local75 = local1;
					}
				}
				local152[local8++] = (byte) local75;
			}
		}
		this.aByteArray68 = local152;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "()V")
	public void method4754() {
		@Pc(2) int local2 = this.method4755();
		@Pc(5) int local5 = this.method4744();
		if (this.anInt5516 == local2 && this.anInt5517 == local5) {
			return;
		}
		@Pc(19) byte[] local19 = new byte[local2 * local5];
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (this.aByteArray67 == null) {
			for (@Pc(80) int local80 = 0; local80 < this.anInt5517; local80++) {
				local29 = local80 * this.anInt5516;
				local35 = (local80 + this.anInt5515) * local2 + this.anInt5514;
				for (local45 = 0; local45 < this.anInt5516; local45++) {
					local19[local35++] = this.aByteArray68[local29++];
				}
			}
		} else {
			@Pc(27) byte[] local27 = new byte[local2 * local5];
			for (local29 = 0; local29 < this.anInt5517; local29++) {
				local35 = local29 * this.anInt5516;
				local45 = (local29 + this.anInt5515) * local2 + this.anInt5514;
				for (@Pc(47) int local47 = 0; local47 < this.anInt5516; local47++) {
					local19[local45] = this.aByteArray68[local35];
					local27[local45++] = this.aByteArray67[local35++];
				}
			}
			this.aByteArray67 = local27;
		}
		this.anInt5514 = this.anInt5518 = this.anInt5515 = this.anInt5513 = 0;
		this.anInt5516 = local2;
		this.anInt5517 = local5;
		this.aByteArray68 = local19;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "()I")
	public int method4755() {
		return this.anInt5516 + this.anInt5514 + this.anInt5518;
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "()V")
	public void method4756() {
		@Pc(2) byte[] local2 = this.aByteArray68;
		@Pc(29) byte local29;
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(23) int local23;
		if (this.aByteArray67 == null) {
			for (local10 = this.anInt5517 - 1; local10 >= 0; local10--) {
				local16 = local10 * this.anInt5516;
				local23 = (local10 + 1) * this.anInt5516;
				while (local16 < local23) {
					local23--;
					local29 = local2[local16];
					local2[local16] = local2[local23];
					local2[local23] = local29;
					local16++;
				}
			}
		} else {
			@Pc(50) byte[] local50 = this.aByteArray67;
			for (local16 = this.anInt5517 - 1; local16 >= 0; local16--) {
				local23 = local16 * this.anInt5516;
				@Pc(68) int local68 = (local16 + 1) * this.anInt5516;
				while (local23 < local68) {
					local68--;
					local29 = local2[local23];
					local2[local23] = local2[local68];
					local2[local68] = local29;
					local29 = local50[local23];
					local50[local23] = local50[local68];
					local50[local68] = local29;
					local23++;
				}
			}
		}
		local10 = this.anInt5514;
		this.anInt5514 = this.anInt5518;
		this.anInt5518 = local10;
	}
}
