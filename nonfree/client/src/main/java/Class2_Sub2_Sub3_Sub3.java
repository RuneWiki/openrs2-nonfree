import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class2_Sub2_Sub3_Sub3 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
	public int anInt1448;

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
	public int anInt1449;

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
	public int anInt1450;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
	public int anInt1451;

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
	public int anInt1452;

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
	public int anInt1453;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
	public void method1019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1448;
		arg1 += this.anInt1453;
		@Pc(15) int local15 = arg0 + arg1 * Static113.anInt1736;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1449;
		@Pc(23) int local23 = this.anInt1451;
		@Pc(27) int local27 = Static113.anInt1736 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static113.anInt1737) {
			local36 = Static113.anInt1737 - arg1;
			local20 -= local36;
			arg1 = Static113.anInt1737;
			local17 = local36 * local23;
			local15 += local36 * Static113.anInt1736;
		}
		if (arg1 + local20 > Static113.anInt1739) {
			local20 -= arg1 + local20 - Static113.anInt1739;
		}
		if (arg0 < Static113.anInt1734) {
			local36 = Static113.anInt1734 - arg0;
			local23 -= local36;
			arg0 = Static113.anInt1734;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static113.anInt1735) {
			local36 = arg0 + local23 - Static113.anInt1735;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static185.method1021(Static113.anIntArray275, this.aByteArray24, this.anIntArray229, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	public void method1020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt1448;
		arg1 += this.anInt1453;
		@Pc(15) int local15 = arg0 + arg1 * Static113.anInt1736;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1449;
		@Pc(23) int local23 = this.anInt1451;
		@Pc(27) int local27 = Static113.anInt1736 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static113.anInt1737) {
			local36 = Static113.anInt1737 - arg1;
			local20 -= local36;
			arg1 = Static113.anInt1737;
			local17 = local36 * local23;
			local15 += local36 * Static113.anInt1736;
		}
		if (arg1 + local20 > Static113.anInt1739) {
			local20 -= arg1 + local20 - Static113.anInt1739;
		}
		if (arg0 < Static113.anInt1734) {
			local36 = Static113.anInt1734 - arg0;
			local23 -= local36;
			arg0 = Static113.anInt1734;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static113.anInt1735) {
			local36 = arg0 + local23 - Static113.anInt1735;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static185.method1018(Static113.anIntArray275, this.aByteArray24, this.anIntArray229, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)V")
	public void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray229.length; local1++) {
			@Pc(11) int local11 = this.anIntArray229[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray229[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray229[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray229[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
