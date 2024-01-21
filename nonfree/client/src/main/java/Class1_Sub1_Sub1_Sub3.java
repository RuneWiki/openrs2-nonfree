import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
	public int anInt3502;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
	public int anInt3503;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
	public int anInt3504;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
	public int anInt3505;

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
	public int anInt3506;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
	public int anInt3507;

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "()V")
	public void method2613() {
		if (this.anInt3504 == this.anInt3505 && this.anInt3507 == this.anInt3503) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt3505 * this.anInt3503];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt3507; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt3504; local24++) {
				local17[local24 + this.anInt3506 + (local21 + this.anInt3502) * this.anInt3505] = this.aByteArray42[local19++];
			}
		}
		this.aByteArray42 = local17;
		this.anInt3504 = this.anInt3505;
		this.anInt3507 = this.anInt3503;
		this.anInt3506 = 0;
		this.anInt3502 = 0;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
	public void method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray334.length; local1++) {
			@Pc(11) int local11 = this.anIntArray334[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray334[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray334[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray334[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)V")
	public void method2616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt3506;
		arg1 += this.anInt3502;
		@Pc(15) int local15 = arg0 + arg1 * Static155.anInt3963;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3507;
		@Pc(23) int local23 = this.anInt3504;
		@Pc(27) int local27 = Static155.anInt3963 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static155.anInt3965) {
			local36 = Static155.anInt3965 - arg1;
			local20 -= local36;
			arg1 = Static155.anInt3965;
			local17 = local36 * local23;
			local15 += local36 * Static155.anInt3963;
		}
		if (arg1 + local20 > Static155.anInt3961) {
			local20 -= arg1 + local20 - Static155.anInt3961;
		}
		if (arg0 < Static155.anInt3962) {
			local36 = Static155.anInt3962 - arg0;
			local23 -= local36;
			arg0 = Static155.anInt3962;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static155.anInt3966) {
			local36 = arg0 + local23 - Static155.anInt3966;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static189.method2617(Static155.anIntArray373, this.aByteArray42, this.anIntArray334, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V")
	public void method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3506;
		arg1 += this.anInt3502;
		@Pc(15) int local15 = arg0 + arg1 * Static155.anInt3963;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3507;
		@Pc(23) int local23 = this.anInt3504;
		@Pc(27) int local27 = Static155.anInt3963 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static155.anInt3965) {
			local36 = Static155.anInt3965 - arg1;
			local20 -= local36;
			arg1 = Static155.anInt3965;
			local17 = local36 * local23;
			local15 += local36 * Static155.anInt3963;
		}
		if (arg1 + local20 > Static155.anInt3961) {
			local20 -= arg1 + local20 - Static155.anInt3961;
		}
		if (arg0 < Static155.anInt3962) {
			local36 = Static155.anInt3962 - arg0;
			local23 -= local36;
			arg0 = Static155.anInt3962;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static155.anInt3966) {
			local36 = arg0 + local23 - Static155.anInt3966;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static189.method2615(Static155.anIntArray373, this.aByteArray42, this.anIntArray334, local17, local15, local23, local20, local27, local29);
		}
	}
}
