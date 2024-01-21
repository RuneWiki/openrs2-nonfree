import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub2_Sub1_Sub1 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "I")
	public int anInt116;

	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
	public int anInt117;

	@OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
	public int anInt118;

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
	public int anInt119;

	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
	public int anInt120;

	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(III)V")
	private Class2_Sub2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt117 = this.anInt116 = arg0;
		this.anInt120 = this.anInt118 = arg1;
		this.anInt121 = this.anInt119 = 0;
		this.aByteArray1 = new byte[arg0 * arg1];
		this.anIntArray17 = new int[arg2];
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
	public void method93() {
		@Pc(6) byte[] local6 = new byte[this.anInt116 * this.anInt118];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt118 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt116; local16++) {
				local6[local8++] = this.aByteArray1[local16 + local13 * this.anInt116];
			}
		}
		this.aByteArray1 = local6;
		this.anInt119 = this.anInt120 - this.anInt118 - this.anInt119;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "()V")
	public void method94() {
		if (this.anInt116 == this.anInt117 && this.anInt118 == this.anInt120) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt117 * this.anInt120];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt118; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt116; local24++) {
				local17[local24 + this.anInt121 + (local21 + this.anInt119) * this.anInt117] = this.aByteArray1[local19++];
			}
		}
		this.aByteArray1 = local17;
		this.anInt116 = this.anInt117;
		this.anInt118 = this.anInt120;
		this.anInt121 = 0;
		this.anInt119 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	public void method95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray17.length; local1++) {
			@Pc(11) int local11 = this.anIntArray17[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray17[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray17[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray17[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "()Lclient!ae;")
	public Class2_Sub2_Sub1_Sub1 method96() {
		@Pc(10) Class2_Sub2_Sub1_Sub1 local10 = new Class2_Sub2_Sub1_Sub1(this.anInt116, this.anInt118, this.anIntArray17.length);
		local10.anInt117 = this.anInt117;
		local10.anInt120 = this.anInt120;
		local10.anInt121 = this.anInt121;
		local10.anInt119 = this.anInt119;
		@Pc(30) int local30 = this.aByteArray1.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray1[local32] = this.aByteArray1[local32];
		}
		local30 = this.anIntArray17.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray17[local51] = this.anIntArray17[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	public void method97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt121;
		arg1 += this.anInt119;
		@Pc(15) int local15 = arg0 + arg1 * Static58.anInt1010;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt118;
		@Pc(23) int local23 = this.anInt116;
		@Pc(27) int local27 = Static58.anInt1010 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static58.anInt1013) {
			local36 = Static58.anInt1013 - arg1;
			local20 -= local36;
			arg1 = Static58.anInt1013;
			local17 = local36 * local23;
			local15 += local36 * Static58.anInt1010;
		}
		if (arg1 + local20 > Static58.anInt1012) {
			local20 -= arg1 + local20 - Static58.anInt1012;
		}
		if (arg0 < Static58.anInt1009) {
			local36 = Static58.anInt1009 - arg0;
			local23 -= local36;
			arg0 = Static58.anInt1009;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static58.anInt1011) {
			local36 = arg0 + local23 - Static58.anInt1011;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static129.method98(Static58.anIntArray117, this.aByteArray1, this.anIntArray17, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "()V")
	public void method99() {
		@Pc(6) byte[] local6 = new byte[this.anInt116 * this.anInt118];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt118; local10++) {
			for (@Pc(16) int local16 = this.anInt116 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray1[local16 + local10 * this.anInt116];
			}
		}
		this.aByteArray1 = local6;
		this.anInt121 = this.anInt117 - this.anInt116 - this.anInt121;
	}
}
