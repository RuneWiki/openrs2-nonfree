import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public class Class10_Sub8 extends Class10 {

	@OriginalMember(owner = "client!nn", name = "cb", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
	public int anInt2989;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V")
	public Class10_Sub8(@OriginalArg(0) int arg0) {
		this.aByteArray44 = Static162.method2706(arg0);
		this.anInt2989 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "([B)V")
	public Class10_Sub8(@OriginalArg(0) byte[] arg0) {
		this.anInt2989 = 0;
		this.aByteArray44 = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(ZI)V")
	public final void method2456(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[BI)V")
	public final void method2457(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			this.aByteArray44[this.anInt2989++] = arg1[local11];
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V")
	public final void method2458(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)I")
	public final int method2459() {
		this.anInt2989 += 4;
		return ((this.aByteArray44[this.anInt2989 - 3] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2989 - 4] & 0xFF) << 24) + ((this.aByteArray44[this.anInt2989 + -2] & 0xFF) << 8) + (this.aByteArray44[this.anInt2989 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)B")
	public final byte method2460() {
		return this.aByteArray44[this.anInt2989++];
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)I")
	public final int method2461(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = Static419.method5517(arg0, this.aByteArray44, this.anInt2989);
		this.method2506(local18);
		return local18;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)I")
	public final int method2462() {
		@Pc(11) int local11 = this.aByteArray44[this.anInt2989] & 0xFF;
		return local11 >= 128 ? this.method2485() - 49152 : this.method2502() + -64;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)I")
	public final int method2463() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method2469();
		while (local11 == 32767) {
			local11 = this.method2469();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(ZI)V")
	public final void method2464(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method2465(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt2989 += Static118.method2053(arg0.length(), this.aByteArray44, this.anInt2989, arg0);
		this.aByteArray44[this.anInt2989++] = 0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(IB)V")
	public final void method2467(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2458(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2509(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)I")
	public final int method2468() {
		this.anInt2989 += 4;
		return (this.aByteArray44[this.anInt2989 - 3] & 0xFF) + ((this.aByteArray44[this.anInt2989 - 4] & 0xFF) << 8) + ((this.aByteArray44[this.anInt2989 - 1] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2989 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)I")
	public final int method2469() {
		@Pc(16) int local16 = this.aByteArray44[this.anInt2989] & 0xFF;
		return local16 < 128 ? this.method2502() : this.method2485() - 32768;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(JI)V")
	public final void method2470(@OriginalArg(0) long arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 56);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 48);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 40);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 32);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)I")
	public final int method2471() {
		this.anInt2989 += 2;
		return (this.aByteArray44[this.anInt2989 - 2] - 128 & 0xFF) + ((this.aByteArray44[this.anInt2989 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(ZI)V")
	public final void method2472(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(IB)V")
	public final void method2473(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)V")
	public final void method2474(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)B")
	public final byte method2475() {
		return (byte) (128 - this.aByteArray44[this.anInt2989++]);
	}

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "(I)B")
	public final byte method2476() {
		return (byte) -this.aByteArray44[this.anInt2989++];
	}

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "(I)I")
	public final int method2477() {
		this.anInt2989 += 2;
		@Pc(33) int local33 = (this.aByteArray44[this.anInt2989 - 1] - 128 & 0xFF) + ((this.aByteArray44[this.anInt2989 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method2478() {
		@Pc(6) int local6 = this.anInt2989;
		while (this.aByteArray44[this.anInt2989++] != 0) {
		}
		@Pc(26) int local26 = this.anInt2989 - local6 - 1;
		return local26 == 0 ? "" : Static254.method3689(local6, this.aByteArray44, local26);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method2479(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = Static316.method4336(arg0);
		this.aByteArray44[this.anInt2989++] = 0;
		this.method2484(local14);
		this.anInt2989 += Static87.method1635(arg0, this.aByteArray44, this.anInt2989);
	}

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "(I)I")
	public final int method2480() {
		@Pc(21) byte local21 = this.aByteArray44[this.anInt2989++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray44[this.anInt2989++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(B)B")
	public final byte method2481() {
		return (byte) (this.aByteArray44[this.anInt2989++] - 128);
	}

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method2482() {
		@Pc(14) byte local14 = this.aByteArray44[this.anInt2989++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt2989;
		while (this.aByteArray44[this.anInt2989++] != 0) {
		}
		@Pc(44) int local44 = this.anInt2989 - local24 - 1;
		return local44 == 0 ? "" : Static254.method3689(local24, this.aByteArray44, local44);
	}

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "(I)I")
	public final int method2483() {
		return -this.aByteArray44[this.anInt2989++] & 0xFF;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V")
	public final void method2484(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2458(arg0 >>> 28 | 0x80);
					}
					this.method2458(arg0 >>> 21 | 0x80);
				}
				this.method2458(arg0 >>> 14 | 0x80);
			}
			this.method2458(arg0 >>> 7 | 0x80);
		}
		this.method2458(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)I")
	public final int method2485() {
		this.anInt2989 += 2;
		return (this.aByteArray44[this.anInt2989 - 1] & 0xFF) + ((this.aByteArray44[this.anInt2989 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "(I)I")
	public final int method2486() {
		return this.aByteArray44[this.anInt2989++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "(B)I")
	public final int method2487() {
		this.anInt2989 += 4;
		return ((this.aByteArray44[this.anInt2989 - 2] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2989 - 1] & 0xFF) << 24) + ((this.aByteArray44[this.anInt2989 - 3] & 0xFF) << 8) + (this.aByteArray44[this.anInt2989 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(II)V")
	public final void method2488(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2989 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2489(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2989;
		this.anInt2989 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2493(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2989 = 0;
		this.method2509(local31.length);
		this.method2457(local31.length, local31);
	}

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method2490() {
		if (this.aByteArray44[this.anInt2989] == 0) {
			this.anInt2989++;
			return null;
		} else {
			return this.method2478();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBJ)V")
	public final void method2491(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(28) int local28 = local6 * 8; local28 >= 0; local28 -= 8) {
			this.aByteArray44[this.anInt2989++] = (byte) (arg1 >> local28);
		}
	}

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "(B)I")
	public final int method2492() {
		this.anInt2989 += 2;
		@Pc(38) int local38 = (this.aByteArray44[this.anInt2989 - 1] & 0xFF) + ((this.aByteArray44[this.anInt2989 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II[BI)V")
	public final void method2493(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray44[this.anInt2989++];
		}
	}

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "(I)I")
	public final int method2494() {
		@Pc(11) int local11 = Static419.method5517(0, this.aByteArray44, this.anInt2989);
		this.method2506(local11);
		return local11;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(Z)I")
	public final int method2495() {
		this.anInt2989 += 3;
		return (this.aByteArray44[this.anInt2989 - 3] & 0xFF) + ((this.aByteArray44[this.anInt2989 - 1] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2989 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(II)V")
	public final void method2496(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(II)V")
	public final void method2497(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "(I)I")
	public final int method2498() {
		this.anInt2989 += 2;
		return (this.aByteArray44[this.anInt2989 - 2] & 0xFF) + ((this.aByteArray44[this.anInt2989 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method2499() {
		@Pc(14) byte local14 = this.aByteArray44[this.anInt2989++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(25) int local25 = this.method2480();
		if (this.anInt2989 + local25 > this.aByteArray44.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(50) String local50 = Static9.method114(this.aByteArray44, local25, this.anInt2989);
		this.anInt2989 += local25;
		return local50;
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "(II)V")
	public final void method2500(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2989 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2989 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIB[I)V")
	public final void method2501(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(13) int local13 = this.anInt2989;
		this.anInt2989 = 5;
		@Pc(23) int local23 = (arg0 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) int local31 = this.method2459();
			@Pc(35) int local35 = this.method2459();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= local37 + arg1[local37 >>> 11 & 0x3] ^ local31 + (local31 >>> 5 ^ local31 << 4);
				local37 -= -1640531527;
				local31 -= arg1[local37 & 0x3] + local37 ^ (local35 << 4 ^ local35 >>> 5) + local35;
			}
			this.anInt2989 -= 8;
			this.method2506(local31);
			this.method2506(local35);
		}
		this.anInt2989 = local13;
	}

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "(I)I")
	public final int method2502() {
		return this.aByteArray44[this.anInt2989++] & 0xFF;
	}

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "(I)I")
	public final int method2503() {
		return 128 - this.aByteArray44[this.anInt2989++] & 0xFF;
	}

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "(II)V")
	public final void method2504(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(ZI)V")
	public final void method2505(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(BI)V")
	public final void method2506(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "(I)I")
	public final int method2507() {
		this.anInt2989 += 3;
		return (this.aByteArray44[this.anInt2989 - 1] & 0xFF) + ((this.aByteArray44[this.anInt2989 - 3] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2989 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "(I)I")
	public final int method2508() {
		this.anInt2989 += 3;
		@Pc(44) int local44 = ((this.aByteArray44[this.anInt2989 - 3] & 0xFF) << 16) + (this.aByteArray44[this.anInt2989 - 2] << 8 & 0xFF00) + (this.aByteArray44[this.anInt2989 + -1] & 0xFF);
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "(II)V")
	public final void method2509(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "(II)J")
	public final long method2510(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray44[this.anInt2989++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(Z)Z")
	public final boolean method2511() {
		this.anInt2989 -= 4;
		@Pc(17) int local17 = Static419.method5517(0, this.aByteArray44, this.anInt2989);
		@Pc(21) int local21 = this.method2459();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "(I)I")
	public final int method2512() {
		this.anInt2989 += 2;
		@Pc(40) int local40 = (this.aByteArray44[this.anInt2989 - 2] - 128 & 0xFF) + ((this.aByteArray44[this.anInt2989 - 1] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I[BII)V")
	public final void method2513(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = (byte) (this.aByteArray44[this.anInt2989++] - 128);
		}
	}

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "(B)I")
	public final int method2515() {
		this.anInt2989 += 4;
		return (this.aByteArray44[this.anInt2989 - 2] & 0xFF) + ((this.aByteArray44[this.anInt2989 - 3] & 0xFF) << 24) + ((this.aByteArray44[this.anInt2989 - 4] & 0xFF) << 16) + ((this.aByteArray44[this.anInt2989 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(IZ)V")
	public final void method2517(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "(II)V")
	public final void method2518(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(BI)V")
	public final void method2519(@OriginalArg(1) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 + 128);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "(B)I")
	public final int method2520() {
		this.anInt2989 += 2;
		return ((this.aByteArray44[this.anInt2989 - 2] & 0xFF) << 8) + (this.aByteArray44[this.anInt2989 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(Z)J")
	public final long method2521() {
		@Pc(10) long local10 = (long) this.method2459() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method2459() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "(II)V")
	public final void method2523(@OriginalArg(0) int arg0) {
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 16);
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 24);
		this.aByteArray44[this.anInt2989++] = (byte) arg0;
		this.aByteArray44[this.anInt2989++] = (byte) (arg0 >> 8);
	}
}
