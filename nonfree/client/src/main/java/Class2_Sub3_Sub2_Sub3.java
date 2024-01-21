import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub3_Sub2_Sub3 extends Class2_Sub3_Sub2 {

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
	public int anInt3617;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	public int anInt3618;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
	public int anInt3619;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
	public int anInt3620;

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
	public int anInt3621;

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
	public int anInt3622;

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	public void method2398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3619;
		arg1 += this.anInt3622;
		@Pc(15) int local15 = arg0 + arg1 * Static53.anInt3699;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3621;
		@Pc(23) int local23 = this.anInt3620;
		@Pc(27) int local27 = Static53.anInt3699 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static53.anInt3698) {
			local36 = Static53.anInt3698 - arg1;
			local20 -= local36;
			arg1 = Static53.anInt3698;
			local17 = local36 * local23;
			local15 += local36 * Static53.anInt3699;
		}
		if (arg1 + local20 > Static53.anInt3697) {
			local20 -= arg1 + local20 - Static53.anInt3697;
		}
		if (arg0 < Static53.anInt3700) {
			local36 = Static53.anInt3700 - arg0;
			local23 -= local36;
			arg0 = Static53.anInt3700;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static53.anInt3696) {
			local36 = arg0 + local23 - Static53.anInt3696;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static188.method2400(Static53.anIntArray370, this.aByteArray46, this.anIntArray357, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	public void method2401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt3619;
		arg1 += this.anInt3622;
		@Pc(15) int local15 = arg0 + arg1 * Static53.anInt3699;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3621;
		@Pc(23) int local23 = this.anInt3620;
		@Pc(27) int local27 = Static53.anInt3699 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static53.anInt3698) {
			local36 = Static53.anInt3698 - arg1;
			local20 -= local36;
			arg1 = Static53.anInt3698;
			local17 = local36 * local23;
			local15 += local36 * Static53.anInt3699;
		}
		if (arg1 + local20 > Static53.anInt3697) {
			local20 -= arg1 + local20 - Static53.anInt3697;
		}
		if (arg0 < Static53.anInt3700) {
			local36 = Static53.anInt3700 - arg0;
			local23 -= local36;
			arg0 = Static53.anInt3700;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static53.anInt3696) {
			local36 = arg0 + local23 - Static53.anInt3696;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static188.method2399(Static53.anIntArray370, this.aByteArray46, this.anIntArray357, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V")
	public void method2402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray357.length; local1++) {
			@Pc(11) int local11 = this.anIntArray357[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray357[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray357[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray357[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
