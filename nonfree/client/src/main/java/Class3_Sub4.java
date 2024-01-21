import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	public int anInt627 = 0;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4(@OriginalArg(0) int arg0) {
		this.aByteArray4 = Static13.method216(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray4 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)B")
	public final byte method412() {
		return (byte) (128 - this.aByteArray4[this.anInt627++]);
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)I")
	public final int method413() {
		this.anInt627 += 2;
		@Pc(33) int local33 = (this.aByteArray4[this.anInt627 - 1] - 128 & 0xFF) + ((this.aByteArray4[this.anInt627 - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)I")
	public final int method414() {
		this.anInt627 += 2;
		return (this.aByteArray4[this.anInt627 - 1] - 128 & 0xFF) + ((this.aByteArray4[this.anInt627 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)I")
	public final int method415() {
		this.anInt627 += 4;
		return (this.aByteArray4[this.anInt627 - 3] & 0xFF) + (((this.aByteArray4[this.anInt627 - 2] & 0xFF) << 24) + ((this.aByteArray4[this.anInt627 - 1] & 0xFF) << 16) + ((this.aByteArray4[this.anInt627 + -4] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)Lclient!ad;")
	public final Class4 method417() {
		@Pc(12) int local12 = this.anInt627;
		while (this.aByteArray4[this.anInt627++] != 0) {
		}
		return Static78.method274(local12, this.anInt627 - local12 - 1, this.aByteArray4);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[B)V")
	public final void method418(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray4[this.anInt627++] - 128);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)I")
	public final int method419() {
		this.anInt627 += 4;
		return (this.aByteArray4[this.anInt627 - 4] & 0xFF) + ((this.aByteArray4[this.anInt627 - 1] & 0xFF) << 24) + ((this.aByteArray4[this.anInt627 + -2] & 0xFF) << 16) + ((this.aByteArray4[this.anInt627 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method420(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt627;
		this.anInt627 = 0;
		@Pc(17) byte[] local17 = new byte[local6];
		this.method429(local6, local17);
		@Pc(28) BigInteger local28 = new BigInteger(local17);
		@Pc(33) BigInteger local33 = local28.modPow(arg1, arg0);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt627 = 0;
		this.method423(local36.length);
		this.method427(local36.length, local36);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)I")
	public final int method421() {
		return -this.aByteArray4[this.anInt627++] & 0xFF;
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)I")
	public final int method422() {
		this.anInt627 += 2;
		@Pc(39) int local39 = ((this.aByteArray4[this.anInt627 - 1] & 0xFF) << 8) + (this.aByteArray4[this.anInt627 - 2] - 128 & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public final void method423(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
	public final void method424(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt627++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
	public final void method425(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (arg0 + 128);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 579867304);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
	public final void method426(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[BB)V")
	public final void method427(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			this.aByteArray4[this.anInt627++] = arg1[local10];
		}
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)J")
	public final long method428() {
		@Pc(18) long local18 = (long) this.method438() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method438() & 0xFFFFFFFFL;
		return (local18 << 32) + local25;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBI[B)V")
	public final void method429(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray4[this.anInt627++];
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB[I)V")
	public final void method430(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(13) int local13 = this.anInt627;
		@Pc(20) int local20 = (arg0 - 5) / 8;
		this.anInt627 = 5;
		for (@Pc(25) int local25 = 0; local25 < local20; local25++) {
			@Pc(31) int local31 = this.method438();
			@Pc(35) int local35 = this.method438();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= local31 + (local31 << 4 ^ local31 >>> 5) ^ local37 + arg1[local37 >>> 11 & 0x3];
				local37 -= -1640531527;
				local31 -= local35 + (local35 >>> 5 ^ local35 << 4) ^ local37 + arg1[local37 & 0x3];
			}
			this.anInt627 -= 8;
			this.method424(local31);
			this.method424(local35);
		}
		this.anInt627 = local13;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)V")
	public final void method431(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)I")
	public final int method432() {
		this.anInt627 += 4;
		return (this.aByteArray4[this.anInt627 - 2] & 0xFF) + ((this.aByteArray4[this.anInt627 - 1] & 0xFF) << 8) + ((this.aByteArray4[this.anInt627 + -4] & 0xFF) << 16) + ((this.aByteArray4[this.anInt627 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(II)V")
	public final void method433(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt627++] = (byte) arg0;
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "(I)B")
	public final byte method434() {
		return this.aByteArray4[this.anInt627++];
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(II)V")
	public final void method435(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "(I)I")
	public final int method436() {
		@Pc(16) int local16 = this.aByteArray4[this.anInt627] & 0xFF;
		return local16 < 128 ? this.method446() - 64 : this.method459() - 49152;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)V")
	public final void method437(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt627 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)I")
	public final int method438() {
		this.anInt627 += 4;
		return ((this.aByteArray4[this.anInt627 - 2] & 0xFF) << 8) + ((this.aByteArray4[this.anInt627 - 3] & 0xFF) << 16) + ((this.aByteArray4[this.anInt627 - 4] & 0xFF) << 24) + (this.aByteArray4[this.anInt627 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "(I)I")
	public final int method439() {
		this.anInt627 += 2;
		return ((this.aByteArray4[this.anInt627 - 1] & 0xFF) << 8) + (this.aByteArray4[this.anInt627 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(B)I")
	public final int method440() {
		@Pc(14) int local14 = 0;
		@Pc(25) byte local25;
		for (local25 = this.aByteArray4[this.anInt627++]; local25 < 0; local25 = this.aByteArray4[this.anInt627++]) {
			local14 = (local25 & 0x7F | local14) << 7;
		}
		return local14 | local25;
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(II)V")
	public final void method441(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt627++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(II)V")
	public final void method442(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt627++] = (byte) arg0;
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(B)I")
	public final int method444() {
		@Pc(16) int local16 = this.aByteArray4[this.anInt627] & 0xFF;
		return local16 < 128 ? this.method446() : this.method459() - 32768;
	}

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "(I)I")
	public final int method445() {
		this.anInt627 += 2;
		@Pc(38) int local38 = (this.aByteArray4[this.anInt627 - 1] & 0xFF) + ((this.aByteArray4[this.anInt627 - 2] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "(I)I")
	public final int method446() {
		return this.aByteArray4[this.anInt627++] & 0xFF;
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "(II)I")
	public final int method447(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = Static62.method1079(arg0, this.aByteArray4, this.anInt627);
		this.method424(local19);
		return local19;
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(II)V")
	public final void method448(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method423(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method455(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "(B)I")
	public final int method449() {
		return this.aByteArray4[this.anInt627++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "(II)V")
	public final void method450(@OriginalArg(1) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) arg0;
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(B)I")
	public final int method451() {
		return 128 - this.aByteArray4[this.anInt627++] & 0xFF;
	}

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "(I)I")
	public final int method452() {
		this.anInt627 += 2;
		return ((this.aByteArray4[this.anInt627 - 1] & 0xFF) << 8) + (this.aByteArray4[this.anInt627 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLclient!ad;)V")
	public final void method453(@OriginalArg(1) Class4 arg0) {
		this.anInt627 += arg0.method145(this.anInt627, this.aByteArray4, arg0.method118());
		this.aByteArray4[this.anInt627++] = 0;
	}

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "(B)I")
	public final int method454() {
		this.anInt627 += 2;
		@Pc(36) int local36 = ((this.aByteArray4[this.anInt627 - 1] & 0xFF) << 8) + (this.aByteArray4[this.anInt627 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
	public final void method455(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt627++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(JI)V")
	public final void method456(@OriginalArg(0) long arg0) {
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 56);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 48);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 40);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 32);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> -176768048);
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt627++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "(II)V")
	public final void method457(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt627++] = (byte) arg0;
		this.aByteArray4[this.anInt627++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "(I)I")
	public final int method458() {
		this.anInt627 += 3;
		return (this.aByteArray4[this.anInt627 - 1] & 0xFF) + ((this.aByteArray4[this.anInt627 - 3] & 0xFF) << 16) + ((this.aByteArray4[this.anInt627 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "(B)I")
	public final int method459() {
		this.anInt627 += 2;
		return ((this.aByteArray4[this.anInt627 - 2] & 0xFF) << 8) + (this.aByteArray4[this.anInt627 - 1] & 0xFF);
	}
}
