import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ag", name = "H", descriptor = "[B")
	public static final byte[] aByteArray14 = new byte[32896];

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "Z")
	public boolean aBoolean8 = true;

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
	public int anInt212 = 1638;

	@OriginalMember(owner = "client!ag", name = "G", descriptor = "[B")
	private byte[] aByteArray13 = new byte[512];

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
	public int anInt209 = 4;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
	public int anInt210 = 4;

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
	public int anInt214 = 0;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
	public int anInt215 = 4;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray14[local4++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			this.method228(arg0, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI[I)V")
	public void method228(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(20) int local20 = this.anInt209 * Static61.anIntArray80[arg0];
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
		@Pc(99) int local99;
		@Pc(86) int local86;
		if (this.anInt210 == 1) {
			local29 = this.aShortArray12[0];
			local36 = this.aShortArray13[0] << 12;
			local43 = this.anInt215 * local36 >> 12;
			local50 = this.anInt209 * local36 >> 12;
			local56 = local20 * local36 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			local56 &= 0xFFF;
			if (local50 <= local64) {
				local64 = 0;
			}
			local86 = this.aByteArray13[local64 & 0xFF] & 0xFF;
			local90 = Class375.anIntArray826[local56];
			local99 = this.aByteArray13[local60 & 0xFF] & 0xFF;
			if (this.aBoolean8) {
				for (local104 = 0; local104 < Static314.anInt6320; local104++) {
					local113 = Static68.anIntArray94[local104] * this.anInt215;
					local127 = this.method230(local90, local86, local113 * local36 >> 12, local43, local99, local56);
					local127 = local127 * local29 >> 12;
					arg1[local104] = (local127 >> 1) + 2048;
				}
			} else {
				for (local104 = 0; local104 < Static314.anInt6320; local104++) {
					local113 = this.anInt215 * Static68.anIntArray94[local104];
					local127 = this.method230(local90, local86, local36 * local113 >> 12, local43, local99, local56);
					arg1[local104] = local127 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray12[0];
		if (local29 > 8 || local29 < -8) {
			local36 = this.aShortArray13[0] << 12;
			local50 = this.anInt209 * local36 >> 12;
			local43 = this.anInt215 * local36 >> 12;
			local56 = local20 * local36 >> 12;
			local60 = local56 >> 12;
			local64 = local60 + 1;
			@Pc(236) int local236 = local56 & 0xFFF;
			if (local50 <= local64) {
				local64 = 0;
			}
			local86 = this.aByteArray13[local64 & 0xFF] & 0xFF;
			local99 = this.aByteArray13[local60 & 0xFF] & 0xFF;
			local90 = Class375.anIntArray826[local236];
			for (local104 = 0; local104 < Static314.anInt6320; local104++) {
				local113 = Static68.anIntArray94[local104] * this.anInt215;
				local127 = this.method230(local90, local86, local36 * local113 >> 12, local43, local99, local236);
				arg1[local104] = local127 * local29 >> 12;
			}
		}
		for (@Pc(302) int local302 = 1; local302 < this.anInt210; local302++) {
			local29 = this.aShortArray12[local302];
			if (local29 > 8 || local29 < -8) {
				local36 = this.aShortArray13[local302] << 12;
				local56 = local20 * local36 >> 12;
				local43 = local36 * this.anInt215 >> 12;
				local50 = this.anInt209 * local36 >> 12;
				local60 = local56 >> 12;
				local64 = local60 + 1;
				if (local50 <= local64) {
					local64 = 0;
				}
				local56 &= 0xFFF;
				local99 = this.aByteArray13[local60 & 0xFF] & 0xFF;
				local86 = this.aByteArray13[local64 & 0xFF] & 0xFF;
				local90 = Class375.anIntArray826[local56];
				if (this.aBoolean8 && local302 == this.anInt210 - 1) {
					for (local104 = 0; local104 < Static314.anInt6320; local104++) {
						local113 = Static68.anIntArray94[local104] * this.anInt215;
						local127 = this.method230(local90, local86, local36 * local113 >> 12, local43, local99, local56);
						local127 = (local29 * local127 >> 12) + arg1[local104];
						arg1[local104] = (local127 >> 1) + 2048;
					}
				} else {
					for (local104 = 0; local104 < Static314.anInt6320; local104++) {
						local113 = Static68.anIntArray94[local104] * this.anInt215;
						local127 = this.method230(local90, local86, local36 * local113 >> 12, local43, local99, local56);
						arg1[local104] += local29 * local127 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		this.aByteArray13 = Static522.method6791(this.anInt214);
		this.method234();
		for (@Pc(27) int local27 = this.anInt210 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray12[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt210--;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)I")
	private int method230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = arg2 >> 12;
		@Pc(26) int local26 = local22 + 1;
		@Pc(30) int local30 = local22 & 0xFF;
		@Pc(34) int local34 = arg2 & 0xFFF;
		if (arg3 <= local26) {
			local26 = 0;
		}
		local26 &= 0xFF;
		@Pc(51) int local51 = local34 - 4096;
		@Pc(55) int local55 = arg5 - 4096;
		@Pc(64) int local64 = this.aByteArray13[local30 + arg4] & 0x3;
		@Pc(68) int local68 = Class375.anIntArray826[local34];
		@Pc(83) int local83;
		if (local64 > 1) {
			local83 = local64 == 2 ? local34 - arg5 : -local34 - arg5;
		} else {
			local83 = local64 == 0 ? local34 + arg5 : arg5 + -local34;
		}
		local64 = this.aByteArray13[local26 + arg4] & 0x3;
		@Pc(123) int local123;
		if (local64 > 1) {
			local123 = local64 == 2 ? local51 - arg5 : -arg5 + -local51;
		} else {
			local123 = local64 == 0 ? arg5 + local51 : -local51 + arg5;
		}
		@Pc(147) int local147 = (local68 * (local123 - local83) >> 12) + local83;
		local64 = this.aByteArray13[arg1 + local30] & 0x3;
		if (local64 > 1) {
			local83 = local64 == 2 ? local34 - local55 : -local34 - local55;
		} else {
			local83 = local64 == 0 ? local34 + local55 : -local34 + local55;
		}
		local64 = this.aByteArray13[arg1 + local26] & 0x3;
		if (local64 > 1) {
			local123 = local64 == 2 ? local51 - local55 : -local55 + -local51;
		} else {
			local123 = local64 == 0 ? local55 + local51 : local55 - local51;
		}
		@Pc(241) int local241 = ((local123 - local83) * local68 >> 12) + local83;
		return local147 + (arg0 * (local241 - local147) >> 12);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean8 = arg0.method8645() == 1;
		} else if (arg1 == 1) {
			this.anInt210 = arg0.method8645();
		} else if (arg1 == 2) {
			this.anInt212 = arg0.method8595();
			if (this.anInt212 < 0) {
				this.aShortArray12 = new short[this.anInt210];
				for (@Pc(61) int local61 = 0; local61 < this.anInt210; local61++) {
					this.aShortArray12[local61] = (short) arg0.method8595();
				}
			}
		} else if (arg1 == 3) {
			this.anInt215 = this.anInt209 = arg0.method8645();
		} else if (arg1 == 4) {
			this.anInt214 = arg0.method8645();
		} else if (arg1 == 5) {
			this.anInt215 = arg0.method8645();
		} else if (arg1 == 6) {
			this.anInt209 = arg0.method8645();
		}
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
	private void method234() {
		@Pc(16) int local16;
		if (this.anInt212 > 0) {
			this.aShortArray13 = new short[this.anInt210];
			this.aShortArray12 = new short[this.anInt210];
			for (local16 = 0; local16 < this.anInt210; local16++) {
				this.aShortArray12[local16] = (short) (int) (Math.pow((double) ((float) this.anInt212 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray13[local16] = (short) (int) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray12 != null && this.anInt210 == this.aShortArray12.length) {
			this.aShortArray13 = new short[this.anInt210];
			for (local16 = 0; local16 < this.anInt210; local16++) {
				this.aShortArray13[local16] = (short) (int) Math.pow(2.0D, (double) local16);
			}
		}
	}
}
