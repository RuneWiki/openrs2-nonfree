import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub1_Sub4_Sub1 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!de", name = "Y", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
	public int anInt869;

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
	public int anInt870;

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
	public int anInt871;

	@OriginalMember(owner = "client!de", name = "db", descriptor = "I")
	public int anInt872;

	@OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
	public int anInt873;

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
	public int anInt874;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(III)V")
	private Class1_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt874 = this.anInt869 = arg0;
		this.anInt873 = this.anInt870 = arg1;
		this.anInt871 = this.anInt872 = 0;
		this.aByteArray24 = new byte[arg0 * arg1];
		this.anIntArray126 = new int[arg2];
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V")
	public void method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt871;
		arg1 += this.anInt872;
		@Pc(15) int local15 = arg0 + arg1 * Static15.anInt2152;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt870;
		@Pc(23) int local23 = this.anInt869;
		@Pc(27) int local27 = Static15.anInt2152 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static15.anInt2153) {
			local36 = Static15.anInt2153 - arg1;
			local20 -= local36;
			arg1 = Static15.anInt2153;
			local17 = local36 * local23;
			local15 += local36 * Static15.anInt2152;
		}
		if (arg1 + local20 > Static15.anInt2150) {
			local20 -= arg1 + local20 - Static15.anInt2150;
		}
		if (arg0 < Static15.anInt2151) {
			local36 = Static15.anInt2151 - arg0;
			local23 -= local36;
			arg0 = Static15.anInt2151;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static15.anInt2155) {
			local36 = arg0 + local23 - Static15.anInt2155;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static130.method494(Static15.anIntArray326, this.aByteArray24, this.anIntArray126, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "()Lclient!de;")
	public Class1_Sub1_Sub4_Sub1 method493() {
		@Pc(10) Class1_Sub1_Sub4_Sub1 local10 = new Class1_Sub1_Sub4_Sub1(this.anInt869, this.anInt870, this.anIntArray126.length);
		local10.anInt874 = this.anInt874;
		local10.anInt873 = this.anInt873;
		local10.anInt871 = this.anInt871;
		local10.anInt872 = this.anInt872;
		@Pc(30) int local30 = this.aByteArray24.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray24[local32] = this.aByteArray24[local32];
		}
		local30 = this.anIntArray126.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray126[local51] = this.anIntArray126[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
	public void method495() {
		@Pc(6) byte[] local6 = new byte[this.anInt869 * this.anInt870];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt870 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt869; local16++) {
				local6[local8++] = this.aByteArray24[local16 + local13 * this.anInt869];
			}
		}
		this.aByteArray24 = local6;
		this.anInt872 = this.anInt873 - this.anInt870 - this.anInt872;
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "()V")
	public void method496() {
		@Pc(6) byte[] local6 = new byte[this.anInt869 * this.anInt870];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt870; local10++) {
			for (@Pc(16) int local16 = this.anInt869 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray24[local16 + local10 * this.anInt869];
			}
		}
		this.aByteArray24 = local6;
		this.anInt871 = this.anInt874 - this.anInt869 - this.anInt871;
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "()V")
	public void method497() {
		if (this.anInt869 == this.anInt874 && this.anInt870 == this.anInt873) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt874 * this.anInt873];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt870; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt869; local24++) {
				local17[local24 + this.anInt871 + (local21 + this.anInt872) * this.anInt874] = this.aByteArray24[local19++];
			}
		}
		this.aByteArray24 = local17;
		this.anInt869 = this.anInt874;
		this.anInt870 = this.anInt873;
		this.anInt871 = 0;
		this.anInt872 = 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	public void method498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray126.length; local1++) {
			@Pc(11) int local11 = this.anIntArray126[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray126[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray126[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray126[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
