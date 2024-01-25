import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!ge", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!ge", name = "Z", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!ge", name = "nb", descriptor = "I")
	public int anInt4555;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6(@OriginalArg(0) int arg0) {
		this.aByteArray66 = Static435.method6295(arg0);
		this.anInt4555 = 0;
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V")
	public Class1_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray66 = arg0;
		this.anInt4555 = 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)B")
	public final byte method3910() {
		return (byte) (this.aByteArray66[this.anInt4555++] - 128);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)B")
	public final byte method3911() {
		return (byte) (128 - this.aByteArray66[this.anInt4555++]);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
	public final int method3912() {
		return 128 - this.aByteArray66[this.anInt4555++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I")
	public final int method3913() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method3936(); local11 == 32767; local11 = this.method3936()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)I")
	public final int method3914() {
		this.anInt4555 += 2;
		return ((this.aByteArray66[this.anInt4555 - 2] & 0xFF) << 8) + (this.aByteArray66[this.anInt4555 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)Ljava/lang/String;")
	public final String method3915() {
		@Pc(14) byte local14 = this.aByteArray66[this.anInt4555++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(25) int local25 = this.method3958();
		if (this.aByteArray66.length < this.anInt4555 + local25) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static57.method1093(this.anInt4555, local25, this.aByteArray66);
		this.anInt4555 += local25;
		return local55;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
	public final int method3916() {
		this.anInt4555 += 2;
		return (this.aByteArray66[this.anInt4555 - 2] & 0xFF) + ((this.aByteArray66[this.anInt4555 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public final void method3917(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4555 += Static323.method5016(arg0, arg0.length(), this.anInt4555, this.aByteArray66);
		this.aByteArray66[this.anInt4555++] = 0;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)I")
	public final int method3918() {
		return this.aByteArray66[this.anInt4555++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public final void method3919(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)I")
	public final int method3920() {
		this.anInt4555 += 3;
		return (this.aByteArray66[this.anInt4555 - 1] & 0xFF) + ((this.aByteArray66[this.anInt4555 - 3] & 0xFF) << 16) + ((this.aByteArray66[this.anInt4555 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V")
	public final void method3921(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)I")
	public final int method3922() {
		return this.aByteArray66[this.anInt4555++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
	public final void method3923(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4555 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4555 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
	public final void method3924(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)I")
	public final int method3925() {
		this.anInt4555 += 4;
		return (this.aByteArray66[this.anInt4555 - 1] & 0xFF) + ((this.aByteArray66[this.anInt4555 - 2] & 0xFF) << 8) + ((this.aByteArray66[this.anInt4555 - 4] & 0xFF) << 24) + ((this.aByteArray66[this.anInt4555 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZJ)V")
	public final void method3926(@OriginalArg(1) long arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 56);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 48);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 40);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 32);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)I")
	public final int method3927(@OriginalArg(1) int arg0) {
		@Pc(20) int local20 = Static204.method3512(this.anInt4555, this.aByteArray66, arg0);
		this.method3948(local20);
		return local20;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)B")
	public final byte method3928() {
		return this.aByteArray66[this.anInt4555++];
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)I")
	public final int method3929() {
		this.anInt4555 += 4;
		return (this.aByteArray66[this.anInt4555 - 3] & 0xFF) + ((this.aByteArray66[this.anInt4555 - 4] & 0xFF) << 8) + ((this.aByteArray66[this.anInt4555 + -2] & 0xFF) << 24) + ((this.aByteArray66[this.anInt4555 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method3930(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = Static544.method7542(arg0);
		this.aByteArray66[this.anInt4555++] = 0;
		this.method3960(local11);
		this.anInt4555 += Static48.method942(this.aByteArray66, this.anInt4555, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)V")
	public final void method3931(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method3932() {
		@Pc(14) byte local14 = this.aByteArray66[this.anInt4555++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(31) int local31 = this.anInt4555;
		while (this.aByteArray66[this.anInt4555++] != 0) {
		}
		@Pc(50) int local50 = this.anInt4555 - local31 - 1;
		return local50 == 0 ? "" : Static524.method7187(local50, this.aByteArray66, local31);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public final void method3933(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt4555;
		this.anInt4555 = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method3963(local19, local13);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt4555 = 0;
		this.method3919(local38.length);
		this.method3940(local38, local38.length);
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(I)I")
	public final int method3934() {
		this.anInt4555 += 4;
		return ((this.aByteArray66[this.anInt4555 - 2] & 0xFF) << 16) + (this.aByteArray66[this.anInt4555 - 1] << 24 & 0xFF000000) + ((this.aByteArray66[this.anInt4555 + -3] & 0xFF) << 8) + (this.aByteArray66[this.anInt4555 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method3935() {
		if (this.aByteArray66[this.anInt4555] == 0) {
			this.anInt4555++;
			return null;
		} else {
			return this.method3954();
		}
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "(I)I")
	public final int method3936() {
		@Pc(11) int local11 = this.aByteArray66[this.anInt4555] & 0xFF;
		return local11 < 128 ? this.method3922() : this.method3967() - 32768;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(II)V")
	public final void method3937(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(II)V")
	public final void method3938(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)I")
	public final int method3939() {
		this.anInt4555 += 2;
		@Pc(39) int local39 = ((this.aByteArray66[this.anInt4555 - 1] & 0xFF) << 8) + (this.aByteArray66[this.anInt4555 - 2] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BIII)V")
	public final void method3940(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			this.aByteArray66[this.anInt4555++] = arg0[local3];
		}
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(B)I")
	public final int method3941() {
		return -this.aByteArray66[this.anInt4555++] & 0xFF;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(II)V")
	public final void method3942(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)I")
	public final int method3943() {
		this.anInt4555 += 2;
		return (this.aByteArray66[this.anInt4555 - 2] - 128 & 0xFF) + ((this.aByteArray66[this.anInt4555 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "(I)B")
	public final byte method3944() {
		return (byte) -this.aByteArray66[this.anInt4555++];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIJ)V")
	public final void method3945(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local6 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray66[this.anInt4555++] = (byte) (arg1 >> local26);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)I")
	public final int method3946() {
		@Pc(18) int local18 = this.aByteArray66[this.anInt4555] & 0xFF;
		return local18 >= 128 ? this.method3967() - 49152 : this.method3922() + -64;
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "(I)Z")
	public final boolean method3947() {
		this.anInt4555 -= 4;
		@Pc(17) int local17 = Static204.method3512(this.anInt4555, this.aByteArray66, 0);
		@Pc(23) int local23 = this.method3925();
		return local17 == local23;
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(II)V")
	public final void method3948(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "(I)J")
	public final long method3949() {
		@Pc(12) long local12 = (long) this.method3925() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method3925() & 0xFFFFFFFFL;
		return local26 + (local12 << 32);
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(II)V")
	public final void method3950(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)J")
	public final long method3951(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(19) int local19 = local6 * 8;
		@Pc(21) long local21 = 0L;
		while (local19 >= 0) {
			local21 |= ((long) this.aByteArray66[this.anInt4555++] & 0xFFL) << local19;
			local19 -= 8;
		}
		return local21;
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(II)V")
	public final void method3952(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIII)V")
	public final void method3953(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt4555;
		this.anInt4555 = 5;
		@Pc(16) int local16 = (arg1 - 5) / 8;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(25) int local25 = this.method3925();
			@Pc(31) int local31 = this.method3925();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local31 -= arg0[local33 >>> 11 & 0x68E00003] + local33 ^ (local25 >>> 5 ^ local25 << 4) - -local25;
				local33 -= -1640531527;
				local25 -= (local31 >>> 5 ^ local31 << 4) + local31 ^ arg0[local33 & 0x3] + local33;
			}
			this.anInt4555 -= 8;
			this.method3948(local25);
			this.method3948(local31);
		}
		this.anInt4555 = local6;
	}

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "(I)Ljava/lang/String;")
	public final String method3954() {
		@Pc(6) int local6 = this.anInt4555;
		while (this.aByteArray66[this.anInt4555++] != 0) {
		}
		@Pc(28) int local28 = this.anInt4555 - local6 - 1;
		return local28 == 0 ? "" : Static524.method7187(local28, this.aByteArray66, local6);
	}

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "(I)I")
	public final int method3955() {
		this.anInt4555 += 4;
		return ((this.aByteArray66[this.anInt4555 - 4] & 0xFF) << 16) + ((this.aByteArray66[this.anInt4555 - 3] & 0xFF) << 24) + ((this.aByteArray66[this.anInt4555 + -1] & 0xFF) << 8) + (this.aByteArray66[this.anInt4555 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "(II)V")
	public final void method3956(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3937(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3919(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "(II)V")
	public final void method3957(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "(B)I")
	public final int method3958() {
		@Pc(16) byte local16 = this.aByteArray66[this.anInt4555++];
		@Pc(26) int local26 = 0;
		while (local16 < 0) {
			local26 = (local16 & 0x7F | local26) << 7;
			local16 = this.aByteArray66[this.anInt4555++];
		}
		return local26 | local16;
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "(II)V")
	public final void method3959(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 + 128);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)V")
	public final void method3960(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3937(arg0 >>> 28 | 0x80);
					}
					this.method3937(arg0 >>> 21 | 0x80);
				}
				this.method3937(arg0 >>> 14 | 0x80);
			}
			this.method3937(arg0 >>> 7 | 0x80);
		}
		this.method3937(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)V")
	public final void method3961(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4555 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "(I)I")
	public final int method3962() {
		@Pc(11) int local11 = Static204.method3512(this.anInt4555, this.aByteArray66, 0);
		this.method3948(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[BZI)V")
	public final void method3963(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			arg0[local10] = this.aByteArray66[this.anInt4555++];
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)I")
	public final int method3964() {
		this.anInt4555 += 2;
		@Pc(38) int local38 = ((this.aByteArray66[this.anInt4555 - 2] & 0xFF) << 8) + (this.aByteArray66[this.anInt4555 - 1] & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "(I)I")
	public final int method3965() {
		this.anInt4555 += 3;
		return (this.aByteArray66[this.anInt4555 - 3] & 0xFF) + ((this.aByteArray66[this.anInt4555 - 2] & 0xFF) << 8) + ((this.aByteArray66[this.anInt4555 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "(II)V")
	public final void method3966(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "(I)I")
	public final int method3967() {
		this.anInt4555 += 2;
		return ((this.aByteArray66[this.anInt4555 - 2] & 0xFF) << 8) + (this.aByteArray66[this.anInt4555 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "(B)I")
	public final int method3968() {
		this.anInt4555 += 3;
		@Pc(51) int local51 = ((this.aByteArray66[this.anInt4555 - 2] & 0xFF) << 8) + (((this.aByteArray66[this.anInt4555 - 3] & 0xFF) << 16) + (this.aByteArray66[this.anInt4555 - 1] & 0xFF));
		if (local51 > 8388607) {
			local51 -= 16777216;
		}
		return local51;
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "(II)V")
	public final void method3969(@OriginalArg(0) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 24);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "(II)V")
	public final void method3970(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 16);
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V")
	public final void method3971(@OriginalArg(1) int arg0) {
		this.aByteArray66[this.anInt4555++] = (byte) arg0;
		this.aByteArray66[this.anInt4555++] = (byte) (arg0 >> 8);
	}
}
