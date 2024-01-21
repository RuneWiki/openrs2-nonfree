import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!tf", name = "Fb", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
	public int anInt1312;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9(@OriginalArg(0) int arg0) {
		this.aByteArray6 = Static71.method1226(arg0);
		this.anInt1312 = 0;
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B)V")
	public Class4_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray6 = arg0;
		this.anInt1312 = 0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	public final void method767(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I")
	public final int method769() {
		this.anInt1312 += 2;
		return (this.aByteArray6[this.anInt1312 - 1] - 128 & 0xFF) + ((this.aByteArray6[this.anInt1312 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)I")
	public final int method770() {
		@Pc(18) int local18 = this.aByteArray6[this.anInt1312] & 0xFF;
		return local18 < 128 ? this.method773() : this.method816() - 32768;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)I")
	public final int method771() {
		this.anInt1312 += 2;
		return (this.aByteArray6[this.anInt1312 - 2] & 0xFF) + ((this.aByteArray6[this.anInt1312 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)V")
	public final void method772(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) arg0;
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)I")
	public final int method773() {
		return this.aByteArray6[this.anInt1312++] & 0xFF;
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)I")
	public final int method774() {
		this.anInt1312 += 2;
		@Pc(31) int local31 = ((this.aByteArray6[this.anInt1312 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt1312 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)V")
	public final void method775(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1312++] = (byte) arg0;
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 24);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Lclient!od;")
	public final Class60 method776() {
		@Pc(14) int local14 = this.anInt1312;
		while (this.aByteArray6[this.anInt1312++] != 0) {
		}
		return Static6.method60(local14, this.anInt1312 - local14 - 1, this.aByteArray6);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[I)V")
	public final void method777(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt1312;
		this.anInt1312 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local18; local28++) {
			@Pc(34) int local34 = this.method780();
			@Pc(38) int local38 = this.method780();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= local34 + (local34 << 4 ^ local34 >>> 5) ^ arg1[local40 >>> 11 & 0x36A00003] + local40;
				local40 -= -1640531527;
				local34 -= (local38 << 4 ^ local38 >>> 5) + local38 ^ local40 + arg1[local40 & 0x3];
			}
			this.anInt1312 -= 8;
			this.method808(local34);
			this.method808(local38);
		}
		this.anInt1312 = local8;
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)I")
	public final int method778() {
		return 128 - this.aByteArray6[this.anInt1312++] & 0xFF;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method779(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt1312;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt1312 = 0;
		this.method794(local6, local9);
		@Pc(23) BigInteger local23 = new BigInteger(local9);
		@Pc(35) BigInteger local35 = local23.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt1312 = 0;
		this.method819(local38.length);
		this.method824(local38, local38.length);
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "(I)I")
	public final int method780() {
		this.anInt1312 += 4;
		return (this.aByteArray6[this.anInt1312 - 1] & 0xFF) + ((this.aByteArray6[this.anInt1312 - 3] & 0xFF) << 16) + ((this.aByteArray6[this.anInt1312 + -4] & 0xFF) << 24) + ((this.aByteArray6[this.anInt1312 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)V")
	public final void method781(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) arg0;
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "(I)I")
	public final int method782() {
		this.anInt1312 += 4;
		return (this.aByteArray6[this.anInt1312 - 2] & 0xFF) + ((this.aByteArray6[this.anInt1312 - 1] & 0xFF) << 8) + ((this.aByteArray6[this.anInt1312 - 3] & 0xFF) << 24) + ((this.aByteArray6[this.anInt1312 + -4] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "(I)J")
	public final long method783() {
		@Pc(6) long local6 = (long) this.method780() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method780() & 0xFFFFFFFFL;
		return (local6 << 32) + local22;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)I")
	public final int method785() {
		this.anInt1312 += 2;
		@Pc(27) int local27 = (this.aByteArray6[this.anInt1312 - 2] & 0xFF) + ((this.aByteArray6[this.anInt1312 - 1] & 0xFF) << 8);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(II)V")
	public final void method786(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1312++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "(I)I")
	public final int method787() {
		this.anInt1312 += 4;
		return (this.aByteArray6[this.anInt1312 - 4] & 0xFF) + ((this.aByteArray6[this.anInt1312 - 3] & 0xFF) << 8) + ((this.aByteArray6[this.anInt1312 + -2] & 0xFF) << 16) + ((this.aByteArray6[this.anInt1312 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!od;Z)V")
	public final void method788(@OriginalArg(0) Class60 arg0) {
		this.anInt1312 += arg0.method1341(arg0.method1345(), this.anInt1312, this.aByteArray6);
		this.aByteArray6[this.anInt1312++] = 0;
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(II)V")
	public final void method789(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIB[B)V")
	public final void method790(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (this.aByteArray6[this.anInt1312++] - 128);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IJ)V")
	public final void method792(@OriginalArg(1) long arg0) {
		this.method781((int) (arg0 >> 32));
		this.method781((int) arg0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)B")
	public final byte method793() {
		return (byte) (this.aByteArray6[this.anInt1312++] - 128);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[B)V")
	public final void method794(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			arg1[local14] = this.aByteArray6[this.anInt1312++];
		}
	}

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "(I)I")
	public final int method795() {
		return -this.aByteArray6[this.anInt1312++] & 0xFF;
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(II)V")
	public final void method796(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)B")
	public final byte method797() {
		return this.aByteArray6[this.anInt1312++];
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)I")
	public final int method798() {
		return this.aByteArray6[this.anInt1312++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "(II)V")
	public final void method799(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1312++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
	public final void method800(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1312 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray6[this.anInt1312 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1312 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1312 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(BI)V")
	public final void method801(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method819(arg0 >>> 28 | 0x80);
					}
					this.method819(arg0 >>> 21 | 0x80);
				}
				this.method819(arg0 >>> 14 | 0x80);
			}
			this.method819(arg0 >>> 7 | 0x80);
		}
		this.method819(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "(I)I")
	public final int method802() {
		this.anInt1312 += 2;
		return ((this.aByteArray6[this.anInt1312 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt1312 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
	public final void method803(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 + 128);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "(I)B")
	public final byte method804() {
		return (byte) -this.aByteArray6[this.anInt1312++];
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(JI)V")
	public final void method805(@OriginalArg(0) long arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 56);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 48);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 40);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 32);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 24);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1312++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "(I)I")
	public final int method806() {
		this.anInt1312 += 3;
		return ((this.aByteArray6[this.anInt1312 - 3] & 0xFF) << 16) + ((this.aByteArray6[this.anInt1312 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt1312 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IB)I")
	public final int method807(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static11.method219(arg0, this.aByteArray6, this.anInt1312);
		this.method808(local16);
		return local16;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(BI)V")
	public final void method808(@OriginalArg(1) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 24);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt1312++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(B)I")
	public final int method809() {
		@Pc(12) byte local12 = this.aByteArray6[this.anInt1312++];
		@Pc(14) int local14 = 0;
		while (local12 < 0) {
			local14 = (local14 | local12 & 0x7F) << 7;
			local12 = this.aByteArray6[this.anInt1312++];
		}
		return local14 | local12;
	}

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "(I)Lclient!od;")
	public final Class60 method811() {
		if (this.aByteArray6[this.anInt1312] == 0) {
			this.anInt1312++;
			return null;
		} else {
			return this.method776();
		}
	}

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "(I)I")
	public final int method813() {
		this.anInt1312 += 4;
		return (this.aByteArray6[this.anInt1312 - 3] & 0xFF) + ((this.aByteArray6[this.anInt1312 - 2] & 0xFF) << 24) + ((this.aByteArray6[this.anInt1312 + -1] & 0xFF) << 16) + ((this.aByteArray6[this.anInt1312 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(B)I")
	public final int method815() {
		@Pc(12) int local12 = this.aByteArray6[this.anInt1312] & 0xFF;
		return local12 < 128 ? this.method773() - 64 : this.method816() + -49152;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)I")
	public final int method816() {
		this.anInt1312 += 2;
		return (this.aByteArray6[this.anInt1312 - 1] & 0xFF) + ((this.aByteArray6[this.anInt1312 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)V")
	public final void method817(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1312 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(IB)V")
	public final void method819(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "(II)V")
	public final void method820(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 24);
		this.aByteArray6[this.anInt1312++] = (byte) arg0;
		this.aByteArray6[this.anInt1312++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([BIZI)V")
	public final void method821(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(13) int local13 = arg1 - 1; local13 >= 0; local13--) {
			arg0[local13] = this.aByteArray6[this.anInt1312++];
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(BI)V")
	public final void method822(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method819(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method786(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "(I)I")
	public final int method823() {
		this.anInt1312 += 2;
		@Pc(29) int local29 = (this.aByteArray6[this.anInt1312 - 2] - 128 & 0xFF) + ((this.aByteArray6[this.anInt1312 - 1] & 0xFF) << 8);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[BIZ)V")
	public final void method824(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray6[this.anInt1312++] = arg0[local7];
		}
	}
}
