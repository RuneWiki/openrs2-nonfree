import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public class Class8_Sub20 extends Class8 {

	@OriginalMember(owner = "client!wd", name = "kb", descriptor = "I")
	public int anInt2853 = 0;

	@OriginalMember(owner = "client!wd", name = "Ab", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class8_Sub20(@OriginalArg(0) int arg0) {
		this.aByteArray44 = Static25.method453(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
	public Class8_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray44 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)I")
	public final int method1839() {
		this.anInt2853 += 2;
		return (this.aByteArray44[this.anInt2853 - 1] & 0xFF) + ((this.aByteArray44[this.anInt2853 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	public final void method1841(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2853++] = (byte) arg0;
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public final void method1842(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1883(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1884(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	public final void method1843(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
	public final void method1844(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2853 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2853 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2853 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2853 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I")
	public final int method1845() {
		this.anInt2853 += 4;
		return (this.aByteArray44[this.anInt2853 - 3] & 0xFF) + (((this.aByteArray44[this.anInt2853 - 2] & 0xFF) << 24) - (-((this.aByteArray44[this.anInt2853 - 1] & 0xFF) << 16) - ((this.aByteArray44[this.anInt2853 - 4] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BI)V")
	public final void method1846(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			arg1[local5] = this.aByteArray44[this.anInt2853++];
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)B")
	public final byte method1847() {
		return this.aByteArray44[this.anInt2853++];
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(B)I")
	public final int method1848() {
		return this.aByteArray44[this.anInt2853++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)I")
	public final int method1849() {
		@Pc(18) int local18 = this.aByteArray44[this.anInt2853] & 0xFF;
		return local18 >= 128 ? this.method1839() - 32768 : this.method1872();
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(II)V")
	public final void method1850(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1883(arg0 >>> 28 | 0x80);
					}
					this.method1883(arg0 >>> 21 | 0x80);
				}
				this.method1883(arg0 >>> 14 | 0x80);
			}
			this.method1883(arg0 >>> 7 | 0x80);
		}
		this.method1883(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)I")
	public final int method1851() {
		return 128 - this.aByteArray44[this.anInt2853++] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(B)I")
	public final int method1852() {
		this.anInt2853 += 4;
		return (this.aByteArray44[this.anInt2853 - 2] & 0xFF) + ((this.aByteArray44[this.anInt2853 - 4] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2853 + -3] & 0xFF) << 24) + ((this.aByteArray44[this.anInt2853 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(B)I")
	public final int method1853() {
		this.anInt2853 += 4;
		return ((this.aByteArray44[this.anInt2853 - 4] & 0xFF) << 24) + (this.aByteArray44[this.anInt2853 - 3] << 16 & 0xFF0000) + ((this.aByteArray44[this.anInt2853 + -2] & 0xFF) << 8) + (this.aByteArray44[this.anInt2853 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lclient!ic;")
	public final Class34 method1854() {
		if (this.aByteArray44[this.anInt2853] == 0) {
			this.anInt2853++;
			return null;
		} else {
			return this.method1892();
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)B")
	public final byte method1855() {
		return (byte) (this.aByteArray44[this.anInt2853++] - 128);
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(B)I")
	public final int method1856() {
		this.anInt2853 += 2;
		@Pc(31) int local31 = (this.aByteArray44[this.anInt2853 - 1] & 0xFF) + ((this.aByteArray44[this.anInt2853 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
	public final int method1857() {
		@Pc(10) int local10 = 0;
		@Pc(21) byte local21;
		for (local21 = this.aByteArray44[this.anInt2853++]; local21 < 0; local21 = this.aByteArray44[this.anInt2853++]) {
			local10 = (local21 & 0x7F | local10) << 7;
		}
		return local10 | local21;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)I")
	public final int method1858() {
		this.anInt2853 += 2;
		return ((this.aByteArray44[this.anInt2853 - 1] & 0xFF) << 8) + (this.aByteArray44[this.anInt2853 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(II)I")
	public final int method1859(@OriginalArg(1) int arg0) {
		@Pc(20) int local20 = Static106.method1499(this.anInt2853, arg0, this.aByteArray44);
		this.method1873(local20);
		return local20;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([BIBI)V")
	public final void method1860(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			arg0[local9] = (byte) (this.aByteArray44[this.anInt2853++] - 128);
		}
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)I")
	public final int method1861() {
		this.anInt2853 += 4;
		return ((this.aByteArray44[this.anInt2853 - 3] & 0xFF) << 8) + ((this.aByteArray44[this.anInt2853 - 2] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2853 + -1] & 0xFF) << 24) + (this.aByteArray44[this.anInt2853 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(JZ)V")
	public final void method1862(@OriginalArg(0) long arg0) {
		this.method1841((int) (arg0 >> 32));
		this.method1841((int) arg0);
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)I")
	public final int method1863() {
		this.anInt2853 += 2;
		@Pc(36) int local36 = (this.aByteArray44[this.anInt2853 - 2] & 0xFF) + ((this.aByteArray44[this.anInt2853 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)J")
	public final long method1864() {
		@Pc(13) long local13 = (long) this.method1853() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1853() & 0xFFFFFFFFL;
		return local24 + (local13 << 32);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!ic;)V")
	public final void method1865(@OriginalArg(1) Class34 arg0) {
		this.anInt2853 += arg0.method825(this.aByteArray44, this.anInt2853, arg0.method820());
		this.aByteArray44[this.anInt2853++] = 0;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(II)V")
	public final void method1866(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(II)V")
	public final void method1867(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2853++] = (byte) arg0;
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(I)I")
	public final int method1868() {
		this.anInt2853 += 3;
		return (this.aByteArray44[this.anInt2853 - 1] & 0xFF) + ((this.aByteArray44[this.anInt2853 - 2] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2853 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(II)V")
	public final void method1869(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) arg0;
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([BIII)V")
	public final void method1871(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			this.aByteArray44[this.anInt2853++] = arg0[local5];
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)I")
	public final int method1872() {
		return this.aByteArray44[this.anInt2853++] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(II)V")
	public final void method1873(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2853++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(I)B")
	public final byte method1874() {
		return (byte) (128 - this.aByteArray44[this.anInt2853++]);
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(I)B")
	public final byte method1875() {
		return (byte) -this.aByteArray44[this.anInt2853++];
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(II)V")
	public final void method1876(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) arg0;
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "(I)I")
	public final int method1877() {
		return -this.aByteArray44[this.anInt2853++] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(B)I")
	public final int method1878() {
		this.anInt2853 += 2;
		return (this.aByteArray44[this.anInt2853 - 2] & 0xFF) + ((this.aByteArray44[this.anInt2853 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(JB)V")
	public final void method1879(@OriginalArg(0) long arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 56);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 48);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 40);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 32);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2853++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[III)V")
	public final void method1880(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(2) int local2 = this.anInt2853;
		this.anInt2853 = 5;
		@Pc(22) int local22 = (arg1 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(29) int local29 = this.method1853();
			@Pc(31) int local31 = -957401312;
			@Pc(35) int local35 = this.method1853();
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local35 -= local31 + arg0[local31 >>> 11 & 0x66600003] ^ (local29 << 4 ^ local29 >>> 5) - -local29;
				local31 -= -1640531527;
				local29 -= arg0[local31 & 0x3] + local31 ^ (local35 >>> 5 ^ local35 << 4) - -local35;
			}
			this.anInt2853 -= 8;
			this.method1873(local29);
			this.method1873(local35);
		}
		this.anInt2853 = local2;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V")
	public final void method1881(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 + 128);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1882(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2853;
		@Pc(16) byte[] local16 = new byte[local6];
		this.anInt2853 = 0;
		this.method1846(local6, local16);
		@Pc(30) BigInteger local30 = new BigInteger(local16);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt2853 = 0;
		this.method1883(local38.length);
		this.method1871(local38, local38.length);
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(II)V")
	public final void method1883(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IZ)V")
	public final void method1884(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2853++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "(B)I")
	public final int method1885() {
		this.anInt2853 += 3;
		return ((this.aByteArray44[this.anInt2853 - 3] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2853 - 2] & 0xFF) << 8) + (this.aByteArray44[this.anInt2853 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "(II)V")
	public final void method1886(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)V")
	public final void method1887(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2853++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2853++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "(I)I")
	public final int method1888() {
		@Pc(12) int local12 = this.aByteArray44[this.anInt2853] & 0xFF;
		return local12 >= 128 ? this.method1839() - 49152 : this.method1872() + -64;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(Z)I")
	public final int method1889() {
		this.anInt2853 += 2;
		return (this.aByteArray44[this.anInt2853 - 1] - 128 & 0xFF) + ((this.aByteArray44[this.anInt2853 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "(B)Lclient!ic;")
	public final Class34 method1892() {
		@Pc(13) int local13 = this.anInt2853;
		while (this.aByteArray44[this.anInt2853++] != 0) {
		}
		return Static87.method1304(this.anInt2853 - local13 - 1, local13, this.aByteArray44);
	}

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "(II)V")
	public final void method1893(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2853 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "(I)I")
	public final int method1894() {
		this.anInt2853 += 2;
		@Pc(42) int local42 = ((this.aByteArray44[this.anInt2853 - 2] & 0xFF) << 8) + (this.aByteArray44[this.anInt2853 - 1] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "(B)I")
	public final int method1895() {
		this.anInt2853 += 2;
		@Pc(41) int local41 = (this.aByteArray44[this.anInt2853 - 2] - 128 & 0xFF) + ((this.aByteArray44[this.anInt2853 - 1] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}
}
