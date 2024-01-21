import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub1_Sub4_Sub3 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
	public int anInt2728;

	@OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
	public int anInt2729;

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
	public int anInt2730;

	@OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
	public int anInt2731;

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
	public int anInt2732;

	@OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
	public int anInt2733;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4_Sub3() {
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(III)V")
	private Class2_Sub1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2731 = this.anInt2733 = arg0;
		this.anInt2730 = this.anInt2729 = arg1;
		this.anInt2728 = this.anInt2732 = 0;
		this.aByteArray24 = new byte[arg0 * arg1];
		this.anIntArray331 = new int[arg2];
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)V")
	public void method1940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray331.length; local1++) {
			@Pc(11) int local11 = this.anIntArray331[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray331[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray331[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray331[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
	public void method1942() {
		@Pc(6) byte[] local6 = new byte[this.anInt2733 * this.anInt2729];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2729; local10++) {
			for (@Pc(16) int local16 = this.anInt2733 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray24[local16 + local10 * this.anInt2733];
			}
		}
		this.aByteArray24 = local6;
		this.anInt2728 = this.anInt2731 - this.anInt2733 - this.anInt2728;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "()Lclient!uc;")
	public Class2_Sub1_Sub4_Sub3 method1943() {
		@Pc(10) Class2_Sub1_Sub4_Sub3 local10 = new Class2_Sub1_Sub4_Sub3(this.anInt2733, this.anInt2729, this.anIntArray331.length);
		local10.anInt2731 = this.anInt2731;
		local10.anInt2730 = this.anInt2730;
		local10.anInt2728 = this.anInt2728;
		local10.anInt2732 = this.anInt2732;
		@Pc(30) int local30 = this.aByteArray24.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray24[local32] = this.aByteArray24[local32];
		}
		local30 = this.anIntArray331.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray331[local51] = this.anIntArray331[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "()V")
	public void method1944() {
		@Pc(6) byte[] local6 = new byte[this.anInt2733 * this.anInt2729];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2729 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2733; local16++) {
				local6[local8++] = this.aByteArray24[local16 + local13 * this.anInt2733];
			}
		}
		this.aByteArray24 = local6;
		this.anInt2732 = this.anInt2730 - this.anInt2729 - this.anInt2732;
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "()V")
	public void method1945() {
		if (this.anInt2733 == this.anInt2731 && this.anInt2729 == this.anInt2730) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2731 * this.anInt2730];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2729; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2733; local24++) {
				local17[local24 + this.anInt2728 + (local21 + this.anInt2732) * this.anInt2731] = this.aByteArray24[local19++];
			}
		}
		this.aByteArray24 = local17;
		this.anInt2733 = this.anInt2731;
		this.anInt2729 = this.anInt2730;
		this.anInt2728 = 0;
		this.anInt2732 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V")
	public void method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2728;
		arg1 += this.anInt2732;
		@Pc(15) int local15 = arg0 + arg1 * Static91.anInt2836;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2729;
		@Pc(23) int local23 = this.anInt2733;
		@Pc(27) int local27 = Static91.anInt2836 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static91.anInt2834) {
			local36 = Static91.anInt2834 - arg1;
			local20 -= local36;
			arg1 = Static91.anInt2834;
			local17 = local36 * local23;
			local15 += local36 * Static91.anInt2836;
		}
		if (arg1 + local20 > Static91.anInt2832) {
			local20 -= arg1 + local20 - Static91.anInt2832;
		}
		if (arg0 < Static91.anInt2835) {
			local36 = Static91.anInt2835 - arg0;
			local23 -= local36;
			arg0 = Static91.anInt2835;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static91.anInt2837) {
			local36 = arg0 + local23 - Static91.anInt2837;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static117.method1941(Static91.anIntArray354, this.aByteArray24, this.anIntArray331, local17, local15, local23, local20, local27, local29);
		}
	}
}
