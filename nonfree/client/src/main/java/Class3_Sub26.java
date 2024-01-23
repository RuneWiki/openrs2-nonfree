import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
	public int anInt4615 = 0;

	@OriginalMember(owner = "client!ug", name = "Ab", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
	public Class3_Sub26(@OriginalArg(0) int arg0) {
		this.aByteArray64 = Static248.method4171(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([B)V")
	public Class3_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray64 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)V")
	public final void method3886(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)B")
	public final byte method3887() {
		return (byte) (this.aByteArray64[this.anInt4615++] - 128);
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)Z")
	public final boolean method3888() {
		this.anInt4615 -= 4;
		@Pc(24) int local24 = Static244.method4142(this.aByteArray64, this.anInt4615, 0);
		@Pc(28) int local28 = this.method3896();
		return local24 == local28;
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)Ljava/lang/String;")
	public final String method3889() {
		if (this.aByteArray64[this.anInt4615] == 0) {
			this.anInt4615++;
			return null;
		} else {
			return this.method3931();
		}
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)I")
	public final int method3890() {
		this.anInt4615 += 4;
		return (this.aByteArray64[this.anInt4615 - 2] & 0xFF) + ((this.aByteArray64[this.anInt4615 - 1] & 0xFF) << 8) + ((this.aByteArray64[this.anInt4615 + -3] & 0xFF) << 24) + ((this.aByteArray64[this.anInt4615 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I")
	public final int method3891() {
		this.anInt4615 += 4;
		return (this.aByteArray64[this.anInt4615 - 4] & 0xFF) + ((this.aByteArray64[this.anInt4615 - 3] & 0xFF) << 8) + ((this.aByteArray64[this.anInt4615 + -1] & 0xFF) << 24) + ((this.aByteArray64[this.anInt4615 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)V")
	public final void method3892(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)V")
	public final void method3894(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)I")
	public final int method3895() {
		this.anInt4615 += 2;
		return ((this.aByteArray64[this.anInt4615 - 1] & 0xFF) << 8) + (this.aByteArray64[this.anInt4615 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)I")
	public final int method3896() {
		this.anInt4615 += 4;
		return ((this.aByteArray64[this.anInt4615 - 2] & 0xFF) << 8) + (this.aByteArray64[this.anInt4615 - 4] << 24 & 0xFF000000) + ((this.aByteArray64[this.anInt4615 + -3] & 0xFF) << 16) + (this.aByteArray64[this.anInt4615 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IZ)V")
	public final void method3897(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(I)I")
	public final int method3898() {
		this.anInt4615 += 2;
		@Pc(33) int local33 = (this.aByteArray64[this.anInt4615 - 1] - 128 & 0xFF) + ((this.aByteArray64[this.anInt4615 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)I")
	public final int method3899() {
		this.anInt4615 += 3;
		return ((this.aByteArray64[this.anInt4615 - 3] & 0xFF) << 16) - (-((this.aByteArray64[this.anInt4615 - 2] & 0xFF) << 8) - (this.aByteArray64[this.anInt4615 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)J")
	public final long method3900() {
		@Pc(10) long local10 = (long) this.method3896() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method3896() & 0xFFFFFFFFL;
		return (local10 << 32) + local24;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[IIB)V")
	public final void method3901(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = this.anInt4615;
		this.anInt4615 = 5;
		@Pc(22) int local22 = (arg0 - 5) / 8;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			@Pc(35) int local35 = this.method3896();
			@Pc(39) int local39 = this.method3896();
			@Pc(41) int local41 = -957401312;
			@Pc(45) int local45 = 32;
			while (local45-- > 0) {
				local39 -= local41 + arg1[local41 >>> 11 & 0xEC600003] ^ (local35 << 4 ^ local35 >>> 5) - -local35;
				local41 -= -1640531527;
				local35 -= arg1[local41 & 0x3] + local41 ^ (local39 >>> 5 ^ local39 << 4) - -local39;
			}
			this.anInt4615 -= 8;
			this.method3944(local35);
			this.method3944(local39);
		}
		this.anInt4615 = local8;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method3902(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt4615;
		this.anInt4615 = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method3935(local13, local19);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt4615 = 0;
		this.method3907(local38.length);
		this.method3945(local38.length, local38);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method3903() {
		@Pc(14) byte local14 = this.aByteArray64[this.anInt4615++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(34) int local34 = this.anInt4615;
		while (this.aByteArray64[this.anInt4615++] != 0) {
		}
		return Static222.method3633(this.aByteArray64, this.anInt4615 - local34 - 1, local34);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)I")
	public final int method3904() {
		@Pc(15) int local15 = this.aByteArray64[this.anInt4615] & 0xFF;
		return local15 < 128 ? this.method3915() : this.method3948() - 32768;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V")
	public final void method3906(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt4615 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt4615 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt4615 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt4615 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(II)V")
	public final void method3907(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)I")
	public final int method3908() {
		this.anInt4615 += 2;
		return ((this.aByteArray64[this.anInt4615 - 2] & 0xFF) << 8) + (this.aByteArray64[this.anInt4615 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "(I)I")
	public final int method3909() {
		this.anInt4615 += 2;
		return (this.aByteArray64[this.anInt4615 - 2] - 128 & 0xFF) + ((this.aByteArray64[this.anInt4615 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(II)V")
	public final void method3910(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(IB)V")
	public final void method3911(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method3907(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method3938(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(II)V")
	public final void method3912(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
	public final void method3913(@OriginalArg(1) long arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 56);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 48);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 40);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 32);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method3914(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt4615 += Static28.method432(arg0.length(), arg0, this.anInt4615, this.aByteArray64);
		this.aByteArray64[this.anInt4615++] = 0;
	}

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "(I)I")
	public final int method3915() {
		return this.aByteArray64[this.anInt4615++] & 0xFF;
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)I")
	public final int method3916() {
		this.anInt4615 += 3;
		return ((this.aByteArray64[this.anInt4615 - 3] & 0xFF) << 16) - (-(this.aByteArray64[this.anInt4615 - 1] << 8 & 0xFF00) - (this.aByteArray64[this.anInt4615 - 2] & 0xFF));
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(II)I")
	public final int method3917(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = Static244.method4142(this.aByteArray64, this.anInt4615, arg0);
		this.method3944(local17);
		return local17;
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)I")
	public final int method3918() {
		@Pc(11) int local11 = 0;
		@Pc(22) byte local22;
		for (local22 = this.aByteArray64[this.anInt4615++]; local22 < 0; local22 = this.aByteArray64[this.anInt4615++]) {
			local11 = (local22 & 0x7F | local11) << 7;
		}
		return local11 | local22;
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(II)V")
	public final void method3919(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(B)B")
	public final byte method3920() {
		return this.aByteArray64[this.anInt4615++];
	}

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "(I)I")
	public final int method3921() {
		return 128 - this.aByteArray64[this.anInt4615++] & 0xFF;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
	public final void method3922(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[BI)V")
	public final void method3923(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = arg1 - 1; local11 >= 0; local11--) {
			arg0[local11] = (byte) (this.aByteArray64[this.anInt4615++] - 128);
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(ZI)V")
	public final void method3924(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "(I)I")
	public final int method3925() {
		this.anInt4615 += 2;
		@Pc(31) int local31 = (this.aByteArray64[this.anInt4615 - 2] & 0xFF) + ((this.aByteArray64[this.anInt4615 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "(I)B")
	public final byte method3926() {
		return (byte) (128 - this.aByteArray64[this.anInt4615++]);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([II)V")
	public final void method3927(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt4615 / 8;
		this.anInt4615 = 0;
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			@Pc(30) int local30 = this.method3896();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = this.method3896();
			@Pc(40) int local40 = 32;
			while (local40-- > 0) {
				local30 += arg0[local32 & 0x3] + local32 ^ (local36 << 4 ^ local36 >>> 5) - -local36;
				local32 += -1640531527;
				local36 += local32 + arg0[local32 >>> 11 & 0x60200003] ^ (local30 >>> 5 ^ local30 << 4) + local30;
			}
			this.anInt4615 -= 8;
			this.method3944(local30);
			this.method3944(local36);
		}
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(II)V")
	public final void method3928(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJI)V")
	public final void method3929(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(30) int local30 = local6 * 8; local30 >= 0; local30 -= 8) {
			this.aByteArray64[this.anInt4615++] = (byte) (arg1 >> local30);
		}
	}

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "(I)I")
	public final int method3930() {
		this.anInt4615 += 2;
		@Pc(36) int local36 = (this.aByteArray64[this.anInt4615 - 1] & 0xFF) + ((this.aByteArray64[this.anInt4615 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method3931() {
		@Pc(11) int local11 = this.anInt4615;
		while (this.aByteArray64[this.anInt4615++] != 0) {
		}
		return Static222.method3633(this.aByteArray64, this.anInt4615 - local11 - 1, local11);
	}

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "(I)I")
	public final int method3932() {
		this.anInt4615 += 4;
		return (this.aByteArray64[this.anInt4615 - 3] & 0xFF) + ((this.aByteArray64[this.anInt4615 - 1] & 0xFF) << 16) + ((this.aByteArray64[-2 + this.anInt4615] & 0xFF) << 24) + ((this.aByteArray64[this.anInt4615 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(FI)V")
	public final void method3933(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray64[this.anInt4615++] = (byte) (local2 >> 24);
		this.aByteArray64[this.anInt4615++] = (byte) (local2 >> 16);
		this.aByteArray64[this.anInt4615++] = (byte) (local2 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) local2;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BF)V")
	public final void method3934(@OriginalArg(1) float arg0) {
		@Pc(10) int local10 = Float.floatToRawIntBits(arg0);
		this.aByteArray64[this.anInt4615++] = (byte) local10;
		this.aByteArray64[this.anInt4615++] = (byte) (local10 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) (local10 >> 16);
		this.aByteArray64[this.anInt4615++] = (byte) (local10 >> 24);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI[BI)V")
	public final void method3935(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = this.aByteArray64[this.anInt4615++];
		}
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "(II)V")
	public final void method3936(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt4615 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(B)I")
	public final int method3937() {
		@Pc(7) int local7 = this.aByteArray64[this.anInt4615] & 0xFF;
		return local7 < 128 ? this.method3915() - 64 : this.method3948() - 49152;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(ZI)V")
	public final void method3938(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "(I)I")
	public final int method3939() {
		return this.aByteArray64[this.anInt4615++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "(II)V")
	public final void method3940(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 + 128);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(B)I")
	public final int method3941() {
		return -this.aByteArray64[this.anInt4615++] & 0xFF;
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "(B)I")
	public final int method3942() {
		@Pc(14) int local14 = this.method3904();
		@Pc(16) int local16 = 0;
		while (local14 == 32767) {
			local14 = this.method3904();
			local16 += 32767;
		}
		return local16 + local14;
	}

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "(II)V")
	public final void method3943(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method3907(arg0 >>> 28 | 0x80);
					}
					this.method3907(arg0 >>> 21 | 0x80);
				}
				this.method3907(arg0 >>> 14 | 0x80);
			}
			this.method3907(arg0 >>> 7 | 0x80);
		}
		this.method3907(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "(II)V")
	public final void method3944(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III[B)V")
	public final void method3945(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray64[this.anInt4615++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(BI)J")
	public final long method3947(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(25) long local25 = 0L;
		for (@Pc(29) int local29 = local6 * 8; local29 >= 0; local29 -= 8) {
			local25 |= ((long) this.aByteArray64[this.anInt4615++] & 0xFFL) << local29;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "(B)I")
	public final int method3948() {
		this.anInt4615 += 2;
		return ((this.aByteArray64[this.anInt4615 - 2] & 0xFF) << 8) + (this.aByteArray64[this.anInt4615 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "(II)V")
	public final void method3949(@OriginalArg(0) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 16);
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 24);
		this.aByteArray64[this.anInt4615++] = (byte) arg0;
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 >> 8);
	}
}
