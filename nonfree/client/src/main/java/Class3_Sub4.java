import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
	public int anInt1758 = 0;

	@OriginalMember(owner = "client!ce", name = "yb", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4(@OriginalArg(0) int arg0) {
		this.aByteArray12 = Static195.method3041(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray12 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
	public final void method1239(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[BI)V")
	public final void method1240(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			arg0[local15] = (byte) (this.aByteArray12[this.anInt1758++] - 128);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	public final int method1242() {
		this.anInt1758 += 4;
		return (this.aByteArray12[this.anInt1758 - 2] & 0xFF) + (((this.aByteArray12[this.anInt1758 - 3] & 0xFF) << 24) - (-((this.aByteArray12[this.anInt1758 - 4] & 0xFF) << 16) - ((this.aByteArray12[this.anInt1758 - 1] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I")
	public final int method1243() {
		return 128 - this.aByteArray12[this.anInt1758++] & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)V")
	public final void method1244(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1758 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1758 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1758 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1758 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
	public final int method1245() {
		this.anInt1758 += 4;
		return (this.aByteArray12[this.anInt1758 - 1] & 0xFF) + ((this.aByteArray12[this.anInt1758 - 2] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1758 - 4] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1758 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lclient!oc;")
	public final Class70 method1246() {
		@Pc(7) int local7 = this.anInt1758;
		while (this.aByteArray12[this.anInt1758++] != 0) {
		}
		return Static12.method263(this.anInt1758 - local7 - 1, local7, this.aByteArray12);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)J")
	public final long method1247(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local0 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray12[this.anInt1758++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)B")
	public final byte method1248() {
		return this.aByteArray12[this.anInt1758++];
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)Lclient!oc;")
	public final Class70 method1249() {
		if (this.aByteArray12[this.anInt1758] == 0) {
			this.anInt1758++;
			return null;
		} else {
			return this.method1246();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)V")
	public final void method1250(@OriginalArg(1) long arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 56);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 48);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 40);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 32);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1758++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)V")
	public final void method1252(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1758++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)I")
	public final int method1253() {
		@Pc(14) int local14 = this.method1266();
		@Pc(16) int local16 = 0;
		while (local14 == 32767) {
			local16 += 32767;
			local14 = this.method1266();
		}
		return local16 + local14;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[IB)V")
	public final void method1254(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) int local14 = this.anInt1758;
		@Pc(21) int local21 = (arg0 - 5) / 8;
		this.anInt1758 = 5;
		for (@Pc(26) int local26 = 0; local26 < local21; local26++) {
			@Pc(31) int local31 = this.method1245();
			@Pc(35) int local35 = this.method1245();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= local37 + arg1[local37 >>> 11 & 0x3] ^ local31 + (local31 << 4 ^ local31 >>> 5);
				local37 -= -1640531527;
				local31 -= arg1[local37 & 0x3] + local37 ^ (local35 << 4 ^ local35 >>> 5) - -local35;
			}
			this.anInt1758 -= 8;
			this.method1285(local31);
			this.method1285(local35);
		}
		this.anInt1758 = local14;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method1255(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1758;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt1758 = 0;
		this.method1268(local9, local6);
		@Pc(31) BigInteger local31 = new BigInteger(local9);
		@Pc(36) BigInteger local36 = local31.modPow(arg0, arg1);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt1758 = 0;
		this.method1239(local39.length);
		this.method1277(local39, local39.length);
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)I")
	public final int method1256() {
		@Pc(19) byte local19 = this.aByteArray12[this.anInt1758++];
		@Pc(21) int local21 = 0;
		while (local19 < 0) {
			local21 = (local21 | local19 & 0x7F) << 7;
			local19 = this.aByteArray12[this.anInt1758++];
		}
		return local21 | local19;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)I")
	public final int method1257() {
		this.anInt1758 += 2;
		return ((this.aByteArray12[this.anInt1758 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt1758 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)I")
	public final int method1258() {
		this.anInt1758 += 3;
		return ((this.aByteArray12[this.anInt1758 - 1] & 0xFF) << 16) + ((this.aByteArray12[this.anInt1758 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt1758 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)I")
	public final int method1259(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static157.method2363(this.aByteArray12, arg0, this.anInt1758);
		this.method1285(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)B")
	public final byte method1260() {
		return (byte) (this.aByteArray12[this.anInt1758++] - 128);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBJ)V")
	public final void method1261(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(28) int local28 = local4 * 8; local28 >= 0; local28 -= 8) {
			this.aByteArray12[this.anInt1758++] = (byte) (arg1 >> local28);
		}
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)I")
	public final int method1262() {
		this.anInt1758 += 4;
		return ((this.aByteArray12[this.anInt1758 - 4] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1758 - 2] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1758 - 1] & 0xFF) << 16) + (this.aByteArray12[this.anInt1758 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)V")
	public final void method1264(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 + 128);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IB)V")
	public final void method1265(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1758 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)I")
	public final int method1266() {
		@Pc(16) int local16 = this.aByteArray12[this.anInt1758] & 0xFF;
		return local16 >= 128 ? this.method1270() - 32768 : this.method1278();
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(B)I")
	public final int method1267() {
		this.anInt1758 += 2;
		@Pc(36) int local36 = (this.aByteArray12[this.anInt1758 - 1] & 0xFF) + ((this.aByteArray12[this.anInt1758 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[BII)V")
	public final void method1268(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = this.aByteArray12[this.anInt1758++];
		}
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(I)B")
	public final byte method1269() {
		return (byte) -this.aByteArray12[this.anInt1758++];
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(Z)I")
	public final int method1270() {
		this.anInt1758 += 2;
		return ((this.aByteArray12[this.anInt1758 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt1758 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "(I)I")
	public final int method1271() {
		this.anInt1758 += 3;
		return (this.aByteArray12[this.anInt1758 - 1] & 0xFF) + ((this.aByteArray12[this.anInt1758 - 3] & 0xFF) << 16) + ((this.aByteArray12[this.anInt1758 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "(I)J")
	public final long method1272() {
		@Pc(17) long local17 = (long) this.method1245() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1245() & 0xFFFFFFFFL;
		return (local17 << 32) + local24;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(II)V")
	public final void method1273(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) arg0;
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!oc;)V")
	public final void method1274(@OriginalArg(1) Class70 arg0) {
		this.anInt1758 += arg0.method2024(arg0.method2045(), this.aByteArray12, this.anInt1758);
		this.aByteArray12[this.anInt1758++] = 0;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(II)V")
	public final void method1275(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) arg0;
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(BI)V")
	public final void method1276(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1758++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIII)V")
	public final void method1277(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			this.aByteArray12[this.anInt1758++] = arg0[local13];
		}
	}

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "(I)I")
	public final int method1278() {
		return this.aByteArray12[this.anInt1758++] & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "(I)I")
	public final int method1279() {
		this.anInt1758 += 4;
		return (this.aByteArray12[this.anInt1758 - 4] & 0xFF) + ((this.aByteArray12[this.anInt1758 - 3] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1758 - 1] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1758 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "(I)I")
	public final int method1280() {
		this.anInt1758 += 2;
		return ((this.aByteArray12[this.anInt1758 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt1758 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(B)I")
	public final int method1281() {
		return this.aByteArray12[this.anInt1758++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "(I)I")
	public final int method1282() {
		this.anInt1758 += 2;
		@Pc(30) int local30 = ((this.aByteArray12[this.anInt1758 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt1758 - 1] - 128 & 0xFF);
		if (local30 > 32767) {
			local30 -= 65536;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(II)V")
	public final void method1283(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1758++] = (byte) arg0;
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(II)V")
	public final void method1284(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(II)V")
	public final void method1285(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1758++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "(I)I")
	public final int method1286() {
		return -this.aByteArray12[this.anInt1758++] & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IJ)V")
	public final void method1287(@OriginalArg(1) long arg0) {
		this.method1283((int) (arg0 >> 32));
		this.method1283((int) arg0);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(BI)V")
	public final void method1288(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1239(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1252(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(II)V")
	public final void method1289(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(BI)V")
	public final void method1290(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1239(arg0 >>> 28 | 0x80);
					}
					this.method1239(arg0 >>> 21 | 0x80);
				}
				this.method1239(arg0 >>> 14 | 0x80);
			}
			this.method1239(arg0 >>> 7 | 0x80);
		}
		this.method1239(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(B)I")
	public final int method1291() {
		@Pc(7) int local7 = this.aByteArray12[this.anInt1758] & 0xFF;
		return local7 < 128 ? this.method1278() - 64 : this.method1270() + -49152;
	}

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "(II)V")
	public final void method1292(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
	public final void method1293(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1758++] = (byte) arg0;
		this.aByteArray12[this.anInt1758++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(B)I")
	public final int method1294() {
		this.anInt1758 += 2;
		@Pc(39) int local39 = ((this.aByteArray12[this.anInt1758 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt1758 - 2] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "(I)I")
	public final int method1295() {
		this.anInt1758 += 2;
		return ((this.aByteArray12[this.anInt1758 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt1758 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "(I)B")
	public final byte method1296() {
		return (byte) (128 - this.aByteArray12[this.anInt1758++]);
	}
}
