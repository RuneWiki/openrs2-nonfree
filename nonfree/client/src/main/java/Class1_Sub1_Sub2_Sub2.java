import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "[I")
	public int[] anIntArray87;

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
	public int anInt878;

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
	public int anInt879;

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
	public int anInt880;

	@OriginalMember(owner = "client!e", name = "db", descriptor = "I")
	public int anInt881;

	@OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
	public int anInt882;

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
	public int anInt883;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public void method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray87.length; local1++) {
			@Pc(11) int local11 = this.anIntArray87[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray87[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray87[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray87[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
	public void method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt878;
		arg1 += this.anInt881;
		@Pc(15) int local15 = arg0 + arg1 * Static111.anInt2638;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt880;
		@Pc(23) int local23 = this.anInt883;
		@Pc(27) int local27 = Static111.anInt2638 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static111.anInt2641) {
			local36 = Static111.anInt2641 - arg1;
			local20 -= local36;
			arg1 = Static111.anInt2641;
			local17 = local36 * local23;
			local15 += local36 * Static111.anInt2638;
		}
		if (arg1 + local20 > Static111.anInt2640) {
			local20 -= arg1 + local20 - Static111.anInt2640;
		}
		if (arg0 < Static111.anInt2639) {
			local36 = Static111.anInt2639 - arg0;
			local23 -= local36;
			arg0 = Static111.anInt2639;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static111.anInt2642) {
			local36 = arg0 + local23 - Static111.anInt2642;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static135.method540(Static111.anIntArray333, this.aByteArray12, this.anIntArray87, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
	public void method543() {
		if (this.anInt883 == this.anInt879 && this.anInt880 == this.anInt882) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt879 * this.anInt882];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt880; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt883; local24++) {
				local17[local24 + this.anInt878 + (local21 + this.anInt881) * this.anInt879] = this.aByteArray12[local19++];
			}
		}
		this.aByteArray12 = local17;
		this.anInt883 = this.anInt879;
		this.anInt880 = this.anInt882;
		this.anInt878 = 0;
		this.anInt881 = 0;
	}
}
