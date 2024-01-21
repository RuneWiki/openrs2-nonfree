import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class3_Sub3_Sub2_Sub2 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
	public int anInt3216;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
	public int anInt3217;

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
	public int anInt3218;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
	public int anInt3219;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
	public int anInt3220;

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
	public int anInt3221;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
	public void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray235.length; local1++) {
			@Pc(11) int local11 = this.anIntArray235[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray235[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray235[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray235[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(IIII)V")
	public void method2330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = this.anInt3220;
		@Pc(5) int local5 = this.anInt3216;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = this.anInt3217;
		@Pc(15) int local15 = this.anInt3221;
		@Pc(21) int local21 = (local12 << 16) / arg2;
		@Pc(27) int local27 = (local15 << 16) / arg3;
		@Pc(41) int local41;
		if (this.anInt3219 > 0) {
			local41 = ((this.anInt3219 << 16) + local21 - 1) / local21;
			arg0 += local41;
			local7 = local41 * local21 - (this.anInt3219 << 16);
		}
		if (this.anInt3218 > 0) {
			local41 = ((this.anInt3218 << 16) + local27 - 1) / local27;
			arg1 += local41;
			local9 = local41 * local27 - (this.anInt3218 << 16);
		}
		if (local2 < local12) {
			arg2 = ((local2 << 16) + local21 - local7 - 1) / local21;
		}
		if (local5 < local15) {
			arg3 = ((local5 << 16) + local27 - local9 - 1) / local27;
		}
		local41 = arg0 + arg1 * Static104.anInt3996;
		@Pc(125) int local125 = Static104.anInt3996 - arg2;
		if (arg1 + arg3 > Static104.anInt3998) {
			arg3 -= arg1 + arg3 - Static104.anInt3998;
		}
		@Pc(145) int local145;
		if (arg1 < Static104.anInt3994) {
			local145 = Static104.anInt3994 - arg1;
			arg3 -= local145;
			local41 += local145 * Static104.anInt3996;
			local9 += local27 * local145;
		}
		if (arg0 + arg2 > Static104.anInt3995) {
			local145 = arg0 + arg2 - Static104.anInt3995;
			arg2 -= local145;
			local125 += local145;
		}
		if (arg0 < Static104.anInt3999) {
			local145 = Static104.anInt3999 - arg0;
			arg2 -= local145;
			local41 += local145;
			local7 += local21 * local145;
			local125 += local145;
		}
		Static219.method2329(Static104.anIntArray347, this.aByteArray32, this.anIntArray235, local7, local9, local41, local125, arg2, arg3, local21, local27, local2);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(III)V")
	public void method2332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt3219;
		arg1 += this.anInt3218;
		@Pc(15) int local15 = arg0 + arg1 * Static104.anInt3996;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3216;
		@Pc(23) int local23 = this.anInt3220;
		@Pc(27) int local27 = Static104.anInt3996 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static104.anInt3994) {
			local36 = Static104.anInt3994 - arg1;
			local20 -= local36;
			arg1 = Static104.anInt3994;
			local17 = local36 * local23;
			local15 += local36 * Static104.anInt3996;
		}
		if (arg1 + local20 > Static104.anInt3998) {
			local20 -= arg1 + local20 - Static104.anInt3998;
		}
		if (arg0 < Static104.anInt3999) {
			local36 = Static104.anInt3999 - arg0;
			local23 -= local36;
			arg0 = Static104.anInt3999;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static104.anInt3995) {
			local36 = arg0 + local23 - Static104.anInt3995;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static219.method2335(Static104.anIntArray347, this.aByteArray32, this.anIntArray235, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
	public void method2333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3219;
		arg1 += this.anInt3218;
		@Pc(15) int local15 = arg0 + arg1 * Static104.anInt3996;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3216;
		@Pc(23) int local23 = this.anInt3220;
		@Pc(27) int local27 = Static104.anInt3996 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static104.anInt3994) {
			local36 = Static104.anInt3994 - arg1;
			local20 -= local36;
			arg1 = Static104.anInt3994;
			local17 = local36 * local23;
			local15 += local36 * Static104.anInt3996;
		}
		if (arg1 + local20 > Static104.anInt3998) {
			local20 -= arg1 + local20 - Static104.anInt3998;
		}
		if (arg0 < Static104.anInt3999) {
			local36 = Static104.anInt3999 - arg0;
			local23 -= local36;
			arg0 = Static104.anInt3999;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static104.anInt3995) {
			local36 = arg0 + local23 - Static104.anInt3995;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static219.method2331(Static104.anIntArray347, this.aByteArray32, this.anIntArray235, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
	public void method2334() {
		if (this.anInt3220 == this.anInt3217 && this.anInt3216 == this.anInt3221) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt3217 * this.anInt3221];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt3216; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt3220; local24++) {
				local17[local24 + this.anInt3219 + (local21 + this.anInt3218) * this.anInt3217] = this.aByteArray32[local19++];
			}
		}
		this.aByteArray32 = local17;
		this.anInt3220 = this.anInt3217;
		this.anInt3216 = this.anInt3221;
		this.anInt3219 = 0;
		this.anInt3218 = 0;
	}
}
