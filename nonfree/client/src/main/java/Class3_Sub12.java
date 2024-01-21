import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!la", name = "Rb", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "I")
	public int anInt2886;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
	public Class3_Sub12(@OriginalArg(0) int arg0) {
		this.aByteArray77 = Static117.method2132(arg0);
		this.anInt2886 = 0;
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
	public Class3_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray77 = arg0;
		this.anInt2886 = 0;
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(I)I")
	public final int method1917() {
		return -this.aByteArray77[this.anInt2886++] & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
	public final void method1919(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)I")
	public final int method1920() {
		this.anInt2886 += 4;
		return (this.aByteArray77[this.anInt2886 - 1] & 0xFF) + ((this.aByteArray77[this.anInt2886 - 3] & 0xFF) << 16) + ((this.aByteArray77[this.anInt2886 - 4] & 0xFF) << 24) + ((this.aByteArray77[this.anInt2886 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(B)B")
	public final byte method1921() {
		return (byte) -this.aByteArray77[this.anInt2886++];
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V")
	public final void method1922(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt2886++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(B)I")
	public final int method1923() {
		this.anInt2886 += 3;
		return ((this.aByteArray77[this.anInt2886 - 2] & 0xFF) << 8) + ((this.aByteArray77[this.anInt2886 - 3] & 0xFF) << 16) + (this.aByteArray77[this.anInt2886 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)V")
	public final void method1924(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 + 128);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(B)I")
	public final int method1925() {
		return this.aByteArray77[this.anInt2886++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V")
	public final void method1926(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt2886 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt2886 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt2886 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt2886 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IJ)V")
	public final void method1927(@OriginalArg(1) long arg0) {
		this.method1961((int) (arg0 >> 32));
		this.method1961((int) arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!qf;)V")
	public final void method1929(@OriginalArg(1) Class60 arg0) {
		this.anInt2886 += arg0.method1856(arg0.method1836(), this.aByteArray77, this.anInt2886);
		this.aByteArray77[this.anInt2886++] = 0;
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(B)I")
	public final int method1932() {
		@Pc(21) byte local21 = this.aByteArray77[this.anInt2886++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray77[this.anInt2886++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)I")
	public final int method1933() {
		this.anInt2886 += 4;
		return (this.aByteArray77[this.anInt2886 - 2] & 0xFF) + ((this.aByteArray77[this.anInt2886 - 4] & 0xFF) << 16) + ((this.aByteArray77[this.anInt2886 + -3] & 0xFF) << 24) + ((this.aByteArray77[this.anInt2886 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(II)V")
	public final void method1934(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt2886++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(II)V")
	public final void method1935(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt2886 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!la", name = "i", descriptor = "(B)I")
	public final int method1936() {
		return this.aByteArray77[this.anInt2886++] & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(II)V")
	public final void method1937(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(I)I")
	public final int method1938() {
		this.anInt2886 += 4;
		return (this.aByteArray77[this.anInt2886 - 4] & 0xFF) + ((this.aByteArray77[this.anInt2886 - 3] & 0xFF) << 8) + ((this.aByteArray77[this.anInt2886 + -1] & 0xFF) << 24) + ((this.aByteArray77[this.anInt2886 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!la", name = "j", descriptor = "(B)I")
	public final int method1940() {
		this.anInt2886 += 2;
		return ((this.aByteArray77[this.anInt2886 - 1] & 0xFF) << 8) + (this.aByteArray77[this.anInt2886 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[BII)V")
	public final void method1941(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray77[this.anInt2886++];
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)V")
	public final void method1942(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1937(arg0 >>> 28 | 0x80);
					}
					this.method1937(arg0 >>> 21 | 0x80);
				}
				this.method1937(arg0 >>> 14 | 0x80);
			}
			this.method1937(arg0 >>> 7 | 0x80);
		}
		this.method1937(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!la", name = "i", descriptor = "(I)Lclient!qf;")
	public final Class60 method1943() {
		@Pc(2) int local2 = this.anInt2886;
		while (this.aByteArray77[this.anInt2886++] != 0) {
		}
		return Static19.method2271(local2, this.aByteArray77, this.anInt2886 - local2 - 1);
	}

	@OriginalMember(owner = "client!la", name = "j", descriptor = "(I)I")
	public final int method1944() {
		@Pc(18) int local18 = this.aByteArray77[this.anInt2886] & 0xFF;
		return local18 >= 128 ? this.method1963() - 49152 : this.method1936() + -64;
	}

	@OriginalMember(owner = "client!la", name = "k", descriptor = "(I)Lclient!qf;")
	public final Class60 method1945() {
		if (this.aByteArray77[this.anInt2886] == 0) {
			this.anInt2886++;
			return null;
		} else {
			return this.method1943();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BII[B)V")
	public final void method1946(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray77[this.anInt2886++] - 128);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IIBI)V")
	public final void method1947(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt2886;
		this.anInt2886 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) int local31 = this.method1920();
			@Pc(35) int local35 = this.method1920();
			@Pc(37) int local37 = -957401312;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local35 -= arg0[local37 >>> 11 & 0x3] + local37 ^ local31 + (local31 >>> 5 ^ local31 << 4);
				local37 -= -1640531527;
				local31 -= arg0[local37 & 0x3] + local37 ^ local35 + (local35 >>> 5 ^ local35 << 4);
			}
			this.anInt2886 -= 8;
			this.method1966(local31);
			this.method1966(local35);
		}
		this.anInt2886 = local8;
	}

	@OriginalMember(owner = "client!la", name = "l", descriptor = "(I)I")
	public final int method1948() {
		@Pc(19) int local19 = this.aByteArray77[this.anInt2886] & 0xFF;
		return local19 < 128 ? this.method1936() : this.method1963() - 32768;
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(II)V")
	public final void method1949(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!la", name = "m", descriptor = "(I)I")
	public final int method1950() {
		this.anInt2886 += 4;
		return ((this.aByteArray77[this.anInt2886 - 4] & 0xFF) << 8) + (((this.aByteArray77[this.anInt2886 - 2] & 0xFF) << 24) + ((this.aByteArray77[this.anInt2886 - 1] & 0xFF) << 16)) + (this.aByteArray77[this.anInt2886 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!la", name = "i", descriptor = "(II)V")
	public final void method1951(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) arg0;
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!la", name = "n", descriptor = "(I)J")
	public final long method1952() {
		@Pc(17) long local17 = (long) this.method1920() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1920() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(Z)I")
	public final int method1953() {
		this.anInt2886 += 2;
		return ((this.aByteArray77[this.anInt2886 - 1] & 0xFF) << 8) + (this.aByteArray77[this.anInt2886 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!la", name = "o", descriptor = "(I)B")
	public final byte method1954() {
		return (byte) (128 - this.aByteArray77[this.anInt2886++]);
	}

	@OriginalMember(owner = "client!la", name = "k", descriptor = "(B)I")
	public final int method1955() {
		this.anInt2886 += 2;
		return ((this.aByteArray77[this.anInt2886 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt2886 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!la", name = "j", descriptor = "(II)V")
	public final void method1956(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1937(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1922(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1957(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2886;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt2886 = 0;
		this.method1941(local9, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2886 = 0;
		this.method1937(local31.length);
		this.method1965(local31, local31.length);
	}

	@OriginalMember(owner = "client!la", name = "l", descriptor = "(B)B")
	public final byte method1958() {
		return this.aByteArray77[this.anInt2886++];
	}

	@OriginalMember(owner = "client!la", name = "k", descriptor = "(II)I")
	public final int method1959(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = Static96.method1804(arg0, this.anInt2886, this.aByteArray77);
		this.method1966(local19);
		return local19;
	}

	@OriginalMember(owner = "client!la", name = "l", descriptor = "(II)V")
	public final void method1960(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt2886++] = (byte) arg0;
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)V")
	public final void method1961(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt2886++] = (byte) arg0;
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!la", name = "p", descriptor = "(I)I")
	public final int method1962() {
		return 128 - this.aByteArray77[this.anInt2886++] & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "q", descriptor = "(I)I")
	public final int method1963() {
		this.anInt2886 += 2;
		return (this.aByteArray77[this.anInt2886 - 1] & 0xFF) + ((this.aByteArray77[this.anInt2886 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!la", name = "m", descriptor = "(B)I")
	public final int method1964() {
		this.anInt2886 += 2;
		@Pc(34) int local34 = ((this.aByteArray77[this.anInt2886 - 1] & 0xFF) << 8) + (this.aByteArray77[this.anInt2886 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([BZII)V")
	public final void method1965(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aByteArray77[this.anInt2886++] = arg0[local12];
		}
	}

	@OriginalMember(owner = "client!la", name = "m", descriptor = "(II)V")
	public final void method1966(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt2886++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!la", name = "n", descriptor = "(II)V")
	public final void method1967(@OriginalArg(0) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!la", name = "r", descriptor = "(I)I")
	public final int method1969() {
		this.anInt2886 += 2;
		@Pc(39) int local39 = ((this.aByteArray77[this.anInt2886 - 2] & 0xFF) << 8) + (this.aByteArray77[this.anInt2886 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!la", name = "o", descriptor = "(II)V")
	public final void method1970(@OriginalArg(1) int arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) arg0;
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(JB)V")
	public final void method1972(@OriginalArg(0) long arg0) {
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 56);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 48);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 40);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 32);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 24);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 16);
		this.aByteArray77[this.anInt2886++] = (byte) (arg0 >> 8);
		this.aByteArray77[this.anInt2886++] = (byte) arg0;
	}
}
