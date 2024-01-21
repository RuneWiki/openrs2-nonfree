import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class4_Sub3_Sub6_Sub2 extends Class4_Sub3_Sub6 {

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
	public int anInt2251;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	public int anInt2252;

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
	public int anInt2253;

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	public int anInt2254;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
	public int anInt2255;

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
	public int anInt2256;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()V")
	public void method1556() {
		if (this.anInt2255 == this.anInt2254 && this.anInt2256 == this.anInt2252) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2254 * this.anInt2252];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2256; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2255; local24++) {
				local17[local24 + this.anInt2251 + (local21 + this.anInt2253) * this.anInt2254] = this.aByteArray35[local19++];
			}
		}
		this.aByteArray35 = local17;
		this.anInt2255 = this.anInt2254;
		this.anInt2256 = this.anInt2252;
		this.anInt2251 = 0;
		this.anInt2253 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	public void method1557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray285.length; local1++) {
			@Pc(11) int local11 = this.anIntArray285[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray285[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray285[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray285[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public void method1558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2251;
		arg1 += this.anInt2253;
		@Pc(15) int local15 = arg0 + arg1 * Static34.anInt2345;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2256;
		@Pc(23) int local23 = this.anInt2255;
		@Pc(27) int local27 = Static34.anInt2345 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static34.anInt2344) {
			local36 = Static34.anInt2344 - arg1;
			local20 -= local36;
			arg1 = Static34.anInt2344;
			local17 = local36 * local23;
			local15 += local36 * Static34.anInt2345;
		}
		if (arg1 + local20 > Static34.anInt2347) {
			local20 -= arg1 + local20 - Static34.anInt2347;
		}
		if (arg0 < Static34.anInt2349) {
			local36 = Static34.anInt2349 - arg0;
			local23 -= local36;
			arg0 = Static34.anInt2349;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static34.anInt2346) {
			local36 = arg0 + local23 - Static34.anInt2346;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static140.method1555(Static34.anIntArray298, this.aByteArray35, this.anIntArray285, local17, local15, local23, local20, local27, local29);
		}
	}
}
