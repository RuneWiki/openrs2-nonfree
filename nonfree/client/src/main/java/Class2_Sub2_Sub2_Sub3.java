import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class2_Sub2_Sub2_Sub3 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	public int anInt1905;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
	public int anInt1906;

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
	public int anInt1907;

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
	public int anInt1908;

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
	public int anInt1909;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
	public int anInt1910;

	@OriginalMember(owner = "client!qb", name = "cb", descriptor = "[I")
	public int[] anIntArray427;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()V", line = 5)
	public void method1318() {
		@Pc(6) byte[] local6 = new byte[this.anInt1905 * this.anInt1910];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1910; local10++) {
			for (@Pc(16) int local16 = this.anInt1905 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray16[local16 + local10 * this.anInt1905];
			}
		}
		this.aByteArray16 = local6;
		this.anInt1907 = this.anInt1909 - this.anInt1905 - this.anInt1907;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "()Lclient!qb;", line = 30)
	public Class2_Sub2_Sub2_Sub3 method1319() {
		@Pc(10) Class2_Sub2_Sub2_Sub3 local10 = new Class2_Sub2_Sub2_Sub3(this.anInt1905, this.anInt1910, this.anIntArray427.length);
		local10.anInt1909 = this.anInt1909;
		local10.anInt1908 = this.anInt1908;
		local10.anInt1907 = this.anInt1907;
		local10.anInt1906 = this.anInt1906;
		@Pc(30) int local30 = this.aByteArray16.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray16[local32] = this.aByteArray16[local32];
		}
		local30 = this.anIntArray427.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray427[local51] = this.anIntArray427[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 61)
	public void method1320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1907;
		arg1 += this.anInt1906;
		@Pc(15) int local15 = arg0 + arg1 * Static25.anInt2440;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1910;
		@Pc(23) int local23 = this.anInt1905;
		@Pc(27) int local27 = Static25.anInt2440 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Class2_Sub2_Sub2.anInt2439) {
			local36 = Class2_Sub2_Sub2.anInt2439 - arg1;
			local20 -= local36;
			arg1 = Class2_Sub2_Sub2.anInt2439;
			local17 = local36 * local23;
			local15 += local36 * Static25.anInt2440;
		}
		if (arg1 + local20 > Class2_Sub2_Sub2.anInt2438) {
			local20 -= arg1 + local20 - Class2_Sub2_Sub2.anInt2438;
		}
		if (arg0 < Class2_Sub2_Sub2.anInt2437) {
			local36 = Class2_Sub2_Sub2.anInt2437 - arg0;
			local23 -= local36;
			arg0 = Class2_Sub2_Sub2.anInt2437;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Class2_Sub2_Sub2.anInt2436) {
			local36 = arg0 + local23 - Class2_Sub2_Sub2.anInt2436;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static113.method1323(Static25.anIntArray533, this.aByteArray16, this.anIntArray427, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V", line = 120)
	public void method1321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray427.length; local1++) {
			@Pc(11) int local11 = this.anIntArray427[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray427[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray427[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray427[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "()V", line = 161)
	public void method1322() {
		@Pc(6) byte[] local6 = new byte[this.anInt1905 * this.anInt1910];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt1910 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1905; local16++) {
				local6[local8++] = this.aByteArray16[local16 + local13 * this.anInt1905];
			}
		}
		this.aByteArray16 = local6;
		this.anInt1906 = this.anInt1908 - this.anInt1910 - this.anInt1906;
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 249)
	public Class2_Sub2_Sub2_Sub3() {
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(III)V", line = 252)
	private Class2_Sub2_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1909 = this.anInt1905 = arg0;
		this.anInt1908 = this.anInt1910 = arg1;
		this.anInt1907 = this.anInt1906 = 0;
		this.aByteArray16 = new byte[arg0 * arg1];
		this.anIntArray427 = new int[arg2];
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "()V", line = 260)
	public void method1324() {
		if (this.anInt1905 == this.anInt1909 && this.anInt1910 == this.anInt1908) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1909 * this.anInt1908];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1910; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1905; local24++) {
				local17[local24 + this.anInt1907 + (local21 + this.anInt1906) * this.anInt1909] = this.aByteArray16[local19++];
			}
		}
		this.aByteArray16 = local17;
		this.anInt1905 = this.anInt1909;
		this.anInt1910 = this.anInt1908;
		this.anInt1907 = 0;
		this.anInt1906 = 0;
	}
}
