import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!bk", name = "O", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!bk", name = "jb", descriptor = "I")
	public int anInt2029;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(I)V")
	public Class5_Sub1(@OriginalArg(0) int arg0) {
		this.aByteArray18 = Static99.method2012(arg0);
		this.anInt2029 = 0;
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V")
	public Class5_Sub1(@OriginalArg(0) byte[] arg0) {
		this.anInt2029 = 0;
		this.aByteArray18 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	public final void method1825(@OriginalArg(0) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 16);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)I")
	public final int method1826() {
		this.anInt2029 += 4;
		return ((this.aByteArray18[this.anInt2029 - 4] & 0xFF) << 24) + ((this.aByteArray18[this.anInt2029 - 3] & 0xFF) << 16) + ((this.aByteArray18[this.anInt2029 + -2] & 0xFF) << 8) + (this.aByteArray18[this.anInt2029 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
	public final void method1827(@OriginalArg(1) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 16);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)I")
	public final int method1828() {
		this.anInt2029 += 4;
		return ((this.aByteArray18[this.anInt2029 - 1] & 0xFF) << 16) + ((this.aByteArray18[this.anInt2029 - 2] & 0xFF) << 24) + ((this.aByteArray18[this.anInt2029 + -4] & 0xFF) << 8) + (this.aByteArray18[this.anInt2029 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(BI)V")
	public final void method1829(@OriginalArg(1) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method1830() {
		if (this.aByteArray18[this.anInt2029] == 0) {
			this.anInt2029++;
			return null;
		} else {
			return this.method1840();
		}
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)B")
	public final byte method1831() {
		return (byte) (this.aByteArray18[this.anInt2029++] - 128);
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)I")
	public final int method1832() {
		return this.aByteArray18[this.anInt2029++] & 0xFF;
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(B)I")
	public final int method1834() {
		this.anInt2029 += 2;
		@Pc(32) int local32 = ((this.aByteArray18[this.anInt2029 - 2] & 0xFF) << 8) + (this.aByteArray18[this.anInt2029 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
	public final void method1835(@OriginalArg(1) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([BIII)V")
	public final void method1836(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray18[this.anInt2029++] - 128);
		}
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)I")
	public final int method1837() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method1866(); local11 == 32767; local11 = this.method1866()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)I")
	public final int method1839() {
		this.anInt2029 += 2;
		return ((this.aByteArray18[this.anInt2029 - 1] & 0xFF) << 8) + (this.aByteArray18[this.anInt2029 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method1840() {
		@Pc(6) int local6 = this.anInt2029;
		while (this.aByteArray18[this.anInt2029++] != 0) {
		}
		@Pc(34) int local34 = this.anInt2029 - local6 - 1;
		return local34 == 0 ? "" : Static326.method5503(this.aByteArray18, local34, local6);
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)B")
	public final byte method1841() {
		return (byte) (128 - this.aByteArray18[this.anInt2029++]);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZIJ)V")
	public final void method1842(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local6 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray18[this.anInt2029++] = (byte) (arg1 >> local27);
		}
	}

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)I")
	public final int method1843() {
		this.anInt2029 += 3;
		return (this.aByteArray18[this.anInt2029 - 1] & 0xFF) + ((this.aByteArray18[this.anInt2029 - 2] & 0xFF) << 8) + ((this.aByteArray18[this.anInt2029 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)V")
	public final void method1844(@OriginalArg(0) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 + 128);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "(I)I")
	public final int method1845() {
		this.anInt2029 += 2;
		return ((this.aByteArray18[this.anInt2029 - 2] & 0xFF) << 8) + (this.aByteArray18[this.anInt2029 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "(B)I")
	public final int method1846() {
		return this.aByteArray18[this.anInt2029++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(BI)V")
	public final void method1847(@OriginalArg(1) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(II)V")
	public final void method1848(@OriginalArg(0) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 16);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 24);
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method1849(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt2029 += Static216.method3817(this.anInt2029, arg0, this.aByteArray18, arg0.length());
		this.aByteArray18[this.anInt2029++] = 0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[BII)V")
	public final void method1850(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			this.aByteArray18[this.anInt2029++] = arg0[local11];
		}
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(BI)V")
	public final void method1851(@OriginalArg(1) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 24);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 16);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
	public final void method1852(@OriginalArg(0) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 16);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "(I)I")
	public final int method1853() {
		this.anInt2029 += 4;
		return (this.aByteArray18[this.anInt2029 - 4] & 0xFF) + ((this.aByteArray18[this.anInt2029 - 3] & 0xFF) << 8) + ((this.aByteArray18[this.anInt2029 - 2] & 0xFF) << 16) + ((this.aByteArray18[this.anInt2029 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "(I)I")
	public final int method1854() {
		@Pc(16) int local16 = this.aByteArray18[this.anInt2029] & 0xFF;
		return local16 < 128 ? this.method1832() - 64 : this.method1845() + -49152;
	}

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method1855() {
		@Pc(14) byte local14 = this.aByteArray18[this.anInt2029++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt2029;
		while (this.aByteArray18[this.anInt2029++] != 0) {
		}
		@Pc(50) int local50 = this.anInt2029 - local27 - 1;
		return local50 == 0 ? "" : Static326.method5503(this.aByteArray18, local50, local27);
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(II)V")
	public final void method1856(@OriginalArg(0) int arg0) {
		this.aByteArray18[this.anInt2029 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray18[this.anInt2029 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray18[this.anInt2029 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray18[this.anInt2029 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(BI)V")
	public final void method1857(@OriginalArg(1) int arg0) {
		this.aByteArray18[this.anInt2029 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
	public final void method1858(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1886(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1870(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method1859(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2029;
		this.anInt2029 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1860(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2029 = 0;
		this.method1886(local31.length);
		this.method1850(local31, local31.length);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "([BIII)V")
	public final void method1860(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = this.aByteArray18[this.anInt2029++];
		}
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(II)V")
	public final void method1861(@OriginalArg(0) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "(B)I")
	public final int method1862() {
		this.anInt2029 += 2;
		@Pc(41) int local41 = ((this.aByteArray18[this.anInt2029 - 2] & 0xFF) << 8) + (this.aByteArray18[this.anInt2029 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "(B)B")
	public final byte method1863() {
		return this.aByteArray18[this.anInt2029++];
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(II)I")
	public final int method1864(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static63.method1317(arg0, this.anInt2029, this.aByteArray18);
		this.method1851(local11);
		return local11;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([IZ)V")
	public final void method1865(@OriginalArg(0) int[] arg0) {
		@Pc(14) int local14 = this.anInt2029 / 8;
		this.anInt2029 = 0;
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(25) int local25 = this.method1826();
			@Pc(29) int local29 = this.method1826();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += (local29 >>> 5 ^ local29 << 4) + local29 ^ arg0[local31 & 0x3] + local31;
				local31 += -1640531527;
				local29 += local31 + arg0[local31 >>> 11 & 0x4DC00003] ^ (local25 >>> 5 ^ local25 << 4) - -local25;
			}
			this.anInt2029 -= 8;
			this.method1851(local25);
			this.method1851(local29);
		}
	}

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "(I)I")
	public final int method1866() {
		@Pc(19) int local19 = this.aByteArray18[this.anInt2029] & 0xFF;
		return local19 >= 128 ? this.method1845() - 32768 : this.method1832();
	}

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "(I)I")
	public final int method1867() {
		this.anInt2029 += 2;
		return ((this.aByteArray18[this.anInt2029 - 2] & 0xFF) << 8) + (this.aByteArray18[this.anInt2029 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "(I)Z")
	public final boolean method1868() {
		this.anInt2029 -= 4;
		@Pc(24) int local24 = Static63.method1317(0, this.anInt2029, this.aByteArray18);
		@Pc(28) int local28 = this.method1826();
		return local28 == local24;
	}

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "(II)J")
	public final long method1869(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local0 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray18[this.anInt2029++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(IB)V")
	public final void method1870(@OriginalArg(0) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IJ)V")
	public final void method1871(@OriginalArg(1) long arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 56);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 48);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 40);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 32);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 24);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 16);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "(I)I")
	public final int method1872() {
		return 128 - this.aByteArray18[this.anInt2029++] & 0xFF;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(IB)V")
	public final void method1873(@OriginalArg(0) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[BB)V")
	public final void method1874(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			arg1[local9] = (byte) (this.aByteArray18[this.anInt2029++] - 128);
		}
	}

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "(I)I")
	public final int method1875() {
		this.anInt2029 += 2;
		return ((this.aByteArray18[this.anInt2029 - 1] & 0xFF) << 8) + (this.aByteArray18[this.anInt2029 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(BI)V")
	public final void method1876(@OriginalArg(1) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 8);
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 24);
		this.aByteArray18[this.anInt2029++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[II)V")
	public final void method1877(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(6) int local6 = this.anInt2029;
		this.anInt2029 = 5;
		@Pc(20) int local20 = (arg0 - 5) / 8;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(27) int local27 = this.method1826();
			@Pc(31) int local31 = this.method1826();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= (local27 << 4 ^ local27 >>> 5) + local27 ^ local33 + arg1[local33 >>> 11 & 0x3];
				local33 -= -1640531527;
				local27 -= arg1[local33 & 0x3] + local33 ^ (local31 << 4 ^ local31 >>> 5) - -local31;
			}
			this.anInt2029 -= 8;
			this.method1851(local27);
			this.method1851(local31);
		}
		this.anInt2029 = local6;
	}

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "(B)B")
	public final byte method1878() {
		return (byte) -this.aByteArray18[this.anInt2029++];
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V")
	public final void method1880(@OriginalArg(1) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "(I)I")
	public final int method1881() {
		@Pc(24) byte local24 = this.aByteArray18[this.anInt2029++];
		@Pc(26) int local26 = 0;
		while (local24 < 0) {
			local26 = (local24 & 0x7F | local26) << 7;
			local24 = this.aByteArray18[this.anInt2029++];
		}
		return local24 | local26;
	}

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "(II)V")
	public final void method1882(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1886(arg0 >>> 28 | 0x80);
					}
					this.method1886(arg0 >>> 21 | 0x80);
				}
				this.method1886(arg0 >>> 14 | 0x80);
			}
			this.method1886(arg0 >>> 7 | 0x80);
		}
		this.method1886(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "(I)I")
	public final int method1883() {
		this.anInt2029 += 4;
		return (this.aByteArray18[this.anInt2029 - 2] & 0xFF) + ((this.aByteArray18[this.anInt2029 - 1] & 0xFF) << 8) + ((this.aByteArray18[this.anInt2029 - 4] & 0xFF) << 16) + ((this.aByteArray18[this.anInt2029 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)J")
	public final long method1884() {
		@Pc(10) long local10 = (long) this.method1826() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1826() & 0xFFFFFFFFL;
		return (local10 << 32) + local24;
	}

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "(I)I")
	public final int method1885() {
		return -this.aByteArray18[this.anInt2029++] & 0xFF;
	}

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "(II)V")
	public final void method1886(@OriginalArg(1) int arg0) {
		this.aByteArray18[this.anInt2029++] = (byte) arg0;
	}
}
