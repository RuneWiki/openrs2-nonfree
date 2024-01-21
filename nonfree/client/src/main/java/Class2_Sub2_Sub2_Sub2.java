import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class2_Sub2_Sub2_Sub2 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!df", name = "N", descriptor = "I")
	public int anInt878;

	@OriginalMember(owner = "client!df", name = "O", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!df", name = "P", descriptor = "I")
	public int anInt879;

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "I")
	public int anInt880;

	@OriginalMember(owner = "client!df", name = "S", descriptor = "I")
	public int anInt881;

	@OriginalMember(owner = "client!df", name = "T", descriptor = "I")
	public int anInt882;

	@OriginalMember(owner = "client!df", name = "U", descriptor = "I")
	public int anInt883;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	public void method722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt879;
		arg1 += this.anInt882;
		@Pc(15) int local15 = arg0 + arg1 * Static10.anInt2275;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt881;
		@Pc(23) int local23 = this.anInt878;
		@Pc(27) int local27 = Static10.anInt2275 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static10.anInt2273) {
			local36 = Static10.anInt2273 - arg1;
			local20 -= local36;
			arg1 = Static10.anInt2273;
			local17 = local36 * local23;
			local15 += local36 * Static10.anInt2275;
		}
		if (arg1 + local20 > Static10.anInt2277) {
			local20 -= arg1 + local20 - Static10.anInt2277;
		}
		if (arg0 < Static10.anInt2274) {
			local36 = Static10.anInt2274 - arg0;
			local23 -= local36;
			arg0 = Static10.anInt2274;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static10.anInt2276) {
			local36 = arg0 + local23 - Static10.anInt2276;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static186.method723(Static10.anIntArray214, this.aByteArray11, this.anIntArray79, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public void method724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray79.length; local1++) {
			@Pc(11) int local11 = this.anIntArray79[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray79[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray79[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray79[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
	public void method725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt879;
		arg1 += this.anInt882;
		@Pc(15) int local15 = arg0 + arg1 * Static10.anInt2275;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt881;
		@Pc(23) int local23 = this.anInt878;
		@Pc(27) int local27 = Static10.anInt2275 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static10.anInt2273) {
			local36 = Static10.anInt2273 - arg1;
			local20 -= local36;
			arg1 = Static10.anInt2273;
			local17 = local36 * local23;
			local15 += local36 * Static10.anInt2275;
		}
		if (arg1 + local20 > Static10.anInt2277) {
			local20 -= arg1 + local20 - Static10.anInt2277;
		}
		if (arg0 < Static10.anInt2274) {
			local36 = Static10.anInt2274 - arg0;
			local23 -= local36;
			arg0 = Static10.anInt2274;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static10.anInt2276) {
			local36 = arg0 + local23 - Static10.anInt2276;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static186.method727(Static10.anIntArray214, this.aByteArray11, this.anIntArray79, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
	public void method726() {
		if (this.anInt878 == this.anInt880 && this.anInt881 == this.anInt883) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt880 * this.anInt883];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt881; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt878; local24++) {
				local17[local24 + this.anInt879 + (local21 + this.anInt882) * this.anInt880] = this.aByteArray11[local19++];
			}
		}
		this.aByteArray11 = local17;
		this.anInt878 = this.anInt880;
		this.anInt881 = this.anInt883;
		this.anInt879 = 0;
		this.anInt882 = 0;
	}
}
