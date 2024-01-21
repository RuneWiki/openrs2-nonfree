import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!of", name = "M", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!of", name = "P", descriptor = "I")
	public int anInt3111;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
	public Class1_Sub19(@OriginalArg(0) int arg0) {
		this.aByteArray42 = Static40.method690(arg0);
		this.anInt3111 = 0;
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "([B)V")
	public Class1_Sub19(@OriginalArg(0) byte[] arg0) {
		this.anInt3111 = 0;
		this.aByteArray42 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)I")
	public final int method2041() {
		@Pc(12) int local12 = 0;
		@Pc(23) byte local23;
		for (local23 = this.aByteArray42[this.anInt3111++]; local23 < 0; local23 = this.aByteArray42[this.anInt3111++]) {
			local12 = (local12 | local23 & 0x7F) << 7;
		}
		return local12 | local23;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)I")
	public final int method2042() {
		this.anInt3111 += 4;
		return ((this.aByteArray42[this.anInt3111 - 3] & 0xFF) << 24) + (((this.aByteArray42[this.anInt3111 - 4] & 0xFF) << 16) + (this.aByteArray42[this.anInt3111 - 1] << 8 & 0xFF00) + (this.aByteArray42[this.anInt3111 + -2] & 0xFF));
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
	public final void method2043(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([IIIZ)V")
	public final void method2044(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = (arg1 - 5) / 8;
		@Pc(20) int local20 = this.anInt3111;
		this.anInt3111 = 5;
		for (@Pc(25) int local25 = 0; local25 < local10; local25++) {
			@Pc(34) int local34 = this.method2046();
			@Pc(36) int local36 = -957401312;
			@Pc(46) int local46 = this.method2046();
			@Pc(48) int local48 = 32;
			while (local48-- > 0) {
				local46 -= (local34 >>> 5 ^ local34 << 4) + local34 ^ local36 - -arg0[local36 >>> 11 & 0x49C00003];
				local36 -= -1640531527;
				local34 -= arg0[local36 & 0x3] + local36 ^ (local46 << 4 ^ local46 >>> 5) + local46;
			}
			this.anInt3111 -= 8;
			this.method2062(local34);
			this.method2062(local46);
		}
		this.anInt3111 = local20;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZII[B)V")
	public final void method2045(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray42[this.anInt3111++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)I")
	public final int method2046() {
		this.anInt3111 += 4;
		return ((this.aByteArray42[this.anInt3111 - 3] & 0xFF) << 16) + ((this.aByteArray42[this.anInt3111 - 4] & 0xFF) << 24) + ((this.aByteArray42[this.anInt3111 + -2] & 0xFF) << 8) + (this.aByteArray42[this.anInt3111 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)I")
	public final int method2048() {
		this.anInt3111 += 3;
		return (this.aByteArray42[this.anInt3111 - 1] & 0xFF) + ((this.aByteArray42[this.anInt3111 - 2] & 0xFF) << 8) + ((this.aByteArray42[this.anInt3111 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)V")
	public final void method2049(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3111 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3111 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3111 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!id;)V")
	public final void method2050(@OriginalArg(1) Class34 arg0) {
		this.anInt3111 += arg0.method980(arg0.method982(), this.anInt3111, this.aByteArray42);
		this.aByteArray42[this.anInt3111++] = 0;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)I")
	public final int method2051() {
		this.anInt3111 += 2;
		return (this.aByteArray42[this.anInt3111 - 1] & 0xFF) + ((this.aByteArray42[this.anInt3111 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)I")
	public final int method2052() {
		this.anInt3111 += 4;
		return (this.aByteArray42[this.anInt3111 - 4] & 0xFF) + ((this.aByteArray42[this.anInt3111 - 1] & 0xFF) << 24) + ((this.aByteArray42[this.anInt3111 + -2] & 0xFF) << 16) + ((this.aByteArray42[this.anInt3111 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)I")
	public final int method2053() {
		this.anInt3111 += 2;
		return ((this.aByteArray42[this.anInt3111 - 1] & 0xFF) << 8) + (this.aByteArray42[this.anInt3111 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
	public final void method2054(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3111++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!of", name = "h", descriptor = "(I)I")
	public final int method2055() {
		this.anInt3111 += 2;
		@Pc(38) int local38 = ((this.aByteArray42[this.anInt3111 - 1] & 0xFF) << 8) + (this.aByteArray42[this.anInt3111 - 2] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[BBI)V")
	public final void method2056(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(12) int local12 = arg0 - 1; local12 >= 0; local12--) {
			arg1[local12] = (byte) (this.aByteArray42[this.anInt3111++] - 128);
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(B)B")
	public final byte method2057() {
		return (byte) -this.aByteArray42[this.anInt3111++];
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)B")
	public final byte method2059() {
		return (byte) (this.aByteArray42[this.anInt3111++] - 128);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)I")
	public final int method2060() {
		@Pc(20) int local20 = this.aByteArray42[this.anInt3111] & 0xFF;
		return local20 < 128 ? this.method2072() - 64 : this.method2051() + -49152;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(ZI)V")
	public final void method2061(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V")
	public final void method2062(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3111++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
	public final void method2063(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2061(arg0 >>> 28 | 0x80);
					}
					this.method2061(arg0 >>> 21 | 0x80);
				}
				this.method2061(arg0 >>> 14 | 0x80);
			}
			this.method2061(arg0 >>> 7 | 0x80);
		}
		this.method2061(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!of", name = "j", descriptor = "(I)I")
	public final int method2064() {
		this.anInt3111 += 2;
		@Pc(31) int local31 = (this.aByteArray42[this.anInt3111 - 1] & 0xFF) + ((this.aByteArray42[this.anInt3111 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIB[B)V")
	public final void method2065(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			arg1[local13] = (byte) (this.aByteArray42[this.anInt3111++] - 128);
		}
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(B)I")
	public final int method2066() {
		return -this.aByteArray42[this.anInt3111++] & 0xFF;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)V")
	public final void method2067(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) arg0;
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[BII)V")
	public final void method2068(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			arg1[local12] = this.aByteArray42[this.anInt3111++];
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(II)V")
	public final void method2069(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) arg0;
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
	public final void method2070(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!of", name = "h", descriptor = "(B)I")
	public final int method2072() {
		return this.aByteArray42[this.anInt3111++] & 0xFF;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(JI)V")
	public final void method2073(@OriginalArg(0) long arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 56);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 48);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 40);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 32);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3111++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)I")
	public final int method2074() {
		return this.aByteArray42[this.anInt3111++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!of", name = "i", descriptor = "(B)B")
	public final byte method2075() {
		return (byte) (128 - this.aByteArray42[this.anInt3111++]);
	}

	@OriginalMember(owner = "client!of", name = "j", descriptor = "(B)I")
	public final int method2076() {
		this.anInt3111 += 2;
		return (this.aByteArray42[this.anInt3111 - 1] - 128 & 0xFF) + ((this.aByteArray42[this.anInt3111 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(BI)V")
	public final void method2077(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3111++] = (byte) arg0;
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!of", name = "k", descriptor = "(I)I")
	public final int method2078() {
		@Pc(16) int local16 = this.aByteArray42[this.anInt3111] & 0xFF;
		return local16 >= 128 ? this.method2051() - 32768 : this.method2072();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method2079(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3111;
		this.anInt3111 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2068(local6, local12);
		@Pc(30) BigInteger local30 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local30.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt3111 = 0;
		this.method2061(local38.length);
		this.method2045(local38.length, local38);
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(II)V")
	public final void method2080(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt3111++] = (byte) arg0;
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(II)V")
	public final void method2081(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2061(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2054(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(BI)V")
	public final void method2082(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt3111++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(Z)I")
	public final int method2083() {
		this.anInt3111 += 4;
		return (this.aByteArray42[this.anInt3111 - 3] & 0xFF) + ((this.aByteArray42[this.anInt3111 - 4] & 0xFF) << 8) + ((this.aByteArray42[-2 + this.anInt3111] & 0xFF) << 24) + ((this.aByteArray42[this.anInt3111 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!of", name = "l", descriptor = "(I)Lclient!id;")
	public final Class34 method2084() {
		@Pc(6) int local6 = this.anInt3111;
		while (this.aByteArray42[this.anInt3111++] != 0) {
		}
		return Static51.method921(this.anInt3111 - local6 - 1, this.aByteArray42, local6);
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(Z)B")
	public final byte method2086() {
		return this.aByteArray42[this.anInt3111++];
	}

	@OriginalMember(owner = "client!of", name = "h", descriptor = "(II)V")
	public final void method2087(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!of", name = "i", descriptor = "(II)V")
	public final void method2088(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 + 128);
		this.aByteArray42[this.anInt3111++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!of", name = "m", descriptor = "(I)J")
	public final long method2089() {
		@Pc(11) long local11 = (long) this.method2046() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2046() & 0xFFFFFFFFL;
		return (local11 << 32) + local22;
	}

	@OriginalMember(owner = "client!of", name = "k", descriptor = "(B)I")
	public final int method2090() {
		this.anInt3111 += 2;
		@Pc(38) int local38 = ((this.aByteArray42[this.anInt3111 - 2] & 0xFF) << 8) + (this.aByteArray42[this.anInt3111 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!of", name = "n", descriptor = "(I)Lclient!id;")
	public final Class34 method2091() {
		if (this.aByteArray42[this.anInt3111] == 0) {
			this.anInt3111++;
			return null;
		} else {
			return this.method2084();
		}
	}

	@OriginalMember(owner = "client!of", name = "o", descriptor = "(I)I")
	public final int method2092() {
		return 128 - this.aByteArray42[this.anInt3111++] & 0xFF;
	}

	@OriginalMember(owner = "client!of", name = "l", descriptor = "(B)I")
	public final int method2093() {
		this.anInt3111 += 2;
		return (this.aByteArray42[this.anInt3111 - 2] - 128 & 0xFF) + ((this.aByteArray42[this.anInt3111 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)I")
	public final int method2094(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static113.method1817(this.anInt3111, this.aByteArray42, arg0);
		this.method2062(local16);
		return local16;
	}
}
