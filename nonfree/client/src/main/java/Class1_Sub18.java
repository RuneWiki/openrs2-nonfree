import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
	public int anInt3911;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub18(@OriginalArg(0) int arg0) {
		this.aByteArray71 = Static39.method715(arg0);
		this.anInt3911 = 0;
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "([B)V")
	public Class1_Sub18(@OriginalArg(0) byte[] arg0) {
		this.anInt3911 = 0;
		this.aByteArray71 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)I")
	public final int method3057() {
		return 128 - this.aByteArray71[this.anInt3911++] & 0xFF;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method3058(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt3911;
		this.anInt3911 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3095(local12, local6);
		@Pc(27) BigInteger local27 = new BigInteger(local12);
		@Pc(32) BigInteger local32 = local27.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt3911 = 0;
		this.method3093(local35.length);
		this.method3080(local35.length, local35);
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)I")
	public final int method3059() {
		@Pc(21) byte local21 = this.aByteArray71[this.anInt3911++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray71[this.anInt3911++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
	public final void method3060(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
	public final void method3061(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3093(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3123(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)I")
	public final int method3062() {
		this.anInt3911 += 2;
		return ((this.aByteArray71[this.anInt3911 - 1] & 0xFF) << 8) + (this.aByteArray71[this.anInt3911 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)I")
	public final int method3063() {
		this.anInt3911 += 4;
		return ((this.aByteArray71[this.anInt3911 - 3] & 0xFF) << 8) + ((this.aByteArray71[this.anInt3911 - 1] & 0xFF) << 24) + ((this.aByteArray71[this.anInt3911 - 2] & 0xFF) << 16) + (this.aByteArray71[this.anInt3911 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)I")
	public final int method3064() {
		this.anInt3911 += 2;
		@Pc(36) int local36 = ((this.aByteArray71[this.anInt3911 - 2] & 0xFF) << 8) + (this.aByteArray71[this.anInt3911 - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)I")
	public final int method3065() {
		this.anInt3911 += 2;
		@Pc(36) int local36 = (this.aByteArray71[this.anInt3911 - 2] & 0xFF) + ((this.aByteArray71[this.anInt3911 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IF)V")
	public final void method3066(@OriginalArg(1) float arg0) {
		@Pc(10) int local10 = Float.floatToRawIntBits(arg0);
		this.aByteArray71[this.anInt3911++] = (byte) (local10 >> 24);
		this.aByteArray71[this.anInt3911++] = (byte) (local10 >> 16);
		this.aByteArray71[this.anInt3911++] = (byte) (local10 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) local10;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method3067(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr");
		}
		this.anInt3911 += Static23.method4494(arg0.length(), this.anInt3911, arg0, this.aByteArray71);
		this.aByteArray71[this.anInt3911++] = 0;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)V")
	public final void method3068(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(IB)V")
	public final void method3070(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt3911 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt3911 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt3911 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method3071() {
		if (this.aByteArray71[this.anInt3911] == 0) {
			this.anInt3911++;
			return null;
		} else {
			return this.method3101();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public final void method3072(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)I")
	public final int method3073() {
		this.anInt3911 += 4;
		return (this.aByteArray71[this.anInt3911 - 2] & 0xFF) + ((this.aByteArray71[this.anInt3911 - 1] & 0xFF) << 8) + ((this.aByteArray71[this.anInt3911 + -3] & 0xFF) << 24) + ((this.aByteArray71[this.anInt3911 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)I")
	public final int method3074() {
		this.anInt3911 += 4;
		return ((this.aByteArray71[this.anInt3911 - 3] & 0xFF) << 16) + (this.aByteArray71[this.anInt3911 - 4] << 24 & 0xFF000000) + ((this.aByteArray71[this.anInt3911 + -2] & 0xFF) << 8) + (this.aByteArray71[this.anInt3911 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V")
	public final void method3076(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([II)V")
	public final void method3077(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt3911 / 8;
		this.anInt3911 = 0;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(26) int local26 = this.method3074();
			@Pc(30) int local30 = this.method3074();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local26 += arg0[local32 & 0x3] + local32 ^ local30 + (local30 >>> 5 ^ local30 << 4);
				local32 += -1640531527;
				local30 += local32 + arg0[local32 >>> 11 & 0x3] ^ local26 + (local26 >>> 5 ^ local26 << 4);
			}
			this.anInt3911 -= 8;
			this.method3119(local26);
			this.method3119(local30);
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)J")
	public final long method3078(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = local6 * 8;
		@Pc(22) long local22 = 0L;
		while (local20 >= 0) {
			local22 |= ((long) this.aByteArray71[this.anInt3911++] & 0xFFL) << local20;
			local20 -= 8;
		}
		return local22;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)B")
	public final byte method3079() {
		return (byte) -this.aByteArray71[this.anInt3911++];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB[BI)V")
	public final void method3080(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray71[this.anInt3911++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)I")
	public final int method3081() {
		@Pc(11) int local11 = this.aByteArray71[this.anInt3911] & 0xFF;
		return local11 >= 128 ? this.method3107() - 49152 : this.method3122() + -64;
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(B)B")
	public final byte method3082() {
		return this.aByteArray71[this.anInt3911++];
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(B)B")
	public final byte method3083() {
		return (byte) (128 - this.aByteArray71[this.anInt3911++]);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(Z)I")
	public final int method3084() {
		return -this.aByteArray71[this.anInt3911++] & 0xFF;
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "(B)Z")
	public final boolean method3085() {
		this.anInt3911 -= 4;
		@Pc(25) int local25 = Static110.method1729(0, this.aByteArray71, this.anInt3911);
		@Pc(29) int local29 = this.method3074();
		return local25 == local29;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)V")
	public final void method3086(@OriginalArg(1) int arg0) {
		if ((-128 & arg0) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & -2097152) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3093(arg0 >>> 28 | 0x80);
					}
					this.method3093(arg0 >>> 21 | 0x80);
				}
				this.method3093(arg0 >>> 14 | 0x80);
			}
			this.method3093(arg0 >>> 7 | 0x80);
		}
		this.method3093(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
	public final void method3087(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IF)V")
	public final void method3088(@OriginalArg(1) float arg0) {
		@Pc(11) int local11 = Float.floatToRawIntBits(arg0);
		this.aByteArray71[this.anInt3911++] = (byte) local11;
		this.aByteArray71[this.anInt3911++] = (byte) (local11 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) (local11 >> 16);
		this.aByteArray71[this.anInt3911++] = (byte) (local11 >> 24);
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)V")
	public final void method3089(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 + 128);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[BBI)V")
	public final void method3090(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = this.aByteArray71[this.anInt3911++];
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZJ)V")
	public final void method3091(@OriginalArg(1) long arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 56);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 48);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 40);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 32);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "(B)I")
	public final int method3092() {
		this.anInt3911 += 3;
		return ((this.aByteArray71[this.anInt3911 - 3] & 0xFF) << 8) + ((this.aByteArray71[this.anInt3911 - 2] & 0xFF) << 16) + (this.aByteArray71[this.anInt3911 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)V")
	public final void method3093(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(IB)V")
	public final void method3094(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[BII)V")
	public final void method3095(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray71[this.anInt3911++];
		}
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)I")
	public final int method3096() {
		@Pc(16) int local16 = this.method3117();
		@Pc(18) int local18 = 0;
		while (local16 == 32767) {
			local18 += 32767;
			local16 = this.method3117();
		}
		return local18 + local16;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(BI)I")
	public final int method3098(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = Static110.method1729(arg0, this.aByteArray71, this.anInt3911);
		this.method3119(local19);
		return local19;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(Z)I")
	public final int method3099() {
		return this.aByteArray71[this.anInt3911++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IZ)V")
	public final void method3100(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method3101() {
		@Pc(6) int local6 = this.anInt3911;
		while (this.aByteArray71[this.anInt3911++] != 0) {
		}
		return Static296.method4532(this.anInt3911 - local6 - 1, local6, this.aByteArray71);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(IZ)V")
	public final void method3102(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "(B)I")
	public final int method3103() {
		this.anInt3911 += 2;
		return ((this.aByteArray71[this.anInt3911 - 2] & 0xFF) << 8) + (this.aByteArray71[this.anInt3911 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(Z)I")
	public final int method3104() {
		this.anInt3911 += 2;
		@Pc(36) int local36 = (this.aByteArray71[this.anInt3911 - 2] - 128 & 0xFF) + ((this.aByteArray71[this.anInt3911 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "(B)I")
	public final int method3105() {
		this.anInt3911 += 2;
		@Pc(34) int local34 = ((this.aByteArray71[this.anInt3911 - 2] & 0xFF) << 8) + (this.aByteArray71[this.anInt3911 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(II)V")
	public final void method3106(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "(I)I")
	public final int method3107() {
		this.anInt3911 += 2;
		return (this.aByteArray71[this.anInt3911 - 1] & 0xFF) + ((this.aByteArray71[this.anInt3911 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "(B)B")
	public final byte method3108() {
		return (byte) (this.aByteArray71[this.anInt3911++] - 128);
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "(I)I")
	public final int method3109() {
		this.anInt3911 += 3;
		return ((this.aByteArray71[this.anInt3911 - 2] & 0xFF) << 8) + ((this.aByteArray71[this.anInt3911 - 3] & 0xFF) << 16) + (this.aByteArray71[this.anInt3911 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(II)V")
	public final void method3110(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method3111() {
		@Pc(14) byte local14 = this.aByteArray71[this.anInt3911++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(28) int local28 = this.anInt3911;
		while (this.aByteArray71[this.anInt3911++] != 0) {
		}
		return Static296.method4532(this.anInt3911 - local28 - 1, local28, this.aByteArray71);
	}

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "(B)J")
	public final long method3112() {
		@Pc(10) long local10 = (long) this.method3074() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method3074() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IJI)V")
	public final void method3113(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(22) int local22 = local2 * 8; local22 >= 0; local22 -= 8) {
			this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> local22);
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(ZI)V")
	public final void method3114(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(ZJ)V")
	public final void method3115(@OriginalArg(1) long arg0) {
		this.method3060((int) (arg0 >> 32));
		this.method3060((int) arg0);
	}

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "(I)I")
	public final int method3116() {
		this.anInt3911 += 4;
		return (this.aByteArray71[this.anInt3911 - 3] & 0xFF) + ((this.aByteArray71[this.anInt3911 - 2] & 0xFF) << 24) + ((this.aByteArray71[this.anInt3911 - 1] & 0xFF) << 16) + ((this.aByteArray71[this.anInt3911 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "(I)I")
	public final int method3117() {
		@Pc(11) int local11 = this.aByteArray71[this.anInt3911] & 0xFF;
		return local11 < 128 ? this.method3122() : this.method3107() - 32768;
	}

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "(B)I")
	public final int method3118() {
		this.anInt3911 += 2;
		return ((this.aByteArray71[this.anInt3911 - 1] & 0xFF) << 8) + (this.aByteArray71[this.anInt3911 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(BI)V")
	public final void method3119(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 16);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(II)V")
	public final void method3120(@OriginalArg(0) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 24);
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIII)V")
	public final void method3121(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt3911;
		this.anInt3911 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.method3074();
			@Pc(31) int local31 = this.method3074();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= arg0[local33 >>> 11 & 0x3] + local33 ^ local27 + (local27 << 4 ^ local27 >>> 5);
				local33 -= -1640531527;
				local27 -= arg0[local33 & 0x3] + local33 ^ local31 + (local31 << 4 ^ local31 >>> 5);
			}
			this.anInt3911 -= 8;
			this.method3119(local27);
			this.method3119(local31);
		}
		this.anInt3911 = local8;
	}

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "(B)I")
	public final int method3122() {
		return this.aByteArray71[this.anInt3911++] & 0xFF;
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "(II)V")
	public final void method3123(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt3911++] = (byte) (arg0 >> 8);
		this.aByteArray71[this.anInt3911++] = (byte) arg0;
	}
}
