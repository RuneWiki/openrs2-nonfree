import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!oh", name = "X", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!oh", name = "Z", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
	private int anInt3419 = 4;

	@OriginalMember(owner = "client!oh", name = "gb", descriptor = "[B")
	private byte[] aByteArray45 = new byte[512];

	@OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
	private int anInt3420 = 4;

	@OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
	private int anInt3421 = 1638;

	@OriginalMember(owner = "client!oh", name = "eb", descriptor = "I")
	private int anInt3428 = 0;

	@OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
	private int anInt3431 = 4;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "(I)V")
	private void method2679() {
		@Pc(24) int local24;
		if (this.anInt3421 > 0) {
			this.aShortArray111 = new short[this.anInt3419];
			this.aShortArray112 = new short[this.anInt3419];
			for (local24 = 0; local24 < this.anInt3419; local24++) {
				this.aShortArray111[local24] = (short) (Math.pow((double) ((float) this.anInt3421 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray112[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray111 != null && this.anInt3419 == this.aShortArray111.length) {
			this.aShortArray112 = new short[this.anInt3419];
			for (local24 = 0; local24 < this.anInt3419; local24++) {
				this.aShortArray112[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		this.aByteArray45 = Static185.method3421(this.anInt3428);
		this.method2679();
		for (@Pc(25) int local25 = this.anInt3419 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray111[local25];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt3419--;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIIIII)I")
	private int method2681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 - 4096;
		@Pc(13) int local13 = arg2 >> 12;
		@Pc(17) int local17 = arg2 & 0xFFF;
		@Pc(21) int local21 = Class50.anIntArray377[local17];
		@Pc(25) int local25 = local13 + 1;
		@Pc(29) int local29 = local13 & 0xFF;
		@Pc(38) int local38 = this.aByteArray45[arg3 + local29] & 0x3;
		@Pc(42) int local42 = local17 - 4096;
		@Pc(65) int local65;
		if (local38 <= 1) {
			local65 = local38 == 0 ? arg5 + local17 : arg5 - local17;
		} else {
			local65 = local38 == 2 ? local17 - arg5 : -local17 + -arg5;
		}
		if (local25 >= arg4) {
			local25 = 0;
		}
		local25 &= 0xFF;
		local38 = this.aByteArray45[arg3 + local25] & 0x3;
		@Pc(117) int local117;
		if (local38 <= 1) {
			local117 = local38 == 0 ? arg5 + local42 : -local42 + arg5;
		} else {
			local117 = local38 == 2 ? local42 - arg5 : -arg5 + -local42;
		}
		@Pc(144) int local144 = ((local117 - local65) * local21 >> 12) + local65;
		local38 = this.aByteArray45[local29 + arg0] & 0x3;
		if (local38 <= 1) {
			local65 = local38 == 0 ? local17 + local9 : -local17 + local9;
		} else {
			local65 = local38 == 2 ? local17 - local9 : -local9 + -local17;
		}
		local38 = this.aByteArray45[arg0 + local25] & 0x3;
		if (local38 <= 1) {
			local117 = local38 == 0 ? local9 + local42 : local9 - local42;
		} else {
			local117 = local38 == 2 ? local42 - local9 : -local9 + -local42;
		}
		@Pc(239) int local239 = local65 + ((local117 - local65) * local21 >> 12);
		return local144 + ((local239 - local144) * arg1 >> 12);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI[I)V")
	private void method2682(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(18) int local18 = Static157.anIntArray604[arg0] * this.anInt3431;
		@Pc(107) int local107;
		@Pc(121) int local121;
		@Pc(34) int local34;
		@Pc(27) short local27;
		@Pc(98) int local98;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(79) int local79;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(75) int local75;
		@Pc(93) int local93;
		if (this.anInt3419 == 1) {
			local27 = this.aShortArray111[0];
			local34 = this.aShortArray112[0] << 12;
			local40 = local18 * local34 >> 12;
			local47 = this.anInt3420 * local34 >> 12;
			local54 = this.anInt3431 * local34 >> 12;
			local58 = local40 >> 12;
			local62 = local58 + 1;
			local40 &= 0xFFF;
			local75 = this.aByteArray45[local58 & 0xFF] & 0xFF;
			local79 = Class50.anIntArray377[local40];
			if (local62 >= local54) {
				local62 = 0;
			}
			local93 = this.aByteArray45[local62 & 0xFF] & 0xFF;
			if (this.aBoolean150) {
				for (local98 = 0; local98 < Static54.anInt953; local98++) {
					local107 = this.anInt3420 * Static179.anIntArray682[local98];
					local121 = this.method2681(local93, local79, local107 * local34 >> 12, local75, local47, local40);
					local121 = local121 * local27 >> 12;
					arg1[local98] = (local121 >> 1) + 2048;
				}
			} else {
				for (local98 = 0; local98 < Static54.anInt953; local98++) {
					local107 = this.anInt3420 * Static179.anIntArray682[local98];
					local121 = this.method2681(local93, local79, local107 * local34 >> 12, local75, local47, local40);
					arg1[local98] = local27 * local121 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray111[0];
		if (local27 > 8 || local27 < -8) {
			local34 = this.aShortArray112[0] << 12;
			local47 = this.anInt3420 * local34 >> 12;
			local54 = this.anInt3431 * local34 >> 12;
			local40 = local18 * local34 >> 12;
			local58 = local40 >> 12;
			local62 = local58 + 1;
			local75 = this.aByteArray45[local58 & 0xFF] & 0xFF;
			if (local62 >= local54) {
				local62 = 0;
			}
			local40 &= 0xFFF;
			local93 = this.aByteArray45[local62 & 0xFF] & 0xFF;
			local79 = Class50.anIntArray377[local40];
			for (local98 = 0; local98 < Static54.anInt953; local98++) {
				local107 = this.anInt3420 * Static179.anIntArray682[local98];
				local121 = this.method2681(local93, local79, local107 * local34 >> 12, local75, local47, local40);
				arg1[local98] = local121 * local27 >> 12;
			}
		}
		for (@Pc(298) int local298 = 1; local298 < this.anInt3419; local298++) {
			local27 = this.aShortArray111[local298];
			if (local27 > 8 || local27 < -8) {
				local34 = this.aShortArray112[local298] << 12;
				local40 = local18 * local34 >> 12;
				local54 = local34 * this.anInt3431 >> 12;
				local47 = this.anInt3420 * local34 >> 12;
				local58 = local40 >> 12;
				local62 = local58 + 1;
				local75 = this.aByteArray45[local58 & 0xFF] & 0xFF;
				local40 &= 0xFFF;
				if (local62 >= local54) {
					local62 = 0;
				}
				local93 = this.aByteArray45[local62 & 0xFF] & 0xFF;
				local79 = Class50.anIntArray377[local40];
				if (this.aBoolean150 && this.anInt3419 - 1 == local298) {
					for (local98 = 0; local98 < Static54.anInt953; local98++) {
						local107 = this.anInt3420 * Static179.anIntArray682[local98];
						local121 = this.method2681(local93, local79, local107 * local34 >> 12, local75, local47, local40);
						local121 = arg1[local98] + (local27 * local121 >> 12);
						arg1[local98] = (local121 >> 1) + 2048;
					}
				} else {
					for (local98 = 0; local98 < Static54.anInt953; local98++) {
						local107 = this.anInt3420 * Static179.anIntArray682[local98];
						local121 = this.method2681(local93, local79, local34 * local107 >> 12, local75, local47, local40);
						arg1[local98] += local27 * local121 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			this.method2682(arg0, local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean150 = arg0.method2122() == 1;
		} else if (arg1 == 1) {
			this.anInt3419 = arg0.method2122();
		} else if (arg1 == 2) {
			this.anInt3421 = arg0.method2104();
			if (this.anInt3421 < 0) {
				this.aShortArray111 = new short[this.anInt3419];
				for (@Pc(81) int local81 = 0; local81 < this.anInt3419; local81++) {
					this.aShortArray111[local81] = (short) arg0.method2104();
				}
			}
		} else if (arg1 == 3) {
			this.anInt3420 = this.anInt3431 = arg0.method2122();
		} else if (arg1 == 4) {
			this.anInt3428 = arg0.method2122();
		} else if (arg1 == 5) {
			this.anInt3420 = arg0.method2122();
		} else if (arg1 == 6) {
			this.anInt3431 = arg0.method2122();
		}
	}
}
