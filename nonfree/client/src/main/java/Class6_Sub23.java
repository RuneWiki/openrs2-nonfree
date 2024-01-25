import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public class Class6_Sub23 extends Class6 {

	@OriginalMember(owner = "client!gga", name = "X", descriptor = "[C")
	private static final char[] aCharArray9 = new char[64];

	@OriginalMember(owner = "client!gga", name = "I", descriptor = "I")
	public int anInt9901;

	@OriginalMember(owner = "client!gga", name = "ab", descriptor = "[B")
	public byte[] aByteArray101;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray9[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray9[local18] = (char) (local18 + 71);
		}
		for (@Pc(32) int local32 = 52; local32 < 62; local32++) {
			aCharArray9[local32] = (char) (local32 + 48 - 52);
		}
		aCharArray9[62] = '*';
		aCharArray9[63] = '-';
	}

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(I)V")
	public Class6_Sub23(@OriginalArg(0) int arg0) {
		this.anInt9901 = 0;
		this.aByteArray101 = Static90.method1508(arg0);
	}

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "([B)V")
	public Class6_Sub23(@OriginalArg(0) byte[] arg0) {
		this.aByteArray101 = arg0;
		this.anInt9901 = 0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)V")
	public final void method8335(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
	public final int method8336() {
		this.anInt9901 += 4;
		return ((this.aByteArray101[this.anInt9901 - 3] & 0xFF) << 8) + ((this.aByteArray101[this.anInt9901 - 2] & 0xFF) << 16) + ((this.aByteArray101[this.anInt9901 + -1] & 0xFF) << 24) + (this.aByteArray101[this.anInt9901 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)I")
	public final int method8337() {
		return 128 - this.aByteArray101[this.anInt9901++] & 0xFF;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZI)V")
	public final void method8338(@OriginalArg(1) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)I")
	public final int method8339() {
		this.anInt9901 += 2;
		@Pc(32) int local32 = ((this.aByteArray101[this.anInt9901 - 1] & 0xFF) << 8) + (this.aByteArray101[this.anInt9901 - 2] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "(I)I")
	public final int method8340() {
		this.anInt9901 += 3;
		@Pc(50) int local50 = (this.aByteArray101[this.anInt9901 - 1] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 2] & 0xFF) << 8) + ((this.aByteArray101[this.anInt9901 - 3] & 0xFF) << 16);
		if (local50 > 8388607) {
			local50 -= 16777216;
		}
		return local50;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)B")
	public final byte method8341() {
		return (byte) -this.aByteArray101[this.anInt9901++];
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)V")
	public final void method8342(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 + 128);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)I")
	public final int method8343() {
		return this.aByteArray101[this.anInt9901++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(Z)I")
	public final int method8344() {
		this.anInt9901 += 3;
		return (this.aByteArray101[this.anInt9901 - 1] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 3] & 0xFF) << 16) + ((this.aByteArray101[this.anInt9901 + -2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(II)V")
	public final void method8345(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method8366(arg0 >>> 28 | 0x80);
					}
					this.method8366(arg0 >>> 21 | 0x80);
				}
				this.method8366(arg0 >>> 14 | 0x80);
			}
			this.method8366(arg0 >>> 7 | 0x80);
		}
		this.method8366(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BI)V")
	public final void method8346(@OriginalArg(1) int arg0) {
		this.aByteArray101[this.anInt9901 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(II)V")
	public final void method8347(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "(I)I")
	public final int method8348() {
		this.anInt9901 += 4;
		return (this.aByteArray101[this.anInt9901 - 2] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 1] & 0xFF) << 8) + ((this.aByteArray101[this.anInt9901 + -4] & 0xFF) << 16) + ((this.aByteArray101[this.anInt9901 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(BI)V")
	public final void method8349(@OriginalArg(1) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "(I)B")
	public final byte method8350() {
		return (byte) (this.aByteArray101[this.anInt9901++] - 128);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IZ)J")
	public final long method8351(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(24) int local24 = local6 * 8;
		@Pc(31) long local31 = 0L;
		while (local24 >= 0) {
			local31 |= ((long) this.aByteArray101[this.anInt9901++] & 0xFFL) << local24;
			local24 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "(II)V")
	public final void method8352(@OriginalArg(1) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 24);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([BZII)V")
	public final void method8353(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			arg0[local10] = (byte) (this.aByteArray101[this.anInt9901++] - 128);
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)Ljava/lang/String;")
	public final String method8354() {
		@Pc(12) int local12 = this.anInt9901;
		while (this.aByteArray101[this.anInt9901++] != 0) {
		}
		@Pc(31) int local31 = this.anInt9901 - local12 - 1;
		return local31 == 0 ? "" : Static232.method3397(local31, local12, this.aByteArray101);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(III[I)V")
	public final void method8355(@OriginalArg(0) int arg0, @OriginalArg(3) int[] arg1) {
		@Pc(8) int local8 = this.anInt9901;
		this.anInt9901 = 5;
		@Pc(23) int local23 = (arg0 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			@Pc(31) int local31 = this.method8369();
			@Pc(37) int local37 = this.method8369();
			@Pc(39) int local39 = -957401312;
			@Pc(43) int local43 = 32;
			while (local43-- > 0) {
				local37 -= (local31 >>> 5 ^ local31 << 4) + local31 ^ local39 - -arg1[local39 >>> 11 & 0x51400003];
				local39 -= -1640531527;
				local31 -= arg1[local39 & 0x3] + local39 ^ (local37 >>> 5 ^ local37 << 4) + local37;
			}
			this.anInt9901 -= 8;
			this.method8364(local31);
			this.method8364(local37);
		}
		this.anInt9901 = local8;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public final void method8356(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr2");
		}
		this.aByteArray101[this.anInt9901++] = 0;
		this.anInt9901 += Static101.method1663(arg0.length(), this.anInt9901, this.aByteArray101, arg0);
		this.aByteArray101[this.anInt9901++] = 0;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(IZ)V")
	public final void method8357(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 16);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B[BII)V")
	public final void method8358(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = arg1; local12 < arg2 + arg1; local12++) {
			this.aByteArray101[this.anInt9901++] = arg0[local12];
		}
	}

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "(B)Ljava/lang/String;")
	public final String method8359() {
		if (this.aByteArray101[this.anInt9901] == 0) {
			this.anInt9901++;
			return null;
		} else {
			return this.method8354();
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(III[I)V")
	public final void method8360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(8) int local8 = this.anInt9901;
		this.anInt9901 = arg0;
		@Pc(17) int local17 = (arg1 - arg0) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) int local25 = this.method8369();
			@Pc(31) int local31 = this.method8369();
			@Pc(33) int local33 = 0;
			@Pc(37) int local37 = 32;
			while (local37-- > 0) {
				local25 += local31 + (local31 << 4 ^ local31 >>> 5) ^ local33 + arg2[local33 & 0x3];
				local33 += -1640531527;
				local31 += local25 + (local25 >>> 5 ^ local25 << 4) ^ arg2[local33 >>> 11 & 0xDD000003] + local33;
			}
			this.anInt9901 -= 8;
			this.method8364(local25);
			this.method8364(local31);
		}
		this.anInt9901 = local8;
	}

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "(II)I")
	public final int method8361(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = Static229.method3320(this.anInt9901, this.aByteArray101, arg0);
		this.method8364(local17);
		return local17;
	}

	@OriginalMember(owner = "client!gga", name = "f", descriptor = "(II)V")
	public final void method8362(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "(I)I")
	public final int method8363() {
		this.anInt9901 += 2;
		return (this.aByteArray101[this.anInt9901 - 1] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "(II)V")
	public final void method8364(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 24);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 16);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "(B)I")
	public final int method8365() {
		this.anInt9901 += 2;
		return (this.aByteArray101[this.anInt9901 - 2] - 128 & 0xFF) + ((this.aByteArray101[this.anInt9901 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "(II)V")
	public final void method8366(@OriginalArg(1) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(Z)I")
	public final int method8367() {
		this.anInt9901 += 2;
		return (this.aByteArray101[this.anInt9901 - 1] - 128 & 0xFF) + ((this.aByteArray101[this.anInt9901 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gga", name = "k", descriptor = "(I)J")
	public final long method8368() {
		@Pc(15) long local15 = (long) this.method8380() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8380() & 0xFFFFFFFFL;
		return (local22 << 32) + local15;
	}

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "(I)I")
	public final int method8369() {
		this.anInt9901 += 4;
		return (this.aByteArray101[this.anInt9901 - 1] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 2] & 0xFF) << 8) + ((this.aByteArray101[this.anInt9901 + -4] & 0xFF) << 24) + ((this.aByteArray101[this.anInt9901 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method8371(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(13) int local13 = this.anInt9901;
		this.anInt9901 = 0;
		@Pc(19) byte[] local19 = new byte[local13];
		this.method8375(local13, local19, 0);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg0, arg1);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt9901 = 0;
		this.method8347(local38.length);
		this.method8358(local38, 0, local38.length);
	}

	@OriginalMember(owner = "client!gga", name = "n", descriptor = "(I)V")
	public final void method8372() {
		if (this.aByteArray101 != null) {
			Static90.method1510(this.aByteArray101);
		}
		this.aByteArray101 = null;
	}

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "(II)V")
	public final void method8373(@OriginalArg(1) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 16);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!gga", name = "o", descriptor = "(I)I")
	public final int method8374() {
		return this.aByteArray101[this.anInt9901++] & 0xFF;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[BII)V")
	public final void method8375(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = arg2; local13 < arg0 + arg2; local13++) {
			arg1[local13] = this.aByteArray101[this.anInt9901++];
		}
	}

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "(Z)Z")
	public final boolean method8376() {
		this.anInt9901 -= 4;
		@Pc(22) int local22 = Static229.method3320(this.anInt9901, this.aByteArray101, 0);
		@Pc(26) int local26 = this.method8369();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!gga", name = "p", descriptor = "(I)I")
	public final int method8377() {
		this.anInt9901 += 2;
		@Pc(33) int local33 = (this.aByteArray101[this.anInt9901 - 2] - 128 & 0xFF) + ((this.aByteArray101[this.anInt9901 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!gga", name = "j", descriptor = "(II)V")
	public final void method8378(@OriginalArg(1) int arg0) {
		this.aByteArray101[this.anInt9901 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray101[this.anInt9901 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray101[this.anInt9901 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray101[this.anInt9901 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gga", name = "q", descriptor = "(I)Ljava/lang/String;")
	public final String method8379() {
		@Pc(14) byte local14 = this.aByteArray101[this.anInt9901++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt9901;
		while (this.aByteArray101[this.anInt9901++] != 0) {
		}
		@Pc(47) int local47 = this.anInt9901 - local24 - 1;
		return local47 == 0 ? "" : Static232.method3397(local47, local24, this.aByteArray101);
	}

	@OriginalMember(owner = "client!gga", name = "r", descriptor = "(I)I")
	public final int method8380() {
		this.anInt9901 += 4;
		return (this.aByteArray101[this.anInt9901 - 4] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 3] & 0xFF) << 8) + ((this.aByteArray101[this.anInt9901 + -2] & 0xFF) << 16) + ((this.aByteArray101[this.anInt9901 + -1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "(Z)J")
	public final long method8381() {
		@Pc(15) long local15 = (long) this.method8369() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method8369() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!gga", name = "f", descriptor = "(B)J")
	public final long method8382() {
		@Pc(18) long local18 = (long) this.method8374() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.method8369() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}

	@OriginalMember(owner = "client!gga", name = "g", descriptor = "(B)I")
	public final int method8383() {
		@Pc(11) int local11 = this.aByteArray101[this.anInt9901] & 0xFF;
		return local11 >= 128 ? this.method8363() - 49152 : this.method8374() - 64;
	}

	@OriginalMember(owner = "client!gga", name = "s", descriptor = "(I)B")
	public final byte method8384() {
		return (byte) (128 - this.aByteArray101[this.anInt9901++]);
	}

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "(II)V")
	public final void method8386(@OriginalArg(1) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 16);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 24);
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(IB)V")
	public final void method8387(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 16);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
		this.aByteArray101[this.anInt9901++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IJI)V")
	public final void method8389(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local2 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray101[this.anInt9901++] = (byte) (int) (arg0 >> local27);
		}
	}

	@OriginalMember(owner = "client!gga", name = "u", descriptor = "(I)I")
	public final int method8390() {
		this.anInt9901 += 3;
		return (this.aByteArray101[this.anInt9901 - 2] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 1] & 0xFF) << 8) + ((this.aByteArray101[this.anInt9901 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!gga", name = "v", descriptor = "(I)B")
	public final byte method8391() {
		return this.aByteArray101[this.anInt9901++];
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(JI)V")
	public final void method8392(@OriginalArg(0) long arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (int) (arg0 >> 56);
		this.aByteArray101[this.anInt9901++] = (byte) (int) (arg0 >> 48);
		this.aByteArray101[this.anInt9901++] = (byte) (int) (arg0 >> 40);
		this.aByteArray101[this.anInt9901++] = (byte) (int) (arg0 >> 32);
		this.aByteArray101[this.anInt9901++] = (byte) (int) (arg0 >> 24);
		this.aByteArray101[this.anInt9901++] = (byte) (int) (arg0 >> 16);
		this.aByteArray101[this.anInt9901++] = (byte) (int) (arg0 >> 8);
		this.aByteArray101[this.anInt9901++] = (byte) (int) arg0;
	}

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "(B)I")
	public final int method8393() {
		this.anInt9901 += 4;
		return (this.aByteArray101[this.anInt9901 - 3] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 2] & 0xFF) << 24) + ((this.aByteArray101[this.anInt9901 + -1] & 0xFF) << 16) + ((this.aByteArray101[this.anInt9901 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "(IB)V")
	public final void method8394(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray101[this.anInt9901 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!gga", name = "w", descriptor = "(I)I")
	public final int method8395() {
		this.anInt9901 += 2;
		@Pc(31) int local31 = (this.aByteArray101[this.anInt9901 - 1] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "(IB)V")
	public final void method8396(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!gga", name = "i", descriptor = "(B)I")
	public final int method8397() {
		return -this.aByteArray101[this.anInt9901++] & 0xFF;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method8398(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.indexOf(0);
		if (local8 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local8 + " - cannot pjstr");
		}
		this.anInt9901 += Static101.method1663(arg0.length(), this.anInt9901, this.aByteArray101, arg0);
		this.aByteArray101[this.anInt9901++] = 0;
	}

	@OriginalMember(owner = "client!gga", name = "x", descriptor = "(I)I")
	public final int method8399() {
		@Pc(16) byte local16 = this.aByteArray101[this.anInt9901++];
		@Pc(23) int local23 = 0;
		while (local16 < 0) {
			local23 = (local23 | local16 & 0x7F) << 7;
			local16 = this.aByteArray101[this.anInt9901++];
		}
		return local16 | local23;
	}

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "(II)V")
	public final void method8400(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method8366(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method8347(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gga", name = "y", descriptor = "(I)I")
	public final int method8402() {
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.method8404();
		while (local19 == 32767) {
			local19 = this.method8404();
			local15 += 32767;
		}
		return local15 + local19;
	}

	@OriginalMember(owner = "client!gga", name = "k", descriptor = "(B)I")
	public final int method8403() {
		this.anInt9901 += 2;
		return (this.aByteArray101[this.anInt9901 - 2] & 0xFF) + ((this.aByteArray101[this.anInt9901 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!gga", name = "z", descriptor = "(I)I")
	public final int method8404() {
		@Pc(16) int local16 = this.aByteArray101[this.anInt9901] & 0xFF;
		return local16 >= 128 ? this.method8363() - 32768 : this.method8374();
	}

	@OriginalMember(owner = "client!gga", name = "n", descriptor = "(II)V")
	public final void method8405(@OriginalArg(0) int arg0) {
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 >> 8);
		this.aByteArray101[this.anInt9901++] = (byte) (arg0 + 128);
	}
}
