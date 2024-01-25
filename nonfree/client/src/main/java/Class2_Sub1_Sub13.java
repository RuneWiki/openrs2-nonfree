import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "[B")
	private byte[] aByteArray33 = new byte[512];

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "Z")
	public boolean aBoolean195 = true;

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
	public int anInt2808 = 0;

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
	public int anInt2807 = 4;

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
	public int anInt2811 = 4;

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "I")
	public int anInt2813 = 4;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	public int anInt2802 = 1638;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([III)V")
	public void method2252(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(25) int local25 = this.anInt2807 * Static229.anIntArray382[arg1];
		@Pc(125) int local125;
		@Pc(139) int local139;
		@Pc(51) int local51;
		@Pc(36) short local36;
		@Pc(116) int local116;
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(114) int local114;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(101) int local101;
		@Pc(110) int local110;
		if (this.anInt2811 == 1) {
			local51 = this.aShortArray23[0] << 12;
			local36 = this.aShortArray24[0];
			local57 = local25 * local51 >> 12;
			local64 = this.anInt2813 * local51 >> 12;
			local71 = this.anInt2807 * local51 >> 12;
			local75 = local57 >> 12;
			local79 = local75 + 1;
			@Pc(401) int local401 = local57 & 0xFFF;
			if (local79 >= local71) {
				local79 = 0;
			}
			local114 = Class42.anIntArray85[local401];
			local101 = this.aByteArray33[local75 & 0xFF] & 0xFF;
			local110 = this.aByteArray33[local79 & 0xFF] & 0xFF;
			if (this.aBoolean195) {
				for (local116 = 0; local116 < Static391.anInt7118; local116++) {
					local125 = Static167.anIntArray267[local116] * this.anInt2813;
					local139 = this.method2256(local401, local51 * local125 >> 12, local114, local101, local64, local110);
					local139 = local36 * local139 >> 12;
					arg0[local116] = (local139 >> 1) + 2048;
				}
			} else {
				for (local116 = 0; local116 < Static391.anInt7118; local116++) {
					local125 = Static167.anIntArray267[local116] * this.anInt2813;
					local139 = this.method2256(local401, local125 * local51 >> 12, local114, local101, local64, local110);
					arg0[local116] = local36 * local139 >> 12;
				}
			}
			return;
		}
		local36 = this.aShortArray24[0];
		if (local36 > 8 || local36 < -8) {
			local51 = this.aShortArray23[0] << 12;
			local57 = local25 * local51 >> 12;
			local64 = local51 * this.anInt2813 >> 12;
			local71 = this.anInt2807 * local51 >> 12;
			local75 = local57 >> 12;
			local79 = local75 + 1;
			local57 &= 0xFFF;
			if (local79 >= local71) {
				local79 = 0;
			}
			local101 = this.aByteArray33[local75 & 0xFF] & 0xFF;
			local110 = this.aByteArray33[local79 & 0xFF] & 0xFF;
			local114 = Class42.anIntArray85[local57];
			for (local116 = 0; local116 < Static391.anInt7118; local116++) {
				local125 = this.anInt2813 * Static167.anIntArray267[local116];
				local139 = this.method2256(local57, local125 * local51 >> 12, local114, local101, local64, local110);
				arg0[local116] = local139 * local36 >> 12;
			}
		}
		for (@Pc(153) int local153 = 1; local153 < this.anInt2811; local153++) {
			local36 = this.aShortArray24[local153];
			if (local36 > 8 || local36 < -8) {
				local51 = this.aShortArray23[local153] << 12;
				local71 = this.anInt2807 * local51 >> 12;
				local57 = local51 * local25 >> 12;
				local64 = local51 * this.anInt2813 >> 12;
				local75 = local57 >> 12;
				local79 = local75 + 1;
				local57 &= 0xFFF;
				if (local71 <= local79) {
					local79 = 0;
				}
				local114 = Class42.anIntArray85[local57];
				local101 = this.aByteArray33[local75 & 0xFF] & 0xFF;
				local110 = this.aByteArray33[local79 & 0xFF] & 0xFF;
				if (this.aBoolean195 && local153 == this.anInt2811 - 1) {
					for (local116 = 0; local116 < Static391.anInt7118; local116++) {
						local125 = Static167.anIntArray267[local116] * this.anInt2813;
						local139 = this.method2256(local57, local125 * local51 >> 12, local114, local101, local64, local110);
						local139 = arg0[local116] + (local36 * local139 >> 12);
						arg0[local116] = (local139 >> 1) + 2048;
					}
				} else {
					for (local116 = 0; local116 < Static391.anInt7118; local116++) {
						local125 = Static167.anIntArray267[local116] * this.anInt2813;
						local139 = this.method2256(local57, local125 * local51 >> 12, local114, local101, local64, local110);
						arg0[local116] += local139 * local36 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.aBoolean195 = arg1.method5732() == 1;
		} else if (arg0 == 1) {
			this.anInt2811 = arg1.method5732();
		} else if (arg0 == 2) {
			this.anInt2802 = arg1.method5743();
			if (this.anInt2802 < 0) {
				this.aShortArray24 = new short[this.anInt2811];
				for (@Pc(75) int local75 = 0; local75 < this.anInt2811; local75++) {
					this.aShortArray24[local75] = (short) arg1.method5743();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt2813 = this.anInt2807 = arg1.method5732();
			return;
		} else if (arg0 == 4) {
			this.anInt2808 = arg1.method5732();
			return;
		} else if (arg0 == 5) {
			this.anInt2813 = arg1.method5732();
			return;
		} else if (arg0 == 6) {
			this.anInt2807 = arg1.method5732();
			return;
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		this.aByteArray33 = Static19.method213(this.anInt2808);
		this.method2255();
		for (@Pc(19) int local19 = this.anInt2811 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray24[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt2811--;
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(Z)V")
	private void method2255() {
		@Pc(36) int local36;
		if (this.anInt2802 > 0) {
			this.aShortArray24 = new short[this.anInt2811];
			this.aShortArray23 = new short[this.anInt2811];
			for (local36 = 0; local36 < this.anInt2811; local36++) {
				this.aShortArray24[local36] = (short) (Math.pow((double) ((float) this.anInt2802 / 4096.0F), (double) local36) * 4096.0D);
				this.aShortArray23[local36] = (short) Math.pow(2.0D, (double) local36);
			}
		} else if (this.aShortArray24 != null && this.aShortArray24.length == this.anInt2811) {
			this.aShortArray23 = new short[this.anInt2811];
			for (local36 = 0; local36 < this.anInt2811; local36++) {
				this.aShortArray23[local36] = (short) Math.pow(2.0D, (double) local36);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			this.method2252(local17, arg0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)I")
	private int method2256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg1 & 0xFFF;
		if (local13 >= arg4) {
			local13 = 0;
		}
		local9 &= 0xFF;
		local13 &= 0xFF;
		@Pc(38) int local38 = arg0 - 4096;
		@Pc(42) int local42 = local17 - 4096;
		@Pc(51) int local51 = this.aByteArray33[arg3 + local9] & 0x3;
		@Pc(55) int local55 = Class42.anIntArray85[local17];
		@Pc(76) int local76;
		if (local51 > 1) {
			local76 = local51 == 2 ? local17 - arg0 : -local17 + -arg0;
		} else {
			local76 = local51 == 0 ? local17 + arg0 : -local17 + arg0;
		}
		local51 = this.aByteArray33[local13 + arg3] & 0x3;
		@Pc(120) int local120;
		if (local51 > 1) {
			local120 = local51 == 2 ? local42 - arg0 : -arg0 + -local42;
		} else {
			local120 = local51 == 0 ? local42 + arg0 : arg0 - local42;
		}
		@Pc(144) int local144 = local76 + ((local120 - local76) * local55 >> 12);
		local51 = this.aByteArray33[arg5 + local9] & 0x3;
		if (local51 > 1) {
			local76 = local51 == 2 ? local17 - local38 : -local38 + -local17;
		} else {
			local76 = local51 == 0 ? local38 + local17 : -local17 + local38;
		}
		local51 = this.aByteArray33[local13 + arg5] & 0x3;
		if (local51 <= 1) {
			local120 = local51 == 0 ? local42 + local38 : local38 - local42;
		} else {
			local120 = local51 == 2 ? local42 - local38 : -local42 - local38;
		}
		@Pc(242) int local242 = local76 + (local55 * (local120 - local76) >> 12);
		return local144 + (arg2 * (local242 - local144) >> 12);
	}
}
