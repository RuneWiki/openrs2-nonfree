import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!va", name = "wb", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!va", name = "vb", descriptor = "I")
	public int anInt2077;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray24 = Static1.method4(arg0);
		this.anInt2077 = 0;
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "([B)V")
	public Class2_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray24 = arg0;
		this.anInt2077 = 0;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I")
	public final int method1435() {
		this.anInt2077 += 4;
		return (this.aByteArray24[this.anInt2077 - 3] & 0xFF) + ((this.aByteArray24[this.anInt2077 - 1] & 0xFF) << 16) + ((this.aByteArray24[this.anInt2077 + -2] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2077 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I")
	public final int method1436() {
		this.anInt2077 += 3;
		return ((this.aByteArray24[this.anInt2077 - 2] & 0xFF) << 8) + (((this.aByteArray24[this.anInt2077 - 3] & 0xFF) << 16) + (this.aByteArray24[this.anInt2077 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)I")
	public final int method1437() {
		@Pc(21) byte local21 = this.aByteArray24[this.anInt2077++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray24[this.anInt2077++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)B")
	public final byte method1438() {
		return (byte) (128 - this.aByteArray24[this.anInt2077++]);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
	public final void method1439(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IJ)V")
	public final void method1440(@OriginalArg(1) long arg0) {
		this.method1453((int) (arg0 >> 32));
		this.method1453((int) arg0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BII)V")
	public final void method1441(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray24[this.anInt2077++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	public final void method1442(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)I")
	public final int method1443() {
		this.anInt2077 += 2;
		return (this.aByteArray24[this.anInt2077 - 1] - 128 & 0xFF) + ((this.aByteArray24[this.anInt2077 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(I)I")
	public final int method1444() {
		this.anInt2077 += 2;
		@Pc(30) int local30 = ((this.aByteArray24[this.anInt2077 - 1] & 0xFF) << 8) + (this.aByteArray24[this.anInt2077 - 2] - 128 & 0xFF);
		if (local30 > 32767) {
			local30 -= 65536;
		}
		return local30;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
	public final void method1445(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2077++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!va", name = "h", descriptor = "(I)I")
	public final int method1446() {
		this.anInt2077 += 2;
		@Pc(32) int local32 = (this.aByteArray24[this.anInt2077 - 2] & 0xFF) + ((this.aByteArray24[this.anInt2077 - 1] & 0xFF) << 8);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III[I)V")
	public final void method1447(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(16) int local16 = (arg0 - 5) / 8;
		@Pc(19) int local19 = this.anInt2077;
		this.anInt2077 = 5;
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			@Pc(30) int local30 = this.method1449();
			@Pc(36) int local36 = this.method1449();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= local30 + (local30 >>> 5 ^ local30 << 4) ^ local38 + arg1[local38 >>> 11 & 0xF2A00003];
				local38 -= -1640531527;
				local30 -= local36 + (local36 << 4 ^ local36 >>> 5) ^ arg1[local38 & 0x3] + local38;
			}
			this.anInt2077 -= 8;
			this.method1445(local30);
			this.method1445(local36);
		}
		this.anInt2077 = local19;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(II)I")
	public final int method1448(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static14.method224(arg0, this.aByteArray24, this.anInt2077);
		this.method1445(local16);
		return local16;
	}

	@OriginalMember(owner = "client!va", name = "i", descriptor = "(I)I")
	public final int method1449() {
		this.anInt2077 += 4;
		return ((this.aByteArray24[this.anInt2077 - 3] & 0xFF) << 16) + (this.aByteArray24[this.anInt2077 - 4] << 24 & 0xFF000000) + ((this.aByteArray24[this.anInt2077 + -2] & 0xFF) << 8) + (this.aByteArray24[this.anInt2077 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!cd;B)V")
	public final void method1450(@OriginalArg(0) Class10 arg0) {
		this.anInt2077 += arg0.method355(this.aByteArray24, arg0.method340(), this.anInt2077);
		this.aByteArray24[this.anInt2077++] = 0;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(II)V")
	public final void method1451(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1439(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1479(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)Lclient!cd;")
	public final Class10 method1452() {
		@Pc(2) int local2 = this.anInt2077;
		while (this.aByteArray24[this.anInt2077++] != 0) {
		}
		return Static54.method982(this.anInt2077 - local2 - 1, local2, this.aByteArray24);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(IB)V")
	public final void method1453(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) arg0;
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!va", name = "j", descriptor = "(I)I")
	public final int method1454() {
		this.anInt2077 += 4;
		return (this.aByteArray24[this.anInt2077 - 4] & 0xFF) + ((this.aByteArray24[this.anInt2077 - 3] & 0xFF) << 8) + ((this.aByteArray24[this.anInt2077 + -2] & 0xFF) << 16) + ((this.aByteArray24[this.anInt2077 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)I")
	public final int method1455() {
		this.anInt2077 += 2;
		@Pc(31) int local31 = ((this.aByteArray24[this.anInt2077 - 2] & 0xFF) << 8) + (this.aByteArray24[this.anInt2077 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!va", name = "k", descriptor = "(I)I")
	public final int method1456() {
		this.anInt2077 += 2;
		return (this.aByteArray24[this.anInt2077 - 1] & 0xFF) + ((this.aByteArray24[this.anInt2077 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(II)V")
	public final void method1457(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 + 128);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(JI)V")
	public final void method1458(@OriginalArg(0) long arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 56);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 48);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 40);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 32);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2077++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!va", name = "l", descriptor = "(I)I")
	public final int method1459() {
		this.anInt2077 += 2;
		return ((this.aByteArray24[this.anInt2077 - 1] & 0xFF) << 8) + (this.aByteArray24[this.anInt2077 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(Z)I")
	public final int method1460() {
		return -this.aByteArray24[this.anInt2077++] & 0xFF;
	}

	@OriginalMember(owner = "client!va", name = "m", descriptor = "(I)I")
	public final int method1461() {
		return this.aByteArray24[this.anInt2077++] & 0xFF;
	}

	@OriginalMember(owner = "client!va", name = "n", descriptor = "(I)I")
	public final int method1462() {
		return 128 - this.aByteArray24[this.anInt2077++] & 0xFF;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(Z)B")
	public final byte method1463() {
		return this.aByteArray24[this.anInt2077++];
	}

	@OriginalMember(owner = "client!va", name = "o", descriptor = "(I)I")
	public final int method1464() {
		@Pc(11) int local11 = this.aByteArray24[this.anInt2077] & 0xFF;
		return local11 >= 128 ? this.method1456() - 49152 : this.method1461() - 64;
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(II)V")
	public final void method1465(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)I")
	public final int method1466() {
		return this.aByteArray24[this.anInt2077++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(II)V")
	public final void method1467(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2077 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2077 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2077 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2077 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1468(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt2077;
		@Pc(5) byte[] local5 = new byte[local2];
		this.anInt2077 = 0;
		this.method1473(local2, local5);
		@Pc(23) BigInteger local23 = new BigInteger(local5);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2077 = 0;
		this.method1439(local31.length);
		this.method1441(local31.length, local31);
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(Z)I")
	public final int method1469() {
		@Pc(17) int local17 = this.aByteArray24[this.anInt2077] & 0xFF;
		return local17 < 128 ? this.method1461() : this.method1456() - 32768;
	}

	@OriginalMember(owner = "client!va", name = "h", descriptor = "(II)V")
	public final void method1470(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2077++] = (byte) arg0;
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(IB)V")
	public final void method1472(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1439(arg0 >>> 28 | 0x80);
					}
					this.method1439(arg0 >>> 21 | 0x80);
				}
				this.method1439(arg0 >>> 14 | 0x80);
			}
			this.method1439(arg0 >>> 7 | 0x80);
		}
		this.method1439(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III[B)V")
	public final void method1473(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray24[this.anInt2077++];
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
	public final void method1474(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) arg0;
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(B)I")
	public final int method1475() {
		this.anInt2077 += 2;
		return (this.aByteArray24[this.anInt2077 - 2] - 128 & 0xFF) + ((this.aByteArray24[this.anInt2077 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!va", name = "p", descriptor = "(I)J")
	public final long method1476() {
		@Pc(17) long local17 = (long) this.method1449() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1449() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
	public final void method1478(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2077++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(BI)V")
	public final void method1479(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2077++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	public final void method1480(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIB[B)V")
	public final void method1482(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			arg1[local12] = (byte) (this.aByteArray24[this.anInt2077++] - 128);
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(B)I")
	public final int method1483() {
		this.anInt2077 += 3;
		return (this.aByteArray24[this.anInt2077 - 1] & 0xFF) + ((this.aByteArray24[this.anInt2077 - 2] & 0xFF) << 16) + ((this.aByteArray24[this.anInt2077 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(IZ)V")
	public final void method1484(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!va", name = "i", descriptor = "(II)V")
	public final void method1485(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2077++] = (byte) arg0;
		this.aByteArray24[this.anInt2077++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(B)Lclient!cd;")
	public final Class10 method1486() {
		if (this.aByteArray24[this.anInt2077] == 0) {
			this.anInt2077++;
			return null;
		} else {
			return this.method1452();
		}
	}

	@OriginalMember(owner = "client!va", name = "q", descriptor = "(I)B")
	public final byte method1487() {
		return (byte) -this.aByteArray24[this.anInt2077++];
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II[BI)V")
	public final void method1488(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(17) int local17 = arg1 - 1; local17 >= 0; local17--) {
			arg0[local17] = this.aByteArray24[this.anInt2077++];
		}
	}

	@OriginalMember(owner = "client!va", name = "r", descriptor = "(I)I")
	public final int method1489() {
		this.anInt2077 += 4;
		return ((this.aByteArray24[this.anInt2077 - 4] & 0xFF) << 16) + (((this.aByteArray24[this.anInt2077 - 3] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2077 - 1] & 0xFF) << 8)) + (this.aByteArray24[this.anInt2077 + -2] & 0xFF);
	}
}
