import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!m", name = "Nb", descriptor = "I")
	public int anInt1562 = 0;

	@OriginalMember(owner = "client!m", name = "sb", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray13 = Static116.method2088(arg0);
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "([B)V")
	public Class3_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray13 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public final void method972(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt1562++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)I")
	public final int method973() {
		return -this.aByteArray13[this.anInt1562++] & 0xFF;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I")
	public final int method974() {
		this.anInt1562 += 2;
		return (this.aByteArray13[this.anInt1562 - 1] & 0xFF) + ((this.aByteArray13[this.anInt1562 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
	public final void method975(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(II)V")
	public final void method976(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt1562++] = (byte) arg0;
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lclient!he;")
	public final Class26 method977() {
		@Pc(2) int local2 = this.anInt1562;
		while (this.aByteArray13[this.anInt1562++] != 0) {
		}
		return Static101.method1896(this.anInt1562 - local2 - 1, local2, this.aByteArray13);
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)I")
	public final int method978() {
		this.anInt1562 += 2;
		return ((this.aByteArray13[this.anInt1562 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt1562 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)I")
	public final int method979() {
		@Pc(14) int local14 = this.aByteArray13[this.anInt1562] & 0xFF;
		return local14 >= 128 ? this.method974() - 32768 : this.method981();
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(B)J")
	public final long method980() {
		@Pc(10) long local10 = (long) this.method984() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method984() & 0xFFFFFFFFL;
		return (local10 << 32) + local17;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)I")
	public final int method981() {
		return this.aByteArray13[this.anInt1562++] & 0xFF;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(II)V")
	public final void method983(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(B)I")
	public final int method984() {
		this.anInt1562 += 4;
		return ((this.aByteArray13[this.anInt1562 - 3] & 0xFF) << 16) + (this.aByteArray13[this.anInt1562 - 4] << 24 & 0xFF000000) + ((this.aByteArray13[this.anInt1562 + -2] & 0xFF) << 8) + (this.aByteArray13[this.anInt1562 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([BIII)V")
	public final void method985(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = this.aByteArray13[this.anInt1562++];
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)I")
	public final int method987() {
		this.anInt1562 += 4;
		return ((this.aByteArray13[this.anInt1562 - 3] & 0xFF) << 8) + ((this.aByteArray13[this.anInt1562 - 2] & 0xFF) << 16) + ((this.aByteArray13[-1 + this.anInt1562] & 0xFF) << 24) + (this.aByteArray13[this.anInt1562 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)I")
	public final int method988() {
		this.anInt1562 += 2;
		return (this.aByteArray13[this.anInt1562 - 1] - 128 & 0xFF) + ((this.aByteArray13[this.anInt1562 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(II)V")
	public final void method989(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) arg0;
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V")
	public final void method990(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(B)Lclient!he;")
	public final Class26 method991() {
		if (this.aByteArray13[this.anInt1562] == 0) {
			this.anInt1562++;
			return null;
		} else {
			return this.method977();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)V")
	public final void method992(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)I")
	public final int method993() {
		@Pc(16) byte local16 = this.aByteArray13[this.anInt1562++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray13[this.anInt1562++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(I)B")
	public final byte method994() {
		return this.aByteArray13[this.anInt1562++];
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V")
	public final void method995(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt1562++] = (byte) arg0;
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(II)V")
	public final void method996(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt1562++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([BIBI)V")
	public final void method997(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			this.aByteArray13[this.anInt1562++] = arg0[local5];
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method998(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(12) int local12 = this.anInt1562;
		@Pc(15) byte[] local15 = new byte[local12];
		this.anInt1562 = 0;
		this.method1018(local12, local15);
		@Pc(29) BigInteger local29 = new BigInteger(local15);
		@Pc(34) BigInteger local34 = local29.modPow(arg1, arg0);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt1562 = 0;
		this.method992(local37.length);
		this.method997(local37, local37.length);
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(II)I")
	public final int method999(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static88.method1632(this.aByteArray13, arg0, this.anInt1562);
		this.method1001(local11);
		return local11;
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(B)I")
	public final int method1000() {
		this.anInt1562 += 2;
		return ((this.aByteArray13[this.anInt1562 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt1562 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "(II)V")
	public final void method1001(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt1562++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "(I)I")
	public final int method1002() {
		this.anInt1562 += 4;
		return (this.aByteArray13[this.anInt1562 - 2] & 0xFF) + ((this.aByteArray13[this.anInt1562 - 1] & 0xFF) << 8) + ((this.aByteArray13[this.anInt1562 - 3] & 0xFF) << 24) + ((this.aByteArray13[this.anInt1562 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "(B)I")
	public final int method1003() {
		this.anInt1562 += 2;
		@Pc(38) int local38 = (this.aByteArray13[this.anInt1562 - 1] & 0xFF) + ((this.aByteArray13[this.anInt1562 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "(B)I")
	public final int method1004() {
		return this.aByteArray13[this.anInt1562++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "(I)I")
	public final int method1005() {
		return 128 - this.aByteArray13[this.anInt1562++] & 0xFF;
	}

	@OriginalMember(owner = "client!m", name = "k", descriptor = "(I)I")
	public final int method1006() {
		this.anInt1562 += 4;
		return ((this.aByteArray13[this.anInt1562 - 2] & 0xFF) << 24) + (this.aByteArray13[this.anInt1562 + -3] & 0xFF) - (-((this.aByteArray13[this.anInt1562 - 1] & 0xFF) << 16) - ((this.aByteArray13[this.anInt1562 - 4] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!m", name = "l", descriptor = "(I)B")
	public final byte method1007() {
		return (byte) -this.aByteArray13[this.anInt1562++];
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "(II)V")
	public final void method1008(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method992(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method972(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!m", name = "k", descriptor = "(II)V")
	public final void method1009(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) arg0;
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!m", name = "m", descriptor = "(I)B")
	public final byte method1010() {
		return (byte) (128 - this.aByteArray13[this.anInt1562++]);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[II)V")
	public final void method1012(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int local4 = this.anInt1562;
		@Pc(10) int local10 = (arg1 - 5) / 8;
		this.anInt1562 = 5;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(25) int local25 = this.method984();
			@Pc(27) int local27 = -957401312;
			@Pc(31) int local31 = this.method984();
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local31 -= (local25 << 4 ^ local25 >>> 5) + local25 ^ local27 + arg0[local27 >>> 11 & 0xCF000003];
				local27 -= -1640531527;
				local25 -= (local31 << 4 ^ local31 >>> 5) + local31 ^ arg0[local27 & 0x3] + local27;
			}
			this.anInt1562 -= 8;
			this.method1001(local25);
			this.method1001(local31);
		}
		this.anInt1562 = local4;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)I")
	public final int method1013() {
		this.anInt1562 += 3;
		return (this.aByteArray13[this.anInt1562 - 1] & 0xFF) + ((this.aByteArray13[this.anInt1562 - 3] & 0xFF) << 16) + ((this.aByteArray13[this.anInt1562 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!m", name = "l", descriptor = "(II)V")
	public final void method1014(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt1562 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt1562 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt1562 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt1562 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "n", descriptor = "(I)I")
	public final int method1015() {
		this.anInt1562 += 2;
		@Pc(36) int local36 = ((this.aByteArray13[this.anInt1562 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt1562 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IB)V")
	public final void method1016(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 + 128);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!m", name = "o", descriptor = "(I)I")
	public final int method1017() {
		this.anInt1562 += 2;
		@Pc(39) int local39 = ((this.aByteArray13[this.anInt1562 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt1562 - 2] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI[B)V")
	public final void method1018(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray13[this.anInt1562++];
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(IB)V")
	public final void method1019(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method992(arg0 >>> 28 | 0x80);
					}
					this.method992(arg0 >>> 21 | 0x80);
				}
				this.method992(arg0 >>> 14 | 0x80);
			}
			this.method992(arg0 >>> 7 | 0x80);
		}
		this.method992(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IJ)V")
	public final void method1020(@OriginalArg(1) long arg0) {
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 56);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 48);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 40);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 32);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt1562++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt1562++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IJ)V")
	public final void method1021(@OriginalArg(1) long arg0) {
		this.method1009((int) (arg0 >> 32));
		this.method1009((int) arg0);
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(IB)V")
	public final void method1023(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt1562 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!he;I)V")
	public final void method1024(@OriginalArg(0) Class26 arg0) {
		this.anInt1562 += arg0.method835(arg0.method839(), this.anInt1562, this.aByteArray13);
		this.aByteArray13[this.anInt1562++] = 0;
	}

	@OriginalMember(owner = "client!m", name = "p", descriptor = "(I)I")
	public final int method1025() {
		@Pc(18) int local18 = this.aByteArray13[this.anInt1562] & 0xFF;
		return local18 >= 128 ? this.method974() - 49152 : this.method981() - 64;
	}

	@OriginalMember(owner = "client!m", name = "q", descriptor = "(I)B")
	public final byte method1026() {
		return (byte) (this.aByteArray13[this.anInt1562++] - 128);
	}
}
