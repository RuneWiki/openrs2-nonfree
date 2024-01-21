import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class3_Sub1_Sub2_Sub4 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!r", name = "W", descriptor = "I")
	public int anInt2857;

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
	public int anInt2858;

	@OriginalMember(owner = "client!r", name = "db", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
	public int anInt2859;

	@OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
	public int anInt2860;

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
	public int anInt2861;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
	public int anInt2862;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub2_Sub4() {
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(III)V")
	private Class3_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2857 = this.anInt2860 = arg0;
		this.anInt2861 = this.anInt2858 = arg1;
		this.anInt2859 = this.anInt2862 = 0;
		this.aByteArray75 = new byte[arg0 * arg1];
		this.anIntArray305 = new int[arg2];
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public void method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray305.length; local1++) {
			@Pc(11) int local11 = this.anIntArray305[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray305[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray305[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray305[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
	public void method1900() {
		if (this.anInt2860 == this.anInt2857 && this.anInt2858 == this.anInt2861) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2857 * this.anInt2861];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2858; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2860; local24++) {
				local17[local24 + this.anInt2859 + (local21 + this.anInt2862) * this.anInt2857] = this.aByteArray75[local19++];
			}
		}
		this.aByteArray75 = local17;
		this.anInt2860 = this.anInt2857;
		this.anInt2858 = this.anInt2861;
		this.anInt2859 = 0;
		this.anInt2862 = 0;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
	public void method1901() {
		@Pc(6) byte[] local6 = new byte[this.anInt2860 * this.anInt2858];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2858; local10++) {
			for (@Pc(16) int local16 = this.anInt2860 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray75[local16 + local10 * this.anInt2860];
			}
		}
		this.aByteArray75 = local6;
		this.anInt2859 = this.anInt2857 - this.anInt2860 - this.anInt2859;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	public void method1903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2859;
		arg1 += this.anInt2862;
		@Pc(15) int local15 = arg0 + arg1 * Static40.anInt2854;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2858;
		@Pc(23) int local23 = this.anInt2860;
		@Pc(27) int local27 = Static40.anInt2854 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static40.anInt2852) {
			local36 = Static40.anInt2852 - arg1;
			local20 -= local36;
			arg1 = Static40.anInt2852;
			local17 = local36 * local23;
			local15 += local36 * Static40.anInt2854;
		}
		if (arg1 + local20 > Static40.anInt2851) {
			local20 -= arg1 + local20 - Static40.anInt2851;
		}
		if (arg0 < Static40.anInt2855) {
			local36 = Static40.anInt2855 - arg0;
			local23 -= local36;
			arg0 = Static40.anInt2855;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static40.anInt2856) {
			local36 = arg0 + local23 - Static40.anInt2856;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static136.method1902(Static40.anIntArray304, this.aByteArray75, this.anIntArray305, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Lclient!r;")
	public Class3_Sub1_Sub2_Sub4 method1904() {
		@Pc(10) Class3_Sub1_Sub2_Sub4 local10 = new Class3_Sub1_Sub2_Sub4(this.anInt2860, this.anInt2858, this.anIntArray305.length);
		local10.anInt2857 = this.anInt2857;
		local10.anInt2861 = this.anInt2861;
		local10.anInt2859 = this.anInt2859;
		local10.anInt2862 = this.anInt2862;
		@Pc(30) int local30 = this.aByteArray75.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray75[local32] = this.aByteArray75[local32];
		}
		local30 = this.anIntArray305.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray305[local51] = this.anIntArray305[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
	public void method1905() {
		@Pc(6) byte[] local6 = new byte[this.anInt2860 * this.anInt2858];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2858 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2860; local16++) {
				local6[local8++] = this.aByteArray75[local16 + local13 * this.anInt2860];
			}
		}
		this.aByteArray75 = local6;
		this.anInt2862 = this.anInt2861 - this.anInt2858 - this.anInt2862;
	}
}
