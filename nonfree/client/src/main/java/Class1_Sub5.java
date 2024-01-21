import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5(@OriginalArg(0) int arg0) {
		this.aByteArray13 = Static108.method1744(arg0);
		this.anInt792 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray13 = arg0;
		this.anInt792 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I")
	public final int method630() {
		return -this.aByteArray13[this.anInt792++] & 0xFF;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public final void method631(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) arg0;
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
	public final void method633(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt792++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)B")
	public final byte method634() {
		return (byte) -this.aByteArray13[this.anInt792++];
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
	public final void method635(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt792++] = (byte) arg0;
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)I")
	public final int method636() {
		@Pc(16) int local16 = this.aByteArray13[this.anInt792] & 0xFF;
		return local16 < 128 ? this.method672() - 64 : this.method651() + -49152;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!fc;Z)V")
	public final void method637(@OriginalArg(0) Class25 arg0) {
		this.anInt792 += arg0.method771(arg0.method762(), this.anInt792, this.aByteArray13);
		this.aByteArray13[this.anInt792++] = 0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
	public final void method638(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt792 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)B")
	public final byte method639() {
		return (byte) (this.aByteArray13[this.anInt792++] - 128);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(JB)V")
	public final void method640(@OriginalArg(0) long arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 56);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 48);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 40);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 32);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt792++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)I")
	public final int method641() {
		this.anInt792 += 2;
		@Pc(34) int local34 = ((this.aByteArray13[this.anInt792 - 2] & 0xFF) << 8) + (this.aByteArray13[this.anInt792 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)I")
	public final int method642() {
		this.anInt792 += 2;
		return ((this.aByteArray13[this.anInt792 - 2] & 0xFF) << 8) + (this.aByteArray13[this.anInt792 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)B")
	public final byte method643() {
		return this.aByteArray13[this.anInt792++];
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(B)I")
	public final int method644() {
		@Pc(14) int local14 = 0;
		@Pc(25) byte local25;
		for (local25 = this.aByteArray13[this.anInt792++]; local25 < 0; local25 = this.aByteArray13[this.anInt792++]) {
			local14 = (local14 | local25 & 0x7F) << 7;
		}
		return local14 | local25;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)V")
	public final void method645(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) arg0;
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IB)V")
	public final void method647(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (arg0 + 128);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)I")
	public final int method648() {
		return this.aByteArray13[this.anInt792++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IJ)V")
	public final void method649(@OriginalArg(1) long arg0) {
		this.method635((int) (arg0 >> 32));
		this.method635((int) arg0);
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(II)V")
	public final void method650(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(I)I")
	public final int method651() {
		this.anInt792 += 2;
		return (this.aByteArray13[this.anInt792 - 1] & 0xFF) + ((this.aByteArray13[this.anInt792 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(II)V")
	public final void method652(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method676(arg0 >>> 28 | 0x80);
					}
					this.method676(arg0 >>> 21 | 0x80);
				}
				this.method676(arg0 >>> 14 | 0x80);
			}
			this.method676(arg0 >>> 7 | 0x80);
		}
		this.method676(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(II)V")
	public final void method653(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt792++] = (byte) arg0;
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(I)Lclient!fc;")
	public final Class25 method654() {
		@Pc(6) int local6 = this.anInt792;
		while (this.aByteArray13[this.anInt792++] != 0) {
		}
		return Static26.method598(local6, this.aByteArray13, this.anInt792 - local6 - 1);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB[BI)V")
	public final void method655(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray13[this.anInt792++];
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([IIII)V")
	public final void method656(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt792;
		@Pc(15) int local15 = (arg1 - 5) / 8;
		this.anInt792 = 5;
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			@Pc(31) int local31 = this.method663();
			@Pc(37) int local37 = this.method663();
			@Pc(39) int local39 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local37 -= (local31 << 4 ^ local31 >>> 5) + local31 ^ local39 - -arg0[local39 >>> 11 & 0xF3800003];
				local39 -= -1640531527;
				local31 -= local39 + arg0[local39 & 0x3] ^ (local37 >>> 5 ^ local37 << 4) + local37;
			}
			this.anInt792 -= 8;
			this.method633(local31);
			this.method633(local37);
		}
		this.anInt792 = local8;
	}

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "(I)I")
	public final int method657() {
		this.anInt792 += 4;
		return ((this.aByteArray13[this.anInt792 - 3] & 0xFF) << 24) + ((this.aByteArray13[this.anInt792 - 4] << 16 & 0xFF0000) + (this.aByteArray13[this.anInt792 - 1] << 8 & 0xFF00)) + (this.aByteArray13[this.anInt792 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(II)I")
	public final int method658(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static38.method877(this.anInt792, this.aByteArray13, arg0);
		this.method633(local11);
		return local11;
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(II)V")
	public final void method659(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt792++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
	public final int method660() {
		this.anInt792 += 3;
		return ((this.aByteArray13[this.anInt792 - 3] & 0xFF) << 16) - (-((this.aByteArray13[this.anInt792 - 2] & 0xFF) << 8) - (this.aByteArray13[this.anInt792 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "(I)I")
	public final int method661() {
		this.anInt792 += 4;
		return (this.aByteArray13[this.anInt792 - 4] & 0xFF) + ((this.aByteArray13[this.anInt792 - 3] & 0xFF) << 8) + ((this.aByteArray13[this.anInt792 - 1] & 0xFF) << 24) + ((this.aByteArray13[this.anInt792 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III[B)V")
	public final void method662(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			this.aByteArray13[this.anInt792++] = arg1[local11];
		}
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(B)I")
	public final int method663() {
		this.anInt792 += 4;
		return ((this.aByteArray13[this.anInt792 - 2] & 0xFF) << 8) + ((this.aByteArray13[this.anInt792 - 4] & 0xFF) << 24) + ((this.aByteArray13[this.anInt792 + -3] & 0xFF) << 16) + (this.aByteArray13[this.anInt792 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
	public final void method664(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method676(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method675(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(B)I")
	public final int method665() {
		this.anInt792 += 2;
		@Pc(39) int local39 = (this.aByteArray13[this.anInt792 - 2] & 0xFF) + ((this.aByteArray13[this.anInt792 - 1] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(II)V")
	public final void method666(@OriginalArg(1) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V")
	public final void method667(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "(I)I")
	public final int method668() {
		this.anInt792 += 2;
		@Pc(31) int local31 = (this.aByteArray13[this.anInt792 - 1] & 0xFF) + ((this.aByteArray13[this.anInt792 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(B)J")
	public final long method669() {
		@Pc(6) long local6 = (long) this.method663() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method663() & 0xFFFFFFFFL;
		return local25 + (local6 << 32);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)I")
	public final int method670() {
		this.anInt792 += 2;
		return ((this.aByteArray13[this.anInt792 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt792 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(B)I")
	public final int method671() {
		return 128 - this.aByteArray13[this.anInt792++] & 0xFF;
	}

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "(B)I")
	public final int method672() {
		return this.aByteArray13[this.anInt792++] & 0xFF;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method673(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(2) int local2 = this.anInt792;
		this.anInt792 = 0;
		@Pc(16) byte[] local16 = new byte[local2];
		this.method655(local16, local2);
		@Pc(27) BigInteger local27 = new BigInteger(local16);
		@Pc(32) BigInteger local32 = local27.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt792 = 0;
		this.method676(local35.length);
		this.method662(local35.length, local35);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(Z)I")
	public final int method674() {
		@Pc(16) int local16 = this.aByteArray13[this.anInt792] & 0xFF;
		return local16 < 128 ? this.method672() : this.method651() - 32768;
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(II)V")
	public final void method675(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt792++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(IB)V")
	public final void method676(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt792++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "(B)I")
	public final int method677() {
		this.anInt792 += 2;
		return (this.aByteArray13[this.anInt792 - 2] & 0xFF) + ((this.aByteArray13[this.anInt792 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "(I)I")
	public final int method679() {
		this.anInt792 += 2;
		@Pc(38) int local38 = (this.aByteArray13[this.anInt792 - 2] - 128 & 0xFF) + ((this.aByteArray13[this.anInt792 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "(I)B")
	public final byte method680() {
		return (byte) (128 - this.aByteArray13[this.anInt792++]);
	}

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "(II)V")
	public final void method681(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt792 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt792 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt792 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt792 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "(I)I")
	public final int method682() {
		this.anInt792 += 4;
		return (this.aByteArray13[this.anInt792 - 3] & 0xFF) + ((this.aByteArray13[this.anInt792 - 1] & 0xFF) << 16) + ((this.aByteArray13[this.anInt792 + -2] & 0xFF) << 24) + ((this.aByteArray13[this.anInt792 + -4] & 0xFF) << 8);
	}
}
