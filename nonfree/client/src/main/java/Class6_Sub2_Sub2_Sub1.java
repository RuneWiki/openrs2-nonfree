import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class6_Sub2_Sub2_Sub1 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!bd", name = "gb", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
	public int anInt363;

	@OriginalMember(owner = "client!bd", name = "ib", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!bd", name = "jb", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!bd", name = "lb", descriptor = "I")
	public int anInt366;

	@OriginalMember(owner = "client!bd", name = "mb", descriptor = "I")
	public int anInt367;

	@OriginalMember(owner = "client!bd", name = "nb", descriptor = "I")
	public int anInt368;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(III)V")
	private Class6_Sub2_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt367 = this.anInt364 = arg0;
		this.anInt365 = this.anInt368 = arg1;
		this.anInt366 = this.anInt363 = 0;
		this.aByteArray4 = new byte[arg0 * arg1];
		this.anIntArray24 = new int[arg2];
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V")
	public void method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray24.length; local1++) {
			@Pc(11) int local11 = this.anIntArray24[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray24[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray24[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray24[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public void method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt366;
		arg1 += this.anInt363;
		@Pc(15) int local15 = arg0 + arg1 * Static53.anInt1865;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt368;
		@Pc(23) int local23 = this.anInt364;
		@Pc(27) int local27 = Static53.anInt1865 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static53.anInt1862) {
			local36 = Static53.anInt1862 - arg1;
			local20 -= local36;
			arg1 = Static53.anInt1862;
			local17 = local36 * local23;
			local15 += local36 * Static53.anInt1865;
		}
		if (arg1 + local20 > Static53.anInt1861) {
			local20 -= arg1 + local20 - Static53.anInt1861;
		}
		if (arg0 < Static53.anInt1860) {
			local36 = Static53.anInt1860 - arg0;
			local23 -= local36;
			arg0 = Static53.anInt1860;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static53.anInt1864) {
			local36 = arg0 + local23 - Static53.anInt1864;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static115.method319(Static53.anIntArray180, this.aByteArray4, this.anIntArray24, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()V")
	public void method320() {
		if (this.anInt364 == this.anInt367 && this.anInt368 == this.anInt365) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt367 * this.anInt365];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt368; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt364; local24++) {
				local17[local24 + this.anInt366 + (local21 + this.anInt363) * this.anInt367] = this.aByteArray4[local19++];
			}
		}
		this.aByteArray4 = local17;
		this.anInt364 = this.anInt367;
		this.anInt368 = this.anInt365;
		this.anInt366 = 0;
		this.anInt363 = 0;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "()V")
	public void method321() {
		@Pc(6) byte[] local6 = new byte[this.anInt364 * this.anInt368];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt368 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt364; local16++) {
				local6[local8++] = this.aByteArray4[local16 + local13 * this.anInt364];
			}
		}
		this.aByteArray4 = local6;
		this.anInt363 = this.anInt365 - this.anInt368 - this.anInt363;
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "()V")
	public void method322() {
		@Pc(6) byte[] local6 = new byte[this.anInt364 * this.anInt368];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt368; local10++) {
			for (@Pc(16) int local16 = this.anInt364 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray4[local16 + local10 * this.anInt364];
			}
		}
		this.aByteArray4 = local6;
		this.anInt366 = this.anInt367 - this.anInt364 - this.anInt366;
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "()Lclient!bd;")
	public Class6_Sub2_Sub2_Sub1 method323() {
		@Pc(10) Class6_Sub2_Sub2_Sub1 local10 = new Class6_Sub2_Sub2_Sub1(this.anInt364, this.anInt368, this.anIntArray24.length);
		local10.anInt367 = this.anInt367;
		local10.anInt365 = this.anInt365;
		local10.anInt366 = this.anInt366;
		local10.anInt363 = this.anInt363;
		@Pc(30) int local30 = this.aByteArray4.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray4[local32] = this.aByteArray4[local32];
		}
		local30 = this.anIntArray24.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray24[local51] = this.anIntArray24[local51];
		}
		return local10;
	}
}
