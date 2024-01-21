import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class4_Sub2_Sub3_Sub4 extends Class4_Sub2_Sub3 {

	@OriginalMember(owner = "client!q", name = "cb", descriptor = "[I")
	public int[] anIntArray248;

	@OriginalMember(owner = "client!q", name = "db", descriptor = "I")
	public int anInt2262;

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
	public int anInt2263;

	@OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
	public int anInt2264;

	@OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!q", name = "jb", descriptor = "I")
	public int anInt2267;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(II)V")
	public void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2265;
		arg1 += this.anInt2262;
		@Pc(15) int local15 = arg0 + arg1 * Static17.anInt2257;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2266;
		@Pc(23) int local23 = this.anInt2267;
		@Pc(27) int local27 = Static17.anInt2257 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static17.anInt2258) {
			local36 = Static17.anInt2258 - arg1;
			local20 -= local36;
			arg1 = Static17.anInt2258;
			local17 = local36 * local23;
			local15 += local36 * Static17.anInt2257;
		}
		if (arg1 + local20 > Static17.anInt2259) {
			local20 -= arg1 + local20 - Static17.anInt2259;
		}
		if (arg0 < Static17.anInt2261) {
			local36 = Static17.anInt2261 - arg0;
			local23 -= local36;
			arg0 = Static17.anInt2261;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static17.anInt2256) {
			local36 = arg0 + local23 - Static17.anInt2256;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static137.method1690(Static17.anIntArray247, this.aByteArray25, this.anIntArray248, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
	public void method1689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray248.length; local1++) {
			@Pc(11) int local11 = this.anIntArray248[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray248[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray248[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray248[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "()V")
	public void method1691() {
		if (this.anInt2267 == this.anInt2263 && this.anInt2266 == this.anInt2264) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2263 * this.anInt2264];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2266; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2267; local24++) {
				local17[local24 + this.anInt2265 + (local21 + this.anInt2262) * this.anInt2263] = this.aByteArray25[local19++];
			}
		}
		this.aByteArray25 = local17;
		this.anInt2267 = this.anInt2263;
		this.anInt2266 = this.anInt2264;
		this.anInt2265 = 0;
		this.anInt2262 = 0;
	}
}
