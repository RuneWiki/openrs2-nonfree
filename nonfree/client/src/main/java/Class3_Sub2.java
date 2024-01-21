import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!b", name = "pb", descriptor = "[I")
	public static int[] anIntArray27 = new int[99];

	@OriginalMember(owner = "client!b", name = "Ob", descriptor = "I")
	public int anInt413 = 0;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "[B")
	public byte[] aByteArray7;

	static {
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < 99; local33++) {
			@Pc(38) int local38 = local33 + 1;
			@Pc(51) int local51 = (int) (Math.pow(2.0D, (double) local38 / 7.0D) * 300.0D + (double) local38);
			local31 += local51;
			anIntArray27[local33] = local31 / 4;
		}
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2(@OriginalArg(0) int arg0) {
		this.aByteArray7 = Static95.method1670(arg0);
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B)V")
	public Class3_Sub2(@OriginalArg(0) byte[] arg0) {
		this.aByteArray7 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
	public final void method262(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) arg0;
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)B")
	public final byte method263() {
		return (byte) (this.aByteArray7[this.anInt413++] - 128);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)I")
	public final int method264() {
		this.anInt413 += 3;
		return (this.aByteArray7[this.anInt413 - 1] & 0xFF) + ((this.aByteArray7[this.anInt413 - 2] & 0xFF) << 8) + ((this.aByteArray7[this.anInt413 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)B")
	public final byte method265() {
		return this.aByteArray7[this.anInt413++];
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)J")
	public final long method266() {
		@Pc(10) long local10 = (long) this.method278() & 0xFFFFFFFFL;
		@Pc(17) long local17 = (long) this.method278() & 0xFFFFFFFFL;
		return local17 + (local10 << 32);
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)I")
	public final int method267() {
		this.anInt413 += 4;
		return ((this.aByteArray7[this.anInt413 - 1] & 0xFF) << 8) + ((this.aByteArray7[this.anInt413 - 4] & 0xFF) << 16) + ((this.aByteArray7[-3 + this.anInt413] & 0xFF) << 24) + (this.aByteArray7[this.anInt413 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(B)B")
	public final byte method268() {
		return (byte) -this.aByteArray7[this.anInt413++];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)I")
	public final int method269() {
		@Pc(12) int local12 = this.aByteArray7[this.anInt413] & 0xFF;
		return local12 >= 128 ? this.method276() - 49152 : this.method270() + -64;
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(B)I")
	public final int method270() {
		return this.aByteArray7[this.anInt413++] & 0xFF;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[II)V")
	public final void method271(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt413;
		this.anInt413 = 5;
		@Pc(23) int local23 = (arg0 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(29) int local29 = -957401312;
			@Pc(33) int local33 = this.method278();
			@Pc(37) int local37 = this.method278();
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local37 -= (local33 >>> 5 ^ local33 << 4) + local33 ^ local29 - -arg1[local29 >>> 11 & 0x76E00003];
				local29 -= -1640531527;
				local33 -= local37 + (local37 >>> 5 ^ local37 << 4) ^ local29 - -arg1[local29 & 0x3];
			}
			this.anInt413 -= 8;
			this.method280(local33);
			this.method280(local37);
		}
		this.anInt413 = local8;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BII[B)V")
	public final void method272(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray7[this.anInt413++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
	public final int method273(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = Static28.method575(this.aByteArray7, this.anInt413, arg0);
		this.method280(local11);
		return local11;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(BI)V")
	public final void method274(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) arg0;
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(BI)V")
	public final void method275(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt413 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(I)I")
	public final int method276() {
		this.anInt413 += 2;
		return ((this.aByteArray7[this.anInt413 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt413 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
	public final void method277(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method303(arg0 >>> 28 | 0x80);
					}
					this.method303(arg0 >>> 21 | 0x80);
				}
				this.method303(arg0 >>> 14 | 0x80);
			}
			this.method303(arg0 >>> 7 | 0x80);
		}
		this.method303(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)I")
	public final int method278() {
		this.anInt413 += 4;
		return (this.aByteArray7[this.anInt413 - 1] & 0xFF) + ((this.aByteArray7[this.anInt413 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt413 + -4] & 0xFF) << 24) + ((this.aByteArray7[this.anInt413 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III[B)V")
	public final void method279(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = arg0 - 1; local7 >= 0; local7--) {
			arg1[local7] = (byte) (this.aByteArray7[this.anInt413++] - 128);
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(BI)V")
	public final void method280(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt413++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(I)I")
	public final int method281() {
		this.anInt413 += 2;
		@Pc(36) int local36 = (this.aByteArray7[this.anInt413 - 2] & 0xFF) + ((this.aByteArray7[this.anInt413 - 1] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V")
	public final void method282(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt413++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)I")
	public final int method283() {
		return this.aByteArray7[this.anInt413++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "(I)I")
	public final int method284() {
		this.anInt413 += 2;
		return (this.aByteArray7[this.anInt413 - 1] - 128 & 0xFF) + ((this.aByteArray7[this.anInt413 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V")
	public final void method285(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (arg0 + 128);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(B)B")
	public final byte method286() {
		return (byte) (128 - this.aByteArray7[this.anInt413++]);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[BB)V")
	public final void method288(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(19) int local19 = arg0 - 1; local19 >= 0; local19--) {
			arg1[local19] = this.aByteArray7[this.anInt413++];
		}
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(BI)V")
	public final void method289(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt413++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(BI)V")
	public final void method290(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "(I)I")
	public final int method291() {
		@Pc(12) byte local12 = this.aByteArray7[this.anInt413++];
		@Pc(14) int local14 = 0;
		while (local12 < 0) {
			local14 = (local12 & 0x7F | local14) << 7;
			local12 = this.aByteArray7[this.anInt413++];
		}
		return local12 | local14;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(II)V")
	public final void method292(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!oa;Z)V")
	public final void method293(@OriginalArg(0) Class56 arg0) {
		this.anInt413 += arg0.method1450(this.aByteArray7, this.anInt413, arg0.method1426());
		this.aByteArray7[this.anInt413++] = 0;
	}

	@OriginalMember(owner = "client!b", name = "l", descriptor = "(I)I")
	public final int method294() {
		return -this.aByteArray7[this.anInt413++] & 0xFF;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(II)V")
	public final void method295(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(II)V")
	public final void method297(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt413++] = (byte) arg0;
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!b", name = "n", descriptor = "(I)I")
	public final int method298() {
		this.anInt413 += 4;
		return (this.aByteArray7[this.anInt413 - 3] & 0xFF) + ((this.aByteArray7[this.anInt413 - 4] & 0xFF) << 8) + ((this.aByteArray7[-2 + this.anInt413] & 0xFF) << 24) + ((this.aByteArray7[this.anInt413 - 1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!b", name = "o", descriptor = "(I)I")
	public final int method299() {
		this.anInt413 += 2;
		return (this.aByteArray7[this.anInt413 - 2] - 128 & 0xFF) + ((this.aByteArray7[this.anInt413 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZJ)V")
	public final void method300(@OriginalArg(1) long arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 56);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 48);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 40);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 32);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt413++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "p", descriptor = "(I)Lclient!oa;")
	public final Class56 method301() {
		@Pc(13) int local13 = this.anInt413;
		while (this.aByteArray7[this.anInt413++] != 0) {
		}
		return Static127.method2041(this.anInt413 - local13 - 1, local13, this.aByteArray7);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
	public final void method303(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IB)V")
	public final void method304(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method303(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method289(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II[BI)V")
	public final void method305(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			arg0[local15] = this.aByteArray7[this.anInt413++];
		}
	}

	@OriginalMember(owner = "client!b", name = "q", descriptor = "(I)I")
	public final int method306() {
		return 128 - this.aByteArray7[this.anInt413++] & 0xFF;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method307(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(8) int local8 = this.anInt413;
		@Pc(15) byte[] local15 = new byte[local8];
		this.anInt413 = 0;
		this.method305(local15, local8);
		@Pc(29) BigInteger local29 = new BigInteger(local15);
		@Pc(34) BigInteger local34 = local29.modPow(arg0, arg1);
		@Pc(37) byte[] local37 = local34.toByteArray();
		this.anInt413 = 0;
		this.method303(local37.length);
		this.method272(local37.length, local37);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(ZI)V")
	public final void method308(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(II)V")
	public final void method309(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt413++] = (byte) arg0;
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt413++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(B)I")
	public final int method310() {
		this.anInt413 += 4;
		return ((this.aByteArray7[this.anInt413 - 3] & 0xFF) << 8) + (((this.aByteArray7[this.anInt413 - 1] & 0xFF) << 24) + (this.aByteArray7[this.anInt413 - 2] << 16 & 0xFF0000) + (this.aByteArray7[this.anInt413 + -4] & 0xFF));
	}

	@OriginalMember(owner = "client!b", name = "r", descriptor = "(I)I")
	public final int method311() {
		@Pc(16) int local16 = this.aByteArray7[this.anInt413] & 0xFF;
		return local16 < 128 ? this.method270() : this.method276() - 32768;
	}

	@OriginalMember(owner = "client!b", name = "s", descriptor = "(I)I")
	public final int method312() {
		this.anInt413 += 2;
		return ((this.aByteArray7[this.anInt413 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt413 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(ZI)V")
	public final void method313(@OriginalArg(1) int arg0) {
		this.aByteArray7[this.anInt413 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt413 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt413 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt413 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)V")
	public final void method314(@OriginalArg(1) long arg0) {
		this.method309((int) (arg0 >> 32));
		this.method309((int) arg0);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(Z)I")
	public final int method315() {
		this.anInt413 += 2;
		@Pc(36) int local36 = (this.aByteArray7[this.anInt413 - 1] & 0xFF) + ((this.aByteArray7[this.anInt413 - 2] & 0xFF) << 8);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}
}
