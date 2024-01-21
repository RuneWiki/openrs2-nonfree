import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class3_Sub3_Sub2_Sub4 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
	public int anInt1900;

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
	public int anInt1901;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
	public int anInt1902;

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
	public int anInt1903;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
	public int anInt1904;

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
	public int anInt1905;

	@OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub2_Sub4() {
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
	private Class3_Sub3_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1901 = this.anInt1904 = arg0;
		this.anInt1903 = this.anInt1902 = arg1;
		this.anInt1905 = this.anInt1900 = 0;
		this.aByteArray15 = new byte[arg0 * arg1];
		this.anIntArray315 = new int[arg2];
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "()V")
	public void method1329() {
		@Pc(6) byte[] local6 = new byte[this.anInt1904 * this.anInt1902];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt1902 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1904; local16++) {
				local6[local8++] = this.aByteArray15[local16 + local13 * this.anInt1904];
			}
		}
		this.aByteArray15 = local6;
		this.anInt1900 = this.anInt1903 - this.anInt1902 - this.anInt1900;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public void method1330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray315.length; local1++) {
			@Pc(11) int local11 = this.anIntArray315[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray315[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray315[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray315[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public void method1332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1905;
		arg1 += this.anInt1900;
		@Pc(15) int local15 = arg0 + arg1 * Static95.anInt1897;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1902;
		@Pc(23) int local23 = this.anInt1904;
		@Pc(27) int local27 = Static95.anInt1897 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static95.anInt1899) {
			local36 = Static95.anInt1899 - arg1;
			local20 -= local36;
			arg1 = Static95.anInt1899;
			local17 = local36 * local23;
			local15 += local36 * Static95.anInt1897;
		}
		if (arg1 + local20 > Static95.anInt1895) {
			local20 -= arg1 + local20 - Static95.anInt1895;
		}
		if (arg0 < Static95.anInt1896) {
			local36 = Static95.anInt1896 - arg0;
			local23 -= local36;
			arg0 = Static95.anInt1896;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static95.anInt1898) {
			local36 = arg0 + local23 - Static95.anInt1898;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static115.method1331(Static95.anIntArray314, this.aByteArray15, this.anIntArray315, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
	public void method1333() {
		if (this.anInt1904 == this.anInt1901 && this.anInt1902 == this.anInt1903) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1901 * this.anInt1903];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1902; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1904; local24++) {
				local17[local24 + this.anInt1905 + (local21 + this.anInt1900) * this.anInt1901] = this.aByteArray15[local19++];
			}
		}
		this.aByteArray15 = local17;
		this.anInt1904 = this.anInt1901;
		this.anInt1902 = this.anInt1903;
		this.anInt1905 = 0;
		this.anInt1900 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "()Lclient!ne;")
	public Class3_Sub3_Sub2_Sub4 method1334() {
		@Pc(10) Class3_Sub3_Sub2_Sub4 local10 = new Class3_Sub3_Sub2_Sub4(this.anInt1904, this.anInt1902, this.anIntArray315.length);
		local10.anInt1901 = this.anInt1901;
		local10.anInt1903 = this.anInt1903;
		local10.anInt1905 = this.anInt1905;
		local10.anInt1900 = this.anInt1900;
		@Pc(30) int local30 = this.aByteArray15.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray15[local32] = this.aByteArray15[local32];
		}
		local30 = this.anIntArray315.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray315[local51] = this.anIntArray315[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "()V")
	public void method1335() {
		@Pc(6) byte[] local6 = new byte[this.anInt1904 * this.anInt1902];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1902; local10++) {
			for (@Pc(16) int local16 = this.anInt1904 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray15[local16 + local10 * this.anInt1904];
			}
		}
		this.aByteArray15 = local6;
		this.anInt1905 = this.anInt1901 - this.anInt1904 - this.anInt1905;
	}
}
