import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!hw", name = "X", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
	public int anInt7523;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(I)V")
	public Class2_Sub17(@OriginalArg(0) int arg0) {
		this.aByteArray94 = Static336.method4762(arg0);
		this.anInt7523 = 0;
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "([B)V")
	public Class2_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray94 = arg0;
		this.anInt7523 = 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)I")
	public final int method6109() {
		this.anInt7523 += 3;
		@Pc(43) int local43 = ((this.aByteArray94[this.anInt7523 - 2] & 0xFF) << 8) + ((this.aByteArray94[this.anInt7523 - 3] & 0xFF) << 16) + (this.aByteArray94[this.anInt7523 + -1] & 0xFF);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)I")
	public final int method6110() {
		this.anInt7523 += 2;
		return ((this.aByteArray94[this.anInt7523 - 1] & 0xFF) << 8) + (this.aByteArray94[this.anInt7523 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZ)V")
	public final void method6111(@OriginalArg(0) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 16);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V")
	public final void method6112(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)I")
	public final int method6113() {
		this.anInt7523 += 3;
		return ((this.aByteArray94[this.anInt7523 - 3] & 0xFF) << 16) + ((this.aByteArray94[this.anInt7523 - 1] & 0xFF) << 8) + (this.aByteArray94[this.anInt7523 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)I")
	public final int method6114() {
		this.anInt7523 += 4;
		return ((this.aByteArray94[this.anInt7523 - 4] & 0xFF) << 16) + ((this.aByteArray94[this.anInt7523 - 3] & 0xFF) << 24) + ((this.aByteArray94[this.anInt7523 - 1] & 0xFF) << 8) + (this.aByteArray94[this.anInt7523 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "(I)I")
	public final int method6115() {
		return -this.aByteArray94[this.anInt7523++] & 0xFF;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)I")
	public final int method6116() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method6174();
		while (local11 == 32767) {
			local11 = this.method6174();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZI)V")
	public final void method6117(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 + 128);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([BIII)V")
	public final void method6118(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = this.aByteArray94[this.anInt7523++];
		}
	}

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "(I)I")
	public final int method6119() {
		return 128 - this.aByteArray94[this.anInt7523++] & 0xFF;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)B")
	public final byte method6120() {
		return this.aByteArray94[this.anInt7523++];
	}

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method6121() {
		if (this.aByteArray94[this.anInt7523] == 0) {
			this.anInt7523++;
			return null;
		} else {
			return this.method6141();
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(II)V")
	public final void method6122(@OriginalArg(0) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 24);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(B)B")
	public final byte method6123() {
		return (byte) -this.aByteArray94[this.anInt7523++];
	}

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "(I)I")
	public final int method6124() {
		this.anInt7523 += 2;
		return (this.aByteArray94[this.anInt7523 - 1] - 128 & 0xFF) + ((this.aByteArray94[this.anInt7523 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "(I)I")
	public final int method6125() {
		this.anInt7523 += 4;
		return ((this.aByteArray94[this.anInt7523 - 2] & 0xFF) << 24) + (this.aByteArray94[this.anInt7523 - 1] << 16 & 0xFF0000) + ((this.aByteArray94[this.anInt7523 - 4] & 0xFF) << 8) + (this.aByteArray94[this.anInt7523 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(II)V")
	public final void method6126(@OriginalArg(0) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIJ)V")
	public final void method6127(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local6 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray94[this.anInt7523++] = (byte) (arg1 >> local21);
		}
	}

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "(I)J")
	public final long method6128() {
		@Pc(15) long local15 = (long) this.method6129() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method6129() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(B)I")
	public final int method6129() {
		this.anInt7523 += 4;
		return ((this.aByteArray94[this.anInt7523 - 2] & 0xFF) << 8) + ((this.aByteArray94[this.anInt7523 - 3] & 0xFF) << 16) + ((this.aByteArray94[this.anInt7523 + -4] & 0xFF) << 24) + (this.aByteArray94[this.anInt7523 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(II)V")
	public final void method6130(@OriginalArg(0) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(II)V")
	public final void method6131(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(JI)V")
	public final void method6132(@OriginalArg(0) long arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 56);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 48);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 40);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 32);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 24);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 16);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "(II)V")
	public final void method6133(@OriginalArg(0) int arg0) {
		this.aByteArray94[this.anInt7523 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray94[this.anInt7523 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray94[this.anInt7523 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "(I)I")
	public final int method6134() {
		@Pc(11) int local11 = this.aByteArray94[this.anInt7523] & 0xFF;
		return local11 >= 128 ? this.method6148() - 49152 : this.method6138() + -64;
	}

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "(II)V")
	public final void method6135(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(IB)V")
	public final void method6136(@OriginalArg(0) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 16);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "(II)V")
	public final void method6137(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "(I)I")
	public final int method6138() {
		return this.aByteArray94[this.anInt7523++] & 0xFF;
	}

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "(II)J")
	public final long method6139(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local2 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray94[this.anInt7523++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBI[B)V")
	public final void method6140(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(18) int local18 = arg0 - 1; local18 >= 0; local18--) {
			arg1[local18] = (byte) (this.aByteArray94[this.anInt7523++] - 128);
		}
	}

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method6141() {
		@Pc(6) int local6 = this.anInt7523;
		while (this.aByteArray94[this.anInt7523++] != 0) {
		}
		@Pc(35) int local35 = this.anInt7523 - local6 - 1;
		return local35 == 0 ? "" : Static186.method2710(this.aByteArray94, local6, local35);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method6142(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt7523;
		this.anInt7523 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method6164(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt7523 = 0;
		this.method6130(local31.length);
		this.method6167(local31, local31.length);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method6143() {
		@Pc(14) byte local14 = this.aByteArray94[this.anInt7523++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(30) int local30 = this.method6162();
		if (this.aByteArray94.length < local30 + this.anInt7523) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(56) String local56 = Static391.method5423(this.anInt7523, local30, this.aByteArray94);
		this.anInt7523 += local30;
		return local56;
	}

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "(I)I")
	public final int method6144() {
		@Pc(11) int local11 = Static86.method1339(this.anInt7523, this.aByteArray94, 0);
		this.method6170(local11);
		return local11;
	}

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "(I)I")
	public final int method6145() {
		this.anInt7523 += 3;
		return ((this.aByteArray94[this.anInt7523 - 3] & 0xFF) << 16) - (-((this.aByteArray94[this.anInt7523 - 2] & 0xFF) << 8) - (this.aByteArray94[this.anInt7523 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(Z)I")
	public final int method6146() {
		this.anInt7523 += 2;
		@Pc(38) int local38 = (this.aByteArray94[this.anInt7523 - 1] - 128 & 0xFF) + ((this.aByteArray94[this.anInt7523 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method6147(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = Static317.method4505(arg0);
		this.aByteArray94[this.anInt7523++] = 0;
		this.method6152(local11);
		this.anInt7523 += Static243.method3375(this.aByteArray94, arg0, this.anInt7523);
	}

	@OriginalMember(owner = "client!hw", name = "r", descriptor = "(I)I")
	public final int method6148() {
		this.anInt7523 += 2;
		return ((this.aByteArray94[this.anInt7523 - 2] & 0xFF) << 8) + (this.aByteArray94[this.anInt7523 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "(I)I")
	public final int method6149() {
		this.anInt7523 += 2;
		@Pc(31) int local31 = ((this.aByteArray94[this.anInt7523 - 2] & 0xFF) << 8) + (this.aByteArray94[this.anInt7523 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "(B)B")
	public final byte method6150() {
		return (byte) (128 - this.aByteArray94[this.anInt7523++]);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public final void method6151(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt7523 += Static252.method3494(this.anInt7523, arg0.length(), arg0, this.aByteArray94);
		this.aByteArray94[this.anInt7523++] = 0;
	}

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "(II)V")
	public final void method6152(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method6172(arg0 >>> 28 | 0x80);
					}
					this.method6172(arg0 >>> 21 | 0x80);
				}
				this.method6172(arg0 >>> 14 | 0x80);
			}
			this.method6172(arg0 >>> 7 | 0x80);
		}
		this.method6172(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "(I)I")
	public final int method6153() {
		this.anInt7523 += 2;
		return ((this.aByteArray94[this.anInt7523 - 1] & 0xFF) << 8) + (this.aByteArray94[this.anInt7523 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(IB)V")
	public final void method6154(@OriginalArg(0) int arg0) {
		this.aByteArray94[this.anInt7523 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(IB)V")
	public final void method6155(@OriginalArg(0) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 16);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method6156() {
		@Pc(14) byte local14 = this.aByteArray94[this.anInt7523++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(33) int local33 = this.anInt7523;
		while (this.aByteArray94[this.anInt7523++] != 0) {
		}
		@Pc(53) int local53 = this.anInt7523 - local33 - 1;
		return local53 == 0 ? "" : Static186.method2710(this.aByteArray94, local33, local53);
	}

	@OriginalMember(owner = "client!hw", name = "u", descriptor = "(I)I")
	public final int method6158() {
		this.anInt7523 += 2;
		@Pc(38) int local38 = (this.aByteArray94[this.anInt7523 - 2] - 128 & 0xFF) + ((this.aByteArray94[this.anInt7523 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "(Z)Z")
	public final boolean method6159() {
		this.anInt7523 -= 4;
		@Pc(24) int local24 = Static86.method1339(this.anInt7523, this.aByteArray94, 0);
		@Pc(28) int local28 = this.method6129();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BI)V")
	public final void method6160(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "(II)V")
	public final void method6161(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "(B)I")
	public final int method6162() {
		@Pc(19) byte local19 = this.aByteArray94[this.anInt7523++];
		@Pc(21) int local21 = 0;
		while (local19 < 0) {
			local21 = (local19 & 0x7F | local21) << 7;
			local19 = this.aByteArray94[this.anInt7523++];
		}
		return local21 | local19;
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(IB)I")
	public final int method6163(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static86.method1339(this.anInt7523, this.aByteArray94, arg0);
		this.method6170(local11);
		return local11;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZ[BI)V")
	public final void method6164(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(6) int local6 = 0; local6 < arg0; local6++) {
			arg1[local6] = this.aByteArray94[this.anInt7523++];
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(ZI)V")
	public final void method6165(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 16);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 24);
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I[III)V")
	public final void method6166(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt7523;
		this.anInt7523 = 5;
		@Pc(20) int local20 = (arg1 - 5) / 8;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(27) int local27 = this.method6129();
			@Pc(31) int local31 = this.method6129();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= arg0[local33 >>> 11 & 0x1800003] + local33 ^ (local27 << 4 ^ local27 >>> 5) - -local27;
				local33 -= -1640531527;
				local27 -= local31 + (local31 >>> 5 ^ local31 << 4) ^ local33 + arg0[local33 & 0x3];
			}
			this.anInt7523 -= 8;
			this.method6170(local27);
			this.method6170(local31);
		}
		this.anInt7523 = local10;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([BIIB)V")
	public final void method6167(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			this.aByteArray94[this.anInt7523++] = arg0[local13];
		}
	}

	@OriginalMember(owner = "client!hw", name = "v", descriptor = "(I)I")
	public final int method6168() {
		return this.aByteArray94[this.anInt7523++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "(IB)V")
	public final void method6169(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method6172(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method6130(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "(II)V")
	public final void method6170(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 24);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 16);
		this.aByteArray94[this.anInt7523++] = (byte) (arg0 >> 8);
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "(B)I")
	public final int method6171() {
		this.anInt7523 += 4;
		return (this.aByteArray94[this.anInt7523 - 4] & 0xFF) + ((this.aByteArray94[this.anInt7523 - 1] & 0xFF) << 24) + ((this.aByteArray94[this.anInt7523 + -2] & 0xFF) << 16) + ((this.aByteArray94[this.anInt7523 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(BI)V")
	public final void method6172(@OriginalArg(1) int arg0) {
		this.aByteArray94[this.anInt7523++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "(I)B")
	public final byte method6173() {
		return (byte) (this.aByteArray94[this.anInt7523++] - 128);
	}

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "(Z)I")
	public final int method6174() {
		@Pc(17) int local17 = this.aByteArray94[this.anInt7523] & 0xFF;
		return local17 >= 128 ? this.method6148() - 32768 : this.method6138();
	}
}
