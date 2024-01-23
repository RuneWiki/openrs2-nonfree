import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class1_Sub3_Sub30 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
	private int anInt4453 = 4;

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "[B")
	private byte[] aByteArray48 = new byte[512];

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
	private int anInt4456 = 0;

	@OriginalMember(owner = "client!rd", name = "lb", descriptor = "I")
	private int anInt4466 = 4;

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
	private int anInt4457 = 1638;

	@OriginalMember(owner = "client!rd", name = "ob", descriptor = "I")
	private int anInt4468 = 4;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)V")
	private void method3364(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt4468 * Static94.anIntArray321[arg1];
		@Pc(105) int local105;
		@Pc(119) int local119;
		@Pc(32) int local32;
		@Pc(25) short local25;
		@Pc(96) int local96;
		@Pc(45) int local45;
		@Pc(39) int local39;
		@Pc(52) int local52;
		@Pc(91) int local91;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(69) int local69;
		@Pc(83) int local83;
		if (this.anInt4453 == 1) {
			local25 = this.aShortArray56[0];
			local32 = this.aShortArray57[0] << 12;
			local39 = local32 * this.anInt4466 >> 12;
			local45 = local32 * local16 >> 12;
			local52 = local32 * this.anInt4468 >> 12;
			local56 = local45 >> 12;
			local60 = local56 + 1;
			local69 = this.aByteArray48[local56 & 0xFF] & 0xFF;
			if (local60 >= local52) {
				local60 = 0;
			}
			local83 = this.aByteArray48[local60 & 0xFF] & 0xFF;
			local45 &= 0xFFF;
			local91 = Class9.anIntArray385[local45];
			if (this.aBoolean220) {
				for (local96 = 0; local96 < Static110.anInt2934; local96++) {
					local105 = this.anInt4466 * Static175.anIntArray302[local96];
					local119 = this.method3370(local83, local69, local39, local91, local45, local32 * local105 >> 12);
					local119 = local25 * local119 >> 12;
					arg0[local96] = (local119 >> 1) + 2048;
				}
			} else {
				for (local96 = 0; local96 < Static110.anInt2934; local96++) {
					local105 = this.anInt4466 * Static175.anIntArray302[local96];
					local119 = this.method3370(local83, local69, local39, local91, local45, local105 * local32 >> 12);
					arg0[local96] = local119 * local25 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray56[0];
		if (local25 > 8 || local25 < -8) {
			local32 = this.aShortArray57[0] << 12;
			local39 = this.anInt4466 * local32 >> 12;
			local45 = local16 * local32 >> 12;
			local52 = this.anInt4468 * local32 >> 12;
			local56 = local45 >> 12;
			local69 = this.aByteArray48[local56 & 0xFF] & 0xFF;
			local60 = local56 + 1;
			@Pc(245) int local245 = local45 & 0xFFF;
			if (local60 >= local52) {
				local60 = 0;
			}
			local91 = Class9.anIntArray385[local245];
			local83 = this.aByteArray48[local60 & 0xFF] & 0xFF;
			for (local96 = 0; local96 < Static110.anInt2934; local96++) {
				local105 = this.anInt4466 * Static175.anIntArray302[local96];
				local119 = this.method3370(local83, local69, local39, local91, local245, local32 * local105 >> 12);
				arg0[local96] = local25 * local119 >> 12;
			}
		}
		for (@Pc(310) int local310 = 1; local310 < this.anInt4453; local310++) {
			local25 = this.aShortArray56[local310];
			if (local25 > 8 || local25 < -8) {
				local32 = this.aShortArray57[local310] << 12;
				local39 = this.anInt4466 * local32 >> 12;
				local45 = local32 * local16 >> 12;
				local56 = local45 >> 12;
				local45 &= 0xFFF;
				local60 = local56 + 1;
				local69 = this.aByteArray48[local56 & 0xFF] & 0xFF;
				local52 = this.anInt4468 * local32 >> 12;
				if (local52 <= local60) {
					local60 = 0;
				}
				local83 = this.aByteArray48[local60 & 0xFF] & 0xFF;
				local91 = Class9.anIntArray385[local45];
				if (this.aBoolean220 && this.anInt4453 - 1 == local310) {
					for (local96 = 0; local96 < Static110.anInt2934; local96++) {
						local105 = Static175.anIntArray302[local96] * this.anInt4466;
						local119 = this.method3370(local83, local69, local39, local91, local45, local32 * local105 >> 12);
						local119 = arg0[local96] + (local25 * local119 >> 12);
						arg0[local96] = (local119 >> 1) + 2048;
					}
				} else {
					for (local96 = 0; local96 < Static110.anInt2934; local96++) {
						local105 = Static175.anIntArray302[local96] * this.anInt4466;
						local119 = this.method3370(local83, local69, local39, local91, local45, local32 * local105 >> 12);
						arg0[local96] += local25 * local119 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		this.aByteArray48 = Static153.method2742(this.anInt4456);
		this.method3365();
		for (@Pc(24) int local24 = this.anInt4453 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray56[local24];
			if (local31 > 8 || local31 < -8) {
				return;
			}
			this.anInt4453--;
		}
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)V")
	private void method3365() {
		@Pc(30) int local30;
		if (this.anInt4457 > 0) {
			this.aShortArray57 = new short[this.anInt4453];
			this.aShortArray56 = new short[this.anInt4453];
			for (local30 = 0; local30 < this.anInt4453; local30++) {
				this.aShortArray56[local30] = (short) (Math.pow((double) ((float) this.anInt4457 / 4096.0F), (double) local30) * 4096.0D);
				this.aShortArray57[local30] = (short) Math.pow(2.0D, (double) local30);
			}
		} else if (this.aShortArray56 != null && this.aShortArray56.length == this.anInt4453) {
			this.aShortArray57 = new short[this.anInt4453];
			for (local30 = 0; local30 < this.anInt4453; local30++) {
				this.aShortArray57[local30] = (short) Math.pow(2.0D, (double) local30);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			this.method3364(local13, arg0);
		}
		return local13;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean220 = arg0.method1772() == 1;
		} else if (arg1 == 1) {
			this.anInt4453 = arg0.method1772();
		} else if (arg1 == 2) {
			this.anInt4457 = arg0.method1798();
			if (this.anInt4457 < 0) {
				this.aShortArray56 = new short[this.anInt4453];
				for (@Pc(67) int local67 = 0; local67 < this.anInt4453; local67++) {
					this.aShortArray56[local67] = (short) arg0.method1798();
				}
			}
		} else if (arg1 == 3) {
			this.anInt4466 = this.anInt4468 = arg0.method1772();
		} else if (arg1 == 4) {
			this.anInt4456 = arg0.method1772();
		} else if (arg1 == 5) {
			this.anInt4466 = arg0.method1772();
		} else if (arg1 == 6) {
			this.anInt4468 = arg0.method1772();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIII)I")
	private int method3370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 - 4096;
		@Pc(21) int local21 = arg5 >> 12;
		@Pc(25) int local25 = arg5 & 0xFFF;
		@Pc(29) int local29 = local25 - 4096;
		@Pc(33) int local33 = local21 + 1;
		if (local33 >= arg2) {
			local33 = 0;
		}
		local33 &= 0xFF;
		local21 &= 0xFF;
		@Pc(54) int local54 = Class9.anIntArray385[local25];
		@Pc(64) int local64 = this.aByteArray48[local21 + arg1] & 0x3;
		@Pc(82) int local82;
		if (local64 > 1) {
			local82 = local64 == 2 ? local25 - arg4 : -arg4 + -local25;
		} else {
			local82 = local64 == 0 ? local25 + arg4 : arg4 + -local25;
		}
		local64 = this.aByteArray48[arg1 + local33] & 0x3;
		@Pc(126) int local126;
		if (local64 > 1) {
			local126 = local64 == 2 ? local29 - arg4 : -arg4 + -local29;
		} else {
			local126 = local64 == 0 ? arg4 + local29 : -local29 + arg4;
		}
		@Pc(150) int local150 = (local54 * (local126 - local82) >> 12) + local82;
		local64 = this.aByteArray48[arg0 + local21] & 0x3;
		if (local64 <= 1) {
			local82 = local64 == 0 ? local9 + local25 : local9 - local25;
		} else {
			local82 = local64 == 2 ? local25 - local9 : -local25 - local9;
		}
		local64 = this.aByteArray48[arg0 + local33] & 0x3;
		if (local64 > 1) {
			local126 = local64 == 2 ? local29 - local9 : -local9 + -local29;
		} else {
			local126 = local64 == 0 ? local29 + local9 : -local29 + local9;
		}
		@Pc(249) int local249 = (local54 * (local126 - local82) >> 12) + local82;
		return local150 + ((local249 - local150) * arg3 >> 12);
	}
}
