import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!ka", name = "ub", descriptor = "I")
	public int anInt4061;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14(@OriginalArg(0) int arg0) {
		this.aByteArray49 = Static132.method1967(arg0);
		this.anInt4061 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
	public Class1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray49 = arg0;
		this.anInt4061 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Lclient!vd;")
	public final Class92 method3007() {
		if (this.aByteArray49[this.anInt4061] == 0) {
			this.anInt4061++;
			return null;
		} else {
			return this.method3022();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public final void method3008(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 + 128);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)B")
	public final byte method3009() {
		return this.aByteArray49[this.anInt4061++];
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)I")
	public final int method3010() {
		return this.aByteArray49[this.anInt4061++] & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public final void method3011(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)I")
	public final int method3012() {
		@Pc(7) int local7 = 0;
		@Pc(18) byte local18;
		for (local18 = this.aByteArray49[this.anInt4061++]; local18 < 0; local18 = this.aByteArray49[this.anInt4061++]) {
			local7 = (local7 | local18 & 0x7F) << 7;
		}
		return local18 | local7;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
	public final void method3013(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BJ)V")
	public final void method3014(@OriginalArg(1) long arg0) {
		this.method3026((int) (arg0 >> 32));
		this.method3026((int) arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
	public final void method3015(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt4061++] = (byte) arg0;
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)V")
	public final void method3016(@OriginalArg(0) long arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 56);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 48);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 40);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 32);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt4061++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[B)V")
	public final void method3017(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray49[this.anInt4061++];
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!vd;B)V")
	public final void method3018(@OriginalArg(0) Class92 arg0) {
		this.anInt4061 += arg0.method3225(this.aByteArray49, arg0.method3233(), this.anInt4061);
		this.aByteArray49[this.anInt4061++] = 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(BI)V")
	public final void method3019(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) arg0;
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V")
	public final void method3020(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt4061++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[III)V")
	public final void method3021(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt4061;
		this.anInt4061 = 5;
		@Pc(25) int local25 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(35) int local35 = this.method3058();
			@Pc(41) int local41 = this.method3058();
			@Pc(45) int local45 = -957401312;
			@Pc(47) int local47 = 32;
			while (local47-- > 0) {
				local41 -= arg0[local45 >>> 11 & 0x84000003] + local45 ^ local35 + (local35 >>> 5 ^ local35 << 4);
				local45 -= -1640531527;
				local35 -= local41 + (local41 << 4 ^ local41 >>> 5) ^ arg0[local45 & 0x3] + local45;
			}
			this.anInt4061 -= 8;
			this.method3032(local35);
			this.method3032(local41);
		}
		this.anInt4061 = local8;
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)Lclient!vd;")
	public final Class92 method3022() {
		@Pc(13) int local13 = this.anInt4061;
		while (this.aByteArray49[this.anInt4061++] != 0) {
		}
		return Static66.method1032(this.aByteArray49, this.anInt4061 - local13 - 1, local13);
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)I")
	public final int method3023() {
		this.anInt4061 += 2;
		return (this.aByteArray49[this.anInt4061 - 1] & 0xFF) + ((this.aByteArray49[this.anInt4061 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
	public final void method3024(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(BI)V")
	public final void method3025(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt4061++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IZ)V")
	public final void method3026(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt4061++] = (byte) arg0;
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)I")
	public final int method3027() {
		this.anInt4061 += 2;
		return ((this.aByteArray49[this.anInt4061 - 1] & 0xFF) << 8) + (this.aByteArray49[this.anInt4061 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)I")
	public final int method3028() {
		return this.aByteArray49[this.anInt4061++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)I")
	public final int method3029() {
		this.anInt4061 += 4;
		return (this.aByteArray49[this.anInt4061 - 2] & 0xFF) + (((this.aByteArray49[this.anInt4061 - 1] & 0xFF) << 8) + ((this.aByteArray49[this.anInt4061 - 3] & 0xFF) << 24) + ((this.aByteArray49[this.anInt4061 + -4] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	public final void method3030(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3024(arg0 >>> 28 | 0x80);
					}
					this.method3024(arg0 >>> 21 | 0x80);
				}
				this.method3024(arg0 >>> 14 | 0x80);
			}
			this.method3024(arg0 >>> 7 | 0x80);
		}
		this.method3024(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)B")
	public final byte method3031() {
		return (byte) -this.aByteArray49[this.anInt4061++];
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V")
	public final void method3032(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt4061++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)I")
	public final int method3033() {
		@Pc(3) int local3 = 0;
		@Pc(11) int local11;
		for (local11 = this.method3047(); local11 == 32767; local11 = this.method3047()) {
			local3 += 32767;
		}
		return local3 + local11;
	}

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "(I)I")
	public final int method3034() {
		this.anInt4061 += 2;
		return ((this.aByteArray49[this.anInt4061 - 2] & 0xFF) << 8) + (this.aByteArray49[this.anInt4061 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(IZ)V")
	public final void method3035(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(B)I")
	public final int method3036() {
		return 128 - this.aByteArray49[this.anInt4061++] & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI[BI)V")
	public final void method3037(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			this.aByteArray49[this.anInt4061++] = arg0[local14];
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method3038(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4061;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt4061 = 0;
		this.method3017(local6, local9);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt4061 = 0;
		this.method3024(local31.length);
		this.method3037(local31, local31.length);
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)I")
	public final int method3039() {
		this.anInt4061 += 2;
		return ((this.aByteArray49[this.anInt4061 - 1] & 0xFF) << 8) + (this.aByteArray49[this.anInt4061 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(BI)I")
	public final int method3040(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static155.method2189(this.aByteArray49, this.anInt4061, arg0);
		this.method3032(local18);
		return local18;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(II)V")
	public final void method3041(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3024(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3020(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(II)V")
	public final void method3042(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt4061 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "(I)I")
	public final int method3043() {
		this.anInt4061 += 2;
		@Pc(34) int local34 = ((this.aByteArray49[this.anInt4061 - 2] & 0xFF) << 8) + (this.aByteArray49[this.anInt4061 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBJ)V")
	public final void method3044(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local2 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray49[this.anInt4061++] = (byte) (arg1 >> local29);
		}
	}

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "(I)I")
	public final int method3045() {
		@Pc(16) int local16 = this.aByteArray49[this.anInt4061] & 0xFF;
		return local16 >= 128 ? this.method3023() - 49152 : this.method3010() - 64;
	}

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "(I)I")
	public final int method3046() {
		this.anInt4061 += 2;
		@Pc(42) int local42 = ((this.aByteArray49[this.anInt4061 - 1] & 0xFF) << 8) + (this.aByteArray49[this.anInt4061 - 2] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "(I)I")
	public final int method3047() {
		@Pc(11) int local11 = this.aByteArray49[this.anInt4061] & 0xFF;
		return local11 >= 128 ? this.method3023() - 32768 : this.method3010();
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(B)I")
	public final int method3048() {
		this.anInt4061 += 2;
		@Pc(37) int local37 = ((this.aByteArray49[this.anInt4061 - 2] & 0xFF) << 8) + (this.aByteArray49[this.anInt4061 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(I)I")
	public final int method3049() {
		this.anInt4061 += 3;
		return ((this.aByteArray49[this.anInt4061 - 3] & 0xFF) << 16) + (this.aByteArray49[this.anInt4061 - 2] << 8 & 0xFF00) + (this.aByteArray49[this.anInt4061 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(II)V")
	public final void method3050(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt4061++] = (byte) arg0;
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt4061++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(II)J")
	public final long method3051(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local11 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray49[this.anInt4061++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "(I)I")
	public final int method3052() {
		this.anInt4061 += 4;
		return ((this.aByteArray49[this.anInt4061 - 3] & 0xFF) << 8) + (this.aByteArray49[this.anInt4061 - 2] << 16 & 0xFF0000) + ((this.aByteArray49[this.anInt4061 + -1] & 0xFF) << 24) + (this.aByteArray49[this.anInt4061 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(B)I")
	public final int method3053() {
		return -this.aByteArray49[this.anInt4061++] & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(B)I")
	public final int method3054() {
		this.anInt4061 += 4;
		return (this.aByteArray49[this.anInt4061 - 3] & 0xFF) + ((this.aByteArray49[this.anInt4061 - 4] & 0xFF) << 8) + ((this.aByteArray49[this.anInt4061 + -2] & 0xFF) << 24) + ((this.aByteArray49[this.anInt4061 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "(I)B")
	public final byte method3055() {
		return (byte) (this.aByteArray49[this.anInt4061++] - 128);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIBI)V")
	public final void method3056(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(19) int local19 = arg1 - 1; local19 >= 0; local19--) {
			arg0[local19] = this.aByteArray49[this.anInt4061++];
		}
	}

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "(B)J")
	public final long method3057() {
		@Pc(12) long local12 = (long) this.method3058() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method3058() & 0xFFFFFFFFL;
		return (local12 << 32) + local26;
	}

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)I")
	public final int method3058() {
		this.anInt4061 += 4;
		return ((this.aByteArray49[this.anInt4061 - 4] & 0xFF) << 24) + (((this.aByteArray49[this.anInt4061 - 3] & 0xFF) << 16) - (-(this.aByteArray49[this.anInt4061 - 2] << 8 & 0xFF00) - (this.aByteArray49[this.anInt4061 - 1] & 0xFF)));
	}

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "(I)I")
	public final int method3059() {
		this.anInt4061 += 3;
		return ((this.aByteArray49[this.anInt4061 - 3] & 0xFF) << 8) + ((this.aByteArray49[this.anInt4061 - 2] & 0xFF) << 16) + (this.aByteArray49[this.anInt4061 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(II)V")
	public final void method3060(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt4061 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt4061 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt4061 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt4061 - arg0 - 1] = (byte) arg0;
	}
}
