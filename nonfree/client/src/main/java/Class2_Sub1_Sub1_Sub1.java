import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!ab", name = "db", descriptor = "[I")
	public int[] anIntArray8;

	@OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
	public int anInt91;

	@OriginalMember(owner = "client!ab", name = "fb", descriptor = "I")
	public int anInt92;

	@OriginalMember(owner = "client!ab", name = "gb", descriptor = "I")
	public int anInt93;

	@OriginalMember(owner = "client!ab", name = "hb", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ab", name = "ib", descriptor = "I")
	public int anInt94;

	@OriginalMember(owner = "client!ab", name = "jb", descriptor = "I")
	public int anInt95;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V")
	private Class2_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt90 = this.anInt94 = arg0;
		this.anInt91 = this.anInt93 = arg1;
		this.anInt92 = this.anInt95 = 0;
		this.aByteArray1 = new byte[arg0 * arg1];
		this.anIntArray8 = new int[arg2];
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()V")
	public void method92() {
		@Pc(6) byte[] local6 = new byte[this.anInt94 * this.anInt93];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt93 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt94; local16++) {
				local6[local8++] = this.aByteArray1[local16 + local13 * this.anInt94];
			}
		}
		this.aByteArray1 = local6;
		this.anInt95 = this.anInt91 - this.anInt93 - this.anInt95;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "()V")
	public void method93() {
		@Pc(6) byte[] local6 = new byte[this.anInt94 * this.anInt93];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt93; local10++) {
			for (@Pc(16) int local16 = this.anInt94 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray1[local16 + local10 * this.anInt94];
			}
		}
		this.aByteArray1 = local6;
		this.anInt92 = this.anInt90 - this.anInt94 - this.anInt92;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "()V")
	public void method94() {
		if (this.anInt94 == this.anInt90 && this.anInt93 == this.anInt91) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt90 * this.anInt91];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt93; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt94; local24++) {
				local17[local24 + this.anInt92 + (local21 + this.anInt95) * this.anInt90] = this.aByteArray1[local19++];
			}
		}
		this.aByteArray1 = local17;
		this.anInt94 = this.anInt90;
		this.anInt93 = this.anInt91;
		this.anInt92 = 0;
		this.anInt95 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "()Lclient!ab;")
	public Class2_Sub1_Sub1_Sub1 method95() {
		@Pc(10) Class2_Sub1_Sub1_Sub1 local10 = new Class2_Sub1_Sub1_Sub1(this.anInt94, this.anInt93, this.anIntArray8.length);
		local10.anInt90 = this.anInt90;
		local10.anInt91 = this.anInt91;
		local10.anInt92 = this.anInt92;
		local10.anInt95 = this.anInt95;
		@Pc(30) int local30 = this.aByteArray1.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray1[local32] = this.aByteArray1[local32];
		}
		local30 = this.anIntArray8.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray8[local51] = this.anIntArray8[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public void method96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray8.length; local1++) {
			@Pc(11) int local11 = this.anIntArray8[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray8[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray8[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray8[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V")
	public void method97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt92;
		arg1 += this.anInt95;
		@Pc(15) int local15 = arg0 + arg1 * Static54.anInt2258;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt93;
		@Pc(23) int local23 = this.anInt94;
		@Pc(27) int local27 = Static54.anInt2258 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static54.anInt2259) {
			local36 = Static54.anInt2259 - arg1;
			local20 -= local36;
			arg1 = Static54.anInt2259;
			local17 = local36 * local23;
			local15 += local36 * Static54.anInt2258;
		}
		if (arg1 + local20 > Static54.anInt2254) {
			local20 -= arg1 + local20 - Static54.anInt2254;
		}
		if (arg0 < Static54.anInt2257) {
			local36 = Static54.anInt2257 - arg0;
			local23 -= local36;
			arg0 = Static54.anInt2257;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static54.anInt2256) {
			local36 = arg0 + local23 - Static54.anInt2256;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static119.method91(Static54.anIntArray260, this.aByteArray1, this.anIntArray8, local17, local15, local23, local20, local27, local29);
		}
	}
}
