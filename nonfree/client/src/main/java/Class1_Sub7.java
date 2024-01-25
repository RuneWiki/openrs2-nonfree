import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!at", name = "S", descriptor = "I")
	public int anInt2219;

	@OriginalMember(owner = "client!at", name = "U", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7(@OriginalArg(0) int arg0) {
		this.anInt2219 = 0;
		this.aByteArray41 = Static94.method2038(arg0);
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "([B)V")
	public Class1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray41 = arg0;
		this.anInt2219 = 0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V")
	public final void method2101(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 + 128);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(II)V")
	public final void method2102(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(II)V")
	public final void method2103(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2219 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2219 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2219 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2219 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II[BI)V")
	public final void method2104(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray41[this.anInt2219++];
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method2106(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt2219 += Static144.method2863(this.anInt2219, arg0, arg0.length(), this.aByteArray41);
		this.aByteArray41[this.anInt2219++] = 0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2107(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2219;
		this.anInt2219 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2104(local6, local12);
		@Pc(31) BigInteger local31 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local31.modPow(arg0, arg1);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt2219 = 0;
		this.method2121(local39.length);
		this.method2133(local39.length, local39);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([IIII)V")
	public final void method2108(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt2219;
		this.anInt2219 = 5;
		@Pc(25) int local25 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method2140();
			@Pc(37) int local37 = this.method2140();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= arg0[local39 >>> 11 & 0x3] + local39 ^ local33 + (local33 << 4 ^ local33 >>> 5);
				local39 -= -1640531527;
				local33 -= local37 + (local37 << 4 ^ local37 >>> 5) ^ local39 - -arg0[local39 & 0x3];
			}
			this.anInt2219 -= 8;
			this.method2115(local33);
			this.method2115(local37);
		}
		this.anInt2219 = local15;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public final String method2109() {
		@Pc(6) int local6 = this.anInt2219;
		while (this.aByteArray41[this.anInt2219++] != 0) {
		}
		@Pc(34) int local34 = this.anInt2219 - local6 - 1;
		return local34 == 0 ? "" : Static162.method3074(local34, this.aByteArray41, local6);
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)I")
	public final int method2110() {
		@Pc(18) int local18 = this.aByteArray41[this.anInt2219] & 0xFF;
		return local18 >= 128 ? this.method2161() - 49152 : this.method2132() - 64;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IJI)V")
	public final void method2111(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(28) int local28 = local6 * 8; local28 >= 0; local28 -= 8) {
			this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> local28);
		}
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(B)I")
	public final int method2112() {
		this.anInt2219 += 4;
		return ((this.aByteArray41[this.anInt2219 - 1] & 0xFF) << 8) + ((this.aByteArray41[this.anInt2219 - 3] & 0xFF) << 24) + ((this.aByteArray41[this.anInt2219 + -4] & 0xFF) << 16) + (this.aByteArray41[this.anInt2219 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(I)I")
	public final int method2113() {
		return -this.aByteArray41[this.anInt2219++] & 0xFF;
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(I)I")
	public final int method2114() {
		this.anInt2219 += 2;
		@Pc(34) int local34 = ((this.aByteArray41[this.anInt2219 - 2] & 0xFF) << 8) + (this.aByteArray41[this.anInt2219 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(II)V")
	public final void method2115(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!at", name = "g", descriptor = "(I)B")
	public final byte method2117() {
		return (byte) (this.aByteArray41[this.anInt2219++] - 128);
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(II)V")
	public final void method2118(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(B)I")
	public final int method2119() {
		this.anInt2219 += 3;
		return ((this.aByteArray41[this.anInt2219 - 3] & 0xFF) << 16) + (this.aByteArray41[this.anInt2219 - 2] << 8 & 0xFF00) + (this.aByteArray41[this.anInt2219 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method2120() {
		if (this.aByteArray41[this.anInt2219] == 0) {
			this.anInt2219++;
			return null;
		} else {
			return this.method2109();
		}
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(II)V")
	public final void method2121(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(B)B")
	public final byte method2122() {
		return this.aByteArray41[this.anInt2219++];
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(Z)I")
	public final int method2123() {
		this.anInt2219 += 2;
		return (this.aByteArray41[this.anInt2219 - 2] - 128 & 0xFF) + ((this.aByteArray41[this.anInt2219 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(JZ)V")
	public final void method2124(@OriginalArg(0) long arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 56);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 48);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 40);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 32);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!at", name = "g", descriptor = "(II)V")
	public final void method2125(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z[BII)V")
	public final void method2126(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = this.aByteArray41[this.anInt2219++];
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)V")
	public final void method2127(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2121(arg0 >>> 28 | 0x80);
					}
					this.method2121(arg0 >>> 21 | 0x80);
				}
				this.method2121(arg0 >>> 14 | 0x80);
			}
			this.method2121(arg0 >>> 7 | 0x80);
		}
		this.method2121(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(B)I")
	public final int method2128() {
		this.anInt2219 += 2;
		@Pc(39) int local39 = (this.aByteArray41[this.anInt2219 - 2] - 128 & 0xFF) + ((this.aByteArray41[this.anInt2219 - 1] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!at", name = "g", descriptor = "(B)I")
	public final int method2129() {
		@Pc(16) byte local16 = this.aByteArray41[this.anInt2219++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray41[this.anInt2219++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!at", name = "h", descriptor = "(I)I")
	public final int method2130() {
		this.anInt2219 += 2;
		return (this.aByteArray41[this.anInt2219 - 2] & 0xFF) + ((this.aByteArray41[this.anInt2219 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!at", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method2131() {
		@Pc(14) byte local14 = this.aByteArray41[this.anInt2219++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt2219;
		while (this.aByteArray41[this.anInt2219++] != 0) {
		}
		@Pc(47) int local47 = this.anInt2219 - local24 - 1;
		return local47 == 0 ? "" : Static162.method3074(local47, this.aByteArray41, local24);
	}

	@OriginalMember(owner = "client!at", name = "i", descriptor = "(B)I")
	public final int method2132() {
		return this.aByteArray41[this.anInt2219++] & 0xFF;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II[BB)V")
	public final void method2133(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray41[this.anInt2219++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!at", name = "i", descriptor = "(I)I")
	public final int method2134() {
		@Pc(11) int local11 = this.aByteArray41[this.anInt2219] & 0xFF;
		return local11 < 128 ? this.method2132() : this.method2161() - 32768;
	}

	@OriginalMember(owner = "client!at", name = "j", descriptor = "(B)I")
	public final int method2135() {
		return this.aByteArray41[this.anInt2219++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([II)V")
	public final void method2136(@OriginalArg(0) int[] arg0) {
		@Pc(15) int local15 = this.anInt2219 / 8;
		this.anInt2219 = 0;
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			@Pc(26) int local26 = this.method2140();
			@Pc(30) int local30 = this.method2140();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local26 += (local30 << 4 ^ local30 >>> 5) + local30 ^ arg0[local32 & 0x3] + local32;
				local32 += -1640531527;
				local30 += (local26 << 4 ^ local26 >>> 5) + local26 ^ arg0[local32 >>> 11 & 0x3] + local32;
			}
			this.anInt2219 -= 8;
			this.method2115(local26);
			this.method2115(local30);
		}
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(Z)B")
	public final byte method2137() {
		return (byte) (128 - this.aByteArray41[this.anInt2219++]);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)V")
	public final void method2138(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!at", name = "j", descriptor = "(I)I")
	public final int method2139() {
		this.anInt2219 += 2;
		return (this.aByteArray41[this.anInt2219 - 1] - 128 & 0xFF) + ((this.aByteArray41[this.anInt2219 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!at", name = "k", descriptor = "(I)I")
	public final int method2140() {
		this.anInt2219 += 4;
		return ((this.aByteArray41[this.anInt2219 - 2] & 0xFF) << 8) + ((this.aByteArray41[this.anInt2219 - 3] & 0xFF) << 16) + ((this.aByteArray41[this.anInt2219 - 4] & 0xFF) << 24) + (this.aByteArray41[this.anInt2219 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!at", name = "k", descriptor = "(B)I")
	public final int method2141() {
		this.anInt2219 += 2;
		@Pc(31) int local31 = (this.aByteArray41[this.anInt2219 - 1] & 0xFF) + ((this.aByteArray41[this.anInt2219 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(IB)V")
	public final void method2142(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!at", name = "l", descriptor = "(I)I")
	public final int method2143() {
		this.anInt2219 += 4;
		return ((this.aByteArray41[this.anInt2219 - 2] & 0xFF) << 16) + ((this.aByteArray41[this.anInt2219 - 1] & 0xFF) << 24) + ((this.aByteArray41[this.anInt2219 - 3] & 0xFF) << 8) + (this.aByteArray41[this.anInt2219 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(BI)V")
	public final void method2144(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!at", name = "h", descriptor = "(II)J")
	public final long method2145(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(19) int local19 = local6 * 8;
		@Pc(21) long local21 = 0L;
		while (local19 >= 0) {
			local21 |= ((long) this.aByteArray41[this.anInt2219++] & 0xFFL) << local19;
			local19 -= 8;
		}
		return local21;
	}

	@OriginalMember(owner = "client!at", name = "m", descriptor = "(I)I")
	public final int method2146() {
		this.anInt2219 += 4;
		return (this.aByteArray41[this.anInt2219 - 3] & 0xFF) + ((this.aByteArray41[this.anInt2219 - 4] & 0xFF) << 8) + ((this.aByteArray41[this.anInt2219 + -1] & 0xFF) << 16) + ((this.aByteArray41[this.anInt2219 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(IB)V")
	public final void method2147(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2219 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(Z)J")
	public final long method2148() {
		@Pc(10) long local10 = (long) this.method2140() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method2140() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!at", name = "i", descriptor = "(II)I")
	public final int method2149(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static44.method1078(this.anInt2219, arg0, this.aByteArray41);
		this.method2115(local18);
		return local18;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(IB)V")
	public final void method2150(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!at", name = "m", descriptor = "(B)I")
	public final int method2152() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method2134();
		while (local16 == 32767) {
			local16 = this.method2134();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!at", name = "j", descriptor = "(II)V")
	public final void method2153(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!at", name = "n", descriptor = "(B)B")
	public final byte method2154() {
		return (byte) -this.aByteArray41[this.anInt2219++];
	}

	@OriginalMember(owner = "client!at", name = "k", descriptor = "(II)V")
	public final void method2155(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 16);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!at", name = "o", descriptor = "(B)I")
	public final int method2156() {
		return 128 - this.aByteArray41[this.anInt2219++] & 0xFF;
	}

	@OriginalMember(owner = "client!at", name = "l", descriptor = "(II)V")
	public final void method2157(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZI)V")
	public final void method2158(@OriginalArg(1) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 8);
		this.aByteArray41[this.anInt2219++] = (byte) arg0;
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 24);
		this.aByteArray41[this.anInt2219++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(IB)V")
	public final void method2159(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2121(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2144(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!at", name = "n", descriptor = "(I)Z")
	public final boolean method2160() {
		this.anInt2219 -= 4;
		@Pc(17) int local17 = Static44.method1078(this.anInt2219, 0, this.aByteArray41);
		@Pc(21) int local21 = this.method2140();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!at", name = "o", descriptor = "(I)I")
	public final int method2161() {
		this.anInt2219 += 2;
		return (this.aByteArray41[this.anInt2219 - 1] & 0xFF) + ((this.aByteArray41[this.anInt2219 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!at", name = "m", descriptor = "(II)V")
	public final void method2162(@OriginalArg(0) int arg0) {
		this.aByteArray41[this.anInt2219++] = (byte) -arg0;
	}
}
