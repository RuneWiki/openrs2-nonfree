import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class6_Sub1_Sub37 extends Class6_Sub1 {

	@OriginalMember(owner = "client!vt", name = "H", descriptor = "[S")
	private short[] aShortArray159;

	@OriginalMember(owner = "client!vt", name = "M", descriptor = "[S")
	private short[] aShortArray160;

	@OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
	public int anInt9475 = 1638;

	@OriginalMember(owner = "client!vt", name = "R", descriptor = "I")
	public int anInt9481 = 4;

	@OriginalMember(owner = "client!vt", name = "G", descriptor = "I")
	public int anInt9473 = 0;

	@OriginalMember(owner = "client!vt", name = "S", descriptor = "[B")
	private byte[] aByteArray123 = new byte[512];

	@OriginalMember(owner = "client!vt", name = "T", descriptor = "I")
	public int anInt9482 = 4;

	@OriginalMember(owner = "client!vt", name = "U", descriptor = "I")
	public int anInt9483 = 4;

	@OriginalMember(owner = "client!vt", name = "V", descriptor = "Z")
	public boolean aBoolean704 = true;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIZII)I")
	private int method7925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(18) int local18 = local9 + 1;
		if (local18 >= arg3) {
			local18 = 0;
		}
		@Pc(27) int local27 = arg4 & 0xFFF;
		local9 &= 0xFF;
		local18 &= 0xFF;
		@Pc(39) int local39 = local27 - 4096;
		@Pc(43) int local43 = arg1 - 4096;
		@Pc(47) int local47 = Class242.anIntArray503[local27];
		@Pc(56) int local56 = this.aByteArray123[arg0 + local9] & 0x3;
		@Pc(77) int local77;
		if (local56 > 1) {
			local77 = local56 == 2 ? local27 - arg1 : -arg1 + -local27;
		} else {
			local77 = local56 == 0 ? arg1 + local27 : -local27 + arg1;
		}
		local56 = this.aByteArray123[arg0 + local18] & 0x3;
		@Pc(118) int local118;
		if (local56 <= 1) {
			local118 = local56 == 0 ? local39 + arg1 : arg1 - local39;
		} else {
			local118 = local56 == 2 ? local39 - arg1 : -local39 - arg1;
		}
		@Pc(144) int local144 = local77 + (local47 * (local118 - local77) >> 12);
		local56 = this.aByteArray123[arg5 + local9] & 0x3;
		if (local56 > 1) {
			local77 = local56 == 2 ? local27 - local43 : -local43 + -local27;
		} else {
			local77 = local56 == 0 ? local27 + local43 : -local27 + local43;
		}
		local56 = this.aByteArray123[local18 + arg5] & 0x3;
		if (local56 <= 1) {
			local118 = local56 == 0 ? local43 + local39 : -local39 + local43;
		} else {
			local118 = local56 == 2 ? local39 - local43 : -local39 - local43;
		}
		@Pc(241) int local241 = (local47 * (local118 - local77) >> 12) + local77;
		return local144 + (arg2 * (local241 - local144) >> 12);
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(Z)V")
	private void method7926() {
		@Pc(26) int local26;
		if (this.anInt9475 > 0) {
			this.aShortArray159 = new short[this.anInt9483];
			this.aShortArray160 = new short[this.anInt9483];
			for (local26 = 0; local26 < this.anInt9483; local26++) {
				this.aShortArray160[local26] = (short) (Math.pow((double) ((float) this.anInt9475 / 4096.0F), (double) local26) * 4096.0D);
				this.aShortArray159[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		} else if (this.aShortArray160 != null && this.anInt9483 == this.aShortArray160.length) {
			this.aShortArray159 = new short[this.anInt9483];
			for (local26 = 0; local26 < this.anInt9483; local26++) {
				this.aShortArray159[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.aBoolean704 = arg1.method4966() == 1;
		} else if (arg0 == 1) {
			this.anInt9483 = arg1.method4966();
		} else if (arg0 == 2) {
			this.anInt9475 = arg1.method4974();
			if (this.anInt9475 < 0) {
				this.aShortArray160 = new short[this.anInt9483];
				for (@Pc(77) int local77 = 0; local77 < this.anInt9483; local77++) {
					this.aShortArray160[local77] = (short) arg1.method4974();
				}
			}
		} else if (arg0 == 3) {
			this.anInt9482 = this.anInt9481 = arg1.method4966();
		} else if (arg0 == 4) {
			this.anInt9473 = arg1.method4966();
		} else if (arg0 == 5) {
			this.anInt9482 = arg1.method4966();
		} else if (arg0 == 6) {
			this.anInt9481 = arg1.method4966();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			this.method7929(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		this.aByteArray123 = Static106.method2195(this.anInt9473);
		this.method7926();
		for (@Pc(24) int local24 = this.anInt9483 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray160[local24];
			if (local31 > 8 || local31 < -8) {
				return;
			}
			this.anInt9483--;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([IIZ)V")
	public void method7929(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = Static346.anIntArray472[arg1] * this.anInt9481;
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(42) int local42;
		@Pc(25) short local25;
		@Pc(107) int local107;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(49) int local49;
		@Pc(96) int local96;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(105) int local105;
		@Pc(92) int local92;
		if (this.anInt9483 == 1) {
			local42 = this.aShortArray159[0] << 12;
			local25 = this.aShortArray160[0];
			local55 = local12 * local42 >> 12;
			local49 = this.anInt9481 * local42 >> 12;
			local62 = this.anInt9482 * local42 >> 12;
			local66 = local55 >> 12;
			local70 = local66 + 1;
			@Pc(383) int local383 = local55 & 0xFFF;
			if (local49 <= local70) {
				local70 = 0;
			}
			local92 = this.aByteArray123[local70 & 0xFF] & 0xFF;
			local105 = this.aByteArray123[local66 & 0xFF] & 0xFF;
			local96 = Class242.anIntArray503[local383];
			if (this.aBoolean704) {
				for (local107 = 0; local107 < Static289.anInt5549; local107++) {
					local116 = this.anInt9482 * Static473.anIntArray730[local107];
					local130 = this.method7925(local105, local383, local96, local62, local42 * local116 >> 12, local92);
					local130 = local130 * local25 >> 12;
					arg0[local107] = (local130 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static289.anInt5549; local107++) {
					local116 = Static473.anIntArray730[local107] * this.anInt9482;
					local130 = this.method7925(local105, local383, local96, local62, local42 * local116 >> 12, local92);
					arg0[local107] = local130 * local25 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray160[0];
		if (local25 > 8 || local25 < -8) {
			local42 = this.aShortArray159[0] << 12;
			local49 = this.anInt9481 * local42 >> 12;
			local55 = local12 * local42 >> 12;
			local62 = this.anInt9482 * local42 >> 12;
			local66 = local55 >> 12;
			local70 = local66 + 1;
			if (local70 >= local49) {
				local70 = 0;
			}
			local55 &= 0xFFF;
			local92 = this.aByteArray123[local70 & 0xFF] & 0xFF;
			local96 = Class242.anIntArray503[local55];
			local105 = this.aByteArray123[local66 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Static289.anInt5549; local107++) {
				local116 = this.anInt9482 * Static473.anIntArray730[local107];
				local130 = this.method7925(local105, local55, local96, local62, local42 * local116 >> 12, local92);
				arg0[local107] = local130 * local25 >> 12;
			}
		}
		for (@Pc(148) int local148 = 1; local148 < this.anInt9483; local148++) {
			local25 = this.aShortArray160[local148];
			if (local25 > 8 || local25 < -8) {
				local42 = this.aShortArray159[local148] << 12;
				local62 = this.anInt9482 * local42 >> 12;
				local49 = local42 * this.anInt9481 >> 12;
				local55 = local12 * local42 >> 12;
				local66 = local55 >> 12;
				local70 = local66 + 1;
				local55 &= 0xFFF;
				if (local70 >= local49) {
					local70 = 0;
				}
				local96 = Class242.anIntArray503[local55];
				local92 = this.aByteArray123[local70 & 0xFF] & 0xFF;
				local105 = this.aByteArray123[local66 & 0xFF] & 0xFF;
				if (this.aBoolean704 && local148 == this.anInt9483 - 1) {
					for (local107 = 0; local107 < Static289.anInt5549; local107++) {
						local116 = Static473.anIntArray730[local107] * this.anInt9482;
						local130 = this.method7925(local105, local55, local96, local62, local42 * local116 >> 12, local92);
						local130 = arg0[local107] + (local25 * local130 >> 12);
						arg0[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static289.anInt5549; local107++) {
						local116 = this.anInt9482 * Static473.anIntArray730[local107];
						local130 = this.method7925(local105, local55, local96, local62, local42 * local116 >> 12, local92);
						arg0[local107] += local25 * local130 >> 12;
					}
				}
			}
		}
	}
}
