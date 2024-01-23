import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!aj", name = "jb", descriptor = "I")
	public int anInt2955 = 0;

	@OriginalMember(owner = "client!aj", name = "U", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
	public Class8_Sub2(@OriginalArg(0) int arg0) {
		this.aByteArray24 = Static39.method612(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "([B)V")
	public Class8_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray24 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)I")
	public final int method2320() {
		@Pc(9) int local9 = this.method2382();
		@Pc(11) int local11 = 0;
		while (local9 == 32767) {
			local9 = this.method2382();
			local11 += 32767;
		}
		return local11 + local9;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public final void method2321(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)I")
	public final int method2322() {
		return this.aByteArray24[this.anInt2955++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(Z)I")
	public final int method2323() {
		this.anInt2955 += 3;
		return (this.aByteArray24[this.anInt2955 - 1] & 0xFF) + ((this.aByteArray24[this.anInt2955 - 2] & 0xFF) << 8) + ((this.aByteArray24[this.anInt2955 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IF)V")
	public final void method2324(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Float.floatToRawIntBits(arg0);
		this.aByteArray24[this.anInt2955++] = (byte) local11;
		this.aByteArray24[this.anInt2955++] = (byte) (local11 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) (local11 >> 16);
		this.aByteArray24[this.anInt2955++] = (byte) (local11 >> 24);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)I")
	public final int method2325() {
		@Pc(11) int local11 = this.aByteArray24[this.anInt2955] & 0xFF;
		return local11 < 128 ? this.method2334() - 64 : this.method2375() + -49152;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
	public final void method2326(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(Z)I")
	public final int method2327() {
		this.anInt2955 += 3;
		return ((this.aByteArray24[this.anInt2955 - 2] & 0xFF) << 8) + ((this.aByteArray24[this.anInt2955 - 1] & 0xFF) << 16) + (this.aByteArray24[this.anInt2955 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V")
	public final void method2328(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2340(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2333(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(II)V")
	public final void method2329(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(II)V")
	public final void method2330(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method2331(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt2955 += Static275.method4082(this.anInt2955, this.aByteArray24, arg0.length(), arg0);
		this.aByteArray24[this.anInt2955++] = 0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)V")
	public final void method2332(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "(II)V")
	public final void method2333(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)I")
	public final int method2334() {
		return this.aByteArray24[this.anInt2955++] & 0xFF;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
	public final void method2335(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2955 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2955 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2955 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2955 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(IB)V")
	public final void method2336(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)B")
	public final byte method2337() {
		return (byte) (this.aByteArray24[this.anInt2955++] - 128);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)I")
	public final int method2338() {
		return 128 - this.aByteArray24[this.anInt2955++] & 0xFF;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([BIBI)V")
	public final void method2339(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = this.aByteArray24[this.anInt2955++];
		}
	}

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "(II)V")
	public final void method2340(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "(II)J")
	public final long method2341(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(23) int local23 = local2 * 8;
		@Pc(26) long local26 = (long) 0;
		while (local23 >= 0) {
			local26 |= ((long) this.aByteArray24[this.anInt2955++] & 0xFFL) << local23;
			local23 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(Z)Z")
	public final boolean method2342() {
		this.anInt2955 -= 4;
		@Pc(17) int local17 = Static235.method3584(this.aByteArray24, 0, this.anInt2955);
		@Pc(21) int local21 = this.method2352();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method2343(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2955;
		this.anInt2955 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2339(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt2955 = 0;
		this.method2340(local31.length);
		this.method2380(local31.length, local31);
	}

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "(II)V")
	public final void method2345(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(IB)I")
	public final int method2346(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = Static235.method3584(this.aByteArray24, arg0, this.anInt2955);
		this.method2330(local13);
		return local13;
	}

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "(B)J")
	public final long method2347() {
		@Pc(6) long local6 = (long) this.method2352() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method2352() & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)I")
	public final int method2348() {
		this.anInt2955 += 2;
		return (this.aByteArray24[this.anInt2955 - 2] & 0xFF) + ((this.aByteArray24[this.anInt2955 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)I")
	public final int method2349() {
		return -this.aByteArray24[this.anInt2955++] & 0xFF;
	}

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "(B)I")
	public final int method2350() {
		this.anInt2955 += 2;
		@Pc(38) int local38 = ((this.aByteArray24[this.anInt2955 - 1] & 0xFF) << 8) + (this.aByteArray24[this.anInt2955 - 2] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)B")
	public final byte method2351() {
		return (byte) (128 - this.aByteArray24[this.anInt2955++]);
	}

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "(Z)I")
	public final int method2352() {
		this.anInt2955 += 4;
		return ((this.aByteArray24[this.anInt2955 - 4] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2955 - 3] & 0xFF) << 16) + ((this.aByteArray24[this.anInt2955 + -2] & 0xFF) << 8) + (this.aByteArray24[this.anInt2955 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)I")
	public final int method2353() {
		@Pc(12) byte local12 = this.aByteArray24[this.anInt2955++];
		@Pc(18) int local18 = 0;
		while (local12 < 0) {
			local18 = (local12 & 0x7F | local18) << 7;
			local12 = this.aByteArray24[this.anInt2955++];
		}
		return local12 | local18;
	}

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)I")
	public final int method2354() {
		this.anInt2955 += 2;
		@Pc(38) int local38 = (this.aByteArray24[this.anInt2955 - 2] - 128 & 0xFF) + ((this.aByteArray24[this.anInt2955 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)V")
	public final void method2356(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)I")
	public final int method2358() {
		this.anInt2955 += 2;
		return ((this.aByteArray24[this.anInt2955 - 2] & 0xFF) << 8) + (this.aByteArray24[this.anInt2955 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBJ)V")
	public final void method2359(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(30) int local30 = local2 * 8; local30 >= 0; local30 -= 8) {
			this.aByteArray24[this.anInt2955++] = (byte) (arg1 >> local30);
		}
	}

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "(B)I")
	public final int method2360() {
		this.anInt2955 += 2;
		@Pc(31) int local31 = ((this.aByteArray24[this.anInt2955 - 2] & 0xFF) << 8) + (this.aByteArray24[this.anInt2955 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(ZI)V")
	public final void method2361(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(JZ)V")
	public final void method2362(@OriginalArg(0) long arg0) {
		this.method2326((int) (arg0 >> 32));
		this.method2326((int) arg0);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(BI)V")
	public final void method2363(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 + 128);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "(B)Ljava/lang/String;")
	public final String method2364() {
		@Pc(14) byte local14 = this.aByteArray24[this.anInt2955++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(34) int local34 = this.anInt2955;
		while (this.aByteArray24[this.anInt2955++] != 0) {
		}
		return Static144.method2277(this.aByteArray24, local34, this.anInt2955 - local34 - 1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([II)V")
	public final void method2365(@OriginalArg(0) int[] arg0) {
		@Pc(11) int local11 = this.anInt2955 / 8;
		this.anInt2955 = 0;
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			@Pc(29) int local29 = 0;
			@Pc(33) int local33 = this.method2352();
			@Pc(39) int local39 = this.method2352();
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local33 += (local39 << 4 ^ local39 >>> 5) + local39 ^ local29 + arg0[local29 & 0x3];
				local29 += -1640531527;
				local39 += arg0[local29 >>> 11 & 0x3] + local29 ^ (local33 << 4 ^ local33 >>> 5) + local33;
			}
			this.anInt2955 -= 8;
			this.method2330(local33);
			this.method2330(local39);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V")
	public final void method2366(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZ[B)V")
	public final void method2367(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(14) int local14 = arg0 - 1; local14 >= 0; local14--) {
			arg1[local14] = this.aByteArray24[this.anInt2955++];
		}
	}

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "(II)V")
	public final void method2368(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "(B)Ljava/lang/String;")
	public final String method2369() {
		if (this.aByteArray24[this.anInt2955] == 0) {
			this.anInt2955++;
			return null;
		} else {
			return this.method2372();
		}
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(IB)V")
	public final void method2370(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((-16384 & arg0) != 0) {
				if ((arg0 & -2097152) != 0) {
					if ((-268435456 & arg0) != 0) {
						this.method2340(arg0 >>> 28 | 0x80);
					}
					this.method2340(arg0 >>> 21 | 0x80);
				}
				this.method2340(arg0 >>> 14 | 0x80);
			}
			this.method2340(arg0 >>> 7 | 0x80);
		}
		this.method2340(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(IB)V")
	public final void method2371(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method2372() {
		@Pc(2) int local2 = this.anInt2955;
		while (this.aByteArray24[this.anInt2955++] != 0) {
		}
		return Static144.method2277(this.aByteArray24, local2, this.anInt2955 - local2 - 1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[IIB)V")
	public final void method2373(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(10) int local10 = (arg0 - 5) / 8;
		@Pc(13) int local13 = this.anInt2955;
		this.anInt2955 = 5;
		for (@Pc(22) int local22 = 0; local22 < local10; local22++) {
			@Pc(29) int local29 = this.method2352();
			@Pc(35) int local35 = this.method2352();
			@Pc(37) int local37 = -957401312;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local35 -= local29 + (local29 << 4 ^ local29 >>> 5) ^ local37 - -arg1[local37 >>> 11 & 0x8D200003];
				local37 -= -1640531527;
				local29 -= local35 + (local35 << 4 ^ local35 >>> 5) ^ arg1[local37 & 0x3] + local37;
			}
			this.anInt2955 -= 8;
			this.method2330(local29);
			this.method2330(local35);
		}
		this.anInt2955 = local13;
	}

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "(I)B")
	public final byte method2374() {
		return this.aByteArray24[this.anInt2955++];
	}

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "(I)I")
	public final int method2375() {
		this.anInt2955 += 2;
		return ((this.aByteArray24[this.anInt2955 - 2] & 0xFF) << 8) + (this.aByteArray24[this.anInt2955 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "(I)I")
	public final int method2376() {
		this.anInt2955 += 4;
		return (this.aByteArray24[this.anInt2955 - 3] & 0xFF) + (((this.aByteArray24[this.anInt2955 - 2] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2955 - 1] & 0xFF) << 16) + ((this.aByteArray24[this.anInt2955 - 4] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "(B)I")
	public final int method2377() {
		this.anInt2955 += 2;
		return (this.aByteArray24[this.anInt2955 - 2] - 128 & 0xFF) + ((this.aByteArray24[this.anInt2955 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(JZ)V")
	public final void method2378(@OriginalArg(0) long arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 56);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 48);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 40);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 32);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 24);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 16);
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "(B)I")
	public final int method2379() {
		this.anInt2955 += 4;
		return (this.aByteArray24[this.anInt2955 - 2] & 0xFF) + ((this.aByteArray24[this.anInt2955 - 1] & 0xFF) << 8) + ((this.aByteArray24[this.anInt2955 + -3] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2955 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[BII)V")
	public final void method2380(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray24[this.anInt2955++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "(Z)I")
	public final int method2381() {
		this.anInt2955 += 4;
		return ((this.aByteArray24[this.anInt2955 - 3] & 0xFF) << 8) + ((this.aByteArray24[this.anInt2955 - 1] & 0xFF) << 24) + ((this.aByteArray24[this.anInt2955 - 2] & 0xFF) << 16) + (this.aByteArray24[this.anInt2955 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "(I)I")
	public final int method2382() {
		@Pc(14) int local14 = this.aByteArray24[this.anInt2955] & 0xFF;
		return local14 < 128 ? this.method2334() : this.method2375() - 32768;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(FB)V")
	public final void method2383(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = Float.floatToRawIntBits(arg0);
		this.aByteArray24[this.anInt2955++] = (byte) (local10 >> 24);
		this.aByteArray24[this.anInt2955++] = (byte) (local10 >> 16);
		this.aByteArray24[this.anInt2955++] = (byte) (local10 >> 8);
		this.aByteArray24[this.anInt2955++] = (byte) local10;
	}

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "(II)V")
	public final void method2384(@OriginalArg(0) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) -arg0;
	}
}
