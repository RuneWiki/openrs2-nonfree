import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!pg", name = "kb", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
	public int anInt2656;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub17(@OriginalArg(0) int arg0) {
		this.aByteArray40 = Static28.method395(arg0);
		this.anInt2656 = 0;
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray40 = arg0;
		this.anInt2656 = 0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)J")
	public final long method2121(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray40[this.anInt2656++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
	public final void method2122(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2175(arg0 >>> 28 | 0x80);
					}
					this.method2175(arg0 >>> 21 | 0x80);
				}
				this.method2175(arg0 >>> 14 | 0x80);
			}
			this.method2175(arg0 >>> 7 | 0x80);
		}
		this.method2175(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)I")
	public final int method2123() {
		this.anInt2656 += 4;
		return (this.aByteArray40[this.anInt2656 - 3] & 0xFF) + ((this.aByteArray40[this.anInt2656 - 1] & 0xFF) << 16) + ((this.aByteArray40[-2 + this.anInt2656] & 0xFF) << 24) + ((this.aByteArray40[this.anInt2656 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
	public final void method2124(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2656++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Lclient!hh;")
	public final Class50 method2125() {
		@Pc(11) int local11 = this.anInt2656;
		while (this.aByteArray40[this.anInt2656++] != 0) {
		}
		return Static20.method301(this.anInt2656 - local11 - 1, local11, this.aByteArray40);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)I")
	public final int method2126() {
		this.anInt2656 += 2;
		@Pc(33) int local33 = ((this.aByteArray40[this.anInt2656 - 2] & 0xFF) << 8) + (this.aByteArray40[this.anInt2656 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)I")
	public final int method2127() {
		this.anInt2656 += 3;
		return (this.aByteArray40[this.anInt2656 - 2] & 0xFF) + ((this.aByteArray40[this.anInt2656 - 3] & 0xFF) << 16) + ((this.aByteArray40[this.anInt2656 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)I")
	public final int method2128() {
		return this.aByteArray40[this.anInt2656++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)I")
	public final int method2129() {
		return 128 - this.aByteArray40[this.anInt2656++] & 0xFF;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)I")
	public final int method2131() {
		this.anInt2656 += 2;
		return ((this.aByteArray40[this.anInt2656 - 2] & 0xFF) << 8) + (this.aByteArray40[this.anInt2656 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)I")
	public final int method2132() {
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = this.method2156();
		while (local18 == 32767) {
			local18 = this.method2156();
			local14 += 32767;
		}
		return local14 + local18;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)V")
	public final void method2133(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2656++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)I")
	public final int method2134() {
		this.anInt2656 += 2;
		return (this.aByteArray40[this.anInt2656 - 2] & 0xFF) + ((this.aByteArray40[this.anInt2656 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)I")
	public final int method2135() {
		this.anInt2656 += 3;
		return (this.aByteArray40[this.anInt2656 - 1] & 0xFF) + ((this.aByteArray40[this.anInt2656 - 2] & 0xFF) << 8) + ((this.aByteArray40[this.anInt2656 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(II)V")
	public final void method2136(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 + 128);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(Z)I")
	public final int method2138() {
		this.anInt2656 += 4;
		return (this.aByteArray40[this.anInt2656 - 4] & 0xFF) + ((this.aByteArray40[this.anInt2656 - 3] & 0xFF) << 8) + ((this.aByteArray40[this.anInt2656 - 1] & 0xFF) << 24) + ((this.aByteArray40[this.anInt2656 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)I")
	public final int method2139() {
		return -this.aByteArray40[this.anInt2656++] & 0xFF;
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(B)I")
	public final int method2140() {
		this.anInt2656 += 4;
		return ((this.aByteArray40[this.anInt2656 - 2] & 0xFF) << 8) + ((this.aByteArray40[this.anInt2656 - 3] & 0xFF) << 16) + ((this.aByteArray40[this.anInt2656 + -4] & 0xFF) << 24) + (this.aByteArray40[this.anInt2656 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(Z)I")
	public final int method2142() {
		return this.aByteArray40[this.anInt2656++] & 0xFF;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[BII)V")
	public final void method2143(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray40[this.anInt2656++] - 128);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
	public final void method2144(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) arg0;
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)I")
	public final int method2145(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static150.method2517(arg0, this.aByteArray40, this.anInt2656);
		this.method2124(local11);
		return local11;
	}

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "(I)B")
	public final byte method2146() {
		return (byte) (this.aByteArray40[this.anInt2656++] - 128);
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(II)V")
	public final void method2147(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[BI)V")
	public final void method2148(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			arg1[local14] = this.aByteArray40[this.anInt2656++];
		}
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(B)I")
	public final int method2149() {
		this.anInt2656 += 2;
		return ((this.aByteArray40[this.anInt2656 - 1] & 0xFF) << 8) + (this.aByteArray40[this.anInt2656 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)V")
	public final void method2150(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2656 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2656 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2656 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2656 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(II)V")
	public final void method2151(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2656++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2152(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(7) int local7 = this.method2142();
		@Pc(10) byte[] local10 = new byte[local7];
		this.method2148(local7, local10);
		@Pc(25) BigInteger local25 = new BigInteger(local10);
		@Pc(30) BigInteger local30 = local25.modPow(arg1, arg0);
		@Pc(33) byte[] local33 = local30.toByteArray();
		this.anInt2656 = 0;
		this.method2158(local33, local33.length);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIII)V")
	public final void method2153(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt2656;
		@Pc(15) int local15 = (arg1 - 5) / 8;
		this.anInt2656 = 5;
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			@Pc(26) int local26 = this.method2140();
			@Pc(30) int local30 = this.method2140();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local26 + (local26 << 4 ^ local26 >>> 5) ^ arg0[local32 >>> 11 & 0xAD600003] + local32;
				local32 -= -1640531527;
				local26 -= local30 + (local30 << 4 ^ local30 >>> 5) ^ local32 - -arg0[local32 & 0x3];
			}
			this.anInt2656 -= 8;
			this.method2124(local26);
			this.method2124(local30);
		}
		this.anInt2656 = local8;
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(II)V")
	public final void method2154(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) arg0;
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "(I)B")
	public final byte method2155() {
		return this.aByteArray40[this.anInt2656++];
	}

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "(I)I")
	public final int method2156() {
		@Pc(18) int local18 = this.aByteArray40[this.anInt2656] & 0xFF;
		return local18 >= 128 ? this.method2178() - 32768 : this.method2142();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(JB)V")
	public final void method2157(@OriginalArg(0) long arg0) {
		this.method2160((int) (arg0 >> 32));
		this.method2160((int) arg0);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II[BI)V")
	public final void method2158(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray40[this.anInt2656++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "(I)I")
	public final int method2159() {
		this.anInt2656 += 4;
		return (this.aByteArray40[this.anInt2656 - 2] & 0xFF) + ((this.aByteArray40[this.anInt2656 - 1] & 0xFF) << 8) + ((this.aByteArray40[this.anInt2656 + -4] & 0xFF) << 16) + ((this.aByteArray40[this.anInt2656 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(BI)V")
	public final void method2160(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2656++] = (byte) arg0;
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IJB)V")
	public final void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local2 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray40[this.anInt2656++] = (byte) (arg1 >> local26);
		}
	}

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "(I)B")
	public final byte method2163() {
		return (byte) (128 - this.aByteArray40[this.anInt2656++]);
	}

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "(I)I")
	public final int method2164() {
		@Pc(7) int local7 = 0;
		@Pc(18) byte local18;
		for (local18 = this.aByteArray40[this.anInt2656++]; local18 < 0; local18 = this.aByteArray40[this.anInt2656++]) {
			local7 = (local18 & 0x7F | local7) << 7;
		}
		return local7 | local18;
	}

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "(II)V")
	public final void method2166(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(Z)I")
	public final int method2167() {
		this.anInt2656 += 2;
		@Pc(36) int local36 = ((this.aByteArray40[this.anInt2656 - 2] & 0xFF) << 8) + (this.aByteArray40[this.anInt2656 - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IZ)V")
	public final void method2168(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2175(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2151(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([BIII)V")
	public final void method2169(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(16) int local16 = arg1 - 1; local16 >= 0; local16--) {
			arg0[local16] = (byte) (this.aByteArray40[this.anInt2656++] - 128);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2170(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(9) int local9 = this.anInt2656;
		@Pc(12) byte[] local12 = new byte[local9];
		this.anInt2656 = 0;
		this.method2148(local9, local12);
		@Pc(26) BigInteger local26 = new BigInteger(local12);
		@Pc(31) BigInteger local31 = local26.modPow(arg1, arg0);
		@Pc(34) byte[] local34 = local31.toByteArray();
		this.anInt2656 = 0;
		this.method2175(local34.length);
		this.method2158(local34, local34.length);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IJ)V")
	public final void method2171(@OriginalArg(1) long arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 56);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 48);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 40);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 32);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 16);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2656++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "(I)J")
	public final long method2172() {
		@Pc(6) long local6 = (long) this.method2140() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method2140() & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "(II)V")
	public final void method2173(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 8);
		this.aByteArray40[this.anInt2656++] = (byte) arg0;
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 24);
		this.aByteArray40[this.anInt2656++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!hh;)V")
	public final void method2174(@OriginalArg(1) Class50 arg0) {
		this.anInt2656 += arg0.method1226(this.anInt2656, this.aByteArray40, arg0.method1249());
		this.aByteArray40[this.anInt2656++] = 0;
	}

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "(II)V")
	public final void method2175(@OriginalArg(1) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "(II)V")
	public final void method2176(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2656++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(B)I")
	public final int method2177() {
		@Pc(7) int local7 = this.aByteArray40[this.anInt2656] & 0xFF;
		return local7 >= 128 ? this.method2178() - 49152 : this.method2142() + -64;
	}

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "(I)I")
	public final int method2178() {
		this.anInt2656 += 2;
		return ((this.aByteArray40[this.anInt2656 - 2] & 0xFF) << 8) + (this.aByteArray40[this.anInt2656 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "(II)V")
	public final void method2179(@OriginalArg(0) int arg0) {
		this.aByteArray40[this.anInt2656 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "(I)Lclient!hh;")
	public final Class50 method2180() {
		if (this.aByteArray40[this.anInt2656] == 0) {
			this.anInt2656++;
			return null;
		} else {
			return this.method2125();
		}
	}
}
