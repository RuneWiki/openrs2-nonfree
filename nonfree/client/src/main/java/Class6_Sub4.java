import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!bf", name = "Ab", descriptor = "I")
	public int anInt1949 = 0;

	@OriginalMember(owner = "client!bf", name = "Mb", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
	public Class6_Sub4(@OriginalArg(0) int arg0) {
		this.aByteArray27 = Static102.method1858(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B)V")
	public Class6_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray27 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public final void method1281(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt1949++] = (byte) arg0;
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
	public final void method1283(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1330(arg0 >>> 28 | 0x80);
					}
					this.method1330(arg0 >>> 21 | 0x80);
				}
				this.method1330(arg0 >>> 14 | 0x80);
			}
			this.method1330(arg0 >>> 7 | 0x80);
		}
		this.method1330(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
	public final void method1284(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)I")
	public final int method1285() {
		@Pc(16) int local16 = this.aByteArray27[this.anInt1949] & 0xFF;
		return local16 >= 128 ? this.method1306() - 49152 : this.method1321() + -64;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[BII)V")
	public final void method1288(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aByteArray27[this.anInt1949++] = arg0[local12];
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)I")
	public final int method1289() {
		this.anInt1949 += 4;
		return (this.aByteArray27[this.anInt1949 - 1] & 0xFF) + ((this.aByteArray27[this.anInt1949 - 4] & 0xFF) << 24) + ((this.aByteArray27[this.anInt1949 - 3] & 0xFF) << 16) + ((this.aByteArray27[this.anInt1949 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I")
	public final int method1290() {
		this.anInt1949 += 3;
		return (this.aByteArray27[this.anInt1949 - 1] & 0xFF) + ((this.aByteArray27[this.anInt1949 - 3] & 0xFF) << 16) + ((this.aByteArray27[this.anInt1949 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
	public final void method1291(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
	public final void method1292(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt1949++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)I")
	public final int method1293() {
		this.anInt1949 += 4;
		return ((this.aByteArray27[this.anInt1949 - 3] & 0xFF) << 8) + (this.aByteArray27[this.anInt1949 - 2] << 16 & 0xFF0000) + ((this.aByteArray27[this.anInt1949 + -1] & 0xFF) << 24) + (this.aByteArray27[this.anInt1949 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)I")
	public final int method1294() {
		this.anInt1949 += 3;
		return (this.aByteArray27[this.anInt1949 - 1] & 0xFF) + ((this.aByteArray27[this.anInt1949 - 2] & 0xFF) << 16) + ((this.aByteArray27[this.anInt1949 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)I")
	public final int method1295() {
		this.anInt1949 += 2;
		return ((this.aByteArray27[this.anInt1949 - 1] & 0xFF) << 8) + (this.aByteArray27[this.anInt1949 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)B")
	public final byte method1297() {
		return this.aByteArray27[this.anInt1949++];
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V")
	public final void method1298(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) arg0;
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)I")
	public final int method1300() {
		this.anInt1949 += 2;
		return (this.aByteArray27[this.anInt1949 - 1] - 128 & 0xFF) + ((this.aByteArray27[this.anInt1949 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)J")
	public final long method1301() {
		@Pc(10) long local10 = (long) this.method1289() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method1289() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "(I)B")
	public final byte method1302() {
		return (byte) (this.aByteArray27[this.anInt1949++] - 128);
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)I")
	public final int method1303() {
		this.anInt1949 += 2;
		@Pc(38) int local38 = (this.aByteArray27[this.anInt1949 - 2] & 0xFF) + ((this.aByteArray27[this.anInt1949 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "(I)B")
	public final byte method1304() {
		return (byte) (128 - this.aByteArray27[this.anInt1949++]);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB[BI)V")
	public final void method1305(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray27[this.anInt1949++] - 128);
		}
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)I")
	public final int method1306() {
		this.anInt1949 += 2;
		return ((this.aByteArray27[this.anInt1949 - 2] & 0xFF) << 8) + (this.aByteArray27[this.anInt1949 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I[BII)V")
	public final void method1307(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(6) int local6 = 0; local6 < arg1; local6++) {
			arg0[local6] = this.aByteArray27[this.anInt1949++];
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)I")
	public final int method1308(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = Static2.method23(arg0, this.aByteArray27, this.anInt1949);
		this.method1292(local19);
		return local19;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method1310(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1949;
		this.anInt1949 = 0;
		@Pc(18) byte[] local18 = new byte[local6];
		this.method1307(local18, local6);
		@Pc(29) BigInteger local29 = new BigInteger(local18);
		@Pc(34) BigInteger local34 = local29.modPow(arg0, arg1);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt1949 = 0;
		this.method1330(local37.length);
		this.method1288(local37, local37.length);
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "(I)I")
	public final int method1311() {
		this.anInt1949 += 2;
		@Pc(33) int local33 = (this.aByteArray27[this.anInt1949 - 2] - 128 & 0xFF) + ((this.aByteArray27[this.anInt1949 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(B)I")
	public final int method1312() {
		return this.aByteArray27[this.anInt1949++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(II)V")
	public final void method1313(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1330(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1332(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)V")
	public final void method1314(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 + 128);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!rd;)V")
	public final void method1315(@OriginalArg(1) Class63 arg0) {
		this.anInt1949 += arg0.method1831(arg0.method1811(), this.aByteArray27, this.anInt1949);
		this.aByteArray27[this.anInt1949++] = 0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(BI)V")
	public final void method1316(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt1949 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(II)V")
	public final void method1317(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) arg0;
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "(I)I")
	public final int method1318() {
		this.anInt1949 += 4;
		return ((this.aByteArray27[this.anInt1949 - 1] & 0xFF) << 16) + ((this.aByteArray27[this.anInt1949 - 2] & 0xFF) << 24) + ((this.aByteArray27[this.anInt1949 + -4] & 0xFF) << 8) + (this.aByteArray27[this.anInt1949 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(BI)V")
	public final void method1319(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt1949++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "(I)I")
	public final int method1320() {
		@Pc(21) byte local21 = this.aByteArray27[this.anInt1949++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray27[this.anInt1949++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)I")
	public final int method1321() {
		return this.aByteArray27[this.anInt1949++] & 0xFF;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	public final void method1322(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt1949++] = (byte) arg0;
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(Z)I")
	public final int method1323() {
		this.anInt1949 += 2;
		@Pc(31) int local31 = (this.aByteArray27[this.anInt1949 - 1] & 0xFF) + ((this.aByteArray27[this.anInt1949 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "(I)I")
	public final int method1324() {
		return -this.aByteArray27[this.anInt1949++] & 0xFF;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IZ)V")
	public final void method1326(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "(I)I")
	public final int method1327() {
		this.anInt1949 += 4;
		return (this.aByteArray27[this.anInt1949 - 2] & 0xFF) + ((this.aByteArray27[this.anInt1949 - 1] & 0xFF) << 8) + ((this.aByteArray27[this.anInt1949 + -3] & 0xFF) << 24) + ((this.aByteArray27[this.anInt1949 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "(II)V")
	public final void method1328(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt1949 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt1949 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt1949 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt1949 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([IIII)V")
	public final void method1329(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt1949;
		@Pc(19) int local19 = (arg1 - 5) / 8;
		this.anInt1949 = 5;
		for (@Pc(24) int local24 = 0; local24 < local19; local24++) {
			@Pc(30) int local30 = this.method1289();
			@Pc(34) int local34 = this.method1289();
			@Pc(36) int local36 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local34 -= (local30 >>> 5 ^ local30 << 4) + local30 ^ arg0[local36 >>> 11 & 0x10A00003] + local36;
				local36 -= -1640531527;
				local30 -= arg0[local36 & 0x3] + local36 ^ (local34 << 4 ^ local34 >>> 5) + local34;
			}
			this.anInt1949 -= 8;
			this.method1292(local30);
			this.method1292(local34);
		}
		this.anInt1949 = local13;
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "(II)V")
	public final void method1330(@OriginalArg(0) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V")
	public final void method1331(@OriginalArg(1) long arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 56);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 48);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 40);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 32);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 24);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 16);
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt1949++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "(II)V")
	public final void method1332(@OriginalArg(1) int arg0) {
		this.aByteArray27[this.anInt1949++] = (byte) (arg0 >> 8);
		this.aByteArray27[this.anInt1949++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(B)B")
	public final byte method1333() {
		return (byte) -this.aByteArray27[this.anInt1949++];
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IJ)V")
	public final void method1334(@OriginalArg(1) long arg0) {
		this.method1281((int) (arg0 >> 32));
		this.method1281((int) arg0);
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(Z)I")
	public final int method1335() {
		this.anInt1949 += 2;
		return ((this.aByteArray27[this.anInt1949 - 1] & 0xFF) << 8) + (this.aByteArray27[this.anInt1949 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "(I)I")
	public final int method1336() {
		return 128 - this.aByteArray27[this.anInt1949++] & 0xFF;
	}

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "(I)I")
	public final int method1337() {
		@Pc(12) int local12 = this.aByteArray27[this.anInt1949] & 0xFF;
		return local12 < 128 ? this.method1321() : this.method1306() - 32768;
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(B)Lclient!rd;")
	public final Class63 method1339() {
		@Pc(11) int local11 = this.anInt1949;
		while (this.aByteArray27[this.anInt1949++] != 0) {
		}
		return Static31.method803(local11, this.anInt1949 - local11 - 1, this.aByteArray27);
	}
}
