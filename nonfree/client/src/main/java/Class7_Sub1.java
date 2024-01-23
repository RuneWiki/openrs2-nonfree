import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt5424 = arg0;
		this.anInt5425 = arg1;
		this.anInt5429 = arg2;
		this.anInt5426 = arg3;
		this.anInt5432 = arg4;
		this.anInt5433 = arg5;
		this.aByteArray1 = arg6;
		this.anIntArray6 = arg7;
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(III)V")
	public Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5424 = this.anInt5432 = arg0;
		this.anInt5425 = this.anInt5433 = arg1;
		this.anInt5429 = this.anInt5426 = 0;
		this.aByteArray1 = new byte[arg0 * arg1];
		this.anIntArray6 = new int[arg2];
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
	public void method123() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = this.aByteArray1.length - 7;
		while (local1 < local7) {
			this.aByteArray1[local1++] = 0;
			this.aByteArray1[local1++] = 0;
			this.aByteArray1[local1++] = 0;
			this.aByteArray1[local1++] = 0;
			this.aByteArray1[local1++] = 0;
			this.aByteArray1[local1++] = 0;
			this.aByteArray1[local1++] = 0;
			this.aByteArray1[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			this.aByteArray1[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
	public void method124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray6.length; local1++) {
			@Pc(15) int local15 = this.anIntArray6[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray6[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(59) int local59 = this.anIntArray6[local1] & 0xFF;
			local59 += arg2;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			this.anIntArray6[local1] = (local15 << 16) + (local38 << 8) + local59;
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()V")
	public void method126() {
		if (this.anInt5432 == this.anInt5424 && this.anInt5433 == this.anInt5425) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt5424 * this.anInt5425];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt5433; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt5432; local27++) {
				local17[local27 + this.anInt5429 + (local21 + this.anInt5426) * this.anInt5424] = this.aByteArray1[local19++];
			}
		}
		this.aByteArray1 = local17;
		this.anInt5432 = this.anInt5424;
		this.anInt5433 = this.anInt5425;
		this.anInt5429 = 0;
		this.anInt5426 = 0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	@Override
	public void method4258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt5429;
		arg1 += this.anInt5426;
		@Pc(15) int local15 = arg0 + arg1 * Static203.anInt4507;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt5433;
		@Pc(23) int local23 = this.anInt5432;
		@Pc(27) int local27 = Static203.anInt4507 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static203.anInt4509) {
			local36 = Static203.anInt4509 - arg1;
			local20 -= local36;
			arg1 = Static203.anInt4509;
			local17 = local36 * local23;
			local15 += local36 * Static203.anInt4507;
		}
		if (arg1 + local20 > Static203.anInt4506) {
			local20 -= arg1 + local20 - Static203.anInt4506;
		}
		if (arg0 < Static203.anInt4508) {
			local36 = Static203.anInt4508 - arg0;
			local23 -= local36;
			arg0 = Static203.anInt4508;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static203.anInt4510) {
			local36 = arg0 + local23 - Static203.anInt4510;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static300.method130(Static203.anIntArray460, this.aByteArray1, this.anIntArray6, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	@Override
	public void method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt5429;
		arg1 += this.anInt5426;
		@Pc(15) int local15 = arg0 + arg1 * Static203.anInt4507;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt5433;
		@Pc(23) int local23 = this.anInt5432;
		@Pc(27) int local27 = Static203.anInt4507 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static203.anInt4509) {
			local36 = Static203.anInt4509 - arg1;
			local20 -= local36;
			arg1 = Static203.anInt4509;
			local17 = local36 * local23;
			local15 += local36 * Static203.anInt4507;
		}
		if (arg1 + local20 > Static203.anInt4506) {
			local20 -= arg1 + local20 - Static203.anInt4506;
		}
		if (arg0 < Static203.anInt4508) {
			local36 = Static203.anInt4508 - arg0;
			local23 -= local36;
			arg0 = Static203.anInt4508;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static203.anInt4510) {
			local36 = arg0 + local23 - Static203.anInt4510;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static300.method132(Static203.anIntArray460, this.aByteArray1, this.anIntArray6, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()V")
	public void method127() {
		@Pc(6) byte[] local6 = new byte[this.anInt5432 * this.anInt5433];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt5432; local10++) {
			for (@Pc(19) int local19 = this.anInt5433 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.aByteArray1[local10 + local19 * this.anInt5432];
			}
		}
		this.aByteArray1 = local6;
		local10 = this.anInt5426;
		this.anInt5426 = this.anInt5429;
		this.anInt5429 = this.anInt5425 - this.anInt5433 - local10;
		local10 = this.anInt5433;
		this.anInt5433 = this.anInt5432;
		this.anInt5432 = local10;
		local10 = this.anInt5425;
		this.anInt5425 = this.anInt5424;
		this.anInt5424 = local10;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
	public void method128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = this.anInt5432;
		@Pc(5) int local5 = this.anInt5433;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt5424;
		@Pc(15) int local15 = this.anInt5425;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt5429 > 0) {
			local41 = ((this.anInt5429 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt5429 << 16);
		}
		if (this.anInt5426 > 0) {
			local41 = ((this.anInt5426 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt5426 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static203.anInt4507;
		@Pc(125) int local125 = Static203.anInt4507 - arg2;
		if (arg1 + arg3 > Static203.anInt4506) {
			arg3 -= arg1 + arg3 - Static203.anInt4506;
		}
		@Pc(145) int local145;
		if (arg1 < Static203.anInt4509) {
			local145 = Static203.anInt4509 - arg1;
			arg3 -= local145;
			local41 += local145 * Static203.anInt4507;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static203.anInt4510) {
			local145 = arg0 + arg2 - Static203.anInt4510;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static203.anInt4508) {
			local145 = Static203.anInt4508 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static300.method125(Static203.anIntArray460, this.aByteArray1, this.anIntArray6, local7, local9, local41, local125, arg2, arg3, local21, local27, local2, arg4);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIII)V")
	public void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt5432;
		@Pc(5) int local5 = this.anInt5433;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt5424;
		@Pc(15) int local15 = this.anInt5425;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt5429 > 0) {
			local41 = ((this.anInt5429 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt5429 << 16);
		}
		if (this.anInt5426 > 0) {
			local41 = ((this.anInt5426 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt5426 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static203.anInt4507;
		@Pc(125) int local125 = Static203.anInt4507 - arg2;
		if (arg1 + arg3 > Static203.anInt4506) {
			arg3 -= arg1 + arg3 - Static203.anInt4506;
		}
		@Pc(145) int local145;
		if (arg1 < Static203.anInt4509) {
			local145 = Static203.anInt4509 - arg1;
			arg3 -= local145;
			local41 += local145 * Static203.anInt4507;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static203.anInt4510) {
			local145 = arg0 + arg2 - Static203.anInt4510;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static203.anInt4508) {
			local145 = Static203.anInt4508 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static300.method122(Static203.anIntArray460, this.aByteArray1, this.anIntArray6, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "()V")
	public void method131() {
		@Pc(6) byte[] local6 = new byte[this.anInt5432 * this.anInt5433];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt5433 - 1; local13 >= 0; local13--) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt5432; local17++) {
				local6[local8++] = this.aByteArray1[local17 + local13 * this.anInt5432];
			}
		}
		this.aByteArray1 = local6;
		this.anInt5426 = this.anInt5425 - this.anInt5433 - this.anInt5426;
	}
}
