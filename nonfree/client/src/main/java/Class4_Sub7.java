import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
	public int anInt2667 = 0;

	@OriginalMember(owner = "client!tq", name = "bb", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
	public Class4_Sub7(@OriginalArg(0) int arg0) {
		this.aByteArray42 = Static54.method997(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "([B)V")
	public Class4_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray42 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)I")
	public final int method2359() {
		@Pc(16) byte local16 = this.aByteArray42[this.anInt2667++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray42[this.anInt2667++];
		}
		return local16 | local18;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I")
	public final int method2360(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static352.method5475(this.anInt2667, this.aByteArray42, arg0);
		this.method2387(local11);
		return local11;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)I")
	public final int method2361() {
		return 128 - this.aByteArray42[this.anInt2667++] & 0xFF;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V")
	public final void method2362(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)Z")
	public final boolean method2363() {
		this.anInt2667 -= 4;
		@Pc(17) int local17 = Static352.method5475(this.anInt2667, this.aByteArray42, 0);
		@Pc(21) int local21 = this.method2389();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)I")
	public final int method2364() {
		this.anInt2667 += 2;
		return ((this.aByteArray42[this.anInt2667 - 2] & 0xFF) << 8) + (this.aByteArray42[this.anInt2667 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)B")
	public final byte method2365() {
		return (byte) (this.aByteArray42[this.anInt2667++] - 128);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IJI)V")
	public final void method2366(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(7) int local7 = arg0 - 1;
		if (local7 < 0 || local7 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local7 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray42[this.anInt2667++] = (byte) (arg1 >> local29);
		}
	}

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)B")
	public final byte method2367() {
		return (byte) -this.aByteArray42[this.anInt2667++];
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B[III)V")
	public final void method2368(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt2667;
		this.anInt2667 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(31) int local31 = this.method2389();
			@Pc(35) int local35 = this.method2389();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= local31 + (local31 >>> 5 ^ local31 << 4) ^ arg0[local37 >>> 11 & 0x3] + local37;
				local37 -= -1640531527;
				local31 -= local37 + arg0[local37 & 0x3] ^ local35 + (local35 << 4 ^ local35 >>> 5);
			}
			this.anInt2667 -= 8;
			this.method2387(local31);
			this.method2387(local35);
		}
		this.anInt2667 = local8;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2369(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2667;
		this.anInt2667 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2381(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2667 = 0;
		this.method2416(local31.length);
		this.method2398(local31.length, local31);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)I")
	public final int method2370() {
		@Pc(18) int local18 = this.aByteArray42[this.anInt2667] & 0xFF;
		return local18 >= 128 ? this.method2404() - 49152 : this.method2380() - 64;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(II)V")
	public final void method2371(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
	public final int method2372() {
		this.anInt2667 += 4;
		return (this.aByteArray42[this.anInt2667 - 3] & 0xFF) + ((this.aByteArray42[this.anInt2667 - 1] & 0xFF) << 16) + ((this.aByteArray42[-2 + this.anInt2667] & 0xFF) << 24) + ((this.aByteArray42[this.anInt2667 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method2373(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr");
		}
		this.anInt2667 += Static108.method2008(this.anInt2667, this.aByteArray42, arg0, arg0.length());
		this.aByteArray42[this.anInt2667++] = 0;
	}

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "(I)I")
	public final int method2374() {
		return -this.aByteArray42[this.anInt2667++] & 0xFF;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(II)V")
	public final void method2375(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(II)V")
	public final void method2376(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)I")
	public final int method2377() {
		this.anInt2667 += 4;
		return ((this.aByteArray42[this.anInt2667 - 4] & 0xFF) << 16) + ((this.aByteArray42[this.anInt2667 - 3] & 0xFF) << 24) + ((this.aByteArray42[this.anInt2667 + -1] & 0xFF) << 8) + (this.aByteArray42[this.anInt2667 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "(I)I")
	public final int method2378() {
		this.anInt2667 += 4;
		return ((this.aByteArray42[this.anInt2667 - 1] & 0xFF) << 24) + (((this.aByteArray42[this.anInt2667 - 2] & 0xFF) << 16) + ((this.aByteArray42[this.anInt2667 - 3] & 0xFF) << 8) + (this.aByteArray42[this.anInt2667 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method2379() {
		@Pc(11) int local11 = this.anInt2667;
		while (this.aByteArray42[this.anInt2667++] != 0) {
		}
		@Pc(30) int local30 = this.anInt2667 - local11 - 1;
		return local30 == 0 ? "" : Static257.method4397(local30, local11, this.aByteArray42);
	}

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "(I)I")
	public final int method2380() {
		return this.aByteArray42[this.anInt2667++] & 0xFF;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([BBII)V")
	public final void method2381(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray42[this.anInt2667++];
		}
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(II)V")
	public final void method2382(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method2383() {
		if (this.aByteArray42[this.anInt2667] == 0) {
			this.anInt2667++;
			return null;
		} else {
			return this.method2379();
		}
	}

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(II)V")
	public final void method2384(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(JB)V")
	public final void method2385(@OriginalArg(0) long arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 56);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 48);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 40);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 32);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(B)I")
	public final int method2386() {
		this.anInt2667 += 2;
		return (this.aByteArray42[this.anInt2667 - 2] - 128 & 0xFF) + ((this.aByteArray42[this.anInt2667 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "(II)V")
	public final void method2387(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)J")
	public final long method2388(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local6 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray42[this.anInt2667++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "(I)I")
	public final int method2389() {
		this.anInt2667 += 4;
		return (this.aByteArray42[this.anInt2667 - 1] & 0xFF) + ((this.aByteArray42[this.anInt2667 - 3] & 0xFF) << 16) + ((this.aByteArray42[this.anInt2667 + -4] & 0xFF) << 24) + ((this.aByteArray42[this.anInt2667 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "(II)V")
	public final void method2390(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 + 128);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method2391() {
		@Pc(14) byte local14 = this.aByteArray42[this.anInt2667++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt2667;
		while (this.aByteArray42[this.anInt2667++] != 0) {
		}
		@Pc(52) int local52 = this.anInt2667 - local32 - 1;
		return local52 == 0 ? "" : Static257.method4397(local52, local32, this.aByteArray42);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)V")
	public final void method2392(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt2667 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(B)B")
	public final byte method2393() {
		return this.aByteArray42[this.anInt2667++];
	}

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "(I)I")
	public final int method2394() {
		this.anInt2667 += 2;
		return (this.aByteArray42[this.anInt2667 - 2] & 0xFF) + ((this.aByteArray42[this.anInt2667 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "(I)I")
	public final int method2395() {
		this.anInt2667 += 3;
		return (this.aByteArray42[this.anInt2667 - 2] & 0xFF) + ((this.aByteArray42[this.anInt2667 - 1] & 0xFF) << 8) + ((this.aByteArray42[this.anInt2667 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(B)I")
	public final int method2396() {
		this.anInt2667 += 2;
		@Pc(40) int local40 = ((this.aByteArray42[this.anInt2667 - 2] & 0xFF) << 8) + (this.aByteArray42[this.anInt2667 - 1] & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III[B)V")
	public final void method2398(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray42[this.anInt2667++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "(B)I")
	public final int method2399() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16;
		for (local16 = this.method2413(); local16 == 32767; local16 = this.method2413()) {
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(BI)V")
	public final void method2400(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(IB)V")
	public final void method2401(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "(I)I")
	public final int method2402() {
		this.anInt2667 += 3;
		return ((this.aByteArray42[this.anInt2667 - 3] & 0xFF) << 16) + ((this.aByteArray42[this.anInt2667 - 2] & 0xFF) << 8) + (this.aByteArray42[this.anInt2667 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB[BI)V")
	public final void method2403(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = (byte) (this.aByteArray42[this.anInt2667++] - 128);
		}
	}

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "(I)I")
	public final int method2404() {
		this.anInt2667 += 2;
		return ((this.aByteArray42[this.anInt2667 - 2] & 0xFF) << 8) + (this.aByteArray42[this.anInt2667 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "(I)B")
	public final byte method2405() {
		return (byte) (128 - this.aByteArray42[this.anInt2667++]);
	}

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "(II)V")
	public final void method2406(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "(II)V")
	public final void method2407(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2416(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2376(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(IB)V")
	public final void method2408(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "(I)J")
	public final long method2409() {
		@Pc(15) long local15 = (long) this.method2389() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2389() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
	public final void method2410(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2416(arg0 >>> 28 | 0x80);
					}
					this.method2416(arg0 >>> 21 | 0x80);
				}
				this.method2416(arg0 >>> 14 | 0x80);
			}
			this.method2416(arg0 >>> 7 | 0x80);
		}
		this.method2416(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "(I)I")
	public final int method2411() {
		this.anInt2667 += 2;
		@Pc(33) int local33 = (this.aByteArray42[this.anInt2667 - 1] - 128 & 0xFF) + ((this.aByteArray42[this.anInt2667 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(BI)V")
	public final void method2412(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "(I)I")
	public final int method2413() {
		@Pc(11) int local11 = this.aByteArray42[this.anInt2667] & 0xFF;
		return local11 < 128 ? this.method2380() : this.method2404() - 32768;
	}

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "(I)I")
	public final int method2415() {
		this.anInt2667 += 2;
		@Pc(36) int local36 = ((this.aByteArray42[this.anInt2667 - 1] & 0xFF) << 8) + (this.aByteArray42[this.anInt2667 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "(II)V")
	public final void method2416(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "(I)I")
	public final int method2417() {
		return this.aByteArray42[this.anInt2667++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "(II)V")
	public final void method2418(@OriginalArg(1) int arg0) {
		this.aByteArray42[this.anInt2667++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([IZ)V")
	public final void method2419(@OriginalArg(0) int[] arg0) {
		@Pc(16) int local16 = this.anInt2667 / 8;
		this.anInt2667 = 0;
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			@Pc(27) int local27 = this.method2389();
			@Pc(31) int local31 = this.method2389();
			@Pc(33) int local33 = 0;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local27 += local33 + arg0[local33 & 0x3] ^ (local31 << 4 ^ local31 >>> 5) + local31;
				local33 += -1640531527;
				local31 += local27 + (local27 >>> 5 ^ local27 << 4) ^ local33 + arg0[local33 >>> 11 & 0x3];
			}
			this.anInt2667 -= 8;
			this.method2387(local27);
			this.method2387(local31);
		}
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(IB)V")
	public final void method2421(@OriginalArg(0) int arg0) {
		this.aByteArray42[this.anInt2667 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray42[this.anInt2667 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray42[this.anInt2667 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray42[this.anInt2667 - arg0 - 1] = (byte) arg0;
	}
}
