import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!ql", name = "Eb", descriptor = "I")
	public int anInt2395;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13(@OriginalArg(0) int arg0) {
		this.anInt2395 = 0;
		this.aByteArray29 = Static195.method3279(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "([B)V")
	public Class1_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray29 = arg0;
		this.anInt2395 = 0;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)I")
	public final int method1753() {
		this.anInt2395 += 4;
		return ((this.aByteArray29[this.anInt2395 - 1] & 0xFF) << 8) + ((this.aByteArray29[this.anInt2395 - 3] & 0xFF) << 24) + ((this.aByteArray29[this.anInt2395 + -4] & 0xFF) << 16) + (this.aByteArray29[this.anInt2395 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public final void method1754(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2395++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)V")
	public final void method1755(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2395++] = (byte) arg0;
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)B")
	public final byte method1756() {
		return this.aByteArray29[this.anInt2395++];
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)V")
	public final void method1759(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 + 128);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V")
	public final void method1760(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1766(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1789(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I")
	public final int method1761() {
		this.anInt2395 += 2;
		return (this.aByteArray29[this.anInt2395 - 2] - 128 & 0xFF) + ((this.aByteArray29[this.anInt2395 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([II)V")
	public final void method1762(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt2395 / 8;
		this.anInt2395 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(21) int local21 = this.method1802();
			@Pc(25) int local25 = this.method1802();
			@Pc(27) int local27 = 0;
			@Pc(29) int local29 = 32;
			while (local29-- > 0) {
				local21 += (local25 >>> 5 ^ local25 << 4) + local25 ^ local27 + arg0[local27 & 0x3];
				local27 += -1640531527;
				local25 += local21 + (local21 << 4 ^ local21 >>> 5) ^ arg0[local27 >>> 11 & 0xBFC00003] + local27;
			}
			this.anInt2395 -= 8;
			this.method1754(local21);
			this.method1754(local25);
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(II)I")
	public final int method1763(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static49.method986(this.aByteArray29, arg0, this.anInt2395);
		this.method1754(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)I")
	public final int method1764() {
		this.anInt2395 += 2;
		return ((this.aByteArray29[this.anInt2395 - 2] & 0xFF) << 8) + (this.aByteArray29[this.anInt2395 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)Ljava/lang/String;")
	public final String method1765() {
		@Pc(14) byte local14 = this.aByteArray29[this.anInt2395++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(25) int local25 = this.anInt2395;
		while (this.aByteArray29[this.anInt2395++] != 0) {
		}
		return Static47.method967(this.aByteArray29, this.anInt2395 - local25 - 1, local25);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(II)V")
	public final void method1766(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)V")
	public final void method1767(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)I")
	public final int method1768() {
		@Pc(16) byte local16 = this.aByteArray29[this.anInt2395++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray29[this.anInt2395++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method1769() {
		if (this.aByteArray29[this.anInt2395] == 0) {
			this.anInt2395++;
			return null;
		} else {
			return this.method1774();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(JB)V")
	public final void method1770(@OriginalArg(0) long arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 56);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 48);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 40);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 32);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2395++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([BIII)V")
	public final void method1771(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			this.aByteArray29[this.anInt2395++] = arg0[local13];
		}
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)I")
	public final int method1772() {
		return this.aByteArray29[this.anInt2395++] & 0xFF;
	}

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "(I)I")
	public final int method1773() {
		this.anInt2395 += 3;
		return (this.aByteArray29[this.anInt2395 - 1] & 0xFF) + ((this.aByteArray29[this.anInt2395 - 3] & 0xFF) << 16) + ((this.aByteArray29[this.anInt2395 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method1774() {
		@Pc(14) int local14 = this.anInt2395;
		while (this.aByteArray29[this.anInt2395++] != 0) {
		}
		return Static47.method967(this.aByteArray29, this.anInt2395 - local14 - 1, local14);
	}

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "(I)B")
	public final byte method1775() {
		return (byte) (128 - this.aByteArray29[this.anInt2395++]);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "([BIII)V")
	public final void method1776(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(18) int local18 = arg1 - 1; local18 >= 0; local18--) {
			arg0[local18] = this.aByteArray29[this.anInt2395++];
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)I")
	public final int method1778() {
		this.anInt2395 += 2;
		@Pc(36) int local36 = (this.aByteArray29[this.anInt2395 - 2] & 0xFF) + ((this.aByteArray29[this.anInt2395 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "(I)I")
	public final int method1779() {
		return -this.aByteArray29[this.anInt2395++] & 0xFF;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)I")
	public final int method1780() {
		@Pc(16) int local16 = this.aByteArray29[this.anInt2395] & 0xFF;
		return local16 >= 128 ? this.method1764() - 32768 : this.method1772();
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)J")
	public final long method1781(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local2 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray29[this.anInt2395++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(II)V")
	public final void method1782(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) arg0;
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(II)V")
	public final void method1783(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2395 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2395 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2395 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2395 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "(I)I")
	public final int method1784() {
		this.anInt2395 += 2;
		return ((this.aByteArray29[this.anInt2395 - 2] & 0xFF) << 8) + (this.aByteArray29[this.anInt2395 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(IB)V")
	public final void method1785(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2395 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "(I)I")
	public final int method1786() {
		this.anInt2395 += 4;
		return (this.aByteArray29[this.anInt2395 - 4] & 0xFF) + (((this.aByteArray29[this.anInt2395 - 3] & 0xFF) << 8) + ((this.aByteArray29[this.anInt2395 - 1] & 0xFF) << 24) + ((this.aByteArray29[this.anInt2395 + -2] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[B)V")
	public final void method1787(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			arg1[local14] = this.aByteArray29[this.anInt2395++];
		}
	}

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "(I)I")
	public final int method1788() {
		@Pc(14) int local14 = this.method1780();
		@Pc(16) int local16 = 0;
		while (local14 == 32767) {
			local16 += 32767;
			local14 = this.method1780();
		}
		return local16 + local14;
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(II)V")
	public final void method1789(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2395++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(B)I")
	public final int method1790() {
		@Pc(12) int local12 = this.aByteArray29[this.anInt2395] & 0xFF;
		return local12 >= 128 ? this.method1764() - 49152 : this.method1772() + -64;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method1791(@OriginalArg(1) String arg0) {
		@Pc(10) int local10 = arg0.indexOf(0);
		if (local10 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local10 + " - cannot pjstr");
		}
		this.anInt2395 += Static147.method2674(this.anInt2395, this.aByteArray29, arg0.length(), arg0);
		this.aByteArray29[this.anInt2395++] = 0;
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(B)B")
	public final byte method1792() {
		return (byte) -this.aByteArray29[this.anInt2395++];
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(B)I")
	public final int method1793() {
		this.anInt2395 += 2;
		return (this.aByteArray29[this.anInt2395 - 2] & 0xFF) + ((this.aByteArray29[this.anInt2395 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "(I)Z")
	public final boolean method1794() {
		this.anInt2395 -= 4;
		@Pc(13) int local13 = Static49.method986(this.aByteArray29, 0, this.anInt2395);
		@Pc(21) int local21 = this.method1802();
		return local13 == local21;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IJ)V")
	public final void method1795(@OriginalArg(1) long arg0) {
		this.method1755((int) (arg0 >> 32));
		this.method1755((int) arg0);
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(II)V")
	public final void method1796(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([IIBI)V")
	public final void method1797(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt2395;
		this.anInt2395 = 5;
		@Pc(22) int local22 = (arg1 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(28) int local28 = -957401312;
			@Pc(32) int local32 = this.method1802();
			@Pc(36) int local36 = this.method1802();
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local36 -= arg0[local28 >>> 11 & 0x76E00003] + local28 ^ (local32 << 4 ^ local32 >>> 5) + local32;
				local28 -= -1640531527;
				local32 -= arg0[local28 & 0x3] + local28 ^ (local36 >>> 5 ^ local36 << 4) + local36;
			}
			this.anInt2395 -= 8;
			this.method1754(local32);
			this.method1754(local36);
		}
		this.anInt2395 = local8;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(Z)I")
	public final int method1798() {
		this.anInt2395 += 2;
		@Pc(32) int local32 = ((this.aByteArray29[this.anInt2395 - 2] & 0xFF) << 8) + (this.aByteArray29[this.anInt2395 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(IB)V")
	public final void method1799(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "(B)I")
	public final int method1800() {
		this.anInt2395 += 2;
		@Pc(41) int local41 = ((this.aByteArray29[this.anInt2395 - 2] & 0xFF) << 8) + (this.aByteArray29[this.anInt2395 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "(II)V")
	public final void method1801(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1766(arg0 >>> 28 | 0x80);
					}
					this.method1766(arg0 >>> 21 | 0x80);
				}
				this.method1766(arg0 >>> 14 | 0x80);
			}
			this.method1766(arg0 >>> 7 | 0x80);
		}
		this.method1766(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "(B)I")
	public final int method1802() {
		this.anInt2395 += 4;
		return ((this.aByteArray29[this.anInt2395 - 3] & 0xFF) << 16) + ((this.aByteArray29[this.anInt2395 - 4] & 0xFF) << 24) + ((this.aByteArray29[this.anInt2395 + -2] & 0xFF) << 8) + (this.aByteArray29[this.anInt2395 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "(II)V")
	public final void method1803(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2395++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1804(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt2395;
		this.anInt2395 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method1787(local2, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local28.toByteArray();
		this.anInt2395 = 0;
		this.method1766(local35.length);
		this.method1771(local35, local35.length);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
	public final void method1806(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "(II)V")
	public final void method1807(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) arg0;
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "(II)V")
	public final void method1808(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2395++] = (byte) arg0;
		this.aByteArray29[this.anInt2395++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIJ)V")
	public final void method1809(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(22) int local22 = local6 * 8; local22 >= 0; local22 -= 8) {
			this.aByteArray29[this.anInt2395++] = (byte) (arg1 >> local22);
		}
	}

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "(I)J")
	public final long method1810() {
		@Pc(17) long local17 = (long) this.method1802() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1802() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "(I)I")
	public final int method1811() {
		return 128 - this.aByteArray29[this.anInt2395++] & 0xFF;
	}

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "(B)B")
	public final byte method1812() {
		return (byte) (this.aByteArray29[this.anInt2395++] - 128);
	}

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "(B)I")
	public final int method1813() {
		this.anInt2395 += 4;
		return ((this.aByteArray29[this.anInt2395 - 4] & 0xFF) << 8) + ((this.aByteArray29[this.anInt2395 - 2] & 0xFF) << 24) + ((this.aByteArray29[this.anInt2395 + -1] & 0xFF) << 16) + (this.aByteArray29[this.anInt2395 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "(B)I")
	public final int method1814() {
		return this.aByteArray29[this.anInt2395++] - 128 & 0xFF;
	}
}
