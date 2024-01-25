import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class2_Sub7_Sub38 extends Class2_Sub7 {

	@OriginalMember(owner = "client!vu", name = "O", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!vu", name = "bb", descriptor = "[S")
	private short[] aShortArray136;

	@OriginalMember(owner = "client!vu", name = "J", descriptor = "I")
	public int anInt9047 = 1638;

	@OriginalMember(owner = "client!vu", name = "I", descriptor = "I")
	public int anInt9046 = 4;

	@OriginalMember(owner = "client!vu", name = "Q", descriptor = "I")
	public int anInt9052 = 0;

	@OriginalMember(owner = "client!vu", name = "S", descriptor = "I")
	public int anInt9053 = 4;

	@OriginalMember(owner = "client!vu", name = "ab", descriptor = "Z")
	public boolean aBoolean648 = true;

	@OriginalMember(owner = "client!vu", name = "Z", descriptor = "I")
	public int anInt9059 = 4;

	@OriginalMember(owner = "client!vu", name = "P", descriptor = "[B")
	private byte[] aByteArray118 = new byte[512];

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIII)I")
	private int method7567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (local13 >= arg3) {
			local13 = 0;
		}
		@Pc(30) int local30 = arg2 & 0xFFF;
		@Pc(34) int local34 = arg0 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = local30 - 4096;
		@Pc(46) int local46 = Class160.anIntArray428[local30];
		@Pc(56) int local56 = this.aByteArray118[local17 + arg1] & 0x3;
		@Pc(76) int local76;
		if (local56 > 1) {
			local76 = local56 == 2 ? local30 - arg0 : -local30 - arg0;
		} else {
			local76 = local56 == 0 ? arg0 + local30 : arg0 + -local30;
		}
		local56 = this.aByteArray118[local13 + arg1] & 0x3;
		@Pc(119) int local119;
		if (local56 > 1) {
			local119 = local56 == 2 ? local42 - arg0 : -local42 - arg0;
		} else {
			local119 = local56 == 0 ? arg0 + local42 : -local42 + arg0;
		}
		@Pc(147) int local147 = local76 + ((local119 - local76) * local46 >> 12);
		local56 = this.aByteArray118[local17 + arg5] & 0x3;
		if (local56 > 1) {
			local76 = local56 == 2 ? local30 - local34 : -local30 - local34;
		} else {
			local76 = local56 == 0 ? local34 + local30 : local34 + -local30;
		}
		local56 = this.aByteArray118[local13 + arg5] & 0x3;
		if (local56 > 1) {
			local119 = local56 == 2 ? local42 - local34 : -local42 - local34;
		} else {
			local119 = local56 == 0 ? local34 + local42 : local34 - local42;
		}
		@Pc(248) int local248 = local76 + ((local119 - local76) * local46 >> 12);
		return local147 + (arg4 * (local248 - local147) >> 12);
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			this.method7570(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "(I)V")
	private void method7569() {
		@Pc(36) int local36;
		if (this.anInt9047 > 0) {
			this.aShortArray135 = new short[this.anInt9053];
			this.aShortArray136 = new short[this.anInt9053];
			for (local36 = 0; local36 < this.anInt9053; local36++) {
				this.aShortArray135[local36] = (short) (Math.pow((double) ((float) this.anInt9047 / 4096.0F), (double) local36) * 4096.0D);
				this.aShortArray136[local36] = (short) Math.pow(2.0D, (double) local36);
			}
		} else if (this.aShortArray135 != null && this.anInt9053 == this.aShortArray135.length) {
			this.aShortArray136 = new short[this.anInt9053];
			for (local36 = 0; local36 < this.anInt9053; local36++) {
				this.aShortArray136[local36] = (short) Math.pow(2.0D, (double) local36);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.aBoolean648 = arg1.method5170() == 1;
		} else if (arg0 == 1) {
			this.anInt9053 = arg1.method5170();
		} else if (arg0 == 2) {
			this.anInt9047 = arg1.method5231();
			if (this.anInt9047 < 0) {
				this.aShortArray135 = new short[this.anInt9053];
				for (@Pc(81) int local81 = 0; local81 < this.anInt9053; local81++) {
					this.aShortArray135[local81] = (short) arg1.method5231();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt9046 = this.anInt9059 = arg1.method5170();
			return;
		} else if (arg0 == 4) {
			this.anInt9052 = arg1.method5170();
			return;
		} else if (arg0 == 5) {
			this.anInt9046 = arg1.method5170();
			return;
		} else if (arg0 == 6) {
			this.anInt9059 = arg1.method5170();
			return;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		this.aByteArray118 = Static305.method4769(this.anInt9052);
		this.method7569();
		for (@Pc(26) int local26 = this.anInt9053 - 1; local26 >= 1; local26--) {
			@Pc(33) short local33 = this.aShortArray135[local26];
			if (local33 > 8 || local33 < -8) {
				return;
			}
			this.anInt9053--;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "([IIB)V")
	public void method7570(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = Static313.anIntArray521[arg1] * this.anInt9059;
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(46) int local46;
		@Pc(31) short local31;
		@Pc(107) int local107;
		@Pc(59) int local59;
		@Pc(53) int local53;
		@Pc(66) int local66;
		@Pc(87) int local87;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(105) int local105;
		@Pc(96) int local96;
		if (this.anInt9053 == 1) {
			local31 = this.aShortArray135[0];
			local46 = this.aShortArray136[0] << 12;
			local53 = this.anInt9046 * local46 >> 12;
			local66 = this.anInt9059 * local46 >> 12;
			local59 = local12 * local46 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			if (local74 >= local66) {
				local74 = 0;
			}
			local59 &= 0xFFF;
			local105 = this.aByteArray118[local70 & 0xFF] & 0xFF;
			local96 = this.aByteArray118[local74 & 0xFF] & 0xFF;
			local87 = Class160.anIntArray428[local59];
			if (this.aBoolean648) {
				for (local107 = 0; local107 < Static352.anInt6485; local107++) {
					local116 = this.anInt9046 * Static427.anIntArray602[local107];
					local130 = this.method7567(local59, local105, local46 * local116 >> 12, local53, local87, local96);
					@Pc(485) int local485 = local31 * local130 >> 12;
					arg0[local107] = (local485 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static352.anInt6485; local107++) {
					local116 = this.anInt9046 * Static427.anIntArray602[local107];
					local130 = this.method7567(local59, local105, local116 * local46 >> 12, local53, local87, local96);
					arg0[local107] = local130 * local31 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray135[0];
		if (local31 > 8 || local31 < -8) {
			local46 = this.aShortArray136[0] << 12;
			local53 = this.anInt9046 * local46 >> 12;
			local59 = local12 * local46 >> 12;
			local66 = this.anInt9059 * local46 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			local59 &= 0xFFF;
			if (local66 <= local74) {
				local74 = 0;
			}
			local87 = Class160.anIntArray428[local59];
			local96 = this.aByteArray118[local74 & 0xFF] & 0xFF;
			local105 = this.aByteArray118[local70 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Static352.anInt6485; local107++) {
				local116 = this.anInt9046 * Static427.anIntArray602[local107];
				local130 = this.method7567(local59, local105, local46 * local116 >> 12, local53, local87, local96);
				arg0[local107] = local130 * local31 >> 12;
			}
		}
		for (@Pc(148) int local148 = 1; local148 < this.anInt9053; local148++) {
			local31 = this.aShortArray135[local148];
			if (local31 > 8 || local31 < -8) {
				local46 = this.aShortArray136[local148] << 12;
				local53 = local46 * this.anInt9046 >> 12;
				local66 = this.anInt9059 * local46 >> 12;
				local59 = local46 * local12 >> 12;
				local70 = local59 >> 12;
				local74 = local70 + 1;
				if (local66 <= local74) {
					local74 = 0;
				}
				local59 &= 0xFFF;
				local105 = this.aByteArray118[local70 & 0xFF] & 0xFF;
				local96 = this.aByteArray118[local74 & 0xFF] & 0xFF;
				local87 = Class160.anIntArray428[local59];
				if (this.aBoolean648 && local148 == this.anInt9053 - 1) {
					for (local107 = 0; local107 < Static352.anInt6485; local107++) {
						local116 = Static427.anIntArray602[local107] * this.anInt9046;
						local130 = this.method7567(local59, local105, local116 * local46 >> 12, local53, local87, local96);
						local130 = arg0[local107] + (local130 * local31 >> 12);
						arg0[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static352.anInt6485; local107++) {
						local116 = Static427.anIntArray602[local107] * this.anInt9046;
						local130 = this.method7567(local59, local105, local116 * local46 >> 12, local53, local87, local96);
						arg0[local107] += local130 * local31 >> 12;
					}
				}
			}
		}
	}
}
