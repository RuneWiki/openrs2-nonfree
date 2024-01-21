import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class1_Sub2_Sub1_Sub4 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
	public int anInt515;

	@OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
	public int anInt516;

	@OriginalMember(owner = "client!bg", name = "T", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V")
	public void method568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt511;
		arg1 += this.anInt516;
		@Pc(15) int local15 = arg0 + arg1 * Static128.anInt509;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt512;
		@Pc(23) int local23 = this.anInt514;
		@Pc(27) int local27 = Static128.anInt509 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static128.anInt507) {
			local36 = Static128.anInt507 - arg1;
			local20 -= local36;
			arg1 = Static128.anInt507;
			local17 = local36 * local23;
			local15 += local36 * Static128.anInt509;
		}
		if (arg1 + local20 > Static128.anInt510) {
			local20 -= arg1 + local20 - Static128.anInt510;
		}
		if (arg0 < Static128.anInt508) {
			local36 = Static128.anInt508 - arg0;
			local23 -= local36;
			arg0 = Static128.anInt508;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static128.anInt506) {
			local36 = arg0 + local23 - Static128.anInt506;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static189.method569(Static128.anIntArray75, this.aByteArray17, this.anIntArray76, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
	public void method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt511;
		arg1 += this.anInt516;
		@Pc(15) int local15 = arg0 + arg1 * Static128.anInt509;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt512;
		@Pc(23) int local23 = this.anInt514;
		@Pc(27) int local27 = Static128.anInt509 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static128.anInt507) {
			local36 = Static128.anInt507 - arg1;
			local20 -= local36;
			arg1 = Static128.anInt507;
			local17 = local36 * local23;
			local15 += local36 * Static128.anInt509;
		}
		if (arg1 + local20 > Static128.anInt510) {
			local20 -= arg1 + local20 - Static128.anInt510;
		}
		if (arg0 < Static128.anInt508) {
			local36 = Static128.anInt508 - arg0;
			local23 -= local36;
			arg0 = Static128.anInt508;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static128.anInt506) {
			local36 = arg0 + local23 - Static128.anInt506;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static189.method571(Static128.anIntArray75, this.aByteArray17, this.anIntArray76, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "()V")
	public void method572() {
		if (this.anInt514 == this.anInt513 && this.anInt512 == this.anInt515) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt513 * this.anInt515];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt512; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt514; local24++) {
				local17[local24 + this.anInt511 + (local21 + this.anInt516) * this.anInt513] = this.aByteArray17[local19++];
			}
		}
		this.aByteArray17 = local17;
		this.anInt514 = this.anInt513;
		this.anInt512 = this.anInt515;
		this.anInt511 = 0;
		this.anInt516 = 0;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(III)V")
	public void method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray76.length; local1++) {
			@Pc(11) int local11 = this.anIntArray76[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray76[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray76[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray76[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
