import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class5_Sub1_Sub22 extends Class5_Sub1 {

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
	public int anInt7260 = 1638;

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "Z")
	public boolean aBoolean561 = true;

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
	public int anInt7266 = 4;

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
	public int anInt7263 = 4;

	@OriginalMember(owner = "client!oh", name = "U", descriptor = "[B")
	private byte[] aByteArray68 = new byte[512];

	@OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
	public int anInt7271 = 4;

	@OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
	public int anInt7273 = 0;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.aBoolean561 = arg1.method8529() == 1;
		} else if (arg0 == 1) {
			this.anInt7271 = arg1.method8529();
		} else if (arg0 == 2) {
			this.anInt7260 = arg1.method8516();
			if (this.anInt7260 < 0) {
				this.aShortArray90 = new short[this.anInt7271];
				for (@Pc(94) int local94 = 0; local94 < this.anInt7271; local94++) {
					this.aShortArray90[local94] = (short) arg1.method8516();
				}
			}
		} else if (arg0 == 3) {
			this.anInt7263 = this.anInt7266 = arg1.method8529();
		} else if (arg0 == 4) {
			this.anInt7273 = arg1.method8529();
		} else if (arg0 == 5) {
			this.anInt7263 = arg1.method8529();
		} else if (arg0 == 6) {
			this.anInt7266 = arg1.method8529();
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
	private void method6282() {
		@Pc(36) int local36;
		if (this.anInt7260 > 0) {
			this.aShortArray90 = new short[this.anInt7271];
			this.aShortArray89 = new short[this.anInt7271];
			for (local36 = 0; local36 < this.anInt7271; local36++) {
				this.aShortArray90[local36] = (short) (int) (Math.pow((double) ((float) this.anInt7260 / 4096.0F), (double) local36) * 4096.0D);
				this.aShortArray89[local36] = (short) (int) Math.pow(2.0D, (double) local36);
			}
		} else if (this.aShortArray90 != null && this.anInt7271 == this.aShortArray90.length) {
			this.aShortArray89 = new short[this.anInt7271];
			for (local36 = 0; local36 < this.anInt7271; local36++) {
				this.aShortArray89[local36] = (short) (int) Math.pow(2.0D, (double) local36);
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIBIIII)I")
	private int method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg3 <= local13) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(32) int local32 = arg4 & 0xFFF;
		@Pc(36) int local36 = arg5 - 4096;
		@Pc(40) int local40 = local32 - 4096;
		local13 &= 0xFF;
		@Pc(54) int local54 = this.aByteArray68[local9 + arg1] & 0x3;
		@Pc(58) int local58 = Class22_Sub1.anIntArray30[local32];
		@Pc(77) int local77;
		if (local54 <= 1) {
			local77 = local54 == 0 ? local32 + arg5 : arg5 - local32;
		} else {
			local77 = local54 == 2 ? local32 - arg5 : -arg5 + -local32;
		}
		local54 = this.aByteArray68[local13 + arg1] & 0x3;
		@Pc(127) int local127;
		if (local54 <= 1) {
			local127 = local54 == 0 ? local40 + arg5 : arg5 + -local40;
		} else {
			local127 = local54 == 2 ? local40 - arg5 : -local40 - arg5;
		}
		@Pc(156) int local156 = ((local127 - local77) * local58 >> 12) + local77;
		local54 = this.aByteArray68[local9 + arg0] & 0x3;
		if (local54 <= 1) {
			local77 = local54 == 0 ? local32 + local36 : local36 + -local32;
		} else {
			local77 = local54 == 2 ? local32 - local36 : -local32 - local36;
		}
		local54 = this.aByteArray68[local13 + arg0] & 0x3;
		if (local54 <= 1) {
			local127 = local54 == 0 ? local36 + local40 : -local40 + local36;
		} else {
			local127 = local54 == 2 ? local40 - local36 : -local36 + -local40;
		}
		@Pc(265) int local265 = local77 + (local58 * (local127 - local77) >> 12);
		return local156 + ((local265 - local156) * arg2 >> 12);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ[I)V")
	public void method6284(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt7266 * Static23.anIntArray27[arg0];
		@Pc(115) int local115;
		@Pc(129) int local129;
		@Pc(33) int local33;
		@Pc(38) short local38;
		@Pc(106) int local106;
		@Pc(51) int local51;
		@Pc(45) int local45;
		@Pc(58) int local58;
		@Pc(92) int local92;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(88) int local88;
		@Pc(101) int local101;
		if (this.anInt7271 == 1) {
			local33 = this.aShortArray89[0] << 12;
			local38 = this.aShortArray90[0];
			local45 = this.anInt7263 * local33 >> 12;
			local51 = local33 * local12 >> 12;
			local58 = local33 * this.anInt7266 >> 12;
			local62 = local51 >> 12;
			local66 = local62 + 1;
			local51 &= 0xFFF;
			if (local58 <= local66) {
				local66 = 0;
			}
			local88 = this.aByteArray68[local62 & 0xFF] & 0xFF;
			local92 = Class22_Sub1.anIntArray30[local51];
			local101 = this.aByteArray68[local66 & 0xFF] & 0xFF;
			if (this.aBoolean561) {
				for (local106 = 0; local106 < Static648.anInt9588; local106++) {
					local115 = this.anInt7263 * Static293.anIntArray288[local106];
					local129 = this.method6283(local101, local88, local92, local45, local115 * local33 >> 12, local51);
					local129 = local38 * local129 >> 12;
					arg1[local106] = (local129 >> 1) + 2048;
				}
			} else {
				for (local106 = 0; local106 < Static648.anInt9588; local106++) {
					local115 = this.anInt7263 * Static293.anIntArray288[local106];
					local129 = this.method6283(local101, local88, local92, local45, local115 * local33 >> 12, local51);
					arg1[local106] = local129 * local38 >> 12;
				}
			}
			return;
		}
		local38 = this.aShortArray90[0];
		if (local38 > 8 || local38 < -8) {
			local33 = this.aShortArray89[0] << 12;
			local45 = local33 * this.anInt7263 >> 12;
			local51 = local33 * local12 >> 12;
			local58 = local33 * this.anInt7266 >> 12;
			local62 = local51 >> 12;
			local66 = local62 + 1;
			if (local66 >= local58) {
				local66 = 0;
			}
			local51 &= 0xFFF;
			local101 = this.aByteArray68[local66 & 0xFF] & 0xFF;
			local88 = this.aByteArray68[local62 & 0xFF] & 0xFF;
			local92 = Class22_Sub1.anIntArray30[local51];
			for (local106 = 0; local106 < Static648.anInt9588; local106++) {
				local115 = Static293.anIntArray288[local106] * this.anInt7263;
				local129 = this.method6283(local101, local88, local92, local45, local33 * local115 >> 12, local51);
				arg1[local106] = local129 * local38 >> 12;
			}
		}
		for (@Pc(316) int local316 = 1; local316 < this.anInt7271; local316++) {
			local38 = this.aShortArray90[local316];
			if (local38 > 8 || local38 < -8) {
				local33 = this.aShortArray89[local316] << 12;
				local45 = this.anInt7263 * local33 >> 12;
				local58 = this.anInt7266 * local33 >> 12;
				local51 = local12 * local33 >> 12;
				local62 = local51 >> 12;
				local66 = local62 + 1;
				local51 &= 0xFFF;
				if (local58 <= local66) {
					local66 = 0;
				}
				local101 = this.aByteArray68[local66 & 0xFF] & 0xFF;
				local92 = Class22_Sub1.anIntArray30[local51];
				local88 = this.aByteArray68[local62 & 0xFF] & 0xFF;
				if (this.aBoolean561 && this.anInt7271 - 1 == local316) {
					for (local106 = 0; local106 < Static648.anInt9588; local106++) {
						local115 = Static293.anIntArray288[local106] * this.anInt7263;
						local129 = this.method6283(local101, local88, local92, local45, local115 * local33 >> 12, local51);
						local129 = (local38 * local129 >> 12) + arg1[local106];
						arg1[local106] = (local129 >> 1) + 2048;
					}
				} else {
					for (local106 = 0; local106 < Static648.anInt9588; local106++) {
						local115 = this.anInt7263 * Static293.anIntArray288[local106];
						local129 = this.method6283(local101, local88, local92, local45, local115 * local33 >> 12, local51);
						arg1[local106] += local129 * local38 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			this.method6284(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		this.aByteArray68 = Static655.method9057(this.anInt7273);
		this.method6282();
		for (@Pc(27) int local27 = this.anInt7271 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray90[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt7271--;
		}
	}
}
