import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		super.anInt2102 = arg0;
		super.anInt2105 = arg1;
		super.anInt2108 = arg2;
		super.anInt2110 = arg3;
		super.anInt2109 = arg4;
		super.anInt2107 = arg5;
		this.aByteArray26 = arg6;
		this.anIntArray158 = arg7;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
	public void method1527() {
		if (super.anInt2109 == super.anInt2102 && super.anInt2107 == super.anInt2105) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[super.anInt2102 * super.anInt2105];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < super.anInt2107; local21++) {
			for (@Pc(24) int local24 = 0; local24 < super.anInt2109; local24++) {
				local17[local24 + super.anInt2108 + (local21 + super.anInt2110) * super.anInt2102] = this.aByteArray26[local19++];
			}
		}
		this.aByteArray26 = local17;
		super.anInt2109 = super.anInt2102;
		super.anInt2107 = super.anInt2105;
		super.anInt2108 = 0;
		super.anInt2110 = 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	@Override
	public void method1520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += super.anInt2108;
		arg1 += super.anInt2110;
		@Pc(15) int local15 = arg0 + arg1 * Static189.anInt4234;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt2107;
		@Pc(23) int local23 = super.anInt2109;
		@Pc(27) int local27 = Static189.anInt4234 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static189.anInt4231) {
			local36 = Static189.anInt4231 - arg1;
			local20 -= local36;
			arg1 = Static189.anInt4231;
			local17 = local36 * local23;
			local15 += local36 * Static189.anInt4234;
		}
		if (arg1 + local20 > Static189.anInt4233) {
			local20 -= arg1 + local20 - Static189.anInt4233;
		}
		if (arg0 < Static189.anInt4232) {
			local36 = Static189.anInt4232 - arg0;
			local23 -= local36;
			arg0 = Static189.anInt4232;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static189.anInt4229) {
			local36 = arg0 + local23 - Static189.anInt4229;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static270.method1534(Static189.anIntArray319, this.aByteArray26, this.anIntArray158, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "()V")
	public void method1528() {
		@Pc(6) byte[] local6 = new byte[super.anInt2109 * super.anInt2107];
		@Pc(8) int local8 = 0;
		@Pc(16) int local16;
		for (@Pc(10) int local10 = 0; local10 < super.anInt2109; local10++) {
			for (local16 = super.anInt2107 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray26[local10 + local16 * super.anInt2109];
			}
		}
		this.aByteArray26 = local6;
		local16 = super.anInt2110;
		super.anInt2110 = super.anInt2108;
		super.anInt2108 = super.anInt2105 - super.anInt2107 - local16;
		local16 = super.anInt2107;
		super.anInt2107 = super.anInt2109;
		super.anInt2109 = local16;
		local16 = super.anInt2105;
		super.anInt2105 = super.anInt2102;
		super.anInt2102 = local16;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
	public void method1529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray158.length; local1++) {
			@Pc(11) int local11 = this.anIntArray158[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray158[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray158[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray158[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
	public void method1531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = super.anInt2109;
		@Pc(5) int local5 = super.anInt2107;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = super.anInt2102;
		@Pc(15) int local15 = super.anInt2105;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (super.anInt2108 > 0) {
			local41 = ((super.anInt2108 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (super.anInt2108 << 16);
		}
		if (super.anInt2110 > 0) {
			local41 = ((super.anInt2110 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (super.anInt2110 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static189.anInt4234;
		@Pc(125) int local125 = Static189.anInt4234 - arg2;
		if (arg1 + arg3 > Static189.anInt4233) {
			arg3 -= arg1 + arg3 - Static189.anInt4233;
		}
		@Pc(145) int local145;
		if (arg1 < Static189.anInt4231) {
			local145 = Static189.anInt4231 - arg1;
			arg3 -= local145;
			local41 += local145 * Static189.anInt4234;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static189.anInt4229) {
			local145 = arg0 + arg2 - Static189.anInt4229;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static189.anInt4232) {
			local145 = Static189.anInt4232 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static270.method1532(Static189.anIntArray319, this.aByteArray26, this.anIntArray158, local7, local9, local41, local125, arg2, arg3, local21, local27, local2, arg4);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	@Override
	public void method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += super.anInt2108;
		arg1 += super.anInt2110;
		@Pc(15) int local15 = arg0 + arg1 * Static189.anInt4234;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt2107;
		@Pc(23) int local23 = super.anInt2109;
		@Pc(27) int local27 = Static189.anInt4234 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static189.anInt4231) {
			local36 = Static189.anInt4231 - arg1;
			local20 -= local36;
			arg1 = Static189.anInt4231;
			local17 = local36 * local23;
			local15 += local36 * Static189.anInt4234;
		}
		if (arg1 + local20 > Static189.anInt4233) {
			local20 -= arg1 + local20 - Static189.anInt4233;
		}
		if (arg0 < Static189.anInt4232) {
			local36 = Static189.anInt4232 - arg0;
			local23 -= local36;
			arg0 = Static189.anInt4232;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static189.anInt4229) {
			local36 = arg0 + local23 - Static189.anInt4229;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static270.method1530(Static189.anIntArray319, this.aByteArray26, this.anIntArray158, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
	public void method1533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = super.anInt2109;
		@Pc(5) int local5 = super.anInt2107;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = super.anInt2102;
		@Pc(15) int local15 = super.anInt2105;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (super.anInt2108 > 0) {
			local41 = ((super.anInt2108 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (super.anInt2108 << 16);
		}
		if (super.anInt2110 > 0) {
			local41 = ((super.anInt2110 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (super.anInt2110 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static189.anInt4234;
		@Pc(125) int local125 = Static189.anInt4234 - arg2;
		if (arg1 + arg3 > Static189.anInt4233) {
			arg3 -= arg1 + arg3 - Static189.anInt4233;
		}
		@Pc(145) int local145;
		if (arg1 < Static189.anInt4231) {
			local145 = Static189.anInt4231 - arg1;
			arg3 -= local145;
			local41 += local145 * Static189.anInt4234;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static189.anInt4229) {
			local145 = arg0 + arg2 - Static189.anInt4229;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static189.anInt4232) {
			local145 = Static189.anInt4232 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static270.method1535(Static189.anIntArray319, this.aByteArray26, this.anIntArray158, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()V")
	public void method1536() {
		@Pc(6) byte[] local6 = new byte[super.anInt2109 * super.anInt2107];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = super.anInt2107 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < super.anInt2109; local16++) {
				local6[local8++] = this.aByteArray26[local16 + local13 * super.anInt2109];
			}
		}
		this.aByteArray26 = local6;
		super.anInt2110 = super.anInt2105 - super.anInt2107 - super.anInt2110;
	}
}
