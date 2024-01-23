import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!da", name = "W", descriptor = "I")
	private int anInt881 = 4;

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
	private int anInt884 = 1638;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
	private int anInt876 = 4;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "I")
	private int anInt880 = 0;

	@OriginalMember(owner = "client!da", name = "ib", descriptor = "[B")
	private byte[] aByteArray6 = new byte[512];

	@OriginalMember(owner = "client!da", name = "R", descriptor = "I")
	private int anInt877 = 4;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean45 = arg0.method209() == 1;
		} else if (arg1 == 1) {
			this.anInt876 = arg0.method209();
		} else if (arg1 == 2) {
			this.anInt884 = arg0.method196();
			if (this.anInt884 < 0) {
				this.aShortArray25 = new short[this.anInt876];
				for (@Pc(78) int local78 = 0; local78 < this.anInt876; local78++) {
					this.aShortArray25[local78] = (short) arg0.method196();
				}
			}
		} else if (arg1 == 3) {
			this.anInt881 = this.anInt877 = arg0.method209();
		} else if (arg1 == 4) {
			this.anInt880 = arg0.method209();
		} else if (arg1 == 5) {
			this.anInt881 = arg0.method209();
		} else if (arg1 == 6) {
			this.anInt877 = arg0.method209();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)I")
	private int method652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 - 4096;
		@Pc(13) int local13 = arg1 >> 12;
		@Pc(17) int local17 = arg1 & 0xFFF;
		@Pc(21) int local21 = local17 - 4096;
		@Pc(25) int local25 = Class43.anIntArray201[local17];
		@Pc(29) int local29 = local13 + 1;
		@Pc(33) int local33 = local13 & 0xFF;
		if (local29 >= arg4) {
			local29 = 0;
		}
		local29 &= 0xFF;
		@Pc(55) int local55 = this.aByteArray6[local33 + arg2] & 0x3;
		@Pc(76) int local76;
		if (local55 > 1) {
			local76 = local55 == 2 ? local17 - arg0 : -arg0 + -local17;
		} else {
			local76 = local55 == 0 ? local17 + arg0 : arg0 + -local17;
		}
		local55 = this.aByteArray6[arg2 + local29] & 0x3;
		@Pc(118) int local118;
		if (local55 <= 1) {
			local118 = local55 == 0 ? local21 + arg0 : arg0 + -local21;
		} else {
			local118 = local55 == 2 ? local21 - arg0 : -arg0 + -local21;
		}
		local55 = this.aByteArray6[local33 + arg3] & 0x3;
		@Pc(153) int local153 = ((local118 - local76) * local25 >> 12) + local76;
		if (local55 <= 1) {
			local76 = local55 == 0 ? local9 + local17 : -local17 + local9;
		} else {
			local76 = local55 == 2 ? local17 - local9 : -local17 - local9;
		}
		local55 = this.aByteArray6[arg3 + local29] & 0x3;
		if (local55 > 1) {
			local118 = local55 == 2 ? local21 - local9 : -local21 - local9;
		} else {
			local118 = local55 == 0 ? local9 + local21 : local9 + -local21;
		}
		@Pc(234) int local234 = local76 + (local25 * (local118 - local76) >> 12);
		return ((local234 - local153) * arg5 >> 12) + local153;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ[I)V")
	private void method655(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static97.anIntArray240[arg0] * this.anInt877;
		@Pc(113) int local113;
		@Pc(127) int local127;
		@Pc(31) int local31;
		@Pc(49) short local49;
		@Pc(104) int local104;
		@Pc(37) int local37;
		@Pc(44) int local44;
		@Pc(56) int local56;
		@Pc(68) int local68;
		@Pc(60) int local60;
		@Pc(72) int local72;
		@Pc(90) int local90;
		@Pc(99) int local99;
		if (this.anInt876 == 1) {
			local31 = this.aShortArray24[0] << 12;
			local37 = local12 * local31 >> 12;
			local44 = local31 * this.anInt881 >> 12;
			local49 = this.aShortArray25[0];
			local56 = local31 * this.anInt877 >> 12;
			local60 = local37 >> 12;
			local37 &= 0xFFF;
			local68 = Class43.anIntArray201[local37];
			local72 = local60 + 1;
			if (local56 <= local72) {
				local72 = 0;
			}
			local90 = this.aByteArray6[local60 & 0xFF] & 0xFF;
			local99 = this.aByteArray6[local72 & 0xFF] & 0xFF;
			if (this.aBoolean45) {
				for (local104 = 0; local104 < Static62.anInt1675; local104++) {
					local113 = this.anInt881 * Static20.anIntArray45[local104];
					local127 = this.method652(local37, local113 * local31 >> 12, local90, local99, local44, local68);
					local127 = local49 * local127 >> 12;
					arg1[local104] = (local127 >> 1) + 2048;
				}
			} else {
				for (local104 = 0; local104 < Static62.anInt1675; local104++) {
					local113 = this.anInt881 * Static20.anIntArray45[local104];
					local127 = this.method652(local37, local31 * local113 >> 12, local90, local99, local44, local68);
					arg1[local104] = local127 * local49 >> 12;
				}
			}
			return;
		}
		local49 = this.aShortArray25[0];
		if (local49 > 8 || local49 < -8) {
			local31 = this.aShortArray24[0] << 12;
			local56 = this.anInt877 * local31 >> 12;
			local37 = local12 * local31 >> 12;
			local60 = local37 >> 12;
			local90 = this.aByteArray6[local60 & 0xFF] & 0xFF;
			local44 = this.anInt881 * local31 >> 12;
			local72 = local60 + 1;
			if (local72 >= local56) {
				local72 = 0;
			}
			local37 &= 0xFFF;
			local99 = this.aByteArray6[local72 & 0xFF] & 0xFF;
			local68 = Class43.anIntArray201[local37];
			for (local104 = 0; local104 < Static62.anInt1675; local104++) {
				local113 = Static20.anIntArray45[local104] * this.anInt881;
				local127 = this.method652(local37, local113 * local31 >> 12, local90, local99, local44, local68);
				arg1[local104] = local127 * local49 >> 12;
			}
		}
		for (@Pc(306) int local306 = 1; local306 < this.anInt876; local306++) {
			local49 = this.aShortArray25[local306];
			if (local49 > 8 || local49 < -8) {
				local31 = this.aShortArray24[local306] << 12;
				local44 = this.anInt881 * local31 >> 12;
				local56 = this.anInt877 * local31 >> 12;
				local37 = local12 * local31 >> 12;
				local60 = local37 >> 12;
				local72 = local60 + 1;
				local90 = this.aByteArray6[local60 & 0xFF] & 0xFF;
				local37 &= 0xFFF;
				if (local56 <= local72) {
					local72 = 0;
				}
				local99 = this.aByteArray6[local72 & 0xFF] & 0xFF;
				local68 = Class43.anIntArray201[local37];
				if (this.aBoolean45 && local306 == this.anInt876 - 1) {
					for (local104 = 0; local104 < Static62.anInt1675; local104++) {
						local113 = this.anInt881 * Static20.anIntArray45[local104];
						local127 = this.method652(local37, local31 * local113 >> 12, local90, local99, local44, local68);
						local127 = arg1[local104] + (local49 * local127 >> 12);
						arg1[local104] = (local127 >> 1) + 2048;
					}
				} else {
					for (local104 = 0; local104 < Static62.anInt1675; local104++) {
						local113 = Static20.anIntArray45[local104] * this.anInt881;
						local127 = this.method652(local37, local113 * local31 >> 12, local90, local99, local44, local68);
						arg1[local104] += local127 * local49 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		this.aByteArray6 = Static144.method2243(this.anInt880);
		this.method658();
		for (@Pc(26) int local26 = this.anInt876 - 1; local26 >= 1; local26--) {
			@Pc(33) short local33 = this.aShortArray25[local26];
			if (local33 > 8 || local33 < -8) {
				return;
			}
			this.anInt876--;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			this.method655(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
	private void method658() {
		@Pc(24) int local24;
		if (this.anInt884 > 0) {
			this.aShortArray25 = new short[this.anInt876];
			this.aShortArray24 = new short[this.anInt876];
			for (local24 = 0; local24 < this.anInt876; local24++) {
				this.aShortArray25[local24] = (short) (Math.pow((double) ((float) this.anInt884 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray24[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray25 != null && this.anInt876 == this.aShortArray25.length) {
			this.aShortArray24 = new short[this.anInt876];
			for (local24 = 0; local24 < this.anInt876; local24++) {
				this.aShortArray24[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		}
	}
}
