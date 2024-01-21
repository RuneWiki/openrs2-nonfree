import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class1_Sub1_Sub8_Sub1 extends Class1_Sub1_Sub8 {

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
	public int anInt1430;

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
	public int anInt1431;

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
	public int anInt1432;

	@OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
	public int anInt1434;

	@OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
	public int anInt1435;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public void method918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray92.length; local1++) {
			@Pc(11) int local11 = this.anIntArray92[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray92[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray92[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray92[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
	public void method919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1433;
		arg1 += this.anInt1431;
		@Pc(15) int local15 = arg0 + arg1 * Static63.anInt2849;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1432;
		@Pc(23) int local23 = this.anInt1435;
		@Pc(27) int local27 = Static63.anInt2849 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static63.anInt2850) {
			local36 = Static63.anInt2850 - arg1;
			local20 -= local36;
			arg1 = Static63.anInt2850;
			local17 = local36 * local23;
			local15 += local36 * Static63.anInt2849;
		}
		if (arg1 + local20 > Static63.anInt2851) {
			local20 -= arg1 + local20 - Static63.anInt2851;
		}
		if (arg0 < Static63.anInt2848) {
			local36 = Static63.anInt2848 - arg0;
			local23 -= local36;
			arg0 = Static63.anInt2848;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static63.anInt2853) {
			local36 = arg0 + local23 - Static63.anInt2853;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static182.method920(Static63.anIntArray254, this.aByteArray7, this.anIntArray92, local17, local15, local23, local20, local27, local29);
		}
	}
}
