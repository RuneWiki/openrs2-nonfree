import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub4_Sub3_Sub3 extends Class2_Sub4_Sub3 {

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
	public int anInt3233;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
	public int anInt3234;

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
	public int anInt3235;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
	public int anInt3236;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
	public int anInt3237;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
	public int anInt3238;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "()V")
	public void method2238() {
		if (this.anInt3233 == this.anInt3238 && this.anInt3234 == this.anInt3235) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt3238 * this.anInt3235];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt3234; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt3233; local24++) {
				local17[local24 + this.anInt3236 + (local21 + this.anInt3237) * this.anInt3238] = this.aByteArray38[local19++];
			}
		}
		this.aByteArray38 = local17;
		this.anInt3233 = this.anInt3238;
		this.anInt3234 = this.anInt3235;
		this.anInt3236 = 0;
		this.anInt3237 = 0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public void method2239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt3236;
		arg1 += this.anInt3237;
		@Pc(15) int local15 = arg0 + arg1 * Static161.anInt3975;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3234;
		@Pc(23) int local23 = this.anInt3233;
		@Pc(27) int local27 = Static161.anInt3975 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static161.anInt3979) {
			local36 = Static161.anInt3979 - arg1;
			local20 -= local36;
			arg1 = Static161.anInt3979;
			local17 = local36 * local23;
			local15 += local36 * Static161.anInt3975;
		}
		if (arg1 + local20 > Static161.anInt3977) {
			local20 -= arg1 + local20 - Static161.anInt3977;
		}
		if (arg0 < Static161.anInt3976) {
			local36 = Static161.anInt3976 - arg0;
			local23 -= local36;
			arg0 = Static161.anInt3976;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static161.anInt3978) {
			local36 = arg0 + local23 - Static161.anInt3978;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static186.method2240(Static161.anIntArray365, this.aByteArray38, this.anIntArray283, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
	public void method2242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3236;
		arg1 += this.anInt3237;
		@Pc(15) int local15 = arg0 + arg1 * Static161.anInt3975;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3234;
		@Pc(23) int local23 = this.anInt3233;
		@Pc(27) int local27 = Static161.anInt3975 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static161.anInt3979) {
			local36 = Static161.anInt3979 - arg1;
			local20 -= local36;
			arg1 = Static161.anInt3979;
			local17 = local36 * local23;
			local15 += local36 * Static161.anInt3975;
		}
		if (arg1 + local20 > Static161.anInt3977) {
			local20 -= arg1 + local20 - Static161.anInt3977;
		}
		if (arg0 < Static161.anInt3976) {
			local36 = Static161.anInt3976 - arg0;
			local23 -= local36;
			arg0 = Static161.anInt3976;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static161.anInt3978) {
			local36 = arg0 + local23 - Static161.anInt3978;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static186.method2241(Static161.anIntArray365, this.aByteArray38, this.anIntArray283, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V")
	public void method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray283.length; local1++) {
			@Pc(11) int local11 = this.anIntArray283[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray283[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray283[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray283[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
