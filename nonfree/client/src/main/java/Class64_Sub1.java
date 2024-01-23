import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class64_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		super.anInt2365 = arg0;
		super.anInt2360 = arg1;
		super.anInt2358 = arg2;
		super.anInt2362 = arg3;
		super.anInt2356 = arg4;
		super.anInt2361 = arg5;
		this.aByteArray36 = arg6;
		this.anIntArray227 = arg7;
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(III)V")
	private Class64_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt2365 = super.anInt2356 = arg0;
		super.anInt2360 = super.anInt2361 = arg1;
		super.anInt2358 = super.anInt2362 = 0;
		this.aByteArray36 = new byte[arg0 * arg1];
		this.anIntArray227 = new int[arg2];
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
	public void method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray227.length; local1++) {
			@Pc(11) int local11 = this.anIntArray227[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray227[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray227[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray227[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Lclient!ka;")
	public Class64_Sub1 method1875() {
		@Pc(10) Class64_Sub1 local10 = new Class64_Sub1(super.anInt2356, super.anInt2361, this.anIntArray227.length);
		local10.anInt2365 = super.anInt2365;
		local10.anInt2360 = super.anInt2360;
		local10.anInt2358 = super.anInt2358;
		local10.anInt2362 = super.anInt2362;
		@Pc(30) int local30 = this.aByteArray36.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray36[local32] = this.aByteArray36[local32];
		}
		local10.anIntArray227 = this.anIntArray227;
		return local10;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public void method1878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = super.anInt2356;
		@Pc(5) int local5 = super.anInt2361;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = super.anInt2365;
		@Pc(15) int local15 = super.anInt2360;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (super.anInt2358 > 0) {
			local41 = ((super.anInt2358 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (super.anInt2358 << 16);
		}
		if (super.anInt2362 > 0) {
			local41 = ((super.anInt2362 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (super.anInt2362 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static205.anInt4388;
		@Pc(125) int local125 = Static205.anInt4388 - arg2;
		if (arg1 + arg3 > Static205.anInt4390) {
			arg3 -= arg1 + arg3 - Static205.anInt4390;
		}
		@Pc(145) int local145;
		if (arg1 < Static205.anInt4393) {
			local145 = Static205.anInt4393 - arg1;
			arg3 -= local145;
			local41 += local145 * Static205.anInt4388;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static205.anInt4391) {
			local145 = arg0 + arg2 - Static205.anInt4391;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static205.anInt4392) {
			local145 = Static205.anInt4392 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static239.method1880(Static205.anIntArray358, this.aByteArray36, this.anIntArray227, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	@Override
	public void method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += super.anInt2358;
		arg1 += super.anInt2362;
		@Pc(15) int local15 = arg0 + arg1 * Static205.anInt4388;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt2361;
		@Pc(23) int local23 = super.anInt2356;
		@Pc(27) int local27 = Static205.anInt4388 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static205.anInt4393) {
			local36 = Static205.anInt4393 - arg1;
			local20 -= local36;
			arg1 = Static205.anInt4393;
			local17 = local36 * local23;
			local15 += local36 * Static205.anInt4388;
		}
		if (arg1 + local20 > Static205.anInt4390) {
			local20 -= arg1 + local20 - Static205.anInt4390;
		}
		if (arg0 < Static205.anInt4392) {
			local36 = Static205.anInt4392 - arg0;
			local23 -= local36;
			arg0 = Static205.anInt4392;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static205.anInt4391) {
			local36 = arg0 + local23 - Static205.anInt4391;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static239.method1876(Static205.anIntArray358, this.aByteArray36, this.anIntArray227, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	public void method1879() {
		if (super.anInt2356 == super.anInt2365 && super.anInt2361 == super.anInt2360) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[super.anInt2365 * super.anInt2360];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < super.anInt2361; local21++) {
			for (@Pc(24) int local24 = 0; local24 < super.anInt2356; local24++) {
				local17[local24 + super.anInt2358 + (local21 + super.anInt2362) * super.anInt2365] = this.aByteArray36[local19++];
			}
		}
		this.aByteArray36 = local17;
		super.anInt2356 = super.anInt2365;
		super.anInt2361 = super.anInt2360;
		super.anInt2358 = 0;
		super.anInt2362 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public void method1881() {
		@Pc(6) byte[] local6 = new byte[super.anInt2356 * super.anInt2361];
		@Pc(8) int local8 = 0;
		@Pc(16) int local16;
		for (@Pc(10) int local10 = 0; local10 < super.anInt2356; local10++) {
			for (local16 = super.anInt2361 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray36[local10 + local16 * super.anInt2356];
			}
		}
		this.aByteArray36 = local6;
		local16 = super.anInt2362;
		super.anInt2362 = super.anInt2358;
		super.anInt2358 = super.anInt2360 - super.anInt2361 - local16;
		local16 = super.anInt2361;
		super.anInt2361 = super.anInt2356;
		super.anInt2356 = local16;
		local16 = super.anInt2360;
		super.anInt2360 = super.anInt2365;
		super.anInt2365 = local16;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	@Override
	public void method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += super.anInt2358;
		arg1 += super.anInt2362;
		@Pc(15) int local15 = arg0 + arg1 * Static205.anInt4388;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt2361;
		@Pc(23) int local23 = super.anInt2356;
		@Pc(27) int local27 = Static205.anInt4388 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static205.anInt4393) {
			local36 = Static205.anInt4393 - arg1;
			local20 -= local36;
			arg1 = Static205.anInt4393;
			local17 = local36 * local23;
			local15 += local36 * Static205.anInt4388;
		}
		if (arg1 + local20 > Static205.anInt4390) {
			local20 -= arg1 + local20 - Static205.anInt4390;
		}
		if (arg0 < Static205.anInt4392) {
			local36 = Static205.anInt4392 - arg0;
			local23 -= local36;
			arg0 = Static205.anInt4392;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static205.anInt4391) {
			local36 = arg0 + local23 - Static205.anInt4391;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static239.method1877(Static205.anIntArray358, this.aByteArray36, this.anIntArray227, local17, local15, local23, local20, local27, local29, arg2);
		}
	}
}
