import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class4_Sub4_Sub5_Sub4 extends Class4_Sub4_Sub5 {

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
	public int anInt2607;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
	public int anInt2608;

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
	public int anInt2609;

	@OriginalMember(owner = "client!ue", name = "P", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
	public int anInt2610;

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
	public int anInt2611;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
	public int anInt2612;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()V")
	public void method1834() {
		if (this.anInt2607 == this.anInt2608 && this.anInt2612 == this.anInt2611) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2608 * this.anInt2611];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2612; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2607; local24++) {
				local17[local24 + this.anInt2610 + (local21 + this.anInt2609) * this.anInt2608] = this.aByteArray69[local19++];
			}
		}
		this.aByteArray69 = local17;
		this.anInt2607 = this.anInt2608;
		this.anInt2612 = this.anInt2611;
		this.anInt2610 = 0;
		this.anInt2609 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public void method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray388.length; local1++) {
			@Pc(11) int local11 = this.anIntArray388[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray388[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray388[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray388[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	public void method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2610;
		arg1 += this.anInt2609;
		@Pc(15) int local15 = arg0 + arg1 * Static46.anInt2602;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2612;
		@Pc(23) int local23 = this.anInt2607;
		@Pc(27) int local27 = Static46.anInt2602 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static46.anInt2603) {
			local36 = Static46.anInt2603 - arg1;
			local20 -= local36;
			arg1 = Static46.anInt2603;
			local17 = local36 * local23;
			local15 += local36 * Static46.anInt2602;
		}
		if (arg1 + local20 > Static46.anInt2606) {
			local20 -= arg1 + local20 - Static46.anInt2606;
		}
		if (arg0 < Static46.anInt2605) {
			local36 = Static46.anInt2605 - arg0;
			local23 -= local36;
			arg0 = Static46.anInt2605;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static46.anInt2604) {
			local36 = arg0 + local23 - Static46.anInt2604;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static141.method1837(Static46.anIntArray387, this.aByteArray69, this.anIntArray388, local17, local15, local23, local20, local27, local29);
		}
	}
}
