import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class4_Sub6_Sub10 extends Class4_Sub6 {

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
	public int anInt2698 = 4;

	@OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
	public int anInt2702 = 1638;

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "[B")
	private byte[] aByteArray25 = new byte[512];

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
	public int anInt2699 = 4;

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
	public int anInt2706 = 4;

	@OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
	public int anInt2707 = 0;

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "Z")
	public boolean aBoolean248 = true;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([IBI)V")
	public void method2283(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static165.anIntArray209[arg1] * this.anInt2706;
		@Pc(114) int local114;
		@Pc(128) int local128;
		@Pc(44) int local44;
		@Pc(27) short local27;
		@Pc(105) int local105;
		@Pc(50) int local50;
		@Pc(64) int local64;
		@Pc(57) int local57;
		@Pc(94) int local94;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(90) int local90;
		@Pc(103) int local103;
		if (this.anInt2698 == 1) {
			local44 = this.aShortArray69[0] << 12;
			local27 = this.aShortArray68[0];
			local50 = local44 * local12 >> 12;
			local57 = this.anInt2706 * local44 >> 12;
			local64 = this.anInt2699 * local44 >> 12;
			local68 = local50 >> 12;
			local72 = local68 + 1;
			@Pc(379) int local379 = local50 & 0xFFF;
			if (local72 >= local57) {
				local72 = 0;
			}
			local94 = Class75.anIntArray163[local379];
			local103 = this.aByteArray25[local72 & 0xFF] & 0xFF;
			local90 = this.aByteArray25[local68 & 0xFF] & 0xFF;
			if (this.aBoolean248) {
				for (local105 = 0; local105 < Static80.anInt1616; local105++) {
					local114 = Static341.anIntArray504[local105] * this.anInt2699;
					local128 = this.method2284(local94, local90, local103, local64, local114 * local44 >> 12, local379);
					@Pc(478) int local478 = local128 * local27 >> 12;
					arg0[local105] = (local478 >> 1) + 2048;
				}
			} else {
				for (local105 = 0; local105 < Static80.anInt1616; local105++) {
					local114 = this.anInt2699 * Static341.anIntArray504[local105];
					local128 = this.method2284(local94, local90, local103, local64, local114 * local44 >> 12, local379);
					arg0[local105] = local27 * local128 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray68[0];
		if (local27 > 8 || local27 < -8) {
			local44 = this.aShortArray69[0] << 12;
			local50 = local44 * local12 >> 12;
			local57 = this.anInt2706 * local44 >> 12;
			local64 = local44 * this.anInt2699 >> 12;
			local68 = local50 >> 12;
			local72 = local68 + 1;
			if (local72 >= local57) {
				local72 = 0;
			}
			local50 &= 0xFFF;
			local90 = this.aByteArray25[local68 & 0xFF] & 0xFF;
			local94 = Class75.anIntArray163[local50];
			local103 = this.aByteArray25[local72 & 0xFF] & 0xFF;
			for (local105 = 0; local105 < Static80.anInt1616; local105++) {
				local114 = Static341.anIntArray504[local105] * this.anInt2699;
				local128 = this.method2284(local94, local90, local103, local64, local114 * local44 >> 12, local50);
				arg0[local105] = local27 * local128 >> 12;
			}
		}
		for (@Pc(146) int local146 = 1; local146 < this.anInt2698; local146++) {
			local27 = this.aShortArray68[local146];
			if (local27 > 8 || local27 < -8) {
				local44 = this.aShortArray69[local146] << 12;
				local64 = this.anInt2699 * local44 >> 12;
				local50 = local44 * local12 >> 12;
				local57 = this.anInt2706 * local44 >> 12;
				local68 = local50 >> 12;
				local72 = local68 + 1;
				if (local57 <= local72) {
					local72 = 0;
				}
				local50 &= 0xFFF;
				local94 = Class75.anIntArray163[local50];
				local103 = this.aByteArray25[local72 & 0xFF] & 0xFF;
				local90 = this.aByteArray25[local68 & 0xFF] & 0xFF;
				if (this.aBoolean248 && this.anInt2698 - 1 == local146) {
					for (local105 = 0; local105 < Static80.anInt1616; local105++) {
						local114 = Static341.anIntArray504[local105] * this.anInt2699;
						local128 = this.method2284(local94, local90, local103, local64, local44 * local114 >> 12, local50);
						local128 = arg0[local105] + (local128 * local27 >> 12);
						arg0[local105] = (local128 >> 1) + 2048;
					}
				} else {
					for (local105 = 0; local105 < Static80.anInt1616; local105++) {
						local114 = this.anInt2699 * Static341.anIntArray504[local105];
						local128 = this.method2284(local94, local90, local103, local64, local44 * local114 >> 12, local50);
						arg0[local105] += local128 * local27 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIII)I")
	private int method2284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg4 & 0xFFF;
		@Pc(21) int local21 = local9 & 0xFF;
		if (local13 >= arg3) {
			local13 = 0;
		}
		local13 &= 0xFF;
		@Pc(38) int local38 = arg5 - 4096;
		@Pc(42) int local42 = local17 - 4096;
		@Pc(46) int local46 = Class75.anIntArray163[local17];
		@Pc(55) int local55 = this.aByteArray25[arg1 + local21] & 0x3;
		@Pc(71) int local71;
		if (local55 <= 1) {
			local71 = local55 == 0 ? local17 + arg5 : -local17 + arg5;
		} else {
			local71 = local55 == 2 ? local17 - arg5 : -local17 + -arg5;
		}
		local55 = this.aByteArray25[arg1 + local13] & 0x3;
		@Pc(114) int local114;
		if (local55 <= 1) {
			local114 = local55 == 0 ? arg5 + local42 : arg5 - local42;
		} else {
			local114 = local55 == 2 ? local42 - arg5 : -local42 - arg5;
		}
		local55 = this.aByteArray25[local21 + arg2] & 0x3;
		@Pc(149) int local149 = ((local114 - local71) * local46 >> 12) + local71;
		if (local55 <= 1) {
			local71 = local55 == 0 ? local38 + local17 : -local17 + local38;
		} else {
			local71 = local55 == 2 ? local17 - local38 : -local38 + -local17;
		}
		local55 = this.aByteArray25[arg2 + local13] & 0x3;
		if (local55 > 1) {
			local114 = local55 == 2 ? local42 - local38 : -local42 + -local38;
		} else {
			local114 = local55 == 0 ? local42 + local38 : -local42 + local38;
		}
		@Pc(234) int local234 = local71 + ((local114 - local71) * local46 >> 12);
		return ((local234 - local149) * arg0 >> 12) + local149;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.aBoolean248 = arg1.method2490() == 1;
		} else if (arg0 == 1) {
			this.anInt2698 = arg1.method2490();
		} else if (arg0 == 2) {
			this.anInt2702 = arg1.method2512();
			if (this.anInt2702 < 0) {
				this.aShortArray68 = new short[this.anInt2698];
				for (@Pc(73) int local73 = 0; local73 < this.anInt2698; local73++) {
					this.aShortArray68[local73] = (short) arg1.method2512();
				}
			}
		} else if (arg0 == 3) {
			this.anInt2699 = this.anInt2706 = arg1.method2490();
		} else if (arg0 == 4) {
			this.anInt2707 = arg1.method2490();
		} else if (arg0 == 5) {
			this.anInt2699 = arg1.method2490();
		} else if (arg0 == 6) {
			this.anInt2706 = arg1.method2490();
		}
	}

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
	private void method2286() {
		@Pc(16) int local16;
		if (this.anInt2702 > 0) {
			this.aShortArray68 = new short[this.anInt2698];
			this.aShortArray69 = new short[this.anInt2698];
			for (local16 = 0; local16 < this.anInt2698; local16++) {
				this.aShortArray68[local16] = (short) (Math.pow((double) ((float) this.anInt2702 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray69[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray68 != null && this.aShortArray68.length == this.anInt2698) {
			this.aShortArray69 = new short[this.anInt2698];
			for (local16 = 0; local16 < this.anInt2698; local16++) {
				this.aShortArray69[local16] = (short) Math.pow(2.0D, (double) local16);
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		this.aByteArray25 = Static36.method643(this.anInt2707);
		this.method2286();
		for (@Pc(23) int local23 = this.anInt2698 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray68[local23];
			if (local30 > 8) {
				return;
			}
			if (local30 < -8) {
				return;
			}
			this.anInt2698--;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			this.method2283(local9, arg0);
		}
		return local9;
	}
}
