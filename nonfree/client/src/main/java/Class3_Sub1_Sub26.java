import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class3_Sub1_Sub26 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mm", name = "M", descriptor = "[S")
	private short[] aShortArray188;

	@OriginalMember(owner = "client!mm", name = "T", descriptor = "[S")
	private short[] aShortArray189;

	@OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
	public int anInt5925 = 1638;

	@OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
	public int anInt5930 = 0;

	@OriginalMember(owner = "client!mm", name = "V", descriptor = "Z")
	public boolean aBoolean479 = true;

	@OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
	public int anInt5919 = 4;

	@OriginalMember(owner = "client!mm", name = "Y", descriptor = "[B")
	private byte[] aByteArray70 = new byte[512];

	@OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
	public int anInt5928 = 4;

	@OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
	public int anInt5931 = 4;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIB)I")
	private int method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(26) int local26 = local9 & 0xFF;
		if (local13 >= arg3) {
			local13 = 0;
		}
		@Pc(35) int local35 = arg4 & 0xFFF;
		@Pc(39) int local39 = local35 - 4096;
		@Pc(43) int local43 = arg1 - 4096;
		local13 &= 0xFF;
		@Pc(51) int local51 = Class341.anIntArray649[local35];
		@Pc(60) int local60 = this.aByteArray70[local26 + arg0] & 0x3;
		@Pc(76) int local76;
		if (local60 > 1) {
			local76 = local60 == 2 ? local35 - arg1 : -local35 + -arg1;
		} else {
			local76 = local60 == 0 ? local35 + arg1 : arg1 - local35;
		}
		local60 = this.aByteArray70[arg0 + local13] & 0x3;
		@Pc(114) int local114;
		if (local60 <= 1) {
			local114 = local60 == 0 ? local39 + arg1 : arg1 - local39;
		} else {
			local114 = local60 == 2 ? local39 - arg1 : -arg1 + -local39;
		}
		@Pc(141) int local141 = (local51 * (local114 - local76) >> 12) + local76;
		local60 = this.aByteArray70[local26 + arg2] & 0x3;
		if (local60 > 1) {
			local76 = local60 == 2 ? local35 - local43 : -local35 + -local43;
		} else {
			local76 = local60 == 0 ? local35 + local43 : local43 + -local35;
		}
		local60 = this.aByteArray70[local13 + arg2] & 0x3;
		if (local60 <= 1) {
			local114 = local60 == 0 ? local39 + local43 : local43 + -local39;
		} else {
			local114 = local60 == 2 ? local39 - local43 : -local39 + -local43;
		}
		@Pc(233) int local233 = local76 + ((local114 - local76) * local51 >> 12);
		return (arg5 * (local233 - local141) >> 12) + local141;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean479 = arg0.method3118() == 1;
		} else if (arg1 == 1) {
			this.anInt5919 = arg0.method3118();
		} else if (arg1 == 2) {
			this.anInt5925 = arg0.method3107();
			if (this.anInt5925 < 0) {
				this.aShortArray188 = new short[this.anInt5919];
				for (@Pc(68) int local68 = 0; local68 < this.anInt5919; local68++) {
					this.aShortArray188[local68] = (short) arg0.method3107();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5928 = this.anInt5931 = arg0.method3118();
		} else if (arg1 == 4) {
			this.anInt5930 = arg0.method3118();
		} else if (arg1 == 5) {
			this.anInt5928 = arg0.method3118();
		} else if (arg1 == 6) {
			this.anInt5931 = arg0.method3118();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			this.method5121(arg0, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V")
	private void method5120() {
		@Pc(16) int local16;
		if (this.anInt5925 > 0) {
			this.aShortArray188 = new short[this.anInt5919];
			this.aShortArray189 = new short[this.anInt5919];
			for (local16 = 0; local16 < this.anInt5919; local16++) {
				this.aShortArray188[local16] = (short) (Math.pow((double) ((float) this.anInt5925 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray189[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray188 != null && this.anInt5919 == this.aShortArray188.length) {
			this.aShortArray189 = new short[this.anInt5919];
			for (local16 = 0; local16 < this.anInt5919; local16++) {
				this.aShortArray189[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[IZ)V")
	public void method5121(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = Static9.anIntArray15[arg0] * this.anInt5931;
		@Pc(114) int local114;
		@Pc(128) int local128;
		@Pc(40) int local40;
		@Pc(25) short local25;
		@Pc(105) int local105;
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(47) int local47;
		@Pc(85) int local85;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(94) int local94;
		@Pc(103) int local103;
		if (this.anInt5919 == 1) {
			local40 = this.aShortArray189[0] << 12;
			local25 = this.aShortArray188[0];
			local60 = local40 * this.anInt5928 >> 12;
			local53 = local40 * local12 >> 12;
			local47 = local40 * this.anInt5931 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local68 >= local47) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local94 = this.aByteArray70[local64 & 0xFF] & 0xFF;
			local103 = this.aByteArray70[local68 & 0xFF] & 0xFF;
			local85 = Class341.anIntArray649[local53];
			if (this.aBoolean479) {
				for (local105 = 0; local105 < Static206.anInt4182; local105++) {
					local114 = this.anInt5928 * Static329.anIntArray456[local105];
					local128 = this.method5119(local94, local53, local103, local60, local114 * local40 >> 12, local85);
					@Pc(486) int local486 = local128 * local25 >> 12;
					arg1[local105] = (local486 >> 1) + 2048;
				}
			} else {
				for (local105 = 0; local105 < Static206.anInt4182; local105++) {
					local114 = Static329.anIntArray456[local105] * this.anInt5928;
					local128 = this.method5119(local94, local53, local103, local60, local40 * local114 >> 12, local85);
					arg1[local105] = local128 * local25 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray188[0];
		if (local25 > 8 || local25 < -8) {
			local40 = this.aShortArray189[0] << 12;
			local47 = local40 * this.anInt5931 >> 12;
			local53 = local40 * local12 >> 12;
			local60 = local40 * this.anInt5928 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local47 <= local68) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local85 = Class341.anIntArray649[local53];
			local94 = this.aByteArray70[local64 & 0xFF] & 0xFF;
			local103 = this.aByteArray70[local68 & 0xFF] & 0xFF;
			for (local105 = 0; local105 < Static206.anInt4182; local105++) {
				local114 = this.anInt5928 * Static329.anIntArray456[local105];
				local128 = this.method5119(local94, local53, local103, local60, local40 * local114 >> 12, local85);
				arg1[local105] = local25 * local128 >> 12;
			}
		}
		for (@Pc(146) int local146 = 1; local146 < this.anInt5919; local146++) {
			local25 = this.aShortArray188[local146];
			if (local25 > 8 || local25 < -8) {
				local40 = this.aShortArray189[local146] << 12;
				local60 = local40 * this.anInt5928 >> 12;
				local53 = local12 * local40 >> 12;
				local47 = this.anInt5931 * local40 >> 12;
				local64 = local53 >> 12;
				local68 = local64 + 1;
				if (local47 <= local68) {
					local68 = 0;
				}
				local53 &= 0xFFF;
				local94 = this.aByteArray70[local64 & 0xFF] & 0xFF;
				local103 = this.aByteArray70[local68 & 0xFF] & 0xFF;
				local85 = Class341.anIntArray649[local53];
				if (this.aBoolean479 && local146 == this.anInt5919 - 1) {
					for (local105 = 0; local105 < Static206.anInt4182; local105++) {
						local114 = Static329.anIntArray456[local105] * this.anInt5928;
						local128 = this.method5119(local94, local53, local103, local60, local40 * local114 >> 12, local85);
						local128 = arg1[local105] + (local25 * local128 >> 12);
						arg1[local105] = (local128 >> 1) + 2048;
					}
				} else {
					for (local105 = 0; local105 < Static206.anInt4182; local105++) {
						local114 = this.anInt5928 * Static329.anIntArray456[local105];
						local128 = this.method5119(local94, local53, local103, local60, local114 * local40 >> 12, local85);
						arg1[local105] += local128 * local25 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		this.aByteArray70 = Static136.method2645(this.anInt5930);
		this.method5120();
		for (@Pc(19) int local19 = this.anInt5919 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray188[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt5919--;
		}
	}
}
