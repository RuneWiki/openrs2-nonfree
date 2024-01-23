import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dm", name = "W", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!dm", name = "ab", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!dm", name = "I", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!dm", name = "O", descriptor = "[B")
	private byte[] aByteArray8 = new byte[512];

	@OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
	public int anInt1428 = 1638;

	@OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
	public int anInt1424 = 4;

	@OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
	public int anInt1426 = 4;

	@OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
	public int anInt1431 = 4;

	@OriginalMember(owner = "client!dm", name = "bb", descriptor = "I")
	public int anInt1433 = 0;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[I)V")
	public void method1104(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt1424 * Static272.anIntArray521[arg0];
		@Pc(113) int local113;
		@Pc(127) int local127;
		@Pc(41) int local41;
		@Pc(25) short local25;
		@Pc(103) int local103;
		@Pc(47) int local47;
		@Pc(101) int local101;
		@Pc(62) int local62;
		@Pc(85) int local85;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(71) int local71;
		@Pc(94) int local94;
		if (this.anInt1431 == 1) {
			local41 = this.aShortArray8[0] << 12;
			local25 = this.aShortArray7[0];
			local101 = this.anInt1426 * local41 >> 12;
			local62 = local41 * this.anInt1424 >> 12;
			local47 = local41 * local12 >> 12;
			local51 = local47 >> 12;
			local55 = local51 + 1;
			local71 = this.aByteArray8[local51 & 0xFF] & 0xFF;
			local47 &= 0xFFF;
			local85 = Class2_Sub5.anIntArray51[local47];
			if (local62 <= local55) {
				local55 = 0;
			}
			local94 = this.aByteArray8[local55 & 0xFF] & 0xFF;
			if (this.aBoolean94) {
				for (local103 = 0; local103 < Static281.anInt5558; local103++) {
					local113 = this.anInt1426 * Static234.anIntArray462[local103];
					local127 = this.method1108(local47, local94, local85, local71, local41 * local113 >> 12, local101);
					local127 = local127 * local25 >> 12;
					arg1[local103] = (local127 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static281.anInt5558; local103++) {
					local113 = this.anInt1426 * Static234.anIntArray462[local103];
					local127 = this.method1108(local47, local94, local85, local71, local41 * local113 >> 12, local101);
					arg1[local103] = local25 * local127 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray7[0];
		if (local25 > 8 || local25 < -8) {
			local41 = this.aShortArray8[0] << 12;
			local47 = local41 * local12 >> 12;
			local51 = local47 >> 12;
			local55 = local51 + 1;
			local62 = this.anInt1424 * local41 >> 12;
			local71 = this.aByteArray8[local51 & 0xFF] & 0xFF;
			@Pc(75) int local75 = local47 & 0xFFF;
			if (local62 <= local55) {
				local55 = 0;
			}
			local85 = Class2_Sub5.anIntArray51[local75];
			local94 = this.aByteArray8[local55 & 0xFF] & 0xFF;
			local101 = local41 * this.anInt1426 >> 12;
			for (local103 = 0; local103 < Static281.anInt5558; local103++) {
				local113 = this.anInt1426 * Static234.anIntArray462[local103];
				local127 = this.method1108(local75, local94, local85, local71, local113 * local41 >> 12, local101);
				arg1[local103] = local127 * local25 >> 12;
			}
		}
		for (@Pc(140) int local140 = 1; local140 < this.anInt1431; local140++) {
			local25 = this.aShortArray7[local140];
			if (local25 > 8 || local25 < -8) {
				local41 = this.aShortArray8[local140] << 12;
				local47 = local41 * local12 >> 12;
				local51 = local47 >> 12;
				local71 = this.aByteArray8[local51 & 0xFF] & 0xFF;
				local101 = local41 * this.anInt1426 >> 12;
				local62 = local41 * this.anInt1424 >> 12;
				local47 &= 0xFFF;
				local55 = local51 + 1;
				if (local55 >= local62) {
					local55 = 0;
				}
				local94 = this.aByteArray8[local55 & 0xFF] & 0xFF;
				local85 = Class2_Sub5.anIntArray51[local47];
				if (this.aBoolean94 && this.anInt1431 - 1 == local140) {
					for (local103 = 0; local103 < Static281.anInt5558; local103++) {
						local113 = this.anInt1426 * Static234.anIntArray462[local103];
						local127 = this.method1108(local47, local94, local85, local71, local113 * local41 >> 12, local101);
						local127 = (local127 * local25 >> 12) + arg1[local103];
						arg1[local103] = (local127 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static281.anInt5558; local103++) {
						local113 = this.anInt1426 * Static234.anIntArray462[local103];
						local127 = this.method1108(local47, local94, local85, local71, local41 * local113 >> 12, local101);
						arg1[local103] += local25 * local127 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			this.method1104(arg0, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V")
	private void method1106() {
		@Pc(24) int local24;
		if (this.anInt1428 > 0) {
			this.aShortArray8 = new short[this.anInt1431];
			this.aShortArray7 = new short[this.anInt1431];
			for (local24 = 0; local24 < this.anInt1431; local24++) {
				this.aShortArray7[local24] = (short) (Math.pow((double) ((float) this.anInt1428 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray8[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray7 != null && this.aShortArray7.length == this.anInt1431) {
			this.aShortArray8 = new short[this.anInt1431];
			for (local24 = 0; local24 < this.anInt1431; local24++) {
				this.aShortArray8[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIZ)I")
	private int method1108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg0 - 4096;
		@Pc(13) int local13 = arg4 >> 12;
		@Pc(17) int local17 = local13 + 1;
		@Pc(21) int local21 = local13 & 0xFF;
		if (arg5 <= local17) {
			local17 = 0;
		}
		@Pc(37) int local37 = this.aByteArray8[local21 + arg3] & 0x3;
		local17 &= 0xFF;
		@Pc(45) int local45 = arg4 & 0xFFF;
		@Pc(49) int local49 = Class2_Sub5.anIntArray51[local45];
		@Pc(68) int local68;
		if (local37 > 1) {
			local68 = local37 == 2 ? local45 - arg0 : -arg0 + -local45;
		} else {
			local68 = local37 == 0 ? local45 + arg0 : -local45 + arg0;
		}
		@Pc(88) int local88 = local45 - 4096;
		local37 = this.aByteArray8[arg3 + local17] & 0x3;
		@Pc(118) int local118;
		if (local37 > 1) {
			local118 = local37 == 2 ? local88 - arg0 : -local88 + -arg0;
		} else {
			local118 = local37 == 0 ? arg0 + local88 : arg0 - local88;
		}
		@Pc(141) int local141 = ((local118 - local68) * local49 >> 12) + local68;
		local37 = this.aByteArray8[local21 + arg1] & 0x3;
		if (local37 > 1) {
			local68 = local37 == 2 ? local45 - local9 : -local9 + -local45;
		} else {
			local68 = local37 == 0 ? local45 + local9 : local9 - local45;
		}
		local37 = this.aByteArray8[arg1 + local17] & 0x3;
		if (local37 <= 1) {
			local118 = local37 == 0 ? local9 + local88 : -local88 + local9;
		} else {
			local118 = local37 == 2 ? local88 - local9 : -local9 + -local88;
		}
		@Pc(241) int local241 = local68 + (local49 * (local118 - local68) >> 12);
		return local141 + (arg2 * (local241 - local141) >> 12);
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		this.aByteArray8 = Static80.method1473(this.anInt1433);
		this.method1106();
		for (@Pc(23) int local23 = this.anInt1431 - 1; local23 >= 1; local23--) {
			@Pc(31) short local31 = this.aShortArray7[local23];
			if (local31 > 8 || local31 < -8) {
				break;
			}
			this.anInt1431--;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean94 = arg0.method2146() == 1;
		} else if (arg1 == 1) {
			this.anInt1431 = arg0.method2146();
		} else if (arg1 == 2) {
			this.anInt1428 = arg0.method2191();
			if (this.anInt1428 < 0) {
				this.aShortArray7 = new short[this.anInt1431];
				for (@Pc(72) int local72 = 0; local72 < this.anInt1431; local72++) {
					this.aShortArray7[local72] = (short) arg0.method2191();
				}
			}
		} else if (arg1 == 3) {
			this.anInt1426 = this.anInt1424 = arg0.method2146();
		} else if (arg1 == 4) {
			this.anInt1433 = arg0.method2146();
		} else if (arg1 == 5) {
			this.anInt1426 = arg0.method2146();
		} else if (arg1 == 6) {
			this.anInt1424 = arg0.method2146();
		}
	}
}
