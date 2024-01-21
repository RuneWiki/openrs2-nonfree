import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!fe", name = "pb", descriptor = "I")
	public int anInt2342;

	@OriginalMember(owner = "client!fe", name = "zb", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8(@OriginalArg(0) int arg0) {
		this.anInt2342 = 0;
		this.aByteArray59 = Static104.method1738(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V")
	public Class2_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray59 = arg0;
		this.anInt2342 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)B")
	public final byte method1368() {
		return (byte) -this.aByteArray59[this.anInt2342++];
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public final void method1370(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 24);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> -405801808);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.anInt2342++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)I")
	public final int method1371() {
		this.anInt2342 += 2;
		@Pc(31) int local31 = ((this.aByteArray59[this.anInt2342 - 1] & 0xFF) << 8) + (this.aByteArray59[this.anInt2342 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)I")
	public final int method1372() {
		@Pc(16) byte local16 = this.aByteArray59[this.anInt2342++];
		@Pc(23) int local23 = 0;
		while (local16 < 0) {
			local23 = (local23 | local16 & 0x7F) << 7;
			local16 = this.aByteArray59[this.anInt2342++];
		}
		return local23 | local16;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[BIB)V")
	public final void method1373(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray59[this.anInt2342++];
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V")
	public final void method1374(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) arg0;
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 943423208);
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)V")
	public final void method1375(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)I")
	public final int method1376() {
		@Pc(15) int local15 = this.aByteArray59[this.anInt2342] & 0xFF;
		return local15 < 128 ? this.method1410() : this.method1396() - 32768;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(II)V")
	public final void method1377(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1375(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1398(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)I")
	public final int method1378() {
		return this.aByteArray59[this.anInt2342++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(II)V")
	public final void method1379(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> -739021656);
		this.aByteArray59[this.anInt2342++] = (byte) arg0;
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 24);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)B")
	public final byte method1380() {
		return this.aByteArray59[this.anInt2342++];
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)I")
	public final int method1381() {
		this.anInt2342 += 2;
		@Pc(36) int local36 = (this.aByteArray59[this.anInt2342 - 1] & 0xFF) + ((this.aByteArray59[this.anInt2342 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)I")
	public final int method1382() {
		this.anInt2342 += 2;
		return ((this.aByteArray59[this.anInt2342 - 2] & 0xFF) << 8) + (this.aByteArray59[this.anInt2342 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(II)V")
	public final void method1384(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> -176481232);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.anInt2342++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(II)V")
	public final void method1385(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 16);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 24);
		this.aByteArray59[this.anInt2342++] = (byte) arg0;
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)B")
	public final byte method1386() {
		return (byte) (this.aByteArray59[this.anInt2342++] - 128);
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "(I)B")
	public final byte method1387() {
		return (byte) (128 - this.aByteArray59[this.anInt2342++]);
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)I")
	public final int method1388() {
		this.anInt2342 += 3;
		return (this.aByteArray59[this.anInt2342 - 1] & 0xFF) + ((this.aByteArray59[this.anInt2342 - 2] & 0xFF) << 8) + ((this.aByteArray59[this.anInt2342 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(JI)V")
	public final void method1389(@OriginalArg(0) long arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 56);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 48);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> -1652311768);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 32);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 24);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 16);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.anInt2342++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
	public final void method1390(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) arg0;
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 16);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "(I)I")
	public final int method1391() {
		this.anInt2342 += 2;
		return (this.aByteArray59[this.anInt2342 - 2] & 0xFF) + ((this.aByteArray59[this.anInt2342 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(II)V")
	public final void method1392(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 + 128);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "(I)I")
	public final int method1393() {
		this.anInt2342 += 4;
		return ((this.aByteArray59[this.anInt2342 - 1] & 0xFF) << 24) + (this.aByteArray59[this.anInt2342 - 2] << 16 & 0xFF0000) + ((this.aByteArray59[this.anInt2342 + -3] & 0xFF) << 8) + (this.aByteArray59[this.anInt2342 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(B)I")
	public final int method1394() {
		this.anInt2342 += 2;
		return ((this.aByteArray59[this.anInt2342 - 1] & 0xFF) << 8) + (this.aByteArray59[this.anInt2342 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(B)I")
	public final int method1395() {
		return 128 - this.aByteArray59[this.anInt2342++] & 0xFF;
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(B)I")
	public final int method1396() {
		this.anInt2342 += 2;
		return ((this.aByteArray59[this.anInt2342 - 2] & 0xFF) << 8) + (this.aByteArray59[this.anInt2342 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
	public final void method1397(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "(II)V")
	public final void method1398(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.anInt2342++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "(I)I")
	public final int method1399() {
		@Pc(11) int local11 = this.aByteArray59[this.anInt2342] & 0xFF;
		return local11 >= 128 ? this.method1396() - 49152 : this.method1410() + -64;
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "(B)Lclient!wb;")
	public final Class65 method1400() {
		@Pc(11) int local11 = this.anInt2342;
		while (this.aByteArray59[this.anInt2342++] != 0) {
		}
		return Static4.method100(this.aByteArray59, this.anInt2342 - local11 - 1, local11);
	}

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "(I)I")
	public final int method1401() {
		this.anInt2342 += 4;
		return ((this.aByteArray59[this.anInt2342 - 4] & 0xFF) << 8) + ((this.aByteArray59[this.anInt2342 - 1] & 0xFF) << 16) + ((this.aByteArray59[this.anInt2342 + -2] & 0xFF) << 24) + (this.aByteArray59[this.anInt2342 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1402(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2342;
		this.anInt2342 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1373(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2342 = 0;
		this.method1375(local31.length);
		this.method1415(local31.length, local31);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ[BI)V")
	public final void method1403(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(16) int local16 = arg0 - 1; local16 >= 0; local16--) {
			arg1[local16] = (byte) (this.aByteArray59[this.anInt2342++] - 128);
		}
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "(II)V")
	public final void method1404(@OriginalArg(0) int arg0) {
		this.aByteArray59[this.anInt2342 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "(I)J")
	public final long method1405() {
		@Pc(15) long local15 = (long) this.method1406() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1406() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "(B)I")
	public final int method1406() {
		this.anInt2342 += 4;
		return ((this.aByteArray59[this.anInt2342 - 3] & 0xFF) << 16) + ((this.aByteArray59[this.anInt2342 - 4] & 0xFF) << 24) + ((this.aByteArray59[this.anInt2342 + -2] & 0xFF) << 8) + (this.aByteArray59[this.anInt2342 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(BI)I")
	public final int method1407(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = Static22.method416(this.anInt2342, arg0, this.aByteArray59);
		this.method1370(local15);
		return local15;
	}

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "(B)I")
	public final int method1409() {
		this.anInt2342 += 2;
		@Pc(39) int local39 = ((this.aByteArray59[this.anInt2342 - 2] & 0xFF) << 8) + (this.aByteArray59[this.anInt2342 - 1] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "(B)I")
	public final int method1410() {
		return this.aByteArray59[this.anInt2342++] & 0xFF;
	}

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "(I)I")
	public final int method1411() {
		this.anInt2342 += 4;
		return ((this.aByteArray59[this.anInt2342 - 3] & 0xFF) << 24) + ((this.aByteArray59[this.anInt2342 - 4] & 0xFF) << 16) + ((this.aByteArray59[this.anInt2342 + -1] & 0xFF) << 8) + (this.aByteArray59[this.anInt2342 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "(I)I")
	public final int method1412() {
		return -this.aByteArray59[this.anInt2342++] & 0xFF;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[BI)V")
	public final void method1415(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray59[this.anInt2342++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "(II)V")
	public final void method1416(@OriginalArg(1) int arg0) {
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 >> 8);
		this.aByteArray59[this.anInt2342++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!wb;)V")
	public final void method1417(@OriginalArg(1) Class65 arg0) {
		this.anInt2342 += arg0.method1792(this.aByteArray59, this.anInt2342, arg0.method1760());
		this.aByteArray59[this.anInt2342++] = 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ[I)V")
	public final void method1418(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt2342;
		@Pc(15) int local15 = (arg0 - 5) / 8;
		this.anInt2342 = 5;
		for (@Pc(24) int local24 = 0; local24 < local15; local24++) {
			@Pc(30) int local30 = this.method1406();
			@Pc(34) int local34 = this.method1406();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= (local30 << 4 ^ local30 >>> 5) + local30 ^ arg1[local36 >>> 11 & 0x3] + local36;
				local36 -= -1640531527;
				local30 -= arg1[local36 & 0x3] + local36 ^ (local34 << 4 ^ local34 >>> 5) - -local34;
			}
			this.anInt2342 -= 8;
			this.method1370(local30);
			this.method1370(local34);
		}
		this.anInt2342 = local8;
	}
}
