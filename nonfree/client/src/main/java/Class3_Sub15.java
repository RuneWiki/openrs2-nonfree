import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!tn", name = "L", descriptor = "[B")
	public byte[] aByteArray106;

	@OriginalMember(owner = "client!tn", name = "ob", descriptor = "I")
	public int anInt10282;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
	public Class3_Sub15(@OriginalArg(0) int arg0) {
		this.aByteArray106 = Static7.method99(arg0);
		this.anInt10282 = 0;
	}

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "([B)V")
	public Class3_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray106 = arg0;
		this.anInt10282 = 0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V")
	public final void method8397(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt10282 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
	public final void method8399(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 24);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)J")
	public final long method8400() {
		@Pc(10) long local10 = (long) this.method8402() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method8402() & 0xFFFFFFFFL;
		return local24 + (local10 << 32);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)I")
	public final int method8401() {
		return this.aByteArray106[this.anInt10282++] & 0xFF;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)I")
	public final int method8402() {
		this.anInt10282 += 4;
		return ((this.aByteArray106[this.anInt10282 - 2] & 0xFF) << 8) + ((this.aByteArray106[this.anInt10282 - 3] & 0xFF) << 16) + ((this.aByteArray106[this.anInt10282 + -4] & 0xFF) << 24) + (this.aByteArray106[this.anInt10282 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[BI)V")
	public final void method8403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(7) int local7 = arg1; local7 < arg0 + arg1; local7++) {
			arg2[local7] = this.aByteArray106[this.anInt10282++];
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z[BII)V")
	public final void method8404(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(16) int local16 = arg1 - 1; local16 >= 0; local16--) {
			arg0[local16] = (byte) (this.aByteArray106[this.anInt10282++] - 128);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)V")
	public final void method8405(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)I")
	public final int method8406() {
		this.anInt10282 += 3;
		return (this.aByteArray106[this.anInt10282 - 2] & 0xFF) + (((this.aByteArray106[this.anInt10282 - 3] & 0xFF) << 16) + ((this.aByteArray106[this.anInt10282 - 1] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)V")
	public final void method8407(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8448(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8464(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(II)V")
	public final void method8408(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(II)V")
	public final void method8409(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V")
	public final void method8410(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray106[this.anInt10282 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt10282 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IJ)V")
	public final void method8411(@OriginalArg(1) long arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 56);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 48);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 40);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 32);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 24);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z")
	public final boolean method8412() {
		this.anInt10282 -= 4;
		@Pc(24) int local24 = Static480.method7071(this.aByteArray106, this.anInt10282, 0);
		@Pc(28) int local28 = this.method8402();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method8413() {
		@Pc(6) int local6 = this.anInt10282;
		while (this.aByteArray106[this.anInt10282++] != 0) {
		}
		@Pc(26) int local26 = this.anInt10282 - local6 - 1;
		return local26 == 0 ? "" : Static89.method2282(this.aByteArray106, local6, local26);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)I")
	public final int method8414() {
		this.anInt10282 += 2;
		return (this.aByteArray106[this.anInt10282 - 1] & 0xFF) + ((this.aByteArray106[this.anInt10282 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method8415() {
		if (this.aByteArray106[this.anInt10282] == 0) {
			this.anInt10282++;
			return null;
		} else {
			return this.method8413();
		}
	}

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method8416() {
		@Pc(14) byte local14 = this.aByteArray106[this.anInt10282++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt10282;
		while (this.aByteArray106[this.anInt10282++] != 0) {
		}
		@Pc(44) int local44 = this.anInt10282 - local24 - 1;
		return local44 == 0 ? "" : Static89.method2282(this.aByteArray106, local24, local44);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method8417(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt10282 += Static605.method8261(arg0.length(), this.anInt10282, arg0, this.aByteArray106);
		this.aByteArray106[this.anInt10282++] = 0;
	}

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "(I)I")
	public final int method8418() {
		this.anInt10282 += 4;
		return (this.aByteArray106[this.anInt10282 - 4] & 0xFF) + ((this.aByteArray106[this.anInt10282 - 3] & 0xFF) << 8) + ((this.aByteArray106[-1 + this.anInt10282] & 0xFF) << 24) + ((this.aByteArray106[this.anInt10282 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "(II)V")
	public final void method8419(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 24);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "(I)I")
	public final int method8420() {
		this.anInt10282 += 2;
		@Pc(33) int local33 = (this.aByteArray106[this.anInt10282 - 2] - 128 & 0xFF) + ((this.aByteArray106[this.anInt10282 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "(I)I")
	public final int method8421() {
		this.anInt10282 += 3;
		return (this.aByteArray106[this.anInt10282 - 1] & 0xFF) + ((this.aByteArray106[this.anInt10282 - 2] & 0xFF) << 8) + ((this.aByteArray106[this.anInt10282 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "(II)V")
	public final void method8423(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 + 128);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(B)I")
	public final int method8424() {
		return 128 - this.aByteArray106[this.anInt10282++] & 0xFF;
	}

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "(I)J")
	public final long method8425() {
		@Pc(15) long local15 = (long) this.method8445() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8445() & 0xFFFFFFFFL;
		return (local22 << 32) + local15;
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(Z)I")
	public final int method8426() {
		this.anInt10282 += 2;
		return (this.aByteArray106[this.anInt10282 - 2] & 0xFF) + ((this.aByteArray106[this.anInt10282 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "(I)I")
	public final int method8427() {
		@Pc(14) byte local14 = this.aByteArray106[this.anInt10282++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local14 & 0x7F | local16) << 7;
			local14 = this.aByteArray106[this.anInt10282++];
		}
		return local14 | local16;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(BI)V")
	public final void method8428(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "(I)I")
	public final int method8429() {
		this.anInt10282 += 2;
		return ((this.aByteArray106[this.anInt10282 - 2] & 0xFF) << 8) + (this.aByteArray106[this.anInt10282 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBI[B)V")
	public final void method8430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		for (@Pc(7) int local7 = arg1; local7 < arg1 + arg0; local7++) {
			this.aByteArray106[this.anInt10282++] = arg2[local7];
		}
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(BI)V")
	public final void method8431(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(Z)B")
	public final byte method8432() {
		return (byte) (128 - this.aByteArray106[this.anInt10282++]);
	}

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "(II)V")
	public final void method8433(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IJB)V")
	public final void method8434(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local6 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray106[this.anInt10282++] = (byte) (arg1 >> local25);
		}
	}

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "(I)I")
	public final int method8435() {
		@Pc(20) int local20 = this.aByteArray106[this.anInt10282] & 0xFF;
		return local20 < 128 ? this.method8401() - 64 : this.method8414() + -49152;
	}

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "(II)V")
	public final void method8436(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method8437(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray106[this.anInt10282++] = 0;
		this.anInt10282 += Static605.method8261(arg0.length(), this.anInt10282, arg0, this.aByteArray106);
		this.aByteArray106[this.anInt10282++] = 0;
	}

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "(I)B")
	public final byte method8438() {
		return (byte) (this.aByteArray106[this.anInt10282++] - 128);
	}

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "(II)V")
	public final void method8439(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "(I)B")
	public final byte method8440() {
		return this.aByteArray106[this.anInt10282++];
	}

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "(II)V")
	public final void method8441(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZI)J")
	public final long method8442(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray106[this.anInt10282++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "(B)B")
	public final byte method8443() {
		return (byte) -this.aByteArray106[this.anInt10282++];
	}

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "(B)I")
	public final int method8444() {
		this.anInt10282 += 2;
		@Pc(36) int local36 = (this.aByteArray106[this.anInt10282 - 1] & 0xFF) + ((this.aByteArray106[this.anInt10282 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "(I)I")
	public final int method8445() {
		this.anInt10282 += 4;
		return ((this.aByteArray106[this.anInt10282 - 3] & 0xFF) << 8) + (((this.aByteArray106[this.anInt10282 - 1] & 0xFF) << 24) + ((this.aByteArray106[this.anInt10282 - 2] & 0xFF) << 16) + (this.aByteArray106[this.anInt10282 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "(B)I")
	public final int method8447() {
		return this.aByteArray106[this.anInt10282++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "(II)V")
	public final void method8448(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[III)V")
	public final void method8449(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt10282;
		this.anInt10282 = 5;
		@Pc(24) int local24 = (arg1 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method8402();
			@Pc(36) int local36 = this.method8402();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= arg0[local38 >>> 11 & 0x6F400003] + local38 ^ (local32 >>> 5 ^ local32 << 4) + local32;
				local38 -= -1640531527;
				local32 -= local36 + (local36 << 4 ^ local36 >>> 5) ^ arg0[local38 & 0x3] + local38;
			}
			this.anInt10282 -= 8;
			this.method8419(local32);
			this.method8419(local36);
		}
		this.anInt10282 = local14;
	}

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "(B)I")
	public final int method8450() {
		this.anInt10282 += 3;
		@Pc(51) int local51 = (this.aByteArray106[this.anInt10282 - 1] & 0xFF) + (((this.aByteArray106[this.anInt10282 - 3] & 0xFF) << 16) + ((this.aByteArray106[this.anInt10282 - 2] & 0xFF) << 8));
		if (local51 > 8388607) {
			local51 -= 16777216;
		}
		return local51;
	}

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "(I)I")
	public final int method8451() {
		this.anInt10282 += 4;
		return (this.aByteArray106[this.anInt10282 - 3] & 0xFF) + ((this.aByteArray106[this.anInt10282 - 2] & 0xFF) << 24) + ((this.aByteArray106[this.anInt10282 + -1] & 0xFF) << 16) + ((this.aByteArray106[this.anInt10282 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "(I)I")
	public final int method8452() {
		this.anInt10282 += 2;
		@Pc(41) int local41 = (this.aByteArray106[this.anInt10282 - 1] - 128 & 0xFF) + ((this.aByteArray106[this.anInt10282 - 2] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method8453(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(14) int local14 = this.anInt10282;
		this.anInt10282 = 0;
		@Pc(20) byte[] local20 = new byte[local14];
		this.method8403(local14, 0, local20);
		@Pc(33) BigInteger local33 = new BigInteger(local20);
		@Pc(38) BigInteger local38 = local33.modPow(arg1, arg0);
		@Pc(41) byte[] local41 = local38.toByteArray();
		this.anInt10282 = 0;
		this.method8464(local41.length);
		this.method8430(local41.length, 0, local41);
	}

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "(II)V")
	public final void method8454(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 24);
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "(I)V")
	public final void method8455() {
		if (this.aByteArray106 != null) {
			Static7.method102(this.aByteArray106);
		}
		this.aByteArray106 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[IBI)V")
	public final void method8456(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt10282;
		this.anInt10282 = arg0;
		@Pc(18) int local18 = (arg2 - arg0) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method8402();
			@Pc(30) int local30 = this.method8402();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local26 += (local30 << 4 ^ local30 >>> 5) + local30 ^ arg1[local32 & 0x3] + local32;
				local32 += -1640531527;
				local30 += local32 + arg1[local32 >>> 11 & 0xCAA00003] ^ (local26 >>> 5 ^ local26 << 4) - -local26;
			}
			this.anInt10282 -= 8;
			this.method8419(local26);
			this.method8419(local30);
		}
		this.anInt10282 = local8;
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(BI)I")
	public final int method8457(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static480.method7071(this.aByteArray106, this.anInt10282, arg0);
		this.method8419(local16);
		return local16;
	}

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "(I)I")
	public final int method8458() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method8465();
		while (local11 == 32767) {
			local11 = this.method8465();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "(II)V")
	public final void method8459(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8448(arg0 >>> 28 | 0x80);
					}
					this.method8448(arg0 >>> 21 | 0x80);
				}
				this.method8448(arg0 >>> 14 | 0x80);
			}
			this.method8448(arg0 >>> 7 | 0x80);
		}
		this.method8448(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "(Z)I")
	public final int method8460() {
		this.anInt10282 += 2;
		return ((this.aByteArray106[this.anInt10282 - 1] & 0xFF) << 8) + (this.aByteArray106[this.anInt10282 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "(B)I")
	public final int method8461() {
		return -this.aByteArray106[this.anInt10282++] & 0xFF;
	}

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "(II)V")
	public final void method8462(@OriginalArg(1) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 16);
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "(I)I")
	public final int method8463() {
		this.anInt10282 += 4;
		return ((this.aByteArray106[this.anInt10282 - 1] & 0xFF) << 8) + ((this.aByteArray106[this.anInt10282 - 4] & 0xFF) << 16) + ((this.aByteArray106[this.anInt10282 + -3] & 0xFF) << 24) + (this.aByteArray106[this.anInt10282 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(IB)V")
	public final void method8464(@OriginalArg(0) int arg0) {
		this.aByteArray106[this.anInt10282++] = (byte) (arg0 >> 8);
		this.aByteArray106[this.anInt10282++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tn", name = "v", descriptor = "(I)I")
	public final int method8465() {
		@Pc(17) int local17 = this.aByteArray106[this.anInt10282] & 0xFF;
		return local17 < 128 ? this.method8401() : this.method8414() - 32768;
	}
}
