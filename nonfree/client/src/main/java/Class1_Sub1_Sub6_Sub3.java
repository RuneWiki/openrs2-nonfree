import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub6_Sub3 extends Class1_Sub1_Sub6 {

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
	public int anInt1878;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
	public int anInt1879;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
	public int anInt1880;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
	public int anInt1881;

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
	public int anInt1882;

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
	public int anInt1883;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6_Sub3() {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(III)V")
	private Class1_Sub1_Sub6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1882 = this.anInt1878 = arg0;
		this.anInt1880 = this.anInt1883 = arg1;
		this.anInt1879 = this.anInt1881 = 0;
		this.aByteArray11 = new byte[arg0 * arg1];
		this.anIntArray218 = new int[arg2];
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()V")
	public void method1192() {
		@Pc(6) byte[] local6 = new byte[this.anInt1878 * this.anInt1883];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1883; local10++) {
			for (@Pc(16) int local16 = this.anInt1878 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray11[local16 + local10 * this.anInt1878];
			}
		}
		this.aByteArray11 = local6;
		this.anInt1879 = this.anInt1882 - this.anInt1878 - this.anInt1879;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	public void method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray218.length; local1++) {
			@Pc(11) int local11 = this.anIntArray218[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray218[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray218[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray218[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method1194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1879;
		arg1 += this.anInt1881;
		@Pc(15) int local15 = arg0 + arg1 * Static24.anInt2465;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1883;
		@Pc(23) int local23 = this.anInt1878;
		@Pc(27) int local27 = Static24.anInt2465 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static24.anInt2466) {
			local36 = Static24.anInt2466 - arg1;
			local20 -= local36;
			arg1 = Static24.anInt2466;
			local17 = local36 * local23;
			local15 += local36 * Static24.anInt2465;
		}
		if (arg1 + local20 > Static24.anInt2467) {
			local20 -= arg1 + local20 - Static24.anInt2467;
		}
		if (arg0 < Static24.anInt2468) {
			local36 = Static24.anInt2468 - arg0;
			local23 -= local36;
			arg0 = Static24.anInt2468;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static24.anInt2464) {
			local36 = arg0 + local23 - Static24.anInt2464;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static121.method1191(Static24.anIntArray333, this.aByteArray11, this.anIntArray218, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()Lclient!mb;")
	public Class1_Sub1_Sub6_Sub3 method1195() {
		@Pc(10) Class1_Sub1_Sub6_Sub3 local10 = new Class1_Sub1_Sub6_Sub3(this.anInt1878, this.anInt1883, this.anIntArray218.length);
		local10.anInt1882 = this.anInt1882;
		local10.anInt1880 = this.anInt1880;
		local10.anInt1879 = this.anInt1879;
		local10.anInt1881 = this.anInt1881;
		@Pc(30) int local30 = this.aByteArray11.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray11[local32] = this.aByteArray11[local32];
		}
		local30 = this.anIntArray218.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray218[local51] = this.anIntArray218[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()V")
	public void method1196() {
		if (this.anInt1878 == this.anInt1882 && this.anInt1883 == this.anInt1880) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1882 * this.anInt1880];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1883; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1878; local24++) {
				local17[local24 + this.anInt1879 + (local21 + this.anInt1881) * this.anInt1882] = this.aByteArray11[local19++];
			}
		}
		this.aByteArray11 = local17;
		this.anInt1878 = this.anInt1882;
		this.anInt1883 = this.anInt1880;
		this.anInt1879 = 0;
		this.anInt1881 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()V")
	public void method1197() {
		@Pc(6) byte[] local6 = new byte[this.anInt1878 * this.anInt1883];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt1883 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1878; local16++) {
				local6[local8++] = this.aByteArray11[local16 + local13 * this.anInt1878];
			}
		}
		this.aByteArray11 = local6;
		this.anInt1881 = this.anInt1880 - this.anInt1883 - this.anInt1881;
	}
}
