import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!fa", name = "W", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
	public int anInt1592;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
	public Class1_Sub9(@OriginalArg(0) int arg0) {
		this.aByteArray25 = Static109.method2271(arg0);
		this.anInt1592 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([B)V")
	public Class1_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray25 = arg0;
		this.anInt1592 = 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)V")
	public final void method1226(@OriginalArg(1) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 16);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
		this.aByteArray25[this.anInt1592++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1227(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1592;
		this.anInt1592 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1241(local12, local6);
		@Pc(27) BigInteger local27 = new BigInteger(local12);
		@Pc(32) BigInteger local32 = local27.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt1592 = 0;
		this.method1260(local35.length);
		this.method1255(local35.length, local35);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)I")
	public final int method1228() {
		return -this.aByteArray25[this.anInt1592++] & 0xFF;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)I")
	public final int method1229() {
		this.anInt1592 += 4;
		return (this.aByteArray25[this.anInt1592 - 2] & 0xFF) + ((this.aByteArray25[this.anInt1592 - 4] & 0xFF) << 16) + ((this.aByteArray25[this.anInt1592 + -3] & 0xFF) << 24) + ((this.aByteArray25[this.anInt1592 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I")
	public final int method1230() {
		this.anInt1592 += 3;
		return ((this.aByteArray25[this.anInt1592 - 2] & 0xFF) << 8) + (this.aByteArray25[this.anInt1592 - 3] << 16 & 0xFF0000) + (this.aByteArray25[this.anInt1592 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V")
	public final void method1231(@OriginalArg(0) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 16);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 24);
		this.aByteArray25[this.anInt1592++] = (byte) arg0;
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZLclient!rf;)V")
	public final void method1232(@OriginalArg(1) Class70 arg0) {
		this.anInt1592 += arg0.method2921(arg0.method2896(), this.aByteArray25, this.anInt1592);
		this.aByteArray25[this.anInt1592++] = 0;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)I")
	public final int method1234() {
		return this.aByteArray25[this.anInt1592++] & 0xFF;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[BI)V")
	public final void method1235(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(15) int local15 = arg0 - 1; local15 >= 0; local15--) {
			arg1[local15] = this.aByteArray25[this.anInt1592++];
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)V")
	public final void method1236(@OriginalArg(1) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
		this.aByteArray25[this.anInt1592++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IJ)V")
	public final void method1237(@OriginalArg(1) long arg0) {
		this.method1264((int) (arg0 >> 32));
		this.method1264((int) arg0);
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)I")
	public final int method1239() {
		this.anInt1592 += 2;
		return (this.aByteArray25[this.anInt1592 - 2] - 128 & 0xFF) + ((this.aByteArray25[this.anInt1592 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)I")
	public final int method1240() {
		return 128 - this.aByteArray25[this.anInt1592++] & 0xFF;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([BIII)V")
	public final void method1241(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray25[this.anInt1592++];
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)V")
	public final void method1242(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1260(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1236(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)B")
	public final byte method1243() {
		return this.aByteArray25[this.anInt1592++];
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(B)I")
	public final int method1244() {
		@Pc(19) int local19 = this.aByteArray25[this.anInt1592] & 0xFF;
		return local19 < 128 ? this.method1234() : this.method1280() - 32768;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
	public final void method1245(@OriginalArg(0) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(BI)I")
	public final int method1246(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static128.method3228(arg0, this.anInt1592, this.aByteArray25);
		this.method1259(local11);
		return local11;
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)I")
	public final int method1247() {
		@Pc(7) int local7 = this.aByteArray25[this.anInt1592] & 0xFF;
		return local7 < 128 ? this.method1234() - 64 : this.method1280() + -49152;
	}

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)I")
	public final int method1248() {
		this.anInt1592 += 3;
		return (this.aByteArray25[this.anInt1592 - 3] & 0xFF) + (((this.aByteArray25[this.anInt1592 - 1] & 0xFF) << 16) + ((this.aByteArray25[this.anInt1592 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)V")
	public final void method1249(@OriginalArg(0) int arg0) {
		this.aByteArray25[this.anInt1592 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)I")
	public final int method1250() {
		@Pc(17) byte local17 = this.aByteArray25[this.anInt1592++];
		@Pc(23) int local23 = 0;
		while (local17 < 0) {
			local23 = (local17 & 0x7F | local23) << 7;
			local17 = this.aByteArray25[this.anInt1592++];
		}
		return local17 | local23;
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(II)V")
	public final void method1251(@OriginalArg(1) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) arg0;
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(B)Lclient!rf;")
	public final Class70 method1252() {
		if (this.aByteArray25[this.anInt1592] == 0) {
			this.anInt1592++;
			return null;
		} else {
			return this.method1253();
		}
	}

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)Lclient!rf;")
	public final Class70 method1253() {
		@Pc(7) int local7 = this.anInt1592;
		while (this.aByteArray25[this.anInt1592++] != 0) {
		}
		return Static143.method2805(local7, this.anInt1592 - local7 - 1, this.aByteArray25);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(IB)V")
	public final void method1254(@OriginalArg(0) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 + 128);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II[BI)V")
	public final void method1255(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			this.aByteArray25[this.anInt1592++] = arg1[local14];
		}
	}

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "(I)I")
	public final int method1256() {
		this.anInt1592 += 2;
		@Pc(31) int local31 = (this.aByteArray25[this.anInt1592 - 2] & 0xFF) + ((this.aByteArray25[this.anInt1592 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "(I)I")
	public final int method1257() {
		this.anInt1592 += 2;
		return ((this.aByteArray25[this.anInt1592 - 2] & 0xFF) << 8) + (this.aByteArray25[this.anInt1592 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "(I)I")
	public final int method1258() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method1244(); local11 == 32767; local11 = this.method1244()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(IB)V")
	public final void method1259(@OriginalArg(0) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 24);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 16);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
		this.aByteArray25[this.anInt1592++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(IB)V")
	public final void method1260(@OriginalArg(0) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "(I)I")
	public final int method1261() {
		this.anInt1592 += 2;
		@Pc(37) int local37 = (this.aByteArray25[this.anInt1592 - 2] - 128 & 0xFF) + ((this.aByteArray25[this.anInt1592 - 1] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(IB)V")
	public final void method1262(@OriginalArg(0) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BJ)V")
	public final void method1263(@OriginalArg(1) long arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 56);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 48);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 40);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 32);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 24);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 16);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
		this.aByteArray25[this.anInt1592++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(ZI)V")
	public final void method1264(@OriginalArg(1) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) arg0;
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 16);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[I)V")
	public final void method1265(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = (arg0 - 5) / 8;
		@Pc(11) int local11 = this.anInt1592;
		this.anInt1592 = 5;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(28) int local28 = this.method1273();
			@Pc(32) int local32 = this.method1273();
			@Pc(34) int local34 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local32 -= local34 + arg1[local34 >>> 11 & 0x3] ^ local28 + (local28 << 4 ^ local28 >>> 5);
				local34 -= -1640531527;
				local28 -= local34 + arg1[local34 & 0x3] ^ local32 + (local32 << 4 ^ local32 >>> 5);
			}
			this.anInt1592 -= 8;
			this.method1259(local28);
			this.method1259(local32);
		}
		this.anInt1592 = local11;
	}

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "(B)I")
	public final int method1266() {
		this.anInt1592 += 4;
		return (this.aByteArray25[this.anInt1592 - 4] & 0xFF) + ((this.aByteArray25[this.anInt1592 - 3] & 0xFF) << 8) + ((this.aByteArray25[this.anInt1592 + -2] & 0xFF) << 16) + ((this.aByteArray25[this.anInt1592 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(II)V")
	public final void method1267(@OriginalArg(0) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(Z)I")
	public final int method1268() {
		return this.aByteArray25[this.anInt1592++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(Z)J")
	public final long method1269() {
		@Pc(17) long local17 = (long) this.method1273() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1273() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "([BIII)V")
	public final void method1270(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) int local9 = arg1 - 1; local9 >= 0; local9--) {
			arg0[local9] = (byte) (this.aByteArray25[this.anInt1592++] - 128);
		}
	}

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "(B)B")
	public final byte method1271() {
		return (byte) (this.aByteArray25[this.anInt1592++] - 128);
	}

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "(I)I")
	public final int method1272() {
		this.anInt1592 += 4;
		return (this.aByteArray25[this.anInt1592 - 3] & 0xFF) + ((this.aByteArray25[this.anInt1592 - 4] & 0xFF) << 8) + ((this.aByteArray25[this.anInt1592 - 2] & 0xFF) << 24) + ((this.aByteArray25[this.anInt1592 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "(I)I")
	public final int method1273() {
		this.anInt1592 += 4;
		return ((this.aByteArray25[this.anInt1592 - 3] & 0xFF) << 16) + ((this.aByteArray25[this.anInt1592 - 4] & 0xFF) << 24) + ((this.aByteArray25[this.anInt1592 - 2] & 0xFF) << 8) + (this.aByteArray25[this.anInt1592 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V")
	public final void method1274(@OriginalArg(0) int arg0) {
		this.aByteArray25[this.anInt1592 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray25[this.anInt1592 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray25[this.anInt1592 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray25[this.anInt1592 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(II)V")
	public final void method1275(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1260(arg0 >>> 28 | 0x80);
					}
					this.method1260(arg0 >>> 21 | 0x80);
				}
				this.method1260(arg0 >>> 14 | 0x80);
			}
			this.method1260(arg0 >>> 7 | 0x80);
		}
		this.method1260(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(BI)V")
	public final void method1276(@OriginalArg(1) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 8);
		this.aByteArray25[this.anInt1592++] = (byte) arg0;
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 24);
		this.aByteArray25[this.anInt1592++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "(B)I")
	public final int method1277() {
		this.anInt1592 += 2;
		return (this.aByteArray25[this.anInt1592 - 2] & 0xFF) + ((this.aByteArray25[this.anInt1592 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(Z)B")
	public final byte method1278() {
		return (byte) (128 - this.aByteArray25[this.anInt1592++]);
	}

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "(I)I")
	public final int method1279() {
		this.anInt1592 += 2;
		@Pc(36) int local36 = ((this.aByteArray25[this.anInt1592 - 2] & 0xFF) << 8) + (this.aByteArray25[this.anInt1592 - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "(B)I")
	public final int method1280() {
		this.anInt1592 += 2;
		return ((this.aByteArray25[this.anInt1592 - 2] & 0xFF) << 8) + (this.aByteArray25[this.anInt1592 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(ZI)V")
	public final void method1281(@OriginalArg(1) int arg0) {
		this.aByteArray25[this.anInt1592++] = (byte) (128 - arg0);
	}
}
