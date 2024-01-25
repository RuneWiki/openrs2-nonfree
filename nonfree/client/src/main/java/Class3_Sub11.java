import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!qh", name = "jb", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!qh", name = "fb", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11(@OriginalArg(0) int arg0) {
		this.aByteArray36 = Static297.method4710(arg0);
		this.anInt3520 = 0;
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V")
	public Class3_Sub11(@OriginalArg(0) byte[] arg0) {
		this.anInt3520 = 0;
		this.aByteArray36 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public final void method3072(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt3520 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt3520 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt3520 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)I")
	public final int method3073(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static578.method7668(this.aByteArray36, this.anInt3520, arg0);
		this.method3101(local18);
		return local18;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
	public final int method3074() {
		this.anInt3520 += 4;
		return ((this.aByteArray36[this.anInt3520 - 1] & 0xFF) << 8) + ((this.aByteArray36[this.anInt3520 - 3] & 0xFF) << 24) + ((this.aByteArray36[this.anInt3520 + -4] & 0xFF) << 16) + (this.aByteArray36[this.anInt3520 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
	public final void method3075(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)I")
	public final int method3076() {
		this.anInt3520 += 4;
		return ((this.aByteArray36[this.anInt3520 - 2] & 0xFF) << 24) - (-(this.aByteArray36[this.anInt3520 - 1] << 16 & 0xFF0000) - (this.aByteArray36[this.anInt3520 - 4] << 8 & 0xFF00) - (this.aByteArray36[this.anInt3520 + -3] & 0xFF));
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)V")
	public final void method3077(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)B")
	public final byte method3078() {
		return (byte) (this.aByteArray36[this.anInt3520++] - 128);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(BI)V")
	public final void method3079(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)Z")
	public final boolean method3080() {
		this.anInt3520 -= 4;
		@Pc(22) int local22 = Static578.method7668(this.aByteArray36, this.anInt3520, 0);
		@Pc(26) int local26 = this.method3116();
		return local22 == local26;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method3081(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = Static547.method7324(arg0);
		this.aByteArray36[this.anInt3520++] = 0;
		this.method3104(local12);
		this.anInt3520 += Static458.method6373(this.aByteArray36, this.anInt3520, arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[III)V")
	public final void method3082(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt3520;
		this.anInt3520 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method3116();
			@Pc(30) int local30 = this.method3116();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= (local26 >>> 5 ^ local26 << 4) + local26 ^ arg0[local32 >>> 11 & 0x65400003] + local32;
				local32 -= -1640531527;
				local26 -= local30 + (local30 << 4 ^ local30 >>> 5) ^ arg0[local32 & 0x3] + local32;
			}
			this.anInt3520 -= 8;
			this.method3101(local26);
			this.method3101(local30);
		}
		this.anInt3520 = local8;
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
	public final void method3083() {
		if (this.aByteArray36 != null) {
			Static297.method4711(this.aByteArray36);
		}
		this.aByteArray36 = null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III[B)V")
	public final void method3084(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray36[this.anInt3520++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)I")
	public final int method3085() {
		@Pc(11) int local11 = this.aByteArray36[this.anInt3520] & 0xFF;
		return local11 < 128 ? this.method3118() - 64 : this.method3109() + -49152;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIJ)V")
	public final void method3086(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(32) int local32 = local2 * 8; local32 >= 0; local32 -= 8) {
			this.aByteArray36[this.anInt3520++] = (byte) (arg1 >> local32);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
	public final void method3087(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)I")
	public final int method3088() {
		@Pc(21) byte local21 = this.aByteArray36[this.anInt3520++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray36[this.anInt3520++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)I")
	public final int method3089() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method3138();
		while (local16 == 32767) {
			local16 = this.method3138();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[BI)V")
	public final void method3090(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			arg1[local12] = this.aByteArray36[this.anInt3520++];
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)I")
	public final int method3091() {
		@Pc(11) int local11 = Static578.method7668(this.aByteArray36, this.anInt3520, 0);
		this.method3101(local11);
		return local11;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
	public final void method3092(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(IB)V")
	public final void method3093(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)V")
	public final void method3095(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)B")
	public final byte method3096() {
		return this.aByteArray36[this.anInt3520++];
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)I")
	public final int method3097() {
		this.anInt3520 += 2;
		@Pc(34) int local34 = ((this.aByteArray36[this.anInt3520 - 2] & 0xFF) << 8) + (this.aByteArray36[this.anInt3520 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(II)V")
	public final void method3098(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "(I)I")
	public final int method3099() {
		return -this.aByteArray36[this.anInt3520++] & 0xFF;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(ZI)V")
	public final void method3100(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(II)V")
	public final void method3101(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(II)V")
	public final void method3102(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(II)V")
	public final void method3103(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(II)V")
	public final void method3104(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3079(arg0 >>> 28 | 0x80);
					}
					this.method3079(arg0 >>> 21 | 0x80);
				}
				this.method3079(arg0 >>> 14 | 0x80);
			}
			this.method3079(arg0 >>> 7 | 0x80);
		}
		this.method3079(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(B)I")
	public final int method3105() {
		this.anInt3520 += 4;
		return ((this.aByteArray36[this.anInt3520 - 3] & 0xFF) << 8) + ((this.aByteArray36[this.anInt3520 - 2] & 0xFF) << 16) + ((this.aByteArray36[this.anInt3520 + -1] & 0xFF) << 24) + (this.aByteArray36[this.anInt3520 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method3106() {
		@Pc(14) byte local14 = this.aByteArray36[this.anInt3520++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(28) int local28 = this.method3088();
		if (this.aByteArray36.length < local28 + this.anInt3520) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static152.method2796(this.anInt3520, this.aByteArray36, local28);
		this.anInt3520 += local28;
		return local55;
	}

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "(I)I")
	public final int method3107() {
		this.anInt3520 += 2;
		@Pc(38) int local38 = (this.aByteArray36[this.anInt3520 - 1] & 0xFF) + ((this.aByteArray36[this.anInt3520 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "(I)I")
	public final int method3108() {
		this.anInt3520 += 2;
		@Pc(31) int local31 = ((this.aByteArray36[this.anInt3520 - 1] & 0xFF) << 8) + (this.aByteArray36[this.anInt3520 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(B)I")
	public final int method3109() {
		this.anInt3520 += 2;
		return ((this.aByteArray36[this.anInt3520 - 2] & 0xFF) << 8) + (this.aByteArray36[this.anInt3520 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "(I)I")
	public final int method3110() {
		return 128 - this.aByteArray36[this.anInt3520++] & 0xFF;
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(II)V")
	public final void method3111(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(III[B)V")
	public final void method3112(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = arg0 - 1; local11 >= 0; local11--) {
			arg1[local11] = this.aByteArray36[this.anInt3520++];
		}
	}

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "(I)I")
	public final int method3113() {
		this.anInt3520 += 4;
		return (this.aByteArray36[this.anInt3520 - 4] & 0xFF) + ((this.aByteArray36[this.anInt3520 - 3] & 0xFF) << 8) + ((this.aByteArray36[this.anInt3520 + -1] & 0xFF) << 24) + ((this.aByteArray36[this.anInt3520 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "(II)J")
	public final long method3114(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(28) int local28 = local6 * 8;
		@Pc(30) long local30 = 0L;
		while (local28 >= 0) {
			local30 |= ((long) this.aByteArray36[this.anInt3520++] & 0xFFL) << local28;
			local28 -= 8;
		}
		return local30;
	}

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(B)I")
	public final int method3115() {
		this.anInt3520 += 2;
		return ((this.aByteArray36[this.anInt3520 - 1] & 0xFF) << 8) + (this.aByteArray36[this.anInt3520 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "(I)I")
	public final int method3116() {
		this.anInt3520 += 4;
		return ((this.aByteArray36[this.anInt3520 - 3] & 0xFF) << 16) + (((this.aByteArray36[this.anInt3520 - 4] & 0xFF) << 24) + (this.aByteArray36[this.anInt3520 - 2] << 8 & 0xFF00)) + (this.aByteArray36[this.anInt3520 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "(I)I")
	public final int method3117() {
		this.anInt3520 += 2;
		return ((this.aByteArray36[this.anInt3520 - 1] & 0xFF) << 8) + (this.aByteArray36[this.anInt3520 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "(I)I")
	public final int method3118() {
		return this.aByteArray36[this.anInt3520++] & 0xFF;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method3119(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3520;
		this.anInt3520 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3090(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local28.toByteArray();
		this.anInt3520 = 0;
		this.method3131(local35.length);
		this.method3084(local35.length, local35);
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(B)I")
	public final int method3120() {
		return this.aByteArray36[this.anInt3520++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "(I)B")
	public final byte method3121() {
		return (byte) -this.aByteArray36[this.anInt3520++];
	}

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "(B)Ljava/lang/String;")
	public final String method3122() {
		if (this.aByteArray36[this.anInt3520] == 0) {
			this.anInt3520++;
			return null;
		} else {
			return this.method3133();
		}
	}

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "(I)B")
	public final byte method3123() {
		return (byte) (128 - this.aByteArray36[this.anInt3520++]);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IJ)V")
	public final void method3124(@OriginalArg(1) long arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 56);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 48);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 40);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 32);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 24);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 16);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "(I)Ljava/lang/String;")
	public final String method3125() {
		@Pc(20) byte local20 = this.aByteArray36[this.anInt3520++];
		if (local20 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(33) int local33 = this.anInt3520;
		while (this.aByteArray36[this.anInt3520++] != 0) {
		}
		@Pc(55) int local55 = this.anInt3520 - local33 - 1;
		return local55 == 0 ? "" : Static331.method5118(local33, this.aByteArray36, local55);
	}

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "(B)I")
	public final int method3126() {
		this.anInt3520 += 3;
		return (this.aByteArray36[this.anInt3520 - 1] & 0xFF) + (((this.aByteArray36[this.anInt3520 - 3] & 0xFF) << 16) + ((this.aByteArray36[this.anInt3520 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "(II)V")
	public final void method3127(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt3520 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "(I)J")
	public final long method3128() {
		@Pc(12) long local12 = (long) this.method3116() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method3116() & 0xFFFFFFFFL;
		return (local12 << 32) + local24;
	}

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "(I)I")
	public final int method3129() {
		this.anInt3520 += 3;
		return (this.aByteArray36[this.anInt3520 - 2] & 0xFF) + ((this.aByteArray36[this.anInt3520 - 1] & 0xFF) << 8) + ((this.aByteArray36[this.anInt3520 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(BI)V")
	public final void method3130(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "(II)V")
	public final void method3131(@OriginalArg(0) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
		this.aByteArray36[this.anInt3520++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "(II)V")
	public final void method3132(@OriginalArg(1) int arg0) {
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 + 128);
		this.aByteArray36[this.anInt3520++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "(I)Ljava/lang/String;")
	public final String method3133() {
		@Pc(6) int local6 = this.anInt3520;
		while (this.aByteArray36[this.anInt3520++] != 0) {
		}
		@Pc(25) int local25 = this.anInt3520 - local6 - 1;
		return local25 == 0 ? "" : Static331.method5118(local6, this.aByteArray36, local25);
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(BI)V")
	public final void method3134(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3079(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3131(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(ILjava/lang/String;)V")
	public final void method3136(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt3520 += Static500.method6740(this.anInt3520, this.aByteArray36, arg0, arg0.length());
		this.aByteArray36[this.anInt3520++] = 0;
	}

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "(I)I")
	public final int method3137() {
		this.anInt3520 += 3;
		@Pc(44) int local44 = (this.aByteArray36[this.anInt3520 - 1] & 0xFF) + (((this.aByteArray36[this.anInt3520 - 3] & 0xFF) << 16) + ((this.aByteArray36[this.anInt3520 - 2] & 0xFF) << 8));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "(I)I")
	public final int method3138() {
		@Pc(11) int local11 = this.aByteArray36[this.anInt3520] & 0xFF;
		return local11 < 128 ? this.method3118() : this.method3109() - 32768;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(Z)I")
	public final int method3139() {
		this.anInt3520 += 2;
		return (this.aByteArray36[this.anInt3520 - 1] - 128 & 0xFF) + ((this.aByteArray36[this.anInt3520 - 2] & 0xFF) << 8);
	}
}
