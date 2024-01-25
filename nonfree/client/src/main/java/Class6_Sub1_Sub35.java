import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class6_Sub1_Sub35 extends Class6_Sub1 {

	@OriginalMember(owner = "client!u", name = "J", descriptor = "[S")
	private short[] aShortArray165;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "[S")
	private short[] aShortArray166;

	@OriginalMember(owner = "client!u", name = "D", descriptor = "Z")
	public boolean aBoolean770 = true;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "[B")
	private byte[] aByteArray95 = new byte[512];

	@OriginalMember(owner = "client!u", name = "H", descriptor = "I")
	public int anInt9674 = 4;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "I")
	public int anInt9672 = 4;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "I")
	public int anInt9677 = 1638;

	@OriginalMember(owner = "client!u", name = "K", descriptor = "I")
	public int anInt9675 = 4;

	@OriginalMember(owner = "client!u", name = "S", descriptor = "I")
	public int anInt9682 = 0;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		this.aByteArray95 = Static492.method7160(this.anInt9682);
		this.method7920();
		for (@Pc(25) int local25 = this.anInt9672 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray165[local25];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt9672--;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B[II)V")
	public void method7919(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9675 * Static603.anIntArray549[arg1];
		@Pc(113) int local113;
		@Pc(127) int local127;
		@Pc(36) int local36;
		@Pc(29) short local29;
		@Pc(104) int local104;
		@Pc(56) int local56;
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(90) int local90;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (this.anInt9672 == 1) {
			local29 = this.aShortArray165[0];
			local36 = this.aShortArray166[0] << 12;
			local43 = local36 * this.anInt9674 >> 12;
			local50 = this.anInt9675 * local36 >> 12;
			local56 = local36 * local12 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			if (local64 >= local50) {
				local64 = 0;
			}
			local56 &= 0xFFF;
			local86 = this.aByteArray95[local60 & 0xFF] & 0xFF;
			local90 = Class16_Sub8.anIntArray550[local56];
			local99 = this.aByteArray95[local64 & 0xFF] & 0xFF;
			if (this.aBoolean770) {
				for (local104 = 0; local104 < Static53.anInt1787; local104++) {
					local113 = Static12.anIntArray15[local104] * this.anInt9674;
					local127 = this.method7921(local90, local43, local113 * local36 >> 12, local99, local86, local56);
					local127 = local29 * local127 >> 12;
					arg0[local104] = (local127 >> 1) + 2048;
				}
			} else {
				for (local104 = 0; local104 < Static53.anInt1787; local104++) {
					local113 = Static12.anIntArray15[local104] * this.anInt9674;
					local127 = this.method7921(local90, local43, local113 * local36 >> 12, local99, local86, local56);
					arg0[local104] = local127 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray165[0];
		if (local29 > 8 || local29 < -8) {
			local36 = this.aShortArray166[0] << 12;
			local43 = this.anInt9674 * local36 >> 12;
			local50 = local36 * this.anInt9675 >> 12;
			local56 = local12 * local36 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			@Pc(238) int local238 = local56 & 0xFFF;
			if (local64 >= local50) {
				local64 = 0;
			}
			local86 = this.aByteArray95[local60 & 0xFF] & 0xFF;
			local90 = Class16_Sub8.anIntArray550[local238];
			local99 = this.aByteArray95[local64 & 0xFF] & 0xFF;
			for (local104 = 0; local104 < Static53.anInt1787; local104++) {
				local113 = this.anInt9674 * Static12.anIntArray15[local104];
				local127 = this.method7921(local90, local43, local113 * local36 >> 12, local99, local86, local238);
				arg0[local104] = local127 * local29 >> 12;
			}
		}
		for (@Pc(312) int local312 = 1; local312 < this.anInt9672; local312++) {
			local29 = this.aShortArray165[local312];
			if (local29 > 8 || local29 < -8) {
				local36 = this.aShortArray166[local312] << 12;
				local43 = local36 * this.anInt9674 >> 12;
				local56 = local36 * local12 >> 12;
				local50 = this.anInt9675 * local36 >> 12;
				local60 = local56 >> 12;
				local64 = local60 + 1;
				local56 &= 0xFFF;
				if (local50 <= local64) {
					local64 = 0;
				}
				local99 = this.aByteArray95[local64 & 0xFF] & 0xFF;
				local90 = Class16_Sub8.anIntArray550[local56];
				local86 = this.aByteArray95[local60 & 0xFF] & 0xFF;
				if (this.aBoolean770 && local312 == this.anInt9672 - 1) {
					for (local104 = 0; local104 < Static53.anInt1787; local104++) {
						local113 = this.anInt9674 * Static12.anIntArray15[local104];
						local127 = this.method7921(local90, local43, local36 * local113 >> 12, local99, local86, local56);
						local127 = arg0[local104] + (local127 * local29 >> 12);
						arg0[local104] = (local127 >> 1) + 2048;
					}
				} else {
					for (local104 = 0; local104 < Static53.anInt1787; local104++) {
						local113 = Static12.anIntArray15[local104] * this.anInt9674;
						local127 = this.method7921(local90, local43, local113 * local36 >> 12, local99, local86, local56);
						arg0[local104] += local29 * local127 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean770 = arg1.method8246() == 1;
		} else if (arg0 == 1) {
			this.anInt9672 = arg1.method8246();
		} else if (arg0 == 2) {
			this.anInt9677 = arg1.method8231();
			if (this.anInt9677 < 0) {
				this.aShortArray165 = new short[this.anInt9672];
				for (@Pc(65) int local65 = 0; local65 < this.anInt9672; local65++) {
					this.aShortArray165[local65] = (short) arg1.method8231();
				}
			}
		} else if (arg0 == 3) {
			this.anInt9674 = this.anInt9675 = arg1.method8246();
		} else if (arg0 == 4) {
			this.anInt9682 = arg1.method8246();
		} else if (arg0 == 5) {
			this.anInt9674 = arg1.method8246();
		} else if (arg0 == 6) {
			this.anInt9675 = arg1.method8246();
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	private void method7920() {
		@Pc(36) int local36;
		if (this.anInt9677 > 0) {
			this.aShortArray165 = new short[this.anInt9672];
			this.aShortArray166 = new short[this.anInt9672];
			for (local36 = 0; local36 < this.anInt9672; local36++) {
				this.aShortArray165[local36] = (short) (int) (Math.pow((double) ((float) this.anInt9677 / 4096.0F), (double) local36) * 4096.0D);
				this.aShortArray166[local36] = (short) (int) Math.pow(2.0D, (double) local36);
			}
		} else if (this.aShortArray165 != null && this.anInt9672 == this.aShortArray165.length) {
			this.aShortArray166 = new short[this.anInt9672];
			for (local36 = 0; local36 < this.anInt9672; local36++) {
				this.aShortArray166[local36] = (short) (int) Math.pow(2.0D, (double) local36);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			this.method7919(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIII)I")
	private int method7921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg1) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(30) int local30 = arg2 & 0xFFF;
		@Pc(34) int local34 = local30 - 4096;
		@Pc(51) int local51 = arg5 - 4096;
		local13 &= 0xFF;
		@Pc(59) int local59 = Class16_Sub8.anIntArray550[local30];
		@Pc(68) int local68 = this.aByteArray95[local9 + arg4] & 0x3;
		@Pc(85) int local85;
		if (local68 <= 1) {
			local85 = local68 == 0 ? local30 + arg5 : -local30 + arg5;
		} else {
			local85 = local68 == 2 ? local30 - arg5 : -arg5 + -local30;
		}
		local68 = this.aByteArray95[local13 + arg4] & 0x3;
		@Pc(128) int local128;
		if (local68 <= 1) {
			local128 = local68 == 0 ? local34 + arg5 : -local34 + arg5;
		} else {
			local128 = local68 == 2 ? local34 - arg5 : -local34 + -arg5;
		}
		@Pc(153) int local153 = (local59 * (local128 - local85) >> 12) + local85;
		local68 = this.aByteArray95[arg3 + local9] & 0x3;
		if (local68 <= 1) {
			local85 = local68 == 0 ? local30 + local51 : local51 - local30;
		} else {
			local85 = local68 == 2 ? local30 - local51 : -local51 + -local30;
		}
		local68 = this.aByteArray95[local13 + arg3] & 0x3;
		if (local68 > 1) {
			local128 = local68 == 2 ? local34 - local51 : -local34 + -local51;
		} else {
			local128 = local68 == 0 ? local34 + local51 : local51 - local34;
		}
		@Pc(240) int local240 = local85 + ((local128 - local85) * local59 >> 12);
		return local153 + (arg0 * (local240 - local153) >> 12);
	}
}
