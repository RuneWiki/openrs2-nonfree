import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
	public int anInt964 = 0;

	@OriginalMember(owner = "client!ob", name = "lb", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7(@OriginalArg(0) int arg0) {
		this.aByteArray15 = Static30.method668(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
	public Class3_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray15 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!na;)V")
	public final void method598(@OriginalArg(1) Class53 arg0) {
		this.anInt964 += arg0.method1298(this.aByteArray15, arg0.method1294(), this.anInt964);
		this.aByteArray15[this.anInt964++] = 0;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)B")
	public final byte method599() {
		return (byte) (128 - this.aByteArray15[this.anInt964++]);
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)I")
	public final int method600() {
		this.anInt964 += 4;
		return (this.aByteArray15[this.anInt964 - 3] & 0xFF) + ((this.aByteArray15[this.anInt964 - 4] & 0xFF) << 8) + ((this.aByteArray15[this.anInt964 + -1] & 0xFF) << 16) + ((this.aByteArray15[this.anInt964 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III[B)V")
	public final void method601(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aByteArray15[this.anInt964++] = arg1[local1];
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)I")
	public final int method602() {
		this.anInt964 += 2;
		return ((this.aByteArray15[this.anInt964 - 2] & 0xFF) << 8) + (this.aByteArray15[this.anInt964 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)I")
	public final int method603() {
		this.anInt964 += 3;
		return (this.aByteArray15[this.anInt964 - 2] & 0xFF) + ((this.aByteArray15[this.anInt964 - 1] & 0xFF) << 8) + ((this.aByteArray15[this.anInt964 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)I")
	public final int method604() {
		return -this.aByteArray15[this.anInt964++] & 0xFF;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)Lclient!na;")
	public final Class53 method605() {
		@Pc(2) int local2 = this.anInt964;
		while (this.aByteArray15[this.anInt964++] != 0) {
		}
		return Static111.method1787(this.aByteArray15, local2, this.anInt964 - local2 - 1);
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)I")
	public final int method606() {
		this.anInt964 += 4;
		return ((this.aByteArray15[this.anInt964 - 3] & 0xFF) << 8) + ((this.aByteArray15[this.anInt964 - 2] & 0xFF) << 16) + ((this.aByteArray15[this.anInt964 + -1] & 0xFF) << 24) + (this.aByteArray15[this.anInt964 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)J")
	public final long method607() {
		@Pc(10) long local10 = (long) this.method638() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method638() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)I")
	public final int method608() {
		@Pc(21) byte local21 = this.aByteArray15[this.anInt964++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray15[this.anInt964++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method609(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt964;
		this.anInt964 = 0;
		@Pc(17) byte[] local17 = new byte[local6];
		this.method620(local6, local17);
		@Pc(28) BigInteger local28 = new BigInteger(local17);
		@Pc(33) BigInteger local33 = local28.modPow(arg0, arg1);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt964 = 0;
		this.method625(local36.length);
		this.method601(local36.length, local36);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)I")
	public final int method610() {
		this.anInt964 += 2;
		@Pc(31) int local31 = ((this.aByteArray15[this.anInt964 - 1] & 0xFF) << 8) + (this.aByteArray15[this.anInt964 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(Z)I")
	public final int method611() {
		this.anInt964 += 2;
		return ((this.aByteArray15[this.anInt964 - 1] & 0xFF) << 8) + (this.aByteArray15[this.anInt964 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(B)I")
	public final int method612() {
		return 128 - this.aByteArray15[this.anInt964++] & 0xFF;
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(B)I")
	public final int method614() {
		this.anInt964 += 2;
		@Pc(38) int local38 = (this.aByteArray15[this.anInt964 - 1] - 128 & 0xFF) + ((this.aByteArray15[this.anInt964 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public final void method615(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 16);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 24);
		this.aByteArray15[this.anInt964++] = (byte) arg0;
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)I")
	public final int method617() {
		this.anInt964 += 2;
		return (this.aByteArray15[this.anInt964 - 1] - 128 & 0xFF) + ((this.aByteArray15[this.anInt964 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V")
	public final void method618(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "(I)I")
	public final int method619() {
		@Pc(18) int local18 = this.aByteArray15[this.anInt964] & 0xFF;
		return local18 >= 128 ? this.method602() - 32768 : this.method647();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[BII)V")
	public final void method620(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray15[this.anInt964++];
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)V")
	public final void method621(@OriginalArg(0) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)V")
	public final void method622(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
		this.aByteArray15[this.anInt964++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)V")
	public final void method623(@OriginalArg(0) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
		this.aByteArray15[this.anInt964++] = (byte) arg0;
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 24);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "(B)B")
	public final byte method624() {
		return this.aByteArray15[this.anInt964++];
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IZ)V")
	public final void method625(@OriginalArg(0) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(II)V")
	public final void method628(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method625(arg0 >>> 28 | 0x80);
					}
					this.method625(arg0 >>> 21 | 0x80);
				}
				this.method625(arg0 >>> 14 | 0x80);
			}
			this.method625(arg0 >>> 7 | 0x80);
		}
		this.method625(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(II)V")
	public final void method629(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 16);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
		this.aByteArray15[this.anInt964++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "(I)B")
	public final byte method630() {
		return (byte) -this.aByteArray15[this.anInt964++];
	}

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "(I)B")
	public final byte method631() {
		return (byte) (this.aByteArray15[this.anInt964++] - 128);
	}

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "(B)I")
	public final int method632() {
		this.anInt964 += 4;
		return ((this.aByteArray15[this.anInt964 - 4] & 0xFF) << 16) + ((this.aByteArray15[this.anInt964 - 3] & 0xFF) << 24) + ((this.aByteArray15[this.anInt964 + -1] & 0xFF) << 8) + (this.aByteArray15[this.anInt964 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(JB)V")
	public final void method633(@OriginalArg(0) long arg0) {
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 56);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 48);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 40);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 32);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 24);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 16);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
		this.aByteArray15[this.anInt964++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B[III)V")
	public final void method634(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt964;
		this.anInt964 = 5;
		@Pc(17) int local17 = (arg1 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(23) int local23 = -957401312;
			@Pc(29) int local29 = this.method638();
			@Pc(33) int local33 = 32;
			@Pc(39) int local39 = this.method638();
			while (local33-- > 0) {
				local39 -= (local29 >>> 5 ^ local29 << 4) + local29 ^ local23 - -arg0[local23 >>> 11 & 0x3];
				local23 -= -1640531527;
				local29 -= local39 + (local39 >>> 5 ^ local39 << 4) ^ local23 + arg0[local23 & 0x3];
			}
			this.anInt964 -= 8;
			this.method642(local29);
			this.method642(local39);
		}
		this.anInt964 = local8;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(Z)I")
	public final int method635() {
		@Pc(18) int local18 = this.aByteArray15[this.anInt964] & 0xFF;
		return local18 < 128 ? this.method647() - 64 : this.method602() + -49152;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(BI)V")
	public final void method636(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray15[this.anInt964 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray15[this.anInt964 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray15[this.anInt964 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "(I)I")
	public final int method638() {
		this.anInt964 += 4;
		return ((this.aByteArray15[this.anInt964 - 3] & 0xFF) << 16) + ((this.aByteArray15[this.anInt964 - 4] & 0xFF) << 24) + ((this.aByteArray15[this.anInt964 + -2] & 0xFF) << 8) + (this.aByteArray15[this.anInt964 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "(B)I")
	public final int method639() {
		this.anInt964 += 3;
		return (this.aByteArray15[this.anInt964 - 1] & 0xFF) + ((this.aByteArray15[this.anInt964 - 3] & 0xFF) << 16) + ((this.aByteArray15[this.anInt964 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)V")
	public final void method640(@OriginalArg(0) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I[BII)V")
	public final void method641(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = this.aByteArray15[this.anInt964++];
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
	public final void method642(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 24);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 16);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
		this.aByteArray15[this.anInt964++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIBI)V")
	public final void method643(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = (byte) (this.aByteArray15[this.anInt964++] - 128);
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(ZI)V")
	public final void method644(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) (arg0 + 128);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(II)V")
	public final void method645(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method625(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method622(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(ZI)V")
	public final void method646(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) arg0;
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 16);
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "(I)I")
	public final int method647() {
		return this.aByteArray15[this.anInt964++] & 0xFF;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(BI)V")
	public final void method648(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "(I)I")
	public final int method649() {
		this.anInt964 += 2;
		@Pc(35) int local35 = ((this.aByteArray15[this.anInt964 - 2] & 0xFF) << 8) + (this.aByteArray15[this.anInt964 - 1] & 0xFF);
		if (local35 > 32767) {
			local35 -= 65536;
		}
		return local35;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(BI)V")
	public final void method650(@OriginalArg(1) int arg0) {
		this.aByteArray15[this.anInt964++] = (byte) arg0;
		this.aByteArray15[this.anInt964++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "(I)I")
	public final int method651() {
		this.anInt964 += 2;
		return ((this.aByteArray15[this.anInt964 - 1] & 0xFF) << 8) + (this.aByteArray15[this.anInt964 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "(I)I")
	public final int method652() {
		return this.aByteArray15[this.anInt964++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(ZI)I")
	public final int method654(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = Static57.method1048(this.anInt964, arg0, this.aByteArray15);
		this.method642(local17);
		return local17;
	}
}
