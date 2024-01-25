import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eja")
public final class Class5_Sub3_Sub9 extends Class5_Sub3 {

	@OriginalMember(owner = "client!eja", name = "X", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!eja", name = "H", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!eja", name = "W", descriptor = "I")
	public int anInt2145 = 4;

	@OriginalMember(owner = "client!eja", name = "J", descriptor = "I")
	public int anInt2150 = 1638;

	@OriginalMember(owner = "client!eja", name = "M", descriptor = "[B")
	private byte[] aByteArray23 = new byte[512];

	@OriginalMember(owner = "client!eja", name = "K", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!eja", name = "O", descriptor = "I")
	public int anInt2155 = 4;

	@OriginalMember(owner = "client!eja", name = "S", descriptor = "I")
	public int anInt2156 = 4;

	@OriginalMember(owner = "client!eja", name = "T", descriptor = "I")
	public int anInt2151 = 0;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			this.method1917(local17, arg0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		this.aByteArray23 = Static319.method4901(this.anInt2151);
		this.method1920();
		for (@Pc(27) int local27 = this.anInt2145 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray32[local27];
			if (local34 > 8 || local34 < -8) {
				return;
			}
			this.anInt2145--;
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "([III)V")
	public void method1917(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = Static458.anIntArray438[arg1] * this.anInt2155;
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(46) int local46;
		@Pc(31) short local31;
		@Pc(107) int local107;
		@Pc(52) int local52;
		@Pc(66) int local66;
		@Pc(59) int local59;
		@Pc(87) int local87;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(105) int local105;
		@Pc(96) int local96;
		if (this.anInt2145 == 1) {
			local31 = this.aShortArray32[0];
			local46 = this.aShortArray33[0] << 12;
			local66 = this.anInt2156 * local46 >> 12;
			local52 = local20 * local46 >> 12;
			local59 = this.anInt2155 * local46 >> 12;
			local70 = local52 >> 12;
			local74 = local70 + 1;
			@Pc(408) int local408 = local52 & 0xFFF;
			if (local59 <= local74) {
				local74 = 0;
			}
			local105 = this.aByteArray23[local70 & 0xFF] & 0xFF;
			local87 = Class5_Sub3_Sub20.anIntArray320[local408];
			local96 = this.aByteArray23[local74 & 0xFF] & 0xFF;
			if (this.aBoolean145) {
				for (local107 = 0; local107 < Static7.anInt102; local107++) {
					local116 = this.anInt2156 * Static382.anIntArray368[local107];
					local130 = this.method1921(local87, local408, local96, local46 * local116 >> 12, local105, local66);
					@Pc(512) int local512 = local31 * local130 >> 12;
					arg0[local107] = (local512 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static7.anInt102; local107++) {
					local116 = Static382.anIntArray368[local107] * this.anInt2156;
					local130 = this.method1921(local87, local408, local96, local116 * local46 >> 12, local105, local66);
					arg0[local107] = local130 * local31 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray32[0];
		if (local31 > 8 || local31 < -8) {
			local46 = this.aShortArray33[0] << 12;
			local52 = local20 * local46 >> 12;
			local59 = this.anInt2155 * local46 >> 12;
			local66 = this.anInt2156 * local46 >> 12;
			local70 = local52 >> 12;
			local74 = local70 + 1;
			local52 &= 0xFFF;
			if (local74 >= local59) {
				local74 = 0;
			}
			local87 = Class5_Sub3_Sub20.anIntArray320[local52];
			local96 = this.aByteArray23[local74 & 0xFF] & 0xFF;
			local105 = this.aByteArray23[local70 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Static7.anInt102; local107++) {
				local116 = Static382.anIntArray368[local107] * this.anInt2156;
				local130 = this.method1921(local87, local52, local96, local116 * local46 >> 12, local105, local66);
				arg0[local107] = local31 * local130 >> 12;
			}
		}
		for (@Pc(148) int local148 = 1; local148 < this.anInt2145; local148++) {
			local31 = this.aShortArray32[local148];
			if (local31 > 8 || local31 < -8) {
				local46 = this.aShortArray33[local148] << 12;
				local66 = local46 * this.anInt2156 >> 12;
				local52 = local20 * local46 >> 12;
				local59 = this.anInt2155 * local46 >> 12;
				local70 = local52 >> 12;
				local74 = local70 + 1;
				local52 &= 0xFFF;
				if (local59 <= local74) {
					local74 = 0;
				}
				local96 = this.aByteArray23[local74 & 0xFF] & 0xFF;
				local105 = this.aByteArray23[local70 & 0xFF] & 0xFF;
				local87 = Class5_Sub3_Sub20.anIntArray320[local52];
				if (this.aBoolean145 && local148 == this.anInt2145 - 1) {
					for (local107 = 0; local107 < Static7.anInt102; local107++) {
						local116 = this.anInt2156 * Static382.anIntArray368[local107];
						local130 = this.method1921(local87, local52, local96, local116 * local46 >> 12, local105, local66);
						local130 = arg0[local107] + (local31 * local130 >> 12);
						arg0[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static7.anInt102; local107++) {
						local116 = Static382.anIntArray368[local107] * this.anInt2156;
						local130 = this.method1921(local87, local52, local96, local46 * local116 >> 12, local105, local66);
						arg0[local107] += local130 * local31 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean145 = arg0.method7291() == 1;
		} else if (arg1 == 1) {
			this.anInt2145 = arg0.method7291();
		} else if (arg1 == 2) {
			this.anInt2150 = arg0.method7303();
			if (this.anInt2150 < 0) {
				this.aShortArray32 = new short[this.anInt2145];
				for (@Pc(100) int local100 = 0; local100 < this.anInt2145; local100++) {
					this.aShortArray32[local100] = (short) arg0.method7303();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt2156 = this.anInt2155 = arg0.method7291();
			return;
		} else if (arg1 == 4) {
			this.anInt2151 = arg0.method7291();
			return;
		} else if (arg1 == 5) {
			this.anInt2156 = arg0.method7291();
			return;
		} else if (arg1 == 6) {
			this.anInt2155 = arg0.method7291();
			return;
		}
	}

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "(B)V")
	private void method1920() {
		@Pc(31) int local31;
		if (this.anInt2150 > 0) {
			this.aShortArray33 = new short[this.anInt2145];
			this.aShortArray32 = new short[this.anInt2145];
			for (local31 = 0; local31 < this.anInt2145; local31++) {
				this.aShortArray32[local31] = (short) (int) (Math.pow((double) ((float) this.anInt2150 / 4096.0F), (double) local31) * 4096.0D);
				this.aShortArray33[local31] = (short) (int) Math.pow(2.0D, (double) local31);
			}
		} else if (this.aShortArray32 != null && this.aShortArray32.length == this.anInt2145) {
			this.aShortArray33 = new short[this.anInt2145];
			for (local31 = 0; local31 < this.anInt2145; local31++) {
				this.aShortArray33[local31] = (short) (int) Math.pow(2.0D, (double) local31);
			}
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIIIIZI)I")
	private int method1921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg3 & 0xFFF;
		@Pc(21) int local21 = local9 & 0xFF;
		if (arg5 <= local13) {
			local13 = 0;
		}
		@Pc(30) int local30 = local17 - 4096;
		local13 &= 0xFF;
		@Pc(38) int local38 = arg1 - 4096;
		@Pc(47) int local47 = this.aByteArray23[local21 + arg4] & 0x3;
		@Pc(51) int local51 = Class5_Sub3_Sub20.anIntArray320[local17];
		@Pc(75) int local75;
		if (local47 > 1) {
			local75 = local47 == 2 ? local17 - arg1 : -arg1 + -local17;
		} else {
			local75 = local47 == 0 ? local17 + arg1 : -local17 + arg1;
		}
		local47 = this.aByteArray23[arg4 + local13] & 0x3;
		@Pc(126) int local126;
		if (local47 <= 1) {
			local126 = local47 == 0 ? local30 + arg1 : arg1 + -local30;
		} else {
			local126 = local47 == 2 ? local30 - arg1 : -local30 + -arg1;
		}
		local47 = this.aByteArray23[local21 + arg2] & 0x3;
		@Pc(165) int local165 = (local51 * (local126 - local75) >> 12) + local75;
		if (local47 <= 1) {
			local75 = local47 == 0 ? local17 + local38 : local38 + -local17;
		} else {
			local75 = local47 == 2 ? local17 - local38 : -local17 + -local38;
		}
		local47 = this.aByteArray23[local13 + arg2] & 0x3;
		if (local47 <= 1) {
			local126 = local47 == 0 ? local30 + local38 : local38 - local30;
		} else {
			local126 = local47 == 2 ? local30 - local38 : -local30 - local38;
		}
		@Pc(269) int local269 = (local51 * (local126 - local75) >> 12) + local75;
		return local165 + (arg0 * (local269 - local165) >> 12);
	}
}
