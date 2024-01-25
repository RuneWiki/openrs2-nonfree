import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!cu", name = "S", descriptor = "I")
	public int anInt3235 = 0;

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7(@OriginalArg(0) int arg0) {
		this.aByteArray46 = Static291.method4105(arg0);
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "([B)V")
	public Class3_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray46 = arg0;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ)V")
	public final void method2579(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2628(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2613(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[BII)V")
	public final void method2580(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			arg1[local5] = this.aByteArray46[this.anInt3235++];
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method2581(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3235;
		this.anInt3235 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method2580(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt3235 = 0;
		this.method2628(local31.length);
		this.method2595(local31.length, local31);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)I")
	public final int method2582() {
		return this.aByteArray46[this.anInt3235++] & 0xFF;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)V")
	public final void method2583(@OriginalArg(0) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 16);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 24);
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(B)I")
	public final int method2584() {
		return -this.aByteArray46[this.anInt3235++] & 0xFF;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(II)V")
	public final void method2585(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(B)I")
	public final int method2586() {
		this.anInt3235 += 2;
		@Pc(39) int local39 = ((this.aByteArray46[this.anInt3235 - 2] & 0xFF) << 8) + (this.aByteArray46[this.anInt3235 - 1] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BI)V")
	public final void method2587(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 + 128);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "(B)I")
	public final int method2588() {
		this.anInt3235 += 2;
		return ((this.aByteArray46[this.anInt3235 - 2] & 0xFF) << 8) + (this.aByteArray46[this.anInt3235 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)I")
	public final int method2589() {
		this.anInt3235 += 4;
		return ((this.aByteArray46[this.anInt3235 - 3] & 0xFF) << 16) + ((this.aByteArray46[this.anInt3235 - 4] & 0xFF) << 24) + ((this.aByteArray46[this.anInt3235 + -2] & 0xFF) << 8) + (this.aByteArray46[this.anInt3235 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)I")
	public final int method2590() {
		this.anInt3235 += 2;
		@Pc(38) int local38 = (this.aByteArray46[this.anInt3235 - 2] - 128 & 0xFF) + ((this.aByteArray46[this.anInt3235 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method2591() {
		@Pc(14) byte local14 = this.aByteArray46[this.anInt3235++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(34) int local34 = this.anInt3235;
		while (this.aByteArray46[this.anInt3235++] != 0) {
		}
		@Pc(53) int local53 = this.anInt3235 - local34 - 1;
		return local53 == 0 ? "" : Static198.method3127(this.aByteArray46, local53, local34);
	}

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "(B)I")
	public final int method2592() {
		@Pc(5) int local5 = 0;
		@Pc(16) int local16;
		for (local16 = this.method2638(); local16 == 32767; local16 = this.method2638()) {
			local5 += 32767;
		}
		return local5 + local16;
	}

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "(B)I")
	public final int method2593() {
		this.anInt3235 += 2;
		return ((this.aByteArray46[this.anInt3235 - 1] & 0xFF) << 8) + (this.aByteArray46[this.anInt3235 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
	public final int method2594() {
		this.anInt3235 += 3;
		return (this.aByteArray46[this.anInt3235 - 1] & 0xFF) + ((this.aByteArray46[this.anInt3235 - 3] & 0xFF) << 8) + ((this.aByteArray46[this.anInt3235 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III[B)V")
	public final void method2595(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			this.aByteArray46[this.anInt3235++] = arg1[local9];
		}
	}

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "(I)I")
	public final int method2596() {
		this.anInt3235 += 4;
		return ((this.aByteArray46[this.anInt3235 - 4] & 0xFF) << 16) + ((this.aByteArray46[this.anInt3235 - 3] & 0xFF) << 24) + ((this.aByteArray46[this.anInt3235 - 1] & 0xFF) << 8) + (this.aByteArray46[this.anInt3235 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "(B)Z")
	public final boolean method2597() {
		this.anInt3235 -= 4;
		@Pc(17) int local17 = Static49.method871(0, this.anInt3235, this.aByteArray46);
		@Pc(21) int local21 = this.method2589();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "(I)I")
	public final int method2598() {
		this.anInt3235 += 2;
		return (this.aByteArray46[this.anInt3235 - 2] - 128 & 0xFF) + ((this.aByteArray46[this.anInt3235 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(II)V")
	public final void method2599(@OriginalArg(0) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)I")
	public final int method2600() {
		@Pc(21) byte local21 = this.aByteArray46[this.anInt3235++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray46[this.anInt3235++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(II)V")
	public final void method2601(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "(II)V")
	public final void method2602(@OriginalArg(0) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 16);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IJ)V")
	public final void method2603(@OriginalArg(1) long arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 56);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 48);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 40);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 32);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 24);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 16);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "(I)I")
	public final int method2604() {
		this.anInt3235 += 3;
		return (this.aByteArray46[this.anInt3235 - 1] & 0xFF) + ((this.aByteArray46[this.anInt3235 - 3] & 0xFF) << 16) + ((this.aByteArray46[this.anInt3235 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "(B)I")
	public final int method2605() {
		this.anInt3235 += 2;
		@Pc(37) int local37 = ((this.aByteArray46[this.anInt3235 - 1] & 0xFF) << 8) + (this.aByteArray46[this.anInt3235 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "([BIII)V")
	public final void method2606(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (this.aByteArray46[this.anInt3235++] - 128);
		}
	}

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "(II)V")
	public final void method2607(@OriginalArg(0) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 16);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method2608(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.indexOf(0);
		if (local14 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local14 + " - cannot pjstr");
		}
		this.anInt3235 += Static311.method4316(arg0, this.aByteArray46, arg0.length(), this.anInt3235);
		this.aByteArray46[this.anInt3235++] = 0;
	}

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "(I)B")
	public final byte method2609() {
		return (byte) -this.aByteArray46[this.anInt3235++];
	}

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "(B)J")
	public final long method2610() {
		@Pc(10) long local10 = (long) this.method2589() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2589() & 0xFFFFFFFFL;
		return local22 + (local10 << 32);
	}

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "(II)V")
	public final void method2611(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray46[this.anInt3235 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray46[this.anInt3235 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "(I)B")
	public final byte method2612() {
		return this.aByteArray46[this.anInt3235++];
	}

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "(II)V")
	public final void method2613(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "(II)V")
	public final void method2614(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IB)V")
	public final void method2615(@OriginalArg(0) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 16);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "(I)I")
	public final int method2616() {
		this.anInt3235 += 4;
		return ((this.aByteArray46[this.anInt3235 - 1] & 0xFF) << 16) + (this.aByteArray46[this.anInt3235 - 2] << 24 & 0xFF000000) + ((this.aByteArray46[this.anInt3235 - 4] & 0xFF) << 8) + (this.aByteArray46[this.anInt3235 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "([IIII)V")
	public final void method2617(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt3235;
		this.anInt3235 = 5;
		@Pc(23) int local23 = (arg1 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(32) int local32 = this.method2589();
			@Pc(36) int local36 = this.method2589();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= (local32 >>> 5 ^ local32 << 4) + local32 ^ arg0[local38 >>> 11 & 0x3] + local38;
				local38 -= -1640531527;
				local32 -= local36 + (local36 >>> 5 ^ local36 << 4) ^ local38 + arg0[local38 & 0x3];
			}
			this.anInt3235 -= 8;
			this.method2636(local32);
			this.method2636(local36);
		}
		this.anInt3235 = local13;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
	public final void method2618(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "(I)B")
	public final byte method2619() {
		return (byte) (this.aByteArray46[this.anInt3235++] - 128);
	}

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "(B)Ljava/lang/String;")
	public final String method2620() {
		@Pc(13) int local13 = this.anInt3235;
		while (this.aByteArray46[this.anInt3235++] != 0) {
		}
		@Pc(36) int local36 = this.anInt3235 - local13 - 1;
		return local36 == 0 ? "" : Static198.method3127(this.aByteArray46, local36, local13);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "([II)V")
	public final void method2621(@OriginalArg(0) int[] arg0) {
		@Pc(8) int local8 = this.anInt3235 / 8;
		this.anInt3235 = 0;
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(18) int local18 = this.method2589();
			@Pc(24) int local24 = this.method2589();
			@Pc(26) int local26 = 0;
			@Pc(30) int local30 = 32;
			while (local30-- > 0) {
				local18 += (local24 >>> 5 ^ local24 << 4) + local24 ^ arg0[local26 & 0x3] + local26;
				local26 += -1640531527;
				local24 += local18 + (local18 << 4 ^ local18 >>> 5) ^ local26 - -arg0[local26 >>> 11 & 0x3];
			}
			this.anInt3235 -= 8;
			this.method2636(local18);
			this.method2636(local24);
		}
	}

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "(II)V")
	public final void method2622(@OriginalArg(0) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 24);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(IB)V")
	public final void method2623(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2628(arg0 >>> 28 | 0x80);
					}
					this.method2628(arg0 >>> 21 | 0x80);
				}
				this.method2628(arg0 >>> 14 | 0x80);
			}
			this.method2628(arg0 >>> 7 | 0x80);
		}
		this.method2628(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "(II)V")
	public final void method2624(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(IB)I")
	public final int method2625(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = Static49.method871(arg0, this.anInt3235, this.aByteArray46);
		this.method2636(local19);
		return local19;
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(Z)I")
	public final int method2626() {
		@Pc(17) int local17 = this.aByteArray46[this.anInt3235] & 0xFF;
		return local17 < 128 ? this.method2582() - 64 : this.method2588() + -49152;
	}

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "(II)J")
	public final long method2627(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = local0 * 8;
		@Pc(22) long local22 = 0L;
		while (local20 >= 0) {
			local22 |= ((long) this.aByteArray46[this.anInt3235++] & 0xFFL) << local20;
			local20 -= 8;
		}
		return local22;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(ZI)V")
	public final void method2628(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(IZ)V")
	public final void method2629(@OriginalArg(0) int arg0) {
		this.aByteArray46[this.anInt3235 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "(B)B")
	public final byte method2630() {
		return (byte) (128 - this.aByteArray46[this.anInt3235++]);
	}

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "(B)Ljava/lang/String;")
	public final String method2631() {
		if (this.aByteArray46[this.anInt3235] == 0) {
			this.anInt3235++;
			return null;
		} else {
			return this.method2620();
		}
	}

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "(B)I")
	public final int method2632() {
		this.anInt3235 += 4;
		return ((this.aByteArray46[this.anInt3235 - 3] & 0xFF) << 8) + ((this.aByteArray46[this.anInt3235 - 1] & 0xFF) << 24) + ((this.aByteArray46[this.anInt3235 + -2] & 0xFF) << 16) + (this.aByteArray46[this.anInt3235 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "(II)V")
	public final void method2633(@OriginalArg(1) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "(I)I")
	public final int method2635() {
		this.anInt3235 += 2;
		return ((this.aByteArray46[this.anInt3235 - 2] & 0xFF) << 8) + (this.aByteArray46[this.anInt3235 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(IB)V")
	public final void method2636(@OriginalArg(0) int arg0) {
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 24);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 16);
		this.aByteArray46[this.anInt3235++] = (byte) (arg0 >> 8);
		this.aByteArray46[this.anInt3235++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "(I)I")
	public final int method2637() {
		return this.aByteArray46[this.anInt3235++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "(I)I")
	public final int method2638() {
		@Pc(11) int local11 = this.aByteArray46[this.anInt3235] & 0xFF;
		return local11 < 128 ? this.method2582() : this.method2588() - 32768;
	}

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "(B)I")
	public final int method2639() {
		return 128 - this.aByteArray46[this.anInt3235++] & 0xFF;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIJ)V")
	public final void method2640(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(23) int local23 = local0 * 8; local23 >= 0; local23 -= 8) {
			this.aByteArray46[this.anInt3235++] = (byte) (arg1 >> local23);
		}
	}

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "(I)I")
	public final int method2641() {
		this.anInt3235 += 2;
		@Pc(31) int local31 = (this.aByteArray46[this.anInt3235 - 1] & 0xFF) + ((this.aByteArray46[this.anInt3235 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}
}
