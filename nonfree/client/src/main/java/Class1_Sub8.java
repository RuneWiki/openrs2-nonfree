import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
	public int anInt1692;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8(@OriginalArg(0) int arg0) {
		this.aByteArray24 = Static98.method1712(arg0);
		this.anInt1692 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray24 = arg0;
		this.anInt1692 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIII)V")
	public final void method1180(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = (byte) (this.aByteArray24[this.anInt1692++] - 128);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public final void method1181(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt1692++] = (byte) arg0;
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I")
	public final int method1182() {
		this.anInt1692 += 4;
		return ((this.aByteArray24[this.anInt1692 - 3] & 0xFF) << 8) + (((this.aByteArray24[this.anInt1692 - 1] & 0xFF) << 24) + ((this.aByteArray24[this.anInt1692 - 2] & 0xFF) << 16) + (this.aByteArray24[this.anInt1692 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public final void method1183(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt1692++] = (byte) arg0;
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)I")
	public final int method1184(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static106.method1844(arg0, this.anInt1692, this.aByteArray24);
		this.method1218(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(BI)V")
	public final void method1185(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)I")
	public final int method1186() {
		return this.aByteArray24[this.anInt1692++] & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[BI)V")
	public final void method1187(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = arg1 - 1; local5 >= 0; local5--) {
			arg0[local5] = this.aByteArray24[this.anInt1692++];
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)I")
	public final int method1188() {
		this.anInt1692 += 4;
		return ((this.aByteArray24[this.anInt1692 - 2] & 0xFF) << 8) + ((this.aByteArray24[this.anInt1692 - 3] & 0xFF) << 16) + ((this.aByteArray24[this.anInt1692 - 4] & 0xFF) << 24) + (this.aByteArray24[this.anInt1692 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V")
	public final void method1189(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1185(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1222(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
	public final int method1190() {
		@Pc(11) int local11 = this.aByteArray24[this.anInt1692] & 0xFF;
		return local11 < 128 ? this.method1186() : this.method1199() - 32768;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(BI)V")
	public final void method1192(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) arg0;
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BJ)V")
	public final void method1193(@OriginalArg(1) long arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 56);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 48);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 40);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 32);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt1692++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)I")
	public final int method1195() {
		@Pc(11) int local11 = this.aByteArray24[this.anInt1692] & 0xFF;
		return local11 < 128 ? this.method1186() - 64 : this.method1199() + -49152;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V")
	public final void method1197(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) arg0;
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(II)V")
	public final void method1198(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 + 128);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)I")
	public final int method1199() {
		this.anInt1692 += 2;
		return (this.aByteArray24[this.anInt1692 - 1] & 0xFF) + ((this.aByteArray24[this.anInt1692 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(II)V")
	public final void method1200(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(B)Lclient!mc;")
	public final Class42 method1201() {
		@Pc(11) int local11 = this.anInt1692;
		while (this.aByteArray24[this.anInt1692++] != 0) {
		}
		return Static18.method425(local11, this.aByteArray24, this.anInt1692 - local11 - 1);
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)I")
	public final int method1202() {
		this.anInt1692 += 3;
		return ((this.aByteArray24[this.anInt1692 - 3] & 0xFF) << 16) + ((this.aByteArray24[this.anInt1692 - 2] & 0xFF) << 8) + (this.aByteArray24[this.anInt1692 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(B)I")
	public final int method1203() {
		this.anInt1692 += 4;
		return ((this.aByteArray24[this.anInt1692 - 3] & 0xFF) << 24) + ((this.aByteArray24[this.anInt1692 - 4] & 0xFF) << 16) + ((this.aByteArray24[this.anInt1692 + -1] & 0xFF) << 8) + (this.aByteArray24[this.anInt1692 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!mc;)V")
	public final void method1204(@OriginalArg(1) Class42 arg0) {
		this.anInt1692 += arg0.method1059(this.aByteArray24, this.anInt1692, arg0.method1027());
		this.aByteArray24[this.anInt1692++] = 0;
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)I")
	public final int method1205() {
		this.anInt1692 += 2;
		@Pc(28) int local28 = ((this.aByteArray24[this.anInt1692 - 1] & 0xFF) << 8) + (this.aByteArray24[this.anInt1692 - 2] & 0xFF);
		if (local28 > 32767) {
			local28 -= 65536;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)I")
	public final int method1206() {
		this.anInt1692 += 2;
		return (this.aByteArray24[this.anInt1692 - 1] - 128 & 0xFF) + ((this.aByteArray24[this.anInt1692 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(B)I")
	public final int method1207() {
		return this.aByteArray24[this.anInt1692++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)I")
	public final int method1208() {
		this.anInt1692 += 2;
		return (this.aByteArray24[this.anInt1692 - 2] & 0xFF) + ((this.aByteArray24[this.anInt1692 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "(I)B")
	public final byte method1209() {
		return this.aByteArray24[this.anInt1692++];
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)I")
	public final int method1210() {
		this.anInt1692 += 4;
		return ((this.aByteArray24[this.anInt1692 - 1] & 0xFF) << 16) + ((this.aByteArray24[this.anInt1692 - 2] & 0xFF) << 24) + ((this.aByteArray24[this.anInt1692 - 4] & 0xFF) << 8) + (this.aByteArray24[this.anInt1692 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(B)I")
	public final int method1211() {
		return 128 - this.aByteArray24[this.anInt1692++] & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method1212(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1692;
		this.anInt1692 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1217(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt1692 = 0;
		this.method1185(local31.length);
		this.method1229(local31.length, local31);
	}

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "(I)I")
	public final int method1213() {
		this.anInt1692 += 2;
		@Pc(33) int local33 = ((this.aByteArray24[this.anInt1692 - 1] & 0xFF) << 8) + (this.aByteArray24[this.anInt1692 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIB)V")
	public final void method1214(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(10) int local10 = (arg0 - 5) / 8;
		@Pc(17) int local17 = this.anInt1692;
		this.anInt1692 = 5;
		for (@Pc(22) int local22 = 0; local22 < local10; local22++) {
			@Pc(27) int local27 = this.method1188();
			@Pc(33) int local33 = this.method1188();
			@Pc(35) int local35 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local33 -= (local27 << 4 ^ local27 >>> 5) + local27 ^ arg1[local35 >>> 11 & 0x3] + local35;
				local35 -= -1640531527;
				local27 -= local35 + arg1[local35 & 0x3] ^ local33 + (local33 >>> 5 ^ local33 << 4);
			}
			this.anInt1692 -= 8;
			this.method1218(local27);
			this.method1218(local33);
		}
		this.anInt1692 = local17;
	}

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "(I)I")
	public final int method1216() {
		this.anInt1692 += 2;
		return (this.aByteArray24[this.anInt1692 - 2] - 128 & 0xFF) + ((this.aByteArray24[this.anInt1692 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "([BIII)V")
	public final void method1217(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = this.aByteArray24[this.anInt1692++];
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
	public final void method1218(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt1692++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "(I)B")
	public final byte method1219() {
		return (byte) (this.aByteArray24[this.anInt1692++] - 128);
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(I)I")
	public final int method1220() {
		return -this.aByteArray24[this.anInt1692++] & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(II)V")
	public final void method1221(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(II)V")
	public final void method1222(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt1692++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "(B)I")
	public final int method1223() {
		@Pc(23) byte local23 = this.aByteArray24[this.anInt1692++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local25 | local23 & 0x7F) << 7;
			local23 = this.aByteArray24[this.anInt1692++];
		}
		return local25 | local23;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)J")
	public final long method1224() {
		@Pc(15) long local15 = (long) this.method1188() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1188() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(BI)V")
	public final void method1225(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt1692++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(Z)I")
	public final int method1226() {
		this.anInt1692 += 2;
		@Pc(27) int local27 = (this.aByteArray24[this.anInt1692 - 1] & 0xFF) + ((this.aByteArray24[this.anInt1692 - 2] & 0xFF) << 8);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "(I)B")
	public final byte method1227() {
		return (byte) (128 - this.aByteArray24[this.anInt1692++]);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	public final void method1228(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt1692++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BBI)V")
	public final void method1229(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			this.aByteArray24[this.anInt1692++] = arg1[local12];
		}
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(II)V")
	public final void method1230(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt1692 - arg0 - 1] = (byte) arg0;
	}
}
