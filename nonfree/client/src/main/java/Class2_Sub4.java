import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!be", name = "s", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "I")
	public int anInt1298;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
	public Class2_Sub4(@OriginalArg(0) int arg0) {
		this.aByteArray20 = Static52.method877(arg0);
		this.anInt1298 = 0;
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "([B)V")
	public Class2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = arg0;
		this.anInt1298 = 0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I")
	public final int method896() {
		this.anInt1298 += 2;
		return ((this.aByteArray20[this.anInt1298 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1298 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
	public final void method897(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method926(arg0 >>> 28 | 0x80);
					}
					this.method926(arg0 >>> 21 | 0x80);
				}
				this.method926(arg0 >>> 14 | 0x80);
			}
			this.method926(arg0 >>> 7 | 0x80);
		}
		this.method926(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I")
	public final int method898() {
		this.anInt1298 += 2;
		@Pc(38) int local38 = ((this.aByteArray20[this.anInt1298 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt1298 - 2] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)I")
	public final int method899() {
		return 128 - this.aByteArray20[this.anInt1298++] & 0xFF;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)V")
	public final void method900(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 + 128);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IB)V")
	public final void method901(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1298++] = (byte) arg0;
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)I")
	public final int method902() {
		this.anInt1298 += 2;
		return ((this.aByteArray20[this.anInt1298 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt1298 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)I")
	public final int method903() {
		this.anInt1298 += 4;
		return (this.aByteArray20[this.anInt1298 - 1] & 0xFF) + ((this.aByteArray20[this.anInt1298 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt1298 - 4] & 0xFF) << 24) + ((this.aByteArray20[this.anInt1298 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public final void method904(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)I")
	public final int method905() {
		this.anInt1298 += 2;
		@Pc(36) int local36 = (this.aByteArray20[this.anInt1298 - 1] & 0xFF) + ((this.aByteArray20[this.anInt1298 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)Lclient!pe;")
	public final Class65 method906() {
		if (this.aByteArray20[this.anInt1298] == 0) {
			this.anInt1298++;
			return null;
		} else {
			return this.method931();
		}
	}

	@OriginalMember(owner = "client!be", name = "h", descriptor = "(I)J")
	public final long method907() {
		@Pc(10) long local10 = (long) this.method903() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method903() & 0xFFFFFFFFL;
		return (local10 << 32) + local17;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V")
	public final void method909(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) arg0;
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BBII)V")
	public final void method910(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = this.aByteArray20[this.anInt1298++];
		}
	}

	@OriginalMember(owner = "client!be", name = "j", descriptor = "(I)I")
	public final int method911() {
		return -this.aByteArray20[this.anInt1298++] & 0xFF;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method912(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt1298;
		this.anInt1298 = 0;
		@Pc(8) byte[] local8 = new byte[local2];
		this.method910(local8, local2);
		@Pc(23) BigInteger local23 = new BigInteger(local8);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt1298 = 0;
		this.method926(local31.length);
		this.method936(local31.length, local31);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)I")
	public final int method913(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = Static34.method635(this.anInt1298, arg0, this.aByteArray20);
		this.method914(local12);
		return local12;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(II)V")
	public final void method914(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1298++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!be", name = "k", descriptor = "(I)I")
	public final int method915() {
		this.anInt1298 += 4;
		return ((this.aByteArray20[this.anInt1298 - 4] & 0xFF) << 8) + (((this.aByteArray20[this.anInt1298 - 2] & 0xFF) << 24) + ((this.aByteArray20[this.anInt1298 - 1] & 0xFF) << 16) + (this.aByteArray20[this.anInt1298 + -3] & 0xFF));
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(JB)V")
	public final void method917(@OriginalArg(0) long arg0) {
		this.method947((int) (arg0 >> 32));
		this.method947((int) arg0);
	}

	@OriginalMember(owner = "client!be", name = "l", descriptor = "(I)I")
	public final int method918() {
		this.anInt1298 += 4;
		return (this.aByteArray20[this.anInt1298 - 4] & 0xFF) + ((this.aByteArray20[this.anInt1298 - 3] & 0xFF) << 8) + ((this.aByteArray20[this.anInt1298 + -1] & 0xFF) << 24) + ((this.aByteArray20[this.anInt1298 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I")
	public final int method919() {
		this.anInt1298 += 2;
		return ((this.aByteArray20[this.anInt1298 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt1298 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
	public final void method920(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)B")
	public final byte method922() {
		return this.aByteArray20[this.anInt1298++];
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)I")
	public final int method923() {
		return this.aByteArray20[this.anInt1298++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!be", name = "m", descriptor = "(I)I")
	public final int method924() {
		@Pc(10) byte local10 = this.aByteArray20[this.anInt1298++];
		@Pc(16) int local16 = 0;
		while (local10 < 0) {
			local16 = (local10 & 0x7F | local16) << 7;
			local10 = this.aByteArray20[this.anInt1298++];
		}
		return local10 | local16;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(IB)V")
	public final void method925(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1298++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(IB)V")
	public final void method926(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!be", name = "n", descriptor = "(I)I")
	public final int method927() {
		this.anInt1298 += 2;
		return (this.aByteArray20[this.anInt1298 - 1] - 128 & 0xFF) + ((this.aByteArray20[this.anInt1298 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!be", name = "o", descriptor = "(I)B")
	public final byte method928() {
		return (byte) (128 - this.aByteArray20[this.anInt1298++]);
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(II)V")
	public final void method929(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!be", name = "p", descriptor = "(I)I")
	public final int method930() {
		this.anInt1298 += 4;
		return (this.aByteArray20[this.anInt1298 - 2] & 0xFF) + ((this.aByteArray20[this.anInt1298 - 1] & 0xFF) << 8) + ((this.aByteArray20[this.anInt1298 + -4] & 0xFF) << 16) + ((this.aByteArray20[-3 + this.anInt1298] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!be", name = "q", descriptor = "(I)Lclient!pe;")
	public final Class65 method931() {
		@Pc(6) int local6 = this.anInt1298;
		while (this.aByteArray20[this.anInt1298++] != 0) {
		}
		return Static33.method626(this.aByteArray20, this.anInt1298 - local6 - 1, local6);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[BBI)V")
	public final void method932(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(5) int local5 = arg1 - 1; local5 >= 0; local5--) {
			arg0[local5] = this.aByteArray20[this.anInt1298++];
		}
	}

	@OriginalMember(owner = "client!be", name = "r", descriptor = "(I)I")
	public final int method933() {
		return this.aByteArray20[this.anInt1298++] & 0xFF;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)I")
	public final int method934() {
		this.anInt1298 += 2;
		@Pc(30) int local30 = ((this.aByteArray20[this.anInt1298 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1298 - 1] - 128 & 0xFF);
		if (local30 > 32767) {
			local30 -= 65536;
		}
		return local30;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III[B)V")
	public final void method935(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			arg1[local5] = (byte) (this.aByteArray20[this.anInt1298++] - 128);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III[B)V")
	public final void method936(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray20[this.anInt1298++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(II)V")
	public final void method937(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) arg0;
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(Z)I")
	public final int method938() {
		@Pc(16) int local16 = this.aByteArray20[this.anInt1298] & 0xFF;
		return local16 < 128 ? this.method933() : this.method896() - 32768;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(IB)V")
	public final void method939(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt1298 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1298 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1298 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1298 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(Z)I")
	public final int method940() {
		this.anInt1298 += 3;
		return (this.aByteArray20[this.anInt1298 - 1] & 0xFF) + ((this.aByteArray20[this.anInt1298 - 2] & 0xFF) << 8) + ((this.aByteArray20[this.anInt1298 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(ZI)V")
	public final void method941(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1298++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)V")
	public final void method942(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method926(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method925(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!pe;)V")
	public final void method943(@OriginalArg(1) Class65 arg0) {
		this.anInt1298 += arg0.method1509(arg0.method1502(), this.anInt1298, this.aByteArray20);
		this.aByteArray20[this.anInt1298++] = 0;
	}

	@OriginalMember(owner = "client!be", name = "s", descriptor = "(I)I")
	public final int method944() {
		this.anInt1298 += 3;
		return ((this.aByteArray20[this.anInt1298 - 1] & 0xFF) << 16) + ((this.aByteArray20[this.anInt1298 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt1298 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(II)V")
	public final void method945(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1298 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!be", name = "t", descriptor = "(I)I")
	public final int method946() {
		@Pc(11) int local11 = this.aByteArray20[this.anInt1298] & 0xFF;
		return local11 < 128 ? this.method933() - 64 : this.method896() - 49152;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(ZI)V")
	public final void method947(@OriginalArg(1) int arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1298++] = (byte) arg0;
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BJ)V")
	public final void method948(@OriginalArg(1) long arg0) {
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 56);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 48);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 40);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 32);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt1298++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt1298++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!be", name = "u", descriptor = "(I)B")
	public final byte method949() {
		return (byte) (this.aByteArray20[this.anInt1298++] - 128);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II[II)V")
	public final void method950(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(6) int local6 = this.anInt1298;
		@Pc(12) int local12 = (arg0 - 5) / 8;
		this.anInt1298 = 5;
		for (@Pc(17) int local17 = 0; local17 < local12; local17++) {
			@Pc(22) int local22 = this.method903();
			@Pc(26) int local26 = this.method903();
			@Pc(28) int local28 = -957401312;
			@Pc(30) int local30 = 32;
			while (local30-- > 0) {
				local26 -= local28 + arg1[local28 >>> 11 & 0x3] ^ local22 + (local22 >>> 5 ^ local22 << 4);
				local28 -= -1640531527;
				local22 -= arg1[local28 & 0x3] + local28 ^ (local26 << 4 ^ local26 >>> 5) + local26;
			}
			this.anInt1298 -= 8;
			this.method914(local22);
			this.method914(local26);
		}
		this.anInt1298 = local6;
	}
}
