import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class3_Sub1_Sub4_Sub1 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!ce", name = "gb", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!ce", name = "ib", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!ce", name = "jb", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!ce", name = "kb", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!ce", name = "lb", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public void method345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt507;
		arg1 += this.anInt510;
		@Pc(15) int local15 = arg0 + arg1 * Static77.anInt3239;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt511;
		@Pc(23) int local23 = this.anInt509;
		@Pc(27) int local27 = Static77.anInt3239 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static77.anInt3243) {
			local36 = Static77.anInt3243 - arg1;
			local20 -= local36;
			arg1 = Static77.anInt3243;
			local17 = local36 * local23;
			local15 += local36 * Static77.anInt3239;
		}
		if (arg1 + local20 > Static77.anInt3240) {
			local20 -= arg1 + local20 - Static77.anInt3240;
		}
		if (arg0 < Static77.anInt3241) {
			local36 = Static77.anInt3241 - arg0;
			local23 -= local36;
			arg0 = Static77.anInt3241;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static77.anInt3238) {
			local36 = arg0 + local23 - Static77.anInt3238;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static134.method348(Static77.anIntArray389, this.aByteArray2, this.anIntArray60, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	public void method346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray60.length; local1++) {
			@Pc(11) int local11 = this.anIntArray60[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray60[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray60[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray60[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "()V")
	public void method347() {
		if (this.anInt509 == this.anInt508 && this.anInt511 == this.anInt506) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt508 * this.anInt506];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt511; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt509; local24++) {
				local17[local24 + this.anInt507 + (local21 + this.anInt510) * this.anInt508] = this.aByteArray2[local19++];
			}
		}
		this.aByteArray2 = local17;
		this.anInt509 = this.anInt508;
		this.anInt511 = this.anInt506;
		this.anInt507 = 0;
		this.anInt510 = 0;
	}
}
