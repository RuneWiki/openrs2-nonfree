import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tm", name = "gb", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!tm", name = "hb", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!tm", name = "U", descriptor = "I")
	public int anInt5634 = 1638;

	@OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
	public int anInt5633 = 4;

	@OriginalMember(owner = "client!tm", name = "X", descriptor = "[B")
	private byte[] aByteArray73 = new byte[512];

	@OriginalMember(owner = "client!tm", name = "S", descriptor = "I")
	public int anInt5632 = 4;

	@OriginalMember(owner = "client!tm", name = "W", descriptor = "I")
	public int anInt5636 = 0;

	@OriginalMember(owner = "client!tm", name = "cb", descriptor = "Z")
	public boolean aBoolean298 = true;

	@OriginalMember(owner = "client!tm", name = "kb", descriptor = "I")
	public int anInt5643 = 4;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			this.method4392(local5, arg0);
		}
		return local5;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		this.aByteArray73 = Static132.method2273(this.anInt5636);
		this.method4390();
		for (@Pc(24) int local24 = this.anInt5643 - 1; local24 >= 1; local24--) {
			@Pc(32) short local32 = this.aShortArray86[local24];
			if (local32 > 8 || local32 < -8) {
				break;
			}
			this.anInt5643--;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean298 = arg0.method2655() == 1;
		} else if (arg1 == 1) {
			this.anInt5643 = arg0.method2655();
		} else if (arg1 == 2) {
			this.anInt5634 = arg0.method2645();
			if (this.anInt5634 < 0) {
				this.aShortArray86 = new short[this.anInt5643];
				for (@Pc(77) int local77 = 0; local77 < this.anInt5643; local77++) {
					this.aShortArray86[local77] = (short) arg0.method2645();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5633 = this.anInt5632 = arg0.method2655();
		} else if (arg1 == 4) {
			this.anInt5636 = arg0.method2655();
		} else if (arg1 == 5) {
			this.anInt5633 = arg0.method2655();
		} else if (arg1 == 6) {
			this.anInt5632 = arg0.method2655();
		}
	}

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V")
	private void method4390() {
		@Pc(26) int local26;
		if (this.anInt5634 > 0) {
			this.aShortArray87 = new short[this.anInt5643];
			this.aShortArray86 = new short[this.anInt5643];
			for (local26 = 0; local26 < this.anInt5643; local26++) {
				this.aShortArray86[local26] = (short) (Math.pow((double) ((float) this.anInt5634 / 4096.0F), (double) local26) * 4096.0D);
				this.aShortArray87[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		} else if (this.aShortArray86 != null && this.anInt5643 == this.aShortArray86.length) {
			this.aShortArray87 = new short[this.anInt5643];
			for (local26 = 0; local26 < this.anInt5643; local26++) {
				this.aShortArray87[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([III)V")
	public void method4392(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = this.anInt5632 * Static98.anIntArray221[arg1];
		@Pc(117) int local117;
		@Pc(133) int local133;
		@Pc(45) int local45;
		@Pc(28) short local28;
		@Pc(107) int local107;
		@Pc(58) int local58;
		@Pc(52) int local52;
		@Pc(65) int local65;
		@Pc(105) int local105;
		@Pc(69) int local69;
		@Pc(82) int local82;
		@Pc(78) int local78;
		@Pc(101) int local101;
		if (this.anInt5643 == 1) {
			local28 = this.aShortArray86[0];
			local45 = this.aShortArray87[0] << 12;
			local52 = this.anInt5633 * local45 >> 12;
			local58 = local19 * local45 >> 12;
			local65 = local45 * this.anInt5632 >> 12;
			local69 = local58 >> 12;
			local58 &= 0xFFF;
			local78 = this.aByteArray73[local69 & 0xFF] & 0xFF;
			local105 = Class10_Sub2_Sub1.anIntArray213[local58];
			local82 = local69 + 1;
			if (local65 <= local82) {
				local82 = 0;
			}
			local101 = this.aByteArray73[local82 & 0xFF] & 0xFF;
			if (this.aBoolean298) {
				for (local107 = 0; local107 < Static75.anInt1848; local107++) {
					local117 = this.anInt5633 * Static157.anIntArray331[local107];
					local133 = this.method4395(local78, local58, local105, local52, local101, local45 * local117 >> 12);
					local133 = local28 * local133 >> 12;
					arg0[local107] = (local133 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static75.anInt1848; local107++) {
					local117 = Static157.anIntArray331[local107] * this.anInt5633;
					local133 = this.method4395(local78, local58, local105, local52, local101, local45 * local117 >> 12);
					arg0[local107] = local133 * local28 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray86[0];
		if (local28 > 8 || local28 < -8) {
			local45 = this.aShortArray87[0] << 12;
			local52 = this.anInt5633 * local45 >> 12;
			local58 = local19 * local45 >> 12;
			local65 = this.anInt5632 * local45 >> 12;
			local69 = local58 >> 12;
			local78 = this.aByteArray73[local69 & 0xFF] & 0xFF;
			local82 = local69 + 1;
			if (local82 >= local65) {
				local82 = 0;
			}
			local58 &= 0xFFF;
			local101 = this.aByteArray73[local82 & 0xFF] & 0xFF;
			local105 = Class10_Sub2_Sub1.anIntArray213[local58];
			for (local107 = 0; local107 < Static75.anInt1848; local107++) {
				local117 = Static157.anIntArray331[local107] * this.anInt5633;
				local133 = this.method4395(local78, local58, local105, local52, local101, local117 * local45 >> 12);
				arg0[local107] = local133 * local28 >> 12;
			}
		}
		for (@Pc(146) int local146 = 1; local146 < this.anInt5643; local146++) {
			local28 = this.aShortArray86[local146];
			if (local28 > 8 || local28 < -8) {
				local45 = this.aShortArray87[local146] << 12;
				local65 = local45 * this.anInt5632 >> 12;
				local58 = local19 * local45 >> 12;
				local52 = this.anInt5633 * local45 >> 12;
				local69 = local58 >> 12;
				local58 &= 0xFFF;
				local105 = Class10_Sub2_Sub1.anIntArray213[local58];
				local78 = this.aByteArray73[local69 & 0xFF] & 0xFF;
				local82 = local69 + 1;
				if (local65 <= local82) {
					local82 = 0;
				}
				local101 = this.aByteArray73[local82 & 0xFF] & 0xFF;
				if (this.aBoolean298 && local146 == this.anInt5643 - 1) {
					for (local107 = 0; local107 < Static75.anInt1848; local107++) {
						local117 = this.anInt5633 * Static157.anIntArray331[local107];
						local133 = this.method4395(local78, local58, local105, local52, local101, local117 * local45 >> 12);
						local133 = arg0[local107] + (local133 * local28 >> 12);
						arg0[local107] = (local133 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static75.anInt1848; local107++) {
						local117 = Static157.anIntArray331[local107] * this.anInt5633;
						local133 = this.method4395(local78, local58, local105, local52, local101, local117 * local45 >> 12);
						arg0[local107] += local28 * local133 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIII)I")
	private int method4395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg1 - 4096;
		@Pc(19) int local19 = arg5 >> 12;
		@Pc(23) int local23 = arg5 & 0xFFF;
		@Pc(27) int local27 = local23 - 4096;
		@Pc(31) int local31 = Class10_Sub2_Sub1.anIntArray213[local23];
		@Pc(35) int local35 = local19 + 1;
		@Pc(39) int local39 = local19 & 0xFF;
		if (arg3 <= local35) {
			local35 = 0;
		}
		@Pc(53) int local53 = this.aByteArray73[arg0 + local39] & 0x3;
		local35 &= 0xFF;
		@Pc(72) int local72;
		if (local53 <= 1) {
			local72 = local53 == 0 ? arg1 + local23 : -local23 + arg1;
		} else {
			local72 = local53 == 2 ? local23 - arg1 : -arg1 + -local23;
		}
		local53 = this.aByteArray73[arg0 + local35] & 0x3;
		@Pc(118) int local118;
		if (local53 > 1) {
			local118 = local53 == 2 ? local27 - arg1 : -arg1 + -local27;
		} else {
			local118 = local53 == 0 ? arg1 + local27 : arg1 + -local27;
		}
		@Pc(142) int local142 = ((local118 - local72) * local31 >> 12) + local72;
		local53 = this.aByteArray73[local39 + arg4] & 0x3;
		if (local53 <= 1) {
			local72 = local53 == 0 ? local23 + local15 : -local23 + local15;
		} else {
			local72 = local53 == 2 ? local23 - local15 : -local23 + -local15;
		}
		local53 = this.aByteArray73[local35 + arg4] & 0x3;
		if (local53 > 1) {
			local118 = local53 == 2 ? local27 - local15 : -local15 + -local27;
		} else {
			local118 = local53 == 0 ? local15 + local27 : local15 - local27;
		}
		@Pc(243) int local243 = local72 + (local31 * (local118 - local72) >> 12);
		return (arg2 * (local243 - local142) >> 12) + local142;
	}
}
