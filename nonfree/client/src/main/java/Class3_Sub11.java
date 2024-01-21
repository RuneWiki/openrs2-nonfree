import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!wd", name = "Eb", descriptor = "I")
	public int anInt2060 = 0;

	@OriginalMember(owner = "client!wd", name = "ub", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray17 = Static46.method923(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray17 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)I")
	public final int method1419() {
		this.anInt2060 += 2;
		return (this.aByteArray17[this.anInt2060 - 2] & 0xFF) + ((this.aByteArray17[this.anInt2060 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZI[B)V")
	public final void method1420(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			arg1[local9] = this.aByteArray17[this.anInt2060++];
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(Z)I")
	public final int method1421() {
		return this.aByteArray17[this.anInt2060++] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)I")
	public final int method1422() {
		return 128 - this.aByteArray17[this.anInt2060++] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)I")
	public final int method1423() {
		this.anInt2060 += 4;
		return ((this.aByteArray17[this.anInt2060 - 3] & 0xFF) << 8) + (((this.aByteArray17[this.anInt2060 - 1] & 0xFF) << 24) + ((this.aByteArray17[this.anInt2060 - 2] & 0xFF) << 16)) + (this.aByteArray17[this.anInt2060 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
	public final int method1424() {
		this.anInt2060 += 3;
		return (this.aByteArray17[this.anInt2060 - 1] & 0xFF) + ((this.aByteArray17[this.anInt2060 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2060 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	public final void method1425(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2060++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)Lclient!hb;")
	public final Class27 method1426() {
		@Pc(2) int local2 = this.anInt2060;
		while (this.aByteArray17[this.anInt2060++] != 0) {
		}
		return Static8.method180(this.aByteArray17, local2, this.anInt2060 - local2 - 1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public final void method1427(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2060++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)I")
	public final int method1428() {
		this.anInt2060 += 2;
		@Pc(37) int local37 = ((this.aByteArray17[this.anInt2060 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt2060 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I")
	public final int method1429() {
		this.anInt2060 += 2;
		@Pc(41) int local41 = ((this.aByteArray17[this.anInt2060 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt2060 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!hb;)V")
	public final void method1430(@OriginalArg(1) Class27 arg0) {
		this.anInt2060 += arg0.method727(this.anInt2060, arg0.method765(), this.aByteArray17);
		this.aByteArray17[this.anInt2060++] = 0;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)I")
	public final int method1431() {
		this.anInt2060 += 2;
		@Pc(42) int local42 = ((this.aByteArray17[this.anInt2060 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt2060 - 2] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)B")
	public final byte method1432() {
		return this.aByteArray17[this.anInt2060++];
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V")
	public final void method1433(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) arg0;
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(B)I")
	public final int method1434() {
		this.anInt2060 += 4;
		return (this.aByteArray17[this.anInt2060 - 2] & 0xFF) + (((this.aByteArray17[this.anInt2060 - 3] & 0xFF) << 24) + ((this.aByteArray17[this.anInt2060 - 4] & 0xFF) << 16)) + ((this.aByteArray17[this.anInt2060 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(BI)V")
	public final void method1435(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1443(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1467(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	public final void method1436(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2060 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
	public final void method1437(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2060++] = (byte) arg0;
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BII)V")
	public final void method1439(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray17[this.anInt2060++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(II)V")
	public final void method1440(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2060++] = (byte) arg0;
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(B)I")
	public final int method1441() {
		this.anInt2060 += 2;
		return (this.aByteArray17[this.anInt2060 - 2] - 128 & 0xFF) + ((this.aByteArray17[this.anInt2060 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I[BII)V")
	public final void method1442(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(8) int local8 = arg1 - 1; local8 >= 0; local8--) {
			arg0[local8] = (byte) (this.aByteArray17[this.anInt2060++] - 128);
		}
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(II)V")
	public final void method1443(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(B)I")
	public final int method1444() {
		this.anInt2060 += 4;
		return ((this.aByteArray17[this.anInt2060 - 2] & 0xFF) << 8) + ((this.aByteArray17[this.anInt2060 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2060 + -4] & 0xFF) << 24) + (this.aByteArray17[this.anInt2060 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)I")
	public final int method1445() {
		return -this.aByteArray17[this.anInt2060++] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(I)I")
	public final int method1446() {
		@Pc(11) int local11 = this.aByteArray17[this.anInt2060] & 0xFF;
		return local11 < 128 ? this.method1421() - 64 : this.method1451() + -49152;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(BI)V")
	public final void method1447(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IZ)V")
	public final void method1448(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 + 128);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(B)B")
	public final byte method1449() {
		return (byte) (128 - this.aByteArray17[this.anInt2060++]);
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(B)J")
	public final long method1450() {
		@Pc(11) long local11 = (long) this.method1444() & 0xFFFFFFFFL;
		@Pc(18) long local18 = (long) this.method1444() & 0xFFFFFFFFL;
		return (local11 << 32) + local18;
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(I)I")
	public final int method1451() {
		this.anInt2060 += 2;
		return ((this.aByteArray17[this.anInt2060 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt2060 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(II)V")
	public final void method1452(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(I)I")
	public final int method1454() {
		@Pc(16) byte local16 = this.aByteArray17[this.anInt2060++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray17[this.anInt2060++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "(I)B")
	public final byte method1455() {
		return (byte) (this.aByteArray17[this.anInt2060++] - 128);
	}

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "(B)I")
	public final int method1457() {
		this.anInt2060 += 2;
		return (this.aByteArray17[this.anInt2060 - 1] - 128 & 0xFF) + ((this.aByteArray17[this.anInt2060 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "(I)I")
	public final int method1458() {
		this.anInt2060 += 2;
		@Pc(39) int local39 = ((this.aByteArray17[this.anInt2060 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt2060 - 2] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(IZ)V")
	public final void method1461(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(II)V")
	public final void method1462(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1463(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt2060;
		@Pc(5) byte[] local5 = new byte[local2];
		this.anInt2060 = 0;
		this.method1420(local2, local5);
		@Pc(23) BigInteger local23 = new BigInteger(local5);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2060 = 0;
		this.method1443(local31.length);
		this.method1439(local31, local31.length);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(BI)I")
	public final int method1464(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static87.method1642(arg0, this.anInt2060, this.aByteArray17);
		this.method1425(local16);
		return local16;
	}

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "(I)I")
	public final int method1465() {
		this.anInt2060 += 4;
		return (this.aByteArray17[this.anInt2060 - 3] & 0xFF) + ((this.aByteArray17[this.anInt2060 - 1] & 0xFF) << 16) + ((this.aByteArray17[this.anInt2060 + -2] & 0xFF) << 24) + ((this.aByteArray17[this.anInt2060 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ[II)V")
	public final void method1466(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt2060;
		this.anInt2060 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(33) int local33 = this.method1444();
			@Pc(35) int local35 = -957401312;
			@Pc(39) int local39 = this.method1444();
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local39 -= (local33 << 4 ^ local33 >>> 5) + local33 ^ arg1[local35 >>> 11 & 0xA2800003] + local35;
				local35 -= -1640531527;
				local33 -= arg1[local35 & 0x3] + local35 ^ local39 + (local39 << 4 ^ local39 >>> 5);
			}
			this.anInt2060 -= 8;
			this.method1425(local33);
			this.method1425(local39);
		}
		this.anInt2060 = local8;
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(II)V")
	public final void method1467(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2060++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(JI)V")
	public final void method1468(@OriginalArg(0) long arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 56);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 48);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 40);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 32);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt2060++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "(I)I")
	public final int method1469() {
		@Pc(16) int local16 = this.aByteArray17[this.anInt2060] & 0xFF;
		return local16 >= 128 ? this.method1451() - 32768 : this.method1421();
	}

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "(I)I")
	public final int method1470() {
		return this.aByteArray17[this.anInt2060++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(II)V")
	public final void method1471(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt2060++] = (byte) arg0;
		this.aByteArray17[this.anInt2060++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "(I)B")
	public final byte method1472() {
		return (byte) -this.aByteArray17[this.anInt2060++];
	}
}
