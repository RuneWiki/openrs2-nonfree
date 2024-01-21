import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class6_Sub3_Sub3_Sub3 extends Class6_Sub3_Sub3 {

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
	public int anInt2686;

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
	public int anInt2687;

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
	public int anInt2688;

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
	public int anInt2689;

	@OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
	public int anInt2690;

	@OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
	public int anInt2691;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub3_Sub3() {
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(III)V")
	private Class6_Sub3_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2688 = this.anInt2689 = arg0;
		this.anInt2691 = this.anInt2687 = arg1;
		this.anInt2686 = this.anInt2690 = 0;
		this.aByteArray31 = new byte[arg0 * arg1];
		this.anIntArray290 = new int[arg2];
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()V")
	public void method1763() {
		if (this.anInt2689 == this.anInt2688 && this.anInt2687 == this.anInt2691) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2688 * this.anInt2691];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2687; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2689; local24++) {
				local17[local24 + this.anInt2686 + (local21 + this.anInt2690) * this.anInt2688] = this.aByteArray31[local19++];
			}
		}
		this.aByteArray31 = local17;
		this.anInt2689 = this.anInt2688;
		this.anInt2687 = this.anInt2691;
		this.anInt2686 = 0;
		this.anInt2690 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "()V")
	public void method1764() {
		@Pc(6) byte[] local6 = new byte[this.anInt2689 * this.anInt2687];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2687; local10++) {
			for (@Pc(16) int local16 = this.anInt2689 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray31[local16 + local10 * this.anInt2689];
			}
		}
		this.aByteArray31 = local6;
		this.anInt2686 = this.anInt2688 - this.anInt2689 - this.anInt2686;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "()V")
	public void method1766() {
		@Pc(6) byte[] local6 = new byte[this.anInt2689 * this.anInt2687];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2687 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2689; local16++) {
				local6[local8++] = this.aByteArray31[local16 + local13 * this.anInt2689];
			}
		}
		this.aByteArray31 = local6;
		this.anInt2690 = this.anInt2691 - this.anInt2687 - this.anInt2690;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V")
	public void method1767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray290.length; local1++) {
			@Pc(11) int local11 = this.anIntArray290[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray290[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray290[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray290[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public void method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2686;
		arg1 += this.anInt2690;
		@Pc(15) int local15 = arg0 + arg1 * Static121.anInt2988;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2687;
		@Pc(23) int local23 = this.anInt2689;
		@Pc(27) int local27 = Static121.anInt2988 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static121.anInt2989) {
			local36 = Static121.anInt2989 - arg1;
			local20 -= local36;
			arg1 = Static121.anInt2989;
			local17 = local36 * local23;
			local15 += local36 * Static121.anInt2988;
		}
		if (arg1 + local20 > Static121.anInt2987) {
			local20 -= arg1 + local20 - Static121.anInt2987;
		}
		if (arg0 < Static121.anInt2986) {
			local36 = Static121.anInt2986 - arg0;
			local23 -= local36;
			arg0 = Static121.anInt2986;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static121.anInt2985) {
			local36 = arg0 + local23 - Static121.anInt2985;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static131.method1765(Static121.anIntArray338, this.aByteArray31, this.anIntArray290, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "()Lclient!ra;")
	public Class6_Sub3_Sub3_Sub3 method1769() {
		@Pc(10) Class6_Sub3_Sub3_Sub3 local10 = new Class6_Sub3_Sub3_Sub3(this.anInt2689, this.anInt2687, this.anIntArray290.length);
		local10.anInt2688 = this.anInt2688;
		local10.anInt2691 = this.anInt2691;
		local10.anInt2686 = this.anInt2686;
		local10.anInt2690 = this.anInt2690;
		@Pc(30) int local30 = this.aByteArray31.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray31[local32] = this.aByteArray31[local32];
		}
		local30 = this.anIntArray290.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray290[local51] = this.anIntArray290[local51];
		}
		return local10;
	}
}
