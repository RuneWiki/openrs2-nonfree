import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class5_Sub2_Sub30 extends Class5_Sub2 {

	@OriginalMember(owner = "client!sm", name = "G", descriptor = "[S")
	private short[] aShortArray129;

	@OriginalMember(owner = "client!sm", name = "P", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
	public int anInt8913 = 4;

	@OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
	public int anInt8911 = 4;

	@OriginalMember(owner = "client!sm", name = "O", descriptor = "[B")
	private byte[] aByteArray93 = new byte[512];

	@OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
	public int anInt8915 = 4;

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "Z")
	public boolean aBoolean654 = true;

	@OriginalMember(owner = "client!sm", name = "Y", descriptor = "I")
	public int anInt8920 = 0;

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
	public int anInt8908 = 1638;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB[I)V")
	public void method7677(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(18) int local18 = Static493.anIntArray476[arg0] * this.anInt8911;
		@Pc(118) int local118;
		@Pc(134) int local134;
		@Pc(44) int local44;
		@Pc(29) short local29;
		@Pc(109) int local109;
		@Pc(57) int local57;
		@Pc(51) int local51;
		@Pc(64) int local64;
		@Pc(89) int local89;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(107) int local107;
		@Pc(98) int local98;
		if (this.anInt8913 == 1) {
			local44 = this.aShortArray129[0] << 12;
			local29 = this.aShortArray130[0];
			local64 = local44 * this.anInt8911 >> 12;
			local57 = local18 * local44 >> 12;
			local51 = local44 * this.anInt8915 >> 12;
			local68 = local57 >> 12;
			local72 = local68 + 1;
			if (local64 <= local72) {
				local72 = 0;
			}
			local57 &= 0xFFF;
			local98 = this.aByteArray93[local72 & 0xFF] & 0xFF;
			local107 = this.aByteArray93[local68 & 0xFF] & 0xFF;
			local89 = Class5_Sub5_Sub8_Sub2.anIntArray563[local57];
			if (this.aBoolean654) {
				for (local109 = 0; local109 < Static597.anInt10025; local109++) {
					local118 = Static352.anIntArray331[local109] * this.anInt8915;
					local134 = this.method7678(local44 * local118 >> 12, local107, local51, local98, local57, local89);
					local134 = local29 * local134 >> 12;
					arg1[local109] = (local134 >> 1) + 2048;
				}
			} else {
				for (local109 = 0; local109 < Static597.anInt10025; local109++) {
					local118 = Static352.anIntArray331[local109] * this.anInt8915;
					local134 = this.method7678(local118 * local44 >> 12, local107, local51, local98, local57, local89);
					arg1[local109] = local134 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray130[0];
		if (local29 > 8 || local29 < -8) {
			local44 = this.aShortArray129[0] << 12;
			local51 = this.anInt8915 * local44 >> 12;
			local57 = local44 * local18 >> 12;
			local64 = this.anInt8911 * local44 >> 12;
			local68 = local57 >> 12;
			local72 = local68 + 1;
			if (local64 <= local72) {
				local72 = 0;
			}
			local57 &= 0xFFF;
			local89 = Class5_Sub5_Sub8_Sub2.anIntArray563[local57];
			local98 = this.aByteArray93[local72 & 0xFF] & 0xFF;
			local107 = this.aByteArray93[local68 & 0xFF] & 0xFF;
			for (local109 = 0; local109 < Static597.anInt10025; local109++) {
				local118 = this.anInt8915 * Static352.anIntArray331[local109];
				local134 = this.method7678(local44 * local118 >> 12, local107, local51, local98, local57, local89);
				arg1[local109] = local29 * local134 >> 12;
			}
		}
		for (@Pc(152) int local152 = 1; local152 < this.anInt8913; local152++) {
			local29 = this.aShortArray130[local152];
			if (local29 > 8 || local29 < -8) {
				local44 = this.aShortArray129[local152] << 12;
				local57 = local44 * local18 >> 12;
				local51 = local44 * this.anInt8915 >> 12;
				local64 = local44 * this.anInt8911 >> 12;
				local68 = local57 >> 12;
				local72 = local68 + 1;
				if (local72 >= local64) {
					local72 = 0;
				}
				local57 &= 0xFFF;
				local89 = Class5_Sub5_Sub8_Sub2.anIntArray563[local57];
				local98 = this.aByteArray93[local72 & 0xFF] & 0xFF;
				local107 = this.aByteArray93[local68 & 0xFF] & 0xFF;
				if (this.aBoolean654 && this.anInt8913 - 1 == local152) {
					for (local109 = 0; local109 < Static597.anInt10025; local109++) {
						local118 = this.anInt8915 * Static352.anIntArray331[local109];
						local134 = this.method7678(local44 * local118 >> 12, local107, local51, local98, local57, local89);
						local134 = arg1[local109] + (local29 * local134 >> 12);
						arg1[local109] = (local134 >> 1) + 2048;
					}
				} else {
					for (local109 = 0; local109 < Static597.anInt10025; local109++) {
						local118 = this.anInt8915 * Static352.anIntArray331[local109];
						local134 = this.method7678(local44 * local118 >> 12, local107, local51, local98, local57, local89);
						arg1[local109] += local29 * local134 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII)I")
	private int method7678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg2 <= local13) {
			local13 = 0;
		}
		@Pc(22) int local22 = arg0 & 0xFFF;
		local9 &= 0xFF;
		@Pc(30) int local30 = arg4 - 4096;
		local13 &= 0xFF;
		@Pc(38) int local38 = local22 - 4096;
		@Pc(47) int local47 = this.aByteArray93[local9 + arg1] & 0x3;
		@Pc(51) int local51 = Class5_Sub5_Sub8_Sub2.anIntArray563[local22];
		@Pc(68) int local68;
		if (local47 <= 1) {
			local68 = local47 == 0 ? arg4 + local22 : -local22 + arg4;
		} else {
			local68 = local47 == 2 ? local22 - arg4 : -arg4 + -local22;
		}
		local47 = this.aByteArray93[arg1 + local13] & 0x3;
		@Pc(109) int local109;
		if (local47 <= 1) {
			local109 = local47 == 0 ? arg4 + local38 : -local38 + arg4;
		} else {
			local109 = local47 == 2 ? local38 - arg4 : -arg4 + -local38;
		}
		@Pc(139) int local139 = local68 + (local51 * (local109 - local68) >> 12);
		local47 = this.aByteArray93[local9 + arg3] & 0x3;
		if (local47 > 1) {
			local68 = local47 == 2 ? local22 - local30 : -local30 + -local22;
		} else {
			local68 = local47 == 0 ? local30 + local22 : -local22 + local30;
		}
		local47 = this.aByteArray93[arg3 + local13] & 0x3;
		if (local47 > 1) {
			local109 = local47 == 2 ? local38 - local30 : -local38 + -local30;
		} else {
			local109 = local47 == 0 ? local30 + local38 : local30 - local38;
		}
		@Pc(231) int local231 = local68 + ((local109 - local68) * local51 >> 12);
		return local139 + ((local231 - local139) * arg5 >> 12);
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		this.aByteArray93 = Static625.method8858(this.anInt8920);
		this.method7679();
		for (@Pc(25) int local25 = this.anInt8913 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray130[local25];
			if (local32 > 8 || local32 < -8) {
				return;
			}
			this.anInt8913--;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean654 = arg0.method5966() == 1;
		} else if (arg1 == 1) {
			this.anInt8913 = arg0.method5966();
		} else if (arg1 == 2) {
			this.anInt8908 = arg0.method5956();
			if (this.anInt8908 < 0) {
				this.aShortArray130 = new short[this.anInt8913];
				for (@Pc(68) int local68 = 0; local68 < this.anInt8913; local68++) {
					this.aShortArray130[local68] = (short) arg0.method5956();
				}
			}
		} else if (arg1 == 3) {
			this.anInt8915 = this.anInt8911 = arg0.method5966();
		} else if (arg1 == 4) {
			this.anInt8920 = arg0.method5966();
		} else if (arg1 == 5) {
			this.anInt8915 = arg0.method5966();
		} else if (arg1 == 6) {
			this.anInt8911 = arg0.method5966();
		}
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(B)V")
	private void method7679() {
		@Pc(23) int local23;
		if (this.anInt8908 > 0) {
			this.aShortArray129 = new short[this.anInt8913];
			this.aShortArray130 = new short[this.anInt8913];
			for (local23 = 0; local23 < this.anInt8913; local23++) {
				this.aShortArray130[local23] = (short) (Math.pow((double) ((float) this.anInt8908 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray129[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray130 != null && this.anInt8913 == this.aShortArray130.length) {
			this.aShortArray129 = new short[this.anInt8913];
			for (local23 = 0; local23 < this.anInt8913; local23++) {
				this.aShortArray129[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			this.method7677(arg0, local15);
		}
		return local15;
	}
}
