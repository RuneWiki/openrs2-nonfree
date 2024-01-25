import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class6_Sub1_Sub30 extends Class6_Sub1 {

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	public int anInt4989 = 4;

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "[B")
	private byte[] aByteArray79 = new byte[512];

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
	public int anInt4998 = 1638;

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
	public int anInt4997 = 4;

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
	public int anInt4999 = 4;

	@OriginalMember(owner = "client!rb", name = "P", descriptor = "Z")
	public boolean aBoolean350 = true;

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
	public int anInt5002 = 0;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
	private void method4557() {
		@Pc(27) int local27;
		if (this.anInt4998 > 0) {
			this.aShortArray91 = new short[this.anInt4997];
			this.aShortArray92 = new short[this.anInt4997];
			for (local27 = 0; local27 < this.anInt4997; local27++) {
				this.aShortArray92[local27] = (short) (Math.pow((double) ((float) this.anInt4998 / 4096.0F), (double) local27) * 4096.0D);
				this.aShortArray91[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		} else if (this.aShortArray92 != null && this.anInt4997 == this.aShortArray92.length) {
			this.aShortArray91 = new short[this.anInt4997];
			for (local27 = 0; local27 < this.anInt4997; local27++) {
				this.aShortArray91[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			this.method4562(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		this.aByteArray79 = Static184.method3478(this.anInt5002);
		this.method4557();
		for (@Pc(24) int local24 = this.anInt4997 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray92[local24];
			if (local31 > 8) {
				return;
			}
			if (local31 < -8) {
				return;
			}
			this.anInt4997--;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIIIIII)I")
	private int method4560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		@Pc(21) int local21 = arg0 & 0xFFF;
		if (local13 >= arg4) {
			local13 = 0;
		}
		@Pc(34) int local34 = local21 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = arg3 - 4096;
		@Pc(46) int local46 = Class144.anIntArray452[local21];
		@Pc(55) int local55 = this.aByteArray79[local17 + arg2] & 0x3;
		@Pc(70) int local70;
		if (local55 <= 1) {
			local70 = local55 == 0 ? local21 + arg3 : -local21 + arg3;
		} else {
			local70 = local55 == 2 ? local21 - arg3 : -arg3 + -local21;
		}
		local55 = this.aByteArray79[local13 + arg2] & 0x3;
		@Pc(113) int local113;
		if (local55 > 1) {
			local113 = local55 == 2 ? local34 - arg3 : -arg3 + -local34;
		} else {
			local113 = local55 == 0 ? local34 + arg3 : -local34 + arg3;
		}
		@Pc(137) int local137 = (local46 * (local113 - local70) >> 12) + local70;
		local55 = this.aByteArray79[arg5 + local17] & 0x3;
		if (local55 <= 1) {
			local70 = local55 == 0 ? local21 + local42 : local42 + -local21;
		} else {
			local70 = local55 == 2 ? local21 - local42 : -local21 + -local42;
		}
		local55 = this.aByteArray79[arg5 + local13] & 0x3;
		if (local55 <= 1) {
			local113 = local55 == 0 ? local42 + local34 : local42 - local34;
		} else {
			local113 = local55 == 2 ? local34 - local42 : -local34 - local42;
		}
		@Pc(228) int local228 = (local46 * (local113 - local70) >> 12) + local70;
		return local137 + ((local228 - local137) * arg1 >> 12);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([III)V")
	public void method4562(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static273.anIntArray703[arg1] * this.anInt4999;
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(41) int local41;
		@Pc(28) short local28;
		@Pc(102) int local102;
		@Pc(47) int local47;
		@Pc(61) int local61;
		@Pc(54) int local54;
		@Pc(91) int local91;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(100) int local100;
		@Pc(87) int local87;
		if (this.anInt4997 == 1) {
			local28 = this.aShortArray92[0];
			local41 = this.aShortArray91[0] << 12;
			local47 = local17 * local41 >> 12;
			local54 = this.anInt4999 * local41 >> 12;
			local61 = local41 * this.anInt4989 >> 12;
			local65 = local47 >> 12;
			local69 = local65 + 1;
			if (local54 <= local69) {
				local69 = 0;
			}
			local47 &= 0xFFF;
			local91 = Class144.anIntArray452[local47];
			local87 = this.aByteArray79[local69 & 0xFF] & 0xFF;
			local100 = this.aByteArray79[local65 & 0xFF] & 0xFF;
			if (this.aBoolean350) {
				for (local102 = 0; local102 < Static299.anInt5659; local102++) {
					local111 = Static18.anIntArray32[local102] * this.anInt4989;
					local125 = this.method4560(local41 * local111 >> 12, local91, local100, local47, local61, local87);
					@Pc(476) int local476 = local28 * local125 >> 12;
					arg0[local102] = (local476 >> 1) + 2048;
				}
			} else {
				for (local102 = 0; local102 < Static299.anInt5659; local102++) {
					local111 = Static18.anIntArray32[local102] * this.anInt4989;
					local125 = this.method4560(local41 * local111 >> 12, local91, local100, local47, local61, local87);
					arg0[local102] = local125 * local28 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray92[0];
		if (local28 > 8 || local28 < -8) {
			local41 = this.aShortArray91[0] << 12;
			local47 = local17 * local41 >> 12;
			local54 = this.anInt4999 * local41 >> 12;
			local61 = this.anInt4989 * local41 >> 12;
			local65 = local47 >> 12;
			local69 = local65 + 1;
			local47 &= 0xFFF;
			if (local54 <= local69) {
				local69 = 0;
			}
			local87 = this.aByteArray79[local69 & 0xFF] & 0xFF;
			local91 = Class144.anIntArray452[local47];
			local100 = this.aByteArray79[local65 & 0xFF] & 0xFF;
			for (local102 = 0; local102 < Static299.anInt5659; local102++) {
				local111 = Static18.anIntArray32[local102] * this.anInt4989;
				local125 = this.method4560(local41 * local111 >> 12, local91, local100, local47, local61, local87);
				arg0[local102] = local28 * local125 >> 12;
			}
		}
		for (@Pc(143) int local143 = 1; local143 < this.anInt4997; local143++) {
			local28 = this.aShortArray92[local143];
			if (local28 > 8 || local28 < -8) {
				local41 = this.aShortArray91[local143] << 12;
				local61 = local41 * this.anInt4989 >> 12;
				local54 = local41 * this.anInt4999 >> 12;
				local47 = local41 * local17 >> 12;
				local65 = local47 >> 12;
				local69 = local65 + 1;
				local47 &= 0xFFF;
				if (local69 >= local54) {
					local69 = 0;
				}
				local87 = this.aByteArray79[local69 & 0xFF] & 0xFF;
				local91 = Class144.anIntArray452[local47];
				local100 = this.aByteArray79[local65 & 0xFF] & 0xFF;
				if (this.aBoolean350 && this.anInt4997 - 1 == local143) {
					for (local102 = 0; local102 < Static299.anInt5659; local102++) {
						local111 = this.anInt4989 * Static18.anIntArray32[local102];
						local125 = this.method4560(local111 * local41 >> 12, local91, local100, local47, local61, local87);
						local125 = (local28 * local125 >> 12) + arg0[local102];
						arg0[local102] = (local125 >> 1) + 2048;
					}
				} else {
					for (local102 = 0; local102 < Static299.anInt5659; local102++) {
						local111 = Static18.anIntArray32[local102] * this.anInt4989;
						local125 = this.method4560(local111 * local41 >> 12, local91, local100, local47, local61, local87);
						arg0[local102] += local28 * local125 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean350 = arg0.method3972() == 1;
		} else if (arg1 == 1) {
			this.anInt4997 = arg0.method3972();
		} else if (arg1 == 2) {
			this.anInt4998 = arg0.method4022();
			if (this.anInt4998 < 0) {
				this.aShortArray92 = new short[this.anInt4997];
				for (@Pc(75) int local75 = 0; local75 < this.anInt4997; local75++) {
					this.aShortArray92[local75] = (short) arg0.method4022();
				}
			}
		} else if (arg1 == 3) {
			this.anInt4989 = this.anInt4999 = arg0.method3972();
		} else if (arg1 == 4) {
			this.anInt5002 = arg0.method3972();
		} else if (arg1 == 5) {
			this.anInt4989 = arg0.method3972();
		} else if (arg1 == 6) {
			this.anInt4999 = arg0.method3972();
		}
	}
}
