import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class41_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		super.anInt1296 = arg0;
		super.anInt1301 = arg1;
		super.anInt1297 = arg2;
		super.anInt1293 = arg3;
		super.anInt1294 = arg4;
		super.anInt1298 = arg5;
		this.aByteArray14 = arg6;
		this.anIntArray81 = arg7;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
	@Override
	public void method969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += super.anInt1297;
		arg1 += super.anInt1293;
		@Pc(15) int local15 = arg0 + arg1 * Static96.anInt2126;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt1298;
		@Pc(23) int local23 = super.anInt1294;
		@Pc(27) int local27 = Static96.anInt2126 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static96.anInt2124) {
			local36 = Static96.anInt2124 - arg1;
			local20 -= local36;
			arg1 = Static96.anInt2124;
			local17 = local36 * local23;
			local15 += local36 * Static96.anInt2126;
		}
		if (arg1 + local20 > Static96.anInt2125) {
			local20 -= arg1 + local20 - Static96.anInt2125;
		}
		if (arg0 < Static96.anInt2121) {
			local36 = Static96.anInt2121 - arg0;
			local23 -= local36;
			arg0 = Static96.anInt2121;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static96.anInt2123) {
			local36 = arg0 + local23 - Static96.anInt2123;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static235.method972(Static96.anIntArray137, this.aByteArray14, this.anIntArray81, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(III)V")
	public void method973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray81.length; local1++) {
			@Pc(11) int local11 = this.anIntArray81[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray81[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray81[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray81[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
	public void method974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = super.anInt1294;
		@Pc(5) int local5 = super.anInt1298;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = super.anInt1296;
		@Pc(15) int local15 = super.anInt1301;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (super.anInt1297 > 0) {
			local41 = ((super.anInt1297 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (super.anInt1297 << 16);
		}
		if (super.anInt1293 > 0) {
			local41 = ((super.anInt1293 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (super.anInt1293 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static96.anInt2126;
		@Pc(125) int local125 = Static96.anInt2126 - arg2;
		if (arg1 + arg3 > Static96.anInt2125) {
			arg3 -= arg1 + arg3 - Static96.anInt2125;
		}
		@Pc(145) int local145;
		if (arg1 < Static96.anInt2124) {
			local145 = Static96.anInt2124 - arg1;
			arg3 -= local145;
			local41 += local145 * Static96.anInt2126;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static96.anInt2123) {
			local145 = arg0 + arg2 - Static96.anInt2123;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static96.anInt2121) {
			local145 = Static96.anInt2121 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static235.method971(Static96.anIntArray137, this.aByteArray14, this.anIntArray81, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
	@Override
	public void method966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += super.anInt1297;
		arg1 += super.anInt1293;
		@Pc(15) int local15 = arg0 + arg1 * Static96.anInt2126;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt1298;
		@Pc(23) int local23 = super.anInt1294;
		@Pc(27) int local27 = Static96.anInt2126 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static96.anInt2124) {
			local36 = Static96.anInt2124 - arg1;
			local20 -= local36;
			arg1 = Static96.anInt2124;
			local17 = local36 * local23;
			local15 += local36 * Static96.anInt2126;
		}
		if (arg1 + local20 > Static96.anInt2125) {
			local20 -= arg1 + local20 - Static96.anInt2125;
		}
		if (arg0 < Static96.anInt2121) {
			local36 = Static96.anInt2121 - arg0;
			local23 -= local36;
			arg0 = Static96.anInt2121;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static96.anInt2123) {
			local36 = arg0 + local23 - Static96.anInt2123;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static235.method970(Static96.anIntArray137, this.aByteArray14, this.anIntArray81, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	public void method975() {
		if (super.anInt1294 == super.anInt1296 && super.anInt1298 == super.anInt1301) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[super.anInt1296 * super.anInt1301];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < super.anInt1298; local21++) {
			for (@Pc(24) int local24 = 0; local24 < super.anInt1294; local24++) {
				local17[local24 + super.anInt1297 + (local21 + super.anInt1293) * super.anInt1296] = this.aByteArray14[local19++];
			}
		}
		this.aByteArray14 = local17;
		super.anInt1294 = super.anInt1296;
		super.anInt1298 = super.anInt1301;
		super.anInt1297 = 0;
		super.anInt1293 = 0;
	}
}
