import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "I")
	public int anInt2574;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6(@OriginalArg(0) int arg0) {
		this.aByteArray27 = Static84.method1393(arg0);
		this.anInt2574 = 0;
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V")
	public Class1_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray27 = arg0;
		this.anInt2574 = 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
	public final void method1816(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
	public final int method1817() {
		this.anInt2574 += 4;
		return ((this.aByteArray27[this.anInt2574 - 3] & 0xFF) << 16) + (this.aByteArray27[this.anInt2574 - 4] << 24 & 0xFF000000) + ((this.aByteArray27[this.anInt2574 + -2] & 0xFF) << 8) + (this.aByteArray27[this.anInt2574 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)I")
	public final int method1818() {
		this.anInt2574 += 2;
		@Pc(33) int local33 = (this.aByteArray27[this.anInt2574 - 2] - 128 & 0xFF) + ((this.aByteArray27[this.anInt2574 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(BI)V")
	public final void method1819(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)B")
	public final byte method1820() {
		return (byte) (this.aByteArray27[this.anInt2574++] - 128);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(Z)I")
	public final int method1821() {
		this.anInt2574 += 2;
		@Pc(38) int local38 = (this.aByteArray27[this.anInt2574 - 1] - 128 & 0xFF) + ((this.aByteArray27[this.anInt2574 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(Z)I")
	public final int method1822() {
		this.anInt2574 += 2;
		@Pc(38) int local38 = (this.aByteArray27[this.anInt2574 - 2] & 0xFF) + ((this.aByteArray27[this.anInt2574 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(Z)B")
	public final byte method1824() {
		return this.aByteArray27[this.anInt2574++];
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public final void method1825(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)I")
	public final int method1826() {
		return this.aByteArray27[this.anInt2574++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!rd;)V")
	public final void method1827(@OriginalArg(1) Class64 arg0) {
		this.anInt2574 += arg0.method1489(this.aByteArray27, this.anInt2574, arg0.method1469());
		this.aByteArray27[this.anInt2574++] = 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BII)V")
	public final void method1828(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray27[this.anInt2574++] - 128);
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
	public final void method1829(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)V")
	public final void method1830(@OriginalArg(0) long arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 56);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 48);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 40);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 32);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2574++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)Lclient!rd;")
	public final Class64 method1831() {
		@Pc(14) int local14 = this.anInt2574;
		while (this.aByteArray27[this.anInt2574++] != 0) {
		}
		return Static22.method428(this.aByteArray27, this.anInt2574 - local14 - 1, local14);
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(Z)I")
	public final int method1832() {
		this.anInt2574 += 2;
		return ((this.aByteArray27[this.anInt2574 - 1] & 0xFF) << 8) + (this.aByteArray27[this.anInt2574 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)I")
	public final int method1833() {
		this.anInt2574 += 3;
		return (this.aByteArray27[this.anInt2574 - 2] & 0xFF) + ((this.aByteArray27[this.anInt2574 - 1] & 0xFF) << 8) + ((this.aByteArray27[this.anInt2574 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(Z)I")
	public final int method1834() {
		@Pc(18) int local18 = this.aByteArray27[this.anInt2574] & 0xFF;
		return local18 < 128 ? this.method1837() - 64 : this.method1842() + -49152;
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(I)B")
	public final byte method1835() {
		return (byte) -this.aByteArray27[this.anInt2574++];
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public final void method1836(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2574;
		this.anInt2574 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1846(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2574 = 0;
		this.method1853(local31.length);
		this.method1858(local31, local31.length);
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)I")
	public final int method1837() {
		return this.aByteArray27[this.anInt2574++] & 0xFF;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(II)V")
	public final void method1838(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> -2016590992);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2574++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
	public final void method1839(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2574++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(II)V")
	public final void method1840(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 + 128);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!id", name = "i", descriptor = "(I)I")
	public final int method1841() {
		return -this.aByteArray27[this.anInt2574++] & 0xFF;
	}

	@OriginalMember(owner = "client!id", name = "j", descriptor = "(I)I")
	public final int method1842() {
		this.anInt2574 += 2;
		return (this.aByteArray27[this.anInt2574 - 1] & 0xFF) + ((this.aByteArray27[this.anInt2574 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([IIZI)V")
	public final void method1843(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anInt2574;
		this.anInt2574 = 5;
		@Pc(22) int local22 = (arg1 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(28) int local28 = -957401312;
			@Pc(34) int local34 = this.method1817();
			@Pc(36) int local36 = 32;
			@Pc(40) int local40 = this.method1817();
			while (local36-- > 0) {
				local40 -= arg0[local28 >>> 11 & 0x3] + local28 ^ (local34 << 4 ^ local34 >>> 5) + local34;
				local28 -= -1640531527;
				local34 -= local40 + (local40 << 4 ^ local40 >>> 5) ^ local28 + arg0[local28 & 0x3];
			}
			this.anInt2574 -= 8;
			this.method1851(local34);
			this.method1851(local40);
		}
		this.anInt2574 = local4;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(B)I")
	public final int method1844() {
		@Pc(18) int local18 = this.aByteArray27[this.anInt2574] & 0xFF;
		return local18 < 128 ? this.method1837() : this.method1842() - 32768;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(B)I")
	public final int method1845() {
		this.anInt2574 += 4;
		return ((this.aByteArray27[this.anInt2574 - 1] & 0xFF) << 8) + ((this.aByteArray27[this.anInt2574 - 3] & 0xFF) << 24) + ((this.aByteArray27[this.anInt2574 + -4] & 0xFF) << 16) + (this.aByteArray27[this.anInt2574 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BBI)V")
	public final void method1846(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
			arg1[local16] = this.aByteArray27[this.anInt2574++];
		}
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(B)I")
	public final int method1847() {
		this.anInt2574 += 4;
		return (this.aByteArray27[this.anInt2574 - 3] & 0xFF) + ((this.aByteArray27[this.anInt2574 - 4] & 0xFF) << 8) + ((this.aByteArray27[this.anInt2574 + -1] & 0xFF) << 16) + ((this.aByteArray27[this.anInt2574 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I[BII)V")
	public final void method1848(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) int local9 = arg1 - 1; local9 >= 0; local9--) {
			arg0[local9] = this.aByteArray27[this.anInt2574++];
		}
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(B)I")
	public final int method1850() {
		this.anInt2574 += 2;
		return (this.aByteArray27[this.anInt2574 - 1] - 128 & 0xFF) + ((this.aByteArray27[this.anInt2574 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(II)V")
	public final void method1851(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2574++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)V")
	public final void method1852(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1853(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1839(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(BI)V")
	public final void method1853(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(II)V")
	public final void method1854(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2574++] = (byte) arg0;
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!id", name = "i", descriptor = "(B)I")
	public final int method1855() {
		this.anInt2574 += 2;
		return (this.aByteArray27[this.anInt2574 - 2] & 0xFF) + ((this.aByteArray27[this.anInt2574 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!id", name = "l", descriptor = "(I)I")
	public final int method1857() {
		return 128 - this.aByteArray27[this.anInt2574++] & 0xFF;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BBII)V")
	public final void method1858(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray27[this.anInt2574++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(Z)B")
	public final byte method1860() {
		return (byte) (128 - this.aByteArray27[this.anInt2574++]);
	}

	@OriginalMember(owner = "client!id", name = "m", descriptor = "(I)I")
	public final int method1861() {
		this.anInt2574 += 2;
		@Pc(32) int local32 = (this.aByteArray27[this.anInt2574 - 1] & 0xFF) + ((this.aByteArray27[this.anInt2574 - 2] & 0xFF) << 8);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(II)V")
	public final void method1863(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) arg0;
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(II)V")
	public final void method1864(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> -1762115368);
		this.aByteArray27[this.anInt2574++] = (byte) arg0;
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!id", name = "i", descriptor = "(Z)J")
	public final long method1865() {
		@Pc(11) long local11 = (long) this.method1817() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1817() & 0xFFFFFFFFL;
		return local22 + (local11 << 32);
	}

	@OriginalMember(owner = "client!id", name = "i", descriptor = "(II)V")
	public final void method1866(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2574 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!id", name = "k", descriptor = "(B)I")
	public final int method1867() {
		this.anInt2574 += 4;
		return (this.aByteArray27[this.anInt2574 - 4] & 0xFF) + ((this.aByteArray27[this.anInt2574 - 1] & 0xFF) << 24) + ((this.aByteArray27[this.anInt2574 + -2] & 0xFF) << 16) + ((this.aByteArray27[this.anInt2574 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!id", name = "l", descriptor = "(B)I")
	public final int method1868() {
		this.anInt2574 += 3;
		return ((this.aByteArray27[this.anInt2574 - 2] & 0xFF) << 8) + ((this.aByteArray27[this.anInt2574 - 3] & 0xFF) << 16) + (this.aByteArray27[this.anInt2574 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!id", name = "j", descriptor = "(Z)I")
	public final int method1869() {
		@Pc(21) byte local21 = this.aByteArray27[this.anInt2574++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray27[this.anInt2574++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(BI)I")
	public final int method1870(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static20.method408(this.aByteArray27, arg0, this.anInt2574);
		this.method1851(local16);
		return local16;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(IB)V")
	public final void method1871(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2574++] = (byte) arg0;
		this.aByteArray27[this.anInt2574++] = (byte) (arg0 >> 8);
	}
}
