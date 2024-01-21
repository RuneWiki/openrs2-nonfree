import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class1_Sub2_Sub2_Sub4 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
	public int anInt3358;

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
	public int anInt3359;

	@OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
	public int anInt3360;

	@OriginalMember(owner = "client!sc", name = "K", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
	public int anInt3361;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	public int anInt3362;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
	public int anInt3363;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public void method2581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3362;
		arg1 += this.anInt3363;
		@Pc(15) int local15 = arg0 + arg1 * Static4.anInt3357;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3361;
		@Pc(23) int local23 = this.anInt3358;
		@Pc(27) int local27 = Static4.anInt3357 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static4.anInt3354) {
			local36 = Static4.anInt3354 - arg1;
			local20 -= local36;
			arg1 = Static4.anInt3354;
			local17 = local36 * local23;
			local15 += local36 * Static4.anInt3357;
		}
		if (arg1 + local20 > Static4.anInt3353) {
			local20 -= arg1 + local20 - Static4.anInt3353;
		}
		if (arg0 < Static4.anInt3355) {
			local36 = Static4.anInt3355 - arg0;
			local23 -= local36;
			arg0 = Static4.anInt3355;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static4.anInt3356) {
			local36 = arg0 + local23 - Static4.anInt3356;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static194.method2586(Static4.anIntArray355, this.aByteArray24, this.anIntArray356, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
	public void method2583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray356.length; local1++) {
			@Pc(11) int local11 = this.anIntArray356[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray356[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray356[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray356[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "()V")
	public void method2584() {
		if (this.anInt3358 == this.anInt3360 && this.anInt3361 == this.anInt3359) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt3360 * this.anInt3359];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt3361; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt3358; local24++) {
				local17[local24 + this.anInt3362 + (local21 + this.anInt3363) * this.anInt3360] = this.aByteArray24[local19++];
			}
		}
		this.aByteArray24 = local17;
		this.anInt3358 = this.anInt3360;
		this.anInt3361 = this.anInt3359;
		this.anInt3362 = 0;
		this.anInt3363 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)V")
	public void method2585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt3362;
		arg1 += this.anInt3363;
		@Pc(15) int local15 = arg0 + arg1 * Static4.anInt3357;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3361;
		@Pc(23) int local23 = this.anInt3358;
		@Pc(27) int local27 = Static4.anInt3357 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static4.anInt3354) {
			local36 = Static4.anInt3354 - arg1;
			local20 -= local36;
			arg1 = Static4.anInt3354;
			local17 = local36 * local23;
			local15 += local36 * Static4.anInt3357;
		}
		if (arg1 + local20 > Static4.anInt3353) {
			local20 -= arg1 + local20 - Static4.anInt3353;
		}
		if (arg0 < Static4.anInt3355) {
			local36 = Static4.anInt3355 - arg0;
			local23 -= local36;
			arg0 = Static4.anInt3355;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static4.anInt3356) {
			local36 = arg0 + local23 - Static4.anInt3356;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static194.method2582(Static4.anIntArray355, this.aByteArray24, this.anIntArray356, local17, local15, local23, local20, local27, local29, arg2);
		}
	}
}
