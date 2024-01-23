import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	public int anInt2789;

	@OriginalMember(owner = "client!oe", name = "ub", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
	public Class2_Sub16(@OriginalArg(0) int arg0) {
		this.anInt2789 = 0;
		this.aByteArray17 = Static96.method1670(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
	public Class2_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray17 = arg0;
		this.anInt2789 = 0;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)I")
	public final int method2130() {
		this.anInt2789 += 2;
		return (this.aByteArray17[this.anInt2789 - 1] & 0xFF) + ((this.aByteArray17[this.anInt2789 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V")
	public final void method2131(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)J")
	public final long method2132() {
		@Pc(10) long local10 = (long) this.method2145() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2145() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)I")
	public final int method2133() {
		return this.aByteArray17[this.anInt2789++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[BII)V")
	public final void method2135(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray17[this.anInt2789++];
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2136(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2789;
		this.anInt2789 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2135(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2789 = 0;
		this.method2168(local31.length);
		this.method2178(local31, local31.length);
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)I")
	public final int method2137() {
		this.anInt2789 += 2;
		return ((this.aByteArray17[this.anInt2789 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt2789 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)I")
	public final int method2138() {
		@Pc(16) byte local16 = this.aByteArray17[this.anInt2789++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray17[this.anInt2789++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(B)B")
	public final byte method2139() {
		return (byte) (this.aByteArray17[this.anInt2789++] - 128);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IF)V")
	public final void method2142(@OriginalArg(1) float arg0) {
		@Pc(13) int local13 = Float.floatToRawIntBits(arg0);
		this.aByteArray17[this.anInt2789++] = (byte) local13;
		this.aByteArray17[this.anInt2789++] = (byte) (local13 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) (local13 >> 16);
		this.aByteArray17[this.anInt2789++] = (byte) (local13 >> 24);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V")
	public final void method2143(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJ)V")
	public final void method2144(@OriginalArg(1) long arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 56);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 48);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 40);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 32);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)I")
	public final int method2145() {
		this.anInt2789 += 4;
		return ((this.aByteArray17[this.anInt2789 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2789 - 4] & 0xFF) << 24) + ((this.aByteArray17[this.anInt2789 + -2] & 0xFF) << 8) + (this.aByteArray17[this.anInt2789 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(B)I")
	public final int method2146() {
		return this.aByteArray17[this.anInt2789++] & 0xFF;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BF)V")
	public final void method2147(@OriginalArg(1) float arg0) {
		@Pc(13) int local13 = Float.floatToRawIntBits(arg0);
		this.aByteArray17[this.anInt2789++] = (byte) (local13 >> 24);
		this.aByteArray17[this.anInt2789++] = (byte) (local13 >> 16);
		this.aByteArray17[this.anInt2789++] = (byte) (local13 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) local13;
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)I")
	public final int method2148() {
		return 128 - this.aByteArray17[this.anInt2789++] & 0xFF;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(BI)V")
	public final void method2149(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	public final void method2151(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & -268435456) != 0) {
						this.method2168(arg0 >>> 28 | 0x80);
					}
					this.method2168(arg0 >>> 21 | 0x80);
				}
				this.method2168(arg0 >>> 14 | 0x80);
			}
			this.method2168(arg0 >>> 7 | 0x80);
		}
		this.method2168(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)I")
	public final int method2152() {
		this.anInt2789 += 2;
		return ((this.aByteArray17[this.anInt2789 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt2789 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method2153(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr");
		}
		this.anInt2789 += Static93.method1636(arg0.length(), this.aByteArray17, this.anInt2789, arg0);
		this.aByteArray17[this.anInt2789++] = 0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
	public final void method2154(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "(I)I")
	public final int method2155() {
		this.anInt2789 += 4;
		return (this.aByteArray17[this.anInt2789 - 3] & 0xFF) + (((this.aByteArray17[this.anInt2789 - 2] & 0xFF) << 24) + ((this.aByteArray17[this.anInt2789 - 1] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2789 + -4] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I[BII)V")
	public final void method2156(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(21) int local21 = arg0 - 1; local21 >= 0; local21--) {
			arg1[local21] = this.aByteArray17[this.anInt2789++];
		}
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(B)I")
	public final int method2157() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method2161();
		while (local11 == 32767) {
			local11 = this.method2161();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method2158() {
		@Pc(12) int local12 = this.anInt2789;
		while (this.aByteArray17[this.anInt2789++] != 0) {
		}
		return Static122.method2047(local12, this.anInt2789 - local12 - 1, this.aByteArray17);
	}

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "(I)I")
	public final int method2159() {
		this.anInt2789 += 4;
		return ((this.aByteArray17[this.anInt2789 - 3] & 0xFF) << 24) + (this.aByteArray17[this.anInt2789 - 4] << 16 & 0xFF0000) + ((this.aByteArray17[this.anInt2789 + -1] & 0xFF) << 8) + (this.aByteArray17[this.anInt2789 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method2160() {
		@Pc(10) byte local10 = this.aByteArray17[this.anInt2789++];
		if (local10 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(28) int local28 = this.anInt2789;
		while (this.aByteArray17[this.anInt2789++] != 0) {
		}
		return Static122.method2047(local28, this.anInt2789 - local28 - 1, this.aByteArray17);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
	public final int method2161() {
		@Pc(16) int local16 = this.aByteArray17[this.anInt2789] & 0xFF;
		return local16 < 128 ? this.method2146() : this.method2130() - 32768;
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "(B)I")
	public final int method2162() {
		this.anInt2789 += 2;
		@Pc(41) int local41 = ((this.aByteArray17[this.anInt2789 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt2789 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)V")
	public final void method2163(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2168(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2143(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
	public final void method2164(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 + 128);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "(I)I")
	public final int method2165() {
		this.anInt2789 += 4;
		return (this.aByteArray17[this.anInt2789 - 4] & 0xFF) + (((this.aByteArray17[this.anInt2789 - 2] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2789 - 1] & 0xFF) << 24) + ((this.aByteArray17[this.anInt2789 - 3] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "(B)I")
	public final int method2166() {
		this.anInt2789 += 3;
		return ((this.aByteArray17[this.anInt2789 - 2] & 0xFF) << 8) + (((this.aByteArray17[this.anInt2789 - 3] & 0xFF) << 16) + (this.aByteArray17[this.anInt2789 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(IB)V")
	public final void method2167(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(II)V")
	public final void method2168(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "(I)B")
	public final byte method2170() {
		return this.aByteArray17[this.anInt2789++];
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[IBI)V")
	public final void method2171(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt2789;
		this.anInt2789 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) int local31 = this.method2145();
			@Pc(35) int local35 = this.method2145();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= local37 + arg0[local37 >>> 11 & 0x73600003] ^ (local31 << 4 ^ local31 >>> 5) - -local31;
				local37 -= -1640531527;
				local31 -= local35 + (local35 >>> 5 ^ local35 << 4) ^ local37 - -arg0[local37 & 0x3];
			}
			this.anInt2789 -= 8;
			this.method2186(local31);
			this.method2186(local35);
		}
		this.anInt2789 = local8;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(II)V")
	public final void method2172(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2789 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2789 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2789 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(II)V")
	public final void method2173(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)I")
	public final int method2174() {
		@Pc(16) int local16 = this.aByteArray17[this.anInt2789] & 0xFF;
		return local16 < 128 ? this.method2146() - 64 : this.method2130() + -49152;
	}

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "(I)I")
	public final int method2175() {
		return -this.aByteArray17[this.anInt2789++] & 0xFF;
	}

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "(B)Z")
	public final boolean method2176() {
		this.anInt2789 -= 4;
		@Pc(19) int local19 = Static279.method4345(this.anInt2789, 0, this.aByteArray17);
		@Pc(28) int local28 = this.method2145();
		return local19 == local28;
	}

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method2177() {
		if (this.aByteArray17[this.anInt2789] == 0) {
			this.anInt2789++;
			return null;
		} else {
			return this.method2158();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([BIII)V")
	public final void method2178(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray17[this.anInt2789++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "([IB)V")
	public final void method2179(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt2789 / 8;
		this.anInt2789 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			@Pc(35) int local35 = this.method2145();
			@Pc(41) int local41 = this.method2145();
			@Pc(43) int local43 = 0;
			@Pc(47) int local47 = 32;
			while (local47-- > 0) {
				local35 += (local41 << 4 ^ local41 >>> 5) + local41 ^ arg0[local43 & 0x3] + local43;
				local43 += -1640531527;
				local41 += local43 + arg0[local43 >>> 11 & 0xAA600003] ^ (local35 << 4 ^ local35 >>> 5) - -local35;
			}
			this.anInt2789 -= 8;
			this.method2186(local35);
			this.method2186(local41);
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(BI)V")
	public final void method2180(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(BI)V")
	public final void method2181(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(II)V")
	public final void method2182(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(BI)V")
	public final void method2183(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(BI)V")
	public final void method2184(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "(I)B")
	public final byte method2185() {
		return (byte) -this.aByteArray17[this.anInt2789++];
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(BI)V")
	public final void method2186(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "(B)B")
	public final byte method2187() {
		return (byte) (128 - this.aByteArray17[this.anInt2789++]);
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(II)J")
	public final long method2188(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 - 1;
		if (local12 < 0 || local12 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(25) int local25 = local12 * 8;
		@Pc(27) long local27 = 0L;
		while (local25 >= 0) {
			local27 |= ((long) this.aByteArray17[this.anInt2789++] & 0xFFL) << local25;
			local25 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(BI)V")
	public final void method2189(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "(II)V")
	public final void method2190(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2789++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "(I)I")
	public final int method2191() {
		this.anInt2789 += 2;
		@Pc(37) int local37 = ((this.aByteArray17[this.anInt2789 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt2789 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IJI)V")
	public final void method2192(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(23) int local23 = local6 * 8; local23 >= 0; local23 -= 8) {
			this.aByteArray17[this.anInt2789++] = (byte) (arg0 >> local23);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[BI)V")
	public final void method2193(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = (byte) (this.aByteArray17[this.anInt2789++] - 128);
		}
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "(BI)I")
	public final int method2194(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static279.method4345(this.anInt2789, arg0, this.aByteArray17);
		this.method2186(local7);
		return local7;
	}

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "(I)I")
	public final int method2195() {
		this.anInt2789 += 2;
		return ((this.aByteArray17[this.anInt2789 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt2789 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "(I)I")
	public final int method2196() {
		this.anInt2789 += 3;
		return ((this.aByteArray17[this.anInt2789 - 3] & 0xFF) << 16) - (-((this.aByteArray17[this.anInt2789 - 1] & 0xFF) << 8) - (this.aByteArray17[this.anInt2789 - 2] & 0xFF));
	}
}
