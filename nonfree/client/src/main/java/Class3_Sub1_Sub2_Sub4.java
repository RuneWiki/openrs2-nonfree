import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class3_Sub1_Sub2_Sub4 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	public int anInt2808;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!va", name = "X", descriptor = "I")
	public int anInt2810;

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
	public int anInt2811;

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
	public int anInt2812;

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
	public int anInt2813;

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub2_Sub4() {
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(III)V")
	private Class3_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2811 = this.anInt2809 = arg0;
		this.anInt2812 = this.anInt2810 = arg1;
		this.anInt2813 = this.anInt2808 = 0;
		this.aByteArray24 = new byte[arg0 * arg1];
		this.anIntArray364 = new int[arg2];
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "()V")
	public void method1853() {
		@Pc(6) byte[] local6 = new byte[this.anInt2809 * this.anInt2810];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2810; local10++) {
			for (@Pc(16) int local16 = this.anInt2809 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray24[local16 + local10 * this.anInt2809];
			}
		}
		this.aByteArray24 = local6;
		this.anInt2813 = this.anInt2811 - this.anInt2809 - this.anInt2813;
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "()Lclient!va;")
	public Class3_Sub1_Sub2_Sub4 method1854() {
		@Pc(10) Class3_Sub1_Sub2_Sub4 local10 = new Class3_Sub1_Sub2_Sub4(this.anInt2809, this.anInt2810, this.anIntArray364.length);
		local10.anInt2811 = this.anInt2811;
		local10.anInt2812 = this.anInt2812;
		local10.anInt2813 = this.anInt2813;
		local10.anInt2808 = this.anInt2808;
		@Pc(30) int local30 = this.aByteArray24.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray24[local32] = this.aByteArray24[local32];
		}
		local30 = this.anIntArray364.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray364[local51] = this.anIntArray364[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
	public void method1855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray364.length; local1++) {
			@Pc(11) int local11 = this.anIntArray364[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray364[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray364[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray364[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "()V")
	public void method1856() {
		@Pc(6) byte[] local6 = new byte[this.anInt2809 * this.anInt2810];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2810 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2809; local16++) {
				local6[local8++] = this.aByteArray24[local16 + local13 * this.anInt2809];
			}
		}
		this.aByteArray24 = local6;
		this.anInt2808 = this.anInt2812 - this.anInt2810 - this.anInt2808;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public void method1857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2813;
		arg1 += this.anInt2808;
		@Pc(15) int local15 = arg0 + arg1 * Static66.anInt2804;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2810;
		@Pc(23) int local23 = this.anInt2809;
		@Pc(27) int local27 = Static66.anInt2804 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static66.anInt2803) {
			local36 = Static66.anInt2803 - arg1;
			local20 -= local36;
			arg1 = Static66.anInt2803;
			local17 = local36 * local23;
			local15 += local36 * Static66.anInt2804;
		}
		if (arg1 + local20 > Static66.anInt2802) {
			local20 -= arg1 + local20 - Static66.anInt2802;
		}
		if (arg0 < Static66.anInt2807) {
			local36 = Static66.anInt2807 - arg0;
			local23 -= local36;
			arg0 = Static66.anInt2807;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static66.anInt2806) {
			local36 = arg0 + local23 - Static66.anInt2806;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static124.method1858(Static66.anIntArray363, this.aByteArray24, this.anIntArray364, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "()V")
	public void method1859() {
		if (this.anInt2809 == this.anInt2811 && this.anInt2810 == this.anInt2812) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2811 * this.anInt2812];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2810; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2809; local24++) {
				local17[local24 + this.anInt2813 + (local21 + this.anInt2808) * this.anInt2811] = this.aByteArray24[local19++];
			}
		}
		this.aByteArray24 = local17;
		this.anInt2809 = this.anInt2811;
		this.anInt2810 = this.anInt2812;
		this.anInt2813 = 0;
		this.anInt2808 = 0;
	}
}
