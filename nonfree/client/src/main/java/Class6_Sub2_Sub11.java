import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class6_Sub2_Sub11 extends Class6_Sub2 {

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "[B")
	private byte[] aByteArray27 = new byte[512];

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
	public int anInt2222 = 4;

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
	public int anInt2220 = 4;

	@OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
	public int anInt2218 = 4;

	@OriginalMember(owner = "client!gh", name = "R", descriptor = "Z")
	public boolean aBoolean167 = true;

	@OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
	public int anInt2214 = 0;

	@OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
	public int anInt2228 = 1638;

	static {
		new Class231("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		this.aByteArray27 = Static113.method1858(this.anInt2214);
		this.method2036();
		for (@Pc(27) int local27 = this.anInt2222 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray34[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt2222--;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean167 = arg0.method3111() == 1;
		} else if (arg1 == 1) {
			this.anInt2222 = arg0.method3111();
		} else if (arg1 == 2) {
			this.anInt2228 = arg0.method3103();
			if (this.anInt2228 < 0) {
				this.aShortArray34 = new short[this.anInt2222];
				for (@Pc(76) int local76 = 0; local76 < this.anInt2222; local76++) {
					this.aShortArray34[local76] = (short) arg0.method3103();
				}
			}
		} else if (arg1 == 3) {
			this.anInt2218 = this.anInt2220 = arg0.method3111();
		} else if (arg1 == 4) {
			this.anInt2214 = arg0.method3111();
		} else if (arg1 == 5) {
			this.anInt2218 = arg0.method3111();
		} else if (arg1 == 6) {
			this.anInt2220 = arg0.method3111();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([IBI)V")
	public void method2031(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt2220 * Static168.anIntArray278[arg1];
		@Pc(114) int local114;
		@Pc(128) int local128;
		@Pc(40) int local40;
		@Pc(25) short local25;
		@Pc(105) int local105;
		@Pc(60) int local60;
		@Pc(54) int local54;
		@Pc(47) int local47;
		@Pc(94) int local94;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(90) int local90;
		@Pc(103) int local103;
		if (this.anInt2222 == 1) {
			local25 = this.aShortArray34[0];
			local40 = this.aShortArray33[0] << 12;
			local47 = this.anInt2220 * local40 >> 12;
			local60 = local40 * local12 >> 12;
			local54 = this.anInt2218 * local40 >> 12;
			local64 = local60 >> 12;
			local68 = local64 + 1;
			@Pc(373) int local373 = local60 & 0xFFF;
			if (local47 <= local68) {
				local68 = 0;
			}
			local94 = Class6_Sub2_Sub8.anIntArray113[local373];
			local90 = this.aByteArray27[local64 & 0xFF] & 0xFF;
			local103 = this.aByteArray27[local68 & 0xFF] & 0xFF;
			if (this.aBoolean167) {
				for (local105 = 0; local105 < Static185.anInt4925; local105++) {
					local114 = this.anInt2218 * Static53.anIntArray95[local105];
					local128 = this.method2035(local54, local90, local94, local373, local40 * local114 >> 12, local103);
					local128 = local128 * local25 >> 12;
					arg0[local105] = (local128 >> 1) + 2048;
				}
			} else {
				for (local105 = 0; local105 < Static185.anInt4925; local105++) {
					local114 = Static53.anIntArray95[local105] * this.anInt2218;
					local128 = this.method2035(local54, local90, local94, local373, local114 * local40 >> 12, local103);
					arg0[local105] = local128 * local25 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray34[0];
		if (local25 > 8 || local25 < -8) {
			local40 = this.aShortArray33[0] << 12;
			local47 = local40 * this.anInt2220 >> 12;
			local54 = this.anInt2218 * local40 >> 12;
			local60 = local40 * local12 >> 12;
			local64 = local60 >> 12;
			local68 = local64 + 1;
			local60 &= 0xFFF;
			if (local68 >= local47) {
				local68 = 0;
			}
			local90 = this.aByteArray27[local64 & 0xFF] & 0xFF;
			local94 = Class6_Sub2_Sub8.anIntArray113[local60];
			local103 = this.aByteArray27[local68 & 0xFF] & 0xFF;
			for (local105 = 0; local105 < Static185.anInt4925; local105++) {
				local114 = this.anInt2218 * Static53.anIntArray95[local105];
				local128 = this.method2035(local54, local90, local94, local60, local114 * local40 >> 12, local103);
				arg0[local105] = local128 * local25 >> 12;
			}
		}
		for (@Pc(142) int local142 = 1; local142 < this.anInt2222; local142++) {
			local25 = this.aShortArray34[local142];
			if (local25 > 8 || local25 < -8) {
				local40 = this.aShortArray33[local142] << 12;
				local54 = this.anInt2218 * local40 >> 12;
				local60 = local12 * local40 >> 12;
				local47 = local40 * this.anInt2220 >> 12;
				local64 = local60 >> 12;
				local68 = local64 + 1;
				local60 &= 0xFFF;
				if (local47 <= local68) {
					local68 = 0;
				}
				local94 = Class6_Sub2_Sub8.anIntArray113[local60];
				local103 = this.aByteArray27[local68 & 0xFF] & 0xFF;
				local90 = this.aByteArray27[local64 & 0xFF] & 0xFF;
				if (this.aBoolean167 && this.anInt2222 - 1 == local142) {
					for (local105 = 0; local105 < Static185.anInt4925; local105++) {
						local114 = Static53.anIntArray95[local105] * this.anInt2218;
						local128 = this.method2035(local54, local90, local94, local60, local40 * local114 >> 12, local103);
						local128 = (local25 * local128 >> 12) + arg0[local105];
						arg0[local105] = (local128 >> 1) + 2048;
					}
				} else {
					for (local105 = 0; local105 < Static185.anInt4925; local105++) {
						local114 = this.anInt2218 * Static53.anIntArray95[local105];
						local128 = this.method2035(local54, local90, local94, local60, local40 * local114 >> 12, local103);
						arg0[local105] += local128 * local25 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			this.method2031(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIBII)I")
	private int method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg0 <= local13) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(30) int local30 = arg4 & 0xFFF;
		@Pc(34) int local34 = local30 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = arg3 - 4096;
		@Pc(46) int local46 = Class6_Sub2_Sub8.anIntArray113[local30];
		@Pc(55) int local55 = this.aByteArray27[arg1 + local9] & 0x3;
		@Pc(78) int local78;
		if (local55 > 1) {
			local78 = local55 == 2 ? local30 - arg3 : -arg3 + -local30;
		} else {
			local78 = local55 == 0 ? local30 + arg3 : arg3 + -local30;
		}
		local55 = this.aByteArray27[local13 + arg1] & 0x3;
		@Pc(120) int local120;
		if (local55 <= 1) {
			local120 = local55 == 0 ? arg3 + local34 : arg3 + -local34;
		} else {
			local120 = local55 == 2 ? local34 - arg3 : -local34 - arg3;
		}
		local55 = this.aByteArray27[arg5 + local9] & 0x3;
		@Pc(155) int local155 = local78 + (local46 * (local120 - local78) >> 12);
		if (local55 > 1) {
			local78 = local55 == 2 ? local30 - local42 : -local30 + -local42;
		} else {
			local78 = local55 == 0 ? local42 + local30 : local42 - local30;
		}
		local55 = this.aByteArray27[local13 + arg5] & 0x3;
		if (local55 > 1) {
			local120 = local55 == 2 ? local34 - local42 : -local42 + -local34;
		} else {
			local120 = local55 == 0 ? local42 + local34 : local42 - local34;
		}
		@Pc(243) int local243 = (local46 * (local120 - local78) >> 12) + local78;
		return local155 + (arg2 * (local243 - local155) >> 12);
	}

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "(I)V")
	private void method2036() {
		@Pc(27) int local27;
		if (this.anInt2228 > 0) {
			this.aShortArray34 = new short[this.anInt2222];
			this.aShortArray33 = new short[this.anInt2222];
			for (local27 = 0; local27 < this.anInt2222; local27++) {
				this.aShortArray34[local27] = (short) (Math.pow((double) ((float) this.anInt2228 / 4096.0F), (double) local27) * 4096.0D);
				this.aShortArray33[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		} else if (this.aShortArray34 != null && this.anInt2222 == this.aShortArray34.length) {
			this.aShortArray33 = new short[this.anInt2222];
			for (local27 = 0; local27 < this.anInt2222; local27++) {
				this.aShortArray33[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		}
	}
}
