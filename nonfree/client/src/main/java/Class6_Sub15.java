import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public class Class6_Sub15 extends Class6 {

	@OriginalMember(owner = "client!jc", name = "ub", descriptor = "I")
	public int anInt3174 = 0;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
	public Class6_Sub15(@OriginalArg(0) int arg0) {
		this.aByteArray20 = Static169.method3317(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
	public Class6_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(II)V")
	public final void method2984(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BJ)V")
	public final void method2985(@OriginalArg(1) long arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) (int) (arg0 >> 56);
		this.aByteArray20[this.anInt3174++] = (byte) (int) (arg0 >> 48);
		this.aByteArray20[this.anInt3174++] = (byte) (int) (arg0 >> 40);
		this.aByteArray20[this.anInt3174++] = (byte) (int) (arg0 >> 32);
		this.aByteArray20[this.anInt3174++] = (byte) (int) (arg0 >> 24);
		this.aByteArray20[this.anInt3174++] = (byte) (int) (arg0 >> 16);
		this.aByteArray20[this.anInt3174++] = (byte) (int) (arg0 >> 8);
		this.aByteArray20[this.anInt3174++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method2986() {
		if (this.aByteArray20[this.anInt3174] == 0) {
			this.anInt3174++;
			return null;
		} else {
			return this.method3046();
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(Z)I")
	public final int method2987() {
		this.anInt3174 += 3;
		return ((this.aByteArray20[this.anInt3174 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt3174 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[BII)V")
	public final void method2988(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(16) int local16 = arg0; local16 < arg2 + arg0; local16++) {
			this.aByteArray20[this.anInt3174++] = arg1[local16];
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)I")
	public final int method2989() {
		this.anInt3174 += 2;
		@Pc(39) int local39 = ((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt3174 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)B")
	public final byte method2990() {
		return (byte) -this.aByteArray20[this.anInt3174++];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method2991(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt3174 += Static326.method5121(arg0.length(), this.aByteArray20, this.anInt3174, arg0);
		this.aByteArray20[this.anInt3174++] = 0;
	}

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "(I)I")
	public final int method2992() {
		@Pc(17) int local17 = this.aByteArray20[this.anInt3174] & 0xFF;
		return local17 >= 128 ? this.method3018() - 32768 : this.method3030();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)V")
	public final void method2993(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt3174 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([IB)V")
	public final void method2994(@OriginalArg(0) int[] arg0) {
		@Pc(18) int local18 = this.anInt3174 / 8;
		this.anInt3174 = 0;
		for (@Pc(23) int local23 = 0; local23 < local18; local23++) {
			@Pc(29) int local29 = this.method3015();
			@Pc(33) int local33 = this.method3015();
			@Pc(35) int local35 = -957401312;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local33 -= arg0[local35 >>> 11 & 0xC2400003] + local35 ^ (local29 >>> 5 ^ local29 << 4) - -local29;
				local35 -= -1640531527;
				local29 -= local35 + arg0[local35 & 0x3] ^ local33 + (local33 << 4 ^ local33 >>> 5);
			}
			this.anInt3174 -= 8;
			this.method3029(local29);
			this.method3029(local33);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZJI)V")
	public final void method2995(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local6 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray20[this.anInt3174++] = (byte) (int) (arg0 >> local25);
		}
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(II)V")
	public final void method2996(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3016(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3040(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)J")
	public final long method2997(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local6 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray20[this.anInt3174++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(B)Ljava/lang/String;")
	public final String method2998() {
		@Pc(16) byte local16 = this.aByteArray20[this.anInt3174++];
		if (local16 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(40) int local40 = this.anInt3174;
		while (this.aByteArray20[this.anInt3174++] != 0) {
		}
		@Pc(63) int local63 = this.anInt3174 - local40 - 1;
		return local63 == 0 ? "" : Static420.method6420(local40, local63, this.aByteArray20);
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(II)V")
	public final void method2999(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "(B)I")
	public final int method3000() {
		@Pc(11) int local11 = this.aByteArray20[this.anInt3174] & 0xFF;
		return local11 < 128 ? this.method3030() - 64 : this.method3018() + -49152;
	}

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "(I)Z")
	public final boolean method3001() {
		this.anInt3174 -= 4;
		@Pc(17) int local17 = Static170.method3323(this.anInt3174, this.aByteArray20, 0);
		@Pc(21) int local21 = this.method3015();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[III)V")
	public final void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt3174;
		this.anInt3174 = arg0;
		@Pc(18) int local18 = (arg2 - arg0) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(28) int local28 = this.method3015();
			@Pc(32) int local32 = this.method3015();
			@Pc(34) int local34 = 0;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local28 += (local32 >>> 5 ^ local32 << 4) + local32 ^ local34 + arg1[local34 & 0x3];
				local34 += -1640531527;
				local32 += (local28 >>> 5 ^ local28 << 4) + local28 ^ local34 - -arg1[local34 >>> 11 & 0x3];
			}
			this.anInt3174 -= 8;
			this.method3029(local28);
			this.method3029(local32);
		}
		this.anInt3174 = local8;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
	public final int method3003() {
		this.anInt3174 += 2;
		@Pc(43) int local43 = ((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt3174 - 1] - 128 & 0xFF);
		if (local43 > 32767) {
			local43 -= 65536;
		}
		return local43;
	}

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "(I)I")
	public final int method3004() {
		this.anInt3174 += 3;
		@Pc(44) int local44 = (this.aByteArray20[this.anInt3174 - 1] & 0xFF) + ((this.aByteArray20[this.anInt3174 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 8);
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "(B)I")
	public final int method3005() {
		this.anInt3174 += 2;
		return (this.aByteArray20[this.anInt3174 - 1] - 128 & 0xFF) + ((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)J")
	public final long method3006() {
		@Pc(12) long local12 = (long) this.method3030() & 0xFFFFFFFFL;
		@Pc(27) long local27 = (long) this.method3015() & 0xFFFFFFFFL;
		return (local12 << 32) + local27;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
	public final int method3007() {
		@Pc(17) int local17 = 0;
		@Pc(21) int local21;
		for (local21 = this.method2992(); local21 == 32767; local21 = this.method2992()) {
			local17 += 32767;
		}
		return local17 + local21;
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(II)V")
	public final void method3008(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IZ)V")
	public final void method3009(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IB)V")
	public final void method3010(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V")
	public final void method3011(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIII)V")
	public final void method3012(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(23) int local23 = arg1 - 1; local23 >= 0; local23--) {
			arg0[local23] = this.aByteArray20[this.anInt3174++];
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public final void method3013() {
		if (this.aByteArray20 != null) {
			Static169.method3318(this.aByteArray20);
		}
		this.aByteArray20 = null;
	}

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "(I)B")
	public final byte method3014() {
		return (byte) (128 - this.aByteArray20[this.anInt3174++]);
	}

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "(I)I")
	public final int method3015() {
		this.anInt3174 += 4;
		return ((this.aByteArray20[this.anInt3174 - 4] & 0xFF) << 24) + (((this.aByteArray20[this.anInt3174 - 3] & 0xFF) << 16) - (-((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 8) - (this.aByteArray20[this.anInt3174 - 1] & 0xFF)));
	}

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "(II)V")
	public final void method3016(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	public final void method3017(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "(B)I")
	public final int method3018() {
		this.anInt3174 += 2;
		return (this.aByteArray20[this.anInt3174 - 1] & 0xFF) + ((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BI)V")
	public final void method3019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(3) int local3 = arg1; local3 < arg1 + arg0; local3++) {
			arg2[local3] = this.aByteArray20[this.anInt3174++];
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)V")
	public final void method3020(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 + 128);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I")
	public final int method3021() {
		return -this.aByteArray20[this.anInt3174++] & 0xFF;
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(B)I")
	public final int method3022() {
		this.anInt3174 += 4;
		return ((this.aByteArray20[this.anInt3174 - 3] & 0xFF) << 24) + ((this.aByteArray20[this.anInt3174 - 4] & 0xFF) << 16) + ((this.aByteArray20[this.anInt3174 + -1] & 0xFF) << 8) + (this.aByteArray20[this.anInt3174 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "(II)V")
	public final void method3023(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(IB)V")
	public final void method3024(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "(I)I")
	public final int method3025() {
		this.anInt3174 += 3;
		return (this.aByteArray20[this.anInt3174 - 1] & 0xFF) + ((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 16) + ((this.aByteArray20[this.anInt3174 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)B")
	public final byte method3027() {
		return this.aByteArray20[this.anInt3174++];
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(II)V")
	public final void method3028(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt3174 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt3174 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt3174 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(II)V")
	public final void method3029(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	public final int method3030() {
		return this.aByteArray20[this.anInt3174++] & 0xFF;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)I")
	public final int method3031(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = Static170.method3323(this.anInt3174, this.aByteArray20, arg0);
		this.method3029(local19);
		return local19;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)I")
	public final int method3032() {
		this.anInt3174 += 4;
		return (this.aByteArray20[this.anInt3174 - 4] & 0xFF) + ((this.aByteArray20[this.anInt3174 - 1] & 0xFF) << 24) + ((this.aByteArray20[this.anInt3174 + -2] & 0xFF) << 16) + ((this.aByteArray20[this.anInt3174 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)B")
	public final byte method3033() {
		return (byte) (this.aByteArray20[this.anInt3174++] - 128);
	}

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "(B)I")
	public final int method3034() {
		return this.aByteArray20[this.anInt3174++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method3035(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray20[this.anInt3174++] = 0;
		this.anInt3174 += Static326.method5121(arg0.length(), this.aByteArray20, this.anInt3174, arg0);
		this.aByteArray20[this.anInt3174++] = 0;
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)I")
	public final int method3036() {
		return 128 - this.aByteArray20[this.anInt3174++] & 0xFF;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(IB)V")
	public final void method3037(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method3038(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3174;
		this.anInt3174 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3019(local6, 0, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt3174 = 0;
		this.method3040(local31.length);
		this.method2988(0, local31, local31.length);
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)J")
	public final long method3039() {
		@Pc(18) long local18 = (long) this.method3050() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method3050() & 0xFFFFFFFFL;
		return local18 + (local25 << 32);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(BI)V")
	public final void method3040(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(Z)I")
	public final int method3041() {
		@Pc(16) byte local16 = this.aByteArray20[this.anInt3174++];
		@Pc(27) int local27 = 0;
		while (local16 < 0) {
			local27 = (local27 | local16 & 0x7F) << 7;
			local16 = this.aByteArray20[this.anInt3174++];
		}
		return local27 | local16;
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(B)I")
	public final int method3042() {
		this.anInt3174 += 2;
		return (this.aByteArray20[this.anInt3174 - 2] & 0xFF) + ((this.aByteArray20[this.anInt3174 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "(II)V")
	public final void method3043(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3016(arg0 >>> 28 | 0x80);
					}
					this.method3016(arg0 >>> 21 | 0x80);
				}
				this.method3016(arg0 >>> 14 | 0x80);
			}
			this.method3016(arg0 >>> 7 | 0x80);
		}
		this.method3016(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(B)I")
	public final int method3044() {
		if (this.aByteArray20[this.anInt3174] < 0) {
			return Integer.MAX_VALUE & this.method3015();
		} else {
			@Pc(29) int local29 = this.method3018();
			return local29 == 32767 ? -1 : local29;
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(II)V")
	public final void method3045(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt3174++] = (byte) arg0;
		this.aByteArray20[this.anInt3174++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method3046() {
		@Pc(8) int local8 = this.anInt3174;
		while (this.aByteArray20[this.anInt3174++] != 0) {
		}
		@Pc(35) int local35 = this.anInt3174 - local8 - 1;
		return local35 == 0 ? "" : Static420.method6420(local8, local35, this.aByteArray20);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIII)V")
	public final void method3047(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt3174;
		this.anInt3174 = 5;
		@Pc(17) int local17 = (arg1 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(27) int local27 = this.method3015();
			@Pc(31) int local31 = this.method3015();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= local33 + arg0[local33 >>> 11 & 0x3] ^ local27 + (local27 >>> 5 ^ local27 << 4);
				local33 -= -1640531527;
				local27 -= (local31 >>> 5 ^ local31 << 4) + local31 ^ arg0[local33 & 0x3] + local33;
			}
			this.anInt3174 -= 8;
			this.method3029(local27);
			this.method3029(local31);
		}
		this.anInt3174 = local8;
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(I)I")
	public final int method3048() {
		this.anInt3174 += 2;
		return (this.aByteArray20[this.anInt3174 - 2] - 128 & 0xFF) + ((this.aByteArray20[this.anInt3174 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(B)J")
	public final long method3049() {
		@Pc(19) long local19 = (long) this.method3015() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method3015() & 0xFFFFFFFFL;
		return local26 + (local19 << 32);
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(Z)I")
	public final int method3050() {
		this.anInt3174 += 4;
		return ((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 16) + ((this.aByteArray20[this.anInt3174 - 1] & 0xFF) << 24) + ((this.aByteArray20[this.anInt3174 + -3] & 0xFF) << 8) + (this.aByteArray20[this.anInt3174 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(I)I")
	public final int method3051() {
		this.anInt3174 += 4;
		return ((this.aByteArray20[this.anInt3174 - 4] & 0xFF) << 8) + (((this.aByteArray20[this.anInt3174 - 2] & 0xFF) << 24) + ((this.aByteArray20[this.anInt3174 - 1] & 0xFF) << 16) + (this.aByteArray20[this.anInt3174 + -3] & 0xFF));
	}
}
