import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public class Class7_Sub14 extends Class7 {

	@OriginalMember(owner = "client!gk", name = "xb", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
	public int anInt4989;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V")
	public Class7_Sub14(@OriginalArg(0) int arg0) {
		this.aByteArray75 = Static406.method5094(arg0);
		this.anInt4989 = 0;
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([B)V")
	public Class7_Sub14(@OriginalArg(0) byte[] arg0) {
		this.anInt4989 = 0;
		this.aByteArray75 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method3929(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = Static300.method4009(arg0);
		this.aByteArray75[this.anInt4989++] = 0;
		this.method3951(local11);
		this.anInt4989 += Static284.method706(this.aByteArray75, arg0, this.anInt4989);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)B")
	public final byte method3930() {
		return this.aByteArray75[this.anInt4989++];
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)I")
	public final int method3931() {
		return this.aByteArray75[this.anInt4989++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[BI)V")
	public final void method3932(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = this.aByteArray75[this.anInt4989++];
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
	public final void method3933(@OriginalArg(0) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 24);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 16);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)V")
	public final void method3934(@OriginalArg(0) long arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 56);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 48);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 40);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 32);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 24);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 16);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I")
	public final int method3935() {
		this.anInt4989 += 2;
		return ((this.aByteArray75[this.anInt4989 - 1] & 0xFF) << 8) + (this.aByteArray75[this.anInt4989 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method3936(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt4989;
		this.anInt4989 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method3932(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt4989 = 0;
		this.method3993(local31.length);
		this.method3952(local31.length, local31);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)I")
	public final int method3937() {
		this.anInt4989 += 4;
		return (this.aByteArray75[this.anInt4989 - 3] & 0xFF) + ((this.aByteArray75[this.anInt4989 - 2] & 0xFF) << 24) + ((this.aByteArray75[this.anInt4989 + -1] & 0xFF) << 16) + ((this.aByteArray75[this.anInt4989 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)I")
	public final int method3938() {
		this.anInt4989 += 4;
		return (this.aByteArray75[this.anInt4989 - 1] & 0xFF) + ((this.aByteArray75[this.anInt4989 - 2] & 0xFF) << 8) + ((this.aByteArray75[this.anInt4989 + -3] & 0xFF) << 16) + ((this.aByteArray75[this.anInt4989 + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)I")
	public final int method3939() {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = this.method3940();
		while (local17 == 32767) {
			local17 = this.method3940();
			local13 += 32767;
		}
		return local13 + local17;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)I")
	public final int method3940() {
		@Pc(11) int local11 = this.aByteArray75[this.anInt4989] & 0xFF;
		return local11 >= 128 ? this.method3943() - 32768 : this.method3981();
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)J")
	public final long method3941() {
		@Pc(17) long local17 = (long) this.method3938() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method3938() & 0xFFFFFFFFL;
		return (local17 << 32) + local24;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V")
	public final void method3942(@OriginalArg(1) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)I")
	public final int method3943() {
		this.anInt4989 += 2;
		return ((this.aByteArray75[this.anInt4989 - 2] & 0xFF) << 8) + (this.aByteArray75[this.anInt4989 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI)J")
	public final long method3944(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(26) int local26 = local2 * 8;
		@Pc(28) long local28 = 0L;
		while (local26 >= 0) {
			local28 |= ((long) this.aByteArray75[this.anInt4989++] & 0xFFL) << local26;
			local26 -= 8;
		}
		return local28;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)B")
	public final byte method3945() {
		return (byte) (this.aByteArray75[this.anInt4989++] - 128);
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)I")
	public final int method3946() {
		this.anInt4989 += 2;
		return ((this.aByteArray75[this.anInt4989 - 2] & 0xFF) << 8) + (this.aByteArray75[this.anInt4989 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method3947(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.indexOf(0);
		if (local11 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local11 + " - cannot pjstr");
		}
		this.anInt4989 += Static240.method3260(this.anInt4989, arg0, this.aByteArray75, arg0.length());
		this.aByteArray75[this.anInt4989++] = 0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V")
	public final void method3948(@OriginalArg(0) int arg0) {
		this.aByteArray75[this.anInt4989 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray75[this.anInt4989 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray75[this.anInt4989 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray75[this.anInt4989 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)B")
	public final byte method3949() {
		return (byte) (128 - this.aByteArray75[this.anInt4989++]);
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(I)I")
	public final int method3950() {
		this.anInt4989 += 4;
		return (this.aByteArray75[this.anInt4989 - 4] & 0xFF) + ((this.aByteArray75[this.anInt4989 - 3] & 0xFF) << 8) + ((this.aByteArray75[this.anInt4989 + -1] & 0xFF) << 24) + ((this.aByteArray75[this.anInt4989 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)V")
	public final void method3951(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3970(arg0 >>> 28 | 0x80);
					}
					this.method3970(arg0 >>> 21 | 0x80);
				}
				this.method3970(arg0 >>> 14 | 0x80);
			}
			this.method3970(arg0 >>> 7 | 0x80);
		}
		this.method3970(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III[B)V")
	public final void method3952(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray75[this.anInt4989++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(IZ)V")
	public final void method3953(@OriginalArg(0) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 16);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 24);
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "(B)I")
	public final int method3954() {
		this.anInt4989 += 2;
		@Pc(38) int local38 = (this.aByteArray75[this.anInt4989 - 2] & 0xFF) + ((this.aByteArray75[this.anInt4989 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)V")
	public final void method3955(@OriginalArg(0) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(B)I")
	public final int method3956() {
		this.anInt4989 += 4;
		return (this.aByteArray75[this.anInt4989 - 2] & 0xFF) + (((this.aByteArray75[this.anInt4989 - 1] & 0xFF) << 8) + ((this.aByteArray75[this.anInt4989 - 3] & 0xFF) << 24) + ((this.aByteArray75[this.anInt4989 + -4] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)Ljava/lang/String;")
	public final String method3957() {
		if (this.aByteArray75[this.anInt4989] == 0) {
			this.anInt4989++;
			return null;
		} else {
			return this.method3986();
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(BI)V")
	public final void method3958(@OriginalArg(1) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 + 128);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)I")
	public final int method3959(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = Static143.method2215(this.anInt4989, this.aByteArray75, arg0);
		this.method3933(local11);
		return local11;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(IZ)V")
	public final void method3960(@OriginalArg(0) int arg0) {
		this.aByteArray75[this.anInt4989 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "(I)I")
	public final int method3961() {
		this.anInt4989 += 2;
		@Pc(32) int local32 = ((this.aByteArray75[this.anInt4989 - 2] & 0xFF) << 8) + (this.aByteArray75[this.anInt4989 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(Z)I")
	public final int method3963() {
		@Pc(14) byte local14 = this.aByteArray75[this.anInt4989++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local14 & 0x7F | local16) << 7;
			local14 = this.aByteArray75[this.anInt4989++];
		}
		return local14 | local16;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(IB)V")
	public final void method3964(@OriginalArg(0) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 24);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "(B)I")
	public final int method3965() {
		this.anInt4989 += 3;
		return (this.aByteArray75[this.anInt4989 - 2] & 0xFF) + ((this.aByteArray75[this.anInt4989 - 1] & 0xFF) << 8) + ((this.aByteArray75[this.anInt4989 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(IZ)V")
	public final void method3966(@OriginalArg(0) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 16);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(IB)V")
	public final void method3967(@OriginalArg(0) int arg0) {
		this.aByteArray75[this.anInt4989 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray75[this.anInt4989 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "(B)I")
	public final int method3968() {
		return -this.aByteArray75[this.anInt4989++] & 0xFF;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(II)V")
	public final void method3969(@OriginalArg(1) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(II)V")
	public final void method3970(@OriginalArg(0) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(II)V")
	public final void method3971(@OriginalArg(1) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 16);
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "(B)I")
	public final int method3972() {
		return 128 - this.aByteArray75[this.anInt4989++] & 0xFF;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(BI)V")
	public final void method3973(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3970(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3993(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "(B)I")
	public final int method3974() {
		@Pc(16) int local16 = this.aByteArray75[this.anInt4989] & 0xFF;
		return local16 < 128 ? this.method3981() - 64 : this.method3943() + -49152;
	}

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "(I)I")
	public final int method3975() {
		this.anInt4989 += 3;
		return ((this.aByteArray75[this.anInt4989 - 2] & 0xFF) << 8) + ((this.aByteArray75[this.anInt4989 - 3] & 0xFF) << 16) + (this.aByteArray75[this.anInt4989 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(ZI)V")
	public final void method3976(@OriginalArg(1) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([BIBI)V")
	public final void method3977(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = (byte) (this.aByteArray75[this.anInt4989++] - 128);
		}
	}

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "(I)Z")
	public final boolean method3978() {
		this.anInt4989 -= 4;
		@Pc(17) int local17 = Static143.method2215(this.anInt4989, this.aByteArray75, 0);
		@Pc(26) int local26 = this.method3938();
		return local17 == local26;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IJZ)V")
	public final void method3979(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(4) int local4 = arg0 - 1;
		if (local4 < 0 || local4 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(19) int local19 = local4 * 8; local19 >= 0; local19 -= 8) {
			this.aByteArray75[this.anInt4989++] = (byte) (arg1 >> local19);
		}
	}

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "(B)B")
	public final byte method3980() {
		return (byte) -this.aByteArray75[this.anInt4989++];
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "(I)I")
	public final int method3981() {
		return this.aByteArray75[this.anInt4989++] & 0xFF;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B[I)V")
	public final void method3982(@OriginalArg(1) int[] arg0) {
		@Pc(10) int local10 = this.anInt4989 / 8;
		this.anInt4989 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(21) int local21 = this.method3938();
			@Pc(25) int local25 = this.method3938();
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = 32;
			while (local31-- > 0) {
				local21 += local25 + (local25 >>> 5 ^ local25 << 4) ^ arg0[local27 & 0x3] + local27;
				local27 += -1640531527;
				local25 += local27 + arg0[local27 >>> 11 & 0x3C000003] ^ local21 + (local21 << 4 ^ local21 >>> 5);
			}
			this.anInt4989 -= 8;
			this.method3933(local21);
			this.method3933(local25);
		}
	}

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "(B)I")
	public final int method3983() {
		this.anInt4989 += 2;
		@Pc(38) int local38 = (this.aByteArray75[this.anInt4989 - 1] - 128 & 0xFF) + ((this.aByteArray75[this.anInt4989 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B[III)V")
	public final void method3984(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt4989;
		this.anInt4989 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method3938();
			@Pc(30) int local30 = this.method3938();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local32 + arg0[local32 >>> 11 & 0x3] ^ (local26 << 4 ^ local26 >>> 5) - -local26;
				local32 -= -1640531527;
				local26 -= (local30 << 4 ^ local30 >>> 5) + local30 ^ arg0[local32 & 0x3] + local32;
			}
			this.anInt4989 -= 8;
			this.method3933(local26);
			this.method3933(local30);
		}
		this.anInt4989 = local8;
	}

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method3986() {
		@Pc(6) int local6 = this.anInt4989;
		while (this.aByteArray75[this.anInt4989++] != 0) {
		}
		@Pc(31) int local31 = this.anInt4989 - local6 - 1;
		return local31 == 0 ? "" : Static184.method2672(this.aByteArray75, local6, local31);
	}

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "(B)Ljava/lang/String;")
	public final String method3987() {
		@Pc(19) byte local19 = this.aByteArray75[this.anInt4989++];
		if (local19 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(32) int local32 = this.anInt4989;
		while (this.aByteArray75[this.anInt4989++] != 0) {
		}
		@Pc(55) int local55 = this.anInt4989 - local32 - 1;
		return local55 == 0 ? "" : Static184.method2672(this.aByteArray75, local32, local55);
	}

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "(B)I")
	public final int method3988() {
		@Pc(18) int local18 = Static143.method2215(this.anInt4989, this.aByteArray75, 0);
		this.method3933(local18);
		return local18;
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(BI)V")
	public final void method3989(@OriginalArg(1) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "(I)I")
	public final int method3990() {
		this.anInt4989 += 2;
		return ((this.aByteArray75[this.anInt4989 - 1] & 0xFF) << 8) + (this.aByteArray75[this.anInt4989 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(BI)V")
	public final void method3991(@OriginalArg(1) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "(B)Ljava/lang/String;")
	public final String method3992() {
		@Pc(14) byte local14 = this.aByteArray75[this.anInt4989++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(28) int local28 = this.method3963();
		if (this.anInt4989 + local28 > this.aByteArray75.length) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(58) String local58 = Static454.method5771(this.anInt4989, local28, this.aByteArray75);
		this.anInt4989 += local28;
		return local58;
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(BI)V")
	public final void method3993(@OriginalArg(1) int arg0) {
		this.aByteArray75[this.anInt4989++] = (byte) (arg0 >> 8);
		this.aByteArray75[this.anInt4989++] = (byte) arg0;
	}
}
