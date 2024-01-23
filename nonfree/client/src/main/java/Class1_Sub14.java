import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
	public int anInt3000;

	@OriginalMember(owner = "client!qm", name = "Bb", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14(@OriginalArg(0) int arg0) {
		this.anInt3000 = 0;
		this.aByteArray55 = Static46.method924(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "([B)V")
	public Class1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray55 = arg0;
		this.anInt3000 = 0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB[II)V")
	public final void method2186(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(4) int local4 = this.anInt3000;
		this.anInt3000 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.method2194();
			@Pc(31) int local31 = this.method2194();
			@Pc(35) int local35 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= local27 + (local27 << 4 ^ local27 >>> 5) ^ arg1[local35 >>> 11 & 0x3] + local35;
				local35 -= -1640531527;
				local27 -= arg1[local35 & 0x3] + local35 ^ (local31 << 4 ^ local31 >>> 5) + local31;
			}
			this.anInt3000 -= 8;
			this.method2236(local27);
			this.method2236(local31);
		}
		this.anInt3000 = local4;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)I")
	public final int method2187() {
		@Pc(11) int local11 = this.aByteArray55[this.anInt3000] & 0xFF;
		return local11 >= 128 ? this.method2244() - 32768 : this.method2199();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method2188(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt3000 += Static141.method4425(this.aByteArray55, arg0, arg0.length(), this.anInt3000);
		this.aByteArray55[this.anInt3000++] = 0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)I")
	public final int method2190() {
		@Pc(23) byte local23 = this.aByteArray55[this.anInt3000++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local23 & 0x7F | local25) << 7;
			local23 = this.aByteArray55[this.anInt3000++];
		}
		return local25 | local23;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
	public final void method2191(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZF)V")
	public final void method2192(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray55[this.anInt3000++] = (byte) (local6 >> 24);
		this.aByteArray55[this.anInt3000++] = (byte) (local6 >> 16);
		this.aByteArray55[this.anInt3000++] = (byte) (local6 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) local6;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IJ)V")
	public final void method2193(@OriginalArg(1) long arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 56);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 48);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 40);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 32);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)I")
	public final int method2194() {
		this.anInt3000 += 4;
		return (this.aByteArray55[this.anInt3000 - 1] & 0xFF) + ((this.aByteArray55[this.anInt3000 - 4] & 0xFF) << 24) + ((this.aByteArray55[this.anInt3000 - 3] & 0xFF) << 16) + ((this.aByteArray55[this.anInt3000 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(B)I")
	public final int method2195() {
		@Pc(11) int local11 = this.aByteArray55[this.anInt3000] & 0xFF;
		return local11 >= 128 ? this.method2244() - 49152 : this.method2199() + -64;
	}

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method2196() {
		if (this.aByteArray55[this.anInt3000] == 0) {
			this.anInt3000++;
			return null;
		} else {
			return this.method2237();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBI[B)V")
	public final void method2197(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = (byte) (this.aByteArray55[this.anInt3000++] - 128);
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V")
	public final void method2198(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 + 128);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "(B)I")
	public final int method2199() {
		return this.aByteArray55[this.anInt3000++] & 0xFF;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)V")
	public final void method2200(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III[B)V")
	public final void method2201(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray55[this.anInt3000++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
	public final int method2202() {
		this.anInt3000 += 3;
		return (this.aByteArray55[this.anInt3000 - 3] & 0xFF) + ((this.aByteArray55[this.anInt3000 - 1] & 0xFF) << 16) + ((this.aByteArray55[this.anInt3000 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)I")
	public final int method2203() {
		this.anInt3000 += 4;
		return (this.aByteArray55[this.anInt3000 - 2] & 0xFF) + ((this.aByteArray55[this.anInt3000 - 1] & 0xFF) << 8) + ((this.aByteArray55[this.anInt3000 - 3] & 0xFF) << 24) + ((this.aByteArray55[this.anInt3000 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I")
	public final int method2204(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = Static62.method1109(arg0, this.aByteArray55, this.anInt3000);
		this.method2236(local12);
		return local12;
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(II)V")
	public final void method2205(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(II)V")
	public final void method2206(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(IB)V")
	public final void method2207(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(II)V")
	public final void method2208(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([BIII)V")
	public final void method2209(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = this.aByteArray55[this.anInt3000++];
		}
	}

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "(II)V")
	public final void method2210(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z[I)V")
	public final void method2211(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt3000 / 8;
		this.anInt3000 = 0;
		for (@Pc(22) int local22 = 0; local22 < local10; local22++) {
			@Pc(29) int local29 = this.method2194();
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 32;
			@Pc(39) int local39 = this.method2194();
			while (local33-- > 0) {
				local29 += (local39 >>> 5 ^ local39 << 4) + local39 ^ arg0[local31 & 0x3] + local31;
				local31 += -1640531527;
				local39 += arg0[local31 >>> 11 & 0xBF200003] + local31 ^ (local29 << 4 ^ local29 >>> 5) + local29;
			}
			this.anInt3000 -= 8;
			this.method2236(local29);
			this.method2236(local39);
		}
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)B")
	public final byte method2212() {
		return this.aByteArray55[this.anInt3000++];
	}

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "(B)J")
	public final long method2213() {
		@Pc(6) long local6 = (long) this.method2194() & 0xFFFFFFFFL;
		@Pc(21) long local21 = (long) this.method2194() & 0xFFFFFFFFL;
		return (local6 << 32) + local21;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)I")
	public final int method2215() {
		this.anInt3000 += 3;
		return ((this.aByteArray55[this.anInt3000 - 3] & 0xFF) << 16) + ((this.aByteArray55[this.anInt3000 - 2] & 0xFF) << 8) + (this.aByteArray55[this.anInt3000 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "(B)I")
	public final int method2216() {
		this.anInt3000 += 2;
		@Pc(31) int local31 = ((this.aByteArray55[this.anInt3000 - 1] & 0xFF) << 8) + (this.aByteArray55[this.anInt3000 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(FB)V")
	public final void method2217(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray55[this.anInt3000++] = (byte) local6;
		this.aByteArray55[this.anInt3000++] = (byte) (local6 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) (local6 >> 16);
		this.aByteArray55[this.anInt3000++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "(II)V")
	public final void method2218(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)B")
	public final byte method2219() {
		return (byte) (128 - this.aByteArray55[this.anInt3000++]);
	}

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "(II)V")
	public final void method2220(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "(I)I")
	public final int method2221() {
		@Pc(3) int local3 = 0;
		@Pc(11) int local11 = this.method2187();
		while (local11 == 32767) {
			local11 = this.method2187();
			local3 += 32767;
		}
		return local3 + local11;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)J")
	public final long method2222(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local6 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray55[this.anInt3000++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "(II)V")
	public final void method2223(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3000 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3000 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3000 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3000 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(JBI)V")
	public final void method2224(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local6 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> local26);
		}
	}

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "(II)V")
	public final void method2225(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2191(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2208(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "(B)Ljava/lang/String;")
	public final String method2226() {
		@Pc(14) byte local14 = this.aByteArray55[this.anInt3000++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(30) int local30 = this.anInt3000;
		while (this.aByteArray55[this.anInt3000++] != 0) {
		}
		return Static166.method2722(local30, this.aByteArray55, this.anInt3000 - local30 - 1);
	}

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)I")
	public final int method2227() {
		return 128 - this.aByteArray55[this.anInt3000++] & 0xFF;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(BI)V")
	public final void method2228(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "(I)I")
	public final int method2229() {
		return this.aByteArray55[this.anInt3000++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method2231(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt3000;
		this.anInt3000 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method2232(local2, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt3000 = 0;
		this.method2191(local31.length);
		this.method2201(local31.length, local31);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(III[B)V")
	public final void method2232(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = this.aByteArray55[this.anInt3000++];
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
	public final void method2233(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(IB)V")
	public final void method2234(@OriginalArg(0) int arg0) {
		if ((-128 & arg0) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2191(arg0 >>> 28 | 0x80);
					}
					this.method2191(arg0 >>> 21 | 0x80);
				}
				this.method2191(arg0 >>> 14 | 0x80);
			}
			this.method2191(arg0 >>> 7 | 0x80);
		}
		this.method2191(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "(I)Z")
	public final boolean method2235() {
		this.anInt3000 -= 4;
		@Pc(27) int local27 = Static62.method1109(0, this.aByteArray55, this.anInt3000);
		@Pc(31) int local31 = this.method2194();
		return local27 == local31;
	}

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "(II)V")
	public final void method2236(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 24);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "(B)Ljava/lang/String;")
	public final String method2237() {
		@Pc(6) int local6 = this.anInt3000;
		while (this.aByteArray55[this.anInt3000++] != 0) {
		}
		return Static166.method2722(local6, this.aByteArray55, this.anInt3000 - local6 - 1);
	}

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "(I)I")
	public final int method2238() {
		this.anInt3000 += 2;
		return (this.aByteArray55[this.anInt3000 - 2] & 0xFF) + ((this.aByteArray55[this.anInt3000 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "(I)B")
	public final byte method2239() {
		return (byte) -this.aByteArray55[this.anInt3000++];
	}

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "(II)V")
	public final void method2240(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "(B)I")
	public final int method2241() {
		return -this.aByteArray55[this.anInt3000++] & 0xFF;
	}

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "(B)I")
	public final int method2242() {
		this.anInt3000 += 2;
		return (this.aByteArray55[this.anInt3000 - 2] - 128 & 0xFF) + ((this.aByteArray55[this.anInt3000 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "(I)I")
	public final int method2243() {
		this.anInt3000 += 2;
		return ((this.aByteArray55[this.anInt3000 - 2] & 0xFF) << 8) + (this.aByteArray55[this.anInt3000 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)I")
	public final int method2244() {
		this.anInt3000 += 2;
		return (this.aByteArray55[this.anInt3000 - 1] & 0xFF) + ((this.aByteArray55[this.anInt3000 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "(I)I")
	public final int method2245() {
		this.anInt3000 += 4;
		return (this.aByteArray55[this.anInt3000 - 4] & 0xFF) + ((this.aByteArray55[this.anInt3000 - 1] & 0xFF) << 24) + ((this.aByteArray55[this.anInt3000 + -2] & 0xFF) << 16) + ((this.aByteArray55[this.anInt3000 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(ZI)V")
	public final void method2246(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "(B)I")
	public final int method2247() {
		this.anInt3000 += 2;
		@Pc(40) int local40 = (this.aByteArray55[this.anInt3000 - 1] - 128 & 0xFF) + ((this.aByteArray55[this.anInt3000 - 2] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "(I)I")
	public final int method2248() {
		this.anInt3000 += 2;
		@Pc(32) int local32 = ((this.aByteArray55[this.anInt3000 - 2] & 0xFF) << 8) + (this.aByteArray55[this.anInt3000 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "(I)I")
	public final int method2249() {
		this.anInt3000 += 4;
		return (this.aByteArray55[this.anInt3000 - 3] & 0xFF) + ((this.aByteArray55[this.anInt3000 - 2] & 0xFF) << 24) + ((this.aByteArray55[this.anInt3000 - 1] & 0xFF) << 16) + ((this.aByteArray55[this.anInt3000 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "(II)V")
	public final void method2250(@OriginalArg(1) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) arg0;
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 8);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 16);
		this.aByteArray55[this.anInt3000++] = (byte) (arg0 >> 24);
	}
}
