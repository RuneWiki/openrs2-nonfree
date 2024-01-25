import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
	public int anInt2449 = 1638;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
	public int anInt2450 = 4;

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "Z")
	public boolean aBoolean132 = true;

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "[B")
	private byte[] aByteArray38 = new byte[512];

	@OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
	public int anInt2454 = 4;

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
	public int anInt2447 = 0;

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
	public int anInt2451 = 4;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			this.method2163(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)I")
	private int method2160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg3 <= local13) {
			local13 = 0;
		}
		@Pc(22) int local22 = arg0 & 0xFFF;
		local9 &= 0xFF;
		@Pc(30) int local30 = local22 - 4096;
		@Pc(34) int local34 = arg4 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = Class130.anIntArray293[local22];
		@Pc(51) int local51 = this.aByteArray38[arg2 + local9] & 0x3;
		@Pc(70) int local70;
		if (local51 > 1) {
			local70 = local51 == 2 ? local22 - arg4 : -local22 + -arg4;
		} else {
			local70 = local51 == 0 ? arg4 + local22 : arg4 + -local22;
		}
		local51 = this.aByteArray38[arg2 + local13] & 0x3;
		@Pc(114) int local114;
		if (local51 > 1) {
			local114 = local51 == 2 ? local30 - arg4 : -arg4 + -local30;
		} else {
			local114 = local51 == 0 ? arg4 + local30 : -local30 + arg4;
		}
		local51 = this.aByteArray38[local9 + arg5] & 0x3;
		@Pc(146) int local146 = local70 + (local42 * (local114 - local70) >> 12);
		if (local51 > 1) {
			local70 = local51 == 2 ? local22 - local34 : -local22 + -local34;
		} else {
			local70 = local51 == 0 ? local34 + local22 : -local22 + local34;
		}
		local51 = this.aByteArray38[local13 + arg5] & 0x3;
		if (local51 <= 1) {
			local114 = local51 == 0 ? local34 + local30 : local34 - local30;
		} else {
			local114 = local51 == 2 ? local30 - local34 : -local30 - local34;
		}
		@Pc(232) int local232 = ((local114 - local70) * local42 >> 12) + local70;
		return local146 + ((local232 - local146) * arg1 >> 12);
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V")
	private void method2161() {
		@Pc(25) int local25;
		if (this.anInt2449 > 0) {
			this.aShortArray45 = new short[this.anInt2454];
			this.aShortArray44 = new short[this.anInt2454];
			for (local25 = 0; local25 < this.anInt2454; local25++) {
				this.aShortArray45[local25] = (short) (Math.pow((double) ((float) this.anInt2449 / 4096.0F), (double) local25) * 4096.0D);
				this.aShortArray44[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		} else if (this.aShortArray45 != null && this.anInt2454 == this.aShortArray45.length) {
			this.aShortArray44 = new short[this.anInt2454];
			for (local25 = 0; local25 < this.anInt2454; local25++) {
				this.aShortArray44[local25] = (short) Math.pow(2.0D, (double) local25);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean132 = arg0.method4130() == 1;
		} else if (arg1 == 1) {
			this.anInt2454 = arg0.method4130();
		} else if (arg1 == 2) {
			this.anInt2449 = arg0.method4100();
			if (this.anInt2449 < 0) {
				this.aShortArray45 = new short[this.anInt2454];
				for (@Pc(77) int local77 = 0; local77 < this.anInt2454; local77++) {
					this.aShortArray45[local77] = (short) arg0.method4100();
				}
			}
		} else if (arg1 == 3) {
			this.anInt2450 = this.anInt2451 = arg0.method4130();
		} else if (arg1 == 4) {
			this.anInt2447 = arg0.method4130();
		} else if (arg1 == 5) {
			this.anInt2450 = arg0.method4130();
		} else if (arg1 == 6) {
			this.anInt2451 = arg0.method4130();
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		this.aByteArray38 = Static79.method1380(this.anInt2447);
		this.method2161();
		for (@Pc(21) int local21 = this.anInt2454 - 1; local21 >= 1; local21--) {
			@Pc(28) short local28 = this.aShortArray45[local21];
			if (local28 > 8 || local28 < -8) {
				break;
			}
			this.anInt2454--;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[II)V")
	public void method2163(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = this.anInt2451 * Static342.anIntArray469[arg0];
		@Pc(118) int local118;
		@Pc(132) int local132;
		@Pc(44) int local44;
		@Pc(29) short local29;
		@Pc(109) int local109;
		@Pc(64) int local64;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(89) int local89;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(98) int local98;
		@Pc(107) int local107;
		if (this.anInt2454 == 1) {
			local44 = this.aShortArray44[0] << 12;
			local29 = this.aShortArray45[0];
			local51 = this.anInt2450 * local44 >> 12;
			local58 = this.anInt2451 * local44 >> 12;
			local64 = local44 * local12 >> 12;
			local68 = local64 >> 12;
			local72 = local68 + 1;
			@Pc(385) int local385 = local64 & 0xFFF;
			if (local58 <= local72) {
				local72 = 0;
			}
			local107 = this.aByteArray38[local72 & 0xFF] & 0xFF;
			local98 = this.aByteArray38[local68 & 0xFF] & 0xFF;
			local89 = Class130.anIntArray293[local385];
			if (this.aBoolean132) {
				for (local109 = 0; local109 < Static347.anInt5974; local109++) {
					local118 = Static384.anIntArray551[local109] * this.anInt2450;
					local132 = this.method2160(local44 * local118 >> 12, local89, local98, local51, local385, local107);
					@Pc(490) int local490 = local29 * local132 >> 12;
					arg1[local109] = (local490 >> 1) + 2048;
				}
			} else {
				for (local109 = 0; local109 < Static347.anInt5974; local109++) {
					local118 = this.anInt2450 * Static384.anIntArray551[local109];
					local132 = this.method2160(local118 * local44 >> 12, local89, local98, local51, local385, local107);
					arg1[local109] = local132 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray45[0];
		if (local29 > 8 || local29 < -8) {
			local44 = this.aShortArray44[0] << 12;
			local51 = this.anInt2450 * local44 >> 12;
			local58 = local44 * this.anInt2451 >> 12;
			local64 = local12 * local44 >> 12;
			local68 = local64 >> 12;
			local72 = local68 + 1;
			if (local72 >= local58) {
				local72 = 0;
			}
			local64 &= 0xFFF;
			local89 = Class130.anIntArray293[local64];
			local98 = this.aByteArray38[local68 & 0xFF] & 0xFF;
			local107 = this.aByteArray38[local72 & 0xFF] & 0xFF;
			for (local109 = 0; local109 < Static347.anInt5974; local109++) {
				local118 = Static384.anIntArray551[local109] * this.anInt2450;
				local132 = this.method2160(local118 * local44 >> 12, local89, local98, local51, local64, local107);
				arg1[local109] = local132 * local29 >> 12;
			}
		}
		for (@Pc(146) int local146 = 1; local146 < this.anInt2454; local146++) {
			local29 = this.aShortArray45[local146];
			if (local29 > 8 || local29 < -8) {
				local44 = this.aShortArray44[local146] << 12;
				local64 = local12 * local44 >> 12;
				local51 = local44 * this.anInt2450 >> 12;
				local58 = this.anInt2451 * local44 >> 12;
				local68 = local64 >> 12;
				local72 = local68 + 1;
				local64 &= 0xFFF;
				if (local72 >= local58) {
					local72 = 0;
				}
				local89 = Class130.anIntArray293[local64];
				local107 = this.aByteArray38[local72 & 0xFF] & 0xFF;
				local98 = this.aByteArray38[local68 & 0xFF] & 0xFF;
				if (this.aBoolean132 && local146 == this.anInt2454 - 1) {
					for (local109 = 0; local109 < Static347.anInt5974; local109++) {
						local118 = this.anInt2450 * Static384.anIntArray551[local109];
						local132 = this.method2160(local118 * local44 >> 12, local89, local98, local51, local64, local107);
						local132 = (local29 * local132 >> 12) + arg1[local109];
						arg1[local109] = (local132 >> 1) + 2048;
					}
				} else {
					for (local109 = 0; local109 < Static347.anInt5974; local109++) {
						local118 = this.anInt2450 * Static384.anIntArray551[local109];
						local132 = this.method2160(local118 * local44 >> 12, local89, local98, local51, local64, local107);
						arg1[local109] += local29 * local132 >> 12;
					}
				}
			}
		}
	}
}
