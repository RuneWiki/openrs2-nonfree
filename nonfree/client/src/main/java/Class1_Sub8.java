import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!ka", name = "wb", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8(@OriginalArg(0) int arg0) {
		this.aByteArray3 = Static75.method1326(arg0);
		this.anInt446 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray3 = arg0;
		this.anInt446 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)I")
	public final int method309() {
		this.anInt446 += 2;
		@Pc(34) int local34 = ((this.aByteArray3[this.anInt446 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt446 - 2] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I")
	public final int method310() {
		@Pc(16) byte local16 = this.aByteArray3[this.anInt446++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray3[this.anInt446++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
	public final void method311(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt446++] = (byte) arg0;
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)I")
	public final int method312() {
		this.anInt446 += 2;
		return ((this.aByteArray3[this.anInt446 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt446 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
	public final int method313() {
		@Pc(9) int local9 = this.method330();
		@Pc(19) int local19 = 0;
		while (local9 == 32767) {
			local9 = this.method330();
			local19 += 32767;
		}
		return local19 + local9;
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)I")
	public final int method314() {
		this.anInt446 += 4;
		return ((this.aByteArray3[this.anInt446 - 3] & 0xFF) << 8) + ((this.aByteArray3[this.anInt446 - 2] & 0xFF) << 16) + ((this.aByteArray3[-1 + this.anInt446] & 0xFF) << 24) + (this.aByteArray3[this.anInt446 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)I")
	public final int method316() {
		this.anInt446 += 3;
		return ((this.aByteArray3[this.anInt446 - 3] & 0xFF) << 16) + (((this.aByteArray3[this.anInt446 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt446 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
	public final void method317(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt446 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt446 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt446 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt446 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public final void method318(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[B)V")
	public final void method319(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray3[this.anInt446++];
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)I")
	public final int method320() {
		this.anInt446 += 2;
		return (this.aByteArray3[this.anInt446 - 2] & 0xFF) + ((this.aByteArray3[this.anInt446 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public final void method321(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) (arg0 + 128);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)B")
	public final byte method322() {
		return (byte) -this.aByteArray3[this.anInt446++];
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)I")
	public final int method323() {
		this.anInt446 += 4;
		return (this.aByteArray3[this.anInt446 - 2] & 0xFF) + ((this.aByteArray3[this.anInt446 - 1] & 0xFF) << 8) + ((this.aByteArray3[this.anInt446 + -4] & 0xFF) << 16) + ((this.aByteArray3[this.anInt446 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)B")
	public final byte method325() {
		return (byte) (128 - this.aByteArray3[this.anInt446++]);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)I")
	public final int method326() {
		return 128 - this.aByteArray3[this.anInt446++] & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "(I)I")
	public final int method327() {
		this.anInt446 += 3;
		return ((this.aByteArray3[this.anInt446 - 3] & 0xFF) << 8) + ((this.aByteArray3[this.anInt446 - 2] & 0xFF) << 16) + (this.aByteArray3[this.anInt446 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
	public final void method328(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt446++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IZ)I")
	public final int method329(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static75.method1325(arg0, this.anInt446, this.aByteArray3);
		this.method328(local11);
		return local11;
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)I")
	public final int method330() {
		@Pc(16) int local16 = this.aByteArray3[this.anInt446] & 0xFF;
		return local16 >= 128 ? this.method359() - 32768 : this.method336();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(BI)V")
	public final void method331(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)I")
	public final int method332() {
		this.anInt446 += 2;
		@Pc(38) int local38 = (this.aByteArray3[this.anInt446 - 1] & 0xFF) + ((this.aByteArray3[this.anInt446 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V")
	public final void method333(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt446++] = (byte) arg0;
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "(I)B")
	public final byte method334() {
		return (byte) (this.aByteArray3[this.anInt446++] - 128);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZJ)V")
	public final void method335(@OriginalArg(1) long arg0) {
		this.method357((int) (arg0 >> 32));
		this.method357((int) arg0);
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(B)I")
	public final int method336() {
		return this.aByteArray3[this.anInt446++] & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(BI)V")
	public final void method337(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt446++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)I")
	public final int method338() {
		this.anInt446 += 2;
		return ((this.aByteArray3[this.anInt446 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt446 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "(I)B")
	public final byte method339() {
		return this.aByteArray3[this.anInt446++];
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V")
	public final void method340(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(II)V")
	public final void method341(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt446 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI[B)V")
	public final void method342(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(18) int local18 = arg0 - 1; local18 >= 0; local18--) {
			arg1[local18] = (byte) (this.aByteArray3[this.anInt446++] - 128);
		}
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(II)V")
	public final void method343(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt446++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "(I)Lclient!tg;")
	public final Class81 method344() {
		@Pc(11) int local11 = this.anInt446;
		while (this.aByteArray3[this.anInt446++] != 0) {
		}
		return Static107.method1776(local11, this.anInt446 - local11 - 1, this.aByteArray3);
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(II)V")
	public final void method345(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) arg0;
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(Z)Lclient!tg;")
	public final Class81 method346() {
		if (this.aByteArray3[this.anInt446] == 0) {
			this.anInt446++;
			return null;
		} else {
			return this.method344();
		}
	}

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "(I)I")
	public final int method347() {
		this.anInt446 += 4;
		return (this.aByteArray3[this.anInt446 - 1] & 0xFF) + ((this.aByteArray3[this.anInt446 - 2] & 0xFF) << 8) + ((this.aByteArray3[this.anInt446 + -3] & 0xFF) << 16) + ((this.aByteArray3[-4 + this.anInt446] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!tg;I)V")
	public final void method348(@OriginalArg(0) Class81 arg0) {
		this.anInt446 += arg0.method2815(this.anInt446, arg0.method2820(), this.aByteArray3);
		this.aByteArray3[this.anInt446++] = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method350(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt446;
		this.anInt446 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method319(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt446 = 0;
		this.method331(local31.length);
		this.method352(local31.length, local31);
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(I)I")
	public final int method351() {
		@Pc(11) int local11 = this.aByteArray3[this.anInt446] & 0xFF;
		return local11 >= 128 ? this.method359() - 49152 : this.method336() + -64;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII[B)V")
	public final void method352(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			this.aByteArray3[this.anInt446++] = arg1[local11];
		}
	}

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "(I)I")
	public final int method353() {
		return -this.aByteArray3[this.anInt446++] & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(II)V")
	public final void method354(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method331(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method337(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)V")
	public final void method355(@OriginalArg(0) long arg0) {
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 56);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 48);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 40);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 32);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt446++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IBII)V")
	public final void method356(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt446;
		this.anInt446 = 5;
		@Pc(26) int local26 = (arg1 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = this.method347();
			@Pc(38) int local38 = this.method347();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= arg0[local40 >>> 11 & 0x16800003] + local40 ^ (local34 << 4 ^ local34 >>> 5) - -local34;
				local40 -= -1640531527;
				local34 -= (local38 << 4 ^ local38 >>> 5) + local38 ^ arg0[local40 & 0x3] + local40;
			}
			this.anInt446 -= 8;
			this.method328(local34);
			this.method328(local38);
		}
		this.anInt446 = local16;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(BI)V")
	public final void method357(@OriginalArg(1) int arg0) {
		this.aByteArray3[this.anInt446++] = (byte) arg0;
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt446++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "(I)I")
	public final int method358() {
		this.anInt446 += 4;
		return ((this.aByteArray3[this.anInt446 - 4] & 0xFF) << 8) + ((this.aByteArray3[this.anInt446 - 2] & 0xFF) << 24) + ((this.aByteArray3[this.anInt446 + -1] & 0xFF) << 16) + (this.aByteArray3[this.anInt446 - 3] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(Z)I")
	public final int method359() {
		this.anInt446 += 2;
		return ((this.aByteArray3[this.anInt446 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt446 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(II)V")
	public final void method361(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method331(arg0 >>> 28 | 0x80);
					}
					this.method331(arg0 >>> 21 | 0x80);
				}
				this.method331(arg0 >>> 14 | 0x80);
			}
			this.method331(arg0 >>> 7 | 0x80);
		}
		this.method331(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)I")
	public final int method362() {
		return this.aByteArray3[this.anInt446++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "(I)J")
	public final long method363() {
		@Pc(10) long local10 = (long) this.method347() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method347() & 0xFFFFFFFFL;
		return local22 + (local10 << 32);
	}
}
