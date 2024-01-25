import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!gk", name = "ab", descriptor = "I")
	public int anInt5186 = 0;

	@OriginalMember(owner = "client!gk", name = "W", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7(@OriginalArg(0) int arg0) {
		this.aByteArray52 = Static433.method5697(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([B)V")
	public Class2_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray52 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)V")
	public final void method4456(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)J")
	public final long method4457(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		if (local9 < 0 || local9 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(31) int local31 = local9 * 8;
		@Pc(33) long local33 = 0L;
		while (local31 >= 0) {
			local33 |= ((long) this.aByteArray52[this.anInt5186++] & 0xFFL) << local31;
			local31 -= 8;
		}
		return local33;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I")
	public final int method4458() {
		@Pc(11) int local11 = this.aByteArray52[this.anInt5186] & 0xFF;
		return local11 < 128 ? this.method4464() : this.method4518() - 32768;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V")
	public final void method4459(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V")
	public final void method4460(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5186 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5186 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5186 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
	public final int method4461() {
		this.anInt5186 += 2;
		@Pc(38) int local38 = (this.aByteArray52[this.anInt5186 - 1] - 128 & 0xFF) + ((this.aByteArray52[this.anInt5186 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)V")
	public final void method4462(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)I")
	public final int method4463() {
		@Pc(16) byte local16 = this.aByteArray52[this.anInt5186++];
		@Pc(24) int local24 = 0;
		while (local16 < 0) {
			local24 = (local16 & 0x7F | local24) << 7;
			local16 = this.aByteArray52[this.anInt5186++];
		}
		return local16 | local24;
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)I")
	public final int method4464() {
		return this.aByteArray52[this.anInt5186++] & 0xFF;
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)I")
	public final int method4465() {
		this.anInt5186 += 2;
		return ((this.aByteArray52[this.anInt5186 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt5186 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)I")
	public final int method4466() {
		return this.aByteArray52[this.anInt5186++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)I")
	public final int method4467() {
		this.anInt5186 += 4;
		return (this.aByteArray52[this.anInt5186 - 3] & 0xFF) + ((this.aByteArray52[this.anInt5186 - 2] & 0xFF) << 24) + ((this.aByteArray52[this.anInt5186 - 1] & 0xFF) << 16) + ((this.aByteArray52[this.anInt5186 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)V")
	public final void method4469(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "(I)I")
	public final int method4470() {
		this.anInt5186 += 3;
		@Pc(44) int local44 = (this.aByteArray52[this.anInt5186 - 1] & 0xFF) + ((this.aByteArray52[this.anInt5186 - 3] & 0xFF) << 16) + ((this.aByteArray52[this.anInt5186 - 2] & 0xFF) << 8);
		if (local44 > 8388607) {
			local44 -= 16777216;
		}
		return local44;
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method4471() {
		@Pc(14) byte local14 = this.aByteArray52[this.anInt5186++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(28) int local28 = this.method4463();
		if (this.aByteArray52.length < this.anInt5186 + local28) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static229.method2774(this.aByteArray52, this.anInt5186, local28);
		this.anInt5186 += local28;
		return local55;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(BI)V")
	public final void method4472(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(II)V")
	public final void method4473(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(II)V")
	public final void method4475(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "(I)B")
	public final byte method4477() {
		return this.aByteArray52[this.anInt5186++];
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "(I)I")
	public final int method4478() {
		this.anInt5186 += 2;
		@Pc(37) int local37 = (this.aByteArray52[this.anInt5186 - 1] & 0xFF) + ((this.aByteArray52[this.anInt5186 - 2] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method4479() {
		if (this.aByteArray52[this.anInt5186] == 0) {
			this.anInt5186++;
			return null;
		} else {
			return this.method4494();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method4480(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(11) int local11 = this.anInt5186;
		this.anInt5186 = 0;
		@Pc(17) byte[] local17 = new byte[local11];
		this.method4504(local11, local17);
		@Pc(28) BigInteger local28 = new BigInteger(local17);
		@Pc(33) BigInteger local33 = local28.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt5186 = 0;
		this.method4511(local36.length);
		this.method4498(local36, local36.length);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method4481(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.indexOf(0);
		if (local13 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local13 + " - cannot pjstr");
		}
		this.anInt5186 += Static507.method6603(this.aByteArray52, this.anInt5186, arg0, arg0.length());
		this.aByteArray52[this.anInt5186++] = 0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)Z")
	public final boolean method4482() {
		this.anInt5186 -= 4;
		@Pc(17) int local17 = Static269.method3735(this.anInt5186, this.aByteArray52, 0);
		@Pc(21) int local21 = this.method4509();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "(I)I")
	public final int method4483() {
		this.anInt5186 += 3;
		return (this.aByteArray52[this.anInt5186 - 2] & 0xFF) + (((this.aByteArray52[this.anInt5186 - 3] & 0xFF) << 16) + ((this.aByteArray52[this.anInt5186 - 1] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(II)V")
	public final void method4484(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z[III)V")
	public final void method4485(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt5186;
		this.anInt5186 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) int local31 = this.method4509();
			@Pc(35) int local35 = this.method4509();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= (local31 >>> 5 ^ local31 << 4) + local31 ^ arg0[local37 >>> 11 & 0x53200003] + local37;
				local37 -= -1640531527;
				local31 -= arg0[local37 & 0x3] + local37 ^ local35 + (local35 >>> 5 ^ local35 << 4);
			}
			this.anInt5186 -= 8;
			this.method4495(local31);
			this.method4495(local35);
		}
		this.anInt5186 = local8;
	}

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "(I)I")
	public final int method4486() {
		this.anInt5186 += 2;
		@Pc(36) int local36 = (this.aByteArray52[this.anInt5186 - 2] & 0xFF) + ((this.aByteArray52[this.anInt5186 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "(I)Ljava/lang/String;")
	public final String method4487() {
		@Pc(19) byte local19 = this.aByteArray52[this.anInt5186++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(29) int local29 = this.anInt5186;
		while (this.aByteArray52[this.anInt5186++] != 0) {
		}
		@Pc(52) int local52 = this.anInt5186 - local29 - 1;
		return local52 == 0 ? "" : Static72.method1195(local29, this.aByteArray52, local52);
	}

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "(I)I")
	public final int method4488() {
		return -this.aByteArray52[this.anInt5186++] & 0xFF;
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(II)V")
	public final void method4489(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "(I)I")
	public final int method4490() {
		this.anInt5186 += 4;
		return ((this.aByteArray52[this.anInt5186 - 3] & 0xFF) << 8) + ((this.aByteArray52[this.anInt5186 - 1] & 0xFF) << 24) + ((this.aByteArray52[this.anInt5186 + -2] & 0xFF) << 16) + (this.aByteArray52[this.anInt5186 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(IZ)V")
	public final void method4491(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(IB)V")
	public final void method4492(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IJ)V")
	public final void method4493(@OriginalArg(1) long arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 56);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 48);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 40);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 32);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Ljava/lang/String;")
	public final String method4494() {
		@Pc(6) int local6 = this.anInt5186;
		while (this.aByteArray52[this.anInt5186++] != 0) {
		}
		@Pc(26) int local26 = this.anInt5186 - local6 - 1;
		return local26 == 0 ? "" : Static72.method1195(local6, this.aByteArray52, local26);
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(II)V")
	public final void method4495(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "(I)I")
	public final int method4496() {
		this.anInt5186 += 4;
		return (this.aByteArray52[this.anInt5186 - 2] & 0xFF) + ((this.aByteArray52[this.anInt5186 - 3] & 0xFF) << 24) + ((this.aByteArray52[this.anInt5186 + -4] & 0xFF) << 16) + ((this.aByteArray52[this.anInt5186 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IJZ)V")
	public final void method4497(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(13) int local13 = arg0 - 1;
		if (local13 < 0 || local13 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(29) int local29 = local13 * 8; local29 >= 0; local29 -= 8) {
			this.aByteArray52[this.anInt5186++] = (byte) (arg1 >> local29);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[BII)V")
	public final void method4498(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray52[this.anInt5186++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "(I)V")
	public final void method4499() {
		if (this.aByteArray52 != null) {
			Static433.method5696(this.aByteArray52);
		}
		this.aByteArray52 = null;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)V")
	public final void method4500(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4459(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4511(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "(I)I")
	public final int method4501() {
		this.anInt5186 += 4;
		return (this.aByteArray52[this.anInt5186 - 4] & 0xFF) + ((this.aByteArray52[this.anInt5186 - 1] & 0xFF) << 24) + ((this.aByteArray52[this.anInt5186 + -2] & 0xFF) << 16) + ((this.aByteArray52[this.anInt5186 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "(II)V")
	public final void method4502(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)I")
	public final int method4503() {
		this.anInt5186 += 3;
		return (this.aByteArray52[this.anInt5186 - 1] & 0xFF) + ((this.aByteArray52[this.anInt5186 - 2] & 0xFF) << 8) + ((this.aByteArray52[this.anInt5186 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[BI)V")
	public final void method4504(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			arg1[local13] = this.aByteArray52[this.anInt5186++];
		}
	}

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "(I)B")
	public final byte method4505() {
		return (byte) (128 - this.aByteArray52[this.anInt5186++]);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method4506(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static392.method5403(arg0);
		this.aByteArray52[this.anInt5186++] = 0;
		this.method4508(local7);
		this.anInt5186 += Static110.method1606(arg0, this.aByteArray52, this.anInt5186);
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)I")
	public final int method4507() {
		@Pc(19) int local19 = this.aByteArray52[this.anInt5186] & 0xFF;
		return local19 >= 128 ? this.method4518() - 49152 : this.method4464() - 64;
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "(II)V")
	public final void method4508(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4459(arg0 >>> 28 | 0x80);
					}
					this.method4459(arg0 >>> 21 | 0x80);
				}
				this.method4459(arg0 >>> 14 | 0x80);
			}
			this.method4459(arg0 >>> 7 | 0x80);
		}
		this.method4459(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)I")
	public final int method4509() {
		this.anInt5186 += 4;
		return ((this.aByteArray52[this.anInt5186 - 2] & 0xFF) << 8) + ((this.aByteArray52[this.anInt5186 - 4] & 0xFF) << 24) + ((this.aByteArray52[this.anInt5186 - 3] & 0xFF) << 16) + (this.aByteArray52[this.anInt5186 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method4510(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray52[this.anInt5186++] = 0;
		this.anInt5186 += Static507.method6603(this.aByteArray52, this.anInt5186, arg0, arg0.length());
		this.aByteArray52[this.anInt5186++] = 0;
	}

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "(II)V")
	public final void method4511(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "(II)V")
	public final void method4512(@OriginalArg(1) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 + 128);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(IB)V")
	public final void method4513(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "(I)J")
	public final long method4514() {
		@Pc(15) long local15 = (long) this.method4509() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method4509() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)I")
	public final int method4515() {
		return 128 - this.aByteArray52[this.anInt5186++] & 0xFF;
	}

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "(II)I")
	public final int method4516(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static269.method3735(this.anInt5186, this.aByteArray52, arg0);
		this.method4495(local11);
		return local11;
	}

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "(I)I")
	public final int method4517() {
		this.anInt5186 += 2;
		return (this.aByteArray52[this.anInt5186 - 2] & 0xFF) + ((this.aByteArray52[this.anInt5186 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "(I)I")
	public final int method4518() {
		this.anInt5186 += 2;
		return ((this.aByteArray52[this.anInt5186 - 2] & 0xFF) << 8) + (this.aByteArray52[this.anInt5186 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "(I)I")
	public final int method4519() {
		@Pc(16) int local16 = Static269.method3735(this.anInt5186, this.aByteArray52, 0);
		this.method4495(local16);
		return local16;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(IB)V")
	public final void method4520(@OriginalArg(0) int arg0) {
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 16);
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 24);
		this.aByteArray52[this.anInt5186++] = (byte) arg0;
		this.aByteArray52[this.anInt5186++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "(I)I")
	public final int method4521() {
		this.anInt5186 += 2;
		return (this.aByteArray52[this.anInt5186 - 2] - 128 & 0xFF) + ((this.aByteArray52[this.anInt5186 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "(I)B")
	public final byte method4522() {
		return (byte) -this.aByteArray52[this.anInt5186++];
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)I")
	public final int method4523() {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = this.method4458();
		while (local17 == 32767) {
			local17 = this.method4458();
			local13 += 32767;
		}
		return local13 + local17;
	}
}
