import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class71_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt5770 = arg0;
		this.anInt5769 = arg1;
		this.anInt5763 = arg2;
		this.anInt5764 = arg3;
		this.anInt5766 = arg4;
		this.anInt5767 = arg5;
		this.aByteArray21 = arg6;
		this.anIntArray155 = arg7;
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(III)V")
	public Class71_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5770 = this.anInt5766 = arg0;
		this.anInt5769 = this.anInt5767 = arg1;
		this.anInt5763 = this.anInt5764 = 0;
		this.aByteArray21 = new byte[arg0 * arg1];
		this.anIntArray155 = new int[arg2];
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "()V")
	public void method1853() {
		@Pc(6) byte[] local6 = new byte[this.anInt5766 * this.anInt5767];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt5766; local10++) {
			for (@Pc(19) int local19 = this.anInt5767 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.aByteArray21[local10 + local19 * this.anInt5766];
			}
		}
		this.aByteArray21 = local6;
		local10 = this.anInt5764;
		this.anInt5764 = this.anInt5763;
		this.anInt5763 = this.anInt5769 - this.anInt5767 - local10;
		local10 = this.anInt5767;
		this.anInt5767 = this.anInt5766;
		this.anInt5766 = local10;
		local10 = this.anInt5769;
		this.anInt5769 = this.anInt5770;
		this.anInt5770 = local10;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "()V")
	public void method1854() {
		@Pc(6) byte[] local6 = new byte[this.anInt5766 * this.anInt5767];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt5767 - 1; local13 >= 0; local13--) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt5766; local17++) {
				local6[local8++] = this.aByteArray21[local17 + local13 * this.anInt5766];
			}
		}
		this.aByteArray21 = local6;
		this.anInt5764 = this.anInt5769 - this.anInt5767 - this.anInt5764;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
	@Override
	public void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt5763;
		arg1 += this.anInt5764;
		@Pc(15) int local15 = arg0 + arg1 * Static160.anInt3390;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt5767;
		@Pc(23) int local23 = this.anInt5766;
		@Pc(27) int local27 = Static160.anInt3390 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static160.anInt3391) {
			local36 = Static160.anInt3391 - arg1;
			local20 -= local36;
			arg1 = Static160.anInt3391;
			local17 = local36 * local23;
			local15 += local36 * Static160.anInt3390;
		}
		if (arg1 + local20 > Static160.anInt3392) {
			local20 -= arg1 + local20 - Static160.anInt3392;
		}
		if (arg0 < Static160.anInt3389) {
			local36 = Static160.anInt3389 - arg0;
			local23 -= local36;
			arg0 = Static160.anInt3389;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static160.anInt3387) {
			local36 = arg0 + local23 - Static160.anInt3387;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static307.method1852(Static160.anIntArray254, this.aByteArray21, this.anIntArray155, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)V")
	public void method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray155.length; local1++) {
			@Pc(15) int local15 = this.anIntArray155[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray155[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(59) int local59 = this.anIntArray155[local1] & 0xFF;
			local59 += arg2;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			this.anIntArray155[local1] = (local15 << 16) + (local38 << 8) + local59;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V")
	@Override
	public void method4632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt5763;
		arg1 += this.anInt5764;
		@Pc(15) int local15 = arg0 + arg1 * Static160.anInt3390;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt5767;
		@Pc(23) int local23 = this.anInt5766;
		@Pc(27) int local27 = Static160.anInt3390 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static160.anInt3391) {
			local36 = Static160.anInt3391 - arg1;
			local20 -= local36;
			arg1 = Static160.anInt3391;
			local17 = local36 * local23;
			local15 += local36 * Static160.anInt3390;
		}
		if (arg1 + local20 > Static160.anInt3392) {
			local20 -= arg1 + local20 - Static160.anInt3392;
		}
		if (arg0 < Static160.anInt3389) {
			local36 = Static160.anInt3389 - arg0;
			local23 -= local36;
			arg0 = Static160.anInt3389;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static160.anInt3387) {
			local36 = arg0 + local23 - Static160.anInt3387;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static307.method1855(Static160.anIntArray254, this.aByteArray21, this.anIntArray155, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
	public void method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = this.anInt5766;
		@Pc(5) int local5 = this.anInt5767;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt5770;
		@Pc(15) int local15 = this.anInt5769;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt5763 > 0) {
			local41 = ((this.anInt5763 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt5763 << 16);
		}
		if (this.anInt5764 > 0) {
			local41 = ((this.anInt5764 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt5764 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static160.anInt3390;
		@Pc(125) int local125 = Static160.anInt3390 - arg2;
		if (arg1 + arg3 > Static160.anInt3392) {
			arg3 -= arg1 + arg3 - Static160.anInt3392;
		}
		@Pc(145) int local145;
		if (arg1 < Static160.anInt3391) {
			local145 = Static160.anInt3391 - arg1;
			arg3 -= local145;
			local41 += local145 * Static160.anInt3390;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static160.anInt3387) {
			local145 = arg0 + arg2 - Static160.anInt3387;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static160.anInt3389) {
			local145 = Static160.anInt3389 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static307.method1857(Static160.anIntArray254, this.aByteArray21, this.anIntArray155, local7, local9, local41, local125, arg2, arg3, local21, local27, local2, arg4);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "()V")
	public void method1859() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = this.aByteArray21.length - 7;
		while (local1 < local7) {
			this.aByteArray21[local1++] = 0;
			this.aByteArray21[local1++] = 0;
			this.aByteArray21[local1++] = 0;
			this.aByteArray21[local1++] = 0;
			this.aByteArray21[local1++] = 0;
			this.aByteArray21[local1++] = 0;
			this.aByteArray21[local1++] = 0;
			this.aByteArray21[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			this.aByteArray21[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	public void method1860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt5766;
		@Pc(5) int local5 = this.anInt5767;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt5770;
		@Pc(15) int local15 = this.anInt5769;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt5763 > 0) {
			local41 = ((this.anInt5763 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt5763 << 16);
		}
		if (this.anInt5764 > 0) {
			local41 = ((this.anInt5764 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt5764 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static160.anInt3390;
		@Pc(125) int local125 = Static160.anInt3390 - arg2;
		if (arg1 + arg3 > Static160.anInt3392) {
			arg3 -= arg1 + arg3 - Static160.anInt3392;
		}
		@Pc(145) int local145;
		if (arg1 < Static160.anInt3391) {
			local145 = Static160.anInt3391 - arg1;
			arg3 -= local145;
			local41 += local145 * Static160.anInt3390;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static160.anInt3387) {
			local145 = arg0 + arg2 - Static160.anInt3387;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static160.anInt3389) {
			local145 = Static160.anInt3389 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static307.method1862(Static160.anIntArray254, this.aByteArray21, this.anIntArray155, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "()V")
	public void method1861() {
		if (this.anInt5766 == this.anInt5770 && this.anInt5767 == this.anInt5769) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt5770 * this.anInt5769];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt5767; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt5766; local27++) {
				local17[local27 + this.anInt5763 + (local21 + this.anInt5764) * this.anInt5770] = this.aByteArray21[local19++];
			}
		}
		this.aByteArray21 = local17;
		this.anInt5766 = this.anInt5770;
		this.anInt5767 = this.anInt5769;
		this.anInt5763 = 0;
		this.anInt5764 = 0;
	}
}
