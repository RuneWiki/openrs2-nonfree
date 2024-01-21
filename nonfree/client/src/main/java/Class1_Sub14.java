import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!wa", name = "ib", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!wa", name = "wb", descriptor = "I")
	public int anInt2306;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14(@OriginalArg(0) int arg0) {
		this.aByteArray29 = Static120.method2275(arg0);
		this.anInt2306 = 0;
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([B)V")
	public Class1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray29 = arg0;
		this.anInt2306 = 0;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I")
	public final int method1696() {
		this.anInt2306 += 4;
		return (this.aByteArray29[this.anInt2306 - 4] & 0xFF) + ((this.aByteArray29[this.anInt2306 - 3] & 0xFF) << 8) + ((this.aByteArray29[this.anInt2306 + -2] & 0xFF) << 16) + ((this.aByteArray29[this.anInt2306 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
	public final void method1697(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
	public final void method1698(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V")
	public final void method1699(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1710(arg0 >>> 28 | 0x80);
					}
					this.method1710(arg0 >>> 21 | 0x80);
				}
				this.method1710(arg0 >>> 14 | 0x80);
			}
			this.method1710(arg0 >>> 7 | 0x80);
		}
		this.method1710(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)I")
	public final int method1700() {
		this.anInt2306 += 4;
		return ((this.aByteArray29[this.anInt2306 - 3] & 0xFF) << 16) + (((this.aByteArray29[this.anInt2306 - 4] & 0xFF) << 24) - (-((this.aByteArray29[this.anInt2306 - 2] & 0xFF) << 8) - (this.aByteArray29[this.anInt2306 - 1] & 0xFF)));
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)I")
	public final int method1701() {
		@Pc(14) byte local14 = this.aByteArray29[this.anInt2306++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local14 & 0x7F | local16) << 7;
			local14 = this.aByteArray29[this.anInt2306++];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V")
	public final void method1702(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1710(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1726(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)I")
	public final int method1703() {
		@Pc(11) int local11 = this.aByteArray29[this.anInt2306] & 0xFF;
		return local11 >= 128 ? this.method1753() - 32768 : this.method1738();
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)I")
	public final int method1704() {
		this.anInt2306 += 2;
		return ((this.aByteArray29[this.anInt2306 - 2] & 0xFF) << 8) + (this.aByteArray29[this.anInt2306 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)I")
	public final int method1705() {
		this.anInt2306 += 4;
		return ((this.aByteArray29[this.anInt2306 - 2] & 0xFF) << 24) + (this.aByteArray29[this.anInt2306 - 1] << 16 & 0xFF0000) + ((this.aByteArray29[this.anInt2306 + -4] & 0xFF) << 8) + (this.aByteArray29[this.anInt2306 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)Lclient!oc;")
	public final Class65 method1706() {
		@Pc(6) int local6 = this.anInt2306;
		while (this.aByteArray29[this.anInt2306++] != 0) {
		}
		return Static183.method2975(local6, this.anInt2306 - local6 - 1, this.aByteArray29);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(BI)V")
	public final void method1707(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2306 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2306 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2306 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)J")
	public final long method1708(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local4 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray29[this.anInt2306++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(II)I")
	public final int method1709(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = Static72.method1239(arg0, this.aByteArray29, this.anInt2306);
		this.method1724(local13);
		return local13;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(II)V")
	public final void method1710(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)I")
	public final int method1713() {
		this.anInt2306 += 3;
		return ((this.aByteArray29[this.anInt2306 - 3] & 0xFF) << 16) - (-((this.aByteArray29[this.anInt2306 - 2] & 0xFF) << 8) - (this.aByteArray29[this.anInt2306 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)B")
	public final byte method1714() {
		return (byte) -this.aByteArray29[this.anInt2306++];
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)I")
	public final int method1715() {
		this.anInt2306 += 2;
		return ((this.aByteArray29[this.anInt2306 - 1] & 0xFF) << 8) + (this.aByteArray29[this.anInt2306 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(I)B")
	public final byte method1716() {
		return (byte) (this.aByteArray29[this.anInt2306++] - 128);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[II)V")
	public final void method1717(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(6) int local6 = this.anInt2306;
		@Pc(12) int local12 = (arg0 - 5) / 8;
		this.anInt2306 = 5;
		for (@Pc(17) int local17 = 0; local17 < local12; local17++) {
			@Pc(23) int local23 = -957401312;
			@Pc(31) int local31 = this.method1700();
			@Pc(35) int local35 = this.method1700();
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local35 -= local31 + (local31 >>> 5 ^ local31 << 4) ^ local23 - -arg1[local23 >>> 11 & 0x3];
				local23 -= -1640531527;
				local31 -= (local35 >>> 5 ^ local35 << 4) + local35 ^ arg1[local23 & 0x3] + local23;
			}
			this.anInt2306 -= 8;
			this.method1724(local31);
			this.method1724(local35);
		}
		this.anInt2306 = local6;
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(II)V")
	public final void method1718(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2306++] = (byte) arg0;
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI[B)V")
	public final void method1719(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = this.aByteArray29[this.anInt2306++];
		}
	}

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(I)B")
	public final byte method1720() {
		return this.aByteArray29[this.anInt2306++];
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BJ)V")
	public final void method1721(@OriginalArg(1) long arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 56);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 48);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 40);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 32);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2306++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "(I)I")
	public final int method1722() {
		return this.aByteArray29[this.anInt2306++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method1723(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2306;
		this.anInt2306 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1719(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2306 = 0;
		this.method1710(local31.length);
		this.method1731(local31.length, local31);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
	public final void method1724(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2306++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[BI)V")
	public final void method1725(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = arg1 - 1; local5 >= 0; local5--) {
			arg0[local5] = (byte) (this.aByteArray29[this.anInt2306++] - 128);
		}
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(II)V")
	public final void method1726(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2306++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "(I)I")
	public final int method1728() {
		return 128 - this.aByteArray29[this.anInt2306++] & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(I)I")
	public final int method1729() {
		this.anInt2306 += 2;
		@Pc(36) int local36 = (this.aByteArray29[this.anInt2306 - 1] & 0xFF) + ((this.aByteArray29[this.anInt2306 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(JZ)V")
	public final void method1730(@OriginalArg(0) long arg0) {
		this.method1743((int) (arg0 >> 32));
		this.method1743((int) arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BIB)V")
	public final void method1731(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray29[this.anInt2306++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)J")
	public final long method1732() {
		@Pc(10) long local10 = (long) this.method1700() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1700() & 0xFFFFFFFFL;
		return local24 + (local10 << 32);
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(I)I")
	public final int method1733() {
		@Pc(14) int local14 = this.aByteArray29[this.anInt2306] & 0xFF;
		return local14 >= 128 ? this.method1753() - 49152 : this.method1738() - 64;
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(I)I")
	public final int method1734() {
		@Pc(3) int local3 = this.method1703();
		@Pc(5) int local5 = 0;
		while (local3 == 32767) {
			local5 += 32767;
			local3 = this.method1703();
		}
		return local5 + local3;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(B)Lclient!oc;")
	public final Class65 method1735() {
		if (this.aByteArray29[this.anInt2306] == 0) {
			this.anInt2306++;
			return null;
		} else {
			return this.method1706();
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IB)V")
	public final void method1736(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) arg0;
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(B)I")
	public final int method1737() {
		this.anInt2306 += 4;
		return ((this.aByteArray29[this.anInt2306 - 1] & 0xFF) << 8) + (this.aByteArray29[this.anInt2306 - 3] << 24 & 0xFF000000) + ((this.aByteArray29[this.anInt2306 + -4] & 0xFF) << 16) + (this.aByteArray29[this.anInt2306 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(I)I")
	public final int method1738() {
		return this.aByteArray29[this.anInt2306++] & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(II)V")
	public final void method1739(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(II)V")
	public final void method1740(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) arg0;
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)V")
	public final void method1741(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!oc;I)V")
	public final void method1742(@OriginalArg(0) Class65 arg0) {
		this.anInt2306 += arg0.method2486(this.aByteArray29, this.anInt2306, arg0.method2482());
		this.aByteArray29[this.anInt2306++] = 0;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(IB)V")
	public final void method1743(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2306++] = (byte) arg0;
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 24);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(B)I")
	public final int method1744() {
		this.anInt2306 += 3;
		return (this.aByteArray29[this.anInt2306 - 2] & 0xFF) + ((this.aByteArray29[this.anInt2306 - 1] & 0xFF) << 8) + ((this.aByteArray29[this.anInt2306 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(BI)V")
	public final void method1745(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(BI)V")
	public final void method1746(@OriginalArg(1) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 16);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
		this.aByteArray29[this.anInt2306++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(IB)V")
	public final void method1748(@OriginalArg(0) int arg0) {
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 + 128);
		this.aByteArray29[this.anInt2306++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(B)I")
	public final int method1749() {
		this.anInt2306 += 2;
		return ((this.aByteArray29[this.anInt2306 - 1] & 0xFF) << 8) + (this.aByteArray29[this.anInt2306 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(B)I")
	public final int method1750() {
		this.anInt2306 += 2;
		@Pc(37) int local37 = ((this.aByteArray29[this.anInt2306 - 1] & 0xFF) << 8) + (this.aByteArray29[this.anInt2306 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIJ)V")
	public final void method1751(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(17) int local17 = local4 * 8; local17 >= 0; local17 -= 8) {
			this.aByteArray29[this.anInt2306++] = (byte) (arg1 >> local17);
		}
	}

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "(I)I")
	public final int method1752() {
		return -this.aByteArray29[this.anInt2306++] & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "(B)I")
	public final int method1753() {
		this.anInt2306 += 2;
		return ((this.aByteArray29[this.anInt2306 - 2] & 0xFF) << 8) + (this.aByteArray29[this.anInt2306 - 1] & 0xFF);
	}
}
