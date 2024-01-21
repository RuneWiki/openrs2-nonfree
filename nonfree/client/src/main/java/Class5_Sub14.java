import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public class Class5_Sub14 extends Class5 {

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
	public int anInt2199 = 0;

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
	public Class5_Sub14(@OriginalArg(0) int arg0) {
		this.aByteArray33 = Static103.method1743(arg0);
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([B)V")
	public Class5_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray33 = arg0;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
	public final int method1428() {
		@Pc(20) int local20 = this.aByteArray33[this.anInt2199] & 0xFF;
		return local20 >= 128 ? this.method1478() - 49152 : this.method1471() + -64;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)I")
	public final int method1429() {
		return 128 - this.aByteArray33[this.anInt2199++] & 0xFF;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(B)I")
	public final int method1430() {
		this.anInt2199 += 2;
		@Pc(32) int local32 = ((this.aByteArray33[this.anInt2199 - 2] & 0xFF) << 8) + (this.aByteArray33[this.anInt2199 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)J")
	public final long method1432() {
		@Pc(11) long local11 = (long) this.method1461() & 0xFFFFFFFFL;
		@Pc(18) long local18 = (long) this.method1461() & 0xFFFFFFFFL;
		return (local11 << 32) + local18;
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(B)I")
	public final int method1433() {
		@Pc(3) int local3 = 0;
		@Pc(14) byte local14;
		for (local14 = this.aByteArray33[this.anInt2199++]; local14 < 0; local14 = this.aByteArray33[this.anInt2199++]) {
			local3 = (local3 | local14 & 0x7F) << 7;
		}
		return local3 | local14;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)V")
	public final void method1434(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1440(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1468(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1435(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2199;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt2199 = 0;
		this.method1449(local9, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2199 = 0;
		this.method1440(local31.length);
		this.method1484(local31.length, local31);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BIB)V")
	public final void method1436(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = arg1 - 1; local8 >= 0; local8--) {
			arg0[local8] = this.aByteArray33[this.anInt2199++];
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)I")
	public final int method1437() {
		this.anInt2199 += 2;
		return (this.aByteArray33[this.anInt2199 - 2] & 0xFF) + ((this.aByteArray33[this.anInt2199 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V")
	public final void method1438(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt2199++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)I")
	public final int method1439() {
		this.anInt2199 += 3;
		return ((this.aByteArray33[this.anInt2199 - 3] & 0xFF) << 16) + ((this.aByteArray33[this.anInt2199 - 2] & 0xFF) << 8) + (this.aByteArray33[this.anInt2199 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)V")
	public final void method1440(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(II)I")
	public final int method1441(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static118.method1894(arg0, this.aByteArray33, this.anInt2199);
		this.method1451(local11);
		return local11;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIII)V")
	public final void method1442(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) int local6 = this.anInt2199;
		this.anInt2199 = 5;
		@Pc(16) int local16 = (arg1 - 5) / 8;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(26) int local26 = this.method1461();
			@Pc(28) int local28 = -957401312;
			@Pc(32) int local32 = this.method1461();
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local32 -= local26 + (local26 << 4 ^ local26 >>> 5) ^ local28 + arg0[local28 >>> 11 & 0x54400003];
				local28 -= -1640531527;
				local26 -= arg0[local28 & 0x3] + local28 ^ (local32 << 4 ^ local32 >>> 5) + local32;
			}
			this.anInt2199 -= 8;
			this.method1451(local26);
			this.method1451(local32);
		}
		this.anInt2199 = local6;
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I")
	public final int method1443() {
		return -this.aByteArray33[this.anInt2199++] & 0xFF;
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(B)B")
	public final byte method1444() {
		return (byte) (this.aByteArray33[this.anInt2199++] - 128);
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(II)V")
	public final void method1445(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1440(arg0 >>> 28 | 0x80);
					}
					this.method1440(arg0 >>> 21 | 0x80);
				}
				this.method1440(arg0 >>> 14 | 0x80);
			}
			this.method1440(arg0 >>> 7 | 0x80);
		}
		this.method1440(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(II)V")
	public final void method1446(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) arg0;
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)B")
	public final byte method1447() {
		return this.aByteArray33[this.anInt2199++];
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(II)V")
	public final void method1448(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BII)V")
	public final void method1449(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			arg0[local10] = this.aByteArray33[this.anInt2199++];
		}
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)Lclient!r;")
	public final Class61 method1450() {
		@Pc(2) int local2 = this.anInt2199;
		while (this.aByteArray33[this.anInt2199++] != 0) {
		}
		return Static24.method501(this.aByteArray33, this.anInt2199 - local2 - 1, local2);
	}

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "(II)V")
	public final void method1451(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt2199++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)I")
	public final int method1452() {
		this.anInt2199 += 4;
		return ((this.aByteArray33[this.anInt2199 - 1] & 0xFF) << 16) + ((this.aByteArray33[this.anInt2199 - 2] << 24 & 0xFF000000) + ((this.aByteArray33[this.anInt2199 - 4] & 0xFF) << 8) + (this.aByteArray33[this.anInt2199 + -3] & 0xFF));
	}

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "(I)I")
	public final int method1453() {
		this.anInt2199 += 4;
		return (this.aByteArray33[this.anInt2199 - 4] & 0xFF) + ((this.aByteArray33[this.anInt2199 - 3] & 0xFF) << 8) + ((this.aByteArray33[this.anInt2199 + -2] & 0xFF) << 16) + ((this.aByteArray33[-1 + this.anInt2199] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "(I)I")
	public final int method1454() {
		this.anInt2199 += 2;
		@Pc(33) int local33 = (this.aByteArray33[this.anInt2199 - 1] - 128 & 0xFF) + ((this.aByteArray33[this.anInt2199 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(B)I")
	public final int method1455() {
		@Pc(16) int local16 = this.aByteArray33[this.anInt2199] & 0xFF;
		return local16 >= 128 ? this.method1478() - 32768 : this.method1471();
	}

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "(II)V")
	public final void method1457(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt2199++] = (byte) arg0;
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "(I)B")
	public final byte method1458() {
		return (byte) -this.aByteArray33[this.anInt2199++];
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)I")
	public final int method1459() {
		this.anInt2199 += 2;
		return (this.aByteArray33[this.anInt2199 - 1] - 128 & 0xFF) + ((this.aByteArray33[this.anInt2199 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "(B)I")
	public final int method1461() {
		this.anInt2199 += 4;
		return ((this.aByteArray33[this.anInt2199 - 3] & 0xFF) << 16) + (((this.aByteArray33[this.anInt2199 - 4] & 0xFF) << 24) + ((this.aByteArray33[this.anInt2199 - 2] & 0xFF) << 8) + (this.aByteArray33[this.anInt2199 + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "(I)I")
	public final int method1462() {
		this.anInt2199 += 2;
		@Pc(29) int local29 = ((this.aByteArray33[this.anInt2199 - 1] & 0xFF) << 8) + (this.aByteArray33[this.anInt2199 - 2] - 128 & 0xFF);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "(I)I")
	public final int method1463() {
		return this.aByteArray33[this.anInt2199++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(JZ)V")
	public final void method1464(@OriginalArg(0) long arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 56);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 48);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 40);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 32);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt2199++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "(II)V")
	public final void method1465(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt2199++] = (byte) arg0;
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "(B)I")
	public final int method1466() {
		this.anInt2199 += 3;
		return ((this.aByteArray33[this.anInt2199 - 2] & 0xFF) << 8) + ((this.aByteArray33[this.anInt2199 - 1] & 0xFF) << 16) + (this.aByteArray33[this.anInt2199 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII[B)V")
	public final void method1467(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (this.aByteArray33[this.anInt2199++] - 128);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V")
	public final void method1468(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt2199++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "(B)I")
	public final int method1471() {
		return this.aByteArray33[this.anInt2199++] & 0xFF;
	}

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "(I)I")
	public final int method1472() {
		this.anInt2199 += 2;
		return ((this.aByteArray33[this.anInt2199 - 1] & 0xFF) << 8) + (this.aByteArray33[this.anInt2199 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)V")
	public final void method1473(@OriginalArg(1) long arg0) {
		this.method1465((int) (arg0 >> 32));
		this.method1465((int) arg0);
	}

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "(I)I")
	public final int method1474() {
		this.anInt2199 += 4;
		return ((this.aByteArray33[this.anInt2199 - 1] & 0xFF) << 8) + ((this.aByteArray33[this.anInt2199 - 4] & 0xFF) << 16) + ((this.aByteArray33[this.anInt2199 - 3] & 0xFF) << 24) + (this.aByteArray33[this.anInt2199 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IB)V")
	public final void method1476(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "(I)Lclient!r;")
	public final Class61 method1477() {
		if (this.aByteArray33[this.anInt2199] == 0) {
			this.anInt2199++;
			return null;
		} else {
			return this.method1450();
		}
	}

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "(B)I")
	public final int method1478() {
		this.anInt2199 += 2;
		return (this.aByteArray33[this.anInt2199 - 1] & 0xFF) + ((this.aByteArray33[this.anInt2199 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(IB)V")
	public final void method1479(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "(II)V")
	public final void method1480(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt2199 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray33[this.anInt2199 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray33[this.anInt2199 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray33[this.anInt2199 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "(II)V")
	public final void method1481(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) arg0;
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(IB)V")
	public final void method1482(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 + 128);
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!r;B)V")
	public final void method1483(@OriginalArg(0) Class61 arg0) {
		this.anInt2199 += arg0.method1734(arg0.method1733(), this.anInt2199, this.aByteArray33);
		this.aByteArray33[this.anInt2199++] = 0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BBI)V")
	public final void method1484(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			this.aByteArray33[this.anInt2199++] = arg1[local10];
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
	public final void method1485(@OriginalArg(1) int arg0) {
		this.aByteArray33[this.anInt2199 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "(II)V")
	public final void method1486(@OriginalArg(0) int arg0) {
		this.aByteArray33[this.anInt2199++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "(I)B")
	public final byte method1487() {
		return (byte) (128 - this.aByteArray33[this.anInt2199++]);
	}
}
