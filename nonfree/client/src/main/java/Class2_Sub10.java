import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
	public int anInt2187;

	@OriginalMember(owner = "client!ic", name = "sb", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10(@OriginalArg(0) int arg0) {
		this.anInt2187 = 0;
		this.aByteArray27 = Static27.method510(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([B)V")
	public Class2_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray27 = arg0;
		this.anInt2187 = 0;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)J")
	public final long method1478() {
		@Pc(14) long local14 = (long) this.method1532() & 0xFFFFFFFFL;
		@Pc(21) long local21 = (long) this.method1532() & 0xFFFFFFFFL;
		return local21 + (local14 << 32);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I")
	public final int method1480() {
		this.anInt2187 += 2;
		@Pc(32) int local32 = ((this.aByteArray27[this.anInt2187 - 2] & 0xFF) << 8) + (this.aByteArray27[this.anInt2187 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)I")
	public final int method1481() {
		this.anInt2187 += 2;
		@Pc(29) int local29 = (this.aByteArray27[this.anInt2187 - 2] - 128 & 0xFF) + ((this.aByteArray27[this.anInt2187 - 1] & 0xFF) << 8);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
	public final void method1482(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)I")
	public final int method1484() {
		@Pc(12) int local12 = this.aByteArray27[this.anInt2187] & 0xFF;
		return local12 >= 128 ? this.method1517() - 32768 : this.method1514();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
	public final void method1485(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2187++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
	public final void method1486(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V")
	public final void method1487(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1486(arg0 >>> 28 | 0x80);
					}
					this.method1486(arg0 >>> 21 | 0x80);
				}
				this.method1486(arg0 >>> 14 | 0x80);
			}
			this.method1486(arg0 >>> 7 | 0x80);
		}
		this.method1486(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)I")
	public final int method1488() {
		this.anInt2187 += 2;
		@Pc(34) int local34 = ((this.aByteArray27[this.anInt2187 - 2] & 0xFF) << 8) + (this.aByteArray27[this.anInt2187 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
	public final int method1489() {
		this.anInt2187 += 3;
		return (this.aByteArray27[this.anInt2187 - 1] & 0xFF) + (((this.aByteArray27[this.anInt2187 - 3] & 0xFF) << 16) + ((this.aByteArray27[this.anInt2187 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)I")
	public final int method1490() {
		return -this.aByteArray27[this.anInt2187++] & 0xFF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method1491(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2187;
		this.anInt2187 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1516(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2187 = 0;
		this.method1486(local31.length);
		this.method1515(local31, local31.length);
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V")
	public final void method1492(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) arg0;
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(JB)V")
	public final void method1493(@OriginalArg(0) long arg0) {
		this.method1492((int) (arg0 >> 32));
		this.method1492((int) arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!u;I)V")
	public final void method1494(@OriginalArg(0) Class74 arg0) {
		this.anInt2187 += arg0.method1715(this.anInt2187, this.aByteArray27, arg0.method1695());
		this.aByteArray27[this.anInt2187++] = 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJ)V")
	public final void method1495(@OriginalArg(1) long arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 56);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 48);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 40);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 32);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2187++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB[I)V")
	public final void method1496(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(6) int local6 = (arg0 - 5) / 8;
		@Pc(13) int local13 = this.anInt2187;
		this.anInt2187 = 5;
		for (@Pc(22) int local22 = 0; local22 < local6; local22++) {
			@Pc(27) int local27 = this.method1532();
			@Pc(33) int local33 = this.method1532();
			@Pc(35) int local35 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local33 -= local35 + arg1[local35 >>> 11 & 0x3] ^ (local27 << 4 ^ local27 >>> 5) - -local27;
				local35 -= -1640531527;
				local27 -= arg1[local35 & 0x3] + local35 ^ (local33 >>> 5 ^ local33 << 4) + local33;
			}
			this.anInt2187 -= 8;
			this.method1497(local27);
			this.method1497(local33);
		}
		this.anInt2187 = local13;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)V")
	public final void method1497(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2187++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)I")
	public final int method1498() {
		this.anInt2187 += 4;
		return (this.aByteArray27[this.anInt2187 - 2] & 0xFF) + (((this.aByteArray27[this.anInt2187 - 3] & 0xFF) << 24) - (-((this.aByteArray27[this.anInt2187 - 4] & 0xFF) << 16) - ((this.aByteArray27[this.anInt2187 - 1] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([BBII)V")
	public final void method1499(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = arg1 - 1; local9 >= 0; local9--) {
			arg0[local9] = this.aByteArray27[this.anInt2187++];
		}
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(II)V")
	public final void method1500(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)V")
	public final void method1501(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2187 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2187 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2187 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2187 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(B)I")
	public final int method1502() {
		this.anInt2187 += 4;
		return (this.aByteArray27[this.anInt2187 - 3] & 0xFF) + ((this.aByteArray27[this.anInt2187 - 4] & 0xFF) << 8) + ((this.aByteArray27[this.anInt2187 + -1] & 0xFF) << 16) + ((this.aByteArray27[this.anInt2187 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)I")
	public final int method1503() {
		return this.aByteArray27[this.anInt2187++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
	public final void method1504(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) arg0;
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(B)I")
	public final int method1506() {
		this.anInt2187 += 2;
		return (this.aByteArray27[this.anInt2187 - 2] - 128 & 0xFF) + ((this.aByteArray27[this.anInt2187 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)I")
	public final int method1507(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static77.method1204(this.aByteArray27, this.anInt2187, arg0);
		this.method1497(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(II)V")
	public final void method1508(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2187++] = (byte) arg0;
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)B")
	public final byte method1509() {
		return this.aByteArray27[this.anInt2187++];
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IZ)V")
	public final void method1510(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2187 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(II)V")
	public final void method1511(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 + 128);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(ZI)V")
	public final void method1512(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2187++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)I")
	public final int method1513() {
		@Pc(7) int local7 = this.aByteArray27[this.anInt2187] & 0xFF;
		return local7 < 128 ? this.method1514() - 64 : this.method1517() + -49152;
	}

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "(I)I")
	public final int method1514() {
		return this.aByteArray27[this.anInt2187++] & 0xFF;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ[BI)V")
	public final void method1515(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			this.aByteArray27[this.anInt2187++] = arg0[local11];
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BZ)V")
	public final void method1516(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = this.aByteArray27[this.anInt2187++];
		}
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(B)I")
	public final int method1517() {
		this.anInt2187 += 2;
		return (this.aByteArray27[this.anInt2187 - 1] & 0xFF) + ((this.aByteArray27[this.anInt2187 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(B)I")
	public final int method1518() {
		return 128 - this.aByteArray27[this.anInt2187++] & 0xFF;
	}

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "(I)B")
	public final byte method1520() {
		return (byte) (128 - this.aByteArray27[this.anInt2187++]);
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(BI)V")
	public final void method1521(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1486(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1485(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "(I)I")
	public final int method1522() {
		this.anInt2187 += 2;
		return (this.aByteArray27[this.anInt2187 - 2] & 0xFF) + ((this.aByteArray27[this.anInt2187 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(BI)V")
	public final void method1524(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2187++] = (byte) arg0;
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2187++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "(I)I")
	public final int method1525() {
		this.anInt2187 += 2;
		return (this.aByteArray27[this.anInt2187 - 1] - 128 & 0xFF) + ((this.aByteArray27[this.anInt2187 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I")
	public final int method1527() {
		this.anInt2187 += 4;
		return (this.aByteArray27[this.anInt2187 - 4] & 0xFF) + ((this.aByteArray27[this.anInt2187 - 1] & 0xFF) << 24) + ((this.aByteArray27[this.anInt2187 + -2] & 0xFF) << 16) + ((this.aByteArray27[this.anInt2187 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "(B)I")
	public final int method1528() {
		@Pc(21) byte local21 = this.aByteArray27[this.anInt2187++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray27[this.anInt2187++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "(I)Lclient!u;")
	public final Class74 method1530() {
		@Pc(14) int local14 = this.anInt2187;
		while (this.aByteArray27[this.anInt2187++] != 0) {
		}
		return Static82.method1266(this.aByteArray27, this.anInt2187 - local14 - 1, local14);
	}

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "(B)B")
	public final byte method1531() {
		return (byte) (this.aByteArray27[this.anInt2187++] - 128);
	}

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "(B)I")
	public final int method1532() {
		this.anInt2187 += 4;
		return (this.aByteArray27[this.anInt2187 - 1] & 0xFF) + ((this.aByteArray27[this.anInt2187 - 2] & 0xFF) << 8) + ((this.aByteArray27[this.anInt2187 - 3] & 0xFF) << 16) + ((this.aByteArray27[this.anInt2187 - 4] & 0xFF) << 24);
	}
}
