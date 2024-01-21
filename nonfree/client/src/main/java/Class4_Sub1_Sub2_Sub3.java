import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class4_Sub1_Sub2_Sub3 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
	public int anInt1205;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
	public int anInt1206;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
	public int anInt1207;

	@OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
	public int anInt1208;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
	public int anInt1209;

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
	public int anInt1210;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "()V")
	public void method852() {
		if (this.anInt1206 == this.anInt1208 && this.anInt1210 == this.anInt1207) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1208 * this.anInt1207];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1210; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1206; local24++) {
				local17[local24 + this.anInt1209 + (local21 + this.anInt1205) * this.anInt1208] = this.aByteArray11[local19++];
			}
		}
		this.aByteArray11 = local17;
		this.anInt1206 = this.anInt1208;
		this.anInt1210 = this.anInt1207;
		this.anInt1209 = 0;
		this.anInt1205 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
	public void method853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1209;
		arg1 += this.anInt1205;
		@Pc(15) int local15 = arg0 + arg1 * Static118.anInt2114;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1210;
		@Pc(23) int local23 = this.anInt1206;
		@Pc(27) int local27 = Static118.anInt2114 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static118.anInt2111) {
			local36 = Static118.anInt2111 - arg1;
			local20 -= local36;
			arg1 = Static118.anInt2111;
			local17 = local36 * local23;
			local15 += local36 * Static118.anInt2114;
		}
		if (arg1 + local20 > Static118.anInt2113) {
			local20 -= arg1 + local20 - Static118.anInt2113;
		}
		if (arg0 < Static118.anInt2112) {
			local36 = Static118.anInt2112 - arg0;
			local23 -= local36;
			arg0 = Static118.anInt2112;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static118.anInt2115) {
			local36 = arg0 + local23 - Static118.anInt2115;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static138.method854(Static118.anIntArray213, this.aByteArray11, this.anIntArray132, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
	public void method855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray132.length; local1++) {
			@Pc(11) int local11 = this.anIntArray132[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray132[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray132[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray132[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
