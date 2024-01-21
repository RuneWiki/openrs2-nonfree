import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class2_Sub1_Sub7_Sub2 extends Class2_Sub1_Sub7 {

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
	public int anInt1591;

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
	public int anInt1592;

	@OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
	public int anInt1593;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
	public int anInt1594;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
	public int anInt1595;

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
	public int anInt1596;

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V")
	public void method1201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt1595;
		arg1 += this.anInt1592;
		@Pc(15) int local15 = arg0 + arg1 * Static133.anInt2685;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1594;
		@Pc(23) int local23 = this.anInt1596;
		@Pc(27) int local27 = Static133.anInt2685 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static133.anInt2686) {
			local36 = Static133.anInt2686 - arg1;
			local20 -= local36;
			arg1 = Static133.anInt2686;
			local17 = local36 * local23;
			local15 += local36 * Static133.anInt2685;
		}
		if (arg1 + local20 > Static133.anInt2689) {
			local20 -= arg1 + local20 - Static133.anInt2689;
		}
		if (arg0 < Static133.anInt2690) {
			local36 = Static133.anInt2690 - arg0;
			local23 -= local36;
			arg0 = Static133.anInt2690;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static133.anInt2687) {
			local36 = arg0 + local23 - Static133.anInt2687;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static200.method1204(Static133.anIntArray309, this.aByteArray19, this.anIntArray158, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V")
	public void method1202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1595;
		arg1 += this.anInt1592;
		@Pc(15) int local15 = arg0 + arg1 * Static133.anInt2685;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1594;
		@Pc(23) int local23 = this.anInt1596;
		@Pc(27) int local27 = Static133.anInt2685 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static133.anInt2686) {
			local36 = Static133.anInt2686 - arg1;
			local20 -= local36;
			arg1 = Static133.anInt2686;
			local17 = local36 * local23;
			local15 += local36 * Static133.anInt2685;
		}
		if (arg1 + local20 > Static133.anInt2689) {
			local20 -= arg1 + local20 - Static133.anInt2689;
		}
		if (arg0 < Static133.anInt2690) {
			local36 = Static133.anInt2690 - arg0;
			local23 -= local36;
			arg0 = Static133.anInt2690;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static133.anInt2687) {
			local36 = arg0 + local23 - Static133.anInt2687;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static200.method1200(Static133.anIntArray309, this.aByteArray19, this.anIntArray158, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "()V")
	public void method1203() {
		if (this.anInt1596 == this.anInt1591 && this.anInt1594 == this.anInt1593) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1591 * this.anInt1593];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1594; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1596; local24++) {
				local17[local24 + this.anInt1595 + (local21 + this.anInt1592) * this.anInt1591] = this.aByteArray19[local19++];
			}
		}
		this.aByteArray19 = local17;
		this.anInt1596 = this.anInt1591;
		this.anInt1594 = this.anInt1593;
		this.anInt1595 = 0;
		this.anInt1592 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(III)V")
	public void method1205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray158.length; local1++) {
			@Pc(11) int local11 = this.anIntArray158[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray158[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray158[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray158[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
