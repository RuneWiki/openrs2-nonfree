import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class2_Sub1_Sub2_Sub2 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!e", name = "zb", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!e", name = "Ab", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!e", name = "Bb", descriptor = "I")
	public int anInt955;

	@OriginalMember(owner = "client!e", name = "Cb", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!e", name = "Db", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!e", name = "Eb", descriptor = "I")
	public int anInt957;

	@OriginalMember(owner = "client!e", name = "Fb", descriptor = "I")
	public int anInt958;

	@OriginalMember(owner = "client!e", name = "Gb", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(III)V")
	private Class2_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt955 = this.anInt954 = arg0;
		this.anInt956 = this.anInt957 = arg1;
		this.anInt959 = this.anInt958 = 0;
		this.aByteArray5 = new byte[arg0 * arg1];
		this.anIntArray95 = new int[arg2];
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()Lclient!e;")
	public Class2_Sub1_Sub2_Sub2 method636() {
		@Pc(10) Class2_Sub1_Sub2_Sub2 local10 = new Class2_Sub1_Sub2_Sub2(this.anInt954, this.anInt957, this.anIntArray95.length);
		local10.anInt955 = this.anInt955;
		local10.anInt956 = this.anInt956;
		local10.anInt959 = this.anInt959;
		local10.anInt958 = this.anInt958;
		@Pc(30) int local30 = this.aByteArray5.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray5[local32] = this.aByteArray5[local32];
		}
		local30 = this.anIntArray95.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray95[local51] = this.anIntArray95[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	public void method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt959;
		arg1 += this.anInt958;
		@Pc(15) int local15 = arg0 + arg1 * Static92.anInt1663;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt957;
		@Pc(23) int local23 = this.anInt954;
		@Pc(27) int local27 = Static92.anInt1663 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static92.anInt1662) {
			local36 = Static92.anInt1662 - arg1;
			local20 -= local36;
			arg1 = Static92.anInt1662;
			local17 = local36 * local23;
			local15 += local36 * Static92.anInt1663;
		}
		if (arg1 + local20 > Static92.anInt1665) {
			local20 -= arg1 + local20 - Static92.anInt1665;
		}
		if (arg0 < Static92.anInt1666) {
			local36 = Static92.anInt1666 - arg0;
			local23 -= local36;
			arg0 = Static92.anInt1666;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static92.anInt1667) {
			local36 = arg0 + local23 - Static92.anInt1667;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static115.method638(Static92.anIntArray169, this.aByteArray5, this.anIntArray95, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "()V")
	public void method639() {
		if (this.anInt954 == this.anInt955 && this.anInt957 == this.anInt956) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt955 * this.anInt956];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt957; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt954; local24++) {
				local17[local24 + this.anInt959 + (local21 + this.anInt958) * this.anInt955] = this.aByteArray5[local19++];
			}
		}
		this.aByteArray5 = local17;
		this.anInt954 = this.anInt955;
		this.anInt957 = this.anInt956;
		this.anInt959 = 0;
		this.anInt958 = 0;
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "()V")
	public void method640() {
		@Pc(6) byte[] local6 = new byte[this.anInt954 * this.anInt957];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt957; local10++) {
			for (@Pc(16) int local16 = this.anInt954 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray5[local16 + local10 * this.anInt954];
			}
		}
		this.aByteArray5 = local6;
		this.anInt959 = this.anInt955 - this.anInt954 - this.anInt959;
	}

	@OriginalMember(owner = "client!e", name = "g", descriptor = "()V")
	public void method641() {
		@Pc(6) byte[] local6 = new byte[this.anInt954 * this.anInt957];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt957 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt954; local16++) {
				local6[local8++] = this.aByteArray5[local16 + local13 * this.anInt954];
			}
		}
		this.aByteArray5 = local6;
		this.anInt958 = this.anInt956 - this.anInt957 - this.anInt958;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public void method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray95.length; local1++) {
			@Pc(11) int local11 = this.anIntArray95[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray95[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray95[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray95[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
