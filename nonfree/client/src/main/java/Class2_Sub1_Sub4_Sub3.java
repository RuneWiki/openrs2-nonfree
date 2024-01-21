import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class2_Sub1_Sub4_Sub3 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
	public int anInt2630;

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
	public int anInt2631;

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
	public int anInt2632;

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
	public int anInt2633;

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
	public int anInt2634;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	public void method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2631;
		arg1 += this.anInt2630;
		@Pc(15) int local15 = arg0 + arg1 * Static172.anInt2832;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2632;
		@Pc(23) int local23 = this.anInt2635;
		@Pc(27) int local27 = Static172.anInt2832 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static172.anInt2833) {
			local36 = Static172.anInt2833 - arg1;
			local20 -= local36;
			arg1 = Static172.anInt2833;
			local17 = local36 * local23;
			local15 += local36 * Static172.anInt2832;
		}
		if (arg1 + local20 > Static172.anInt2828) {
			local20 -= arg1 + local20 - Static172.anInt2828;
		}
		if (arg0 < Static172.anInt2831) {
			local36 = Static172.anInt2831 - arg0;
			local23 -= local36;
			arg0 = Static172.anInt2831;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static172.anInt2830) {
			local36 = arg0 + local23 - Static172.anInt2830;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static185.method1875(Static172.anIntArray298, this.aByteArray34, this.anIntArray279, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
	public void method1876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray279.length; local1++) {
			@Pc(11) int local11 = this.anIntArray279[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray279[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray279[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray279[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
