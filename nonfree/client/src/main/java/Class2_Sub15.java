import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!es", name = "N", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!es", name = "V", descriptor = "I")
	public int anInt5241;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(I)V")
	public Class2_Sub15(@OriginalArg(0) int arg0) {
		this.aByteArray62 = Static147.method2428(arg0);
		this.anInt5241 = 0;
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "([B)V")
	public Class2_Sub15(@OriginalArg(0) byte[] arg0) {
		this.anInt5241 = 0;
		this.aByteArray62 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I")
	public final int method4285(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static380.method5628(arg0, this.aByteArray62, this.anInt5241);
		this.method4288(local11);
		return local11;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V")
	public final void method4286(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4333(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4350(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)I")
	public final int method4287() {
		this.anInt5241 += 4;
		return (this.aByteArray62[this.anInt5241 - 3] & 0xFF) + ((this.aByteArray62[this.anInt5241 - 2] & 0xFF) << 24) + ((this.aByteArray62[this.anInt5241 + -1] & 0xFF) << 16) + ((this.aByteArray62[this.anInt5241 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(II)V")
	public final void method4288(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)I")
	public final int method4289() {
		@Pc(11) int local11 = this.aByteArray62[this.anInt5241] & 0xFF;
		return local11 < 128 ? this.method4325() - 64 : this.method4294() + -49152;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(II)V")
	public final void method4290(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)I")
	public final int method4291() {
		this.anInt5241 += 2;
		return (this.aByteArray62[this.anInt5241 - 1] - 128 & 0xFF) + ((this.aByteArray62[this.anInt5241 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(II)V")
	public final void method4292(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4333(arg0 >>> 28 | 0x80);
					}
					this.method4333(arg0 >>> 21 | 0x80);
				}
				this.method4333(arg0 >>> 14 | 0x80);
			}
			this.method4333(arg0 >>> 7 | 0x80);
		}
		this.method4333(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)I")
	public final int method4293() {
		@Pc(11) int local11 = Static380.method5628(0, this.aByteArray62, this.anInt5241);
		this.method4288(local11);
		return local11;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)I")
	public final int method4294() {
		this.anInt5241 += 2;
		return (this.aByteArray62[this.anInt5241 - 1] & 0xFF) + ((this.aByteArray62[this.anInt5241 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([BIII)V")
	public final void method4295(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = this.aByteArray62[this.anInt5241++];
		}
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(II)V")
	public final void method4296(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!es", name = "i", descriptor = "(I)Ljava/lang/String;")
	public final String method4297() {
		if (this.aByteArray62[this.anInt5241] == 0) {
			this.anInt5241++;
			return null;
		} else {
			return this.method4324();
		}
	}

	@OriginalMember(owner = "client!es", name = "j", descriptor = "(I)I")
	public final int method4298() {
		this.anInt5241 += 4;
		return ((this.aByteArray62[this.anInt5241 - 3] & 0xFF) << 8) + ((this.aByteArray62[this.anInt5241 - 2] & 0xFF) << 16) + ((this.aByteArray62[this.anInt5241 + -1] & 0xFF) << 24) + (this.aByteArray62[this.anInt5241 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III[B)V")
	public final void method4299(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			this.aByteArray62[this.anInt5241++] = arg1[local11];
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4300(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = Static99.method1500(arg0);
		this.aByteArray62[this.anInt5241++] = 0;
		this.method4292(local15);
		this.anInt5241 += Static197.method3251(arg0, this.aByteArray62, this.anInt5241);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method4301(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt5241;
		this.anInt5241 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4346(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(36) BigInteger local36 = local23.modPow(arg0, arg1);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt5241 = 0;
		this.method4350(local39.length);
		this.method4299(local39.length, local39);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIJ)V")
	public final void method4302(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local6 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray62[this.anInt5241++] = (byte) (arg1 >> local29);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)I")
	public final int method4303() {
		this.anInt5241 += 3;
		return (this.aByteArray62[this.anInt5241 - 3] & 0xFF) + ((this.aByteArray62[this.anInt5241 - 1] & 0xFF) << 16) + ((this.aByteArray62[this.anInt5241 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!es", name = "k", descriptor = "(I)B")
	public final byte method4304() {
		return this.aByteArray62[this.anInt5241++];
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
	public final void method4305(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)I")
	public final int method4306() {
		this.anInt5241 += 2;
		return (this.aByteArray62[this.anInt5241 - 2] - 128 & 0xFF) + ((this.aByteArray62[this.anInt5241 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!es", name = "l", descriptor = "(I)I")
	public final int method4307() {
		this.anInt5241 += 4;
		return ((this.aByteArray62[this.anInt5241 - 2] & 0xFF) << 8) + ((this.aByteArray62[this.anInt5241 - 4] & 0xFF) << 24) + ((this.aByteArray62[this.anInt5241 + -3] & 0xFF) << 16) + (this.aByteArray62[this.anInt5241 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)V")
	public final void method4308(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(B)B")
	public final byte method4309() {
		return (byte) (this.aByteArray62[this.anInt5241++] - 128);
	}

	@OriginalMember(owner = "client!es", name = "m", descriptor = "(I)I")
	public final int method4310() {
		this.anInt5241 += 4;
		return (this.aByteArray62[this.anInt5241 - 2] & 0xFF) + ((this.aByteArray62[this.anInt5241 - 1] & 0xFF) << 8) + ((this.aByteArray62[this.anInt5241 + -4] & 0xFF) << 16) + ((this.aByteArray62[this.anInt5241 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!es", name = "g", descriptor = "(II)V")
	public final void method4311(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(B)V")
	public final void method4312() {
		if (this.aByteArray62 != null) {
			Static147.method2429(this.aByteArray62);
		}
		this.aByteArray62 = null;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public final void method4313(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr");
		}
		this.anInt5241 += Static319.method4945(arg0.length(), this.aByteArray62, this.anInt5241, arg0);
		this.aByteArray62[this.anInt5241++] = 0;
	}

	@OriginalMember(owner = "client!es", name = "n", descriptor = "(I)I")
	public final int method4314() {
		this.anInt5241 += 4;
		return (this.aByteArray62[this.anInt5241 - 4] & 0xFF) + ((this.aByteArray62[this.anInt5241 - 2] & 0xFF) << 16) + ((this.aByteArray62[this.anInt5241 - 1] & 0xFF) << 24) + ((this.aByteArray62[this.anInt5241 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(Z)I")
	public final int method4315() {
		@Pc(16) byte local16 = this.aByteArray62[this.anInt5241++];
		@Pc(25) int local25 = 0;
		while (local16 < 0) {
			local25 = (local25 | local16 & 0x7F) << 7;
			local16 = this.aByteArray62[this.anInt5241++];
		}
		return local16 | local25;
	}

	@OriginalMember(owner = "client!es", name = "h", descriptor = "(II)V")
	public final void method4316(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!es", name = "o", descriptor = "(I)I")
	public final int method4317() {
		this.anInt5241 += 2;
		@Pc(38) int local38 = (this.aByteArray62[this.anInt5241 - 2] - 128 & 0xFF) + ((this.aByteArray62[this.anInt5241 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(JI)V")
	public final void method4318(@OriginalArg(0) long arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 56);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 48);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 40);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 32);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(Z)B")
	public final byte method4319() {
		return (byte) -this.aByteArray62[this.anInt5241++];
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I[III)V")
	public final void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = this.anInt5241;
		this.anInt5241 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(33) int local33 = this.method4307();
			@Pc(39) int local39 = this.method4307();
			@Pc(41) int local41 = -957401312;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local39 -= arg1[local41 >>> 11 & 0x90C00003] + local41 ^ local33 + (local33 >>> 5 ^ local33 << 4);
				local41 -= -1640531527;
				local33 -= arg1[local41 & 0x3] + local41 ^ local39 + (local39 << 4 ^ local39 >>> 5);
			}
			this.anInt5241 -= 8;
			this.method4288(local33);
			this.method4288(local39);
		}
		this.anInt5241 = local8;
	}

	@OriginalMember(owner = "client!es", name = "p", descriptor = "(I)Ljava/lang/String;")
	public final String method4321() {
		@Pc(14) byte local14 = this.aByteArray62[this.anInt5241++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt5241;
		while (this.aByteArray62[this.anInt5241++] != 0) {
		}
		@Pc(47) int local47 = this.anInt5241 - local24 - 1;
		return local47 == 0 ? "" : Static58.method953(local47, this.aByteArray62, local24);
	}

	@OriginalMember(owner = "client!es", name = "q", descriptor = "(I)I")
	public final int method4322() {
		return 128 - this.aByteArray62[this.anInt5241++] & 0xFF;
	}

	@OriginalMember(owner = "client!es", name = "r", descriptor = "(I)I")
	public final int method4323() {
		return this.aByteArray62[this.anInt5241++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method4324() {
		@Pc(6) int local6 = this.anInt5241;
		while (this.aByteArray62[this.anInt5241++] != 0) {
		}
		@Pc(30) int local30 = this.anInt5241 - local6 - 1;
		return local30 == 0 ? "" : Static58.method953(local30, this.aByteArray62, local6);
	}

	@OriginalMember(owner = "client!es", name = "s", descriptor = "(I)I")
	public final int method4325() {
		return this.aByteArray62[this.anInt5241++] & 0xFF;
	}

	@OriginalMember(owner = "client!es", name = "i", descriptor = "(II)V")
	public final void method4326(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!es", name = "t", descriptor = "(I)I")
	public final int method4328() {
		@Pc(17) int local17 = this.aByteArray62[this.anInt5241] & 0xFF;
		return local17 < 128 ? this.method4325() : this.method4294() - 32768;
	}

	@OriginalMember(owner = "client!es", name = "j", descriptor = "(II)V")
	public final void method4329(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 + 128);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!es", name = "k", descriptor = "(II)V")
	public final void method4330(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!es", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method4331() {
		@Pc(20) byte local20 = this.aByteArray62[this.anInt5241++];
		if (local20 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(31) int local31 = this.method4315();
		if (this.aByteArray62.length < this.anInt5241 + local31) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(52) String local52 = Static63.method1026(this.aByteArray62, this.anInt5241, local31);
		this.anInt5241 += local31;
		return local52;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(IB)V")
	public final void method4333(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "u", descriptor = "(I)I")
	public final int method4334() {
		this.anInt5241 += 2;
		@Pc(31) int local31 = (this.aByteArray62[this.anInt5241 - 1] & 0xFF) + ((this.aByteArray62[this.anInt5241 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)J")
	public final long method4335(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(30) int local30 = local2 * 8;
		@Pc(32) long local32 = 0L;
		while (local30 >= 0) {
			local32 |= ((long) this.aByteArray62[this.anInt5241++] & 0xFFL) << local30;
			local30 -= 8;
		}
		return local32;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(IB)V")
	public final void method4336(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!es", name = "l", descriptor = "(II)V")
	public final void method4337(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray62[this.anInt5241 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt5241 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "h", descriptor = "(B)I")
	public final int method4338() {
		return -this.aByteArray62[this.anInt5241++] & 0xFF;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(IB)V")
	public final void method4339(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "i", descriptor = "(B)I")
	public final int method4340() {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17;
		for (local17 = this.method4328(); local17 == 32767; local17 = this.method4328()) {
			local7 += 32767;
		}
		return local7 + local17;
	}

	@OriginalMember(owner = "client!es", name = "v", descriptor = "(I)I")
	public final int method4341() {
		this.anInt5241 += 3;
		return ((this.aByteArray62[this.anInt5241 - 3] & 0xFF) << 16) + (((this.aByteArray62[this.anInt5241 - 2] & 0xFF) << 8) + (this.aByteArray62[this.anInt5241 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(BI)V")
	public final void method4342(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!es", name = "j", descriptor = "(B)I")
	public final int method4343() {
		this.anInt5241 += 2;
		return ((this.aByteArray62[this.anInt5241 - 1] & 0xFF) << 8) + (this.aByteArray62[this.anInt5241 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!es", name = "w", descriptor = "(I)B")
	public final byte method4344() {
		return (byte) (128 - this.aByteArray62[this.anInt5241++]);
	}

	@OriginalMember(owner = "client!es", name = "x", descriptor = "(I)Z")
	public final boolean method4345() {
		this.anInt5241 -= 4;
		@Pc(17) int local17 = Static380.method5628(0, this.aByteArray62, this.anInt5241);
		@Pc(21) int local21 = this.method4307();
		return local17 == local21;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([BZII)V")
	public final void method4346(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray62[this.anInt5241++];
		}
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(IB)V")
	public final void method4347(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 16);
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!es", name = "k", descriptor = "(B)I")
	public final int method4348() {
		this.anInt5241 += 3;
		@Pc(50) int local50 = (this.aByteArray62[this.anInt5241 - 1] & 0xFF) + ((this.aByteArray62[this.anInt5241 - 3] & 0xFF) << 16) + ((this.aByteArray62[this.anInt5241 + -2] & 0xFF) << 8);
		if (local50 > 8388607) {
			local50 -= 16777216;
		}
		return local50;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(BI)V")
	public final void method4349(@OriginalArg(1) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!es", name = "m", descriptor = "(II)V")
	public final void method4350(@OriginalArg(0) int arg0) {
		this.aByteArray62[this.anInt5241++] = (byte) (arg0 >> 8);
		this.aByteArray62[this.anInt5241++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(Z)J")
	public final long method4351() {
		@Pc(10) long local10 = (long) this.method4307() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method4307() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}
}
