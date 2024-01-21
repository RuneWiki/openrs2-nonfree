import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
	public int anInt2154 = 0;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13(@OriginalArg(0) int arg0) {
		this.aByteArray14 = Static69.method1103(arg0);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
	public Class2_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray14 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)B")
	public final byte method1394() {
		return this.aByteArray14[this.anInt2154++];
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
	public final int method1395() {
		this.anInt2154 += 4;
		return ((this.aByteArray14[this.anInt2154 - 4] & 0xFF) << 8) + (((this.aByteArray14[this.anInt2154 - 2] & 0xFF) << 24) + ((this.aByteArray14[this.anInt2154 - 1] & 0xFF) << 16)) + (this.aByteArray14[this.anInt2154 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
	public final int method1396() {
		this.anInt2154 += 4;
		return (this.aByteArray14[this.anInt2154 - 1] & 0xFF) + ((this.aByteArray14[this.anInt2154 - 3] & 0xFF) << 16) + ((this.aByteArray14[this.anInt2154 + -4] & 0xFF) << 24) + ((this.aByteArray14[this.anInt2154 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)I")
	public final int method1397() {
		this.anInt2154 += 2;
		return ((this.aByteArray14[this.anInt2154 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt2154 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Lclient!ai;")
	public final Class6 method1399() {
		@Pc(14) int local14 = this.anInt2154;
		while (this.aByteArray14[this.anInt2154++] != 0) {
		}
		return Static173.method2732(local14, this.aByteArray14, this.anInt2154 - local14 - 1);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)I")
	public final int method1400() {
		this.anInt2154 += 2;
		@Pc(32) int local32 = ((this.aByteArray14[this.anInt2154 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt2154 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)V")
	public final void method1401(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1416(arg0 >>> 28 | 0x80);
					}
					this.method1416(arg0 >>> 21 | 0x80);
				}
				this.method1416(arg0 >>> 14 | 0x80);
			}
			this.method1416(arg0 >>> 7 | 0x80);
		}
		this.method1416(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(Z)I")
	public final int method1402() {
		return this.aByteArray14[this.anInt2154++] & 0xFF;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
	public final void method1403(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) arg0;
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!ai;)V")
	public final void method1404(@OriginalArg(1) Class6 arg0) {
		this.anInt2154 += arg0.method109(arg0.method107(), this.anInt2154, this.aByteArray14);
		this.aByteArray14[this.anInt2154++] = 0;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)I")
	public final int method1405() {
		this.anInt2154 += 3;
		return ((this.aByteArray14[this.anInt2154 - 2] & 0xFF) << 16) + ((this.aByteArray14[this.anInt2154 - 3] & 0xFF) << 8) + (this.aByteArray14[this.anInt2154 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)I")
	public final int method1406() {
		this.anInt2154 += 3;
		return (this.aByteArray14[this.anInt2154 - 1] & 0xFF) + (((this.aByteArray14[this.anInt2154 - 3] & 0xFF) << 16) + ((this.aByteArray14[this.anInt2154 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	public final void method1408(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)I")
	public final int method1409() {
		return -this.aByteArray14[this.anInt2154++] & 0xFF;
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(I)I")
	public final int method1410() {
		this.anInt2154 += 2;
		return (this.aByteArray14[this.anInt2154 - 1] - 128 & 0xFF) + ((this.aByteArray14[this.anInt2154 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I[BIB)V")
	public final void method1411(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			arg1[local8] = this.aByteArray14[this.anInt2154++];
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(Z)B")
	public final byte method1412() {
		return (byte) -this.aByteArray14[this.anInt2154++];
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)I")
	public final int method1414(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static1.method1(this.aByteArray14, arg0, this.anInt2154);
		this.method1421(local7);
		return local7;
	}

	@OriginalMember(owner = "client!me", name = "i", descriptor = "(I)I")
	public final int method1415() {
		this.anInt2154 += 2;
		return ((this.aByteArray14[this.anInt2154 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt2154 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(II)V")
	public final void method1416(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(JI)V")
	public final void method1418(@OriginalArg(0) long arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 56);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 48);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 40);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 32);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt2154++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!me", name = "j", descriptor = "(I)I")
	public final int method1419() {
		this.anInt2154 += 2;
		@Pc(28) int local28 = ((this.aByteArray14[this.anInt2154 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt2154 - 2] & 0xFF);
		if (local28 > 32767) {
			local28 -= 65536;
		}
		return local28;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BII[B)V")
	public final void method1420(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			this.aByteArray14[this.anInt2154++] = arg1[local8];
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(IB)V")
	public final void method1421(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt2154++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!me", name = "k", descriptor = "(I)B")
	public final byte method1422() {
		return (byte) (this.aByteArray14[this.anInt2154++] - 128);
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(II)V")
	public final void method1423(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt2154 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt2154 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt2154 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt2154 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(IB)V")
	public final void method1424(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt2154 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!me", name = "l", descriptor = "(I)I")
	public final int method1425() {
		this.anInt2154 += 4;
		return (this.aByteArray14[this.anInt2154 - 4] & 0xFF) + (((this.aByteArray14[this.anInt2154 - 3] & 0xFF) << 8) + ((this.aByteArray14[this.anInt2154 - 1] & 0xFF) << 24) + ((this.aByteArray14[this.anInt2154 + -2] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
	public final void method1426(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) arg0;
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(Z)I")
	public final int method1427() {
		@Pc(17) byte local17 = this.aByteArray14[this.anInt2154++];
		@Pc(23) int local23 = 0;
		while (local17 < 0) {
			local23 = (local17 & 0x7F | local23) << 7;
			local17 = this.aByteArray14[this.anInt2154++];
		}
		return local23 | local17;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(II)V")
	public final void method1428(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt2154++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(B)I")
	public final int method1429() {
		@Pc(16) int local16 = this.aByteArray14[this.anInt2154] & 0xFF;
		return local16 < 128 ? this.method1402() - 64 : this.method1397() + -49152;
	}

	@OriginalMember(owner = "client!me", name = "m", descriptor = "(I)I")
	public final int method1430() {
		this.anInt2154 += 2;
		return ((this.aByteArray14[this.anInt2154 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt2154 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(II)V")
	public final void method1431(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!me", name = "n", descriptor = "(I)I")
	public final int method1432() {
		this.anInt2154 += 4;
		return ((this.aByteArray14[this.anInt2154 - 1] & 0xFF) << 8) + ((this.aByteArray14[this.anInt2154 - 3] & 0xFF) << 24) + ((this.aByteArray14[this.anInt2154 + -4] & 0xFF) << 16) + (this.aByteArray14[this.anInt2154 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([IIII)V")
	public final void method1433(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt2154;
		this.anInt2154 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(34) int local34 = this.method1396();
			@Pc(38) int local38 = this.method1396();
			@Pc(40) int local40 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local38 -= arg0[local40 >>> 11 & 0x3] + local40 ^ (local34 << 4 ^ local34 >>> 5) - -local34;
				local40 -= -1640531527;
				local34 -= arg0[local40 & 0x3] + local40 ^ (local38 >>> 5 ^ local38 << 4) + local38;
			}
			this.anInt2154 -= 8;
			this.method1421(local34);
			this.method1421(local38);
		}
		this.anInt2154 = local8;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(JI)V")
	public final void method1434(@OriginalArg(0) long arg0) {
		this.method1443((int) (arg0 >> 32));
		this.method1443((int) arg0);
	}

	@OriginalMember(owner = "client!me", name = "o", descriptor = "(I)I")
	public final int method1436() {
		return this.aByteArray14[this.anInt2154++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(BI)V")
	public final void method1437(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt2154++] = (byte) arg0;
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method1438(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt2154;
		this.anInt2154 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method1411(local2, local12);
		@Pc(31) BigInteger local31 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local31.modPow(arg0, arg1);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt2154 = 0;
		this.method1416(local39.length);
		this.method1420(local39.length, local39);
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(B)I")
	public final int method1439() {
		@Pc(16) int local16 = this.aByteArray14[this.anInt2154] & 0xFF;
		return local16 < 128 ? this.method1402() : this.method1397() - 32768;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(IB)V")
	public final void method1440(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt2154++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!me", name = "p", descriptor = "(I)I")
	public final int method1441() {
		return 128 - this.aByteArray14[this.anInt2154++] & 0xFF;
	}

	@OriginalMember(owner = "client!me", name = "h", descriptor = "(II)V")
	public final void method1442(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!me", name = "i", descriptor = "(II)V")
	public final void method1443(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt2154++] = (byte) arg0;
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!me", name = "j", descriptor = "(II)V")
	public final void method1444(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1416(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1428(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(Z)Lclient!ai;")
	public final Class6 method1445() {
		if (this.aByteArray14[this.anInt2154] == 0) {
			this.anInt2154++;
			return null;
		} else {
			return this.method1399();
		}
	}

	@OriginalMember(owner = "client!me", name = "q", descriptor = "(I)J")
	public final long method1446() {
		@Pc(11) long local11 = (long) this.method1396() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1396() & 0xFFFFFFFFL;
		return local22 + (local11 << 32);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
	public final void method1447(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 + 128);
		this.aByteArray14[this.anInt2154++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB[B)V")
	public final void method1448(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = (byte) (this.aByteArray14[this.anInt2154++] - 128);
		}
	}
}
