import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!nh", name = "lb", descriptor = "I")
	public int anInt2703;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V")
	public Class2_Sub23(@OriginalArg(0) int arg0) {
		this.aByteArray41 = Static226.method3973(arg0);
		this.anInt2703 = 0;
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "([B)V")
	public Class2_Sub23(@OriginalArg(0) byte[] arg0) {
		this.aByteArray41 = arg0;
		this.anInt2703 = 0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!qe;Z)V")
	public final void method2085(@OriginalArg(0) Class78 arg0) {
		this.anInt2703 += arg0.method3045(this.anInt2703, arg0.method3041(), this.aByteArray41);
		this.aByteArray41[this.anInt2703++] = 0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(JIB)V")
	public final void method2086(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg1 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local4 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> local27);
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)I")
	public final int method2087() {
		this.anInt2703 += 2;
		@Pc(42) int local42 = ((this.aByteArray41[this.anInt2703 - 2] & 0xFF) << 8) + (this.aByteArray41[this.anInt2703 - 1] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)Lclient!qe;")
	public final Class78 method2088() {
		if (this.aByteArray41[this.anInt2703] == 0) {
			this.anInt2703++;
			return null;
		} else {
			return this.method2115();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[BI)V")
	public final void method2089(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			this.aByteArray41[this.anInt2703++] = arg1[local5];
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
	public final void method2090(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)I")
	public final int method2091() {
		this.anInt2703 += 3;
		return ((this.aByteArray41[this.anInt2703 - 3] & 0xFF) << 16) + (((this.aByteArray41[this.anInt2703 - 2] & 0xFF) << 8) + (this.aByteArray41[this.anInt2703 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)I")
	public final int method2092() {
		this.anInt2703 += 2;
		return ((this.aByteArray41[this.anInt2703 - 1] & 0xFF) << 8) + (this.aByteArray41[this.anInt2703 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
	public final void method2093(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2703 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)I")
	public final int method2094() {
		this.anInt2703 += 4;
		return ((this.aByteArray41[this.anInt2703 - 1] & 0xFF) << 16) + ((this.aByteArray41[this.anInt2703 - 2] & 0xFF) << 24) + ((this.aByteArray41[this.anInt2703 + -4] & 0xFF) << 8) + (this.aByteArray41[this.anInt2703 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)I")
	public final int method2095() {
		this.anInt2703 += 2;
		return ((this.aByteArray41[this.anInt2703 - 2] & 0xFF) << 8) + (this.aByteArray41[this.anInt2703 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method2096(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(3) int local3 = this.method2122();
		@Pc(15) byte[] local15 = new byte[local3];
		this.method2118(local3, local15);
		@Pc(26) BigInteger local26 = new BigInteger(local15);
		@Pc(31) BigInteger local31 = local26.modPow(arg0, arg1);
		@Pc(34) byte[] local34 = local31.toByteArray();
		this.anInt2703 = 0;
		this.method2089(local34.length, local34);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)V")
	public final void method2097(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2703 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2703 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2703 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2703 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
	public final void method2098(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2132(arg0 >>> 28 | 0x80);
					}
					this.method2132(arg0 >>> 21 | 0x80);
				}
				this.method2132(arg0 >>> 14 | 0x80);
			}
			this.method2132(arg0 >>> 7 | 0x80);
		}
		this.method2132(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)V")
	public final void method2099(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 + 128);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BBII)V")
	public final void method2100(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray41[this.anInt2703++] - 128);
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(II)J")
	public final long method2101(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray41[this.anInt2703++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
	public final void method2102(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2703++] = (byte) arg0;
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V")
	public final void method2103(@OriginalArg(0) long arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 56);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 48);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 40);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 32);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)I")
	public final int method2104() {
		this.anInt2703 += 2;
		@Pc(31) int local31 = (this.aByteArray41[this.anInt2703 - 1] & 0xFF) + ((this.aByteArray41[this.anInt2703 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)I")
	public final int method2105() {
		@Pc(14) byte local14 = this.aByteArray41[this.anInt2703++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local14 & 0x7F | local16) << 7;
			local14 = this.aByteArray41[this.anInt2703++];
		}
		return local14 | local16;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)I")
	public final int method2106() {
		@Pc(5) int local5 = 0;
		@Pc(14) int local14;
		for (local14 = this.method2111(); local14 == 32767; local14 = this.method2111()) {
			local5 += 32767;
		}
		return local5 + local14;
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)I")
	public final int method2107() {
		return -this.aByteArray41[this.anInt2703++] & 0xFF;
	}

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "(I)B")
	public final byte method2108() {
		return (byte) -this.aByteArray41[this.anInt2703++];
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(II)V")
	public final void method2109(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2703++] = (byte) arg0;
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "(I)B")
	public final byte method2110() {
		return (byte) (this.aByteArray41[this.anInt2703++] - 128);
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(B)I")
	public final int method2111() {
		@Pc(15) int local15 = this.aByteArray41[this.anInt2703] & 0xFF;
		return local15 < 128 ? this.method2122() : this.method2095() - 32768;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(II)V")
	public final void method2112(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2113(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt2703;
		this.anInt2703 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method2118(local2, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local28.toByteArray();
		this.anInt2703 = 0;
		this.method2132(local38.length);
		this.method2089(local38.length, local38);
	}

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "(I)B")
	public final byte method2114() {
		return this.aByteArray41[this.anInt2703++];
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(B)Lclient!qe;")
	public final Class78 method2115() {
		@Pc(13) int local13 = this.anInt2703;
		while (this.aByteArray41[this.anInt2703++] != 0) {
		}
		return Static48.method629(this.anInt2703 - local13 - 1, local13, this.aByteArray41);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IJ)V")
	public final void method2116(@OriginalArg(1) long arg0) {
		this.method2109((int) (arg0 >> 32));
		this.method2109((int) arg0);
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(II)V")
	public final void method2117(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[B)V")
	public final void method2118(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			arg1[local9] = this.aByteArray41[this.anInt2703++];
		}
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(II)V")
	public final void method2119(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) arg0;
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[II)V")
	public final void method2120(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(2) int local2 = this.anInt2703;
		@Pc(9) int local9 = (arg1 - 5) / 8;
		this.anInt2703 = 5;
		for (@Pc(18) int local18 = 0; local18 < local9; local18++) {
			@Pc(28) int local28 = this.method2133();
			@Pc(32) int local32 = this.method2133();
			@Pc(34) int local34 = 32;
			@Pc(38) int local38 = -957401312;
			while (local34-- > 0) {
				local32 -= local38 + arg0[local38 >>> 11 & 0xF3400003] ^ local28 + (local28 >>> 5 ^ local28 << 4);
				local38 -= -1640531527;
				local28 -= local38 + arg0[local38 & 0x3] ^ local32 + (local32 << 4 ^ local32 >>> 5);
			}
			this.anInt2703 -= 8;
			this.method2134(local28);
			this.method2134(local32);
		}
		this.anInt2703 = local2;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IZ)V")
	public final void method2121(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)I")
	public final int method2122() {
		return this.aByteArray41[this.anInt2703++] & 0xFF;
	}

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "(I)J")
	public final long method2123() {
		@Pc(17) long local17 = (long) this.method2133() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method2133() & 0xFFFFFFFFL;
		return (local17 << 32) + local24;
	}

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "(B)I")
	public final int method2125() {
		this.anInt2703 += 2;
		@Pc(31) int local31 = (this.aByteArray41[this.anInt2703 - 2] & 0xFF) + ((this.aByteArray41[this.anInt2703 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(Z)I")
	public final int method2126() {
		return this.aByteArray41[this.anInt2703++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "(II)V")
	public final void method2128(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "(B)I")
	public final int method2129() {
		this.anInt2703 += 4;
		return ((this.aByteArray41[this.anInt2703 - 2] & 0xFF) << 16) + ((this.aByteArray41[this.anInt2703 - 1] & 0xFF) << 24) + ((this.aByteArray41[this.anInt2703 + -3] & 0xFF) << 8) + (this.aByteArray41[this.anInt2703 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "(I)I")
	public final int method2130() {
		this.anInt2703 += 2;
		return (this.aByteArray41[this.anInt2703 - 2] - 128 & 0xFF) + ((this.aByteArray41[this.anInt2703 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "(I)I")
	public final int method2131() {
		this.anInt2703 += 4;
		return (this.aByteArray41[this.anInt2703 - 2] & 0xFF) + (((this.aByteArray41[this.anInt2703 - 3] & 0xFF) << 24) - (-((this.aByteArray41[this.anInt2703 - 4] & 0xFF) << 16) - ((this.aByteArray41[this.anInt2703 - 1] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "(II)V")
	public final void method2132(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "(B)I")
	public final int method2133() {
		this.anInt2703 += 4;
		return ((this.aByteArray41[this.anInt2703 - 2] & 0xFF) << 8) + (this.aByteArray41[this.anInt2703 - 4] << 24 & 0xFF000000) + ((this.aByteArray41[this.anInt2703 + -3] & 0xFF) << 16) + (this.aByteArray41[this.anInt2703 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)V")
	public final void method2134(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "(I)I")
	public final int method2135() {
		@Pc(11) int local11 = this.aByteArray41[this.anInt2703] & 0xFF;
		return local11 >= 128 ? this.method2095() - 49152 : this.method2122() - 64;
	}

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "(B)I")
	public final int method2136() {
		this.anInt2703 += 2;
		return ((this.aByteArray41[this.anInt2703 - 2] & 0xFF) << 8) + (this.aByteArray41[this.anInt2703 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "(II)V")
	public final void method2137(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "(I)I")
	public final int method2138() {
		this.anInt2703 += 3;
		return ((this.aByteArray41[this.anInt2703 - 1] & 0xFF) << 8) + ((this.aByteArray41[this.anInt2703 - 3] & 0xFF) << 16) + (this.aByteArray41[this.anInt2703 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "(II)V")
	public final void method2139(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2703++] = (byte) arg0;
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2703++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "(II)V")
	public final void method2140(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2132(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2117(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(IB)I")
	public final int method2141(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static189.method3491(this.aByteArray41, this.anInt2703, arg0);
		this.method2134(local16);
		return local16;
	}

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "(I)I")
	public final int method2142() {
		return 128 - this.aByteArray41[this.anInt2703++] & 0xFF;
	}
}
