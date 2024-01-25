import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ia", name = "Wb", descriptor = "[Lclient!ud;")
	private static final Class247[] aClass247Array3 = new Class247[32];

	@OriginalMember(owner = "client!ia", name = "xb", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!ia", name = "wb", descriptor = "I")
	public int anInt1710;

	static {
		@Pc(103) Class247[] local103 = Static204.method3264();
		for (@Pc(105) int local105 = 0; local105 < local103.length; local105++) {
			aClass247Array3[local103[local105].anInt7273] = local103[local105];
		}
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3(@OriginalArg(0) int arg0) {
		this.aByteArray14 = Static364.method5095(arg0);
		this.anInt1710 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray14 = arg0;
		this.anInt1710 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)J")
	public final long method1162() {
		@Pc(15) long local15 = (long) this.method1188() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1188() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V")
	public final void method1163(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)V")
	public final void method1164(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	public final void method1165(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)I")
	public final int method1166() {
		this.anInt1710 += 3;
		return (this.aByteArray14[this.anInt1710 - 2] & 0xFF) + ((this.aByteArray14[this.anInt1710 - 1] & 0xFF) << 8) + ((this.aByteArray14[this.anInt1710 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)V")
	public final void method1167(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)I")
	public final int method1168() {
		@Pc(18) int local18 = this.aByteArray14[this.anInt1710] & 0xFF;
		return local18 < 128 ? this.method1171() : this.method1177() - 32768;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(II)V")
	public final void method1169(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1208(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1227(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)I")
	public final int method1170() {
		return -this.aByteArray14[this.anInt1710++] & 0xFF;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)I")
	public final int method1171() {
		return this.aByteArray14[this.anInt1710++] & 0xFF;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)I")
	public final int method1172() {
		this.anInt1710 += 4;
		return ((this.aByteArray14[this.anInt1710 - 3] & 0xFF) << 24) + (this.aByteArray14[this.anInt1710 - 2] & 0xFF) - (-((this.aByteArray14[this.anInt1710 - 4] & 0xFF) << 16) - ((this.aByteArray14[this.anInt1710 - 1] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BIII)V")
	public final void method1173(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = this.aByteArray14[this.anInt1710++];
		}
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(II)V")
	public final void method1174(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1208(arg0 >>> 28 | 0x80);
					}
					this.method1208(arg0 >>> 21 | 0x80);
				}
				this.method1208(arg0 >>> 14 | 0x80);
			}
			this.method1208(arg0 >>> 7 | 0x80);
		}
		this.method1208(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(II)V")
	public final void method1175(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)Z")
	public final boolean method1176() {
		this.anInt1710 -= 4;
		@Pc(22) int local22 = Static198.method6179(this.anInt1710, this.aByteArray14, 0);
		@Pc(26) int local26 = this.method1188();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)I")
	public final int method1177() {
		this.anInt1710 += 2;
		return ((this.aByteArray14[this.anInt1710 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt1710 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method1178() {
		@Pc(14) byte local14 = this.aByteArray14[this.anInt1710++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt1710;
		while (this.aByteArray14[this.anInt1710++] != 0) {
		}
		@Pc(57) int local57 = this.anInt1710 - local27 - 1;
		return local57 == 0 ? "" : Static289.method4251(local57, local27, this.aByteArray14);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V")
	public final void method1179(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt1710 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt1710 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IJ)V")
	public final void method1180(@OriginalArg(1) long arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 56);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 48);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 40);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 32);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "([BIII)V")
	public final void method1181(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			this.aByteArray14[this.anInt1710++] = arg0[local9];
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)I")
	public final int method1182() {
		@Pc(16) int local16 = this.aByteArray14[this.anInt1710] & 0xFF;
		return local16 < 128 ? this.method1171() - 64 : this.method1177() + -49152;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method1183(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1710;
		this.anInt1710 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method1173(local12, local6);
		@Pc(25) BigInteger local25 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local25.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt1710 = 0;
		this.method1227(local38.length);
		this.method1181(local38, local38.length);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(IB)V")
	public final void method1184(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
	public final void method1185(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)I")
	public final int method1186() {
		this.anInt1710 += 4;
		return ((this.aByteArray14[this.anInt1710 - 2] & 0xFF) << 24) + ((this.aByteArray14[this.anInt1710 - 1] & 0xFF) << 16) + ((this.aByteArray14[this.anInt1710 - 4] & 0xFF) << 8) + (this.aByteArray14[this.anInt1710 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(B)I")
	public final int method1187() {
		this.anInt1710 += 4;
		return (this.aByteArray14[this.anInt1710 - 4] & 0xFF) + ((this.aByteArray14[this.anInt1710 - 3] & 0xFF) << 8) + ((this.aByteArray14[this.anInt1710 - 2] & 0xFF) << 16) + ((this.aByteArray14[this.anInt1710 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)I")
	public final int method1188() {
		this.anInt1710 += 4;
		return (this.aByteArray14[this.anInt1710 - 1] & 0xFF) + ((this.aByteArray14[this.anInt1710 - 3] & 0xFF) << 16) + ((this.aByteArray14[this.anInt1710 - 4] & 0xFF) << 24) + ((this.aByteArray14[this.anInt1710 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)B")
	public final byte method1189() {
		return (byte) (128 - this.aByteArray14[this.anInt1710++]);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method1190(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt1710 += Static310.method4465(arg0, this.aByteArray14, this.anInt1710, arg0.length());
		this.aByteArray14[this.anInt1710++] = 0;
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "(I)I")
	public final int method1191() {
		this.anInt1710 += 2;
		@Pc(33) int local33 = (this.aByteArray14[this.anInt1710 - 1] - 128 & 0xFF) + ((this.aByteArray14[this.anInt1710 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "(II)I")
	public final int method1192(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static198.method6179(this.anInt1710, this.aByteArray14, arg0);
		this.method1197(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "(I)B")
	public final byte method1193() {
		return (byte) (this.aByteArray14[this.anInt1710++] - 128);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method1194(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = Static83.method1516(arg0);
		this.aByteArray14[this.anInt1710++] = 0;
		this.method1174(local12);
		this.anInt1710 += Static190.method3097(arg0, this.aByteArray14, this.anInt1710);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([IIII)V")
	public final void method1195(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) int local6 = this.anInt1710;
		this.anInt1710 = 5;
		@Pc(15) int local15 = (arg1 - 5) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(22) int local22 = this.method1188();
			@Pc(26) int local26 = this.method1188();
			@Pc(28) int local28 = -957401312;
			@Pc(32) int local32 = 32;
			while (local32-- > 0) {
				local26 -= local28 + arg0[local28 >>> 11 & 0x3] ^ local22 + (local22 << 4 ^ local22 >>> 5);
				local28 -= -1640531527;
				local22 -= arg0[local28 & 0x3] + local28 ^ local26 + (local26 >>> 5 ^ local26 << 4);
			}
			this.anInt1710 -= 8;
			this.method1197(local22);
			this.method1197(local26);
		}
		this.anInt1710 = local6;
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "(II)V")
	public final void method1196(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(IB)V")
	public final void method1197(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "(I)I")
	public final int method1198() {
		@Pc(19) int local19 = Static198.method6179(this.anInt1710, this.aByteArray14, 0);
		this.method1197(local19);
		return local19;
	}

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "(II)V")
	public final void method1199(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method1201() {
		@Pc(6) int local6 = this.anInt1710;
		while (this.aByteArray14[this.anInt1710++] != 0) {
		}
		@Pc(29) int local29 = this.anInt1710 - local6 - 1;
		return local29 == 0 ? "" : Static289.method4251(local29, local6, this.aByteArray14);
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "(B)I")
	public final int method1202() {
		this.anInt1710 += 2;
		@Pc(38) int local38 = (this.aByteArray14[this.anInt1710 - 2] - 128 & 0xFF) + ((this.aByteArray14[this.anInt1710 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "(B)I")
	public final int method1203() {
		this.anInt1710 += 3;
		@Pc(44) int local44 = ((this.aByteArray14[this.anInt1710 - 2] & 0xFF) << 8) + (((this.aByteArray14[this.anInt1710 - 3] & 0xFF) << 16) + (this.aByteArray14[this.anInt1710 - 1] & 0xFF));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(IB)V")
	public final void method1204(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "(II)V")
	public final void method1205(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 + 128);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(II)J")
	public final long method1206(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(17) int local17 = local0 * 8;
		@Pc(19) long local19 = 0L;
		while (local17 >= 0) {
			local19 |= ((long) this.aByteArray14[this.anInt1710++] & 0xFFL) << local17;
			local17 -= 8;
		}
		return local19;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(Z)I")
	public final int method1207() {
		this.anInt1710 += 2;
		return ((this.aByteArray14[this.anInt1710 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt1710 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(IB)V")
	public final void method1208(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(IB)V")
	public final void method1209(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(Z)I")
	public final int method1210() {
		return 128 - this.aByteArray14[this.anInt1710++] & 0xFF;
	}

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "(B)Ljava/lang/String;")
	public final String method1211() {
		if (this.aByteArray14[this.anInt1710] == 0) {
			this.anInt1710++;
			return null;
		} else {
			return this.method1201();
		}
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(I)B")
	public final byte method1212() {
		return this.aByteArray14[this.anInt1710++];
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(Z)Ljava/lang/String;")
	public final String method1213() {
		@Pc(14) byte local14 = this.aByteArray14[this.anInt1710++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(25) int local25 = this.method1214();
		if (local25 + this.anInt1710 > this.aByteArray14.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(52) String local52 = Static191.method3100(this.anInt1710, this.aByteArray14, local25);
		this.anInt1710 += local25;
		return local52;
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(B)I")
	public final int method1214() {
		@Pc(21) byte local21 = this.aByteArray14[this.anInt1710++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray14[this.anInt1710++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "(I)I")
	public final int method1215() {
		this.anInt1710 += 2;
		@Pc(39) int local39 = ((this.aByteArray14[this.anInt1710 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt1710 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(IB[BI)V")
	public final void method1216(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(8) int local8 = arg1 - 1; local8 >= 0; local8--) {
			arg0[local8] = this.aByteArray14[this.anInt1710++];
		}
	}

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "(I)I")
	public final int method1217() {
		this.anInt1710 += 2;
		return ((this.aByteArray14[this.anInt1710 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt1710 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "(I)I")
	public final int method1218() {
		return this.aByteArray14[this.anInt1710++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "(II)V")
	public final void method1219(@OriginalArg(1) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "(I)B")
	public final byte method1220() {
		return (byte) -this.aByteArray14[this.anInt1710++];
	}

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "(I)I")
	public final int method1221() {
		this.anInt1710 += 2;
		@Pc(31) int local31 = ((this.aByteArray14[this.anInt1710 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt1710 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(JIB)V")
	public final void method1222(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local11 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> local27);
		}
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(IB)V")
	public final void method1223(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "(I)I")
	public final int method1224() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method1168();
		while (local16 == 32767) {
			local16 = this.method1168();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(Z)I")
	public final int method1225() {
		this.anInt1710 += 2;
		return ((this.aByteArray14[this.anInt1710 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt1710 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "(I)I")
	public final int method1226() {
		this.anInt1710 += 3;
		return (this.aByteArray14[this.anInt1710 - 1] & 0xFF) + (((this.aByteArray14[this.anInt1710 - 3] & 0xFF) << 16) + ((this.aByteArray14[this.anInt1710 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "(II)V")
	public final void method1227(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt1710++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt1710++] = (byte) arg0;
	}
}
