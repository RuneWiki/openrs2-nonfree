import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class2_Sub15_Sub21 extends Class2_Sub15 {

	@OriginalMember(owner = "client!oaa", name = "F", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!oaa", name = "Q", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!oaa", name = "H", descriptor = "I")
	public int anInt7707 = 4;

	@OriginalMember(owner = "client!oaa", name = "K", descriptor = "I")
	public int anInt7710 = 0;

	@OriginalMember(owner = "client!oaa", name = "N", descriptor = "I")
	public int anInt7712 = 4;

	@OriginalMember(owner = "client!oaa", name = "R", descriptor = "I")
	public int anInt7715 = 4;

	@OriginalMember(owner = "client!oaa", name = "E", descriptor = "[B")
	private byte[] aByteArray70 = new byte[512];

	@OriginalMember(owner = "client!oaa", name = "L", descriptor = "Z")
	public boolean aBoolean573 = true;

	@OriginalMember(owner = "client!oaa", name = "U", descriptor = "I")
	public int anInt7718 = 1638;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([III)V")
	public void method6894(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.anInt7707 * Static401.anIntArray357[arg1];
		@Pc(114) int local114;
		@Pc(128) int local128;
		@Pc(44) int local44;
		@Pc(29) short local29;
		@Pc(105) int local105;
		@Pc(50) int local50;
		@Pc(64) int local64;
		@Pc(57) int local57;
		@Pc(85) int local85;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(94) int local94;
		@Pc(103) int local103;
		if (this.anInt7712 == 1) {
			local44 = this.aShortArray100[0] << 12;
			local29 = this.aShortArray99[0];
			local64 = local44 * this.anInt7715 >> 12;
			local50 = local20 * local44 >> 12;
			local57 = this.anInt7707 * local44 >> 12;
			local68 = local50 >> 12;
			local72 = local68 + 1;
			if (local72 >= local57) {
				local72 = 0;
			}
			local50 &= 0xFFF;
			local94 = this.aByteArray70[local68 & 0xFF] & 0xFF;
			local103 = this.aByteArray70[local72 & 0xFF] & 0xFF;
			local85 = Class306.anIntArray446[local50];
			if (this.aBoolean573) {
				for (local105 = 0; local105 < Static329.anInt6017; local105++) {
					local114 = this.anInt7715 * Static537.anIntArray480[local105];
					local128 = this.method6897(local44 * local114 >> 12, local103, local94, local85, local50, local64);
					@Pc(485) int local485 = local128 * local29 >> 12;
					arg0[local105] = (local485 >> 1) + 2048;
				}
			} else {
				for (local105 = 0; local105 < Static329.anInt6017; local105++) {
					local114 = Static537.anIntArray480[local105] * this.anInt7715;
					local128 = this.method6897(local44 * local114 >> 12, local103, local94, local85, local50, local64);
					arg0[local105] = local29 * local128 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray99[0];
		if (local29 > 8 || local29 < -8) {
			local44 = this.aShortArray100[0] << 12;
			local50 = local20 * local44 >> 12;
			local57 = this.anInt7707 * local44 >> 12;
			local64 = this.anInt7715 * local44 >> 12;
			local68 = local50 >> 12;
			local72 = local68 + 1;
			if (local57 <= local72) {
				local72 = 0;
			}
			local50 &= 0xFFF;
			local85 = Class306.anIntArray446[local50];
			local94 = this.aByteArray70[local68 & 0xFF] & 0xFF;
			local103 = this.aByteArray70[local72 & 0xFF] & 0xFF;
			for (local105 = 0; local105 < Static329.anInt6017; local105++) {
				local114 = Static537.anIntArray480[local105] * this.anInt7715;
				local128 = this.method6897(local114 * local44 >> 12, local103, local94, local85, local50, local64);
				arg0[local105] = local29 * local128 >> 12;
			}
		}
		for (@Pc(146) int local146 = 1; local146 < this.anInt7712; local146++) {
			local29 = this.aShortArray99[local146];
			if (local29 > 8 || local29 < -8) {
				local44 = this.aShortArray100[local146] << 12;
				local50 = local44 * local20 >> 12;
				local64 = this.anInt7715 * local44 >> 12;
				local57 = local44 * this.anInt7707 >> 12;
				local68 = local50 >> 12;
				local72 = local68 + 1;
				local50 &= 0xFFF;
				if (local57 <= local72) {
					local72 = 0;
				}
				local94 = this.aByteArray70[local68 & 0xFF] & 0xFF;
				local85 = Class306.anIntArray446[local50];
				local103 = this.aByteArray70[local72 & 0xFF] & 0xFF;
				if (this.aBoolean573 && local146 == this.anInt7712 - 1) {
					for (local105 = 0; local105 < Static329.anInt6017; local105++) {
						local114 = this.anInt7715 * Static537.anIntArray480[local105];
						local128 = this.method6897(local44 * local114 >> 12, local103, local94, local85, local50, local64);
						local128 = arg0[local105] + (local29 * local128 >> 12);
						arg0[local105] = (local128 >> 1) + 2048;
					}
				} else {
					for (local105 = 0; local105 < Static329.anInt6017; local105++) {
						local114 = Static537.anIntArray480[local105] * this.anInt7715;
						local128 = this.method6897(local114 * local44 >> 12, local103, local94, local85, local50, local64);
						arg0[local105] += local29 * local128 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			this.method6894(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIBI)I")
	private int method6897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg0 & 0xFFF;
		@Pc(21) int local21 = local9 & 0xFF;
		if (local13 >= arg5) {
			local13 = 0;
		}
		local13 &= 0xFF;
		@Pc(34) int local34 = arg4 - 4096;
		@Pc(38) int local38 = local17 - 4096;
		@Pc(48) int local48 = this.aByteArray70[local21 + arg2] & 0x3;
		@Pc(52) int local52 = Class306.anIntArray446[local17];
		@Pc(70) int local70;
		if (local48 <= 1) {
			local70 = local48 == 0 ? arg4 + local17 : arg4 - local17;
		} else {
			local70 = local48 == 2 ? local17 - arg4 : -local17 - arg4;
		}
		local48 = this.aByteArray70[local13 + arg2] & 0x3;
		@Pc(116) int local116;
		if (local48 <= 1) {
			local116 = local48 == 0 ? local38 + arg4 : -local38 + arg4;
		} else {
			local116 = local48 == 2 ? local38 - arg4 : -local38 + -arg4;
		}
		@Pc(142) int local142 = (local52 * (local116 - local70) >> 12) + local70;
		local48 = this.aByteArray70[arg1 + local21] & 0x3;
		if (local48 <= 1) {
			local70 = local48 == 0 ? local17 + local34 : -local17 + local34;
		} else {
			local70 = local48 == 2 ? local17 - local34 : -local34 + -local17;
		}
		local48 = this.aByteArray70[arg1 + local13] & 0x3;
		if (local48 <= 1) {
			local116 = local48 == 0 ? local34 + local38 : local34 + -local38;
		} else {
			local116 = local48 == 2 ? local38 - local34 : -local34 + -local38;
		}
		@Pc(243) int local243 = ((local116 - local70) * local52 >> 12) + local70;
		return ((local243 - local142) * arg3 >> 12) + local142;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		this.aByteArray70 = Static545.method8350(this.anInt7710);
		this.method6899();
		for (@Pc(25) int local25 = this.anInt7712 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray99[local25];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt7712--;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "(I)V")
	private void method6899() {
		@Pc(16) int local16;
		if (this.anInt7718 > 0) {
			this.aShortArray100 = new short[this.anInt7712];
			this.aShortArray99 = new short[this.anInt7712];
			for (local16 = 0; local16 < this.anInt7712; local16++) {
				this.aShortArray99[local16] = (short) (int) (Math.pow((double) ((float) this.anInt7718 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray100[local16] = (short) (int) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray99 != null && this.anInt7712 == this.aShortArray99.length) {
			this.aShortArray100 = new short[this.anInt7712];
			for (local16 = 0; local16 < this.anInt7712; local16++) {
				this.aShortArray100[local16] = (short) (int) Math.pow(2.0D, (double) local16);
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean573 = arg1.method5203() == 1;
		} else if (arg0 == 1) {
			this.anInt7712 = arg1.method5203();
		} else if (arg0 == 2) {
			this.anInt7718 = arg1.method5174();
			if (this.anInt7718 < 0) {
				this.aShortArray99 = new short[this.anInt7712];
				for (@Pc(70) int local70 = 0; local70 < this.anInt7712; local70++) {
					this.aShortArray99[local70] = (short) arg1.method5174();
				}
			}
		} else if (arg0 == 3) {
			this.anInt7715 = this.anInt7707 = arg1.method5203();
		} else if (arg0 == 4) {
			this.anInt7710 = arg1.method5203();
		} else if (arg0 == 5) {
			this.anInt7715 = arg1.method5203();
		} else if (arg0 == 6) {
			this.anInt7707 = arg1.method5203();
		}
	}
}
