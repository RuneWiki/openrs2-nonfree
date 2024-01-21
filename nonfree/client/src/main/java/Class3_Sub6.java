import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!m", name = "Bb", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
	public int anInt2416;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V")
	public Class3_Sub6(@OriginalArg(0) int arg0) {
		this.aByteArray17 = Static5.method172(arg0);
		this.anInt2416 = 0;
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "([B)V")
	public Class3_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray17 = arg0;
		this.anInt2416 = 0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([BIII)V")
	public final void method1584(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray17[this.anInt2416++] - 128);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[BI)V")
	public final void method1586(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(14) int local14 = arg0 - 1; local14 >= 0; local14--) {
			arg1[local14] = this.aByteArray17[this.anInt2416++];
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I")
	public final int method1587() {
		return this.aByteArray17[this.anInt2416++] & 0xFF;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
	public final void method1588(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V")
	public final void method1589(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) arg0;
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)I")
	public final int method1591() {
		return this.aByteArray17[this.anInt2416++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(II)V")
	public final void method1592(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) arg0;
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> -242288600);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II[BI)V")
	public final void method1593(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray17[this.anInt2416++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(II)I")
	public final int method1594(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static35.method685(this.anInt2416, arg0, this.aByteArray17);
		this.method1611(local16);
		return local16;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)I")
	public final int method1595() {
		this.anInt2416 += 2;
		@Pc(38) int local38 = ((this.aByteArray17[this.anInt2416 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt2416 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)I")
	public final int method1596() {
		this.anInt2416 += 3;
		return ((this.aByteArray17[this.anInt2416 - 2] & 0xFF) << 8) + ((this.aByteArray17[this.anInt2416 - 3] << 16 & 0xFF0000) + (this.aByteArray17[this.anInt2416 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(B)I")
	public final int method1597() {
		this.anInt2416 += 2;
		@Pc(36) int local36 = ((this.aByteArray17[this.anInt2416 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt2416 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)J")
	public final long method1598() {
		@Pc(17) long local17 = (long) this.method1614() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1614() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(II)V")
	public final void method1599(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 + 128);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V")
	public final void method1600(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)I")
	public final int method1601() {
		@Pc(21) byte local21 = this.aByteArray17[this.anInt2416++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray17[this.anInt2416++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)B")
	public final byte method1602() {
		return (byte) (128 - this.aByteArray17[this.anInt2416++]);
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(I)I")
	public final int method1603() {
		this.anInt2416 += 2;
		return (this.aByteArray17[this.anInt2416 - 1] & 0xFF) + ((this.aByteArray17[this.anInt2416 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "(I)I")
	public final int method1604() {
		this.anInt2416 += 2;
		return ((this.aByteArray17[this.anInt2416 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt2416 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "(I)B")
	public final byte method1605() {
		return this.aByteArray17[this.anInt2416++];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZJ)V")
	public final void method1606(@OriginalArg(1) long arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 56);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 48);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 40);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 32);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2416++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "k", descriptor = "(I)I")
	public final int method1607() {
		return 128 - this.aByteArray17[this.anInt2416++] & 0xFF;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)V")
	public final void method1608(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(II)V")
	public final void method1609(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2416++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([IIII)V")
	public final void method1610(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt2416;
		@Pc(15) int local15 = (arg1 - 5) / 8;
		this.anInt2416 = 5;
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			@Pc(26) int local26 = this.method1614();
			@Pc(28) int local28 = 32;
			@Pc(30) int local30 = -957401312;
			@Pc(36) int local36 = this.method1614();
			while (local28-- > 0) {
				local36 -= arg0[local30 >>> 11 & 0x3] + local30 ^ local26 + (local26 << 4 ^ local26 >>> 5);
				local30 -= -1640531527;
				local26 -= local36 + (local36 << 4 ^ local36 >>> 5) ^ local30 - -arg0[local30 & 0x3];
			}
			this.anInt2416 -= 8;
			this.method1611(local26);
			this.method1611(local36);
		}
		this.anInt2416 = local8;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IB)V")
	public final void method1611(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2416++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "l", descriptor = "(I)I")
	public final int method1612() {
		this.anInt2416 += 2;
		@Pc(32) int local32 = (this.aByteArray17[this.anInt2416 - 1] & 0xFF) + ((this.aByteArray17[this.anInt2416 - 2] & 0xFF) << 8);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!m", name = "m", descriptor = "(I)B")
	public final byte method1613() {
		return (byte) -this.aByteArray17[this.anInt2416++];
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(B)I")
	public final int method1614() {
		this.anInt2416 += 4;
		return ((this.aByteArray17[this.anInt2416 - 2] & 0xFF) << 8) + ((this.aByteArray17[this.anInt2416 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2416 + -4] & 0xFF) << 24) + (this.aByteArray17[this.anInt2416 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!m", name = "n", descriptor = "(I)I")
	public final int method1615() {
		this.anInt2416 += 4;
		return ((this.aByteArray17[this.anInt2416 - 1] & 0xFF) << 8) + ((this.aByteArray17[this.anInt2416 - 4] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2416 + -3] & 0xFF) << 24) + (this.aByteArray17[this.anInt2416 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(B)B")
	public final byte method1616() {
		return (byte) (this.aByteArray17[this.anInt2416++] - 128);
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(B)I")
	public final int method1618() {
		return -this.aByteArray17[this.anInt2416++] & 0xFF;
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(II)V")
	public final void method1619(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2416 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "(B)I")
	public final int method1620() {
		@Pc(15) int local15 = this.aByteArray17[this.anInt2416] & 0xFF;
		return local15 < 128 ? this.method1587() - 64 : this.method1603() - 49152;
	}

	@OriginalMember(owner = "client!m", name = "p", descriptor = "(I)I")
	public final int method1621() {
		this.anInt2416 += 2;
		return (this.aByteArray17[this.anInt2416 - 1] - 128 & 0xFF) + ((this.aByteArray17[this.anInt2416 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(II)V")
	public final void method1622(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2416++] = (byte) arg0;
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!m", name = "q", descriptor = "(I)I")
	public final int method1623() {
		this.anInt2416 += 2;
		@Pc(34) int local34 = ((this.aByteArray17[this.anInt2416 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt2416 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!m", name = "r", descriptor = "(I)I")
	public final int method1624() {
		this.anInt2416 += 4;
		return (this.aByteArray17[this.anInt2416 - 4] & 0xFF) + ((this.aByteArray17[this.anInt2416 - 2] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2416 + -1] & 0xFF) << 24) + ((this.aByteArray17[this.anInt2416 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "(B)I")
	public final int method1625() {
		this.anInt2416 += 3;
		return (this.aByteArray17[this.anInt2416 - 2] & 0xFF) + ((this.aByteArray17[this.anInt2416 - 1] & 0xFF) << 8) + ((this.aByteArray17[this.anInt2416 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!m", name = "k", descriptor = "(B)Lclient!ae;")
	public final Class5 method1627() {
		@Pc(15) int local15 = this.anInt2416;
		while (this.aByteArray17[this.anInt2416++] != 0) {
		}
		return Static23.method454(this.aByteArray17, local15, this.anInt2416 - local15 - 1);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z[BII)V")
	public final void method1628(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray17[this.anInt2416++];
		}
	}

	@OriginalMember(owner = "client!m", name = "l", descriptor = "(B)I")
	public final int method1629() {
		@Pc(18) int local18 = this.aByteArray17[this.anInt2416] & 0xFF;
		return local18 >= 128 ? this.method1603() - 32768 : this.method1587();
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "(II)V")
	public final void method1630(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2416++] = (byte) arg0;
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> -334352184);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method1631(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2416;
		this.anInt2416 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1628(local12, local6);
		@Pc(28) BigInteger local28 = new BigInteger(local12);
		@Pc(33) BigInteger local33 = local28.modPow(arg0, arg1);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt2416 = 0;
		this.method1608(local36.length);
		this.method1593(local36, local36.length);
	}

	@OriginalMember(owner = "client!m", name = "t", descriptor = "(I)I")
	public final int method1632() {
		this.anInt2416 += 4;
		return (this.aByteArray17[this.anInt2416 - 3] & 0xFF) + ((this.aByteArray17[this.anInt2416 - 4] & 0xFF) << 8) + ((this.aByteArray17[this.anInt2416 + -1] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2416 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(BI)V")
	public final void method1633(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1608(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1634(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(BI)V")
	public final void method1634(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2416++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(IB)V")
	public final void method1635(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2416++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!m", name = "m", descriptor = "(B)I")
	public final int method1636() {
		this.anInt2416 += 2;
		return ((this.aByteArray17[this.anInt2416 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt2416 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!ae;)V")
	public final void method1637(@OriginalArg(1) Class5 arg0) {
		this.anInt2416 += arg0.method157(this.aByteArray17, this.anInt2416, arg0.method144());
		this.aByteArray17[this.anInt2416++] = 0;
	}
}
