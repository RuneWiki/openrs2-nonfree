import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	public int anInt2385;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2(@OriginalArg(0) int arg0) {
		this.aByteArray35 = Static175.method2732(arg0);
		this.anInt2385 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray35 = arg0;
		this.anInt2385 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(Z)B")
	public final byte method1651() {
		return (byte) -this.aByteArray35[this.anInt2385++];
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)B")
	public final byte method1652() {
		return (byte) (this.aByteArray35[this.anInt2385++] - 128);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)I")
	public final int method1653() {
		this.anInt2385 += 4;
		return ((this.aByteArray35[this.anInt2385 - 3] & 0xFF) << 8) + ((this.aByteArray35[this.anInt2385 - 1] & 0xFF) << 24) + ((this.aByteArray35[this.anInt2385 + -2] & 0xFF) << 16) + (this.aByteArray35[this.anInt2385 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)I")
	public final int method1654() {
		this.anInt2385 += 3;
		return (this.aByteArray35[this.anInt2385 - 1] & 0xFF) + ((this.aByteArray35[this.anInt2385 - 3] & 0xFF) << 16) + ((this.aByteArray35[this.anInt2385 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)J")
	public final long method1655() {
		@Pc(10) long local10 = (long) this.method1690() & 0xFFFFFFFFL;
		@Pc(19) long local19 = (long) this.method1690() & 0xFFFFFFFFL;
		return (local10 << 32) + local19;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public final void method1656(@OriginalArg(0) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 16);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 24);
		this.aByteArray35[this.anInt2385++] = (byte) arg0;
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)I")
	public final int method1657() {
		@Pc(7) int local7 = 0;
		@Pc(18) byte local18;
		for (local18 = this.aByteArray35[this.anInt2385++]; local18 < 0; local18 = this.aByteArray35[this.anInt2385++]) {
			local7 = (local7 | local18 & 0x7F) << 7;
		}
		return local18 | local7;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V")
	public final void method1658(@OriginalArg(0) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) arg0;
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)I")
	public final int method1659() {
		this.anInt2385 += 2;
		@Pc(31) int local31 = ((this.aByteArray35[this.anInt2385 - 2] & 0xFF) << 8) + (this.aByteArray35[this.anInt2385 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)I")
	public final int method1660() {
		this.anInt2385 += 2;
		@Pc(38) int local38 = (this.aByteArray35[this.anInt2385 - 2] - 128 & 0xFF) + ((this.aByteArray35[this.anInt2385 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)Lclient!gg;")
	public final Class28 method1662() {
		@Pc(11) int local11 = this.anInt2385;
		while (this.aByteArray35[this.anInt2385++] != 0) {
		}
		return Static117.method1960(this.aByteArray35, local11, this.anInt2385 - local11 - 1);
	}

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)Lclient!gg;")
	public final Class28 method1663() {
		if (this.aByteArray35[this.anInt2385] == 0) {
			this.anInt2385++;
			return null;
		} else {
			return this.method1662();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)V")
	public final void method1664(@OriginalArg(0) int arg0) {
		this.aByteArray35[this.anInt2385 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray35[this.anInt2385 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray35[this.anInt2385 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray35[this.anInt2385 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)I")
	public final int method1665() {
		this.anInt2385 += 2;
		return ((this.aByteArray35[this.anInt2385 - 1] & 0xFF) << 8) + (this.aByteArray35[this.anInt2385 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BJ)V")
	public final void method1666(@OriginalArg(1) long arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 56);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 48);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 40);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 32);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 24);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 16);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
		this.aByteArray35[this.anInt2385++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "(I)I")
	public final int method1667() {
		return 128 - this.aByteArray35[this.anInt2385++] & 0xFF;
	}

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "(I)I")
	public final int method1668() {
		return this.aByteArray35[this.anInt2385++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(Z)I")
	public final int method1669() {
		@Pc(18) int local18 = this.aByteArray35[this.anInt2385] & 0xFF;
		return local18 >= 128 ? this.method1680() - 49152 : this.method1698() + -64;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)I")
	public final int method1670() {
		this.anInt2385 += 2;
		return ((this.aByteArray35[this.anInt2385 - 2] & 0xFF) << 8) + (this.aByteArray35[this.anInt2385 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)I")
	public final int method1671() {
		this.anInt2385 += 4;
		return ((this.aByteArray35[this.anInt2385 - 1] & 0xFF) << 8) + ((this.aByteArray35[this.anInt2385 - 4] & 0xFF) << 16) + ((this.aByteArray35[-3 + this.anInt2385] & 0xFF) << 24) + (this.aByteArray35[this.anInt2385 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(Z)B")
	public final byte method1673() {
		return (byte) (128 - this.aByteArray35[this.anInt2385++]);
	}

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "(I)I")
	public final int method1674() {
		this.anInt2385 += 2;
		return ((this.aByteArray35[this.anInt2385 - 1] & 0xFF) << 8) + (this.aByteArray35[this.anInt2385 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IB)V")
	public final void method1675(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1700(arg0 >>> 28 | 0x80);
					}
					this.method1700(arg0 >>> 21 | 0x80);
				}
				this.method1700(arg0 >>> 14 | 0x80);
			}
			this.method1700(arg0 >>> 7 | 0x80);
		}
		this.method1700(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B[BII)V")
	public final void method1676(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = arg1 - 1; local12 >= 0; local12--) {
			arg0[local12] = (byte) (this.aByteArray35[this.anInt2385++] - 128);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V")
	public final void method1678(@OriginalArg(1) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) arg0;
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 16);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "(I)I")
	public final int method1679() {
		@Pc(16) int local16 = this.aByteArray35[this.anInt2385] & 0xFF;
		return local16 >= 128 ? this.method1680() - 32768 : this.method1698();
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)I")
	public final int method1680() {
		this.anInt2385 += 2;
		return ((this.aByteArray35[this.anInt2385 - 2] & 0xFF) << 8) + (this.aByteArray35[this.anInt2385 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)V")
	public final void method1681(@OriginalArg(1) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 + 128);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(BI)V")
	public final void method1682(@OriginalArg(1) int arg0) {
		this.aByteArray35[this.anInt2385 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(IB)V")
	public final void method1683(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1700(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1696(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)I")
	public final int method1684() {
		this.anInt2385 += 4;
		return (this.aByteArray35[this.anInt2385 - 3] & 0xFF) + ((this.aByteArray35[this.anInt2385 - 4] & 0xFF) << 8) + ((this.aByteArray35[this.anInt2385 + -1] & 0xFF) << 16) + ((this.aByteArray35[this.anInt2385 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(IB)V")
	public final void method1685(@OriginalArg(0) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(II)V")
	public final void method1687(@OriginalArg(0) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
		this.aByteArray35[this.anInt2385++] = (byte) arg0;
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 24);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(BI)V")
	public final void method1688(@OriginalArg(1) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([BIII)V")
	public final void method1689(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = this.aByteArray35[this.anInt2385++];
		}
	}

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "(I)I")
	public final int method1690() {
		this.anInt2385 += 4;
		return ((this.aByteArray35[this.anInt2385 - 4] & 0xFF) << 24) + ((this.aByteArray35[this.anInt2385 - 3] & 0xFF) << 16) + ((this.aByteArray35[this.anInt2385 - 2] & 0xFF) << 8) + (this.aByteArray35[this.anInt2385 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(II)V")
	public final void method1691(@OriginalArg(1) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 16);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
		this.aByteArray35[this.anInt2385++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(JI)V")
	public final void method1694(@OriginalArg(0) long arg0) {
		this.method1678((int) (arg0 >> 32));
		this.method1678((int) arg0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V")
	public final void method1695(@OriginalArg(0) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(IB)V")
	public final void method1696(@OriginalArg(0) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
		this.aByteArray35[this.anInt2385++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1697(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt2385;
		@Pc(14) byte[] local14 = new byte[local2];
		this.anInt2385 = 0;
		this.method1705(local2, local14);
		@Pc(28) BigInteger local28 = new BigInteger(local14);
		@Pc(33) BigInteger local33 = local28.modPow(arg0, arg1);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt2385 = 0;
		this.method1700(local36.length);
		this.method1706(local36.length, local36);
	}

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "(I)I")
	public final int method1698() {
		return this.aByteArray35[this.anInt2385++] & 0xFF;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!gg;I)V")
	public final void method1699(@OriginalArg(0) Class28 arg0) {
		this.anInt2385 += arg0.method1122(this.aByteArray35, this.anInt2385, arg0.method1121());
		this.aByteArray35[this.anInt2385++] = 0;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(II)V")
	public final void method1700(@OriginalArg(1) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB[I)V")
	public final void method1701(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(15) int local15 = this.anInt2385;
		this.anInt2385 = 5;
		@Pc(25) int local25 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method1690();
			@Pc(35) int local35 = -957401312;
			@Pc(39) int local39 = this.method1690();
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local39 -= (local33 >>> 5 ^ local33 << 4) + local33 ^ local35 + arg1[local35 >>> 11 & 0xAC400003];
				local35 -= -1640531527;
				local33 -= (local39 << 4 ^ local39 >>> 5) + local39 ^ arg1[local35 & 0x3] + local35;
			}
			this.anInt2385 -= 8;
			this.method1710(local33);
			this.method1710(local39);
		}
		this.anInt2385 = local15;
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(II)V")
	public final void method1702(@OriginalArg(0) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(B)I")
	public final int method1703() {
		return -this.aByteArray35[this.anInt2385++] & 0xFF;
	}

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "(I)I")
	public final int method1704() {
		this.anInt2385 += 3;
		return ((this.aByteArray35[this.anInt2385 - 3] & 0xFF) << 16) + ((this.aByteArray35[this.anInt2385 - 1] & 0xFF) << 8) + (this.aByteArray35[this.anInt2385 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[B)V")
	public final void method1705(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray35[this.anInt2385++];
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI[B)V")
	public final void method1706(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			this.aByteArray35[this.anInt2385++] = arg1[local10];
		}
	}

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "(B)B")
	public final byte method1707() {
		return this.aByteArray35[this.anInt2385++];
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(IB)I")
	public final int method1708(@OriginalArg(0) int arg0) {
		@Pc(20) int local20 = Static168.method2642(this.aByteArray35, arg0, this.anInt2385);
		this.method1710(local20);
		return local20;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(Z)I")
	public final int method1709() {
		this.anInt2385 += 2;
		@Pc(29) int local29 = (this.aByteArray35[this.anInt2385 - 1] - 128 & 0xFF) + ((this.aByteArray35[this.anInt2385 - 2] & 0xFF) << 8);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(IB)V")
	public final void method1710(@OriginalArg(0) int arg0) {
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 24);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 16);
		this.aByteArray35[this.anInt2385++] = (byte) (arg0 >> 8);
		this.aByteArray35[this.anInt2385++] = (byte) arg0;
	}
}
