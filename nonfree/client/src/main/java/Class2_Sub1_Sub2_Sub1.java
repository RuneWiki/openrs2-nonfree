import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub1_Sub2_Sub1 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
	public int anInt1630;

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
	public int anInt1631;

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
	public int anInt1632;

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
	public int anInt1633;

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
	public int anInt1634;

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
	public int anInt1635;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "()V")
	public void method1083() {
		if (this.anInt1632 == this.anInt1634 && this.anInt1631 == this.anInt1633) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1634 * this.anInt1633];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1631; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1632; local24++) {
				local17[local24 + this.anInt1630 + (local21 + this.anInt1635) * this.anInt1634] = this.aByteArray19[local19++];
			}
		}
		this.aByteArray19 = local17;
		this.anInt1632 = this.anInt1634;
		this.anInt1631 = this.anInt1633;
		this.anInt1630 = 0;
		this.anInt1635 = 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1630;
		arg1 += this.anInt1635;
		@Pc(15) int local15 = arg0 + arg1 * Static6.anInt2382;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1631;
		@Pc(23) int local23 = this.anInt1632;
		@Pc(27) int local27 = Static6.anInt2382 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static6.anInt2383) {
			local36 = Static6.anInt2383 - arg1;
			local20 -= local36;
			arg1 = Static6.anInt2383;
			local17 = local36 * local23;
			local15 += local36 * Static6.anInt2382;
		}
		if (arg1 + local20 > Static6.anInt2379) {
			local20 -= arg1 + local20 - Static6.anInt2379;
		}
		if (arg0 < Static6.anInt2380) {
			local36 = Static6.anInt2380 - arg0;
			local23 -= local36;
			arg0 = Static6.anInt2380;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static6.anInt2384) {
			local36 = arg0 + local23 - Static6.anInt2384;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static136.method1086(Static6.anIntArray258, this.aByteArray19, this.anIntArray164, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)V")
	public void method1085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray164.length; local1++) {
			@Pc(11) int local11 = this.anIntArray164[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray164[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray164[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray164[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
