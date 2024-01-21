import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class3_Sub1_Sub4_Sub1 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
	public int anInt817;

	@OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!dh", name = "T", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!dh", name = "U", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
	public int anInt819;

	@OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
	public int anInt820;

	@OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
	public int anInt821;

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
	public void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt817;
		arg1 += this.anInt821;
		@Pc(15) int local15 = arg0 + arg1 * Static24.anInt3596;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt818;
		@Pc(23) int local23 = this.anInt819;
		@Pc(27) int local27 = Static24.anInt3596 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static24.anInt3594) {
			local36 = Static24.anInt3594 - arg1;
			local20 -= local36;
			arg1 = Static24.anInt3594;
			local17 = local36 * local23;
			local15 += local36 * Static24.anInt3596;
		}
		if (arg1 + local20 > Static24.anInt3595) {
			local20 -= arg1 + local20 - Static24.anInt3595;
		}
		if (arg0 < Static24.anInt3593) {
			local36 = Static24.anInt3593 - arg0;
			local23 -= local36;
			arg0 = Static24.anInt3593;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static24.anInt3592) {
			local36 = arg0 + local23 - Static24.anInt3592;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static199.method564(Static24.anIntArray448, this.aByteArray2, this.anIntArray108, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "()V")
	public void method566() {
		if (this.anInt819 == this.anInt820 && this.anInt818 == this.anInt822) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt820 * this.anInt822];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt818; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt819; local24++) {
				local17[local24 + this.anInt817 + (local21 + this.anInt821) * this.anInt820] = this.aByteArray2[local19++];
			}
		}
		this.aByteArray2 = local17;
		this.anInt819 = this.anInt820;
		this.anInt818 = this.anInt822;
		this.anInt817 = 0;
		this.anInt821 = 0;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)V")
	public void method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt817;
		arg1 += this.anInt821;
		@Pc(15) int local15 = arg0 + arg1 * Static24.anInt3596;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt818;
		@Pc(23) int local23 = this.anInt819;
		@Pc(27) int local27 = Static24.anInt3596 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static24.anInt3594) {
			local36 = Static24.anInt3594 - arg1;
			local20 -= local36;
			arg1 = Static24.anInt3594;
			local17 = local36 * local23;
			local15 += local36 * Static24.anInt3596;
		}
		if (arg1 + local20 > Static24.anInt3595) {
			local20 -= arg1 + local20 - Static24.anInt3595;
		}
		if (arg0 < Static24.anInt3593) {
			local36 = Static24.anInt3593 - arg0;
			local23 -= local36;
			arg0 = Static24.anInt3593;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static24.anInt3592) {
			local36 = arg0 + local23 - Static24.anInt3592;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static199.method565(Static24.anIntArray448, this.aByteArray2, this.anIntArray108, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(III)V")
	public void method568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray108.length; local1++) {
			@Pc(11) int local11 = this.anIntArray108[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray108[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray108[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray108[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
