import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!rd", name = "sb", descriptor = "I")
	public int anInt2951 = 0;

	@OriginalMember(owner = "client!rd", name = "kb", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I)V")
	public Class1_Sub20(@OriginalArg(0) int arg0) {
		this.aByteArray36 = Static39.method774(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray36 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)I")
	public final int method2053() {
		return this.aByteArray36[this.anInt2951++] & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!af;B)V")
	public final void method2054(@OriginalArg(0) Class5 arg0) {
		this.anInt2951 += arg0.method197(this.aByteArray36, arg0.method215(), this.anInt2951);
		this.aByteArray36[this.anInt2951++] = 0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)V")
	public final void method2055(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2951++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I")
	public final int method2056() {
		@Pc(16) int local16 = this.aByteArray36[this.anInt2951] & 0xFF;
		return local16 < 128 ? this.method2053() : this.method2087() - 32768;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
	public final void method2058(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)V")
	public final void method2059(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) arg0;
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)V")
	public final void method2060(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2951++] = (byte) arg0;
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(II)V")
	public final void method2061(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) arg0;
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(JB)V")
	public final void method2062(@OriginalArg(0) long arg0) {
		this.method2060((int) (arg0 >> 32));
		this.method2060((int) arg0);
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(II)V")
	public final void method2064(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)I")
	public final int method2065() {
		this.anInt2951 += 3;
		return (this.aByteArray36[this.anInt2951 - 2] & 0xFF) + (((this.aByteArray36[this.anInt2951 - 3] & 0xFF) << 16) + ((this.aByteArray36[this.anInt2951 - 1] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(II)V")
	public final void method2066(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2081(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2055(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I")
	public final int method2067() {
		this.anInt2951 += 4;
		return (this.aByteArray36[this.anInt2951 - 4] & 0xFF) + ((this.aByteArray36[this.anInt2951 - 1] & 0xFF) << 24) + ((this.aByteArray36[this.anInt2951 + -2] & 0xFF) << 16) + ((this.aByteArray36[this.anInt2951 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)J")
	public final long method2068() {
		@Pc(6) long local6 = (long) this.method2094() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method2094() & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)I")
	public final int method2069() {
		this.anInt2951 += 2;
		return (this.aByteArray36[this.anInt2951 - 1] - 128 & 0xFF) + ((this.aByteArray36[this.anInt2951 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)I")
	public final int method2070() {
		return 128 - this.aByteArray36[this.anInt2951++] & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)I")
	public final int method2071() {
		@Pc(16) byte local16 = this.aByteArray36[this.anInt2951++];
		@Pc(23) int local23 = 0;
		while (local16 < 0) {
			local23 = (local23 | local16 & 0x7F) << 7;
			local16 = this.aByteArray36[this.anInt2951++];
		}
		return local23 | local16;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(BI)V")
	public final void method2072(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2081(arg0 >>> 28 | 0x80);
					}
					this.method2081(arg0 >>> 21 | 0x80);
				}
				this.method2081(arg0 >>> 14 | 0x80);
			}
			this.method2081(arg0 >>> 7 | 0x80);
		}
		this.method2081(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method2073(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt2951;
		this.anInt2951 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method2077(local2, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2951 = 0;
		this.method2081(local31.length);
		this.method2074(local31, local31.length);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([BIII)V")
	public final void method2074(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			this.aByteArray36[this.anInt2951++] = arg0[local5];
		}
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "(I)I")
	public final int method2075() {
		this.anInt2951 += 3;
		return ((this.aByteArray36[this.anInt2951 - 3] & 0xFF) << 16) + ((this.aByteArray36[this.anInt2951 - 2] & 0xFF) << 8) + (this.aByteArray36[this.anInt2951 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[BII)V")
	public final void method2076(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray36[this.anInt2951++] - 128);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZII[B)V")
	public final void method2077(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray36[this.anInt2951++];
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(JI)V")
	public final void method2078(@OriginalArg(0) long arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 56);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 48);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 40);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 32);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2951++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "(I)I")
	public final int method2079() {
		this.anInt2951 += 2;
		@Pc(37) int local37 = ((this.aByteArray36[this.anInt2951 - 2] & 0xFF) << 8) + (this.aByteArray36[this.anInt2951 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "(I)I")
	public final int method2080() {
		@Pc(18) int local18 = this.aByteArray36[this.anInt2951] & 0xFF;
		return local18 < 128 ? this.method2053() - 64 : this.method2087() + -49152;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
	public final void method2081(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(II)V")
	public final void method2082(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "(I)I")
	public final int method2084() {
		return -this.aByteArray36[this.anInt2951++] & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)Lclient!af;")
	public final Class5 method2085() {
		if (this.aByteArray36[this.anInt2951] == 0) {
			this.anInt2951++;
			return null;
		} else {
			return this.method2101();
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)V")
	public final void method2086(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)I")
	public final int method2087() {
		this.anInt2951 += 2;
		return (this.aByteArray36[this.anInt2951 - 1] & 0xFF) + ((this.aByteArray36[this.anInt2951 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([IIII)V")
	public final void method2088(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt2951;
		this.anInt2951 = 5;
		@Pc(23) int local23 = (arg1 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) int local31 = this.method2094();
			@Pc(37) int local37 = this.method2094();
			@Pc(41) int local41 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= arg0[local41 >>> 11 & 0x3] + local41 ^ local31 + (local31 >>> 5 ^ local31 << 4);
				local41 -= -1640531527;
				local31 -= arg0[local41 & 0x3] + local41 ^ local37 + (local37 >>> 5 ^ local37 << 4);
			}
			this.anInt2951 -= 8;
			this.method2092(local31);
			this.method2092(local37);
		}
		this.anInt2951 = local13;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)B")
	public final byte method2089() {
		return (byte) (this.aByteArray36[this.anInt2951++] - 128);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IB)V")
	public final void method2090(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2951++] = (byte) arg0;
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "(I)I")
	public final int method2091() {
		this.anInt2951 += 2;
		return (this.aByteArray36[this.anInt2951 - 2] & 0xFF) + ((this.aByteArray36[this.anInt2951 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(BI)V")
	public final void method2092(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2951++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "(I)I")
	public final int method2093() {
		this.anInt2951 += 4;
		return (this.aByteArray36[this.anInt2951 - 2] & 0xFF) + ((this.aByteArray36[this.anInt2951 - 4] & 0xFF) << 16) + ((this.aByteArray36[this.anInt2951 - 3] & 0xFF) << 24) + ((this.aByteArray36[this.anInt2951 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "(I)I")
	public final int method2094() {
		this.anInt2951 += 4;
		return (this.aByteArray36[this.anInt2951 - 1] & 0xFF) + (((this.aByteArray36[this.anInt2951 - 4] & 0xFF) << 24) - (-((this.aByteArray36[this.anInt2951 - 3] & 0xFF) << 16) - ((this.aByteArray36[this.anInt2951 - 2] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "(II)V")
	public final void method2095(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 + 128);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "(II)V")
	public final void method2096(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2951 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2951 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2951 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2951 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(IB)I")
	public final int method2097(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static83.method1481(this.aByteArray36, arg0, this.anInt2951);
		this.method2092(local16);
		return local16;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(IB)V")
	public final void method2098(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2951 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)B")
	public final byte method2099() {
		return this.aByteArray36[this.anInt2951++];
	}

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "(I)I")
	public final int method2100() {
		this.anInt2951 += 2;
		return (this.aByteArray36[this.anInt2951 - 2] - 128 & 0xFF) + ((this.aByteArray36[this.anInt2951 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "(I)Lclient!af;")
	public final Class5 method2101() {
		@Pc(11) int local11 = this.anInt2951;
		while (this.aByteArray36[this.anInt2951++] != 0) {
		}
		return Static87.method2233(this.anInt2951 - local11 - 1, local11, this.aByteArray36);
	}

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "(I)B")
	public final byte method2102() {
		return (byte) -this.aByteArray36[this.anInt2951++];
	}

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "(I)I")
	public final int method2103() {
		this.anInt2951 += 4;
		return ((this.aByteArray36[this.anInt2951 - 4] & 0xFF) << 8) + ((this.aByteArray36[this.anInt2951 - 1] & 0xFF) << 16) + ((this.aByteArray36[-2 + this.anInt2951] & 0xFF) << 24) + (this.aByteArray36[this.anInt2951 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(IB)V")
	public final void method2104(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2951++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2951++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(B)I")
	public final int method2105() {
		this.anInt2951 += 2;
		@Pc(30) int local30 = ((this.aByteArray36[this.anInt2951 - 1] & 0xFF) << 8) + (this.aByteArray36[this.anInt2951 - 2] - 128 & 0xFF);
		if (local30 > 32767) {
			local30 -= 65536;
		}
		return local30;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(B)I")
	public final int method2106() {
		return this.aByteArray36[this.anInt2951++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "(I)I")
	public final int method2107() {
		this.anInt2951 += 2;
		@Pc(40) int local40 = ((this.aByteArray36[this.anInt2951 - 1] & 0xFF) << 8) + (this.aByteArray36[this.anInt2951 - 2] & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}
}
