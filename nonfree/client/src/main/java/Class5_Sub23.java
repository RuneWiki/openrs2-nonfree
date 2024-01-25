import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public class Class5_Sub23 extends Class5 {

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "[B")
	public byte[] aByteArray102;

	@OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
	public int anInt9869;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
	public Class5_Sub23(@OriginalArg(0) int arg0) {
		this.aByteArray102 = Static607.method8679(arg0);
		this.anInt9869 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
	public Class5_Sub23(@OriginalArg(0) byte[] arg0) {
		this.anInt9869 = 0;
		this.aByteArray102 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)Ljava/lang/String;")
	public final String method8473() {
		@Pc(16) byte local16 = this.aByteArray102[this.anInt9869++];
		if (local16 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt9869;
		while (this.aByteArray102[this.anInt9869++] != 0) {
		}
		@Pc(52) int local52 = this.anInt9869 - local32 - 1;
		return local52 == 0 ? "" : Static455.method6706(this.aByteArray102, local32, local52);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I")
	public final int method8474() {
		this.anInt9869 += 4;
		return (this.aByteArray102[this.anInt9869 - 4] & 0xFF) + ((this.aByteArray102[this.anInt9869 - 1] & 0xFF) << 24) + ((this.aByteArray102[this.anInt9869 + -2] & 0xFF) << 16) + ((this.aByteArray102[this.anInt9869 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "(I)Ljava/lang/String;")
	public final String method8475() {
		if (this.aByteArray102[this.anInt9869] == 0) {
			this.anInt9869++;
			return null;
		} else {
			return this.method8497();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)V")
	public final void method8476(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8502(arg0 >>> 28 | 0x80);
					}
					this.method8502(arg0 >>> 21 | 0x80);
				}
				this.method8502(arg0 >>> 14 | 0x80);
			}
			this.method8502(arg0 >>> 7 | 0x80);
		}
		this.method8502(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([BBII)V")
	public final void method8477(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray102[this.anInt9869++] - 128);
		}
	}

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "(I)V")
	public final void method8478() {
		if (this.aByteArray102 != null) {
			Static607.method8680(this.aByteArray102);
		}
		this.aByteArray102 = null;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(IB)V")
	public final void method8479(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8502(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8480(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(II)V")
	public final void method8480(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "(B)I")
	public final int method8481() {
		@Pc(11) int local11 = this.aByteArray102[this.anInt9869] & 0xFF;
		return local11 < 128 ? this.method8529() - 64 : this.method8519() + -49152;
	}

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "(I)I")
	public final int method8482() {
		this.anInt9869 += 4;
		return ((this.aByteArray102[this.anInt9869 - 3] & 0xFF) << 8) + ((this.aByteArray102[this.anInt9869 - 2] & 0xFF) << 16) + ((this.aByteArray102[this.anInt9869 + -1] & 0xFF) << 24) + (this.aByteArray102[this.anInt9869 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I")
	public final int method8483() {
		return this.aByteArray102[this.anInt9869++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "(II)V")
	public final void method8484(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(ZI)I")
	public final int method8485(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = Static149.method2109(this.anInt9869, arg0, this.aByteArray102);
		this.method8486(local17);
		return local17;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V")
	public final void method8486(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 24);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([BIII)V")
	public final void method8487(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = arg2; local12 < arg1 + arg2; local12++) {
			arg0[local12] = this.aByteArray102[this.anInt9869++];
		}
	}

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "(I)B")
	public final byte method8488() {
		return this.aByteArray102[this.anInt9869++];
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IIB)V")
	public final void method8489(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = this.anInt9869;
		this.anInt9869 = 5;
		@Pc(26) int local26 = (arg0 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(36) int local36 = this.method8527();
			@Pc(40) int local40 = this.method8527();
			@Pc(42) int local42 = -957401312;
			@Pc(46) int local46 = 32;
			while (local46-- > 0) {
				local40 -= (local36 << 4 ^ local36 >>> 5) + local36 ^ local42 + arg1[local42 >>> 11 & 0x3];
				local42 -= -1640531527;
				local36 -= local42 + arg1[local42 & 0x3] ^ (local40 >>> 5 ^ local40 << 4) + local40;
			}
			this.anInt9869 -= 8;
			this.method8486(local36);
			this.method8486(local40);
		}
		this.anInt9869 = local8;
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(II)V")
	public final void method8490(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([II)V")
	public final void method8491(@OriginalArg(0) int[] arg0) {
		@Pc(18) int local18 = this.anInt9869 / 8;
		this.anInt9869 = 0;
		for (@Pc(23) int local23 = 0; local23 < local18; local23++) {
			@Pc(29) int local29 = this.method8527();
			@Pc(33) int local33 = this.method8527();
			@Pc(35) int local35 = -957401312;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local33 -= local29 + (local29 >>> 5 ^ local29 << 4) ^ local35 - -arg0[local35 >>> 11 & 0xED200003];
				local35 -= -1640531527;
				local29 -= (local33 >>> 5 ^ local33 << 4) + local33 ^ local35 - -arg0[local35 & 0x3];
			}
			this.anInt9869 -= 8;
			this.method8486(local29);
			this.method8486(local33);
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(BI)V")
	public final void method8492(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(BI)V")
	public final void method8493(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray102[this.anInt9869 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt9869 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt9869 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method8494(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(15) int local15 = this.anInt9869;
		this.anInt9869 = 0;
		@Pc(21) byte[] local21 = new byte[local15];
		this.method8487(local21, local15, 0);
		@Pc(32) BigInteger local32 = new BigInteger(local21);
		@Pc(37) BigInteger local37 = local32.modPow(arg0, arg1);
		@Pc(40) byte[] local40 = local37.toByteArray();
		this.anInt9869 = 0;
		this.method8480(local40.length);
		this.method8528(local40.length, 0, local40);
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(B)J")
	public final long method8495() {
		@Pc(18) long local18 = (long) this.method8482() & 0xFFFFFFFFL;
		@Pc(27) long local27 = (long) this.method8482() & 0xFFFFFFFFL;
		return local18 + (local27 << 32);
	}

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method8497() {
		@Pc(16) int local16 = this.anInt9869;
		while (this.aByteArray102[this.anInt9869++] != 0) {
		}
		@Pc(36) int local36 = this.anInt9869 - local16 - 1;
		return local36 == 0 ? "" : Static455.method6706(this.aByteArray102, local16, local36);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)I")
	public final int method8498() {
		@Pc(22) byte local22 = this.aByteArray102[this.anInt9869++];
		@Pc(24) int local24 = 0;
		while (local22 < 0) {
			local24 = (local22 & 0x7F | local24) << 7;
			local22 = this.aByteArray102[this.anInt9869++];
		}
		return local22 | local24;
	}

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "(I)I")
	public final int method8499() {
		@Pc(17) int local17 = this.aByteArray102[this.anInt9869] & 0xFF;
		return local17 < 128 ? this.method8529() : this.method8519() - 32768;
	}

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "(I)I")
	public final int method8500() {
		return -this.aByteArray102[this.anInt9869++] & 0xFF;
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(II)J")
	public final long method8501(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(34) int local34 = local2 * 8;
		@Pc(36) long local36 = 0L;
		while (local34 >= 0) {
			local36 |= ((long) this.aByteArray102[this.anInt9869++] & 0xFFL) << local34;
			local34 -= 8;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
	public final void method8502(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
	public final int method8503() {
		this.anInt9869 += 4;
		return ((this.aByteArray102[this.anInt9869 - 2] & 0xFF) << 24) - (-(this.aByteArray102[this.anInt9869 - 1] << 16 & 0xFF0000) - ((this.aByteArray102[this.anInt9869 - 4] << 8 & 0xFF00) + (this.aByteArray102[this.anInt9869 - 3] & 0xFF)));
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(ZI)V")
	public final void method8504(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "(I)I")
	public final int method8505() {
		return 128 - this.aByteArray102[this.anInt9869++] & 0xFF;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)I")
	public final int method8506() {
		this.anInt9869 += 2;
		return (this.aByteArray102[this.anInt9869 - 2] - 128 & 0xFF) + ((this.aByteArray102[this.anInt9869 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JII)V")
	public final void method8507(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(33) int local33 = local6 * 8; local33 >= 0; local33 -= 8) {
			this.aByteArray102[this.anInt9869++] = (byte) (int) (arg0 >> local33);
		}
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)B")
	public final byte method8508() {
		return (byte) (this.aByteArray102[this.anInt9869++] - 128);
	}

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "(I)J")
	public final long method8509() {
		@Pc(10) long local10 = (long) this.method8527() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method8527() & 0xFFFFFFFFL;
		return local25 + (local10 << 32);
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "(B)I")
	public final int method8510() {
		this.anInt9869 += 3;
		return ((this.aByteArray102[this.anInt9869 - 3] & 0xFF) << 16) + ((this.aByteArray102[this.anInt9869 - 2] & 0xFF) << 8) + (this.aByteArray102[this.anInt9869 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "(B)I")
	public final int method8511() {
		this.anInt9869 += 3;
		@Pc(51) int local51 = (this.aByteArray102[this.anInt9869 - 1] & 0xFF) + ((this.aByteArray102[this.anInt9869 - 2] & 0xFF) << 8) + ((this.aByteArray102[this.anInt9869 - 3] & 0xFF) << 16);
		if (local51 > 8388607) {
			local51 -= 16777216;
		}
		return local51;
	}

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "(I)Z")
	public final boolean method8512() {
		this.anInt9869 -= 4;
		@Pc(19) int local19 = Static149.method2109(this.anInt9869, 0, this.aByteArray102);
		@Pc(23) int local23 = this.method8527();
		return local19 == local23;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(IB)V")
	public final void method8514(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 + 128);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "(I)I")
	public final int method8515() {
		this.anInt9869 += 2;
		return (this.aByteArray102[this.anInt9869 - 1] - 128 & 0xFF) + ((this.aByteArray102[this.anInt9869 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "(I)I")
	public final int method8516() {
		this.anInt9869 += 2;
		@Pc(31) int local31 = (this.aByteArray102[this.anInt9869 - 1] & 0xFF) + ((this.aByteArray102[this.anInt9869 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)V")
	public final void method8517(@OriginalArg(0) long arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (int) (arg0 >> 56);
		this.aByteArray102[this.anInt9869++] = (byte) (int) (arg0 >> 48);
		this.aByteArray102[this.anInt9869++] = (byte) (int) (arg0 >> 40);
		this.aByteArray102[this.anInt9869++] = (byte) (int) (arg0 >> 32);
		this.aByteArray102[this.anInt9869++] = (byte) (int) (arg0 >> 24);
		this.aByteArray102[this.anInt9869++] = (byte) (int) (arg0 >> 16);
		this.aByteArray102[this.anInt9869++] = (byte) (int) (arg0 >> 8);
		this.aByteArray102[this.anInt9869++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "(I)I")
	public final int method8518() {
		this.anInt9869 += 2;
		return (this.aByteArray102[this.anInt9869 - 2] & 0xFF) + ((this.aByteArray102[this.anInt9869 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(B)I")
	public final int method8519() {
		this.anInt9869 += 2;
		return ((this.aByteArray102[this.anInt9869 - 2] & 0xFF) << 8) + (this.aByteArray102[this.anInt9869 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)V")
	public final void method8520(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)B")
	public final byte method8521() {
		return (byte) (128 - this.aByteArray102[this.anInt9869++]);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
	public final void method8522(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)I")
	public final int method8523() {
		this.anInt9869 += 4;
		return ((this.aByteArray102[this.anInt9869 - 1] & 0xFF) << 8) + ((this.aByteArray102[this.anInt9869 - 4] & 0xFF) << 16) + ((this.aByteArray102[this.anInt9869 + -3] & 0xFF) << 24) + (this.aByteArray102[this.anInt9869 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "(I)J")
	public final long method8524() {
		@Pc(17) long local17 = (long) this.method8529() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method8527() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(B)I")
	public final int method8525() {
		this.anInt9869 += 2;
		@Pc(41) int local41 = (this.aByteArray102[this.anInt9869 - 2] - 128 & 0xFF) + ((this.aByteArray102[this.anInt9869 - 1] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(II)V")
	public final void method8526(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "(B)I")
	public final int method8527() {
		this.anInt9869 += 4;
		return (this.aByteArray102[this.anInt9869 - 1] & 0xFF) + ((this.aByteArray102[this.anInt9869 - 2] & 0xFF) << 8) + ((this.aByteArray102[this.anInt9869 + -3] & 0xFF) << 16) + ((this.aByteArray102[-4 + this.anInt9869] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[BB)V")
	public final void method8528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(12) int local12 = arg1; local12 < arg0 + arg1; local12++) {
			this.aByteArray102[this.anInt9869++] = arg2[local12];
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I")
	public final int method8529() {
		return this.aByteArray102[this.anInt9869++] & 0xFF;
	}

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "(II)V")
	public final void method8530(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 16);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 24);
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(II)V")
	public final void method8531(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "(B)I")
	public final int method8532() {
		this.anInt9869 += 3;
		return ((this.aByteArray102[this.anInt9869 - 1] & 0xFF) << 8) + (this.aByteArray102[this.anInt9869 - 3] << 16 & 0xFF0000) + (this.aByteArray102[this.anInt9869 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(BI)V")
	public final void method8533(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt9869 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[IZ)V")
	public final void method8534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(13) int local13 = this.anInt9869;
		this.anInt9869 = arg0;
		@Pc(22) int local22 = (arg1 - arg0) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(32) int local32 = this.method8527();
			@Pc(36) int local36 = this.method8527();
			@Pc(38) int local38 = 0;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local32 += (local36 << 4 ^ local36 >>> 5) + local36 ^ local38 - -arg2[local38 & 0x3];
				local38 += -1640531527;
				local36 += (local32 << 4 ^ local32 >>> 5) + local32 ^ arg2[local38 >>> 11 & 0x3] + local38;
			}
			this.anInt9869 -= 8;
			this.method8486(local32);
			this.method8486(local36);
		}
		this.anInt9869 = local13;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)V")
	public final void method8535(@OriginalArg(1) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 24);
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)B")
	public final byte method8536() {
		return (byte) -this.aByteArray102[this.anInt9869++];
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method8537(@OriginalArg(1) String arg0) {
		@Pc(17) int local17 = arg0.indexOf(0);
		if (local17 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local17 + " - cannot pjstr2");
		}
		this.aByteArray102[this.anInt9869++] = 0;
		this.anInt9869 += Static335.method5110(this.anInt9869, arg0, arg0.length(), this.aByteArray102);
		this.aByteArray102[this.anInt9869++] = 0;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public final void method8538(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt9869 += Static335.method5110(this.anInt9869, arg0, arg0.length(), this.aByteArray102);
		this.aByteArray102[this.anInt9869++] = 0;
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(IB)V")
	public final void method8539(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt9869++] = (byte) arg0;
		this.aByteArray102[this.anInt9869++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
	public final void method8541(@OriginalArg(0) int arg0) {
		this.aByteArray102[this.anInt9869 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(B)I")
	public final int method8542() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method8499(); local11 == 32767; local11 = this.method8499()) {
			local7 += 32767;
		}
		if (-126 != -126) {
			this.anInt9869 = 122;
		}
		return local7 + local11;
	}
}
