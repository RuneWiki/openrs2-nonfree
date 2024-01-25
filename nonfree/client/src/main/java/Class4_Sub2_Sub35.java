import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class4_Sub2_Sub35 extends Class4_Sub2 {

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "[S")
	private short[] aShortArray155;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "[S")
	private short[] aShortArray156;

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
	public int anInt9820 = 4;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "Z")
	public boolean aBoolean766 = true;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
	public int anInt9818 = 4;

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
	public int anInt9825 = 1638;

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
	public int anInt9827 = 0;

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
	public int anInt9828 = 4;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "[B")
	private byte[] aByteArray101 = new byte[512];

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	private void method8408() {
		@Pc(24) int local24;
		if (this.anInt9825 > 0) {
			this.aShortArray155 = new short[this.anInt9820];
			this.aShortArray156 = new short[this.anInt9820];
			for (local24 = 0; local24 < this.anInt9820; local24++) {
				this.aShortArray156[local24] = (short) (int) (Math.pow((double) ((float) this.anInt9825 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray155[local24] = (short) (int) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray156 != null && this.aShortArray156.length == this.anInt9820) {
			this.aShortArray155 = new short[this.anInt9820];
			for (local24 = 0; local24 < this.anInt9820; local24++) {
				this.aShortArray155[local24] = (short) (int) Math.pow(2.0D, (double) local24);
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean766 = arg1.method8865() == 1;
		} else if (arg0 == 1) {
			this.anInt9820 = arg1.method8865();
		} else if (arg0 == 2) {
			this.anInt9825 = arg1.method8834();
			if (this.anInt9825 < 0) {
				this.aShortArray156 = new short[this.anInt9820];
				for (@Pc(63) int local63 = 0; local63 < this.anInt9820; local63++) {
					this.aShortArray156[local63] = (short) arg1.method8834();
				}
			}
		} else if (arg0 == 3) {
			this.anInt9818 = this.anInt9828 = arg1.method8865();
		} else if (arg0 == 4) {
			this.anInt9827 = arg1.method8865();
		} else if (arg0 == 5) {
			this.anInt9818 = arg1.method8865();
		} else if (arg0 == 6) {
			this.anInt9828 = arg1.method8865();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		this.aByteArray101 = Static366.method4836(this.anInt9827);
		this.method8408();
		for (@Pc(27) int local27 = this.anInt9820 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray156[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt9820--;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIBIII)I")
	private int method8409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg1 >> 12;
		@Pc(18) int local18 = local14 + 1;
		@Pc(22) int local22 = local14 & 0xFF;
		@Pc(26) int local26 = arg1 & 0xFFF;
		if (arg5 <= local18) {
			local18 = 0;
		}
		@Pc(35) int local35 = local26 - 4096;
		local18 &= 0xFF;
		@Pc(43) int local43 = arg4 - 4096;
		@Pc(47) int local47 = Class4_Sub15_Sub1.anIntArray138[local26];
		@Pc(56) int local56 = this.aByteArray101[arg0 + local22] & 0x3;
		@Pc(75) int local75;
		if (local56 <= 1) {
			local75 = local56 == 0 ? local26 + arg4 : -local26 + arg4;
		} else {
			local75 = local56 == 2 ? local26 - arg4 : -local26 - arg4;
		}
		local56 = this.aByteArray101[local18 + arg0] & 0x3;
		@Pc(119) int local119;
		if (local56 > 1) {
			local119 = local56 == 2 ? local35 - arg4 : -arg4 + -local35;
		} else {
			local119 = local56 == 0 ? local35 + arg4 : -local35 + arg4;
		}
		@Pc(143) int local143 = local75 + ((local119 - local75) * local47 >> 12);
		local56 = this.aByteArray101[arg2 + local22] & 0x3;
		if (local56 <= 1) {
			local75 = local56 == 0 ? local43 + local26 : local43 + -local26;
		} else {
			local75 = local56 == 2 ? local26 - local43 : -local43 + -local26;
		}
		local56 = this.aByteArray101[arg2 + local18] & 0x3;
		if (local56 > 1) {
			local119 = local56 == 2 ? local35 - local43 : -local35 + -local43;
		} else {
			local119 = local56 == 0 ? local43 + local35 : -local35 + local43;
		}
		@Pc(239) int local239 = ((local119 - local75) * local47 >> 12) + local75;
		return (arg3 * (local239 - local143) >> 12) + local143;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB[I)V")
	public void method8411(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt9828 * Static429.anIntArray465[arg0];
		@Pc(112) int local112;
		@Pc(126) int local126;
		@Pc(42) int local42;
		@Pc(27) short local27;
		@Pc(103) int local103;
		@Pc(62) int local62;
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(92) int local92;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(88) int local88;
		@Pc(101) int local101;
		if (this.anInt9820 == 1) {
			local42 = this.aShortArray155[0] << 12;
			local27 = this.aShortArray156[0];
			local62 = local12 * local42 >> 12;
			local49 = local42 * this.anInt9818 >> 12;
			local56 = local42 * this.anInt9828 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			@Pc(382) int local382 = local62 & 0xFFF;
			if (local56 <= local70) {
				local70 = 0;
			}
			local92 = Class4_Sub15_Sub1.anIntArray138[local382];
			local101 = this.aByteArray101[local70 & 0xFF] & 0xFF;
			local88 = this.aByteArray101[local66 & 0xFF] & 0xFF;
			if (this.aBoolean766) {
				for (local103 = 0; local103 < Static269.anInt4330; local103++) {
					local112 = Static312.anIntArray370[local103] * this.anInt9818;
					local126 = this.method8409(local88, local112 * local42 >> 12, local101, local92, local382, local49);
					@Pc(481) int local481 = local27 * local126 >> 12;
					arg1[local103] = (local481 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static269.anInt4330; local103++) {
					local112 = this.anInt9818 * Static312.anIntArray370[local103];
					local126 = this.method8409(local88, local42 * local112 >> 12, local101, local92, local382, local49);
					arg1[local103] = local126 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray156[0];
		if (local27 > 8 || local27 < -8) {
			local42 = this.aShortArray155[0] << 12;
			local49 = local42 * this.anInt9818 >> 12;
			local56 = local42 * this.anInt9828 >> 12;
			local62 = local12 * local42 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			local62 &= 0xFFF;
			if (local56 <= local70) {
				local70 = 0;
			}
			local88 = this.aByteArray101[local66 & 0xFF] & 0xFF;
			local92 = Class4_Sub15_Sub1.anIntArray138[local62];
			local101 = this.aByteArray101[local70 & 0xFF] & 0xFF;
			for (local103 = 0; local103 < Static269.anInt4330; local103++) {
				local112 = Static312.anIntArray370[local103] * this.anInt9818;
				local126 = this.method8409(local88, local112 * local42 >> 12, local101, local92, local62, local49);
				arg1[local103] = local27 * local126 >> 12;
			}
		}
		for (@Pc(140) int local140 = 1; local140 < this.anInt9820; local140++) {
			local27 = this.aShortArray156[local140];
			if (local27 > 8 || local27 < -8) {
				local42 = this.aShortArray155[local140] << 12;
				local56 = this.anInt9828 * local42 >> 12;
				local49 = this.anInt9818 * local42 >> 12;
				local62 = local12 * local42 >> 12;
				local66 = local62 >> 12;
				local70 = local66 + 1;
				if (local56 <= local70) {
					local70 = 0;
				}
				local62 &= 0xFFF;
				local92 = Class4_Sub15_Sub1.anIntArray138[local62];
				local101 = this.aByteArray101[local70 & 0xFF] & 0xFF;
				local88 = this.aByteArray101[local66 & 0xFF] & 0xFF;
				if (this.aBoolean766 && this.anInt9820 - 1 == local140) {
					for (local103 = 0; local103 < Static269.anInt4330; local103++) {
						local112 = Static312.anIntArray370[local103] * this.anInt9818;
						local126 = this.method8409(local88, local112 * local42 >> 12, local101, local92, local62, local49);
						local126 = (local27 * local126 >> 12) + arg1[local103];
						arg1[local103] = (local126 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static269.anInt4330; local103++) {
						local112 = this.anInt9818 * Static312.anIntArray370[local103];
						local126 = this.method8409(local88, local42 * local112 >> 12, local101, local92, local62, local49);
						arg1[local103] += local27 * local126 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			this.method8411(arg0, local9);
		}
		return local9;
	}
}
