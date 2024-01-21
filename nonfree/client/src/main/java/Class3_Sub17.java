import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int anInt2923;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	public Class3_Sub17(@OriginalArg(0) int arg0) {
		this.anInt2923 = 0;
		this.aByteArray40 = Static105.method1567(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray40 = arg0;
		this.anInt2923 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I")
	public final int method2088() {
		this.anInt2923 += 2;
		@Pc(33) int local33 = ((this.aByteArray40[this.anInt2923 - 2] & 0xFF) << 8) + (this.aByteArray40[this.anInt2923 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)V")
	public final void method2089(@OriginalArg(1) long arg0) {
		this.method2110((int) (arg0 >> 32));
		this.method2110((int) arg0);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I")
	public final int method2090() {
		@Pc(11) int local11 = this.aByteArray40[this.anInt2923] & 0xFF;
		return local11 >= 128 ? this.method2111() - 32768 : this.method2107();
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
	public final int method2091() {
		return -this.aByteArray40[this.anInt2923++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public final void method2092(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2923++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)I")
	public final int method2093() {
		@Pc(12) int local12 = 0;
		@Pc(18) int local18 = this.method2090();
		while (local18 == 32767) {
			local18 = this.method2090();
			local12 += 32767;
		}
		return local12 + local18;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BIB)V")
	public final void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			this.aByteArray40[this.anInt2923++] = arg1[local11];
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V")
	public final void method2096(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2923++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V")
	public final void method2097(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2923++] = (byte) arg0;
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)I")
	public final int method2098() {
		this.anInt2923 += 2;
		return (this.aByteArray40[this.anInt2923 - 2] - 128 & 0xFF) + ((this.aByteArray40[this.anInt2923 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(IB)V")
	public final void method2099(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2108(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2092(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ[B)V")
	public final void method2101(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = arg0 - 1; local12 >= 0; local12--) {
			arg1[local12] = this.aByteArray40[this.anInt2923++];
		}
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)Lclient!rd;")
	public final Class80 method2102() {
		@Pc(11) int local11 = this.anInt2923;
		while (this.aByteArray40[this.anInt2923++] != 0) {
		}
		return Static95.method2641(local11, this.aByteArray40, this.anInt2923 - local11 - 1);
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)B")
	public final byte method2103() {
		return (byte) -this.aByteArray40[this.anInt2923++];
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)I")
	public final int method2104() {
		this.anInt2923 += 4;
		return (this.aByteArray40[this.anInt2923 - 4] & 0xFF) + (((this.aByteArray40[this.anInt2923 - 1] & 0xFF) << 24) + ((this.aByteArray40[this.anInt2923 - 2] & 0xFF) << 16)) + ((this.aByteArray40[this.anInt2923 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B[III)V")
	public final void method2105(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt2923;
		@Pc(15) int local15 = (arg1 - 5) / 8;
		this.anInt2923 = 5;
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			@Pc(26) int local26 = this.method2132();
			@Pc(30) int local30 = this.method2132();
			@Pc(34) int local34 = 32;
			@Pc(36) int local36 = -957401312;
			while (local34-- > 0) {
				local30 -= arg0[local36 >>> 11 & 0x3] + local36 ^ (local26 << 4 ^ local26 >>> 5) - -local26;
				local36 -= -1640531527;
				local26 -= (local30 >>> 5 ^ local30 << 4) + local30 ^ arg0[local36 & 0x3] + local36;
			}
			this.anInt2923 -= 8;
			this.method2131(local26);
			this.method2131(local30);
		}
		this.anInt2923 = local4;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	public final void method2106(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)I")
	public final int method2107() {
		return this.aByteArray40[this.anInt2923++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(IB)V")
	public final void method2108(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)I")
	public final int method2109() {
		return this.aByteArray40[this.anInt2923++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public final void method2110(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2923++] = (byte) arg0;
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(B)I")
	public final int method2111() {
		this.anInt2923 += 2;
		return (this.aByteArray40[this.anInt2923 - 1] & 0xFF) + ((this.aByteArray40[this.anInt2923 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JI)V")
	public final void method2112(@OriginalArg(0) long arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 56);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 48);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 40);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 32);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2923++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(B)I")
	public final int method2113() {
		@Pc(16) byte local16 = this.aByteArray40[this.anInt2923++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray40[this.anInt2923++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)I")
	public final int method2114() {
		this.anInt2923 += 2;
		return (this.aByteArray40[this.anInt2923 - 1] - 128 & 0xFF) + ((this.aByteArray40[this.anInt2923 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)J")
	public final long method2115() {
		@Pc(6) long local6 = (long) this.method2132() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method2132() & 0xFFFFFFFFL;
		return local24 + (local6 << 32);
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)B")
	public final byte method2116() {
		return (byte) (this.aByteArray40[this.anInt2923++] - 128);
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "(I)Lclient!rd;")
	public final Class80 method2117() {
		if (this.aByteArray40[this.anInt2923] == 0) {
			this.anInt2923++;
			return null;
		} else {
			return this.method2102();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IZ)V")
	public final void method2118(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public final void method2119(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(9) int local9 = this.anInt2923;
		this.anInt2923 = 0;
		@Pc(19) byte[] local19 = new byte[local9];
		this.method2126(local19, local9);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt2923 = 0;
		this.method2108(local38.length);
		this.method2094(local38.length, local38);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(IB)V")
	public final void method2120(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2923 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2923 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2923 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	public final void method2122(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2108(arg0 >>> 28 | 0x80);
					}
					this.method2108(arg0 >>> 21 | 0x80);
				}
				this.method2108(arg0 >>> 14 | 0x80);
			}
			this.method2108(arg0 >>> 7 | 0x80);
		}
		this.method2108(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "(I)B")
	public final byte method2123() {
		return this.aByteArray40[this.anInt2923++];
	}

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "(I)B")
	public final byte method2124() {
		return (byte) (128 - this.aByteArray40[this.anInt2923++]);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V")
	public final void method2125(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 + 128);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BII)V")
	public final void method2126(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray40[this.anInt2923++];
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(B)I")
	public final int method2127() {
		@Pc(17) int local17 = this.aByteArray40[this.anInt2923] & 0xFF;
		return local17 >= 128 ? this.method2111() - 49152 : this.method2107() + -64;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(IB)I")
	public final int method2128(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static139.method2162(arg0, this.anInt2923, this.aByteArray40);
		this.method2131(local7);
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V")
	public final void method2129(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) arg0;
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!rd;)V")
	public final void method2130(@OriginalArg(1) Class80 arg0) {
		this.anInt2923 += arg0.method2453(this.aByteArray40, this.anInt2923, arg0.method2462());
		this.aByteArray40[this.anInt2923++] = 0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(II)V")
	public final void method2131(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2923++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "(I)I")
	public final int method2132() {
		this.anInt2923 += 4;
		return (this.aByteArray40[this.anInt2923 - 1] & 0xFF) + ((this.aByteArray40[this.anInt2923 - 3] & 0xFF) << 16) + ((this.aByteArray40[this.anInt2923 + -4] & 0xFF) << 24) + ((this.aByteArray40[this.anInt2923 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(B)I")
	public final int method2133() {
		this.anInt2923 += 4;
		return (this.aByteArray40[this.anInt2923 - 3] & 0xFF) + ((this.aByteArray40[this.anInt2923 - 4] & 0xFF) << 8) + ((this.aByteArray40[this.anInt2923 + -2] & 0xFF) << 24) + ((this.aByteArray40[this.anInt2923 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(IB)V")
	public final void method2134(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923++] = (byte) arg0;
		this.aByteArray40[this.anInt2923++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "(I)I")
	public final int method2135() {
		return 128 - this.aByteArray40[this.anInt2923++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "(I)I")
	public final int method2136() {
		this.anInt2923 += 3;
		return (this.aByteArray40[this.anInt2923 - 1] & 0xFF) + ((this.aByteArray40[this.anInt2923 - 2] & 0xFF) << 8) + ((this.aByteArray40[this.anInt2923 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "(I)I")
	public final int method2137() {
		this.anInt2923 += 3;
		return (this.aByteArray40[this.anInt2923 - 1] & 0xFF) + ((this.aByteArray40[this.anInt2923 - 3] & 0xFF) << 8) + ((this.aByteArray40[this.anInt2923 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(Z)I")
	public final int method2138() {
		this.anInt2923 += 2;
		@Pc(37) int local37 = ((this.aByteArray40[this.anInt2923 - 2] & 0xFF) << 8) + (this.aByteArray40[this.anInt2923 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIZ[B)V")
	public final void method2139(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(20) int local20 = arg0 - 1; local20 >= 0; local20--) {
			arg1[local20] = (byte) (this.aByteArray40[this.anInt2923++] - 128);
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "(B)I")
	public final int method2140() {
		this.anInt2923 += 4;
		return ((this.aByteArray40[this.anInt2923 - 1] & 0xFF) << 8) + ((this.aByteArray40[this.anInt2923 - 4] & 0xFF) << 16) + ((this.aByteArray40[this.anInt2923 + -3] & 0xFF) << 24) + (this.aByteArray40[this.anInt2923 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "(I)I")
	public final int method2141() {
		this.anInt2923 += 2;
		return (this.aByteArray40[this.anInt2923 - 2] & 0xFF) + ((this.aByteArray40[this.anInt2923 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(IB)V")
	public final void method2142(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2923 - arg0 - 1] = (byte) arg0;
	}
}
