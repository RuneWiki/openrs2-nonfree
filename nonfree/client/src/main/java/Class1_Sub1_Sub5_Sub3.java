import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class1_Sub1_Sub5_Sub3 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!oa", name = "gb", descriptor = "I")
	public int anInt1795;

	@OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
	public int anInt1796;

	@OriginalMember(owner = "client!oa", name = "ib", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!oa", name = "jb", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
	public int anInt1797;

	@OriginalMember(owner = "client!oa", name = "lb", descriptor = "I")
	public int anInt1798;

	@OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
	public int anInt1799;

	@OriginalMember(owner = "client!oa", name = "nb", descriptor = "I")
	public int anInt1800;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5_Sub3() {
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(III)V")
	private Class1_Sub1_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1795 = this.anInt1799 = arg0;
		this.anInt1798 = this.anInt1800 = arg1;
		this.anInt1796 = this.anInt1797 = 0;
		this.aByteArray22 = new byte[arg0 * arg1];
		this.anIntArray259 = new int[arg2];
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	public void method1288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray259.length; local1++) {
			@Pc(11) int local11 = this.anIntArray259[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray259[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray259[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray259[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Lclient!oa;")
	public Class1_Sub1_Sub5_Sub3 method1289() {
		@Pc(10) Class1_Sub1_Sub5_Sub3 local10 = new Class1_Sub1_Sub5_Sub3(this.anInt1799, this.anInt1800, this.anIntArray259.length);
		local10.anInt1795 = this.anInt1795;
		local10.anInt1798 = this.anInt1798;
		local10.anInt1796 = this.anInt1796;
		local10.anInt1797 = this.anInt1797;
		@Pc(30) int local30 = this.aByteArray22.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray22[local32] = this.aByteArray22[local32];
		}
		local30 = this.anIntArray259.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray259[local51] = this.anIntArray259[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	public void method1290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1796;
		arg1 += this.anInt1797;
		@Pc(15) int local15 = arg0 + arg1 * Static47.anInt2713;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1800;
		@Pc(23) int local23 = this.anInt1799;
		@Pc(27) int local27 = Static47.anInt2713 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static47.anInt2710) {
			local36 = Static47.anInt2710 - arg1;
			local20 -= local36;
			arg1 = Static47.anInt2710;
			local17 = local36 * local23;
			local15 += local36 * Static47.anInt2713;
		}
		if (arg1 + local20 > Static47.anInt2711) {
			local20 -= arg1 + local20 - Static47.anInt2711;
		}
		if (arg0 < Static47.anInt2709) {
			local36 = Static47.anInt2709 - arg0;
			local23 -= local36;
			arg0 = Static47.anInt2709;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static47.anInt2708) {
			local36 = arg0 + local23 - Static47.anInt2708;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static128.method1294(Static47.anIntArray424, this.aByteArray22, this.anIntArray259, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
	public void method1291() {
		@Pc(6) byte[] local6 = new byte[this.anInt1799 * this.anInt1800];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt1800 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1799; local16++) {
				local6[local8++] = this.aByteArray22[local16 + local13 * this.anInt1799];
			}
		}
		this.aByteArray22 = local6;
		this.anInt1797 = this.anInt1798 - this.anInt1800 - this.anInt1797;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	public void method1292() {
		if (this.anInt1799 == this.anInt1795 && this.anInt1800 == this.anInt1798) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1795 * this.anInt1798];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1800; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1799; local24++) {
				local17[local24 + this.anInt1796 + (local21 + this.anInt1797) * this.anInt1795] = this.aByteArray22[local19++];
			}
		}
		this.aByteArray22 = local17;
		this.anInt1799 = this.anInt1795;
		this.anInt1800 = this.anInt1798;
		this.anInt1796 = 0;
		this.anInt1797 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	public void method1293() {
		@Pc(6) byte[] local6 = new byte[this.anInt1799 * this.anInt1800];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1800; local10++) {
			for (@Pc(16) int local16 = this.anInt1799 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray22[local16 + local10 * this.anInt1799];
			}
		}
		this.aByteArray22 = local6;
		this.anInt1796 = this.anInt1795 - this.anInt1799 - this.anInt1796;
	}
}
