import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!ek", name = "vb", descriptor = "I")
	public int anInt9170 = 0;

	@OriginalMember(owner = "client!ek", name = "Eb", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(I)V")
	public Class4_Sub13(@OriginalArg(0) int arg0) {
		this.aByteArray88 = Static386.method5961(arg0);
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "([B)V")
	public Class4_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray88 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
	public final int method6987() {
		return 128 - this.aByteArray88[this.anInt9170++] & 0xFF;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[BZI)V")
	public final void method6988(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray88[this.anInt9170++] - 128);
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
	public final int method6989() {
		this.anInt9170 += 4;
		return ((this.aByteArray88[this.anInt9170 - 4] & 0xFF) << 16) + ((this.aByteArray88[this.anInt9170 - 3] & 0xFF) << 24) + ((this.aByteArray88[this.anInt9170 - 1] & 0xFF) << 8) + (this.aByteArray88[this.anInt9170 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)I")
	public final int method6990() {
		this.anInt9170 += 4;
		return ((this.aByteArray88[this.anInt9170 - 4] & 0xFF) << 24) + ((this.aByteArray88[this.anInt9170 - 3] & 0xFF) << 16) + ((this.aByteArray88[this.anInt9170 + -2] & 0xFF) << 8) + (this.aByteArray88[this.anInt9170 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)V")
	public final void method6991(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method6992(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray88[this.anInt9170++] = 0;
		this.anInt9170 += Static454.method6672(this.aByteArray88, arg0.length(), this.anInt9170, arg0);
		this.aByteArray88[this.anInt9170++] = 0;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)I")
	public final int method6993() {
		this.anInt9170 += 4;
		return (this.aByteArray88[this.anInt9170 - 3] & 0xFF) + ((this.aByteArray88[this.anInt9170 - 4] & 0xFF) << 8) + ((this.aByteArray88[this.anInt9170 - 1] & 0xFF) << 16) + ((this.aByteArray88[this.anInt9170 + -2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public final void method6994(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method7052(arg0 >>> 28 | 0x80);
					}
					this.method7052(arg0 >>> 21 | 0x80);
				}
				this.method7052(arg0 >>> 14 | 0x80);
			}
			this.method7052(arg0 >>> 7 | 0x80);
		}
		this.method7052(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
	public final int method6995() {
		this.anInt9170 += 2;
		return (this.aByteArray88[this.anInt9170 - 2] & 0xFF) + ((this.aByteArray88[this.anInt9170 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)V")
	public final void method6996(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)V")
	public final void method6997(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(B)I")
	public final int method6998() {
		this.anInt9170 += 3;
		return (this.aByteArray88[this.anInt9170 - 1] & 0xFF) + ((this.aByteArray88[this.anInt9170 - 3] & 0xFF) << 8) + ((this.aByteArray88[this.anInt9170 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(II)V")
	public final void method6999(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 + 128);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)I")
	public final int method7000() {
		this.anInt9170 += 3;
		@Pc(43) int local43 = (this.aByteArray88[this.anInt9170 - 1] & 0xFF) + ((this.aByteArray88[this.anInt9170 - 3] & 0xFF) << 16) + ((this.aByteArray88[this.anInt9170 - 2] & 0xFF) << 8);
		if (local43 > 8388607) {
			local43 -= 16777216;
		}
		return local43;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(BI)V")
	public final void method7001(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(ZLjava/lang/String;)V")
	public final void method7002(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.indexOf(0);
		if (local14 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local14 + " - cannot pjstr");
		}
		this.anInt9170 += Static454.method6672(this.aByteArray88, arg0.length(), this.anInt9170, arg0);
		this.aByteArray88[this.anInt9170++] = 0;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)V")
	public final void method7003(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method7052(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method7038(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)I")
	public final int method7004() {
		return this.aByteArray88[this.anInt9170++] & 0xFF;
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(B)I")
	public final int method7005() {
		return -this.aByteArray88[this.anInt9170++] & 0xFF;
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method7006() {
		@Pc(14) byte local14 = this.aByteArray88[this.anInt9170++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt9170;
		while (this.aByteArray88[this.anInt9170++] != 0) {
		}
		@Pc(51) int local51 = this.anInt9170 - local27 - 1;
		return local51 == 0 ? "" : Static380.method5901(this.aByteArray88, local27, local51);
	}

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "(B)B")
	public final byte method7007() {
		return (byte) (128 - this.aByteArray88[this.anInt9170++]);
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)B")
	public final byte method7008() {
		return (byte) -this.aByteArray88[this.anInt9170++];
	}

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "(B)I")
	public final int method7009() {
		return this.aByteArray88[this.anInt9170++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "(I)I")
	public final int method7010() {
		this.anInt9170 += 2;
		return (this.aByteArray88[this.anInt9170 - 1] - 128 & 0xFF) + ((this.aByteArray88[this.anInt9170 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "(I)B")
	public final byte method7011() {
		return this.aByteArray88[this.anInt9170++];
	}

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "(B)I")
	public final int method7012() {
		@Pc(21) byte local21 = this.aByteArray88[this.anInt9170++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray88[this.anInt9170++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)I")
	public final int method7013() {
		this.anInt9170 += 3;
		return ((this.aByteArray88[this.anInt9170 - 3] & 0xFF) << 16) + ((this.aByteArray88[this.anInt9170 - 2] & 0xFF) << 8) + (this.aByteArray88[this.anInt9170 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(II)J")
	public final long method7014(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local2 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray88[this.anInt9170++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "(I)Z")
	public final boolean method7015() {
		this.anInt9170 -= 4;
		@Pc(17) int local17 = Static168.method2765(this.aByteArray88, 0, this.anInt9170);
		@Pc(28) int local28 = this.method6990();
		return local28 == local17;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method7016() {
		@Pc(11) int local11 = this.anInt9170;
		while (this.aByteArray88[this.anInt9170++] != 0) {
		}
		@Pc(34) int local34 = this.anInt9170 - local11 - 1;
		return local34 == 0 ? "" : Static380.method5901(this.aByteArray88, local11, local34);
	}

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "(B)I")
	public final int method7017() {
		@Pc(19) int local19 = this.aByteArray88[this.anInt9170] & 0xFF;
		return local19 < 128 ? this.method7004() - 64 : this.method7054() + -49152;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(Z)I")
	public final int method7018() {
		this.anInt9170 += 4;
		return ((this.aByteArray88[this.anInt9170 - 3] & 0xFF) << 8) + ((this.aByteArray88[this.anInt9170 - 2] & 0xFF) << 16) + ((this.aByteArray88[this.anInt9170 + -1] & 0xFF) << 24) + (this.aByteArray88[this.anInt9170 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "(I)I")
	public final int method7019() {
		@Pc(18) int local18 = this.aByteArray88[this.anInt9170] & 0xFF;
		return local18 >= 128 ? this.method7054() - 32768 : this.method7004();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(JI)V")
	public final void method7020(@OriginalArg(0) long arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 56);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 48);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 40);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 32);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "(I)I")
	public final int method7022() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method7019();
		while (local16 == 32767) {
			local16 = this.method7019();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(BI)V")
	public final void method7023(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method7024(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(10) int local10 = this.anInt9170;
		this.anInt9170 = 0;
		@Pc(16) byte[] local16 = new byte[local10];
		this.method7049(local16, local10);
		@Pc(27) BigInteger local27 = new BigInteger(local16);
		@Pc(32) BigInteger local32 = local27.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt9170 = 0;
		this.method7038(local35.length);
		this.method7030(local35.length, local35);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[III)V")
	public final void method7025(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = this.anInt9170;
		this.anInt9170 = 5;
		@Pc(22) int local22 = (arg0 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) int local30 = this.method6990();
			@Pc(34) int local34 = this.method6990();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= (local30 >>> 5 ^ local30 << 4) + local30 ^ arg1[local36 >>> 11 & 0x3] + local36;
				local36 -= -1640531527;
				local30 -= local36 + arg1[local36 & 0x3] ^ (local34 << 4 ^ local34 >>> 5) + local34;
			}
			this.anInt9170 -= 8;
			this.method7032(local30);
			this.method7032(local34);
		}
		this.anInt9170 = local12;
	}

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "(I)J")
	public final long method7026() {
		@Pc(14) long local14 = (long) this.method6990() & 0xFFFFFFFFL;
		@Pc(21) long local21 = (long) this.method6990() & 0xFFFFFFFFL;
		return local21 + (local14 << 32);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method7027(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static445.method6556(arg0);
		this.aByteArray88[this.anInt9170++] = 0;
		this.method6994(local7);
		this.anInt9170 += Static258.method4076(this.anInt9170, arg0, this.aByteArray88);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(IB)V")
	public final void method7028(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "(B)Ljava/lang/String;")
	public final String method7029() {
		@Pc(14) byte local14 = this.aByteArray88[this.anInt9170++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(25) int local25 = this.method7012();
		if (this.aByteArray88.length < local25 + this.anInt9170) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(54) String local54 = Static158.method2662(this.aByteArray88, this.anInt9170, local25);
		this.anInt9170 += local25;
		return local54;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[BI)V")
	public final void method7030(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			this.aByteArray88[this.anInt9170++] = arg1[local1];
		}
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(BI)V")
	public final void method7031(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt9170 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt9170 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
	public final void method7032(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "(B)Ljava/lang/String;")
	public final String method7033() {
		if (this.aByteArray88[this.anInt9170] == 0) {
			this.anInt9170++;
			return null;
		} else {
			return this.method7016();
		}
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(II)V")
	public final void method7034(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(Z)I")
	public final int method7035() {
		this.anInt9170 += 2;
		return ((this.aByteArray88[this.anInt9170 - 1] & 0xFF) << 8) + (this.aByteArray88[this.anInt9170 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "(I)I")
	public final int method7036() {
		this.anInt9170 += 2;
		@Pc(38) int local38 = (this.aByteArray88[this.anInt9170 - 2] - 128 & 0xFF) + ((this.aByteArray88[this.anInt9170 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "(I)V")
	public final void method7037() {
		if (this.aByteArray88 != null) {
			Static386.method5962(this.aByteArray88);
		}
		this.aByteArray88 = null;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(BI)V")
	public final void method7038(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(II)I")
	public final int method7039(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static168.method2765(this.aByteArray88, arg0, this.anInt9170);
		this.method7032(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "(II)V")
	public final void method7040(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "(II)V")
	public final void method7041(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(ZI)V")
	public final void method7042(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "(I)I")
	public final int method7043() {
		this.anInt9170 += 2;
		@Pc(31) int local31 = (this.aByteArray88[this.anInt9170 - 1] & 0xFF) + ((this.aByteArray88[this.anInt9170 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "(II)V")
	public final void method7044(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "(B)B")
	public final byte method7045() {
		return (byte) (this.aByteArray88[this.anInt9170++] - 128);
	}

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "(B)I")
	public final int method7046() {
		this.anInt9170 += 4;
		return (this.aByteArray88[this.anInt9170 - 4] & 0xFF) + ((this.aByteArray88[this.anInt9170 - 2] & 0xFF) << 16) + ((this.aByteArray88[this.anInt9170 + -1] & 0xFF) << 24) + ((this.aByteArray88[this.anInt9170 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IJB)V")
	public final void method7047(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local6 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray88[this.anInt9170++] = (byte) (arg1 >> local29);
		}
	}

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "(I)I")
	public final int method7048() {
		@Pc(11) int local11 = Static168.method2765(this.aByteArray88, 0, this.anInt9170);
		this.method7032(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIII)V")
	public final void method7049(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			arg0[local14] = this.aByteArray88[this.anInt9170++];
		}
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(IB)V")
	public final void method7050(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt9170++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(BI)V")
	public final void method7051(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(BI)V")
	public final void method7052(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt9170++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "(B)I")
	public final int method7054() {
		this.anInt9170 += 2;
		return (this.aByteArray88[this.anInt9170 - 1] & 0xFF) + ((this.aByteArray88[this.anInt9170 - 2] & 0xFF) << 8);
	}
}
