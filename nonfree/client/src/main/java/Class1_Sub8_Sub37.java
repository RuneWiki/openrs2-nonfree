import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class1_Sub8_Sub37 extends Class1_Sub8 {

	@OriginalMember(owner = "client!vf", name = "R", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
	public int anInt7538 = 1638;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "Z")
	public boolean aBoolean487 = true;

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
	public int anInt7539 = 4;

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
	public int anInt7545 = 4;

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
	public int anInt7546 = 0;

	@OriginalMember(owner = "client!vf", name = "W", descriptor = "[B")
	private byte[] aByteArray90 = new byte[512];

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
	public int anInt7549 = 4;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.aBoolean487 = arg1.method1171() == 1;
		} else if (arg0 == 1) {
			this.anInt7545 = arg1.method1171();
		} else if (arg0 == 2) {
			this.anInt7538 = arg1.method1215();
			if (this.anInt7538 < 0) {
				this.aShortArray135 = new short[this.anInt7545];
				for (@Pc(77) int local77 = 0; local77 < this.anInt7545; local77++) {
					this.aShortArray135[local77] = (short) arg1.method1215();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt7539 = this.anInt7549 = arg1.method1171();
			return;
		} else if (arg0 == 4) {
			this.anInt7546 = arg1.method1171();
			return;
		} else if (arg0 == 5) {
			this.anInt7539 = arg1.method1171();
			return;
		} else if (arg0 == 6) {
			this.anInt7549 = arg1.method1171();
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		this.aByteArray90 = Static175.method2963(this.anInt7546);
		this.method5761();
		for (@Pc(17) int local17 = this.anInt7545 - 1; local17 >= 1; local17--) {
			@Pc(28) short local28 = this.aShortArray135[local17];
			if (local28 > 8 || local28 < -8) {
				return;
			}
			this.anInt7545--;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIZI)I")
	private int method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg1 >> 12;
		@Pc(19) int local19 = local15 + 1;
		@Pc(23) int local23 = local15 & 0xFF;
		if (local19 >= arg5) {
			local19 = 0;
		}
		@Pc(32) int local32 = arg1 & 0xFFF;
		@Pc(36) int local36 = arg3 - 4096;
		local19 &= 0xFF;
		@Pc(44) int local44 = local32 - 4096;
		@Pc(48) int local48 = Class1_Sub1_Sub10.anIntArray538[local32];
		@Pc(57) int local57 = this.aByteArray90[local23 + arg4] & 0x3;
		@Pc(71) int local71;
		if (local57 <= 1) {
			local71 = local57 == 0 ? local32 + arg3 : arg3 + -local32;
		} else {
			local71 = local57 == 2 ? local32 - arg3 : -local32 + -arg3;
		}
		local57 = this.aByteArray90[arg4 + local19] & 0x3;
		@Pc(110) int local110;
		if (local57 <= 1) {
			local110 = local57 == 0 ? local44 + arg3 : -local44 + arg3;
		} else {
			local110 = local57 == 2 ? local44 - arg3 : -local44 + -arg3;
		}
		@Pc(136) int local136 = local71 + ((local110 - local71) * local48 >> 12);
		local57 = this.aByteArray90[local23 + arg2] & 0x3;
		if (local57 > 1) {
			local71 = local57 == 2 ? local32 - local36 : -local32 + -local36;
		} else {
			local71 = local57 == 0 ? local36 + local32 : local36 + -local32;
		}
		local57 = this.aByteArray90[arg2 + local19] & 0x3;
		if (local57 > 1) {
			local110 = local57 == 2 ? local44 - local36 : -local44 - local36;
		} else {
			local110 = local57 == 0 ? local36 + local44 : local36 - local44;
		}
		@Pc(228) int local228 = local71 + ((local110 - local71) * local48 >> 12);
		return local136 + (arg0 * (local228 - local136) >> 12);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			this.method5759(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([III)V")
	public void method5759(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7549 * Static134.anIntArray308[arg1];
		@Pc(113) int local113;
		@Pc(127) int local127;
		@Pc(40) int local40;
		@Pc(25) short local25;
		@Pc(105) int local105;
		@Pc(46) int local46;
		@Pc(60) int local60;
		@Pc(53) int local53;
		@Pc(103) int local103;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(99) int local99;
		@Pc(90) int local90;
		if (this.anInt7545 == 1) {
			local40 = this.aShortArray134[0] << 12;
			local25 = this.aShortArray135[0];
			local46 = local40 * local14 >> 12;
			local60 = this.anInt7539 * local40 >> 12;
			local53 = this.anInt7549 * local40 >> 12;
			local64 = local46 >> 12;
			local68 = local64 + 1;
			@Pc(376) int local376 = local46 & 0xFFF;
			if (local68 >= local53) {
				local68 = 0;
			}
			local90 = this.aByteArray90[local68 & 0xFF] & 0xFF;
			local103 = Class1_Sub1_Sub10.anIntArray538[local376];
			local99 = this.aByteArray90[local64 & 0xFF] & 0xFF;
			if (this.aBoolean487) {
				for (local105 = 0; local105 < Static18.anInt439; local105++) {
					local113 = Static198.anIntArray749[local105] * this.anInt7539;
					local127 = this.method5757(local103, local113 * local40 >> 12, local90, local376, local99, local60);
					@Pc(481) int local481 = local25 * local127 >> 12;
					arg0[local105] = (local481 >> 1) + 2048;
				}
			} else {
				for (local105 = 0; local105 < Static18.anInt439; local105++) {
					local113 = Static198.anIntArray749[local105] * this.anInt7539;
					local127 = this.method5757(local103, local40 * local113 >> 12, local90, local376, local99, local60);
					arg0[local105] = local25 * local127 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray135[0];
		if (local25 > 8 || local25 < -8) {
			local40 = this.aShortArray134[0] << 12;
			local46 = local14 * local40 >> 12;
			local53 = this.anInt7549 * local40 >> 12;
			local60 = local40 * this.anInt7539 >> 12;
			local64 = local46 >> 12;
			local68 = local64 + 1;
			local46 &= 0xFFF;
			if (local68 >= local53) {
				local68 = 0;
			}
			local90 = this.aByteArray90[local68 & 0xFF] & 0xFF;
			local99 = this.aByteArray90[local64 & 0xFF] & 0xFF;
			local103 = Class1_Sub1_Sub10.anIntArray538[local46];
			for (local105 = 0; local105 < Static18.anInt439; local105++) {
				local113 = this.anInt7539 * Static198.anIntArray749[local105];
				local127 = this.method5757(local103, local113 * local40 >> 12, local90, local46, local99, local60);
				arg0[local105] = local25 * local127 >> 12;
			}
		}
		for (@Pc(145) int local145 = 1; local145 < this.anInt7545; local145++) {
			local25 = this.aShortArray135[local145];
			if (local25 > 8 || local25 < -8) {
				local40 = this.aShortArray134[local145] << 12;
				local53 = this.anInt7549 * local40 >> 12;
				local60 = local40 * this.anInt7539 >> 12;
				local46 = local40 * local14 >> 12;
				local64 = local46 >> 12;
				local68 = local64 + 1;
				if (local68 >= local53) {
					local68 = 0;
				}
				local46 &= 0xFFF;
				local90 = this.aByteArray90[local68 & 0xFF] & 0xFF;
				local103 = Class1_Sub1_Sub10.anIntArray538[local46];
				local99 = this.aByteArray90[local64 & 0xFF] & 0xFF;
				if (this.aBoolean487 && this.anInt7545 - 1 == local145) {
					for (local105 = 0; local105 < Static18.anInt439; local105++) {
						local113 = this.anInt7539 * Static198.anIntArray749[local105];
						local127 = this.method5757(local103, local40 * local113 >> 12, local90, local46, local99, local60);
						local127 = (local25 * local127 >> 12) + arg0[local105];
						arg0[local105] = (local127 >> 1) + 2048;
					}
				} else {
					for (local105 = 0; local105 < Static18.anInt439; local105++) {
						local113 = this.anInt7539 * Static198.anIntArray749[local105];
						local127 = this.method5757(local103, local40 * local113 >> 12, local90, local46, local99, local60);
						arg0[local105] += local25 * local127 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
	private void method5761() {
		@Pc(22) int local22;
		if (this.anInt7538 > 0) {
			this.aShortArray135 = new short[this.anInt7545];
			this.aShortArray134 = new short[this.anInt7545];
			for (local22 = 0; local22 < this.anInt7545; local22++) {
				this.aShortArray135[local22] = (short) (Math.pow((double) ((float) this.anInt7538 / 4096.0F), (double) local22) * 4096.0D);
				this.aShortArray134[local22] = (short) Math.pow(2.0D, (double) local22);
			}
		} else if (this.aShortArray135 != null && this.anInt7545 == this.aShortArray135.length) {
			this.aShortArray134 = new short[this.anInt7545];
			for (local22 = 0; local22 < this.anInt7545; local22++) {
				this.aShortArray134[local22] = (short) Math.pow(2.0D, (double) local22);
			}
		}
	}
}
