import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
	public int anInt1694;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub12(@OriginalArg(0) int arg0) {
		this.aByteArray12 = Static127.method2023(arg0);
		this.anInt1694 = 0;
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray12 = arg0;
		this.anInt1694 = 0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
	public final void method1168(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)I")
	public final int method1169() {
		@Pc(21) byte local21 = this.aByteArray12[this.anInt1694++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray12[this.anInt1694++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
	public final void method1170(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1694++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)V")
	public final void method1172(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1694++] = (byte) arg0;
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I")
	public final int method1173() {
		this.anInt1694 += 2;
		@Pc(41) int local41 = (this.aByteArray12[this.anInt1694 - 2] - 128 & 0xFF) + ((this.aByteArray12[this.anInt1694 - 1] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)I")
	public final int method1174() {
		this.anInt1694 += 3;
		return (this.aByteArray12[this.anInt1694 - 1] & 0xFF) + ((this.aByteArray12[this.anInt1694 - 3] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1694 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)V")
	public final void method1175(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1694++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)I")
	public final int method1176() {
		this.anInt1694 += 2;
		return (this.aByteArray12[this.anInt1694 - 1] & 0xFF) + ((this.aByteArray12[this.anInt1694 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
	public final void method1177(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(IB)I")
	public final int method1178(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static77.method1473(this.anInt1694, this.aByteArray12, arg0);
		this.method1193(local11);
		return local11;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)I")
	public final int method1180() {
		@Pc(7) int local7 = this.aByteArray12[this.anInt1694] & 0xFF;
		return local7 >= 128 ? this.method1176() - 32768 : this.method1190();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)I")
	public final int method1181() {
		this.anInt1694 += 2;
		@Pc(32) int local32 = ((this.aByteArray12[this.anInt1694 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt1694 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)B")
	public final byte method1182() {
		return (byte) -this.aByteArray12[this.anInt1694++];
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)I")
	public final int method1183() {
		this.anInt1694 += 2;
		return (this.aByteArray12[this.anInt1694 - 1] - 128 & 0xFF) + ((this.aByteArray12[this.anInt1694 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)I")
	public final int method1185() {
		@Pc(7) int local7 = this.aByteArray12[this.anInt1694] & 0xFF;
		return local7 < 128 ? this.method1190() - 64 : this.method1176() - 49152;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII[B)V")
	public final void method1186(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray12[this.anInt1694++];
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII[I)V")
	public final void method1187(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt1694;
		this.anInt1694 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local18; local24++) {
			@Pc(30) int local30 = this.method1210();
			@Pc(34) int local34 = this.method1210();
			@Pc(36) int local36 = 32;
			@Pc(38) int local38 = -957401312;
			while (local36-- > 0) {
				local34 -= local38 + arg1[local38 >>> 11 & 0xD9800003] ^ (local30 << 4 ^ local30 >>> 5) + local30;
				local38 -= -1640531527;
				local30 -= arg1[local38 & 0x3] + local38 ^ local34 + (local34 << 4 ^ local34 >>> 5);
			}
			this.anInt1694 -= 8;
			this.method1193(local30);
			this.method1193(local34);
		}
		this.anInt1694 = local8;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!sc;)V")
	public final void method1188(@OriginalArg(1) Class66 arg0) {
		this.anInt1694 += arg0.method1834(this.anInt1694, arg0.method1847(), this.aByteArray12);
		this.aByteArray12[this.anInt1694++] = 0;
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)I")
	public final int method1189() {
		this.anInt1694 += 4;
		return (this.aByteArray12[this.anInt1694 - 3] & 0xFF) + ((this.aByteArray12[this.anInt1694 - 4] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1694 + -2] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1694 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)I")
	public final int method1190() {
		return this.aByteArray12[this.anInt1694++] & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V")
	public final void method1191(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
	public final void method1192(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1197(arg0 >>> 28 | 0x80);
					}
					this.method1197(arg0 >>> 21 | 0x80);
				}
				this.method1197(arg0 >>> 14 | 0x80);
			}
			this.method1197(arg0 >>> 7 | 0x80);
		}
		this.method1197(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)V")
	public final void method1193(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1694++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)I")
	public final int method1194() {
		this.anInt1694 += 2;
		return ((this.aByteArray12[this.anInt1694 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt1694 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IJ)V")
	public final void method1195(@OriginalArg(1) long arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 56);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 48);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 40);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 32);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1694++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(II)V")
	public final void method1196(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) arg0;
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(II)V")
	public final void method1197(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(II)V")
	public final void method1198(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1197(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1175(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIII)V")
	public final void method1199(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			this.aByteArray12[this.anInt1694++] = arg0[local14];
		}
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(IB)V")
	public final void method1200(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) arg0;
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(B)B")
	public final byte method1201() {
		return (byte) (128 - this.aByteArray12[this.anInt1694++]);
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)I")
	public final int method1202() {
		return this.aByteArray12[this.anInt1694++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "(I)I")
	public final int method1203() {
		return -this.aByteArray12[this.anInt1694++] & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(II)V")
	public final void method1204(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IZ)V")
	public final void method1205(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "(I)I")
	public final int method1206() {
		this.anInt1694 += 2;
		@Pc(29) int local29 = (this.aByteArray12[this.anInt1694 - 1] - 128 & 0xFF) + ((this.aByteArray12[this.anInt1694 - 2] & 0xFF) << 8);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[BI)V")
	public final void method1207(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = this.aByteArray12[this.anInt1694++];
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public final void method1208(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1694;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt1694 = 0;
		this.method1186(local6, local9);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt1694 = 0;
		this.method1197(local31.length);
		this.method1199(local31, local31.length);
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(B)I")
	public final int method1209() {
		this.anInt1694 += 4;
		return (this.aByteArray12[this.anInt1694 - 4] & 0xFF) + (((this.aByteArray12[this.anInt1694 - 1] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1694 - 2] & 0xFF) << 16) + ((this.aByteArray12[this.anInt1694 + -3] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "(I)I")
	public final int method1210() {
		this.anInt1694 += 4;
		return (this.aByteArray12[this.anInt1694 - 1] & 0xFF) + ((this.aByteArray12[this.anInt1694 - 2] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1694 + -4] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1694 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "(I)B")
	public final byte method1211() {
		return this.aByteArray12[this.anInt1694++];
	}

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "(I)I")
	public final int method1212() {
		return 128 - this.aByteArray12[this.anInt1694++] & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JB)V")
	public final void method1213(@OriginalArg(0) long arg0) {
		this.method1220((int) (arg0 >> 32));
		this.method1220((int) arg0);
	}

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "(I)Lclient!sc;")
	public final Class66 method1214() {
		@Pc(6) int local6 = this.anInt1694;
		while (this.aByteArray12[this.anInt1694++] != 0) {
		}
		return Static38.method2001(local6, this.anInt1694 - local6 - 1, this.aByteArray12);
	}

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "(I)I")
	public final int method1215() {
		this.anInt1694 += 3;
		return (this.aByteArray12[this.anInt1694 - 1] & 0xFF) + ((this.aByteArray12[this.anInt1694 - 2] & 0xFF) << 8) + ((this.aByteArray12[this.anInt1694 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "(I)Lclient!sc;")
	public final Class66 method1216() {
		if (this.aByteArray12[this.anInt1694] == 0) {
			this.anInt1694++;
			return null;
		} else {
			return this.method1214();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(BI)V")
	public final void method1217(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 + 128);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(II)V")
	public final void method1218(@OriginalArg(1) int arg0) {
		this.aByteArray12[this.anInt1694 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1694 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt1694 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1694 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(B)J")
	public final long method1219() {
		@Pc(17) long local17 = (long) this.method1210() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method1210() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(II)V")
	public final void method1220(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt1694++] = (byte) arg0;
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt1694++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "(I)I")
	public final int method1221() {
		this.anInt1694 += 4;
		return (this.aByteArray12[this.anInt1694 - 2] & 0xFF) + ((this.aByteArray12[this.anInt1694 - 3] & 0xFF) << 24) + ((this.aByteArray12[this.anInt1694 - 4] & 0xFF) << 16) + ((this.aByteArray12[this.anInt1694 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "(I)I")
	public final int method1222() {
		this.anInt1694 += 2;
		return ((this.aByteArray12[this.anInt1694 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt1694 - 2] - 128 & 0xFF);
	}
}
