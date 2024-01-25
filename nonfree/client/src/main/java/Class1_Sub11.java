import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!dh", name = "qb", descriptor = "I")
	public int anInt5766;

	@OriginalMember(owner = "client!dh", name = "pb", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub11(@OriginalArg(0) int arg0) {
		this.anInt5766 = 0;
		this.aByteArray64 = Static48.method714(arg0);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray64 = arg0;
		this.anInt5766 = 0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B[I)V")
	public final void method4442(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt5766 / 8;
		this.anInt5766 = 0;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(27) int local27 = this.method4487();
			@Pc(31) int local31 = this.method4487();
			@Pc(33) int local33 = 0;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local27 += local33 + arg0[local33 & 0x3] ^ (local31 >>> 5 ^ local31 << 4) - -local31;
				local33 += -1640531527;
				local31 += arg0[local33 >>> 11 & 0x3] + local33 ^ (local27 << 4 ^ local27 >>> 5) - -local27;
			}
			this.anInt5766 -= 8;
			this.method4450(local27);
			this.method4450(local31);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public final void method4443(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)I")
	public final int method4444() {
		this.anInt5766 += 3;
		return (this.aByteArray64[this.anInt5766 - 3] & 0xFF) + ((this.aByteArray64[this.anInt5766 - 2] & 0xFF) << 8) + ((this.aByteArray64[this.anInt5766 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)V")
	public final void method4445(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IJ)V")
	public final void method4446(@OriginalArg(1) long arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 56);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 48);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 40);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 32);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V")
	public final void method4447(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt5766 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt5766 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt5766 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V")
	public final void method4448(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)I")
	public final int method4449() {
		@Pc(16) int local16 = this.aByteArray64[this.anInt5766] & 0xFF;
		return local16 < 128 ? this.method4463() - 64 : this.method4485() - 49152;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
	public final void method4450(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)B")
	public final byte method4452() {
		return this.aByteArray64[this.anInt5766++];
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method4453(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr");
		}
		this.anInt5766 += Static226.method4534(arg0.length(), arg0, this.aByteArray64, this.anInt5766);
		this.aByteArray64[this.anInt5766++] = 0;
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(II)V")
	public final void method4454(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method4455(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5766;
		this.anInt5766 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4471(local12, local6);
		@Pc(30) BigInteger local30 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt5766 = 0;
		this.method4445(local38.length);
		this.method4480(local38, local38.length);
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)Ljava/lang/String;")
	public final String method4456() {
		@Pc(14) byte local14 = this.aByteArray64[this.anInt5766++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt5766;
		while (this.aByteArray64[this.anInt5766++] != 0) {
		}
		@Pc(55) int local55 = this.anInt5766 - local27 - 1;
		return local55 == 0 ? "" : Static257.method5311(local55, local27, this.aByteArray64);
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)I")
	public final int method4457() {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.method4469();
		while (local19 == 32767) {
			local19 = this.method4469();
			local15 += 32767;
		}
		return local15 + local19;
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)I")
	public final int method4458() {
		this.anInt5766 += 4;
		return (this.aByteArray64[this.anInt5766 - 4] & 0xFF) + ((this.aByteArray64[this.anInt5766 - 2] & 0xFF) << 16) + ((this.aByteArray64[this.anInt5766 + -1] & 0xFF) << 24) + ((this.aByteArray64[this.anInt5766 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)I")
	public final int method4459() {
		return -this.aByteArray64[this.anInt5766++] & 0xFF;
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)J")
	public final long method4460() {
		@Pc(15) long local15 = (long) this.method4487() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method4487() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB[II)V")
	public final void method4461(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt5766;
		this.anInt5766 = 5;
		@Pc(22) int local22 = (arg1 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(30) int local30 = this.method4487();
			@Pc(34) int local34 = this.method4487();
			@Pc(36) int local36 = -957401312;
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local34 -= (local30 << 4 ^ local30 >>> 5) + local30 ^ arg0[local36 >>> 11 & 0x3] + local36;
				local36 -= -1640531527;
				local30 -= local34 + (local34 << 4 ^ local34 >>> 5) ^ local36 - -arg0[local36 & 0x3];
			}
			this.anInt5766 -= 8;
			this.method4450(local30);
			this.method4450(local34);
		}
		this.anInt5766 = local8;
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(II)V")
	public final void method4462(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "(I)I")
	public final int method4463() {
		return this.aByteArray64[this.anInt5766++] & 0xFF;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V")
	public final void method4464(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)I")
	public final int method4465() {
		return this.aByteArray64[this.anInt5766++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "(II)V")
	public final void method4466(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt5766 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "(I)I")
	public final int method4467() {
		this.anInt5766 += 4;
		return ((this.aByteArray64[this.anInt5766 - 2] & 0xFF) << 24) + ((this.aByteArray64[this.anInt5766 - 1] & 0xFF) << 16) + ((this.aByteArray64[this.anInt5766 - 4] & 0xFF) << 8) + (this.aByteArray64[this.anInt5766 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBI[B)V")
	public final void method4468(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = arg0 - 1; local7 >= 0; local7--) {
			arg1[local7] = (byte) (this.aByteArray64[this.anInt5766++] - 128);
		}
	}

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "(I)I")
	public final int method4469() {
		@Pc(19) int local19 = this.aByteArray64[this.anInt5766] & 0xFF;
		return local19 >= 128 ? this.method4485() - 32768 : this.method4463();
	}

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "(I)I")
	public final int method4470() {
		this.anInt5766 += 2;
		@Pc(33) int local33 = (this.aByteArray64[this.anInt5766 - 2] - 128 & 0xFF) + ((this.aByteArray64[this.anInt5766 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI[BI)V")
	public final void method4471(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = this.aByteArray64[this.anInt5766++];
		}
	}

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "(II)V")
	public final void method4472(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 + 128);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "(I)B")
	public final byte method4473() {
		return (byte) (128 - this.aByteArray64[this.anInt5766++]);
	}

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "(II)V")
	public final void method4474(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)B")
	public final byte method4475() {
		return (byte) -this.aByteArray64[this.anInt5766++];
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)V")
	public final void method4476(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4445(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4448(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "(I)B")
	public final byte method4477() {
		return (byte) (this.aByteArray64[this.anInt5766++] - 128);
	}

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "(II)V")
	public final void method4478(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt5766 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(Z)I")
	public final int method4479() {
		@Pc(16) byte local16 = this.aByteArray64[this.anInt5766++];
		@Pc(24) int local24 = 0;
		while (local16 < 0) {
			local24 = (local24 | local16 & 0x7F) << 7;
			local16 = this.aByteArray64[this.anInt5766++];
		}
		return local24 | local16;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([BIBI)V")
	public final void method4480(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray64[this.anInt5766++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(JII)V")
	public final void method4481(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(23) int local23 = local6 * 8; local23 >= 0; local23 -= 8) {
			this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> local23);
		}
	}

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "(I)I")
	public final int method4482() {
		this.anInt5766 += 2;
		@Pc(31) int local31 = (this.aByteArray64[this.anInt5766 - 1] & 0xFF) + ((this.aByteArray64[this.anInt5766 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "(II)V")
	public final void method4483(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "(I)Ljava/lang/String;")
	public final String method4484() {
		@Pc(13) int local13 = this.anInt5766;
		while (this.aByteArray64[this.anInt5766++] != 0) {
		}
		@Pc(36) int local36 = this.anInt5766 - local13 - 1;
		return local36 == 0 ? "" : Static257.method5311(local36, local13, this.aByteArray64);
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(B)I")
	public final int method4485() {
		this.anInt5766 += 2;
		return ((this.aByteArray64[this.anInt5766 - 2] & 0xFF) << 8) + (this.aByteArray64[this.anInt5766 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "(B)I")
	public final int method4486() {
		this.anInt5766 += 2;
		return (this.aByteArray64[this.anInt5766 - 1] - 128 & 0xFF) + ((this.aByteArray64[this.anInt5766 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "(I)I")
	public final int method4487() {
		this.anInt5766 += 4;
		return ((this.aByteArray64[this.anInt5766 - 2] & 0xFF) << 8) + ((this.aByteArray64[this.anInt5766 - 4] & 0xFF) << 24) + ((this.aByteArray64[this.anInt5766 - 3] & 0xFF) << 16) + (this.aByteArray64[this.anInt5766 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(BI)V")
	public final void method4488(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method4490() {
		if (this.aByteArray64[this.anInt5766] == 0) {
			this.anInt5766++;
			return null;
		} else {
			return this.method4484();
		}
	}

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "(II)I")
	public final int method4491(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = Static12.method186(arg0, this.aByteArray64, this.anInt5766);
		this.method4450(local19);
		return local19;
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(BI)V")
	public final void method4492(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "(B)I")
	public final int method4493() {
		this.anInt5766 += 3;
		return ((this.aByteArray64[this.anInt5766 - 2] & 0xFF) << 8) + ((this.aByteArray64[this.anInt5766 - 3] & 0xFF) << 16) + (this.aByteArray64[this.anInt5766 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(Z)I")
	public final int method4494() {
		this.anInt5766 += 2;
		@Pc(33) int local33 = ((this.aByteArray64[this.anInt5766 - 2] & 0xFF) << 8) + (this.aByteArray64[this.anInt5766 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)J")
	public final long method4495(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local2 * 8;
		@Pc(26) long local26 = 0L;
		while (local24 >= 0) {
			local26 |= ((long) this.aByteArray64[this.anInt5766++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local26;
	}

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "(II)V")
	public final void method4496(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "(B)I")
	public final int method4497() {
		this.anInt5766 += 2;
		return (this.aByteArray64[this.anInt5766 - 2] & 0xFF) + ((this.aByteArray64[this.anInt5766 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "(I)I")
	public final int method4498() {
		this.anInt5766 += 4;
		return ((this.aByteArray64[this.anInt5766 - 1] & 0xFF) << 8) + ((this.aByteArray64[this.anInt5766 - 4] & 0xFF) << 16) + ((this.aByteArray64[this.anInt5766 + -3] & 0xFF) << 24) + (this.aByteArray64[this.anInt5766 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "(B)I")
	public final int method4499() {
		this.anInt5766 += 2;
		@Pc(39) int local39 = (this.aByteArray64[this.anInt5766 - 2] & 0xFF) + ((this.aByteArray64[this.anInt5766 - 1] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "(B)I")
	public final int method4500() {
		this.anInt5766 += 2;
		return (this.aByteArray64[this.anInt5766 - 2] - 128 & 0xFF) + ((this.aByteArray64[this.anInt5766 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "(II)V")
	public final void method4501(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4445(arg0 >>> 28 | 0x80);
					}
					this.method4445(arg0 >>> 21 | 0x80);
				}
				this.method4445(arg0 >>> 14 | 0x80);
			}
			this.method4445(arg0 >>> 7 | 0x80);
		}
		this.method4445(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "(II)V")
	public final void method4502(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "(II)V")
	public final void method4503(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt5766++] = (byte) arg0;
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt5766++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "(I)I")
	public final int method4504() {
		return 128 - this.aByteArray64[this.anInt5766++] & 0xFF;
	}

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "(I)Z")
	public final boolean method4505() {
		this.anInt5766 -= 4;
		@Pc(19) int local19 = Static12.method186(0, this.aByteArray64, this.anInt5766);
		@Pc(23) int local23 = this.method4487();
		return local19 == local23;
	}
}
