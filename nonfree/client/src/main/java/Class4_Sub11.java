import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!un", name = "hb", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!un", name = "X", descriptor = "I")
	public int anInt5831;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray68 = Static346.method5593(arg0);
		this.anInt5831 = 0;
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "([B)V")
	public Class4_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray68 = arg0;
		this.anInt5831 = 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)V")
	public final void method4892(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4957(arg0 >>> 28 | 0x80);
					}
					this.method4957(arg0 >>> 21 | 0x80);
				}
				this.method4957(arg0 >>> 14 | 0x80);
			}
			this.method4957(arg0 >>> 7 | 0x80);
		}
		this.method4957(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)V")
	public final void method4893(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I[BII)V")
	public final void method4894(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray68[this.anInt5831++] - 128);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)I")
	public final int method4895() {
		this.anInt5831 += 3;
		@Pc(50) int local50 = (this.aByteArray68[this.anInt5831 - 1] & 0xFF) + ((this.aByteArray68[this.anInt5831 - 3] & 0xFF) << 16) + ((this.aByteArray68[this.anInt5831 - 2] & 0xFF) << 8);
		if (local50 > 8388607) {
			local50 -= 16777216;
		}
		return local50;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(BI)V")
	public final void method4896(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method4897(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static424.method6614(arg0);
		this.aByteArray68[this.anInt5831++] = 0;
		this.method4892(local7);
		this.anInt5831 += Static408.method6471(this.aByteArray68, arg0, this.anInt5831);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	public final void method4898(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I")
	public final int method4899() {
		this.anInt5831 += 4;
		return (this.aByteArray68[this.anInt5831 - 4] & 0xFF) + (((this.aByteArray68[this.anInt5831 - 2] & 0xFF) << 16) + ((this.aByteArray68[this.anInt5831 - 1] & 0xFF) << 24) + ((this.aByteArray68[this.anInt5831 - 3] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Ljava/lang/String;")
	public final String method4900() {
		@Pc(14) byte local14 = this.aByteArray68[this.anInt5831++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(30) int local30 = this.method4921();
		if (this.aByteArray68.length < local30 + this.anInt5831) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static162.method2964(this.anInt5831, local30, this.aByteArray68);
		this.anInt5831 += local30;
		return local55;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)B")
	public final byte method4901() {
		return (byte) -this.aByteArray68[this.anInt5831++];
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V")
	public final void method4902(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)J")
	public final long method4903() {
		@Pc(17) long local17 = (long) this.method4931() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method4931() & 0xFFFFFFFFL;
		return (local17 << 32) + local24;
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(I)I")
	public final int method4904() {
		@Pc(18) int local18 = this.aByteArray68[this.anInt5831] & 0xFF;
		return local18 < 128 ? this.method4905() - 64 : this.method4936() + -49152;
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)I")
	public final int method4905() {
		return this.aByteArray68[this.anInt5831++] & 0xFF;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BJ)V")
	public final void method4906(@OriginalArg(1) long arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 56);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 48);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 40);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 32);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!un", name = "h", descriptor = "(I)Z")
	public final boolean method4907() {
		this.anInt5831 -= 4;
		@Pc(17) int local17 = Static325.method8273(this.anInt5831, 0, this.aByteArray68);
		@Pc(21) int local21 = this.method4931();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(B)I")
	public final int method4908() {
		@Pc(18) int local18 = Static325.method8273(this.anInt5831, 0, this.aByteArray68);
		this.method4909(local18);
		return local18;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(BI)V")
	public final void method4909(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!un", name = "i", descriptor = "(I)I")
	public final int method4910() {
		this.anInt5831 += 2;
		@Pc(36) int local36 = (this.aByteArray68[this.anInt5831 - 2] & 0xFF) + ((this.aByteArray68[this.anInt5831 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	public final void method4911() {
		if (this.aByteArray68 != null) {
			Static346.method5592(this.aByteArray68);
		}
		this.aByteArray68 = null;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V")
	public final void method4912(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(II)V")
	public final void method4913(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z[III)V")
	public final void method4914(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt5831;
		this.anInt5831 = 5;
		@Pc(16) int local16 = (arg1 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			@Pc(29) int local29 = this.method4931();
			@Pc(33) int local33 = this.method4931();
			@Pc(35) int local35 = -957401312;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local33 -= arg0[local35 >>> 11 & 0x3] + local35 ^ local29 + (local29 << 4 ^ local29 >>> 5);
				local35 -= -1640531527;
				local29 -= (local33 >>> 5 ^ local33 << 4) + local33 ^ arg0[local35 & 0x3] + local35;
			}
			this.anInt5831 -= 8;
			this.method4909(local29);
			this.method4909(local33);
		}
		this.anInt5831 = local6;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IB)V")
	public final void method4915(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(B)I")
	public final int method4916() {
		return -this.aByteArray68[this.anInt5831++] & 0xFF;
	}

	@OriginalMember(owner = "client!un", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method4917() {
		if (this.aByteArray68[this.anInt5831] == 0) {
			this.anInt5831++;
			return null;
		} else {
			return this.method4920();
		}
	}

	@OriginalMember(owner = "client!un", name = "k", descriptor = "(I)I")
	public final int method4918() {
		this.anInt5831 += 4;
		return ((this.aByteArray68[this.anInt5831 - 1] & 0xFF) << 24) + (((this.aByteArray68[this.anInt5831 - 2] & 0xFF) << 16) + (this.aByteArray68[this.anInt5831 - 3] << 8 & 0xFF00)) + (this.aByteArray68[this.anInt5831 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method4920() {
		@Pc(6) int local6 = this.anInt5831;
		while (this.aByteArray68[this.anInt5831++] != 0) {
		}
		@Pc(31) int local31 = this.anInt5831 - local6 - 1;
		return local31 == 0 ? "" : Static534.method7768(local31, local6, this.aByteArray68);
	}

	@OriginalMember(owner = "client!un", name = "m", descriptor = "(I)I")
	public final int method4921() {
		@Pc(23) byte local23 = this.aByteArray68[this.anInt5831++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local25 | local23 & 0x7F) << 7;
			local23 = this.aByteArray68[this.anInt5831++];
		}
		return local25 | local23;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IJI)V")
	public final void method4922(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(20) int local20 = local0 * 8; local20 >= 0; local20 -= 8) {
			this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> local20);
		}
	}

	@OriginalMember(owner = "client!un", name = "n", descriptor = "(I)I")
	public final int method4923() {
		this.anInt5831 += 2;
		return (this.aByteArray68[this.anInt5831 - 2] - 128 & 0xFF) + ((this.aByteArray68[this.anInt5831 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!un", name = "o", descriptor = "(I)I")
	public final int method4924() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method4942();
		while (local11 == 32767) {
			local11 = this.method4942();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(B)B")
	public final byte method4925() {
		return this.aByteArray68[this.anInt5831++];
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II[BI)V")
	public final void method4926(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			arg1[local9] = this.aByteArray68[this.anInt5831++];
		}
	}

	@OriginalMember(owner = "client!un", name = "p", descriptor = "(I)I")
	public final int method4927() {
		this.anInt5831 += 4;
		return (this.aByteArray68[this.anInt5831 - 2] & 0xFF) + ((this.aByteArray68[this.anInt5831 - 1] & 0xFF) << 8) + ((this.aByteArray68[this.anInt5831 - 3] & 0xFF) << 24) + ((this.aByteArray68[this.anInt5831 - 4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(II)I")
	public final int method4928(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static325.method8273(this.anInt5831, arg0, this.aByteArray68);
		this.method4909(local11);
		return local11;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([BBII)V")
	public final void method4929(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray68[this.anInt5831++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(BI)J")
	public final long method4930(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(19) int local19 = local0 * 8;
		@Pc(21) long local21 = 0L;
		while (local19 >= 0) {
			local21 |= ((long) this.aByteArray68[this.anInt5831++] & 0xFFL) << local19;
			local19 -= 8;
		}
		return local21;
	}

	@OriginalMember(owner = "client!un", name = "q", descriptor = "(I)I")
	public final int method4931() {
		this.anInt5831 += 4;
		return (this.aByteArray68[this.anInt5831 - 1] & 0xFF) + ((this.aByteArray68[this.anInt5831 - 4] & 0xFF) << 24) + ((this.aByteArray68[this.anInt5831 + -3] & 0xFF) << 16) + ((this.aByteArray68[this.anInt5831 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(II)V")
	public final void method4932(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 + 128);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!un", name = "r", descriptor = "(I)Ljava/lang/String;")
	public final String method4933() {
		@Pc(14) byte local14 = this.aByteArray68[this.anInt5831++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt5831;
		while (this.aByteArray68[this.anInt5831++] != 0) {
		}
		@Pc(47) int local47 = this.anInt5831 - local27 - 1;
		return local47 == 0 ? "" : Static534.method7768(local47, local27, this.aByteArray68);
	}

	@OriginalMember(owner = "client!un", name = "s", descriptor = "(I)I")
	public final int method4934() {
		this.anInt5831 += 3;
		return ((this.aByteArray68[this.anInt5831 - 3] & 0xFF) << 16) + ((this.aByteArray68[this.anInt5831 - 2] & 0xFF) << 8) + (this.aByteArray68[this.anInt5831 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!un", name = "u", descriptor = "(I)I")
	public final int method4936() {
		this.anInt5831 += 2;
		return (this.aByteArray68[this.anInt5831 - 1] & 0xFF) + ((this.aByteArray68[this.anInt5831 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(BI)V")
	public final void method4937(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)I")
	public final int method4938() {
		return this.aByteArray68[this.anInt5831++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method4939(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5831;
		this.anInt5831 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4926(local6, local12);
		@Pc(29) BigInteger local29 = new BigInteger(local12);
		@Pc(34) BigInteger local34 = local29.modPow(arg1, arg0);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt5831 = 0;
		this.method4937(local37.length);
		this.method4929(local37, local37.length);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(IB)V")
	public final void method4940(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4957(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4937(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(IB)V")
	public final void method4941(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt5831 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!un", name = "h", descriptor = "(B)I")
	public final int method4942() {
		@Pc(17) int local17 = this.aByteArray68[this.anInt5831] & 0xFF;
		return local17 >= 128 ? this.method4936() - 32768 : this.method4905();
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(II)V")
	public final void method4943(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(II)V")
	public final void method4944(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4945(@OriginalArg(0) String arg0) {
		@Pc(14) int local14 = arg0.indexOf(0);
		if (local14 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local14 + " - cannot pjstr");
		}
		this.anInt5831 += Static198.method3510(arg0, this.anInt5831, this.aByteArray68, arg0.length());
		this.aByteArray68[this.anInt5831++] = 0;
	}

	@OriginalMember(owner = "client!un", name = "i", descriptor = "(B)I")
	public final int method4946() {
		this.anInt5831 += 2;
		@Pc(36) int local36 = ((this.aByteArray68[this.anInt5831 - 2] & 0xFF) << 8) + (this.aByteArray68[this.anInt5831 - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!un", name = "v", descriptor = "(I)I")
	public final int method4947() {
		return 128 - this.aByteArray68[this.anInt5831++] & 0xFF;
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(IB)V")
	public final void method4948(@OriginalArg(0) int arg0) {
		this.aByteArray68[this.anInt5831 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray68[this.anInt5831 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt5831 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!un", name = "h", descriptor = "(II)V")
	public final void method4949(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 16);
		this.aByteArray68[this.anInt5831++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!un", name = "j", descriptor = "(B)I")
	public final int method4950() {
		this.anInt5831 += 2;
		return ((this.aByteArray68[this.anInt5831 - 1] & 0xFF) << 8) + (this.aByteArray68[this.anInt5831 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!un", name = "w", descriptor = "(I)B")
	public final byte method4952() {
		return (byte) (128 - this.aByteArray68[this.anInt5831++]);
	}

	@OriginalMember(owner = "client!un", name = "k", descriptor = "(B)B")
	public final byte method4953() {
		return (byte) (this.aByteArray68[this.anInt5831++] - 128);
	}

	@OriginalMember(owner = "client!un", name = "l", descriptor = "(B)I")
	public final int method4954() {
		this.anInt5831 += 2;
		@Pc(40) int local40 = ((this.aByteArray68[this.anInt5831 - 2] & 0xFF) << 8) + (this.aByteArray68[this.anInt5831 - 1] - 128 & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!un", name = "m", descriptor = "(B)I")
	public final int method4955() {
		this.anInt5831 += 2;
		return ((this.aByteArray68[this.anInt5831 - 2] & 0xFF) << 8) + (this.aByteArray68[this.anInt5831 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!un", name = "n", descriptor = "(B)I")
	public final int method4956() {
		this.anInt5831 += 4;
		return (this.aByteArray68[this.anInt5831 - 3] & 0xFF) + ((this.aByteArray68[this.anInt5831 - 4] & 0xFF) << 8) + ((this.aByteArray68[this.anInt5831 - 1] & 0xFF) << 16) + ((this.aByteArray68[this.anInt5831 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(BI)V")
	public final void method4957(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!un", name = "i", descriptor = "(II)V")
	public final void method4958(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt5831++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!un", name = "j", descriptor = "(II)V")
	public final void method4959(@OriginalArg(1) int arg0) {
		this.aByteArray68[this.anInt5831 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray68[this.anInt5831 - arg0 - 1] = (byte) arg0;
	}
}
