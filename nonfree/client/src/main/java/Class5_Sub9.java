import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!hb", name = "Bb", descriptor = "I")
	public int anInt2140;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V")
	public Class5_Sub9(@OriginalArg(0) int arg0) {
		this.aByteArray28 = Static37.method790(arg0);
		this.anInt2140 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([B)V")
	public Class5_Sub9(@OriginalArg(0) byte[] arg0) {
		this.anInt2140 = 0;
		this.aByteArray28 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public final void method1398(@OriginalArg(0) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) arg0;
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 8);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 16);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	public final void method1399(@OriginalArg(0) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) arg0;
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)I")
	public final int method1400() {
		return this.aByteArray28[this.anInt2140++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)I")
	public final int method1401() {
		return -this.aByteArray28[this.anInt2140++] & 0xFF;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!mb;)V")
	public final void method1402(@OriginalArg(1) Class45 arg0) {
		this.anInt2140 += arg0.method1298(arg0.method1317(), this.aByteArray28, this.anInt2140);
		this.aByteArray28[this.anInt2140++] = 0;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(Z)I")
	public final int method1404() {
		this.anInt2140 += 4;
		return (this.aByteArray28[this.anInt2140 - 2] & 0xFF) + ((this.aByteArray28[this.anInt2140 - 1] & 0xFF) << 8) + ((this.aByteArray28[this.anInt2140 + -3] & 0xFF) << 24) + ((this.aByteArray28[this.anInt2140 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)I")
	public final int method1405() {
		this.anInt2140 += 3;
		return (this.aByteArray28[this.anInt2140 - 3] & 0xFF) + ((this.aByteArray28[this.anInt2140 - 2] & 0xFF) << 8) + ((this.aByteArray28[this.anInt2140 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)I")
	public final int method1406() {
		@Pc(21) byte local21 = this.aByteArray28[this.anInt2140++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray28[this.anInt2140++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)I")
	public final int method1407() {
		this.anInt2140 += 2;
		@Pc(31) int local31 = (this.aByteArray28[this.anInt2140 - 2] & 0xFF) + ((this.aByteArray28[this.anInt2140 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)I")
	public final int method1408() {
		return this.aByteArray28[this.anInt2140++] & 0xFF;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)I")
	public final int method1409() {
		this.anInt2140 += 3;
		return ((this.aByteArray28[this.anInt2140 - 2] & 0xFF) << 8) + ((this.aByteArray28[this.anInt2140 - 3] & 0xFF) << 16) + (this.aByteArray28[this.anInt2140 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(B)I")
	public final int method1410() {
		this.anInt2140 += 2;
		@Pc(38) int local38 = (this.aByteArray28[this.anInt2140 - 1] & 0xFF) + ((this.aByteArray28[this.anInt2140 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIB)V")
	public final void method1411(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = this.anInt2140;
		this.anInt2140 = 5;
		@Pc(21) int local21 = (arg1 - 5) / 8;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(28) int local28 = this.method1434();
			@Pc(32) int local32 = this.method1434();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= local28 + (local28 << 4 ^ local28 >>> 5) ^ arg0[local34 >>> 11 & 0x3] + local34;
				local34 -= -1640531527;
				local28 -= (local32 >>> 5 ^ local32 << 4) + local32 ^ local34 + arg0[local34 & 0x3];
			}
			this.anInt2140 -= 8;
			this.method1413(local28);
			this.method1413(local32);
		}
		this.anInt2140 = local7;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
	public final void method1413(@OriginalArg(1) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 24);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 16);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 8);
		this.aByteArray28[this.anInt2140++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1414(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2140;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt2140 = 0;
		this.method1433(local9, local6);
		@Pc(31) BigInteger local31 = new BigInteger(local9);
		@Pc(36) BigInteger local36 = local31.modPow(arg1, arg0);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt2140 = 0;
		this.method1428(local39.length);
		this.method1416(local39.length, local39);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
	public final void method1415(@OriginalArg(1) int arg0) {
		this.aByteArray28[this.anInt2140 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray28[this.anInt2140 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray28[this.anInt2140 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray28[this.anInt2140 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II[BB)V")
	public final void method1416(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray28[this.anInt2140++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(I)I")
	public final int method1417() {
		@Pc(11) int local11 = this.aByteArray28[this.anInt2140] & 0xFF;
		return local11 < 128 ? this.method1408() : this.method1418() - 32768;
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "(I)I")
	public final int method1418() {
		this.anInt2140 += 2;
		return (this.aByteArray28[this.anInt2140 - 1] & 0xFF) + ((this.aByteArray28[this.anInt2140 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BIZI)V")
	public final void method1419(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray28[this.anInt2140++] - 128);
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)V")
	public final void method1420(@OriginalArg(0) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(II)V")
	public final void method1421(@OriginalArg(1) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 16);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 8);
		this.aByteArray28[this.anInt2140++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IB)V")
	public final void method1423(@OriginalArg(0) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 16);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 24);
		this.aByteArray28[this.anInt2140++] = (byte) arg0;
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(IB)V")
	public final void method1424(@OriginalArg(0) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 8);
		this.aByteArray28[this.anInt2140++] = (byte) arg0;
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 24);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(II)V")
	public final void method1425(@OriginalArg(1) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(II)V")
	public final void method1426(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1428(arg0 >>> 28 | 0x80);
					}
					this.method1428(arg0 >>> 21 | 0x80);
				}
				this.method1428(arg0 >>> 14 | 0x80);
			}
			this.method1428(arg0 >>> 7 | 0x80);
		}
		this.method1428(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "(I)I")
	public final int method1427() {
		this.anInt2140 += 4;
		return ((this.aByteArray28[this.anInt2140 - 1] & 0xFF) << 24) - (-((this.aByteArray28[this.anInt2140 - 2] & 0xFF) << 16) - ((this.aByteArray28[this.anInt2140 - 3] & 0xFF) << 8) - (this.aByteArray28[this.anInt2140 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(II)V")
	public final void method1428(@OriginalArg(0) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)V")
	public final void method1430(@OriginalArg(1) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 + 128);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(IB)V")
	public final void method1431(@OriginalArg(0) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)V")
	public final void method1432(@OriginalArg(1) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 8);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[BII)V")
	public final void method1433(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = this.aByteArray28[this.anInt2140++];
		}
	}

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "(I)I")
	public final int method1434() {
		this.anInt2140 += 4;
		return ((this.aByteArray28[this.anInt2140 - 2] & 0xFF) << 8) + ((this.aByteArray28[this.anInt2140 - 3] & 0xFF) << 16) + ((this.aByteArray28[this.anInt2140 + -4] & 0xFF) << 24) + (this.aByteArray28[this.anInt2140 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(B)I")
	public final int method1435() {
		this.anInt2140 += 2;
		return ((this.aByteArray28[this.anInt2140 - 1] & 0xFF) << 8) + (this.aByteArray28[this.anInt2140 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(Z)J")
	public final long method1436() {
		@Pc(10) long local10 = (long) this.method1434() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1434() & 0xFFFFFFFFL;
		return (local10 << 32) + local24;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(BI)I")
	public final int method1437(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static3.method68(this.anInt2140, this.aByteArray28, arg0);
		this.method1413(local11);
		return local11;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(BI)V")
	public final void method1439(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1428(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1455(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(IB)V")
	public final void method1440(@OriginalArg(0) int arg0) {
		this.aByteArray28[this.anInt2140 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "(I)I")
	public final int method1442() {
		this.anInt2140 += 4;
		return (this.aByteArray28[this.anInt2140 - 3] & 0xFF) + ((this.aByteArray28[this.anInt2140 - 4] & 0xFF) << 8) + ((this.aByteArray28[this.anInt2140 + -1] & 0xFF) << 16) + ((this.aByteArray28[this.anInt2140 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(B)I")
	public final int method1444() {
		this.anInt2140 += 2;
		return ((this.aByteArray28[this.anInt2140 - 1] & 0xFF) << 8) + (this.aByteArray28[this.anInt2140 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "(I)I")
	public final int method1445() {
		@Pc(16) int local16 = this.aByteArray28[this.anInt2140] & 0xFF;
		return local16 < 128 ? this.method1408() - 64 : this.method1418() + -49152;
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(B)I")
	public final int method1446() {
		return 128 - this.aByteArray28[this.anInt2140++] & 0xFF;
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "(B)B")
	public final byte method1447() {
		return this.aByteArray28[this.anInt2140++];
	}

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "(I)Lclient!mb;")
	public final Class45 method1448() {
		@Pc(2) int local2 = this.anInt2140;
		while (this.aByteArray28[this.anInt2140++] != 0) {
		}
		return Static111.method1988(this.anInt2140 - local2 - 1, local2, this.aByteArray28);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IJ)V")
	public final void method1449(@OriginalArg(1) long arg0) {
		this.method1398((int) (arg0 >> 32));
		this.method1398((int) arg0);
	}

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "(I)I")
	public final int method1450() {
		this.anInt2140 += 2;
		@Pc(34) int local34 = ((this.aByteArray28[this.anInt2140 - 1] & 0xFF) << 8) + (this.aByteArray28[this.anInt2140 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "(I)B")
	public final byte method1451() {
		return (byte) (this.aByteArray28[this.anInt2140++] - 128);
	}

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "(I)I")
	public final int method1452() {
		this.anInt2140 += 2;
		return ((this.aByteArray28[this.anInt2140 - 2] & 0xFF) << 8) + (this.aByteArray28[this.anInt2140 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "(I)B")
	public final byte method1453() {
		return (byte) -this.aByteArray28[this.anInt2140++];
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(ZJ)V")
	public final void method1454(@OriginalArg(1) long arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 56);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 48);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 40);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 32);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 24);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 16);
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> 8);
		this.aByteArray28[this.anInt2140++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(II)V")
	public final void method1455(@OriginalArg(0) int arg0) {
		this.aByteArray28[this.anInt2140++] = (byte) (arg0 >> -868202776);
		this.aByteArray28[this.anInt2140++] = (byte) arg0;
	}
}
