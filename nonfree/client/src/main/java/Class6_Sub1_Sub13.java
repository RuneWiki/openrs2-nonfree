import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class6_Sub1_Sub13 extends Class6_Sub1 {

	@OriginalMember(owner = "client!he", name = "K", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "[B")
	private byte[] aByteArray45 = new byte[512];

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Z")
	public boolean aBoolean213 = true;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "I")
	public int anInt3585 = 4;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "I")
	public int anInt3588 = 4;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "I")
	public int anInt3586 = 4;

	@OriginalMember(owner = "client!he", name = "I", descriptor = "I")
	public int anInt3589 = 0;

	@OriginalMember(owner = "client!he", name = "P", descriptor = "I")
	public int anInt3593 = 1638;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		this.aByteArray45 = Static263.method3891(this.anInt3589);
		this.method3084();
		for (@Pc(19) int local19 = this.anInt3588 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray62[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt3588--;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	private void method3084() {
		@Pc(23) int local23;
		if (this.anInt3593 > 0) {
			this.aShortArray62 = new short[this.anInt3588];
			this.aShortArray63 = new short[this.anInt3588];
			for (local23 = 0; local23 < this.anInt3588; local23++) {
				this.aShortArray62[local23] = (short) (int) (Math.pow((double) ((float) this.anInt3593 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray63[local23] = (short) (int) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray62 != null && this.anInt3588 == this.aShortArray62.length) {
			this.aShortArray63 = new short[this.anInt3588];
			for (local23 = 0; local23 < this.anInt3588; local23++) {
				this.aShortArray63[local23] = (short) (int) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean213 = arg0.method8374() == 1;
		} else if (arg1 == 1) {
			this.anInt3588 = arg0.method8374();
		} else if (arg1 == 2) {
			this.anInt3593 = arg0.method8395();
			if (this.anInt3593 < 0) {
				this.aShortArray62 = new short[this.anInt3588];
				for (@Pc(80) int local80 = 0; local80 < this.anInt3588; local80++) {
					this.aShortArray62[local80] = (short) arg0.method8395();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt3585 = this.anInt3586 = arg0.method8374();
			return;
		} else if (arg1 == 4) {
			this.anInt3589 = arg0.method8374();
			return;
		} else if (arg1 == 5) {
			this.anInt3585 = arg0.method8374();
			return;
		} else if (arg1 == 6) {
			this.anInt3586 = arg0.method8374();
			return;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)I")
	private int method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg4 >> 12;
		@Pc(18) int local18 = local14 + 1;
		if (local18 >= arg0) {
			local18 = 0;
		}
		@Pc(31) int local31 = arg4 & 0xFFF;
		local14 &= 0xFF;
		@Pc(39) int local39 = local31 - 4096;
		@Pc(43) int local43 = arg2 - 4096;
		local18 &= 0xFF;
		@Pc(56) int local56 = this.aByteArray45[arg1 + local14] & 0x3;
		@Pc(60) int local60 = Class392.anIntArray715[local31];
		@Pc(74) int local74;
		if (local56 <= 1) {
			local74 = local56 == 0 ? local31 + arg2 : -local31 + arg2;
		} else {
			local74 = local56 == 2 ? local31 - arg2 : -local31 - arg2;
		}
		local56 = this.aByteArray45[local18 + arg1] & 0x3;
		@Pc(117) int local117;
		if (local56 <= 1) {
			local117 = local56 == 0 ? local39 + arg2 : arg2 + -local39;
		} else {
			local117 = local56 == 2 ? local39 - arg2 : -local39 + -arg2;
		}
		local56 = this.aByteArray45[arg5 + local14] & 0x3;
		@Pc(154) int local154 = local74 + (local60 * (local117 - local74) >> 12);
		if (local56 > 1) {
			local74 = local56 == 2 ? local31 - local43 : -local31 + -local43;
		} else {
			local74 = local56 == 0 ? local43 + local31 : local43 - local31;
		}
		local56 = this.aByteArray45[arg5 + local18] & 0x3;
		if (local56 <= 1) {
			local117 = local56 == 0 ? local39 + local43 : -local39 + local43;
		} else {
			local117 = local56 == 2 ? local39 - local43 : -local43 + -local39;
		}
		@Pc(241) int local241 = local74 + ((local117 - local74) * local60 >> 12);
		return local154 + (arg3 * (local241 - local154) >> 12);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI[I)V")
	public void method3087(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static230.anIntArray222[arg0] * this.anInt3586;
		@Pc(114) int local114;
		@Pc(128) int local128;
		@Pc(41) int local41;
		@Pc(34) short local34;
		@Pc(105) int local105;
		@Pc(61) int local61;
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(91) int local91;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(87) int local87;
		@Pc(100) int local100;
		if (this.anInt3588 == 1) {
			local34 = this.aShortArray62[0];
			local41 = this.aShortArray63[0] << 12;
			local48 = this.anInt3585 * local41 >> 12;
			local55 = local41 * this.anInt3586 >> 12;
			local61 = local12 * local41 >> 12;
			local65 = local61 >> 12;
			local69 = local65 + 1;
			if (local69 >= local55) {
				local69 = 0;
			}
			local61 &= 0xFFF;
			local87 = this.aByteArray45[local65 & 0xFF] & 0xFF;
			local91 = Class392.anIntArray715[local61];
			local100 = this.aByteArray45[local69 & 0xFF] & 0xFF;
			if (this.aBoolean213) {
				for (local105 = 0; local105 < Static479.anInt8231; local105++) {
					local114 = this.anInt3585 * Static205.anIntArray199[local105];
					local128 = this.method3086(local48, local87, local61, local91, local41 * local114 >> 12, local100);
					local128 = local128 * local34 >> 12;
					arg1[local105] = (local128 >> 1) + 2048;
				}
			} else {
				for (local105 = 0; local105 < Static479.anInt8231; local105++) {
					local114 = Static205.anIntArray199[local105] * this.anInt3585;
					local128 = this.method3086(local48, local87, local61, local91, local114 * local41 >> 12, local100);
					arg1[local105] = local34 * local128 >> 12;
				}
			}
			return;
		}
		local34 = this.aShortArray62[0];
		if (local34 > 8 || local34 < -8) {
			local41 = this.aShortArray63[0] << 12;
			local55 = local41 * this.anInt3586 >> 12;
			local61 = local41 * local12 >> 12;
			local48 = local41 * this.anInt3585 >> 12;
			local65 = local61 >> 12;
			local69 = local65 + 1;
			if (local69 >= local55) {
				local69 = 0;
			}
			local61 &= 0xFFF;
			local91 = Class392.anIntArray715[local61];
			local87 = this.aByteArray45[local65 & 0xFF] & 0xFF;
			local100 = this.aByteArray45[local69 & 0xFF] & 0xFF;
			for (local105 = 0; local105 < Static479.anInt8231; local105++) {
				local114 = Static205.anIntArray199[local105] * this.anInt3585;
				local128 = this.method3086(local48, local87, local61, local91, local114 * local41 >> 12, local100);
				arg1[local105] = local34 * local128 >> 12;
			}
		}
		for (@Pc(309) int local309 = 1; local309 < this.anInt3588; local309++) {
			local34 = this.aShortArray62[local309];
			if (local34 > 8 || local34 < -8) {
				local41 = this.aShortArray63[local309] << 12;
				local61 = local41 * local12 >> 12;
				local55 = local41 * this.anInt3586 >> 12;
				local48 = local41 * this.anInt3585 >> 12;
				local65 = local61 >> 12;
				local69 = local65 + 1;
				if (local69 >= local55) {
					local69 = 0;
				}
				local61 &= 0xFFF;
				local91 = Class392.anIntArray715[local61];
				local87 = this.aByteArray45[local65 & 0xFF] & 0xFF;
				local100 = this.aByteArray45[local69 & 0xFF] & 0xFF;
				if (this.aBoolean213 && local309 == this.anInt3588 - 1) {
					for (local105 = 0; local105 < Static479.anInt8231; local105++) {
						local114 = this.anInt3585 * Static205.anIntArray199[local105];
						local128 = this.method3086(local48, local87, local61, local91, local114 * local41 >> 12, local100);
						local128 = arg1[local105] + (local34 * local128 >> 12);
						arg1[local105] = (local128 >> 1) + 2048;
					}
				} else {
					for (local105 = 0; local105 < Static479.anInt8231; local105++) {
						local114 = this.anInt3585 * Static205.anIntArray199[local105];
						local128 = this.method3086(local48, local87, local61, local91, local114 * local41 >> 12, local100);
						arg1[local105] += local34 * local128 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			this.method3087(arg0, local9);
		}
		return local9;
	}
}
