import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "[I")
	private final int[] anIntArray294;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class47_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		super.anInt2706 = arg0;
		super.anInt2705 = arg1;
		super.anInt2708 = arg2;
		super.anInt2703 = arg3;
		super.anInt2707 = arg4;
		super.anInt2709 = arg5;
		this.aByteArray43 = arg6;
		this.anIntArray294 = arg7;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
	public void method2019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = super.anInt2707;
		@Pc(5) int local5 = super.anInt2709;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = super.anInt2706;
		@Pc(15) int local15 = super.anInt2705;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (super.anInt2708 > 0) {
			local41 = ((super.anInt2708 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (super.anInt2708 << 16);
		}
		if (super.anInt2703 > 0) {
			local41 = ((super.anInt2703 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (super.anInt2703 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static42.anInt969;
		@Pc(125) int local125 = Static42.anInt969 - arg2;
		if (arg1 + arg3 > Static42.anInt974) {
			arg3 -= arg1 + arg3 - Static42.anInt974;
		}
		@Pc(145) int local145;
		if (arg1 < Static42.anInt972) {
			local145 = Static42.anInt972 - arg1;
			arg3 -= local145;
			local41 += local145 * Static42.anInt969;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static42.anInt970) {
			local145 = arg0 + arg2 - Static42.anInt970;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static42.anInt973) {
			local145 = Static42.anInt973 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static224.method2017(Static42.anIntArray92, this.aByteArray43, this.anIntArray294, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
	public void method2020() {
		if (super.anInt2707 == super.anInt2706 && super.anInt2709 == super.anInt2705) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[super.anInt2706 * super.anInt2705];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < super.anInt2709; local21++) {
			for (@Pc(24) int local24 = 0; local24 < super.anInt2707; local24++) {
				local17[local24 + super.anInt2708 + (local21 + super.anInt2703) * super.anInt2706] = this.aByteArray43[local19++];
			}
		}
		this.aByteArray43 = local17;
		super.anInt2707 = super.anInt2706;
		super.anInt2709 = super.anInt2705;
		super.anInt2708 = 0;
		super.anInt2703 = 0;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)V")
	public void method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray294.length; local1++) {
			@Pc(11) int local11 = this.anIntArray294[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray294[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray294[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray294[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	@Override
	public void method2014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += super.anInt2708;
		arg1 += super.anInt2703;
		@Pc(15) int local15 = arg0 + arg1 * Static42.anInt969;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt2709;
		@Pc(23) int local23 = super.anInt2707;
		@Pc(27) int local27 = Static42.anInt969 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static42.anInt972) {
			local36 = Static42.anInt972 - arg1;
			local20 -= local36;
			arg1 = Static42.anInt972;
			local17 = local36 * local23;
			local15 += local36 * Static42.anInt969;
		}
		if (arg1 + local20 > Static42.anInt974) {
			local20 -= arg1 + local20 - Static42.anInt974;
		}
		if (arg0 < Static42.anInt973) {
			local36 = Static42.anInt973 - arg0;
			local23 -= local36;
			arg0 = Static42.anInt973;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static42.anInt970) {
			local36 = arg0 + local23 - Static42.anInt970;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static224.method2018(Static42.anIntArray92, this.aByteArray43, this.anIntArray294, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	@Override
	public void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += super.anInt2708;
		arg1 += super.anInt2703;
		@Pc(15) int local15 = arg0 + arg1 * Static42.anInt969;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt2709;
		@Pc(23) int local23 = super.anInt2707;
		@Pc(27) int local27 = Static42.anInt969 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static42.anInt972) {
			local36 = Static42.anInt972 - arg1;
			local20 -= local36;
			arg1 = Static42.anInt972;
			local17 = local36 * local23;
			local15 += local36 * Static42.anInt969;
		}
		if (arg1 + local20 > Static42.anInt974) {
			local20 -= arg1 + local20 - Static42.anInt974;
		}
		if (arg0 < Static42.anInt973) {
			local36 = Static42.anInt973 - arg0;
			local23 -= local36;
			arg0 = Static42.anInt973;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static42.anInt970) {
			local36 = arg0 + local23 - Static42.anInt970;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static224.method2022(Static42.anIntArray92, this.aByteArray43, this.anIntArray294, local17, local15, local23, local20, local27, local29);
		}
	}
}
