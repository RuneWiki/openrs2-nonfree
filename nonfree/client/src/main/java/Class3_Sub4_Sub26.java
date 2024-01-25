import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class3_Sub4_Sub26 extends Class3_Sub4 {

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!pe", name = "eb", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
	public int anInt5540 = 4;

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "[B")
	private byte[] aByteArray63 = new byte[512];

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
	public int anInt5535 = 4;

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
	public int anInt5536 = 4;

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
	public int anInt5547 = 0;

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
	public int anInt5548 = 1638;

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "Z")
	public boolean aBoolean405 = true;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		this.aByteArray63 = Static136.method1774(this.anInt5547);
		this.method4480();
		for (@Pc(17) int local17 = this.anInt5536 - 1; local17 >= 1; local17--) {
			@Pc(26) short local26 = this.aShortArray71[local17];
			if (local26 > 8 || local26 < -8) {
				return;
			}
			this.anInt5536--;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[IB)V")
	public void method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(10) int local10 = Static285.anIntArray401[arg0] * this.anInt5535;
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(42) int local42;
		@Pc(27) short local27;
		@Pc(103) int local103;
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(92) int local92;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(101) int local101;
		@Pc(88) int local88;
		if (this.anInt5536 == 1) {
			local42 = this.aShortArray72[0] << 12;
			local27 = this.aShortArray71[0];
			local48 = local42 * local10 >> 12;
			local55 = local42 * this.anInt5540 >> 12;
			local62 = this.anInt5535 * local42 >> 12;
			local66 = local48 >> 12;
			local70 = local66 + 1;
			@Pc(376) int local376 = local48 & 0xFFF;
			if (local62 <= local70) {
				local70 = 0;
			}
			local92 = Class80.anIntArray219[local376];
			local88 = this.aByteArray63[local70 & 0xFF] & 0xFF;
			local101 = this.aByteArray63[local66 & 0xFF] & 0xFF;
			if (this.aBoolean405) {
				for (local103 = 0; local103 < Static106.anInt2356; local103++) {
					local111 = this.anInt5540 * Static382.anIntArray476[local103];
					local125 = this.method4477(local42 * local111 >> 12, local55, local92, local88, local376, local101);
					@Pc(481) int local481 = local27 * local125 >> 12;
					arg1[local103] = (local481 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static106.anInt2356; local103++) {
					local111 = this.anInt5540 * Static382.anIntArray476[local103];
					local125 = this.method4477(local111 * local42 >> 12, local55, local92, local88, local376, local101);
					arg1[local103] = local27 * local125 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray71[0];
		if (local27 > 8 || local27 < -8) {
			local42 = this.aShortArray72[0] << 12;
			local48 = local42 * local10 >> 12;
			local55 = local42 * this.anInt5540 >> 12;
			local62 = this.anInt5535 * local42 >> 12;
			local66 = local48 >> 12;
			local70 = local66 + 1;
			if (local62 <= local70) {
				local70 = 0;
			}
			local48 &= 0xFFF;
			local88 = this.aByteArray63[local70 & 0xFF] & 0xFF;
			local92 = Class80.anIntArray219[local48];
			local101 = this.aByteArray63[local66 & 0xFF] & 0xFF;
			for (local103 = 0; local103 < Static106.anInt2356; local103++) {
				local111 = this.anInt5540 * Static382.anIntArray476[local103];
				local125 = this.method4477(local42 * local111 >> 12, local55, local92, local88, local48, local101);
				arg1[local103] = local27 * local125 >> 12;
			}
		}
		for (@Pc(143) int local143 = 1; local143 < this.anInt5536; local143++) {
			local27 = this.aShortArray71[local143];
			if (local27 > 8 || local27 < -8) {
				local42 = this.aShortArray72[local143] << 12;
				local48 = local42 * local10 >> 12;
				local55 = this.anInt5540 * local42 >> 12;
				local62 = local42 * this.anInt5535 >> 12;
				local66 = local48 >> 12;
				local70 = local66 + 1;
				local48 &= 0xFFF;
				if (local62 <= local70) {
					local70 = 0;
				}
				local92 = Class80.anIntArray219[local48];
				local101 = this.aByteArray63[local66 & 0xFF] & 0xFF;
				local88 = this.aByteArray63[local70 & 0xFF] & 0xFF;
				if (this.aBoolean405 && local143 == this.anInt5536 - 1) {
					for (local103 = 0; local103 < Static106.anInt2356; local103++) {
						local111 = Static382.anIntArray476[local103] * this.anInt5540;
						local125 = this.method4477(local111 * local42 >> 12, local55, local92, local88, local48, local101);
						local125 = (local125 * local27 >> 12) + arg1[local103];
						arg1[local103] = (local125 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static106.anInt2356; local103++) {
						local111 = Static382.anIntArray476[local103] * this.anInt5540;
						local125 = this.method4477(local111 * local42 >> 12, local55, local92, local88, local48, local101);
						arg1[local103] += local27 * local125 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)I")
	private int method4477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 >> 12;
		@Pc(11) int local11 = local7 + 1;
		@Pc(15) int local15 = local7 & 0xFF;
		if (local11 >= arg1) {
			local11 = 0;
		}
		@Pc(24) int local24 = arg0 & 0xFFF;
		@Pc(28) int local28 = arg4 - 4096;
		local11 &= 0xFF;
		@Pc(36) int local36 = local24 - 4096;
		@Pc(40) int local40 = Class80.anIntArray219[local24];
		@Pc(49) int local49 = this.aByteArray63[arg5 + local15] & 0x3;
		@Pc(68) int local68;
		if (local49 > 1) {
			local68 = local49 == 2 ? local24 - arg4 : -arg4 + -local24;
		} else {
			local68 = local49 == 0 ? local24 + arg4 : arg4 + -local24;
		}
		local49 = this.aByteArray63[local11 + arg5] & 0x3;
		@Pc(119) int local119;
		if (local49 > 1) {
			local119 = local49 == 2 ? local36 - arg4 : -arg4 + -local36;
		} else {
			local119 = local49 == 0 ? local36 + arg4 : arg4 - local36;
		}
		@Pc(145) int local145 = ((local119 - local68) * local40 >> 12) + local68;
		local49 = this.aByteArray63[local15 + arg3] & 0x3;
		if (local49 <= 1) {
			local68 = local49 == 0 ? local24 + local28 : local28 - local24;
		} else {
			local68 = local49 == 2 ? local24 - local28 : -local28 + -local24;
		}
		local49 = this.aByteArray63[local11 + arg3] & 0x3;
		if (local49 > 1) {
			local119 = local49 == 2 ? local36 - local28 : -local36 + -local28;
		} else {
			local119 = local49 == 0 ? local36 + local28 : -local36 + local28;
		}
		@Pc(241) int local241 = local68 + ((local119 - local68) * local40 >> 12);
		return local145 + ((local241 - local145) * arg2 >> 12);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
	private void method4480() {
		@Pc(32) int local32;
		if (this.anInt5548 > 0) {
			this.aShortArray71 = new short[this.anInt5536];
			this.aShortArray72 = new short[this.anInt5536];
			for (local32 = 0; local32 < this.anInt5536; local32++) {
				this.aShortArray71[local32] = (short) (Math.pow((double) ((float) this.anInt5548 / 4096.0F), (double) local32) * 4096.0D);
				this.aShortArray72[local32] = (short) Math.pow(2.0D, (double) local32);
			}
		} else if (this.aShortArray71 != null && this.anInt5536 == this.aShortArray71.length) {
			this.aShortArray72 = new short[this.anInt5536];
			for (local32 = 0; local32 < this.anInt5536; local32++) {
				this.aShortArray72[local32] = (short) Math.pow(2.0D, (double) local32);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean405 = arg1.method6053() == 1;
		} else if (arg0 == 1) {
			this.anInt5536 = arg1.method6053();
		} else if (arg0 == 2) {
			this.anInt5548 = arg1.method6039();
			if (this.anInt5548 < 0) {
				this.aShortArray71 = new short[this.anInt5536];
				for (@Pc(73) int local73 = 0; local73 < this.anInt5536; local73++) {
					this.aShortArray71[local73] = (short) arg1.method6039();
				}
			}
		} else if (arg0 == 3) {
			this.anInt5540 = this.anInt5535 = arg1.method6053();
		} else if (arg0 == 4) {
			this.anInt5547 = arg1.method6053();
		} else if (arg0 == 5) {
			this.anInt5540 = arg1.method6053();
		} else if (arg0 == 6) {
			this.anInt5535 = arg1.method6053();
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			this.method4476(arg0, local15);
		}
		return local15;
	}
}
