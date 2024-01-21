import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class1_Sub2_Sub8_Sub2 extends Class1_Sub2_Sub8 {

	@OriginalMember(owner = "client!le", name = "R", descriptor = "[I")
	public int[] anIntArray202;

	@OriginalMember(owner = "client!le", name = "S", descriptor = "I")
	public int anInt2559;

	@OriginalMember(owner = "client!le", name = "T", descriptor = "I")
	public int anInt2560;

	@OriginalMember(owner = "client!le", name = "U", descriptor = "I")
	public int anInt2561;

	@OriginalMember(owner = "client!le", name = "V", descriptor = "I")
	public int anInt2562;

	@OriginalMember(owner = "client!le", name = "W", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!le", name = "X", descriptor = "I")
	public int anInt2563;

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
	public int anInt2564;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(IIII)V")
	public void method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt2563;
		@Pc(5) int local5 = this.anInt2562;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt2564;
		@Pc(15) int local15 = this.anInt2560;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt2561 > 0) {
			local41 = ((this.anInt2561 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt2561 << 16);
		}
		if (this.anInt2559 > 0) {
			local41 = ((this.anInt2559 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt2559 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static90.anInt4601;
		@Pc(125) int local125 = Static90.anInt4601 - arg2;
		if (arg1 + arg3 > Static90.anInt4603) {
			arg3 -= arg1 + arg3 - Static90.anInt4603;
		}
		@Pc(145) int local145;
		if (arg1 < Static90.anInt4604) {
			local145 = Static90.anInt4604 - arg1;
			arg3 -= local145;
			local41 += local145 * Static90.anInt4601;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static90.anInt4600) {
			local145 = arg0 + arg2 - Static90.anInt4600;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static90.anInt4602) {
			local145 = Static90.anInt4602 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static216.method1959(Static90.anIntArray406, this.aByteArray24, this.anIntArray202, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V")
	public void method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray202.length; local1++) {
			@Pc(11) int local11 = this.anIntArray202[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray202[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray202[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray202[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)V")
	public void method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt2561;
		arg1 += this.anInt2559;
		@Pc(15) int local15 = arg0 + arg1 * Static90.anInt4601;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2562;
		@Pc(23) int local23 = this.anInt2563;
		@Pc(27) int local27 = Static90.anInt4601 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static90.anInt4604) {
			local36 = Static90.anInt4604 - arg1;
			local20 -= local36;
			arg1 = Static90.anInt4604;
			local17 = local36 * local23;
			local15 += local36 * Static90.anInt4601;
		}
		if (arg1 + local20 > Static90.anInt4603) {
			local20 -= arg1 + local20 - Static90.anInt4603;
		}
		if (arg0 < Static90.anInt4602) {
			local36 = Static90.anInt4602 - arg0;
			local23 -= local36;
			arg0 = Static90.anInt4602;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static90.anInt4600) {
			local36 = arg0 + local23 - Static90.anInt4600;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static216.method1963(Static90.anIntArray406, this.aByteArray24, this.anIntArray202, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(II)V")
	public void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2561;
		arg1 += this.anInt2559;
		@Pc(15) int local15 = arg0 + arg1 * Static90.anInt4601;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2562;
		@Pc(23) int local23 = this.anInt2563;
		@Pc(27) int local27 = Static90.anInt4601 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static90.anInt4604) {
			local36 = Static90.anInt4604 - arg1;
			local20 -= local36;
			arg1 = Static90.anInt4604;
			local17 = local36 * local23;
			local15 += local36 * Static90.anInt4601;
		}
		if (arg1 + local20 > Static90.anInt4603) {
			local20 -= arg1 + local20 - Static90.anInt4603;
		}
		if (arg0 < Static90.anInt4602) {
			local36 = Static90.anInt4602 - arg0;
			local23 -= local36;
			arg0 = Static90.anInt4602;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static90.anInt4600) {
			local36 = arg0 + local23 - Static90.anInt4600;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static216.method1962(Static90.anIntArray406, this.aByteArray24, this.anIntArray202, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
	public void method1961() {
		if (this.anInt2563 == this.anInt2564 && this.anInt2562 == this.anInt2560) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2564 * this.anInt2560];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2562; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2563; local24++) {
				local17[local24 + this.anInt2561 + (local21 + this.anInt2559) * this.anInt2564] = this.aByteArray24[local19++];
			}
		}
		this.aByteArray24 = local17;
		this.anInt2563 = this.anInt2564;
		this.anInt2562 = this.anInt2560;
		this.anInt2561 = 0;
		this.anInt2559 = 0;
	}
}
