import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!i", name = "db", descriptor = "I")
	public int anInt1429;

	@OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
	public int anInt1430;

	@OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
	public int anInt1431;

	@OriginalMember(owner = "client!i", name = "gb", descriptor = "I")
	public int anInt1432;

	@OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!i", name = "ib", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!i", name = "jb", descriptor = "I")
	public int anInt1434;

	@OriginalMember(owner = "client!i", name = "kb", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
	public void method997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1433;
		arg1 += this.anInt1434;
		@Pc(15) int local15 = arg0 + arg1 * Static115.anInt2366;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1429;
		@Pc(23) int local23 = this.anInt1432;
		@Pc(27) int local27 = Static115.anInt2366 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static115.anInt2367) {
			local36 = Static115.anInt2367 - arg1;
			local20 -= local36;
			arg1 = Static115.anInt2367;
			local17 = local36 * local23;
			local15 += local36 * Static115.anInt2366;
		}
		if (arg1 + local20 > Static115.anInt2368) {
			local20 -= arg1 + local20 - Static115.anInt2368;
		}
		if (arg0 < Static115.anInt2370) {
			local36 = Static115.anInt2370 - arg0;
			local23 -= local36;
			arg0 = Static115.anInt2370;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static115.anInt2369) {
			local36 = arg0 + local23 - Static115.anInt2369;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static138.method999(Static115.anIntArray395, this.aByteArray9, this.anIntArray213, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	public void method998() {
		if (this.anInt1432 == this.anInt1430 && this.anInt1429 == this.anInt1431) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1430 * this.anInt1431];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1429; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1432; local24++) {
				local17[local24 + this.anInt1433 + (local21 + this.anInt1434) * this.anInt1430] = this.aByteArray9[local19++];
			}
		}
		this.aByteArray9 = local17;
		this.anInt1432 = this.anInt1430;
		this.anInt1429 = this.anInt1431;
		this.anInt1433 = 0;
		this.anInt1434 = 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public void method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray213.length; local1++) {
			@Pc(11) int local11 = this.anIntArray213[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray213[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray213[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray213[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
