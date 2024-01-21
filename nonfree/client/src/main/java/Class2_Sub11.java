import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
	public int anInt2235;

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11(@OriginalArg(0) int arg0) {
		this.anInt2235 = 0;
		this.aByteArray26 = Static58.method796(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray26 = arg0;
		this.anInt2235 = 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IJ)V")
	public final void method1527(@OriginalArg(1) long arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 56);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 48);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 40);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 32);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public final void method1528(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)I")
	public final int method1529() {
		return this.aByteArray26[this.anInt2235++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)J")
	public final long method1530(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) long local22 = 0L;
		for (@Pc(26) int local26 = local11 * 8; local26 >= 0; local26 -= 8) {
			local22 |= ((long) this.aByteArray26[this.anInt2235++] & 0xFFL) << local26;
		}
		return local22;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V")
	public final void method1531(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
	public final int method1532() {
		this.anInt2235 += 3;
		return (this.aByteArray26[this.anInt2235 - 2] & 0xFF) + ((this.aByteArray26[this.anInt2235 - 3] & 0xFF) << 16) + ((this.aByteArray26[this.anInt2235 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V")
	public final void method1533(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)I")
	public final int method1534() {
		return this.aByteArray26[this.anInt2235++] & 0xFF;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)V")
	public final void method1535(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1565(arg0 >>> 28 | 0x80);
					}
					this.method1565(arg0 >>> 21 | 0x80);
				}
				this.method1565(arg0 >>> 14 | 0x80);
			}
			this.method1565(arg0 >>> 7 | 0x80);
		}
		this.method1565(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
	public final int method1536() {
		this.anInt2235 += 3;
		return (this.aByteArray26[this.anInt2235 - 1] & 0xFF) + (((this.aByteArray26[this.anInt2235 - 3] & 0xFF) << 16) + ((this.aByteArray26[this.anInt2235 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)I")
	public final int method1537() {
		this.anInt2235 += 2;
		@Pc(37) int local37 = (this.aByteArray26[this.anInt2235 - 1] - 128 & 0xFF) + ((this.aByteArray26[this.anInt2235 - 2] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)Lclient!mb;")
	public final Class62 method1538() {
		@Pc(6) int local6 = this.anInt2235;
		while (this.aByteArray26[this.anInt2235++] != 0) {
		}
		return Static146.method2188(local6, this.anInt2235 - local6 - 1, this.aByteArray26);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method1539(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt2235;
		this.anInt2235 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method1541(local12, local2);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local28.toByteArray();
		this.anInt2235 = 0;
		this.method1565(local35.length);
		this.method1560(local35.length, local35);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!mb;I)V")
	public final void method1540(@OriginalArg(0) Class62 arg0) {
		this.anInt2235 += arg0.method1838(this.aByteArray26, arg0.method1878(), this.anInt2235);
		this.aByteArray26[this.anInt2235++] = 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BIII)V")
	public final void method1541(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			arg0[local10] = this.aByteArray26[this.anInt2235++];
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JII)V")
	public final void method1542(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 - 1;
		if (local13 < 0 || local13 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local13 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> local29);
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(II)V")
	public final void method1543(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2235++] = (byte) arg0;
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
	public final void method1544(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JB)V")
	public final void method1545(@OriginalArg(0) long arg0) {
		this.method1579((int) (arg0 >> 32));
		this.method1579((int) arg0);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)I")
	public final int method1546() {
		this.anInt2235 += 4;
		return (this.aByteArray26[this.anInt2235 - 3] & 0xFF) + (((this.aByteArray26[this.anInt2235 - 4] & 0xFF) << 8) + ((this.aByteArray26[this.anInt2235 - 2] & 0xFF) << 24) + ((this.aByteArray26[this.anInt2235 + -1] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(II)V")
	public final void method1547(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1565(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1533(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)I")
	public final int method1548() {
		this.anInt2235 += 2;
		return (this.aByteArray26[this.anInt2235 - 1] - 128 & 0xFF) + ((this.aByteArray26[this.anInt2235 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(II)V")
	public final void method1549(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2235 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)I")
	public final int method1550() {
		return -this.aByteArray26[this.anInt2235++] & 0xFF;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)I")
	public final int method1551() {
		@Pc(16) byte local16 = this.aByteArray26[this.anInt2235++];
		@Pc(26) int local26 = 0;
		while (local16 < 0) {
			local26 = (local16 & 0x7F | local26) << 7;
			local16 = this.aByteArray26[this.anInt2235++];
		}
		return local16 | local26;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)B")
	public final byte method1552() {
		return this.aByteArray26[this.anInt2235++];
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)I")
	public final int method1553() {
		@Pc(11) int local11 = this.aByteArray26[this.anInt2235] & 0xFF;
		return local11 >= 128 ? this.method1557() - 49152 : this.method1534() - 64;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(II)V")
	public final void method1554(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)I")
	public final int method1556() {
		this.anInt2235 += 2;
		@Pc(39) int local39 = ((this.aByteArray26[this.anInt2235 - 1] & 0xFF) << 8) + (this.aByteArray26[this.anInt2235 - 2] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)I")
	public final int method1557() {
		this.anInt2235 += 2;
		return ((this.aByteArray26[this.anInt2235 - 2] & 0xFF) << 8) + (this.aByteArray26[this.anInt2235 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)I")
	public final int method1558(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static103.method1561(this.aByteArray26, this.anInt2235, arg0);
		this.method1544(local11);
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(II)V")
	public final void method1559(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 + 128);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII[B)V")
	public final void method1560(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray26[this.anInt2235++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)I")
	public final int method1562() {
		this.anInt2235 += 2;
		return (this.aByteArray26[this.anInt2235 - 2] - 128 & 0xFF) + ((this.aByteArray26[this.anInt2235 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[I)V")
	public final void method1564(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt2235;
		this.anInt2235 = 5;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			@Pc(28) int local28 = -957401312;
			@Pc(34) int local34 = this.method1577();
			@Pc(38) int local38 = this.method1577();
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local38 -= (local34 << 4 ^ local34 >>> 5) + local34 ^ arg1[local28 >>> 11 & 0xC600003] + local28;
				local28 -= -1640531527;
				local34 -= arg1[local28 & 0x3] + local28 ^ local38 + (local38 >>> 5 ^ local38 << 4);
			}
			this.anInt2235 -= 8;
			this.method1544(local34);
			this.method1544(local38);
		}
		this.anInt2235 = local8;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public final void method1565(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)I")
	public final int method1566() {
		this.anInt2235 += 4;
		return ((this.aByteArray26[this.anInt2235 - 3] & 0xFF) << 8) + (this.aByteArray26[this.anInt2235 - 2] << 16 & 0xFF0000) + ((this.aByteArray26[this.anInt2235 + -1] & 0xFF) << 24) + (this.aByteArray26[this.anInt2235 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BIBI)V")
	public final void method1567(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = arg1 - 1; local9 >= 0; local9--) {
			arg0[local9] = this.aByteArray26[this.anInt2235++];
		}
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(I)I")
	public final int method1568() {
		this.anInt2235 += 2;
		@Pc(31) int local31 = ((this.aByteArray26[this.anInt2235 - 2] & 0xFF) << 8) + (this.aByteArray26[this.anInt2235 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public final void method1569(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2235 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt2235 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2235 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2235 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(BI)V")
	public final void method1570(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt2235++] = (byte) arg0;
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(Z)I")
	public final int method1571() {
		this.anInt2235 += 2;
		return (this.aByteArray26[this.anInt2235 - 2] & 0xFF) + ((this.aByteArray26[this.anInt2235 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(I)I")
	public final int method1572() {
		@Pc(11) int local11 = this.aByteArray26[this.anInt2235] & 0xFF;
		return local11 >= 128 ? this.method1557() - 32768 : this.method1534();
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "(I)Lclient!mb;")
	public final Class62 method1573() {
		if (this.aByteArray26[this.anInt2235] == 0) {
			this.anInt2235++;
			return null;
		} else {
			return this.method1538();
		}
	}

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "(I)I")
	public final int method1574() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method1572();
		while (local11 == 32767) {
			local11 = this.method1572();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)I")
	public final int method1575() {
		this.anInt2235 += 4;
		return ((this.aByteArray26[this.anInt2235 - 1] & 0xFF) << 8) + (((this.aByteArray26[this.anInt2235 - 4] & 0xFF) << 16) + ((this.aByteArray26[this.anInt2235 - 3] & 0xFF) << 24) + (this.aByteArray26[this.anInt2235 + -2] & 0xFF));
	}

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "(I)I")
	public final int method1577() {
		this.anInt2235 += 4;
		return (this.aByteArray26[this.anInt2235 - 1] & 0xFF) + (((this.aByteArray26[this.anInt2235 - 4] & 0xFF) << 24) + ((this.aByteArray26[this.anInt2235 - 3] & 0xFF) << 16) + ((this.aByteArray26[this.anInt2235 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)V")
	public final void method1578(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(II)V")
	public final void method1579(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) arg0;
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(B)J")
	public final long method1580() {
		@Pc(6) long local6 = (long) this.method1577() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1577() & 0xFFFFFFFFL;
		return local22 + (local6 << 32);
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "(I)I")
	public final int method1581() {
		return 128 - this.aByteArray26[this.anInt2235++] & 0xFF;
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(II)V")
	public final void method1582(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2235++] = (byte) arg0;
		this.aByteArray26[this.anInt2235++] = (byte) (arg0 >> 8);
	}
}
