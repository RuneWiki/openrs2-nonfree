import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "[I")
	private int[] anIntArray395;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class58_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt5022 = arg0;
		this.anInt5025 = arg1;
		this.anInt5026 = arg2;
		this.anInt5027 = arg3;
		this.anInt5028 = arg4;
		this.anInt5023 = arg5;
		this.aByteArray59 = arg6;
		this.anIntArray395 = arg7;
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(III)V")
	public Class58_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5022 = this.anInt5028 = arg0;
		this.anInt5025 = this.anInt5023 = arg1;
		this.anInt5026 = this.anInt5027 = 0;
		this.aByteArray59 = new byte[arg0 * arg1];
		this.anIntArray395 = new int[arg2];
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	public void method3973() {
		@Pc(6) byte[] local6 = new byte[this.anInt5028 * this.anInt5023];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt5023 - 1; local13 >= 0; local13--) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt5028; local17++) {
				local6[local8++] = this.aByteArray59[local17 + local13 * this.anInt5028];
			}
		}
		this.aByteArray59 = local6;
		this.anInt5027 = this.anInt5025 - this.anInt5023 - this.anInt5027;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	@Override
	public void method3972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt5026;
		arg1 += this.anInt5027;
		@Pc(15) int local15 = arg0 + arg1 * Static258.anInt5069;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt5023;
		@Pc(23) int local23 = this.anInt5028;
		@Pc(27) int local27 = Static258.anInt5069 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static258.anInt5065) {
			local36 = Static258.anInt5065 - arg1;
			local20 -= local36;
			arg1 = Static258.anInt5065;
			local17 = local36 * local23;
			local15 += local36 * Static258.anInt5069;
		}
		if (arg1 + local20 > Static258.anInt5068) {
			local20 -= arg1 + local20 - Static258.anInt5068;
		}
		if (arg0 < Static258.anInt5067) {
			local36 = Static258.anInt5067 - arg0;
			local23 -= local36;
			arg0 = Static258.anInt5067;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static258.anInt5066) {
			local36 = arg0 + local23 - Static258.anInt5066;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static318.method3974(Static258.anIntArray399, this.aByteArray59, this.anIntArray395, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
	public void method3977() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = this.aByteArray59.length - 7;
		while (local1 < local7) {
			this.aByteArray59[local1++] = 0;
			this.aByteArray59[local1++] = 0;
			this.aByteArray59[local1++] = 0;
			this.aByteArray59[local1++] = 0;
			this.aByteArray59[local1++] = 0;
			this.aByteArray59[local1++] = 0;
			this.aByteArray59[local1++] = 0;
			this.aByteArray59[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			this.aByteArray59[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V")
	public void method3978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray395.length; local1++) {
			@Pc(15) int local15 = this.anIntArray395[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray395[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(59) int local59 = this.anIntArray395[local1] & 0xFF;
			local59 += arg2;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			this.anIntArray395[local1] = (local15 << 16) + (local38 << 8) + local59;
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "()V")
	public void method3979() {
		if (this.anInt5028 == this.anInt5022 && this.anInt5023 == this.anInt5025) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt5022 * this.anInt5025];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt5023; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt5028; local27++) {
				local17[local27 + this.anInt5026 + (local21 + this.anInt5027) * this.anInt5022] = this.aByteArray59[local19++];
			}
		}
		this.aByteArray59 = local17;
		this.anInt5028 = this.anInt5022;
		this.anInt5023 = this.anInt5025;
		this.anInt5026 = 0;
		this.anInt5027 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
	public void method3980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt5028;
		@Pc(5) int local5 = this.anInt5023;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt5022;
		@Pc(15) int local15 = this.anInt5025;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt5026 > 0) {
			local41 = ((this.anInt5026 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt5026 << 16);
		}
		if (this.anInt5027 > 0) {
			local41 = ((this.anInt5027 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt5027 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static258.anInt5069;
		@Pc(125) int local125 = Static258.anInt5069 - arg2;
		if (arg1 + arg3 > Static258.anInt5068) {
			arg3 -= arg1 + arg3 - Static258.anInt5068;
		}
		@Pc(145) int local145;
		if (arg1 < Static258.anInt5065) {
			local145 = Static258.anInt5065 - arg1;
			arg3 -= local145;
			local41 += local145 * Static258.anInt5069;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static258.anInt5066) {
			local145 = arg0 + arg2 - Static258.anInt5066;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static258.anInt5067) {
			local145 = Static258.anInt5067 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static318.method3981(Static258.anIntArray399, this.aByteArray59, this.anIntArray395, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public void method3982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = this.anInt5028;
		@Pc(5) int local5 = this.anInt5023;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt5022;
		@Pc(15) int local15 = this.anInt5025;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt5026 > 0) {
			local41 = ((this.anInt5026 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt5026 << 16);
		}
		if (this.anInt5027 > 0) {
			local41 = ((this.anInt5027 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt5027 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static258.anInt5069;
		@Pc(125) int local125 = Static258.anInt5069 - arg2;
		if (arg1 + arg3 > Static258.anInt5068) {
			arg3 -= arg1 + arg3 - Static258.anInt5068;
		}
		@Pc(145) int local145;
		if (arg1 < Static258.anInt5065) {
			local145 = Static258.anInt5065 - arg1;
			arg3 -= local145;
			local41 += local145 * Static258.anInt5069;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static258.anInt5066) {
			local145 = arg0 + arg2 - Static258.anInt5066;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static258.anInt5067) {
			local145 = Static258.anInt5067 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static318.method3975(Static258.anIntArray399, this.aByteArray59, this.anIntArray395, local7, local9, local41, local125, arg2, arg3, local21, local27, local2, arg4);
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
	public void method3983() {
		@Pc(6) byte[] local6 = new byte[this.anInt5028 * this.anInt5023];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt5028; local10++) {
			for (@Pc(19) int local19 = this.anInt5023 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.aByteArray59[local10 + local19 * this.anInt5028];
			}
		}
		this.aByteArray59 = local6;
		local10 = this.anInt5027;
		this.anInt5027 = this.anInt5026;
		this.anInt5026 = this.anInt5025 - this.anInt5023 - local10;
		local10 = this.anInt5023;
		this.anInt5023 = this.anInt5028;
		this.anInt5028 = local10;
		local10 = this.anInt5025;
		this.anInt5025 = this.anInt5022;
		this.anInt5022 = local10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	@Override
	public void method3969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt5026;
		arg1 += this.anInt5027;
		@Pc(15) int local15 = arg0 + arg1 * Static258.anInt5069;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt5023;
		@Pc(23) int local23 = this.anInt5028;
		@Pc(27) int local27 = Static258.anInt5069 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static258.anInt5065) {
			local36 = Static258.anInt5065 - arg1;
			local20 -= local36;
			arg1 = Static258.anInt5065;
			local17 = local36 * local23;
			local15 += local36 * Static258.anInt5069;
		}
		if (arg1 + local20 > Static258.anInt5068) {
			local20 -= arg1 + local20 - Static258.anInt5068;
		}
		if (arg0 < Static258.anInt5067) {
			local36 = Static258.anInt5067 - arg0;
			local23 -= local36;
			arg0 = Static258.anInt5067;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static258.anInt5066) {
			local36 = arg0 + local23 - Static258.anInt5066;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static318.method3976(Static258.anIntArray399, this.aByteArray59, this.anIntArray395, local17, local15, local23, local20, local27, local29, arg2);
		}
	}
}
