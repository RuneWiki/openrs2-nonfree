import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class1_Sub3_Sub1_Sub5 extends Class1_Sub3_Sub1 {

	@OriginalMember(owner = "client!va", name = "S", descriptor = "I")
	public int anInt4203;

	@OriginalMember(owner = "client!va", name = "T", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!va", name = "U", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	public int anInt4204;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "I")
	public int anInt4205;

	@OriginalMember(owner = "client!va", name = "X", descriptor = "I")
	public int anInt4206;

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
	public int anInt4207;

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
	public int anInt4208;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V")
	public void method3178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray335.length; local1++) {
			@Pc(11) int local11 = this.anIntArray335[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray335[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray335[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray335[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "()V")
	public void method3179() {
		if (this.anInt4204 == this.anInt4206 && this.anInt4208 == this.anInt4207) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt4206 * this.anInt4207];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt4208; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt4204; local24++) {
				local17[local24 + this.anInt4205 + (local21 + this.anInt4203) * this.anInt4206] = this.aByteArray50[local19++];
			}
		}
		this.aByteArray50 = local17;
		this.anInt4204 = this.anInt4206;
		this.anInt4208 = this.anInt4207;
		this.anInt4205 = 0;
		this.anInt4203 = 0;
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(IIII)V")
	public void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt4204;
		@Pc(5) int local5 = this.anInt4208;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt4206;
		@Pc(15) int local15 = this.anInt4207;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt4205 > 0) {
			local41 = ((this.anInt4205 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt4205 << 16);
		}
		if (this.anInt4203 > 0) {
			local41 = ((this.anInt4203 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt4203 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static46.anInt4199;
		@Pc(125) int local125 = Static46.anInt4199 - arg2;
		if (arg1 + arg3 > Static46.anInt4200) {
			arg3 -= arg1 + arg3 - Static46.anInt4200;
		}
		@Pc(145) int local145;
		if (arg1 < Static46.anInt4197) {
			local145 = Static46.anInt4197 - arg1;
			arg3 -= local145;
			local41 += local145 * Static46.anInt4199;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static46.anInt4201) {
			local145 = arg0 + arg2 - Static46.anInt4201;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static46.anInt4202) {
			local145 = Static46.anInt4202 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static218.method3184(Static46.anIntArray334, this.aByteArray50, this.anIntArray335, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public void method3183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt4205;
		arg1 += this.anInt4203;
		@Pc(15) int local15 = arg0 + arg1 * Static46.anInt4199;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt4208;
		@Pc(23) int local23 = this.anInt4204;
		@Pc(27) int local27 = Static46.anInt4199 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static46.anInt4197) {
			local36 = Static46.anInt4197 - arg1;
			local20 -= local36;
			arg1 = Static46.anInt4197;
			local17 = local36 * local23;
			local15 += local36 * Static46.anInt4199;
		}
		if (arg1 + local20 > Static46.anInt4200) {
			local20 -= arg1 + local20 - Static46.anInt4200;
		}
		if (arg0 < Static46.anInt4202) {
			local36 = Static46.anInt4202 - arg0;
			local23 -= local36;
			arg0 = Static46.anInt4202;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static46.anInt4201) {
			local36 = arg0 + local23 - Static46.anInt4201;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static218.method3182(Static46.anIntArray334, this.aByteArray50, this.anIntArray335, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(III)V")
	public void method3185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt4205;
		arg1 += this.anInt4203;
		@Pc(15) int local15 = arg0 + arg1 * Static46.anInt4199;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt4208;
		@Pc(23) int local23 = this.anInt4204;
		@Pc(27) int local27 = Static46.anInt4199 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static46.anInt4197) {
			local36 = Static46.anInt4197 - arg1;
			local20 -= local36;
			arg1 = Static46.anInt4197;
			local17 = local36 * local23;
			local15 += local36 * Static46.anInt4199;
		}
		if (arg1 + local20 > Static46.anInt4200) {
			local20 -= arg1 + local20 - Static46.anInt4200;
		}
		if (arg0 < Static46.anInt4202) {
			local36 = Static46.anInt4202 - arg0;
			local23 -= local36;
			arg0 = Static46.anInt4202;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static46.anInt4201) {
			local36 = arg0 + local23 - Static46.anInt4201;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static218.method3181(Static46.anIntArray334, this.aByteArray50, this.anIntArray335, local17, local15, local23, local20, local27, local29, arg2);
		}
	}
}
