import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class8_Sub1_Sub3_Sub2 extends Class8_Sub1_Sub3 {

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
	public int anInt483;

	@OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
	public int anInt484;

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "[I")
	public int[] anIntArray62;

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
	public int anInt485;

	@OriginalMember(owner = "client!ce", name = "gb", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "I")
	public int anInt487;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public void method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt482;
		arg1 += this.anInt486;
		@Pc(15) int local15 = arg0 + arg1 * Static110.anInt2717;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt485;
		@Pc(23) int local23 = this.anInt484;
		@Pc(27) int local27 = Static110.anInt2717 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static110.anInt2718) {
			local36 = Static110.anInt2718 - arg1;
			local20 -= local36;
			arg1 = Static110.anInt2718;
			local17 = local36 * local23;
			local15 += local36 * Static110.anInt2717;
		}
		if (arg1 + local20 > Static110.anInt2715) {
			local20 -= arg1 + local20 - Static110.anInt2715;
		}
		if (arg0 < Static110.anInt2713) {
			local36 = Static110.anInt2713 - arg0;
			local23 -= local36;
			arg0 = Static110.anInt2713;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static110.anInt2716) {
			local36 = arg0 + local23 - Static110.anInt2716;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static135.method302(Static110.anIntArray376, this.aByteArray3, this.anIntArray62, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	public void method301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray62.length; local1++) {
			@Pc(11) int local11 = this.anIntArray62[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray62[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray62[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray62[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "()V")
	public void method303() {
		if (this.anInt484 == this.anInt483 && this.anInt485 == this.anInt487) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt483 * this.anInt487];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt485; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt484; local24++) {
				local17[local24 + this.anInt482 + (local21 + this.anInt486) * this.anInt483] = this.aByteArray3[local19++];
			}
		}
		this.aByteArray3 = local17;
		this.anInt484 = this.anInt483;
		this.anInt485 = this.anInt487;
		this.anInt482 = 0;
		this.anInt486 = 0;
	}
}
