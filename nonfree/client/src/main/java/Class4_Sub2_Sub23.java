import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class4_Sub2_Sub23 extends Class4_Sub2 {

	@OriginalMember(owner = "client!po", name = "L", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!po", name = "M", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!po", name = "J", descriptor = "I")
	public int anInt7950 = 4;

	@OriginalMember(owner = "client!po", name = "T", descriptor = "I")
	public int anInt7956 = 4;

	@OriginalMember(owner = "client!po", name = "K", descriptor = "I")
	public int anInt7951 = 0;

	@OriginalMember(owner = "client!po", name = "V", descriptor = "I")
	public int anInt7957 = 1638;

	@OriginalMember(owner = "client!po", name = "Z", descriptor = "[B")
	private byte[] aByteArray72 = new byte[512];

	@OriginalMember(owner = "client!po", name = "P", descriptor = "Z")
	public boolean aBoolean571 = true;

	@OriginalMember(owner = "client!po", name = "N", descriptor = "I")
	public int anInt7952 = 4;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			this.method6224(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
	private void method6221() {
		@Pc(29) int local29;
		if (this.anInt7957 > 0) {
			this.aShortArray95 = new short[this.anInt7956];
			this.aShortArray96 = new short[this.anInt7956];
			for (local29 = 0; local29 < this.anInt7956; local29++) {
				this.aShortArray96[local29] = (short) (Math.pow((double) ((float) this.anInt7957 / 4096.0F), (double) local29) * 4096.0D);
				this.aShortArray95[local29] = (short) Math.pow(2.0D, (double) local29);
			}
		} else if (this.aShortArray96 != null && this.aShortArray96.length == this.anInt7956) {
			this.aShortArray95 = new short[this.anInt7956];
			for (local29 = 0; local29 < this.anInt7956; local29++) {
				this.aShortArray95[local29] = (short) Math.pow(2.0D, (double) local29);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZIIIIII)I")
	private int method6222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(22) int local22 = arg2 & 0xFFF;
		if (arg5 <= local13) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(35) int local35 = local22 - 4096;
		@Pc(39) int local39 = arg3 - 4096;
		local13 &= 0xFF;
		@Pc(47) int local47 = Class4_Sub29.anIntArray327[local22];
		@Pc(56) int local56 = this.aByteArray72[arg0 + local9] & 0x3;
		@Pc(73) int local73;
		if (local56 <= 1) {
			local73 = local56 == 0 ? local22 + arg3 : arg3 + -local22;
		} else {
			local73 = local56 == 2 ? local22 - arg3 : -arg3 + -local22;
		}
		local56 = this.aByteArray72[local13 + arg0] & 0x3;
		@Pc(115) int local115;
		if (local56 <= 1) {
			local115 = local56 == 0 ? local35 + arg3 : arg3 + -local35;
		} else {
			local115 = local56 == 2 ? local35 - arg3 : -arg3 + -local35;
		}
		@Pc(143) int local143 = ((local115 - local73) * local47 >> 12) + local73;
		local56 = this.aByteArray72[arg4 + local9] & 0x3;
		if (local56 > 1) {
			local73 = local56 == 2 ? local22 - local39 : -local22 + -local39;
		} else {
			local73 = local56 == 0 ? local39 + local22 : local39 - local22;
		}
		local56 = this.aByteArray72[arg4 + local13] & 0x3;
		if (local56 > 1) {
			local115 = local56 == 2 ? local35 - local39 : -local39 + -local35;
		} else {
			local115 = local56 == 0 ? local35 + local39 : -local35 + local39;
		}
		@Pc(236) int local236 = local73 + (local47 * (local115 - local73) >> 12);
		return (arg1 * (local236 - local143) >> 12) + local143;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		this.aByteArray72 = Static401.method6112(this.anInt7951);
		this.method6221();
		for (@Pc(23) int local23 = this.anInt7956 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray96[local23];
			if (local30 > 8) {
				return;
			}
			if (local30 < -8) {
				return;
			}
			this.anInt7956--;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I[II)V")
	public void method6224(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static217.anIntArray501[arg1] * this.anInt7952;
		@Pc(107) int local107;
		@Pc(121) int local121;
		@Pc(30) int local30;
		@Pc(23) short local23;
		@Pc(98) int local98;
		@Pc(36) int local36;
		@Pc(50) int local50;
		@Pc(43) int local43;
		@Pc(75) int local75;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(93) int local93;
		@Pc(84) int local84;
		if (this.anInt7956 == 1) {
			local23 = this.aShortArray96[0];
			local30 = this.aShortArray95[0] << 12;
			local36 = local30 * local12 >> 12;
			local43 = this.anInt7952 * local30 >> 12;
			local50 = local30 * this.anInt7950 >> 12;
			local54 = local36 >> 12;
			local58 = local54 + 1;
			if (local58 >= local43) {
				local58 = 0;
			}
			local36 &= 0xFFF;
			local75 = Class4_Sub29.anIntArray327[local36];
			local84 = this.aByteArray72[local58 & 0xFF] & 0xFF;
			local93 = this.aByteArray72[local54 & 0xFF] & 0xFF;
			if (this.aBoolean571) {
				for (local98 = 0; local98 < Static417.anInt5248; local98++) {
					local107 = Static579.anIntArray585[local98] * this.anInt7950;
					local121 = this.method6222(local93, local75, local107 * local30 >> 12, local36, local84, local50);
					local121 = local23 * local121 >> 12;
					arg0[local98] = (local121 >> 1) + 2048;
				}
			} else {
				for (local98 = 0; local98 < Static417.anInt5248; local98++) {
					local107 = Static579.anIntArray585[local98] * this.anInt7950;
					local121 = this.method6222(local93, local75, local107 * local30 >> 12, local36, local84, local50);
					arg0[local98] = local121 * local23 >> 12;
				}
			}
			return;
		}
		local23 = this.aShortArray96[0];
		if (local23 > 8 || local23 < -8) {
			local30 = this.aShortArray95[0] << 12;
			local50 = this.anInt7950 * local30 >> 12;
			local43 = local30 * this.anInt7952 >> 12;
			local36 = local12 * local30 >> 12;
			local54 = local36 >> 12;
			local58 = local54 + 1;
			local36 &= 0xFFF;
			if (local43 <= local58) {
				local58 = 0;
			}
			local93 = this.aByteArray72[local54 & 0xFF] & 0xFF;
			local84 = this.aByteArray72[local58 & 0xFF] & 0xFF;
			local75 = Class4_Sub29.anIntArray327[local36];
			for (local98 = 0; local98 < Static417.anInt5248; local98++) {
				local107 = Static579.anIntArray585[local98] * this.anInt7950;
				local121 = this.method6222(local93, local75, local30 * local107 >> 12, local36, local84, local50);
				arg0[local98] = local121 * local23 >> 12;
			}
		}
		for (@Pc(302) int local302 = 1; local302 < this.anInt7956; local302++) {
			local23 = this.aShortArray96[local302];
			if (local23 > 8 || local23 < -8) {
				local30 = this.aShortArray95[local302] << 12;
				local50 = local30 * this.anInt7950 >> 12;
				local36 = local12 * local30 >> 12;
				local43 = local30 * this.anInt7952 >> 12;
				local54 = local36 >> 12;
				local58 = local54 + 1;
				local36 &= 0xFFF;
				if (local43 <= local58) {
					local58 = 0;
				}
				local84 = this.aByteArray72[local58 & 0xFF] & 0xFF;
				local93 = this.aByteArray72[local54 & 0xFF] & 0xFF;
				local75 = Class4_Sub29.anIntArray327[local36];
				if (this.aBoolean571 && local302 == this.anInt7956 - 1) {
					for (local98 = 0; local98 < Static417.anInt5248; local98++) {
						local107 = Static579.anIntArray585[local98] * this.anInt7950;
						local121 = this.method6222(local93, local75, local30 * local107 >> 12, local36, local84, local50);
						local121 = (local121 * local23 >> 12) + arg0[local98];
						arg0[local98] = (local121 >> 1) + 2048;
					}
				} else {
					for (local98 = 0; local98 < Static417.anInt5248; local98++) {
						local107 = this.anInt7950 * Static579.anIntArray585[local98];
						local121 = this.method6222(local93, local75, local107 * local30 >> 12, local36, local84, local50);
						arg0[local98] += local121 * local23 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean571 = arg0.method7004() == 1;
		} else if (arg1 == 1) {
			this.anInt7956 = arg0.method7004();
		} else if (arg1 == 2) {
			this.anInt7957 = arg0.method7043();
			if (this.anInt7957 < 0) {
				this.aShortArray96 = new short[this.anInt7956];
				for (@Pc(76) int local76 = 0; local76 < this.anInt7956; local76++) {
					this.aShortArray96[local76] = (short) arg0.method7043();
				}
			}
		} else if (arg1 == 3) {
			this.anInt7950 = this.anInt7952 = arg0.method7004();
		} else if (arg1 == 4) {
			this.anInt7951 = arg0.method7004();
		} else if (arg1 == 5) {
			this.anInt7950 = arg0.method7004();
		} else if (arg1 == 6) {
			this.anInt7952 = arg0.method7004();
		}
	}
}
