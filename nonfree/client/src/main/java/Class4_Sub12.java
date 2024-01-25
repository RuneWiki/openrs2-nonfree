import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!iv", name = "z", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!iv", name = "rb", descriptor = "I")
	public int anInt2997;

	static {
		new Class83("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(I)V")
	public Class4_Sub12(@OriginalArg(0) int arg0) {
		this.aByteArray36 = Static277.method3931(arg0);
		this.anInt2997 = 0;
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "([B)V")
	public Class4_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray36 = arg0;
		this.anInt2997 = 0;
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)I")
	public final int method2489() {
		return 128 - this.aByteArray36[this.anInt2997++] & 0xFF;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I")
	public final int method2490() {
		return this.aByteArray36[this.anInt2997++] & 0xFF;
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)I")
	public final int method2491() {
		this.anInt2997 += 4;
		return (this.aByteArray36[this.anInt2997 - 3] & 0xFF) + (((this.aByteArray36[this.anInt2997 - 2] & 0xFF) << 24) - (-((this.aByteArray36[this.anInt2997 - 1] & 0xFF) << 16) - ((this.aByteArray36[this.anInt2997 - 4] & 0xFF) << 8)));
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)J")
	public final long method2492(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local2 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray36[this.anInt2997++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)I")
	public final int method2493() {
		this.anInt2997 += 3;
		return ((this.aByteArray36[this.anInt2997 - 2] & 0xFF) << 8) + (((this.aByteArray36[this.anInt2997 - 3] & 0xFF) << 16) + (this.aByteArray36[this.anInt2997 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)V")
	public final void method2494(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BI)V")
	public final void method2495(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(BI)V")
	public final void method2496(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 + 128);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method2497() {
		@Pc(22) byte local22 = this.aByteArray36[this.anInt2997++];
		if (local22 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(35) int local35 = this.anInt2997;
		while (this.aByteArray36[this.anInt2997++] != 0) {
		}
		@Pc(58) int local58 = this.anInt2997 - local35 - 1;
		return local58 == 0 ? "" : Static412.method5293(this.aByteArray36, local58, local35);
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)I")
	public final int method2499() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method2506();
		while (local11 == 32767) {
			local11 = this.method2506();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)Z")
	public final boolean method2500() {
		this.anInt2997 -= 4;
		@Pc(17) int local17 = Static179.method2846(0, this.aByteArray36, this.anInt2997);
		@Pc(21) int local21 = this.method2529();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(Z)J")
	public final long method2501() {
		@Pc(10) long local10 = (long) this.method2529() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2529() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "(I)I")
	public final int method2502() {
		@Pc(16) int local16 = this.aByteArray36[this.anInt2997] & 0xFF;
		return local16 < 128 ? this.method2490() - 64 : this.method2536() + -49152;
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(B)I")
	public final int method2503() {
		this.anInt2997 += 2;
		@Pc(37) int local37 = (this.aByteArray36[this.anInt2997 - 2] & 0xFF) + ((this.aByteArray36[this.anInt2997 - 1] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(JB)V")
	public final void method2504(@OriginalArg(0) long arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 56);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 48);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 40);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 32);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(BI)V")
	public final void method2505(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(B)I")
	public final int method2506() {
		@Pc(17) int local17 = this.aByteArray36[this.anInt2997] & 0xFF;
		return local17 < 128 ? this.method2490() : this.method2536() - 32768;
	}

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "(I)B")
	public final byte method2507() {
		return (byte) -this.aByteArray36[this.anInt2997++];
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BII[B)V")
	public final void method2508(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray36[this.anInt2997++];
		}
	}

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "(B)I")
	public final int method2509() {
		this.anInt2997 += 2;
		@Pc(39) int local39 = (this.aByteArray36[this.anInt2997 - 1] - 128 & 0xFF) + ((this.aByteArray36[this.anInt2997 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "(I)I")
	public final int method2510() {
		this.anInt2997 += 4;
		return (this.aByteArray36[this.anInt2997 - 2] & 0xFF) + ((this.aByteArray36[this.anInt2997 - 4] & 0xFF) << 16) + ((this.aByteArray36[this.anInt2997 + -3] & 0xFF) << 24) + ((this.aByteArray36[this.anInt2997 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "(I)I")
	public final int method2511() {
		this.anInt2997 += 4;
		return (this.aByteArray36[this.anInt2997 - 4] & 0xFF) + ((this.aByteArray36[this.anInt2997 - 3] & 0xFF) << 8) + ((this.aByteArray36[this.anInt2997 + -1] & 0xFF) << 24) + ((this.aByteArray36[this.anInt2997 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "(B)I")
	public final int method2512() {
		this.anInt2997 += 2;
		@Pc(38) int local38 = ((this.aByteArray36[this.anInt2997 - 2] & 0xFF) << 8) + (this.aByteArray36[this.anInt2997 - 1] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)V")
	public final void method2513(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(II)V")
	public final void method2514(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2997 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2997 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2997 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "(B)I")
	public final int method2515() {
		this.anInt2997 += 2;
		return ((this.aByteArray36[this.anInt2997 - 1] & 0xFF) << 8) + (this.aByteArray36[this.anInt2997 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method2516() {
		if (this.aByteArray36[this.anInt2997] == 0) {
			this.anInt2997++;
			return null;
		} else {
			return this.method2537();
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(II)V")
	public final void method2517(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method2518(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt2997 += Static178.method2843(arg0, arg0.length(), this.anInt2997, this.aByteArray36);
		this.aByteArray36[this.anInt2997++] = 0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ[BI)V")
	public final void method2519(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			this.aByteArray36[this.anInt2997++] = arg0[local5];
		}
	}

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "(I)I")
	public final int method2520() {
		return this.aByteArray36[this.anInt2997++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(II)V")
	public final void method2521(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method2522(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2997;
		this.anInt2997 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2508(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2997 = 0;
		this.method2551(local31.length);
		this.method2519(local31, local31.length);
	}

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "(I)I")
	public final int method2523() {
		return -this.aByteArray36[this.anInt2997++] & 0xFF;
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(BI)V")
	public final void method2524(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(II)I")
	public final int method2525(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static179.method2846(arg0, this.aByteArray36, this.anInt2997);
		this.method2531(local16);
		return local16;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IJB)V")
	public final void method2526(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local6 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray36[this.anInt2997++] = (byte) (arg1 >> local24);
		}
	}

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "(B)I")
	public final int method2528() {
		@Pc(16) byte local16 = this.aByteArray36[this.anInt2997++];
		@Pc(23) int local23 = 0;
		while (local16 < 0) {
			local23 = (local23 | local16 & 0x7F) << 7;
			local16 = this.aByteArray36[this.anInt2997++];
		}
		return local23 | local16;
	}

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "(B)I")
	public final int method2529() {
		this.anInt2997 += 4;
		return ((this.aByteArray36[this.anInt2997 - 2] & 0xFF) << 8) + (this.aByteArray36[this.anInt2997 - 4] << 24 & 0xFF000000) + ((this.aByteArray36[this.anInt2997 + -3] & 0xFF) << 16) + (this.aByteArray36[this.anInt2997 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(IB)V")
	public final void method2531(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "(II)V")
	public final void method2532(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "(II)V")
	public final void method2533(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "(I)B")
	public final byte method2534() {
		return (byte) (128 - this.aByteArray36[this.anInt2997++]);
	}

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "(I)I")
	public final int method2535() {
		this.anInt2997 += 2;
		@Pc(39) int local39 = ((this.aByteArray36[this.anInt2997 - 1] & 0xFF) << 8) + (this.aByteArray36[this.anInt2997 - 2] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "(B)I")
	public final int method2536() {
		this.anInt2997 += 2;
		return (this.aByteArray36[this.anInt2997 - 1] & 0xFF) + ((this.aByteArray36[this.anInt2997 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "(B)Ljava/lang/String;")
	public final String method2537() {
		@Pc(6) int local6 = this.anInt2997;
		while (this.aByteArray36[this.anInt2997++] != 0) {
		}
		@Pc(31) int local31 = this.anInt2997 - local6 - 1;
		return local31 == 0 ? "" : Static412.method5293(this.aByteArray36, local31, local6);
	}

	@OriginalMember(owner = "client!iv", name = "q", descriptor = "(I)I")
	public final int method2538() {
		this.anInt2997 += 2;
		return (this.aByteArray36[this.anInt2997 - 2] & 0xFF) + ((this.aByteArray36[this.anInt2997 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([II)V")
	public final void method2540(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt2997 / 8;
		this.anInt2997 = 0;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(25) int local25 = this.method2529();
			@Pc(29) int local29 = this.method2529();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += arg0[local31 & 0x3] + local31 ^ local29 + (local29 << 4 ^ local29 >>> 5);
				local31 += -1640531527;
				local29 += arg0[local31 >>> 11 & 0xCB000003] + local31 ^ local25 + (local25 << 4 ^ local25 >>> 5);
			}
			this.anInt2997 -= 8;
			this.method2531(local25);
			this.method2531(local29);
		}
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(BI)V")
	public final void method2541(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(Z)B")
	public final byte method2542() {
		return this.aByteArray36[this.anInt2997++];
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(BI)V")
	public final void method2543(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2551(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2524(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(III[I)V")
	public final void method2544(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt2997;
		this.anInt2997 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(32) int local32 = this.method2529();
			@Pc(36) int local36 = this.method2529();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= (local32 >>> 5 ^ local32 << 4) + local32 ^ local38 + arg1[local38 >>> 11 & 0x4C600003];
				local38 -= -1640531527;
				local32 -= local36 + (local36 << 4 ^ local36 >>> 5) ^ arg1[local38 & 0x3] + local38;
			}
			this.anInt2997 -= 8;
			this.method2531(local32);
			this.method2531(local36);
		}
		this.anInt2997 = local8;
	}

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "(II)V")
	public final void method2545(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI)V")
	public final void method2546(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2551(arg0 >>> 28 | 0x80);
					}
					this.method2551(arg0 >>> 21 | 0x80);
				}
				this.method2551(arg0 >>> 14 | 0x80);
			}
			this.method2551(arg0 >>> 7 | 0x80);
		}
		this.method2551(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "(II)V")
	public final void method2547(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2997 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "(I)I")
	public final int method2548() {
		this.anInt2997 += 2;
		return ((this.aByteArray36[this.anInt2997 - 2] & 0xFF) << 8) + (this.aByteArray36[this.anInt2997 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "(I)B")
	public final byte method2549() {
		return (byte) (this.aByteArray36[this.anInt2997++] - 128);
	}

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "(II)V")
	public final void method2550(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt2997++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "(II)V")
	public final void method2551(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt2997++] = (byte) arg0;
	}
}
