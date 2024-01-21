import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class10_Sub1_Sub1_Sub2 extends Class10_Sub1_Sub1 {

	@OriginalMember(owner = "client!m", name = "T", descriptor = "I")
	public int anInt1565;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "I")
	public int anInt1566;

	@OriginalMember(owner = "client!m", name = "V", descriptor = "I")
	public int anInt1567;

	@OriginalMember(owner = "client!m", name = "W", descriptor = "I")
	public int anInt1568;

	@OriginalMember(owner = "client!m", name = "X", descriptor = "I")
	public int anInt1569;

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
	public int anInt1570;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class10_Sub1_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(III)V")
	private Class10_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1568 = this.anInt1570 = arg0;
		this.anInt1565 = this.anInt1566 = arg1;
		this.anInt1569 = this.anInt1567 = 0;
		this.aByteArray5 = new byte[arg0 * arg1];
		this.anIntArray173 = new int[arg2];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
	public void method868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray173.length; local1++) {
			@Pc(11) int local11 = this.anIntArray173[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray173[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray173[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray173[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "()Lclient!m;")
	public Class10_Sub1_Sub1_Sub2 method869() {
		@Pc(10) Class10_Sub1_Sub1_Sub2 local10 = new Class10_Sub1_Sub1_Sub2(this.anInt1570, this.anInt1566, this.anIntArray173.length);
		local10.anInt1568 = this.anInt1568;
		local10.anInt1565 = this.anInt1565;
		local10.anInt1569 = this.anInt1569;
		local10.anInt1567 = this.anInt1567;
		@Pc(30) int local30 = this.aByteArray5.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray5[local32] = this.aByteArray5[local32];
		}
		local30 = this.anIntArray173.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray173[local51] = this.anIntArray173[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "()V")
	public void method870() {
		@Pc(6) byte[] local6 = new byte[this.anInt1570 * this.anInt1566];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt1566 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1570; local16++) {
				local6[local8++] = this.aByteArray5[local16 + local13 * this.anInt1570];
			}
		}
		this.aByteArray5 = local6;
		this.anInt1567 = this.anInt1565 - this.anInt1566 - this.anInt1567;
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "()V")
	public void method871() {
		@Pc(6) byte[] local6 = new byte[this.anInt1570 * this.anInt1566];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1566; local10++) {
			for (@Pc(16) int local16 = this.anInt1570 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray5[local16 + local10 * this.anInt1570];
			}
		}
		this.aByteArray5 = local6;
		this.anInt1569 = this.anInt1568 - this.anInt1570 - this.anInt1569;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public void method873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1569;
		arg1 += this.anInt1567;
		@Pc(15) int local15 = arg0 + arg1 * Static45.anInt2475;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1566;
		@Pc(23) int local23 = this.anInt1570;
		@Pc(27) int local27 = Static45.anInt2475 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static45.anInt2473) {
			local36 = Static45.anInt2473 - arg1;
			local20 -= local36;
			arg1 = Static45.anInt2473;
			local17 = local36 * local23;
			local15 += local36 * Static45.anInt2475;
		}
		if (arg1 + local20 > Static45.anInt2470) {
			local20 -= arg1 + local20 - Static45.anInt2470;
		}
		if (arg0 < Static45.anInt2474) {
			local36 = Static45.anInt2474 - arg0;
			local23 -= local36;
			arg0 = Static45.anInt2474;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static45.anInt2472) {
			local36 = arg0 + local23 - Static45.anInt2472;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static112.method872(Static45.anIntArray323, this.aByteArray5, this.anIntArray173, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "()V")
	public void method874() {
		if (this.anInt1570 == this.anInt1568 && this.anInt1566 == this.anInt1565) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1568 * this.anInt1565];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1566; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1570; local24++) {
				local17[local24 + this.anInt1569 + (local21 + this.anInt1567) * this.anInt1568] = this.aByteArray5[local19++];
			}
		}
		this.aByteArray5 = local17;
		this.anInt1570 = this.anInt1568;
		this.anInt1566 = this.anInt1565;
		this.anInt1569 = 0;
		this.anInt1567 = 0;
	}
}
