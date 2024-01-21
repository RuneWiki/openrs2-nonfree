import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class5_Sub2_Sub6_Sub4 extends Class5_Sub2_Sub6 {

	@OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
	public int anInt2726;

	@OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
	public int anInt2727;

	@OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
	public int anInt2728;

	@OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
	public int anInt2729;

	@OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
	public int anInt2730;

	@OriginalMember(owner = "client!sc", name = "eb", descriptor = "[I")
	public int[] anIntArray415;

	@OriginalMember(owner = "client!sc", name = "fb", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!sc", name = "gb", descriptor = "I")
	public int anInt2731;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub6_Sub4() {
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V")
	private Class5_Sub2_Sub6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2726 = this.anInt2731 = arg0;
		this.anInt2730 = this.anInt2727 = arg1;
		this.anInt2729 = this.anInt2728 = 0;
		this.aByteArray37 = new byte[arg0 * arg1];
		this.anIntArray415 = new int[arg2];
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "()V")
	public void method1873() {
		@Pc(6) byte[] local6 = new byte[this.anInt2731 * this.anInt2727];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2727 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2731; local16++) {
				local6[local8++] = this.aByteArray37[local16 + local13 * this.anInt2731];
			}
		}
		this.aByteArray37 = local6;
		this.anInt2728 = this.anInt2730 - this.anInt2727 - this.anInt2728;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
	public void method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2729;
		arg1 += this.anInt2728;
		@Pc(15) int local15 = arg0 + arg1 * Static118.anInt2722;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2727;
		@Pc(23) int local23 = this.anInt2731;
		@Pc(27) int local27 = Static118.anInt2722 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static118.anInt2724) {
			local36 = Static118.anInt2724 - arg1;
			local20 -= local36;
			arg1 = Static118.anInt2724;
			local17 = local36 * local23;
			local15 += local36 * Static118.anInt2722;
		}
		if (arg1 + local20 > Static118.anInt2720) {
			local20 -= arg1 + local20 - Static118.anInt2720;
		}
		if (arg0 < Static118.anInt2721) {
			local36 = Static118.anInt2721 - arg0;
			local23 -= local36;
			arg0 = Static118.anInt2721;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static118.anInt2723) {
			local36 = arg0 + local23 - Static118.anInt2723;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static130.method1879(Static118.anIntArray414, this.aByteArray37, this.anIntArray415, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "()V")
	public void method1875() {
		@Pc(6) byte[] local6 = new byte[this.anInt2731 * this.anInt2727];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2727; local10++) {
			for (@Pc(16) int local16 = this.anInt2731 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray37[local16 + local10 * this.anInt2731];
			}
		}
		this.aByteArray37 = local6;
		this.anInt2729 = this.anInt2726 - this.anInt2731 - this.anInt2729;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
	public void method1876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray415.length; local1++) {
			@Pc(11) int local11 = this.anIntArray415[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray415[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray415[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray415[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "()V")
	public void method1877() {
		if (this.anInt2731 == this.anInt2726 && this.anInt2727 == this.anInt2730) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2726 * this.anInt2730];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2727; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2731; local24++) {
				local17[local24 + this.anInt2729 + (local21 + this.anInt2728) * this.anInt2726] = this.aByteArray37[local19++];
			}
		}
		this.aByteArray37 = local17;
		this.anInt2731 = this.anInt2726;
		this.anInt2727 = this.anInt2730;
		this.anInt2729 = 0;
		this.anInt2728 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "()Lclient!sc;")
	public Class5_Sub2_Sub6_Sub4 method1878() {
		@Pc(10) Class5_Sub2_Sub6_Sub4 local10 = new Class5_Sub2_Sub6_Sub4(this.anInt2731, this.anInt2727, this.anIntArray415.length);
		local10.anInt2726 = this.anInt2726;
		local10.anInt2730 = this.anInt2730;
		local10.anInt2729 = this.anInt2729;
		local10.anInt2728 = this.anInt2728;
		@Pc(30) int local30 = this.aByteArray37.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray37[local32] = this.aByteArray37[local32];
		}
		local30 = this.anIntArray415.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray415[local51] = this.anIntArray415[local51];
		}
		return local10;
	}
}
