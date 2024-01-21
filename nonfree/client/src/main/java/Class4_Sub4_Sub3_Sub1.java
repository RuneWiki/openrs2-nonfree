import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class4_Sub4_Sub3_Sub1 extends Class4_Sub4_Sub3 {

	@OriginalMember(owner = "client!da", name = "P", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!da", name = "S", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!da", name = "T", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!da", name = "U", descriptor = "I")
	public int anInt637;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!da", name = "W", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
	public void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt637;
		arg1 += this.anInt634;
		@Pc(15) int local15 = arg0 + arg1 * Static80.anInt2377;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt633;
		@Pc(23) int local23 = this.anInt635;
		@Pc(27) int local27 = Static80.anInt2377 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static80.anInt2373) {
			local36 = Static80.anInt2373 - arg1;
			local20 -= local36;
			arg1 = Static80.anInt2373;
			local17 = local36 * local23;
			local15 += local36 * Static80.anInt2377;
		}
		if (arg1 + local20 > Static80.anInt2375) {
			local20 -= arg1 + local20 - Static80.anInt2375;
		}
		if (arg0 < Static80.anInt2374) {
			local36 = Static80.anInt2374 - arg0;
			local23 -= local36;
			arg0 = Static80.anInt2374;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static80.anInt2376) {
			local36 = arg0 + local23 - Static80.anInt2376;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static133.method434(Static80.anIntArray236, this.aByteArray24, this.anIntArray35, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	public void method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray35.length; local1++) {
			@Pc(11) int local11 = this.anIntArray35[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray35[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray35[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray35[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	public void method433() {
		if (this.anInt635 == this.anInt636 && this.anInt633 == this.anInt638) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt636 * this.anInt638];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt633; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt635; local24++) {
				local17[local24 + this.anInt637 + (local21 + this.anInt634) * this.anInt636] = this.aByteArray24[local19++];
			}
		}
		this.aByteArray24 = local17;
		this.anInt635 = this.anInt636;
		this.anInt633 = this.anInt638;
		this.anInt637 = 0;
		this.anInt634 = 0;
	}
}
