import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	public int anInt1948;

	@OriginalMember(owner = "client!hd", name = "lb", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1948 = 0;
		this.aByteArray19 = Static76.method1738(arg0);
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray19 = arg0;
		this.anInt1948 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[IBI)V")
	public final void method1501(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(11) int local11 = this.anInt1948;
		this.anInt1948 = 5;
		@Pc(21) int local21 = (arg0 - 5) / 8;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(28) int local28 = this.method1540();
			@Pc(32) int local32 = this.method1540();
			@Pc(36) int local36 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= local28 + (local28 >>> 5 ^ local28 << 4) ^ local36 - -arg1[local36 >>> 11 & 0x2A800003];
				local36 -= -1640531527;
				local28 -= arg1[local36 & 0x3] + local36 ^ local32 + (local32 >>> 5 ^ local32 << 4);
			}
			this.anInt1948 -= 8;
			this.method1547(local28);
			this.method1547(local32);
		}
		this.anInt1948 = local11;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)I")
	public final int method1502() {
		this.anInt1948 += 2;
		@Pc(42) int local42 = ((this.aByteArray19[this.anInt1948 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt1948 - 1] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public final void method1503(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
	public final void method1504(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
	public final int method1505() {
		return -this.aByteArray19[this.anInt1948++] & 0xFF;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB[B)V")
	public final void method1506(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = this.aByteArray19[this.anInt1948++];
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)B")
	public final byte method1507() {
		return (byte) (128 - this.aByteArray19[this.anInt1948++]);
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)B")
	public final byte method1508() {
		return this.aByteArray19[this.anInt1948++];
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)I")
	public final int method1510() {
		this.anInt1948 += 2;
		return ((this.aByteArray19[this.anInt1948 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt1948 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)J")
	public final long method1511() {
		@Pc(15) long local15 = (long) this.method1540() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1540() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BIII)V")
	public final void method1512(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			this.aByteArray19[this.anInt1948++] = arg0[local10];
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)V")
	public final void method1513(@OriginalArg(1) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1948++] = (byte) arg0;
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(II)V")
	public final void method1514(@OriginalArg(1) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 + 128);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(II)V")
	public final void method1515(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1948++] = (byte) arg0;
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)Lclient!eh;")
	public final Class28 method1516() {
		@Pc(14) int local14 = this.anInt1948;
		while (this.aByteArray19[this.anInt1948++] != 0) {
		}
		return Static33.method845(this.aByteArray19, this.anInt1948 - local14 - 1, local14);
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)I")
	public final int method1517() {
		this.anInt1948 += 2;
		return ((this.aByteArray19[this.anInt1948 - 1] & 0xFF) << 8) + (this.aByteArray19[this.anInt1948 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)I")
	public final int method1518() {
		this.anInt1948 += 2;
		@Pc(33) int local33 = (this.aByteArray19[this.anInt1948 - 2] - 128 & 0xFF) + ((this.aByteArray19[this.anInt1948 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "(I)I")
	public final int method1519() {
		@Pc(23) byte local23 = this.aByteArray19[this.anInt1948++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local23 & 0x7F | local25) << 7;
			local23 = this.aByteArray19[this.anInt1948++];
		}
		return local23 | local25;
	}

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "(I)I")
	public final int method1520() {
		this.anInt1948 += 3;
		return ((this.aByteArray19[this.anInt1948 - 2] & 0xFF) << 8) + ((this.aByteArray19[this.anInt1948 - 1] & 0xFF) << 16) + (this.aByteArray19[this.anInt1948 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "(I)Lclient!eh;")
	public final Class28 method1521() {
		if (this.aByteArray19[this.anInt1948] == 0) {
			this.anInt1948++;
			return null;
		} else {
			return this.method1516();
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(II)V")
	public final void method1522(@OriginalArg(1) int arg0) {
		this.aByteArray19[this.anInt1948 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(II)V")
	public final void method1523(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(II)V")
	public final void method1524(@OriginalArg(1) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) arg0;
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)I")
	public final int method1525() {
		return 128 - this.aByteArray19[this.anInt1948++] & 0xFF;
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(II)V")
	public final void method1526(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1948++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)I")
	public final int method1527() {
		this.anInt1948 += 2;
		return (this.aByteArray19[this.anInt1948 - 2] - 128 & 0xFF) + ((this.aByteArray19[this.anInt1948 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method1529(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1948;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt1948 = 0;
		this.method1506(local6, local9);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt1948 = 0;
		this.method1550(local31.length);
		this.method1512(local31, local31.length);
	}

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "(I)B")
	public final byte method1530() {
		return (byte) -this.aByteArray19[this.anInt1948++];
	}

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "(II)V")
	public final void method1531(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1948++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "(I)I")
	public final int method1532() {
		@Pc(14) int local14 = this.aByteArray19[this.anInt1948] & 0xFF;
		return local14 >= 128 ? this.method1510() - 49152 : this.method1545() + -64;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(B)I")
	public final int method1533() {
		this.anInt1948 += 4;
		return (this.aByteArray19[this.anInt1948 - 3] & 0xFF) + ((this.aByteArray19[this.anInt1948 - 4] & 0xFF) << 8) + ((this.aByteArray19[this.anInt1948 + -2] & 0xFF) << 24) + ((this.aByteArray19[this.anInt1948 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "(II)V")
	public final void method1534(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1550(arg0 >>> 28 | 0x80);
					}
					this.method1550(arg0 >>> 21 | 0x80);
				}
				this.method1550(arg0 >>> 14 | 0x80);
			}
			this.method1550(arg0 >>> 7 | 0x80);
		}
		this.method1550(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "(I)I")
	public final int method1535() {
		return this.aByteArray19[this.anInt1948++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "(I)I")
	public final int method1536() {
		this.anInt1948 += 4;
		return ((this.aByteArray19[this.anInt1948 - 3] & 0xFF) << 8) + ((this.aByteArray19[this.anInt1948 - 2] & 0xFF) << 16) + ((this.aByteArray19[-1 + this.anInt1948] & 0xFF) << 24) + (this.aByteArray19[this.anInt1948 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "(II)V")
	public final void method1537(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1550(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1531(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!eh;B)V")
	public final void method1538(@OriginalArg(0) Class28 arg0) {
		this.anInt1948 += arg0.method910(arg0.method901(), this.aByteArray19, this.anInt1948);
		this.aByteArray19[this.anInt1948++] = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
	public final void method1539(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) arg0;
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(B)I")
	public final int method1540() {
		this.anInt1948 += 4;
		return (this.aByteArray19[this.anInt1948 - 1] & 0xFF) + ((this.aByteArray19[this.anInt1948 - 4] & 0xFF) << 24) + ((this.aByteArray19[this.anInt1948 - 3] & 0xFF) << 16) + ((this.aByteArray19[this.anInt1948 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)V")
	public final void method1541(@OriginalArg(1) long arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 56);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 48);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 40);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 32);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1948++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "(I)I")
	public final int method1542() {
		this.anInt1948 += 2;
		@Pc(32) int local32 = ((this.aByteArray19[this.anInt1948 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt1948 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "(II)V")
	public final void method1543(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1948 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1948 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1948 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(B)I")
	public final int method1544() {
		@Pc(16) int local16 = this.aByteArray19[this.anInt1948] & 0xFF;
		return local16 < 128 ? this.method1545() : this.method1510() - 32768;
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(B)I")
	public final int method1545() {
		return this.aByteArray19[this.anInt1948++] & 0xFF;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BII)V")
	public final void method1546(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = arg1 - 1; local12 >= 0; local12--) {
			arg0[local12] = this.aByteArray19[this.anInt1948++];
		}
	}

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "(II)V")
	public final void method1547(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1948++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1948++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "(II)I")
	public final int method1548(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static20.method591(this.anInt1948, this.aByteArray19, arg0);
		this.method1547(local7);
		return local7;
	}

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "(I)I")
	public final int method1549() {
		this.anInt1948 += 2;
		return (this.aByteArray19[this.anInt1948 - 1] - 128 & 0xFF) + ((this.aByteArray19[this.anInt1948 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)V")
	public final void method1550(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1948++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "(B)I")
	public final int method1551() {
		this.anInt1948 += 4;
		return ((this.aByteArray19[this.anInt1948 - 3] & 0xFF) << 24) + ((this.aByteArray19[this.anInt1948 - 4] & 0xFF) << 16) + ((this.aByteArray19[this.anInt1948 + -1] & 0xFF) << 8) + (this.aByteArray19[this.anInt1948 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[BII)V")
	public final void method1552(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray19[this.anInt1948++] - 128);
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IJ)V")
	public final void method1553(@OriginalArg(1) long arg0) {
		this.method1513((int) (arg0 >> 32));
		this.method1513((int) arg0);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)I")
	public final int method1554() {
		this.anInt1948 += 3;
		return (this.aByteArray19[this.anInt1948 - 1] & 0xFF) + ((this.aByteArray19[this.anInt1948 - 2] & 0xFF) << 8) + ((this.aByteArray19[this.anInt1948 - 3] & 0xFF) << 16);
	}
}
