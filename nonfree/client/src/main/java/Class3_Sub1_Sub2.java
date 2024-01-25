import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ada", name = "I", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ada", name = "J", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ada", name = "L", descriptor = "[B")
	private byte[] aByteArray1 = new byte[512];

	@OriginalMember(owner = "client!ada", name = "R", descriptor = "Z")
	public boolean aBoolean23 = true;

	@OriginalMember(owner = "client!ada", name = "P", descriptor = "I")
	public int anInt262 = 1638;

	@OriginalMember(owner = "client!ada", name = "K", descriptor = "I")
	public int anInt258 = 4;

	@OriginalMember(owner = "client!ada", name = "W", descriptor = "I")
	public int anInt267 = 4;

	@OriginalMember(owner = "client!ada", name = "S", descriptor = "I")
	public int anInt264 = 0;

	@OriginalMember(owner = "client!ada", name = "X", descriptor = "I")
	public int anInt268 = 4;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIBIII)I")
	private int method269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 >> 12;
		@Pc(11) int local11 = local7 + 1;
		if (local11 >= arg4) {
			local11 = 0;
		}
		local7 &= 0xFF;
		@Pc(24) int local24 = arg2 & 0xFFF;
		@Pc(28) int local28 = arg3 - 4096;
		@Pc(40) int local40 = local24 - 4096;
		local11 &= 0xFF;
		@Pc(53) int local53 = this.aByteArray1[arg1 + local7] & 0x3;
		@Pc(57) int local57 = Class77.anIntArray125[local24];
		@Pc(74) int local74;
		if (local53 > 1) {
			local74 = local53 == 2 ? local24 - arg3 : -local24 - arg3;
		} else {
			local74 = local53 == 0 ? local24 + arg3 : -local24 + arg3;
		}
		local53 = this.aByteArray1[local11 + arg1] & 0x3;
		@Pc(119) int local119;
		if (local53 <= 1) {
			local119 = local53 == 0 ? local40 + arg3 : -local40 + arg3;
		} else {
			local119 = local53 == 2 ? local40 - arg3 : -local40 + -arg3;
		}
		local53 = this.aByteArray1[local7 + arg5] & 0x3;
		@Pc(156) int local156 = (local57 * (local119 - local74) >> 12) + local74;
		if (local53 <= 1) {
			local74 = local53 == 0 ? local24 + local28 : -local24 + local28;
		} else {
			local74 = local53 == 2 ? local24 - local28 : -local24 - local28;
		}
		local53 = this.aByteArray1[local11 + arg5] & 0x3;
		if (local53 > 1) {
			local119 = local53 == 2 ? local40 - local28 : -local40 - local28;
		} else {
			local119 = local53 == 0 ? local28 + local40 : -local40 + local28;
		}
		@Pc(243) int local243 = ((local119 - local74) * local57 >> 12) + local74;
		return local156 + ((local243 - local156) * arg0 >> 12);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "([IBI)V")
	public void method271(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = Static324.anIntArray440[arg1] * this.anInt258;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(21) int local21;
		@Pc(26) short local26;
		@Pc(94) int local94;
		@Pc(39) int local39;
		@Pc(46) int local46;
		@Pc(33) int local33;
		@Pc(89) int local89;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(85) int local85;
		@Pc(76) int local76;
		if (this.anInt268 == 1) {
			local21 = this.aShortArray1[0] << 12;
			local26 = this.aShortArray2[0];
			local33 = this.anInt258 * local21 >> 12;
			local39 = local10 * local21 >> 12;
			local46 = this.anInt267 * local21 >> 12;
			local50 = local39 >> 12;
			local54 = local50 + 1;
			if (local33 <= local54) {
				local54 = 0;
			}
			local39 &= 0xFFF;
			local76 = this.aByteArray1[local54 & 0xFF] & 0xFF;
			local85 = this.aByteArray1[local50 & 0xFF] & 0xFF;
			local89 = Class77.anIntArray125[local39];
			if (this.aBoolean23) {
				for (local94 = 0; local94 < Static131.anInt2935; local94++) {
					local102 = this.anInt267 * Static361.anIntArray460[local94];
					local116 = this.method269(local89, local85, local21 * local102 >> 12, local39, local46, local76);
					local116 = local116 * local26 >> 12;
					arg0[local94] = (local116 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Static131.anInt2935; local94++) {
					local102 = Static361.anIntArray460[local94] * this.anInt267;
					local116 = this.method269(local89, local85, local21 * local102 >> 12, local39, local46, local76);
					arg0[local94] = local116 * local26 >> 12;
				}
			}
			return;
		}
		local26 = this.aShortArray2[0];
		if (local26 > 8 || local26 < -8) {
			local21 = this.aShortArray1[0] << 12;
			local33 = local21 * this.anInt258 >> 12;
			local46 = local21 * this.anInt267 >> 12;
			local39 = local21 * local10 >> 12;
			local50 = local39 >> 12;
			local54 = local50 + 1;
			if (local54 >= local33) {
				local54 = 0;
			}
			local39 &= 0xFFF;
			local85 = this.aByteArray1[local50 & 0xFF] & 0xFF;
			local89 = Class77.anIntArray125[local39];
			local76 = this.aByteArray1[local54 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Static131.anInt2935; local94++) {
				local102 = Static361.anIntArray460[local94] * this.anInt267;
				local116 = this.method269(local89, local85, local102 * local21 >> 12, local39, local46, local76);
				arg0[local94] = local116 * local26 >> 12;
			}
		}
		for (@Pc(291) int local291 = 1; local291 < this.anInt268; local291++) {
			local26 = this.aShortArray2[local291];
			if (local26 > 8 || local26 < -8) {
				local21 = this.aShortArray1[local291] << 12;
				local39 = local21 * local10 >> 12;
				local33 = local21 * this.anInt258 >> 12;
				local46 = local21 * this.anInt267 >> 12;
				local50 = local39 >> 12;
				local54 = local50 + 1;
				local39 &= 0xFFF;
				if (local33 <= local54) {
					local54 = 0;
				}
				local85 = this.aByteArray1[local50 & 0xFF] & 0xFF;
				local76 = this.aByteArray1[local54 & 0xFF] & 0xFF;
				local89 = Class77.anIntArray125[local39];
				if (this.aBoolean23 && this.anInt268 - 1 == local291) {
					for (local94 = 0; local94 < Static131.anInt2935; local94++) {
						local102 = Static361.anIntArray460[local94] * this.anInt267;
						local116 = this.method269(local89, local85, local102 * local21 >> 12, local39, local46, local76);
						local116 = arg0[local94] + (local116 * local26 >> 12);
						arg0[local94] = (local116 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Static131.anInt2935; local94++) {
						local102 = this.anInt267 * Static361.anIntArray460[local94];
						local116 = this.method269(local89, local85, local21 * local102 >> 12, local39, local46, local76);
						arg0[local94] += local26 * local116 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean23 = arg1.method6538() == 1;
		} else if (arg0 == 1) {
			this.anInt268 = arg1.method6538();
		} else if (arg0 == 2) {
			this.anInt262 = arg1.method6525();
			if (this.anInt262 < 0) {
				this.aShortArray2 = new short[this.anInt268];
				for (@Pc(78) int local78 = 0; local78 < this.anInt268; local78++) {
					this.aShortArray2[local78] = (short) arg1.method6525();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt267 = this.anInt258 = arg1.method6538();
			return;
		} else if (arg0 == 4) {
			this.anInt264 = arg1.method6538();
			return;
		} else if (arg0 == 5) {
			this.anInt267 = arg1.method6538();
			return;
		} else if (arg0 == 6) {
			this.anInt258 = arg1.method6538();
			return;
		}
	}

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		this.aByteArray1 = Static454.method7046(this.anInt264);
		this.method276();
		for (@Pc(21) int local21 = this.anInt268 - 1; local21 >= 1; local21--) {
			@Pc(27) short local27 = this.aShortArray2[local21];
			if (local27 > 8 || local27 < -8) {
				return;
			}
			this.anInt268--;
		}
	}

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "(B)V")
	private void method276() {
		@Pc(17) int local17;
		if (this.anInt262 > 0) {
			this.aShortArray1 = new short[this.anInt268];
			this.aShortArray2 = new short[this.anInt268];
			for (local17 = 0; local17 < this.anInt268; local17++) {
				this.aShortArray2[local17] = (short) (Math.pow((double) ((float) this.anInt262 / 4096.0F), (double) local17) * 4096.0D);
				this.aShortArray1[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		} else if (this.aShortArray2 != null && this.aShortArray2.length == this.anInt268) {
			this.aShortArray1 = new short[this.anInt268];
			for (local17 = 0; local17 < this.anInt268; local17++) {
				this.aShortArray1[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			this.method271(local9, arg0);
		}
		return local9;
	}
}
