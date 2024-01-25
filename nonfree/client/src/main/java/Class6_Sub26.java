import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public class Class6_Sub26 extends Class6 {

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
	public int anInt5769;

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(I)V")
	public Class6_Sub26(@OriginalArg(0) int arg0) {
		this.anInt5769 = 0;
		this.aByteArray65 = Static31.method1004(arg0);
	}

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "([B)V")
	public Class6_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray65 = arg0;
		this.anInt5769 = 0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)J")
	public final long method4935() {
		@Pc(10) long local10 = (long) this.method5000() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method5000() & 0xFFFFFFFFL;
		return (local10 << 32) + local17;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZ)V")
	public final void method4936(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(IZ)V")
	public final void method4937(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I[BII)V")
	public final void method4939(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
			this.aByteArray65[this.anInt5769++] = arg1[local16];
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)I")
	public final int method4940() {
		this.anInt5769 += 2;
		@Pc(40) int local40 = ((this.aByteArray65[this.anInt5769 - 1] & 0xFF) << 8) + (this.aByteArray65[this.anInt5769 - 2] - 128 & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)Ljava/lang/String;")
	public final String method4941() {
		@Pc(6) int local6 = this.anInt5769;
		while (this.aByteArray65[this.anInt5769++] != 0) {
		}
		@Pc(36) int local36 = this.anInt5769 - local6 - 1;
		return local36 == 0 ? "" : Static211.method8131(local36, local6, this.aByteArray65);
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)B")
	public final byte method4942() {
		return (byte) (this.aByteArray65[this.anInt5769++] - 128);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BJ)V")
	public final void method4943(@OriginalArg(1) long arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 56);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 48);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 40);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 32);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BI)V")
	public final void method4944(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4950(arg0 >>> 28 | 0x80, -81849);
					}
					this.method4950(arg0 >>> 21 | 0x80, -81849);
				}
				this.method4950(arg0 >>> 14 | 0x80, -81849);
			}
			this.method4950(arg0 >>> 7 | 0x80, -81849);
		}
		this.method4950(arg0 & 0x7F, -81849);
	}

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method4945() {
		@Pc(14) byte local14 = this.aByteArray65[this.anInt5769++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt5769;
		while (this.aByteArray65[this.anInt5769++] != 0) {
		}
		@Pc(52) int local52 = this.anInt5769 - local29 - 1;
		return local52 == 0 ? "" : Static211.method8131(local52, local29, this.aByteArray65);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
	public final void method4946(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "(I)I")
	public final int method4947() {
		@Pc(7) int local7 = 0;
		@Pc(19) int local19;
		for (local19 = this.method4973(); local19 == 32767; local19 = this.method4973()) {
			local7 += 32767;
		}
		return local7 + local19;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IB)V")
	public final void method4948(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "(I)I")
	public final int method4949() {
		this.anInt5769 += 3;
		return (this.aByteArray65[this.anInt5769 - 1] & 0xFF) + ((this.aByteArray65[this.anInt5769 - 3] & 0xFF) << 16) + ((this.aByteArray65[this.anInt5769 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(II)V")
	public final void method4950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BIJ)V")
	public final void method4951(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(31) int local31 = local2 * 8; local31 >= 0; local31 -= 8) {
			this.aByteArray65[this.anInt5769++] = (byte) (arg1 >> local31);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "(B)Z")
	public final boolean method4952() {
		this.anInt5769 -= 4;
		@Pc(17) int local17 = Static225.method4049(0, this.anInt5769, this.aByteArray65);
		@Pc(21) int local21 = this.method5000();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "(B)I")
	public final int method4953() {
		this.anInt5769 += 3;
		@Pc(43) int local43 = (this.aByteArray65[this.anInt5769 - 1] & 0xFF) + ((this.aByteArray65[this.anInt5769 - 2] & 0xFF) << 8) + ((this.aByteArray65[this.anInt5769 + -3] & 0xFF) << 16);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "(I)I")
	public final int method4954() {
		return -this.aByteArray65[this.anInt5769++] & 0xFF;
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(II)V")
	public final void method4955(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method4956(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5769;
		this.anInt5769 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4977(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(39) byte[] local39 = local28.toByteArray();
		this.anInt5769 = 0;
		this.method4962(local39.length);
		this.method4939(local39.length, local39);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)I")
	public final int method4957() {
		this.anInt5769 += 2;
		return ((this.aByteArray65[this.anInt5769 - 2] & 0xFF) << 8) + (this.aByteArray65[this.anInt5769 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "(I)I")
	public final int method4958() {
		this.anInt5769 += 4;
		return (this.aByteArray65[this.anInt5769 - 3] & 0xFF) + ((this.aByteArray65[this.anInt5769 - 4] & 0xFF) << 8) + ((this.aByteArray65[this.anInt5769 - 2] & 0xFF) << 24) + ((this.aByteArray65[this.anInt5769 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(IZ)V")
	public final void method4960(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZI)V")
	public final void method4961(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5769 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5769 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5769 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "(II)V")
	public final void method4962(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "(II)V")
	public final void method4963(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "(I)B")
	public final byte method4964() {
		return (byte) (128 - this.aByteArray65[this.anInt5769++]);
	}

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "(II)V")
	public final void method4965(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 + 128);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "(I)I")
	public final int method4966() {
		return this.aByteArray65[this.anInt5769++] & 0xFF;
	}

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "(B)I")
	public final int method4967() {
		this.anInt5769 += 2;
		return (this.aByteArray65[this.anInt5769 - 2] & 0xFF) + ((this.aByteArray65[this.anInt5769 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "(I)I")
	public final int method4968() {
		this.anInt5769 += 3;
		return ((this.aByteArray65[this.anInt5769 - 1] & 0xFF) << 8) + ((this.aByteArray65[this.anInt5769 - 3] & 0xFF) << 16) + (this.aByteArray65[this.anInt5769 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "(B)I")
	public final int method4969() {
		this.anInt5769 += 4;
		return (this.aByteArray65[this.anInt5769 - 4] & 0xFF) + ((this.aByteArray65[this.anInt5769 - 2] & 0xFF) << 16) + ((this.aByteArray65[this.anInt5769 - 1] & 0xFF) << 24) + ((this.aByteArray65[this.anInt5769 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method4970() {
		@Pc(14) byte local14 = this.aByteArray65[this.anInt5769++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(33) int local33 = this.method4981();
		if (this.aByteArray65.length < local33 + this.anInt5769) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(59) String local59 = Static207.method3831(this.aByteArray65, local33, this.anInt5769);
		this.anInt5769 += local33;
		return local59;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(ZI)V")
	public final void method4971(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(Z)B")
	public final byte method4972() {
		return this.aByteArray65[this.anInt5769++];
	}

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "(I)I")
	public final int method4973() {
		@Pc(16) int local16 = this.aByteArray65[this.anInt5769] & 0xFF;
		return local16 >= 128 ? this.method4999() - 32768 : this.method4966();
	}

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "(B)I")
	public final int method4974() {
		this.anInt5769 += 2;
		@Pc(36) int local36 = ((this.aByteArray65[this.anInt5769 - 2] & 0xFF) << 8) + (this.aByteArray65[this.anInt5769 - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "(II)J")
	public final long method4975(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(28) int local28 = local2 * 8;
		@Pc(30) long local30 = 0L;
		while (local28 >= 0) {
			local30 |= ((long) this.aByteArray65[this.anInt5769++] & 0xFFL) << local28;
			local28 -= 8;
		}
		return local30;
	}

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "(II)V")
	public final void method4976(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III[B)V")
	public final void method4977(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray65[this.anInt5769++];
		}
	}

	@OriginalMember(owner = "client!iaa", name = "p", descriptor = "(I)I")
	public final int method4978() {
		return this.aByteArray65[this.anInt5769++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "(II)V")
	public final void method4979(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "(B)B")
	public final byte method4980() {
		return (byte) -this.aByteArray65[this.anInt5769++];
	}

	@OriginalMember(owner = "client!iaa", name = "q", descriptor = "(I)I")
	public final int method4981() {
		@Pc(16) byte local16 = this.aByteArray65[this.anInt5769++];
		@Pc(26) int local26 = 0;
		while (local16 < 0) {
			local26 = (local26 | local16 & 0x7F) << 7;
			local16 = this.aByteArray65[this.anInt5769++];
		}
		return local26 | local16;
	}

	@OriginalMember(owner = "client!iaa", name = "r", descriptor = "(I)I")
	public final int method4982() {
		@Pc(13) int local13 = Static225.method4049(0, this.anInt5769, this.aByteArray65);
		this.method4979(local13);
		return local13;
	}

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "(B)I")
	public final int method4983() {
		this.anInt5769 += 2;
		return ((this.aByteArray65[this.anInt5769 - 1] & 0xFF) << 8) + (this.aByteArray65[this.anInt5769 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(IB)V")
	public final void method4984(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4950(arg0, -81849);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4962(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "(I)I")
	public final int method4985() {
		this.anInt5769 += 4;
		return ((this.aByteArray65[this.anInt5769 - 1] & 0xFF) << 8) + (((this.aByteArray65[this.anInt5769 - 3] & 0xFF) << 24) + ((this.aByteArray65[this.anInt5769 - 4] & 0xFF) << 16) + (this.aByteArray65[this.anInt5769 + -2] & 0xFF));
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "([IIII)V")
	public final void method4986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt5769;
		this.anInt5769 = 5;
		@Pc(17) int local17 = (arg1 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) int local25 = this.method5000();
			@Pc(29) int local29 = this.method5000();
			@Pc(31) int local31 = -957401312;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local29 -= local31 + arg0[local31 >>> 11 & 0x3] ^ local25 + (local25 << 4 ^ local25 >>> 5);
				local31 -= -1640531527;
				local25 -= arg0[local31 & 0x3] + local31 ^ (local29 << 4 ^ local29 >>> 5) + local29;
			}
			this.anInt5769 -= 8;
			this.method4979(local25);
			this.method4979(local29);
		}
		this.anInt5769 = local8;
	}

	@OriginalMember(owner = "client!iaa", name = "t", descriptor = "(I)Ljava/lang/String;")
	public final String method4987() {
		if (this.aByteArray65[this.anInt5769] == 0) {
			this.anInt5769++;
			return null;
		} else {
			return this.method4941();
		}
	}

	@OriginalMember(owner = "client!iaa", name = "u", descriptor = "(I)I")
	public final int method4988() {
		return 128 - this.aByteArray65[this.anInt5769++] & 0xFF;
	}

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "(II)V")
	public final void method4989(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!iaa", name = "v", descriptor = "(I)I")
	public final int method4990() {
		this.anInt5769 += 2;
		@Pc(33) int local33 = ((this.aByteArray65[this.anInt5769 - 2] & 0xFF) << 8) + (this.aByteArray65[this.anInt5769 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "(IZ)V")
	public final void method4991(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "([BIIB)V")
	public final void method4992(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(8) int local8 = arg1 - 1; local8 >= 0; local8--) {
			arg0[local8] = (byte) (this.aByteArray65[this.anInt5769++] - 128);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(BI)V")
	public final void method4993(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) arg0;
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method4994(@OriginalArg(0) String arg0) {
		@Pc(14) int local14 = Static111.method2282(arg0);
		this.aByteArray65[this.anInt5769++] = 0;
		this.method4944(local14);
		this.anInt5769 += Static99.method2140(this.anInt5769, arg0, this.aByteArray65);
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(IB)V")
	public final void method4995(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5769++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(BI)I")
	public final int method4996(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static225.method4049(arg0, this.anInt5769, this.aByteArray65);
		this.method4979(local11);
		return local11;
	}

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "(Z)I")
	public final int method4997() {
		@Pc(16) int local16 = this.aByteArray65[this.anInt5769] & 0xFF;
		return local16 < 128 ? this.method4966() - 64 : this.method4999() + -49152;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4998(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr");
		}
		this.anInt5769 += Static453.method6921(arg0.length(), this.aByteArray65, arg0, this.anInt5769);
		this.aByteArray65[this.anInt5769++] = 0;
	}

	@OriginalMember(owner = "client!iaa", name = "w", descriptor = "(I)I")
	public final int method4999() {
		this.anInt5769 += 2;
		return ((this.aByteArray65[this.anInt5769 - 2] & 0xFF) << 8) + (this.aByteArray65[this.anInt5769 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "(B)I")
	public final int method5000() {
		this.anInt5769 += 4;
		return (this.aByteArray65[this.anInt5769 - 1] & 0xFF) + ((this.aByteArray65[this.anInt5769 - 3] & 0xFF) << 16) + ((this.aByteArray65[this.anInt5769 - 4] & 0xFF) << 24) + ((this.aByteArray65[this.anInt5769 - 2] & 0xFF) << 8);
	}
}
