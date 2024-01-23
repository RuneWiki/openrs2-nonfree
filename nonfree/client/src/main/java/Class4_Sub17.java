import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
	public int anInt2400;

	@OriginalMember(owner = "client!p", name = "M", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I)V")
	public Class4_Sub17(@OriginalArg(0) int arg0) {
		this.anInt2400 = 0;
		this.aByteArray30 = Static193.method3021(arg0);
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V")
	public Class4_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray30 = arg0;
		this.anInt2400 = 0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
	public final int method1835() {
		this.anInt2400 += 3;
		return (this.aByteArray30[this.anInt2400 - 1] & 0xFF) + ((this.aByteArray30[this.anInt2400 - 3] & 0xFF) << 16) + ((this.aByteArray30[this.anInt2400 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public final void method1836(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)I")
	public final int method1837() {
		this.anInt2400 += 2;
		return (this.aByteArray30[this.anInt2400 - 1] & 0xFF) + ((this.aByteArray30[this.anInt2400 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZII[B)V")
	public final void method1839(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			arg1[local10] = this.aByteArray30[this.anInt2400++];
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)Z")
	public final boolean method1840() {
		this.anInt2400 -= 4;
		@Pc(23) int local23 = Static222.method3558(0, this.anInt2400, this.aByteArray30);
		@Pc(27) int local27 = this.method1889();
		return local23 == local27;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method1841() {
		@Pc(11) int local11 = this.anInt2400;
		while (this.aByteArray30[this.anInt2400++] != 0) {
		}
		return Static259.method3911(this.anInt2400 - local11 - 1, local11, this.aByteArray30);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)B")
	public final byte method1842() {
		return (byte) (128 - this.aByteArray30[this.anInt2400++]);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(BI)V")
	public final void method1843(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)I")
	public final int method1844() {
		this.anInt2400 += 4;
		return ((this.aByteArray30[this.anInt2400 - 1] & 0xFF) << 8) + ((this.aByteArray30[this.anInt2400 - 3] & 0xFF) << 24) + ((this.aByteArray30[this.anInt2400 + -4] & 0xFF) << 16) + (this.aByteArray30[this.anInt2400 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)I")
	public final int method1845() {
		this.anInt2400 += 3;
		return ((this.aByteArray30[this.anInt2400 - 1] & 0xFF) << 16) + ((this.aByteArray30[this.anInt2400 - 2] & 0xFF) << 8) + (this.aByteArray30[this.anInt2400 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
	public final void method1847(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1861(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1875(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(II)V")
	public final void method1848(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method1849(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt2400 += Static164.method2592(this.aByteArray30, arg0.length(), arg0, this.anInt2400);
		this.aByteArray30[this.anInt2400++] = 0;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(B)I")
	public final int method1850() {
		this.anInt2400 += 4;
		return (this.aByteArray30[this.anInt2400 - 4] & 0xFF) + ((this.aByteArray30[this.anInt2400 - 1] & 0xFF) << 24) + ((this.aByteArray30[this.anInt2400 + -2] & 0xFF) << 16) + ((this.aByteArray30[this.anInt2400 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)I")
	public final int method1851() {
		this.anInt2400 += 2;
		return ((this.aByteArray30[this.anInt2400 - 2] & 0xFF) << 8) + (this.aByteArray30[this.anInt2400 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(BI)V")
	public final void method1852(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(II)V")
	public final void method1853(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & -2097152) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1861(arg0 >>> 28 | 0x80);
					}
					this.method1861(arg0 >>> 21 | 0x80);
				}
				this.method1861(arg0 >>> 14 | 0x80);
			}
			this.method1861(arg0 >>> 7 | 0x80);
		}
		this.method1861(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(II)V")
	public final void method1854(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(II)V")
	public final void method1855(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)I")
	public final int method1856() {
		@Pc(11) int local11 = this.aByteArray30[this.anInt2400] & 0xFF;
		return local11 < 128 ? this.method1874() : this.method1837() - 32768;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1857(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2400;
		this.anInt2400 = 0;
		@Pc(16) byte[] local16 = new byte[local6];
		this.method1839(local6, local16);
		@Pc(27) BigInteger local27 = new BigInteger(local16);
		@Pc(32) BigInteger local32 = local27.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt2400 = 0;
		this.method1861(local35.length);
		this.method1878(local35.length, local35);
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(B)I")
	public final int method1858() {
		this.anInt2400 += 4;
		return ((this.aByteArray30[this.anInt2400 - 2] & 0xFF) << 24) + ((this.aByteArray30[this.anInt2400 - 1] & 0xFF) << 16) + ((this.aByteArray30[this.anInt2400 + -4] & 0xFF) << 8) + (this.aByteArray30[this.anInt2400 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(BI)V")
	public final void method1859(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(I)I")
	public final int method1860() {
		this.anInt2400 += 2;
		@Pc(38) int local38 = (this.aByteArray30[this.anInt2400 - 2] & 0xFF) + ((this.aByteArray30[this.anInt2400 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(IB)V")
	public final void method1861(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BIB)V")
	public final void method1862(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (this.aByteArray30[this.anInt2400++] - 128);
		}
	}

	@OriginalMember(owner = "client!p", name = "h", descriptor = "(I)I")
	public final int method1863() {
		@Pc(16) int local16 = this.aByteArray30[this.anInt2400] & 0xFF;
		return local16 >= 128 ? this.method1837() - 49152 : this.method1874() + -64;
	}

	@OriginalMember(owner = "client!p", name = "i", descriptor = "(I)J")
	public final long method1864() {
		@Pc(10) long local10 = (long) this.method1889() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method1889() & 0xFFFFFFFFL;
		return (local10 << 32) + local17;
	}

	@OriginalMember(owner = "client!p", name = "j", descriptor = "(I)I")
	public final int method1865() {
		return -this.aByteArray30[this.anInt2400++] & 0xFF;
	}

	@OriginalMember(owner = "client!p", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method1866() {
		@Pc(14) byte local14 = this.aByteArray30[this.anInt2400++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(25) int local25 = this.anInt2400;
		while (this.aByteArray30[this.anInt2400++] != 0) {
		}
		return Static259.method3911(this.anInt2400 - local25 - 1, local25, this.aByteArray30);
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(II)V")
	public final void method1867(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt2400 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!p", name = "l", descriptor = "(I)I")
	public final int method1868() {
		this.anInt2400 += 2;
		return (this.aByteArray30[this.anInt2400 - 2] - 128 & 0xFF) + ((this.aByteArray30[this.anInt2400 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!p", name = "m", descriptor = "(I)I")
	public final int method1869() {
		this.anInt2400 += 2;
		@Pc(31) int local31 = ((this.aByteArray30[this.anInt2400 - 2] & 0xFF) << 8) + (this.aByteArray30[this.anInt2400 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(BI)J")
	public final long method1870(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = local6 * 8;
		@Pc(22) long local22 = 0L;
		while (local20 >= 0) {
			local22 |= ((long) this.aByteArray30[this.anInt2400++] & 0xFFL) << local20;
			local20 -= 8;
		}
		return local22;
	}

	@OriginalMember(owner = "client!p", name = "h", descriptor = "(II)V")
	public final void method1871(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt2400 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt2400 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt2400 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt2400 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(Z)I")
	public final int method1872() {
		return 128 - this.aByteArray30[this.anInt2400++] & 0xFF;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(JZI)V")
	public final void method1873(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local6 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> local26);
		}
	}

	@OriginalMember(owner = "client!p", name = "n", descriptor = "(I)I")
	public final int method1874() {
		return this.aByteArray30[this.anInt2400++] & 0xFF;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)V")
	public final void method1875(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!p", name = "i", descriptor = "(II)V")
	public final void method1876(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 + 128);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(B)I")
	public final int method1877() {
		@Pc(5) int local5 = this.method1856();
		@Pc(11) int local11 = 0;
		while (local5 == 32767) {
			local5 = this.method1856();
			local11 += 32767;
		}
		return local11 + local5;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BII)V")
	public final void method1878(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			this.aByteArray30[this.anInt2400++] = arg1[local13];
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B[III)V")
	public final void method1879(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt2400;
		@Pc(15) int local15 = (arg1 - 5) / 8;
		this.anInt2400 = 5;
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			@Pc(34) int local34 = this.method1889();
			@Pc(38) int local38 = this.method1889();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= local34 + (local34 << 4 ^ local34 >>> 5) ^ local40 - -arg0[local40 >>> 11 & 0x61600003];
				local40 -= -1640531527;
				local34 -= (local38 >>> 5 ^ local38 << 4) + local38 ^ local40 - -arg0[local40 & 0x3];
			}
			this.anInt2400 -= 8;
			this.method1854(local34);
			this.method1854(local38);
		}
		this.anInt2400 = local8;
	}

	@OriginalMember(owner = "client!p", name = "j", descriptor = "(II)V")
	public final void method1880(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B[I)V")
	public final void method1881(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt2400 / 8;
		this.anInt2400 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(22) int local22 = this.method1889();
			@Pc(24) int local24 = 0;
			@Pc(28) int local28 = this.method1889();
			@Pc(32) int local32 = 32;
			while (local32-- > 0) {
				local22 += local24 + arg0[local24 & 0x3] ^ local28 + (local28 << 4 ^ local28 >>> 5);
				local24 += -1640531527;
				local28 += arg0[local24 >>> 11 & 0x16400003] + local24 ^ local22 + (local22 << 4 ^ local22 >>> 5);
			}
			this.anInt2400 -= 8;
			this.method1854(local22);
			this.method1854(local28);
		}
	}

	@OriginalMember(owner = "client!p", name = "o", descriptor = "(I)I")
	public final int method1882() {
		return this.aByteArray30[this.anInt2400++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!p", name = "p", descriptor = "(I)Ljava/lang/String;")
	public final String method1883() {
		if (this.aByteArray30[this.anInt2400] == 0) {
			this.anInt2400++;
			return null;
		} else {
			return this.method1841();
		}
	}

	@OriginalMember(owner = "client!p", name = "k", descriptor = "(II)V")
	public final void method1884(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!p", name = "q", descriptor = "(I)I")
	public final int method1885() {
		@Pc(7) int local7 = 0;
		@Pc(23) byte local23;
		for (local23 = this.aByteArray30[this.anInt2400++]; local23 < 0; local23 = this.aByteArray30[this.anInt2400++]) {
			local7 = (local7 | local23 & 0x7F) << 7;
		}
		return local7 | local23;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IF)V")
	public final void method1886(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray30[this.anInt2400++] = (byte) (local6 >> 24);
		this.aByteArray30[this.anInt2400++] = (byte) (local6 >> 16);
		this.aByteArray30[this.anInt2400++] = (byte) (local6 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) local6;
	}

	@OriginalMember(owner = "client!p", name = "l", descriptor = "(II)V")
	public final void method1887(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(BI)I")
	public final int method1888(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static222.method3558(arg0, this.anInt2400, this.aByteArray30);
		this.method1854(local16);
		return local16;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(Z)I")
	public final int method1889() {
		this.anInt2400 += 4;
		return ((this.aByteArray30[this.anInt2400 - 3] & 0xFF) << 16) + ((this.aByteArray30[this.anInt2400 - 4] & 0xFF) << 24) + ((this.aByteArray30[this.anInt2400 + -2] & 0xFF) << 8) + (this.aByteArray30[this.anInt2400 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BJ)V")
	public final void method1890(@OriginalArg(1) long arg0) {
		this.method1843((int) (arg0 >> 32));
		this.method1843((int) arg0);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(JB)V")
	public final void method1891(@OriginalArg(0) long arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 56);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 48);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 40);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 32);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!p", name = "r", descriptor = "(I)B")
	public final byte method1892() {
		return this.aByteArray30[this.anInt2400++];
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(IB)V")
	public final void method1893(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 16);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 24);
		this.aByteArray30[this.anInt2400++] = (byte) arg0;
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!p", name = "s", descriptor = "(I)B")
	public final byte method1894() {
		return (byte) (this.aByteArray30[this.anInt2400++] - 128);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(IF)V")
	public final void method1895(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray30[this.anInt2400++] = (byte) local6;
		this.aByteArray30[this.anInt2400++] = (byte) (local6 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) (local6 >> 16);
		this.aByteArray30[this.anInt2400++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!p", name = "h", descriptor = "(B)I")
	public final int method1896() {
		this.anInt2400 += 2;
		return (this.aByteArray30[this.anInt2400 - 2] & 0xFF) + ((this.aByteArray30[this.anInt2400 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)V")
	public final void method1897(@OriginalArg(0) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 >> 8);
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 + 128);
	}
}
