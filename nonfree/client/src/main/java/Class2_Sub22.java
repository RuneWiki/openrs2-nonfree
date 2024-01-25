import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!vj", name = "kb", descriptor = "I")
	public int anInt10247;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "[B")
	public byte[] aByteArray115;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
	public Class2_Sub22(@OriginalArg(0) int arg0) {
		this.anInt10247 = 0;
		this.aByteArray115 = Static37.method613(arg0);
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([B)V")
	public Class2_Sub22(@OriginalArg(0) byte[] arg0) {
		this.aByteArray115 = arg0;
		this.anInt10247 = 0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
	public final void method8490(@OriginalArg(1) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 16);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 24);
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)B")
	public final byte method8491() {
		return (byte) -this.aByteArray115[this.anInt10247++];
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)V")
	public final void method8492(@OriginalArg(0) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method8493(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt10247;
		this.anInt10247 = 0;
		@Pc(16) byte[] local16 = new byte[local6];
		this.method8502(local16, 0, local6);
		@Pc(27) BigInteger local27 = new BigInteger(local16);
		@Pc(32) BigInteger local32 = local27.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt10247 = 0;
		this.method8500(local35.length);
		this.method8508(0, local35.length, local35);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)I")
	public final int method8494() {
		this.anInt10247 += 4;
		return ((this.aByteArray115[this.anInt10247 - 1] & 0xFF) << 8) + ((this.aByteArray115[this.anInt10247 - 4] & 0xFF) << 16) + ((this.aByteArray115[this.anInt10247 - 3] & 0xFF) << 24) + (this.aByteArray115[this.anInt10247 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)V")
	public final void method8495(@OriginalArg(0) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)I")
	public final int method8496() {
		return this.aByteArray115[this.anInt10247++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)I")
	public final int method8497() {
		this.anInt10247 += 4;
		return (this.aByteArray115[this.anInt10247 - 3] & 0xFF) + ((this.aByteArray115[this.anInt10247 - 4] & 0xFF) << 8) + ((this.aByteArray115[this.anInt10247 + -1] & 0xFF) << 16) + ((this.aByteArray115[this.anInt10247 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)V")
	public final void method8498(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8537(arg0 >>> 28 | 0x80);
					}
					this.method8537(arg0 >>> 21 | 0x80);
				}
				this.method8537(arg0 >>> 14 | 0x80);
			}
			this.method8537(arg0 >>> 7 | 0x80);
		}
		this.method8537(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)B")
	public final byte method8499() {
		return (byte) (this.aByteArray115[this.anInt10247++] - 128);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(BI)V")
	public final void method8500(@OriginalArg(1) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(II)V")
	public final void method8501(@OriginalArg(0) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([BIBI)V")
	public final void method8502(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = arg1; local7 < arg2 + arg1; local7++) {
			arg0[local7] = this.aByteArray115[this.anInt10247++];
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(Z)I")
	public final int method8503() {
		this.anInt10247 += 3;
		@Pc(51) int local51 = ((this.aByteArray115[this.anInt10247 - 2] & 0xFF) << 8) + ((this.aByteArray115[this.anInt10247 - 3] & 0xFF) << 16) + (this.aByteArray115[this.anInt10247 + -1] & 0xFF);
		if (local51 > 8388607) {
			local51 -= 16777216;
		}
		return local51;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)Z")
	public final boolean method8504() {
		this.anInt10247 -= 4;
		@Pc(24) int local24 = Static13.method184(this.aByteArray115, this.anInt10247, 0);
		@Pc(28) int local28 = this.method8542();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(II)V")
	public final void method8505(@OriginalArg(0) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 24);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)J")
	public final long method8506() {
		@Pc(10) long local10 = (long) this.method8542() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method8542() & 0xFFFFFFFFL;
		return (local10 << 32) + local25;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
	public final void method8507(@OriginalArg(1) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[BI)V")
	public final void method8508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		for (@Pc(3) int local3 = arg0; local3 < arg1 + arg0; local3++) {
			this.aByteArray115[this.anInt10247++] = arg2[local3];
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)V")
	public final void method8509(@OriginalArg(1) long arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 56);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 48);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 40);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 32);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 24);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 16);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(Z)V")
	public final void method8510() {
		if (this.aByteArray115 != null) {
			Static37.method611(this.aByteArray115);
		}
		this.aByteArray115 = null;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(BI)V")
	public final void method8511(@OriginalArg(1) int arg0) {
		this.aByteArray115[this.anInt10247 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray115[this.anInt10247 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray115[this.anInt10247 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(II)J")
	public final long method8512(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray115[this.anInt10247++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(ZI)V")
	public final void method8513(@OriginalArg(1) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 16);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)V")
	public final void method8514(@OriginalArg(0) int arg0) {
		this.aByteArray115[this.anInt10247 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(BI)V")
	public final void method8515(@OriginalArg(1) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)J")
	public final long method8516() {
		@Pc(12) long local12 = (long) this.method8551() & 0xFFFFFFFFL;
		@Pc(19) long local19 = (long) this.method8551() & 0xFFFFFFFFL;
		return (local19 << 32) + local12;
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(BI)V")
	public final void method8517(@OriginalArg(1) int arg0) {
		this.aByteArray115[this.anInt10247 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(Z)I")
	public final int method8518() {
		this.anInt10247 += 2;
		@Pc(40) int local40 = (this.aByteArray115[this.anInt10247 - 1] - 128 & 0xFF) + ((this.aByteArray115[this.anInt10247 - 2] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)Ljava/lang/String;")
	public final String method8519() {
		@Pc(14) byte local14 = this.aByteArray115[this.anInt10247++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(30) int local30 = this.anInt10247;
		while (this.aByteArray115[this.anInt10247++] != 0) {
		}
		@Pc(53) int local53 = this.anInt10247 - local30 - 1;
		return local53 == 0 ? "" : Static131.method8468(local30, this.aByteArray115, local53);
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)I")
	public final int method8520() {
		this.anInt10247 += 2;
		return (this.aByteArray115[this.anInt10247 - 2] & 0xFF) + ((this.aByteArray115[this.anInt10247 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)I")
	public final int method8521() {
		this.anInt10247 += 2;
		return (this.aByteArray115[this.anInt10247 - 2] - 128 & 0xFF) + ((this.aByteArray115[this.anInt10247 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "(I)I")
	public final int method8522() {
		this.anInt10247 += 2;
		@Pc(31) int local31 = ((this.aByteArray115[this.anInt10247 - 1] & 0xFF) << 8) + (this.aByteArray115[this.anInt10247 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(B)I")
	public final int method8523() {
		@Pc(16) byte local16 = this.aByteArray115[this.anInt10247++];
		@Pc(24) int local24 = 0;
		while (local16 < 0) {
			local24 = (local16 & 0x7F | local24) << 7;
			local16 = this.aByteArray115[this.anInt10247++];
		}
		return local16 | local24;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(BI)V")
	public final void method8524(@OriginalArg(1) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 16);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "(I)B")
	public final byte method8525() {
		return (byte) (128 - this.aByteArray115[this.anInt10247++]);
	}

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "(I)I")
	public final int method8526() {
		this.anInt10247 += 2;
		@Pc(39) int local39 = ((this.aByteArray115[this.anInt10247 - 2] & 0xFF) << 8) + (this.aByteArray115[this.anInt10247 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "(I)I")
	public final int method8527() {
		return -this.aByteArray115[this.anInt10247++] & 0xFF;
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(II)V")
	public final void method8528(@OriginalArg(0) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 + 128);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
	public final void method8529(@OriginalArg(0) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 16);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(II)I")
	public final int method8530(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static13.method184(this.aByteArray115, this.anInt10247, arg0);
		this.method8552(local17);
		return local17;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III[I)V")
	public final void method8531(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(14) int local14 = this.anInt10247;
		this.anInt10247 = 5;
		@Pc(24) int local24 = (arg0 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) int local32 = this.method8542();
			@Pc(36) int local36 = this.method8542();
			@Pc(38) int local38 = -957401312;
			@Pc(42) int local42 = 32;
			while (local42-- > 0) {
				local36 -= arg1[local38 >>> 11 & 0x3] + local38 ^ local32 + (local32 << 4 ^ local32 >>> 5);
				local38 -= -1640531527;
				local32 -= (local36 << 4 ^ local36 >>> 5) + local36 ^ arg1[local38 & 0x3] + local38;
			}
			this.anInt10247 -= 8;
			this.method8552(local32);
			this.method8552(local36);
		}
		this.anInt10247 = local14;
	}

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "(I)I")
	public final int method8533() {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19;
		for (local19 = this.method8543(); local19 == 32767; local19 = this.method8543()) {
			local15 += 32767;
		}
		return local15 + local19;
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(BI)V")
	public final void method8534(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8537(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8500(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method8535() {
		if (this.aByteArray115[this.anInt10247] == 0) {
			this.anInt10247++;
			return null;
		} else {
			return this.method8549();
		}
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(Z)I")
	public final int method8536() {
		@Pc(16) int local16 = this.aByteArray115[this.anInt10247] & 0xFF;
		return local16 >= 128 ? this.method8546() - 49152 : this.method8547() - 64;
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "(II)V")
	public final void method8537(@OriginalArg(0) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method8538(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr2");
		}
		this.aByteArray115[this.anInt10247++] = 0;
		this.anInt10247 += Static454.method6235(this.aByteArray115, this.anInt10247, arg0, arg0.length());
		this.aByteArray115[this.anInt10247++] = 0;
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(B)I")
	public final int method8539() {
		this.anInt10247 += 3;
		return (this.aByteArray115[this.anInt10247 - 1] & 0xFF) + ((this.aByteArray115[this.anInt10247 - 3] & 0xFF) << 16) + ((this.aByteArray115[this.anInt10247 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method8540(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.indexOf(0);
		if (local13 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local13 + " - cannot pjstr");
		}
		this.anInt10247 += Static454.method6235(this.aByteArray115, this.anInt10247, arg0, arg0.length());
		this.aByteArray115[this.anInt10247++] = 0;
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "(II)V")
	public final void method8541(@OriginalArg(0) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "(I)I")
	public final int method8542() {
		this.anInt10247 += 4;
		return ((this.aByteArray115[this.anInt10247 - 3] & 0xFF) << 16) + ((this.aByteArray115[this.anInt10247 - 4] & 0xFF) << 24) + ((this.aByteArray115[this.anInt10247 - 2] & 0xFF) << 8) + (this.aByteArray115[this.anInt10247 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "(I)I")
	public final int method8543() {
		@Pc(16) int local16 = this.aByteArray115[this.anInt10247] & 0xFF;
		return local16 >= 128 ? this.method8546() - 32768 : this.method8547();
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(Z)I")
	public final int method8544() {
		this.anInt10247 += 2;
		return (this.aByteArray115[this.anInt10247 - 1] - 128 & 0xFF) + ((this.aByteArray115[this.anInt10247 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "(I)I")
	public final int method8545() {
		return 128 - this.aByteArray115[this.anInt10247++] & 0xFF;
	}

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "(I)I")
	public final int method8546() {
		this.anInt10247 += 2;
		return ((this.aByteArray115[this.anInt10247 - 2] & 0xFF) << 8) + (this.aByteArray115[this.anInt10247 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "(B)I")
	public final int method8547() {
		return this.aByteArray115[this.anInt10247++] & 0xFF;
	}

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "(I)B")
	public final byte method8548() {
		return this.aByteArray115[this.anInt10247++];
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method8549() {
		@Pc(12) int local12 = this.anInt10247;
		while (this.aByteArray115[this.anInt10247++] != 0) {
		}
		@Pc(35) int local35 = this.anInt10247 - local12 - 1;
		return local35 == 0 ? "" : Static131.method8468(local12, this.aByteArray115, local35);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIII)V")
	public final void method8550(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt10247;
		this.anInt10247 = arg2;
		@Pc(18) int local18 = (arg1 - arg2) / 8;
		for (@Pc(27) int local27 = 0; local27 < local18; local27++) {
			@Pc(33) int local33 = this.method8542();
			@Pc(37) int local37 = this.method8542();
			@Pc(39) int local39 = 0;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local33 += local37 + (local37 >>> 5 ^ local37 << 4) ^ local39 + arg0[local39 & 0x3];
				local39 += -1640531527;
				local37 += arg0[local39 >>> 11 & 0x3] + local39 ^ (local33 << 4 ^ local33 >>> 5) - -local33;
			}
			this.anInt10247 -= 8;
			this.method8552(local33);
			this.method8552(local37);
		}
		this.anInt10247 = local8;
	}

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "(I)I")
	public final int method8551() {
		this.anInt10247 += 4;
		return (this.aByteArray115[this.anInt10247 - 4] & 0xFF) + ((this.aByteArray115[this.anInt10247 - 3] & 0xFF) << 8) + ((this.aByteArray115[this.anInt10247 + -2] & 0xFF) << 16) + ((this.aByteArray115[this.anInt10247 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(ZI)V")
	public final void method8552(@OriginalArg(1) int arg0) {
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 24);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 16);
		this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> 8);
		this.aByteArray115[this.anInt10247++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(JIB)V")
	public final void method8553(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local2 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray115[this.anInt10247++] = (byte) (arg0 >> local25);
		}
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "(B)I")
	public final int method8554() {
		this.anInt10247 += 3;
		return (this.aByteArray115[this.anInt10247 - 3] & 0xFF) + ((this.aByteArray115[this.anInt10247 - 1] & 0xFF) << 16) + ((this.aByteArray115[this.anInt10247 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "(I)I")
	public final int method8555() {
		this.anInt10247 += 4;
		return ((this.aByteArray115[this.anInt10247 - 1] & 0xFF) << 24) + ((this.aByteArray115[this.anInt10247 - 2] & 0xFF) << 16) + ((this.aByteArray115[this.anInt10247 + -3] & 0xFF) << 8) + (this.aByteArray115[this.anInt10247 + -4] & 0xFF);
	}
}
