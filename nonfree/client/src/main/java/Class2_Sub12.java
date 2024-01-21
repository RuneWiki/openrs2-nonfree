import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	public int anInt1939 = 0;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class2_Sub12(@OriginalArg(0) int arg0) {
		this.aByteArray20 = Static78.method1477(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
	public final int method1366() {
		this.anInt1939 += 2;
		return ((this.aByteArray20[this.anInt1939 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1939 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)I")
	public final int method1367() {
		this.anInt1939 += 4;
		return ((this.aByteArray20[this.anInt1939 - 1] & 0xFF) << 8) + ((this.aByteArray20[this.anInt1939 - 3] & 0xFF) << 24) + ((this.aByteArray20[this.anInt1939 - 4] & 0xFF) << 16) + (this.aByteArray20[this.anInt1939 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III[B)V")
	public final void method1368(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = this.aByteArray20[this.anInt1939++];
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZ[I)V")
	public final void method1369(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(10) int local10 = this.anInt1939;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		this.anInt1939 = 5;
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			@Pc(27) int local27 = this.method1412();
			@Pc(31) int local31 = this.method1412();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= (local27 << 4 ^ local27 >>> 5) + local27 ^ arg1[local33 >>> 11 & 0x8A00003] + local33;
				local33 -= -1640531527;
				local27 -= (local31 << 4 ^ local31 >>> 5) + local31 ^ local33 - -arg1[local33 & 0x3];
			}
			this.anInt1939 -= 8;
			this.method1394(local27);
			this.method1394(local31);
		}
		this.anInt1939 = local10;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III[B)V")
	public final void method1371(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (this.aByteArray20[this.anInt1939++] - 128);
		}
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)I")
	public final int method1372() {
		this.anInt1939 += 4;
		return ((this.aByteArray20[this.anInt1939 - 1] & 0xFF) << 24) + ((this.aByteArray20[this.anInt1939 - 2] & 0xFF) << 16) + ((this.aByteArray20[this.anInt1939 + -3] & 0xFF) << 8) + (this.aByteArray20[this.anInt1939 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	public final void method1373(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> -106701336);
		this.aByteArray20[this.anInt1939++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)I")
	public final int method1374() {
		this.anInt1939 += 3;
		return ((this.aByteArray20[this.anInt1939 - 1] & 0xFF) << 16) + ((this.aByteArray20[this.anInt1939 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1939 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
	public final void method1375(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1409(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1373(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)I")
	public final int method1376() {
		this.anInt1939 += 2;
		@Pc(41) int local41 = ((this.aByteArray20[this.anInt1939 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1939 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BJ)V")
	public final void method1377(@OriginalArg(1) long arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 56);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 48);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 40);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 32);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1939++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(I)I")
	public final int method1378() {
		this.anInt1939 += 2;
		return ((this.aByteArray20[this.anInt1939 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt1939 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	public final void method1379(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) arg0;
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V")
	public final void method1380(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1939++] = (byte) arg0;
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(BI)V")
	public final void method1381(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(I)I")
	public final int method1382() {
		return -this.aByteArray20[this.anInt1939++] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(II)V")
	public final void method1383(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!kc;)V")
	public final void method1384(@OriginalArg(1) Class36 arg0) {
		this.anInt1939 += arg0.method1007(arg0.method1028(), this.aByteArray20, this.anInt1939);
		this.aByteArray20[this.anInt1939++] = 0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)I")
	public final int method1385() {
		this.anInt1939 += 2;
		@Pc(36) int local36 = ((this.aByteArray20[this.anInt1939 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1939 - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "(I)B")
	public final byte method1387() {
		return (byte) (this.aByteArray20[this.anInt1939++] - 128);
	}

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "(I)I")
	public final int method1388() {
		return 128 - this.aByteArray20[this.anInt1939++] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "(I)J")
	public final long method1389() {
		@Pc(15) long local15 = (long) this.method1412() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1412() & 0xFFFFFFFFL;
		return (local15 << 32) + local24;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)V")
	public final void method1390(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1939++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)I")
	public final int method1391() {
		return this.aByteArray20[this.anInt1939++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(IB)V")
	public final void method1392(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 + 128);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(IB)I")
	public final int method1393(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static79.method1485(this.anInt1939, this.aByteArray20, arg0);
		this.method1394(local11);
		return local11;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(IB)V")
	public final void method1394(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1939++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)I")
	public final int method1395() {
		this.anInt1939 += 4;
		return ((this.aByteArray20[this.anInt1939 - 4] & 0xFF) << 8) + (this.aByteArray20[this.anInt1939 - 1] << 16 & 0xFF0000) + ((this.aByteArray20[this.anInt1939 + -2] & 0xFF) << 24) + (this.aByteArray20[this.anInt1939 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(II)V")
	public final void method1396(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I")
	public final int method1397() {
		@Pc(19) int local19 = this.aByteArray20[this.anInt1939] & 0xFF;
		return local19 >= 128 ? this.method1366() - 32768 : this.method1399();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1398(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1939;
		this.anInt1939 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1414(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt1939 = 0;
		this.method1409(local31.length);
		this.method1411(local31, local31.length);
	}

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "(I)I")
	public final int method1399() {
		return this.aByteArray20[this.anInt1939++] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)B")
	public final byte method1400() {
		return (byte) (128 - this.aByteArray20[this.anInt1939++]);
	}

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "(I)I")
	public final int method1401() {
		this.anInt1939 += 2;
		return (this.aByteArray20[this.anInt1939 - 2] - 128 & 0xFF) + ((this.aByteArray20[this.anInt1939 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(II)V")
	public final void method1402(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1939 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(II)V")
	public final void method1403(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1939++] = (byte) arg0;
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)Lclient!kc;")
	public final Class36 method1404() {
		@Pc(11) int local11 = this.anInt1939;
		while (this.aByteArray20[this.anInt1939++] != 0) {
		}
		return Static36.method737(local11, this.aByteArray20, this.anInt1939 - local11 - 1);
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(IB)V")
	public final void method1405(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) arg0;
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1939++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(B)B")
	public final byte method1406() {
		return this.aByteArray20[this.anInt1939++];
	}

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "(I)I")
	public final int method1407() {
		@Pc(11) int local11 = this.aByteArray20[this.anInt1939] & 0xFF;
		return local11 >= 128 ? this.method1366() - 49152 : this.method1399() + -64;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(Z)I")
	public final int method1408() {
		this.anInt1939 += 3;
		return ((this.aByteArray20[this.anInt1939 - 3] & 0xFF) << 16) + (((this.aByteArray20[this.anInt1939 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1939 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(BI)V")
	public final void method1409(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1939++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "(I)I")
	public final int method1410() {
		this.anInt1939 += 2;
		@Pc(31) int local31 = (this.aByteArray20[this.anInt1939 - 2] & 0xFF) + ((this.aByteArray20[this.anInt1939 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BI)V")
	public final void method1411(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray20[this.anInt1939++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "(I)I")
	public final int method1412() {
		this.anInt1939 += 4;
		return (this.aByteArray20[this.anInt1939 - 1] & 0xFF) + ((this.aByteArray20[this.anInt1939 - 2] & 0xFF) << 8) + ((this.aByteArray20[this.anInt1939 + -3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt1939 + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "(I)I")
	public final int method1413() {
		this.anInt1939 += 2;
		return ((this.aByteArray20[this.anInt1939 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1939 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BII)V")
	public final void method1414(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			arg0[local9] = this.aByteArray20[this.anInt1939++];
		}
	}

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "(I)I")
	public final int method1416() {
		@Pc(21) byte local21 = this.aByteArray20[this.anInt1939++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray20[this.anInt1939++];
		}
		return local21 | local23;
	}
}
