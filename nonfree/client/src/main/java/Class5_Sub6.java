import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!ce", name = "wb", descriptor = "I")
	public int anInt4050;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
	public Class5_Sub6(@OriginalArg(0) int arg0) {
		this.aByteArray56 = Static184.method2778(arg0);
		this.anInt4050 = 0;
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
	public Class5_Sub6(@OriginalArg(0) byte[] arg0) {
		this.anInt4050 = 0;
		this.aByteArray56 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lclient!dc;")
	public final Class20 method3027() {
		@Pc(11) int local11 = this.anInt4050;
		while (this.aByteArray56[this.anInt4050++] != 0) {
		}
		return Static92.method1513(this.aByteArray56, this.anInt4050 - local11 - 1, local11);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public final void method3028(@OriginalArg(0) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 + 128);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)V")
	public final void method3029(@OriginalArg(0) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)V")
	public final void method3030(@OriginalArg(0) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 24);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 16);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
		this.aByteArray56[this.anInt4050++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)V")
	public final void method3031(@OriginalArg(0) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) arg0;
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(II)I")
	public final int method3032(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static75.method1221(arg0, this.anInt4050, this.aByteArray56);
		this.method3030(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)I")
	public final int method3033() {
		@Pc(16) int local16 = this.aByteArray56[this.anInt4050] & 0xFF;
		return local16 >= 128 ? this.method3077() - 32768 : this.method3062();
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)B")
	public final byte method3034() {
		return (byte) -this.aByteArray56[this.anInt4050++];
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)B")
	public final byte method3035() {
		return (byte) (this.aByteArray56[this.anInt4050++] - 128);
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)I")
	public final int method3036() {
		return this.aByteArray56[this.anInt4050++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(JB)V")
	public final void method3037(@OriginalArg(0) long arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 56);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 48);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 40);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 32);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 24);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 16);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
		this.aByteArray56[this.anInt4050++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I")
	public final int method3038() {
		@Pc(16) byte local16 = this.aByteArray56[this.anInt4050++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local16 & 0x7F | local18) << 7;
			local16 = this.aByteArray56[this.anInt4050++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[BI)V")
	public final void method3039(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray56[this.anInt4050++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)V")
	public final void method3040(@OriginalArg(1) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) arg0;
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 16);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)B")
	public final byte method3041() {
		return (byte) (128 - this.aByteArray56[this.anInt4050++]);
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)I")
	public final int method3042() {
		this.anInt4050 += 4;
		return (this.aByteArray56[this.anInt4050 - 4] & 0xFF) + ((this.aByteArray56[this.anInt4050 - 2] & 0xFF) << 16) + ((this.aByteArray56[this.anInt4050 + -1] & 0xFF) << 24) + ((this.aByteArray56[this.anInt4050 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)I")
	public final int method3043() {
		this.anInt4050 += 2;
		return (this.aByteArray56[this.anInt4050 - 2] - 128 & 0xFF) + ((this.aByteArray56[this.anInt4050 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
	public final void method3044(@OriginalArg(0) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
		this.aByteArray56[this.anInt4050++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IB)V")
	public final void method3046(@OriginalArg(0) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
		this.aByteArray56[this.anInt4050++] = (byte) arg0;
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 24);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!dc;I)V")
	public final void method3047(@OriginalArg(0) Class20 arg0) {
		this.anInt4050 += arg0.method548(this.anInt4050, arg0.method582(), this.aByteArray56);
		this.aByteArray56[this.anInt4050++] = 0;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(B)I")
	public final int method3048() {
		@Pc(7) int local7 = 0;
		@Pc(18) int local18 = this.method3033();
		while (local18 == 32767) {
			local18 = this.method3033();
			local7 += 32767;
		}
		return local7 + local18;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIJ)V")
	public final void method3049(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(13) int local13 = arg0 - 1;
		if (local13 < 0 || local13 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local13 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray56[this.anInt4050++] = (byte) (arg1 >> local29);
		}
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(II)J")
	public final long method3050(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local6 * 8;
		@Pc(25) long local25 = (long) 0;
		while (local22 >= 0) {
			local25 |= ((long) this.aByteArray56[this.anInt4050++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[BII)V")
	public final void method3051(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray56[this.anInt4050++];
		}
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(B)Lclient!dc;")
	public final Class20 method3052() {
		if (this.aByteArray56[this.anInt4050] == 0) {
			this.anInt4050++;
			return null;
		} else {
			return this.method3027();
		}
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)B")
	public final byte method3053() {
		return this.aByteArray56[this.anInt4050++];
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(I)I")
	public final int method3054() {
		this.anInt4050 += 2;
		return (this.aByteArray56[this.anInt4050 - 2] & 0xFF) + ((this.aByteArray56[this.anInt4050 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(JI)V")
	public final void method3055(@OriginalArg(0) long arg0) {
		this.method3082((int) (arg0 >> 32));
		this.method3082((int) arg0);
	}

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "(I)I")
	public final int method3057() {
		this.anInt4050 += 2;
		@Pc(33) int local33 = ((this.aByteArray56[this.anInt4050 - 1] & 0xFF) << 8) + (this.aByteArray56[this.anInt4050 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(II)V")
	public final void method3058(@OriginalArg(1) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 16);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
		this.aByteArray56[this.anInt4050++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "(I)I")
	public final int method3059() {
		return 128 - this.aByteArray56[this.anInt4050++] & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)I")
	public final int method3060() {
		@Pc(7) int local7 = this.aByteArray56[this.anInt4050] & 0xFF;
		return local7 < 128 ? this.method3062() - 64 : this.method3077() - 49152;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)V")
	public final void method3061(@OriginalArg(1) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "(I)I")
	public final int method3062() {
		return this.aByteArray56[this.anInt4050++] & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method3063(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4050;
		this.anInt4050 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3051(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt4050 = 0;
		this.method3061(local31.length);
		this.method3039(local31, local31.length);
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(II)V")
	public final void method3064(@OriginalArg(1) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I[BII)V")
	public final void method3065(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			arg0[local14] = (byte) (this.aByteArray56[this.anInt4050++] - 128);
		}
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(B)I")
	public final int method3066() {
		this.anInt4050 += 4;
		return (this.aByteArray56[this.anInt4050 - 2] & 0xFF) + ((this.aByteArray56[this.anInt4050 - 4] & 0xFF) << 16) + ((this.aByteArray56[this.anInt4050 + -3] & 0xFF) << 24) + ((this.aByteArray56[this.anInt4050 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(II)V")
	public final void method3067(@OriginalArg(0) int arg0) {
		this.aByteArray56[this.anInt4050 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray56[this.anInt4050 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray56[this.anInt4050 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray56[this.anInt4050 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(II)V")
	public final void method3068(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3061(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3044(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "(I)J")
	public final long method3069() {
		@Pc(15) long local15 = (long) this.method3073() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method3073() & 0xFFFFFFFFL;
		return local26 + (local15 << 32);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB[I)V")
	public final void method3070(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt4050;
		@Pc(19) int local19 = (arg0 - 5) / 8;
		this.anInt4050 = 5;
		for (@Pc(24) int local24 = 0; local24 < local19; local24++) {
			@Pc(28) int local28 = -957401312;
			@Pc(34) int local34 = this.method3073();
			@Pc(38) int local38 = this.method3073();
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local38 -= arg1[local28 >>> 11 & 0x3] + local28 ^ (local34 << 4 ^ local34 >>> 5) - -local34;
				local28 -= -1640531527;
				local34 -= arg1[local28 & 0x3] + local28 ^ local38 + (local38 << 4 ^ local38 >>> 5);
			}
			this.anInt4050 -= 8;
			this.method3030(local34);
			this.method3030(local38);
		}
		this.anInt4050 = local8;
	}

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "(I)I")
	public final int method3072() {
		this.anInt4050 += 3;
		return ((this.aByteArray56[this.anInt4050 - 2] & 0xFF) << 8) + ((this.aByteArray56[this.anInt4050 - 3] & 0xFF) << 16) + (this.aByteArray56[this.anInt4050 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "(I)I")
	public final int method3073() {
		this.anInt4050 += 4;
		return ((this.aByteArray56[this.anInt4050 - 4] & 0xFF) << 24) + ((this.aByteArray56[this.anInt4050 - 3] << 16 & 0xFF0000) + ((this.aByteArray56[this.anInt4050 - 2] & 0xFF) << 8) + (this.aByteArray56[this.anInt4050 + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "(I)I")
	public final int method3074() {
		return -this.aByteArray56[this.anInt4050++] & 0xFF;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)I")
	public final int method3075() {
		this.anInt4050 += 2;
		@Pc(31) int local31 = ((this.aByteArray56[this.anInt4050 - 2] & 0xFF) << 8) + (this.aByteArray56[this.anInt4050 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(Z)I")
	public final int method3076() {
		this.anInt4050 += 3;
		return (this.aByteArray56[this.anInt4050 - 2] & 0xFF) + ((this.aByteArray56[this.anInt4050 - 3] & 0xFF) << 16) + ((this.aByteArray56[this.anInt4050 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(B)I")
	public final int method3077() {
		this.anInt4050 += 2;
		return (this.aByteArray56[this.anInt4050 - 1] & 0xFF) + ((this.aByteArray56[this.anInt4050 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(BI)V")
	public final void method3078(@OriginalArg(1) int arg0) {
		this.aByteArray56[this.anInt4050 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[B)V")
	public final void method3079(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = arg0 - 1; local12 >= 0; local12--) {
			arg1[local12] = (byte) (this.aByteArray56[this.anInt4050++] - 128);
		}
	}

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "(II)V")
	public final void method3080(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3061(arg0 >>> 28 | 0x80);
					}
					this.method3061(arg0 >>> 21 | 0x80);
				}
				this.method3061(arg0 >>> 14 | 0x80);
			}
			this.method3061(arg0 >>> 7 | 0x80);
		}
		this.method3061(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(B)I")
	public final int method3081() {
		this.anInt4050 += 2;
		return ((this.aByteArray56[this.anInt4050 - 2] & 0xFF) << 8) + (this.aByteArray56[this.anInt4050 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(IB)V")
	public final void method3082(@OriginalArg(0) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 16);
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 24);
		this.aByteArray56[this.anInt4050++] = (byte) arg0;
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(BI)V")
	public final void method3083(@OriginalArg(1) int arg0) {
		this.aByteArray56[this.anInt4050++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "(I)I")
	public final int method3084() {
		this.anInt4050 += 4;
		return (this.aByteArray56[this.anInt4050 - 3] & 0xFF) + ((this.aByteArray56[this.anInt4050 - 4] & 0xFF) << 8) + ((this.aByteArray56[this.anInt4050 + -2] & 0xFF) << 24) + ((this.aByteArray56[this.anInt4050 - 1] & 0xFF) << 16);
	}
}
