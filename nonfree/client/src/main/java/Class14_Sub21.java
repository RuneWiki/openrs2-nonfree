import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public class Class14_Sub21 extends Class14 {

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
	public int anInt8936;

	@OriginalMember(owner = "client!jc", name = "pb", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
	public Class14_Sub21(@OriginalArg(0) int arg0) {
		this.anInt8936 = 0;
		this.aByteArray99 = Static480.method7249(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
	public Class14_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray99 = arg0;
		this.anInt8936 = 0;
	}

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "(I)B")
	public final byte method7688() {
		return (byte) (128 - this.aByteArray99[this.anInt8936++]);
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)I")
	public final int method7689() {
		this.anInt8936 += 4;
		return ((this.aByteArray99[this.anInt8936 - 2] & 0xFF) << 24) - (-(this.aByteArray99[this.anInt8936 - 1] << 16 & 0xFF0000) - (this.aByteArray99[this.anInt8936 - 4] << 8 & 0xFF00) - (this.aByteArray99[this.anInt8936 + -3] & 0xFF));
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method7690(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr");
		}
		this.anInt8936 += Static656.method9164(this.aByteArray99, arg0.length(), this.anInt8936, arg0);
		this.aByteArray99[this.anInt8936++] = 0;
	}

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "(I)I")
	public final int method7691() {
		@Pc(14) int local14 = 0;
		@Pc(18) int local18;
		for (local18 = this.method7728(-129); local18 == 32767; local18 = this.method7728(-129)) {
			local14 += 32767;
		}
		return local14 + local18;
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(I)J")
	public final long method7692(@OriginalArg(0) int arg0) {
		@Pc(10) long local10 = (long) this.method7695(116) & 0xFFFFFFFFL;
		if (arg0 > -12) {
			this.method7755();
		}
		@Pc(26) long local26 = (long) this.method7748() & 0xFFFFFFFFL;
		return (local10 << 32) + local26;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(II)V")
	public final void method7694(@OriginalArg(0) int arg0) {
		this.aByteArray99[this.anInt8936 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray99[this.anInt8936 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray99[this.anInt8936 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray99[this.anInt8936 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "(I)I")
	public final int method7695(@OriginalArg(0) int arg0) {
		return arg0 < 93 ? 90 : this.aByteArray99[this.anInt8936++] & 0xFF;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(BI)V")
	public final void method7696(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 16);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method7697(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt8936;
		this.anInt8936 = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method7750(local13, 0, local19);
		@Pc(32) BigInteger local32 = new BigInteger(local19);
		@Pc(37) BigInteger local37 = local32.modPow(arg1, arg0);
		@Pc(40) byte[] local40 = local37.toByteArray();
		this.anInt8936 = 0;
		this.method7751(local40.length);
		this.method7743(0, local40, local40.length);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	public final void method7698(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method7747(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method7751(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(II)V")
	public final void method7699(@OriginalArg(0) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)J")
	public final long method7700() {
		@Pc(17) long local17 = (long) this.method7713() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method7713() & 0xFFFFFFFFL;
		return local17 + (local24 << 32);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IB)V")
	public final void method7701(@OriginalArg(0) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 16);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(BI)V")
	public final void method7702(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 + 128);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method7703(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt8936;
		while (this.aByteArray99[this.anInt8936++] != 0) {
		}
		@Pc(26) int local26 = this.anInt8936 - local6 - 1;
		return arg0 == local26 ? "" : Static490.method7391(local26, local6, this.aByteArray99);
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)I")
	public final int method7704() {
		if (this.aByteArray99[this.anInt8936] < 0) {
			return this.method7748() & Integer.MAX_VALUE;
		} else {
			@Pc(33) int local33 = this.method7717(-1978450544);
			return local33 == 32767 ? -1 : local33;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(ZI)V")
	public final void method7705(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "(I)Ljava/lang/String;")
	public final String method7706() {
		if (this.aByteArray99[this.anInt8936] == 0) {
			this.anInt8936++;
			return null;
		} else {
			return this.method7703(0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "(I)Z")
	public final boolean method7707() {
		this.anInt8936 -= 4;
		@Pc(25) int local25 = Static258.method4328(this.aByteArray99, this.anInt8936, 0);
		@Pc(29) int local29 = this.method7748();
		return local29 == local25;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(Z)I")
	public final int method7708() {
		this.anInt8936 += 2;
		return ((this.aByteArray99[this.anInt8936 - 1] & 0xFF) << 8) + (this.aByteArray99[this.anInt8936 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIIZ)V")
	public final void method7710(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anInt8936;
		this.anInt8936 = arg2;
		@Pc(23) int local23 = (arg1 - arg2) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(30) int local30 = this.method7748();
			@Pc(39) int local39 = this.method7748();
			@Pc(41) int local41 = 0;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local30 += local39 + (local39 >>> 5 ^ local39 << 4) ^ arg0[local41 & 0x3] + local41;
				local41 += -1640531527;
				local39 += arg0[local41 >>> 11 & 0x3] + local41 ^ (local30 >>> 5 ^ local30 << 4) + local30;
			}
			this.anInt8936 -= 8;
			this.method7730(local30);
			this.method7730(local39);
		}
		this.anInt8936 = local6;
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(II)V")
	public final void method7711(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 24);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)I")
	public final int method7712() {
		this.anInt8936 += 2;
		return (this.aByteArray99[this.anInt8936 - 2] & 0xFF) + ((this.aByteArray99[this.anInt8936 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)I")
	public final int method7713() {
		this.anInt8936 += 4;
		return ((this.aByteArray99[this.anInt8936 - 1] & 0xFF) << 24) + (((this.aByteArray99[this.anInt8936 - 2] & 0xFF) << 16) + ((this.aByteArray99[this.anInt8936 - 3] & 0xFF) << 8) + (this.aByteArray99[this.anInt8936 - 4] & 0xFF));
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)I")
	public final int method7714() {
		return -this.aByteArray99[this.anInt8936++] & 0xFF;
	}

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "(II)V")
	public final void method7715(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(BI)V")
	public final void method7716(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray99[this.anInt8936 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "(I)I")
	public final int method7717(@OriginalArg(0) int arg0) {
		if (arg0 != -1978450544) {
			this.method7692(1);
		}
		this.anInt8936 += 2;
		return (this.aByteArray99[this.anInt8936 - 1] & 0xFF) + ((this.aByteArray99[this.anInt8936 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[BII)V")
	public final void method7718(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			arg0[local16] = (byte) (this.aByteArray99[this.anInt8936++] - 128);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)I")
	public final int method7719() {
		this.anInt8936 += 3;
		return (this.aByteArray99[this.anInt8936 - 1] & 0xFF) + ((this.aByteArray99[this.anInt8936 - 2] & 0xFF) << 8) + ((this.aByteArray99[this.anInt8936 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "(I)B")
	public final byte method7720() {
		return this.aByteArray99[this.anInt8936++];
	}

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "(II)V")
	public final void method7721(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 16);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(II)V")
	public final void method7722(@OriginalArg(0) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method7723(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr2");
		}
		this.aByteArray99[this.anInt8936++] = 0;
		this.anInt8936 += Static656.method9164(this.aByteArray99, arg0.length(), this.anInt8936, arg0);
		this.aByteArray99[this.anInt8936++] = 0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	public final void method7724(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method7747(arg0 >>> 28 | 0x80);
					}
					this.method7747(arg0 >>> 21 | 0x80);
				}
				this.method7747(arg0 >>> 14 | 0x80);
			}
			this.method7747(arg0 >>> 7 | 0x80);
		}
		this.method7747(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(JII)V")
	public final void method7725(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(23) int local23 = local0 * 8; local23 >= 0; local23 -= 8) {
			this.aByteArray99[this.anInt8936++] = (byte) (int) (arg0 >> local23);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
	public final int method7726() {
		this.anInt8936 += 4;
		return ((this.aByteArray99[this.anInt8936 - 1] & 0xFF) << 8) + (this.aByteArray99[this.anInt8936 - 3] << 24 & 0xFF000000) + ((this.aByteArray99[this.anInt8936 + -4] & 0xFF) << 16) + (this.aByteArray99[this.anInt8936 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "(I)I")
	public final int method7727() {
		this.anInt8936 += 2;
		@Pc(31) int local31 = ((this.aByteArray99[this.anInt8936 - 1] & 0xFF) << 8) + (this.aByteArray99[this.anInt8936 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "(I)I")
	public final int method7728(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.aByteArray99[this.anInt8936] & 0xFF;
		return ~local11 > arg0 ? this.method7695(95) : this.method7717(-1978450544) - 32768;
	}

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "(I)J")
	public final long method7729() {
		@Pc(10) long local10 = (long) this.method7748() & 0xFFFFFFFFL;
		@Pc(27) long local27 = (long) this.method7748() & 0xFFFFFFFFL;
		return local27 + (local10 << 32);
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(II)V")
	public final void method7730(@OriginalArg(0) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 24);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 16);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)I")
	public final int method7731() {
		this.anInt8936 += 4;
		return ((this.aByteArray99[this.anInt8936 - 2] & 0xFF) << 16) + ((this.aByteArray99[this.anInt8936 - 1] & 0xFF) << 24) + ((this.aByteArray99[this.anInt8936 + -3] & 0xFF) << 8) + (this.aByteArray99[this.anInt8936 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)V")
	public final void method7732(@OriginalArg(0) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(II)V")
	public final void method7733(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)B")
	public final byte method7734() {
		return (byte) -this.aByteArray99[this.anInt8936++];
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(JB)V")
	public final void method7735(@OriginalArg(0) long arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (int) (arg0 >> 56);
		this.aByteArray99[this.anInt8936++] = (byte) (int) (arg0 >> 48);
		this.aByteArray99[this.anInt8936++] = (byte) (int) (arg0 >> 40);
		this.aByteArray99[this.anInt8936++] = (byte) (int) (arg0 >> 32);
		this.aByteArray99[this.anInt8936++] = (byte) (int) (arg0 >> 24);
		this.aByteArray99[this.anInt8936++] = (byte) (int) (arg0 >> 16);
		this.aByteArray99[this.anInt8936++] = (byte) (int) (arg0 >> 8);
		this.aByteArray99[this.anInt8936++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)B")
	public final byte method7736() {
		return (byte) (this.aByteArray99[this.anInt8936++] - 128);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(BI)V")
	public final void method7737(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "(I)I")
	public final int method7738(@OriginalArg(0) int arg0) {
		return arg0 == 1275460792 ? this.aByteArray99[this.anInt8936++] - 128 & 0xFF : -18;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)Ljava/lang/String;")
	public final String method7739() {
		@Pc(23) byte local23 = this.aByteArray99[this.anInt8936++];
		if (local23 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(39) int local39 = this.anInt8936;
		while (this.aByteArray99[this.anInt8936++] != 0) {
		}
		@Pc(62) int local62 = this.anInt8936 - local39 - 1;
		return local62 == 0 ? "" : Static490.method7391(local62, local39, this.aByteArray99);
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(II)I")
	public final int method7740(@OriginalArg(0) int arg0) {
		@Pc(20) int local20 = Static258.method4328(this.aByteArray99, this.anInt8936, arg0);
		this.method7730(local20);
		return local20;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(Z)I")
	public final int method7741() {
		@Pc(14) byte local14 = this.aByteArray99[this.anInt8936++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray99[this.anInt8936++];
		}
		return local14 | local16;
	}

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "(I)V")
	public final void method7742() {
		if (this.aByteArray99 != null) {
			Static480.method7250(this.aByteArray99);
		}
		this.aByteArray99 = null;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II[BI)V")
	public final void method7743(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(1) int local1 = arg0; local1 < arg0 + arg2; local1++) {
			this.aByteArray99[this.anInt8936++] = arg1[local1];
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)J")
	public final long method7744(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local6 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray99[this.anInt8936++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V")
	public final void method7745(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 16);
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 24);
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(I)I")
	public final int method7746() {
		this.anInt8936 += 3;
		return ((this.aByteArray99[this.anInt8936 - 1] & 0xFF) << 8) + ((this.aByteArray99[this.anInt8936 - 3] & 0xFF) << 16) + (this.aByteArray99[this.anInt8936 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public final void method7747(@OriginalArg(0) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(Z)I")
	public final int method7748() {
		this.anInt8936 += 4;
		return ((this.aByteArray99[this.anInt8936 - 2] & 0xFF) << 8) + ((this.aByteArray99[this.anInt8936 - 3] & 0xFF) << 16) + ((this.aByteArray99[this.anInt8936 + -4] & 0xFF) << 24) + (this.aByteArray99[this.anInt8936 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "(I)I")
	public final int method7749(@OriginalArg(0) int arg0) {
		if (arg0 != -16669) {
			this.anInt8936 = 41;
		}
		return 128 - this.aByteArray99[this.anInt8936++] & 0xFF;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BI)V")
	public final void method7750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg0; local1++) {
			arg2[local1] = this.aByteArray99[this.anInt8936++];
		}
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(II)V")
	public final void method7751(@OriginalArg(1) int arg0) {
		this.aByteArray99[this.anInt8936++] = (byte) (arg0 >> 8);
		this.aByteArray99[this.anInt8936++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "(I)I")
	public final int method7752() {
		this.anInt8936 += 2;
		@Pc(31) int local31 = (this.aByteArray99[this.anInt8936 - 1] & 0xFF) + ((this.aByteArray99[this.anInt8936 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)I")
	public final int method7753() {
		@Pc(11) int local11 = this.aByteArray99[this.anInt8936] & 0xFF;
		return local11 >= 128 ? this.method7717(-1978450544) - 49152 : this.method7695(102) + -64;
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(B)I")
	public final int method7754() {
		this.anInt8936 += 2;
		return ((this.aByteArray99[this.anInt8936 - 2] & 0xFF) << 8) + (this.aByteArray99[this.anInt8936 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(Z)I")
	public final int method7755() {
		this.anInt8936 += 3;
		@Pc(51) int local51 = ((this.aByteArray99[this.anInt8936 - 3] & 0xFF) << 16) + (this.aByteArray99[this.anInt8936 - 2] << 8 & 0xFF00) + (this.aByteArray99[this.anInt8936 - 1] & 0xFF);
		if (local51 > 8388607) {
			local51 -= 16777216;
		}
		return local51;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[II)V")
	public final void method7756(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) int local6 = this.anInt8936;
		this.anInt8936 = 5;
		@Pc(16) int local16 = (arg1 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			@Pc(30) int local30 = this.method7748();
			@Pc(34) int local34 = this.method7748();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= local36 + arg0[local36 >>> 11 & 0x3] ^ local30 + (local30 >>> 5 ^ local30 << 4);
				local36 -= -1640531527;
				local30 -= arg0[local36 & 0x3] + local36 ^ local34 + (local34 >>> 5 ^ local34 << 4);
			}
			this.anInt8936 -= 8;
			this.method7730(local30);
			this.method7730(local34);
		}
		this.anInt8936 = local6;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[I)V")
	public final void method7757(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt8936 / 8;
		this.anInt8936 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(21) int local21 = this.method7748();
			@Pc(25) int local25 = this.method7748();
			@Pc(27) int local27 = -957401312;
			@Pc(31) int local31 = 32;
			while (local31-- > 0) {
				local25 -= (local21 << 4 ^ local21 >>> 5) + local21 ^ local27 - -arg0[local27 >>> 11 & 0x3];
				local27 -= -1640531527;
				local21 -= local25 + (local25 >>> 5 ^ local25 << 4) ^ arg0[local27 & 0x3] + local27;
			}
			this.anInt8936 -= 8;
			this.method7730(local21);
			this.method7730(local25);
		}
	}
}
