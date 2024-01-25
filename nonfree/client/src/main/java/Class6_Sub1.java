import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "[J")
	public static final long[] aLongArray10 = new long[256];

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
	public int anInt7898;

	@OriginalMember(owner = "client!ae", name = "yb", descriptor = "[B")
	public byte[] aByteArray96;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray10[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1(@OriginalArg(0) int arg0) {
		this.anInt7898 = 0;
		this.aByteArray96 = Static272.method4102(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B)V")
	public Class6_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray96 = arg0;
		this.anInt7898 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)I")
	public final int method6428() {
		this.anInt7898 += 2;
		@Pc(32) int local32 = ((this.aByteArray96[this.anInt7898 - 2] & 0xFF) << 8) + (this.aByteArray96[this.anInt7898 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III[B)V")
	public final void method6429(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(19) int local19 = arg0 - 1; local19 >= 0; local19--) {
			arg1[local19] = this.aByteArray96[this.anInt7898++];
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Z")
	public final boolean method6430() {
		this.anInt7898 -= 4;
		@Pc(17) int local17 = Static96.method5039(0, this.anInt7898, this.aByteArray96);
		@Pc(21) int local21 = this.method6442();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)I")
	public final int method6431() {
		return -this.aByteArray96[this.anInt7898++] & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method6432(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt7898;
		this.anInt7898 = 0;
		@Pc(17) byte[] local17 = new byte[local6];
		this.method6434(local17, local6);
		@Pc(28) BigInteger local28 = new BigInteger(local17);
		@Pc(33) BigInteger local33 = local28.modPow(arg0, arg1);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt7898 = 0;
		this.method6439(local36.length);
		this.method6440(local36, local36.length);
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)I")
	public final int method6433() {
		return this.aByteArray96[this.anInt7898++] & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([BIII)V")
	public final void method6434(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = this.aByteArray96[this.anInt7898++];
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)I")
	public final int method6435() {
		this.anInt7898 += 3;
		return (this.aByteArray96[this.anInt7898 - 1] & 0xFF) + ((this.aByteArray96[this.anInt7898 - 3] & 0xFF) << 16) + ((this.aByteArray96[this.anInt7898 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
	public final void method6436(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public final void method6437(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)B")
	public final byte method6438() {
		return this.aByteArray96[this.anInt7898++];
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	public final void method6439(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "([BIII)V")
	public final void method6440(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			this.aByteArray96[this.anInt7898++] = arg0[local14];
		}
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)B")
	public final byte method6441() {
		return (byte) (this.aByteArray96[this.anInt7898++] - 128);
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)I")
	public final int method6442() {
		this.anInt7898 += 4;
		return ((this.aByteArray96[this.anInt7898 - 2] & 0xFF) << 8) + ((this.aByteArray96[this.anInt7898 - 3] & 0xFF) << 16) + ((this.aByteArray96[this.anInt7898 + -4] & 0xFF) << 24) + (this.aByteArray96[this.anInt7898 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V")
	public final void method6443(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt7898 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt7898 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(B)I")
	public final int method6445() {
		@Pc(11) int local11 = this.aByteArray96[this.anInt7898] & 0xFF;
		return local11 < 128 ? this.method6433() : this.method6485() - 32768;
	}

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)I")
	public final int method6446() {
		this.anInt7898 += 2;
		@Pc(31) int local31 = (this.aByteArray96[this.anInt7898 - 2] & 0xFF) + ((this.aByteArray96[this.anInt7898 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(B)I")
	public final int method6447() {
		this.anInt7898 += 2;
		return (this.aByteArray96[this.anInt7898 - 2] & 0xFF) + ((this.aByteArray96[this.anInt7898 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method6448(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr");
		}
		this.anInt7898 += Static363.method5361(this.aByteArray96, arg0.length(), this.anInt7898, arg0);
		this.aByteArray96[this.anInt7898++] = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI[II)V")
	public final void method6449(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt7898;
		this.anInt7898 = 5;
		@Pc(21) int local21 = (arg1 - 5) / 8;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(29) int local29 = this.method6442();
			@Pc(33) int local33 = this.method6442();
			@Pc(35) int local35 = -957401312;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local33 -= local35 + arg0[local35 >>> 11 & 0x3] ^ local29 + (local29 >>> 5 ^ local29 << 4);
				local35 -= -1640531527;
				local29 -= local35 + arg0[local35 & 0x3] ^ local33 + (local33 << 4 ^ local33 >>> 5);
			}
			this.anInt7898 -= 8;
			this.method6461(local29);
			this.method6461(local33);
		}
		this.anInt7898 = local8;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method6450() {
		if (this.aByteArray96[this.anInt7898] == 0) {
			this.anInt7898++;
			return null;
		} else {
			return this.method6473();
		}
	}

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "(I)I")
	public final int method6451() {
		this.anInt7898 += 2;
		@Pc(38) int local38 = (this.aByteArray96[this.anInt7898 - 2] - 128 & 0xFF) + ((this.aByteArray96[this.anInt7898 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V")
	public final void method6452(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method6439(arg0 >>> 28 | 0x80);
					}
					this.method6439(arg0 >>> 21 | 0x80);
				}
				this.method6439(arg0 >>> 14 | 0x80);
			}
			this.method6439(arg0 >>> 7 | 0x80);
		}
		this.method6439(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(II)V")
	public final void method6453(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([IB)V")
	public final void method6454(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt7898 / 8;
		this.anInt7898 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(21) int local21 = this.method6442();
			@Pc(25) int local25 = this.method6442();
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = 32;
			while (local31-- > 0) {
				local21 += local25 + (local25 << 4 ^ local25 >>> 5) ^ arg0[local27 & 0x3] + local27;
				local27 += -1640531527;
				local25 += local27 + arg0[local27 >>> 11 & 0xBAA00003] ^ (local21 >>> 5 ^ local21 << 4) + local21;
			}
			this.anInt7898 -= 8;
			this.method6461(local21);
			this.method6461(local25);
		}
	}

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "(I)I")
	public final int method6455() {
		this.anInt7898 += 2;
		return (this.aByteArray96[this.anInt7898 - 2] - 128 & 0xFF) + ((this.aByteArray96[this.anInt7898 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(II)V")
	public final void method6456(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(II)V")
	public final void method6457(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V")
	public final void method6458(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt7898 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)I")
	public final int method6459() {
		this.anInt7898 += 3;
		return (this.aByteArray96[this.anInt7898 - 1] & 0xFF) + ((this.aByteArray96[this.anInt7898 - 2] & 0xFF) << 16) + ((this.aByteArray96[this.anInt7898 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "(I)I")
	public final int method6460() {
		@Pc(16) byte local16 = this.aByteArray96[this.anInt7898++];
		@Pc(24) int local24 = 0;
		while (local16 < 0) {
			local24 = (local24 | local16 & 0x7F) << 7;
			local16 = this.aByteArray96[this.anInt7898++];
		}
		return local16 | local24;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(II)V")
	public final void method6461(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method6462() {
		@Pc(21) byte local21 = this.aByteArray96[this.anInt7898++];
		if (local21 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(31) int local31 = this.anInt7898;
		while (this.aByteArray96[this.anInt7898++] != 0) {
		}
		@Pc(54) int local54 = this.anInt7898 - local31 - 1;
		return local54 == 0 ? "" : Static55.method1238(local54, local31, this.aByteArray96);
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(II)V")
	public final void method6464(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 + 128);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(JII)V")
	public final void method6465(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local6 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> local24);
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)V")
	public final void method6466(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt7898 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt7898 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt7898 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt7898 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "(I)J")
	public final long method6467() {
		@Pc(10) long local10 = (long) this.method6442() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method6442() & 0xFFFFFFFFL;
		return local22 + (local10 << 32);
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(B)B")
	public final byte method6468() {
		return (byte) -this.aByteArray96[this.anInt7898++];
	}

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "(B)I")
	public final int method6469() {
		this.anInt7898 += 4;
		return ((this.aByteArray96[this.anInt7898 - 4] & 0xFF) << 16) + ((this.aByteArray96[this.anInt7898 - 3] & 0xFF) << 24) + ((this.aByteArray96[this.anInt7898 + -1] & 0xFF) << 8) + (this.aByteArray96[this.anInt7898 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "(II)V")
	public final void method6470(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "(B)I")
	public final int method6471() {
		@Pc(16) int local16 = this.aByteArray96[this.anInt7898] & 0xFF;
		return local16 < 128 ? this.method6433() - 64 : this.method6485() + -49152;
	}

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "(I)I")
	public final int method6472() {
		return 128 - this.aByteArray96[this.anInt7898++] & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(Z)Ljava/lang/String;")
	public final String method6473() {
		@Pc(6) int local6 = this.anInt7898;
		while (this.aByteArray96[this.anInt7898++] != 0) {
		}
		@Pc(30) int local30 = this.anInt7898 - local6 - 1;
		return local30 == 0 ? "" : Static55.method1238(local30, local6, this.aByteArray96);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)V")
	public final void method6474(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(JB)V")
	public final void method6475(@OriginalArg(0) long arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 56);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 48);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 40);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 32);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 24);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "(I)I")
	public final int method6477() {
		this.anInt7898 += 2;
		return (this.aByteArray96[this.anInt7898 - 1] - 128 & 0xFF) + ((this.aByteArray96[this.anInt7898 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "(B)I")
	public final int method6478() {
		this.anInt7898 += 4;
		return ((this.aByteArray96[this.anInt7898 - 4] & 0xFF) << 8) + ((this.aByteArray96[this.anInt7898 - 1] & 0xFF) << 16) + ((this.aByteArray96[this.anInt7898 + -2] & 0xFF) << 24) + (this.aByteArray96[this.anInt7898 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(IB)V")
	public final void method6479(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "(II)V")
	public final void method6480(@OriginalArg(0) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "(II)V")
	public final void method6481(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)J")
	public final long method6483(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 - 1;
		if (local14 < 0 || local14 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(32) int local32 = local14 * 8;
		@Pc(34) long local34 = 0L;
		while (local32 >= 0) {
			local34 |= ((long) this.aByteArray96[this.anInt7898++] & 0xFFL) << local32;
			local32 -= 8;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "(II)V")
	public final void method6484(@OriginalArg(1) int arg0) {
		this.aByteArray96[this.anInt7898++] = (byte) arg0;
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 8);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 16);
		this.aByteArray96[this.anInt7898++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "(B)I")
	public final int method6485() {
		this.anInt7898 += 2;
		return (this.aByteArray96[this.anInt7898 - 1] & 0xFF) + ((this.aByteArray96[this.anInt7898 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "(I)B")
	public final byte method6486() {
		return (byte) (128 - this.aByteArray96[this.anInt7898++]);
	}

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "(I)I")
	public final int method6487() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method6445(); local11 == 32767; local11 = this.method6445()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "(I)I")
	public final int method6488() {
		return this.aByteArray96[this.anInt7898++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "(II)I")
	public final int method6489(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static96.method5039(arg0, this.anInt7898, this.aByteArray96);
		this.method6461(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "(II)V")
	public final void method6490(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method6439(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method6453(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "(I)I")
	public final int method6491() {
		this.anInt7898 += 4;
		return ((this.aByteArray96[this.anInt7898 - 1] & 0xFF) << 24) + (this.aByteArray96[this.anInt7898 - 2] << 16 & 0xFF0000) + ((this.aByteArray96[this.anInt7898 + -3] & 0xFF) << 8) + (this.aByteArray96[this.anInt7898 + -4] & 0xFF);
	}
}
