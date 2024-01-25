import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "[B")
	public byte[] aByteArray102;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	public int anInt10061;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
	public Class6_Sub8(@OriginalArg(0) int arg0) {
		this.aByteArray102 = Static248.method4428(arg0);
		this.anInt10061 = 0;
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "([B)V")
	public Class6_Sub8(@OriginalArg(0) byte[] arg0) {
		this.anInt10061 = 0;
		this.aByteArray102 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method8198(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray102[this.anInt10061++] = 0;
		this.anInt10061 += Static368.method5889(arg0, arg0.length(), this.anInt10061, this.aByteArray102);
		this.aByteArray102[this.anInt10061++] = 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)V")
	public final void method8199(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)I")
	public final int method8200() {
		this.anInt10061 += 2;
		@Pc(38) int local38 = (this.aByteArray102[this.anInt10061 - 2] & 0xFF) + ((this.aByteArray102[this.anInt10061 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)B")
	public final byte method8201() {
		return (byte) (this.aByteArray102[this.anInt10061++] - 128);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	public final void method8202(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 24);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)I")
	public final int method8203() {
		this.anInt10061 += 3;
		return (this.aByteArray102[this.anInt10061 - 1] & 0xFF) + ((this.aByteArray102[this.anInt10061 - 2] & 0xFF) << 8) + ((this.aByteArray102[this.anInt10061 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)B")
	public final byte method8204() {
		return (byte) -this.aByteArray102[this.anInt10061++];
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method8205(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr");
		}
		this.anInt10061 += Static368.method5889(arg0, arg0.length(), this.anInt10061, this.aByteArray102);
		this.aByteArray102[this.anInt10061++] = 0;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)J")
	public final long method8206() {
		@Pc(10) long local10 = (long) this.method8219() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method8219() & 0xFFFFFFFFL;
		return local10 + (local17 << 32);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([BZII)V")
	public final void method8207(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(10) int local10 = arg2; local10 < arg2 + arg1; local10++) {
			arg0[local10] = this.aByteArray102[this.anInt10061++];
		}
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)B")
	public final byte method8208() {
		return this.aByteArray102[this.anInt10061++];
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)I")
	public final int method8209() {
		this.anInt10061 += 3;
		return (this.aByteArray102[this.anInt10061 - 3] & 0xFF) + ((this.aByteArray102[this.anInt10061 - 2] & 0xFF) << 8) + ((this.aByteArray102[this.anInt10061 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)I")
	public final int method8210() {
		this.anInt10061 += 4;
		return ((this.aByteArray102[this.anInt10061 - 4] & 0xFF) << 8) + (this.aByteArray102[this.anInt10061 - 1] << 16 & 0xFF0000) + ((this.aByteArray102[this.anInt10061 + -2] & 0xFF) << 24) + (this.aByteArray102[this.anInt10061 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V")
	public final void method8211(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)V")
	public final void method8212(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IB)I")
	public final int method8213(@OriginalArg(0) int arg0) {
		@Pc(20) int local20 = Static622.method8520(this.anInt10061, this.aByteArray102, arg0);
		this.method8202(local20);
		return local20;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)I")
	public final int method8214() {
		@Pc(16) int local16 = this.aByteArray102[this.anInt10061] & 0xFF;
		return local16 < 128 ? this.method8246() : this.method8220() - 32768;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)I")
	public final int method8215() {
		this.anInt10061 += 2;
		@Pc(33) int local33 = (this.aByteArray102[this.anInt10061 - 2] - 128 & 0xFF) + ((this.aByteArray102[this.anInt10061 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)V")
	public final void method8216(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8211(arg0 >>> 28 | 0x80);
					}
					this.method8211(arg0 >>> 21 | 0x80);
				}
				this.method8211(arg0 >>> 14 | 0x80);
			}
			this.method8211(arg0 >>> 7 | 0x80);
		}
		this.method8211(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
	public final void method8217(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 24);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
	public final void method8218() {
		if (this.aByteArray102 != null) {
			Static248.method4431(this.aByteArray102);
		}
		this.aByteArray102 = null;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(B)I")
	public final int method8219() {
		this.anInt10061 += 4;
		return ((this.aByteArray102[this.anInt10061 - 3] & 0xFF) << 8) + ((this.aByteArray102[this.anInt10061 - 2] & 0xFF) << 16) + ((this.aByteArray102[this.anInt10061 + -1] & 0xFF) << 24) + (this.aByteArray102[this.anInt10061 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(B)I")
	public final int method8220() {
		this.anInt10061 += 2;
		return (this.aByteArray102[this.anInt10061 - 1] & 0xFF) + ((this.aByteArray102[this.anInt10061 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method8221() {
		@Pc(6) int local6 = this.anInt10061;
		while (this.aByteArray102[this.anInt10061++] != 0) {
		}
		@Pc(36) int local36 = this.anInt10061 - local6 - 1;
		return local36 == 0 ? "" : Static99.method2380(local36, local6, this.aByteArray102);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public final void method8222(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt10061;
		this.anInt10061 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method8207(local12, local6, 0);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt10061 = 0;
		this.method8241(local31.length);
		this.method8234(local31, local31.length, 0);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)V")
	public final void method8223(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)V")
	public final void method8224(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt10061 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt10061 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)I")
	public final int method8225() {
		@Pc(7) int local7 = 0;
		@Pc(18) int local18;
		for (local18 = this.method8214(); local18 == 32767; local18 = this.method8214()) {
			local7 += 32767;
		}
		return local7 + local18;
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)I")
	public final int method8226() {
		this.anInt10061 += 4;
		return (this.aByteArray102[this.anInt10061 - 2] & 0xFF) + ((this.aByteArray102[this.anInt10061 - 4] & 0xFF) << 16) + ((this.aByteArray102[this.anInt10061 + -3] & 0xFF) << 24) + ((this.aByteArray102[this.anInt10061 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(I)Z")
	public final boolean method8227() {
		this.anInt10061 -= 4;
		@Pc(25) int local25 = Static622.method8520(this.anInt10061, this.aByteArray102, 0);
		@Pc(29) int local29 = this.method8236();
		return local25 == local29;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(BI)V")
	public final void method8228(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt10061 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "(I)I")
	public final int method8229() {
		this.anInt10061 += 2;
		return (this.aByteArray102[this.anInt10061 - 1] - 128 & 0xFF) + ((this.aByteArray102[this.anInt10061 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IJI)V")
	public final void method8230(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local2 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray102[this.anInt10061++] = (byte) (int) (arg0 >> local26);
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(Z)I")
	public final int method8231() {
		this.anInt10061 += 2;
		@Pc(39) int local39 = ((this.aByteArray102[this.anInt10061 - 2] & 0xFF) << 8) + (this.aByteArray102[this.anInt10061 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIB)V")
	public final void method8232(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt10061;
		this.anInt10061 = 5;
		@Pc(25) int local25 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(35) int local35 = this.method8236();
			@Pc(39) int local39 = this.method8236();
			@Pc(41) int local41 = -957401312;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local39 -= arg0[local41 >>> 11 & 0x5A600003] + local41 ^ (local35 << 4 ^ local35 >>> 5) - -local35;
				local41 -= -1640531527;
				local35 -= local41 + arg0[local41 & 0x3] ^ local39 + (local39 << 4 ^ local39 >>> 5);
			}
			this.anInt10061 -= 8;
			this.method8202(local35);
			this.method8202(local39);
		}
		this.anInt10061 = local15;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([BIII)V")
	public final void method8234(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg2; local7 < arg1 + arg2; local7++) {
			this.aByteArray102[this.anInt10061++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(II)V")
	public final void method8235(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "(I)I")
	public final int method8236() {
		this.anInt10061 += 4;
		return (this.aByteArray102[this.anInt10061 - 1] & 0xFF) + ((this.aByteArray102[this.anInt10061 - 3] & 0xFF) << 16) + ((this.aByteArray102[this.anInt10061 + -4] & 0xFF) << 24) + ((this.aByteArray102[this.anInt10061 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(B)I")
	public final int method8237() {
		this.anInt10061 += 2;
		return ((this.aByteArray102[this.anInt10061 - 1] & 0xFF) << 8) + (this.aByteArray102[this.anInt10061 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IJ)V")
	public final void method8238(@OriginalArg(1) long arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (int) (arg0 >> 56);
		this.aByteArray102[this.anInt10061++] = (byte) (int) (arg0 >> 48);
		this.aByteArray102[this.anInt10061++] = (byte) (int) (arg0 >> 40);
		this.aByteArray102[this.anInt10061++] = (byte) (int) (arg0 >> 32);
		this.aByteArray102[this.anInt10061++] = (byte) (int) (arg0 >> 24);
		this.aByteArray102[this.anInt10061++] = (byte) (int) (arg0 >> 16);
		this.aByteArray102[this.anInt10061++] = (byte) (int) (arg0 >> 8);
		this.aByteArray102[this.anInt10061++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method8239() {
		if (this.aByteArray102[this.anInt10061] == 0) {
			this.anInt10061++;
			return null;
		} else {
			return this.method8221();
		}
	}

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method8240() {
		@Pc(14) byte local14 = this.aByteArray102[this.anInt10061++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt10061;
		while (this.aByteArray102[this.anInt10061++] != 0) {
		}
		@Pc(55) int local55 = this.anInt10061 - local27 - 1;
		return local55 == 0 ? "" : Static99.method2380(local55, local27, this.aByteArray102);
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(II)V")
	public final void method8241(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(II)V")
	public final void method8242(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(B)I")
	public final int method8243() {
		return -this.aByteArray102[this.anInt10061++] & 0xFF;
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "(B)I")
	public final int method8244() {
		this.anInt10061 += 3;
		@Pc(48) int local48 = ((this.aByteArray102[this.anInt10061 - 2] & 0xFF) << 8) + ((this.aByteArray102[this.anInt10061 - 3] & 0xFF) << 16) + (this.aByteArray102[this.anInt10061 + -1] & 0xFF);
		if (local48 > 8388607) {
			local48 -= 16777216;
		}
		return local48;
	}

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "(B)I")
	public final int method8245() {
		this.anInt10061 += 2;
		return (this.aByteArray102[this.anInt10061 - 2] & 0xFF) + ((this.aByteArray102[this.anInt10061 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "(B)I")
	public final int method8246() {
		return this.aByteArray102[this.anInt10061++] & 0xFF;
	}

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "(I)I")
	public final int method8247() {
		return 128 - this.aByteArray102[this.anInt10061++] & 0xFF;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(IB)V")
	public final void method8248(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(IB)V")
	public final void method8249(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 24);
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(BI)V")
	public final void method8250(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt10061 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray102[this.anInt10061 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt10061 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt10061 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "(I)B")
	public final byte method8251() {
		return (byte) (128 - this.aByteArray102[this.anInt10061++]);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z[III)V")
	public final void method8252(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt10061;
		this.anInt10061 = arg1;
		@Pc(17) int local17 = (arg2 - arg1) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) int local25 = this.method8236();
			@Pc(29) int local29 = this.method8236();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += (local29 << 4 ^ local29 >>> 5) + local29 ^ arg0[local31 & 0x3] + local31;
				local31 += -1640531527;
				local29 += arg0[local31 >>> 11 & 0x3] + local31 ^ (local25 >>> 5 ^ local25 << 4) + local25;
			}
			this.anInt10061 -= 8;
			this.method8202(local25);
			this.method8202(local29);
		}
		this.anInt10061 = local8;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(Z)I")
	public final int method8253() {
		return this.aByteArray102[this.anInt10061++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(II)V")
	public final void method8254(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8211(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8241(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "(II)V")
	public final void method8255(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 + 128);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "(I)I")
	public final int method8256() {
		@Pc(11) int local11 = this.aByteArray102[this.anInt10061] & 0xFF;
		return local11 < 128 ? this.method8246() - 64 : this.method8220() + -49152;
	}

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "(B)I")
	public final int method8257() {
		@Pc(21) byte local21 = this.aByteArray102[this.anInt10061++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray102[this.anInt10061++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "(I)I")
	public final int method8259() {
		this.anInt10061 += 2;
		@Pc(38) int local38 = (this.aByteArray102[this.anInt10061 - 1] - 128 & 0xFF) + ((this.aByteArray102[this.anInt10061 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(IB)V")
	public final void method8261(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "(II)V")
	public final void method8262(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "(I)J")
	public final long method8263() {
		@Pc(10) long local10 = (long) this.method8236() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method8236() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "(II)V")
	public final void method8264(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt10061++] = (byte) arg0;
		this.aByteArray102[this.anInt10061++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IZ)J")
	public final long method8265(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(28) int local28 = local6 * 8;
		@Pc(30) long local30 = 0L;
		while (local28 >= 0) {
			local30 |= ((long) this.aByteArray102[this.anInt10061++] & 0xFFL) << local28;
			local28 -= 8;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(Z)I")
	public final int method8266() {
		this.anInt10061 += 4;
		return (this.aByteArray102[this.anInt10061 - 4] & 0xFF) + ((this.aByteArray102[this.anInt10061 - 2] & 0xFF) << 16) + ((this.aByteArray102[this.anInt10061 + -1] & 0xFF) << 24) + ((this.aByteArray102[this.anInt10061 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIZ[B)V")
	public final void method8267(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = (byte) (this.aByteArray102[this.anInt10061++] - 128);
		}
	}
}
