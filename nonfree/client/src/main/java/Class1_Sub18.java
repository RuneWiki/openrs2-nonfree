import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
	public int anInt3078;

	@OriginalMember(owner = "client!qc", name = "Qb", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub18(@OriginalArg(0) int arg0) {
		this.anInt3078 = 0;
		this.aByteArray96 = Static40.method701(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray96 = arg0;
		this.anInt3078 = 0;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)I")
	public final int method2135() {
		@Pc(7) int local7 = this.aByteArray96[this.anInt3078] & 0xFF;
		return local7 < 128 ? this.method2169() - 64 : this.method2156() + -49152;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2136(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt3078;
		@Pc(9) byte[] local9 = new byte[local2];
		this.anInt3078 = 0;
		this.method2167(local9, local2);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt3078 = 0;
		this.method2168(local31.length);
		this.method2176(local31.length, local31);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I")
	public final int method2137() {
		this.anInt3078 += 4;
		return ((this.aByteArray96[this.anInt3078 - 1] & 0xFF) << 16) + (this.aByteArray96[this.anInt3078 - 2] << 24 & 0xFF000000) + ((this.aByteArray96[this.anInt3078 + -4] & 0xFF) << 8) + (this.aByteArray96[this.anInt3078 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
	public final void method2138(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt3078++] = (byte) arg0;
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Lclient!kd;")
	public final Class39 method2139() {
		@Pc(11) int local11 = this.anInt3078;
		while (this.aByteArray96[this.anInt3078++] != 0) {
		}
		return Static118.method2043(local11, this.aByteArray96, this.anInt3078 - local11 - 1);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)V")
	public final void method2140(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I")
	public final int method2141() {
		this.anInt3078 += 2;
		return ((this.aByteArray96[this.anInt3078 - 1] & 0xFF) << 8) + (this.aByteArray96[this.anInt3078 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
	public final int method2142() {
		this.anInt3078 += 2;
		@Pc(34) int local34 = ((this.aByteArray96[this.anInt3078 - 2] & 0xFF) << 8) + (this.aByteArray96[this.anInt3078 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V")
	public final void method2144(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt3078++] = (byte) arg0;
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)I")
	public final int method2145() {
		this.anInt3078 += 3;
		return (this.aByteArray96[this.anInt3078 - 1] & 0xFF) + ((this.aByteArray96[this.anInt3078 - 3] & 0xFF) << 16) + ((this.aByteArray96[this.anInt3078 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(B)I")
	public final int method2146() {
		this.anInt3078 += 2;
		return (this.aByteArray96[this.anInt3078 - 2] - 128 & 0xFF) + ((this.aByteArray96[this.anInt3078 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)B")
	public final byte method2147() {
		return (byte) (this.aByteArray96[this.anInt3078++] - 128);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)V")
	public final void method2148(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) arg0;
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(II)V")
	public final void method2149(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt3078++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)I")
	public final int method2150() {
		return this.aByteArray96[this.anInt3078++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(II)V")
	public final void method2151(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
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

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[BI)V")
	public final void method2152(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = this.aByteArray96[this.anInt3078++];
		}
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)I")
	public final int method2154() {
		this.anInt3078 += 2;
		@Pc(41) int local41 = (this.aByteArray96[this.anInt3078 - 2] - 128 & 0xFF) + ((this.aByteArray96[this.anInt3078 - 1] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(B)I")
	public final int method2156() {
		this.anInt3078 += 2;
		return (this.aByteArray96[this.anInt3078 - 1] & 0xFF) + ((this.aByteArray96[this.anInt3078 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)I")
	public final int method2157() {
		this.anInt3078 += 2;
		@Pc(36) int local36 = (this.aByteArray96[this.anInt3078 - 1] & 0xFF) + ((this.aByteArray96[this.anInt3078 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)I")
	public final int method2158() {
		this.anInt3078 += 4;
		return (this.aByteArray96[this.anInt3078 - 4] & 0xFF) + ((this.aByteArray96[this.anInt3078 - 3] & 0xFF) << 8) + ((this.aByteArray96[this.anInt3078 + -1] & 0xFF) << 24) + ((this.aByteArray96[this.anInt3078 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(II)V")
	public final void method2159(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt3078++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V")
	public final void method2160(@OriginalArg(1) long arg0) {
		this.method2144((int) (arg0 >> 32));
		this.method2144((int) arg0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(BI)V")
	public final void method2161(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(II)I")
	public final int method2162(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = Static118.method2041(this.anInt3078, arg0, this.aByteArray96);
		this.method2149(local13);
		return local13;
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(II)V")
	public final void method2163(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) arg0;
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!kd;)V")
	public final void method2165(@OriginalArg(1) Class39 arg0) {
		this.anInt3078 += arg0.method1162(arg0.method1175(), this.anInt3078, this.aByteArray96);
		this.aByteArray96[this.anInt3078++] = 0;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)I")
	public final int method2166() {
		this.anInt3078 += 4;
		return (this.aByteArray96[this.anInt3078 - 2] & 0xFF) + (((this.aByteArray96[this.anInt3078 - 3] & 0xFF) << 24) + ((this.aByteArray96[this.anInt3078 - 4] & 0xFF) << 16)) + ((this.aByteArray96[this.anInt3078 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II[BI)V")
	public final void method2167(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = this.aByteArray96[this.anInt3078++];
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(BI)V")
	public final void method2168(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(B)I")
	public final int method2169() {
		return this.aByteArray96[this.anInt3078++] & 0xFF;
	}

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "(B)I")
	public final int method2170() {
		this.anInt3078 += 2;
		return (this.aByteArray96[this.anInt3078 - 1] - 128 & 0xFF) + ((this.aByteArray96[this.anInt3078 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)I")
	public final int method2171() {
		return 128 - this.aByteArray96[this.anInt3078++] & 0xFF;
	}

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "(B)I")
	public final int method2172() {
		@Pc(19) byte local19 = this.aByteArray96[this.anInt3078++];
		@Pc(21) int local21 = 0;
		while (local19 < 0) {
			local21 = (local21 | local19 & 0x7F) << 7;
			local19 = this.aByteArray96[this.anInt3078++];
		}
		return local21 | local19;
	}

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "(I)B")
	public final byte method2173() {
		return (byte) (128 - this.aByteArray96[this.anInt3078++]);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(Z)I")
	public final int method2174() {
		return -this.aByteArray96[this.anInt3078++] & 0xFF;
	}

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "(B)I")
	public final int method2175() {
		@Pc(18) int local18 = this.aByteArray96[this.anInt3078] & 0xFF;
		return local18 >= 128 ? this.method2156() - 32768 : this.method2169();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIB[B)V")
	public final void method2176(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray96[this.anInt3078++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "(II)V")
	public final void method2177(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 + 128);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "(B)B")
	public final byte method2178() {
		return this.aByteArray96[this.anInt3078++];
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZJ)V")
	public final void method2179(@OriginalArg(1) long arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 56);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 48);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 40);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 32);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt3078++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "(II)V")
	public final void method2180(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt3078 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "(II)V")
	public final void method2181(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2168(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2159(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "(I)J")
	public final long method2182() {
		@Pc(13) long local13 = (long) this.method2185() & 0xFFFFFFFFL;
		@Pc(20) long local20 = (long) this.method2185() & 0xFFFFFFFFL;
		return (local13 << 32) + local20;
	}

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "(II)V")
	public final void method2183(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "(II)V")
	public final void method2184(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt3078 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt3078 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt3078 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt3078 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "(I)I")
	public final int method2185() {
		this.anInt3078 += 4;
		return ((this.aByteArray96[this.anInt3078 - 4] & 0xFF) << 24) + ((this.aByteArray96[this.anInt3078 - 3] & 0xFF) << 16) + ((this.aByteArray96[this.anInt3078 + -2] & 0xFF) << 8) + (this.aByteArray96[this.anInt3078 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[III)V")
	public final void method2186(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = this.anInt3078;
		this.anInt3078 = 5;
		@Pc(20) int local20 = (arg1 - 5) / 8;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(25) int local25 = -957401312;
			@Pc(31) int local31 = this.method2185();
			@Pc(33) int local33 = 32;
			@Pc(37) int local37 = this.method2185();
			while (local33-- > 0) {
				local37 -= local25 + arg0[local25 >>> 11 & 0x3] ^ local31 + (local31 << 4 ^ local31 >>> 5);
				local25 -= -1640531527;
				local31 -= local25 + arg0[local25 & 0x3] ^ (local37 << 4 ^ local37 >>> 5) + local37;
			}
			this.anInt3078 -= 8;
			this.method2149(local31);
			this.method2149(local37);
		}
		this.anInt3078 = local11;
	}

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "(II)V")
	public final void method2188(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt3078++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "(II)V")
	public final void method2189(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt3078++] = (byte) (arg0 + 128);
	}
}
