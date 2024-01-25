import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub4_Sub27 extends Class1_Sub4 {

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!pg", name = "M", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
	public int anInt5249 = 4;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
	public int anInt5251 = 4;

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
	public int anInt5256 = 4;

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
	public int anInt5250 = 0;

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "[B")
	private byte[] aByteArray72 = new byte[512];

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "Z")
	public boolean aBoolean378 = true;

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
	public int anInt5258 = 1638;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBIIII)I")
	private int method4354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 >> 12;
		@Pc(11) int local11 = local7 + 1;
		if (local11 >= arg1) {
			local11 = 0;
		}
		@Pc(20) int local20 = arg4 & 0xFFF;
		local7 &= 0xFF;
		local11 &= 0xFF;
		@Pc(32) int local32 = arg3 - 4096;
		@Pc(36) int local36 = local20 - 4096;
		@Pc(46) int local46 = this.aByteArray72[local7 + arg0] & 0x3;
		@Pc(50) int local50 = Class59.anIntArray151[local20];
		@Pc(65) int local65;
		if (local46 <= 1) {
			local65 = local46 == 0 ? arg3 + local20 : arg3 - local20;
		} else {
			local65 = local46 == 2 ? local20 - arg3 : -local20 + -arg3;
		}
		local46 = this.aByteArray72[local11 + arg0] & 0x3;
		@Pc(110) int local110;
		if (local46 <= 1) {
			local110 = local46 == 0 ? arg3 + local36 : -local36 + arg3;
		} else {
			local110 = local46 == 2 ? local36 - arg3 : -arg3 + -local36;
		}
		@Pc(138) int local138 = ((local110 - local65) * local50 >> 12) + local65;
		local46 = this.aByteArray72[arg5 + local7] & 0x3;
		if (local46 <= 1) {
			local65 = local46 == 0 ? local20 + local32 : local32 + -local20;
		} else {
			local65 = local46 == 2 ? local20 - local32 : -local32 + -local20;
		}
		local46 = this.aByteArray72[local11 + arg5] & 0x3;
		if (local46 <= 1) {
			local110 = local46 == 0 ? local36 + local32 : -local36 + local32;
		} else {
			local110 = local46 == 2 ? local36 - local32 : -local32 + -local36;
		}
		@Pc(234) int local234 = ((local110 - local65) * local50 >> 12) + local65;
		return local138 + ((local234 - local138) * arg2 >> 12);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[I)V")
	public void method4355(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(10) int local10 = Static266.anIntArray628[arg0] * this.anInt5251;
		@Pc(106) int local106;
		@Pc(120) int local120;
		@Pc(29) int local29;
		@Pc(34) short local34;
		@Pc(98) int local98;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(84) int local84;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (this.anInt5249 == 1) {
			local29 = this.aShortArray87[0] << 12;
			local34 = this.aShortArray86[0];
			local40 = local29 * local10 >> 12;
			local47 = this.anInt5256 * local29 >> 12;
			local54 = local29 * this.anInt5251 >> 12;
			local58 = local40 >> 12;
			local62 = local58 + 1;
			if (local54 <= local62) {
				local62 = 0;
			}
			local40 &= 0xFFF;
			local80 = this.aByteArray72[local58 & 0xFF] & 0xFF;
			local84 = Class59.anIntArray151[local40];
			local93 = this.aByteArray72[local62 & 0xFF] & 0xFF;
			if (this.aBoolean378) {
				for (local98 = 0; local98 < Static66.anInt1511; local98++) {
					local106 = this.anInt5256 * Static121.anIntArray197[local98];
					local120 = this.method4354(local80, local47, local84, local40, local29 * local106 >> 12, local93);
					local120 = local120 * local34 >> 12;
					arg1[local98] = (local120 >> 1) + 2048;
				}
			} else {
				for (local98 = 0; local98 < Static66.anInt1511; local98++) {
					local106 = Static121.anIntArray197[local98] * this.anInt5256;
					local120 = this.method4354(local80, local47, local84, local40, local29 * local106 >> 12, local93);
					arg1[local98] = local34 * local120 >> 12;
				}
			}
			return;
		}
		local34 = this.aShortArray86[0];
		if (local34 > 8 || local34 < -8) {
			local29 = this.aShortArray87[0] << 12;
			local47 = local29 * this.anInt5256 >> 12;
			local54 = local29 * this.anInt5251 >> 12;
			local40 = local29 * local10 >> 12;
			local58 = local40 >> 12;
			local62 = local58 + 1;
			if (local62 >= local54) {
				local62 = 0;
			}
			local40 &= 0xFFF;
			local80 = this.aByteArray72[local58 & 0xFF] & 0xFF;
			local84 = Class59.anIntArray151[local40];
			local93 = this.aByteArray72[local62 & 0xFF] & 0xFF;
			for (local98 = 0; local98 < Static66.anInt1511; local98++) {
				local106 = Static121.anIntArray197[local98] * this.anInt5256;
				local120 = this.method4354(local80, local47, local84, local40, local106 * local29 >> 12, local93);
				arg1[local98] = local34 * local120 >> 12;
			}
		}
		for (@Pc(299) int local299 = 1; local299 < this.anInt5249; local299++) {
			local34 = this.aShortArray86[local299];
			if (local34 > 8 || local34 < -8) {
				local29 = this.aShortArray87[local299] << 12;
				local40 = local29 * local10 >> 12;
				local47 = this.anInt5256 * local29 >> 12;
				local54 = local29 * this.anInt5251 >> 12;
				local58 = local40 >> 12;
				local62 = local58 + 1;
				if (local62 >= local54) {
					local62 = 0;
				}
				local40 &= 0xFFF;
				local80 = this.aByteArray72[local58 & 0xFF] & 0xFF;
				local84 = Class59.anIntArray151[local40];
				local93 = this.aByteArray72[local62 & 0xFF] & 0xFF;
				if (this.aBoolean378 && this.anInt5249 - 1 == local299) {
					for (local98 = 0; local98 < Static66.anInt1511; local98++) {
						local106 = Static121.anIntArray197[local98] * this.anInt5256;
						local120 = this.method4354(local80, local47, local84, local40, local29 * local106 >> 12, local93);
						local120 = arg1[local98] + (local34 * local120 >> 12);
						arg1[local98] = (local120 >> 1) + 2048;
					}
				} else {
					for (local98 = 0; local98 < Static66.anInt1511; local98++) {
						local106 = this.anInt5256 * Static121.anIntArray197[local98];
						local120 = this.method4354(local80, local47, local84, local40, local106 * local29 >> 12, local93);
						arg1[local98] += local34 * local120 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		this.aByteArray72 = Static459.method4527(this.anInt5250);
		this.method4356();
		for (@Pc(23) int local23 = this.anInt5249 - 1; local23 >= 1; local23--) {
			@Pc(29) short local29 = this.aShortArray86[local23];
			if (local29 > 8) {
				return;
			}
			if (local29 < -8) {
				return;
			}
			this.anInt5249--;
		}
	}

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "(I)V")
	private void method4356() {
		@Pc(22) int local22;
		if (this.anInt5258 > 0) {
			this.aShortArray86 = new short[this.anInt5249];
			this.aShortArray87 = new short[this.anInt5249];
			for (local22 = 0; local22 < this.anInt5249; local22++) {
				this.aShortArray86[local22] = (short) (Math.pow((double) ((float) this.anInt5258 / 4096.0F), (double) local22) * 4096.0D);
				this.aShortArray87[local22] = (short) Math.pow(2.0D, (double) local22);
			}
		} else if (this.aShortArray86 != null && this.anInt5249 == this.aShortArray86.length) {
			this.aShortArray87 = new short[this.anInt5249];
			for (local22 = 0; local22 < this.anInt5249; local22++) {
				this.aShortArray87[local22] = (short) Math.pow(2.0D, (double) local22);
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			this.method4355(arg0, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.aBoolean378 = arg1.method5366() == 1;
		} else if (arg0 == 1) {
			this.anInt5249 = arg1.method5366();
		} else if (arg0 == 2) {
			this.anInt5258 = arg1.method5380();
			if (this.anInt5258 < 0) {
				this.aShortArray86 = new short[this.anInt5249];
				for (@Pc(69) int local69 = 0; local69 < this.anInt5249; local69++) {
					this.aShortArray86[local69] = (short) arg1.method5380();
				}
			}
		} else if (arg0 == 3) {
			this.anInt5256 = this.anInt5251 = arg1.method5366();
		} else if (arg0 == 4) {
			this.anInt5250 = arg1.method5366();
		} else if (arg0 == 5) {
			this.anInt5256 = arg1.method5366();
		} else if (arg0 == 6) {
			this.anInt5251 = arg1.method5366();
		}
	}
}
