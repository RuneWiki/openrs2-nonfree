import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
	public int anInt3368;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7(@OriginalArg(0) int arg0) {
		this.anInt3368 = 0;
		this.aByteArray58 = Static190.method3669(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray58 = arg0;
		this.anInt3368 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public final void method3089(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)I")
	public final int method3090() {
		this.anInt3368 += 2;
		@Pc(31) int local31 = (this.aByteArray58[this.anInt3368 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3368 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
	public final void method3091(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt3368 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt3368 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3368 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method3092(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt3368;
		this.anInt3368 = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method3139(local19, local13);
		@Pc(32) BigInteger local32 = new BigInteger(local19);
		@Pc(37) BigInteger local37 = local32.modPow(arg0, arg1);
		@Pc(40) byte[] local40 = local37.toByteArray();
		this.anInt3368 = 0;
		this.method3108(local40.length);
		this.method3146(local40, local40.length);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)B")
	public final byte method3093() {
		return (byte) -this.aByteArray58[this.anInt3368++];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)I")
	public final int method3094() {
		return 128 - this.aByteArray58[this.anInt3368++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method3095() {
		@Pc(14) byte local14 = this.aByteArray58[this.anInt3368++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt3368;
		while (this.aByteArray58[this.anInt3368++] != 0) {
		}
		@Pc(50) int local50 = this.anInt3368 - local27 - 1;
		return local50 == 0 ? "" : Static40.method4023(local27, local50, this.aByteArray58);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V")
	public final void method3096(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)I")
	public final int method3097(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static324.method5447(this.anInt3368, arg0, this.aByteArray58);
		this.method3098(local11);
		return local11;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(II)V")
	public final void method3098(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)I")
	public final int method3099() {
		this.anInt3368 += 4;
		return (this.aByteArray58[this.anInt3368 - 3] & 0xFF) + (((this.aByteArray58[this.anInt3368 - 2] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3368 - 1] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3368 + -4] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
	public final int method3100() {
		return -this.aByteArray58[this.anInt3368++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)I")
	public final int method3101() {
		this.anInt3368 += 2;
		return ((this.aByteArray58[this.anInt3368 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3368 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(II)V")
	public final void method3102(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(II)V")
	public final void method3103(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(II)V")
	public final void method3104(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
	public final void method3105(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[B)V")
	public final void method3106(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = arg0 - 1; local12 >= 0; local12--) {
			arg1[local12] = (byte) (this.aByteArray58[this.anInt3368++] - 128);
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)J")
	public final long method3107(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 - 1;
		if (local12 < 0 || local12 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(25) int local25 = local12 * 8;
		@Pc(27) long local27 = 0L;
		while (local25 >= 0) {
			local27 |= ((long) this.aByteArray58[this.anInt3368++] & 0xFFL) << local25;
			local25 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(II)V")
	public final void method3108(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)J")
	public final long method3109() {
		@Pc(17) long local17 = (long) this.method3125() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method3125() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)I")
	public final int method3110() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = this.method3145();
		while (local16 == 32767) {
			local16 = this.method3145();
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)V")
	public final void method3111(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt3368 / 8;
		this.anInt3368 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10; local23++) {
			@Pc(29) int local29 = this.method3125();
			@Pc(33) int local33 = this.method3125();
			@Pc(35) int local35 = 0;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local29 += arg0[local35 & 0x3] + local35 ^ (local33 << 4 ^ local33 >>> 5) + local33;
				local35 += -1640531527;
				local33 += (local29 << 4 ^ local29 >>> 5) + local29 ^ local35 - -arg0[local35 >>> 11 & 0xE0600003];
			}
			this.anInt3368 -= 8;
			this.method3098(local29);
			this.method3098(local33);
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(B)I")
	public final int method3112() {
		return this.aByteArray58[this.anInt3368++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)I")
	public final int method3113() {
		@Pc(24) byte local24 = this.aByteArray58[this.anInt3368++];
		@Pc(26) int local26 = 0;
		while (local24 < 0) {
			local26 = (local26 | local24 & 0x7F) << 7;
			local24 = this.aByteArray58[this.anInt3368++];
		}
		return local26 | local24;
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method3114() {
		if (this.aByteArray58[this.anInt3368] == 0) {
			this.anInt3368++;
			return null;
		} else {
			return this.method3134();
		}
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(B)I")
	public final int method3115() {
		this.anInt3368 += 2;
		return ((this.aByteArray58[this.anInt3368 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3368 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(IB)V")
	public final void method3116(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(II)V")
	public final void method3117(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(B)I")
	public final int method3118() {
		this.anInt3368 += 2;
		@Pc(38) int local38 = (this.aByteArray58[this.anInt3368 - 2] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3368 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(II)V")
	public final void method3119(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)B")
	public final byte method3120() {
		return (byte) (this.aByteArray58[this.anInt3368++] - 128);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(JZ)V")
	public final void method3121(@OriginalArg(0) long arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 56);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 48);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 40);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 32);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 24);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 16);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB[I)V")
	public final void method3122(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt3368;
		this.anInt3368 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(34) int local34 = this.method3125();
			@Pc(38) int local38 = this.method3125();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= arg1[local40 >>> 11 & 0x90800003] + local40 ^ local34 + (local34 >>> 5 ^ local34 << 4);
				local40 -= -1640531527;
				local34 -= local38 + (local38 >>> 5 ^ local38 << 4) ^ local40 - -arg1[local40 & 0x3];
			}
			this.anInt3368 -= 8;
			this.method3098(local34);
			this.method3098(local38);
		}
		this.anInt3368 = local8;
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(B)I")
	public final int method3123() {
		this.anInt3368 += 2;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3368 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3368 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method3124(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt3368 += Static34.method904(this.anInt3368, this.aByteArray58, arg0.length(), arg0);
		this.aByteArray58[this.anInt3368++] = 0;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(B)I")
	public final int method3125() {
		this.anInt3368 += 4;
		return (this.aByteArray58[this.anInt3368 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3368 - 2] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3368 + -3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3368 + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(II)V")
	public final void method3126(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3108(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3128(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(I)I")
	public final int method3127() {
		this.anInt3368 += 4;
		return (this.aByteArray58[this.anInt3368 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3368 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3368 + -1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3368 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(II)V")
	public final void method3128(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJI)V")
	public final void method3129(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local11 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> local29);
		}
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(I)B")
	public final byte method3130() {
		return this.aByteArray58[this.anInt3368++];
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(IB)V")
	public final void method3132(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3108(arg0 >>> 28 | 0x80);
					}
					this.method3108(arg0 >>> 21 | 0x80);
				}
				this.method3108(arg0 >>> 14 | 0x80);
			}
			this.method3108(arg0 >>> 7 | 0x80);
		}
		this.method3108(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[BBI)V")
	public final void method3133(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			arg1[local10] = (byte) (this.aByteArray58[this.anInt3368++] - 128);
		}
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(I)Ljava/lang/String;")
	public final String method3134() {
		@Pc(6) int local6 = this.anInt3368;
		while (this.aByteArray58[this.anInt3368++] != 0) {
		}
		@Pc(25) int local25 = this.anInt3368 - local6 - 1;
		return local25 == 0 ? "" : Static40.method4023(local6, local25, this.aByteArray58);
	}

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "(B)I")
	public final int method3135() {
		@Pc(19) int local19 = this.aByteArray58[this.anInt3368] & 0xFF;
		return local19 >= 128 ? this.method3115() - 49152 : this.method3141() + -64;
	}

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "(I)I")
	public final int method3137() {
		this.anInt3368 += 3;
		return ((this.aByteArray58[this.anInt3368 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3368 - 3] << 16 & 0xFF0000) + (this.aByteArray58[this.anInt3368 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "(II)V")
	public final void method3138(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIII)V")
	public final void method3139(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray58[this.anInt3368++];
		}
	}

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "(II)V")
	public final void method3140(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) arg0;
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "(I)I")
	public final int method3141() {
		return this.aByteArray58[this.anInt3368++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(II)V")
	public final void method3142(@OriginalArg(0) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 + 128);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "(B)B")
	public final byte method3143() {
		return (byte) (128 - this.aByteArray58[this.anInt3368++]);
	}

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "(B)I")
	public final int method3144() {
		this.anInt3368 += 2;
		return (this.aByteArray58[this.anInt3368 - 1] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3368 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(I)I")
	public final int method3145() {
		@Pc(11) int local11 = this.aByteArray58[this.anInt3368] & 0xFF;
		return local11 >= 128 ? this.method3115() - 32768 : this.method3141();
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "([BIII)V")
	public final void method3146(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			this.aByteArray58[this.anInt3368++] = arg0[local9];
		}
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(B)I")
	public final int method3147() {
		this.anInt3368 += 2;
		return ((this.aByteArray58[this.anInt3368 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3368 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(I)Z")
	public final boolean method3148() {
		this.anInt3368 -= 4;
		@Pc(22) int local22 = Static324.method5447(this.anInt3368, 0, this.aByteArray58);
		@Pc(26) int local26 = this.method3125();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(B)I")
	public final int method3149() {
		this.anInt3368 += 4;
		return ((this.aByteArray58[this.anInt3368 - 4] & 0xFF) << 16) + (this.aByteArray58[this.anInt3368 - 3] << 24 & 0xFF000000) + ((this.aByteArray58[this.anInt3368 + -1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3368 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(II)V")
	public final void method3150(@OriginalArg(1) int arg0) {
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3368++] = (byte) (arg0 + 128);
	}
}
