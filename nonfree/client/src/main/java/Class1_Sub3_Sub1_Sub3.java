import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class1_Sub3_Sub1_Sub3 extends Class1_Sub3_Sub1 {

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
	public int anInt2442;

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
	public int anInt2443;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
	public int anInt2444;

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
	public int anInt2445;

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
	public int anInt2446;

	@OriginalMember(owner = "client!qc", name = "eb", descriptor = "I")
	public int anInt2447;

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "[I")
	public int[] anIntArray374;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
	public void method1684() {
		if (this.anInt2443 == this.anInt2445 && this.anInt2442 == this.anInt2446) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2445 * this.anInt2446];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2442; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2443; local24++) {
				local17[local24 + this.anInt2447 + (local21 + this.anInt2444) * this.anInt2445] = this.aByteArray33[local19++];
			}
		}
		this.aByteArray33 = local17;
		this.anInt2443 = this.anInt2445;
		this.anInt2442 = this.anInt2446;
		this.anInt2447 = 0;
		this.anInt2444 = 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
	public void method1686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray374.length; local1++) {
			@Pc(11) int local11 = this.anIntArray374[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray374[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray374[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray374[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
	public void method1687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2447;
		arg1 += this.anInt2444;
		@Pc(15) int local15 = arg0 + arg1 * Static33.anInt2810;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2442;
		@Pc(23) int local23 = this.anInt2443;
		@Pc(27) int local27 = Static33.anInt2810 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static33.anInt2811) {
			local36 = Static33.anInt2811 - arg1;
			local20 -= local36;
			arg1 = Static33.anInt2811;
			local17 = local36 * local23;
			local15 += local36 * Static33.anInt2810;
		}
		if (arg1 + local20 > Static33.anInt2806) {
			local20 -= arg1 + local20 - Static33.anInt2806;
		}
		if (arg0 < Static33.anInt2809) {
			local36 = Static33.anInt2809 - arg0;
			local23 -= local36;
			arg0 = Static33.anInt2809;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static33.anInt2807) {
			local36 = arg0 + local23 - Static33.anInt2807;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static137.method1685(Static33.anIntArray421, this.aByteArray33, this.anIntArray374, local17, local15, local23, local20, local27, local29);
		}
	}
}
