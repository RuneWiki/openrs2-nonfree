import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!g", name = "U", descriptor = "I")
	public int anInt1772;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
	public Class2_Sub5(@OriginalArg(0) int arg0) {
		this.anInt1772 = 0;
		this.aByteArray16 = Static65.method1363(arg0);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "([B)V")
	public Class2_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray16 = arg0;
		this.anInt1772 = 0;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
	public final void method1246(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1772++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)I")
	public final int method1247() {
		this.anInt1772 += 2;
		return ((this.aByteArray16[this.anInt1772 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt1772 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(II)V")
	public final void method1249(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 + 128);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(B)Lclient!ke;")
	public final Class39 method1250() {
		@Pc(2) int local2 = this.anInt1772;
		while (this.aByteArray16[this.anInt1772++] != 0) {
		}
		return Static100.method1952(local2, this.anInt1772 - local2 - 1, this.aByteArray16);
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)I")
	public final int method1251() {
		@Pc(18) int local18 = this.aByteArray16[this.anInt1772] & 0xFF;
		return local18 < 128 ? this.method1281() - 64 : this.method1273() + -49152;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
	public final void method1252(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I")
	public final int method1253() {
		this.anInt1772 += 4;
		return ((this.aByteArray16[this.anInt1772 - 1] & 0xFF) << 16) + ((this.aByteArray16[this.anInt1772 - 2] & 0xFF) << 24) + ((this.aByteArray16[this.anInt1772 + -4] & 0xFF) << 8) + (this.aByteArray16[this.anInt1772 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)B")
	public final byte method1254() {
		return this.aByteArray16[this.anInt1772++];
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(B)I")
	public final int method1255() {
		this.anInt1772 += 3;
		return (this.aByteArray16[this.anInt1772 - 1] & 0xFF) + ((this.aByteArray16[this.anInt1772 - 3] & 0xFF) << 16) + ((this.aByteArray16[this.anInt1772 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)B")
	public final byte method1256() {
		return (byte) -this.aByteArray16[this.anInt1772++];
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
	public final void method1257(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1772++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(B)I")
	public final int method1258() {
		@Pc(12) int local12 = this.aByteArray16[this.anInt1772] & 0xFF;
		return local12 < 128 ? this.method1281() : this.method1273() - 32768;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method1259(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1772;
		this.anInt1772 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1285(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt1772 = 0;
		this.method1252(local31.length);
		this.method1272(local31.length, local31);
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(Z)I")
	public final int method1261() {
		this.anInt1772 += 2;
		return (this.aByteArray16[this.anInt1772 - 1] - 128 & 0xFF) + ((this.aByteArray16[this.anInt1772 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
	public final void method1262(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1252(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1257(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(II)V")
	public final void method1263(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt1772++] = (byte) arg0;
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)I")
	public final int method1264() {
		return -this.aByteArray16[this.anInt1772++] & 0xFF;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(II)I")
	public final int method1265(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static90.method1704(arg0, this.anInt1772, this.aByteArray16);
		this.method1298(local11);
		return local11;
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(II)V")
	public final void method1266(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1772 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(IB)V")
	public final void method1268(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) arg0;
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!g", name = "h", descriptor = "(B)I")
	public final int method1269() {
		this.anInt1772 += 2;
		@Pc(32) int local32 = ((this.aByteArray16[this.anInt1772 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt1772 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(JI)V")
	public final void method1270(@OriginalArg(0) long arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 56);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 48);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 40);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 32);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1772++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!g", name = "h", descriptor = "(I)I")
	public final int method1271() {
		this.anInt1772 += 2;
		return (this.aByteArray16[this.anInt1772 - 2] & 0xFF) + ((this.aByteArray16[this.anInt1772 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB[BI)V")
	public final void method1272(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			this.aByteArray16[this.anInt1772++] = arg1[local14];
		}
	}

	@OriginalMember(owner = "client!g", name = "i", descriptor = "(I)I")
	public final int method1273() {
		this.anInt1772 += 2;
		return ((this.aByteArray16[this.anInt1772 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt1772 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(IB)V")
	public final void method1274(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1772++] = (byte) arg0;
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!g", name = "j", descriptor = "(I)I")
	public final int method1275() {
		this.anInt1772 += 2;
		@Pc(36) int local36 = (this.aByteArray16[this.anInt1772 - 2] & 0xFF) + ((this.aByteArray16[this.anInt1772 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!g", name = "k", descriptor = "(I)I")
	public final int method1276() {
		this.anInt1772 += 4;
		return (this.aByteArray16[this.anInt1772 - 1] & 0xFF) + ((this.aByteArray16[this.anInt1772 - 3] & 0xFF) << 16) + ((this.aByteArray16[this.anInt1772 + -4] & 0xFF) << 24) + ((this.aByteArray16[this.anInt1772 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BBII)V")
	public final void method1277(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = arg1 - 1; local5 >= 0; local5--) {
			arg0[local5] = (byte) (this.aByteArray16[this.anInt1772++] - 128);
		}
	}

	@OriginalMember(owner = "client!g", name = "l", descriptor = "(I)B")
	public final byte method1278() {
		return (byte) (this.aByteArray16[this.anInt1772++] - 128);
	}

	@OriginalMember(owner = "client!g", name = "i", descriptor = "(B)I")
	public final int method1279() {
		@Pc(14) int local14 = 0;
		@Pc(25) byte local25;
		for (local25 = this.aByteArray16[this.anInt1772++]; local25 < 0; local25 = this.aByteArray16[this.anInt1772++]) {
			local14 = (local25 & 0x7F | local14) << 7;
		}
		return local14 | local25;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BZII)V")
	public final void method1280(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = (byte) (this.aByteArray16[this.anInt1772++] - 128);
		}
	}

	@OriginalMember(owner = "client!g", name = "m", descriptor = "(I)I")
	public final int method1281() {
		return this.aByteArray16[this.anInt1772++] & 0xFF;
	}

	@OriginalMember(owner = "client!g", name = "n", descriptor = "(I)B")
	public final byte method1282() {
		return (byte) (128 - this.aByteArray16[this.anInt1772++]);
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(Z)I")
	public final int method1283() {
		this.anInt1772 += 3;
		return (this.aByteArray16[this.anInt1772 - 2] & 0xFF) + ((this.aByteArray16[this.anInt1772 - 3] & 0xFF) << 16) + ((this.aByteArray16[this.anInt1772 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!g", name = "o", descriptor = "(I)I")
	public final int method1284() {
		this.anInt1772 += 4;
		return ((this.aByteArray16[this.anInt1772 - 1] & 0xFF) << 8) + ((this.aByteArray16[this.anInt1772 - 4] & 0xFF) << 16) + ((this.aByteArray16[this.anInt1772 + -3] & 0xFF) << 24) + (this.aByteArray16[this.anInt1772 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BIII)V")
	public final void method1285(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = this.aByteArray16[this.anInt1772++];
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[IBI)V")
	public final void method1286(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(15) int local15 = (arg1 - 5) / 8;
		@Pc(18) int local18 = this.anInt1772;
		this.anInt1772 = 5;
		for (@Pc(23) int local23 = 0; local23 < local15; local23++) {
			@Pc(28) int local28 = this.method1276();
			@Pc(30) int local30 = -957401312;
			@Pc(34) int local34 = this.method1276();
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local34 -= local28 + (local28 >>> 5 ^ local28 << 4) ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= -1640531527;
				local28 -= local34 + (local34 >>> 5 ^ local34 << 4) ^ local30 - -arg0[local30 & 0x3];
			}
			this.anInt1772 -= 8;
			this.method1298(local28);
			this.method1298(local34);
		}
		this.anInt1772 = local18;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(ZI)V")
	public final void method1287(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!g", name = "p", descriptor = "(I)I")
	public final int method1288() {
		this.anInt1772 += 2;
		@Pc(29) int local29 = ((this.aByteArray16[this.anInt1772 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt1772 - 2] - 128 & 0xFF);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!g", name = "q", descriptor = "(I)I")
	public final int method1289() {
		return this.aByteArray16[this.anInt1772++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(II)V")
	public final void method1290(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!g", name = "r", descriptor = "(I)J")
	public final long method1291() {
		@Pc(10) long local10 = (long) this.method1276() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method1276() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!g", name = "s", descriptor = "(I)I")
	public final int method1292() {
		this.anInt1772 += 2;
		@Pc(33) int local33 = ((this.aByteArray16[this.anInt1772 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt1772 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!g", name = "j", descriptor = "(B)I")
	public final int method1293() {
		return 128 - this.aByteArray16[this.anInt1772++] & 0xFF;
	}

	@OriginalMember(owner = "client!g", name = "t", descriptor = "(I)I")
	public final int method1294() {
		this.anInt1772 += 4;
		return (this.aByteArray16[this.anInt1772 - 4] & 0xFF) + ((this.aByteArray16[this.anInt1772 - 2] & 0xFF) << 16) + ((this.aByteArray16[this.anInt1772 + -1] & 0xFF) << 24) + ((this.aByteArray16[this.anInt1772 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(BI)V")
	public final void method1295(@OriginalArg(1) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!g", name = "h", descriptor = "(II)V")
	public final void method1296(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) arg0;
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!ke;)V")
	public final void method1297(@OriginalArg(1) Class39 arg0) {
		this.anInt1772 += arg0.method1094(arg0.method1088(), this.anInt1772, this.aByteArray16);
		this.aByteArray16[this.anInt1772++] = 0;
	}

	@OriginalMember(owner = "client!g", name = "i", descriptor = "(II)V")
	public final void method1298(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt1772++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt1772++] = (byte) arg0;
	}
}
