import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
	public int anInt952 = 0;

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	public Class2_Sub6(@OriginalArg(0) int arg0) {
		this.aByteArray11 = Static78.method1432(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray11 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(JI)V")
	public final void method626(@OriginalArg(0) long arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 56);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 48);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 40);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 32);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 24);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)I")
	public final int method627() {
		this.anInt952 += 2;
		return ((this.aByteArray11[this.anInt952 - 2] & 0xFF) << 8) + (this.aByteArray11[this.anInt952 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)I")
	public final int method628() {
		return this.aByteArray11[this.anInt952++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
	public final int method629() {
		this.anInt952 += 4;
		return ((this.aByteArray11[this.anInt952 - 3] & 0xFF) << 16) + ((this.aByteArray11[this.anInt952 - 4] & 0xFF) << 24) + ((this.aByteArray11[this.anInt952 - 2] & 0xFF) << 8) + (this.aByteArray11[this.anInt952 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
	public final void method630(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) arg0;
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public final void method631(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)I")
	public final int method632() {
		this.anInt952 += 2;
		return ((this.aByteArray11[this.anInt952 - 1] & 0xFF) << 8) + (this.aByteArray11[this.anInt952 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)I")
	public final int method633() {
		this.anInt952 += 2;
		return ((this.aByteArray11[this.anInt952 - 1] & 0xFF) << 8) + (this.aByteArray11[this.anInt952 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[BII)V")
	public final void method635(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = this.aByteArray11[this.anInt952++];
		}
	}

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "(I)I")
	public final int method636() {
		@Pc(8) int local8 = 0;
		@Pc(19) byte local19;
		for (local19 = this.aByteArray11[this.anInt952++]; local19 < 0; local19 = this.aByteArray11[this.anInt952++]) {
			local8 = (local8 | local19 & 0x7F) << 7;
		}
		return local19 | local8;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
	public final void method637(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
	public final void method638(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) arg0;
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "(I)I")
	public final int method639() {
		this.anInt952 += 3;
		return (this.aByteArray11[this.anInt952 - 1] & 0xFF) + ((this.aByteArray11[this.anInt952 - 3] & 0xFF) << 16) + ((this.aByteArray11[this.anInt952 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II[II)V")
	public final void method640(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = (arg0 - 5) / 8;
		@Pc(15) int local15 = this.anInt952;
		this.anInt952 = 5;
		for (@Pc(25) int local25 = 0; local25 < local12; local25++) {
			@Pc(31) int local31 = this.method629();
			@Pc(35) int local35 = -957401312;
			@Pc(41) int local41 = this.method629();
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local41 -= local35 + arg1[local35 >>> 11 & 0x7E800003] ^ local31 + (local31 << 4 ^ local31 >>> 5);
				local35 -= -1640531527;
				local31 -= local41 + (local41 << 4 ^ local41 >>> 5) ^ arg1[local35 & 0x3] + local35;
			}
			this.anInt952 -= 8;
			this.method666(local31);
			this.method666(local41);
		}
		this.anInt952 = local15;
	}

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "(I)I")
	public final int method641() {
		this.anInt952 += 4;
		return ((this.aByteArray11[this.anInt952 - 3] & 0xFF) << 8) + ((this.aByteArray11[this.anInt952 - 2] & 0xFF) << 16) + ((this.aByteArray11[this.anInt952 + -1] & 0xFF) << 24) + (this.aByteArray11[this.anInt952 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(BI)V")
	public final void method642(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 24);
		this.aByteArray11[this.anInt952++] = (byte) arg0;
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(II)V")
	public final void method643(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[BII)V")
	public final void method644(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = arg1 - 1; local15 >= 0; local15--) {
			arg0[local15] = this.aByteArray11[this.anInt952++];
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)B")
	public final byte method645() {
		return (byte) -this.aByteArray11[this.anInt952++];
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)I")
	public final int method646() {
		@Pc(16) int local16 = this.aByteArray11[this.anInt952] & 0xFF;
		return local16 >= 128 ? this.method627() - 32768 : this.method665();
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)I")
	public final int method647() {
		this.anInt952 += 2;
		@Pc(29) int local29 = ((this.aByteArray11[this.anInt952 - 2] & 0xFF) << 8) + (this.aByteArray11[this.anInt952 - 1] - 128 & 0xFF);
		if (local29 > 32767) {
			local29 -= 65536;
		}
		return local29;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
	public final void method648(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(II)V")
	public final void method649(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "(I)I")
	public final int method650() {
		this.anInt952 += 2;
		@Pc(33) int local33 = (this.aByteArray11[this.anInt952 - 2] - 128 & 0xFF) + ((this.aByteArray11[this.anInt952 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(II)V")
	public final void method651(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (arg0 + 128);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "(II)V")
	public final void method652(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method637(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method648(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "(I)I")
	public final int method653() {
		this.anInt952 += 2;
		@Pc(39) int local39 = ((this.aByteArray11[this.anInt952 - 1] & 0xFF) << 8) + (this.aByteArray11[this.anInt952 - 2] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!lc;B)V")
	public final void method654(@OriginalArg(0) Class31 arg0) {
		this.anInt952 += arg0.method1231(this.aByteArray11, arg0.method1223(), this.anInt952);
		this.aByteArray11[this.anInt952++] = 0;
	}

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "(I)I")
	public final int method656() {
		return -this.aByteArray11[this.anInt952++] & 0xFF;
	}

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "(I)I")
	public final int method657() {
		this.anInt952 += 2;
		@Pc(31) int local31 = (this.aByteArray11[this.anInt952 - 1] & 0xFF) + ((this.aByteArray11[this.anInt952 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)V")
	public final void method658(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(BI)V")
	public final void method659(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt952 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "(I)I")
	public final int method660() {
		this.anInt952 += 4;
		return (this.aByteArray11[this.anInt952 - 3] & 0xFF) + ((this.aByteArray11[this.anInt952 - 1] & 0xFF) << 16) + ((this.aByteArray11[this.anInt952 - 2] & 0xFF) << 24) + ((this.aByteArray11[this.anInt952 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)B")
	public final byte method662() {
		return (byte) (128 - this.aByteArray11[this.anInt952++]);
	}

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "(I)I")
	public final int method663() {
		this.anInt952 += 4;
		return ((this.aByteArray11[this.anInt952 - 3] & 0xFF) << 24) - (-((this.aByteArray11[this.anInt952 - 4] & 0xFF) << 16) - (this.aByteArray11[this.anInt952 - 1] << 8 & 0xFF00) - (this.aByteArray11[this.anInt952 + -2] & 0xFF));
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)I")
	public final int method664() {
		@Pc(17) int local17 = this.aByteArray11[this.anInt952] & 0xFF;
		return local17 < 128 ? this.method665() - 64 : this.method627() + -49152;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(B)I")
	public final int method665() {
		return this.aByteArray11[this.anInt952++] & 0xFF;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IB)V")
	public final void method666(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 24);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "(I)I")
	public final int method667() {
		this.anInt952 += 2;
		return ((this.aByteArray11[this.anInt952 - 2] & 0xFF) << 8) + (this.aByteArray11[this.anInt952 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "(II)V")
	public final void method668(@OriginalArg(0) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt952++] = (byte) arg0;
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> -1091967272);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public final void method669(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt952;
		@Pc(9) byte[] local9 = new byte[local6];
		this.anInt952 = 0;
		this.method635(local9, local6);
		@Pc(27) BigInteger local27 = new BigInteger(local9);
		@Pc(32) BigInteger local32 = local27.modPow(arg1, arg0);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.anInt952 = 0;
		this.method637(local35.length);
		this.method672(local35.length, local35);
	}

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "(I)Lclient!lc;")
	public final Class31 method670() {
		@Pc(11) int local11 = this.anInt952;
		while (this.aByteArray11[this.anInt952++] != 0) {
		}
		return Static49.method1697(this.anInt952 - local11 - 1, this.aByteArray11, local11);
	}

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "(I)I")
	public final int method671() {
		return 128 - this.aByteArray11[this.anInt952++] & 0xFF;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)V")
	public final void method672(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray11[this.anInt952++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(Z)B")
	public final byte method673() {
		return this.aByteArray11[this.anInt952++];
	}

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "(I)J")
	public final long method674() {
		@Pc(17) long local17 = (long) this.method629() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method629() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "(II)V")
	public final void method677(@OriginalArg(1) int arg0) {
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 16);
		this.aByteArray11[this.anInt952++] = (byte) (arg0 >> 8);
		this.aByteArray11[this.anInt952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "(II)I")
	public final int method678(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static13.method379(arg0, this.aByteArray11, this.anInt952);
		this.method666(local7);
		return local7;
	}
}
