import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class1_Sub2_Sub2_Sub4 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
	public int anInt2755;

	@OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
	public int anInt2756;

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
	public int anInt2757;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
	public int anInt2758;

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	public int anInt2759;

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
	public int anInt2760;

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub2_Sub4() {
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(III)V")
	private Class1_Sub2_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2760 = this.anInt2756 = arg0;
		this.anInt2755 = this.anInt2758 = arg1;
		this.anInt2759 = this.anInt2757 = 0;
		this.aByteArray39 = new byte[arg0 * arg1];
		this.anIntArray477 = new int[arg2];
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()Lclient!ue;")
	public Class1_Sub2_Sub2_Sub4 method1948() {
		@Pc(10) Class1_Sub2_Sub2_Sub4 local10 = new Class1_Sub2_Sub2_Sub4(this.anInt2756, this.anInt2758, this.anIntArray477.length);
		local10.anInt2760 = this.anInt2760;
		local10.anInt2755 = this.anInt2755;
		local10.anInt2759 = this.anInt2759;
		local10.anInt2757 = this.anInt2757;
		@Pc(30) int local30 = this.aByteArray39.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray39[local32] = this.aByteArray39[local32];
		}
		local30 = this.anIntArray477.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray477[local51] = this.anIntArray477[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public void method1949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray477.length; local1++) {
			@Pc(11) int local11 = this.anIntArray477[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray477[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray477[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray477[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
	public void method1950() {
		@Pc(6) byte[] local6 = new byte[this.anInt2756 * this.anInt2758];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2758; local10++) {
			for (@Pc(16) int local16 = this.anInt2756 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray39[local16 + local10 * this.anInt2756];
			}
		}
		this.aByteArray39 = local6;
		this.anInt2759 = this.anInt2760 - this.anInt2756 - this.anInt2759;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "()V")
	public void method1951() {
		if (this.anInt2756 == this.anInt2760 && this.anInt2758 == this.anInt2755) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2760 * this.anInt2755];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2758; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2756; local24++) {
				local17[local24 + this.anInt2759 + (local21 + this.anInt2757) * this.anInt2760] = this.aByteArray39[local19++];
			}
		}
		this.aByteArray39 = local17;
		this.anInt2756 = this.anInt2760;
		this.anInt2758 = this.anInt2755;
		this.anInt2759 = 0;
		this.anInt2757 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	public void method1953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2759;
		arg1 += this.anInt2757;
		@Pc(15) int local15 = arg0 + arg1 * Static128.anInt2749;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2758;
		@Pc(23) int local23 = this.anInt2756;
		@Pc(27) int local27 = Static128.anInt2749 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static128.anInt2750) {
			local36 = Static128.anInt2750 - arg1;
			local20 -= local36;
			arg1 = Static128.anInt2750;
			local17 = local36 * local23;
			local15 += local36 * Static128.anInt2749;
		}
		if (arg1 + local20 > Static128.anInt2752) {
			local20 -= arg1 + local20 - Static128.anInt2752;
		}
		if (arg0 < Static128.anInt2751) {
			local36 = Static128.anInt2751 - arg0;
			local23 -= local36;
			arg0 = Static128.anInt2751;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static128.anInt2753) {
			local36 = arg0 + local23 - Static128.anInt2753;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static136.method1952(Static128.anIntArray476, this.aByteArray39, this.anIntArray477, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "()V")
	public void method1954() {
		@Pc(6) byte[] local6 = new byte[this.anInt2756 * this.anInt2758];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2758 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2756; local16++) {
				local6[local8++] = this.aByteArray39[local16 + local13 * this.anInt2756];
			}
		}
		this.aByteArray39 = local6;
		this.anInt2757 = this.anInt2755 - this.anInt2758 - this.anInt2757;
	}
}
