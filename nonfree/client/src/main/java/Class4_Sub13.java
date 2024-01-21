import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "I")
	public int anInt1643;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
	public Class4_Sub13(@OriginalArg(0) int arg0) {
		this.aByteArray68 = Static101.method1807(arg0);
		this.anInt1643 = 0;
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V")
	public Class4_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray68 = arg0;
		this.anInt1643 = 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([BIII)V")
	public final void method1203(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray68[this.anInt1643++] - 128);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V")
	public final void method1204(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt1643 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V")
	public final void method1205(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1209(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1252(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
	public final void method1206(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1209(arg0 >>> 28 | 0x80);
					}
					this.method1209(arg0 >>> 21 | 0x80);
				}
				this.method1209(arg0 >>> 14 | 0x80);
			}
			this.method1209(arg0 >>> 7 | 0x80);
		}
		this.method1209(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
	public final void method1207(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 + 128);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(ZI)V")
	public final void method1208(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(ZI)V")
	public final void method1209(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)I")
	public final int method1210() {
		this.anInt1643 += 2;
		return (this.aByteArray68[this.anInt1643 - 2] - 128 & 0xFF) + ((this.aByteArray68[this.anInt1643 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)B")
	public final byte method1211() {
		return (byte) (this.aByteArray68[this.anInt1643++] - 128);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
	public final int method1212() {
		@Pc(16) int local16 = this.aByteArray68[this.anInt1643] & 0xFF;
		return local16 >= 128 ? this.method1244() - 49152 : this.method1223() - 64;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)I")
	public final int method1213() {
		this.anInt1643 += 2;
		@Pc(42) int local42 = (this.aByteArray68[this.anInt1643 - 2] - 128 & 0xFF) + ((this.aByteArray68[this.anInt1643 - 1] & 0xFF) << 8);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([IIII)V")
	public final void method1214(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt1643;
		@Pc(15) int local15 = (arg1 - 5) / 8;
		this.anInt1643 = 5;
		for (@Pc(24) int local24 = 0; local24 < local15; local24++) {
			@Pc(30) int local30 = this.method1215();
			@Pc(34) int local34 = this.method1215();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= (local30 >>> 5 ^ local30 << 4) + local30 ^ local36 - -arg0[local36 >>> 11 & 0x3A400003];
				local36 -= -1640531527;
				local30 -= local36 + arg0[local36 & 0x3] ^ (local34 << 4 ^ local34 >>> 5) - -local34;
			}
			this.anInt1643 -= 8;
			this.method1221(local30);
			this.method1221(local34);
		}
		this.anInt1643 = local8;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)I")
	public final int method1215() {
		this.anInt1643 += 4;
		return ((this.aByteArray68[this.anInt1643 - 4] & 0xFF) << 24) + ((this.aByteArray68[this.anInt1643 - 3] & 0xFF) << 16) + ((this.aByteArray68[this.anInt1643 + -2] & 0xFF) << 8) + (this.aByteArray68[this.anInt1643 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(JI)V")
	public final void method1216(@OriginalArg(0) long arg0) {
		this.method1256((int) (arg0 >> 32));
		this.method1256((int) arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	public final void method1218(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt1643++] = (byte) arg0;
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IB)V")
	public final void method1219(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt1643++] = (byte) arg0;
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
	public final void method1220(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) arg0;
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
	public final void method1221(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt1643++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Lclient!qc;")
	public final Class60 method1222() {
		if (this.aByteArray68[this.anInt1643] == 0) {
			this.anInt1643++;
			return null;
		} else {
			return this.method1249();
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)I")
	public final int method1223() {
		return this.aByteArray68[this.anInt1643++] & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)B")
	public final byte method1224() {
		return this.aByteArray68[this.anInt1643++];
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!qc;)V")
	public final void method1225(@OriginalArg(1) Class60 arg0) {
		this.anInt1643 += arg0.method1664(this.anInt1643, this.aByteArray68, arg0.method1644());
		this.aByteArray68[this.anInt1643++] = 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III[B)V")
	public final void method1226(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray68[this.anInt1643++];
		}
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)B")
	public final byte method1227() {
		return (byte) -this.aByteArray68[this.anInt1643++];
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(ZI)V")
	public final void method1228(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(B)I")
	public final int method1229() {
		return this.aByteArray68[this.anInt1643++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(I)I")
	public final int method1230() {
		this.anInt1643 += 4;
		return (this.aByteArray68[this.anInt1643 - 4] & 0xFF) + ((this.aByteArray68[this.anInt1643 - 3] & 0xFF) << 8) + ((this.aByteArray68[this.anInt1643 + -2] & 0xFF) << 16) + ((this.aByteArray68[this.anInt1643 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method1231(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1643;
		this.anInt1643 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1226(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt1643 = 0;
		this.method1209(local31.length);
		this.method1240(local31, local31.length);
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(B)I")
	public final int method1232() {
		this.anInt1643 += 2;
		return ((this.aByteArray68[this.anInt1643 - 1] & 0xFF) << 8) + (this.aByteArray68[this.anInt1643 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(I)I")
	public final int method1234() {
		this.anInt1643 += 4;
		return ((this.aByteArray68[this.anInt1643 - 1] & 0xFF) << 16) + ((this.aByteArray68[this.anInt1643 - 2] << 24 & 0xFF000000) + (this.aByteArray68[this.anInt1643 - 4] << 8 & 0xFF00) + (this.aByteArray68[this.anInt1643 + -3] & 0xFF));
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(B)I")
	public final int method1235() {
		return -this.aByteArray68[this.anInt1643++] & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(B)I")
	public final int method1236() {
		this.anInt1643 += 2;
		return (this.aByteArray68[this.anInt1643 - 1] - 128 & 0xFF) + ((this.aByteArray68[this.anInt1643 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "(I)I")
	public final int method1237() {
		@Pc(11) int local11 = this.aByteArray68[this.anInt1643] & 0xFF;
		return local11 < 128 ? this.method1223() : this.method1244() - 32768;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(IB)V")
	public final void method1238(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(B)I")
	public final int method1239() {
		@Pc(3) int local3 = 0;
		@Pc(23) byte local23;
		for (local23 = this.aByteArray68[this.anInt1643++]; local23 < 0; local23 = this.aByteArray68[this.anInt1643++]) {
			local3 = (local3 | local23 & 0x7F) << 7;
		}
		return local23 | local3;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II[BI)V")
	public final void method1240(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray68[this.anInt1643++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "(B)I")
	public final int method1241() {
		this.anInt1643 += 3;
		return (this.aByteArray68[this.anInt1643 - 1] & 0xFF) + ((this.aByteArray68[this.anInt1643 - 2] & 0xFF) << 8) + ((this.aByteArray68[this.anInt1643 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BJ)V")
	public final void method1242(@OriginalArg(1) long arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 56);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 48);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 40);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 32);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt1643++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "k", descriptor = "(I)I")
	public final int method1243() {
		this.anInt1643 += 2;
		@Pc(36) int local36 = ((this.aByteArray68[this.anInt1643 - 1] & 0xFF) << 8) + (this.aByteArray68[this.anInt1643 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(Z)I")
	public final int method1244() {
		this.anInt1643 += 2;
		return (this.aByteArray68[this.anInt1643 - 1] & 0xFF) + ((this.aByteArray68[this.anInt1643 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V")
	public final void method1245(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt1643++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "k", descriptor = "(B)I")
	public final int method1246() {
		this.anInt1643 += 2;
		@Pc(39) int local39 = (this.aByteArray68[this.anInt1643 - 1] & 0xFF) + ((this.aByteArray68[this.anInt1643 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(ZI)I")
	public final int method1247(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static103.method1233(arg0, this.anInt1643, this.aByteArray68);
		this.method1221(local18);
		return local18;
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(I)I")
	public final int method1248() {
		this.anInt1643 += 2;
		@Pc(41) int local41 = ((this.aByteArray68[this.anInt1643 - 2] & 0xFF) << 8) + (this.aByteArray68[this.anInt1643 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(B)Lclient!qc;")
	public final Class60 method1249() {
		@Pc(13) int local13 = this.anInt1643;
		while (this.aByteArray68[this.anInt1643++] != 0) {
		}
		return Static117.method1958(local13, this.aByteArray68, this.anInt1643 - local13 - 1);
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(Z)J")
	public final long method1250() {
		@Pc(15) long local15 = (long) this.method1215() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1215() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(BI)V")
	public final void method1252(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt1643++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "m", descriptor = "(I)I")
	public final int method1253() {
		this.anInt1643 += 4;
		return (this.aByteArray68[this.anInt1643 - 2] & 0xFF) + (((this.aByteArray68[this.anInt1643 - 1] & 0xFF) << 8) + ((this.aByteArray68[this.anInt1643 - 3] & 0xFF) << 24) + ((this.aByteArray68[this.anInt1643 + -4] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(BI)V")
	public final void method1254(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt1643 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt1643 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt1643 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt1643 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!re", name = "n", descriptor = "(I)I")
	public final int method1255() {
		return 128 - this.aByteArray68[this.anInt1643++] & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(II)V")
	public final void method1256(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt1643++] = (byte) arg0;
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt1643++] = (byte) (arg0 >> 24);
	}
}
