import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class3_Sub1_Sub1_Sub4 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!oc", name = "eb", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
	public int anInt2247;

	@OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
	public int anInt2248;

	@OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
	public int anInt2249;

	@OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
	public int anInt2250;

	@OriginalMember(owner = "client!oc", name = "jb", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!oc", name = "kb", descriptor = "I")
	public int anInt2251;

	@OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
	public int anInt2252;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub1_Sub4() {
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(III)V")
	private Class3_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2248 = this.anInt2250 = arg0;
		this.anInt2251 = this.anInt2252 = arg1;
		this.anInt2247 = this.anInt2249 = 0;
		this.aByteArray30 = new byte[arg0 * arg1];
		this.anIntArray190 = new int[arg2];
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "()V")
	public void method1500() {
		@Pc(6) byte[] local6 = new byte[this.anInt2250 * this.anInt2252];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2252 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2250; local16++) {
				local6[local8++] = this.aByteArray30[local16 + local13 * this.anInt2250];
			}
		}
		this.aByteArray30 = local6;
		this.anInt2249 = this.anInt2251 - this.anInt2252 - this.anInt2249;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "()V")
	public void method1501() {
		@Pc(6) byte[] local6 = new byte[this.anInt2250 * this.anInt2252];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2252; local10++) {
			for (@Pc(16) int local16 = this.anInt2250 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray30[local16 + local10 * this.anInt2250];
			}
		}
		this.aByteArray30 = local6;
		this.anInt2247 = this.anInt2248 - this.anInt2250 - this.anInt2247;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	public void method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray190.length; local1++) {
			@Pc(11) int local11 = this.anIntArray190[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray190[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray190[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray190[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "()V")
	public void method1503() {
		if (this.anInt2250 == this.anInt2248 && this.anInt2252 == this.anInt2251) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2248 * this.anInt2251];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2252; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2250; local24++) {
				local17[local24 + this.anInt2247 + (local21 + this.anInt2249) * this.anInt2248] = this.aByteArray30[local19++];
			}
		}
		this.aByteArray30 = local17;
		this.anInt2250 = this.anInt2248;
		this.anInt2252 = this.anInt2251;
		this.anInt2247 = 0;
		this.anInt2249 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public void method1504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2247;
		arg1 += this.anInt2249;
		@Pc(15) int local15 = arg0 + arg1 * Static6.anInt2244;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2252;
		@Pc(23) int local23 = this.anInt2250;
		@Pc(27) int local27 = Static6.anInt2244 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static6.anInt2241) {
			local36 = Static6.anInt2241 - arg1;
			local20 -= local36;
			arg1 = Static6.anInt2241;
			local17 = local36 * local23;
			local15 += local36 * Static6.anInt2244;
		}
		if (arg1 + local20 > Static6.anInt2246) {
			local20 -= arg1 + local20 - Static6.anInt2246;
		}
		if (arg0 < Static6.anInt2243) {
			local36 = Static6.anInt2243 - arg0;
			local23 -= local36;
			arg0 = Static6.anInt2243;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static6.anInt2242) {
			local36 = arg0 + local23 - Static6.anInt2242;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static131.method1505(Static6.anIntArray189, this.aByteArray30, this.anIntArray190, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "()Lclient!oc;")
	public Class3_Sub1_Sub1_Sub4 method1506() {
		@Pc(10) Class3_Sub1_Sub1_Sub4 local10 = new Class3_Sub1_Sub1_Sub4(this.anInt2250, this.anInt2252, this.anIntArray190.length);
		local10.anInt2248 = this.anInt2248;
		local10.anInt2251 = this.anInt2251;
		local10.anInt2247 = this.anInt2247;
		local10.anInt2249 = this.anInt2249;
		@Pc(30) int local30 = this.aByteArray30.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray30[local32] = this.aByteArray30[local32];
		}
		local30 = this.anIntArray190.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray190[local51] = this.anIntArray190[local51];
		}
		return local10;
	}
}
