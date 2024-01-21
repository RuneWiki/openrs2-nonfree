import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!og", name = "Bb", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!og", name = "Hb", descriptor = "I")
	public int anInt273;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3(@OriginalArg(0) int arg0) {
		this.aByteArray4 = Static119.method2567(arg0);
		this.anInt273 = 0;
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "([B)V")
	public Class2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.anInt273 = 0;
		this.aByteArray4 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)I")
	public final int method190() {
		this.anInt273 += 2;
		@Pc(28) int local28 = ((this.aByteArray4[this.anInt273 - 1] & 0xFF) << 8) + (this.aByteArray4[this.anInt273 - 2] & 0xFF);
		if (local28 > 32767) {
			local28 -= 65536;
		}
		return local28;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)V")
	public final void method191(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt273++] = (byte) arg0;
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)I")
	public final int method192() {
		this.anInt273 += 2;
		return ((this.aByteArray4[this.anInt273 - 1] & 0xFF) << 8) + (this.aByteArray4[this.anInt273 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)V")
	public final void method193(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)I")
	public final int method194() {
		return -this.aByteArray4[this.anInt273++] & 0xFF;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[BIZ)V")
	public final void method195(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(5) int local5 = arg1 - 1; local5 >= 0; local5--) {
			arg0[local5] = (byte) (this.aByteArray4[this.anInt273++] - 128);
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)V")
	public final void method196(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt273 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt273 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt273 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt273 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)V")
	public final void method197(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt273++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)B")
	public final byte method198() {
		return (byte) -this.aByteArray4[this.anInt273++];
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(II)V")
	public final void method199(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt273++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(IB)V")
	public final void method200(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt273 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)I")
	public final int method201() {
		return 128 - this.aByteArray4[this.anInt273++] & 0xFF;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(II)V")
	public final void method202(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) arg0;
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(II)V")
	public final void method203(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)J")
	public final long method204() {
		@Pc(19) long local19 = (long) this.method206() & 0xFFFFFFFFL;
		@Pc(26) long local26 = (long) this.method206() & 0xFFFFFFFFL;
		return (local19 << 32) + local26;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IJ)V")
	public final void method205(@OriginalArg(1) long arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 56);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 48);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 40);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 32);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt273++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(I)I")
	public final int method206() {
		this.anInt273 += 4;
		return ((this.aByteArray4[this.anInt273 - 2] & 0xFF) << 8) + (((this.aByteArray4[this.anInt273 - 4] & 0xFF) << 24) + ((this.aByteArray4[this.anInt273 - 3] & 0xFF) << 16) + (this.aByteArray4[this.anInt273 + -1] & 0xFF));
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method207(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt273;
		this.anInt273 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method228(local6, local12);
		@Pc(29) BigInteger local29 = new BigInteger(local12);
		@Pc(34) BigInteger local34 = local29.modPow(arg0, arg1);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt273 = 0;
		this.method224(local37.length);
		this.method214(local37.length, local37);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(BI)V")
	public final void method208(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method224(arg0 >>> 28 | 0x80);
					}
					this.method224(arg0 >>> 21 | 0x80);
				}
				this.method224(arg0 >>> 14 | 0x80);
			}
			this.method224(arg0 >>> 7 | 0x80);
		}
		this.method224(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(B)I")
	public final int method209() {
		this.anInt273 += 2;
		return (this.aByteArray4[this.anInt273 - 2] - 128 & 0xFF) + ((this.aByteArray4[this.anInt273 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I")
	public final int method210() {
		@Pc(16) byte local16 = this.aByteArray4[this.anInt273++];
		@Pc(23) int local23 = 0;
		while (local16 < 0) {
			local23 = (local16 & 0x7F | local23) << 7;
			local16 = this.aByteArray4[this.anInt273++];
		}
		return local23 | local16;
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "(I)Lclient!ob;")
	public final Class60 method211() {
		if (this.aByteArray4[this.anInt273] == 0) {
			this.anInt273++;
			return null;
		} else {
			return this.method240();
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(B)I")
	public final int method212() {
		this.anInt273 += 4;
		return (this.aByteArray4[this.anInt273 - 3] & 0xFF) + ((this.aByteArray4[this.anInt273 - 2] & 0xFF) << 24) + ((this.aByteArray4[this.anInt273 + -1] & 0xFF) << 16) + ((this.aByteArray4[this.anInt273 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
	public final void method213(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt273++] = (byte) arg0;
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I[BII)V")
	public final void method214(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray4[this.anInt273++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!og", name = "j", descriptor = "(I)I")
	public final int method215() {
		this.anInt273 += 4;
		return (this.aByteArray4[this.anInt273 - 4] & 0xFF) + ((this.aByteArray4[this.anInt273 - 1] & 0xFF) << 24) + ((this.aByteArray4[this.anInt273 + -2] & 0xFF) << 16) + ((this.aByteArray4[this.anInt273 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(II)V")
	public final void method216(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(B)I")
	public final int method217() {
		@Pc(20) int local20 = this.aByteArray4[this.anInt273] & 0xFF;
		return local20 >= 128 ? this.method234() - 49152 : this.method218() + -64;
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "(I)I")
	public final int method218() {
		return this.aByteArray4[this.anInt273++] & 0xFF;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(B)I")
	public final int method219() {
		this.anInt273 += 2;
		@Pc(32) int local32 = (this.aByteArray4[this.anInt273 - 1] & 0xFF) + ((this.aByteArray4[this.anInt273 - 2] & 0xFF) << 8);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(II)I")
	public final int method220(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static25.method619(this.aByteArray4, this.anInt273, arg0);
		this.method197(local11);
		return local11;
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "(II)V")
	public final void method221(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) arg0;
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI[II)V")
	public final void method222(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(2) int local2 = this.anInt273;
		this.anInt273 = 5;
		@Pc(12) int local12 = (arg1 - 5) / 8;
		for (@Pc(26) int local26 = 0; local26 < local12; local26++) {
			@Pc(31) int local31 = this.method206();
			@Pc(33) int local33 = -957401312;
			@Pc(37) int local37 = this.method206();
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local37 -= (local31 << 4 ^ local31 >>> 5) + local31 ^ arg0[local33 >>> 11 & 0x3] + local33;
				local33 -= -1640531527;
				local31 -= (local37 >>> 5 ^ local37 << 4) + local37 ^ local33 + arg0[local33 & 0x3];
			}
			this.anInt273 -= 8;
			this.method197(local31);
			this.method197(local37);
		}
		this.anInt273 = local2;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BJ)V")
	public final void method223(@OriginalArg(1) long arg0) {
		this.method202((int) (arg0 >> 32));
		this.method202((int) arg0);
	}

	@OriginalMember(owner = "client!og", name = "j", descriptor = "(II)V")
	public final void method224(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ob;B)V")
	public final void method226(@OriginalArg(0) Class60 arg0) {
		this.anInt273 += arg0.method2686(arg0.method2673(), this.anInt273, this.aByteArray4);
		this.aByteArray4[this.anInt273++] = 0;
	}

	@OriginalMember(owner = "client!og", name = "m", descriptor = "(I)B")
	public final byte method227() {
		return this.aByteArray4[this.anInt273++];
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III[B)V")
	public final void method228(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0; local5++) {
			arg1[local5] = this.aByteArray4[this.anInt273++];
		}
	}

	@OriginalMember(owner = "client!og", name = "n", descriptor = "(I)I")
	public final int method229() {
		return this.aByteArray4[this.anInt273++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(B)I")
	public final int method230() {
		this.anInt273 += 2;
		@Pc(39) int local39 = ((this.aByteArray4[this.anInt273 - 1] & 0xFF) << 8) + (this.aByteArray4[this.anInt273 - 2] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "(II)V")
	public final void method231(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!og", name = "o", descriptor = "(I)I")
	public final int method232() {
		@Pc(9) int local9 = this.method237();
		@Pc(11) int local11 = 0;
		while (local9 == 32767) {
			local11 += 32767;
			local9 = this.method237();
		}
		return local11 + local9;
	}

	@OriginalMember(owner = "client!og", name = "p", descriptor = "(I)I")
	public final int method233() {
		this.anInt273 += 4;
		return ((this.aByteArray4[this.anInt273 - 1] & 0xFF) << 8) + ((this.aByteArray4[this.anInt273 - 4] & 0xFF) << 16) + ((this.aByteArray4[this.anInt273 + -3] & 0xFF) << 24) + (this.aByteArray4[this.anInt273 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!og", name = "q", descriptor = "(I)I")
	public final int method234() {
		this.anInt273 += 2;
		return (this.aByteArray4[this.anInt273 - 1] & 0xFF) + ((this.aByteArray4[this.anInt273 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!og", name = "l", descriptor = "(II)V")
	public final void method235(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method224(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method199(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!og", name = "m", descriptor = "(II)V")
	public final void method236(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (arg0 + 128);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!og", name = "r", descriptor = "(I)I")
	public final int method237() {
		@Pc(16) int local16 = this.aByteArray4[this.anInt273] & 0xFF;
		return local16 < 128 ? this.method218() : this.method234() - 32768;
	}

	@OriginalMember(owner = "client!og", name = "n", descriptor = "(II)V")
	public final void method238(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt273++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt273++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!og", name = "s", descriptor = "(I)I")
	public final int method239() {
		this.anInt273 += 3;
		return (this.aByteArray4[this.anInt273 - 1] & 0xFF) + (((this.aByteArray4[this.anInt273 - 3] & 0xFF) << 16) + ((this.aByteArray4[this.anInt273 - 2] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!og", name = "t", descriptor = "(I)Lclient!ob;")
	public final Class60 method240() {
		@Pc(2) int local2 = this.anInt273;
		while (this.aByteArray4[this.anInt273++] != 0) {
		}
		return Static165.method3103(local2, this.aByteArray4, this.anInt273 - local2 - 1);
	}

	@OriginalMember(owner = "client!og", name = "u", descriptor = "(I)B")
	public final byte method241() {
		return (byte) (128 - this.aByteArray4[this.anInt273++]);
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(B)I")
	public final int method242() {
		this.anInt273 += 2;
		return (this.aByteArray4[this.anInt273 - 1] - 128 & 0xFF) + ((this.aByteArray4[this.anInt273 - 2] & 0xFF) << 8);
	}
}
