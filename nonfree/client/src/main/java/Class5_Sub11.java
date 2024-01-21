import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!qe", name = "tb", descriptor = "I")
	public int anInt2233;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I)V")
	public Class5_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray23 = Static18.method486(arg0);
		this.anInt2233 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([B)V")
	public Class5_Sub11(@OriginalArg(0) byte[] arg0) {
		this.anInt2233 = 0;
		this.aByteArray23 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V")
	public final void method1499(@OriginalArg(0) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 16);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 24);
		this.aByteArray23[this.anInt2233++] = (byte) arg0;
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(IB)V")
	public final void method1501(@OriginalArg(0) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
		this.aByteArray23[this.anInt2233++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)I")
	public final int method1502() {
		return -this.aByteArray23[this.anInt2233++] & 0xFF;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)I")
	public final int method1503() {
		this.anInt2233 += 2;
		@Pc(39) int local39 = ((this.aByteArray23[this.anInt2233 - 1] & 0xFF) << 8) + (this.aByteArray23[this.anInt2233 - 2] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
	public final int method1504(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static58.method1031(this.anInt2233, this.aByteArray23, arg0);
		this.method1525(local7);
		return local7;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
	public final void method1505(@OriginalArg(0) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) arg0;
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)I")
	public final int method1506() {
		this.anInt2233 += 3;
		return ((this.aByteArray23[this.anInt2233 - 1] & 0xFF) << 16) - (-(this.aByteArray23[this.anInt2233 - 2] << 8 & 0xFF00) - (this.aByteArray23[this.anInt2233 - 3] & 0xFF));
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[III)V")
	public final void method1507(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = this.anInt2233;
		this.anInt2233 = 5;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) int local25 = this.method1540();
			@Pc(29) int local29 = this.method1540();
			@Pc(31) int local31 = -957401312;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local29 -= local25 + (local25 << 4 ^ local25 >>> 5) ^ arg1[local31 >>> 11 & 0xB2800003] + local31;
				local31 -= -1640531527;
				local25 -= (local29 << 4 ^ local29 >>> 5) + local29 ^ local31 + arg1[local31 & 0x3];
			}
			this.anInt2233 -= 8;
			this.method1525(local25);
			this.method1525(local29);
		}
		this.anInt2233 = local8;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
	public final int method1508() {
		@Pc(16) int local16 = 0;
		@Pc(27) byte local27;
		for (local27 = this.aByteArray23[this.anInt2233++]; local27 < 0; local27 = this.aByteArray23[this.anInt2233++]) {
			local16 = (local27 & 0x7F | local16) << 7;
		}
		return local16 | local27;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(IB)V")
	public final void method1509(@OriginalArg(0) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
		this.aByteArray23[this.anInt2233++] = (byte) arg0;
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 24);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(B)I")
	public final int method1510() {
		this.anInt2233 += 4;
		return ((this.aByteArray23[this.anInt2233 - 3] & 0xFF) << 8) + ((this.aByteArray23[this.anInt2233 - 1] & 0xFF) << 24) + ((this.aByteArray23[this.anInt2233 - 2] & 0xFF) << 16) + (this.aByteArray23[this.anInt2233 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I")
	public final int method1511() {
		this.anInt2233 += 2;
		@Pc(34) int local34 = (this.aByteArray23[this.anInt2233 - 2] - 128 & 0xFF) + ((this.aByteArray23[this.anInt2233 - 1] & 0xFF) << 8);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)B")
	public final byte method1512() {
		return (byte) (128 - this.aByteArray23[this.anInt2233++]);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)I")
	public final int method1513() {
		this.anInt2233 += 4;
		return ((this.aByteArray23[this.anInt2233 - 1] & 0xFF) << 8) + ((this.aByteArray23[this.anInt2233 - 4] & 0xFF) << 16) + ((this.aByteArray23[this.anInt2233 + -3] & 0xFF) << 24) + (this.aByteArray23[this.anInt2233 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(IB)V")
	public final void method1514(@OriginalArg(0) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 16);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
		this.aByteArray23[this.anInt2233++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BII)V")
	public final void method1515(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray23[this.anInt2233++];
		}
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)I")
	public final int method1516() {
		return this.aByteArray23[this.anInt2233++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method1517(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2233;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt2233 = 0;
		this.method1515(local9, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2233 = 0;
		this.method1545(local31.length);
		this.method1527(local31, local31.length);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)V")
	public final void method1518(@OriginalArg(1) int arg0) {
		this.aByteArray23[this.anInt2233 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(B)B")
	public final byte method1520() {
		return (byte) -this.aByteArray23[this.anInt2233++];
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)B")
	public final byte method1521() {
		return (byte) (this.aByteArray23[this.anInt2233++] - 128);
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(IB)V")
	public final void method1522(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1545(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1501(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IJ)V")
	public final void method1523(@OriginalArg(1) long arg0) {
		this.method1536((int) (arg0 >> 32));
		this.method1536((int) arg0);
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)B")
	public final byte method1524() {
		return this.aByteArray23[this.anInt2233++];
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)V")
	public final void method1525(@OriginalArg(1) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 24);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 16);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
		this.aByteArray23[this.anInt2233++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(IB)V")
	public final void method1526(@OriginalArg(0) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I[BII)V")
	public final void method1527(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray23[this.anInt2233++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(II)V")
	public final void method1528(@OriginalArg(0) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)I")
	public final int method1529() {
		this.anInt2233 += 2;
		return ((this.aByteArray23[this.anInt2233 - 1] & 0xFF) << 8) + (this.aByteArray23[this.anInt2233 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(B)I")
	public final int method1530() {
		this.anInt2233 += 3;
		return (this.aByteArray23[this.anInt2233 - 1] & 0xFF) + ((this.aByteArray23[this.anInt2233 - 2] & 0xFF) << 8) + ((this.aByteArray23[this.anInt2233 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(II)V")
	public final void method1531(@OriginalArg(0) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 + 128);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(BI)V")
	public final void method1532(@OriginalArg(1) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "(I)I")
	public final int method1533() {
		return 128 - this.aByteArray23[this.anInt2233++] & 0xFF;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!vc;)V")
	public final void method1534(@OriginalArg(1) Class71 arg0) {
		this.anInt2233 += arg0.method1805(this.aByteArray23, arg0.method1784(), this.anInt2233);
		this.aByteArray23[this.anInt2233++] = 0;
	}

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "(I)I")
	public final int method1535() {
		@Pc(12) int local12 = this.aByteArray23[this.anInt2233] & 0xFF;
		return local12 < 128 ? this.method1546() : this.method1543() - 32768;
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(II)V")
	public final void method1536(@OriginalArg(0) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) arg0;
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 16);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "(I)J")
	public final long method1537() {
		@Pc(10) long local10 = (long) this.method1540() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method1540() & 0xFFFFFFFFL;
		return (local10 << 32) + local17;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)I")
	public final int method1538() {
		@Pc(7) int local7 = this.aByteArray23[this.anInt2233] & 0xFF;
		return local7 < 128 ? this.method1546() - 64 : this.method1543() + -49152;
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(B)I")
	public final int method1539() {
		this.anInt2233 += 2;
		return ((this.aByteArray23[this.anInt2233 - 1] & 0xFF) << 8) + (this.aByteArray23[this.anInt2233 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "(I)I")
	public final int method1540() {
		this.anInt2233 += 4;
		return ((this.aByteArray23[this.anInt2233 - 2] & 0xFF) << 8) + (this.aByteArray23[this.anInt2233 - 3] << 16 & 0xFF0000) + ((this.aByteArray23[this.anInt2233 + -4] & 0xFF) << 24) + (this.aByteArray23[this.anInt2233 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "(I)Lclient!vc;")
	public final Class71 method1541() {
		@Pc(11) int local11 = this.anInt2233;
		while (this.aByteArray23[this.anInt2233++] != 0) {
		}
		return Static54.method976(local11, this.aByteArray23, this.anInt2233 - local11 - 1);
	}

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "(I)I")
	public final int method1543() {
		this.anInt2233 += 2;
		return (this.aByteArray23[this.anInt2233 - 1] & 0xFF) + ((this.aByteArray23[this.anInt2233 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "(I)I")
	public final int method1544() {
		this.anInt2233 += 2;
		@Pc(38) int local38 = ((this.aByteArray23[this.anInt2233 - 2] & 0xFF) << 8) + (this.aByteArray23[this.anInt2233 - 1] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(II)V")
	public final void method1545(@OriginalArg(1) int arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "(I)I")
	public final int method1546() {
		return this.aByteArray23[this.anInt2233++] & 0xFF;
	}

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "(B)I")
	public final int method1547() {
		this.anInt2233 += 4;
		return (this.aByteArray23[this.anInt2233 - 3] & 0xFF) + ((this.aByteArray23[this.anInt2233 - 1] & 0xFF) << 16) + ((this.aByteArray23[this.anInt2233 + -2] & 0xFF) << 24) + ((this.aByteArray23[this.anInt2233 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZJ)V")
	public final void method1548(@OriginalArg(1) long arg0) {
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 56);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 48);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 40);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 32);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 24);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 16);
		this.aByteArray23[this.anInt2233++] = (byte) (arg0 >> 8);
		this.aByteArray23[this.anInt2233++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "(I)I")
	public final int method1549() {
		this.anInt2233 += 2;
		return ((this.aByteArray23[this.anInt2233 - 2] & 0xFF) << 8) + (this.aByteArray23[this.anInt2233 - 1] - 128 & 0xFF);
	}
}
