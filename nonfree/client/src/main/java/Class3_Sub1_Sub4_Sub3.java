import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class3_Sub1_Sub4_Sub3 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
	public int anInt2602;

	@OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
	public int anInt2603;

	@OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
	public int anInt2604;

	@OriginalMember(owner = "client!uc", name = "mb", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!uc", name = "nb", descriptor = "I")
	public int anInt2605;

	@OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
	public int anInt2606;

	@OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
	public int anInt2607;

	@OriginalMember(owner = "client!uc", name = "qb", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4_Sub3() {
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(III)V")
	private Class3_Sub1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2605 = this.anInt2604 = arg0;
		this.anInt2607 = this.anInt2606 = arg1;
		this.anInt2602 = this.anInt2603 = 0;
		this.aByteArray22 = new byte[arg0 * arg1];
		this.anIntArray327 = new int[arg2];
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
	public void method1767() {
		@Pc(6) byte[] local6 = new byte[this.anInt2604 * this.anInt2606];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2606; local10++) {
			for (@Pc(16) int local16 = this.anInt2604 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray22[local16 + local10 * this.anInt2604];
			}
		}
		this.aByteArray22 = local6;
		this.anInt2602 = this.anInt2605 - this.anInt2604 - this.anInt2602;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "()Lclient!uc;")
	public Class3_Sub1_Sub4_Sub3 method1768() {
		@Pc(10) Class3_Sub1_Sub4_Sub3 local10 = new Class3_Sub1_Sub4_Sub3(this.anInt2604, this.anInt2606, this.anIntArray327.length);
		local10.anInt2605 = this.anInt2605;
		local10.anInt2607 = this.anInt2607;
		local10.anInt2602 = this.anInt2602;
		local10.anInt2603 = this.anInt2603;
		@Pc(30) int local30 = this.aByteArray22.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray22[local32] = this.aByteArray22[local32];
		}
		local30 = this.anIntArray327.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray327[local51] = this.anIntArray327[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "()V")
	public void method1770() {
		@Pc(6) byte[] local6 = new byte[this.anInt2604 * this.anInt2606];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2606 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2604; local16++) {
				local6[local8++] = this.aByteArray22[local16 + local13 * this.anInt2604];
			}
		}
		this.aByteArray22 = local6;
		this.anInt2603 = this.anInt2607 - this.anInt2606 - this.anInt2603;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	public void method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2602;
		arg1 += this.anInt2603;
		@Pc(15) int local15 = arg0 + arg1 * Static50.anInt2730;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2606;
		@Pc(23) int local23 = this.anInt2604;
		@Pc(27) int local27 = Static50.anInt2730 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static50.anInt2725) {
			local36 = Static50.anInt2725 - arg1;
			local20 -= local36;
			arg1 = Static50.anInt2725;
			local17 = local36 * local23;
			local15 += local36 * Static50.anInt2730;
		}
		if (arg1 + local20 > Static50.anInt2728) {
			local20 -= arg1 + local20 - Static50.anInt2728;
		}
		if (arg0 < Static50.anInt2727) {
			local36 = Static50.anInt2727 - arg0;
			local23 -= local36;
			arg0 = Static50.anInt2727;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static50.anInt2729) {
			local36 = arg0 + local23 - Static50.anInt2729;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static121.method1769(Static50.anIntArray332, this.aByteArray22, this.anIntArray327, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray327.length; local1++) {
			@Pc(11) int local11 = this.anIntArray327[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray327[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray327[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray327[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "()V")
	public void method1773() {
		if (this.anInt2604 == this.anInt2605 && this.anInt2606 == this.anInt2607) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2605 * this.anInt2607];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2606; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2604; local24++) {
				local17[local24 + this.anInt2602 + (local21 + this.anInt2603) * this.anInt2605] = this.aByteArray22[local19++];
			}
		}
		this.aByteArray22 = local17;
		this.anInt2604 = this.anInt2605;
		this.anInt2606 = this.anInt2607;
		this.anInt2602 = 0;
		this.anInt2603 = 0;
	}
}
