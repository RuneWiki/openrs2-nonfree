import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ea", name = "ib", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
	public int anInt239;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3(@OriginalArg(0) int arg0) {
		this.aByteArray4 = Static89.method1564(arg0);
		this.anInt239 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.anInt239 = 0;
		this.aByteArray4 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
	public final int method157() {
		return -this.aByteArray4[this.anInt239++] & 0xFF;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BJ)V")
	public final void method158(@OriginalArg(1) long arg0) {
		this.method178((int) (arg0 >> 32));
		this.method178((int) arg0);
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
	public final void method159(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lclient!i;")
	public final Class41 method160() {
		@Pc(6) int local6 = this.anInt239;
		while (this.aByteArray4[this.anInt239++] != 0) {
		}
		return Static49.method967(local6, this.aByteArray4, this.anInt239 - local6 - 1);
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)I")
	public final int method161() {
		this.anInt239 += 4;
		return ((this.aByteArray4[this.anInt239 - 3] & 0xFF) << 8) + ((this.aByteArray4[this.anInt239 - 1] & 0xFF) << 24) + ((this.aByteArray4[this.anInt239 + -2] & 0xFF) << 16) + (this.aByteArray4[this.anInt239 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)J")
	public final long method162(@OriginalArg(0) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local2 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray4[this.anInt239++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)I")
	public final int method163() {
		this.anInt239 += 2;
		return (this.aByteArray4[this.anInt239 - 1] & 0xFF) + ((this.aByteArray4[this.anInt239 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)I")
	public final int method164() {
		this.anInt239 += 2;
		return (this.aByteArray4[this.anInt239 - 2] - 128 & 0xFF) + ((this.aByteArray4[this.anInt239 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)B")
	public final byte method165() {
		return (byte) (this.aByteArray4[this.anInt239++] - 128);
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)I")
	public final int method166() {
		this.anInt239 += 3;
		return ((this.aByteArray4[this.anInt239 - 2] & 0xFF) << 8) + ((this.aByteArray4[this.anInt239 - 3] & 0xFF) << 16) + (this.aByteArray4[this.anInt239 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)V")
	public final void method167(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt239++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIJ)V")
	public final void method168(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(10) int local10 = arg0 - 1;
		if (local10 < 0 || local10 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(25) int local25 = local10 * 8; local25 >= 0; local25 -= 8) {
			this.aByteArray4[this.anInt239++] = (byte) (arg1 >> local25);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI[BI)V")
	public final void method169(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = this.aByteArray4[this.anInt239++];
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
	public final void method170(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method208(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method167(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method173(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt239;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt239 = 0;
		this.method169(local6, local9);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt239 = 0;
		this.method208(local31.length);
		this.method187(local31.length, local31);
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I")
	public final int method174() {
		this.anInt239 += 2;
		@Pc(33) int local33 = ((this.aByteArray4[this.anInt239 - 1] & 0xFF) << 8) + (this.aByteArray4[this.anInt239 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)I")
	public final int method175() {
		this.anInt239 += 4;
		return (this.aByteArray4[this.anInt239 - 2] & 0xFF) + ((this.aByteArray4[this.anInt239 - 1] & 0xFF) << 8) + ((this.aByteArray4[this.anInt239 + -4] & 0xFF) << 16) + ((this.aByteArray4[this.anInt239 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	public final void method176(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) arg0;
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([BIII)V")
	public final void method177(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(19) int local19 = arg1 - 1; local19 >= 0; local19--) {
			arg0[local19] = this.aByteArray4[this.anInt239++];
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(II)V")
	public final void method178(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt239++] = (byte) arg0;
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)I")
	public final int method179() {
		@Pc(21) byte local21 = this.aByteArray4[this.anInt239++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local23 | local21 & 0x7F) << 7;
			local21 = this.aByteArray4[this.anInt239++];
		}
		return local23 | local21;
	}

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)I")
	public final int method181() {
		return this.aByteArray4[this.anInt239++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "(I)I")
	public final int method182() {
		this.anInt239 += 4;
		return ((this.aByteArray4[this.anInt239 - 4] & 0xFF) << 8) + ((this.aByteArray4[this.anInt239 - 1] & 0xFF) << 16) + ((this.aByteArray4[this.anInt239 + -2] & 0xFF) << 24) + (this.aByteArray4[this.anInt239 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "(I)J")
	public final long method183() {
		@Pc(11) long local11 = (long) this.method185() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method185() & 0xFFFFFFFFL;
		return local22 + (local11 << 32);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[II)V")
	public final void method184(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = (arg0 - 5) / 8;
		@Pc(14) int local14 = this.anInt239;
		this.anInt239 = 5;
		for (@Pc(19) int local19 = 0; local19 < local7; local19++) {
			@Pc(25) int local25 = this.method185();
			@Pc(29) int local29 = this.method185();
			@Pc(33) int local33 = -957401312;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local29 -= local33 + arg1[local33 >>> 11 & 0x3] ^ (local25 >>> 5 ^ local25 << 4) - -local25;
				local33 -= -1640531527;
				local25 -= local29 + (local29 >>> 5 ^ local29 << 4) ^ arg1[local33 & 0x3] + local33;
			}
			this.anInt239 -= 8;
			this.method200(local25);
			this.method200(local29);
		}
		this.anInt239 = local14;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)I")
	public final int method185() {
		this.anInt239 += 4;
		return (this.aByteArray4[this.anInt239 - 1] & 0xFF) + ((this.aByteArray4[this.anInt239 - 2] & 0xFF) << 8) + ((this.aByteArray4[this.anInt239 + -4] & 0xFF) << 24) + ((this.aByteArray4[this.anInt239 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "(I)B")
	public final byte method186() {
		return this.aByteArray4[this.anInt239++];
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI[BI)V")
	public final void method187(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			this.aByteArray4[this.anInt239++] = arg1[local11];
		}
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(II)V")
	public final void method188(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt239++] = (byte) arg0;
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(II)V")
	public final void method189(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(JB)V")
	public final void method190(@OriginalArg(0) long arg0) {
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 56);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 48);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 40);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 32);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt239++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "(II)V")
	public final void method191(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method208(arg0 >>> 28 | 0x80);
					}
					this.method208(arg0 >>> 21 | 0x80);
				}
				this.method208(arg0 >>> 14 | 0x80);
			}
			this.method208(arg0 >>> 7 | 0x80);
		}
		this.method208(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "(II)V")
	public final void method193(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(B)I")
	public final int method194() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method212(); local11 == 32767; local11 = this.method212()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
	public final void method195(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt239 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt239 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt239 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt239 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(B)I")
	public final int method196() {
		this.anInt239 += 2;
		@Pc(36) int local36 = (this.aByteArray4[this.anInt239 - 1] & 0xFF) + ((this.aByteArray4[this.anInt239 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "(I)B")
	public final byte method197() {
		return (byte) -this.aByteArray4[this.anInt239++];
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!i;B)V")
	public final void method198(@OriginalArg(0) Class41 arg0) {
		this.anInt239 += arg0.method1401(arg0.method1393(), this.anInt239, this.aByteArray4);
		this.aByteArray4[this.anInt239++] = 0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IB)V")
	public final void method199(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt239++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "(II)V")
	public final void method200(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt239++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "(I)I")
	public final int method201() {
		this.anInt239 += 2;
		@Pc(33) int local33 = (this.aByteArray4[this.anInt239 - 1] - 128 & 0xFF) + ((this.aByteArray4[this.anInt239 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "(B)I")
	public final int method202() {
		this.anInt239 += 3;
		return (this.aByteArray4[this.anInt239 - 1] & 0xFF) + ((this.aByteArray4[this.anInt239 - 2] & 0xFF) << 16) + ((this.aByteArray4[this.anInt239 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "(II)V")
	public final void method203(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt239 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)I")
	public final int method204() {
		@Pc(12) int local12 = this.aByteArray4[this.anInt239] & 0xFF;
		return local12 < 128 ? this.method209() - 64 : this.method163() + -49152;
	}

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "(I)I")
	public final int method205() {
		this.anInt239 += 2;
		return ((this.aByteArray4[this.anInt239 - 1] & 0xFF) << 8) + (this.aByteArray4[this.anInt239 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(IB)V")
	public final void method206(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) (arg0 + 128);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(IB)I")
	public final int method207(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static205.method3165(arg0, this.aByteArray4, this.anInt239);
		this.method200(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "(II)V")
	public final void method208(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "(I)I")
	public final int method209() {
		return this.aByteArray4[this.anInt239++] & 0xFF;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)I")
	public final int method211() {
		this.anInt239 += 2;
		return (this.aByteArray4[this.anInt239 - 1] - 128 & 0xFF) + ((this.aByteArray4[this.anInt239 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "(I)I")
	public final int method212() {
		@Pc(11) int local11 = this.aByteArray4[this.anInt239] & 0xFF;
		return local11 < 128 ? this.method209() : this.method163() - 32768;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(ZI)V")
	public final void method213(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt239++] = (byte) arg0;
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt239++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "(I)I")
	public final int method214() {
		return 128 - this.aByteArray4[this.anInt239++] & 0xFF;
	}

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "(I)Lclient!i;")
	public final Class41 method215() {
		if (this.aByteArray4[this.anInt239] == 0) {
			this.anInt239++;
			return null;
		} else {
			return this.method160();
		}
	}
}
