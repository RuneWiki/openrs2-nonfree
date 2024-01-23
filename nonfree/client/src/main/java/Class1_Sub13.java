import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
	public int anInt2018 = 0;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13(@OriginalArg(0) int arg0) {
		this.aByteArray63 = Static34.method605(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray63 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)I")
	public final int method1814() {
		this.anInt2018 += 4;
		return (this.aByteArray63[this.anInt2018 - 4] & 0xFF) + ((this.aByteArray63[this.anInt2018 - 3] & 0xFF) << 8) + ((this.aByteArray63[this.anInt2018 + -1] & 0xFF) << 24) + ((this.aByteArray63[this.anInt2018 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)B")
	public final byte method1815() {
		return (byte) -this.aByteArray63[this.anInt2018++];
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)I")
	public final int method1816() {
		this.anInt2018 += 3;
		return ((this.aByteArray63[this.anInt2018 - 1] & 0xFF) << 16) + ((this.aByteArray63[this.anInt2018 - 2] & 0xFF) << 8) + (this.aByteArray63[this.anInt2018 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)I")
	public final int method1817() {
		@Pc(16) int local16 = this.aByteArray63[this.anInt2018] & 0xFF;
		return local16 >= 128 ? this.method1879() - 49152 : this.method1853() + -64;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public final void method1818(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 + 128);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V")
	public final void method1819(@OriginalArg(1) int arg0) {
		if ((-128 & arg0) != 0) {
			if ((-16384 & arg0) != 0) {
				if ((arg0 & -2097152) != 0) {
					if ((arg0 & -268435456) != 0) {
						this.method1822(arg0 >>> 28 | 0x80);
					}
					this.method1822(arg0 >>> 21 | 0x80);
				}
				this.method1822(arg0 >>> 14 | 0x80);
			}
			this.method1822(arg0 >>> 7 | 0x80);
		}
		this.method1822(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public final void method1820(@OriginalArg(1) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BJ)V")
	public final void method1821(@OriginalArg(1) long arg0) {
		this.method1858((int) (arg0 >> 32));
		this.method1858((int) arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V")
	public final void method1822(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)V")
	public final void method1823(@OriginalArg(1) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)V")
	public final void method1825(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(II)J")
	public final long method1826(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) long local24 = 0L;
		for (@Pc(28) int local28 = local2 * 8; local28 >= 0; local28 -= 8) {
			local24 |= ((long) this.aByteArray63[this.anInt2018++] & 0xFFL) << local28;
		}
		return local24;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)Ljava/lang/String;")
	public final String method1827() {
		@Pc(13) int local13 = this.anInt2018;
		while (this.aByteArray63[this.anInt2018++] != 0) {
		}
		return Static172.method2963(this.aByteArray63, this.anInt2018 - local13 - 1, local13);
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)B")
	public final byte method1829() {
		return this.aByteArray63[this.anInt2018++];
	}

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "(I)I")
	public final int method1830() {
		@Pc(7) int local7 = this.aByteArray63[this.anInt2018] & 0xFF;
		return local7 >= 128 ? this.method1879() - 32768 : this.method1853();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
	public final void method1831(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1822(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1835(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([BIII)V")
	public final void method1832(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray63[this.anInt2018++] - 128);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)J")
	public final long method1833() {
		@Pc(13) long local13 = (long) this.method1860() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1860() & 0xFFFFFFFFL;
		return (local13 << 32) + local24;
	}

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "(I)I")
	public final int method1834() {
		this.anInt2018 += 4;
		return ((this.aByteArray63[this.anInt2018 - 1] & 0xFF) << 16) + ((this.aByteArray63[this.anInt2018 - 2] & 0xFF) << 24) + ((this.aByteArray63[this.anInt2018 + -4] & 0xFF) << 8) + (this.aByteArray63[this.anInt2018 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IB)V")
	public final void method1835(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(ZI)V")
	public final void method1836(@OriginalArg(1) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 24);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "(I)B")
	public final byte method1837() {
		return (byte) (128 - this.aByteArray63[this.anInt2018++]);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(IB)V")
	public final void method1838(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(BI)V")
	public final void method1839(@OriginalArg(1) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 16);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "(I)Z")
	public final boolean method1842() {
		this.anInt2018 -= 4;
		@Pc(22) int local22 = Static220.method3564(this.anInt2018, this.aByteArray63, 0);
		@Pc(26) int local26 = this.method1860();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "(I)I")
	public final int method1843() {
		this.anInt2018 += 2;
		@Pc(31) int local31 = ((this.aByteArray63[this.anInt2018 - 2] & 0xFF) << 8) + (this.aByteArray63[this.anInt2018 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)I")
	public final int method1844() {
		this.anInt2018 += 2;
		return ((this.aByteArray63[this.anInt2018 - 2] & 0xFF) << 8) + (this.aByteArray63[this.anInt2018 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)I")
	public final int method1845() {
		return 128 - this.aByteArray63[this.anInt2018++] & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "(I)I")
	public final int method1846() {
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = this.method1830();
		while (local18 == 32767) {
			local18 = this.method1830();
			local14 += 32767;
		}
		return local14 + local18;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IJI)V")
	public final void method1847(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(30) int local30 = local2 * 8; local30 >= 0; local30 -= 8) {
			this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> local30);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(FB)V")
	public final void method1848(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray63[this.anInt2018++] = (byte) local6;
		this.aByteArray63[this.anInt2018++] = (byte) (local6 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) (local6 >> 16);
		this.aByteArray63[this.anInt2018++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "(I)I")
	public final int method1849() {
		return -this.aByteArray63[this.anInt2018++] & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([II)V")
	public final void method1850(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt2018 / 8;
		this.anInt2018 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(33) int local33 = this.method1860();
			@Pc(37) int local37 = this.method1860();
			@Pc(39) int local39 = 0;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local33 += (local37 << 4 ^ local37 >>> 5) + local37 ^ arg0[local39 & 0x3] + local39;
				local39 += -1640531527;
				local37 += arg0[local39 >>> 11 & 0x53600003] + local39 ^ (local33 >>> 5 ^ local33 << 4) + local33;
			}
			this.anInt2018 -= 8;
			this.method1851(local33);
			this.method1851(local37);
		}
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(II)V")
	public final void method1851(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 24);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 16);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method1852(@OriginalArg(1) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local3 + " - cannot pjstr");
		}
		this.anInt2018 += Static198.method3327(arg0.length(), this.aByteArray63, this.anInt2018, arg0);
		this.aByteArray63[this.anInt2018++] = 0;
	}

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "(I)I")
	public final int method1853() {
		return this.aByteArray63[this.anInt2018++] & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method1854(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(12) int local12 = this.anInt2018;
		@Pc(15) byte[] local15 = new byte[local12];
		this.anInt2018 = 0;
		this.method1866(local15, local12);
		@Pc(31) BigInteger local31 = new BigInteger(local15);
		@Pc(36) BigInteger local36 = local31.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt2018 = 0;
		this.method1822(local39.length);
		this.method1864(local39, local39.length);
	}

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "(I)I")
	public final int method1856() {
		this.anInt2018 += 2;
		return ((this.aByteArray63[this.anInt2018 - 1] & 0xFF) << 8) + (this.aByteArray63[this.anInt2018 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(JZ)V")
	public final void method1857(@OriginalArg(0) long arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 56);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 48);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 40);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 32);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 24);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 16);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(II)V")
	public final void method1858(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 16);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "(I)Ljava/lang/String;")
	public final String method1859() {
		@Pc(14) byte local14 = this.aByteArray63[this.anInt2018++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(28) int local28 = this.anInt2018;
		while (this.aByteArray63[this.anInt2018++] != 0) {
		}
		return Static172.method2963(this.aByteArray63, this.anInt2018 - local28 - 1, local28);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)I")
	public final int method1860() {
		this.anInt2018 += 4;
		return ((this.aByteArray63[this.anInt2018 - 2] & 0xFF) << 8) + ((this.aByteArray63[this.anInt2018 - 4] & 0xFF) << 24) + ((this.aByteArray63[this.anInt2018 - 3] & 0xFF) << 16) + (this.aByteArray63[this.anInt2018 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "(I)I")
	public final int method1861() {
		this.anInt2018 += 4;
		return (this.aByteArray63[this.anInt2018 - 2] & 0xFF) + ((this.aByteArray63[this.anInt2018 - 4] & 0xFF) << 16) + ((this.aByteArray63[this.anInt2018 + -3] & 0xFF) << 24) + ((this.aByteArray63[this.anInt2018 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(II)V")
	public final void method1862(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)I")
	public final int method1863() {
		@Pc(16) byte local16 = this.aByteArray63[this.anInt2018++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray63[this.anInt2018++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B[BII)V")
	public final void method1864(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			this.aByteArray63[this.anInt2018++] = arg0[local17];
		}
	}

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "(II)V")
	public final void method1865(@OriginalArg(1) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "([BIII)V")
	public final void method1866(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray63[this.anInt2018++];
		}
	}

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "(I)I")
	public final int method1867() {
		return this.aByteArray63[this.anInt2018++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "(II)V")
	public final void method1868(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray63[this.anInt2018 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray63[this.anInt2018 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray63[this.anInt2018 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(BI)V")
	public final void method1869(@OriginalArg(1) int arg0) {
		this.aByteArray63[this.anInt2018 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)I")
	public final int method1870() {
		this.anInt2018 += 2;
		return ((this.aByteArray63[this.anInt2018 - 1] & 0xFF) << 8) + (this.aByteArray63[this.anInt2018 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(B)I")
	public final int method1871() {
		this.anInt2018 += 2;
		@Pc(33) int local33 = (this.aByteArray63[this.anInt2018 - 1] - 128 & 0xFF) + ((this.aByteArray63[this.anInt2018 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "(I)I")
	public final int method1872() {
		this.anInt2018 += 2;
		@Pc(40) int local40 = (this.aByteArray63[this.anInt2018 - 2] - 128 & 0xFF) + ((this.aByteArray63[this.anInt2018 - 1] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "(II)I")
	public final int method1873(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static220.method3564(this.anInt2018, this.aByteArray63, arg0);
		this.method1851(local16);
		return local16;
	}

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "(I)I")
	public final int method1874() {
		this.anInt2018 += 2;
		@Pc(31) int local31 = ((this.aByteArray63[this.anInt2018 - 1] & 0xFF) << 8) + (this.aByteArray63[this.anInt2018 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III[I)V")
	public final void method1875(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt2018;
		this.anInt2018 = 5;
		@Pc(25) int local25 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(38) int local38 = this.method1860();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = this.method1860();
			@Pc(48) int local48 = 32;
			while (local48-- > 0) {
				local44 -= (local38 << 4 ^ local38 >>> 5) + local38 ^ arg1[local40 >>> 11 & 0x3] + local40;
				local40 -= -1640531527;
				local38 -= local40 + arg1[local40 & 0x3] ^ local44 + (local44 << 4 ^ local44 >>> 5);
			}
			this.anInt2018 -= 8;
			this.method1851(local38);
			this.method1851(local44);
		}
		this.anInt2018 = local8;
	}

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "(I)Ljava/lang/String;")
	public final String method1876() {
		if (this.aByteArray63[this.anInt2018] == 0) {
			this.anInt2018++;
			return null;
		} else {
			return this.method1827();
		}
	}

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "(II)V")
	public final void method1877(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 16);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 24);
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "(I)I")
	public final int method1878() {
		this.anInt2018 += 3;
		return (this.aByteArray63[this.anInt2018 - 1] & 0xFF) + ((this.aByteArray63[this.anInt2018 - 3] & 0xFF) << 16) + ((this.aByteArray63[this.anInt2018 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "(I)I")
	public final int method1879() {
		this.anInt2018 += 2;
		return (this.aByteArray63[this.anInt2018 - 1] & 0xFF) + ((this.aByteArray63[this.anInt2018 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(IB)V")
	public final void method1880(@OriginalArg(0) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 16);
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(FZ)V")
	public final void method1881(@OriginalArg(0) float arg0) {
		@Pc(12) int local12 = Float.floatToRawIntBits(arg0);
		this.aByteArray63[this.anInt2018++] = (byte) (local12 >> 24);
		this.aByteArray63[this.anInt2018++] = (byte) (local12 >> 16);
		this.aByteArray63[this.anInt2018++] = (byte) (local12 >> 8);
		this.aByteArray63[this.anInt2018++] = (byte) local12;
	}
}
