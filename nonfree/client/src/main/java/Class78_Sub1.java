import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class78_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		super.anInt3814 = arg0;
		super.anInt3807 = arg1;
		super.anInt3813 = arg2;
		super.anInt3809 = arg3;
		super.anInt3817 = arg4;
		super.anInt3818 = arg5;
		this.aByteArray53 = arg6;
		this.anIntArray429 = arg7;
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(III)V")
	private Class78_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt3814 = super.anInt3817 = arg0;
		super.anInt3807 = super.anInt3818 = arg1;
		super.anInt3813 = super.anInt3809 = 0;
		this.aByteArray53 = new byte[arg0 * arg1];
		this.anIntArray429 = new int[arg2];
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	@Override
	public void method3017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += super.anInt3813;
		arg1 += super.anInt3809;
		@Pc(15) int local15 = arg0 + arg1 * Static29.anInt549;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt3818;
		@Pc(23) int local23 = super.anInt3817;
		@Pc(27) int local27 = Static29.anInt549 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static29.anInt548) {
			local36 = Static29.anInt548 - arg1;
			local20 -= local36;
			arg1 = Static29.anInt548;
			local17 = local36 * local23;
			local15 += local36 * Static29.anInt549;
		}
		if (arg1 + local20 > Static29.anInt550) {
			local20 -= arg1 + local20 - Static29.anInt550;
		}
		if (arg0 < Static29.anInt552) {
			local36 = Static29.anInt552 - arg0;
			local23 -= local36;
			arg0 = Static29.anInt552;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static29.anInt551) {
			local36 = arg0 + local23 - Static29.anInt551;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static244.method3019(Static29.anIntArray59, this.aByteArray53, this.anIntArray429, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
	public void method3020() {
		if (super.anInt3817 == super.anInt3814 && super.anInt3818 == super.anInt3807) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[super.anInt3814 * super.anInt3807];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < super.anInt3818; local21++) {
			for (@Pc(24) int local24 = 0; local24 < super.anInt3817; local24++) {
				local17[local24 + super.anInt3813 + (local21 + super.anInt3809) * super.anInt3814] = this.aByteArray53[local19++];
			}
		}
		this.aByteArray53 = local17;
		super.anInt3817 = super.anInt3814;
		super.anInt3818 = super.anInt3807;
		super.anInt3813 = 0;
		super.anInt3809 = 0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "()Lclient!rh;")
	public Class78_Sub1 method3021() {
		@Pc(10) Class78_Sub1 local10 = new Class78_Sub1(super.anInt3817, super.anInt3818, this.anIntArray429.length);
		local10.anInt3814 = super.anInt3814;
		local10.anInt3807 = super.anInt3807;
		local10.anInt3813 = super.anInt3813;
		local10.anInt3809 = super.anInt3809;
		@Pc(30) int local30 = this.aByteArray53.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray53[local32] = this.aByteArray53[local32];
		}
		local10.anIntArray429 = this.anIntArray429;
		return local10;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	public void method3022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = super.anInt3817;
		@Pc(5) int local5 = super.anInt3818;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = super.anInt3814;
		@Pc(15) int local15 = super.anInt3807;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (super.anInt3813 > 0) {
			local41 = ((super.anInt3813 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (super.anInt3813 << 16);
		}
		if (super.anInt3809 > 0) {
			local41 = ((super.anInt3809 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (super.anInt3809 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static29.anInt549;
		@Pc(125) int local125 = Static29.anInt549 - arg2;
		if (arg1 + arg3 > Static29.anInt550) {
			arg3 -= arg1 + arg3 - Static29.anInt550;
		}
		@Pc(145) int local145;
		if (arg1 < Static29.anInt548) {
			local145 = Static29.anInt548 - arg1;
			arg3 -= local145;
			local41 += local145 * Static29.anInt549;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static29.anInt551) {
			local145 = arg0 + arg2 - Static29.anInt551;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static29.anInt552) {
			local145 = Static29.anInt552 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static244.method3025(Static29.anIntArray59, this.aByteArray53, this.anIntArray429, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()V")
	public void method3023() {
		@Pc(6) byte[] local6 = new byte[super.anInt3817 * super.anInt3818];
		@Pc(8) int local8 = 0;
		@Pc(16) int local16;
		for (@Pc(10) int local10 = 0; local10 < super.anInt3817; local10++) {
			for (local16 = super.anInt3818 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray53[local10 + local16 * super.anInt3817];
			}
		}
		this.aByteArray53 = local6;
		local16 = super.anInt3809;
		super.anInt3809 = super.anInt3813;
		super.anInt3813 = super.anInt3807 - super.anInt3818 - local16;
		local16 = super.anInt3818;
		super.anInt3818 = super.anInt3817;
		super.anInt3817 = local16;
		local16 = super.anInt3807;
		super.anInt3807 = super.anInt3814;
		super.anInt3814 = local16;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
	public void method3024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray429.length; local1++) {
			@Pc(11) int local11 = this.anIntArray429[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray429[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray429[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray429[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
	@Override
	public void method3014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += super.anInt3813;
		arg1 += super.anInt3809;
		@Pc(15) int local15 = arg0 + arg1 * Static29.anInt549;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt3818;
		@Pc(23) int local23 = super.anInt3817;
		@Pc(27) int local27 = Static29.anInt549 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static29.anInt548) {
			local36 = Static29.anInt548 - arg1;
			local20 -= local36;
			arg1 = Static29.anInt548;
			local17 = local36 * local23;
			local15 += local36 * Static29.anInt549;
		}
		if (arg1 + local20 > Static29.anInt550) {
			local20 -= arg1 + local20 - Static29.anInt550;
		}
		if (arg0 < Static29.anInt552) {
			local36 = Static29.anInt552 - arg0;
			local23 -= local36;
			arg0 = Static29.anInt552;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static29.anInt551) {
			local36 = arg0 + local23 - Static29.anInt551;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static244.method3026(Static29.anIntArray59, this.aByteArray53, this.anIntArray429, local17, local15, local23, local20, local27, local29, arg2);
		}
	}
}
