import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!ti", name = "W", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!ti", name = "db", descriptor = "I")
	public int anInt5695;

	static {
		new Class179("", 76);
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14(@OriginalArg(0) int arg0) {
		this.aByteArray65 = Static347.method4990(arg0);
		this.anInt5695 = 0;
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([B)V")
	public Class1_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray65 = arg0;
		this.anInt5695 = 0;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
	public final int method4491() {
		return 128 - this.aByteArray65[this.anInt5695++] & 0xFF;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)Ljava/lang/String;")
	public final String method4492() {
		@Pc(21) byte local21 = this.aByteArray65[this.anInt5695++];
		if (local21 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(31) int local31 = this.anInt5695;
		while (this.aByteArray65[this.anInt5695++] != 0) {
		}
		@Pc(51) int local51 = this.anInt5695 - local31 - 1;
		return local51 == 0 ? "" : Static332.method4783(local31, this.aByteArray65, local51);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V")
	public final void method4493(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)I")
	public final int method4494() {
		return -this.aByteArray65[this.anInt5695++] & 0xFF;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
	public final void method4495(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I")
	public final int method4496() {
		this.anInt5695 += 3;
		return (this.aByteArray65[this.anInt5695 - 1] & 0xFF) + ((this.aByteArray65[this.anInt5695 - 2] & 0xFF) << 8) + ((this.aByteArray65[this.anInt5695 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)J")
	public final long method4497(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local6 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray65[this.anInt5695++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)I")
	public final int method4498() {
		this.anInt5695 += 2;
		return (this.aByteArray65[this.anInt5695 - 1] & 0xFF) + ((this.aByteArray65[this.anInt5695 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)I")
	public final int method4499() {
		this.anInt5695 += 2;
		return (this.aByteArray65[this.anInt5695 - 2] - 128 & 0xFF) + ((this.aByteArray65[this.anInt5695 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)I")
	public final int method4500() {
		this.anInt5695 += 4;
		return (this.aByteArray65[this.anInt5695 - 1] & 0xFF) + ((this.aByteArray65[this.anInt5695 - 2] & 0xFF) << 8) + ((this.aByteArray65[this.anInt5695 + -3] & 0xFF) << 16) + ((this.aByteArray65[this.anInt5695 - 4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[BZ)V")
	public final void method4501(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = arg0 - 1; local7 >= 0; local7--) {
			arg1[local7] = (byte) (this.aByteArray65[this.anInt5695++] - 128);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IJ)V")
	public final void method4502(@OriginalArg(1) long arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 56);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 48);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 40);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 32);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)I")
	public final int method4503() {
		this.anInt5695 += 4;
		return ((this.aByteArray65[this.anInt5695 - 1] & 0xFF) << 8) + ((this.aByteArray65[this.anInt5695 - 4] & 0xFF) << 16) + ((this.aByteArray65[this.anInt5695 + -3] & 0xFF) << 24) + (this.aByteArray65[this.anInt5695 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)V")
	public final void method4504(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(IB)V")
	public final void method4505(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 + 128);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[BI)V")
	public final void method4506(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray65[this.anInt5695++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(B)I")
	public final int method4507() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16;
		for (local16 = this.method4521(); local16 == 32767; local16 = this.method4521()) {
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)V")
	public final void method4508(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method4509() {
		@Pc(6) int local6 = this.anInt5695;
		while (this.aByteArray65[this.anInt5695++] != 0) {
		}
		@Pc(26) int local26 = this.anInt5695 - local6 - 1;
		return local26 == 0 ? "" : Static332.method4783(local6, this.aByteArray65, local26);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[IB)V")
	public final void method4510(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(6) int local6 = this.anInt5695;
		this.anInt5695 = 5;
		@Pc(24) int local24 = (arg0 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(31) int local31 = this.method4500();
			@Pc(35) int local35 = this.method4500();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= local37 + arg1[local37 >>> 11 & 0x3] ^ (local31 << 4 ^ local31 >>> 5) + local31;
				local37 -= -1640531527;
				local31 -= local37 + arg1[local37 & 0x3] ^ local35 + (local35 >>> 5 ^ local35 << 4);
			}
			this.anInt5695 -= 8;
			this.method4522(local31);
			this.method4522(local35);
		}
		this.anInt5695 = local6;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[BII)V")
	public final void method4511(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			arg0[local9] = this.aByteArray65[this.anInt5695++];
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method4512(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt5695 += Static342.method4928(this.anInt5695, arg0, this.aByteArray65, arg0.length());
		this.aByteArray65[this.anInt5695++] = 0;
	}

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "(B)B")
	public final byte method4513() {
		return (byte) -this.aByteArray65[this.anInt5695++];
	}

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "(B)B")
	public final byte method4514() {
		return (byte) (this.aByteArray65[this.anInt5695++] - 128);
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(II)V")
	public final void method4515(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(II)V")
	public final void method4516(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(IB)V")
	public final void method4517(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4553(arg0 >>> 28 | 0x80);
					}
					this.method4553(arg0 >>> 21 | 0x80);
				}
				this.method4553(arg0 >>> 14 | 0x80);
			}
			this.method4553(arg0 >>> 7 | 0x80);
		}
		this.method4553(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "(B)I")
	public final int method4518() {
		this.anInt5695 += 2;
		return ((this.aByteArray65[this.anInt5695 - 1] & 0xFF) << 8) + (this.aByteArray65[this.anInt5695 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)I")
	public final int method4519() {
		this.anInt5695 += 4;
		return ((this.aByteArray65[this.anInt5695 - 4] & 0xFF) << 8) + ((this.aByteArray65[this.anInt5695 - 2] & 0xFF) << 24) + ((this.aByteArray65[this.anInt5695 - 1] & 0xFF) << 16) + (this.aByteArray65[this.anInt5695 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(II)V")
	public final void method4520(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5695 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5695 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5695 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(Z)I")
	public final int method4521() {
		@Pc(16) int local16 = this.aByteArray65[this.anInt5695] & 0xFF;
		return local16 < 128 ? this.method4548() : this.method4498() - 32768;
	}

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "(II)V")
	public final void method4522(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)I")
	public final int method4524() {
		return this.aByteArray65[this.anInt5695++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "(I)I")
	public final int method4525() {
		@Pc(16) int local16 = this.aByteArray65[this.anInt5695] & 0xFF;
		return local16 >= 128 ? this.method4498() - 49152 : this.method4548() + -64;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II[BI)V")
	public final void method4526(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(12) int local12 = arg0 - 1; local12 >= 0; local12--) {
			arg1[local12] = this.aByteArray65[this.anInt5695++];
		}
	}

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "(II)V")
	public final void method4527(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5695 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "(I)I")
	public final int method4528() {
		this.anInt5695 += 4;
		return (this.aByteArray65[this.anInt5695 - 4] & 0xFF) + ((this.aByteArray65[this.anInt5695 - 3] & 0xFF) << 8) + ((this.aByteArray65[this.anInt5695 + -2] & 0xFF) << 16) + ((this.aByteArray65[this.anInt5695 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "(B)B")
	public final byte method4529() {
		return this.aByteArray65[this.anInt5695++];
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BJI)V")
	public final void method4530(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local6 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> local24);
		}
	}

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "(I)I")
	public final int method4531() {
		this.anInt5695 += 2;
		@Pc(36) int local36 = (this.aByteArray65[this.anInt5695 - 1] & 0xFF) + ((this.aByteArray65[this.anInt5695 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "(B)I")
	public final int method4532() {
		this.anInt5695 += 3;
		return ((this.aByteArray65[this.anInt5695 - 3] & 0xFF) << 16) + (this.aByteArray65[this.anInt5695 - 1] << 8 & 0xFF00) + (this.aByteArray65[this.anInt5695 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "(B)I")
	public final int method4533() {
		this.anInt5695 += 2;
		return ((this.aByteArray65[this.anInt5695 - 2] & 0xFF) << 8) + (this.aByteArray65[this.anInt5695 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "(II)I")
	public final int method4534(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static193.method3489(arg0, this.anInt5695, this.aByteArray65);
		this.method4522(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "(II)V")
	public final void method4535(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "(B)I")
	public final int method4536() {
		this.anInt5695 += 2;
		@Pc(37) int local37 = ((this.aByteArray65[this.anInt5695 - 1] & 0xFF) << 8) + (this.aByteArray65[this.anInt5695 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "(II)V")
	public final void method4537(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5695 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "(II)V")
	public final void method4538(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4553(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4504(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "(II)V")
	public final void method4540(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 24);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "(I)I")
	public final int method4541() {
		@Pc(25) byte local25 = this.aByteArray65[this.anInt5695++];
		@Pc(27) int local27 = 0;
		while (local25 < 0) {
			local27 = (local27 | local25 & 0x7F) << 7;
			local25 = this.aByteArray65[this.anInt5695++];
		}
		return local25 | local27;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B[I)V")
	public final void method4542(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt5695 / 8;
		this.anInt5695 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10; local23++) {
			@Pc(29) int local29 = this.method4500();
			@Pc(33) int local33 = this.method4500();
			@Pc(35) int local35 = 0;
			@Pc(39) int local39 = 32;
			while (local39-- > 0) {
				local29 += local35 + arg0[local35 & 0x3] ^ (local33 >>> 5 ^ local33 << 4) - -local33;
				local35 += -1640531527;
				local33 += arg0[local35 >>> 11 & 0x3] + local35 ^ local29 + (local29 >>> 5 ^ local29 << 4);
			}
			this.anInt5695 -= 8;
			this.method4522(local29);
			this.method4522(local33);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method4543(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5695;
		this.anInt5695 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4511(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt5695 = 0;
		this.method4553(local31.length);
		this.method4506(local31, local31.length);
	}

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "(II)V")
	public final void method4544(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(BI)V")
	public final void method4545(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "(I)Z")
	public final boolean method4546() {
		this.anInt5695 -= 4;
		@Pc(17) int local17 = Static193.method3489(0, this.anInt5695, this.aByteArray65);
		@Pc(21) int local21 = this.method4500();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "(B)J")
	public final long method4547() {
		@Pc(15) long local15 = (long) this.method4500() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method4500() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "(B)I")
	public final int method4548() {
		return this.aByteArray65[this.anInt5695++] & 0xFF;
	}

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "(II)V")
	public final void method4549(@OriginalArg(0) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 8);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 16);
		this.aByteArray65[this.anInt5695++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "(B)Ljava/lang/String;")
	public final String method4550() {
		if (this.aByteArray65[this.anInt5695] == 0) {
			this.anInt5695++;
			return null;
		} else {
			return this.method4509();
		}
	}

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "(B)I")
	public final int method4551() {
		this.anInt5695 += 2;
		@Pc(38) int local38 = (this.aByteArray65[this.anInt5695 - 1] - 128 & 0xFF) + ((this.aByteArray65[this.anInt5695 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "(B)B")
	public final byte method4552() {
		return (byte) (128 - this.aByteArray65[this.anInt5695++]);
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(BI)V")
	public final void method4553(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(BI)V")
	public final void method4554(@OriginalArg(1) int arg0) {
		this.aByteArray65[this.anInt5695++] = (byte) -arg0;
	}
}
