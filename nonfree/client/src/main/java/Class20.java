import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class20 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
	public int anInt704;

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
	public int anInt705;

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
	public int anInt706;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "()I")
	public int method807() {
		return this.anInt706 + this.anInt708 + this.anInt709;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "()I")
	public int method808() {
		return this.anInt707 + this.anInt705 + this.anInt704;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public void method809(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = this.method808();
		@Pc(5) int local5 = this.method807();
		if (this.anInt707 == local2 && this.anInt706 == local5) {
			return;
		}
		@Pc(16) int local16 = arg0;
		if (arg0 > this.anInt705) {
			local16 = this.anInt705;
		}
		@Pc(25) int local25 = arg0;
		if (arg0 + this.anInt705 + this.anInt707 > local2) {
			local25 = local2 - this.anInt705 - this.anInt707;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 > this.anInt708) {
			local44 = this.anInt708;
		}
		@Pc(53) int local53 = arg0;
		if (arg0 + this.anInt708 + this.anInt706 > local5) {
			local53 = local5 - this.anInt708 - this.anInt706;
		}
		@Pc(77) int local77 = this.anInt707 + local16 + local25;
		@Pc(84) int local84 = this.anInt706 + local44 + local53;
		@Pc(89) byte[] local89 = new byte[local77 * local84];
		@Pc(100) int local100;
		@Pc(108) int local108;
		@Pc(110) int local110;
		if (this.aByteArray6 == null) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt706; local94++) {
				local100 = local94 * this.anInt707;
				local108 = (local94 + local44) * local77 + local16;
				for (local110 = 0; local110 < this.anInt707; local110++) {
					local89[local108++] = this.aByteArray5[local100++];
				}
			}
		} else {
			@Pc(136) byte[] local136 = new byte[local77 * local84];
			for (local100 = 0; local100 < this.anInt706; local100++) {
				local108 = local100 * this.anInt707;
				local110 = (local100 + local44) * local77 + local16;
				for (@Pc(154) int local154 = 0; local154 < this.anInt707; local154++) {
					local136[local110] = this.aByteArray6[local108];
					local89[local110++] = this.aByteArray5[local108++];
				}
			}
			this.aByteArray6 = local136;
		}
		this.anInt705 -= local16;
		this.anInt708 -= local44;
		this.anInt704 -= local25;
		this.anInt709 -= local53;
		this.anInt707 = local77;
		this.anInt706 = local84;
		this.aByteArray5 = local89;
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "()V")
	public void method810() {
		@Pc(2) byte[] local2 = this.aByteArray5;
		@Pc(37) byte local37;
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (this.aByteArray6 == null) {
			for (local12 = (this.anInt706 >> 1) - 1; local12 >= 0; local12--) {
				local18 = local12 * this.anInt707;
				local28 = (this.anInt706 - local12 - 1) * this.anInt707;
				for (local32 = -this.anInt707; local32 < 0; local32++) {
					local37 = local2[local18];
					local2[local18] = local2[local28];
					local2[local28] = local37;
					local18++;
					local28++;
				}
			}
		} else {
			@Pc(59) byte[] local59 = this.aByteArray6;
			for (local18 = (this.anInt706 >> 1) - 1; local18 >= 0; local18--) {
				local28 = local18 * this.anInt707;
				local32 = (this.anInt706 - local18 - 1) * this.anInt707;
				for (@Pc(86) int local86 = -this.anInt707; local86 < 0; local86++) {
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
		local12 = this.anInt708;
		this.anInt708 = this.anInt709;
		this.anInt709 = local12;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
	public void method811(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(8) int local8;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (this.anIntArray22.length < 255) {
			for (local8 = 0; local8 < this.anIntArray22.length; local8++) {
				if (this.anIntArray22[local8] == arg0) {
					local1 = local8;
					break;
				}
			}
			if (local1 == -1) {
				local1 = this.anIntArray22.length;
				@Pc(38) int[] local38 = new int[this.anIntArray22.length + 1];
				Static602.method4669(this.anIntArray22, 0, local38, 0, this.anIntArray22.length);
				this.anIntArray22 = local38;
				local38[local1] = arg0;
			}
		} else {
			local8 = Integer.MAX_VALUE;
			@Pc(63) int local63 = arg0 >> 16 & 0xFF;
			local69 = arg0 >> 8 & 0xFF;
			local73 = arg0 & 0xFF;
			for (local75 = 0; local75 < this.anIntArray22.length; local75++) {
				@Pc(81) int local81 = this.anIntArray22[local75];
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
		@Pc(152) byte[] local152 = new byte[this.anInt707 * this.anInt706];
		for (local69 = 0; local69 < this.anInt706; local69++) {
			for (local73 = 0; local73 < this.anInt707; local73++) {
				local75 = this.aByteArray5[local8] & 0xFF;
				if (this.anIntArray22[local75] == 0) {
					if (local73 > 0 && this.anIntArray22[this.aByteArray5[local8 - 1] & 0xFF] != 0) {
						local75 = local1;
					} else if (local69 > 0 && this.anIntArray22[this.aByteArray5[local8 - this.anInt707] & 0xFF] != 0) {
						local75 = local1;
					} else if (local73 < this.anInt707 - 1 && this.anIntArray22[this.aByteArray5[local8 + 1] & 0xFF] != 0) {
						local75 = local1;
					} else if (local69 < this.anInt706 - 1 && this.anIntArray22[this.aByteArray5[local8 + this.anInt707] & 0xFF] != 0) {
						local75 = local1;
					}
				}
				local152[local8++] = (byte) local75;
			}
		}
		this.aByteArray5 = local152;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "()[I")
	public int[] method812() {
		@Pc(2) int local2 = this.method808();
		@Pc(8) int[] local8 = new int[local2 * this.method807()];
		@Pc(13) int local13;
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(31) int local31;
		if (this.aByteArray6 == null) {
			for (local13 = 0; local13 < this.anInt706; local13++) {
				local19 = local13 * this.anInt707;
				local29 = this.anInt705 + (local13 + this.anInt708) * local2;
				for (local31 = 0; local31 < this.anInt707; local31++) {
					@Pc(96) int local96 = this.anIntArray22[this.aByteArray5[local19++] & 0xFF];
					if (local96 == 0) {
						local8[local29++] = 0;
					} else {
						local8[local29++] = local96 | 0xFF000000;
					}
				}
			}
		} else {
			for (local13 = 0; local13 < this.anInt706; local13++) {
				local19 = local13 * this.anInt707;
				local29 = this.anInt705 + (local13 + this.anInt708) * local2;
				for (local31 = 0; local31 < this.anInt707; local31++) {
					local8[local29++] = this.aByteArray6[local19] << 24 | this.anIntArray22[this.aByteArray5[local19] & 0xFF];
					local19++;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "()V")
	public void method815() {
		@Pc(2) byte[] local2 = this.aByteArray5;
		@Pc(29) byte local29;
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(23) int local23;
		if (this.aByteArray6 == null) {
			for (local10 = this.anInt706 - 1; local10 >= 0; local10--) {
				local16 = local10 * this.anInt707;
				local23 = (local10 + 1) * this.anInt707;
				while (local16 < local23) {
					local23--;
					local29 = local2[local16];
					local2[local16] = local2[local23];
					local2[local23] = local29;
					local16++;
				}
			}
		} else {
			@Pc(50) byte[] local50 = this.aByteArray6;
			for (local16 = this.anInt706 - 1; local16 >= 0; local16--) {
				local23 = local16 * this.anInt707;
				@Pc(68) int local68 = (local16 + 1) * this.anInt707;
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
		local10 = this.anInt705;
		this.anInt705 = this.anInt704;
		this.anInt704 = local10;
	}

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "()V")
	public void method816() {
		@Pc(2) int local2 = this.method808();
		@Pc(5) int local5 = this.method807();
		if (this.anInt707 == local2 && this.anInt706 == local5) {
			return;
		}
		@Pc(19) byte[] local19 = new byte[local2 * local5];
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (this.aByteArray6 == null) {
			for (@Pc(80) int local80 = 0; local80 < this.anInt706; local80++) {
				local29 = local80 * this.anInt707;
				local35 = (local80 + this.anInt708) * local2 + this.anInt705;
				for (local45 = 0; local45 < this.anInt707; local45++) {
					local19[local35++] = this.aByteArray5[local29++];
				}
			}
		} else {
			@Pc(27) byte[] local27 = new byte[local2 * local5];
			for (local29 = 0; local29 < this.anInt706; local29++) {
				local35 = local29 * this.anInt707;
				local45 = (local29 + this.anInt708) * local2 + this.anInt705;
				for (@Pc(47) int local47 = 0; local47 < this.anInt707; local47++) {
					local19[local45] = this.aByteArray5[local35];
					local27[local45++] = this.aByteArray6[local35++];
				}
			}
			this.aByteArray6 = local27;
		}
		this.anInt705 = this.anInt704 = this.anInt708 = this.anInt709 = 0;
		this.anInt707 = local2;
		this.anInt706 = local5;
		this.aByteArray5 = local19;
	}

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "()V")
	public void method817() {
		@Pc(6) byte[] local6 = new byte[this.anInt707 * this.anInt706];
		@Pc(8) int local8 = 0;
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (this.aByteArray6 == null) {
			for (local13 = 0; local13 < this.anInt707; local13++) {
				for (local19 = this.anInt706 - 1; local19 >= 0; local19--) {
					local6[local8++] = this.aByteArray5[local13 + local19 * this.anInt707];
				}
			}
			this.aByteArray5 = local6;
		} else {
			@Pc(52) byte[] local52 = new byte[this.anInt707 * this.anInt706];
			for (local19 = 0; local19 < this.anInt707; local19++) {
				for (@Pc(60) int local60 = this.anInt706 - 1; local60 >= 0; local60--) {
					local6[local8] = this.aByteArray5[local19 + local60 * this.anInt707];
					local52[local8++] = this.aByteArray6[local19 + local60 * this.anInt707];
				}
			}
			this.aByteArray5 = local6;
			this.aByteArray6 = local52;
		}
		local13 = this.anInt708;
		this.anInt708 = this.anInt705;
		this.anInt705 = this.anInt709;
		this.anInt709 = this.anInt704;
		this.anInt704 = this.anInt708;
		local13 = this.anInt706;
		this.anInt706 = this.anInt707;
		this.anInt707 = local13;
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)V")
	public void method818(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(8) int local8;
		@Pc(69) int local69;
		@Pc(63) int local63;
		if (this.anIntArray22.length < 255) {
			for (local8 = 0; local8 < this.anIntArray22.length; local8++) {
				if (this.anIntArray22[local8] == arg0) {
					local1 = local8;
					break;
				}
			}
			if (local1 == -1) {
				local1 = this.anIntArray22.length;
				@Pc(38) int[] local38 = new int[this.anIntArray22.length + 1];
				Static602.method4669(this.anIntArray22, 0, local38, 0, this.anIntArray22.length);
				this.anIntArray22 = local38;
				local38[local1] = arg0;
			}
		} else {
			local8 = Integer.MAX_VALUE;
			local63 = arg0 >> 16 & 0xFF;
			local69 = arg0 >> 8 & 0xFF;
			@Pc(73) int local73 = arg0 & 0xFF;
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray22.length; local75++) {
				@Pc(81) int local81 = this.anIntArray22[local75];
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
		for (local8 = this.anInt706 - 1; local8 > 0; local8--) {
			local63 = local8 * this.anInt707;
			for (local69 = this.anInt707 - 1; local69 > 0; local69--) {
				if (this.anIntArray22[this.aByteArray5[local69 + local63] & 0xFF] == 0 && this.anIntArray22[this.aByteArray5[local69 + local63 - this.anInt707 - 1] & 0xFF] != 0) {
					this.aByteArray5[local69 + local63] = (byte) local1;
				}
			}
		}
	}
}
