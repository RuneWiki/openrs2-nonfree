import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class5_Sub2_Sub1_Sub3 extends Class5_Sub2_Sub1 {

	@OriginalMember(owner = "client!n", name = "U", descriptor = "I")
	public int anInt2086;

	@OriginalMember(owner = "client!n", name = "V", descriptor = "I")
	public int anInt2087;

	@OriginalMember(owner = "client!n", name = "W", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!n", name = "X", descriptor = "I")
	public int anInt2088;

	@OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
	public int anInt2090;

	@OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
	public int anInt2091;

	@OriginalMember(owner = "client!n", name = "bb", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	public void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray285.length; local1++) {
			@Pc(11) int local11 = this.anIntArray285[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray285[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray285[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray285[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
	public void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2089;
		arg1 += this.anInt2087;
		@Pc(15) int local15 = arg0 + arg1 * Static46.anInt3188;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2090;
		@Pc(23) int local23 = this.anInt2091;
		@Pc(27) int local27 = Static46.anInt3188 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static46.anInt3189) {
			local36 = Static46.anInt3189 - arg1;
			local20 -= local36;
			arg1 = Static46.anInt3189;
			local17 = local36 * local23;
			local15 += local36 * Static46.anInt3188;
		}
		if (arg1 + local20 > Static46.anInt3190) {
			local20 -= arg1 + local20 - Static46.anInt3190;
		}
		if (arg0 < Static46.anInt3186) {
			local36 = Static46.anInt3186 - arg0;
			local23 -= local36;
			arg0 = Static46.anInt3186;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static46.anInt3185) {
			local36 = arg0 + local23 - Static46.anInt3185;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static137.method1353(Static46.anIntArray385, this.aByteArray31, this.anIntArray285, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "()V")
	public void method1355() {
		if (this.anInt2091 == this.anInt2088 && this.anInt2090 == this.anInt2086) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2088 * this.anInt2086];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2090; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2091; local24++) {
				local17[local24 + this.anInt2089 + (local21 + this.anInt2087) * this.anInt2088] = this.aByteArray31[local19++];
			}
		}
		this.aByteArray31 = local17;
		this.anInt2091 = this.anInt2088;
		this.anInt2090 = this.anInt2086;
		this.anInt2089 = 0;
		this.anInt2087 = 0;
	}
}
