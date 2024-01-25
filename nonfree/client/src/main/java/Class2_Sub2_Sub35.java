import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class2_Sub2_Sub35 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!vd", name = "U", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
	public int anInt9150 = 0;

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "[B")
	private byte[] aByteArray96 = new byte[512];

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
	public int anInt9149 = 1638;

	@OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
	public int anInt9151 = 4;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
	public int anInt9154 = 4;

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
	public int anInt9148 = 4;

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "Z")
	public boolean aBoolean707 = true;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)I")
	private int method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg4 <= local13) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(30) int local30 = arg2 & 0xFFF;
		local13 &= 0xFF;
		@Pc(38) int local38 = arg0 - 4096;
		@Pc(42) int local42 = local30 - 4096;
		@Pc(46) int local46 = Class2_Sub13_Sub1.anIntArray451[local30];
		@Pc(55) int local55 = this.aByteArray96[local9 + arg3] & 0x3;
		@Pc(72) int local72;
		if (local55 <= 1) {
			local72 = local55 == 0 ? arg0 + local30 : -local30 + arg0;
		} else {
			local72 = local55 == 2 ? local30 - arg0 : -arg0 + -local30;
		}
		local55 = this.aByteArray96[arg3 + local13] & 0x3;
		@Pc(114) int local114;
		if (local55 <= 1) {
			local114 = local55 == 0 ? arg0 + local42 : -local42 + arg0;
		} else {
			local114 = local55 == 2 ? local42 - arg0 : -arg0 + -local42;
		}
		local55 = this.aByteArray96[arg1 + local9] & 0x3;
		@Pc(151) int local151 = local72 + ((local114 - local72) * local46 >> 12);
		if (local55 > 1) {
			local72 = local55 == 2 ? local30 - local38 : -local38 + -local30;
		} else {
			local72 = local55 == 0 ? local30 + local38 : local38 - local30;
		}
		local55 = this.aByteArray96[arg1 + local13] & 0x3;
		if (local55 > 1) {
			local114 = local55 == 2 ? local42 - local38 : -local38 + -local42;
		} else {
			local114 = local55 == 0 ? local38 + local42 : -local42 + local38;
		}
		@Pc(243) int local243 = local72 + ((local114 - local72) * local46 >> 12);
		return (arg5 * (local243 - local151) >> 12) + local151;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean707 = arg0.method4325() == 1;
		} else if (arg1 == 1) {
			this.anInt9151 = arg0.method4325();
		} else if (arg1 == 2) {
			this.anInt9149 = arg0.method4334();
			if (this.anInt9149 < 0) {
				this.aShortArray137 = new short[this.anInt9151];
				for (@Pc(68) int local68 = 0; local68 < this.anInt9151; local68++) {
					this.aShortArray137[local68] = (short) arg0.method4334();
				}
			}
		} else if (arg1 == 3) {
			this.anInt9148 = this.anInt9154 = arg0.method4325();
		} else if (arg1 == 4) {
			this.anInt9150 = arg0.method4325();
		} else if (arg1 == 5) {
			this.anInt9148 = arg0.method4325();
		} else if (arg1 == 6) {
			this.anInt9154 = arg0.method4325();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			this.method7612(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)V")
	private void method7609() {
		@Pc(25) int local25;
		if (this.anInt9149 > 0) {
			this.aShortArray137 = new short[this.anInt9151];
			this.aShortArray138 = new short[this.anInt9151];
			for (local25 = 0; local25 < this.anInt9151; local25++) {
				this.aShortArray137[local25] = (short) (Math.pow((double) ((float) this.anInt9149 / 4096.0F), (double) local25) * 4096.0D);
				this.aShortArray138[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		} else if (this.aShortArray137 != null && this.aShortArray137.length == this.anInt9151) {
			this.aShortArray138 = new short[this.anInt9151];
			for (local25 = 0; local25 < this.anInt9151; local25++) {
				this.aShortArray138[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB[I)V")
	public void method7612(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static211.anIntArray576[arg0] * this.anInt9154;
		@Pc(107) int local107;
		@Pc(121) int local121;
		@Pc(29) int local29;
		@Pc(34) short local34;
		@Pc(98) int local98;
		@Pc(54) int local54;
		@Pc(48) int local48;
		@Pc(41) int local41;
		@Pc(75) int local75;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(93) int local93;
		@Pc(84) int local84;
		if (this.anInt9151 == 1) {
			local29 = this.aShortArray138[0] << 12;
			local34 = this.aShortArray137[0];
			local41 = local29 * this.anInt9154 >> 12;
			local48 = local29 * this.anInt9148 >> 12;
			local54 = local29 * local12 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			if (local62 >= local41) {
				local62 = 0;
			}
			local54 &= 0xFFF;
			local75 = Class2_Sub13_Sub1.anIntArray451[local54];
			local84 = this.aByteArray96[local62 & 0xFF] & 0xFF;
			local93 = this.aByteArray96[local58 & 0xFF] & 0xFF;
			if (this.aBoolean707) {
				for (local98 = 0; local98 < Static153.anInt3070; local98++) {
					local107 = this.anInt9148 * Static260.anIntArray327[local98];
					local121 = this.method7608(local54, local84, local29 * local107 >> 12, local93, local48, local75);
					local121 = local121 * local34 >> 12;
					arg1[local98] = (local121 >> 1) + 2048;
				}
			} else {
				for (local98 = 0; local98 < Static153.anInt3070; local98++) {
					local107 = Static260.anIntArray327[local98] * this.anInt9148;
					local121 = this.method7608(local54, local84, local107 * local29 >> 12, local93, local48, local75);
					arg1[local98] = local121 * local34 >> 12;
				}
			}
			return;
		}
		local34 = this.aShortArray137[0];
		if (local34 > 8 || local34 < -8) {
			local29 = this.aShortArray138[0] << 12;
			local48 = this.anInt9148 * local29 >> 12;
			local54 = local29 * local12 >> 12;
			local41 = this.anInt9154 * local29 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			if (local62 >= local41) {
				local62 = 0;
			}
			local54 &= 0xFFF;
			local75 = Class2_Sub13_Sub1.anIntArray451[local54];
			local84 = this.aByteArray96[local62 & 0xFF] & 0xFF;
			local93 = this.aByteArray96[local58 & 0xFF] & 0xFF;
			for (local98 = 0; local98 < Static153.anInt3070; local98++) {
				local107 = Static260.anIntArray327[local98] * this.anInt9148;
				local121 = this.method7608(local54, local84, local107 * local29 >> 12, local93, local48, local75);
				arg1[local98] = local34 * local121 >> 12;
			}
		}
		for (@Pc(304) int local304 = 1; local304 < this.anInt9151; local304++) {
			local34 = this.aShortArray137[local304];
			if (local34 > 8 || local34 < -8) {
				local29 = this.aShortArray138[local304] << 12;
				local48 = local29 * this.anInt9148 >> 12;
				local54 = local12 * local29 >> 12;
				local41 = local29 * this.anInt9154 >> 12;
				local58 = local54 >> 12;
				local62 = local58 + 1;
				if (local62 >= local41) {
					local62 = 0;
				}
				local54 &= 0xFFF;
				local93 = this.aByteArray96[local58 & 0xFF] & 0xFF;
				local84 = this.aByteArray96[local62 & 0xFF] & 0xFF;
				local75 = Class2_Sub13_Sub1.anIntArray451[local54];
				if (this.aBoolean707 && this.anInt9151 - 1 == local304) {
					for (local98 = 0; local98 < Static153.anInt3070; local98++) {
						local107 = Static260.anIntArray327[local98] * this.anInt9148;
						local121 = this.method7608(local54, local84, local29 * local107 >> 12, local93, local48, local75);
						local121 = arg1[local98] + (local34 * local121 >> 12);
						arg1[local98] = (local121 >> 1) + 2048;
					}
				} else {
					for (local98 = 0; local98 < Static153.anInt3070; local98++) {
						local107 = this.anInt9148 * Static260.anIntArray327[local98];
						local121 = this.method7608(local54, local84, local107 * local29 >> 12, local93, local48, local75);
						arg1[local98] += local34 * local121 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		this.aByteArray96 = Static298.method4514(this.anInt9150);
		this.method7609();
		for (@Pc(19) int local19 = this.anInt9151 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray137[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt9151--;
		}
	}
}
