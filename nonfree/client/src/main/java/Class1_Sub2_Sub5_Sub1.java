import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class1_Sub2_Sub5_Sub1 extends Class1_Sub2_Sub5 {

	@OriginalMember(owner = "client!cg", name = "R", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
	public int anInt845;

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!cg", name = "V", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
	public int anInt849;

	@OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
	public int anInt850;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)V")
	public void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray82.length; local1++) {
			@Pc(11) int local11 = this.anIntArray82[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray82[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray82[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray82[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(IIII)V")
	public void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt848;
		@Pc(5) int local5 = this.anInt849;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt850;
		@Pc(15) int local15 = this.anInt845;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt847 > 0) {
			local41 = ((this.anInt847 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt847 << 16);
		}
		if (this.anInt846 > 0) {
			local41 = ((this.anInt846 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt846 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static194.anInt4131;
		@Pc(125) int local125 = Static194.anInt4131 - arg2;
		if (arg1 + arg3 > Static194.anInt4133) {
			arg3 -= arg1 + arg3 - Static194.anInt4133;
		}
		@Pc(145) int local145;
		if (arg1 < Static194.anInt4132) {
			local145 = Static194.anInt4132 - arg1;
			arg3 -= local145;
			local41 += local145 * Static194.anInt4131;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static194.anInt4130) {
			local145 = arg0 + arg2 - Static194.anInt4130;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static194.anInt4134) {
			local145 = Static194.anInt4134 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static211.method552(Static194.anIntArray468, this.aByteArray11, this.anIntArray82, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)V")
	public void method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt847;
		arg1 += this.anInt846;
		@Pc(15) int local15 = arg0 + arg1 * Static194.anInt4131;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt849;
		@Pc(23) int local23 = this.anInt848;
		@Pc(27) int local27 = Static194.anInt4131 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static194.anInt4132) {
			local36 = Static194.anInt4132 - arg1;
			local20 -= local36;
			arg1 = Static194.anInt4132;
			local17 = local36 * local23;
			local15 += local36 * Static194.anInt4131;
		}
		if (arg1 + local20 > Static194.anInt4133) {
			local20 -= arg1 + local20 - Static194.anInt4133;
		}
		if (arg0 < Static194.anInt4134) {
			local36 = Static194.anInt4134 - arg0;
			local23 -= local36;
			arg0 = Static194.anInt4134;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static194.anInt4130) {
			local36 = arg0 + local23 - Static194.anInt4130;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static211.method557(Static194.anIntArray468, this.aByteArray11, this.anIntArray82, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V")
	public void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt847;
		arg1 += this.anInt846;
		@Pc(15) int local15 = arg0 + arg1 * Static194.anInt4131;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt849;
		@Pc(23) int local23 = this.anInt848;
		@Pc(27) int local27 = Static194.anInt4131 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static194.anInt4132) {
			local36 = Static194.anInt4132 - arg1;
			local20 -= local36;
			arg1 = Static194.anInt4132;
			local17 = local36 * local23;
			local15 += local36 * Static194.anInt4131;
		}
		if (arg1 + local20 > Static194.anInt4133) {
			local20 -= arg1 + local20 - Static194.anInt4133;
		}
		if (arg0 < Static194.anInt4134) {
			local36 = Static194.anInt4134 - arg0;
			local23 -= local36;
			arg0 = Static194.anInt4134;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static194.anInt4130) {
			local36 = arg0 + local23 - Static194.anInt4130;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static211.method556(Static194.anIntArray468, this.aByteArray11, this.anIntArray82, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "()V")
	public void method559() {
		if (this.anInt848 == this.anInt850 && this.anInt849 == this.anInt845) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt850 * this.anInt845];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt849; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt848; local24++) {
				local17[local24 + this.anInt847 + (local21 + this.anInt846) * this.anInt850] = this.aByteArray11[local19++];
			}
		}
		this.aByteArray11 = local17;
		this.anInt848 = this.anInt850;
		this.anInt849 = this.anInt845;
		this.anInt847 = 0;
		this.anInt846 = 0;
	}
}
