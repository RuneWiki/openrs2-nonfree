import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
	public int anInt1597;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray19 = Static148.method2494(arg0);
		this.anInt1597 = 0;
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "([B)V")
	public Class4_Sub11(@OriginalArg(0) byte[] arg0) {
		this.anInt1597 = 0;
		this.aByteArray19 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)I")
	public final int method1221() {
		return 128 - this.aByteArray19[this.anInt1597++] & 0xFF;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
	public final void method1222(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(B)I")
	public final int method1224() {
		this.anInt1597 += 2;
		return ((this.aByteArray19[this.anInt1597 - 1] & 0xFF) << 8) + (this.aByteArray19[this.anInt1597 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)I")
	public final int method1225() {
		this.anInt1597 += 3;
		return (this.aByteArray19[this.anInt1597 - 1] & 0xFF) + ((this.aByteArray19[this.anInt1597 - 2] & 0xFF) << 8) + ((this.aByteArray19[this.anInt1597 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III[B)V")
	public final void method1226(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			arg1[local14] = this.aByteArray19[this.anInt1597++];
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(B)I")
	public final int method1227() {
		this.anInt1597 += 2;
		@Pc(37) int local37 = ((this.aByteArray19[this.anInt1597 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt1597 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)I")
	public final int method1228() {
		return -this.aByteArray19[this.anInt1597++] & 0xFF;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IJ)V")
	public final void method1229(@OriginalArg(1) long arg0) {
		this.method1248((int) (arg0 >> 32));
		this.method1248((int) arg0);
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(B)I")
	public final int method1230() {
		this.anInt1597 += 2;
		@Pc(41) int local41 = ((this.aByteArray19[this.anInt1597 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt1597 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V")
	public final void method1231(@OriginalArg(1) int arg0) {
		this.aByteArray19[this.anInt1597 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public final void method1232(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(12) int local12 = this.anInt1597;
		this.anInt1597 = 0;
		@Pc(18) byte[] local18 = new byte[local12];
		this.method1226(local12, local18);
		@Pc(29) BigInteger local29 = new BigInteger(local18);
		@Pc(34) BigInteger local34 = local29.modPow(arg1, arg0);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt1597 = 0;
		this.method1238(local37.length);
		this.method1239(local37, local37.length);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([BIII)V")
	public final void method1233(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = this.aByteArray19[this.anInt1597++];
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI[II)V")
	public final void method1234(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt1597;
		this.anInt1597 = 5;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) int local25 = this.method1263();
			@Pc(29) int local29 = this.method1263();
			@Pc(31) int local31 = -957401312;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local29 -= (local25 << 4 ^ local25 >>> 5) + local25 ^ local31 - -arg1[local31 >>> 11 & 0x3];
				local31 -= -1640531527;
				local25 -= arg1[local31 & 0x3] + local31 ^ local29 + (local29 >>> 5 ^ local29 << 4);
			}
			this.anInt1597 -= 8;
			this.method1256(local25);
			this.method1256(local29);
		}
		this.anInt1597 = local8;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(B)I")
	public final int method1235() {
		this.anInt1597 += 2;
		return (this.aByteArray19[this.anInt1597 - 1] - 128 & 0xFF) + ((this.aByteArray19[this.anInt1597 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(IB)V")
	public final void method1236(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1597++] = (byte) arg0;
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(IB)V")
	public final void method1237(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
	public final void method1238(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "([BIII)V")
	public final void method1239(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			this.aByteArray19[this.anInt1597++] = arg0[local14];
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)I")
	public final int method1240() {
		@Pc(12) int local12 = this.aByteArray19[this.anInt1597] & 0xFF;
		return local12 >= 128 ? this.method1252() - 32768 : this.method1253();
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)B")
	public final byte method1241() {
		return this.aByteArray19[this.anInt1597++];
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)I")
	public final int method1243() {
		this.anInt1597 += 4;
		return ((this.aByteArray19[this.anInt1597 - 2] & 0xFF) << 16) + (this.aByteArray19[this.anInt1597 - 1] << 24 & 0xFF000000) + ((this.aByteArray19[this.anInt1597 + -3] & 0xFF) << 8) + (this.aByteArray19[this.anInt1597 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)B")
	public final byte method1244() {
		return (byte) -this.aByteArray19[this.anInt1597++];
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)I")
	public final int method1245() {
		this.anInt1597 += 4;
		return (this.aByteArray19[this.anInt1597 - 3] & 0xFF) + ((this.aByteArray19[this.anInt1597 - 1] & 0xFF) << 16) + ((this.aByteArray19[this.anInt1597 + -2] & 0xFF) << 24) + ((this.aByteArray19[this.anInt1597 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(I)Lclient!jd;")
	public final Class46 method1246() {
		if (this.aByteArray19[this.anInt1597] == 0) {
			this.anInt1597++;
			return null;
		} else {
			return this.method1247();
		}
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(B)Lclient!jd;")
	public final Class46 method1247() {
		@Pc(6) int local6 = this.anInt1597;
		while (this.aByteArray19[this.anInt1597++] != 0) {
		}
		return Static160.method2722(this.anInt1597 - local6 - 1, local6, this.aByteArray19);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)V")
	public final void method1248(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1597++] = (byte) arg0;
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(IB)V")
	public final void method1249(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1597++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(IB)V")
	public final void method1251(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 + 128);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(I)I")
	public final int method1252() {
		this.anInt1597 += 2;
		return (this.aByteArray19[this.anInt1597 - 1] & 0xFF) + ((this.aByteArray19[this.anInt1597 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(I)I")
	public final int method1253() {
		return this.aByteArray19[this.anInt1597++] & 0xFF;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(II)V")
	public final void method1254(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1238(arg0 >>> 28 | 0x80);
					}
					this.method1238(arg0 >>> 21 | 0x80);
				}
				this.method1238(arg0 >>> 14 | 0x80);
			}
			this.method1238(arg0 >>> 7 | 0x80);
		}
		this.method1238(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(B)I")
	public final int method1255() {
		@Pc(16) int local16 = this.aByteArray19[this.anInt1597] & 0xFF;
		return local16 >= 128 ? this.method1252() - 49152 : this.method1253() + -64;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(II)V")
	public final void method1256(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1597++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(II)I")
	public final int method1257(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static39.method692(this.anInt1597, arg0, this.aByteArray19);
		this.method1256(local7);
		return local7;
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(I)J")
	public final long method1258() {
		@Pc(10) long local10 = (long) this.method1263() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1263() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "(I)I")
	public final int method1259() {
		@Pc(20) byte local20 = this.aByteArray19[this.anInt1597++];
		@Pc(26) int local26 = 0;
		while (local20 < 0) {
			local26 = (local26 | local20 & 0x7F) << 7;
			local20 = this.aByteArray19[this.anInt1597++];
		}
		return local20 | local26;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(IB)V")
	public final void method1260(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) arg0;
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(I)I")
	public final int method1261() {
		this.anInt1597 += 4;
		return ((this.aByteArray19[this.anInt1597 - 3] & 0xFF) << 24) + (this.aByteArray19[this.anInt1597 - 4] << 16 & 0xFF0000) + ((this.aByteArray19[this.anInt1597 + -1] & 0xFF) << 8) + (this.aByteArray19[this.anInt1597 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!h", name = "p", descriptor = "(I)I")
	public final int method1263() {
		this.anInt1597 += 4;
		return (this.aByteArray19[this.anInt1597 - 1] & 0xFF) + ((this.aByteArray19[this.anInt1597 - 2] & 0xFF) << 8) + ((this.aByteArray19[this.anInt1597 + -4] & 0xFF) << 24) + ((this.aByteArray19[this.anInt1597 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[BII)V")
	public final void method1264(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray19[this.anInt1597++] - 128);
		}
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(II)V")
	public final void method1265(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!h", name = "q", descriptor = "(I)I")
	public final int method1266() {
		this.anInt1597 += 2;
		@Pc(30) int local30 = ((this.aByteArray19[this.anInt1597 - 1] & 0xFF) << 8) + (this.aByteArray19[this.anInt1597 - 2] - 128 & 0xFF);
		if (local30 > 32767) {
			local30 -= 65536;
		}
		return local30;
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(II)V")
	public final void method1268(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1597++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZJ)V")
	public final void method1269(@OriginalArg(1) long arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 56);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 48);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 40);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 32);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1597++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(II)V")
	public final void method1270(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) arg0;
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!h", name = "r", descriptor = "(I)I")
	public final int method1271() {
		return this.aByteArray19[this.anInt1597++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!h", name = "s", descriptor = "(I)I")
	public final int method1272() {
		this.anInt1597 += 3;
		return ((this.aByteArray19[this.anInt1597 - 3] & 0xFF) << 16) + ((this.aByteArray19[this.anInt1597 - 1] & 0xFF) << 8) + (this.aByteArray19[this.anInt1597 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZ)V")
	public final void method1273(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt1597 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt1597 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt1597 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1597 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(II)V")
	public final void method1274(@OriginalArg(1) int arg0) {
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt1597++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "(I)I")
	public final int method1275() {
		this.anInt1597 += 2;
		return (this.aByteArray19[this.anInt1597 - 2] - 128 & 0xFF) + ((this.aByteArray19[this.anInt1597 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!jd;I)V")
	public final void method1276(@OriginalArg(0) Class46 arg0) {
		this.anInt1597 += arg0.method1675(this.aByteArray19, arg0.method1677(), this.anInt1597);
		this.aByteArray19[this.anInt1597++] = 0;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(BI)V")
	public final void method1277(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1238(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1268(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "(I)I")
	public final int method1278() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = this.method1240();
		while (local16 == 32767) {
			local16 = this.method1240();
			local7 += 32767;
		}
		return local7 + local16;
	}
}
