import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!vf", name = "yb", descriptor = "[B")
	public static byte[] aByteArray53 = new byte[32896];

	@OriginalMember(owner = "client!vf", name = "qb", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
	public int anInt4021;

	static {
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < 256; local33++) {
			for (@Pc(36) int local36 = 0; local36 <= local33; local36++) {
				aByteArray53[local31++] = (byte) (255.0D / Math.sqrt((double) ((float) (local36 * local36 + local33 * local33 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub26(@OriginalArg(0) int arg0) {
		this.aByteArray52 = Static81.method1382(arg0);
		this.anInt4021 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray52 = arg0;
		this.anInt4021 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)V")
	public final void method2934(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) arg0;
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)I")
	public final int method2935(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static6.method2294(arg0, this.anInt4021, this.aByteArray52);
		this.method2973(local11);
		return local11;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V")
	public final void method2936(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4021 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4021 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4021 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4021 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)I")
	public final int method2937() {
		this.anInt4021 += 3;
		return ((this.aByteArray52[this.anInt4021 - 3] & 0xFF) << 16) + ((this.aByteArray52[this.anInt4021 - 2] << 8 & 0xFF00) + (this.aByteArray52[this.anInt4021 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZJ)V")
	public final void method2938(@OriginalArg(1) long arg0) {
		this.method2951((int) (arg0 >> 32));
		this.method2951((int) arg0);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)B")
	public final byte method2939() {
		return (byte) -this.aByteArray52[this.anInt4021++];
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(ZJ)V")
	public final void method2940(@OriginalArg(1) long arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 56);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 48);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 40);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 32);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4021++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)I")
	public final int method2942() {
		return -this.aByteArray52[this.anInt4021++] & 0xFF;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)J")
	public final long method2943() {
		@Pc(10) long local10 = (long) this.method2958() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method2958() & 0xFFFFFFFFL;
		return (local10 << 32) + local24;
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)I")
	public final int method2944() {
		this.anInt4021 += 2;
		@Pc(35) int local35 = ((this.aByteArray52[this.anInt4021 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt4021 - 1] & 0xFF);
		if (local35 > 32767) {
			local35 -= 65536;
		}
		return local35;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I")
	public final int method2945() {
		return this.aByteArray52[this.anInt4021++] & 0xFF;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)I")
	public final int method2946() {
		@Pc(16) int local16 = this.aByteArray52[this.anInt4021] & 0xFF;
		return local16 >= 128 ? this.method2964() - 32768 : this.method2945();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V")
	public final void method2949(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)B")
	public final byte method2950() {
		return (byte) (this.aByteArray52[this.anInt4021++] - 128);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IZ)V")
	public final void method2951(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4021++] = (byte) arg0;
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)I")
	public final int method2952() {
		this.anInt4021 += 2;
		@Pc(33) int local33 = (this.aByteArray52[this.anInt4021 - 2] - 128 & 0xFF) + ((this.aByteArray52[this.anInt4021 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method2953(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(7) int local7 = this.method2945();
		@Pc(10) byte[] local10 = new byte[local7];
		this.method2959(local10, local7);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(37) byte[] local37 = local26.toByteArray();
		this.anInt4021 = 0;
		this.method2993(local37.length, local37);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)V")
	public final void method2954(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)I")
	public final int method2955() {
		@Pc(22) byte local22 = this.aByteArray52[this.anInt4021++];
		@Pc(24) int local24 = 0;
		while (local22 < 0) {
			local24 = (local24 | local22 & 0x7F) << 7;
			local22 = this.aByteArray52[this.anInt4021++];
		}
		return local22 | local24;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII[B)V")
	public final void method2956(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (this.aByteArray52[this.anInt4021++] - 128);
		}
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)I")
	public final int method2958() {
		this.anInt4021 += 4;
		return ((this.aByteArray52[this.anInt4021 - 3] & 0xFF) << 16) + ((this.aByteArray52[this.anInt4021 - 4] & 0xFF) << 24) + ((this.aByteArray52[this.anInt4021 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt4021 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[BI)V")
	public final void method2959(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray52[this.anInt4021++];
		}
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)I")
	public final int method2960() {
		this.anInt4021 += 4;
		return (this.aByteArray52[this.anInt4021 - 2] & 0xFF) + ((this.aByteArray52[this.anInt4021 - 4] & 0xFF) << 16) + ((this.aByteArray52[this.anInt4021 + -3] & 0xFF) << 24) + ((this.aByteArray52[this.anInt4021 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[BII)V")
	public final void method2961(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray52[this.anInt4021++] - 128);
		}
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(II)V")
	public final void method2963(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4021++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "(I)I")
	public final int method2964() {
		this.anInt4021 += 2;
		return (this.aByteArray52[this.anInt4021 - 1] & 0xFF) + ((this.aByteArray52[this.anInt4021 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(B)I")
	public final int method2965() {
		@Pc(17) int local17 = this.aByteArray52[this.anInt4021] & 0xFF;
		return local17 >= 128 ? this.method2964() - 49152 : this.method2945() + -64;
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(II)V")
	public final void method2966(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) arg0;
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IB)V")
	public final void method2967(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "(I)I")
	public final int method2968() {
		return 128 - this.aByteArray52[this.anInt4021++] & 0xFF;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(IB)J")
	public final long method2969(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local2 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray52[this.anInt4021++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(B)I")
	public final int method2970() {
		this.anInt4021 += 2;
		@Pc(40) int local40 = ((this.aByteArray52[this.anInt4021 - 1] & 0xFF) << 8) + (this.aByteArray52[this.anInt4021 - 2] & 0xFF);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IJI)V")
	public final void method2971(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(28) int local28 = local2 * 8; local28 >= 0; local28 -= 8) {
			this.aByteArray52[this.anInt4021++] = (byte) (arg1 >> local28);
		}
	}

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "(I)I")
	public final int method2972() {
		return this.aByteArray52[this.anInt4021++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(II)V")
	public final void method2973(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4021++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(IB)V")
	public final void method2974(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "(I)Lclient!sc;")
	public final Class107 method2975() {
		if (this.aByteArray52[this.anInt4021] == 0) {
			this.anInt4021++;
			return null;
		} else {
			return this.method2978();
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(ZI)V")
	public final void method2976(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4021++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "(I)I")
	public final int method2977() {
		this.anInt4021 += 2;
		return ((this.aByteArray52[this.anInt4021 - 1] & 0xFF) << 8) + (this.aByteArray52[this.anInt4021 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "(I)Lclient!sc;")
	public final Class107 method2978() {
		@Pc(2) int local2 = this.anInt4021;
		while (this.aByteArray52[this.anInt4021++] != 0) {
		}
		return Static140.method661(local2, this.anInt4021 - local2 - 1, this.aByteArray52);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!sc;I)V")
	public final void method2979(@OriginalArg(0) Class107 arg0) {
		this.anInt4021 += arg0.method3070(this.aByteArray52, arg0.method3095(), this.anInt4021);
		this.aByteArray52[this.anInt4021++] = 0;
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(B)B")
	public final byte method2980() {
		return (byte) (128 - this.aByteArray52[this.anInt4021++]);
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(B)I")
	public final int method2981() {
		this.anInt4021 += 4;
		return (this.aByteArray52[this.anInt4021 - 3] & 0xFF) + ((this.aByteArray52[this.anInt4021 - 2] & 0xFF) << 24) + ((this.aByteArray52[this.anInt4021 - 1] & 0xFF) << 16) + ((this.aByteArray52[this.anInt4021 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(IZ)V")
	public final void method2982(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4021 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "(I)I")
	public final int method2983() {
		this.anInt4021 += 2;
		return (this.aByteArray52[this.anInt4021 - 2] & 0xFF) + ((this.aByteArray52[this.anInt4021 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([IIII)V")
	public final void method2984(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt4021;
		this.anInt4021 = 5;
		@Pc(22) int local22 = (arg1 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) int local30 = this.method2958();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			@Pc(40) int local40 = this.method2958();
			while (local36-- > 0) {
				local40 -= (local30 << 4 ^ local30 >>> 5) + local30 ^ local32 - -arg0[local32 >>> 11 & 0x3];
				local32 -= -1640531527;
				local30 -= local40 + (local40 << 4 ^ local40 >>> 5) ^ local32 - -arg0[local32 & 0x3];
			}
			this.anInt4021 -= 8;
			this.method2973(local30);
			this.method2973(local40);
		}
		this.anInt4021 = local8;
	}

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "(I)I")
	public final int method2985() {
		this.anInt4021 += 3;
		return ((this.aByteArray52[this.anInt4021 - 1] & 0xFF) << 16) + ((this.aByteArray52[this.anInt4021 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt4021 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "(B)I")
	public final int method2987() {
		this.anInt4021 += 2;
		return (this.aByteArray52[this.anInt4021 - 1] - 128 & 0xFF) + ((this.aByteArray52[this.anInt4021 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "(II)V")
	public final void method2988(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 + 128);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(II)V")
	public final void method2989(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2967(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2963(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(ZI)V")
	public final void method2990(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2967(arg0 >>> 28 | 0x80);
					}
					this.method2967(arg0 >>> 21 | 0x80);
				}
				this.method2967(arg0 >>> 14 | 0x80);
			}
			this.method2967(arg0 >>> 7 | 0x80);
		}
		this.method2967(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method2991(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt4021;
		this.anInt4021 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method2959(local12, local2);
		@Pc(30) BigInteger local30 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt4021 = 0;
		this.method2967(local38.length);
		this.method2993(local38.length, local38);
	}

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "(I)B")
	public final byte method2992() {
		return this.aByteArray52[this.anInt4021++];
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[BBI)V")
	public final void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray52[this.anInt4021++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "(II)V")
	public final void method2994(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt4021++] = (byte) arg0;
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt4021++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "(B)I")
	public final int method2995() {
		this.anInt4021 += 4;
		return (this.aByteArray52[this.anInt4021 - 4] & 0xFF) + ((this.aByteArray52[this.anInt4021 - 2] & 0xFF) << 16) + ((this.aByteArray52[this.anInt4021 + -1] & 0xFF) << 24) + ((this.aByteArray52[this.anInt4021 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "(B)I")
	public final int method2996() {
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		for (local7 = this.method2946(); local7 == 32767; local7 = this.method2946()) {
			local3 += 32767;
		}
		return local3 + local7;
	}
}
