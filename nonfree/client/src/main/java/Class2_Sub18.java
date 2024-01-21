import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
	public int anInt3423;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
	public Class2_Sub18(@OriginalArg(0) int arg0) {
		this.aByteArray39 = Static42.method814(arg0);
		this.anInt3423 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([B)V")
	public Class2_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray39 = arg0;
		this.anInt3423 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z[BII)V")
	public final void method2340(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray39[this.anInt3423++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)I")
	public final int method2341() {
		this.anInt3423 += 3;
		return (this.aByteArray39[this.anInt3423 - 1] & 0xFF) + ((this.aByteArray39[this.anInt3423 - 2] & 0xFF) << 8) + ((this.aByteArray39[this.anInt3423 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	public final void method2342(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3423++] = (byte) arg0;
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)I")
	public final int method2343() {
		@Pc(14) byte local14 = this.aByteArray39[this.anInt3423++];
		@Pc(24) int local24 = 0;
		while (local14 < 0) {
			local24 = (local14 & 0x7F | local24) << 7;
			local14 = this.aByteArray39[this.anInt3423++];
		}
		return local14 | local24;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)V")
	public final void method2344(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2389(arg0 >>> 28 | 0x80);
					}
					this.method2389(arg0 >>> 21 | 0x80);
				}
				this.method2389(arg0 >>> 14 | 0x80);
			}
			this.method2389(arg0 >>> 7 | 0x80);
		}
		this.method2389(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)B")
	public final byte method2345() {
		return (byte) (this.aByteArray39[this.anInt3423++] - 128);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)J")
	public final long method2346() {
		@Pc(15) long local15 = (long) this.method2382() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2382() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)I")
	public final int method2348() {
		this.anInt3423 += 4;
		return ((this.aByteArray39[this.anInt3423 - 2] & 0xFF) << 16) + (this.aByteArray39[this.anInt3423 - 1] << 24 & 0xFF000000) + ((this.aByteArray39[this.anInt3423 + -3] & 0xFF) << 8) + (this.aByteArray39[this.anInt3423 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
	public final void method2349(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2389(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2369(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)B")
	public final byte method2350() {
		return (byte) -this.aByteArray39[this.anInt3423++];
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[III)V")
	public final void method2351(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = this.anInt3423;
		@Pc(13) int local13 = (arg1 - 5) / 8;
		this.anInt3423 = 5;
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(21) int local21 = -957401312;
			@Pc(25) int local25 = this.method2382();
			@Pc(31) int local31 = this.method2382();
			@Pc(33) int local33 = 32;
			while (local33-- > 0) {
				local31 -= (local25 >>> 5 ^ local25 << 4) + local25 ^ arg0[local21 >>> 11 & 0x3] + local21;
				local21 -= -1640531527;
				local25 -= (local31 >>> 5 ^ local31 << 4) + local31 ^ arg0[local21 & 0x3] + local21;
			}
			this.anInt3423 -= 8;
			this.method2370(local25);
			this.method2370(local31);
		}
		this.anInt3423 = local2;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)I")
	public final int method2352() {
		return 128 - this.aByteArray39[this.anInt3423++] & 0xFF;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)I")
	public final int method2353() {
		this.anInt3423 += 2;
		return ((this.aByteArray39[this.anInt3423 - 2] & 0xFF) << 8) + (this.aByteArray39[this.anInt3423 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[B)V")
	public final void method2354(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = this.aByteArray39[this.anInt3423++];
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
	public final void method2355(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)B")
	public final byte method2356() {
		return (byte) (128 - this.aByteArray39[this.anInt3423++]);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)V")
	public final void method2357(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3423++] = (byte) arg0;
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)I")
	public final int method2358() {
		this.anInt3423 += 3;
		return ((this.aByteArray39[this.anInt3423 - 2] & 0xFF) << 16) + (((this.aByteArray39[this.anInt3423 - 3] & 0xFF) << 8) + (this.aByteArray39[this.anInt3423 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)I")
	public final int method2359() {
		this.anInt3423 += 4;
		return (this.aByteArray39[this.anInt3423 - 3] & 0xFF) + ((this.aByteArray39[this.anInt3423 - 4] & 0xFF) << 8) + ((this.aByteArray39[this.anInt3423 - 2] & 0xFF) << 24) + ((this.aByteArray39[this.anInt3423 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V")
	public final void method2360(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3423++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)Lclient!sg;")
	public final Class77 method2361() {
		@Pc(6) int local6 = this.anInt3423;
		while (this.aByteArray39[this.anInt3423++] != 0) {
		}
		return Static58.method1070(this.aByteArray39, local6, this.anInt3423 - local6 - 1);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)I")
	public final int method2363() {
		this.anInt3423 += 2;
		return (this.aByteArray39[this.anInt3423 - 1] - 128 & 0xFF) + ((this.aByteArray39[this.anInt3423 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)I")
	public final int method2364() {
		this.anInt3423 += 2;
		@Pc(38) int local38 = (this.aByteArray39[this.anInt3423 - 2] - 128 & 0xFF) + ((this.aByteArray39[this.anInt3423 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IZ)V")
	public final void method2365(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 + 128);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(III[B)V")
	public final void method2366(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(10) int local10 = arg0 - 1; local10 >= 0; local10--) {
			arg1[local10] = (byte) (this.aByteArray39[this.anInt3423++] - 128);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!sg;B)V")
	public final void method2367(@OriginalArg(0) Class77 arg0) {
		this.anInt3423 += arg0.method2515(arg0.method2532(), this.aByteArray39, this.anInt3423);
		this.aByteArray39[this.anInt3423++] = 0;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IB)V")
	public final void method2369(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3423++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(BI)V")
	public final void method2370(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3423++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)V")
	public final void method2371(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3423 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method2372(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt3423;
		this.anInt3423 = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method2354(local13, local19);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt3423 = 0;
		this.method2389(local38.length);
		this.method2340(local38, local38.length);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(B)I")
	public final int method2373() {
		this.anInt3423 += 4;
		return (this.aByteArray39[this.anInt3423 - 2] & 0xFF) + ((this.aByteArray39[this.anInt3423 - 4] & 0xFF) << 16) + ((this.aByteArray39[this.anInt3423 + -3] & 0xFF) << 24) + ((this.aByteArray39[this.anInt3423 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "(I)I")
	public final int method2374() {
		return this.aByteArray39[this.anInt3423++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(I)I")
	public final int method2375() {
		@Pc(7) int local7 = this.aByteArray39[this.anInt3423] & 0xFF;
		return local7 < 128 ? this.method2387() - 64 : this.method2353() + -49152;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(BI)V")
	public final void method2376(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) arg0;
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(B)I")
	public final int method2377() {
		return -this.aByteArray39[this.anInt3423++] & 0xFF;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(BI)V")
	public final void method2378(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "(I)I")
	public final int method2379() {
		this.anInt3423 += 2;
		return (this.aByteArray39[this.anInt3423 - 2] & 0xFF) + ((this.aByteArray39[this.anInt3423 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)I")
	public final int method2380() {
		@Pc(18) int local18 = this.aByteArray39[this.anInt3423] & 0xFF;
		return local18 < 128 ? this.method2387() : this.method2353() - 32768;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IB)V")
	public final void method2381(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3423 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3423 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3423 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3423 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "(I)I")
	public final int method2382() {
		this.anInt3423 += 4;
		return (this.aByteArray39[this.anInt3423 - 1] & 0xFF) + ((this.aByteArray39[this.anInt3423 - 3] & 0xFF) << 16) + ((this.aByteArray39[this.anInt3423 + -4] & 0xFF) << 24) + ((this.aByteArray39[this.anInt3423 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "(I)Lclient!sg;")
	public final Class77 method2383() {
		if (this.aByteArray39[this.anInt3423] == 0) {
			this.anInt3423++;
			return null;
		} else {
			return this.method2361();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(JI)V")
	public final void method2384(@OriginalArg(0) long arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 56);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 48);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 40);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 32);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 24);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 16);
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
		this.aByteArray39[this.anInt3423++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "(I)I")
	public final int method2385() {
		this.anInt3423 += 2;
		@Pc(38) int local38 = ((this.aByteArray39[this.anInt3423 - 2] & 0xFF) << 8) + (this.aByteArray39[this.anInt3423 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "(I)I")
	public final int method2386() {
		this.anInt3423 += 2;
		@Pc(31) int local31 = ((this.aByteArray39[this.anInt3423 - 2] & 0xFF) << 8) + (this.aByteArray39[this.anInt3423 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(B)I")
	public final int method2387() {
		return this.aByteArray39[this.anInt3423++] & 0xFF;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)V")
	public final void method2388(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
	public final void method2389(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[BBI)V")
	public final void method2390(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = (byte) (this.aByteArray39[this.anInt3423++] - 128);
		}
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(B)B")
	public final byte method2392() {
		return this.aByteArray39[this.anInt3423++];
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BJ)V")
	public final void method2393(@OriginalArg(1) long arg0) {
		this.method2376((int) (arg0 >> 32));
		this.method2376((int) arg0);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(II)I")
	public final int method2394(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static50.method962(arg0, this.anInt3423, this.aByteArray39);
		this.method2370(local11);
		return local11;
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(B)I")
	public final int method2395() {
		this.anInt3423 += 2;
		return (this.aByteArray39[this.anInt3423 - 2] - 128 & 0xFF) + ((this.aByteArray39[this.anInt3423 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(BI)V")
	public final void method2396(@OriginalArg(1) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) arg0;
		this.aByteArray39[this.anInt3423++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IB)V")
	public final void method2397(@OriginalArg(0) int arg0) {
		this.aByteArray39[this.anInt3423++] = (byte) -arg0;
	}
}
