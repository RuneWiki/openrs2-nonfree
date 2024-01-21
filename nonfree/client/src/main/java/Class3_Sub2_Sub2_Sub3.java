import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class3_Sub2_Sub2_Sub3 extends Class3_Sub2_Sub2 {

	@OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
	public int anInt1010;

	@OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
	public int anInt1011;

	@OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
	public int anInt1012;

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
	public int anInt1013;

	@OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
	public int anInt1014;

	@OriginalMember(owner = "client!dh", name = "T", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
	public int anInt1015;

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(III)V")
	public void method838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray187.length; local1++) {
			@Pc(11) int local11 = this.anIntArray187[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray187[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray187[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray187[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "()V")
	public void method839() {
		if (this.anInt1013 == this.anInt1010 && this.anInt1014 == this.anInt1015) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1010 * this.anInt1015];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1014; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1013; local24++) {
				local17[local24 + this.anInt1012 + (local21 + this.anInt1011) * this.anInt1010] = this.aByteArray12[local19++];
			}
		}
		this.aByteArray12 = local17;
		this.anInt1013 = this.anInt1010;
		this.anInt1014 = this.anInt1015;
		this.anInt1012 = 0;
		this.anInt1011 = 0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public void method840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1012;
		arg1 += this.anInt1011;
		@Pc(15) int local15 = arg0 + arg1 * Static147.anInt2304;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1014;
		@Pc(23) int local23 = this.anInt1013;
		@Pc(27) int local27 = Static147.anInt2304 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static147.anInt2299) {
			local36 = Static147.anInt2299 - arg1;
			local20 -= local36;
			arg1 = Static147.anInt2299;
			local17 = local36 * local23;
			local15 += local36 * Static147.anInt2304;
		}
		if (arg1 + local20 > Static147.anInt2300) {
			local20 -= arg1 + local20 - Static147.anInt2300;
		}
		if (arg0 < Static147.anInt2301) {
			local36 = Static147.anInt2301 - arg0;
			local23 -= local36;
			arg0 = Static147.anInt2301;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static147.anInt2303) {
			local36 = arg0 + local23 - Static147.anInt2303;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static184.method843(Static147.anIntArray374, this.aByteArray12, this.anIntArray187, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(III)V")
	public void method841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt1012;
		arg1 += this.anInt1011;
		@Pc(15) int local15 = arg0 + arg1 * Static147.anInt2304;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1014;
		@Pc(23) int local23 = this.anInt1013;
		@Pc(27) int local27 = Static147.anInt2304 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static147.anInt2299) {
			local36 = Static147.anInt2299 - arg1;
			local20 -= local36;
			arg1 = Static147.anInt2299;
			local17 = local36 * local23;
			local15 += local36 * Static147.anInt2304;
		}
		if (arg1 + local20 > Static147.anInt2300) {
			local20 -= arg1 + local20 - Static147.anInt2300;
		}
		if (arg0 < Static147.anInt2301) {
			local36 = Static147.anInt2301 - arg0;
			local23 -= local36;
			arg0 = Static147.anInt2301;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static147.anInt2303) {
			local36 = arg0 + local23 - Static147.anInt2303;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static184.method842(Static147.anIntArray374, this.aByteArray12, this.anIntArray187, local17, local15, local23, local20, local27, local29, arg2);
		}
	}
}
