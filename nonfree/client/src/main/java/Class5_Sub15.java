import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public class Class5_Sub15 extends Class5 {

	@OriginalMember(owner = "client!rv", name = "db", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
	public int anInt4144;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
	public Class5_Sub15(@OriginalArg(0) int arg0) {
		this.aByteArray45 = Static558.method7659(arg0);
		this.anInt4144 = 0;
	}

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "([B)V")
	public Class5_Sub15(@OriginalArg(0) byte[] arg0) {
		this.anInt4144 = 0;
		this.aByteArray45 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
	public final void method3632(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 + 128);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I")
	public final int method3633() {
		this.anInt4144 += 3;
		return (this.aByteArray45[this.anInt4144 - 1] & 0xFF) + ((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 8) + ((this.aByteArray45[this.anInt4144 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)J")
	public final long method3634() {
		@Pc(10) long local10 = (long) this.method3671() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method3671() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)I")
	public final int method3635() {
		this.anInt4144 += 4;
		return ((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 24) + (this.aByteArray45[this.anInt4144 - 1] << 16 & 0xFF0000) + ((this.aByteArray45[this.anInt4144 - 4] & 0xFF) << 8) + (this.aByteArray45[this.anInt4144 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V")
	public final void method3636(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(I)I")
	public final int method3637() {
		this.anInt4144 += 2;
		return ((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 8) + (this.aByteArray45[this.anInt4144 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)I")
	public final int method3638() {
		this.anInt4144 += 2;
		@Pc(37) int local37 = (this.aByteArray45[this.anInt4144 - 1] & 0xFF) + ((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method3639(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr2");
		}
		this.aByteArray45[this.anInt4144++] = 0;
		this.anInt4144 += Static654.method8347(this.aByteArray45, this.anInt4144, arg0.length(), arg0);
		this.aByteArray45[this.anInt4144++] = 0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IB)V")
	public final void method3640(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(I)I")
	public final int method3641() {
		this.anInt4144 += 3;
		@Pc(44) int local44 = ((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 8) + (((this.aByteArray45[this.anInt4144 - 3] & 0xFF) << 16) + (this.aByteArray45[this.anInt4144 - 1] & 0xFF));
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "(I)I")
	public final int method3642() {
		return this.aByteArray45[this.anInt4144++] & 0xFF;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(II)V")
	public final void method3644(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt4144 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt4144 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(II)J")
	public final long method3645(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = local0 * 8;
		@Pc(22) long local22 = 0L;
		while (local20 >= 0) {
			local22 |= ((long) this.aByteArray45[this.anInt4144++] & 0xFFL) << local20;
			local20 -= 8;
		}
		return local22;
	}

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "(I)I")
	public final int method3646() {
		return this.aByteArray45[this.anInt4144++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V")
	public final void method3647(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(JZ)V")
	public final void method3648(@OriginalArg(0) long arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (int) (arg0 >> 56);
		this.aByteArray45[this.anInt4144++] = (byte) (int) (arg0 >> 48);
		this.aByteArray45[this.anInt4144++] = (byte) (int) (arg0 >> 40);
		this.aByteArray45[this.anInt4144++] = (byte) (int) (arg0 >> 32);
		this.aByteArray45[this.anInt4144++] = (byte) (int) (arg0 >> 24);
		this.aByteArray45[this.anInt4144++] = (byte) (int) (arg0 >> 16);
		this.aByteArray45[this.anInt4144++] = (byte) (int) (arg0 >> 8);
		this.aByteArray45[this.anInt4144++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(II)V")
	public final void method3649(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt4144 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III[B)V")
	public final void method3650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(5) int local5 = arg0; local5 < arg0 + arg1; local5++) {
			arg2[local5] = this.aByteArray45[this.anInt4144++];
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(BI)V")
	public final void method3651(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public final void method3652(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4144;
		this.anInt4144 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3650(0, local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local28.toByteArray();
		this.anInt4144 = 0;
		this.method3660(local35.length);
		this.method3685(local35, local35.length, 0);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)I")
	public final int method3653() {
		this.anInt4144 += 4;
		return ((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 16) + ((this.aByteArray45[this.anInt4144 - 1] & 0xFF) << 24) + ((this.aByteArray45[this.anInt4144 + -3] & 0xFF) << 8) + (this.aByteArray45[this.anInt4144 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)I")
	public final int method3654() {
		this.anInt4144 += 2;
		@Pc(38) int local38 = (this.aByteArray45[this.anInt4144 - 2] - 128 & 0xFF) + ((this.aByteArray45[this.anInt4144 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "(I)I")
	public final int method3655() {
		return -this.aByteArray45[this.anInt4144++] & 0xFF;
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(II)V")
	public final void method3656(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "(I)I")
	public final int method3657() {
		@Pc(16) int local16 = this.aByteArray45[this.anInt4144] & 0xFF;
		return local16 < 128 ? this.method3642() - 64 : this.method3698() - 49152;
	}

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "(I)B")
	public final byte method3658() {
		return (byte) (this.aByteArray45[this.anInt4144++] - 128);
	}

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "(I)B")
	public final byte method3659() {
		return (byte) (128 - this.aByteArray45[this.anInt4144++]);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(IB)V")
	public final void method3660(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method3661() {
		@Pc(6) int local6 = this.anInt4144;
		while (this.aByteArray45[this.anInt4144++] != 0) {
		}
		@Pc(35) int local35 = this.anInt4144 - local6 - 1;
		return local35 == 0 ? "" : Static621.method8308(local35, local6, this.aByteArray45);
	}

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "(I)I")
	public final int method3662() {
		this.anInt4144 += 2;
		return (this.aByteArray45[this.anInt4144 - 2] - 128 & 0xFF) + ((this.aByteArray45[this.anInt4144 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "(I)I")
	public final int method3663() {
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = this.method3690();
		while (local14 == 32767) {
			local14 = this.method3690();
			local10 += 32767;
		}
		return local10 + local14;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(BI)V")
	public final void method3664(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 24);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(IB)V")
	public final void method3665(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt4144 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray45[this.anInt4144 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt4144 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt4144 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "(I)J")
	public final long method3666() {
		@Pc(10) long local10 = (long) this.method3642() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method3671() & 0xFFFFFFFFL;
		return (local10 << 32) + local17;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(Z)I")
	public final int method3667() {
		return 128 - this.aByteArray45[this.anInt4144++] & 0xFF;
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(II)V")
	public final void method3668(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IJI)V")
	public final void method3669(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(7) int local7 = arg0 - 1;
		if (local7 < 0 || local7 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local7 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray45[this.anInt4144++] = (byte) (int) (arg1 >> local27);
		}
	}

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "(I)Z")
	public final boolean method3670() {
		this.anInt4144 -= 4;
		@Pc(24) int local24 = Static323.method5027(this.anInt4144, this.aByteArray45, 0);
		@Pc(28) int local28 = this.method3671();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "(I)I")
	public final int method3671() {
		this.anInt4144 += 4;
		return ((this.aByteArray45[this.anInt4144 - 4] & 0xFF) << 24) - (-((this.aByteArray45[this.anInt4144 - 3] & 0xFF) << 16) - (((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 8) + (this.aByteArray45[this.anInt4144 - 1] & 0xFF)));
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(B)J")
	public final long method3672() {
		@Pc(17) long local17 = (long) this.method3653() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method3653() & 0xFFFFFFFFL;
		return local17 + (local24 << 32);
	}

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "(I)I")
	public final int method3673() {
		this.anInt4144 += 4;
		return (this.aByteArray45[this.anInt4144 - 4] & 0xFF) + ((this.aByteArray45[this.anInt4144 - 3] & 0xFF) << 8) + ((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 16) + ((this.aByteArray45[this.anInt4144 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!rv", name = "v", descriptor = "(I)Ljava/lang/String;")
	public final String method3674() {
		@Pc(14) byte local14 = this.aByteArray45[this.anInt4144++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt4144;
		while (this.aByteArray45[this.anInt4144++] != 0) {
		}
		@Pc(50) int local50 = this.anInt4144 - local27 - 1;
		return local50 == 0 ? "" : Static621.method8308(local50, local27, this.aByteArray45);
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(IB)V")
	public final void method3675(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(II)V")
	public final void method3676(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "(I)B")
	public final byte method3677() {
		return this.aByteArray45[this.anInt4144++];
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(Z)V")
	public final void method3678() {
		if (this.aByteArray45 != null) {
			Static558.method7657(this.aByteArray45);
		}
		this.aByteArray45 = null;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(BI)V")
	public final void method3679(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 24);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method3680(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4144 += Static654.method8347(this.aByteArray45, this.anInt4144, arg0.length(), arg0);
		this.aByteArray45[this.anInt4144++] = 0;
	}

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "(I)I")
	public final int method3681() {
		@Pc(14) byte local14 = this.aByteArray45[this.anInt4144++];
		@Pc(22) int local22 = 0;
		while (local14 < 0) {
			local22 = (local22 | local14 & 0x7F) << 7;
			local14 = this.aByteArray45[this.anInt4144++];
		}
		return local22 | local14;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(B)B")
	public final byte method3682() {
		return (byte) -this.aByteArray45[this.anInt4144++];
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(B)I")
	public final int method3683() {
		this.anInt4144 += 2;
		return ((this.aByteArray45[this.anInt4144 - 1] & 0xFF) << 8) + (this.aByteArray45[this.anInt4144 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "(II)V")
	public final void method3684(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([BIII)V")
	public final void method3685(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg2; local7 < arg2 + arg1; local7++) {
			this.aByteArray45[this.anInt4144++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "(II)V")
	public final void method3686(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3651(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3660(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([IIII)V")
	public final void method3687(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anInt4144;
		this.anInt4144 = arg1;
		@Pc(21) int local21 = (arg2 - arg1) / 8;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(28) int local28 = this.method3671();
			@Pc(32) int local32 = this.method3671();
			@Pc(34) int local34 = 0;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local28 += local34 + arg0[local34 & 0x3] ^ (local32 >>> 5 ^ local32 << 4) - -local32;
				local34 += -1640531527;
				local32 += (local28 >>> 5 ^ local28 << 4) + local28 ^ local34 - -arg0[local34 >>> 11 & 0x11C00003];
			}
			this.anInt4144 -= 8;
			this.method3679(local28);
			this.method3679(local32);
		}
		this.anInt4144 = local6;
	}

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "(II)V")
	public final void method3688(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3651(arg0 >>> 28 | 0x80);
					}
					this.method3651(arg0 >>> 21 | 0x80);
				}
				this.method3651(arg0 >>> 14 | 0x80);
			}
			this.method3651(arg0 >>> 7 | 0x80);
		}
		this.method3651(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(B)I")
	public final int method3689() {
		this.anInt4144 += 3;
		return (this.aByteArray45[this.anInt4144 - 1] & 0xFF) + ((this.aByteArray45[this.anInt4144 - 3] & 0xFF) << 8) + ((this.aByteArray45[this.anInt4144 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(B)I")
	public final int method3690() {
		@Pc(16) int local16 = this.aByteArray45[this.anInt4144] & 0xFF;
		return local16 >= 128 ? this.method3698() - 32768 : this.method3642();
	}

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "(I)Ljava/lang/String;")
	public final String method3691() {
		if (this.aByteArray45[this.anInt4144] == 0) {
			this.anInt4144++;
			return null;
		} else {
			return this.method3661();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II[II)V")
	public final void method3692(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(6) int local6 = this.anInt4144;
		this.anInt4144 = 5;
		@Pc(16) int local16 = (arg0 - 5) / 8;
		for (@Pc(23) int local23 = 0; local23 < local16; local23++) {
			@Pc(28) int local28 = this.method3671();
			@Pc(34) int local34 = this.method3671();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= local36 + arg1[local36 >>> 11 & 0x3] ^ (local28 >>> 5 ^ local28 << 4) + local28;
				local36 -= -1640531527;
				local28 -= arg1[local36 & 0x3] + local36 ^ local34 + (local34 << 4 ^ local34 >>> 5);
			}
			this.anInt4144 -= 8;
			this.method3679(local28);
			this.method3679(local34);
		}
		this.anInt4144 = local6;
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "(B)I")
	public final int method3693() {
		this.anInt4144 += 4;
		return (this.aByteArray45[this.anInt4144 - 2] & 0xFF) + (((this.aByteArray45[this.anInt4144 - 1] & 0xFF) << 8) + ((this.aByteArray45[this.anInt4144 - 3] & 0xFF) << 24) + ((this.aByteArray45[this.anInt4144 + -4] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "(B)I")
	public final int method3694() {
		this.anInt4144 += 2;
		@Pc(42) int local42 = ((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 8) + (this.aByteArray45[this.anInt4144 - 1] - 128 & 0xFF);
		if (local42 > 32767) {
			local42 -= 65536;
		}
		return local42;
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "(II)I")
	public final int method3695(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static323.method5027(this.anInt4144, this.aByteArray45, arg0);
		this.method3679(local11);
		return local11;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(IB)V")
	public final void method3696(@OriginalArg(0) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "(II)V")
	public final void method3697(@OriginalArg(1) int arg0) {
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 16);
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 24);
		this.aByteArray45[this.anInt4144++] = (byte) arg0;
		this.aByteArray45[this.anInt4144++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "(B)I")
	public final int method3698() {
		this.anInt4144 += 2;
		return ((this.aByteArray45[this.anInt4144 - 2] & 0xFF) << 8) + (this.aByteArray45[this.anInt4144 - 1] & 0xFF);
	}
}
