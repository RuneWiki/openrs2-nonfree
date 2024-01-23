import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class60_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		super.anInt3990 = arg0;
		super.anInt3995 = arg1;
		super.anInt3994 = arg2;
		super.anInt3989 = arg3;
		super.anInt3991 = arg4;
		super.anInt3993 = arg5;
		this.aByteArray55 = arg6;
		this.anIntArray417 = arg7;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
	public void method2745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray417.length; local1++) {
			@Pc(11) int local11 = this.anIntArray417[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray417[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray417[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray417[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "()V")
	public void method2746() {
		if (super.anInt3991 == super.anInt3990 && super.anInt3993 == super.anInt3995) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[super.anInt3990 * super.anInt3995];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < super.anInt3993; local21++) {
			for (@Pc(24) int local24 = 0; local24 < super.anInt3991; local24++) {
				local17[local24 + super.anInt3994 + (local21 + super.anInt3989) * super.anInt3990] = this.aByteArray55[local19++];
			}
		}
		this.aByteArray55 = local17;
		super.anInt3991 = super.anInt3990;
		super.anInt3993 = super.anInt3995;
		super.anInt3994 = 0;
		super.anInt3989 = 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
	@Override
	public void method2741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += super.anInt3994;
		arg1 += super.anInt3989;
		@Pc(15) int local15 = arg0 + arg1 * Static64.anInt1698;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt3993;
		@Pc(23) int local23 = super.anInt3991;
		@Pc(27) int local27 = Static64.anInt1698 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static64.anInt1699) {
			local36 = Static64.anInt1699 - arg1;
			local20 -= local36;
			arg1 = Static64.anInt1699;
			local17 = local36 * local23;
			local15 += local36 * Static64.anInt1698;
		}
		if (arg1 + local20 > Static64.anInt1700) {
			local20 -= arg1 + local20 - Static64.anInt1700;
		}
		if (arg0 < Static64.anInt1697) {
			local36 = Static64.anInt1697 - arg0;
			local23 -= local36;
			arg0 = Static64.anInt1697;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static64.anInt1701) {
			local36 = arg0 + local23 - Static64.anInt1701;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static228.method2749(Static64.anIntArray163, this.aByteArray55, this.anIntArray417, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	public void method2747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = super.anInt3991;
		@Pc(5) int local5 = super.anInt3993;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = super.anInt3990;
		@Pc(15) int local15 = super.anInt3995;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (super.anInt3994 > 0) {
			local41 = ((super.anInt3994 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (super.anInt3994 << 16);
		}
		if (super.anInt3989 > 0) {
			local41 = ((super.anInt3989 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (super.anInt3989 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static64.anInt1698;
		@Pc(125) int local125 = Static64.anInt1698 - arg2;
		if (arg1 + arg3 > Static64.anInt1700) {
			arg3 -= arg1 + arg3 - Static64.anInt1700;
		}
		@Pc(145) int local145;
		if (arg1 < Static64.anInt1699) {
			local145 = Static64.anInt1699 - arg1;
			arg3 -= local145;
			local41 += local145 * Static64.anInt1698;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static64.anInt1701) {
			local145 = arg0 + arg2 - Static64.anInt1701;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static64.anInt1697) {
			local145 = Static64.anInt1697 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static228.method2748(Static64.anIntArray163, this.aByteArray55, this.anIntArray417, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	@Override
	public void method2740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += super.anInt3994;
		arg1 += super.anInt3989;
		@Pc(15) int local15 = arg0 + arg1 * Static64.anInt1698;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = super.anInt3993;
		@Pc(23) int local23 = super.anInt3991;
		@Pc(27) int local27 = Static64.anInt1698 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static64.anInt1699) {
			local36 = Static64.anInt1699 - arg1;
			local20 -= local36;
			arg1 = Static64.anInt1699;
			local17 = local36 * local23;
			local15 += local36 * Static64.anInt1698;
		}
		if (arg1 + local20 > Static64.anInt1700) {
			local20 -= arg1 + local20 - Static64.anInt1700;
		}
		if (arg0 < Static64.anInt1697) {
			local36 = Static64.anInt1697 - arg0;
			local23 -= local36;
			arg0 = Static64.anInt1697;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static64.anInt1701) {
			local36 = arg0 + local23 - Static64.anInt1701;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static228.method2750(Static64.anIntArray163, this.aByteArray55, this.anIntArray417, local17, local15, local23, local20, local27, local29);
		}
	}
}
