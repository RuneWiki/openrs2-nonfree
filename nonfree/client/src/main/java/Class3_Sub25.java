import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
	public int anInt4974 = 0;

	@OriginalMember(owner = "client!nj", name = "yb", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
	public Class3_Sub25(@OriginalArg(0) int arg0) {
		this.aByteArray88 = Static59.method1113(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V")
	public Class3_Sub25(@OriginalArg(0) byte[] arg0) {
		this.aByteArray88 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(BI)V")
	public final void method4061(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt4974 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public final void method4062(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt4974 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt4974 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt4974 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt4974 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(JI)V")
	public final void method4063(@OriginalArg(0) long arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 56);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 48);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 40);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 32);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
	public final int method4064() {
		@Pc(16) int local16 = Static322.method4456(0, this.anInt4974, this.aByteArray88);
		this.method4082(local16);
		return local16;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	public final int method4065() {
		this.anInt4974 += 2;
		@Pc(36) int local36 = (this.aByteArray88[this.anInt4974 - 1] & 0xFF) + ((this.aByteArray88[this.anInt4974 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)I")
	public final int method4066() {
		return this.aByteArray88[this.anInt4974++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)I")
	public final int method4067() {
		this.anInt4974 += 2;
		return ((this.aByteArray88[this.anInt4974 - 1] & 0xFF) << 8) + (this.aByteArray88[this.anInt4974 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I")
	public final int method4068() {
		this.anInt4974 += 4;
		return ((this.aByteArray88[this.anInt4974 - 1] & 0xFF) << 8) + ((this.aByteArray88[this.anInt4974 - 4] & 0xFF) << 16) + ((this.aByteArray88[-3 + this.anInt4974] & 0xFF) << 24) + (this.aByteArray88[this.anInt4974 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI[II)V")
	public final void method4069(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt4974;
		this.anInt4974 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method4108();
			@Pc(30) int local30 = this.method4108();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local32 + arg0[local32 >>> 11 & 0x3] ^ local26 + (local26 << 4 ^ local26 >>> 5);
				local32 -= -1640531527;
				local26 -= local32 + arg0[local32 & 0x3] ^ local30 + (local30 >>> 5 ^ local30 << 4);
			}
			this.anInt4974 -= 8;
			this.method4082(local26);
			this.method4082(local30);
		}
		this.anInt4974 = local8;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V")
	public final void method4070(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(BI)V")
	public final void method4071(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "(I)I")
	public final int method4072() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method4086(); local11 == 32767; local11 = this.method4086()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public final String method4073() {
		@Pc(11) int local11 = this.anInt4974;
		while (this.aByteArray88[this.anInt4974++] != 0) {
		}
		@Pc(34) int local34 = this.anInt4974 - local11 - 1;
		return local34 == 0 ? "" : Static300.method4282(this.aByteArray88, local11, local34);
	}

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "(I)B")
	public final byte method4074() {
		return (byte) (128 - this.aByteArray88[this.anInt4974++]);
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(BI)V")
	public final void method4075(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4081(arg0 >>> 28 | 0x80);
					}
					this.method4081(arg0 >>> 21 | 0x80);
				}
				this.method4081(arg0 >>> 14 | 0x80);
			}
			this.method4081(arg0 >>> 7 | 0x80);
		}
		this.method4081(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)I")
	public final int method4076() {
		return 128 - this.aByteArray88[this.anInt4974++] & 0xFF;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V")
	public final void method4077(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 + 128);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "(I)I")
	public final int method4078() {
		@Pc(16) byte local16 = this.aByteArray88[this.anInt4974++];
		@Pc(23) int local23 = 0;
		while (local16 < 0) {
			local23 = (local16 & 0x7F | local23) << 7;
			local16 = this.aByteArray88[this.anInt4974++];
		}
		return local23 | local16;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)J")
	public final long method4079(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(27) int local27 = local2 * 8;
		@Pc(29) long local29 = 0L;
		while (local27 >= 0) {
			local29 |= ((long) this.aByteArray88[this.anInt4974++] & 0xFFL) << local27;
			local27 -= 8;
		}
		return local29;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method4080(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.indexOf(0);
		if (local13 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local13 + " - cannot pjstr");
		}
		this.anInt4974 += Static339.method4722(arg0, this.anInt4974, arg0.length(), this.aByteArray88);
		this.aByteArray88[this.anInt4974++] = 0;
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(BI)V")
	public final void method4081(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(II)V")
	public final void method4082(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "(I)I")
	public final int method4083() {
		this.anInt4974 += 2;
		return ((this.aByteArray88[this.anInt4974 - 2] & 0xFF) << 8) + (this.aByteArray88[this.anInt4974 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(II)V")
	public final void method4084(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "(I)I")
	public final int method4085() {
		this.anInt4974 += 3;
		return (this.aByteArray88[this.anInt4974 - 2] & 0xFF) + ((this.aByteArray88[this.anInt4974 - 3] & 0xFF) << 16) + ((this.aByteArray88[this.anInt4974 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)I")
	public final int method4086() {
		@Pc(11) int local11 = this.aByteArray88[this.anInt4974] & 0xFF;
		return local11 < 128 ? this.method4096() : this.method4083() - 32768;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)J")
	public final long method4087() {
		@Pc(17) long local17 = (long) this.method4108() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method4108() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "(I)I")
	public final int method4088() {
		this.anInt4974 += 2;
		return (this.aByteArray88[this.anInt4974 - 2] & 0xFF) + ((this.aByteArray88[this.anInt4974 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method4089() {
		if (this.aByteArray88[this.anInt4974] == 0) {
			this.anInt4974++;
			return null;
		} else {
			return this.method4073();
		}
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(II)V")
	public final void method4090(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(II)V")
	public final void method4091(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "(I)I")
	public final int method4092() {
		@Pc(19) int local19 = this.aByteArray88[this.anInt4974] & 0xFF;
		return local19 >= 128 ? this.method4083() - 49152 : this.method4096() + -64;
	}

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "(II)V")
	public final void method4093(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "(I)Z")
	public final boolean method4094() {
		this.anInt4974 -= 4;
		@Pc(22) int local22 = Static322.method4456(0, this.anInt4974, this.aByteArray88);
		@Pc(26) int local26 = this.method4108();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(B)I")
	public final int method4095() {
		return -this.aByteArray88[this.anInt4974++] & 0xFF;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(Z)I")
	public final int method4096() {
		return this.aByteArray88[this.anInt4974++] & 0xFF;
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(B)B")
	public final byte method4097() {
		return this.aByteArray88[this.anInt4974++];
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[BII)V")
	public final void method4098(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			this.aByteArray88[this.anInt4974++] = arg0[local5];
		}
	}

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "(I)I")
	public final int method4099() {
		this.anInt4974 += 3;
		return ((this.aByteArray88[this.anInt4974 - 2] & 0xFF) << 8) + (((this.aByteArray88[this.anInt4974 - 3] & 0xFF) << 16) + (this.aByteArray88[this.anInt4974 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "(I)I")
	public final int method4100() {
		this.anInt4974 += 4;
		return ((this.aByteArray88[this.anInt4974 - 4] & 0xFF) << 8) + ((this.aByteArray88[this.anInt4974 - 1] & 0xFF) << 16) + ((this.aByteArray88[this.anInt4974 + -2] & 0xFF) << 24) + (this.aByteArray88[this.anInt4974 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(Z)B")
	public final byte method4101() {
		return (byte) (this.aByteArray88[this.anInt4974++] - 128);
	}

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "(I)I")
	public final int method4103() {
		this.anInt4974 += 3;
		@Pc(48) int local48 = ((this.aByteArray88[this.anInt4974 - 2] & 0xFF) << 8) + ((this.aByteArray88[this.anInt4974 - 3] & 0xFF) << 16) + (this.aByteArray88[this.anInt4974 + -1] & 0xFF);
		if (local48 > 8388607) {
			local48 -= 16777216;
		}
		return local48;
	}

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "(I)Ljava/lang/String;")
	public final String method4104() {
		@Pc(14) byte local14 = this.aByteArray88[this.anInt4974++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(32) int local32 = this.method4078();
		if (this.anInt4974 + local32 > this.aByteArray88.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(53) String local53 = Static162.method2548(this.aByteArray88, local32, this.anInt4974);
		this.anInt4974 += local32;
		return local53;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(BI)V")
	public final void method4105(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 24);
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "(II)V")
	public final void method4106(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(ILjava/lang/String;)V")
	public final void method4107(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = Static21.method6249(arg0);
		this.aByteArray88[this.anInt4974++] = 0;
		this.method4075(local7);
		this.anInt4974 += Static240.method5196(this.aByteArray88, arg0, this.anInt4974);
	}

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "(I)I")
	public final int method4108() {
		this.anInt4974 += 4;
		return (this.aByteArray88[this.anInt4974 - 1] & 0xFF) + ((this.aByteArray88[this.anInt4974 - 2] & 0xFF) << 8) + ((this.aByteArray88[this.anInt4974 + -3] & 0xFF) << 16) + ((this.aByteArray88[this.anInt4974 + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "(I)I")
	public final int method4109() {
		this.anInt4974 += 2;
		return ((this.aByteArray88[this.anInt4974 - 2] & 0xFF) << 8) + (this.aByteArray88[this.anInt4974 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IZ)V")
	public final void method4110(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4081(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4123(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method4111(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4974;
		this.anInt4974 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4118(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt4974 = 0;
		this.method4123(local31.length);
		this.method4098(local31, local31.length);
	}

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "(I)B")
	public final byte method4112() {
		return (byte) -this.aByteArray88[this.anInt4974++];
	}

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "(II)I")
	public final int method4113(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = Static322.method4456(arg0, this.anInt4974, this.aByteArray88);
		this.method4082(local15);
		return local15;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB[BI)V")
	public final void method4115(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(18) int local18 = arg0 - 1; local18 >= 0; local18--) {
			arg1[local18] = this.aByteArray88[this.anInt4974++];
		}
	}

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "(B)I")
	public final int method4117() {
		this.anInt4974 += 4;
		return ((this.aByteArray88[this.anInt4974 - 1] & 0xFF) << 24) - (-((this.aByteArray88[this.anInt4974 - 2] & 0xFF) << 16) - ((this.aByteArray88[this.anInt4974 - 3] & 0xFF) << 8) - (this.aByteArray88[this.anInt4974 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BBII)V")
	public final void method4118(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray88[this.anInt4974++];
		}
	}

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "(B)Ljava/lang/String;")
	public final String method4119() {
		@Pc(14) byte local14 = this.aByteArray88[this.anInt4974++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt4974;
		while (this.aByteArray88[this.anInt4974++] != 0) {
		}
		@Pc(47) int local47 = this.anInt4974 - local27 - 1;
		return local47 == 0 ? "" : Static300.method4282(this.aByteArray88, local27, local47);
	}

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "(II)V")
	public final void method4120(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "(I)I")
	public final int method4121() {
		this.anInt4974 += 2;
		@Pc(32) int local32 = ((this.aByteArray88[this.anInt4974 - 1] & 0xFF) << 8) + (this.aByteArray88[this.anInt4974 - 2] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "(II)V")
	public final void method4122(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "(II)V")
	public final void method4123(@OriginalArg(0) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "(II)V")
	public final void method4124(@OriginalArg(1) int arg0) {
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 16);
		this.aByteArray88[this.anInt4974++] = (byte) (arg0 >> 8);
		this.aByteArray88[this.anInt4974++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIJ)V")
	public final void method4125(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local6 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray88[this.anInt4974++] = (byte) (arg1 >> local27);
		}
	}
}
