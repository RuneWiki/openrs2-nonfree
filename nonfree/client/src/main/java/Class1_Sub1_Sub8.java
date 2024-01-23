import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
	public int anInt713 = 4;

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
	public int anInt712 = 4;

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "Z")
	public boolean aBoolean74 = true;

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
	public int anInt717 = 4;

	@OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
	public int anInt719 = 0;

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "[B")
	private byte[] aByteArray28 = new byte[512];

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
	public int anInt710 = 1638;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			this.method662(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean74 = arg0.method1853() == 1;
		} else if (arg1 == 1) {
			this.anInt713 = arg0.method1853();
		} else if (arg1 == 2) {
			this.anInt710 = arg0.method1843();
			if (this.anInt710 < 0) {
				this.aShortArray27 = new short[this.anInt713];
				for (@Pc(78) int local78 = 0; local78 < this.anInt713; local78++) {
					this.aShortArray27[local78] = (short) arg0.method1843();
				}
			}
		} else if (arg1 == 3) {
			this.anInt712 = this.anInt717 = arg0.method1853();
		} else if (arg1 == 4) {
			this.anInt719 = arg0.method1853();
		} else if (arg1 == 5) {
			this.anInt712 = arg0.method1853();
		} else if (arg1 == 6) {
			this.anInt717 = arg0.method1853();
		}
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		this.aByteArray28 = Static210.method3472(this.anInt719);
		this.method664();
		for (@Pc(19) int local19 = this.anInt713 - 1; local19 >= 1; local19--) {
			@Pc(29) short local29 = this.aShortArray27[local19];
			if (local29 > 8 || local29 < -8) {
				break;
			}
			this.anInt713--;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([III)V")
	public void method662(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt717 * Static10.anIntArray604[arg1];
		@Pc(110) int local110;
		@Pc(126) int local126;
		@Pc(36) int local36;
		@Pc(29) short local29;
		@Pc(100) int local100;
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(43) int local43;
		@Pc(86) int local86;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(95) int local95;
		@Pc(82) int local82;
		if (this.anInt713 == 1) {
			local29 = this.aShortArray27[0];
			local36 = this.aShortArray28[0] << 12;
			local43 = this.anInt717 * local36 >> 12;
			local49 = local36 * local8 >> 12;
			local56 = local36 * this.anInt712 >> 12;
			local60 = local49 >> 12;
			local64 = local60 + 1;
			if (local64 >= local43) {
				local64 = 0;
			}
			local49 &= 0xFFF;
			local82 = this.aByteArray28[local64 & 0xFF] & 0xFF;
			local86 = Class1_Sub1_Sub37.anIntArray570[local49];
			local95 = this.aByteArray28[local60 & 0xFF] & 0xFF;
			if (this.aBoolean74) {
				for (local100 = 0; local100 < Static6.anInt4960; local100++) {
					local110 = this.anInt712 * Static298.anIntArray589[local100];
					local126 = this.method663(local82, local49, local56, local110 * local36 >> 12, local86, local95);
					local126 = local29 * local126 >> 12;
					arg0[local100] = (local126 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static6.anInt4960; local100++) {
					local110 = Static298.anIntArray589[local100] * this.anInt712;
					local126 = this.method663(local82, local49, local56, local110 * local36 >> 12, local86, local95);
					arg0[local100] = local29 * local126 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray27[0];
		if (local29 > 8 || local29 < -8) {
			local36 = this.aShortArray28[0] << 12;
			local43 = local36 * this.anInt717 >> 12;
			local49 = local8 * local36 >> 12;
			local56 = this.anInt712 * local36 >> 12;
			local60 = local49 >> 12;
			local95 = this.aByteArray28[local60 & 0xFF] & 0xFF;
			local64 = local60 + 1;
			local49 &= 0xFFF;
			if (local43 <= local64) {
				local64 = 0;
			}
			local86 = Class1_Sub1_Sub37.anIntArray570[local49];
			local82 = this.aByteArray28[local64 & 0xFF] & 0xFF;
			for (local100 = 0; local100 < Static6.anInt4960; local100++) {
				local110 = this.anInt712 * Static298.anIntArray589[local100];
				local126 = this.method663(local82, local49, local56, local36 * local110 >> 12, local86, local95);
				arg0[local100] = local126 * local29 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt713; local301++) {
			local29 = this.aShortArray27[local301];
			if (local29 > 8 || local29 < -8) {
				local36 = this.aShortArray28[local301] << 12;
				local49 = local8 * local36 >> 12;
				local56 = local36 * this.anInt712 >> 12;
				local43 = local36 * this.anInt717 >> 12;
				local60 = local49 >> 12;
				local49 &= 0xFFF;
				local95 = this.aByteArray28[local60 & 0xFF] & 0xFF;
				local86 = Class1_Sub1_Sub37.anIntArray570[local49];
				local64 = local60 + 1;
				if (local64 >= local43) {
					local64 = 0;
				}
				local82 = this.aByteArray28[local64 & 0xFF] & 0xFF;
				if (this.aBoolean74 && this.anInt713 - 1 == local301) {
					for (local100 = 0; local100 < Static6.anInt4960; local100++) {
						local110 = Static298.anIntArray589[local100] * this.anInt712;
						local126 = this.method663(local82, local49, local56, local110 * local36 >> 12, local86, local95);
						local126 = arg0[local100] + (local126 * local29 >> 12);
						arg0[local100] = (local126 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static6.anInt4960; local100++) {
						local110 = this.anInt712 * Static298.anIntArray589[local100];
						local126 = this.method663(local82, local49, local56, local110 * local36 >> 12, local86, local95);
						arg0[local100] += local126 * local29 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)I")
	private int method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg2) {
			local13 = 0;
		}
		@Pc(23) int local23 = arg3 & 0xFFF;
		@Pc(27) int local27 = arg1 - 4096;
		@Pc(31) int local31 = Class1_Sub1_Sub37.anIntArray570[local23];
		local13 &= 0xFF;
		@Pc(39) int local39 = local23 - 4096;
		local9 &= 0xFF;
		@Pc(52) int local52 = this.aByteArray28[local9 + arg5] & 0x3;
		@Pc(79) int local79;
		if (local52 > 1) {
			local79 = local52 == 2 ? local23 - arg1 : -local23 + -arg1;
		} else {
			local79 = local52 == 0 ? arg1 + local23 : arg1 + -local23;
		}
		local52 = this.aByteArray28[local13 + arg5] & 0x3;
		@Pc(119) int local119;
		if (local52 <= 1) {
			local119 = local52 == 0 ? arg1 + local39 : arg1 + -local39;
		} else {
			local119 = local52 == 2 ? local39 - arg1 : -arg1 + -local39;
		}
		@Pc(146) int local146 = (local31 * (local119 - local79) >> 12) + local79;
		local52 = this.aByteArray28[local9 + arg0] & 0x3;
		if (local52 > 1) {
			local79 = local52 == 2 ? local23 - local27 : -local23 - local27;
		} else {
			local79 = local52 == 0 ? local27 + local23 : -local23 + local27;
		}
		local52 = this.aByteArray28[local13 + arg0] & 0x3;
		if (local52 > 1) {
			local119 = local52 == 2 ? local39 - local27 : -local27 + -local39;
		} else {
			local119 = local52 == 0 ? local27 + local39 : -local39 + local27;
		}
		@Pc(238) int local238 = (local31 * (local119 - local79) >> 12) + local79;
		return local146 + ((local238 - local146) * arg4 >> 12);
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V")
	private void method664() {
		@Pc(17) int local17;
		if (this.anInt710 > 0) {
			this.aShortArray28 = new short[this.anInt713];
			this.aShortArray27 = new short[this.anInt713];
			for (local17 = 0; local17 < this.anInt713; local17++) {
				this.aShortArray27[local17] = (short) (Math.pow((double) ((float) this.anInt710 / 4096.0F), (double) local17) * 4096.0D);
				this.aShortArray28[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		} else if (this.aShortArray27 != null && this.aShortArray27.length == this.anInt713) {
			this.aShortArray28 = new short[this.anInt713];
			for (local17 = 0; local17 < this.anInt713; local17++) {
				this.aShortArray28[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		}
	}
}
