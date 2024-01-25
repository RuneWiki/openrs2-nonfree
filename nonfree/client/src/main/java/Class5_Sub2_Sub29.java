import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class5_Sub2_Sub29 extends Class5_Sub2 {

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
	public int anInt5237 = 4;

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "[B")
	private byte[] aByteArray74 = new byte[512];

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "Z")
	public boolean aBoolean400 = true;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
	public int anInt5244 = 0;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
	public int anInt5235 = 4;

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
	public int anInt5239 = 4;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
	public int anInt5242 = 1638;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean400 = arg0.method1832() == 1;
		} else if (arg1 == 1) {
			this.anInt5235 = arg0.method1832();
		} else if (arg1 == 2) {
			this.anInt5242 = arg0.method1834();
			if (this.anInt5242 < 0) {
				this.aShortArray87 = new short[this.anInt5235];
				for (@Pc(77) int local77 = 0; local77 < this.anInt5235; local77++) {
					this.aShortArray87[local77] = (short) arg0.method1834();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt5239 = this.anInt5237 = arg0.method1832();
			return;
		} else if (arg1 == 4) {
			this.anInt5244 = arg0.method1832();
			return;
		} else if (arg1 == 5) {
			this.anInt5239 = arg0.method1832();
			return;
		} else if (arg1 == 6) {
			this.anInt5237 = arg0.method1832();
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			this.method4619(local16, arg0);
		}
		return local16;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIZI)I")
	private int method4618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg2) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg4 & 0xFFF;
		local9 &= 0xFF;
		@Pc(34) int local34 = arg0 - 4096;
		@Pc(38) int local38 = local26 - 4096;
		local13 &= 0xFF;
		@Pc(51) int local51 = this.aByteArray74[arg5 + local9] & 0x3;
		@Pc(55) int local55 = Class191.anIntArray486[local26];
		@Pc(71) int local71;
		if (local51 > 1) {
			local71 = local51 == 2 ? local26 - arg0 : -local26 - arg0;
		} else {
			local71 = local51 == 0 ? arg0 + local26 : arg0 - local26;
		}
		local51 = this.aByteArray74[local13 + arg5] & 0x3;
		@Pc(109) int local109;
		if (local51 <= 1) {
			local109 = local51 == 0 ? local38 + arg0 : -local38 + arg0;
		} else {
			local109 = local51 == 2 ? local38 - arg0 : -local38 + -arg0;
		}
		@Pc(136) int local136 = local71 + ((local109 - local71) * local55 >> 12);
		local51 = this.aByteArray74[local9 + arg3] & 0x3;
		if (local51 <= 1) {
			local71 = local51 == 0 ? local34 + local26 : -local26 + local34;
		} else {
			local71 = local51 == 2 ? local26 - local34 : -local26 + -local34;
		}
		local51 = this.aByteArray74[local13 + arg3] & 0x3;
		if (local51 <= 1) {
			local109 = local51 == 0 ? local34 + local38 : local34 - local38;
		} else {
			local109 = local51 == 2 ? local38 - local34 : -local34 + -local38;
		}
		@Pc(239) int local239 = local71 + (local55 * (local109 - local71) >> 12);
		return ((local239 - local136) * arg1 >> 12) + local136;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)V")
	public void method4619(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static287.anIntArray413[arg1] * this.anInt5237;
		@Pc(110) int local110;
		@Pc(124) int local124;
		@Pc(28) int local28;
		@Pc(33) short local33;
		@Pc(101) int local101;
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(40) int local40;
		@Pc(87) int local87;
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(83) int local83;
		@Pc(96) int local96;
		if (this.anInt5235 == 1) {
			local28 = this.aShortArray88[0] << 12;
			local33 = this.aShortArray87[0];
			local40 = local28 * this.anInt5237 >> 12;
			local46 = local12 * local28 >> 12;
			local53 = this.anInt5239 * local28 >> 12;
			local57 = local46 >> 12;
			local61 = local57 + 1;
			if (local61 >= local40) {
				local61 = 0;
			}
			local46 &= 0xFFF;
			local83 = this.aByteArray74[local57 & 0xFF] & 0xFF;
			local87 = Class191.anIntArray486[local46];
			local96 = this.aByteArray74[local61 & 0xFF] & 0xFF;
			if (this.aBoolean400) {
				for (local101 = 0; local101 < Static15.anInt493; local101++) {
					local110 = Static257.anIntArray386[local101] * this.anInt5239;
					local124 = this.method4618(local46, local87, local53, local96, local28 * local110 >> 12, local83);
					local124 = local33 * local124 >> 12;
					arg0[local101] = (local124 >> 1) + 2048;
				}
			} else {
				for (local101 = 0; local101 < Static15.anInt493; local101++) {
					local110 = Static257.anIntArray386[local101] * this.anInt5239;
					local124 = this.method4618(local46, local87, local53, local96, local28 * local110 >> 12, local83);
					arg0[local101] = local124 * local33 >> 12;
				}
			}
			return;
		}
		local33 = this.aShortArray87[0];
		if (local33 > 8 || local33 < -8) {
			local28 = this.aShortArray88[0] << 12;
			local40 = local28 * this.anInt5237 >> 12;
			local46 = local12 * local28 >> 12;
			local53 = local28 * this.anInt5239 >> 12;
			local57 = local46 >> 12;
			local61 = local57 + 1;
			@Pc(239) int local239 = local46 & 0xFFF;
			if (local40 <= local61) {
				local61 = 0;
			}
			local83 = this.aByteArray74[local57 & 0xFF] & 0xFF;
			local87 = Class191.anIntArray486[local239];
			local96 = this.aByteArray74[local61 & 0xFF] & 0xFF;
			for (local101 = 0; local101 < Static15.anInt493; local101++) {
				local110 = Static257.anIntArray386[local101] * this.anInt5239;
				local124 = this.method4618(local239, local87, local53, local96, local110 * local28 >> 12, local83);
				arg0[local101] = local33 * local124 >> 12;
			}
		}
		for (@Pc(305) int local305 = 1; local305 < this.anInt5235; local305++) {
			local33 = this.aShortArray87[local305];
			if (local33 > 8 || local33 < -8) {
				local28 = this.aShortArray88[local305] << 12;
				local40 = local28 * this.anInt5237 >> 12;
				local46 = local28 * local12 >> 12;
				local53 = this.anInt5239 * local28 >> 12;
				local57 = local46 >> 12;
				local61 = local57 + 1;
				local46 &= 0xFFF;
				if (local61 >= local40) {
					local61 = 0;
				}
				local87 = Class191.anIntArray486[local46];
				local83 = this.aByteArray74[local57 & 0xFF] & 0xFF;
				local96 = this.aByteArray74[local61 & 0xFF] & 0xFF;
				if (this.aBoolean400 && local305 == this.anInt5235 - 1) {
					for (local101 = 0; local101 < Static15.anInt493; local101++) {
						local110 = this.anInt5239 * Static257.anIntArray386[local101];
						local124 = this.method4618(local46, local87, local53, local96, local110 * local28 >> 12, local83);
						local124 = arg0[local101] + (local33 * local124 >> 12);
						arg0[local101] = (local124 >> 1) + 2048;
					}
				} else {
					for (local101 = 0; local101 < Static15.anInt493; local101++) {
						local110 = this.anInt5239 * Static257.anIntArray386[local101];
						local124 = this.method4618(local46, local87, local53, local96, local28 * local110 >> 12, local83);
						arg0[local101] += local33 * local124 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
	private void method4622() {
		@Pc(24) int local24;
		if (this.anInt5242 > 0) {
			this.aShortArray87 = new short[this.anInt5235];
			this.aShortArray88 = new short[this.anInt5235];
			for (local24 = 0; local24 < this.anInt5235; local24++) {
				this.aShortArray87[local24] = (short) (Math.pow((double) ((float) this.anInt5242 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray88[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray87 != null && this.anInt5235 == this.aShortArray87.length) {
			this.aShortArray88 = new short[this.anInt5235];
			for (local24 = 0; local24 < this.anInt5235; local24++) {
				this.aShortArray88[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		this.aByteArray74 = Static104.method2067(this.anInt5244);
		this.method4622();
		for (@Pc(24) int local24 = this.anInt5235 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray87[local24];
			if (local31 > 8 || local31 < -8) {
				return;
			}
			this.anInt5235--;
		}
	}
}
