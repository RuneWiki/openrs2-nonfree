import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class3_Sub1_Sub3_Sub3 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
	public int anInt1914;

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
	public int anInt1915;

	@OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
	public int anInt1916;

	@OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
	public int anInt1917;

	@OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
	public int anInt1918;

	@OriginalMember(owner = "client!kf", name = "X", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!kf", name = "Y", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
	public int anInt1919;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
	public void method1490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt1918;
		arg1 += this.anInt1919;
		@Pc(15) int local15 = arg0 + arg1 * Static15.anInt3218;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1914;
		@Pc(23) int local23 = this.anInt1917;
		@Pc(27) int local27 = Static15.anInt3218 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static15.anInt3220) {
			local36 = Static15.anInt3220 - arg1;
			local20 -= local36;
			arg1 = Static15.anInt3220;
			local17 = local36 * local23;
			local15 += local36 * Static15.anInt3218;
		}
		if (arg1 + local20 > Static15.anInt3217) {
			local20 -= arg1 + local20 - Static15.anInt3217;
		}
		if (arg0 < Static15.anInt3219) {
			local36 = Static15.anInt3219 - arg0;
			local23 -= local36;
			arg0 = Static15.anInt3219;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static15.anInt3215) {
			local36 = arg0 + local23 - Static15.anInt3215;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static186.method1491(Static15.anIntArray335, this.aByteArray17, this.anIntArray196, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V")
	public void method1492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray196.length; local1++) {
			@Pc(11) int local11 = this.anIntArray196[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray196[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray196[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray196[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
	public void method1493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1918;
		arg1 += this.anInt1919;
		@Pc(15) int local15 = arg0 + arg1 * Static15.anInt3218;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1914;
		@Pc(23) int local23 = this.anInt1917;
		@Pc(27) int local27 = Static15.anInt3218 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static15.anInt3220) {
			local36 = Static15.anInt3220 - arg1;
			local20 -= local36;
			arg1 = Static15.anInt3220;
			local17 = local36 * local23;
			local15 += local36 * Static15.anInt3218;
		}
		if (arg1 + local20 > Static15.anInt3217) {
			local20 -= arg1 + local20 - Static15.anInt3217;
		}
		if (arg0 < Static15.anInt3219) {
			local36 = Static15.anInt3219 - arg0;
			local23 -= local36;
			arg0 = Static15.anInt3219;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static15.anInt3215) {
			local36 = arg0 + local23 - Static15.anInt3215;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static186.method1494(Static15.anIntArray335, this.aByteArray17, this.anIntArray196, local17, local15, local23, local20, local27, local29);
		}
	}
}
