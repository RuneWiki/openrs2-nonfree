import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class3_Sub1_Sub32 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tw", name = "J", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!tw", name = "E", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!tw", name = "R", descriptor = "I")
	public int anInt9881 = 4;

	@OriginalMember(owner = "client!tw", name = "I", descriptor = "I")
	public int anInt9879 = 1638;

	@OriginalMember(owner = "client!tw", name = "M", descriptor = "I")
	public int anInt9873 = 4;

	@OriginalMember(owner = "client!tw", name = "L", descriptor = "I")
	public int anInt9876 = 4;

	@OriginalMember(owner = "client!tw", name = "B", descriptor = "[B")
	private byte[] aByteArray96 = new byte[512];

	@OriginalMember(owner = "client!tw", name = "z", descriptor = "Z")
	public boolean aBoolean666 = true;

	@OriginalMember(owner = "client!tw", name = "Q", descriptor = "I")
	public int anInt9884 = 0;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean666 = arg1.method2048(255) == 1;
		} else if (arg0 == 1) {
			this.anInt9881 = arg1.method2048(255);
		} else if (arg0 == 2) {
			this.anInt9879 = arg1.method2017();
			if (this.anInt9879 < 0) {
				this.aShortArray131 = new short[this.anInt9881];
				for (@Pc(96) int local96 = 0; local96 < this.anInt9881; local96++) {
					this.aShortArray131[local96] = (short) arg1.method2017();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt9876 = this.anInt9873 = arg1.method2048(255);
			return;
		} else if (arg0 == 4) {
			this.anInt9884 = arg1.method2048(255);
			return;
		} else if (arg0 == 5) {
			this.anInt9876 = arg1.method2048(255);
			return;
		} else if (arg0 == 6) {
			this.anInt9873 = arg1.method2048(255);
			return;
		}
	}

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "(I)V")
	private void method8409() {
		@Pc(36) int local36;
		if (this.anInt9879 > 0) {
			this.aShortArray132 = new short[this.anInt9881];
			this.aShortArray131 = new short[this.anInt9881];
			for (local36 = 0; local36 < this.anInt9881; local36++) {
				this.aShortArray131[local36] = (short) (int) (Math.pow((double) ((float) this.anInt9879 / 4096.0F), (double) local36) * 4096.0D);
				this.aShortArray132[local36] = (short) (int) Math.pow(2.0D, (double) local36);
			}
		} else if (this.aShortArray131 != null && this.anInt9881 == this.aShortArray131.length) {
			this.aShortArray132 = new short[this.anInt9881];
			for (local36 = 0; local36 < this.anInt9881; local36++) {
				this.aShortArray132[local36] = (short) (int) Math.pow(2.0D, (double) local36);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		this.aByteArray96 = Static179.method2870(this.anInt9884);
		this.method8409();
		for (@Pc(27) int local27 = this.anInt9881 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray131[local27];
			if (local34 > 8 || local34 < -8) {
				return;
			}
			this.anInt9881--;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			this.method8414(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B[II)V")
	public void method8414(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static121.anIntArray145[arg1] * this.anInt9873;
		@Pc(121) int local121;
		@Pc(135) int local135;
		@Pc(47) int local47;
		@Pc(28) short local28;
		@Pc(112) int local112;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(54) int local54;
		@Pc(110) int local110;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(97) int local97;
		@Pc(106) int local106;
		if (this.anInt9881 == 1) {
			local47 = this.aShortArray132[0] << 12;
			local28 = this.aShortArray131[0];
			local54 = local47 * this.anInt9873 >> 12;
			local67 = local47 * this.anInt9876 >> 12;
			local60 = local47 * local12 >> 12;
			local71 = local60 >> 12;
			local75 = local71 + 1;
			if (local54 <= local75) {
				local75 = 0;
			}
			local60 &= 0xFFF;
			local97 = this.aByteArray96[local71 & 0xFF] & 0xFF;
			local110 = Class21_Sub15.anIntArray413[local60];
			local106 = this.aByteArray96[local75 & 0xFF] & 0xFF;
			if (this.aBoolean666) {
				for (local112 = 0; local112 < Static379.anInt5859; local112++) {
					local121 = Static497.anIntArray579[local112] * this.anInt9876;
					local135 = this.method8415(local60, local67, local106, local47 * local121 >> 12, local110, local97);
					local135 = local28 * local135 >> 12;
					arg0[local112] = (local135 >> 1) + 2048;
				}
			} else {
				for (local112 = 0; local112 < Static379.anInt5859; local112++) {
					local121 = Static497.anIntArray579[local112] * this.anInt9876;
					local135 = this.method8415(local60, local67, local106, local121 * local47 >> 12, local110, local97);
					arg0[local112] = local135 * local28 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray131[0];
		if (local28 > 8 || local28 < -8) {
			local47 = this.aShortArray132[0] << 12;
			local54 = this.anInt9873 * local47 >> 12;
			local60 = local47 * local12 >> 12;
			local67 = local47 * this.anInt9876 >> 12;
			local71 = local60 >> 12;
			local75 = local71 + 1;
			local60 &= 0xFFF;
			if (local75 >= local54) {
				local75 = 0;
			}
			local97 = this.aByteArray96[local71 & 0xFF] & 0xFF;
			local106 = this.aByteArray96[local75 & 0xFF] & 0xFF;
			local110 = Class21_Sub15.anIntArray413[local60];
			for (local112 = 0; local112 < Static379.anInt5859; local112++) {
				local121 = this.anInt9876 * Static497.anIntArray579[local112];
				local135 = this.method8415(local60, local67, local106, local121 * local47 >> 12, local110, local97);
				arg0[local112] = local135 * local28 >> 12;
			}
		}
		for (@Pc(149) int local149 = 1; local149 < this.anInt9881; local149++) {
			local28 = this.aShortArray131[local149];
			if (local28 > 8 || local28 < -8) {
				local47 = this.aShortArray132[local149] << 12;
				local60 = local12 * local47 >> 12;
				local67 = this.anInt9876 * local47 >> 12;
				local54 = local47 * this.anInt9873 >> 12;
				local71 = local60 >> 12;
				local75 = local71 + 1;
				local60 &= 0xFFF;
				if (local54 <= local75) {
					local75 = 0;
				}
				local110 = Class21_Sub15.anIntArray413[local60];
				local97 = this.aByteArray96[local71 & 0xFF] & 0xFF;
				local106 = this.aByteArray96[local75 & 0xFF] & 0xFF;
				if (this.aBoolean666 && this.anInt9881 - 1 == local149) {
					for (local112 = 0; local112 < Static379.anInt5859; local112++) {
						local121 = this.anInt9876 * Static497.anIntArray579[local112];
						local135 = this.method8415(local60, local67, local106, local121 * local47 >> 12, local110, local97);
						local135 = arg0[local112] + (local28 * local135 >> 12);
						arg0[local112] = (local135 >> 1) + 2048;
					}
				} else {
					for (local112 = 0; local112 < Static379.anInt5859; local112++) {
						local121 = this.anInt9876 * Static497.anIntArray579[local112];
						local135 = this.method8415(local60, local67, local106, local121 * local47 >> 12, local110, local97);
						arg0[local112] += local135 * local28 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIZI)I")
	private int method8415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = arg3 >> 12;
		@Pc(21) int local21 = local17 + 1;
		@Pc(25) int local25 = local17 & 0xFF;
		if (arg1 <= local21) {
			local21 = 0;
		}
		@Pc(38) int local38 = arg3 & 0xFFF;
		local21 &= 0xFF;
		@Pc(46) int local46 = local38 - 4096;
		@Pc(50) int local50 = arg0 - 4096;
		@Pc(59) int local59 = this.aByteArray96[local25 + arg5] & 0x3;
		@Pc(63) int local63 = Class21_Sub15.anIntArray413[local38];
		@Pc(84) int local84;
		if (local59 <= 1) {
			local84 = local59 == 0 ? arg0 + local38 : arg0 - local38;
		} else {
			local84 = local59 == 2 ? local38 - arg0 : -local38 + -arg0;
		}
		local59 = this.aByteArray96[local21 + arg5] & 0x3;
		@Pc(134) int local134;
		if (local59 > 1) {
			local134 = local59 == 2 ? local46 - arg0 : -local46 + -arg0;
		} else {
			local134 = local59 == 0 ? local46 + arg0 : arg0 + -local46;
		}
		local59 = this.aByteArray96[local25 + arg2] & 0x3;
		@Pc(174) int local174 = local84 + (local63 * (local134 - local84) >> 12);
		if (local59 > 1) {
			local84 = local59 == 2 ? local38 - local50 : -local50 + -local38;
		} else {
			local84 = local59 == 0 ? local50 + local38 : -local38 + local50;
		}
		local59 = this.aByteArray96[local21 + arg2] & 0x3;
		if (local59 <= 1) {
			local134 = local59 == 0 ? local50 + local46 : local50 - local46;
		} else {
			local134 = local59 == 2 ? local46 - local50 : -local50 + -local46;
		}
		@Pc(278) int local278 = local84 + ((local134 - local84) * local63 >> 12);
		return (arg4 * (local278 - local174) >> 12) + local174;
	}
}
