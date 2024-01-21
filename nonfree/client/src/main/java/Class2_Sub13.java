import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!ja", name = "yb", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
	public int anInt3940;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13(@OriginalArg(0) int arg0) {
		this.aByteArray49 = Static141.method2340(arg0);
		this.anInt3940 = 0;
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([B)V")
	public Class2_Sub13(@OriginalArg(0) byte[] arg0) {
		this.anInt3940 = 0;
		this.aByteArray49 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
	public final void method2913(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt3940++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
	public final int method2914() {
		@Pc(11) int local11 = this.aByteArray49[this.anInt3940] & 0xFF;
		return local11 >= 128 ? this.method2933() - 49152 : this.method2962() + -64;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
	public final void method2916(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)I")
	public final int method2917() {
		this.anInt3940 += 2;
		return ((this.aByteArray49[this.anInt3940 - 2] & 0xFF) << 8) + (this.aByteArray49[this.anInt3940 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)V")
	public final void method2918(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt3940++] = (byte) arg0;
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)I")
	public final int method2919() {
		@Pc(21) byte local21 = this.aByteArray49[this.anInt3940++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray49[this.anInt3940++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)V")
	public final void method2920(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) arg0;
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)V")
	public final void method2921(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt3940++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)B")
	public final byte method2922() {
		return (byte) -this.aByteArray49[this.anInt3940++];
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)I")
	public final int method2923() {
		this.anInt3940 += 2;
		@Pc(36) int local36 = (this.aByteArray49[this.anInt3940 - 2] & 0xFF) + ((this.aByteArray49[this.anInt3940 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)I")
	public final int method2924() {
		@Pc(11) int local11 = this.aByteArray49[this.anInt3940] & 0xFF;
		return local11 >= 128 ? this.method2933() - 32768 : this.method2962();
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)I")
	public final int method2925() {
		this.anInt3940 += 4;
		return (this.aByteArray49[this.anInt3940 - 2] & 0xFF) + ((this.aByteArray49[this.anInt3940 - 1] & 0xFF) << 8) + ((this.aByteArray49[this.anInt3940 + -4] & 0xFF) << 16) + ((this.aByteArray49[this.anInt3940 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)Lclient!lf;")
	public final Class49 method2926() {
		@Pc(7) int local7 = this.anInt3940;
		while (this.aByteArray49[this.anInt3940++] != 0) {
		}
		return Static182.method3026(this.aByteArray49, this.anInt3940 - local7 - 1, local7);
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(II)V")
	public final void method2929(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt3940 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)I")
	public final int method2930() {
		this.anInt3940 += 3;
		return ((this.aByteArray49[this.anInt3940 - 3] & 0xFF) << 16) + ((this.aByteArray49[this.anInt3940 - 1] & 0xFF) << 8) + (this.aByteArray49[this.anInt3940 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[BZ)V")
	public final void method2931(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray49[this.anInt3940++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(II)V")
	public final void method2932(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)I")
	public final int method2933() {
		this.anInt3940 += 2;
		return (this.aByteArray49[this.anInt3940 - 1] & 0xFF) + ((this.aByteArray49[this.anInt3940 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method2934(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt3940;
		this.anInt3940 = 0;
		@Pc(12) byte[] local12 = new byte[local2];
		this.method2947(local12, local2);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt3940 = 0;
		this.method2932(local31.length);
		this.method2931(local31.length, local31);
	}

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "(I)B")
	public final byte method2935() {
		return (byte) (128 - this.aByteArray49[this.anInt3940++]);
	}

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "(I)J")
	public final long method2936() {
		@Pc(15) long local15 = (long) this.method2946() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method2946() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "(I)I")
	public final int method2937() {
		return 128 - this.aByteArray49[this.anInt3940++] & 0xFF;
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(II)V")
	public final void method2938(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) arg0;
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "(I)I")
	public final int method2939() {
		this.anInt3940 += 2;
		return ((this.aByteArray49[this.anInt3940 - 1] & 0xFF) << 8) + (this.aByteArray49[this.anInt3940 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B[III)V")
	public final void method2940(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt3940;
		this.anInt3940 = 5;
		@Pc(25) int local25 = (arg1 - 5) / 8;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = this.method2946();
			@Pc(37) int local37 = 32;
			@Pc(41) int local41 = this.method2946();
			@Pc(43) int local43 = -957401312;
			while (local37-- > 0) {
				local41 -= local43 + arg0[local43 >>> 11 & 0x7000003] ^ (local33 << 4 ^ local33 >>> 5) - -local33;
				local43 -= -1640531527;
				local33 -= local43 + arg0[local43 & 0x3] ^ (local41 << 4 ^ local41 >>> 5) - -local41;
			}
			this.anInt3940 -= 8;
			this.method2952(local33);
			this.method2952(local41);
		}
		this.anInt3940 = local8;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)I")
	public final int method2941() {
		this.anInt3940 += 2;
		@Pc(31) int local31 = (this.aByteArray49[this.anInt3940 - 1] & 0xFF) + ((this.aByteArray49[this.anInt3940 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(B)I")
	public final int method2942() {
		this.anInt3940 += 3;
		return (this.aByteArray49[this.anInt3940 - 1] & 0xFF) + ((this.aByteArray49[this.anInt3940 - 3] & 0xFF) << 16) + ((this.aByteArray49[this.anInt3940 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(B)I")
	public final int method2943() {
		this.anInt3940 += 4;
		return (this.aByteArray49[this.anInt3940 - 3] & 0xFF) + ((this.aByteArray49[this.anInt3940 - 4] & 0xFF) << 8) + ((this.aByteArray49[this.anInt3940 - 2] & 0xFF) << 24) + ((this.aByteArray49[this.anInt3940 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(Z)I")
	public final int method2944() {
		this.anInt3940 += 4;
		return (this.aByteArray49[this.anInt3940 - 4] & 0xFF) + (((this.aByteArray49[this.anInt3940 - 3] & 0xFF) << 8) + ((this.aByteArray49[this.anInt3940 - 1] & 0xFF) << 24) + ((this.aByteArray49[this.anInt3940 + -2] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(II)V")
	public final void method2945(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method2932(arg0 >>> 28 | 0x80);
					}
					this.method2932(arg0 >>> 21 | 0x80);
				}
				this.method2932(arg0 >>> 14 | 0x80);
			}
			this.method2932(arg0 >>> 7 | 0x80);
		}
		this.method2932(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "(I)I")
	public final int method2946() {
		this.anInt3940 += 4;
		return (this.aByteArray49[this.anInt3940 - 1] & 0xFF) + ((this.aByteArray49[this.anInt3940 - 4] & 0xFF) << 24) + ((this.aByteArray49[this.anInt3940 - 3] & 0xFF) << 16) + ((this.aByteArray49[this.anInt3940 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([BIII)V")
	public final void method2947(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray49[this.anInt3940++];
		}
	}

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "(I)B")
	public final byte method2948() {
		return this.aByteArray49[this.anInt3940++];
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!lf;B)V")
	public final void method2949(@OriginalArg(0) Class49 arg0) {
		this.anInt3940 += arg0.method1657(this.anInt3940, this.aByteArray49, arg0.method1653());
		this.aByteArray49[this.anInt3940++] = 0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V")
	public final void method2950(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method2932(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method2921(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
	public final void method2951(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(BI)V")
	public final void method2952(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt3940++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[B)V")
	public final void method2953(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = (byte) (this.aByteArray49[this.anInt3940++] - 128);
		}
	}

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "(I)I")
	public final int method2954() {
		return -this.aByteArray49[this.anInt3940++] & 0xFF;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[B)V")
	public final void method2955(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray49[this.anInt3940++] - 128);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(JI)V")
	public final void method2956(@OriginalArg(0) long arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 56);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 48);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 40);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 32);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt3940++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "(I)I")
	public final int method2957() {
		return this.aByteArray49[this.anInt3940++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "(I)I")
	public final int method2958() {
		this.anInt3940 += 2;
		return (this.aByteArray49[this.anInt3940 - 2] & 0xFF) + ((this.aByteArray49[this.anInt3940 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "(B)I")
	public final int method2959() {
		@Pc(9) int local9 = this.method2924();
		@Pc(19) int local19 = 0;
		while (local9 == 32767) {
			local9 = this.method2924();
			local19 += 32767;
		}
		return local19 + local9;
	}

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "(B)Lclient!lf;")
	public final Class49 method2960() {
		if (this.aByteArray49[this.anInt3940] == 0) {
			this.anInt3940++;
			return null;
		} else {
			return this.method2926();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZJ)V")
	public final void method2961(@OriginalArg(1) long arg0) {
		this.method2920((int) (arg0 >> 32));
		this.method2920((int) arg0);
	}

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "(B)I")
	public final int method2962() {
		return this.aByteArray49[this.anInt3940++] & 0xFF;
	}

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "(B)I")
	public final int method2963() {
		this.anInt3940 += 2;
		@Pc(41) int local41 = ((this.aByteArray49[this.anInt3940 - 2] & 0xFF) << 8) + (this.aByteArray49[this.anInt3940 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "(II)V")
	public final void method2964(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 + 128);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "(II)I")
	public final int method2966(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static177.method2900(this.aByteArray49, this.anInt3940, arg0);
		this.method2952(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(IZ)V")
	public final void method2967(@OriginalArg(0) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(BI)V")
	public final void method2968(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt3940++] = (byte) arg0;
		this.aByteArray49[this.anInt3940++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(BI)V")
	public final void method2969(@OriginalArg(1) int arg0) {
		this.aByteArray49[this.anInt3940 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray49[this.anInt3940 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray49[this.anInt3940 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray49[this.anInt3940 - arg0 - 1] = (byte) arg0;
	}
}
