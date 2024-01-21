import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
	public int anInt1623;

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
	public int anInt1624;

	@OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
	public int anInt1625;

	@OriginalMember(owner = "client!nc", name = "bb", descriptor = "[I")
	public int[] anIntArray238;

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
	public int anInt1626;

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
	public int anInt1627;

	@OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
	public int anInt1628;

	@OriginalMember(owner = "client!nc", name = "fb", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1_Sub4() {
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
	private Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1623 = this.anInt1627 = arg0;
		this.anInt1626 = this.anInt1628 = arg1;
		this.anInt1625 = this.anInt1624 = 0;
		this.aByteArray23 = new byte[arg0 * arg1];
		this.anIntArray238 = new int[arg2];
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "()V")
	public void method1142() {
		if (this.anInt1627 == this.anInt1623 && this.anInt1628 == this.anInt1626) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1623 * this.anInt1626];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1628; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1627; local24++) {
				local17[local24 + this.anInt1625 + (local21 + this.anInt1624) * this.anInt1623] = this.aByteArray23[local19++];
			}
		}
		this.aByteArray23 = local17;
		this.anInt1627 = this.anInt1623;
		this.anInt1628 = this.anInt1626;
		this.anInt1625 = 0;
		this.anInt1624 = 0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public void method1143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray238.length; local1++) {
			@Pc(11) int local11 = this.anIntArray238[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray238[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray238[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray238[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "()V")
	public void method1144() {
		@Pc(6) byte[] local6 = new byte[this.anInt1627 * this.anInt1628];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1628; local10++) {
			for (@Pc(16) int local16 = this.anInt1627 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray23[local16 + local10 * this.anInt1627];
			}
		}
		this.aByteArray23 = local6;
		this.anInt1625 = this.anInt1623 - this.anInt1627 - this.anInt1625;
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "()Lclient!nc;")
	public Class1_Sub1_Sub1_Sub4 method1145() {
		@Pc(10) Class1_Sub1_Sub1_Sub4 local10 = new Class1_Sub1_Sub1_Sub4(this.anInt1627, this.anInt1628, this.anIntArray238.length);
		local10.anInt1623 = this.anInt1623;
		local10.anInt1626 = this.anInt1626;
		local10.anInt1625 = this.anInt1625;
		local10.anInt1624 = this.anInt1624;
		@Pc(30) int local30 = this.aByteArray23.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray23[local32] = this.aByteArray23[local32];
		}
		local30 = this.anIntArray238.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray238[local51] = this.anIntArray238[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)V")
	public void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1625;
		arg1 += this.anInt1624;
		@Pc(15) int local15 = arg0 + arg1 * Static55.anInt1622;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1628;
		@Pc(23) int local23 = this.anInt1627;
		@Pc(27) int local27 = Static55.anInt1622 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static55.anInt1618) {
			local36 = Static55.anInt1618 - arg1;
			local20 -= local36;
			arg1 = Static55.anInt1618;
			local17 = local36 * local23;
			local15 += local36 * Static55.anInt1622;
		}
		if (arg1 + local20 > Static55.anInt1619) {
			local20 -= arg1 + local20 - Static55.anInt1619;
		}
		if (arg0 < Static55.anInt1617) {
			local36 = Static55.anInt1617 - arg0;
			local23 -= local36;
			arg0 = Static55.anInt1617;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static55.anInt1620) {
			local36 = arg0 + local23 - Static55.anInt1620;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static115.method1146(Static55.anIntArray237, this.aByteArray23, this.anIntArray238, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "()V")
	public void method1148() {
		@Pc(6) byte[] local6 = new byte[this.anInt1627 * this.anInt1628];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt1628 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1627; local16++) {
				local6[local8++] = this.aByteArray23[local16 + local13 * this.anInt1627];
			}
		}
		this.aByteArray23 = local6;
		this.anInt1624 = this.anInt1626 - this.anInt1628 - this.anInt1624;
	}
}
