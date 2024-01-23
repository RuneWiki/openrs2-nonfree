import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!pi", name = "jb", descriptor = "I")
	public int anInt3822 = 0;

	@OriginalMember(owner = "client!pi", name = "Y", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I)V")
	public Class4_Sub24(@OriginalArg(0) int arg0) {
		this.aByteArray47 = Static75.method1268(arg0);
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "([B)V")
	public Class4_Sub24(@OriginalArg(0) byte[] arg0) {
		this.aByteArray47 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
	public final int method3058() {
		this.anInt3822 += 2;
		@Pc(31) int local31 = ((this.aByteArray47[this.anInt3822 - 1] & 0xFF) << 8) + (this.aByteArray47[this.anInt3822 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method3059() {
		@Pc(14) byte local14 = this.aByteArray47[this.anInt3822++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(31) int local31 = this.anInt3822;
		while (this.aByteArray47[this.anInt3822++] != 0) {
		}
		return Static25.method561(local31, this.aByteArray47, this.anInt3822 - local31 - 1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)I")
	public final int method3060() {
		@Pc(19) int local19 = this.aByteArray47[this.anInt3822] & 0xFF;
		return local19 < 128 ? this.method3110() : this.method3085() - 32768;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public final void method3062(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)I")
	public final int method3063() {
		this.anInt3822 += 3;
		return (this.aByteArray47[this.anInt3822 - 1] & 0xFF) + (((this.aByteArray47[this.anInt3822 - 3] & 0xFF) << 16) + ((this.aByteArray47[this.anInt3822 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
	public final void method3064(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 + 128);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V")
	public final void method3065(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)V")
	public final void method3066(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)I")
	public final int method3067() {
		@Pc(25) int local25 = this.aByteArray47[this.anInt3822] & 0xFF;
		return local25 < 128 ? this.method3110() - 64 : this.method3085() + -49152;
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)I")
	public final int method3068() {
		this.anInt3822 += 2;
		@Pc(33) int local33 = (this.aByteArray47[this.anInt3822 - 1] - 128 & 0xFF) + ((this.aByteArray47[this.anInt3822 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)B")
	public final byte method3069() {
		return this.aByteArray47[this.anInt3822++];
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
	public final void method3070(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(II)J")
	public final long method3071(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = local6 * 8;
		@Pc(27) long local27 = 0L;
		while (local20 >= 0) {
			local27 |= ((long) this.aByteArray47[this.anInt3822++] & 0xFFL) << local20;
			local20 -= 8;
		}
		return local27;
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)I")
	public final int method3072() {
		this.anInt3822 += 2;
		@Pc(39) int local39 = (this.aByteArray47[this.anInt3822 - 1] & 0xFF) + ((this.aByteArray47[this.anInt3822 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(JI)V")
	public final void method3073(@OriginalArg(0) long arg0) {
		this.method3070((int) (arg0 >> 32));
		this.method3070((int) arg0);
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)I")
	public final int method3074() {
		this.anInt3822 += 2;
		return ((this.aByteArray47[this.anInt3822 - 2] & 0xFF) << 8) + (this.aByteArray47[this.anInt3822 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method3075() {
		if (this.aByteArray47[this.anInt3822] == 0) {
			this.anInt3822++;
			return null;
		} else {
			return this.method3111();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method3076(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt3822;
		@Pc(9) byte[] local9 = new byte[local2];
		this.anInt3822 = 0;
		this.method3088(local2, local9);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt3822 = 0;
		this.method3116(local31.length);
		this.method3091(local31.length, local31);
	}

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "(I)I")
	public final int method3077() {
		@Pc(9) int local9 = 0;
		@Pc(24) byte local24;
		for (local24 = this.aByteArray47[this.anInt3822++]; local24 < 0; local24 = this.aByteArray47[this.anInt3822++]) {
			local9 = (local9 | local24 & 0x7F) << 7;
		}
		return local24 | local9;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IB)I")
	public final int method3078(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static299.method4597(this.anInt3822, arg0, this.aByteArray47);
		this.method3066(local17);
		return local17;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(JI)V")
	public final void method3079(@OriginalArg(0) long arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 56);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 48);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 40);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 32);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V")
	public final void method3080(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BIJ)V")
	public final void method3081(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local6 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray47[this.anInt3822++] = (byte) (arg1 >> local29);
		}
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(II)V")
	public final void method3082(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)I")
	public final int method3084() {
		this.anInt3822 += 4;
		return (this.aByteArray47[this.anInt3822 - 1] & 0xFF) + (((this.aByteArray47[this.anInt3822 - 4] & 0xFF) << 24) + ((this.aByteArray47[this.anInt3822 - 3] & 0xFF) << 16) + ((this.aByteArray47[this.anInt3822 + -2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(B)I")
	public final int method3085() {
		this.anInt3822 += 2;
		return ((this.aByteArray47[this.anInt3822 - 2] & 0xFF) << 8) + (this.aByteArray47[this.anInt3822 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "(I)I")
	public final int method3086() {
		this.anInt3822 += 4;
		return (this.aByteArray47[this.anInt3822 - 3] & 0xFF) + ((this.aByteArray47[this.anInt3822 - 4] & 0xFF) << 8) + ((this.aByteArray47[this.anInt3822 - 1] & 0xFF) << 16) + ((this.aByteArray47[-2 + this.anInt3822] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(FI)V")
	public final void method3087(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Float.floatToRawIntBits(arg0);
		this.aByteArray47[this.anInt3822++] = (byte) local6;
		this.aByteArray47[this.anInt3822++] = (byte) (local6 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) (local6 >> 16);
		this.aByteArray47[this.anInt3822++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[BZ)V")
	public final void method3088(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			arg1[local8] = this.aByteArray47[this.anInt3822++];
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IZ)V")
	public final void method3089(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(IB)V")
	public final void method3090(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI[BI)V")
	public final void method3091(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray47[this.anInt3822++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(II)V")
	public final void method3092(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3116(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3105(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "(I)I")
	public final int method3093() {
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		for (local7 = this.method3060(); local7 == 32767; local7 = this.method3060()) {
			local3 += 32767;
		}
		return local3 + local7;
	}

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "(I)I")
	public final int method3094() {
		return -this.aByteArray47[this.anInt3822++] & 0xFF;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method3095(@OriginalArg(1) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local3 + " - cannot pjstr");
		}
		this.anInt3822 += Static43.method800(arg0, this.aByteArray47, this.anInt3822, arg0.length());
		this.aByteArray47[this.anInt3822++] = 0;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)I")
	public final int method3096() {
		this.anInt3822 += 2;
		return ((this.aByteArray47[this.anInt3822 - 1] & 0xFF) << 8) + (this.aByteArray47[this.anInt3822 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(II)V")
	public final void method3097(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I[BBI)V")
	public final void method3098(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (this.aByteArray47[this.anInt3822++] - 128);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(FB)V")
	public final void method3099(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = Float.floatToRawIntBits(arg0);
		this.aByteArray47[this.anInt3822++] = (byte) (local10 >> 24);
		this.aByteArray47[this.anInt3822++] = (byte) (local10 >> 16);
		this.aByteArray47[this.anInt3822++] = (byte) (local10 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) local10;
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(II)V")
	public final void method3100(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "(I)I")
	public final int method3101() {
		return 128 - this.aByteArray47[this.anInt3822++] & 0xFF;
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(IB)V")
	public final void method3103(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[B)V")
	public final void method3104(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(14) int local14 = arg0 - 1; local14 >= 0; local14--) {
			arg1[local14] = (byte) (this.aByteArray47[this.anInt3822++] - 128);
		}
	}

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "(II)V")
	public final void method3105(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI[II)V")
	public final void method3106(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int local4 = this.anInt3822;
		@Pc(15) int local15 = (arg1 - 5) / 8;
		this.anInt3822 = 5;
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			@Pc(34) int local34 = this.method3084();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = this.method3084();
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local40 -= local34 + (local34 >>> 5 ^ local34 << 4) ^ arg0[local36 >>> 11 & 0x3] + local36;
				local36 -= -1640531527;
				local34 -= local40 + (local40 << 4 ^ local40 >>> 5) ^ local36 - -arg0[local36 & 0x3];
			}
			this.anInt3822 -= 8;
			this.method3066(local34);
			this.method3066(local40);
		}
		this.anInt3822 = local4;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)B")
	public final byte method3107() {
		return (byte) -this.aByteArray47[this.anInt3822++];
	}

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "(I)I")
	public final int method3108() {
		this.anInt3822 += 2;
		return (this.aByteArray47[this.anInt3822 - 2] - 128 & 0xFF) + ((this.aByteArray47[this.anInt3822 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "(I)I")
	public final int method3109() {
		return this.aByteArray47[this.anInt3822++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "(I)I")
	public final int method3110() {
		return this.aByteArray47[this.anInt3822++] & 0xFF;
	}

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "(I)Ljava/lang/String;")
	public final String method3111() {
		@Pc(6) int local6 = this.anInt3822;
		while (this.aByteArray47[this.anInt3822++] != 0) {
		}
		return Static25.method561(local6, this.aByteArray47, this.anInt3822 - local6 - 1);
	}

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "(II)V")
	public final void method3112(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(B)J")
	public final long method3113() {
		@Pc(10) long local10 = (long) this.method3084() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method3084() & 0xFFFFFFFFL;
		return local25 + (local10 << 32);
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(Z)Z")
	public final boolean method3114() {
		this.anInt3822 -= 4;
		@Pc(22) int local22 = Static299.method4597(this.anInt3822, 0, this.aByteArray47);
		@Pc(26) int local26 = this.method3084();
		return local22 == local26;
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(Z)I")
	public final int method3115() {
		this.anInt3822 += 4;
		return ((this.aByteArray47[this.anInt3822 - 1] & 0xFF) << 8) + ((this.aByteArray47[this.anInt3822 - 3] & 0xFF) << 24) + ((this.aByteArray47[this.anInt3822 + -4] & 0xFF) << 16) + (this.aByteArray47[this.anInt3822 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(IB)V")
	public final void method3116(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "(II)V")
	public final void method3117(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray47[this.anInt3822 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3822 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3822 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)V")
	public final void method3118(@OriginalArg(1) int arg0) {
		if ((arg0 & -128) != 0) {
			if ((arg0 & -16384) != 0) {
				if ((-2097152 & arg0) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3116(arg0 >>> 28 | 0x80);
					}
					this.method3116(arg0 >>> 21 | 0x80);
				}
				this.method3116(arg0 >>> 14 | 0x80);
			}
			this.method3116(arg0 >>> 7 | 0x80);
		}
		this.method3116(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(B)B")
	public final byte method3119() {
		return (byte) (this.aByteArray47[this.anInt3822++] - 128);
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "(II)V")
	public final void method3120(@OriginalArg(1) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) arg0;
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 8);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 16);
		this.aByteArray47[this.anInt3822++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "(I)I")
	public final int method3121() {
		this.anInt3822 += 4;
		return ((this.aByteArray47[this.anInt3822 - 1] & 0xFF) << 24) + ((this.aByteArray47[this.anInt3822 - 2] & 0xFF) << 16) + ((this.aByteArray47[this.anInt3822 + -3] & 0xFF) << 8) + (this.aByteArray47[this.anInt3822 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B[I)V")
	public final void method3122(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt3822 / 8;
		this.anInt3822 = 0;
		for (@Pc(22) int local22 = 0; local22 < local10; local22++) {
			@Pc(29) int local29 = this.method3084();
			@Pc(33) int local33 = this.method3084();
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local29 += (local33 >>> 5 ^ local33 << 4) + local33 ^ arg0[local37 & 0x3] + local37;
				local37 += -1640531527;
				local33 += local29 + (local29 >>> 5 ^ local29 << 4) ^ local37 + arg0[local37 >>> 11 & 0xEFC00003];
			}
			this.anInt3822 -= 8;
			this.method3066(local29);
			this.method3066(local33);
		}
	}
}
