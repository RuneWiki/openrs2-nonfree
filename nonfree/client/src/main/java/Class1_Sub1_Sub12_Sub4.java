import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class1_Sub1_Sub12_Sub4 extends Class1_Sub1_Sub12 {

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "[I")
	public int[] anIntArray535;

	@OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
	public int anInt3903;

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
	public int anInt3904;

	@OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
	public int anInt3905;

	@OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
	public int anInt3906;

	@OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
	public int anInt3907;

	@OriginalMember(owner = "client!tg", name = "U", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)V")
	public void method2744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray535.length; local1++) {
			@Pc(11) int local11 = this.anIntArray535[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray535[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray535[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray535[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	public void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3904;
		arg1 += this.anInt3906;
		@Pc(15) int local15 = arg0 + arg1 * Static150.anInt4227;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3907;
		@Pc(23) int local23 = this.anInt3905;
		@Pc(27) int local27 = Static150.anInt4227 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static150.anInt4225) {
			local36 = Static150.anInt4225 - arg1;
			local20 -= local36;
			arg1 = Static150.anInt4225;
			local17 = local36 * local23;
			local15 += local36 * Static150.anInt4227;
		}
		if (arg1 + local20 > Static150.anInt4228) {
			local20 -= arg1 + local20 - Static150.anInt4228;
		}
		if (arg0 < Static150.anInt4229) {
			local36 = Static150.anInt4229 - arg0;
			local23 -= local36;
			arg0 = Static150.anInt4229;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static150.anInt4224) {
			local36 = arg0 + local23 - Static150.anInt4224;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static188.method2748(Static150.anIntArray586, this.aByteArray44, this.anIntArray535, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(III)V")
	public void method2747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt3904;
		arg1 += this.anInt3906;
		@Pc(15) int local15 = arg0 + arg1 * Static150.anInt4227;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3907;
		@Pc(23) int local23 = this.anInt3905;
		@Pc(27) int local27 = Static150.anInt4227 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static150.anInt4225) {
			local36 = Static150.anInt4225 - arg1;
			local20 -= local36;
			arg1 = Static150.anInt4225;
			local17 = local36 * local23;
			local15 += local36 * Static150.anInt4227;
		}
		if (arg1 + local20 > Static150.anInt4228) {
			local20 -= arg1 + local20 - Static150.anInt4228;
		}
		if (arg0 < Static150.anInt4229) {
			local36 = Static150.anInt4229 - arg0;
			local23 -= local36;
			arg0 = Static150.anInt4229;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static150.anInt4224) {
			local36 = arg0 + local23 - Static150.anInt4224;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static188.method2745(Static150.anIntArray586, this.aByteArray44, this.anIntArray535, local17, local15, local23, local20, local27, local29, arg2);
		}
	}
}
