import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!s", name = "E", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "I")
	public int anInt2019;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V")
	public Class4_Sub16(@OriginalArg(0) int arg0) {
		this.aByteArray22 = Static1.method3(arg0);
		this.anInt2019 = 0;
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "([B)V")
	public Class4_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray22 = arg0;
		this.anInt2019 = 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)I")
	public final int method1438() {
		return 128 - this.aByteArray22[this.anInt2019++] & 0xFF;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI[BI)V")
	public final void method1440(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = arg1 - 1; local9 >= 0; local9--) {
			arg0[local9] = (byte) (this.aByteArray22[this.anInt2019++] - 128);
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(II)V")
	public final void method1441(@OriginalArg(1) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 + 128);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(II)V")
	public final void method1442(@OriginalArg(0) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V")
	public final void method1443(@OriginalArg(0) long arg0) {
		this.method1451((int) (arg0 >> 32));
		this.method1451((int) arg0);
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)I")
	public final int method1444() {
		return this.aByteArray22[this.anInt2019++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)I")
	public final int method1445() {
		this.anInt2019 += 4;
		return ((this.aByteArray22[this.anInt2019 - 4] & 0xFF) << 16) + ((this.aByteArray22[this.anInt2019 - 3] & 0xFF) << 24) + ((this.aByteArray22[this.anInt2019 - 1] & 0xFF) << 8) + (this.aByteArray22[this.anInt2019 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(II)V")
	public final void method1446(@OriginalArg(1) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)I")
	public final int method1447(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = Static110.method1948(this.anInt2019, arg0, this.aByteArray22);
		this.method1489(local12);
		return local12;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IB)V")
	public final void method1448(@OriginalArg(0) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)B")
	public final byte method1449() {
		return (byte) -this.aByteArray22[this.anInt2019++];
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(B)I")
	public final int method1450() {
		@Pc(11) int local11 = this.aByteArray22[this.anInt2019] & 0xFF;
		return local11 >= 128 ? this.method1490() - 32768 : this.method1474();
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(II)V")
	public final void method1451(@OriginalArg(0) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) arg0;
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 16);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(II)V")
	public final void method1452(@OriginalArg(1) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 16);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
		this.aByteArray22[this.anInt2019++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)I")
	public final int method1453() {
		this.anInt2019 += 2;
		return (this.aByteArray22[this.anInt2019 - 2] & 0xFF) + ((this.aByteArray22[this.anInt2019 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(II)V")
	public final void method1454(@OriginalArg(1) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 16);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 24);
		this.aByteArray22[this.anInt2019++] = (byte) arg0;
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(B)I")
	public final int method1455() {
		@Pc(21) byte local21 = this.aByteArray22[this.anInt2019++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray22[this.anInt2019++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(II)V")
	public final void method1456(@OriginalArg(1) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JB)V")
	public final void method1457(@OriginalArg(0) long arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 56);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 48);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 40);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 32);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 24);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 16);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
		this.aByteArray22[this.anInt2019++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[BB)V")
	public final void method1458(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			this.aByteArray22[this.anInt2019++] = arg1[local5];
		}
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "(II)V")
	public final void method1459(@OriginalArg(0) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(IB)V")
	public final void method1460(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1459(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1488(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[BI)V")
	public final void method1461(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = (byte) (this.aByteArray22[this.anInt2019++] - 128);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public final void method1462(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2019;
		this.anInt2019 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1483(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(34) BigInteger local34 = local23.modPow(arg0, arg1);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt2019 = 0;
		this.method1459(local37.length);
		this.method1458(local37.length, local37);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(BI)V")
	public final void method1463(@OriginalArg(1) int arg0) {
		this.aByteArray22[this.anInt2019 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray22[this.anInt2019 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray22[this.anInt2019 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray22[this.anInt2019 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(B)Lclient!ja;")
	public final Class39 method1464() {
		@Pc(6) int local6 = this.anInt2019;
		while (this.aByteArray22[this.anInt2019++] != 0) {
		}
		return Static41.method688(this.aByteArray22, this.anInt2019 - local6 - 1, local6);
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "(II)V")
	public final void method1465(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1459(arg0 >>> 28 | 0x80);
					}
					this.method1459(arg0 >>> 21 | 0x80);
				}
				this.method1459(arg0 >>> 14 | 0x80);
			}
			this.method1459(arg0 >>> 7 | 0x80);
		}
		this.method1459(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)Lclient!ja;")
	public final Class39 method1466() {
		if (this.aByteArray22[this.anInt2019] == 0) {
			this.anInt2019++;
			return null;
		} else {
			return this.method1464();
		}
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(B)I")
	public final int method1467() {
		this.anInt2019 += 2;
		return ((this.aByteArray22[this.anInt2019 - 1] & 0xFF) << 8) + (this.aByteArray22[this.anInt2019 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)V")
	public final void method1468(@OriginalArg(0) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
		this.aByteArray22[this.anInt2019++] = (byte) arg0;
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 24);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(B)I")
	public final int method1469() {
		this.anInt2019 += 4;
		return ((this.aByteArray22[this.anInt2019 - 3] & 0xFF) << 8) + ((this.aByteArray22[this.anInt2019 - 1] & 0xFF) << 24) + ((this.aByteArray22[this.anInt2019 + -2] & 0xFF) << 16) + (this.aByteArray22[this.anInt2019 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!ja;)V")
	public final void method1470(@OriginalArg(1) Class39 arg0) {
		this.anInt2019 += arg0.method935(arg0.method953(), this.anInt2019, this.aByteArray22);
		this.aByteArray22[this.anInt2019++] = 0;
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(B)I")
	public final int method1471() {
		this.anInt2019 += 2;
		return (this.aByteArray22[this.anInt2019 - 1] - 128 & 0xFF) + ((this.aByteArray22[this.anInt2019 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "(B)I")
	public final int method1472() {
		return -this.aByteArray22[this.anInt2019++] & 0xFF;
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "(II)V")
	public final void method1473(@OriginalArg(1) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) arg0;
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(I)I")
	public final int method1474() {
		return this.aByteArray22[this.anInt2019++] & 0xFF;
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "(B)I")
	public final int method1475() {
		this.anInt2019 += 3;
		return ((this.aByteArray22[this.anInt2019 - 2] & 0xFF) << 8) + (((this.aByteArray22[this.anInt2019 - 3] & 0xFF) << 16) + (this.aByteArray22[this.anInt2019 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "(B)I")
	public final int method1476() {
		this.anInt2019 += 2;
		@Pc(35) int local35 = (this.aByteArray22[this.anInt2019 - 1] & 0xFF) + ((this.aByteArray22[this.anInt2019 - 2] & 0xFF) << 8);
		if (local35 > 32767) {
			local35 -= 65536;
		}
		return local35;
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(I)B")
	public final byte method1477() {
		return this.aByteArray22[this.anInt2019++];
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "(I)I")
	public final int method1478() {
		@Pc(7) int local7 = this.aByteArray22[this.anInt2019] & 0xFF;
		return local7 >= 128 ? this.method1490() - 49152 : this.method1474() + -64;
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "(I)J")
	public final long method1479() {
		@Pc(6) long local6 = (long) this.method1486() & 0xFFFFFFFFL;
		@Pc(18) long local18 = (long) this.method1486() & 0xFFFFFFFFL;
		return (local6 << 32) + local18;
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "(I)I")
	public final int method1480() {
		this.anInt2019 += 2;
		@Pc(38) int local38 = (this.aByteArray22[this.anInt2019 - 2] - 128 & 0xFF) + ((this.aByteArray22[this.anInt2019 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!s", name = "m", descriptor = "(I)I")
	public final int method1481() {
		this.anInt2019 += 4;
		return ((this.aByteArray22[this.anInt2019 - 4] & 0xFF) << 8) + (this.aByteArray22[this.anInt2019 - 1] << 16 & 0xFF0000) + ((this.aByteArray22[this.anInt2019 + -2] & 0xFF) << 24) + (this.aByteArray22[this.anInt2019 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(IB)V")
	public final void method1482(@OriginalArg(0) int arg0) {
		this.aByteArray22[this.anInt2019 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([BIIB)V")
	public final void method1483(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			arg0[local10] = this.aByteArray22[this.anInt2019++];
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[I)V")
	public final void method1484(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(9) int local9 = this.anInt2019;
		@Pc(20) int local20 = (arg0 - 5) / 8;
		this.anInt2019 = 5;
		for (@Pc(25) int local25 = 0; local25 < local20; local25++) {
			@Pc(30) int local30 = this.method1486();
			@Pc(34) int local34 = this.method1486();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= local30 + (local30 >>> 5 ^ local30 << 4) ^ arg1[local36 >>> 11 & 0x3] + local36;
				local36 -= -1640531527;
				local30 -= (local34 >>> 5 ^ local34 << 4) + local34 ^ local36 - -arg1[local36 & 0x3];
			}
			this.anInt2019 -= 8;
			this.method1489(local30);
			this.method1489(local34);
		}
		this.anInt2019 = local9;
	}

	@OriginalMember(owner = "client!s", name = "n", descriptor = "(I)B")
	public final byte method1485() {
		return (byte) (128 - this.aByteArray22[this.anInt2019++]);
	}

	@OriginalMember(owner = "client!s", name = "o", descriptor = "(I)I")
	public final int method1486() {
		this.anInt2019 += 4;
		return (this.aByteArray22[this.anInt2019 - 1] & 0xFF) + ((this.aByteArray22[this.anInt2019 - 2] & 0xFF) << 8) + ((this.aByteArray22[this.anInt2019 + -4] & 0xFF) << 24) + ((this.aByteArray22[this.anInt2019 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!s", name = "m", descriptor = "(B)I")
	public final int method1487() {
		this.anInt2019 += 2;
		@Pc(33) int local33 = (this.aByteArray22[this.anInt2019 - 1] - 128 & 0xFF) + ((this.aByteArray22[this.anInt2019 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!s", name = "m", descriptor = "(II)V")
	public final void method1488(@OriginalArg(0) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
		this.aByteArray22[this.anInt2019++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!s", name = "n", descriptor = "(II)V")
	public final void method1489(@OriginalArg(0) int arg0) {
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 24);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 16);
		this.aByteArray22[this.anInt2019++] = (byte) (arg0 >> 8);
		this.aByteArray22[this.anInt2019++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!s", name = "p", descriptor = "(I)I")
	public final int method1490() {
		this.anInt2019 += 2;
		return ((this.aByteArray22[this.anInt2019 - 2] & 0xFF) << 8) + (this.aByteArray22[this.anInt2019 - 1] & 0xFF);
	}
}
