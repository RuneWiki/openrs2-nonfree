import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
	public int anInt150;

	@OriginalMember(owner = "client!ab", name = "ab", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
	public int anInt151;

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
	public int anInt152;

	@OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V")
	private Class3_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt151 = this.anInt152 = arg0;
		this.anInt149 = this.anInt148 = arg1;
		this.anInt153 = this.anInt150 = 0;
		this.aByteArray3 = new byte[arg0 * arg1];
		this.anIntArray17 = new int[arg2];
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public void method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()V")
	public void method141() {
		@Pc(6) byte[] local6 = new byte[this.anInt152 * this.anInt148];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt148; local10++) {
			for (@Pc(16) int local16 = this.anInt152 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray3[local16 + local10 * this.anInt152];
			}
		}
		this.aByteArray3 = local6;
		this.anInt153 = this.anInt151 - this.anInt152 - this.anInt153;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "()V")
	public void method142() {
		@Pc(6) byte[] local6 = new byte[this.anInt152 * this.anInt148];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt148 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt152; local16++) {
				local6[local8++] = this.aByteArray3[local16 + local13 * this.anInt152];
			}
		}
		this.aByteArray3 = local6;
		this.anInt150 = this.anInt149 - this.anInt148 - this.anInt150;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "()V")
	public void method143() {
		if (this.anInt152 == this.anInt151 && this.anInt148 == this.anInt149) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt151 * this.anInt149];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt148; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt152; local24++) {
				local17[local24 + this.anInt153 + (local21 + this.anInt150) * this.anInt151] = this.aByteArray3[local19++];
			}
		}
		this.aByteArray3 = local17;
		this.anInt152 = this.anInt151;
		this.anInt148 = this.anInt149;
		this.anInt153 = 0;
		this.anInt150 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public void method145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt153;
		arg1 += this.anInt150;
		@Pc(15) int local15 = arg0 + arg1 * Static97.anInt2680;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt148;
		@Pc(23) int local23 = this.anInt152;
		@Pc(27) int local27 = Static97.anInt2680 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static97.anInt2679) {
			local36 = Static97.anInt2679 - arg1;
			local20 -= local36;
			arg1 = Static97.anInt2679;
			local17 = local36 * local23;
			local15 += local36 * Static97.anInt2680;
		}
		if (arg1 + local20 > Static97.anInt2682) {
			local20 -= arg1 + local20 - Static97.anInt2682;
		}
		if (arg0 < Static97.anInt2677) {
			local36 = Static97.anInt2677 - arg0;
			local23 -= local36;
			arg0 = Static97.anInt2677;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static97.anInt2678) {
			local36 = arg0 + local23 - Static97.anInt2678;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static110.method144(Static97.anIntArray305, this.aByteArray3, this.anIntArray17, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "()Lclient!ab;")
	public Class3_Sub1_Sub1_Sub1 method146() {
		@Pc(10) Class3_Sub1_Sub1_Sub1 local10 = new Class3_Sub1_Sub1_Sub1(this.anInt152, this.anInt148, this.anIntArray17.length);
		local10.anInt151 = this.anInt151;
		local10.anInt149 = this.anInt149;
		local10.anInt153 = this.anInt153;
		local10.anInt150 = this.anInt150;
		@Pc(30) int local30 = this.aByteArray3.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray3[local32] = this.aByteArray3[local32];
		}
		local30 = this.anIntArray17.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray17[local51] = this.anIntArray17[local51];
		}
		return local10;
	}
}
