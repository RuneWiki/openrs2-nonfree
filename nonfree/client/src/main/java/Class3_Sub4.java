import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
	public int anInt4268 = 0;

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4(@OriginalArg(0) int arg0) {
		this.aByteArray70 = Static151.method2442(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray70 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
	public final void method3614(@OriginalArg(0) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)V")
	public final void method3615(@OriginalArg(1) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 16);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(II)V")
	public final void method3616(@OriginalArg(1) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I")
	public final int method3617() {
		return this.aByteArray70[this.anInt4268++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(II)I")
	public final int method3618(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static54.method918(this.aByteArray70, this.anInt4268, arg0);
		this.method3650(local11);
		return local11;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Z)B")
	public final byte method3619() {
		return (byte) (this.aByteArray70[this.anInt4268++] - 128);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI[BI)V")
	public final void method3620(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			arg1[local8] = this.aByteArray70[this.anInt4268++];
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)B")
	public final byte method3621() {
		return this.aByteArray70[this.anInt4268++];
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)I")
	public final int method3622() {
		this.anInt4268 += 2;
		@Pc(31) int local31 = (this.aByteArray70[this.anInt4268 - 1] & 0xFF) + ((this.aByteArray70[this.anInt4268 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
	public final int method3623() {
		this.anInt4268 += 4;
		return (this.aByteArray70[this.anInt4268 - 2] & 0xFF) + ((this.aByteArray70[this.anInt4268 - 1] & 0xFF) << 8) + ((this.aByteArray70[this.anInt4268 + -3] & 0xFF) << 24) + ((this.aByteArray70[this.anInt4268 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method3624(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4268 += Static114.method1971(this.anInt4268, this.aByteArray70, arg0, arg0.length());
		this.aByteArray70[this.anInt4268++] = 0;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)B")
	public final byte method3625() {
		return (byte) -this.aByteArray70[this.anInt4268++];
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method3626(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4268;
		this.anInt4268 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3620(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local23.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt4268 = 0;
		this.method3614(local38.length);
		this.method3662(local38.length, local38);
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(II)V")
	public final void method3627(@OriginalArg(0) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 16);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 24);
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIJ)V")
	public final void method3628(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local6 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray70[this.anInt4268++] = (byte) (arg1 >> local29);
		}
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)I")
	public final int method3629() {
		this.anInt4268 += 2;
		@Pc(38) int local38 = ((this.aByteArray70[this.anInt4268 - 2] & 0xFF) << 8) + (this.aByteArray70[this.anInt4268 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(II)V")
	public final void method3630(@OriginalArg(1) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Ljava/lang/String;")
	public final String method3631() {
		if (this.aByteArray70[this.anInt4268] == 0) {
			this.anInt4268++;
			return null;
		} else {
			return this.method3671();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([IIII)V")
	public final void method3632(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt4268;
		this.anInt4268 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method3642();
			@Pc(30) int local30 = this.method3642();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= arg0[local32 >>> 11 & 0x2AC00003] + local32 ^ (local26 << 4 ^ local26 >>> 5) + local26;
				local32 -= -1640531527;
				local26 -= local30 + (local30 >>> 5 ^ local30 << 4) ^ arg0[local32 & 0x3] + local32;
			}
			this.anInt4268 -= 8;
			this.method3650(local26);
			this.method3650(local30);
		}
		this.anInt4268 = local8;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)I")
	public final int method3633() {
		@Pc(17) int local17 = this.aByteArray70[this.anInt4268] & 0xFF;
		return local17 < 128 ? this.method3643() : this.method3649() - 32768;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V")
	public final void method3634(@OriginalArg(1) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(II)V")
	public final void method3635(@OriginalArg(0) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 + 128);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)I")
	public final int method3636() {
		this.anInt4268 += 4;
		return ((this.aByteArray70[this.anInt4268 - 3] & 0xFF) << 8) + ((this.aByteArray70[this.anInt4268 - 1] & 0xFF) << 24) + ((this.aByteArray70[this.anInt4268 + -2] & 0xFF) << 16) + (this.aByteArray70[this.anInt4268 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "(II)V")
	public final void method3637(@OriginalArg(0) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)I")
	public final int method3638() {
		this.anInt4268 += 2;
		return ((this.aByteArray70[this.anInt4268 - 2] & 0xFF) << 8) + (this.aByteArray70[this.anInt4268 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)B")
	public final byte method3639() {
		return (byte) (128 - this.aByteArray70[this.anInt4268++]);
	}

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)I")
	public final int method3640() {
		this.anInt4268 += 2;
		return ((this.aByteArray70[this.anInt4268 - 1] & 0xFF) << 8) + (this.aByteArray70[this.anInt4268 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "(I)J")
	public final long method3641() {
		@Pc(10) long local10 = (long) this.method3642() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method3642() & 0xFFFFFFFFL;
		return local22 + (local10 << 32);
	}

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "(I)I")
	public final int method3642() {
		this.anInt4268 += 4;
		return (this.aByteArray70[this.anInt4268 - 1] & 0xFF) + ((this.aByteArray70[this.anInt4268 - 2] & 0xFF) << 8) + ((this.aByteArray70[this.anInt4268 + -4] & 0xFF) << 24) + ((this.aByteArray70[this.anInt4268 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)I")
	public final int method3643() {
		return this.aByteArray70[this.anInt4268++] & 0xFF;
	}

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "(II)V")
	public final void method3644(@OriginalArg(1) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 16);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "(I)I")
	public final int method3646() {
		@Pc(7) int local7 = 0;
		@Pc(18) int local18 = this.method3633();
		while (local18 == 32767) {
			local18 = this.method3633();
			local7 += 32767;
		}
		return local7 + local18;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)J")
	public final long method3647(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(19) int local19 = local6 * 8;
		@Pc(21) long local21 = 0L;
		while (local19 >= 0) {
			local21 |= ((long) this.aByteArray70[this.anInt4268++] & 0xFFL) << local19;
			local19 -= 8;
		}
		return local21;
	}

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "(I)I")
	public final int method3648() {
		return 128 - this.aByteArray70[this.anInt4268++] & 0xFF;
	}

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "(I)I")
	public final int method3649() {
		this.anInt4268 += 2;
		return (this.aByteArray70[this.anInt4268 - 1] & 0xFF) + ((this.aByteArray70[this.anInt4268 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(BI)V")
	public final void method3650(@OriginalArg(1) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 24);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 16);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[BBI)V")
	public final void method3651(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(8) int local8 = arg0 - 1; local8 >= 0; local8--) {
			arg1[local8] = (byte) (this.aByteArray70[this.anInt4268++] - 128);
		}
	}

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "(I)Z")
	public final boolean method3653() {
		this.anInt4268 -= 4;
		@Pc(26) int local26 = Static54.method918(this.aByteArray70, this.anInt4268, 0);
		@Pc(30) int local30 = this.method3642();
		return local30 == local26;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([II)V")
	public final void method3654(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt4268 / 8;
		this.anInt4268 = 0;
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			@Pc(26) int local26 = this.method3642();
			@Pc(30) int local30 = this.method3642();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local26 += (local30 >>> 5 ^ local30 << 4) + local30 ^ local32 + arg0[local32 & 0x3];
				local32 += -1640531527;
				local30 += local32 + arg0[local32 >>> 11 & 0x3] ^ (local26 >>> 5 ^ local26 << 4) + local26;
			}
			this.anInt4268 -= 8;
			this.method3650(local26);
			this.method3650(local30);
		}
	}

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "(II)V")
	public final void method3655(@OriginalArg(1) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 16);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IB)V")
	public final void method3656(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3614(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3660(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)I")
	public final int method3657() {
		@Pc(19) int local19 = this.aByteArray70[this.anInt4268] & 0xFF;
		return local19 < 128 ? this.method3643() - 64 : this.method3649() - 49152;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(BI)V")
	public final void method3658(@OriginalArg(1) int arg0) {
		this.aByteArray70[this.anInt4268 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray70[this.anInt4268 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray70[this.anInt4268 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray70[this.anInt4268 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "(I)I")
	public final int method3659() {
		this.anInt4268 += 3;
		return (this.aByteArray70[this.anInt4268 - 1] & 0xFF) + ((this.aByteArray70[this.anInt4268 - 2] & 0xFF) << 8) + ((this.aByteArray70[this.anInt4268 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V")
	public final void method3660(@OriginalArg(1) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(IB)V")
	public final void method3661(@OriginalArg(0) int arg0) {
		this.aByteArray70[this.anInt4268 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III[B)V")
	public final void method3662(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			this.aByteArray70[this.anInt4268++] = arg1[local12];
		}
	}

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "(II)V")
	public final void method3663(@OriginalArg(0) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "(II)V")
	public final void method3664(@OriginalArg(0) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "(I)Ljava/lang/String;")
	public final String method3665() {
		@Pc(14) byte local14 = this.aByteArray70[this.anInt4268++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt4268;
		while (this.aByteArray70[this.anInt4268++] != 0) {
		}
		@Pc(48) int local48 = this.anInt4268 - local29 - 1;
		return local48 == 0 ? "" : Static149.method2424(local29, this.aByteArray70, local48);
	}

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "(I)I")
	public final int method3666() {
		this.anInt4268 += 4;
		return (this.aByteArray70[this.anInt4268 - 3] & 0xFF) + ((this.aByteArray70[this.anInt4268 - 4] & 0xFF) << 8) + ((this.aByteArray70[this.anInt4268 - 2] & 0xFF) << 24) + ((this.aByteArray70[this.anInt4268 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(BI)V")
	public final void method3667(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3614(arg0 >>> 28 | 0x80);
					}
					this.method3614(arg0 >>> 21 | 0x80);
				}
				this.method3614(arg0 >>> 14 | 0x80);
			}
			this.method3614(arg0 >>> 7 | 0x80);
		}
		this.method3614(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IJ)V")
	public final void method3668(@OriginalArg(1) long arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 56);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 48);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 40);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 32);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 24);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 16);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(B)I")
	public final int method3669() {
		@Pc(24) byte local24 = this.aByteArray70[this.anInt4268++];
		@Pc(26) int local26 = 0;
		while (local24 < 0) {
			local26 = (local24 & 0x7F | local26) << 7;
			local24 = this.aByteArray70[this.anInt4268++];
		}
		return local26 | local24;
	}

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "(I)I")
	public final int method3670() {
		this.anInt4268 += 2;
		@Pc(38) int local38 = (this.aByteArray70[this.anInt4268 - 2] & 0xFF) + ((this.aByteArray70[this.anInt4268 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method3671() {
		@Pc(6) int local6 = this.anInt4268;
		while (this.aByteArray70[this.anInt4268++] != 0) {
		}
		@Pc(26) int local26 = this.anInt4268 - local6 - 1;
		return local26 == 0 ? "" : Static149.method2424(local6, this.aByteArray70, local26);
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(Z)I")
	public final int method3672() {
		return -this.aByteArray70[this.anInt4268++] & 0xFF;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(IB)V")
	public final void method3673(@OriginalArg(0) int arg0) {
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 8);
		this.aByteArray70[this.anInt4268++] = (byte) arg0;
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 24);
		this.aByteArray70[this.anInt4268++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(B)I")
	public final int method3674() {
		this.anInt4268 += 2;
		@Pc(33) int local33 = ((this.aByteArray70[this.anInt4268 - 1] & 0xFF) << 8) + (this.aByteArray70[this.anInt4268 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(Z)I")
	public final int method3675() {
		this.anInt4268 += 2;
		return (this.aByteArray70[this.anInt4268 - 2] - 128 & 0xFF) + ((this.aByteArray70[this.anInt4268 - 1] & 0xFF) << 8);
	}
}
