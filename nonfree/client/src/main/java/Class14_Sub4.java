import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
	public int anInt2637;

	@OriginalMember(owner = "client!jg", name = "mb", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public Class14_Sub4(@OriginalArg(0) int arg0) {
		this.anInt2637 = 0;
		this.aByteArray74 = Static24.method657(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "([B)V")
	public Class14_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray74 = arg0;
		this.anInt2637 = 0;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method2493() {
		if (this.aByteArray74[this.anInt2637] == 0) {
			this.anInt2637++;
			return null;
		} else {
			return this.method2496();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)V")
	public final void method2494(@OriginalArg(0) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI[BI)V")
	public final void method2495(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray74[this.anInt2637++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method2496() {
		@Pc(6) int local6 = this.anInt2637;
		while (this.aByteArray74[this.anInt2637++] != 0) {
		}
		@Pc(28) int local28 = this.anInt2637 - local6 - 1;
		return local28 == 0 ? "" : Static218.method3933(local6, local28, this.aByteArray74);
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)I")
	public final int method2497() {
		@Pc(16) byte local16 = this.aByteArray74[this.anInt2637++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray74[this.anInt2637++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)I")
	public final int method2498() {
		this.anInt2637 += 2;
		return (this.aByteArray74[this.anInt2637 - 1] & 0xFF) + ((this.aByteArray74[this.anInt2637 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)I")
	public final int method2499() {
		this.anInt2637 += 2;
		return (this.aByteArray74[this.anInt2637 - 2] & 0xFF) + ((this.aByteArray74[this.anInt2637 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)I")
	public final int method2501() {
		this.anInt2637 += 3;
		return (this.aByteArray74[this.anInt2637 - 1] & 0xFF) + ((this.aByteArray74[this.anInt2637 - 3] & 0xFF) << 16) + ((this.aByteArray74[this.anInt2637 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)I")
	public final int method2502() {
		this.anInt2637 += 2;
		@Pc(40) int local40 = ((this.aByteArray74[this.anInt2637 - 2] & 0xFF) << 8) + (this.aByteArray74[this.anInt2637 - 1] & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	public final void method2503(@OriginalArg(0) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 16);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V")
	public final void method2504(@OriginalArg(0) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)I")
	public final int method2505() {
		this.anInt2637 += 2;
		return ((this.aByteArray74[this.anInt2637 - 2] & 0xFF) << 8) + (this.aByteArray74[this.anInt2637 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)I")
	public final int method2506() {
		this.anInt2637 += 2;
		@Pc(34) int local34 = ((this.aByteArray74[this.anInt2637 - 1] & 0xFF) << 8) + (this.aByteArray74[this.anInt2637 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(B)I")
	public final int method2507() {
		@Pc(7) int local7 = 0;
		@Pc(19) int local19 = this.method2525();
		while (local19 == 32767) {
			local19 = this.method2525();
			local7 += 32767;
		}
		return local7 + local19;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([IB)V")
	public final void method2508(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt2637 / 8;
		this.anInt2637 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(21) int local21 = this.method2510();
			@Pc(25) int local25 = this.method2510();
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = 32;
			while (local31-- > 0) {
				local21 += arg0[local27 & 0x3] + local27 ^ local25 + (local25 << 4 ^ local25 >>> 5);
				local27 += -1640531527;
				local25 += arg0[local27 >>> 11 & 0x21400003] + local27 ^ (local21 << 4 ^ local21 >>> 5) + local21;
			}
			this.anInt2637 -= 8;
			this.method2541(local21);
			this.method2541(local25);
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(II)V")
	public final void method2509(@OriginalArg(1) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)I")
	public final int method2510() {
		this.anInt2637 += 4;
		return (this.aByteArray74[this.anInt2637 - 1] & 0xFF) + ((this.aByteArray74[this.anInt2637 - 4] & 0xFF) << 24) + ((this.aByteArray74[this.anInt2637 + -3] & 0xFF) << 16) + ((this.aByteArray74[this.anInt2637 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(B)I")
	public final int method2511() {
		return -this.aByteArray74[this.anInt2637++] & 0xFF;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)V")
	public final void method2512(@OriginalArg(1) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 16);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 24);
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(Z)I")
	public final int method2513() {
		return this.aByteArray74[this.anInt2637++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "(B)I")
	public final int method2514() {
		this.anInt2637 += 4;
		return (this.aByteArray74[this.anInt2637 - 4] & 0xFF) + ((this.aByteArray74[this.anInt2637 - 3] & 0xFF) << 8) + ((this.aByteArray74[this.anInt2637 + -1] & 0xFF) << 24) + ((this.aByteArray74[this.anInt2637 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "(I)I")
	public final int method2515() {
		@Pc(18) int local18 = this.aByteArray74[this.anInt2637] & 0xFF;
		return local18 >= 128 ? this.method2498() - 49152 : this.method2548() + -64;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(Z)J")
	public final long method2516() {
		@Pc(15) long local15 = (long) this.method2510() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2510() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BIII)V")
	public final void method2517(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = arg1 - 1; local15 >= 0; local15--) {
			arg0[local15] = (byte) (this.aByteArray74[this.anInt2637++] - 128);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[BII)V")
	public final void method2518(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = this.aByteArray74[this.anInt2637++];
		}
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(Z)Z")
	public final boolean method2519() {
		this.anInt2637 -= 4;
		@Pc(17) int local17 = Static280.method5741(this.aByteArray74, 0, this.anInt2637);
		@Pc(21) int local21 = this.method2510();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "(B)B")
	public final byte method2520() {
		return (byte) (this.aByteArray74[this.anInt2637++] - 128);
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(II)V")
	public final void method2521(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2538(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2509(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "(B)I")
	public final int method2522() {
		this.anInt2637 += 3;
		return ((this.aByteArray74[this.anInt2637 - 2] & 0xFF) << 8) + ((this.aByteArray74[this.anInt2637 - 1] & 0xFF) << 16) + (this.aByteArray74[this.anInt2637 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(II)V")
	public final void method2523(@OriginalArg(0) int arg0) {
		this.aByteArray74[this.anInt2637 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(II)V")
	public final void method2524(@OriginalArg(0) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 + 128);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "(I)I")
	public final int method2525() {
		@Pc(16) int local16 = this.aByteArray74[this.anInt2637] & 0xFF;
		return local16 >= 128 ? this.method2498() - 32768 : this.method2548();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
	public final void method2526(@OriginalArg(1) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 16);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method2527(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt2637 += Static165.method4553(this.aByteArray74, arg0.length(), arg0, this.anInt2637);
		this.aByteArray74[this.anInt2637++] = 0;
	}

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method2528() {
		@Pc(19) byte local19 = this.aByteArray74[this.anInt2637++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt2637;
		while (this.aByteArray74[this.anInt2637++] != 0) {
		}
		@Pc(52) int local52 = this.anInt2637 - local29 - 1;
		return local52 == 0 ? "" : Static218.method3933(local29, local52, this.aByteArray74);
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(II)V")
	public final void method2529(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2538(arg0 >>> 28 | 0x80);
					}
					this.method2538(arg0 >>> 21 | 0x80);
				}
				this.method2538(arg0 >>> 14 | 0x80);
			}
			this.method2538(arg0 >>> 7 | 0x80);
		}
		this.method2538(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "(II)I")
	public final int method2530(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static280.method5741(this.aByteArray74, arg0, this.anInt2637);
		this.method2541(local11);
		return local11;
	}

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "(II)V")
	public final void method2531(@OriginalArg(1) int arg0) {
		this.aByteArray74[this.anInt2637 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray74[this.anInt2637 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray74[this.anInt2637 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray74[this.anInt2637 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "(II)V")
	public final void method2532(@OriginalArg(0) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 16);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "(I)B")
	public final byte method2533() {
		return (byte) -this.aByteArray74[this.anInt2637++];
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2534(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2637;
		this.anInt2637 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2518(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2637 = 0;
		this.method2538(local31.length);
		this.method2495(local31, local31.length);
	}

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "(II)V")
	public final void method2535(@OriginalArg(0) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)J")
	public final long method2536(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local2 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray74[this.anInt2637++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "(II)V")
	public final void method2537(@OriginalArg(1) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 24);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "(II)V")
	public final void method2538(@OriginalArg(0) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "(I)I")
	public final int method2539() {
		return 128 - this.aByteArray74[this.anInt2637++] & 0xFF;
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(Z)I")
	public final int method2540() {
		this.anInt2637 += 2;
		return ((this.aByteArray74[this.anInt2637 - 1] & 0xFF) << 8) + (this.aByteArray74[this.anInt2637 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)V")
	public final void method2541(@OriginalArg(0) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 24);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 16);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIJ)V")
	public final void method2542(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(11) int local11 = arg0 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local11 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray74[this.anInt2637++] = (byte) (arg1 >> local27);
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(ZI)V")
	public final void method2543(@OriginalArg(1) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IJ)V")
	public final void method2544(@OriginalArg(1) long arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 56);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 48);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 40);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 32);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 24);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 16);
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "(II)V")
	public final void method2545(@OriginalArg(1) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) arg0;
		this.aByteArray74[this.anInt2637++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "(Z)I")
	public final int method2548() {
		return this.aByteArray74[this.anInt2637++] & 0xFF;
	}

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "(I)I")
	public final int method2550() {
		this.anInt2637 += 2;
		@Pc(31) int local31 = ((this.aByteArray74[this.anInt2637 - 1] & 0xFF) << 8) + (this.aByteArray74[this.anInt2637 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "(II)V")
	public final void method2551(@OriginalArg(1) int arg0) {
		this.aByteArray74[this.anInt2637++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "(Z)I")
	public final int method2552() {
		this.anInt2637 += 4;
		return (this.aByteArray74[this.anInt2637 - 3] & 0xFF) + ((this.aByteArray74[this.anInt2637 - 1] & 0xFF) << 16) + ((this.aByteArray74[this.anInt2637 + -2] & 0xFF) << 24) + ((this.aByteArray74[this.anInt2637 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "(B)B")
	public final byte method2553() {
		return this.aByteArray74[this.anInt2637++];
	}

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "(I)I")
	public final int method2554() {
		this.anInt2637 += 4;
		return ((this.aByteArray74[this.anInt2637 - 4] & 0xFF) << 16) + (((this.aByteArray74[this.anInt2637 - 3] & 0xFF) << 24) + ((this.aByteArray74[this.anInt2637 - 1] & 0xFF) << 8)) + (this.aByteArray74[this.anInt2637 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBI[I)V")
	public final void method2555(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt2637;
		this.anInt2637 = 5;
		@Pc(22) int local22 = (arg0 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) int local30 = this.method2510();
			@Pc(34) int local34 = this.method2510();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= (local30 << 4 ^ local30 >>> 5) + local30 ^ local36 + arg1[local36 >>> 11 & 0xD6400003];
				local36 -= -1640531527;
				local30 -= (local34 >>> 5 ^ local34 << 4) + local34 ^ local36 + arg1[local36 & 0x3];
			}
			this.anInt2637 -= 8;
			this.method2541(local30);
			this.method2541(local34);
		}
		this.anInt2637 = local8;
	}
}
