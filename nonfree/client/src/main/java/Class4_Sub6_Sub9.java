import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class4_Sub6_Sub9 extends Class4_Sub6 {

	@OriginalMember(owner = "client!dm", name = "P", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!dm", name = "ab", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
	public int anInt1627 = 4;

	@OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
	public int anInt1631 = 0;

	@OriginalMember(owner = "client!dm", name = "Y", descriptor = "I")
	public int anInt1633 = 4;

	@OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
	public int anInt1628 = 1638;

	@OriginalMember(owner = "client!dm", name = "S", descriptor = "Z")
	public boolean aBoolean115 = true;

	@OriginalMember(owner = "client!dm", name = "eb", descriptor = "[B")
	private byte[] aByteArray22 = new byte[512];

	@OriginalMember(owner = "client!dm", name = "gb", descriptor = "I")
	public int anInt1638 = 4;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean115 = arg1.method3440() == 1;
		} else if (arg0 == 1) {
			this.anInt1627 = arg1.method3440();
		} else if (arg0 == 2) {
			this.anInt1628 = arg1.method3447();
			if (this.anInt1628 < 0) {
				this.aShortArray32 = new short[this.anInt1627];
				for (@Pc(73) int local73 = 0; local73 < this.anInt1627; local73++) {
					this.aShortArray32[local73] = (short) arg1.method3447();
				}
			}
		} else if (arg0 == 3) {
			this.anInt1633 = this.anInt1638 = arg1.method3440();
		} else if (arg0 == 4) {
			this.anInt1631 = arg1.method3440();
		} else if (arg0 == 5) {
			this.anInt1633 = arg1.method3440();
		} else if (arg0 == 6) {
			this.anInt1638 = arg1.method3440();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB[I)V")
	public void method1309(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt1638 * Static128.anIntArray265[arg0];
		@Pc(103) int local103;
		@Pc(117) int local117;
		@Pc(25) int local25;
		@Pc(30) short local30;
		@Pc(94) int local94;
		@Pc(36) int local36;
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(89) int local89;
		@Pc(80) int local80;
		if (this.anInt1627 == 1) {
			local25 = this.aShortArray33[0] << 12;
			local30 = this.aShortArray32[0];
			local36 = local25 * local12 >> 12;
			local43 = this.anInt1633 * local25 >> 12;
			local50 = this.anInt1638 * local25 >> 12;
			local54 = local36 >> 12;
			local58 = local54 + 1;
			if (local58 >= local50) {
				local58 = 0;
			}
			local36 &= 0xFFF;
			local71 = Class92.anIntArray263[local36];
			local80 = this.aByteArray22[local58 & 0xFF] & 0xFF;
			local89 = this.aByteArray22[local54 & 0xFF] & 0xFF;
			if (this.aBoolean115) {
				for (local94 = 0; local94 < Static31.anInt797; local94++) {
					local103 = this.anInt1633 * Static339.anIntArray4[local94];
					local117 = this.method1313(local80, local25 * local103 >> 12, local36, local89, local71, local43);
					local117 = local117 * local30 >> 12;
					arg1[local94] = (local117 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Static31.anInt797; local94++) {
					local103 = this.anInt1633 * Static339.anIntArray4[local94];
					local117 = this.method1313(local80, local25 * local103 >> 12, local36, local89, local71, local43);
					arg1[local94] = local117 * local30 >> 12;
				}
			}
			return;
		}
		local30 = this.aShortArray32[0];
		if (local30 > 8 || local30 < -8) {
			local25 = this.aShortArray33[0] << 12;
			local43 = local25 * this.anInt1633 >> 12;
			local50 = local25 * this.anInt1638 >> 12;
			local36 = local12 * local25 >> 12;
			local54 = local36 >> 12;
			local58 = local54 + 1;
			if (local50 <= local58) {
				local58 = 0;
			}
			local36 &= 0xFFF;
			local80 = this.aByteArray22[local58 & 0xFF] & 0xFF;
			local89 = this.aByteArray22[local54 & 0xFF] & 0xFF;
			local71 = Class92.anIntArray263[local36];
			for (local94 = 0; local94 < Static31.anInt797; local94++) {
				local103 = this.anInt1633 * Static339.anIntArray4[local94];
				local117 = this.method1313(local80, local25 * local103 >> 12, local36, local89, local71, local43);
				arg1[local94] = local117 * local30 >> 12;
			}
		}
		for (@Pc(297) int local297 = 1; local297 < this.anInt1627; local297++) {
			local30 = this.aShortArray32[local297];
			if (local30 > 8 || local30 < -8) {
				local25 = this.aShortArray33[local297] << 12;
				local50 = local25 * this.anInt1638 >> 12;
				local36 = local12 * local25 >> 12;
				local43 = local25 * this.anInt1633 >> 12;
				local54 = local36 >> 12;
				local58 = local54 + 1;
				if (local50 <= local58) {
					local58 = 0;
				}
				local36 &= 0xFFF;
				local89 = this.aByteArray22[local54 & 0xFF] & 0xFF;
				local80 = this.aByteArray22[local58 & 0xFF] & 0xFF;
				local71 = Class92.anIntArray263[local36];
				if (this.aBoolean115 && this.anInt1627 - 1 == local297) {
					for (local94 = 0; local94 < Static31.anInt797; local94++) {
						local103 = this.anInt1633 * Static339.anIntArray4[local94];
						local117 = this.method1313(local80, local25 * local103 >> 12, local36, local89, local71, local43);
						local117 = arg1[local94] + (local117 * local30 >> 12);
						arg1[local94] = (local117 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Static31.anInt797; local94++) {
						local103 = this.anInt1633 * Static339.anIntArray4[local94];
						local117 = this.method1313(local80, local25 * local103 >> 12, local36, local89, local71, local43);
						arg1[local94] += local30 * local117 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		this.aByteArray22 = Static218.method3958(this.anInt1631);
		this.method1310();
		for (@Pc(19) int local19 = this.anInt1627 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray32[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt1627--;
		}
	}

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "(B)V")
	private void method1310() {
		@Pc(28) int local28;
		if (this.anInt1628 > 0) {
			this.aShortArray32 = new short[this.anInt1627];
			this.aShortArray33 = new short[this.anInt1627];
			for (local28 = 0; local28 < this.anInt1627; local28++) {
				this.aShortArray32[local28] = (short) (Math.pow((double) ((float) this.anInt1628 / 4096.0F), (double) local28) * 4096.0D);
				this.aShortArray33[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		} else if (this.aShortArray32 != null && this.anInt1627 == this.aShortArray32.length) {
			this.aShortArray33 = new short[this.anInt1627];
			for (local28 = 0; local28 < this.anInt1627; local28++) {
				this.aShortArray33[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIII)I")
	private int method1313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg5) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg1 & 0xFFF;
		local9 &= 0xFF;
		local13 &= 0xFF;
		@Pc(38) int local38 = arg2 - 4096;
		@Pc(42) int local42 = local26 - 4096;
		@Pc(52) int local52 = this.aByteArray22[local9 + arg3] & 0x3;
		@Pc(56) int local56 = Class92.anIntArray263[local26];
		@Pc(74) int local74;
		if (local52 > 1) {
			local74 = local52 == 2 ? local26 - arg2 : -local26 - arg2;
		} else {
			local74 = local52 == 0 ? local26 + arg2 : arg2 + -local26;
		}
		local52 = this.aByteArray22[arg3 + local13] & 0x3;
		@Pc(118) int local118;
		if (local52 > 1) {
			local118 = local52 == 2 ? local42 - arg2 : -local42 - arg2;
		} else {
			local118 = local52 == 0 ? local42 + arg2 : -local42 + arg2;
		}
		@Pc(146) int local146 = local74 + (local56 * (local118 - local74) >> 12);
		local52 = this.aByteArray22[local9 + arg0] & 0x3;
		if (local52 <= 1) {
			local74 = local52 == 0 ? local38 + local26 : local38 + -local26;
		} else {
			local74 = local52 == 2 ? local26 - local38 : -local38 + -local26;
		}
		local52 = this.aByteArray22[arg0 + local13] & 0x3;
		if (local52 > 1) {
			local118 = local52 == 2 ? local42 - local38 : -local42 - local38;
		} else {
			local118 = local52 == 0 ? local42 + local38 : -local42 + local38;
		}
		@Pc(243) int local243 = (local56 * (local118 - local74) >> 12) + local74;
		return local146 + (arg4 * (local243 - local146) >> 12);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			this.method1309(arg0, local14);
		}
		return local14;
	}
}
