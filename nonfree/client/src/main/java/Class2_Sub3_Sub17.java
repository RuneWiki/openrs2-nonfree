import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class2_Sub3_Sub17 extends Class2_Sub3 {

	@OriginalMember(owner = "client!jq", name = "T", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!jq", name = "W", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!jq", name = "J", descriptor = "I")
	public int anInt5772 = 1638;

	@OriginalMember(owner = "client!jq", name = "M", descriptor = "[B")
	private byte[] aByteArray80 = new byte[512];

	@OriginalMember(owner = "client!jq", name = "U", descriptor = "Z")
	public boolean aBoolean440 = true;

	@OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
	public int anInt5773 = 4;

	@OriginalMember(owner = "client!jq", name = "Q", descriptor = "I")
	public int anInt5778 = 0;

	@OriginalMember(owner = "client!jq", name = "Y", descriptor = "I")
	public int anInt5782 = 4;

	@OriginalMember(owner = "client!jq", name = "S", descriptor = "I")
	public int anInt5780 = 4;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean440 = arg0.method8383() == 1;
		} else if (arg1 == 1) {
			this.anInt5773 = arg0.method8383();
		} else if (arg1 == 2) {
			this.anInt5772 = arg0.method8368();
			if (this.anInt5772 < 0) {
				this.aShortArray74 = new short[this.anInt5773];
				for (@Pc(70) int local70 = 0; local70 < this.anInt5773; local70++) {
					this.aShortArray74[local70] = (short) arg0.method8368();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5780 = this.anInt5782 = arg0.method8383();
		} else if (arg1 == 4) {
			this.anInt5778 = arg0.method8383();
		} else if (arg1 == 5) {
			this.anInt5780 = arg0.method8383();
		} else if (arg1 == 6) {
			this.anInt5782 = arg0.method8383();
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			this.method4992(arg0, local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		this.aByteArray80 = Static199.method7267(this.anInt5778);
		this.method4990();
		for (@Pc(19) int local19 = this.anInt5773 - 1; local19 >= 1; local19--) {
			@Pc(31) short local31 = this.aShortArray74[local19];
			if (local31 > 8) {
				return;
			}
			if (local31 < -8) {
				return;
			}
			this.anInt5773--;
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
	private void method4990() {
		@Pc(27) int local27;
		if (this.anInt5772 > 0) {
			this.aShortArray75 = new short[this.anInt5773];
			this.aShortArray74 = new short[this.anInt5773];
			for (local27 = 0; local27 < this.anInt5773; local27++) {
				this.aShortArray74[local27] = (short) (Math.pow((double) ((float) this.anInt5772 / 4096.0F), (double) local27) * 4096.0D);
				this.aShortArray75[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		} else if (this.aShortArray74 != null && this.anInt5773 == this.aShortArray74.length) {
			this.aShortArray75 = new short[this.anInt5773];
			for (local27 = 0; local27 < this.anInt5773; local27++) {
				this.aShortArray75[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[IB)V")
	public void method4992(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = Static547.anIntArray641[arg0] * this.anInt5782;
		@Pc(112) int local112;
		@Pc(126) int local126;
		@Pc(42) int local42;
		@Pc(27) short local27;
		@Pc(103) int local103;
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(101) int local101;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(97) int local97;
		@Pc(88) int local88;
		if (this.anInt5773 == 1) {
			local42 = this.aShortArray75[0] << 12;
			local27 = this.aShortArray74[0];
			local48 = local42 * local12 >> 12;
			local55 = local42 * this.anInt5780 >> 12;
			local62 = this.anInt5782 * local42 >> 12;
			local66 = local48 >> 12;
			local70 = local66 + 1;
			@Pc(376) int local376 = local48 & 0xFFF;
			if (local70 >= local62) {
				local70 = 0;
			}
			local88 = this.aByteArray80[local70 & 0xFF] & 0xFF;
			local101 = Class289.anIntArray573[local376];
			local97 = this.aByteArray80[local66 & 0xFF] & 0xFF;
			if (this.aBoolean440) {
				for (local103 = 0; local103 < Static222.anInt4971; local103++) {
					local112 = this.anInt5780 * Static464.anIntArray556[local103];
					local126 = this.method4993(local88, local376, local55, local112 * local42 >> 12, local101, local97);
					@Pc(475) int local475 = local27 * local126 >> 12;
					arg1[local103] = (local475 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static222.anInt4971; local103++) {
					local112 = this.anInt5780 * Static464.anIntArray556[local103];
					local126 = this.method4993(local88, local376, local55, local42 * local112 >> 12, local101, local97);
					arg1[local103] = local126 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray74[0];
		if (local27 > 8 || local27 < -8) {
			local42 = this.aShortArray75[0] << 12;
			local48 = local42 * local12 >> 12;
			local55 = this.anInt5780 * local42 >> 12;
			local62 = this.anInt5782 * local42 >> 12;
			local66 = local48 >> 12;
			local70 = local66 + 1;
			if (local70 >= local62) {
				local70 = 0;
			}
			local48 &= 0xFFF;
			local88 = this.aByteArray80[local70 & 0xFF] & 0xFF;
			local97 = this.aByteArray80[local66 & 0xFF] & 0xFF;
			local101 = Class289.anIntArray573[local48];
			for (local103 = 0; local103 < Static222.anInt4971; local103++) {
				local112 = Static464.anIntArray556[local103] * this.anInt5780;
				local126 = this.method4993(local88, local48, local55, local42 * local112 >> 12, local101, local97);
				arg1[local103] = local27 * local126 >> 12;
			}
		}
		for (@Pc(140) int local140 = 1; local140 < this.anInt5773; local140++) {
			local27 = this.aShortArray74[local140];
			if (local27 > 8 || local27 < -8) {
				local42 = this.aShortArray75[local140] << 12;
				local48 = local42 * local12 >> 12;
				local55 = this.anInt5780 * local42 >> 12;
				local62 = this.anInt5782 * local42 >> 12;
				local66 = local48 >> 12;
				local70 = local66 + 1;
				local48 &= 0xFFF;
				if (local70 >= local62) {
					local70 = 0;
				}
				local97 = this.aByteArray80[local66 & 0xFF] & 0xFF;
				local101 = Class289.anIntArray573[local48];
				local88 = this.aByteArray80[local70 & 0xFF] & 0xFF;
				if (this.aBoolean440 && this.anInt5773 - 1 == local140) {
					for (local103 = 0; local103 < Static222.anInt4971; local103++) {
						local112 = Static464.anIntArray556[local103] * this.anInt5780;
						local126 = this.method4993(local88, local48, local55, local112 * local42 >> 12, local101, local97);
						local126 = arg1[local103] + (local126 * local27 >> 12);
						arg1[local103] = (local126 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static222.anInt4971; local103++) {
						local112 = this.anInt5780 * Static464.anIntArray556[local103];
						local126 = this.method4993(local88, local48, local55, local112 * local42 >> 12, local101, local97);
						arg1[local103] += local27 * local126 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIZI)I")
	private int method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		@Pc(21) int local21 = arg3 & 0xFFF;
		if (local13 >= arg2) {
			local13 = 0;
		}
		local13 &= 0xFF;
		@Pc(38) int local38 = local21 - 4096;
		@Pc(42) int local42 = arg1 - 4096;
		@Pc(51) int local51 = this.aByteArray80[arg5 + local17] & 0x3;
		@Pc(55) int local55 = Class289.anIntArray573[local21];
		@Pc(73) int local73;
		if (local51 > 1) {
			local73 = local51 == 2 ? local21 - arg1 : -arg1 + -local21;
		} else {
			local73 = local51 == 0 ? local21 + arg1 : arg1 - local21;
		}
		local51 = this.aByteArray80[arg5 + local13] & 0x3;
		@Pc(113) int local113;
		if (local51 <= 1) {
			local113 = local51 == 0 ? local38 + arg1 : arg1 + -local38;
		} else {
			local113 = local51 == 2 ? local38 - arg1 : -arg1 + -local38;
		}
		local51 = this.aByteArray80[arg0 + local17] & 0x3;
		@Pc(155) int local155 = local73 + (local55 * (local113 - local73) >> 12);
		if (local51 > 1) {
			local73 = local51 == 2 ? local21 - local42 : -local21 - local42;
		} else {
			local73 = local51 == 0 ? local21 + local42 : -local21 + local42;
		}
		local51 = this.aByteArray80[arg0 + local13] & 0x3;
		if (local51 > 1) {
			local113 = local51 == 2 ? local38 - local42 : -local38 - local42;
		} else {
			local113 = local51 == 0 ? local38 + local42 : local42 + -local38;
		}
		@Pc(239) int local239 = ((local113 - local73) * local55 >> 12) + local73;
		return local155 + (arg4 * (local239 - local155) >> 12);
	}
}
