import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
	public int anInt2704 = 0;

	@OriginalMember(owner = "client!kd", name = "Rb", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8(@OriginalArg(0) int arg0) {
		this.aByteArray26 = Static91.method1544(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray26 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public final void method1762(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 1436108328);
		this.aByteArray26[this.anInt2704++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V")
	public final void method1763(@OriginalArg(0) long arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 56);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 48);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 40);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 299629920);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2704++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)I")
	public final int method1764() {
		this.anInt2704 += 2;
		@Pc(42) int local42 = ((this.aByteArray26[this.anInt2704 - 2] & 0xFF) << 8) + (this.aByteArray26[this.anInt2704 - 1] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)B")
	public final byte method1765() {
		return this.aByteArray26[this.anInt2704++];
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BBII)V")
	public final void method1766(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(19) int local19 = arg1 - 1; local19 >= 0; local19--) {
			arg0[local19] = (byte) (this.aByteArray26[this.anInt2704++] - 128);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BZI)V")
	public final void method1767(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			arg0[local16] = this.aByteArray26[this.anInt2704++];
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I")
	public final int method1768() {
		this.anInt2704 += 4;
		return ((this.aByteArray26[this.anInt2704 - 1] & 0xFF) << 8) + (this.aByteArray26[this.anInt2704 - 3] << 24 & 0xFF000000) + ((this.aByteArray26[this.anInt2704 + -4] & 0xFF) << 16) + (this.aByteArray26[this.anInt2704 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)I")
	public final int method1769() {
		@Pc(16) int local16 = this.aByteArray26[this.anInt2704] & 0xFF;
		return local16 < 128 ? this.method1803() : this.method1789() - 32768;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)I")
	public final int method1770() {
		this.anInt2704 += 4;
		return ((this.aByteArray26[this.anInt2704 - 3] & 0xFF) << 16) + ((this.aByteArray26[this.anInt2704 - 4] << 24 & 0xFF000000) + (this.aByteArray26[this.anInt2704 - 2] << 8 & 0xFF00)) + (this.aByteArray26[this.anInt2704 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
	public final void method1771(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2704 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)I")
	public final int method1772() {
		this.anInt2704 += 4;
		return (this.aByteArray26[this.anInt2704 - 3] & 0xFF) + ((this.aByteArray26[this.anInt2704 - 4] & 0xFF) << 8) + ((this.aByteArray26[this.anInt2704 + -1] & 0xFF) << 16) + ((this.aByteArray26[this.anInt2704 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)Lclient!v;")
	public final Class62 method1773() {
		@Pc(2) int local2 = this.anInt2704;
		while (this.aByteArray26[this.anInt2704++] != 0) {
		}
		return Static77.method1255(this.anInt2704 - local2 - 1, this.aByteArray26, local2);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[B)V")
	public final void method1774(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray26[this.anInt2704++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)B")
	public final byte method1775() {
		return (byte) -this.aByteArray26[this.anInt2704++];
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(I)I")
	public final int method1777() {
		return 128 - this.aByteArray26[this.anInt2704++] & 0xFF;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)I")
	public final int method1778() {
		@Pc(7) int local7 = this.aByteArray26[this.anInt2704] & 0xFF;
		return local7 >= 128 ? this.method1789() - 49152 : this.method1803() + -64;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!v;)V")
	public final void method1779(@OriginalArg(1) Class62 arg0) {
		this.anInt2704 += arg0.method1686(this.aByteArray26, arg0.method1688(), this.anInt2704);
		this.aByteArray26[this.anInt2704++] = 0;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)I")
	public final int method1780() {
		return -this.aByteArray26[this.anInt2704++] & 0xFF;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[IB)V")
	public final void method1781(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt2704;
		this.anInt2704 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(33) int local33 = this.method1770();
			@Pc(37) int local37 = this.method1770();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= arg1[local39 >>> 11 & 0x20800003] + local39 ^ (local33 >>> 5 ^ local33 << 4) + local33;
				local39 -= -1640531527;
				local33 -= (local37 << 4 ^ local37 >>> 5) + local37 ^ local39 - -arg1[local39 & 0x3];
			}
			this.anInt2704 -= 8;
			this.method1792(local33);
			this.method1792(local37);
		}
		this.anInt2704 = local8;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public final void method1782(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2704++] = (byte) arg0;
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(I)I")
	public final int method1784() {
		this.anInt2704 += 2;
		@Pc(32) int local32 = (this.aByteArray26[this.anInt2704 - 1] & 0xFF) + ((this.aByteArray26[this.anInt2704 - 2] & 0xFF) << 8);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)I")
	public final int method1785() {
		this.anInt2704 += 2;
		return ((this.aByteArray26[this.anInt2704 - 2] & 0xFF) << 8) + (this.aByteArray26[this.anInt2704 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "(I)I")
	public final int method1786() {
		this.anInt2704 += 3;
		return ((this.aByteArray26[this.anInt2704 - 3] & 0xFF) << 16) + ((this.aByteArray26[this.anInt2704 - 2] & 0xFF) << 8) + (this.aByteArray26[this.anInt2704 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(BI)V")
	public final void method1787(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt2704++] = (byte) arg0;
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "(I)I")
	public final int method1788() {
		this.anInt2704 += 2;
		@Pc(33) int local33 = (this.aByteArray26[this.anInt2704 - 2] - 128 & 0xFF) + ((this.aByteArray26[this.anInt2704 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)I")
	public final int method1789() {
		this.anInt2704 += 2;
		return ((this.aByteArray26[this.anInt2704 - 2] & 0xFF) << 8) + (this.aByteArray26[this.anInt2704 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)V")
	public final void method1790(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1806(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1762(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "(I)I")
	public final int method1791() {
		this.anInt2704 += 2;
		return (this.aByteArray26[this.anInt2704 - 2] - 128 & 0xFF) + ((this.aByteArray26[this.anInt2704 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(BI)V")
	public final void method1792(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 24);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2704++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)J")
	public final long method1793() {
		@Pc(13) long local13 = (long) this.method1770() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1770() & 0xFFFFFFFFL;
		return (local13 << 32) + local24;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	public final void method1794(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2704++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V")
	public final void method1795(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "(I)I")
	public final int method1796() {
		this.anInt2704 += 4;
		return ((this.aByteArray26[this.anInt2704 - 3] & 0xFF) << 8) + ((this.aByteArray26[this.anInt2704 - 1] & 0xFF) << 24) + ((this.aByteArray26[this.anInt2704 + -2] & 0xFF) << 16) + (this.aByteArray26[this.anInt2704 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "(I)B")
	public final byte method1797() {
		return (byte) (128 - this.aByteArray26[this.anInt2704++]);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V")
	public final void method1798(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public final void method1801(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) arg0;
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 8);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 16);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(BI)V")
	public final void method1802(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) arg0;
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "(I)I")
	public final int method1803() {
		return this.aByteArray26[this.anInt2704++] & 0xFF;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)V")
	public final void method1804(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 1198495528);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(II)V")
	public final void method1806(@OriginalArg(1) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)I")
	public final int method1807() {
		this.anInt2704 += 2;
		return ((this.aByteArray26[this.anInt2704 - 1] & 0xFF) << 8) + (this.aByteArray26[this.anInt2704 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)V")
	public final void method1808(@OriginalArg(0) int arg0) {
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 + 128);
		this.aByteArray26[this.anInt2704++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(B)I")
	public final int method1810() {
		@Pc(23) byte local23 = this.aByteArray26[this.anInt2704++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local25 | local23 & 0x7F) << 7;
			local23 = this.aByteArray26[this.anInt2704++];
		}
		return local23 | local25;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(II)I")
	public final int method1811(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static6.method167(arg0, this.aByteArray26, this.anInt2704);
		this.method1792(local16);
		return local16;
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(B)I")
	public final int method1812() {
		this.anInt2704 += 3;
		return (this.aByteArray26[this.anInt2704 - 3] & 0xFF) + ((this.aByteArray26[this.anInt2704 - 2] & 0xFF) << 8) + ((this.aByteArray26[this.anInt2704 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(B)I")
	public final int method1813() {
		return this.aByteArray26[this.anInt2704++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1814(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2704;
		this.anInt2704 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1767(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2704 = 0;
		this.method1806(local31.length);
		this.method1774(local31.length, local31);
	}
}
