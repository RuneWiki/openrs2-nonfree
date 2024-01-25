import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class1_Sub2_Sub39 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wk", name = "J", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!wk", name = "R", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "[B")
	private byte[] aByteArray94 = new byte[512];

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
	public int anInt6492 = 1638;

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
	public int anInt6493 = 4;

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
	public int anInt6489 = 4;

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
	public int anInt6490 = 4;

	@OriginalMember(owner = "client!wk", name = "U", descriptor = "Z")
	public boolean aBoolean584 = true;

	@OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
	public int anInt6499 = 0;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		this.aByteArray94 = Static310.method5232(this.anInt6499);
		this.method5670();
		for (@Pc(26) int local26 = this.anInt6489 - 1; local26 >= 1; local26--) {
			@Pc(33) short local33 = this.aShortArray112[local26];
			if (local33 > 8) {
				return;
			}
			if (local33 < -8) {
				return;
			}
			this.anInt6489--;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			this.method5666(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([IBI)V")
	public void method5666(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static66.anIntArray158[arg1] * this.anInt6490;
		@Pc(113) int local113;
		@Pc(127) int local127;
		@Pc(31) int local31;
		@Pc(36) short local36;
		@Pc(104) int local104;
		@Pc(42) int local42;
		@Pc(56) int local56;
		@Pc(49) int local49;
		@Pc(90) int local90;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(86) int local86;
		@Pc(99) int local99;
		if (this.anInt6489 == 1) {
			local31 = this.aShortArray111[0] << 12;
			local36 = this.aShortArray112[0];
			local42 = local31 * local12 >> 12;
			local49 = this.anInt6490 * local31 >> 12;
			local56 = local31 * this.anInt6493 >> 12;
			local60 = local42 >> 12;
			local64 = local60 + 1;
			if (local64 >= local49) {
				local64 = 0;
			}
			local42 &= 0xFFF;
			local86 = this.aByteArray94[local60 & 0xFF] & 0xFF;
			local90 = Class1_Sub2_Sub24.anIntArray462[local42];
			local99 = this.aByteArray94[local64 & 0xFF] & 0xFF;
			if (this.aBoolean584) {
				for (local104 = 0; local104 < Static251.anInt6509; local104++) {
					local113 = Static7.anIntArray23[local104] * this.anInt6493;
					local127 = this.method5669(local56, local31 * local113 >> 12, local42, local99, local86, local90);
					local127 = local36 * local127 >> 12;
					arg0[local104] = (local127 >> 1) + 2048;
				}
			} else {
				for (local104 = 0; local104 < Static251.anInt6509; local104++) {
					local113 = this.anInt6493 * Static7.anIntArray23[local104];
					local127 = this.method5669(local56, local31 * local113 >> 12, local42, local99, local86, local90);
					arg0[local104] = local127 * local36 >> 12;
				}
			}
			return;
		}
		local36 = this.aShortArray112[0];
		if (local36 > 8 || local36 < -8) {
			local31 = this.aShortArray111[0] << 12;
			local56 = local31 * this.anInt6493 >> 12;
			local42 = local31 * local12 >> 12;
			local49 = local31 * this.anInt6490 >> 12;
			local60 = local42 >> 12;
			local64 = local60 + 1;
			if (local49 <= local64) {
				local64 = 0;
			}
			local42 &= 0xFFF;
			local90 = Class1_Sub2_Sub24.anIntArray462[local42];
			local86 = this.aByteArray94[local60 & 0xFF] & 0xFF;
			local99 = this.aByteArray94[local64 & 0xFF] & 0xFF;
			for (local104 = 0; local104 < Static251.anInt6509; local104++) {
				local113 = Static7.anIntArray23[local104] * this.anInt6493;
				local127 = this.method5669(local56, local31 * local113 >> 12, local42, local99, local86, local90);
				arg0[local104] = local127 * local36 >> 12;
			}
		}
		for (@Pc(312) int local312 = 1; local312 < this.anInt6489; local312++) {
			local36 = this.aShortArray112[local312];
			if (local36 > 8 || local36 < -8) {
				local31 = this.aShortArray111[local312] << 12;
				local49 = this.anInt6490 * local31 >> 12;
				local42 = local12 * local31 >> 12;
				local56 = local31 * this.anInt6493 >> 12;
				local60 = local42 >> 12;
				local64 = local60 + 1;
				local42 &= 0xFFF;
				if (local49 <= local64) {
					local64 = 0;
				}
				local99 = this.aByteArray94[local64 & 0xFF] & 0xFF;
				local86 = this.aByteArray94[local60 & 0xFF] & 0xFF;
				local90 = Class1_Sub2_Sub24.anIntArray462[local42];
				if (this.aBoolean584 && local312 == this.anInt6489 - 1) {
					for (local104 = 0; local104 < Static251.anInt6509; local104++) {
						local113 = this.anInt6493 * Static7.anIntArray23[local104];
						local127 = this.method5669(local56, local31 * local113 >> 12, local42, local99, local86, local90);
						local127 = (local36 * local127 >> 12) + arg0[local104];
						arg0[local104] = (local127 >> 1) + 2048;
					}
				} else {
					for (local104 = 0; local104 < Static251.anInt6509; local104++) {
						local113 = Static7.anIntArray23[local104] * this.anInt6493;
						local127 = this.method5669(local56, local31 * local113 >> 12, local42, local99, local86, local90);
						arg0[local104] += local36 * local127 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean584 = arg1.method3141() == 1;
		} else if (arg0 == 1) {
			this.anInt6489 = arg1.method3141();
		} else if (arg0 == 2) {
			this.anInt6492 = arg1.method3090();
			if (this.anInt6492 < 0) {
				this.aShortArray112 = new short[this.anInt6489];
				for (@Pc(70) int local70 = 0; local70 < this.anInt6489; local70++) {
					this.aShortArray112[local70] = (short) arg1.method3090();
				}
			}
		} else if (arg0 == 3) {
			this.anInt6493 = this.anInt6490 = arg1.method3141();
		} else if (arg0 == 4) {
			this.anInt6499 = arg1.method3141();
		} else if (arg0 == 5) {
			this.anInt6493 = arg1.method3141();
		} else if (arg0 == 6) {
			this.anInt6490 = arg1.method3141();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIII)I")
	private int method5669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg1 & 0xFFF;
		if (local13 >= arg0) {
			local13 = 0;
		}
		local9 &= 0xFF;
		local13 &= 0xFF;
		@Pc(44) int local44 = local17 - 4096;
		@Pc(48) int local48 = arg2 - 4096;
		@Pc(52) int local52 = Class1_Sub2_Sub24.anIntArray462[local17];
		@Pc(61) int local61 = this.aByteArray94[arg4 + local9] & 0x3;
		@Pc(78) int local78;
		if (local61 <= 1) {
			local78 = local61 == 0 ? local17 + arg2 : -local17 + arg2;
		} else {
			local78 = local61 == 2 ? local17 - arg2 : -arg2 + -local17;
		}
		local61 = this.aByteArray94[local13 + arg4] & 0x3;
		@Pc(119) int local119;
		if (local61 > 1) {
			local119 = local61 == 2 ? local44 - arg2 : -local44 + -arg2;
		} else {
			local119 = local61 == 0 ? local44 + arg2 : arg2 - local44;
		}
		@Pc(146) int local146 = ((local119 - local78) * local52 >> 12) + local78;
		local61 = this.aByteArray94[arg3 + local9] & 0x3;
		if (local61 > 1) {
			local78 = local61 == 2 ? local17 - local48 : -local48 + -local17;
		} else {
			local78 = local61 == 0 ? local48 + local17 : -local17 + local48;
		}
		local61 = this.aByteArray94[local13 + arg3] & 0x3;
		if (local61 > 1) {
			local119 = local61 == 2 ? local44 - local48 : -local48 + -local44;
		} else {
			local119 = local61 == 0 ? local44 + local48 : -local44 + local48;
		}
		@Pc(239) int local239 = local78 + (local52 * (local119 - local78) >> 12);
		return local146 + ((local239 - local146) * arg5 >> 12);
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V")
	private void method5670() {
		@Pc(39) int local39;
		if (this.anInt6492 > 0) {
			this.aShortArray111 = new short[this.anInt6489];
			this.aShortArray112 = new short[this.anInt6489];
			for (local39 = 0; local39 < this.anInt6489; local39++) {
				this.aShortArray112[local39] = (short) (Math.pow((double) ((float) this.anInt6492 / 4096.0F), (double) local39) * 4096.0D);
				this.aShortArray111[local39] = (short) Math.pow(2.0D, (double) local39);
			}
		} else if (this.aShortArray112 != null && this.aShortArray112.length == this.anInt6489) {
			this.aShortArray111 = new short[this.anInt6489];
			for (local39 = 0; local39 < this.anInt6489; local39++) {
				this.aShortArray111[local39] = (short) Math.pow(2.0D, (double) local39);
			}
			return;
		}
	}
}
