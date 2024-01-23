import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!lf", name = "Db", descriptor = "I")
	public int anInt1480;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14(@OriginalArg(0) int arg0) {
		this.aByteArray17 = Static289.method4410(arg0);
		this.anInt1480 = 0;
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray17 = arg0;
		this.anInt1480 = 0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[BB)V")
	public final void method1335(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray17[this.anInt1480++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)I")
	public final int method1336() {
		this.anInt1480 += 2;
		@Pc(40) int local40 = (this.aByteArray17[this.anInt1480 - 2] - 128 & 0xFF) + ((this.aByteArray17[this.anInt1480 - 1] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public final void method1337(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 + 128);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	public final void method1338(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I")
	public final int method1339() {
		this.anInt1480 += 4;
		return ((this.aByteArray17[this.anInt1480 - 1] & 0xFF) << 24) + ((this.aByteArray17[this.anInt1480 - 2] << 16 & 0xFF0000) - (-(this.aByteArray17[this.anInt1480 - 3] << 8 & 0xFF00) - (this.aByteArray17[this.anInt1480 - 4] & 0xFF)));
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V")
	public final void method1341(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(II)V")
	public final void method1342(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII[B)V")
	public final void method1343(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray17[this.anInt1480++] - 128);
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(II)V")
	public final void method1344(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(II)V")
	public final void method1345(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(II)V")
	public final void method1347(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)J")
	public final long method1348() {
		@Pc(16) long local16 = (long) this.method1392() & 0xFFFFFFFFL;
		@Pc(23) long local23 = (long) this.method1392() & 0xFFFFFFFFL;
		return (local16 << 32) + local23;
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(II)V")
	public final void method1349(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)I")
	public final int method1350() {
		@Pc(12) int local12 = 0;
		@Pc(23) byte local23;
		for (local23 = this.aByteArray17[this.anInt1480++]; local23 < 0; local23 = this.aByteArray17[this.anInt1480++]) {
			local12 = (local12 | local23 & 0x7F) << 7;
		}
		return local23 | local12;
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(II)V")
	public final void method1351(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)I")
	public final int method1352() {
		this.anInt1480 += 3;
		return ((this.aByteArray17[this.anInt1480 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt1480 - 3] << 16 & 0xFF0000) + (this.aByteArray17[this.anInt1480 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V")
	public final void method1353(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)I")
	public final int method1354() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = this.method1362();
		while (local16 == 32767) {
			local16 = this.method1362();
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BBI)V")
	public final void method1355(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray17[this.anInt1480++];
		}
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)I")
	public final int method1356() {
		this.anInt1480 += 2;
		@Pc(31) int local31 = (this.aByteArray17[this.anInt1480 - 1] & 0xFF) + ((this.aByteArray17[this.anInt1480 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BJ)V")
	public final void method1357(@OriginalArg(1) long arg0) {
		this.method1351((int) (arg0 >> 32));
		this.method1351((int) arg0);
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)I")
	public final int method1358() {
		@Pc(11) int local11 = this.aByteArray17[this.anInt1480] & 0xFF;
		return local11 < 128 ? this.method1378() - 64 : this.method1386() + -49152;
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(II)V")
	public final void method1359(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1390(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1338(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
	public final void method1361(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)I")
	public final int method1362() {
		@Pc(16) int local16 = this.aByteArray17[this.anInt1480] & 0xFF;
		return local16 < 128 ? this.method1378() : this.method1386() - 32768;
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)B")
	public final byte method1363() {
		return this.aByteArray17[this.anInt1480++];
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)B")
	public final byte method1364() {
		return (byte) (128 - this.aByteArray17[this.anInt1480++]);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)I")
	public final int method1365(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = Static102.method1862(this.aByteArray17, this.anInt1480, arg0);
		this.method1387(local18);
		return local18;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(Z)I")
	public final int method1366() {
		this.anInt1480 += 2;
		return ((this.aByteArray17[this.anInt1480 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt1480 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(I)I")
	public final int method1367() {
		this.anInt1480 += 2;
		return ((this.aByteArray17[this.anInt1480 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt1480 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)J")
	public final long method1368(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 - 1;
		if (local13 < 0 || local13 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(28) long local28 = 0L;
		for (@Pc(32) int local32 = local13 * 8; local32 >= 0; local32 -= 8) {
			local28 |= ((long) this.aByteArray17[this.anInt1480++] & 0xFFL) << local32;
		}
		return local28;
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "(I)B")
	public final byte method1370() {
		return (byte) -this.aByteArray17[this.anInt1480++];
	}

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "(I)B")
	public final byte method1371() {
		return (byte) (this.aByteArray17[this.anInt1480++] - 128);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[I)V")
	public final void method1372(@OriginalArg(1) int[] arg0) {
		@Pc(14) int local14 = this.anInt1480 / 8;
		this.anInt1480 = 0;
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(30) int local30 = this.method1392();
			@Pc(34) int local34 = this.method1392();
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local30 += arg0[local36 & 0x3] + local36 ^ (local34 << 4 ^ local34 >>> 5) - -local34;
				local36 += -1640531527;
				local34 += arg0[local36 >>> 11 & 0x4D200003] + local36 ^ local30 + (local30 << 4 ^ local30 >>> 5);
			}
			this.anInt1480 -= 8;
			this.method1387(local30);
			this.method1387(local34);
		}
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "(II)V")
	public final void method1373(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt1480 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt1480 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt1480 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)V")
	public final void method1374(@OriginalArg(0) long arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 56);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 48);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 40);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 32);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method1375() {
		@Pc(14) int local14 = this.anInt1480;
		while (this.aByteArray17[this.anInt1480++] != 0) {
		}
		return Static168.method2852(this.aByteArray17, local14, this.anInt1480 - local14 - 1);
	}

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "(II)V")
	public final void method1376(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "(II)V")
	public final void method1377(@OriginalArg(1) int arg0) {
		if ((-128 & arg0) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1390(arg0 >>> 28 | 0x80);
					}
					this.method1390(arg0 >>> 21 | 0x80);
				}
				this.method1390(arg0 >>> 14 | 0x80);
			}
			this.method1390(arg0 >>> 7 | 0x80);
		}
		this.method1390(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(Z)I")
	public final int method1378() {
		return this.aByteArray17[this.anInt1480++] & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(IB)V")
	public final void method1379(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(Z)I")
	public final int method1380() {
		this.anInt1480 += 4;
		return ((this.aByteArray17[this.anInt1480 - 2] & 0xFF) << 24) + ((this.aByteArray17[this.anInt1480 - 1] & 0xFF) << 16) + ((this.aByteArray17[this.anInt1480 + -4] & 0xFF) << 8) + (this.aByteArray17[this.anInt1480 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "(I)I")
	public final int method1381() {
		return -this.aByteArray17[this.anInt1480++] & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method1382() {
		@Pc(10) byte local10 = this.aByteArray17[this.anInt1480++];
		if (local10 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(33) int local33 = this.anInt1480;
		while (this.aByteArray17[this.anInt1480++] != 0) {
		}
		return Static168.method2852(this.aByteArray17, local33, this.anInt1480 - local33 - 1);
	}

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "(I)I")
	public final int method1383() {
		this.anInt1480 += 2;
		return (this.aByteArray17[this.anInt1480 - 2] & 0xFF) + ((this.aByteArray17[this.anInt1480 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(IB)V")
	public final void method1384(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method1385(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt1480 += Static243.method4740(arg0, this.aByteArray17, arg0.length(), this.anInt1480);
		this.aByteArray17[this.anInt1480++] = 0;
	}

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "(I)I")
	public final int method1386() {
		this.anInt1480 += 2;
		return (this.aByteArray17[this.anInt1480 - 1] & 0xFF) + ((this.aByteArray17[this.anInt1480 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IZ)V")
	public final void method1387(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BF)V")
	public final void method1388(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray17[this.anInt1480++] = (byte) (local6 >> 24);
		this.aByteArray17[this.anInt1480++] = (byte) (local6 >> 16);
		this.aByteArray17[this.anInt1480++] = (byte) (local6 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) local6;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[III)V")
	public final void method1389(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt1480;
		this.anInt1480 = 5;
		@Pc(22) int local22 = (arg1 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) int local35 = this.method1392();
			@Pc(39) int local39 = this.method1392();
			@Pc(41) int local41 = -957401312;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local39 -= (local35 >>> 5 ^ local35 << 4) + local35 ^ local41 - -arg0[local41 >>> 11 & 0x3];
				local41 -= -1640531527;
				local35 -= arg0[local41 & 0x3] + local41 ^ local39 + (local39 << 4 ^ local39 >>> 5);
			}
			this.anInt1480 -= 8;
			this.method1387(local35);
			this.method1387(local39);
		}
		this.anInt1480 = local8;
	}

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "(II)V")
	public final void method1390(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt1480++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JII)V")
	public final void method1391(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(22) int local22 = local6 * 8; local22 >= 0; local22 -= 8) {
			this.aByteArray17[this.anInt1480++] = (byte) (arg0 >> local22);
		}
	}

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "(I)I")
	public final int method1392() {
		this.anInt1480 += 4;
		return (this.aByteArray17[this.anInt1480 - 1] & 0xFF) + ((this.aByteArray17[this.anInt1480 - 4] & 0xFF) << 24) + ((this.aByteArray17[this.anInt1480 + -3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt1480 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(B)I")
	public final int method1393() {
		this.anInt1480 += 4;
		return (this.aByteArray17[this.anInt1480 - 2] & 0xFF) + ((this.aByteArray17[this.anInt1480 - 4] & 0xFF) << 16) + ((this.aByteArray17[-3 + this.anInt1480] & 0xFF) << 24) + ((this.aByteArray17[this.anInt1480 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(B)I")
	public final int method1394() {
		return 128 - this.aByteArray17[this.anInt1480++] & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(BF)V")
	public final void method1395(@OriginalArg(1) float arg0) {
		@Pc(12) int local12 = Float.floatToRawIntBits(arg0);
		this.aByteArray17[this.anInt1480++] = (byte) local12;
		this.aByteArray17[this.anInt1480++] = (byte) (local12 >> 8);
		this.aByteArray17[this.anInt1480++] = (byte) (local12 >> 16);
		this.aByteArray17[this.anInt1480++] = (byte) (local12 >> 24);
	}

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "(I)Ljava/lang/String;")
	public final String method1396() {
		if (this.aByteArray17[this.anInt1480] == 0) {
			this.anInt1480++;
			return null;
		} else {
			return this.method1375();
		}
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(B)I")
	public final int method1397() {
		return this.aByteArray17[this.anInt1480++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(Z)I")
	public final int method1398() {
		this.anInt1480 += 2;
		@Pc(31) int local31 = (this.aByteArray17[this.anInt1480 - 2] & 0xFF) + ((this.aByteArray17[this.anInt1480 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method1399(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1480;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt1480 = 0;
		this.method1355(local6, local9);
		@Pc(30) BigInteger local30 = new BigInteger(local9);
		@Pc(35) BigInteger local35 = local30.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt1480 = 0;
		this.method1390(local38.length);
		this.method1335(local38.length, local38);
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(B)I")
	public final int method1400() {
		this.anInt1480 += 2;
		@Pc(38) int local38 = (this.aByteArray17[this.anInt1480 - 1] - 128 & 0xFF) + ((this.aByteArray17[this.anInt1480 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "(I)Z")
	public final boolean method1401() {
		this.anInt1480 -= 4;
		@Pc(13) int local13 = Static102.method1862(this.aByteArray17, this.anInt1480, 0);
		@Pc(21) int local21 = this.method1392();
		return local21 == local13;
	}
}
