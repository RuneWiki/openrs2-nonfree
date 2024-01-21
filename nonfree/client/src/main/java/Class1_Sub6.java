import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!hc", name = "xb", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!hc", name = "qb", descriptor = "I")
	public int anInt839;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6(@OriginalArg(0) int arg0) {
		this.aByteArray3 = Static167.method3068(arg0);
		this.anInt839 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub6(@OriginalArg(0) byte[] arg0) {
		this.anInt839 = 0;
		this.aByteArray3 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public final void method496(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt839++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
	public final int method497() {
		this.anInt839 += 2;
		@Pc(39) int local39 = (this.aByteArray3[this.anInt839 - 1] & 0xFF) + ((this.aByteArray3[this.anInt839 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)I")
	public final int method498() {
		return -this.aByteArray3[this.anInt839++] & 0xFF;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)I")
	public final int method499() {
		this.anInt839 += 4;
		return (this.aByteArray3[this.anInt839 - 1] & 0xFF) + ((this.aByteArray3[this.anInt839 - 2] & 0xFF) << 8) + ((this.aByteArray3[this.anInt839 + -4] & 0xFF) << 24) + ((this.aByteArray3[this.anInt839 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)I")
	public final int method501() {
		this.anInt839 += 3;
		return (this.aByteArray3[this.anInt839 - 1] & 0xFF) + ((this.aByteArray3[this.anInt839 - 2] & 0xFF) << 8) + ((this.aByteArray3[this.anInt839 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)I")
	public final int method502() {
		this.anInt839 += 4;
		return (this.aByteArray3[this.anInt839 - 3] & 0xFF) + ((this.aByteArray3[this.anInt839 - 2] & 0xFF) << 24) + ((this.aByteArray3[this.anInt839 + -1] & 0xFF) << 16) + ((this.aByteArray3[this.anInt839 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)I")
	public final int method503(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static172.method3130(this.aByteArray3, arg0, this.anInt839);
		this.method513(local11);
		return local11;
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)B")
	public final byte method504() {
		return (byte) -this.aByteArray3[this.anInt839++];
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)I")
	public final int method505() {
		this.anInt839 += 3;
		return ((this.aByteArray3[this.anInt839 - 3] & 0xFF) << 16) - (-((this.aByteArray3[this.anInt839 - 1] & 0xFF) << 8) - (this.aByteArray3[this.anInt839 - 2] & 0xFF));
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)B")
	public final byte method506() {
		return (byte) (128 - this.aByteArray3[this.anInt839++]);
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)B")
	public final byte method507() {
		return (byte) (this.aByteArray3[this.anInt839++] - 128);
	}

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)I")
	public final int method508() {
		this.anInt839 += 2;
		@Pc(31) int local31 = ((this.aByteArray3[this.anInt839 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt839 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)V")
	public final void method509(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt839++] = (byte) arg0;
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)Lclient!ea;")
	public final Class18 method510() {
		@Pc(14) int local14 = this.anInt839;
		while (this.aByteArray3[this.anInt839++] != 0) {
		}
		return Static65.method1297(this.anInt839 - local14 - 1, this.aByteArray3, local14);
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)V")
	public final void method511(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)V")
	public final void method512(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(BI)V")
	public final void method513(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt839++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(II)V")
	public final void method514(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt839 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(JB)V")
	public final void method515(@OriginalArg(0) long arg0) {
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 56);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 48);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 40);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 32);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt839++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(BI)V")
	public final void method517(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method530(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method531(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(B)I")
	public final int method518() {
		return this.aByteArray3[this.anInt839++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IJ)V")
	public final void method519(@OriginalArg(1) long arg0) {
		this.method509((int) (arg0 >> 32));
		this.method509((int) arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III[B)V")
	public final void method520(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			this.aByteArray3[this.anInt839++] = arg1[local8];
		}
	}

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)Lclient!ea;")
	public final Class18 method521() {
		if (this.aByteArray3[this.anInt839] == 0) {
			this.anInt839++;
			return null;
		} else {
			return this.method510();
		}
	}

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "(I)I")
	public final int method522() {
		this.anInt839 += 2;
		return ((this.aByteArray3[this.anInt839 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt839 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)V")
	public final void method523(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) (arg0 + 128);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method524(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt839;
		this.anInt839 = 0;
		@Pc(19) byte[] local19 = new byte[local6];
		this.method534(local6, local19);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt839 = 0;
		this.method530(local38.length);
		this.method520(local38.length, local38);
	}

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "(I)I")
	public final int method525() {
		@Pc(19) int local19 = this.aByteArray3[this.anInt839] & 0xFF;
		return local19 >= 128 ? this.method546() - 49152 : this.method544() - 64;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(BI)V")
	public final void method526(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt839 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt839 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt839 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt839 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "(I)I")
	public final int method527() {
		@Pc(7) int local7 = this.aByteArray3[this.anInt839] & 0xFF;
		return local7 >= 128 ? this.method546() - 32768 : this.method544();
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IZ)V")
	public final void method528(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) arg0;
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BII)V")
	public final void method529(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = this.aByteArray3[this.anInt839++];
		}
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(II)V")
	public final void method530(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(II)V")
	public final void method531(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt839++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(ZI)V")
	public final void method532(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt839++] = (byte) arg0;
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "(I)I")
	public final int method533() {
		return 128 - this.aByteArray3[this.anInt839++] & 0xFF;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[BB)V")
	public final void method534(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			arg1[local5] = this.aByteArray3[this.anInt839++];
		}
	}

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "(I)I")
	public final int method535() {
		this.anInt839 += 4;
		return (this.aByteArray3[this.anInt839 - 2] & 0xFF) + ((this.aByteArray3[this.anInt839 - 1] & 0xFF) << 8) + ((this.aByteArray3[this.anInt839 + -3] & 0xFF) << 24) + ((this.aByteArray3[this.anInt839 - 4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "(I)I")
	public final int method536() {
		this.anInt839 += 2;
		@Pc(38) int local38 = (this.aByteArray3[this.anInt839 - 1] - 128 & 0xFF) + ((this.aByteArray3[this.anInt839 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(Z)J")
	public final long method537() {
		@Pc(10) long local10 = (long) this.method499() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method499() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(II)V")
	public final void method538(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "(II)V")
	public final void method539(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt839++] = (byte) arg0;
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt839++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(B)I")
	public final int method540() {
		@Pc(14) int local14 = 0;
		@Pc(25) byte local25;
		for (local25 = this.aByteArray3[this.anInt839++]; local25 < 0; local25 = this.aByteArray3[this.anInt839++]) {
			local14 = (local14 | local25 & 0x7F) << 7;
		}
		return local25 | local14;
	}

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "(I)I")
	public final int method541() {
		this.anInt839 += 2;
		return ((this.aByteArray3[this.anInt839 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt839 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IB)V")
	public final void method542(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method530(arg0 >>> 28 | 0x80);
					}
					this.method530(arg0 >>> 21 | 0x80);
				}
				this.method530(arg0 >>> 14 | 0x80);
			}
			this.method530(arg0 >>> 7 | 0x80);
		}
		this.method530(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ea;I)V")
	public final void method543(@OriginalArg(0) Class18 arg0) {
		this.anInt839 += arg0.method752(arg0.method747(), this.anInt839, this.aByteArray3);
		this.aByteArray3[this.anInt839++] = 0;
	}

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "(I)I")
	public final int method544() {
		return this.aByteArray3[this.anInt839++] & 0xFF;
	}

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "(I)I")
	public final int method545() {
		this.anInt839 += 4;
		return ((this.aByteArray3[this.anInt839 - 1] & 0xFF) << 24) + ((this.aByteArray3[this.anInt839 - 2] & 0xFF) << 16) + ((this.aByteArray3[this.anInt839 + -3] & 0xFF) << 8) + (this.aByteArray3[this.anInt839 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "(I)I")
	public final int method546() {
		this.anInt839 += 2;
		return ((this.aByteArray3[this.anInt839 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt839 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB[I)V")
	public final void method547(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(6) int local6 = this.anInt839;
		@Pc(12) int local12 = (arg0 - 5) / 8;
		this.anInt839 = 5;
		for (@Pc(17) int local17 = 0; local17 < local12; local17++) {
			@Pc(22) int local22 = this.method499();
			@Pc(26) int local26 = this.method499();
			@Pc(28) int local28 = -957401312;
			@Pc(32) int local32 = 32;
			while (local32-- > 0) {
				local26 -= local22 + (local22 >>> 5 ^ local22 << 4) ^ arg1[local28 >>> 11 & 0x4BA00003] + local28;
				local28 -= -1640531527;
				local22 -= local28 + arg1[local28 & 0x3] ^ (local26 << 4 ^ local26 >>> 5) - -local26;
			}
			this.anInt839 -= 8;
			this.method513(local22);
			this.method513(local26);
		}
		this.anInt839 = local6;
	}

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(B)B")
	public final byte method548() {
		return this.aByteArray3[this.anInt839++];
	}

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "(I)I")
	public final int method550() {
		this.anInt839 += 2;
		return ((this.aByteArray3[this.anInt839 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt839 - 1] - 128 & 0xFF);
	}
}
