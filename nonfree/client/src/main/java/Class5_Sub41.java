import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public class Class5_Sub41 extends Class5 {

	@OriginalMember(owner = "client!mc", name = "xb", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	public int anInt9230;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
	public Class5_Sub41(@OriginalArg(0) int arg0) {
		this.aByteArray93 = Static637.method8570(arg0);
		this.anInt9230 = 0;
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
	public Class5_Sub41(@OriginalArg(0) byte[] arg0) {
		this.anInt9230 = 0;
		this.aByteArray93 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I")
	public final int method7796() {
		this.anInt9230 += 2;
		return ((this.aByteArray93[this.anInt9230 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt9230 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)J")
	public final long method7797(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(20) int local20 = local0 * 8;
		@Pc(22) long local22 = 0L;
		while (local20 >= 0) {
			local22 |= ((long) this.aByteArray93[this.anInt9230++] & 0xFFL) << local20;
			local20 -= 8;
		}
		return local22;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
	public final void method7798(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I")
	public final int method7799() {
		return -this.aByteArray93[this.anInt9230++] & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
	public final void method7800(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)I")
	public final int method7801() {
		this.anInt9230 += 3;
		@Pc(48) int local48 = (this.aByteArray93[this.anInt9230 - 1] & 0xFF) + ((this.aByteArray93[this.anInt9230 - 2] & 0xFF) << 8) + ((this.aByteArray93[this.anInt9230 + -3] & 0xFF) << 16);
		if (local48 > 8388607) {
			local48 -= 16777216;
		}
		return local48;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB[B)V")
	public final void method7802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg0 + arg1; local1++) {
			arg2[local1] = this.aByteArray93[this.anInt9230++];
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)V")
	public final void method7803(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)I")
	public final int method7804() {
		this.anInt9230 += 4;
		return (this.aByteArray93[this.anInt9230 - 1] & 0xFF) + ((this.aByteArray93[this.anInt9230 - 3] & 0xFF) << 16) + ((this.aByteArray93[this.anInt9230 + -4] & 0xFF) << 24) + ((this.aByteArray93[this.anInt9230 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BIJ)V")
	public final void method7805(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(11) int local11 = arg0 - 1;
		if (local11 < 0 || local11 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local11 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray93[this.anInt9230++] = (byte) (int) (arg1 >> local27);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)V")
	public final void method7806(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)I")
	public final int method7807() {
		this.anInt9230 += 3;
		return ((this.aByteArray93[this.anInt9230 - 2] & 0xFF) << 8) + ((this.aByteArray93[this.anInt9230 - 3] & 0xFF) << 16) + (this.aByteArray93[this.anInt9230 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)J")
	public final long method7808() {
		@Pc(10) long local10 = (long) this.method7816() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method7804() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)V")
	public final void method7809(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)B")
	public final byte method7810() {
		return (byte) (128 - this.aByteArray93[this.anInt9230++]);
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)B")
	public final byte method7811() {
		return (byte) (this.aByteArray93[this.anInt9230++] - 128);
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)I")
	public final int method7812() {
		@Pc(17) int local17 = this.aByteArray93[this.anInt9230] & 0xFF;
		return local17 >= 128 ? this.method7860() - 32768 : this.method7816();
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)Ljava/lang/String;")
	public final String method7813() {
		@Pc(14) byte local14 = this.aByteArray93[this.anInt9230++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt9230;
		while (this.aByteArray93[this.anInt9230++] != 0) {
		}
		@Pc(52) int local52 = this.anInt9230 - local32 - 1;
		return local52 == 0 ? "" : Static602.method8247(local52, this.aByteArray93, local32);
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(II)V")
	public final void method7814(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 + 128);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method7815() {
		if (this.aByteArray93[this.anInt9230] == 0) {
			this.anInt9230++;
			return null;
		} else {
			return this.method7847();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)I")
	public final int method7816() {
		return this.aByteArray93[this.anInt9230++] & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)I")
	public final int method7817() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method7812();
		while (local11 == 32767) {
			local11 = this.method7812();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "(I)I")
	public final int method7818() {
		return 128 - this.aByteArray93[this.anInt9230++] & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "(I)B")
	public final byte method7819() {
		return (byte) -this.aByteArray93[this.anInt9230++];
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Z)Z")
	public final boolean method7820() {
		this.anInt9230 -= 4;
		@Pc(17) int local17 = Static633.method8532(this.aByteArray93, this.anInt9230, 0);
		@Pc(21) int local21 = this.method7804();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(IB)V")
	public final void method7821(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V")
	public final void method7822(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "(I)J")
	public final long method7823() {
		@Pc(15) long local15 = (long) this.method7804() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method7804() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZJ)V")
	public final void method7824(@OriginalArg(1) long arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (int) (arg0 >> 56);
		this.aByteArray93[this.anInt9230++] = (byte) (int) (arg0 >> 48);
		this.aByteArray93[this.anInt9230++] = (byte) (int) (arg0 >> 40);
		this.aByteArray93[this.anInt9230++] = (byte) (int) (arg0 >> 32);
		this.aByteArray93[this.anInt9230++] = (byte) (int) (arg0 >> 24);
		this.aByteArray93[this.anInt9230++] = (byte) (int) (arg0 >> 16);
		this.aByteArray93[this.anInt9230++] = (byte) (int) (arg0 >> 8);
		this.aByteArray93[this.anInt9230++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "(I)J")
	public final long method7825() {
		@Pc(15) long local15 = (long) this.method7857() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method7857() & 0xFFFFFFFFL;
		return local15 + (local22 << 32);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method7826(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray93[this.anInt9230++] = 0;
		this.anInt9230 += Static514.method7307(this.aByteArray93, arg0.length(), arg0, this.anInt9230);
		this.aByteArray93[this.anInt9230++] = 0;
	}

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "(I)I")
	public final int method7827() {
		this.anInt9230 += 3;
		return ((this.aByteArray93[this.anInt9230 - 1] & 0xFF) << 8) + (((this.aByteArray93[this.anInt9230 - 3] & 0xFF) << 16) + (this.aByteArray93[this.anInt9230 - 2] & 0xFF));
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)V")
	public final void method7828(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "(I)I")
	public final int method7829() {
		return this.aByteArray93[this.anInt9230++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(II)I")
	public final int method7830(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static633.method8532(this.aByteArray93, this.anInt9230, arg0);
		this.method7803(local16);
		return local16;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(Z)I")
	public final int method7832() {
		@Pc(21) byte local21 = this.aByteArray93[this.anInt9230++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray93[this.anInt9230++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)I")
	public final int method7833() {
		this.anInt9230 += 4;
		return ((this.aByteArray93[this.anInt9230 - 4] & 0xFF) << 8) + (this.aByteArray93[this.anInt9230 - 2] << 24 & 0xFF000000) + ((this.aByteArray93[this.anInt9230 + -1] & 0xFF) << 16) + (this.aByteArray93[this.anInt9230 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "(I)I")
	public final int method7834() {
		this.anInt9230 += 4;
		return (this.aByteArray93[this.anInt9230 - 2] & 0xFF) + ((this.aByteArray93[this.anInt9230 - 3] & 0xFF) << 24) + ((this.aByteArray93[this.anInt9230 + -4] & 0xFF) << 16) + ((this.aByteArray93[this.anInt9230 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "(I)V")
	public final void method7835() {
		if (this.aByteArray93 != null) {
			Static637.method8572(this.aByteArray93);
		}
		this.aByteArray93 = null;
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(II)V")
	public final void method7836(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method7798(arg0 >>> 28 | 0x80);
					}
					this.method7798(arg0 >>> 21 | 0x80);
				}
				this.method7798(arg0 >>> 14 | 0x80);
			}
			this.method7798(arg0 >>> 7 | 0x80);
		}
		this.method7798(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[BI)V")
	public final void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(9) int local9 = arg0; local9 < arg0 + arg1; local9++) {
			this.aByteArray93[this.anInt9230++] = arg2[local9];
		}
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(B)I")
	public final int method7838() {
		this.anInt9230 += 2;
		return ((this.aByteArray93[this.anInt9230 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt9230 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(II)V")
	public final void method7839(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(IB)V")
	public final void method7840(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(II)V")
	public final void method7841(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt9230 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(II)V")
	public final void method7842(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(IB)V")
	public final void method7843(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[III)V")
	public final void method7844(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anInt9230;
		this.anInt9230 = arg0;
		@Pc(22) int local22 = (arg2 - arg0) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(29) int local29 = this.method7804();
			@Pc(33) int local33 = this.method7804();
			@Pc(35) int local35 = 0;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local29 += local35 + arg1[local35 & 0x3] ^ (local33 << 4 ^ local33 >>> 5) + local33;
				local35 += -1640531527;
				local33 += local35 + arg1[local35 >>> 11 & 0x3] ^ local29 + (local29 << 4 ^ local29 >>> 5);
			}
			this.anInt9230 -= 8;
			this.method7803(local29);
			this.method7803(local33);
		}
		this.anInt9230 = local6;
	}

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "(I)I")
	public final int method7845() {
		@Pc(16) int local16 = this.aByteArray93[this.anInt9230] & 0xFF;
		return local16 < 128 ? this.method7816() - 64 : this.method7860() + -49152;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IZ)V")
	public final void method7846(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method7798(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method7848(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method7847() {
		@Pc(6) int local6 = this.anInt9230;
		while (this.aByteArray93[this.anInt9230++] != 0) {
		}
		@Pc(29) int local29 = this.anInt9230 - local6 - 1;
		return local29 == 0 ? "" : Static602.method8247(local29, this.aByteArray93, local6);
	}

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "(II)V")
	public final void method7848(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "(I)I")
	public final int method7849() {
		this.anInt9230 += 2;
		@Pc(36) int local36 = (this.aByteArray93[this.anInt9230 - 1] & 0xFF) + ((this.aByteArray93[this.anInt9230 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "(II)V")
	public final void method7850(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "(I)I")
	public final int method7851() {
		this.anInt9230 += 2;
		@Pc(32) int local32 = ((this.aByteArray93[this.anInt9230 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt9230 - 2] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(B)I")
	public final int method7852() {
		this.anInt9230 += 2;
		@Pc(37) int local37 = (this.aByteArray93[this.anInt9230 - 2] - 128 & 0xFF) + ((this.aByteArray93[this.anInt9230 - 1] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method7853(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt9230;
		this.anInt9230 = 0;
		@Pc(17) byte[] local17 = new byte[local6];
		this.method7802(local6, 0, local17);
		@Pc(28) BigInteger local28 = new BigInteger(local17);
		@Pc(33) BigInteger local33 = local28.modPow(arg0, arg1);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt9230 = 0;
		this.method7848(local36.length);
		this.method7837(0, local36.length, local36);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method7854(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt9230 += Static514.method7307(this.aByteArray93, arg0.length(), arg0, this.anInt9230);
		this.aByteArray93[this.anInt9230++] = 0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III[I)V")
	public final void method7855(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(14) int local14 = this.anInt9230;
		this.anInt9230 = 5;
		@Pc(24) int local24 = (arg0 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(31) int local31 = this.method7804();
			@Pc(35) int local35 = this.method7804();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= local37 + arg1[local37 >>> 11 & 0x3] ^ (local31 << 4 ^ local31 >>> 5) - -local31;
				local37 -= -1640531527;
				local31 -= arg1[local37 & 0x3] + local37 ^ local35 + (local35 >>> 5 ^ local35 << 4);
			}
			this.anInt9230 -= 8;
			this.method7803(local31);
			this.method7803(local35);
		}
		this.anInt9230 = local14;
	}

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "(II)V")
	public final void method7856(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230++] = (byte) arg0;
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt9230++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "(I)I")
	public final int method7857() {
		this.anInt9230 += 4;
		return ((this.aByteArray93[this.anInt9230 - 2] & 0xFF) << 16) + (((this.aByteArray93[this.anInt9230 - 1] & 0xFF) << 24) - (-((this.aByteArray93[this.anInt9230 - 3] & 0xFF) << 8) - (this.aByteArray93[this.anInt9230 - 4] & 0xFF)));
	}

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "(I)I")
	public final int method7858() {
		this.anInt9230 += 2;
		return (this.aByteArray93[this.anInt9230 - 1] - 128 & 0xFF) + ((this.aByteArray93[this.anInt9230 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(B)I")
	public final int method7859() {
		this.anInt9230 += 4;
		return (this.aByteArray93[this.anInt9230 - 4] & 0xFF) + ((this.aByteArray93[this.anInt9230 - 2] & 0xFF) << 16) + ((this.aByteArray93[this.anInt9230 + -1] & 0xFF) << 24) + ((this.aByteArray93[this.anInt9230 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "(B)I")
	public final int method7860() {
		this.anInt9230 += 2;
		return ((this.aByteArray93[this.anInt9230 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt9230 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "(I)B")
	public final byte method7861() {
		return this.aByteArray93[this.anInt9230++];
	}

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "(II)V")
	public final void method7863(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt9230 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt9230 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt9230 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt9230 - arg0 - 1] = (byte) arg0;
	}
}
