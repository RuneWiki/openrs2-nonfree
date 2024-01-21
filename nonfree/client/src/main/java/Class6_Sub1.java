import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!b", name = "Gb", descriptor = "I")
	public int anInt2209 = 0;

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1(@OriginalArg(0) int arg0) {
		this.aByteArray11 = Static20.method593(arg0);
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V")
	public Class6_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray11 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
	public final void method1459(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I")
	public final int method1460(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = Static9.method351(arg0, this.anInt2209, this.aByteArray11);
		this.method1499(local19);
		return local19;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)Lclient!rc;")
	public final Class55 method1461() {
		@Pc(2) int local2 = this.anInt2209;
		while (this.aByteArray11[this.anInt2209++] != 0) {
		}
		return Static7.method245(this.aByteArray11, local2, this.anInt2209 - local2 - 1);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)I")
	public final int method1462() {
		this.anInt2209 += 4;
		return (this.aByteArray11[this.anInt2209 - 3] & 0xFF) + ((this.aByteArray11[this.anInt2209 - 4] & 0xFF) << 8) + ((this.aByteArray11[-2 + this.anInt2209] & 0xFF) << 24) + ((this.aByteArray11[this.anInt2209 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(JI)V")
	public final void method1463(@OriginalArg(0) long arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 56);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 48);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 40);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 32);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 24);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt2209++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)I")
	public final int method1464() {
		return -this.aByteArray11[this.anInt2209++] & 0xFF;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I")
	public final int method1465() {
		@Pc(16) int local16 = this.aByteArray11[this.anInt2209] & 0xFF;
		return local16 < 128 ? this.method1495() : this.method1500() - 32768;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)I")
	public final int method1466() {
		this.anInt2209 += 2;
		return ((this.aByteArray11[this.anInt2209 - 1] & 0xFF) << 8) + (this.aByteArray11[this.anInt2209 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V")
	public final void method1467(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) arg0;
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)I")
	public final int method1468() {
		this.anInt2209 += 2;
		@Pc(33) int local33 = (this.aByteArray11[this.anInt2209 - 1] - 128 & 0xFF) + ((this.aByteArray11[this.anInt2209 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IB)V")
	public final void method1469(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(B)J")
	public final long method1470() {
		@Pc(10) long local10 = (long) this.method1503() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method1503() & 0xFFFFFFFFL;
		return local26 + (local10 << 32);
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)B")
	public final byte method1471() {
		return (byte) (128 - this.aByteArray11[this.anInt2209++]);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
	public final void method1473(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 24);
		this.aByteArray11[this.anInt2209++] = (byte) arg0;
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V")
	public final void method1474(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1501(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1512(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(II)V")
	public final void method1475(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 + 128);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(II)V")
	public final void method1476(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[BII)V")
	public final void method1477(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray11[this.anInt2209++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(B)I")
	public final int method1479() {
		this.anInt2209 += 4;
		return (this.aByteArray11[this.anInt2209 - 4] & 0xFF) + ((this.aByteArray11[this.anInt2209 - 3] & 0xFF) << 8) + ((this.aByteArray11[this.anInt2209 + -1] & 0xFF) << 24) + ((this.aByteArray11[this.anInt2209 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(II)V")
	public final void method1480(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) arg0;
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "(I)I")
	public final int method1483() {
		this.anInt2209 += 3;
		return (this.aByteArray11[this.anInt2209 - 1] & 0xFF) + (((this.aByteArray11[this.anInt2209 - 3] & 0xFF) << 16) + ((this.aByteArray11[this.anInt2209 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!b", name = "j", descriptor = "(I)B")
	public final byte method1484() {
		return this.aByteArray11[this.anInt2209++];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[BI)V")
	public final void method1485(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = this.aByteArray11[this.anInt2209++];
		}
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "(I)I")
	public final int method1486() {
		this.anInt2209 += 4;
		return (this.aByteArray11[this.anInt2209 - 2] & 0xFF) + ((this.aByteArray11[this.anInt2209 - 1] & 0xFF) << 8) + ((this.aByteArray11[this.anInt2209 + -3] & 0xFF) << 24) + ((this.aByteArray11[this.anInt2209 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method1488(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2209;
		this.anInt2209 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1508(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2209 = 0;
		this.method1501(local31.length);
		this.method1477(local31, local31.length);
	}

	@OriginalMember(owner = "client!b", name = "m", descriptor = "(I)I")
	public final int method1489() {
		return this.aByteArray11[this.anInt2209++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(BI)V")
	public final void method1490(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt2209++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[IBI)V")
	public final void method1491(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt2209;
		this.anInt2209 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(33) int local33 = this.method1503();
			@Pc(37) int local37 = this.method1503();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= arg0[local39 >>> 11 & 0x3] + local39 ^ (local33 >>> 5 ^ local33 << 4) - -local33;
				local39 -= -1640531527;
				local33 -= (local37 << 4 ^ local37 >>> 5) + local37 ^ arg0[local39 & 0x3] + local39;
			}
			this.anInt2209 -= 8;
			this.method1499(local33);
			this.method1499(local37);
		}
		this.anInt2209 = local8;
	}

	@OriginalMember(owner = "client!b", name = "n", descriptor = "(I)I")
	public final int method1492() {
		@Pc(7) int local7 = this.aByteArray11[this.anInt2209] & 0xFF;
		return local7 >= 128 ? this.method1500() - 49152 : this.method1495() + -64;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLclient!rc;)V")
	public final void method1493(@OriginalArg(1) Class55 arg0) {
		this.anInt2209 += arg0.method1670(this.anInt2209, this.aByteArray11, arg0.method1674());
		this.aByteArray11[this.anInt2209++] = 0;
	}

	@OriginalMember(owner = "client!b", name = "o", descriptor = "(I)I")
	public final int method1494() {
		this.anInt2209 += 2;
		@Pc(33) int local33 = ((this.aByteArray11[this.anInt2209 - 1] & 0xFF) << 8) + (this.aByteArray11[this.anInt2209 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!b", name = "p", descriptor = "(I)I")
	public final int method1495() {
		return this.aByteArray11[this.anInt2209++] & 0xFF;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)I")
	public final int method1497() {
		this.anInt2209 += 2;
		@Pc(36) int local36 = (this.aByteArray11[this.anInt2209 - 2] & 0xFF) + ((this.aByteArray11[this.anInt2209 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(B)I")
	public final int method1498() {
		this.anInt2209 += 2;
		@Pc(39) int local39 = (this.aByteArray11[this.anInt2209 - 1] & 0xFF) + ((this.aByteArray11[this.anInt2209 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
	public final void method1499(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 24);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt2209++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "q", descriptor = "(I)I")
	public final int method1500() {
		this.anInt2209 += 2;
		return (this.aByteArray11[this.anInt2209 - 1] & 0xFF) + ((this.aByteArray11[this.anInt2209 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(BI)V")
	public final void method1501(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "r", descriptor = "(I)I")
	public final int method1502() {
		this.anInt2209 += 2;
		return (this.aByteArray11[this.anInt2209 - 1] - 128 & 0xFF) + ((this.aByteArray11[this.anInt2209 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!b", name = "s", descriptor = "(I)I")
	public final int method1503() {
		this.anInt2209 += 4;
		return (this.aByteArray11[this.anInt2209 - 1] & 0xFF) + ((this.aByteArray11[this.anInt2209 - 2] & 0xFF) << 8) + ((this.aByteArray11[this.anInt2209 + -4] & 0xFF) << 24) + ((this.aByteArray11[this.anInt2209 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(B)I")
	public final int method1504() {
		@Pc(12) byte local12 = this.aByteArray11[this.anInt2209++];
		@Pc(18) int local18 = 0;
		while (local12 < 0) {
			local18 = (local12 & 0x7F | local18) << 7;
			local12 = this.aByteArray11[this.anInt2209++];
		}
		return local12 | local18;
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "(B)I")
	public final int method1505() {
		return 128 - this.aByteArray11[this.anInt2209++] & 0xFF;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(BI)V")
	public final void method1506(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt2209 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "j", descriptor = "(B)I")
	public final int method1507() {
		this.anInt2209 += 2;
		return (this.aByteArray11[this.anInt2209 - 2] & 0xFF) + ((this.aByteArray11[this.anInt2209 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I[BII)V")
	public final void method1508(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray11[this.anInt2209++];
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(II)V")
	public final void method1509(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt2209++] = (byte) arg0;
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 24);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(II)V")
	public final void method1510(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "(B)B")
	public final byte method1511() {
		return (byte) -this.aByteArray11[this.anInt2209++];
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "(II)V")
	public final void method1512(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt2209++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt2209++] = (byte) arg0;
	}
}
