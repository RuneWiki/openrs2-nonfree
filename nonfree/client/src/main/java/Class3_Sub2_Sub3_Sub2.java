import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class3_Sub2_Sub3_Sub2 extends Class3_Sub2_Sub3 {

	@OriginalMember(owner = "client!na", name = "F", descriptor = "I")
	public int anInt2492;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "I")
	public int anInt2493;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "I")
	public int anInt2494;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "I")
	public int anInt2495;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "I")
	public int anInt2496;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "I")
	public int anInt2497;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	public void method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt2497;
		arg1 += this.anInt2493;
		@Pc(15) int local15 = arg0 + arg1 * Static103.anInt3089;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2495;
		@Pc(23) int local23 = this.anInt2494;
		@Pc(27) int local27 = Static103.anInt3089 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static103.anInt3090) {
			local36 = Static103.anInt3090 - arg1;
			local20 -= local36;
			arg1 = Static103.anInt3090;
			local17 = local36 * local23;
			local15 += local36 * Static103.anInt3089;
		}
		if (arg1 + local20 > Static103.anInt3087) {
			local20 -= arg1 + local20 - Static103.anInt3087;
		}
		if (arg0 < Static103.anInt3091) {
			local36 = Static103.anInt3091 - arg0;
			local23 -= local36;
			arg0 = Static103.anInt3091;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static103.anInt3092) {
			local36 = arg0 + local23 - Static103.anInt3092;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static185.method1711(Static103.anIntArray344, this.aByteArray20, this.anIntArray250, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	public void method1712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray250.length; local1++) {
			@Pc(11) int local11 = this.anIntArray250[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray250[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray250[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray250[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public void method1713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2497;
		arg1 += this.anInt2493;
		@Pc(15) int local15 = arg0 + arg1 * Static103.anInt3089;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2495;
		@Pc(23) int local23 = this.anInt2494;
		@Pc(27) int local27 = Static103.anInt3089 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static103.anInt3090) {
			local36 = Static103.anInt3090 - arg1;
			local20 -= local36;
			arg1 = Static103.anInt3090;
			local17 = local36 * local23;
			local15 += local36 * Static103.anInt3089;
		}
		if (arg1 + local20 > Static103.anInt3087) {
			local20 -= arg1 + local20 - Static103.anInt3087;
		}
		if (arg0 < Static103.anInt3091) {
			local36 = Static103.anInt3091 - arg0;
			local23 -= local36;
			arg0 = Static103.anInt3091;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static103.anInt3092) {
			local36 = arg0 + local23 - Static103.anInt3092;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static185.method1709(Static103.anIntArray344, this.aByteArray20, this.anIntArray250, local17, local15, local23, local20, local27, local29);
		}
	}
}
