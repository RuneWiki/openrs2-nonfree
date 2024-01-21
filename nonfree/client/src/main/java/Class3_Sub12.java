import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!ff", name = "ub", descriptor = "I")
	public int anInt1793;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
	public Class3_Sub12(@OriginalArg(0) int arg0) {
		this.anInt1793 = 0;
		this.aByteArray16 = Static160.method2535(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
	public Class3_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = arg0;
		this.anInt1793 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)J")
	public final long method1339() {
		@Pc(18) long local18 = (long) this.method1373() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method1373() & 0xFFFFFFFFL;
		return (local18 << 32) + local25;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
	public final void method1340(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)B")
	public final byte method1342() {
		return this.aByteArray16[this.anInt1793++];
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
	public final void method1343(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1383(arg0 >>> 28 | 0x80);
					}
					this.method1383(arg0 >>> 21 | 0x80);
				}
				this.method1383(arg0 >>> 14 | 0x80);
			}
			this.method1383(arg0 >>> 7 | 0x80);
		}
		this.method1383(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
	public final void method1344(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1793++] = (byte) arg0;
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[BI)V")
	public final void method1345(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			this.aByteArray16[this.anInt1793++] = arg0[local13];
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)V")
	public final void method1346(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1793++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)I")
	public final int method1347() {
		return -this.aByteArray16[this.anInt1793++] & 0xFF;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)I")
	public final int method1348() {
		this.anInt1793 += 3;
		return ((this.aByteArray16[this.anInt1793 - 3] & 0xFF) << 8) + (((this.aByteArray16[this.anInt1793 - 2] & 0xFF) << 16) + (this.aByteArray16[this.anInt1793 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)I")
	public final int method1349() {
		this.anInt1793 += 4;
		return (this.aByteArray16[this.anInt1793 - 2] & 0xFF) + ((this.aByteArray16[this.anInt1793 - 1] & 0xFF) << 8) + ((this.aByteArray16[this.anInt1793 + -4] & 0xFF) << 16) + ((this.aByteArray16[this.anInt1793 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!sd;Z)V")
	public final void method1350(@OriginalArg(0) Class73 arg0) {
		this.anInt1793 += arg0.method2436(this.aByteArray16, arg0.method2435(), this.anInt1793);
		this.aByteArray16[this.anInt1793++] = 0;
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)I")
	public final int method1351() {
		@Pc(22) byte local22 = this.aByteArray16[this.anInt1793++];
		@Pc(24) int local24 = 0;
		while (local22 < 0) {
			local24 = (local22 & 0x7F | local24) << 7;
			local22 = this.aByteArray16[this.anInt1793++];
		}
		return local22 | local24;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)I")
	public final int method1352() {
		this.anInt1793 += 2;
		return ((this.aByteArray16[this.anInt1793 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt1793 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V")
	public final void method1353(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)I")
	public final int method1354() {
		return this.aByteArray16[this.anInt1793++] & 0xFF;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)B")
	public final byte method1355() {
		return (byte) -this.aByteArray16[this.anInt1793++];
	}

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)I")
	public final int method1356() {
		this.anInt1793 += 2;
		@Pc(39) int local39 = ((this.aByteArray16[this.anInt1793 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt1793 - 2] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(IZ)V")
	public final void method1357(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) arg0;
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(IZ)V")
	public final void method1358(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "(I)I")
	public final int method1359() {
		this.anInt1793 += 2;
		return (this.aByteArray16[this.anInt1793 - 1] & 0xFF) + ((this.aByteArray16[this.anInt1793 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(BI)V")
	public final void method1361(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1793++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)V")
	public final void method1362(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1793 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(BI)V")
	public final void method1363(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 + 128);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[III)V")
	public final void method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(4) int local4 = this.anInt1793;
		@Pc(15) int local15 = (arg0 - 5) / 8;
		this.anInt1793 = 5;
		for (@Pc(25) int local25 = 0; local25 < local15; local25++) {
			@Pc(31) int local31 = this.method1373();
			@Pc(37) int local37 = this.method1373();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= (local31 >>> 5 ^ local31 << 4) + local31 ^ arg1[local39 >>> 11 & 0xF0A00003] + local39;
				local39 -= -1640531527;
				local31 -= arg1[local39 & 0x3] + local39 ^ (local37 << 4 ^ local37 >>> 5) + local37;
			}
			this.anInt1793 -= 8;
			this.method1392(local31);
			this.method1392(local37);
		}
		this.anInt1793 = local4;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
	public final void method1365(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1793 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt1793 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1793 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1793 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
	public final int method1366() {
		@Pc(16) int local16 = this.aByteArray16[this.anInt1793] & 0xFF;
		return local16 >= 128 ? this.method1359() - 49152 : this.method1354() + -64;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)V")
	public final void method1367(@OriginalArg(1) long arg0) {
		this.method1393((int) (arg0 >> 32));
		this.method1393((int) arg0);
	}

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "(I)Lclient!sd;")
	public final Class73 method1368() {
		if (this.aByteArray16[this.anInt1793] == 0) {
			this.anInt1793++;
			return null;
		} else {
			return this.method1390();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[BB)V")
	public final void method1369(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			arg1[local10] = (byte) (this.aByteArray16[this.anInt1793++] - 128);
		}
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)B")
	public final byte method1370() {
		return (byte) (128 - this.aByteArray16[this.anInt1793++]);
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(II)V")
	public final void method1371(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "(I)I")
	public final int method1373() {
		this.anInt1793 += 4;
		return ((this.aByteArray16[this.anInt1793 - 4] & 0xFF) << 24) - (-((this.aByteArray16[this.anInt1793 - 3] & 0xFF) << 16) - (this.aByteArray16[this.anInt1793 - 2] << 8 & 0xFF00) - (this.aByteArray16[this.anInt1793 + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[BII)V")
	public final void method1374(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray16[this.anInt1793++];
		}
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(B)I")
	public final int method1375() {
		this.anInt1793 += 2;
		@Pc(36) int local36 = (this.aByteArray16[this.anInt1793 - 1] & 0xFF) + ((this.aByteArray16[this.anInt1793 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "(B)I")
	public final int method1376() {
		this.anInt1793 += 3;
		return ((this.aByteArray16[this.anInt1793 - 3] & 0xFF) << 16) + (((this.aByteArray16[this.anInt1793 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt1793 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "(B)I")
	public final int method1377() {
		this.anInt1793 += 2;
		return ((this.aByteArray16[this.anInt1793 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt1793 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "(B)I")
	public final int method1378() {
		return this.aByteArray16[this.anInt1793++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "(I)I")
	public final int method1379() {
		@Pc(7) int local7 = this.aByteArray16[this.anInt1793] & 0xFF;
		return local7 >= 128 ? this.method1359() - 32768 : this.method1354();
	}

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "(B)I")
	public final int method1380() {
		this.anInt1793 += 4;
		return (this.aByteArray16[this.anInt1793 - 4] & 0xFF) + ((this.aByteArray16[this.anInt1793 - 3] & 0xFF) << 8) + ((this.aByteArray16[-1 + this.anInt1793] & 0xFF) << 24) + ((this.aByteArray16[this.anInt1793 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "(B)I")
	public final int method1381() {
		this.anInt1793 += 2;
		return (this.aByteArray16[this.anInt1793 - 2] & 0xFF) + ((this.aByteArray16[this.anInt1793 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(JB)V")
	public final void method1382(@OriginalArg(0) long arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 56);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 48);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 40);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 32);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1793++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
	public final void method1383(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)I")
	public final int method1384() {
		this.anInt1793 += 4;
		return (this.aByteArray16[this.anInt1793 - 3] & 0xFF) + ((this.aByteArray16[this.anInt1793 - 2] & 0xFF) << 24) + ((this.aByteArray16[this.anInt1793 + -1] & 0xFF) << 16) + ((this.aByteArray16[this.anInt1793 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method1385(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1793;
		this.anInt1793 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1374(local12, local6);
		@Pc(31) BigInteger local31 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local31.modPow(arg0, arg1);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt1793 = 0;
		this.method1383(local39.length);
		this.method1345(local39, local39.length);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III[B)V")
	public final void method1386(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(17) int local17 = arg0 - 1; local17 >= 0; local17--) {
			arg1[local17] = this.aByteArray16[this.anInt1793++];
		}
	}

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "(B)I")
	public final int method1387() {
		return 128 - this.aByteArray16[this.anInt1793++] & 0xFF;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(BI)V")
	public final void method1388(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1383(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1361(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(IB)I")
	public final int method1389(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static96.method1659(this.anInt1793, arg0, this.aByteArray16);
		this.method1392(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "(B)Lclient!sd;")
	public final Class73 method1390() {
		@Pc(14) int local14 = this.anInt1793;
		while (this.aByteArray16[this.anInt1793++] != 0) {
		}
		return Static40.method771(this.anInt1793 - local14 - 1, local14, this.aByteArray16);
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(II)V")
	public final void method1391(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) arg0;
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "(II)V")
	public final void method1392(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1793++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(BI)V")
	public final void method1393(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt1793++] = (byte) arg0;
		this.aByteArray16[this.anInt1793++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "(B)I")
	public final int method1394() {
		this.anInt1793 += 2;
		@Pc(36) int local36 = (this.aByteArray16[this.anInt1793 - 2] & 0xFF) + ((this.aByteArray16[this.anInt1793 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "(B)B")
	public final byte method1395() {
		return (byte) (this.aByteArray16[this.anInt1793++] - 128);
	}
}
