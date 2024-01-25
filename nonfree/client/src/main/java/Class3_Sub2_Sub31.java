import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class3_Sub2_Sub31 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qv", name = "H", descriptor = "[S")
	private short[] aShortArray166;

	@OriginalMember(owner = "client!qv", name = "K", descriptor = "[S")
	private short[] aShortArray167;

	@OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
	public int anInt8436 = 4;

	@OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
	public int anInt8440 = 4;

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "Z")
	public boolean aBoolean633 = true;

	@OriginalMember(owner = "client!qv", name = "L", descriptor = "I")
	public int anInt8444 = 0;

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
	public int anInt8435 = 1638;

	@OriginalMember(owner = "client!qv", name = "O", descriptor = "[B")
	private byte[] aByteArray93 = new byte[512];

	@OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
	public int anInt8438 = 4;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			this.method7149(local17, arg0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)V")
	private void method7145() {
		@Pc(23) int local23;
		if (this.anInt8435 > 0) {
			this.aShortArray167 = new short[this.anInt8440];
			this.aShortArray166 = new short[this.anInt8440];
			for (local23 = 0; local23 < this.anInt8440; local23++) {
				this.aShortArray166[local23] = (short) (int) (Math.pow((double) ((float) this.anInt8435 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray167[local23] = (short) (int) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray166 != null && this.anInt8440 == this.aShortArray166.length) {
			this.aShortArray167 = new short[this.anInt8440];
			for (local23 = 0; local23 < this.anInt8440; local23++) {
				this.aShortArray167[local23] = (short) (int) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIII)I")
	private int method7147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg5) {
			local13 = 0;
		}
		@Pc(22) int local22 = arg4 & 0xFFF;
		local9 &= 0xFF;
		@Pc(30) int local30 = local22 - 4096;
		local13 &= 0xFF;
		@Pc(38) int local38 = arg0 - 4096;
		@Pc(47) int local47 = this.aByteArray93[arg3 + local9] & 0x3;
		@Pc(51) int local51 = Class3_Sub2_Sub26.anIntArray476[local22];
		@Pc(71) int local71;
		if (local47 > 1) {
			local71 = local47 == 2 ? local22 - arg0 : -local22 - arg0;
		} else {
			local71 = local47 == 0 ? local22 + arg0 : arg0 - local22;
		}
		local47 = this.aByteArray93[local13 + arg3] & 0x3;
		@Pc(110) int local110;
		if (local47 > 1) {
			local110 = local47 == 2 ? local30 - arg0 : -arg0 + -local30;
		} else {
			local110 = local47 == 0 ? local30 + arg0 : -local30 + arg0;
		}
		local47 = this.aByteArray93[arg2 + local9] & 0x3;
		@Pc(143) int local143 = ((local110 - local71) * local51 >> 12) + local71;
		if (local47 <= 1) {
			local71 = local47 == 0 ? local38 + local22 : -local22 + local38;
		} else {
			local71 = local47 == 2 ? local22 - local38 : -local38 + -local22;
		}
		local47 = this.aByteArray93[local13 + arg2] & 0x3;
		if (local47 > 1) {
			local110 = local47 == 2 ? local30 - local38 : -local38 + -local30;
		} else {
			local110 = local47 == 0 ? local38 + local30 : local38 + -local30;
		}
		@Pc(230) int local230 = local71 + ((local110 - local71) * local51 >> 12);
		return ((local230 - local143) * arg1 >> 12) + local143;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "([III)V")
	public void method7149(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt8436 * Static201.anIntArray251[arg1];
		@Pc(105) int local105;
		@Pc(119) int local119;
		@Pc(28) int local28;
		@Pc(21) short local21;
		@Pc(96) int local96;
		@Pc(34) int local34;
		@Pc(48) int local48;
		@Pc(41) int local41;
		@Pc(82) int local82;
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(91) int local91;
		@Pc(78) int local78;
		if (this.anInt8440 == 1) {
			local21 = this.aShortArray166[0];
			local28 = this.aShortArray167[0] << 12;
			local34 = local12 * local28 >> 12;
			local41 = this.anInt8436 * local28 >> 12;
			local48 = this.anInt8438 * local28 >> 12;
			local52 = local34 >> 12;
			local56 = local52 + 1;
			if (local56 >= local41) {
				local56 = 0;
			}
			local34 &= 0xFFF;
			local78 = this.aByteArray93[local56 & 0xFF] & 0xFF;
			local82 = Class3_Sub2_Sub26.anIntArray476[local34];
			local91 = this.aByteArray93[local52 & 0xFF] & 0xFF;
			if (this.aBoolean633) {
				for (local96 = 0; local96 < Static30.anInt908; local96++) {
					local105 = this.anInt8438 * Static26.anIntArray20[local96];
					local119 = this.method7147(local34, local82, local78, local91, local28 * local105 >> 12, local48);
					local119 = local119 * local21 >> 12;
					arg0[local96] = (local119 >> 1) + 2048;
				}
			} else {
				for (local96 = 0; local96 < Static30.anInt908; local96++) {
					local105 = this.anInt8438 * Static26.anIntArray20[local96];
					local119 = this.method7147(local34, local82, local78, local91, local105 * local28 >> 12, local48);
					arg0[local96] = local119 * local21 >> 12;
				}
			}
			return;
		}
		local21 = this.aShortArray166[0];
		if (local21 > 8 || local21 < -8) {
			local28 = this.aShortArray167[0] << 12;
			local34 = local28 * local12 >> 12;
			local41 = this.anInt8436 * local28 >> 12;
			local48 = this.anInt8438 * local28 >> 12;
			local52 = local34 >> 12;
			local56 = local52 + 1;
			if (local41 <= local56) {
				local56 = 0;
			}
			local34 &= 0xFFF;
			local82 = Class3_Sub2_Sub26.anIntArray476[local34];
			local78 = this.aByteArray93[local56 & 0xFF] & 0xFF;
			local91 = this.aByteArray93[local52 & 0xFF] & 0xFF;
			for (local96 = 0; local96 < Static30.anInt908; local96++) {
				local105 = Static26.anIntArray20[local96] * this.anInt8438;
				local119 = this.method7147(local34, local82, local78, local91, local28 * local105 >> 12, local48);
				arg0[local96] = local119 * local21 >> 12;
			}
		}
		for (@Pc(308) int local308 = 1; local308 < this.anInt8440; local308++) {
			local21 = this.aShortArray166[local308];
			if (local21 > 8 || local21 < -8) {
				local28 = this.aShortArray167[local308] << 12;
				local41 = this.anInt8436 * local28 >> 12;
				local34 = local28 * local12 >> 12;
				local48 = local28 * this.anInt8438 >> 12;
				local52 = local34 >> 12;
				local56 = local52 + 1;
				local34 &= 0xFFF;
				if (local41 <= local56) {
					local56 = 0;
				}
				local82 = Class3_Sub2_Sub26.anIntArray476[local34];
				local78 = this.aByteArray93[local56 & 0xFF] & 0xFF;
				local91 = this.aByteArray93[local52 & 0xFF] & 0xFF;
				if (this.aBoolean633 && local308 == this.anInt8440 - 1) {
					for (local96 = 0; local96 < Static30.anInt908; local96++) {
						local105 = this.anInt8438 * Static26.anIntArray20[local96];
						local119 = this.method7147(local34, local82, local78, local91, local28 * local105 >> 12, local48);
						local119 = (local119 * local21 >> 12) + arg0[local96];
						arg0[local96] = (local119 >> 1) + 2048;
					}
				} else {
					for (local96 = 0; local96 < Static30.anInt908; local96++) {
						local105 = this.anInt8438 * Static26.anIntArray20[local96];
						local119 = this.method7147(local34, local82, local78, local91, local28 * local105 >> 12, local48);
						arg0[local96] += local119 * local21 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		this.aByteArray93 = Static190.method3052(this.anInt8444);
		this.method7145();
		for (@Pc(31) int local31 = this.anInt8440 - 1; local31 >= 1; local31--) {
			@Pc(38) short local38 = this.aShortArray166[local31];
			if (local38 > 8 || local38 < -8) {
				return;
			}
			this.anInt8440--;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean633 = arg0.method4888() == 1;
		} else if (arg1 == 1) {
			this.anInt8440 = arg0.method4888();
		} else if (arg1 == 2) {
			this.anInt8435 = arg0.method4869();
			if (this.anInt8435 < 0) {
				this.aShortArray166 = new short[this.anInt8440];
				for (@Pc(71) int local71 = 0; local71 < this.anInt8440; local71++) {
					this.aShortArray166[local71] = (short) arg0.method4869();
				}
			}
		} else if (arg1 == 3) {
			this.anInt8438 = this.anInt8436 = arg0.method4888();
		} else if (arg1 == 4) {
			this.anInt8444 = arg0.method4888();
		} else if (arg1 == 5) {
			this.anInt8438 = arg0.method4888();
		} else if (arg1 == 6) {
			this.anInt8436 = arg0.method4888();
		}
	}
}
