import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
	public int anInt4188 = 0;

	@OriginalMember(owner = "client!ec", name = "ub", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
	public Class6_Sub10(@OriginalArg(0) int arg0) {
		this.aByteArray67 = Static215.method3840(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V")
	public Class6_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray67 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	public final void method3961(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 + 128);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I")
	public final int method3962() {
		this.anInt4188 += 3;
		return ((this.aByteArray67[this.anInt4188 - 3] & 0xFF) << 8) + (((this.aByteArray67[this.anInt4188 - 2] & 0xFF) << 16) + (this.aByteArray67[this.anInt4188 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
	public final void method3963(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 24);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)I")
	public final int method3964() {
		@Pc(18) int local18 = this.aByteArray67[this.anInt4188] & 0xFF;
		return local18 >= 128 ? this.method4021() - 49152 : this.method3972() + -64;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Z")
	public final boolean method3965() {
		this.anInt4188 -= 4;
		@Pc(25) int local25 = Static189.method3561(this.anInt4188, this.aByteArray67, 0);
		@Pc(29) int local29 = this.method3979();
		return local29 == local25;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method3966(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4188 += Static217.method3876(this.anInt4188, this.aByteArray67, arg0, arg0.length());
		this.aByteArray67[this.anInt4188++] = 0;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)I")
	public final int method3967() {
		this.anInt4188 += 2;
		@Pc(37) int local37 = ((this.aByteArray67[this.anInt4188 - 1] & 0xFF) << 8) + (this.aByteArray67[this.anInt4188 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V")
	public final void method3968(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)B")
	public final byte method3969() {
		return (byte) (128 - this.aByteArray67[this.anInt4188++]);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IJ)V")
	public final void method3970(@OriginalArg(1) long arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 56);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 48);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 40);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 32);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 24);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 16);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)I")
	public final int method3972() {
		return this.aByteArray67[this.anInt4188++] & 0xFF;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)I")
	public final int method3973(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static189.method3561(this.anInt4188, this.aByteArray67, arg0);
		this.method3976(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)V")
	public final void method3974(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = arg1 - 1; local12 >= 0; local12--) {
			arg0[local12] = (byte) (this.aByteArray67[this.anInt4188++] - 128);
		}
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method3975() {
		if (this.aByteArray67[this.anInt4188] == 0) {
			this.anInt4188++;
			return null;
		} else {
			return this.method4023();
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(II)V")
	public final void method3976(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 24);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 16);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)I")
	public final int method3977() {
		return -this.aByteArray67[this.anInt4188++] & 0xFF;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IB)V")
	public final void method3978(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)I")
	public final int method3979() {
		this.anInt4188 += 4;
		return (this.aByteArray67[this.anInt4188 - 1] & 0xFF) + ((this.aByteArray67[this.anInt4188 - 3] & 0xFF) << 16) + ((this.aByteArray67[this.anInt4188 + -4] & 0xFF) << 24) + ((this.aByteArray67[this.anInt4188 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(B)I")
	public final int method3980() {
		return 128 - this.aByteArray67[this.anInt4188++] & 0xFF;
	}

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)I")
	public final int method3982() {
		@Pc(16) byte local16 = this.aByteArray67[this.anInt4188++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray67[this.anInt4188++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(II)V")
	public final void method3983(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3968(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4025(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
	public final void method3984(@OriginalArg(1) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)I")
	public final int method3985() {
		this.anInt4188 += 2;
		@Pc(43) int local43 = ((this.aByteArray67[this.anInt4188 - 2] & 0xFF) << 8) + (this.aByteArray67[this.anInt4188 - 1] - 128 & 0xFF);
		if (local43 > 32767) {
			local43 -= 65536;
		}
		return local43;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI[B)V")
	public final void method3986(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			arg1[local15] = this.aByteArray67[this.anInt4188++];
		}
	}

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "(I)I")
	public final int method3987() {
		this.anInt4188 += 4;
		return ((this.aByteArray67[this.anInt4188 - 2] & 0xFF) << 24) + ((this.aByteArray67[this.anInt4188 - 1] & 0xFF) << 16) + ((this.aByteArray67[this.anInt4188 + -4] & 0xFF) << 8) + (this.aByteArray67[this.anInt4188 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(II)V")
	public final void method3988(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "(I)I")
	public final int method3989() {
		this.anInt4188 += 2;
		return (this.aByteArray67[this.anInt4188 - 2] & 0xFF) + ((this.aByteArray67[this.anInt4188 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "(II)V")
	public final void method3990(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIJ)V")
	public final void method3991(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(21) int local21 = local2 * 8; local21 >= 0; local21 -= 8) {
			this.aByteArray67[this.anInt4188++] = (byte) (arg1 >> local21);
		}
	}

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "(I)B")
	public final byte method3992() {
		return this.aByteArray67[this.anInt4188++];
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([II)V")
	public final void method3993(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt4188 / 8;
		this.anInt4188 = 0;
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			@Pc(26) int local26 = this.method3979();
			@Pc(30) int local30 = this.method3979();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local26 += arg0[local32 & 0x3] + local32 ^ local30 + (local30 << 4 ^ local30 >>> 5);
				local32 += -1640531527;
				local30 += local32 + arg0[local32 >>> 11 & 0x3] ^ local26 + (local26 << 4 ^ local26 >>> 5);
			}
			this.anInt4188 -= 8;
			this.method3976(local26);
			this.method3976(local30);
		}
	}

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "(I)I")
	public final int method3994() {
		this.anInt4188 += 2;
		return ((this.aByteArray67[this.anInt4188 - 1] & 0xFF) << 8) + (this.aByteArray67[this.anInt4188 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "(I)I")
	public final int method3995() {
		this.anInt4188 += 2;
		return (this.aByteArray67[this.anInt4188 - 1] - 128 & 0xFF) + ((this.aByteArray67[this.anInt4188 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(Z)I")
	public final int method3996() {
		this.anInt4188 += 3;
		return ((this.aByteArray67[this.anInt4188 - 2] & 0xFF) << 8) + (this.aByteArray67[this.anInt4188 - 3] << 16 & 0xFF0000) + (this.aByteArray67[this.anInt4188 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(BI)V")
	public final void method3997(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3968(arg0 >>> 28 | 0x80);
					}
					this.method3968(arg0 >>> 21 | 0x80);
				}
				this.method3968(arg0 >>> 14 | 0x80);
			}
			this.method3968(arg0 >>> 7 | 0x80);
		}
		this.method3968(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "(II)J")
	public final long method3998(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local2 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray67[this.anInt4188++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "(B)B")
	public final byte method3999() {
		return (byte) -this.aByteArray67[this.anInt4188++];
	}

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "(II)V")
	public final void method4001(@OriginalArg(1) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 16);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(BI)V")
	public final void method4002(@OriginalArg(1) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "(B)I")
	public final int method4003() {
		this.anInt4188 += 4;
		return ((this.aByteArray67[this.anInt4188 - 1] & 0xFF) << 8) + ((this.aByteArray67[this.anInt4188 - 4] & 0xFF) << 16) + ((this.aByteArray67[this.anInt4188 + -3] & 0xFF) << 24) + (this.aByteArray67[this.anInt4188 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method4004(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4188;
		this.anInt4188 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3986(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local23.modPow(arg0, arg1);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt4188 = 0;
		this.method3968(local39.length);
		this.method4014(local39, local39.length);
	}

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "(I)I")
	public final int method4005() {
		this.anInt4188 += 4;
		return ((this.aByteArray67[this.anInt4188 - 1] & 0xFF) << 24) - (-((this.aByteArray67[this.anInt4188 - 2] & 0xFF) << 16) - ((this.aByteArray67[this.anInt4188 - 3] << 8 & 0xFF00) + (this.aByteArray67[this.anInt4188 - 4] & 0xFF)));
	}

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "(II)V")
	public final void method4006(@OriginalArg(1) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 16);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 24);
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "(II)V")
	public final void method4007(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 16);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "(B)I")
	public final int method4008() {
		this.anInt4188 += 2;
		@Pc(41) int local41 = ((this.aByteArray67[this.anInt4188 - 1] & 0xFF) << 8) + (this.aByteArray67[this.anInt4188 - 2] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(IB)V")
	public final void method4009(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 16);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "(I)I")
	public final int method4010() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method4017();
		while (local11 == 32767) {
			local11 = this.method4017();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "(I)I")
	public final int method4011() {
		return this.aByteArray67[this.anInt4188++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "(I)Ljava/lang/String;")
	public final String method4013() {
		@Pc(14) byte local14 = this.aByteArray67[this.anInt4188++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt4188;
		while (this.aByteArray67[this.anInt4188++] != 0) {
		}
		@Pc(47) int local47 = this.anInt4188 - local27 - 1;
		return local47 == 0 ? "" : Static322.method4786(local47, this.aByteArray67, local27);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[BII)V")
	public final void method4014(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray67[this.anInt4188++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIB[I)V")
	public final void method4015(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt4188;
		this.anInt4188 = 5;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(27) int local27 = this.method3979();
			@Pc(31) int local31 = this.method3979();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= local27 + (local27 << 4 ^ local27 >>> 5) ^ local33 + arg1[local33 >>> 11 & 0x3];
				local33 -= -1640531527;
				local27 -= arg1[local33 & 0x3] + local33 ^ (local31 >>> 5 ^ local31 << 4) - -local31;
			}
			this.anInt4188 -= 8;
			this.method3976(local27);
			this.method3976(local31);
		}
		this.anInt4188 = local8;
	}

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "(I)J")
	public final long method4016() {
		@Pc(18) long local18 = (long) this.method3979() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method3979() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "(B)I")
	public final int method4017() {
		@Pc(16) int local16 = this.aByteArray67[this.anInt4188] & 0xFF;
		return local16 >= 128 ? this.method4021() - 32768 : this.method3972();
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(IB)V")
	public final void method4019(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(IB)V")
	public final void method4020(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "(B)I")
	public final int method4021() {
		this.anInt4188 += 2;
		return ((this.aByteArray67[this.anInt4188 - 2] & 0xFF) << 8) + (this.aByteArray67[this.anInt4188 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "(B)I")
	public final int method4022() {
		this.anInt4188 += 2;
		@Pc(31) int local31 = (this.aByteArray67[this.anInt4188 - 1] & 0xFF) + ((this.aByteArray67[this.anInt4188 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "(B)Ljava/lang/String;")
	public final String method4023() {
		@Pc(6) int local6 = this.anInt4188;
		while (this.aByteArray67[this.anInt4188++] != 0) {
		}
		@Pc(29) int local29 = this.anInt4188 - local6 - 1;
		return local29 == 0 ? "" : Static322.method4786(local29, this.aByteArray67, local6);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(BI)V")
	public final void method4024(@OriginalArg(1) int arg0) {
		this.aByteArray67[this.anInt4188 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray67[this.anInt4188 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray67[this.anInt4188 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray67[this.anInt4188 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "(II)V")
	public final void method4025(@OriginalArg(0) int arg0) {
		this.aByteArray67[this.anInt4188++] = (byte) (arg0 >> 8);
		this.aByteArray67[this.anInt4188++] = (byte) arg0;
	}
}
