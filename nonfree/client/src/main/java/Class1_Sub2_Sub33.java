import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class1_Sub2_Sub33 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!ti", name = "ab", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	public int anInt5206 = 0;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
	public int anInt5210 = 4;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "Z")
	public boolean aBoolean372 = true;

	@OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
	public int anInt5213 = 4;

	@OriginalMember(owner = "client!ti", name = "cb", descriptor = "[B")
	private byte[] aByteArray57 = new byte[512];

	@OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
	public int anInt5214 = 1638;

	@OriginalMember(owner = "client!ti", name = "eb", descriptor = "I")
	public int anInt5215 = 4;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI[I)V")
	public void method4040(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt5213 * Static7.anIntArray13[arg0];
		@Pc(119) int local119;
		@Pc(133) int local133;
		@Pc(36) int local36;
		@Pc(48) short local48;
		@Pc(109) int local109;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(43) int local43;
		@Pc(77) int local77;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(104) int local104;
		@Pc(95) int local95;
		if (this.anInt5210 == 1) {
			local36 = this.aShortArray78[0] << 12;
			local43 = this.anInt5213 * local36 >> 12;
			local48 = this.aShortArray79[0];
			local54 = local36 * local12 >> 12;
			local61 = this.anInt5215 * local36 >> 12;
			local65 = local54 >> 12;
			@Pc(69) int local69 = local54 & 0xFFF;
			local73 = local65 + 1;
			local77 = Class56.anIntArray119[local69];
			if (local43 <= local73) {
				local73 = 0;
			}
			local95 = this.aByteArray57[local73 & 0xFF] & 0xFF;
			local104 = this.aByteArray57[local65 & 0xFF] & 0xFF;
			if (this.aBoolean372) {
				for (local109 = 0; local109 < Static299.anInt5670; local109++) {
					local119 = this.anInt5215 * Static310.anIntArray108[local109];
					local133 = this.method4043(local36 * local119 >> 12, local69, local61, local77, local104, local95);
					local133 = local48 * local133 >> 12;
					arg1[local109] = (local133 >> 1) + 2048;
				}
			} else {
				for (local109 = 0; local109 < Static299.anInt5670; local109++) {
					local119 = this.anInt5215 * Static310.anIntArray108[local109];
					local133 = this.method4043(local36 * local119 >> 12, local69, local61, local77, local104, local95);
					arg1[local109] = local48 * local133 >> 12;
				}
			}
			return;
		}
		local48 = this.aShortArray79[0];
		if (local48 > 8 || local48 < -8) {
			local36 = this.aShortArray78[0] << 12;
			local61 = this.anInt5215 * local36 >> 12;
			local43 = this.anInt5213 * local36 >> 12;
			local54 = local12 * local36 >> 12;
			local65 = local54 >> 12;
			local104 = this.aByteArray57[local65 & 0xFF] & 0xFF;
			local73 = local65 + 1;
			local54 &= 0xFFF;
			if (local43 <= local73) {
				local73 = 0;
			}
			local77 = Class56.anIntArray119[local54];
			local95 = this.aByteArray57[local73 & 0xFF] & 0xFF;
			for (local109 = 0; local109 < Static299.anInt5670; local109++) {
				local119 = Static310.anIntArray108[local109] * this.anInt5215;
				local133 = this.method4043(local36 * local119 >> 12, local54, local61, local77, local104, local95);
				arg1[local109] = local133 * local48 >> 12;
			}
		}
		for (@Pc(313) int local313 = 1; local313 < this.anInt5210; local313++) {
			local48 = this.aShortArray79[local313];
			if (local48 > 8 || local48 < -8) {
				local36 = this.aShortArray78[local313] << 12;
				local54 = local36 * local12 >> 12;
				local65 = local54 >> 12;
				local104 = this.aByteArray57[local65 & 0xFF] & 0xFF;
				local61 = local36 * this.anInt5215 >> 12;
				local54 &= 0xFFF;
				local43 = this.anInt5213 * local36 >> 12;
				local73 = local65 + 1;
				if (local73 >= local43) {
					local73 = 0;
				}
				local77 = Class56.anIntArray119[local54];
				local95 = this.aByteArray57[local73 & 0xFF] & 0xFF;
				if (this.aBoolean372 && this.anInt5210 - 1 == local313) {
					for (local109 = 0; local109 < Static299.anInt5670; local109++) {
						local119 = Static310.anIntArray108[local109] * this.anInt5215;
						local133 = this.method4043(local119 * local36 >> 12, local54, local61, local77, local104, local95);
						local133 = (local133 * local48 >> 12) + arg1[local109];
						arg1[local109] = (local133 >> 1) + 2048;
					}
				} else {
					for (local109 = 0; local109 < Static299.anInt5670; local109++) {
						local119 = this.anInt5215 * Static310.anIntArray108[local109];
						local133 = this.method4043(local36 * local119 >> 12, local54, local61, local77, local104, local95);
						arg1[local109] += local133 * local48 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		this.aByteArray57 = Static191.method3129(this.anInt5206);
		this.method4044();
		for (@Pc(28) int local28 = this.anInt5210 - 1; local28 >= 1; local28--) {
			@Pc(38) short local38 = this.aShortArray79[local28];
			if (local38 > 8 || local38 < -8) {
				break;
			}
			this.anInt5210--;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			this.method4040(arg0, local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)I")
	private int method4043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg1 - 4096;
		@Pc(18) int local18 = arg0 >> 12;
		@Pc(22) int local22 = local18 + 1;
		@Pc(26) int local26 = arg0 & 0xFFF;
		@Pc(30) int local30 = local26 - 4096;
		@Pc(34) int local34 = Class56.anIntArray119[local26];
		if (arg2 <= local22) {
			local22 = 0;
		}
		local22 &= 0xFF;
		local18 &= 0xFF;
		@Pc(56) int local56 = this.aByteArray57[arg4 + local18] & 0x3;
		@Pc(72) int local72;
		if (local56 > 1) {
			local72 = local56 == 2 ? local26 - arg1 : -local26 - arg1;
		} else {
			local72 = local56 == 0 ? arg1 + local26 : arg1 + -local26;
		}
		local56 = this.aByteArray57[arg4 + local22] & 0x3;
		@Pc(114) int local114;
		if (local56 <= 1) {
			local114 = local56 == 0 ? arg1 + local30 : -local30 + arg1;
		} else {
			local114 = local56 == 2 ? local30 - arg1 : -local30 - arg1;
		}
		@Pc(141) int local141 = local72 + ((local114 - local72) * local34 >> 12);
		local56 = this.aByteArray57[local18 + arg5] & 0x3;
		if (local56 > 1) {
			local72 = local56 == 2 ? local26 - local14 : -local26 + -local14;
		} else {
			local72 = local56 == 0 ? local26 + local14 : local14 + -local26;
		}
		local56 = this.aByteArray57[local22 + arg5] & 0x3;
		if (local56 <= 1) {
			local114 = local56 == 0 ? local30 + local14 : -local30 + local14;
		} else {
			local114 = local56 == 2 ? local30 - local14 : -local14 + -local30;
		}
		@Pc(238) int local238 = (local34 * (local114 - local72) >> 12) + local72;
		return ((local238 - local141) * arg3 >> 12) + local141;
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)V")
	private void method4044() {
		@Pc(21) int local21;
		if (this.anInt5214 > 0) {
			this.aShortArray79 = new short[this.anInt5210];
			this.aShortArray78 = new short[this.anInt5210];
			for (local21 = 0; local21 < this.anInt5210; local21++) {
				this.aShortArray79[local21] = (short) (Math.pow((double) ((float) this.anInt5214 / 4096.0F), (double) local21) * 4096.0D);
				this.aShortArray78[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		} else if (this.aShortArray79 != null && this.aShortArray79.length == this.anInt5210) {
			this.aShortArray78 = new short[this.anInt5210];
			for (local21 = 0; local21 < this.anInt5210; local21++) {
				this.aShortArray78[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean372 = arg0.method2595() == 1;
		} else if (arg1 == 1) {
			this.anInt5210 = arg0.method2595();
		} else if (arg1 == 2) {
			this.anInt5214 = arg0.method2623();
			if (this.anInt5214 < 0) {
				this.aShortArray79 = new short[this.anInt5210];
				for (@Pc(74) int local74 = 0; local74 < this.anInt5210; local74++) {
					this.aShortArray79[local74] = (short) arg0.method2623();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5215 = this.anInt5213 = arg0.method2595();
		} else if (arg1 == 4) {
			this.anInt5206 = arg0.method2595();
		} else if (arg1 == 5) {
			this.anInt5215 = arg0.method2595();
		} else if (arg1 == 6) {
			this.anInt5213 = arg0.method2595();
		}
	}
}
