import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
	public int anInt2195;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8(@OriginalArg(0) int arg0) {
		this.aByteArray27 = Static64.method1435(arg0);
		this.anInt2195 = 0;
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.anInt2195 = 0;
		this.aByteArray27 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)I")
	public final int method1600() {
		return 128 - this.aByteArray27[this.anInt2195++] & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[I)V")
	public final void method1601(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt2195;
		@Pc(15) int local15 = (arg0 - 5) / 8;
		this.anInt2195 = 5;
		for (@Pc(25) int local25 = 0; local25 < local15; local25++) {
			@Pc(31) int local31 = this.method1626();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = this.method1626();
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local37 -= (local31 >>> 5 ^ local31 << 4) + local31 ^ arg1[local33 >>> 11 & 0x3] + local33;
				local33 -= -1640531527;
				local31 -= local37 + (local37 >>> 5 ^ local37 << 4) ^ local33 - -arg1[local33 & 0x3];
			}
			this.anInt2195 -= 8;
			this.method1635(local31);
			this.method1635(local37);
		}
		this.anInt2195 = local8;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)I")
	public final int method1602() {
		this.anInt2195 += 4;
		return (this.aByteArray27[this.anInt2195 - 2] & 0xFF) + ((this.aByteArray27[this.anInt2195 - 1] & 0xFF) << 8) + ((this.aByteArray27[this.anInt2195 + -3] & 0xFF) << 24) + ((this.aByteArray27[this.anInt2195 - 4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)I")
	public final int method1603() {
		return this.aByteArray27[this.anInt2195++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
	public final void method1604(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)I")
	public final int method1605() {
		this.anInt2195 += 3;
		return ((this.aByteArray27[this.anInt2195 - 2] & 0xFF) << 16) - (-((this.aByteArray27[this.anInt2195 - 3] & 0xFF) << 8) - (this.aByteArray27[this.anInt2195 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)V")
	public final void method1606(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) arg0;
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)I")
	public final int method1607() {
		return this.aByteArray27[this.anInt2195++] & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)I")
	public final int method1608() {
		@Pc(14) int local14 = this.aByteArray27[this.anInt2195] & 0xFF;
		return local14 < 128 ? this.method1607() - 64 : this.method1642() + -49152;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)B")
	public final byte method1609() {
		return (byte) -this.aByteArray27[this.anInt2195++];
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public final void method1610(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2195 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2195 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2195 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2195 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)B")
	public final byte method1611() {
		return this.aByteArray27[this.anInt2195++];
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)V")
	public final void method1612(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2195 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)V")
	public final void method1614(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)I")
	public final int method1615(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = Static85.method1822(arg0, this.aByteArray27, this.anInt2195);
		this.method1635(local9);
		return local9;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(B)J")
	public final long method1616() {
		@Pc(10) long local10 = (long) this.method1626() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1626() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)I")
	public final int method1617() {
		this.anInt2195 += 4;
		return ((this.aByteArray27[this.anInt2195 - 2] & 0xFF) << 24) + (((this.aByteArray27[this.anInt2195 - 1] & 0xFF) << 16) - (-(this.aByteArray27[this.anInt2195 - 4] << 8 & 0xFF00) - (this.aByteArray27[this.anInt2195 - 3] & 0xFF)));
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)I")
	public final int method1618() {
		this.anInt2195 += 3;
		return (this.aByteArray27[this.anInt2195 - 1] & 0xFF) + ((this.aByteArray27[this.anInt2195 - 3] & 0xFF) << 16) + ((this.aByteArray27[this.anInt2195 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)Lclient!dd;")
	public final Class13 method1619() {
		if (this.aByteArray27[this.anInt2195] == 0) {
			this.anInt2195++;
			return null;
		} else {
			return this.method1622();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)V")
	public final void method1620(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2195++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(II)V")
	public final void method1621(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2195++] = (byte) arg0;
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(I)Lclient!dd;")
	public final Class13 method1622() {
		@Pc(10) int local10 = this.anInt2195;
		while (this.aByteArray27[this.anInt2195++] != 0) {
		}
		return Static135.method2423(local10, this.anInt2195 - local10 - 1, this.aByteArray27);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[B)V")
	public final void method1623(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			this.aByteArray27[this.anInt2195++] = arg1[local5];
		}
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(B)I")
	public final int method1624() {
		this.anInt2195 += 2;
		return (this.aByteArray27[this.anInt2195 - 1] - 128 & 0xFF) + ((this.aByteArray27[this.anInt2195 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BJ)V")
	public final void method1625(@OriginalArg(1) long arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 56);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 48);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 40);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 32);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2195++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "(I)I")
	public final int method1626() {
		this.anInt2195 += 4;
		return (this.aByteArray27[this.anInt2195 - 1] & 0xFF) + ((this.aByteArray27[this.anInt2195 - 2] & 0xFF) << 8) + ((this.aByteArray27[this.anInt2195 + -4] & 0xFF) << 24) + ((this.aByteArray27[this.anInt2195 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)I")
	public final int method1627() {
		this.anInt2195 += 2;
		@Pc(38) int local38 = ((this.aByteArray27[this.anInt2195 - 2] & 0xFF) << 8) + (this.aByteArray27[this.anInt2195 - 1] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "(I)I")
	public final int method1628() {
		@Pc(3) int local3 = 0;
		@Pc(14) byte local14;
		for (local14 = this.aByteArray27[this.anInt2195++]; local14 < 0; local14 = this.aByteArray27[this.anInt2195++]) {
			local3 = (local3 | local14 & 0x7F) << 7;
		}
		return local14 | local3;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(II)V")
	public final void method1629(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) arg0;
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(II)V")
	public final void method1630(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1643(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1650(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(B)I")
	public final int method1631() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method1645();
		while (local16 == 32767) {
			local16 = this.method1645();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IZ)V")
	public final void method1632(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 + 128);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(II)V")
	public final void method1633(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)I")
	public final int method1634() {
		this.anInt2195 += 2;
		return ((this.aByteArray27[this.anInt2195 - 1] & 0xFF) << 8) + (this.aByteArray27[this.anInt2195 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(II)V")
	public final void method1635(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2195++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "(I)I")
	public final int method1636() {
		this.anInt2195 += 2;
		return ((this.aByteArray27[this.anInt2195 - 1] & 0xFF) << 8) + (this.aByteArray27[this.anInt2195 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(Z)I")
	public final int method1637() {
		this.anInt2195 += 2;
		@Pc(40) int local40 = (this.aByteArray27[this.anInt2195 - 2] - 128 & 0xFF) + ((this.aByteArray27[this.anInt2195 - 1] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "(I)I")
	public final int method1638() {
		return -this.aByteArray27[this.anInt2195++] & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!dd;B)V")
	public final void method1639(@OriginalArg(0) Class13 arg0) {
		this.anInt2195 += arg0.method886(this.aByteArray27, this.anInt2195, arg0.method904());
		this.aByteArray27[this.anInt2195++] = 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
	public final void method1640(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2195++] = (byte) arg0;
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI[BI)V")
	public final void method1641(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = this.aByteArray27[this.anInt2195++];
		}
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(B)I")
	public final int method1642() {
		this.anInt2195 += 2;
		return (this.aByteArray27[this.anInt2195 - 1] & 0xFF) + ((this.aByteArray27[this.anInt2195 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(BI)V")
	public final void method1643(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(II)V")
	public final void method1644(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1643(arg0 >>> 28 | 0x80);
					}
					this.method1643(arg0 >>> 21 | 0x80);
				}
				this.method1643(arg0 >>> 14 | 0x80);
			}
			this.method1643(arg0 >>> 7 | 0x80);
		}
		this.method1643(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(B)I")
	public final int method1645() {
		@Pc(16) int local16 = this.aByteArray27[this.anInt2195] & 0xFF;
		return local16 >= 128 ? this.method1642() - 32768 : this.method1607();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(JI)V")
	public final void method1646(@OriginalArg(0) long arg0) {
		this.method1621((int) (arg0 >> 32));
		this.method1621((int) arg0);
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(Z)B")
	public final byte method1647() {
		return (byte) (128 - this.aByteArray27[this.anInt2195++]);
	}

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "(I)B")
	public final byte method1648() {
		return (byte) (this.aByteArray27[this.anInt2195++] - 128);
	}

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "(I)I")
	public final int method1649() {
		this.anInt2195 += 2;
		@Pc(32) int local32 = ((this.aByteArray27[this.anInt2195 - 1] & 0xFF) << 8) + (this.aByteArray27[this.anInt2195 - 2] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "(II)V")
	public final void method1650(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt2195++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt2195++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1651(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2195;
		this.anInt2195 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1641(local12, local6);
		@Pc(30) BigInteger local30 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt2195 = 0;
		this.method1643(local38.length);
		this.method1623(local38.length, local38);
	}

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "(I)I")
	public final int method1652() {
		this.anInt2195 += 4;
		return (this.aByteArray27[this.anInt2195 - 4] & 0xFF) + ((this.aByteArray27[this.anInt2195 - 2] & 0xFF) << 16) + ((this.aByteArray27[this.anInt2195 + -1] & 0xFF) << 24) + ((this.aByteArray27[this.anInt2195 + -3] & 0xFF) << 8);
	}
}
