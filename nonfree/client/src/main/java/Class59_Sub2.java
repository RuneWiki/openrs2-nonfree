import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class59_Sub2 extends Class59 {

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIII[B[I)V")
	public Class59_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7) {
		this.anInt4747 = arg0;
		this.anInt4749 = arg1;
		this.anInt4752 = arg2;
		this.anInt4755 = arg3;
		this.anInt4748 = arg4;
		this.anInt4753 = arg5;
		this.aByteArray65 = arg6;
		this.anIntArray432 = arg7;
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(III)V")
	public Class59_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4747 = this.anInt4748 = arg0;
		this.anInt4749 = this.anInt4753 = arg1;
		this.anInt4752 = this.anInt4755 = 0;
		this.aByteArray65 = new byte[arg0 * arg1];
		this.anIntArray432 = new int[arg2];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
	public void method3793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt4748;
		@Pc(5) int local5 = this.anInt4753;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt4747;
		@Pc(15) int local15 = this.anInt4749;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt4752 > 0) {
			local41 = ((this.anInt4752 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt4752 << 16);
		}
		if (this.anInt4755 > 0) {
			local41 = ((this.anInt4755 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt4755 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static166.anInt3305;
		@Pc(125) int local125 = Static166.anInt3305 - arg2;
		if (arg1 + arg3 > Static166.anInt3304) {
			arg3 -= arg1 + arg3 - Static166.anInt3304;
		}
		@Pc(145) int local145;
		if (arg1 < Static166.anInt3303) {
			local145 = Static166.anInt3303 - arg1;
			arg3 -= local145;
			local41 += local145 * Static166.anInt3305;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static166.anInt3306) {
			local145 = arg0 + arg2 - Static166.anInt3306;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static166.anInt3302) {
			local145 = Static166.anInt3302 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static309.method3802(Static166.anIntArray293, this.aByteArray65, this.anIntArray432, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
	public void method3795() {
		@Pc(6) byte[] local6 = new byte[this.anInt4748 * this.anInt4753];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt4748; local10++) {
			for (@Pc(19) int local19 = this.anInt4753 - 1; local19 >= 0; local19--) {
				local6[local8++] = this.aByteArray65[local10 + local19 * this.anInt4748];
			}
		}
		this.aByteArray65 = local6;
		local10 = this.anInt4755;
		this.anInt4755 = this.anInt4752;
		this.anInt4752 = this.anInt4749 - this.anInt4753 - local10;
		local10 = this.anInt4753;
		this.anInt4753 = this.anInt4748;
		this.anInt4748 = local10;
		local10 = this.anInt4749;
		this.anInt4749 = this.anInt4747;
		this.anInt4747 = local10;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "()V")
	public void method3796() {
		if (this.anInt4748 == this.anInt4747 && this.anInt4753 == this.anInt4749) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt4747 * this.anInt4749];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt4753; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt4748; local27++) {
				local17[local27 + this.anInt4752 + (local21 + this.anInt4755) * this.anInt4747] = this.aByteArray65[local19++];
			}
		}
		this.aByteArray65 = local17;
		this.anInt4748 = this.anInt4747;
		this.anInt4753 = this.anInt4749;
		this.anInt4752 = 0;
		this.anInt4755 = 0;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
	public void method3797() {
		@Pc(6) byte[] local6 = new byte[this.anInt4748 * this.anInt4753];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt4753 - 1; local13 >= 0; local13--) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt4748; local17++) {
				local6[local8++] = this.aByteArray65[local17 + local13 * this.anInt4748];
			}
		}
		this.aByteArray65 = local6;
		this.anInt4755 = this.anInt4749 - this.anInt4753 - this.anInt4755;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
	@Override
	public void method3792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt4752;
		arg1 += this.anInt4755;
		@Pc(15) int local15 = arg0 + arg1 * Static166.anInt3305;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt4753;
		@Pc(23) int local23 = this.anInt4748;
		@Pc(27) int local27 = Static166.anInt3305 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static166.anInt3303) {
			local36 = Static166.anInt3303 - arg1;
			local20 -= local36;
			arg1 = Static166.anInt3303;
			local17 = local36 * local23;
			local15 += local36 * Static166.anInt3305;
		}
		if (arg1 + local20 > Static166.anInt3304) {
			local20 -= arg1 + local20 - Static166.anInt3304;
		}
		if (arg0 < Static166.anInt3302) {
			local36 = Static166.anInt3302 - arg0;
			local23 -= local36;
			arg0 = Static166.anInt3302;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static166.anInt3306) {
			local36 = arg0 + local23 - Static166.anInt3306;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static309.method3794(Static166.anIntArray293, this.aByteArray65, this.anIntArray432, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "()V")
	public void method3798() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = this.aByteArray65.length - 7;
		while (local1 < local7) {
			this.aByteArray65[local1++] = 0;
			this.aByteArray65[local1++] = 0;
			this.aByteArray65[local1++] = 0;
			this.aByteArray65[local1++] = 0;
			this.aByteArray65[local1++] = 0;
			this.aByteArray65[local1++] = 0;
			this.aByteArray65[local1++] = 0;
			this.aByteArray65[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			this.aByteArray65[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
	public void method3800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray432.length; local1++) {
			@Pc(15) int local15 = this.anIntArray432[local1] >> 16 & 0xFF;
			local15 += arg0;
			if (local15 < 0) {
				local15 = 0;
			} else if (local15 > 255) {
				local15 = 255;
			}
			@Pc(38) int local38 = this.anIntArray432[local1] >> 8 & 0xFF;
			local38 += arg1;
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			@Pc(59) int local59 = this.anIntArray432[local1] & 0xFF;
			local59 += arg2;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 > 255) {
				local59 = 255;
			}
			this.anIntArray432[local1] = (local15 << 16) + (local38 << 8) + local59;
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
	@Override
	public void method3790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt4752;
		arg1 += this.anInt4755;
		@Pc(15) int local15 = arg0 + arg1 * Static166.anInt3305;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt4753;
		@Pc(23) int local23 = this.anInt4748;
		@Pc(27) int local27 = Static166.anInt3305 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static166.anInt3303) {
			local36 = Static166.anInt3303 - arg1;
			local20 -= local36;
			arg1 = Static166.anInt3303;
			local17 = local36 * local23;
			local15 += local36 * Static166.anInt3305;
		}
		if (arg1 + local20 > Static166.anInt3304) {
			local20 -= arg1 + local20 - Static166.anInt3304;
		}
		if (arg0 < Static166.anInt3302) {
			local36 = Static166.anInt3302 - arg0;
			local23 -= local36;
			arg0 = Static166.anInt3302;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static166.anInt3306) {
			local36 = arg0 + local23 - Static166.anInt3306;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static309.method3799(Static166.anIntArray293, this.aByteArray65, this.anIntArray432, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
	public void method3801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = this.anInt4748;
		@Pc(5) int local5 = this.anInt4753;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt4747;
		@Pc(15) int local15 = this.anInt4749;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt4752 > 0) {
			local41 = ((this.anInt4752 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt4752 << 16);
		}
		if (this.anInt4755 > 0) {
			local41 = ((this.anInt4755 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt4755 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static166.anInt3305;
		@Pc(125) int local125 = Static166.anInt3305 - arg2;
		if (arg1 + arg3 > Static166.anInt3304) {
			arg3 -= arg1 + arg3 - Static166.anInt3304;
		}
		@Pc(145) int local145;
		if (arg1 < Static166.anInt3303) {
			local145 = Static166.anInt3303 - arg1;
			arg3 -= local145;
			local41 += local145 * Static166.anInt3305;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static166.anInt3306) {
			local145 = arg0 + arg2 - Static166.anInt3306;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static166.anInt3302) {
			local145 = Static166.anInt3302 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static309.method3803(Static166.anIntArray293, this.aByteArray65, this.anIntArray432, local7, local9, local41, local125, arg2, arg3, local21, local27, local2, arg4);
	}
}
