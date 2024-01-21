import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!cg", name = "kb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
	private int anInt653 = 1638;

	@OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
	private int anInt659 = 0;

	@OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
	private int anInt658 = 4;

	@OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
	private int anInt665 = 4;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
	private int anInt655 = 4;

	@OriginalMember(owner = "client!cg", name = "db", descriptor = "[B")
	private byte[] aByteArray6 = new byte[512];

	@OriginalMember(owner = "client!cg", name = "X", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean40 = arg0.method260() == 1;
		} else if (arg1 == 1) {
			this.anInt658 = arg0.method260();
		} else if (arg1 == 2) {
			this.anInt653 = arg0.method242();
			if (this.anInt653 < 0) {
				this.aShortArray11 = new short[this.anInt658];
				for (@Pc(70) int local70 = 0; local70 < this.anInt658; local70++) {
					this.aShortArray11[local70] = (short) arg0.method242();
				}
			}
		} else if (arg1 == 3) {
			this.anInt665 = this.anInt655 = arg0.method260();
		} else if (arg1 == 4) {
			this.anInt659 = arg0.method260();
		} else if (arg1 == 5) {
			this.anInt665 = arg0.method260();
		} else if (arg1 == 6) {
			this.anInt655 = arg0.method260();
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		this.aByteArray6 = Static182.method2818(this.anInt659);
		this.method504();
		for (@Pc(19) int local19 = this.anInt658 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray11[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt658--;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIZ)I")
	private int method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(15) int local15 = arg1 - 4096;
		@Pc(19) int local19 = arg0 >> 12;
		@Pc(23) int local23 = arg0 & 0xFFF;
		@Pc(27) int local27 = local23 - 4096;
		@Pc(31) int local31 = local19 + 1;
		@Pc(35) int local35 = Class2_Sub15.anIntArray206[local23];
		@Pc(39) int local39 = local19 & 0xFF;
		if (local31 >= arg4) {
			local31 = 0;
		}
		@Pc(57) int local57 = this.aByteArray6[arg3 + local39] & 0x3;
		local31 &= 0xFF;
		@Pc(78) int local78;
		if (local57 <= 1) {
			local78 = local57 == 0 ? local23 + arg1 : -local23 + arg1;
		} else {
			local78 = local57 == 2 ? local23 - arg1 : -local23 + -arg1;
		}
		local57 = this.aByteArray6[local31 + arg3] & 0x3;
		@Pc(125) int local125;
		if (local57 > 1) {
			local125 = local57 == 2 ? local27 - arg1 : -arg1 + -local27;
		} else {
			local125 = local57 == 0 ? local27 + arg1 : arg1 - local27;
		}
		@Pc(148) int local148 = (local35 * (local125 - local78) >> 12) + local78;
		local57 = this.aByteArray6[local39 + arg2] & 0x3;
		if (local57 <= 1) {
			local78 = local57 == 0 ? local15 + local23 : local15 - local23;
		} else {
			local78 = local57 == 2 ? local23 - local15 : -local23 + -local15;
		}
		local57 = this.aByteArray6[local31 + arg2] & 0x3;
		if (local57 <= 1) {
			local125 = local57 == 0 ? local15 + local27 : local15 - local27;
		} else {
			local125 = local57 == 2 ? local27 - local15 : -local27 + -local15;
		}
		@Pc(244) int local244 = (local35 * (local125 - local78) >> 12) + local78;
		return local148 + (arg5 * (local244 - local148) >> 12);
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
	private void method504() {
		@Pc(26) int local26;
		if (this.anInt653 > 0) {
			this.aShortArray10 = new short[this.anInt658];
			this.aShortArray11 = new short[this.anInt658];
			for (local26 = 0; local26 < this.anInt658; local26++) {
				this.aShortArray11[local26] = (short) (Math.pow((double) ((float) this.anInt653 / 4096.0F), (double) local26) * 4096.0D);
				this.aShortArray10[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		} else if (this.aShortArray11 != null && this.anInt658 == this.aShortArray11.length) {
			this.aShortArray10 = new short[this.anInt658];
			for (local26 = 0; local26 < this.anInt658; local26++) {
				this.aShortArray10[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(10) int[] local10 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			this.method505(arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[I)V")
	private void method505(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static81.anIntArray174[arg0] * this.anInt655;
		@Pc(112) int local112;
		@Pc(126) int local126;
		@Pc(35) int local35;
		@Pc(28) short local28;
		@Pc(103) int local103;
		@Pc(55) int local55;
		@Pc(42) int local42;
		@Pc(49) int local49;
		@Pc(98) int local98;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(72) int local72;
		@Pc(90) int local90;
		if (this.anInt658 == 1) {
			local28 = this.aShortArray11[0];
			local35 = this.aShortArray10[0] << 12;
			local42 = this.anInt665 * local35 >> 12;
			local49 = local35 * this.anInt655 >> 12;
			local55 = local12 * local35 >> 12;
			local59 = local55 >> 12;
			local63 = local59 + 1;
			local72 = this.aByteArray6[local59 & 0xFF] & 0xFF;
			if (local63 >= local49) {
				local63 = 0;
			}
			local90 = this.aByteArray6[local63 & 0xFF] & 0xFF;
			local55 &= 0xFFF;
			local98 = Class2_Sub15.anIntArray206[local55];
			if (this.aBoolean40) {
				for (local103 = 0; local103 < Static135.anInt2897; local103++) {
					local112 = this.anInt665 * Static107.anIntArray304[local103];
					local126 = this.method503(local112 * local35 >> 12, local55, local90, local72, local42, local98);
					local126 = local126 * local28 >> 12;
					arg1[local103] = (local126 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static135.anInt2897; local103++) {
					local112 = this.anInt665 * Static107.anIntArray304[local103];
					local126 = this.method503(local112 * local35 >> 12, local55, local90, local72, local42, local98);
					arg1[local103] = local28 * local126 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray11[0];
		if (local28 > 8 || local28 < -8) {
			local35 = this.aShortArray10[0] << 12;
			local49 = local35 * this.anInt655 >> 12;
			local55 = local35 * local12 >> 12;
			local59 = local55 >> 12;
			local42 = this.anInt665 * local35 >> 12;
			local72 = this.aByteArray6[local59 & 0xFF] & 0xFF;
			local63 = local59 + 1;
			@Pc(246) int local246 = local55 & 0xFFF;
			local98 = Class2_Sub15.anIntArray206[local246];
			if (local63 >= local49) {
				local63 = 0;
			}
			local90 = this.aByteArray6[local63 & 0xFF] & 0xFF;
			for (local103 = 0; local103 < Static135.anInt2897; local103++) {
				local112 = Static107.anIntArray304[local103] * this.anInt665;
				local126 = this.method503(local35 * local112 >> 12, local246, local90, local72, local42, local98);
				arg1[local103] = local126 * local28 >> 12;
			}
		}
		for (@Pc(303) int local303 = 1; local303 < this.anInt658; local303++) {
			local28 = this.aShortArray11[local303];
			if (local28 > 8 || local28 < -8) {
				local35 = this.aShortArray10[local303] << 12;
				local42 = this.anInt665 * local35 >> 12;
				local49 = local35 * this.anInt655 >> 12;
				local55 = local12 * local35 >> 12;
				local59 = local55 >> 12;
				local72 = this.aByteArray6[local59 & 0xFF] & 0xFF;
				local55 &= 0xFFF;
				local98 = Class2_Sub15.anIntArray206[local55];
				local63 = local59 + 1;
				if (local49 <= local63) {
					local63 = 0;
				}
				local90 = this.aByteArray6[local63 & 0xFF] & 0xFF;
				if (this.aBoolean40 && local303 == this.anInt658 - 1) {
					for (local103 = 0; local103 < Static135.anInt2897; local103++) {
						local112 = Static107.anIntArray304[local103] * this.anInt665;
						local126 = this.method503(local35 * local112 >> 12, local55, local90, local72, local42, local98);
						local126 = (local28 * local126 >> 12) + arg1[local103];
						arg1[local103] = (local126 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static135.anInt2897; local103++) {
						local112 = Static107.anIntArray304[local103] * this.anInt665;
						local126 = this.method503(local35 * local112 >> 12, local55, local90, local72, local42, local98);
						arg1[local103] += local28 * local126 >> 12;
					}
				}
			}
		}
	}
}
